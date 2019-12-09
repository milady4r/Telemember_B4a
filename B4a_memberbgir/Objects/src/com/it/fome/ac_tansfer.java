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

public class ac_tansfer extends androidx.appcompat.app.AppCompatActivity implements B4AActivity{
	public static ac_tansfer mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "com.it.fome", "com.it.fome.ac_tansfer");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (ac_tansfer).");
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
		activityBA = new BA(this, layout, processBA, "com.it.fome", "com.it.fome.ac_tansfer");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "com.it.fome.ac_tansfer", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (ac_tansfer) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (ac_tansfer) Resume **");
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
		return ac_tansfer.class;
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
        BA.LogInfo("** Activity (ac_tansfer) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            ac_tansfer mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (ac_tansfer) Resume **");
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
public static int _type_s = 0;
public anywheresoftware.b4a.objects.LabelWrapper _meno = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnl_coins = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_icon = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_nums = null;
public com.flycoroundview.mc7.MC7RoundView _roundview = null;
public static String _username_t = "";
public static String _userid_t = "";
public static String _i_username = "";
public static String _i_pk = "";
public static String _i_cookie = "";
public static String _i_pic = "";
public anywheresoftware.b4a.objects.EditTextWrapper _edit_nums = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edit_target = null;
public com.valdesekamdem.library.mdtoast.MaterialToast _mtoast = null;
public de.amberhome.materialdialogs.MaterialDialogWrapper _progressdialog = null;
public anywheresoftware.b4a.objects.drawable.ColorDrawable _bg1 = null;
public com.it.fome.mi_meno _mimeno = null;
public b4a.example.dateutils _dateutils = null;
public com.it.fome.main _main = null;
public com.it.fome.ac_telelogin _ac_telelogin = null;
public com.it.fome.ac_shop _ac_shop = null;
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
RDebugUtils.currentModule="ac_tansfer";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
anywheresoftware.b4a.objects.drawable.ColorDrawable _bkcolor = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _bkcolor_st = null;
anywheresoftware.b4a.objects.PanelWrapper _pnlb1 = null;
int _i = 0;
anywheresoftware.b4a.objects.drawable.GradientDrawable _gradient1 = null;
int[] _clrs = null;
de.amberhome.objects.CardViewWrapper _card = null;
anywheresoftware.b4a.objects.PanelWrapper _pnl_card = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl_a = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl_cc = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _bg = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl_send = null;
RDebugUtils.currentLine=5636096;
 //BA.debugLineNum = 5636096;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=5636101;
 //BA.debugLineNum = 5636101;BA.debugLine="Dim bkcolor As ColorDrawable";
_bkcolor = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=5636102;
 //BA.debugLineNum = 5636102;BA.debugLine="bkcolor.Initialize2(Colors.White,15,2dip,Colors.L";
_bkcolor.Initialize2(anywheresoftware.b4a.keywords.Common.Colors.White,(int) (15),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (2)),anywheresoftware.b4a.keywords.Common.Colors.LightGray);
RDebugUtils.currentLine=5636103;
 //BA.debugLineNum = 5636103;BA.debugLine="meno.Initialize(\"meno\")";
mostCurrent._meno.Initialize(mostCurrent.activityBA,"meno");
RDebugUtils.currentLine=5636104;
 //BA.debugLineNum = 5636104;BA.debugLine="meno.TextColor=Colors.DarkGray";
mostCurrent._meno.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.DarkGray);
RDebugUtils.currentLine=5636105;
 //BA.debugLineNum = 5636105;BA.debugLine="meno.TextSize=37";
mostCurrent._meno.setTextSize((float) (37));
RDebugUtils.currentLine=5636106;
 //BA.debugLineNum = 5636106;BA.debugLine="meno.Background=bkcolor";
mostCurrent._meno.setBackground((android.graphics.drawable.Drawable)(_bkcolor.getObject()));
RDebugUtils.currentLine=5636107;
 //BA.debugLineNum = 5636107;BA.debugLine="meno.Typeface=Typeface.MATERIALICONS";
mostCurrent._meno.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.getMATERIALICONS());
RDebugUtils.currentLine=5636108;
 //BA.debugLineNum = 5636108;BA.debugLine="meno.Text=Chr(0xE3C7)";
mostCurrent._meno.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr((int) (0xe3c7))));
RDebugUtils.currentLine=5636109;
 //BA.debugLineNum = 5636109;BA.debugLine="meno.Gravity=Gravity.CENTER_HORIZONTAL+Gravity.CE";
mostCurrent._meno.setGravity((int) (anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL+anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=5636110;
 //BA.debugLineNum = 5636110;BA.debugLine="Activity.AddView(meno,3%x,3%x,12%x,12%x)";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._meno.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (3),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (3),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (12),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (12),mostCurrent.activityBA));
RDebugUtils.currentLine=5636112;
 //BA.debugLineNum = 5636112;BA.debugLine="pnl_coins.Initialize(\"pnl_coins\")";
mostCurrent._pnl_coins.Initialize(mostCurrent.activityBA,"pnl_coins");
RDebugUtils.currentLine=5636113;
 //BA.debugLineNum = 5636113;BA.debugLine="Activity.AddView(pnl_coins,50%x,3%x,50%x,12%x)";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._pnl_coins.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (50),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (3),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (50),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (12),mostCurrent.activityBA));
RDebugUtils.currentLine=5636114;
 //BA.debugLineNum = 5636114;BA.debugLine="roundview.Initialize(pnl_coins)";
mostCurrent._roundview.Initialize(processBA,(android.view.View)(mostCurrent._pnl_coins.getObject()));
RDebugUtils.currentLine=5636115;
 //BA.debugLineNum = 5636115;BA.debugLine="roundview.CornerRadius_BL=10%x";
mostCurrent._roundview.setCornerRadius_BL(anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA));
RDebugUtils.currentLine=5636116;
 //BA.debugLineNum = 5636116;BA.debugLine="roundview.CornerRadius_TL=10%x";
mostCurrent._roundview.setCornerRadius_TL(anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA));
RDebugUtils.currentLine=5636117;
 //BA.debugLineNum = 5636117;BA.debugLine="roundview.BackgroundColor=Colors.White";
mostCurrent._roundview.setBackgroundColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=5636119;
 //BA.debugLineNum = 5636119;BA.debugLine="Dim bkcolor_st As ColorDrawable";
_bkcolor_st = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=5636120;
 //BA.debugLineNum = 5636120;BA.debugLine="bkcolor_st.Initialize2(0xFFC67D00,50,4dip,0x82FFE";
_bkcolor_st.Initialize2((int) (0xffc67d00),(int) (50),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (4)),(int) (0x82ffe300));
RDebugUtils.currentLine=5636122;
 //BA.debugLineNum = 5636122;BA.debugLine="Dim pnlb1 As Panel";
_pnlb1 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=5636123;
 //BA.debugLineNum = 5636123;BA.debugLine="pnlb1.Initialize(\"\")";
_pnlb1.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=5636124;
 //BA.debugLineNum = 5636124;BA.debugLine="pnlb1.Color=0xFFFFC300";
_pnlb1.setColor((int) (0xffffc300));
RDebugUtils.currentLine=5636125;
 //BA.debugLineNum = 5636125;BA.debugLine="pnlb1.Background=bkcolor_st";
_pnlb1.setBackground((android.graphics.drawable.Drawable)(_bkcolor_st.getObject()));
RDebugUtils.currentLine=5636126;
 //BA.debugLineNum = 5636126;BA.debugLine="pnl_coins.AddView(pnlb1,pnl_coins.Width-11%x,1%x,";
mostCurrent._pnl_coins.AddView((android.view.View)(_pnlb1.getObject()),(int) (mostCurrent._pnl_coins.getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (11),mostCurrent.activityBA)),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (1),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA),(int) (mostCurrent._pnl_coins.getHeight()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (2),mostCurrent.activityBA)));
RDebugUtils.currentLine=5636128;
 //BA.debugLineNum = 5636128;BA.debugLine="lbl_icon.Initialize(\"lbl_icon\")";
mostCurrent._lbl_icon.Initialize(mostCurrent.activityBA,"lbl_icon");
RDebugUtils.currentLine=5636129;
 //BA.debugLineNum = 5636129;BA.debugLine="lbl_icon.SetBackgroundImage(LoadBitmap(File.DirAs";
mostCurrent._lbl_icon.SetBackgroundImageNew((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"coins.png").getObject()));
RDebugUtils.currentLine=5636130;
 //BA.debugLineNum = 5636130;BA.debugLine="pnl_coins.AddView(lbl_icon,pnl_coins.Width-9%x,pn";
mostCurrent._pnl_coins.AddView((android.view.View)(mostCurrent._lbl_icon.getObject()),(int) (mostCurrent._pnl_coins.getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (9),mostCurrent.activityBA)),(int) (mostCurrent._pnl_coins.getHeight()/(double)2/(double)2),(int) (mostCurrent._pnl_coins.getHeight()/(double)2),(int) (mostCurrent._pnl_coins.getHeight()/(double)2));
RDebugUtils.currentLine=5636132;
 //BA.debugLineNum = 5636132;BA.debugLine="lbl_nums.Initialize(\"lbl_nums\")";
