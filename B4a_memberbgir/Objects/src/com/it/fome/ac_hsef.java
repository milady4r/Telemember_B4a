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

public class ac_hsef extends androidx.appcompat.app.AppCompatActivity implements B4AActivity{
	public static ac_hsef mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "com.it.fome", "com.it.fome.ac_hsef");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (ac_hsef).");
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
		activityBA = new BA(this, layout, processBA, "com.it.fome", "com.it.fome.ac_hsef");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "com.it.fome.ac_hsef", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (ac_hsef) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (ac_hsef) Resume **");
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
		return ac_hsef.class;
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
        BA.LogInfo("** Activity (ac_hsef) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            ac_hsef mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (ac_hsef) Resume **");
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
public static int _typesef = 0;
public anywheresoftware.b4a.objects.LabelWrapper _meno = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnl_coins = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_icon = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_nums = null;
public com.flycoroundview.mc7.MC7RoundView _roundview = null;
public wir.hitex.recycler.Hitex_LayoutView _lv = null;
public com.hitex_glide.Hitex_Glide _glide = null;
public static String _username_t = "";
public static String _userid_t = "";
public static String _i_username = "";
public static String _i_pk = "";
public static String _i_cookie = "";
public static String _i_pic = "";
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
public com.it.fome.ac_tsearch _ac_tsearch = null;
public com.it.fome.ac_tcoin _ac_tcoin = null;
public com.it.fome.ac_home _ac_home = null;
public com.it.fome.act_chat _act_chat = null;
public com.it.fome.starter _starter = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="ac_hsef";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
int _i = 0;
anywheresoftware.b4a.objects.drawable.GradientDrawable _gradient1 = null;
int[] _clrs = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _bkcolor = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _bkcolor_st = null;
anywheresoftware.b4a.objects.PanelWrapper _pnlb1 = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _bg = null;
anywheresoftware.b4a.objects.PanelWrapper _pnl_main = null;
com.it.fome.mi_topusers _misef = null;
RDebugUtils.currentLine=12779520;
 //BA.debugLineNum = 12779520;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=12779525;
 //BA.debugLineNum = 12779525;BA.debugLine="If File.Exists(File.DirInternal,\"instadb.db\")=Fal";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"instadb.db")==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=12779526;
 //BA.debugLineNum = 12779526;BA.debugLine="File.Copy(File.DirAssets,\"instadb.db\",File.DirIn";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"instadb.db",anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"instadb.db");
 };
RDebugUtils.currentLine=12779528;
 //BA.debugLineNum = 12779528;BA.debugLine="If sql1.IsInitialized=False Then";
if (_sql1.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=12779529;
 //BA.debugLineNum = 12779529;BA.debugLine="sql1.Initialize(File.DirInternal,\"instadb.db\",Fa";
_sql1.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"instadb.db",anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=12779540;
 //BA.debugLineNum = 12779540;BA.debugLine="cursor1 = sql1.ExecQuery(\"SELECT * FROM tbl_acc W";
_cursor1.setObject((android.database.Cursor)(_sql1.ExecQuery("SELECT * FROM tbl_acc WHERE soich='1' ")));
RDebugUtils.currentLine=12779541;
 //BA.debugLineNum = 12779541;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=12779542;
 //BA.debugLineNum = 12779542;BA.debugLine="For i=0 To cursor1.RowCount-1";
{
final int step9 = 1;
final int limit9 = (int) (_cursor1.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
RDebugUtils.currentLine=12779543;
 //BA.debugLineNum = 12779543;BA.debugLine="cursor1.Position=i";
_cursor1.setPosition(_i);
RDebugUtils.currentLine=12779544;
 //BA.debugLineNum = 12779544;BA.debugLine="i_cookie=cursor1.GetString(\"cookie\")";
mostCurrent._i_cookie = _cursor1.GetString("cookie");
RDebugUtils.currentLine=12779545;
 //BA.debugLineNum = 12779545;BA.debugLine="i_username=cursor1.GetString(\"username\")";
mostCurrent._i_username = _cursor1.GetString("username");
RDebugUtils.currentLine=12779546;
 //BA.debugLineNum = 12779546;BA.debugLine="i_pk=cursor1.GetString(\"pk\")";
mostCurrent._i_pk = _cursor1.GetString("pk");
RDebugUtils.currentLine=12779547;
 //BA.debugLineNum = 12779547;BA.debugLine="i_pic=cursor1.GetString(\"profile_pic_url\")";
mostCurrent._i_pic = _cursor1.GetString("profile_pic_url");
 }
};
RDebugUtils.currentLine=12779551;
 //BA.debugLineNum = 12779551;BA.debugLine="cursor1 = sql1.ExecQuery(\"SELECT * FROM tbl_tele";
_cursor1.setObject((android.database.Cursor)(_sql1.ExecQuery("SELECT * FROM tbl_tele WHERE soich='1'")));
RDebugUtils.currentLine=12779552;
 //BA.debugLineNum = 12779552;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=12779553;
 //BA.debugLineNum = 12779553;BA.debugLine="For i=0 To cursor1.RowCount-1";
{
final int step18 = 1;
final int limit18 = (int) (_cursor1.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit18 ;_i = _i + step18 ) {
RDebugUtils.currentLine=12779554;
 //BA.debugLineNum = 12779554;BA.debugLine="cursor1.Position=i";
_cursor1.setPosition(_i);
RDebugUtils.currentLine=12779555;
 //BA.debugLineNum = 12779555;BA.debugLine="userid_t=cursor1.GetString(\"userid\")";
mostCurrent._userid_t = _cursor1.GetString("userid");
RDebugUtils.currentLine=12779556;
 //BA.debugLineNum = 12779556;BA.debugLine="username_t=cursor1.GetString(\"username\")";
mostCurrent._username_t = _cursor1.GetString("username");
 }
};
RDebugUtils.currentLine=12779558;
 //BA.debugLineNum = 12779558;BA.debugLine="cursor1.Close";
_cursor1.Close();
RDebugUtils.currentLine=12779559;
 //BA.debugLineNum = 12779559;BA.debugLine="ToastMessageShow(username_t,False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence(mostCurrent._username_t),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=12779560;
 //BA.debugLineNum = 12779560;BA.debugLine="Log(userid_t)";
anywheresoftware.b4a.keywords.Common.LogImpl("612779560",mostCurrent._userid_t,0);
RDebugUtils.currentLine=12779561;
 //BA.debugLineNum = 12779561;BA.debugLine="Dim Gradient1 As GradientDrawable";
_gradient1 = new anywheresoftware.b4a.objects.drawable.GradientDrawable();
RDebugUtils.currentLine=12779562;
 //BA.debugLineNum = 12779562;BA.debugLine="Dim Clrs(5) As Int";
_clrs = new int[(int) (5)];
;
RDebugUtils.currentLine=12779563;
 //BA.debugLineNum = 12779563;BA.debugLine="Clrs(0) = 0xFFe8eaf6";
_clrs[(int) (0)] = (int) (0xffe8eaf6);
RDebugUtils.currentLine=12779564;
 //BA.debugLineNum = 12779564;BA.debugLine="Clrs(1) = 0xFFe8eaf6";
_clrs[(int) (1)] = (int) (0xffe8eaf6);
RDebugUtils.currentLine=12779565;
 //BA.debugLineNum = 12779565;BA.debugLine="Clrs(2) = 0xFFe8eaf6";
_clrs[(int) (2)] = (int) (0xffe8eaf6);
RDebugUtils.currentLine=12779566;
 //BA.debugLineNum = 12779566;BA.debugLine="Clrs(3) = 0xFF283593";
_clrs[(int) (3)] = (int) (0xff283593);
RDebugUtils.currentLine=12779567;
 //BA.debugLineNum = 12779567;BA.debugLine="Clrs(4) = 0xFF283593";
_clrs[(int) (4)] = (int) (0xff283593);
RDebugUtils.currentLine=12779569;
 //BA.debugLineNum = 12779569;BA.debugLine="Gradient1.Initialize(\"TOP_BOTTOM\", Clrs)";
_gradient1.Initialize(BA.getEnumFromString(android.graphics.drawable.GradientDrawable.Orientation.class,"TOP_BOTTOM"),_clrs);
RDebugUtils.currentLine=12779570;
 //BA.debugLineNum = 12779570;BA.debugLine="Activity.Background=Gradient1";
mostCurrent._activity.setBackground((android.graphics.drawable.Drawable)(_gradient1.getObject()));
RDebugUtils.currentLine=12779572;
 //BA.debugLineNum = 12779572;BA.debugLine="Dim bkcolor As ColorDrawable";
_bkcolor = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=12779573;
 //BA.debugLineNum = 12779573;BA.debugLine="bkcolor.Initialize(Colors.White,8)";
_bkcolor.Initialize(anywheresoftware.b4a.keywords.Common.Colors.White,(int) (8));
RDebugUtils.currentLine=12779574;
 //BA.debugLineNum = 12779574;BA.debugLine="meno.Initialize(\"meno\")";
mostCurrent._meno.Initialize(mostCurrent.activityBA,"meno");
RDebugUtils.currentLine=12779575;
 //BA.debugLineNum = 12779575;BA.debugLine="meno.TextColor=Colors.DarkGray";
mostCurrent._meno.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.DarkGray);
RDebugUtils.currentLine=12779576;
 //BA.debugLineNum = 12779576;BA.debugLine="meno.TextSize=37";
