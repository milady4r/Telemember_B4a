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

public class ac_shop extends Activity implements B4AActivity{
	public static ac_shop mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "com.it.fome", "com.it.fome.ac_shop");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (ac_shop).");
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
		activityBA = new BA(this, layout, processBA, "com.it.fome", "com.it.fome.ac_shop");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "com.it.fome.ac_shop", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (ac_shop) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (ac_shop) Resume **");
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
		return ac_shop.class;
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
        BA.LogInfo("** Activity (ac_shop) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            ac_shop mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (ac_shop) Resume **");
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
public static anywheresoftware.b4a.objects.collections.List _listchats = null;
public static anywheresoftware.b4a.sql.SQL _sql1 = null;
public static anywheresoftware.b4a.sql.SQL.CursorWrapper _cursor1 = null;
public static String _username_t = "";
public static String _userid_t = "";
public static String _chatid = "";
public static int _typesef = 0;
public anywheresoftware.b4a.objects.LabelWrapper _meno = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnl_coins = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_icon = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_nums = null;
public com.flycoroundview.mc7.MC7RoundView _roundview = null;
public wir.hitex.recycler.Hitex_LayoutView _lv = null;
public com.hitex_glide.Hitex_Glide _glide = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnl_lv = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnl_dilogs = null;
public static String _username_target = "";
public static String _title_target = "";
public static String _id_target = "";
public static String _idchannel_target = "";
public static String _img_target = "";
public static String _i_username = "";
public static String _i_pk = "";
public static String _i_cookie = "";
public static String _i_pic = "";
public com.it.fome.mi_meno _mimeno = null;
public b4a.example.dateutils _dateutils = null;
public com.it.fome.main _main = null;
public com.it.fome.ac_telelogin _ac_telelogin = null;
public com.it.fome.ac_tansfer _ac_tansfer = null;
public com.it.fome.firebasemessaging _firebasemessaging = null;
public com.it.fome.ac_tselect _ac_tselect = null;
public com.it.fome.ac_lchats _ac_lchats = null;
public com.it.fome.ac_tfreecoin _ac_tfreecoin = null;
public com.it.fome.ac_hsef _ac_hsef = null;
public com.it.fome.ac_tsearch _ac_tsearch = null;
public com.it.fome.ac_tcoin _ac_tcoin = null;
public com.it.fome.ac_home _ac_home = null;
public com.it.fome.act_chat _act_chat = null;
public com.it.fome.starter _starter = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="ac_shop";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
int _i = 0;
anywheresoftware.b4a.objects.drawable.GradientDrawable _gradient1 = null;
int[] _clrs = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _bkcolor = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _bkcolor_st = null;
anywheresoftware.b4a.objects.PanelWrapper _pnlb1 = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _bg = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl_a = null;
anywheresoftware.b4a.objects.PanelWrapper _pnl_shop = null;
com.it.fome.mi_shop _mishop = null;
RDebugUtils.currentLine=3801088;
 //BA.debugLineNum = 3801088;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=3801091;
 //BA.debugLineNum = 3801091;BA.debugLine="If File.Exists(File.DirInternal,\"instadb.db\")=Fal";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"instadb.db")==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=3801092;
 //BA.debugLineNum = 3801092;BA.debugLine="File.Copy(File.DirAssets,\"instadb.db\",File.DirIn";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"instadb.db",anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"instadb.db");
 };
RDebugUtils.currentLine=3801094;
 //BA.debugLineNum = 3801094;BA.debugLine="If sql1.IsInitialized=False Then";
