package com.it.fome;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class mi_topusers extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "com.it.fome.mi_topusers");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", com.it.fome.mi_topusers.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _data{
public boolean IsInitialized;
public String ip;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper pic;
public void Initialize() {
IsInitialized = true;
ip = "";
pic = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public String _ev = "";
public Object _obj = null;
public anywheresoftware.b4a.sql.SQL _sql1 = null;
public anywheresoftware.b4a.sql.SQL.CursorWrapper _cursor1 = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnl_insta = null;
public String _i_username = "";
public String _i_pk = "";
public String _i_cookie = "";
public String _i_pic = "";
public anywheresoftware.b4a.objects.collections.List[] _l_users = null;
public wir.hitex.recycler.Hitex_LayoutView _lv = null;
public wir.hitex.recycler.Hitex_RefreshLayout _rl = null;
public com.hitex_glide.Hitex_Glide _glide = null;
public com.reza.sh.fastnet.Fastnet _prfn = null;
public String _username_t = "";
public String _userid_t = "";
public int _type_history = 0;
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
public com.it.fome.ac_tsearch _ac_tsearch = null;
public com.it.fome.ac_tcoin _ac_tcoin = null;
public com.it.fome.ac_home _ac_home = null;
public com.it.fome.act_chat _act_chat = null;
public com.it.fome.starter _starter = null;
public String  _initialize(com.it.fome.mi_topusers __ref,anywheresoftware.b4a.BA _ba,String _eventname,Object _module) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="mi_topusers";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_eventname,_module}));}
int _ia = 0;
int _i = 0;
RDebugUtils.currentLine=13697024;
 //BA.debugLineNum = 13697024;BA.debugLine="Public Sub Initialize(EventName As String,Module A";
RDebugUtils.currentLine=13697025;
 //BA.debugLineNum = 13697025;BA.debugLine="Ev = EventName";
__ref._ev /*String*/  = _eventname;
RDebugUtils.currentLine=13697026;
 //BA.debugLineNum = 13697026;BA.debugLine="obj = Module";
__ref._obj /*Object*/  = _module;
RDebugUtils.currentLine=13697029;
 //BA.debugLineNum = 13697029;BA.debugLine="For ia=0 To 38";
{
final int step3 = 1;
final int limit3 = (int) (38);
_ia = (int) (0) ;
for (;_ia <= limit3 ;_ia = _ia + step3 ) {
RDebugUtils.currentLine=13697031;
 //BA.debugLineNum = 13697031;BA.debugLine="l_users(ia).Initialize";
__ref._l_users /*anywheresoftware.b4a.objects.collections.List[]*/ [_ia].Initialize();
 }
};
RDebugUtils.currentLine=13697037;
 //BA.debugLineNum = 13697037;BA.debugLine="If File.Exists(File.DirInternal,\"instadb.db\")=Fal";
if (__c.File.Exists(__c.File.getDirInternal(),"instadb.db")==__c.False) { 
RDebugUtils.currentLine=13697038;
 //BA.debugLineNum = 13697038;BA.debugLine="File.Copy(File.DirAssets,\"instadb.db\",File.DirIn";
__c.File.Copy(__c.File.getDirAssets(),"instadb.db",__c.File.getDirInternal(),"instadb.db");
 };
RDebugUtils.currentLine=13697040;
 //BA.debugLineNum = 13697040;BA.debugLine="If sql1.IsInitialized=False Then";
if (__ref._sql1 /*anywheresoftware.b4a.sql.SQL*/ .IsInitialized()==__c.False) { 
RDebugUtils.currentLine=13697041;
 //BA.debugLineNum = 13697041;BA.debugLine="sql1.Initialize(File.DirInternal,\"instadb.db\",Fa";
__ref._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Initialize(__c.File.getDirInternal(),"instadb.db",__c.False);
 };
RDebugUtils.currentLine=13697045;
 //BA.debugLineNum = 13697045;BA.debugLine="cursor1 = sql1.ExecQuery(\"SELECT * FROM tbl_acc W";
