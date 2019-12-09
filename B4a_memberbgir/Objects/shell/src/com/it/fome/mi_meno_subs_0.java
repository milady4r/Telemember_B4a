package com.it.fome;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class mi_meno_subs_0 {


public static RemoteObject  _addpnl(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("addpnl (mi_meno) ","mi_meno",1,__ref.getField(false, "ba"),__ref,45);
if (RapidSub.canDelegate("addpnl")) { return __ref.runUserSub(false, "mi_meno","addpnl", __ref);}
RemoteObject _msa = RemoteObject.declareNull("com.maximussoft.msmaterialdrawer.MSAccountHeaderBuilder");
RemoteObject _headerbackground = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.BitmapDrawable");
RemoteObject _materialheaderresult = RemoteObject.declareNull("Object");
RemoteObject _p1 = RemoteObject.declareNull("com.maximussoft.msmaterialdrawer.IconicDrawable");
RemoteObject _p2 = RemoteObject.declareNull("com.maximussoft.msmaterialdrawer.IconicDrawable");
RemoteObject _p3 = RemoteObject.declareNull("com.maximussoft.msmaterialdrawer.IconicDrawable");
RemoteObject _s1 = RemoteObject.declareNull("com.maximussoft.msmaterialdrawer.IconicDrawable");
RemoteObject _s2 = RemoteObject.declareNull("com.maximussoft.msmaterialdrawer.IconicDrawable");
RemoteObject _s6 = RemoteObject.declareNull("com.maximussoft.msmaterialdrawer.IconicDrawable");
RemoteObject _s3 = RemoteObject.declareNull("com.maximussoft.msmaterialdrawer.IconicDrawable");
RemoteObject _p11 = RemoteObject.declareNull("com.maximussoft.msmaterialdrawer.IconicDrawable");
RemoteObject _p21 = RemoteObject.declareNull("com.maximussoft.msmaterialdrawer.IconicDrawable");
RemoteObject _p31 = RemoteObject.declareNull("com.maximussoft.msmaterialdrawer.IconicDrawable");
RemoteObject _s11 = RemoteObject.declareNull("com.maximussoft.msmaterialdrawer.IconicDrawable");
 BA.debugLineNum = 45;BA.debugLine="Sub addpnl";
Debug.ShouldStop(4096);
 BA.debugLineNum = 48;BA.debugLine="Dim msa As MSAccountHeaderBuilder";
Debug.ShouldStop(32768);
_msa = RemoteObject.createNew ("com.maximussoft.msmaterialdrawer.MSAccountHeaderBuilder");Debug.locals.put("msa", _msa);
 BA.debugLineNum = 49;BA.debugLine="Dim HeaderBackground As BitmapDrawable";
Debug.ShouldStop(65536);
_headerbackground = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.BitmapDrawable");Debug.locals.put("HeaderBackground", _headerbackground);
 BA.debugLineNum = 50;BA.debugLine="HeaderBackground.Initialize(LoadBitmap(File.DirAs";
Debug.ShouldStop(131072);
_headerbackground.runVoidMethod ("Initialize",(Object)((mi_meno.__c.runMethod(false,"LoadBitmap",(Object)(mi_meno.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("iconmember.png"))).getObject())));
 BA.debugLineNum = 51;BA.debugLine="msa.Initialize(\"MSA\")";
Debug.ShouldStop(262144);
_msa.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("MSA")));
 BA.debugLineNum = 53;BA.debugLine="msa.withHeaderBackground(HeaderBackground)";
Debug.ShouldStop(1048576);
_msa.runVoidMethod ("withHeaderBackground",(Object)((_headerbackground.getObject())));
 BA.debugLineNum = 54;BA.debugLine="Dim MaterialHeaderResult As Object = msa.build";
Debug.ShouldStop(2097152);
_materialheaderresult = (_msa.runMethod(false,"build"));Debug.locals.put("MaterialHeaderResult", _materialheaderresult);Debug.locals.put("MaterialHeaderResult", _materialheaderresult);
 BA.debugLineNum = 56;BA.debugLine="Dim p1 As MSIconicDrawable : p1.Initialize(\"gmd_s";
