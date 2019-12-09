
package com.it.fome;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class mi_meno {
    public static RemoteObject myClass;
	public mi_meno() {
	}
    public static PCBA staticBA = new PCBA(null, mi_meno.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _ev = RemoteObject.createImmutable("");
public static RemoteObject _obj = RemoteObject.declareNull("Object");
public static RemoteObject _mdb = RemoteObject.declareNull("com.maximussoft.msmaterialdrawer.MSMaterialDrawerBuilder");
public static RemoteObject _md = RemoteObject.declareNull("com.maximussoft.msmaterialdrawer.MSMaterialDrawer");
public static RemoteObject _sql1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL");
public static RemoteObject _cursor1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
public static RemoteObject _telegs = RemoteObject.declareNull("com.mili.telegrams.teleg_warp");
public static RemoteObject _username_t = RemoteObject.createImmutable("");
public static RemoteObject _userid_t = RemoteObject.createImmutable("");
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
		return new Object[] {"cursor1",_ref.getField(false, "_cursor1"),"DateUtils",_ref.getField(false, "_dateutils"),"Ev",_ref.getField(false, "_ev"),"MD",_ref.getField(false, "_md"),"MDB",_ref.getField(false, "_mdb"),"obj",_ref.getField(false, "_obj"),"sql1",_ref.getField(false, "_sql1"),"telegs",_ref.getField(false, "_telegs"),"userid_t",_ref.getField(false, "_userid_t"),"username_t",_ref.getField(false, "_username_t")};
}
}