mostCurrent._lbl_nums.Initialize(mostCurrent.activityBA,"lbl_nums");
RDebugUtils.currentLine=5636133;
 //BA.debugLineNum = 5636133;BA.debugLine="lbl_nums.TextColor=Colors.DarkGray";
mostCurrent._lbl_nums.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.DarkGray);
RDebugUtils.currentLine=5636134;
 //BA.debugLineNum = 5636134;BA.debugLine="lbl_nums.TextSize=20";
mostCurrent._lbl_nums.setTextSize((float) (20));
RDebugUtils.currentLine=5636135;
 //BA.debugLineNum = 5636135;BA.debugLine="lbl_nums.Typeface=Typeface.LoadFromAssets(\"iran_s";
mostCurrent._lbl_nums.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("iran_sans.ttf"));
RDebugUtils.currentLine=5636136;
 //BA.debugLineNum = 5636136;BA.debugLine="lbl_nums.Text=0&\" سکه\"";
mostCurrent._lbl_nums.setText(BA.ObjectToCharSequence(BA.NumberToString(0)+" سکه"));
RDebugUtils.currentLine=5636137;
 //BA.debugLineNum = 5636137;BA.debugLine="lbl_nums.Gravity=Gravity.CENTER_VERTICAL+Gravity.";
mostCurrent._lbl_nums.setGravity((int) (anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL+anywheresoftware.b4a.keywords.Common.Gravity.RIGHT));
RDebugUtils.currentLine=5636138;
 //BA.debugLineNum = 5636138;BA.debugLine="pnl_coins.AddView(lbl_nums,2%x,0,pnl_coins.Width-";
mostCurrent._pnl_coins.AddView((android.view.View)(mostCurrent._lbl_nums.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (2),mostCurrent.activityBA),(int) (0),(int) (mostCurrent._pnl_coins.getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (15),mostCurrent.activityBA)),mostCurrent._pnl_coins.getHeight());
RDebugUtils.currentLine=5636142;
 //BA.debugLineNum = 5636142;BA.debugLine="If File.Exists(File.DirInternal,\"instadb.db\")=Fal";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"instadb.db")==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=5636143;
 //BA.debugLineNum = 5636143;BA.debugLine="File.Copy(File.DirAssets,\"instadb.db\",File.DirIn";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"instadb.db",anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"instadb.db");
 };
RDebugUtils.currentLine=5636145;
 //BA.debugLineNum = 5636145;BA.debugLine="If sql1.IsInitialized=False Then";
if (_sql1.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=5636146;
 //BA.debugLineNum = 5636146;BA.debugLine="sql1.Initialize(File.DirInternal,\"instadb.db\",Fa";
_sql1.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"instadb.db",anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=5636152;
 //BA.debugLineNum = 5636152;BA.debugLine="Select type_s";
switch (_type_s) {
case 0: {
RDebugUtils.currentLine=5636154;
 //BA.debugLineNum = 5636154;BA.debugLine="cursor1 = sql1.ExecQuery(\"SELECT * FROM tbl_acc";
_cursor1.setObject((android.database.Cursor)(_sql1.ExecQuery("SELECT * FROM tbl_acc WHERE soich='1' ")));
RDebugUtils.currentLine=5636155;
 //BA.debugLineNum = 5636155;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=5636156;
 //BA.debugLineNum = 5636156;BA.debugLine="For i=0 To cursor1.RowCount-1";
{
final int step44 = 1;
final int limit44 = (int) (_cursor1.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit44 ;_i = _i + step44 ) {
RDebugUtils.currentLine=5636157;
 //BA.debugLineNum = 5636157;BA.debugLine="cursor1.Position=i";
_cursor1.setPosition(_i);
RDebugUtils.currentLine=5636158;
 //BA.debugLineNum = 5636158;BA.debugLine="i_cookie=cursor1.GetString(\"cookie\")";
mostCurrent._i_cookie = _cursor1.GetString("cookie");
RDebugUtils.currentLine=5636159;
 //BA.debugLineNum = 5636159;BA.debugLine="i_username=cursor1.GetString(\"username\")";
mostCurrent._i_username = _cursor1.GetString("username");
RDebugUtils.currentLine=5636160;
 //BA.debugLineNum = 5636160;BA.debugLine="i_pk=cursor1.GetString(\"pk\")";
mostCurrent._i_pk = _cursor1.GetString("pk");
RDebugUtils.currentLine=5636161;
 //BA.debugLineNum = 5636161;BA.debugLine="i_pic=cursor1.GetString(\"profile_pic_url\")";
mostCurrent._i_pic = _cursor1.GetString("profile_pic_url");
 }
};
RDebugUtils.currentLine=5636165;
 //BA.debugLineNum = 5636165;BA.debugLine="Dim Gradient1 As GradientDrawable";
_gradient1 = new anywheresoftware.b4a.objects.drawable.GradientDrawable();
RDebugUtils.currentLine=5636166;
 //BA.debugLineNum = 5636166;BA.debugLine="Dim Clrs(2) As Int";
_clrs = new int[(int) (2)];
;
RDebugUtils.currentLine=5636167;
 //BA.debugLineNum = 5636167;BA.debugLine="Clrs(0) = 0xFFD91A99";
_clrs[(int) (0)] = (int) (0xffd91a99);
RDebugUtils.currentLine=5636168;
 //BA.debugLineNum = 5636168;BA.debugLine="Clrs(1) = 0xFFA91AD9";
_clrs[(int) (1)] = (int) (0xffa91ad9);
RDebugUtils.currentLine=5636169;
 //BA.debugLineNum = 5636169;BA.debugLine="Gradient1.Initialize(\"TOP_BOTTOM\", Clrs)";
_gradient1.Initialize(BA.getEnumFromString(android.graphics.drawable.GradientDrawable.Orientation.class,"TOP_BOTTOM"),_clrs);
RDebugUtils.currentLine=5636170;
 //BA.debugLineNum = 5636170;BA.debugLine="Activity.Background=Gradient1";
mostCurrent._activity.setBackground((android.graphics.drawable.Drawable)(_gradient1.getObject()));
RDebugUtils.currentLine=5636172;
 //BA.debugLineNum = 5636172;BA.debugLine="req_insta(i_pk)";
_req_insta(mostCurrent._i_pk);
RDebugUtils.currentLine=5636173;
 //BA.debugLineNum = 5636173;BA.debugLine="bg1.Initialize(0xFFBC11C6,2%x)";
mostCurrent._bg1.Initialize((int) (0xffbc11c6),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (2),mostCurrent.activityBA));
 break; }
case 1: {
RDebugUtils.currentLine=5636177;
 //BA.debugLineNum = 5636177;BA.debugLine="Dim Gradient1 As GradientDrawable";
_gradient1 = new anywheresoftware.b4a.objects.drawable.GradientDrawable();
RDebugUtils.currentLine=5636178;
 //BA.debugLineNum = 5636178;BA.debugLine="Dim Clrs(5) As Int";
_clrs = new int[(int) (5)];
;
RDebugUtils.currentLine=5636179;
 //BA.debugLineNum = 5636179;BA.debugLine="Clrs(0) = 0xFFe8eaf6";
_clrs[(int) (0)] = (int) (0xffe8eaf6);
RDebugUtils.currentLine=5636180;
 //BA.debugLineNum = 5636180;BA.debugLine="Clrs(1) = 0xFFe8eaf6";
_clrs[(int) (1)] = (int) (0xffe8eaf6);
RDebugUtils.currentLine=5636181;
 //BA.debugLineNum = 5636181;BA.debugLine="Clrs(2) = 0xFFe8eaf6";
_clrs[(int) (2)] = (int) (0xffe8eaf6);
RDebugUtils.currentLine=5636182;
 //BA.debugLineNum = 5636182;BA.debugLine="Clrs(3) = 0xFF283593";
_clrs[(int) (3)] = (int) (0xff283593);
RDebugUtils.currentLine=5636183;
 //BA.debugLineNum = 5636183;BA.debugLine="Clrs(4) = 0xFF283593";
_clrs[(int) (4)] = (int) (0xff283593);
RDebugUtils.currentLine=5636185;
 //BA.debugLineNum = 5636185;BA.debugLine="Gradient1.Initialize(\"TOP_BOTTOM\", Clrs)";
_gradient1.Initialize(BA.getEnumFromString(android.graphics.drawable.GradientDrawable.Orientation.class,"TOP_BOTTOM"),_clrs);
RDebugUtils.currentLine=5636186;
 //BA.debugLineNum = 5636186;BA.debugLine="Activity.Background=Gradient1";
mostCurrent._activity.setBackground((android.graphics.drawable.Drawable)(_gradient1.getObject()));
RDebugUtils.currentLine=5636189;
 //BA.debugLineNum = 5636189;BA.debugLine="cursor1 = sql1.ExecQuery(\"SELECT * FROM tbl_tel";
_cursor1.setObject((android.database.Cursor)(_sql1.ExecQuery("SELECT * FROM tbl_tele WHERE soich='1'")));
RDebugUtils.currentLine=5636190;
 //BA.debugLineNum = 5636190;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=5636191;
 //BA.debugLineNum = 5636191;BA.debugLine="For i=0 To cursor1.RowCount-1";
{
final int step71 = 1;
final int limit71 = (int) (_cursor1.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit71 ;_i = _i + step71 ) {
RDebugUtils.currentLine=5636192;
 //BA.debugLineNum = 5636192;BA.debugLine="cursor1.Position=i";
_cursor1.setPosition(_i);
RDebugUtils.currentLine=5636193;
 //BA.debugLineNum = 5636193;BA.debugLine="userid_t=cursor1.GetString(\"userid\")";
mostCurrent._userid_t = _cursor1.GetString("userid");
RDebugUtils.currentLine=5636194;
 //BA.debugLineNum = 5636194;BA.debugLine="username_t=cursor1.GetString(\"username\")";
mostCurrent._username_t = _cursor1.GetString("username");
 }
};
RDebugUtils.currentLine=5636196;
 //BA.debugLineNum = 5636196;BA.debugLine="req_tele(\"\")";
_req_tele("");
RDebugUtils.currentLine=5636197;
 //BA.debugLineNum = 5636197;BA.debugLine="bg1.Initialize(0xFF1D69C6,2%x)";
mostCurrent._bg1.Initialize((int) (0xff1d69c6),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (2),mostCurrent.activityBA));
 break; }
}
;
RDebugUtils.currentLine=5636206;
 //BA.debugLineNum = 5636206;BA.debugLine="Dim card As CardView";
