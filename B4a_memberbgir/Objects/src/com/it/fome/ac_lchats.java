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

public class ac_lchats extends Activity implements B4AActivity{
	public static ac_lchats mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "com.it.fome", "com.it.fome.ac_lchats");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (ac_lchats).");
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
		activityBA = new BA(this, layout, processBA, "com.it.fome", "com.it.fome.ac_lchats");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "com.it.fome.ac_lchats", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (ac_lchats) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (ac_lchats) Resume **");
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
		return ac_lchats.class;
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
        BA.LogInfo("** Activity (ac_lchats) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            ac_lchats mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (ac_lchats) Resume **");
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
public static class _adap_chats{
public boolean IsInitialized;
public long chat_id;
public String img_isdwonload;
public String img_remote;
public String img_id;
public String img_my;
public String title;
public String topmsg_info;
public String topdate;
public String chat_type;
public String ChatConstructor;
public String channel_info;
public String group_info;
public String privatechat_info;
public String topmasg_type;
public int unreadCount;
public int photoid;
public void Initialize() {
IsInitialized = true;
chat_id = 0L;
img_isdwonload = "";
img_remote = "";
img_id = "";
img_my = "";
title = "";
topmsg_info = "";
topdate = "";
chat_type = "";
ChatConstructor = "";
channel_info = "";
group_info = "";
privatechat_info = "";
topmasg_type = "";
unreadCount = 0;
photoid = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.objects.collections.List _listchats = null;
public static com.mili.telegrams.teleg_warp _telegs = null;
public static anywheresoftware.b4a.sql.SQL _sql1 = null;
public static anywheresoftware.b4a.sql.SQL.CursorWrapper _cursor1 = null;
public static String _username_t = "";
public static String _userid_t = "";
public static String _chatid = "";
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
public com.it.fome.mi_meno _mimeno = null;
public static String _us_name = "";
public b4a.example.dateutils _dateutils = null;
public com.it.fome.main _main = null;
public com.it.fome.ac_telelogin _ac_telelogin = null;
public com.it.fome.ac_shop _ac_shop = null;
public com.it.fome.ac_tansfer _ac_tansfer = null;
public com.it.fome.firebasemessaging _firebasemessaging = null;
public com.it.fome.ac_tselect _ac_tselect = null;
public com.it.fome.ac_tfreecoin _ac_tfreecoin = null;
public com.it.fome.ac_hsef _ac_hsef = null;
public com.it.fome.ac_tsearch _ac_tsearch = null;
public com.it.fome.ac_tcoin _ac_tcoin = null;
public com.it.fome.ac_home _ac_home = null;
public com.it.fome.act_chat _act_chat = null;
public com.it.fome.starter _starter = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="ac_lchats";
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
anywheresoftware.b4a.objects.LabelWrapper _lbl_addchannel = null;
RDebugUtils.currentLine=9502720;
 //BA.debugLineNum = 9502720;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=9502724;
 //BA.debugLineNum = 9502724;BA.debugLine="If File.Exists(File.DirInternal,\"instadb.db\")=Fal";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"instadb.db")==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=9502725;
 //BA.debugLineNum = 9502725;BA.debugLine="File.Copy(File.DirAssets,\"instadb.db\",File.DirIn";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"instadb.db",anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"instadb.db");
 };
RDebugUtils.currentLine=9502727;
 //BA.debugLineNum = 9502727;BA.debugLine="If sql1.IsInitialized=False Then";
if (_sql1.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=9502728;
 //BA.debugLineNum = 9502728;BA.debugLine="sql1.Initialize(File.DirInternal,\"instadb.db\",Fa";
_sql1.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"instadb.db",anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=9502740;
 //BA.debugLineNum = 9502740;BA.debugLine="cursor1 = sql1.ExecQuery(\"SELECT * FROM tbl_tele";
_cursor1.setObject((android.database.Cursor)(_sql1.ExecQuery("SELECT * FROM tbl_tele WHERE soich='1'")));
RDebugUtils.currentLine=9502741;
 //BA.debugLineNum = 9502741;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=9502742;
 //BA.debugLineNum = 9502742;BA.debugLine="For i=0 To cursor1.RowCount-1";
{
final int step9 = 1;
final int limit9 = (int) (_cursor1.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
RDebugUtils.currentLine=9502743;
 //BA.debugLineNum = 9502743;BA.debugLine="cursor1.Position=i";
_cursor1.setPosition(_i);
RDebugUtils.currentLine=9502744;
 //BA.debugLineNum = 9502744;BA.debugLine="userid_t=cursor1.GetString(\"userid\")";
_userid_t = _cursor1.GetString("userid");
RDebugUtils.currentLine=9502745;
 //BA.debugLineNum = 9502745;BA.debugLine="username_t=cursor1.GetString(\"username\")";
_username_t = _cursor1.GetString("username");
 }
};
RDebugUtils.currentLine=9502747;
 //BA.debugLineNum = 9502747;BA.debugLine="cursor1.Close";
_cursor1.Close();
RDebugUtils.currentLine=9502749;
 //BA.debugLineNum = 9502749;BA.debugLine="listchats.Initialize";
_listchats.Initialize();
RDebugUtils.currentLine=9502751;
 //BA.debugLineNum = 9502751;BA.debugLine="Dim Gradient1 As GradientDrawable";
_gradient1 = new anywheresoftware.b4a.objects.drawable.GradientDrawable();
RDebugUtils.currentLine=9502752;
 //BA.debugLineNum = 9502752;BA.debugLine="Dim Clrs(5) As Int";
_clrs = new int[(int) (5)];
;
RDebugUtils.currentLine=9502753;
 //BA.debugLineNum = 9502753;BA.debugLine="Clrs(0) = 0xFFe8eaf6";
_clrs[(int) (0)] = (int) (0xffe8eaf6);
RDebugUtils.currentLine=9502754;
 //BA.debugLineNum = 9502754;BA.debugLine="Clrs(1) = 0xFFe8eaf6";
_clrs[(int) (1)] = (int) (0xffe8eaf6);
RDebugUtils.currentLine=9502755;
 //BA.debugLineNum = 9502755;BA.debugLine="Clrs(2) = 0xFFe8eaf6";
_clrs[(int) (2)] = (int) (0xffe8eaf6);
RDebugUtils.currentLine=9502756;
 //BA.debugLineNum = 9502756;BA.debugLine="Clrs(3) = 0xFF283593";
_clrs[(int) (3)] = (int) (0xff283593);
RDebugUtils.currentLine=9502757;
 //BA.debugLineNum = 9502757;BA.debugLine="Clrs(4) = 0xFF283593";
_clrs[(int) (4)] = (int) (0xff283593);
RDebugUtils.currentLine=9502759;
 //BA.debugLineNum = 9502759;BA.debugLine="Gradient1.Initialize(\"TOP_BOTTOM\", Clrs)";
_gradient1.Initialize(BA.getEnumFromString(android.graphics.drawable.GradientDrawable.Orientation.class,"TOP_BOTTOM"),_clrs);
RDebugUtils.currentLine=9502760;
 //BA.debugLineNum = 9502760;BA.debugLine="Activity.Background=Gradient1";
mostCurrent._activity.setBackground((android.graphics.drawable.Drawable)(_gradient1.getObject()));
RDebugUtils.currentLine=9502762;
 //BA.debugLineNum = 9502762;BA.debugLine="Dim bkcolor As ColorDrawable";
_bkcolor = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=9502763;
 //BA.debugLineNum = 9502763;BA.debugLine="bkcolor.Initialize2(Colors.White,15,2dip,Colors.L";
_bkcolor.Initialize2(anywheresoftware.b4a.keywords.Common.Colors.White,(int) (15),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (2)),anywheresoftware.b4a.keywords.Common.Colors.LightGray);
RDebugUtils.currentLine=9502764;
 //BA.debugLineNum = 9502764;BA.debugLine="meno.Initialize(\"meno\")";
mostCurrent._meno.Initialize(mostCurrent.activityBA,"meno");
RDebugUtils.currentLine=9502765;
 //BA.debugLineNum = 9502765;BA.debugLine="meno.TextColor=Colors.DarkGray";
mostCurrent._meno.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.DarkGray);
RDebugUtils.currentLine=9502766;
 //BA.debugLineNum = 9502766;BA.debugLine="meno.TextSize=37";
mostCurrent._meno.setTextSize((float) (37));
RDebugUtils.currentLine=9502767;
 //BA.debugLineNum = 9502767;BA.debugLine="meno.Background=bkcolor";
mostCurrent._meno.setBackground((android.graphics.drawable.Drawable)(_bkcolor.getObject()));
RDebugUtils.currentLine=9502768;
 //BA.debugLineNum = 9502768;BA.debugLine="meno.Typeface=Typeface.MATERIALICONS";
mostCurrent._meno.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.getMATERIALICONS());
RDebugUtils.currentLine=9502769;
 //BA.debugLineNum = 9502769;BA.debugLine="meno.Text=Chr(0xE3C7)";
mostCurrent._meno.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr((int) (0xe3c7))));
RDebugUtils.currentLine=9502770;
 //BA.debugLineNum = 9502770;BA.debugLine="meno.Gravity=Gravity.CENTER_HORIZONTAL+Gravity.CE";
mostCurrent._meno.setGravity((int) (anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL+anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=9502771;
 //BA.debugLineNum = 9502771;BA.debugLine="Activity.AddView(meno,3%x,3%x,12%x,12%x)";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._meno.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (3),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (3),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (12),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (12),mostCurrent.activityBA));
RDebugUtils.currentLine=9502773;
 //BA.debugLineNum = 9502773;BA.debugLine="pnl_coins.Initialize(\"pnl_coins\")";
mostCurrent._pnl_coins.Initialize(mostCurrent.activityBA,"pnl_coins");
RDebugUtils.currentLine=9502774;
 //BA.debugLineNum = 9502774;BA.debugLine="Activity.AddView(pnl_coins,50%x,3%x,50%x,12%x)";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._pnl_coins.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (50),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (3),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (50),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (12),mostCurrent.activityBA));
RDebugUtils.currentLine=9502775;
 //BA.debugLineNum = 9502775;BA.debugLine="roundview.Initialize(pnl_coins)";
mostCurrent._roundview.Initialize(processBA,(android.view.View)(mostCurrent._pnl_coins.getObject()));
RDebugUtils.currentLine=9502776;
 //BA.debugLineNum = 9502776;BA.debugLine="roundview.CornerRadius_BL=10%x";
mostCurrent._roundview.setCornerRadius_BL(anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA));
RDebugUtils.currentLine=9502777;
 //BA.debugLineNum = 9502777;BA.debugLine="roundview.CornerRadius_TL=10%x";
mostCurrent._roundview.setCornerRadius_TL(anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA));
RDebugUtils.currentLine=9502778;
 //BA.debugLineNum = 9502778;BA.debugLine="roundview.BackgroundColor=Colors.White";
mostCurrent._roundview.setBackgroundColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=9502780;
 //BA.debugLineNum = 9502780;BA.debugLine="Dim bkcolor_st As ColorDrawable";
_bkcolor_st = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=9502781;
 //BA.debugLineNum = 9502781;BA.debugLine="bkcolor_st.Initialize2(0xFFC67D00,50,4dip,0x82FFE";
_bkcolor_st.Initialize2((int) (0xffc67d00),(int) (50),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (4)),(int) (0x82ffe300));
RDebugUtils.currentLine=9502783;
 //BA.debugLineNum = 9502783;BA.debugLine="Dim pnlb1 As Panel";
_pnlb1 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=9502784;
 //BA.debugLineNum = 9502784;BA.debugLine="pnlb1.Initialize(\"\")";
_pnlb1.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=9502785;
 //BA.debugLineNum = 9502785;BA.debugLine="pnlb1.Color=0xFFFFC300";
_pnlb1.setColor((int) (0xffffc300));
RDebugUtils.currentLine=9502786;
 //BA.debugLineNum = 9502786;BA.debugLine="pnlb1.Background=bkcolor_st";
_pnlb1.setBackground((android.graphics.drawable.Drawable)(_bkcolor_st.getObject()));
RDebugUtils.currentLine=9502787;
 //BA.debugLineNum = 9502787;BA.debugLine="pnl_coins.AddView(pnlb1,pnl_coins.Width-11%x,1%x,";
mostCurrent._pnl_coins.AddView((android.view.View)(_pnlb1.getObject()),(int) (mostCurrent._pnl_coins.getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (11),mostCurrent.activityBA)),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (1),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA),(int) (mostCurrent._pnl_coins.getHeight()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (2),mostCurrent.activityBA)));
RDebugUtils.currentLine=9502789;
 //BA.debugLineNum = 9502789;BA.debugLine="lbl_icon.Initialize(\"lbl_icon\")";
mostCurrent._lbl_icon.Initialize(mostCurrent.activityBA,"lbl_icon");
RDebugUtils.currentLine=9502790;
 //BA.debugLineNum = 9502790;BA.debugLine="lbl_icon.SetBackgroundImage(LoadBitmap(File.DirAs";
mostCurrent._lbl_icon.SetBackgroundImageNew((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"coins.png").getObject()));
RDebugUtils.currentLine=9502791;
 //BA.debugLineNum = 9502791;BA.debugLine="pnl_coins.AddView(lbl_icon,pnl_coins.Width-9%x,pn";
mostCurrent._pnl_coins.AddView((android.view.View)(mostCurrent._lbl_icon.getObject()),(int) (mostCurrent._pnl_coins.getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (9),mostCurrent.activityBA)),(int) (mostCurrent._pnl_coins.getHeight()/(double)2/(double)2),(int) (mostCurrent._pnl_coins.getHeight()/(double)2),(int) (mostCurrent._pnl_coins.getHeight()/(double)2));
RDebugUtils.currentLine=9502793;
 //BA.debugLineNum = 9502793;BA.debugLine="lbl_nums.Initialize(\"lbl_nums\")";
mostCurrent._lbl_nums.Initialize(mostCurrent.activityBA,"lbl_nums");
RDebugUtils.currentLine=9502794;
 //BA.debugLineNum = 9502794;BA.debugLine="lbl_nums.TextColor=Colors.DarkGray";
mostCurrent._lbl_nums.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.DarkGray);
RDebugUtils.currentLine=9502795;
 //BA.debugLineNum = 9502795;BA.debugLine="lbl_nums.TextSize=20";
mostCurrent._lbl_nums.setTextSize((float) (20));
RDebugUtils.currentLine=9502796;
 //BA.debugLineNum = 9502796;BA.debugLine="lbl_nums.Typeface=Typeface.LoadFromAssets(\"iran_s";
mostCurrent._lbl_nums.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("iran_sans.ttf"));
RDebugUtils.currentLine=9502797;
 //BA.debugLineNum = 9502797;BA.debugLine="lbl_nums.Text=0&\" سکه\"";
