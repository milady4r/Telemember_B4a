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

public class ac_tselect extends androidx.appcompat.app.AppCompatActivity implements B4AActivity{
	public static ac_tselect mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "com.it.fome", "com.it.fome.ac_tselect");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (ac_tselect).");
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
		activityBA = new BA(this, layout, processBA, "com.it.fome", "com.it.fome.ac_tselect");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "com.it.fome.ac_tselect", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (ac_tselect) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (ac_tselect) Resume **");
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
		return ac_tselect.class;
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
        BA.LogInfo("** Activity (ac_tselect) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            ac_tselect mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (ac_tselect) Resume **");
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
public com.it.fome.ac_lchats _ac_lchats = null;
public com.it.fome.ac_tfreecoin _ac_tfreecoin = null;
public com.it.fome.ac_hsef _ac_hsef = null;
public com.it.fome.ac_tsearch _ac_tsearch = null;
public com.it.fome.ac_tcoin _ac_tcoin = null;
public com.it.fome.ac_home _ac_home = null;
public com.it.fome.act_chat _act_chat = null;
public com.it.fome.starter _starter = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="ac_tselect";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
int _i = 0;
anywheresoftware.b4a.objects.drawable.GradientDrawable _gradient1 = null;
int[] _clrs = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _bkcolor = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _bkcolor_st = null;
anywheresoftware.b4a.objects.PanelWrapper _pnlb1 = null;
RDebugUtils.currentLine=8585216;
 //BA.debugLineNum = 8585216;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=8585219;
 //BA.debugLineNum = 8585219;BA.debugLine="If File.Exists(File.DirInternal,\"instadb.db\")=Fal";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"instadb.db")==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=8585220;
 //BA.debugLineNum = 8585220;BA.debugLine="File.Copy(File.DirAssets,\"instadb.db\",File.DirIn";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"instadb.db",anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"instadb.db");
 };
RDebugUtils.currentLine=8585222;
 //BA.debugLineNum = 8585222;BA.debugLine="If sql1.IsInitialized=False Then";
if (_sql1.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=8585223;
 //BA.debugLineNum = 8585223;BA.debugLine="sql1.Initialize(File.DirInternal,\"instadb.db\",Fa";
_sql1.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"instadb.db",anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=8585235;
 //BA.debugLineNum = 8585235;BA.debugLine="cursor1 = sql1.ExecQuery(\"SELECT * FROM tbl_tele";
_cursor1.setObject((android.database.Cursor)(_sql1.ExecQuery("SELECT * FROM tbl_tele WHERE soich='1'")));
RDebugUtils.currentLine=8585236;
 //BA.debugLineNum = 8585236;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=8585237;
 //BA.debugLineNum = 8585237;BA.debugLine="For i=0 To cursor1.RowCount-1";
{
final int step9 = 1;
final int limit9 = (int) (_cursor1.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
RDebugUtils.currentLine=8585238;
 //BA.debugLineNum = 8585238;BA.debugLine="cursor1.Position=i";
_cursor1.setPosition(_i);
RDebugUtils.currentLine=8585239;
 //BA.debugLineNum = 8585239;BA.debugLine="userid_t=cursor1.GetString(\"userid\")";
mostCurrent._userid_t = _cursor1.GetString("userid");
RDebugUtils.currentLine=8585240;
 //BA.debugLineNum = 8585240;BA.debugLine="username_t=cursor1.GetString(\"username\")";
mostCurrent._username_t = _cursor1.GetString("username");
 }
};
RDebugUtils.currentLine=8585242;
 //BA.debugLineNum = 8585242;BA.debugLine="cursor1.Close";
_cursor1.Close();
RDebugUtils.currentLine=8585243;
 //BA.debugLineNum = 8585243;BA.debugLine="ToastMessageShow(username_t,False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence(mostCurrent._username_t),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=8585244;
 //BA.debugLineNum = 8585244;BA.debugLine="Log(userid_t)";
anywheresoftware.b4a.keywords.Common.LogImpl("68585244",mostCurrent._userid_t,0);
RDebugUtils.currentLine=8585245;
 //BA.debugLineNum = 8585245;BA.debugLine="Dim Gradient1 As GradientDrawable";
_gradient1 = new anywheresoftware.b4a.objects.drawable.GradientDrawable();
RDebugUtils.currentLine=8585246;
 //BA.debugLineNum = 8585246;BA.debugLine="Dim Clrs(5) As Int";
_clrs = new int[(int) (5)];
;
RDebugUtils.currentLine=8585247;
 //BA.debugLineNum = 8585247;BA.debugLine="Clrs(0) = 0xFFe8eaf6";
_clrs[(int) (0)] = (int) (0xffe8eaf6);
RDebugUtils.currentLine=8585248;
 //BA.debugLineNum = 8585248;BA.debugLine="Clrs(1) = 0xFFe8eaf6";
_clrs[(int) (1)] = (int) (0xffe8eaf6);
RDebugUtils.currentLine=8585249;
 //BA.debugLineNum = 8585249;BA.debugLine="Clrs(2) = 0xFFe8eaf6";
_clrs[(int) (2)] = (int) (0xffe8eaf6);
RDebugUtils.currentLine=8585250;
 //BA.debugLineNum = 8585250;BA.debugLine="Clrs(3) = 0xFF283593";
_clrs[(int) (3)] = (int) (0xff283593);
RDebugUtils.currentLine=8585251;
 //BA.debugLineNum = 8585251;BA.debugLine="Clrs(4) = 0xFF283593";
_clrs[(int) (4)] = (int) (0xff283593);
RDebugUtils.currentLine=8585253;
 //BA.debugLineNum = 8585253;BA.debugLine="Gradient1.Initialize(\"TOP_BOTTOM\", Clrs)";
_gradient1.Initialize(BA.getEnumFromString(android.graphics.drawable.GradientDrawable.Orientation.class,"TOP_BOTTOM"),_clrs);
RDebugUtils.currentLine=8585254;
 //BA.debugLineNum = 8585254;BA.debugLine="Activity.Background=Gradient1";
mostCurrent._activity.setBackground((android.graphics.drawable.Drawable)(_gradient1.getObject()));
RDebugUtils.currentLine=8585256;
 //BA.debugLineNum = 8585256;BA.debugLine="Dim bkcolor As ColorDrawable";
_bkcolor = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=8585257;
 //BA.debugLineNum = 8585257;BA.debugLine="bkcolor.Initialize2(Colors.White,15,2dip,Colors.L";
_bkcolor.Initialize2(anywheresoftware.b4a.keywords.Common.Colors.White,(int) (15),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (2)),anywheresoftware.b4a.keywords.Common.Colors.LightGray);
RDebugUtils.currentLine=8585258;
 //BA.debugLineNum = 8585258;BA.debugLine="meno.Initialize(\"meno\")";
