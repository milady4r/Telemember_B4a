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

public class ac_tsearch extends androidx.appcompat.app.AppCompatActivity implements B4AActivity{
	public static ac_tsearch mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "com.it.fome", "com.it.fome.ac_tsearch");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (ac_tsearch).");
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
		activityBA = new BA(this, layout, processBA, "com.it.fome", "com.it.fome.ac_tsearch");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "com.it.fome.ac_tsearch", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (ac_tsearch) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (ac_tsearch) Resume **");
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
		return ac_tsearch.class;
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
        BA.LogInfo("** Activity (ac_tsearch) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            ac_tsearch mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (ac_tsearch) Resume **");
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
public static class _adap_search{
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
public de.amberhome.objects.CardViewWrapper _cardchannel = null;
public anywheresoftware.b4a.objects.collections.List _listchats = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edit = null;
public static String _id_user = "";
public anywheresoftware.b4a.objects.PanelWrapper _pnl_dilogs = null;
public static String _username_target = "";
public static String _title_target = "";
public static String _id_target = "";
public static String _img_target = "";
public static String _idchannel_target = "";
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
public com.it.fome.ac_tcoin _ac_tcoin = null;
public com.it.fome.ac_home _ac_home = null;
public com.it.fome.act_chat _act_chat = null;
public com.it.fome.starter _starter = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="ac_tsearch";
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
de.amberhome.objects.CardViewWrapper _card = null;
anywheresoftware.b4a.objects.PanelWrapper _pnl_search = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl_search = null;
RDebugUtils.currentLine=14483456;
 //BA.debugLineNum = 14483456;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=14483461;
 //BA.debugLineNum = 14483461;BA.debugLine="telegs.Initialize(\"telegs\")";
_telegs.Initialize(processBA,"telegs");
RDebugUtils.currentLine=14483462;
 //BA.debugLineNum = 14483462;BA.debugLine="listchats.Initialize";
mostCurrent._listchats.Initialize();
RDebugUtils.currentLine=14483464;
 //BA.debugLineNum = 14483464;BA.debugLine="If File.Exists(File.DirInternal,\"instadb.db\")=Fal";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"instadb.db")==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=14483465;
 //BA.debugLineNum = 14483465;BA.debugLine="File.Copy(File.DirAssets,\"instadb.db\",File.DirIn";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"instadb.db",anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"instadb.db");
 };
RDebugUtils.currentLine=14483467;
 //BA.debugLineNum = 14483467;BA.debugLine="If sql1.IsInitialized=False Then";
if (_sql1.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=14483468;
 //BA.debugLineNum = 14483468;BA.debugLine="sql1.Initialize(File.DirInternal,\"instadb.db\",Fa";
_sql1.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"instadb.db",anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=14483480;
 //BA.debugLineNum = 14483480;BA.debugLine="cursor1 = sql1.ExecQuery(\"SELECT * FROM tbl_tele";
_cursor1.setObject((android.database.Cursor)(_sql1.ExecQuery("SELECT * FROM tbl_tele WHERE soich='1'")));
RDebugUtils.currentLine=14483481;
 //BA.debugLineNum = 14483481;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=14483482;
 //BA.debugLineNum = 14483482;BA.debugLine="For i=0 To cursor1.RowCount-1";
{
final int step11 = 1;
final int limit11 = (int) (_cursor1.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit11 ;_i = _i + step11 ) {
RDebugUtils.currentLine=14483483;
 //BA.debugLineNum = 14483483;BA.debugLine="cursor1.Position=i";
_cursor1.setPosition(_i);
RDebugUtils.currentLine=14483484;
 //BA.debugLineNum = 14483484;BA.debugLine="userid_t=cursor1.GetString(\"userid\")";
_userid_t = _cursor1.GetString("userid");
RDebugUtils.currentLine=14483485;
 //BA.debugLineNum = 14483485;BA.debugLine="username_t=cursor1.GetString(\"username\")";
_username_t = _cursor1.GetString("username");
 }
};
RDebugUtils.currentLine=14483487;
 //BA.debugLineNum = 14483487;BA.debugLine="cursor1.Close";
_cursor1.Close();
RDebugUtils.currentLine=14483490;
 //BA.debugLineNum = 14483490;BA.debugLine="Dim Gradient1 As GradientDrawable";
_gradient1 = new anywheresoftware.b4a.objects.drawable.GradientDrawable();
RDebugUtils.currentLine=14483491;
 //BA.debugLineNum = 14483491;BA.debugLine="Dim Clrs(5) As Int";
_clrs = new int[(int) (5)];
;
RDebugUtils.currentLine=14483492;
 //BA.debugLineNum = 14483492;BA.debugLine="Clrs(0) = 0xFFe8eaf6";
_clrs[(int) (0)] = (int) (0xffe8eaf6);
RDebugUtils.currentLine=14483493;
 //BA.debugLineNum = 14483493;BA.debugLine="Clrs(1) = 0xFFe8eaf6";
_clrs[(int) (1)] = (int) (0xffe8eaf6);
RDebugUtils.currentLine=14483494;
 //BA.debugLineNum = 14483494;BA.debugLine="Clrs(2) = 0xFFe8eaf6";
_clrs[(int) (2)] = (int) (0xffe8eaf6);
RDebugUtils.currentLine=14483495;
 //BA.debugLineNum = 14483495;BA.debugLine="Clrs(3) = 0xFF283593";
_clrs[(int) (3)] = (int) (0xff283593);
RDebugUtils.currentLine=14483496;
 //BA.debugLineNum = 14483496;BA.debugLine="Clrs(4) = 0xFF283593";
_clrs[(int) (4)] = (int) (0xff283593);
RDebugUtils.currentLine=14483498;
 //BA.debugLineNum = 14483498;BA.debugLine="Gradient1.Initialize(\"TOP_BOTTOM\", Clrs)";
_gradient1.Initialize(BA.getEnumFromString(android.graphics.drawable.GradientDrawable.Orientation.class,"TOP_BOTTOM"),_clrs);
RDebugUtils.currentLine=14483499;
 //BA.debugLineNum = 14483499;BA.debugLine="Activity.Background=Gradient1";
mostCurrent._activity.setBackground((android.graphics.drawable.Drawable)(_gradient1.getObject()));
RDebugUtils.currentLine=14483501;
 //BA.debugLineNum = 14483501;BA.debugLine="Dim bkcolor As ColorDrawable";
_bkcolor = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=14483502;
 //BA.debugLineNum = 14483502;BA.debugLine="bkcolor.Initialize(Colors.White,8)";
_bkcolor.Initialize(anywheresoftware.b4a.keywords.Common.Colors.White,(int) (8));
RDebugUtils.currentLine=14483503;
 //BA.debugLineNum = 14483503;BA.debugLine="meno.Initialize(\"meno\")";
mostCurrent._meno.Initialize(mostCurrent.activityBA,"meno");
RDebugUtils.currentLine=14483504;
 //BA.debugLineNum = 14483504;BA.debugLine="meno.TextColor=Colors.DarkGray";
mostCurrent._meno.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.DarkGray);
RDebugUtils.currentLine=14483505;
 //BA.debugLineNum = 14483505;BA.debugLine="meno.TextSize=37";
mostCurrent._meno.setTextSize((float) (37));
RDebugUtils.currentLine=14483506;
 //BA.debugLineNum = 14483506;BA.debugLine="meno.Background=bkcolor";
mostCurrent._meno.setBackground((android.graphics.drawable.Drawable)(_bkcolor.getObject()));
RDebugUtils.currentLine=14483507;
 //BA.debugLineNum = 14483507;BA.debugLine="meno.Typeface=Typeface.MATERIALICONS";
mostCurrent._meno.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.getMATERIALICONS());
RDebugUtils.currentLine=14483508;
 //BA.debugLineNum = 14483508;BA.debugLine="meno.Text=Chr(0xE3C7)";
mostCurrent._meno.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr((int) (0xe3c7))));
RDebugUtils.currentLine=14483509;
 //BA.debugLineNum = 14483509;BA.debugLine="meno.Gravity=Gravity.CENTER_HORIZONTAL+Gravity.CE";
mostCurrent._meno.setGravity((int) (anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL+anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=14483510;
 //BA.debugLineNum = 14483510;BA.debugLine="Activity.AddView(meno,3%x,3%x,12%x,12%x)";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._meno.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (3),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (3),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (12),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (12),mostCurrent.activityBA));
RDebugUtils.currentLine=14483512;
 //BA.debugLineNum = 14483512;BA.debugLine="pnl_coins.Initialize(\"pnl_coins\")";
mostCurrent._pnl_coins.Initialize(mostCurrent.activityBA,"pnl_coins");
RDebugUtils.currentLine=14483513;
 //BA.debugLineNum = 14483513;BA.debugLine="Activity.AddView(pnl_coins,50%x,3%x,50%x,12%x)";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._pnl_coins.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (50),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (3),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (50),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (12),mostCurrent.activityBA));
RDebugUtils.currentLine=14483514;
 //BA.debugLineNum = 14483514;BA.debugLine="roundview.Initialize(pnl_coins)";
mostCurrent._roundview.Initialize(processBA,(android.view.View)(mostCurrent._pnl_coins.getObject()));
RDebugUtils.currentLine=14483515;
 //BA.debugLineNum = 14483515;BA.debugLine="roundview.CornerRadius_BL=35";
mostCurrent._roundview.setCornerRadius_BL((int) (35));
RDebugUtils.currentLine=14483516;
 //BA.debugLineNum = 14483516;BA.debugLine="roundview.CornerRadius_TL=35";
mostCurrent._roundview.setCornerRadius_TL((int) (35));
RDebugUtils.currentLine=14483517;
 //BA.debugLineNum = 14483517;BA.debugLine="roundview.BackgroundColor=Colors.White";
mostCurrent._roundview.setBackgroundColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=14483519;
 //BA.debugLineNum = 14483519;BA.debugLine="Dim bkcolor_st As ColorDrawable";
_bkcolor_st = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=14483520;
 //BA.debugLineNum = 14483520;BA.debugLine="bkcolor_st.Initialize2(0xFFC67D00,50,4dip,0x82FFE";
_bkcolor_st.Initialize2((int) (0xffc67d00),(int) (50),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (4)),(int) (0x82ffe300));
RDebugUtils.currentLine=14483522;
 //BA.debugLineNum = 14483522;BA.debugLine="Dim pnlb1 As Panel";
_pnlb1 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=14483523;
 //BA.debugLineNum = 14483523;BA.debugLine="pnlb1.Initialize(\"\")";
_pnlb1.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=14483524;
 //BA.debugLineNum = 14483524;BA.debugLine="pnlb1.Color=0xFFFFC300";
_pnlb1.setColor((int) (0xffffc300));
RDebugUtils.currentLine=14483525;
 //BA.debugLineNum = 14483525;BA.debugLine="pnlb1.Background=bkcolor_st";
_pnlb1.setBackground((android.graphics.drawable.Drawable)(_bkcolor_st.getObject()));
RDebugUtils.currentLine=14483526;
 //BA.debugLineNum = 14483526;BA.debugLine="pnl_coins.AddView(pnlb1,pnl_coins.Width-11%x,1%x,";
mostCurrent._pnl_coins.AddView((android.view.View)(_pnlb1.getObject()),(int) (mostCurrent._pnl_coins.getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (11),mostCurrent.activityBA)),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (1),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA),(int) (mostCurrent._pnl_coins.getHeight()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (2),mostCurrent.activityBA)));
RDebugUtils.currentLine=14483528;
 //BA.debugLineNum = 14483528;BA.debugLine="lbl_icon.Initialize(\"lbl_icon\")";
mostCurrent._lbl_icon.Initialize(mostCurrent.activityBA,"lbl_icon");
RDebugUtils.currentLine=14483529;
 //BA.debugLineNum = 14483529;BA.debugLine="lbl_icon.SetBackgroundImage(LoadBitmap(File.DirAs";
mostCurrent._lbl_icon.SetBackgroundImageNew((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"coins.png").getObject()));
RDebugUtils.currentLine=14483530;
 //BA.debugLineNum = 14483530;BA.debugLine="pnl_coins.AddView(lbl_icon,pnl_coins.Width-9%x,pn";
mostCurrent._pnl_coins.AddView((android.view.View)(mostCurrent._lbl_icon.getObject()),(int) (mostCurrent._pnl_coins.getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (9),mostCurrent.activityBA)),(int) (mostCurrent._pnl_coins.getHeight()/(double)2/(double)2),(int) (mostCurrent._pnl_coins.getHeight()/(double)2),(int) (mostCurrent._pnl_coins.getHeight()/(double)2));
RDebugUtils.currentLine=14483532;
 //BA.debugLineNum = 14483532;BA.debugLine="lbl_nums.Initialize(\"lbl_nums\")";
mostCurrent._lbl_nums.Initialize(mostCurrent.activityBA,"lbl_nums");
RDebugUtils.currentLine=14483533;
 //BA.debugLineNum = 14483533;BA.debugLine="lbl_nums.TextColor=Colors.DarkGray";
mostCurrent._lbl_nums.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.DarkGray);
RDebugUtils.currentLine=14483534;
 //BA.debugLineNum = 14483534;BA.debugLine="lbl_nums.TextSize=20";
