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

public class act_chat extends androidx.appcompat.app.AppCompatActivity implements B4AActivity{
	public static act_chat mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "com.it.fome", "com.it.fome.act_chat");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (act_chat).");
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
		activityBA = new BA(this, layout, processBA, "com.it.fome", "com.it.fome.act_chat");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "com.it.fome.act_chat", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (act_chat) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (act_chat) Resume **");
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
		return act_chat.class;
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
        BA.LogInfo("** Activity (act_chat) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            act_chat mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (act_chat) Resume **");
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


public static class _adapter{
public boolean IsInitialized;
public int ViewType;
public String MyText;
public String TheirText;
public String img_my;
public String img_isdwonload;
public String img_id;
public String img_remote;
public String msg_id;
public String caption_topmsg;
public int iscaptions;
public void Initialize() {
IsInitialized = true;
ViewType = 0;
MyText = "";
TheirText = "";
img_my = "";
img_isdwonload = "";
img_id = "";
img_remote = "";
msg_id = "";
caption_topmsg = "";
iscaptions = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}

public static void initializeProcessGlobals() {
             try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
}
public anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.objects.Timer _timer = null;
public static anywheresoftware.b4a.objects.Timer _timer2 = null;
public static anywheresoftware.b4a.objects.Timer _tm = null;
public static int _mine = 0;
public static int _their = 0;
public static int _minest = 0;
public static int _minest2 = 0;
public static int _videome = 0;
public static int _videothire = 0;
public static String _imagename = "";
public static String _name = "";
public static String[] _msg = null;
public static String _name_chat = "";
public static String _chat_id = "";
public static String _numcoins = "";
public static String _numfinish = "";
public static String _channelid = "";
public static String _imgchat = "";
public static String _list_dl = "";
public static anywheresoftware.b4a.sql.SQL _sql1 = null;
public static anywheresoftware.b4a.sql.SQL.CursorWrapper _cursor1 = null;
public static String _us_name = "";
public com.mili.telegrams.teleg_warp _telegs = null;
public de.amberhome.materialdialogs.MaterialDialogWrapper _progressdialog = null;
public com.reza.sh.fastnet.UploadRequest _upl = null;
public com.reza.sh.fastnet.Fastnet _pr = null;
public wir.hitex.recycler.Hitex_LayoutView _lv = null;
public ir.hitex.reveallayout.Hitex_RevealLayout _re = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittext = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _btnsend = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _btnatt = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _mic = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _stic = null;
public anywheresoftware.b4a.objects.collections.List _itemlist = null;
public anywheresoftware.b4a.object.XmlLayoutBuilder _xml = null;
public de.amberhome.objects.appcompat.AppCompatBase _appcompat = null;
public anywheresoftware.b4a.objects.PanelWrapper _toolbar = null;
public anywheresoftware.b4a.objects.LabelWrapper _status = null;
public static int _height = 0;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper _canvas = null;
public anywheresoftware.b4a.keywords.constants.TypefaceWrapper _font = null;
public anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
public com.hitex_glide.Hitex_Glide _glide = null;
public anywheresoftware.b4a.objects.PanelWrapper _pan = null;
public anywheresoftware.b4a.objects.StringUtils _strutil = null;
public static float _ht = 0f;
public anywheresoftware.b4a.objects.AnimationWrapper _an = null;
public anywheresoftware.b4a.objects.IME _ime = null;
public static int _q = 0;
public static int _q2 = 0;
public static int _top = 0;
public static boolean _sho = false;
public anywheresoftware.b4a.objects.PanelWrapper _stp = null;
public static String _username_t = "";
public static String _userid_t = "";
public static String _msg_id_select = "";
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
public com.it.fome.ac_home _ac_home = null;
public com.it.fome.starter _starter = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="act_chat";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
int _i = 0;
anywheresoftware.b4a.objects.ImageViewWrapper _personimage = null;
anywheresoftware.b4a.objects.LabelWrapper _personname = null;
anywheresoftware.b4a.keywords.constants.TypefaceWrapper _font2 = null;
RDebugUtils.currentLine=19202048;
 //BA.debugLineNum = 19202048;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=19202049;
 //BA.debugLineNum = 19202049;BA.debugLine="pr.initialize(\"pr\")";
mostCurrent._pr.initialize(processBA,"pr");
RDebugUtils.currentLine=19202050;
 //BA.debugLineNum = 19202050;BA.debugLine="If File.Exists(File.DirInternal,\"instadb.db\")=Fal";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"instadb.db")==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=19202051;
 //BA.debugLineNum = 19202051;BA.debugLine="File.Copy(File.DirAssets,\"instadb.db\",File.DirIn";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"instadb.db",anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"instadb.db");
 };
RDebugUtils.currentLine=19202053;
 //BA.debugLineNum = 19202053;BA.debugLine="If sql1.IsInitialized=False Then";
if (_sql1.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=19202054;
 //BA.debugLineNum = 19202054;BA.debugLine="sql1.Initialize(File.DirInternal,\"instadb.db\",Fa";
_sql1.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"instadb.db",anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=19202058;
 //BA.debugLineNum = 19202058;BA.debugLine="cursor1 = sql1.ExecQuery(\"SELECT * FROM tbl_tele";
_cursor1.setObject((android.database.Cursor)(_sql1.ExecQuery("SELECT * FROM tbl_tele WHERE soich='1'")));
RDebugUtils.currentLine=19202059;
 //BA.debugLineNum = 19202059;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=19202060;
 //BA.debugLineNum = 19202060;BA.debugLine="For i=0 To cursor1.RowCount-1";
{
final int step10 = 1;
final int limit10 = (int) (_cursor1.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit10 ;_i = _i + step10 ) {
RDebugUtils.currentLine=19202061;
 //BA.debugLineNum = 19202061;BA.debugLine="cursor1.Position=i";
_cursor1.setPosition(_i);
RDebugUtils.currentLine=19202062;
 //BA.debugLineNum = 19202062;BA.debugLine="userid_t=cursor1.GetString(\"userid\")";
mostCurrent._userid_t = _cursor1.GetString("userid");
RDebugUtils.currentLine=19202063;
 //BA.debugLineNum = 19202063;BA.debugLine="username_t=cursor1.GetString(\"username\")";
mostCurrent._username_t = _cursor1.GetString("username");
 }
};
RDebugUtils.currentLine=19202065;
 //BA.debugLineNum = 19202065;BA.debugLine="cursor1.Close";
_cursor1.Close();
RDebugUtils.currentLine=19202067;
 //BA.debugLineNum = 19202067;BA.debugLine="ItemList.Initialize";
mostCurrent._itemlist.Initialize();
RDebugUtils.currentLine=19202068;
 //BA.debugLineNum = 19202068;BA.debugLine="IME.Initialize(\"IME\")";
mostCurrent._ime.Initialize("IME");
RDebugUtils.currentLine=19202069;
 //BA.debugLineNum = 19202069;BA.debugLine="IME.AddHeightChangedEvent";
mostCurrent._ime.AddHeightChangedEvent(mostCurrent.activityBA);
RDebugUtils.currentLine=19202070;
 //BA.debugLineNum = 19202070;BA.debugLine="Font = Typeface.LoadFromAssets(\"iran_sans.ttf\")";
mostCurrent._font.setObject((android.graphics.Typeface)(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("iran_sans.ttf")));
RDebugUtils.currentLine=19202071;
 //BA.debugLineNum = 19202071;BA.debugLine="SB.Initialize";
mostCurrent._sb.Initialize();
RDebugUtils.currentLine=19202072;
 //BA.debugLineNum = 19202072;BA.debugLine="Toolbar.Initialize(\"Toolbar\")";
mostCurrent._toolbar.Initialize(mostCurrent.activityBA,"Toolbar");
RDebugUtils.currentLine=19202073;
 //BA.debugLineNum = 19202073;BA.debugLine="Toolbar.Color = AppCompat.GetThemeAttribute(\"colo";
mostCurrent._toolbar.setColor(mostCurrent._appcompat.GetThemeAttribute(mostCurrent.activityBA,"colorPrimary"));
RDebugUtils.currentLine=19202075;
 //BA.debugLineNum = 19202075;BA.debugLine="Activity.AddView(Toolbar,0,0,100%x,10%y)";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._toolbar.getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (10),mostCurrent.activityBA));
RDebugUtils.currentLine=19202076;
 //BA.debugLineNum = 19202076;BA.debugLine="Toolbar.Elevation = 8dip";
mostCurrent._toolbar.setElevation((float) (anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (8))));
RDebugUtils.currentLine=19202077;
 //BA.debugLineNum = 19202077;BA.debugLine="Dim PersonImage As ImageView : PersonImage.Initia";
_personimage = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=19202077;
 //BA.debugLineNum = 19202077;BA.debugLine="Dim PersonImage As ImageView : PersonImage.Initia";
_personimage.Initialize(mostCurrent.activityBA,"PersonImage");
RDebugUtils.currentLine=19202078;
 //BA.debugLineNum = 19202078;BA.debugLine="Toolbar.AddView(PersonImage,10%x,1%y,8%y,8%y)";
mostCurrent._toolbar.AddView((android.view.View)(_personimage.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (1),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (8),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (8),mostCurrent.activityBA));
RDebugUtils.currentLine=19202079;
 //BA.debugLineNum = 19202079;BA.debugLine="Glide.Load(\"\",imgchat).OptionalCircleCrop.Into(Pe";
mostCurrent._glide.Load(mostCurrent.activityBA,"",_imgchat).OptionalCircleCrop().Into(_personimage);
RDebugUtils.currentLine=19202080;
 //BA.debugLineNum = 19202080;BA.debugLine="Dim PersonName As Label : PersonName.Initialize(\"";
_personname = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=19202080;
 //BA.debugLineNum = 19202080;BA.debugLine="Dim PersonName As Label : PersonName.Initialize(\"";
_personname.Initialize(mostCurrent.activityBA,"PersonName");
RDebugUtils.currentLine=19202081;
 //BA.debugLineNum = 19202081;BA.debugLine="Toolbar.AddView(PersonName,20%x+11%y,5dip,42%x,5%";
mostCurrent._toolbar.AddView((android.view.View)(_personname.getObject()),(int) (anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (20),mostCurrent.activityBA)+anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (11),mostCurrent.activityBA)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (5)),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (42),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (5),mostCurrent.activityBA));
RDebugUtils.currentLine=19202082;
 //BA.debugLineNum = 19202082;BA.debugLine="PersonName.Text = name_chat";
_personname.setText(BA.ObjectToCharSequence(_name_chat));
RDebugUtils.currentLine=19202083;
 //BA.debugLineNum = 19202083;BA.debugLine="PersonName.Gravity = Gravity.LEFT";
_personname.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.LEFT);
RDebugUtils.currentLine=19202084;
 //BA.debugLineNum = 19202084;BA.debugLine="PersonName.TextColor = 0xFFFAFAFA";
_personname.setTextColor((int) (0xfffafafa));
RDebugUtils.currentLine=19202085;
 //BA.debugLineNum = 19202085;BA.debugLine="PersonName.TextSize = 18";
_personname.setTextSize((float) (18));
RDebugUtils.currentLine=19202086;
 //BA.debugLineNum = 19202086;BA.debugLine="Private Font2 = Typeface.CreateNew(Font,Typeface.";
_font2 = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
_font2.setObject((android.graphics.Typeface)(anywheresoftware.b4a.keywords.Common.Typeface.CreateNew((android.graphics.Typeface)(mostCurrent._font.getObject()),anywheresoftware.b4a.keywords.Common.Typeface.STYLE_BOLD)));
RDebugUtils.currentLine=19202087;
 //BA.debugLineNum = 19202087;BA.debugLine="PersonName.Typeface = Font2";
_personname.setTypeface((android.graphics.Typeface)(_font2.getObject()));
RDebugUtils.currentLine=19202089;
 //BA.debugLineNum = 19202089;BA.debugLine="Status.Initialize(\"Status\")";
mostCurrent._status.Initialize(mostCurrent.activityBA,"Status");
RDebugUtils.currentLine=19202090;
 //BA.debugLineNum = 19202090;BA.debugLine="Toolbar.AddView(Status,20%x+11%y,5%y,42%x,4%y)";
mostCurrent._toolbar.AddView((android.view.View)(mostCurrent._status.getObject()),(int) (anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (20),mostCurrent.activityBA)+anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (11),mostCurrent.activityBA)),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (5),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (42),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (4),mostCurrent.activityBA));
RDebugUtils.currentLine=19202091;
 //BA.debugLineNum = 19202091;BA.debugLine="Status.Text = \"last seen recently\"";
mostCurrent._status.setText(BA.ObjectToCharSequence("last seen recently"));
RDebugUtils.currentLine=19202092;
 //BA.debugLineNum = 19202092;BA.debugLine="Status.Gravity = Gravity.LEFT";
mostCurrent._status.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.LEFT);
RDebugUtils.currentLine=19202093;
 //BA.debugLineNum = 19202093;BA.debugLine="Status.TextColor = 0xFFFAFAFA";
mostCurrent._status.setTextColor((int) (0xfffafafa));
RDebugUtils.currentLine=19202094;
 //BA.debugLineNum = 19202094;BA.debugLine="Status.TextSize = 15";
mostCurrent._status.setTextSize((float) (15));
RDebugUtils.currentLine=19202095;
 //BA.debugLineNum = 19202095;BA.debugLine="Status.Typeface = Font";
mostCurrent._status.setTypeface((android.graphics.Typeface)(mostCurrent._font.getObject()));
RDebugUtils.currentLine=19202105;
 //BA.debugLineNum = 19202105;BA.debugLine="Height = 99%y-Toolbar.Height";
_height = (int) (anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (99),mostCurrent.activityBA)-mostCurrent._toolbar.getHeight());
RDebugUtils.currentLine=19202107;
 //BA.debugLineNum = 19202107;BA.debugLine="LV.Initializer(\"LV\").ListView.ReverseLayout.Build";
mostCurrent._lv.Initializer(mostCurrent.activityBA,"LV").ListView().ReverseLayout().Build();
RDebugUtils.currentLine=19202108;
 //BA.debugLineNum = 19202108;BA.debugLine="Activity.AddView(LV,0,Toolbar.Height,100%x,Height";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._lv.getObject()),(int) (0),mostCurrent._toolbar.getHeight(),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),_height);
RDebugUtils.currentLine=19202144;
 //BA.debugLineNum = 19202144;BA.debugLine="Activity.SetBackgroundImage(LoadBitmap(File.DirAs";
mostCurrent._activity.SetBackgroundImageNew((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"background_hd.jpg").getObject()));
RDebugUtils.currentLine=19202146;
 //BA.debugLineNum = 19202146;BA.debugLine="LV.Ripple.Alpha(0).Color(Colors.Transparent)";
mostCurrent._lv.Ripple().Alpha((float) (0)).Color(anywheresoftware.b4a.keywords.Common.Colors.Transparent);
RDebugUtils.currentLine=19202148;
 //BA.debugLineNum = 19202148;BA.debugLine="LV.Show";
mostCurrent._lv.Show();
RDebugUtils.currentLine=19202153;
 //BA.debugLineNum = 19202153;BA.debugLine="Canvas.Initialize(Activity)";
mostCurrent._canvas.Initialize((android.view.View)(mostCurrent._activity.getObject()));
RDebugUtils.currentLine=19202177;
 //BA.debugLineNum = 19202177;BA.debugLine="telegs.Initialize(\"telegs\")";
mostCurrent._telegs.Initialize(processBA,"telegs");
RDebugUtils.currentLine=19202178;
 //BA.debugLineNum = 19202178;BA.debugLine="telegs.getChatHistory(chat_id,0,0,1,False)";
mostCurrent._telegs.getChatHistory((long)(Double.parseDouble(_chat_id)),(long) (0),(int) (0),(int) (1),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=19202181;
 //BA.debugLineNum = 19202181;BA.debugLine="End Sub";
return "";
}
public static boolean  _activity_keypress(int _keycode) throws Exception{
RDebugUtils.currentModule="act_chat";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_keypress", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "activity_keypress", new Object[] {_keycode}));}
RDebugUtils.currentLine=21233664;
 //BA.debugLineNum = 21233664;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
RDebugUtils.currentLine=21233665;
 //BA.debugLineNum = 21233665;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
if (_keycode==anywheresoftware.b4a.keywords.Common.KeyCodes.KEYCODE_BACK) { 
RDebugUtils.currentLine=21233673;
 //BA.debugLineNum = 21233673;BA.debugLine="Back_Click";
_back_click();
 };
RDebugUtils.currentLine=21233676;
 //BA.debugLineNum = 21233676;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=21233677;
 //BA.debugLineNum = 21233677;BA.debugLine="End Sub";
return false;
}
public static String  _back_click() throws Exception{
RDebugUtils.currentModule="act_chat";
if (Debug.shouldDelegate(mostCurrent.activityBA, "back_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "back_click", null));}
RDebugUtils.currentLine=20643840;
 //BA.debugLineNum = 20643840;BA.debugLine="Sub Back_Click";
RDebugUtils.currentLine=20643841;
 //BA.debugLineNum = 20643841;BA.debugLine="IME.HideKeyboard";
mostCurrent._ime.HideKeyboard(mostCurrent.activityBA);
RDebugUtils.currentLine=20643842;
 //BA.debugLineNum = 20643842;BA.debugLine="StartActivity(ac_lchats)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._ac_lchats.getObject()));
RDebugUtils.currentLine=20643843;
 //BA.debugLineNum = 20643843;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=20643844;
 //BA.debugLineNum = 20643844;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="act_chat";
RDebugUtils.currentLine=20774912;
 //BA.debugLineNum = 20774912;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=20774914;
 //BA.debugLineNum = 20774914;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="act_chat";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=20709376;
 //BA.debugLineNum = 20709376;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=20709378;
 //BA.debugLineNum = 20709378;BA.debugLine="End Sub";
return "";
}
public static String  _activity_touch(int _action,float _x,float _y) throws Exception{
RDebugUtils.currentModule="act_chat";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_touch", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_touch", new Object[] {_action,_x,_y}));}
RDebugUtils.currentLine=21299200;
 //BA.debugLineNum = 21299200;BA.debugLine="Sub Activity_Touch (Action As Int, X As Float, Y A";
RDebugUtils.currentLine=21299201;
 //BA.debugLineNum = 21299201;BA.debugLine="If y < 100%y-75.5%x And stp.Top = 100%y-75.5%x Th";
if (_y<anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA)-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (75.5),mostCurrent.activityBA) && mostCurrent._stp.getTop()==anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA)-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (75.5),mostCurrent.activityBA)) { 
mostCurrent._stp.setTop(anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));};
RDebugUtils.currentLine=21299202;
 //BA.debugLineNum = 21299202;BA.debugLine="End Sub";