mostCurrent._meno.Initialize(mostCurrent.activityBA,"meno");
RDebugUtils.currentLine=8585259;
 //BA.debugLineNum = 8585259;BA.debugLine="meno.TextColor=Colors.DarkGray";
mostCurrent._meno.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.DarkGray);
RDebugUtils.currentLine=8585260;
 //BA.debugLineNum = 8585260;BA.debugLine="meno.TextSize=37";
mostCurrent._meno.setTextSize((float) (37));
RDebugUtils.currentLine=8585261;
 //BA.debugLineNum = 8585261;BA.debugLine="meno.Background=bkcolor";
mostCurrent._meno.setBackground((android.graphics.drawable.Drawable)(_bkcolor.getObject()));
RDebugUtils.currentLine=8585262;
 //BA.debugLineNum = 8585262;BA.debugLine="meno.Typeface=Typeface.MATERIALICONS";
mostCurrent._meno.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.getMATERIALICONS());
RDebugUtils.currentLine=8585263;
 //BA.debugLineNum = 8585263;BA.debugLine="meno.Text=Chr(0xE3C7)";
mostCurrent._meno.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr((int) (0xe3c7))));
RDebugUtils.currentLine=8585264;
 //BA.debugLineNum = 8585264;BA.debugLine="meno.Gravity=Gravity.CENTER_HORIZONTAL+Gravity.CE";
mostCurrent._meno.setGravity((int) (anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL+anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=8585265;
 //BA.debugLineNum = 8585265;BA.debugLine="Activity.AddView(meno,3%x,3%x,12%x,12%x)";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._meno.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (3),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (3),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (12),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (12),mostCurrent.activityBA));
RDebugUtils.currentLine=8585267;
 //BA.debugLineNum = 8585267;BA.debugLine="pnl_coins.Initialize(\"pnl_coins\")";
mostCurrent._pnl_coins.Initialize(mostCurrent.activityBA,"pnl_coins");
RDebugUtils.currentLine=8585268;
 //BA.debugLineNum = 8585268;BA.debugLine="Activity.AddView(pnl_coins,50%x,3%x,50%x,12%x)";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._pnl_coins.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (50),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (3),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (50),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (12),mostCurrent.activityBA));
RDebugUtils.currentLine=8585269;
 //BA.debugLineNum = 8585269;BA.debugLine="roundview.Initialize(pnl_coins)";
mostCurrent._roundview.Initialize(processBA,(android.view.View)(mostCurrent._pnl_coins.getObject()));
RDebugUtils.currentLine=8585270;
 //BA.debugLineNum = 8585270;BA.debugLine="roundview.CornerRadius_BL=10%x";
mostCurrent._roundview.setCornerRadius_BL(anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA));
RDebugUtils.currentLine=8585271;
 //BA.debugLineNum = 8585271;BA.debugLine="roundview.CornerRadius_TL=10%x";
mostCurrent._roundview.setCornerRadius_TL(anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA));
RDebugUtils.currentLine=8585272;
 //BA.debugLineNum = 8585272;BA.debugLine="roundview.BackgroundColor=Colors.White";
mostCurrent._roundview.setBackgroundColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=8585274;
 //BA.debugLineNum = 8585274;BA.debugLine="Dim bkcolor_st As ColorDrawable";
_bkcolor_st = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=8585275;
 //BA.debugLineNum = 8585275;BA.debugLine="bkcolor_st.Initialize2(0xFFC67D00,50,4dip,0x82FFE";
_bkcolor_st.Initialize2((int) (0xffc67d00),(int) (50),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (4)),(int) (0x82ffe300));
RDebugUtils.currentLine=8585277;
 //BA.debugLineNum = 8585277;BA.debugLine="Dim pnlb1 As Panel";
_pnlb1 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=8585278;
 //BA.debugLineNum = 8585278;BA.debugLine="pnlb1.Initialize(\"\")";
_pnlb1.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=8585279;
 //BA.debugLineNum = 8585279;BA.debugLine="pnlb1.Color=0xFFFFC300";
_pnlb1.setColor((int) (0xffffc300));
RDebugUtils.currentLine=8585280;
 //BA.debugLineNum = 8585280;BA.debugLine="pnlb1.Background=bkcolor_st";
_pnlb1.setBackground((android.graphics.drawable.Drawable)(_bkcolor_st.getObject()));
RDebugUtils.currentLine=8585281;
 //BA.debugLineNum = 8585281;BA.debugLine="pnl_coins.AddView(pnlb1,pnl_coins.Width-11%x,1%x,";
mostCurrent._pnl_coins.AddView((android.view.View)(_pnlb1.getObject()),(int) (mostCurrent._pnl_coins.getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (11),mostCurrent.activityBA)),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (1),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA),(int) (mostCurrent._pnl_coins.getHeight()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (2),mostCurrent.activityBA)));
RDebugUtils.currentLine=8585283;
 //BA.debugLineNum = 8585283;BA.debugLine="lbl_icon.Initialize(\"lbl_icon\")";
mostCurrent._lbl_icon.Initialize(mostCurrent.activityBA,"lbl_icon");
RDebugUtils.currentLine=8585284;
 //BA.debugLineNum = 8585284;BA.debugLine="lbl_icon.SetBackgroundImage(LoadBitmap(File.DirAs";
mostCurrent._lbl_icon.SetBackgroundImageNew((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"coins.png").getObject()));
RDebugUtils.currentLine=8585285;
 //BA.debugLineNum = 8585285;BA.debugLine="pnl_coins.AddView(lbl_icon,pnl_coins.Width-9%x,pn";
mostCurrent._pnl_coins.AddView((android.view.View)(mostCurrent._lbl_icon.getObject()),(int) (mostCurrent._pnl_coins.getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (9),mostCurrent.activityBA)),(int) (mostCurrent._pnl_coins.getHeight()/(double)2/(double)2),(int) (mostCurrent._pnl_coins.getHeight()/(double)2),(int) (mostCurrent._pnl_coins.getHeight()/(double)2));
RDebugUtils.currentLine=8585287;
 //BA.debugLineNum = 8585287;BA.debugLine="lbl_nums.Initialize(\"lbl_nums\")";