mostCurrent._meno.setTextSize((float) (37));
RDebugUtils.currentLine=12779577;
 //BA.debugLineNum = 12779577;BA.debugLine="meno.Background=bkcolor";
mostCurrent._meno.setBackground((android.graphics.drawable.Drawable)(_bkcolor.getObject()));
RDebugUtils.currentLine=12779578;
 //BA.debugLineNum = 12779578;BA.debugLine="meno.Typeface=Typeface.MATERIALICONS";
mostCurrent._meno.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.getMATERIALICONS());
RDebugUtils.currentLine=12779579;
 //BA.debugLineNum = 12779579;BA.debugLine="meno.Text=Chr(0xE3C7)";
mostCurrent._meno.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr((int) (0xe3c7))));
RDebugUtils.currentLine=12779580;
 //BA.debugLineNum = 12779580;BA.debugLine="meno.Gravity=Gravity.CENTER_HORIZONTAL+Gravity.CE";
mostCurrent._meno.setGravity((int) (anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL+anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=12779581;
 //BA.debugLineNum = 12779581;BA.debugLine="Activity.AddView(meno,3%x,3%x,12%x,12%x)";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._meno.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (3),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (3),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (12),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (12),mostCurrent.activityBA));
RDebugUtils.currentLine=12779583;
 //BA.debugLineNum = 12779583;BA.debugLine="pnl_coins.Initialize(\"pnl_coins\")";
mostCurrent._pnl_coins.Initialize(mostCurrent.activityBA,"pnl_coins");
RDebugUtils.currentLine=12779584;
 //BA.debugLineNum = 12779584;BA.debugLine="Activity.AddView(pnl_coins,50%x,3%x,50%x,12%x)";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._pnl_coins.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (50),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (3),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (50),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (12),mostCurrent.activityBA));
RDebugUtils.currentLine=12779585;
 //BA.debugLineNum = 12779585;BA.debugLine="roundview.Initialize(pnl_coins)";
mostCurrent._roundview.Initialize(processBA,(android.view.View)(mostCurrent._pnl_coins.getObject()));
RDebugUtils.currentLine=12779586;
 //BA.debugLineNum = 12779586;BA.debugLine="roundview.CornerRadius_BL=35";
mostCurrent._roundview.setCornerRadius_BL((int) (35));
RDebugUtils.currentLine=12779587;
 //BA.debugLineNum = 12779587;BA.debugLine="roundview.CornerRadius_TL=35";
mostCurrent._roundview.setCornerRadius_TL((int) (35));
RDebugUtils.currentLine=12779588;
 //BA.debugLineNum = 12779588;BA.debugLine="roundview.BackgroundColor=Colors.White";
mostCurrent._roundview.setBackgroundColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12779590;
 //BA.debugLineNum = 12779590;BA.debugLine="Dim bkcolor_st As ColorDrawable";
_bkcolor_st = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=12779591;
 //BA.debugLineNum = 12779591;BA.debugLine="bkcolor_st.Initialize2(0xFFC67D00,50,4dip,0x82FFE";
_bkcolor_st.Initialize2((int) (0xffc67d00),(int) (50),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (4)),(int) (0x82ffe300));
RDebugUtils.currentLine=12779593;
 //BA.debugLineNum = 12779593;BA.debugLine="Dim pnlb1 As Panel";
_pnlb1 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=12779594;
 //BA.debugLineNum = 12779594;BA.debugLine="pnlb1.Initialize(\"\")";
_pnlb1.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=12779595;
 //BA.debugLineNum = 12779595;BA.debugLine="pnlb1.Color=0xFFFFC300";
_pnlb1.setColor((int) (0xffffc300));
RDebugUtils.currentLine=12779596;
 //BA.debugLineNum = 12779596;BA.debugLine="pnlb1.Background=bkcolor_st";
_pnlb1.setBackground((android.graphics.drawable.Drawable)(_bkcolor_st.getObject()));
RDebugUtils.currentLine=12779597;
 //BA.debugLineNum = 12779597;BA.debugLine="pnl_coins.AddView(pnlb1,pnl_coins.Width-11%x,1%x,";
mostCurrent._pnl_coins.AddView((android.view.View)(_pnlb1.getObject()),(int) (mostCurrent._pnl_coins.getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (11),mostCurrent.activityBA)),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (1),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA),(int) (mostCurrent._pnl_coins.getHeight()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (2),mostCurrent.activityBA)));
RDebugUtils.currentLine=12779599;
 //BA.debugLineNum = 12779599;BA.debugLine="lbl_icon.Initialize(\"lbl_icon\")";
mostCurrent._lbl_icon.Initialize(mostCurrent.activityBA,"lbl_icon");
RDebugUtils.currentLine=12779600;
 //BA.debugLineNum = 12779600;BA.debugLine="lbl_icon.SetBackgroundImage(LoadBitmap(File.DirAs";
mostCurrent._lbl_icon.SetBackgroundImageNew((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"coins.png").getObject()));
RDebugUtils.currentLine=12779601;
 //BA.debugLineNum = 12779601;BA.debugLine="pnl_coins.AddView(lbl_icon,pnl_coins.Width-9%x,pn";
mostCurrent._pnl_coins.AddView((android.view.View)(mostCurrent._lbl_icon.getObject()),(int) (mostCurrent._pnl_coins.getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (9),mostCurrent.activityBA)),(int) (mostCurrent._pnl_coins.getHeight()/(double)2/(double)2),(int) (mostCurrent._pnl_coins.getHeight()/(double)2),(int) (mostCurrent._pnl_coins.getHeight()/(double)2));
RDebugUtils.currentLine=12779603;
 //BA.debugLineNum = 12779603;BA.debugLine="lbl_nums.Initialize(\"lbl_nums\")";
mostCurrent._lbl_nums.Initialize(mostCurrent.activityBA,"lbl_nums");
RDebugUtils.currentLine=12779604;
 //BA.debugLineNum = 12779604;BA.debugLine="lbl_nums.TextColor=Colors.DarkGray";
mostCurrent._lbl_nums.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.DarkGray);
RDebugUtils.currentLine=12779605;
 //BA.debugLineNum = 12779605;BA.debugLine="lbl_nums.TextSize=20";
