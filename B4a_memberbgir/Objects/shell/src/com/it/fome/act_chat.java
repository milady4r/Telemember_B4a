
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

public class act_chat implements IRemote{
	public static act_chat mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public act_chat() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("act_chat"), "com.it.fome.act_chat");
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
		pcBA = new PCBA(this, act_chat.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _timer = RemoteObject.declareNull("anywheresoftware.b4a.objects.Timer");
public static RemoteObject _timer2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.Timer");
public static RemoteObject _tm = RemoteObject.declareNull("anywheresoftware.b4a.objects.Timer");
public static RemoteObject _mine = RemoteObject.createImmutable(0);
public static RemoteObject _their = RemoteObject.createImmutable(0);
public static RemoteObject _minest = RemoteObject.createImmutable(0);
public static RemoteObject _minest2 = RemoteObject.createImmutable(0);
public static RemoteObject _videome = RemoteObject.createImmutable(0);
public static RemoteObject _videothire = RemoteObject.createImmutable(0);
public static RemoteObject _imagename = RemoteObject.createImmutable("");
public static RemoteObject _name = RemoteObject.createImmutable("");
public static RemoteObject _msg = null;
public static RemoteObject _name_chat = RemoteObject.createImmutable("");
public static RemoteObject _chat_id = RemoteObject.createImmutable("");
public static RemoteObject _numcoins = RemoteObject.createImmutable("");
public static RemoteObject _numfinish = RemoteObject.createImmutable("");
public static RemoteObject _channelid = RemoteObject.createImmutable("");
public static RemoteObject _imgchat = RemoteObject.createImmutable("");
public static RemoteObject _list_dl = RemoteObject.createImmutable("");
public static RemoteObject _sql1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL");
public static RemoteObject _cursor1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
public static RemoteObject _us_name = RemoteObject.createImmutable("");
public static RemoteObject _telegs = RemoteObject.declareNull("com.mili.telegrams.teleg_warp");
public static RemoteObject _progressdialog = RemoteObject.declareNull("de.amberhome.materialdialogs.MaterialDialogWrapper");
public static RemoteObject _upl = RemoteObject.declareNull("com.reza.sh.fastnet.UploadRequest");
public static RemoteObject _pr = RemoteObject.declareNull("com.reza.sh.fastnet.Fastnet");
public static RemoteObject _lv = RemoteObject.declareNull("wir.hitex.recycler.Hitex_LayoutView");
public static RemoteObject _re = RemoteObject.declareNull("ir.hitex.reveallayout.Hitex_RevealLayout");
public static RemoteObject _edittext = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _btnsend = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _btnatt = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _mic = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _stic = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _itemlist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _xml = RemoteObject.declareNull("anywheresoftware.b4a.object.XmlLayoutBuilder");
public static RemoteObject _appcompat = RemoteObject.declareNull("de.amberhome.objects.appcompat.AppCompatBase");
public static RemoteObject _toolbar = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _status = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _height = RemoteObject.createImmutable(0);
public static RemoteObject _canvas = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper");
public static RemoteObject _font = RemoteObject.declareNull("anywheresoftware.b4a.keywords.constants.TypefaceWrapper");
public static RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
public static RemoteObject _glide = RemoteObject.declareNull("com.hitex_glide.Hitex_Glide");
public static RemoteObject _pan = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _strutil = RemoteObject.declareNull("anywheresoftware.b4a.objects.StringUtils");
public static RemoteObject _ht = RemoteObject.createImmutable(0f);
public static RemoteObject _an = RemoteObject.declareNull("anywheresoftware.b4a.objects.AnimationWrapper");
public static RemoteObject _ime = RemoteObject.declareNull("anywheresoftware.b4a.objects.IME");
public static RemoteObject _q = RemoteObject.createImmutable(0);
public static RemoteObject _q2 = RemoteObject.createImmutable(0);
public static RemoteObject _top = RemoteObject.createImmutable(0);
public static RemoteObject _sho = RemoteObject.createImmutable(false);
public static RemoteObject _stp = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _username_t = RemoteObject.createImmutable("");
public static RemoteObject _userid_t = RemoteObject.createImmutable("");
public static RemoteObject _msg_id_select = RemoteObject.createImmutable("");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static com.it.fome.main _main = null;
public static com.it.fome.ac_telelogin _ac_telelogin = null;
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
public static com.it.fome.starter _starter = null;
  public Object[] GetGlobals() {
		return new Object[] {"ac_home",Debug.moduleToString(com.it.fome.ac_home.class),"ac_hsef",Debug.moduleToString(com.it.fome.ac_hsef.class),"ac_lchats",Debug.moduleToString(com.it.fome.ac_lchats.class),"ac_shop",Debug.moduleToString(com.it.fome.ac_shop.class),"ac_tansfer",Debug.moduleToString(com.it.fome.ac_tansfer.class),"ac_tcoin",Debug.moduleToString(com.it.fome.ac_tcoin.class),"ac_telelogin",Debug.moduleToString(com.it.fome.ac_telelogin.class),"ac_tfreecoin",Debug.moduleToString(com.it.fome.ac_tfreecoin.class),"ac_tsearch",Debug.moduleToString(com.it.fome.ac_tsearch.class),"ac_tselect",Debug.moduleToString(com.it.fome.ac_tselect.class),"Activity",act_chat.mostCurrent._activity,"an",act_chat.mostCurrent._an,"AppCompat",act_chat.mostCurrent._appcompat,"Btnatt",act_chat.mostCurrent._btnatt,"BtnSend",act_chat.mostCurrent._btnsend,"Canvas",act_chat.mostCurrent._canvas,"channelid",act_chat._channelid,"chat_id",act_chat._chat_id,"cursor1",act_chat._cursor1,"DateUtils",act_chat.mostCurrent._dateutils,"EditText",act_chat.mostCurrent._edittext,"FirebaseMessaging",Debug.moduleToString(com.it.fome.firebasemessaging.class),"Font",act_chat.mostCurrent._font,"Glide",act_chat.mostCurrent._glide,"Height",act_chat._height,"ht",act_chat._ht,"IMAGENAME",act_chat._imagename,"IME",act_chat.mostCurrent._ime,"imgchat",act_chat._imgchat,"ItemList",act_chat.mostCurrent._itemlist,"list_dl",act_chat._list_dl,"LV",act_chat.mostCurrent._lv,"Main",Debug.moduleToString(com.it.fome.main.class),"Mic",act_chat.mostCurrent._mic,"MINE",act_chat._mine,"MINEST",act_chat._minest,"MINEST2",act_chat._minest2,"msg",act_chat._msg,"msg_id_select",act_chat.mostCurrent._msg_id_select,"NAME",act_chat._name,"name_chat",act_chat._name_chat,"numcoins",act_chat._numcoins,"numfinish",act_chat._numfinish,"Pan",act_chat.mostCurrent._pan,"pr",act_chat.mostCurrent._pr,"progressDialog",act_chat.mostCurrent._progressdialog,"q",act_chat._q,"q2",act_chat._q2,"re",act_chat.mostCurrent._re,"SB",act_chat.mostCurrent._sb,"sho",act_chat._sho,"sql1",act_chat._sql1,"Starter",Debug.moduleToString(com.it.fome.starter.class),"Status",act_chat.mostCurrent._status,"Stic",act_chat.mostCurrent._stic,"stp",act_chat.mostCurrent._stp,"StrUtil",act_chat.mostCurrent._strutil,"telegs",act_chat.mostCurrent._telegs,"Their",act_chat._their,"Timer",act_chat._timer,"Timer2",act_chat._timer2,"tm",act_chat._tm,"Toolbar",act_chat.mostCurrent._toolbar,"Top",act_chat._top,"upl",act_chat.mostCurrent._upl,"us_name",act_chat._us_name,"userid_t",act_chat.mostCurrent._userid_t,"username_t",act_chat.mostCurrent._username_t,"VIDEOME",act_chat._videome,"VIDEOthire",act_chat._videothire,"XML",act_chat.mostCurrent._xml};
}
}