return "";
}
public static float  _art(String _text,anywheresoftware.b4a.objects.LabelWrapper _label) throws Exception{
RDebugUtils.currentModule="act_chat";
if (Debug.shouldDelegate(mostCurrent.activityBA, "art", false))
	 {return ((Float) Debug.delegate(mostCurrent.activityBA, "art", new Object[] {_text,_label}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
float _before = 0f;
float _after = 0f;
RDebugUtils.currentLine=20840448;
 //BA.debugLineNum = 20840448;BA.debugLine="Sub art(Text As String, Label As Label) As Float";
RDebugUtils.currentLine=20840449;
 //BA.debugLineNum = 20840449;BA.debugLine="ht = StrUtil.MeasureMultilineTextHeight(Label, T";
_ht = (float) (mostCurrent._strutil.MeasureMultilineTextHeight((android.widget.TextView)(_label.getObject()),BA.ObjectToCharSequence(_text)));
RDebugUtils.currentLine=20840450;
 //BA.debugLineNum = 20840450;BA.debugLine="Dim JO = Label As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo.setObject((java.lang.Object)(_label.getObject()));
RDebugUtils.currentLine=20840451;
 //BA.debugLineNum = 20840451;BA.debugLine="Dim before = JO.RunMethod(\"getLineHeight\",Null)";
_before = (float)(BA.ObjectToNumber(_jo.RunMethod("getLineHeight",(Object[])(anywheresoftware.b4a.keywords.Common.Null))));
RDebugUtils.currentLine=20840452;
 //BA.debugLineNum = 20840452;BA.debugLine="JO.RunMethod(\"setLineSpacing\", Array(0.0f,1.0f))";
_jo.RunMethod("setLineSpacing",new Object[]{(Object)(0.0f),(Object)(1.0f)});
RDebugUtils.currentLine=20840453;
 //BA.debugLineNum = 20840453;BA.debugLine="Dim after = JO.RunMethod(\"getLineHeight\",Null) *";
_after = (float) ((double)(BA.ObjectToNumber(_jo.RunMethod("getLineHeight",(Object[])(anywheresoftware.b4a.keywords.Common.Null))))*_ht);
RDebugUtils.currentLine=20840454;
 //BA.debugLineNum = 20840454;BA.debugLine="Return (after/before)";
if (true) return (float) ((_after/(double)_before));
RDebugUtils.currentLine=20840455;
 //BA.debugLineNum = 20840455;BA.debugLine="End Sub";
return 0f;
}
public static String  _autoanswer() throws Exception{
RDebugUtils.currentModule="act_chat";
if (Debug.shouldDelegate(mostCurrent.activityBA, "autoanswer", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "autoanswer", null));}
com.it.fome.act_chat._adapter _item = null;
com.it.fome.act_chat._adapter _olditem = null;
String[] _salam = null;
String[] _khobi = null;
String[] _chetori = null;
String[] _chekhabar = null;
String[] _recycler = null;
RDebugUtils.currentLine=20447232;
 //BA.debugLineNum = 20447232;BA.debugLine="Sub AutoAnswer";
RDebugUtils.currentLine=20447233;
 //BA.debugLineNum = 20447233;BA.debugLine="Dim Item As Adapter";
_item = new com.it.fome.act_chat._adapter();
RDebugUtils.currentLine=20447234;
 //BA.debugLineNum = 20447234;BA.debugLine="Item.ViewType = Their";
_item.ViewType /*int*/  = _their;
RDebugUtils.currentLine=20447236;
 //BA.debugLineNum = 20447236;BA.debugLine="Dim OldItem = ItemList.Get(ItemList.Size-1) As Ad";
_olditem = (com.it.fome.act_chat._adapter)(mostCurrent._itemlist.Get((int) (mostCurrent._itemlist.getSize()-1)));
RDebugUtils.currentLine=20447238;
 //BA.debugLineNum = 20447238;BA.debugLine="If (OldItem.MyText.Contains(\"سلام\")) Then";
if ((_olditem.MyText /*String*/ .contains("سلام"))) { 
RDebugUtils.currentLine=20447239;
 //BA.debugLineNum = 20447239;BA.debugLine="Dim Salam(6) As String = Array As String (\"سلام";
_salam = new String[]{"سلام داداش","علیکم السلام اخوی","درود","سلام و درود","سلام رفیق","سلام گل پسر"};
RDebugUtils.currentLine=20447240;
 //BA.debugLineNum = 20447240;BA.debugLine="Item.TheirText = Salam(Rnd(0,6))";
_item.TheirText /*String*/  = _salam[anywheresoftware.b4a.keywords.Common.Rnd((int) (0),(int) (6))];
 }else 
{RDebugUtils.currentLine=20447241;
 //BA.debugLineNum = 20447241;BA.debugLine="else If (OldItem.MyText.Contains(\"خوبی\")) Then";
if ((_olditem.MyText /*String*/ .contains("خوبی"))) { 
RDebugUtils.currentLine=20447242;
 //BA.debugLineNum = 20447242;BA.debugLine="Dim Khobi(6) As String = Array As String (\"مرسی";
_khobi = new String[]{"مرسی شما خوبی","خوبم ممنون","تشکر","الحمدلله","ای ... بد نیستیم","بهله خوبم"};
RDebugUtils.currentLine=20447243;
 //BA.debugLineNum = 20447243;BA.debugLine="Item.TheirText = Khobi(Rnd(0,6))";
_item.TheirText /*String*/  = _khobi[anywheresoftware.b4a.keywords.Common.Rnd((int) (0),(int) (6))];
 }else 
{RDebugUtils.currentLine=20447244;
 //BA.debugLineNum = 20447244;BA.debugLine="else If (OldItem.MyText.Contains(\"چطوری\")) Then";
if ((_olditem.MyText /*String*/ .contains("چطوری"))) { 
RDebugUtils.currentLine=20447245;
 //BA.debugLineNum = 20447245;BA.debugLine="Dim Chetori(6) As String = Array As String (\"چطو";
_chetori = new String[]{"چطورم","تو چطوری","خوووووووبم 😁","I'm Fine 😊","عالی","خوبه خوب"};
RDebugUtils.currentLine=20447246;
 //BA.debugLineNum = 20447246;BA.debugLine="Item.TheirText = Chetori(Rnd(0,6))";
_item.TheirText /*String*/  = _chetori[anywheresoftware.b4a.keywords.Common.Rnd((int) (0),(int) (6))];
 }else 
{RDebugUtils.currentLine=20447247;
 //BA.debugLineNum = 20447247;BA.debugLine="else If (OldItem.MyText.Contains(\"چه خبر\")) Then";
if ((_olditem.MyText /*String*/ .contains("چه خبر"))) { 
RDebugUtils.currentLine=20447248;
 //BA.debugLineNum = 20447248;BA.debugLine="Dim CheKhabar(6) As String = Array As String (\"خ";
_chekhabar = new String[]{"خبر خاصی نیس","سلامتی","سلامتی شما چه خبر","خبرا دست شماس","بی خبر","😠 دسته تبر"};
RDebugUtils.currentLine=20447249;
 //BA.debugLineNum = 20447249;BA.debugLine="Item.TheirText = CheKhabar(Rnd(0,6))";
_item.TheirText /*String*/  = _chekhabar[anywheresoftware.b4a.keywords.Common.Rnd((int) (0),(int) (6))];
 }else 
{RDebugUtils.currentLine=20447250;
 //BA.debugLineNum = 20447250;BA.debugLine="else If (OldItem.MyText.Contains(\"تست\")) Then";
if ((_olditem.MyText /*String*/ .contains("تست"))) { 
RDebugUtils.currentLine=20447251;
 //BA.debugLineNum = 20447251;BA.debugLine="Item.TheirText = \"hello how are you man it is a";
_item.TheirText /*String*/  = "hello how are you man it is a test message suieiuhello how are you man it is a test message suieiuehf sfs hello how are you man it is a test message suieiuehf sfs hello how are you man it is a test message suieiuehf sfs ehf sfs ofoshduf suhf siuf suiisdfuishfus hf sfusfs ifuish fushfosiuf";
 }else {
RDebugUtils.currentLine=20447253;
 //BA.debugLineNum = 20447253;BA.debugLine="Dim Recycler(8) As String = Array As String (\"😜";
_recycler = new String[]{"😜 این برنامه با هایتکس ریسایکلر ویو درست شده 🙌","سازنده : صادق نامنی 😎","چه خبر ؟","نمیدونم چی میگی","Created By Sadeq Nameni 😎","Hitexroid 😜","hello how are you man it is a test message","suieiuehf sfs ofoshduf suhf siuf suiisdfuishfus hf sfusfs ifuish fushfosiuf"};
RDebugUtils.currentLine=20447254;
 //BA.debugLineNum = 20447254;BA.debugLine="Item.TheirText = Recycler(Rnd(0,8))";
_item.TheirText /*String*/  = _recycler[anywheresoftware.b4a.keywords.Common.Rnd((int) (0),(int) (8))];
 }}}}}
;
RDebugUtils.currentLine=20447256;
 //BA.debugLineNum = 20447256;BA.debugLine="Status.Text = \"online\"";
mostCurrent._status.setText(BA.ObjectToCharSequence("online"));
RDebugUtils.currentLine=20447257;
 //BA.debugLineNum = 20447257;BA.debugLine="ItemList.Add(Item)";
mostCurrent._itemlist.Add((Object)(_item));
RDebugUtils.currentLine=20447259;
 //BA.debugLineNum = 20447259;BA.debugLine="tm.Initialize(\"TM\",200)";
_tm.Initialize(processBA,"TM",(long) (200));
RDebugUtils.currentLine=20447260;
 //BA.debugLineNum = 20447260;BA.debugLine="tm.Enabled = True";
_tm.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=20447262;
 //BA.debugLineNum = 20447262;BA.debugLine="End Sub";
return "";
}
public static String  _autoanswer2() throws Exception{
RDebugUtils.currentModule="act_chat";
if (Debug.shouldDelegate(mostCurrent.activityBA, "autoanswer2", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "autoanswer2", null));}
com.it.fome.act_chat._adapter _item = null;
RDebugUtils.currentLine=20512768;
 //BA.debugLineNum = 20512768;BA.debugLine="Sub AutoAnswer2";
RDebugUtils.currentLine=20512769;
 //BA.debugLineNum = 20512769;BA.debugLine="Dim Item As Adapter";
_item = new com.it.fome.act_chat._adapter();
RDebugUtils.currentLine=20512770;
 //BA.debugLineNum = 20512770;BA.debugLine="Item.ViewType = MINEST2";
_item.ViewType /*int*/  = _minest2;
RDebugUtils.currentLine=20512771;
 //BA.debugLineNum = 20512771;BA.debugLine="ItemList.Add(Item)";
mostCurrent._itemlist.Add((Object)(_item));
RDebugUtils.currentLine=20512772;
 //BA.debugLineNum = 20512772;BA.debugLine="LV.notifyItemAdded";
mostCurrent._lv.notifyItemAdded();
RDebugUtils.currentLine=20512773;
 //BA.debugLineNum = 20512773;BA.debugLine="LV.SmoothScrollToPosition(ItemList.Size)";
mostCurrent._lv.SmoothScrollToPosition(mostCurrent._itemlist.getSize());
RDebugUtils.currentLine=20512774;
 //BA.debugLineNum = 20512774;BA.debugLine="End Sub";
return "";
}
public static String  _btnatt_click() throws Exception{
RDebugUtils.currentModule="act_chat";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnatt_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnatt_click", null));}
RDebugUtils.currentLine=21037056;
 //BA.debugLineNum = 21037056;BA.debugLine="Sub Btnatt_Click";
RDebugUtils.currentLine=21037057;
 //BA.debugLineNum = 21037057;BA.debugLine="re.Top = 0";
mostCurrent._re.setTop((int) (0));
RDebugUtils.currentLine=21037058;
 //BA.debugLineNum = 21037058;BA.debugLine="re.SetColorAnimated(1000,Colors.Transparent,Color";
mostCurrent._re.SetColorAnimated((int) (1000),anywheresoftware.b4a.keywords.Common.Colors.Transparent,anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (80),(int) (0),(int) (0),(int) (0)));
RDebugUtils.currentLine=21037059;
 //BA.debugLineNum = 21037059;BA.debugLine="re.Show3(78.5%x,92.5%y+3.5%x,1000)";
mostCurrent._re.Show3(anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (78.5),mostCurrent.activityBA),(int) (anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (92.5),mostCurrent.activityBA)+anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (3.5),mostCurrent.activityBA)),(int) (1000));
RDebugUtils.currentLine=21037060;
 //BA.debugLineNum = 21037060;BA.debugLine="Btnatt.Enabled = False";
mostCurrent._btnatt.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=21037061;
 //BA.debugLineNum = 21037061;BA.debugLine="En";
_en();
RDebugUtils.currentLine=21037062;
 //BA.debugLineNum = 21037062;BA.debugLine="End Sub";
return "";
}
public static String  _en() throws Exception{
RDebugUtils.currentModule="act_chat";
if (Debug.shouldDelegate(mostCurrent.activityBA, "en", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "en", null));}
anywheresoftware.b4a.objects.ConcreteViewWrapper _v = null;
RDebugUtils.currentLine=19791872;
 //BA.debugLineNum = 19791872;BA.debugLine="Sub En";
RDebugUtils.currentLine=19791873;
 //BA.debugLineNum = 19791873;BA.debugLine="For Each V As View In re.Panel.GetAllViewsRecursi";
_v = new anywheresoftware.b4a.objects.ConcreteViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group1 = mostCurrent._re.Panel().GetAllViewsRecursive();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_v.setObject((android.view.View)(group1.Get(index1)));
RDebugUtils.currentLine=19791874;
 //BA.debugLineNum = 19791874;BA.debugLine="V.Enabled = True";
_v.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 }
};
RDebugUtils.currentLine=19791876;
 //BA.debugLineNum = 19791876;BA.debugLine="End Sub";
return "";
}
public static String  _btnsend_click() throws Exception{
RDebugUtils.currentModule="act_chat";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnsend_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnsend_click", null));}
com.it.fome.act_chat._adapter _item = null;
RDebugUtils.currentLine=20185088;
 //BA.debugLineNum = 20185088;BA.debugLine="Sub BtnSend_Click";
RDebugUtils.currentLine=20185089;
 //BA.debugLineNum = 20185089;BA.debugLine="an.InitializeScaleCenter(\"send\",1,1,0.7,0.7,BtnSe";
mostCurrent._an.InitializeScaleCenter(mostCurrent.activityBA,"send",(float) (1),(float) (1),(float) (0.7),(float) (0.7),(android.view.View)(mostCurrent._btnsend.getObject()));
RDebugUtils.currentLine=20185090;
 //BA.debugLineNum = 20185090;BA.debugLine="an.Duration = 100";
mostCurrent._an.setDuration((long) (100));
RDebugUtils.currentLine=20185091;
 //BA.debugLineNum = 20185091;BA.debugLine="an.RepeatCount = 1";
mostCurrent._an.setRepeatCount((int) (1));
RDebugUtils.currentLine=20185092;
 //BA.debugLineNum = 20185092;BA.debugLine="an.RepeatMode = an.REPEAT_REVERSE";
mostCurrent._an.setRepeatMode(mostCurrent._an.REPEAT_REVERSE);
RDebugUtils.currentLine=20185093;
 //BA.debugLineNum = 20185093;BA.debugLine="an.Start(BtnSend)";
mostCurrent._an.Start((android.view.View)(mostCurrent._btnsend.getObject()));
RDebugUtils.currentLine=20185095;
 //BA.debugLineNum = 20185095;BA.debugLine="If EditText.Text <> \"\" Then";
if ((mostCurrent._edittext.getText()).equals("") == false) { 
RDebugUtils.currentLine=20185097;
 //BA.debugLineNum = 20185097;BA.debugLine="Dim Item As Adapter";
_item = new com.it.fome.act_chat._adapter();
RDebugUtils.currentLine=20185098;
 //BA.debugLineNum = 20185098;BA.debugLine="Item.ViewType = MINE";
_item.ViewType /*int*/  = _mine;
RDebugUtils.currentLine=20185099;
 //BA.debugLineNum = 20185099;BA.debugLine="Item.MyText = EditText.Text";
_item.MyText /*String*/  = mostCurrent._edittext.getText();
RDebugUtils.currentLine=20185101;
 //BA.debugLineNum = 20185101;BA.debugLine="ItemList.Add(Item)";
mostCurrent._itemlist.Add((Object)(_item));
RDebugUtils.currentLine=20185102;
 //BA.debugLineNum = 20185102;BA.debugLine="LV.notifyItemAdded";
mostCurrent._lv.notifyItemAdded();
RDebugUtils.currentLine=20185104;
 //BA.debugLineNum = 20185104;BA.debugLine="LV.SmoothScrollToPosition(ItemList.Size)";
mostCurrent._lv.SmoothScrollToPosition(mostCurrent._itemlist.getSize());
RDebugUtils.currentLine=20185105;
 //BA.debugLineNum = 20185105;BA.debugLine="Timer.Enabled = True";
_timer.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=20185107;
 //BA.debugLineNum = 20185107;BA.debugLine="End Sub";
return "";
}
public static String  _dialog_buttonpressed(de.amberhome.materialdialogs.MaterialDialogWrapper _dialog,String _action) throws Exception{
RDebugUtils.currentModule="act_chat";
if (Debug.shouldDelegate(mostCurrent.activityBA, "dialog_buttonpressed", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "dialog_buttonpressed", new Object[] {_dialog,_action}));}
String _cm = "";
int _i = 0;
de.amberhome.materialdialogs.MaterialDialogBuilderWrapper _builder = null;
RDebugUtils.currentLine=22478848;
 //BA.debugLineNum = 22478848;BA.debugLine="Sub Dialog_ButtonPressed (Dialog As MaterialDialog";
RDebugUtils.currentLine=22478849;
 //BA.debugLineNum = 22478849;BA.debugLine="Log(Action)";
anywheresoftware.b4a.keywords.Common.LogImpl("622478849",_action,0);
RDebugUtils.currentLine=22478850;
 //BA.debugLineNum = 22478850;BA.debugLine="Select Action";
switch (BA.switchObjectToInt(_action,"POSITIVE")) {
case 0: {
RDebugUtils.currentLine=22478853;
 //BA.debugLineNum = 22478853;BA.debugLine="Dim cm As String";
_cm = "";
RDebugUtils.currentLine=22478854;
 //BA.debugLineNum = 22478854;BA.debugLine="cursor1 = sql1.ExecQuery(\"SELECT * FROM tbl_coi";
_cursor1.setObject((android.database.Cursor)(_sql1.ExecQuery("SELECT * FROM tbl_coin WHERE userid='"+mostCurrent._userid_t+"' ")));
RDebugUtils.currentLine=22478855;
 //BA.debugLineNum = 22478855;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=22478856;
 //BA.debugLineNum = 22478856;BA.debugLine="For i=0 To cursor1.RowCount-1";
{
final int step7 = 1;
final int limit7 = (int) (_cursor1.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit7 ;_i = _i + step7 ) {
RDebugUtils.currentLine=22478857;
 //BA.debugLineNum = 22478857;BA.debugLine="cursor1.Position=i";
_cursor1.setPosition(_i);
RDebugUtils.currentLine=22478858;
 //BA.debugLineNum = 22478858;BA.debugLine="cm=cursor1.GetString(\"cm\")";
_cm = _cursor1.GetString("cm");
 }
};
RDebugUtils.currentLine=22478862;
 //BA.debugLineNum = 22478862;BA.debugLine="Dim Builder As MaterialDialogBuilder";
_builder = new de.amberhome.materialdialogs.MaterialDialogBuilderWrapper();
RDebugUtils.currentLine=22478863;
 //BA.debugLineNum = 22478863;BA.debugLine="Builder.Initialize(\"Dialog\")";
_builder.Initialize(mostCurrent.activityBA,"Dialog");
RDebugUtils.currentLine=22478864;
 //BA.debugLineNum = 22478864;BA.debugLine="Builder.Title(\"سفارش ممبر\")";
_builder.Title(BA.ObjectToCharSequence("سفارش ممبر"));
RDebugUtils.currentLine=22478865;
 //BA.debugLineNum = 22478865;BA.debugLine="Builder.Content(\"درحال ثبت سفارش ...\")";
_builder.Content(BA.ObjectToCharSequence("درحال ثبت سفارش ..."));
RDebugUtils.currentLine=22478866;
 //BA.debugLineNum = 22478866;BA.debugLine="Builder.Progress(True, 0)";
_builder.Progress(anywheresoftware.b4a.keywords.Common.True,(int) (0));
RDebugUtils.currentLine=22478867;
 //BA.debugLineNum = 22478867;BA.debugLine="Builder.ProgressIndeterminateStyle(True)";
_builder.ProgressIndeterminateStyle(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=22478868;
 //BA.debugLineNum = 22478868;BA.debugLine="progressDialog = Builder.Show";
mostCurrent._progressdialog = _builder.Show();
RDebugUtils.currentLine=22478875;
 //BA.debugLineNum = 22478875;BA.debugLine="If imgchat=\"http://filework.ir/INSTAFOLLOW/api/";
if ((_imgchat).equals("http://filework.ir/INSTAFOLLOW/api/asset/noimage.png")) { 
RDebugUtils.currentLine=22478877;
 //BA.debugLineNum = 22478877;BA.debugLine="reqsef(userid_t,\"2\",chat_id,numfinish,msg_id_s";
_reqsef(mostCurrent._userid_t,"2",_chat_id,_numfinish,mostCurrent._msg_id_select,_us_name,_getname_img(_imgchat));
 }else {
RDebugUtils.currentLine=22478881;
 //BA.debugLineNum = 22478881;BA.debugLine="upload(imgchat,\"\",\"\",\"\")";
_upload(_imgchat,"","","");
 };
 break; }
}
;
RDebugUtils.currentLine=22478890;
 //BA.debugLineNum = 22478890;BA.debugLine="End Sub";
return "";
}
public static String  _reqsef(String _userid,String _types,String _chat_ida,String _finish,String _msg_ida,String _njob,String _picname) throws Exception{
RDebugUtils.currentModule="act_chat";
if (Debug.shouldDelegate(mostCurrent.activityBA, "reqsef", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "reqsef", new Object[] {_userid,_types,_chat_ida,_finish,_msg_ida,_njob,_picname}));}
com.reza.sh.fastnet.Fastnet _prfn = null;
com.reza.sh.fastnet.PostRequestRaper _post = null;
RDebugUtils.currentLine=22151168;
 //BA.debugLineNum = 22151168;BA.debugLine="Sub reqsef(userid As String,types As String,chat_i";
RDebugUtils.currentLine=22151172;
 //BA.debugLineNum = 22151172;BA.debugLine="Dim prfn As PersianFastNetwork";
_prfn = new com.reza.sh.fastnet.Fastnet();
RDebugUtils.currentLine=22151173;
 //BA.debugLineNum = 22151173;BA.debugLine="prfn.initialize(\"prfn\")";
_prfn.initialize(processBA,"prfn");
RDebugUtils.currentLine=22151174;
 //BA.debugLineNum = 22151174;BA.debugLine="Dim post As PostRequest";
_post = new com.reza.sh.fastnet.PostRequestRaper();
RDebugUtils.currentLine=22151175;
 //BA.debugLineNum = 22151175;BA.debugLine="post=prfn.BuildPostQuery(\"http://filework.ir/INST";
_post = _prfn.BuildPostQuery("http://filework.ir/INSTAFOLLOW/api/req.php","sefss");
RDebugUtils.currentLine=22151177;
 //BA.debugLineNum = 22151177;BA.debugLine="post.addHeder(\"User-Agent\",\"Dalvik/1.6.0 (Linux;";
_post.addHeder("User-Agent","Dalvik/1.6.0 (Linux; U; Android 4.4.4; SM-A700FD Build/KTU84P)");
RDebugUtils.currentLine=22151178;
 //BA.debugLineNum = 22151178;BA.debugLine="post.addParametrs(\"req\",\"t_sef\")";
_post.addParametrs("req","t_sef");
RDebugUtils.currentLine=22151180;
 //BA.debugLineNum = 22151180;BA.debugLine="post.addParametrs(\"uid\",\"1\")";
_post.addParametrs("uid","1");
RDebugUtils.currentLine=22151181;
 //BA.debugLineNum = 22151181;BA.debugLine="post.addParametrs(\"types\",types)";
_post.addParametrs("types",_types);
RDebugUtils.currentLine=22151182;
 //BA.debugLineNum = 22151182;BA.debugLine="post.addParametrs(\"userid\",userid)";
_post.addParametrs("userid",_userid);
RDebugUtils.currentLine=22151183;
 //BA.debugLineNum = 22151183;BA.debugLine="post.addParametrs(\"chat_id\",chat_ida)";
_post.addParametrs("chat_id",_chat_ida);
RDebugUtils.currentLine=22151184;
 //BA.debugLineNum = 22151184;BA.debugLine="post.addParametrs(\"finish\",finish)";
_post.addParametrs("finish",_finish);
RDebugUtils.currentLine=22151185;
 //BA.debugLineNum = 22151185;BA.debugLine="post.addParametrs(\"msg_id\",msg_ida)";
_post.addParametrs("msg_id",_msg_ida);
RDebugUtils.currentLine=22151186;
 //BA.debugLineNum = 22151186;BA.debugLine="post.addParametrs(\"njob\",njob)";
_post.addParametrs("njob",_njob);
RDebugUtils.currentLine=22151188;
 //BA.debugLineNum = 22151188;BA.debugLine="post.addParametrs(\"pic\",\"http://filework.ir/INSTA";
_post.addParametrs("pic","http://filework.ir/INSTAFOLLOW/api/telepic/"+_picname);
RDebugUtils.currentLine=22151192;
 //BA.debugLineNum = 22151192;BA.debugLine="post.executRequestAsString";
_post.executRequestAsString();
RDebugUtils.currentLine=22151197;
 //BA.debugLineNum = 22151197;BA.debugLine="End Sub";
return "";
}
public static String  _getname_img(String _str) throws Exception{
RDebugUtils.currentModule="act_chat";
if (Debug.shouldDelegate(mostCurrent.activityBA, "getname_img", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "getname_img", new Object[] {_str}));}
RDebugUtils.currentLine=22413312;
 //BA.debugLineNum = 22413312;BA.debugLine="Sub getname_img(str As String) As String";
RDebugUtils.currentLine=22413313;
 //BA.debugLineNum = 22413313;BA.debugLine="str=str.SubString2(str.IndexOf(\"profile_photos\"),";
_str = _str.substring(_str.indexOf("profile_photos"),_str.length());
RDebugUtils.currentLine=22413314;
 //BA.debugLineNum = 22413314;BA.debugLine="str=str.Replace(\"profile_photos/\",\"\")";
_str = _str.replace("profile_photos/","");
RDebugUtils.currentLine=22413315;
 //BA.debugLineNum = 22413315;BA.debugLine="Return str";
if (true) return _str;
RDebugUtils.currentLine=22413316;
 //BA.debugLineNum = 22413316;BA.debugLine="End Sub";
return "";
}
public static String  _upload(String _filename,String _emailn,String _namen,String _familyn) throws Exception{
RDebugUtils.currentModule="act_chat";
if (Debug.shouldDelegate(mostCurrent.activityBA, "upload", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "upload", new Object[] {_filename,_emailn,_namen,_familyn}));}
RDebugUtils.currentLine=21757952;
 //BA.debugLineNum = 21757952;BA.debugLine="Sub upload(filename As String,emailn As String,nam";
RDebugUtils.currentLine=21757953;
 //BA.debugLineNum = 21757953;BA.debugLine="upl=pr.BuildUploadQuery(\"http://filework.ir/INSTA";
mostCurrent._upl = mostCurrent._pr.BuildUploadQuery("http://filework.ir/INSTAFOLLOW/api/upload.php","t2");
RDebugUtils.currentLine=21757957;
 //BA.debugLineNum = 21757957;BA.debugLine="File.Copy(\"\",filename,File.DirRootExternal,\"new.p";
anywheresoftware.b4a.keywords.Common.File.Copy("",_filename,anywheresoftware.b4a.keywords.Common.File.getDirRootExternal(),"new.png");
RDebugUtils.currentLine=21757958;
 //BA.debugLineNum = 21757958;BA.debugLine="Log(File.DirRootExternal)";
anywheresoftware.b4a.keywords.Common.LogImpl("621757958",anywheresoftware.b4a.keywords.Common.File.getDirRootExternal(),0);
RDebugUtils.currentLine=21757959;
 //BA.debugLineNum = 21757959;BA.debugLine="upl.addMultipartFile(\"uploaded_file\",filename)";
mostCurrent._upl.addMultipartFile("uploaded_file",_filename);
RDebugUtils.currentLine=21757960;
 //BA.debugLineNum = 21757960;BA.debugLine="upl.startUploadAsString";
mostCurrent._upl.startUploadAsString();
RDebugUtils.currentLine=21757961;
 //BA.debugLineNum = 21757961;BA.debugLine="End Sub";