mostCurrent._lbl_nums.setTextSize((float) (20));
RDebugUtils.currentLine=14483535;
 //BA.debugLineNum = 14483535;BA.debugLine="lbl_nums.Typeface=Typeface.LoadFromAssets(\"iran_s";
mostCurrent._lbl_nums.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("iran_sans.ttf"));
RDebugUtils.currentLine=14483536;
 //BA.debugLineNum = 14483536;BA.debugLine="lbl_nums.Text=0&\" سکه\"";
mostCurrent._lbl_nums.setText(BA.ObjectToCharSequence(BA.NumberToString(0)+" سکه"));
RDebugUtils.currentLine=14483537;
 //BA.debugLineNum = 14483537;BA.debugLine="lbl_nums.Gravity=Gravity.CENTER_VERTICAL+Gravity.";
mostCurrent._lbl_nums.setGravity((int) (anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL+anywheresoftware.b4a.keywords.Common.Gravity.RIGHT));
RDebugUtils.currentLine=14483538;
 //BA.debugLineNum = 14483538;BA.debugLine="pnl_coins.AddView(lbl_nums,2%x,0,pnl_coins.Width-";
mostCurrent._pnl_coins.AddView((android.view.View)(mostCurrent._lbl_nums.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (2),mostCurrent.activityBA),(int) (0),(int) (mostCurrent._pnl_coins.getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (15),mostCurrent.activityBA)),mostCurrent._pnl_coins.getHeight());
RDebugUtils.currentLine=14483540;
 //BA.debugLineNum = 14483540;BA.debugLine="Dim bg As ColorDrawable";
_bg = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=14483541;
 //BA.debugLineNum = 14483541;BA.debugLine="bg.Initialize2(Colors.White,5dip,2dip,Colors.Ligh";
_bg.Initialize2(anywheresoftware.b4a.keywords.Common.Colors.White,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (5)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (2)),anywheresoftware.b4a.keywords.Common.Colors.LightGray);
RDebugUtils.currentLine=14483542;
 //BA.debugLineNum = 14483542;BA.debugLine="pnl_lv.Initialize(\"pnl_lv\")";
mostCurrent._pnl_lv.Initialize(mostCurrent.activityBA,"pnl_lv");
RDebugUtils.currentLine=14483543;
 //BA.debugLineNum = 14483543;BA.debugLine="pnl_lv.Background=bg";
mostCurrent._pnl_lv.setBackground((android.graphics.drawable.Drawable)(_bg.getObject()));
RDebugUtils.currentLine=14483544;
 //BA.debugLineNum = 14483544;BA.debugLine="Activity.AddView(pnl_lv,5%x,12%y,100%x-10%x,90%y-";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._pnl_lv.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (12),mostCurrent.activityBA),(int) (anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA)-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA)),(int) (anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (90),mostCurrent.activityBA)-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (7),mostCurrent.activityBA)));
RDebugUtils.currentLine=14483546;
 //BA.debugLineNum = 14483546;BA.debugLine="Dim lbl_a As Label";
_lbl_a = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=14483547;
 //BA.debugLineNum = 14483547;BA.debugLine="lbl_a.Initialize(\"lbl_a\")";
_lbl_a.Initialize(mostCurrent.activityBA,"lbl_a");
RDebugUtils.currentLine=14483548;
 //BA.debugLineNum = 14483548;BA.debugLine="lbl_a.TextColor=Colors.DarkGray";
_lbl_a.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.DarkGray);
RDebugUtils.currentLine=14483549;
 //BA.debugLineNum = 14483549;BA.debugLine="lbl_a.TextSize=14";
_lbl_a.setTextSize((float) (14));
RDebugUtils.currentLine=14483550;
 //BA.debugLineNum = 14483550;BA.debugLine="lbl_a.Typeface=Typeface.LoadFromAssets(\"iran_sans";
_lbl_a.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("iran_sans.ttf"));
RDebugUtils.currentLine=14483551;
 //BA.debugLineNum = 14483551;BA.debugLine="lbl_a.Text=\"ثبت کانال جدید\"";
_lbl_a.setText(BA.ObjectToCharSequence("ثبت کانال جدید"));
RDebugUtils.currentLine=14483552;
 //BA.debugLineNum = 14483552;BA.debugLine="lbl_a.Gravity=Gravity.CENTER_VERTICAL+Gravity.CEN";
_lbl_a.setGravity((int) (anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL+anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL));
RDebugUtils.currentLine=14483553;
 //BA.debugLineNum = 14483553;BA.debugLine="pnl_lv.AddView(lbl_a,5%x,0,pnl_lv.Width-10%x,10%x";
mostCurrent._pnl_lv.AddView((android.view.View)(_lbl_a.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA),(int) (0),(int) (mostCurrent._pnl_lv.getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA)),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA));
RDebugUtils.currentLine=14483555;
 //BA.debugLineNum = 14483555;BA.debugLine="Dim card As CardView";
_card = new de.amberhome.objects.CardViewWrapper();
RDebugUtils.currentLine=14483556;
 //BA.debugLineNum = 14483556;BA.debugLine="card.Initialize(\"\")";
_card.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=14483557;
 //BA.debugLineNum = 14483557;BA.debugLine="card.Color=Colors.White";
_card.setColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=14483558;
 //BA.debugLineNum = 14483558;BA.debugLine="pnl_lv.AddView(card,5%x,lbl_a.Top+lbl_a.Height,pn";
mostCurrent._pnl_lv.AddView((android.view.View)(_card.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA),(int) (_lbl_a.getTop()+_lbl_a.getHeight()),(int) (mostCurrent._pnl_lv.getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA)),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (17),mostCurrent.activityBA));
RDebugUtils.currentLine=14483560;
 //BA.debugLineNum = 14483560;BA.debugLine="Dim pnl_search As Panel";
_pnl_search = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=14483561;
 //BA.debugLineNum = 14483561;BA.debugLine="pnl_search.Initialize(\"\")";
_pnl_search.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=14483562;
 //BA.debugLineNum = 14483562;BA.debugLine="card.AddView(pnl_search,0,0,card.Width,card.Heigh";
_card.AddView((android.view.View)(_pnl_search.getObject()),(int) (0),(int) (0),_card.getWidth(),_card.getHeight());
RDebugUtils.currentLine=14483564;
 //BA.debugLineNum = 14483564;BA.debugLine="Dim bg As ColorDrawable";
_bg = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=14483565;
 //BA.debugLineNum = 14483565;BA.debugLine="bg.Initialize(0xFF0072FF,20dip)";
_bg.Initialize((int) (0xff0072ff),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (20)));
RDebugUtils.currentLine=14483567;
 //BA.debugLineNum = 14483567;BA.debugLine="Dim lbl_search As Label";
_lbl_search = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=14483568;
 //BA.debugLineNum = 14483568;BA.debugLine="lbl_search.Initialize(\"lbl_search\")";
_lbl_search.Initialize(mostCurrent.activityBA,"lbl_search");
RDebugUtils.currentLine=14483569;
 //BA.debugLineNum = 14483569;BA.debugLine="lbl_search.TextColor=Colors.White";
_lbl_search.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=14483570;
 //BA.debugLineNum = 14483570;BA.debugLine="lbl_search.TextSize=12";
_lbl_search.setTextSize((float) (12));
RDebugUtils.currentLine=14483571;
 //BA.debugLineNum = 14483571;BA.debugLine="lbl_search.Background=bg";
_lbl_search.setBackground((android.graphics.drawable.Drawable)(_bg.getObject()));
RDebugUtils.currentLine=14483572;
 //BA.debugLineNum = 14483572;BA.debugLine="lbl_search.Typeface=Typeface.LoadFromAssets(\"iran";
_lbl_search.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("iran_sans.ttf"));
RDebugUtils.currentLine=14483573;
 //BA.debugLineNum = 14483573;BA.debugLine="lbl_search.Text=\"جستجو\"";
_lbl_search.setText(BA.ObjectToCharSequence("جستجو"));
RDebugUtils.currentLine=14483574;
 //BA.debugLineNum = 14483574;BA.debugLine="lbl_search.Gravity=Gravity.CENTER_VERTICAL+Gravit";
_lbl_search.setGravity((int) (anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL+anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL));
RDebugUtils.currentLine=14483575;
 //BA.debugLineNum = 14483575;BA.debugLine="pnl_search.AddView(lbl_search,pnl_search.Width-18";
_pnl_search.AddView((android.view.View)(_lbl_search.getObject()),(int) (_pnl_search.getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (18),mostCurrent.activityBA)),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (15),mostCurrent.activityBA),_pnl_search.getHeight());
RDebugUtils.currentLine=14483576;
 //BA.debugLineNum = 14483576;BA.debugLine="pnl_search.Padding = Array As Int (10dip, 10dip,";
_pnl_search.setPadding(new int[]{anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (10)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (10)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (10)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (10))});
RDebugUtils.currentLine=14483578;
 //BA.debugLineNum = 14483578;BA.debugLine="edit.Initialize(\"edit\")";
mostCurrent._edit.Initialize(mostCurrent.activityBA,"edit");
RDebugUtils.currentLine=14483579;
 //BA.debugLineNum = 14483579;BA.debugLine="edit.TextColor=Colors.DarkGray";
mostCurrent._edit.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.DarkGray);
RDebugUtils.currentLine=14483580;
 //BA.debugLineNum = 14483580;BA.debugLine="edit.TextSize=15";
mostCurrent._edit.setTextSize((float) (15));
RDebugUtils.currentLine=14483581;
 //BA.debugLineNum = 14483581;BA.debugLine="edit.Hint=\"Channel Username\"";
mostCurrent._edit.setHint("Channel Username");
RDebugUtils.currentLine=14483582;
 //BA.debugLineNum = 14483582;BA.debugLine="edit.HintColor=Colors.LightGray";
mostCurrent._edit.setHintColor(anywheresoftware.b4a.keywords.Common.Colors.LightGray);
RDebugUtils.currentLine=14483583;
 //BA.debugLineNum = 14483583;BA.debugLine="edit.Gravity=Gravity.CENTER_VERTICAL+Gravity.LEFT";
mostCurrent._edit.setGravity((int) (anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL+anywheresoftware.b4a.keywords.Common.Gravity.LEFT));
RDebugUtils.currentLine=14483584;
 //BA.debugLineNum = 14483584;BA.debugLine="pnl_search.AddView(edit,0,0,pnl_search.Width-19%x";
_pnl_search.AddView((android.view.View)(mostCurrent._edit.getObject()),(int) (0),(int) (0),(int) (_pnl_search.getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (19),mostCurrent.activityBA)),_pnl_search.getHeight());
RDebugUtils.currentLine=14483586;
 //BA.debugLineNum = 14483586;BA.debugLine="cardchannel.Initialize(\"cardchannel\")";
mostCurrent._cardchannel.Initialize(mostCurrent.activityBA,"cardchannel");
RDebugUtils.currentLine=14483587;
 //BA.debugLineNum = 14483587;BA.debugLine="cardchannel.Color=Colors.White";
mostCurrent._cardchannel.setColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=14483588;
 //BA.debugLineNum = 14483588;BA.debugLine="cardchannel.Visible=False";
mostCurrent._cardchannel.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=14483589;
 //BA.debugLineNum = 14483589;BA.debugLine="pnl_lv.AddView(cardchannel,5%x,card.Top+card.Heig";
mostCurrent._pnl_lv.AddView((android.view.View)(mostCurrent._cardchannel.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA),(int) (_card.getTop()+_card.getHeight()+anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA)),(int) (mostCurrent._pnl_lv.getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA)),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (15),mostCurrent.activityBA));
RDebugUtils.currentLine=14483591;
 //BA.debugLineNum = 14483591;BA.debugLine="req_getme(userid_t)";
_req_getme(_userid_t);
RDebugUtils.currentLine=14483593;
 //BA.debugLineNum = 14483593;BA.debugLine="End Sub";
return "";
}
public static String  _req_getme(String _userid) throws Exception{
RDebugUtils.currentModule="ac_tsearch";
if (Debug.shouldDelegate(mostCurrent.activityBA, "req_getme", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "req_getme", new Object[] {_userid}));}
com.reza.sh.fastnet.Fastnet _prfn = null;
com.reza.sh.fastnet.PostRequestRaper _post = null;
RDebugUtils.currentLine=15466496;
 //BA.debugLineNum = 15466496;BA.debugLine="Sub req_getme(userid As String)";
RDebugUtils.currentLine=15466497;
 //BA.debugLineNum = 15466497;BA.debugLine="Dim prfn As PersianFastNetwork";
_prfn = new com.reza.sh.fastnet.Fastnet();
RDebugUtils.currentLine=15466498;
 //BA.debugLineNum = 15466498;BA.debugLine="prfn.initialize(\"prfn\")";
_prfn.initialize(processBA,"prfn");
RDebugUtils.currentLine=15466500;
 //BA.debugLineNum = 15466500;BA.debugLine="Dim post As PostRequest";
_post = new com.reza.sh.fastnet.PostRequestRaper();
RDebugUtils.currentLine=15466501;
 //BA.debugLineNum = 15466501;BA.debugLine="post=prfn.BuildPostQuery(\"http://filework.ir/INST";
_post = _prfn.BuildPostQuery("http://filework.ir/INSTAFOLLOW/api/req.php","getinsta");
RDebugUtils.currentLine=15466503;
 //BA.debugLineNum = 15466503;BA.debugLine="post.addHeder(\"User-Agent\",\"Dalvik/1.6.0 (Linux;";
