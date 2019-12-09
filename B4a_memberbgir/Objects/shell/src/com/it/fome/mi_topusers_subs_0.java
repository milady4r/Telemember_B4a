package com.it.fome;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class mi_topusers_subs_0 {


public static RemoteObject  _addpnl(RemoteObject __ref,RemoteObject _pnl) throws Exception{
try {
		Debug.PushSubsStack("addpnl (mi_topusers) ","mi_topusers",11,__ref.getField(false, "ba"),__ref,70);
if (RapidSub.canDelegate("addpnl")) { return __ref.runUserSub(false, "mi_topusers","addpnl", __ref, _pnl);}
Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 70;BA.debugLine="Sub addpnl(pnl As Panel) As View";
Debug.ShouldStop(32);
 BA.debugLineNum = 90;BA.debugLine="LV.Initializer(\"LV\").ListView.RefreshLayout.Build";
Debug.ShouldStop(33554432);
__ref.getField(false,"_lv" /*RemoteObject*/ ).runMethod(false,"Initializer",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("LV"))).runMethod(false,"ListView").runMethod(false,"RefreshLayout").runVoidMethod ("Build");
 BA.debugLineNum = 91;BA.debugLine="pnl.AddView(LV,0,0,pnl.Width,pnl.Height)";
Debug.ShouldStop(67108864);
_pnl.runVoidMethod ("AddView",(Object)((__ref.getField(false,"_lv" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_pnl.runMethod(true,"getWidth")),(Object)(_pnl.runMethod(true,"getHeight")));
 BA.debugLineNum = 92;BA.debugLine="LV.CardView.CardElevation(4dip).Radius(2dip)";
Debug.ShouldStop(134217728);
__ref.getField(false,"_lv" /*RemoteObject*/ ).runMethod(false,"CardView").runMethod(false,"CardElevation",(Object)(BA.numberCast(float.class, mi_topusers.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4)))))).runVoidMethod ("Radius",(Object)(BA.numberCast(float.class, mi_topusers.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2))))));
 BA.debugLineNum = 93;BA.debugLine="LV.Show";
Debug.ShouldStop(268435456);
__ref.getField(false,"_lv" /*RemoteObject*/ ).runVoidMethodAndSync ("Show");
 BA.debugLineNum = 94;BA.debugLine="RL.Initialize(LV, \"RL\")";
Debug.ShouldStop(536870912);
__ref.getField(false,"_rl" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_lv" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("RL")));
 BA.debugLineNum = 95;BA.debugLine="RL.Direction = RL.DIRECTION_TOP";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_rl" /*RemoteObject*/ ).runMethod(true,"setDirection",__ref.getField(false,"_rl" /*RemoteObject*/ ).getField(true,"DIRECTION_TOP"));
 BA.debugLineNum = 96;BA.debugLine="RL.SchemeColors = Array As Int (Colors.Red, Color";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_rl" /*RemoteObject*/ ).runVoidMethod ("setSchemeColors",RemoteObject.createNewArray("int",new int[] {3},new Object[] {mi_topusers.__c.getField(false,"Colors").getField(true,"Red"),mi_topusers.__c.getField(false,"Colors").getField(true,"Black"),mi_topusers.__c.getField(false,"Colors").getField(true,"Blue")}));
 BA.debugLineNum = 98;BA.debugLine="Select type_history";
Debug.ShouldStop(2);
switch (BA.switchObjectToInt(__ref.getField(true,"_type_history" /*RemoteObject*/ ),BA.numberCast(int.class, 0),BA.numberCast(int.class, 1))) {
case 0: {
 BA.debugLineNum = 100;BA.debugLine="req_getme(i_pk)";
Debug.ShouldStop(8);
__ref.runClassMethod (com.it.fome.mi_topusers.class, "_req_getme" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_i_pk" /*RemoteObject*/ )));
 break; }
case 1: {
 BA.debugLineNum = 103;BA.debugLine="Log(\"get telegram\")";
Debug.ShouldStop(64);
mi_topusers.__c.runVoidMethod ("LogImpl","613762593",RemoteObject.createImmutable("get telegram"),0);
 BA.debugLineNum = 104;BA.debugLine="req_telegetme(userid_t)";
Debug.ShouldStop(128);
__ref.runClassMethod (com.it.fome.mi_topusers.class, "_req_telegetme" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_userid_t" /*RemoteObject*/ )));
 break; }
}
;
 BA.debugLineNum = 110;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable(null);
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
mi_topusers._ev = RemoteObject.createImmutable("");__ref.setField("_ev",mi_topusers._ev);
 //BA.debugLineNum = 3;BA.debugLine="Private obj As Object";
mi_topusers._obj = RemoteObject.createNew ("Object");__ref.setField("_obj",mi_topusers._obj);
 //BA.debugLineNum = 4;BA.debugLine="Private sql1 As SQL";
mi_topusers._sql1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL");__ref.setField("_sql1",mi_topusers._sql1);
 //BA.debugLineNum = 5;BA.debugLine="Private cursor1 As Cursor";
mi_topusers._cursor1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");__ref.setField("_cursor1",mi_topusers._cursor1);
 //BA.debugLineNum = 6;BA.debugLine="Private pnl_insta As Panel";
mi_topusers._pnl_insta = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnl_insta",mi_topusers._pnl_insta);
 //BA.debugLineNum = 7;BA.debugLine="Private i_username ,i_pk,i_cookie,i_pic As String";
mi_topusers._i_username = RemoteObject.createImmutable("");__ref.setField("_i_username",mi_topusers._i_username);
mi_topusers._i_pk = RemoteObject.createImmutable("");__ref.setField("_i_pk",mi_topusers._i_pk);
mi_topusers._i_cookie = RemoteObject.createImmutable("");__ref.setField("_i_cookie",mi_topusers._i_cookie);
mi_topusers._i_pic = RemoteObject.createImmutable("");__ref.setField("_i_pic",mi_topusers._i_pic);
 //BA.debugLineNum = 8;BA.debugLine="Private l_users(40) As List";
mi_topusers._l_users = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.collections.List", new int[] {40}, new Object[]{});__ref.setField("_l_users",mi_topusers._l_users);
 //BA.debugLineNum = 10;BA.debugLine="Private LV As Hitex_LayoutView";
mi_topusers._lv = RemoteObject.createNew ("wir.hitex.recycler.Hitex_LayoutView");__ref.setField("_lv",mi_topusers._lv);
 //BA.debugLineNum = 11;BA.debugLine="Private RL As Hitex_RefreshLayout";
mi_topusers._rl = RemoteObject.createNew ("wir.hitex.recycler.Hitex_RefreshLayout");__ref.setField("_rl",mi_topusers._rl);
 //BA.debugLineNum = 12;BA.debugLine="Private Glide As Hitex_Glide";
mi_topusers._glide = RemoteObject.createNew ("com.hitex_glide.Hitex_Glide");__ref.setField("_glide",mi_topusers._glide);
 //BA.debugLineNum = 13;BA.debugLine="Private prfn As PersianFastNetwork";
mi_topusers._prfn = RemoteObject.createNew ("com.reza.sh.fastnet.Fastnet");__ref.setField("_prfn",mi_topusers._prfn);
 //BA.debugLineNum = 16;BA.debugLine="Type Data(ip As String,pic As Bitmap)";
;
 //BA.debugLineNum = 18;BA.debugLine="Private username_t ,userid_t As String";
mi_topusers._username_t = RemoteObject.createImmutable("");__ref.setField("_username_t",mi_topusers._username_t);
mi_topusers._userid_t = RemoteObject.createImmutable("");__ref.setField("_userid_t",mi_topusers._userid_t);
 //BA.debugLineNum = 19;BA.debugLine="Dim type_history As Int";
mi_topusers._type_history = RemoteObject.createImmutable(0);__ref.setField("_type_history",mi_topusers._type_history);
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _eventname,RemoteObject _module) throws Exception{
try {
		Debug.PushSubsStack("Initialize (mi_topusers) ","mi_topusers",11,__ref.getField(false, "ba"),__ref,23);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "mi_topusers","initialize", __ref, _ba, _eventname, _module);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
int _ia = 0;
RemoteObject _i = RemoteObject.createImmutable(0);
Debug.locals.put("ba", _ba);
Debug.locals.put("EventName", _eventname);
Debug.locals.put("Module", _module);
 BA.debugLineNum = 23;BA.debugLine="Public Sub Initialize(EventName As String,Module A";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 24;BA.debugLine="Ev = EventName";
Debug.ShouldStop(8388608);
__ref.setField ("_ev" /*RemoteObject*/ ,_eventname);
 BA.debugLineNum = 25;BA.debugLine="obj = Module";
Debug.ShouldStop(16777216);
__ref.setField ("_obj" /*RemoteObject*/ ,_module);
 BA.debugLineNum = 28;BA.debugLine="For ia=0 To 38";
Debug.ShouldStop(134217728);
{
final int step3 = 1;
final int limit3 = 38;
_ia = 0 ;
for (;(step3 > 0 && _ia <= limit3) || (step3 < 0 && _ia >= limit3) ;_ia = ((int)(0 + _ia + step3))  ) {
Debug.locals.put("ia", _ia);
 BA.debugLineNum = 30;BA.debugLine="l_users(ia).Initialize";
Debug.ShouldStop(536870912);
__ref.getField(false,"_l_users" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, _ia)).runVoidMethod ("Initialize");
 }
}Debug.locals.put("ia", _ia);
;
 BA.debugLineNum = 36;BA.debugLine="If File.Exists(File.DirInternal,\"instadb.db\")=Fal";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",mi_topusers.__c.getField(false,"File").runMethod(true,"Exists",(Object)(mi_topusers.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("instadb.db"))),mi_topusers.__c.getField(true,"False"))) { 
 BA.debugLineNum = 37;BA.debugLine="File.Copy(File.DirAssets,\"instadb.db\",File.DirIn";
Debug.ShouldStop(16);
mi_topusers.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(mi_topusers.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("instadb.db")),(Object)(mi_topusers.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("instadb.db")));
 };
 BA.debugLineNum = 39;BA.debugLine="If sql1.IsInitialized=False Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),mi_topusers.__c.getField(true,"False"))) { 
 BA.debugLineNum = 40;BA.debugLine="sql1.Initialize(File.DirInternal,\"instadb.db\",Fa";