return "";
}
public static String  _dis() throws Exception{
RDebugUtils.currentModule="act_chat";
if (Debug.shouldDelegate(mostCurrent.activityBA, "dis", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "dis", null));}
anywheresoftware.b4a.objects.ConcreteViewWrapper _v = null;
RDebugUtils.currentLine=19726336;
 //BA.debugLineNum = 19726336;BA.debugLine="Sub Dis";
RDebugUtils.currentLine=19726337;
 //BA.debugLineNum = 19726337;BA.debugLine="For Each V As View In re.Panel.GetAllViewsRecursi";
_v = new anywheresoftware.b4a.objects.ConcreteViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group1 = mostCurrent._re.Panel().GetAllViewsRecursive();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_v.setObject((android.view.View)(group1.Get(index1)));
RDebugUtils.currentLine=19726338;
 //BA.debugLineNum = 19726338;BA.debugLine="V.Enabled = False";
_v.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 }
};
RDebugUtils.currentLine=19726340;
 //BA.debugLineNum = 19726340;BA.debugLine="End Sub";
return "";
}
public static String  _edittext_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="act_chat";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittext_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittext_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=20971520;
 //BA.debugLineNum = 20971520;BA.debugLine="Sub EditText_TextChanged (Old As String, New As St";
RDebugUtils.currentLine=20971521;
 //BA.debugLineNum = 20971521;BA.debugLine="If EditText.Text = \"\" Then";
if ((mostCurrent._edittext.getText()).equals("")) { 
RDebugUtils.currentLine=20971522;
 //BA.debugLineNum = 20971522;BA.debugLine="Btnatt.Visible = True";
mostCurrent._btnatt.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=20971523;
 //BA.debugLineNum = 20971523;BA.debugLine="Mic.Visible = True";
mostCurrent._mic.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=20971524;
 //BA.debugLineNum = 20971524;BA.debugLine="BtnSend.Visible = False";
mostCurrent._btnsend.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=20971526;
 //BA.debugLineNum = 20971526;BA.debugLine="If EditText.Text <> \"\" Then";
if ((mostCurrent._edittext.getText()).equals("") == false) { 
RDebugUtils.currentLine=20971527;
 //BA.debugLineNum = 20971527;BA.debugLine="Btnatt.Visible = False";
mostCurrent._btnatt.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=20971528;
 //BA.debugLineNum = 20971528;BA.debugLine="Mic.Visible = False";
mostCurrent._mic.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=20971529;
 //BA.debugLineNum = 20971529;BA.debugLine="BtnSend.Visible = True";
mostCurrent._btnsend.setVisible(anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=20971531;
 //BA.debugLineNum = 20971531;BA.debugLine="End Sub";
return "";
}
public static String  _getmore(long _msid) throws Exception{
RDebugUtils.currentModule="act_chat";
if (Debug.shouldDelegate(mostCurrent.activityBA, "getmore", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "getmore", new Object[] {_msid}));}
RDebugUtils.currentLine=21561344;
 //BA.debugLineNum = 21561344;BA.debugLine="Sub getmore(msid As Long)";
RDebugUtils.currentLine=21561347;
 //BA.debugLineNum = 21561347;BA.debugLine="LogColor(\"get morrrrrrrrrrrrrrrrrrrrrrrrrrrrre \",";
anywheresoftware.b4a.keywords.Common.LogImpl("621561347","get morrrrrrrrrrrrrrrrrrrrrrrrrrrrre ",anywheresoftware.b4a.keywords.Common.Colors.Blue);
RDebugUtils.currentLine=21561348;
 //BA.debugLineNum = 21561348;BA.debugLine="telegs.getChatHistory(chat_id,msid,-1,50,True)";
mostCurrent._telegs.getChatHistory((long)(Double.parseDouble(_chat_id)),_msid,(int) (-1),(int) (50),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=21561352;
 //BA.debugLineNum = 21561352;BA.debugLine="End Sub";
return "";
}
public static String  _hid_click() throws Exception{
RDebugUtils.currentModule="act_chat";
if (Debug.shouldDelegate(mostCurrent.activityBA, "hid_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "hid_click", null));}
RDebugUtils.currentLine=19660800;
 //BA.debugLineNum = 19660800;BA.debugLine="Sub hid_Click";
RDebugUtils.currentLine=19660801;
 //BA.debugLineNum = 19660801;BA.debugLine="re.SetColorAnimated(1500,Colors.ARGB(80,0,0,0),Co";
mostCurrent._re.SetColorAnimated((int) (1500),anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (80),(int) (0),(int) (0),(int) (0)),anywheresoftware.b4a.keywords.Common.Colors.Transparent);
RDebugUtils.currentLine=19660802;
 //BA.debugLineNum = 19660802;BA.debugLine="re.Hide3(78.5%x,92.5%y+3.5%x,400)";
mostCurrent._re.Hide3(anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (78.5),mostCurrent.activityBA),(int) (anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (92.5),mostCurrent.activityBA)+anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (3.5),mostCurrent.activityBA)),(int) (400));
RDebugUtils.currentLine=19660803;
 //BA.debugLineNum = 19660803;BA.debugLine="Btnatt.Enabled = True";
mostCurrent._btnatt.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=19660804;
 //BA.debugLineNum = 19660804;BA.debugLine="Dis";
_dis();
RDebugUtils.currentLine=19660805;
 //BA.debugLineNum = 19660805;BA.debugLine="End Sub";
return "";
}
public static String  _image_click() throws Exception{
RDebugUtils.currentModule="act_chat";
if (Debug.shouldDelegate(mostCurrent.activityBA, "image_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "image_click", null));}
anywheresoftware.b4a.objects.ImageViewWrapper _image = null;
int _i = 0;
RDebugUtils.currentLine=19595264;
 //BA.debugLineNum = 19595264;BA.debugLine="Sub Image_Click";
RDebugUtils.currentLine=19595265;
 //BA.debugLineNum = 19595265;BA.debugLine="Dim Image As ImageView = Sender";
_image = new anywheresoftware.b4a.objects.ImageViewWrapper();
_image.setObject((android.widget.ImageView)(anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA)));
RDebugUtils.currentLine=19595266;
 //BA.debugLineNum = 19595266;BA.debugLine="For i = 0 To 7";
{
final int step2 = 1;
final int limit2 = (int) (7);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=19595267;
 //BA.debugLineNum = 19595267;BA.debugLine="If i = Image.Tag Then";
if (_i==(double)(BA.ObjectToNumber(_image.getTag()))) { 
RDebugUtils.currentLine=19595268;
 //BA.debugLineNum = 19595268;BA.debugLine="If Image.Tag = 7 Then";
if ((_image.getTag()).equals((Object)(7))) { 
RDebugUtils.currentLine=19595269;
 //BA.debugLineNum = 19595269;BA.debugLine="hid_Click";
_hid_click();
 }else {
RDebugUtils.currentLine=19595271;
 //BA.debugLineNum = 19595271;BA.debugLine="re.Hide3(Image.Left+(Image.Width/2),Top+Image.";
mostCurrent._re.Hide3((int) (_image.getLeft()+(_image.getWidth()/(double)2)),(int) (_top+_image.getTop()+(_image.getHeight()/(double)2)),(int) (600));
RDebugUtils.currentLine=19595272;
 //BA.debugLineNum = 19595272;BA.debugLine="Btnatt.Enabled = True";
mostCurrent._btnatt.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=19595273;
 //BA.debugLineNum = 19595273;BA.debugLine="Dis";
_dis();
 };
 };
 }
};
RDebugUtils.currentLine=19595277;
 //BA.debugLineNum = 19595277;BA.debugLine="End Sub";
return "";
}
public static String  _ime_heightchanged(int _newheight,int _oldheight) throws Exception{
RDebugUtils.currentModule="act_chat";
if (Debug.shouldDelegate(mostCurrent.activityBA, "ime_heightchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "ime_heightchanged", new Object[] {_newheight,_oldheight}));}
RDebugUtils.currentLine=20905984;
 //BA.debugLineNum = 20905984;BA.debugLine="Sub IME_HeightChanged(NewHeight As Int, OldHeight";
RDebugUtils.currentLine=20905985;
 //BA.debugLineNum = 20905985;BA.debugLine="Pan.Top = NewHeight - Pan.Height";
mostCurrent._pan.setTop((int) (_newheight-mostCurrent._pan.getHeight()));
RDebugUtils.currentLine=20905986;
 //BA.debugLineNum = 20905986;BA.debugLine="LV.Height = NewHeight - 56dip-10%y";
mostCurrent._lv.setHeight((int) (_newheight-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (56))-anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (10),mostCurrent.activityBA)));
RDebugUtils.currentLine=20905987;
 //BA.debugLineNum = 20905987;BA.debugLine="End Sub";
return "";
}
public static int  _lv_getitemcount() throws Exception{
RDebugUtils.currentModule="act_chat";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lv_getitemcount", false))
	 {return ((Integer) Debug.delegate(mostCurrent.activityBA, "lv_getitemcount", null));}
RDebugUtils.currentLine=19988480;
 //BA.debugLineNum = 19988480;BA.debugLine="Sub LV_GetItemCount As Int 								        '💯 Ite";
RDebugUtils.currentLine=19988481;
 //BA.debugLineNum = 19988481;BA.debugLine="Return ItemList.Size";
if (true) return mostCurrent._itemlist.getSize();
RDebugUtils.currentLine=19988482;
 //BA.debugLineNum = 19988482;BA.debugLine="End Sub";
return 0;
}
public static int  _lv_getitemviewtype(int _position) throws Exception{
RDebugUtils.currentModule="act_chat";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lv_getitemviewtype", false))
	 {return ((Integer) Debug.delegate(mostCurrent.activityBA, "lv_getitemviewtype", new Object[] {_position}));}
com.it.fome.act_chat._adapter _item = null;
RDebugUtils.currentLine=20054016;
 //BA.debugLineNum = 20054016;BA.debugLine="Sub LV_GetItemViewType (Position As Int) As Int";
RDebugUtils.currentLine=20054017;
 //BA.debugLineNum = 20054017;BA.debugLine="Dim Item = ItemList.Get(Position) As Adapter";
_item = (com.it.fome.act_chat._adapter)(mostCurrent._itemlist.Get(_position));
RDebugUtils.currentLine=20054018;
 //BA.debugLineNum = 20054018;BA.debugLine="Return Item.ViewType";
if (true) return _item.ViewType /*int*/ ;
RDebugUtils.currentLine=20054019;
 //BA.debugLineNum = 20054019;BA.debugLine="End Sub";
return 0;
}
public static String  _lv_itemclick(anywheresoftware.b4a.objects.PanelWrapper _clickeditem,int _position) throws Exception{
RDebugUtils.currentModule="act_chat";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lv_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "lv_itemclick", new Object[] {_clickeditem,_position}));}
com.it.fome.act_chat._adapter _item = null;
String _str_c = "";
de.amberhome.materialdialogs.MaterialDialogBuilderWrapper _builder = null;
RDebugUtils.currentLine=20119552;
 //BA.debugLineNum = 20119552;BA.debugLine="Sub LV_ItemClick (ClickedItem As Panel, Position A";
RDebugUtils.currentLine=20119553;
 //BA.debugLineNum = 20119553;BA.debugLine="Dim Item = ItemList.Get(Position) As Adapter";
_item = (com.it.fome.act_chat._adapter)(mostCurrent._itemlist.Get(_position));
RDebugUtils.currentLine=20119554;
 //BA.debugLineNum = 20119554;BA.debugLine="msg_id_select=Item.msg_id";
mostCurrent._msg_id_select = _item.msg_id /*String*/ ;
RDebugUtils.currentLine=20119555;
 //BA.debugLineNum = 20119555;BA.debugLine="Log(\"msg id : \"&Item.msg_id)";
anywheresoftware.b4a.keywords.Common.LogImpl("620119555","msg id : "+_item.msg_id /*String*/ ,0);
RDebugUtils.currentLine=20119556;
 //BA.debugLineNum = 20119556;BA.debugLine="telegs.Viewmsg(chat_id,Array As Long(Item.msg_id)";
mostCurrent._telegs.Viewmsg((long)(Double.parseDouble(_chat_id)),new long[]{(long)(Double.parseDouble(_item.msg_id /*String*/ ))});
RDebugUtils.currentLine=20119557;
 //BA.debugLineNum = 20119557;BA.debugLine="telegs.Getingmsg(chat_id,Array As Long(Item.msg_i";
mostCurrent._telegs.Getingmsg((long)(Double.parseDouble(_chat_id)),new long[]{(long)(Double.parseDouble(_item.msg_id /*String*/ ))},(int) (0),(int) (0),_us_name);
RDebugUtils.currentLine=20119558;
 //BA.debugLineNum = 20119558;BA.debugLine="Dim str_c As String";
_str_c = "";
RDebugUtils.currentLine=20119559;
 //BA.debugLineNum = 20119559;BA.debugLine="str_c=\"افزایش\"&\" \"&numfinish&\" بازدید\"";
_str_c = "افزایش"+" "+_numfinish+" بازدید";
RDebugUtils.currentLine=20119560;
 //BA.debugLineNum = 20119560;BA.debugLine="Dim Builder As MaterialDialogBuilder";
_builder = new de.amberhome.materialdialogs.MaterialDialogBuilderWrapper();
RDebugUtils.currentLine=20119561;
 //BA.debugLineNum = 20119561;BA.debugLine="Builder.Initialize(\"Dialog\")";
_builder.Initialize(mostCurrent.activityBA,"Dialog");
RDebugUtils.currentLine=20119562;
 //BA.debugLineNum = 20119562;BA.debugLine="Builder.Title(\" سفارش بازدید\")";
_builder.Title(BA.ObjectToCharSequence(" سفارش بازدید"));
RDebugUtils.currentLine=20119563;
 //BA.debugLineNum = 20119563;BA.debugLine="Builder.Content(str_c)";
_builder.Content(BA.ObjectToCharSequence(_str_c));
RDebugUtils.currentLine=20119564;
 //BA.debugLineNum = 20119564;BA.debugLine="Builder.ItemsCallback";
_builder.ItemsCallback();
RDebugUtils.currentLine=20119565;
 //BA.debugLineNum = 20119565;BA.debugLine="Builder.NegativeText(\"بیخیال\")";
_builder.NegativeText(BA.ObjectToCharSequence("بیخیال"));
RDebugUtils.currentLine=20119566;
 //BA.debugLineNum = 20119566;BA.debugLine="Builder.PositiveText(\"ثبت سفارش\")";
_builder.PositiveText(BA.ObjectToCharSequence("ثبت سفارش"));
RDebugUtils.currentLine=20119567;
 //BA.debugLineNum = 20119567;BA.debugLine="Builder.PositiveColor(0xFF522E52)";
_builder.PositiveColor((int) (0xff522e52));
RDebugUtils.currentLine=20119568;
 //BA.debugLineNum = 20119568;BA.debugLine="Builder.Show";
_builder.Show();
RDebugUtils.currentLine=20119571;
 //BA.debugLineNum = 20119571;BA.debugLine="End Sub";
return "";
}
public static String  _lv_onbindviewholder(anywheresoftware.b4a.objects.PanelWrapper _parent,int _position) throws Exception{
RDebugUtils.currentModule="act_chat";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lv_onbindviewholder", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "lv_onbindviewholder", new Object[] {_parent,_position}));}
com.it.fome.act_chat._adapter _item = null;
anywheresoftware.b4a.objects.PanelWrapper _pan_s = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl_txt = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp = null;
int _i = 0;
int _i2 = 0;
anywheresoftware.b4a.objects.PanelWrapper _pnl_img = null;
anywheresoftware.b4a.objects.ImageViewWrapper _img_post = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bt = null;
RDebugUtils.currentLine=19922944;
 //BA.debugLineNum = 19922944;BA.debugLine="Sub LV_onBindViewHolder (Parent As Panel, Position";
RDebugUtils.currentLine=19922945;
 //BA.debugLineNum = 19922945;BA.debugLine="Dim Item = ItemList.Get(Position) As Adapter";
_item = (com.it.fome.act_chat._adapter)(mostCurrent._itemlist.Get(_position));
RDebugUtils.currentLine=19922946;
 //BA.debugLineNum = 19922946;BA.debugLine="Parent.Height=0";
_parent.setHeight((int) (0));
RDebugUtils.currentLine=19922947;
 //BA.debugLineNum = 19922947;BA.debugLine="Parent.Color=Colors.Transparent";
_parent.setColor(anywheresoftware.b4a.keywords.Common.Colors.Transparent);
RDebugUtils.currentLine=19922948;
 //BA.debugLineNum = 19922948;BA.debugLine="Parent.RemoveAllViews";
_parent.RemoveAllViews();
RDebugUtils.currentLine=19922949;
 //BA.debugLineNum = 19922949;BA.debugLine="Select Item.ViewType";
switch (BA.switchObjectToInt(_item.ViewType /*int*/ ,_mine,_their,_minest,_minest2,_videome)) {
case 0: {
RDebugUtils.currentLine=19922952;
 //BA.debugLineNum = 19922952;BA.debugLine="LogColor(\"msg me\",Colors.Red)";
anywheresoftware.b4a.keywords.Common.LogImpl("619922952","msg me",anywheresoftware.b4a.keywords.Common.Colors.Red);
RDebugUtils.currentLine=19922953;
 //BA.debugLineNum = 19922953;BA.debugLine="Dim Pan_s As Panel:Pan_s.Initialize(\"Pan_s\")";
_pan_s = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=19922953;
 //BA.debugLineNum = 19922953;BA.debugLine="Dim Pan_s As Panel:Pan_s.Initialize(\"Pan_s\")";
_pan_s.Initialize(mostCurrent.activityBA,"Pan_s");
RDebugUtils.currentLine=19922954;
 //BA.debugLineNum = 19922954;BA.debugLine="Pan_s.Color=Colors.Transparent";
_pan_s.setColor(anywheresoftware.b4a.keywords.Common.Colors.Transparent);
RDebugUtils.currentLine=19922955;
 //BA.debugLineNum = 19922955;BA.debugLine="Parent.AddView(Pan_s,0,1%x,Parent.Width,-2)";
_parent.AddView((android.view.View)(_pan_s.getObject()),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (1),mostCurrent.activityBA),_parent.getWidth(),(int) (-2));
RDebugUtils.currentLine=19922957;
 //BA.debugLineNum = 19922957;BA.debugLine="Dim lbl_txt As Label";
_lbl_txt = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=19922958;
 //BA.debugLineNum = 19922958;BA.debugLine="lbl_txt.Initialize(\"lbl_txt\")";
_lbl_txt.Initialize(mostCurrent.activityBA,"lbl_txt");
RDebugUtils.currentLine=19922959;
 //BA.debugLineNum = 19922959;BA.debugLine="lbl_txt.TextColor = Colors.Black : lbl_txt.Text";
_lbl_txt.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=19922959;
 //BA.debugLineNum = 19922959;BA.debugLine="lbl_txt.TextColor = Colors.Black : lbl_txt.Text";
_lbl_txt.setTextSize((float) (18));
RDebugUtils.currentLine=19922960;
 //BA.debugLineNum = 19922960;BA.debugLine="lbl_txt.Typeface=Typeface.DEFAULT";
_lbl_txt.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=19922961;
 //BA.debugLineNum = 19922961;BA.debugLine="Pan_s.AddView(lbl_txt,5dip,5dip,70%x,-2)";
_pan_s.AddView((android.view.View)(_lbl_txt.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (5)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (5)),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (70),mostCurrent.activityBA),(int) (-2));
RDebugUtils.currentLine=19922965;
 //BA.debugLineNum = 19922965;BA.debugLine="SetNinePatchDrawable(lbl_txt, \"msging\")";
_setninepatchdrawable((anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_lbl_txt.getObject())),"msging");
RDebugUtils.currentLine=19922967;
 //BA.debugLineNum = 19922967;BA.debugLine="lbl_txt.Text=\" \"&Item.MyText";
_lbl_txt.setText(BA.ObjectToCharSequence(" "+_item.MyText /*String*/ ));
RDebugUtils.currentLine=19922971;
 //BA.debugLineNum = 19922971;BA.debugLine="Dim Canvas As Canvas";
mostCurrent._canvas = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
RDebugUtils.currentLine=19922972;
 //BA.debugLineNum = 19922972;BA.debugLine="Dim bmp As Bitmap";
_bmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=19922973;
 //BA.debugLineNum = 19922973;BA.debugLine="bmp.InitializeMutable(1dip,1dip)";
_bmp.InitializeMutable(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (1)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (1)));
RDebugUtils.currentLine=19922974;
 //BA.debugLineNum = 19922974;BA.debugLine="Canvas.Initialize2(bmp)";
mostCurrent._canvas.Initialize2((android.graphics.Bitmap)(_bmp.getObject()));
RDebugUtils.currentLine=19922976;
 //BA.debugLineNum = 19922976;BA.debugLine="Dim i As Int = Canvas.MeasureStringWidth(Item.M";
_i = (int) (mostCurrent._canvas.MeasureStringWidth(_item.MyText /*String*/ ,(android.graphics.Typeface)(mostCurrent._font.getObject()),(float) (16.0f)));
RDebugUtils.currentLine=19922978;
 //BA.debugLineNum = 19922978;BA.debugLine="DateTime.TimeFormat = \"HH:mm\"";
anywheresoftware.b4a.keywords.Common.DateTime.setTimeFormat("HH:mm");
RDebugUtils.currentLine=19922981;
 //BA.debugLineNum = 19922981;BA.debugLine="If (i > 80%x) Then";
if ((_i>anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (80),mostCurrent.activityBA))) { 
RDebugUtils.currentLine=19922982;
 //BA.debugLineNum = 19922982;BA.debugLine="lbl_txt.Width = 90%x";
_lbl_txt.setWidth(anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (90),mostCurrent.activityBA));
RDebugUtils.currentLine=19922983;
 //BA.debugLineNum = 19922983;BA.debugLine="lbl_txt.Left = 5%x";
_lbl_txt.setLeft(anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA));
 }else {
RDebugUtils.currentLine=19922985;
 //BA.debugLineNum = 19922985;BA.debugLine="lbl_txt.Width = i + 38dip";
_lbl_txt.setWidth((int) (_i+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (38))));
RDebugUtils.currentLine=19922986;
 //BA.debugLineNum = 19922986;BA.debugLine="If lbl_txt.Width > 90%x Then lbl_txt.Width = 9";
if (_lbl_txt.getWidth()>anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (90),mostCurrent.activityBA)) { 
_lbl_txt.setWidth(anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (90),mostCurrent.activityBA));};
RDebugUtils.currentLine=19922987;
 //BA.debugLineNum = 19922987;BA.debugLine="lbl_txt.Left = (95%x - lbl_txt.Width)";
_lbl_txt.setLeft((int) ((anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (95),mostCurrent.activityBA)-_lbl_txt.getWidth())));
 };
RDebugUtils.currentLine=19922990;
 //BA.debugLineNum = 19922990;BA.debugLine="lbl_txt.Height = art(Item.MyText,lbl_txt)+10dip";
_lbl_txt.setHeight((int) (_art(_item.MyText /*String*/ ,_lbl_txt)+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (10))+anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (2),mostCurrent.activityBA)));
RDebugUtils.currentLine=19922991;
 //BA.debugLineNum = 19922991;BA.debugLine="Parent.Height = lbl_txt.Height+2.5%y";
_parent.setHeight((int) (_lbl_txt.getHeight()+anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (2.5),mostCurrent.activityBA)));
 break; }
