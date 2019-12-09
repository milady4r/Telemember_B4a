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

public class ac_tfreecoin extends androidx.appcompat.app.AppCompatActivity implements B4AActivity{
	public static ac_tfreecoin mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "com.it.fome", "com.it.fome.ac_tfreecoin");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (ac_tfreecoin).");
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
		activityBA = new BA(this, layout, processBA, "com.it.fome", "com.it.fome.ac_tfreecoin");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "com.it.fome.ac_tfreecoin", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (ac_tfreecoin) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (ac_tfreecoin) Resume **");
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
		return ac_tfreecoin.class;
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
        BA.LogInfo("** Activity (ac_tfreecoin) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            ac_tfreecoin mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (ac_tfreecoin) Resume **");
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
public static int _type_done = 0;
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
public anywheresoftware.b4a.objects.collections.List[] _list_like = null;
public anywheresoftware.b4a.objects.collections.List[] _list_com = null;
public anywheresoftware.b4a.objects.collections.List[] _list_follow = null;
public static int _nll = 0;
public static int _ncc = 0;
public static int _nff = 0;
public static String _cm = "";
public com.hitex_glide.Hitex_ImageView _img_target = null;
public static int _posi = 0;
public static String _username_t = "";
public static String _userid_t = "";
public com.it.fome.mi_meno _mimeno = null;
public com.mili.telegrams.teleg_warp _telegs = null;
public anywheresoftware.b4a.objects.WebViewWrapper _webview1 = null;
public uk.co.martinpearman.b4a.webkit.WebViewExtras _webviewextras1 = null;
public b4a.example.dateutils _dateutils = null;
public com.it.fome.main _main = null;
public com.it.fome.ac_telelogin _ac_telelogin = null;
public com.it.fome.ac_shop _ac_shop = null;
public com.it.fome.ac_tansfer _ac_tansfer = null;
public com.it.fome.firebasemessaging _firebasemessaging = null;
public com.it.fome.ac_tselect _ac_tselect = null;
public com.it.fome.ac_lchats _ac_lchats = null;
public com.it.fome.ac_hsef _ac_hsef = null;
public com.it.fome.ac_tsearch _ac_tsearch = null;
public com.it.fome.ac_tcoin _ac_tcoin = null;
public com.it.fome.ac_home _ac_home = null;
public com.it.fome.act_chat _act_chat = null;
public com.it.fome.starter _starter = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="ac_tfreecoin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
int _ig = 0;
int _i = 0;
anywheresoftware.b4a.objects.drawable.GradientDrawable _gradient1 = null;
int[] _clrs = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _bkcolor = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _bkcolor_st = null;
anywheresoftware.b4a.objects.PanelWrapper _pnlb1 = null;
anywheresoftware.b4a.objects.PanelWrapper _pnl_main = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _bg = null;
RDebugUtils.currentLine=11075584;
 //BA.debugLineNum = 11075584;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=11075588;
 //BA.debugLineNum = 11075588;BA.debugLine="telegs.Initialize(\"telegs\")";
mostCurrent._telegs.Initialize(processBA,"telegs");
RDebugUtils.currentLine=11075590;
 //BA.debugLineNum = 11075590;BA.debugLine="For ig=0 To 17";
{
final int step2 = 1;
final int limit2 = (int) (17);
_ig = (int) (0) ;
for (;_ig <= limit2 ;_ig = _ig + step2 ) {
RDebugUtils.currentLine=11075591;
 //BA.debugLineNum = 11075591;BA.debugLine="list_com(ig).Initialize";
mostCurrent._list_com[_ig].Initialize();
RDebugUtils.currentLine=11075592;
 //BA.debugLineNum = 11075592;BA.debugLine="list_like(ig).Initialize";
mostCurrent._list_like[_ig].Initialize();
RDebugUtils.currentLine=11075593;
 //BA.debugLineNum = 11075593;BA.debugLine="list_follow(ig).Initialize";
mostCurrent._list_follow[_ig].Initialize();
 }
};
RDebugUtils.currentLine=11075597;
 //BA.debugLineNum = 11075597;BA.debugLine="If File.Exists(File.DirInternal,\"instadb.db\")=Fal";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"instadb.db")==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=11075598;
 //BA.debugLineNum = 11075598;BA.debugLine="File.Copy(File.DirAssets,\"instadb.db\",File.DirIn";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"instadb.db",anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"instadb.db");
 };
RDebugUtils.currentLine=11075600;
 //BA.debugLineNum = 11075600;BA.debugLine="If sql1.IsInitialized=False Then";
if (_sql1.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=11075601;
 //BA.debugLineNum = 11075601;BA.debugLine="sql1.Initialize(File.DirInternal,\"instadb.db\",Fa";
_sql1.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"instadb.db",anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=11075605;
 //BA.debugLineNum = 11075605;BA.debugLine="cursor1 = sql1.ExecQuery(\"SELECT * FROM tbl_tele";
_cursor1.setObject((android.database.Cursor)(_sql1.ExecQuery("SELECT * FROM tbl_tele WHERE soich='1'")));
RDebugUtils.currentLine=11075606;
 //BA.debugLineNum = 11075606;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=11075607;
 //BA.debugLineNum = 11075607;BA.debugLine="For i=0 To cursor1.RowCount-1";
{
final int step15 = 1;
final int limit15 = (int) (_cursor1.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit15 ;_i = _i + step15 ) {
RDebugUtils.currentLine=11075608;
 //BA.debugLineNum = 11075608;BA.debugLine="cursor1.Position=i";
_cursor1.setPosition(_i);
RDebugUtils.currentLine=11075609;
 //BA.debugLineNum = 11075609;BA.debugLine="userid_t=cursor1.GetString(\"userid\")";
mostCurrent._userid_t = _cursor1.GetString("userid");
RDebugUtils.currentLine=11075610;
 //BA.debugLineNum = 11075610;BA.debugLine="username_t=cursor1.GetString(\"username\")";
mostCurrent._username_t = _cursor1.GetString("username");
 }
};
RDebugUtils.currentLine=11075612;
 //BA.debugLineNum = 11075612;BA.debugLine="cursor1.Close";
_cursor1.Close();
RDebugUtils.currentLine=11075615;
 //BA.debugLineNum = 11075615;BA.debugLine="Dim Gradient1 As GradientDrawable";
_gradient1 = new anywheresoftware.b4a.objects.drawable.GradientDrawable();
RDebugUtils.currentLine=11075616;
 //BA.debugLineNum = 11075616;BA.debugLine="Dim Clrs(5) As Int";
_clrs = new int[(int) (5)];
;
RDebugUtils.currentLine=11075617;
 //BA.debugLineNum = 11075617;BA.debugLine="Clrs(0) = 0xFFe8eaf6";
_clrs[(int) (0)] = (int) (0xffe8eaf6);
RDebugUtils.currentLine=11075618;
 //BA.debugLineNum = 11075618;BA.debugLine="Clrs(1) = 0xFFe8eaf6";
_clrs[(int) (1)] = (int) (0xffe8eaf6);
RDebugUtils.currentLine=11075619;
 //BA.debugLineNum = 11075619;BA.debugLine="Clrs(2) = 0xFFe8eaf6";
_clrs[(int) (2)] = (int) (0xffe8eaf6);
RDebugUtils.currentLine=11075620;
 //BA.debugLineNum = 11075620;BA.debugLine="Clrs(3) = 0xFF283593";
_clrs[(int) (3)] = (int) (0xff283593);
RDebugUtils.currentLine=11075621;
 //BA.debugLineNum = 11075621;BA.debugLine="Clrs(4) = 0xFF283593";
_clrs[(int) (4)] = (int) (0xff283593);
RDebugUtils.currentLine=11075623;
 //BA.debugLineNum = 11075623;BA.debugLine="Gradient1.Initialize(\"TOP_BOTTOM\", Clrs)";
_gradient1.Initialize(BA.getEnumFromString(android.graphics.drawable.GradientDrawable.Orientation.class,"TOP_BOTTOM"),_clrs);
RDebugUtils.currentLine=11075624;
 //BA.debugLineNum = 11075624;BA.debugLine="Activity.Background=Gradient1";
mostCurrent._activity.setBackground((android.graphics.drawable.Drawable)(_gradient1.getObject()));
RDebugUtils.currentLine=11075626;
 //BA.debugLineNum = 11075626;BA.debugLine="Dim bkcolor As ColorDrawable";
_bkcolor = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=11075627;
 //BA.debugLineNum = 11075627;BA.debugLine="bkcolor.Initialize(Colors.White,8)";
_bkcolor.Initialize(anywheresoftware.b4a.keywords.Common.Colors.White,(int) (8));
RDebugUtils.currentLine=11075628;
 //BA.debugLineNum = 11075628;BA.debugLine="meno.Initialize(\"meno\")";
mostCurrent._meno.Initialize(mostCurrent.activityBA,"meno");
RDebugUtils.currentLine=11075629;
 //BA.debugLineNum = 11075629;BA.debugLine="meno.TextColor=Colors.DarkGray";
mostCurrent._meno.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.DarkGray);
RDebugUtils.currentLine=11075630;
 //BA.debugLineNum = 11075630;BA.debugLine="meno.TextSize=37";
mostCurrent._meno.setTextSize((float) (37));
RDebugUtils.currentLine=11075631;
 //BA.debugLineNum = 11075631;BA.debugLine="meno.Background=bkcolor";
mostCurrent._meno.setBackground((android.graphics.drawable.Drawable)(_bkcolor.getObject()));
RDebugUtils.currentLine=11075632;
 //BA.debugLineNum = 11075632;BA.debugLine="meno.Typeface=Typeface.MATERIALICONS";
mostCurrent._meno.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.getMATERIALICONS());
RDebugUtils.currentLine=11075633;
 //BA.debugLineNum = 11075633;BA.debugLine="meno.Text=Chr(0xE3C7)";
mostCurrent._meno.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr((int) (0xe3c7))));
RDebugUtils.currentLine=11075634;
 //BA.debugLineNum = 11075634;BA.debugLine="meno.Gravity=Gravity.CENTER_HORIZONTAL+Gravity.CE";
mostCurrent._meno.setGravity((int) (anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL+anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=11075635;
 //BA.debugLineNum = 11075635;BA.debugLine="Activity.AddView(meno,3%x,3%x,12%x,12%x)";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._meno.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (3),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (3),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (12),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (12),mostCurrent.activityBA));
RDebugUtils.currentLine=11075637;
 //BA.debugLineNum = 11075637;BA.debugLine="pnl_coins.Initialize(\"pnl_coins\")";
mostCurrent._pnl_coins.Initialize(mostCurrent.activityBA,"pnl_coins");
RDebugUtils.currentLine=11075638;
 //BA.debugLineNum = 11075638;BA.debugLine="Activity.AddView(pnl_coins,50%x,3%x,50%x,12%x)";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._pnl_coins.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (50),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (3),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (50),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (12),mostCurrent.activityBA));
RDebugUtils.currentLine=11075639;
 //BA.debugLineNum = 11075639;BA.debugLine="roundview.Initialize(pnl_coins)";
mostCurrent._roundview.Initialize(processBA,(android.view.View)(mostCurrent._pnl_coins.getObject()));
RDebugUtils.currentLine=11075640;
 //BA.debugLineNum = 11075640;BA.debugLine="roundview.CornerRadius_BL=35";
mostCurrent._roundview.setCornerRadius_BL((int) (35));
RDebugUtils.currentLine=11075641;
 //BA.debugLineNum = 11075641;BA.debugLine="roundview.CornerRadius_TL=35";
mostCurrent._roundview.setCornerRadius_TL((int) (35));
RDebugUtils.currentLine=11075642;
 //BA.debugLineNum = 11075642;BA.debugLine="roundview.BackgroundColor=Colors.White";
mostCurrent._roundview.setBackgroundColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=11075644;
 //BA.debugLineNum = 11075644;BA.debugLine="Dim bkcolor_st As ColorDrawable";
_bkcolor_st = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=11075645;
 //BA.debugLineNum = 11075645;BA.debugLine="bkcolor_st.Initialize2(0xFFC67D00,50,4dip,0x82FFE";
_bkcolor_st.Initialize2((int) (0xffc67d00),(int) (50),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (4)),(int) (0x82ffe300));
RDebugUtils.currentLine=11075647;
 //BA.debugLineNum = 11075647;BA.debugLine="Dim pnlb1 As Panel";
_pnlb1 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=11075648;
 //BA.debugLineNum = 11075648;BA.debugLine="pnlb1.Initialize(\"\")";
_pnlb1.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=11075649;
 //BA.debugLineNum = 11075649;BA.debugLine="pnlb1.Color=0xFFFFC300";
_pnlb1.setColor((int) (0xffffc300));
RDebugUtils.currentLine=11075650;
 //BA.debugLineNum = 11075650;BA.debugLine="pnlb1.Background=bkcolor_st";
_pnlb1.setBackground((android.graphics.drawable.Drawable)(_bkcolor_st.getObject()));
RDebugUtils.currentLine=11075651;
 //BA.debugLineNum = 11075651;BA.debugLine="pnl_coins.AddView(pnlb1,pnl_coins.Width-11%x,1%x,";
mostCurrent._pnl_coins.AddView((android.view.View)(_pnlb1.getObject()),(int) (mostCurrent._pnl_coins.getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (11),mostCurrent.activityBA)),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (1),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA),(int) (mostCurrent._pnl_coins.getHeight()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (2),mostCurrent.activityBA)));
RDebugUtils.currentLine=11075653;
 //BA.debugLineNum = 11075653;BA.debugLine="lbl_icon.Initialize(\"lbl_icon\")";
mostCurrent._lbl_icon.Initialize(mostCurrent.activityBA,"lbl_icon");
RDebugUtils.currentLine=11075654;
 //BA.debugLineNum = 11075654;BA.debugLine="lbl_icon.SetBackgroundImage(LoadBitmap(File.DirAs";
mostCurrent._lbl_icon.SetBackgroundImageNew((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"coins.png").getObject()));
RDebugUtils.currentLine=11075655;
 //BA.debugLineNum = 11075655;BA.debugLine="pnl_coins.AddView(lbl_icon,pnl_coins.Width-9%x,pn";
mostCurrent._pnl_coins.AddView((android.view.View)(mostCurrent._lbl_icon.getObject()),(int) (mostCurrent._pnl_coins.getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (9),mostCurrent.activityBA)),(int) (mostCurrent._pnl_coins.getHeight()/(double)2/(double)2),(int) (mostCurrent._pnl_coins.getHeight()/(double)2),(int) (mostCurrent._pnl_coins.getHeight()/(double)2));
RDebugUtils.currentLine=11075657;
 //BA.debugLineNum = 11075657;BA.debugLine="lbl_nums.Initialize(\"lbl_nums\")";
mostCurrent._lbl_nums.Initialize(mostCurrent.activityBA,"lbl_nums");
RDebugUtils.currentLine=11075658;
 //BA.debugLineNum = 11075658;BA.debugLine="lbl_nums.TextColor=Colors.DarkGray";
mostCurrent._lbl_nums.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.DarkGray);
RDebugUtils.currentLine=11075659;
 //BA.debugLineNum = 11075659;BA.debugLine="lbl_nums.TextSize=20";
mostCurrent._lbl_nums.setTextSize((float) (20));
RDebugUtils.currentLine=11075660;
 //BA.debugLineNum = 11075660;BA.debugLine="lbl_nums.Typeface=Typeface.LoadFromAssets(\"iran_s";
mostCurrent._lbl_nums.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("iran_sans.ttf"));
RDebugUtils.currentLine=11075661;
 //BA.debugLineNum = 11075661;BA.debugLine="lbl_nums.Text=0&\" سکه\"";
mostCurrent._lbl_nums.setText(BA.ObjectToCharSequence(BA.NumberToString(0)+" سکه"));
RDebugUtils.currentLine=11075662;
 //BA.debugLineNum = 11075662;BA.debugLine="lbl_nums.Gravity=Gravity.CENTER_VERTICAL+Gravity.";
mostCurrent._lbl_nums.setGravity((int) (anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL+anywheresoftware.b4a.keywords.Common.Gravity.RIGHT));
RDebugUtils.currentLine=11075663;
 //BA.debugLineNum = 11075663;BA.debugLine="pnl_coins.AddView(lbl_nums,2%x,0,pnl_coins.Width-";
mostCurrent._pnl_coins.AddView((android.view.View)(mostCurrent._lbl_nums.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (2),mostCurrent.activityBA),(int) (0),(int) (mostCurrent._pnl_coins.getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (15),mostCurrent.activityBA)),mostCurrent._pnl_coins.getHeight());
RDebugUtils.currentLine=11075665;
 //BA.debugLineNum = 11075665;BA.debugLine="Dim pnl_main As Panel";
_pnl_main = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=11075666;
 //BA.debugLineNum = 11075666;BA.debugLine="pnl_main.Initialize(\"pnl_main\")";
_pnl_main.Initialize(mostCurrent.activityBA,"pnl_main");
RDebugUtils.currentLine=11075667;
 //BA.debugLineNum = 11075667;BA.debugLine="Dim bg As ColorDrawable";
_bg = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=11075668;
 //BA.debugLineNum = 11075668;BA.debugLine="bg.Initialize2(Colors.White,10dip,2dip,Colors.Lig";
_bg.Initialize2(anywheresoftware.b4a.keywords.Common.Colors.White,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (10)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (2)),anywheresoftware.b4a.keywords.Common.Colors.LightGray);
RDebugUtils.currentLine=11075669;
 //BA.debugLineNum = 11075669;BA.debugLine="pnl_main.Background=bg";
_pnl_main.setBackground((android.graphics.drawable.Drawable)(_bg.getObject()));
RDebugUtils.currentLine=11075670;
 //BA.debugLineNum = 11075670;BA.debugLine="Activity.AddView(pnl_main,5%x,18%x,90%x,100%y-23%";
mostCurrent._activity.AddView((android.view.View)(_pnl_main.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (18),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (90),mostCurrent.activityBA),(int) (anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA)-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (23),mostCurrent.activityBA)));
RDebugUtils.currentLine=11075672;
 //BA.debugLineNum = 11075672;BA.debugLine="WebView1.Initialize(\"WebView1\")";
mostCurrent._webview1.Initialize(mostCurrent.activityBA,"WebView1");
RDebugUtils.currentLine=11075673;
 //BA.debugLineNum = 11075673;BA.debugLine="WebView1.Color=Colors.White";
mostCurrent._webview1.setColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=11075674;
 //BA.debugLineNum = 11075674;BA.debugLine="Activity.AddView(WebView1, 0, 0,0, 1dip)";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._webview1.getObject()),(int) (0),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (1)));
RDebugUtils.currentLine=11075677;
 //BA.debugLineNum = 11075677;BA.debugLine="Select type_done";
switch (_type_done) {
case 1: {
RDebugUtils.currentLine=11075680;
 //BA.debugLineNum = 11075680;BA.debugLine="like_onCreateViewHolder(pnl_main)";
_like_oncreateviewholder(_pnl_main);
RDebugUtils.currentLine=11075681;
 //BA.debugLineNum = 11075681;BA.debugLine="req_getlike(\"2\",\"getl\")";
_req_getlike("2","getl");
RDebugUtils.currentLine=11075682;
 //BA.debugLineNum = 11075682;BA.debugLine="posi=0";
_posi = (int) (0);
 break; }
case 0: {
RDebugUtils.currentLine=11075684;
 //BA.debugLineNum = 11075684;BA.debugLine="follow_onCreateViewHolder(pnl_main)";
_follow_oncreateviewholder(_pnl_main);
RDebugUtils.currentLine=11075685;
 //BA.debugLineNum = 11075685;BA.debugLine="req_getlike(\"1\",\"getf\")";
_req_getlike("1","getf");
RDebugUtils.currentLine=11075686;
 //BA.debugLineNum = 11075686;BA.debugLine="posi=2";
_posi = (int) (2);
 break; }
}
;
RDebugUtils.currentLine=11075690;
 //BA.debugLineNum = 11075690;BA.debugLine="req_getme(\"\")";
