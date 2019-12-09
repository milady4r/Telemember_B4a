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

public class ac_home extends androidx.appcompat.app.AppCompatActivity implements B4AActivity{
	public static ac_home mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "com.it.fome", "com.it.fome.ac_home");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (ac_home).");
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
		activityBA = new BA(this, layout, processBA, "com.it.fome", "com.it.fome.ac_home");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "com.it.fome.ac_home", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (ac_home) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (ac_home) Resume **");
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
		return ac_home.class;
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
        BA.LogInfo("** Activity (ac_home) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            ac_home mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (ac_home) Resume **");
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
public static String _i_username = "";
public static String _i_pk = "";
public static String _i_cookie = "";
public static String _i_pic = "";
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
public com.it.fome.ac_tcoin _ac_tcoin = null;
public com.it.fome.act_chat _act_chat = null;
public com.it.fome.starter _starter = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="ac_home";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
int _i = 0;
anywheresoftware.b4a.objects.drawable.GradientDrawable _gradient1 = null;
int[] _clrs = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _bkcolor = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _bkcolor_st = null;
anywheresoftware.b4a.objects.PanelWrapper _pnlb1 = null;
RDebugUtils.currentLine=18284544;
 //BA.debugLineNum = 18284544;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=18284546;
 //BA.debugLineNum = 18284546;BA.debugLine="If File.Exists(File.DirInternal,\"instadb.db\")=Fal";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"instadb.db")==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=18284547;
 //BA.debugLineNum = 18284547;BA.debugLine="File.Copy(File.DirAssets,\"instadb.db\",File.DirIn";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"instadb.db",anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"instadb.db");
 };
RDebugUtils.currentLine=18284549;
 //BA.debugLineNum = 18284549;BA.debugLine="If sql1.IsInitialized=False Then";
if (_sql1.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=18284550;
 //BA.debugLineNum = 18284550;BA.debugLine="sql1.Initialize(File.DirInternal,\"instadb.db\",Fa";
_sql1.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"instadb.db",anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=18284555;
 //BA.debugLineNum = 18284555;BA.debugLine="cursor1 = sql1.ExecQuery(\"SELECT * FROM tbl_acc W";
_cursor1.setObject((android.database.Cursor)(_sql1.ExecQuery("SELECT * FROM tbl_acc WHERE soich='1' ")));
RDebugUtils.currentLine=18284556;
 //BA.debugLineNum = 18284556;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=18284557;
 //BA.debugLineNum = 18284557;BA.debugLine="For i=0 To cursor1.RowCount-1";
{
final int step9 = 1;
final int limit9 = (int) (_cursor1.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
RDebugUtils.currentLine=18284558;
 //BA.debugLineNum = 18284558;BA.debugLine="cursor1.Position=i";
_cursor1.setPosition(_i);
RDebugUtils.currentLine=18284559;
 //BA.debugLineNum = 18284559;BA.debugLine="i_cookie=cursor1.GetString(\"cookie\")";
mostCurrent._i_cookie = _cursor1.GetString("cookie");
RDebugUtils.currentLine=18284560;
 //BA.debugLineNum = 18284560;BA.debugLine="i_username=cursor1.GetString(\"username\")";
mostCurrent._i_username = _cursor1.GetString("username");
RDebugUtils.currentLine=18284561;
 //BA.debugLineNum = 18284561;BA.debugLine="i_pk=cursor1.GetString(\"pk\")";
mostCurrent._i_pk = _cursor1.GetString("pk");
RDebugUtils.currentLine=18284562;
 //BA.debugLineNum = 18284562;BA.debugLine="i_pic=cursor1.GetString(\"profile_pic_url\")";
mostCurrent._i_pic = _cursor1.GetString("profile_pic_url");
 }
};
RDebugUtils.currentLine=18284566;
 //BA.debugLineNum = 18284566;BA.debugLine="Dim Gradient1 As GradientDrawable";
_gradient1 = new anywheresoftware.b4a.objects.drawable.GradientDrawable();
RDebugUtils.currentLine=18284567;
 //BA.debugLineNum = 18284567;BA.debugLine="Dim Clrs(6) As Int";
_clrs = new int[(int) (6)];
;
RDebugUtils.currentLine=18284568;
 //BA.debugLineNum = 18284568;BA.debugLine="Clrs(0) = 0xFFFF00AE";
_clrs[(int) (0)] = (int) (0xffff00ae);
RDebugUtils.currentLine=18284569;
 //BA.debugLineNum = 18284569;BA.debugLine="Clrs(1) = 0xFFEE2CB0";
_clrs[(int) (1)] = (int) (0xffee2cb0);
RDebugUtils.currentLine=18284575;
 //BA.debugLineNum = 18284575;BA.debugLine="Clrs(2) = 0xFF0E85F6";
_clrs[(int) (2)] = (int) (0xff0e85f6);
RDebugUtils.currentLine=18284576;
 //BA.debugLineNum = 18284576;BA.debugLine="Clrs(3) = 0xFF2E95F6";
_clrs[(int) (3)] = (int) (0xff2e95f6);
RDebugUtils.currentLine=18284577;
 //BA.debugLineNum = 18284577;BA.debugLine="Clrs(4) = 0xFF409DF6";
_clrs[(int) (4)] = (int) (0xff409df6);
RDebugUtils.currentLine=18284578;
 //BA.debugLineNum = 18284578;BA.debugLine="Clrs(5) = 0xFF57A3EC";
_clrs[(int) (5)] = (int) (0xff57a3ec);
RDebugUtils.currentLine=18284581;
 //BA.debugLineNum = 18284581;BA.debugLine="Gradient1.Initialize(\"TOP_BOTTOM\", Clrs)";
_gradient1.Initialize(BA.getEnumFromString(android.graphics.drawable.GradientDrawable.Orientation.class,"TOP_BOTTOM"),_clrs);
RDebugUtils.currentLine=18284582;
 //BA.debugLineNum = 18284582;BA.debugLine="Activity.Background=Gradient1";
mostCurrent._activity.setBackground((android.graphics.drawable.Drawable)(_gradient1.getObject()));
RDebugUtils.currentLine=18284584;
 //BA.debugLineNum = 18284584;BA.debugLine="Dim bkcolor As ColorDrawable";
_bkcolor = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=18284585;
 //BA.debugLineNum = 18284585;BA.debugLine="bkcolor.Initialize2(Colors.White,15,2dip,Colors.L";
_bkcolor.Initialize2(anywheresoftware.b4a.keywords.Common.Colors.White,(int) (15),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (2)),anywheresoftware.b4a.keywords.Common.Colors.LightGray);
RDebugUtils.currentLine=18284586;
 //BA.debugLineNum = 18284586;BA.debugLine="meno.Initialize(\"meno\")";