mostCurrent._lbl_nums.setTextSize((float) (20));
RDebugUtils.currentLine=12779606;
 //BA.debugLineNum = 12779606;BA.debugLine="lbl_nums.Typeface=Typeface.LoadFromAssets(\"iran_s";
mostCurrent._lbl_nums.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("iran_sans.ttf"));
RDebugUtils.currentLine=12779607;
 //BA.debugLineNum = 12779607;BA.debugLine="lbl_nums.Text=0&\" سکه\"";
mostCurrent._lbl_nums.setText(BA.ObjectToCharSequence(BA.NumberToString(0)+" سکه"));
RDebugUtils.currentLine=12779608;
 //BA.debugLineNum = 12779608;BA.debugLine="lbl_nums.Gravity=Gravity.CENTER_VERTICAL+Gravity.";
mostCurrent._lbl_nums.setGravity((int) (anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL+anywheresoftware.b4a.keywords.Common.Gravity.RIGHT));
RDebugUtils.currentLine=12779609;
 //BA.debugLineNum = 12779609;BA.debugLine="pnl_coins.AddView(lbl_nums,2%x,0,pnl_coins.Width-";
mostCurrent._pnl_coins.AddView((android.view.View)(mostCurrent._lbl_nums.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (2),mostCurrent.activityBA),(int) (0),(int) (mostCurrent._pnl_coins.getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (15),mostCurrent.activityBA)),mostCurrent._pnl_coins.getHeight());
RDebugUtils.currentLine=12779611;
 //BA.debugLineNum = 12779611;BA.debugLine="Dim bg As ColorDrawable";
_bg = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=12779612;
 //BA.debugLineNum = 12779612;BA.debugLine="bg.Initialize2(Colors.White,5dip,2dip,Colors.Ligh";
_bg.Initialize2(anywheresoftware.b4a.keywords.Common.Colors.White,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (5)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (2)),anywheresoftware.b4a.keywords.Common.Colors.LightGray);
RDebugUtils.currentLine=12779614;
 //BA.debugLineNum = 12779614;BA.debugLine="Dim pnl_main As Panel";
_pnl_main = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=12779615;
 //BA.debugLineNum = 12779615;BA.debugLine="pnl_main.Initialize(\"\")";
_pnl_main.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=12779617;
 //BA.debugLineNum = 12779617;BA.debugLine="Activity.AddView(pnl_main,0,10%y,100%x,90%y)";
mostCurrent._activity.AddView((android.view.View)(_pnl_main.getObject()),(int) (0),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (10),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (90),mostCurrent.activityBA));
RDebugUtils.currentLine=12779624;
 //BA.debugLineNum = 12779624;BA.debugLine="Select typesef";
switch (_typesef) {
case 0: {
RDebugUtils.currentLine=12779627;
 //BA.debugLineNum = 12779627;BA.debugLine="Dim Gradient1 As GradientDrawable";
_gradient1 = new anywheresoftware.b4a.objects.drawable.GradientDrawable();
RDebugUtils.currentLine=12779628;
 //BA.debugLineNum = 12779628;BA.debugLine="Dim Clrs(2) As Int";
_clrs = new int[(int) (2)];
;
RDebugUtils.currentLine=12779629;
 //BA.debugLineNum = 12779629;BA.debugLine="Clrs(0) = 0xFFD91A99";
_clrs[(int) (0)] = (int) (0xffd91a99);
RDebugUtils.currentLine=12779630;
 //BA.debugLineNum = 12779630;BA.debugLine="Clrs(1) = 0xFFA91AD9";
_clrs[(int) (1)] = (int) (0xffa91ad9);
RDebugUtils.currentLine=12779631;
 //BA.debugLineNum = 12779631;BA.debugLine="Gradient1.Initialize(\"TOP_BOTTOM\", Clrs)";
_gradient1.Initialize(BA.getEnumFromString(android.graphics.drawable.GradientDrawable.Orientation.class,"TOP_BOTTOM"),_clrs);
RDebugUtils.currentLine=12779632;
 //BA.debugLineNum = 12779632;BA.debugLine="Activity.Background=Gradient1";
mostCurrent._activity.setBackground((android.graphics.drawable.Drawable)(_gradient1.getObject()));
RDebugUtils.currentLine=12779635;
 //BA.debugLineNum = 12779635;BA.debugLine="Dim misef As MI_topusers";
_misef = new com.it.fome.mi_topusers();
RDebugUtils.currentLine=12779636;
 //BA.debugLineNum = 12779636;BA.debugLine="misef.Initialize(\"misef\",Me)";
_misef._initialize /*String*/ (null,mostCurrent.activityBA,"misef",ac_hsef.getObject());
RDebugUtils.currentLine=12779637;
 //BA.debugLineNum = 12779637;BA.debugLine="misef.type_history=0";
_misef._type_history /*int*/  = (int) (0);
RDebugUtils.currentLine=12779638;
 //BA.debugLineNum = 12779638;BA.debugLine="misef.addpnl(pnl_main)";
_misef._addpnl /*anywheresoftware.b4a.objects.ConcreteViewWrapper*/ (null,_pnl_main);
RDebugUtils.currentLine=12779639;
 //BA.debugLineNum = 12779639;BA.debugLine="req_igetme(i_pk)";
_req_igetme(mostCurrent._i_pk);
 break; }
case 1: {
RDebugUtils.currentLine=12779642;
 //BA.debugLineNum = 12779642;BA.debugLine="Dim Gradient1 As GradientDrawable";
_gradient1 = new anywheresoftware.b4a.objects.drawable.GradientDrawable();
RDebugUtils.currentLine=12779643;
 //BA.debugLineNum = 12779643;BA.debugLine="Dim Clrs(5) As Int";
_clrs = new int[(int) (5)];
;
RDebugUtils.currentLine=12779644;
 //BA.debugLineNum = 12779644;BA.debugLine="Clrs(0) = 0xFFe8eaf6";
_clrs[(int) (0)] = (int) (0xffe8eaf6);
RDebugUtils.currentLine=12779645;
 //BA.debugLineNum = 12779645;BA.debugLine="Clrs(1) = 0xFFe8eaf6";
_clrs[(int) (1)] = (int) (0xffe8eaf6);
RDebugUtils.currentLine=12779646;
 //BA.debugLineNum = 12779646;BA.debugLine="Clrs(2) = 0xFFe8eaf6";
_clrs[(int) (2)] = (int) (0xffe8eaf6);
RDebugUtils.currentLine=12779647;
 //BA.debugLineNum = 12779647;BA.debugLine="Clrs(3) = 0xFF283593";
_clrs[(int) (3)] = (int) (0xff283593);
RDebugUtils.currentLine=12779648;
 //BA.debugLineNum = 12779648;BA.debugLine="Clrs(4) = 0xFF283593";
_clrs[(int) (4)] = (int) (0xff283593);
RDebugUtils.currentLine=12779650;
 //BA.debugLineNum = 12779650;BA.debugLine="Gradient1.Initialize(\"TOP_BOTTOM\", Clrs)";
_gradient1.Initialize(BA.getEnumFromString(android.graphics.drawable.GradientDrawable.Orientation.class,"TOP_BOTTOM"),_clrs);
RDebugUtils.currentLine=12779651;
 //BA.debugLineNum = 12779651;BA.debugLine="Activity.Background=Gradient1";
mostCurrent._activity.setBackground((android.graphics.drawable.Drawable)(_gradient1.getObject()));
RDebugUtils.currentLine=12779654;
 //BA.debugLineNum = 12779654;BA.debugLine="Dim misef As MI_topusers";
_misef = new com.it.fome.mi_topusers();
RDebugUtils.currentLine=12779655;
 //BA.debugLineNum = 12779655;BA.debugLine="misef.Initialize(\"misef\",Me)";
_misef._initialize /*String*/ (null,mostCurrent.activityBA,"misef",ac_hsef.getObject());
RDebugUtils.currentLine=12779656;
 //BA.debugLineNum = 12779656;BA.debugLine="misef.type_history=1";
_misef._type_history /*int*/  = (int) (1);
RDebugUtils.currentLine=12779657;
 //BA.debugLineNum = 12779657;BA.debugLine="misef.addpnl(pnl_main)";
_misef._addpnl /*anywheresoftware.b4a.objects.ConcreteViewWrapper*/ (null,_pnl_main);
RDebugUtils.currentLine=12779658;
 //BA.debugLineNum = 12779658;BA.debugLine="req_getme(userid_t)";
_req_getme(mostCurrent._userid_t);
 break; }
}
;
RDebugUtils.currentLine=12779661;
 //BA.debugLineNum = 12779661;BA.debugLine="End Sub";