if (_sql1.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=3801095;
 //BA.debugLineNum = 3801095;BA.debugLine="sql1.Initialize(File.DirInternal,\"instadb.db\",Fa";
_sql1.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"instadb.db",anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=3801106;
 //BA.debugLineNum = 3801106;BA.debugLine="cursor1 = sql1.ExecQuery(\"SELECT * FROM tbl_acc W";
_cursor1.setObject((android.database.Cursor)(_sql1.ExecQuery("SELECT * FROM tbl_acc WHERE soich='1' ")));
RDebugUtils.currentLine=3801107;
 //BA.debugLineNum = 3801107;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=3801108;
 //BA.debugLineNum = 3801108;BA.debugLine="For i=0 To cursor1.RowCount-1";
{
final int step9 = 1;
final int limit9 = (int) (_cursor1.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
RDebugUtils.currentLine=3801109;
 //BA.debugLineNum = 3801109;BA.debugLine="cursor1.Position=i";
_cursor1.setPosition(_i);
RDebugUtils.currentLine=3801110;
 //BA.debugLineNum = 3801110;BA.debugLine="i_cookie=cursor1.GetString(\"cookie\")";
mostCurrent._i_cookie = _cursor1.GetString("cookie");
RDebugUtils.currentLine=3801111;
 //BA.debugLineNum = 3801111;BA.debugLine="i_username=cursor1.GetString(\"username\")";
mostCurrent._i_username = _cursor1.GetString("username");
RDebugUtils.currentLine=3801112;
 //BA.debugLineNum = 3801112;BA.debugLine="i_pk=cursor1.GetString(\"pk\")";
mostCurrent._i_pk = _cursor1.GetString("pk");
RDebugUtils.currentLine=3801113;
 //BA.debugLineNum = 3801113;BA.debugLine="i_pic=cursor1.GetString(\"profile_pic_url\")";
mostCurrent._i_pic = _cursor1.GetString("profile_pic_url");
 }
};
RDebugUtils.currentLine=3801116;
 //BA.debugLineNum = 3801116;BA.debugLine="cursor1 = sql1.ExecQuery(\"SELECT * FROM tbl_tele";
_cursor1.setObject((android.database.Cursor)(_sql1.ExecQuery("SELECT * FROM tbl_tele WHERE soich='1'")));
RDebugUtils.currentLine=3801117;
 //BA.debugLineNum = 3801117;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=3801118;
 //BA.debugLineNum = 3801118;BA.debugLine="For i=0 To cursor1.RowCount-1";
{
final int step18 = 1;
final int limit18 = (int) (_cursor1.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit18 ;_i = _i + step18 ) {
RDebugUtils.currentLine=3801119;
 //BA.debugLineNum = 3801119;BA.debugLine="cursor1.Position=i";
_cursor1.setPosition(_i);
RDebugUtils.currentLine=3801120;
 //BA.debugLineNum = 3801120;BA.debugLine="userid_t=cursor1.GetString(\"userid\")";
_userid_t = _cursor1.GetString("userid");
RDebugUtils.currentLine=3801121;
 //BA.debugLineNum = 3801121;BA.debugLine="username_t=cursor1.GetString(\"username\")";
_username_t = _cursor1.GetString("username");
 }
};
RDebugUtils.currentLine=3801123;
 //BA.debugLineNum = 3801123;BA.debugLine="cursor1.Close";
_cursor1.Close();
RDebugUtils.currentLine=3801125;
 //BA.debugLineNum = 3801125;BA.debugLine="listchats.Initialize";
_listchats.Initialize();
RDebugUtils.currentLine=3801127;
 //BA.debugLineNum = 3801127;BA.debugLine="Dim Gradient1 As GradientDrawable";
_gradient1 = new anywheresoftware.b4a.objects.drawable.GradientDrawable();
RDebugUtils.currentLine=3801128;
 //BA.debugLineNum = 3801128;BA.debugLine="Dim Clrs(5) As Int";
_clrs = new int[(int) (5)];
;
RDebugUtils.currentLine=3801129;
 //BA.debugLineNum = 3801129;BA.debugLine="Clrs(0) = 0xFFe8eaf6";
_clrs[(int) (0)] = (int) (0xffe8eaf6);
RDebugUtils.currentLine=3801130;
 //BA.debugLineNum = 3801130;BA.debugLine="Clrs(1) = 0xFFe8eaf6";
_clrs[(int) (1)] = (int) (0xffe8eaf6);
RDebugUtils.currentLine=3801131;
 //BA.debugLineNum = 3801131;BA.debugLine="Clrs(2) = 0xFFe8eaf6";
_clrs[(int) (2)] = (int) (0xffe8eaf6);
RDebugUtils.currentLine=3801132;
 //BA.debugLineNum = 3801132;BA.debugLine="Clrs(3) = 0xFF283593";
_clrs[(int) (3)] = (int) (0xff283593);
RDebugUtils.currentLine=3801133;
 //BA.debugLineNum = 3801133;BA.debugLine="Clrs(4) = 0xFF283593";
_clrs[(int) (4)] = (int) (0xff283593);
RDebugUtils.currentLine=3801135;
 //BA.debugLineNum = 3801135;BA.debugLine="Gradient1.Initialize(\"TOP_BOTTOM\", Clrs)";
_gradient1.Initialize(BA.getEnumFromString(android.graphics.drawable.GradientDrawable.Orientation.class,"TOP_BOTTOM"),_clrs);
RDebugUtils.currentLine=3801136;
 //BA.debugLineNum = 3801136;BA.debugLine="Activity.Background=Gradient1";
mostCurrent._activity.setBackground((android.graphics.drawable.Drawable)(_gradient1.getObject()));
RDebugUtils.currentLine=3801138;
 //BA.debugLineNum = 3801138;BA.debugLine="Dim bkcolor As ColorDrawable";
_bkcolor = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=3801139;
 //BA.debugLineNum = 3801139;BA.debugLine="bkcolor.Initialize2(Colors.White,15,2dip,Colors.L";
_bkcolor.Initialize2(anywheresoftware.b4a.keywords.Common.Colors.White,(int) (15),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (2)),anywheresoftware.b4a.keywords.Common.Colors.LightGray);
RDebugUtils.currentLine=3801140;
 //BA.debugLineNum = 3801140;BA.debugLine="meno.Initialize(\"meno\")";
mostCurrent._meno.Initialize(mostCurrent.activityBA,"meno");
RDebugUtils.currentLine=3801141;
 //BA.debugLineNum = 3801141;BA.debugLine="meno.TextColor=Colors.DarkGray";
mostCurrent._meno.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.DarkGray);
RDebugUtils.currentLine=3801142;
 //BA.debugLineNum = 3801142;BA.debugLine="meno.TextSize=37";
mostCurrent._meno.setTextSize((float) (37));
RDebugUtils.currentLine=3801143;
 //BA.debugLineNum = 3801143;BA.debugLine="meno.Background=bkcolor";
mostCurrent._meno.setBackground((android.graphics.drawable.Drawable)(_bkcolor.getObject()));
RDebugUtils.currentLine=3801144;
 //BA.debugLineNum = 3801144;BA.debugLine="meno.Typeface=Typeface.MATERIALICONS";
mostCurrent._meno.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.getMATERIALICONS());
RDebugUtils.currentLine=3801145;
 //BA.debugLineNum = 3801145;BA.debugLine="meno.Text=Chr(0xE3C7)";
mostCurrent._meno.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr((int) (0xe3c7))));
RDebugUtils.currentLine=3801146;
 //BA.debugLineNum = 3801146;BA.debugLine="meno.Gravity=Gravity.CENTER_HORIZONTAL+Gravity.CE";