mostCurrent._lbl_nums.setText(BA.ObjectToCharSequence(BA.NumberToString(0)+" سکه"));
RDebugUtils.currentLine=9502798;
 //BA.debugLineNum = 9502798;BA.debugLine="lbl_nums.Gravity=Gravity.CENTER_VERTICAL+Gravity.";
mostCurrent._lbl_nums.setGravity((int) (anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL+anywheresoftware.b4a.keywords.Common.Gravity.RIGHT));
RDebugUtils.currentLine=9502799;
 //BA.debugLineNum = 9502799;BA.debugLine="pnl_coins.AddView(lbl_nums,2%x,0,pnl_coins.Width-";
mostCurrent._pnl_coins.AddView((android.view.View)(mostCurrent._lbl_nums.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (2),mostCurrent.activityBA),(int) (0),(int) (mostCurrent._pnl_coins.getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (15),mostCurrent.activityBA)),mostCurrent._pnl_coins.getHeight());
RDebugUtils.currentLine=9502801;
 //BA.debugLineNum = 9502801;BA.debugLine="Dim bg As ColorDrawable";
_bg = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=9502802;
 //BA.debugLineNum = 9502802;BA.debugLine="bg.Initialize2(Colors.White,5dip,2dip,Colors.Ligh";
_bg.Initialize2(anywheresoftware.b4a.keywords.Common.Colors.White,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (5)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (2)),anywheresoftware.b4a.keywords.Common.Colors.LightGray);
RDebugUtils.currentLine=9502803;
 //BA.debugLineNum = 9502803;BA.debugLine="pnl_lv.Initialize(\"pnl_lv\")";
mostCurrent._pnl_lv.Initialize(mostCurrent.activityBA,"pnl_lv");
RDebugUtils.currentLine=9502804;
 //BA.debugLineNum = 9502804;BA.debugLine="pnl_lv.Background=bg";
mostCurrent._pnl_lv.setBackground((android.graphics.drawable.Drawable)(_bg.getObject()));
RDebugUtils.currentLine=9502805;
 //BA.debugLineNum = 9502805;BA.debugLine="Activity.AddView(pnl_lv,5%x,12%y,100%x-10%x,90%y-";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._pnl_lv.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (12),mostCurrent.activityBA),(int) (anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA)-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA)),(int) (anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (90),mostCurrent.activityBA)-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (7),mostCurrent.activityBA)));
RDebugUtils.currentLine=9502807;
 //BA.debugLineNum = 9502807;BA.debugLine="Dim lbl_a As Label";
_lbl_a = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=9502808;
 //BA.debugLineNum = 9502808;BA.debugLine="lbl_a.Initialize(\"lbl_a\")";
_lbl_a.Initialize(mostCurrent.activityBA,"lbl_a");
RDebugUtils.currentLine=9502809;
 //BA.debugLineNum = 9502809;BA.debugLine="lbl_a.TextColor=Colors.DarkGray";
_lbl_a.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.DarkGray);
RDebugUtils.currentLine=9502810;
 //BA.debugLineNum = 9502810;BA.debugLine="lbl_a.TextSize=20";
_lbl_a.setTextSize((float) (20));
RDebugUtils.currentLine=9502811;
 //BA.debugLineNum = 9502811;BA.debugLine="lbl_a.Typeface=Typeface.LoadFromAssets(\"iran_sans";
_lbl_a.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("iran_sans.ttf"));
RDebugUtils.currentLine=9502812;
 //BA.debugLineNum = 9502812;BA.debugLine="lbl_a.Text=\"کانال های شما\"";
_lbl_a.setText(BA.ObjectToCharSequence("کانال های شما"));
RDebugUtils.currentLine=9502813;
 //BA.debugLineNum = 9502813;BA.debugLine="lbl_a.Gravity=Gravity.CENTER_VERTICAL+Gravity.CEN";
_lbl_a.setGravity((int) (anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL+anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL));
RDebugUtils.currentLine=9502814;
 //BA.debugLineNum = 9502814;BA.debugLine="pnl_lv.AddView(lbl_a,5%x,0,pnl_lv.Width-10%x,10%x";
mostCurrent._pnl_lv.AddView((android.view.View)(_lbl_a.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA),(int) (0),(int) (mostCurrent._pnl_lv.getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA)),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA));
RDebugUtils.currentLine=9502816;
 //BA.debugLineNum = 9502816;BA.debugLine="Dim bg As ColorDrawable";
_bg = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=9502817;
 //BA.debugLineNum = 9502817;BA.debugLine="bg.Initialize2(0xFF0072FF,5dip,2dip,0xFF003BFF)";
_bg.Initialize2((int) (0xff0072ff),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (5)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (2)),(int) (0xff003bff));
RDebugUtils.currentLine=9502819;
 //BA.debugLineNum = 9502819;BA.debugLine="Dim lbl_addchannel As Label";
_lbl_addchannel = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=9502820;
 //BA.debugLineNum = 9502820;BA.debugLine="lbl_addchannel.Initialize(\"lbl_addchannel\")";
_lbl_addchannel.Initialize(mostCurrent.activityBA,"lbl_addchannel");
RDebugUtils.currentLine=9502821;
 //BA.debugLineNum = 9502821;BA.debugLine="lbl_addchannel.TextColor=Colors.White";
_lbl_addchannel.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=9502822;
 //BA.debugLineNum = 9502822;BA.debugLine="lbl_addchannel.TextSize=20";
_lbl_addchannel.setTextSize((float) (20));
RDebugUtils.currentLine=9502823;
 //BA.debugLineNum = 9502823;BA.debugLine="lbl_addchannel.Background=bg";
_lbl_addchannel.setBackground((android.graphics.drawable.Drawable)(_bg.getObject()));
RDebugUtils.currentLine=9502824;
 //BA.debugLineNum = 9502824;BA.debugLine="lbl_addchannel.Typeface=Typeface.LoadFromAssets(\"";
_lbl_addchannel.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("iran_sans.ttf"));
RDebugUtils.currentLine=9502825;
 //BA.debugLineNum = 9502825;BA.debugLine="lbl_addchannel.Text=\"ثبت کانال جدید\"";
_lbl_addchannel.setText(BA.ObjectToCharSequence("ثبت کانال جدید"));
RDebugUtils.currentLine=9502826;
 //BA.debugLineNum = 9502826;BA.debugLine="lbl_addchannel.Gravity=Gravity.CENTER_VERTICAL+Gr";
_lbl_addchannel.setGravity((int) (anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL+anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL));
RDebugUtils.currentLine=9502827;
 //BA.debugLineNum = 9502827;BA.debugLine="pnl_lv.AddView(lbl_addchannel,5%x,lbl_a.Top+lbl_a";
mostCurrent._pnl_lv.AddView((android.view.View)(_lbl_addchannel.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA),(int) (_lbl_a.getTop()+_lbl_a.getHeight()+anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (2),mostCurrent.activityBA)),(int) (mostCurrent._pnl_lv.getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA)),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA));
RDebugUtils.currentLine=9502829;
 //BA.debugLineNum = 9502829;BA.debugLine="LV.Initializer(\"LV\").ListView.FastScrollType(2).B";
mostCurrent._lv.Initializer(mostCurrent.activityBA,"LV").ListView().FastScrollType((int) (2)).Build();
RDebugUtils.currentLine=9502830;
 //BA.debugLineNum = 9502830;BA.debugLine="pnl_lv.AddView(LV,0,lbl_addchannel.Top+lbl_addcha";
mostCurrent._pnl_lv.AddView((android.view.View)(mostCurrent._lv.getObject()),(int) (0),(int) (_lbl_addchannel.getTop()+_lbl_addchannel.getHeight()+anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (2),mostCurrent.activityBA)),mostCurrent._pnl_lv.getWidth(),(int) (mostCurrent._pnl_lv.getHeight()-_lbl_addchannel.getTop()-_lbl_addchannel.getHeight()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (3),mostCurrent.activityBA)));
RDebugUtils.currentLine=9502831;
 //BA.debugLineNum = 9502831;BA.debugLine="LV.CardView.CardElevation(4dip).Radius(2dip)";
mostCurrent._lv.CardView().CardElevation((float) (anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (4)))).Radius((float) (anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (2))));
RDebugUtils.currentLine=9502832;
 //BA.debugLineNum = 9502832;BA.debugLine="LV.Show";
mostCurrent._lv.Show();
RDebugUtils.currentLine=9502835;
 //BA.debugLineNum = 9502835;BA.debugLine="telegs.Initialize(\"telegs\")";
_telegs.Initialize(processBA,"telegs");
RDebugUtils.currentLine=9502836;
 //BA.debugLineNum = 9502836;BA.debugLine="telegs.getChats(0,0,100)";
_telegs.getChats((long) (0),(long) (0),(int) (100));
RDebugUtils.currentLine=9502839;
 //BA.debugLineNum = 9502839;BA.debugLine="req_getme(userid_t)";
_req_getme(_userid_t);
RDebugUtils.currentLine=9502841;
 //BA.debugLineNum = 9502841;BA.debugLine="End Sub";
return "";
}
public static String  _req_getme(String _userid) throws Exception{
RDebugUtils.currentModule="ac_lchats";
if (Debug.shouldDelegate(mostCurrent.activityBA, "req_getme", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "req_getme", new Object[] {_userid}));}
com.reza.sh.fastnet.Fastnet _prfn = null;
com.reza.sh.fastnet.PostRequestRaper _post = null;
RDebugUtils.currentLine=10289152;
 //BA.debugLineNum = 10289152;BA.debugLine="Sub req_getme(userid As String)";
RDebugUtils.currentLine=10289153;
 //BA.debugLineNum = 10289153;BA.debugLine="Dim prfn As PersianFastNetwork";
_prfn = new com.reza.sh.fastnet.Fastnet();
RDebugUtils.currentLine=10289154;
 //BA.debugLineNum = 10289154;BA.debugLine="prfn.initialize(\"prfn\")";
_prfn.initialize(processBA,"prfn");
RDebugUtils.currentLine=10289156;
 //BA.debugLineNum = 10289156;BA.debugLine="Dim post As PostRequest";
_post = new com.reza.sh.fastnet.PostRequestRaper();
RDebugUtils.currentLine=10289157;
 //BA.debugLineNum = 10289157;BA.debugLine="post=prfn.BuildPostQuery(\"http://filework.ir/INST";
_post = _prfn.BuildPostQuery("http://filework.ir/INSTAFOLLOW/api/req.php","getinsta");
RDebugUtils.currentLine=10289159;
 //BA.debugLineNum = 10289159;BA.debugLine="post.addHeder(\"User-Agent\",\"Dalvik/1.6.0 (Linux;";
_post.addHeder("User-Agent","Dalvik/1.6.0 (Linux; U; Android 4.4.4; SM-A700FD Build/KTU84P)");
RDebugUtils.currentLine=10289161;
 //BA.debugLineNum = 10289161;BA.debugLine="post.addParametrs(\"ui\",\"1\")";
_post.addParametrs("ui","1");
RDebugUtils.currentLine=10289162;
 //BA.debugLineNum = 10289162;BA.debugLine="post.addParametrs(\"userid\",userid_t)";
_post.addParametrs("userid",_userid_t);
RDebugUtils.currentLine=10289164;
 //BA.debugLineNum = 10289164;BA.debugLine="post.addParametrs(\"req\",\"get_acct\")";
_post.addParametrs("req","get_acct");
RDebugUtils.currentLine=10289167;
 //BA.debugLineNum = 10289167;BA.debugLine="post.executRequestAsString";
_post.executRequestAsString();
RDebugUtils.currentLine=10289168;
 //BA.debugLineNum = 10289168;BA.debugLine="End Sub";
return "";
}
public static boolean  _activity_keypress(int _keycode) throws Exception{
RDebugUtils.currentModule="ac_lchats";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_keypress", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "activity_keypress", new Object[] {_keycode}));}
RDebugUtils.currentLine=10878976;
 //BA.debugLineNum = 10878976;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
RDebugUtils.currentLine=10878977;
 //BA.debugLineNum = 10878977;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
if (_keycode==anywheresoftware.b4a.keywords.Common.KeyCodes.KEYCODE_BACK) { 
RDebugUtils.currentLine=10878978;
 //BA.debugLineNum = 10878978;BA.debugLine="StartActivity(ac_tselect)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._ac_tselect.getObject()));
RDebugUtils.currentLine=10878979;
 //BA.debugLineNum = 10878979;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=10878980;
 //BA.debugLineNum = 10878980;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 };
RDebugUtils.currentLine=10878983;
 //BA.debugLineNum = 10878983;BA.debugLine="End Sub";
return false;
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="ac_lchats";
RDebugUtils.currentLine=9633792;
 //BA.debugLineNum = 9633792;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=9633794;
 //BA.debugLineNum = 9633794;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="ac_lchats";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=9568256;
 //BA.debugLineNum = 9568256;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=9568257;
 //BA.debugLineNum = 9568257;BA.debugLine="req_getme(userid_t)";
_req_getme(_userid_t);
RDebugUtils.currentLine=9568259;
 //BA.debugLineNum = 9568259;BA.debugLine="End Sub";
return "";
}
public static String  _dialog_itemselected(de.amberhome.materialdialogs.MaterialDialogWrapper _dialog,int _position,String _text) throws Exception{
RDebugUtils.currentModule="ac_lchats";
if (Debug.shouldDelegate(mostCurrent.activityBA, "dialog_itemselected", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "dialog_itemselected", new Object[] {_dialog,_position,_text}));}
RDebugUtils.currentLine=10092544;
 //BA.debugLineNum = 10092544;BA.debugLine="Sub Dialog_ItemSelected (Dialog As MaterialDialog,";
RDebugUtils.currentLine=10092547;
 //BA.debugLineNum = 10092547;BA.debugLine="Select Position";
switch (_position) {
case 0: {
RDebugUtils.currentLine=10092550;
 //BA.debugLineNum = 10092550;BA.debugLine="show_pnldialogs(True,0)";
_show_pnldialogs(anywheresoftware.b4a.keywords.Common.True,(int) (0));
 break; }
case 1: {
RDebugUtils.currentLine=10092552;
 //BA.debugLineNum = 10092552;BA.debugLine="show_pnldialogs(True,3)";
_show_pnldialogs(anywheresoftware.b4a.keywords.Common.True,(int) (3));
 break; }
}
;
RDebugUtils.currentLine=10092556;
 //BA.debugLineNum = 10092556;BA.debugLine="End Sub";
return "";
}
public static String  _show_pnldialogs(boolean _isshsowa,int _typesef) throws Exception{
RDebugUtils.currentModule="ac_lchats";
if (Debug.shouldDelegate(mostCurrent.activityBA, "show_pnldialogs", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "show_pnldialogs", new Object[] {_isshsowa,_typesef}));}
anywheresoftware.b4a.objects.LabelWrapper _lbl_s = null;
com.it.fome.mt_sef _mt_sef = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl_x = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _bg = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _bgs = null;
anywheresoftware.b4a.objects.PanelWrapper _pnlmain = null;
anywheresoftware.b4a.objects.PanelWrapper _pp = null;
RDebugUtils.currentLine=10485760;
 //BA.debugLineNum = 10485760;BA.debugLine="Sub show_pnldialogs(isshsowa As Boolean,typesef As";