Debug.ShouldStop(128);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(mi_topusers.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("instadb.db")),(Object)(mi_topusers.__c.getField(true,"False")));
 };
 BA.debugLineNum = 44;BA.debugLine="cursor1 = sql1.ExecQuery(\"SELECT * FROM tbl_acc W";
Debug.ShouldStop(2048);
__ref.getField(false,"_cursor1" /*RemoteObject*/ ).setObject (__ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT * FROM tbl_acc WHERE soich='1' "))));
 BA.debugLineNum = 45;BA.debugLine="Dim i As Int";
Debug.ShouldStop(4096);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 46;BA.debugLine="For i=0 To cursor1.RowCount-1";
Debug.ShouldStop(8192);
{
final int step14 = 1;
final int limit14 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cursor1" /*RemoteObject*/ ).runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step14 > 0 && _i.<Integer>get().intValue() <= limit14) || (step14 < 0 && _i.<Integer>get().intValue() >= limit14) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step14))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 47;BA.debugLine="cursor1.Position=i";
Debug.ShouldStop(16384);
__ref.getField(false,"_cursor1" /*RemoteObject*/ ).runMethod(true,"setPosition",_i);
 BA.debugLineNum = 48;BA.debugLine="i_cookie=cursor1.GetString(\"cookie\")";
Debug.ShouldStop(32768);
__ref.setField ("_i_cookie" /*RemoteObject*/ ,__ref.getField(false,"_cursor1" /*RemoteObject*/ ).runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("cookie"))));
 BA.debugLineNum = 49;BA.debugLine="i_username=cursor1.GetString(\"username\")";
Debug.ShouldStop(65536);
__ref.setField ("_i_username" /*RemoteObject*/ ,__ref.getField(false,"_cursor1" /*RemoteObject*/ ).runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("username"))));
 BA.debugLineNum = 50;BA.debugLine="i_pk=cursor1.GetString(\"pk\")";
Debug.ShouldStop(131072);
__ref.setField ("_i_pk" /*RemoteObject*/ ,__ref.getField(false,"_cursor1" /*RemoteObject*/ ).runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("pk"))));
 BA.debugLineNum = 51;BA.debugLine="i_pic=cursor1.GetString(\"profile_pic_url\")";
Debug.ShouldStop(262144);
__ref.setField ("_i_pic" /*RemoteObject*/ ,__ref.getField(false,"_cursor1" /*RemoteObject*/ ).runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("profile_pic_url"))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 53;BA.debugLine="cursor1.Close";
Debug.ShouldStop(1048576);
__ref.getField(false,"_cursor1" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 55;BA.debugLine="cursor1 = sql1.ExecQuery(\"SELECT * FROM tbl_tele";
Debug.ShouldStop(4194304);
__ref.getField(false,"_cursor1" /*RemoteObject*/ ).setObject (__ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT * FROM tbl_tele WHERE soich='1'"))));
 BA.debugLineNum = 56;BA.debugLine="Dim i As Int";
Debug.ShouldStop(8388608);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 57;BA.debugLine="For i=0 To cursor1.RowCount-1";
Debug.ShouldStop(16777216);
{
final int step24 = 1;
final int limit24 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cursor1" /*RemoteObject*/ ).runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step24 > 0 && _i.<Integer>get().intValue() <= limit24) || (step24 < 0 && _i.<Integer>get().intValue() >= limit24) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step24))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 58;BA.debugLine="cursor1.Position=i";
Debug.ShouldStop(33554432);
__ref.getField(false,"_cursor1" /*RemoteObject*/ ).runMethod(true,"setPosition",_i);
 BA.debugLineNum = 59;BA.debugLine="userid_t=cursor1.GetString(\"userid\")";
Debug.ShouldStop(67108864);
__ref.setField ("_userid_t" /*RemoteObject*/ ,__ref.getField(false,"_cursor1" /*RemoteObject*/ ).runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("userid"))));
 BA.debugLineNum = 60;BA.debugLine="username_t=cursor1.GetString(\"username\")";
Debug.ShouldStop(134217728);
__ref.setField ("_username_t" /*RemoteObject*/ ,__ref.getField(false,"_cursor1" /*RemoteObject*/ ).runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("username"))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 62;BA.debugLine="cursor1.Close";
Debug.ShouldStop(536870912);
__ref.getField(false,"_cursor1" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 67;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lv_getitemcount(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("LV_GetItemCount (mi_topusers) ","mi_topusers",11,__ref.getField(false, "ba"),__ref,268);
if (RapidSub.canDelegate("lv_getitemcount")) { return __ref.runUserSub(false, "mi_topusers","lv_getitemcount", __ref);}
 BA.debugLineNum = 268;BA.debugLine="Sub LV_GetItemCount As Int 								        '$ Item";
Debug.ShouldStop(2048);
 BA.debugLineNum = 269;BA.debugLine="Return l_users(1).Size 'ItemList.Size";
Debug.ShouldStop(4096);
if (true) return __ref.getField(false,"_l_users" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, 1)).runMethod(true,"getSize");
 BA.debugLineNum = 270;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lv_onbindviewholder(RemoteObject __ref,RemoteObject _parent,RemoteObject _position) throws Exception{
try {
		Debug.PushSubsStack("LV_onBindViewHolder (mi_topusers) ","mi_topusers",11,__ref.getField(false, "ba"),__ref,141);
if (RapidSub.canDelegate("lv_onbindviewholder")) { return __ref.runUserSub(false, "mi_topusers","lv_onbindviewholder", __ref, _parent, _position);}
RemoteObject _imguser = RemoteObject.declareNull("com.hitex_glide.Hitex_ImageView");
RemoteObject _lbltype = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _lbl_username = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _lbl_ok = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _pnlpos = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _imgpost = RemoteObject.declareNull("com.hitex_glide.Hitex_ImageView");
Debug.locals.put("Parent", _parent);
Debug.locals.put("Position", _position);
 BA.debugLineNum = 141;BA.debugLine="Sub LV_onBindViewHolder (Parent As Panel, Position";
Debug.ShouldStop(4096);
 BA.debugLineNum = 142;BA.debugLine="Dim imguser = Parent.GetView(0) As Hitex_ImageVie";
Debug.ShouldStop(8192);
_imguser = RemoteObject.createNew ("com.hitex_glide.Hitex_ImageView");
_imguser.setObject(_parent.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).getObject());Debug.locals.put("imguser", _imguser);
 BA.debugLineNum = 144;BA.debugLine="Dim lbltype = Parent.GetView(1) As Label";
Debug.ShouldStop(32768);
_lbltype = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_lbltype.setObject(_parent.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1))).getObject());Debug.locals.put("lbltype", _lbltype);
 BA.debugLineNum = 145;BA.debugLine="Dim lbl_username = Parent.GetView(2) As Label";
Debug.ShouldStop(65536);
_lbl_username = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_lbl_username.setObject(_parent.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 2))).getObject());Debug.locals.put("lbl_username", _lbl_username);
 BA.debugLineNum = 146;BA.debugLine="Dim lbl_ok = Parent.GetView(3) As Label";
Debug.ShouldStop(131072);
_lbl_ok = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_lbl_ok.setObject(_parent.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 3))).getObject());Debug.locals.put("lbl_ok", _lbl_ok);
 BA.debugLineNum = 147;BA.debugLine="Dim pnlpos = Parent.GetView(4) As Panel";
Debug.ShouldStop(262144);
_pnlpos = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_pnlpos.setObject(_parent.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 4))).getObject());Debug.locals.put("pnlpos", _pnlpos);
 BA.debugLineNum = 148;BA.debugLine="Dim imgpost = pnlpos.GetView(0) As Hitex_ImageVie";