mostCurrent._meno.setGravity((int) (anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL+anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=3801147;
 //BA.debugLineNum = 3801147;BA.debugLine="Activity.AddView(meno,3%x,3%x,12%x,12%x)";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._meno.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (3),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (3),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (12),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (12),mostCurrent.activityBA));
RDebugUtils.currentLine=3801149;
 //BA.debugLineNum = 3801149;BA.debugLine="pnl_coins.Initialize(\"pnl_coins\")";
mostCurrent._pnl_coins.Initialize(mostCurrent.activityBA,"pnl_coins");
RDebugUtils.currentLine=3801150;
 //BA.debugLineNum = 3801150;BA.debugLine="Activity.AddView(pnl_coins,50%x,3%x,50%x,12%x)";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._pnl_coins.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (50),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (3),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (50),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (12),mostCurrent.activityBA));
RDebugUtils.currentLine=3801151;
 //BA.debugLineNum = 3801151;BA.debugLine="roundview.Initialize(pnl_coins)";
mostCurrent._roundview.Initialize(processBA,(android.view.View)(mostCurrent._pnl_coins.getObject()));
RDebugUtils.currentLine=3801152;
 //BA.debugLineNum = 3801152;BA.debugLine="roundview.CornerRadius_BL=10%x";
mostCurrent._roundview.setCornerRadius_BL(anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA));
RDebugUtils.currentLine=3801153;
 //BA.debugLineNum = 3801153;BA.debugLine="roundview.CornerRadius_TL=10%x";
mostCurrent._roundview.setCornerRadius_TL(anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA));
RDebugUtils.currentLine=3801154;
 //BA.debugLineNum = 3801154;BA.debugLine="roundview.BackgroundColor=Colors.White";
mostCurrent._roundview.setBackgroundColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=3801156;
 //BA.debugLineNum = 3801156;BA.debugLine="Dim bkcolor_st As ColorDrawable";
_bkcolor_st = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=3801157;
 //BA.debugLineNum = 3801157;BA.debugLine="bkcolor_st.Initialize2(0xFFC67D00,50,4dip,0x82FFE";
_bkcolor_st.Initialize2((int) (0xffc67d00),(int) (50),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (4)),(int) (0x82ffe300));
RDebugUtils.currentLine=3801159;
 //BA.debugLineNum = 3801159;BA.debugLine="Dim pnlb1 As Panel";
_pnlb1 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=3801160;
 //BA.debugLineNum = 3801160;BA.debugLine="pnlb1.Initialize(\"\")";
_pnlb1.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=3801161;
 //BA.debugLineNum = 3801161;BA.debugLine="pnlb1.Color=0xFFFFC300";
_pnlb1.setColor((int) (0xffffc300));
RDebugUtils.currentLine=3801162;
 //BA.debugLineNum = 3801162;BA.debugLine="pnlb1.Background=bkcolor_st";
_pnlb1.setBackground((android.graphics.drawable.Drawable)(_bkcolor_st.getObject()));
RDebugUtils.currentLine=3801163;
 //BA.debugLineNum = 3801163;BA.debugLine="pnl_coins.AddView(pnlb1,pnl_coins.Width-11%x,1%x,";
mostCurrent._pnl_coins.AddView((android.view.View)(_pnlb1.getObject()),(int) (mostCurrent._pnl_coins.getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (11),mostCurrent.activityBA)),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (1),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA),(int) (mostCurrent._pnl_coins.getHeight()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (2),mostCurrent.activityBA)));
RDebugUtils.currentLine=3801165;
 //BA.debugLineNum = 3801165;BA.debugLine="lbl_icon.Initialize(\"lbl_icon\")";
mostCurrent._lbl_icon.Initialize(mostCurrent.activityBA,"lbl_icon");
RDebugUtils.currentLine=3801166;
 //BA.debugLineNum = 3801166;BA.debugLine="lbl_icon.SetBackgroundImage(LoadBitmap(File.DirAs";
mostCurrent._lbl_icon.SetBackgroundImageNew((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"coins.png").getObject()));
RDebugUtils.currentLine=3801167;
 //BA.debugLineNum = 3801167;BA.debugLine="pnl_coins.AddView(lbl_icon,pnl_coins.Width-9%x,pn";
mostCurrent._pnl_coins.AddView((android.view.View)(mostCurrent._lbl_icon.getObject()),(int) (mostCurrent._pnl_coins.getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (9),mostCurrent.activityBA)),(int) (mostCurrent._pnl_coins.getHeight()/(double)2/(double)2),(int) (mostCurrent._pnl_coins.getHeight()/(double)2),(int) (mostCurrent._pnl_coins.getHeight()/(double)2));
RDebugUtils.currentLine=3801169;
 //BA.debugLineNum = 3801169;BA.debugLine="lbl_nums.Initialize(\"lbl_nums\")";
mostCurrent._lbl_nums.Initialize(mostCurrent.activityBA,"lbl_nums");
RDebugUtils.currentLine=3801170;
 //BA.debugLineNum = 3801170;BA.debugLine="lbl_nums.TextColor=Colors.DarkGray";
mostCurrent._lbl_nums.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.DarkGray);
RDebugUtils.currentLine=3801171;
 //BA.debugLineNum = 3801171;BA.debugLine="lbl_nums.TextSize=20";
mostCurrent._lbl_nums.setTextSize((float) (20));
RDebugUtils.currentLine=3801172;
 //BA.debugLineNum = 3801172;BA.debugLine="lbl_nums.Typeface=Typeface.LoadFromAssets(\"iran_s";
mostCurrent._lbl_nums.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("iran_sans.ttf"));
RDebugUtils.currentLine=3801173;
 //BA.debugLineNum = 3801173;BA.debugLine="lbl_nums.Text=0&\" سکه\"";
mostCurrent._lbl_nums.setText(BA.ObjectToCharSequence(BA.NumberToString(0)+" سکه"));
RDebugUtils.currentLine=3801174;
 //BA.debugLineNum = 3801174;BA.debugLine="lbl_nums.Gravity=Gravity.CENTER_VERTICAL+Gravity.";
mostCurrent._lbl_nums.setGravity((int) (anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL+anywheresoftware.b4a.keywords.Common.Gravity.RIGHT));
RDebugUtils.currentLine=3801175;
 //BA.debugLineNum = 3801175;BA.debugLine="pnl_coins.AddView(lbl_nums,2%x,0,pnl_coins.Width-";
