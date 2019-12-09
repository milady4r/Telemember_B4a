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

public class ac_telelogin extends Activity implements B4AActivity{
	public static ac_telelogin mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "com.it.fome", "com.it.fome.ac_telelogin");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (ac_telelogin).");
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
		activityBA = new BA(this, layout, processBA, "com.it.fome", "com.it.fome.ac_telelogin");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "com.it.fome.ac_telelogin", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (ac_telelogin) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (ac_telelogin) Resume **");
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
		return ac_telelogin.class;
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
        BA.LogInfo("** Activity (ac_telelogin) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            ac_telelogin mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (ac_telelogin) Resume **");
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
public com.mili.telegrams.teleg_warp _telegs = null;
public anywheresoftware.b4a.objects.ButtonWrapper _button1 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageview1 = null;
public com.glide.transformation.Hitex_GlideTransformation _glide = null;
public static int _ii = 0;
public static long _chatids = 0L;
public static int _enc_key_length = 0;
public anywheresoftware.b4a.agraham.byteconverter.ByteConverter _byteconv = null;
public anywheresoftware.b4a.objects.StringUtils _stringutils1 = null;
public anywheresoftware.b4a.agraham.byteconverter.ByteConverter _bconv = null;
public static String _username = "";
public static String _password = "";
public static String _server = "";
public static int _ports = 0;
public anywheresoftware.b4a.objects.PanelWrapper _p = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_neme = null;
public anywheresoftware.b4a.objects.ButtonWrapper _login = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edit_pish = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edit_number = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edit_code = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edit_pass = null;
public anywheresoftware.b4a.objects.collections.List _userid_t = null;
public anywheresoftware.b4a.objects.collections.List _username_t = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn_code = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn_pass = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_st = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_shabake = null;
public static String _sta_conn = "";
public b4a.example.dateutils _dateutils = null;
public com.it.fome.main _main = null;
public com.it.fome.ac_shop _ac_shop = null;
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
public static String  _aa(String _usernames,String _userid,String _first_last,String _phone) throws Exception{
RDebugUtils.currentModule="ac_telelogin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "aa", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "aa", new Object[] {_usernames,_userid,_first_last,_phone}));}
com.reza.sh.fastnet.Fastnet _prfn = null;
com.reza.sh.fastnet.PostRequestRaper _post = null;
RDebugUtils.currentLine=3080192;
 //BA.debugLineNum = 3080192;BA.debugLine="Sub aa(usernames As String,userid As String,first_";
RDebugUtils.currentLine=3080193;
 //BA.debugLineNum = 3080193;BA.debugLine="Dim prfn As PersianFastNetwork";
_prfn = new com.reza.sh.fastnet.Fastnet();
RDebugUtils.currentLine=3080194;
 //BA.debugLineNum = 3080194;BA.debugLine="prfn.initialize(\"prfn\")";
_prfn.initialize(processBA,"prfn");
RDebugUtils.currentLine=3080195;
 //BA.debugLineNum = 3080195;BA.debugLine="Dim post As PostRequest";
_post = new com.reza.sh.fastnet.PostRequestRaper();
RDebugUtils.currentLine=3080196;
 //BA.debugLineNum = 3080196;BA.debugLine="post=prfn.BuildPostQuery(\"http://filework.ir/INST";
_post = _prfn.BuildPostQuery("http://filework.ir/INSTAFOLLOW/api/req.php","iuser");
RDebugUtils.currentLine=3080198;
 //BA.debugLineNum = 3080198;BA.debugLine="post.addHeder(\"User-Agent\",\"Dalvik/1.6.0 (Linux;";
_post.addHeder("User-Agent","Dalvik/1.6.0 (Linux; U; Android 4.4.4; SM-A700FD Build/KTU84P)");
RDebugUtils.currentLine=3080199;
 //BA.debugLineNum = 3080199;BA.debugLine="post.addParametrs(\"req\",\"tuser\")";
_post.addParametrs("req","tuser");
RDebugUtils.currentLine=3080201;
 //BA.debugLineNum = 3080201;BA.debugLine="post.addParametrs(\"username\",usernames)";
_post.addParametrs("username",_usernames);
RDebugUtils.currentLine=3080202;
 //BA.debugLineNum = 3080202;BA.debugLine="post.addParametrs(\"userid\",userid)";
_post.addParametrs("userid",_userid);
RDebugUtils.currentLine=3080203;
 //BA.debugLineNum = 3080203;BA.debugLine="post.addParametrs(\"first_last\",first_last)";
_post.addParametrs("first_last",_first_last);
RDebugUtils.currentLine=3080204;
 //BA.debugLineNum = 3080204;BA.debugLine="post.addParametrs(\"phone\",phone)";
_post.addParametrs("phone",_phone);
RDebugUtils.currentLine=3080205;
 //BA.debugLineNum = 3080205;BA.debugLine="post.addParametrs(\"token\",\"test\")";
_post.addParametrs("token","test");
RDebugUtils.currentLine=3080209;
 //BA.debugLineNum = 3080209;BA.debugLine="post.executRequestAsString";
_post.executRequestAsString();
RDebugUtils.currentLine=3080214;
 //BA.debugLineNum = 3080214;BA.debugLine="End Sub";
return "";
}
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="ac_telelogin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
String[] _m = null;
int _i = 0;
anywheresoftware.b4a.objects.PanelWrapper _pnl_tolbar = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _cd = null;
de.amberhome.objects.appcompat.AppCompatBase _ac = null;
anywheresoftware.b4a.objects.PanelWrapper _pnl_prox = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _bg = null;
anywheresoftware.b4a.objects.ButtonWrapper _btn_addproxy = null;
anywheresoftware.b4a.objects.ButtonWrapper _btn_cancell = null;
anywheresoftware.b4a.objects.ButtonWrapper _btn_shabake = null;
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="Try";
try {RDebugUtils.currentLine=1179656;
 //BA.debugLineNum = 1179656;BA.debugLine="telegs.Initialize(\"telegs\")";
mostCurrent._telegs.Initialize(processBA,"telegs");
RDebugUtils.currentLine=1179660;
 //BA.debugLineNum = 1179660;BA.debugLine="telegs.accname=\"milad\"";
mostCurrent._telegs.accname = "milad";
RDebugUtils.currentLine=1179661;
 //BA.debugLineNum = 1179661;BA.debugLine="Dim m(2) As String";
_m = new String[(int) (2)];
java.util.Arrays.fill(_m,"");
RDebugUtils.currentLine=1179662;
 //BA.debugLineNum = 1179662;BA.debugLine="m(0)=\"run\"";
_m[(int) (0)] = "run";
RDebugUtils.currentLine=1179663;
 //BA.debugLineNum = 1179663;BA.debugLine="telegs.main(m)";
mostCurrent._telegs.main(_m);
RDebugUtils.currentLine=1179664;
 //BA.debugLineNum = 1179664;BA.debugLine="userid_t.Initialize";
mostCurrent._userid_t.Initialize();
RDebugUtils.currentLine=1179665;
 //BA.debugLineNum = 1179665;BA.debugLine="username_t.Initialize";
mostCurrent._username_t.Initialize();
RDebugUtils.currentLine=1179671;
 //BA.debugLineNum = 1179671;BA.debugLine="If File.Exists(File.DirInternal,\"instadb.db\")=Fa";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"instadb.db")==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=1179672;
 //BA.debugLineNum = 1179672;BA.debugLine="File.Copy(File.DirAssets,\"instadb.db\",File.DirI";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"instadb.db",anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"instadb.db");
 };
RDebugUtils.currentLine=1179674;
 //BA.debugLineNum = 1179674;BA.debugLine="If sql1.IsInitialized=False Then";
if (_sql1.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=1179675;
 //BA.debugLineNum = 1179675;BA.debugLine="sql1.Initialize(File.DirInternal,\"instadb.db\",F";
_sql1.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"instadb.db",anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=1179679;
 //BA.debugLineNum = 1179679;BA.debugLine="cursor1 = sql1.ExecQuery(\"SELECT * FROM tbl_tele";
_cursor1.setObject((android.database.Cursor)(_sql1.ExecQuery("SELECT * FROM tbl_tele WHERE soich='1'")));
RDebugUtils.currentLine=1179680;
 //BA.debugLineNum = 1179680;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=1179681;
 //BA.debugLineNum = 1179681;BA.debugLine="For i=0 To cursor1.RowCount-1";
{
final int step17 = 1;
final int limit17 = (int) (_cursor1.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit17 ;_i = _i + step17 ) {
RDebugUtils.currentLine=1179682;
 //BA.debugLineNum = 1179682;BA.debugLine="cursor1.Position=i";
_cursor1.setPosition(_i);
RDebugUtils.currentLine=1179683;
 //BA.debugLineNum = 1179683;BA.debugLine="userid_t.Add(cursor1.GetString(\"userid\"))";
mostCurrent._userid_t.Add((Object)(_cursor1.GetString("userid")));
RDebugUtils.currentLine=1179684;
 //BA.debugLineNum = 1179684;BA.debugLine="username_t.Add(cursor1.GetString(\"username\"))";
mostCurrent._username_t.Add((Object)(_cursor1.GetString("username")));
 }
};
RDebugUtils.currentLine=1179686;
 //BA.debugLineNum = 1179686;BA.debugLine="cursor1.Close";
_cursor1.Close();
RDebugUtils.currentLine=1179689;
 //BA.debugLineNum = 1179689;BA.debugLine="If userid_t.Size>0 Then";
if (mostCurrent._userid_t.getSize()>0) { 
RDebugUtils.currentLine=1179690;
 //BA.debugLineNum = 1179690;BA.debugLine="StartActivity(ac_tselect)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._ac_tselect.getObject()));
RDebugUtils.currentLine=1179691;
 //BA.debugLineNum = 1179691;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 };
RDebugUtils.currentLine=1179696;
 //BA.debugLineNum = 1179696;BA.debugLine="Dim pnl_tolbar As Panel";
_pnl_tolbar = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=1179697;
 //BA.debugLineNum = 1179697;BA.debugLine="pnl_tolbar.Initialize(\"\")";
_pnl_tolbar.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=1179698;
 //BA.debugLineNum = 1179698;BA.debugLine="pnl_tolbar.Color=0xFF008AFF";
_pnl_tolbar.setColor((int) (0xff008aff));
RDebugUtils.currentLine=1179699;
 //BA.debugLineNum = 1179699;BA.debugLine="Activity.AddView(pnl_tolbar,0,0,100%x,13%X)";
mostCurrent._activity.AddView((android.view.View)(_pnl_tolbar.getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (13),mostCurrent.activityBA));
RDebugUtils.currentLine=1179702;
 //BA.debugLineNum = 1179702;BA.debugLine="Dim cd As ColorDrawable";
_cd = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=1179703;
 //BA.debugLineNum = 1179703;BA.debugLine="cd.Initialize(0xFF4379F2,0)";
_cd.Initialize((int) (0xff4379f2),(int) (0));
RDebugUtils.currentLine=1179705;
 //BA.debugLineNum = 1179705;BA.debugLine="lbl_neme.Initialize(\"\")";
mostCurrent._lbl_neme.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=1179706;
 //BA.debugLineNum = 1179706;BA.debugLine="lbl_neme.Text=\"شماره تلفن شما\"";
mostCurrent._lbl_neme.setText(BA.ObjectToCharSequence("شماره تلفن شما"));
RDebugUtils.currentLine=1179707;
 //BA.debugLineNum = 1179707;BA.debugLine="lbl_neme.TextColor=Colors.White";
mostCurrent._lbl_neme.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=1179708;
 //BA.debugLineNum = 1179708;BA.debugLine="lbl_neme.TextSize=19";
mostCurrent._lbl_neme.setTextSize((float) (19));
RDebugUtils.currentLine=1179709;
 //BA.debugLineNum = 1179709;BA.debugLine="lbl_neme.Gravity=Gravity.LEFT+Gravity.CENTER_VER";
mostCurrent._lbl_neme.setGravity((int) (anywheresoftware.b4a.keywords.Common.Gravity.LEFT+anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=1179710;
 //BA.debugLineNum = 1179710;BA.debugLine="pnl_tolbar.AddView(lbl_neme,5%x,0,50%x,pnl_tolba";
_pnl_tolbar.AddView((android.view.View)(mostCurrent._lbl_neme.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (50),mostCurrent.activityBA),_pnl_tolbar.getHeight());
RDebugUtils.currentLine=1179712;
 //BA.debugLineNum = 1179712;BA.debugLine="login.Initialize(\"login\")";
mostCurrent._login.Initialize(mostCurrent.activityBA,"login");
RDebugUtils.currentLine=1179713;
 //BA.debugLineNum = 1179713;BA.debugLine="login.Typeface=Typeface.MATERIALICONS";
mostCurrent._login.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.getMATERIALICONS());
RDebugUtils.currentLine=1179714;
 //BA.debugLineNum = 1179714;BA.debugLine="login.Text=Chr(0xE5CA)";
mostCurrent._login.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr((int) (0xe5ca))));
RDebugUtils.currentLine=1179715;
 //BA.debugLineNum = 1179715;BA.debugLine="login.TextSize=30";
mostCurrent._login.setTextSize((float) (30));
RDebugUtils.currentLine=1179716;
 //BA.debugLineNum = 1179716;BA.debugLine="login.TextColor=Colors.White";
mostCurrent._login.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=1179717;
 //BA.debugLineNum = 1179717;BA.debugLine="login.Background=cd";
mostCurrent._login.setBackground((android.graphics.drawable.Drawable)(_cd.getObject()));
RDebugUtils.currentLine=1179718;
 //BA.debugLineNum = 1179718;BA.debugLine="login.Gravity=Gravity.CENTER_HORIZONTAL+Gravity.";
mostCurrent._login.setGravity((int) (anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL+anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=1179719;
 //BA.debugLineNum = 1179719;BA.debugLine="pnl_tolbar.AddView(login,100%x-15%x,0dip,15%x,pn";
_pnl_tolbar.AddView((android.view.View)(mostCurrent._login.getObject()),(int) (anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA)-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (15),mostCurrent.activityBA)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (15),mostCurrent.activityBA),_pnl_tolbar.getHeight());
RDebugUtils.currentLine=1179720;
 //BA.debugLineNum = 1179720;BA.debugLine="Dim ac As AppCompat";
_ac = new de.amberhome.objects.appcompat.AppCompatBase();
RDebugUtils.currentLine=1179721;
 //BA.debugLineNum = 1179721;BA.debugLine="ac.SetClickEffect(login,True)";
_ac.SetClickEffect(mostCurrent.activityBA,(android.view.View)(mostCurrent._login.getObject()),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=1179722;
 //BA.debugLineNum = 1179722;BA.debugLine="Activity.Color=Colors.White";
mostCurrent._activity.setColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=1179724;
 //BA.debugLineNum = 1179724;BA.debugLine="p.Initialize(\"p\")";
mostCurrent._p.Initialize(mostCurrent.activityBA,"p");
RDebugUtils.currentLine=1179725;
 //BA.debugLineNum = 1179725;BA.debugLine="p.Color=Colors.White";
mostCurrent._p.setColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=1179726;
 //BA.debugLineNum = 1179726;BA.debugLine="Activity.AddView(p,0,pnl_tolbar.Height,100%x,100";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._p.getObject()),(int) (0),_pnl_tolbar.getHeight(),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),(int) (anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA)-_pnl_tolbar.getHeight()));
RDebugUtils.currentLine=1179728;
 //BA.debugLineNum = 1179728;BA.debugLine="edit_pish.Initialize(\"edit_pish\")";
mostCurrent._edit_pish.Initialize(mostCurrent.activityBA,"edit_pish");
RDebugUtils.currentLine=1179729;
 //BA.debugLineNum = 1179729;BA.debugLine="edit_pish.Text=\"+98\"";
mostCurrent._edit_pish.setText(BA.ObjectToCharSequence("+98"));
RDebugUtils.currentLine=1179730;
 //BA.debugLineNum = 1179730;BA.debugLine="edit_pish.InputType=edit_pish.INPUT_TYPE_NUMBERS";
mostCurrent._edit_pish.setInputType(mostCurrent._edit_pish.INPUT_TYPE_NUMBERS);
RDebugUtils.currentLine=1179732;
 //BA.debugLineNum = 1179732;BA.debugLine="p.AddView(edit_pish,5%x,5%x,15%x,12%x)";
mostCurrent._p.AddView((android.view.View)(mostCurrent._edit_pish.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (15),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (12),mostCurrent.activityBA));
RDebugUtils.currentLine=1179734;
 //BA.debugLineNum = 1179734;BA.debugLine="edit_number.Initialize(\"edit_number\")";
mostCurrent._edit_number.Initialize(mostCurrent.activityBA,"edit_number");
RDebugUtils.currentLine=1179735;
 //BA.debugLineNum = 1179735;BA.debugLine="edit_number.InputType=edit_number.INPUT_TYPE_NUM";
mostCurrent._edit_number.setInputType(mostCurrent._edit_number.INPUT_TYPE_NUMBERS);
RDebugUtils.currentLine=1179736;
 //BA.debugLineNum = 1179736;BA.debugLine="edit_number.Hint=\"__ __ __  __ __ __  __ __  __";
mostCurrent._edit_number.setHint("__ __ __  __ __ __  __ __  __ __");
RDebugUtils.currentLine=1179738;
 //BA.debugLineNum = 1179738;BA.debugLine="p.AddView(edit_number,22%x,5%x,100%x-25%x,12%x)";
mostCurrent._p.AddView((android.view.View)(mostCurrent._edit_number.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (22),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA),(int) (anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA)-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (25),mostCurrent.activityBA)),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (12),mostCurrent.activityBA));
RDebugUtils.currentLine=1179740;
 //BA.debugLineNum = 1179740;BA.debugLine="btn_code.Initialize(\"btn_code\")";