_post.addHeder("User-Agent","Dalvik/1.6.0 (Linux; U; Android 4.4.4; SM-A700FD Build/KTU84P)");
RDebugUtils.currentLine=15466505;
 //BA.debugLineNum = 15466505;BA.debugLine="post.addParametrs(\"ui\",\"1\")";
_post.addParametrs("ui","1");
RDebugUtils.currentLine=15466506;
 //BA.debugLineNum = 15466506;BA.debugLine="post.addParametrs(\"userid\",userid_t)";
_post.addParametrs("userid",_userid_t);
RDebugUtils.currentLine=15466508;
 //BA.debugLineNum = 15466508;BA.debugLine="post.addParametrs(\"req\",\"get_acct\")";
_post.addParametrs("req","get_acct");
RDebugUtils.currentLine=15466511;
 //BA.debugLineNum = 15466511;BA.debugLine="post.executRequestAsString";
_post.executRequestAsString();
RDebugUtils.currentLine=15466512;
 //BA.debugLineNum = 15466512;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="ac_tsearch";
RDebugUtils.currentLine=14614528;
 //BA.debugLineNum = 14614528;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=14614530;
 //BA.debugLineNum = 14614530;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="ac_tsearch";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=14548992;
 //BA.debugLineNum = 14548992;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=14548994;
 //BA.debugLineNum = 14548994;BA.debugLine="End Sub";
return "";
}
public static String  _channell_oncreateviewholder(anywheresoftware.b4a.objects.PanelWrapper _parent) throws Exception{
RDebugUtils.currentModule="ac_tsearch";
if (Debug.shouldDelegate(mostCurrent.activityBA, "channell_oncreateviewholder", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "channell_oncreateviewholder", new Object[] {_parent}));}
com.it.fome.ac_lchats._adap_chats _item = null;
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
RDebugUtils.currentLine=14942208;
 //BA.debugLineNum = 14942208;BA.debugLine="Sub channell_onCreateViewHolder (Parent As Panel)";
RDebugUtils.currentLine=14942209;
 //BA.debugLineNum = 14942209;BA.debugLine="Dim Item = listchats.Get(0) As Adap_chats";
_item = (com.it.fome.ac_lchats._adap_chats)(mostCurrent._listchats.Get((int) (0)));
RDebugUtils.currentLine=14942212;
 //BA.debugLineNum = 14942212;BA.debugLine="Parent.Color=Colors.White";
_parent.setColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=14942213;
 //BA.debugLineNum = 14942213;BA.debugLine="Parent.Height=15%y";
_parent.setHeight(anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (15),mostCurrent.activityBA));
RDebugUtils.currentLine=14942215;
 //BA.debugLineNum = 14942215;BA.debugLine="Dim pnl_main As Panel";
_pnl_main = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=14942216;
 //BA.debugLineNum = 14942216;BA.debugLine="pnl_main.Initialize(\"\")";
_pnl_main.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=14942217;
 //BA.debugLineNum = 14942217;BA.debugLine="pnl_main.Color=Colors.White";
_pnl_main.setColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=14942218;
 //BA.debugLineNum = 14942218;BA.debugLine="Parent.AddView(pnl_main,2%x,2%x,Parent.Width-4%x,";
_parent.AddView((android.view.View)(_pnl_main.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (2),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (2),mostCurrent.activityBA),(int) (_parent.getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (4),mostCurrent.activityBA)),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (15),mostCurrent.activityBA));
RDebugUtils.currentLine=14942220;
 //BA.debugLineNum = 14942220;BA.debugLine="Dim lbl As Label: lbl.Initialize(\"lbl\")";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=14942220;
 //BA.debugLineNum = 14942220;BA.debugLine="Dim lbl As Label: lbl.Initialize(\"lbl\")";
_lbl.Initialize(mostCurrent.activityBA,"lbl");
RDebugUtils.currentLine=14942221;
 //BA.debugLineNum = 14942221;BA.debugLine="lbl.TextColor = Colors.Black : lbl.TextSize = 18";
_lbl.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=14942221;
 //BA.debugLineNum = 14942221;BA.debugLine="lbl.TextColor = Colors.Black : lbl.TextSize = 18";
_lbl.setTextSize((float) (18));
RDebugUtils.currentLine=14942222;
 //BA.debugLineNum = 14942222;BA.debugLine="lbl.Gravity=Gravity.RIGHT+Gravity.CENTER_VERTICAL";
_lbl.setGravity((int) (anywheresoftware.b4a.keywords.Common.Gravity.RIGHT+anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=14942223;
 //BA.debugLineNum = 14942223;BA.debugLine="lbl.TextSize=14";
_lbl.setTextSize((float) (14));
RDebugUtils.currentLine=14942225;
 //BA.debugLineNum = 14942225;BA.debugLine="pnl_main.AddView(lbl,2%x,5dip,pnl_main.Width-17%x";
_pnl_main.AddView((android.view.View)(_lbl.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (2),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (5)),(int) (_pnl_main.getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (17),mostCurrent.activityBA)),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA));
RDebugUtils.currentLine=14942227;
 //BA.debugLineNum = 14942227;BA.debugLine="Dim lbl_iconchat As Label: lbl_iconchat.Initializ";
_lbl_iconchat = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=14942227;
 //BA.debugLineNum = 14942227;BA.debugLine="Dim lbl_iconchat As Label: lbl_iconchat.Initializ";
_lbl_iconchat.Initialize(mostCurrent.activityBA,"lbl_iconchat");
RDebugUtils.currentLine=14942228;
 //BA.debugLineNum = 14942228;BA.debugLine="lbl_iconchat.TextColor = Colors.Black : lbl_iconc";
_lbl_iconchat.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=14942228;
 //BA.debugLineNum = 14942228;BA.debugLine="lbl_iconchat.TextColor = Colors.Black : lbl_iconc";
_lbl_iconchat.setTextSize((float) (30));
RDebugUtils.currentLine=14942229;
 //BA.debugLineNum = 14942229;BA.debugLine="pnl_main.AddView(lbl_iconchat,5%x,5%x,10%x,10%x)";
_pnl_main.AddView((android.view.View)(_lbl_iconchat.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA));
RDebugUtils.currentLine=14942232;
 //BA.debugLineNum = 14942232;BA.debugLine="lbl_iconchat.Typeface=Typeface.FONTAWESOME";
_lbl_iconchat.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.getFONTAWESOME());
RDebugUtils.currentLine=14942233;
 //BA.debugLineNum = 14942233;BA.debugLine="lbl_iconchat.Text=Chr(0xF0A1)";
_lbl_iconchat.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr((int) (0xf0a1))));
RDebugUtils.currentLine=14942235;
 //BA.debugLineNum = 14942235;BA.debugLine="Dim img_prof As ImageView";
_img_prof = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=14942236;
 //BA.debugLineNum = 14942236;BA.debugLine="img_prof.Initialize(\"img_prof\")";
_img_prof.Initialize(mostCurrent.activityBA,"img_prof");
RDebugUtils.currentLine=14942238;
 //BA.debugLineNum = 14942238;BA.debugLine="img_prof.Gravity=Gravity.FILL";
_img_prof.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.FILL);
RDebugUtils.currentLine=14942239;
 //BA.debugLineNum = 14942239;BA.debugLine="pnl_main.AddView(img_prof,pnl_main.Width-13%x,5di";
_pnl_main.AddView((android.view.View)(_img_prof.getObject()),(int) (_pnl_main.getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (13),mostCurrent.activityBA)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (5)),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (12),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (12),mostCurrent.activityBA));
RDebugUtils.currentLine=14942241;
 //BA.debugLineNum = 14942241;BA.debugLine="Dim divi As Panel: divi.Initialize(\"divi\")";
_divi = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=14942241;
 //BA.debugLineNum = 14942241;BA.debugLine="Dim divi As Panel: divi.Initialize(\"divi\")";
_divi.Initialize(mostCurrent.activityBA,"divi");
RDebugUtils.currentLine=14942242;
 //BA.debugLineNum = 14942242;BA.debugLine="divi.Color=0xFFE1E5E6";
_divi.setColor((int) (0xffe1e5e6));
RDebugUtils.currentLine=14942243;
 //BA.debugLineNum = 14942243;BA.debugLine="pnl_main.AddView(divi,0,15%y,100%x-78dip,1dip)";
_pnl_main.AddView((android.view.View)(_divi.getObject()),(int) (0),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (15),mostCurrent.activityBA),(int) (anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA)-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (78))),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (1)));
RDebugUtils.currentLine=14942245;
 //BA.debugLineNum = 14942245;BA.debugLine="Dim lbl_topmsg As Label: lbl_topmsg.Initialize(\"l";
_lbl_topmsg = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=14942245;
 //BA.debugLineNum = 14942245;BA.debugLine="Dim lbl_topmsg As Label: lbl_topmsg.Initialize(\"l";
_lbl_topmsg.Initialize(mostCurrent.activityBA,"lbl_topmsg");
RDebugUtils.currentLine=14942246;
 //BA.debugLineNum = 14942246;BA.debugLine="lbl_topmsg.TextColor = 0xFFABACAE : lbl_topmsg.Te";
_lbl_topmsg.setTextColor((int) (0xffabacae));
RDebugUtils.currentLine=14942246;
 //BA.debugLineNum = 14942246;BA.debugLine="lbl_topmsg.TextColor = 0xFFABACAE : lbl_topmsg.Te";
_lbl_topmsg.setTextSize((float) (14));
RDebugUtils.currentLine=14942247;
 //BA.debugLineNum = 14942247;BA.debugLine="lbl_topmsg.Gravity=Gravity.RIGHT";
_lbl_topmsg.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.RIGHT);
RDebugUtils.currentLine=14942248;
 //BA.debugLineNum = 14942248;BA.debugLine="lbl_topmsg.Visible=False";
_lbl_topmsg.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=14942249;
 //BA.debugLineNum = 14942249;BA.debugLine="pnl_main.AddView(lbl_topmsg,30dip,40dip,100%x-110";
_pnl_main.AddView((android.view.View)(_lbl_topmsg.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (30)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (40)),(int) (anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA)-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (110))),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (20)));
RDebugUtils.currentLine=14942251;
 //BA.debugLineNum = 14942251;BA.debugLine="Dim lbl_time As Label: lbl_time.Initialize(\"lbl_t";
_lbl_time = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=14942251;
 //BA.debugLineNum = 14942251;BA.debugLine="Dim lbl_time As Label: lbl_time.Initialize(\"lbl_t";
_lbl_time.Initialize(mostCurrent.activityBA,"lbl_time");
RDebugUtils.currentLine=14942252;
 //BA.debugLineNum = 14942252;BA.debugLine="lbl_time.TextColor = 0xFFABACAE : lbl_time.TextSi";
_lbl_time.setTextColor((int) (0xffabacae));
RDebugUtils.currentLine=14942252;
 //BA.debugLineNum = 14942252;BA.debugLine="lbl_time.TextColor = 0xFFABACAE : lbl_time.TextSi";
_lbl_time.setTextSize((float) (14));
RDebugUtils.currentLine=14942254;
 //BA.debugLineNum = 14942254;BA.debugLine="lbl_time.Visible=False";
_lbl_time.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=14942255;
 //BA.debugLineNum = 14942255;BA.debugLine="pnl_main.AddView(lbl_time,5dip,10dip,100dip,20dip";
_pnl_main.AddView((android.view.View)(_lbl_time.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (5)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (10)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (20)));
RDebugUtils.currentLine=14942257;
 //BA.debugLineNum = 14942257;BA.debugLine="Dim lbl_unread As Label: lbl_unread.Initialize(\"l";
_lbl_unread = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=14942257;
 //BA.debugLineNum = 14942257;BA.debugLine="Dim lbl_unread As Label: lbl_unread.Initialize(\"l";
_lbl_unread.Initialize(mostCurrent.activityBA,"lbl_unread");
RDebugUtils.currentLine=14942258;
 //BA.debugLineNum = 14942258;BA.debugLine="lbl_unread.TextColor = 0xFFFFFFFF : lbl_unread.Te";
_lbl_unread.setTextColor((int) (0xffffffff));
RDebugUtils.currentLine=14942258;
 //BA.debugLineNum = 14942258;BA.debugLine="lbl_unread.TextColor = 0xFFFFFFFF : lbl_unread.Te";
_lbl_unread.setTextSize((float) (14));
RDebugUtils.currentLine=14942259;
 //BA.debugLineNum = 14942259;BA.debugLine="Dim red As ColorDrawable";
_red = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=14942260;
 //BA.debugLineNum = 14942260;BA.debugLine="red.Initialize(0xFF1EF47C,60)";
_red.Initialize((int) (0xff1ef47c),(int) (60));
RDebugUtils.currentLine=14942261;
 //BA.debugLineNum = 14942261;BA.debugLine="lbl_unread.Background=red";
_lbl_unread.setBackground((android.graphics.drawable.Drawable)(_red.getObject()));
RDebugUtils.currentLine=14942262;
 //BA.debugLineNum = 14942262;BA.debugLine="lbl_unread.Gravity=Gravity.CENTER";
_lbl_unread.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER);
RDebugUtils.currentLine=14942263;
 //BA.debugLineNum = 14942263;BA.debugLine="lbl_unread.Visible=False";