Debug.ShouldStop(524288);
_imgpost = RemoteObject.createNew ("com.hitex_glide.Hitex_ImageView");
_imgpost.setObject(_pnlpos.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).getObject());Debug.locals.put("imgpost", _imgpost);
 BA.debugLineNum = 150;BA.debugLine="Select l_users(1).Get(Position)";
Debug.ShouldStop(2097152);
switch (BA.switchObjectToInt(__ref.getField(false,"_l_users" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, 1)).runMethod(false,"Get",(Object)(_position)),RemoteObject.createImmutable(("1")),RemoteObject.createImmutable(("2")),RemoteObject.createImmutable(("4")),RemoteObject.createImmutable(("3")))) {
case 0: {
 BA.debugLineNum = 153;BA.debugLine="Select type_history";
Debug.ShouldStop(16777216);
switch (BA.switchObjectToInt(__ref.getField(true,"_type_history" /*RemoteObject*/ ),BA.numberCast(int.class, 0),BA.numberCast(int.class, 1))) {
case 0: {
 BA.debugLineNum = 156;BA.debugLine="Glide.Load(File.DirAssets,\"c_like.png\").Optio";
Debug.ShouldStop(134217728);
__ref.getField(false,"_glide" /*RemoteObject*/ ).runMethod(false,"Load",__ref.getField(false, "ba"),(Object)(mi_topusers.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("c_like.png"))).runMethod(false,"OptionalCircleCrop").runVoidMethod ("Into",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ImageViewWrapper"), _imguser.getObject()));
 BA.debugLineNum = 157;BA.debugLine="lbltype.Text = \"سفارش لایک\"";
Debug.ShouldStop(268435456);
_lbltype.runMethod(true,"setText",BA.ObjectToCharSequence("سفارش لایک"));
 BA.debugLineNum = 158;BA.debugLine="lbl_username.Text=l_users(2).Get(Position)&\"";
Debug.ShouldStop(536870912);
_lbl_username.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(__ref.getField(false,"_l_users" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, 2)).runMethod(false,"Get",(Object)(_position)),RemoteObject.createImmutable(" انجام شده از "),__ref.getField(false,"_l_users" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, 3)).runMethod(false,"Get",(Object)(_position)),RemoteObject.createImmutable("سفارش"))));
 BA.debugLineNum = 159;BA.debugLine="If l_users(7).Get(Position)=\"0\" Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_l_users" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, 7)).runMethod(false,"Get",(Object)(_position)),RemoteObject.createImmutable(("0")))) { 
 BA.debugLineNum = 160;BA.debugLine="lbl_ok.Text=\"وضعیت : در حال انجام \"";
Debug.ShouldStop(-2147483648);
_lbl_ok.runMethod(true,"setText",BA.ObjectToCharSequence("وضعیت : در حال انجام "));
 }else {
 BA.debugLineNum = 163;BA.debugLine="lbl_ok.Text=\"وضعیت : انجام شده\"";
Debug.ShouldStop(4);
_lbl_ok.runMethod(true,"setText",BA.ObjectToCharSequence("وضعیت : انجام شده"));
 };
 BA.debugLineNum = 168;BA.debugLine="Glide.Load2(l_users(9).Get(Position)).Optiona";
Debug.ShouldStop(128);
__ref.getField(false,"_glide" /*RemoteObject*/ ).runMethod(false,"Load2",__ref.getField(false, "ba"),(Object)(BA.ObjectToString(__ref.getField(false,"_l_users" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, 9)).runMethod(false,"Get",(Object)(_position))))).runMethod(false,"OptionalCircleCrop").runVoidMethod ("Into",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ImageViewWrapper"), _imgpost.getObject()));
 break; }
case 1: {
 BA.debugLineNum = 170;BA.debugLine="Glide.Load(File.DirAssets,\"c_follow.png\").Opt";
Debug.ShouldStop(512);
__ref.getField(false,"_glide" /*RemoteObject*/ ).runMethod(false,"Load",__ref.getField(false, "ba"),(Object)(mi_topusers.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("c_follow.png"))).runMethod(false,"OptionalCircleCrop").runVoidMethod ("Into",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ImageViewWrapper"), _imguser.getObject()));
 BA.debugLineNum = 171;BA.debugLine="lbltype.Text = \"سفارش ممبر\"";
Debug.ShouldStop(1024);
_lbltype.runMethod(true,"setText",BA.ObjectToCharSequence("سفارش ممبر"));
 BA.debugLineNum = 172;BA.debugLine="lbl_username.Text=l_users(2).Get(Position)&\"";
Debug.ShouldStop(2048);
_lbl_username.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(__ref.getField(false,"_l_users" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, 2)).runMethod(false,"Get",(Object)(_position)),RemoteObject.createImmutable(" انجام شده از "),__ref.getField(false,"_l_users" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, 3)).runMethod(false,"Get",(Object)(_position)),RemoteObject.createImmutable("سفارش"))));
 BA.debugLineNum = 173;BA.debugLine="If l_users(7).Get(Position)=\"0\" Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_l_users" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, 7)).runMethod(false,"Get",(Object)(_position)),RemoteObject.createImmutable(("0")))) { 
 BA.debugLineNum = 174;BA.debugLine="lbl_ok.Text=\"وضعیت : در حال انجام \"";
Debug.ShouldStop(8192);
_lbl_ok.runMethod(true,"setText",BA.ObjectToCharSequence("وضعیت : در حال انجام "));
 }else {
 BA.debugLineNum = 177;BA.debugLine="lbl_ok.Text=\"وضعیت : انجام شده\"";
Debug.ShouldStop(65536);
_lbl_ok.runMethod(true,"setText",BA.ObjectToCharSequence("وضعیت : انجام شده"));
 };
 BA.debugLineNum = 182;BA.debugLine="Glide.Load2(l_users(9).Get(Position)).Optiona";
Debug.ShouldStop(2097152);
__ref.getField(false,"_glide" /*RemoteObject*/ ).runMethod(false,"Load2",__ref.getField(false, "ba"),(Object)(BA.ObjectToString(__ref.getField(false,"_l_users" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, 9)).runMethod(false,"Get",(Object)(_position))))).runMethod(false,"OptionalCircleCrop").runVoidMethod ("Into",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ImageViewWrapper"), _imgpost.getObject()));
 break; }
}
;
 BA.debugLineNum = 186;BA.debugLine="Parent.Height=200dip";
Debug.ShouldStop(33554432);
_parent.runMethod(true,"setHeight",mi_topusers.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 200))));
 break; }
case 1: {
 BA.debugLineNum = 190;BA.debugLine="Select type_history";
Debug.ShouldStop(536870912);
switch (BA.switchObjectToInt(__ref.getField(true,"_type_history" /*RemoteObject*/ ),BA.numberCast(int.class, 0),BA.numberCast(int.class, 1))) {
case 0: {
 BA.debugLineNum = 193;BA.debugLine="Glide.Load(File.DirAssets,\"c_com.png\").Option";
Debug.ShouldStop(1);
__ref.getField(false,"_glide" /*RemoteObject*/ ).runMethod(false,"Load",__ref.getField(false, "ba"),(Object)(mi_topusers.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("c_com.png"))).runMethod(false,"OptionalCircleCrop").runVoidMethod ("Into",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ImageViewWrapper"), _imguser.getObject()));
 BA.debugLineNum = 194;BA.debugLine="lbltype.Text = \"سفارش کامنت\"";
Debug.ShouldStop(2);
_lbltype.runMethod(true,"setText",BA.ObjectToCharSequence("سفارش کامنت"));
 BA.debugLineNum = 195;BA.debugLine="lbl_username.Text=l_users(2).Get(Position)&\"";
Debug.ShouldStop(4);
_lbl_username.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(__ref.getField(false,"_l_users" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, 2)).runMethod(false,"Get",(Object)(_position)),RemoteObject.createImmutable(" انجام شده از "),__ref.getField(false,"_l_users" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, 3)).runMethod(false,"Get",(Object)(_position)),RemoteObject.createImmutable("سفارش"))));
 BA.debugLineNum = 196;BA.debugLine="If l_users(7).Get(Position)=\"0\" Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_l_users" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, 7)).runMethod(false,"Get",(Object)(_position)),RemoteObject.createImmutable(("0")))) { 
 BA.debugLineNum = 197;BA.debugLine="lbl_ok.Text=\"وضعیت : در حال انجام \"";
Debug.ShouldStop(16);
_lbl_ok.runMethod(true,"setText",BA.ObjectToCharSequence("وضعیت : در حال انجام "));
 }else {
 BA.debugLineNum = 200;BA.debugLine="lbl_ok.Text=\"وضعیت : انجام شده\"";
Debug.ShouldStop(128);
_lbl_ok.runMethod(true,"setText",BA.ObjectToCharSequence("وضعیت : انجام شده"));
 };
 BA.debugLineNum = 203;BA.debugLine="Glide.Load2(l_users(9).Get(Position)).Optiona";