mostCurrent._btn_code.Initialize(mostCurrent.activityBA,"btn_code");
RDebugUtils.currentLine=1179741;
 //BA.debugLineNum = 1179741;BA.debugLine="btn_code.Typeface=Typeface.MATERIALICONS";
mostCurrent._btn_code.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.getMATERIALICONS());
RDebugUtils.currentLine=1179742;
 //BA.debugLineNum = 1179742;BA.debugLine="btn_code.Text=Chr(0xE5CA)";
mostCurrent._btn_code.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr((int) (0xe5ca))));
RDebugUtils.currentLine=1179743;
 //BA.debugLineNum = 1179743;BA.debugLine="btn_code.Visible=False";
mostCurrent._btn_code.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1179744;
 //BA.debugLineNum = 1179744;BA.debugLine="btn_code.TextSize=28";
mostCurrent._btn_code.setTextSize((float) (28));
RDebugUtils.currentLine=1179745;
 //BA.debugLineNum = 1179745;BA.debugLine="btn_code.TextColor=Colors.White";
mostCurrent._btn_code.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=1179746;
 //BA.debugLineNum = 1179746;BA.debugLine="btn_code.Background=cd";
mostCurrent._btn_code.setBackground((android.graphics.drawable.Drawable)(_cd.getObject()));
RDebugUtils.currentLine=1179747;
 //BA.debugLineNum = 1179747;BA.debugLine="btn_code.Gravity=Gravity.CENTER_HORIZONTAL+Gravi";
mostCurrent._btn_code.setGravity((int) (anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL+anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=1179748;
 //BA.debugLineNum = 1179748;BA.debugLine="pnl_tolbar.AddView(btn_code,100%x-15%x,0,15%x,pn";
_pnl_tolbar.AddView((android.view.View)(mostCurrent._btn_code.getObject()),(int) (anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA)-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (15),mostCurrent.activityBA)),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (15),mostCurrent.activityBA),_pnl_tolbar.getHeight());
RDebugUtils.currentLine=1179750;
 //BA.debugLineNum = 1179750;BA.debugLine="edit_code.Initialize(\"edit_code\")";
mostCurrent._edit_code.Initialize(mostCurrent.activityBA,"edit_code");
RDebugUtils.currentLine=1179751;
 //BA.debugLineNum = 1179751;BA.debugLine="edit_code.Visible=False";
mostCurrent._edit_code.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1179752;
 //BA.debugLineNum = 1179752;BA.debugLine="edit_code.InputType=edit_code.INPUT_TYPE_NUMBERS";
mostCurrent._edit_code.setInputType(mostCurrent._edit_code.INPUT_TYPE_NUMBERS);
RDebugUtils.currentLine=1179753;
 //BA.debugLineNum = 1179753;BA.debugLine="edit_code.Hint=\"کد\"";
mostCurrent._edit_code.setHint("کد");
RDebugUtils.currentLine=1179756;
 //BA.debugLineNum = 1179756;BA.debugLine="p.AddView(edit_code,22%x,5%x,100%x-25%x,12%x)";
mostCurrent._p.AddView((android.view.View)(mostCurrent._edit_code.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (22),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA),(int) (anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA)-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (25),mostCurrent.activityBA)),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (12),mostCurrent.activityBA));
RDebugUtils.currentLine=1179757;
 //BA.debugLineNum = 1179757;BA.debugLine="edit_pass.Initialize(\"edit_pass\")";
mostCurrent._edit_pass.Initialize(mostCurrent.activityBA,"edit_pass");
RDebugUtils.currentLine=1179758;
 //BA.debugLineNum = 1179758;BA.debugLine="edit_pass.InputType=edit_pass.INPUT_TYPE_TEXT";
mostCurrent._edit_pass.setInputType(mostCurrent._edit_pass.INPUT_TYPE_TEXT);
RDebugUtils.currentLine=1179759;
 //BA.debugLineNum = 1179759;BA.debugLine="edit_pass.Hint=\"گذرواژه\"";
mostCurrent._edit_pass.setHint("گذرواژه");
RDebugUtils.currentLine=1179760;
 //BA.debugLineNum = 1179760;BA.debugLine="edit_pass.HintColor=Colors.DarkGray";
mostCurrent._edit_pass.setHintColor(anywheresoftware.b4a.keywords.Common.Colors.DarkGray);
RDebugUtils.currentLine=1179761;
 //BA.debugLineNum = 1179761;BA.debugLine="edit_pass.Visible=False";
mostCurrent._edit_pass.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1179763;
 //BA.debugLineNum = 1179763;BA.debugLine="p.AddView(edit_pass,22%x,5%x,100%x-25%x,12%x)";
mostCurrent._p.AddView((android.view.View)(mostCurrent._edit_pass.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (22),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA),(int) (anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA)-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (25),mostCurrent.activityBA)),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (12),mostCurrent.activityBA));
RDebugUtils.currentLine=1179765;
 //BA.debugLineNum = 1179765;BA.debugLine="btn_pass.Initialize(\"btn_pass\")";
mostCurrent._btn_pass.Initialize(mostCurrent.activityBA,"btn_pass");
RDebugUtils.currentLine=1179767;
 //BA.debugLineNum = 1179767;BA.debugLine="btn_pass.Typeface=Typeface.MATERIALICONS";
mostCurrent._btn_pass.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.getMATERIALICONS());
RDebugUtils.currentLine=1179768;
 //BA.debugLineNum = 1179768;BA.debugLine="btn_pass.Text=Chr(0xE5CA)";
mostCurrent._btn_pass.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr((int) (0xe5ca))));
RDebugUtils.currentLine=1179769;
 //BA.debugLineNum = 1179769;BA.debugLine="btn_pass.Visible=False";
mostCurrent._btn_pass.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1179770;
 //BA.debugLineNum = 1179770;BA.debugLine="btn_pass.TextColor=Colors.White";
mostCurrent._btn_pass.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=1179771;
 //BA.debugLineNum = 1179771;BA.debugLine="btn_pass.Background=cd";
mostCurrent._btn_pass.setBackground((android.graphics.drawable.Drawable)(_cd.getObject()));
RDebugUtils.currentLine=1179772;
 //BA.debugLineNum = 1179772;BA.debugLine="btn_pass.TextSize=28";
mostCurrent._btn_pass.setTextSize((float) (28));
RDebugUtils.currentLine=1179773;
 //BA.debugLineNum = 1179773;BA.debugLine="btn_pass.Gravity=Gravity.CENTER_HORIZONTAL+Gravi";
mostCurrent._btn_pass.setGravity((int) (anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL+anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=1179774;
 //BA.debugLineNum = 1179774;BA.debugLine="pnl_tolbar.AddView(btn_pass,100%x-15%x,0,15%x,pn";
_pnl_tolbar.AddView((android.view.View)(mostCurrent._btn_pass.getObject()),(int) (anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA)-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (15),mostCurrent.activityBA)),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (15),mostCurrent.activityBA),_pnl_tolbar.getHeight());
RDebugUtils.currentLine=1179776;
 //BA.debugLineNum = 1179776;BA.debugLine="lbl_st.Initialize(\"\")";
mostCurrent._lbl_st.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=1179777;
 //BA.debugLineNum = 1179777;BA.debugLine="lbl_st.Text=\"لطفا شماره تلفنتون رو وارد کنید\"";
mostCurrent._lbl_st.setText(BA.ObjectToCharSequence("لطفا شماره تلفنتون رو وارد کنید"));
RDebugUtils.currentLine=1179778;
 //BA.debugLineNum = 1179778;BA.debugLine="lbl_st.TextColor=Colors.DarkGray";
mostCurrent._lbl_st.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.DarkGray);
RDebugUtils.currentLine=1179779;
 //BA.debugLineNum = 1179779;BA.debugLine="lbl_st.TextSize=14";
mostCurrent._lbl_st.setTextSize((float) (14));
RDebugUtils.currentLine=1179780;
 //BA.debugLineNum = 1179780;BA.debugLine="p.AddView(lbl_st,5%x,edit_code.Top+edit_code.Hei";
mostCurrent._p.AddView((android.view.View)(mostCurrent._lbl_st.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA),(int) (mostCurrent._edit_code.getTop()+mostCurrent._edit_code.getHeight()+anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (7),mostCurrent.activityBA)),(int) (anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA)-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA)),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (15),mostCurrent.activityBA));
RDebugUtils.currentLine=1179781;
 //BA.debugLineNum = 1179781;BA.debugLine="p.Height=lbl_st.Top+lbl_st.Height+5%x";
