
package com.it.fome;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class ac_tfreecoin implements IRemote{
	public static ac_tfreecoin mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public ac_tfreecoin() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
	public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("ac_tfreecoin"), "com.it.fome.ac_tfreecoin");
	}

public boolean isSingleton() {
		return true;
	}
     public static RemoteObject getObject() {
		return myClass;
	 }

	public RemoteObject activityBA;
	public RemoteObject _activity;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
		activityBA = (RemoteObject) args[2];
		_activity = (RemoteObject) args[3];
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[4];
        remoteMe = (RemoteObject) args[5];
		pcBA = new PCBA(this, ac_tfreecoin.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _sql1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL");
public static RemoteObject _cursor1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
public static RemoteObject _type_done = RemoteObject.createImmutable(0);
public static RemoteObject _meno = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _pnl_coins = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _lbl_icon = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbl_nums = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _roundview = RemoteObject.declareNull("com.flycoroundview.mc7.MC7RoundView");
public static RemoteObject _lv = RemoteObject.declareNull("wir.hitex.recycler.Hitex_LayoutView");
public static RemoteObject _glide = RemoteObject.declareNull("com.hitex_glide.Hitex_Glide");
public static RemoteObject _i_username = RemoteObject.createImmutable("");
public static RemoteObject _i_pk = RemoteObject.createImmutable("");
public static RemoteObject _i_cookie = RemoteObject.createImmutable("");
public static RemoteObject _i_pic = RemoteObject.createImmutable("");
public static RemoteObject _list_like = null;
public static RemoteObject _list_com = null;
public static RemoteObject _list_follow = null;
public static RemoteObject _nll = RemoteObject.createImmutable(0);
public static RemoteObject _ncc = RemoteObject.createImmutable(0);
public static RemoteObject _nff = RemoteObject.createImmutable(0);
public static RemoteObject _cm = RemoteObject.createImmutable("");
public static RemoteObject _img_target = RemoteObject.declareNull("com.hitex_glide.Hitex_ImageView");
public static RemoteObject _posi = RemoteObject.createImmutable(0);
public static RemoteObject _username_t = RemoteObject.createImmutable("");
public static RemoteObject _userid_t = RemoteObject.createImmutable("");
public static RemoteObject _mimeno = RemoteObject.declareNull("com.it.fome.mi_meno");
public static RemoteObject _telegs = RemoteObject.declareNull("com.mili.telegrams.teleg_warp");
public static RemoteObject _webview1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.WebViewWrapper");
public static RemoteObject _webviewextras1 = RemoteObject.declareNull("uk.co.martinpearman.b4a.webkit.WebViewExtras");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static com.it.fome.main _main = null;
public static com.it.fome.ac_telelogin _ac_telelogin = null;
public static com.it.fome.ac_shop _ac_shop = null;
public static com.it.fome.ac_tansfer _ac_tansfer = null;
public static com.it.fome.firebasemessaging _firebasemessaging = null;
public static com.it.fome.ac_tselect _ac_tselect = null;
public static com.it.fome.ac_lchats _ac_lchats = null;
public static com.it.fome.ac_hsef _ac_hsef = null;
public static com.it.fome.ac_tsearch _ac_tsearch = null;
public static com.it.fome.ac_tcoin _ac_tcoin = null;
public static com.it.fome.ac_home _ac_home = null;
public static com.it.fome.act_chat _act_chat = null;
public static com.it.fome.starter _starter = null;
  public Object[] GetGlobals() {
		return new Object[] {"ac_home",Debug.moduleToString(com.it.fome.ac_home.class),"ac_hsef",Debug.moduleToString(com.it.fome.ac_hsef.class),"ac_lchats",Debug.moduleToString(com.it.fome.ac_lchats.class),"ac_shop",Debug.moduleToString(com.it.fome.ac_shop.class),"ac_tansfer",Debug.moduleToString(com.it.fome.ac_tansfer.class),"ac_tcoin",Debug.moduleToString(com.it.fome.ac_tcoin.class),"ac_telelogin",Debug.moduleToString(com.it.fome.ac_telelogin.class),"ac_tsearch",Debug.moduleToString(com.it.fome.ac_tsearch.class),"ac_tselect",Debug.moduleToString(com.it.fome.ac_tselect.class),"Act_Chat",Debug.moduleToString(com.it.fome.act_chat.class),"Activity",ac_tfreecoin.mostCurrent._activity,"cm",ac_tfreecoin.mostCurrent._cm,"cursor1",ac_tfreecoin._cursor1,"DateUtils",ac_tfreecoin.mostCurrent._dateutils,"FirebaseMessaging",Debug.moduleToString(com.it.fome.firebasemessaging.class),"glide",ac_tfreecoin.mostCurrent._glide,"i_cookie",ac_tfreecoin.mostCurrent._i_cookie,"i_pic",ac_tfreecoin.mostCurrent._i_pic,"i_pk",ac_tfreecoin.mostCurrent._i_pk,"i_username",ac_tfreecoin.mostCurrent._i_username,"img_target",ac_tfreecoin.mostCurrent._img_target,"lbl_icon",ac_tfreecoin.mostCurrent._lbl_icon,"lbl_nums",ac_tfreecoin.mostCurrent._lbl_nums,"list_com",ac_tfreecoin.mostCurrent._list_com,"list_follow",ac_tfreecoin.mostCurrent._list_follow,"list_like",ac_tfreecoin.mostCurrent._list_like,"LV",ac_tfreecoin.mostCurrent._lv,"Main",Debug.moduleToString(com.it.fome.main.class),"meno",ac_tfreecoin.mostCurrent._meno,"mimeno",ac_tfreecoin.mostCurrent._mimeno,"ncc",ac_tfreecoin._ncc,"nff",ac_tfreecoin._nff,"nll",ac_tfreecoin._nll,"pnl_coins",ac_tfreecoin.mostCurrent._pnl_coins,"posi",ac_tfreecoin._posi,"roundview",ac_tfreecoin.mostCurrent._roundview,"sql1",ac_tfreecoin._sql1,"Starter",Debug.moduleToString(com.it.fome.starter.class),"telegs",ac_tfreecoin.mostCurrent._telegs,"type_done",ac_tfreecoin._type_done,"userid_t",ac_tfreecoin.mostCurrent._userid_t,"username_t",ac_tfreecoin.mostCurrent._username_t,"WebView1",ac_tfreecoin.mostCurrent._webview1,"WebViewExtras1",ac_tfreecoin.mostCurrent._webviewextras1};
}
}