mostCurrent._meno.Initialize(mostCurrent.activityBA,"meno");
RDebugUtils.currentLine=18284587;
 //BA.debugLineNum = 18284587;BA.debugLine="meno.TextColor=Colors.DarkGray";
mostCurrent._meno.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.DarkGray);
RDebugUtils.currentLine=18284588;
 //BA.debugLineNum = 18284588;BA.debugLine="meno.TextSize=37";
mostCurrent._meno.setTextSize((float) (37));
RDebugUtils.currentLine=18284589;
 //BA.debugLineNum = 18284589;BA.debugLine="meno.Background=bkcolor";
mostCurrent._meno.setBackground((android.graphics.drawable.Drawable)(_bkcolor.getObject()));
RDebugUtils.currentLine=18284590;
 //BA.debugLineNum = 18284590;BA.debugLine="meno.Typeface=Typeface.MATERIALICONS";
mostCurrent._meno.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.getMATERIALICONS());
RDebugUtils.currentLine=18284591;
 //BA.debugLineNum = 18284591;BA.debugLine="meno.Text=Chr(0xE3C7)";
mostCurrent._meno.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr((int) (0xe3c7))));
RDebugUtils.currentLine=18284592;
 //BA.debugLineNum = 18284592;BA.debugLine="meno.Gravity=Gravity.CENTER_HORIZONTAL+Gravity.CE";
mostCurrent._meno.setGravity((int) (anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL+anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=18284593;
 //BA.debugLineNum = 18284593;BA.debugLine="Activity.AddView(meno,3%x,3%x,12%x,12%x)";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._meno.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (3),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (3),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (12),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (12),mostCurrent.activityBA));
RDebugUtils.currentLine=18284595;
 //BA.debugLineNum = 18284595;BA.debugLine="pnl_coins.Initialize(\"pnl_coins\")";
mostCurrent._pnl_coins.Initialize(mostCurrent.activityBA,"pnl_coins");
RDebugUtils.currentLine=18284596;
 //BA.debugLineNum = 18284596;BA.debugLine="pnl_coins.Visible=False";
mostCurrent._pnl_coins.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=18284597;
 //BA.debugLineNum = 18284597;BA.debugLine="Activity.AddView(pnl_coins,50%x,3%x,50%x,12%x)";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._pnl_coins.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (50),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (3),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (50),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (12),mostCurrent.activityBA));
RDebugUtils.currentLine=18284598;
 //BA.debugLineNum = 18284598;BA.debugLine="roundview.Initialize(pnl_coins)";
mostCurrent._roundview.Initialize(processBA,(android.view.View)(mostCurrent._pnl_coins.getObject()));
RDebugUtils.currentLine=18284599;
 //BA.debugLineNum = 18284599;BA.debugLine="roundview.CornerRadius_BL=10%x";
mostCurrent._roundview.setCornerRadius_BL(anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA));
RDebugUtils.currentLine=18284600;
 //BA.debugLineNum = 18284600;BA.debugLine="roundview.CornerRadius_TL=10%x";
mostCurrent._roundview.setCornerRadius_TL(anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA));
RDebugUtils.currentLine=18284601;
 //BA.debugLineNum = 18284601;BA.debugLine="roundview.BackgroundColor=Colors.White";
mostCurrent._roundview.setBackgroundColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=18284603;
 //BA.debugLineNum = 18284603;BA.debugLine="Dim bkcolor_st As ColorDrawable";
_bkcolor_st = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=18284604;
 //BA.debugLineNum = 18284604;BA.debugLine="bkcolor_st.Initialize2(0xFFC67D00,50,4dip,0x82FFE";
_bkcolor_st.Initialize2((int) (0xffc67d00),(int) (50),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (4)),(int) (0x82ffe300));
RDebugUtils.currentLine=18284606;
 //BA.debugLineNum = 18284606;BA.debugLine="Dim pnlb1 As Panel";
_pnlb1 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=18284607;
 //BA.debugLineNum = 18284607;BA.debugLine="pnlb1.Initialize(\"\")";
_pnlb1.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=18284608;
 //BA.debugLineNum = 18284608;BA.debugLine="pnlb1.Color=0xFFFFC300";
_pnlb1.setColor((int) (0xffffc300));
RDebugUtils.currentLine=18284609;
 //BA.debugLineNum = 18284609;BA.debugLine="pnlb1.Background=bkcolor_st";
_pnlb1.setBackground((android.graphics.drawable.Drawable)(_bkcolor_st.getObject()));
RDebugUtils.currentLine=18284610;
 //BA.debugLineNum = 18284610;BA.debugLine="pnl_coins.AddView(pnlb1,pnl_coins.Width-11%x,1%x,";
mostCurrent._pnl_coins.AddView((android.view.View)(_pnlb1.getObject()),(int) (mostCurrent._pnl_coins.getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (11),mostCurrent.activityBA)),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (1),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA),(int) (mostCurrent._pnl_coins.getHeight()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (2),mostCurrent.activityBA)));
RDebugUtils.currentLine=18284612;
 //BA.debugLineNum = 18284612;BA.debugLine="lbl_icon.Initialize(\"lbl_icon\")";
mostCurrent._lbl_icon.Initialize(mostCurrent.activityBA,"lbl_icon");
RDebugUtils.currentLine=18284613;
 //BA.debugLineNum = 18284613;BA.debugLine="lbl_icon.SetBackgroundImage(LoadBitmap(File.DirAs";
mostCurrent._lbl_icon.SetBackgroundImageNew((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"coins.png").getObject()));
RDebugUtils.currentLine=18284614;
 //BA.debugLineNum = 18284614;BA.debugLine="pnl_coins.AddView(lbl_icon,pnl_coins.Width-9%x,pn";
mostCurrent._pnl_coins.AddView((android.view.View)(mostCurrent._lbl_icon.getObject()),(int) (mostCurrent._pnl_coins.getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (9),mostCurrent.activityBA)),(int) (mostCurrent._pnl_coins.getHeight()/(double)2/(double)2),(int) (mostCurrent._pnl_coins.getHeight()/(double)2),(int) (mostCurrent._pnl_coins.getHeight()/(double)2));
RDebugUtils.currentLine=18284616;
 //BA.debugLineNum = 18284616;BA.debugLine="lbl_nums.Initialize(\"lbl_nums\")";
mostCurrent._lbl_nums.Initialize(mostCurrent.activityBA,"lbl_nums");
RDebugUtils.currentLine=18284617;
 //BA.debugLineNum = 18284617;BA.debugLine="lbl_nums.TextColor=Colors.DarkGray";
mostCurrent._lbl_nums.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.DarkGray);
RDebugUtils.currentLine=18284618;
 //BA.debugLineNum = 18284618;BA.debugLine="lbl_nums.TextSize=20";