mostCurrent._lbl_nums.Initialize(mostCurrent.activityBA,"lbl_nums");
RDebugUtils.currentLine=8585288;
 //BA.debugLineNum = 8585288;BA.debugLine="lbl_nums.TextColor=Colors.DarkGray";
mostCurrent._lbl_nums.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.DarkGray);
RDebugUtils.currentLine=8585289;
 //BA.debugLineNum = 8585289;BA.debugLine="lbl_nums.TextSize=20";
mostCurrent._lbl_nums.setTextSize((float) (20));
RDebugUtils.currentLine=8585290;
 //BA.debugLineNum = 8585290;BA.debugLine="lbl_nums.Typeface=Typeface.LoadFromAssets(\"iran_s";
mostCurrent._lbl_nums.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("iran_sans.ttf"));
RDebugUtils.currentLine=8585291;
 //BA.debugLineNum = 8585291;BA.debugLine="lbl_nums.Text=0&\" سکه\"";
mostCurrent._lbl_nums.setText(BA.ObjectToCharSequence(BA.NumberToString(0)+" سکه"));
RDebugUtils.currentLine=8585292;
 //BA.debugLineNum = 8585292;BA.debugLine="lbl_nums.Gravity=Gravity.CENTER_VERTICAL+Gravity.";
mostCurrent._lbl_nums.setGravity((int) (anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL+anywheresoftware.b4a.keywords.Common.Gravity.RIGHT));
RDebugUtils.currentLine=8585293;
 //BA.debugLineNum = 8585293;BA.debugLine="pnl_coins.AddView(lbl_nums,2%x,0,pnl_coins.Width-";
mostCurrent._pnl_coins.AddView((android.view.View)(mostCurrent._lbl_nums.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (2),mostCurrent.activityBA),(int) (0),(int) (mostCurrent._pnl_coins.getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (15),mostCurrent.activityBA)),mostCurrent._pnl_coins.getHeight());
RDebugUtils.currentLine=8585295;
 //BA.debugLineNum = 8585295;BA.debugLine="LV.Initializer(\"LV\").ListView.Build";
mostCurrent._lv.Initializer(mostCurrent.activityBA,"LV").ListView().Build();
RDebugUtils.currentLine=8585296;
 //BA.debugLineNum = 8585296;BA.debugLine="Activity.AddView(LV,0,10%y,100%x,90%y)";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._lv.getObject()),(int) (0),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (10),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (90),mostCurrent.activityBA));
RDebugUtils.currentLine=8585297;
 //BA.debugLineNum = 8585297;BA.debugLine="LV.Ripple.Color(0xFF5E23DE).Alpha(0.2f).Duration(";
mostCurrent._lv.Ripple().Color((int) (0xff5e23de)).Alpha((float) (0.2f)).Duration((int) (350));
RDebugUtils.currentLine=8585298;
 //BA.debugLineNum = 8585298;BA.debugLine="LV.Show";
mostCurrent._lv.Show();
RDebugUtils.currentLine=8585300;
 //BA.debugLineNum = 8585300;BA.debugLine="req_getme(userid_t)";
_req_getme(mostCurrent._userid_t);
RDebugUtils.currentLine=8585301;
 //BA.debugLineNum = 8585301;BA.debugLine="End Sub";
return "";
}
public static String  _req_getme(String _userid) throws Exception{
RDebugUtils.currentModule="ac_tselect";
if (Debug.shouldDelegate(mostCurrent.activityBA, "req_getme", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "req_getme", new Object[] {_userid}));}
com.reza.sh.fastnet.Fastnet _prfn = null;
com.reza.sh.fastnet.PostRequestRaper _post = null;
RDebugUtils.currentLine=9109504;
 //BA.debugLineNum = 9109504;BA.debugLine="Sub req_getme(userid As String)";
RDebugUtils.currentLine=9109505;
 //BA.debugLineNum = 9109505;BA.debugLine="Dim prfn As PersianFastNetwork";
_prfn = new com.reza.sh.fastnet.Fastnet();
RDebugUtils.currentLine=9109506;
 //BA.debugLineNum = 9109506;BA.debugLine="prfn.initialize(\"prfn\")";
_prfn.initialize(processBA,"prfn");
RDebugUtils.currentLine=9109508;
 //BA.debugLineNum = 9109508;BA.debugLine="Dim post As PostRequest";
_post = new com.reza.sh.fastnet.PostRequestRaper();
RDebugUtils.currentLine=9109509;
 //BA.debugLineNum = 9109509;BA.debugLine="post=prfn.BuildPostQuery(\"http://filework.ir/INST";
_post = _prfn.BuildPostQuery("http://filework.ir/INSTAFOLLOW/api/req.php","getinsta");
RDebugUtils.currentLine=9109511;
 //BA.debugLineNum = 9109511;BA.debugLine="post.addHeder(\"User-Agent\",\"Dalvik/1.6.0 (Linux;";
_post.addHeder("User-Agent","Dalvik/1.6.0 (Linux; U; Android 4.4.4; SM-A700FD Build/KTU84P)");
RDebugUtils.currentLine=9109513;
 //BA.debugLineNum = 9109513;BA.debugLine="post.addParametrs(\"ui\",\"1\")";
_post.addParametrs("ui","1");
RDebugUtils.currentLine=9109514;
 //BA.debugLineNum = 9109514;BA.debugLine="post.addParametrs(\"userid\",userid_t)";
_post.addParametrs("userid",mostCurrent._userid_t);
RDebugUtils.currentLine=9109516;
 //BA.debugLineNum = 9109516;BA.debugLine="post.addParametrs(\"req\",\"get_acct\")";
_post.addParametrs("req","get_acct");
RDebugUtils.currentLine=9109519;
 //BA.debugLineNum = 9109519;BA.debugLine="post.executRequestAsString";
_post.executRequestAsString();
RDebugUtils.currentLine=9109520;
 //BA.debugLineNum = 9109520;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="ac_tselect";
RDebugUtils.currentLine=8716288;
 //BA.debugLineNum = 8716288;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=8716290;
 //BA.debugLineNum = 8716290;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="ac_tselect";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=8650752;
 //BA.debugLineNum = 8650752;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=8650753;
 //BA.debugLineNum = 8650753;BA.debugLine="req_getme(userid_t)";