case 1: {
RDebugUtils.currentLine=19922996;
 //BA.debugLineNum = 19922996;BA.debugLine="Dim Pan_s As Panel:Pan_s.Initialize(\"Pan_s\")";
_pan_s = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=19922996;
 //BA.debugLineNum = 19922996;BA.debugLine="Dim Pan_s As Panel:Pan_s.Initialize(\"Pan_s\")";
_pan_s.Initialize(mostCurrent.activityBA,"Pan_s");
RDebugUtils.currentLine=19922997;
 //BA.debugLineNum = 19922997;BA.debugLine="Pan_s.Color=Colors.Transparent";
_pan_s.setColor(anywheresoftware.b4a.keywords.Common.Colors.Transparent);
RDebugUtils.currentLine=19922998;
 //BA.debugLineNum = 19922998;BA.debugLine="Parent.AddView(Pan_s,0,1%x,Parent.Width,-2)";
_parent.AddView((android.view.View)(_pan_s.getObject()),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (1),mostCurrent.activityBA),_parent.getWidth(),(int) (-2));
RDebugUtils.currentLine=19923000;
 //BA.debugLineNum = 19923000;BA.debugLine="Dim lbl_txt As Label";
_lbl_txt = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=19923001;
 //BA.debugLineNum = 19923001;BA.debugLine="lbl_txt.Initialize(\"lbl_txt\")";
_lbl_txt.Initialize(mostCurrent.activityBA,"lbl_txt");
RDebugUtils.currentLine=19923002;
 //BA.debugLineNum = 19923002;BA.debugLine="lbl_txt.TextColor = Colors.Black : lbl_txt.Text";
_lbl_txt.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=19923002;
 //BA.debugLineNum = 19923002;BA.debugLine="lbl_txt.TextColor = Colors.Black : lbl_txt.Text";
_lbl_txt.setTextSize((float) (18));
RDebugUtils.currentLine=19923003;
 //BA.debugLineNum = 19923003;BA.debugLine="lbl_txt.Typeface=Typeface.DEFAULT";
_lbl_txt.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=19923004;
 //BA.debugLineNum = 19923004;BA.debugLine="Pan_s.AddView(lbl_txt,5dip,5dip,10%x,-2)";
_pan_s.AddView((android.view.View)(_lbl_txt.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (5)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (5)),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA),(int) (-2));
RDebugUtils.currentLine=19923007;
 //BA.debugLineNum = 19923007;BA.debugLine="SetNinePatchDrawable(lbl_txt, \"msg_in_7_9\")";
_setninepatchdrawable((anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_lbl_txt.getObject())),"msg_in_7_9");
RDebugUtils.currentLine=19923011;
 //BA.debugLineNum = 19923011;BA.debugLine="Dim Canvas As Canvas";
mostCurrent._canvas = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
RDebugUtils.currentLine=19923012;
 //BA.debugLineNum = 19923012;BA.debugLine="Dim bmp As Bitmap";
_bmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=19923013;
 //BA.debugLineNum = 19923013;BA.debugLine="bmp.InitializeMutable(1dip,1dip)";
_bmp.InitializeMutable(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (1)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (1)));
RDebugUtils.currentLine=19923014;
 //BA.debugLineNum = 19923014;BA.debugLine="Canvas.Initialize2(bmp)";
mostCurrent._canvas.Initialize2((android.graphics.Bitmap)(_bmp.getObject()));
RDebugUtils.currentLine=19923015;
 //BA.debugLineNum = 19923015;BA.debugLine="Dim i2 As Int = Canvas.MeasureStringWidth(Item.";
_i2 = (int) (mostCurrent._canvas.MeasureStringWidth(_item.TheirText /*String*/ ,(android.graphics.Typeface)(mostCurrent._font.getObject()),(float) (20.0f)));
RDebugUtils.currentLine=19923016;
 //BA.debugLineNum = 19923016;BA.debugLine="lbl_txt.Text = \"    \"&Item.TheirText";
_lbl_txt.setText(BA.ObjectToCharSequence("    "+_item.TheirText /*String*/ ));
RDebugUtils.currentLine=19923018;
 //BA.debugLineNum = 19923018;BA.debugLine="DateTime.TimeFormat = \"HH:mm\"";
anywheresoftware.b4a.keywords.Common.DateTime.setTimeFormat("HH:mm");
RDebugUtils.currentLine=19923021;
 //BA.debugLineNum = 19923021;BA.debugLine="If (i2 > 80%x) Then";
if ((_i2>anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (80),mostCurrent.activityBA))) { 
RDebugUtils.currentLine=19923022;
 //BA.debugLineNum = 19923022;BA.debugLine="lbl_txt.Width = 95%x";
_lbl_txt.setWidth(anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (95),mostCurrent.activityBA));
RDebugUtils.currentLine=19923023;
 //BA.debugLineNum = 19923023;BA.debugLine="lbl_txt.Left = 1%x";
_lbl_txt.setLeft(anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (1),mostCurrent.activityBA));
 }else {
RDebugUtils.currentLine=19923025;
 //BA.debugLineNum = 19923025;BA.debugLine="lbl_txt.Width = i2 + 40dip";
_lbl_txt.setWidth((int) (_i2+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (40))));
RDebugUtils.currentLine=19923026;
 //BA.debugLineNum = 19923026;BA.debugLine="If lbl_txt.Width > 90%x Then lbl_txt.Width = 9";
if (_lbl_txt.getWidth()>anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (90),mostCurrent.activityBA)) { 
_lbl_txt.setWidth(anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (95),mostCurrent.activityBA));};
RDebugUtils.currentLine=19923027;
 //BA.debugLineNum = 19923027;BA.debugLine="lbl_txt.Left = 1%x";
_lbl_txt.setLeft(anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (1),mostCurrent.activityBA));
 };
RDebugUtils.currentLine=19923030;
 //BA.debugLineNum = 19923030;BA.debugLine="lbl_txt.Height = art(Item.TheirText,lbl_txt)+10";
_lbl_txt.setHeight((int) (_art(_item.TheirText /*String*/ ,_lbl_txt)+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (10))+anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (2),mostCurrent.activityBA)));
RDebugUtils.currentLine=19923031;
 //BA.debugLineNum = 19923031;BA.debugLine="Parent.Height = lbl_txt.Height+2.5%y";
_parent.setHeight((int) (_lbl_txt.getHeight()+anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (2.5),mostCurrent.activityBA)));
 break; }
case 2: {
RDebugUtils.currentLine=19923035;
 //BA.debugLineNum = 19923035;BA.debugLine="LogColor(\"img\",Colors.Red)";
anywheresoftware.b4a.keywords.Common.LogImpl("619923035","img",anywheresoftware.b4a.keywords.Common.Colors.Red);
RDebugUtils.currentLine=19923036;
 //BA.debugLineNum = 19923036;BA.debugLine="Dim Pan_s As Panel:Pan_s.Initialize(\"Pan_s\")";
_pan_s = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=19923036;
 //BA.debugLineNum = 19923036;BA.debugLine="Dim Pan_s As Panel:Pan_s.Initialize(\"Pan_s\")";
_pan_s.Initialize(mostCurrent.activityBA,"Pan_s");
RDebugUtils.currentLine=19923037;
 //BA.debugLineNum = 19923037;BA.debugLine="Pan_s.Color=Colors.Transparent";
_pan_s.setColor(anywheresoftware.b4a.keywords.Common.Colors.Transparent);
RDebugUtils.currentLine=19923038;
 //BA.debugLineNum = 19923038;BA.debugLine="Parent.AddView(Pan_s,3%x,1%x,Parent.Width-15%x,";
_parent.AddView((android.view.View)(_pan_s.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (3),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (1),mostCurrent.activityBA),(int) (_parent.getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (15),mostCurrent.activityBA)),(int) (-2));
RDebugUtils.currentLine=19923040;
 //BA.debugLineNum = 19923040;BA.debugLine="Dim pnl_img As Panel";
_pnl_img = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=19923041;
 //BA.debugLineNum = 19923041;BA.debugLine="pnl_img.Initialize(\"pnl_img\")";
_pnl_img.Initialize(mostCurrent.activityBA,"pnl_img");
RDebugUtils.currentLine=19923042;
 //BA.debugLineNum = 19923042;BA.debugLine="pnl_img.Color=Colors.White";
_pnl_img.setColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=19923043;
 //BA.debugLineNum = 19923043;BA.debugLine="Pan_s.AddView(pnl_img,2dip,2dip,-2,1dip)";
_pan_s.AddView((android.view.View)(_pnl_img.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (2)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (2)),(int) (-2),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (1)));
RDebugUtils.currentLine=19923045;
 //BA.debugLineNum = 19923045;BA.debugLine="Dim img_post As ImageView";
_img_post = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=19923046;
 //BA.debugLineNum = 19923046;BA.debugLine="img_post.Initialize(\"img_post\")";
_img_post.Initialize(mostCurrent.activityBA,"img_post");
RDebugUtils.currentLine=19923047;
 //BA.debugLineNum = 19923047;BA.debugLine="img_post.Gravity=Gravity.FILL";
_img_post.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.FILL);
RDebugUtils.currentLine=19923048;
 //BA.debugLineNum = 19923048;BA.debugLine="pnl_img.AddView(img_post,0,0,-2,-2)";
_pnl_img.AddView((android.view.View)(_img_post.getObject()),(int) (0),(int) (0),(int) (-2),(int) (-2));
RDebugUtils.currentLine=19923050;
 //BA.debugLineNum = 19923050;BA.debugLine="Dim lbl_txt As Label";
_lbl_txt = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=19923051;
 //BA.debugLineNum = 19923051;BA.debugLine="lbl_txt.Initialize(\"lbl_txt\")";
_lbl_txt.Initialize(mostCurrent.activityBA,"lbl_txt");
RDebugUtils.currentLine=19923052;
 //BA.debugLineNum = 19923052;BA.debugLine="lbl_txt.TextColor = Colors.Black : lbl_txt.Text";
_lbl_txt.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=19923052;
 //BA.debugLineNum = 19923052;BA.debugLine="lbl_txt.TextColor = Colors.Black : lbl_txt.Text";
_lbl_txt.setTextSize((float) (18));
RDebugUtils.currentLine=19923053;
 //BA.debugLineNum = 19923053;BA.debugLine="lbl_txt.Typeface=Typeface.DEFAULT";
_lbl_txt.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=19923054;
 //BA.debugLineNum = 19923054;BA.debugLine="pnl_img.AddView(lbl_txt,5dip,img_post.Top+img_p";
_pnl_img.AddView((android.view.View)(_lbl_txt.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (5)),(int) (_img_post.getTop()+_img_post.getHeight()+anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (4),mostCurrent.activityBA)),(int) (-2),(int) (-2));
RDebugUtils.currentLine=19923056;
 //BA.debugLineNum = 19923056;BA.debugLine="SetNinePatchDrawable(pnl_img, \"msg_in_2_photo_9";
_setninepatchdrawable((anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_pnl_img.getObject())),"msg_in_2_photo_9");
RDebugUtils.currentLine=19923058;
 //BA.debugLineNum = 19923058;BA.debugLine="If Item.img_isdwonload=\"true\" Then";
if ((_item.img_isdwonload /*String*/ ).equals("true")) { 
RDebugUtils.currentLine=19923060;
 //BA.debugLineNum = 19923060;BA.debugLine="img_post.Bitmap = LoadBitmap(\"\",Item.img_my)";
_img_post.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap("",_item.img_my /*String*/ ).getObject()));
RDebugUtils.currentLine=19923062;
 //BA.debugLineNum = 19923062;BA.debugLine="Log(\"img : \"&Item.img_my)";
anywheresoftware.b4a.keywords.Common.LogImpl("619923062","img : "+_item.img_my /*String*/ ,0);
RDebugUtils.currentLine=19923063;
 //BA.debugLineNum = 19923063;BA.debugLine="Log(\"img dl : \"&Item.img_isdwonload)";
anywheresoftware.b4a.keywords.Common.LogImpl("619923063","img dl : "+_item.img_isdwonload /*String*/ ,0);
RDebugUtils.currentLine=19923064;
 //BA.debugLineNum = 19923064;BA.debugLine="Dim bt As Bitmap";
_bt = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=19923065;
 //BA.debugLineNum = 19923065;BA.debugLine="bt.Initialize(\"\",Item.img_my)";
_bt.Initialize("",_item.img_my /*String*/ );
RDebugUtils.currentLine=19923066;
 //BA.debugLineNum = 19923066;BA.debugLine="Log(bt.Scale)";
anywheresoftware.b4a.keywords.Common.LogImpl("619923066",BA.NumberToString(_bt.getScale()),0);
RDebugUtils.currentLine=19923071;
 //BA.debugLineNum = 19923071;BA.debugLine="If bt.Width>90%x Then";
if (_bt.getWidth()>anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (90),mostCurrent.activityBA)) { 
RDebugUtils.currentLine=19923072;
 //BA.debugLineNum = 19923072;BA.debugLine="pnl_img.Width=70%x";
_pnl_img.setWidth(anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (70),mostCurrent.activityBA));
 }else {
RDebugUtils.currentLine=19923075;
 //BA.debugLineNum = 19923075;BA.debugLine="pnl_img.Width=bt.Width/1.5";
_pnl_img.setWidth((int) (_bt.getWidth()/(double)1.5));
 };
RDebugUtils.currentLine=19923079;
 //BA.debugLineNum = 19923079;BA.debugLine="pnl_img.Height=bt.Height/1.5";
_pnl_img.setHeight((int) (_bt.getHeight()/(double)1.5));
RDebugUtils.currentLine=19923080;
 //BA.debugLineNum = 19923080;BA.debugLine="img_post.SetLayout(1%x,1%x,pnl_img.Width-2%x,p";
_img_post.SetLayout(anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (1),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (1),mostCurrent.activityBA),(int) (_pnl_img.getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (2),mostCurrent.activityBA)),(int) (_pnl_img.getHeight()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (2),mostCurrent.activityBA)));
 }else {
RDebugUtils.currentLine=19923084;
 //BA.debugLineNum = 19923084;BA.debugLine="Glide.Load(File.DirAssets,\"lazyloader.gif\").Fi";
mostCurrent._glide.Load(mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"lazyloader.gif").FitCenter().Into(_img_post);
RDebugUtils.currentLine=19923085;
 //BA.debugLineNum = 19923085;BA.debugLine="pnl_img.Width=40%x";
_pnl_img.setWidth(anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (40),mostCurrent.activityBA));
RDebugUtils.currentLine=19923086;
 //BA.debugLineNum = 19923086;BA.debugLine="pnl_img.Height=40%x";
_pnl_img.setHeight(anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (40),mostCurrent.activityBA));
RDebugUtils.currentLine=19923087;
 //BA.debugLineNum = 19923087;BA.debugLine="LogColor(\"img nist $ download\",Colors.Green)";
anywheresoftware.b4a.keywords.Common.LogImpl("619923087","img nist $ download",anywheresoftware.b4a.keywords.Common.Colors.Green);
RDebugUtils.currentLine=19923088;
 //BA.debugLineNum = 19923088;BA.debugLine="telegs.downloadFile(Item.img_id)";
mostCurrent._telegs.downloadFile((int)(Double.parseDouble(_item.img_id /*String*/ )));
RDebugUtils.currentLine=19923089;
 //BA.debugLineNum = 19923089;BA.debugLine="list_dl=Position";
_list_dl = BA.NumberToString(_position);
 };
RDebugUtils.currentLine=19923092;
 //BA.debugLineNum = 19923092;BA.debugLine="If Item.caption_topmsg.Length>0 Then";
if (_item.caption_topmsg /*String*/ .length()>0) { 
RDebugUtils.currentLine=19923094;
 //BA.debugLineNum = 19923094;BA.debugLine="Log(\"caption : \"&Item.caption_topmsg)";
anywheresoftware.b4a.keywords.Common.LogImpl("619923094","caption : "+_item.caption_topmsg /*String*/ ,0);
RDebugUtils.currentLine=19923096;
 //BA.debugLineNum = 19923096;BA.debugLine="Dim Canvas As Canvas";
mostCurrent._canvas = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
RDebugUtils.currentLine=19923097;
 //BA.debugLineNum = 19923097;BA.debugLine="Dim bmp As Bitmap";
_bmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=19923098;
 //BA.debugLineNum = 19923098;BA.debugLine="bmp.InitializeMutable(1dip,1dip)";
_bmp.InitializeMutable(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (1)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (1)));
RDebugUtils.currentLine=19923099;
 //BA.debugLineNum = 19923099;BA.debugLine="Canvas.Initialize2(bmp)";
mostCurrent._canvas.Initialize2((android.graphics.Bitmap)(_bmp.getObject()));
RDebugUtils.currentLine=19923100;
 //BA.debugLineNum = 19923100;BA.debugLine="Dim i2 As Int = Canvas.MeasureStringWidth(Item";
_i2 = (int) (mostCurrent._canvas.MeasureStringWidth(_item.caption_topmsg /*String*/ ,(android.graphics.Typeface)(mostCurrent._font.getObject()),(float) (16.0f)));
RDebugUtils.currentLine=19923101;
 //BA.debugLineNum = 19923101;BA.debugLine="lbl_txt.Text = Item.caption_topmsg";
_lbl_txt.setText(BA.ObjectToCharSequence(_item.caption_topmsg /*String*/ ));
RDebugUtils.currentLine=19923103;
 //BA.debugLineNum = 19923103;BA.debugLine="DateTime.TimeFormat = \"HH:mm\"";
anywheresoftware.b4a.keywords.Common.DateTime.setTimeFormat("HH:mm");
RDebugUtils.currentLine=19923106;
 //BA.debugLineNum = 19923106;BA.debugLine="If (i2 > pnl_img.Width) Then";
if ((_i2>_pnl_img.getWidth())) { 
RDebugUtils.currentLine=19923107;
 //BA.debugLineNum = 19923107;BA.debugLine="lbl_txt.Width = pnl_img.Width-5%x";
_lbl_txt.setWidth((int) (_pnl_img.getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA)));
RDebugUtils.currentLine=19923108;
 //BA.debugLineNum = 19923108;BA.debugLine="lbl_txt.Left = 0";
_lbl_txt.setLeft((int) (0));
 }else {
RDebugUtils.currentLine=19923110;
 //BA.debugLineNum = 19923110;BA.debugLine="lbl_txt.Width = pnl_img.Height-5%x";
_lbl_txt.setWidth((int) (_pnl_img.getHeight()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA)));
RDebugUtils.currentLine=19923111;
 //BA.debugLineNum = 19923111;BA.debugLine="If lbl_txt.Width > pnl_img.Width-5%x Then lbl";
if (_lbl_txt.getWidth()>_pnl_img.getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA)) { 
_lbl_txt.setWidth((int) (_pnl_img.getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA)));};
RDebugUtils.currentLine=19923112;
 //BA.debugLineNum = 19923112;BA.debugLine="lbl_txt.Left = 0";
_lbl_txt.setLeft((int) (0));
 };
RDebugUtils.currentLine=19923114;
 //BA.debugLineNum = 19923114;BA.debugLine="lbl_txt.Top=pnl_img.Height+4dip";
_lbl_txt.setTop((int) (_pnl_img.getHeight()+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (4))));
RDebugUtils.currentLine=19923115;
 //BA.debugLineNum = 19923115;BA.debugLine="lbl_txt.Height = art(Item.caption_topmsg,lbl_t";
_lbl_txt.setHeight((int) (_art(_item.caption_topmsg /*String*/ ,_lbl_txt)+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (10))+anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (2),mostCurrent.activityBA)));
RDebugUtils.currentLine=19923116;
 //BA.debugLineNum = 19923116;BA.debugLine="pnl_img.Height=pnl_img.Height+lbl_txt.Height";
_pnl_img.setHeight((int) (_pnl_img.getHeight()+_lbl_txt.getHeight()));
 };
RDebugUtils.currentLine=19923122;
 //BA.debugLineNum = 19923122;BA.debugLine="Parent.Height = pnl_img.Height+2.5%y";
_parent.setHeight((int) (_pnl_img.getHeight()+anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (2.5),mostCurrent.activityBA)));
 break; }
case 3: {
RDebugUtils.currentLine=19923136;
 //BA.debugLineNum = 19923136;BA.debugLine="LogColor(\"img oter\",Colors.Red)";
anywheresoftware.b4a.keywords.Common.LogImpl("619923136","img oter",anywheresoftware.b4a.keywords.Common.Colors.Red);
 break; }
case 4: {
 break; }
}
;
RDebugUtils.currentLine=19923143;
 //BA.debugLineNum = 19923143;BA.debugLine="an.InitializeScaleCenter(\"\",1,1,1,1,Parent)";
mostCurrent._an.InitializeScaleCenter(mostCurrent.activityBA,"",(float) (1),(float) (1),(float) (1),(float) (1),(android.view.View)(_parent.getObject()));
RDebugUtils.currentLine=19923144;
 //BA.debugLineNum = 19923144;BA.debugLine="an.Duration = 50";
mostCurrent._an.setDuration((long) (50));
RDebugUtils.currentLine=19923145;
 //BA.debugLineNum = 19923145;BA.debugLine="an.Start(Parent)";
mostCurrent._an.Start((android.view.View)(_parent.getObject()));
RDebugUtils.currentLine=19923146;
 //BA.debugLineNum = 19923146;BA.debugLine="Log(\"posi : \"&Position&\" msg id \"&Item.msg_id)";
anywheresoftware.b4a.keywords.Common.LogImpl("619923146","posi : "+BA.NumberToString(_position)+" msg id "+_item.msg_id /*String*/ ,0);
RDebugUtils.currentLine=19923147;
 //BA.debugLineNum = 19923147;BA.debugLine="If Position=ItemList.Size-10 Then";
if (_position==mostCurrent._itemlist.getSize()-10) { 
RDebugUtils.currentLine=19923148;
 //BA.debugLineNum = 19923148;BA.debugLine="LogColor(\"get more \",Colors.Blue)";
anywheresoftware.b4a.keywords.Common.LogImpl("619923148","get more ",anywheresoftware.b4a.keywords.Common.Colors.Blue);
RDebugUtils.currentLine=19923149;
 //BA.debugLineNum = 19923149;BA.debugLine="getmore(Item.msg_id)";
_getmore((long)(Double.parseDouble(_item.msg_id /*String*/ )));
 };
RDebugUtils.currentLine=19923153;
 //BA.debugLineNum = 19923153;BA.debugLine="End Sub";
return "";
}
public static String  _setninepatchdrawable(anywheresoftware.b4a.objects.ConcreteViewWrapper _control,String _imagenamse) throws Exception{
RDebugUtils.currentModule="act_chat";
if (Debug.shouldDelegate(mostCurrent.activityBA, "setninepatchdrawable", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "setninepatchdrawable", new Object[] {_control,_imagenamse}));}
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
String _package = "";
int _id = 0;
RDebugUtils.currentLine=21626880;
 //BA.debugLineNum = 21626880;BA.debugLine="Sub SetNinePatchDrawable(Control As View, IMAGENAM";
RDebugUtils.currentLine=21626881;
 //BA.debugLineNum = 21626881;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=21626882;
 //BA.debugLineNum = 21626882;BA.debugLine="Dim package As String";
_package = "";
RDebugUtils.currentLine=21626883;
 //BA.debugLineNum = 21626883;BA.debugLine="Dim id As Int";
_id = 0;
RDebugUtils.currentLine=21626884;
 //BA.debugLineNum = 21626884;BA.debugLine="package = r.GetStaticField(\"anywheresoftware.b4a.";
_package = BA.ObjectToString(_r.GetStaticField("anywheresoftware.b4a.BA","packageName"));
RDebugUtils.currentLine=21626885;
 //BA.debugLineNum = 21626885;BA.debugLine="id = r.GetStaticField(package & \".R$drawable\", IM";
_id = (int)(BA.ObjectToNumber(_r.GetStaticField(_package+".R$drawable",_imagenamse)));
RDebugUtils.currentLine=21626886;
 //BA.debugLineNum = 21626886;BA.debugLine="r.Target = r.GetContext";
_r.Target = (Object)(_r.GetContext(processBA));
RDebugUtils.currentLine=21626887;
 //BA.debugLineNum = 21626887;BA.debugLine="r.Target = r.RunMethod(\"getResources\")";
_r.Target = _r.RunMethod("getResources");
RDebugUtils.currentLine=21626888;
 //BA.debugLineNum = 21626888;BA.debugLine="Control.Background = r.RunMethod2(\"getDrawable\",";