_req_getme("");
RDebugUtils.currentLine=11075691;
 //BA.debugLineNum = 11075691;BA.debugLine="End Sub";
return "";
}
public static String  _like_oncreateviewholder(anywheresoftware.b4a.objects.PanelWrapper _parent) throws Exception{
RDebugUtils.currentModule="ac_tfreecoin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "like_oncreateviewholder", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "like_oncreateviewholder", new Object[] {_parent}));}
anywheresoftware.b4a.objects.PanelWrapper _pnl_prof = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _bg = null;
anywheresoftware.b4a.objects.PanelWrapper _pnl_caption = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl_caption = null;
anywheresoftware.b4a.objects.PanelWrapper _pnl_autolike = null;
de.amberhome.objects.appcompat.ACCheckBoxWrapper _ch_like = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl_notis = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl_req = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl_reqs = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl_next = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl_nexi = null;
RDebugUtils.currentLine=11534336;
 //BA.debugLineNum = 11534336;BA.debugLine="Sub like_onCreateViewHolder (Parent As Panel)";
RDebugUtils.currentLine=11534338;
 //BA.debugLineNum = 11534338;BA.debugLine="Dim pnl_prof As Panel";
_pnl_prof = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=11534339;
 //BA.debugLineNum = 11534339;BA.debugLine="pnl_prof.Initialize(\"pnl_prof\")";
_pnl_prof.Initialize(mostCurrent.activityBA,"pnl_prof");
RDebugUtils.currentLine=11534340;
 //BA.debugLineNum = 11534340;BA.debugLine="Dim bg As ColorDrawable";
_bg = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=11534341;
 //BA.debugLineNum = 11534341;BA.debugLine="bg.Initialize2(Colors.White,10dip,2dip,Colors.Lig";
_bg.Initialize2(anywheresoftware.b4a.keywords.Common.Colors.White,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (10)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (2)),anywheresoftware.b4a.keywords.Common.Colors.LightGray);
RDebugUtils.currentLine=11534342;
 //BA.debugLineNum = 11534342;BA.debugLine="pnl_prof.Background=bg";
_pnl_prof.setBackground((android.graphics.drawable.Drawable)(_bg.getObject()));
RDebugUtils.currentLine=11534343;
 //BA.debugLineNum = 11534343;BA.debugLine="Parent.AddView(pnl_prof,Parent.Width/2-20%x,5%x,4";
_parent.AddView((android.view.View)(_pnl_prof.getObject()),(int) (_parent.getWidth()/(double)2-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (20),mostCurrent.activityBA)),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (40),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (40),mostCurrent.activityBA));
RDebugUtils.currentLine=11534345;
 //BA.debugLineNum = 11534345;BA.debugLine="img_target.Initialize(\"img_target\")";
mostCurrent._img_target.Initialize(processBA,"img_target");
RDebugUtils.currentLine=11534346;
 //BA.debugLineNum = 11534346;BA.debugLine="img_target.Gravity=Gravity.FILL";
mostCurrent._img_target.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.FILL);
RDebugUtils.currentLine=11534347;
 //BA.debugLineNum = 11534347;BA.debugLine="pnl_prof.AddView(img_target,0,0,pnl_prof.Width,pn";
_pnl_prof.AddView((android.view.View)(mostCurrent._img_target.getObject()),(int) (0),(int) (0),_pnl_prof.getWidth(),_pnl_prof.getHeight());
RDebugUtils.currentLine=11534349;
 //BA.debugLineNum = 11534349;BA.debugLine="Dim pnl_caption As Panel";
_pnl_caption = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=11534350;
 //BA.debugLineNum = 11534350;BA.debugLine="pnl_caption.Initialize(\"pnl_caption\")";
_pnl_caption.Initialize(mostCurrent.activityBA,"pnl_caption");
RDebugUtils.currentLine=11534351;
 //BA.debugLineNum = 11534351;BA.debugLine="Dim bg As ColorDrawable";
_bg = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=11534352;
 //BA.debugLineNum = 11534352;BA.debugLine="bg.Initialize2(Colors.White,10dip,2dip,Colors.Lig";
_bg.Initialize2(anywheresoftware.b4a.keywords.Common.Colors.White,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (10)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (2)),anywheresoftware.b4a.keywords.Common.Colors.LightGray);
RDebugUtils.currentLine=11534353;
 //BA.debugLineNum = 11534353;BA.debugLine="pnl_caption.Background=bg";
_pnl_caption.setBackground((android.graphics.drawable.Drawable)(_bg.getObject()));
RDebugUtils.currentLine=11534354;
 //BA.debugLineNum = 11534354;BA.debugLine="pnl_caption.Visible=False";
_pnl_caption.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=11534355;
 //BA.debugLineNum = 11534355;BA.debugLine="Parent.AddView(pnl_caption,5%x,pnl_prof.Top+pnl_p";
_parent.AddView((android.view.View)(_pnl_caption.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA),(int) (_pnl_prof.getTop()+_pnl_prof.getHeight()+anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA)),(int) (_parent.getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA)),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (17),mostCurrent.activityBA));
RDebugUtils.currentLine=11534357;
 //BA.debugLineNum = 11534357;BA.debugLine="Dim lbl_caption As Label";
_lbl_caption = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=11534358;
 //BA.debugLineNum = 11534358;BA.debugLine="lbl_caption.Initialize(\"lbl_caption\")";
_lbl_caption.Initialize(mostCurrent.activityBA,"lbl_caption");
RDebugUtils.currentLine=11534359;
 //BA.debugLineNum = 11534359;BA.debugLine="lbl_caption.TextColor=Colors.DarkGray";
_lbl_caption.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.DarkGray);
RDebugUtils.currentLine=11534360;
 //BA.debugLineNum = 11534360;BA.debugLine="lbl_caption.TextSize=14";
_lbl_caption.setTextSize((float) (14));
RDebugUtils.currentLine=11534361;
 //BA.debugLineNum = 11534361;BA.debugLine="lbl_caption.Typeface=Typeface.LoadFromAssets(\"ira";
_lbl_caption.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("iran_sans.ttf"));
RDebugUtils.currentLine=11534362;
 //BA.debugLineNum = 11534362;BA.debugLine="lbl_caption.Text=\"کپشن پست در این قسمت\"";
_lbl_caption.setText(BA.ObjectToCharSequence("کپشن پست در این قسمت"));
RDebugUtils.currentLine=11534363;
 //BA.debugLineNum = 11534363;BA.debugLine="lbl_caption.Visible=False";
_lbl_caption.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=11534364;
 //BA.debugLineNum = 11534364;BA.debugLine="lbl_caption.Gravity=Gravity.CENTER_HORIZONTAL+Gra";
_lbl_caption.setGravity((int) (anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL+anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=11534365;
 //BA.debugLineNum = 11534365;BA.debugLine="pnl_caption.AddView(lbl_caption,0,0,pnl_caption.W";
_pnl_caption.AddView((android.view.View)(_lbl_caption.getObject()),(int) (0),(int) (0),_pnl_caption.getWidth(),_pnl_caption.getHeight());
RDebugUtils.currentLine=11534367;
 //BA.debugLineNum = 11534367;BA.debugLine="Dim pnl_autolike As Panel";
_pnl_autolike = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=11534368;
 //BA.debugLineNum = 11534368;BA.debugLine="pnl_autolike.Initialize(\"pnl_autolike\")";
_pnl_autolike.Initialize(mostCurrent.activityBA,"pnl_autolike");
RDebugUtils.currentLine=11534369;
 //BA.debugLineNum = 11534369;BA.debugLine="Dim bg As ColorDrawable";
_bg = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=11534370;
 //BA.debugLineNum = 11534370;BA.debugLine="bg.Initialize2(Colors.White,10dip,2dip,Colors.Lig";
_bg.Initialize2(anywheresoftware.b4a.keywords.Common.Colors.White,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (10)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (2)),anywheresoftware.b4a.keywords.Common.Colors.LightGray);
RDebugUtils.currentLine=11534371;
 //BA.debugLineNum = 11534371;BA.debugLine="pnl_autolike.Background=bg";
_pnl_autolike.setBackground((android.graphics.drawable.Drawable)(_bg.getObject()));
RDebugUtils.currentLine=11534372;
 //BA.debugLineNum = 11534372;BA.debugLine="Parent.AddView(pnl_autolike,5%x,pnl_caption.Top+p";
_parent.AddView((android.view.View)(_pnl_autolike.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA),(int) (_pnl_caption.getTop()+_pnl_caption.getHeight()+anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA)),(int) (_parent.getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA)),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (25),mostCurrent.activityBA));
RDebugUtils.currentLine=11534374;
 //BA.debugLineNum = 11534374;BA.debugLine="Dim ch_like As ACCheckBox";
_ch_like = new de.amberhome.objects.appcompat.ACCheckBoxWrapper();
RDebugUtils.currentLine=11534375;
 //BA.debugLineNum = 11534375;BA.debugLine="ch_like.Initialize(\"ch_like\")";
_ch_like.Initialize(mostCurrent.activityBA,"ch_like");
RDebugUtils.currentLine=11534376;
 //BA.debugLineNum = 11534376;BA.debugLine="ch_like.Text=\"بازدید خودکار\"";
_ch_like.setText(BA.ObjectToCharSequence("بازدید خودکار"));
RDebugUtils.currentLine=11534377;
 //BA.debugLineNum = 11534377;BA.debugLine="ch_like.Typeface=Typeface.LoadFromAssets(\"iran_sa";
_ch_like.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("iran_sans.ttf"));
RDebugUtils.currentLine=11534378;
 //BA.debugLineNum = 11534378;BA.debugLine="ch_like.TextSize=14";
_ch_like.setTextSize((float) (14));
RDebugUtils.currentLine=11534379;
 //BA.debugLineNum = 11534379;BA.debugLine="pnl_autolike.AddView(ch_like,5%x,5%x,pnl_autolike";
_pnl_autolike.AddView((android.view.View)(_ch_like.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA),(int) (_pnl_autolike.getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA)),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (7),mostCurrent.activityBA));
RDebugUtils.currentLine=11534381;
 //BA.debugLineNum = 11534381;BA.debugLine="Dim lbl_notis As Label";
_lbl_notis = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=11534382;
 //BA.debugLineNum = 11534382;BA.debugLine="lbl_notis.Initialize(\"lbl_notis\")";
_lbl_notis.Initialize(mostCurrent.activityBA,"lbl_notis");
RDebugUtils.currentLine=11534383;
 //BA.debugLineNum = 11534383;BA.debugLine="lbl_notis.TextColor=Colors.DarkGray";
_lbl_notis.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.DarkGray);
RDebugUtils.currentLine=11534384;
 //BA.debugLineNum = 11534384;BA.debugLine="lbl_notis.TextSize=11";
_lbl_notis.setTextSize((float) (11));
RDebugUtils.currentLine=11534385;
 //BA.debugLineNum = 11534385;BA.debugLine="lbl_notis.Typeface=Typeface.LoadFromAssets(\"iran_";
_lbl_notis.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("iran_sans.ttf"));
RDebugUtils.currentLine=11534386;
 //BA.debugLineNum = 11534386;BA.debugLine="lbl_notis.Text=\"نکته با فعال سازی این گزینه بصورت";
_lbl_notis.setText(BA.ObjectToCharSequence("نکته با فعال سازی این گزینه بصورت خودکار تمامی پست ها بازدید میشوند"));
RDebugUtils.currentLine=11534387;
 //BA.debugLineNum = 11534387;BA.debugLine="lbl_notis.Gravity=Gravity.CENTER_HORIZONTAL+Gravi";
_lbl_notis.setGravity((int) (anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL+anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=11534388;
 //BA.debugLineNum = 11534388;BA.debugLine="pnl_autolike.AddView(lbl_notis,0,5%x,pnl_autolike";
_pnl_autolike.AddView((android.view.View)(_lbl_notis.getObject()),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA),_pnl_autolike.getWidth(),_pnl_autolike.getHeight());
RDebugUtils.currentLine=11534390;
 //BA.debugLineNum = 11534390;BA.debugLine="Dim bg As ColorDrawable";
_bg = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=11534391;
 //BA.debugLineNum = 11534391;BA.debugLine="bg.Initialize2(0xFF9D00FF,10dip,2dip,Colors.Light";
_bg.Initialize2((int) (0xff9d00ff),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (10)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (2)),anywheresoftware.b4a.keywords.Common.Colors.LightGray);
RDebugUtils.currentLine=11534393;
 //BA.debugLineNum = 11534393;BA.debugLine="Dim lbl_req As Label";
_lbl_req = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=11534394;
 //BA.debugLineNum = 11534394;BA.debugLine="lbl_req.Initialize(\"lbl_req\")";
_lbl_req.Initialize(mostCurrent.activityBA,"lbl_req");
RDebugUtils.currentLine=11534395;
 //BA.debugLineNum = 11534395;BA.debugLine="lbl_req.TextColor=Colors.White";
_lbl_req.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=11534396;
 //BA.debugLineNum = 11534396;BA.debugLine="lbl_req.TextSize=17";
_lbl_req.setTextSize((float) (17));
RDebugUtils.currentLine=11534397;
 //BA.debugLineNum = 11534397;BA.debugLine="lbl_req.Typeface=Typeface.LoadFromAssets(\"iran_sa";
_lbl_req.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("iran_sans.ttf"));
RDebugUtils.currentLine=11534398;
 //BA.debugLineNum = 11534398;BA.debugLine="lbl_req.Text=\"بازدید\"";
_lbl_req.setText(BA.ObjectToCharSequence("بازدید"));
RDebugUtils.currentLine=11534399;
 //BA.debugLineNum = 11534399;BA.debugLine="lbl_req.Background=bg";
_lbl_req.setBackground((android.graphics.drawable.Drawable)(_bg.getObject()));
RDebugUtils.currentLine=11534400;
 //BA.debugLineNum = 11534400;BA.debugLine="lbl_req.Gravity=Gravity.CENTER_HORIZONTAL+Gravity";
_lbl_req.setGravity((int) (anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL+anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=11534401;
 //BA.debugLineNum = 11534401;BA.debugLine="Parent.AddView(lbl_req,5%x,pnl_autolike.Top+pnl_a";
_parent.AddView((android.view.View)(_lbl_req.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA),(int) (_pnl_autolike.getTop()+_pnl_autolike.getHeight()+anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA)),(int) (_parent.getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA)),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (12),mostCurrent.activityBA));
RDebugUtils.currentLine=11534403;
 //BA.debugLineNum = 11534403;BA.debugLine="Dim lbl_reqs As Label";
_lbl_reqs = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=11534404;
 //BA.debugLineNum = 11534404;BA.debugLine="lbl_reqs.Initialize(\"lbl_req\")";
_lbl_reqs.Initialize(mostCurrent.activityBA,"lbl_req");
RDebugUtils.currentLine=11534405;
 //BA.debugLineNum = 11534405;BA.debugLine="lbl_reqs.TextColor=Colors.White";
_lbl_reqs.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=11534406;
 //BA.debugLineNum = 11534406;BA.debugLine="lbl_reqs.TextSize=30";
_lbl_reqs.setTextSize((float) (30));
RDebugUtils.currentLine=11534407;
 //BA.debugLineNum = 11534407;BA.debugLine="lbl_reqs.Typeface=Typeface.MATERIALICONS";
_lbl_reqs.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.getMATERIALICONS());
RDebugUtils.currentLine=11534408;
 //BA.debugLineNum = 11534408;BA.debugLine="lbl_reqs.Text=Chr(0xE417)";
_lbl_reqs.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr((int) (0xe417))));
RDebugUtils.currentLine=11534409;
 //BA.debugLineNum = 11534409;BA.debugLine="lbl_reqs.Gravity=Gravity.CENTER_HORIZONTAL+Gravit";
_lbl_reqs.setGravity((int) (anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL+anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=11534410;
 //BA.debugLineNum = 11534410;BA.debugLine="Parent.AddView(lbl_reqs,15%x,pnl_autolike.Top+pnl";
_parent.AddView((android.view.View)(_lbl_reqs.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (15),mostCurrent.activityBA),(int) (_pnl_autolike.getTop()+_pnl_autolike.getHeight()+anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA)),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (12),mostCurrent.activityBA));
RDebugUtils.currentLine=11534412;
 //BA.debugLineNum = 11534412;BA.debugLine="Dim bg As ColorDrawable";
_bg = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=11534413;
 //BA.debugLineNum = 11534413;BA.debugLine="bg.Initialize2(0xFF454149,10dip,2dip,Colors.Light";
_bg.Initialize2((int) (0xff454149),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (10)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (2)),anywheresoftware.b4a.keywords.Common.Colors.LightGray);
RDebugUtils.currentLine=11534415;
 //BA.debugLineNum = 11534415;BA.debugLine="Dim lbl_next As Label";
_lbl_next = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=11534416;
 //BA.debugLineNum = 11534416;BA.debugLine="lbl_next.Initialize(\"lbl_next\")";
_lbl_next.Initialize(mostCurrent.activityBA,"lbl_next");
RDebugUtils.currentLine=11534417;
 //BA.debugLineNum = 11534417;BA.debugLine="lbl_next.TextColor=Colors.White";
_lbl_next.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=11534418;
 //BA.debugLineNum = 11534418;BA.debugLine="lbl_next.TextSize=17";
_lbl_next.setTextSize((float) (17));
RDebugUtils.currentLine=11534419;
 //BA.debugLineNum = 11534419;BA.debugLine="lbl_next.Typeface=Typeface.LoadFromAssets(\"iran_s";
_lbl_next.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("iran_sans.ttf"));
RDebugUtils.currentLine=11534420;
 //BA.debugLineNum = 11534420;BA.debugLine="lbl_next.Text=\"بعدی\"";
_lbl_next.setText(BA.ObjectToCharSequence("بعدی"));
RDebugUtils.currentLine=11534421;
 //BA.debugLineNum = 11534421;BA.debugLine="lbl_next.Background=bg";
_lbl_next.setBackground((android.graphics.drawable.Drawable)(_bg.getObject()));
RDebugUtils.currentLine=11534422;
 //BA.debugLineNum = 11534422;BA.debugLine="lbl_next.Gravity=Gravity.CENTER_HORIZONTAL+Gravit";
_lbl_next.setGravity((int) (anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL+anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=11534423;
 //BA.debugLineNum = 11534423;BA.debugLine="Parent.AddView(lbl_next,5%x,lbl_req.Top+lbl_req.H";
_parent.AddView((android.view.View)(_lbl_next.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA),(int) (_lbl_req.getTop()+_lbl_req.getHeight()+anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA)),(int) (_parent.getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA)),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (12),mostCurrent.activityBA));
RDebugUtils.currentLine=11534425;
 //BA.debugLineNum = 11534425;BA.debugLine="Dim lbl_nexi As Label";
_lbl_nexi = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=11534426;
 //BA.debugLineNum = 11534426;BA.debugLine="lbl_nexi.Initialize(\"lbl_next\")";
_lbl_nexi.Initialize(mostCurrent.activityBA,"lbl_next");
RDebugUtils.currentLine=11534427;
 //BA.debugLineNum = 11534427;BA.debugLine="lbl_nexi.TextColor=Colors.LightGray";
_lbl_nexi.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.LightGray);
RDebugUtils.currentLine=11534428;
 //BA.debugLineNum = 11534428;BA.debugLine="lbl_nexi.TextSize=30";
_lbl_nexi.setTextSize((float) (30));
RDebugUtils.currentLine=11534429;
 //BA.debugLineNum = 11534429;BA.debugLine="lbl_nexi.Typeface=Typeface.MATERIALICONS";
_lbl_nexi.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.getMATERIALICONS());
RDebugUtils.currentLine=11534430;
 //BA.debugLineNum = 11534430;BA.debugLine="lbl_nexi.Text=Chr(0xE15F)";
_lbl_nexi.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr((int) (0xe15f))));
RDebugUtils.currentLine=11534431;
 //BA.debugLineNum = 11534431;BA.debugLine="lbl_nexi.Gravity=Gravity.CENTER_HORIZONTAL+Gravit";