__ref._cursor1 /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .setObject((android.database.Cursor)(__ref._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM tbl_acc WHERE soich='1' ")));
RDebugUtils.currentLine=13697046;
 //BA.debugLineNum = 13697046;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=13697047;
 //BA.debugLineNum = 13697047;BA.debugLine="For i=0 To cursor1.RowCount-1";
{
final int step14 = 1;
final int limit14 = (int) (__ref._cursor1 /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit14 ;_i = _i + step14 ) {
RDebugUtils.currentLine=13697048;
 //BA.debugLineNum = 13697048;BA.debugLine="cursor1.Position=i";
__ref._cursor1 /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .setPosition(_i);
RDebugUtils.currentLine=13697049;
 //BA.debugLineNum = 13697049;BA.debugLine="i_cookie=cursor1.GetString(\"cookie\")";
__ref._i_cookie /*String*/  = __ref._cursor1 /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .GetString("cookie");
RDebugUtils.currentLine=13697050;
 //BA.debugLineNum = 13697050;BA.debugLine="i_username=cursor1.GetString(\"username\")";
__ref._i_username /*String*/  = __ref._cursor1 /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .GetString("username");
RDebugUtils.currentLine=13697051;
 //BA.debugLineNum = 13697051;BA.debugLine="i_pk=cursor1.GetString(\"pk\")";
__ref._i_pk /*String*/  = __ref._cursor1 /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .GetString("pk");
RDebugUtils.currentLine=13697052;
 //BA.debugLineNum = 13697052;BA.debugLine="i_pic=cursor1.GetString(\"profile_pic_url\")";
__ref._i_pic /*String*/  = __ref._cursor1 /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .GetString("profile_pic_url");
 }
};
RDebugUtils.currentLine=13697054;
 //BA.debugLineNum = 13697054;BA.debugLine="cursor1.Close";
__ref._cursor1 /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .Close();
RDebugUtils.currentLine=13697056;
 //BA.debugLineNum = 13697056;BA.debugLine="cursor1 = sql1.ExecQuery(\"SELECT * FROM tbl_tele";
__ref._cursor1 /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .setObject((android.database.Cursor)(__ref._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM tbl_tele WHERE soich='1'")));
RDebugUtils.currentLine=13697057;
 //BA.debugLineNum = 13697057;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=13697058;
 //BA.debugLineNum = 13697058;BA.debugLine="For i=0 To cursor1.RowCount-1";
{
final int step24 = 1;
final int limit24 = (int) (__ref._cursor1 /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit24 ;_i = _i + step24 ) {
RDebugUtils.currentLine=13697059;
 //BA.debugLineNum = 13697059;BA.debugLine="cursor1.Position=i";
__ref._cursor1 /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .setPosition(_i);
RDebugUtils.currentLine=13697060;
 //BA.debugLineNum = 13697060;BA.debugLine="userid_t=cursor1.GetString(\"userid\")";
__ref._userid_t /*String*/  = __ref._cursor1 /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .GetString("userid");
RDebugUtils.currentLine=13697061;
 //BA.debugLineNum = 13697061;BA.debugLine="username_t=cursor1.GetString(\"username\")";
__ref._username_t /*String*/  = __ref._cursor1 /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .GetString("username");
 }
};
RDebugUtils.currentLine=13697063;
 //BA.debugLineNum = 13697063;BA.debugLine="cursor1.Close";
__ref._cursor1 /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .Close();
RDebugUtils.currentLine=13697068;
 //BA.debugLineNum = 13697068;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.ConcreteViewWrapper  _addpnl(com.it.fome.mi_topusers __ref,anywheresoftware.b4a.objects.PanelWrapper _pnl) throws Exception{
__ref = this;
RDebugUtils.currentModule="mi_topusers";
if (Debug.shouldDelegate(ba, "addpnl", false))
	 {return ((anywheresoftware.b4a.objects.ConcreteViewWrapper) Debug.delegate(ba, "addpnl", new Object[] {_pnl}));}
RDebugUtils.currentLine=13762560;
 //BA.debugLineNum = 13762560;BA.debugLine="Sub addpnl(pnl As Panel) As View";
RDebugUtils.currentLine=13762580;
 //BA.debugLineNum = 13762580;BA.debugLine="LV.Initializer(\"LV\").ListView.RefreshLayout.Build";
__ref._lv /*wir.hitex.recycler.Hitex_LayoutView*/ .Initializer(ba,"LV").ListView().RefreshLayout().Build();
RDebugUtils.currentLine=13762581;
 //BA.debugLineNum = 13762581;BA.debugLine="pnl.AddView(LV,0,0,pnl.Width,pnl.Height)";
_pnl.AddView((android.view.View)(__ref._lv /*wir.hitex.recycler.Hitex_LayoutView*/ .getObject()),(int) (0),(int) (0),_pnl.getWidth(),_pnl.getHeight());
RDebugUtils.currentLine=13762582;
 //BA.debugLineNum = 13762582;BA.debugLine="LV.CardView.CardElevation(4dip).Radius(2dip)";
__ref._lv /*wir.hitex.recycler.Hitex_LayoutView*/ .CardView().CardElevation((float) (__c.DipToCurrent((int) (4)))).Radius((float) (__c.DipToCurrent((int) (2))));
RDebugUtils.currentLine=13762583;
 //BA.debugLineNum = 13762583;BA.debugLine="LV.Show";
__ref._lv /*wir.hitex.recycler.Hitex_LayoutView*/ .Show();
RDebugUtils.currentLine=13762584;
 //BA.debugLineNum = 13762584;BA.debugLine="RL.Initialize(LV, \"RL\")";
__ref._rl /*wir.hitex.recycler.Hitex_RefreshLayout*/ .Initialize(ba,__ref._lv /*wir.hitex.recycler.Hitex_LayoutView*/ ,"RL");
RDebugUtils.currentLine=13762585;
 //BA.debugLineNum = 13762585;BA.debugLine="RL.Direction = RL.DIRECTION_TOP";
__ref._rl /*wir.hitex.recycler.Hitex_RefreshLayout*/ .setDirection(__ref._rl /*wir.hitex.recycler.Hitex_RefreshLayout*/ .DIRECTION_TOP);
RDebugUtils.currentLine=13762586;
 //BA.debugLineNum = 13762586;BA.debugLine="RL.SchemeColors = Array As Int (Colors.Red, Color";
__ref._rl /*wir.hitex.recycler.Hitex_RefreshLayout*/ .setSchemeColors(new int[]{__c.Colors.Red,__c.Colors.Black,__c.Colors.Blue});
RDebugUtils.currentLine=13762588;
 //BA.debugLineNum = 13762588;BA.debugLine="Select type_history";
switch (BA.switchObjectToInt(__ref._type_history /*int*/ ,(int) (0),(int) (1))) {
case 0: {
RDebugUtils.currentLine=13762590;
 //BA.debugLineNum = 13762590;BA.debugLine="req_getme(i_pk)";
__ref._req_getme /*String*/ (null,__ref._i_pk /*String*/ );
 break; }
case 1: {
RDebugUtils.currentLine=13762593;
 //BA.debugLineNum = 13762593;BA.debugLine="Log(\"get telegram\")";
__c.LogImpl("613762593","get telegram",0);
RDebugUtils.currentLine=13762594;
 //BA.debugLineNum = 13762594;BA.debugLine="req_telegetme(userid_t)";
__ref._req_telegetme /*String*/ (null,__ref._userid_t /*String*/ );
 break; }
}
;
RDebugUtils.currentLine=13762600;
 //BA.debugLineNum = 13762600;BA.debugLine="End Sub";
return null;
}
public String  _req_getme(com.it.fome.mi_topusers __ref,String _userid) throws Exception{
__ref = this;
RDebugUtils.currentModule="mi_topusers";
if (Debug.shouldDelegate(ba, "req_getme", false))
	 {return ((String) Debug.delegate(ba, "req_getme", new Object[] {_userid}));}
com.reza.sh.fastnet.PostRequestRaper _post = null;
RDebugUtils.currentLine=14155776;
 //BA.debugLineNum = 14155776;BA.debugLine="Sub req_getme(userid As String)";
RDebugUtils.currentLine=14155777;
 //BA.debugLineNum = 14155777;BA.debugLine="prfn.initialize(\"prfn\")";
__ref._prfn /*com.reza.sh.fastnet.Fastnet*/ .initialize(ba,"prfn");
RDebugUtils.currentLine=14155779;
 //BA.debugLineNum = 14155779;BA.debugLine="Dim post As PostRequest";
_post = new com.reza.sh.fastnet.PostRequestRaper();
RDebugUtils.currentLine=14155780;
 //BA.debugLineNum = 14155780;BA.debugLine="post=prfn.BuildPostQuery(\"http://filework.ir/INST";
_post = __ref._prfn /*com.reza.sh.fastnet.Fastnet*/ .BuildPostQuery("http://filework.ir/INSTAFOLLOW/api/req.php","getsef");
RDebugUtils.currentLine=14155782;
 //BA.debugLineNum = 14155782;BA.debugLine="post.addHeder(\"User-Agent\",\"Dalvik/1.6.0 (Linux;";
_post.addHeder("User-Agent","Dalvik/1.6.0 (Linux; U; Android 4.4.4; SM-A700FD Build/KTU84P)");
RDebugUtils.currentLine=14155785;
 //BA.debugLineNum = 14155785;BA.debugLine="post.addParametrs(\"userid\",userid)";
_post.addParametrs("userid",_userid);
RDebugUtils.currentLine=14155787;
 //BA.debugLineNum = 14155787;BA.debugLine="post.addParametrs(\"req\",\"get_sef\")";
_post.addParametrs("req","get_sef");
RDebugUtils.currentLine=14155789;
 //BA.debugLineNum = 14155789;BA.debugLine="post.executRequestAsString";
_post.executRequestAsString();
RDebugUtils.currentLine=14155791;
 //BA.debugLineNum = 14155791;BA.debugLine="ProgressDialogShow(\"در حال دریافت ...\")";
__c.ProgressDialogShow(ba,BA.ObjectToCharSequence("در حال دریافت ..."));
RDebugUtils.currentLine=14155792;
 //BA.debugLineNum = 14155792;BA.debugLine="End Sub";
return "";
}
public String  _req_telegetme(com.it.fome.mi_topusers __ref,String _userid) throws Exception{
__ref = this;
RDebugUtils.currentModule="mi_topusers";
if (Debug.shouldDelegate(ba, "req_telegetme", false))
	 {return ((String) Debug.delegate(ba, "req_telegetme", new Object[] {_userid}));}
com.reza.sh.fastnet.PostRequestRaper _post = null;
RDebugUtils.currentLine=14090240;
 //BA.debugLineNum = 14090240;BA.debugLine="Sub req_telegetme(userid As String)";
RDebugUtils.currentLine=14090241;
 //BA.debugLineNum = 14090241;BA.debugLine="prfn.initialize(\"prfn\")";
__ref._prfn /*com.reza.sh.fastnet.Fastnet*/ .initialize(ba,"prfn");
RDebugUtils.currentLine=14090243;
 //BA.debugLineNum = 14090243;BA.debugLine="Dim post As PostRequest";
_post = new com.reza.sh.fastnet.PostRequestRaper();
RDebugUtils.currentLine=14090244;
 //BA.debugLineNum = 14090244;BA.debugLine="post=prfn.BuildPostQuery(\"http://filework.ir/INST";
_post = __ref._prfn /*com.reza.sh.fastnet.Fastnet*/ .BuildPostQuery("http://filework.ir/INSTAFOLLOW/api/req.php","getseft");
RDebugUtils.currentLine=14090246;
 //BA.debugLineNum = 14090246;BA.debugLine="post.addHeder(\"User-Agent\",\"Dalvik/1.6.0 (Linux;";
_post.addHeder("User-Agent","Dalvik/1.6.0 (Linux; U; Android 4.4.4; SM-A700FD Build/KTU84P)");
RDebugUtils.currentLine=14090249;
 //BA.debugLineNum = 14090249;BA.debugLine="post.addParametrs(\"userid\",userid_t)";
_post.addParametrs("userid",__ref._userid_t /*String*/ );
RDebugUtils.currentLine=14090251;
 //BA.debugLineNum = 14090251;BA.debugLine="post.addParametrs(\"req\",\"get_telesef\")";
_post.addParametrs("req","get_telesef");
RDebugUtils.currentLine=14090253;
 //BA.debugLineNum = 14090253;BA.debugLine="post.executRequestAsString";
_post.executRequestAsString();
RDebugUtils.currentLine=14090255;
 //BA.debugLineNum = 14090255;BA.debugLine="ProgressDialogShow(\"در حال دریافت ...\")";
__c.ProgressDialogShow(ba,BA.ObjectToCharSequence("در حال دریافت ..."));
RDebugUtils.currentLine=14090256;
 //BA.debugLineNum = 14090256;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(com.it.fome.mi_topusers __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mi_topusers";
RDebugUtils.currentLine=13631488;
 //BA.debugLineNum = 13631488;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=13631489;
 //BA.debugLineNum = 13631489;BA.debugLine="Private Ev As String";
_ev = "";
RDebugUtils.currentLine=13631490;
 //BA.debugLineNum = 13631490;BA.debugLine="Private obj As Object";
_obj = new Object();
RDebugUtils.currentLine=13631491;
 //BA.debugLineNum = 13631491;BA.debugLine="Private sql1 As SQL";
_sql1 = new anywheresoftware.b4a.sql.SQL();
RDebugUtils.currentLine=13631492;
 //BA.debugLineNum = 13631492;BA.debugLine="Private cursor1 As Cursor";
_cursor1 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=13631493;
 //BA.debugLineNum = 13631493;BA.debugLine="Private pnl_insta As Panel";
_pnl_insta = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=13631494;
 //BA.debugLineNum = 13631494;BA.debugLine="Private i_username ,i_pk,i_cookie,i_pic As String";
_i_username = "";
_i_pk = "";
_i_cookie = "";
_i_pic = "";
RDebugUtils.currentLine=13631495;
 //BA.debugLineNum = 13631495;BA.debugLine="Private l_users(40) As List";
_l_users = new anywheresoftware.b4a.objects.collections.List[(int) (40)];
{
int d0 = _l_users.length;
for (int i0 = 0;i0 < d0;i0++) {
_l_users[i0] = new anywheresoftware.b4a.objects.collections.List();
}
}
;
RDebugUtils.currentLine=13631497;
 //BA.debugLineNum = 13631497;BA.debugLine="Private LV As Hitex_LayoutView";
_lv = new wir.hitex.recycler.Hitex_LayoutView();
RDebugUtils.currentLine=13631498;
 //BA.debugLineNum = 13631498;BA.debugLine="Private RL As Hitex_RefreshLayout";
_rl = new wir.hitex.recycler.Hitex_RefreshLayout();
RDebugUtils.currentLine=13631499;
 //BA.debugLineNum = 13631499;BA.debugLine="Private Glide As Hitex_Glide";
_glide = new com.hitex_glide.Hitex_Glide();
RDebugUtils.currentLine=13631500;
 //BA.debugLineNum = 13631500;BA.debugLine="Private prfn As PersianFastNetwork";
_prfn = new com.reza.sh.fastnet.Fastnet();
RDebugUtils.currentLine=13631503;
 //BA.debugLineNum = 13631503;BA.debugLine="Type Data(ip As String,pic As Bitmap)";
;
RDebugUtils.currentLine=13631505;
 //BA.debugLineNum = 13631505;BA.debugLine="Private username_t ,userid_t As String";
_username_t = "";
_userid_t = "";
RDebugUtils.currentLine=13631506;
 //BA.debugLineNum = 13631506;BA.debugLine="Dim type_history As Int";
_type_history = 0;
RDebugUtils.currentLine=13631507;
 //BA.debugLineNum = 13631507;BA.debugLine="End Sub";
return "";
}
public int  _lv_getitemcount(com.it.fome.mi_topusers __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mi_topusers";
if (Debug.shouldDelegate(ba, "lv_getitemcount", false))
	 {return ((Integer) Debug.delegate(ba, "lv_getitemcount", null));}
RDebugUtils.currentLine=13959168;
 //BA.debugLineNum = 13959168;BA.debugLine="Sub LV_GetItemCount As Int 								        '$ Item";
RDebugUtils.currentLine=13959169;
 //BA.debugLineNum = 13959169;BA.debugLine="Return l_users(1).Size 'ItemList.Size";
if (true) return __ref._l_users /*anywheresoftware.b4a.objects.collections.List[]*/ [(int) (1)].getSize();
RDebugUtils.currentLine=13959170;
 //BA.debugLineNum = 13959170;BA.debugLine="End Sub";
return 0;
}
public String  _lv_onbindviewholder(com.it.fome.mi_topusers __ref,anywheresoftware.b4a.objects.PanelWrapper _parent,int _position) throws Exception{
__ref = this;
RDebugUtils.currentModule="mi_topusers";
if (Debug.shouldDelegate(ba, "lv_onbindviewholder", false))
	 {return ((String) Debug.delegate(ba, "lv_onbindviewholder", new Object[] {_parent,_position}));}
com.hitex_glide.Hitex_ImageView _imguser = null;
anywheresoftware.b4a.objects.LabelWrapper _lbltype = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl_username = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl_ok = null;
anywheresoftware.b4a.objects.PanelWrapper _pnlpos = null;
com.hitex_glide.Hitex_ImageView _imgpost = null;
RDebugUtils.currentLine=13893632;
 //BA.debugLineNum = 13893632;BA.debugLine="Sub LV_onBindViewHolder (Parent As Panel, Position";
RDebugUtils.currentLine=13893633;
 //BA.debugLineNum = 13893633;BA.debugLine="Dim imguser = Parent.GetView(0) As Hitex_ImageVie";
_imguser = new com.hitex_glide.Hitex_ImageView();
_imguser.setObject((pack.ImageView2)(_parent.GetView((int) (0)).getObject()));
RDebugUtils.currentLine=13893635;
 //BA.debugLineNum = 13893635;BA.debugLine="Dim lbltype = Parent.GetView(1) As Label";
_lbltype = new anywheresoftware.b4a.objects.LabelWrapper();
_lbltype.setObject((android.widget.TextView)(_parent.GetView((int) (1)).getObject()));
RDebugUtils.currentLine=13893636;
 //BA.debugLineNum = 13893636;BA.debugLine="Dim lbl_username = Parent.GetView(2) As Label";
_lbl_username = new anywheresoftware.b4a.objects.LabelWrapper();
_lbl_username.setObject((android.widget.TextView)(_parent.GetView((int) (2)).getObject()));
RDebugUtils.currentLine=13893637;
 //BA.debugLineNum = 13893637;BA.debugLine="Dim lbl_ok = Parent.GetView(3) As Label";
_lbl_ok = new anywheresoftware.b4a.objects.LabelWrapper();
_lbl_ok.setObject((android.widget.TextView)(_parent.GetView((int) (3)).getObject()));
RDebugUtils.currentLine=13893638;
 //BA.debugLineNum = 13893638;BA.debugLine="Dim pnlpos = Parent.GetView(4) As Panel";
_pnlpos = new anywheresoftware.b4a.objects.PanelWrapper();
_pnlpos.setObject((android.view.ViewGroup)(_parent.GetView((int) (4)).getObject()));
RDebugUtils.currentLine=13893639;
 //BA.debugLineNum = 13893639;BA.debugLine="Dim imgpost = pnlpos.GetView(0) As Hitex_ImageVie";
_imgpost = new com.hitex_glide.Hitex_ImageView();
_imgpost.setObject((pack.ImageView2)(_pnlpos.GetView((int) (0)).getObject()));
RDebugUtils.currentLine=13893641;
 //BA.debugLineNum = 13893641;BA.debugLine="Select l_users(1).Get(Position)";
switch (BA.switchObjectToInt(__ref._l_users /*anywheresoftware.b4a.objects.collections.List[]*/ [(int) (1)].Get(_position),(Object)("1"),(Object)("2"),(Object)("4"),(Object)("3"))) {
case 0: {
RDebugUtils.currentLine=13893644;
 //BA.debugLineNum = 13893644;BA.debugLine="Select type_history";
switch (BA.switchObjectToInt(__ref._type_history /*int*/ ,(int) (0),(int) (1))) {
case 0: {
RDebugUtils.currentLine=13893647;
 //BA.debugLineNum = 13893647;BA.debugLine="Glide.Load(File.DirAssets,\"c_like.png\").Optio";
__ref._glide /*com.hitex_glide.Hitex_Glide*/ .Load(ba,__c.File.getDirAssets(),"c_like.png").OptionalCircleCrop().Into((anywheresoftware.b4a.objects.ImageViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ImageViewWrapper(), (android.widget.ImageView)(_imguser.getObject())));
RDebugUtils.currentLine=13893648;
 //BA.debugLineNum = 13893648;BA.debugLine="lbltype.Text = \"سفارش لایک\"";
_lbltype.setText(BA.ObjectToCharSequence("سفارش لایک"));
RDebugUtils.currentLine=13893649;
 //BA.debugLineNum = 13893649;BA.debugLine="lbl_username.Text=l_users(2).Get(Position)&\"";
_lbl_username.setText(BA.ObjectToCharSequence(BA.ObjectToString(__ref._l_users /*anywheresoftware.b4a.objects.collections.List[]*/ [(int) (2)].Get(_position))+" انجام شده از "+BA.ObjectToString(__ref._l_users /*anywheresoftware.b4a.objects.collections.List[]*/ [(int) (3)].Get(_position))+"سفارش"));
RDebugUtils.currentLine=13893650;
 //BA.debugLineNum = 13893650;BA.debugLine="If l_users(7).Get(Position)=\"0\" Then";
if ((__ref._l_users /*anywheresoftware.b4a.objects.collections.List[]*/ [(int) (7)].Get(_position)).equals((Object)("0"))) { 
RDebugUtils.currentLine=13893651;
 //BA.debugLineNum = 13893651;BA.debugLine="lbl_ok.Text=\"وضعیت : در حال انجام \"";
_lbl_ok.setText(BA.ObjectToCharSequence("وضعیت : در حال انجام "));
 }else {
RDebugUtils.currentLine=13893654;
 //BA.debugLineNum = 13893654;BA.debugLine="lbl_ok.Text=\"وضعیت : انجام شده\"";
_lbl_ok.setText(BA.ObjectToCharSequence("وضعیت : انجام شده"));
 };
RDebugUtils.currentLine=13893659;
 //BA.debugLineNum = 13893659;BA.debugLine="Glide.Load2(l_users(9).Get(Position)).Optiona";
__ref._glide /*com.hitex_glide.Hitex_Glide*/ .Load2(ba,BA.ObjectToString(__ref._l_users /*anywheresoftware.b4a.objects.collections.List[]*/ [(int) (9)].Get(_position))).OptionalCircleCrop().Into((anywheresoftware.b4a.objects.ImageViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ImageViewWrapper(), (android.widget.ImageView)(_imgpost.getObject())));
 break; }
case 1: {
RDebugUtils.currentLine=13893661;
 //BA.debugLineNum = 13893661;BA.debugLine="Glide.Load(File.DirAssets,\"c_follow.png\").Opt";
__ref._glide /*com.hitex_glide.Hitex_Glide*/ .Load(ba,__c.File.getDirAssets(),"c_follow.png").OptionalCircleCrop().Into((anywheresoftware.b4a.objects.ImageViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ImageViewWrapper(), (android.widget.ImageView)(_imguser.getObject())));
RDebugUtils.currentLine=13893662;
 //BA.debugLineNum = 13893662;BA.debugLine="lbltype.Text = \"سفارش ممبر\"";
_lbltype.setText(BA.ObjectToCharSequence("سفارش ممبر"));
RDebugUtils.currentLine=13893663;
 //BA.debugLineNum = 13893663;BA.debugLine="lbl_username.Text=l_users(2).Get(Position)&\"";
_lbl_username.setText(BA.ObjectToCharSequence(BA.ObjectToString(__ref._l_users /*anywheresoftware.b4a.objects.collections.List[]*/ [(int) (2)].Get(_position))+" انجام شده از "+BA.ObjectToString(__ref._l_users /*anywheresoftware.b4a.objects.collections.List[]*/ [(int) (3)].Get(_position))+"سفارش"));
RDebugUtils.currentLine=13893664;
 //BA.debugLineNum = 13893664;BA.debugLine="If l_users(7).Get(Position)=\"0\" Then";
if ((__ref._l_users /*anywheresoftware.b4a.objects.collections.List[]*/ [(int) (7)].Get(_position)).equals((Object)("0"))) { 
RDebugUtils.currentLine=13893665;
 //BA.debugLineNum = 13893665;BA.debugLine="lbl_ok.Text=\"وضعیت : در حال انجام \"";
_lbl_ok.setText(BA.ObjectToCharSequence("وضعیت : در حال انجام "));
 }else {
RDebugUtils.currentLine=13893668;
 //BA.debugLineNum = 13893668;BA.debugLine="lbl_ok.Text=\"وضعیت : انجام شده\"";
_lbl_ok.setText(BA.ObjectToCharSequence("وضعیت : انجام شده"));
 };
RDebugUtils.currentLine=13893673;
 //BA.debugLineNum = 13893673;BA.debugLine="Glide.Load2(l_users(9).Get(Position)).Optiona";
__ref._glide /*com.hitex_glide.Hitex_Glide*/ .Load2(ba,BA.ObjectToString(__ref._l_users /*anywheresoftware.b4a.objects.collections.List[]*/ [(int) (9)].Get(_position))).OptionalCircleCrop().Into((anywheresoftware.b4a.objects.ImageViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ImageViewWrapper(), (android.widget.ImageView)(_imgpost.getObject())));
 break; }
}
;
RDebugUtils.currentLine=13893677;
 //BA.debugLineNum = 13893677;BA.debugLine="Parent.Height=200dip";
_parent.setHeight(__c.DipToCurrent((int) (200)));
 break; }
case 1: {
RDebugUtils.currentLine=13893681;
 //BA.debugLineNum = 13893681;BA.debugLine="Select type_history";
switch (BA.switchObjectToInt(__ref._type_history /*int*/ ,(int) (0),(int) (1))) {
case 0: {
RDebugUtils.currentLine=13893684;
 //BA.debugLineNum = 13893684;BA.debugLine="Glide.Load(File.DirAssets,\"c_com.png\").Option";
__ref._glide /*com.hitex_glide.Hitex_Glide*/ .Load(ba,__c.File.getDirAssets(),"c_com.png").OptionalCircleCrop().Into((anywheresoftware.b4a.objects.ImageViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ImageViewWrapper(), (android.widget.ImageView)(_imguser.getObject())));
RDebugUtils.currentLine=13893685;
 //BA.debugLineNum = 13893685;BA.debugLine="lbltype.Text = \"سفارش کامنت\"";
_lbltype.setText(BA.ObjectToCharSequence("سفارش کامنت"));
RDebugUtils.currentLine=13893686;
 //BA.debugLineNum = 13893686;BA.debugLine="lbl_username.Text=l_users(2).Get(Position)&\"";
_lbl_username.setText(BA.ObjectToCharSequence(BA.ObjectToString(__ref._l_users /*anywheresoftware.b4a.objects.collections.List[]*/ [(int) (2)].Get(_position))+" انجام شده از "+BA.ObjectToString(__ref._l_users /*anywheresoftware.b4a.objects.collections.List[]*/ [(int) (3)].Get(_position))+"سفارش"));
RDebugUtils.currentLine=13893687;
 //BA.debugLineNum = 13893687;BA.debugLine="If l_users(7).Get(Position)=\"0\" Then";
if ((__ref._l_users /*anywheresoftware.b4a.objects.collections.List[]*/ [(int) (7)].Get(_position)).equals((Object)("0"))) { 
RDebugUtils.currentLine=13893688;
 //BA.debugLineNum = 13893688;BA.debugLine="lbl_ok.Text=\"وضعیت : در حال انجام \"";
_lbl_ok.setText(BA.ObjectToCharSequence("وضعیت : در حال انجام "));
 }else {
RDebugUtils.currentLine=13893691;
 //BA.debugLineNum = 13893691;BA.debugLine="lbl_ok.Text=\"وضعیت : انجام شده\"";
_lbl_ok.setText(BA.ObjectToCharSequence("وضعیت : انجام شده"));
 };
RDebugUtils.currentLine=13893694;
 //BA.debugLineNum = 13893694;BA.debugLine="Glide.Load2(l_users(9).Get(Position)).Optiona";
__ref._glide /*com.hitex_glide.Hitex_Glide*/ .Load2(ba,BA.ObjectToString(__ref._l_users /*anywheresoftware.b4a.objects.collections.List[]*/ [(int) (9)].Get(_position))).OptionalCircleCrop().Into((anywheresoftware.b4a.objects.ImageViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ImageViewWrapper(), (android.widget.ImageView)(_imgpost.getObject())));
 break; }
case 1: {
RDebugUtils.currentLine=13893696;
 //BA.debugLineNum = 13893696;BA.debugLine="Glide.Load(File.DirAssets,\"view_icon.png\").Op";
__ref._glide /*com.hitex_glide.Hitex_Glide*/ .Load(ba,__c.File.getDirAssets(),"view_icon.png").OptionalCircleCrop().Into((anywheresoftware.b4a.objects.ImageViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ImageViewWrapper(), (android.widget.ImageView)(_imguser.getObject())));
RDebugUtils.currentLine=13893697;
 //BA.debugLineNum = 13893697;BA.debugLine="lbltype.Text = \"سفارش بازدید\"";
_lbltype.setText(BA.ObjectToCharSequence("سفارش بازدید"));
RDebugUtils.currentLine=13893698;
 //BA.debugLineNum = 13893698;BA.debugLine="lbl_username.Text=l_users(2).Get(Position)&\"";
_lbl_username.setText(BA.ObjectToCharSequence(BA.ObjectToString(__ref._l_users /*anywheresoftware.b4a.objects.collections.List[]*/ [(int) (2)].Get(_position))+" انجام شده از "+BA.ObjectToString(__ref._l_users /*anywheresoftware.b4a.objects.collections.List[]*/ [(int) (3)].Get(_position))+"سفارش"));
RDebugUtils.currentLine=13893699;
 //BA.debugLineNum = 13893699;BA.debugLine="If l_users(7).Get(Position)=\"0\" Then";
if ((__ref._l_users /*anywheresoftware.b4a.objects.collections.List[]*/ [(int) (7)].Get(_position)).equals((Object)("0"))) { 
RDebugUtils.currentLine=13893700;
 //BA.debugLineNum = 13893700;BA.debugLine="lbl_ok.Text=\"وضعیت : در حال انجام \"";
_lbl_ok.setText(BA.ObjectToCharSequence("وضعیت : در حال انجام "));
 }else {
RDebugUtils.currentLine=13893703;
 //BA.debugLineNum = 13893703;BA.debugLine="lbl_ok.Text=\"وضعیت : انجام شده\"";
_lbl_ok.setText(BA.ObjectToCharSequence("وضعیت : انجام شده"));
 };
RDebugUtils.currentLine=13893706;
 //BA.debugLineNum = 13893706;BA.debugLine="Glide.Load2(l_users(9).Get(Position)).Optiona";
__ref._glide /*com.hitex_glide.Hitex_Glide*/ .Load2(ba,BA.ObjectToString(__ref._l_users /*anywheresoftware.b4a.objects.collections.List[]*/ [(int) (9)].Get(_position))).OptionalCircleCrop().Into((anywheresoftware.b4a.objects.ImageViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ImageViewWrapper(), (android.widget.ImageView)(_imgpost.getObject())));
 break; }
}
;
RDebugUtils.currentLine=13893709;
 //BA.debugLineNum = 13893709;BA.debugLine="Parent.Height=200dip";
_parent.setHeight(__c.DipToCurrent((int) (200)));
 break; }
case 2: {
RDebugUtils.currentLine=13893714;
 //BA.debugLineNum = 13893714;BA.debugLine="Glide.Load(File.DirAssets,\"view_icon.png\").Opti";
__ref._glide /*com.hitex_glide.Hitex_Glide*/ .Load(ba,__c.File.getDirAssets(),"view_icon.png").OptionalCircleCrop().Into((anywheresoftware.b4a.objects.ImageViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ImageViewWrapper(), (android.widget.ImageView)(_imguser.getObject())));
RDebugUtils.currentLine=13893715;
 //BA.debugLineNum = 13893715;BA.debugLine="lbltype.Text = \"سفارش ویو\"";
_lbltype.setText(BA.ObjectToCharSequence("سفارش ویو"));
RDebugUtils.currentLine=13893716;
 //BA.debugLineNum = 13893716;BA.debugLine="lbl_username.Text=l_users(2).Get(Position)&\" ان";
_lbl_username.setText(BA.ObjectToCharSequence(BA.ObjectToString(__ref._l_users /*anywheresoftware.b4a.objects.collections.List[]*/ [(int) (2)].Get(_position))+" انجام شده از "+BA.ObjectToString(__ref._l_users /*anywheresoftware.b4a.objects.collections.List[]*/ [(int) (3)].Get(_position))+"سفارش"));
RDebugUtils.currentLine=13893717;
 //BA.debugLineNum = 13893717;BA.debugLine="If l_users(7).Get(Position)=\"0\" Then";
if ((__ref._l_users /*anywheresoftware.b4a.objects.collections.List[]*/ [(int) (7)].Get(_position)).equals((Object)("0"))) { 
RDebugUtils.currentLine=13893718;
 //BA.debugLineNum = 13893718;BA.debugLine="lbl_ok.Text=\"وضعیت : در حال انجام \"";
_lbl_ok.setText(BA.ObjectToCharSequence("وضعیت : در حال انجام "));
 }else {
RDebugUtils.currentLine=13893721;
 //BA.debugLineNum = 13893721;BA.debugLine="lbl_ok.Text=\"وضعیت : انجام شده\"";
_lbl_ok.setText(BA.ObjectToCharSequence("وضعیت : انجام شده"));
 };
RDebugUtils.currentLine=13893726;
 //BA.debugLineNum = 13893726;BA.debugLine="Glide.Load2(l_users(9).Get(Position)).OptionalC";
__ref._glide /*com.hitex_glide.Hitex_Glide*/ .Load2(ba,BA.ObjectToString(__ref._l_users /*anywheresoftware.b4a.objects.collections.List[]*/ [(int) (9)].Get(_position))).OptionalCircleCrop().Into((anywheresoftware.b4a.objects.ImageViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ImageViewWrapper(), (android.widget.ImageView)(_imgpost.getObject())));
RDebugUtils.currentLine=13893729;
 //BA.debugLineNum = 13893729;BA.debugLine="Parent.Height=200dip";
_parent.setHeight(__c.DipToCurrent((int) (200)));
 break; }
case 3: {
RDebugUtils.currentLine=13893733;
 //BA.debugLineNum = 13893733;BA.debugLine="Glide.Load(File.DirAssets,\"c_follow.png\").Optio";
__ref._glide /*com.hitex_glide.Hitex_Glide*/ .Load(ba,__c.File.getDirAssets(),"c_follow.png").OptionalCircleCrop().Into((anywheresoftware.b4a.objects.ImageViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ImageViewWrapper(), (android.widget.ImageView)(_imguser.getObject())));
RDebugUtils.currentLine=13893734;
 //BA.debugLineNum = 13893734;BA.debugLine="lbltype.Text = \"سفارش فالوور\"";
_lbltype.setText(BA.ObjectToCharSequence("سفارش فالوور"));
RDebugUtils.currentLine=13893735;
 //BA.debugLineNum = 13893735;BA.debugLine="lbl_username.Text=l_users(2).Get(Position)&\" ان";
_lbl_username.setText(BA.ObjectToCharSequence(BA.ObjectToString(__ref._l_users /*anywheresoftware.b4a.objects.collections.List[]*/ [(int) (2)].Get(_position))+" انجام شده از "+BA.ObjectToString(__ref._l_users /*anywheresoftware.b4a.objects.collections.List[]*/ [(int) (3)].Get(_position))+"سفارش"));
RDebugUtils.currentLine=13893736;
 //BA.debugLineNum = 13893736;BA.debugLine="If l_users(7).Get(Position)=\"0\" Then";
if ((__ref._l_users /*anywheresoftware.b4a.objects.collections.List[]*/ [(int) (7)].Get(_position)).equals((Object)("0"))) { 
RDebugUtils.currentLine=13893737;
 //BA.debugLineNum = 13893737;BA.debugLine="lbl_ok.Text=\"وضعیت : در حال انجام \"";
_lbl_ok.setText(BA.ObjectToCharSequence("وضعیت : در حال انجام "));
 }else {
RDebugUtils.currentLine=13893740;
 //BA.debugLineNum = 13893740;BA.debugLine="lbl_ok.Text=\"وضعیت : انجام شده\"";
_lbl_ok.setText(BA.ObjectToCharSequence("وضعیت : انجام شده"));
 };
RDebugUtils.currentLine=13893743;
 //BA.debugLineNum = 13893743;BA.debugLine="Glide.Load2(l_users(9).Get(Position)).OptionalC";
__ref._glide /*com.hitex_glide.Hitex_Glide*/ .Load2(ba,BA.ObjectToString(__ref._l_users /*anywheresoftware.b4a.objects.collections.List[]*/ [(int) (9)].Get(_position))).OptionalCircleCrop().Into((anywheresoftware.b4a.objects.ImageViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ImageViewWrapper(), (android.widget.ImageView)(_imgpost.getObject())));
RDebugUtils.currentLine=13893745;
 //BA.debugLineNum = 13893745;BA.debugLine="Parent.Height=200dip";
_parent.setHeight(__c.DipToCurrent((int) (200)));
 break; }
}
;
RDebugUtils.currentLine=13893757;
 //BA.debugLineNum = 13893757;BA.debugLine="End Sub";
return "";
}
public String  _lv_oncreateviewholder(com.it.fome.mi_topusers __ref,anywheresoftware.b4a.objects.PanelWrapper _parent,int _viewtype) throws Exception{
__ref = this;
RDebugUtils.currentModule="mi_topusers";
if (Debug.shouldDelegate(ba, "lv_oncreateviewholder", false))
	 {return ((String) Debug.delegate(ba, "lv_oncreateviewholder", new Object[] {_parent,_viewtype}));}
com.hitex_glide.Hitex_ImageView _imgtype = null;
anywheresoftware.b4a.objects.LabelWrapper _lbltype = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl_username = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl_ok = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _cd = null;
anywheresoftware.b4a.objects.PanelWrapper _pnlpos = null;
com.hitex_glide.Hitex_ImageView _imgpost = null;
RDebugUtils.currentLine=13828096;
 //BA.debugLineNum = 13828096;BA.debugLine="Sub LV_onCreateViewHolder (Parent As Panel, ViewTy";
RDebugUtils.currentLine=13828098;
 //BA.debugLineNum = 13828098;BA.debugLine="Dim imgtype As Hitex_ImageView : imgtype.Initiali";
_imgtype = new com.hitex_glide.Hitex_ImageView();
RDebugUtils.currentLine=13828098;
 //BA.debugLineNum = 13828098;BA.debugLine="Dim imgtype As Hitex_ImageView : imgtype.Initiali";
_imgtype.Initialize(ba,"imgtype");
RDebugUtils.currentLine=13828099;
 //BA.debugLineNum = 13828099;BA.debugLine="Parent.AddView(imgtype,100%x-70dip,20dip,35dip,35";
_parent.AddView((android.view.View)(_imgtype.getObject()),(int) (__c.PerXToCurrent((float) (100),ba)-__c.DipToCurrent((int) (70))),__c.DipToCurrent((int) (20)),__c.DipToCurrent((int) (35)),__c.DipToCurrent((int) (35)));
RDebugUtils.currentLine=13828101;
 //BA.debugLineNum = 13828101;BA.debugLine="Dim lbltype As Label : lbltype.Initialize(\"lbltyp";
_lbltype = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=13828101;
 //BA.debugLineNum = 13828101;BA.debugLine="Dim lbltype As Label : lbltype.Initialize(\"lbltyp";
_lbltype.Initialize(ba,"lbltype");
RDebugUtils.currentLine=13828102;
 //BA.debugLineNum = 13828102;BA.debugLine="lbltype.TextColor = Colors.DarkGray : lbltype.Tex";
_lbltype.setTextColor(__c.Colors.DarkGray);
RDebugUtils.currentLine=13828102;
 //BA.debugLineNum = 13828102;BA.debugLine="lbltype.TextColor = Colors.DarkGray : lbltype.Tex";
_lbltype.setTextSize((float) (14));
RDebugUtils.currentLine=13828103;
 //BA.debugLineNum = 13828103;BA.debugLine="lbltype.Gravity=Gravity.RIGHT";
_lbltype.setGravity(__c.Gravity.RIGHT);
RDebugUtils.currentLine=13828104;
 //BA.debugLineNum = 13828104;BA.debugLine="Parent.AddView(lbltype,0,25dip,100%x-80dip,-1)";
_parent.AddView((android.view.View)(_lbltype.getObject()),(int) (0),__c.DipToCurrent((int) (25)),(int) (__c.PerXToCurrent((float) (100),ba)-__c.DipToCurrent((int) (80))),(int) (-1));
RDebugUtils.currentLine=13828106;
 //BA.debugLineNum = 13828106;BA.debugLine="Dim lbl_username As Label : lbl_username.Initiali";
_lbl_username = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=13828106;
 //BA.debugLineNum = 13828106;BA.debugLine="Dim lbl_username As Label : lbl_username.Initiali";
_lbl_username.Initialize(ba,"lbl_username");
RDebugUtils.currentLine=13828107;
 //BA.debugLineNum = 13828107;BA.debugLine="lbl_username.TextColor = Colors.DarkGray : lbl_us";
_lbl_username.setTextColor(__c.Colors.DarkGray);
RDebugUtils.currentLine=13828107;
 //BA.debugLineNum = 13828107;BA.debugLine="lbl_username.TextColor = Colors.DarkGray : lbl_us";
_lbl_username.setTextSize((float) (11));
RDebugUtils.currentLine=13828108;
 //BA.debugLineNum = 13828108;BA.debugLine="Parent.AddView(lbl_username,0,80dip,100%x-80dip,-";
_parent.AddView((android.view.View)(_lbl_username.getObject()),(int) (0),__c.DipToCurrent((int) (80)),(int) (__c.PerXToCurrent((float) (100),ba)-__c.DipToCurrent((int) (80))),(int) (-1));
RDebugUtils.currentLine=13828110;
 //BA.debugLineNum = 13828110;BA.debugLine="Dim lbl_ok As Label : lbl_ok.Initialize(\"lbl_ok\")";
_lbl_ok = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=13828110;
 //BA.debugLineNum = 13828110;BA.debugLine="Dim lbl_ok As Label : lbl_ok.Initialize(\"lbl_ok\")";
_lbl_ok.Initialize(ba,"lbl_ok");
RDebugUtils.currentLine=13828111;
 //BA.debugLineNum = 13828111;BA.debugLine="lbl_ok.TextColor = Colors.DarkGray : lbl_ok.TextS";
_lbl_ok.setTextColor(__c.Colors.DarkGray);
RDebugUtils.currentLine=13828111;
 //BA.debugLineNum = 13828111;BA.debugLine="lbl_ok.TextColor = Colors.DarkGray : lbl_ok.TextS";
_lbl_ok.setTextSize((float) (12));
RDebugUtils.currentLine=13828112;
 //BA.debugLineNum = 13828112;BA.debugLine="Parent.AddView(lbl_ok,0,120dip,100%x-80dip,-1)";
_parent.AddView((android.view.View)(_lbl_ok.getObject()),(int) (0),__c.DipToCurrent((int) (120)),(int) (__c.PerXToCurrent((float) (100),ba)-__c.DipToCurrent((int) (80))),(int) (-1));
RDebugUtils.currentLine=13828114;
 //BA.debugLineNum = 13828114;BA.debugLine="Dim cd As ColorDrawable";
_cd = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=13828115;
 //BA.debugLineNum = 13828115;BA.debugLine="cd.Initialize2(Colors.White,10,0xFF673AB7,2)";
_cd.Initialize2(__c.Colors.White,(int) (10),(int) (0xff673ab7),(int) (2));
RDebugUtils.currentLine=13828117;
 //BA.debugLineNum = 13828117;BA.debugLine="Dim pnlpos As Panel : pnlpos.Initialize(\"pnlpos\")";
_pnlpos = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=13828117;
 //BA.debugLineNum = 13828117;BA.debugLine="Dim pnlpos As Panel : pnlpos.Initialize(\"pnlpos\")";
_pnlpos.Initialize(ba,"pnlpos");
RDebugUtils.currentLine=13828118;
 //BA.debugLineNum = 13828118;BA.debugLine="pnlpos.Background=cd";
_pnlpos.setBackground((android.graphics.drawable.Drawable)(_cd.getObject()));
RDebugUtils.currentLine=13828119;
 //BA.debugLineNum = 13828119;BA.debugLine="Parent.AddView(pnlpos,20dip,40dip,100dip,100dip)";
_parent.AddView((android.view.View)(_pnlpos.getObject()),__c.DipToCurrent((int) (20)),__c.DipToCurrent((int) (40)),__c.DipToCurrent((int) (100)),__c.DipToCurrent((int) (100)));
RDebugUtils.currentLine=13828121;
 //BA.debugLineNum = 13828121;BA.debugLine="Dim imgpost As Hitex_ImageView : imgpost.Initiali";
_imgpost = new com.hitex_glide.Hitex_ImageView();
RDebugUtils.currentLine=13828121;
 //BA.debugLineNum = 13828121;BA.debugLine="Dim imgpost As Hitex_ImageView : imgpost.Initiali";
_imgpost.Initialize(ba,"imgtype");
RDebugUtils.currentLine=13828122;
 //BA.debugLineNum = 13828122;BA.debugLine="pnlpos.AddView(imgpost,0,0,pnlpos.Width,pnlpos.He";
_pnlpos.AddView((android.view.View)(_imgpost.getObject()),(int) (0),(int) (0),_pnlpos.getWidth(),_pnlpos.getHeight());
RDebugUtils.currentLine=13828123;
 //BA.debugLineNum = 13828123;BA.debugLine="End Sub";
return "";
}
public String  _prfn_onpoststringerrorlistener(com.it.fome.mi_topusers __ref,com.reza.sh.fastnet.Error _error,String _tag) throws Exception{
__ref = this;
RDebugUtils.currentModule="mi_topusers";
if (Debug.shouldDelegate(ba, "prfn_onpoststringerrorlistener", false))
	 {return ((String) Debug.delegate(ba, "prfn_onpoststringerrorlistener", new Object[] {_error,_tag}));}
RDebugUtils.currentLine=14221312;
 //BA.debugLineNum = 14221312;BA.debugLine="Sub prfn_onPostStringErrorListener(Error As Respon";
RDebugUtils.currentLine=14221313;
 //BA.debugLineNum = 14221313;BA.debugLine="Log(Error.ErrorBody)";
__c.LogImpl("614221313",_error.getErrorBody(),0);
RDebugUtils.currentLine=14221314;
 //BA.debugLineNum = 14221314;BA.debugLine="ProgressDialogHide";
__c.ProgressDialogHide();
RDebugUtils.currentLine=14221315;
 //BA.debugLineNum = 14221315;BA.debugLine="RL.Refreshing=False";
__ref._rl /*wir.hitex.recycler.Hitex_RefreshLayout*/ .setRefreshing(__c.False);
RDebugUtils.currentLine=14221317;
 //BA.debugLineNum = 14221317;BA.debugLine="End Sub";
return "";
}
public String  _prfn_onpoststringoklistener(com.it.fome.mi_topusers __ref,String _result,String _tag) throws Exception{
__ref = this;
RDebugUtils.currentModule="mi_topusers";
if (Debug.shouldDelegate(ba, "prfn_onpoststringoklistener", false))
	 {return ((String) Debug.delegate(ba, "prfn_onpoststringoklistener", new Object[] {_result,_tag}));}
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.List _root = null;
anywheresoftware.b4a.objects.collections.Map _colroot = null;
String _uid = "";
String _types = "";
String _start = "";
String _finish = "";
String _id = "";
String _pic = "";
String _msg_id = "";
String _njob = "";
String _userid = "";
String _chat_id = "";
String _status = "";
String _token = "";
String _codes = "";
String _imgpost = "";
String _target = "";
RDebugUtils.currentLine=14286848;
 //BA.debugLineNum = 14286848;BA.debugLine="Sub prfn_onPostStringOkListener(Result As String";
RDebugUtils.currentLine=14286849;
 //BA.debugLineNum = 14286849;BA.debugLine="Log(Result)";
__c.LogImpl("614286849",_result,0);
RDebugUtils.currentLine=14286850;
 //BA.debugLineNum = 14286850;BA.debugLine="ProgressDialogHide";
__c.ProgressDialogHide();
RDebugUtils.currentLine=14286851;
 //BA.debugLineNum = 14286851;BA.debugLine="RL.Refreshing=False";
__ref._rl /*wir.hitex.recycler.Hitex_RefreshLayout*/ .setRefreshing(__c.False);
RDebugUtils.currentLine=14286852;
 //BA.debugLineNum = 14286852;BA.debugLine="Select Tag";
switch (BA.switchObjectToInt(_tag,"getseft","getsef")) {
case 0: {
RDebugUtils.currentLine=14286854;
 //BA.debugLineNum = 14286854;BA.debugLine="LogColor(\"msg :\"&Result,Colors.Blue)";
__c.LogImpl("614286854","msg :"+_result,__c.Colors.Blue);
RDebugUtils.currentLine=14286855;
 //BA.debugLineNum = 14286855;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=14286856;
 //BA.debugLineNum = 14286856;BA.debugLine="parser.Initialize(Result)";
_parser.Initialize(_result);
RDebugUtils.currentLine=14286857;
 //BA.debugLineNum = 14286857;BA.debugLine="Dim root As List = parser.NextArray";
_root = new anywheresoftware.b4a.objects.collections.List();
_root = _parser.NextArray();
RDebugUtils.currentLine=14286858;
 //BA.debugLineNum = 14286858;BA.debugLine="For Each colroot As Map In root";
_colroot = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group10 = _root;
final int groupLen10 = group10.getSize()
;int index10 = 0;
;
for (; index10 < groupLen10;index10++){
_colroot.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group10.Get(index10)));
RDebugUtils.currentLine=14286859;
 //BA.debugLineNum = 14286859;BA.debugLine="Dim uid As String = colroot.Get(\"uid\")";
_uid = BA.ObjectToString(_colroot.Get((Object)("uid")));
RDebugUtils.currentLine=14286860;
 //BA.debugLineNum = 14286860;BA.debugLine="Dim types As String = colroot.Get(\"types\")";
_types = BA.ObjectToString(_colroot.Get((Object)("types")));
RDebugUtils.currentLine=14286861;
 //BA.debugLineNum = 14286861;BA.debugLine="Dim start As String = colroot.Get(\"start\")";
_start = BA.ObjectToString(_colroot.Get((Object)("start")));
RDebugUtils.currentLine=14286862;
 //BA.debugLineNum = 14286862;BA.debugLine="Dim finish As String = colroot.Get(\"finish\")";
_finish = BA.ObjectToString(_colroot.Get((Object)("finish")));
RDebugUtils.currentLine=14286863;
 //BA.debugLineNum = 14286863;BA.debugLine="Dim id As String = colroot.Get(\"id\")";
_id = BA.ObjectToString(_colroot.Get((Object)("id")));
RDebugUtils.currentLine=14286864;
 //BA.debugLineNum = 14286864;BA.debugLine="Dim pic As String = colroot.Get(\"pic\")";
_pic = BA.ObjectToString(_colroot.Get((Object)("pic")));
RDebugUtils.currentLine=14286865;
 //BA.debugLineNum = 14286865;BA.debugLine="Dim msg_id As String = colroot.Get(\"msg_id\")";
_msg_id = BA.ObjectToString(_colroot.Get((Object)("msg_id")));
RDebugUtils.currentLine=14286866;
 //BA.debugLineNum = 14286866;BA.debugLine="Dim njob As String = colroot.Get(\"njob\")";
_njob = BA.ObjectToString(_colroot.Get((Object)("njob")));
RDebugUtils.currentLine=14286867;
 //BA.debugLineNum = 14286867;BA.debugLine="Dim userid As String = colroot.Get(\"userid\")";
_userid = BA.ObjectToString(_colroot.Get((Object)("userid")));
RDebugUtils.currentLine=14286868;
 //BA.debugLineNum = 14286868;BA.debugLine="Dim chat_id As String = colroot.Get(\"chat_id\")";
_chat_id = BA.ObjectToString(_colroot.Get((Object)("chat_id")));
RDebugUtils.currentLine=14286869;
 //BA.debugLineNum = 14286869;BA.debugLine="Dim status As String = colroot.Get(\"status\")";
_status = BA.ObjectToString(_colroot.Get((Object)("status")));
RDebugUtils.currentLine=14286870;
 //BA.debugLineNum = 14286870;BA.debugLine="Dim token As String = colroot.Get(\"token\")";
_token = BA.ObjectToString(_colroot.Get((Object)("token")));
RDebugUtils.currentLine=14286872;
 //BA.debugLineNum = 14286872;BA.debugLine="l_users(0).Add(uid)";
__ref._l_users /*anywheresoftware.b4a.objects.collections.List[]*/ [(int) (0)].Add((Object)(_uid));
RDebugUtils.currentLine=14286873;
 //BA.debugLineNum = 14286873;BA.debugLine="l_users(1).Add(types)";
__ref._l_users /*anywheresoftware.b4a.objects.collections.List[]*/ [(int) (1)].Add((Object)(_types));
RDebugUtils.currentLine=14286874;
 //BA.debugLineNum = 14286874;BA.debugLine="l_users(2).Add(start)";
__ref._l_users /*anywheresoftware.b4a.objects.collections.List[]*/ [(int) (2)].Add((Object)(_start));
RDebugUtils.currentLine=14286875;
 //BA.debugLineNum = 14286875;BA.debugLine="l_users(3).Add(finish)";
__ref._l_users /*anywheresoftware.b4a.objects.collections.List[]*/ [(int) (3)].Add((Object)(_finish));
RDebugUtils.currentLine=14286876;
 //BA.debugLineNum = 14286876;BA.debugLine="l_users(4).Add(id)";
__ref._l_users /*anywheresoftware.b4a.objects.collections.List[]*/ [(int) (4)].Add((Object)(_id));
RDebugUtils.currentLine=14286877;
 //BA.debugLineNum = 14286877;BA.debugLine="l_users(5).Add(userid)";
__ref._l_users /*anywheresoftware.b4a.objects.collections.List[]*/ [(int) (5)].Add((Object)(_userid));
RDebugUtils.currentLine=14286878;
 //BA.debugLineNum = 14286878;BA.debugLine="l_users(6).Add(chat_id)";
__ref._l_users /*anywheresoftware.b4a.objects.collections.List[]*/ [(int) (6)].Add((Object)(_chat_id));
RDebugUtils.currentLine=14286879;
 //BA.debugLineNum = 14286879;BA.debugLine="l_users(7).Add(status)";
__ref._l_users /*anywheresoftware.b4a.objects.collections.List[]*/ [(int) (7)].Add((Object)(_status));
RDebugUtils.currentLine=14286880;
 //BA.debugLineNum = 14286880;BA.debugLine="l_users(8).Add(token)";
__ref._l_users /*anywheresoftware.b4a.objects.collections.List[]*/ [(int) (8)].Add((Object)(_token));
RDebugUtils.currentLine=14286881;
 //BA.debugLineNum = 14286881;BA.debugLine="l_users(9).Add(pic)";
__ref._l_users /*anywheresoftware.b4a.objects.collections.List[]*/ [(int) (9)].Add((Object)(_pic));
 }
};
RDebugUtils.currentLine=14286885;
 //BA.debugLineNum = 14286885;BA.debugLine="LV.notifyDataSetChanged";
__ref._lv /*wir.hitex.recycler.Hitex_LayoutView*/ .notifyDataSetChanged();
 break; }
case 1: {
RDebugUtils.currentLine=14286890;
 //BA.debugLineNum = 14286890;BA.debugLine="If Result.Length>20 Then";
if (_result.length()>20) { 
RDebugUtils.currentLine=14286892;
 //BA.debugLineNum = 14286892;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=14286893;
 //BA.debugLineNum = 14286893;BA.debugLine="parser.Initialize(Result)";
_parser.Initialize(_result);
RDebugUtils.currentLine=14286894;
 //BA.debugLineNum = 14286894;BA.debugLine="Dim root As List = parser.NextArray";
_root = new anywheresoftware.b4a.objects.collections.List();
_root = _parser.NextArray();
RDebugUtils.currentLine=14286895;
 //BA.debugLineNum = 14286895;BA.debugLine="For Each colroot As Map In root";
_colroot = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group40 = _root;
final int groupLen40 = group40.getSize()
;int index40 = 0;
;
for (; index40 < groupLen40;index40++){
_colroot.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group40.Get(index40)));
RDebugUtils.currentLine=14286896;
 //BA.debugLineNum = 14286896;BA.debugLine="Dim uid As String = colroot.Get(\"uid\")";
_uid = BA.ObjectToString(_colroot.Get((Object)("uid")));
RDebugUtils.currentLine=14286897;
 //BA.debugLineNum = 14286897;BA.debugLine="Dim codes As String = colroot.Get(\"codes\")";
_codes = BA.ObjectToString(_colroot.Get((Object)("codes")));
RDebugUtils.currentLine=14286898;
 //BA.debugLineNum = 14286898;BA.debugLine="Dim types As String = colroot.Get(\"types\")";
_types = BA.ObjectToString(_colroot.Get((Object)("types")));
RDebugUtils.currentLine=14286899;
 //BA.debugLineNum = 14286899;BA.debugLine="Dim start As String = colroot.Get(\"start\")";
_start = BA.ObjectToString(_colroot.Get((Object)("start")));
RDebugUtils.currentLine=14286900;
 //BA.debugLineNum = 14286900;BA.debugLine="Dim finish As String = colroot.Get(\"finish\")";
_finish = BA.ObjectToString(_colroot.Get((Object)("finish")));
RDebugUtils.currentLine=14286901;
 //BA.debugLineNum = 14286901;BA.debugLine="Dim id As String = colroot.Get(\"id\")";
_id = BA.ObjectToString(_colroot.Get((Object)("id")));
RDebugUtils.currentLine=14286902;
 //BA.debugLineNum = 14286902;BA.debugLine="Dim userid As String = colroot.Get(\"userid\")";
_userid = BA.ObjectToString(_colroot.Get((Object)("userid")));
RDebugUtils.currentLine=14286903;
 //BA.debugLineNum = 14286903;BA.debugLine="Dim imgpost As String = colroot.Get(\"imgpost\"";
_imgpost = BA.ObjectToString(_colroot.Get((Object)("imgpost")));
RDebugUtils.currentLine=14286904;
 //BA.debugLineNum = 14286904;BA.debugLine="Dim target As String = colroot.Get(\"target\")";
_target = BA.ObjectToString(_colroot.Get((Object)("target")));
RDebugUtils.currentLine=14286905;
 //BA.debugLineNum = 14286905;BA.debugLine="Dim status As String = colroot.Get(\"status\")";
_status = BA.ObjectToString(_colroot.Get((Object)("status")));
RDebugUtils.currentLine=14286906;
 //BA.debugLineNum = 14286906;BA.debugLine="Dim token As String = colroot.Get(\"token\")";
_token = BA.ObjectToString(_colroot.Get((Object)("token")));
RDebugUtils.currentLine=14286908;
 //BA.debugLineNum = 14286908;BA.debugLine="l_users(0).Add(uid)";
__ref._l_users /*anywheresoftware.b4a.objects.collections.List[]*/ [(int) (0)].Add((Object)(_uid));
RDebugUtils.currentLine=14286909;
 //BA.debugLineNum = 14286909;BA.debugLine="l_users(1).Add(types)";
__ref._l_users /*anywheresoftware.b4a.objects.collections.List[]*/ [(int) (1)].Add((Object)(_types));
RDebugUtils.currentLine=14286910;
 //BA.debugLineNum = 14286910;BA.debugLine="l_users(2).Add(start)";
__ref._l_users /*anywheresoftware.b4a.objects.collections.List[]*/ [(int) (2)].Add((Object)(_start));
RDebugUtils.currentLine=14286911;
 //BA.debugLineNum = 14286911;BA.debugLine="l_users(3).Add(finish)";
__ref._l_users /*anywheresoftware.b4a.objects.collections.List[]*/ [(int) (3)].Add((Object)(_finish));
RDebugUtils.currentLine=14286912;
 //BA.debugLineNum = 14286912;BA.debugLine="l_users(4).Add(id)";
__ref._l_users /*anywheresoftware.b4a.objects.collections.List[]*/ [(int) (4)].Add((Object)(_id));
RDebugUtils.currentLine=14286913;
 //BA.debugLineNum = 14286913;BA.debugLine="l_users(5).Add(userid)";
__ref._l_users /*anywheresoftware.b4a.objects.collections.List[]*/ [(int) (5)].Add((Object)(_userid));
RDebugUtils.currentLine=14286914;
 //BA.debugLineNum = 14286914;BA.debugLine="l_users(6).Add(target)";
__ref._l_users /*anywheresoftware.b4a.objects.collections.List[]*/ [(int) (6)].Add((Object)(_target));
RDebugUtils.currentLine=14286915;
 //BA.debugLineNum = 14286915;BA.debugLine="l_users(7).Add(status)";
__ref._l_users /*anywheresoftware.b4a.objects.collections.List[]*/ [(int) (7)].Add((Object)(_status));
RDebugUtils.currentLine=14286916;
 //BA.debugLineNum = 14286916;BA.debugLine="l_users(8).Add(token)";
__ref._l_users /*anywheresoftware.b4a.objects.collections.List[]*/ [(int) (8)].Add((Object)(_token));
RDebugUtils.currentLine=14286917;
 //BA.debugLineNum = 14286917;BA.debugLine="l_users(9).Add(imgpost)";
__ref._l_users /*anywheresoftware.b4a.objects.collections.List[]*/ [(int) (9)].Add((Object)(_imgpost));
RDebugUtils.currentLine=14286918;
 //BA.debugLineNum = 14286918;BA.debugLine="l_users(10).Add(codes)";
__ref._l_users /*anywheresoftware.b4a.objects.collections.List[]*/ [(int) (10)].Add((Object)(_codes));
 }
};
RDebugUtils.currentLine=14286922;
 //BA.debugLineNum = 14286922;BA.debugLine="LV.notifyDataSetChanged";
__ref._lv /*wir.hitex.recycler.Hitex_LayoutView*/ .notifyDataSetChanged();
 }else {
RDebugUtils.currentLine=14286927;
 //BA.debugLineNum = 14286927;BA.debugLine="ToastMessageShow(\"سفارشی یافت نشد\",False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("سفارشی یافت نشد"),__c.False);
 };
 break; }
}
;
RDebugUtils.currentLine=14286933;
 //BA.debugLineNum = 14286933;BA.debugLine="End Sub";