_card = new de.amberhome.objects.CardViewWrapper();
RDebugUtils.currentLine=5636207;
 //BA.debugLineNum = 5636207;BA.debugLine="card.Initialize(\"card\")";
_card.Initialize(mostCurrent.activityBA,"card");
RDebugUtils.currentLine=5636208;
 //BA.debugLineNum = 5636208;BA.debugLine="card.Color=Colors.White";
_card.setColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=5636209;
 //BA.debugLineNum = 5636209;BA.debugLine="card.CornerRadius=3%x";
_card.setCornerRadius((float) (anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (3),mostCurrent.activityBA)));
RDebugUtils.currentLine=5636210;
 //BA.debugLineNum = 5636210;BA.debugLine="Activity.AddView(card,3%x,20%x,100%x-6%x,10dip)";
mostCurrent._activity.AddView((android.view.View)(_card.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (3),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (20),mostCurrent.activityBA),(int) (anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA)-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (6),mostCurrent.activityBA)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (10)));
RDebugUtils.currentLine=5636212;
 //BA.debugLineNum = 5636212;BA.debugLine="Dim pnl_card As Panel";
_pnl_card = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=5636213;
 //BA.debugLineNum = 5636213;BA.debugLine="pnl_card.Initialize(\"pnl_card\")";
_pnl_card.Initialize(mostCurrent.activityBA,"pnl_card");
RDebugUtils.currentLine=5636214;
 //BA.debugLineNum = 5636214;BA.debugLine="pnl_card.Color=Colors.White";
_pnl_card.setColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=5636215;
 //BA.debugLineNum = 5636215;BA.debugLine="card.AddView(pnl_card,0,0,card.Width,card.Height)";
_card.AddView((android.view.View)(_pnl_card.getObject()),(int) (0),(int) (0),_card.getWidth(),_card.getHeight());
RDebugUtils.currentLine=5636217;
 //BA.debugLineNum = 5636217;BA.debugLine="Dim lbl_a As Label";
_lbl_a = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=5636218;
 //BA.debugLineNum = 5636218;BA.debugLine="lbl_a.Initialize(\"lbl_a\")";
_lbl_a.Initialize(mostCurrent.activityBA,"lbl_a");
RDebugUtils.currentLine=5636219;
 //BA.debugLineNum = 5636219;BA.debugLine="lbl_a.TextColor=Colors.DarkGray";
_lbl_a.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.DarkGray);
RDebugUtils.currentLine=5636220;
 //BA.debugLineNum = 5636220;BA.debugLine="lbl_a.TextSize=18";
_lbl_a.setTextSize((float) (18));
RDebugUtils.currentLine=5636221;
 //BA.debugLineNum = 5636221;BA.debugLine="lbl_a.Typeface=Typeface.LoadFromAssets(\"iran_sans";
_lbl_a.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("iran_sans.ttf"));
RDebugUtils.currentLine=5636222;
 //BA.debugLineNum = 5636222;BA.debugLine="lbl_a.Text=\"انتقال سکه\"";
_lbl_a.setText(BA.ObjectToCharSequence("انتقال سکه"));
RDebugUtils.currentLine=5636223;
 //BA.debugLineNum = 5636223;BA.debugLine="lbl_a.Gravity=Gravity.CENTER_VERTICAL+Gravity.CEN";
_lbl_a.setGravity((int) (anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL+anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL));
RDebugUtils.currentLine=5636224;
 //BA.debugLineNum = 5636224;BA.debugLine="pnl_card.AddView(lbl_a,5%x,0,pnl_card.Width-10%x,";
_pnl_card.AddView((android.view.View)(_lbl_a.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA),(int) (0),(int) (_pnl_card.getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA)),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (15),mostCurrent.activityBA));
RDebugUtils.currentLine=5636226;
 //BA.debugLineNum = 5636226;BA.debugLine="Dim lbl_cc As Label";
_lbl_cc = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=5636227;
 //BA.debugLineNum = 5636227;BA.debugLine="lbl_cc.Initialize(\"lbl_cc\")";
_lbl_cc.Initialize(mostCurrent.activityBA,"lbl_cc");
RDebugUtils.currentLine=5636228;
 //BA.debugLineNum = 5636228;BA.debugLine="lbl_cc.TextColor=Colors.DarkGray";
_lbl_cc.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.DarkGray);
RDebugUtils.currentLine=5636229;
 //BA.debugLineNum = 5636229;BA.debugLine="lbl_cc.TextSize=14";
_lbl_cc.setTextSize((float) (14));
RDebugUtils.currentLine=5636230;
 //BA.debugLineNum = 5636230;BA.debugLine="lbl_cc.Typeface=Typeface.LoadFromAssets(\"iran_san";
_lbl_cc.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("iran_sans.ttf"));
RDebugUtils.currentLine=5636231;
 //BA.debugLineNum = 5636231;BA.debugLine="Select type_s";
switch (_type_s) {
case 0: {
RDebugUtils.currentLine=5636233;
 //BA.debugLineNum = 5636233;BA.debugLine="lbl_cc.Text=\"کد کاربری شما : \"&i_pk";
_lbl_cc.setText(BA.ObjectToCharSequence("کد کاربری شما : "+mostCurrent._i_pk));
 break; }
case 1: {
RDebugUtils.currentLine=5636236;
 //BA.debugLineNum = 5636236;BA.debugLine="lbl_cc.Text=\"کد کاربری شما : \"&userid_t";
_lbl_cc.setText(BA.ObjectToCharSequence("کد کاربری شما : "+mostCurrent._userid_t));
 break; }
}
;
RDebugUtils.currentLine=5636239;
 //BA.debugLineNum = 5636239;BA.debugLine="lbl_cc.Gravity=Gravity.CENTER_VERTICAL+Gravity.CE";
_lbl_cc.setGravity((int) (anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL+anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL));
RDebugUtils.currentLine=5636240;
 //BA.debugLineNum = 5636240;BA.debugLine="pnl_card.AddView(lbl_cc,5%x,lbl_a.Top+lbl_a.Heigh";
_pnl_card.AddView((android.view.View)(_lbl_cc.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA),(int) (_lbl_a.getTop()+_lbl_a.getHeight()+anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (1),mostCurrent.activityBA)),(int) (_pnl_card.getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA)),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (15),mostCurrent.activityBA));
RDebugUtils.currentLine=5636243;
 //BA.debugLineNum = 5636243;BA.debugLine="Dim bg As ColorDrawable";
_bg = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=5636244;
 //BA.debugLineNum = 5636244;BA.debugLine="bg.Initialize2(Colors.Transparent,5%x,2dip,Colors";
_bg.Initialize2(anywheresoftware.b4a.keywords.Common.Colors.Transparent,anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (2)),anywheresoftware.b4a.keywords.Common.Colors.LightGray);
RDebugUtils.currentLine=5636245;
 //BA.debugLineNum = 5636245;BA.debugLine="edit_target.Initialize(\"edit_target\")";
mostCurrent._edit_target.Initialize(mostCurrent.activityBA,"edit_target");
RDebugUtils.currentLine=5636246;
 //BA.debugLineNum = 5636246;BA.debugLine="edit_target.TextColor=Colors.DarkGray";