Debug.ShouldStop(1024);
__ref.getField(false,"_glide" /*RemoteObject*/ ).runMethod(false,"Load2",__ref.getField(false, "ba"),(Object)(BA.ObjectToString(__ref.getField(false,"_l_users" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, 9)).runMethod(false,"Get",(Object)(_position))))).runMethod(false,"OptionalCircleCrop").runVoidMethod ("Into",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ImageViewWrapper"), _imgpost.getObject()));
 break; }
case 1: {
 BA.debugLineNum = 205;BA.debugLine="Glide.Load(File.DirAssets,\"view_icon.png\").Op";
Debug.ShouldStop(4096);
__ref.getField(false,"_glide" /*RemoteObject*/ ).runMethod(false,"Load",__ref.getField(false, "ba"),(Object)(mi_topusers.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("view_icon.png"))).runMethod(false,"OptionalCircleCrop").runVoidMethod ("Into",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ImageViewWrapper"), _imguser.getObject()));
 BA.debugLineNum = 206;BA.debugLine="lbltype.Text = \"سفارش بازدید\"";
Debug.ShouldStop(8192);
_lbltype.runMethod(true,"setText",BA.ObjectToCharSequence("سفارش بازدید"));
 BA.debugLineNum = 207;BA.debugLine="lbl_username.Text=l_users(2).Get(Position)&\"";
Debug.ShouldStop(16384);
_lbl_username.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(__ref.getField(false,"_l_users" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, 2)).runMethod(false,"Get",(Object)(_position)),RemoteObject.createImmutable(" انجام شده از "),__ref.getField(false,"_l_users" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, 3)).runMethod(false,"Get",(Object)(_position)),RemoteObject.createImmutable("سفارش"))));
 BA.debugLineNum = 208;BA.debugLine="If l_users(7).Get(Position)=\"0\" Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_l_users" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, 7)).runMethod(false,"Get",(Object)(_position)),RemoteObject.createImmutable(("0")))) { 
 BA.debugLineNum = 209;BA.debugLine="lbl_ok.Text=\"وضعیت : در حال انجام \"";
Debug.ShouldStop(65536);
_lbl_ok.runMethod(true,"setText",BA.ObjectToCharSequence("وضعیت : در حال انجام "));
 }else {
 BA.debugLineNum = 212;BA.debugLine="lbl_ok.Text=\"وضعیت : انجام شده\"";
Debug.ShouldStop(524288);
_lbl_ok.runMethod(true,"setText",BA.ObjectToCharSequence("وضعیت : انجام شده"));
 };
 BA.debugLineNum = 215;BA.debugLine="Glide.Load2(l_users(9).Get(Position)).Optiona";
Debug.ShouldStop(4194304);
__ref.getField(false,"_glide" /*RemoteObject*/ ).runMethod(false,"Load2",__ref.getField(false, "ba"),(Object)(BA.ObjectToString(__ref.getField(false,"_l_users" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, 9)).runMethod(false,"Get",(Object)(_position))))).runMethod(false,"OptionalCircleCrop").runVoidMethod ("Into",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ImageViewWrapper"), _imgpost.getObject()));
 break; }
}
;
 BA.debugLineNum = 218;BA.debugLine="Parent.Height=200dip";
Debug.ShouldStop(33554432);
_parent.runMethod(true,"setHeight",mi_topusers.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 200))));
 break; }
case 2: {
 BA.debugLineNum = 223;BA.debugLine="Glide.Load(File.DirAssets,\"view_icon.png\").Opti";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_glide" /*RemoteObject*/ ).runMethod(false,"Load",__ref.getField(false, "ba"),(Object)(mi_topusers.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("view_icon.png"))).runMethod(false,"OptionalCircleCrop").runVoidMethod ("Into",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ImageViewWrapper"), _imguser.getObject()));
 BA.debugLineNum = 224;BA.debugLine="lbltype.Text = \"سفارش ویو\"";
Debug.ShouldStop(-2147483648);
_lbltype.runMethod(true,"setText",BA.ObjectToCharSequence("سفارش ویو"));
 BA.debugLineNum = 225;BA.debugLine="lbl_username.Text=l_users(2).Get(Position)&\" ان";
Debug.ShouldStop(1);
_lbl_username.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(__ref.getField(false,"_l_users" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, 2)).runMethod(false,"Get",(Object)(_position)),RemoteObject.createImmutable(" انجام شده از "),__ref.getField(false,"_l_users" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, 3)).runMethod(false,"Get",(Object)(_position)),RemoteObject.createImmutable("سفارش"))));
 BA.debugLineNum = 226;BA.debugLine="If l_users(7).Get(Position)=\"0\" Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_l_users" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, 7)).runMethod(false,"Get",(Object)(_position)),RemoteObject.createImmutable(("0")))) { 
 BA.debugLineNum = 227;BA.debugLine="lbl_ok.Text=\"وضعیت : در حال انجام \"";
Debug.ShouldStop(4);
_lbl_ok.runMethod(true,"setText",BA.ObjectToCharSequence("وضعیت : در حال انجام "));
 }else {
 BA.debugLineNum = 230;BA.debugLine="lbl_ok.Text=\"وضعیت : انجام شده\"";
Debug.ShouldStop(32);
_lbl_ok.runMethod(true,"setText",BA.ObjectToCharSequence("وضعیت : انجام شده"));
 };
 BA.debugLineNum = 235;BA.debugLine="Glide.Load2(l_users(9).Get(Position)).OptionalC";
Debug.ShouldStop(1024);
__ref.getField(false,"_glide" /*RemoteObject*/ ).runMethod(false,"Load2",__ref.getField(false, "ba"),(Object)(BA.ObjectToString(__ref.getField(false,"_l_users" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, 9)).runMethod(false,"Get",(Object)(_position))))).runMethod(false,"OptionalCircleCrop").runVoidMethod ("Into",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ImageViewWrapper"), _imgpost.getObject()));
 BA.debugLineNum = 238;BA.debugLine="Parent.Height=200dip";
Debug.ShouldStop(8192);
_parent.runMethod(true,"setHeight",mi_topusers.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 200))));
 break; }
case 3: {
 BA.debugLineNum = 242;BA.debugLine="Glide.Load(File.DirAssets,\"c_follow.png\").Optio";
Debug.ShouldStop(131072);
__ref.getField(false,"_glide" /*RemoteObject*/ ).runMethod(false,"Load",__ref.getField(false, "ba"),(Object)(mi_topusers.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("c_follow.png"))).runMethod(false,"OptionalCircleCrop").runVoidMethod ("Into",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ImageViewWrapper"), _imguser.getObject()));
 BA.debugLineNum = 243;BA.debugLine="lbltype.Text = \"سفارش فالوور\"";
Debug.ShouldStop(262144);
_lbltype.runMethod(true,"setText",BA.ObjectToCharSequence("سفارش فالوور"));
 BA.debugLineNum = 244;BA.debugLine="lbl_username.Text=l_users(2).Get(Position)&\" ان";
Debug.ShouldStop(524288);
_lbl_username.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(__ref.getField(false,"_l_users" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, 2)).runMethod(false,"Get",(Object)(_position)),RemoteObject.createImmutable(" انجام شده از "),__ref.getField(false,"_l_users" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, 3)).runMethod(false,"Get",(Object)(_position)),RemoteObject.createImmutable("سفارش"))));
 BA.debugLineNum = 245;BA.debugLine="If l_users(7).Get(Position)=\"0\" Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_l_users" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, 7)).runMethod(false,"Get",(Object)(_position)),RemoteObject.createImmutable(("0")))) { 
 BA.debugLineNum = 246;BA.debugLine="lbl_ok.Text=\"وضعیت : در حال انجام \"";
Debug.ShouldStop(2097152);
_lbl_ok.runMethod(true,"setText",BA.ObjectToCharSequence("وضعیت : در حال انجام "));
 }else {
 BA.debugLineNum = 249;BA.debugLine="lbl_ok.Text=\"وضعیت : انجام شده\"";
Debug.ShouldStop(16777216);
_lbl_ok.runMethod(true,"setText",BA.ObjectToCharSequence("وضعیت : انجام شده"));
 };
 BA.debugLineNum = 252;BA.debugLine="Glide.Load2(l_users(9).Get(Position)).OptionalC";