_lbl_unread.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=14942264;
 //BA.debugLineNum = 14942264;BA.debugLine="pnl_main.AddView(lbl_unread,10dip,40dip,20dip,20d";
_pnl_main.AddView((android.view.View)(_lbl_unread.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (10)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (40)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (20)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (20)));
RDebugUtils.currentLine=14942266;
 //BA.debugLineNum = 14942266;BA.debugLine="Dim bg As ColorDrawable";
_bg = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=14942267;
 //BA.debugLineNum = 14942267;BA.debugLine="bg.Initialize2(0xFFE3192E,5dip,2dip,0xFFEC5765)";
_bg.Initialize2((int) (0xffe3192e),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (5)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (2)),(int) (0xffec5765));
RDebugUtils.currentLine=14942268;
 //BA.debugLineNum = 14942268;BA.debugLine="Dim lbl_sef As Label: lbl_sef.Initialize(\"lbl_sef";
_lbl_sef = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=14942268;
 //BA.debugLineNum = 14942268;BA.debugLine="Dim lbl_sef As Label: lbl_sef.Initialize(\"lbl_sef";
_lbl_sef.Initialize(mostCurrent.activityBA,"lbl_sef");
RDebugUtils.currentLine=14942269;
 //BA.debugLineNum = 14942269;BA.debugLine="lbl_sef.TextColor = Colors.White : lbl_sef.TextSi";
_lbl_sef.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=14942269;
 //BA.debugLineNum = 14942269;BA.debugLine="lbl_sef.TextColor = Colors.White : lbl_sef.TextSi";
_lbl_sef.setTextSize((float) (18));
RDebugUtils.currentLine=14942270;
 //BA.debugLineNum = 14942270;BA.debugLine="lbl_sef.Gravity=Gravity.CENTER_HORIZONTAL+Gravity";
_lbl_sef.setGravity((int) (anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL+anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=14942271;
 //BA.debugLineNum = 14942271;BA.debugLine="lbl_sef.TextSize=17";
_lbl_sef.setTextSize((float) (17));
RDebugUtils.currentLine=14942272;
 //BA.debugLineNum = 14942272;BA.debugLine="lbl_sef.Text=\"سفارش\"";
_lbl_sef.setText(BA.ObjectToCharSequence("سفارش"));
RDebugUtils.currentLine=14942273;
 //BA.debugLineNum = 14942273;BA.debugLine="lbl_sef.Background=bg";
_lbl_sef.setBackground((android.graphics.drawable.Drawable)(_bg.getObject()));
RDebugUtils.currentLine=14942275;
 //BA.debugLineNum = 14942275;BA.debugLine="pnl_main.AddView(lbl_sef,pnl_main.Width/2-5%x,img";
_pnl_main.AddView((android.view.View)(_lbl_sef.getObject()),(int) (_pnl_main.getWidth()/(double)2-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA)),(int) (_img_prof.getTop()+_img_prof.getHeight()+anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (1),mostCurrent.activityBA)),(int) (_pnl_main.getWidth()/(double)2-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA)),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (8),mostCurrent.activityBA));
RDebugUtils.currentLine=14942277;
 //BA.debugLineNum = 14942277;BA.debugLine="lbl_sef.Tag=0";
_lbl_sef.setTag((Object)(0));
RDebugUtils.currentLine=14942279;
 //BA.debugLineNum = 14942279;BA.debugLine="lbl.Text = Item.title";
_lbl.setText(BA.ObjectToCharSequence(_item.title /*String*/ ));
RDebugUtils.currentLine=14942280;
 //BA.debugLineNum = 14942280;BA.debugLine="If Item.img_isdwonload=\"true\" Then";
if ((_item.img_isdwonload /*String*/ ).equals("true")) { 
RDebugUtils.currentLine=14942283;
 //BA.debugLineNum = 14942283;BA.debugLine="glide.Load(\"\",Item.img_my).OptionalCircleCrop.In";
mostCurrent._glide.Load(mostCurrent.activityBA,"",_item.img_my /*String*/ ).OptionalCircleCrop().Into(_img_prof);
 }else {
RDebugUtils.currentLine=14942285;
 //BA.debugLineNum = 14942285;BA.debugLine="glide.Load(File.DirAssets,\"lazyloader.gif\").FitC";
mostCurrent._glide.Load(mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"lazyloader.gif").FitCenter().Into(_img_prof);
RDebugUtils.currentLine=14942287;
 //BA.debugLineNum = 14942287;BA.debugLine="If Item.img_id=\"null\" Then";
if ((_item.img_id /*String*/ ).equals("null")) { 
 }else {
RDebugUtils.currentLine=14942289;
 //BA.debugLineNum = 14942289;BA.debugLine="telegs.downloadFile(Item.img_id)";
_telegs.downloadFile((int)(Double.parseDouble(_item.img_id /*String*/ )));
 };
 };
RDebugUtils.currentLine=14942295;
 //BA.debugLineNum = 14942295;BA.debugLine="End Sub";
return "";
}
public static String  _dialog_itemselected(de.amberhome.materialdialogs.MaterialDialogWrapper _dialog,int _position,String _text) throws Exception{
RDebugUtils.currentModule="ac_tsearch";
if (Debug.shouldDelegate(mostCurrent.activityBA, "dialog_itemselected", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "dialog_itemselected", new Object[] {_dialog,_position,_text}));}
RDebugUtils.currentLine=15269888;
 //BA.debugLineNum = 15269888;BA.debugLine="Sub Dialog_ItemSelected (Dialog As MaterialDialog,";
RDebugUtils.currentLine=15269891;
 //BA.debugLineNum = 15269891;BA.debugLine="Select Position";
switch (_position) {
case 0: {
RDebugUtils.currentLine=15269894;
 //BA.debugLineNum = 15269894;BA.debugLine="show_pnldialogs(True,0)";
_show_pnldialogs(anywheresoftware.b4a.keywords.Common.True,(int) (0));
 break; }
case 1: {
RDebugUtils.currentLine=15269896;
 //BA.debugLineNum = 15269896;BA.debugLine="show_pnldialogs(True,3)";
_show_pnldialogs(anywheresoftware.b4a.keywords.Common.True,(int) (3));
 break; }
}
;
RDebugUtils.currentLine=15269900;
 //BA.debugLineNum = 15269900;BA.debugLine="End Sub";
return "";
}
public static String  _show_pnldialogs(boolean _isshsowa,int _typesef) throws Exception{
RDebugUtils.currentModule="ac_tsearch";
if (Debug.shouldDelegate(mostCurrent.activityBA, "show_pnldialogs", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "show_pnldialogs", new Object[] {_isshsowa,_typesef}));}
anywheresoftware.b4a.objects.LabelWrapper _lbl_s = null;
com.it.fome.mt_sef _mt_sef = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl_x = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _bg = null;
anywheresoftware.b4a.objects.PanelWrapper _pnlmain = null;
RDebugUtils.currentLine=15663104;
 //BA.debugLineNum = 15663104;BA.debugLine="Sub show_pnldialogs(isshsowa As Boolean,typesef As";
RDebugUtils.currentLine=15663105;
 //BA.debugLineNum = 15663105;BA.debugLine="Select isshsowa";
switch (BA.switchObjectToInt(_isshsowa,anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.False)) {
case 0: {
RDebugUtils.currentLine=15663107;
 //BA.debugLineNum = 15663107;BA.debugLine="pnl_dilogs.Initialize(\"pnl_dilogs\")";
mostCurrent._pnl_dilogs.Initialize(mostCurrent.activityBA,"pnl_dilogs");
RDebugUtils.currentLine=15663108;
 //BA.debugLineNum = 15663108;BA.debugLine="pnl_dilogs.Color=Colors.LightGray";
mostCurrent._pnl_dilogs.setColor(anywheresoftware.b4a.keywords.Common.Colors.LightGray);
RDebugUtils.currentLine=15663109;
 //BA.debugLineNum = 15663109;BA.debugLine="Activity.AddView(pnl_dilogs,0,20%x,100%x,100%y-";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._pnl_dilogs.getObject()),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (20),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),(int) (anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA)-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (20),mostCurrent.activityBA)));
RDebugUtils.currentLine=15663111;
 //BA.debugLineNum = 15663111;BA.debugLine="Dim lbl_s As Label";
_lbl_s = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=15663112;
 //BA.debugLineNum = 15663112;BA.debugLine="lbl_s.Initialize(\"lbl_nums\")";
_lbl_s.Initialize(mostCurrent.activityBA,"lbl_nums");
RDebugUtils.currentLine=15663113;
 //BA.debugLineNum = 15663113;BA.debugLine="lbl_s.TextColor=Colors.White";
_lbl_s.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=15663114;
 //BA.debugLineNum = 15663114;BA.debugLine="lbl_s.TextSize=20";
_lbl_s.setTextSize((float) (20));
RDebugUtils.currentLine=15663115;
 //BA.debugLineNum = 15663115;BA.debugLine="lbl_s.Typeface=Typeface.LoadFromAssets(\"iran_sa";
_lbl_s.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("iran_sans.ttf"));
RDebugUtils.currentLine=15663116;
 //BA.debugLineNum = 15663116;BA.debugLine="lbl_s.Gravity=Gravity.CENTER_VERTICAL+Gravity.R";
_lbl_s.setGravity((int) (anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL+anywheresoftware.b4a.keywords.Common.Gravity.RIGHT));
RDebugUtils.currentLine=15663117;
 //BA.debugLineNum = 15663117;BA.debugLine="pnl_dilogs.AddView(lbl_s,2%x,0,pnl_dilogs.Width";
mostCurrent._pnl_dilogs.AddView((android.view.View)(_lbl_s.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (2),mostCurrent.activityBA),(int) (0),(int) (mostCurrent._pnl_dilogs.getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (15),mostCurrent.activityBA)),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA));
RDebugUtils.currentLine=15663119;
 //BA.debugLineNum = 15663119;BA.debugLine="Dim mt_sef As mt_sef";
_mt_sef = new com.it.fome.mt_sef();
RDebugUtils.currentLine=15663120;
 //BA.debugLineNum = 15663120;BA.debugLine="mt_sef.Initialize(\"mt_sef\",Me)";
_mt_sef._initialize /*String*/ (null,mostCurrent.activityBA,"mt_sef",ac_tsearch.getObject());
RDebugUtils.currentLine=15663122;
 //BA.debugLineNum = 15663122;BA.debugLine="Select typesef";
switch (_typesef) {
case 0: {
RDebugUtils.currentLine=15663124;
 //BA.debugLineNum = 15663124;BA.debugLine="lbl_s.Text=\"سفارش ممبر\"";
_lbl_s.setText(BA.ObjectToCharSequence("سفارش ممبر"));
RDebugUtils.currentLine=15663125;
 //BA.debugLineNum = 15663125;BA.debugLine="mt_sef.username_target=username_target";
_mt_sef._username_target /*String*/  = mostCurrent._username_target;
 break; }
case 3: {
RDebugUtils.currentLine=15663128;
 //BA.debugLineNum = 15663128;BA.debugLine="lbl_s.Text=\"سفارش ویو\"";
_lbl_s.setText(BA.ObjectToCharSequence("سفارش ویو"));
RDebugUtils.currentLine=15663129;
 //BA.debugLineNum = 15663129;BA.debugLine="mt_sef.username_target=chatid";
_mt_sef._username_target /*String*/  = _chatid;
RDebugUtils.currentLine=15663130;
 //BA.debugLineNum = 15663130;BA.debugLine="mt_sef.us_name=username_target";
_mt_sef._us_name /*String*/  = mostCurrent._username_target;
RDebugUtils.currentLine=15663131;
 //BA.debugLineNum = 15663131;BA.debugLine="mt_sef.idchannel_t=idchannel_target";
_mt_sef._idchannel_t /*String*/  = mostCurrent._idchannel_target;
RDebugUtils.currentLine=15663132;
 //BA.debugLineNum = 15663132;BA.debugLine="mt_sef.titelchat_target=title_target";
_mt_sef._titelchat_target /*String*/  = mostCurrent._title_target;
 break; }
}
;
RDebugUtils.currentLine=15663135;
 //BA.debugLineNum = 15663135;BA.debugLine="Dim lbl_x As Label";
_lbl_x = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=15663136;
 //BA.debugLineNum = 15663136;BA.debugLine="lbl_x.Initialize(\"lbl_x\")";
_lbl_x.Initialize(mostCurrent.activityBA,"lbl_x");
RDebugUtils.currentLine=15663137;
 //BA.debugLineNum = 15663137;BA.debugLine="lbl_x.TextColor=Colors.White";
_lbl_x.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=15663138;
 //BA.debugLineNum = 15663138;BA.debugLine="lbl_x.TextSize=28";
_lbl_x.setTextSize((float) (28));
RDebugUtils.currentLine=15663139;
 //BA.debugLineNum = 15663139;BA.debugLine="lbl_x.Typeface=Typeface.MATERIALICONS";
_lbl_x.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.getMATERIALICONS());
RDebugUtils.currentLine=15663140;
 //BA.debugLineNum = 15663140;BA.debugLine="lbl_x.Gravity=Gravity.CENTER_VERTICAL+Gravity.C";