mostCurrent._edit_target.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.DarkGray);
RDebugUtils.currentLine=5636247;
 //BA.debugLineNum = 5636247;BA.debugLine="edit_target.TextSize=14";
mostCurrent._edit_target.setTextSize((float) (14));
RDebugUtils.currentLine=5636248;
 //BA.debugLineNum = 5636248;BA.debugLine="edit_target.Typeface=Typeface.LoadFromAssets(\"ira";
mostCurrent._edit_target.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("iran_sans.ttf"));
RDebugUtils.currentLine=5636249;
 //BA.debugLineNum = 5636249;BA.debugLine="edit_target.Gravity=Gravity.CENTER_VERTICAL+Gravi";
mostCurrent._edit_target.setGravity((int) (anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL+anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL));
RDebugUtils.currentLine=5636250;
 //BA.debugLineNum = 5636250;BA.debugLine="edit_target.Hint=\"کد کاربری مورد نظر شما\"";
mostCurrent._edit_target.setHint("کد کاربری مورد نظر شما");
RDebugUtils.currentLine=5636251;
 //BA.debugLineNum = 5636251;BA.debugLine="edit_target.HintColor=Colors.LightGray";
mostCurrent._edit_target.setHintColor(anywheresoftware.b4a.keywords.Common.Colors.LightGray);
RDebugUtils.currentLine=5636252;
 //BA.debugLineNum = 5636252;BA.debugLine="edit_target.Background=bg";
mostCurrent._edit_target.setBackground((android.graphics.drawable.Drawable)(_bg.getObject()));
RDebugUtils.currentLine=5636253;
 //BA.debugLineNum = 5636253;BA.debugLine="edit_target.InputType=edit_target.INPUT_TYPE_NUMB";
mostCurrent._edit_target.setInputType(mostCurrent._edit_target.INPUT_TYPE_NUMBERS);
RDebugUtils.currentLine=5636254;
 //BA.debugLineNum = 5636254;BA.debugLine="pnl_card.AddView(edit_target,5%x,lbl_cc.Top+lbl_c";
_pnl_card.AddView((android.view.View)(mostCurrent._edit_target.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA),(int) (_lbl_cc.getTop()+_lbl_cc.getHeight()+anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA)),(int) (_pnl_card.getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA)),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (12),mostCurrent.activityBA));
RDebugUtils.currentLine=5636256;
 //BA.debugLineNum = 5636256;BA.debugLine="Dim bg As ColorDrawable";
_bg = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=5636257;
 //BA.debugLineNum = 5636257;BA.debugLine="bg.Initialize2(Colors.Transparent,5%x,2dip,Colors";
_bg.Initialize2(anywheresoftware.b4a.keywords.Common.Colors.Transparent,anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (2)),anywheresoftware.b4a.keywords.Common.Colors.LightGray);
RDebugUtils.currentLine=5636259;
 //BA.debugLineNum = 5636259;BA.debugLine="edit_nums.Initialize(\"edit_nums\")";
mostCurrent._edit_nums.Initialize(mostCurrent.activityBA,"edit_nums");
RDebugUtils.currentLine=5636260;
 //BA.debugLineNum = 5636260;BA.debugLine="edit_nums.TextColor=Colors.DarkGray";
mostCurrent._edit_nums.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.DarkGray);
RDebugUtils.currentLine=5636261;
 //BA.debugLineNum = 5636261;BA.debugLine="edit_nums.TextSize=14";
mostCurrent._edit_nums.setTextSize((float) (14));
RDebugUtils.currentLine=5636262;
 //BA.debugLineNum = 5636262;BA.debugLine="edit_nums.Typeface=Typeface.LoadFromAssets(\"iran_";
mostCurrent._edit_nums.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("iran_sans.ttf"));
RDebugUtils.currentLine=5636263;
 //BA.debugLineNum = 5636263;BA.debugLine="edit_nums.Gravity=Gravity.CENTER_VERTICAL+Gravity";
mostCurrent._edit_nums.setGravity((int) (anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL+anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL));
RDebugUtils.currentLine=5636264;
 //BA.debugLineNum = 5636264;BA.debugLine="edit_nums.Hint=\"تعداد سکه های مورد نیاز جهت انتقا";
mostCurrent._edit_nums.setHint("تعداد سکه های مورد نیاز جهت انتقال");
RDebugUtils.currentLine=5636265;
 //BA.debugLineNum = 5636265;BA.debugLine="edit_nums.HintColor=Colors.LightGray";
mostCurrent._edit_nums.setHintColor(anywheresoftware.b4a.keywords.Common.Colors.LightGray);
RDebugUtils.currentLine=5636266;
 //BA.debugLineNum = 5636266;BA.debugLine="edit_nums.Background=bg";
mostCurrent._edit_nums.setBackground((android.graphics.drawable.Drawable)(_bg.getObject()));
RDebugUtils.currentLine=5636267;
 //BA.debugLineNum = 5636267;BA.debugLine="edit_nums.InputType=edit_nums.INPUT_TYPE_NUMBERS";
mostCurrent._edit_nums.setInputType(mostCurrent._edit_nums.INPUT_TYPE_NUMBERS);
RDebugUtils.currentLine=5636268;
 //BA.debugLineNum = 5636268;BA.debugLine="pnl_card.AddView(edit_nums,5%x,edit_target.Top+ed";
_pnl_card.AddView((android.view.View)(mostCurrent._edit_nums.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA),(int) (mostCurrent._edit_target.getTop()+mostCurrent._edit_target.getHeight()+anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA)),(int) (_pnl_card.getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA)),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (12),mostCurrent.activityBA));
RDebugUtils.currentLine=5636271;
 //BA.debugLineNum = 5636271;BA.debugLine="Dim lbl_send As Label";
_lbl_send = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=5636272;
 //BA.debugLineNum = 5636272;BA.debugLine="lbl_send.Initialize(\"lbl_send\")";
_lbl_send.Initialize(mostCurrent.activityBA,"lbl_send");
RDebugUtils.currentLine=5636273;
 //BA.debugLineNum = 5636273;BA.debugLine="lbl_send.TextColor=Colors.White";
_lbl_send.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=5636274;
 //BA.debugLineNum = 5636274;BA.debugLine="lbl_send.TextSize=17";
_lbl_send.setTextSize((float) (17));
RDebugUtils.currentLine=5636275;
 //BA.debugLineNum = 5636275;BA.debugLine="lbl_send.Typeface=Typeface.LoadFromAssets(\"iran_s";
_lbl_send.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("iran_sans.ttf"));
RDebugUtils.currentLine=5636276;
 //BA.debugLineNum = 5636276;BA.debugLine="lbl_send.Text=\"انجام انتقال سکه\"";
_lbl_send.setText(BA.ObjectToCharSequence("انجام انتقال سکه"));
RDebugUtils.currentLine=5636277;
 //BA.debugLineNum = 5636277;BA.debugLine="lbl_send.Background=bg1";
_lbl_send.setBackground((android.graphics.drawable.Drawable)(mostCurrent._bg1.getObject()));
RDebugUtils.currentLine=5636278;
 //BA.debugLineNum = 5636278;BA.debugLine="lbl_send.Gravity=Gravity.CENTER_VERTICAL+Gravity.";
_lbl_send.setGravity((int) (anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL+anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL));
RDebugUtils.currentLine=5636279;
 //BA.debugLineNum = 5636279;BA.debugLine="pnl_card.AddView(lbl_send,5%x,edit_nums.Top+edit_";
_pnl_card.AddView((android.view.View)(_lbl_send.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA),(int) (mostCurrent._edit_nums.getTop()+mostCurrent._edit_nums.getHeight()+anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA)),(int) (_pnl_card.getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA)),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (12),mostCurrent.activityBA));
RDebugUtils.currentLine=5636281;
 //BA.debugLineNum = 5636281;BA.debugLine="pnl_card.Height=lbl_send.Top+lbl_send.Height+5%x";
_pnl_card.setHeight((int) (_lbl_send.getTop()+_lbl_send.getHeight()+anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA)));
RDebugUtils.currentLine=5636282;
 //BA.debugLineNum = 5636282;BA.debugLine="card.Height=pnl_card.Height";
_card.setHeight(_pnl_card.getHeight());
RDebugUtils.currentLine=5636283;
 //BA.debugLineNum = 5636283;BA.debugLine="End Sub";
return "";
}
public static String  _req_insta(String _userid) throws Exception{
RDebugUtils.currentModule="ac_tansfer";
if (Debug.shouldDelegate(mostCurrent.activityBA, "req_insta", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "req_insta", new Object[] {_userid}));}
com.reza.sh.fastnet.Fastnet _prfn = null;
com.reza.sh.fastnet.PostRequestRaper _post = null;
RDebugUtils.currentLine=6029312;
 //BA.debugLineNum = 6029312;BA.debugLine="Sub req_insta(userid As String)";
RDebugUtils.currentLine=6029313;
 //BA.debugLineNum = 6029313;BA.debugLine="Dim prfn As PersianFastNetwork";
