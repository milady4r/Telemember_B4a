package com.it.fome;


import anywheresoftware.b4a.B4AMenuItem;
import android.app.Activity;
import android.os.Bundle;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.B4AActivity;
import anywheresoftware.b4a.ObjectWrapper;
import anywheresoftware.b4a.objects.ActivityWrapper;
import java.lang.reflect.InvocationTargetException;
import anywheresoftware.b4a.B4AUncaughtException;
import anywheresoftware.b4a.debug.*;
import java.lang.ref.WeakReference;

public class ac_tcoin extends androidx.appcompat.app.AppCompatActivity implements B4AActivity{
	public static ac_tcoin mostCurrent;
	static boolean afterFirstLayout;
	static boolean isFirst = true;
    private static boolean processGlobalsRun = false;
	BALayout layout;
	public static BA processBA;
	BA activityBA;
    ActivityWrapper _activity;
    java.util.ArrayList<B4AMenuItem> menuItems;
	public static final boolean fullScreen = false;
	public static final boolean includeTitle = false;
    public static WeakReference<Activity> previousOne;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        mostCurrent = this;
		if (processBA == null) {
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "com.it.fome", "com.it.fome.ac_tcoin");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (ac_tcoin).");
				p.finish();
			}
		}
        processBA.setActivityPaused(true);
        processBA.runHook("oncreate", this, null);
		if (!includeTitle) {
        	this.getWindow().requestFeature(android.view.Window.FEATURE_NO_TITLE);
        }
        if (fullScreen) {
        	getWindow().setFlags(android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN,   
        			android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
		
        processBA.sharedProcessBA.activityBA = null;
		layout = new BALayout(this);
		setContentView(layout);
		afterFirstLayout = false;
        WaitForLayout wl = new WaitForLayout();
        if (anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.startFromActivity(this, processBA, wl, false))
		    BA.handler.postDelayed(wl, 5);

	}
	static class WaitForLayout implements Runnable {
		public void run() {
			if (afterFirstLayout)
				return;
			if (mostCurrent == null)
				return;
            
			if (mostCurrent.layout.getWidth() == 0) {
				BA.handler.postDelayed(this, 5);
				return;
			}
			mostCurrent.layout.getLayoutParams().height = mostCurrent.layout.getHeight();
			mostCurrent.layout.getLayoutParams().width = mostCurrent.layout.getWidth();
			afterFirstLayout = true;
			mostCurrent.afterFirstLayout();
		}
	}
	private void afterFirstLayout() {
        if (this != mostCurrent)
			return;
		activityBA = new BA(this, layout, processBA, "com.it.fome", "com.it.fome.ac_tcoin");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "com.it.fome.ac_tcoin", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (ac_tcoin) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (ac_tcoin) Resume **");
        processBA.raiseEvent(null, "activity_resume");
        if (android.os.Build.VERSION.SDK_INT >= 11) {
			try {
				android.app.Activity.class.getMethod("invalidateOptionsMenu").invoke(this,(Object[]) null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	public void addMenuItem(B4AMenuItem item) {
		if (menuItems == null)
			menuItems = new java.util.ArrayList<B4AMenuItem>();
		menuItems.add(item);
	}
	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		super.onCreateOptionsMenu(menu);
        try {
            if (processBA.subExists("activity_actionbarhomeclick")) {
                Class.forName("android.app.ActionBar").getMethod("setHomeButtonEnabled", boolean.class).invoke(
                    getClass().getMethod("getActionBar").invoke(this), true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (processBA.runHook("oncreateoptionsmenu", this, new Object[] {menu}))
            return true;
		if (menuItems == null)
			return false;
		for (B4AMenuItem bmi : menuItems) {
			android.view.MenuItem mi = menu.add(bmi.title);
			if (bmi.drawable != null)
				mi.setIcon(bmi.drawable);
            if (android.os.Build.VERSION.SDK_INT >= 11) {
				try {
                    if (bmi.addToBar) {
				        android.view.MenuItem.class.getMethod("setShowAsAction", int.class).invoke(mi, 1);
                    }
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			mi.setOnMenuItemClickListener(new B4AMenuItemsClickListener(bmi.eventName.toLowerCase(BA.cul)));
		}
        
		return true;
	}   
 @Override
 public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if (item.getItemId() == 16908332) {
        processBA.raiseEvent(null, "activity_actionbarhomeclick");
        return true;
    }
    else
        return super.onOptionsItemSelected(item); 
}
@Override
 public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    super.onPrepareOptionsMenu(menu);
    processBA.runHook("onprepareoptionsmenu", this, new Object[] {menu});
    return true;
    
 }
 protected void onStart() {
    super.onStart();
    processBA.runHook("onstart", this, null);
}
 protected void onStop() {
    super.onStop();
    processBA.runHook("onstop", this, null);
}
    public void onWindowFocusChanged(boolean hasFocus) {
       super.onWindowFocusChanged(hasFocus);
       if (processBA.subExists("activity_windowfocuschanged"))
           processBA.raiseEvent2(null, true, "activity_windowfocuschanged", false, hasFocus);
    }
	private class B4AMenuItemsClickListener implements android.view.MenuItem.OnMenuItemClickListener {
		private final String eventName;
		public B4AMenuItemsClickListener(String eventName) {
			this.eventName = eventName;
		}
		public boolean onMenuItemClick(android.view.MenuItem item) {
			processBA.raiseEventFromUI(item.getTitle(), eventName + "_click");
			return true;
		}
	}
    public static Class<?> getObject() {
		return ac_tcoin.class;
	}
    private Boolean onKeySubExist = null;
    private Boolean onKeyUpSubExist = null;
	@Override
	public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeydown", this, new Object[] {keyCode, event}))
            return true;
		if (onKeySubExist == null)
			onKeySubExist = processBA.subExists("activity_keypress");
		if (onKeySubExist) {
			if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK &&
					android.os.Build.VERSION.SDK_INT >= 18) {
				HandleKeyDelayed hk = new HandleKeyDelayed();
				hk.kc = keyCode;
				BA.handler.post(hk);
				return true;
			}
			else {
				boolean res = new HandleKeyDelayed().runDirectly(keyCode);
				if (res)
					return true;
			}
		}
		return super.onKeyDown(keyCode, event);
	}
	private class HandleKeyDelayed implements Runnable {
		int kc;
		public void run() {
			runDirectly(kc);
		}
		public boolean runDirectly(int keyCode) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keypress", false, keyCode);
			if (res == null || res == true) {
                return true;
            }
            else if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK) {
				finish();
				return true;
			}
            return false;
		}
		
	}
    @Override
	public boolean onKeyUp(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeyup", this, new Object[] {keyCode, event}))
            return true;
		if (onKeyUpSubExist == null)
			onKeyUpSubExist = processBA.subExists("activity_keyup");
		if (onKeyUpSubExist) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keyup", false, keyCode);
			if (res == null || res == true)
				return true;
		}
		return super.onKeyUp(keyCode, event);
	}
	@Override
	public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
		this.setIntent(intent);
        processBA.runHook("onnewintent", this, new Object[] {intent});
	}
    @Override 
	public void onPause() {
		super.onPause();
        if (_activity == null)
            return;
        if (this != mostCurrent)
			return;
		anywheresoftware.b4a.Msgbox.dismiss(true);
        BA.LogInfo("** Activity (ac_tcoin) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        if (mostCurrent != null)
            processBA.raiseEvent2(_activity, true, "activity_pause", false, activityBA.activity.isFinishing());		
        processBA.setActivityPaused(true);
        mostCurrent = null;
        if (!activityBA.activity.isFinishing())
			previousOne = new WeakReference<Activity>(this);
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        processBA.runHook("onpause", this, null);
	}

	@Override
	public void onDestroy() {
        super.onDestroy();
		previousOne = null;
        processBA.runHook("ondestroy", this, null);
	}
    @Override 
	public void onResume() {
		super.onResume();
        mostCurrent = this;
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (activityBA != null) { //will be null during activity create (which waits for AfterLayout).
        	ResumeMessage rm = new ResumeMessage(mostCurrent);
        	BA.handler.post(rm);
        }
        processBA.runHook("onresume", this, null);
	}
    private static class ResumeMessage implements Runnable {
    	private final WeakReference<Activity> activity;
    	public ResumeMessage(Activity activity) {
    		this.activity = new WeakReference<Activity>(activity);
    	}
		public void run() {
            ac_tcoin mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (ac_tcoin) Resume **");
            if (mc != mostCurrent)
                return;
		    processBA.raiseEvent(mc._activity, "activity_resume", (Object[])null);
		}
    }
	@Override
	protected void onActivityResult(int requestCode, int resultCode,
	      android.content.Intent data) {
		processBA.onActivityResult(requestCode, resultCode, data);
        processBA.runHook("onactivityresult", this, new Object[] {requestCode, resultCode});
	}
	private static void initializeGlobals() {
		processBA.raiseEvent2(null, true, "globals", false, (Object[])null);
	}
    public void onRequestPermissionsResult(int requestCode,
        String permissions[], int[] grantResults) {
        for (int i = 0;i < permissions.length;i++) {
            Object[] o = new Object[] {permissions[i], grantResults[i] == 0};
            processBA.raiseEventFromDifferentThread(null,null, 0, "activity_permissionresult", true, o);
        }
            
    }



public static void initializeProcessGlobals() {
             try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
}
public anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.sql.SQL _sql1 = null;
public static anywheresoftware.b4a.sql.SQL.CursorWrapper _cursor1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _meno = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnl_coins = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_icon = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_nums = null;
public com.flycoroundview.mc7.MC7RoundView _roundview = null;
public wir.hitex.recycler.Hitex_LayoutView _lv = null;
public com.hitex_glide.Hitex_Glide _glide = null;
public static String _username_t = "";
public static String _userid_t = "";
public com.it.fome.mi_meno _mimeno = null;
public b4a.example.dateutils _dateutils = null;
public com.it.fome.main _main = null;
public com.it.fome.ac_telelogin _ac_telelogin = null;
public com.it.fome.ac_shop _ac_shop = null;
public com.it.fome.ac_tansfer _ac_tansfer = null;
public com.it.fome.firebasemessaging _firebasemessaging = null;
public com.it.fome.ac_tselect _ac_tselect = null;
public com.it.fome.ac_lchats _ac_lchats = null;
public com.it.fome.ac_tfreecoin _ac_tfreecoin = null;
public com.it.fome.ac_hsef _ac_hsef = null;
public com.it.fome.ac_tsearch _ac_tsearch = null;
public com.it.fome.ac_home _ac_home = null;
public com.it.fome.act_chat _act_chat = null;
public com.it.fome.starter _starter = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="ac_tcoin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
int _i = 0;
anywheresoftware.b4a.objects.drawable.GradientDrawable _gradient1 = null;
int[] _clrs = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _bkcolor = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _bkcolor_st = null;
anywheresoftware.b4a.objects.PanelWrapper _pnlb1 = null;
RDebugUtils.currentLine=17367040;
 //BA.debugLineNum = 17367040;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=17367046;
 //BA.debugLineNum = 17367046;BA.debugLine="If File.Exists(File.DirInternal,\"instadb.db\")=Fal";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"instadb.db")==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=17367047;
 //BA.debugLineNum = 17367047;BA.debugLine="File.Copy(File.DirAssets,\"instadb.db\",File.DirIn";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"instadb.db",anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"instadb.db");
 };
RDebugUtils.currentLine=17367049;
 //BA.debugLineNum = 17367049;BA.debugLine="If sql1.IsInitialized=False Then";
if (_sql1.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=17367050;
 //BA.debugLineNum = 17367050;BA.debugLine="sql1.Initialize(File.DirInternal,\"instadb.db\",Fa";
_sql1.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"instadb.db",anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=17367055;
 //BA.debugLineNum = 17367055;BA.debugLine="cursor1 = sql1.ExecQuery(\"SELECT * FROM tbl_tele";
_cursor1.setObject((android.database.Cursor)(_sql1.ExecQuery("SELECT * FROM tbl_tele WHERE soich='1'")));
RDebugUtils.currentLine=17367056;
 //BA.debugLineNum = 17367056;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=17367057;
 //BA.debugLineNum = 17367057;BA.debugLine="For i=0 To cursor1.RowCount-1";
{
final int step9 = 1;
final int limit9 = (int) (_cursor1.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
RDebugUtils.currentLine=17367058;
 //BA.debugLineNum = 17367058;BA.debugLine="cursor1.Position=i";
_cursor1.setPosition(_i);
RDebugUtils.currentLine=17367059;
 //BA.debugLineNum = 17367059;BA.debugLine="userid_t=cursor1.GetString(\"userid\")";
mostCurrent._userid_t = _cursor1.GetString("userid");
RDebugUtils.currentLine=17367060;
 //BA.debugLineNum = 17367060;BA.debugLine="username_t=cursor1.GetString(\"username\")";
mostCurrent._username_t = _cursor1.GetString("username");
 }
};
RDebugUtils.currentLine=17367062;
 //BA.debugLineNum = 17367062;BA.debugLine="cursor1.Close";
_cursor1.Close();
RDebugUtils.currentLine=17367065;
 //BA.debugLineNum = 17367065;BA.debugLine="Dim Gradient1 As GradientDrawable";
_gradient1 = new anywheresoftware.b4a.objects.drawable.GradientDrawable();
RDebugUtils.currentLine=17367066;
 //BA.debugLineNum = 17367066;BA.debugLine="Dim Clrs(5) As Int";
_clrs = new int[(int) (5)];
;
RDebugUtils.currentLine=17367067;
 //BA.debugLineNum = 17367067;BA.debugLine="Clrs(0) = 0xFFe8eaf6";
_clrs[(int) (0)] = (int) (0xffe8eaf6);
RDebugUtils.currentLine=17367068;
 //BA.debugLineNum = 17367068;BA.debugLine="Clrs(1) = 0xFFe8eaf6";
_clrs[(int) (1)] = (int) (0xffe8eaf6);
RDebugUtils.currentLine=17367069;
 //BA.debugLineNum = 17367069;BA.debugLine="Clrs(2) = 0xFFe8eaf6";
_clrs[(int) (2)] = (int) (0xffe8eaf6);
RDebugUtils.currentLine=17367070;
 //BA.debugLineNum = 17367070;BA.debugLine="Clrs(3) = 0xFF283593";
_clrs[(int) (3)] = (int) (0xff283593);
RDebugUtils.currentLine=17367071;
 //BA.debugLineNum = 17367071;BA.debugLine="Clrs(4) = 0xFF283593";
_clrs[(int) (4)] = (int) (0xff283593);
RDebugUtils.currentLine=17367073;
 //BA.debugLineNum = 17367073;BA.debugLine="Gradient1.Initialize(\"TOP_BOTTOM\", Clrs)";
_gradient1.Initialize(BA.getEnumFromString(android.graphics.drawable.GradientDrawable.Orientation.class,"TOP_BOTTOM"),_clrs);
RDebugUtils.currentLine=17367074;
 //BA.debugLineNum = 17367074;BA.debugLine="Activity.Background=Gradient1";
mostCurrent._activity.setBackground((android.graphics.drawable.Drawable)(_gradient1.getObject()));
RDebugUtils.currentLine=17367076;
 //BA.debugLineNum = 17367076;BA.debugLine="Dim bkcolor As ColorDrawable";
_bkcolor = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=17367077;
 //BA.debugLineNum = 17367077;BA.debugLine="bkcolor.Initialize2(Colors.White,15,2dip,Colors.L";
_bkcolor.Initialize2(anywheresoftware.b4a.keywords.Common.Colors.White,(int) (15),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (2)),anywheresoftware.b4a.keywords.Common.Colors.LightGray);
RDebugUtils.currentLine=17367078;
 //BA.debugLineNum = 17367078;BA.debugLine="meno.Initialize(\"meno\")";
mostCurrent._meno.Initialize(mostCurrent.activityBA,"meno");
RDebugUtils.currentLine=17367079;
 //BA.debugLineNum = 17367079;BA.debugLine="meno.TextColor=Colors.DarkGray";
mostCurrent._meno.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.DarkGray);
RDebugUtils.currentLine=17367080;
 //BA.debugLineNum = 17367080;BA.debugLine="meno.TextSize=37";