Debug.ShouldStop(8388608);
_p1 = RemoteObject.createNew ("com.maximussoft.msmaterialdrawer.IconicDrawable");Debug.locals.put("p1", _p1);
 BA.debugLineNum = 56;BA.debugLine="Dim p1 As MSIconicDrawable : p1.Initialize(\"gmd_s";
Debug.ShouldStop(8388608);
_p1.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("gmd_shop")));
 BA.debugLineNum = 56;BA.debugLine="Dim p1 As MSIconicDrawable : p1.Initialize(\"gmd_s";
Debug.ShouldStop(8388608);
_p1.runVoidMethod ("setColor",BA.numberCast(int.class, 0xff1c1b1c));
 BA.debugLineNum = 57;BA.debugLine="Dim p2 As MSIconicDrawable : p2.Initialize(\"gmd_a";
Debug.ShouldStop(16777216);
_p2 = RemoteObject.createNew ("com.maximussoft.msmaterialdrawer.IconicDrawable");Debug.locals.put("p2", _p2);
 BA.debugLineNum = 57;BA.debugLine="Dim p2 As MSIconicDrawable : p2.Initialize(\"gmd_a";
Debug.ShouldStop(16777216);
_p2.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("gmd_account_child")));
 BA.debugLineNum = 57;BA.debugLine="Dim p2 As MSIconicDrawable : p2.Initialize(\"gmd_a";
Debug.ShouldStop(16777216);
_p2.runVoidMethod ("setColor",BA.numberCast(int.class, 0xff1c1b1c));
 BA.debugLineNum = 58;BA.debugLine="Dim p3 As MSIconicDrawable : p3.Initialize(\"gmd_l";
Debug.ShouldStop(33554432);
_p3 = RemoteObject.createNew ("com.maximussoft.msmaterialdrawer.IconicDrawable");Debug.locals.put("p3", _p3);
 BA.debugLineNum = 58;BA.debugLine="Dim p3 As MSIconicDrawable : p3.Initialize(\"gmd_l";
Debug.ShouldStop(33554432);
_p3.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("gmd_lock_open")));
 BA.debugLineNum = 58;BA.debugLine="Dim p3 As MSIconicDrawable : p3.Initialize(\"gmd_l";
Debug.ShouldStop(33554432);
_p3.runVoidMethod ("setColor",BA.numberCast(int.class, 0xff1c1b1c));
 BA.debugLineNum = 60;BA.debugLine="Dim s1 As MSIconicDrawable : s1.Initialize(\"faw_h";
Debug.ShouldStop(134217728);
_s1 = RemoteObject.createNew ("com.maximussoft.msmaterialdrawer.IconicDrawable");Debug.locals.put("s1", _s1);
 BA.debugLineNum = 60;BA.debugLine="Dim s1 As MSIconicDrawable : s1.Initialize(\"faw_h";
Debug.ShouldStop(134217728);
_s1.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("faw_heart")));
 BA.debugLineNum = 60;BA.debugLine="Dim s1 As MSIconicDrawable : s1.Initialize(\"faw_h";
Debug.ShouldStop(134217728);
_s1.runVoidMethod ("setColor",BA.numberCast(int.class, 0xff1c1b1c));
 BA.debugLineNum = 61;BA.debugLine="Dim s2 As MSIconicDrawable : s2.Initialize(\"gmd_c";
Debug.ShouldStop(268435456);
_s2 = RemoteObject.createNew ("com.maximussoft.msmaterialdrawer.IconicDrawable");Debug.locals.put("s2", _s2);
 BA.debugLineNum = 61;BA.debugLine="Dim s2 As MSIconicDrawable : s2.Initialize(\"gmd_c";
Debug.ShouldStop(268435456);
_s2.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("gmd_call_made")));
 BA.debugLineNum = 61;BA.debugLine="Dim s2 As MSIconicDrawable : s2.Initialize(\"gmd_c";