_control.setBackground((android.graphics.drawable.Drawable)(_r.RunMethod2("getDrawable",BA.NumberToString(_id),"java.lang.int")));
RDebugUtils.currentLine=21626889;
 //BA.debugLineNum = 21626889;BA.debugLine="End Sub";
return "";
}
public static String  _lv_oncreateviewholder(anywheresoftware.b4a.objects.PanelWrapper _parent,int _viewtype) throws Exception{
RDebugUtils.currentModule="act_chat";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lv_oncreateviewholder", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "lv_oncreateviewholder", new Object[] {_parent,_viewtype}));}
RDebugUtils.currentLine=19857408;
 //BA.debugLineNum = 19857408;BA.debugLine="Sub LV_onCreateViewHolder (Parent As Panel, ViewTy";
RDebugUtils.currentLine=19857414;
 //BA.debugLineNum = 19857414;BA.debugLine="End Sub";
return "";
}
public static String  _mipost_newcoins(String _newstr) throws Exception{
RDebugUtils.currentModule="act_chat";
if (Debug.shouldDelegate(mostCurrent.activityBA, "mipost_newcoins", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "mipost_newcoins", new Object[] {_newstr}));}
RDebugUtils.currentLine=22347776;
 //BA.debugLineNum = 22347776;BA.debugLine="Sub mipost_newcoins(newstr As String)";
RDebugUtils.currentLine=22347785;
 //BA.debugLineNum = 22347785;BA.debugLine="End Sub";
return "";
}
public static String  _pr_onjsonobjectuploaderror(com.reza.sh.fastnet.Error _error,String _tag) throws Exception{
RDebugUtils.currentModule="act_chat";
if (Debug.shouldDelegate(mostCurrent.activityBA, "pr_onjsonobjectuploaderror", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "pr_onjsonobjectuploaderror", new Object[] {_error,_tag}));}
RDebugUtils.currentLine=22020096;
 //BA.debugLineNum = 22020096;BA.debugLine="Sub pr_onJSONObjectUploadError(Error As ResponseEr";
RDebugUtils.currentLine=22020097;
 //BA.debugLineNum = 22020097;BA.debugLine="Log(Error.ErrorLocalizedMsage)";
anywheresoftware.b4a.keywords.Common.LogImpl("622020097",_error.getErrorLocalizedMsage(),0);
RDebugUtils.currentLine=22020098;
 //BA.debugLineNum = 22020098;BA.debugLine="End Sub";
return "";
}
public static String  _pr_onjsonobjectuploadok(String _jsonstring,String _tag) throws Exception{
RDebugUtils.currentModule="act_chat";
if (Debug.shouldDelegate(mostCurrent.activityBA, "pr_onjsonobjectuploadok", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "pr_onjsonobjectuploadok", new Object[] {_jsonstring,_tag}));}
RDebugUtils.currentLine=21954560;
 //BA.debugLineNum = 21954560;BA.debugLine="Sub pr_onJSONObjectUploadOK(JsonString As String ,";
RDebugUtils.currentLine=21954561;
 //BA.debugLineNum = 21954561;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=21954562;
 //BA.debugLineNum = 21954562;BA.debugLine="If JsonString<>Null Then";
if (_jsonstring!= null) { 
 };
RDebugUtils.currentLine=21954574;
 //BA.debugLineNum = 21954574;BA.debugLine="End Sub";
return "";
}
public static String  _pr_onstringuploaderror(com.reza.sh.fastnet.Error _error,String _tag) throws Exception{
RDebugUtils.currentModule="act_chat";
if (Debug.shouldDelegate(mostCurrent.activityBA, "pr_onstringuploaderror", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "pr_onstringuploaderror", new Object[] {_error,_tag}));}
RDebugUtils.currentLine=21823488;
 //BA.debugLineNum = 21823488;BA.debugLine="Sub pr_onStringUploadError(Error As ResponseError";
RDebugUtils.currentLine=21823489;
 //BA.debugLineNum = 21823489;BA.debugLine="Log(Error.ErrorLocalizedMsage)";
anywheresoftware.b4a.keywords.Common.LogImpl("621823489",_error.getErrorLocalizedMsage(),0);
RDebugUtils.currentLine=21823491;
 //BA.debugLineNum = 21823491;BA.debugLine="End Sub";
return "";
}
public static String  _pr_onstringuploadok(String _response,String _tag) throws Exception{
RDebugUtils.currentModule="act_chat";
if (Debug.shouldDelegate(mostCurrent.activityBA, "pr_onstringuploadok", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "pr_onstringuploadok", new Object[] {_response,_tag}));}
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
String _statusss = "";
RDebugUtils.currentLine=21889024;
 //BA.debugLineNum = 21889024;BA.debugLine="Sub pr_onStringUploadOK(response As String  , Tag";
RDebugUtils.currentLine=21889025;
 //BA.debugLineNum = 21889025;BA.debugLine="Log(response)";
anywheresoftware.b4a.keywords.Common.LogImpl("621889025",_response,0);
RDebugUtils.currentLine=21889026;
 //BA.debugLineNum = 21889026;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=21889027;
 //BA.debugLineNum = 21889027;BA.debugLine="parser.Initialize(response)";
_parser.Initialize(_response);
RDebugUtils.currentLine=21889028;
 //BA.debugLineNum = 21889028;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=21889029;
 //BA.debugLineNum = 21889029;BA.debugLine="Dim Statusss As String = root.Get(\"status\")";
_statusss = BA.ObjectToString(_root.Get((Object)("status")));
RDebugUtils.currentLine=21889031;
 //BA.debugLineNum = 21889031;BA.debugLine="If  Statusss=\"ok\" Then";
if ((_statusss).equals("ok")) { 
RDebugUtils.currentLine=21889032;
 //BA.debugLineNum = 21889032;BA.debugLine="reqsef(userid_t,\"2\",chat_id,numfinish,msg_id_sel";
_reqsef(mostCurrent._userid_t,"2",_chat_id,_numfinish,mostCurrent._msg_id_select,_us_name,_getname_img(_imgchat));
 }else {
RDebugUtils.currentLine=21889035;
 //BA.debugLineNum = 21889035;BA.debugLine="ToastMessageShow(\"خطا\",False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("خطا"),anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=21889037;
 //BA.debugLineNum = 21889037;BA.debugLine="End Sub";
return "";
}
public static String  _pr_onuploadprogress(long _uploaded,long _total,String _tag) throws Exception{
RDebugUtils.currentModule="act_chat";
if (Debug.shouldDelegate(mostCurrent.activityBA, "pr_onuploadprogress", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "pr_onuploadprogress", new Object[] {_uploaded,_total,_tag}));}
RDebugUtils.currentLine=22085632;
 //BA.debugLineNum = 22085632;BA.debugLine="Sub pr_onUploadProgress(uploaded As Long,total As";
RDebugUtils.currentLine=22085633;
 //BA.debugLineNum = 22085633;BA.debugLine="Log((uploaded/total))";
anywheresoftware.b4a.keywords.Common.LogImpl("622085633",BA.NumberToString((_uploaded/(double)_total)),0);
RDebugUtils.currentLine=22085634;
 //BA.debugLineNum = 22085634;BA.debugLine="End Sub";
return "";
}
public static String  _prfn_onpoststringerrorlistener(com.reza.sh.fastnet.Error _error,String _tag) throws Exception{
RDebugUtils.currentModule="act_chat";
if (Debug.shouldDelegate(mostCurrent.activityBA, "prfn_onpoststringerrorlistener", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "prfn_onpoststringerrorlistener", new Object[] {_error,_tag}));}
RDebugUtils.currentLine=22216704;
 //BA.debugLineNum = 22216704;BA.debugLine="Sub prfn_onPostStringErrorListener(Error As Respon";
RDebugUtils.currentLine=22216706;
 //BA.debugLineNum = 22216706;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=22216707;
 //BA.debugLineNum = 22216707;BA.debugLine="Log(\"errror\")";
anywheresoftware.b4a.keywords.Common.LogImpl("622216707","errror",0);
RDebugUtils.currentLine=22216708;
 //BA.debugLineNum = 22216708;BA.debugLine="End Sub";
return "";
}
public static String  _prfn_onpoststringoklistener(String _result,String _tag) throws Exception{
RDebugUtils.currentModule="act_chat";
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
com.valdesekamdem.library.mdtoast.MaterialToast _mtoasst = null;
RDebugUtils.currentLine=22282240;
 //BA.debugLineNum = 22282240;BA.debugLine="Sub prfn_onPostStringOkListener(Result As String";
RDebugUtils.currentLine=22282242;
 //BA.debugLineNum = 22282242;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=22282243;
 //BA.debugLineNum = 22282243;BA.debugLine="Log(Result)";
anywheresoftware.b4a.keywords.Common.LogImpl("622282243",_result,0);
RDebugUtils.currentLine=22282245;
 //BA.debugLineNum = 22282245;BA.debugLine="Select Tag";
switch (BA.switchObjectToInt(_tag,"sefss")) {
case 0: {
RDebugUtils.currentLine=22282247;
 //BA.debugLineNum = 22282247;BA.debugLine="If Result.Contains(\"error_code\")=True Then";
if (_result.contains("error_code")==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=22282248;
 //BA.debugLineNum = 22282248;BA.debugLine="ToastMessageShow(\"ثبت سفارش ناموفق بود :)\",Fal";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("ثبت سفارش ناموفق بود :)"),anywheresoftware.b4a.keywords.Common.False);
 }else {
RDebugUtils.currentLine=22282250;
 //BA.debugLineNum = 22282250;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=22282251;
 //BA.debugLineNum = 22282251;BA.debugLine="parser.Initialize(Result)";
_parser.Initialize(_result);
RDebugUtils.currentLine=22282252;
 //BA.debugLineNum = 22282252;BA.debugLine="Dim root As List = parser.NextArray";
_root = new anywheresoftware.b4a.objects.collections.List();
_root = _parser.NextArray();
RDebugUtils.currentLine=22282253;
 //BA.debugLineNum = 22282253;BA.debugLine="For Each colroot As Map In root";
_colroot = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group11 = _root;
final int groupLen11 = group11.getSize()
;int index11 = 0;
;
for (; index11 < groupLen11;index11++){
_colroot.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group11.Get(index11)));
RDebugUtils.currentLine=22282254;
 //BA.debugLineNum = 22282254;BA.debugLine="Dim Result As String = colroot.Get(\"result\")";
_result = BA.ObjectToString(_colroot.Get((Object)("result")));
RDebugUtils.currentLine=22282255;
 //BA.debugLineNum = 22282255;BA.debugLine="Dim c_m As String = colroot.Get(\"c_m\")";
_c_m = BA.ObjectToString(_colroot.Get((Object)("c_m")));
RDebugUtils.currentLine=22282256;
 //BA.debugLineNum = 22282256;BA.debugLine="Dim uid As String = colroot.Get(\"uid\")";
_uid = BA.ObjectToString(_colroot.Get((Object)("uid")));
RDebugUtils.currentLine=22282257;
 //BA.debugLineNum = 22282257;BA.debugLine="Dim first_last As String = colroot.Get(\"first";
_first_last = BA.ObjectToString(_colroot.Get((Object)("first_last")));
RDebugUtils.currentLine=22282258;
 //BA.debugLineNum = 22282258;BA.debugLine="Dim id As String = colroot.Get(\"id\")";
_id = BA.ObjectToString(_colroot.Get((Object)("id")));
RDebugUtils.currentLine=22282259;
 //BA.debugLineNum = 22282259;BA.debugLine="Dim userid As String = colroot.Get(\"userid\")";
_userid = BA.ObjectToString(_colroot.Get((Object)("userid")));
RDebugUtils.currentLine=22282260;
 //BA.debugLineNum = 22282260;BA.debugLine="Dim username As String = colroot.Get(\"usernam";
_username = BA.ObjectToString(_colroot.Get((Object)("username")));
RDebugUtils.currentLine=22282261;
 //BA.debugLineNum = 22282261;BA.debugLine="Dim c_ch As String = colroot.Get(\"c_ch\")";
_c_ch = BA.ObjectToString(_colroot.Get((Object)("c_ch")));
RDebugUtils.currentLine=22282263;
 //BA.debugLineNum = 22282263;BA.debugLine="sql1.ExecNonQuery(\"UPDATE tbl_coin set cm='\"&";
_sql1.ExecNonQuery("UPDATE tbl_coin set cm='"+_c_m+"',cf='"+_c_ch+"' WHERE userid='"+mostCurrent._userid_t+"' ");
 }
};
RDebugUtils.currentLine=22282271;
 //BA.debugLineNum = 22282271;BA.debugLine="progressDialog.Hide";
mostCurrent._progressdialog.Hide();
RDebugUtils.currentLine=22282273;
 //BA.debugLineNum = 22282273;BA.debugLine="Dim mtoasst As KJ_MaterialToast";
_mtoasst = new com.valdesekamdem.library.mdtoast.MaterialToast();
RDebugUtils.currentLine=22282274;
 //BA.debugLineNum = 22282274;BA.debugLine="mtoasst.Initialize(\"سفارش با موفقیت ثبت شد\",mt";
_mtoasst.Initialize(mostCurrent.activityBA,"سفارش با موفقیت ثبت شد",_mtoasst.LENGTH_SHORT,_mtoasst.TYPE_SUCCESS);
 };
 break; }
}
;
RDebugUtils.currentLine=22282280;
 //BA.debugLineNum = 22282280;BA.debugLine="End Sub";
return "";
}
public static String  _re_onparentchanged(boolean _shown) throws Exception{
RDebugUtils.currentModule="act_chat";
if (Debug.shouldDelegate(mostCurrent.activityBA, "re_onparentchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "re_onparentchanged", new Object[] {_shown}));}
RDebugUtils.currentLine=21168128;
 //BA.debugLineNum = 21168128;BA.debugLine="Sub RE_onParentChanged (Shown As Boolean)";
RDebugUtils.currentLine=21168129;
 //BA.debugLineNum = 21168129;BA.debugLine="sho = Shown";
_sho = _shown;
RDebugUtils.currentLine=21168130;
 //BA.debugLineNum = 21168130;BA.debugLine="If sho = False Then";
if (_sho==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=21168131;
 //BA.debugLineNum = 21168131;BA.debugLine="re.Top = 100%y";
mostCurrent._re.setTop(anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
 };
RDebugUtils.currentLine=21168133;
 //BA.debugLineNum = 21168133;BA.debugLine="End Sub";
return "";
}
public static String  _re_touch(int _action,float _x,float _y) throws Exception{
RDebugUtils.currentModule="act_chat";
if (Debug.shouldDelegate(mostCurrent.activityBA, "re_touch", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "re_touch", new Object[] {_action,_x,_y}));}
RDebugUtils.currentLine=21102592;
 //BA.debugLineNum = 21102592;BA.debugLine="Sub Re_Touch (Action As Int, X As Float, Y As Floa";
RDebugUtils.currentLine=21102593;
 //BA.debugLineNum = 21102593;BA.debugLine="If sho = False Then";
if (_sho==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=21102594;
 //BA.debugLineNum = 21102594;BA.debugLine="If x > 75%x And X < 82%x And y > Btnatt.Top+90%y";
if (_x>anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (75),mostCurrent.activityBA) && _x<anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (82),mostCurrent.activityBA) && _y>mostCurrent._btnatt.getTop()+anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (90),mostCurrent.activityBA) && _y<mostCurrent._btnatt.getTop()+anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (90),mostCurrent.activityBA)+anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (7),mostCurrent.activityBA)) { 
_btnatt_click();};
 };
RDebugUtils.currentLine=21102597;
 //BA.debugLineNum = 21102597;BA.debugLine="If sho Then";
if (_sho) { 
RDebugUtils.currentLine=21102598;
 //BA.debugLineNum = 21102598;BA.debugLine="If Y < Top And Action = re.Panel.ACTION_UP Then";
if (_y<_top && _action==mostCurrent._re.Panel().ACTION_UP) { 
_hid_click();};
 };
RDebugUtils.currentLine=21102601;
 //BA.debugLineNum = 21102601;BA.debugLine="End Sub";
return "";
}
public static String  _reload() throws Exception{
RDebugUtils.currentModule="act_chat";
if (Debug.shouldDelegate(mostCurrent.activityBA, "reload", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "reload", null));}
anywheresoftware.b4a.objects.ImageViewWrapper[] _img = null;
anywheresoftware.b4a.objects.LabelWrapper[] _limg = null;
String[] _names = null;
int _mleft = 0;
int _mtop = 0;
int _mtop2 = 0;
int _i = 0;
RDebugUtils.currentLine=19333120;
 //BA.debugLineNum = 19333120;BA.debugLine="Sub REload";
RDebugUtils.currentLine=19333121;
 //BA.debugLineNum = 19333121;BA.debugLine="Dim img(8) As ImageView : Dim Limg(8) As Label";
_img = new anywheresoftware.b4a.objects.ImageViewWrapper[(int) (8)];
{
int d0 = _img.length;
for (int i0 = 0;i0 < d0;i0++) {
_img[i0] = new anywheresoftware.b4a.objects.ImageViewWrapper();
}
}
;
RDebugUtils.currentLine=19333121;
 //BA.debugLineNum = 19333121;BA.debugLine="Dim img(8) As ImageView : Dim Limg(8) As Label";
_limg = new anywheresoftware.b4a.objects.LabelWrapper[(int) (8)];
{
int d0 = _limg.length;
for (int i0 = 0;i0 < d0;i0++) {
_limg[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
RDebugUtils.currentLine=19333122;
 //BA.debugLineNum = 19333122;BA.debugLine="Dim Names() As String = Array As String(\"Camera\",";
_names = new String[]{"Camera","Gallery","Video","Music","File","Contact","Location",""};
RDebugUtils.currentLine=19333123;
 //BA.debugLineNum = 19333123;BA.debugLine="Dim mLeft = 4%x, mTop = 4%x,mTop2 = 24%x As Int";
_mleft = anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (4),mostCurrent.activityBA);
_mtop = anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (4),mostCurrent.activityBA);
_mtop2 = anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (24),mostCurrent.activityBA);
RDebugUtils.currentLine=19333125;
 //BA.debugLineNum = 19333125;BA.debugLine="For i = 0 To img.Length-1";
{
final int step5 = 1;
final int limit5 = (int) (_img.length-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=19333126;
 //BA.debugLineNum = 19333126;BA.debugLine="img(i).Initialize(\"Image\")";
_img[_i].Initialize(mostCurrent.activityBA,"Image");
RDebugUtils.currentLine=19333127;
 //BA.debugLineNum = 19333127;BA.debugLine="img(i).Bitmap = LoadBitmap(File.DirAssets,i & \".";
_img[_i].setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),BA.NumberToString(_i)+".png").getObject()));
RDebugUtils.currentLine=19333128;
 //BA.debugLineNum = 19333128;BA.debugLine="img(i).Gravity = Gravity.FILL : img(i).Tag = i";
_img[_i].setGravity(anywheresoftware.b4a.keywords.Common.Gravity.FILL);
RDebugUtils.currentLine=19333128;
 //BA.debugLineNum = 19333128;BA.debugLine="img(i).Gravity = Gravity.FILL : img(i).Tag = i";
_img[_i].setTag((Object)(_i));
RDebugUtils.currentLine=19333129;
 //BA.debugLineNum = 19333129;BA.debugLine="Limg(i).Initialize(\"\") : Limg(i).Text = Names(i)";
_limg[_i].Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=19333129;
 //BA.debugLineNum = 19333129;BA.debugLine="Limg(i).Initialize(\"\") : Limg(i).Text = Names(i)";
_limg[_i].setText(BA.ObjectToCharSequence(_names[_i]));
RDebugUtils.currentLine=19333129;
 //BA.debugLineNum = 19333129;BA.debugLine="Limg(i).Initialize(\"\") : Limg(i).Text = Names(i)";
_limg[_i].setTextColor((int) (0xff565656));
RDebugUtils.currentLine=19333130;
 //BA.debugLineNum = 19333130;BA.debugLine="Limg(i).TextSize= 14 : Limg(i).Gravity = Gravity";
_limg[_i].setTextSize((float) (14));
RDebugUtils.currentLine=19333130;
 //BA.debugLineNum = 19333130;BA.debugLine="Limg(i).TextSize= 14 : Limg(i).Gravity = Gravity";
_limg[_i].setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER);
RDebugUtils.currentLine=19333130;
 //BA.debugLineNum = 19333130;BA.debugLine="Limg(i).TextSize= 14 : Limg(i).Gravity = Gravity";
_limg[_i].setTypeface((android.graphics.Typeface)(mostCurrent._font.getObject()));
RDebugUtils.currentLine=19333131;
 //BA.debugLineNum = 19333131;BA.debugLine="re.Panel.AddView(img(i),mLeft,mTop,20%x,20%x)";
mostCurrent._re.Panel().AddView((android.view.View)(_img[_i].getObject()),_mleft,_mtop,anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (20),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (20),mostCurrent.activityBA));
RDebugUtils.currentLine=19333132;
 //BA.debugLineNum = 19333132;BA.debugLine="re.Panel.AddView(Limg(i),mLeft,mTop2,20%x,5%x)";
mostCurrent._re.Panel().AddView((android.view.View)(_limg[_i].getObject()),_mleft,_mtop2,anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (20),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA));
RDebugUtils.currentLine=19333133;
 //BA.debugLineNum = 19333133;BA.debugLine="mLeft = mLeft + 24%x";
_mleft = (int) (_mleft+anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (24),mostCurrent.activityBA));
RDebugUtils.currentLine=19333134;
 //BA.debugLineNum = 19333134;BA.debugLine="If (i = 3) Then";
if ((_i==3)) { 
RDebugUtils.currentLine=19333135;
 //BA.debugLineNum = 19333135;BA.debugLine="mTop = 32%x";
_mtop = anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (32),mostCurrent.activityBA);
RDebugUtils.currentLine=19333136;
 //BA.debugLineNum = 19333136;BA.debugLine="mTop2 = 52%x";
_mtop2 = anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (52),mostCurrent.activityBA);
RDebugUtils.currentLine=19333137;
 //BA.debugLineNum = 19333137;BA.debugLine="mLeft = 4%x";
_mleft = anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (4),mostCurrent.activityBA);
 };
 }
};
RDebugUtils.currentLine=19333141;
 //BA.debugLineNum = 19333141;BA.debugLine="Dis";
_dis();
RDebugUtils.currentLine=19333143;
 //BA.debugLineNum = 19333143;BA.debugLine="STLoad";
_stload();
RDebugUtils.currentLine=19333145;
 //BA.debugLineNum = 19333145;BA.debugLine="End Sub";
return "";
}
public static String  _stload() throws Exception{
RDebugUtils.currentModule="act_chat";
if (Debug.shouldDelegate(mostCurrent.activityBA, "stload", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "stload", null));}
int _mleft = 0;
int _mtop = 0;
anywheresoftware.b4a.objects.ImageViewWrapper[] _img = null;
int _i = 0;
RDebugUtils.currentLine=19398656;
 //BA.debugLineNum = 19398656;BA.debugLine="Sub STLoad";
RDebugUtils.currentLine=19398657;
 //BA.debugLineNum = 19398657;BA.debugLine="Dim mLeft = 2%x, mTop = 4%x As Int";
_mleft = anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (2),mostCurrent.activityBA);
_mtop = anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (4),mostCurrent.activityBA);
RDebugUtils.currentLine=19398659;
 //BA.debugLineNum = 19398659;BA.debugLine="stp.Initialize(\"\")";
mostCurrent._stp.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=19398660;
 //BA.debugLineNum = 19398660;BA.debugLine="Activity.AddView(stp,0,100%y,100%x,75.5%x)";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._stp.getObject()),(int) (0),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (75.5),mostCurrent.activityBA));
RDebugUtils.currentLine=19398661;
 //BA.debugLineNum = 19398661;BA.debugLine="stp.Color = 0xFFFAFAFA";