mostCurrent._lbl_nums.setTextSize((float) (20));
RDebugUtils.currentLine=18284619;
 //BA.debugLineNum = 18284619;BA.debugLine="lbl_nums.Typeface=Typeface.LoadFromAssets(\"iran_s";
mostCurrent._lbl_nums.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("iran_sans.ttf"));
RDebugUtils.currentLine=18284620;
 //BA.debugLineNum = 18284620;BA.debugLine="lbl_nums.Text=0&\" سکه\"";
mostCurrent._lbl_nums.setText(BA.ObjectToCharSequence(BA.NumberToString(0)+" سکه"));
RDebugUtils.currentLine=18284621;
 //BA.debugLineNum = 18284621;BA.debugLine="lbl_nums.Gravity=Gravity.CENTER_VERTICAL+Gravity.";
mostCurrent._lbl_nums.setGravity((int) (anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL+anywheresoftware.b4a.keywords.Common.Gravity.RIGHT));
RDebugUtils.currentLine=18284622;
 //BA.debugLineNum = 18284622;BA.debugLine="pnl_coins.AddView(lbl_nums,2%x,0,pnl_coins.Width-";
mostCurrent._pnl_coins.AddView((android.view.View)(mostCurrent._lbl_nums.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (2),mostCurrent.activityBA),(int) (0),(int) (mostCurrent._pnl_coins.getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (15),mostCurrent.activityBA)),mostCurrent._pnl_coins.getHeight());
RDebugUtils.currentLine=18284624;
 //BA.debugLineNum = 18284624;BA.debugLine="LV.Initializer(\"LV\").ListView.Build";
mostCurrent._lv.Initializer(mostCurrent.activityBA,"LV").ListView().Build();
RDebugUtils.currentLine=18284625;
 //BA.debugLineNum = 18284625;BA.debugLine="Activity.AddView(LV,0,10%y,100%x,90%y)";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._lv.getObject()),(int) (0),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (10),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (90),mostCurrent.activityBA));
RDebugUtils.currentLine=18284626;
 //BA.debugLineNum = 18284626;BA.debugLine="LV.Ripple.Color(0xFF5E23DE).Alpha(0.2f).Duration(";
mostCurrent._lv.Ripple().Color((int) (0xff5e23de)).Alpha((float) (0.2f)).Duration((int) (350));
RDebugUtils.currentLine=18284627;
 //BA.debugLineNum = 18284627;BA.debugLine="LV.Show";
mostCurrent._lv.Show();
RDebugUtils.currentLine=18284634;
 //BA.debugLineNum = 18284634;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="ac_home";
RDebugUtils.currentLine=18415616;
 //BA.debugLineNum = 18415616;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=18415618;
 //BA.debugLineNum = 18415618;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="ac_home";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=18350080;
 //BA.debugLineNum = 18350080;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=18350082;
 //BA.debugLineNum = 18350082;BA.debugLine="End Sub";