_lbl_x.setGravity((int) (anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL+anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL));
RDebugUtils.currentLine=15663141;
 //BA.debugLineNum = 15663141;BA.debugLine="lbl_x.Text=Chr(0xE5C8)";
_lbl_x.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr((int) (0xe5c8))));
RDebugUtils.currentLine=15663142;
 //BA.debugLineNum = 15663142;BA.debugLine="pnl_dilogs.AddView(lbl_x,pnl_dilogs.Width-15%x,";
mostCurrent._pnl_dilogs.AddView((android.view.View)(_lbl_x.getObject()),(int) (mostCurrent._pnl_dilogs.getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (15),mostCurrent.activityBA)),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (15),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA));
RDebugUtils.currentLine=15663144;
 //BA.debugLineNum = 15663144;BA.debugLine="Dim bg As ColorDrawable";
_bg = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=15663145;
 //BA.debugLineNum = 15663145;BA.debugLine="bg.Initialize2(Colors.White,5dip,2dip,Colors.Li";
_bg.Initialize2(anywheresoftware.b4a.keywords.Common.Colors.White,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (5)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (2)),anywheresoftware.b4a.keywords.Common.Colors.LightGray);
RDebugUtils.currentLine=15663146;
 //BA.debugLineNum = 15663146;BA.debugLine="Dim pnlmain As Panel";
_pnlmain = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=15663147;
 //BA.debugLineNum = 15663147;BA.debugLine="pnlmain.Initialize(\"\")";
_pnlmain.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=15663148;
 //BA.debugLineNum = 15663148;BA.debugLine="pnlmain.Background=bg";
_pnlmain.setBackground((android.graphics.drawable.Drawable)(_bg.getObject()));
RDebugUtils.currentLine=15663149;
 //BA.debugLineNum = 15663149;BA.debugLine="pnl_dilogs.AddView(pnlmain,5%x,10%x,pnl_dilogs.";
mostCurrent._pnl_dilogs.AddView((android.view.View)(_pnlmain.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA),(int) (mostCurrent._pnl_dilogs.getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA)),(int) (mostCurrent._pnl_dilogs.getHeight()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (20),mostCurrent.activityBA)));
RDebugUtils.currentLine=15663151;
 //BA.debugLineNum = 15663151;BA.debugLine="mt_sef.Type_sef=typesef";
_mt_sef._type_sef /*int*/  = _typesef;
RDebugUtils.currentLine=15663152;
 //BA.debugLineNum = 15663152;BA.debugLine="mt_sef.img_address_target=img_target";
_mt_sef._img_address_target /*String*/  = mostCurrent._img_target;
RDebugUtils.currentLine=15663153;
 //BA.debugLineNum = 15663153;BA.debugLine="mt_sef.addpnl(pnlmain)";
_mt_sef._addpnl /*anywheresoftware.b4a.objects.ConcreteViewWrapper*/ (null,_pnlmain);
 break; }
case 1: {
RDebugUtils.currentLine=15663156;
 //BA.debugLineNum = 15663156;BA.debugLine="If pnl_dilogs.IsInitialized=True And pnl_dilogs";
if (mostCurrent._pnl_dilogs.IsInitialized()==anywheresoftware.b4a.keywords.Common.True && mostCurrent._pnl_dilogs.getEnabled()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=15663157;
 //BA.debugLineNum = 15663157;BA.debugLine="pnl_dilogs.Visible=False";
mostCurrent._pnl_dilogs.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=15663158;
 //BA.debugLineNum = 15663158;BA.debugLine="pnl_dilogs.Enabled=False";
mostCurrent._pnl_dilogs.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 };
 break; }
}
;
RDebugUtils.currentLine=15663161;
 //BA.debugLineNum = 15663161;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_search_click() throws Exception{
RDebugUtils.currentModule="ac_tsearch";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lbl_search_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "lbl_search_click", null));}
RDebugUtils.currentLine=14745600;
 //BA.debugLineNum = 14745600;BA.debugLine="Sub lbl_search_Click";
RDebugUtils.currentLine=14745603;
 //BA.debugLineNum = 14745603;BA.debugLine="telegs.searchPublicChat(edit.Text)";
_telegs.searchPublicChat(mostCurrent._edit.getText());
RDebugUtils.currentLine=14745604;
 //BA.debugLineNum = 14745604;BA.debugLine="ProgressDialogShow(\"درحال جستوجو...\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("درحال جستوجو..."));
RDebugUtils.currentLine=14745605;
 //BA.debugLineNum = 14745605;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_sef_click() throws Exception{
RDebugUtils.currentModule="ac_tsearch";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lbl_sef_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "lbl_sef_click", null));}
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
com.it.fome.ac_lchats._adap_chats _item = null;
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
int _id_channelinfo = 0;
String _issupergroup = "";
RDebugUtils.currentLine=15204352;
 //BA.debugLineNum = 15204352;BA.debugLine="Sub lbl_sef_Click";
RDebugUtils.currentLine=15204353;
 //BA.debugLineNum = 15204353;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=15204354;
 //BA.debugLineNum = 15204354;BA.debugLine="lbl=Sender";
_lbl.setObject((android.widget.TextView)(anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA)));
RDebugUtils.currentLine=15204355;
 //BA.debugLineNum = 15204355;BA.debugLine="Dim Item = listchats.Get(lbl.Tag) As Adap_chats";
_item = (com.it.fome.ac_lchats._adap_chats)(mostCurrent._listchats.Get((int)(BA.ObjectToNumber(_lbl.getTag()))));
RDebugUtils.currentLine=15204356;
 //BA.debugLineNum = 15204356;BA.debugLine="Log(Item.title)";
anywheresoftware.b4a.keywords.Common.LogImpl("615204356",_item.title /*String*/ ,0);
RDebugUtils.currentLine=15204357;
 //BA.debugLineNum = 15204357;BA.debugLine="chatid=Item.chat_id";
_chatid = BA.NumberToString(_item.chat_id /*long*/ );
RDebugUtils.currentLine=15204358;
 //BA.debugLineNum = 15204358;BA.debugLine="title_target=Item.title";
mostCurrent._title_target = _item.title /*String*/ ;
RDebugUtils.currentLine=15204359;
 //BA.debugLineNum = 15204359;BA.debugLine="If Item.img_id=\"null\" Then";
if ((_item.img_id /*String*/ ).equals("null")) { 
RDebugUtils.currentLine=15204360;
 //BA.debugLineNum = 15204360;BA.debugLine="img_target=\"none\"";
mostCurrent._img_target = "none";
 }else {
RDebugUtils.currentLine=15204362;
 //BA.debugLineNum = 15204362;BA.debugLine="img_target=Item.img_my";
mostCurrent._img_target = _item.img_my /*String*/ ;
 };
RDebugUtils.currentLine=15204364;
 //BA.debugLineNum = 15204364;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=15204365;
 //BA.debugLineNum = 15204365;BA.debugLine="parser.Initialize(Item.channel_info)";
_parser.Initialize(_item.channel_info /*String*/ );
RDebugUtils.currentLine=15204366;
 //BA.debugLineNum = 15204366;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=15204367;
 //BA.debugLineNum = 15204367;BA.debugLine="Dim id_channelinfo As Int = root.Get(\"supergroupI";
_id_channelinfo = (int)(BA.ObjectToNumber(_root.Get((Object)("supergroupId"))));
RDebugUtils.currentLine=15204368;
 //BA.debugLineNum = 15204368;BA.debugLine="Dim isSupergroup As String = root.Get(\"isChannel\"";
_issupergroup = BA.ObjectToString(_root.Get((Object)("isChannel")));
RDebugUtils.currentLine=15204369;
 //BA.debugLineNum = 15204369;BA.debugLine="idchannel_target=id_channelinfo";
mostCurrent._idchannel_target = BA.NumberToString(_id_channelinfo);
RDebugUtils.currentLine=15204371;
 //BA.debugLineNum = 15204371;BA.debugLine="telegs.Getchanneluser(id_channelinfo)";
_telegs.Getchanneluser(_id_channelinfo);
RDebugUtils.currentLine=15204374;
 //BA.debugLineNum = 15204374;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_x_click() throws Exception{
RDebugUtils.currentModule="ac_tsearch";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lbl_x_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "lbl_x_click", null));}
RDebugUtils.currentLine=15794176;
 //BA.debugLineNum = 15794176;BA.debugLine="Sub lbl_x_Click";
RDebugUtils.currentLine=15794177;
 //BA.debugLineNum = 15794177;BA.debugLine="show_pnldialogs(False,0)";
_show_pnldialogs(anywheresoftware.b4a.keywords.Common.False,(int) (0));
RDebugUtils.currentLine=15794179;
 //BA.debugLineNum = 15794179;BA.debugLine="End Sub";
return "";
}
public static String  _meno_click() throws Exception{
RDebugUtils.currentModule="ac_tsearch";
if (Debug.shouldDelegate(mostCurrent.activityBA, "meno_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "meno_click", null));}
RDebugUtils.currentLine=14680064;
 //BA.debugLineNum = 14680064;BA.debugLine="Sub meno_Click";
RDebugUtils.currentLine=14680067;
 //BA.debugLineNum = 14680067;BA.debugLine="mimeno.Initialize(\"mimeno\",Me)";
mostCurrent._mimeno._initialize /*String*/ (null,mostCurrent.activityBA,"mimeno",ac_tsearch.getObject());
RDebugUtils.currentLine=14680068;
 //BA.debugLineNum = 14680068;BA.debugLine="mimeno.addpnl";
mostCurrent._mimeno._addpnl /*String*/ (null);
RDebugUtils.currentLine=14680069;
 //BA.debugLineNum = 14680069;BA.debugLine="mimeno.open";
mostCurrent._mimeno._open /*String*/ (null);
RDebugUtils.currentLine=14680071;
 //BA.debugLineNum = 14680071;BA.debugLine="End Sub";
return "";
}
public static String  _mt_sef_newcoins(String _news) throws Exception{
RDebugUtils.currentModule="ac_tsearch";
if (Debug.shouldDelegate(mostCurrent.activityBA, "mt_sef_newcoins", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "mt_sef_newcoins", new Object[] {_news}));}
long _n_coins = 0L;
RDebugUtils.currentLine=15925248;
 //BA.debugLineNum = 15925248;BA.debugLine="Sub mt_sef_newcoins(news As String)";
RDebugUtils.currentLine=15925249;
 //BA.debugLineNum = 15925249;BA.debugLine="Dim n_coins=news As Long";
_n_coins = (long)(Double.parseDouble(_news));
RDebugUtils.currentLine=15925250;
 //BA.debugLineNum = 15925250;BA.debugLine="If n_coins>100 Then";
if (_n_coins>100) { 
RDebugUtils.currentLine=15925251;
 //BA.debugLineNum = 15925251;BA.debugLine="lbl_nums.Text=\"سکه \"&NumberFormat(news,3,0)";
mostCurrent._lbl_nums.setText(BA.ObjectToCharSequence("سکه "+anywheresoftware.b4a.keywords.Common.NumberFormat((double)(Double.parseDouble(_news)),(int) (3),(int) (0))));
 }else {
RDebugUtils.currentLine=15925253;
 //BA.debugLineNum = 15925253;BA.debugLine="lbl_nums.Text=\"سکه \"&news";
mostCurrent._lbl_nums.setText(BA.ObjectToCharSequence("سکه "+_news));
 };
RDebugUtils.currentLine=15925255;
 //BA.debugLineNum = 15925255;BA.debugLine="End Sub";
return "";
}
public static String  _pnl_dilogs_touch(int _action,float _x,float _y) throws Exception{
RDebugUtils.currentModule="ac_tsearch";
if (Debug.shouldDelegate(mostCurrent.activityBA, "pnl_dilogs_touch", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "pnl_dilogs_touch", new Object[] {_action,_x,_y}));}
RDebugUtils.currentLine=15728640;
 //BA.debugLineNum = 15728640;BA.debugLine="Sub pnl_dilogs_Touch (Action As Int, X As Float, Y";
RDebugUtils.currentLine=15728641;
 //BA.debugLineNum = 15728641;BA.debugLine="show_pnldialogs(False,0)";
_show_pnldialogs(anywheresoftware.b4a.keywords.Common.False,(int) (0));
RDebugUtils.currentLine=15728642;
 //BA.debugLineNum = 15728642;BA.debugLine="End Sub";
return "";
}
public static String  _prfn_onpoststringerrorlistener(com.reza.sh.fastnet.Error _error,String _tag) throws Exception{
RDebugUtils.currentModule="ac_tsearch";
if (Debug.shouldDelegate(mostCurrent.activityBA, "prfn_onpoststringerrorlistener", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "prfn_onpoststringerrorlistener", new Object[] {_error,_tag}));}
RDebugUtils.currentLine=15532032;
 //BA.debugLineNum = 15532032;BA.debugLine="Sub prfn_onPostStringErrorListener(Error As Respon";
RDebugUtils.currentLine=15532034;
 //BA.debugLineNum = 15532034;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=15532035;
 //BA.debugLineNum = 15532035;BA.debugLine="End Sub";