_lbl_nexi.setGravity((int) (anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL+anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=11534432;
 //BA.debugLineNum = 11534432;BA.debugLine="Parent.AddView(lbl_nexi,15%x,lbl_req.Top+lbl_req.";
_parent.AddView((android.view.View)(_lbl_nexi.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (15),mostCurrent.activityBA),(int) (_lbl_req.getTop()+_lbl_req.getHeight()+anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA)),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (12),mostCurrent.activityBA));
RDebugUtils.currentLine=11534433;
 //BA.debugLineNum = 11534433;BA.debugLine="End Sub";
return "";
}
public static String  _req_getlike(String _types,String _tagreq) throws Exception{
RDebugUtils.currentModule="ac_tfreecoin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "req_getlike", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "req_getlike", new Object[] {_types,_tagreq}));}
com.reza.sh.fastnet.Fastnet _prfn = null;
com.reza.sh.fastnet.PostRequestRaper _post = null;
RDebugUtils.currentLine=12124160;
 //BA.debugLineNum = 12124160;BA.debugLine="Sub req_getlike(types As String,tagreq As String)";
RDebugUtils.currentLine=12124161;
 //BA.debugLineNum = 12124161;BA.debugLine="Log(\"get\")";
anywheresoftware.b4a.keywords.Common.LogImpl("612124161","get",0);
RDebugUtils.currentLine=12124162;
 //BA.debugLineNum = 12124162;BA.debugLine="Dim prfn As PersianFastNetwork";
_prfn = new com.reza.sh.fastnet.Fastnet();
RDebugUtils.currentLine=12124164;
 //BA.debugLineNum = 12124164;BA.debugLine="prfn.initialize(\"prfn\")";
_prfn.initialize(processBA,"prfn");
RDebugUtils.currentLine=12124166;
 //BA.debugLineNum = 12124166;BA.debugLine="Dim post As PostRequest";
_post = new com.reza.sh.fastnet.PostRequestRaper();
RDebugUtils.currentLine=12124167;
 //BA.debugLineNum = 12124167;BA.debugLine="post=prfn.BuildPostQuery(\"http://filework.ir/INST";
_post = _prfn.BuildPostQuery("http://filework.ir/INSTAFOLLOW/api/req.php",_tagreq);
RDebugUtils.currentLine=12124169;
 //BA.debugLineNum = 12124169;BA.debugLine="post.addHeder(\"User-Agent\",\"Dalvik/1.6.0 (Linux;";
_post.addHeder("User-Agent","Dalvik/1.6.0 (Linux; U; Android 4.4.4; SM-A700FD Build/KTU84P)");
RDebugUtils.currentLine=12124171;
 //BA.debugLineNum = 12124171;BA.debugLine="post.addParametrs(\"types\",types)";
_post.addParametrs("types",_types);
RDebugUtils.currentLine=12124174;
 //BA.debugLineNum = 12124174;BA.debugLine="post.addParametrs(\"req\",\"get_telegram\")";
_post.addParametrs("req","get_telegram");
RDebugUtils.currentLine=12124178;
 //BA.debugLineNum = 12124178;BA.debugLine="post.executRequestAsString";
_post.executRequestAsString();
RDebugUtils.currentLine=12124179;
 //BA.debugLineNum = 12124179;BA.debugLine="ProgressDialogShow2(\"در حال دریافت لیست...\",True)";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow2(mostCurrent.activityBA,BA.ObjectToCharSequence("در حال دریافت لیست..."),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=12124180;
 //BA.debugLineNum = 12124180;BA.debugLine="End Sub";
return "";
}
public static String  _follow_oncreateviewholder(anywheresoftware.b4a.objects.PanelWrapper _parent) throws Exception{
RDebugUtils.currentModule="ac_tfreecoin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "follow_oncreateviewholder", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "follow_oncreateviewholder", new Object[] {_parent}));}
anywheresoftware.b4a.objects.PanelWrapper _pnl_prof = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _bg = null;
anywheresoftware.b4a.objects.PanelWrapper _pnl_caption = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl_caption = null;
anywheresoftware.b4a.objects.PanelWrapper _pnl_autolike = null;
de.amberhome.objects.appcompat.ACCheckBoxWrapper _ch_like = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl_notis = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl_req = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl_reqs = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl_next = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl_nexi = null;
RDebugUtils.currentLine=11665408;
 //BA.debugLineNum = 11665408;BA.debugLine="Sub follow_onCreateViewHolder (Parent As Panel)";
RDebugUtils.currentLine=11665410;
 //BA.debugLineNum = 11665410;BA.debugLine="Dim pnl_prof As Panel";
_pnl_prof = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=11665411;
 //BA.debugLineNum = 11665411;BA.debugLine="pnl_prof.Initialize(\"pnl_prof\")";
_pnl_prof.Initialize(mostCurrent.activityBA,"pnl_prof");
RDebugUtils.currentLine=11665412;
 //BA.debugLineNum = 11665412;BA.debugLine="Dim bg As ColorDrawable";
_bg = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=11665413;
 //BA.debugLineNum = 11665413;BA.debugLine="bg.Initialize2(Colors.White,10dip,2dip,Colors.Lig";
_bg.Initialize2(anywheresoftware.b4a.keywords.Common.Colors.White,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (10)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (2)),anywheresoftware.b4a.keywords.Common.Colors.LightGray);
RDebugUtils.currentLine=11665414;
 //BA.debugLineNum = 11665414;BA.debugLine="pnl_prof.Background=bg";
_pnl_prof.setBackground((android.graphics.drawable.Drawable)(_bg.getObject()));
RDebugUtils.currentLine=11665415;
 //BA.debugLineNum = 11665415;BA.debugLine="Parent.AddView(pnl_prof,Parent.Width/2-20%x,5%x,4";
_parent.AddView((android.view.View)(_pnl_prof.getObject()),(int) (_parent.getWidth()/(double)2-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (20),mostCurrent.activityBA)),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (40),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (40),mostCurrent.activityBA));
RDebugUtils.currentLine=11665417;
 //BA.debugLineNum = 11665417;BA.debugLine="img_target.Initialize(\"img_target\")";
mostCurrent._img_target.Initialize(processBA,"img_target");
RDebugUtils.currentLine=11665418;
 //BA.debugLineNum = 11665418;BA.debugLine="img_target.Gravity=Gravity.FILL";
mostCurrent._img_target.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.FILL);
RDebugUtils.currentLine=11665419;
 //BA.debugLineNum = 11665419;BA.debugLine="pnl_prof.AddView(img_target,0,0,pnl_prof.Width,pn";
_pnl_prof.AddView((android.view.View)(mostCurrent._img_target.getObject()),(int) (0),(int) (0),_pnl_prof.getWidth(),_pnl_prof.getHeight());
RDebugUtils.currentLine=11665421;
 //BA.debugLineNum = 11665421;BA.debugLine="Dim pnl_caption As Panel";
_pnl_caption = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=11665422;
 //BA.debugLineNum = 11665422;BA.debugLine="pnl_caption.Initialize(\"pnl_caption\")";
_pnl_caption.Initialize(mostCurrent.activityBA,"pnl_caption");
RDebugUtils.currentLine=11665423;
 //BA.debugLineNum = 11665423;BA.debugLine="Dim bg As ColorDrawable";
_bg = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=11665424;
 //BA.debugLineNum = 11665424;BA.debugLine="bg.Initialize2(Colors.White,10dip,2dip,Colors.Lig";
_bg.Initialize2(anywheresoftware.b4a.keywords.Common.Colors.White,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (10)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (2)),anywheresoftware.b4a.keywords.Common.Colors.LightGray);
RDebugUtils.currentLine=11665425;
 //BA.debugLineNum = 11665425;BA.debugLine="pnl_caption.Background=bg";
_pnl_caption.setBackground((android.graphics.drawable.Drawable)(_bg.getObject()));
RDebugUtils.currentLine=11665426;
 //BA.debugLineNum = 11665426;BA.debugLine="pnl_caption.Visible=False";
_pnl_caption.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=11665427;
 //BA.debugLineNum = 11665427;BA.debugLine="Parent.AddView(pnl_caption,5%x,pnl_prof.Top+pnl_p";
_parent.AddView((android.view.View)(_pnl_caption.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA),(int) (_pnl_prof.getTop()+_pnl_prof.getHeight()+anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA)),(int) (_parent.getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA)),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (17),mostCurrent.activityBA));
RDebugUtils.currentLine=11665429;
 //BA.debugLineNum = 11665429;BA.debugLine="Dim lbl_caption As Label";
_lbl_caption = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=11665430;
 //BA.debugLineNum = 11665430;BA.debugLine="lbl_caption.Initialize(\"lbl_caption\")";
_lbl_caption.Initialize(mostCurrent.activityBA,"lbl_caption");
RDebugUtils.currentLine=11665431;
 //BA.debugLineNum = 11665431;BA.debugLine="lbl_caption.Visible=False";
_lbl_caption.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=11665432;
 //BA.debugLineNum = 11665432;BA.debugLine="lbl_caption.TextColor=Colors.DarkGray";
_lbl_caption.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.DarkGray);
RDebugUtils.currentLine=11665433;
 //BA.debugLineNum = 11665433;BA.debugLine="lbl_caption.TextSize=14";
_lbl_caption.setTextSize((float) (14));
RDebugUtils.currentLine=11665434;
 //BA.debugLineNum = 11665434;BA.debugLine="lbl_caption.Typeface=Typeface.LoadFromAssets(\"ira";
_lbl_caption.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("iran_sans.ttf"));
RDebugUtils.currentLine=11665435;
 //BA.debugLineNum = 11665435;BA.debugLine="lbl_caption.Text=\"کپشن پست در این قسمت\"";
_lbl_caption.setText(BA.ObjectToCharSequence("کپشن پست در این قسمت"));
RDebugUtils.currentLine=11665436;
 //BA.debugLineNum = 11665436;BA.debugLine="lbl_caption.Gravity=Gravity.CENTER_HORIZONTAL+Gra";
_lbl_caption.setGravity((int) (anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL+anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=11665437;
 //BA.debugLineNum = 11665437;BA.debugLine="pnl_caption.AddView(lbl_caption,0,0,pnl_caption.W";
_pnl_caption.AddView((android.view.View)(_lbl_caption.getObject()),(int) (0),(int) (0),_pnl_caption.getWidth(),_pnl_caption.getHeight());
RDebugUtils.currentLine=11665439;
 //BA.debugLineNum = 11665439;BA.debugLine="Dim pnl_autolike As Panel";
_pnl_autolike = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=11665440;
 //BA.debugLineNum = 11665440;BA.debugLine="pnl_autolike.Initialize(\"pnl_autolike\")";
_pnl_autolike.Initialize(mostCurrent.activityBA,"pnl_autolike");
RDebugUtils.currentLine=11665441;
 //BA.debugLineNum = 11665441;BA.debugLine="Dim bg As ColorDrawable";
_bg = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=11665442;
 //BA.debugLineNum = 11665442;BA.debugLine="bg.Initialize2(Colors.White,10dip,2dip,Colors.Lig";
_bg.Initialize2(anywheresoftware.b4a.keywords.Common.Colors.White,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (10)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (2)),anywheresoftware.b4a.keywords.Common.Colors.LightGray);
RDebugUtils.currentLine=11665443;
 //BA.debugLineNum = 11665443;BA.debugLine="pnl_autolike.Background=bg";
_pnl_autolike.setBackground((android.graphics.drawable.Drawable)(_bg.getObject()));
RDebugUtils.currentLine=11665444;
 //BA.debugLineNum = 11665444;BA.debugLine="Parent.AddView(pnl_autolike,5%x,pnl_caption.Top+p";
_parent.AddView((android.view.View)(_pnl_autolike.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA),(int) (_pnl_caption.getTop()+_pnl_caption.getHeight()+anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA)),(int) (_parent.getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA)),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (25),mostCurrent.activityBA));
RDebugUtils.currentLine=11665446;
 //BA.debugLineNum = 11665446;BA.debugLine="Dim ch_like As ACCheckBox";
_ch_like = new de.amberhome.objects.appcompat.ACCheckBoxWrapper();
RDebugUtils.currentLine=11665447;
 //BA.debugLineNum = 11665447;BA.debugLine="ch_like.Initialize(\"ch_like\")";
_ch_like.Initialize(mostCurrent.activityBA,"ch_like");
RDebugUtils.currentLine=11665448;
 //BA.debugLineNum = 11665448;BA.debugLine="ch_like.Text=\"جوین خودکار\"";
_ch_like.setText(BA.ObjectToCharSequence("جوین خودکار"));
RDebugUtils.currentLine=11665449;
 //BA.debugLineNum = 11665449;BA.debugLine="ch_like.Typeface=Typeface.LoadFromAssets(\"iran_sa";
_ch_like.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("iran_sans.ttf"));
RDebugUtils.currentLine=11665450;
 //BA.debugLineNum = 11665450;BA.debugLine="ch_like.TextSize=14";
_ch_like.setTextSize((float) (14));
RDebugUtils.currentLine=11665451;
 //BA.debugLineNum = 11665451;BA.debugLine="pnl_autolike.AddView(ch_like,5%x,5%x,pnl_autolike";
_pnl_autolike.AddView((android.view.View)(_ch_like.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA),(int) (_pnl_autolike.getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA)),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (7),mostCurrent.activityBA));
RDebugUtils.currentLine=11665453;
 //BA.debugLineNum = 11665453;BA.debugLine="Dim lbl_notis As Label";
_lbl_notis = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=11665454;
 //BA.debugLineNum = 11665454;BA.debugLine="lbl_notis.Initialize(\"lbl_notis\")";
_lbl_notis.Initialize(mostCurrent.activityBA,"lbl_notis");
RDebugUtils.currentLine=11665455;
 //BA.debugLineNum = 11665455;BA.debugLine="lbl_notis.TextColor=Colors.DarkGray";
_lbl_notis.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.DarkGray);
RDebugUtils.currentLine=11665456;
 //BA.debugLineNum = 11665456;BA.debugLine="lbl_notis.TextSize=11";
_lbl_notis.setTextSize((float) (11));
RDebugUtils.currentLine=11665457;
 //BA.debugLineNum = 11665457;BA.debugLine="lbl_notis.Typeface=Typeface.LoadFromAssets(\"iran_";
_lbl_notis.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("iran_sans.ttf"));
RDebugUtils.currentLine=11665458;
 //BA.debugLineNum = 11665458;BA.debugLine="lbl_notis.Text=\"نکته با فعال سازی این گزینه بصورت";
_lbl_notis.setText(BA.ObjectToCharSequence("نکته با فعال سازی این گزینه بصورت خودکار وارد کانال میشوید"));
RDebugUtils.currentLine=11665459;
 //BA.debugLineNum = 11665459;BA.debugLine="lbl_notis.Gravity=Gravity.CENTER_HORIZONTAL+Gravi";
_lbl_notis.setGravity((int) (anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL+anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=11665460;
 //BA.debugLineNum = 11665460;BA.debugLine="pnl_autolike.AddView(lbl_notis,0,5%x,pnl_autolike";
_pnl_autolike.AddView((android.view.View)(_lbl_notis.getObject()),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA),_pnl_autolike.getWidth(),_pnl_autolike.getHeight());
RDebugUtils.currentLine=11665462;
 //BA.debugLineNum = 11665462;BA.debugLine="Dim bg As ColorDrawable";
_bg = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=11665463;
 //BA.debugLineNum = 11665463;BA.debugLine="bg.Initialize2(0xFF9D00FF,10dip,2dip,Colors.Light";
_bg.Initialize2((int) (0xff9d00ff),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (10)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (2)),anywheresoftware.b4a.keywords.Common.Colors.LightGray);
RDebugUtils.currentLine=11665465;
 //BA.debugLineNum = 11665465;BA.debugLine="Dim lbl_req As Label";
_lbl_req = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=11665466;
 //BA.debugLineNum = 11665466;BA.debugLine="lbl_req.Initialize(\"lbl_req\")";
_lbl_req.Initialize(mostCurrent.activityBA,"lbl_req");
RDebugUtils.currentLine=11665467;
 //BA.debugLineNum = 11665467;BA.debugLine="lbl_req.TextColor=Colors.White";
_lbl_req.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=11665468;
 //BA.debugLineNum = 11665468;BA.debugLine="lbl_req.TextSize=17";
_lbl_req.setTextSize((float) (17));
RDebugUtils.currentLine=11665469;
 //BA.debugLineNum = 11665469;BA.debugLine="lbl_req.Typeface=Typeface.LoadFromAssets(\"iran_sa";
_lbl_req.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("iran_sans.ttf"));
RDebugUtils.currentLine=11665470;
 //BA.debugLineNum = 11665470;BA.debugLine="lbl_req.Text=\"جوین\"";
_lbl_req.setText(BA.ObjectToCharSequence("جوین"));
RDebugUtils.currentLine=11665471;
 //BA.debugLineNum = 11665471;BA.debugLine="lbl_req.Background=bg";
_lbl_req.setBackground((android.graphics.drawable.Drawable)(_bg.getObject()));
RDebugUtils.currentLine=11665472;
 //BA.debugLineNum = 11665472;BA.debugLine="lbl_req.Gravity=Gravity.CENTER_HORIZONTAL+Gravity";
_lbl_req.setGravity((int) (anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL+anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=11665473;
 //BA.debugLineNum = 11665473;BA.debugLine="Parent.AddView(lbl_req,5%x,pnl_autolike.Top+pnl_a";
_parent.AddView((android.view.View)(_lbl_req.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA),(int) (_pnl_autolike.getTop()+_pnl_autolike.getHeight()+anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA)),(int) (_parent.getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA)),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (12),mostCurrent.activityBA));
RDebugUtils.currentLine=11665475;
 //BA.debugLineNum = 11665475;BA.debugLine="Dim lbl_reqs As Label";
_lbl_reqs = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=11665476;
 //BA.debugLineNum = 11665476;BA.debugLine="lbl_reqs.Initialize(\"lbl_req\")";
_lbl_reqs.Initialize(mostCurrent.activityBA,"lbl_req");
RDebugUtils.currentLine=11665477;
 //BA.debugLineNum = 11665477;BA.debugLine="lbl_reqs.TextColor=Colors.White";
_lbl_reqs.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=11665478;
 //BA.debugLineNum = 11665478;BA.debugLine="lbl_reqs.TextSize=30";
_lbl_reqs.setTextSize((float) (30));
RDebugUtils.currentLine=11665479;
 //BA.debugLineNum = 11665479;BA.debugLine="lbl_reqs.Typeface=Typeface.MATERIALICONS";
_lbl_reqs.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.getMATERIALICONS());
RDebugUtils.currentLine=11665480;
 //BA.debugLineNum = 11665480;BA.debugLine="lbl_reqs.Text=Chr(0xE7FE)";
_lbl_reqs.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr((int) (0xe7fe))));
RDebugUtils.currentLine=11665481;
 //BA.debugLineNum = 11665481;BA.debugLine="lbl_reqs.Gravity=Gravity.CENTER_HORIZONTAL+Gravit";
_lbl_reqs.setGravity((int) (anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL+anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=11665482;
 //BA.debugLineNum = 11665482;BA.debugLine="Parent.AddView(lbl_reqs,15%x,pnl_autolike.Top+pnl";
_parent.AddView((android.view.View)(_lbl_reqs.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (15),mostCurrent.activityBA),(int) (_pnl_autolike.getTop()+_pnl_autolike.getHeight()+anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA)),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (12),mostCurrent.activityBA));
RDebugUtils.currentLine=11665484;
 //BA.debugLineNum = 11665484;BA.debugLine="Dim bg As ColorDrawable";
_bg = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=11665485;
 //BA.debugLineNum = 11665485;BA.debugLine="bg.Initialize2(0xFF454149,10dip,2dip,Colors.Light";
_bg.Initialize2((int) (0xff454149),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (10)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (2)),anywheresoftware.b4a.keywords.Common.Colors.LightGray);
RDebugUtils.currentLine=11665487;
 //BA.debugLineNum = 11665487;BA.debugLine="Dim lbl_next As Label";
_lbl_next = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=11665488;
 //BA.debugLineNum = 11665488;BA.debugLine="lbl_next.Initialize(\"lbl_next\")";