mostCurrent._meno.setTextSize((float) (37));
RDebugUtils.currentLine=17367081;
 //BA.debugLineNum = 17367081;BA.debugLine="meno.Background=bkcolor";
mostCurrent._meno.setBackground((android.graphics.drawable.Drawable)(_bkcolor.getObject()));
RDebugUtils.currentLine=17367082;
 //BA.debugLineNum = 17367082;BA.debugLine="meno.Typeface=Typeface.MATERIALICONS";
mostCurrent._meno.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.getMATERIALICONS());
RDebugUtils.currentLine=17367083;
 //BA.debugLineNum = 17367083;BA.debugLine="meno.Text=Chr(0xE3C7)";
mostCurrent._meno.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr((int) (0xe3c7))));
RDebugUtils.currentLine=17367084;
 //BA.debugLineNum = 17367084;BA.debugLine="meno.Gravity=Gravity.CENTER_HORIZONTAL+Gravity.CE";
mostCurrent._meno.setGravity((int) (anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL+anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=17367085;
 //BA.debugLineNum = 17367085;BA.debugLine="Activity.AddView(meno,3%x,3%x,12%x,12%x)";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._meno.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (3),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (3),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (12),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (12),mostCurrent.activityBA));
RDebugUtils.currentLine=17367087;
 //BA.debugLineNum = 17367087;BA.debugLine="pnl_coins.Initialize(\"pnl_coins\")";
mostCurrent._pnl_coins.Initialize(mostCurrent.activityBA,"pnl_coins");
RDebugUtils.currentLine=17367088;
 //BA.debugLineNum = 17367088;BA.debugLine="Activity.AddView(pnl_coins,50%x,3%x,50%x,12%x)";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._pnl_coins.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (50),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (3),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (50),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (12),mostCurrent.activityBA));
RDebugUtils.currentLine=17367089;
 //BA.debugLineNum = 17367089;BA.debugLine="roundview.Initialize(pnl_coins)";
mostCurrent._roundview.Initialize(processBA,(android.view.View)(mostCurrent._pnl_coins.getObject()));
RDebugUtils.currentLine=17367090;
 //BA.debugLineNum = 17367090;BA.debugLine="roundview.CornerRadius_BL=10%x";
mostCurrent._roundview.setCornerRadius_BL(anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA));
RDebugUtils.currentLine=17367091;
 //BA.debugLineNum = 17367091;BA.debugLine="roundview.CornerRadius_TL=10%x";
mostCurrent._roundview.setCornerRadius_TL(anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA));
RDebugUtils.currentLine=17367092;
 //BA.debugLineNum = 17367092;BA.debugLine="roundview.BackgroundColor=Colors.White";