return "";
}
public static String  _prfn_onpoststringoklistener(String _result,String _tag) throws Exception{
RDebugUtils.currentModule="ac_tsearch";
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
RDebugUtils.currentLine=15597568;
 //BA.debugLineNum = 15597568;BA.debugLine="Sub prfn_onPostStringOkListener(Result As String";
RDebugUtils.currentLine=15597570;
 //BA.debugLineNum = 15597570;BA.debugLine="Select Tag";
switch (BA.switchObjectToInt(_tag,"iuser","getinsta")) {
case 0: {
RDebugUtils.currentLine=15597572;
 //BA.debugLineNum = 15597572;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=15597573;
 //BA.debugLineNum = 15597573;BA.debugLine="Log(Result)";
anywheresoftware.b4a.keywords.Common.LogImpl("615597573",_result,0);
 break; }
case 1: {
RDebugUtils.currentLine=15597576;
 //BA.debugLineNum = 15597576;BA.debugLine="Log(Result)";
anywheresoftware.b4a.keywords.Common.LogImpl("615597576",_result,0);
RDebugUtils.currentLine=15597577;
 //BA.debugLineNum = 15597577;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=15597578;
 //BA.debugLineNum = 15597578;BA.debugLine="parser.Initialize(Result)";
_parser.Initialize(_result);
RDebugUtils.currentLine=15597579;
 //BA.debugLineNum = 15597579;BA.debugLine="Dim root As List = parser.NextArray";
_root = new anywheresoftware.b4a.objects.collections.List();
_root = _parser.NextArray();
RDebugUtils.currentLine=15597580;
 //BA.debugLineNum = 15597580;BA.debugLine="For Each colroot As Map In root";
_colroot = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group10 = _root;
final int groupLen10 = group10.getSize()
;int index10 = 0;
;
for (; index10 < groupLen10;index10++){
_colroot.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group10.Get(index10)));
RDebugUtils.currentLine=15597581;
 //BA.debugLineNum = 15597581;BA.debugLine="Dim Result As String = colroot.Get(\"result\")";
_result = BA.ObjectToString(_colroot.Get((Object)("result")));
RDebugUtils.currentLine=15597582;
 //BA.debugLineNum = 15597582;BA.debugLine="Dim c_m As String = colroot.Get(\"c_m\")";
_c_m = BA.ObjectToString(_colroot.Get((Object)("c_m")));
RDebugUtils.currentLine=15597583;
 //BA.debugLineNum = 15597583;BA.debugLine="Dim uid As String = colroot.Get(\"uid\")";
_uid = BA.ObjectToString(_colroot.Get((Object)("uid")));
RDebugUtils.currentLine=15597584;
 //BA.debugLineNum = 15597584;BA.debugLine="Dim first_last As String = colroot.Get(\"first_";
_first_last = BA.ObjectToString(_colroot.Get((Object)("first_last")));
RDebugUtils.currentLine=15597585;
 //BA.debugLineNum = 15597585;BA.debugLine="Dim id As String = colroot.Get(\"id\")";
_id = BA.ObjectToString(_colroot.Get((Object)("id")));
RDebugUtils.currentLine=15597586;
 //BA.debugLineNum = 15597586;BA.debugLine="Dim userid As String = colroot.Get(\"userid\")";
_userid = BA.ObjectToString(_colroot.Get((Object)("userid")));
RDebugUtils.currentLine=15597587;
 //BA.debugLineNum = 15597587;BA.debugLine="Dim username As String = colroot.Get(\"username";
_username = BA.ObjectToString(_colroot.Get((Object)("username")));
RDebugUtils.currentLine=15597588;
 //BA.debugLineNum = 15597588;BA.debugLine="Dim c_ch As String = colroot.Get(\"c_ch\")";
_c_ch = BA.ObjectToString(_colroot.Get((Object)("c_ch")));
RDebugUtils.currentLine=15597589;
 //BA.debugLineNum = 15597589;BA.debugLine="Dim n_coins=c_m As Long";
_n_coins = (long)(Double.parseDouble(_c_m));
RDebugUtils.currentLine=15597590;
 //BA.debugLineNum = 15597590;BA.debugLine="If n_coins>100 Then";
if (_n_coins>100) { 
RDebugUtils.currentLine=15597591;
 //BA.debugLineNum = 15597591;BA.debugLine="lbl_nums.Text=\"سکه \"&NumberFormat(c_m,3,0)";
mostCurrent._lbl_nums.setText(BA.ObjectToCharSequence("سکه "+anywheresoftware.b4a.keywords.Common.NumberFormat((double)(Double.parseDouble(_c_m)),(int) (3),(int) (0))));
 }else {
RDebugUtils.currentLine=15597593;
 //BA.debugLineNum = 15597593;BA.debugLine="lbl_nums.Text=\"سکه \"&c_m";
mostCurrent._lbl_nums.setText(BA.ObjectToCharSequence("سکه "+_c_m));
 };
RDebugUtils.currentLine=15597597;
 //BA.debugLineNum = 15597597;BA.debugLine="sql1.ExecNonQuery(\"UPDATE tbl_coin set cm='\"&c";
_sql1.ExecNonQuery("UPDATE tbl_coin set cm='"+_c_m+"',cf='"+_c_ch+"' WHERE userid='"+_userid_t+"' ");
 }
};
 break; }
}
;
RDebugUtils.currentLine=15597603;
 //BA.debugLineNum = 15597603;BA.debugLine="End Sub";
return "";
}
public static String  _setanimation(String _inanimation,String _outanimation) throws Exception{
RDebugUtils.currentModule="ac_tsearch";
if (Debug.shouldDelegate(mostCurrent.activityBA, "setanimation", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "setanimation", new Object[] {_inanimation,_outanimation}));}
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
String _package = "";
int _in = 0;
int _out = 0;
RDebugUtils.currentLine=15400960;
 //BA.debugLineNum = 15400960;BA.debugLine="Sub SetAnimation(InAnimation As String, OutAnimati";
RDebugUtils.currentLine=15400961;
 //BA.debugLineNum = 15400961;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=15400962;
 //BA.debugLineNum = 15400962;BA.debugLine="Dim package As String";
_package = "";
RDebugUtils.currentLine=15400963;
 //BA.debugLineNum = 15400963;BA.debugLine="Dim In, out As Int";
_in = 0;
_out = 0;
RDebugUtils.currentLine=15400964;
 //BA.debugLineNum = 15400964;BA.debugLine="package = r.GetStaticField(\"anywheresoftware.b4a.";
_package = BA.ObjectToString(_r.GetStaticField("anywheresoftware.b4a.BA","packageName"));
RDebugUtils.currentLine=15400965;
 //BA.debugLineNum = 15400965;BA.debugLine="In = r.GetStaticField(package & \".R$anim\", InAnim";
_in = (int)(BA.ObjectToNumber(_r.GetStaticField(_package+".R$anim",_inanimation)));
RDebugUtils.currentLine=15400966;
 //BA.debugLineNum = 15400966;BA.debugLine="out = r.GetStaticField(package & \".R$anim\", OutAn";
_out = (int)(BA.ObjectToNumber(_r.GetStaticField(_package+".R$anim",_outanimation)));
RDebugUtils.currentLine=15400967;
 //BA.debugLineNum = 15400967;BA.debugLine="r.Target = r.GetActivity";
_r.Target = (Object)(_r.GetActivity(processBA));
RDebugUtils.currentLine=15400968;
 //BA.debugLineNum = 15400968;BA.debugLine="r.RunMethod4(\"overridePendingTransition\", Array A";
_r.RunMethod4("overridePendingTransition",new Object[]{(Object)(_in),(Object)(_out)},new String[]{"java.lang.int","java.lang.int"});
RDebugUtils.currentLine=15400969;
 //BA.debugLineNum = 15400969;BA.debugLine="End Sub";
return "";
}
public static String  _showsearch(boolean _isshow) throws Exception{
RDebugUtils.currentModule="ac_tsearch";
if (Debug.shouldDelegate(mostCurrent.activityBA, "showsearch", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "showsearch", new Object[] {_isshow}));}
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
RDebugUtils.currentLine=14811136;
 //BA.debugLineNum = 14811136;BA.debugLine="Sub showsearch(isshow As Boolean)";
RDebugUtils.currentLine=14811137;
 //BA.debugLineNum = 14811137;BA.debugLine="If isshow=True Then";
if (_isshow==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=14811138;
 //BA.debugLineNum = 14811138;BA.debugLine="cardchannel.Visible=True";
mostCurrent._cardchannel.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=14811139;
 //BA.debugLineNum = 14811139;BA.debugLine="Dim pnl As Panel";
_pnl = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=14811140;
 //BA.debugLineNum = 14811140;BA.debugLine="pnl.Initialize(\"\")";
_pnl.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=14811141;
 //BA.debugLineNum = 14811141;BA.debugLine="cardchannel.AddView(pnl,0,0,cardchannel.Width,ca";
mostCurrent._cardchannel.AddView((android.view.View)(_pnl.getObject()),(int) (0),(int) (0),mostCurrent._cardchannel.getWidth(),mostCurrent._cardchannel.getHeight());
RDebugUtils.currentLine=14811142;
 //BA.debugLineNum = 14811142;BA.debugLine="channell_onCreateViewHolder(pnl)";
_channell_oncreateviewholder(_pnl);
 }else {
RDebugUtils.currentLine=14811144;
 //BA.debugLineNum = 14811144;BA.debugLine="cardchannel.Visible=False";
mostCurrent._cardchannel.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=14811146;
 //BA.debugLineNum = 14811146;BA.debugLine="End Sub";
return "";
}
public static String  _telegs_errormsg(String _value) throws Exception{
RDebugUtils.currentModule="ac_tsearch";
if (Debug.shouldDelegate(mostCurrent.activityBA, "telegs_errormsg", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "telegs_errormsg", new Object[] {_value}));}
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
String _error_msg = "";
int _errorconstructor = 0;
int _error_code = 0;
RDebugUtils.currentLine=15073280;
 //BA.debugLineNum = 15073280;BA.debugLine="Sub telegs_errormsg(value As String)";
RDebugUtils.currentLine=15073281;
 //BA.debugLineNum = 15073281;BA.debugLine="LogColor(value,Colors.Blue)";
anywheresoftware.b4a.keywords.Common.LogImpl("615073281",_value,anywheresoftware.b4a.keywords.Common.Colors.Blue);
RDebugUtils.currentLine=15073282;
 //BA.debugLineNum = 15073282;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=15073283;
 //BA.debugLineNum = 15073283;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=15073284;
 //BA.debugLineNum = 15073284;BA.debugLine="parser.Initialize(value)";
_parser.Initialize(_value);
RDebugUtils.currentLine=15073285;
 //BA.debugLineNum = 15073285;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=15073286;
 //BA.debugLineNum = 15073286;BA.debugLine="Dim Error_msg As String = root.Get(\"Error_msg\")";
_error_msg = BA.ObjectToString(_root.Get((Object)("Error_msg")));
RDebugUtils.currentLine=15073287;
 //BA.debugLineNum = 15073287;BA.debugLine="Dim ErrorConstructor As Int = root.Get(\"ErrorCons";
_errorconstructor = (int)(BA.ObjectToNumber(_root.Get((Object)("ErrorConstructor"))));
RDebugUtils.currentLine=15073288;
 //BA.debugLineNum = 15073288;BA.debugLine="Dim Error_code As Int = root.Get(\"Error_code\")";
_error_code = (int)(BA.ObjectToNumber(_root.Get((Object)("Error_code"))));
RDebugUtils.currentLine=15073289;
 //BA.debugLineNum = 15073289;BA.debugLine="ToastMessageShow(Error_msg,False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence(_error_msg),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=15073290;
 //BA.debugLineNum = 15073290;BA.debugLine="End Sub";
return "";
}
public static String  _telegs_getme(String _value) throws Exception{
RDebugUtils.currentModule="ac_tsearch";
if (Debug.shouldDelegate(mostCurrent.activityBA, "telegs_getme", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "telegs_getme", new Object[] {_value}));}
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
String _lastname = "";
String _firstname = "";
String _phonenumber = "";
String _profilephoto = "";
String _isverified = "";
int _id = 0;
String _restrictionreason = "";
String _haveaccess = "";
String _typess = "";
String _username = "";
String _status = "";
RDebugUtils.currentLine=15138816;
 //BA.debugLineNum = 15138816;BA.debugLine="Sub telegs_getme(value As String)";
RDebugUtils.currentLine=15138817;
 //BA.debugLineNum = 15138817;BA.debugLine="LogColor(value,Colors.Blue)";
anywheresoftware.b4a.keywords.Common.LogImpl("615138817",_value,anywheresoftware.b4a.keywords.Common.Colors.Blue);
RDebugUtils.currentLine=15138818;
 //BA.debugLineNum = 15138818;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=15138819;
 //BA.debugLineNum = 15138819;BA.debugLine="parser.Initialize(value)";
_parser.Initialize(_value);
RDebugUtils.currentLine=15138820;
 //BA.debugLineNum = 15138820;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=15138821;
 //BA.debugLineNum = 15138821;BA.debugLine="Dim lastName As String = root.Get(\"lastName\")";
_lastname = BA.ObjectToString(_root.Get((Object)("lastName")));
RDebugUtils.currentLine=15138822;
 //BA.debugLineNum = 15138822;BA.debugLine="Dim firstName As String = root.Get(\"firstName\")";
_firstname = BA.ObjectToString(_root.Get((Object)("firstName")));
RDebugUtils.currentLine=15138823;
 //BA.debugLineNum = 15138823;BA.debugLine="Dim phoneNumber As String = root.Get(\"phoneNumber";
