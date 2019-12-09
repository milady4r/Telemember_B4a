package com.it.fome;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class mi_shop extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "com.it.fome.mi_shop");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", com.it.fome.mi_shop.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.PanelWrapper _pnl_insta = null;
public wir.hitex.recycler.Hitex_LayoutView _lv = null;
public com.hitex_glide.Hitex_Glide _glide = null;
public com.reza.sh.fastnet.Fastnet _prfn = null;
public String _i_username = "";
public String _i_pk = "";
public String _i_cookie = "";
public String _i_pic = "";
public anywheresoftware.b4a.objects.collections.List[] _l_insta = null;
public anywheresoftware.b4a.object.XmlLayoutBuilder _xml = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _img1 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _img2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbluser = null;
public anywheresoftware.b4a.keywords.constants.TypefaceWrapper _typefc = null;
public anywheresoftware.b4a.objects.PanelWrapper _pln1 = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnl2 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imgf = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imgm = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblf = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblm = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblnf = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblnm = null;
public de.amberhome.objects.appcompat.ACButtonWrapper _btnf = null;
public de.amberhome.objects.appcompat.ACButtonWrapper _btnm = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbtf = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbtm = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnldv1 = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnldv2 = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnl_ulv = null;
public int _pay1 = 0;
public int _pay2 = 0;
public int _ty = 0;
public String _cm = "";
public String _cf = "";
public io.nivad.billing.b4a.BillingProcessorWrapper _mnivadbilling = null;
public int _numc = 0;
public int _type_history = 0;
public String _username_t = "";
public String _userid_t = "";
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
public String  _initialize(com.it.fome.mi_shop __ref,anywheresoftware.b4a.BA _ba,String _eventname,Object _module) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="mi_shop";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_eventname,_module}));}
int _ia = 0;
int _i = 0;
String _bazaarrsakey = "";
String _nivadapplicationid = "";
String _nivadbillingsecret = "";
RDebugUtils.currentLine=4521984;
 //BA.debugLineNum = 4521984;BA.debugLine="Public Sub Initialize(EventName As String,Module A";
RDebugUtils.currentLine=4521985;
 //BA.debugLineNum = 4521985;BA.debugLine="Ev = EventName";
__ref._ev /*String*/  = _eventname;
RDebugUtils.currentLine=4521986;
 //BA.debugLineNum = 4521986;BA.debugLine="obj = Module";
__ref._obj /*Object*/  = _module;
RDebugUtils.currentLine=4521989;
 //BA.debugLineNum = 4521989;BA.debugLine="For ia=0 To 38";
{
final int step3 = 1;
final int limit3 = (int) (38);
_ia = (int) (0) ;
for (;_ia <= limit3 ;_ia = _ia + step3 ) {
RDebugUtils.currentLine=4521991;
 //BA.debugLineNum = 4521991;BA.debugLine="l_insta(ia).Initialize";
__ref._l_insta /*anywheresoftware.b4a.objects.collections.List[]*/ [_ia].Initialize();
 }
};
RDebugUtils.currentLine=4521997;
 //BA.debugLineNum = 4521997;BA.debugLine="If File.Exists(File.DirInternal,\"instadb.db\")=Fal";
if (__c.File.Exists(__c.File.getDirInternal(),"instadb.db")==__c.False) { 
RDebugUtils.currentLine=4521998;
 //BA.debugLineNum = 4521998;BA.debugLine="File.Copy(File.DirAssets,\"instadb.db\",File.DirIn";
__c.File.Copy(__c.File.getDirAssets(),"instadb.db",__c.File.getDirInternal(),"instadb.db");
 };
RDebugUtils.currentLine=4522000;
 //BA.debugLineNum = 4522000;BA.debugLine="If sql1.IsInitialized=False Then";
if (__ref._sql1 /*anywheresoftware.b4a.sql.SQL*/ .IsInitialized()==__c.False) { 
RDebugUtils.currentLine=4522001;
 //BA.debugLineNum = 4522001;BA.debugLine="sql1.Initialize(File.DirInternal,\"instadb.db\",Fa";
__ref._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Initialize(__c.File.getDirInternal(),"instadb.db",__c.False);
 };
RDebugUtils.currentLine=4522005;
 //BA.debugLineNum = 4522005;BA.debugLine="cursor1 = sql1.ExecQuery(\"SELECT * FROM tbl_acc W";