return "";
}
public static String  _req_igetme(String _userid) throws Exception{
RDebugUtils.currentModule="ac_hsef";
if (Debug.shouldDelegate(mostCurrent.activityBA, "req_igetme", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "req_igetme", new Object[] {_userid}));}
com.reza.sh.fastnet.Fastnet _prfn = null;
com.reza.sh.fastnet.PostRequestRaper _post = null;
RDebugUtils.currentLine=13369344;
 //BA.debugLineNum = 13369344;BA.debugLine="Sub req_igetme(userid As String)";
RDebugUtils.currentLine=13369345;
 //BA.debugLineNum = 13369345;BA.debugLine="Dim prfn As PersianFastNetwork";
_prfn = new com.reza.sh.fastnet.Fastnet();
RDebugUtils.currentLine=13369346;
 //BA.debugLineNum = 13369346;BA.debugLine="prfn.initialize(\"prfn\")";
_prfn.initialize(processBA,"prfn");
RDebugUtils.currentLine=13369348;
 //BA.debugLineNum = 13369348;BA.debugLine="Dim post As PostRequest";
_post = new com.reza.sh.fastnet.PostRequestRaper();
RDebugUtils.currentLine=13369349;
 //BA.debugLineNum = 13369349;BA.debugLine="post=prfn.BuildPostQuery(\"http://filework.ir/INST";
_post = _prfn.BuildPostQuery("http://filework.ir/INSTAFOLLOW/api/req.php","igetinsta");
RDebugUtils.currentLine=13369351;
 //BA.debugLineNum = 13369351;BA.debugLine="post.addHeder(\"User-Agent\",\"Dalvik/1.6.0 (Linux;";
_post.addHeder("User-Agent","Dalvik/1.6.0 (Linux; U; Android 4.4.4; SM-A700FD Build/KTU84P)");
RDebugUtils.currentLine=13369353;
 //BA.debugLineNum = 13369353;BA.debugLine="post.addParametrs(\"ui\",\"1\")";
_post.addParametrs("ui","1");
RDebugUtils.currentLine=13369354;
 //BA.debugLineNum = 13369354;BA.debugLine="post.addParametrs(\"userid\",i_pk)";
_post.addParametrs("userid",mostCurrent._i_pk);
RDebugUtils.currentLine=13369356;
 //BA.debugLineNum = 13369356;BA.debugLine="post.addParametrs(\"req\",\"get_acci\")";
_post.addParametrs("req","get_acci");
RDebugUtils.currentLine=13369359;
 //BA.debugLineNum = 13369359;BA.debugLine="post.executRequestAsString";
_post.executRequestAsString();
RDebugUtils.currentLine=13369360;
 //BA.debugLineNum = 13369360;BA.debugLine="End Sub";
return "";
}
public static String  _req_getme(String _userid) throws Exception{
RDebugUtils.currentModule="ac_hsef";
if (Debug.shouldDelegate(mostCurrent.activityBA, "req_getme", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "req_getme", new Object[] {_userid}));}
com.reza.sh.fastnet.Fastnet _prfn = null;
com.reza.sh.fastnet.PostRequestRaper _post = null;
RDebugUtils.currentLine=13303808;
 //BA.debugLineNum = 13303808;BA.debugLine="Sub req_getme(userid As String)";
RDebugUtils.currentLine=13303809;
 //BA.debugLineNum = 13303809;BA.debugLine="Dim prfn As PersianFastNetwork";
_prfn = new com.reza.sh.fastnet.Fastnet();
RDebugUtils.currentLine=13303810;
 //BA.debugLineNum = 13303810;BA.debugLine="prfn.initialize(\"prfn\")";
_prfn.initialize(processBA,"prfn");
RDebugUtils.currentLine=13303812;
 //BA.debugLineNum = 13303812;BA.debugLine="Dim post As PostRequest";
_post = new com.reza.sh.fastnet.PostRequestRaper();
RDebugUtils.currentLine=13303813;
 //BA.debugLineNum = 13303813;BA.debugLine="post=prfn.BuildPostQuery(\"http://filework.ir/INST";
_post = _prfn.BuildPostQuery("http://filework.ir/INSTAFOLLOW/api/req.php","getinsta");
RDebugUtils.currentLine=13303815;
 //BA.debugLineNum = 13303815;BA.debugLine="post.addHeder(\"User-Agent\",\"Dalvik/1.6.0 (Linux;";
_post.addHeder("User-Agent","Dalvik/1.6.0 (Linux; U; Android 4.4.4; SM-A700FD Build/KTU84P)");
RDebugUtils.currentLine=13303817;
 //BA.debugLineNum = 13303817;BA.debugLine="post.addParametrs(\"ui\",\"1\")";
_post.addParametrs("ui","1");
RDebugUtils.currentLine=13303818;
 //BA.debugLineNum = 13303818;BA.debugLine="post.addParametrs(\"userid\",userid_t)";
_post.addParametrs("userid",mostCurrent._userid_t);
RDebugUtils.currentLine=13303820;
 //BA.debugLineNum = 13303820;BA.debugLine="post.addParametrs(\"req\",\"get_acct\")";
_post.addParametrs("req","get_acct");
RDebugUtils.currentLine=13303823;
 //BA.debugLineNum = 13303823;BA.debugLine="post.executRequestAsString";
_post.executRequestAsString();
RDebugUtils.currentLine=13303824;
 //BA.debugLineNum = 13303824;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="ac_hsef";
RDebugUtils.currentLine=12910592;
 //BA.debugLineNum = 12910592;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=12910594;
 //BA.debugLineNum = 12910594;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="ac_hsef";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=12845056;
 //BA.debugLineNum = 12845056;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=12845058;
 //BA.debugLineNum = 12845058;BA.debugLine="End Sub";