Debug.ShouldStop(134217728);
__ref.getField(false,"_glide" /*RemoteObject*/ ).runMethod(false,"Load2",__ref.getField(false, "ba"),(Object)(BA.ObjectToString(__ref.getField(false,"_l_users" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, 9)).runMethod(false,"Get",(Object)(_position))))).runMethod(false,"OptionalCircleCrop").runVoidMethod ("Into",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ImageViewWrapper"), _imgpost.getObject()));
 BA.debugLineNum = 254;BA.debugLine="Parent.Height=200dip";
Debug.ShouldStop(536870912);
_parent.runMethod(true,"setHeight",mi_topusers.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 200))));
 break; }
}
;
 BA.debugLineNum = 266;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lv_oncreateviewholder(RemoteObject __ref,RemoteObject _parent,RemoteObject _viewtype) throws Exception{
try {
		Debug.PushSubsStack("LV_onCreateViewHolder (mi_topusers) ","mi_topusers",11,__ref.getField(false, "ba"),__ref,112);
if (RapidSub.canDelegate("lv_oncreateviewholder")) { return __ref.runUserSub(false, "mi_topusers","lv_oncreateviewholder", __ref, _parent, _viewtype);}
RemoteObject _imgtype = RemoteObject.declareNull("com.hitex_glide.Hitex_ImageView");
RemoteObject _lbltype = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _lbl_username = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _lbl_ok = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _cd = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
RemoteObject _pnlpos = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _imgpost = RemoteObject.declareNull("com.hitex_glide.Hitex_ImageView");
Debug.locals.put("Parent", _parent);
Debug.locals.put("ViewType", _viewtype);
 BA.debugLineNum = 112;BA.debugLine="Sub LV_onCreateViewHolder (Parent As Panel, ViewTy";
Debug.ShouldStop(32768);
 BA.debugLineNum = 114;BA.debugLine="Dim imgtype As Hitex_ImageView : imgtype.Initiali";
Debug.ShouldStop(131072);
_imgtype = RemoteObject.createNew ("com.hitex_glide.Hitex_ImageView");Debug.locals.put("imgtype", _imgtype);
 BA.debugLineNum = 114;BA.debugLine="Dim imgtype As Hitex_ImageView : imgtype.Initiali";
Debug.ShouldStop(131072);
_imgtype.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("imgtype")));
 BA.debugLineNum = 115;BA.debugLine="Parent.AddView(imgtype,100%x-70dip,20dip,35dip,35";
Debug.ShouldStop(262144);
_parent.runVoidMethod ("AddView",(Object)((_imgtype.getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {mi_topusers.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba")),mi_topusers.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 70)))}, "-",1, 1)),(Object)(mi_topusers.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))),(Object)(mi_topusers.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 35)))),(Object)(mi_topusers.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 35)))));
 BA.debugLineNum = 117;BA.debugLine="Dim lbltype As Label : lbltype.Initialize(\"lbltyp";
Debug.ShouldStop(1048576);
_lbltype = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbltype", _lbltype);
 BA.debugLineNum = 117;BA.debugLine="Dim lbltype As Label : lbltype.Initialize(\"lbltyp";
Debug.ShouldStop(1048576);
_lbltype.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("lbltype")));
 BA.debugLineNum = 118;BA.debugLine="lbltype.TextColor = Colors.DarkGray : lbltype.Tex";
Debug.ShouldStop(2097152);
_lbltype.runMethod(true,"setTextColor",mi_topusers.__c.getField(false,"Colors").getField(true,"DarkGray"));
 BA.debugLineNum = 118;BA.debugLine="lbltype.TextColor = Colors.DarkGray : lbltype.Tex";
Debug.ShouldStop(2097152);
_lbltype.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 119;BA.debugLine="lbltype.Gravity=Gravity.RIGHT";
Debug.ShouldStop(4194304);
_lbltype.runMethod(true,"setGravity",mi_topusers.__c.getField(false,"Gravity").getField(true,"RIGHT"));
 BA.debugLineNum = 120;BA.debugLine="Parent.AddView(lbltype,0,25dip,100%x-80dip,-1)";
Debug.ShouldStop(8388608);
_parent.runVoidMethod ("AddView",(Object)((_lbltype.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(mi_topusers.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 25)))),(Object)(RemoteObject.solve(new RemoteObject[] {mi_topusers.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba")),mi_topusers.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 80)))}, "-",1, 1)),(Object)(BA.numberCast(int.class, -(double) (0 + 1))));
 BA.debugLineNum = 122;BA.debugLine="Dim lbl_username As Label : lbl_username.Initiali";
Debug.ShouldStop(33554432);
_lbl_username = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl_username", _lbl_username);
 BA.debugLineNum = 122;BA.debugLine="Dim lbl_username As Label : lbl_username.Initiali";
Debug.ShouldStop(33554432);
_lbl_username.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("lbl_username")));
 BA.debugLineNum = 123;BA.debugLine="lbl_username.TextColor = Colors.DarkGray : lbl_us";
Debug.ShouldStop(67108864);
_lbl_username.runMethod(true,"setTextColor",mi_topusers.__c.getField(false,"Colors").getField(true,"DarkGray"));
 BA.debugLineNum = 123;BA.debugLine="lbl_username.TextColor = Colors.DarkGray : lbl_us";
Debug.ShouldStop(67108864);
_lbl_username.runMethod(true,"setTextSize",BA.numberCast(float.class, 11));
 BA.debugLineNum = 124;BA.debugLine="Parent.AddView(lbl_username,0,80dip,100%x-80dip,-";
Debug.ShouldStop(134217728);
_parent.runVoidMethod ("AddView",(Object)((_lbl_username.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(mi_topusers.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 80)))),(Object)(RemoteObject.solve(new RemoteObject[] {mi_topusers.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba")),mi_topusers.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 80)))}, "-",1, 1)),(Object)(BA.numberCast(int.class, -(double) (0 + 1))));
 BA.debugLineNum = 126;BA.debugLine="Dim lbl_ok As Label : lbl_ok.Initialize(\"lbl_ok\")";
Debug.ShouldStop(536870912);
_lbl_ok = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl_ok", _lbl_ok);
 BA.debugLineNum = 126;BA.debugLine="Dim lbl_ok As Label : lbl_ok.Initialize(\"lbl_ok\")";
Debug.ShouldStop(536870912);
_lbl_ok.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("lbl_ok")));
 BA.debugLineNum = 127;BA.debugLine="lbl_ok.TextColor = Colors.DarkGray : lbl_ok.TextS";
Debug.ShouldStop(1073741824);
_lbl_ok.runMethod(true,"setTextColor",mi_topusers.__c.getField(false,"Colors").getField(true,"DarkGray"));
 BA.debugLineNum = 127;BA.debugLine="lbl_ok.TextColor = Colors.DarkGray : lbl_ok.TextS";
Debug.ShouldStop(1073741824);
_lbl_ok.runMethod(true,"setTextSize",BA.numberCast(float.class, 12));
 BA.debugLineNum = 128;BA.debugLine="Parent.AddView(lbl_ok,0,120dip,100%x-80dip,-1)";
Debug.ShouldStop(-2147483648);
_parent.runVoidMethod ("AddView",(Object)((_lbl_ok.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(mi_topusers.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 120)))),(Object)(RemoteObject.solve(new RemoteObject[] {mi_topusers.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba")),mi_topusers.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 80)))}, "-",1, 1)),(Object)(BA.numberCast(int.class, -(double) (0 + 1))));
 BA.debugLineNum = 130;BA.debugLine="Dim cd As ColorDrawable";
Debug.ShouldStop(2);
_cd = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("cd", _cd);
 BA.debugLineNum = 131;BA.debugLine="cd.Initialize2(Colors.White,10,0xFF673AB7,2)";
Debug.ShouldStop(4);
_cd.runVoidMethod ("Initialize2",(Object)(mi_topusers.__c.getField(false,"Colors").getField(true,"White")),(Object)(BA.numberCast(int.class, 10)),(Object)(BA.numberCast(int.class, 0xff673ab7)),(Object)(BA.numberCast(int.class, 2)));
 BA.debugLineNum = 133;BA.debugLine="Dim pnlpos As Panel : pnlpos.Initialize(\"pnlpos\")";
Debug.ShouldStop(16);
_pnlpos = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("pnlpos", _pnlpos);
 BA.debugLineNum = 133;BA.debugLine="Dim pnlpos As Panel : pnlpos.Initialize(\"pnlpos\")";
Debug.ShouldStop(16);
_pnlpos.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("pnlpos")));
 BA.debugLineNum = 134;BA.debugLine="pnlpos.Background=cd";
Debug.ShouldStop(32);
_pnlpos.runMethod(false,"setBackground",(_cd.getObject()));
 BA.debugLineNum = 135;BA.debugLine="Parent.AddView(pnlpos,20dip,40dip,100dip,100dip)";
Debug.ShouldStop(64);
_parent.runVoidMethod ("AddView",(Object)((_pnlpos.getObject())),(Object)(mi_topusers.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))),(Object)(mi_topusers.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))),(Object)(mi_topusers.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100)))),(Object)(mi_topusers.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100)))));
 BA.debugLineNum = 137;BA.debugLine="Dim imgpost As Hitex_ImageView : imgpost.Initiali";
Debug.ShouldStop(256);
_imgpost = RemoteObject.createNew ("com.hitex_glide.Hitex_ImageView");Debug.locals.put("imgpost", _imgpost);
 BA.debugLineNum = 137;BA.debugLine="Dim imgpost As Hitex_ImageView : imgpost.Initiali";
Debug.ShouldStop(256);
_imgpost.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("imgtype")));
 BA.debugLineNum = 138;BA.debugLine="pnlpos.AddView(imgpost,0,0,pnlpos.Width,pnlpos.He";
