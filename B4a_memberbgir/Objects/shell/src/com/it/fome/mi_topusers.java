
package com.it.fome;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class mi_topusers {
    public static RemoteObject myClass;
	public mi_topusers() {
	}
    public static PCBA staticBA = new PCBA(null, mi_topusers.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _ev = RemoteObject.createImmutable("");
public static RemoteObject _obj = RemoteObject.declareNull("Object");
public static RemoteObject _sql1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL");
public static RemoteObject _cursor1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
public static RemoteObject _pnl_insta = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _i_username = RemoteObject.createImmutable("");
public static RemoteObject _i_pk = RemoteObject.createImmutable("");
public static RemoteObject _i_cookie = RemoteObject.createImmutable("");
public static RemoteObject _i_pic = RemoteObject.createImmutable("");
public static RemoteObject _l_users = null;
public static RemoteObject _lv = RemoteObject.declareNull("wir.hitex.recycler.Hitex_LayoutView");
public static RemoteObject _rl = RemoteObject.declareNull("wir.hitex.recycler.Hitex_RefreshLayout");
public static RemoteObject _glide = RemoteObject.declareNull("com.hitex_glide.Hitex_Glide");
public static RemoteObject _prfn = RemoteObject.declareNull("com.reza.sh.fastnet.Fastnet");
public static RemoteObject _username_t = RemoteObject.createImmutable("");
public static RemoteObject _userid_t = RemoteObject.createImmutable("");
public static RemoteObject _type_history = RemoteObject.createImmutable(0);
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
		return new Object[] {"cursor1",_ref.getField(false, "_cursor1"),"DateUtils",_ref.getField(false, "_dateutils"),"Ev",_ref.getField(false, "_ev"),"Glide",_ref.getField(false, "_glide"),"i_cookie",_ref.getField(false, "_i_cookie"),"i_pic",_ref.getField(false, "_i_pic"),"i_pk",_ref.getField(false, "_i_pk"),"i_username",_ref.getField(false, "_i_username"),"l_users",_ref.getField(false, "_l_users"),"LV",_ref.getField(false, "_lv"),"obj",_ref.getField(false, "_obj"),"pnl_insta",_ref.getField(false, "_pnl_insta"),"prfn",_ref.getField(false, "_prfn"),"RL",_ref.getField(false, "_rl"),"sql1",_ref.getField(false, "_sql1"),"type_history",_ref.getField(false, "_type_history"),"userid_t",_ref.getField(false, "_userid_t"),"username_t",_ref.getField(false, "_username_t")};
}
}