mostCurrent._roundview.setBackgroundColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=17367094;
 //BA.debugLineNum = 17367094;BA.debugLine="Dim bkcolor_st As ColorDrawable";
_bkcolor_st = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=17367095;
 //BA.debugLineNum = 17367095;BA.debugLine="bkcolor_st.Initialize2(0xFFC67D00,50,4dip,0x82FFE";
_bkcolor_st.Initialize2((int) (0xffc67d00),(int) (50),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (4)),(int) (0x82ffe300));
RDebugUtils.currentLine=17367097;
 //BA.debugLineNum = 17367097;BA.debugLine="Dim pnlb1 As Panel";
_pnlb1 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=17367098;
 //BA.debugLineNum = 17367098;BA.debugLine="pnlb1.Initialize(\"\")";
_pnlb1.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=17367099;
 //BA.debugLineNum = 17367099;BA.debugLine="pnlb1.Color=0xFFFFC300";
_pnlb1.setColor((int) (0xffffc300));
RDebugUtils.currentLine=17367100;
 //BA.debugLineNum = 17367100;BA.debugLine="pnlb1.Background=bkcolor_st";
_pnlb1.setBackground((android.graphics.drawable.Drawable)(_bkcolor_st.getObject()));
RDebugUtils.currentLine=17367101;
 //BA.debugLineNum = 17367101;BA.debugLine="pnl_coins.AddView(pnlb1,pnl_coins.Width-11%x,1%x,";
mostCurrent._pnl_coins.AddView((android.view.View)(_pnlb1.getObject()),(int) (mostCurrent._pnl_coins.getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (11),mostCurrent.activityBA)),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (1),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA),(int) (mostCurrent._pnl_coins.getHeight()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (2),mostCurrent.activityBA)));
RDebugUtils.currentLine=17367103;
 //BA.debugLineNum = 17367103;BA.debugLine="lbl_icon.Initialize(\"lbl_icon\")";
mostCurrent._lbl_icon.Initialize(mostCurrent.activityBA,"lbl_icon");
RDebugUtils.currentLine=17367104;
 //BA.debugLineNum = 17367104;BA.debugLine="lbl_icon.SetBackgroundImage(LoadBitmap(File.DirAs";
mostCurrent._lbl_icon.SetBackgroundImageNew((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"coins.png").getObject()));
RDebugUtils.currentLine=17367105;
 //BA.debugLineNum = 17367105;BA.debugLine="pnl_coins.AddView(lbl_icon,pnl_coins.Width-9%x,pn";