mostCurrent._pnl_coins.AddView((android.view.View)(mostCurrent._lbl_nums.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (2),mostCurrent.activityBA),(int) (0),(int) (mostCurrent._pnl_coins.getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (15),mostCurrent.activityBA)),mostCurrent._pnl_coins.getHeight());
RDebugUtils.currentLine=3801177;
 //BA.debugLineNum = 3801177;BA.debugLine="Dim bg As ColorDrawable";
_bg = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=3801178;
 //BA.debugLineNum = 3801178;BA.debugLine="bg.Initialize2(Colors.White,5dip,2dip,Colors.Ligh";
_bg.Initialize2(anywheresoftware.b4a.keywords.Common.Colors.White,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (5)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (2)),anywheresoftware.b4a.keywords.Common.Colors.LightGray);
RDebugUtils.currentLine=3801179;
 //BA.debugLineNum = 3801179;BA.debugLine="pnl_lv.Initialize(\"pnl_lv\")";
mostCurrent._pnl_lv.Initialize(mostCurrent.activityBA,"pnl_lv");
RDebugUtils.currentLine=3801180;
 //BA.debugLineNum = 3801180;BA.debugLine="pnl_lv.Background=bg";
mostCurrent._pnl_lv.setBackground((android.graphics.drawable.Drawable)(_bg.getObject()));
RDebugUtils.currentLine=3801181;
 //BA.debugLineNum = 3801181;BA.debugLine="Activity.AddView(pnl_lv,5%x,12%y,100%x-10%x,90%y-";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._pnl_lv.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (12),mostCurrent.activityBA),(int) (anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA)-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA)),(int) (anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (90),mostCurrent.activityBA)-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (7),mostCurrent.activityBA)));
RDebugUtils.currentLine=3801183;
 //BA.debugLineNum = 3801183;BA.debugLine="Dim lbl_a As Label";
_lbl_a = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=3801184;
 //BA.debugLineNum = 3801184;BA.debugLine="lbl_a.Initialize(\"lbl_a\")";
_lbl_a.Initialize(mostCurrent.activityBA,"lbl_a");
RDebugUtils.currentLine=3801185;
 //BA.debugLineNum = 3801185;BA.debugLine="lbl_a.TextColor=Colors.DarkGray";
_lbl_a.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.DarkGray);
RDebugUtils.currentLine=3801186;
 //BA.debugLineNum = 3801186;BA.debugLine="lbl_a.TextSize=20";
_lbl_a.setTextSize((float) (20));
RDebugUtils.currentLine=3801187;
 //BA.debugLineNum = 3801187;BA.debugLine="lbl_a.Typeface=Typeface.LoadFromAssets(\"iran_sans";
_lbl_a.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("iran_sans.ttf"));
RDebugUtils.currentLine=3801188;
 //BA.debugLineNum = 3801188;BA.debugLine="lbl_a.Text=\"فروشگاه سکه\"";
_lbl_a.setText(BA.ObjectToCharSequence("فروشگاه سکه"));
RDebugUtils.currentLine=3801189;
 //BA.debugLineNum = 3801189;BA.debugLine="lbl_a.Gravity=Gravity.CENTER_VERTICAL+Gravity.CEN";
_lbl_a.setGravity((int) (anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL+anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL));
RDebugUtils.currentLine=3801190;
 //BA.debugLineNum = 3801190;BA.debugLine="pnl_lv.AddView(lbl_a,5%x,0,pnl_lv.Width-10%x,12%x";
mostCurrent._pnl_lv.AddView((android.view.View)(_lbl_a.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA),(int) (0),(int) (mostCurrent._pnl_lv.getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA)),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (12),mostCurrent.activityBA));
RDebugUtils.currentLine=3801198;
 //BA.debugLineNum = 3801198;BA.debugLine="Dim pnl_shop As Panel";
_pnl_shop = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=3801199;
 //BA.debugLineNum = 3801199;BA.debugLine="pnl_shop.Initialize(\"pnl_shop\")";
_pnl_shop.Initialize(mostCurrent.activityBA,"pnl_shop");
RDebugUtils.currentLine=3801200;
 //BA.debugLineNum = 3801200;BA.debugLine="pnl_lv.AddView(pnl_shop,0,lbl_a.Top+lbl_a.Height+";
mostCurrent._pnl_lv.AddView((android.view.View)(_pnl_shop.getObject()),(int) (0),(int) (_lbl_a.getTop()+_lbl_a.getHeight()+anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (2),mostCurrent.activityBA)),mostCurrent._pnl_lv.getWidth(),(int) (mostCurrent._pnl_lv.getHeight()-_lbl_a.getTop()-_lbl_a.getHeight()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (3),mostCurrent.activityBA)));
RDebugUtils.currentLine=3801202;
 //BA.debugLineNum = 3801202;BA.debugLine="Select typesef";