return "";
}
public static int  _lv_getitemcount() throws Exception{
RDebugUtils.currentModule="ac_home";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lv_getitemcount", false))
	 {return ((Integer) Debug.delegate(mostCurrent.activityBA, "lv_getitemcount", null));}
RDebugUtils.currentLine=18612224;
 //BA.debugLineNum = 18612224;BA.debugLine="Sub LV_GetItemCount As Int 								        '$ Item";
RDebugUtils.currentLine=18612225;
 //BA.debugLineNum = 18612225;BA.debugLine="Return 2 'ItemList.Size";
if (true) return (int) (2);
RDebugUtils.currentLine=18612226;
 //BA.debugLineNum = 18612226;BA.debugLine="End Sub";
return 0;
}
public static void  _lv_itemclick(anywheresoftware.b4a.objects.PanelWrapper _clickeditem,int _position) throws Exception{
RDebugUtils.currentModule="ac_home";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lv_itemclick", false))
	 {Debug.delegate(mostCurrent.activityBA, "lv_itemclick", new Object[] {_clickeditem,_position}); return;}
ResumableSub_LV_ItemClick rsub = new ResumableSub_LV_ItemClick(null,_clickeditem,_position);
rsub.resume(processBA, null);
}
public static class ResumableSub_LV_ItemClick extends BA.ResumableSub {
public ResumableSub_LV_ItemClick(com.it.fome.ac_home parent,anywheresoftware.b4a.objects.PanelWrapper _clickeditem,int _position) {
this.parent = parent;
this._clickeditem = _clickeditem;
this._position = _position;
}
com.it.fome.ac_home parent;
anywheresoftware.b4a.objects.PanelWrapper _clickeditem;
int _position;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ac_home";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=18677761;
 //BA.debugLineNum = 18677761;BA.debugLine="Sleep(0)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ac_home", "lv_itemclick"),(int) (0));
this.state = 23;
return;
case 23:
//C
this.state = 1;
;
RDebugUtils.currentLine=18677762;
 //BA.debugLineNum = 18677762;BA.debugLine="Select Position";
if (true) break;

case 1:
//select
this.state = 22;
switch (_position) {
case 0: {
this.state = 3;
if (true) break;
}
case 1: {
this.state = 11;
if (true) break;
}
case 2: {
this.state = 19;
if (true) break;
}
case 3: {
this.state = 21;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=18677764;
 //BA.debugLineNum = 18677764;BA.debugLine="cursor1 = sql1.ExecQuery(\"SELECT * FROM tbl_acc";
parent._cursor1.setObject((android.database.Cursor)(parent._sql1.ExecQuery("SELECT * FROM tbl_acc")));
RDebugUtils.currentLine=18677765;
 //BA.debugLineNum = 18677765;BA.debugLine="If cursor1.RowCount=0 Then";
if (true) break;

case 4:
//if
this.state = 9;
if (parent._cursor1.getRowCount()==0) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
RDebugUtils.currentLine=18677766;
 //BA.debugLineNum = 18677766;BA.debugLine="Log(\"nist\")";
anywheresoftware.b4a.keywords.Common.LogImpl("618677766","nist",0);
RDebugUtils.currentLine=18677768;
 //BA.debugLineNum = 18677768;BA.debugLine="SetAnimation(\"anim3\", \"anim4\")";
_setanimation("anim3","anim4");
RDebugUtils.currentLine=18677770;
 //BA.debugLineNum = 18677770;BA.debugLine="Activity.Finish";
parent.mostCurrent._activity.Finish();
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=18677772;
 //BA.debugLineNum = 18677772;BA.debugLine="Log(\"hast\")";
anywheresoftware.b4a.keywords.Common.LogImpl("618677772","hast",0);
RDebugUtils.currentLine=18677775;
 //BA.debugLineNum = 18677775;BA.debugLine="SetAnimation(\"anim3\", \"anim4\")";
_setanimation("anim3","anim4");
RDebugUtils.currentLine=18677777;
 //BA.debugLineNum = 18677777;BA.debugLine="Activity.Finish";
parent.mostCurrent._activity.Finish();
 if (true) break;

case 9:
//C
this.state = 22;
;
RDebugUtils.currentLine=18677782;
 //BA.debugLineNum = 18677782;BA.debugLine="SetAnimation(\"anim3\", \"anim4\")";
_setanimation("anim3","anim4");
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=18677785;
 //BA.debugLineNum = 18677785;BA.debugLine="cursor1 = sql1.ExecQuery(\"SELECT * FROM tbl_tel";
parent._cursor1.setObject((android.database.Cursor)(parent._sql1.ExecQuery("SELECT * FROM tbl_tele WHERE soich='1'")));
RDebugUtils.currentLine=18677786;
 //BA.debugLineNum = 18677786;BA.debugLine="If cursor1.RowCount=0 Then";
if (true) break;

case 12:
//if
this.state = 17;
if (parent._cursor1.getRowCount()==0) { 
this.state = 14;
}else {
this.state = 16;
}if (true) break;

case 14:
//C
this.state = 17;
RDebugUtils.currentLine=18677787;
 //BA.debugLineNum = 18677787;BA.debugLine="Log(\"nist\")";
anywheresoftware.b4a.keywords.Common.LogImpl("618677787","nist",0);
RDebugUtils.currentLine=18677788;
 //BA.debugLineNum = 18677788;BA.debugLine="StartActivity(ac_telelogin)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._ac_telelogin.getObject()));
RDebugUtils.currentLine=18677789;
 //BA.debugLineNum = 18677789;BA.debugLine="SetAnimation(\"anim3\", \"anim4\")";
_setanimation("anim3","anim4");
RDebugUtils.currentLine=18677791;
 //BA.debugLineNum = 18677791;BA.debugLine="Activity.Finish";
parent.mostCurrent._activity.Finish();
 if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=18677793;
 //BA.debugLineNum = 18677793;BA.debugLine="Log(\"hast\")";
anywheresoftware.b4a.keywords.Common.LogImpl("618677793","hast",0);
RDebugUtils.currentLine=18677795;
 //BA.debugLineNum = 18677795;BA.debugLine="StartActivity(ac_telelogin)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._ac_telelogin.getObject()));
RDebugUtils.currentLine=18677796;
 //BA.debugLineNum = 18677796;BA.debugLine="SetAnimation(\"anim3\", \"anim4\")";
_setanimation("anim3","anim4");
RDebugUtils.currentLine=18677798;
 //BA.debugLineNum = 18677798;BA.debugLine="Activity.Finish";
parent.mostCurrent._activity.Finish();
 if (true) break;

case 17:
//C
this.state = 22;
;
RDebugUtils.currentLine=18677802;
 //BA.debugLineNum = 18677802;BA.debugLine="SetAnimation(\"anim2\", \"anim1\")";
_setanimation("anim2","anim1");
 if (true) break;

case 19:
//C
this.state = 22;
 if (true) break;

case 21:
//C
this.state = 22;
 if (true) break;

case 22:
//C
this.state = -1;
;
RDebugUtils.currentLine=18677816;
 //BA.debugLineNum = 18677816;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _setanimation(String _inanimation,String _outanimation) throws Exception{
RDebugUtils.currentModule="ac_home";
if (Debug.shouldDelegate(mostCurrent.activityBA, "setanimation", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "setanimation", new Object[] {_inanimation,_outanimation}));}
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
String _package = "";
int _in = 0;
int _out = 0;
RDebugUtils.currentLine=18743296;
 //BA.debugLineNum = 18743296;BA.debugLine="Sub SetAnimation(InAnimation As String, OutAnimati";
RDebugUtils.currentLine=18743297;
 //BA.debugLineNum = 18743297;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=18743298;
 //BA.debugLineNum = 18743298;BA.debugLine="Dim package As String";
_package = "";
RDebugUtils.currentLine=18743299;
 //BA.debugLineNum = 18743299;BA.debugLine="Dim In, out As Int";
_in = 0;
_out = 0;
RDebugUtils.currentLine=18743300;
 //BA.debugLineNum = 18743300;BA.debugLine="package = r.GetStaticField(\"anywheresoftware.b4a.";
_package = BA.ObjectToString(_r.GetStaticField("anywheresoftware.b4a.BA","packageName"));
RDebugUtils.currentLine=18743301;
 //BA.debugLineNum = 18743301;BA.debugLine="In = r.GetStaticField(package & \".R$anim\", InAnim";
_in = (int)(BA.ObjectToNumber(_r.GetStaticField(_package+".R$anim",_inanimation)));
RDebugUtils.currentLine=18743302;
 //BA.debugLineNum = 18743302;BA.debugLine="out = r.GetStaticField(package & \".R$anim\", OutAn";
_out = (int)(BA.ObjectToNumber(_r.GetStaticField(_package+".R$anim",_outanimation)));
RDebugUtils.currentLine=18743303;
 //BA.debugLineNum = 18743303;BA.debugLine="r.Target = r.GetActivity";
_r.Target = (Object)(_r.GetActivity(processBA));
RDebugUtils.currentLine=18743304;
 //BA.debugLineNum = 18743304;BA.debugLine="r.RunMethod4(\"overridePendingTransition\", Array A";
_r.RunMethod4("overridePendingTransition",new Object[]{(Object)(_in),(Object)(_out)},new String[]{"java.lang.int","java.lang.int"});
RDebugUtils.currentLine=18743305;
 //BA.debugLineNum = 18743305;BA.debugLine="End Sub";
return "";
}
public static String  _lv_onbindviewholder(anywheresoftware.b4a.objects.PanelWrapper _parent,int _position) throws Exception{
RDebugUtils.currentModule="ac_home";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lv_onbindviewholder", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "lv_onbindviewholder", new Object[] {_parent,_position}));}
anywheresoftware.b4a.objects.PanelWrapper _pnl_main = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl_itemicon = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl_name = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl_notis = null;
RDebugUtils.currentLine=18546688;
 //BA.debugLineNum = 18546688;BA.debugLine="Sub LV_onBindViewHolder (Parent As Panel, Position";
RDebugUtils.currentLine=18546689;
 //BA.debugLineNum = 18546689;BA.debugLine="Dim pnl_main = Parent.GetView(0) As Panel";
_pnl_main = new anywheresoftware.b4a.objects.PanelWrapper();
_pnl_main.setObject((android.view.ViewGroup)(_parent.GetView((int) (0)).getObject()));
RDebugUtils.currentLine=18546690;
 //BA.debugLineNum = 18546690;BA.debugLine="Dim lbl_itemicon = pnl_main.GetView(0) As Label";
_lbl_itemicon = new anywheresoftware.b4a.objects.LabelWrapper();
_lbl_itemicon.setObject((android.widget.TextView)(_pnl_main.GetView((int) (0)).getObject()));
RDebugUtils.currentLine=18546691;
 //BA.debugLineNum = 18546691;BA.debugLine="Dim lbl_name = pnl_main.GetView(1) As Label";
_lbl_name = new anywheresoftware.b4a.objects.LabelWrapper();
_lbl_name.setObject((android.widget.TextView)(_pnl_main.GetView((int) (1)).getObject()));
RDebugUtils.currentLine=18546693;
 //BA.debugLineNum = 18546693;BA.debugLine="Dim lbl_notis = pnl_main.GetView(2) As Label";
_lbl_notis = new anywheresoftware.b4a.objects.LabelWrapper();
_lbl_notis.setObject((android.widget.TextView)(_pnl_main.GetView((int) (2)).getObject()));
RDebugUtils.currentLine=18546695;
 //BA.debugLineNum = 18546695;BA.debugLine="Select Position";
switch (_position) {
case 0: {
RDebugUtils.currentLine=18546697;
 //BA.debugLineNum = 18546697;BA.debugLine="lbl_name.Text=\"اینستاگرام\"";
_lbl_name.setText(BA.ObjectToCharSequence("اینستاگرام"));
RDebugUtils.currentLine=18546698;
 //BA.debugLineNum = 18546698;BA.debugLine="lbl_notis.Text=\"فالوور-لایک-کامنت-ویو\"";
_lbl_notis.setText(BA.ObjectToCharSequence("فالوور-لایک-کامنت-ویو"));
RDebugUtils.currentLine=18546699;
 //BA.debugLineNum = 18546699;BA.debugLine="lbl_itemicon.Text=Chr(0xF16D)";
_lbl_itemicon.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr((int) (0xf16d))));
 break; }
case 1: {
RDebugUtils.currentLine=18546702;
 //BA.debugLineNum = 18546702;BA.debugLine="lbl_name.Text=\"تلگرام\"";
_lbl_name.setText(BA.ObjectToCharSequence("تلگرام"));
RDebugUtils.currentLine=18546703;
 //BA.debugLineNum = 18546703;BA.debugLine="lbl_notis.Text=\"ممبر - بازدید\"";
_lbl_notis.setText(BA.ObjectToCharSequence("ممبر - بازدید"));
RDebugUtils.currentLine=18546704;
 //BA.debugLineNum = 18546704;BA.debugLine="lbl_itemicon.Text=Chr(0xF2C6)";
_lbl_itemicon.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr((int) (0xf2c6))));
RDebugUtils.currentLine=18546705;
 //BA.debugLineNum = 18546705;BA.debugLine="lbl_itemicon.TextColor=0xFF0099FF";