mostCurrent._pnl_coins.AddView((android.view.View)(mostCurrent._lbl_icon.getObject()),(int) (mostCurrent._pnl_coins.getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (9),mostCurrent.activityBA)),(int) (mostCurrent._pnl_coins.getHeight()/(double)2/(double)2),(int) (mostCurrent._pnl_coins.getHeight()/(double)2),(int) (mostCurrent._pnl_coins.getHeight()/(double)2));
RDebugUtils.currentLine=17367107;
 //BA.debugLineNum = 17367107;BA.debugLine="lbl_nums.Initialize(\"lbl_nums\")";
mostCurrent._lbl_nums.Initialize(mostCurrent.activityBA,"lbl_nums");
RDebugUtils.currentLine=17367108;
 //BA.debugLineNum = 17367108;BA.debugLine="lbl_nums.TextColor=Colors.DarkGray";
mostCurrent._lbl_nums.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.DarkGray);
RDebugUtils.currentLine=17367109;
 //BA.debugLineNum = 17367109;BA.debugLine="lbl_nums.TextSize=20";
mostCurrent._lbl_nums.setTextSize((float) (20));
RDebugUtils.currentLine=17367110;
 //BA.debugLineNum = 17367110;BA.debugLine="lbl_nums.Typeface=Typeface.LoadFromAssets(\"iran_s";
mostCurrent._lbl_nums.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("iran_sans.ttf"));
RDebugUtils.currentLine=17367111;
 //BA.debugLineNum = 17367111;BA.debugLine="lbl_nums.Text=0&\" سکه\"";
mostCurrent._lbl_nums.setText(BA.ObjectToCharSequence(BA.NumberToString(0)+" سکه"));
RDebugUtils.currentLine=17367112;
 //BA.debugLineNum = 17367112;BA.debugLine="lbl_nums.Gravity=Gravity.CENTER_VERTICAL+Gravity.";
mostCurrent._lbl_nums.setGravity((int) (anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL+anywheresoftware.b4a.keywords.Common.Gravity.RIGHT));
RDebugUtils.currentLine=17367113;
 //BA.debugLineNum = 17367113;BA.debugLine="pnl_coins.AddView(lbl_nums,2%x,0,pnl_coins.Width-";
mostCurrent._pnl_coins.AddView((android.view.View)(mostCurrent._lbl_nums.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (2),mostCurrent.activityBA),(int) (0),(int) (mostCurrent._pnl_coins.getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (15),mostCurrent.activityBA)),mostCurrent._pnl_coins.getHeight());
RDebugUtils.currentLine=17367115;
 //BA.debugLineNum = 17367115;BA.debugLine="LV.Initializer(\"LV\").ListView.Build";
mostCurrent._lv.Initializer(mostCurrent.activityBA,"LV").ListView().Build();
RDebugUtils.currentLine=17367116;
 //BA.debugLineNum = 17367116;BA.debugLine="Activity.AddView(LV,0,10%y,100%x,90%y)";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._lv.getObject()),(int) (0),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (10),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (90),mostCurrent.activityBA));
RDebugUtils.currentLine=17367117;
 //BA.debugLineNum = 17367117;BA.debugLine="LV.Ripple.Color(0xFF5E23DE).Alpha(0.2f).Duration(";
mostCurrent._lv.Ripple().Color((int) (0xff5e23de)).Alpha((float) (0.2f)).Duration((int) (350));
RDebugUtils.currentLine=17367118;
 //BA.debugLineNum = 17367118;BA.debugLine="LV.Show";
mostCurrent._lv.Show();
RDebugUtils.currentLine=17367120;
 //BA.debugLineNum = 17367120;BA.debugLine="req_getme(\"\")";
_req_getme("");
RDebugUtils.currentLine=17367122;
 //BA.debugLineNum = 17367122;BA.debugLine="End Sub";
return "";
}
public static String  _req_getme(String _userid) throws Exception{
RDebugUtils.currentModule="ac_tcoin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "req_getme", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "req_getme", new Object[] {_userid}));}
com.reza.sh.fastnet.Fastnet _prfn = null;
com.reza.sh.fastnet.PostRequestRaper _post = null;
RDebugUtils.currentLine=17891328;
 //BA.debugLineNum = 17891328;BA.debugLine="Sub req_getme(userid As String)";
RDebugUtils.currentLine=17891329;
 //BA.debugLineNum = 17891329;BA.debugLine="Dim prfn As PersianFastNetwork";
_prfn = new com.reza.sh.fastnet.Fastnet();
RDebugUtils.currentLine=17891330;
 //BA.debugLineNum = 17891330;BA.debugLine="prfn.initialize(\"prfn\")";
_prfn.initialize(processBA,"prfn");
RDebugUtils.currentLine=17891332;
 //BA.debugLineNum = 17891332;BA.debugLine="Dim post As PostRequest";
_post = new com.reza.sh.fastnet.PostRequestRaper();
RDebugUtils.currentLine=17891333;
 //BA.debugLineNum = 17891333;BA.debugLine="post=prfn.BuildPostQuery(\"http://filework.ir/INST";
_post = _prfn.BuildPostQuery("http://filework.ir/INSTAFOLLOW/api/req.php","getinsta");
RDebugUtils.currentLine=17891335;
 //BA.debugLineNum = 17891335;BA.debugLine="post.addHeder(\"User-Agent\",\"Dalvik/1.6.0 (Linux;";
_post.addHeder("User-Agent","Dalvik/1.6.0 (Linux; U; Android 4.4.4; SM-A700FD Build/KTU84P)");
RDebugUtils.currentLine=17891337;
 //BA.debugLineNum = 17891337;BA.debugLine="post.addParametrs(\"ui\",\"1\")";
_post.addParametrs("ui","1");
RDebugUtils.currentLine=17891338;
 //BA.debugLineNum = 17891338;BA.debugLine="post.addParametrs(\"userid\",userid_t)";
_post.addParametrs("userid",mostCurrent._userid_t);
RDebugUtils.currentLine=17891340;
 //BA.debugLineNum = 17891340;BA.debugLine="post.addParametrs(\"req\",\"get_acct\")";
_post.addParametrs("req","get_acct");
RDebugUtils.currentLine=17891343;
 //BA.debugLineNum = 17891343;BA.debugLine="post.executRequestAsString";
_post.executRequestAsString();
RDebugUtils.currentLine=17891344;
 //BA.debugLineNum = 17891344;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="ac_tcoin";
RDebugUtils.currentLine=17498112;
 //BA.debugLineNum = 17498112;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=17498114;
 //BA.debugLineNum = 17498114;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="ac_tcoin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=17432576;
 //BA.debugLineNum = 17432576;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=17432577;
 //BA.debugLineNum = 17432577;BA.debugLine="req_getme(\"\")";
_req_getme("");
RDebugUtils.currentLine=17432578;
 //BA.debugLineNum = 17432578;BA.debugLine="End Sub";
return "";
}
public static int  _lv_getitemcount() throws Exception{
RDebugUtils.currentModule="ac_tcoin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lv_getitemcount", false))
	 {return ((Integer) Debug.delegate(mostCurrent.activityBA, "lv_getitemcount", null));}
RDebugUtils.currentLine=17694720;
 //BA.debugLineNum = 17694720;BA.debugLine="Sub LV_GetItemCount As Int 								        '$ Item";
RDebugUtils.currentLine=17694721;
 //BA.debugLineNum = 17694721;BA.debugLine="Return 2 'ItemList.Size";