switch (_typesef) {
case 0: {
RDebugUtils.currentLine=3801204;
 //BA.debugLineNum = 3801204;BA.debugLine="Dim mishop As MI_shop";
_mishop = new com.it.fome.mi_shop();
RDebugUtils.currentLine=3801205;
 //BA.debugLineNum = 3801205;BA.debugLine="mishop.Initialize(\"mishop\",Me)";
_mishop._initialize /*String*/ (null,mostCurrent.activityBA,"mishop",ac_shop.getObject());
RDebugUtils.currentLine=3801206;
 //BA.debugLineNum = 3801206;BA.debugLine="mishop.type_history=0";
_mishop._type_history /*int*/  = (int) (0);
RDebugUtils.currentLine=3801207;
 //BA.debugLineNum = 3801207;BA.debugLine="mishop.addpnl(pnl_shop)";
_mishop._addpnl /*anywheresoftware.b4a.objects.ConcreteViewWrapper*/ (null,_pnl_shop);
RDebugUtils.currentLine=3801208;
 //BA.debugLineNum = 3801208;BA.debugLine="req_igetme(i_pk)";
_req_igetme(mostCurrent._i_pk);
 break; }
case 1: {
RDebugUtils.currentLine=3801210;
 //BA.debugLineNum = 3801210;BA.debugLine="Dim mishop As MI_shop";
_mishop = new com.it.fome.mi_shop();
RDebugUtils.currentLine=3801211;
 //BA.debugLineNum = 3801211;BA.debugLine="mishop.Initialize(\"mishop\",Me)";
_mishop._initialize /*String*/ (null,mostCurrent.activityBA,"mishop",ac_shop.getObject());
RDebugUtils.currentLine=3801212;
 //BA.debugLineNum = 3801212;BA.debugLine="mishop.type_history=1";
_mishop._type_history /*int*/  = (int) (1);
RDebugUtils.currentLine=3801213;
 //BA.debugLineNum = 3801213;BA.debugLine="mishop.addpnl(pnl_shop)";
_mishop._addpnl /*anywheresoftware.b4a.objects.ConcreteViewWrapper*/ (null,_pnl_shop);
RDebugUtils.currentLine=3801214;
 //BA.debugLineNum = 3801214;BA.debugLine="req_getme(userid_t)";
_req_getme(_userid_t);
 break; }
}
;
RDebugUtils.currentLine=3801220;
 //BA.debugLineNum = 3801220;BA.debugLine="End Sub";
return "";
}
public static String  _req_igetme(String _userid) throws Exception{
RDebugUtils.currentModule="ac_shop";
if (Debug.shouldDelegate(mostCurrent.activityBA, "req_igetme", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "req_igetme", new Object[] {_userid}));}
com.reza.sh.fastnet.Fastnet _prfn = null;
com.reza.sh.fastnet.PostRequestRaper _post = null;
RDebugUtils.currentLine=4128768;
 //BA.debugLineNum = 4128768;BA.debugLine="Sub req_igetme(userid As String)";
RDebugUtils.currentLine=4128769;
 //BA.debugLineNum = 4128769;BA.debugLine="Dim prfn As PersianFastNetwork";
_prfn = new com.reza.sh.fastnet.Fastnet();
RDebugUtils.currentLine=4128770;
 //BA.debugLineNum = 4128770;BA.debugLine="prfn.initialize(\"prfn\")";
_prfn.initialize(processBA,"prfn");
RDebugUtils.currentLine=4128772;
 //BA.debugLineNum = 4128772;BA.debugLine="Dim post As PostRequest";
_post = new com.reza.sh.fastnet.PostRequestRaper();
RDebugUtils.currentLine=4128773;
 //BA.debugLineNum = 4128773;BA.debugLine="post=prfn.BuildPostQuery(\"http://filework.ir/INST";
_post = _prfn.BuildPostQuery("http://filework.ir/INSTAFOLLOW/api/req.php","igetinsta");
RDebugUtils.currentLine=4128775;
 //BA.debugLineNum = 4128775;BA.debugLine="post.addHeder(\"User-Agent\",\"Dalvik/1.6.0 (Linux;";
_post.addHeder("User-Agent","Dalvik/1.6.0 (Linux; U; Android 4.4.4; SM-A700FD Build/KTU84P)");
RDebugUtils.currentLine=4128777;
 //BA.debugLineNum = 4128777;BA.debugLine="post.addParametrs(\"ui\",\"1\")";
_post.addParametrs("ui","1");
RDebugUtils.currentLine=4128778;
 //BA.debugLineNum = 4128778;BA.debugLine="post.addParametrs(\"userid\",i_pk)";
_post.addParametrs("userid",mostCurrent._i_pk);
RDebugUtils.currentLine=4128780;
 //BA.debugLineNum = 4128780;BA.debugLine="post.addParametrs(\"req\",\"get_acci\")";
_post.addParametrs("req","get_acci");
RDebugUtils.currentLine=4128783;
 //BA.debugLineNum = 4128783;BA.debugLine="post.executRequestAsString";
_post.executRequestAsString();
RDebugUtils.currentLine=4128784;
 //BA.debugLineNum = 4128784;BA.debugLine="End Sub";
return "";
}
public static String  _req_getme(String _userid) throws Exception{
RDebugUtils.currentModule="ac_shop";
if (Debug.shouldDelegate(mostCurrent.activityBA, "req_getme", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "req_getme", new Object[] {_userid}));}
com.reza.sh.fastnet.Fastnet _prfn = null;
com.reza.sh.fastnet.PostRequestRaper _post = null;
RDebugUtils.currentLine=4063232;
 //BA.debugLineNum = 4063232;BA.debugLine="Sub req_getme(userid As String)";
RDebugUtils.currentLine=4063233;
 //BA.debugLineNum = 4063233;BA.debugLine="Dim prfn As PersianFastNetwork";
_prfn = new com.reza.sh.fastnet.Fastnet();
RDebugUtils.currentLine=4063234;
 //BA.debugLineNum = 4063234;BA.debugLine="prfn.initialize(\"prfn\")";
_prfn.initialize(processBA,"prfn");
RDebugUtils.currentLine=4063236;
 //BA.debugLineNum = 4063236;BA.debugLine="Dim post As PostRequest";
_post = new com.reza.sh.fastnet.PostRequestRaper();
RDebugUtils.currentLine=4063237;
 //BA.debugLineNum = 4063237;BA.debugLine="post=prfn.BuildPostQuery(\"http://filework.ir/INST";
_post = _prfn.BuildPostQuery("http://filework.ir/INSTAFOLLOW/api/req.php","getinsta");
RDebugUtils.currentLine=4063239;
 //BA.debugLineNum = 4063239;BA.debugLine="post.addHeder(\"User-Agent\",\"Dalvik/1.6.0 (Linux;";
_post.addHeder("User-Agent","Dalvik/1.6.0 (Linux; U; Android 4.4.4; SM-A700FD Build/KTU84P)");
RDebugUtils.currentLine=4063241;
 //BA.debugLineNum = 4063241;BA.debugLine="post.addParametrs(\"ui\",\"1\")";
