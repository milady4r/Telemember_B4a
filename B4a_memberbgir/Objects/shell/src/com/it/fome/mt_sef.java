
package com.it.fome;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class mt_sef {
    public static RemoteObject myClass;
	public mt_sef() {
	}
    public static PCBA staticBA = new PCBA(null, mt_sef.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _ev = RemoteObject.createImmutable("");
public static RemoteObject _obj = RemoteObject.declareNull("Object");
public static RemoteObject _sql1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL");
public static RemoteObject _cursor1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
public static RemoteObject _pnl_tolbar = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _lv = RemoteObject.declareNull("wir.hitex.recycler.Hitex_LayoutView");
public static RemoteObject _glide = RemoteObject.declareNull("com.hitex_glide.Hitex_Glide");
public static RemoteObject _prfn = RemoteObject.declareNull("com.reza.sh.fastnet.Fastnet");
public static RemoteObject _i_username = RemoteObject.createImmutable("");
public static RemoteObject _i_pk = RemoteObject.createImmutable("");
public static RemoteObject _i_cookie = RemoteObject.createImmutable("");
public static RemoteObject _i_pic = RemoteObject.createImmutable("");
public static RemoteObject _pnl_main = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _type_sef = RemoteObject.createImmutable(0);
public static RemoteObject _roundview = RemoteObject.declareNull("com.flycoroundview.mc7.MC7RoundView");
public static RemoteObject _pnl_posts = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _upl = RemoteObject.declareNull("com.reza.sh.fastnet.UploadRequest");
public static RemoteObject _pr = RemoteObject.declareNull("com.reza.sh.fastnet.Fastnet");
public static RemoteObject _list_f = null;
public static RemoteObject _list_l = null;
public static RemoteObject _list_v = null;
public static RemoteObject _list_c = null;
public static RemoteObject _str_name = RemoteObject.createImmutable("");
public static RemoteObject _cm = RemoteObject.createImmutable("");
public static RemoteObject _r_coins = RemoteObject.createImmutable(0L);
public static RemoteObject _r_nums = RemoteObject.createImmutable(0L);
public static RemoteObject _progressdialog = RemoteObject.declareNull("de.amberhome.materialdialogs.MaterialDialogWrapper");
public static RemoteObject _pnl_coms = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _username_t = RemoteObject.createImmutable("");
public static RemoteObject _userid_t = RemoteObject.createImmutable("");
public static RemoteObject _img_address_target = RemoteObject.createImmutable("");
public static RemoteObject _username_target = RemoteObject.createImmutable("");
public static RemoteObject _chatid_target = RemoteObject.createImmutable("");
public static RemoteObject _idchannel_t = RemoteObject.createImmutable("");
public static RemoteObject _titelchat_target = RemoteObject.createImmutable("");
public static RemoteObject _us_name = RemoteObject.createImmutable("");
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
public static com.it.fome.act_chat _act_chat = null;
public static com.it.fome.starter _starter = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"chatid_target",_ref.getField(false, "_chatid_target"),"cm",_ref.getField(false, "_cm"),"cursor1",_ref.getField(false, "_cursor1"),"DateUtils",_ref.getField(false, "_dateutils"),"Ev",_ref.getField(false, "_ev"),"Glide",_ref.getField(false, "_glide"),"i_cookie",_ref.getField(false, "_i_cookie"),"i_pic",_ref.getField(false, "_i_pic"),"i_pk",_ref.getField(false, "_i_pk"),"i_username",_ref.getField(false, "_i_username"),"idchannel_t",_ref.getField(false, "_idchannel_t"),"img_address_target",_ref.getField(false, "_img_address_target"),"list_c",_ref.getField(false, "_list_c"),"list_f",_ref.getField(false, "_list_f"),"list_l",_ref.getField(false, "_list_l"),"list_v",_ref.getField(false, "_list_v"),"LV",_ref.getField(false, "_lv"),"obj",_ref.getField(false, "_obj"),"pnl_coms",_ref.getField(false, "_pnl_coms"),"pnl_main",_ref.getField(false, "_pnl_main"),"pnl_posts",_ref.getField(false, "_pnl_posts"),"pnl_tolbar",_ref.getField(false, "_pnl_tolbar"),"pr",_ref.getField(false, "_pr"),"prfn",_ref.getField(false, "_prfn"),"progressDialog",_ref.getField(false, "_progressdialog"),"r_coins",_ref.getField(false, "_r_coins"),"r_nums",_ref.getField(false, "_r_nums"),"roundview",_ref.getField(false, "_roundview"),"sql1",_ref.getField(false, "_sql1"),"str_name",_ref.getField(false, "_str_name"),"titelchat_target",_ref.getField(false, "_titelchat_target"),"Type_sef",_ref.getField(false, "_type_sef"),"upl",_ref.getField(false, "_upl"),"us_name",_ref.getField(false, "_us_name"),"userid_t",_ref.getField(false, "_userid_t"),"username_t",_ref.getField(false, "_username_t"),"username_target",_ref.getField(false, "_username_target")};
}
}