Debug.ShouldStop(268435456);
_s2.runVoidMethod ("setColor",BA.numberCast(int.class, 0xff1c1b1c));
 BA.debugLineNum = 64;BA.debugLine="Dim s6 As MSIconicDrawable :  s6.Initialize(\"faw_";
Debug.ShouldStop(-2147483648);
_s6 = RemoteObject.createNew ("com.maximussoft.msmaterialdrawer.IconicDrawable");Debug.locals.put("s6", _s6);
 BA.debugLineNum = 64;BA.debugLine="Dim s6 As MSIconicDrawable :  s6.Initialize(\"faw_";
Debug.ShouldStop(-2147483648);
_s6.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("faw_code")));
 BA.debugLineNum = 64;BA.debugLine="Dim s6 As MSIconicDrawable :  s6.Initialize(\"faw_";
Debug.ShouldStop(-2147483648);
_s6.runVoidMethod ("setColor",BA.numberCast(int.class, 0xff1c1b1c));
 BA.debugLineNum = 66;BA.debugLine="Dim s3 As MSIconicDrawable :  s3.Initialize(\"gmd_";
Debug.ShouldStop(2);
_s3 = RemoteObject.createNew ("com.maximussoft.msmaterialdrawer.IconicDrawable");Debug.locals.put("s3", _s3);
 BA.debugLineNum = 66;BA.debugLine="Dim s3 As MSIconicDrawable :  s3.Initialize(\"gmd_";
Debug.ShouldStop(2);
_s3.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("gmd_info")));
 BA.debugLineNum = 66;BA.debugLine="Dim s3 As MSIconicDrawable :  s3.Initialize(\"gmd_";
Debug.ShouldStop(2);
_s3.runVoidMethod ("setColor",BA.numberCast(int.class, 0xff1c1b1c));
 BA.debugLineNum = 68;BA.debugLine="Dim p11 As MSIconicDrawable : p11.Initialize(\"gmd";
Debug.ShouldStop(8);
_p11 = RemoteObject.createNew ("com.maximussoft.msmaterialdrawer.IconicDrawable");Debug.locals.put("p11", _p11);
 BA.debugLineNum = 68;BA.debugLine="Dim p11 As MSIconicDrawable : p11.Initialize(\"gmd";
Debug.ShouldStop(8);
_p11.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("gmd_person")));
 BA.debugLineNum = 68;BA.debugLine="Dim p11 As MSIconicDrawable : p11.Initialize(\"gmd";
Debug.ShouldStop(8);
_p1.runVoidMethod ("setColor",BA.numberCast(int.class, 0xff1c1b1c));
 BA.debugLineNum = 69;BA.debugLine="Dim p21 As MSIconicDrawable : p21.Initialize(\"gmd";
Debug.ShouldStop(16);
_p21 = RemoteObject.createNew ("com.maximussoft.msmaterialdrawer.IconicDrawable");Debug.locals.put("p21", _p21);
 BA.debugLineNum = 69;BA.debugLine="Dim p21 As MSIconicDrawable : p21.Initialize(\"gmd";
Debug.ShouldStop(16);
_p21.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("gmd_forum")));
 BA.debugLineNum = 69;BA.debugLine="Dim p21 As MSIconicDrawable : p21.Initialize(\"gmd";
Debug.ShouldStop(16);
_p2.runVoidMethod ("setColor",BA.numberCast(int.class, 0xff1c1b1c));
 BA.debugLineNum = 70;BA.debugLine="Dim p31 As MSIconicDrawable : p31.Initialize(\"gmd";
Debug.ShouldStop(32);
_p31 = RemoteObject.createNew ("com.maximussoft.msmaterialdrawer.IconicDrawable");Debug.locals.put("p31", _p31);
 BA.debugLineNum = 70;BA.debugLine="Dim p31 As MSIconicDrawable : p31.Initialize(\"gmd";