_lbl_itemicon.setTextColor((int) (0xff0099ff));
 break; }
case 2: {
RDebugUtils.currentLine=18546707;
 //BA.debugLineNum = 18546707;BA.debugLine="lbl_name.Text=\"آنفالووریاب\"";
_lbl_name.setText(BA.ObjectToCharSequence("آنفالووریاب"));
RDebugUtils.currentLine=18546708;
 //BA.debugLineNum = 18546708;BA.debugLine="lbl_notis.Text=\"چه کسانی شما رو آنفالو کرده اند";
_lbl_notis.setText(BA.ObjectToCharSequence("چه کسانی شما رو آنفالو کرده اند؟"));
RDebugUtils.currentLine=18546709;
 //BA.debugLineNum = 18546709;BA.debugLine="lbl_itemicon.Text=Chr(0xE5CD)";
_lbl_itemicon.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr((int) (0xe5cd))));
 break; }
case 3: {
RDebugUtils.currentLine=18546711;
 //BA.debugLineNum = 18546711;BA.debugLine="lbl_name.Text=\"سفارشات\"";
_lbl_name.setText(BA.ObjectToCharSequence("سفارشات"));
RDebugUtils.currentLine=18546712;
 //BA.debugLineNum = 18546712;BA.debugLine="lbl_notis.Text=\"پیگیری سفارشات\"";
_lbl_notis.setText(BA.ObjectToCharSequence("پیگیری سفارشات"));
RDebugUtils.currentLine=18546713;
 //BA.debugLineNum = 18546713;BA.debugLine="lbl_itemicon.Text=Chr(0xE06D)";
_lbl_itemicon.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr((int) (0xe06d))));
 break; }
}
;
RDebugUtils.currentLine=18546715;
 //BA.debugLineNum = 18546715;BA.debugLine="lbl_notis.Top=pnl_main.Height-10%x";
_lbl_notis.setTop((int) (_pnl_main.getHeight()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA)));
RDebugUtils.currentLine=18546716;
 //BA.debugLineNum = 18546716;BA.debugLine="Parent.Height=pnl_main.Height+10%x";
_parent.setHeight((int) (_pnl_main.getHeight()+anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA)));
RDebugUtils.currentLine=18546717;
 //BA.debugLineNum = 18546717;BA.debugLine="End Sub";
return "";
}
public static String  _lv_oncreateviewholder(anywheresoftware.b4a.objects.PanelWrapper _parent,int _viewtype) throws Exception{
RDebugUtils.currentModule="ac_home";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lv_oncreateviewholder", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "lv_oncreateviewholder", new Object[] {_parent,_viewtype}));}
anywheresoftware.b4a.objects.drawable.ColorDrawable _bkcolors = null;
anywheresoftware.b4a.objects.PanelWrapper _pnl_main = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl_itemicon = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl_name = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _bkcolor = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl_notis = null;
RDebugUtils.currentLine=18481152;
 //BA.debugLineNum = 18481152;BA.debugLine="Sub LV_onCreateViewHolder (Parent As Panel, ViewTy";
RDebugUtils.currentLine=18481154;
 //BA.debugLineNum = 18481154;BA.debugLine="Parent.Color=Colors.Transparent";
_parent.setColor(anywheresoftware.b4a.keywords.Common.Colors.Transparent);
RDebugUtils.currentLine=18481156;
 //BA.debugLineNum = 18481156;BA.debugLine="Dim bkcolors As ColorDrawable";
_bkcolors = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=18481157;
 //BA.debugLineNum = 18481157;BA.debugLine="bkcolors.Initialize(Colors.White,3%x)";
_bkcolors.Initialize(anywheresoftware.b4a.keywords.Common.Colors.White,anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (3),mostCurrent.activityBA));
RDebugUtils.currentLine=18481159;
 //BA.debugLineNum = 18481159;BA.debugLine="Dim pnl_main As Panel : pnl_main.Initialize(\"pnl_";