__ref._cursor1 /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .setObject((android.database.Cursor)(__ref._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM tbl_acc WHERE soich='1' ")));
RDebugUtils.currentLine=4522006;
 //BA.debugLineNum = 4522006;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=4522007;
 //BA.debugLineNum = 4522007;BA.debugLine="For i=0 To cursor1.RowCount-1";
{
final int step14 = 1;
final int limit14 = (int) (__ref._cursor1 /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit14 ;_i = _i + step14 ) {
RDebugUtils.currentLine=4522008;
 //BA.debugLineNum = 4522008;BA.debugLine="cursor1.Position=i";
__ref._cursor1 /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .setPosition(_i);
RDebugUtils.currentLine=4522009;
 //BA.debugLineNum = 4522009;BA.debugLine="i_cookie=cursor1.GetString(\"cookie\")";
__ref._i_cookie /*String*/  = __ref._cursor1 /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .GetString("cookie");
RDebugUtils.currentLine=4522010;
 //BA.debugLineNum = 4522010;BA.debugLine="i_username=cursor1.GetString(\"username\")";
__ref._i_username /*String*/  = __ref._cursor1 /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .GetString("username");
RDebugUtils.currentLine=4522011;
 //BA.debugLineNum = 4522011;BA.debugLine="i_pk=cursor1.GetString(\"pk\")";
__ref._i_pk /*String*/  = __ref._cursor1 /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .GetString("pk");
RDebugUtils.currentLine=4522012;
 //BA.debugLineNum = 4522012;BA.debugLine="i_pic=cursor1.GetString(\"profile_pic_url\")";
__ref._i_pic /*String*/  = __ref._cursor1 /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .GetString("profile_pic_url");
 }
};
RDebugUtils.currentLine=4522014;
 //BA.debugLineNum = 4522014;BA.debugLine="Log(i_pic)";
__c.LogImpl("64522014",__ref._i_pic /*String*/ ,0);
RDebugUtils.currentLine=4522016;
 //BA.debugLineNum = 4522016;BA.debugLine="cursor1 = sql1.ExecQuery(\"SELECT * FROM tbl_tele";
__ref._cursor1 /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .setObject((android.database.Cursor)(__ref._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM tbl_tele WHERE soich='1'")));
RDebugUtils.currentLine=4522017;
 //BA.debugLineNum = 4522017;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=4522018;
 //BA.debugLineNum = 4522018;BA.debugLine="For i=0 To cursor1.RowCount-1";
{
final int step24 = 1;
final int limit24 = (int) (__ref._cursor1 /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit24 ;_i = _i + step24 ) {
RDebugUtils.currentLine=4522019;
 //BA.debugLineNum = 4522019;BA.debugLine="cursor1.Position=i";
__ref._cursor1 /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .setPosition(_i);
RDebugUtils.currentLine=4522020;
 //BA.debugLineNum = 4522020;BA.debugLine="userid_t=cursor1.GetString(\"userid\")";
__ref._userid_t /*String*/  = __ref._cursor1 /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .GetString("userid");
RDebugUtils.currentLine=4522021;
 //BA.debugLineNum = 4522021;BA.debugLine="username_t=cursor1.GetString(\"username\")";
__ref._username_t /*String*/  = __ref._cursor1 /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .GetString("username");
 }
};
RDebugUtils.currentLine=4522023;
 //BA.debugLineNum = 4522023;BA.debugLine="cursor1.Close";
__ref._cursor1 /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .Close();
RDebugUtils.currentLine=4522025;
 //BA.debugLineNum = 4522025;BA.debugLine="pay1=50";
__ref._pay1 /*int*/  = (int) (50);
RDebugUtils.currentLine=4522026;
 //BA.debugLineNum = 4522026;BA.debugLine="pay2=1000";
__ref._pay2 /*int*/  = (int) (1000);
RDebugUtils.currentLine=4522028;
 //BA.debugLineNum = 4522028;BA.debugLine="cursor1 = sql1.ExecQuery(\"SELECT * FROM tbl_coin";
__ref._cursor1 /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .setObject((android.database.Cursor)(__ref._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM tbl_coin WHERE userid='"+__ref._i_pk /*String*/ +"' ")));
RDebugUtils.currentLine=4522029;
 //BA.debugLineNum = 4522029;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=4522030;
 //BA.debugLineNum = 4522030;BA.debugLine="For i=0 To cursor1.RowCount-1";
{
final int step34 = 1;
final int limit34 = (int) (__ref._cursor1 /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit34 ;_i = _i + step34 ) {
RDebugUtils.currentLine=4522031;
 //BA.debugLineNum = 4522031;BA.debugLine="cursor1.Position=i";
__ref._cursor1 /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .setPosition(_i);
RDebugUtils.currentLine=4522032;
 //BA.debugLineNum = 4522032;BA.debugLine="cm=cursor1.GetString(\"cm\")";
__ref._cm /*String*/  = __ref._cursor1 /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .GetString("cm");
RDebugUtils.currentLine=4522033;
 //BA.debugLineNum = 4522033;BA.debugLine="cf=cursor1.GetString(\"cf\")";
__ref._cf /*String*/  = __ref._cursor1 /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .GetString("cf");
 }
};
RDebugUtils.currentLine=4522036;
 //BA.debugLineNum = 4522036;BA.debugLine="Dim bazaarRSAKey As String";
_bazaarrsakey = "";
RDebugUtils.currentLine=4522037;
 //BA.debugLineNum = 4522037;BA.debugLine="Dim nivadApplicationID As String";
_nivadapplicationid = "";
RDebugUtils.currentLine=4522038;
 //BA.debugLineNum = 4522038;BA.debugLine="Dim nivadBillingSecret As String";
_nivadbillingsecret = "";
RDebugUtils.currentLine=4522040;
 //BA.debugLineNum = 4522040;BA.debugLine="bazaarRSAKey = \"MIHNMA0GCSqGSIb3DQEBAQUAA4G7ADCBt";
_bazaarrsakey = "MIHNMA0GCSqGSIb3DQEBAQUAA4G7ADCBtwKBrwDpILXW5YROn8aS7zjkX20eTq841CSXg/6+rHGljI8i2LOZ6j+lB7J1ePVHqhvd9tgfnHTjdMNma2fgvAtxMwDuJM3x96mHLS/ryQTNLZoBpN6pjpPa72UjUyXKH1dfSeXuJjhNtXGH6CXrAVG4v6iS8nbzyxJKAqTLyNs0KcDa6Lx/oYDdJaA9GDwgjLMSmwJSyLA76nMJRsxsZmnmwpDp+ehQwCSSKXEYf40GrDECAwEAAQ==";
RDebugUtils.currentLine=4522041;
 //BA.debugLineNum = 4522041;BA.debugLine="nivadApplicationID = \"4a220906-839f-477a-9740-ab9";
_nivadapplicationid = "4a220906-839f-477a-9740-ab9287f96909";
RDebugUtils.currentLine=4522042;
 //BA.debugLineNum = 4522042;BA.debugLine="nivadBillingSecret = \"sdL43cUCx9JYKS3p9HLCbT9Hmd4";
_nivadbillingsecret = "sdL43cUCx9JYKS3p9HLCbT9Hmd4TaN7CMnV4QrAscf5JUf4YD2kIKwJz6wgNrAbk";
RDebugUtils.currentLine=4522044;
 //BA.debugLineNum = 4522044;BA.debugLine="mNivadBilling.initialize(bazaarRSAKey, nivadAppli";
__ref._mnivadbilling /*io.nivad.billing.b4a.BillingProcessorWrapper*/ .initialize(ba,_bazaarrsakey,_nivadapplicationid,_nivadbillingsecret);
RDebugUtils.currentLine=4522047;
 //BA.debugLineNum = 4522047;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.ConcreteViewWrapper  _addpnl(com.it.fome.mi_shop __ref,anywheresoftware.b4a.objects.PanelWrapper _pnl) throws Exception{
__ref = this;
RDebugUtils.currentModule="mi_shop";
if (Debug.shouldDelegate(ba, "addpnl", false))
	 {return ((anywheresoftware.b4a.objects.ConcreteViewWrapper) Debug.delegate(ba, "addpnl", new Object[] {_pnl}));}
RDebugUtils.currentLine=4587520;
 //BA.debugLineNum = 4587520;BA.debugLine="Sub addpnl(pnl As Panel) As View";
RDebugUtils.currentLine=4587525;
 //BA.debugLineNum = 4587525;BA.debugLine="pnl_ulv.Initialize(\"\")";
__ref._pnl_ulv /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=4587526;
 //BA.debugLineNum = 4587526;BA.debugLine="pnl.AddView(pnl_ulv,0,0,pnl.Width,pnl.Height)";
_pnl.AddView((android.view.View)(__ref._pnl_ulv /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()),(int) (0),(int) (0),_pnl.getWidth(),_pnl.getHeight());
RDebugUtils.currentLine=4587528;
 //BA.debugLineNum = 4587528;BA.debugLine="LV.Initializer(\"LV\").ListView.Build";
__ref._lv /*wir.hitex.recycler.Hitex_LayoutView*/ .Initializer(ba,"LV").ListView().Build();
RDebugUtils.currentLine=4587529;
 //BA.debugLineNum = 4587529;BA.debugLine="pnl_ulv.AddView(LV,2%x,0,pnl_ulv.Width-4%x,pnl_ul";
__ref._pnl_ulv /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._lv /*wir.hitex.recycler.Hitex_LayoutView*/ .getObject()),__c.PerXToCurrent((float) (2),ba),(int) (0),(int) (__ref._pnl_ulv /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth()-__c.PerXToCurrent((float) (4),ba)),__ref._pnl_ulv /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight());
RDebugUtils.currentLine=4587530;
 //BA.debugLineNum = 4587530;BA.debugLine="LV.CardView.CardElevation(4dip).Radius(2dip)";
__ref._lv /*wir.hitex.recycler.Hitex_LayoutView*/ .CardView().CardElevation((float) (__c.DipToCurrent((int) (4)))).Radius((float) (__c.DipToCurrent((int) (2))));
RDebugUtils.currentLine=4587531;
 //BA.debugLineNum = 4587531;BA.debugLine="LV.Divider.Add1(Colors.Transparent,5%x)";
__ref._lv /*wir.hitex.recycler.Hitex_LayoutView*/ .Divider().Add1(__c.Colors.Transparent,__c.PerXToCurrent((float) (5),ba));
RDebugUtils.currentLine=4587532;
 //BA.debugLineNum = 4587532;BA.debugLine="LV.Show";
__ref._lv /*wir.hitex.recycler.Hitex_LayoutView*/ .Show();
RDebugUtils.currentLine=4587534;
 //BA.debugLineNum = 4587534;BA.debugLine="req_getme(\"\")";
__ref._req_getme /*String*/ (null,"");
RDebugUtils.currentLine=4587539;
 //BA.debugLineNum = 4587539;BA.debugLine="End Sub";
return null;
}
public String  _req_getme(com.it.fome.mi_shop __ref,String _userid) throws Exception{
__ref = this;
RDebugUtils.currentModule="mi_shop";
if (Debug.shouldDelegate(ba, "req_getme", false))
	 {return ((String) Debug.delegate(ba, "req_getme", new Object[] {_userid}));}
com.reza.sh.fastnet.PostRequestRaper _post = null;
RDebugUtils.currentLine=4915200;
 //BA.debugLineNum = 4915200;BA.debugLine="Sub req_getme(userid As String)";
RDebugUtils.currentLine=4915201;
 //BA.debugLineNum = 4915201;BA.debugLine="prfn.initialize(\"prfn\").WithSSL.WithCookieManager";
__ref._prfn /*com.reza.sh.fastnet.Fastnet*/ .initialize(ba,"prfn").WithSSL().WithCookieManager().Build();
RDebugUtils.currentLine=4915202;
 //BA.debugLineNum = 4915202;BA.debugLine="Dim post As PostRequest";
_post = new com.reza.sh.fastnet.PostRequestRaper();
RDebugUtils.currentLine=4915203;
 //BA.debugLineNum = 4915203;BA.debugLine="post=prfn.WithCookieManager.WithSSL.BuildPostQuer";
_post = __ref._prfn /*com.reza.sh.fastnet.Fastnet*/ .WithCookieManager().WithSSL().BuildPostQuery("http://filework.ir/INSTAFOLLOW/api/pay_list.php","getinsta");
RDebugUtils.currentLine=4915205;
 //BA.debugLineNum = 4915205;BA.debugLine="post.addHeder(\"User-Agent\",\"Dalvik/1.6.0 (Linux;";
_post.addHeder("User-Agent","Dalvik/1.6.0 (Linux; U; Android 4.4.4; SM-A700FD Build/KTU84P)");
RDebugUtils.currentLine=4915206;
 //BA.debugLineNum = 4915206;BA.debugLine="post.executRequestAsString";
_post.executRequestAsString();
RDebugUtils.currentLine=4915216;
 //BA.debugLineNum = 4915216;BA.debugLine="End Sub";
return "";
}
public String  _btn_pay_click(com.it.fome.mi_shop __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mi_shop";
if (Debug.shouldDelegate(ba, "btn_pay_click", false))
	 {return ((String) Debug.delegate(ba, "btn_pay_click", null));}
de.amberhome.objects.appcompat.ACButtonWrapper _b = null;
RDebugUtils.currentLine=5242880;
 //BA.debugLineNum = 5242880;BA.debugLine="Sub btn_pay_Click";
RDebugUtils.currentLine=5242881;
 //BA.debugLineNum = 5242881;BA.debugLine="Dim b As ACButton";
_b = new de.amberhome.objects.appcompat.ACButtonWrapper();
RDebugUtils.currentLine=5242882;
 //BA.debugLineNum = 5242882;BA.debugLine="b=Sender";
_b.setObject((android.widget.Button)(__c.Sender(ba)));
RDebugUtils.currentLine=5242885;
 //BA.debugLineNum = 5242885;BA.debugLine="Select type_history";
switch (BA.switchObjectToInt(__ref._type_history /*int*/ ,(int) (0),(int) (1))) {
case 0: {
RDebugUtils.currentLine=5242888;
 //BA.debugLineNum = 5242888;BA.debugLine="numc=l_insta(8).Get(b.Tag)";
__ref._numc /*int*/  = (int)(BA.ObjectToNumber(__ref._l_insta /*anywheresoftware.b4a.objects.collections.List[]*/ [(int) (8)].Get((int)(BA.ObjectToNumber(_b.getTag())))));
RDebugUtils.currentLine=5242889;
 //BA.debugLineNum = 5242889;BA.debugLine="mNivadBilling.purchase(l_insta(7).Get(b.Tag),Nu";
__ref._mnivadbilling /*io.nivad.billing.b4a.BillingProcessorWrapper*/ .purchase(BA.ObjectToString(__ref._l_insta /*anywheresoftware.b4a.objects.collections.List[]*/ [(int) (7)].Get((int)(BA.ObjectToNumber(_b.getTag())))),BA.ObjectToString(__c.Null));
 break; }
case 1: {
RDebugUtils.currentLine=5242894;
 //BA.debugLineNum = 5242894;BA.debugLine="numc=l_insta(8).Get(b.Tag)";
__ref._numc /*int*/  = (int)(BA.ObjectToNumber(__ref._l_insta /*anywheresoftware.b4a.objects.collections.List[]*/ [(int) (8)].Get((int)(BA.ObjectToNumber(_b.getTag())))));
RDebugUtils.currentLine=5242895;
 //BA.debugLineNum = 5242895;BA.debugLine="mNivadBilling.purchase(l_insta(7).Get(b.Tag),Nu";
__ref._mnivadbilling /*io.nivad.billing.b4a.BillingProcessorWrapper*/ .purchase(BA.ObjectToString(__ref._l_insta /*anywheresoftware.b4a.objects.collections.List[]*/ [(int) (7)].Get((int)(BA.ObjectToNumber(_b.getTag())))),BA.ObjectToString(__c.Null));
 break; }
}
;
RDebugUtils.currentLine=5242900;
 //BA.debugLineNum = 5242900;BA.debugLine="End Sub";
return "";
}
public String  _btnf_click(com.it.fome.mi_shop __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mi_shop";
if (Debug.shouldDelegate(ba, "btnf_click", false))
	 {return ((String) Debug.delegate(ba, "btnf_click", null));}
RDebugUtils.currentLine=5111808;
 //BA.debugLineNum = 5111808;BA.debugLine="Sub btnf_Click";
RDebugUtils.currentLine=5111815;
 //BA.debugLineNum = 5111815;BA.debugLine="If l_insta(1).Size=0 Then";
if (__ref._l_insta /*anywheresoftware.b4a.objects.collections.List[]*/ [(int) (1)].getSize()==0) { 
RDebugUtils.currentLine=5111817;
 //BA.debugLineNum = 5111817;BA.debugLine="ToastMessageShow(\"در حال حاضر لیستی جهت خرید موج";
__c.ToastMessageShow(BA.ObjectToCharSequence("در حال حاضر لیستی جهت خرید موجود نمیباشد"),__c.False);
RDebugUtils.currentLine=5111818;
 //BA.debugLineNum = 5111818;BA.debugLine="Return True";
if (true) return BA.ObjectToString(__c.True);
 };
RDebugUtils.currentLine=5111821;
 //BA.debugLineNum = 5111821;BA.debugLine="ty=1";
__ref._ty /*int*/  = (int) (1);
RDebugUtils.currentLine=5111822;
 //BA.debugLineNum = 5111822;BA.debugLine="LV.notifyDataSetChanged";
__ref._lv /*wir.hitex.recycler.Hitex_LayoutView*/ .notifyDataSetChanged();
RDebugUtils.currentLine=5111823;
 //BA.debugLineNum = 5111823;BA.debugLine="End Sub";
return "";
}
public String  _btnm_click(com.it.fome.mi_shop __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mi_shop";
if (Debug.shouldDelegate(ba, "btnm_click", false))
	 {return ((String) Debug.delegate(ba, "btnm_click", null));}
RDebugUtils.currentLine=5177344;
 //BA.debugLineNum = 5177344;BA.debugLine="Sub btnm_Click";
RDebugUtils.currentLine=5177350;
 //BA.debugLineNum = 5177350;BA.debugLine="If l_insta(4).Size=0 Then";
if (__ref._l_insta /*anywheresoftware.b4a.objects.collections.List[]*/ [(int) (4)].getSize()==0) { 
RDebugUtils.currentLine=5177352;
 //BA.debugLineNum = 5177352;BA.debugLine="ToastMessageShow(\"در حال حاضر لیستی جهت خرید موج";
__c.ToastMessageShow(BA.ObjectToCharSequence("در حال حاضر لیستی جهت خرید موجود نمیباشد"),__c.False);
RDebugUtils.currentLine=5177353;
 //BA.debugLineNum = 5177353;BA.debugLine="Return True";
if (true) return BA.ObjectToString(__c.True);
 };
RDebugUtils.currentLine=5177356;
 //BA.debugLineNum = 5177356;BA.debugLine="ty=2";
__ref._ty /*int*/  = (int) (2);
RDebugUtils.currentLine=5177357;
 //BA.debugLineNum = 5177357;BA.debugLine="LV.notifyDataSetChanged";
__ref._lv /*wir.hitex.recycler.Hitex_LayoutView*/ .notifyDataSetChanged();
RDebugUtils.currentLine=5177358;
 //BA.debugLineNum = 5177358;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(com.it.fome.mi_shop __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mi_shop";
RDebugUtils.currentLine=4456448;
 //BA.debugLineNum = 4456448;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=4456449;
 //BA.debugLineNum = 4456449;BA.debugLine="Private Ev As String";
_ev = "";
RDebugUtils.currentLine=4456450;
 //BA.debugLineNum = 4456450;BA.debugLine="Private obj As Object";
_obj = new Object();
RDebugUtils.currentLine=4456451;
 //BA.debugLineNum = 4456451;BA.debugLine="Dim sql1 As SQL";
_sql1 = new anywheresoftware.b4a.sql.SQL();
RDebugUtils.currentLine=4456452;
 //BA.debugLineNum = 4456452;BA.debugLine="Dim cursor1 As Cursor";
_cursor1 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=4456453;
 //BA.debugLineNum = 4456453;BA.debugLine="Dim pnl_insta As Panel";
_pnl_insta = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=4456454;
 //BA.debugLineNum = 4456454;BA.debugLine="Dim LV As Hitex_LayoutView";
_lv = new wir.hitex.recycler.Hitex_LayoutView();
RDebugUtils.currentLine=4456455;
 //BA.debugLineNum = 4456455;BA.debugLine="Dim Glide As Hitex_Glide";
_glide = new com.hitex_glide.Hitex_Glide();
RDebugUtils.currentLine=4456456;
 //BA.debugLineNum = 4456456;BA.debugLine="Dim prfn As PersianFastNetwork";
_prfn = new com.reza.sh.fastnet.Fastnet();
RDebugUtils.currentLine=4456457;
 //BA.debugLineNum = 4456457;BA.debugLine="Dim i_username ,i_pk,i_cookie,i_pic As String";
_i_username = "";
_i_pk = "";
_i_cookie = "";
_i_pic = "";
RDebugUtils.currentLine=4456458;
 //BA.debugLineNum = 4456458;BA.debugLine="Dim l_insta(40) As List";
_l_insta = new anywheresoftware.b4a.objects.collections.List[(int) (40)];
{
int d0 = _l_insta.length;
for (int i0 = 0;i0 < d0;i0++) {
_l_insta[i0] = new anywheresoftware.b4a.objects.collections.List();
}
}
;
RDebugUtils.currentLine=4456459;
 //BA.debugLineNum = 4456459;BA.debugLine="Private xml As XmlLayoutBuilder";
_xml = new anywheresoftware.b4a.object.XmlLayoutBuilder();
RDebugUtils.currentLine=4456461;
 //BA.debugLineNum = 4456461;BA.debugLine="Private img1,img2 As ImageView";
_img1 = new anywheresoftware.b4a.objects.ImageViewWrapper();
_img2 = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=4456462;
 //BA.debugLineNum = 4456462;BA.debugLine="Private lbluser As Label";
_lbluser = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=4456463;
 //BA.debugLineNum = 4456463;BA.debugLine="Private typefc=Typeface.LoadFromAssets(\"iran_sans";
_typefc = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
_typefc.setObject((android.graphics.Typeface)(__c.Typeface.LoadFromAssets("iran_sans.ttf")));
RDebugUtils.currentLine=4456464;
 //BA.debugLineNum = 4456464;BA.debugLine="Private pln1,pnl2 As Panel";
_pln1 = new anywheresoftware.b4a.objects.PanelWrapper();
_pnl2 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=4456465;
 //BA.debugLineNum = 4456465;BA.debugLine="Private imgf,imgm As ImageView";
_imgf = new anywheresoftware.b4a.objects.ImageViewWrapper();
_imgm = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=4456466;
 //BA.debugLineNum = 4456466;BA.debugLine="Private lblf,lblm,lblnf,lblnm As Label";
_lblf = new anywheresoftware.b4a.objects.LabelWrapper();
_lblm = new anywheresoftware.b4a.objects.LabelWrapper();
_lblnf = new anywheresoftware.b4a.objects.LabelWrapper();
_lblnm = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=4456467;
 //BA.debugLineNum = 4456467;BA.debugLine="Private btnf,btnm As ACButton";
_btnf = new de.amberhome.objects.appcompat.ACButtonWrapper();
_btnm = new de.amberhome.objects.appcompat.ACButtonWrapper();
RDebugUtils.currentLine=4456468;
 //BA.debugLineNum = 4456468;BA.debugLine="Private lbtf,lbtm As Label";
_lbtf = new anywheresoftware.b4a.objects.LabelWrapper();
_lbtm = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=4456469;
 //BA.debugLineNum = 4456469;BA.debugLine="Private pnldv1,pnldv2 As Panel";
_pnldv1 = new anywheresoftware.b4a.objects.PanelWrapper();
_pnldv2 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=4456470;
 //BA.debugLineNum = 4456470;BA.debugLine="Private pnl_ulv As Panel";
_pnl_ulv = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=4456471;
 //BA.debugLineNum = 4456471;BA.debugLine="Private LV As Hitex_LayoutView";
_lv = new wir.hitex.recycler.Hitex_LayoutView();
RDebugUtils.currentLine=4456472;
 //BA.debugLineNum = 4456472;BA.debugLine="Private Glide As Hitex_Glide";
_glide = new com.hitex_glide.Hitex_Glide();
RDebugUtils.currentLine=4456474;
 //BA.debugLineNum = 4456474;BA.debugLine="Private pay1,pay2 As Int";
_pay1 = 0;
_pay2 = 0;
RDebugUtils.currentLine=4456475;
 //BA.debugLineNum = 4456475;BA.debugLine="Private ty=0 As Int";
_ty = (int) (0);
RDebugUtils.currentLine=4456476;
 //BA.debugLineNum = 4456476;BA.debugLine="Private cm,cf As String";
_cm = "";
_cf = "";
RDebugUtils.currentLine=4456477;
 //BA.debugLineNum = 4456477;BA.debugLine="Private mNivadBilling As BillingProcessor";
_mnivadbilling = new io.nivad.billing.b4a.BillingProcessorWrapper();
RDebugUtils.currentLine=4456478;
 //BA.debugLineNum = 4456478;BA.debugLine="Private numc As Int";
_numc = 0;
RDebugUtils.currentLine=4456479;
 //BA.debugLineNum = 4456479;BA.debugLine="Dim type_history As Int";
_type_history = 0;
RDebugUtils.currentLine=4456480;
 //BA.debugLineNum = 4456480;BA.debugLine="Private username_t ,userid_t As String";
_username_t = "";
_userid_t = "";
RDebugUtils.currentLine=4456482;
 //BA.debugLineNum = 4456482;BA.debugLine="End Sub";
return "";
}
public String  _insta_user_followdone(com.it.fome.mi_shop __ref,String _response,boolean _job) throws Exception{
__ref = this;
RDebugUtils.currentModule="mi_shop";
if (Debug.shouldDelegate(ba, "insta_user_followdone", false))
	 {return ((String) Debug.delegate(ba, "insta_user_followdone", new Object[] {_response,_job}));}
RDebugUtils.currentLine=4653056;
 //BA.debugLineNum = 4653056;BA.debugLine="Sub insta_user_FollowDone(response As String,job A";
RDebugUtils.currentLine=4653057;
 //BA.debugLineNum = 4653057;BA.debugLine="Log(job)";
__c.LogImpl("64653057",BA.ObjectToString(_job),0);
RDebugUtils.currentLine=4653058;
 //BA.debugLineNum = 4653058;BA.debugLine="End Sub";
return "";
}
public int  _lv_getitemcount(com.it.fome.mi_shop __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mi_shop";
if (Debug.shouldDelegate(ba, "lv_getitemcount", false))
	 {return ((Integer) Debug.delegate(ba, "lv_getitemcount", null));}
RDebugUtils.currentLine=4849664;
 //BA.debugLineNum = 4849664;BA.debugLine="Sub LV_GetItemCount As Int 								        '$ Item";
RDebugUtils.currentLine=4849665;
 //BA.debugLineNum = 4849665;BA.debugLine="Select ty";
switch (BA.switchObjectToInt(__ref._ty /*int*/ ,(int) (1),(int) (2))) {
case 0: {
RDebugUtils.currentLine=4849668;
 //BA.debugLineNum = 4849668;BA.debugLine="Return l_insta(1).Size";
if (true) return __ref._l_insta /*anywheresoftware.b4a.objects.collections.List[]*/ [(int) (1)].getSize();
 break; }
case 1: {
RDebugUtils.currentLine=4849670;
 //BA.debugLineNum = 4849670;BA.debugLine="Return l_insta(5).Size";
if (true) return __ref._l_insta /*anywheresoftware.b4a.objects.collections.List[]*/ [(int) (5)].getSize();
 break; }
}
;
RDebugUtils.currentLine=4849673;
 //BA.debugLineNum = 4849673;BA.debugLine="End Sub";
return 0;
}
public String  _lv_onbindviewholder(com.it.fome.mi_shop __ref,anywheresoftware.b4a.objects.PanelWrapper _parent,int _position) throws Exception{
__ref = this;
RDebugUtils.currentModule="mi_shop";
if (Debug.shouldDelegate(ba, "lv_onbindviewholder", false))
	 {return ((String) Debug.delegate(ba, "lv_onbindviewholder", new Object[] {_parent,_position}));}
anywheresoftware.b4a.objects.PanelWrapper _pnl_main = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
de.amberhome.objects.appcompat.ACButtonWrapper _btn_pay = null;
RDebugUtils.currentLine=4784128;
 //BA.debugLineNum = 4784128;BA.debugLine="Sub LV_onBindViewHolder (Parent As Panel, Position";
RDebugUtils.currentLine=4784129;
 //BA.debugLineNum = 4784129;BA.debugLine="Dim pnl_main = Parent.GetView(0) As Panel";
_pnl_main = new anywheresoftware.b4a.objects.PanelWrapper();
_pnl_main.setObject((android.view.ViewGroup)(_parent.GetView((int) (0)).getObject()));
RDebugUtils.currentLine=4784130;
 //BA.debugLineNum = 4784130;BA.debugLine="Dim lbl = pnl_main.GetView(0) As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
_lbl.setObject((android.widget.TextView)(_pnl_main.GetView((int) (0)).getObject()));
RDebugUtils.currentLine=4784131;
 //BA.debugLineNum = 4784131;BA.debugLine="Dim btn_pay = pnl_main.GetView(1) As ACButton";
_btn_pay = new de.amberhome.objects.appcompat.ACButtonWrapper();
_btn_pay.setObject((android.widget.Button)(_pnl_main.GetView((int) (1)).getObject()));
RDebugUtils.currentLine=4784133;
 //BA.debugLineNum = 4784133;BA.debugLine="btn_pay.Tag=Position";
_btn_pay.setTag((Object)(_position));
RDebugUtils.currentLine=4784136;
 //BA.debugLineNum = 4784136;BA.debugLine="lbl.Text = \"خرید \"&l_insta(8).Get(Position)&\" سکه";
_lbl.setText(BA.ObjectToCharSequence("خرید "+BA.ObjectToString(__ref._l_insta /*anywheresoftware.b4a.objects.collections.List[]*/ [(int) (8)].Get(_position))+" سکه "+__c.NumberFormat((double)(BA.ObjectToNumber(__ref._l_insta /*anywheresoftware.b4a.objects.collections.List[]*/ [(int) (6)].Get(_position))),(int) (3),(int) (0))+" تومان "));
RDebugUtils.currentLine=4784139;
 //BA.debugLineNum = 4784139;BA.debugLine="End Sub";
return "";
}
public String  _lv_oncreateviewholder(com.it.fome.mi_shop __ref,anywheresoftware.b4a.objects.PanelWrapper _parent,int _viewtype) throws Exception{
__ref = this;
RDebugUtils.currentModule="mi_shop";
if (Debug.shouldDelegate(ba, "lv_oncreateviewholder", false))
	 {return ((String) Debug.delegate(ba, "lv_oncreateviewholder", new Object[] {_parent,_viewtype}));}
anywheresoftware.b4a.objects.PanelWrapper _pnl_main = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
de.amberhome.objects.appcompat.ACButtonWrapper _btn_pay = null;
RDebugUtils.currentLine=4718592;
 //BA.debugLineNum = 4718592;BA.debugLine="Sub LV_onCreateViewHolder (Parent As Panel, ViewTy";
RDebugUtils.currentLine=4718594;
 //BA.debugLineNum = 4718594;BA.debugLine="Dim pnl_main As Panel";
_pnl_main = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=4718595;
 //BA.debugLineNum = 4718595;BA.debugLine="pnl_main.Initialize(\"pnl_main\")";
_pnl_main.Initialize(ba,"pnl_main");
RDebugUtils.currentLine=4718596;
 //BA.debugLineNum = 4718596;BA.debugLine="pnl_main.Color=Colors.White";
_pnl_main.setColor(__c.Colors.White);
RDebugUtils.currentLine=4718597;
 //BA.debugLineNum = 4718597;BA.debugLine="Parent.AddView(pnl_main,0,0,Parent.Width,Parent.H";
_parent.AddView((android.view.View)(_pnl_main.getObject()),(int) (0),(int) (0),_parent.getWidth(),_parent.getHeight());
RDebugUtils.currentLine=4718599;
 //BA.debugLineNum = 4718599;BA.debugLine="Dim lbl As Label : lbl.Initialize(\"lbl\")";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=4718599;
 //BA.debugLineNum = 4718599;BA.debugLine="Dim lbl As Label : lbl.Initialize(\"lbl\")";
_lbl.Initialize(ba,"lbl");
RDebugUtils.currentLine=4718600;
 //BA.debugLineNum = 4718600;BA.debugLine="lbl.TextColor = Colors.DarkGray : lbl.TextSize =";
_lbl.setTextColor(__c.Colors.DarkGray);
RDebugUtils.currentLine=4718600;
 //BA.debugLineNum = 4718600;BA.debugLine="lbl.TextColor = Colors.DarkGray : lbl.TextSize =";
_lbl.setTextSize((float) (12));
RDebugUtils.currentLine=4718601;
 //BA.debugLineNum = 4718601;BA.debugLine="lbl.Typeface=typefc";
_lbl.setTypeface((android.graphics.Typeface)(__ref._typefc /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()));
RDebugUtils.currentLine=4718602;
 //BA.debugLineNum = 4718602;BA.debugLine="lbl.Gravity=Gravity.CENTER_HORIZONTAL+Gravity.CEN";
_lbl.setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=4718603;
 //BA.debugLineNum = 4718603;BA.debugLine="lbl.Typeface=Typeface.LoadFromAssets(\"iran_sans.t";
_lbl.setTypeface(__c.Typeface.LoadFromAssets("iran_sans.ttf"));
RDebugUtils.currentLine=4718604;
 //BA.debugLineNum = 4718604;BA.debugLine="pnl_main.AddView(lbl,22%x,0,pnl_main.Width-22%x,p";
_pnl_main.AddView((android.view.View)(_lbl.getObject()),__c.PerXToCurrent((float) (22),ba),(int) (0),(int) (_pnl_main.getWidth()-__c.PerXToCurrent((float) (22),ba)),_pnl_main.getHeight());
RDebugUtils.currentLine=4718606;
 //BA.debugLineNum = 4718606;BA.debugLine="Dim btn_pay As ACButton : btn_pay.Initialize(\"btn";
_btn_pay = new de.amberhome.objects.appcompat.ACButtonWrapper();
RDebugUtils.currentLine=4718606;
 //BA.debugLineNum = 4718606;BA.debugLine="Dim btn_pay As ACButton : btn_pay.Initialize(\"btn";
_btn_pay.Initialize(ba,"btn_pay");
RDebugUtils.currentLine=4718607;
 //BA.debugLineNum = 4718607;BA.debugLine="btn_pay.TextColor = Colors.White : btn_pay.TextSi";
_btn_pay.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=4718607;
 //BA.debugLineNum = 4718607;BA.debugLine="btn_pay.TextColor = Colors.White : btn_pay.TextSi";
_btn_pay.setTextSize((float) (17));
RDebugUtils.currentLine=4718608;
 //BA.debugLineNum = 4718608;BA.debugLine="btn_pay.Typeface=typefc";
_btn_pay.setTypeface((android.graphics.Typeface)(__ref._typefc /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()));
RDebugUtils.currentLine=4718609;
 //BA.debugLineNum = 4718609;BA.debugLine="btn_pay.Color=0xFF1C5C41";
_btn_pay.setColor((int) (0xff1c5c41));
RDebugUtils.currentLine=4718610;
 //BA.debugLineNum = 4718610;BA.debugLine="btn_pay.Text=\"خرید\"";
_btn_pay.setText(BA.ObjectToCharSequence("خرید"));
RDebugUtils.currentLine=4718611;
 //BA.debugLineNum = 4718611;BA.debugLine="btn_pay.Typeface=Typeface.LoadFromAssets(\"iran_sa";
_btn_pay.setTypeface(__c.Typeface.LoadFromAssets("iran_sans.ttf"));
RDebugUtils.currentLine=4718612;
 //BA.debugLineNum = 4718612;BA.debugLine="btn_pay.Gravity=Gravity.CENTER_HORIZONTAL+Gravity";
_btn_pay.setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=4718613;
 //BA.debugLineNum = 4718613;BA.debugLine="pnl_main.AddView(btn_pay,0,0,20%x,pnl_main.Height";
_pnl_main.AddView((android.view.View)(_btn_pay.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (20),ba),_pnl_main.getHeight());
RDebugUtils.currentLine=4718615;
 //BA.debugLineNum = 4718615;BA.debugLine="pnl_main.Height=18%x";
_pnl_main.setHeight(__c.PerXToCurrent((float) (18),ba));
RDebugUtils.currentLine=4718616;
 //BA.debugLineNum = 4718616;BA.debugLine="Parent.Height=18%x";
_parent.setHeight(__c.PerXToCurrent((float) (18),ba));
RDebugUtils.currentLine=4718617;
 //BA.debugLineNum = 4718617;BA.debugLine="Parent.Color=Colors.Transparent";
_parent.setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=4718618;
 //BA.debugLineNum = 4718618;BA.debugLine="End Sub";
return "";
}
public String  _nivadbilling_product_purchased(com.it.fome.mi_shop __ref,String _sku,io.nivad.billing.b4a.TransactionDetailsWrapper _details) throws Exception{
__ref = this;
RDebugUtils.currentModule="mi_shop";
if (Debug.shouldDelegate(ba, "nivadbilling_product_purchased", false))
	 {return ((String) Debug.delegate(ba, "nivadbilling_product_purchased", new Object[] {_sku,_details}));}
RDebugUtils.currentLine=5308416;
 //BA.debugLineNum = 5308416;BA.debugLine="Sub nivadbilling_product_purchased(sku As String,";
RDebugUtils.currentLine=5308417;
 //BA.debugLineNum = 5308417;BA.debugLine="Log(\"Purchased\" & sku)";
__c.LogImpl("65308417","Purchased"+_sku,0);
RDebugUtils.currentLine=5308418;
 //BA.debugLineNum = 5308418;BA.debugLine="ToastMessageShow( \"خرید با موفقیت انجام شد!\",Fals";
__c.ToastMessageShow(BA.ObjectToCharSequence("خرید با موفقیت انجام شد!"),__c.False);
RDebugUtils.currentLine=5308419;
 //BA.debugLineNum = 5308419;BA.debugLine="mNivadBilling.consumePurchase(\"gold_version\")";
__ref._mnivadbilling /*io.nivad.billing.b4a.BillingProcessorWrapper*/ .consumePurchase("gold_version");
RDebugUtils.currentLine=5308420;
 //BA.debugLineNum = 5308420;BA.debugLine="mNivadBilling.consumePurchase(sku)";
__ref._mnivadbilling /*io.nivad.billing.b4a.BillingProcessorWrapper*/ .consumePurchase(_sku);
RDebugUtils.currentLine=5308421;
 //BA.debugLineNum = 5308421;BA.debugLine="Select type_history";
switch (BA.switchObjectToInt(__ref._type_history /*int*/ ,(int) (0),(int) (1))) {
case 0: {
RDebugUtils.currentLine=5308424;
 //BA.debugLineNum = 5308424;BA.debugLine="reqsef(i_pk,\"1\",numc)";
__ref._reqsef /*String*/ (null,__ref._i_pk /*String*/ ,"1",BA.NumberToString(__ref._numc /*int*/ ));
 break; }
case 1: {
RDebugUtils.currentLine=5308427;
 //BA.debugLineNum = 5308427;BA.debugLine="reqsef_tele(userid_t,\"1\",numc)";
__ref._reqsef_tele /*String*/ (null,__ref._userid_t /*String*/ ,"1",BA.NumberToString(__ref._numc /*int*/ ));
 break; }
}
;
RDebugUtils.currentLine=5308432;
 //BA.debugLineNum = 5308432;BA.debugLine="End Sub";
return "";
}
public String  _reqsef(com.it.fome.mi_shop __ref,String _userid,String _types,String _target) throws Exception{
__ref = this;
RDebugUtils.currentModule="mi_shop";
if (Debug.shouldDelegate(ba, "reqsef", false))
	 {return ((String) Debug.delegate(ba, "reqsef", new Object[] {_userid,_types,_target}));}
com.reza.sh.fastnet.PostRequestRaper _post = null;
RDebugUtils.currentLine=5373952;
 //BA.debugLineNum = 5373952;BA.debugLine="Sub reqsef(userid As String,types As String,target";
RDebugUtils.currentLine=5373955;
 //BA.debugLineNum = 5373955;BA.debugLine="prfn.initialize(\"prfn\")";
__ref._prfn /*com.reza.sh.fastnet.Fastnet*/ .initialize(ba,"prfn");
RDebugUtils.currentLine=5373956;
 //BA.debugLineNum = 5373956;BA.debugLine="Dim post As PostRequest";
_post = new com.reza.sh.fastnet.PostRequestRaper();
RDebugUtils.currentLine=5373957;
 //BA.debugLineNum = 5373957;BA.debugLine="post=prfn.BuildPostQuery(\"http://filework.ir/INST";
_post = __ref._prfn /*com.reza.sh.fastnet.Fastnet*/ .BuildPostQuery("http://filework.ir/INSTAFOLLOW/api/req.php","sefss");
RDebugUtils.currentLine=5373959;
 //BA.debugLineNum = 5373959;BA.debugLine="post.addHeder(\"User-Agent\",\"Dalvik/1.6.0 (Linux;";
_post.addHeder("User-Agent","Dalvik/1.6.0 (Linux; U; Android 4.4.4; SM-A700FD Build/KTU84P)");
RDebugUtils.currentLine=5373960;
 //BA.debugLineNum = 5373960;BA.debugLine="post.addParametrs(\"req\",\"coin_pay\")";
_post.addParametrs("req","coin_pay");
RDebugUtils.currentLine=5373962;
 //BA.debugLineNum = 5373962;BA.debugLine="post.addParametrs(\"uid\",\"1\")";
_post.addParametrs("uid","1");
RDebugUtils.currentLine=5373963;
 //BA.debugLineNum = 5373963;BA.debugLine="post.addParametrs(\"types\",types)";
_post.addParametrs("types",_types);
RDebugUtils.currentLine=5373964;
 //BA.debugLineNum = 5373964;BA.debugLine="post.addParametrs(\"userid\",userid)";
_post.addParametrs("userid",_userid);
RDebugUtils.currentLine=5373965;
 //BA.debugLineNum = 5373965;BA.debugLine="post.addParametrs(\"target\",target)";
_post.addParametrs("target",_target);
RDebugUtils.currentLine=5373969;
 //BA.debugLineNum = 5373969;BA.debugLine="post.executRequestAsString";
_post.executRequestAsString();
RDebugUtils.currentLine=5373971;
 //BA.debugLineNum = 5373971;BA.debugLine="ProgressDialogShow(\"در حال پردازش...\")";
__c.ProgressDialogShow(ba,BA.ObjectToCharSequence("در حال پردازش..."));
RDebugUtils.currentLine=5373974;
 //BA.debugLineNum = 5373974;BA.debugLine="End Sub";
return "";
}
public String  _reqsef_tele(com.it.fome.mi_shop __ref,String _userid,String _types,String _target) throws Exception{
__ref = this;
RDebugUtils.currentModule="mi_shop";
if (Debug.shouldDelegate(ba, "reqsef_tele", false))
	 {return ((String) Debug.delegate(ba, "reqsef_tele", new Object[] {_userid,_types,_target}));}
com.reza.sh.fastnet.PostRequestRaper _post = null;
RDebugUtils.currentLine=5439488;
 //BA.debugLineNum = 5439488;BA.debugLine="Sub reqsef_tele(userid As String,types As String,t";
RDebugUtils.currentLine=5439491;
 //BA.debugLineNum = 5439491;BA.debugLine="prfn.initialize(\"prfn\")";
__ref._prfn /*com.reza.sh.fastnet.Fastnet*/ .initialize(ba,"prfn");
RDebugUtils.currentLine=5439492;
 //BA.debugLineNum = 5439492;BA.debugLine="Dim post As PostRequest";
_post = new com.reza.sh.fastnet.PostRequestRaper();
RDebugUtils.currentLine=5439493;
 //BA.debugLineNum = 5439493;BA.debugLine="post=prfn.BuildPostQuery(\"http://filework.ir/INST";
_post = __ref._prfn /*com.reza.sh.fastnet.Fastnet*/ .BuildPostQuery("http://filework.ir/INSTAFOLLOW/api/req.php","seftele");
RDebugUtils.currentLine=5439495;
 //BA.debugLineNum = 5439495;BA.debugLine="post.addHeder(\"User-Agent\",\"Dalvik/1.6.0 (Linux;";
_post.addHeder("User-Agent","Dalvik/1.6.0 (Linux; U; Android 4.4.4; SM-A700FD Build/KTU84P)");
RDebugUtils.currentLine=5439496;
 //BA.debugLineNum = 5439496;BA.debugLine="post.addParametrs(\"req\",\"coin_paytele\")";
_post.addParametrs("req","coin_paytele");
RDebugUtils.currentLine=5439498;
 //BA.debugLineNum = 5439498;BA.debugLine="post.addParametrs(\"uid\",\"1\")";
_post.addParametrs("uid","1");
RDebugUtils.currentLine=5439499;
 //BA.debugLineNum = 5439499;BA.debugLine="post.addParametrs(\"types\",types)";
_post.addParametrs("types",_types);
RDebugUtils.currentLine=5439500;
 //BA.debugLineNum = 5439500;BA.debugLine="post.addParametrs(\"userid\",userid)";
_post.addParametrs("userid",_userid);
RDebugUtils.currentLine=5439501;
 //BA.debugLineNum = 5439501;BA.debugLine="post.addParametrs(\"target\",target)";
_post.addParametrs("target",_target);
RDebugUtils.currentLine=5439505;
 //BA.debugLineNum = 5439505;BA.debugLine="post.executRequestAsString";
_post.executRequestAsString();
RDebugUtils.currentLine=5439507;
 //BA.debugLineNum = 5439507;BA.debugLine="ProgressDialogShow(\"در حال پردازش...\")";
__c.ProgressDialogShow(ba,BA.ObjectToCharSequence("در حال پردازش..."));
RDebugUtils.currentLine=5439510;
 //BA.debugLineNum = 5439510;BA.debugLine="End Sub";
return "";
}
public String  _prfn_onpoststringerrorlistener(com.it.fome.mi_shop __ref,com.reza.sh.fastnet.Error _error,String _tag) throws Exception{
__ref = this;
RDebugUtils.currentModule="mi_shop";
if (Debug.shouldDelegate(ba, "prfn_onpoststringerrorlistener", false))
	 {return ((String) Debug.delegate(ba, "prfn_onpoststringerrorlistener", new Object[] {_error,_tag}));}
RDebugUtils.currentLine=4980736;
 //BA.debugLineNum = 4980736;BA.debugLine="Sub prfn_onPostStringErrorListener(Error As Respon";
RDebugUtils.currentLine=4980737;
 //BA.debugLineNum = 4980737;BA.debugLine="Log(Error.ErrorBody)";
__c.LogImpl("64980737",_error.getErrorBody(),0);
RDebugUtils.currentLine=4980738;
 //BA.debugLineNum = 4980738;BA.debugLine="Log(Error.CauseMessage)";
__c.LogImpl("64980738",_error.getCauseMessage(),0);
RDebugUtils.currentLine=4980739;
 //BA.debugLineNum = 4980739;BA.debugLine="Log(Error.ErrorDetails)";
__c.LogImpl("64980739",_error.getErrorDetails(),0);
RDebugUtils.currentLine=4980740;
 //BA.debugLineNum = 4980740;BA.debugLine="Log(Error.ErrorLocalizedMsage)";
__c.LogImpl("64980740",_error.getErrorLocalizedMsage(),0);
RDebugUtils.currentLine=4980741;
 //BA.debugLineNum = 4980741;BA.debugLine="Log(Error.ErrorMsage)";
__c.LogImpl("64980741",_error.getErrorMsage(),0);
RDebugUtils.currentLine=4980742;
 //BA.debugLineNum = 4980742;BA.debugLine="Log(Error.ResponseBody)";
__c.LogImpl("64980742",_error.getResponseBody(),0);
RDebugUtils.currentLine=4980744;
 //BA.debugLineNum = 4980744;BA.debugLine="ProgressDialogHide";
__c.ProgressDialogHide();
RDebugUtils.currentLine=4980746;
 //BA.debugLineNum = 4980746;BA.debugLine="End Sub";
return "";
}
public String  _prfn_onpoststringoklistener(com.it.fome.mi_shop __ref,String _result,String _tag) throws Exception{
__ref = this;
RDebugUtils.currentModule="mi_shop";
if (Debug.shouldDelegate(ba, "prfn_onpoststringoklistener", false))
	 {return ((String) Debug.delegate(ba, "prfn_onpoststringoklistener", new Object[] {_result,_tag}));}
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.List _root = null;
anywheresoftware.b4a.objects.collections.Map _colroot = null;
String _t_old = "";
String _price = "";
String _name = "";
String _x = "";
String _t_new = "";
String _id = "";
String _c_m = "";
String _uid = "";
String _c_f = "";
String _pic = "";
String _userid = "";
String _username = "";
String _first_last = "";
String _c_ch = "";
long _n_coins = 0L;
RDebugUtils.currentLine=5046272;
 //BA.debugLineNum = 5046272;BA.debugLine="Sub prfn_onPostStringOkListener(Result As String";
RDebugUtils.currentLine=5046273;
 //BA.debugLineNum = 5046273;BA.debugLine="LogColor(Result,Colors.Red)";
__c.LogImpl("65046273",_result,__c.Colors.Red);
RDebugUtils.currentLine=5046274;
 //BA.debugLineNum = 5046274;BA.debugLine="ProgressDialogHide";
__c.ProgressDialogHide();
RDebugUtils.currentLine=5046275;
 //BA.debugLineNum = 5046275;BA.debugLine="Select Tag";
switch (BA.switchObjectToInt(_tag,"getinsta","sefss","seftele")) {
case 0: {
RDebugUtils.currentLine=5046278;
 //BA.debugLineNum = 5046278;BA.debugLine="Log(Result)";
__c.LogImpl("65046278",_result,0);
RDebugUtils.currentLine=5046280;
 //BA.debugLineNum = 5046280;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=5046281;
 //BA.debugLineNum = 5046281;BA.debugLine="parser.Initialize(Result)";
_parser.Initialize(_result);
RDebugUtils.currentLine=5046283;
 //BA.debugLineNum = 5046283;BA.debugLine="Dim root As List = parser.NextArray";
_root = new anywheresoftware.b4a.objects.collections.List();
_root = _parser.NextArray();
RDebugUtils.currentLine=5046284;
 //BA.debugLineNum = 5046284;BA.debugLine="For Each colroot As Map In root";
_colroot = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group9 = _root;
final int groupLen9 = group9.getSize()
;int index9 = 0;
;
for (; index9 < groupLen9;index9++){
_colroot.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group9.Get(index9)));
RDebugUtils.currentLine=5046285;
 //BA.debugLineNum = 5046285;BA.debugLine="Dim t_old As String = colroot.Get(\"t_old\")";
_t_old = BA.ObjectToString(_colroot.Get((Object)("t_old")));
RDebugUtils.currentLine=5046286;
 //BA.debugLineNum = 5046286;BA.debugLine="Dim price As String = colroot.Get(\"price\")";
_price = BA.ObjectToString(_colroot.Get((Object)("price")));
RDebugUtils.currentLine=5046287;
 //BA.debugLineNum = 5046287;BA.debugLine="Dim name As String = colroot.Get(\"name\")";
_name = BA.ObjectToString(_colroot.Get((Object)("name")));
RDebugUtils.currentLine=5046288;
 //BA.debugLineNum = 5046288;BA.debugLine="Dim x As String = colroot.Get(\"x\")";
_x = BA.ObjectToString(_colroot.Get((Object)("x")));
RDebugUtils.currentLine=5046289;
 //BA.debugLineNum = 5046289;BA.debugLine="Dim t_new As String = colroot.Get(\"t_new\")";
_t_new = BA.ObjectToString(_colroot.Get((Object)("t_new")));
RDebugUtils.currentLine=5046290;
 //BA.debugLineNum = 5046290;BA.debugLine="Dim id As String = colroot.Get(\"id\")";
_id = BA.ObjectToString(_colroot.Get((Object)("id")));
RDebugUtils.currentLine=5046292;
 //BA.debugLineNum = 5046292;BA.debugLine="Select x";
switch (BA.switchObjectToInt(_x,"follow","like")) {
case 0: {
RDebugUtils.currentLine=5046294;
 //BA.debugLineNum = 5046294;BA.debugLine="l_insta(1).Add(t_old)";
__ref._l_insta /*anywheresoftware.b4a.objects.collections.List[]*/ [(int) (1)].Add((Object)(_t_old));
RDebugUtils.currentLine=5046295;
 //BA.debugLineNum = 5046295;BA.debugLine="l_insta(2).Add(price)";
__ref._l_insta /*anywheresoftware.b4a.objects.collections.List[]*/ [(int) (2)].Add((Object)(_price));
RDebugUtils.currentLine=5046296;
 //BA.debugLineNum = 5046296;BA.debugLine="l_insta(3).Add(name)";
__ref._l_insta /*anywheresoftware.b4a.objects.collections.List[]*/ [(int) (3)].Add((Object)(_name));
RDebugUtils.currentLine=5046297;
 //BA.debugLineNum = 5046297;BA.debugLine="l_insta(4).Add(t_new)";
__ref._l_insta /*anywheresoftware.b4a.objects.collections.List[]*/ [(int) (4)].Add((Object)(_t_new));
 break; }
case 1: {
RDebugUtils.currentLine=5046300;
 //BA.debugLineNum = 5046300;BA.debugLine="l_insta(5).Add(t_old)";
__ref._l_insta /*anywheresoftware.b4a.objects.collections.List[]*/ [(int) (5)].Add((Object)(_t_old));
RDebugUtils.currentLine=5046301;
 //BA.debugLineNum = 5046301;BA.debugLine="l_insta(6).Add(price)";
__ref._l_insta /*anywheresoftware.b4a.objects.collections.List[]*/ [(int) (6)].Add((Object)(_price));
RDebugUtils.currentLine=5046302;
 //BA.debugLineNum = 5046302;BA.debugLine="l_insta(7).Add(name)";
__ref._l_insta /*anywheresoftware.b4a.objects.collections.List[]*/ [(int) (7)].Add((Object)(_name));
RDebugUtils.currentLine=5046303;
 //BA.debugLineNum = 5046303;BA.debugLine="l_insta(8).Add(t_new)";
__ref._l_insta /*anywheresoftware.b4a.objects.collections.List[]*/ [(int) (8)].Add((Object)(_t_new));
 break; }
}
;
 }
};
RDebugUtils.currentLine=5046311;
 //BA.debugLineNum = 5046311;BA.debugLine="btnm_Click";
__ref._btnm_click /*String*/ (null);
 break; }
case 1: {
RDebugUtils.currentLine=5046313;
 //BA.debugLineNum = 5046313;BA.debugLine="If Result.Contains(\"error_code\")=True Then";
if (_result.contains("error_code")==__c.True) { 
RDebugUtils.currentLine=5046314;
 //BA.debugLineNum = 5046314;BA.debugLine="ToastMessageShow(\"ثبت خرید ناموفق بود :)\",Fals";
__c.ToastMessageShow(BA.ObjectToCharSequence("ثبت خرید ناموفق بود :)"),__c.False);
 }else {
RDebugUtils.currentLine=5046316;
 //BA.debugLineNum = 5046316;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=5046317;
 //BA.debugLineNum = 5046317;BA.debugLine="parser.Initialize(Result)";
_parser.Initialize(_result);
RDebugUtils.currentLine=5046318;
 //BA.debugLineNum = 5046318;BA.debugLine="Dim root As List = parser.NextArray";
_root = new anywheresoftware.b4a.objects.collections.List();
_root = _parser.NextArray();
RDebugUtils.currentLine=5046319;
 //BA.debugLineNum = 5046319;BA.debugLine="For Each colroot As Map In root";
_colroot = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group37 = _root;
final int groupLen37 = group37.getSize()
;int index37 = 0;
;
for (; index37 < groupLen37;index37++){
_colroot.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group37.Get(index37)));
RDebugUtils.currentLine=5046320;
 //BA.debugLineNum = 5046320;BA.debugLine="Log(Result)";
__c.LogImpl("65046320",_result,0);
RDebugUtils.currentLine=5046321;
 //BA.debugLineNum = 5046321;BA.debugLine="Dim Result As String = colroot.Get(\"result\")";
_result = BA.ObjectToString(_colroot.Get((Object)("result")));
RDebugUtils.currentLine=5046322;
 //BA.debugLineNum = 5046322;BA.debugLine="Dim c_m As String = colroot.Get(\"c_m\")";
_c_m = BA.ObjectToString(_colroot.Get((Object)("c_m")));
RDebugUtils.currentLine=5046323;
 //BA.debugLineNum = 5046323;BA.debugLine="Dim uid As String = colroot.Get(\"uid\")";
_uid = BA.ObjectToString(_colroot.Get((Object)("uid")));
RDebugUtils.currentLine=5046324;
 //BA.debugLineNum = 5046324;BA.debugLine="Dim id As String = colroot.Get(\"id\")";
_id = BA.ObjectToString(_colroot.Get((Object)("id")));
RDebugUtils.currentLine=5046325;
 //BA.debugLineNum = 5046325;BA.debugLine="Dim c_f As String = colroot.Get(\"c_f\")";
_c_f = BA.ObjectToString(_colroot.Get((Object)("c_f")));
RDebugUtils.currentLine=5046326;
 //BA.debugLineNum = 5046326;BA.debugLine="Dim pic As String = colroot.Get(\"pic\")";
_pic = BA.ObjectToString(_colroot.Get((Object)("pic")));
RDebugUtils.currentLine=5046327;
 //BA.debugLineNum = 5046327;BA.debugLine="Dim userid As String = colroot.Get(\"userid\")";
_userid = BA.ObjectToString(_colroot.Get((Object)("userid")));
RDebugUtils.currentLine=5046328;
 //BA.debugLineNum = 5046328;BA.debugLine="Dim username As String = colroot.Get(\"username";
_username = BA.ObjectToString(_colroot.Get((Object)("username")));
RDebugUtils.currentLine=5046329;
 //BA.debugLineNum = 5046329;BA.debugLine="Log(c_f)";
__c.LogImpl("65046329",_c_f,0);
RDebugUtils.currentLine=5046330;
 //BA.debugLineNum = 5046330;BA.debugLine="Log(c_m)";
__c.LogImpl("65046330",_c_m,0);
RDebugUtils.currentLine=5046333;
 //BA.debugLineNum = 5046333;BA.debugLine="CallSubDelayed2(obj,Ev&\"_\"&\"newcointele\",c_m)";
__c.CallSubDelayed2(ba,__ref._obj /*Object*/ ,__ref._ev /*String*/ +"_"+"newcointele",(Object)(_c_m));
RDebugUtils.currentLine=5046335;
 //BA.debugLineNum = 5046335;BA.debugLine="sql1.ExecNonQuery(\"UPDATE tbl_coin set cm='\"&c";
__ref._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("UPDATE tbl_coin set cm='"+_c_m+"',cf='"+_c_f+"' WHERE userid='"+__ref._i_pk /*String*/ +"' ");
 }
};
 };
 break; }