Debug.ShouldStop(32);
_p31.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("gmd_phone_android")));
 BA.debugLineNum = 70;BA.debugLine="Dim p31 As MSIconicDrawable : p31.Initialize(\"gmd";
Debug.ShouldStop(32);
_p3.runVoidMethod ("setColor",BA.numberCast(int.class, 0xff1c1b1c));
 BA.debugLineNum = 71;BA.debugLine="Dim s11 As MSIconicDrawable : s11.Initialize(\"gmd";
Debug.ShouldStop(64);
_s11 = RemoteObject.createNew ("com.maximussoft.msmaterialdrawer.IconicDrawable");Debug.locals.put("s11", _s11);
 BA.debugLineNum = 71;BA.debugLine="Dim s11 As MSIconicDrawable : s11.Initialize(\"gmd";
Debug.ShouldStop(64);
_s11.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("gmd_exit_to_app")));
 BA.debugLineNum = 71;BA.debugLine="Dim s11 As MSIconicDrawable : s11.Initialize(\"gmd";
Debug.ShouldStop(64);
_s1.runVoidMethod ("setColor",BA.numberCast(int.class, 0xff1c1b1c));
 BA.debugLineNum = 74;BA.debugLine="MDB.Initialize(\"MD\")";
Debug.ShouldStop(512);
__ref.getField(false,"_mdb" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("MD")));
 BA.debugLineNum = 75;BA.debugLine="MDB.withAccountHeader(MaterialHeaderResult)";
Debug.ShouldStop(1024);
__ref.getField(false,"_mdb" /*RemoteObject*/ ).runVoidMethod ("withAccountHeader",(Object)((_materialheaderresult)));
 BA.debugLineNum = 78;BA.debugLine="MDB.AddSecondaryDrawerItem(\"درباره ی ما\"     ,s3.";