_post.addParametrs("ui","1");
RDebugUtils.currentLine=4063242;
 //BA.debugLineNum = 4063242;BA.debugLine="post.addParametrs(\"userid\",userid_t)";
_post.addParametrs("userid",_userid_t);
RDebugUtils.currentLine=4063244;
 //BA.debugLineNum = 4063244;BA.debugLine="post.addParametrs(\"req\",\"get_acct\")";
_post.addParametrs("req","get_acct");
RDebugUtils.currentLine=4063247;
 //BA.debugLineNum = 4063247;BA.debugLine="post.executRequestAsString";
_post.executRequestAsString();
RDebugUtils.currentLine=4063248;
 //BA.debugLineNum = 4063248;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="ac_shop";
RDebugUtils.currentLine=3932160;
 //BA.debugLineNum = 3932160;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=3932162;
 //BA.debugLineNum = 3932162;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="ac_shop";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=3866624;
 //BA.debugLineNum = 3866624;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=3866626;
 //BA.debugLineNum = 3866626;BA.debugLine="End Sub";
return "";
}
public static String  _meno_click() throws Exception{
RDebugUtils.currentModule="ac_shop";
if (Debug.shouldDelegate(mostCurrent.activityBA, "meno_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "meno_click", null));}
RDebugUtils.currentLine=4390912;
 //BA.debugLineNum = 4390912;BA.debugLine="Sub meno_Click";
RDebugUtils.currentLine=4390913;
 //BA.debugLineNum = 4390913;BA.debugLine="mimeno.Initialize(\"mimeno\",Me)";
mostCurrent._mimeno._initialize /*String*/ (null,mostCurrent.activityBA,"mimeno",ac_shop.getObject());
RDebugUtils.currentLine=4390914;
 //BA.debugLineNum = 4390914;BA.debugLine="mimeno.addpnl";
mostCurrent._mimeno._addpnl /*String*/ (null);
RDebugUtils.currentLine=4390915;
 //BA.debugLineNum = 4390915;BA.debugLine="mimeno.open";
mostCurrent._mimeno._open /*String*/ (null);
RDebugUtils.currentLine=4390916;
 //BA.debugLineNum = 4390916;BA.debugLine="End Sub";
return "";
}
public static String  _mishop_newcointele(String _value) throws Exception{
RDebugUtils.currentModule="ac_shop";
if (Debug.shouldDelegate(mostCurrent.activityBA, "mishop_newcointele", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "mishop_newcointele", new Object[] {_value}));}
long _n_coins = 0L;
RDebugUtils.currentLine=4325376;
 //BA.debugLineNum = 4325376;BA.debugLine="Sub mishop_newcointele(value As String)";
RDebugUtils.currentLine=4325377;
 //BA.debugLineNum = 4325377;BA.debugLine="Log(\"coin : \"&value)";
anywheresoftware.b4a.keywords.Common.LogImpl("64325377","coin : "+_value,0);
RDebugUtils.currentLine=4325378;
 //BA.debugLineNum = 4325378;BA.debugLine="Dim n_coins=value As Long";
_n_coins = (long)(Double.parseDouble(_value));
RDebugUtils.currentLine=4325379;
 //BA.debugLineNum = 4325379;BA.debugLine="If n_coins>100 Then";
if (_n_coins>100) { 
RDebugUtils.currentLine=4325380;
 //BA.debugLineNum = 4325380;BA.debugLine="lbl_nums.Text=\"سکه \"&NumberFormat(n_coins,3,0)";
mostCurrent._lbl_nums.setText(BA.ObjectToCharSequence("سکه "+anywheresoftware.b4a.keywords.Common.NumberFormat(_n_coins,(int) (3),(int) (0))));
 }else {
RDebugUtils.currentLine=4325382;
 //BA.debugLineNum = 4325382;BA.debugLine="lbl_nums.Text=\"سکه \"&n_coins";
mostCurrent._lbl_nums.setText(BA.ObjectToCharSequence("سکه "+BA.NumberToString(_n_coins)));
 };
RDebugUtils.currentLine=4325384;
 //BA.debugLineNum = 4325384;BA.debugLine="End Sub";
return "";
}
public static String  _prfn_onpoststringerrorlistener(com.reza.sh.fastnet.Error _error,String _tag) throws Exception{
RDebugUtils.currentModule="ac_shop";
if (Debug.shouldDelegate(mostCurrent.activityBA, "prfn_onpoststringerrorlistener", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "prfn_onpoststringerrorlistener", new Object[] {_error,_tag}));}
RDebugUtils.currentLine=4194304;
 //BA.debugLineNum = 4194304;BA.debugLine="Sub prfn_onPostStringErrorListener(Error As Respon";
RDebugUtils.currentLine=4194306;
 //BA.debugLineNum = 4194306;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=4194307;
 //BA.debugLineNum = 4194307;BA.debugLine="End Sub";
return "";
}
public static String  _prfn_onpoststringoklistener(String _result,String _tag) throws Exception{
RDebugUtils.currentModule="ac_shop";
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
RDebugUtils.currentLine=4259840;
 //BA.debugLineNum = 4259840;BA.debugLine="Sub prfn_onPostStringOkListener(Result As String";
RDebugUtils.currentLine=4259842;
 //BA.debugLineNum = 4259842;BA.debugLine="Select Tag";
switch (BA.switchObjectToInt(_tag,"iuser","igetinsta","getinsta")) {
case 0: {
RDebugUtils.currentLine=4259844;
 //BA.debugLineNum = 4259844;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=4259845;
 //BA.debugLineNum = 4259845;BA.debugLine="Log(Result)";
anywheresoftware.b4a.keywords.Common.LogImpl("64259845",_result,0);
 break; }
case 1: {
RDebugUtils.currentLine=4259847;
 //BA.debugLineNum = 4259847;BA.debugLine="Log(Result)";
anywheresoftware.b4a.keywords.Common.LogImpl("64259847",_result,0);
RDebugUtils.currentLine=4259848;
 //BA.debugLineNum = 4259848;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=4259849;
 //BA.debugLineNum = 4259849;BA.debugLine="parser.Initialize(Result)";
_parser.Initialize(_result);
RDebugUtils.currentLine=4259850;
 //BA.debugLineNum = 4259850;BA.debugLine="Dim root As List = parser.NextArray";
_root = new anywheresoftware.b4a.objects.collections.List();
_root = _parser.NextArray();
RDebugUtils.currentLine=4259851;
 //BA.debugLineNum = 4259851;BA.debugLine="For Each colroot As Map In root";
_colroot = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group10 = _root;
final int groupLen10 = group10.getSize()
;int index10 = 0;
;
for (; index10 < groupLen10;index10++){
_colroot.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group10.Get(index10)));
RDebugUtils.currentLine=4259852;
 //BA.debugLineNum = 4259852;BA.debugLine="Dim Result As String = colroot.Get(\"result\")";
_result = BA.ObjectToString(_colroot.Get((Object)("result")));
RDebugUtils.currentLine=4259853;
 //BA.debugLineNum = 4259853;BA.debugLine="Dim c_m As String = colroot.Get(\"c_m\")";
_c_m = BA.ObjectToString(_colroot.Get((Object)("c_m")));
RDebugUtils.currentLine=4259854;
 //BA.debugLineNum = 4259854;BA.debugLine="Dim uid As String = colroot.Get(\"uid\")";
_uid = BA.ObjectToString(_colroot.Get((Object)("uid")));
RDebugUtils.currentLine=4259855;
 //BA.debugLineNum = 4259855;BA.debugLine="Dim id As String = colroot.Get(\"id\")";
_id = BA.ObjectToString(_colroot.Get((Object)("id")));
RDebugUtils.currentLine=4259856;
 //BA.debugLineNum = 4259856;BA.debugLine="Dim c_f As String = colroot.Get(\"c_f\")";
_c_f = BA.ObjectToString(_colroot.Get((Object)("c_f")));
RDebugUtils.currentLine=4259857;
 //BA.debugLineNum = 4259857;BA.debugLine="Dim pic As String = colroot.Get(\"pic\")";
_pic = BA.ObjectToString(_colroot.Get((Object)("pic")));
RDebugUtils.currentLine=4259858;
 //BA.debugLineNum = 4259858;BA.debugLine="Dim userid As String = colroot.Get(\"userid\")";
_userid = BA.ObjectToString(_colroot.Get((Object)("userid")));
RDebugUtils.currentLine=4259859;
 //BA.debugLineNum = 4259859;BA.debugLine="Dim username As String = colroot.Get(\"username";
_username = BA.ObjectToString(_colroot.Get((Object)("username")));
RDebugUtils.currentLine=4259860;
 //BA.debugLineNum = 4259860;BA.debugLine="Log(c_f)";
anywheresoftware.b4a.keywords.Common.LogImpl("64259860",_c_f,0);
RDebugUtils.currentLine=4259861;
 //BA.debugLineNum = 4259861;BA.debugLine="Dim n_coins=c_m As Long";
_n_coins = (long)(Double.parseDouble(_c_m));
RDebugUtils.currentLine=4259862;
 //BA.debugLineNum = 4259862;BA.debugLine="If n_coins>100 Then";
if (_n_coins>100) { 
RDebugUtils.currentLine=4259863;
 //BA.debugLineNum = 4259863;BA.debugLine="lbl_nums.Text=\"سکه \"&NumberFormat(c_m,3,0)";
mostCurrent._lbl_nums.setText(BA.ObjectToCharSequence("سکه "+anywheresoftware.b4a.keywords.Common.NumberFormat((double)(Double.parseDouble(_c_m)),(int) (3),(int) (0))));
 }else {
RDebugUtils.currentLine=4259865;
 //BA.debugLineNum = 4259865;BA.debugLine="lbl_nums.Text=\"سکه \"&c_m";
mostCurrent._lbl_nums.setText(BA.ObjectToCharSequence("سکه "+_c_m));
 };
RDebugUtils.currentLine=4259869;
 //BA.debugLineNum = 4259869;BA.debugLine="sql1.ExecNonQuery(\"UPDATE tbl_coin set cm='\"&c";
_sql1.ExecNonQuery("UPDATE tbl_coin set cm='"+_c_m+"',cf='"+_c_f+"' WHERE userid='"+mostCurrent._i_pk+"' ");
 }
};
 break; }