_pnl_main = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=18481159;
 //BA.debugLineNum = 18481159;BA.debugLine="Dim pnl_main As Panel : pnl_main.Initialize(\"pnl_";
_pnl_main.Initialize(mostCurrent.activityBA,"pnl_main");
RDebugUtils.currentLine=18481160;
 //BA.debugLineNum = 18481160;BA.debugLine="pnl_main.Color=Colors.White";
_pnl_main.setColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=18481161;
 //BA.debugLineNum = 18481161;BA.debugLine="pnl_main.Background=bkcolors";
_pnl_main.setBackground((android.graphics.drawable.Drawable)(_bkcolors.getObject()));
RDebugUtils.currentLine=18481162;
 //BA.debugLineNum = 18481162;BA.debugLine="Parent.AddView(pnl_main,5%x,2%x,90%x,35%x)";
_parent.AddView((android.view.View)(_pnl_main.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (2),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (90),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (35),mostCurrent.activityBA));
RDebugUtils.currentLine=18481164;
 //BA.debugLineNum = 18481164;BA.debugLine="Dim lbl_itemicon As Label";
_lbl_itemicon = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=18481165;
 //BA.debugLineNum = 18481165;BA.debugLine="lbl_itemicon.Initialize(\"lbl_itemicon\")";
_lbl_itemicon.Initialize(mostCurrent.activityBA,"lbl_itemicon");
RDebugUtils.currentLine=18481166;
 //BA.debugLineNum = 18481166;BA.debugLine="lbl_itemicon.TextColor=0xFFD305BA";
_lbl_itemicon.setTextColor((int) (0xffd305ba));
RDebugUtils.currentLine=18481167;
 //BA.debugLineNum = 18481167;BA.debugLine="lbl_itemicon.TextSize=40";
_lbl_itemicon.setTextSize((float) (40));
RDebugUtils.currentLine=18481168;
 //BA.debugLineNum = 18481168;BA.debugLine="lbl_itemicon.Typeface=Typeface.FONTAWESOME";
_lbl_itemicon.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.getFONTAWESOME());
RDebugUtils.currentLine=18481169;
 //BA.debugLineNum = 18481169;BA.debugLine="lbl_itemicon.Gravity=Gravity.CENTER_VERTICAL+Grav";
_lbl_itemicon.setGravity((int) (anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL+anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL));
RDebugUtils.currentLine=18481170;
 //BA.debugLineNum = 18481170;BA.debugLine="pnl_main.AddView(lbl_itemicon,0,3%x,pnl_main.Widt";
_pnl_main.AddView((android.view.View)(_lbl_itemicon.getObject()),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (3),mostCurrent.activityBA),_pnl_main.getWidth(),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (17),mostCurrent.activityBA));
RDebugUtils.currentLine=18481172;
 //BA.debugLineNum = 18481172;BA.debugLine="Dim lbl_name As Label";
_lbl_name = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=18481173;
 //BA.debugLineNum = 18481173;BA.debugLine="lbl_name.Initialize(\"lbl_name\")";
_lbl_name.Initialize(mostCurrent.activityBA,"lbl_name");
RDebugUtils.currentLine=18481174;
 //BA.debugLineNum = 18481174;BA.debugLine="lbl_name.TextColor=Colors.DarkGray";
_lbl_name.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.DarkGray);
RDebugUtils.currentLine=18481175;
 //BA.debugLineNum = 18481175;BA.debugLine="lbl_name.TextSize=17";
_lbl_name.setTextSize((float) (17));
RDebugUtils.currentLine=18481176;
 //BA.debugLineNum = 18481176;BA.debugLine="lbl_name.Typeface=Typeface.LoadFromAssets(\"iran_s";
_lbl_name.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("iran_sans.ttf"));
RDebugUtils.currentLine=18481177;
 //BA.debugLineNum = 18481177;BA.debugLine="lbl_name.Gravity=Gravity.CENTER_VERTICAL+Gravity.";
_lbl_name.setGravity((int) (anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL+anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL));
RDebugUtils.currentLine=18481178;
 //BA.debugLineNum = 18481178;BA.debugLine="pnl_main.AddView(lbl_name,0,lbl_itemicon.Top+lbl_";
_pnl_main.AddView((android.view.View)(_lbl_name.getObject()),(int) (0),(int) (_lbl_itemicon.getTop()+_lbl_itemicon.getHeight()),_pnl_main.getWidth(),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (11),mostCurrent.activityBA));
RDebugUtils.currentLine=18481180;
 //BA.debugLineNum = 18481180;BA.debugLine="Dim bkcolor As ColorDrawable";
_bkcolor = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=18481181;
 //BA.debugLineNum = 18481181;BA.debugLine="bkcolor.Initialize(0xFFFFD82B,30)";
_bkcolor.Initialize((int) (0xffffd82b),(int) (30));
RDebugUtils.currentLine=18481182;
 //BA.debugLineNum = 18481182;BA.debugLine="Dim lbl_notis As Label";
_lbl_notis = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=18481183;
 //BA.debugLineNum = 18481183;BA.debugLine="lbl_notis.Initialize(\"lbl_notis\")";
_lbl_notis.Initialize(mostCurrent.activityBA,"lbl_notis");
RDebugUtils.currentLine=18481184;
 //BA.debugLineNum = 18481184;BA.debugLine="lbl_notis.TextColor=Colors.DarkGray";
_lbl_notis.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.DarkGray);
RDebugUtils.currentLine=18481185;
 //BA.debugLineNum = 18481185;BA.debugLine="lbl_notis.TextSize=17";
_lbl_notis.setTextSize((float) (17));
RDebugUtils.currentLine=18481186;
 //BA.debugLineNum = 18481186;BA.debugLine="lbl_notis.Typeface=Typeface.LoadFromAssets(\"iran_";
_lbl_notis.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("iran_sans.ttf"));
RDebugUtils.currentLine=18481187;
 //BA.debugLineNum = 18481187;BA.debugLine="lbl_notis.Text=\"با قیمت مناسب و کیفیت تضمینی !\"";
_lbl_notis.setText(BA.ObjectToCharSequence("با قیمت مناسب و کیفیت تضمینی !"));
RDebugUtils.currentLine=18481188;
 //BA.debugLineNum = 18481188;BA.debugLine="lbl_notis.Gravity=Gravity.CENTER_VERTICAL+Gravity";
_lbl_notis.setGravity((int) (anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL+anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL));
RDebugUtils.currentLine=18481190;
 //BA.debugLineNum = 18481190;BA.debugLine="pnl_main.AddView(lbl_notis,1%x,lbl_name.Top+lbl_n";
