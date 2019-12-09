package com.it.fome;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class mt_sef extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "com.it.fome.mt_sef");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", com.it.fome.mt_sef.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public String _ev = "";
public Object _obj = null;
public anywheresoftware.b4a.sql.SQL _sql1 = null;
public anywheresoftware.b4a.sql.SQL.CursorWrapper _cursor1 = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnl_tolbar = null;
public wir.hitex.recycler.Hitex_LayoutView _lv = null;
public com.hitex_glide.Hitex_Glide _glide = null;
public com.reza.sh.fastnet.Fastnet _prfn = null;
public String _i_username = "";
public String _i_pk = "";
public String _i_cookie = "";
public String _i_pic = "";
public anywheresoftware.b4a.objects.PanelWrapper _pnl_main = null;
public int _type_sef = 0;
public com.flycoroundview.mc7.MC7RoundView _roundview = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnl_posts = null;
public com.reza.sh.fastnet.UploadRequest _upl = null;
public com.reza.sh.fastnet.Fastnet _pr = null;
public anywheresoftware.b4a.objects.collections.List[] _list_f = null;
public anywheresoftware.b4a.objects.collections.List[] _list_l = null;
public anywheresoftware.b4a.objects.collections.List[] _list_v = null;
public anywheresoftware.b4a.objects.collections.List[] _list_c = null;
public String _str_name = "";
public String _cm = "";
public long _r_coins = 0L;
public long _r_nums = 0L;
public de.amberhome.materialdialogs.MaterialDialogWrapper _progressdialog = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnl_coms = null;
public String _username_t = "";
public String _userid_t = "";
public String _img_address_target = "";
public String _username_target = "";
public String _chatid_target = "";
public String _idchannel_t = "";
public String _titelchat_target = "";
public String _us_name = "";
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
public String  _initialize(com.it.fome.mt_sef __ref,anywheresoftware.b4a.BA _ba,String _eventname,Object _module) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="mt_sef";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_eventname,_module}));}
int _ia = 0;
int _i = 0;
RDebugUtils.currentLine=16056320;
 //BA.debugLineNum = 16056320;BA.debugLine="Public Sub Initialize(EventName As String,Module A";
RDebugUtils.currentLine=16056321;
 //BA.debugLineNum = 16056321;BA.debugLine="Ev = EventName";
__ref._ev /*String*/  = _eventname;
RDebugUtils.currentLine=16056322;
 //BA.debugLineNum = 16056322;BA.debugLine="obj = Module";
__ref._obj /*Object*/  = _module;
RDebugUtils.currentLine=16056323;
 //BA.debugLineNum = 16056323;BA.debugLine="pr.initialize(\"pr\")";
__ref._pr /*com.reza.sh.fastnet.Fastnet*/ .initialize(ba,"pr");
RDebugUtils.currentLine=16056326;
 //BA.debugLineNum = 16056326;BA.debugLine="For ia=0 To 38";
{
final int step4 = 1;
final int limit4 = (int) (38);
_ia = (int) (0) ;
for (;_ia <= limit4 ;_ia = _ia + step4 ) {
RDebugUtils.currentLine=16056328;
 //BA.debugLineNum = 16056328;BA.debugLine="list_f(ia).Initialize";
__ref._list_f /*anywheresoftware.b4a.objects.collections.List[]*/ [_ia].Initialize();
RDebugUtils.currentLine=16056329;
 //BA.debugLineNum = 16056329;BA.debugLine="list_l(ia).Initialize";
__ref._list_l /*anywheresoftware.b4a.objects.collections.List[]*/ [_ia].Initialize();
RDebugUtils.currentLine=16056330;
 //BA.debugLineNum = 16056330;BA.debugLine="list_v(ia).Initialize";
__ref._list_v /*anywheresoftware.b4a.objects.collections.List[]*/ [_ia].Initialize();
RDebugUtils.currentLine=16056331;
 //BA.debugLineNum = 16056331;BA.debugLine="list_c(ia).Initialize";
__ref._list_c /*anywheresoftware.b4a.objects.collections.List[]*/ [_ia].Initialize();
 }
};
RDebugUtils.currentLine=16056336;
 //BA.debugLineNum = 16056336;BA.debugLine="If File.Exists(File.DirInternal,\"instadb.db\")=Fal";
if (__c.File.Exists(__c.File.getDirInternal(),"instadb.db")==__c.False) { 
RDebugUtils.currentLine=16056337;
 //BA.debugLineNum = 16056337;BA.debugLine="File.Copy(File.DirAssets,\"instadb.db\",File.DirIn";
__c.File.Copy(__c.File.getDirAssets(),"instadb.db",__c.File.getDirInternal(),"instadb.db");
 };
RDebugUtils.currentLine=16056339;
 //BA.debugLineNum = 16056339;BA.debugLine="If sql1.IsInitialized=False Then";
if (__ref._sql1 /*anywheresoftware.b4a.sql.SQL*/ .IsInitialized()==__c.False) { 
RDebugUtils.currentLine=16056340;
 //BA.debugLineNum = 16056340;BA.debugLine="sql1.Initialize(File.DirInternal,\"instadb.db\",Fa";
__ref._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Initialize(__c.File.getDirInternal(),"instadb.db",__c.False);
 };
RDebugUtils.currentLine=16056344;
 //BA.debugLineNum = 16056344;BA.debugLine="cursor1 = sql1.ExecQuery(\"SELECT * FROM tbl_tele";
__ref._cursor1 /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .setObject((android.database.Cursor)(__ref._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM tbl_tele WHERE soich='1'")));
RDebugUtils.currentLine=16056345;
 //BA.debugLineNum = 16056345;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=16056346;
 //BA.debugLineNum = 16056346;BA.debugLine="For i=0 To cursor1.RowCount-1";
{
final int step18 = 1;
final int limit18 = (int) (__ref._cursor1 /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit18 ;_i = _i + step18 ) {
RDebugUtils.currentLine=16056347;
 //BA.debugLineNum = 16056347;BA.debugLine="cursor1.Position=i";
__ref._cursor1 /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .setPosition(_i);
RDebugUtils.currentLine=16056348;
 //BA.debugLineNum = 16056348;BA.debugLine="userid_t=cursor1.GetString(\"userid\")";
__ref._userid_t /*String*/  = __ref._cursor1 /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .GetString("userid");
RDebugUtils.currentLine=16056349;
 //BA.debugLineNum = 16056349;BA.debugLine="username_t=cursor1.GetString(\"username\")";
__ref._username_t /*String*/  = __ref._cursor1 /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .GetString("username");
 }
};
RDebugUtils.currentLine=16056351;
 //BA.debugLineNum = 16056351;BA.debugLine="cursor1.Close";
__ref._cursor1 /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .Close();
RDebugUtils.currentLine=16056353;
 //BA.debugLineNum = 16056353;BA.debugLine="Log(\"username : \"&userid_t)";
__c.LogImpl("616056353","username : "+__ref._userid_t /*String*/ ,0);
RDebugUtils.currentLine=16056355;
 //BA.debugLineNum = 16056355;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.ConcreteViewWrapper  _addpnl(com.it.fome.mt_sef __ref,anywheresoftware.b4a.objects.PanelWrapper _pnl) throws Exception{
__ref = this;
RDebugUtils.currentModule="mt_sef";
if (Debug.shouldDelegate(ba, "addpnl", false))
	 {return ((anywheresoftware.b4a.objects.ConcreteViewWrapper) Debug.delegate(ba, "addpnl", new Object[] {_pnl}));}
int _ia = 0;
RDebugUtils.currentLine=16121856;
 //BA.debugLineNum = 16121856;BA.debugLine="Sub addpnl(pnl As Panel) As View";
RDebugUtils.currentLine=16121857;
 //BA.debugLineNum = 16121857;BA.debugLine="For ia=0 To 38";
{
final int step1 = 1;
final int limit1 = (int) (38);
_ia = (int) (0) ;
for (;_ia <= limit1 ;_ia = _ia + step1 ) {
RDebugUtils.currentLine=16121859;
 //BA.debugLineNum = 16121859;BA.debugLine="list_f(ia).Initialize";
__ref._list_f /*anywheresoftware.b4a.objects.collections.List[]*/ [_ia].Initialize();
RDebugUtils.currentLine=16121860;
 //BA.debugLineNum = 16121860;BA.debugLine="list_l(ia).Initialize";
__ref._list_l /*anywheresoftware.b4a.objects.collections.List[]*/ [_ia].Initialize();
RDebugUtils.currentLine=16121861;
 //BA.debugLineNum = 16121861;BA.debugLine="list_v(ia).Initialize";
__ref._list_v /*anywheresoftware.b4a.objects.collections.List[]*/ [_ia].Initialize();
RDebugUtils.currentLine=16121862;
 //BA.debugLineNum = 16121862;BA.debugLine="list_c(ia).Initialize";
__ref._list_c /*anywheresoftware.b4a.objects.collections.List[]*/ [_ia].Initialize();
 }
};
RDebugUtils.currentLine=16121865;
 //BA.debugLineNum = 16121865;BA.debugLine="Select Type_sef";
switch (BA.switchObjectToInt(__ref._type_sef /*int*/ ,(int) (0),(int) (1),(int) (2),(int) (3),(int) (4))) {
case 0: {
RDebugUtils.currentLine=16121868;
 //BA.debugLineNum = 16121868;BA.debugLine="list_f(1).AddAll(Array As String(\"50\",\"100\",\"20";
__ref._list_f /*anywheresoftware.b4a.objects.collections.List[]*/ [(int) (1)].AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"50","100","200","300","400","500","600","700","800","900","1000","2000"}));
RDebugUtils.currentLine=16121869;
 //BA.debugLineNum = 16121869;BA.debugLine="list_f(2).AddAll(Array As String(\"100\",\"200\",\"3";
__ref._list_f /*anywheresoftware.b4a.objects.collections.List[]*/ [(int) (2)].AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"100","200","300","600","800","1000","1200","1400","1600","1800","2000","4000"}));
 break; }