_lbl_next.Initialize(mostCurrent.activityBA,"lbl_next");
RDebugUtils.currentLine=11665489;
 //BA.debugLineNum = 11665489;BA.debugLine="lbl_next.TextColor=Colors.White";
_lbl_next.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=11665490;
 //BA.debugLineNum = 11665490;BA.debugLine="lbl_next.TextSize=17";
_lbl_next.setTextSize((float) (17));
RDebugUtils.currentLine=11665491;
 //BA.debugLineNum = 11665491;BA.debugLine="lbl_next.Typeface=Typeface.LoadFromAssets(\"iran_s";
_lbl_next.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("iran_sans.ttf"));
RDebugUtils.currentLine=11665492;
 //BA.debugLineNum = 11665492;BA.debugLine="lbl_next.Text=\"بعدی\"";
_lbl_next.setText(BA.ObjectToCharSequence("بعدی"));
RDebugUtils.currentLine=11665493;
 //BA.debugLineNum = 11665493;BA.debugLine="lbl_next.Background=bg";
_lbl_next.setBackground((android.graphics.drawable.Drawable)(_bg.getObject()));
RDebugUtils.currentLine=11665494;
 //BA.debugLineNum = 11665494;BA.debugLine="lbl_next.Gravity=Gravity.CENTER_HORIZONTAL+Gravit";
_lbl_next.setGravity((int) (anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL+anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=11665495;
 //BA.debugLineNum = 11665495;BA.debugLine="Parent.AddView(lbl_next,5%x,lbl_req.Top+lbl_req.H";
_parent.AddView((android.view.View)(_lbl_next.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA),(int) (_lbl_req.getTop()+_lbl_req.getHeight()+anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA)),(int) (_parent.getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA)),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (12),mostCurrent.activityBA));
RDebugUtils.currentLine=11665497;
 //BA.debugLineNum = 11665497;BA.debugLine="Dim lbl_nexi As Label";
_lbl_nexi = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=11665498;
 //BA.debugLineNum = 11665498;BA.debugLine="lbl_nexi.Initialize(\"lbl_next\")";
_lbl_nexi.Initialize(mostCurrent.activityBA,"lbl_next");
RDebugUtils.currentLine=11665499;
 //BA.debugLineNum = 11665499;BA.debugLine="lbl_nexi.TextColor=Colors.LightGray";
_lbl_nexi.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.LightGray);
RDebugUtils.currentLine=11665500;
 //BA.debugLineNum = 11665500;BA.debugLine="lbl_nexi.TextSize=30";
_lbl_nexi.setTextSize((float) (30));
RDebugUtils.currentLine=11665501;
 //BA.debugLineNum = 11665501;BA.debugLine="lbl_nexi.Typeface=Typeface.MATERIALICONS";
_lbl_nexi.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.getMATERIALICONS());
RDebugUtils.currentLine=11665502;
 //BA.debugLineNum = 11665502;BA.debugLine="lbl_nexi.Text=Chr(0xE15F)";
_lbl_nexi.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr((int) (0xe15f))));
RDebugUtils.currentLine=11665503;
 //BA.debugLineNum = 11665503;BA.debugLine="lbl_nexi.Gravity=Gravity.CENTER_HORIZONTAL+Gravit";
_lbl_nexi.setGravity((int) (anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL+anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=11665504;
 //BA.debugLineNum = 11665504;BA.debugLine="Parent.AddView(lbl_nexi,15%x,lbl_req.Top+lbl_req.";
_parent.AddView((android.view.View)(_lbl_nexi.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (15),mostCurrent.activityBA),(int) (_lbl_req.getTop()+_lbl_req.getHeight()+anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA)),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (12),mostCurrent.activityBA));
RDebugUtils.currentLine=11665505;
 //BA.debugLineNum = 11665505;BA.debugLine="End Sub";
return "";
}
public static String  _req_getme(String _userid) throws Exception{
RDebugUtils.currentModule="ac_tfreecoin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "req_getme", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "req_getme", new Object[] {_userid}));}
com.reza.sh.fastnet.Fastnet _prfn = null;
com.reza.sh.fastnet.PostRequestRaper _post = null;
RDebugUtils.currentLine=11337728;
 //BA.debugLineNum = 11337728;BA.debugLine="Sub req_getme(userid As String)";
RDebugUtils.currentLine=11337729;
 //BA.debugLineNum = 11337729;BA.debugLine="Dim prfn As PersianFastNetwork";
_prfn = new com.reza.sh.fastnet.Fastnet();
RDebugUtils.currentLine=11337730;
 //BA.debugLineNum = 11337730;BA.debugLine="prfn.initialize(\"prfn\")";
_prfn.initialize(processBA,"prfn");
RDebugUtils.currentLine=11337732;
 //BA.debugLineNum = 11337732;BA.debugLine="Dim post As PostRequest";
_post = new com.reza.sh.fastnet.PostRequestRaper();
RDebugUtils.currentLine=11337733;
 //BA.debugLineNum = 11337733;BA.debugLine="post=prfn.BuildPostQuery(\"http://filework.ir/INST";
_post = _prfn.BuildPostQuery("http://filework.ir/INSTAFOLLOW/api/req.php","getinsta");
RDebugUtils.currentLine=11337735;
 //BA.debugLineNum = 11337735;BA.debugLine="post.addHeder(\"User-Agent\",\"Dalvik/1.6.0 (Linux;";
_post.addHeder("User-Agent","Dalvik/1.6.0 (Linux; U; Android 4.4.4; SM-A700FD Build/KTU84P)");
RDebugUtils.currentLine=11337737;
 //BA.debugLineNum = 11337737;BA.debugLine="post.addParametrs(\"ui\",\"1\")";
_post.addParametrs("ui","1");
RDebugUtils.currentLine=11337738;
 //BA.debugLineNum = 11337738;BA.debugLine="post.addParametrs(\"userid\",userid_t)";
_post.addParametrs("userid",mostCurrent._userid_t);
RDebugUtils.currentLine=11337740;
 //BA.debugLineNum = 11337740;BA.debugLine="post.addParametrs(\"req\",\"get_acct\")";
_post.addParametrs("req","get_acct");
RDebugUtils.currentLine=11337743;
 //BA.debugLineNum = 11337743;BA.debugLine="post.executRequestAsString";
_post.executRequestAsString();
RDebugUtils.currentLine=11337744;
 //BA.debugLineNum = 11337744;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="ac_tfreecoin";
RDebugUtils.currentLine=11206656;
 //BA.debugLineNum = 11206656;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=11206658;
 //BA.debugLineNum = 11206658;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="ac_tfreecoin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=11141120;
 //BA.debugLineNum = 11141120;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=11141121;
 //BA.debugLineNum = 11141121;BA.debugLine="req_getme(\"\")";
_req_getme("");
RDebugUtils.currentLine=11141123;
 //BA.debugLineNum = 11141123;BA.debugLine="End Sub";
return "";
}
public static void  _auto_done(boolean _runing) throws Exception{
RDebugUtils.currentModule="ac_tfreecoin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "auto_done", false))
	 {Debug.delegate(mostCurrent.activityBA, "auto_done", new Object[] {_runing}); return;}
ResumableSub_auto_done rsub = new ResumableSub_auto_done(null,_runing);
rsub.resume(processBA, null);
}
public static class ResumableSub_auto_done extends BA.ResumableSub {
public ResumableSub_auto_done(com.it.fome.ac_tfreecoin parent,boolean _runing) {
this.parent = parent;
this._runing = _runing;
}
com.it.fome.ac_tfreecoin parent;
boolean _runing;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ac_tfreecoin";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=11993089;
 //BA.debugLineNum = 11993089;BA.debugLine="Do While (runing)";
if (true) break;

case 1:
//do while
this.state = 10;
while ((_runing)) {
this.state = 3;
if (true) break;
}
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=11993092;
 //BA.debugLineNum = 11993092;BA.debugLine="Select type_done";
if (true) break;

case 4:
//select
this.state = 9;
switch (parent._type_done) {
case 1: {
this.state = 6;
if (true) break;
}
case 0: {
this.state = 8;
if (true) break;
}
}
if (true) break;

case 6:
//C
this.state = 9;
RDebugUtils.currentLine=11993094;
 //BA.debugLineNum = 11993094;BA.debugLine="ProgressDialogShow2(\"درحال بازدید خودکار\",Fals";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow2(mostCurrent.activityBA,BA.ObjectToCharSequence("درحال بازدید خودکار"),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=11993096;
 //BA.debugLineNum = 11993096;BA.debugLine="lbl_req_Click";
_lbl_req_click();
RDebugUtils.currentLine=11993097;
 //BA.debugLineNum = 11993097;BA.debugLine="Sleep(4000)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ac_tfreecoin", "auto_done"),(int) (4000));
this.state = 11;
return;
case 11:
//C
this.state = 9;
;
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=11993101;
 //BA.debugLineNum = 11993101;BA.debugLine="Log(nff)";
anywheresoftware.b4a.keywords.Common.LogImpl("611993101",BA.NumberToString(parent._nff),0);
RDebugUtils.currentLine=11993102;
 //BA.debugLineNum = 11993102;BA.debugLine="ProgressDialogShow2(\"درحال جوین خودکار\",False)";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow2(mostCurrent.activityBA,BA.ObjectToCharSequence("درحال جوین خودکار"),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=11993104;
 //BA.debugLineNum = 11993104;BA.debugLine="lbl_req_Click";
_lbl_req_click();
RDebugUtils.currentLine=11993105;
 //BA.debugLineNum = 11993105;BA.debugLine="Sleep(4000)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ac_tfreecoin", "auto_done"),(int) (4000));
this.state = 12;
return;
case 12:
//C
this.state = 9;
;
 if (true) break;

case 9:
//C
this.state = 1;
;
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=11993112;
 //BA.debugLineNum = 11993112;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _lbl_req_click() throws Exception{
RDebugUtils.currentModule="ac_tfreecoin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lbl_req_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "lbl_req_click", null); return;}
ResumableSub_lbl_req_Click rsub = new ResumableSub_lbl_req_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_lbl_req_Click extends BA.ResumableSub {
public ResumableSub_lbl_req_Click(com.it.fome.ac_tfreecoin parent) {
this.parent = parent;
}
com.it.fome.ac_tfreecoin parent;
long _ln_chatid = 0L;
long _ln_msgid = 0L;
uk.co.martinpearman.b4a.webkit.DefaultJavascriptInterface _javascriptinterface1 = null;
String _urls = "";
String _url = "";
String _value = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ac_tfreecoin";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=11796481;
 //BA.debugLineNum = 11796481;BA.debugLine="Select type_done";
if (true) break;

case 1:
//select
this.state = 38;
switch (parent._type_done) {
case 1: {
this.state = 3;
if (true) break;
}
case 2: {
this.state = 17;
if (true) break;
}
case 0: {
this.state = 25;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=11796485;
 //BA.debugLineNum = 11796485;BA.debugLine="If nll=0 Then";
if (true) break;

case 4:
//if
this.state = 15;
if (parent._nll==0) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 15;
RDebugUtils.currentLine=11796486;
 //BA.debugLineNum = 11796486;BA.debugLine="Log(\"get new list\")";
anywheresoftware.b4a.keywords.Common.LogImpl("611796486","get new list",0);
RDebugUtils.currentLine=11796487;
 //BA.debugLineNum = 11796487;BA.debugLine="req_getlike(\"2\",\"getl\")";
_req_getlike("2","getl");
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=11796490;
 //BA.debugLineNum = 11796490;BA.debugLine="posi=0";
parent._posi = (int) (0);
RDebugUtils.currentLine=11796491;
 //BA.debugLineNum = 11796491;BA.debugLine="ProgressDialogShow(\"در حال بازدید...\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("در حال بازدید..."));
RDebugUtils.currentLine=11796493;
 //BA.debugLineNum = 11796493;BA.debugLine="Log(\"chat id \"&list_like(6).Get(nll))";
anywheresoftware.b4a.keywords.Common.LogImpl("611796493","chat id "+BA.ObjectToString(parent.mostCurrent._list_like[(int) (6)].Get(parent._nll)),0);
RDebugUtils.currentLine=11796494;
 //BA.debugLineNum = 11796494;BA.debugLine="Log(\"msg id \"&list_like(10).Get(nll))";
anywheresoftware.b4a.keywords.Common.LogImpl("611796494","msg id "+BA.ObjectToString(parent.mostCurrent._list_like[(int) (10)].Get(parent._nll)),0);
RDebugUtils.currentLine=11796495;
 //BA.debugLineNum = 11796495;BA.debugLine="Log(\"user \"&list_like(11).Get(nll))";
anywheresoftware.b4a.keywords.Common.LogImpl("611796495","user "+BA.ObjectToString(parent.mostCurrent._list_like[(int) (11)].Get(parent._nll)),0);
RDebugUtils.currentLine=11796496;
 //BA.debugLineNum = 11796496;BA.debugLine="Dim ln_chatid,ln_msgid As Long";
_ln_chatid = 0L;
_ln_msgid = 0L;
RDebugUtils.currentLine=11796497;
 //BA.debugLineNum = 11796497;BA.debugLine="ln_chatid=list_like(6).Get(nll)";
_ln_chatid = BA.ObjectToLongNumber(parent.mostCurrent._list_like[(int) (6)].Get(parent._nll));
RDebugUtils.currentLine=11796498;
 //BA.debugLineNum = 11796498;BA.debugLine="ln_msgid=list_like(10).Get(nll)";
_ln_msgid = BA.ObjectToLongNumber(parent.mostCurrent._list_like[(int) (10)].Get(parent._nll));
RDebugUtils.currentLine=11796501;
 //BA.debugLineNum = 11796501;BA.debugLine="Dim JavascriptInterface1 As DefaultJavascriptI";
_javascriptinterface1 = new uk.co.martinpearman.b4a.webkit.DefaultJavascriptInterface();
RDebugUtils.currentLine=11796502;
 //BA.debugLineNum = 11796502;BA.debugLine="JavascriptInterface1.Initialize";
_javascriptinterface1.Initialize(mostCurrent.activityBA);
RDebugUtils.currentLine=11796503;
 //BA.debugLineNum = 11796503;BA.debugLine="WebViewExtras1.Initialize(WebView1)";
parent.mostCurrent._webviewextras1.Initialize((android.webkit.WebView)(parent.mostCurrent._webview1.getObject()));
RDebugUtils.currentLine=11796504;
 //BA.debugLineNum = 11796504;BA.debugLine="WebViewExtras1.addJavascriptInterface(Javascri";
parent.mostCurrent._webviewextras1.AddJavascriptInterface((Object)(_javascriptinterface1),"B4A");
RDebugUtils.currentLine=11796505;
 //BA.debugLineNum = 11796505;BA.debugLine="ln_msgid=ln_msgid/1048576";
_ln_msgid = (long) (_ln_msgid/(double)1048576);
RDebugUtils.currentLine=11796506;
 //BA.debugLineNum = 11796506;BA.debugLine="Dim urls As String";
_urls = "";
RDebugUtils.currentLine=11796507;
 //BA.debugLineNum = 11796507;BA.debugLine="urls=\"https://t.me/\"&list_like(11).Get(nll)&\"/";
_urls = "https://t.me/"+BA.ObjectToString(parent.mostCurrent._list_like[(int) (11)].Get(parent._nll))+"/"+BA.NumberToString(_ln_msgid);
RDebugUtils.currentLine=11796508;
 //BA.debugLineNum = 11796508;BA.debugLine="Log(urls)";
anywheresoftware.b4a.keywords.Common.LogImpl("611796508",_urls,0);
RDebugUtils.currentLine=11796510;
 //BA.debugLineNum = 11796510;BA.debugLine="WebViewExtras1.LoadUrl(urls)";
parent.mostCurrent._webviewextras1.LoadUrl(_urls);
RDebugUtils.currentLine=11796511;
 //BA.debugLineNum = 11796511;BA.debugLine="Wait For WebView1_PageFinished (url As String)";
anywheresoftware.b4a.keywords.Common.WaitFor("webview1_pagefinished", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ac_tfreecoin", "lbl_req_click"), null);
this.state = 39;
return;
case 39:
//C
this.state = 9;
_url = (String) result[0];
;
RDebugUtils.currentLine=11796512;
 //BA.debugLineNum = 11796512;BA.debugLine="If url=urls Then";
if (true) break;

case 9:
//if
this.state = 14;
if ((_url).equals(_urls)) { 
this.state = 11;
}else {
this.state = 13;
}if (true) break;

case 11:
//C
this.state = 14;
RDebugUtils.currentLine=11796513;
 //BA.debugLineNum = 11796513;BA.debugLine="Log(url)";
anywheresoftware.b4a.keywords.Common.LogImpl("611796513",_url,0);
RDebugUtils.currentLine=11796514;
 //BA.debugLineNum = 11796514;BA.debugLine="setreq(userid_t,list_like(8).Get(nll),1)";
_setreq(parent.mostCurrent._userid_t,BA.ObjectToString(parent.mostCurrent._list_like[(int) (8)].Get(parent._nll)),BA.NumberToString(1));
RDebugUtils.currentLine=11796516;
 //BA.debugLineNum = 11796516;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=11796518;
 //BA.debugLineNum = 11796518;BA.debugLine="getnex(posi)";
_getnex(parent._posi);
RDebugUtils.currentLine=11796519;
 //BA.debugLineNum = 11796519;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 if (true) break;

case 14:
//C
this.state = 15;
;
 if (true) break;

case 15:
//C
this.state = 38;
;
 if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=11796586;
 //BA.debugLineNum = 11796586;BA.debugLine="If ncc=0 Then";
if (true) break;

case 18:
//if
this.state = 23;
if (parent._ncc==0) { 
this.state = 20;
}else {
this.state = 22;
}if (true) break;

case 20:
//C
this.state = 23;
RDebugUtils.currentLine=11796587;
 //BA.debugLineNum = 11796587;BA.debugLine="Log(\"get new list\")";
anywheresoftware.b4a.keywords.Common.LogImpl("611796587","get new list",0);
RDebugUtils.currentLine=11796588;
 //BA.debugLineNum = 11796588;BA.debugLine="req_getlike(\"2\",\"getc\")";
_req_getlike("2","getc");
 if (true) break;

case 22:
//C
this.state = 23;
 if (true) break;

case 23:
//C
this.state = 38;
;
 if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=11796599;
 //BA.debugLineNum = 11796599;BA.debugLine="posi=2";
parent._posi = (int) (2);
RDebugUtils.currentLine=11796600;
 //BA.debugLineNum = 11796600;BA.debugLine="If nff=1 Then";
if (true) break;

case 26:
//if
this.state = 37;
if (parent._nff==1) { 
this.state = 28;
}else {
this.state = 30;
}if (true) break;

case 28:
//C
this.state = 37;
RDebugUtils.currentLine=11796601;
 //BA.debugLineNum = 11796601;BA.debugLine="Log(\"get new list\")";
anywheresoftware.b4a.keywords.Common.LogImpl("611796601","get new list",0);
RDebugUtils.currentLine=11796602;
 //BA.debugLineNum = 11796602;BA.debugLine="req_getlike(\"1\",\"getf\")";
_req_getlike("1","getf");
 if (true) break;

case 30:
//C
this.state = 31;
RDebugUtils.currentLine=11796605;
 //BA.debugLineNum = 11796605;BA.debugLine="ProgressDialogShow(\"در حال جوین...\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("در حال جوین..."));
RDebugUtils.currentLine=11796609;
 //BA.debugLineNum = 11796609;BA.debugLine="telegs.Joinchannel(list_follow(6).Get(nff),use";
parent.mostCurrent._telegs.Joinchannel(BA.ObjectToString(parent.mostCurrent._list_follow[(int) (6)].Get(parent._nff)),(int)(Double.parseDouble(parent.mostCurrent._userid_t)));
RDebugUtils.currentLine=11796610;
 //BA.debugLineNum = 11796610;BA.debugLine="Wait For telegs_joinchannel(value As String)";
anywheresoftware.b4a.keywords.Common.WaitFor("telegs_joinchannel", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ac_tfreecoin", "lbl_req_click"), null);
this.state = 40;
return;
case 40:
//C
this.state = 31;
_value = (String) result[0];
;
RDebugUtils.currentLine=11796611;
 //BA.debugLineNum = 11796611;BA.debugLine="LogColor(\"view : \"&value,Colors.Red)";
anywheresoftware.b4a.keywords.Common.LogImpl("611796611","view : "+_value,anywheresoftware.b4a.keywords.Common.Colors.Red);
RDebugUtils.currentLine=11796612;
 //BA.debugLineNum = 11796612;BA.debugLine="If value=\"ok\" Then";
if (true) break;

case 31:
//if
this.state = 36;
if ((_value).equals("ok")) { 
this.state = 33;
}else {
this.state = 35;
}if (true) break;

case 33:
//C
this.state = 36;
RDebugUtils.currentLine=11796614;
 //BA.debugLineNum = 11796614;BA.debugLine="setreq(userid_t,list_follow(8).Get(nff),1)";
_setreq(parent.mostCurrent._userid_t,BA.ObjectToString(parent.mostCurrent._list_follow[(int) (8)].Get(parent._nff)),BA.NumberToString(1));
 if (true) break;

case 35:
//C
this.state = 36;
RDebugUtils.currentLine=11796618;
 //BA.debugLineNum = 11796618;BA.debugLine="getnex(2)";
_getnex((int) (2));
 if (true) break;

case 36:
//C
this.state = 37;
;
 if (true) break;

case 37:
//C
this.state = 38;
;
 if (true) break;

case 38:
//C
this.state = -1;
;
RDebugUtils.currentLine=11796647;
 //BA.debugLineNum = 11796647;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _ch_like_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="ac_tfreecoin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "ch_like_checkedchange", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "ch_like_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=11927552;
 //BA.debugLineNum = 11927552;BA.debugLine="Sub ch_like_CheckedChange(Checked As Boolean)";
RDebugUtils.currentLine=11927554;
 //BA.debugLineNum = 11927554;BA.debugLine="Log(\"check ! \"&Checked)";
anywheresoftware.b4a.keywords.Common.LogImpl("611927554","check ! "+BA.ObjectToString(_checked),0);
RDebugUtils.currentLine=11927580;
 //BA.debugLineNum = 11927580;BA.debugLine="auto_done(Checked)";
_auto_done(_checked);
RDebugUtils.currentLine=11927641;
 //BA.debugLineNum = 11927641;BA.debugLine="End Sub";
return "";
}
public static String  _comment_oncreateviewholder(anywheresoftware.b4a.objects.PanelWrapper _parent) throws Exception{
RDebugUtils.currentModule="ac_tfreecoin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "comment_oncreateviewholder", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "comment_oncreateviewholder", new Object[] {_parent}));}
anywheresoftware.b4a.objects.PanelWrapper _pnl_prof = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _bg = null;
anywheresoftware.b4a.objects.PanelWrapper _pnl_caption = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl_caption = null;
anywheresoftware.b4a.objects.PanelWrapper _pnl_autolike = null;
de.amberhome.objects.appcompat.ACCheckBoxWrapper _ch_like = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl_notis = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl_req = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl_reqs = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl_next = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl_nexi = null;
RDebugUtils.currentLine=11599872;
 //BA.debugLineNum = 11599872;BA.debugLine="Sub comment_onCreateViewHolder (Parent As Panel)";
RDebugUtils.currentLine=11599874;
 //BA.debugLineNum = 11599874;BA.debugLine="Dim pnl_prof As Panel";
_pnl_prof = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=11599875;
 //BA.debugLineNum = 11599875;BA.debugLine="pnl_prof.Initialize(\"pnl_prof\")";
_pnl_prof.Initialize(mostCurrent.activityBA,"pnl_prof");
RDebugUtils.currentLine=11599876;
 //BA.debugLineNum = 11599876;BA.debugLine="Dim bg As ColorDrawable";
_bg = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=11599877;
 //BA.debugLineNum = 11599877;BA.debugLine="bg.Initialize2(Colors.White,10dip,2dip,Colors.Lig";
_bg.Initialize2(anywheresoftware.b4a.keywords.Common.Colors.White,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (10)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (2)),anywheresoftware.b4a.keywords.Common.Colors.LightGray);
RDebugUtils.currentLine=11599878;
 //BA.debugLineNum = 11599878;BA.debugLine="pnl_prof.Background=bg";
_pnl_prof.setBackground((android.graphics.drawable.Drawable)(_bg.getObject()));
RDebugUtils.currentLine=11599879;
 //BA.debugLineNum = 11599879;BA.debugLine="Parent.AddView(pnl_prof,Parent.Width/2-20%x,5%x,4";
_parent.AddView((android.view.View)(_pnl_prof.getObject()),(int) (_parent.getWidth()/(double)2-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (20),mostCurrent.activityBA)),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (40),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (40),mostCurrent.activityBA));
RDebugUtils.currentLine=11599881;
 //BA.debugLineNum = 11599881;BA.debugLine="img_target.Initialize(\"img_target\")";
mostCurrent._img_target.Initialize(processBA,"img_target");
RDebugUtils.currentLine=11599882;
 //BA.debugLineNum = 11599882;BA.debugLine="img_target.Gravity=Gravity.FILL";
mostCurrent._img_target.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.FILL);
RDebugUtils.currentLine=11599883;
 //BA.debugLineNum = 11599883;BA.debugLine="pnl_prof.AddView(img_target,0,0,pnl_prof.Width,pn";
_pnl_prof.AddView((android.view.View)(mostCurrent._img_target.getObject()),(int) (0),(int) (0),_pnl_prof.getWidth(),_pnl_prof.getHeight());
RDebugUtils.currentLine=11599885;
 //BA.debugLineNum = 11599885;BA.debugLine="Dim pnl_caption As Panel";
_pnl_caption = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=11599886;
 //BA.debugLineNum = 11599886;BA.debugLine="pnl_caption.Initialize(\"pnl_caption\")";
_pnl_caption.Initialize(mostCurrent.activityBA,"pnl_caption");
RDebugUtils.currentLine=11599887;
 //BA.debugLineNum = 11599887;BA.debugLine="Dim bg As ColorDrawable";
_bg = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=11599888;
 //BA.debugLineNum = 11599888;BA.debugLine="bg.Initialize2(Colors.White,10dip,2dip,Colors.Lig";
_bg.Initialize2(anywheresoftware.b4a.keywords.Common.Colors.White,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (10)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (2)),anywheresoftware.b4a.keywords.Common.Colors.LightGray);
RDebugUtils.currentLine=11599889;
 //BA.debugLineNum = 11599889;BA.debugLine="pnl_caption.Background=bg";
_pnl_caption.setBackground((android.graphics.drawable.Drawable)(_bg.getObject()));
RDebugUtils.currentLine=11599890;
 //BA.debugLineNum = 11599890;BA.debugLine="Parent.AddView(pnl_caption,5%x,pnl_prof.Top+pnl_p";
_parent.AddView((android.view.View)(_pnl_caption.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA),(int) (_pnl_prof.getTop()+_pnl_prof.getHeight()+anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA)),(int) (_parent.getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA)),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (17),mostCurrent.activityBA));
RDebugUtils.currentLine=11599892;
 //BA.debugLineNum = 11599892;BA.debugLine="Dim lbl_caption As Label";