RDebugUtils.currentLine=10485761;
 //BA.debugLineNum = 10485761;BA.debugLine="Select isshsowa";
switch (BA.switchObjectToInt(_isshsowa,anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.False)) {
case 0: {
RDebugUtils.currentLine=10485763;
 //BA.debugLineNum = 10485763;BA.debugLine="pnl_dilogs.Initialize(\"pnl_dilogs\")";
mostCurrent._pnl_dilogs.Initialize(mostCurrent.activityBA,"pnl_dilogs");
RDebugUtils.currentLine=10485764;
 //BA.debugLineNum = 10485764;BA.debugLine="pnl_dilogs.Color=Colors.LightGray";
mostCurrent._pnl_dilogs.setColor(anywheresoftware.b4a.keywords.Common.Colors.LightGray);
RDebugUtils.currentLine=10485765;
 //BA.debugLineNum = 10485765;BA.debugLine="Activity.AddView(pnl_dilogs,0,20%x,100%x,100%y-";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._pnl_dilogs.getObject()),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (20),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),(int) (anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA)-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (20),mostCurrent.activityBA)));
RDebugUtils.currentLine=10485767;
 //BA.debugLineNum = 10485767;BA.debugLine="Dim lbl_s As Label";
_lbl_s = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=10485768;
 //BA.debugLineNum = 10485768;BA.debugLine="lbl_s.Initialize(\"lbl_nums\")";
_lbl_s.Initialize(mostCurrent.activityBA,"lbl_nums");
RDebugUtils.currentLine=10485769;
 //BA.debugLineNum = 10485769;BA.debugLine="lbl_s.TextColor=Colors.White";
_lbl_s.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=10485770;
 //BA.debugLineNum = 10485770;BA.debugLine="lbl_s.TextSize=20";
_lbl_s.setTextSize((float) (20));
RDebugUtils.currentLine=10485771;
 //BA.debugLineNum = 10485771;BA.debugLine="lbl_s.Typeface=Typeface.LoadFromAssets(\"iran_sa";
_lbl_s.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("iran_sans.ttf"));
RDebugUtils.currentLine=10485772;
 //BA.debugLineNum = 10485772;BA.debugLine="lbl_s.Gravity=Gravity.CENTER_VERTICAL+Gravity.R";
_lbl_s.setGravity((int) (anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL+anywheresoftware.b4a.keywords.Common.Gravity.RIGHT));
RDebugUtils.currentLine=10485773;
 //BA.debugLineNum = 10485773;BA.debugLine="pnl_dilogs.AddView(lbl_s,2%x,0,pnl_dilogs.Width";
mostCurrent._pnl_dilogs.AddView((android.view.View)(_lbl_s.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (2),mostCurrent.activityBA),(int) (0),(int) (mostCurrent._pnl_dilogs.getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (15),mostCurrent.activityBA)),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA));
RDebugUtils.currentLine=10485775;
 //BA.debugLineNum = 10485775;BA.debugLine="Dim mt_sef As mt_sef";
_mt_sef = new com.it.fome.mt_sef();
RDebugUtils.currentLine=10485776;
 //BA.debugLineNum = 10485776;BA.debugLine="mt_sef.Initialize(\"mt_sef\",Me)";
_mt_sef._initialize /*String*/ (null,mostCurrent.activityBA,"mt_sef",ac_lchats.getObject());
RDebugUtils.currentLine=10485778;
 //BA.debugLineNum = 10485778;BA.debugLine="Select typesef";
switch (_typesef) {
case 0: {
RDebugUtils.currentLine=10485780;
 //BA.debugLineNum = 10485780;BA.debugLine="lbl_s.Text=\"سفارش ممبر\"";
_lbl_s.setText(BA.ObjectToCharSequence("سفارش ممبر"));
RDebugUtils.currentLine=10485781;
 //BA.debugLineNum = 10485781;BA.debugLine="mt_sef.username_target=username_target";
_mt_sef._username_target /*String*/  = mostCurrent._username_target;
 break; }
case 3: {
RDebugUtils.currentLine=10485784;
 //BA.debugLineNum = 10485784;BA.debugLine="lbl_s.Text=\"سفارش ویو\"";
_lbl_s.setText(BA.ObjectToCharSequence("سفارش ویو"));
RDebugUtils.currentLine=10485785;
 //BA.debugLineNum = 10485785;BA.debugLine="mt_sef.username_target=chatid";
_mt_sef._username_target /*String*/  = _chatid;
RDebugUtils.currentLine=10485786;
 //BA.debugLineNum = 10485786;BA.debugLine="mt_sef.idchannel_t=idchannel_target";
_mt_sef._idchannel_t /*String*/  = mostCurrent._idchannel_target;
RDebugUtils.currentLine=10485787;
 //BA.debugLineNum = 10485787;BA.debugLine="mt_sef.titelchat_target=title_target";
_mt_sef._titelchat_target /*String*/  = mostCurrent._title_target;
RDebugUtils.currentLine=10485788;
 //BA.debugLineNum = 10485788;BA.debugLine="mt_sef.us_name=us_name";
_mt_sef._us_name /*String*/  = mostCurrent._us_name;
 break; }
}
;
RDebugUtils.currentLine=10485791;
 //BA.debugLineNum = 10485791;BA.debugLine="Dim lbl_x As Label";
_lbl_x = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=10485792;
 //BA.debugLineNum = 10485792;BA.debugLine="lbl_x.Initialize(\"lbl_x\")";
_lbl_x.Initialize(mostCurrent.activityBA,"lbl_x");
RDebugUtils.currentLine=10485793;
 //BA.debugLineNum = 10485793;BA.debugLine="lbl_x.TextColor=Colors.White";
_lbl_x.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=10485794;
 //BA.debugLineNum = 10485794;BA.debugLine="lbl_x.TextSize=28";
_lbl_x.setTextSize((float) (28));
RDebugUtils.currentLine=10485795;
 //BA.debugLineNum = 10485795;BA.debugLine="lbl_x.Typeface=Typeface.MATERIALICONS";
_lbl_x.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.getMATERIALICONS());
RDebugUtils.currentLine=10485796;
 //BA.debugLineNum = 10485796;BA.debugLine="lbl_x.Gravity=Gravity.CENTER_VERTICAL+Gravity.C";
_lbl_x.setGravity((int) (anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL+anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL));
RDebugUtils.currentLine=10485797;
 //BA.debugLineNum = 10485797;BA.debugLine="lbl_x.Text=Chr(0xE5C8)";
_lbl_x.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr((int) (0xe5c8))));
RDebugUtils.currentLine=10485798;
 //BA.debugLineNum = 10485798;BA.debugLine="pnl_dilogs.AddView(lbl_x,pnl_dilogs.Width-15%x,";
mostCurrent._pnl_dilogs.AddView((android.view.View)(_lbl_x.getObject()),(int) (mostCurrent._pnl_dilogs.getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (15),mostCurrent.activityBA)),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (15),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA));
RDebugUtils.currentLine=10485800;
 //BA.debugLineNum = 10485800;BA.debugLine="Dim bg As ColorDrawable";
_bg = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=10485801;
 //BA.debugLineNum = 10485801;BA.debugLine="bg.Initialize2(Colors.White,5dip,2dip,Colors.Li";
_bg.Initialize2(anywheresoftware.b4a.keywords.Common.Colors.White,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (5)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (2)),anywheresoftware.b4a.keywords.Common.Colors.LightGray);
RDebugUtils.currentLine=10485803;
 //BA.debugLineNum = 10485803;BA.debugLine="Dim bgs As ColorDrawable";
_bgs = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=10485804;
 //BA.debugLineNum = 10485804;BA.debugLine="bgs.Initialize2(Colors.White,5%x,2dip,Colors.Li";
_bgs.Initialize2(anywheresoftware.b4a.keywords.Common.Colors.White,anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (2)),anywheresoftware.b4a.keywords.Common.Colors.LightGray);
RDebugUtils.currentLine=10485806;
 //BA.debugLineNum = 10485806;BA.debugLine="Dim pnlmain As Panel";
_pnlmain = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=10485807;
 //BA.debugLineNum = 10485807;BA.debugLine="pnlmain.Initialize(\"\")";
_pnlmain.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=10485808;
 //BA.debugLineNum = 10485808;BA.debugLine="pnlmain.Background=bg";
_pnlmain.setBackground((android.graphics.drawable.Drawable)(_bg.getObject()));
RDebugUtils.currentLine=10485809;
 //BA.debugLineNum = 10485809;BA.debugLine="pnl_dilogs.AddView(pnlmain,5%x,10%x,pnl_dilogs.";
mostCurrent._pnl_dilogs.AddView((android.view.View)(_pnlmain.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA),(int) (mostCurrent._pnl_dilogs.getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA)),(int) (mostCurrent._pnl_dilogs.getHeight()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (20),mostCurrent.activityBA)));
RDebugUtils.currentLine=10485811;
 //BA.debugLineNum = 10485811;BA.debugLine="Dim pp As Panel";
_pp = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=10485812;
 //BA.debugLineNum = 10485812;BA.debugLine="pp.Initialize(\"pp\")";
_pp.Initialize(mostCurrent.activityBA,"pp");
RDebugUtils.currentLine=10485813;
 //BA.debugLineNum = 10485813;BA.debugLine="pnlmain.AddView(pp,3%x,2%x,pnlmain.Width-6%x,pn";
_pnlmain.AddView((android.view.View)(_pp.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (3),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (2),mostCurrent.activityBA),(int) (_pnlmain.getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (6),mostCurrent.activityBA)),(int) (_pnlmain.getHeight()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (4),mostCurrent.activityBA)));
RDebugUtils.currentLine=10485815;
 //BA.debugLineNum = 10485815;BA.debugLine="mt_sef.Type_sef=typesef";
_mt_sef._type_sef /*int*/  = _typesef;
RDebugUtils.currentLine=10485816;
 //BA.debugLineNum = 10485816;BA.debugLine="mt_sef.img_address_target=img_target";
_mt_sef._img_address_target /*String*/  = mostCurrent._img_target;
RDebugUtils.currentLine=10485817;
 //BA.debugLineNum = 10485817;BA.debugLine="mt_sef.addpnl(pp)";
_mt_sef._addpnl /*anywheresoftware.b4a.objects.ConcreteViewWrapper*/ (null,_pp);
 break; }
case 1: {
RDebugUtils.currentLine=10485820;
 //BA.debugLineNum = 10485820;BA.debugLine="If pnl_dilogs.IsInitialized=True And pnl_dilogs";
if (mostCurrent._pnl_dilogs.IsInitialized()==anywheresoftware.b4a.keywords.Common.True && mostCurrent._pnl_dilogs.getEnabled()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=10485821;
 //BA.debugLineNum = 10485821;BA.debugLine="pnl_dilogs.Visible=False";
mostCurrent._pnl_dilogs.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=10485822;
 //BA.debugLineNum = 10485822;BA.debugLine="pnl_dilogs.Enabled=False";
mostCurrent._pnl_dilogs.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 };
 break; }
}
;
RDebugUtils.currentLine=10485825;
 //BA.debugLineNum = 10485825;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_addchannel_click() throws Exception{
RDebugUtils.currentModule="ac_lchats";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lbl_addchannel_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "lbl_addchannel_click", null));}
RDebugUtils.currentLine=10158080;
 //BA.debugLineNum = 10158080;BA.debugLine="Sub lbl_addchannel_Click";
RDebugUtils.currentLine=10158081;
 //BA.debugLineNum = 10158081;BA.debugLine="StartActivity(ac_tsearch)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._ac_tsearch.getObject()));
RDebugUtils.currentLine=10158083;
 //BA.debugLineNum = 10158083;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_sef_click() throws Exception{
RDebugUtils.currentModule="ac_lchats";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lbl_sef_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "lbl_sef_click", null));}
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
com.it.fome.ac_lchats._adap_chats _item = null;
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
int _id_channelinfo = 0;
String _issupergroup = "";
RDebugUtils.currentLine=10027008;
 //BA.debugLineNum = 10027008;BA.debugLine="Sub lbl_sef_Click";
RDebugUtils.currentLine=10027017;
 //BA.debugLineNum = 10027017;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=10027018;
 //BA.debugLineNum = 10027018;BA.debugLine="lbl=Sender";
_lbl.setObject((android.widget.TextView)(anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA)));
RDebugUtils.currentLine=10027019;
 //BA.debugLineNum = 10027019;BA.debugLine="Dim Item = listchats.Get(lbl.Tag) As Adap_chats";
_item = (com.it.fome.ac_lchats._adap_chats)(_listchats.Get((int)(BA.ObjectToNumber(_lbl.getTag()))));
RDebugUtils.currentLine=10027020;
 //BA.debugLineNum = 10027020;BA.debugLine="Log(Item.title)";
anywheresoftware.b4a.keywords.Common.LogImpl("610027020",_item.title /*String*/ ,0);
RDebugUtils.currentLine=10027021;
 //BA.debugLineNum = 10027021;BA.debugLine="chatid=Item.chat_id";
_chatid = BA.NumberToString(_item.chat_id /*long*/ );
RDebugUtils.currentLine=10027022;
 //BA.debugLineNum = 10027022;BA.debugLine="title_target=Item.title";
mostCurrent._title_target = _item.title /*String*/ ;
RDebugUtils.currentLine=10027023;
 //BA.debugLineNum = 10027023;BA.debugLine="LogColor(\" img id : \"&Item.img_my.Length,Colors.R";
anywheresoftware.b4a.keywords.Common.LogImpl("610027023"," img id : "+BA.NumberToString(_item.img_my /*String*/ .length()),anywheresoftware.b4a.keywords.Common.Colors.Red);
RDebugUtils.currentLine=10027024;
 //BA.debugLineNum = 10027024;BA.debugLine="If Item.img_my.Length>5 Then";
if (_item.img_my /*String*/ .length()>5) { 
RDebugUtils.currentLine=10027026;
 //BA.debugLineNum = 10027026;BA.debugLine="img_target=Item.img_my";
mostCurrent._img_target = _item.img_my /*String*/ ;
 }else {
RDebugUtils.currentLine=10027029;
 //BA.debugLineNum = 10027029;BA.debugLine="img_target=\"http://filework.ir/INSTAFOLLOW/api/a";
mostCurrent._img_target = "http://filework.ir/INSTAFOLLOW/api/asset/noimage.png";
RDebugUtils.currentLine=10027030;
 //BA.debugLineNum = 10027030;BA.debugLine="LogColor(\" no img : \",Colors.Red)";
anywheresoftware.b4a.keywords.Common.LogImpl("610027030"," no img : ",anywheresoftware.b4a.keywords.Common.Colors.Red);
 };