_req_getme(mostCurrent._userid_t);
RDebugUtils.currentLine=8650755;
 //BA.debugLineNum = 8650755;BA.debugLine="End Sub";
return "";
}
public static int  _lv_getitemcount() throws Exception{
RDebugUtils.currentModule="ac_tselect";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lv_getitemcount", false))
	 {return ((Integer) Debug.delegate(mostCurrent.activityBA, "lv_getitemcount", null));}
RDebugUtils.currentLine=8912896;
 //BA.debugLineNum = 8912896;BA.debugLine="Sub LV_GetItemCount As Int 								        '$ Item";
RDebugUtils.currentLine=8912897;
 //BA.debugLineNum = 8912897;BA.debugLine="Return 5 'ItemList.Size";
if (true) return (int) (5);
RDebugUtils.currentLine=8912898;
 //BA.debugLineNum = 8912898;BA.debugLine="End Sub";
return 0;
}
public static void  _lv_itemclick(anywheresoftware.b4a.objects.PanelWrapper _clickeditem,int _position) throws Exception{
RDebugUtils.currentModule="ac_tselect";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lv_itemclick", false))
	 {Debug.delegate(mostCurrent.activityBA, "lv_itemclick", new Object[] {_clickeditem,_position}); return;}
ResumableSub_LV_ItemClick rsub = new ResumableSub_LV_ItemClick(null,_clickeditem,_position);
rsub.resume(processBA, null);
}
public static class ResumableSub_LV_ItemClick extends BA.ResumableSub {
public ResumableSub_LV_ItemClick(com.it.fome.ac_tselect parent,anywheresoftware.b4a.objects.PanelWrapper _clickeditem,int _position) {
this.parent = parent;
this._clickeditem = _clickeditem;
this._position = _position;
}
com.it.fome.ac_tselect parent;
anywheresoftware.b4a.objects.PanelWrapper _clickeditem;
int _position;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ac_tselect";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=8978433;
 //BA.debugLineNum = 8978433;BA.debugLine="Sleep(0)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ac_tselect", "lv_itemclick"),(int) (0));
this.state = 13;
return;
case 13:
//C
this.state = 1;
;
RDebugUtils.currentLine=8978434;
 //BA.debugLineNum = 8978434;BA.debugLine="Select Position";
if (true) break;

case 1:
//select
this.state = 12;
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
case 4: {
this.state = 11;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 12;
RDebugUtils.currentLine=8978437;
 //BA.debugLineNum = 8978437;BA.debugLine="StartActivity(ac_lchats)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._ac_lchats.getObject()));
RDebugUtils.currentLine=8978440;
 //BA.debugLineNum = 8978440;BA.debugLine="SetAnimation(\"anim3\", \"anim4\")";
_setanimation("anim3","anim4");
 if (true) break;

case 5:
//C
this.state = 12;
RDebugUtils.currentLine=8978442;
 //BA.debugLineNum = 8978442;BA.debugLine="StartActivity(ac_tcoin)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._ac_tcoin.getObject()));
RDebugUtils.currentLine=8978443;
 //BA.debugLineNum = 8978443;BA.debugLine="SetAnimation(\"anim2\", \"anim1\")";
_setanimation("anim2","anim1");
 if (true) break;

case 7:
//C
this.state = 12;
RDebugUtils.currentLine=8978446;
 //BA.debugLineNum = 8978446;BA.debugLine="ac_hsef.typesef=1";
parent.mostCurrent._ac_hsef._typesef /*int*/  = (int) (1);
RDebugUtils.currentLine=8978447;
 //BA.debugLineNum = 8978447;BA.debugLine="StartActivity(ac_hsef)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._ac_hsef.getObject()));
RDebugUtils.currentLine=8978448;
 //BA.debugLineNum = 8978448;BA.debugLine="SetAnimation(\"anim2\", \"anim1\")";
_setanimation("anim2","anim1");
 if (true) break;

case 9:
//C
this.state = 12;
RDebugUtils.currentLine=8978451;
 //BA.debugLineNum = 8978451;BA.debugLine="ac_shop.typesef=1";
parent.mostCurrent._ac_shop._typesef /*int*/  = (int) (1);
RDebugUtils.currentLine=8978452;
 //BA.debugLineNum = 8978452;BA.debugLine="StartActivity(ac_shop)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._ac_shop.getObject()));
RDebugUtils.currentLine=8978453;
 //BA.debugLineNum = 8978453;BA.debugLine="SetAnimation(\"anim2\", \"anim1\")";
_setanimation("anim2","anim1");
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=8978456;
 //BA.debugLineNum = 8978456;BA.debugLine="ac_tansfer.type_s=1";
parent.mostCurrent._ac_tansfer._type_s /*int*/  = (int) (1);
RDebugUtils.currentLine=8978457;
 //BA.debugLineNum = 8978457;BA.debugLine="StartActivity(ac_tansfer)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._ac_tansfer.getObject()));
RDebugUtils.currentLine=8978458;
 //BA.debugLineNum = 8978458;BA.debugLine="SetAnimation(\"anim2\", \"anim1\")";
_setanimation("anim2","anim1");
 if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=8978463;
 //BA.debugLineNum = 8978463;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _setanimation(String _inanimation,String _outanimation) throws Exception{
RDebugUtils.currentModule="ac_tselect";
if (Debug.shouldDelegate(mostCurrent.activityBA, "setanimation", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "setanimation", new Object[] {_inanimation,_outanimation}));}
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
String _package = "";
int _in = 0;
int _out = 0;
RDebugUtils.currentLine=9043968;
 //BA.debugLineNum = 9043968;BA.debugLine="Sub SetAnimation(InAnimation As String, OutAnimati";
RDebugUtils.currentLine=9043969;
 //BA.debugLineNum = 9043969;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=9043970;
 //BA.debugLineNum = 9043970;BA.debugLine="Dim package As String";
_package = "";
RDebugUtils.currentLine=9043971;
 //BA.debugLineNum = 9043971;BA.debugLine="Dim In, out As Int";
_in = 0;
_out = 0;
RDebugUtils.currentLine=9043972;
 //BA.debugLineNum = 9043972;BA.debugLine="package = r.GetStaticField(\"anywheresoftware.b4a.";
_package = BA.ObjectToString(_r.GetStaticField("anywheresoftware.b4a.BA","packageName"));
RDebugUtils.currentLine=9043973;
 //BA.debugLineNum = 9043973;BA.debugLine="In = r.GetStaticField(package & \".R$anim\", InAnim";
_in = (int)(BA.ObjectToNumber(_r.GetStaticField(_package+".R$anim",_inanimation)));
RDebugUtils.currentLine=9043974;
 //BA.debugLineNum = 9043974;BA.debugLine="out = r.GetStaticField(package & \".R$anim\", OutAn";
_out = (int)(BA.ObjectToNumber(_r.GetStaticField(_package+".R$anim",_outanimation)));
RDebugUtils.currentLine=9043975;
 //BA.debugLineNum = 9043975;BA.debugLine="r.Target = r.GetActivity";
_r.Target = (Object)(_r.GetActivity(processBA));
RDebugUtils.currentLine=9043976;
 //BA.debugLineNum = 9043976;BA.debugLine="r.RunMethod4(\"overridePendingTransition\", Array A";
_r.RunMethod4("overridePendingTransition",new Object[]{(Object)(_in),(Object)(_out)},new String[]{"java.lang.int","java.lang.int"});
RDebugUtils.currentLine=9043977;
 //BA.debugLineNum = 9043977;BA.debugLine="End Sub";
return "";
}
public static String  _lv_onbindviewholder(anywheresoftware.b4a.objects.PanelWrapper _parent,int _position) throws Exception{
RDebugUtils.currentModule="ac_tselect";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lv_onbindviewholder", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "lv_onbindviewholder", new Object[] {_parent,_position}));}
anywheresoftware.b4a.objects.PanelWrapper _pnl_main = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl_itemicon = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl_name = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl_notis = null;
RDebugUtils.currentLine=8847360;
 //BA.debugLineNum = 8847360;BA.debugLine="Sub LV_onBindViewHolder (Parent As Panel, Position";
RDebugUtils.currentLine=8847361;
 //BA.debugLineNum = 8847361;BA.debugLine="Dim pnl_main = Parent.GetView(0) As Panel";
_pnl_main = new anywheresoftware.b4a.objects.PanelWrapper();
_pnl_main.setObject((android.view.ViewGroup)(_parent.GetView((int) (0)).getObject()));
RDebugUtils.currentLine=8847362;
 //BA.debugLineNum = 8847362;BA.debugLine="Dim lbl_itemicon = pnl_main.GetView(0) As Label";
_lbl_itemicon = new anywheresoftware.b4a.objects.LabelWrapper();
_lbl_itemicon.setObject((android.widget.TextView)(_pnl_main.GetView((int) (0)).getObject()));
RDebugUtils.currentLine=8847363;
 //BA.debugLineNum = 8847363;BA.debugLine="Dim lbl_name = pnl_main.GetView(1) As Label";
_lbl_name = new anywheresoftware.b4a.objects.LabelWrapper();
_lbl_name.setObject((android.widget.TextView)(_pnl_main.GetView((int) (1)).getObject()));
RDebugUtils.currentLine=8847365;
 //BA.debugLineNum = 8847365;BA.debugLine="Dim lbl_notis = pnl_main.GetView(2) As Label";
_lbl_notis = new anywheresoftware.b4a.objects.LabelWrapper();
_lbl_notis.setObject((android.widget.TextView)(_pnl_main.GetView((int) (2)).getObject()));
RDebugUtils.currentLine=8847367;
 //BA.debugLineNum = 8847367;BA.debugLine="Select Position";
switch (_position) {
case 0: {
RDebugUtils.currentLine=8847369;
 //BA.debugLineNum = 8847369;BA.debugLine="lbl_name.Text=\"سفارش بده\"";
_lbl_name.setText(BA.ObjectToCharSequence("سفارش بده"));
RDebugUtils.currentLine=8847370;
 //BA.debugLineNum = 8847370;BA.debugLine="lbl_notis.Text=\"ممبر-ویو\"";
_lbl_notis.setText(BA.ObjectToCharSequence("ممبر-ویو"));
RDebugUtils.currentLine=8847371;
 //BA.debugLineNum = 8847371;BA.debugLine="lbl_itemicon.Text=Chr(0xE003)";
_lbl_itemicon.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr((int) (0xe003))));
 break; }