_lbl_caption = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=11599893;
 //BA.debugLineNum = 11599893;BA.debugLine="lbl_caption.Initialize(\"lbl_caption\")";
_lbl_caption.Initialize(mostCurrent.activityBA,"lbl_caption");
RDebugUtils.currentLine=11599894;
 //BA.debugLineNum = 11599894;BA.debugLine="lbl_caption.Visible=False";
_lbl_caption.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=11599895;
 //BA.debugLineNum = 11599895;BA.debugLine="lbl_caption.TextColor=Colors.DarkGray";
_lbl_caption.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.DarkGray);
RDebugUtils.currentLine=11599896;
 //BA.debugLineNum = 11599896;BA.debugLine="lbl_caption.TextSize=14";
_lbl_caption.setTextSize((float) (14));
RDebugUtils.currentLine=11599897;
 //BA.debugLineNum = 11599897;BA.debugLine="lbl_caption.Typeface=Typeface.LoadFromAssets(\"ira";
_lbl_caption.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("iran_sans.ttf"));
RDebugUtils.currentLine=11599898;
 //BA.debugLineNum = 11599898;BA.debugLine="lbl_caption.Text=\"کپشن پست در این قسمت\"";
_lbl_caption.setText(BA.ObjectToCharSequence("کپشن پست در این قسمت"));
RDebugUtils.currentLine=11599899;
 //BA.debugLineNum = 11599899;BA.debugLine="lbl_caption.Gravity=Gravity.CENTER_HORIZONTAL+Gra";
_lbl_caption.setGravity((int) (anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL+anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=11599900;
 //BA.debugLineNum = 11599900;BA.debugLine="pnl_caption.AddView(lbl_caption,0,0,pnl_caption.W";
_pnl_caption.AddView((android.view.View)(_lbl_caption.getObject()),(int) (0),(int) (0),_pnl_caption.getWidth(),_pnl_caption.getHeight());
RDebugUtils.currentLine=11599902;
 //BA.debugLineNum = 11599902;BA.debugLine="Dim pnl_autolike As Panel";
_pnl_autolike = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=11599903;
 //BA.debugLineNum = 11599903;BA.debugLine="pnl_autolike.Initialize(\"pnl_autolike\")";
_pnl_autolike.Initialize(mostCurrent.activityBA,"pnl_autolike");
RDebugUtils.currentLine=11599904;
 //BA.debugLineNum = 11599904;BA.debugLine="Dim bg As ColorDrawable";
_bg = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=11599905;
 //BA.debugLineNum = 11599905;BA.debugLine="bg.Initialize2(Colors.White,10dip,2dip,Colors.Lig";
_bg.Initialize2(anywheresoftware.b4a.keywords.Common.Colors.White,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (10)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (2)),anywheresoftware.b4a.keywords.Common.Colors.LightGray);
RDebugUtils.currentLine=11599906;
 //BA.debugLineNum = 11599906;BA.debugLine="pnl_autolike.Background=bg";
_pnl_autolike.setBackground((android.graphics.drawable.Drawable)(_bg.getObject()));
RDebugUtils.currentLine=11599907;
 //BA.debugLineNum = 11599907;BA.debugLine="Parent.AddView(pnl_autolike,5%x,pnl_caption.Top+p";
_parent.AddView((android.view.View)(_pnl_autolike.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA),(int) (_pnl_caption.getTop()+_pnl_caption.getHeight()+anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA)),(int) (_parent.getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA)),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (25),mostCurrent.activityBA));
RDebugUtils.currentLine=11599909;
 //BA.debugLineNum = 11599909;BA.debugLine="Dim ch_like As ACCheckBox";
_ch_like = new de.amberhome.objects.appcompat.ACCheckBoxWrapper();
RDebugUtils.currentLine=11599910;
 //BA.debugLineNum = 11599910;BA.debugLine="ch_like.Initialize(\"ch_like\")";
_ch_like.Initialize(mostCurrent.activityBA,"ch_like");
RDebugUtils.currentLine=11599911;
 //BA.debugLineNum = 11599911;BA.debugLine="ch_like.Text=\"کامنت خودکار\"";
_ch_like.setText(BA.ObjectToCharSequence("کامنت خودکار"));
RDebugUtils.currentLine=11599912;
 //BA.debugLineNum = 11599912;BA.debugLine="ch_like.Typeface=Typeface.LoadFromAssets(\"iran_sa";
_ch_like.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("iran_sans.ttf"));
RDebugUtils.currentLine=11599913;
 //BA.debugLineNum = 11599913;BA.debugLine="ch_like.TextSize=14";
_ch_like.setTextSize((float) (14));
RDebugUtils.currentLine=11599914;
 //BA.debugLineNum = 11599914;BA.debugLine="pnl_autolike.AddView(ch_like,5%x,5%x,pnl_autolike";
_pnl_autolike.AddView((android.view.View)(_ch_like.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA),(int) (_pnl_autolike.getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA)),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (7),mostCurrent.activityBA));
RDebugUtils.currentLine=11599916;
 //BA.debugLineNum = 11599916;BA.debugLine="Dim lbl_notis As Label";
_lbl_notis = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=11599917;
 //BA.debugLineNum = 11599917;BA.debugLine="lbl_notis.Initialize(\"lbl_notis\")";
_lbl_notis.Initialize(mostCurrent.activityBA,"lbl_notis");
RDebugUtils.currentLine=11599918;
 //BA.debugLineNum = 11599918;BA.debugLine="lbl_notis.TextColor=Colors.DarkGray";
_lbl_notis.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.DarkGray);
RDebugUtils.currentLine=11599919;
 //BA.debugLineNum = 11599919;BA.debugLine="lbl_notis.TextSize=11";
_lbl_notis.setTextSize((float) (11));
RDebugUtils.currentLine=11599920;
 //BA.debugLineNum = 11599920;BA.debugLine="lbl_notis.Typeface=Typeface.LoadFromAssets(\"iran_";
_lbl_notis.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("iran_sans.ttf"));
RDebugUtils.currentLine=11599921;
 //BA.debugLineNum = 11599921;BA.debugLine="lbl_notis.Text=\"نکته با فعال سازی این گزینه بصورت";
_lbl_notis.setText(BA.ObjectToCharSequence("نکته با فعال سازی این گزینه بصورت خودکار تمامی پست ها کامنت میشوند"));
RDebugUtils.currentLine=11599922;
 //BA.debugLineNum = 11599922;BA.debugLine="lbl_notis.Gravity=Gravity.CENTER_HORIZONTAL+Gravi";
_lbl_notis.setGravity((int) (anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL+anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=11599923;
 //BA.debugLineNum = 11599923;BA.debugLine="pnl_autolike.AddView(lbl_notis,0,5%x,pnl_autolike";
_pnl_autolike.AddView((android.view.View)(_lbl_notis.getObject()),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA),_pnl_autolike.getWidth(),_pnl_autolike.getHeight());
RDebugUtils.currentLine=11599925;
 //BA.debugLineNum = 11599925;BA.debugLine="Dim bg As ColorDrawable";
_bg = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=11599926;
 //BA.debugLineNum = 11599926;BA.debugLine="bg.Initialize2(0xFF9D00FF,10dip,2dip,Colors.Light";
_bg.Initialize2((int) (0xff9d00ff),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (10)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (2)),anywheresoftware.b4a.keywords.Common.Colors.LightGray);
RDebugUtils.currentLine=11599928;
 //BA.debugLineNum = 11599928;BA.debugLine="Dim lbl_req As Label";
_lbl_req = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=11599929;
 //BA.debugLineNum = 11599929;BA.debugLine="lbl_req.Initialize(\"lbl_req\")";
_lbl_req.Initialize(mostCurrent.activityBA,"lbl_req");
RDebugUtils.currentLine=11599930;
 //BA.debugLineNum = 11599930;BA.debugLine="lbl_req.TextColor=Colors.White";
_lbl_req.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=11599931;
 //BA.debugLineNum = 11599931;BA.debugLine="lbl_req.TextSize=17";
_lbl_req.setTextSize((float) (17));
RDebugUtils.currentLine=11599932;
 //BA.debugLineNum = 11599932;BA.debugLine="lbl_req.Typeface=Typeface.LoadFromAssets(\"iran_sa";
_lbl_req.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("iran_sans.ttf"));
RDebugUtils.currentLine=11599933;
 //BA.debugLineNum = 11599933;BA.debugLine="lbl_req.Text=\"کامنت بزار\"";
_lbl_req.setText(BA.ObjectToCharSequence("کامنت بزار"));
RDebugUtils.currentLine=11599934;
 //BA.debugLineNum = 11599934;BA.debugLine="lbl_req.Background=bg";
_lbl_req.setBackground((android.graphics.drawable.Drawable)(_bg.getObject()));
RDebugUtils.currentLine=11599935;
 //BA.debugLineNum = 11599935;BA.debugLine="lbl_req.Gravity=Gravity.CENTER_HORIZONTAL+Gravity";
_lbl_req.setGravity((int) (anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL+anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=11599936;
 //BA.debugLineNum = 11599936;BA.debugLine="Parent.AddView(lbl_req,5%x,pnl_autolike.Top+pnl_a";
_parent.AddView((android.view.View)(_lbl_req.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA),(int) (_pnl_autolike.getTop()+_pnl_autolike.getHeight()+anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA)),(int) (_parent.getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA)),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (12),mostCurrent.activityBA));
RDebugUtils.currentLine=11599938;
 //BA.debugLineNum = 11599938;BA.debugLine="Dim lbl_reqs As Label";
_lbl_reqs = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=11599939;
 //BA.debugLineNum = 11599939;BA.debugLine="lbl_reqs.Initialize(\"lbl_req\")";
_lbl_reqs.Initialize(mostCurrent.activityBA,"lbl_req");
RDebugUtils.currentLine=11599940;
 //BA.debugLineNum = 11599940;BA.debugLine="lbl_reqs.TextColor=Colors.White";
_lbl_reqs.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=11599941;
 //BA.debugLineNum = 11599941;BA.debugLine="lbl_reqs.TextSize=30";
_lbl_reqs.setTextSize((float) (30));
RDebugUtils.currentLine=11599942;
 //BA.debugLineNum = 11599942;BA.debugLine="lbl_reqs.Typeface=Typeface.MATERIALICONS";
_lbl_reqs.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.getMATERIALICONS());
RDebugUtils.currentLine=11599943;
 //BA.debugLineNum = 11599943;BA.debugLine="lbl_reqs.Text=Chr(0xE7FE)";
_lbl_reqs.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr((int) (0xe7fe))));
RDebugUtils.currentLine=11599944;
 //BA.debugLineNum = 11599944;BA.debugLine="lbl_reqs.Gravity=Gravity.CENTER_HORIZONTAL+Gravit";
_lbl_reqs.setGravity((int) (anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL+anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=11599945;
 //BA.debugLineNum = 11599945;BA.debugLine="Parent.AddView(lbl_reqs,15%x,pnl_autolike.Top+pnl";
_parent.AddView((android.view.View)(_lbl_reqs.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (15),mostCurrent.activityBA),(int) (_pnl_autolike.getTop()+_pnl_autolike.getHeight()+anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA)),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (12),mostCurrent.activityBA));
RDebugUtils.currentLine=11599947;
 //BA.debugLineNum = 11599947;BA.debugLine="Dim bg As ColorDrawable";
_bg = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=11599948;
 //BA.debugLineNum = 11599948;BA.debugLine="bg.Initialize2(0xFF454149,10dip,2dip,Colors.Light";
_bg.Initialize2((int) (0xff454149),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (10)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (2)),anywheresoftware.b4a.keywords.Common.Colors.LightGray);
RDebugUtils.currentLine=11599950;
 //BA.debugLineNum = 11599950;BA.debugLine="Dim lbl_next As Label";
_lbl_next = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=11599951;
 //BA.debugLineNum = 11599951;BA.debugLine="lbl_next.Initialize(\"lbl_next\")";
_lbl_next.Initialize(mostCurrent.activityBA,"lbl_next");
RDebugUtils.currentLine=11599952;
 //BA.debugLineNum = 11599952;BA.debugLine="lbl_next.TextColor=Colors.White";
_lbl_next.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=11599953;
 //BA.debugLineNum = 11599953;BA.debugLine="lbl_next.TextSize=17";
_lbl_next.setTextSize((float) (17));
RDebugUtils.currentLine=11599954;
 //BA.debugLineNum = 11599954;BA.debugLine="lbl_next.Typeface=Typeface.LoadFromAssets(\"iran_s";
_lbl_next.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("iran_sans.ttf"));
RDebugUtils.currentLine=11599955;
 //BA.debugLineNum = 11599955;BA.debugLine="lbl_next.Text=\"بعدی\"";
_lbl_next.setText(BA.ObjectToCharSequence("بعدی"));
RDebugUtils.currentLine=11599956;
 //BA.debugLineNum = 11599956;BA.debugLine="lbl_next.Background=bg";