Debug.ShouldStop(8192);
__ref.getField(false,"_mdb" /*RemoteObject*/ ).runVoidMethod ("AddSecondaryDrawerItem",(Object)(BA.ObjectToString("درباره ی ما")),(Object)(_s3.runMethod(false,"getDrawable")),(Object)((mi_meno.__c.getField(false,"Null"))),(Object)(BA.ObjectToString("")),(Object)(mi_meno.__c.getField(true,"True")),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 79;BA.debugLine="MDB.AddSecondaryDrawerItem(\"ارتباط با پشتیبان\"";
Debug.ShouldStop(16384);
__ref.getField(false,"_mdb" /*RemoteObject*/ ).runVoidMethod ("AddSecondaryDrawerItem",(Object)(BA.ObjectToString("ارتباط با پشتیبان")),(Object)(_p11.runMethod(false,"getDrawable")),(Object)((mi_meno.__c.getField(false,"Null"))),(Object)(BA.ObjectToString("")),(Object)(mi_meno.__c.getField(true,"True")),(Object)(BA.numberCast(int.class, 1)));
 BA.debugLineNum = 80;BA.debugLine="MDB.AddSecondaryDrawerItem(\"خروج از حساب کاربری\"";
Debug.ShouldStop(32768);
__ref.getField(false,"_mdb" /*RemoteObject*/ ).runVoidMethod ("AddSecondaryDrawerItem",(Object)(BA.ObjectToString("خروج از حساب کاربری")),(Object)(_s11.runMethod(false,"getDrawable")),(Object)((mi_meno.__c.getField(false,"Null"))),(Object)(BA.ObjectToString("")),(Object)(mi_meno.__c.getField(true,"True")),(Object)(BA.numberCast(int.class, 2)));
 BA.debugLineNum = 81;BA.debugLine="MDB.AddSecondaryDrawerItem(\"خروج\"   ,s11.Drawable";
Debug.ShouldStop(65536);
__ref.getField(false,"_mdb" /*RemoteObject*/ ).runVoidMethod ("AddSecondaryDrawerItem",(Object)(BA.ObjectToString("خروج")),(Object)(_s11.runMethod(false,"getDrawable")),(Object)((mi_meno.__c.getField(false,"Null"))),(Object)(BA.ObjectToString("")),(Object)(mi_meno.__c.getField(true,"True")),(Object)(BA.numberCast(int.class, 3)));
 BA.debugLineNum = 82;BA.debugLine="MDB.AddSecondaryDrawerItem(\"موفق باشید!\"       ,N";
Debug.ShouldStop(131072);
__ref.getField(false,"_mdb" /*RemoteObject*/ ).runVoidMethod ("AddSecondaryDrawerItem",(Object)(BA.ObjectToString("موفق باشید!")),(Object)((mi_meno.__c.getField(false,"Null"))),(Object)((mi_meno.__c.getField(false,"Null"))),(Object)(BA.ObjectToString("")),(Object)(mi_meno.__c.getField(true,"False")),(Object)(BA.numberCast(int.class, 3)));
 BA.debugLineNum = 83;BA.debugLine="MDB.withDrawerGravity(Gravity.LEFT)";
Debug.ShouldStop(262144);
__ref.getField(false,"_mdb" /*RemoteObject*/ ).runVoidMethod ("withDrawerGravity",(Object)(mi_meno.__c.getField(false,"Gravity").getField(true,"LEFT")));
 BA.debugLineNum = 84;BA.debugLine="MDB.withTransluscentStatusbar(False)";
Debug.ShouldStop(524288);
__ref.getField(false,"_mdb" /*RemoteObject*/ ).runVoidMethod ("withTransluscentStatusbar",(Object)(mi_meno.__c.getField(true,"False")));
 BA.debugLineNum = 86;BA.debugLine="MD = MDB.Build";
Debug.ShouldStop(2097152);
__ref.setField ("_md" /*RemoteObject*/ ,__ref.getField(false,"_mdb" /*RemoteObject*/ ).runMethod(false,"Build"));
 BA.debugLineNum = 89;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private Ev As String";
mi_meno._ev = RemoteObject.createImmutable("");__ref.setField("_ev",mi_meno._ev);
 //BA.debugLineNum = 3;BA.debugLine="Private obj As Object";
mi_meno._obj = RemoteObject.createNew ("Object");__ref.setField("_obj",mi_meno._obj);
 //BA.debugLineNum = 5;BA.debugLine="Dim MDB As MSMaterialDrawerBuilder";
mi_meno._mdb = RemoteObject.createNew ("com.maximussoft.msmaterialdrawer.MSMaterialDrawerBuilder");__ref.setField("_mdb",mi_meno._mdb);
 //BA.debugLineNum = 6;BA.debugLine="Dim MD As MSMaterialDrawer";
mi_meno._md = RemoteObject.createNew ("com.maximussoft.msmaterialdrawer.MSMaterialDrawer");__ref.setField("_md",mi_meno._md);
 //BA.debugLineNum = 7;BA.debugLine="Private sql1 As SQL";
mi_meno._sql1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL");__ref.setField("_sql1",mi_meno._sql1);
 //BA.debugLineNum = 8;BA.debugLine="Private cursor1 As Cursor";
mi_meno._cursor1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");__ref.setField("_cursor1",mi_meno._cursor1);
 //BA.debugLineNum = 9;BA.debugLine="Dim telegs As milad_telegramv3";
mi_meno._telegs = RemoteObject.createNew ("com.mili.telegrams.teleg_warp");__ref.setField("_telegs",mi_meno._telegs);
 //BA.debugLineNum = 10;BA.debugLine="Dim username_t ,userid_t As String";
mi_meno._username_t = RemoteObject.createImmutable("");__ref.setField("_username_t",mi_meno._username_t);
mi_meno._userid_t = RemoteObject.createImmutable("");__ref.setField("_userid_t",mi_meno._userid_t);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _eventname,RemoteObject _module) throws Exception{
try {
		Debug.PushSubsStack("Initialize (mi_meno) ","mi_meno",1,__ref.getField(false, "ba"),__ref,15);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "mi_meno","initialize", __ref, _ba, _eventname, _module);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
RemoteObject _i = RemoteObject.createImmutable(0);
Debug.locals.put("ba", _ba);
Debug.locals.put("EventName", _eventname);
Debug.locals.put("Module", _module);
 BA.debugLineNum = 15;BA.debugLine="Public Sub Initialize(EventName As String,Module A";
Debug.ShouldStop(16384);
 BA.debugLineNum = 16;BA.debugLine="Ev = EventName";
Debug.ShouldStop(32768);
__ref.setField ("_ev" /*RemoteObject*/ ,_eventname);
 BA.debugLineNum = 17;BA.debugLine="obj = Module";
Debug.ShouldStop(65536);
__ref.setField ("_obj" /*RemoteObject*/ ,_module);
 BA.debugLineNum = 18;BA.debugLine="If File.Exists(File.DirInternal,\"instadb.db\")=Fal";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",mi_meno.__c.getField(false,"File").runMethod(true,"Exists",(Object)(mi_meno.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("instadb.db"))),mi_meno.__c.getField(true,"False"))) { 
 BA.debugLineNum = 19;BA.debugLine="File.Copy(File.DirAssets,\"instadb.db\",File.DirIn";
Debug.ShouldStop(262144);
mi_meno.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(mi_meno.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("instadb.db")),(Object)(mi_meno.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("instadb.db")));
 };
 BA.debugLineNum = 21;BA.debugLine="If sql1.IsInitialized=False Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),mi_meno.__c.getField(true,"False"))) { 
 BA.debugLineNum = 22;BA.debugLine="sql1.Initialize(File.DirInternal,\"instadb.db\",Fa";