_prfn = new com.reza.sh.fastnet.Fastnet();
RDebugUtils.currentLine=6029314;
 //BA.debugLineNum = 6029314;BA.debugLine="prfn.initialize(\"prfn\")";
_prfn.initialize(processBA,"prfn");
RDebugUtils.currentLine=6029316;
 //BA.debugLineNum = 6029316;BA.debugLine="Dim post As PostRequest";
_post = new com.reza.sh.fastnet.PostRequestRaper();
RDebugUtils.currentLine=6029317;
 //BA.debugLineNum = 6029317;BA.debugLine="post=prfn.BuildPostQuery(\"http://filework.ir/INST";
_post = _prfn.BuildPostQuery("http://filework.ir/INSTAFOLLOW/api/req.php","getinsta");
RDebugUtils.currentLine=6029319;
 //BA.debugLineNum = 6029319;BA.debugLine="post.addHeder(\"User-Agent\",\"Dalvik/1.6.0 (Linux;";
_post.addHeder("User-Agent","Dalvik/1.6.0 (Linux; U; Android 4.4.4; SM-A700FD Build/KTU84P)");
RDebugUtils.currentLine=6029321;
 //BA.debugLineNum = 6029321;BA.debugLine="post.addParametrs(\"ui\",\"1\")";
_post.addParametrs("ui","1");
RDebugUtils.currentLine=6029322;
 //BA.debugLineNum = 6029322;BA.debugLine="post.addParametrs(\"userid\",i_pk)";
_post.addParametrs("userid",mostCurrent._i_pk);
RDebugUtils.currentLine=6029324;
 //BA.debugLineNum = 6029324;BA.debugLine="post.addParametrs(\"req\",\"get_acci\")";
_post.addParametrs("req","get_acci");
RDebugUtils.currentLine=6029327;
 //BA.debugLineNum = 6029327;BA.debugLine="post.executRequestAsString";
_post.executRequestAsString();
RDebugUtils.currentLine=6029328;
 //BA.debugLineNum = 6029328;BA.debugLine="End Sub";
return "";
}
public static String  _req_tele(String _userid) throws Exception{
RDebugUtils.currentModule="ac_tansfer";
if (Debug.shouldDelegate(mostCurrent.activityBA, "req_tele", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "req_tele", new Object[] {_userid}));}
com.reza.sh.fastnet.Fastnet _prfn = null;
com.reza.sh.fastnet.PostRequestRaper _post = null;
RDebugUtils.currentLine=5963776;
 //BA.debugLineNum = 5963776;BA.debugLine="Sub req_tele(userid As String)";
RDebugUtils.currentLine=5963777;
 //BA.debugLineNum = 5963777;BA.debugLine="Dim prfn As PersianFastNetwork";
_prfn = new com.reza.sh.fastnet.Fastnet();
RDebugUtils.currentLine=5963778;
 //BA.debugLineNum = 5963778;BA.debugLine="prfn.initialize(\"prfn\")";
_prfn.initialize(processBA,"prfn");
RDebugUtils.currentLine=5963780;
 //BA.debugLineNum = 5963780;BA.debugLine="Dim post As PostRequest";
_post = new com.reza.sh.fastnet.PostRequestRaper();
RDebugUtils.currentLine=5963781;
 //BA.debugLineNum = 5963781;BA.debugLine="post=prfn.BuildPostQuery(\"http://filework.ir/INST";
_post = _prfn.BuildPostQuery("http://filework.ir/INSTAFOLLOW/api/req.php","gettele");
RDebugUtils.currentLine=5963783;
 //BA.debugLineNum = 5963783;BA.debugLine="post.addHeder(\"User-Agent\",\"Dalvik/1.6.0 (Linux;";
_post.addHeder("User-Agent","Dalvik/1.6.0 (Linux; U; Android 4.4.4; SM-A700FD Build/KTU84P)");
RDebugUtils.currentLine=5963785;
 //BA.debugLineNum = 5963785;BA.debugLine="post.addParametrs(\"ui\",\"1\")";
_post.addParametrs("ui","1");
RDebugUtils.currentLine=5963786;
 //BA.debugLineNum = 5963786;BA.debugLine="post.addParametrs(\"userid\",userid_t)";
_post.addParametrs("userid",mostCurrent._userid_t);
RDebugUtils.currentLine=5963788;
 //BA.debugLineNum = 5963788;BA.debugLine="post.addParametrs(\"req\",\"get_acct\")";
_post.addParametrs("req","get_acct");
RDebugUtils.currentLine=5963791;
 //BA.debugLineNum = 5963791;BA.debugLine="post.executRequestAsString";
_post.executRequestAsString();
RDebugUtils.currentLine=5963792;
 //BA.debugLineNum = 5963792;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="ac_tansfer";
RDebugUtils.currentLine=5767168;
 //BA.debugLineNum = 5767168;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=5767170;
 //BA.debugLineNum = 5767170;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="ac_tansfer";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=5701632;
 //BA.debugLineNum = 5701632;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=5701634;
 //BA.debugLineNum = 5701634;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_send_click() throws Exception{
RDebugUtils.currentModule="ac_tansfer";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lbl_send_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "lbl_send_click", null));}
de.amberhome.materialdialogs.MaterialDialogBuilderWrapper _builder = null;
RDebugUtils.currentLine=5832704;
 //BA.debugLineNum = 5832704;BA.debugLine="Sub lbl_send_Click";
RDebugUtils.currentLine=5832705;
 //BA.debugLineNum = 5832705;BA.debugLine="If edit_target.Text=\"\" Then";