case 2: {
RDebugUtils.currentLine=5046340;
 //BA.debugLineNum = 5046340;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=5046341;
 //BA.debugLineNum = 5046341;BA.debugLine="parser.Initialize(Result)";
_parser.Initialize(_result);
RDebugUtils.currentLine=5046342;
 //BA.debugLineNum = 5046342;BA.debugLine="Dim root As List = parser.NextArray";
_root = new anywheresoftware.b4a.objects.collections.List();
_root = _parser.NextArray();
RDebugUtils.currentLine=5046343;
 //BA.debugLineNum = 5046343;BA.debugLine="For Each colroot As Map In root";
_colroot = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group57 = _root;
final int groupLen57 = group57.getSize()
;int index57 = 0;
;
for (; index57 < groupLen57;index57++){
_colroot.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group57.Get(index57)));
RDebugUtils.currentLine=5046344;
 //BA.debugLineNum = 5046344;BA.debugLine="Dim Result As String = colroot.Get(\"result\")";
_result = BA.ObjectToString(_colroot.Get((Object)("result")));
RDebugUtils.currentLine=5046345;
 //BA.debugLineNum = 5046345;BA.debugLine="Dim c_m As String = colroot.Get(\"c_m\")";
_c_m = BA.ObjectToString(_colroot.Get((Object)("c_m")));
RDebugUtils.currentLine=5046346;
 //BA.debugLineNum = 5046346;BA.debugLine="Dim uid As String = colroot.Get(\"uid\")";