_lbl_next.setBackground((android.graphics.drawable.Drawable)(_bg.getObject()));
RDebugUtils.currentLine=11599957;
 //BA.debugLineNum = 11599957;BA.debugLine="lbl_next.Gravity=Gravity.CENTER_HORIZONTAL+Gravit";
_lbl_next.setGravity((int) (anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL+anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=11599958;
 //BA.debugLineNum = 11599958;BA.debugLine="Parent.AddView(lbl_next,5%x,lbl_req.Top+lbl_req.H";
_parent.AddView((android.view.View)(_lbl_next.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA),(int) (_lbl_req.getTop()+_lbl_req.getHeight()+anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA)),(int) (_parent.getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA)),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (12),mostCurrent.activityBA));
RDebugUtils.currentLine=11599960;
 //BA.debugLineNum = 11599960;BA.debugLine="Dim lbl_nexi As Label";
_lbl_nexi = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=11599961;
 //BA.debugLineNum = 11599961;BA.debugLine="lbl_nexi.Initialize(\"lbl_next\")";
_lbl_nexi.Initialize(mostCurrent.activityBA,"lbl_next");
RDebugUtils.currentLine=11599962;
 //BA.debugLineNum = 11599962;BA.debugLine="lbl_nexi.TextColor=Colors.LightGray";
_lbl_nexi.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.LightGray);
RDebugUtils.currentLine=11599963;
 //BA.debugLineNum = 11599963;BA.debugLine="lbl_nexi.TextSize=30";
_lbl_nexi.setTextSize((float) (30));
RDebugUtils.currentLine=11599964;
 //BA.debugLineNum = 11599964;BA.debugLine="lbl_nexi.Typeface=Typeface.MATERIALICONS";
_lbl_nexi.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.getMATERIALICONS());
RDebugUtils.currentLine=11599965;
 //BA.debugLineNum = 11599965;BA.debugLine="lbl_nexi.Text=Chr(0xE15F)";
_lbl_nexi.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr((int) (0xe15f))));
RDebugUtils.currentLine=11599966;
 //BA.debugLineNum = 11599966;BA.debugLine="lbl_nexi.Gravity=Gravity.CENTER_HORIZONTAL+Gravit";
_lbl_nexi.setGravity((int) (anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL+anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=11599967;
 //BA.debugLineNum = 11599967;BA.debugLine="Parent.AddView(lbl_nexi,15%x,lbl_req.Top+lbl_req.";
_parent.AddView((android.view.View)(_lbl_nexi.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (15),mostCurrent.activityBA),(int) (_lbl_req.getTop()+_lbl_req.getHeight()+anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA)),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (12),mostCurrent.activityBA));
RDebugUtils.currentLine=11599968;
 //BA.debugLineNum = 11599968;BA.debugLine="End Sub";
return "";
}
public static String  _getnex(int _posis) throws Exception{
RDebugUtils.currentModule="ac_tfreecoin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "getnex", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "getnex", new Object[] {_posis}));}
int _i = 0;
long _n_coins = 0L;
RDebugUtils.currentLine=12255232;
 //BA.debugLineNum = 12255232;BA.debugLine="Sub getnex(posis As Int)";
RDebugUtils.currentLine=12255233;
 //BA.debugLineNum = 12255233;BA.debugLine="Try";
try {RDebugUtils.currentLine=12255234;
 //BA.debugLineNum = 12255234;BA.debugLine="cursor1 = sql1.ExecQuery(\"SELECT * FROM tbl_coin";
_cursor1.setObject((android.database.Cursor)(_sql1.ExecQuery("SELECT * FROM tbl_coin WHERE userid='"+mostCurrent._userid_t+"' ")));
RDebugUtils.currentLine=12255235;
 //BA.debugLineNum = 12255235;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=12255236;
 //BA.debugLineNum = 12255236;BA.debugLine="For i=0 To cursor1.RowCount-1";
{
final int step4 = 1;
final int limit4 = (int) (_cursor1.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=12255237;
 //BA.debugLineNum = 12255237;BA.debugLine="cursor1.Position=i";
_cursor1.setPosition(_i);
RDebugUtils.currentLine=12255238;
 //BA.debugLineNum = 12255238;BA.debugLine="cm=cursor1.GetString(\"cm\")";
mostCurrent._cm = _cursor1.GetString("cm");
 }
};
RDebugUtils.currentLine=12255242;
 //BA.debugLineNum = 12255242;BA.debugLine="Select type_done";
switch (_type_done) {
case 1: {
RDebugUtils.currentLine=12255244;
 //BA.debugLineNum = 12255244;BA.debugLine="nll=nll-1";
_nll = (int) (_nll-1);
RDebugUtils.currentLine=12255246;
 //BA.debugLineNum = 12255246;BA.debugLine="glide.Load2(list_like(9).Get(nll)).OptionalCir";
mostCurrent._glide.Load2(mostCurrent.activityBA,BA.ObjectToString(mostCurrent._list_like[(int) (9)].Get(_nll))).OptionalCircleCrop().Into((anywheresoftware.b4a.objects.ImageViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ImageViewWrapper(), (android.widget.ImageView)(mostCurrent._img_target.getObject())));
RDebugUtils.currentLine=12255248;
 //BA.debugLineNum = 12255248;BA.debugLine="Dim n_coins=cm As Long";
_n_coins = (long)(Double.parseDouble(mostCurrent._cm));
RDebugUtils.currentLine=12255249;
 //BA.debugLineNum = 12255249;BA.debugLine="If n_coins>100 Then";
if (_n_coins>100) { 
RDebugUtils.currentLine=12255250;
 //BA.debugLineNum = 12255250;BA.debugLine="lbl_nums.Text=\"سکه \"&NumberFormat(n_coins,3,0";
mostCurrent._lbl_nums.setText(BA.ObjectToCharSequence("سکه "+anywheresoftware.b4a.keywords.Common.NumberFormat(_n_coins,(int) (3),(int) (0))));
 }else {
RDebugUtils.currentLine=12255252;
 //BA.debugLineNum = 12255252;BA.debugLine="lbl_nums.Text=\"سکه \"&n_coins";
mostCurrent._lbl_nums.setText(BA.ObjectToCharSequence("سکه "+BA.NumberToString(_n_coins)));
 };
 break; }
case 0: {
RDebugUtils.currentLine=12255257;
 //BA.debugLineNum = 12255257;BA.debugLine="nff=nff-1";
_nff = (int) (_nff-1);
RDebugUtils.currentLine=12255259;
 //BA.debugLineNum = 12255259;BA.debugLine="glide.Load2(list_follow(9).Get(nff)).OptionalC";
mostCurrent._glide.Load2(mostCurrent.activityBA,BA.ObjectToString(mostCurrent._list_follow[(int) (9)].Get(_nff))).OptionalCircleCrop().Into((anywheresoftware.b4a.objects.ImageViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ImageViewWrapper(), (android.widget.ImageView)(mostCurrent._img_target.getObject())));
RDebugUtils.currentLine=12255261;
 //BA.debugLineNum = 12255261;BA.debugLine="Dim n_coins=cm As Long";
_n_coins = (long)(Double.parseDouble(mostCurrent._cm));
RDebugUtils.currentLine=12255262;
 //BA.debugLineNum = 12255262;BA.debugLine="If n_coins>100 Then";
if (_n_coins>100) { 
RDebugUtils.currentLine=12255263;
 //BA.debugLineNum = 12255263;BA.debugLine="lbl_nums.Text=\"سکه \"&NumberFormat(n_coins,3,0";
mostCurrent._lbl_nums.setText(BA.ObjectToCharSequence("سکه "+anywheresoftware.b4a.keywords.Common.NumberFormat(_n_coins,(int) (3),(int) (0))));
 }else {
RDebugUtils.currentLine=12255265;
 //BA.debugLineNum = 12255265;BA.debugLine="lbl_nums.Text=\"سکه \"&n_coins";
mostCurrent._lbl_nums.setText(BA.ObjectToCharSequence("سکه "+BA.NumberToString(_n_coins)));
 };
 break; }
}
;
 } 
       catch (Exception e29) {
			processBA.setLastException(e29);RDebugUtils.currentLine=12255269;
 //BA.debugLineNum = 12255269;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("612255269",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 };
RDebugUtils.currentLine=12255274;
 //BA.debugLineNum = 12255274;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_next_click() throws Exception{
RDebugUtils.currentModule="ac_tfreecoin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lbl_next_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "lbl_next_click", null));}
RDebugUtils.currentLine=11862016;
 //BA.debugLineNum = 11862016;BA.debugLine="Sub lbl_next_Click";
RDebugUtils.currentLine=11862017;
 //BA.debugLineNum = 11862017;BA.debugLine="Select type_done";
switch (_type_done) {
case 1: {
RDebugUtils.currentLine=11862020;
 //BA.debugLineNum = 11862020;BA.debugLine="If nll=1 Then";
if (_nll==1) { 
RDebugUtils.currentLine=11862021;
 //BA.debugLineNum = 11862021;BA.debugLine="Log(\"get new list\")";
anywheresoftware.b4a.keywords.Common.LogImpl("611862021","get new list",0);
RDebugUtils.currentLine=11862022;
 //BA.debugLineNum = 11862022;BA.debugLine="req_getlike(\"2\",\"getl\")";
_req_getlike("2","getl");
 }else {
RDebugUtils.currentLine=11862025;
 //BA.debugLineNum = 11862025;BA.debugLine="getnex(0)";
_getnex((int) (0));
 };
 break; }
case 0: {
RDebugUtils.currentLine=11862030;
 //BA.debugLineNum = 11862030;BA.debugLine="If nff=1 Then";
if (_nff==1) { 
RDebugUtils.currentLine=11862031;
 //BA.debugLineNum = 11862031;BA.debugLine="Log(\"get new list\")";
anywheresoftware.b4a.keywords.Common.LogImpl("611862031","get new list",0);
RDebugUtils.currentLine=11862032;
 //BA.debugLineNum = 11862032;BA.debugLine="req_getlike(\"1\",\"getf\")";
_req_getlike("1","getf");
 }else {
RDebugUtils.currentLine=11862035;
 //BA.debugLineNum = 11862035;BA.debugLine="getnex(2)";
_getnex((int) (2));
 };
 break; }
}
;
RDebugUtils.currentLine=11862041;
 //BA.debugLineNum = 11862041;BA.debugLine="End Sub";
return "";
}
public static String  _setreq(String _userid,String _mediaid,String _typemodule) throws Exception{
RDebugUtils.currentModule="ac_tfreecoin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "setreq", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "setreq", new Object[] {_userid,_mediaid,_typemodule}));}
com.reza.sh.fastnet.Fastnet _prfn = null;
com.reza.sh.fastnet.PostRequestRaper _post = null;
RDebugUtils.currentLine=12058624;
 //BA.debugLineNum = 12058624;BA.debugLine="Sub setreq(userid As String,mediaid As String,type";
RDebugUtils.currentLine=12058629;
 //BA.debugLineNum = 12058629;BA.debugLine="Dim prfn As PersianFastNetwork";
_prfn = new com.reza.sh.fastnet.Fastnet();
RDebugUtils.currentLine=12058630;
 //BA.debugLineNum = 12058630;BA.debugLine="prfn.initialize(\"prfn\")";
_prfn.initialize(processBA,"prfn");
RDebugUtils.currentLine=12058631;
 //BA.debugLineNum = 12058631;BA.debugLine="Dim post As PostRequest";
_post = new com.reza.sh.fastnet.PostRequestRaper();
RDebugUtils.currentLine=12058632;
 //BA.debugLineNum = 12058632;BA.debugLine="post=prfn.BuildPostQuery(\"http://filework.ir/INST";
_post = _prfn.BuildPostQuery("http://filework.ir/INSTAFOLLOW/api/req.php","donereq");
RDebugUtils.currentLine=12058634;
 //BA.debugLineNum = 12058634;BA.debugLine="post.addHeder(\"User-Agent\",\"Dalvik/1.6.0 (Linux;";
_post.addHeder("User-Agent","Dalvik/1.6.0 (Linux; U; Android 4.4.4; SM-A700FD Build/KTU84P)");
RDebugUtils.currentLine=12058635;
 //BA.debugLineNum = 12058635;BA.debugLine="post.addParametrs(\"req\",\"donereqt\")";
_post.addParametrs("req","donereqt");
RDebugUtils.currentLine=12058636;
 //BA.debugLineNum = 12058636;BA.debugLine="post.addParametrs(\"userid\",userid)";
_post.addParametrs("userid",_userid);
RDebugUtils.currentLine=12058637;
 //BA.debugLineNum = 12058637;BA.debugLine="post.addParametrs(\"mediaid\",mediaid)";
_post.addParametrs("mediaid",_mediaid);
RDebugUtils.currentLine=12058638;
 //BA.debugLineNum = 12058638;BA.debugLine="post.addParametrs(\"typemodule\",\"1\")";
_post.addParametrs("typemodule","1");
RDebugUtils.currentLine=12058640;
 //BA.debugLineNum = 12058640;BA.debugLine="post.executRequestAsString";
_post.executRequestAsString();
RDebugUtils.currentLine=12058642;
 //BA.debugLineNum = 12058642;BA.debugLine="ProgressDialogShow(\"در حال پردازش...\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("در حال پردازش..."));
RDebugUtils.currentLine=12058645;
 //BA.debugLineNum = 12058645;BA.debugLine="End Sub";
return "";
}
public static String  _like_onbindviewholder(anywheresoftware.b4a.objects.PanelWrapper _parent,int _position) throws Exception{
RDebugUtils.currentModule="ac_tfreecoin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "like_onbindviewholder", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "like_onbindviewholder", new Object[] {_parent,_position}));}
RDebugUtils.currentLine=11730944;
 //BA.debugLineNum = 11730944;BA.debugLine="Sub like_onBindViewHolder (Parent As Panel, Positi";
RDebugUtils.currentLine=11730946;
 //BA.debugLineNum = 11730946;BA.debugLine="End Sub";
return "";
}
public static String  _meno_click() throws Exception{
RDebugUtils.currentModule="ac_tfreecoin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "meno_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "meno_click", null));}
RDebugUtils.currentLine=12451840;
 //BA.debugLineNum = 12451840;BA.debugLine="Sub meno_Click";
RDebugUtils.currentLine=12451841;
 //BA.debugLineNum = 12451841;BA.debugLine="mimeno.Initialize(\"mimeno\",Me)";
mostCurrent._mimeno._initialize /*String*/ (null,mostCurrent.activityBA,"mimeno",ac_tfreecoin.getObject());
RDebugUtils.currentLine=12451842;
 //BA.debugLineNum = 12451842;BA.debugLine="mimeno.addpnl";
mostCurrent._mimeno._addpnl /*String*/ (null);
RDebugUtils.currentLine=12451843;
 //BA.debugLineNum = 12451843;BA.debugLine="mimeno.open";
mostCurrent._mimeno._open /*String*/ (null);
RDebugUtils.currentLine=12451844;
 //BA.debugLineNum = 12451844;BA.debugLine="End Sub";
return "";
}
public static String  _prfn_onpoststringerrorlistener(com.reza.sh.fastnet.Error _error,String _tag) throws Exception{
RDebugUtils.currentModule="ac_tfreecoin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "prfn_onpoststringerrorlistener", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "prfn_onpoststringerrorlistener", new Object[] {_error,_tag}));}
RDebugUtils.currentLine=11403264;
 //BA.debugLineNum = 11403264;BA.debugLine="Sub prfn_onPostStringErrorListener(Error As Respon";
RDebugUtils.currentLine=11403266;
 //BA.debugLineNum = 11403266;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=11403267;
 //BA.debugLineNum = 11403267;BA.debugLine="End Sub";
return "";
}
public static String  _prfn_onpoststringoklistener(String _result,String _tag) throws Exception{
RDebugUtils.currentModule="ac_tfreecoin";
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
String _msg_idx = "";
String _types = "";
String _start = "";
String _finish = "";
String _picx = "";
String _chat_idx = "";
String _status = "";
String _token = "";
String _njob = "";
String _codes = "";
String _comtext = "";
String _imgpost = "";
String _target = "";
RDebugUtils.currentLine=11468800;
 //BA.debugLineNum = 11468800;BA.debugLine="Sub prfn_onPostStringOkListener(Result As String";
RDebugUtils.currentLine=11468801;
 //BA.debugLineNum = 11468801;BA.debugLine="LogColor(Result,Colors.Blue)";
anywheresoftware.b4a.keywords.Common.LogImpl("611468801",_result,anywheresoftware.b4a.keywords.Common.Colors.Blue);
RDebugUtils.currentLine=11468802;
 //BA.debugLineNum = 11468802;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=11468803;
 //BA.debugLineNum = 11468803;BA.debugLine="Select Tag";
switch (BA.switchObjectToInt(_tag,"iuser","getinsta","getl","getc","getf","donereq")) {
case 0: {
RDebugUtils.currentLine=11468805;
 //BA.debugLineNum = 11468805;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=11468806;
 //BA.debugLineNum = 11468806;BA.debugLine="Log(Result)";
anywheresoftware.b4a.keywords.Common.LogImpl("611468806",_result,0);
 break; }
case 1: {
RDebugUtils.currentLine=11468809;
 //BA.debugLineNum = 11468809;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=11468810;
 //BA.debugLineNum = 11468810;BA.debugLine="parser.Initialize(Result)";
_parser.Initialize(_result);
RDebugUtils.currentLine=11468811;
 //BA.debugLineNum = 11468811;BA.debugLine="Dim root As List = parser.NextArray";
_root = new anywheresoftware.b4a.objects.collections.List();
_root = _parser.NextArray();
RDebugUtils.currentLine=11468812;
 //BA.debugLineNum = 11468812;BA.debugLine="For Each colroot As Map In root";
_colroot = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group11 = _root;
final int groupLen11 = group11.getSize()
;int index11 = 0;
;
for (; index11 < groupLen11;index11++){
_colroot.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group11.Get(index11)));
RDebugUtils.currentLine=11468813;
 //BA.debugLineNum = 11468813;BA.debugLine="Dim Result As String = colroot.Get(\"result\")";
_result = BA.ObjectToString(_colroot.Get((Object)("result")));
RDebugUtils.currentLine=11468814;
 //BA.debugLineNum = 11468814;BA.debugLine="Dim c_m As String = colroot.Get(\"c_m\")";
_c_m = BA.ObjectToString(_colroot.Get((Object)("c_m")));
RDebugUtils.currentLine=11468815;
 //BA.debugLineNum = 11468815;BA.debugLine="Dim uid As String = colroot.Get(\"uid\")";
_uid = BA.ObjectToString(_colroot.Get((Object)("uid")));
RDebugUtils.currentLine=11468816;
 //BA.debugLineNum = 11468816;BA.debugLine="Dim first_last As String = colroot.Get(\"first_";
_first_last = BA.ObjectToString(_colroot.Get((Object)("first_last")));
RDebugUtils.currentLine=11468817;
 //BA.debugLineNum = 11468817;BA.debugLine="Dim id As String = colroot.Get(\"id\")";
_id = BA.ObjectToString(_colroot.Get((Object)("id")));
RDebugUtils.currentLine=11468818;
 //BA.debugLineNum = 11468818;BA.debugLine="Dim userid As String = colroot.Get(\"userid\")";
_userid = BA.ObjectToString(_colroot.Get((Object)("userid")));
RDebugUtils.currentLine=11468819;
 //BA.debugLineNum = 11468819;BA.debugLine="Dim username As String = colroot.Get(\"username";
_username = BA.ObjectToString(_colroot.Get((Object)("username")));
RDebugUtils.currentLine=11468820;
 //BA.debugLineNum = 11468820;BA.debugLine="Dim c_ch As String = colroot.Get(\"c_ch\")";
_c_ch = BA.ObjectToString(_colroot.Get((Object)("c_ch")));
RDebugUtils.currentLine=11468821;
 //BA.debugLineNum = 11468821;BA.debugLine="Dim n_coins=c_m As Long";
_n_coins = (long)(Double.parseDouble(_c_m));
RDebugUtils.currentLine=11468822;
 //BA.debugLineNum = 11468822;BA.debugLine="If n_coins>100 Then";
if (_n_coins>100) { 
RDebugUtils.currentLine=11468823;
 //BA.debugLineNum = 11468823;BA.debugLine="lbl_nums.Text=\"سکه \"&NumberFormat(c_m,3,0)";
mostCurrent._lbl_nums.setText(BA.ObjectToCharSequence("سکه "+anywheresoftware.b4a.keywords.Common.NumberFormat((double)(Double.parseDouble(_c_m)),(int) (3),(int) (0))));
 }else {
RDebugUtils.currentLine=11468825;
 //BA.debugLineNum = 11468825;BA.debugLine="lbl_nums.Text=\"سکه \"&c_m";
mostCurrent._lbl_nums.setText(BA.ObjectToCharSequence("سکه "+_c_m));
 };
RDebugUtils.currentLine=11468829;
 //BA.debugLineNum = 11468829;BA.debugLine="sql1.ExecNonQuery(\"UPDATE tbl_coin set cm='\"&c";
_sql1.ExecNonQuery("UPDATE tbl_coin set cm='"+_c_m+"',cf='"+_c_ch+"' WHERE userid='"+mostCurrent._userid_t+"' ");
 }
};
 break; }