return "";
}
public static int  _lv_getitemcount() throws Exception{
RDebugUtils.currentModule="ac_hsef";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lv_getitemcount", false))
	 {return ((Integer) Debug.delegate(mostCurrent.activityBA, "lv_getitemcount", null));}
RDebugUtils.currentLine=13107200;
 //BA.debugLineNum = 13107200;BA.debugLine="Sub LV_GetItemCount As Int 								        '$ Item";
RDebugUtils.currentLine=13107201;
 //BA.debugLineNum = 13107201;BA.debugLine="Return 3 'ItemList.Size";
if (true) return (int) (3);
RDebugUtils.currentLine=13107202;
 //BA.debugLineNum = 13107202;BA.debugLine="End Sub";
return 0;
}
public static void  _lv_itemclick(anywheresoftware.b4a.objects.PanelWrapper _clickeditem,int _position) throws Exception{
RDebugUtils.currentModule="ac_hsef";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lv_itemclick", false))
	 {Debug.delegate(mostCurrent.activityBA, "lv_itemclick", new Object[] {_clickeditem,_position}); return;}
ResumableSub_LV_ItemClick rsub = new ResumableSub_LV_ItemClick(null,_clickeditem,_position);
rsub.resume(processBA, null);
}
public static class ResumableSub_LV_ItemClick extends BA.ResumableSub {
public ResumableSub_LV_ItemClick(com.it.fome.ac_hsef parent,anywheresoftware.b4a.objects.PanelWrapper _clickeditem,int _position) {
this.parent = parent;
this._clickeditem = _clickeditem;
this._position = _position;
}
com.it.fome.ac_hsef parent;
anywheresoftware.b4a.objects.PanelWrapper _clickeditem;
int _position;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ac_hsef";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=13172737;
 //BA.debugLineNum = 13172737;BA.debugLine="Sleep(0)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ac_hsef", "lv_itemclick"),(int) (0));
this.state = 11;
return;
case 11:
//C
this.state = 1;
;
RDebugUtils.currentLine=13172738;
 //BA.debugLineNum = 13172738;BA.debugLine="Select Position";
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
RDebugUtils.currentLine=13172744;
 //BA.debugLineNum = 13172744;BA.debugLine="SetAnimation(\"anim3\", \"anim4\")";
_setanimation("anim3","anim4");
 if (true) break;

case 5:
//C
this.state = 10;
RDebugUtils.currentLine=13172747;
 //BA.debugLineNum = 13172747;BA.debugLine="SetAnimation(\"anim2\", \"anim1\")";
_setanimation("anim2","anim1");
 if (true) break;

case 7:
//C
this.state = 10;
 if (true) break;

case 9:
//C
this.state = 10;
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=13172761;
 //BA.debugLineNum = 13172761;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _setanimation(String _inanimation,String _outanimation) throws Exception{
RDebugUtils.currentModule="ac_hsef";
if (Debug.shouldDelegate(mostCurrent.activityBA, "setanimation", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "setanimation", new Object[] {_inanimation,_outanimation}));}
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
String _package = "";
int _in = 0;
int _out = 0;
RDebugUtils.currentLine=13238272;
 //BA.debugLineNum = 13238272;BA.debugLine="Sub SetAnimation(InAnimation As String, OutAnimati";
RDebugUtils.currentLine=13238273;
 //BA.debugLineNum = 13238273;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=13238274;
 //BA.debugLineNum = 13238274;BA.debugLine="Dim package As String";
_package = "";
RDebugUtils.currentLine=13238275;
 //BA.debugLineNum = 13238275;BA.debugLine="Dim In, out As Int";
_in = 0;
_out = 0;
RDebugUtils.currentLine=13238276;
 //BA.debugLineNum = 13238276;BA.debugLine="package = r.GetStaticField(\"anywheresoftware.b4a.";
_package = BA.ObjectToString(_r.GetStaticField("anywheresoftware.b4a.BA","packageName"));
RDebugUtils.currentLine=13238277;
 //BA.debugLineNum = 13238277;BA.debugLine="In = r.GetStaticField(package & \".R$anim\", InAnim";
_in = (int)(BA.ObjectToNumber(_r.GetStaticField(_package+".R$anim",_inanimation)));
RDebugUtils.currentLine=13238278;
 //BA.debugLineNum = 13238278;BA.debugLine="out = r.GetStaticField(package & \".R$anim\", OutAn";
_out = (int)(BA.ObjectToNumber(_r.GetStaticField(_package+".R$anim",_outanimation)));
RDebugUtils.currentLine=13238279;
 //BA.debugLineNum = 13238279;BA.debugLine="r.Target = r.GetActivity";
_r.Target = (Object)(_r.GetActivity(processBA));
RDebugUtils.currentLine=13238280;
 //BA.debugLineNum = 13238280;BA.debugLine="r.RunMethod4(\"overridePendingTransition\", Array A";
_r.RunMethod4("overridePendingTransition",new Object[]{(Object)(_in),(Object)(_out)},new String[]{"java.lang.int","java.lang.int"});
RDebugUtils.currentLine=13238281;
 //BA.debugLineNum = 13238281;BA.debugLine="End Sub";
return "";
}
public static String  _lv_onbindviewholder(anywheresoftware.b4a.objects.PanelWrapper _parent,int _position) throws Exception{
RDebugUtils.currentModule="ac_hsef";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lv_onbindviewholder", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "lv_onbindviewholder", new Object[] {_parent,_position}));}
anywheresoftware.b4a.objects.PanelWrapper _pnl_main = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl_itemicon = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl_name = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl_notis = null;
RDebugUtils.currentLine=13041664;
 //BA.debugLineNum = 13041664;BA.debugLine="Sub LV_onBindViewHolder (Parent As Panel, Position";
RDebugUtils.currentLine=13041665;
 //BA.debugLineNum = 13041665;BA.debugLine="Dim pnl_main = Parent.GetView(0) As Panel";
_pnl_main = new anywheresoftware.b4a.objects.PanelWrapper();
_pnl_main.setObject((android.view.ViewGroup)(_parent.GetView((int) (0)).getObject()));
RDebugUtils.currentLine=13041666;
 //BA.debugLineNum = 13041666;BA.debugLine="Dim lbl_itemicon = pnl_main.GetView(0) As Label";
_lbl_itemicon = new anywheresoftware.b4a.objects.LabelWrapper();
_lbl_itemicon.setObject((android.widget.TextView)(_pnl_main.GetView((int) (0)).getObject()));
RDebugUtils.currentLine=13041667;
 //BA.debugLineNum = 13041667;BA.debugLine="Dim lbl_name = pnl_main.GetView(1) As Label";
_lbl_name = new anywheresoftware.b4a.objects.LabelWrapper();
_lbl_name.setObject((android.widget.TextView)(_pnl_main.GetView((int) (1)).getObject()));
RDebugUtils.currentLine=13041669;
 //BA.debugLineNum = 13041669;BA.debugLine="Dim lbl_notis = pnl_main.GetView(2) As Label";
_lbl_notis = new anywheresoftware.b4a.objects.LabelWrapper();
_lbl_notis.setObject((android.widget.TextView)(_pnl_main.GetView((int) (2)).getObject()));
RDebugUtils.currentLine=13041671;
 //BA.debugLineNum = 13041671;BA.debugLine="Select Position";
switch (_position) {
case 0: {
RDebugUtils.currentLine=13041673;
 //BA.debugLineNum = 13041673;BA.debugLine="lbl_name.Text=\"سفارش بده\"";
_lbl_name.setText(BA.ObjectToCharSequence("سفارش بده"));
RDebugUtils.currentLine=13041674;
 //BA.debugLineNum = 13041674;BA.debugLine="lbl_notis.Text=\"ممبر-ویو\"";
_lbl_notis.setText(BA.ObjectToCharSequence("ممبر-ویو"));
RDebugUtils.currentLine=13041675;
 //BA.debugLineNum = 13041675;BA.debugLine="lbl_itemicon.Text=Chr(0xE003)";
_lbl_itemicon.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr((int) (0xe003))));
 break; }
case 1: {
RDebugUtils.currentLine=13041678;
 //BA.debugLineNum = 13041678;BA.debugLine="lbl_name.Text=\"سکه بگیر\"";
_lbl_name.setText(BA.ObjectToCharSequence("سکه بگیر"));
RDebugUtils.currentLine=13041679;
 //BA.debugLineNum = 13041679;BA.debugLine="lbl_notis.Text=\"سکه رایگان\"";
_lbl_notis.setText(BA.ObjectToCharSequence("سکه رایگان"));
RDebugUtils.currentLine=13041680;
 //BA.debugLineNum = 13041680;BA.debugLine="lbl_itemicon.Text=Chr(0xE8E5)";
_lbl_itemicon.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr((int) (0xe8e5))));
 break; }