Debug.ShouldStop(512);
_pnlpos.runVoidMethod ("AddView",(Object)((_imgpost.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_pnlpos.runMethod(true,"getWidth")),(Object)(_pnlpos.runMethod(true,"getHeight")));
 BA.debugLineNum = 139;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _prfn_onpoststringerrorlistener(RemoteObject __ref,RemoteObject _error,RemoteObject _tag) throws Exception{
try {
		Debug.PushSubsStack("prfn_onPostStringErrorListener (mi_topusers) ","mi_topusers",11,__ref.getField(false, "ba"),__ref,337);
if (RapidSub.canDelegate("prfn_onpoststringerrorlistener")) { return __ref.runUserSub(false, "mi_topusers","prfn_onpoststringerrorlistener", __ref, _error, _tag);}
Debug.locals.put("Error", _error);
Debug.locals.put("Tag", _tag);
 BA.debugLineNum = 337;BA.debugLine="Sub prfn_onPostStringErrorListener(Error As Respon";
Debug.ShouldStop(65536);
 BA.debugLineNum = 338;BA.debugLine="Log(Error.ErrorBody)";
Debug.ShouldStop(131072);
mi_topusers.__c.runVoidMethod ("LogImpl","614221313",_error.runMethod(true,"getErrorBody"),0);
 BA.debugLineNum = 339;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(262144);
mi_topusers.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 340;BA.debugLine="RL.Refreshing=False";
Debug.ShouldStop(524288);
__ref.getField(false,"_rl" /*RemoteObject*/ ).runMethod(true,"setRefreshing",mi_topusers.__c.getField(true,"False"));
 BA.debugLineNum = 342;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _prfn_onpoststringoklistener(RemoteObject __ref,RemoteObject _result,RemoteObject _tag) throws Exception{
try {
		Debug.PushSubsStack("prfn_onPostStringOkListener (mi_topusers) ","mi_topusers",11,__ref.getField(false, "ba"),__ref,344);
if (RapidSub.canDelegate("prfn_onpoststringoklistener")) { return __ref.runUserSub(false, "mi_topusers","prfn_onpoststringoklistener", __ref, _result, _tag);}
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colroot = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _uid = RemoteObject.createImmutable("");
RemoteObject _types = RemoteObject.createImmutable("");
RemoteObject _start = RemoteObject.createImmutable("");
RemoteObject _finish = RemoteObject.createImmutable("");
RemoteObject _id = RemoteObject.createImmutable("");
RemoteObject _pic = RemoteObject.createImmutable("");
RemoteObject _msg_id = RemoteObject.createImmutable("");
RemoteObject _njob = RemoteObject.createImmutable("");
RemoteObject _userid = RemoteObject.createImmutable("");
RemoteObject _chat_id = RemoteObject.createImmutable("");
RemoteObject _status = RemoteObject.createImmutable("");
RemoteObject _token = RemoteObject.createImmutable("");
RemoteObject _codes = RemoteObject.createImmutable("");
RemoteObject _imgpost = RemoteObject.createImmutable("");
RemoteObject _target = RemoteObject.createImmutable("");
Debug.locals.put("Result", _result);
Debug.locals.put("Tag", _tag);
 BA.debugLineNum = 344;BA.debugLine="Sub prfn_onPostStringOkListener(Result As String";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 345;BA.debugLine="Log(Result)";
Debug.ShouldStop(16777216);
mi_topusers.__c.runVoidMethod ("LogImpl","614286849",_result,0);
 BA.debugLineNum = 346;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(33554432);
mi_topusers.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 347;BA.debugLine="RL.Refreshing=False";
Debug.ShouldStop(67108864);
__ref.getField(false,"_rl" /*RemoteObject*/ ).runMethod(true,"setRefreshing",mi_topusers.__c.getField(true,"False"));
 BA.debugLineNum = 348;BA.debugLine="Select Tag";
Debug.ShouldStop(134217728);
switch (BA.switchObjectToInt(_tag,BA.ObjectToString("getseft"),BA.ObjectToString("getsef"))) {
case 0: {
 BA.debugLineNum = 350;BA.debugLine="LogColor(\"msg :\"&Result,Colors.Blue)";
Debug.ShouldStop(536870912);
mi_topusers.__c.runVoidMethod ("LogImpl","614286854",RemoteObject.concat(RemoteObject.createImmutable("msg :"),_result),mi_topusers.__c.getField(false,"Colors").getField(true,"Blue"));
 BA.debugLineNum = 351;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(1073741824);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 352;BA.debugLine="parser.Initialize(Result)";
Debug.ShouldStop(-2147483648);
_parser.runVoidMethod ("Initialize",(Object)(_result));
 BA.debugLineNum = 353;BA.debugLine="Dim root As List = parser.NextArray";
Debug.ShouldStop(1);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_root = _parser.runMethod(false,"NextArray");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 354;BA.debugLine="For Each colroot As Map In root";
Debug.ShouldStop(2);
_colroot = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group10 = _root;
final int groupLen10 = group10.runMethod(true,"getSize").<Integer>get()
;int index10 = 0;
;
for (; index10 < groupLen10;index10++){
_colroot.setObject(group10.runMethod(false,"Get",index10));
Debug.locals.put("colroot", _colroot);
 BA.debugLineNum = 355;BA.debugLine="Dim uid As String = colroot.Get(\"uid\")";
Debug.ShouldStop(4);
_uid = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("uid")))));Debug.locals.put("uid", _uid);Debug.locals.put("uid", _uid);
 BA.debugLineNum = 356;BA.debugLine="Dim types As String = colroot.Get(\"types\")";
Debug.ShouldStop(8);
_types = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("types")))));Debug.locals.put("types", _types);Debug.locals.put("types", _types);
 BA.debugLineNum = 357;BA.debugLine="Dim start As String = colroot.Get(\"start\")";
Debug.ShouldStop(16);
_start = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("start")))));Debug.locals.put("start", _start);Debug.locals.put("start", _start);
 BA.debugLineNum = 358;BA.debugLine="Dim finish As String = colroot.Get(\"finish\")";
Debug.ShouldStop(32);
_finish = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("finish")))));Debug.locals.put("finish", _finish);Debug.locals.put("finish", _finish);
 BA.debugLineNum = 359;BA.debugLine="Dim id As String = colroot.Get(\"id\")";
Debug.ShouldStop(64);
_id = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 360;BA.debugLine="Dim pic As String = colroot.Get(\"pic\")";
Debug.ShouldStop(128);
_pic = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("pic")))));Debug.locals.put("pic", _pic);Debug.locals.put("pic", _pic);
 BA.debugLineNum = 361;BA.debugLine="Dim msg_id As String = colroot.Get(\"msg_id\")";
Debug.ShouldStop(256);
_msg_id = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msg_id")))));Debug.locals.put("msg_id", _msg_id);Debug.locals.put("msg_id", _msg_id);
 BA.debugLineNum = 362;BA.debugLine="Dim njob As String = colroot.Get(\"njob\")";
Debug.ShouldStop(512);
_njob = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("njob")))));Debug.locals.put("njob", _njob);Debug.locals.put("njob", _njob);
 BA.debugLineNum = 363;BA.debugLine="Dim userid As String = colroot.Get(\"userid\")";
Debug.ShouldStop(1024);
_userid = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("userid")))));Debug.locals.put("userid", _userid);Debug.locals.put("userid", _userid);
 BA.debugLineNum = 364;BA.debugLine="Dim chat_id As String = colroot.Get(\"chat_id\")";
Debug.ShouldStop(2048);
_chat_id = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("chat_id")))));Debug.locals.put("chat_id", _chat_id);Debug.locals.put("chat_id", _chat_id);
 BA.debugLineNum = 365;BA.debugLine="Dim status As String = colroot.Get(\"status\")";
Debug.ShouldStop(4096);
_status = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("status")))));Debug.locals.put("status", _status);Debug.locals.put("status", _status);
 BA.debugLineNum = 366;BA.debugLine="Dim token As String = colroot.Get(\"token\")";
Debug.ShouldStop(8192);
_token = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("token")))));Debug.locals.put("token", _token);Debug.locals.put("token", _token);
 BA.debugLineNum = 368;BA.debugLine="l_users(0).Add(uid)";
Debug.ShouldStop(32768);
__ref.getField(false,"_l_users" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, 0)).runVoidMethod ("Add",(Object)((_uid)));
 BA.debugLineNum = 369;BA.debugLine="l_users(1).Add(types)";
Debug.ShouldStop(65536);
__ref.getField(false,"_l_users" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, 1)).runVoidMethod ("Add",(Object)((_types)));
 BA.debugLineNum = 370;BA.debugLine="l_users(2).Add(start)";
Debug.ShouldStop(131072);
__ref.getField(false,"_l_users" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, 2)).runVoidMethod ("Add",(Object)((_start)));
 BA.debugLineNum = 371;BA.debugLine="l_users(3).Add(finish)";