RDebugUtils.currentLine=10027032;
 //BA.debugLineNum = 10027032;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=10027033;
 //BA.debugLineNum = 10027033;BA.debugLine="parser.Initialize(Item.channel_info)";
_parser.Initialize(_item.channel_info /*String*/ );
RDebugUtils.currentLine=10027034;
 //BA.debugLineNum = 10027034;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=10027035;
 //BA.debugLineNum = 10027035;BA.debugLine="Dim id_channelinfo As Int = root.Get(\"supergroupI";
_id_channelinfo = (int)(BA.ObjectToNumber(_root.Get((Object)("supergroupId"))));
RDebugUtils.currentLine=10027036;
 //BA.debugLineNum = 10027036;BA.debugLine="Dim isSupergroup As String = root.Get(\"isChannel\"";
_issupergroup = BA.ObjectToString(_root.Get((Object)("isChannel")));
RDebugUtils.currentLine=10027037;
 //BA.debugLineNum = 10027037;BA.debugLine="idchannel_target=id_channelinfo";
mostCurrent._idchannel_target = BA.NumberToString(_id_channelinfo);
RDebugUtils.currentLine=10027040;
 //BA.debugLineNum = 10027040;BA.debugLine="telegs.Getchanneluser(id_channelinfo)";
_telegs.Getchanneluser(_id_channelinfo);
RDebugUtils.currentLine=10027043;
 //BA.debugLineNum = 10027043;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_x_click() throws Exception{
RDebugUtils.currentModule="ac_lchats";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lbl_x_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "lbl_x_click", null));}
RDebugUtils.currentLine=10616832;
 //BA.debugLineNum = 10616832;BA.debugLine="Sub lbl_x_Click";
RDebugUtils.currentLine=10616833;
 //BA.debugLineNum = 10616833;BA.debugLine="show_pnldialogs(False,0)";
_show_pnldialogs(anywheresoftware.b4a.keywords.Common.False,(int) (0));
RDebugUtils.currentLine=10616835;
 //BA.debugLineNum = 10616835;BA.debugLine="End Sub";
return "";
}
public static int  _lv_getitemcount() throws Exception{
RDebugUtils.currentModule="ac_lchats";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lv_getitemcount", false))
	 {return ((Integer) Debug.delegate(mostCurrent.activityBA, "lv_getitemcount", null));}
RDebugUtils.currentLine=9830400;
 //BA.debugLineNum = 9830400;BA.debugLine="Sub LV_GetItemCount As Int 								        '$ Item";
RDebugUtils.currentLine=9830401;
 //BA.debugLineNum = 9830401;BA.debugLine="Return listchats.Size 'ItemList.Size";
if (true) return _listchats.getSize();
RDebugUtils.currentLine=9830402;
 //BA.debugLineNum = 9830402;BA.debugLine="End Sub";
return 0;
}
public static String  _lv_onbindviewholder(anywheresoftware.b4a.objects.PanelWrapper _parent,int _position) throws Exception{
RDebugUtils.currentModule="ac_lchats";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lv_onbindviewholder", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "lv_onbindviewholder", new Object[] {_parent,_position}));}
com.it.fome.ac_lchats._adap_chats _item = null;
anywheresoftware.b4a.objects.PanelWrapper _pnl_main = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl_iconchat = null;
anywheresoftware.b4a.objects.ImageViewWrapper _img_prof = null;
anywheresoftware.b4a.objects.PanelWrapper _divi = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl_topmsg = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl_time = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl_unread = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl_sef = null;
String _dir = "";
String _names = "";
long _expdate = 0L;
int _s = 0;
anywheresoftware.b4a.objects.StringUtils _su = null;
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
int _id_channelinfo = 0;
String _issupergroup = "";
String _photoid_topmsg = "";
String _caption_topmsg = "";
String _msgdoc_caption = "";
String _msg_text = "";
RDebugUtils.currentLine=9764864;
 //BA.debugLineNum = 9764864;BA.debugLine="Sub LV_onBindViewHolder (Parent As Panel, Position";
RDebugUtils.currentLine=9764865;
 //BA.debugLineNum = 9764865;BA.debugLine="Dim Item = listchats.Get(Position) As Adap_chats";
_item = (com.it.fome.ac_lchats._adap_chats)(_listchats.Get(_position));
RDebugUtils.currentLine=9764866;
 //BA.debugLineNum = 9764866;BA.debugLine="Dim pnl_main =Parent.GetView(0) As Panel";
_pnl_main = new anywheresoftware.b4a.objects.PanelWrapper();
_pnl_main.setObject((android.view.ViewGroup)(_parent.GetView((int) (0)).getObject()));
RDebugUtils.currentLine=9764867;
 //BA.debugLineNum = 9764867;BA.debugLine="Dim lbl = pnl_main.GetView(0) As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
_lbl.setObject((android.widget.TextView)(_pnl_main.GetView((int) (0)).getObject()));
RDebugUtils.currentLine=9764868;
 //BA.debugLineNum = 9764868;BA.debugLine="Dim lbl_iconchat = pnl_main.GetView(1) As Label";
_lbl_iconchat = new anywheresoftware.b4a.objects.LabelWrapper();
_lbl_iconchat.setObject((android.widget.TextView)(_pnl_main.GetView((int) (1)).getObject()));
RDebugUtils.currentLine=9764869;
 //BA.debugLineNum = 9764869;BA.debugLine="Dim img_prof = pnl_main.GetView(2) As ImageView";
_img_prof = new anywheresoftware.b4a.objects.ImageViewWrapper();
_img_prof.setObject((android.widget.ImageView)(_pnl_main.GetView((int) (2)).getObject()));
RDebugUtils.currentLine=9764870;
 //BA.debugLineNum = 9764870;BA.debugLine="Dim divi = pnl_main.GetView(3) As Panel";
_divi = new anywheresoftware.b4a.objects.PanelWrapper();
_divi.setObject((android.view.ViewGroup)(_pnl_main.GetView((int) (3)).getObject()));
RDebugUtils.currentLine=9764871;
 //BA.debugLineNum = 9764871;BA.debugLine="Dim lbl_topmsg = pnl_main.GetView(4) As Label";
_lbl_topmsg = new anywheresoftware.b4a.objects.LabelWrapper();
_lbl_topmsg.setObject((android.widget.TextView)(_pnl_main.GetView((int) (4)).getObject()));
RDebugUtils.currentLine=9764872;
 //BA.debugLineNum = 9764872;BA.debugLine="Dim lbl_time = pnl_main.GetView(5) As Label";
_lbl_time = new anywheresoftware.b4a.objects.LabelWrapper();
_lbl_time.setObject((android.widget.TextView)(_pnl_main.GetView((int) (5)).getObject()));
RDebugUtils.currentLine=9764873;
 //BA.debugLineNum = 9764873;BA.debugLine="Dim lbl_unread = pnl_main.GetView(6) As Label";
_lbl_unread = new anywheresoftware.b4a.objects.LabelWrapper();
_lbl_unread.setObject((android.widget.TextView)(_pnl_main.GetView((int) (6)).getObject()));
RDebugUtils.currentLine=9764874;
 //BA.debugLineNum = 9764874;BA.debugLine="Dim lbl_sef = pnl_main.GetView(7) As Label";
_lbl_sef = new anywheresoftware.b4a.objects.LabelWrapper();
_lbl_sef.setObject((android.widget.TextView)(_pnl_main.GetView((int) (7)).getObject()));
RDebugUtils.currentLine=9764876;
 //BA.debugLineNum = 9764876;BA.debugLine="lbl_sef.Tag=Position";
_lbl_sef.setTag((Object)(_position));
RDebugUtils.currentLine=9764879;
 //BA.debugLineNum = 9764879;BA.debugLine="Dim dir,names As String";
_dir = "";
_names = "";
RDebugUtils.currentLine=9764882;
 //BA.debugLineNum = 9764882;BA.debugLine="Dim ExpDate As Long = DateUtils.UnixTimeToTicks(I";
_expdate = mostCurrent._dateutils._unixtimetoticks(mostCurrent.activityBA,(long)(Double.parseDouble(_item.topdate /*String*/ )));
RDebugUtils.currentLine=9764884;
 //BA.debugLineNum = 9764884;BA.debugLine="lbl_time.Text=DateTime.time(ExpDate)";
_lbl_time.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.DateTime.Time(_expdate)));
RDebugUtils.currentLine=9764886;
 //BA.debugLineNum = 9764886;BA.debugLine="If Item.unreadCount>0 Then";
if (_item.unreadCount /*int*/ >0) { 
 };
RDebugUtils.currentLine=9764892;
 //BA.debugLineNum = 9764892;BA.debugLine="Dim s As Int";
_s = 0;
RDebugUtils.currentLine=9764893;
 //BA.debugLineNum = 9764893;BA.debugLine="Dim su As StringUtils";
_su = new anywheresoftware.b4a.objects.StringUtils();
RDebugUtils.currentLine=9764894;
 //BA.debugLineNum = 9764894;BA.debugLine="lbl.Text = Item.title";
_lbl.setText(BA.ObjectToCharSequence(_item.title /*String*/ ));
RDebugUtils.currentLine=9764895;
 //BA.debugLineNum = 9764895;BA.debugLine="s = su.MeasureMultilineTextHeight(lbl,lbl.Text)+5";
_s = (int) (_su.MeasureMultilineTextHeight((android.widget.TextView)(_lbl.getObject()),BA.ObjectToCharSequence(_lbl.getText()))+anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (50),mostCurrent.activityBA));
RDebugUtils.currentLine=9764898;
 //BA.debugLineNum = 9764898;BA.debugLine="Select Item.ChatConstructor";
switch (BA.switchObjectToInt(_item.ChatConstructor /*String*/ ,"955152366","1276053779","-241270753")) {
case 0: {
RDebugUtils.currentLine=9764900;
 //BA.debugLineNum = 9764900;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=9764901;
 //BA.debugLineNum = 9764901;BA.debugLine="parser.Initialize(Item.channel_info)";
_parser.Initialize(_item.channel_info /*String*/ );
RDebugUtils.currentLine=9764902;
 //BA.debugLineNum = 9764902;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=9764903;
 //BA.debugLineNum = 9764903;BA.debugLine="Dim id_channelinfo As Int = root.Get(\"supergrou";
_id_channelinfo = (int)(BA.ObjectToNumber(_root.Get((Object)("supergroupId"))));
RDebugUtils.currentLine=9764904;
 //BA.debugLineNum = 9764904;BA.debugLine="Dim isSupergroup As String = root.Get(\"isChanne";
_issupergroup = BA.ObjectToString(_root.Get((Object)("isChannel")));
RDebugUtils.currentLine=9764906;
 //BA.debugLineNum = 9764906;BA.debugLine="If isSupergroup=True Then";
if ((_issupergroup).equals(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.True))) { 
RDebugUtils.currentLine=9764907;
 //BA.debugLineNum = 9764907;BA.debugLine="lbl_iconchat.Typeface=Typeface.FONTAWESOME";
_lbl_iconchat.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.getFONTAWESOME());
RDebugUtils.currentLine=9764908;
 //BA.debugLineNum = 9764908;BA.debugLine="lbl_iconchat.Text=Chr(0xF0A1)";
_lbl_iconchat.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr((int) (0xf0a1))));
 }else {
RDebugUtils.currentLine=9764910;
 //BA.debugLineNum = 9764910;BA.debugLine="lbl_iconchat.Typeface=Typeface.FONTAWESOME";
_lbl_iconchat.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.getFONTAWESOME());
RDebugUtils.currentLine=9764911;
 //BA.debugLineNum = 9764911;BA.debugLine="lbl_iconchat.Text=Chr(0xF0C0)";
_lbl_iconchat.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr((int) (0xf0c0))));
 };
 break; }
case 1: {
RDebugUtils.currentLine=9764915;
 //BA.debugLineNum = 9764915;BA.debugLine="lbl_iconchat.Typeface=Typeface.MATERIALICONS";
_lbl_iconchat.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.getMATERIALICONS());
RDebugUtils.currentLine=9764916;
 //BA.debugLineNum = 9764916;BA.debugLine="lbl_iconchat.Text=Chr(0xE7EF)";
_lbl_iconchat.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr((int) (0xe7ef))));
 break; }
case 2: {
RDebugUtils.currentLine=9764920;
 //BA.debugLineNum = 9764920;BA.debugLine="lbl_iconchat.Typeface=Typeface.FONTAWESOME";
_lbl_iconchat.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.getFONTAWESOME());
RDebugUtils.currentLine=9764921;
 //BA.debugLineNum = 9764921;BA.debugLine="lbl_iconchat.Text=Chr(0xF2C0)";
_lbl_iconchat.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr((int) (0xf2c0))));
 break; }
}
;
RDebugUtils.currentLine=9764925;
 //BA.debugLineNum = 9764925;BA.debugLine="Select Item.topmasg_type";
