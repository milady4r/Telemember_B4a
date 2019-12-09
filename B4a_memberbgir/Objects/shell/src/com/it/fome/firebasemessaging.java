
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

public class firebasemessaging implements IRemote{
	public static firebasemessaging mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public firebasemessaging() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("firebasemessaging"), "com.it.fome.firebasemessaging");
	}
     public static RemoteObject getObject() {
		return myClass;
	 }
	public RemoteObject _service;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
        _service = (RemoteObject) args[2];
        remoteMe = RemoteObject.declareNull("com.it.fome.firebasemessaging");
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[3];
		pcBA = new PCBA(this, firebasemessaging.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _fm = RemoteObject.declareNull("anywheresoftware.b4a.objects.FirebaseNotificationsService.FirebaseMessageWrapper");
public static RemoteObject _medialid = RemoteObject.createImmutable("");
public static RemoteObject _lusername = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _sql1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL");
public static RemoteObject _cursor1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
public static RemoteObject _s_userid = RemoteObject.createImmutable("");
public static RemoteObject _s_cookie = RemoteObject.createImmutable("");
public static RemoteObject _s_username = RemoteObject.createImmutable("");
public static RemoteObject _prfn = RemoteObject.declareNull("com.reza.sh.fastnet.Fastnet");
public static RemoteObject _token_sef = RemoteObject.createImmutable("");
public static RemoteObject _type_sef = RemoteObject.createImmutable("");
public static RemoteObject _id_job = RemoteObject.createImmutable("");
public static RemoteObject _userid_sef = RemoteObject.createImmutable("");
public static RemoteObject _media_idsef = RemoteObject.createImmutable("");
public static RemoteObject _id_sef = RemoteObject.createImmutable("");
public static RemoteObject _comtex = RemoteObject.createImmutable("");
public static RemoteObject _hc = RemoteObject.declareNull("anywheresoftware.b4h.okhttp.OkHttpClientWrapper");
public static RemoteObject _req = RemoteObject.declareNull("anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest");
public static RemoteObject _telegs = RemoteObject.declareNull("com.mili.telegrams.teleg_warp");
public static RemoteObject _username_t = RemoteObject.createImmutable("");
public static RemoteObject _userid_t = RemoteObject.createImmutable("");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static com.it.fome.main _main = null;
public static com.it.fome.ac_telelogin _ac_telelogin = null;
public static com.it.fome.ac_shop _ac_shop = null;
public static com.it.fome.ac_tansfer _ac_tansfer = null;
public static com.it.fome.ac_tselect _ac_tselect = null;
public static com.it.fome.ac_lchats _ac_lchats = null;
public static com.it.fome.ac_tfreecoin _ac_tfreecoin = null;
public static com.it.fome.ac_hsef _ac_hsef = null;
public static com.it.fome.ac_tsearch _ac_tsearch = null;
public static com.it.fome.ac_tcoin _ac_tcoin = null;
public static com.it.fome.ac_home _ac_home = null;
public static com.it.fome.act_chat _act_chat = null;
public static com.it.fome.starter _starter = null;
  public Object[] GetGlobals() {
		return new Object[] {"ac_home",Debug.moduleToString(com.it.fome.ac_home.class),"ac_hsef",Debug.moduleToString(com.it.fome.ac_hsef.class),"ac_lchats",Debug.moduleToString(com.it.fome.ac_lchats.class),"ac_shop",Debug.moduleToString(com.it.fome.ac_shop.class),"ac_tansfer",Debug.moduleToString(com.it.fome.ac_tansfer.class),"ac_tcoin",Debug.moduleToString(com.it.fome.ac_tcoin.class),"ac_telelogin",Debug.moduleToString(com.it.fome.ac_telelogin.class),"ac_tfreecoin",Debug.moduleToString(com.it.fome.ac_tfreecoin.class),"ac_tsearch",Debug.moduleToString(com.it.fome.ac_tsearch.class),"ac_tselect",Debug.moduleToString(com.it.fome.ac_tselect.class),"Act_Chat",Debug.moduleToString(com.it.fome.act_chat.class),"comtex",firebasemessaging._comtex,"cursor1",firebasemessaging._cursor1,"DateUtils",firebasemessaging.mostCurrent._dateutils,"fm",firebasemessaging._fm,"hc",firebasemessaging._hc,"id_job",firebasemessaging._id_job,"id_sef",firebasemessaging._id_sef,"lusername",firebasemessaging._lusername,"Main",Debug.moduleToString(com.it.fome.main.class),"media_idsef",firebasemessaging._media_idsef,"medialid",firebasemessaging._medialid,"prfn",firebasemessaging._prfn,"req",firebasemessaging._req,"s_cookie",firebasemessaging._s_cookie,"s_userid",firebasemessaging._s_userid,"s_username",firebasemessaging._s_username,"Service",firebasemessaging.mostCurrent._service,"sql1",firebasemessaging._sql1,"Starter",Debug.moduleToString(com.it.fome.starter.class),"telegs",firebasemessaging._telegs,"token_sef",firebasemessaging._token_sef,"type_sef",firebasemessaging._type_sef,"userid_sef",firebasemessaging._userid_sef,"userid_t",firebasemessaging._userid_t,"username_t",firebasemessaging._username_t};
}
}