_phonenumber = BA.ObjectToString(_root.Get((Object)("phoneNumber")));
RDebugUtils.currentLine=15138824;
 //BA.debugLineNum = 15138824;BA.debugLine="Dim profilePhoto As String = root.Get(\"profilePho";
_profilephoto = BA.ObjectToString(_root.Get((Object)("profilePhoto")));
RDebugUtils.currentLine=15138825;
 //BA.debugLineNum = 15138825;BA.debugLine="Dim isVerified As String = root.Get(\"isVerified\")";
_isverified = BA.ObjectToString(_root.Get((Object)("isVerified")));
RDebugUtils.currentLine=15138826;
 //BA.debugLineNum = 15138826;BA.debugLine="Dim id As Int = root.Get(\"id\")";
_id = (int)(BA.ObjectToNumber(_root.Get((Object)("id"))));
RDebugUtils.currentLine=15138827;
 //BA.debugLineNum = 15138827;BA.debugLine="Dim restrictionReason As String = root.Get(\"restr";
_restrictionreason = BA.ObjectToString(_root.Get((Object)("restrictionReason")));
RDebugUtils.currentLine=15138828;
 //BA.debugLineNum = 15138828;BA.debugLine="Dim haveAccess As String = root.Get(\"haveAccess\")";
_haveaccess = BA.ObjectToString(_root.Get((Object)("haveAccess")));
RDebugUtils.currentLine=15138829;
 //BA.debugLineNum = 15138829;BA.debugLine="Dim Typess As String = root.Get(\"type\")";
_typess = BA.ObjectToString(_root.Get((Object)("type")));
RDebugUtils.currentLine=15138830;
 //BA.debugLineNum = 15138830;BA.debugLine="Dim username As String = root.Get(\"username\")";
_username = BA.ObjectToString(_root.Get((Object)("username")));
RDebugUtils.currentLine=15138831;
 //BA.debugLineNum = 15138831;BA.debugLine="Dim status As String = root.Get(\"status\")";
_status = BA.ObjectToString(_root.Get((Object)("status")));
RDebugUtils.currentLine=15138832;
 //BA.debugLineNum = 15138832;BA.debugLine="id_user=id";
mostCurrent._id_user = BA.NumberToString(_id);
RDebugUtils.currentLine=15138835;
 //BA.debugLineNum = 15138835;BA.debugLine="End Sub";
return "";
}
public static String  _telegs_getsupergroup(String _value) throws Exception{
RDebugUtils.currentModule="ac_tsearch";
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
String _username = "";
String _status = "";
de.amberhome.materialdialogs.MaterialDialogBuilderWrapper _builder = null;
RDebugUtils.currentLine=15859712;
 //BA.debugLineNum = 15859712;BA.debugLine="Sub telegs_getsupergroup(value As String)";
RDebugUtils.currentLine=15859713;
 //BA.debugLineNum = 15859713;BA.debugLine="Log(value)";
anywheresoftware.b4a.keywords.Common.LogImpl("615859713",_value,0);
RDebugUtils.currentLine=15859714;
 //BA.debugLineNum = 15859714;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=15859715;
 //BA.debugLineNum = 15859715;BA.debugLine="parser.Initialize(value)";
_parser.Initialize(_value);
RDebugUtils.currentLine=15859716;
 //BA.debugLineNum = 15859716;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=15859717;
 //BA.debugLineNum = 15859717;BA.debugLine="Dim date As Int = root.Get(\"date\")";
_date = (int)(BA.ObjectToNumber(_root.Get((Object)("date"))));
RDebugUtils.currentLine=15859718;
 //BA.debugLineNum = 15859718;BA.debugLine="Dim isVerified As String = root.Get(\"isVerified\")";
_isverified = BA.ObjectToString(_root.Get((Object)("isVerified")));
RDebugUtils.currentLine=15859719;
 //BA.debugLineNum = 15859719;BA.debugLine="Dim isChannel As String = root.Get(\"isChannel\")";
_ischannel = BA.ObjectToString(_root.Get((Object)("isChannel")));
RDebugUtils.currentLine=15859720;
 //BA.debugLineNum = 15859720;BA.debugLine="Dim signMessages As String = root.Get(\"signMessag";
_signmessages = BA.ObjectToString(_root.Get((Object)("signMessages")));
RDebugUtils.currentLine=15859721;
 //BA.debugLineNum = 15859721;BA.debugLine="Dim memberCount As Int = root.Get(\"memberCount\")";
_membercount = (int)(BA.ObjectToNumber(_root.Get((Object)("memberCount"))));
RDebugUtils.currentLine=15859722;
 //BA.debugLineNum = 15859722;BA.debugLine="Dim id As Int = root.Get(\"id\")";
_id = (int)(BA.ObjectToNumber(_root.Get((Object)("id"))));
RDebugUtils.currentLine=15859723;
 //BA.debugLineNum = 15859723;BA.debugLine="Dim restrictionReason As String = root.Get(\"restr";
_restrictionreason = BA.ObjectToString(_root.Get((Object)("restrictionReason")));
RDebugUtils.currentLine=15859724;
 //BA.debugLineNum = 15859724;BA.debugLine="Dim anyoneCanInvite As String = root.Get(\"anyoneC";
_anyonecaninvite = BA.ObjectToString(_root.Get((Object)("anyoneCanInvite")));
RDebugUtils.currentLine=15859725;
 //BA.debugLineNum = 15859725;BA.debugLine="Dim username As String = root.Get(\"username\")";
_username = BA.ObjectToString(_root.Get((Object)("username")));
RDebugUtils.currentLine=15859726;
 //BA.debugLineNum = 15859726;BA.debugLine="Dim status As String = root.Get(\"status\")";
_status = BA.ObjectToString(_root.Get((Object)("status")));
RDebugUtils.currentLine=15859728;
 //BA.debugLineNum = 15859728;BA.debugLine="id_target=id";
mostCurrent._id_target = BA.NumberToString(_id);
RDebugUtils.currentLine=15859729;
 //BA.debugLineNum = 15859729;BA.debugLine="username_target=username";
mostCurrent._username_target = _username;
RDebugUtils.currentLine=15859732;
 //BA.debugLineNum = 15859732;BA.debugLine="Dim Builder As MaterialDialogBuilder";
_builder = new de.amberhome.materialdialogs.MaterialDialogBuilderWrapper();
RDebugUtils.currentLine=15859733;
 //BA.debugLineNum = 15859733;BA.debugLine="Builder.Initialize(\"Dialog\")";
_builder.Initialize(mostCurrent.activityBA,"Dialog");
RDebugUtils.currentLine=15859735;
 //BA.debugLineNum = 15859735;BA.debugLine="Builder.Items(Array As String(\"سفارش ممبر برای کا";
_builder.Items((java.lang.CharSequence[])(new String[]{"سفارش ممبر برای کانال "+mostCurrent._title_target,"سفارش ویو برای کانال "+mostCurrent._title_target}));
RDebugUtils.currentLine=15859736;
 //BA.debugLineNum = 15859736;BA.debugLine="Builder.ItemsCallback";
_builder.ItemsCallback();
RDebugUtils.currentLine=15859737;
 //BA.debugLineNum = 15859737;BA.debugLine="Builder.Show";
_builder.Show();
RDebugUtils.currentLine=15859739;
 //BA.debugLineNum = 15859739;BA.debugLine="End Sub";
return "";
}
public static String  _telegs_joinchannel(String _value) throws Exception{
RDebugUtils.currentModule="ac_tsearch";
if (Debug.shouldDelegate(mostCurrent.activityBA, "telegs_joinchannel", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "telegs_joinchannel", new Object[] {_value}));}
RDebugUtils.currentLine=15335424;
 //BA.debugLineNum = 15335424;BA.debugLine="Sub telegs_joinchannel(value As String)";
RDebugUtils.currentLine=15335425;
 //BA.debugLineNum = 15335425;BA.debugLine="LogColor(value,Colors.Blue)";
anywheresoftware.b4a.keywords.Common.LogImpl("615335425",_value,anywheresoftware.b4a.keywords.Common.Colors.Blue);
RDebugUtils.currentLine=15335427;
 //BA.debugLineNum = 15335427;BA.debugLine="End Sub";
return "";
}
public static String  _telegs_searchpublicchat(String _value) throws Exception{
RDebugUtils.currentModule="ac_tsearch";
if (Debug.shouldDelegate(mostCurrent.activityBA, "telegs_searchpublicchat", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "telegs_searchpublicchat", new Object[] {_value}));}
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
String _chat_type = "";
String _photo_l_canbedeleted = "";
String _chat_id = "";
String _photo_id = "";
String _photo_r_isuploadingactive = "";
String _photo_r_id = "";
String _chat_title = "";
String _photo_l_canbedownloaded = "";
String _chat_clientdata = "";
String _photo_r_uploadedsize = "";
String _photo_l_path = "";
String _photo_l_isdownloadingcompleted = "";
String _channel_info = "";
String _photo_size = "";
String _photo_l_downloadedsize = "";
String _photo_l_isdownloadingactive = "";
String _photo_expectedsize = "";
String _photo_r_isuploadingcompleted = "";
String _photo_l_downloadedprefixsize = "";
String _chat_order = "";
com.it.fome.ac_lchats._adap_chats _item = null;
RDebugUtils.currentLine=14876672;
 //BA.debugLineNum = 14876672;BA.debugLine="Sub telegs_searchpublicchat(value As String)";
RDebugUtils.currentLine=14876673;
 //BA.debugLineNum = 14876673;BA.debugLine="Log(value)";
anywheresoftware.b4a.keywords.Common.LogImpl("614876673",_value,0);
RDebugUtils.currentLine=14876674;
 //BA.debugLineNum = 14876674;BA.debugLine="listchats.Initialize";
mostCurrent._listchats.Initialize();
RDebugUtils.currentLine=14876675;
 //BA.debugLineNum = 14876675;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=14876676;
 //BA.debugLineNum = 14876676;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=14876677;
 //BA.debugLineNum = 14876677;BA.debugLine="parser.Initialize(value)";
_parser.Initialize(_value);
RDebugUtils.currentLine=14876678;
 //BA.debugLineNum = 14876678;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=14876679;
 //BA.debugLineNum = 14876679;BA.debugLine="Dim Chat_type As String = root.Get(\"Chat_type\")";
_chat_type = BA.ObjectToString(_root.Get((Object)("Chat_type")));
RDebugUtils.currentLine=14876680;
 //BA.debugLineNum = 14876680;BA.debugLine="Dim photo_l_canBeDeleted As String = root.Get(\"ph";
_photo_l_canbedeleted = BA.ObjectToString(_root.Get((Object)("photo_l_canBeDeleted")));
RDebugUtils.currentLine=14876681;
 //BA.debugLineNum = 14876681;BA.debugLine="Dim Chat_id As String = root.Get(\"Chat_id\")";
_chat_id = BA.ObjectToString(_root.Get((Object)("Chat_id")));
RDebugUtils.currentLine=14876682;
 //BA.debugLineNum = 14876682;BA.debugLine="Dim photo_id As String = root.Get(\"photo_id\")";
_photo_id = BA.ObjectToString(_root.Get((Object)("photo_id")));
RDebugUtils.currentLine=14876683;
 //BA.debugLineNum = 14876683;BA.debugLine="Dim photo_r_isUploadingActive As String = root.Ge";
_photo_r_isuploadingactive = BA.ObjectToString(_root.Get((Object)("photo_r_isUploadingActive")));
RDebugUtils.currentLine=14876684;
 //BA.debugLineNum = 14876684;BA.debugLine="Dim photo_r_id As String = root.Get(\"photo_r_id\")";
_photo_r_id = BA.ObjectToString(_root.Get((Object)("photo_r_id")));
RDebugUtils.currentLine=14876685;
 //BA.debugLineNum = 14876685;BA.debugLine="Dim Chat_title As String = root.Get(\"Chat_title\")";
_chat_title = BA.ObjectToString(_root.Get((Object)("Chat_title")));
RDebugUtils.currentLine=14876686;
 //BA.debugLineNum = 14876686;BA.debugLine="Dim photo_l_canBeDownloaded As String = root.Get(";
_photo_l_canbedownloaded = BA.ObjectToString(_root.Get((Object)("photo_l_canBeDownloaded")));
RDebugUtils.currentLine=14876687;
 //BA.debugLineNum = 14876687;BA.debugLine="Dim Chat_clientData As String = root.Get(\"Chat_cl";
_chat_clientdata = BA.ObjectToString(_root.Get((Object)("Chat_clientData")));
RDebugUtils.currentLine=14876688;
 //BA.debugLineNum = 14876688;BA.debugLine="Dim photo_r_uploadedSize As String = root.Get(\"ph";
_photo_r_uploadedsize = BA.ObjectToString(_root.Get((Object)("photo_r_uploadedSize")));
RDebugUtils.currentLine=14876689;
 //BA.debugLineNum = 14876689;BA.debugLine="Dim photo_l_path As String = root.Get(\"photo_l_pa";
_photo_l_path = BA.ObjectToString(_root.Get((Object)("photo_l_path")));
RDebugUtils.currentLine=14876690;
 //BA.debugLineNum = 14876690;BA.debugLine="Dim photo_l_isDownloadingCompleted As String = ro";