case 1: {
RDebugUtils.currentLine=16121872;
 //BA.debugLineNum = 16121872;BA.debugLine="list_l(1).AddAll(Array As String(\"50\",\"100\",\"20";
__ref._list_l /*anywheresoftware.b4a.objects.collections.List[]*/ [(int) (1)].AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"50","100","200","300","400","500","600","700","800","900","1000","2000"}));
RDebugUtils.currentLine=16121873;
 //BA.debugLineNum = 16121873;BA.debugLine="list_l(2).AddAll(Array As String(\"100\",\"200\",\"3";
__ref._list_l /*anywheresoftware.b4a.objects.collections.List[]*/ [(int) (2)].AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"100","200","300","600","800","1000","1200","1400","1600","1800","2000","4000"}));
 break; }
case 2: {
RDebugUtils.currentLine=16121876;
 //BA.debugLineNum = 16121876;BA.debugLine="list_c(1).AddAll(Array As String(\"50\",\"100\",\"20";
__ref._list_c /*anywheresoftware.b4a.objects.collections.List[]*/ [(int) (1)].AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"50","100","200","300","400","500","600","700","800","900","1000","2000"}));
RDebugUtils.currentLine=16121877;
 //BA.debugLineNum = 16121877;BA.debugLine="list_c(2).AddAll(Array As String(\"100\",\"200\",\"3";
__ref._list_c /*anywheresoftware.b4a.objects.collections.List[]*/ [(int) (2)].AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"100","200","300","600","800","1000","1200","1400","1600","1800","2000","4000"}));
 break; }
case 3: {
RDebugUtils.currentLine=16121880;
 //BA.debugLineNum = 16121880;BA.debugLine="list_v(1).AddAll(Array As String(\"50\",\"100\",\"20";
__ref._list_v /*anywheresoftware.b4a.objects.collections.List[]*/ [(int) (1)].AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"50","100","200","300","400","500","600","700","800","900","1000","2000"}));
RDebugUtils.currentLine=16121881;
 //BA.debugLineNum = 16121881;BA.debugLine="list_v(2).AddAll(Array As String(\"100\",\"200\",\"3";
__ref._list_v /*anywheresoftware.b4a.objects.collections.List[]*/ [(int) (2)].AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"100","200","300","600","800","1000","1200","1400","1600","1800","2000","4000"}));
 break; }
case 4: {
RDebugUtils.currentLine=16121884;
 //BA.debugLineNum = 16121884;BA.debugLine="list_f(1).AddAll(Array As String(\"50\",\"100\",\"20";
__ref._list_f /*anywheresoftware.b4a.objects.collections.List[]*/ [(int) (1)].AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"50","100","200","300","400","500","600","700","800","900","1000","2000"}));
RDebugUtils.currentLine=16121885;
 //BA.debugLineNum = 16121885;BA.debugLine="list_f(2).AddAll(Array As String(\"100\",\"200\",\"3";
__ref._list_f /*anywheresoftware.b4a.objects.collections.List[]*/ [(int) (2)].AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"100","200","300","600","800","1000","1200","1400","1600","1800","2000","4000"}));
 break; }
}
;
RDebugUtils.currentLine=16121891;
 //BA.debugLineNum = 16121891;BA.debugLine="pnl_main.Initialize(\"pnl_main\")";
__ref._pnl_main /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"pnl_main");
RDebugUtils.currentLine=16121892;
 //BA.debugLineNum = 16121892;BA.debugLine="pnl_main.Color=Colors.White";
__ref._pnl_main /*anywheresoftware.b4a.objects.PanelWrapper*/ .setColor(__c.Colors.White);
RDebugUtils.currentLine=16121893;
 //BA.debugLineNum = 16121893;BA.debugLine="pnl.AddView(pnl_main,0,0,pnl.Width,pnl.Height)";
_pnl.AddView((android.view.View)(__ref._pnl_main /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()),(int) (0),(int) (0),_pnl.getWidth(),_pnl.getHeight());
RDebugUtils.currentLine=16121895;
 //BA.debugLineNum = 16121895;BA.debugLine="LV.Initializer(\"LV\").ListView.Build";
__ref._lv /*wir.hitex.recycler.Hitex_LayoutView*/ .Initializer(ba,"LV").ListView().Build();
RDebugUtils.currentLine=16121896;
 //BA.debugLineNum = 16121896;BA.debugLine="pnl_main.AddView(LV,0,0,pnl_main.Width,pnl_main.H";
__ref._pnl_main /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._lv /*wir.hitex.recycler.Hitex_LayoutView*/ .getObject()),(int) (0),(int) (0),__ref._pnl_main /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth(),__ref._pnl_main /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight());
RDebugUtils.currentLine=16121900;
 //BA.debugLineNum = 16121900;BA.debugLine="LV.Show";
__ref._lv /*wir.hitex.recycler.Hitex_LayoutView*/ .Show();
RDebugUtils.currentLine=16121902;
 //BA.debugLineNum = 16121902;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(com.it.fome.mt_sef __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mt_sef";
RDebugUtils.currentLine=15990784;
 //BA.debugLineNum = 15990784;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=15990785;
 //BA.debugLineNum = 15990785;BA.debugLine="Private Ev As String";
_ev = "";
RDebugUtils.currentLine=15990786;
 //BA.debugLineNum = 15990786;BA.debugLine="Private obj As Object";
_obj = new Object();
RDebugUtils.currentLine=15990787;
 //BA.debugLineNum = 15990787;BA.debugLine="Private sql1 As SQL";
_sql1 = new anywheresoftware.b4a.sql.SQL();
RDebugUtils.currentLine=15990788;
 //BA.debugLineNum = 15990788;BA.debugLine="Private cursor1 As Cursor";
_cursor1 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=15990789;
 //BA.debugLineNum = 15990789;BA.debugLine="Private pnl_tolbar As Panel";
_pnl_tolbar = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=15990790;
 //BA.debugLineNum = 15990790;BA.debugLine="Private LV As Hitex_LayoutView";
_lv = new wir.hitex.recycler.Hitex_LayoutView();
RDebugUtils.currentLine=15990791;
 //BA.debugLineNum = 15990791;BA.debugLine="Private Glide As Hitex_Glide";
_glide = new com.hitex_glide.Hitex_Glide();
RDebugUtils.currentLine=15990792;
 //BA.debugLineNum = 15990792;BA.debugLine="Private prfn As PersianFastNetwork";
_prfn = new com.reza.sh.fastnet.Fastnet();
RDebugUtils.currentLine=15990793;
 //BA.debugLineNum = 15990793;BA.debugLine="Private i_username ,i_pk,i_cookie,i_pic As String";
_i_username = "";
_i_pk = "";
_i_cookie = "";
_i_pic = "";
RDebugUtils.currentLine=15990794;
 //BA.debugLineNum = 15990794;BA.debugLine="Private pnl_main As Panel";
_pnl_main = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=15990796;
 //BA.debugLineNum = 15990796;BA.debugLine="Public Type_sef As Int";
_type_sef = 0;
RDebugUtils.currentLine=15990797;
 //BA.debugLineNum = 15990797;BA.debugLine="Private LV As Hitex_LayoutView";
_lv = new wir.hitex.recycler.Hitex_LayoutView();
RDebugUtils.currentLine=15990798;
 //BA.debugLineNum = 15990798;BA.debugLine="Private Glide As Hitex_Glide";
_glide = new com.hitex_glide.Hitex_Glide();
RDebugUtils.currentLine=15990799;
 //BA.debugLineNum = 15990799;BA.debugLine="Private roundview As MC7RoundView";
_roundview = new com.flycoroundview.mc7.MC7RoundView();
RDebugUtils.currentLine=15990800;
 //BA.debugLineNum = 15990800;BA.debugLine="Private pnl_posts As Panel";
_pnl_posts = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=15990802;
 //BA.debugLineNum = 15990802;BA.debugLine="Private upl As UploadRequest";
_upl = new com.reza.sh.fastnet.UploadRequest();
RDebugUtils.currentLine=15990803;
 //BA.debugLineNum = 15990803;BA.debugLine="Dim pr As PersianFastNetwork";
_pr = new com.reza.sh.fastnet.Fastnet();
RDebugUtils.currentLine=15990805;
 //BA.debugLineNum = 15990805;BA.debugLine="Private list_f(40),list_l(40),list_v(40),list_c(4";
_list_f = new anywheresoftware.b4a.objects.collections.List[(int) (40)];
{
int d0 = _list_f.length;
for (int i0 = 0;i0 < d0;i0++) {
_list_f[i0] = new anywheresoftware.b4a.objects.collections.List();
}
}
;
_list_l = new anywheresoftware.b4a.objects.collections.List[(int) (40)];
{
int d0 = _list_l.length;
for (int i0 = 0;i0 < d0;i0++) {
_list_l[i0] = new anywheresoftware.b4a.objects.collections.List();
}
}
;
_list_v = new anywheresoftware.b4a.objects.collections.List[(int) (40)];
{
int d0 = _list_v.length;
for (int i0 = 0;i0 < d0;i0++) {
_list_v[i0] = new anywheresoftware.b4a.objects.collections.List();
}
}
;
_list_c = new anywheresoftware.b4a.objects.collections.List[(int) (40)];
{
int d0 = _list_c.length;
for (int i0 = 0;i0 < d0;i0++) {
_list_c[i0] = new anywheresoftware.b4a.objects.collections.List();
}
}
;
RDebugUtils.currentLine=15990806;
 //BA.debugLineNum = 15990806;BA.debugLine="Dim str_name,cm As String";
_str_name = "";
_cm = "";
RDebugUtils.currentLine=15990807;
 //BA.debugLineNum = 15990807;BA.debugLine="Dim r_coins,r_nums As Long";
_r_coins = 0L;
_r_nums = 0L;
RDebugUtils.currentLine=15990808;
 //BA.debugLineNum = 15990808;BA.debugLine="Private progressDialog As MaterialDialog";
_progressdialog = new de.amberhome.materialdialogs.MaterialDialogWrapper();
RDebugUtils.currentLine=15990809;
 //BA.debugLineNum = 15990809;BA.debugLine="Dim pnl_coms As Panel";
_pnl_coms = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=15990810;
 //BA.debugLineNum = 15990810;BA.debugLine="Dim username_t ,userid_t As String";
_username_t = "";
_userid_t = "";
RDebugUtils.currentLine=15990812;
 //BA.debugLineNum = 15990812;BA.debugLine="Dim img_address_target As String";