if (true) return (int) (2);
RDebugUtils.currentLine=17694722;
 //BA.debugLineNum = 17694722;BA.debugLine="End Sub";
return 0;
}
public static void  _lv_itemclick(anywheresoftware.b4a.objects.PanelWrapper _clickeditem,int _position) throws Exception{
RDebugUtils.currentModule="ac_tcoin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lv_itemclick", false))
	 {Debug.delegate(mostCurrent.activityBA, "lv_itemclick", new Object[] {_clickeditem,_position}); return;}
ResumableSub_LV_ItemClick rsub = new ResumableSub_LV_ItemClick(null,_clickeditem,_position);
rsub.resume(processBA, null);
}
public static class ResumableSub_LV_ItemClick extends BA.ResumableSub {
public ResumableSub_LV_ItemClick(com.it.fome.ac_tcoin parent,anywheresoftware.b4a.objects.PanelWrapper _clickeditem,int _position) {
this.parent = parent;
this._clickeditem = _clickeditem;
this._position = _position;
}
com.it.fome.ac_tcoin parent;
anywheresoftware.b4a.objects.PanelWrapper _clickeditem;
int _position;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ac_tcoin";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=17760257;
 //BA.debugLineNum = 17760257;BA.debugLine="Sleep(0)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ac_tcoin", "lv_itemclick"),(int) (0));
this.state = 11;
return;
case 11:
//C
this.state = 1;
;
RDebugUtils.currentLine=17760258;
 //BA.debugLineNum = 17760258;BA.debugLine="Select Position";
if (true) break;

case 1:
//select
this.state = 10;
switch (_position) {
case 0: {
this.state = 3;
if (true) break;
}
case 1: {
this.state = 5;
if (true) break;
}
case 2: {
this.state = 7;
if (true) break;
}
case 3: {
this.state = 9;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 10;
RDebugUtils.currentLine=17760262;
 //BA.debugLineNum = 17760262;BA.debugLine="ac_tfreecoin.type_done=Position";
parent.mostCurrent._ac_tfreecoin._type_done /*int*/  = _position;
RDebugUtils.currentLine=17760263;
 //BA.debugLineNum = 17760263;BA.debugLine="StartActivity(ac_tfreecoin)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._ac_tfreecoin.getObject()));
RDebugUtils.currentLine=17760266;
 //BA.debugLineNum = 17760266;BA.debugLine="SetAnimation(\"anim3\", \"anim4\")";
_setanimation("anim3","anim4");
 if (true) break;

case 5:
//C
this.state = 10;
RDebugUtils.currentLine=17760268;
 //BA.debugLineNum = 17760268;BA.debugLine="ac_tfreecoin.type_done=Position";
parent.mostCurrent._ac_tfreecoin._type_done /*int*/  = _position;
RDebugUtils.currentLine=17760269;
 //BA.debugLineNum = 17760269;BA.debugLine="StartActivity(ac_tfreecoin)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._ac_tfreecoin.getObject()));
RDebugUtils.currentLine=17760272;
 //BA.debugLineNum = 17760272;BA.debugLine="SetAnimation(\"anim2\", \"anim1\")";
_setanimation("anim2","anim1");
 if (true) break;

case 7:
//C
this.state = 10;
RDebugUtils.currentLine=17760279;
 //BA.debugLineNum = 17760279;BA.debugLine="SetAnimation(\"anim2\", \"anim1\")";
_setanimation("anim2","anim1");
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=17760286;
 //BA.debugLineNum = 17760286;BA.debugLine="SetAnimation(\"anim2\", \"anim1\")";
_setanimation("anim2","anim1");
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=17760290;
 //BA.debugLineNum = 17760290;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _setanimation(String _inanimation,String _outanimation) throws Exception{
RDebugUtils.currentModule="ac_tcoin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "setanimation", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "setanimation", new Object[] {_inanimation,_outanimation}));}
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
String _package = "";
int _in = 0;
int _out = 0;
RDebugUtils.currentLine=17825792;
 //BA.debugLineNum = 17825792;BA.debugLine="Sub SetAnimation(InAnimation As String, OutAnimati";
RDebugUtils.currentLine=17825793;
 //BA.debugLineNum = 17825793;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=17825794;
 //BA.debugLineNum = 17825794;BA.debugLine="Dim package As String";
_package = "";
RDebugUtils.currentLine=17825795;
 //BA.debugLineNum = 17825795;BA.debugLine="Dim In, out As Int";
_in = 0;
_out = 0;
RDebugUtils.currentLine=17825796;
 //BA.debugLineNum = 17825796;BA.debugLine="package = r.GetStaticField(\"anywheresoftware.b4a.";
_package = BA.ObjectToString(_r.GetStaticField("anywheresoftware.b4a.BA","packageName"));
RDebugUtils.currentLine=17825797;
 //BA.debugLineNum = 17825797;BA.debugLine="In = r.GetStaticField(package & \".R$anim\", InAnim";
_in = (int)(BA.ObjectToNumber(_r.GetStaticField(_package+".R$anim",_inanimation)));
RDebugUtils.currentLine=17825798;
 //BA.debugLineNum = 17825798;BA.debugLine="out = r.GetStaticField(package & \".R$anim\", OutAn";
_out = (int)(BA.ObjectToNumber(_r.GetStaticField(_package+".R$anim",_outanimation)));
RDebugUtils.currentLine=17825799;
 //BA.debugLineNum = 17825799;BA.debugLine="r.Target = r.GetActivity";
_r.Target = (Object)(_r.GetActivity(processBA));
RDebugUtils.currentLine=17825800;
 //BA.debugLineNum = 17825800;BA.debugLine="r.RunMethod4(\"overridePendingTransition\", Array A";
_r.RunMethod4("overridePendingTransition",new Object[]{(Object)(_in),(Object)(_out)},new String[]{"java.lang.int","java.lang.int"});
RDebugUtils.currentLine=17825801;
 //BA.debugLineNum = 17825801;BA.debugLine="End Sub";
return "";
}
public static String  _lv_onbindviewholder(anywheresoftware.b4a.objects.PanelWrapper _parent,int _position) throws Exception{
RDebugUtils.currentModule="ac_tcoin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lv_onbindviewholder", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "lv_onbindviewholder", new Object[] {_parent,_position}));}
anywheresoftware.b4a.objects.PanelWrapper _pnl_main = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl_itemicon = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl_name = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl_notis = null;
RDebugUtils.currentLine=17629184;
 //BA.debugLineNum = 17629184;BA.debugLine="Sub LV_onBindViewHolder (Parent As Panel, Position";
RDebugUtils.currentLine=17629185;
 //BA.debugLineNum = 17629185;BA.debugLine="Dim pnl_main = Parent.GetView(0) As Panel";
_pnl_main = new anywheresoftware.b4a.objects.PanelWrapper();
_pnl_main.setObject((android.view.ViewGroup)(_parent.GetView((int) (0)).getObject()));
RDebugUtils.currentLine=17629186;
 //BA.debugLineNum = 17629186;BA.debugLine="Dim lbl_itemicon = pnl_main.GetView(0) As Label";