_pnl_main.AddView((android.view.View)(_lbl_notis.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (1),mostCurrent.activityBA),(int) (_lbl_name.getTop()+_lbl_name.getHeight()),(int) (_pnl_main.getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (2),mostCurrent.activityBA)),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (9),mostCurrent.activityBA));
RDebugUtils.currentLine=18481192;
 //BA.debugLineNum = 18481192;BA.debugLine="lbl_name.Text=\"فالوور بگیر\"";
_lbl_name.setText(BA.ObjectToCharSequence("فالوور بگیر"));
RDebugUtils.currentLine=18481193;
 //BA.debugLineNum = 18481193;BA.debugLine="lbl_itemicon.Text=Chr(0xE8D3)";
_lbl_itemicon.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr((int) (0xe8d3))));
RDebugUtils.currentLine=18481195;
 //BA.debugLineNum = 18481195;BA.debugLine="roundview.Initialize(lbl_notis)";
mostCurrent._roundview.Initialize(processBA,(android.view.View)(_lbl_notis.getObject()));
RDebugUtils.currentLine=18481196;
 //BA.debugLineNum = 18481196;BA.debugLine="roundview.CornerRadius_BL=30";
mostCurrent._roundview.setCornerRadius_BL((int) (30));
RDebugUtils.currentLine=18481197;
 //BA.debugLineNum = 18481197;BA.debugLine="roundview.CornerRadius_BR=30";
mostCurrent._roundview.setCornerRadius_BR((int) (30));
RDebugUtils.currentLine=18481198;
 //BA.debugLineNum = 18481198;BA.debugLine="roundview.CornerRadius_TL=30";
mostCurrent._roundview.setCornerRadius_TL((int) (30));
RDebugUtils.currentLine=18481199;
 //BA.debugLineNum = 18481199;BA.debugLine="roundview.CornerRadius_TR=30";
mostCurrent._roundview.setCornerRadius_TR((int) (30));
RDebugUtils.currentLine=18481200;
 //BA.debugLineNum = 18481200;BA.debugLine="roundview.BackgroundColor=0xFFFFD82B";
mostCurrent._roundview.setBackgroundColor((int) (0xffffd82b));
RDebugUtils.currentLine=18481201;
 //BA.debugLineNum = 18481201;BA.debugLine="pnl_main.Height=lbl_notis.Top+lbl_notis.Height+5%";
_pnl_main.setHeight((int) (_lbl_notis.getTop()+_lbl_notis.getHeight()+anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA)));
RDebugUtils.currentLine=18481202;
 //BA.debugLineNum = 18481202;BA.debugLine="End Sub";
return "";
}
public static String  _meno_click() throws Exception{
RDebugUtils.currentModule="ac_home";
if (Debug.shouldDelegate(mostCurrent.activityBA, "meno_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "meno_click", null));}
com.it.fome.mi_meno _mimeno = null;
RDebugUtils.currentLine=19005440;
 //BA.debugLineNum = 19005440;BA.debugLine="Sub meno_Click";
RDebugUtils.currentLine=19005441;
 //BA.debugLineNum = 19005441;BA.debugLine="Dim mimeno As mi_meno";
_mimeno = new com.it.fome.mi_meno();
RDebugUtils.currentLine=19005443;
 //BA.debugLineNum = 19005443;BA.debugLine="mimeno.Initialize(\"mimeno\",Me)";
_mimeno._initialize /*String*/ (null,mostCurrent.activityBA,"mimeno",ac_home.getObject());
RDebugUtils.currentLine=19005444;
 //BA.debugLineNum = 19005444;BA.debugLine="mimeno.addpnl";
_mimeno._addpnl /*String*/ (null);
RDebugUtils.currentLine=19005445;
 //BA.debugLineNum = 19005445;BA.debugLine="mimeno.open";
_mimeno._open /*String*/ (null);
RDebugUtils.currentLine=19005446;
 //BA.debugLineNum = 19005446;BA.debugLine="End Sub";
return "";
}
public static String  _prfn_onpoststringerrorlistener(com.reza.sh.fastnet.Error _error,String _tag) throws Exception{
RDebugUtils.currentModule="ac_home";
if (Debug.shouldDelegate(mostCurrent.activityBA, "prfn_onpoststringerrorlistener", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "prfn_onpoststringerrorlistener", new Object[] {_error,_tag}));}
RDebugUtils.currentLine=18874368;
 //BA.debugLineNum = 18874368;BA.debugLine="Sub prfn_onPostStringErrorListener(Error As Respon";
RDebugUtils.currentLine=18874370;
 //BA.debugLineNum = 18874370;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=18874371;
 //BA.debugLineNum = 18874371;BA.debugLine="End Sub";
return "";
}
public static String  _prfn_onpoststringoklistener(String _result,String _tag) throws Exception{
RDebugUtils.currentModule="ac_home";
if (Debug.shouldDelegate(mostCurrent.activityBA, "prfn_onpoststringoklistener", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "prfn_onpoststringoklistener", new Object[] {_result,_tag}));}
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.List _root = null;
anywheresoftware.b4a.objects.collections.Map _colroot = null;
String _c_m = "";
String _uid = "";
String _id = "";
String _c_f = "";
String _pic = "";
String _userid = "";
String _username = "";
long _n_coins = 0L;
RDebugUtils.currentLine=18939904;
 //BA.debugLineNum = 18939904;BA.debugLine="Sub prfn_onPostStringOkListener(Result As String";
RDebugUtils.currentLine=18939906;
 //BA.debugLineNum = 18939906;BA.debugLine="Select Tag";
switch (BA.switchObjectToInt(_tag,"iuser","getinsta")) {
case 0: {
RDebugUtils.currentLine=18939908;
 //BA.debugLineNum = 18939908;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=18939909;
 //BA.debugLineNum = 18939909;BA.debugLine="Log(Result)";
anywheresoftware.b4a.keywords.Common.LogImpl("618939909",_result,0);
 break; }
case 1: {
RDebugUtils.currentLine=18939912;
 //BA.debugLineNum = 18939912;BA.debugLine="Log(Result)";
anywheresoftware.b4a.keywords.Common.LogImpl("618939912",_result,0);
RDebugUtils.currentLine=18939913;
 //BA.debugLineNum = 18939913;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=18939914;
 //BA.debugLineNum = 18939914;BA.debugLine="parser.Initialize(Result)";
_parser.Initialize(_result);
RDebugUtils.currentLine=18939915;
 //BA.debugLineNum = 18939915;BA.debugLine="Dim root As List = parser.NextArray";
_root = new anywheresoftware.b4a.objects.collections.List();
_root = _parser.NextArray();
RDebugUtils.currentLine=18939916;
 //BA.debugLineNum = 18939916;BA.debugLine="For Each colroot As Map In root";
_colroot = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group10 = _root;
final int groupLen10 = group10.getSize()
;int index10 = 0;
;
for (; index10 < groupLen10;index10++){
_colroot.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group10.Get(index10)));
RDebugUtils.currentLine=18939917;
 //BA.debugLineNum = 18939917;BA.debugLine="Dim Result As String = colroot.Get(\"result\")";
_result = BA.ObjectToString(_colroot.Get((Object)("result")));
RDebugUtils.currentLine=18939918;
 //BA.debugLineNum = 18939918;BA.debugLine="Dim c_m As String = colroot.Get(\"c_m\")";
_c_m = BA.ObjectToString(_colroot.Get((Object)("c_m")));
RDebugUtils.currentLine=18939919;
 //BA.debugLineNum = 18939919;BA.debugLine="Dim uid As String = colroot.Get(\"uid\")";
_uid = BA.ObjectToString(_colroot.Get((Object)("uid")));
RDebugUtils.currentLine=18939920;
 //BA.debugLineNum = 18939920;BA.debugLine="Dim id As String = colroot.Get(\"id\")";
_id = BA.ObjectToString(_colroot.Get((Object)("id")));
RDebugUtils.currentLine=18939921;
 //BA.debugLineNum = 18939921;BA.debugLine="Dim c_f As String = colroot.Get(\"c_f\")";
_c_f = BA.ObjectToString(_colroot.Get((Object)("c_f")));
RDebugUtils.currentLine=18939922;
 //BA.debugLineNum = 18939922;BA.debugLine="Dim pic As String = colroot.Get(\"pic\")";
_pic = BA.ObjectToString(_colroot.Get((Object)("pic")));
RDebugUtils.currentLine=18939923;
 //BA.debugLineNum = 18939923;BA.debugLine="Dim userid As String = colroot.Get(\"userid\")";
_userid = BA.ObjectToString(_colroot.Get((Object)("userid")));
RDebugUtils.currentLine=18939924;
 //BA.debugLineNum = 18939924;BA.debugLine="Dim username As String = colroot.Get(\"username";
_username = BA.ObjectToString(_colroot.Get((Object)("username")));
RDebugUtils.currentLine=18939925;
 //BA.debugLineNum = 18939925;BA.debugLine="Log(c_f)";
anywheresoftware.b4a.keywords.Common.LogImpl("618939925",_c_f,0);
RDebugUtils.currentLine=18939926;
 //BA.debugLineNum = 18939926;BA.debugLine="Dim n_coins=c_m As Long";
_n_coins = (long)(Double.parseDouble(_c_m));
RDebugUtils.currentLine=18939927;
 //BA.debugLineNum = 18939927;BA.debugLine="If n_coins>100 Then";
if (_n_coins>100) { 
RDebugUtils.currentLine=18939928;
 //BA.debugLineNum = 18939928;BA.debugLine="lbl_nums.Text=\"سکه \"&NumberFormat(c_m,3,0)";
mostCurrent._lbl_nums.setText(BA.ObjectToCharSequence("سکه "+anywheresoftware.b4a.keywords.Common.NumberFormat((double)(Double.parseDouble(_c_m)),(int) (3),(int) (0))));
 }else {
RDebugUtils.currentLine=18939930;
 //BA.debugLineNum = 18939930;BA.debugLine="lbl_nums.Text=\"سکه \"&c_m";
mostCurrent._lbl_nums.setText(BA.ObjectToCharSequence("سکه "+_c_m));
 };
RDebugUtils.currentLine=18939934;
 //BA.debugLineNum = 18939934;BA.debugLine="sql1.ExecNonQuery(\"UPDATE tbl_coin set cm='\"&c";
_sql1.ExecNonQuery("UPDATE tbl_coin set cm='"+_c_m+"',cf='"+_c_f+"' WHERE userid='"+mostCurrent._i_pk+"' ");
 }
};
 break; }
}
;
RDebugUtils.currentLine=18939940;
 //BA.debugLineNum = 18939940;BA.debugLine="End Sub";