Debug.ShouldStop(262144);
__ref.getField(false,"_l_users" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, 3)).runVoidMethod ("Add",(Object)((_finish)));
 BA.debugLineNum = 372;BA.debugLine="l_users(4).Add(id)";
Debug.ShouldStop(524288);
__ref.getField(false,"_l_users" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, 4)).runVoidMethod ("Add",(Object)((_id)));
 BA.debugLineNum = 373;BA.debugLine="l_users(5).Add(userid)";
Debug.ShouldStop(1048576);
__ref.getField(false,"_l_users" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, 5)).runVoidMethod ("Add",(Object)((_userid)));
 BA.debugLineNum = 374;BA.debugLine="l_users(6).Add(chat_id)";
Debug.ShouldStop(2097152);
__ref.getField(false,"_l_users" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, 6)).runVoidMethod ("Add",(Object)((_chat_id)));
 BA.debugLineNum = 375;BA.debugLine="l_users(7).Add(status)";
Debug.ShouldStop(4194304);
__ref.getField(false,"_l_users" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, 7)).runVoidMethod ("Add",(Object)((_status)));
 BA.debugLineNum = 376;BA.debugLine="l_users(8).Add(token)";
Debug.ShouldStop(8388608);
__ref.getField(false,"_l_users" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, 8)).runVoidMethod ("Add",(Object)((_token)));
 BA.debugLineNum = 377;BA.debugLine="l_users(9).Add(pic)";
Debug.ShouldStop(16777216);
__ref.getField(false,"_l_users" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, 9)).runVoidMethod ("Add",(Object)((_pic)));
 }
}Debug.locals.put("colroot", _colroot);
;
 BA.debugLineNum = 381;BA.debugLine="LV.notifyDataSetChanged";
Debug.ShouldStop(268435456);
__ref.getField(false,"_lv" /*RemoteObject*/ ).runVoidMethodAndSync ("notifyDataSetChanged");
 break; }
case 1: {
 BA.debugLineNum = 386;BA.debugLine="If Result.Length>20 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean(">",_result.runMethod(true,"length"),BA.numberCast(double.class, 20))) { 
 BA.debugLineNum = 388;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(8);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 389;BA.debugLine="parser.Initialize(Result)";
Debug.ShouldStop(16);
_parser.runVoidMethod ("Initialize",(Object)(_result));
 BA.debugLineNum = 390;BA.debugLine="Dim root As List = parser.NextArray";
Debug.ShouldStop(32);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_root = _parser.runMethod(false,"NextArray");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 391;BA.debugLine="For Each colroot As Map In root";
Debug.ShouldStop(64);
_colroot = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group40 = _root;
final int groupLen40 = group40.runMethod(true,"getSize").<Integer>get()
;int index40 = 0;
;
for (; index40 < groupLen40;index40++){
_colroot.setObject(group40.runMethod(false,"Get",index40));
Debug.locals.put("colroot", _colroot);
 BA.debugLineNum = 392;BA.debugLine="Dim uid As String = colroot.Get(\"uid\")";
Debug.ShouldStop(128);
_uid = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("uid")))));Debug.locals.put("uid", _uid);Debug.locals.put("uid", _uid);
 BA.debugLineNum = 393;BA.debugLine="Dim codes As String = colroot.Get(\"codes\")";
Debug.ShouldStop(256);
_codes = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("codes")))));Debug.locals.put("codes", _codes);Debug.locals.put("codes", _codes);
 BA.debugLineNum = 394;BA.debugLine="Dim types As String = colroot.Get(\"types\")";
Debug.ShouldStop(512);
_types = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("types")))));Debug.locals.put("types", _types);Debug.locals.put("types", _types);
 BA.debugLineNum = 395;BA.debugLine="Dim start As String = colroot.Get(\"start\")";
Debug.ShouldStop(1024);
_start = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("start")))));Debug.locals.put("start", _start);Debug.locals.put("start", _start);
 BA.debugLineNum = 396;BA.debugLine="Dim finish As String = colroot.Get(\"finish\")";
Debug.ShouldStop(2048);
_finish = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("finish")))));Debug.locals.put("finish", _finish);Debug.locals.put("finish", _finish);
 BA.debugLineNum = 397;BA.debugLine="Dim id As String = colroot.Get(\"id\")";
Debug.ShouldStop(4096);
_id = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 398;BA.debugLine="Dim userid As String = colroot.Get(\"userid\")";
Debug.ShouldStop(8192);
_userid = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("userid")))));Debug.locals.put("userid", _userid);Debug.locals.put("userid", _userid);
 BA.debugLineNum = 399;BA.debugLine="Dim imgpost As String = colroot.Get(\"imgpost\"";
Debug.ShouldStop(16384);
_imgpost = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("imgpost")))));Debug.locals.put("imgpost", _imgpost);Debug.locals.put("imgpost", _imgpost);
 BA.debugLineNum = 400;BA.debugLine="Dim target As String = colroot.Get(\"target\")";
Debug.ShouldStop(32768);
_target = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("target")))));Debug.locals.put("target", _target);Debug.locals.put("target", _target);
 BA.debugLineNum = 401;BA.debugLine="Dim status As String = colroot.Get(\"status\")";
Debug.ShouldStop(65536);
_status = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("status")))));Debug.locals.put("status", _status);Debug.locals.put("status", _status);
 BA.debugLineNum = 402;BA.debugLine="Dim token As String = colroot.Get(\"token\")";
Debug.ShouldStop(131072);
_token = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("token")))));Debug.locals.put("token", _token);Debug.locals.put("token", _token);
 BA.debugLineNum = 404;BA.debugLine="l_users(0).Add(uid)";
Debug.ShouldStop(524288);
__ref.getField(false,"_l_users" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, 0)).runVoidMethod ("Add",(Object)((_uid)));
 BA.debugLineNum = 405;BA.debugLine="l_users(1).Add(types)";
Debug.ShouldStop(1048576);
__ref.getField(false,"_l_users" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, 1)).runVoidMethod ("Add",(Object)((_types)));
 BA.debugLineNum = 406;BA.debugLine="l_users(2).Add(start)";
Debug.ShouldStop(2097152);
__ref.getField(false,"_l_users" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, 2)).runVoidMethod ("Add",(Object)((_start)));
 BA.debugLineNum = 407;BA.debugLine="l_users(3).Add(finish)";
Debug.ShouldStop(4194304);
__ref.getField(false,"_l_users" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, 3)).runVoidMethod ("Add",(Object)((_finish)));
 BA.debugLineNum = 408;BA.debugLine="l_users(4).Add(id)";
Debug.ShouldStop(8388608);
__ref.getField(false,"_l_users" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, 4)).runVoidMethod ("Add",(Object)((_id)));
 BA.debugLineNum = 409;BA.debugLine="l_users(5).Add(userid)";
Debug.ShouldStop(16777216);
__ref.getField(false,"_l_users" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, 5)).runVoidMethod ("Add",(Object)((_userid)));
 BA.debugLineNum = 410;BA.debugLine="l_users(6).Add(target)";
Debug.ShouldStop(33554432);
__ref.getField(false,"_l_users" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, 6)).runVoidMethod ("Add",(Object)((_target)));
 BA.debugLineNum = 411;BA.debugLine="l_users(7).Add(status)";
Debug.ShouldStop(67108864);
__ref.getField(false,"_l_users" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, 7)).runVoidMethod ("Add",(Object)((_status)));
 BA.debugLineNum = 412;BA.debugLine="l_users(8).Add(token)";
Debug.ShouldStop(134217728);
__ref.getField(false,"_l_users" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, 8)).runVoidMethod ("Add",(Object)((_token)));
 BA.debugLineNum = 413;BA.debugLine="l_users(9).Add(imgpost)";
Debug.ShouldStop(268435456);
__ref.getField(false,"_l_users" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, 9)).runVoidMethod ("Add",(Object)((_imgpost)));
 BA.debugLineNum = 414;BA.debugLine="l_users(10).Add(codes)";
Debug.ShouldStop(536870912);
__ref.getField(false,"_l_users" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, 10)).runVoidMethod ("Add",(Object)((_codes)));
 }
}Debug.locals.put("colroot", _colroot);
;
 BA.debugLineNum = 418;BA.debugLine="LV.notifyDataSetChanged";