switch (BA.switchObjectToInt(_item.topmasg_type /*String*/ ,"photo","document","message","voice")) {
case 0: {
RDebugUtils.currentLine=9764928;
 //BA.debugLineNum = 9764928;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=9764929;
 //BA.debugLineNum = 9764929;BA.debugLine="parser.Initialize(Item.topmsg_info)";
_parser.Initialize(_item.topmsg_info /*String*/ );
RDebugUtils.currentLine=9764930;
 //BA.debugLineNum = 9764930;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=9764931;
 //BA.debugLineNum = 9764931;BA.debugLine="Dim photoid_topmsg As String = root.Get(\"photoi";
_photoid_topmsg = BA.ObjectToString(_root.Get((Object)("photoid_topmsg")));
RDebugUtils.currentLine=9764932;
 //BA.debugLineNum = 9764932;BA.debugLine="Dim caption_topmsg As String = root.Get(\"captio";
_caption_topmsg = BA.ObjectToString(_root.Get((Object)("caption_topmsg")));
RDebugUtils.currentLine=9764934;
 //BA.debugLineNum = 9764934;BA.debugLine="If caption_topmsg.Length>60 Then";
if (_caption_topmsg.length()>60) { 
RDebugUtils.currentLine=9764936;
 //BA.debugLineNum = 9764936;BA.debugLine="lbl_topmsg.Text=caption_topmsg.SubString2(0,50";
_lbl_topmsg.setText(BA.ObjectToCharSequence(_caption_topmsg.substring((int) (0),(int) (50))+"..."));
 }else {
RDebugUtils.currentLine=9764938;
 //BA.debugLineNum = 9764938;BA.debugLine="lbl_topmsg.Text=caption_topmsg";
_lbl_topmsg.setText(BA.ObjectToCharSequence(_caption_topmsg));
 };
 break; }
case 1: {
RDebugUtils.currentLine=9764944;
 //BA.debugLineNum = 9764944;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=9764945;
 //BA.debugLineNum = 9764945;BA.debugLine="parser.Initialize(Item.topmsg_info)";
_parser.Initialize(_item.topmsg_info /*String*/ );
RDebugUtils.currentLine=9764946;
 //BA.debugLineNum = 9764946;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=9764947;
 //BA.debugLineNum = 9764947;BA.debugLine="Dim msgdoc_caption As String = root.Get(\"msgdoc";
_msgdoc_caption = BA.ObjectToString(_root.Get((Object)("msgdoc_caption")));
RDebugUtils.currentLine=9764948;
 //BA.debugLineNum = 9764948;BA.debugLine="If msgdoc_caption.Length>60 Then";
if (_msgdoc_caption.length()>60) { 
RDebugUtils.currentLine=9764950;
 //BA.debugLineNum = 9764950;BA.debugLine="lbl_topmsg.Text=msgdoc_caption.SubString2(0,50";
_lbl_topmsg.setText(BA.ObjectToCharSequence(_msgdoc_caption.substring((int) (0),(int) (50))+"..."));
 }else {
RDebugUtils.currentLine=9764952;
 //BA.debugLineNum = 9764952;BA.debugLine="lbl_topmsg.Text=msgdoc_caption";
_lbl_topmsg.setText(BA.ObjectToCharSequence(_msgdoc_caption));
 };
 break; }
case 2: {
RDebugUtils.currentLine=9764957;
 //BA.debugLineNum = 9764957;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=9764958;
 //BA.debugLineNum = 9764958;BA.debugLine="parser.Initialize(Item.topmsg_info)";
_parser.Initialize(_item.topmsg_info /*String*/ );
RDebugUtils.currentLine=9764959;
 //BA.debugLineNum = 9764959;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=9764961;
 //BA.debugLineNum = 9764961;BA.debugLine="Dim msg_text As String = root.Get(\"msg_text\")";
_msg_text = BA.ObjectToString(_root.Get((Object)("msg_text")));
RDebugUtils.currentLine=9764963;
 //BA.debugLineNum = 9764963;BA.debugLine="If msg_text.Length>60 Then";
if (_msg_text.length()>60) { 
RDebugUtils.currentLine=9764965;
 //BA.debugLineNum = 9764965;BA.debugLine="lbl_topmsg.Text=msg_text.SubString2(0,50)&\"...";
_lbl_topmsg.setText(BA.ObjectToCharSequence(_msg_text.substring((int) (0),(int) (50))+"..."));
 }else {
RDebugUtils.currentLine=9764967;
 //BA.debugLineNum = 9764967;BA.debugLine="lbl_topmsg.Text=msg_text";
_lbl_topmsg.setText(BA.ObjectToCharSequence(_msg_text));
 };
 break; }
case 3: {
 break; }
}
;
RDebugUtils.currentLine=9764976;
 //BA.debugLineNum = 9764976;BA.debugLine="If Item.img_isdwonload=\"true\" Then";
if ((_item.img_isdwonload /*String*/ ).equals("true")) { 
RDebugUtils.currentLine=9764979;
 //BA.debugLineNum = 9764979;BA.debugLine="glide.Load(\"\",Item.img_my).OptionalCircleCrop.In";
mostCurrent._glide.Load(mostCurrent.activityBA,"",_item.img_my /*String*/ ).OptionalCircleCrop().Into(_img_prof);
 }else {
RDebugUtils.currentLine=9764981;
 //BA.debugLineNum = 9764981;BA.debugLine="glide.Load(File.DirAssets,\"lazyloader.gif\").FitC";
mostCurrent._glide.Load(mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"lazyloader.gif").FitCenter().Into(_img_prof);
RDebugUtils.currentLine=9764983;
 //BA.debugLineNum = 9764983;BA.debugLine="If Item.img_id=\"null\" Then";
if ((_item.img_id /*String*/ ).equals("null")) { 
 }else {
RDebugUtils.currentLine=9764985;
 //BA.debugLineNum = 9764985;BA.debugLine="telegs.downloadFile(Item.img_id)";
_telegs.downloadFile((int)(Double.parseDouble(_item.img_id /*String*/ )));
 };
 };
RDebugUtils.currentLine=9765006;
 //BA.debugLineNum = 9765006;BA.debugLine="End Sub";
return "";
}
public static String  _lv_oncreateviewholder(anywheresoftware.b4a.objects.PanelWrapper _parent,int _viewtype) throws Exception{
RDebugUtils.currentModule="ac_lchats";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lv_oncreateviewholder", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "lv_oncreateviewholder", new Object[] {_parent,_viewtype}));}
anywheresoftware.b4a.objects.PanelWrapper _pnl_main = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl_iconchat = null;
anywheresoftware.b4a.objects.ImageViewWrapper _img_prof = null;
anywheresoftware.b4a.objects.PanelWrapper _divi = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl_topmsg = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl_time = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl_unread = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _red = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _bg = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl_sef = null;
RDebugUtils.currentLine=9699328;
 //BA.debugLineNum = 9699328;BA.debugLine="Sub LV_onCreateViewHolder (Parent As Panel, ViewTy";
RDebugUtils.currentLine=9699329;
 //BA.debugLineNum = 9699329;BA.debugLine="Parent.Color=Colors.White";
_parent.setColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=9699330;
 //BA.debugLineNum = 9699330;BA.debugLine="Parent.Height=15%y";
_parent.setHeight(anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (15),mostCurrent.activityBA));
RDebugUtils.currentLine=9699332;
 //BA.debugLineNum = 9699332;BA.debugLine="Dim pnl_main As Panel";
_pnl_main = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=9699333;
 //BA.debugLineNum = 9699333;BA.debugLine="pnl_main.Initialize(\"\")";
_pnl_main.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=9699334;
 //BA.debugLineNum = 9699334;BA.debugLine="pnl_main.Color=Colors.White";
_pnl_main.setColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=9699335;
 //BA.debugLineNum = 9699335;BA.debugLine="Parent.AddView(pnl_main,2%x,2%x,Parent.Width-4%x,";
_parent.AddView((android.view.View)(_pnl_main.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (2),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (2),mostCurrent.activityBA),(int) (_parent.getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (4),mostCurrent.activityBA)),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (15),mostCurrent.activityBA));
RDebugUtils.currentLine=9699337;
 //BA.debugLineNum = 9699337;BA.debugLine="Dim lbl As Label: lbl.Initialize(\"lbl\")";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=9699337;
 //BA.debugLineNum = 9699337;BA.debugLine="Dim lbl As Label: lbl.Initialize(\"lbl\")";
_lbl.Initialize(mostCurrent.activityBA,"lbl");
RDebugUtils.currentLine=9699338;
 //BA.debugLineNum = 9699338;BA.debugLine="lbl.TextColor = Colors.Black : lbl.TextSize = 18";
_lbl.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=9699338;
 //BA.debugLineNum = 9699338;BA.debugLine="lbl.TextColor = Colors.Black : lbl.TextSize = 18";
_lbl.setTextSize((float) (18));
RDebugUtils.currentLine=9699339;
 //BA.debugLineNum = 9699339;BA.debugLine="lbl.Gravity=Gravity.RIGHT+Gravity.CENTER_VERTICAL";
_lbl.setGravity((int) (anywheresoftware.b4a.keywords.Common.Gravity.RIGHT+anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=9699340;
 //BA.debugLineNum = 9699340;BA.debugLine="lbl.TextSize=14";
_lbl.setTextSize((float) (14));
RDebugUtils.currentLine=9699342;
 //BA.debugLineNum = 9699342;BA.debugLine="pnl_main.AddView(lbl,2%x,5dip,pnl_main.Width-17%x";
_pnl_main.AddView((android.view.View)(_lbl.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (2),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (5)),(int) (_pnl_main.getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (17),mostCurrent.activityBA)),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA));
RDebugUtils.currentLine=9699344;
 //BA.debugLineNum = 9699344;BA.debugLine="Dim lbl_iconchat As Label: lbl_iconchat.Initializ";
_lbl_iconchat = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=9699344;
 //BA.debugLineNum = 9699344;BA.debugLine="Dim lbl_iconchat As Label: lbl_iconchat.Initializ";
_lbl_iconchat.Initialize(mostCurrent.activityBA,"lbl_iconchat");
RDebugUtils.currentLine=9699345;
 //BA.debugLineNum = 9699345;BA.debugLine="lbl_iconchat.TextColor = Colors.Black : lbl_iconc";
_lbl_iconchat.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=9699345;
 //BA.debugLineNum = 9699345;BA.debugLine="lbl_iconchat.TextColor = Colors.Black : lbl_iconc";
_lbl_iconchat.setTextSize((float) (30));
RDebugUtils.currentLine=9699346;
 //BA.debugLineNum = 9699346;BA.debugLine="pnl_main.AddView(lbl_iconchat,5%x,5%x,10%x,10%x)";
_pnl_main.AddView((android.view.View)(_lbl_iconchat.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA));
RDebugUtils.currentLine=9699350;
 //BA.debugLineNum = 9699350;BA.debugLine="Dim img_prof As ImageView";
_img_prof = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=9699351;
 //BA.debugLineNum = 9699351;BA.debugLine="img_prof.Initialize(\"img_prof\")";
_img_prof.Initialize(mostCurrent.activityBA,"img_prof");
RDebugUtils.currentLine=9699353;
 //BA.debugLineNum = 9699353;BA.debugLine="img_prof.Gravity=Gravity.FILL";
_img_prof.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.FILL);
RDebugUtils.currentLine=9699354;
 //BA.debugLineNum = 9699354;BA.debugLine="pnl_main.AddView(img_prof,pnl_main.Width-13%x,5di";
_pnl_main.AddView((android.view.View)(_img_prof.getObject()),(int) (_pnl_main.getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (13),mostCurrent.activityBA)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (5)),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (12),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (12),mostCurrent.activityBA));
RDebugUtils.currentLine=9699356;
 //BA.debugLineNum = 9699356;BA.debugLine="Dim divi As Panel: divi.Initialize(\"divi\")";
_divi = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=9699356;
 //BA.debugLineNum = 9699356;BA.debugLine="Dim divi As Panel: divi.Initialize(\"divi\")";
_divi.Initialize(mostCurrent.activityBA,"divi");
RDebugUtils.currentLine=9699357;
 //BA.debugLineNum = 9699357;BA.debugLine="divi.Color=0xFFE1E5E6";
_divi.setColor((int) (0xffe1e5e6));
RDebugUtils.currentLine=9699358;
 //BA.debugLineNum = 9699358;BA.debugLine="pnl_main.AddView(divi,0,15%y,100%x-78dip,1dip)";
_pnl_main.AddView((android.view.View)(_divi.getObject()),(int) (0),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (15),mostCurrent.activityBA),(int) (anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA)-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (78))),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (1)));
RDebugUtils.currentLine=9699360;
 //BA.debugLineNum = 9699360;BA.debugLine="Dim lbl_topmsg As Label: lbl_topmsg.Initialize(\"l";
_lbl_topmsg = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=9699360;
 //BA.debugLineNum = 9699360;BA.debugLine="Dim lbl_topmsg As Label: lbl_topmsg.Initialize(\"l";
_lbl_topmsg.Initialize(mostCurrent.activityBA,"lbl_topmsg");
RDebugUtils.currentLine=9699361;
 //BA.debugLineNum = 9699361;BA.debugLine="lbl_topmsg.TextColor = 0xFFABACAE : lbl_topmsg.Te";
_lbl_topmsg.setTextColor((int) (0xffabacae));
RDebugUtils.currentLine=9699361;
 //BA.debugLineNum = 9699361;BA.debugLine="lbl_topmsg.TextColor = 0xFFABACAE : lbl_topmsg.Te";
_lbl_topmsg.setTextSize((float) (14));
RDebugUtils.currentLine=9699362;
 //BA.debugLineNum = 9699362;BA.debugLine="lbl_topmsg.Gravity=Gravity.RIGHT";
_lbl_topmsg.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.RIGHT);
RDebugUtils.currentLine=9699363;
 //BA.debugLineNum = 9699363;BA.debugLine="lbl_topmsg.Visible=False";
_lbl_topmsg.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=9699364;
 //BA.debugLineNum = 9699364;BA.debugLine="pnl_main.AddView(lbl_topmsg,30dip,40dip,100%x-110";
_pnl_main.AddView((android.view.View)(_lbl_topmsg.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (30)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (40)),(int) (anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA)-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (110))),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (20)));
RDebugUtils.currentLine=9699366;
 //BA.debugLineNum = 9699366;BA.debugLine="Dim lbl_time As Label: lbl_time.Initialize(\"lbl_t";
_lbl_time = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=9699366;
 //BA.debugLineNum = 9699366;BA.debugLine="Dim lbl_time As Label: lbl_time.Initialize(\"lbl_t";
_lbl_time.Initialize(mostCurrent.activityBA,"lbl_time");
RDebugUtils.currentLine=9699367;
 //BA.debugLineNum = 9699367;BA.debugLine="lbl_time.TextColor = 0xFFABACAE : lbl_time.TextSi";
_lbl_time.setTextColor((int) (0xffabacae));
RDebugUtils.currentLine=9699367;
 //BA.debugLineNum = 9699367;BA.debugLine="lbl_time.TextColor = 0xFFABACAE : lbl_time.TextSi";
_lbl_time.setTextSize((float) (14));
RDebugUtils.currentLine=9699369;
 //BA.debugLineNum = 9699369;BA.debugLine="lbl_time.Visible=False";
_lbl_time.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=9699370;
 //BA.debugLineNum = 9699370;BA.debugLine="pnl_main.AddView(lbl_time,5dip,10dip,100dip,20dip";
_pnl_main.AddView((android.view.View)(_lbl_time.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (5)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (10)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (20)));
RDebugUtils.currentLine=9699372;
 //BA.debugLineNum = 9699372;BA.debugLine="Dim lbl_unread As Label: lbl_unread.Initialize(\"l";
_lbl_unread = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=9699372;
 //BA.debugLineNum = 9699372;BA.debugLine="Dim lbl_unread As Label: lbl_unread.Initialize(\"l";
_lbl_unread.Initialize(mostCurrent.activityBA,"lbl_unread");
RDebugUtils.currentLine=9699373;
 //BA.debugLineNum = 9699373;BA.debugLine="lbl_unread.TextColor = 0xFFFFFFFF : lbl_unread.Te";