case 1: {
RDebugUtils.currentLine=8847374;
 //BA.debugLineNum = 8847374;BA.debugLine="lbl_name.Text=\"سکه بگیر\"";
_lbl_name.setText(BA.ObjectToCharSequence("سکه بگیر"));
RDebugUtils.currentLine=8847375;
 //BA.debugLineNum = 8847375;BA.debugLine="lbl_notis.Text=\"سکه رایگان\"";
_lbl_notis.setText(BA.ObjectToCharSequence("سکه رایگان"));
RDebugUtils.currentLine=8847376;
 //BA.debugLineNum = 8847376;BA.debugLine="lbl_itemicon.Text=Chr(0xE8E5)";
_lbl_itemicon.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr((int) (0xe8e5))));
 break; }
case 2: {
RDebugUtils.currentLine=8847378;
 //BA.debugLineNum = 8847378;BA.debugLine="lbl_name.Text=\"سفارشات\"";
_lbl_name.setText(BA.ObjectToCharSequence("سفارشات"));
RDebugUtils.currentLine=8847379;
 //BA.debugLineNum = 8847379;BA.debugLine="lbl_notis.Text=\"پیگیری سفارشات\"";
_lbl_notis.setText(BA.ObjectToCharSequence("پیگیری سفارشات"));
RDebugUtils.currentLine=8847380;
 //BA.debugLineNum = 8847380;BA.debugLine="lbl_itemicon.Text=Chr(0xE06D)";
_lbl_itemicon.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr((int) (0xe06d))));
 break; }
case 3: {
RDebugUtils.currentLine=8847382;
 //BA.debugLineNum = 8847382;BA.debugLine="lbl_name.Text=\"فروشگاه\"";
_lbl_name.setText(BA.ObjectToCharSequence("فروشگاه"));
RDebugUtils.currentLine=8847383;
 //BA.debugLineNum = 8847383;BA.debugLine="lbl_notis.Text=\"خرید سکه\"";
_lbl_notis.setText(BA.ObjectToCharSequence("خرید سکه"));
RDebugUtils.currentLine=8847384;
 //BA.debugLineNum = 8847384;BA.debugLine="lbl_itemicon.Text=Chr(0xE854)";
_lbl_itemicon.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr((int) (0xe854))));
 break; }