mostCurrent._p.setHeight((int) (mostCurrent._lbl_st.getTop()+mostCurrent._lbl_st.getHeight()+anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA)));
RDebugUtils.currentLine=1179783;
 //BA.debugLineNum = 1179783;BA.debugLine="Dim pnl_prox As Panel";
_pnl_prox = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=1179784;
 //BA.debugLineNum = 1179784;BA.debugLine="pnl_prox.Initialize(\"pnl_prox\")";
_pnl_prox.Initialize(mostCurrent.activityBA,"pnl_prox");
RDebugUtils.currentLine=1179785;
 //BA.debugLineNum = 1179785;BA.debugLine="pnl_prox.Color=0xFFD9D9D9";
_pnl_prox.setColor((int) (0xffd9d9d9));
RDebugUtils.currentLine=1179787;
 //BA.debugLineNum = 1179787;BA.debugLine="Activity.AddView(pnl_prox,0,p.Top+p.Height+5%x,1";
mostCurrent._activity.AddView((android.view.View)(_pnl_prox.getObject()),(int) (0),(int) (mostCurrent._p.getTop()+mostCurrent._p.getHeight()+anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA)),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (10),mostCurrent.activityBA));
RDebugUtils.currentLine=1179789;
 //BA.debugLineNum = 1179789;BA.debugLine="Dim bg As ColorDrawable";
_bg = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=1179790;
 //BA.debugLineNum = 1179790;BA.debugLine="bg.Initialize2(Colors.Transparent,5dip,2dip,Colo";
_bg.Initialize2(anywheresoftware.b4a.keywords.Common.Colors.Transparent,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (5)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (2)),anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=1179791;
 //BA.debugLineNum = 1179791;BA.debugLine="Dim btn_addproxy As Button";
_btn_addproxy = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=1179792;
 //BA.debugLineNum = 1179792;BA.debugLine="btn_addproxy.Initialize(\"btn_addproxy\")";
_btn_addproxy.Initialize(mostCurrent.activityBA,"btn_addproxy");
RDebugUtils.currentLine=1179793;
 //BA.debugLineNum = 1179793;BA.debugLine="btn_addproxy.Typeface=Typeface.LoadFromAssets(\"i";
_btn_addproxy.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("iran_sans.ttf"));
RDebugUtils.currentLine=1179794;
 //BA.debugLineNum = 1179794;BA.debugLine="btn_addproxy.Text=\"اتصال به پروکسی\"";
_btn_addproxy.setText(BA.ObjectToCharSequence("اتصال به پروکسی"));
RDebugUtils.currentLine=1179795;
 //BA.debugLineNum = 1179795;BA.debugLine="btn_addproxy.TextColor=Colors.White";
_btn_addproxy.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=1179796;
 //BA.debugLineNum = 1179796;BA.debugLine="btn_addproxy.Background=bg";
_btn_addproxy.setBackground((android.graphics.drawable.Drawable)(_bg.getObject()));
RDebugUtils.currentLine=1179797;
 //BA.debugLineNum = 1179797;BA.debugLine="btn_addproxy.TextSize=12";
_btn_addproxy.setTextSize((float) (12));
RDebugUtils.currentLine=1179798;
 //BA.debugLineNum = 1179798;BA.debugLine="btn_addproxy.Gravity=Gravity.CENTER_HORIZONTAL+G";
_btn_addproxy.setGravity((int) (anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL+anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=1179799;
 //BA.debugLineNum = 1179799;BA.debugLine="pnl_prox.AddView(btn_addproxy,5%x,2%x,pnl_prox.W";
_pnl_prox.AddView((android.view.View)(_btn_addproxy.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (2),mostCurrent.activityBA),(int) (_pnl_prox.getWidth()/(double)2-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA)),(int) (_pnl_prox.getHeight()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (4),mostCurrent.activityBA)));
RDebugUtils.currentLine=1179801;
 //BA.debugLineNum = 1179801;BA.debugLine="Dim btn_cancell As Button";
_btn_cancell = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=1179802;
 //BA.debugLineNum = 1179802;BA.debugLine="btn_cancell.Initialize(\"btn_cancell\")";
_btn_cancell.Initialize(mostCurrent.activityBA,"btn_cancell");
RDebugUtils.currentLine=1179803;
 //BA.debugLineNum = 1179803;BA.debugLine="btn_cancell.Typeface=Typeface.LoadFromAssets(\"ir";
_btn_cancell.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("iran_sans.ttf"));
RDebugUtils.currentLine=1179804;
 //BA.debugLineNum = 1179804;BA.debugLine="btn_cancell.Text=\"اتصال به شبکه گوشی\"";
_btn_cancell.setText(BA.ObjectToCharSequence("اتصال به شبکه گوشی"));
RDebugUtils.currentLine=1179805;
 //BA.debugLineNum = 1179805;BA.debugLine="btn_cancell.TextColor=Colors.White";
_btn_cancell.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=1179806;
 //BA.debugLineNum = 1179806;BA.debugLine="btn_cancell.Background=bg";
_btn_cancell.setBackground((android.graphics.drawable.Drawable)(_bg.getObject()));
RDebugUtils.currentLine=1179807;
 //BA.debugLineNum = 1179807;BA.debugLine="btn_cancell.TextSize=12";
_btn_cancell.setTextSize((float) (12));
RDebugUtils.currentLine=1179808;
 //BA.debugLineNum = 1179808;BA.debugLine="btn_cancell.Gravity=Gravity.CENTER_HORIZONTAL+Gr";
_btn_cancell.setGravity((int) (anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL+anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=1179809;
 //BA.debugLineNum = 1179809;BA.debugLine="pnl_prox.AddView(btn_cancell,btn_addproxy.Left+b";
_pnl_prox.AddView((android.view.View)(_btn_cancell.getObject()),(int) (_btn_addproxy.getLeft()+_btn_addproxy.getWidth()+anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (15),mostCurrent.activityBA)),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (2),mostCurrent.activityBA),(int) (_pnl_prox.getWidth()/(double)2-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA)),(int) (_pnl_prox.getHeight()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (4),mostCurrent.activityBA)));
RDebugUtils.currentLine=1179811;
 //BA.debugLineNum = 1179811;BA.debugLine="pnl_prox.Height=btn_cancell.Top+btn_cancell.Heig";
_pnl_prox.setHeight((int) (_btn_cancell.getTop()+_btn_cancell.getHeight()+anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (2),mostCurrent.activityBA)));
RDebugUtils.currentLine=1179813;
 //BA.debugLineNum = 1179813;BA.debugLine="Dim btn_shabake As Button";
_btn_shabake = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=1179814;
 //BA.debugLineNum = 1179814;BA.debugLine="btn_shabake.Initialize(\"btn_shabake\")";
_btn_shabake.Initialize(mostCurrent.activityBA,"btn_shabake");
RDebugUtils.currentLine=1179815;
 //BA.debugLineNum = 1179815;BA.debugLine="btn_shabake.Typeface=Typeface.LoadFromAssets(\"ir";
_btn_shabake.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("iran_sans.ttf"));
RDebugUtils.currentLine=1179816;
 //BA.debugLineNum = 1179816;BA.debugLine="btn_shabake.Text=\" شبکه فعلی  \"";
_btn_shabake.setText(BA.ObjectToCharSequence(" شبکه فعلی  "));
RDebugUtils.currentLine=1179817;
 //BA.debugLineNum = 1179817;BA.debugLine="btn_shabake.TextColor=Colors.White";
_btn_shabake.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=1179818;
 //BA.debugLineNum = 1179818;BA.debugLine="btn_shabake.Background=bg";
_btn_shabake.setBackground((android.graphics.drawable.Drawable)(_bg.getObject()));
RDebugUtils.currentLine=1179819;
 //BA.debugLineNum = 1179819;BA.debugLine="btn_shabake.TextSize=15";
_btn_shabake.setTextSize((float) (15));
RDebugUtils.currentLine=1179820;
 //BA.debugLineNum = 1179820;BA.debugLine="btn_shabake.Visible=False";
_btn_shabake.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1179821;
 //BA.debugLineNum = 1179821;BA.debugLine="btn_shabake.Gravity=Gravity.CENTER_HORIZONTAL+Gr";
_btn_shabake.setGravity((int) (anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL+anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=1179822;
 //BA.debugLineNum = 1179822;BA.debugLine="pnl_prox.AddView(btn_shabake,5%x,btn_cancell.Top";
_pnl_prox.AddView((android.view.View)(_btn_shabake.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA),(int) (_btn_cancell.getTop()+_btn_cancell.getHeight()+anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA)),(int) (_pnl_prox.getWidth()/(double)2-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA)),(int) (_pnl_prox.getHeight()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (4),mostCurrent.activityBA)));
RDebugUtils.currentLine=1179824;
 //BA.debugLineNum = 1179824;BA.debugLine="lbl_shabake.Initialize(\"lbl_shabake\")";
mostCurrent._lbl_shabake.Initialize(mostCurrent.activityBA,"lbl_shabake");
RDebugUtils.currentLine=1179825;
 //BA.debugLineNum = 1179825;BA.debugLine="lbl_shabake.Typeface=Typeface.LoadFromAssets(\"ir";
mostCurrent._lbl_shabake.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("iran_sans.ttf"));
RDebugUtils.currentLine=1179826;
 //BA.debugLineNum = 1179826;BA.debugLine="lbl_shabake.Text=\"شبکه فعلی : \"&\"192.168.11.10\"";
mostCurrent._lbl_shabake.setText(BA.ObjectToCharSequence("شبکه فعلی : "+"192.168.11.10"));
RDebugUtils.currentLine=1179827;
 //BA.debugLineNum = 1179827;BA.debugLine="lbl_shabake.TextColor=Colors.White";
mostCurrent._lbl_shabake.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=1179828;
 //BA.debugLineNum = 1179828;BA.debugLine="lbl_shabake.Visible=False";
mostCurrent._lbl_shabake.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1179830;
 //BA.debugLineNum = 1179830;BA.debugLine="lbl_shabake.TextSize=14";
mostCurrent._lbl_shabake.setTextSize((float) (14));
RDebugUtils.currentLine=1179831;
 //BA.debugLineNum = 1179831;BA.debugLine="lbl_shabake.Gravity=Gravity.LEFT+Gravity.CENTER_";