Debug.ShouldStop(2097152);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(mi_meno.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("instadb.db")),(Object)(mi_meno.__c.getField(true,"False")));
 };
 BA.debugLineNum = 34;BA.debugLine="cursor1 = sql1.ExecQuery(\"SELECT * FROM tbl_tele";
Debug.ShouldStop(2);
__ref.getField(false,"_cursor1" /*RemoteObject*/ ).setObject (__ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT * FROM tbl_tele WHERE soich='1'"))));
 BA.debugLineNum = 35;BA.debugLine="Dim i As Int";
Debug.ShouldStop(4);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 36;BA.debugLine="For i=0 To cursor1.RowCount-1";
Debug.ShouldStop(8);
{
final int step11 = 1;
final int limit11 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cursor1" /*RemoteObject*/ ).runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step11 > 0 && _i.<Integer>get().intValue() <= limit11) || (step11 < 0 && _i.<Integer>get().intValue() >= limit11) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step11))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 37;BA.debugLine="cursor1.Position=i";
Debug.ShouldStop(16);
__ref.getField(false,"_cursor1" /*RemoteObject*/ ).runMethod(true,"setPosition",_i);
 BA.debugLineNum = 38;BA.debugLine="userid_t=cursor1.GetString(\"userid\")";
Debug.ShouldStop(32);
__ref.setField ("_userid_t" /*RemoteObject*/ ,__ref.getField(false,"_cursor1" /*RemoteObject*/ ).runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("userid"))));
 BA.debugLineNum = 39;BA.debugLine="username_t=cursor1.GetString(\"username\")";