case 4: {
RDebugUtils.currentLine=8847386;
 //BA.debugLineNum = 8847386;BA.debugLine="lbl_name.Text=\"انتقال سکه\"";
_lbl_name.setText(BA.ObjectToCharSequence("انتقال سکه"));
RDebugUtils.currentLine=8847387;
 //BA.debugLineNum = 8847387;BA.debugLine="lbl_notis.Text=\"انتقال سکه به دیگر کاربران\"";
_lbl_notis.setText(BA.ObjectToCharSequence("انتقال سکه به دیگر کاربران"));
RDebugUtils.currentLine=8847388;
 //BA.debugLineNum = 8847388;BA.debugLine="lbl_itemicon.Text=Chr(0xE863)";
_lbl_itemicon.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr((int) (0xe863))));
 break; }
}
;
RDebugUtils.currentLine=8847392;
 //BA.debugLineNum = 8847392;BA.debugLine="lbl_notis.Top=pnl_main.Height-10%x";
_lbl_notis.setTop((int) (_pnl_main.getHeight()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA)));
RDebugUtils.currentLine=8847393;
 //BA.debugLineNum = 8847393;BA.debugLine="Parent.Height=pnl_main.Height+5%x";
_parent.setHeight((int) (_pnl_main.getHeight()+anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA)));
RDebugUtils.currentLine=8847394;
 //BA.debugLineNum = 8847394;BA.debugLine="End Sub";
return "";
}
public static String  _lv_oncreateviewholder(anywheresoftware.b4a.objects.PanelWrapper _parent,int _viewtype) throws Exception{
RDebugUtils.currentModule="ac_tselect";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lv_oncreateviewholder", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "lv_oncreateviewholder", new Object[] {_parent,_viewtype}));}
anywheresoftware.b4a.objects.drawable.ColorDrawable _bkcolors = null;
anywheresoftware.b4a.objects.PanelWrapper _pnl_main = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl_itemicon = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl_name = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _bkcolor = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl_notis = null;
RDebugUtils.currentLine=8781824;
 //BA.debugLineNum = 8781824;BA.debugLine="Sub LV_onCreateViewHolder (Parent As Panel, ViewTy";
RDebugUtils.currentLine=8781825;
 //BA.debugLineNum = 8781825;BA.debugLine="Parent.Color=Colors.Transparent";
_parent.setColor(anywheresoftware.b4a.keywords.Common.Colors.Transparent);
RDebugUtils.currentLine=8781827;
 //BA.debugLineNum = 8781827;BA.debugLine="Dim bkcolors As ColorDrawable";
_bkcolors = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=8781828;
 //BA.debugLineNum = 8781828;BA.debugLine="bkcolors.Initialize(Colors.White,3%x)";
_bkcolors.Initialize(anywheresoftware.b4a.keywords.Common.Colors.White,anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (3),mostCurrent.activityBA));
RDebugUtils.currentLine=8781830;
 //BA.debugLineNum = 8781830;BA.debugLine="Dim pnl_main As Panel : pnl_main.Initialize(\"pnl_";
_pnl_main = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=8781830;
 //BA.debugLineNum = 8781830;BA.debugLine="Dim pnl_main As Panel : pnl_main.Initialize(\"pnl_";
_pnl_main.Initialize(mostCurrent.activityBA,"pnl_main");
RDebugUtils.currentLine=8781831;
 //BA.debugLineNum = 8781831;BA.debugLine="pnl_main.Color=Colors.White";
_pnl_main.setColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=8781832;
 //BA.debugLineNum = 8781832;BA.debugLine="pnl_main.Background=bkcolors";
_pnl_main.setBackground((android.graphics.drawable.Drawable)(_bkcolors.getObject()));
RDebugUtils.currentLine=8781833;
 //BA.debugLineNum = 8781833;BA.debugLine="Parent.AddView(pnl_main,5%x,2%x,90%x,35%x)";
_parent.AddView((android.view.View)(_pnl_main.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (2),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (90),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (35),mostCurrent.activityBA));
RDebugUtils.currentLine=8781835;
 //BA.debugLineNum = 8781835;BA.debugLine="Dim lbl_itemicon As Label";
_lbl_itemicon = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=8781836;
 //BA.debugLineNum = 8781836;BA.debugLine="lbl_itemicon.Initialize(\"lbl_itemicon\")";
_lbl_itemicon.Initialize(mostCurrent.activityBA,"lbl_itemicon");
RDebugUtils.currentLine=8781837;
 //BA.debugLineNum = 8781837;BA.debugLine="lbl_itemicon.TextColor=0xFFD305BA";
_lbl_itemicon.setTextColor((int) (0xffd305ba));
RDebugUtils.currentLine=8781838;
 //BA.debugLineNum = 8781838;BA.debugLine="lbl_itemicon.TextSize=35";
_lbl_itemicon.setTextSize((float) (35));
RDebugUtils.currentLine=8781839;
 //BA.debugLineNum = 8781839;BA.debugLine="lbl_itemicon.Typeface=Typeface.MATERIALICONS";
_lbl_itemicon.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.getMATERIALICONS());
RDebugUtils.currentLine=8781840;
 //BA.debugLineNum = 8781840;BA.debugLine="lbl_itemicon.Gravity=Gravity.CENTER_VERTICAL+Grav";
_lbl_itemicon.setGravity((int) (anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL+anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL));
RDebugUtils.currentLine=8781841;
 //BA.debugLineNum = 8781841;BA.debugLine="pnl_main.AddView(lbl_itemicon,0,3%x,pnl_main.Widt";
_pnl_main.AddView((android.view.View)(_lbl_itemicon.getObject()),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (3),mostCurrent.activityBA),_pnl_main.getWidth(),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA));
RDebugUtils.currentLine=8781843;
 //BA.debugLineNum = 8781843;BA.debugLine="Dim lbl_name As Label";
_lbl_name = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=8781844;
 //BA.debugLineNum = 8781844;BA.debugLine="lbl_name.Initialize(\"lbl_name\")";
_lbl_name.Initialize(mostCurrent.activityBA,"lbl_name");
RDebugUtils.currentLine=8781845;
 //BA.debugLineNum = 8781845;BA.debugLine="lbl_name.TextColor=Colors.DarkGray";
_lbl_name.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.DarkGray);
RDebugUtils.currentLine=8781846;
 //BA.debugLineNum = 8781846;BA.debugLine="lbl_name.TextSize=17";
_lbl_name.setTextSize((float) (17));
RDebugUtils.currentLine=8781847;
 //BA.debugLineNum = 8781847;BA.debugLine="lbl_name.Typeface=Typeface.LoadFromAssets(\"iran_s";