_lbl_unread.setTextColor((int) (0xffffffff));
RDebugUtils.currentLine=9699373;
 //BA.debugLineNum = 9699373;BA.debugLine="lbl_unread.TextColor = 0xFFFFFFFF : lbl_unread.Te";
_lbl_unread.setTextSize((float) (14));
RDebugUtils.currentLine=9699374;
 //BA.debugLineNum = 9699374;BA.debugLine="Dim red As ColorDrawable";
_red = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=9699375;
 //BA.debugLineNum = 9699375;BA.debugLine="red.Initialize(0xFF1EF47C,60)";
_red.Initialize((int) (0xff1ef47c),(int) (60));
RDebugUtils.currentLine=9699376;
 //BA.debugLineNum = 9699376;BA.debugLine="lbl_unread.Background=red";
_lbl_unread.setBackground((android.graphics.drawable.Drawable)(_red.getObject()));
RDebugUtils.currentLine=9699377;
 //BA.debugLineNum = 9699377;BA.debugLine="lbl_unread.Gravity=Gravity.CENTER";
_lbl_unread.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER);
RDebugUtils.currentLine=9699378;
 //BA.debugLineNum = 9699378;BA.debugLine="lbl_unread.Visible=False";
_lbl_unread.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=9699379;
 //BA.debugLineNum = 9699379;BA.debugLine="pnl_main.AddView(lbl_unread,10dip,40dip,20dip,20d";
_pnl_main.AddView((android.view.View)(_lbl_unread.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (10)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (40)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (20)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (20)));
RDebugUtils.currentLine=9699381;
 //BA.debugLineNum = 9699381;BA.debugLine="Dim bg As ColorDrawable";
_bg = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=9699382;
 //BA.debugLineNum = 9699382;BA.debugLine="bg.Initialize2(0xFFE3192E,5dip,2dip,0xFFEC5765)";
_bg.Initialize2((int) (0xffe3192e),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (5)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (2)),(int) (0xffec5765));
RDebugUtils.currentLine=9699383;
 //BA.debugLineNum = 9699383;BA.debugLine="Dim lbl_sef As Label: lbl_sef.Initialize(\"lbl_sef";
_lbl_sef = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=9699383;
 //BA.debugLineNum = 9699383;BA.debugLine="Dim lbl_sef As Label: lbl_sef.Initialize(\"lbl_sef";
_lbl_sef.Initialize(mostCurrent.activityBA,"lbl_sef");
RDebugUtils.currentLine=9699384;
 //BA.debugLineNum = 9699384;BA.debugLine="lbl_sef.TextColor = Colors.White : lbl_sef.TextSi";
_lbl_sef.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=9699384;
 //BA.debugLineNum = 9699384;BA.debugLine="lbl_sef.TextColor = Colors.White : lbl_sef.TextSi";
_lbl_sef.setTextSize((float) (18));
RDebugUtils.currentLine=9699385;
 //BA.debugLineNum = 9699385;BA.debugLine="lbl_sef.Gravity=Gravity.CENTER_HORIZONTAL+Gravity";
_lbl_sef.setGravity((int) (anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL+anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=9699386;
 //BA.debugLineNum = 9699386;BA.debugLine="lbl_sef.TextSize=17";
_lbl_sef.setTextSize((float) (17));
RDebugUtils.currentLine=9699387;
 //BA.debugLineNum = 9699387;BA.debugLine="lbl_sef.Text=\"سفارش\"";
_lbl_sef.setText(BA.ObjectToCharSequence("سفارش"));
RDebugUtils.currentLine=9699388;
 //BA.debugLineNum = 9699388;BA.debugLine="lbl_sef.Background=bg";
_lbl_sef.setBackground((android.graphics.drawable.Drawable)(_bg.getObject()));
RDebugUtils.currentLine=9699390;
 //BA.debugLineNum = 9699390;BA.debugLine="pnl_main.AddView(lbl_sef,pnl_main.Width/2-5%x,img";
_pnl_main.AddView((android.view.View)(_lbl_sef.getObject()),(int) (_pnl_main.getWidth()/(double)2-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA)),(int) (_img_prof.getTop()+_img_prof.getHeight()+anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (1),mostCurrent.activityBA)),(int) (_pnl_main.getWidth()/(double)2-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA)),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (8),mostCurrent.activityBA));
RDebugUtils.currentLine=9699392;
 //BA.debugLineNum = 9699392;BA.debugLine="End Sub";
return "";
}
public static String  _meno_click() throws Exception{
RDebugUtils.currentModule="ac_lchats";
if (Debug.shouldDelegate(mostCurrent.activityBA, "meno_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "meno_click", null));}
RDebugUtils.currentLine=10813440;
 //BA.debugLineNum = 10813440;BA.debugLine="Sub meno_Click";
RDebugUtils.currentLine=10813441;
 //BA.debugLineNum = 10813441;BA.debugLine="mimeno.Initialize(\"mimeno\",Me)";
mostCurrent._mimeno._initialize /*String*/ (null,mostCurrent.activityBA,"mimeno",ac_lchats.getObject());
RDebugUtils.currentLine=10813442;
 //BA.debugLineNum = 10813442;BA.debugLine="mimeno.addpnl";
mostCurrent._mimeno._addpnl /*String*/ (null);
RDebugUtils.currentLine=10813443;
 //BA.debugLineNum = 10813443;BA.debugLine="mimeno.open";
mostCurrent._mimeno._open /*String*/ (null);
RDebugUtils.currentLine=10813444;
 //BA.debugLineNum = 10813444;BA.debugLine="End Sub";
return "";
}
public static String  _mt_sef_newcoins(String _news) throws Exception{
RDebugUtils.currentModule="ac_lchats";
if (Debug.shouldDelegate(mostCurrent.activityBA, "mt_sef_newcoins", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "mt_sef_newcoins", new Object[] {_news}));}
long _n_coins = 0L;
RDebugUtils.currentLine=10747904;
 //BA.debugLineNum = 10747904;BA.debugLine="Sub mt_sef_newcoins(news As String)";
RDebugUtils.currentLine=10747905;
 //BA.debugLineNum = 10747905;BA.debugLine="Dim n_coins=news As Long";
_n_coins = (long)(Double.parseDouble(_news));
RDebugUtils.currentLine=10747906;
 //BA.debugLineNum = 10747906;BA.debugLine="If n_coins>100 Then";
if (_n_coins>100) { 
RDebugUtils.currentLine=10747907;
 //BA.debugLineNum = 10747907;BA.debugLine="lbl_nums.Text=\"سکه \"&NumberFormat(news,3,0)";
mostCurrent._lbl_nums.setText(BA.ObjectToCharSequence("سکه "+anywheresoftware.b4a.keywords.Common.NumberFormat((double)(Double.parseDouble(_news)),(int) (3),(int) (0))));
 }else {
RDebugUtils.currentLine=10747909;
 //BA.debugLineNum = 10747909;BA.debugLine="lbl_nums.Text=\"سکه \"&news";
mostCurrent._lbl_nums.setText(BA.ObjectToCharSequence("سکه "+_news));
 };
RDebugUtils.currentLine=10747911;
 //BA.debugLineNum = 10747911;BA.debugLine="End Sub";
return "";
}
public static String  _pnl_dilogs_touch(int _action,float _x,float _y) throws Exception{
RDebugUtils.currentModule="ac_lchats";
if (Debug.shouldDelegate(mostCurrent.activityBA, "pnl_dilogs_touch", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "pnl_dilogs_touch", new Object[] {_action,_x,_y}));}
RDebugUtils.currentLine=10551296;
 //BA.debugLineNum = 10551296;BA.debugLine="Sub pnl_dilogs_Touch (Action As Int, X As Float, Y";
RDebugUtils.currentLine=10551297;
 //BA.debugLineNum = 10551297;BA.debugLine="show_pnldialogs(False,0)";
_show_pnldialogs(anywheresoftware.b4a.keywords.Common.False,(int) (0));
RDebugUtils.currentLine=10551298;
 //BA.debugLineNum = 10551298;BA.debugLine="End Sub";
return "";
}
public static String  _prfn_onpoststringerrorlistener(com.reza.sh.fastnet.Error _error,String _tag) throws Exception{
RDebugUtils.currentModule="ac_lchats";
if (Debug.shouldDelegate(mostCurrent.activityBA, "prfn_onpoststringerrorlistener", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "prfn_onpoststringerrorlistener", new Object[] {_error,_tag}));}
RDebugUtils.currentLine=10354688;
 //BA.debugLineNum = 10354688;BA.debugLine="Sub prfn_onPostStringErrorListener(Error As Respon";
RDebugUtils.currentLine=10354690;
 //BA.debugLineNum = 10354690;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=10354691;
 //BA.debugLineNum = 10354691;BA.debugLine="End Sub";
return "";
}
public static String  _prfn_onpoststringoklistener(String _result,String _tag) throws Exception{
RDebugUtils.currentModule="ac_lchats";
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
RDebugUtils.currentLine=10420224;
 //BA.debugLineNum = 10420224;BA.debugLine="Sub prfn_onPostStringOkListener(Result As String";
RDebugUtils.currentLine=10420226;
 //BA.debugLineNum = 10420226;BA.debugLine="Select Tag";
switch (BA.switchObjectToInt(_tag,"iuser","getinsta")) {
case 0: {
RDebugUtils.currentLine=10420228;
 //BA.debugLineNum = 10420228;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=10420229;
 //BA.debugLineNum = 10420229;BA.debugLine="Log(Result)";
anywheresoftware.b4a.keywords.Common.LogImpl("610420229",_result,0);
 break; }
case 1: {
RDebugUtils.currentLine=10420232;
 //BA.debugLineNum = 10420232;BA.debugLine="Log(Result)";
anywheresoftware.b4a.keywords.Common.LogImpl("610420232",_result,0);
RDebugUtils.currentLine=10420233;
 //BA.debugLineNum = 10420233;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=10420234;
 //BA.debugLineNum = 10420234;BA.debugLine="parser.Initialize(Result)";
_parser.Initialize(_result);
RDebugUtils.currentLine=10420235;
 //BA.debugLineNum = 10420235;BA.debugLine="Dim root As List = parser.NextArray";
_root = new anywheresoftware.b4a.objects.collections.List();
_root = _parser.NextArray();
RDebugUtils.currentLine=10420236;
 //BA.debugLineNum = 10420236;BA.debugLine="For Each colroot As Map In root";
_colroot = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group10 = _root;
final int groupLen10 = group10.getSize()
;int index10 = 0;
;
for (; index10 < groupLen10;index10++){
_colroot.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group10.Get(index10)));
RDebugUtils.currentLine=10420237;
 //BA.debugLineNum = 10420237;BA.debugLine="Dim Result As String = colroot.Get(\"result\")";
_result = BA.ObjectToString(_colroot.Get((Object)("result")));
RDebugUtils.currentLine=10420238;
 //BA.debugLineNum = 10420238;BA.debugLine="Dim c_m As String = colroot.Get(\"c_m\")";
_c_m = BA.ObjectToString(_colroot.Get((Object)("c_m")));
RDebugUtils.currentLine=10420239;
 //BA.debugLineNum = 10420239;BA.debugLine="Dim uid As String = colroot.Get(\"uid\")";
_uid = BA.ObjectToString(_colroot.Get((Object)("uid")));
RDebugUtils.currentLine=10420240;
 //BA.debugLineNum = 10420240;BA.debugLine="Dim first_last As String = colroot.Get(\"first_";
_first_last = BA.ObjectToString(_colroot.Get((Object)("first_last")));
RDebugUtils.currentLine=10420241;
 //BA.debugLineNum = 10420241;BA.debugLine="Dim id As String = colroot.Get(\"id\")";
_id = BA.ObjectToString(_colroot.Get((Object)("id")));
RDebugUtils.currentLine=10420242;
 //BA.debugLineNum = 10420242;BA.debugLine="Dim userid As String = colroot.Get(\"userid\")";
_userid = BA.ObjectToString(_colroot.Get((Object)("userid")));
RDebugUtils.currentLine=10420243;
 //BA.debugLineNum = 10420243;BA.debugLine="Dim username As String = colroot.Get(\"username";
_username = BA.ObjectToString(_colroot.Get((Object)("username")));
RDebugUtils.currentLine=10420244;
 //BA.debugLineNum = 10420244;BA.debugLine="Dim c_ch As String = colroot.Get(\"c_ch\")";
_c_ch = BA.ObjectToString(_colroot.Get((Object)("c_ch")));
RDebugUtils.currentLine=10420246;
 //BA.debugLineNum = 10420246;BA.debugLine="Dim n_coins=c_m As Long";
_n_coins = (long)(Double.parseDouble(_c_m));
RDebugUtils.currentLine=10420247;
 //BA.debugLineNum = 10420247;BA.debugLine="If n_coins>100 Then";
if (_n_coins>100) { 
RDebugUtils.currentLine=10420248;
 //BA.debugLineNum = 10420248;BA.debugLine="lbl_nums.Text=\"سکه \"&NumberFormat(c_m,3,0)";
mostCurrent._lbl_nums.setText(BA.ObjectToCharSequence("سکه "+anywheresoftware.b4a.keywords.Common.NumberFormat((double)(Double.parseDouble(_c_m)),(int) (3),(int) (0))));
 }else {
RDebugUtils.currentLine=10420250;
 //BA.debugLineNum = 10420250;BA.debugLine="lbl_nums.Text=\"سکه \"&c_m";
mostCurrent._lbl_nums.setText(BA.ObjectToCharSequence("سکه "+_c_m));
 };
RDebugUtils.currentLine=10420254;
 //BA.debugLineNum = 10420254;BA.debugLine="sql1.ExecNonQuery(\"UPDATE tbl_coin set cm='\"&c";
_sql1.ExecNonQuery("UPDATE tbl_coin set cm='"+_c_m+"',cf='"+_c_ch+"' WHERE userid='"+_userid_t+"' ");
 }
};
 break; }
}
;
RDebugUtils.currentLine=10420260;
 //BA.debugLineNum = 10420260;BA.debugLine="End Sub";
return "";
}
public static String  _setanimation(String _inanimation,String _outanimation) throws Exception{
RDebugUtils.currentModule="ac_lchats";
if (Debug.shouldDelegate(mostCurrent.activityBA, "setanimation", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "setanimation", new Object[] {_inanimation,_outanimation}));}
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
String _package = "";
int _in = 0;
int _out = 0;
RDebugUtils.currentLine=10223616;
 //BA.debugLineNum = 10223616;BA.debugLine="Sub SetAnimation(InAnimation As String, OutAnimati";
RDebugUtils.currentLine=10223617;
 //BA.debugLineNum = 10223617;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=10223618;
 //BA.debugLineNum = 10223618;BA.debugLine="Dim package As String";
_package = "";
RDebugUtils.currentLine=10223619;
 //BA.debugLineNum = 10223619;BA.debugLine="Dim In, out As Int";