case 2: {
RDebugUtils.currentLine=11468837;
 //BA.debugLineNum = 11468837;BA.debugLine="Log(Result)";
anywheresoftware.b4a.keywords.Common.LogImpl("611468837",_result,0);
RDebugUtils.currentLine=11468838;
 //BA.debugLineNum = 11468838;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=11468839;
 //BA.debugLineNum = 11468839;BA.debugLine="parser.Initialize(Result)";
_parser.Initialize(_result);
RDebugUtils.currentLine=11468840;
 //BA.debugLineNum = 11468840;BA.debugLine="Dim root As List = parser.NextArray";
_root = new anywheresoftware.b4a.objects.collections.List();
_root = _parser.NextArray();
RDebugUtils.currentLine=11468841;
 //BA.debugLineNum = 11468841;BA.debugLine="For Each colroot As Map In root";
_colroot = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group33 = _root;
final int groupLen33 = group33.getSize()
;int index33 = 0;
;
for (; index33 < groupLen33;index33++){
_colroot.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group33.Get(index33)));
RDebugUtils.currentLine=11468842;
 //BA.debugLineNum = 11468842;BA.debugLine="Dim uid As String = colroot.Get(\"uid\")";
_uid = BA.ObjectToString(_colroot.Get((Object)("uid")));
RDebugUtils.currentLine=11468843;
 //BA.debugLineNum = 11468843;BA.debugLine="Dim msg_idx As String = colroot.Get(\"msg_id\")";
_msg_idx = BA.ObjectToString(_colroot.Get((Object)("msg_id")));
RDebugUtils.currentLine=11468844;
 //BA.debugLineNum = 11468844;BA.debugLine="Dim types As String = colroot.Get(\"types\")";
_types = BA.ObjectToString(_colroot.Get((Object)("types")));
RDebugUtils.currentLine=11468845;
 //BA.debugLineNum = 11468845;BA.debugLine="Dim start As String = colroot.Get(\"start\")";
_start = BA.ObjectToString(_colroot.Get((Object)("start")));
RDebugUtils.currentLine=11468846;
 //BA.debugLineNum = 11468846;BA.debugLine="Dim finish As String = colroot.Get(\"finish\")";
_finish = BA.ObjectToString(_colroot.Get((Object)("finish")));
RDebugUtils.currentLine=11468847;
 //BA.debugLineNum = 11468847;BA.debugLine="Dim id As String = colroot.Get(\"id\")";
_id = BA.ObjectToString(_colroot.Get((Object)("id")));
RDebugUtils.currentLine=11468848;
 //BA.debugLineNum = 11468848;BA.debugLine="Dim userid As String = colroot.Get(\"userid\")";
_userid = BA.ObjectToString(_colroot.Get((Object)("userid")));
RDebugUtils.currentLine=11468849;
 //BA.debugLineNum = 11468849;BA.debugLine="Dim picx As String = colroot.Get(\"pic\")";
_picx = BA.ObjectToString(_colroot.Get((Object)("pic")));
RDebugUtils.currentLine=11468850;
 //BA.debugLineNum = 11468850;BA.debugLine="Dim chat_idx As String = colroot.Get(\"chat_id\"";
_chat_idx = BA.ObjectToString(_colroot.Get((Object)("chat_id")));
RDebugUtils.currentLine=11468851;
 //BA.debugLineNum = 11468851;BA.debugLine="Dim status As String = colroot.Get(\"status\")";
_status = BA.ObjectToString(_colroot.Get((Object)("status")));
RDebugUtils.currentLine=11468852;
 //BA.debugLineNum = 11468852;BA.debugLine="Dim token As String = colroot.Get(\"token\")";
_token = BA.ObjectToString(_colroot.Get((Object)("token")));
RDebugUtils.currentLine=11468853;
 //BA.debugLineNum = 11468853;BA.debugLine="Dim njob As String = colroot.Get(\"njob\")";
_njob = BA.ObjectToString(_colroot.Get((Object)("njob")));
RDebugUtils.currentLine=11468854;
 //BA.debugLineNum = 11468854;BA.debugLine="list_like(0).Add(uid)";
mostCurrent._list_like[(int) (0)].Add((Object)(_uid));
RDebugUtils.currentLine=11468855;
 //BA.debugLineNum = 11468855;BA.debugLine="list_like(1).Add(types)";
mostCurrent._list_like[(int) (1)].Add((Object)(_types));
RDebugUtils.currentLine=11468856;
 //BA.debugLineNum = 11468856;BA.debugLine="list_like(2).Add(start)";
mostCurrent._list_like[(int) (2)].Add((Object)(_start));
RDebugUtils.currentLine=11468857;
 //BA.debugLineNum = 11468857;BA.debugLine="list_like(3).Add(finish)";
mostCurrent._list_like[(int) (3)].Add((Object)(_finish));
RDebugUtils.currentLine=11468858;
 //BA.debugLineNum = 11468858;BA.debugLine="list_like(4).Add(id)";
mostCurrent._list_like[(int) (4)].Add((Object)(_id));
RDebugUtils.currentLine=11468859;
 //BA.debugLineNum = 11468859;BA.debugLine="list_like(5).Add(userid)";
mostCurrent._list_like[(int) (5)].Add((Object)(_userid));
RDebugUtils.currentLine=11468860;
 //BA.debugLineNum = 11468860;BA.debugLine="list_like(6).Add(chat_idx)";
mostCurrent._list_like[(int) (6)].Add((Object)(_chat_idx));
RDebugUtils.currentLine=11468861;
 //BA.debugLineNum = 11468861;BA.debugLine="list_like(7).Add(status)";
mostCurrent._list_like[(int) (7)].Add((Object)(_status));
RDebugUtils.currentLine=11468862;
 //BA.debugLineNum = 11468862;BA.debugLine="list_like(8).Add(token)";
mostCurrent._list_like[(int) (8)].Add((Object)(_token));
RDebugUtils.currentLine=11468863;
 //BA.debugLineNum = 11468863;BA.debugLine="list_like(9).Add(picx)";
mostCurrent._list_like[(int) (9)].Add((Object)(_picx));
RDebugUtils.currentLine=11468864;
 //BA.debugLineNum = 11468864;BA.debugLine="list_like(10).Add(msg_idx)";
mostCurrent._list_like[(int) (10)].Add((Object)(_msg_idx));
RDebugUtils.currentLine=11468865;
 //BA.debugLineNum = 11468865;BA.debugLine="list_like(11).Add(njob)";
mostCurrent._list_like[(int) (11)].Add((Object)(_njob));
 }
};
RDebugUtils.currentLine=11468871;
 //BA.debugLineNum = 11468871;BA.debugLine="nll=list_like(4).Size";
_nll = mostCurrent._list_like[(int) (4)].getSize();
RDebugUtils.currentLine=11468873;
 //BA.debugLineNum = 11468873;BA.debugLine="If list_like(4).Size>0 Then";
if (mostCurrent._list_like[(int) (4)].getSize()>0) { 
RDebugUtils.currentLine=11468874;
 //BA.debugLineNum = 11468874;BA.debugLine="setviewsa(0)";
_setviewsa((int) (0));
 };
 break; }
case 3: {
RDebugUtils.currentLine=11468880;
 //BA.debugLineNum = 11468880;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=11468881;
 //BA.debugLineNum = 11468881;BA.debugLine="parser.Initialize(Result)";
_parser.Initialize(_result);
RDebugUtils.currentLine=11468882;
 //BA.debugLineNum = 11468882;BA.debugLine="Dim root As List = parser.NextArray";
_root = new anywheresoftware.b4a.objects.collections.List();
_root = _parser.NextArray();
RDebugUtils.currentLine=11468883;
 //BA.debugLineNum = 11468883;BA.debugLine="For Each colroot As Map In root";
_colroot = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group67 = _root;
final int groupLen67 = group67.getSize()
;int index67 = 0;
;
for (; index67 < groupLen67;index67++){
_colroot.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group67.Get(index67)));
RDebugUtils.currentLine=11468884;
 //BA.debugLineNum = 11468884;BA.debugLine="Dim uid As String = colroot.Get(\"uid\")";
_uid = BA.ObjectToString(_colroot.Get((Object)("uid")));
RDebugUtils.currentLine=11468885;
 //BA.debugLineNum = 11468885;BA.debugLine="Dim codes As String = colroot.Get(\"codes\")";
_codes = BA.ObjectToString(_colroot.Get((Object)("codes")));
RDebugUtils.currentLine=11468886;
 //BA.debugLineNum = 11468886;BA.debugLine="Dim types As String = colroot.Get(\"types\")";
_types = BA.ObjectToString(_colroot.Get((Object)("types")));
RDebugUtils.currentLine=11468887;
 //BA.debugLineNum = 11468887;BA.debugLine="Dim comtext As String = colroot.Get(\"comtext\")";
_comtext = BA.ObjectToString(_colroot.Get((Object)("comtext")));
RDebugUtils.currentLine=11468888;
 //BA.debugLineNum = 11468888;BA.debugLine="Dim start As String = colroot.Get(\"start\")";
_start = BA.ObjectToString(_colroot.Get((Object)("start")));
RDebugUtils.currentLine=11468889;
 //BA.debugLineNum = 11468889;BA.debugLine="Dim finish As String = colroot.Get(\"finish\")";
_finish = BA.ObjectToString(_colroot.Get((Object)("finish")));
RDebugUtils.currentLine=11468890;
 //BA.debugLineNum = 11468890;BA.debugLine="Dim id As String = colroot.Get(\"id\")";
_id = BA.ObjectToString(_colroot.Get((Object)("id")));
RDebugUtils.currentLine=11468891;
 //BA.debugLineNum = 11468891;BA.debugLine="Dim userid As String = colroot.Get(\"userid\")";
_userid = BA.ObjectToString(_colroot.Get((Object)("userid")));
RDebugUtils.currentLine=11468892;
 //BA.debugLineNum = 11468892;BA.debugLine="Dim imgpost As String = colroot.Get(\"imgpost\")";
_imgpost = BA.ObjectToString(_colroot.Get((Object)("imgpost")));
RDebugUtils.currentLine=11468893;
 //BA.debugLineNum = 11468893;BA.debugLine="Dim target As String = colroot.Get(\"target\")";
_target = BA.ObjectToString(_colroot.Get((Object)("target")));
RDebugUtils.currentLine=11468894;
 //BA.debugLineNum = 11468894;BA.debugLine="Dim status As String = colroot.Get(\"status\")";
_status = BA.ObjectToString(_colroot.Get((Object)("status")));
RDebugUtils.currentLine=11468895;
 //BA.debugLineNum = 11468895;BA.debugLine="Dim token As String = colroot.Get(\"token\")";
_token = BA.ObjectToString(_colroot.Get((Object)("token")));
RDebugUtils.currentLine=11468897;
 //BA.debugLineNum = 11468897;BA.debugLine="list_com(0).Add(uid)";
mostCurrent._list_com[(int) (0)].Add((Object)(_uid));
RDebugUtils.currentLine=11468898;
 //BA.debugLineNum = 11468898;BA.debugLine="list_com(1).Add(types)";
mostCurrent._list_com[(int) (1)].Add((Object)(_types));
RDebugUtils.currentLine=11468899;
 //BA.debugLineNum = 11468899;BA.debugLine="list_com(2).Add(start)";
mostCurrent._list_com[(int) (2)].Add((Object)(_start));
RDebugUtils.currentLine=11468900;
 //BA.debugLineNum = 11468900;BA.debugLine="list_com(3).Add(finish)";
mostCurrent._list_com[(int) (3)].Add((Object)(_finish));
RDebugUtils.currentLine=11468901;
 //BA.debugLineNum = 11468901;BA.debugLine="list_com(4).Add(id)";
mostCurrent._list_com[(int) (4)].Add((Object)(_id));
RDebugUtils.currentLine=11468902;
 //BA.debugLineNum = 11468902;BA.debugLine="list_com(5).Add(userid)";
mostCurrent._list_com[(int) (5)].Add((Object)(_userid));
RDebugUtils.currentLine=11468903;
 //BA.debugLineNum = 11468903;BA.debugLine="list_com(6).Add(target)";
mostCurrent._list_com[(int) (6)].Add((Object)(_target));
RDebugUtils.currentLine=11468904;
 //BA.debugLineNum = 11468904;BA.debugLine="list_com(7).Add(status)";
mostCurrent._list_com[(int) (7)].Add((Object)(_status));
RDebugUtils.currentLine=11468905;
 //BA.debugLineNum = 11468905;BA.debugLine="list_com(8).Add(token)";
mostCurrent._list_com[(int) (8)].Add((Object)(_token));
RDebugUtils.currentLine=11468906;
 //BA.debugLineNum = 11468906;BA.debugLine="list_com(9).Add(comtext)";
mostCurrent._list_com[(int) (9)].Add((Object)(_comtext));
RDebugUtils.currentLine=11468907;
 //BA.debugLineNum = 11468907;BA.debugLine="list_com(10).Add(imgpost)";
mostCurrent._list_com[(int) (10)].Add((Object)(_imgpost));
 }
};
RDebugUtils.currentLine=11468914;
 //BA.debugLineNum = 11468914;BA.debugLine="Log(comtext)";
anywheresoftware.b4a.keywords.Common.LogImpl("611468914",_comtext,0);
RDebugUtils.currentLine=11468916;
 //BA.debugLineNum = 11468916;BA.debugLine="ncc=list_com(4).Size";
_ncc = mostCurrent._list_com[(int) (4)].getSize();
RDebugUtils.currentLine=11468918;
 //BA.debugLineNum = 11468918;BA.debugLine="setviewsa(1)";
_setviewsa((int) (1));
 break; }
case 4: {
RDebugUtils.currentLine=11468921;
 //BA.debugLineNum = 11468921;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=11468922;
 //BA.debugLineNum = 11468922;BA.debugLine="parser.Initialize(Result)";
_parser.Initialize(_result);
RDebugUtils.currentLine=11468923;
 //BA.debugLineNum = 11468923;BA.debugLine="Dim root As List = parser.NextArray";
_root = new anywheresoftware.b4a.objects.collections.List();
_root = _parser.NextArray();
RDebugUtils.currentLine=11468924;
 //BA.debugLineNum = 11468924;BA.debugLine="For Each colroot As Map In root";
_colroot = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group99 = _root;
final int groupLen99 = group99.getSize()
;int index99 = 0;
;
for (; index99 < groupLen99;index99++){
_colroot.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group99.Get(index99)));
RDebugUtils.currentLine=11468925;
 //BA.debugLineNum = 11468925;BA.debugLine="Dim uid As String = colroot.Get(\"uid\")";
_uid = BA.ObjectToString(_colroot.Get((Object)("uid")));
RDebugUtils.currentLine=11468926;
 //BA.debugLineNum = 11468926;BA.debugLine="Dim msg_idx As String = colroot.Get(\"msg_id\")";
_msg_idx = BA.ObjectToString(_colroot.Get((Object)("msg_id")));
RDebugUtils.currentLine=11468927;
 //BA.debugLineNum = 11468927;BA.debugLine="Dim types As String = colroot.Get(\"types\")";
_types = BA.ObjectToString(_colroot.Get((Object)("types")));
RDebugUtils.currentLine=11468928;
 //BA.debugLineNum = 11468928;BA.debugLine="Dim start As String = colroot.Get(\"start\")";
_start = BA.ObjectToString(_colroot.Get((Object)("start")));
RDebugUtils.currentLine=11468929;
 //BA.debugLineNum = 11468929;BA.debugLine="Dim finish As String = colroot.Get(\"finish\")";
_finish = BA.ObjectToString(_colroot.Get((Object)("finish")));
RDebugUtils.currentLine=11468930;
 //BA.debugLineNum = 11468930;BA.debugLine="Dim id As String = colroot.Get(\"id\")";
_id = BA.ObjectToString(_colroot.Get((Object)("id")));
RDebugUtils.currentLine=11468931;
 //BA.debugLineNum = 11468931;BA.debugLine="Dim userid As String = colroot.Get(\"userid\")";
_userid = BA.ObjectToString(_colroot.Get((Object)("userid")));
RDebugUtils.currentLine=11468932;
 //BA.debugLineNum = 11468932;BA.debugLine="Dim picx As String = colroot.Get(\"pic\")";
_picx = BA.ObjectToString(_colroot.Get((Object)("pic")));
RDebugUtils.currentLine=11468933;
 //BA.debugLineNum = 11468933;BA.debugLine="Dim chat_idx As String = colroot.Get(\"chat_id\"";
_chat_idx = BA.ObjectToString(_colroot.Get((Object)("chat_id")));
RDebugUtils.currentLine=11468934;
 //BA.debugLineNum = 11468934;BA.debugLine="Dim status As String = colroot.Get(\"status\")";
_status = BA.ObjectToString(_colroot.Get((Object)("status")));
RDebugUtils.currentLine=11468935;
 //BA.debugLineNum = 11468935;BA.debugLine="Dim token As String = colroot.Get(\"token\")";
_token = BA.ObjectToString(_colroot.Get((Object)("token")));
RDebugUtils.currentLine=11468936;
 //BA.debugLineNum = 11468936;BA.debugLine="Log(\"pic : \"&picx)";
anywheresoftware.b4a.keywords.Common.LogImpl("611468936","pic : "+_picx,0);
RDebugUtils.currentLine=11468937;
 //BA.debugLineNum = 11468937;BA.debugLine="list_follow(0).Add(uid)";
mostCurrent._list_follow[(int) (0)].Add((Object)(_uid));
RDebugUtils.currentLine=11468938;
 //BA.debugLineNum = 11468938;BA.debugLine="list_follow(1).Add(types)";
mostCurrent._list_follow[(int) (1)].Add((Object)(_types));
RDebugUtils.currentLine=11468939;
 //BA.debugLineNum = 11468939;BA.debugLine="list_follow(2).Add(start)";
mostCurrent._list_follow[(int) (2)].Add((Object)(_start));
RDebugUtils.currentLine=11468940;
 //BA.debugLineNum = 11468940;BA.debugLine="list_follow(3).Add(finish)";
mostCurrent._list_follow[(int) (3)].Add((Object)(_finish));
RDebugUtils.currentLine=11468941;
 //BA.debugLineNum = 11468941;BA.debugLine="list_follow(4).Add(id)";
mostCurrent._list_follow[(int) (4)].Add((Object)(_id));
RDebugUtils.currentLine=11468942;
 //BA.debugLineNum = 11468942;BA.debugLine="list_follow(5).Add(userid)";
mostCurrent._list_follow[(int) (5)].Add((Object)(_userid));
RDebugUtils.currentLine=11468943;
 //BA.debugLineNum = 11468943;BA.debugLine="list_follow(6).Add(chat_idx)";
mostCurrent._list_follow[(int) (6)].Add((Object)(_chat_idx));
RDebugUtils.currentLine=11468944;
 //BA.debugLineNum = 11468944;BA.debugLine="list_follow(7).Add(status)";