_lbl_itemicon = new anywheresoftware.b4a.objects.LabelWrapper();
_lbl_itemicon.setObject((android.widget.TextView)(_pnl_main.GetView((int) (0)).getObject()));
RDebugUtils.currentLine=17629187;
 //BA.debugLineNum = 17629187;BA.debugLine="Dim lbl_name = pnl_main.GetView(1) As Label";
_lbl_name = new anywheresoftware.b4a.objects.LabelWrapper();
_lbl_name.setObject((android.widget.TextView)(_pnl_main.GetView((int) (1)).getObject()));
RDebugUtils.currentLine=17629189;
 //BA.debugLineNum = 17629189;BA.debugLine="Dim lbl_notis = pnl_main.GetView(2) As Label";
_lbl_notis = new anywheresoftware.b4a.objects.LabelWrapper();
_lbl_notis.setObject((android.widget.TextView)(_pnl_main.GetView((int) (2)).getObject()));
RDebugUtils.currentLine=17629191;
 //BA.debugLineNum = 17629191;BA.debugLine="Select Position";
switch (_position) {
case 0: {
RDebugUtils.currentLine=17629193;
 //BA.debugLineNum = 17629193;BA.debugLine="lbl_name.Text=\"ملحق شو سکه بگیر\"";
_lbl_name.setText(BA.ObjectToCharSequence("ملحق شو سکه بگیر"));
RDebugUtils.currentLine=17629194;
 //BA.debugLineNum = 17629194;BA.debugLine="lbl_itemicon.Text=Chr(0xE7FE)";
_lbl_itemicon.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr((int) (0xe7fe))));
 break; }
case 1: {
RDebugUtils.currentLine=17629197;
 //BA.debugLineNum = 17629197;BA.debugLine="lbl_name.Text=\"بازدید بزن سکه بگیر\"";
_lbl_name.setText(BA.ObjectToCharSequence("بازدید بزن سکه بگیر"));
RDebugUtils.currentLine=17629198;
 //BA.debugLineNum = 17629198;BA.debugLine="lbl_itemicon.Text=Chr(0xE417)";
_lbl_itemicon.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr((int) (0xe417))));
 break; }
case 2: {
RDebugUtils.currentLine=17629200;
 //BA.debugLineNum = 17629200;BA.debugLine="lbl_name.Text=\"کامنت بزار سکه بگیر\"";
_lbl_name.setText(BA.ObjectToCharSequence("کامنت بزار سکه بگیر"));
RDebugUtils.currentLine=17629201;
 //BA.debugLineNum = 17629201;BA.debugLine="lbl_itemicon.Text=Chr(0xE0B9)";
_lbl_itemicon.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr((int) (0xe0b9))));
 break; }
case 3: {
RDebugUtils.currentLine=17629203;
 //BA.debugLineNum = 17629203;BA.debugLine="lbl_name.Text=\"ویو کن سکه بگیر\"";
_lbl_name.setText(BA.ObjectToCharSequence("ویو کن سکه بگیر"));
RDebugUtils.currentLine=17629204;
 //BA.debugLineNum = 17629204;BA.debugLine="lbl_itemicon.Text=Chr(0xE8F4)";
_lbl_itemicon.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr((int) (0xe8f4))));
 break; }
}
;
RDebugUtils.currentLine=17629206;
 //BA.debugLineNum = 17629206;BA.debugLine="lbl_notis.Top=pnl_main.Height-10%x";
_lbl_notis.setTop((int) (_pnl_main.getHeight()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA)));
RDebugUtils.currentLine=17629207;
 //BA.debugLineNum = 17629207;BA.debugLine="Parent.Height=pnl_main.Height+5%x";
_parent.setHeight((int) (_pnl_main.getHeight()+anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA)));
RDebugUtils.currentLine=17629208;
 //BA.debugLineNum = 17629208;BA.debugLine="End Sub";
return "";
}
public static String  _lv_oncreateviewholder(anywheresoftware.b4a.objects.PanelWrapper _parent,int _viewtype) throws Exception{
RDebugUtils.currentModule="ac_tcoin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lv_oncreateviewholder", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "lv_oncreateviewholder", new Object[] {_parent,_viewtype}));}
anywheresoftware.b4a.objects.drawable.ColorDrawable _bkcolors = null;
anywheresoftware.b4a.objects.PanelWrapper _pnl_main = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl_itemicon = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl_name = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _bkcolor = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl_notis = null;
RDebugUtils.currentLine=17563648;
 //BA.debugLineNum = 17563648;BA.debugLine="Sub LV_onCreateViewHolder (Parent As Panel, ViewTy";
RDebugUtils.currentLine=17563649;
 //BA.debugLineNum = 17563649;BA.debugLine="Parent.Color=Colors.Transparent";
_parent.setColor(anywheresoftware.b4a.keywords.Common.Colors.Transparent);
RDebugUtils.currentLine=17563651;
 //BA.debugLineNum = 17563651;BA.debugLine="Dim bkcolors As ColorDrawable";
_bkcolors = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=17563652;
 //BA.debugLineNum = 17563652;BA.debugLine="bkcolors.Initialize(Colors.White,3%x)";
_bkcolors.Initialize(anywheresoftware.b4a.keywords.Common.Colors.White,anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (3),mostCurrent.activityBA));
RDebugUtils.currentLine=17563654;
 //BA.debugLineNum = 17563654;BA.debugLine="Dim pnl_main As Panel : pnl_main.Initialize(\"pnl_";
_pnl_main = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=17563654;
 //BA.debugLineNum = 17563654;BA.debugLine="Dim pnl_main As Panel : pnl_main.Initialize(\"pnl_";
_pnl_main.Initialize(mostCurrent.activityBA,"pnl_main");
RDebugUtils.currentLine=17563655;
 //BA.debugLineNum = 17563655;BA.debugLine="pnl_main.Color=Colors.White";
_pnl_main.setColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=17563656;
 //BA.debugLineNum = 17563656;BA.debugLine="pnl_main.Background=bkcolors";
_pnl_main.setBackground((android.graphics.drawable.Drawable)(_bkcolors.getObject()));
RDebugUtils.currentLine=17563657;
 //BA.debugLineNum = 17563657;BA.debugLine="Parent.AddView(pnl_main,5%x,2%x,90%x,25%x)";
_parent.AddView((android.view.View)(_pnl_main.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (2),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (90),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (25),mostCurrent.activityBA));
RDebugUtils.currentLine=17563659;
 //BA.debugLineNum = 17563659;BA.debugLine="Dim lbl_itemicon As Label";
_lbl_itemicon = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=17563660;
 //BA.debugLineNum = 17563660;BA.debugLine="lbl_itemicon.Initialize(\"lbl_itemicon\")";
_lbl_itemicon.Initialize(mostCurrent.activityBA,"lbl_itemicon");
RDebugUtils.currentLine=17563661;
 //BA.debugLineNum = 17563661;BA.debugLine="lbl_itemicon.TextColor=0xFFD305BA";
_lbl_itemicon.setTextColor((int) (0xffd305ba));
RDebugUtils.currentLine=17563662;
 //BA.debugLineNum = 17563662;BA.debugLine="lbl_itemicon.TextSize=40";
_lbl_itemicon.setTextSize((float) (40));
RDebugUtils.currentLine=17563663;
 //BA.debugLineNum = 17563663;BA.debugLine="lbl_itemicon.Typeface=Typeface.MATERIALICONS";