mostCurrent._stp.setColor((int) (0xfffafafa));
RDebugUtils.currentLine=19398663;
 //BA.debugLineNum = 19398663;BA.debugLine="Dim img(12) As ImageView";
_img = new anywheresoftware.b4a.objects.ImageViewWrapper[(int) (12)];
{
int d0 = _img.length;
for (int i0 = 0;i0 < d0;i0++) {
_img[i0] = new anywheresoftware.b4a.objects.ImageViewWrapper();
}
}
;
RDebugUtils.currentLine=19398664;
 //BA.debugLineNum = 19398664;BA.debugLine="For i = 0 To img.Length-1";
{
final int step6 = 1;
final int limit6 = (int) (_img.length-1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
RDebugUtils.currentLine=19398665;
 //BA.debugLineNum = 19398665;BA.debugLine="img(i).Initialize(\"STImage\")";
_img[_i].Initialize(mostCurrent.activityBA,"STImage");
RDebugUtils.currentLine=19398666;
 //BA.debugLineNum = 19398666;BA.debugLine="img(i).Bitmap = LoadBitmap(File.DirAssets,\"96/0\"";
_img[_i].setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"96/0"+BA.NumberToString(_i)+".png").getObject()));
RDebugUtils.currentLine=19398667;
 //BA.debugLineNum = 19398667;BA.debugLine="img(i).Gravity = Gravity.FILL : img(i).Tag = i";
_img[_i].setGravity(anywheresoftware.b4a.keywords.Common.Gravity.FILL);
RDebugUtils.currentLine=19398667;
 //BA.debugLineNum = 19398667;BA.debugLine="img(i).Gravity = Gravity.FILL : img(i).Tag = i";
_img[_i].setTag((Object)(_i));
RDebugUtils.currentLine=19398669;
 //BA.debugLineNum = 19398669;BA.debugLine="stp.AddView(img(i),mLeft,mTop,22.5%x,22.5%x)";
mostCurrent._stp.AddView((android.view.View)(_img[_i].getObject()),_mleft,_mtop,anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (22.5),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (22.5),mostCurrent.activityBA));
RDebugUtils.currentLine=19398671;
 //BA.debugLineNum = 19398671;BA.debugLine="mLeft = mLeft + 24%x";
_mleft = (int) (_mleft+anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (24),mostCurrent.activityBA));
RDebugUtils.currentLine=19398672;
 //BA.debugLineNum = 19398672;BA.debugLine="If (i = 3) Then";
if ((_i==3)) { 
RDebugUtils.currentLine=19398673;
 //BA.debugLineNum = 19398673;BA.debugLine="mTop = 26.5%x";
_mtop = anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (26.5),mostCurrent.activityBA);
RDebugUtils.currentLine=19398674;
 //BA.debugLineNum = 19398674;BA.debugLine="mLeft = 2%x";
_mleft = anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (2),mostCurrent.activityBA);
 }else 
{RDebugUtils.currentLine=19398675;
 //BA.debugLineNum = 19398675;BA.debugLine="else if (i = 7) Then";
if ((_i==7)) { 
RDebugUtils.currentLine=19398676;
 //BA.debugLineNum = 19398676;BA.debugLine="mTop = 51%x";
_mtop = anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (51),mostCurrent.activityBA);
RDebugUtils.currentLine=19398677;
 //BA.debugLineNum = 19398677;BA.debugLine="mLeft = 2%x";
_mleft = anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (2),mostCurrent.activityBA);
 }}
;
 }
};
RDebugUtils.currentLine=19398681;
 //BA.debugLineNum = 19398681;BA.debugLine="End Sub";
return "";
}
public static String  _send_animationend() throws Exception{
RDebugUtils.currentModule="act_chat";
if (Debug.shouldDelegate(mostCurrent.activityBA, "send_animationend", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "send_animationend", null));}
RDebugUtils.currentLine=20250624;
 //BA.debugLineNum = 20250624;BA.debugLine="Sub send_AnimationEnd";
RDebugUtils.currentLine=20250625;
 //BA.debugLineNum = 20250625;BA.debugLine="EditText.Text = \"\"";
mostCurrent._edittext.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=20250626;
 //BA.debugLineNum = 20250626;BA.debugLine="End Sub";
return "";
}
public static String  _stic_click() throws Exception{
RDebugUtils.currentModule="act_chat";
if (Debug.shouldDelegate(mostCurrent.activityBA, "stic_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "stic_click", null));}
RDebugUtils.currentLine=19529728;
 //BA.debugLineNum = 19529728;BA.debugLine="Sub Stic_Click";
RDebugUtils.currentLine=19529729;
 //BA.debugLineNum = 19529729;BA.debugLine="stp.Top = 100%y-75.5%x";
mostCurrent._stp.setTop((int) (anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA)-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (75.5),mostCurrent.activityBA)));
RDebugUtils.currentLine=19529730;
 //BA.debugLineNum = 19529730;BA.debugLine="IME.HideKeyboard";
mostCurrent._ime.HideKeyboard(mostCurrent.activityBA);
RDebugUtils.currentLine=19529731;
 //BA.debugLineNum = 19529731;BA.debugLine="End Sub";
return "";
}
public static String  _stimage_click() throws Exception{
RDebugUtils.currentModule="act_chat";
if (Debug.shouldDelegate(mostCurrent.activityBA, "stimage_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "stimage_click", null));}
anywheresoftware.b4a.objects.ImageViewWrapper _image = null;
com.it.fome.act_chat._adapter _item = null;
RDebugUtils.currentLine=19464192;
 //BA.debugLineNum = 19464192;BA.debugLine="Sub STImage_Click";
RDebugUtils.currentLine=19464193;
 //BA.debugLineNum = 19464193;BA.debugLine="Dim Image As ImageView = Sender";
_image = new anywheresoftware.b4a.objects.ImageViewWrapper();
_image.setObject((android.widget.ImageView)(anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA)));
RDebugUtils.currentLine=19464194;
 //BA.debugLineNum = 19464194;BA.debugLine="Select Image.Tag";
switch (BA.switchObjectToInt(_image.getTag(),_image.getTag())) {
case 0: {
RDebugUtils.currentLine=19464196;
 //BA.debugLineNum = 19464196;BA.debugLine="stp.Top = 100%y";
mostCurrent._stp.setTop(anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
RDebugUtils.currentLine=19464197;
 //BA.debugLineNum = 19464197;BA.debugLine="re.Invalidate";
mostCurrent._re.Invalidate();
RDebugUtils.currentLine=19464199;
 //BA.debugLineNum = 19464199;BA.debugLine="Dim Item As Adapter";
_item = new com.it.fome.act_chat._adapter();
RDebugUtils.currentLine=19464200;
 //BA.debugLineNum = 19464200;BA.debugLine="Item.ViewType = MINEST";
_item.ViewType /*int*/  = _minest;
RDebugUtils.currentLine=19464201;
 //BA.debugLineNum = 19464201;BA.debugLine="Item.MyText = Image.Tag";
_item.MyText /*String*/  = BA.ObjectToString(_image.getTag());
RDebugUtils.currentLine=19464203;
 //BA.debugLineNum = 19464203;BA.debugLine="ItemList.Add(Item)";
mostCurrent._itemlist.Add((Object)(_item));
RDebugUtils.currentLine=19464204;
 //BA.debugLineNum = 19464204;BA.debugLine="LV.notifyItemAdded";
mostCurrent._lv.notifyItemAdded();
RDebugUtils.currentLine=19464206;
 //BA.debugLineNum = 19464206;BA.debugLine="LV.SmoothScrollToPosition(ItemList.Size)";
mostCurrent._lv.SmoothScrollToPosition(mostCurrent._itemlist.getSize());
RDebugUtils.currentLine=19464207;
 //BA.debugLineNum = 19464207;BA.debugLine="Timer2.Enabled = True";
_timer2.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 break; }
}
;
RDebugUtils.currentLine=19464210;
 //BA.debugLineNum = 19464210;BA.debugLine="End Sub";
return "";
}
public static String  _telegs_chatgroup(String _value) throws Exception{
RDebugUtils.currentModule="act_chat";
if (Debug.shouldDelegate(mostCurrent.activityBA, "telegs_chatgroup", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "telegs_chatgroup", new Object[] {_value}));}
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.List _root = null;
anywheresoftware.b4a.objects.collections.Map _colroot = null;
int _meg_replytomessageid = 0;
long _meg_chatid = 0L;
int _meg_senderuserid = 0;
int _meg_editdate = 0;
String _meg_ispost = "";
long _meg_id = 0L;
int _meg_views = 0;
String _msg_type = "";
String _meg_canbedeleted = "";
String _massege_info = "";
int _meg_viabotuserid = 0;
int _meg_date = 0;
String _meg_canbeedited = "";
String _replymarkup = "";
RDebugUtils.currentLine=22544384;
 //BA.debugLineNum = 22544384;BA.debugLine="Sub telegs_chatgroup(value As String)";
RDebugUtils.currentLine=22544385;
 //BA.debugLineNum = 22544385;BA.debugLine="LogColor(value,Colors.red)";
anywheresoftware.b4a.keywords.Common.LogImpl("622544385",_value,anywheresoftware.b4a.keywords.Common.Colors.Red);
RDebugUtils.currentLine=22544386;
 //BA.debugLineNum = 22544386;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=22544387;
 //BA.debugLineNum = 22544387;BA.debugLine="parser.Initialize(value)";
_parser.Initialize(_value);
RDebugUtils.currentLine=22544388;
 //BA.debugLineNum = 22544388;BA.debugLine="Dim root As List = parser.NextArray";
_root = new anywheresoftware.b4a.objects.collections.List();
_root = _parser.NextArray();
RDebugUtils.currentLine=22544389;
 //BA.debugLineNum = 22544389;BA.debugLine="For Each colroot As Map In root";
_colroot = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group5 = _root;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_colroot.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group5.Get(index5)));
RDebugUtils.currentLine=22544390;
 //BA.debugLineNum = 22544390;BA.debugLine="Dim meg_replyToMessageId As Int = colroot.Get(\"m";
_meg_replytomessageid = (int)(BA.ObjectToNumber(_colroot.Get((Object)("meg_replyToMessageId"))));
RDebugUtils.currentLine=22544391;
 //BA.debugLineNum = 22544391;BA.debugLine="Dim meg_chatId As Long = colroot.Get(\"meg_chatId";
_meg_chatid = BA.ObjectToLongNumber(_colroot.Get((Object)("meg_chatId")));
RDebugUtils.currentLine=22544392;
 //BA.debugLineNum = 22544392;BA.debugLine="Dim meg_senderUserId As Int = colroot.Get(\"meg_s";
_meg_senderuserid = (int)(BA.ObjectToNumber(_colroot.Get((Object)("meg_senderUserId"))));
RDebugUtils.currentLine=22544393;
 //BA.debugLineNum = 22544393;BA.debugLine="Dim meg_editDate As Int = colroot.Get(\"meg_editD";
_meg_editdate = (int)(BA.ObjectToNumber(_colroot.Get((Object)("meg_editDate"))));
RDebugUtils.currentLine=22544394;
 //BA.debugLineNum = 22544394;BA.debugLine="Dim meg_isPost As String = colroot.Get(\"meg_isPo";
_meg_ispost = BA.ObjectToString(_colroot.Get((Object)("meg_isPost")));
RDebugUtils.currentLine=22544395;
 //BA.debugLineNum = 22544395;BA.debugLine="Dim meg_id As Long = colroot.Get(\"meg_id\")";
_meg_id = BA.ObjectToLongNumber(_colroot.Get((Object)("meg_id")));
RDebugUtils.currentLine=22544397;
 //BA.debugLineNum = 22544397;BA.debugLine="Dim meg_views As Int = colroot.Get(\"meg_views\")";
_meg_views = (int)(BA.ObjectToNumber(_colroot.Get((Object)("meg_views"))));
RDebugUtils.currentLine=22544398;
 //BA.debugLineNum = 22544398;BA.debugLine="Dim msg_type As String = colroot.Get(\"msg_type\")";
_msg_type = BA.ObjectToString(_colroot.Get((Object)("msg_type")));
RDebugUtils.currentLine=22544399;
 //BA.debugLineNum = 22544399;BA.debugLine="Dim meg_canBeDeleted As String = colroot.Get(\"me";
_meg_canbedeleted = BA.ObjectToString(_colroot.Get((Object)("meg_canBeDeleted")));
RDebugUtils.currentLine=22544400;
 //BA.debugLineNum = 22544400;BA.debugLine="Dim massege_info As String = colroot.Get(\"masseg";
_massege_info = BA.ObjectToString(_colroot.Get((Object)("massege_info")));
RDebugUtils.currentLine=22544401;
 //BA.debugLineNum = 22544401;BA.debugLine="Dim meg_viaBotUserId As Int = colroot.Get(\"meg_v";
_meg_viabotuserid = (int)(BA.ObjectToNumber(_colroot.Get((Object)("meg_viaBotUserId"))));
RDebugUtils.currentLine=22544402;
 //BA.debugLineNum = 22544402;BA.debugLine="Dim meg_date As Int = colroot.Get(\"meg_date\")";
_meg_date = (int)(BA.ObjectToNumber(_colroot.Get((Object)("meg_date"))));
RDebugUtils.currentLine=22544403;
 //BA.debugLineNum = 22544403;BA.debugLine="Dim meg_canBeEdited As String = colroot.Get(\"meg";
_meg_canbeedited = BA.ObjectToString(_colroot.Get((Object)("meg_canBeEdited")));
RDebugUtils.currentLine=22544404;
 //BA.debugLineNum = 22544404;BA.debugLine="Dim ReplyMarkup As String = colroot.Get(\"ReplyMa";
_replymarkup = BA.ObjectToString(_colroot.Get((Object)("ReplyMarkup")));
RDebugUtils.currentLine=22544405;
 //BA.debugLineNum = 22544405;BA.debugLine="Log(\"ReplyMarkup: \"&ReplyMarkup)";
anywheresoftware.b4a.keywords.Common.LogImpl("622544405","ReplyMarkup: "+_replymarkup,0);
RDebugUtils.currentLine=22544406;
 //BA.debugLineNum = 22544406;BA.debugLine="LogColor(meg_id,Colors.Blue)";
anywheresoftware.b4a.keywords.Common.LogImpl("622544406",BA.NumberToString(_meg_id),anywheresoftware.b4a.keywords.Common.Colors.Blue);
RDebugUtils.currentLine=22544407;
 //BA.debugLineNum = 22544407;BA.debugLine="telegs.Viewmsg(meg_chatId,Array As Long(meg_id))";
mostCurrent._telegs.Viewmsg(_meg_chatid,new long[]{_meg_id});
 }
};
RDebugUtils.currentLine=22544409;
 //BA.debugLineNum = 22544409;BA.debugLine="End Sub";
return "";
}
public static String  _telegs_getchatshistory(String _value) throws Exception{
RDebugUtils.currentModule="act_chat";
if (Debug.shouldDelegate(mostCurrent.activityBA, "telegs_getchatshistory", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "telegs_getchatshistory", new Object[] {_value}));}
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.List _root = null;
anywheresoftware.b4a.objects.collections.Map _colroot = null;
int _meg_replytomessageid = 0;
long _meg_chatid = 0L;
int _meg_senderuserid = 0;
int _meg_editdate = 0;
String _meg_ispost = "";
long _meg_id = 0L;
int _meg_views = 0;
String _msg_type = "";
String _meg_canbedeleted = "";
String _massege_info = "";
int _meg_viabotuserid = 0;
int _meg_date = 0;
String _meg_canbeedited = "";
String _replymarkup = "";
anywheresoftware.b4a.objects.collections.JSONParser _parser_msg = null;
anywheresoftware.b4a.objects.collections.Map _root_msg = null;
String _msg_text = "";
com.it.fome.act_chat._adapter _item = null;
anywheresoftware.b4a.objects.collections.JSONParser _parser_photo = null;
anywheresoftware.b4a.objects.collections.Map _root_photo = null;
String _photoid_isdownloadingcompleted = "";
int _photoid_topmsg = 0;
int _photoid_downloadedprefixsize = 0;
String _caption_topmsg = "";
String _photoid_path = "";
int _photoid_downloadedsize = 0;
int _photoid_height = 0;
String _photoid_type = "";
int _photoid_size = 0;
String _caption_id = "";
int _photoid_width = 0;
String _photoid_isdownloadingactive = "";
String _photoid_remote = "";
String _photoid_canbedownloaded = "";
String _photoid_canbedeleted = "";
RDebugUtils.currentLine=19267584;
 //BA.debugLineNum = 19267584;BA.debugLine="Sub telegs_getchatshistory(value As String)";
RDebugUtils.currentLine=19267586;
 //BA.debugLineNum = 19267586;BA.debugLine="If value =\"\" Then";
if ((_value).equals("")) { 
RDebugUtils.currentLine=19267587;
 //BA.debugLineNum = 19267587;BA.debugLine="Return";
if (true) return "";
 }else {
RDebugUtils.currentLine=19267589;
 //BA.debugLineNum = 19267589;BA.debugLine="Log(\"chats ready!\")";
anywheresoftware.b4a.keywords.Common.LogImpl("619267589","chats ready!",0);
RDebugUtils.currentLine=19267590;
 //BA.debugLineNum = 19267590;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=19267591;
 //BA.debugLineNum = 19267591;BA.debugLine="parser.Initialize(value)";
_parser.Initialize(_value);
RDebugUtils.currentLine=19267592;
 //BA.debugLineNum = 19267592;BA.debugLine="Dim root As List = parser.NextArray";
_root = new anywheresoftware.b4a.objects.collections.List();
_root = _parser.NextArray();
RDebugUtils.currentLine=19267593;
 //BA.debugLineNum = 19267593;BA.debugLine="For Each colroot As Map In root";
_colroot = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group8 = _root;
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_colroot.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group8.Get(index8)));
RDebugUtils.currentLine=19267594;
 //BA.debugLineNum = 19267594;BA.debugLine="Dim meg_replyToMessageId As Int = colroot.Get(\"";
_meg_replytomessageid = (int)(BA.ObjectToNumber(_colroot.Get((Object)("meg_replyToMessageId"))));
RDebugUtils.currentLine=19267595;
 //BA.debugLineNum = 19267595;BA.debugLine="Dim meg_chatId As Long = colroot.Get(\"meg_chatI";
_meg_chatid = BA.ObjectToLongNumber(_colroot.Get((Object)("meg_chatId")));
RDebugUtils.currentLine=19267596;
 //BA.debugLineNum = 19267596;BA.debugLine="Dim meg_senderUserId As Int = colroot.Get(\"meg_";
_meg_senderuserid = (int)(BA.ObjectToNumber(_colroot.Get((Object)("meg_senderUserId"))));
RDebugUtils.currentLine=19267597;
 //BA.debugLineNum = 19267597;BA.debugLine="Dim meg_editDate As Int = colroot.Get(\"meg_edit";
_meg_editdate = (int)(BA.ObjectToNumber(_colroot.Get((Object)("meg_editDate"))));
RDebugUtils.currentLine=19267598;
 //BA.debugLineNum = 19267598;BA.debugLine="Dim meg_isPost As String = colroot.Get(\"meg_isP";
_meg_ispost = BA.ObjectToString(_colroot.Get((Object)("meg_isPost")));
RDebugUtils.currentLine=19267599;
 //BA.debugLineNum = 19267599;BA.debugLine="Dim meg_id As Long = colroot.Get(\"meg_id\")";
_meg_id = BA.ObjectToLongNumber(_colroot.Get((Object)("meg_id")));
RDebugUtils.currentLine=19267601;
 //BA.debugLineNum = 19267601;BA.debugLine="Dim meg_views As Int = colroot.Get(\"meg_views\")";
_meg_views = (int)(BA.ObjectToNumber(_colroot.Get((Object)("meg_views"))));
RDebugUtils.currentLine=19267602;
 //BA.debugLineNum = 19267602;BA.debugLine="Dim msg_type As String = colroot.Get(\"msg_type\"";
_msg_type = BA.ObjectToString(_colroot.Get((Object)("msg_type")));
RDebugUtils.currentLine=19267603;
 //BA.debugLineNum = 19267603;BA.debugLine="Dim meg_canBeDeleted As String = colroot.Get(\"m";
_meg_canbedeleted = BA.ObjectToString(_colroot.Get((Object)("meg_canBeDeleted")));
RDebugUtils.currentLine=19267604;
 //BA.debugLineNum = 19267604;BA.debugLine="Dim massege_info As String = colroot.Get(\"masse";
_massege_info = BA.ObjectToString(_colroot.Get((Object)("massege_info")));
RDebugUtils.currentLine=19267605;
 //BA.debugLineNum = 19267605;BA.debugLine="Dim meg_viaBotUserId As Int = colroot.Get(\"meg_";
_meg_viabotuserid = (int)(BA.ObjectToNumber(_colroot.Get((Object)("meg_viaBotUserId"))));
RDebugUtils.currentLine=19267606;
 //BA.debugLineNum = 19267606;BA.debugLine="Dim meg_date As Int = colroot.Get(\"meg_date\")";
_meg_date = (int)(BA.ObjectToNumber(_colroot.Get((Object)("meg_date"))));
RDebugUtils.currentLine=19267607;
 //BA.debugLineNum = 19267607;BA.debugLine="Dim meg_canBeEdited As String = colroot.Get(\"me";
_meg_canbeedited = BA.ObjectToString(_colroot.Get((Object)("meg_canBeEdited")));
RDebugUtils.currentLine=19267608;
 //BA.debugLineNum = 19267608;BA.debugLine="Dim ReplyMarkup As String = colroot.Get(\"ReplyM";
_replymarkup = BA.ObjectToString(_colroot.Get((Object)("ReplyMarkup")));
RDebugUtils.currentLine=19267609;
 //BA.debugLineNum = 19267609;BA.debugLine="Log(\"ReplyMarkup: \"&ReplyMarkup)";
anywheresoftware.b4a.keywords.Common.LogImpl("619267609","ReplyMarkup: "+_replymarkup,0);
RDebugUtils.currentLine=19267610;
 //BA.debugLineNum = 19267610;BA.debugLine="LogColor(meg_id,Colors.Blue)";
anywheresoftware.b4a.keywords.Common.LogImpl("619267610",BA.NumberToString(_meg_id),anywheresoftware.b4a.keywords.Common.Colors.Blue);
RDebugUtils.currentLine=19267612;
 //BA.debugLineNum = 19267612;BA.debugLine="Select msg_type";