mostCurrent._list_follow[(int) (7)].Add((Object)(_status));
RDebugUtils.currentLine=11468945;
 //BA.debugLineNum = 11468945;BA.debugLine="list_follow(8).Add(token)";
mostCurrent._list_follow[(int) (8)].Add((Object)(_token));
RDebugUtils.currentLine=11468946;
 //BA.debugLineNum = 11468946;BA.debugLine="list_follow(9).Add(picx)";
mostCurrent._list_follow[(int) (9)].Add((Object)(_picx));
RDebugUtils.currentLine=11468947;
 //BA.debugLineNum = 11468947;BA.debugLine="list_follow(10).Add(msg_idx)";
mostCurrent._list_follow[(int) (10)].Add((Object)(_msg_idx));
 }
};
RDebugUtils.currentLine=11468949;
 //BA.debugLineNum = 11468949;BA.debugLine="nff=list_follow(4).Size";
_nff = mostCurrent._list_follow[(int) (4)].getSize();
RDebugUtils.currentLine=11468950;
 //BA.debugLineNum = 11468950;BA.debugLine="If list_follow(4).Size>0 Then";
if (mostCurrent._list_follow[(int) (4)].getSize()>0) { 
RDebugUtils.currentLine=11468951;
 //BA.debugLineNum = 11468951;BA.debugLine="setviewsa(2)";
_setviewsa((int) (2));
 };
 break; }
case 5: {
RDebugUtils.currentLine=11468957;
 //BA.debugLineNum = 11468957;BA.debugLine="If Result.Contains(\"error_code\")=True Then";
if (_result.contains("error_code")==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=11468958;
 //BA.debugLineNum = 11468958;BA.debugLine="Select type_done";
switch (_type_done) {
case 1: {
RDebugUtils.currentLine=11468960;
 //BA.debugLineNum = 11468960;BA.debugLine="ToastMessageShow(\"از قبل بازدید شده\",False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("از قبل بازدید شده"),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=11468961;
 //BA.debugLineNum = 11468961;BA.debugLine="getnex(0)";
_getnex((int) (0));
 break; }
case 2: {
RDebugUtils.currentLine=11468964;
 //BA.debugLineNum = 11468964;BA.debugLine="ToastMessageShow(\"از قبل جوین شده\",False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("از قبل جوین شده"),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=11468965;
 //BA.debugLineNum = 11468965;BA.debugLine="getnex(2)";
_getnex((int) (2));
 break; }
case 0: {
RDebugUtils.currentLine=11468968;
 //BA.debugLineNum = 11468968;BA.debugLine="ToastMessageShow(\"از قبل جوین شده\",False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("از قبل جوین شده"),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=11468969;
 //BA.debugLineNum = 11468969;BA.debugLine="getnex(2)";
_getnex((int) (2));
 break; }
}
;
 }else {
RDebugUtils.currentLine=11468973;
 //BA.debugLineNum = 11468973;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=11468974;
 //BA.debugLineNum = 11468974;BA.debugLine="parser.Initialize(Result)";
_parser.Initialize(_result);
RDebugUtils.currentLine=11468975;
 //BA.debugLineNum = 11468975;BA.debugLine="Dim root As List = parser.NextArray";
_root = new anywheresoftware.b4a.objects.collections.List();
_root = _parser.NextArray();
RDebugUtils.currentLine=11468976;
 //BA.debugLineNum = 11468976;BA.debugLine="For Each colroot As Map In root";
_colroot = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group145 = _root;
final int groupLen145 = group145.getSize()
;int index145 = 0;
;
for (; index145 < groupLen145;index145++){
_colroot.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group145.Get(index145)));
RDebugUtils.currentLine=11468977;
 //BA.debugLineNum = 11468977;BA.debugLine="Dim Result As String = colroot.Get(\"result\")";
_result = BA.ObjectToString(_colroot.Get((Object)("result")));
RDebugUtils.currentLine=11468978;
 //BA.debugLineNum = 11468978;BA.debugLine="Dim c_m As String = colroot.Get(\"c_m\")";
_c_m = BA.ObjectToString(_colroot.Get((Object)("c_m")));
RDebugUtils.currentLine=11468979;
 //BA.debugLineNum = 11468979;BA.debugLine="Dim uid As String = colroot.Get(\"uid\")";
_uid = BA.ObjectToString(_colroot.Get((Object)("uid")));
RDebugUtils.currentLine=11468980;
 //BA.debugLineNum = 11468980;BA.debugLine="Dim id As String = colroot.Get(\"id\")";
_id = BA.ObjectToString(_colroot.Get((Object)("id")));
RDebugUtils.currentLine=11468983;
 //BA.debugLineNum = 11468983;BA.debugLine="Dim userid As String = colroot.Get(\"userid\")";
_userid = BA.ObjectToString(_colroot.Get((Object)("userid")));
RDebugUtils.currentLine=11468984;
 //BA.debugLineNum = 11468984;BA.debugLine="Dim username As String = colroot.Get(\"usernam";
_username = BA.ObjectToString(_colroot.Get((Object)("username")));
RDebugUtils.currentLine=11468987;
 //BA.debugLineNum = 11468987;BA.debugLine="sql1.ExecNonQuery(\"UPDATE tbl_coin set cm='\"&";
_sql1.ExecNonQuery("UPDATE tbl_coin set cm='"+_c_m+"',cf='0' WHERE userid='"+mostCurrent._userid_t+"' ");
 }
};
RDebugUtils.currentLine=11468991;
 //BA.debugLineNum = 11468991;BA.debugLine="Dim n_coins=c_m As Long";
_n_coins = (long)(Double.parseDouble(_c_m));
RDebugUtils.currentLine=11468992;
 //BA.debugLineNum = 11468992;BA.debugLine="If n_coins>100 Then";
if (_n_coins>100) { 
RDebugUtils.currentLine=11468993;
 //BA.debugLineNum = 11468993;BA.debugLine="lbl_nums.Text=\"سکه \"&NumberFormat(n_coins,3,0";
mostCurrent._lbl_nums.setText(BA.ObjectToCharSequence("سکه "+anywheresoftware.b4a.keywords.Common.NumberFormat(_n_coins,(int) (3),(int) (0))));
 }else {
RDebugUtils.currentLine=11468995;
 //BA.debugLineNum = 11468995;BA.debugLine="lbl_nums.Text=\"سکه \"&n_coins";
mostCurrent._lbl_nums.setText(BA.ObjectToCharSequence("سکه "+BA.NumberToString(_n_coins)));
 };
RDebugUtils.currentLine=11468998;
 //BA.debugLineNum = 11468998;BA.debugLine="Select type_done";
switch (_type_done) {
case 1: {
RDebugUtils.currentLine=11469001;
 //BA.debugLineNum = 11469001;BA.debugLine="getnex(nll)";
_getnex(_nll);
 break; }
case 0: {
RDebugUtils.currentLine=11469004;
 //BA.debugLineNum = 11469004;BA.debugLine="getnex(nff)";
_getnex(_nff);
 break; }
}
;
 };
 break; }
}
;
RDebugUtils.currentLine=11469012;
 //BA.debugLineNum = 11469012;BA.debugLine="End Sub";
return "";
}
public static String  _setviewsa(int _posisa) throws Exception{
RDebugUtils.currentModule="ac_tfreecoin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "setviewsa", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "setviewsa", new Object[] {_posisa}));}
int _i = 0;
long _n_coins = 0L;
RDebugUtils.currentLine=12189696;
 //BA.debugLineNum = 12189696;BA.debugLine="Sub setviewsa(posisa As Int)";
RDebugUtils.currentLine=12189697;
 //BA.debugLineNum = 12189697;BA.debugLine="Try";
try {RDebugUtils.currentLine=12189698;
 //BA.debugLineNum = 12189698;BA.debugLine="cursor1 = sql1.ExecQuery(\"SELECT * FROM tbl_coin";
_cursor1.setObject((android.database.Cursor)(_sql1.ExecQuery("SELECT * FROM tbl_coin WHERE userid='"+mostCurrent._userid_t+"' ")));
RDebugUtils.currentLine=12189699;
 //BA.debugLineNum = 12189699;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=12189700;
 //BA.debugLineNum = 12189700;BA.debugLine="For i=0 To cursor1.RowCount-1";
{
final int step4 = 1;
final int limit4 = (int) (_cursor1.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=12189701;
 //BA.debugLineNum = 12189701;BA.debugLine="cursor1.Position=i";
_cursor1.setPosition(_i);
RDebugUtils.currentLine=12189702;
 //BA.debugLineNum = 12189702;BA.debugLine="cm=cursor1.GetString(\"cm\")";
mostCurrent._cm = _cursor1.GetString("cm");
 }
};
RDebugUtils.currentLine=12189707;
 //BA.debugLineNum = 12189707;BA.debugLine="Select type_done";
switch (_type_done) {
case 1: {
RDebugUtils.currentLine=12189709;
 //BA.debugLineNum = 12189709;BA.debugLine="nll=nll-1";
_nll = (int) (_nll-1);
RDebugUtils.currentLine=12189711;
 //BA.debugLineNum = 12189711;BA.debugLine="glide.Load2(list_like(9).Get(nll)).OptionalCir";
mostCurrent._glide.Load2(mostCurrent.activityBA,BA.ObjectToString(mostCurrent._list_like[(int) (9)].Get(_nll))).OptionalCircleCrop().Into((anywheresoftware.b4a.objects.ImageViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ImageViewWrapper(), (android.widget.ImageView)(mostCurrent._img_target.getObject())));
RDebugUtils.currentLine=12189714;
 //BA.debugLineNum = 12189714;BA.debugLine="Dim n_coins=cm As Long";
_n_coins = (long)(Double.parseDouble(mostCurrent._cm));
RDebugUtils.currentLine=12189715;
 //BA.debugLineNum = 12189715;BA.debugLine="If n_coins>100 Then";
if (_n_coins>100) { 
RDebugUtils.currentLine=12189716;
 //BA.debugLineNum = 12189716;BA.debugLine="lbl_nums.Text=\"سکه \"&NumberFormat(n_coins,3,0";
mostCurrent._lbl_nums.setText(BA.ObjectToCharSequence("سکه "+anywheresoftware.b4a.keywords.Common.NumberFormat(_n_coins,(int) (3),(int) (0))));
 }else {
RDebugUtils.currentLine=12189718;
 //BA.debugLineNum = 12189718;BA.debugLine="lbl_nums.Text=\"سکه \"&n_coins";
mostCurrent._lbl_nums.setText(BA.ObjectToCharSequence("سکه "+BA.NumberToString(_n_coins)));
 };
 break; }
case 0: {
RDebugUtils.currentLine=12189722;
 //BA.debugLineNum = 12189722;BA.debugLine="nff=nff-1";
_nff = (int) (_nff-1);
RDebugUtils.currentLine=12189723;
 //BA.debugLineNum = 12189723;BA.debugLine="Log(\"img : \"&list_follow(9).Get(nff))";
anywheresoftware.b4a.keywords.Common.LogImpl("612189723","img : "+BA.ObjectToString(mostCurrent._list_follow[(int) (9)].Get(_nff)),0);
RDebugUtils.currentLine=12189724;
 //BA.debugLineNum = 12189724;BA.debugLine="glide.Load2(list_follow(9).Get(nff)).OptionalC";
mostCurrent._glide.Load2(mostCurrent.activityBA,BA.ObjectToString(mostCurrent._list_follow[(int) (9)].Get(_nff))).OptionalCenterCrop().Into((anywheresoftware.b4a.objects.ImageViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ImageViewWrapper(), (android.widget.ImageView)(mostCurrent._img_target.getObject())));
RDebugUtils.currentLine=12189727;
 //BA.debugLineNum = 12189727;BA.debugLine="Dim n_coins=cm As Long";
_n_coins = (long)(Double.parseDouble(mostCurrent._cm));
RDebugUtils.currentLine=12189728;
 //BA.debugLineNum = 12189728;BA.debugLine="If n_coins>100 Then";
if (_n_coins>100) { 
RDebugUtils.currentLine=12189729;
 //BA.debugLineNum = 12189729;BA.debugLine="lbl_nums.Text=\"سکه \"&NumberFormat(n_coins,3,0";
mostCurrent._lbl_nums.setText(BA.ObjectToCharSequence("سکه "+anywheresoftware.b4a.keywords.Common.NumberFormat(_n_coins,(int) (3),(int) (0))));
 }else {
RDebugUtils.currentLine=12189731;
 //BA.debugLineNum = 12189731;BA.debugLine="lbl_nums.Text=\"سکه \"&n_coins";
mostCurrent._lbl_nums.setText(BA.ObjectToCharSequence("سکه "+BA.NumberToString(_n_coins)));
 };
 break; }
}
;
 } 
       catch (Exception e30) {
			processBA.setLastException(e30);RDebugUtils.currentLine=12189735;
 //BA.debugLineNum = 12189735;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("612189735",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 };
RDebugUtils.currentLine=12189739;
 //BA.debugLineNum = 12189739;BA.debugLine="End Sub";
return "";
}
public static String  _setanimation(String _inanimation,String _outanimation) throws Exception{
RDebugUtils.currentModule="ac_tfreecoin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "setanimation", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "setanimation", new Object[] {_inanimation,_outanimation}));}
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
String _package = "";
int _in = 0;
int _out = 0;
RDebugUtils.currentLine=11272192;
 //BA.debugLineNum = 11272192;BA.debugLine="Sub SetAnimation(InAnimation As String, OutAnimati";
RDebugUtils.currentLine=11272193;
 //BA.debugLineNum = 11272193;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=11272194;
 //BA.debugLineNum = 11272194;BA.debugLine="Dim package As String";
_package = "";
RDebugUtils.currentLine=11272195;
 //BA.debugLineNum = 11272195;BA.debugLine="Dim In, out As Int";
_in = 0;
_out = 0;
RDebugUtils.currentLine=11272196;
 //BA.debugLineNum = 11272196;BA.debugLine="package = r.GetStaticField(\"anywheresoftware.b4a.";
_package = BA.ObjectToString(_r.GetStaticField("anywheresoftware.b4a.BA","packageName"));
RDebugUtils.currentLine=11272197;
 //BA.debugLineNum = 11272197;BA.debugLine="In = r.GetStaticField(package & \".R$anim\", InAnim";
_in = (int)(BA.ObjectToNumber(_r.GetStaticField(_package+".R$anim",_inanimation)));
RDebugUtils.currentLine=11272198;
 //BA.debugLineNum = 11272198;BA.debugLine="out = r.GetStaticField(package & \".R$anim\", OutAn";
_out = (int)(BA.ObjectToNumber(_r.GetStaticField(_package+".R$anim",_outanimation)));
RDebugUtils.currentLine=11272199;
 //BA.debugLineNum = 11272199;BA.debugLine="r.Target = r.GetActivity";
_r.Target = (Object)(_r.GetActivity(processBA));
RDebugUtils.currentLine=11272200;
 //BA.debugLineNum = 11272200;BA.debugLine="r.RunMethod4(\"overridePendingTransition\", Array A";
_r.RunMethod4("overridePendingTransition",new Object[]{(Object)(_in),(Object)(_out)},new String[]{"java.lang.int","java.lang.int"});
RDebugUtils.currentLine=11272201;
 //BA.debugLineNum = 11272201;BA.debugLine="End Sub";
return "";
}
public static String  _telegs_chatgroup(String _stt) throws Exception{
RDebugUtils.currentModule="ac_tfreecoin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "telegs_chatgroup", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "telegs_chatgroup", new Object[] {_stt}));}
RDebugUtils.currentLine=12517376;
 //BA.debugLineNum = 12517376;BA.debugLine="Sub telegs_chatgroup(stt As String)";
RDebugUtils.currentLine=12517377;
 //BA.debugLineNum = 12517377;BA.debugLine="Log(stt)";
anywheresoftware.b4a.keywords.Common.LogImpl("612517377",_stt,0);
RDebugUtils.currentLine=12517378;
 //BA.debugLineNum = 12517378;BA.debugLine="End Sub";
return "";
}
public static String  _telegs_errormsg(String _value) throws Exception{
RDebugUtils.currentModule="ac_tfreecoin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "telegs_errormsg", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "telegs_errormsg", new Object[] {_value}));}
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
String _error_msg = "";
int _errorconstructor = 0;
int _error_code = 0;
com.valdesekamdem.library.mdtoast.MaterialToast _mt = null;
RDebugUtils.currentLine=12320768;
 //BA.debugLineNum = 12320768;BA.debugLine="Sub telegs_errormsg(value As String)";
RDebugUtils.currentLine=12320769;
 //BA.debugLineNum = 12320769;BA.debugLine="LogColor(value,Colors.Blue)";
anywheresoftware.b4a.keywords.Common.LogImpl("612320769",_value,anywheresoftware.b4a.keywords.Common.Colors.Blue);
RDebugUtils.currentLine=12320770;
 //BA.debugLineNum = 12320770;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=12320771;
 //BA.debugLineNum = 12320771;BA.debugLine="parser.Initialize(value)";
_parser.Initialize(_value);
RDebugUtils.currentLine=12320772;
 //BA.debugLineNum = 12320772;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=12320773;
 //BA.debugLineNum = 12320773;BA.debugLine="Dim Error_msg As String = root.Get(\"Error_msg\")";
_error_msg = BA.ObjectToString(_root.Get((Object)("Error_msg")));
RDebugUtils.currentLine=12320774;
 //BA.debugLineNum = 12320774;BA.debugLine="Dim ErrorConstructor As Int = root.Get(\"ErrorCons";
_errorconstructor = (int)(BA.ObjectToNumber(_root.Get((Object)("ErrorConstructor"))));
RDebugUtils.currentLine=12320775;
 //BA.debugLineNum = 12320775;BA.debugLine="Dim Error_code As Int = root.Get(\"Error_code\")";
_error_code = (int)(BA.ObjectToNumber(_root.Get((Object)("Error_code"))));
RDebugUtils.currentLine=12320777;
 //BA.debugLineNum = 12320777;BA.debugLine="Dim mt As KJ_MaterialToast";
_mt = new com.valdesekamdem.library.mdtoast.MaterialToast();
RDebugUtils.currentLine=12320778;
 //BA.debugLineNum = 12320778;BA.debugLine="mt.Initialize(\"خطا : \"&Error_msg,mt.LENGTH_LONG,m";
_mt.Initialize(mostCurrent.activityBA,"خطا : "+_error_msg,_mt.LENGTH_LONG,_mt.TYPE_INFO);
RDebugUtils.currentLine=12320780;
 //BA.debugLineNum = 12320780;BA.debugLine="End Sub";
return "";
}
public static String  _telegs_getsmessagess(String _stt) throws Exception{
RDebugUtils.currentModule="ac_tfreecoin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "telegs_getsmessagess", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "telegs_getsmessagess", new Object[] {_stt}));}
RDebugUtils.currentLine=12582912;
 //BA.debugLineNum = 12582912;BA.debugLine="Sub telegs_getsmessagess(stt As String)";
RDebugUtils.currentLine=12582914;
 //BA.debugLineNum = 12582914;BA.debugLine="Log(stt)";
anywheresoftware.b4a.keywords.Common.LogImpl("612582914",_stt,0);
RDebugUtils.currentLine=12582915;
 //BA.debugLineNum = 12582915;BA.debugLine="End Sub";
return "";
}
public static String  _telegs_viewdon(String _value) throws Exception{
RDebugUtils.currentModule="ac_tfreecoin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "telegs_viewdon", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "telegs_viewdon", new Object[] {_value}));}
RDebugUtils.currentLine=12386304;
 //BA.debugLineNum = 12386304;BA.debugLine="Sub telegs_viewdon(value As String)";
RDebugUtils.currentLine=12386305;
 //BA.debugLineNum = 12386305;BA.debugLine="LogColor(\"view : \"&value,Colors.Blue)";
anywheresoftware.b4a.keywords.Common.LogImpl("612386305","view : "+_value,anywheresoftware.b4a.keywords.Common.Colors.Blue);
RDebugUtils.currentLine=12386306;
 //BA.debugLineNum = 12386306;BA.debugLine="End Sub";
return "";
}
}