_uid = BA.ObjectToString(_colroot.Get((Object)("uid")));
RDebugUtils.currentLine=5046347;
 //BA.debugLineNum = 5046347;BA.debugLine="Dim first_last As String = colroot.Get(\"first_";
_first_last = BA.ObjectToString(_colroot.Get((Object)("first_last")));
RDebugUtils.currentLine=5046348;
 //BA.debugLineNum = 5046348;BA.debugLine="Dim id As String = colroot.Get(\"id\")";
_id = BA.ObjectToString(_colroot.Get((Object)("id")));
RDebugUtils.currentLine=5046349;
 //BA.debugLineNum = 5046349;BA.debugLine="Dim userid As String = colroot.Get(\"userid\")";
_userid = BA.ObjectToString(_colroot.Get((Object)("userid")));
RDebugUtils.currentLine=5046350;
 //BA.debugLineNum = 5046350;BA.debugLine="Dim username As String = colroot.Get(\"username";
_username = BA.ObjectToString(_colroot.Get((Object)("username")));
RDebugUtils.currentLine=5046351;
 //BA.debugLineNum = 5046351;BA.debugLine="Dim c_ch As String = colroot.Get(\"c_ch\")";
_c_ch = BA.ObjectToString(_colroot.Get((Object)("c_ch")));
RDebugUtils.currentLine=5046353;
 //BA.debugLineNum = 5046353;BA.debugLine="Log(\"cc : \"&c_m)";
__c.LogImpl("65046353","cc : "+_c_m,0);
RDebugUtils.currentLine=5046354;
 //BA.debugLineNum = 5046354;BA.debugLine="Dim n_coins=c_m As Long";
_n_coins = (long)(Double.parseDouble(_c_m));
RDebugUtils.currentLine=5046355;
 //BA.debugLineNum = 5046355;BA.debugLine="CallSubDelayed2(obj,Ev&\"_\"&\"newcointele\",c_m)";
__c.CallSubDelayed2(ba,__ref._obj /*Object*/ ,__ref._ev /*String*/ +"_"+"newcointele",(Object)(_c_m));
RDebugUtils.currentLine=5046363;
 //BA.debugLineNum = 5046363;BA.debugLine="sql1.ExecNonQuery(\"UPDATE tbl_coin set cm='\"&c";
__ref._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("UPDATE tbl_coin set cm='"+_c_m+"',cf='"+_c_ch+"' WHERE userid='"+__ref._userid_t /*String*/ +"' ");
 }
};
 break; }
}
;
RDebugUtils.currentLine=5046367;
 //BA.debugLineNum = 5046367;BA.debugLine="End Sub";
return "";
}
}