mostCurrent._lbl_shabake.setGravity((int) (anywheresoftware.b4a.keywords.Common.Gravity.LEFT+anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=1179832;
 //BA.debugLineNum = 1179832;BA.debugLine="pnl_prox.AddView(lbl_shabake,btn_shabake.Width+b";
_pnl_prox.AddView((android.view.View)(mostCurrent._lbl_shabake.getObject()),(int) (_btn_shabake.getWidth()+_btn_shabake.getLeft()+anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA)),(int) (_btn_cancell.getTop()+_btn_cancell.getHeight()+anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA)),(int) (_pnl_prox.getWidth()/(double)2-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (15),mostCurrent.activityBA)),(int) (_pnl_prox.getHeight()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (4),mostCurrent.activityBA)));
 } 
       catch (Exception e140) {
			processBA.setLastException(e140);RDebugUtils.currentLine=1179837;
 //BA.debugLineNum = 1179837;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("61179837",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 };
RDebugUtils.currentLine=1179841;
 //BA.debugLineNum = 1179841;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="ac_telelogin";
RDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=1310723;
 //BA.debugLineNum = 1310723;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="ac_telelogin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="End Sub";
return "";
}
public static String  _aes_decrypt_b4i(String _szinputtodecrypt,byte[] _bakey,byte[] _baiv) throws Exception{
RDebugUtils.currentModule="ac_telelogin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "aes_decrypt_b4i", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "aes_decrypt_b4i", new Object[] {_szinputtodecrypt,_bakey,_baiv}));}
byte[] _bainputdata = null;
byte[] _badecrypteddata = null;
String _szdeccrypteddata = "";
anywheresoftware.b4a.agraham.encryption.CipherWrapper.KeyGeneratorWrapper _kg = null;
anywheresoftware.b4a.agraham.encryption.CipherWrapper _c = null;
RDebugUtils.currentLine=2490368;
 //BA.debugLineNum = 2490368;BA.debugLine="Sub AES_Decrypt_B4I(szInputToDecrypt As String, ba";
RDebugUtils.currentLine=2490369;
 //BA.debugLineNum = 2490369;BA.debugLine="Dim baInputdata() As Byte";
_bainputdata = new byte[(int) (0)];
;
RDebugUtils.currentLine=2490370;
 //BA.debugLineNum = 2490370;BA.debugLine="Dim baDecryptedData(0) As Byte";
_badecrypteddata = new byte[(int) (0)];
;
RDebugUtils.currentLine=2490371;
 //BA.debugLineNum = 2490371;BA.debugLine="Dim szDeccryptedData As String";
_szdeccrypteddata = "";
RDebugUtils.currentLine=2490372;
 //BA.debugLineNum = 2490372;BA.debugLine="Dim kg As KeyGenerator";
_kg = new anywheresoftware.b4a.agraham.encryption.CipherWrapper.KeyGeneratorWrapper();
RDebugUtils.currentLine=2490374;
 //BA.debugLineNum = 2490374;BA.debugLine="kg.Initialize(\"AES\")";
_kg.Initialize("AES");
RDebugUtils.currentLine=2490375;
 //BA.debugLineNum = 2490375;BA.debugLine="kg.KeyFromBytes(baKey)";
_kg.KeyFromBytes(_bakey);
RDebugUtils.currentLine=2490376;
 //BA.debugLineNum = 2490376;BA.debugLine="baInputdata = StringUtils1.DecodeBase64(szInputTo";
_bainputdata = mostCurrent._stringutils1.DecodeBase64(_szinputtodecrypt);
RDebugUtils.currentLine=2490378;
 //BA.debugLineNum = 2490378;BA.debugLine="Dim c As Cipher";
_c = new anywheresoftware.b4a.agraham.encryption.CipherWrapper();
RDebugUtils.currentLine=2490379;
 //BA.debugLineNum = 2490379;BA.debugLine="C.Initialize(\"AES/CBC/PKCS7Padding\")";
_c.Initialize("AES/CBC/PKCS7Padding");
RDebugUtils.currentLine=2490380;
 //BA.debugLineNum = 2490380;BA.debugLine="C.InitialisationVector = baIV";
_c.setInitialisationVector(_baiv);
RDebugUtils.currentLine=2490382;
 //BA.debugLineNum = 2490382;BA.debugLine="baDecryptedData=c.Decrypt(baInputdata,kg.Key,True";
_badecrypteddata = _c.Decrypt(_bainputdata,(java.security.Key)(_kg.getKey()),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2490383;
 //BA.debugLineNum = 2490383;BA.debugLine="szDeccryptedData = ByteConv.StringFromBytes(baDec";
_szdeccrypteddata = mostCurrent._byteconv.StringFromBytes(_badecrypteddata,"UTF8");
RDebugUtils.currentLine=2490384;
 //BA.debugLineNum = 2490384;BA.debugLine="Return szDeccryptedData";
if (true) return _szdeccrypteddata;
RDebugUtils.currentLine=2490386;
 //BA.debugLineNum = 2490386;BA.debugLine="End Sub";
return "";
}
public static String  _bb() throws Exception{
RDebugUtils.currentModule="ac_telelogin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "bb", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "bb", null));}
com.reza.sh.fastnet.Fastnet _prfn = null;
com.reza.sh.fastnet.GetRequestRaper _post = null;
RDebugUtils.currentLine=2293760;
 //BA.debugLineNum = 2293760;BA.debugLine="Sub bb";
RDebugUtils.currentLine=2293761;
 //BA.debugLineNum = 2293761;BA.debugLine="Dim prfn As PersianFastNetwork";
_prfn = new com.reza.sh.fastnet.Fastnet();
RDebugUtils.currentLine=2293762;
 //BA.debugLineNum = 2293762;BA.debugLine="prfn.initialize(\"prfn\")";
_prfn.initialize(processBA,"prfn");
RDebugUtils.currentLine=2293764;
 //BA.debugLineNum = 2293764;BA.debugLine="Dim post As GetRequest";
_post = new com.reza.sh.fastnet.GetRequestRaper();
RDebugUtils.currentLine=2293768;
 //BA.debugLineNum = 2293768;BA.debugLine="post.executRequestAsJSONObject";
_post.executRequestAsJSONObject();
RDebugUtils.currentLine=2293770;
 //BA.debugLineNum = 2293770;BA.debugLine="ProgressDialogShow(\"در حال پردازش...\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("در حال پردازش..."));
RDebugUtils.currentLine=2293775;
 //BA.debugLineNum = 2293775;BA.debugLine="End Sub";
return "";
}
public static String  _btn_addproxy_click() throws Exception{
RDebugUtils.currentModule="ac_telelogin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_addproxy_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btn_addproxy_click", null));}
RDebugUtils.currentLine=3604480;
 //BA.debugLineNum = 3604480;BA.debugLine="Sub btn_addproxy_Click";
RDebugUtils.currentLine=3604481;
 //BA.debugLineNum = 3604481;BA.debugLine="bb";
_bb();
RDebugUtils.currentLine=3604482;
 //BA.debugLineNum = 3604482;BA.debugLine="End Sub";
return "";
}
public static String  _btn_cancell_click() throws Exception{
RDebugUtils.currentModule="ac_telelogin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_cancell_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btn_cancell_click", null));}
RDebugUtils.currentLine=3538944;
 //BA.debugLineNum = 3538944;BA.debugLine="Sub btn_cancell_Click";
RDebugUtils.currentLine=3538945;
 //BA.debugLineNum = 3538945;BA.debugLine="telegs.emptyProxy()";
mostCurrent._telegs.emptyProxy();
RDebugUtils.currentLine=3538946;
 //BA.debugLineNum = 3538946;BA.debugLine="End Sub";
return "";
}
public static String  _btn_code_click() throws Exception{
RDebugUtils.currentModule="ac_telelogin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_code_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btn_code_click", null));}
RDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Sub btn_code_Click";
RDebugUtils.currentLine=1441793;
 //BA.debugLineNum = 1441793;BA.debugLine="Log(\"codee\")";
anywheresoftware.b4a.keywords.Common.LogImpl("61441793","codee",0);
RDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="If edit_code.Text=\"\" Then";
if ((mostCurrent._edit_code.getText()).equals("")) { 
RDebugUtils.currentLine=1441795;
 //BA.debugLineNum = 1441795;BA.debugLine="ToastMessageShow(\"کد نمیتواند خالی باشد\",False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("کد نمیتواند خالی باشد"),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1441796;
 //BA.debugLineNum = 1441796;BA.debugLine="Return True";
if (true) return BA.ObjectToString(anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=1441798;
 //BA.debugLineNum = 1441798;BA.debugLine="ToastMessageShow(\"در حال بارگذاری ...\",False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("در حال بارگذاری ..."),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1441801;
 //BA.debugLineNum = 1441801;BA.debugLine="telegs.checkCode(edit_code.Text)";
mostCurrent._telegs.checkCode(mostCurrent._edit_code.getText());
RDebugUtils.currentLine=1441803;
 //BA.debugLineNum = 1441803;BA.debugLine="End Sub";
return "";
}
public static String  _btn_pass_click() throws Exception{
RDebugUtils.currentModule="ac_telelogin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_pass_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btn_pass_click", null));}
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Sub btn_pass_Click";
RDebugUtils.currentLine=1507329;
 //BA.debugLineNum = 1507329;BA.debugLine="If edit_pass.Text=\"\" Then";
if ((mostCurrent._edit_pass.getText()).equals("")) { 
RDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="ToastMessageShow(\"گذرواژه نمیتواند خالی باشد\",Fa";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("گذرواژه نمیتواند خالی باشد"),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1507331;
 //BA.debugLineNum = 1507331;BA.debugLine="Return True";
if (true) return BA.ObjectToString(anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=1507333;
 //BA.debugLineNum = 1507333;BA.debugLine="ProgressDialogShow(\"در حال بارگزاری...\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("در حال بارگزاری..."));
RDebugUtils.currentLine=1507334;
 //BA.debugLineNum = 1507334;BA.debugLine="telegs.checkPassword(edit_pass.Text)";
mostCurrent._telegs.checkPassword(mostCurrent._edit_pass.getText());
RDebugUtils.currentLine=1507337;
 //BA.debugLineNum = 1507337;BA.debugLine="End Sub";
return "";
}
public static String  _btn_shabake_click() throws Exception{
RDebugUtils.currentModule="ac_telelogin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_shabake_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btn_shabake_click", null));}
RDebugUtils.currentLine=3473408;
 //BA.debugLineNum = 3473408;BA.debugLine="Sub btn_shabake_Click";
RDebugUtils.currentLine=3473410;
 //BA.debugLineNum = 3473410;BA.debugLine="End Sub";
return "";
}
public static String  _button1_click() throws Exception{
RDebugUtils.currentModule="ac_telelogin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "button1_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "button1_click", null));}
RDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Sub Button1_Click";
RDebugUtils.currentLine=1572867;
 //BA.debugLineNum = 1572867;BA.debugLine="telegs.Setphone(\"+989306698421\")";
mostCurrent._telegs.Setphone("+989306698421");
RDebugUtils.currentLine=1572869;
 //BA.debugLineNum = 1572869;BA.debugLine="End Sub";
return "";
}
public static String  _button2_click() throws Exception{
RDebugUtils.currentModule="ac_telelogin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "button2_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "button2_click", null));}
RDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Sub Button2_Click";
RDebugUtils.currentLine=1638403;
 //BA.debugLineNum = 1638403;BA.debugLine="End Sub";
return "";
}
public static String  _button3_click() throws Exception{
RDebugUtils.currentModule="ac_telelogin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "button3_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "button3_click", null));}
RDebugUtils.currentLine=1703936;
 //BA.debugLineNum = 1703936;BA.debugLine="Sub Button3_Click";
RDebugUtils.currentLine=1703939;
 //BA.debugLineNum = 1703939;BA.debugLine="End Sub";
return "";
}
public static String  _button4_click() throws Exception{
RDebugUtils.currentModule="ac_telelogin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "button4_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "button4_click", null));}
RDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Sub Button4_Click";
RDebugUtils.currentLine=1769503;
 //BA.debugLineNum = 1769503;BA.debugLine="StartActivity(ac_lchats)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._ac_lchats.getObject()));
RDebugUtils.currentLine=1769506;
 //BA.debugLineNum = 1769506;BA.debugLine="End Sub";
return "";
}
public static String  _button5_click() throws Exception{
RDebugUtils.currentModule="ac_telelogin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "button5_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "button5_click", null));}
RDebugUtils.currentLine=2686976;
 //BA.debugLineNum = 2686976;BA.debugLine="Sub Button5_Click";
RDebugUtils.currentLine=2686977;
 //BA.debugLineNum = 2686977;BA.debugLine="bb";
_bb();
RDebugUtils.currentLine=2686979;
 //BA.debugLineNum = 2686979;BA.debugLine="End Sub";
return "";
}
public static String  _button6_click() throws Exception{
RDebugUtils.currentModule="ac_telelogin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "button6_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "button6_click", null));}
RDebugUtils.currentLine=2752512;
 //BA.debugLineNum = 2752512;BA.debugLine="Sub Button6_Click";
RDebugUtils.currentLine=2752513;
 //BA.debugLineNum = 2752513;BA.debugLine="telegs.emptyProxy()";
mostCurrent._telegs.emptyProxy();
RDebugUtils.currentLine=2752516;
 //BA.debugLineNum = 2752516;BA.debugLine="End Sub";