_lbl_itemicon.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.getMATERIALICONS());
RDebugUtils.currentLine=17563664;
 //BA.debugLineNum = 17563664;BA.debugLine="lbl_itemicon.Gravity=Gravity.CENTER_VERTICAL+Grav";
_lbl_itemicon.setGravity((int) (anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL+anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL));
RDebugUtils.currentLine=17563665;
 //BA.debugLineNum = 17563665;BA.debugLine="pnl_main.AddView(lbl_itemicon,0,3%x,pnl_main.Widt";
_pnl_main.AddView((android.view.View)(_lbl_itemicon.getObject()),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (3),mostCurrent.activityBA),_pnl_main.getWidth(),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA));
RDebugUtils.currentLine=17563667;
 //BA.debugLineNum = 17563667;BA.debugLine="Dim lbl_name As Label";
_lbl_name = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=17563668;
 //BA.debugLineNum = 17563668;BA.debugLine="lbl_name.Initialize(\"lbl_name\")";
_lbl_name.Initialize(mostCurrent.activityBA,"lbl_name");
RDebugUtils.currentLine=17563669;
 //BA.debugLineNum = 17563669;BA.debugLine="lbl_name.TextColor=Colors.DarkGray";
_lbl_name.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.DarkGray);
RDebugUtils.currentLine=17563670;
 //BA.debugLineNum = 17563670;BA.debugLine="lbl_name.TextSize=17";
_lbl_name.setTextSize((float) (17));
RDebugUtils.currentLine=17563671;
 //BA.debugLineNum = 17563671;BA.debugLine="lbl_name.Typeface=Typeface.LoadFromAssets(\"iran_s";
_lbl_name.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("iran_sans.ttf"));
RDebugUtils.currentLine=17563672;
 //BA.debugLineNum = 17563672;BA.debugLine="lbl_name.Gravity=Gravity.CENTER_VERTICAL+Gravity.";
_lbl_name.setGravity((int) (anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL+anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL));
RDebugUtils.currentLine=17563673;
 //BA.debugLineNum = 17563673;BA.debugLine="pnl_main.AddView(lbl_name,0,lbl_itemicon.Top+lbl_";
_pnl_main.AddView((android.view.View)(_lbl_name.getObject()),(int) (0),(int) (_lbl_itemicon.getTop()+_lbl_itemicon.getHeight()),_pnl_main.getWidth(),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA));
RDebugUtils.currentLine=17563675;
 //BA.debugLineNum = 17563675;BA.debugLine="Dim bkcolor As ColorDrawable";
_bkcolor = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=17563676;
 //BA.debugLineNum = 17563676;BA.debugLine="bkcolor.Initialize(0xFFFFD82B,30)";
_bkcolor.Initialize((int) (0xffffd82b),(int) (30));
RDebugUtils.currentLine=17563677;
 //BA.debugLineNum = 17563677;BA.debugLine="Dim lbl_notis As Label";
_lbl_notis = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=17563678;
 //BA.debugLineNum = 17563678;BA.debugLine="lbl_notis.Initialize(\"lbl_notis\")";
_lbl_notis.Initialize(mostCurrent.activityBA,"lbl_notis");
RDebugUtils.currentLine=17563679;
 //BA.debugLineNum = 17563679;BA.debugLine="lbl_notis.TextColor=Colors.DarkGray";
_lbl_notis.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.DarkGray);
RDebugUtils.currentLine=17563680;
 //BA.debugLineNum = 17563680;BA.debugLine="lbl_notis.TextSize=17";
_lbl_notis.setTextSize((float) (17));
RDebugUtils.currentLine=17563681;
 //BA.debugLineNum = 17563681;BA.debugLine="lbl_notis.Typeface=Typeface.LoadFromAssets(\"iran_";
_lbl_notis.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("iran_sans.ttf"));
RDebugUtils.currentLine=17563682;
 //BA.debugLineNum = 17563682;BA.debugLine="lbl_notis.Text=\"با قیمت مناسب و کیفیت تضمینی !\"";
_lbl_notis.setText(BA.ObjectToCharSequence("با قیمت مناسب و کیفیت تضمینی !"));
RDebugUtils.currentLine=17563683;
 //BA.debugLineNum = 17563683;BA.debugLine="lbl_notis.Gravity=Gravity.CENTER_VERTICAL+Gravity";
_lbl_notis.setGravity((int) (anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL+anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL));
RDebugUtils.currentLine=17563685;
 //BA.debugLineNum = 17563685;BA.debugLine="lbl_notis.Visible=False";
_lbl_notis.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=17563686;
 //BA.debugLineNum = 17563686;BA.debugLine="pnl_main.AddView(lbl_notis,1%x,lbl_name.Top+lbl_n";
_pnl_main.AddView((android.view.View)(_lbl_notis.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (1),mostCurrent.activityBA),(int) (_lbl_name.getTop()+_lbl_name.getHeight()),(int) (_pnl_main.getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (2),mostCurrent.activityBA)),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (9),mostCurrent.activityBA));
RDebugUtils.currentLine=17563688;
 //BA.debugLineNum = 17563688;BA.debugLine="lbl_name.Text=\"فالوور بگیر\"";
_lbl_name.setText(BA.ObjectToCharSequence("فالوور بگیر"));
RDebugUtils.currentLine=17563689;
 //BA.debugLineNum = 17563689;BA.debugLine="lbl_itemicon.Text=Chr(0xE8D3)";
_lbl_itemicon.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr((int) (0xe8d3))));
RDebugUtils.currentLine=17563691;
 //BA.debugLineNum = 17563691;BA.debugLine="roundview.Initialize(lbl_notis)";
mostCurrent._roundview.Initialize(processBA,(android.view.View)(_lbl_notis.getObject()));
RDebugUtils.currentLine=17563692;
 //BA.debugLineNum = 17563692;BA.debugLine="roundview.CornerRadius_BL=30";
mostCurrent._roundview.setCornerRadius_BL((int) (30));
RDebugUtils.currentLine=17563693;
 //BA.debugLineNum = 17563693;BA.debugLine="roundview.CornerRadius_BR=30";
mostCurrent._roundview.setCornerRadius_BR((int) (30));
RDebugUtils.currentLine=17563694;
 //BA.debugLineNum = 17563694;BA.debugLine="roundview.CornerRadius_TL=30";
mostCurrent._roundview.setCornerRadius_TL((int) (30));
RDebugUtils.currentLine=17563695;
 //BA.debugLineNum = 17563695;BA.debugLine="roundview.CornerRadius_TR=30";
mostCurrent._roundview.setCornerRadius_TR((int) (30));
RDebugUtils.currentLine=17563696;
 //BA.debugLineNum = 17563696;BA.debugLine="roundview.BackgroundColor=0xFFFFD82B";
mostCurrent._roundview.setBackgroundColor((int) (0xffffd82b));
RDebugUtils.currentLine=17563699;
 //BA.debugLineNum = 17563699;BA.debugLine="End Sub";
return "";
}
public static String  _meno_click() throws Exception{
RDebugUtils.currentModule="ac_tcoin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "meno_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "meno_click", null));}
RDebugUtils.currentLine=18087936;
 //BA.debugLineNum = 18087936;BA.debugLine="Sub meno_Click";