Debug.ShouldStop(64);
__ref.setField ("_username_t" /*RemoteObject*/ ,__ref.getField(false,"_cursor1" /*RemoteObject*/ ).runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("username"))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 42;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _md_itemclick(RemoteObject __ref,RemoteObject _position,RemoteObject _identifier) throws Exception{
try {
		Debug.PushSubsStack("MD_ItemClick (mi_meno) ","mi_meno",1,__ref.getField(false, "ba"),__ref,92);
if (RapidSub.canDelegate("md_itemclick")) { return __ref.runUserSub(false, "mi_meno","md_itemclick", __ref, _position, _identifier);}
RemoteObject _builder = RemoteObject.declareNull("de.amberhome.materialdialogs.MaterialDialogBuilderWrapper");
RemoteObject _str = RemoteObject.createImmutable("");
Debug.locals.put("Position", _position);
Debug.locals.put("Identifier", _identifier);
 BA.debugLineNum = 92;BA.debugLine="Sub MD_ItemClick(Position As Int, Identifier As In";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 93;BA.debugLine="Log(\"Clicked:\" & Position & \" Iden:\" & Identifier";
Debug.ShouldStop(268435456);
mi_meno.__c.runVoidMethod ("LogImpl","6917505",RemoteObject.concat(RemoteObject.createImmutable("Clicked:"),_position,RemoteObject.createImmutable(" Iden:"),_identifier),0);
 BA.debugLineNum = 95;BA.debugLine="If Position = 0 Then 'darbare";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_position,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 96;BA.debugLine="Dim Builder As MaterialDialogBuilder";
Debug.ShouldStop(-2147483648);
_builder = RemoteObject.createNew ("de.amberhome.materialdialogs.MaterialDialogBuilderWrapper");Debug.locals.put("Builder", _builder);
 BA.debugLineNum = 97;BA.debugLine="Builder.Initialize(\"Dialog\")";
Debug.ShouldStop(1);
_builder.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Dialog")));
 BA.debugLineNum = 98;BA.debugLine="Dim str As String";
Debug.ShouldStop(2);
_str = RemoteObject.createImmutable("");Debug.locals.put("str", _str);
 BA.debugLineNum = 99;BA.debugLine="str=$\" 		خدمات ویژه پیشرو ممبر بگیر 		ممبر واقعی";
Debug.ShouldStop(4);
_str = (RemoteObject.concat(RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("		خدمات ویژه پیشرو ممبر بگیر\n"),RemoteObject.createImmutable("		ممبر واقعی و ایرانی \n"),RemoteObject.createImmutable("		:« در این روش ممبرهای کاملا انلاین و\n"),RemoteObject.createImmutable("		 ایرانی در کانال شما عضو میشوند و\n"),RemoteObject.createImmutable("		 از کیفیت مطلوبی برخوردار هستند و\n"),RemoteObject.createImmutable("		 متناسب ترین قیمت را داراست\n"),RemoteObject.createImmutable("		\n"),RemoteObject.createImmutable("		پشتیبانی بهترین نوع افزایش ممبر کانال میباشد\n"),RemoteObject.createImmutable("		 چرا که کاربران با اختیار خود\n"),RemoteObject.createImmutable("		 در کانال شما عضو خواهند شد\n"),RemoteObject.createImmutable("		")));Debug.locals.put("str", _str);
 BA.debugLineNum = 111;BA.debugLine="Builder.Content(str).Title(\"درباره ما\")";
Debug.ShouldStop(16384);
_builder.runMethod(false,"Content",(Object)(BA.ObjectToCharSequence(_str))).runVoidMethod ("Title",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("درباره ما"))));
 BA.debugLineNum = 113;BA.debugLine="Builder.ItemsCallback";
Debug.ShouldStop(65536);
_builder.runVoidMethod ("ItemsCallback");
 BA.debugLineNum = 114;BA.debugLine="Builder.Show";
Debug.ShouldStop(131072);
_builder.runVoidMethod ("Show");
 };
 BA.debugLineNum = 117;BA.debugLine="If Position = 1 Then 'poshtibani";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_position,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 119;BA.debugLine="Dim Builder As MaterialDialogBuilder";
Debug.ShouldStop(4194304);
_builder = RemoteObject.createNew ("de.amberhome.materialdialogs.MaterialDialogBuilderWrapper");Debug.locals.put("Builder", _builder);
 BA.debugLineNum = 120;BA.debugLine="Builder.Initialize(\"Dialog\")";
Debug.ShouldStop(8388608);
_builder.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Dialog")));
 BA.debugLineNum = 121;BA.debugLine="Dim str As String";
Debug.ShouldStop(16777216);
_str = RemoteObject.createImmutable("");Debug.locals.put("str", _str);
 BA.debugLineNum = 122;BA.debugLine="str=$\" 		جهت ارتباط با ما  		aaaa@gmail.com";