if ((mostCurrent._edit_target.getText()).equals("")) { 
RDebugUtils.currentLine=5832707;
 //BA.debugLineNum = 5832707;BA.debugLine="mtoast.Initialize(\"فیلد کاربر مورد نظر نمی تواند";
mostCurrent._mtoast.Initialize(mostCurrent.activityBA,"فیلد کاربر مورد نظر نمی تواند خالی باشد",mostCurrent._mtoast.LENGTH_SHORT,mostCurrent._mtoast.TYPE_INFO);
RDebugUtils.currentLine=5832708;
 //BA.debugLineNum = 5832708;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=5832711;
 //BA.debugLineNum = 5832711;BA.debugLine="If edit_nums.Text=\"\" Then";
if ((mostCurrent._edit_nums.getText()).equals("")) { 
RDebugUtils.currentLine=5832713;
 //BA.debugLineNum = 5832713;BA.debugLine="mtoast.Initialize(\"فیلد تعداد سکه نمی تواند خالی";
mostCurrent._mtoast.Initialize(mostCurrent.activityBA,"فیلد تعداد سکه نمی تواند خالی باشد",mostCurrent._mtoast.LENGTH_SHORT,mostCurrent._mtoast.TYPE_INFO);
RDebugUtils.currentLine=5832714;
 //BA.debugLineNum = 5832714;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=5832717;
 //BA.debugLineNum = 5832717;BA.debugLine="Select type_s";
switch (_type_s) {
case 0: {
RDebugUtils.currentLine=5832719;
 //BA.debugLineNum = 5832719;BA.debugLine="req_tarns(i_pk,edit_target.Text,edit_nums.Text,";
_req_tarns(mostCurrent._i_pk,mostCurrent._edit_target.getText(),mostCurrent._edit_nums.getText(),"0");
RDebugUtils.currentLine=5832721;
 //BA.debugLineNum = 5832721;BA.debugLine="Dim Builder As MaterialDialogBuilder";
_builder = new de.amberhome.materialdialogs.MaterialDialogBuilderWrapper();
RDebugUtils.currentLine=5832722;
 //BA.debugLineNum = 5832722;BA.debugLine="Builder.Initialize(\"Dialog\")";
_builder.Initialize(mostCurrent.activityBA,"Dialog");
RDebugUtils.currentLine=5832723;
 //BA.debugLineNum = 5832723;BA.debugLine="Builder.Title(\"انتقال سکه\")";
_builder.Title(BA.ObjectToCharSequence("انتقال سکه"));
RDebugUtils.currentLine=5832724;
 //BA.debugLineNum = 5832724;BA.debugLine="Builder.Content(\"درحال ثبت ...\")";
_builder.Content(BA.ObjectToCharSequence("درحال ثبت ..."));
RDebugUtils.currentLine=5832725;
 //BA.debugLineNum = 5832725;BA.debugLine="Builder.Progress(True, 0)";
_builder.Progress(anywheresoftware.b4a.keywords.Common.True,(int) (0));
RDebugUtils.currentLine=5832726;
 //BA.debugLineNum = 5832726;BA.debugLine="Builder.ProgressIndeterminateStyle(True)";
_builder.ProgressIndeterminateStyle(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=5832727;
 //BA.debugLineNum = 5832727;BA.debugLine="progressDialog = Builder.Show";
mostCurrent._progressdialog = _builder.Show();
 break; }
case 1: {
RDebugUtils.currentLine=5832730;
 //BA.debugLineNum = 5832730;BA.debugLine="req_tarns(userid_t,edit_target.Text,edit_nums.T";
_req_tarns(mostCurrent._userid_t,mostCurrent._edit_target.getText(),mostCurrent._edit_nums.getText(),"1");
RDebugUtils.currentLine=5832731;
 //BA.debugLineNum = 5832731;BA.debugLine="Dim Builder As MaterialDialogBuilder";
_builder = new de.amberhome.materialdialogs.MaterialDialogBuilderWrapper();
RDebugUtils.currentLine=5832732;
 //BA.debugLineNum = 5832732;BA.debugLine="Builder.Initialize(\"Dialog\")";
_builder.Initialize(mostCurrent.activityBA,"Dialog");
RDebugUtils.currentLine=5832733;
 //BA.debugLineNum = 5832733;BA.debugLine="Builder.Title(\"انتقال سکه\")";
_builder.Title(BA.ObjectToCharSequence("انتقال سکه"));
RDebugUtils.currentLine=5832734;
 //BA.debugLineNum = 5832734;BA.debugLine="Builder.Content(\"درحال ثبت ...\")";
_builder.Content(BA.ObjectToCharSequence("درحال ثبت ..."));
RDebugUtils.currentLine=5832735;
 //BA.debugLineNum = 5832735;BA.debugLine="Builder.Progress(True, 0)";
_builder.Progress(anywheresoftware.b4a.keywords.Common.True,(int) (0));
RDebugUtils.currentLine=5832736;
 //BA.debugLineNum = 5832736;BA.debugLine="Builder.ProgressIndeterminateStyle(True)";
_builder.ProgressIndeterminateStyle(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=5832737;
 //BA.debugLineNum = 5832737;BA.debugLine="progressDialog = Builder.Show";
mostCurrent._progressdialog = _builder.Show();
 break; }
}
;
RDebugUtils.currentLine=5832742;
 //BA.debugLineNum = 5832742;BA.debugLine="End Sub";
return "";
}
public static String  _req_tarns(String _useridx,String _targetx,String _numsx,String _typex) throws Exception{
RDebugUtils.currentModule="ac_tansfer";
if (Debug.shouldDelegate(mostCurrent.activityBA, "req_tarns", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "req_tarns", new Object[] {_useridx,_targetx,_numsx,_typex}));}
com.reza.sh.fastnet.Fastnet _prfn = null;
com.reza.sh.fastnet.PostRequestRaper _post = null;
RDebugUtils.currentLine=5898240;
 //BA.debugLineNum = 5898240;BA.debugLine="Sub req_tarns(useridx As String,targetx As String,";
RDebugUtils.currentLine=5898241;
 //BA.debugLineNum = 5898241;BA.debugLine="Dim prfn As PersianFastNetwork";
_prfn = new com.reza.sh.fastnet.Fastnet();
RDebugUtils.currentLine=5898242;
 //BA.debugLineNum = 5898242;BA.debugLine="prfn.initialize(\"prfn\")";
_prfn.initialize(processBA,"prfn");
RDebugUtils.currentLine=5898244;
 //BA.debugLineNum = 5898244;BA.debugLine="Dim post As PostRequest";
_post = new com.reza.sh.fastnet.PostRequestRaper();
RDebugUtils.currentLine=5898245;
 //BA.debugLineNum = 5898245;BA.debugLine="post=prfn.BuildPostQuery(\"http://filework.ir/INST";
_post = _prfn.BuildPostQuery("http://filework.ir/INSTAFOLLOW/api/req.php","tansfer");
RDebugUtils.currentLine=5898247;
 //BA.debugLineNum = 5898247;BA.debugLine="post.addHeder(\"User-Agent\",\"Dalvik/1.6.0 (Linux;";
_post.addHeder("User-Agent","Dalvik/1.6.0 (Linux; U; Android 4.4.4; SM-A700FD Build/KTU84P)");
RDebugUtils.currentLine=5898249;
 //BA.debugLineNum = 5898249;BA.debugLine="post.addParametrs(\"userid\",useridx)";
_post.addParametrs("userid",_useridx);
RDebugUtils.currentLine=5898250;
 //BA.debugLineNum = 5898250;BA.debugLine="post.addParametrs(\"target\",targetx)";
_post.addParametrs("target",_targetx);
RDebugUtils.currentLine=5898251;
 //BA.debugLineNum = 5898251;BA.debugLine="post.addParametrs(\"nums\",numsx)";
_post.addParametrs("nums",_numsx);
RDebugUtils.currentLine=5898252;
 //BA.debugLineNum = 5898252;BA.debugLine="post.addParametrs(\"type\",typex)";
_post.addParametrs("type",_typex);
RDebugUtils.currentLine=5898255;
 //BA.debugLineNum = 5898255;BA.debugLine="post.addParametrs(\"req\",\"transfer_coins\")";
_post.addParametrs("req","transfer_coins");
RDebugUtils.currentLine=5898258;
 //BA.debugLineNum = 5898258;BA.debugLine="post.executRequestAsString";
_post.executRequestAsString();
RDebugUtils.currentLine=5898259;
 //BA.debugLineNum = 5898259;BA.debugLine="End Sub";
return "";
}
public static String  _meno_click() throws Exception{
RDebugUtils.currentModule="ac_tansfer";
if (Debug.shouldDelegate(mostCurrent.activityBA, "meno_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "meno_click", null));}
RDebugUtils.currentLine=6225920;
 //BA.debugLineNum = 6225920;BA.debugLine="Sub meno_Click";
RDebugUtils.currentLine=6225921;
 //BA.debugLineNum = 6225921;BA.debugLine="mimeno.Initialize(\"mimeno\",Me)";
mostCurrent._mimeno._initialize /*String*/ (null,mostCurrent.activityBA,"mimeno",ac_tansfer.getObject());
RDebugUtils.currentLine=6225922;
 //BA.debugLineNum = 6225922;BA.debugLine="mimeno.addpnl";
mostCurrent._mimeno._addpnl /*String*/ (null);
RDebugUtils.currentLine=6225923;
 //BA.debugLineNum = 6225923;BA.debugLine="mimeno.open";
mostCurrent._mimeno._open /*String*/ (null);
RDebugUtils.currentLine=6225924;
 //BA.debugLineNum = 6225924;BA.debugLine="End Sub";
return "";
}
public static String  _prfn_onpoststringerrorlistener(com.reza.sh.fastnet.Error _error,String _tag) throws Exception{
RDebugUtils.currentModule="ac_tansfer";
if (Debug.shouldDelegate(mostCurrent.activityBA, "prfn_onpoststringerrorlistener", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "prfn_onpoststringerrorlistener", new Object[] {_error,_tag}));}
RDebugUtils.currentLine=6094848;
 //BA.debugLineNum = 6094848;BA.debugLine="Sub prfn_onPostStringErrorListener(Error As Respon";
RDebugUtils.currentLine=6094850;
 //BA.debugLineNum = 6094850;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=6094851;
 //BA.debugLineNum = 6094851;BA.debugLine="End Sub";
return "";
}
public static String  _prfn_onpoststringoklistener(String _result,String _tag) throws Exception{
RDebugUtils.currentModule="ac_tansfer";
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
String _c_f = "";
String _pic = "";
String _statusx = "";
String _isuserx = "";
String _mojodix = "";
RDebugUtils.currentLine=6160384;
 //BA.debugLineNum = 6160384;BA.debugLine="Sub prfn_onPostStringOkListener(Result As String";
RDebugUtils.currentLine=6160385;
 //BA.debugLineNum = 6160385;BA.debugLine="Log(Result)";
anywheresoftware.b4a.keywords.Common.LogImpl("66160385",_result,0);
RDebugUtils.currentLine=6160386;
 //BA.debugLineNum = 6160386;BA.debugLine="Select Tag";
switch (BA.switchObjectToInt(_tag,"iuser","gettele","getinsta","tansfer")) {
case 0: {
RDebugUtils.currentLine=6160388;
 //BA.debugLineNum = 6160388;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 break; }
case 1: {
RDebugUtils.currentLine=6160391;
 //BA.debugLineNum = 6160391;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=6160392;
 //BA.debugLineNum = 6160392;BA.debugLine="parser.Initialize(Result)";
_parser.Initialize(_result);
RDebugUtils.currentLine=6160393;
 //BA.debugLineNum = 6160393;BA.debugLine="Dim root As List = parser.NextArray";
_root = new anywheresoftware.b4a.objects.collections.List();
_root = _parser.NextArray();
RDebugUtils.currentLine=6160394;
 //BA.debugLineNum = 6160394;BA.debugLine="For Each colroot As Map In root";
_colroot = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group9 = _root;
final int groupLen9 = group9.getSize()
;int index9 = 0;
;
for (; index9 < groupLen9;index9++){
_colroot.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group9.Get(index9)));
RDebugUtils.currentLine=6160395;
 //BA.debugLineNum = 6160395;BA.debugLine="Dim Result As String = colroot.Get(\"result\")";
_result = BA.ObjectToString(_colroot.Get((Object)("result")));
RDebugUtils.currentLine=6160396;
 //BA.debugLineNum = 6160396;BA.debugLine="Dim c_m As String = colroot.Get(\"c_m\")";
_c_m = BA.ObjectToString(_colroot.Get((Object)("c_m")));
RDebugUtils.currentLine=6160397;
 //BA.debugLineNum = 6160397;BA.debugLine="Dim uid As String = colroot.Get(\"uid\")";
_uid = BA.ObjectToString(_colroot.Get((Object)("uid")));
RDebugUtils.currentLine=6160398;
 //BA.debugLineNum = 6160398;BA.debugLine="Dim first_last As String = colroot.Get(\"first_";
_first_last = BA.ObjectToString(_colroot.Get((Object)("first_last")));
RDebugUtils.currentLine=6160399;
 //BA.debugLineNum = 6160399;BA.debugLine="Dim id As String = colroot.Get(\"id\")";
_id = BA.ObjectToString(_colroot.Get((Object)("id")));
RDebugUtils.currentLine=6160400;
 //BA.debugLineNum = 6160400;BA.debugLine="Dim userid As String = colroot.Get(\"userid\")";
_userid = BA.ObjectToString(_colroot.Get((Object)("userid")));
RDebugUtils.currentLine=6160401;
 //BA.debugLineNum = 6160401;BA.debugLine="Dim username As String = colroot.Get(\"username";
_username = BA.ObjectToString(_colroot.Get((Object)("username")));
RDebugUtils.currentLine=6160402;
 //BA.debugLineNum = 6160402;BA.debugLine="Dim c_ch As String = colroot.Get(\"c_ch\")";
_c_ch = BA.ObjectToString(_colroot.Get((Object)("c_ch")));
RDebugUtils.currentLine=6160403;
 //BA.debugLineNum = 6160403;BA.debugLine="Dim n_coins=c_m As Long";
_n_coins = (long)(Double.parseDouble(_c_m));
RDebugUtils.currentLine=6160404;
 //BA.debugLineNum = 6160404;BA.debugLine="If n_coins>100 Then";
if (_n_coins>100) { 
RDebugUtils.currentLine=6160405;
 //BA.debugLineNum = 6160405;BA.debugLine="lbl_nums.Text=\"سکه \"&NumberFormat(c_m,3,0)";
mostCurrent._lbl_nums.setText(BA.ObjectToCharSequence("سکه "+anywheresoftware.b4a.keywords.Common.NumberFormat((double)(Double.parseDouble(_c_m)),(int) (3),(int) (0))));
 }else {
RDebugUtils.currentLine=6160407;
 //BA.debugLineNum = 6160407;BA.debugLine="lbl_nums.Text=\"سکه \"&c_m";
mostCurrent._lbl_nums.setText(BA.ObjectToCharSequence("سکه "+_c_m));
 };
RDebugUtils.currentLine=6160411;
 //BA.debugLineNum = 6160411;BA.debugLine="sql1.ExecNonQuery(\"UPDATE tbl_coin set cm='\"&c";
_sql1.ExecNonQuery("UPDATE tbl_coin set cm='"+_c_m+"',cf='"+_c_ch+"' WHERE userid='"+mostCurrent._userid_t+"' ");
 }
};
 break; }
case 2: {
RDebugUtils.currentLine=6160415;
 //BA.debugLineNum = 6160415;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=6160416;
 //BA.debugLineNum = 6160416;BA.debugLine="parser.Initialize(Result)";
_parser.Initialize(_result);
RDebugUtils.currentLine=6160417;
 //BA.debugLineNum = 6160417;BA.debugLine="Dim root As List = parser.NextArray";
_root = new anywheresoftware.b4a.objects.collections.List();
_root = _parser.NextArray();
RDebugUtils.currentLine=6160418;
 //BA.debugLineNum = 6160418;BA.debugLine="For Each colroot As Map In root";
_colroot = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group30 = _root;
final int groupLen30 = group30.getSize()
;int index30 = 0;
;
for (; index30 < groupLen30;index30++){
_colroot.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group30.Get(index30)));
RDebugUtils.currentLine=6160419;
 //BA.debugLineNum = 6160419;BA.debugLine="Dim Result As String = colroot.Get(\"result\")";
_result = BA.ObjectToString(_colroot.Get((Object)("result")));
RDebugUtils.currentLine=6160420;
 //BA.debugLineNum = 6160420;BA.debugLine="Dim c_m As String = colroot.Get(\"c_m\")";
_c_m = BA.ObjectToString(_colroot.Get((Object)("c_m")));
RDebugUtils.currentLine=6160421;
 //BA.debugLineNum = 6160421;BA.debugLine="Dim uid As String = colroot.Get(\"uid\")";
_uid = BA.ObjectToString(_colroot.Get((Object)("uid")));
RDebugUtils.currentLine=6160422;
 //BA.debugLineNum = 6160422;BA.debugLine="Dim id As String = colroot.Get(\"id\")";
_id = BA.ObjectToString(_colroot.Get((Object)("id")));
RDebugUtils.currentLine=6160423;
 //BA.debugLineNum = 6160423;BA.debugLine="Dim c_f As String = colroot.Get(\"c_f\")";
_c_f = BA.ObjectToString(_colroot.Get((Object)("c_f")));
RDebugUtils.currentLine=6160424;
 //BA.debugLineNum = 6160424;BA.debugLine="Dim pic As String = colroot.Get(\"pic\")";
_pic = BA.ObjectToString(_colroot.Get((Object)("pic")));
RDebugUtils.currentLine=6160425;
 //BA.debugLineNum = 6160425;BA.debugLine="Dim userid As String = colroot.Get(\"userid\")";
_userid = BA.ObjectToString(_colroot.Get((Object)("userid")));
RDebugUtils.currentLine=6160426;
 //BA.debugLineNum = 6160426;BA.debugLine="Dim username As String = colroot.Get(\"username";
_username = BA.ObjectToString(_colroot.Get((Object)("username")));
RDebugUtils.currentLine=6160427;
 //BA.debugLineNum = 6160427;BA.debugLine="Log(c_f)";
anywheresoftware.b4a.keywords.Common.LogImpl("66160427",_c_f,0);
RDebugUtils.currentLine=6160428;
 //BA.debugLineNum = 6160428;BA.debugLine="Dim n_coins=c_m As Long";
_n_coins = (long)(Double.parseDouble(_c_m));
RDebugUtils.currentLine=6160429;
 //BA.debugLineNum = 6160429;BA.debugLine="If n_coins>100 Then";
if (_n_coins>100) { 
RDebugUtils.currentLine=6160430;
 //BA.debugLineNum = 6160430;BA.debugLine="lbl_nums.Text=\"سکه \"&NumberFormat(c_m,3,0)";
mostCurrent._lbl_nums.setText(BA.ObjectToCharSequence("سکه "+anywheresoftware.b4a.keywords.Common.NumberFormat((double)(Double.parseDouble(_c_m)),(int) (3),(int) (0))));
 }else {
RDebugUtils.currentLine=6160432;
 //BA.debugLineNum = 6160432;BA.debugLine="lbl_nums.Text=\"سکه \"&c_m";
mostCurrent._lbl_nums.setText(BA.ObjectToCharSequence("سکه "+_c_m));
 };
RDebugUtils.currentLine=6160436;
 //BA.debugLineNum = 6160436;BA.debugLine="sql1.ExecNonQuery(\"UPDATE tbl_coin set cm='\"&c";
_sql1.ExecNonQuery("UPDATE tbl_coin set cm='"+_c_m+"',cf='"+_c_f+"' WHERE userid='"+mostCurrent._i_pk+"' ");
 }
};
 break; }
