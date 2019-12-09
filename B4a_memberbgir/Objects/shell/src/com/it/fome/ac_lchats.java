
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

public class ac_lchats implements IRemote{
	public static ac_lchats mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public ac_lchats() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("ac_lchats"), "com.it.fome.ac_lchats");
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
		pcBA = new PCBA(this, ac_lchats.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _listchats = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _telegs = RemoteObject.declareNull("com.mili.telegrams.teleg_warp");
public static RemoteObject _sql1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL");
public static RemoteObject _cursor1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
public static RemoteObject _username_t = RemoteObject.createImmutable("");
public static RemoteObject _userid_t = RemoteObject.createImmutable("");
public static RemoteObject _chatid = RemoteObject.createImmutable("");
public static RemoteObject _meno = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _pnl_coins = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _lbl_icon = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbl_nums = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _roundview = RemoteObject.declareNull("com.flycoroundview.mc7.MC7RoundView");
public static RemoteObject _lv = RemoteObject.declareNull("wir.hitex.recycler.Hitex_LayoutView");
public static RemoteObject _glide = RemoteObject.declareNull("com.hitex_glide.Hitex_Glide");
public static RemoteObject _pnl_lv = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _pnl_dilogs = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _username_target = RemoteObject.createImmutable("");
public static RemoteObject _title_target = RemoteObject.createImmutable("");
public static RemoteObject _id_target = RemoteObject.createImmutable("");
public static RemoteObject _idchannel_target = RemoteObject.createImmutable("");
public static RemoteObject _img_target = RemoteObject.createImmutable("");
public static RemoteObject _mimeno = RemoteObject.declareNull("com.it.fome.mi_meno");
public static RemoteObject _us_name = RemoteObject.createImmutable("");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static com.it.fome.main _main = null;
public static com.it.fome.ac_telelogin _ac_telelogin = null;
public static com.it.fome.ac_shop _ac_shop = null;
public static com.it.fome.ac_tansfer _ac_tansfer = null;
public static com.it.fome.firebasemessaging _firebasemessaging = null;
public static com.it.fome.ac_tselect _ac_tselect = null;
public static com.it.fome.ac_tfreecoin _ac_tfreecoin = null;
public static com.it.fome.ac_hsef _ac_hsef = null;
public static com.it.fome.ac_tsearch _ac_tsearch = null;
public static com.it.fome.ac_tcoin _ac_tcoin = null;
public static com.it.fome.ac_home _ac_home = null;
public static com.it.fome.act_chat _act_chat = null;
public static com.it.fome.starter _starter = null;
  public Object[] GetGlobals() {
		return new Object[] {"ac_home",Debug.moduleToString(com.it.fome.ac_home.class),"ac_hsef",Debug.moduleToString(com.it.fome.ac_hsef.class),"ac_shop",Debug.moduleToString(com.it.fome.ac_shop.class),"ac_tansfer",Debug.moduleToString(com.it.fome.ac_tansfer.class),"ac_tcoin",Debug.moduleToString(com.it.fome.ac_tcoin.class),"ac_telelogin",Debug.moduleToString(com.it.fome.ac_telelogin.class),"ac_tfreecoin",Debug.moduleToString(com.it.fome.ac_tfreecoin.class),"ac_tsearch",Debug.moduleToString(com.it.fome.ac_tsearch.class),"ac_tselect",Debug.moduleToString(com.it.fome.ac_tselect.class),"Act_Chat",Debug.moduleToString(com.it.fome.act_chat.class),"Activity",ac_lchats.mostCurrent._activity,"chatid",ac_lchats._chatid,"cursor1",ac_lchats._cursor1,"DateUtils",ac_lchats.mostCurrent._dateutils,"FirebaseMessaging",Debug.moduleToString(com.it.fome.firebasemessaging.class),"glide",ac_lchats.mostCurrent._glide,"id_target",ac_lchats.mostCurrent._id_target,"idchannel_target",ac_lchats.mostCurrent._idchannel_target,"img_target",ac_lchats.mostCurrent._img_target,"lbl_icon",ac_lchats.mostCurrent._lbl_icon,"lbl_nums",ac_lchats.mostCurrent._lbl_nums,"listchats",ac_lchats._listchats,"LV",ac_lchats.mostCurrent._lv,"Main",Debug.moduleToString(com.it.fome.main.class),"meno",ac_lchats.mostCurrent._meno,"mimeno",ac_lchats.mostCurrent._mimeno,"pnl_coins",ac_lchats.mostCurrent._pnl_coins,"pnl_dilogs",ac_lchats.mostCurrent._pnl_dilogs,"pnl_lv",ac_lchats.mostCurrent._pnl_lv,"roundview",ac_lchats.mostCurrent._roundview,"sql1",ac_lchats._sql1,"Starter",Debug.moduleToString(com.it.fome.starter.class),"telegs",ac_lchats._telegs,"title_target",ac_lchats.mostCurrent._title_target,"us_name",ac_lchats.mostCurrent._us_name,"userid_t",ac_lchats._userid_t,"username_t",ac_lchats._username_t,"username_target",ac_lchats.mostCurrent._username_target};
}
}