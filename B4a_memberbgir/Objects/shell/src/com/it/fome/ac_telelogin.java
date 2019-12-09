
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

public class ac_telelogin implements IRemote{
	public static ac_telelogin mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public ac_telelogin() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("ac_telelogin"), "com.it.fome.ac_telelogin");
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
		pcBA = new PCBA(this, ac_telelogin.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _sql1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL");
public static RemoteObject _cursor1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
public static RemoteObject _telegs = RemoteObject.declareNull("com.mili.telegrams.teleg_warp");
public static RemoteObject _button1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _imageview1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _glide = RemoteObject.declareNull("com.glide.transformation.Hitex_GlideTransformation");
public static RemoteObject _ii = RemoteObject.createImmutable(0);
public static RemoteObject _chatids = RemoteObject.createImmutable(0L);
public static RemoteObject _enc_key_length = RemoteObject.createImmutable(0);
public static RemoteObject _byteconv = RemoteObject.declareNull("anywheresoftware.b4a.agraham.byteconverter.ByteConverter");
public static RemoteObject _stringutils1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.StringUtils");
public static RemoteObject _bconv = RemoteObject.declareNull("anywheresoftware.b4a.agraham.byteconverter.ByteConverter");
public static RemoteObject _username = RemoteObject.createImmutable("");
public static RemoteObject _password = RemoteObject.createImmutable("");
public static RemoteObject _server = RemoteObject.createImmutable("");
public static RemoteObject _ports = RemoteObject.createImmutable(0);
public static RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _lbl_neme = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _login = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _edit_pish = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _edit_number = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _edit_code = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _edit_pass = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _userid_t = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _username_t = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _btn_code = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btn_pass = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _lbl_st = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbl_shabake = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _sta_conn = RemoteObject.createImmutable("");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static com.it.fome.main _main = null;
public static com.it.fome.ac_shop _ac_shop = null;
public static com.it.fome.ac_tansfer _ac_tansfer = null;
public static com.it.fome.firebasemessaging _firebasemessaging = null;
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
		return new Object[] {"ac_home",Debug.moduleToString(com.it.fome.ac_home.class),"ac_hsef",Debug.moduleToString(com.it.fome.ac_hsef.class),"ac_lchats",Debug.moduleToString(com.it.fome.ac_lchats.class),"ac_shop",Debug.moduleToString(com.it.fome.ac_shop.class),"ac_tansfer",Debug.moduleToString(com.it.fome.ac_tansfer.class),"ac_tcoin",Debug.moduleToString(com.it.fome.ac_tcoin.class),"ac_tfreecoin",Debug.moduleToString(com.it.fome.ac_tfreecoin.class),"ac_tsearch",Debug.moduleToString(com.it.fome.ac_tsearch.class),"ac_tselect",Debug.moduleToString(com.it.fome.ac_tselect.class),"Act_Chat",Debug.moduleToString(com.it.fome.act_chat.class),"Activity",ac_telelogin.mostCurrent._activity,"bconv",ac_telelogin.mostCurrent._bconv,"btn_code",ac_telelogin.mostCurrent._btn_code,"btn_pass",ac_telelogin.mostCurrent._btn_pass,"Button1",ac_telelogin.mostCurrent._button1,"ByteConv",ac_telelogin.mostCurrent._byteconv,"chatids",ac_telelogin._chatids,"cursor1",ac_telelogin._cursor1,"DateUtils",ac_telelogin.mostCurrent._dateutils,"edit_code",ac_telelogin.mostCurrent._edit_code,"edit_number",ac_telelogin.mostCurrent._edit_number,"edit_pass",ac_telelogin.mostCurrent._edit_pass,"edit_pish",ac_telelogin.mostCurrent._edit_pish,"ENC_KEY_LENGTH",ac_telelogin._enc_key_length,"FirebaseMessaging",Debug.moduleToString(com.it.fome.firebasemessaging.class),"glide",ac_telelogin.mostCurrent._glide,"ii",ac_telelogin._ii,"ImageView1",ac_telelogin.mostCurrent._imageview1,"lbl_neme",ac_telelogin.mostCurrent._lbl_neme,"lbl_shabake",ac_telelogin.mostCurrent._lbl_shabake,"lbl_st",ac_telelogin.mostCurrent._lbl_st,"login",ac_telelogin.mostCurrent._login,"Main",Debug.moduleToString(com.it.fome.main.class),"p",ac_telelogin.mostCurrent._p,"password",ac_telelogin.mostCurrent._password,"ports",ac_telelogin._ports,"server",ac_telelogin.mostCurrent._server,"sql1",ac_telelogin._sql1,"sta_conn",ac_telelogin.mostCurrent._sta_conn,"Starter",Debug.moduleToString(com.it.fome.starter.class),"StringUtils1",ac_telelogin.mostCurrent._stringutils1,"telegs",ac_telelogin.mostCurrent._telegs,"userid_t",ac_telelogin.mostCurrent._userid_t,"username",ac_telelogin.mostCurrent._username,"username_t",ac_telelogin.mostCurrent._username_t};
}
}