Debug.ShouldStop(33554432);
_str = (RemoteObject.concat(RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("		جهت ارتباط با ما \n"),RemoteObject.createImmutable("		aaaa@gmail.com\n"),RemoteObject.createImmutable("		\n"),RemoteObject.createImmutable("		")));Debug.locals.put("str", _str);
 BA.debugLineNum = 127;BA.debugLine="Builder.Content(str).Title(\"پشتیبانی\")";
Debug.ShouldStop(1073741824);
_builder.runMethod(false,"Content",(Object)(BA.ObjectToCharSequence(_str))).runVoidMethod ("Title",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("پشتیبانی"))));
 BA.debugLineNum = 129;BA.debugLine="Builder.ItemsCallback";
Debug.ShouldStop(1);
_builder.runVoidMethod ("ItemsCallback");
 BA.debugLineNum = 130;BA.debugLine="Builder.Show";
Debug.ShouldStop(2);
_builder.runVoidMethod ("Show");
 };
 BA.debugLineNum = 133;BA.debugLine="If Position = 2 Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",_position,BA.numberCast(double.class, 2))) { 
 BA.debugLineNum = 135;BA.debugLine="ToastMessageShow(\"باموفقیت خارج شدید\",False)";
Debug.ShouldStop(64);
mi_meno.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("باموفقیت خارج شدید")),(Object)(mi_meno.__c.getField(true,"False")));
 BA.debugLineNum = 136;BA.debugLine="telegs.logOut()";
Debug.ShouldStop(128);
__ref.getField(false,"_telegs" /*RemoteObject*/ ).runVoidMethod ("logOut");
 BA.debugLineNum = 137;BA.debugLine="sql1.ExecNonQuery(\"Delete FROM tbl_tele WHERE us";
Debug.ShouldStop(256);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Delete FROM tbl_tele WHERE username='"),__ref.getField(true,"_username_t" /*RemoteObject*/ ),RemoteObject.createImmutable("'"))));
 BA.debugLineNum = 138;BA.debugLine="StartActivity(ac_home)";
Debug.ShouldStop(512);
mi_meno.__c.runVoidMethod ("StartActivity",__ref.getField(false, "ba"),(Object)((mi_meno._ac_home.getObject())));
 };
 BA.debugLineNum = 140;BA.debugLine="If Position = 3 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",_position,BA.numberCast(double.class, 3))) { 
 BA.debugLineNum = 142;BA.debugLine="Try";
Debug.ShouldStop(8192);
try { BA.debugLineNum = 146;BA.debugLine="ExitApplication";
Debug.ShouldStop(131072);
mi_meno.__c.runVoidMethod ("ExitApplication");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e30) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e30.toString()); BA.debugLineNum = 148;BA.debugLine="Log(LastException)";
Debug.ShouldStop(524288);
mi_meno.__c.runVoidMethod ("LogImpl","6917560",BA.ObjectToString(mi_meno.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 };
 BA.debugLineNum = 153;BA.debugLine="If Position = 4 Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_position,BA.numberCast(double.class, 4))) { 
 };
 BA.debugLineNum = 158;BA.debugLine="If Position = 5 Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_position,BA.numberCast(double.class, 5))) { 
 };
 BA.debugLineNum = 163;BA.debugLine="If Position = 6 Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_position,BA.numberCast(double.class, 6))) { 
 };
 BA.debugLineNum = 169;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _open(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("open (mi_meno) ","mi_meno",1,__ref.getField(false, "ba"),__ref,171);
if (RapidSub.canDelegate("open")) { return __ref.runUserSub(false, "mi_meno","open", __ref);}
 BA.debugLineNum = 171;BA.debugLine="Sub open";
Debug.ShouldStop(1024);
 BA.debugLineNum = 172;BA.debugLine="MD.OpenDrawer";
Debug.ShouldStop(2048);
__ref.getField(false,"_md" /*RemoteObject*/ ).runVoidMethod ("OpenDrawer");
 BA.debugLineNum = 174;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}