_in = 0;
_out = 0;
RDebugUtils.currentLine=10223620;
 //BA.debugLineNum = 10223620;BA.debugLine="package = r.GetStaticField(\"anywheresoftware.b4a.";
_package = BA.ObjectToString(_r.GetStaticField("anywheresoftware.b4a.BA","packageName"));
RDebugUtils.currentLine=10223621;
 //BA.debugLineNum = 10223621;BA.debugLine="In = r.GetStaticField(package & \".R$anim\", InAnim";
_in = (int)(BA.ObjectToNumber(_r.GetStaticField(_package+".R$anim",_inanimation)));
RDebugUtils.currentLine=10223622;
 //BA.debugLineNum = 10223622;BA.debugLine="out = r.GetStaticField(package & \".R$anim\", OutAn";
_out = (int)(BA.ObjectToNumber(_r.GetStaticField(_package+".R$anim",_outanimation)));
RDebugUtils.currentLine=10223623;
 //BA.debugLineNum = 10223623;BA.debugLine="r.Target = r.GetActivity";
_r.Target = (Object)(_r.GetActivity(processBA));
RDebugUtils.currentLine=10223624;
 //BA.debugLineNum = 10223624;BA.debugLine="r.RunMethod4(\"overridePendingTransition\", Array A";
_r.RunMethod4("overridePendingTransition",new Object[]{(Object)(_in),(Object)(_out)},new String[]{"java.lang.int","java.lang.int"});
RDebugUtils.currentLine=10223625;
 //BA.debugLineNum = 10223625;BA.debugLine="End Sub";
return "";
}
public static String  _telegs_getchat(String _value) throws Exception{
RDebugUtils.currentModule="ac_lchats";
if (Debug.shouldDelegate(mostCurrent.activityBA, "telegs_getchat", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "telegs_getchat", new Object[] {_value}));}
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.List _root = null;
anywheresoftware.b4a.objects.collections.Map _colroot = null;
int _photosmall_id = 0;
long _chat_id = 0L;
String _title = "";
String _chatconstructor = "";
String _topdate = "";
String _chat_type = "";
String _channel_info = "";
String _group_info = "";
String _privatechat_info = "";
String _replytomessageid = "";
String _lastreadinboxmessageid = "";
String _lastreadoutboxmessageid = "";
String _unreadcount = "";
String _photo_id = "";
String _photo_l_isdownloadingcompleted = "";
String _photo_l_path = "";
String _photo_r_id = "";
long _content = 0L;
String _topmasg_type = "";
String _topmsg_info = "";
anywheresoftware.b4a.objects.collections.JSONParser _parser_a = null;
anywheresoftware.b4a.objects.collections.Map _root_a = null;
int _id_channelinfo = 0;
String _issupergroup = "";
com.it.fome.ac_lchats._adap_chats _item = null;
RDebugUtils.currentLine=9895936;
 //BA.debugLineNum = 9895936;BA.debugLine="Sub telegs_getchat(value As String)";
RDebugUtils.currentLine=9895938;
 //BA.debugLineNum = 9895938;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=9895939;
 //BA.debugLineNum = 9895939;BA.debugLine="parser.Initialize(value)";
_parser.Initialize(_value);
RDebugUtils.currentLine=9895940;
 //BA.debugLineNum = 9895940;BA.debugLine="Dim root As List = parser.NextArray";
_root = new anywheresoftware.b4a.objects.collections.List();
_root = _parser.NextArray();
RDebugUtils.currentLine=9895941;
 //BA.debugLineNum = 9895941;BA.debugLine="For Each colroot As Map In root";
_colroot = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group4 = _root;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_colroot.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group4.Get(index4)));
RDebugUtils.currentLine=9895942;
 //BA.debugLineNum = 9895942;BA.debugLine="Dim photosmall_id As Int";
_photosmall_id = 0;
RDebugUtils.currentLine=9895943;
 //BA.debugLineNum = 9895943;BA.debugLine="If colroot.Get(\"photosmall_id\")=Null Then";
if (_colroot.Get((Object)("photosmall_id"))== null) { 
 }else {
RDebugUtils.currentLine=9895945;
 //BA.debugLineNum = 9895945;BA.debugLine="photosmall_id	=colroot.Get(\"photosmall_id\")";
_photosmall_id = (int)(BA.ObjectToNumber(_colroot.Get((Object)("photosmall_id"))));
 };
RDebugUtils.currentLine=9895947;
 //BA.debugLineNum = 9895947;BA.debugLine="Dim chat_id As Long = colroot.Get(\"chat_id\")";
_chat_id = BA.ObjectToLongNumber(_colroot.Get((Object)("chat_id")));
RDebugUtils.currentLine=9895948;
 //BA.debugLineNum = 9895948;BA.debugLine="Dim title As String = colroot.Get(\"title\")";
_title = BA.ObjectToString(_colroot.Get((Object)("title")));
RDebugUtils.currentLine=9895949;
 //BA.debugLineNum = 9895949;BA.debugLine="Dim ChatConstructor As String = colroot.Get(\"Cha";
_chatconstructor = BA.ObjectToString(_colroot.Get((Object)("ChatConstructor")));
RDebugUtils.currentLine=9895950;
 //BA.debugLineNum = 9895950;BA.debugLine="Dim topdate As String = colroot.Get(\"topdate\")";
_topdate = BA.ObjectToString(_colroot.Get((Object)("topdate")));
RDebugUtils.currentLine=9895951;
 //BA.debugLineNum = 9895951;BA.debugLine="Dim chat_type As String = colroot.Get(\"chat_type";
_chat_type = BA.ObjectToString(_colroot.Get((Object)("chat_type")));
RDebugUtils.currentLine=9895952;
 //BA.debugLineNum = 9895952;BA.debugLine="Dim channel_info As String = colroot.Get(\"channe";
_channel_info = BA.ObjectToString(_colroot.Get((Object)("channel_info")));
RDebugUtils.currentLine=9895953;
 //BA.debugLineNum = 9895953;BA.debugLine="Dim group_info As String = colroot.Get(\"group_in";
_group_info = BA.ObjectToString(_colroot.Get((Object)("group_info")));
RDebugUtils.currentLine=9895954;
 //BA.debugLineNum = 9895954;BA.debugLine="Dim privatechat_info As String = colroot.Get(\"pr";
_privatechat_info = BA.ObjectToString(_colroot.Get((Object)("privatechat_info")));
RDebugUtils.currentLine=9895955;
 //BA.debugLineNum = 9895955;BA.debugLine="Dim replyToMessageId As String = colroot.Get(\"re";
_replytomessageid = BA.ObjectToString(_colroot.Get((Object)("replyToMessageId")));
RDebugUtils.currentLine=9895956;
 //BA.debugLineNum = 9895956;BA.debugLine="Dim lastReadInboxMessageId As String = colroot.G";
_lastreadinboxmessageid = BA.ObjectToString(_colroot.Get((Object)("lastReadInboxMessageId")));
RDebugUtils.currentLine=9895957;
 //BA.debugLineNum = 9895957;BA.debugLine="Dim lastReadOutboxMessageId As String = colroot.";
_lastreadoutboxmessageid = BA.ObjectToString(_colroot.Get((Object)("lastReadOutboxMessageId")));
RDebugUtils.currentLine=9895958;
 //BA.debugLineNum = 9895958;BA.debugLine="Dim unreadCount As String = colroot.Get(\"unreadC";
_unreadcount = BA.ObjectToString(_colroot.Get((Object)("unreadCount")));
RDebugUtils.currentLine=9895960;
 //BA.debugLineNum = 9895960;BA.debugLine="Dim photo_id As String = colroot.Get(\"photo_id\")";
_photo_id = BA.ObjectToString(_colroot.Get((Object)("photo_id")));
RDebugUtils.currentLine=9895961;
 //BA.debugLineNum = 9895961;BA.debugLine="Dim photo_l_isDownloadingCompleted As String = c";
_photo_l_isdownloadingcompleted = BA.ObjectToString(_colroot.Get((Object)("photo_l_isDownloadingCompleted")));
RDebugUtils.currentLine=9895962;
 //BA.debugLineNum = 9895962;BA.debugLine="Dim photo_l_path As String = colroot.Get(\"photo_";
_photo_l_path = BA.ObjectToString(_colroot.Get((Object)("photo_l_path")));
RDebugUtils.currentLine=9895963;
 //BA.debugLineNum = 9895963;BA.debugLine="Dim photo_r_id As String = colroot.Get(\"photo_r_";
_photo_r_id = BA.ObjectToString(_colroot.Get((Object)("photo_r_id")));
RDebugUtils.currentLine=9895969;
 //BA.debugLineNum = 9895969;BA.debugLine="Log(\"chat : \"&title&\"reply :\"& replyToMessageId&";
anywheresoftware.b4a.keywords.Common.LogImpl("69895969","chat : "+_title+"reply :"+_replytomessageid+" lastin : "+_lastreadinboxmessageid+" lastout : "+_lastreadoutboxmessageid+" unread : "+_unreadcount,0);
RDebugUtils.currentLine=9895971;
 //BA.debugLineNum = 9895971;BA.debugLine="Dim content As Long = colroot.Get(\"content\")";
_content = BA.ObjectToLongNumber(_colroot.Get((Object)("content")));
RDebugUtils.currentLine=9895974;
 //BA.debugLineNum = 9895974;BA.debugLine="Dim topmasg_type As String = colroot.Get(\"topmas";
_topmasg_type = BA.ObjectToString(_colroot.Get((Object)("topmasg_type")));
RDebugUtils.currentLine=9895975;
 //BA.debugLineNum = 9895975;BA.debugLine="Dim topmsg_info As String = colroot.Get(\"topmsg_";
_topmsg_info = BA.ObjectToString(_colroot.Get((Object)("topmsg_info")));
RDebugUtils.currentLine=9895977;
 //BA.debugLineNum = 9895977;BA.debugLine="Select ChatConstructor";
switch (BA.switchObjectToInt(_chatconstructor,"955152366")) {
case 0: {
RDebugUtils.currentLine=9895979;
 //BA.debugLineNum = 9895979;BA.debugLine="Dim parser_a As JSONParser";
_parser_a = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=9895980;
 //BA.debugLineNum = 9895980;BA.debugLine="parser_a.Initialize(channel_info)";
_parser_a.Initialize(_channel_info);
RDebugUtils.currentLine=9895981;
 //BA.debugLineNum = 9895981;BA.debugLine="Dim root_a As Map = parser_a.NextObject";
_root_a = new anywheresoftware.b4a.objects.collections.Map();
_root_a = _parser_a.NextObject();
RDebugUtils.currentLine=9895982;
 //BA.debugLineNum = 9895982;BA.debugLine="Dim id_channelinfo As Int = root_a.Get(\"superg";
_id_channelinfo = (int)(BA.ObjectToNumber(_root_a.Get((Object)("supergroupId"))));
RDebugUtils.currentLine=9895983;
 //BA.debugLineNum = 9895983;BA.debugLine="Dim isSupergroup As String = root_a.Get(\"isCha";
_issupergroup = BA.ObjectToString(_root_a.Get((Object)("isChannel")));
RDebugUtils.currentLine=9895985;
 //BA.debugLineNum = 9895985;BA.debugLine="If isSupergroup=True Then";
if ((_issupergroup).equals(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.True))) { 
RDebugUtils.currentLine=9895989;
 //BA.debugLineNum = 9895989;BA.debugLine="Dim Item As Adap_chats";
_item = new com.it.fome.ac_lchats._adap_chats();
RDebugUtils.currentLine=9895990;
 //BA.debugLineNum = 9895990;BA.debugLine="Item.chat_id=chat_id";
_item.chat_id /*long*/  = _chat_id;
RDebugUtils.currentLine=9895991;
 //BA.debugLineNum = 9895991;BA.debugLine="Item.title=title";
_item.title /*String*/  = _title;
RDebugUtils.currentLine=9895992;
 //BA.debugLineNum = 9895992;BA.debugLine="Item.topdate=topdate";
_item.topdate /*String*/  = _topdate;
RDebugUtils.currentLine=9895993;
 //BA.debugLineNum = 9895993;BA.debugLine="Item.chat_type=chat_type";
_item.chat_type /*String*/  = _chat_type;
RDebugUtils.currentLine=9895994;
 //BA.debugLineNum = 9895994;BA.debugLine="Item.channel_info=channel_info";
_item.channel_info /*String*/  = _channel_info;
RDebugUtils.currentLine=9895995;
 //BA.debugLineNum = 9895995;BA.debugLine="Item.group_info=group_info";
_item.group_info /*String*/  = _group_info;
RDebugUtils.currentLine=9895996;
 //BA.debugLineNum = 9895996;BA.debugLine="Item.privatechat_info=privatechat_info";
_item.privatechat_info /*String*/  = _privatechat_info;
RDebugUtils.currentLine=9895997;
 //BA.debugLineNum = 9895997;BA.debugLine="Item.topmasg_type=topmasg_type";
_item.topmasg_type /*String*/  = _topmasg_type;
RDebugUtils.currentLine=9895998;
 //BA.debugLineNum = 9895998;BA.debugLine="Item.topmsg_info=topmsg_info";
_item.topmsg_info /*String*/  = _topmsg_info;
RDebugUtils.currentLine=9895999;
 //BA.debugLineNum = 9895999;BA.debugLine="Item.unreadCount=unreadCount";
_item.unreadCount /*int*/  = (int)(Double.parseDouble(_unreadcount));
RDebugUtils.currentLine=9896000;
 //BA.debugLineNum = 9896000;BA.debugLine="Item.ChatConstructor=ChatConstructor";
_item.ChatConstructor /*String*/  = _chatconstructor;
RDebugUtils.currentLine=9896002;
 //BA.debugLineNum = 9896002;BA.debugLine="Item.img_isdwonload=photo_l_isDownloadingComp";
_item.img_isdwonload /*String*/  = _photo_l_isdownloadingcompleted;
RDebugUtils.currentLine=9896003;
 //BA.debugLineNum = 9896003;BA.debugLine="Item.img_id=photo_id";
_item.img_id /*String*/  = _photo_id;
RDebugUtils.currentLine=9896004;
 //BA.debugLineNum = 9896004;BA.debugLine="Item.img_remote=photo_r_id";
_item.img_remote /*String*/  = _photo_r_id;
RDebugUtils.currentLine=9896005;
 //BA.debugLineNum = 9896005;BA.debugLine="Item.img_my=photo_l_path";
_item.img_my /*String*/  = _photo_l_path;
RDebugUtils.currentLine=9896006;
 //BA.debugLineNum = 9896006;BA.debugLine="listchats.Add(Item)";
_listchats.Add((Object)(_item));
RDebugUtils.currentLine=9896007;
 //BA.debugLineNum = 9896007;BA.debugLine="LV.notifyItemAdded";
mostCurrent._lv.notifyItemAdded();
 }else {
 };
 break; }
}
;
 }
};
RDebugUtils.currentLine=9896020;
 //BA.debugLineNum = 9896020;BA.debugLine="LogColor(\"meg_chatId \"&chat_id,Colors.Blue)";