case 2: {
RDebugUtils.currentLine=13041682;
 //BA.debugLineNum = 13041682;BA.debugLine="lbl_name.Text=\"سفارشات\"";
_lbl_name.setText(BA.ObjectToCharSequence("سفارشات"));
RDebugUtils.currentLine=13041683;
 //BA.debugLineNum = 13041683;BA.debugLine="lbl_notis.Text=\"پیگیری سفارشات\"";
_lbl_notis.setText(BA.ObjectToCharSequence("پیگیری سفارشات"));
RDebugUtils.currentLine=13041684;
 //BA.debugLineNum = 13041684;BA.debugLine="lbl_itemicon.Text=Chr(0xE06D)";
_lbl_itemicon.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr((int) (0xe06d))));
 break; }
}
;
RDebugUtils.currentLine=13041686;
 //BA.debugLineNum = 13041686;BA.debugLine="Parent.Height=20%y";
_parent.setHeight(anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (20),mostCurrent.activityBA));
RDebugUtils.currentLine=13041687;
 //BA.debugLineNum = 13041687;BA.debugLine="End Sub";
return "";
}
public static String  _lv_oncreateviewholder(anywheresoftware.b4a.objects.PanelWrapper _parent,int _viewtype) throws Exception{
RDebugUtils.currentModule="ac_hsef";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lv_oncreateviewholder", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "lv_oncreateviewholder", new Object[] {_parent,_viewtype}));}
anywheresoftware.b4a.objects.drawable.ColorDrawable _bkcolors = null;
anywheresoftware.b4a.objects.PanelWrapper _pnl_main = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl_itemicon = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl_name = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _bkcolor = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl_notis = null;
RDebugUtils.currentLine=12976128;
 //BA.debugLineNum = 12976128;BA.debugLine="Sub LV_onCreateViewHolder (Parent As Panel, ViewTy";
RDebugUtils.currentLine=12976129;
 //BA.debugLineNum = 12976129;BA.debugLine="Parent.Color=Colors.Transparent";
_parent.setColor(anywheresoftware.b4a.keywords.Common.Colors.Transparent);
RDebugUtils.currentLine=12976131;
 //BA.debugLineNum = 12976131;BA.debugLine="Dim bkcolors As ColorDrawable";
_bkcolors = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=12976132;
 //BA.debugLineNum = 12976132;BA.debugLine="bkcolors.Initialize(Colors.White,15)";
_bkcolors.Initialize(anywheresoftware.b4a.keywords.Common.Colors.White,(int) (15));
RDebugUtils.currentLine=12976134;
 //BA.debugLineNum = 12976134;BA.debugLine="Dim pnl_main As Panel : pnl_main.Initialize(\"pnl_";
_pnl_main = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=12976134;
 //BA.debugLineNum = 12976134;BA.debugLine="Dim pnl_main As Panel : pnl_main.Initialize(\"pnl_";
_pnl_main.Initialize(mostCurrent.activityBA,"pnl_main");
RDebugUtils.currentLine=12976135;
 //BA.debugLineNum = 12976135;BA.debugLine="pnl_main.Color=Colors.White";
_pnl_main.setColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12976136;
 //BA.debugLineNum = 12976136;BA.debugLine="pnl_main.Background=bkcolors";
_pnl_main.setBackground((android.graphics.drawable.Drawable)(_bkcolors.getObject()));
RDebugUtils.currentLine=12976137;
 //BA.debugLineNum = 12976137;BA.debugLine="Parent.AddView(pnl_main,5%x,2%x,90%x,18%y)";
_parent.AddView((android.view.View)(_pnl_main.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (2),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (90),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (18),mostCurrent.activityBA));
RDebugUtils.currentLine=12976139;
 //BA.debugLineNum = 12976139;BA.debugLine="Dim lbl_itemicon As Label";
_lbl_itemicon = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=12976140;
 //BA.debugLineNum = 12976140;BA.debugLine="lbl_itemicon.Initialize(\"lbl_itemicon\")";
_lbl_itemicon.Initialize(mostCurrent.activityBA,"lbl_itemicon");
RDebugUtils.currentLine=12976141;
 //BA.debugLineNum = 12976141;BA.debugLine="lbl_itemicon.TextColor=0xFFD305BA";
_lbl_itemicon.setTextColor((int) (0xffd305ba));
RDebugUtils.currentLine=12976142;
 //BA.debugLineNum = 12976142;BA.debugLine="lbl_itemicon.TextSize=40";
_lbl_itemicon.setTextSize((float) (40));
RDebugUtils.currentLine=12976143;
 //BA.debugLineNum = 12976143;BA.debugLine="lbl_itemicon.Typeface=Typeface.MATERIALICONS";
_lbl_itemicon.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.getMATERIALICONS());
RDebugUtils.currentLine=12976144;
 //BA.debugLineNum = 12976144;BA.debugLine="lbl_itemicon.Gravity=Gravity.CENTER_VERTICAL+Grav";
_lbl_itemicon.setGravity((int) (anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL+anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL));
RDebugUtils.currentLine=12976145;
 //BA.debugLineNum = 12976145;BA.debugLine="pnl_main.AddView(lbl_itemicon,0,3%x,pnl_main.Widt";
_pnl_main.AddView((android.view.View)(_lbl_itemicon.getObject()),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (3),mostCurrent.activityBA),_pnl_main.getWidth(),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA));
RDebugUtils.currentLine=12976147;
 //BA.debugLineNum = 12976147;BA.debugLine="Dim lbl_name As Label";
_lbl_name = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=12976148;
 //BA.debugLineNum = 12976148;BA.debugLine="lbl_name.Initialize(\"lbl_name\")";
_lbl_name.Initialize(mostCurrent.activityBA,"lbl_name");
RDebugUtils.currentLine=12976149;
 //BA.debugLineNum = 12976149;BA.debugLine="lbl_name.TextColor=Colors.DarkGray";
_lbl_name.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.DarkGray);
RDebugUtils.currentLine=12976150;
 //BA.debugLineNum = 12976150;BA.debugLine="lbl_name.TextSize=17";
_lbl_name.setTextSize((float) (17));
RDebugUtils.currentLine=12976151;
 //BA.debugLineNum = 12976151;BA.debugLine="lbl_name.Typeface=Typeface.LoadFromAssets(\"iran_s";
_lbl_name.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("iran_sans.ttf"));
RDebugUtils.currentLine=12976152;
 //BA.debugLineNum = 12976152;BA.debugLine="lbl_name.Gravity=Gravity.CENTER_VERTICAL+Gravity.";
_lbl_name.setGravity((int) (anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL+anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL));
RDebugUtils.currentLine=12976153;
 //BA.debugLineNum = 12976153;BA.debugLine="pnl_main.AddView(lbl_name,0,lbl_itemicon.Top+lbl_";
_pnl_main.AddView((android.view.View)(_lbl_name.getObject()),(int) (0),(int) (_lbl_itemicon.getTop()+_lbl_itemicon.getHeight()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (2),mostCurrent.activityBA)),_pnl_main.getWidth(),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA));
RDebugUtils.currentLine=12976155;
 //BA.debugLineNum = 12976155;BA.debugLine="Dim bkcolor As ColorDrawable";
_bkcolor = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=12976156;
 //BA.debugLineNum = 12976156;BA.debugLine="bkcolor.Initialize(0xFFFFD82B,10)";
_bkcolor.Initialize((int) (0xffffd82b),(int) (10));
RDebugUtils.currentLine=12976157;
 //BA.debugLineNum = 12976157;BA.debugLine="Dim lbl_notis As Label";
_lbl_notis = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=12976158;
 //BA.debugLineNum = 12976158;BA.debugLine="lbl_notis.Initialize(\"lbl_notis\")";
_lbl_notis.Initialize(mostCurrent.activityBA,"lbl_notis");
RDebugUtils.currentLine=12976159;
 //BA.debugLineNum = 12976159;BA.debugLine="lbl_notis.TextColor=Colors.DarkGray";
_lbl_notis.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.DarkGray);
RDebugUtils.currentLine=12976160;
 //BA.debugLineNum = 12976160;BA.debugLine="lbl_notis.TextSize=17";