RDebugUtils.currentLine=18087937;
 //BA.debugLineNum = 18087937;BA.debugLine="mimeno.Initialize(\"mimeno\",Me)";
mostCurrent._mimeno._initialize /*String*/ (null,mostCurrent.activityBA,"mimeno",ac_tcoin.getObject());
RDebugUtils.currentLine=18087938;
 //BA.debugLineNum = 18087938;BA.debugLine="mimeno.addpnl";
mostCurrent._mimeno._addpnl /*String*/ (null);
RDebugUtils.currentLine=18087939;
 //BA.debugLineNum = 18087939;BA.debugLine="mimeno.open";
mostCurrent._mimeno._open /*String*/ (null);
RDebugUtils.currentLine=18087940;
 //BA.debugLineNum = 18087940;BA.debugLine="End Sub";
return "";
}
public static String  _prfn_onpoststringerrorlistener(com.reza.sh.fastnet.Error _error,String _tag) throws Exception{
RDebugUtils.currentModule="ac_tcoin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "prfn_onpoststringerrorlistener", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "prfn_onpoststringerrorlistener", new Object[] {_error,_tag}));}
RDebugUtils.currentLine=17956864;
 //BA.debugLineNum = 17956864;BA.debugLine="Sub prfn_onPostStringErrorListener(Error As Respon";
RDebugUtils.currentLine=17956866;
 //BA.debugLineNum = 17956866;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=17956867;
 //BA.debugLineNum = 17956867;BA.debugLine="End Sub";
return "";
}
public static String  _prfn_onpoststringoklistener(String _result,String _tag) throws Exception{
RDebugUtils.currentModule="ac_tcoin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "prfn_onpoststringoklistener", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "prfn_onpoststringoklistener", new Object[] {_result,_tag}));}
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.List _root = null;
anywheresoftware.b4a.objects.collections.Map _colroot = null;
String _c_m = "";
String _uid = "";
String _first_last = "";
String _id = "";
String _userid = "";
String _username = "";
String _c_ch = "";
long _n_coins = 0L;
RDebugUtils.currentLine=18022400;
 //BA.debugLineNum = 18022400;BA.debugLine="Sub prfn_onPostStringOkListener(Result As String";
RDebugUtils.currentLine=18022402;
 //BA.debugLineNum = 18022402;BA.debugLine="Select Tag";
switch (BA.switchObjectToInt(_tag,"iuser","getinsta")) {
case 0: {
RDebugUtils.currentLine=18022404;
 //BA.debugLineNum = 18022404;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=18022405;
 //BA.debugLineNum = 18022405;BA.debugLine="Log(Result)";
anywheresoftware.b4a.keywords.Common.LogImpl("618022405",_result,0);
 break; }
case 1: {
RDebugUtils.currentLine=18022408;
 //BA.debugLineNum = 18022408;BA.debugLine="Log(Result)";
anywheresoftware.b4a.keywords.Common.LogImpl("618022408",_result,0);
RDebugUtils.currentLine=18022409;
 //BA.debugLineNum = 18022409;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=18022410;
 //BA.debugLineNum = 18022410;BA.debugLine="parser.Initialize(Result)";
_parser.Initialize(_result);
RDebugUtils.currentLine=18022411;
 //BA.debugLineNum = 18022411;BA.debugLine="Dim root As List = parser.NextArray";
_root = new anywheresoftware.b4a.objects.collections.List();
_root = _parser.NextArray();
RDebugUtils.currentLine=18022412;
 //BA.debugLineNum = 18022412;BA.debugLine="For Each colroot As Map In root";
_colroot = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group10 = _root;
final int groupLen10 = group10.getSize()
;int index10 = 0;
;
for (; index10 < groupLen10;index10++){
_colroot.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group10.Get(index10)));
RDebugUtils.currentLine=18022413;
 //BA.debugLineNum = 18022413;BA.debugLine="Dim Result As String = colroot.Get(\"result\")";
_result = BA.ObjectToString(_colroot.Get((Object)("result")));
RDebugUtils.currentLine=18022414;
 //BA.debugLineNum = 18022414;BA.debugLine="Dim c_m As String = colroot.Get(\"c_m\")";
_c_m = BA.ObjectToString(_colroot.Get((Object)("c_m")));
RDebugUtils.currentLine=18022415;
 //BA.debugLineNum = 18022415;BA.debugLine="Dim uid As String = colroot.Get(\"uid\")";
_uid = BA.ObjectToString(_colroot.Get((Object)("uid")));
RDebugUtils.currentLine=18022416;
 //BA.debugLineNum = 18022416;BA.debugLine="Dim first_last As String = colroot.Get(\"first_";
_first_last = BA.ObjectToString(_colroot.Get((Object)("first_last")));
RDebugUtils.currentLine=18022417;
 //BA.debugLineNum = 18022417;BA.debugLine="Dim id As String = colroot.Get(\"id\")";
_id = BA.ObjectToString(_colroot.Get((Object)("id")));
RDebugUtils.currentLine=18022418;
 //BA.debugLineNum = 18022418;BA.debugLine="Dim userid As String = colroot.Get(\"userid\")";
_userid = BA.ObjectToString(_colroot.Get((Object)("userid")));
RDebugUtils.currentLine=18022419;
 //BA.debugLineNum = 18022419;BA.debugLine="Dim username As String = colroot.Get(\"username";
_username = BA.ObjectToString(_colroot.Get((Object)("username")));
RDebugUtils.currentLine=18022420;
 //BA.debugLineNum = 18022420;BA.debugLine="Dim c_ch As String = colroot.Get(\"c_ch\")";
_c_ch = BA.ObjectToString(_colroot.Get((Object)("c_ch")));
RDebugUtils.currentLine=18022421;
 //BA.debugLineNum = 18022421;BA.debugLine="Dim n_coins=c_m As Long";
_n_coins = (long)(Double.parseDouble(_c_m));
RDebugUtils.currentLine=18022422;
 //BA.debugLineNum = 18022422;BA.debugLine="If n_coins>100 Then";
if (_n_coins>100) { 
RDebugUtils.currentLine=18022423;
 //BA.debugLineNum = 18022423;BA.debugLine="lbl_nums.Text=\"سکه \"&NumberFormat(c_m,3,0)";
mostCurrent._lbl_nums.setText(BA.ObjectToCharSequence("سکه "+anywheresoftware.b4a.keywords.Common.NumberFormat((double)(Double.parseDouble(_c_m)),(int) (3),(int) (0))));
 }else {
RDebugUtils.currentLine=18022425;
 //BA.debugLineNum = 18022425;BA.debugLine="lbl_nums.Text=\"سکه \"&c_m";
mostCurrent._lbl_nums.setText(BA.ObjectToCharSequence("سکه "+_c_m));
 };
RDebugUtils.currentLine=18022429;
 //BA.debugLineNum = 18022429;BA.debugLine="sql1.ExecNonQuery(\"UPDATE tbl_coin set cm='\"&c";
_sql1.ExecNonQuery("UPDATE tbl_coin set cm='"+_c_m+"',cf='"+_c_ch+"' WHERE userid='"+mostCurrent._userid_t+"' ");
 }
};
 break; }
}
;
RDebugUtils.currentLine=18022435;
 //BA.debugLineNum = 18022435;BA.debugLine="End Sub";
return "";
}
}