case 2: {
RDebugUtils.currentLine=4259873;
 //BA.debugLineNum = 4259873;BA.debugLine="Log(Result)";
anywheresoftware.b4a.keywords.Common.LogImpl("64259873",_result,0);
RDebugUtils.currentLine=4259874;
 //BA.debugLineNum = 4259874;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=4259875;
 //BA.debugLineNum = 4259875;BA.debugLine="parser.Initialize(Result)";
_parser.Initialize(_result);
RDebugUtils.currentLine=4259876;
 //BA.debugLineNum = 4259876;BA.debugLine="Dim root As List = parser.NextArray";
_root = new anywheresoftware.b4a.objects.collections.List();
_root = _parser.NextArray();
RDebugUtils.currentLine=4259877;
 //BA.debugLineNum = 4259877;BA.debugLine="For Each colroot As Map In root";
_colroot = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group33 = _root;
final int groupLen33 = group33.getSize()
;int index33 = 0;
;
for (; index33 < groupLen33;index33++){
_colroot.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group33.Get(index33)));
RDebugUtils.currentLine=4259878;
 //BA.debugLineNum = 4259878;BA.debugLine="Dim Result As String = colroot.Get(\"result\")";
_result = BA.ObjectToString(_colroot.Get((Object)("result")));
RDebugUtils.currentLine=4259879;
 //BA.debugLineNum = 4259879;BA.debugLine="Dim c_m As String = colroot.Get(\"c_m\")";