_photo_l_isdownloadingcompleted = BA.ObjectToString(_root.Get((Object)("photo_l_isDownloadingCompleted")));
RDebugUtils.currentLine=14876691;
 //BA.debugLineNum = 14876691;BA.debugLine="Dim channel_info As String = root.Get(\"channel_in";
_channel_info = BA.ObjectToString(_root.Get((Object)("channel_info")));
RDebugUtils.currentLine=14876692;
 //BA.debugLineNum = 14876692;BA.debugLine="Dim photo_size As String = root.Get(\"photo_size\")";
_photo_size = BA.ObjectToString(_root.Get((Object)("photo_size")));
RDebugUtils.currentLine=14876693;
 //BA.debugLineNum = 14876693;BA.debugLine="Dim Chat_type As String = root.Get(\"chat_type\")";
_chat_type = BA.ObjectToString(_root.Get((Object)("chat_type")));
RDebugUtils.currentLine=14876694;
 //BA.debugLineNum = 14876694;BA.debugLine="Dim photo_l_downloadedSize As String = root.Get(\"";
_photo_l_downloadedsize = BA.ObjectToString(_root.Get((Object)("photo_l_downloadedSize")));
RDebugUtils.currentLine=14876695;
 //BA.debugLineNum = 14876695;BA.debugLine="Dim photo_l_isDownloadingActive As String = root.";
_photo_l_isdownloadingactive = BA.ObjectToString(_root.Get((Object)("photo_l_isDownloadingActive")));
RDebugUtils.currentLine=14876696;
 //BA.debugLineNum = 14876696;BA.debugLine="Dim photo_expectedSize As String = root.Get(\"phot";
_photo_expectedsize = BA.ObjectToString(_root.Get((Object)("photo_expectedSize")));
RDebugUtils.currentLine=14876697;
 //BA.debugLineNum = 14876697;BA.debugLine="Dim photo_r_isUploadingCompleted As String = root";
_photo_r_isuploadingcompleted = BA.ObjectToString(_root.Get((Object)("photo_r_isUploadingCompleted")));
RDebugUtils.currentLine=14876698;
 //BA.debugLineNum = 14876698;BA.debugLine="Dim photo_l_downloadedPrefixSize As String = root";
_photo_l_downloadedprefixsize = BA.ObjectToString(_root.Get((Object)("photo_l_downloadedPrefixSize")));
RDebugUtils.currentLine=14876699;
 //BA.debugLineNum = 14876699;BA.debugLine="Dim Chat_order As String = root.Get(\"Chat_order\")";
_chat_order = BA.ObjectToString(_root.Get((Object)("Chat_order")));
RDebugUtils.currentLine=14876702;
 //BA.debugLineNum = 14876702;BA.debugLine="Dim Item As Adap_chats";
_item = new com.it.fome.ac_lchats._adap_chats();
RDebugUtils.currentLine=14876703;
 //BA.debugLineNum = 14876703;BA.debugLine="Item.chat_id=Chat_id";
_item.chat_id /*long*/  = (long)(Double.parseDouble(_chat_id));
RDebugUtils.currentLine=14876704;
 //BA.debugLineNum = 14876704;BA.debugLine="Item.title=Chat_title";
_item.title /*String*/  = _chat_title;
RDebugUtils.currentLine=14876706;
 //BA.debugLineNum = 14876706;BA.debugLine="Item.chat_type=Chat_type";
_item.chat_type /*String*/  = _chat_type;
RDebugUtils.currentLine=14876707;
 //BA.debugLineNum = 14876707;BA.debugLine="Item.channel_info=channel_info";
_item.channel_info /*String*/  = _channel_info;
RDebugUtils.currentLine=14876715;
 //BA.debugLineNum = 14876715;BA.debugLine="Item.img_isdwonload=photo_l_isDownloadingComplete";
_item.img_isdwonload /*String*/  = _photo_l_isdownloadingcompleted;
RDebugUtils.currentLine=14876716;
 //BA.debugLineNum = 14876716;BA.debugLine="Item.img_id=photo_id";
_item.img_id /*String*/  = _photo_id;
RDebugUtils.currentLine=14876717;
 //BA.debugLineNum = 14876717;BA.debugLine="Item.img_remote=photo_r_id";
_item.img_remote /*String*/  = _photo_r_id;
RDebugUtils.currentLine=14876718;
 //BA.debugLineNum = 14876718;BA.debugLine="Item.img_my=photo_l_path";
_item.img_my /*String*/  = _photo_l_path;
RDebugUtils.currentLine=14876719;
 //BA.debugLineNum = 14876719;BA.debugLine="listchats.Add(Item)";
mostCurrent._listchats.Add((Object)(_item));
RDebugUtils.currentLine=14876720;
 //BA.debugLineNum = 14876720;BA.debugLine="showsearch(True)";
_showsearch(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=14876723;
 //BA.debugLineNum = 14876723;BA.debugLine="End Sub";
return "";
}
public static String  _telegs_update_file(String _respon) throws Exception{
RDebugUtils.currentModule="ac_tsearch";
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
RDebugUtils.currentLine=15007744;
 //BA.debugLineNum = 15007744;BA.debugLine="Sub telegs_update_file(respon As String)";
RDebugUtils.currentLine=15007746;
 //BA.debugLineNum = 15007746;BA.debugLine="LogColor(respon,Colors.Blue)";
anywheresoftware.b4a.keywords.Common.LogImpl("615007746",_respon,anywheresoftware.b4a.keywords.Common.Colors.Blue);
RDebugUtils.currentLine=15007747;
 //BA.debugLineNum = 15007747;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=15007748;
 //BA.debugLineNum = 15007748;BA.debugLine="parser.Initialize(respon)";
_parser.Initialize(_respon);
RDebugUtils.currentLine=15007749;
 //BA.debugLineNum = 15007749;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=15007750;
 //BA.debugLineNum = 15007750;BA.debugLine="Dim photof_remot_id As String = root.Get(\"photof_";
_photof_remot_id = BA.ObjectToString(_root.Get((Object)("photof_remot_id")));
RDebugUtils.currentLine=15007751;
 //BA.debugLineNum = 15007751;BA.debugLine="Dim photof_local_candownload As String = root.Get";
_photof_local_candownload = BA.ObjectToString(_root.Get((Object)("photof_local_candownload")));
RDebugUtils.currentLine=15007752;
 //BA.debugLineNum = 15007752;BA.debugLine="Dim photof_local_isdownload As String = root.Get(";
_photof_local_isdownload = BA.ObjectToString(_root.Get((Object)("photof_local_isdownload")));
RDebugUtils.currentLine=15007753;
 //BA.debugLineNum = 15007753;BA.debugLine="Dim photof_expectedSize As Int = root.Get(\"photof";
_photof_expectedsize = (int)(BA.ObjectToNumber(_root.Get((Object)("photof_expectedSize"))));
RDebugUtils.currentLine=15007754;
 //BA.debugLineNum = 15007754;BA.debugLine="Dim photof_remot_uploadsize As Int = root.Get(\"ph";
_photof_remot_uploadsize = (int)(BA.ObjectToNumber(_root.Get((Object)("photof_remot_uploadsize"))));
RDebugUtils.currentLine=15007755;
 //BA.debugLineNum = 15007755;BA.debugLine="Dim photof_size As Int = root.Get(\"photof_size\")";
_photof_size = (int)(BA.ObjectToNumber(_root.Get((Object)("photof_size"))));
RDebugUtils.currentLine=15007756;
 //BA.debugLineNum = 15007756;BA.debugLine="Dim photof_remot_isuploadactive As String = root.";
_photof_remot_isuploadactive = BA.ObjectToString(_root.Get((Object)("photof_remot_isuploadactive")));
RDebugUtils.currentLine=15007757;
 //BA.debugLineNum = 15007757;BA.debugLine="Dim photof_local_perfexsize As Int = root.Get(\"ph";
_photof_local_perfexsize = (int)(BA.ObjectToNumber(_root.Get((Object)("photof_local_perfexsize"))));
RDebugUtils.currentLine=15007758;
 //BA.debugLineNum = 15007758;BA.debugLine="Dim photof_remot_isuploadcomplit As String = root";
_photof_remot_isuploadcomplit = BA.ObjectToString(_root.Get((Object)("photof_remot_isuploadcomplit")));
RDebugUtils.currentLine=15007759;
 //BA.debugLineNum = 15007759;BA.debugLine="Dim photof_local_downloadsize As Int = root.Get(\"";
_photof_local_downloadsize = (int)(BA.ObjectToNumber(_root.Get((Object)("photof_local_downloadsize"))));
RDebugUtils.currentLine=15007760;
 //BA.debugLineNum = 15007760;BA.debugLine="Dim photof_local_canbedlelte As String = root.Get";
_photof_local_canbedlelte = BA.ObjectToString(_root.Get((Object)("photof_local_canbedlelte")));
RDebugUtils.currentLine=15007761;
 //BA.debugLineNum = 15007761;BA.debugLine="Dim photof_id As Int = root.Get(\"photof_id\")";
_photof_id = (int)(BA.ObjectToNumber(_root.Get((Object)("photof_id"))));
RDebugUtils.currentLine=15007762;
 //BA.debugLineNum = 15007762;BA.debugLine="Dim photof_local_isdowloaded As String = root.Get";
_photof_local_isdowloaded = BA.ObjectToString(_root.Get((Object)("photof_local_isdowloaded")));
RDebugUtils.currentLine=15007763;
 //BA.debugLineNum = 15007763;BA.debugLine="Dim photof_localpath As String = root.Get(\"photof";
_photof_localpath = BA.ObjectToString(_root.Get((Object)("photof_localpath")));
RDebugUtils.currentLine=15007765;
 //BA.debugLineNum = 15007765;BA.debugLine="Log(\" isdowloaded \"&photof_local_isdowloaded&\" si";
anywheresoftware.b4a.keywords.Common.LogImpl("615007765"," isdowloaded "+_photof_local_isdowloaded+" size "+BA.NumberToString(_photof_size)+" dl size : "+BA.NumberToString(_photof_local_downloadsize)+" is download "+_photof_local_isdownload+" can dl : "+_photof_local_candownload,0);
RDebugUtils.currentLine=15007766;
 //BA.debugLineNum = 15007766;BA.debugLine="Log(\"p : \"&photof_localpath)";
anywheresoftware.b4a.keywords.Common.LogImpl("615007766","p : "+_photof_localpath,0);
RDebugUtils.currentLine=15007768;
 //BA.debugLineNum = 15007768;BA.debugLine="Try";
try {RDebugUtils.currentLine=15007769;
 //BA.debugLineNum = 15007769;BA.debugLine="If photof_local_isdowloaded=\"true\" Then";
if ((_photof_local_isdowloaded).equals("true")) { 
RDebugUtils.currentLine=15007770;
 //BA.debugLineNum = 15007770;BA.debugLine="For ss=0 To listchats.Size-1";
{
final int step23 = 1;
final int limit23 = (int) (mostCurrent._listchats.getSize()-1);
_ss = (int) (0) ;
for (;_ss <= limit23 ;_ss = _ss + step23 ) {
RDebugUtils.currentLine=15007771;
 //BA.debugLineNum = 15007771;BA.debugLine="Dim Itema = listchats.Get(ss) As Adap_chats";
_itema = (com.it.fome.ac_lchats._adap_chats)(mostCurrent._listchats.Get(_ss));
RDebugUtils.currentLine=15007772;
 //BA.debugLineNum = 15007772;BA.debugLine="If Itema.img_id=photof_id Then";
if ((_itema.img_id /*String*/ ).equals(BA.NumberToString(_photof_id))) { 
RDebugUtils.currentLine=15007773;
 //BA.debugLineNum = 15007773;BA.debugLine="Log(ss&\" img id ready!\")";
anywheresoftware.b4a.keywords.Common.LogImpl("615007773",BA.NumberToString(_ss)+" img id ready!",0);
RDebugUtils.currentLine=15007775;
 //BA.debugLineNum = 15007775;BA.debugLine="Itema.img_my = photof_localpath";
_itema.img_my /*String*/  = _photof_localpath;
RDebugUtils.currentLine=15007776;
 //BA.debugLineNum = 15007776;BA.debugLine="Itema.img_isdwonload=photof_local_isdowloaded";
_itema.img_isdwonload /*String*/  = _photof_local_isdowloaded;
RDebugUtils.currentLine=15007777;
 //BA.debugLineNum = 15007777;BA.debugLine="Itema.img_remote=photof_remot_id";
_itema.img_remote /*String*/  = _photof_remot_id;
RDebugUtils.currentLine=15007778;
 //BA.debugLineNum = 15007778;BA.debugLine="Itema.img_id=photof_id";
_itema.img_id /*String*/  = BA.NumberToString(_photof_id);
RDebugUtils.currentLine=15007779;
 //BA.debugLineNum = 15007779;BA.debugLine="showsearch(True)";
_showsearch(anywheresoftware.b4a.keywords.Common.True);
 };
 }
};
 };
 } 
       catch (Exception e36) {
			processBA.setLastException(e36);RDebugUtils.currentLine=15007789;
 //BA.debugLineNum = 15007789;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("615007789",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 };
RDebugUtils.currentLine=15007798;
 //BA.debugLineNum = 15007798;BA.debugLine="End Sub";
return "";
}
}