_lbl_notis.setTextSize((float) (17));
RDebugUtils.currentLine=12976161;
 //BA.debugLineNum = 12976161;BA.debugLine="lbl_notis.Typeface=Typeface.LoadFromAssets(\"iran_";
_lbl_notis.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("iran_sans.ttf"));
RDebugUtils.currentLine=12976162;
 //BA.debugLineNum = 12976162;BA.debugLine="lbl_notis.Text=\"با قیمت مناسب و کیفیت تضمینی !\"";
_lbl_notis.setText(BA.ObjectToCharSequence("با قیمت مناسب و کیفیت تضمینی !"));
RDebugUtils.currentLine=12976163;
 //BA.debugLineNum = 12976163;BA.debugLine="lbl_notis.Gravity=Gravity.CENTER_VERTICAL+Gravity";
_lbl_notis.setGravity((int) (anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL+anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL));
RDebugUtils.currentLine=12976165;
 //BA.debugLineNum = 12976165;BA.debugLine="pnl_main.AddView(lbl_notis,5%x,lbl_name.Top+lbl_n";
_pnl_main.AddView((android.view.View)(_lbl_notis.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA),(int) (_lbl_name.getTop()+_lbl_name.getHeight()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (1),mostCurrent.activityBA)),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (80),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (9),mostCurrent.activityBA));
RDebugUtils.currentLine=12976167;
 //BA.debugLineNum = 12976167;BA.debugLine="lbl_name.Text=\"فالوور بگیر\"";
_lbl_name.setText(BA.ObjectToCharSequence("فالوور بگیر"));
RDebugUtils.currentLine=12976168;
 //BA.debugLineNum = 12976168;BA.debugLine="lbl_itemicon.Text=Chr(0xE8D3)";
_lbl_itemicon.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr((int) (0xe8d3))));
RDebugUtils.currentLine=12976170;
 //BA.debugLineNum = 12976170;BA.debugLine="roundview.Initialize(lbl_notis)";
mostCurrent._roundview.Initialize(processBA,(android.view.View)(_lbl_notis.getObject()));
RDebugUtils.currentLine=12976171;
 //BA.debugLineNum = 12976171;BA.debugLine="roundview.CornerRadius_BL=30";
mostCurrent._roundview.setCornerRadius_BL((int) (30));
RDebugUtils.currentLine=12976172;
 //BA.debugLineNum = 12976172;BA.debugLine="roundview.CornerRadius_BR=30";
mostCurrent._roundview.setCornerRadius_BR((int) (30));
RDebugUtils.currentLine=12976173;
 //BA.debugLineNum = 12976173;BA.debugLine="roundview.CornerRadius_TL=30";
mostCurrent._roundview.setCornerRadius_TL((int) (30));
RDebugUtils.currentLine=12976174;
 //BA.debugLineNum = 12976174;BA.debugLine="roundview.CornerRadius_TR=30";
mostCurrent._roundview.setCornerRadius_TR((int) (30));
RDebugUtils.currentLine=12976175;
 //BA.debugLineNum = 12976175;BA.debugLine="roundview.BackgroundColor=0xFFFFD82B";
mostCurrent._roundview.setBackgroundColor((int) (0xffffd82b));
RDebugUtils.currentLine=12976177;
 //BA.debugLineNum = 12976177;BA.debugLine="End Sub";
return "";
}
public static String  _meno_click() throws Exception{
RDebugUtils.currentModule="ac_hsef";
if (Debug.shouldDelegate(mostCurrent.activityBA, "meno_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "meno_click", null));}
RDebugUtils.currentLine=13565952;
 //BA.debugLineNum = 13565952;BA.debugLine="Sub meno_Click";
RDebugUtils.currentLine=13565953;
 //BA.debugLineNum = 13565953;BA.debugLine="mimeno.Initialize(\"mimeno\",Me)";
mostCurrent._mimeno._initialize /*String*/ (null,mostCurrent.activityBA,"mimeno",ac_hsef.getObject());
RDebugUtils.currentLine=13565954;
 //BA.debugLineNum = 13565954;BA.debugLine="mimeno.addpnl";
mostCurrent._mimeno._addpnl /*String*/ (null);
RDebugUtils.currentLine=13565955;
 //BA.debugLineNum = 13565955;BA.debugLine="mimeno.open";
mostCurrent._mimeno._open /*String*/ (null);
RDebugUtils.currentLine=13565956;
 //BA.debugLineNum = 13565956;BA.debugLine="End Sub";
return "";
}
public static String  _prfn_onpoststringerrorlistener(com.reza.sh.fastnet.Error _error,String _tag) throws Exception{
RDebugUtils.currentModule="ac_hsef";
if (Debug.shouldDelegate(mostCurrent.activityBA, "prfn_onpoststringerrorlistener", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "prfn_onpoststringerrorlistener", new Object[] {_error,_tag}));}
RDebugUtils.currentLine=13434880;
 //BA.debugLineNum = 13434880;BA.debugLine="Sub prfn_onPostStringErrorListener(Error As Respon";
RDebugUtils.currentLine=13434882;
 //BA.debugLineNum = 13434882;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=13434883;
 //BA.debugLineNum = 13434883;BA.debugLine="End Sub";
return "";
}
public static String  _prfn_onpoststringoklistener(String _result,String _tag) throws Exception{
RDebugUtils.currentModule="ac_hsef";
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
String _first_last = "";
String _c_ch = "";
RDebugUtils.currentLine=13500416;
 //BA.debugLineNum = 13500416;BA.debugLine="Sub prfn_onPostStringOkListener(Result As String";
RDebugUtils.currentLine=13500418;
 //BA.debugLineNum = 13500418;BA.debugLine="Select Tag";
switch (BA.switchObjectToInt(_tag,"iuser","igetinsta","getinsta")) {
case 0: {
RDebugUtils.currentLine=13500420;
 //BA.debugLineNum = 13500420;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=13500421;
 //BA.debugLineNum = 13500421;BA.debugLine="Log(Result)";
anywheresoftware.b4a.keywords.Common.LogImpl("613500421",_result,0);
 break; }
case 1: {
RDebugUtils.currentLine=13500423;
 //BA.debugLineNum = 13500423;BA.debugLine="Log(Result)";
anywheresoftware.b4a.keywords.Common.LogImpl("613500423",_result,0);
RDebugUtils.currentLine=13500424;
 //BA.debugLineNum = 13500424;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=13500425;
 //BA.debugLineNum = 13500425;BA.debugLine="parser.Initialize(Result)";
_parser.Initialize(_result);
RDebugUtils.currentLine=13500426;
 //BA.debugLineNum = 13500426;BA.debugLine="Dim root As List = parser.NextArray";
_root = new anywheresoftware.b4a.objects.collections.List();
_root = _parser.NextArray();
RDebugUtils.currentLine=13500427;
 //BA.debugLineNum = 13500427;BA.debugLine="For Each colroot As Map In root";
_colroot = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group10 = _root;
final int groupLen10 = group10.getSize()
;int index10 = 0;
;
for (; index10 < groupLen10;index10++){
_colroot.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group10.Get(index10)));
RDebugUtils.currentLine=13500428;
 //BA.debugLineNum = 13500428;BA.debugLine="Dim Result As String = colroot.Get(\"result\")";
_result = BA.ObjectToString(_colroot.Get((Object)("result")));
RDebugUtils.currentLine=13500429;
 //BA.debugLineNum = 13500429;BA.debugLine="Dim c_m As String = colroot.Get(\"c_m\")";
_c_m = BA.ObjectToString(_colroot.Get((Object)("c_m")));
RDebugUtils.currentLine=13500430;
 //BA.debugLineNum = 13500430;BA.debugLine="Dim uid As String = colroot.Get(\"uid\")";
_uid = BA.ObjectToString(_colroot.Get((Object)("uid")));
RDebugUtils.currentLine=13500431;
 //BA.debugLineNum = 13500431;BA.debugLine="Dim id As String = colroot.Get(\"id\")";
_id = BA.ObjectToString(_colroot.Get((Object)("id")));
RDebugUtils.currentLine=13500432;
 //BA.debugLineNum = 13500432;BA.debugLine="Dim c_f As String = colroot.Get(\"c_f\")";
_c_f = BA.ObjectToString(_colroot.Get((Object)("c_f")));
RDebugUtils.currentLine=13500433;
 //BA.debugLineNum = 13500433;BA.debugLine="Dim pic As String = colroot.Get(\"pic\")";
_pic = BA.ObjectToString(_colroot.Get((Object)("pic")));
RDebugUtils.currentLine=13500434;
 //BA.debugLineNum = 13500434;BA.debugLine="Dim userid As String = colroot.Get(\"userid\")";
_userid = BA.ObjectToString(_colroot.Get((Object)("userid")));
RDebugUtils.currentLine=13500435;
 //BA.debugLineNum = 13500435;BA.debugLine="Dim username As String = colroot.Get(\"username";
_username = BA.ObjectToString(_colroot.Get((Object)("username")));
RDebugUtils.currentLine=13500436;
 //BA.debugLineNum = 13500436;BA.debugLine="Log(c_f)";
anywheresoftware.b4a.keywords.Common.LogImpl("613500436",_c_f,0);
RDebugUtils.currentLine=13500437;
 //BA.debugLineNum = 13500437;BA.debugLine="Dim n_coins=c_m As Long";
_n_coins = (long)(Double.parseDouble(_c_m));
RDebugUtils.currentLine=13500438;
 //BA.debugLineNum = 13500438;BA.debugLine="If n_coins>100 Then";
if (_n_coins>100) { 
RDebugUtils.currentLine=13500439;
 //BA.debugLineNum = 13500439;BA.debugLine="lbl_nums.Text=\"سکه \"&NumberFormat(c_m,3,0)";
mostCurrent._lbl_nums.setText(BA.ObjectToCharSequence("سکه "+anywheresoftware.b4a.keywords.Common.NumberFormat((double)(Double.parseDouble(_c_m)),(int) (3),(int) (0))));
 }else {
RDebugUtils.currentLine=13500441;
 //BA.debugLineNum = 13500441;BA.debugLine="lbl_nums.Text=\"سکه \"&c_m";
mostCurrent._lbl_nums.setText(BA.ObjectToCharSequence("سکه "+_c_m));
 };
RDebugUtils.currentLine=13500445;
 //BA.debugLineNum = 13500445;BA.debugLine="sql1.ExecNonQuery(\"UPDATE tbl_coin set cm='\"&c";
_sql1.ExecNonQuery("UPDATE tbl_coin set cm='"+_c_m+"',cf='"+_c_f+"' WHERE userid='"+mostCurrent._i_pk+"' ");
 }
};
 break; }