anywheresoftware.b4a.keywords.Common.LogImpl("69896020","meg_chatId "+BA.NumberToString(_chat_id),anywheresoftware.b4a.keywords.Common.Colors.Blue);
RDebugUtils.currentLine=9896022;
 //BA.debugLineNum = 9896022;BA.debugLine="LV.notifyDataSetChanged";
mostCurrent._lv.notifyDataSetChanged();
RDebugUtils.currentLine=9896024;
 //BA.debugLineNum = 9896024;BA.debugLine="End Sub";
return "";
}
public static String  _telegs_getsupergroup(String _value) throws Exception{
RDebugUtils.currentModule="ac_lchats";
if (Debug.shouldDelegate(mostCurrent.activityBA, "telegs_getsupergroup", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "telegs_getsupergroup", new Object[] {_value}));}
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
int _date = 0;
String _isverified = "";
String _ischannel = "";
String _signmessages = "";
int _membercount = 0;
int _id = 0;
String _restrictionreason = "";
String _anyonecaninvite = "";
String _usernames = "";
String _status = "";
de.amberhome.materialdialogs.MaterialDialogBuilderWrapper _builder = null;
RDebugUtils.currentLine=10682368;
 //BA.debugLineNum = 10682368;BA.debugLine="Sub telegs_getsupergroup(value As String)";
RDebugUtils.currentLine=10682369;
 //BA.debugLineNum = 10682369;BA.debugLine="Log(value)";
anywheresoftware.b4a.keywords.Common.LogImpl("610682369",_value,0);
RDebugUtils.currentLine=10682370;
 //BA.debugLineNum = 10682370;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=10682371;
 //BA.debugLineNum = 10682371;BA.debugLine="parser.Initialize(value)";
_parser.Initialize(_value);
RDebugUtils.currentLine=10682372;
 //BA.debugLineNum = 10682372;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=10682373;
 //BA.debugLineNum = 10682373;BA.debugLine="Dim date As Int = root.Get(\"date\")";
_date = (int)(BA.ObjectToNumber(_root.Get((Object)("date"))));
RDebugUtils.currentLine=10682374;
 //BA.debugLineNum = 10682374;BA.debugLine="Dim isVerified As String = root.Get(\"isVerified\")";
_isverified = BA.ObjectToString(_root.Get((Object)("isVerified")));
RDebugUtils.currentLine=10682375;
 //BA.debugLineNum = 10682375;BA.debugLine="Dim isChannel As String = root.Get(\"isChannel\")";
_ischannel = BA.ObjectToString(_root.Get((Object)("isChannel")));
RDebugUtils.currentLine=10682376;
 //BA.debugLineNum = 10682376;BA.debugLine="Dim signMessages As String = root.Get(\"signMessag";
_signmessages = BA.ObjectToString(_root.Get((Object)("signMessages")));
RDebugUtils.currentLine=10682377;
 //BA.debugLineNum = 10682377;BA.debugLine="Dim memberCount As Int = root.Get(\"memberCount\")";
_membercount = (int)(BA.ObjectToNumber(_root.Get((Object)("memberCount"))));
RDebugUtils.currentLine=10682378;
 //BA.debugLineNum = 10682378;BA.debugLine="Dim id As Int = root.Get(\"id\")";
_id = (int)(BA.ObjectToNumber(_root.Get((Object)("id"))));
RDebugUtils.currentLine=10682379;
 //BA.debugLineNum = 10682379;BA.debugLine="Dim restrictionReason As String = root.Get(\"restr";
_restrictionreason = BA.ObjectToString(_root.Get((Object)("restrictionReason")));
RDebugUtils.currentLine=10682380;
 //BA.debugLineNum = 10682380;BA.debugLine="Dim anyoneCanInvite As String = root.Get(\"anyoneC";
_anyonecaninvite = BA.ObjectToString(_root.Get((Object)("anyoneCanInvite")));
RDebugUtils.currentLine=10682381;
 //BA.debugLineNum = 10682381;BA.debugLine="Dim usernames As String = root.Get(\"username\")";
_usernames = BA.ObjectToString(_root.Get((Object)("username")));
RDebugUtils.currentLine=10682382;
 //BA.debugLineNum = 10682382;BA.debugLine="Dim status As String = root.Get(\"status\")";
_status = BA.ObjectToString(_root.Get((Object)("status")));
RDebugUtils.currentLine=10682384;
 //BA.debugLineNum = 10682384;BA.debugLine="id_target=id";
mostCurrent._id_target = BA.NumberToString(_id);
RDebugUtils.currentLine=10682385;
 //BA.debugLineNum = 10682385;BA.debugLine="username_target=usernames";
mostCurrent._username_target = _usernames;
RDebugUtils.currentLine=10682387;
 //BA.debugLineNum = 10682387;BA.debugLine="us_name=usernames";
mostCurrent._us_name = _usernames;
RDebugUtils.currentLine=10682388;
 //BA.debugLineNum = 10682388;BA.debugLine="Dim Builder As MaterialDialogBuilder";
_builder = new de.amberhome.materialdialogs.MaterialDialogBuilderWrapper();
RDebugUtils.currentLine=10682389;
 //BA.debugLineNum = 10682389;BA.debugLine="Builder.Initialize(\"Dialog\")";
_builder.Initialize(mostCurrent.activityBA,"Dialog");
RDebugUtils.currentLine=10682391;
 //BA.debugLineNum = 10682391;BA.debugLine="Builder.Items(Array As String(\"سفارش ممبر برای کا";
_builder.Items((java.lang.CharSequence[])(new String[]{"سفارش ممبر برای کانال "+mostCurrent._title_target,"سفارش ویو برای کانال "+mostCurrent._title_target}));
RDebugUtils.currentLine=10682392;
 //BA.debugLineNum = 10682392;BA.debugLine="Builder.ItemsCallback";
_builder.ItemsCallback();
RDebugUtils.currentLine=10682393;
 //BA.debugLineNum = 10682393;BA.debugLine="Builder.Show";
_builder.Show();
RDebugUtils.currentLine=10682395;
 //BA.debugLineNum = 10682395;BA.debugLine="End Sub";
return "";
}
public static String  _telegs_update_file(String _respon) throws Exception{
RDebugUtils.currentModule="ac_lchats";
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
com.it.fome.ac_lchats._adap_chats _itema = null;
RDebugUtils.currentLine=9961472;
 //BA.debugLineNum = 9961472;BA.debugLine="Sub telegs_update_file(respon As String)";
RDebugUtils.currentLine=9961474;
 //BA.debugLineNum = 9961474;BA.debugLine="LogColor(respon,Colors.Blue)";
anywheresoftware.b4a.keywords.Common.LogImpl("69961474",_respon,anywheresoftware.b4a.keywords.Common.Colors.Blue);
RDebugUtils.currentLine=9961475;
 //BA.debugLineNum = 9961475;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=9961476;
 //BA.debugLineNum = 9961476;BA.debugLine="parser.Initialize(respon)";
_parser.Initialize(_respon);
RDebugUtils.currentLine=9961477;
 //BA.debugLineNum = 9961477;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=9961478;
 //BA.debugLineNum = 9961478;BA.debugLine="Dim photof_remot_id As String = root.Get(\"photof_";
_photof_remot_id = BA.ObjectToString(_root.Get((Object)("photof_remot_id")));
RDebugUtils.currentLine=9961479;
 //BA.debugLineNum = 9961479;BA.debugLine="Dim photof_local_candownload As String = root.Get";
_photof_local_candownload = BA.ObjectToString(_root.Get((Object)("photof_local_candownload")));
RDebugUtils.currentLine=9961480;
 //BA.debugLineNum = 9961480;BA.debugLine="Dim photof_local_isdownload As String = root.Get(";
_photof_local_isdownload = BA.ObjectToString(_root.Get((Object)("photof_local_isdownload")));
RDebugUtils.currentLine=9961481;
 //BA.debugLineNum = 9961481;BA.debugLine="Dim photof_expectedSize As Int = root.Get(\"photof";
_photof_expectedsize = (int)(BA.ObjectToNumber(_root.Get((Object)("photof_expectedSize"))));
RDebugUtils.currentLine=9961482;
 //BA.debugLineNum = 9961482;BA.debugLine="Dim photof_remot_uploadsize As Int = root.Get(\"ph";
_photof_remot_uploadsize = (int)(BA.ObjectToNumber(_root.Get((Object)("photof_remot_uploadsize"))));
RDebugUtils.currentLine=9961483;
 //BA.debugLineNum = 9961483;BA.debugLine="Dim photof_size As Int = root.Get(\"photof_size\")";
_photof_size = (int)(BA.ObjectToNumber(_root.Get((Object)("photof_size"))));
RDebugUtils.currentLine=9961484;
 //BA.debugLineNum = 9961484;BA.debugLine="Dim photof_remot_isuploadactive As String = root.";
_photof_remot_isuploadactive = BA.ObjectToString(_root.Get((Object)("photof_remot_isuploadactive")));
RDebugUtils.currentLine=9961485;
 //BA.debugLineNum = 9961485;BA.debugLine="Dim photof_local_perfexsize As Int = root.Get(\"ph";
_photof_local_perfexsize = (int)(BA.ObjectToNumber(_root.Get((Object)("photof_local_perfexsize"))));
RDebugUtils.currentLine=9961486;
 //BA.debugLineNum = 9961486;BA.debugLine="Dim photof_remot_isuploadcomplit As String = root";
_photof_remot_isuploadcomplit = BA.ObjectToString(_root.Get((Object)("photof_remot_isuploadcomplit")));
RDebugUtils.currentLine=9961487;
 //BA.debugLineNum = 9961487;BA.debugLine="Dim photof_local_downloadsize As Int = root.Get(\"";
_photof_local_downloadsize = (int)(BA.ObjectToNumber(_root.Get((Object)("photof_local_downloadsize"))));
RDebugUtils.currentLine=9961488;
 //BA.debugLineNum = 9961488;BA.debugLine="Dim photof_local_canbedlelte As String = root.Get";
_photof_local_canbedlelte = BA.ObjectToString(_root.Get((Object)("photof_local_canbedlelte")));
RDebugUtils.currentLine=9961489;
 //BA.debugLineNum = 9961489;BA.debugLine="Dim photof_id As Int = root.Get(\"photof_id\")";
_photof_id = (int)(BA.ObjectToNumber(_root.Get((Object)("photof_id"))));
RDebugUtils.currentLine=9961490;
 //BA.debugLineNum = 9961490;BA.debugLine="Dim photof_local_isdowloaded As String = root.Get";
_photof_local_isdowloaded = BA.ObjectToString(_root.Get((Object)("photof_local_isdowloaded")));
RDebugUtils.currentLine=9961491;
 //BA.debugLineNum = 9961491;BA.debugLine="Dim photof_localpath As String = root.Get(\"photof";
_photof_localpath = BA.ObjectToString(_root.Get((Object)("photof_localpath")));
RDebugUtils.currentLine=9961493;
 //BA.debugLineNum = 9961493;BA.debugLine="Log(\" isdowloaded \"&photof_local_isdowloaded&\" si";
anywheresoftware.b4a.keywords.Common.LogImpl("69961493"," isdowloaded "+_photof_local_isdowloaded+" size "+BA.NumberToString(_photof_size)+" dl size : "+BA.NumberToString(_photof_local_downloadsize)+" is download "+_photof_local_isdownload+" can dl : "+_photof_local_candownload,0);
RDebugUtils.currentLine=9961494;
 //BA.debugLineNum = 9961494;BA.debugLine="Log(\"p : \"&photof_localpath)";
anywheresoftware.b4a.keywords.Common.LogImpl("69961494","p : "+_photof_localpath,0);
RDebugUtils.currentLine=9961496;
 //BA.debugLineNum = 9961496;BA.debugLine="Try";
try {RDebugUtils.currentLine=9961497;
 //BA.debugLineNum = 9961497;BA.debugLine="If photof_local_isdowloaded=\"true\" Then";
if ((_photof_local_isdowloaded).equals("true")) { 
RDebugUtils.currentLine=9961498;
 //BA.debugLineNum = 9961498;BA.debugLine="For ss=0 To listchats.Size-1";
{
final int step23 = 1;
final int limit23 = (int) (_listchats.getSize()-1);
_ss = (int) (0) ;
for (;_ss <= limit23 ;_ss = _ss + step23 ) {
RDebugUtils.currentLine=9961499;
 //BA.debugLineNum = 9961499;BA.debugLine="Dim Itema = listchats.Get(ss) As Adap_chats";
_itema = (com.it.fome.ac_lchats._adap_chats)(_listchats.Get(_ss));
RDebugUtils.currentLine=9961500;
 //BA.debugLineNum = 9961500;BA.debugLine="If Itema.img_id=photof_id Then";
if ((_itema.img_id /*String*/ ).equals(BA.NumberToString(_photof_id))) { 
RDebugUtils.currentLine=9961501;
 //BA.debugLineNum = 9961501;BA.debugLine="Log(ss&\" img id ready!\")";
anywheresoftware.b4a.keywords.Common.LogImpl("69961501",BA.NumberToString(_ss)+" img id ready!",0);
RDebugUtils.currentLine=9961503;
 //BA.debugLineNum = 9961503;BA.debugLine="Itema.img_my = photof_localpath";
_itema.img_my /*String*/  = _photof_localpath;
RDebugUtils.currentLine=9961504;
 //BA.debugLineNum = 9961504;BA.debugLine="Itema.img_isdwonload=photof_local_isdowloaded";
_itema.img_isdwonload /*String*/  = _photof_local_isdowloaded;
RDebugUtils.currentLine=9961505;
 //BA.debugLineNum = 9961505;BA.debugLine="Itema.img_remote=photof_remot_id";
_itema.img_remote /*String*/  = _photof_remot_id;
RDebugUtils.currentLine=9961506;
 //BA.debugLineNum = 9961506;BA.debugLine="Itema.img_id=photof_id";
_itema.img_id /*String*/  = BA.NumberToString(_photof_id);
RDebugUtils.currentLine=9961508;
 //BA.debugLineNum = 9961508;BA.debugLine="LV.notifyItemChanged(ss)";
mostCurrent._lv.notifyItemChanged(_ss);
 };
 }
};
 };
 } 
       catch (Exception e36) {
			processBA.setLastException(e36);RDebugUtils.currentLine=9961517;
 //BA.debugLineNum = 9961517;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("69961517",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 };
RDebugUtils.currentLine=9961526;
 //BA.debugLineNum = 9961526;BA.debugLine="End Sub";
return "";
}
}