Debug.ShouldStop(2);
__ref.getField(false,"_lv" /*RemoteObject*/ ).runVoidMethodAndSync ("notifyDataSetChanged");
 }else {
 BA.debugLineNum = 423;BA.debugLine="ToastMessageShow(\"سفارشی یافت نشد\",False)";
Debug.ShouldStop(64);
mi_topusers.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("سفارشی یافت نشد")),(Object)(mi_topusers.__c.getField(true,"False")));
 };
 break; }
}
;
 BA.debugLineNum = 429;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _req_getme(RemoteObject __ref,RemoteObject _userid) throws Exception{
try {
		Debug.PushSubsStack("req_getme (mi_topusers) ","mi_topusers",11,__ref.getField(false, "ba"),__ref,319);
if (RapidSub.canDelegate("req_getme")) { return __ref.runUserSub(false, "mi_topusers","req_getme", __ref, _userid);}
RemoteObject _post = RemoteObject.declareNull("com.reza.sh.fastnet.PostRequestRaper");
Debug.locals.put("userid", _userid);
 BA.debugLineNum = 319;BA.debugLine="Sub req_getme(userid As String)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 320;BA.debugLine="prfn.initialize(\"prfn\")";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_prfn" /*RemoteObject*/ ).runVoidMethod ("initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("prfn")));
 BA.debugLineNum = 322;BA.debugLine="Dim post As PostRequest";
Debug.ShouldStop(2);
_post = RemoteObject.createNew ("com.reza.sh.fastnet.PostRequestRaper");Debug.locals.put("post", _post);
 BA.debugLineNum = 323;BA.debugLine="post=prfn.BuildPostQuery(\"http://filework.ir/INST";
Debug.ShouldStop(4);
_post = __ref.getField(false,"_prfn" /*RemoteObject*/ ).runMethod(false,"BuildPostQuery",(Object)(BA.ObjectToString("http://filework.ir/INSTAFOLLOW/api/req.php")),(Object)(RemoteObject.createImmutable("getsef")));Debug.locals.put("post", _post);
 BA.debugLineNum = 325;BA.debugLine="post.addHeder(\"User-Agent\",\"Dalvik/1.6.0 (Linux;";
Debug.ShouldStop(16);
_post.runVoidMethod ("addHeder",(Object)(BA.ObjectToString("User-Agent")),(Object)(RemoteObject.createImmutable("Dalvik/1.6.0 (Linux; U; Android 4.4.4; SM-A700FD Build/KTU84P)")));
 BA.debugLineNum = 328;BA.debugLine="post.addParametrs(\"userid\",userid)";
Debug.ShouldStop(128);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("userid")),(Object)(_userid));
 BA.debugLineNum = 330;BA.debugLine="post.addParametrs(\"req\",\"get_sef\")";
Debug.ShouldStop(512);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("req")),(Object)(RemoteObject.createImmutable("get_sef")));
 BA.debugLineNum = 332;BA.debugLine="post.executRequestAsString";
Debug.ShouldStop(2048);
_post.runVoidMethod ("executRequestAsString");
 BA.debugLineNum = 334;BA.debugLine="ProgressDialogShow(\"در حال دریافت ...\")";
Debug.ShouldStop(8192);
mi_topusers.__c.runVoidMethod ("ProgressDialogShow",__ref.getField(false, "ba"),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("در حال دریافت ..."))));
 BA.debugLineNum = 335;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _req_telegetme(RemoteObject __ref,RemoteObject _userid) throws Exception{
try {
		Debug.PushSubsStack("req_telegetme (mi_topusers) ","mi_topusers",11,__ref.getField(false, "ba"),__ref,301);
if (RapidSub.canDelegate("req_telegetme")) { return __ref.runUserSub(false, "mi_topusers","req_telegetme", __ref, _userid);}
RemoteObject _post = RemoteObject.declareNull("com.reza.sh.fastnet.PostRequestRaper");
Debug.locals.put("userid", _userid);
 BA.debugLineNum = 301;BA.debugLine="Sub req_telegetme(userid As String)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 302;BA.debugLine="prfn.initialize(\"prfn\")";
Debug.ShouldStop(8192);
__ref.getField(false,"_prfn" /*RemoteObject*/ ).runVoidMethod ("initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("prfn")));
 BA.debugLineNum = 304;BA.debugLine="Dim post As PostRequest";
Debug.ShouldStop(32768);
_post = RemoteObject.createNew ("com.reza.sh.fastnet.PostRequestRaper");Debug.locals.put("post", _post);
 BA.debugLineNum = 305;BA.debugLine="post=prfn.BuildPostQuery(\"http://filework.ir/INST";
Debug.ShouldStop(65536);
_post = __ref.getField(false,"_prfn" /*RemoteObject*/ ).runMethod(false,"BuildPostQuery",(Object)(BA.ObjectToString("http://filework.ir/INSTAFOLLOW/api/req.php")),(Object)(RemoteObject.createImmutable("getseft")));Debug.locals.put("post", _post);
 BA.debugLineNum = 307;BA.debugLine="post.addHeder(\"User-Agent\",\"Dalvik/1.6.0 (Linux;";
Debug.ShouldStop(262144);
_post.runVoidMethod ("addHeder",(Object)(BA.ObjectToString("User-Agent")),(Object)(RemoteObject.createImmutable("Dalvik/1.6.0 (Linux; U; Android 4.4.4; SM-A700FD Build/KTU84P)")));
 BA.debugLineNum = 310;BA.debugLine="post.addParametrs(\"userid\",userid_t)";
Debug.ShouldStop(2097152);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("userid")),(Object)(__ref.getField(true,"_userid_t" /*RemoteObject*/ )));
 BA.debugLineNum = 312;BA.debugLine="post.addParametrs(\"req\",\"get_telesef\")";
Debug.ShouldStop(8388608);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("req")),(Object)(RemoteObject.createImmutable("get_telesef")));
 BA.debugLineNum = 314;BA.debugLine="post.executRequestAsString";
Debug.ShouldStop(33554432);
_post.runVoidMethod ("executRequestAsString");
 BA.debugLineNum = 316;BA.debugLine="ProgressDialogShow(\"در حال دریافت ...\")";
Debug.ShouldStop(134217728);
mi_topusers.__c.runVoidMethod ("ProgressDialogShow",__ref.getField(false, "ba"),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("در حال دریافت ..."))));
 BA.debugLineNum = 317;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _rl_onrefresh(RemoteObject __ref,RemoteObject _direction) throws Exception{
try {
		Debug.PushSubsStack("RL_onRefresh (mi_topusers) ","mi_topusers",11,__ref.getField(false, "ba"),__ref,271);
if (RapidSub.canDelegate("rl_onrefresh")) { return __ref.runUserSub(false, "mi_topusers","rl_onrefresh", __ref, _direction);}
int _ia = 0;
Debug.locals.put("Direction", _direction);
 BA.debugLineNum = 271;BA.debugLine="Sub RL_onRefresh (Direction As Int)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 273;BA.debugLine="Select (Direction)";
Debug.ShouldStop(65536);
switch (BA.switchObjectToInt((_direction),__ref.getField(false,"_rl" /*RemoteObject*/ ).getField(true,"DIRECTION_TOP"),__ref.getField(false,"_rl" /*RemoteObject*/ ).getField(true,"DIRECTION_BOTTOM"))) {
case 0: {
 BA.debugLineNum = 275;BA.debugLine="Log(\"TOP\")";
Debug.ShouldStop(262144);
mi_topusers.__c.runVoidMethod ("LogImpl","614024708",RemoteObject.createImmutable("TOP"),0);
 BA.debugLineNum = 276;BA.debugLine="For ia=0 To 38";
Debug.ShouldStop(524288);
{
final int step4 = 1;
final int limit4 = 38;
_ia = 0 ;
for (;(step4 > 0 && _ia <= limit4) || (step4 < 0 && _ia >= limit4) ;_ia = ((int)(0 + _ia + step4))  ) {
Debug.locals.put("ia", _ia);
 BA.debugLineNum = 278;BA.debugLine="l_users(ia).Initialize";
Debug.ShouldStop(2097152);
__ref.getField(false,"_l_users" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, _ia)).runVoidMethod ("Initialize");
 }
}Debug.locals.put("ia", _ia);
;
 BA.debugLineNum = 284;BA.debugLine="Select type_history";
Debug.ShouldStop(134217728);
switch (BA.switchObjectToInt(__ref.getField(true,"_type_history" /*RemoteObject*/ ),BA.numberCast(int.class, 0),BA.numberCast(int.class, 1))) {
case 0: {
 BA.debugLineNum = 286;BA.debugLine="req_getme(i_pk)";
Debug.ShouldStop(536870912);
__ref.runClassMethod (com.it.fome.mi_topusers.class, "_req_getme" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_i_pk" /*RemoteObject*/ )));
 break; }
case 1: {
 BA.debugLineNum = 289;BA.debugLine="req_telegetme(userid_t)";
Debug.ShouldStop(1);
__ref.runClassMethod (com.it.fome.mi_topusers.class, "_req_telegetme" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_userid_t" /*RemoteObject*/ )));
 break; }
}
;
 BA.debugLineNum = 293;BA.debugLine="LV.notifyDataSetChanged";
Debug.ShouldStop(16);
__ref.getField(false,"_lv" /*RemoteObject*/ ).runVoidMethodAndSync ("notifyDataSetChanged");
 break; }
case 1: {
 BA.debugLineNum = 296;BA.debugLine="Log(\"BOTTOM\")";
Debug.ShouldStop(128);
mi_topusers.__c.runVoidMethod ("LogImpl","614024729",RemoteObject.createImmutable("BOTTOM"),0);
 break; }
}
;
 BA.debugLineNum = 299;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}