_img_address_target = "";
RDebugUtils.currentLine=15990813;
 //BA.debugLineNum = 15990813;BA.debugLine="Dim username_target As String";
_username_target = "";
RDebugUtils.currentLine=15990814;
 //BA.debugLineNum = 15990814;BA.debugLine="Dim chatid_target,idchannel_t,titelchat_target  A";
_chatid_target = "";
_idchannel_t = "";
_titelchat_target = "";
RDebugUtils.currentLine=15990815;
 //BA.debugLineNum = 15990815;BA.debugLine="Dim us_name As String";
_us_name = "";
RDebugUtils.currentLine=15990816;
 //BA.debugLineNum = 15990816;BA.debugLine="End Sub";
return "";
}
public String  _dialog_buttonpressed(com.it.fome.mt_sef __ref,de.amberhome.materialdialogs.MaterialDialogWrapper _dialog,String _action) throws Exception{
__ref = this;
RDebugUtils.currentModule="mt_sef";
if (Debug.shouldDelegate(ba, "dialog_buttonpressed", false))
	 {return ((String) Debug.delegate(ba, "dialog_buttonpressed", new Object[] {_dialog,_action}));}
int _i = 0;
de.amberhome.materialdialogs.MaterialDialogBuilderWrapper _builder = null;
com.valdesekamdem.library.mdtoast.MaterialToast _mtoasst = null;
RDebugUtils.currentLine=16449536;
 //BA.debugLineNum = 16449536;BA.debugLine="Sub Dialog_ButtonPressed (Dialog As MaterialDialog";
RDebugUtils.currentLine=16449537;
 //BA.debugLineNum = 16449537;BA.debugLine="Log(Action)";
__c.LogImpl("616449537",_action,0);
RDebugUtils.currentLine=16449538;
 //BA.debugLineNum = 16449538;BA.debugLine="Select Action";
switch (BA.switchObjectToInt(_action,"POSITIVE")) {
case 0: {
RDebugUtils.currentLine=16449542;
 //BA.debugLineNum = 16449542;BA.debugLine="cursor1 = sql1.ExecQuery(\"SELECT * FROM tbl_coi";
__ref._cursor1 /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .setObject((android.database.Cursor)(__ref._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM tbl_coin WHERE userid='"+__ref._userid_t /*String*/ +"' ")));
RDebugUtils.currentLine=16449543;
 //BA.debugLineNum = 16449543;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=16449544;
 //BA.debugLineNum = 16449544;BA.debugLine="For i=0 To cursor1.RowCount-1";
{
final int step6 = 1;
final int limit6 = (int) (__ref._cursor1 /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
RDebugUtils.currentLine=16449545;
 //BA.debugLineNum = 16449545;BA.debugLine="cursor1.Position=i";
__ref._cursor1 /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .setPosition(_i);
RDebugUtils.currentLine=16449546;
 //BA.debugLineNum = 16449546;BA.debugLine="cm=cursor1.GetString(\"cm\")";
__ref._cm /*String*/  = __ref._cursor1 /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .GetString("cm");
 }
};
RDebugUtils.currentLine=16449549;
 //BA.debugLineNum = 16449549;BA.debugLine="If r_coins<cm Or r_coins=cm Then";
if (__ref._r_coins /*long*/ <(double)(Double.parseDouble(__ref._cm /*String*/ )) || __ref._r_coins /*long*/ ==(double)(Double.parseDouble(__ref._cm /*String*/ ))) { 
RDebugUtils.currentLine=16449550;
 //BA.debugLineNum = 16449550;BA.debugLine="Dim Builder As MaterialDialogBuilder";
_builder = new de.amberhome.materialdialogs.MaterialDialogBuilderWrapper();
RDebugUtils.currentLine=16449551;
 //BA.debugLineNum = 16449551;BA.debugLine="Builder.Initialize(\"Dialog\")";
_builder.Initialize(ba,"Dialog");
RDebugUtils.currentLine=16449552;
 //BA.debugLineNum = 16449552;BA.debugLine="Builder.Title(\"سفارش ممبر\")";
_builder.Title(BA.ObjectToCharSequence("سفارش ممبر"));
RDebugUtils.currentLine=16449553;
 //BA.debugLineNum = 16449553;BA.debugLine="Builder.Content(\"درحال ثبت سفارش ...\")";
_builder.Content(BA.ObjectToCharSequence("درحال ثبت سفارش ..."));
RDebugUtils.currentLine=16449554;
 //BA.debugLineNum = 16449554;BA.debugLine="Builder.Progress(True, 0)";
_builder.Progress(__c.True,(int) (0));
RDebugUtils.currentLine=16449555;
 //BA.debugLineNum = 16449555;BA.debugLine="Builder.ProgressIndeterminateStyle(True)";
_builder.ProgressIndeterminateStyle(__c.True);
RDebugUtils.currentLine=16449556;
 //BA.debugLineNum = 16449556;BA.debugLine="progressDialog = Builder.Show";
__ref._progressdialog /*de.amberhome.materialdialogs.MaterialDialogWrapper*/  = _builder.Show();
RDebugUtils.currentLine=16449559;
 //BA.debugLineNum = 16449559;BA.debugLine="Log(img_address_target)";
__c.LogImpl("616449559",__ref._img_address_target /*String*/ ,0);
RDebugUtils.currentLine=16449560;
 //BA.debugLineNum = 16449560;BA.debugLine="Log(username_target)";
__c.LogImpl("616449560",__ref._username_target /*String*/ ,0);
RDebugUtils.currentLine=16449561;
 //BA.debugLineNum = 16449561;BA.debugLine="If img_address_target=\"http://filework.ir/INST";
if ((__ref._img_address_target /*String*/ ).equals("http://filework.ir/INSTAFOLLOW/api/asset/noimage.png")) { 
RDebugUtils.currentLine=16449562;
 //BA.debugLineNum = 16449562;BA.debugLine="reqsef(userid_t,\"1\",username_target,r_nums,\"0";
__ref._reqsef /*String*/ (null,__ref._userid_t /*String*/ ,"1",__ref._username_target /*String*/ ,BA.NumberToString(__ref._r_nums /*long*/ ),"0","0","noimage.png");
 }else {
RDebugUtils.currentLine=16449565;
 //BA.debugLineNum = 16449565;BA.debugLine="upload(img_address_target,\"\",\"\",\"\")";
__ref._upload /*String*/ (null,__ref._img_address_target /*String*/ ,"","","");
 };
 }else {
RDebugUtils.currentLine=16449570;
 //BA.debugLineNum = 16449570;BA.debugLine="Dim mtoasst As KJ_MaterialToast";
_mtoasst = new com.valdesekamdem.library.mdtoast.MaterialToast();
RDebugUtils.currentLine=16449571;
 //BA.debugLineNum = 16449571;BA.debugLine="mtoasst.Initialize(\"سکه شما جهت سفارش این مقدا";
_mtoasst.Initialize(ba,"سکه شما جهت سفارش این مقدار کافی نمیباشد",_mtoasst.LENGTH_SHORT,_mtoasst.TYPE_WARNING);
RDebugUtils.currentLine=16449572;
 //BA.debugLineNum = 16449572;BA.debugLine="Return";
if (true) return "";
 };
 break; }
}
;
RDebugUtils.currentLine=16449580;
 //BA.debugLineNum = 16449580;BA.debugLine="End Sub";
return "";
}
public String  _reqsef(com.it.fome.mt_sef __ref,String _userid,String _types,String _chat_ida,String _finish,String _msg_ida,String _njob,String _picname) throws Exception{
__ref = this;
RDebugUtils.currentModule="mt_sef";
if (Debug.shouldDelegate(ba, "reqsef", false))
	 {return ((String) Debug.delegate(ba, "reqsef", new Object[] {_userid,_types,_chat_ida,_finish,_msg_ida,_njob,_picname}));}
com.reza.sh.fastnet.PostRequestRaper _post = null;
RDebugUtils.currentLine=16908288;
 //BA.debugLineNum = 16908288;BA.debugLine="Sub reqsef(userid As String,types As String,chat_i";
RDebugUtils.currentLine=16908291;
 //BA.debugLineNum = 16908291;BA.debugLine="prfn.initialize(\"prfn\")";
__ref._prfn /*com.reza.sh.fastnet.Fastnet*/ .initialize(ba,"prfn");
RDebugUtils.currentLine=16908292;
 //BA.debugLineNum = 16908292;BA.debugLine="Dim post As PostRequest";
_post = new com.reza.sh.fastnet.PostRequestRaper();
RDebugUtils.currentLine=16908293;
 //BA.debugLineNum = 16908293;BA.debugLine="post=prfn.BuildPostQuery(\"http://filework.ir/INST";
_post = __ref._prfn /*com.reza.sh.fastnet.Fastnet*/ .BuildPostQuery("http://filework.ir/INSTAFOLLOW/api/req.php","sefss");
RDebugUtils.currentLine=16908295;
 //BA.debugLineNum = 16908295;BA.debugLine="post.addHeder(\"User-Agent\",\"Dalvik/1.6.0 (Linux;";
_post.addHeder("User-Agent","Dalvik/1.6.0 (Linux; U; Android 4.4.4; SM-A700FD Build/KTU84P)");
RDebugUtils.currentLine=16908296;
 //BA.debugLineNum = 16908296;BA.debugLine="post.addParametrs(\"req\",\"t_sef\")";
_post.addParametrs("req","t_sef");
RDebugUtils.currentLine=16908298;
 //BA.debugLineNum = 16908298;BA.debugLine="post.addParametrs(\"uid\",\"1\")";
_post.addParametrs("uid","1");
RDebugUtils.currentLine=16908299;
 //BA.debugLineNum = 16908299;BA.debugLine="post.addParametrs(\"types\",types)";
_post.addParametrs("types",_types);
RDebugUtils.currentLine=16908300;
 //BA.debugLineNum = 16908300;BA.debugLine="post.addParametrs(\"userid\",userid)";
_post.addParametrs("userid",_userid);
RDebugUtils.currentLine=16908301;
 //BA.debugLineNum = 16908301;BA.debugLine="post.addParametrs(\"chat_id\",chat_ida)";
_post.addParametrs("chat_id",_chat_ida);
RDebugUtils.currentLine=16908302;
 //BA.debugLineNum = 16908302;BA.debugLine="post.addParametrs(\"finish\",finish)";
_post.addParametrs("finish",_finish);
RDebugUtils.currentLine=16908303;
 //BA.debugLineNum = 16908303;BA.debugLine="post.addParametrs(\"msg_id\",msg_ida)";
_post.addParametrs("msg_id",_msg_ida);
RDebugUtils.currentLine=16908304;
 //BA.debugLineNum = 16908304;BA.debugLine="post.addParametrs(\"njob\",njob)";
_post.addParametrs("njob",_njob);
RDebugUtils.currentLine=16908306;
 //BA.debugLineNum = 16908306;BA.debugLine="post.addParametrs(\"pic\",\"http://filework.ir/INSTA";
_post.addParametrs("pic","http://filework.ir/INSTAFOLLOW/api/telepic/"+_picname);
RDebugUtils.currentLine=16908310;
 //BA.debugLineNum = 16908310;BA.debugLine="post.executRequestAsString";
_post.executRequestAsString();
RDebugUtils.currentLine=16908315;
 //BA.debugLineNum = 16908315;BA.debugLine="End Sub";
return "";
}
public String  _upload(com.it.fome.mt_sef __ref,String _filename,String _emailn,String _namen,String _familyn) throws Exception{
__ref = this;
RDebugUtils.currentModule="mt_sef";
if (Debug.shouldDelegate(ba, "upload", false))
	 {return ((String) Debug.delegate(ba, "upload", new Object[] {_filename,_emailn,_namen,_familyn}));}
RDebugUtils.currentLine=16515072;
 //BA.debugLineNum = 16515072;BA.debugLine="Sub upload(filename As String,emailn As String,nam";
RDebugUtils.currentLine=16515073;
 //BA.debugLineNum = 16515073;BA.debugLine="upl=pr.BuildUploadQuery(\"http://filework.ir/INSTA";
__ref._upl /*com.reza.sh.fastnet.UploadRequest*/  = __ref._pr /*com.reza.sh.fastnet.Fastnet*/ .BuildUploadQuery("http://filework.ir/INSTAFOLLOW/api/upload.php","t2");
RDebugUtils.currentLine=16515077;
 //BA.debugLineNum = 16515077;BA.debugLine="File.Copy(\"\",filename,File.DirRootExternal,\"new.p";
__c.File.Copy("",_filename,__c.File.getDirRootExternal(),"new.png");
RDebugUtils.currentLine=16515078;
 //BA.debugLineNum = 16515078;BA.debugLine="Log(File.DirRootExternal)";
__c.LogImpl("616515078",__c.File.getDirRootExternal(),0);
RDebugUtils.currentLine=16515079;
 //BA.debugLineNum = 16515079;BA.debugLine="upl.addMultipartFile(\"uploaded_file\",filename)";
__ref._upl /*com.reza.sh.fastnet.UploadRequest*/ .addMultipartFile("uploaded_file",_filename);
RDebugUtils.currentLine=16515080;
 //BA.debugLineNum = 16515080;BA.debugLine="upl.startUploadAsString";
__ref._upl /*com.reza.sh.fastnet.UploadRequest*/ .startUploadAsString();
RDebugUtils.currentLine=16515081;
 //BA.debugLineNum = 16515081;BA.debugLine="End Sub";
return "";
}
public String  _getname_img(com.it.fome.mt_sef __ref,String _str) throws Exception{
__ref = this;
RDebugUtils.currentModule="mt_sef";
if (Debug.shouldDelegate(ba, "getname_img", false))
	 {return ((String) Debug.delegate(ba, "getname_img", new Object[] {_str}));}
RDebugUtils.currentLine=17170432;
 //BA.debugLineNum = 17170432;BA.debugLine="Sub getname_img(str As String) As String";
RDebugUtils.currentLine=17170433;
 //BA.debugLineNum = 17170433;BA.debugLine="str=str.SubString2(str.IndexOf(\"profile_photos\"),";
_str = _str.substring(_str.indexOf("profile_photos"),_str.length());
RDebugUtils.currentLine=17170434;
 //BA.debugLineNum = 17170434;BA.debugLine="str=str.Replace(\"profile_photos/\",\"\")";
_str = _str.replace("profile_photos/","");
RDebugUtils.currentLine=17170435;
 //BA.debugLineNum = 17170435;BA.debugLine="Return str";
if (true) return _str;
RDebugUtils.currentLine=17170436;
 //BA.debugLineNum = 17170436;BA.debugLine="End Sub";
return "";
}
public int  _lv_getitemcount(com.it.fome.mt_sef __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mt_sef";
if (Debug.shouldDelegate(ba, "lv_getitemcount", false))
	 {return ((Integer) Debug.delegate(ba, "lv_getitemcount", null));}
RDebugUtils.currentLine=16318464;
 //BA.debugLineNum = 16318464;BA.debugLine="Sub LV_GetItemCount As Int 								        '$ Item";
RDebugUtils.currentLine=16318465;
 //BA.debugLineNum = 16318465;BA.debugLine="Select Type_sef";
switch (BA.switchObjectToInt(__ref._type_sef /*int*/ ,(int) (0),(int) (1),(int) (2),(int) (3),(int) (4))) {
case 0: {
RDebugUtils.currentLine=16318468;
 //BA.debugLineNum = 16318468;BA.debugLine="Return list_f(1).Size";
if (true) return __ref._list_f /*anywheresoftware.b4a.objects.collections.List[]*/ [(int) (1)].getSize();
 break; }
case 1: {
RDebugUtils.currentLine=16318470;
 //BA.debugLineNum = 16318470;BA.debugLine="Return list_l(1).Size";
if (true) return __ref._list_l /*anywheresoftware.b4a.objects.collections.List[]*/ [(int) (1)].getSize();
 break; }
case 2: {
RDebugUtils.currentLine=16318473;
 //BA.debugLineNum = 16318473;BA.debugLine="Return list_c(1).Size";
if (true) return __ref._list_c /*anywheresoftware.b4a.objects.collections.List[]*/ [(int) (1)].getSize();
 break; }
case 3: {
RDebugUtils.currentLine=16318476;
 //BA.debugLineNum = 16318476;BA.debugLine="Return list_v(1).Size";
if (true) return __ref._list_v /*anywheresoftware.b4a.objects.collections.List[]*/ [(int) (1)].getSize();
 break; }
case 4: {
 break; }
}
;
RDebugUtils.currentLine=16318481;
 //BA.debugLineNum = 16318481;BA.debugLine="End Sub";
return 0;
}
public String  _lv_itemclick(com.it.fome.mt_sef __ref,anywheresoftware.b4a.objects.PanelWrapper _clickeditem,int _position) throws Exception{
__ref = this;
RDebugUtils.currentModule="mt_sef";
if (Debug.shouldDelegate(ba, "lv_itemclick", false))
	 {return ((String) Debug.delegate(ba, "lv_itemclick", new Object[] {_clickeditem,_position}));}
int _i = 0;
com.valdesekamdem.library.mdtoast.MaterialToast _mtoasst = null;
String _str_c = "";
de.amberhome.materialdialogs.MaterialDialogBuilderWrapper _builder = null;
RDebugUtils.currentLine=16384000;
 //BA.debugLineNum = 16384000;BA.debugLine="Sub LV_ItemClick (ClickedItem As Panel, Position A";
RDebugUtils.currentLine=16384002;
 //BA.debugLineNum = 16384002;BA.debugLine="Select Type_sef";
switch (BA.switchObjectToInt(__ref._type_sef /*int*/ ,(int) (0),(int) (3),(int) (2),(int) (1),(int) (4))) {
case 0: {
RDebugUtils.currentLine=16384005;
 //BA.debugLineNum = 16384005;BA.debugLine="r_coins=list_f(2).Get(Position)";
__ref._r_coins /*long*/  = BA.ObjectToLongNumber(__ref._list_f /*anywheresoftware.b4a.objects.collections.List[]*/ [(int) (2)].Get(_position));
RDebugUtils.currentLine=16384006;
 //BA.debugLineNum = 16384006;BA.debugLine="r_nums=list_f(1).Get(Position)";
__ref._r_nums /*long*/  = BA.ObjectToLongNumber(__ref._list_f /*anywheresoftware.b4a.objects.collections.List[]*/ [(int) (1)].Get(_position));
RDebugUtils.currentLine=16384007;
 //BA.debugLineNum = 16384007;BA.debugLine="cursor1 = sql1.ExecQuery(\"SELECT * FROM tbl_coi";
__ref._cursor1 /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .setObject((android.database.Cursor)(__ref._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM tbl_coin WHERE userid='"+__ref._userid_t /*String*/ +"' ")));
RDebugUtils.currentLine=16384008;
 //BA.debugLineNum = 16384008;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=16384009;
 //BA.debugLineNum = 16384009;BA.debugLine="For i=0 To cursor1.RowCount-1";
{
final int step7 = 1;
final int limit7 = (int) (__ref._cursor1 /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit7 ;_i = _i + step7 ) {
RDebugUtils.currentLine=16384010;
 //BA.debugLineNum = 16384010;BA.debugLine="cursor1.Position=i";
__ref._cursor1 /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .setPosition(_i);
RDebugUtils.currentLine=16384011;
 //BA.debugLineNum = 16384011;BA.debugLine="cm=cursor1.GetString(\"cm\")";
__ref._cm /*String*/  = __ref._cursor1 /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .GetString("cm");
 }
};
RDebugUtils.currentLine=16384013;
 //BA.debugLineNum = 16384013;BA.debugLine="cursor1.Close";
__ref._cursor1 /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .Close();
RDebugUtils.currentLine=16384014;
 //BA.debugLineNum = 16384014;BA.debugLine="If r_coins<cm Or r_coins=cm Then";
if (__ref._r_coins /*long*/ <(double)(Double.parseDouble(__ref._cm /*String*/ )) || __ref._r_coins /*long*/ ==(double)(Double.parseDouble(__ref._cm /*String*/ ))) { 
 }else {
RDebugUtils.currentLine=16384017;
 //BA.debugLineNum = 16384017;BA.debugLine="Dim mtoasst As KJ_MaterialToast";
_mtoasst = new com.valdesekamdem.library.mdtoast.MaterialToast();
RDebugUtils.currentLine=16384018;
 //BA.debugLineNum = 16384018;BA.debugLine="mtoasst.Initialize(\"سکه شما جهت سفارش این مقدا";
_mtoasst.Initialize(ba,"سکه شما جهت سفارش این مقدار کافی نمیباشد",_mtoasst.LENGTH_SHORT,_mtoasst.TYPE_WARNING);
RDebugUtils.currentLine=16384019;
 //BA.debugLineNum = 16384019;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=16384022;
 //BA.debugLineNum = 16384022;BA.debugLine="Dim str_c As String";
_str_c = "";
RDebugUtils.currentLine=16384023;
 //BA.debugLineNum = 16384023;BA.debugLine="str_c=\"افزایش\"&\" \"&list_f(1).Get(Position)&\" مم";
_str_c = "افزایش"+" "+BA.ObjectToString(__ref._list_f /*anywheresoftware.b4a.objects.collections.List[]*/ [(int) (1)].Get(_position))+" ممبر";
RDebugUtils.currentLine=16384024;
 //BA.debugLineNum = 16384024;BA.debugLine="Dim Builder As MaterialDialogBuilder";
_builder = new de.amberhome.materialdialogs.MaterialDialogBuilderWrapper();
RDebugUtils.currentLine=16384025;
 //BA.debugLineNum = 16384025;BA.debugLine="Builder.Initialize(\"Dialog\")";
_builder.Initialize(ba,"Dialog");
RDebugUtils.currentLine=16384026;
 //BA.debugLineNum = 16384026;BA.debugLine="Builder.Title(\" سفارش ممبر\")";
_builder.Title(BA.ObjectToCharSequence(" سفارش ممبر"));
RDebugUtils.currentLine=16384027;
 //BA.debugLineNum = 16384027;BA.debugLine="Builder.Content(str_c)";
_builder.Content(BA.ObjectToCharSequence(_str_c));
RDebugUtils.currentLine=16384028;
 //BA.debugLineNum = 16384028;BA.debugLine="Builder.ItemsCallback";
_builder.ItemsCallback();
RDebugUtils.currentLine=16384029;
 //BA.debugLineNum = 16384029;BA.debugLine="Builder.NegativeText(\"بیخیال\")";
_builder.NegativeText(BA.ObjectToCharSequence("بیخیال"));
RDebugUtils.currentLine=16384030;
 //BA.debugLineNum = 16384030;BA.debugLine="Builder.PositiveText(\"ثبت سفارش\")";
_builder.PositiveText(BA.ObjectToCharSequence("ثبت سفارش"));
RDebugUtils.currentLine=16384031;
 //BA.debugLineNum = 16384031;BA.debugLine="Builder.PositiveColor(0xFF522E52)";
_builder.PositiveColor((int) (0xff522e52));
RDebugUtils.currentLine=16384032;
 //BA.debugLineNum = 16384032;BA.debugLine="Builder.Show";
_builder.Show();
 break; }
case 1: {
RDebugUtils.currentLine=16384038;
 //BA.debugLineNum = 16384038;BA.debugLine="r_coins=list_v(2).Get(Position)";
__ref._r_coins /*long*/  = BA.ObjectToLongNumber(__ref._list_v /*anywheresoftware.b4a.objects.collections.List[]*/ [(int) (2)].Get(_position));
RDebugUtils.currentLine=16384039;
 //BA.debugLineNum = 16384039;BA.debugLine="r_nums=list_v(1).Get(Position)";
__ref._r_nums /*long*/  = BA.ObjectToLongNumber(__ref._list_v /*anywheresoftware.b4a.objects.collections.List[]*/ [(int) (1)].Get(_position));
RDebugUtils.currentLine=16384040;
 //BA.debugLineNum = 16384040;BA.debugLine="cursor1 = sql1.ExecQuery(\"SELECT * FROM tbl_coi";
__ref._cursor1 /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .setObject((android.database.Cursor)(__ref._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM tbl_coin WHERE userid='"+__ref._userid_t /*String*/ +"' ")));
RDebugUtils.currentLine=16384041;
 //BA.debugLineNum = 16384041;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=16384042;
 //BA.debugLineNum = 16384042;BA.debugLine="For i=0 To cursor1.RowCount-1";
{
final int step34 = 1;
final int limit34 = (int) (__ref._cursor1 /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit34 ;_i = _i + step34 ) {
RDebugUtils.currentLine=16384043;
 //BA.debugLineNum = 16384043;BA.debugLine="cursor1.Position=i";
__ref._cursor1 /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .setPosition(_i);
RDebugUtils.currentLine=16384044;
 //BA.debugLineNum = 16384044;BA.debugLine="cm=cursor1.GetString(\"cm\")";
__ref._cm /*String*/  = __ref._cursor1 /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .GetString("cm");
 }
};
RDebugUtils.currentLine=16384046;
 //BA.debugLineNum = 16384046;BA.debugLine="cursor1.Close";
__ref._cursor1 /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .Close();
RDebugUtils.currentLine=16384047;
 //BA.debugLineNum = 16384047;BA.debugLine="If r_coins<cm Or r_coins=cm Then";
if (__ref._r_coins /*long*/ <(double)(Double.parseDouble(__ref._cm /*String*/ )) || __ref._r_coins /*long*/ ==(double)(Double.parseDouble(__ref._cm /*String*/ ))) { 
 }else {
RDebugUtils.currentLine=16384050;
 //BA.debugLineNum = 16384050;BA.debugLine="Dim mtoasst As KJ_MaterialToast";
_mtoasst = new com.valdesekamdem.library.mdtoast.MaterialToast();
RDebugUtils.currentLine=16384051;
 //BA.debugLineNum = 16384051;BA.debugLine="mtoasst.Initialize(\"سکه شما جهت سفارش این مقدا";
_mtoasst.Initialize(ba,"سکه شما جهت سفارش این مقدار کافی نمیباشد",_mtoasst.LENGTH_SHORT,_mtoasst.TYPE_WARNING);
RDebugUtils.currentLine=16384052;
 //BA.debugLineNum = 16384052;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=16384056;
 //BA.debugLineNum = 16384056;BA.debugLine="Act_Chat.chat_id=username_target";
_act_chat._chat_id /*String*/  = __ref._username_target /*String*/ ;
RDebugUtils.currentLine=16384057;
 //BA.debugLineNum = 16384057;BA.debugLine="Act_Chat.name_chat=titelchat_target";
_act_chat._name_chat /*String*/  = __ref._titelchat_target /*String*/ ;
RDebugUtils.currentLine=16384058;
 //BA.debugLineNum = 16384058;BA.debugLine="Act_Chat.numcoins=r_coins";
_act_chat._numcoins /*String*/  = BA.NumberToString(__ref._r_coins /*long*/ );
RDebugUtils.currentLine=16384059;
 //BA.debugLineNum = 16384059;BA.debugLine="Act_Chat.numfinish=r_nums";
_act_chat._numfinish /*String*/  = BA.NumberToString(__ref._r_nums /*long*/ );
RDebugUtils.currentLine=16384060;
 //BA.debugLineNum = 16384060;BA.debugLine="Act_Chat.channelid=idchannel_t";
_act_chat._channelid /*String*/  = __ref._idchannel_t /*String*/ ;
RDebugUtils.currentLine=16384061;
 //BA.debugLineNum = 16384061;BA.debugLine="Act_Chat.imgchat=img_address_target";
_act_chat._imgchat /*String*/  = __ref._img_address_target /*String*/ ;
RDebugUtils.currentLine=16384062;
 //BA.debugLineNum = 16384062;BA.debugLine="Act_Chat.us_name=us_name";
_act_chat._us_name /*String*/  = __ref._us_name /*String*/ ;
RDebugUtils.currentLine=16384063;
 //BA.debugLineNum = 16384063;BA.debugLine="StartActivity(Act_Chat)";
__c.StartActivity(ba,(Object)(_act_chat.getObject()));
 break; }
case 2: {
 break; }
case 3: {
 break; }
case 4: {
 break; }
}
;
RDebugUtils.currentLine=16384075;
 //BA.debugLineNum = 16384075;BA.debugLine="End Sub";
return "";
}
public String  _lv_onbindviewholder(com.it.fome.mt_sef __ref,anywheresoftware.b4a.objects.PanelWrapper _parent,int _position) throws Exception{
__ref = this;
RDebugUtils.currentModule="mt_sef";
if (Debug.shouldDelegate(ba, "lv_onbindviewholder", false))
	 {return ((String) Debug.delegate(ba, "lv_onbindviewholder", new Object[] {_parent,_position}));}
anywheresoftware.b4a.objects.drawable.ColorDrawable _bkcolors = null;
de.amberhome.objects.CardViewWrapper _cards = null;
anywheresoftware.b4a.objects.PanelWrapper _pnl_card = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl_itemicon = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl_name = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _bkcolor = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl_notis = null;
RDebugUtils.currentLine=16252928;
 //BA.debugLineNum = 16252928;BA.debugLine="Sub LV_onBindViewHolder (Parent As Panel, Position";
RDebugUtils.currentLine=16252929;
 //BA.debugLineNum = 16252929;BA.debugLine="Parent.RemoveAllViews";
_parent.RemoveAllViews();
RDebugUtils.currentLine=16252930;
 //BA.debugLineNum = 16252930;BA.debugLine="Parent.Color=Colors.Transparent";
_parent.setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=16252932;
 //BA.debugLineNum = 16252932;BA.debugLine="Dim bkcolors As ColorDrawable";
_bkcolors = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=16252933;
 //BA.debugLineNum = 16252933;BA.debugLine="bkcolors.Initialize(Colors.White,5%x)";
_bkcolors.Initialize(__c.Colors.White,__c.PerXToCurrent((float) (5),ba));
RDebugUtils.currentLine=16252935;
 //BA.debugLineNum = 16252935;BA.debugLine="Dim cards As CardView";
_cards = new de.amberhome.objects.CardViewWrapper();
RDebugUtils.currentLine=16252936;
 //BA.debugLineNum = 16252936;BA.debugLine="cards.Initialize(\"cards\")";
_cards.Initialize(ba,"cards");
RDebugUtils.currentLine=16252937;
 //BA.debugLineNum = 16252937;BA.debugLine="cards.Color=Colors.White";
_cards.setColor(__c.Colors.White);
RDebugUtils.currentLine=16252938;
 //BA.debugLineNum = 16252938;BA.debugLine="cards.CornerRadius=8%x";
_cards.setCornerRadius((float) (__c.PerXToCurrent((float) (8),ba)));
RDebugUtils.currentLine=16252939;
 //BA.debugLineNum = 16252939;BA.debugLine="cards.Elevation=3%x";
_cards.setElevation((float) (__c.PerXToCurrent((float) (3),ba)));
RDebugUtils.currentLine=16252940;
 //BA.debugLineNum = 16252940;BA.debugLine="Parent.AddView(cards,5%x,5%x,Parent.Width-10%x,10";
_parent.AddView((android.view.View)(_cards.getObject()),__c.PerXToCurrent((float) (5),ba),__c.PerXToCurrent((float) (5),ba),(int) (_parent.getWidth()-__c.PerXToCurrent((float) (10),ba)),__c.PerXToCurrent((float) (10),ba));
RDebugUtils.currentLine=16252942;
 //BA.debugLineNum = 16252942;BA.debugLine="Dim pnl_card As Panel";
_pnl_card = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=16252943;
 //BA.debugLineNum = 16252943;BA.debugLine="pnl_card.Initialize(\"pnl_card\")";
_pnl_card.Initialize(ba,"pnl_card");
RDebugUtils.currentLine=16252944;
 //BA.debugLineNum = 16252944;BA.debugLine="pnl_card.Color=Colors.White";
_pnl_card.setColor(__c.Colors.White);
RDebugUtils.currentLine=16252945;
 //BA.debugLineNum = 16252945;BA.debugLine="cards.AddView(pnl_card,0,0,cards.Width,cards.Heig";
_cards.AddView((android.view.View)(_pnl_card.getObject()),(int) (0),(int) (0),_cards.getWidth(),_cards.getHeight());
RDebugUtils.currentLine=16252948;
 //BA.debugLineNum = 16252948;BA.debugLine="Dim lbl_itemicon As Label";
_lbl_itemicon = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=16252949;
 //BA.debugLineNum = 16252949;BA.debugLine="lbl_itemicon.Initialize(\"lbl_itemicon\")";
_lbl_itemicon.Initialize(ba,"lbl_itemicon");
RDebugUtils.currentLine=16252950;
 //BA.debugLineNum = 16252950;BA.debugLine="lbl_itemicon.TextColor=0xFFD305BA";
_lbl_itemicon.setTextColor((int) (0xffd305ba));
RDebugUtils.currentLine=16252951;
 //BA.debugLineNum = 16252951;BA.debugLine="lbl_itemicon.TextSize=25";
_lbl_itemicon.setTextSize((float) (25));
RDebugUtils.currentLine=16252952;
 //BA.debugLineNum = 16252952;BA.debugLine="lbl_itemicon.Typeface=Typeface.MATERIALICONS";
_lbl_itemicon.setTypeface(__c.Typeface.getMATERIALICONS());
RDebugUtils.currentLine=16252953;
 //BA.debugLineNum = 16252953;BA.debugLine="lbl_itemicon.Gravity=Gravity.CENTER_VERTICAL+Grav";
_lbl_itemicon.setGravity((int) (__c.Gravity.CENTER_VERTICAL+__c.Gravity.CENTER_HORIZONTAL));
RDebugUtils.currentLine=16252954;
 //BA.debugLineNum = 16252954;BA.debugLine="pnl_card.AddView(lbl_itemicon,pnl_card.Width-15%x";
_pnl_card.AddView((android.view.View)(_lbl_itemicon.getObject()),(int) (_pnl_card.getWidth()-__c.PerXToCurrent((float) (15),ba)),__c.PerXToCurrent((float) (3),ba),__c.PerXToCurrent((float) (10),ba),__c.PerXToCurrent((float) (10),ba));
RDebugUtils.currentLine=16252956;
 //BA.debugLineNum = 16252956;BA.debugLine="Dim lbl_name As Label";
_lbl_name = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=16252957;
 //BA.debugLineNum = 16252957;BA.debugLine="lbl_name.Initialize(\"lbl_name\")";
_lbl_name.Initialize(ba,"lbl_name");
RDebugUtils.currentLine=16252958;
 //BA.debugLineNum = 16252958;BA.debugLine="lbl_name.TextColor=Colors.DarkGray";
_lbl_name.setTextColor(__c.Colors.DarkGray);
RDebugUtils.currentLine=16252959;
 //BA.debugLineNum = 16252959;BA.debugLine="lbl_name.TextSize=13";
_lbl_name.setTextSize((float) (13));
RDebugUtils.currentLine=16252960;
 //BA.debugLineNum = 16252960;BA.debugLine="lbl_name.Typeface=Typeface.LoadFromAssets(\"iran_s";
_lbl_name.setTypeface(__c.Typeface.LoadFromAssets("iran_sans.ttf"));
RDebugUtils.currentLine=16252961;
 //BA.debugLineNum = 16252961;BA.debugLine="lbl_name.Gravity=Gravity.CENTER_VERTICAL+Gravity.";
_lbl_name.setGravity((int) (__c.Gravity.CENTER_VERTICAL+__c.Gravity.RIGHT));
RDebugUtils.currentLine=16252962;
 //BA.debugLineNum = 16252962;BA.debugLine="pnl_card.AddView(lbl_name,0,3.5%x,pnl_card.Width-";
_pnl_card.AddView((android.view.View)(_lbl_name.getObject()),(int) (0),__c.PerXToCurrent((float) (3.5),ba),(int) (_pnl_card.getWidth()-__c.PerXToCurrent((float) (17),ba)),__c.PerXToCurrent((float) (10),ba));
RDebugUtils.currentLine=16252964;
 //BA.debugLineNum = 16252964;BA.debugLine="Dim bkcolor As ColorDrawable";
_bkcolor = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=16252965;
 //BA.debugLineNum = 16252965;BA.debugLine="bkcolor.Initialize(0xFFFFD82B,10)";
_bkcolor.Initialize((int) (0xffffd82b),(int) (10));
RDebugUtils.currentLine=16252966;
 //BA.debugLineNum = 16252966;BA.debugLine="Dim lbl_notis As Label";
_lbl_notis = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=16252967;
 //BA.debugLineNum = 16252967;BA.debugLine="lbl_notis.Initialize(\"lbl_notis\")";
_lbl_notis.Initialize(ba,"lbl_notis");
RDebugUtils.currentLine=16252968;
 //BA.debugLineNum = 16252968;BA.debugLine="lbl_notis.TextColor=Colors.DarkGray";
_lbl_notis.setTextColor(__c.Colors.DarkGray);
RDebugUtils.currentLine=16252969;
 //BA.debugLineNum = 16252969;BA.debugLine="lbl_notis.TextSize=13";
_lbl_notis.setTextSize((float) (13));
RDebugUtils.currentLine=16252970;
 //BA.debugLineNum = 16252970;BA.debugLine="lbl_notis.Typeface=Typeface.LoadFromAssets(\"iran_";
_lbl_notis.setTypeface(__c.Typeface.LoadFromAssets("iran_sans.ttf"));
RDebugUtils.currentLine=16252972;
 //BA.debugLineNum = 16252972;BA.debugLine="lbl_notis.Gravity=Gravity.CENTER_VERTICAL+Gravity";
_lbl_notis.setGravity((int) (__c.Gravity.CENTER_VERTICAL+__c.Gravity.CENTER_HORIZONTAL));
RDebugUtils.currentLine=16252974;
 //BA.debugLineNum = 16252974;BA.debugLine="pnl_card.AddView(lbl_notis,2%x,4%x,30%x,8%x)";
_pnl_card.AddView((android.view.View)(_lbl_notis.getObject()),__c.PerXToCurrent((float) (2),ba),__c.PerXToCurrent((float) (4),ba),__c.PerXToCurrent((float) (30),ba),__c.PerXToCurrent((float) (8),ba));
RDebugUtils.currentLine=16252976;
 //BA.debugLineNum = 16252976;BA.debugLine="cards.Height=lbl_name.Top+lbl_name.Height+2%x";
_cards.setHeight((int) (_lbl_name.getTop()+_lbl_name.getHeight()+__c.PerXToCurrent((float) (2),ba)));
RDebugUtils.currentLine=16252977;
 //BA.debugLineNum = 16252977;BA.debugLine="pnl_card.Height=lbl_name.Top+lbl_name.Height+2%x";
_pnl_card.setHeight((int) (_lbl_name.getTop()+_lbl_name.getHeight()+__c.PerXToCurrent((float) (2),ba)));
RDebugUtils.currentLine=16252983;
 //BA.debugLineNum = 16252983;BA.debugLine="roundview.Initialize(lbl_notis)";
__ref._roundview /*com.flycoroundview.mc7.MC7RoundView*/ .Initialize(ba,(android.view.View)(_lbl_notis.getObject()));
RDebugUtils.currentLine=16252984;
 //BA.debugLineNum = 16252984;BA.debugLine="roundview.CornerRadius_BL=8%x";
__ref._roundview /*com.flycoroundview.mc7.MC7RoundView*/ .setCornerRadius_BL(__c.PerXToCurrent((float) (8),ba));
RDebugUtils.currentLine=16252985;
 //BA.debugLineNum = 16252985;BA.debugLine="roundview.CornerRadius_BR=8%x";
__ref._roundview /*com.flycoroundview.mc7.MC7RoundView*/ .setCornerRadius_BR(__c.PerXToCurrent((float) (8),ba));
RDebugUtils.currentLine=16252986;
 //BA.debugLineNum = 16252986;BA.debugLine="roundview.CornerRadius_TL=8%x";
__ref._roundview /*com.flycoroundview.mc7.MC7RoundView*/ .setCornerRadius_TL(__c.PerXToCurrent((float) (8),ba));
RDebugUtils.currentLine=16252987;
 //BA.debugLineNum = 16252987;BA.debugLine="roundview.CornerRadius_TR=8%x";
__ref._roundview /*com.flycoroundview.mc7.MC7RoundView*/ .setCornerRadius_TR(__c.PerXToCurrent((float) (8),ba));
RDebugUtils.currentLine=16252988;
 //BA.debugLineNum = 16252988;BA.debugLine="roundview.BackgroundColor=0xFFFFD82B";
__ref._roundview /*com.flycoroundview.mc7.MC7RoundView*/ .setBackgroundColor((int) (0xffffd82b));
RDebugUtils.currentLine=16252994;
 //BA.debugLineNum = 16252994;BA.debugLine="Select Type_sef";
switch (BA.switchObjectToInt(__ref._type_sef /*int*/ ,(int) (0),(int) (1),(int) (2),(int) (3),(int) (4))) {
case 0: {
RDebugUtils.currentLine=16252997;
 //BA.debugLineNum = 16252997;BA.debugLine="lbl_name.Text=\"افزایش\"&\" \"&list_f(1).Get(Positi";
_lbl_name.setText(BA.ObjectToCharSequence("افزایش"+" "+BA.ObjectToString(__ref._list_f /*anywheresoftware.b4a.objects.collections.List[]*/ [(int) (1)].Get(_position))+" ممبر"));
RDebugUtils.currentLine=16252998;
 //BA.debugLineNum = 16252998;BA.debugLine="lbl_notis.Text=list_f(2).Get(Position)&\" \"&\"سکه";
_lbl_notis.setText(BA.ObjectToCharSequence(BA.ObjectToString(__ref._list_f /*anywheresoftware.b4a.objects.collections.List[]*/ [(int) (2)].Get(_position))+" "+"سکه"));
RDebugUtils.currentLine=16252999;
 //BA.debugLineNum = 16252999;BA.debugLine="lbl_itemicon.Text=Chr(0xE8D3)";
_lbl_itemicon.setText(BA.ObjectToCharSequence(__c.Chr((int) (0xe8d3))));
 break; }
case 1: {
RDebugUtils.currentLine=16253001;
 //BA.debugLineNum = 16253001;BA.debugLine="lbl_name.Text=\"افزایش\"&\" \"&list_l(1).Get(Positi";
_lbl_name.setText(BA.ObjectToCharSequence("افزایش"+" "+BA.ObjectToString(__ref._list_l /*anywheresoftware.b4a.objects.collections.List[]*/ [(int) (1)].Get(_position))+" لایک"));
RDebugUtils.currentLine=16253002;
 //BA.debugLineNum = 16253002;BA.debugLine="lbl_notis.Text=list_l(2).Get(Position)&\" \"&\"سکه";
_lbl_notis.setText(BA.ObjectToCharSequence(BA.ObjectToString(__ref._list_l /*anywheresoftware.b4a.objects.collections.List[]*/ [(int) (2)].Get(_position))+" "+"سکه"));
 break; }
case 2: {
RDebugUtils.currentLine=16253004;
 //BA.debugLineNum = 16253004;BA.debugLine="lbl_name.Text=\"افزایش\"&\" \"&list_c(1).Get(Positi";
_lbl_name.setText(BA.ObjectToCharSequence("افزایش"+" "+BA.ObjectToString(__ref._list_c /*anywheresoftware.b4a.objects.collections.List[]*/ [(int) (1)].Get(_position))+" کامنت"));
RDebugUtils.currentLine=16253005;
 //BA.debugLineNum = 16253005;BA.debugLine="lbl_notis.Text=list_c(2).Get(Position)&\" \"&\"سکه";
_lbl_notis.setText(BA.ObjectToCharSequence(BA.ObjectToString(__ref._list_c /*anywheresoftware.b4a.objects.collections.List[]*/ [(int) (2)].Get(_position))+" "+"سکه"));
 break; }
case 3: {
RDebugUtils.currentLine=16253007;
 //BA.debugLineNum = 16253007;BA.debugLine="lbl_name.Text=\"افزایش\"&\" \"&list_v(1).Get(Positi";
_lbl_name.setText(BA.ObjectToCharSequence("افزایش"+" "+BA.ObjectToString(__ref._list_v /*anywheresoftware.b4a.objects.collections.List[]*/ [(int) (1)].Get(_position))+" ویو"));
RDebugUtils.currentLine=16253008;
 //BA.debugLineNum = 16253008;BA.debugLine="lbl_notis.Text=list_v(2).Get(Position)&\" \"&\"سکه";
_lbl_notis.setText(BA.ObjectToCharSequence(BA.ObjectToString(__ref._list_v /*anywheresoftware.b4a.objects.collections.List[]*/ [(int) (2)].Get(_position))+" "+"سکه"));
RDebugUtils.currentLine=16253010;
 //BA.debugLineNum = 16253010;BA.debugLine="lbl_itemicon.Text=Chr(0xE417)";
_lbl_itemicon.setText(BA.ObjectToCharSequence(__c.Chr((int) (0xe417))));
 break; }
case 4: {
 break; }
}
;
RDebugUtils.currentLine=16253015;
 //BA.debugLineNum = 16253015;BA.debugLine="Parent.Height=cards.Top+cards.Height+5%x";
_parent.setHeight((int) (_cards.getTop()+_cards.getHeight()+__c.PerXToCurrent((float) (5),ba)));
RDebugUtils.currentLine=16253016;
 //BA.debugLineNum = 16253016;BA.debugLine="End Sub";
return "";
}
public String  _lv_oncreateviewholder(com.it.fome.mt_sef __ref,anywheresoftware.b4a.objects.PanelWrapper _parent,int _viewtype) throws Exception{
__ref = this;
RDebugUtils.currentModule="mt_sef";
if (Debug.shouldDelegate(ba, "lv_oncreateviewholder", false))
	 {return ((String) Debug.delegate(ba, "lv_oncreateviewholder", new Object[] {_parent,_viewtype}));}
RDebugUtils.currentLine=16187392;
 //BA.debugLineNum = 16187392;BA.debugLine="Sub LV_onCreateViewHolder (Parent As Panel, ViewTy";
RDebugUtils.currentLine=16187394;
 //BA.debugLineNum = 16187394;BA.debugLine="End Sub";
return "";
}
public String  _mipost_newcoins(com.it.fome.mt_sef __ref,String _newstr) throws Exception{
__ref = this;
RDebugUtils.currentModule="mt_sef";
if (Debug.shouldDelegate(ba, "mipost_newcoins", false))
	 {return ((String) Debug.delegate(ba, "mipost_newcoins", new Object[] {_newstr}));}
RDebugUtils.currentLine=17104896;
 //BA.debugLineNum = 17104896;BA.debugLine="Sub mipost_newcoins(newstr As String)";
RDebugUtils.currentLine=17104897;
 //BA.debugLineNum = 17104897;BA.debugLine="CallSubDelayed2(obj,Ev & \"_\"&\"newcoins\",newstr)";
__c.CallSubDelayed2(ba,__ref._obj /*Object*/ ,__ref._ev /*String*/ +"_"+"newcoins",(Object)(_newstr));
RDebugUtils.currentLine=17104905;
 //BA.debugLineNum = 17104905;BA.debugLine="End Sub";
return "";
}
public String  _pr_onjsonobjectuploaderror(com.it.fome.mt_sef __ref,com.reza.sh.fastnet.Error _error,String _tag) throws Exception{
__ref = this;
RDebugUtils.currentModule="mt_sef";
if (Debug.shouldDelegate(ba, "pr_onjsonobjectuploaderror", false))
	 {return ((String) Debug.delegate(ba, "pr_onjsonobjectuploaderror", new Object[] {_error,_tag}));}
RDebugUtils.currentLine=16777216;
 //BA.debugLineNum = 16777216;BA.debugLine="Sub pr_onJSONObjectUploadError(Error As ResponseEr";
RDebugUtils.currentLine=16777217;
 //BA.debugLineNum = 16777217;BA.debugLine="Log(Error.ErrorLocalizedMsage)";
__c.LogImpl("616777217",_error.getErrorLocalizedMsage(),0);
RDebugUtils.currentLine=16777218;
 //BA.debugLineNum = 16777218;BA.debugLine="End Sub";
return "";
}
public String  _pr_onjsonobjectuploadok(com.it.fome.mt_sef __ref,String _jsonstring,String _tag) throws Exception{
__ref = this;
RDebugUtils.currentModule="mt_sef";
if (Debug.shouldDelegate(ba, "pr_onjsonobjectuploadok", false))
	 {return ((String) Debug.delegate(ba, "pr_onjsonobjectuploadok", new Object[] {_jsonstring,_tag}));}
RDebugUtils.currentLine=16711680;
 //BA.debugLineNum = 16711680;BA.debugLine="Sub pr_onJSONObjectUploadOK(JsonString As String ,";
RDebugUtils.currentLine=16711681;
 //BA.debugLineNum = 16711681;BA.debugLine="ProgressDialogHide";
__c.ProgressDialogHide();
RDebugUtils.currentLine=16711682;
 //BA.debugLineNum = 16711682;BA.debugLine="If JsonString<>Null Then";
if (_jsonstring!= null) { 
 };
RDebugUtils.currentLine=16711694;
 //BA.debugLineNum = 16711694;BA.debugLine="End Sub";
return "";
}
public String  _pr_onstringuploaderror(com.it.fome.mt_sef __ref,com.reza.sh.fastnet.Error _error,String _tag) throws Exception{
__ref = this;
RDebugUtils.currentModule="mt_sef";
if (Debug.shouldDelegate(ba, "pr_onstringuploaderror", false))
	 {return ((String) Debug.delegate(ba, "pr_onstringuploaderror", new Object[] {_error,_tag}));}
RDebugUtils.currentLine=16580608;
 //BA.debugLineNum = 16580608;BA.debugLine="Sub pr_onStringUploadError(Error As ResponseError";
RDebugUtils.currentLine=16580609;
 //BA.debugLineNum = 16580609;BA.debugLine="Log(Error.ErrorLocalizedMsage)";
__c.LogImpl("616580609",_error.getErrorLocalizedMsage(),0);
RDebugUtils.currentLine=16580611;
 //BA.debugLineNum = 16580611;BA.debugLine="End Sub";
return "";
}
public String  _pr_onstringuploadok(com.it.fome.mt_sef __ref,String _response,String _tag) throws Exception{
__ref = this;
RDebugUtils.currentModule="mt_sef";
if (Debug.shouldDelegate(ba, "pr_onstringuploadok", false))
	 {return ((String) Debug.delegate(ba, "pr_onstringuploadok", new Object[] {_response,_tag}));}
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
String _status = "";
RDebugUtils.currentLine=16646144;
 //BA.debugLineNum = 16646144;BA.debugLine="Sub pr_onStringUploadOK(response As String  , Tag";
RDebugUtils.currentLine=16646145;
 //BA.debugLineNum = 16646145;BA.debugLine="Log(response)";
__c.LogImpl("616646145",_response,0);
RDebugUtils.currentLine=16646146;
 //BA.debugLineNum = 16646146;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=16646147;
 //BA.debugLineNum = 16646147;BA.debugLine="parser.Initialize(response)";
_parser.Initialize(_response);
RDebugUtils.currentLine=16646148;
 //BA.debugLineNum = 16646148;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=16646149;
 //BA.debugLineNum = 16646149;BA.debugLine="Dim status As String = root.Get(\"status\")";
_status = BA.ObjectToString(_root.Get((Object)("status")));
RDebugUtils.currentLine=16646151;
 //BA.debugLineNum = 16646151;BA.debugLine="If  status=\"ok\" Then";
if ((_status).equals("ok")) { 
RDebugUtils.currentLine=16646152;
 //BA.debugLineNum = 16646152;BA.debugLine="reqsef(userid_t,\"1\",username_target,r_nums,\"0\",\"";
__ref._reqsef /*String*/ (null,__ref._userid_t /*String*/ ,"1",__ref._username_target /*String*/ ,BA.NumberToString(__ref._r_nums /*long*/ ),"0","0",__ref._getname_img /*String*/ (null,__ref._img_address_target /*String*/ ));
 }else {
RDebugUtils.currentLine=16646155;
 //BA.debugLineNum = 16646155;BA.debugLine="ToastMessageShow(\"خطا\",False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("خطا"),__c.False);
 };
RDebugUtils.currentLine=16646157;
 //BA.debugLineNum = 16646157;BA.debugLine="End Sub";
return "";
}
public String  _pr_onuploadprogress(com.it.fome.mt_sef __ref,long _uploaded,long _total,String _tag) throws Exception{
__ref = this;
RDebugUtils.currentModule="mt_sef";
if (Debug.shouldDelegate(ba, "pr_onuploadprogress", false))
	 {return ((String) Debug.delegate(ba, "pr_onuploadprogress", new Object[] {_uploaded,_total,_tag}));}
RDebugUtils.currentLine=16842752;
 //BA.debugLineNum = 16842752;BA.debugLine="Sub pr_onUploadProgress(uploaded As Long,total As";
RDebugUtils.currentLine=16842753;
 //BA.debugLineNum = 16842753;BA.debugLine="Log((uploaded/total))";
__c.LogImpl("616842753",BA.NumberToString((_uploaded/(double)_total)),0);
RDebugUtils.currentLine=16842754;
 //BA.debugLineNum = 16842754;BA.debugLine="End Sub";
return "";
}
public String  _prfn_onpoststringerrorlistener(com.it.fome.mt_sef __ref,com.reza.sh.fastnet.Error _error,String _tag) throws Exception{
__ref = this;
RDebugUtils.currentModule="mt_sef";
if (Debug.shouldDelegate(ba, "prfn_onpoststringerrorlistener", false))
	 {return ((String) Debug.delegate(ba, "prfn_onpoststringerrorlistener", new Object[] {_error,_tag}));}
RDebugUtils.currentLine=16973824;
 //BA.debugLineNum = 16973824;BA.debugLine="Sub prfn_onPostStringErrorListener(Error As Respon";
RDebugUtils.currentLine=16973826;
 //BA.debugLineNum = 16973826;BA.debugLine="ProgressDialogHide";
__c.ProgressDialogHide();
RDebugUtils.currentLine=16973827;
 //BA.debugLineNum = 16973827;BA.debugLine="Log(\"errror\")";
__c.LogImpl("616973827","errror",0);
RDebugUtils.currentLine=16973828;
 //BA.debugLineNum = 16973828;BA.debugLine="End Sub";
return "";
}
public String  _prfn_onpoststringoklistener(com.it.fome.mt_sef __ref,String _result,String _tag) throws Exception{
__ref = this;
RDebugUtils.currentModule="mt_sef";
if (Debug.shouldDelegate(ba, "prfn_onpoststringoklistener", false))
	 {return ((String) Debug.delegate(ba, "prfn_onpoststringoklistener", new Object[] {_result,_tag}));}
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
com.valdesekamdem.library.mdtoast.MaterialToast _mtoasst = null;
RDebugUtils.currentLine=17039360;
 //BA.debugLineNum = 17039360;BA.debugLine="Sub prfn_onPostStringOkListener(Result As String";
RDebugUtils.currentLine=17039362;
 //BA.debugLineNum = 17039362;BA.debugLine="ProgressDialogHide";
__c.ProgressDialogHide();
RDebugUtils.currentLine=17039363;
 //BA.debugLineNum = 17039363;BA.debugLine="Log(Result)";
__c.LogImpl("617039363",_result,0);
RDebugUtils.currentLine=17039365;
 //BA.debugLineNum = 17039365;BA.debugLine="Select Tag";
switch (BA.switchObjectToInt(_tag,"sefss")) {
case 0: {
RDebugUtils.currentLine=17039367;
 //BA.debugLineNum = 17039367;BA.debugLine="If Result.Contains(\"error_code\")=True Then";
if (_result.contains("error_code")==__c.True) { 
RDebugUtils.currentLine=17039368;
 //BA.debugLineNum = 17039368;BA.debugLine="ToastMessageShow(\"ثبت سفارش ناموفق بود :)\",Fal";
__c.ToastMessageShow(BA.ObjectToCharSequence("ثبت سفارش ناموفق بود :)"),__c.False);
 }else {
RDebugUtils.currentLine=17039370;
 //BA.debugLineNum = 17039370;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=17039371;
 //BA.debugLineNum = 17039371;BA.debugLine="parser.Initialize(Result)";
_parser.Initialize(_result);
RDebugUtils.currentLine=17039372;
 //BA.debugLineNum = 17039372;BA.debugLine="Dim root As List = parser.NextArray";
_root = new anywheresoftware.b4a.objects.collections.List();
_root = _parser.NextArray();
RDebugUtils.currentLine=17039373;
 //BA.debugLineNum = 17039373;BA.debugLine="For Each colroot As Map In root";
_colroot = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group11 = _root;
final int groupLen11 = group11.getSize()
;int index11 = 0;
;
for (; index11 < groupLen11;index11++){
_colroot.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group11.Get(index11)));
RDebugUtils.currentLine=17039374;
 //BA.debugLineNum = 17039374;BA.debugLine="Dim Result As String = colroot.Get(\"result\")";
_result = BA.ObjectToString(_colroot.Get((Object)("result")));
RDebugUtils.currentLine=17039375;
 //BA.debugLineNum = 17039375;BA.debugLine="Dim c_m As String = colroot.Get(\"c_m\")";
_c_m = BA.ObjectToString(_colroot.Get((Object)("c_m")));
RDebugUtils.currentLine=17039376;
 //BA.debugLineNum = 17039376;BA.debugLine="Dim uid As String = colroot.Get(\"uid\")";
_uid = BA.ObjectToString(_colroot.Get((Object)("uid")));
RDebugUtils.currentLine=17039377;
 //BA.debugLineNum = 17039377;BA.debugLine="Dim first_last As String = colroot.Get(\"first";
_first_last = BA.ObjectToString(_colroot.Get((Object)("first_last")));
RDebugUtils.currentLine=17039378;
 //BA.debugLineNum = 17039378;BA.debugLine="Dim id As String = colroot.Get(\"id\")";
_id = BA.ObjectToString(_colroot.Get((Object)("id")));
RDebugUtils.currentLine=17039379;
 //BA.debugLineNum = 17039379;BA.debugLine="Dim userid As String = colroot.Get(\"userid\")";
_userid = BA.ObjectToString(_colroot.Get((Object)("userid")));
RDebugUtils.currentLine=17039380;
 //BA.debugLineNum = 17039380;BA.debugLine="Dim username As String = colroot.Get(\"usernam";
_username = BA.ObjectToString(_colroot.Get((Object)("username")));
RDebugUtils.currentLine=17039381;
 //BA.debugLineNum = 17039381;BA.debugLine="Dim c_ch As String = colroot.Get(\"c_ch\")";
_c_ch = BA.ObjectToString(_colroot.Get((Object)("c_ch")));
RDebugUtils.currentLine=17039383;
 //BA.debugLineNum = 17039383;BA.debugLine="sql1.ExecNonQuery(\"UPDATE tbl_coin set cm='\"&";
__ref._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("UPDATE tbl_coin set cm='"+_c_m+"',cf='"+_c_ch+"' WHERE userid='"+__ref._userid_t /*String*/ +"' ");
RDebugUtils.currentLine=17039385;
 //BA.debugLineNum = 17039385;BA.debugLine="CallSubDelayed2(obj,Ev & \"_\"&\"newcoins\",c_m)";
__c.CallSubDelayed2(ba,__ref._obj /*Object*/ ,__ref._ev /*String*/ +"_"+"newcoins",(Object)(_c_m));
 }
};
RDebugUtils.currentLine=17039391;
 //BA.debugLineNum = 17039391;BA.debugLine="progressDialog.Hide";
__ref._progressdialog /*de.amberhome.materialdialogs.MaterialDialogWrapper*/ .Hide();
RDebugUtils.currentLine=17039393;
 //BA.debugLineNum = 17039393;BA.debugLine="Dim mtoasst As KJ_MaterialToast";
_mtoasst = new com.valdesekamdem.library.mdtoast.MaterialToast();
RDebugUtils.currentLine=17039394;
 //BA.debugLineNum = 17039394;BA.debugLine="mtoasst.Initialize(\"سفارش با موفقیت ثبت شد\",mt";
_mtoasst.Initialize(ba,"سفارش با موفقیت ثبت شد",_mtoasst.LENGTH_SHORT,_mtoasst.TYPE_SUCCESS);
 };
 break; }
}
;
RDebugUtils.currentLine=17039400;
 //BA.debugLineNum = 17039400;BA.debugLine="End Sub";
return "";
}
}