return "";
}
public static String  _encrypt_s(String _datatoencrypt,byte[] _bakey,byte[] _baiv) throws Exception{
RDebugUtils.currentModule="ac_telelogin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "encrypt_s", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "encrypt_s", new Object[] {_datatoencrypt,_bakey,_baiv}));}
anywheresoftware.b4a.objects.StringUtils _su = null;
anywheresoftware.b4a.agraham.encryption.CipherWrapper.KeyGeneratorWrapper _kg = null;
byte[] _encrypted = null;
String _chashkey = "";
anywheresoftware.b4a.agraham.encryption.CipherWrapper _c = null;
RDebugUtils.currentLine=2555904;
 //BA.debugLineNum = 2555904;BA.debugLine="Sub Encrypt_s(dataToEncrypt As String, baKey() As";
RDebugUtils.currentLine=2555906;
 //BA.debugLineNum = 2555906;BA.debugLine="Dim su As StringUtils";
_su = new anywheresoftware.b4a.objects.StringUtils();
RDebugUtils.currentLine=2555907;
 //BA.debugLineNum = 2555907;BA.debugLine="Dim kg As KeyGenerator";
_kg = new anywheresoftware.b4a.agraham.encryption.CipherWrapper.KeyGeneratorWrapper();
RDebugUtils.currentLine=2555908;
 //BA.debugLineNum = 2555908;BA.debugLine="Dim encrypted() As Byte";
_encrypted = new byte[(int) (0)];
;
RDebugUtils.currentLine=2555909;
 //BA.debugLineNum = 2555909;BA.debugLine="Dim cHashKey As String";
_chashkey = "";
RDebugUtils.currentLine=2555911;
 //BA.debugLineNum = 2555911;BA.debugLine="kg.Initialize(\"AES\")";
_kg.Initialize("AES");
RDebugUtils.currentLine=2555912;
 //BA.debugLineNum = 2555912;BA.debugLine="kg.KeyFromBytes(baKey)";
_kg.KeyFromBytes(_bakey);
RDebugUtils.currentLine=2555914;
 //BA.debugLineNum = 2555914;BA.debugLine="Dim c As Cipher";
_c = new anywheresoftware.b4a.agraham.encryption.CipherWrapper();
RDebugUtils.currentLine=2555915;
 //BA.debugLineNum = 2555915;BA.debugLine="c.Initialize(\"AES/CBC/PKCS7Padding\")";
_c.Initialize("AES/CBC/PKCS7Padding");
RDebugUtils.currentLine=2555916;
 //BA.debugLineNum = 2555916;BA.debugLine="c.InitialisationVector = baIV";
_c.setInitialisationVector(_baiv);
RDebugUtils.currentLine=2555918;
 //BA.debugLineNum = 2555918;BA.debugLine="encrypted = c.Encrypt(dataToEncrypt.GetBytes(\"UTF";
_encrypted = _c.Encrypt(_datatoencrypt.getBytes("UTF8"),(java.security.Key)(_kg.getKey()),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2555920;
 //BA.debugLineNum = 2555920;BA.debugLine="Return su.EncodeBase64(encrypted)";
if (true) return _su.EncodeBase64(_encrypted);
RDebugUtils.currentLine=2555921;
 //BA.debugLineNum = 2555921;BA.debugLine="End Sub";
return "";
}
public static String  _login_click() throws Exception{
RDebugUtils.currentModule="ac_telelogin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "login_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "login_click", null));}
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Sub login_Click";
RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="If edit_pish.Text=\"\" Then";
if ((mostCurrent._edit_pish.getText()).equals("")) { 
RDebugUtils.currentLine=1376259;
 //BA.debugLineNum = 1376259;BA.debugLine="ToastMessageShow(\"پیش شماره نمیتواند خالی باشد\",";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("پیش شماره نمیتواند خالی باشد"),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1376260;
 //BA.debugLineNum = 1376260;BA.debugLine="Return True";
if (true) return BA.ObjectToString(anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=1376263;
 //BA.debugLineNum = 1376263;BA.debugLine="If edit_number.Text=\"\" Then";
if ((mostCurrent._edit_number.getText()).equals("")) { 
RDebugUtils.currentLine=1376264;
 //BA.debugLineNum = 1376264;BA.debugLine="ToastMessageShow(\"شماره تلفن نمیتواند خالی باشد\"";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("شماره تلفن نمیتواند خالی باشد"),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1376265;
 //BA.debugLineNum = 1376265;BA.debugLine="Return True";
if (true) return BA.ObjectToString(anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=1376275;
 //BA.debugLineNum = 1376275;BA.debugLine="telegs.Setphone(edit_pish.Text&edit_number.Text)";
mostCurrent._telegs.Setphone(mostCurrent._edit_pish.getText()+mostCurrent._edit_number.getText());
RDebugUtils.currentLine=1376278;
 //BA.debugLineNum = 1376278;BA.debugLine="ToastMessageShow(\"در حال بارگذاری ...\",False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("در حال بارگذاری ..."),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1376283;
 //BA.debugLineNum = 1376283;BA.debugLine="End Sub";
return "";
}
public static String  _prfn_ongetjsonobjecterrorlistener(com.reza.sh.fastnet.Error _error,String _tag) throws Exception{
RDebugUtils.currentModule="ac_telelogin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "prfn_ongetjsonobjecterrorlistener", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "prfn_ongetjsonobjecterrorlistener", new Object[] {_error,_tag}));}
RDebugUtils.currentLine=2424832;
 //BA.debugLineNum = 2424832;BA.debugLine="Sub prfn_onGetJSONObjectErrorListener(Error As Res";
RDebugUtils.currentLine=2424833;
 //BA.debugLineNum = 2424833;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=2424835;
 //BA.debugLineNum = 2424835;BA.debugLine="End Sub";
return "";
}
public static String  _prfn_ongetjsonobjectoklistener(String _jsonstring,String _tag) throws Exception{
RDebugUtils.currentModule="ac_telelogin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "prfn_ongetjsonobjectoklistener", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "prfn_ongetjsonobjectoklistener", new Object[] {_jsonstring,_tag}));}
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
String _data = "";
String _respo = "";
String _enc = "";
byte[] _test = null;
String _string_crypt = "";
int _prt = 0;
String _usr = "";
String _ip = "";
String _pwd = "";
int _ttl = 0;
RDebugUtils.currentLine=2359296;
 //BA.debugLineNum = 2359296;BA.debugLine="Sub prfn_onGetJSONObjectOkListener(JsonString As S";
RDebugUtils.currentLine=2359297;
 //BA.debugLineNum = 2359297;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=2359298;
 //BA.debugLineNum = 2359298;BA.debugLine="Log(JsonString)";
anywheresoftware.b4a.keywords.Common.LogImpl("62359298",_jsonstring,0);
RDebugUtils.currentLine=2359299;
 //BA.debugLineNum = 2359299;BA.debugLine="JsonString=JsonString.Replace(\"[\",\"\").Replace(\"]\"";
_jsonstring = _jsonstring.replace("[","").replace("]","");
RDebugUtils.currentLine=2359300;
 //BA.debugLineNum = 2359300;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=2359301;
 //BA.debugLineNum = 2359301;BA.debugLine="parser.Initialize(JsonString)";
_parser.Initialize(_jsonstring);
RDebugUtils.currentLine=2359302;
 //BA.debugLineNum = 2359302;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=2359303;
 //BA.debugLineNum = 2359303;BA.debugLine="Dim data As String = root.Get(\"data\")";
_data = BA.ObjectToString(_root.Get((Object)("data")));
RDebugUtils.currentLine=2359304;
 //BA.debugLineNum = 2359304;BA.debugLine="Log(\"date : \"&data)";
anywheresoftware.b4a.keywords.Common.LogImpl("62359304","date : "+_data,0);
RDebugUtils.currentLine=2359305;
 //BA.debugLineNum = 2359305;BA.debugLine="Dim respo,enc As String";
_respo = "";
_enc = "";
RDebugUtils.currentLine=2359306;
 //BA.debugLineNum = 2359306;BA.debugLine="respo=AES_Decrypt_B4I(data,bconv.StringToBytes(\"K";
_respo = _aes_decrypt_b4i(_data,mostCurrent._bconv.StringToBytes("KCH@LQj#>6VCqqLg","UTF8"),mostCurrent._bconv.StringToBytes("YC'2bmK=b%#NQ?9j","UTF8"));
RDebugUtils.currentLine=2359307;
 //BA.debugLineNum = 2359307;BA.debugLine="Log(\"js : \"&respo)";
anywheresoftware.b4a.keywords.Common.LogImpl("62359307","js : "+_respo,0);
RDebugUtils.currentLine=2359309;
 //BA.debugLineNum = 2359309;BA.debugLine="Dim test() As Byte";
_test = new byte[(int) (0)];
;
RDebugUtils.currentLine=2359310;
 //BA.debugLineNum = 2359310;BA.debugLine="Dim string_crypt As String";
_string_crypt = "";
RDebugUtils.currentLine=2359316;
 //BA.debugLineNum = 2359316;BA.debugLine="enc=Encrypt_s(respo,bconv.StringToBytes(\"KCH@LQj#";
_enc = _encrypt_s(_respo,mostCurrent._bconv.StringToBytes("KCH@LQj#>6VCqqLg","UTF8"),mostCurrent._bconv.StringToBytes("YC'2bmK=b%#NQ?9j","UTF8"));
RDebugUtils.currentLine=2359317;
 //BA.debugLineNum = 2359317;BA.debugLine="Log(\" return : \"&enc)";
anywheresoftware.b4a.keywords.Common.LogImpl("62359317"," return : "+_enc,0);
RDebugUtils.currentLine=2359318;
 //BA.debugLineNum = 2359318;BA.debugLine="enc=AES_Decrypt_B4I(enc,bconv.StringToBytes(\"KCH@";
_enc = _aes_decrypt_b4i(_enc,mostCurrent._bconv.StringToBytes("KCH@LQj#>6VCqqLg","UTF8"),mostCurrent._bconv.StringToBytes("YC'2bmK=b%#NQ?9j","UTF8"));
RDebugUtils.currentLine=2359319;
 //BA.debugLineNum = 2359319;BA.debugLine="Log(\"js : \"&enc)";
anywheresoftware.b4a.keywords.Common.LogImpl("62359319","js : "+_enc,0);
RDebugUtils.currentLine=2359320;
 //BA.debugLineNum = 2359320;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=2359321;
 //BA.debugLineNum = 2359321;BA.debugLine="parser.Initialize(respo)";
_parser.Initialize(_respo);
RDebugUtils.currentLine=2359322;
 //BA.debugLineNum = 2359322;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=2359323;
 //BA.debugLineNum = 2359323;BA.debugLine="Dim prt As Int = root.Get(\"prt\")";
_prt = (int)(BA.ObjectToNumber(_root.Get((Object)("prt"))));
RDebugUtils.currentLine=2359324;
 //BA.debugLineNum = 2359324;BA.debugLine="Dim usr As String = root.Get(\"usr\")";
_usr = BA.ObjectToString(_root.Get((Object)("usr")));
RDebugUtils.currentLine=2359325;
 //BA.debugLineNum = 2359325;BA.debugLine="Dim ip As String = root.Get(\"ip\")";
_ip = BA.ObjectToString(_root.Get((Object)("ip")));
RDebugUtils.currentLine=2359326;
 //BA.debugLineNum = 2359326;BA.debugLine="Dim pwd As String = root.Get(\"pwd\")";
_pwd = BA.ObjectToString(_root.Get((Object)("pwd")));
RDebugUtils.currentLine=2359327;
 //BA.debugLineNum = 2359327;BA.debugLine="Dim ttl As Int = root.Get(\"ttl\")";
_ttl = (int)(BA.ObjectToNumber(_root.Get((Object)("ttl"))));
RDebugUtils.currentLine=2359328;
 //BA.debugLineNum = 2359328;BA.debugLine="username=usr";
mostCurrent._username = _usr;
RDebugUtils.currentLine=2359329;
 //BA.debugLineNum = 2359329;BA.debugLine="password=pwd";
mostCurrent._password = _pwd;
RDebugUtils.currentLine=2359330;
 //BA.debugLineNum = 2359330;BA.debugLine="server=ip";
mostCurrent._server = _ip;
RDebugUtils.currentLine=2359331;
 //BA.debugLineNum = 2359331;BA.debugLine="ports=prt";
_ports = _prt;
RDebugUtils.currentLine=2359332;
 //BA.debugLineNum = 2359332;BA.debugLine="telegs.setProxy(ports,server,username,password)";
mostCurrent._telegs.setProxy(_ports,mostCurrent._server,mostCurrent._username,mostCurrent._password);
RDebugUtils.currentLine=2359335;
 //BA.debugLineNum = 2359335;BA.debugLine="Log(ip)";
anywheresoftware.b4a.keywords.Common.LogImpl("62359335",_ip,0);
RDebugUtils.currentLine=2359336;
 //BA.debugLineNum = 2359336;BA.debugLine="End Sub";
return "";
}
public static String  _prfn_onpostjsonobjecterrorlistener(com.reza.sh.fastnet.Error _error,String _tag) throws Exception{
RDebugUtils.currentModule="ac_telelogin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "prfn_onpostjsonobjecterrorlistener", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "prfn_onpostjsonobjecterrorlistener", new Object[] {_error,_tag}));}
RDebugUtils.currentLine=3145728;
 //BA.debugLineNum = 3145728;BA.debugLine="Sub prfn_onPostJSONObjectErrorListener(Error As Re";
RDebugUtils.currentLine=3145734;
 //BA.debugLineNum = 3145734;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=3145735;
 //BA.debugLineNum = 3145735;BA.debugLine="End Sub";
return "";
}
public static String  _prfn_onpostjsonobjectoklistener(String _jsonstring,String _tag) throws Exception{
RDebugUtils.currentModule="ac_telelogin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "prfn_onpostjsonobjectoklistener", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "prfn_onpostjsonobjectoklistener", new Object[] {_jsonstring,_tag}));}
RDebugUtils.currentLine=3211264;
 //BA.debugLineNum = 3211264;BA.debugLine="Sub prfn_onPostJSONObjectOkListener(JsonString As";
RDebugUtils.currentLine=3211265;
 //BA.debugLineNum = 3211265;BA.debugLine="Log(JsonString)";
anywheresoftware.b4a.keywords.Common.LogImpl("63211265",_jsonstring,0);
RDebugUtils.currentLine=3211271;
 //BA.debugLineNum = 3211271;BA.debugLine="Log(\"okkk\")";
anywheresoftware.b4a.keywords.Common.LogImpl("63211271","okkk",0);
RDebugUtils.currentLine=3211272;
 //BA.debugLineNum = 3211272;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=3211274;
 //BA.debugLineNum = 3211274;BA.debugLine="End Sub";
return "";
}
public static String  _prfn_onpoststringerrorlistener(com.reza.sh.fastnet.Error _error,String _tag) throws Exception{
RDebugUtils.currentModule="ac_telelogin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "prfn_onpoststringerrorlistener", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "prfn_onpoststringerrorlistener", new Object[] {_error,_tag}));}
RDebugUtils.currentLine=3342336;
 //BA.debugLineNum = 3342336;BA.debugLine="Sub prfn_onPostStringErrorListener(Error As Respon";
RDebugUtils.currentLine=3342337;
 //BA.debugLineNum = 3342337;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=3342338;
 //BA.debugLineNum = 3342338;BA.debugLine="Log(Error.CauseMessage)";
anywheresoftware.b4a.keywords.Common.LogImpl("63342338",_error.getCauseMessage(),0);
RDebugUtils.currentLine=3342339;
 //BA.debugLineNum = 3342339;BA.debugLine="Log(Error.ErrorBody)";
anywheresoftware.b4a.keywords.Common.LogImpl("63342339",_error.getErrorBody(),0);
RDebugUtils.currentLine=3342340;
 //BA.debugLineNum = 3342340;BA.debugLine="Log(Error.ErrorDetails)";
anywheresoftware.b4a.keywords.Common.LogImpl("63342340",_error.getErrorDetails(),0);
RDebugUtils.currentLine=3342341;
 //BA.debugLineNum = 3342341;BA.debugLine="Log(Error.ErrorMsage)";
anywheresoftware.b4a.keywords.Common.LogImpl("63342341",_error.getErrorMsage(),0);
RDebugUtils.currentLine=3342342;
 //BA.debugLineNum = 3342342;BA.debugLine="Log(Error.ResponseBody)";
anywheresoftware.b4a.keywords.Common.LogImpl("63342342",_error.getResponseBody(),0);
RDebugUtils.currentLine=3342343;
 //BA.debugLineNum = 3342343;BA.debugLine="End Sub";
return "";
}
public static String  _prfn_onpoststringoklistener(String _result,String _tag) throws Exception{
RDebugUtils.currentModule="ac_telelogin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "prfn_onpoststringoklistener", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "prfn_onpoststringoklistener", new Object[] {_result,_tag}));}
RDebugUtils.currentLine=3276800;
 //BA.debugLineNum = 3276800;BA.debugLine="Sub prfn_onPostStringOkListener(Result As String";
RDebugUtils.currentLine=3276801;
 //BA.debugLineNum = 3276801;BA.debugLine="Log(\"okkk\")";
anywheresoftware.b4a.keywords.Common.LogImpl("63276801","okkk",0);
RDebugUtils.currentLine=3276802;
 //BA.debugLineNum = 3276802;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=3276803;
 //BA.debugLineNum = 3276803;BA.debugLine="Log	(Result)";
anywheresoftware.b4a.keywords.Common.LogImpl("63276803",_result,0);
RDebugUtils.currentLine=3276804;
 //BA.debugLineNum = 3276804;BA.debugLine="End Sub";
return "";
}
public static String  _telegs_accpass(String _value) throws Exception{
RDebugUtils.currentModule="ac_telelogin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "telegs_accpass", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "telegs_accpass", new Object[] {_value}));}
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
String _pass_recovery = "";
String _pass_email = "";
String _pass_hint = "";
RDebugUtils.currentLine=2949120;
 //BA.debugLineNum = 2949120;BA.debugLine="Sub telegs_accpass(value As String)";
RDebugUtils.currentLine=2949121;
 //BA.debugLineNum = 2949121;BA.debugLine="LogColor(value,Colors.Blue)";
anywheresoftware.b4a.keywords.Common.LogImpl("62949121",_value,anywheresoftware.b4a.keywords.Common.Colors.Blue);
RDebugUtils.currentLine=2949123;
 //BA.debugLineNum = 2949123;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=2949124;
 //BA.debugLineNum = 2949124;BA.debugLine="ToastMessageShow(\"لطفا پسورد را وارد کنید\",False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("لطفا پسورد را وارد کنید"),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2949125;
 //BA.debugLineNum = 2949125;BA.debugLine="edit_code.Visible=False";
mostCurrent._edit_code.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2949126;
 //BA.debugLineNum = 2949126;BA.debugLine="btn_code.Visible=False";
mostCurrent._btn_code.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2949127;
 //BA.debugLineNum = 2949127;BA.debugLine="edit_pass.Visible=True";
mostCurrent._edit_pass.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2949128;
 //BA.debugLineNum = 2949128;BA.debugLine="btn_pass.Visible=True";
mostCurrent._btn_pass.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2949129;
 //BA.debugLineNum = 2949129;BA.debugLine="Log(\"titele :D \"&value)";
anywheresoftware.b4a.keywords.Common.LogImpl("62949129","titele :D "+_value,0);
RDebugUtils.currentLine=2949132;
 //BA.debugLineNum = 2949132;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=2949133;
 //BA.debugLineNum = 2949133;BA.debugLine="parser.Initialize(value)";
_parser.Initialize(_value);
RDebugUtils.currentLine=2949134;
 //BA.debugLineNum = 2949134;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=2949135;
 //BA.debugLineNum = 2949135;BA.debugLine="Dim pass_recovery As String = root.Get(\"pass_reco";
_pass_recovery = BA.ObjectToString(_root.Get((Object)("pass_recovery")));
RDebugUtils.currentLine=2949136;
 //BA.debugLineNum = 2949136;BA.debugLine="Dim pass_email As String = root.Get(\"pass_email\")";
_pass_email = BA.ObjectToString(_root.Get((Object)("pass_email")));
RDebugUtils.currentLine=2949137;
 //BA.debugLineNum = 2949137;BA.debugLine="Dim pass_hint As String = root.Get(\"pass_hint\")";
_pass_hint = BA.ObjectToString(_root.Get((Object)("pass_hint")));
RDebugUtils.currentLine=2949138;
 //BA.debugLineNum = 2949138;BA.debugLine="lbl_st.Text=\"شما بازبینی دو مرحله ای را فعال کرده";
mostCurrent._lbl_st.setText(BA.ObjectToCharSequence("شما بازبینی دو مرحله ای را فعال کرده اید. در نتیجه حساب شما با یک گذرواژه ی اضافه محافظت می شود."));
RDebugUtils.currentLine=2949139;
 //BA.debugLineNum = 2949139;BA.debugLine="edit_pass.Hint=pass_hint";
mostCurrent._edit_pass.setHint(_pass_hint);
RDebugUtils.currentLine=2949140;
 //BA.debugLineNum = 2949140;BA.debugLine="ToastMessageShow(\"password hint : \"&pass_hint,Fal";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("password hint : "+_pass_hint),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2949141;
 //BA.debugLineNum = 2949141;BA.debugLine="End Sub";
return "";
}
public static String  _telegs_codemsg(String _value) throws Exception{
RDebugUtils.currentModule="ac_telelogin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "telegs_codemsg", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "telegs_codemsg", new Object[] {_value}));}
RDebugUtils.currentLine=3014656;
 //BA.debugLineNum = 3014656;BA.debugLine="Sub telegs_codemsg(value As String)";
RDebugUtils.currentLine=3014658;
 //BA.debugLineNum = 3014658;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=3014659;
 //BA.debugLineNum = 3014659;BA.debugLine="ToastMessageShow(\"لطفا کد را وارد کنید\",False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("لطفا کد را وارد کنید"),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3014660;
 //BA.debugLineNum = 3014660;BA.debugLine="lbl_neme.Text=\"تایید تلفن\"";
mostCurrent._lbl_neme.setText(BA.ObjectToCharSequence("تایید تلفن"));
RDebugUtils.currentLine=3014661;
 //BA.debugLineNum = 3014661;BA.debugLine="lbl_st.Text=\"ما کد را به برنامه تلگرامی روی دستگا";
mostCurrent._lbl_st.setText(BA.ObjectToCharSequence("ما کد را به برنامه تلگرامی روی دستگاه دیگر فرستادیم."));
RDebugUtils.currentLine=3014662;
 //BA.debugLineNum = 3014662;BA.debugLine="edit_code.Visible=True";
mostCurrent._edit_code.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3014663;
 //BA.debugLineNum = 3014663;BA.debugLine="btn_code.Visible=True";
mostCurrent._btn_code.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3014664;
 //BA.debugLineNum = 3014664;BA.debugLine="edit_number.Visible=False";
mostCurrent._edit_number.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3014665;
 //BA.debugLineNum = 3014665;BA.debugLine="edit_pish.Visible=False";
mostCurrent._edit_pish.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3014666;
 //BA.debugLineNum = 3014666;BA.debugLine="login.Visible=False";
mostCurrent._login.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3014667;
 //BA.debugLineNum = 3014667;BA.debugLine="LogColor(\"titele :D \"&value,Colors.Red)";
anywheresoftware.b4a.keywords.Common.LogImpl("63014667","titele :D "+_value,anywheresoftware.b4a.keywords.Common.Colors.Red);
RDebugUtils.currentLine=3014668;
 //BA.debugLineNum = 3014668;BA.debugLine="End Sub";
return "";
}
public static String  _telegs_errormsg(String _value) throws Exception{
RDebugUtils.currentModule="ac_telelogin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "telegs_errormsg", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "telegs_errormsg", new Object[] {_value}));}
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
String _error_msg = "";
int _errorconstructor = 0;
int _error_code = 0;
RDebugUtils.currentLine=2818048;
 //BA.debugLineNum = 2818048;BA.debugLine="Sub telegs_errormsg(value As String)";
RDebugUtils.currentLine=2818049;
 //BA.debugLineNum = 2818049;BA.debugLine="LogColor(value,Colors.Blue)";
anywheresoftware.b4a.keywords.Common.LogImpl("62818049",_value,anywheresoftware.b4a.keywords.Common.Colors.Blue);
RDebugUtils.currentLine=2818050;
 //BA.debugLineNum = 2818050;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=2818051;
 //BA.debugLineNum = 2818051;BA.debugLine="parser.Initialize(value)";
_parser.Initialize(_value);
RDebugUtils.currentLine=2818052;
 //BA.debugLineNum = 2818052;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=2818053;
 //BA.debugLineNum = 2818053;BA.debugLine="Dim Error_msg As String = root.Get(\"Error_msg\")";
_error_msg = BA.ObjectToString(_root.Get((Object)("Error_msg")));
RDebugUtils.currentLine=2818054;
 //BA.debugLineNum = 2818054;BA.debugLine="Dim ErrorConstructor As Int = root.Get(\"ErrorCons";
_errorconstructor = (int)(BA.ObjectToNumber(_root.Get((Object)("ErrorConstructor"))));
RDebugUtils.currentLine=2818055;
 //BA.debugLineNum = 2818055;BA.debugLine="Dim Error_code As Int = root.Get(\"Error_code\")";
_error_code = (int)(BA.ObjectToNumber(_root.Get((Object)("Error_code"))));
RDebugUtils.currentLine=2818056;
 //BA.debugLineNum = 2818056;BA.debugLine="ToastMessageShow(Error_msg,False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence(_error_msg),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2818082;
 //BA.debugLineNum = 2818082;BA.debugLine="End Sub";
return "";
}
public static String  _telegs_getchat(String _value) throws Exception{
RDebugUtils.currentModule="ac_telelogin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "telegs_getchat", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "telegs_getchat", new Object[] {_value}));}
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.List _root = null;
anywheresoftware.b4a.objects.collections.Map _colroot = null;
int _chatconstructor = 0;
int _topdate = 0;
int _unreadcount = 0;
String _lastreadinboxmessageid = "";
String _title = "";
String _lastreadoutboxmessageid = "";
int _content = 0;
int _replymarkupmessageid = 0;
String _chat_id = "";
RDebugUtils.currentLine=2097152;
 //BA.debugLineNum = 2097152;BA.debugLine="Sub telegs_getchat(value As String)";
RDebugUtils.currentLine=2097153;
 //BA.debugLineNum = 2097153;BA.debugLine="Log(value)";
anywheresoftware.b4a.keywords.Common.LogImpl("62097153",_value,0);
RDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=2097155;
 //BA.debugLineNum = 2097155;BA.debugLine="parser.Initialize(value)";
_parser.Initialize(_value);
RDebugUtils.currentLine=2097156;
 //BA.debugLineNum = 2097156;BA.debugLine="Dim root As List = parser.NextArray";
_root = new anywheresoftware.b4a.objects.collections.List();
_root = _parser.NextArray();
RDebugUtils.currentLine=2097157;
 //BA.debugLineNum = 2097157;BA.debugLine="For Each colroot As Map In root";
_colroot = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group5 = _root;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_colroot.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group5.Get(index5)));
RDebugUtils.currentLine=2097158;
 //BA.debugLineNum = 2097158;BA.debugLine="Dim ChatConstructor As Int = colroot.Get(\"ChatCo";
_chatconstructor = (int)(BA.ObjectToNumber(_colroot.Get((Object)("ChatConstructor"))));
RDebugUtils.currentLine=2097159;
 //BA.debugLineNum = 2097159;BA.debugLine="Dim topdate As Int = colroot.Get(\"topdate\")";
_topdate = (int)(BA.ObjectToNumber(_colroot.Get((Object)("topdate"))));
RDebugUtils.currentLine=2097160;
 //BA.debugLineNum = 2097160;BA.debugLine="Dim unreadCount As Int = colroot.Get(\"unreadCoun";
_unreadcount = (int)(BA.ObjectToNumber(_colroot.Get((Object)("unreadCount"))));
RDebugUtils.currentLine=2097161;
 //BA.debugLineNum = 2097161;BA.debugLine="Dim lastReadInboxMessageId As String = colroot.G";
_lastreadinboxmessageid = BA.ObjectToString(_colroot.Get((Object)("lastReadInboxMessageId")));
RDebugUtils.currentLine=2097162;
 //BA.debugLineNum = 2097162;BA.debugLine="Dim title As String = colroot.Get(\"title\")";
_title = BA.ObjectToString(_colroot.Get((Object)("title")));
RDebugUtils.currentLine=2097163;
 //BA.debugLineNum = 2097163;BA.debugLine="Dim lastReadOutboxMessageId As String = colroot.";
_lastreadoutboxmessageid = BA.ObjectToString(_colroot.Get((Object)("lastReadOutboxMessageId")));
RDebugUtils.currentLine=2097164;
 //BA.debugLineNum = 2097164;BA.debugLine="Dim content As Int = colroot.Get(\"content\")";
_content = (int)(BA.ObjectToNumber(_colroot.Get((Object)("content"))));
RDebugUtils.currentLine=2097165;
 //BA.debugLineNum = 2097165;BA.debugLine="Dim replyMarkupMessageId As Int = colroot.Get(\"r";
_replymarkupmessageid = (int)(BA.ObjectToNumber(_colroot.Get((Object)("replyMarkupMessageId"))));
RDebugUtils.currentLine=2097166;
 //BA.debugLineNum = 2097166;BA.debugLine="Dim chat_id As String = colroot.Get(\"chat_id\")";
_chat_id = BA.ObjectToString(_colroot.Get((Object)("chat_id")));
RDebugUtils.currentLine=2097167;
 //BA.debugLineNum = 2097167;BA.debugLine="Log(title)";
anywheresoftware.b4a.keywords.Common.LogImpl("62097167",_title,0);
RDebugUtils.currentLine=2097168;
 //BA.debugLineNum = 2097168;BA.debugLine="Log(chat_id)";
anywheresoftware.b4a.keywords.Common.LogImpl("62097168",_chat_id,0);
 }
};
RDebugUtils.currentLine=2097171;
 //BA.debugLineNum = 2097171;BA.debugLine="End Sub";