return "";
}
public static String  _req_getme(String _userid) throws Exception{
RDebugUtils.currentModule="ac_home";
if (Debug.shouldDelegate(mostCurrent.activityBA, "req_getme", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "req_getme", new Object[] {_userid}));}
com.reza.sh.fastnet.Fastnet _prfn = null;
com.reza.sh.fastnet.PostRequestRaper _post = null;
RDebugUtils.currentLine=18808832;
 //BA.debugLineNum = 18808832;BA.debugLine="Sub req_getme(userid As String)";
RDebugUtils.currentLine=18808833;
 //BA.debugLineNum = 18808833;BA.debugLine="Dim prfn As PersianFastNetwork";
_prfn = new com.reza.sh.fastnet.Fastnet();
RDebugUtils.currentLine=18808834;
 //BA.debugLineNum = 18808834;BA.debugLine="prfn.initialize(\"prfn\")";
_prfn.initialize(processBA,"prfn");
RDebugUtils.currentLine=18808836;
 //BA.debugLineNum = 18808836;BA.debugLine="Dim post As PostRequest";
_post = new com.reza.sh.fastnet.PostRequestRaper();
RDebugUtils.currentLine=18808837;
 //BA.debugLineNum = 18808837;BA.debugLine="post=prfn.BuildPostQuery(\"http://filework.ir/INST";
_post = _prfn.BuildPostQuery("http://filework.ir/INSTAFOLLOW/api/req.php","getinsta");
RDebugUtils.currentLine=18808839;
 //BA.debugLineNum = 18808839;BA.debugLine="post.addHeder(\"User-Agent\",\"Dalvik/1.6.0 (Linux;";
_post.addHeder("User-Agent","Dalvik/1.6.0 (Linux; U; Android 4.4.4; SM-A700FD Build/KTU84P)");
RDebugUtils.currentLine=18808841;
 //BA.debugLineNum = 18808841;BA.debugLine="post.addParametrs(\"ui\",\"1\")";
_post.addParametrs("ui","1");
RDebugUtils.currentLine=18808842;
 //BA.debugLineNum = 18808842;BA.debugLine="post.addParametrs(\"userid\",i_pk)";
_post.addParametrs("userid",mostCurrent._i_pk);
RDebugUtils.currentLine=18808844;
 //BA.debugLineNum = 18808844;BA.debugLine="post.addParametrs(\"req\",\"get_acci\")";
_post.addParametrs("req","get_acci");
RDebugUtils.currentLine=18808847;
 //BA.debugLineNum = 18808847;BA.debugLine="post.executRequestAsString";
_post.executRequestAsString();
RDebugUtils.currentLine=18808848;
 //BA.debugLineNum = 18808848;BA.debugLine="End Sub";
return "";
}
}