case 2: {
RDebugUtils.currentLine=13500449;
 //BA.debugLineNum = 13500449;BA.debugLine="Log(Result)";
anywheresoftware.b4a.keywords.Common.LogImpl("613500449",_result,0);
RDebugUtils.currentLine=13500450;
 //BA.debugLineNum = 13500450;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=13500451;
 //BA.debugLineNum = 13500451;BA.debugLine="parser.Initialize(Result)";
_parser.Initialize(_result);
RDebugUtils.currentLine=13500452;
 //BA.debugLineNum = 13500452;BA.debugLine="Dim root As List = parser.NextArray";
_root = new anywheresoftware.b4a.objects.collections.List();
_root = _parser.NextArray();
RDebugUtils.currentLine=13500453;
 //BA.debugLineNum = 13500453;BA.debugLine="For Each colroot As Map In root";
_colroot = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group33 = _root;
final int groupLen33 = group33.getSize()
;int index33 = 0;
;
for (; index33 < groupLen33;index33++){
_colroot.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group33.Get(index33)));
RDebugUtils.currentLine=13500454;
 //BA.debugLineNum = 13500454;BA.debugLine="Dim Result As String = colroot.Get(\"result\")";
_result = BA.ObjectToString(_colroot.Get((Object)("result")));
RDebugUtils.currentLine=13500455;
 //BA.debugLineNum = 13500455;BA.debugLine="Dim c_m As String = colroot.Get(\"c_m\")";
_c_m = BA.ObjectToString(_colroot.Get((Object)("c_m")));
RDebugUtils.currentLine=13500456;
 //BA.debugLineNum = 13500456;BA.debugLine="Dim uid As String = colroot.Get(\"uid\")";
_uid = BA.ObjectToString(_colroot.Get((Object)("uid")));
RDebugUtils.currentLine=13500457;
 //BA.debugLineNum = 13500457;BA.debugLine="Dim first_last As String = colroot.Get(\"first_";
_first_last = BA.ObjectToString(_colroot.Get((Object)("first_last")));
RDebugUtils.currentLine=13500458;
 //BA.debugLineNum = 13500458;BA.debugLine="Dim id As String = colroot.Get(\"id\")";
_id = BA.ObjectToString(_colroot.Get((Object)("id")));
RDebugUtils.currentLine=13500459;
 //BA.debugLineNum = 13500459;BA.debugLine="Dim userid As String = colroot.Get(\"userid\")";
_userid = BA.ObjectToString(_colroot.Get((Object)("userid")));
RDebugUtils.currentLine=13500460;
 //BA.debugLineNum = 13500460;BA.debugLine="Dim username As String = colroot.Get(\"username";
_username = BA.ObjectToString(_colroot.Get((Object)("username")));
RDebugUtils.currentLine=13500461;
 //BA.debugLineNum = 13500461;BA.debugLine="Dim c_ch As String = colroot.Get(\"c_ch\")";
_c_ch = BA.ObjectToString(_colroot.Get((Object)("c_ch")));
RDebugUtils.currentLine=13500463;
 //BA.debugLineNum = 13500463;BA.debugLine="Log(c_m)";
anywheresoftware.b4a.keywords.Common.LogImpl("613500463",_c_m,0);
RDebugUtils.currentLine=13500464;
 //BA.debugLineNum = 13500464;BA.debugLine="Dim n_coins=c_m As Long";
_n_coins = (long)(Double.parseDouble(_c_m));
RDebugUtils.currentLine=13500465;
 //BA.debugLineNum = 13500465;BA.debugLine="If n_coins>100 Then";
if (_n_coins>100) { 
RDebugUtils.currentLine=13500466;
 //BA.debugLineNum = 13500466;BA.debugLine="lbl_nums.Text=\"سکه \"&NumberFormat(c_m,3,0)";
mostCurrent._lbl_nums.setText(BA.ObjectToCharSequence("سکه "+anywheresoftware.b4a.keywords.Common.NumberFormat((double)(Double.parseDouble(_c_m)),(int) (3),(int) (0))));
 }else {
RDebugUtils.currentLine=13500468;
 //BA.debugLineNum = 13500468;BA.debugLine="lbl_nums.Text=\"سکه \"&c_m";
mostCurrent._lbl_nums.setText(BA.ObjectToCharSequence("سکه "+_c_m));
 };
RDebugUtils.currentLine=13500472;
 //BA.debugLineNum = 13500472;BA.debugLine="sql1.ExecNonQuery(\"UPDATE tbl_coin set cm='\"&c";
_sql1.ExecNonQuery("UPDATE tbl_coin set cm='"+_c_m+"',cf='"+_c_ch+"' WHERE userid='"+mostCurrent._userid_t+"' ");
 }
};
 break; }
}
;
RDebugUtils.currentLine=13500478;
 //BA.debugLineNum = 13500478;BA.debugLine="End Sub";
return "";
}
}