case 3: {
RDebugUtils.currentLine=6160440;
 //BA.debugLineNum = 6160440;BA.debugLine="progressDialog.Hide";
mostCurrent._progressdialog.Hide();
RDebugUtils.currentLine=6160442;
 //BA.debugLineNum = 6160442;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=6160443;
 //BA.debugLineNum = 6160443;BA.debugLine="parser.Initialize(Result)";
_parser.Initialize(_result);
RDebugUtils.currentLine=6160444;
 //BA.debugLineNum = 6160444;BA.debugLine="Dim root As List = parser.NextArray";
_root = new anywheresoftware.b4a.objects.collections.List();
_root = _parser.NextArray();
RDebugUtils.currentLine=6160445;
 //BA.debugLineNum = 6160445;BA.debugLine="For Each colroot As Map In root";
_colroot = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group53 = _root;
final int groupLen53 = group53.getSize()
;int index53 = 0;
;
for (; index53 < groupLen53;index53++){
_colroot.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group53.Get(index53)));
RDebugUtils.currentLine=6160447;
 //BA.debugLineNum = 6160447;BA.debugLine="Dim statusx As String = colroot.Get(\"status\")";
_statusx = BA.ObjectToString(_colroot.Get((Object)("status")));
RDebugUtils.currentLine=6160448;
 //BA.debugLineNum = 6160448;BA.debugLine="Dim isuserx As String = colroot.Get(\"isuser\")";