_lbl_name.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("iran_sans.ttf"));
RDebugUtils.currentLine=8781848;
 //BA.debugLineNum = 8781848;BA.debugLine="lbl_name.Gravity=Gravity.CENTER_VERTICAL+Gravity.";
_lbl_name.setGravity((int) (anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL+anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL));
RDebugUtils.currentLine=8781849;
 //BA.debugLineNum = 8781849;BA.debugLine="pnl_main.AddView(lbl_name,0,lbl_itemicon.Top+lbl_";
_pnl_main.AddView((android.view.View)(_lbl_name.getObject()),(int) (0),(int) (_lbl_itemicon.getTop()+_lbl_itemicon.getHeight()),_pnl_main.getWidth(),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA));
RDebugUtils.currentLine=8781851;
 //BA.debugLineNum = 8781851;BA.debugLine="Dim bkcolor As ColorDrawable";
_bkcolor = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=8781852;
 //BA.debugLineNum = 8781852;BA.debugLine="bkcolor.Initialize(0xFFFFD82B,30)";
_bkcolor.Initialize((int) (0xffffd82b),(int) (30));
RDebugUtils.currentLine=8781853;
 //BA.debugLineNum = 8781853;BA.debugLine="Dim lbl_notis As Label";
_lbl_notis = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=8781854;
 //BA.debugLineNum = 8781854;BA.debugLine="lbl_notis.Initialize(\"lbl_notis\")";
_lbl_notis.Initialize(mostCurrent.activityBA,"lbl_notis");
RDebugUtils.currentLine=8781855;
 //BA.debugLineNum = 8781855;BA.debugLine="lbl_notis.TextColor=Colors.DarkGray";
_lbl_notis.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.DarkGray);
RDebugUtils.currentLine=8781856;
 //BA.debugLineNum = 8781856;BA.debugLine="lbl_notis.TextSize=17";
_lbl_notis.setTextSize((float) (17));
RDebugUtils.currentLine=8781857;
 //BA.debugLineNum = 8781857;BA.debugLine="lbl_notis.Typeface=Typeface.LoadFromAssets(\"iran_";
_lbl_notis.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("iran_sans.ttf"));
RDebugUtils.currentLine=8781858;
 //BA.debugLineNum = 8781858;BA.debugLine="lbl_notis.Text=\"با قیمت مناسب و کیفیت تضمینی !\"";
_lbl_notis.setText(BA.ObjectToCharSequence("با قیمت مناسب و کیفیت تضمینی !"));
RDebugUtils.currentLine=8781859;
 //BA.debugLineNum = 8781859;BA.debugLine="lbl_notis.Gravity=Gravity.CENTER_VERTICAL+Gravity";
_lbl_notis.setGravity((int) (anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL+anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL));
RDebugUtils.currentLine=8781861;
 //BA.debugLineNum = 8781861;BA.debugLine="pnl_main.AddView(lbl_notis,1%x,lbl_name.Top+lbl_n";
_pnl_main.AddView((android.view.View)(_lbl_notis.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (1),mostCurrent.activityBA),(int) (_lbl_name.getTop()+_lbl_name.getHeight()),(int) (_pnl_main.getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (2),mostCurrent.activityBA)),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (9),mostCurrent.activityBA));
RDebugUtils.currentLine=8781863;
 //BA.debugLineNum = 8781863;BA.debugLine="lbl_name.Text=\"فالوور بگیر\"";
_lbl_name.setText(BA.ObjectToCharSequence("فالوور بگیر"));
RDebugUtils.currentLine=8781864;
 //BA.debugLineNum = 8781864;BA.debugLine="lbl_itemicon.Text=Chr(0xE8D3)";
_lbl_itemicon.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr((int) (0xe8d3))));
RDebugUtils.currentLine=8781866;
 //BA.debugLineNum = 8781866;BA.debugLine="roundview.Initialize(lbl_notis)";
mostCurrent._roundview.Initialize(processBA,(android.view.View)(_lbl_notis.getObject()));
RDebugUtils.currentLine=8781867;
 //BA.debugLineNum = 8781867;BA.debugLine="roundview.CornerRadius_BL=30";
mostCurrent._roundview.setCornerRadius_BL((int) (30));
RDebugUtils.currentLine=8781868;
 //BA.debugLineNum = 8781868;BA.debugLine="roundview.CornerRadius_BR=30";
mostCurrent._roundview.setCornerRadius_BR((int) (30));
RDebugUtils.currentLine=8781869;
 //BA.debugLineNum = 8781869;BA.debugLine="roundview.CornerRadius_TL=30";
mostCurrent._roundview.setCornerRadius_TL((int) (30));
RDebugUtils.currentLine=8781870;
 //BA.debugLineNum = 8781870;BA.debugLine="roundview.CornerRadius_TR=30";
mostCurrent._roundview.setCornerRadius_TR((int) (30));
RDebugUtils.currentLine=8781871;
 //BA.debugLineNum = 8781871;BA.debugLine="roundview.BackgroundColor=0xFFFFD82B";
mostCurrent._roundview.setBackgroundColor((int) (0xffffd82b));
RDebugUtils.currentLine=8781874;
 //BA.debugLineNum = 8781874;BA.debugLine="End Sub";