switch (BA.switchObjectToInt(_msg_type,"message","photo")) {
case 0: {
RDebugUtils.currentLine=19267614;
 //BA.debugLineNum = 19267614;BA.debugLine="Dim parser_msg As JSONParser";
_parser_msg = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=19267615;
 //BA.debugLineNum = 19267615;BA.debugLine="parser_msg.Initialize(massege_info)";
_parser_msg.Initialize(_massege_info);
RDebugUtils.currentLine=19267616;
 //BA.debugLineNum = 19267616;BA.debugLine="Dim root_msg As Map = parser_msg.NextObject";
_root_msg = new anywheresoftware.b4a.objects.collections.Map();
_root_msg = _parser_msg.NextObject();
RDebugUtils.currentLine=19267617;
 //BA.debugLineNum = 19267617;BA.debugLine="Dim msg_text As String = root_msg.Get(\"msg_te";
_msg_text = BA.ObjectToString(_root_msg.Get((Object)("msg_text")));
RDebugUtils.currentLine=19267619;
 //BA.debugLineNum = 19267619;BA.debugLine="Dim Item As Adapter";
_item = new com.it.fome.act_chat._adapter();
RDebugUtils.currentLine=19267620;
 //BA.debugLineNum = 19267620;BA.debugLine="Item.ViewType = Their";
_item.ViewType /*int*/  = _their;
RDebugUtils.currentLine=19267621;
 //BA.debugLineNum = 19267621;BA.debugLine="Item.TheirText = msg_text";
_item.TheirText /*String*/  = _msg_text;
RDebugUtils.currentLine=19267622;
 //BA.debugLineNum = 19267622;BA.debugLine="Item.msg_id=meg_id";
_item.msg_id /*String*/  = BA.NumberToString(_meg_id);
RDebugUtils.currentLine=19267626;
 //BA.debugLineNum = 19267626;BA.debugLine="ItemList.Add(Item)";
mostCurrent._itemlist.Add((Object)(_item));
RDebugUtils.currentLine=19267627;
 //BA.debugLineNum = 19267627;BA.debugLine="LV.notifyItemAdded";
mostCurrent._lv.notifyItemAdded();
 break; }
case 1: {
RDebugUtils.currentLine=19267633;
 //BA.debugLineNum = 19267633;BA.debugLine="Log(\"photo\")";
anywheresoftware.b4a.keywords.Common.LogImpl("619267633","photo",0);
RDebugUtils.currentLine=19267634;
 //BA.debugLineNum = 19267634;BA.debugLine="Dim parser_photo As JSONParser";
_parser_photo = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=19267635;
 //BA.debugLineNum = 19267635;BA.debugLine="parser_photo.Initialize(massege_info)";
_parser_photo.Initialize(_massege_info);
RDebugUtils.currentLine=19267636;
 //BA.debugLineNum = 19267636;BA.debugLine="Dim root_photo As Map = parser_photo.NextObje";
_root_photo = new anywheresoftware.b4a.objects.collections.Map();
_root_photo = _parser_photo.NextObject();
RDebugUtils.currentLine=19267637;
 //BA.debugLineNum = 19267637;BA.debugLine="Dim photoid_isDownloadingCompleted As String";
_photoid_isdownloadingcompleted = BA.ObjectToString(_root_photo.Get((Object)("photoid_isDownloadingCompleted")));
RDebugUtils.currentLine=19267638;
 //BA.debugLineNum = 19267638;BA.debugLine="Dim photoid_topmsg As Int = root_photo.Get(\"p";
_photoid_topmsg = (int)(BA.ObjectToNumber(_root_photo.Get((Object)("photoid_topmsg"))));
RDebugUtils.currentLine=19267639;
 //BA.debugLineNum = 19267639;BA.debugLine="Dim photoid_downloadedPrefixSize As Int = roo";
_photoid_downloadedprefixsize = (int)(BA.ObjectToNumber(_root_photo.Get((Object)("photoid_downloadedPrefixSize"))));
RDebugUtils.currentLine=19267640;
 //BA.debugLineNum = 19267640;BA.debugLine="Dim caption_topmsg As String = root_photo.Get";
_caption_topmsg = BA.ObjectToString(_root_photo.Get((Object)("caption_topmsg")));
RDebugUtils.currentLine=19267641;
 //BA.debugLineNum = 19267641;BA.debugLine="Dim photoid_path As String = root_photo.Get(\"";
_photoid_path = BA.ObjectToString(_root_photo.Get((Object)("photoid_path")));
RDebugUtils.currentLine=19267642;
 //BA.debugLineNum = 19267642;BA.debugLine="Dim photoid_downloadedSize As Int = root_phot";
_photoid_downloadedsize = (int)(BA.ObjectToNumber(_root_photo.Get((Object)("photoid_downloadedSize"))));
RDebugUtils.currentLine=19267643;
 //BA.debugLineNum = 19267643;BA.debugLine="Dim photoid_height As Int = root_photo.Get(\"p";
_photoid_height = (int)(BA.ObjectToNumber(_root_photo.Get((Object)("photoid_height"))));
RDebugUtils.currentLine=19267644;
 //BA.debugLineNum = 19267644;BA.debugLine="Dim photoid_type As String = root_photo.Get(\"";
_photoid_type = BA.ObjectToString(_root_photo.Get((Object)("photoid_type")));
RDebugUtils.currentLine=19267645;
 //BA.debugLineNum = 19267645;BA.debugLine="Dim photoid_size As Int = root_photo.Get(\"pho";
_photoid_size = (int)(BA.ObjectToNumber(_root_photo.Get((Object)("photoid_size"))));
RDebugUtils.currentLine=19267646;
 //BA.debugLineNum = 19267646;BA.debugLine="Dim caption_id As String = root_photo.Get(\"ca";
_caption_id = BA.ObjectToString(_root_photo.Get((Object)("caption_id")));
RDebugUtils.currentLine=19267647;
 //BA.debugLineNum = 19267647;BA.debugLine="Dim photoid_width As Int = root_photo.Get(\"ph";
_photoid_width = (int)(BA.ObjectToNumber(_root_photo.Get((Object)("photoid_width"))));
RDebugUtils.currentLine=19267648;
 //BA.debugLineNum = 19267648;BA.debugLine="Dim photoid_isDownloadingActive As String = r";
_photoid_isdownloadingactive = BA.ObjectToString(_root_photo.Get((Object)("photoid_isDownloadingActive")));
RDebugUtils.currentLine=19267649;
 //BA.debugLineNum = 19267649;BA.debugLine="Dim photoid_remote As String = root_photo.Get";
_photoid_remote = BA.ObjectToString(_root_photo.Get((Object)("photoid_remote")));
RDebugUtils.currentLine=19267650;
 //BA.debugLineNum = 19267650;BA.debugLine="Dim photoid_canBeDownloaded As String = root_";
_photoid_canbedownloaded = BA.ObjectToString(_root_photo.Get((Object)("photoid_canBeDownloaded")));
RDebugUtils.currentLine=19267651;
 //BA.debugLineNum = 19267651;BA.debugLine="Dim photoid_canBeDeleted As String = root_pho";
_photoid_canbedeleted = BA.ObjectToString(_root_photo.Get((Object)("photoid_canBeDeleted")));
RDebugUtils.currentLine=19267655;
 //BA.debugLineNum = 19267655;BA.debugLine="Log(\"path \"&photoid_topmsg)";
anywheresoftware.b4a.keywords.Common.LogImpl("619267655","path "+BA.NumberToString(_photoid_topmsg),0);
RDebugUtils.currentLine=19267657;
 //BA.debugLineNum = 19267657;BA.debugLine="If photoid_path=\"\" Then";
if ((_photoid_path).equals("")) { 
RDebugUtils.currentLine=19267658;
 //BA.debugLineNum = 19267658;BA.debugLine="LogColor(\"in downloading\",Colors.Red)";
anywheresoftware.b4a.keywords.Common.LogImpl("619267658","in downloading",anywheresoftware.b4a.keywords.Common.Colors.Red);
RDebugUtils.currentLine=19267660;
 //BA.debugLineNum = 19267660;BA.debugLine="telegs.downloadFile(photoid_topmsg)";
mostCurrent._telegs.downloadFile(_photoid_topmsg);
 }else {
RDebugUtils.currentLine=19267664;
 //BA.debugLineNum = 19267664;BA.debugLine="Log(photoid_path)";
anywheresoftware.b4a.keywords.Common.LogImpl("619267664",_photoid_path,0);
RDebugUtils.currentLine=19267665;
 //BA.debugLineNum = 19267665;BA.debugLine="Dim Item As Adapter";
_item = new com.it.fome.act_chat._adapter();
RDebugUtils.currentLine=19267666;
 //BA.debugLineNum = 19267666;BA.debugLine="Item.ViewType =MINEST";
_item.ViewType /*int*/  = _minest;
RDebugUtils.currentLine=19267667;
 //BA.debugLineNum = 19267667;BA.debugLine="Item.img_my = photoid_path";
_item.img_my /*String*/  = _photoid_path;
RDebugUtils.currentLine=19267668;
 //BA.debugLineNum = 19267668;BA.debugLine="Item.img_id=photoid_topmsg";
_item.img_id /*String*/  = BA.NumberToString(_photoid_topmsg);
RDebugUtils.currentLine=19267669;
 //BA.debugLineNum = 19267669;BA.debugLine="If caption_topmsg=\"null\" Then";
if ((_caption_topmsg).equals("null")) { 
 }else {
RDebugUtils.currentLine=19267671;
 //BA.debugLineNum = 19267671;BA.debugLine="Item.caption_topmsg=caption_topmsg";
_item.caption_topmsg /*String*/  = _caption_topmsg;
 };
RDebugUtils.currentLine=19267674;
 //BA.debugLineNum = 19267674;BA.debugLine="Item.img_isdwonload=photoid_isDownloadingCom";
_item.img_isdwonload /*String*/  = _photoid_isdownloadingcompleted.toLowerCase();
RDebugUtils.currentLine=19267675;
 //BA.debugLineNum = 19267675;BA.debugLine="Item.img_remote=photoid_remote";
_item.img_remote /*String*/  = _photoid_remote;
RDebugUtils.currentLine=19267676;
 //BA.debugLineNum = 19267676;BA.debugLine="Item.msg_id=meg_id";
_item.msg_id /*String*/  = BA.NumberToString(_meg_id);
RDebugUtils.currentLine=19267678;
 //BA.debugLineNum = 19267678;BA.debugLine="ItemList.Add(Item)";
mostCurrent._itemlist.Add((Object)(_item));
RDebugUtils.currentLine=19267680;
 //BA.debugLineNum = 19267680;BA.debugLine="LV.notifyItemAdded";
mostCurrent._lv.notifyItemAdded();
 };
 break; }
}
;
RDebugUtils.currentLine=19267705;
 //BA.debugLineNum = 19267705;BA.debugLine="Log(meg_id)";
anywheresoftware.b4a.keywords.Common.LogImpl("619267705",BA.NumberToString(_meg_id),0);
 }
};
RDebugUtils.currentLine=19267712;
 //BA.debugLineNum = 19267712;BA.debugLine="LV.notifyDataSetChanged";
mostCurrent._lv.notifyDataSetChanged();
RDebugUtils.currentLine=19267713;
 //BA.debugLineNum = 19267713;BA.debugLine="If ItemList.Size<2 Then";
if (mostCurrent._itemlist.getSize()<2) { 
RDebugUtils.currentLine=19267714;
 //BA.debugLineNum = 19267714;BA.debugLine="telegs.getChatHistory(chat_id,0,0,100,False)";
mostCurrent._telegs.getChatHistory((long)(Double.parseDouble(_chat_id)),(long) (0),(int) (0),(int) (100),anywheresoftware.b4a.keywords.Common.False);
 };
 };
RDebugUtils.currentLine=19267721;
 //BA.debugLineNum = 19267721;BA.debugLine="End Sub";
return "";
}
public static String  _telegs_imgaddress(String _respon) throws Exception{
RDebugUtils.currentModule="act_chat";
if (Debug.shouldDelegate(mostCurrent.activityBA, "telegs_imgaddress", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "telegs_imgaddress", new Object[] {_respon}));}
RDebugUtils.currentLine=21430272;
 //BA.debugLineNum = 21430272;BA.debugLine="Sub telegs_imgaddress(respon As String)";
RDebugUtils.currentLine=21430274;
 //BA.debugLineNum = 21430274;BA.debugLine="LogColor(\"img addres\",Colors.Red)";
anywheresoftware.b4a.keywords.Common.LogImpl("621430274","img addres",anywheresoftware.b4a.keywords.Common.Colors.Red);
RDebugUtils.currentLine=21430276;
 //BA.debugLineNum = 21430276;BA.debugLine="End Sub";
return "";
}
public static String  _telegs_update_file(String _respon) throws Exception{
RDebugUtils.currentModule="act_chat";
if (Debug.shouldDelegate(mostCurrent.activityBA, "telegs_update_file", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "telegs_update_file", new Object[] {_respon}));}
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
String _photof_remot_id = "";
String _photof_local_candownload = "";
String _photof_local_isdownload = "";
int _photof_expectedsize = 0;
int _photof_remot_uploadsize = 0;
int _photof_size = 0;
String _photof_remot_isuploadactive = "";
int _photof_local_perfexsize = 0;
String _photof_remot_isuploadcomplit = "";
int _photof_local_downloadsize = 0;
String _photof_local_canbedlelte = "";
int _photof_id = 0;
String _photof_local_isdowloaded = "";
String _photof_localpath = "";
int _ss = 0;
com.it.fome.act_chat._adapter _itema = null;
RDebugUtils.currentLine=21495808;
 //BA.debugLineNum = 21495808;BA.debugLine="Sub telegs_update_file(respon As String)";
RDebugUtils.currentLine=21495810;
 //BA.debugLineNum = 21495810;BA.debugLine="LogColor(respon,Colors.Blue)";
anywheresoftware.b4a.keywords.Common.LogImpl("621495810",_respon,anywheresoftware.b4a.keywords.Common.Colors.Blue);
RDebugUtils.currentLine=21495811;
 //BA.debugLineNum = 21495811;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=21495812;
 //BA.debugLineNum = 21495812;BA.debugLine="parser.Initialize(respon)";
_parser.Initialize(_respon);
RDebugUtils.currentLine=21495813;
 //BA.debugLineNum = 21495813;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=21495814;
 //BA.debugLineNum = 21495814;BA.debugLine="Dim photof_remot_id As String = root.Get(\"photof_";
_photof_remot_id = BA.ObjectToString(_root.Get((Object)("photof_remot_id")));
RDebugUtils.currentLine=21495815;
 //BA.debugLineNum = 21495815;BA.debugLine="Dim photof_local_candownload As String = root.Get";
_photof_local_candownload = BA.ObjectToString(_root.Get((Object)("photof_local_candownload")));
RDebugUtils.currentLine=21495816;
 //BA.debugLineNum = 21495816;BA.debugLine="Dim photof_local_isdownload As String = root.Get(";
_photof_local_isdownload = BA.ObjectToString(_root.Get((Object)("photof_local_isdownload")));
RDebugUtils.currentLine=21495817;
 //BA.debugLineNum = 21495817;BA.debugLine="Dim photof_expectedSize As Int = root.Get(\"photof";
_photof_expectedsize = (int)(BA.ObjectToNumber(_root.Get((Object)("photof_expectedSize"))));
RDebugUtils.currentLine=21495818;
 //BA.debugLineNum = 21495818;BA.debugLine="Dim photof_remot_uploadsize As Int = root.Get(\"ph";
_photof_remot_uploadsize = (int)(BA.ObjectToNumber(_root.Get((Object)("photof_remot_uploadsize"))));
RDebugUtils.currentLine=21495819;
 //BA.debugLineNum = 21495819;BA.debugLine="Dim photof_size As Int = root.Get(\"photof_size\")";
_photof_size = (int)(BA.ObjectToNumber(_root.Get((Object)("photof_size"))));
RDebugUtils.currentLine=21495820;
 //BA.debugLineNum = 21495820;BA.debugLine="Dim photof_remot_isuploadactive As String = root.";
_photof_remot_isuploadactive = BA.ObjectToString(_root.Get((Object)("photof_remot_isuploadactive")));
RDebugUtils.currentLine=21495821;
 //BA.debugLineNum = 21495821;BA.debugLine="Dim photof_local_perfexsize As Int = root.Get(\"ph";
_photof_local_perfexsize = (int)(BA.ObjectToNumber(_root.Get((Object)("photof_local_perfexsize"))));
RDebugUtils.currentLine=21495822;
 //BA.debugLineNum = 21495822;BA.debugLine="Dim photof_remot_isuploadcomplit As String = root";
_photof_remot_isuploadcomplit = BA.ObjectToString(_root.Get((Object)("photof_remot_isuploadcomplit")));
RDebugUtils.currentLine=21495823;
 //BA.debugLineNum = 21495823;BA.debugLine="Dim photof_local_downloadsize As Int = root.Get(\"";
_photof_local_downloadsize = (int)(BA.ObjectToNumber(_root.Get((Object)("photof_local_downloadsize"))));
RDebugUtils.currentLine=21495824;
 //BA.debugLineNum = 21495824;BA.debugLine="Dim photof_local_canbedlelte As String = root.Get";
_photof_local_canbedlelte = BA.ObjectToString(_root.Get((Object)("photof_local_canbedlelte")));
RDebugUtils.currentLine=21495825;
 //BA.debugLineNum = 21495825;BA.debugLine="Dim photof_id As Int = root.Get(\"photof_id\")";
_photof_id = (int)(BA.ObjectToNumber(_root.Get((Object)("photof_id"))));
RDebugUtils.currentLine=21495826;
 //BA.debugLineNum = 21495826;BA.debugLine="Dim photof_local_isdowloaded As String = root.Get";
_photof_local_isdowloaded = BA.ObjectToString(_root.Get((Object)("photof_local_isdowloaded")));
RDebugUtils.currentLine=21495827;
 //BA.debugLineNum = 21495827;BA.debugLine="Dim photof_localpath As String = root.Get(\"photof";
_photof_localpath = BA.ObjectToString(_root.Get((Object)("photof_localpath")));
RDebugUtils.currentLine=21495829;
 //BA.debugLineNum = 21495829;BA.debugLine="Log(\" isdowloaded \"&photof_local_isdowloaded&\" si";
anywheresoftware.b4a.keywords.Common.LogImpl("621495829"," isdowloaded "+_photof_local_isdowloaded+" size "+BA.NumberToString(_photof_size)+" dl size : "+BA.NumberToString(_photof_local_downloadsize)+" is download "+_photof_local_isdownload+" can dl : "+_photof_local_candownload,0);
RDebugUtils.currentLine=21495830;
 //BA.debugLineNum = 21495830;BA.debugLine="Log(\"p : \"&photof_localpath)";
anywheresoftware.b4a.keywords.Common.LogImpl("621495830","p : "+_photof_localpath,0);
RDebugUtils.currentLine=21495832;
 //BA.debugLineNum = 21495832;BA.debugLine="Try";
try {RDebugUtils.currentLine=21495833;
 //BA.debugLineNum = 21495833;BA.debugLine="If photof_local_isdowloaded=\"true\" Then";
if ((_photof_local_isdowloaded).equals("true")) { 
RDebugUtils.currentLine=21495834;
 //BA.debugLineNum = 21495834;BA.debugLine="For ss=0 To ItemList.Size-1";
{
final int step23 = 1;
final int limit23 = (int) (mostCurrent._itemlist.getSize()-1);
_ss = (int) (0) ;
for (;_ss <= limit23 ;_ss = _ss + step23 ) {
RDebugUtils.currentLine=21495835;
 //BA.debugLineNum = 21495835;BA.debugLine="Dim Itema = ItemList.Get(ss) As Adapter";
_itema = (com.it.fome.act_chat._adapter)(mostCurrent._itemlist.Get(_ss));
RDebugUtils.currentLine=21495836;
 //BA.debugLineNum = 21495836;BA.debugLine="If Itema.img_id=photof_id Then";
if ((_itema.img_id /*String*/ ).equals(BA.NumberToString(_photof_id))) { 
RDebugUtils.currentLine=21495837;
 //BA.debugLineNum = 21495837;BA.debugLine="Log(ss&\" img id ready!\")";
anywheresoftware.b4a.keywords.Common.LogImpl("621495837",BA.NumberToString(_ss)+" img id ready!",0);
RDebugUtils.currentLine=21495838;
 //BA.debugLineNum = 21495838;BA.debugLine="Itema.ViewType =MINEST";
_itema.ViewType /*int*/  = _minest;
RDebugUtils.currentLine=21495839;
 //BA.debugLineNum = 21495839;BA.debugLine="Itema.img_my = photof_localpath";
_itema.img_my /*String*/  = _photof_localpath;
RDebugUtils.currentLine=21495840;
 //BA.debugLineNum = 21495840;BA.debugLine="Itema.img_isdwonload=photof_local_isdowloaded";
_itema.img_isdwonload /*String*/  = _photof_local_isdowloaded;
RDebugUtils.currentLine=21495841;
 //BA.debugLineNum = 21495841;BA.debugLine="Itema.img_remote=photof_remot_id";
_itema.img_remote /*String*/  = _photof_remot_id;
RDebugUtils.currentLine=21495842;
 //BA.debugLineNum = 21495842;BA.debugLine="Itema.img_id=photof_id";
_itema.img_id /*String*/  = BA.NumberToString(_photof_id);
RDebugUtils.currentLine=21495844;
 //BA.debugLineNum = 21495844;BA.debugLine="LV.notifyItemChanged(ss)";
mostCurrent._lv.notifyItemChanged(_ss);
 };
 }
};
 };
 } 
       catch (Exception e37) {
			processBA.setLastException(e37);RDebugUtils.currentLine=21495853;
 //BA.debugLineNum = 21495853;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("621495853",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 };
RDebugUtils.currentLine=21495862;
 //BA.debugLineNum = 21495862;BA.debugLine="End Sub";
return "";
}
public static String  _telegs_update_newmsg(String _value) throws Exception{
RDebugUtils.currentModule="act_chat";
if (Debug.shouldDelegate(mostCurrent.activityBA, "telegs_update_newmsg", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "telegs_update_newmsg", new Object[] {_value}));}
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.List _root = null;
anywheresoftware.b4a.objects.collections.Map _colroot = null;
int _meg_replytomessageid = 0;
long _meg_chatid = 0L;
int _meg_senderuserid = 0;
int _meg_editdate = 0;
String _meg_ispost = "";
long _meg_id = 0L;
int _meg_views = 0;
String _msg_type = "";
String _meg_canbedeleted = "";
String _massege_info = "";
int _meg_viabotuserid = 0;
int _meg_date = 0;
String _meg_canbeedited = "";
String _replymarkup = "";
anywheresoftware.b4a.objects.collections.JSONParser _parser_msg = null;
anywheresoftware.b4a.objects.collections.Map _root_msg = null;
String _msg_text = "";
com.it.fome.act_chat._adapter _item = null;
anywheresoftware.b4a.objects.collections.JSONParser _parser_photo = null;
anywheresoftware.b4a.objects.collections.Map _root_photo = null;
String _photoid_isdownloadingcompleted = "";
int _photoid_topmsg = 0;
int _photoid_downloadedprefixsize = 0;
String _caption_topmsg = "";
String _photoid_path = "";
int _photoid_downloadedsize = 0;
int _photoid_height = 0;
String _photoid_type = "";
int _photoid_size = 0;
String _caption_id = "";
int _photoid_width = 0;
String _photoid_isdownloadingactive = "";
String _photoid_remote = "";
String _photoid_canbedownloaded = "";
String _photoid_canbedeleted = "";
RDebugUtils.currentLine=21364736;
 //BA.debugLineNum = 21364736;BA.debugLine="Sub telegs_update_newmsg(value As String)";
RDebugUtils.currentLine=21364737;
 //BA.debugLineNum = 21364737;BA.debugLine="Log(\"in chat : \"&value)";
anywheresoftware.b4a.keywords.Common.LogImpl("621364737","in chat : "+_value,0);
RDebugUtils.currentLine=21364738;
 //BA.debugLineNum = 21364738;BA.debugLine="If value =\"\" Then";
if ((_value).equals("")) { 
RDebugUtils.currentLine=21364739;
 //BA.debugLineNum = 21364739;BA.debugLine="Return";
if (true) return "";
 }else {
RDebugUtils.currentLine=21364741;
 //BA.debugLineNum = 21364741;BA.debugLine="Log(\"chats ready!\")";
anywheresoftware.b4a.keywords.Common.LogImpl("621364741","chats ready!",0);
RDebugUtils.currentLine=21364742;
 //BA.debugLineNum = 21364742;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=21364743;
 //BA.debugLineNum = 21364743;BA.debugLine="parser.Initialize(value)";
_parser.Initialize(_value);
RDebugUtils.currentLine=21364744;
 //BA.debugLineNum = 21364744;BA.debugLine="Dim root As List = parser.NextArray";
_root = new anywheresoftware.b4a.objects.collections.List();
_root = _parser.NextArray();
RDebugUtils.currentLine=21364745;
 //BA.debugLineNum = 21364745;BA.debugLine="For Each colroot As Map In root";
_colroot = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group9 = _root;
final int groupLen9 = group9.getSize()
;int index9 = 0;
;
for (; index9 < groupLen9;index9++){
_colroot.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group9.Get(index9)));
RDebugUtils.currentLine=21364746;
 //BA.debugLineNum = 21364746;BA.debugLine="Dim meg_replyToMessageId As Int = colroot.Get(\"";