_isuserx = BA.ObjectToString(_colroot.Get((Object)("isuser")));
RDebugUtils.currentLine=6160449;
 //BA.debugLineNum = 6160449;BA.debugLine="Dim mojodix As String = colroot.Get(\"mojodi\")";
_mojodix = BA.ObjectToString(_colroot.Get((Object)("mojodi")));
RDebugUtils.currentLine=6160451;
 //BA.debugLineNum = 6160451;BA.debugLine="If isuserx=\"ok\" Then";
if ((_isuserx).equals("ok")) { 
RDebugUtils.currentLine=6160453;
 //BA.debugLineNum = 6160453;BA.debugLine="If mojodix=\"ok\" Then";
if ((_mojodix).equals("ok")) { 
RDebugUtils.currentLine=6160454;
 //BA.debugLineNum = 6160454;BA.debugLine="mtoast.Initialize(\"با موفقیت انتقال یافت\",mt";
mostCurrent._mtoast.Initialize(mostCurrent.activityBA,"با موفقیت انتقال یافت",mostCurrent._mtoast.LENGTH_SHORT,mostCurrent._mtoast.TYPE_SUCCESS);
RDebugUtils.currentLine=6160456;
 //BA.debugLineNum = 6160456;BA.debugLine="Select type_s";
switch (_type_s) {
case 0: {
RDebugUtils.currentLine=6160459;
 //BA.debugLineNum = 6160459;BA.debugLine="Dim c_m As String = colroot.Get(\"c_m\")";
_c_m = BA.ObjectToString(_colroot.Get((Object)("c_m")));
RDebugUtils.currentLine=6160460;
 //BA.debugLineNum = 6160460;BA.debugLine="Dim uid As String = colroot.Get(\"uid\")";
_uid = BA.ObjectToString(_colroot.Get((Object)("uid")));
RDebugUtils.currentLine=6160461;
 //BA.debugLineNum = 6160461;BA.debugLine="Dim id As String = colroot.Get(\"id\")";
_id = BA.ObjectToString(_colroot.Get((Object)("id")));
RDebugUtils.currentLine=6160462;
 //BA.debugLineNum = 6160462;BA.debugLine="Dim c_f As String = colroot.Get(\"c_f\")";
_c_f = BA.ObjectToString(_colroot.Get((Object)("c_f")));
RDebugUtils.currentLine=6160463;
 //BA.debugLineNum = 6160463;BA.debugLine="Dim pic As String = colroot.Get(\"pic\")";
_pic = BA.ObjectToString(_colroot.Get((Object)("pic")));
RDebugUtils.currentLine=6160464;
 //BA.debugLineNum = 6160464;BA.debugLine="Dim userid As String = colroot.Get(\"userid";
_userid = BA.ObjectToString(_colroot.Get((Object)("userid")));
RDebugUtils.currentLine=6160465;
 //BA.debugLineNum = 6160465;BA.debugLine="Dim username As String = colroot.Get(\"user";
_username = BA.ObjectToString(_colroot.Get((Object)("username")));
RDebugUtils.currentLine=6160466;
 //BA.debugLineNum = 6160466;BA.debugLine="Log(c_f)";
anywheresoftware.b4a.keywords.Common.LogImpl("66160466",_c_f,0);
RDebugUtils.currentLine=6160467;
 //BA.debugLineNum = 6160467;BA.debugLine="Dim n_coins=c_m As Long";
_n_coins = (long)(Double.parseDouble(_c_m));
RDebugUtils.currentLine=6160468;
 //BA.debugLineNum = 6160468;BA.debugLine="If n_coins>100 Then";
if (_n_coins>100) { 
RDebugUtils.currentLine=6160469;
 //BA.debugLineNum = 6160469;BA.debugLine="lbl_nums.Text=\"سکه \"&NumberFormat(c_m,3,0";
mostCurrent._lbl_nums.setText(BA.ObjectToCharSequence("سکه "+anywheresoftware.b4a.keywords.Common.NumberFormat((double)(Double.parseDouble(_c_m)),(int) (3),(int) (0))));
 }else {
RDebugUtils.currentLine=6160471;
 //BA.debugLineNum = 6160471;BA.debugLine="lbl_nums.Text=\"سکه \"&c_m";
mostCurrent._lbl_nums.setText(BA.ObjectToCharSequence("سکه "+_c_m));
 };
RDebugUtils.currentLine=6160473;
 //BA.debugLineNum = 6160473;BA.debugLine="sql1.ExecNonQuery(\"UPDATE tbl_coin set cm=";
_sql1.ExecNonQuery("UPDATE tbl_coin set cm='"+_c_m+"',cf='"+_c_f+"' WHERE userid='"+mostCurrent._i_pk+"' ");
 break; }
case 1: {
RDebugUtils.currentLine=6160478;
 //BA.debugLineNum = 6160478;BA.debugLine="Dim c_m As String = colroot.Get(\"c_m\")";
_c_m = BA.ObjectToString(_colroot.Get((Object)("c_m")));
RDebugUtils.currentLine=6160479;
 //BA.debugLineNum = 6160479;BA.debugLine="Dim uid As String = colroot.Get(\"uid\")";
_uid = BA.ObjectToString(_colroot.Get((Object)("uid")));
RDebugUtils.currentLine=6160480;
 //BA.debugLineNum = 6160480;BA.debugLine="Dim first_last As String = colroot.Get(\"fi";
_first_last = BA.ObjectToString(_colroot.Get((Object)("first_last")));
RDebugUtils.currentLine=6160481;
 //BA.debugLineNum = 6160481;BA.debugLine="Dim id As String = colroot.Get(\"id\")";
_id = BA.ObjectToString(_colroot.Get((Object)("id")));
RDebugUtils.currentLine=6160482;
 //BA.debugLineNum = 6160482;BA.debugLine="Dim userid As String = colroot.Get(\"userid";
_userid = BA.ObjectToString(_colroot.Get((Object)("userid")));
RDebugUtils.currentLine=6160483;
 //BA.debugLineNum = 6160483;BA.debugLine="Dim username As String = colroot.Get(\"user";
_username = BA.ObjectToString(_colroot.Get((Object)("username")));
RDebugUtils.currentLine=6160484;
 //BA.debugLineNum = 6160484;BA.debugLine="Dim c_ch As String = colroot.Get(\"c_ch\")";
_c_ch = BA.ObjectToString(_colroot.Get((Object)("c_ch")));
RDebugUtils.currentLine=6160485;
 //BA.debugLineNum = 6160485;BA.debugLine="Dim n_coins=c_m As Long";
_n_coins = (long)(Double.parseDouble(_c_m));
RDebugUtils.currentLine=6160486;
 //BA.debugLineNum = 6160486;BA.debugLine="If n_coins>100 Then";
if (_n_coins>100) { 
RDebugUtils.currentLine=6160487;
 //BA.debugLineNum = 6160487;BA.debugLine="lbl_nums.Text=\"سکه \"&NumberFormat(c_m,3,0";
mostCurrent._lbl_nums.setText(BA.ObjectToCharSequence("سکه "+anywheresoftware.b4a.keywords.Common.NumberFormat((double)(Double.parseDouble(_c_m)),(int) (3),(int) (0))));
 }else {
RDebugUtils.currentLine=6160489;
 //BA.debugLineNum = 6160489;BA.debugLine="lbl_nums.Text=\"سکه \"&c_m";
mostCurrent._lbl_nums.setText(BA.ObjectToCharSequence("سکه "+_c_m));
 };
RDebugUtils.currentLine=6160492;
 //BA.debugLineNum = 6160492;BA.debugLine="sql1.ExecNonQuery(\"UPDATE tbl_coin set cm=";
_sql1.ExecNonQuery("UPDATE tbl_coin set cm='"+_c_m+"',cf='"+_c_ch+"' WHERE userid='"+mostCurrent._userid_t+"' ");
 break; }
}
;
 }else {
RDebugUtils.currentLine=6160499;
 //BA.debugLineNum = 6160499;BA.debugLine="mtoast.Initialize(\"تعداد سکه های انتخابی بیش";
mostCurrent._mtoast.Initialize(mostCurrent.activityBA,"تعداد سکه های انتخابی بیشتر از موجودی شماست",mostCurrent._mtoast.LENGTH_LONG,mostCurrent._mtoast.TYPE_WARNING);
 };
 }else {
RDebugUtils.currentLine=6160505;
 //BA.debugLineNum = 6160505;BA.debugLine="mtoast.Initialize(\"کاربر مورد نظر یافت نشد!\"";
mostCurrent._mtoast.Initialize(mostCurrent.activityBA,"کاربر مورد نظر یافت نشد!",mostCurrent._mtoast.LENGTH_SHORT,mostCurrent._mtoast.TYPE_INFO);
 };
 }
};
 break; }
}
;
RDebugUtils.currentLine=6160513;
 //BA.debugLineNum = 6160513;BA.debugLine="End Sub";
return "";
}
}