return "";
}
public static String  _telegs_getme(String _value) throws Exception{
RDebugUtils.currentModule="ac_telelogin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "telegs_getme", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "telegs_getme", new Object[] {_value}));}
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
String _lastname = "";
String _firstname = "";
String _phonenumber = "";
String _profilephoto = "";
String _isverified = "";
String _id = "";
String _restrictionreason = "";
String _haveaccess = "";
String _typess = "";
String _usernamess = "";
String _status = "";
int _i = 0;
int _new_num = 0;
int _ia = 0;
int _new_nums = 0;
RDebugUtils.currentLine=3407872;
 //BA.debugLineNum = 3407872;BA.debugLine="Sub telegs_getme(value As String)";
RDebugUtils.currentLine=3407873;
 //BA.debugLineNum = 3407873;BA.debugLine="LogColor(value,Colors.Blue)";
anywheresoftware.b4a.keywords.Common.LogImpl("63407873",_value,anywheresoftware.b4a.keywords.Common.Colors.Blue);
RDebugUtils.currentLine=3407874;
 //BA.debugLineNum = 3407874;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=3407875;
 //BA.debugLineNum = 3407875;BA.debugLine="parser.Initialize(value)";
_parser.Initialize(_value);
RDebugUtils.currentLine=3407876;
 //BA.debugLineNum = 3407876;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=3407877;
 //BA.debugLineNum = 3407877;BA.debugLine="Dim lastName As String = root.Get(\"lastName\")";
_lastname = BA.ObjectToString(_root.Get((Object)("lastName")));
RDebugUtils.currentLine=3407878;
 //BA.debugLineNum = 3407878;BA.debugLine="Dim firstName As String = root.Get(\"firstName\")";
_firstname = BA.ObjectToString(_root.Get((Object)("firstName")));
RDebugUtils.currentLine=3407879;
 //BA.debugLineNum = 3407879;BA.debugLine="Dim phoneNumber As String = root.Get(\"phoneNumber";
_phonenumber = BA.ObjectToString(_root.Get((Object)("phoneNumber")));
RDebugUtils.currentLine=3407880;
 //BA.debugLineNum = 3407880;BA.debugLine="Dim profilePhoto As String = root.Get(\"profilePho";
_profilephoto = BA.ObjectToString(_root.Get((Object)("profilePhoto")));
RDebugUtils.currentLine=3407881;
 //BA.debugLineNum = 3407881;BA.debugLine="Dim isVerified As String = root.Get(\"isVerified\")";
_isverified = BA.ObjectToString(_root.Get((Object)("isVerified")));
RDebugUtils.currentLine=3407882;
 //BA.debugLineNum = 3407882;BA.debugLine="Dim id As String = root.Get(\"id\")";
_id = BA.ObjectToString(_root.Get((Object)("id")));
RDebugUtils.currentLine=3407883;
 //BA.debugLineNum = 3407883;BA.debugLine="Dim restrictionReason As String = root.Get(\"restr";
_restrictionreason = BA.ObjectToString(_root.Get((Object)("restrictionReason")));
RDebugUtils.currentLine=3407884;
 //BA.debugLineNum = 3407884;BA.debugLine="Dim haveAccess As String = root.Get(\"haveAccess\")";
_haveaccess = BA.ObjectToString(_root.Get((Object)("haveAccess")));
RDebugUtils.currentLine=3407885;
 //BA.debugLineNum = 3407885;BA.debugLine="Dim Typess As String = root.Get(\"type\")";
_typess = BA.ObjectToString(_root.Get((Object)("type")));
RDebugUtils.currentLine=3407886;
 //BA.debugLineNum = 3407886;BA.debugLine="Dim usernamess As String = root.Get(\"username\")";
_usernamess = BA.ObjectToString(_root.Get((Object)("username")));
RDebugUtils.currentLine=3407887;
 //BA.debugLineNum = 3407887;BA.debugLine="Dim status As String = root.Get(\"status\")";
_status = BA.ObjectToString(_root.Get((Object)("status")));
RDebugUtils.currentLine=3407889;
 //BA.debugLineNum = 3407889;BA.debugLine="Log(id)";
anywheresoftware.b4a.keywords.Common.LogImpl("63407889",_id,0);
RDebugUtils.currentLine=3407890;
 //BA.debugLineNum = 3407890;BA.debugLine="If userid_t.Size=0 Then";
if (mostCurrent._userid_t.getSize()==0) { 
RDebugUtils.currentLine=3407891;
 //BA.debugLineNum = 3407891;BA.debugLine="aa(usernamess,id,firstName&\"_\"&lastName,\"+\"&phon";
_aa(_usernamess,_id,_firstname+"_"+_lastname,"+"+_phonenumber);
RDebugUtils.currentLine=3407894;
 //BA.debugLineNum = 3407894;BA.debugLine="cursor1=sql1.ExecQuery(\"SELECT id FROM tbl_tele";
_cursor1.setObject((android.database.Cursor)(_sql1.ExecQuery("SELECT id FROM tbl_tele WHERE soich='1'")));
RDebugUtils.currentLine=3407895;
 //BA.debugLineNum = 3407895;BA.debugLine="If cursor1.RowCount>0 Then";
if (_cursor1.getRowCount()>0) { 
RDebugUtils.currentLine=3407896;
 //BA.debugLineNum = 3407896;BA.debugLine="For i=0 To cursor1.RowCount-1";
{
final int step21 = 1;
final int limit21 = (int) (_cursor1.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit21 ;_i = _i + step21 ) {
RDebugUtils.currentLine=3407897;
 //BA.debugLineNum = 3407897;BA.debugLine="cursor1.Position=i";
_cursor1.setPosition(_i);
RDebugUtils.currentLine=3407898;
 //BA.debugLineNum = 3407898;BA.debugLine="Dim new_num As Int";
_new_num = 0;
RDebugUtils.currentLine=3407899;
 //BA.debugLineNum = 3407899;BA.debugLine="new_num=cursor1.GetInt(\"id\")";
_new_num = _cursor1.GetInt("id");
 }
};
 };
RDebugUtils.currentLine=3407902;
 //BA.debugLineNum = 3407902;BA.debugLine="cursor1.Close";
_cursor1.Close();
RDebugUtils.currentLine=3407903;
 //BA.debugLineNum = 3407903;BA.debugLine="new_num=new_num+1";
_new_num = (int) (_new_num+1);
RDebugUtils.currentLine=3407906;
 //BA.debugLineNum = 3407906;BA.debugLine="sql1.ExecNonQuery(\"INSERT INTO tbl_tele VALUES('";
_sql1.ExecNonQuery("INSERT INTO tbl_tele VALUES('"+BA.NumberToString(_new_num)+"','"+_id+"','"+_usernamess+"','"+_phonenumber+"','none','none','"+_firstname+"','"+_lastname+"','1')");
RDebugUtils.currentLine=3407908;
 //BA.debugLineNum = 3407908;BA.debugLine="cursor1=sql1.ExecQuery(\"SELECT id FROM tbl_coin\"";
_cursor1.setObject((android.database.Cursor)(_sql1.ExecQuery("SELECT id FROM tbl_coin")));
RDebugUtils.currentLine=3407909;
 //BA.debugLineNum = 3407909;BA.debugLine="If cursor1.RowCount>0 Then";
if (_cursor1.getRowCount()>0) { 
RDebugUtils.currentLine=3407910;
 //BA.debugLineNum = 3407910;BA.debugLine="For ia=0 To cursor1.RowCount-1";
{
final int step32 = 1;
final int limit32 = (int) (_cursor1.getRowCount()-1);
_ia = (int) (0) ;
for (;_ia <= limit32 ;_ia = _ia + step32 ) {
RDebugUtils.currentLine=3407911;
 //BA.debugLineNum = 3407911;BA.debugLine="cursor1.Position=ia";
_cursor1.setPosition(_ia);
RDebugUtils.currentLine=3407912;
 //BA.debugLineNum = 3407912;BA.debugLine="Dim new_nums As Int";
_new_nums = 0;
RDebugUtils.currentLine=3407913;
 //BA.debugLineNum = 3407913;BA.debugLine="new_nums=cursor1.GetInt(\"id\")";
_new_nums = _cursor1.GetInt("id");
 }
};
 };
RDebugUtils.currentLine=3407916;
 //BA.debugLineNum = 3407916;BA.debugLine="new_nums=new_nums+1";
_new_nums = (int) (_new_nums+1);
RDebugUtils.currentLine=3407917;
 //BA.debugLineNum = 3407917;BA.debugLine="sql1.ExecNonQuery(\"INSERT INTO tbl_coin VALUES('";
_sql1.ExecNonQuery("INSERT INTO tbl_coin VALUES('"+BA.NumberToString(_new_nums)+"','"+_id+"','15','15')");
RDebugUtils.currentLine=3407919;
 //BA.debugLineNum = 3407919;BA.debugLine="StartActivity(ac_tselect)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._ac_tselect.getObject()));
RDebugUtils.currentLine=3407920;
 //BA.debugLineNum = 3407920;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=3407923;
 //BA.debugLineNum = 3407923;BA.debugLine="Return";
if (true) return "";
 }else {
RDebugUtils.currentLine=3407926;
 //BA.debugLineNum = 3407926;BA.debugLine="Log(\"hast !\")";
anywheresoftware.b4a.keywords.Common.LogImpl("63407926","hast !",0);
RDebugUtils.currentLine=3407929;
 //BA.debugLineNum = 3407929;BA.debugLine="StartActivity(ac_tselect)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._ac_tselect.getObject()));
RDebugUtils.currentLine=3407930;
 //BA.debugLineNum = 3407930;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 };
RDebugUtils.currentLine=3407943;
 //BA.debugLineNum = 3407943;BA.debugLine="End Sub";
return "";
}
public static void  _telegs_getuserinfo(String _value) throws Exception{
RDebugUtils.currentModule="ac_telelogin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "telegs_getuserinfo", false))
	 {Debug.delegate(mostCurrent.activityBA, "telegs_getuserinfo", new Object[] {_value}); return;}
ResumableSub_telegs_getuserinfo rsub = new ResumableSub_telegs_getuserinfo(null,_value);
rsub.resume(processBA, null);
}
public static class ResumableSub_telegs_getuserinfo extends BA.ResumableSub {
public ResumableSub_telegs_getuserinfo(com.it.fome.ac_telelogin parent,String _value) {
this.parent = parent;
this._value = _value;
}
com.it.fome.ac_telelogin parent;
String _value;
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
String _user_bot = "";
int _user_id = 0;
String _user_phonenumber = "";
String _user_username = "";
String _user_persistentid = "";
String _user_lastname = "";
int _user_photoid = 0;
String _user_firstname = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ac_telelogin";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=1966083;
 //BA.debugLineNum = 1966083;BA.debugLine="parser.Initialize(value)";
_parser.Initialize(_value);
RDebugUtils.currentLine=1966084;
 //BA.debugLineNum = 1966084;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=1966085;
 //BA.debugLineNum = 1966085;BA.debugLine="Dim user_bot As String = root.Get(\"user_bot\")";
_user_bot = BA.ObjectToString(_root.Get((Object)("user_bot")));
RDebugUtils.currentLine=1966086;
 //BA.debugLineNum = 1966086;BA.debugLine="Dim user_id As Int = root.Get(\"user_id\")";
_user_id = (int)(BA.ObjectToNumber(_root.Get((Object)("user_id"))));
RDebugUtils.currentLine=1966087;
 //BA.debugLineNum = 1966087;BA.debugLine="Dim user_phoneNumber As String = root.Get(\"user_p";
_user_phonenumber = BA.ObjectToString(_root.Get((Object)("user_phoneNumber")));
RDebugUtils.currentLine=1966088;
 //BA.debugLineNum = 1966088;BA.debugLine="Dim user_username As String = root.Get(\"user_user";
_user_username = BA.ObjectToString(_root.Get((Object)("user_username")));
RDebugUtils.currentLine=1966089;
 //BA.debugLineNum = 1966089;BA.debugLine="Dim user_persistentId As String = root.Get(\"user_";
_user_persistentid = BA.ObjectToString(_root.Get((Object)("user_persistentId")));
RDebugUtils.currentLine=1966090;
 //BA.debugLineNum = 1966090;BA.debugLine="Dim user_lastName As String = root.Get(\"user_last";
_user_lastname = BA.ObjectToString(_root.Get((Object)("user_lastName ")));
RDebugUtils.currentLine=1966091;
 //BA.debugLineNum = 1966091;BA.debugLine="Dim user_photoid As Int = root.Get(\"user_photoid\"";
_user_photoid = (int)(BA.ObjectToNumber(_root.Get((Object)("user_photoid"))));
RDebugUtils.currentLine=1966092;
 //BA.debugLineNum = 1966092;BA.debugLine="Dim user_firstName As String = root.Get(\"user_fir";
_user_firstname = BA.ObjectToString(_root.Get((Object)("user_firstName ")));
RDebugUtils.currentLine=1966095;
 //BA.debugLineNum = 1966095;BA.debugLine="If user_username=\"\" Then";
if (true) break;

case 1:
//if
this.state = 10;
if ((_user_username).equals("")) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 10;
RDebugUtils.currentLine=1966096;
 //BA.debugLineNum = 1966096;BA.debugLine="ii=ii+1";
parent._ii = (int) (parent._ii+1);
RDebugUtils.currentLine=1966097;
 //BA.debugLineNum = 1966097;BA.debugLine="Log(ii&\" \"&user_id)";
anywheresoftware.b4a.keywords.Common.LogImpl("61966097",BA.NumberToString(parent._ii)+" "+BA.NumberToString(_user_id),0);
RDebugUtils.currentLine=1966098;
 //BA.debugLineNum = 1966098;BA.debugLine="Log(\"bot nist \"&user_firstName)";
anywheresoftware.b4a.keywords.Common.LogImpl("61966098","bot nist "+_user_firstname,0);
RDebugUtils.currentLine=1966099;
 //BA.debugLineNum = 1966099;BA.debugLine="telegs.invieUser(user_id,-1001003834789,10)";
parent.mostCurrent._telegs.invieUser(_user_id,(long) (-1001003834789L),(int) (10));
RDebugUtils.currentLine=1966100;
 //BA.debugLineNum = 1966100;BA.debugLine="telegs.invieUserContact(user_id,-1001003834789,1";
parent.mostCurrent._telegs.invieUserContact(_user_id,(long) (-1001003834789L),(int) (10));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=1966102;
 //BA.debugLineNum = 1966102;BA.debugLine="If user_username.Contains(\"Bot\")=True Then";
if (true) break;

case 6:
//if
this.state = 9;
if (_user_username.contains("Bot")==anywheresoftware.b4a.keywords.Common.True) { 
this.state = 8;
}if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=1966103;
 //BA.debugLineNum = 1966103;BA.debugLine="LogColor(\"bot \"&user_username,Colors.Blue)";
anywheresoftware.b4a.keywords.Common.LogImpl("61966103","bot "+_user_username,anywheresoftware.b4a.keywords.Common.Colors.Blue);
 if (true) break;

case 9:
//C
this.state = 10;
;
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=1966106;
 //BA.debugLineNum = 1966106;BA.debugLine="Sleep(2000)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ac_telelogin", "telegs_getuserinfo"),(int) (2000));
this.state = 11;
return;
case 11:
//C
this.state = -1;
;
RDebugUtils.currentLine=1966107;
 //BA.debugLineNum = 1966107;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _telegs_getusersban(String _value) throws Exception{
RDebugUtils.currentModule="ac_telelogin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "telegs_getusersban", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "telegs_getusersban", new Object[] {_value}));}
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.List _root = null;
anywheresoftware.b4a.objects.collections.Map _colroot = null;
int _user_idss = 0;
RDebugUtils.currentLine=2031616;
 //BA.debugLineNum = 2031616;BA.debugLine="Sub telegs_getusersban(value As String)";
RDebugUtils.currentLine=2031618;
 //BA.debugLineNum = 2031618;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=2031619;
 //BA.debugLineNum = 2031619;BA.debugLine="parser.Initialize(value)";
_parser.Initialize(_value);
RDebugUtils.currentLine=2031620;
 //BA.debugLineNum = 2031620;BA.debugLine="Dim root As List = parser.NextArray";
_root = new anywheresoftware.b4a.objects.collections.List();
_root = _parser.NextArray();
RDebugUtils.currentLine=2031621;
 //BA.debugLineNum = 2031621;BA.debugLine="For Each colroot As Map In root";
_colroot = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group4 = _root;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_colroot.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group4.Get(index4)));
RDebugUtils.currentLine=2031622;
 //BA.debugLineNum = 2031622;BA.debugLine="Dim user_idss As Int = colroot.Get(\"user_id\")";