_c_m = BA.ObjectToString(_colroot.Get((Object)("c_m")));
RDebugUtils.currentLine=4259880;
 //BA.debugLineNum = 4259880;BA.debugLine="Dim uid As String = colroot.Get(\"uid\")";
_uid = BA.ObjectToString(_colroot.Get((Object)("uid")));
RDebugUtils.currentLine=4259881;
 //BA.debugLineNum = 4259881;BA.debugLine="Dim first_last As String = colroot.Get(\"first_";
_first_last = BA.ObjectToString(_colroot.Get((Object)("first_last")));
RDebugUtils.currentLine=4259882;
 //BA.debugLineNum = 4259882;BA.debugLine="Dim id As String = colroot.Get(\"id\")";
_id = BA.ObjectToString(_colroot.Get((Object)("id")));
RDebugUtils.currentLine=4259883;
 //BA.debugLineNum = 4259883;BA.debugLine="Dim userid As String = colroot.Get(\"userid\")";
_userid = BA.ObjectToString(_colroot.Get((Object)("userid")));
RDebugUtils.currentLine=4259884;
 //BA.debugLineNum = 4259884;BA.debugLine="Dim username As String = colroot.Get(\"username";
_username = BA.ObjectToString(_colroot.Get((Object)("username")));
RDebugUtils.currentLine=4259885;
 //BA.debugLineNum = 4259885;BA.debugLine="Dim c_ch As String = colroot.Get(\"c_ch\")";
_c_ch = BA.ObjectToString(_colroot.Get((Object)("c_ch")));
RDebugUtils.currentLine=4259887;
 //BA.debugLineNum = 4259887;BA.debugLine="Log(c_m)";
anywheresoftware.b4a.keywords.Common.LogImpl("64259887",_c_m,0);
RDebugUtils.currentLine=4259888;
 //BA.debugLineNum = 4259888;BA.debugLine="Dim n_coins=c_m As Long";
_n_coins = (long)(Double.parseDouble(_c_m));
RDebugUtils.currentLine=4259889;
 //BA.debugLineNum = 4259889;BA.debugLine="If n_coins>100 Then";
if (_n_coins>100) { 
RDebugUtils.currentLine=4259890;
 //BA.debugLineNum = 4259890;BA.debugLine="lbl_nums.Text=\"سکه \"&NumberFormat(c_m,3,0)";
mostCurrent._lbl_nums.setText(BA.ObjectToCharSequence("سکه "+anywheresoftware.b4a.keywords.Common.NumberFormat((double)(Double.parseDouble(_c_m)),(int) (3),(int) (0))));
 }else {
RDebugUtils.currentLine=4259892;
 //BA.debugLineNum = 4259892;BA.debugLine="lbl_nums.Text=\"سکه \"&c_m";
mostCurrent._lbl_nums.setText(BA.ObjectToCharSequence("سکه "+_c_m));
 };
RDebugUtils.currentLine=4259896;
 //BA.debugLineNum = 4259896;BA.debugLine="sql1.ExecNonQuery(\"UPDATE tbl_coin set cm='\"&c";
_sql1.ExecNonQuery("UPDATE tbl_coin set cm='"+_c_m+"',cf='"+_c_ch+"' WHERE userid='"+_userid_t+"' ");
 }
};
 break; }
}
;
RDebugUtils.currentLine=4259902;
 //BA.debugLineNum = 4259902;BA.debugLine="End Sub";
return "";
}
public static String  _setanimation(String _inanimation,String _outanimation) throws Exception{
RDebugUtils.currentModule="ac_shop";
if (Debug.shouldDelegate(mostCurrent.activityBA, "setanimation", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "setanimation", new Object[] {_inanimation,_outanimation}));}
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
String _package = "";
int _in = 0;
int _out = 0;
RDebugUtils.currentLine=3997696;
 //BA.debugLineNum = 3997696;BA.debugLine="Sub SetAnimation(InAnimation As String, OutAnimati";
RDebugUtils.currentLine=3997697;
 //BA.debugLineNum = 3997697;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=3997698;
 //BA.debugLineNum = 3997698;BA.debugLine="Dim package As String";
_package = "";
RDebugUtils.currentLine=3997699;
 //BA.debugLineNum = 3997699;BA.debugLine="Dim In, out As Int";
_in = 0;
_out = 0;
RDebugUtils.currentLine=3997700;
 //BA.debugLineNum = 3997700;BA.debugLine="package = r.GetStaticField(\"anywheresoftware.b4a.";
_package = BA.ObjectToString(_r.GetStaticField("anywheresoftware.b4a.BA","packageName"));
RDebugUtils.currentLine=3997701;
 //BA.debugLineNum = 3997701;BA.debugLine="In = r.GetStaticField(package & \".R$anim\", InAnim";
_in = (int)(BA.ObjectToNumber(_r.GetStaticField(_package+".R$anim",_inanimation)));
RDebugUtils.currentLine=3997702;
 //BA.debugLineNum = 3997702;BA.debugLine="out = r.GetStaticField(package & \".R$anim\", OutAn";
_out = (int)(BA.ObjectToNumber(_r.GetStaticField(_package+".R$anim",_outanimation)));
RDebugUtils.currentLine=3997703;
 //BA.debugLineNum = 3997703;BA.debugLine="r.Target = r.GetActivity";
_r.Target = (Object)(_r.GetActivity(processBA));
RDebugUtils.currentLine=3997704;
 //BA.debugLineNum = 3997704;BA.debugLine="r.RunMethod4(\"overridePendingTransition\", Array A";
_r.RunMethod4("overridePendingTransition",new Object[]{(Object)(_in),(Object)(_out)},new String[]{"java.lang.int","java.lang.int"});
RDebugUtils.currentLine=3997705;
 //BA.debugLineNum = 3997705;BA.debugLine="End Sub";
return "";
}
}