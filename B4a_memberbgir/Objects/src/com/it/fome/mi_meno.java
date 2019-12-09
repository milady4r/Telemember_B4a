package com.it.fome;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class mi_meno extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "com.it.fome.mi_meno");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", com.it.fome.mi_meno.class).invoke(this, new Object[] {null});
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
public com.maximussoft.msmaterialdrawer.MSMaterialDrawerBuilder _mdb = null;
public com.maximussoft.msmaterialdrawer.MSMaterialDrawer _md = null;
public anywheresoftware.b4a.sql.SQL _sql1 = null;
public anywheresoftware.b4a.sql.SQL.CursorWrapper _cursor1 = null;
public com.mili.telegrams.teleg_warp _telegs = null;
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
public String  _addpnl(com.it.fome.mi_meno __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mi_meno";
if (Debug.shouldDelegate(ba, "addpnl", false))
	 {return ((String) Debug.delegate(ba, "addpnl", null));}
com.maximussoft.msmaterialdrawer.MSAccountHeaderBuilder _msa = null;
anywheresoftware.b4a.objects.drawable.BitmapDrawable _headerbackground = null;
Object _materialheaderresult = null;
com.maximussoft.msmaterialdrawer.IconicDrawable _p1 = null;
com.maximussoft.msmaterialdrawer.IconicDrawable _p2 = null;
com.maximussoft.msmaterialdrawer.IconicDrawable _p3 = null;
com.maximussoft.msmaterialdrawer.IconicDrawable _s1 = null;
com.maximussoft.msmaterialdrawer.IconicDrawable _s2 = null;
com.maximussoft.msmaterialdrawer.IconicDrawable _s6 = null;
com.maximussoft.msmaterialdrawer.IconicDrawable _s3 = null;
com.maximussoft.msmaterialdrawer.IconicDrawable _p11 = null;
com.maximussoft.msmaterialdrawer.IconicDrawable _p21 = null;
com.maximussoft.msmaterialdrawer.IconicDrawable _p31 = null;
com.maximussoft.msmaterialdrawer.IconicDrawable _s11 = null;
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Sub addpnl";
RDebugUtils.currentLine=851971;
 //BA.debugLineNum = 851971;BA.debugLine="Dim msa As MSAccountHeaderBuilder";
_msa = new com.maximussoft.msmaterialdrawer.MSAccountHeaderBuilder();
RDebugUtils.currentLine=851972;
 //BA.debugLineNum = 851972;BA.debugLine="Dim HeaderBackground As BitmapDrawable";
_headerbackground = new anywheresoftware.b4a.objects.drawable.BitmapDrawable();
RDebugUtils.currentLine=851973;
 //BA.debugLineNum = 851973;BA.debugLine="HeaderBackground.Initialize(LoadBitmap(File.DirAs";
_headerbackground.Initialize((android.graphics.Bitmap)(__c.LoadBitmap(__c.File.getDirAssets(),"iconmember.png").getObject()));
RDebugUtils.currentLine=851974;
 //BA.debugLineNum = 851974;BA.debugLine="msa.Initialize(\"MSA\")";
_msa.Initialize(ba,"MSA");
RDebugUtils.currentLine=851976;
 //BA.debugLineNum = 851976;BA.debugLine="msa.withHeaderBackground(HeaderBackground)";
_msa.withHeaderBackground((android.graphics.drawable.Drawable)(_headerbackground.getObject()));
RDebugUtils.currentLine=851977;
 //BA.debugLineNum = 851977;BA.debugLine="Dim MaterialHeaderResult As Object = msa.build";
_materialheaderresult = (Object)(_msa.build());
RDebugUtils.currentLine=851979;
 //BA.debugLineNum = 851979;BA.debugLine="Dim p1 As MSIconicDrawable : p1.Initialize(\"gmd_s";
_p1 = new com.maximussoft.msmaterialdrawer.IconicDrawable();
RDebugUtils.currentLine=851979;
 //BA.debugLineNum = 851979;BA.debugLine="Dim p1 As MSIconicDrawable : p1.Initialize(\"gmd_s";
_p1.Initialize(ba,"gmd_shop");
RDebugUtils.currentLine=851979;
 //BA.debugLineNum = 851979;BA.debugLine="Dim p1 As MSIconicDrawable : p1.Initialize(\"gmd_s";
_p1.setColor((int) (0xff1c1b1c));
RDebugUtils.currentLine=851980;
 //BA.debugLineNum = 851980;BA.debugLine="Dim p2 As MSIconicDrawable : p2.Initialize(\"gmd_a";
_p2 = new com.maximussoft.msmaterialdrawer.IconicDrawable();
RDebugUtils.currentLine=851980;
 //BA.debugLineNum = 851980;BA.debugLine="Dim p2 As MSIconicDrawable : p2.Initialize(\"gmd_a";
_p2.Initialize(ba,"gmd_account_child");
RDebugUtils.currentLine=851980;
 //BA.debugLineNum = 851980;BA.debugLine="Dim p2 As MSIconicDrawable : p2.Initialize(\"gmd_a";
_p2.setColor((int) (0xff1c1b1c));
RDebugUtils.currentLine=851981;
 //BA.debugLineNum = 851981;BA.debugLine="Dim p3 As MSIconicDrawable : p3.Initialize(\"gmd_l";
_p3 = new com.maximussoft.msmaterialdrawer.IconicDrawable();
RDebugUtils.currentLine=851981;
 //BA.debugLineNum = 851981;BA.debugLine="Dim p3 As MSIconicDrawable : p3.Initialize(\"gmd_l";
_p3.Initialize(ba,"gmd_lock_open");
RDebugUtils.currentLine=851981;
 //BA.debugLineNum = 851981;BA.debugLine="Dim p3 As MSIconicDrawable : p3.Initialize(\"gmd_l";
_p3.setColor((int) (0xff1c1b1c));
RDebugUtils.currentLine=851983;
 //BA.debugLineNum = 851983;BA.debugLine="Dim s1 As MSIconicDrawable : s1.Initialize(\"faw_h";
_s1 = new com.maximussoft.msmaterialdrawer.IconicDrawable();
RDebugUtils.currentLine=851983;
 //BA.debugLineNum = 851983;BA.debugLine="Dim s1 As MSIconicDrawable : s1.Initialize(\"faw_h";
_s1.Initialize(ba,"faw_heart");
RDebugUtils.currentLine=851983;
 //BA.debugLineNum = 851983;BA.debugLine="Dim s1 As MSIconicDrawable : s1.Initialize(\"faw_h";
_s1.setColor((int) (0xff1c1b1c));
RDebugUtils.currentLine=851984;
 //BA.debugLineNum = 851984;BA.debugLine="Dim s2 As MSIconicDrawable : s2.Initialize(\"gmd_c";
_s2 = new com.maximussoft.msmaterialdrawer.IconicDrawable();
RDebugUtils.currentLine=851984;
 //BA.debugLineNum = 851984;BA.debugLine="Dim s2 As MSIconicDrawable : s2.Initialize(\"gmd_c";
_s2.Initialize(ba,"gmd_call_made");
RDebugUtils.currentLine=851984;
 //BA.debugLineNum = 851984;BA.debugLine="Dim s2 As MSIconicDrawable : s2.Initialize(\"gmd_c";
_s2.setColor((int) (0xff1c1b1c));
RDebugUtils.currentLine=851987;
 //BA.debugLineNum = 851987;BA.debugLine="Dim s6 As MSIconicDrawable :  s6.Initialize(\"faw_";
_s6 = new com.maximussoft.msmaterialdrawer.IconicDrawable();
RDebugUtils.currentLine=851987;
 //BA.debugLineNum = 851987;BA.debugLine="Dim s6 As MSIconicDrawable :  s6.Initialize(\"faw_";
_s6.Initialize(ba,"faw_code");
RDebugUtils.currentLine=851987;
 //BA.debugLineNum = 851987;BA.debugLine="Dim s6 As MSIconicDrawable :  s6.Initialize(\"faw_";
_s6.setColor((int) (0xff1c1b1c));
RDebugUtils.currentLine=851989;
 //BA.debugLineNum = 851989;BA.debugLine="Dim s3 As MSIconicDrawable :  s3.Initialize(\"gmd_";
_s3 = new com.maximussoft.msmaterialdrawer.IconicDrawable();
RDebugUtils.currentLine=851989;
 //BA.debugLineNum = 851989;BA.debugLine="Dim s3 As MSIconicDrawable :  s3.Initialize(\"gmd_";
_s3.Initialize(ba,"gmd_info");
RDebugUtils.currentLine=851989;
 //BA.debugLineNum = 851989;BA.debugLine="Dim s3 As MSIconicDrawable :  s3.Initialize(\"gmd_";
_s3.setColor((int) (0xff1c1b1c));
RDebugUtils.currentLine=851991;
 //BA.debugLineNum = 851991;BA.debugLine="Dim p11 As MSIconicDrawable : p11.Initialize(\"gmd";
_p11 = new com.maximussoft.msmaterialdrawer.IconicDrawable();
RDebugUtils.currentLine=851991;
 //BA.debugLineNum = 851991;BA.debugLine="Dim p11 As MSIconicDrawable : p11.Initialize(\"gmd";
_p11.Initialize(ba,"gmd_person");
RDebugUtils.currentLine=851991;
 //BA.debugLineNum = 851991;BA.debugLine="Dim p11 As MSIconicDrawable : p11.Initialize(\"gmd";
_p1.setColor((int) (0xff1c1b1c));
RDebugUtils.currentLine=851992;
 //BA.debugLineNum = 851992;BA.debugLine="Dim p21 As MSIconicDrawable : p21.Initialize(\"gmd";
_p21 = new com.maximussoft.msmaterialdrawer.IconicDrawable();
RDebugUtils.currentLine=851992;
 //BA.debugLineNum = 851992;BA.debugLine="Dim p21 As MSIconicDrawable : p21.Initialize(\"gmd";
_p21.Initialize(ba,"gmd_forum");
RDebugUtils.currentLine=851992;
 //BA.debugLineNum = 851992;BA.debugLine="Dim p21 As MSIconicDrawable : p21.Initialize(\"gmd";
_p2.setColor((int) (0xff1c1b1c));
RDebugUtils.currentLine=851993;
 //BA.debugLineNum = 851993;BA.debugLine="Dim p31 As MSIconicDrawable : p31.Initialize(\"gmd";
_p31 = new com.maximussoft.msmaterialdrawer.IconicDrawable();
RDebugUtils.currentLine=851993;
 //BA.debugLineNum = 851993;BA.debugLine="Dim p31 As MSIconicDrawable : p31.Initialize(\"gmd";
_p31.Initialize(ba,"gmd_phone_android");
RDebugUtils.currentLine=851993;
 //BA.debugLineNum = 851993;BA.debugLine="Dim p31 As MSIconicDrawable : p31.Initialize(\"gmd";
_p3.setColor((int) (0xff1c1b1c));
RDebugUtils.currentLine=851994;
 //BA.debugLineNum = 851994;BA.debugLine="Dim s11 As MSIconicDrawable : s11.Initialize(\"gmd";
_s11 = new com.maximussoft.msmaterialdrawer.IconicDrawable();
RDebugUtils.currentLine=851994;
 //BA.debugLineNum = 851994;BA.debugLine="Dim s11 As MSIconicDrawable : s11.Initialize(\"gmd";
_s11.Initialize(ba,"gmd_exit_to_app");
RDebugUtils.currentLine=851994;
 //BA.debugLineNum = 851994;BA.debugLine="Dim s11 As MSIconicDrawable : s11.Initialize(\"gmd";
_s1.setColor((int) (0xff1c1b1c));
RDebugUtils.currentLine=851997;
 //BA.debugLineNum = 851997;BA.debugLine="MDB.Initialize(\"MD\")";
__ref._mdb /*com.maximussoft.msmaterialdrawer.MSMaterialDrawerBuilder*/ .Initialize(ba,"MD");
RDebugUtils.currentLine=851998;
 //BA.debugLineNum = 851998;BA.debugLine="MDB.withAccountHeader(MaterialHeaderResult)";
__ref._mdb /*com.maximussoft.msmaterialdrawer.MSMaterialDrawerBuilder*/ .withAccountHeader((com.mikepenz.materialdrawer.accountswitcher.AccountHeader.Result)(_materialheaderresult));
RDebugUtils.currentLine=852001;
 //BA.debugLineNum = 852001;BA.debugLine="MDB.AddSecondaryDrawerItem(\"درباره ی ما\"     ,s3.";
__ref._mdb /*com.maximussoft.msmaterialdrawer.MSMaterialDrawerBuilder*/ .AddSecondaryDrawerItem("درباره ی ما",_s3.getDrawable(),(android.graphics.drawable.Drawable)(__c.Null),"",__c.True,(int) (0));
RDebugUtils.currentLine=852002;
 //BA.debugLineNum = 852002;BA.debugLine="MDB.AddSecondaryDrawerItem(\"ارتباط با پشتیبان\"";
__ref._mdb /*com.maximussoft.msmaterialdrawer.MSMaterialDrawerBuilder*/ .AddSecondaryDrawerItem("ارتباط با پشتیبان",_p11.getDrawable(),(android.graphics.drawable.Drawable)(__c.Null),"",__c.True,(int) (1));
RDebugUtils.currentLine=852003;
 //BA.debugLineNum = 852003;BA.debugLine="MDB.AddSecondaryDrawerItem(\"خروج از حساب کاربری\"";
__ref._mdb /*com.maximussoft.msmaterialdrawer.MSMaterialDrawerBuilder*/ .AddSecondaryDrawerItem("خروج از حساب کاربری",_s11.getDrawable(),(android.graphics.drawable.Drawable)(__c.Null),"",__c.True,(int) (2));
RDebugUtils.currentLine=852004;
 //BA.debugLineNum = 852004;BA.debugLine="MDB.AddSecondaryDrawerItem(\"خروج\"   ,s11.Drawable";
__ref._mdb /*com.maximussoft.msmaterialdrawer.MSMaterialDrawerBuilder*/ .AddSecondaryDrawerItem("خروج",_s11.getDrawable(),(android.graphics.drawable.Drawable)(__c.Null),"",__c.True,(int) (3));
RDebugUtils.currentLine=852005;
 //BA.debugLineNum = 852005;BA.debugLine="MDB.AddSecondaryDrawerItem(\"موفق باشید!\"       ,N";
__ref._mdb /*com.maximussoft.msmaterialdrawer.MSMaterialDrawerBuilder*/ .AddSecondaryDrawerItem("موفق باشید!",(android.graphics.drawable.Drawable)(__c.Null),(android.graphics.drawable.Drawable)(__c.Null),"",__c.False,(int) (3));
RDebugUtils.currentLine=852006;
 //BA.debugLineNum = 852006;BA.debugLine="MDB.withDrawerGravity(Gravity.LEFT)";
__ref._mdb /*com.maximussoft.msmaterialdrawer.MSMaterialDrawerBuilder*/ .withDrawerGravity(__c.Gravity.LEFT);
RDebugUtils.currentLine=852007;
 //BA.debugLineNum = 852007;BA.debugLine="MDB.withTransluscentStatusbar(False)";
__ref._mdb /*com.maximussoft.msmaterialdrawer.MSMaterialDrawerBuilder*/ .withTransluscentStatusbar(__c.False);
RDebugUtils.currentLine=852009;
 //BA.debugLineNum = 852009;BA.debugLine="MD = MDB.Build";
__ref._md /*com.maximussoft.msmaterialdrawer.MSMaterialDrawer*/  = __ref._mdb /*com.maximussoft.msmaterialdrawer.MSMaterialDrawerBuilder*/ .Build();
RDebugUtils.currentLine=852012;
 //BA.debugLineNum = 852012;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(com.it.fome.mi_meno __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mi_meno";
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="Private Ev As String";
_ev = "";
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="Private obj As Object";
_obj = new Object();
RDebugUtils.currentLine=720900;
 //BA.debugLineNum = 720900;BA.debugLine="Dim MDB As MSMaterialDrawerBuilder";
_mdb = new com.maximussoft.msmaterialdrawer.MSMaterialDrawerBuilder();
RDebugUtils.currentLine=720901;
 //BA.debugLineNum = 720901;BA.debugLine="Dim MD As MSMaterialDrawer";
_md = new com.maximussoft.msmaterialdrawer.MSMaterialDrawer();
RDebugUtils.currentLine=720902;
 //BA.debugLineNum = 720902;BA.debugLine="Private sql1 As SQL";
_sql1 = new anywheresoftware.b4a.sql.SQL();
RDebugUtils.currentLine=720903;
 //BA.debugLineNum = 720903;BA.debugLine="Private cursor1 As Cursor";
_cursor1 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=720904;
 //BA.debugLineNum = 720904;BA.debugLine="Dim telegs As milad_telegramv3";
_telegs = new com.mili.telegrams.teleg_warp();
RDebugUtils.currentLine=720905;
 //BA.debugLineNum = 720905;BA.debugLine="Dim username_t ,userid_t As String";
_username_t = "";
_userid_t = "";
RDebugUtils.currentLine=720907;
 //BA.debugLineNum = 720907;BA.debugLine="End Sub";
return "";
}
public String  _initialize(com.it.fome.mi_meno __ref,anywheresoftware.b4a.BA _ba,String _eventname,Object _module) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="mi_meno";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_eventname,_module}));}
int _i = 0;
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Public Sub Initialize(EventName As String,Module A";
RDebugUtils.currentLine=786433;
 //BA.debugLineNum = 786433;BA.debugLine="Ev = EventName";
__ref._ev /*String*/  = _eventname;
RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="obj = Module";
__ref._obj /*Object*/  = _module;
RDebugUtils.currentLine=786435;
 //BA.debugLineNum = 786435;BA.debugLine="If File.Exists(File.DirInternal,\"instadb.db\")=Fal";
if (__c.File.Exists(__c.File.getDirInternal(),"instadb.db")==__c.False) { 
RDebugUtils.currentLine=786436;
 //BA.debugLineNum = 786436;BA.debugLine="File.Copy(File.DirAssets,\"instadb.db\",File.DirIn";
__c.File.Copy(__c.File.getDirAssets(),"instadb.db",__c.File.getDirInternal(),"instadb.db");
 };
RDebugUtils.currentLine=786438;
 //BA.debugLineNum = 786438;BA.debugLine="If sql1.IsInitialized=False Then";
if (__ref._sql1 /*anywheresoftware.b4a.sql.SQL*/ .IsInitialized()==__c.False) { 
RDebugUtils.currentLine=786439;
 //BA.debugLineNum = 786439;BA.debugLine="sql1.Initialize(File.DirInternal,\"instadb.db\",Fa";
__ref._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Initialize(__c.File.getDirInternal(),"instadb.db",__c.False);
 };
RDebugUtils.currentLine=786451;
 //BA.debugLineNum = 786451;BA.debugLine="cursor1 = sql1.ExecQuery(\"SELECT * FROM tbl_tele";
__ref._cursor1 /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .setObject((android.database.Cursor)(__ref._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM tbl_tele WHERE soich='1'")));
RDebugUtils.currentLine=786452;
 //BA.debugLineNum = 786452;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=786453;
 //BA.debugLineNum = 786453;BA.debugLine="For i=0 To cursor1.RowCount-1";
{
final int step11 = 1;
final int limit11 = (int) (__ref._cursor1 /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit11 ;_i = _i + step11 ) {
RDebugUtils.currentLine=786454;
 //BA.debugLineNum = 786454;BA.debugLine="cursor1.Position=i";
__ref._cursor1 /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .setPosition(_i);
RDebugUtils.currentLine=786455;
 //BA.debugLineNum = 786455;BA.debugLine="userid_t=cursor1.GetString(\"userid\")";
__ref._userid_t /*String*/  = __ref._cursor1 /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .GetString("userid");
RDebugUtils.currentLine=786456;
 //BA.debugLineNum = 786456;BA.debugLine="username_t=cursor1.GetString(\"username\")";
__ref._username_t /*String*/  = __ref._cursor1 /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ .GetString("username");
 }
};
RDebugUtils.currentLine=786459;
 //BA.debugLineNum = 786459;BA.debugLine="End Sub";
return "";
}
public String  _md_itemclick(com.it.fome.mi_meno __ref,int _position,int _identifier) throws Exception{
__ref = this;
RDebugUtils.currentModule="mi_meno";
if (Debug.shouldDelegate(ba, "md_itemclick", false))
	 {return ((String) Debug.delegate(ba, "md_itemclick", new Object[] {_position,_identifier}));}
de.amberhome.materialdialogs.MaterialDialogBuilderWrapper _builder = null;
String _str = "";
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Sub MD_ItemClick(Position As Int, Identifier As In";
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="Log(\"Clicked:\" & Position & \" Iden:\" & Identifier";
__c.LogImpl("6917505","Clicked:"+BA.NumberToString(_position)+" Iden:"+BA.NumberToString(_identifier),0);
RDebugUtils.currentLine=917507;
 //BA.debugLineNum = 917507;BA.debugLine="If Position = 0 Then 'darbare";
if (_position==0) { 
RDebugUtils.currentLine=917508;
 //BA.debugLineNum = 917508;BA.debugLine="Dim Builder As MaterialDialogBuilder";
_builder = new de.amberhome.materialdialogs.MaterialDialogBuilderWrapper();
RDebugUtils.currentLine=917509;
 //BA.debugLineNum = 917509;BA.debugLine="Builder.Initialize(\"Dialog\")";
_builder.Initialize(ba,"Dialog");
RDebugUtils.currentLine=917510;
 //BA.debugLineNum = 917510;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=917511;
 //BA.debugLineNum = 917511;BA.debugLine="str=$\" 		خدمات ویژه پیشرو ممبر بگیر 		ممبر واقعی";
_str = ("\n"+"		خدمات ویژه پیشرو ممبر بگیر\n"+"		ممبر واقعی و ایرانی \n"+"		:« در این روش ممبرهای کاملا انلاین و\n"+"		 ایرانی در کانال شما عضو میشوند و\n"+"		 از کیفیت مطلوبی برخوردار هستند و\n"+"		 متناسب ترین قیمت را داراست\n"+"		\n"+"		پشتیبانی بهترین نوع افزایش ممبر کانال میباشد\n"+"		 چرا که کاربران با اختیار خود\n"+"		 در کانال شما عضو خواهند شد\n"+"		");
RDebugUtils.currentLine=917523;
 //BA.debugLineNum = 917523;BA.debugLine="Builder.Content(str).Title(\"درباره ما\")";
_builder.Content(BA.ObjectToCharSequence(_str)).Title(BA.ObjectToCharSequence("درباره ما"));
RDebugUtils.currentLine=917525;
 //BA.debugLineNum = 917525;BA.debugLine="Builder.ItemsCallback";
_builder.ItemsCallback();
RDebugUtils.currentLine=917526;
 //BA.debugLineNum = 917526;BA.debugLine="Builder.Show";
_builder.Show();
 };
RDebugUtils.currentLine=917529;
 //BA.debugLineNum = 917529;BA.debugLine="If Position = 1 Then 'poshtibani";
if (_position==1) { 
RDebugUtils.currentLine=917531;
 //BA.debugLineNum = 917531;BA.debugLine="Dim Builder As MaterialDialogBuilder";
_builder = new de.amberhome.materialdialogs.MaterialDialogBuilderWrapper();
RDebugUtils.currentLine=917532;
 //BA.debugLineNum = 917532;BA.debugLine="Builder.Initialize(\"Dialog\")";
_builder.Initialize(ba,"Dialog");
RDebugUtils.currentLine=917533;
 //BA.debugLineNum = 917533;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=917534;
 //BA.debugLineNum = 917534;BA.debugLine="str=$\" 		جهت ارتباط با ما  		aaaa@gmail.com";
_str = ("\n"+"		جهت ارتباط با ما \n"+"		aaaa@gmail.com\n"+"		\n"+"		");
RDebugUtils.currentLine=917539;
 //BA.debugLineNum = 917539;BA.debugLine="Builder.Content(str).Title(\"پشتیبانی\")";
_builder.Content(BA.ObjectToCharSequence(_str)).Title(BA.ObjectToCharSequence("پشتیبانی"));
RDebugUtils.currentLine=917541;
 //BA.debugLineNum = 917541;BA.debugLine="Builder.ItemsCallback";
_builder.ItemsCallback();
RDebugUtils.currentLine=917542;
 //BA.debugLineNum = 917542;BA.debugLine="Builder.Show";
_builder.Show();
 };
RDebugUtils.currentLine=917545;
 //BA.debugLineNum = 917545;BA.debugLine="If Position = 2 Then";
if (_position==2) { 
RDebugUtils.currentLine=917547;
 //BA.debugLineNum = 917547;BA.debugLine="ToastMessageShow(\"باموفقیت خارج شدید\",False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("باموفقیت خارج شدید"),__c.False);
RDebugUtils.currentLine=917548;
 //BA.debugLineNum = 917548;BA.debugLine="telegs.logOut()";
__ref._telegs /*com.mili.telegrams.teleg_warp*/ .logOut();
RDebugUtils.currentLine=917549;
 //BA.debugLineNum = 917549;BA.debugLine="sql1.ExecNonQuery(\"Delete FROM tbl_tele WHERE us";
__ref._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Delete FROM tbl_tele WHERE username='"+__ref._username_t /*String*/ +"'");
RDebugUtils.currentLine=917550;
 //BA.debugLineNum = 917550;BA.debugLine="StartActivity(ac_home)";
__c.StartActivity(ba,(Object)(_ac_home.getObject()));
 };
RDebugUtils.currentLine=917552;
 //BA.debugLineNum = 917552;BA.debugLine="If Position = 3 Then";
if (_position==3) { 
RDebugUtils.currentLine=917554;
 //BA.debugLineNum = 917554;BA.debugLine="Try";
try {RDebugUtils.currentLine=917558;
 //BA.debugLineNum = 917558;BA.debugLine="ExitApplication";
__c.ExitApplication();
 } 
       catch (Exception e30) {
			ba.setLastException(e30);RDebugUtils.currentLine=917560;
 //BA.debugLineNum = 917560;BA.debugLine="Log(LastException)";
__c.LogImpl("6917560",BA.ObjectToString(__c.LastException(ba)),0);
 };
 };
RDebugUtils.currentLine=917565;
 //BA.debugLineNum = 917565;BA.debugLine="If Position = 4 Then";
if (_position==4) { 
 };
RDebugUtils.currentLine=917570;
 //BA.debugLineNum = 917570;BA.debugLine="If Position = 5 Then";
if (_position==5) { 
 };
RDebugUtils.currentLine=917575;
 //BA.debugLineNum = 917575;BA.debugLine="If Position = 6 Then";
if (_position==6) { 
 };
RDebugUtils.currentLine=917581;
 //BA.debugLineNum = 917581;BA.debugLine="End Sub";
return "";
}
public String  _open(com.it.fome.mi_meno __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mi_meno";
if (Debug.shouldDelegate(ba, "open", false))
	 {return ((String) Debug.delegate(ba, "open", null));}
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Sub open";
RDebugUtils.currentLine=983041;
 //BA.debugLineNum = 983041;BA.debugLine="MD.OpenDrawer";
__ref._md /*com.maximussoft.msmaterialdrawer.MSMaterialDrawer*/ .OpenDrawer();
RDebugUtils.currentLine=983043;
 //BA.debugLineNum = 983043;BA.debugLine="End Sub";
return "";
}
}