return "";
}
public static String  _meno_click() throws Exception{
RDebugUtils.currentModule="ac_tselect";
if (Debug.shouldDelegate(mostCurrent.activityBA, "meno_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "meno_click", null));}
RDebugUtils.currentLine=9306112;
 //BA.debugLineNum = 9306112;BA.debugLine="Sub meno_Click";
RDebugUtils.currentLine=9306113;
 //BA.debugLineNum = 9306113;BA.debugLine="mimeno.Initialize(\"mimeno\",Me)";
mostCurrent._mimeno._initialize /*String*/ (null,mostCurrent.activityBA,"mimeno",ac_tselect.getObject());
RDebugUtils.currentLine=9306114;
 //BA.debugLineNum = 9306114;BA.debugLine="mimeno.addpnl";
mostCurrent._mimeno._addpnl /*String*/ (null);
RDebugUtils.currentLine=9306115;
 //BA.debugLineNum = 9306115;BA.debugLine="mimeno.open";
mostCurrent._mimeno._open /*String*/ (null);
RDebugUtils.currentLine=9306116;
 //BA.debugLineNum = 9306116;BA.debugLine="End Sub";
return "";
}
public static String  _prfn_onpoststringerrorlistener(com.reza.sh.fastnet.Error _error,String _tag) throws Exception{
RDebugUtils.currentModule="ac_tselect";
if (Debug.shouldDelegate(mostCurrent.activityBA, "prfn_onpoststringerrorlistener", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "prfn_onpoststringerrorlistener", new Object[] {_error,_tag}));}
RDebugUtils.currentLine=9175040;
 //BA.debugLineNum = 9175040;BA.debugLine="Sub prfn_onPostStringErrorListener(Error As Respon";
RDebugUtils.currentLine=9175042;
 //BA.debugLineNum = 9175042;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=9175043;
 //BA.debugLineNum = 9175043;BA.debugLine="End Sub";
return "";
}
public static String  _prfn_onpoststringoklistener(String _result,String _tag) throws Exception{
RDebugUtils.currentModule="ac_tselect";
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
RDebugUtils.currentLine=9240576;
 //BA.debugLineNum = 9240576;BA.debugLine="Sub prfn_onPostStringOkListener(Result As String";
RDebugUtils.currentLine=9240578;
 //BA.debugLineNum = 9240578;BA.debugLine="Select Tag";
switch (BA.switchObjectToInt(_tag,"iuser","getinsta")) {
case 0: {
RDebugUtils.currentLine=9240580;
 //BA.debugLineNum = 9240580;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=9240581;
 //BA.debugLineNum = 9240581;BA.debugLine="Log(Result)";
anywheresoftware.b4a.keywords.Common.LogImpl("69240581",_result,0);
 break; }
case 1: {
RDebugUtils.currentLine=9240584;
 //BA.debugLineNum = 9240584;BA.debugLine="Log(Result)";
anywheresoftware.b4a.keywords.Common.LogImpl("69240584",_result,0);
RDebugUtils.currentLine=9240585;
 //BA.debugLineNum = 9240585;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=9240586;
 //BA.debugLineNum = 9240586;BA.debugLine="parser.Initialize(Result)";
_parser.Initialize(_result);
RDebugUtils.currentLine=9240587;
 //BA.debugLineNum = 9240587;BA.debugLine="Dim root As List = parser.NextArray";
_root = new anywheresoftware.b4a.objects.collections.List();
_root = _parser.NextArray();
RDebugUtils.currentLine=9240588;
 //BA.debugLineNum = 9240588;BA.debugLine="For Each colroot As Map In root";
_colroot = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group10 = _root;
final int groupLen10 = group10.getSize()
;int index10 = 0;
;
for (; index10 < groupLen10;index10++){
_colroot.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group10.Get(index10)));
RDebugUtils.currentLine=9240589;
 //BA.debugLineNum = 9240589;BA.debugLine="Dim Result As String = colroot.Get(\"result\")";
_result = BA.ObjectToString(_colroot.Get((Object)("result")));
RDebugUtils.currentLine=9240590;
 //BA.debugLineNum = 9240590;BA.debugLine="Dim c_m As String = colroot.Get(\"c_m\")";
_c_m = BA.ObjectToString(_colroot.Get((Object)("c_m")));
RDebugUtils.currentLine=9240591;
 //BA.debugLineNum = 9240591;BA.debugLine="Dim uid As String = colroot.Get(\"uid\")";
_uid = BA.ObjectToString(_colroot.Get((Object)("uid")));
RDebugUtils.currentLine=9240592;
 //BA.debugLineNum = 9240592;BA.debugLine="Dim first_last As String = colroot.Get(\"first_";
_first_last = BA.ObjectToString(_colroot.Get((Object)("first_last")));
RDebugUtils.currentLine=9240593;
 //BA.debugLineNum = 9240593;BA.debugLine="Dim id As String = colroot.Get(\"id\")";
_id = BA.ObjectToString(_colroot.Get((Object)("id")));
RDebugUtils.currentLine=9240594;
 //BA.debugLineNum = 9240594;BA.debugLine="Dim userid As String = colroot.Get(\"userid\")";
_userid = BA.ObjectToString(_colroot.Get((Object)("userid")));
RDebugUtils.currentLine=9240595;
 //BA.debugLineNum = 9240595;BA.debugLine="Dim username As String = colroot.Get(\"username";
_username = BA.ObjectToString(_colroot.Get((Object)("username")));
RDebugUtils.currentLine=9240596;
 //BA.debugLineNum = 9240596;BA.debugLine="Dim c_ch As String = colroot.Get(\"c_ch\")";
_c_ch = BA.ObjectToString(_colroot.Get((Object)("c_ch")));
RDebugUtils.currentLine=9240598;
 //BA.debugLineNum = 9240598;BA.debugLine="Log(c_m)";
anywheresoftware.b4a.keywords.Common.LogImpl("69240598",_c_m,0);
RDebugUtils.currentLine=9240599;
 //BA.debugLineNum = 9240599;BA.debugLine="Dim n_coins=c_m As Long";
_n_coins = (long)(Double.parseDouble(_c_m));
RDebugUtils.currentLine=9240600;
 //BA.debugLineNum = 9240600;BA.debugLine="If n_coins>100 Then";
if (_n_coins>100) { 
RDebugUtils.currentLine=9240601;
 //BA.debugLineNum = 9240601;BA.debugLine="lbl_nums.Text=\"سکه \"&NumberFormat(c_m,3,0)";
mostCurrent._lbl_nums.setText(BA.ObjectToCharSequence("سکه "+anywheresoftware.b4a.keywords.Common.NumberFormat((double)(Double.parseDouble(_c_m)),(int) (3),(int) (0))));
 }else {
RDebugUtils.currentLine=9240603;
 //BA.debugLineNum = 9240603;BA.debugLine="lbl_nums.Text=\"سکه \"&c_m";
mostCurrent._lbl_nums.setText(BA.ObjectToCharSequence("سکه "+_c_m));
 };
RDebugUtils.currentLine=9240607;
 //BA.debugLineNum = 9240607;BA.debugLine="sql1.ExecNonQuery(\"UPDATE tbl_coin set cm='\"&c";
_sql1.ExecNonQuery("UPDATE tbl_coin set cm='"+_c_m+"',cf='"+_c_ch+"' WHERE userid='"+mostCurrent._userid_t+"' ");
 }
};
 break; }
}
;
RDebugUtils.currentLine=9240613;
 //BA.debugLineNum = 9240613;BA.debugLine="End Sub";
return "";
}
}