return "";
}
public String  _rl_onrefresh(com.it.fome.mi_topusers __ref,int _direction) throws Exception{
__ref = this;
RDebugUtils.currentModule="mi_topusers";
if (Debug.shouldDelegate(ba, "rl_onrefresh", false))
	 {return ((String) Debug.delegate(ba, "rl_onrefresh", new Object[] {_direction}));}
int _ia = 0;
RDebugUtils.currentLine=14024704;
 //BA.debugLineNum = 14024704;BA.debugLine="Sub RL_onRefresh (Direction As Int)";
RDebugUtils.currentLine=14024706;
 //BA.debugLineNum = 14024706;BA.debugLine="Select (Direction)";
switch (BA.switchObjectToInt((_direction),__ref._rl /*wir.hitex.recycler.Hitex_RefreshLayout*/ .DIRECTION_TOP,__ref._rl /*wir.hitex.recycler.Hitex_RefreshLayout*/ .DIRECTION_BOTTOM)) {
case 0: {
RDebugUtils.currentLine=14024708;
 //BA.debugLineNum = 14024708;BA.debugLine="Log(\"TOP\")";
__c.LogImpl("614024708","TOP",0);
RDebugUtils.currentLine=14024709;
 //BA.debugLineNum = 14024709;BA.debugLine="For ia=0 To 38";
{
final int step4 = 1;
final int limit4 = (int) (38);
_ia = (int) (0) ;
for (;_ia <= limit4 ;_ia = _ia + step4 ) {
RDebugUtils.currentLine=14024711;
 //BA.debugLineNum = 14024711;BA.debugLine="l_users(ia).Initialize";
__ref._l_users /*anywheresoftware.b4a.objects.collections.List[]*/ [_ia].Initialize();
 }
};
RDebugUtils.currentLine=14024717;
 //BA.debugLineNum = 14024717;BA.debugLine="Select type_history";
switch (BA.switchObjectToInt(__ref._type_history /*int*/ ,(int) (0),(int) (1))) {
case 0: {
RDebugUtils.currentLine=14024719;
 //BA.debugLineNum = 14024719;BA.debugLine="req_getme(i_pk)";
__ref._req_getme /*String*/ (null,__ref._i_pk /*String*/ );
 break; }
case 1: {
RDebugUtils.currentLine=14024722;
 //BA.debugLineNum = 14024722;BA.debugLine="req_telegetme(userid_t)";
__ref._req_telegetme /*String*/ (null,__ref._userid_t /*String*/ );
 break; }
}
;
RDebugUtils.currentLine=14024726;
 //BA.debugLineNum = 14024726;BA.debugLine="LV.notifyDataSetChanged";
__ref._lv /*wir.hitex.recycler.Hitex_LayoutView*/ .notifyDataSetChanged();
 break; }
case 1: {
RDebugUtils.currentLine=14024729;
 //BA.debugLineNum = 14024729;BA.debugLine="Log(\"BOTTOM\")";
__c.LogImpl("614024729","BOTTOM",0);
 break; }
}
;
RDebugUtils.currentLine=14024732;
 //BA.debugLineNum = 14024732;BA.debugLine="End Sub";
return "";
}
}