_meg_replytomessageid = (int)(BA.ObjectToNumber(_colroot.Get((Object)("meg_replyToMessageId"))));
RDebugUtils.currentLine=21364747;
 //BA.debugLineNum = 21364747;BA.debugLine="Dim meg_chatId As Long = colroot.Get(\"meg_chatI";
_meg_chatid = BA.ObjectToLongNumber(_colroot.Get((Object)("meg_chatId")));
RDebugUtils.currentLine=21364748;
 //BA.debugLineNum = 21364748;BA.debugLine="If chat_id=meg_chatId Then";
if ((_chat_id).equals(BA.NumberToString(_meg_chatid))) { 
RDebugUtils.currentLine=21364750;
 //BA.debugLineNum = 21364750;BA.debugLine="Dim meg_senderUserId As Int = colroot.Get(\"meg";
_meg_senderuserid = (int)(BA.ObjectToNumber(_colroot.Get((Object)("meg_senderUserId"))));
RDebugUtils.currentLine=21364751;
 //BA.debugLineNum = 21364751;BA.debugLine="Dim meg_editDate As Int = colroot.Get(\"meg_edi";
_meg_editdate = (int)(BA.ObjectToNumber(_colroot.Get((Object)("meg_editDate"))));
RDebugUtils.currentLine=21364752;
 //BA.debugLineNum = 21364752;BA.debugLine="Dim meg_isPost As String = colroot.Get(\"meg_is";
_meg_ispost = BA.ObjectToString(_colroot.Get((Object)("meg_isPost")));
RDebugUtils.currentLine=21364753;
 //BA.debugLineNum = 21364753;BA.debugLine="Dim meg_id As Long = colroot.Get(\"meg_id\")";
_meg_id = BA.ObjectToLongNumber(_colroot.Get((Object)("meg_id")));
RDebugUtils.currentLine=21364755;
 //BA.debugLineNum = 21364755;BA.debugLine="Dim meg_views As Int = colroot.Get(\"meg_views\"";
_meg_views = (int)(BA.ObjectToNumber(_colroot.Get((Object)("meg_views"))));
RDebugUtils.currentLine=21364756;
 //BA.debugLineNum = 21364756;BA.debugLine="Dim msg_type As String = colroot.Get(\"msg_type";
_msg_type = BA.ObjectToString(_colroot.Get((Object)("msg_type")));
RDebugUtils.currentLine=21364757;
 //BA.debugLineNum = 21364757;BA.debugLine="Dim meg_canBeDeleted As String = colroot.Get(\"";
_meg_canbedeleted = BA.ObjectToString(_colroot.Get((Object)("meg_canBeDeleted")));
RDebugUtils.currentLine=21364758;
 //BA.debugLineNum = 21364758;BA.debugLine="Dim massege_info As String = colroot.Get(\"mass";
_massege_info = BA.ObjectToString(_colroot.Get((Object)("massege_info")));
RDebugUtils.currentLine=21364759;
 //BA.debugLineNum = 21364759;BA.debugLine="Dim meg_viaBotUserId As Int = colroot.Get(\"meg";
_meg_viabotuserid = (int)(BA.ObjectToNumber(_colroot.Get((Object)("meg_viaBotUserId"))));
RDebugUtils.currentLine=21364760;
 //BA.debugLineNum = 21364760;BA.debugLine="Dim meg_date As Int = colroot.Get(\"meg_date\")";
_meg_date = (int)(BA.ObjectToNumber(_colroot.Get((Object)("meg_date"))));
RDebugUtils.currentLine=21364761;
 //BA.debugLineNum = 21364761;BA.debugLine="Dim meg_canBeEdited As String = colroot.Get(\"m";
_meg_canbeedited = BA.ObjectToString(_colroot.Get((Object)("meg_canBeEdited")));
RDebugUtils.currentLine=21364762;
 //BA.debugLineNum = 21364762;BA.debugLine="Dim ReplyMarkup As String = colroot.Get(\"Reply";
_replymarkup = BA.ObjectToString(_colroot.Get((Object)("ReplyMarkup")));
RDebugUtils.currentLine=21364763;
 //BA.debugLineNum = 21364763;BA.debugLine="Log(\"ReplyMarkup: \"&msg_type)";
anywheresoftware.b4a.keywords.Common.LogImpl("621364763","ReplyMarkup: "+_msg_type,0);
RDebugUtils.currentLine=21364765;
 //BA.debugLineNum = 21364765;BA.debugLine="Select msg_type";
switch (BA.switchObjectToInt(_msg_type,"message","photo")) {
case 0: {
RDebugUtils.currentLine=21364767;
 //BA.debugLineNum = 21364767;BA.debugLine="Dim parser_msg As JSONParser";
_parser_msg = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=21364768;
 //BA.debugLineNum = 21364768;BA.debugLine="parser_msg.Initialize(massege_info)";
_parser_msg.Initialize(_massege_info);
RDebugUtils.currentLine=21364769;
 //BA.debugLineNum = 21364769;BA.debugLine="Dim root_msg As Map = parser_msg.NextObject";
_root_msg = new anywheresoftware.b4a.objects.collections.Map();
_root_msg = _parser_msg.NextObject();
RDebugUtils.currentLine=21364770;
 //BA.debugLineNum = 21364770;BA.debugLine="Dim msg_text As String = root_msg.Get(\"msg_t";
_msg_text = BA.ObjectToString(_root_msg.Get((Object)("msg_text")));
RDebugUtils.currentLine=21364771;
 //BA.debugLineNum = 21364771;BA.debugLine="Log(msg_text)";
anywheresoftware.b4a.keywords.Common.LogImpl("621364771",_msg_text,0);
RDebugUtils.currentLine=21364772;
 //BA.debugLineNum = 21364772;BA.debugLine="Dim Item As Adapter";
_item = new com.it.fome.act_chat._adapter();
RDebugUtils.currentLine=21364773;
 //BA.debugLineNum = 21364773;BA.debugLine="Item.ViewType =Their";
_item.ViewType /*int*/  = _their;
RDebugUtils.currentLine=21364774;
 //BA.debugLineNum = 21364774;BA.debugLine="Item.TheirText = msg_text";
_item.TheirText /*String*/  = _msg_text;
RDebugUtils.currentLine=21364775;
 //BA.debugLineNum = 21364775;BA.debugLine="Item.msg_id=meg_id";
_item.msg_id /*String*/  = BA.NumberToString(_meg_id);
RDebugUtils.currentLine=21364778;
 //BA.debugLineNum = 21364778;BA.debugLine="ItemList.InsertAt(0,Item)";
mostCurrent._itemlist.InsertAt((int) (0),(Object)(_item));
RDebugUtils.currentLine=21364780;
 //BA.debugLineNum = 21364780;BA.debugLine="LV.notifyItemInserted(0)";
mostCurrent._lv.notifyItemInserted((int) (0));
RDebugUtils.currentLine=21364782;
 //BA.debugLineNum = 21364782;BA.debugLine="LV.ScrollToPosition(0)";
mostCurrent._lv.ScrollToPosition((int) (0));
RDebugUtils.currentLine=21364783;
 //BA.debugLineNum = 21364783;BA.debugLine="msg_text=\"\"";
_msg_text = "";
 break; }
case 1: {
RDebugUtils.currentLine=21364786;
 //BA.debugLineNum = 21364786;BA.debugLine="Log(\"photo\")";
anywheresoftware.b4a.keywords.Common.LogImpl("621364786","photo",0);
RDebugUtils.currentLine=21364787;
 //BA.debugLineNum = 21364787;BA.debugLine="Dim parser_photo As JSONParser";
_parser_photo = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=21364788;
 //BA.debugLineNum = 21364788;BA.debugLine="parser_photo.Initialize(massege_info)";
_parser_photo.Initialize(_massege_info);
RDebugUtils.currentLine=21364789;
 //BA.debugLineNum = 21364789;BA.debugLine="Dim root_photo As Map = parser_photo.NextObj";
_root_photo = new anywheresoftware.b4a.objects.collections.Map();
_root_photo = _parser_photo.NextObject();
RDebugUtils.currentLine=21364790;
 //BA.debugLineNum = 21364790;BA.debugLine="Dim photoid_isDownloadingCompleted As String";
_photoid_isdownloadingcompleted = BA.ObjectToString(_root_photo.Get((Object)("photoid_isDownloadingCompleted")));
RDebugUtils.currentLine=21364791;
 //BA.debugLineNum = 21364791;BA.debugLine="Dim photoid_topmsg As Int = root_photo.Get(\"";
_photoid_topmsg = (int)(BA.ObjectToNumber(_root_photo.Get((Object)("photoid_topmsg"))));
RDebugUtils.currentLine=21364792;
 //BA.debugLineNum = 21364792;BA.debugLine="Dim photoid_downloadedPrefixSize As Int = ro";
_photoid_downloadedprefixsize = (int)(BA.ObjectToNumber(_root_photo.Get((Object)("photoid_downloadedPrefixSize"))));
RDebugUtils.currentLine=21364793;
 //BA.debugLineNum = 21364793;BA.debugLine="Dim caption_topmsg As String = root_photo.Ge";
_caption_topmsg = BA.ObjectToString(_root_photo.Get((Object)("caption_topmsg")));
RDebugUtils.currentLine=21364794;
 //BA.debugLineNum = 21364794;BA.debugLine="Dim photoid_path As String = root_photo.Get(";
_photoid_path = BA.ObjectToString(_root_photo.Get((Object)("photoid_path")));
RDebugUtils.currentLine=21364795;
 //BA.debugLineNum = 21364795;BA.debugLine="Dim photoid_downloadedSize As Int = root_pho";
_photoid_downloadedsize = (int)(BA.ObjectToNumber(_root_photo.Get((Object)("photoid_downloadedSize"))));
RDebugUtils.currentLine=21364796;
 //BA.debugLineNum = 21364796;BA.debugLine="Dim photoid_height As Int = root_photo.Get(\"";
_photoid_height = (int)(BA.ObjectToNumber(_root_photo.Get((Object)("photoid_height"))));
RDebugUtils.currentLine=21364797;
 //BA.debugLineNum = 21364797;BA.debugLine="Dim photoid_type As String = root_photo.Get(";
_photoid_type = BA.ObjectToString(_root_photo.Get((Object)("photoid_type")));
RDebugUtils.currentLine=21364798;
 //BA.debugLineNum = 21364798;BA.debugLine="Dim photoid_size As Int = root_photo.Get(\"ph";
_photoid_size = (int)(BA.ObjectToNumber(_root_photo.Get((Object)("photoid_size"))));
RDebugUtils.currentLine=21364799;
 //BA.debugLineNum = 21364799;BA.debugLine="Dim caption_id As String = root_photo.Get(\"c";
_caption_id = BA.ObjectToString(_root_photo.Get((Object)("caption_id")));
RDebugUtils.currentLine=21364800;
 //BA.debugLineNum = 21364800;BA.debugLine="Dim photoid_width As Int = root_photo.Get(\"p";
_photoid_width = (int)(BA.ObjectToNumber(_root_photo.Get((Object)("photoid_width"))));
RDebugUtils.currentLine=21364801;
 //BA.debugLineNum = 21364801;BA.debugLine="Dim photoid_isDownloadingActive As String =";
_photoid_isdownloadingactive = BA.ObjectToString(_root_photo.Get((Object)("photoid_isDownloadingActive")));
RDebugUtils.currentLine=21364802;
 //BA.debugLineNum = 21364802;BA.debugLine="Dim photoid_remote As String = root_photo.Ge";
_photoid_remote = BA.ObjectToString(_root_photo.Get((Object)("photoid_remote")));
RDebugUtils.currentLine=21364803;
 //BA.debugLineNum = 21364803;BA.debugLine="Dim photoid_canBeDownloaded As String = root";
_photoid_canbedownloaded = BA.ObjectToString(_root_photo.Get((Object)("photoid_canBeDownloaded")));
RDebugUtils.currentLine=21364804;
 //BA.debugLineNum = 21364804;BA.debugLine="Dim photoid_canBeDeleted As String = root_ph";
_photoid_canbedeleted = BA.ObjectToString(_root_photo.Get((Object)("photoid_canBeDeleted")));
RDebugUtils.currentLine=21364808;
 //BA.debugLineNum = 21364808;BA.debugLine="Log(\"path \"&caption_topmsg)";
anywheresoftware.b4a.keywords.Common.LogImpl("621364808","path "+_caption_topmsg,0);
RDebugUtils.currentLine=21364809;
 //BA.debugLineNum = 21364809;BA.debugLine="If photoid_path=\"\" Then";
if ((_photoid_path).equals("")) { 
RDebugUtils.currentLine=21364810;
 //BA.debugLineNum = 21364810;BA.debugLine="LogColor(\"in downloading\",Colors.Red)";
anywheresoftware.b4a.keywords.Common.LogImpl("621364810","in downloading",anywheresoftware.b4a.keywords.Common.Colors.Red);
RDebugUtils.currentLine=21364814;
 //BA.debugLineNum = 21364814;BA.debugLine="Dim Item As Adapter";
_item = new com.it.fome.act_chat._adapter();
RDebugUtils.currentLine=21364815;
 //BA.debugLineNum = 21364815;BA.debugLine="Item.ViewType =MINEST";
_item.ViewType /*int*/  = _minest;
RDebugUtils.currentLine=21364816;
 //BA.debugLineNum = 21364816;BA.debugLine="Item.img_my = \"\"";
_item.img_my /*String*/  = "";
RDebugUtils.currentLine=21364818;
 //BA.debugLineNum = 21364818;BA.debugLine="If caption_topmsg=\"null\" Then";
if ((_caption_topmsg).equals("null")) { 
 }else {
RDebugUtils.currentLine=21364820;
 //BA.debugLineNum = 21364820;BA.debugLine="Item.caption_topmsg=caption_topmsg";
_item.caption_topmsg /*String*/  = _caption_topmsg;
 };
RDebugUtils.currentLine=21364823;
 //BA.debugLineNum = 21364823;BA.debugLine="Item.img_isdwonload=photoid_isDownloadingCo";
_item.img_isdwonload /*String*/  = _photoid_isdownloadingcompleted;
RDebugUtils.currentLine=21364824;
 //BA.debugLineNum = 21364824;BA.debugLine="Item.img_remote=photoid_remote";
_item.img_remote /*String*/  = _photoid_remote;
RDebugUtils.currentLine=21364825;
 //BA.debugLineNum = 21364825;BA.debugLine="Item.msg_id=meg_id";
_item.msg_id /*String*/  = BA.NumberToString(_meg_id);
RDebugUtils.currentLine=21364826;
 //BA.debugLineNum = 21364826;BA.debugLine="Item.img_id=photoid_topmsg";
_item.img_id /*String*/  = BA.NumberToString(_photoid_topmsg);
RDebugUtils.currentLine=21364829;
 //BA.debugLineNum = 21364829;BA.debugLine="ItemList.InsertAt(0,Item)";
mostCurrent._itemlist.InsertAt((int) (0),(Object)(_item));
RDebugUtils.currentLine=21364832;
 //BA.debugLineNum = 21364832;BA.debugLine="LV.notifyDataSetChanged";
mostCurrent._lv.notifyDataSetChanged();
RDebugUtils.currentLine=21364834;
 //BA.debugLineNum = 21364834;BA.debugLine="LV.SmoothScrollToPosition(0)";
mostCurrent._lv.SmoothScrollToPosition((int) (0));
 }else {
RDebugUtils.currentLine=21364847;
 //BA.debugLineNum = 21364847;BA.debugLine="Log(photoid_path)";
anywheresoftware.b4a.keywords.Common.LogImpl("621364847",_photoid_path,0);
RDebugUtils.currentLine=21364848;
 //BA.debugLineNum = 21364848;BA.debugLine="Dim Item As Adapter";
_item = new com.it.fome.act_chat._adapter();
RDebugUtils.currentLine=21364849;
 //BA.debugLineNum = 21364849;BA.debugLine="Item.ViewType =MINEST";
_item.ViewType /*int*/  = _minest;
RDebugUtils.currentLine=21364850;
 //BA.debugLineNum = 21364850;BA.debugLine="Item.img_my = photoid_path";
_item.img_my /*String*/  = _photoid_path;
RDebugUtils.currentLine=21364851;
 //BA.debugLineNum = 21364851;BA.debugLine="Item.img_id=photoid_topmsg";
_item.img_id /*String*/  = BA.NumberToString(_photoid_topmsg);
RDebugUtils.currentLine=21364852;
 //BA.debugLineNum = 21364852;BA.debugLine="Item.msg_id=meg_id";
_item.msg_id /*String*/  = BA.NumberToString(_meg_id);
RDebugUtils.currentLine=21364853;
 //BA.debugLineNum = 21364853;BA.debugLine="If caption_topmsg=\"null\" Then";
if ((_caption_topmsg).equals("null")) { 
 }else {
RDebugUtils.currentLine=21364855;
 //BA.debugLineNum = 21364855;BA.debugLine="Item.caption_topmsg=caption_topmsg";
_item.caption_topmsg /*String*/  = _caption_topmsg;
 };
RDebugUtils.currentLine=21364859;
 //BA.debugLineNum = 21364859;BA.debugLine="Item.img_remote=photoid_remote";
_item.img_remote /*String*/  = _photoid_remote;
RDebugUtils.currentLine=21364860;
 //BA.debugLineNum = 21364860;BA.debugLine="Item.img_isdwonload=photoid_isDownloadingCo";
_item.img_isdwonload /*String*/  = _photoid_isdownloadingcompleted;
RDebugUtils.currentLine=21364862;
 //BA.debugLineNum = 21364862;BA.debugLine="ItemList.InsertAt(0,Item)";
mostCurrent._itemlist.InsertAt((int) (0),(Object)(_item));
RDebugUtils.currentLine=21364866;
 //BA.debugLineNum = 21364866;BA.debugLine="LV.notifyItemInserted(0)";
mostCurrent._lv.notifyItemInserted((int) (0));
RDebugUtils.currentLine=21364868;
 //BA.debugLineNum = 21364868;BA.debugLine="LV.SmoothScrollToPosition(0)";
mostCurrent._lv.SmoothScrollToPosition((int) (0));
 };
 break; }
}
;
 };
 }
};
 };
RDebugUtils.currentLine=21364886;
 //BA.debugLineNum = 21364886;BA.debugLine="End Sub";
return "";
}
public static String  _telegs_viewdon(String _value) throws Exception{
RDebugUtils.currentModule="act_chat";
if (Debug.shouldDelegate(mostCurrent.activityBA, "telegs_viewdon", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "telegs_viewdon", new Object[] {_value}));}
RDebugUtils.currentLine=21692416;
 //BA.debugLineNum = 21692416;BA.debugLine="Sub telegs_viewdon(value As String)";
RDebugUtils.currentLine=21692417;
 //BA.debugLineNum = 21692417;BA.debugLine="LogColor(\"view : \"&value,Colors.Blue)";
anywheresoftware.b4a.keywords.Common.LogImpl("621692417","view : "+_value,anywheresoftware.b4a.keywords.Common.Colors.Blue);
RDebugUtils.currentLine=21692418;
 //BA.debugLineNum = 21692418;BA.debugLine="End Sub";
return "";
}
public static String  _timer_tick() throws Exception{
RDebugUtils.currentModule="act_chat";
if (Debug.shouldDelegate(mostCurrent.activityBA, "timer_tick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "timer_tick", null));}
RDebugUtils.currentLine=20316160;
 //BA.debugLineNum = 20316160;BA.debugLine="Sub Timer_Tick";
RDebugUtils.currentLine=20316161;
 //BA.debugLineNum = 20316161;BA.debugLine="Timer.Enabled = False";
_timer.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=20316162;
 //BA.debugLineNum = 20316162;BA.debugLine="AutoAnswer";
_autoanswer();
RDebugUtils.currentLine=20316163;
 //BA.debugLineNum = 20316163;BA.debugLine="End Sub";
return "";
}
public static String  _timer2_tick() throws Exception{
RDebugUtils.currentModule="act_chat";
if (Debug.shouldDelegate(mostCurrent.activityBA, "timer2_tick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "timer2_tick", null));}
RDebugUtils.currentLine=20381696;
 //BA.debugLineNum = 20381696;BA.debugLine="Sub Timer2_Tick";
RDebugUtils.currentLine=20381697;
 //BA.debugLineNum = 20381697;BA.debugLine="Timer2.Enabled = False";
_timer2.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=20381698;
 //BA.debugLineNum = 20381698;BA.debugLine="AutoAnswer2";
_autoanswer2();
RDebugUtils.currentLine=20381699;
 //BA.debugLineNum = 20381699;BA.debugLine="End Sub";
return "";
}
public static String  _tm_tick() throws Exception{
RDebugUtils.currentModule="act_chat";
if (Debug.shouldDelegate(mostCurrent.activityBA, "tm_tick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "tm_tick", null));}
RDebugUtils.currentLine=20578304;
 //BA.debugLineNum = 20578304;BA.debugLine="Sub TM_Tick";
RDebugUtils.currentLine=20578305;
 //BA.debugLineNum = 20578305;BA.debugLine="q = q + 1";
_q = (int) (_q+1);
RDebugUtils.currentLine=20578306;
 //BA.debugLineNum = 20578306;BA.debugLine="q2 = q2 + 1";
_q2 = (int) (_q2+1);
RDebugUtils.currentLine=20578307;
 //BA.debugLineNum = 20578307;BA.debugLine="If q = 1 Then Status.Text = \"is typing\"";
if (_q==1) { 
mostCurrent._status.setText(BA.ObjectToCharSequence("is typing"));};
RDebugUtils.currentLine=20578308;
 //BA.debugLineNum = 20578308;BA.debugLine="If q = 2 Then Status.Text = \"is typing .\"";
if (_q==2) { 
mostCurrent._status.setText(BA.ObjectToCharSequence("is typing ."));};
RDebugUtils.currentLine=20578309;
 //BA.debugLineNum = 20578309;BA.debugLine="If q = 3 Then Status.Text = \"is typing ..\"";
if (_q==3) { 
mostCurrent._status.setText(BA.ObjectToCharSequence("is typing .."));};
RDebugUtils.currentLine=20578310;
 //BA.debugLineNum = 20578310;BA.debugLine="If q = 4 Then Status.Text = \"is typing ...\"";
if (_q==4) { 
mostCurrent._status.setText(BA.ObjectToCharSequence("is typing ..."));};
RDebugUtils.currentLine=20578311;
 //BA.debugLineNum = 20578311;BA.debugLine="If q > 4 Then q = 0";
if (_q>4) { 
_q = (int) (0);};
RDebugUtils.currentLine=20578312;
 //BA.debugLineNum = 20578312;BA.debugLine="If q2 = 20 Then";
if (_q2==20) { 
RDebugUtils.currentLine=20578313;
 //BA.debugLineNum = 20578313;BA.debugLine="tm.Enabled = False";
_tm.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=20578314;
 //BA.debugLineNum = 20578314;BA.debugLine="LV.notifyItemAdded";
mostCurrent._lv.notifyItemAdded();
RDebugUtils.currentLine=20578315;
 //BA.debugLineNum = 20578315;BA.debugLine="LV.SmoothScrollToPosition(ItemList.Size)";
mostCurrent._lv.SmoothScrollToPosition(mostCurrent._itemlist.getSize());
RDebugUtils.currentLine=20578316;
 //BA.debugLineNum = 20578316;BA.debugLine="Status.Text = \"online\"";
mostCurrent._status.setText(BA.ObjectToCharSequence("online"));
RDebugUtils.currentLine=20578317;
 //BA.debugLineNum = 20578317;BA.debugLine="q2 = 0";
_q2 = (int) (0);
 };
RDebugUtils.currentLine=20578319;
 //BA.debugLineNum = 20578319;BA.debugLine="End Sub";
return "";
}
}