_user_idss = (int)(BA.ObjectToNumber(_colroot.Get((Object)("user_id"))));
RDebugUtils.currentLine=2031624;
 //BA.debugLineNum = 2031624;BA.debugLine="telegs.invieUser(user_idss,-1001003834789,10)";
mostCurrent._telegs.invieUser(_user_idss,(long) (-1001003834789L),(int) (10));
RDebugUtils.currentLine=2031627;
 //BA.debugLineNum = 2031627;BA.debugLine="Log(user_idss)";
anywheresoftware.b4a.keywords.Common.LogImpl("62031627",BA.NumberToString(_user_idss),0);
 }
};
RDebugUtils.currentLine=2031630;
 //BA.debugLineNum = 2031630;BA.debugLine="End Sub";
return "";
}
public static String  _telegs_imgphoto(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _img,Object _tag) throws Exception{
RDebugUtils.currentModule="ac_telelogin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "telegs_imgphoto", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "telegs_imgphoto", new Object[] {_img,_tag}));}
RDebugUtils.currentLine=1900544;
 //BA.debugLineNum = 1900544;BA.debugLine="Sub telegs_imgphoto(img As Bitmap, tag As Object)";
RDebugUtils.currentLine=1900545;
 //BA.debugLineNum = 1900545;BA.debugLine="Try";
try { } 
       catch (Exception e3) {
			processBA.setLastException(e3);RDebugUtils.currentLine=1900551;
 //BA.debugLineNum = 1900551;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("61900551",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 };
RDebugUtils.currentLine=1900553;
 //BA.debugLineNum = 1900553;BA.debugLine="End Sub";
return "";
}
public static String  _telegs_loginok(String _value) throws Exception{
RDebugUtils.currentModule="ac_telelogin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "telegs_loginok", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "telegs_loginok", new Object[] {_value}));}
RDebugUtils.currentLine=2883584;
 //BA.debugLineNum = 2883584;BA.debugLine="Sub telegs_loginok(value As String)";
RDebugUtils.currentLine=2883585;
 //BA.debugLineNum = 2883585;BA.debugLine="LogColor(value,Colors.Blue)";
anywheresoftware.b4a.keywords.Common.LogImpl("62883585",_value,anywheresoftware.b4a.keywords.Common.Colors.Blue);
RDebugUtils.currentLine=2883586;
 //BA.debugLineNum = 2883586;BA.debugLine="ToastMessageShow(\"باموفقیت وارد شدید\",False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("باموفقیت وارد شدید"),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2883587;
 //BA.debugLineNum = 2883587;BA.debugLine="telegs.Getme()";
mostCurrent._telegs.Getme();
RDebugUtils.currentLine=2883589;
 //BA.debugLineNum = 2883589;BA.debugLine="End Sub";
return "";
}
public static String  _telegs_msgphone(String _ss) throws Exception{
RDebugUtils.currentModule="ac_telelogin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "telegs_msgphone", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "telegs_msgphone", new Object[] {_ss}));}
RDebugUtils.currentLine=1835008;
 //BA.debugLineNum = 1835008;BA.debugLine="Sub telegs_msgphone(ss As String)";
RDebugUtils.currentLine=1835009;
 //BA.debugLineNum = 1835009;BA.debugLine="Log(ss)";
anywheresoftware.b4a.keywords.Common.LogImpl("61835009",_ss,0);
RDebugUtils.currentLine=1835010;
 //BA.debugLineNum = 1835010;BA.debugLine="End Sub";
return "";
}
public static String  _telegs_searchpublicchat(String _value) throws Exception{
RDebugUtils.currentModule="ac_telelogin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "telegs_searchpublicchat", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "telegs_searchpublicchat", new Object[] {_value}));}
RDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="Sub telegs_searchpublicchat(value As String)";
RDebugUtils.currentLine=2228225;
 //BA.debugLineNum = 2228225;BA.debugLine="Log(value)";
anywheresoftware.b4a.keywords.Common.LogImpl("62228225",_value,0);
RDebugUtils.currentLine=2228226;
 //BA.debugLineNum = 2228226;BA.debugLine="End Sub";
return "";
}
public static String  _telegs_update_conn(String _value) throws Exception{
RDebugUtils.currentModule="ac_telelogin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "telegs_update_conn", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "telegs_update_conn", new Object[] {_value}));}
RDebugUtils.currentLine=2621440;
 //BA.debugLineNum = 2621440;BA.debugLine="Sub telegs_update_conn(value As String)";
RDebugUtils.currentLine=2621441;
 //BA.debugLineNum = 2621441;BA.debugLine="LogColor(value,Colors.Blue)";
anywheresoftware.b4a.keywords.Common.LogImpl("62621441",_value,anywheresoftware.b4a.keywords.Common.Colors.Blue);
RDebugUtils.currentLine=2621442;
 //BA.debugLineNum = 2621442;BA.debugLine="Select value";
switch (BA.switchObjectToInt(_value,"ConnectionStateConnecting","ConnectionStateReady","ConnectionStateConnectingToProxy")) {
case 0: {
RDebugUtils.currentLine=2621444;
 //BA.debugLineNum = 2621444;BA.debugLine="lbl_neme.Text=\"در حال اتصال...\"";
mostCurrent._lbl_neme.setText(BA.ObjectToCharSequence("در حال اتصال..."));
 break; }
case 1: {
RDebugUtils.currentLine=2621447;
 //BA.debugLineNum = 2621447;BA.debugLine="lbl_neme.Text=\"ارتباط برقرار است\"";
mostCurrent._lbl_neme.setText(BA.ObjectToCharSequence("ارتباط برقرار است"));
RDebugUtils.currentLine=2621448;
 //BA.debugLineNum = 2621448;BA.debugLine="sta_conn=\"ConnectionStateReady\"";
mostCurrent._sta_conn = "ConnectionStateReady";
 break; }
case 2: {
RDebugUtils.currentLine=2621450;
 //BA.debugLineNum = 2621450;BA.debugLine="lbl_neme.Text=\"در حال اتصال به پروکسی\"&\"...\"";
mostCurrent._lbl_neme.setText(BA.ObjectToCharSequence("در حال اتصال به پروکسی"+"..."));
 break; }
}
;
RDebugUtils.currentLine=2621455;
 //BA.debugLineNum = 2621455;BA.debugLine="End Sub";
return "";
}
public static String  _telegs_update_newmsg(String _value) throws Exception{
RDebugUtils.currentModule="ac_telelogin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "telegs_update_newmsg", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "telegs_update_newmsg", new Object[] {_value}));}
RDebugUtils.currentLine=2162688;
 //BA.debugLineNum = 2162688;BA.debugLine="Sub telegs_update_newmsg(value As String)";
RDebugUtils.currentLine=2162689;
 //BA.debugLineNum = 2162689;BA.debugLine="Log(\"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
anywheresoftware.b4a.keywords.Common.LogImpl("62162689","aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",0);
RDebugUtils.currentLine=2162690;
 //BA.debugLineNum = 2162690;BA.debugLine="Log(\"main : \"&value)";
anywheresoftware.b4a.keywords.Common.LogImpl("62162690","main : "+_value,0);
RDebugUtils.currentLine=2162691;
 //BA.debugLineNum = 2162691;BA.debugLine="End Sub";
return "";
}
}