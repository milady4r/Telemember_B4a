package com.it.fome;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class mt_sef_subs_2 {


public static RemoteObject  _addpnl(RemoteObject __ref,RemoteObject _pnl) throws Exception{
try {
		Debug.PushSubsStack("addpnl (mt_sef) ","mt_sef",13,__ref.getField(false, "ba"),__ref,74);
if (RapidSub.canDelegate("addpnl")) { return __ref.runUserSub(false, "mt_sef","addpnl", __ref, _pnl);}
int _ia = 0;
Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 74;BA.debugLine="Sub addpnl(pnl As Panel) As View";
Debug.ShouldStop(512);
 BA.debugLineNum = 75;BA.debugLine="For ia=0 To 38";
Debug.ShouldStop(1024);
{
final int step1 = 1;
final int limit1 = 38;
_ia = 0 ;
for (;(step1 > 0 && _ia <= limit1) || (step1 < 0 && _ia >= limit1) ;_ia = ((int)(0 + _ia + step1))  ) {
Debug.locals.put("ia", _ia);
 BA.debugLineNum = 77;BA.debugLine="list_f(ia).Initialize";
Debug.ShouldStop(4096);
__ref.getField(false,"_list_f" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, _ia)).runVoidMethod ("Initialize");
 BA.debugLineNum = 78;BA.debugLine="list_l(ia).Initialize";
Debug.ShouldStop(8192);
__ref.getField(false,"_list_l" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, _ia)).runVoidMethod ("Initialize");
 BA.debugLineNum = 79;BA.debugLine="list_v(ia).Initialize";
Debug.ShouldStop(16384);
__ref.getField(false,"_list_v" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, _ia)).runVoidMethod ("Initialize");
 BA.debugLineNum = 80;BA.debugLine="list_c(ia).Initialize";
Debug.ShouldStop(32768);
__ref.getField(false,"_list_c" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, _ia)).runVoidMethod ("Initialize");
 }
}Debug.locals.put("ia", _ia);
;
 BA.debugLineNum = 83;BA.debugLine="Select Type_sef";
Debug.ShouldStop(262144);
switch (BA.switchObjectToInt(__ref.getField(true,"_type_sef" /*RemoteObject*/ ),BA.numberCast(int.class, 0),BA.numberCast(int.class, 1),BA.numberCast(int.class, 2),BA.numberCast(int.class, 3),BA.numberCast(int.class, 4))) {
case 0: {
 BA.debugLineNum = 86;BA.debugLine="list_f(1).AddAll(Array As String(\"50\",\"100\",\"20";
Debug.ShouldStop(2097152);
__ref.getField(false,"_list_f" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, 1)).runVoidMethod ("AddAll",(Object)(mt_sef.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {12},new Object[] {BA.ObjectToString("50"),BA.ObjectToString("100"),BA.ObjectToString("200"),BA.ObjectToString("300"),BA.ObjectToString("400"),BA.ObjectToString("500"),BA.ObjectToString("600"),BA.ObjectToString("700"),BA.ObjectToString("800"),BA.ObjectToString("900"),BA.ObjectToString("1000"),RemoteObject.createImmutable("2000")})))));
 BA.debugLineNum = 87;BA.debugLine="list_f(2).AddAll(Array As String(\"100\",\"200\",\"3";
Debug.ShouldStop(4194304);
__ref.getField(false,"_list_f" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, 2)).runVoidMethod ("AddAll",(Object)(mt_sef.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {12},new Object[] {BA.ObjectToString("100"),BA.ObjectToString("200"),BA.ObjectToString("300"),BA.ObjectToString("600"),BA.ObjectToString("800"),BA.ObjectToString("1000"),BA.ObjectToString("1200"),BA.ObjectToString("1400"),BA.ObjectToString("1600"),BA.ObjectToString("1800"),BA.ObjectToString("2000"),RemoteObject.createImmutable("4000")})))));
 break; }
case 1: {
 BA.debugLineNum = 90;BA.debugLine="list_l(1).AddAll(Array As String(\"50\",\"100\",\"20";
Debug.ShouldStop(33554432);
__ref.getField(false,"_list_l" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, 1)).runVoidMethod ("AddAll",(Object)(mt_sef.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {12},new Object[] {BA.ObjectToString("50"),BA.ObjectToString("100"),BA.ObjectToString("200"),BA.ObjectToString("300"),BA.ObjectToString("400"),BA.ObjectToString("500"),BA.ObjectToString("600"),BA.ObjectToString("700"),BA.ObjectToString("800"),BA.ObjectToString("900"),BA.ObjectToString("1000"),RemoteObject.createImmutable("2000")})))));
 BA.debugLineNum = 91;BA.debugLine="list_l(2).AddAll(Array As String(\"100\",\"200\",\"3";
Debug.ShouldStop(67108864);
__ref.getField(false,"_list_l" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, 2)).runVoidMethod ("AddAll",(Object)(mt_sef.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {12},new Object[] {BA.ObjectToString("100"),BA.ObjectToString("200"),BA.ObjectToString("300"),BA.ObjectToString("600"),BA.ObjectToString("800"),BA.ObjectToString("1000"),BA.ObjectToString("1200"),BA.ObjectToString("1400"),BA.ObjectToString("1600"),BA.ObjectToString("1800"),BA.ObjectToString("2000"),RemoteObject.createImmutable("4000")})))));
 break; }
case 2: {
 BA.debugLineNum = 94;BA.debugLine="list_c(1).AddAll(Array As String(\"50\",\"100\",\"20";
Debug.ShouldStop(536870912);
__ref.getField(false,"_list_c" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, 1)).runVoidMethod ("AddAll",(Object)(mt_sef.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {12},new Object[] {BA.ObjectToString("50"),BA.ObjectToString("100"),BA.ObjectToString("200"),BA.ObjectToString("300"),BA.ObjectToString("400"),BA.ObjectToString("500"),BA.ObjectToString("600"),BA.ObjectToString("700"),BA.ObjectToString("800"),BA.ObjectToString("900"),BA.ObjectToString("1000"),RemoteObject.createImmutable("2000")})))));
 BA.debugLineNum = 95;BA.debugLine="list_c(2).AddAll(Array As String(\"100\",\"200\",\"3";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_list_c" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, 2)).runVoidMethod ("AddAll",(Object)(mt_sef.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {12},new Object[] {BA.ObjectToString("100"),BA.ObjectToString("200"),BA.ObjectToString("300"),BA.ObjectToString("600"),BA.ObjectToString("800"),BA.ObjectToString("1000"),BA.ObjectToString("1200"),BA.ObjectToString("1400"),BA.ObjectToString("1600"),BA.ObjectToString("1800"),BA.ObjectToString("2000"),RemoteObject.createImmutable("4000")})))));
 break; }
case 3: {
 BA.debugLineNum = 98;BA.debugLine="list_v(1).AddAll(Array As String(\"50\",\"100\",\"20";
Debug.ShouldStop(2);
__ref.getField(false,"_list_v" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, 1)).runVoidMethod ("AddAll",(Object)(mt_sef.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {12},new Object[] {BA.ObjectToString("50"),BA.ObjectToString("100"),BA.ObjectToString("200"),BA.ObjectToString("300"),BA.ObjectToString("400"),BA.ObjectToString("500"),BA.ObjectToString("600"),BA.ObjectToString("700"),BA.ObjectToString("800"),BA.ObjectToString("900"),BA.ObjectToString("1000"),RemoteObject.createImmutable("2000")})))));
 BA.debugLineNum = 99;BA.debugLine="list_v(2).AddAll(Array As String(\"100\",\"200\",\"3";
Debug.ShouldStop(4);
__ref.getField(false,"_list_v" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, 2)).runVoidMethod ("AddAll",(Object)(mt_sef.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {12},new Object[] {BA.ObjectToString("100"),BA.ObjectToString("200"),BA.ObjectToString("300"),BA.ObjectToString("600"),BA.ObjectToString("800"),BA.ObjectToString("1000"),BA.ObjectToString("1200"),BA.ObjectToString("1400"),BA.ObjectToString("1600"),BA.ObjectToString("1800"),BA.ObjectToString("2000"),RemoteObject.createImmutable("4000")})))));
 break; }
case 4: {
 BA.debugLineNum = 102;BA.debugLine="list_f(1).AddAll(Array As String(\"50\",\"100\",\"20";
Debug.ShouldStop(32);
__ref.getField(false,"_list_f" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, 1)).runVoidMethod ("AddAll",(Object)(mt_sef.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {12},new Object[] {BA.ObjectToString("50"),BA.ObjectToString("100"),BA.ObjectToString("200"),BA.ObjectToString("300"),BA.ObjectToString("400"),BA.ObjectToString("500"),BA.ObjectToString("600"),BA.ObjectToString("700"),BA.ObjectToString("800"),BA.ObjectToString("900"),BA.ObjectToString("1000"),RemoteObject.createImmutable("2000")})))));
 BA.debugLineNum = 103;BA.debugLine="list_f(2).AddAll(Array As String(\"100\",\"200\",\"3";
Debug.ShouldStop(64);
__ref.getField(false,"_list_f" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, 2)).runVoidMethod ("AddAll",(Object)(mt_sef.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {12},new Object[] {BA.ObjectToString("100"),BA.ObjectToString("200"),BA.ObjectToString("300"),BA.ObjectToString("600"),BA.ObjectToString("800"),BA.ObjectToString("1000"),BA.ObjectToString("1200"),BA.ObjectToString("1400"),BA.ObjectToString("1600"),BA.ObjectToString("1800"),BA.ObjectToString("2000"),RemoteObject.createImmutable("4000")})))));
 break; }
}
;
 BA.debugLineNum = 109;BA.debugLine="pnl_main.Initialize(\"pnl_main\")";
Debug.ShouldStop(4096);
__ref.getField(false,"_pnl_main" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("pnl_main")));
 BA.debugLineNum = 110;BA.debugLine="pnl_main.Color=Colors.White";
Debug.ShouldStop(8192);
__ref.getField(false,"_pnl_main" /*RemoteObject*/ ).runVoidMethod ("setColor",mt_sef.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 111;BA.debugLine="pnl.AddView(pnl_main,0,0,pnl.Width,pnl.Height)";
Debug.ShouldStop(16384);
_pnl.runVoidMethod ("AddView",(Object)((__ref.getField(false,"_pnl_main" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_pnl.runMethod(true,"getWidth")),(Object)(_pnl.runMethod(true,"getHeight")));
 BA.debugLineNum = 113;BA.debugLine="LV.Initializer(\"LV\").ListView.Build";
Debug.ShouldStop(65536);
__ref.getField(false,"_lv" /*RemoteObject*/ ).runMethod(false,"Initializer",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("LV"))).runMethod(false,"ListView").runVoidMethod ("Build");
 BA.debugLineNum = 114;BA.debugLine="pnl_main.AddView(LV,0,0,pnl_main.Width,pnl_main.H";
Debug.ShouldStop(131072);
__ref.getField(false,"_pnl_main" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_lv" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_pnl_main" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_pnl_main" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 118;BA.debugLine="LV.Show";
Debug.ShouldStop(2097152);
__ref.getField(false,"_lv" /*RemoteObject*/ ).runVoidMethodAndSync ("Show");
 BA.debugLineNum = 120;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
mt_sef._ev = RemoteObject.createImmutable("");__ref.setField("_ev",mt_sef._ev);
 //BA.debugLineNum = 3;BA.debugLine="Private obj As Object";
mt_sef._obj = RemoteObject.createNew ("Object");__ref.setField("_obj",mt_sef._obj);
 //BA.debugLineNum = 4;BA.debugLine="Private sql1 As SQL";
mt_sef._sql1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL");__ref.setField("_sql1",mt_sef._sql1);
 //BA.debugLineNum = 5;BA.debugLine="Private cursor1 As Cursor";
mt_sef._cursor1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");__ref.setField("_cursor1",mt_sef._cursor1);
 //BA.debugLineNum = 6;BA.debugLine="Private pnl_tolbar As Panel";
mt_sef._pnl_tolbar = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnl_tolbar",mt_sef._pnl_tolbar);
 //BA.debugLineNum = 7;BA.debugLine="Private LV As Hitex_LayoutView";
mt_sef._lv = RemoteObject.createNew ("wir.hitex.recycler.Hitex_LayoutView");__ref.setField("_lv",mt_sef._lv);
 //BA.debugLineNum = 8;BA.debugLine="Private Glide As Hitex_Glide";
mt_sef._glide = RemoteObject.createNew ("com.hitex_glide.Hitex_Glide");__ref.setField("_glide",mt_sef._glide);
 //BA.debugLineNum = 9;BA.debugLine="Private prfn As PersianFastNetwork";
mt_sef._prfn = RemoteObject.createNew ("com.reza.sh.fastnet.Fastnet");__ref.setField("_prfn",mt_sef._prfn);
 //BA.debugLineNum = 10;BA.debugLine="Private i_username ,i_pk,i_cookie,i_pic As String";
mt_sef._i_username = RemoteObject.createImmutable("");__ref.setField("_i_username",mt_sef._i_username);
mt_sef._i_pk = RemoteObject.createImmutable("");__ref.setField("_i_pk",mt_sef._i_pk);
mt_sef._i_cookie = RemoteObject.createImmutable("");__ref.setField("_i_cookie",mt_sef._i_cookie);
mt_sef._i_pic = RemoteObject.createImmutable("");__ref.setField("_i_pic",mt_sef._i_pic);
 //BA.debugLineNum = 11;BA.debugLine="Private pnl_main As Panel";
mt_sef._pnl_main = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnl_main",mt_sef._pnl_main);
 //BA.debugLineNum = 13;BA.debugLine="Public Type_sef As Int";
mt_sef._type_sef = RemoteObject.createImmutable(0);__ref.setField("_type_sef",mt_sef._type_sef);
 //BA.debugLineNum = 14;BA.debugLine="Private LV As Hitex_LayoutView";
mt_sef._lv = RemoteObject.createNew ("wir.hitex.recycler.Hitex_LayoutView");__ref.setField("_lv",mt_sef._lv);
 //BA.debugLineNum = 15;BA.debugLine="Private Glide As Hitex_Glide";
mt_sef._glide = RemoteObject.createNew ("com.hitex_glide.Hitex_Glide");__ref.setField("_glide",mt_sef._glide);
 //BA.debugLineNum = 16;BA.debugLine="Private roundview As MC7RoundView";
mt_sef._roundview = RemoteObject.createNew ("com.flycoroundview.mc7.MC7RoundView");__ref.setField("_roundview",mt_sef._roundview);
 //BA.debugLineNum = 17;BA.debugLine="Private pnl_posts As Panel";
mt_sef._pnl_posts = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnl_posts",mt_sef._pnl_posts);
 //BA.debugLineNum = 19;BA.debugLine="Private upl As UploadRequest";
mt_sef._upl = RemoteObject.createNew ("com.reza.sh.fastnet.UploadRequest");__ref.setField("_upl",mt_sef._upl);
 //BA.debugLineNum = 20;BA.debugLine="Dim pr As PersianFastNetwork";
mt_sef._pr = RemoteObject.createNew ("com.reza.sh.fastnet.Fastnet");__ref.setField("_pr",mt_sef._pr);
 //BA.debugLineNum = 22;BA.debugLine="Private list_f(40),list_l(40),list_v(40),list_c(4";
mt_sef._list_f = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.collections.List", new int[] {40}, new Object[]{});__ref.setField("_list_f",mt_sef._list_f);
mt_sef._list_l = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.collections.List", new int[] {40}, new Object[]{});__ref.setField("_list_l",mt_sef._list_l);
mt_sef._list_v = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.collections.List", new int[] {40}, new Object[]{});__ref.setField("_list_v",mt_sef._list_v);
mt_sef._list_c = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.collections.List", new int[] {40}, new Object[]{});__ref.setField("_list_c",mt_sef._list_c);
 //BA.debugLineNum = 23;BA.debugLine="Dim str_name,cm As String";
mt_sef._str_name = RemoteObject.createImmutable("");__ref.setField("_str_name",mt_sef._str_name);
mt_sef._cm = RemoteObject.createImmutable("");__ref.setField("_cm",mt_sef._cm);
 //BA.debugLineNum = 24;BA.debugLine="Dim r_coins,r_nums As Long";
mt_sef._r_coins = RemoteObject.createImmutable(0L);__ref.setField("_r_coins",mt_sef._r_coins);
mt_sef._r_nums = RemoteObject.createImmutable(0L);__ref.setField("_r_nums",mt_sef._r_nums);
 //BA.debugLineNum = 25;BA.debugLine="Private progressDialog As MaterialDialog";
mt_sef._progressdialog = RemoteObject.createNew ("de.amberhome.materialdialogs.MaterialDialogWrapper");__ref.setField("_progressdialog",mt_sef._progressdialog);
 //BA.debugLineNum = 26;BA.debugLine="Dim pnl_coms As Panel";
mt_sef._pnl_coms = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnl_coms",mt_sef._pnl_coms);
 //BA.debugLineNum = 27;BA.debugLine="Dim username_t ,userid_t As String";
mt_sef._username_t = RemoteObject.createImmutable("");__ref.setField("_username_t",mt_sef._username_t);
mt_sef._userid_t = RemoteObject.createImmutable("");__ref.setField("_userid_t",mt_sef._userid_t);
 //BA.debugLineNum = 29;BA.debugLine="Dim img_address_target As String";
mt_sef._img_address_target = RemoteObject.createImmutable("");__ref.setField("_img_address_target",mt_sef._img_address_target);
 //BA.debugLineNum = 30;BA.debugLine="Dim username_target As String";
mt_sef._username_target = RemoteObject.createImmutable("");__ref.setField("_username_target",mt_sef._username_target);
 //BA.debugLineNum = 31;BA.debugLine="Dim chatid_target,idchannel_t,titelchat_target  A";
mt_sef._chatid_target = RemoteObject.createImmutable("");__ref.setField("_chatid_target",mt_sef._chatid_target);
mt_sef._idchannel_t = RemoteObject.createImmutable("");__ref.setField("_idchannel_t",mt_sef._idchannel_t);
mt_sef._titelchat_target = RemoteObject.createImmutable("");__ref.setField("_titelchat_target",mt_sef._titelchat_target);
 //BA.debugLineNum = 32;BA.debugLine="Dim us_name As String";
mt_sef._us_name = RemoteObject.createImmutable("");__ref.setField("_us_name",mt_sef._us_name);
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _dialog_buttonpressed(RemoteObject __ref,RemoteObject _dialog,RemoteObject _action) throws Exception{
try {
		Debug.PushSubsStack("Dialog_ButtonPressed (mt_sef) ","mt_sef",13,__ref.getField(false, "ba"),__ref,314);
if (RapidSub.canDelegate("dialog_buttonpressed")) { return __ref.runUserSub(false, "mt_sef","dialog_buttonpressed", __ref, _dialog, _action);}
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _builder = RemoteObject.declareNull("de.amberhome.materialdialogs.MaterialDialogBuilderWrapper");
RemoteObject _mtoasst = RemoteObject.declareNull("com.valdesekamdem.library.mdtoast.MaterialToast");
Debug.locals.put("Dialog", _dialog);
Debug.locals.put("Action", _action);
 BA.debugLineNum = 314;BA.debugLine="Sub Dialog_ButtonPressed (Dialog As MaterialDialog";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 315;BA.debugLine="Log(Action)";
Debug.ShouldStop(67108864);
mt_sef.__c.runVoidMethod ("LogImpl","616449537",_action,0);
 BA.debugLineNum = 316;BA.debugLine="Select Action";
Debug.ShouldStop(134217728);
switch (BA.switchObjectToInt(_action,BA.ObjectToString("POSITIVE"))) {
case 0: {
 BA.debugLineNum = 320;BA.debugLine="cursor1 = sql1.ExecQuery(\"SELECT * FROM tbl_coi";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_cursor1" /*RemoteObject*/ ).setObject (__ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM tbl_coin WHERE userid='"),__ref.getField(true,"_userid_t" /*RemoteObject*/ ),RemoteObject.createImmutable("' ")))));
 BA.debugLineNum = 321;BA.debugLine="Dim i As Int";
Debug.ShouldStop(1);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 322;BA.debugLine="For i=0 To cursor1.RowCount-1";
Debug.ShouldStop(2);
{
final int step6 = 1;
final int limit6 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cursor1" /*RemoteObject*/ ).runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step6 > 0 && _i.<Integer>get().intValue() <= limit6) || (step6 < 0 && _i.<Integer>get().intValue() >= limit6) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step6))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 323;BA.debugLine="cursor1.Position=i";
Debug.ShouldStop(4);
__ref.getField(false,"_cursor1" /*RemoteObject*/ ).runMethod(true,"setPosition",_i);
 BA.debugLineNum = 324;BA.debugLine="cm=cursor1.GetString(\"cm\")";
Debug.ShouldStop(8);
__ref.setField ("_cm" /*RemoteObject*/ ,__ref.getField(false,"_cursor1" /*RemoteObject*/ ).runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("cm"))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 327;BA.debugLine="If r_coins<cm Or r_coins=cm Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("<",__ref.getField(true,"_r_coins" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_cm" /*RemoteObject*/ ))) || RemoteObject.solveBoolean("=",__ref.getField(true,"_r_coins" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_cm" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 328;BA.debugLine="Dim Builder As MaterialDialogBuilder";
Debug.ShouldStop(128);
_builder = RemoteObject.createNew ("de.amberhome.materialdialogs.MaterialDialogBuilderWrapper");Debug.locals.put("Builder", _builder);
 BA.debugLineNum = 329;BA.debugLine="Builder.Initialize(\"Dialog\")";
Debug.ShouldStop(256);
_builder.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Dialog")));
 BA.debugLineNum = 330;BA.debugLine="Builder.Title(\"سفارش ممبر\")";
Debug.ShouldStop(512);
_builder.runVoidMethod ("Title",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("سفارش ممبر"))));
 BA.debugLineNum = 331;BA.debugLine="Builder.Content(\"درحال ثبت سفارش ...\")";
Debug.ShouldStop(1024);
_builder.runVoidMethod ("Content",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("درحال ثبت سفارش ..."))));
 BA.debugLineNum = 332;BA.debugLine="Builder.Progress(True, 0)";
Debug.ShouldStop(2048);
_builder.runVoidMethod ("Progress",(Object)(mt_sef.__c.getField(true,"True")),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 333;BA.debugLine="Builder.ProgressIndeterminateStyle(True)";
Debug.ShouldStop(4096);
_builder.runVoidMethod ("ProgressIndeterminateStyle",(Object)(mt_sef.__c.getField(true,"True")));
 BA.debugLineNum = 334;BA.debugLine="progressDialog = Builder.Show";
Debug.ShouldStop(8192);
__ref.setField ("_progressdialog" /*RemoteObject*/ ,_builder.runMethod(false,"Show"));
 BA.debugLineNum = 337;BA.debugLine="Log(img_address_target)";
Debug.ShouldStop(65536);
mt_sef.__c.runVoidMethod ("LogImpl","616449559",__ref.getField(true,"_img_address_target" /*RemoteObject*/ ),0);
 BA.debugLineNum = 338;BA.debugLine="Log(username_target)";
Debug.ShouldStop(131072);
mt_sef.__c.runVoidMethod ("LogImpl","616449560",__ref.getField(true,"_username_target" /*RemoteObject*/ ),0);
 BA.debugLineNum = 339;BA.debugLine="If img_address_target=\"http://filework.ir/INST";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_img_address_target" /*RemoteObject*/ ),BA.ObjectToString("http://filework.ir/INSTAFOLLOW/api/asset/noimage.png"))) { 
 BA.debugLineNum = 340;BA.debugLine="reqsef(userid_t,\"1\",username_target,r_nums,\"0";
Debug.ShouldStop(524288);
__ref.runClassMethod (com.it.fome.mt_sef.class, "_reqsef" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_userid_t" /*RemoteObject*/ )),(Object)(BA.ObjectToString("1")),(Object)(__ref.getField(true,"_username_target" /*RemoteObject*/ )),(Object)(BA.NumberToString(__ref.getField(true,"_r_nums" /*RemoteObject*/ ))),(Object)(BA.ObjectToString("0")),(Object)(BA.ObjectToString("0")),(Object)(RemoteObject.createImmutable("noimage.png")));
 }else {
 BA.debugLineNum = 343;BA.debugLine="upload(img_address_target,\"\",\"\",\"\")";
Debug.ShouldStop(4194304);
__ref.runClassMethod (com.it.fome.mt_sef.class, "_upload" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_img_address_target" /*RemoteObject*/ )),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("")));
 };
 }else {
 BA.debugLineNum = 348;BA.debugLine="Dim mtoasst As KJ_MaterialToast";
Debug.ShouldStop(134217728);
_mtoasst = RemoteObject.createNew ("com.valdesekamdem.library.mdtoast.MaterialToast");Debug.locals.put("mtoasst", _mtoasst);
 BA.debugLineNum = 349;BA.debugLine="mtoasst.Initialize(\"سکه شما جهت سفارش این مقدا";
Debug.ShouldStop(268435456);
_mtoasst.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("سکه شما جهت سفارش این مقدار کافی نمیباشد")),(Object)(_mtoasst.getField(true,"LENGTH_SHORT")),(Object)(_mtoasst.getField(true,"TYPE_WARNING")));
 BA.debugLineNum = 350;BA.debugLine="Return";
Debug.ShouldStop(536870912);
if (true) return RemoteObject.createImmutable("");
 };
 break; }
}
;
 BA.debugLineNum = 358;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getname_img(RemoteObject __ref,RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("getname_img (mt_sef) ","mt_sef",13,__ref.getField(false, "ba"),__ref,503);
if (RapidSub.canDelegate("getname_img")) { return __ref.runUserSub(false, "mt_sef","getname_img", __ref, _str);}
Debug.locals.put("str", _str);
 BA.debugLineNum = 503;BA.debugLine="Sub getname_img(str As String) As String";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 504;BA.debugLine="str=str.SubString2(str.IndexOf(\"profile_photos\"),";
Debug.ShouldStop(8388608);
_str = _str.runMethod(true,"substring",(Object)(_str.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("profile_photos")))),(Object)(_str.runMethod(true,"length")));Debug.locals.put("str", _str);
 BA.debugLineNum = 505;BA.debugLine="str=str.Replace(\"profile_photos/\",\"\")";
Debug.ShouldStop(16777216);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString("profile_photos/")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("str", _str);
 BA.debugLineNum = 506;BA.debugLine="Return str";
Debug.ShouldStop(33554432);
if (true) return _str;
 BA.debugLineNum = 507;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _eventname,RemoteObject _module) throws Exception{
try {
		Debug.PushSubsStack("Initialize (mt_sef) ","mt_sef",13,__ref.getField(false, "ba"),__ref,37);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "mt_sef","initialize", __ref, _ba, _eventname, _module);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
int _ia = 0;
RemoteObject _i = RemoteObject.createImmutable(0);
Debug.locals.put("ba", _ba);
Debug.locals.put("EventName", _eventname);
Debug.locals.put("Module", _module);
 BA.debugLineNum = 37;BA.debugLine="Public Sub Initialize(EventName As String,Module A";
Debug.ShouldStop(16);
 BA.debugLineNum = 38;BA.debugLine="Ev = EventName";
Debug.ShouldStop(32);
__ref.setField ("_ev" /*RemoteObject*/ ,_eventname);
 BA.debugLineNum = 39;BA.debugLine="obj = Module";
Debug.ShouldStop(64);
__ref.setField ("_obj" /*RemoteObject*/ ,_module);
 BA.debugLineNum = 40;BA.debugLine="pr.initialize(\"pr\")";
Debug.ShouldStop(128);
__ref.getField(false,"_pr" /*RemoteObject*/ ).runVoidMethod ("initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("pr")));
 BA.debugLineNum = 43;BA.debugLine="For ia=0 To 38";
Debug.ShouldStop(1024);
{
final int step4 = 1;
final int limit4 = 38;
_ia = 0 ;
for (;(step4 > 0 && _ia <= limit4) || (step4 < 0 && _ia >= limit4) ;_ia = ((int)(0 + _ia + step4))  ) {
Debug.locals.put("ia", _ia);
 BA.debugLineNum = 45;BA.debugLine="list_f(ia).Initialize";
Debug.ShouldStop(4096);
__ref.getField(false,"_list_f" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, _ia)).runVoidMethod ("Initialize");
 BA.debugLineNum = 46;BA.debugLine="list_l(ia).Initialize";
Debug.ShouldStop(8192);
__ref.getField(false,"_list_l" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, _ia)).runVoidMethod ("Initialize");
 BA.debugLineNum = 47;BA.debugLine="list_v(ia).Initialize";
Debug.ShouldStop(16384);
__ref.getField(false,"_list_v" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, _ia)).runVoidMethod ("Initialize");
 BA.debugLineNum = 48;BA.debugLine="list_c(ia).Initialize";
Debug.ShouldStop(32768);
__ref.getField(false,"_list_c" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, _ia)).runVoidMethod ("Initialize");
 }
}Debug.locals.put("ia", _ia);
;
 BA.debugLineNum = 53;BA.debugLine="If File.Exists(File.DirInternal,\"instadb.db\")=Fal";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",mt_sef.__c.getField(false,"File").runMethod(true,"Exists",(Object)(mt_sef.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("instadb.db"))),mt_sef.__c.getField(true,"False"))) { 
 BA.debugLineNum = 54;BA.debugLine="File.Copy(File.DirAssets,\"instadb.db\",File.DirIn";
Debug.ShouldStop(2097152);
mt_sef.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(mt_sef.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("instadb.db")),(Object)(mt_sef.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("instadb.db")));
 };
 BA.debugLineNum = 56;BA.debugLine="If sql1.IsInitialized=False Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),mt_sef.__c.getField(true,"False"))) { 
 BA.debugLineNum = 57;BA.debugLine="sql1.Initialize(File.DirInternal,\"instadb.db\",Fa";
Debug.ShouldStop(16777216);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(mt_sef.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("instadb.db")),(Object)(mt_sef.__c.getField(true,"False")));
 };
 BA.debugLineNum = 61;BA.debugLine="cursor1 = sql1.ExecQuery(\"SELECT * FROM tbl_tele";
Debug.ShouldStop(268435456);
__ref.getField(false,"_cursor1" /*RemoteObject*/ ).setObject (__ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT * FROM tbl_tele WHERE soich='1'"))));
 BA.debugLineNum = 62;BA.debugLine="Dim i As Int";
Debug.ShouldStop(536870912);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 63;BA.debugLine="For i=0 To cursor1.RowCount-1";
Debug.ShouldStop(1073741824);
{
final int step18 = 1;
final int limit18 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cursor1" /*RemoteObject*/ ).runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step18 > 0 && _i.<Integer>get().intValue() <= limit18) || (step18 < 0 && _i.<Integer>get().intValue() >= limit18) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step18))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 64;BA.debugLine="cursor1.Position=i";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_cursor1" /*RemoteObject*/ ).runMethod(true,"setPosition",_i);
 BA.debugLineNum = 65;BA.debugLine="userid_t=cursor1.GetString(\"userid\")";
Debug.ShouldStop(1);
__ref.setField ("_userid_t" /*RemoteObject*/ ,__ref.getField(false,"_cursor1" /*RemoteObject*/ ).runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("userid"))));
 BA.debugLineNum = 66;BA.debugLine="username_t=cursor1.GetString(\"username\")";
Debug.ShouldStop(2);
__ref.setField ("_username_t" /*RemoteObject*/ ,__ref.getField(false,"_cursor1" /*RemoteObject*/ ).runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("username"))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 68;BA.debugLine="cursor1.Close";
Debug.ShouldStop(8);
__ref.getField(false,"_cursor1" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 70;BA.debugLine="Log(\"username : \"&userid_t)";
Debug.ShouldStop(32);
mt_sef.__c.runVoidMethod ("LogImpl","616056353",RemoteObject.concat(RemoteObject.createImmutable("username : "),__ref.getField(true,"_userid_t" /*RemoteObject*/ )),0);
 BA.debugLineNum = 72;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
		Debug.PushSubsStack("LV_GetItemCount (mt_sef) ","mt_sef",13,__ref.getField(false, "ba"),__ref,217);
if (RapidSub.canDelegate("lv_getitemcount")) { return __ref.runUserSub(false, "mt_sef","lv_getitemcount", __ref);}
 BA.debugLineNum = 217;BA.debugLine="Sub LV_GetItemCount As Int 								        '$ Item";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 218;BA.debugLine="Select Type_sef";
Debug.ShouldStop(33554432);
switch (BA.switchObjectToInt(__ref.getField(true,"_type_sef" /*RemoteObject*/ ),BA.numberCast(int.class, 0),BA.numberCast(int.class, 1),BA.numberCast(int.class, 2),BA.numberCast(int.class, 3),BA.numberCast(int.class, 4))) {
case 0: {
 BA.debugLineNum = 221;BA.debugLine="Return list_f(1).Size";
Debug.ShouldStop(268435456);
if (true) return __ref.getField(false,"_list_f" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, 1)).runMethod(true,"getSize");
 break; }
case 1: {
 BA.debugLineNum = 223;BA.debugLine="Return list_l(1).Size";
Debug.ShouldStop(1073741824);
if (true) return __ref.getField(false,"_list_l" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, 1)).runMethod(true,"getSize");
 break; }
case 2: {
 BA.debugLineNum = 226;BA.debugLine="Return list_c(1).Size";
Debug.ShouldStop(2);
if (true) return __ref.getField(false,"_list_c" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, 1)).runMethod(true,"getSize");
 break; }
case 3: {
 BA.debugLineNum = 229;BA.debugLine="Return list_v(1).Size";
Debug.ShouldStop(16);
if (true) return __ref.getField(false,"_list_v" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, 1)).runMethod(true,"getSize");
 break; }
case 4: {
 break; }
}
;
 BA.debugLineNum = 234;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lv_itemclick(RemoteObject __ref,RemoteObject _clickeditem,RemoteObject _position) throws Exception{
try {
		Debug.PushSubsStack("LV_ItemClick (mt_sef) ","mt_sef",13,__ref.getField(false, "ba"),__ref,236);
if (RapidSub.canDelegate("lv_itemclick")) { return __ref.runUserSub(false, "mt_sef","lv_itemclick", __ref, _clickeditem, _position);}
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _mtoasst = RemoteObject.declareNull("com.valdesekamdem.library.mdtoast.MaterialToast");
RemoteObject _str_c = RemoteObject.createImmutable("");
RemoteObject _builder = RemoteObject.declareNull("de.amberhome.materialdialogs.MaterialDialogBuilderWrapper");
Debug.locals.put("ClickedItem", _clickeditem);
Debug.locals.put("Position", _position);
 BA.debugLineNum = 236;BA.debugLine="Sub LV_ItemClick (ClickedItem As Panel, Position A";
Debug.ShouldStop(2048);
 BA.debugLineNum = 238;BA.debugLine="Select Type_sef";
Debug.ShouldStop(8192);
switch (BA.switchObjectToInt(__ref.getField(true,"_type_sef" /*RemoteObject*/ ),BA.numberCast(int.class, 0),BA.numberCast(int.class, 3),BA.numberCast(int.class, 2),BA.numberCast(int.class, 1),BA.numberCast(int.class, 4))) {
case 0: {
 BA.debugLineNum = 241;BA.debugLine="r_coins=list_f(2).Get(Position)";
Debug.ShouldStop(65536);
__ref.setField ("_r_coins" /*RemoteObject*/ ,BA.numberCast(long.class, __ref.getField(false,"_list_f" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, 2)).runMethod(false,"Get",(Object)(_position))));
 BA.debugLineNum = 242;BA.debugLine="r_nums=list_f(1).Get(Position)";
Debug.ShouldStop(131072);
__ref.setField ("_r_nums" /*RemoteObject*/ ,BA.numberCast(long.class, __ref.getField(false,"_list_f" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, 1)).runMethod(false,"Get",(Object)(_position))));
 BA.debugLineNum = 243;BA.debugLine="cursor1 = sql1.ExecQuery(\"SELECT * FROM tbl_coi";
Debug.ShouldStop(262144);
__ref.getField(false,"_cursor1" /*RemoteObject*/ ).setObject (__ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM tbl_coin WHERE userid='"),__ref.getField(true,"_userid_t" /*RemoteObject*/ ),RemoteObject.createImmutable("' ")))));
 BA.debugLineNum = 244;BA.debugLine="Dim i As Int";
Debug.ShouldStop(524288);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 245;BA.debugLine="For i=0 To cursor1.RowCount-1";
Debug.ShouldStop(1048576);
{
final int step7 = 1;
final int limit7 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cursor1" /*RemoteObject*/ ).runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step7 > 0 && _i.<Integer>get().intValue() <= limit7) || (step7 < 0 && _i.<Integer>get().intValue() >= limit7) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step7))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 246;BA.debugLine="cursor1.Position=i";
Debug.ShouldStop(2097152);
__ref.getField(false,"_cursor1" /*RemoteObject*/ ).runMethod(true,"setPosition",_i);
 BA.debugLineNum = 247;BA.debugLine="cm=cursor1.GetString(\"cm\")";
Debug.ShouldStop(4194304);
__ref.setField ("_cm" /*RemoteObject*/ ,__ref.getField(false,"_cursor1" /*RemoteObject*/ ).runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("cm"))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 249;BA.debugLine="cursor1.Close";
Debug.ShouldStop(16777216);
__ref.getField(false,"_cursor1" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 250;BA.debugLine="If r_coins<cm Or r_coins=cm Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("<",__ref.getField(true,"_r_coins" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_cm" /*RemoteObject*/ ))) || RemoteObject.solveBoolean("=",__ref.getField(true,"_r_coins" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_cm" /*RemoteObject*/ )))) { 
 }else {
 BA.debugLineNum = 253;BA.debugLine="Dim mtoasst As KJ_MaterialToast";
Debug.ShouldStop(268435456);
_mtoasst = RemoteObject.createNew ("com.valdesekamdem.library.mdtoast.MaterialToast");Debug.locals.put("mtoasst", _mtoasst);
 BA.debugLineNum = 254;BA.debugLine="mtoasst.Initialize(\"سکه شما جهت سفارش این مقدا";
Debug.ShouldStop(536870912);
_mtoasst.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("سکه شما جهت سفارش این مقدار کافی نمیباشد")),(Object)(_mtoasst.getField(true,"LENGTH_SHORT")),(Object)(_mtoasst.getField(true,"TYPE_WARNING")));
 BA.debugLineNum = 255;BA.debugLine="Return";
Debug.ShouldStop(1073741824);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 258;BA.debugLine="Dim str_c As String";
Debug.ShouldStop(2);
_str_c = RemoteObject.createImmutable("");Debug.locals.put("str_c", _str_c);
 BA.debugLineNum = 259;BA.debugLine="str_c=\"افزایش\"&\" \"&list_f(1).Get(Position)&\" مم";
Debug.ShouldStop(4);
_str_c = RemoteObject.concat(RemoteObject.createImmutable("افزایش"),RemoteObject.createImmutable(" "),__ref.getField(false,"_list_f" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, 1)).runMethod(false,"Get",(Object)(_position)),RemoteObject.createImmutable(" ممبر"));Debug.locals.put("str_c", _str_c);
 BA.debugLineNum = 260;BA.debugLine="Dim Builder As MaterialDialogBuilder";
Debug.ShouldStop(8);
_builder = RemoteObject.createNew ("de.amberhome.materialdialogs.MaterialDialogBuilderWrapper");Debug.locals.put("Builder", _builder);
 BA.debugLineNum = 261;BA.debugLine="Builder.Initialize(\"Dialog\")";
Debug.ShouldStop(16);
_builder.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Dialog")));
 BA.debugLineNum = 262;BA.debugLine="Builder.Title(\" سفارش ممبر\")";
Debug.ShouldStop(32);
_builder.runVoidMethod ("Title",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable(" سفارش ممبر"))));
 BA.debugLineNum = 263;BA.debugLine="Builder.Content(str_c)";
Debug.ShouldStop(64);
_builder.runVoidMethod ("Content",(Object)(BA.ObjectToCharSequence(_str_c)));
 BA.debugLineNum = 264;BA.debugLine="Builder.ItemsCallback";
Debug.ShouldStop(128);
_builder.runVoidMethod ("ItemsCallback");
 BA.debugLineNum = 265;BA.debugLine="Builder.NegativeText(\"بیخیال\")";
Debug.ShouldStop(256);
_builder.runVoidMethod ("NegativeText",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("بیخیال"))));
 BA.debugLineNum = 266;BA.debugLine="Builder.PositiveText(\"ثبت سفارش\")";
Debug.ShouldStop(512);
_builder.runVoidMethod ("PositiveText",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("ثبت سفارش"))));
 BA.debugLineNum = 267;BA.debugLine="Builder.PositiveColor(0xFF522E52)";
Debug.ShouldStop(1024);
_builder.runVoidMethod ("PositiveColor",(Object)(BA.numberCast(int.class, 0xff522e52)));
 BA.debugLineNum = 268;BA.debugLine="Builder.Show";
Debug.ShouldStop(2048);
_builder.runVoidMethod ("Show");
 break; }
case 1: {
 BA.debugLineNum = 274;BA.debugLine="r_coins=list_v(2).Get(Position)";
Debug.ShouldStop(131072);
__ref.setField ("_r_coins" /*RemoteObject*/ ,BA.numberCast(long.class, __ref.getField(false,"_list_v" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, 2)).runMethod(false,"Get",(Object)(_position))));
 BA.debugLineNum = 275;BA.debugLine="r_nums=list_v(1).Get(Position)";
Debug.ShouldStop(262144);
__ref.setField ("_r_nums" /*RemoteObject*/ ,BA.numberCast(long.class, __ref.getField(false,"_list_v" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, 1)).runMethod(false,"Get",(Object)(_position))));
 BA.debugLineNum = 276;BA.debugLine="cursor1 = sql1.ExecQuery(\"SELECT * FROM tbl_coi";
Debug.ShouldStop(524288);
__ref.getField(false,"_cursor1" /*RemoteObject*/ ).setObject (__ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM tbl_coin WHERE userid='"),__ref.getField(true,"_userid_t" /*RemoteObject*/ ),RemoteObject.createImmutable("' ")))));
 BA.debugLineNum = 277;BA.debugLine="Dim i As Int";
Debug.ShouldStop(1048576);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 278;BA.debugLine="For i=0 To cursor1.RowCount-1";
Debug.ShouldStop(2097152);
{
final int step34 = 1;
final int limit34 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cursor1" /*RemoteObject*/ ).runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step34 > 0 && _i.<Integer>get().intValue() <= limit34) || (step34 < 0 && _i.<Integer>get().intValue() >= limit34) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step34))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 279;BA.debugLine="cursor1.Position=i";
Debug.ShouldStop(4194304);
__ref.getField(false,"_cursor1" /*RemoteObject*/ ).runMethod(true,"setPosition",_i);
 BA.debugLineNum = 280;BA.debugLine="cm=cursor1.GetString(\"cm\")";
Debug.ShouldStop(8388608);
__ref.setField ("_cm" /*RemoteObject*/ ,__ref.getField(false,"_cursor1" /*RemoteObject*/ ).runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("cm"))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 282;BA.debugLine="cursor1.Close";
Debug.ShouldStop(33554432);
__ref.getField(false,"_cursor1" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 283;BA.debugLine="If r_coins<cm Or r_coins=cm Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("<",__ref.getField(true,"_r_coins" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_cm" /*RemoteObject*/ ))) || RemoteObject.solveBoolean("=",__ref.getField(true,"_r_coins" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_cm" /*RemoteObject*/ )))) { 
 }else {
 BA.debugLineNum = 286;BA.debugLine="Dim mtoasst As KJ_MaterialToast";
Debug.ShouldStop(536870912);
_mtoasst = RemoteObject.createNew ("com.valdesekamdem.library.mdtoast.MaterialToast");Debug.locals.put("mtoasst", _mtoasst);
 BA.debugLineNum = 287;BA.debugLine="mtoasst.Initialize(\"سکه شما جهت سفارش این مقدا";
Debug.ShouldStop(1073741824);
_mtoasst.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("سکه شما جهت سفارش این مقدار کافی نمیباشد")),(Object)(_mtoasst.getField(true,"LENGTH_SHORT")),(Object)(_mtoasst.getField(true,"TYPE_WARNING")));
 BA.debugLineNum = 288;BA.debugLine="Return";
Debug.ShouldStop(-2147483648);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 292;BA.debugLine="Act_Chat.chat_id=username_target";
Debug.ShouldStop(8);
mt_sef._act_chat._chat_id /*RemoteObject*/  = __ref.getField(true,"_username_target" /*RemoteObject*/ );
 BA.debugLineNum = 293;BA.debugLine="Act_Chat.name_chat=titelchat_target";
Debug.ShouldStop(16);
mt_sef._act_chat._name_chat /*RemoteObject*/  = __ref.getField(true,"_titelchat_target" /*RemoteObject*/ );
 BA.debugLineNum = 294;BA.debugLine="Act_Chat.numcoins=r_coins";
Debug.ShouldStop(32);
mt_sef._act_chat._numcoins /*RemoteObject*/  = BA.NumberToString(__ref.getField(true,"_r_coins" /*RemoteObject*/ ));
 BA.debugLineNum = 295;BA.debugLine="Act_Chat.numfinish=r_nums";
Debug.ShouldStop(64);
mt_sef._act_chat._numfinish /*RemoteObject*/  = BA.NumberToString(__ref.getField(true,"_r_nums" /*RemoteObject*/ ));
 BA.debugLineNum = 296;BA.debugLine="Act_Chat.channelid=idchannel_t";
Debug.ShouldStop(128);
mt_sef._act_chat._channelid /*RemoteObject*/  = __ref.getField(true,"_idchannel_t" /*RemoteObject*/ );
 BA.debugLineNum = 297;BA.debugLine="Act_Chat.imgchat=img_address_target";
Debug.ShouldStop(256);
mt_sef._act_chat._imgchat /*RemoteObject*/  = __ref.getField(true,"_img_address_target" /*RemoteObject*/ );
 BA.debugLineNum = 298;BA.debugLine="Act_Chat.us_name=us_name";
Debug.ShouldStop(512);
mt_sef._act_chat._us_name /*RemoteObject*/  = __ref.getField(true,"_us_name" /*RemoteObject*/ );
 BA.debugLineNum = 299;BA.debugLine="StartActivity(Act_Chat)";
Debug.ShouldStop(1024);
mt_sef.__c.runVoidMethod ("StartActivity",__ref.getField(false, "ba"),(Object)((mt_sef._act_chat.getObject())));
 break; }
case 2: {
 break; }
case 3: {
 break; }
case 4: {
 break; }
}
;
 BA.debugLineNum = 311;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lv_onbindviewholder(RemoteObject __ref,RemoteObject _parent,RemoteObject _position) throws Exception{
try {
		Debug.PushSubsStack("LV_onBindViewHolder (mt_sef) ","mt_sef",13,__ref.getField(false, "ba"),__ref,127);
if (RapidSub.canDelegate("lv_onbindviewholder")) { return __ref.runUserSub(false, "mt_sef","lv_onbindviewholder", __ref, _parent, _position);}
RemoteObject _bkcolors = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
RemoteObject _cards = RemoteObject.declareNull("de.amberhome.objects.CardViewWrapper");
RemoteObject _pnl_card = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _lbl_itemicon = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _lbl_name = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _bkcolor = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
RemoteObject _lbl_notis = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("Parent", _parent);
Debug.locals.put("Position", _position);
 BA.debugLineNum = 127;BA.debugLine="Sub LV_onBindViewHolder (Parent As Panel, Position";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 128;BA.debugLine="Parent.RemoveAllViews";
Debug.ShouldStop(-2147483648);
_parent.runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 129;BA.debugLine="Parent.Color=Colors.Transparent";
Debug.ShouldStop(1);
_parent.runVoidMethod ("setColor",mt_sef.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 131;BA.debugLine="Dim bkcolors As ColorDrawable";
Debug.ShouldStop(4);
_bkcolors = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("bkcolors", _bkcolors);
 BA.debugLineNum = 132;BA.debugLine="bkcolors.Initialize(Colors.White,5%x)";
Debug.ShouldStop(8);
_bkcolors.runVoidMethod ("Initialize",(Object)(mt_sef.__c.getField(false,"Colors").getField(true,"White")),(Object)(mt_sef.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 134;BA.debugLine="Dim cards As CardView";
Debug.ShouldStop(32);
_cards = RemoteObject.createNew ("de.amberhome.objects.CardViewWrapper");Debug.locals.put("cards", _cards);
 BA.debugLineNum = 135;BA.debugLine="cards.Initialize(\"cards\")";
Debug.ShouldStop(64);
_cards.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("cards")));
 BA.debugLineNum = 136;BA.debugLine="cards.Color=Colors.White";
Debug.ShouldStop(128);
_cards.runVoidMethod ("setColor",mt_sef.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 137;BA.debugLine="cards.CornerRadius=8%x";
Debug.ShouldStop(256);
_cards.runMethod(true,"setCornerRadius",BA.numberCast(float.class, mt_sef.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 8)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 138;BA.debugLine="cards.Elevation=3%x";
Debug.ShouldStop(512);
_cards.runMethod(true,"setElevation",BA.numberCast(float.class, mt_sef.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 3)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 139;BA.debugLine="Parent.AddView(cards,5%x,5%x,Parent.Width-10%x,10";
Debug.ShouldStop(1024);
_parent.runVoidMethod ("AddView",(Object)((_cards.getObject())),(Object)(mt_sef.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))),(Object)(mt_sef.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))),(Object)(RemoteObject.solve(new RemoteObject[] {_parent.runMethod(true,"getWidth"),mt_sef.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))}, "-",1, 1)),(Object)(mt_sef.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 141;BA.debugLine="Dim pnl_card As Panel";
Debug.ShouldStop(4096);
_pnl_card = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("pnl_card", _pnl_card);
 BA.debugLineNum = 142;BA.debugLine="pnl_card.Initialize(\"pnl_card\")";
Debug.ShouldStop(8192);
_pnl_card.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("pnl_card")));
 BA.debugLineNum = 143;BA.debugLine="pnl_card.Color=Colors.White";
Debug.ShouldStop(16384);
_pnl_card.runVoidMethod ("setColor",mt_sef.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 144;BA.debugLine="cards.AddView(pnl_card,0,0,cards.Width,cards.Heig";
Debug.ShouldStop(32768);
_cards.runVoidMethod ("AddView",(Object)((_pnl_card.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_cards.runMethod(true,"getWidth")),(Object)(_cards.runMethod(true,"getHeight")));
 BA.debugLineNum = 147;BA.debugLine="Dim lbl_itemicon As Label";
Debug.ShouldStop(262144);
_lbl_itemicon = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl_itemicon", _lbl_itemicon);
 BA.debugLineNum = 148;BA.debugLine="lbl_itemicon.Initialize(\"lbl_itemicon\")";
Debug.ShouldStop(524288);
_lbl_itemicon.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("lbl_itemicon")));
 BA.debugLineNum = 149;BA.debugLine="lbl_itemicon.TextColor=0xFFD305BA";
Debug.ShouldStop(1048576);
_lbl_itemicon.runMethod(true,"setTextColor",BA.numberCast(int.class, 0xffd305ba));
 BA.debugLineNum = 150;BA.debugLine="lbl_itemicon.TextSize=25";
Debug.ShouldStop(2097152);
_lbl_itemicon.runMethod(true,"setTextSize",BA.numberCast(float.class, 25));
 BA.debugLineNum = 151;BA.debugLine="lbl_itemicon.Typeface=Typeface.MATERIALICONS";
Debug.ShouldStop(4194304);
_lbl_itemicon.runMethod(false,"setTypeface",mt_sef.__c.getField(false,"Typeface").runMethod(false,"getMATERIALICONS"));
 BA.debugLineNum = 152;BA.debugLine="lbl_itemicon.Gravity=Gravity.CENTER_VERTICAL+Grav";
Debug.ShouldStop(8388608);
_lbl_itemicon.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {mt_sef.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL"),mt_sef.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL")}, "+",1, 1));
 BA.debugLineNum = 153;BA.debugLine="pnl_card.AddView(lbl_itemicon,pnl_card.Width-15%x";
Debug.ShouldStop(16777216);
_pnl_card.runVoidMethod ("AddView",(Object)((_lbl_itemicon.getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {_pnl_card.runMethod(true,"getWidth"),mt_sef.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),__ref.getField(false, "ba"))}, "-",1, 1)),(Object)(mt_sef.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 3)),__ref.getField(false, "ba"))),(Object)(mt_sef.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))),(Object)(mt_sef.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 155;BA.debugLine="Dim lbl_name As Label";
Debug.ShouldStop(67108864);
_lbl_name = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl_name", _lbl_name);
 BA.debugLineNum = 156;BA.debugLine="lbl_name.Initialize(\"lbl_name\")";
Debug.ShouldStop(134217728);
_lbl_name.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("lbl_name")));
 BA.debugLineNum = 157;BA.debugLine="lbl_name.TextColor=Colors.DarkGray";
Debug.ShouldStop(268435456);
_lbl_name.runMethod(true,"setTextColor",mt_sef.__c.getField(false,"Colors").getField(true,"DarkGray"));
 BA.debugLineNum = 158;BA.debugLine="lbl_name.TextSize=13";
Debug.ShouldStop(536870912);
_lbl_name.runMethod(true,"setTextSize",BA.numberCast(float.class, 13));
 BA.debugLineNum = 159;BA.debugLine="lbl_name.Typeface=Typeface.LoadFromAssets(\"iran_s";
Debug.ShouldStop(1073741824);
_lbl_name.runMethod(false,"setTypeface",mt_sef.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("iran_sans.ttf"))));
 BA.debugLineNum = 160;BA.debugLine="lbl_name.Gravity=Gravity.CENTER_VERTICAL+Gravity.";
Debug.ShouldStop(-2147483648);
_lbl_name.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {mt_sef.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL"),mt_sef.__c.getField(false,"Gravity").getField(true,"RIGHT")}, "+",1, 1));
 BA.debugLineNum = 161;BA.debugLine="pnl_card.AddView(lbl_name,0,3.5%x,pnl_card.Width-";
Debug.ShouldStop(1);
_pnl_card.runVoidMethod ("AddView",(Object)((_lbl_name.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(mt_sef.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 3.5)),__ref.getField(false, "ba"))),(Object)(RemoteObject.solve(new RemoteObject[] {_pnl_card.runMethod(true,"getWidth"),mt_sef.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 17)),__ref.getField(false, "ba"))}, "-",1, 1)),(Object)(mt_sef.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 163;BA.debugLine="Dim bkcolor As ColorDrawable";
Debug.ShouldStop(4);
_bkcolor = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("bkcolor", _bkcolor);
 BA.debugLineNum = 164;BA.debugLine="bkcolor.Initialize(0xFFFFD82B,10)";
Debug.ShouldStop(8);
_bkcolor.runVoidMethod ("Initialize",(Object)(BA.numberCast(int.class, 0xffffd82b)),(Object)(BA.numberCast(int.class, 10)));
 BA.debugLineNum = 165;BA.debugLine="Dim lbl_notis As Label";
Debug.ShouldStop(16);
_lbl_notis = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl_notis", _lbl_notis);
 BA.debugLineNum = 166;BA.debugLine="lbl_notis.Initialize(\"lbl_notis\")";
Debug.ShouldStop(32);
_lbl_notis.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("lbl_notis")));
 BA.debugLineNum = 167;BA.debugLine="lbl_notis.TextColor=Colors.DarkGray";
Debug.ShouldStop(64);
_lbl_notis.runMethod(true,"setTextColor",mt_sef.__c.getField(false,"Colors").getField(true,"DarkGray"));
 BA.debugLineNum = 168;BA.debugLine="lbl_notis.TextSize=13";
Debug.ShouldStop(128);
_lbl_notis.runMethod(true,"setTextSize",BA.numberCast(float.class, 13));
 BA.debugLineNum = 169;BA.debugLine="lbl_notis.Typeface=Typeface.LoadFromAssets(\"iran_";
Debug.ShouldStop(256);
_lbl_notis.runMethod(false,"setTypeface",mt_sef.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("iran_sans.ttf"))));
 BA.debugLineNum = 171;BA.debugLine="lbl_notis.Gravity=Gravity.CENTER_VERTICAL+Gravity";
Debug.ShouldStop(1024);
_lbl_notis.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {mt_sef.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL"),mt_sef.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL")}, "+",1, 1));
 BA.debugLineNum = 173;BA.debugLine="pnl_card.AddView(lbl_notis,2%x,4%x,30%x,8%x)";
Debug.ShouldStop(4096);
_pnl_card.runVoidMethod ("AddView",(Object)((_lbl_notis.getObject())),(Object)(mt_sef.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),__ref.getField(false, "ba"))),(Object)(mt_sef.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 4)),__ref.getField(false, "ba"))),(Object)(mt_sef.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 30)),__ref.getField(false, "ba"))),(Object)(mt_sef.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 8)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 175;BA.debugLine="cards.Height=lbl_name.Top+lbl_name.Height+2%x";
Debug.ShouldStop(16384);
_cards.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {_lbl_name.runMethod(true,"getTop"),_lbl_name.runMethod(true,"getHeight"),mt_sef.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),__ref.getField(false, "ba"))}, "++",2, 1));
 BA.debugLineNum = 176;BA.debugLine="pnl_card.Height=lbl_name.Top+lbl_name.Height+2%x";
Debug.ShouldStop(32768);
_pnl_card.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {_lbl_name.runMethod(true,"getTop"),_lbl_name.runMethod(true,"getHeight"),mt_sef.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),__ref.getField(false, "ba"))}, "++",2, 1));
 BA.debugLineNum = 182;BA.debugLine="roundview.Initialize(lbl_notis)";
Debug.ShouldStop(2097152);
__ref.getField(false,"_roundview" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)((_lbl_notis.getObject())));
 BA.debugLineNum = 183;BA.debugLine="roundview.CornerRadius_BL=8%x";
Debug.ShouldStop(4194304);
__ref.getField(false,"_roundview" /*RemoteObject*/ ).runMethod(true,"setCornerRadius_BL",mt_sef.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 8)),__ref.getField(false, "ba")));
 BA.debugLineNum = 184;BA.debugLine="roundview.CornerRadius_BR=8%x";
Debug.ShouldStop(8388608);
__ref.getField(false,"_roundview" /*RemoteObject*/ ).runMethod(true,"setCornerRadius_BR",mt_sef.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 8)),__ref.getField(false, "ba")));
 BA.debugLineNum = 185;BA.debugLine="roundview.CornerRadius_TL=8%x";
Debug.ShouldStop(16777216);
__ref.getField(false,"_roundview" /*RemoteObject*/ ).runMethod(true,"setCornerRadius_TL",mt_sef.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 8)),__ref.getField(false, "ba")));
 BA.debugLineNum = 186;BA.debugLine="roundview.CornerRadius_TR=8%x";
Debug.ShouldStop(33554432);
__ref.getField(false,"_roundview" /*RemoteObject*/ ).runMethod(true,"setCornerRadius_TR",mt_sef.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 8)),__ref.getField(false, "ba")));
 BA.debugLineNum = 187;BA.debugLine="roundview.BackgroundColor=0xFFFFD82B";
Debug.ShouldStop(67108864);
__ref.getField(false,"_roundview" /*RemoteObject*/ ).runMethod(true,"setBackgroundColor",BA.numberCast(int.class, 0xffffd82b));
 BA.debugLineNum = 193;BA.debugLine="Select Type_sef";
Debug.ShouldStop(1);
switch (BA.switchObjectToInt(__ref.getField(true,"_type_sef" /*RemoteObject*/ ),BA.numberCast(int.class, 0),BA.numberCast(int.class, 1),BA.numberCast(int.class, 2),BA.numberCast(int.class, 3),BA.numberCast(int.class, 4))) {
case 0: {
 BA.debugLineNum = 196;BA.debugLine="lbl_name.Text=\"افزایش\"&\" \"&list_f(1).Get(Positi";
Debug.ShouldStop(8);
_lbl_name.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("افزایش"),RemoteObject.createImmutable(" "),__ref.getField(false,"_list_f" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, 1)).runMethod(false,"Get",(Object)(_position)),RemoteObject.createImmutable(" ممبر"))));
 BA.debugLineNum = 197;BA.debugLine="lbl_notis.Text=list_f(2).Get(Position)&\" \"&\"سکه";
Debug.ShouldStop(16);
_lbl_notis.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(__ref.getField(false,"_list_f" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, 2)).runMethod(false,"Get",(Object)(_position)),RemoteObject.createImmutable(" "),RemoteObject.createImmutable("سکه"))));
 BA.debugLineNum = 198;BA.debugLine="lbl_itemicon.Text=Chr(0xE8D3)";
Debug.ShouldStop(32);
_lbl_itemicon.runMethod(true,"setText",BA.ObjectToCharSequence(mt_sef.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xe8d3)))));
 break; }
case 1: {
 BA.debugLineNum = 200;BA.debugLine="lbl_name.Text=\"افزایش\"&\" \"&list_l(1).Get(Positi";
Debug.ShouldStop(128);
_lbl_name.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("افزایش"),RemoteObject.createImmutable(" "),__ref.getField(false,"_list_l" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, 1)).runMethod(false,"Get",(Object)(_position)),RemoteObject.createImmutable(" لایک"))));
 BA.debugLineNum = 201;BA.debugLine="lbl_notis.Text=list_l(2).Get(Position)&\" \"&\"سکه";
Debug.ShouldStop(256);
_lbl_notis.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(__ref.getField(false,"_list_l" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, 2)).runMethod(false,"Get",(Object)(_position)),RemoteObject.createImmutable(" "),RemoteObject.createImmutable("سکه"))));
 break; }
case 2: {
 BA.debugLineNum = 203;BA.debugLine="lbl_name.Text=\"افزایش\"&\" \"&list_c(1).Get(Positi";
Debug.ShouldStop(1024);
_lbl_name.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("افزایش"),RemoteObject.createImmutable(" "),__ref.getField(false,"_list_c" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, 1)).runMethod(false,"Get",(Object)(_position)),RemoteObject.createImmutable(" کامنت"))));
 BA.debugLineNum = 204;BA.debugLine="lbl_notis.Text=list_c(2).Get(Position)&\" \"&\"سکه";
Debug.ShouldStop(2048);
_lbl_notis.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(__ref.getField(false,"_list_c" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, 2)).runMethod(false,"Get",(Object)(_position)),RemoteObject.createImmutable(" "),RemoteObject.createImmutable("سکه"))));
 break; }
case 3: {
 BA.debugLineNum = 206;BA.debugLine="lbl_name.Text=\"افزایش\"&\" \"&list_v(1).Get(Positi";
Debug.ShouldStop(8192);
_lbl_name.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("افزایش"),RemoteObject.createImmutable(" "),__ref.getField(false,"_list_v" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, 1)).runMethod(false,"Get",(Object)(_position)),RemoteObject.createImmutable(" ویو"))));
 BA.debugLineNum = 207;BA.debugLine="lbl_notis.Text=list_v(2).Get(Position)&\" \"&\"سکه";
Debug.ShouldStop(16384);
_lbl_notis.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(__ref.getField(false,"_list_v" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, 2)).runMethod(false,"Get",(Object)(_position)),RemoteObject.createImmutable(" "),RemoteObject.createImmutable("سکه"))));
 BA.debugLineNum = 209;BA.debugLine="lbl_itemicon.Text=Chr(0xE417)";
Debug.ShouldStop(65536);
_lbl_itemicon.runMethod(true,"setText",BA.ObjectToCharSequence(mt_sef.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xe417)))));
 break; }
case 4: {
 break; }
}
;
 BA.debugLineNum = 214;BA.debugLine="Parent.Height=cards.Top+cards.Height+5%x";
Debug.ShouldStop(2097152);
_parent.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {_cards.runMethod(true,"getTop"),_cards.runMethod(true,"getHeight"),mt_sef.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))}, "++",2, 1));
 BA.debugLineNum = 215;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
		Debug.PushSubsStack("LV_onCreateViewHolder (mt_sef) ","mt_sef",13,__ref.getField(false, "ba"),__ref,123);
if (RapidSub.canDelegate("lv_oncreateviewholder")) { return __ref.runUserSub(false, "mt_sef","lv_oncreateviewholder", __ref, _parent, _viewtype);}
Debug.locals.put("Parent", _parent);
Debug.locals.put("ViewType", _viewtype);
 BA.debugLineNum = 123;BA.debugLine="Sub LV_onCreateViewHolder (Parent As Panel, ViewTy";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 125;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mipost_newcoins(RemoteObject __ref,RemoteObject _newstr) throws Exception{
try {
		Debug.PushSubsStack("mipost_newcoins (mt_sef) ","mt_sef",13,__ref.getField(false, "ba"),__ref,492);
if (RapidSub.canDelegate("mipost_newcoins")) { return __ref.runUserSub(false, "mt_sef","mipost_newcoins", __ref, _newstr);}
Debug.locals.put("newstr", _newstr);
 BA.debugLineNum = 492;BA.debugLine="Sub mipost_newcoins(newstr As String)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 493;BA.debugLine="CallSubDelayed2(obj,Ev & \"_\"&\"newcoins\",newstr)";
Debug.ShouldStop(4096);
mt_sef.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_obj" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_ev" /*RemoteObject*/ ),RemoteObject.createImmutable("_"),RemoteObject.createImmutable("newcoins"))),(Object)((_newstr)));
 BA.debugLineNum = 501;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pr_onjsonobjectuploaderror(RemoteObject __ref,RemoteObject _error,RemoteObject _tag) throws Exception{
try {
		Debug.PushSubsStack("pr_onJSONObjectUploadError (mt_sef) ","mt_sef",13,__ref.getField(false, "ba"),__ref,407);
if (RapidSub.canDelegate("pr_onjsonobjectuploaderror")) { return __ref.runUserSub(false, "mt_sef","pr_onjsonobjectuploaderror", __ref, _error, _tag);}
Debug.locals.put("Error", _error);
Debug.locals.put("Tag", _tag);
 BA.debugLineNum = 407;BA.debugLine="Sub pr_onJSONObjectUploadError(Error As ResponseEr";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 408;BA.debugLine="Log(Error.ErrorLocalizedMsage)";
Debug.ShouldStop(8388608);
mt_sef.__c.runVoidMethod ("LogImpl","616777217",_error.runMethod(true,"getErrorLocalizedMsage"),0);
 BA.debugLineNum = 409;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pr_onjsonobjectuploadok(RemoteObject __ref,RemoteObject _jsonstring,RemoteObject _tag) throws Exception{
try {
		Debug.PushSubsStack("pr_onJSONObjectUploadOK (mt_sef) ","mt_sef",13,__ref.getField(false, "ba"),__ref,391);
if (RapidSub.canDelegate("pr_onjsonobjectuploadok")) { return __ref.runUserSub(false, "mt_sef","pr_onjsonobjectuploadok", __ref, _jsonstring, _tag);}
Debug.locals.put("JsonString", _jsonstring);
Debug.locals.put("Tag", _tag);
 BA.debugLineNum = 391;BA.debugLine="Sub pr_onJSONObjectUploadOK(JsonString As String ,";
Debug.ShouldStop(64);
 BA.debugLineNum = 392;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(128);
mt_sef.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 393;BA.debugLine="If JsonString<>Null Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("N",_jsonstring)) { 
 };
 BA.debugLineNum = 405;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pr_onstringuploaderror(RemoteObject __ref,RemoteObject _error,RemoteObject _tag) throws Exception{
try {
		Debug.PushSubsStack("pr_onStringUploadError (mt_sef) ","mt_sef",13,__ref.getField(false, "ba"),__ref,371);
if (RapidSub.canDelegate("pr_onstringuploaderror")) { return __ref.runUserSub(false, "mt_sef","pr_onstringuploaderror", __ref, _error, _tag);}
Debug.locals.put("Error", _error);
Debug.locals.put("Tag", _tag);
 BA.debugLineNum = 371;BA.debugLine="Sub pr_onStringUploadError(Error As ResponseError";
Debug.ShouldStop(262144);
 BA.debugLineNum = 372;BA.debugLine="Log(Error.ErrorLocalizedMsage)";
Debug.ShouldStop(524288);
mt_sef.__c.runVoidMethod ("LogImpl","616580609",_error.runMethod(true,"getErrorLocalizedMsage"),0);
 BA.debugLineNum = 374;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pr_onstringuploadok(RemoteObject __ref,RemoteObject _response,RemoteObject _tag) throws Exception{
try {
		Debug.PushSubsStack("pr_onStringUploadOK (mt_sef) ","mt_sef",13,__ref.getField(false, "ba"),__ref,376);
if (RapidSub.canDelegate("pr_onstringuploadok")) { return __ref.runUserSub(false, "mt_sef","pr_onstringuploadok", __ref, _response, _tag);}
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _status = RemoteObject.createImmutable("");
Debug.locals.put("response", _response);
Debug.locals.put("Tag", _tag);
 BA.debugLineNum = 376;BA.debugLine="Sub pr_onStringUploadOK(response As String  , Tag";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 377;BA.debugLine="Log(response)";
Debug.ShouldStop(16777216);
mt_sef.__c.runVoidMethod ("LogImpl","616646145",_response,0);
 BA.debugLineNum = 378;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(33554432);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 379;BA.debugLine="parser.Initialize(response)";
Debug.ShouldStop(67108864);
_parser.runVoidMethod ("Initialize",(Object)(_response));
 BA.debugLineNum = 380;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(134217728);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 381;BA.debugLine="Dim status As String = root.Get(\"status\")";
Debug.ShouldStop(268435456);
_status = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("status")))));Debug.locals.put("status", _status);Debug.locals.put("status", _status);
 BA.debugLineNum = 383;BA.debugLine="If  status=\"ok\" Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_status,BA.ObjectToString("ok"))) { 
 BA.debugLineNum = 384;BA.debugLine="reqsef(userid_t,\"1\",username_target,r_nums,\"0\",\"";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (com.it.fome.mt_sef.class, "_reqsef" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_userid_t" /*RemoteObject*/ )),(Object)(BA.ObjectToString("1")),(Object)(__ref.getField(true,"_username_target" /*RemoteObject*/ )),(Object)(BA.NumberToString(__ref.getField(true,"_r_nums" /*RemoteObject*/ ))),(Object)(BA.ObjectToString("0")),(Object)(BA.ObjectToString("0")),(Object)(__ref.runClassMethod (com.it.fome.mt_sef.class, "_getname_img" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_img_address_target" /*RemoteObject*/ )))));
 }else {
 BA.debugLineNum = 387;BA.debugLine="ToastMessageShow(\"خطا\",False)";
Debug.ShouldStop(4);
mt_sef.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("خطا")),(Object)(mt_sef.__c.getField(true,"False")));
 };
 BA.debugLineNum = 389;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pr_onuploadprogress(RemoteObject __ref,RemoteObject _uploaded,RemoteObject _total,RemoteObject _tag) throws Exception{
try {
		Debug.PushSubsStack("pr_onUploadProgress (mt_sef) ","mt_sef",13,__ref.getField(false, "ba"),__ref,411);
if (RapidSub.canDelegate("pr_onuploadprogress")) { return __ref.runUserSub(false, "mt_sef","pr_onuploadprogress", __ref, _uploaded, _total, _tag);}
Debug.locals.put("uploaded", _uploaded);
Debug.locals.put("total", _total);
Debug.locals.put("Tag", _tag);
 BA.debugLineNum = 411;BA.debugLine="Sub pr_onUploadProgress(uploaded As Long,total As";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 412;BA.debugLine="Log((uploaded/total))";
Debug.ShouldStop(134217728);
mt_sef.__c.runVoidMethod ("LogImpl","616842753",BA.NumberToString((RemoteObject.solve(new RemoteObject[] {_uploaded,_total}, "/",0, 0))),0);
 BA.debugLineNum = 413;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("prfn_onPostStringErrorListener (mt_sef) ","mt_sef",13,__ref.getField(false, "ba"),__ref,444);
if (RapidSub.canDelegate("prfn_onpoststringerrorlistener")) { return __ref.runUserSub(false, "mt_sef","prfn_onpoststringerrorlistener", __ref, _error, _tag);}
Debug.locals.put("Error", _error);
Debug.locals.put("Tag", _tag);
 BA.debugLineNum = 444;BA.debugLine="Sub prfn_onPostStringErrorListener(Error As Respon";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 446;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(536870912);
mt_sef.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 447;BA.debugLine="Log(\"errror\")";
Debug.ShouldStop(1073741824);
mt_sef.__c.runVoidMethod ("LogImpl","616973827",RemoteObject.createImmutable("errror"),0);
 BA.debugLineNum = 448;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("prfn_onPostStringOkListener (mt_sef) ","mt_sef",13,__ref.getField(false, "ba"),__ref,450);
if (RapidSub.canDelegate("prfn_onpoststringoklistener")) { return __ref.runUserSub(false, "mt_sef","prfn_onpoststringoklistener", __ref, _result, _tag);}
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colroot = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _c_m = RemoteObject.createImmutable("");
RemoteObject _uid = RemoteObject.createImmutable("");
RemoteObject _first_last = RemoteObject.createImmutable("");
RemoteObject _id = RemoteObject.createImmutable("");
RemoteObject _userid = RemoteObject.createImmutable("");
RemoteObject _username = RemoteObject.createImmutable("");
RemoteObject _c_ch = RemoteObject.createImmutable("");
RemoteObject _mtoasst = RemoteObject.declareNull("com.valdesekamdem.library.mdtoast.MaterialToast");
Debug.locals.put("Tag", _tag);
 BA.debugLineNum = 450;BA.debugLine="Sub prfn_onPostStringOkListener(Result As String";
Debug.ShouldStop(2);
 BA.debugLineNum = 452;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(8);
mt_sef.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 453;BA.debugLine="Log(Result)";
Debug.ShouldStop(16);
mt_sef.__c.runVoidMethod ("LogImpl","617039363",_result,0);
 BA.debugLineNum = 455;BA.debugLine="Select Tag";
Debug.ShouldStop(64);
switch (BA.switchObjectToInt(_tag,BA.ObjectToString("sefss"))) {
case 0: {
 BA.debugLineNum = 457;BA.debugLine="If Result.Contains(\"error_code\")=True Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",_result.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("error_code"))),mt_sef.__c.getField(true,"True"))) { 
 BA.debugLineNum = 458;BA.debugLine="ToastMessageShow(\"ثبت سفارش ناموفق بود :)\",Fal";
Debug.ShouldStop(512);
mt_sef.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("ثبت سفارش ناموفق بود :)")),(Object)(mt_sef.__c.getField(true,"False")));
 }else {
 BA.debugLineNum = 460;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(2048);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 461;BA.debugLine="parser.Initialize(Result)";
Debug.ShouldStop(4096);
_parser.runVoidMethod ("Initialize",(Object)(_result));
 BA.debugLineNum = 462;BA.debugLine="Dim root As List = parser.NextArray";
Debug.ShouldStop(8192);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_root = _parser.runMethod(false,"NextArray");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 463;BA.debugLine="For Each colroot As Map In root";
Debug.ShouldStop(16384);
_colroot = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group11 = _root;
final int groupLen11 = group11.runMethod(true,"getSize").<Integer>get()
;int index11 = 0;
;
for (; index11 < groupLen11;index11++){
_colroot.setObject(group11.runMethod(false,"Get",index11));
Debug.locals.put("colroot", _colroot);
 BA.debugLineNum = 464;BA.debugLine="Dim Result As String = colroot.Get(\"result\")";
Debug.ShouldStop(32768);
_result = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("result")))));Debug.locals.put("Result", _result);Debug.locals.put("Result", _result);
 BA.debugLineNum = 465;BA.debugLine="Dim c_m As String = colroot.Get(\"c_m\")";
Debug.ShouldStop(65536);
_c_m = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("c_m")))));Debug.locals.put("c_m", _c_m);Debug.locals.put("c_m", _c_m);
 BA.debugLineNum = 466;BA.debugLine="Dim uid As String = colroot.Get(\"uid\")";
Debug.ShouldStop(131072);
_uid = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("uid")))));Debug.locals.put("uid", _uid);Debug.locals.put("uid", _uid);
 BA.debugLineNum = 467;BA.debugLine="Dim first_last As String = colroot.Get(\"first";
Debug.ShouldStop(262144);
_first_last = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("first_last")))));Debug.locals.put("first_last", _first_last);Debug.locals.put("first_last", _first_last);
 BA.debugLineNum = 468;BA.debugLine="Dim id As String = colroot.Get(\"id\")";
Debug.ShouldStop(524288);
_id = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 469;BA.debugLine="Dim userid As String = colroot.Get(\"userid\")";
Debug.ShouldStop(1048576);
_userid = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("userid")))));Debug.locals.put("userid", _userid);Debug.locals.put("userid", _userid);
 BA.debugLineNum = 470;BA.debugLine="Dim username As String = colroot.Get(\"usernam";
Debug.ShouldStop(2097152);
_username = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("username")))));Debug.locals.put("username", _username);Debug.locals.put("username", _username);
 BA.debugLineNum = 471;BA.debugLine="Dim c_ch As String = colroot.Get(\"c_ch\")";
Debug.ShouldStop(4194304);
_c_ch = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("c_ch")))));Debug.locals.put("c_ch", _c_ch);Debug.locals.put("c_ch", _c_ch);
 BA.debugLineNum = 473;BA.debugLine="sql1.ExecNonQuery(\"UPDATE tbl_coin set cm='\"&";
Debug.ShouldStop(16777216);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE tbl_coin set cm='"),_c_m,RemoteObject.createImmutable("',cf='"),_c_ch,RemoteObject.createImmutable("' WHERE userid='"),__ref.getField(true,"_userid_t" /*RemoteObject*/ ),RemoteObject.createImmutable("' "))));
 BA.debugLineNum = 475;BA.debugLine="CallSubDelayed2(obj,Ev & \"_\"&\"newcoins\",c_m)";
Debug.ShouldStop(67108864);
mt_sef.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_obj" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_ev" /*RemoteObject*/ ),RemoteObject.createImmutable("_"),RemoteObject.createImmutable("newcoins"))),(Object)((_c_m)));
 }
}Debug.locals.put("colroot", _colroot);
;
 BA.debugLineNum = 481;BA.debugLine="progressDialog.Hide";
Debug.ShouldStop(1);
__ref.getField(false,"_progressdialog" /*RemoteObject*/ ).runVoidMethod ("Hide");
 BA.debugLineNum = 483;BA.debugLine="Dim mtoasst As KJ_MaterialToast";
Debug.ShouldStop(4);
_mtoasst = RemoteObject.createNew ("com.valdesekamdem.library.mdtoast.MaterialToast");Debug.locals.put("mtoasst", _mtoasst);
 BA.debugLineNum = 484;BA.debugLine="mtoasst.Initialize(\"سفارش با موفقیت ثبت شد\",mt";
Debug.ShouldStop(8);
_mtoasst.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("سفارش با موفقیت ثبت شد")),(Object)(_mtoasst.getField(true,"LENGTH_SHORT")),(Object)(_mtoasst.getField(true,"TYPE_SUCCESS")));
 };
 break; }
}
;
 BA.debugLineNum = 490;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _reqsef(RemoteObject __ref,RemoteObject _userid,RemoteObject _types,RemoteObject _chat_ida,RemoteObject _finish,RemoteObject _msg_ida,RemoteObject _njob,RemoteObject _picname) throws Exception{
try {
		Debug.PushSubsStack("reqsef (mt_sef) ","mt_sef",13,__ref.getField(false, "ba"),__ref,415);
if (RapidSub.canDelegate("reqsef")) { return __ref.runUserSub(false, "mt_sef","reqsef", __ref, _userid, _types, _chat_ida, _finish, _msg_ida, _njob, _picname);}
RemoteObject _post = RemoteObject.declareNull("com.reza.sh.fastnet.PostRequestRaper");
Debug.locals.put("userid", _userid);
Debug.locals.put("types", _types);
Debug.locals.put("chat_ida", _chat_ida);
Debug.locals.put("finish", _finish);
Debug.locals.put("msg_ida", _msg_ida);
Debug.locals.put("njob", _njob);
Debug.locals.put("picname", _picname);
 BA.debugLineNum = 415;BA.debugLine="Sub reqsef(userid As String,types As String,chat_i";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 418;BA.debugLine="prfn.initialize(\"prfn\")";
Debug.ShouldStop(2);
__ref.getField(false,"_prfn" /*RemoteObject*/ ).runVoidMethod ("initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("prfn")));
 BA.debugLineNum = 419;BA.debugLine="Dim post As PostRequest";
Debug.ShouldStop(4);
_post = RemoteObject.createNew ("com.reza.sh.fastnet.PostRequestRaper");Debug.locals.put("post", _post);
 BA.debugLineNum = 420;BA.debugLine="post=prfn.BuildPostQuery(\"http://filework.ir/INST";
Debug.ShouldStop(8);
_post = __ref.getField(false,"_prfn" /*RemoteObject*/ ).runMethod(false,"BuildPostQuery",(Object)(BA.ObjectToString("http://filework.ir/INSTAFOLLOW/api/req.php")),(Object)(RemoteObject.createImmutable("sefss")));Debug.locals.put("post", _post);
 BA.debugLineNum = 422;BA.debugLine="post.addHeder(\"User-Agent\",\"Dalvik/1.6.0 (Linux;";
Debug.ShouldStop(32);
_post.runVoidMethod ("addHeder",(Object)(BA.ObjectToString("User-Agent")),(Object)(RemoteObject.createImmutable("Dalvik/1.6.0 (Linux; U; Android 4.4.4; SM-A700FD Build/KTU84P)")));
 BA.debugLineNum = 423;BA.debugLine="post.addParametrs(\"req\",\"t_sef\")";
Debug.ShouldStop(64);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("req")),(Object)(RemoteObject.createImmutable("t_sef")));
 BA.debugLineNum = 425;BA.debugLine="post.addParametrs(\"uid\",\"1\")";
Debug.ShouldStop(256);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("uid")),(Object)(RemoteObject.createImmutable("1")));
 BA.debugLineNum = 426;BA.debugLine="post.addParametrs(\"types\",types)";
Debug.ShouldStop(512);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("types")),(Object)(_types));
 BA.debugLineNum = 427;BA.debugLine="post.addParametrs(\"userid\",userid)";
Debug.ShouldStop(1024);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("userid")),(Object)(_userid));
 BA.debugLineNum = 428;BA.debugLine="post.addParametrs(\"chat_id\",chat_ida)";
Debug.ShouldStop(2048);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("chat_id")),(Object)(_chat_ida));
 BA.debugLineNum = 429;BA.debugLine="post.addParametrs(\"finish\",finish)";
Debug.ShouldStop(4096);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("finish")),(Object)(_finish));
 BA.debugLineNum = 430;BA.debugLine="post.addParametrs(\"msg_id\",msg_ida)";
Debug.ShouldStop(8192);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("msg_id")),(Object)(_msg_ida));
 BA.debugLineNum = 431;BA.debugLine="post.addParametrs(\"njob\",njob)";
Debug.ShouldStop(16384);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("njob")),(Object)(_njob));
 BA.debugLineNum = 433;BA.debugLine="post.addParametrs(\"pic\",\"http://filework.ir/INSTA";
Debug.ShouldStop(65536);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("pic")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://filework.ir/INSTAFOLLOW/api/telepic/"),_picname)));
 BA.debugLineNum = 437;BA.debugLine="post.executRequestAsString";
Debug.ShouldStop(1048576);
_post.runVoidMethod ("executRequestAsString");
 BA.debugLineNum = 442;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _upload(RemoteObject __ref,RemoteObject _filename,RemoteObject _emailn,RemoteObject _namen,RemoteObject _familyn) throws Exception{
try {
		Debug.PushSubsStack("upload (mt_sef) ","mt_sef",13,__ref.getField(false, "ba"),__ref,360);
if (RapidSub.canDelegate("upload")) { return __ref.runUserSub(false, "mt_sef","upload", __ref, _filename, _emailn, _namen, _familyn);}
Debug.locals.put("filename", _filename);
Debug.locals.put("emailn", _emailn);
Debug.locals.put("namen", _namen);
Debug.locals.put("familyn", _familyn);
 BA.debugLineNum = 360;BA.debugLine="Sub upload(filename As String,emailn As String,nam";
Debug.ShouldStop(128);
 BA.debugLineNum = 361;BA.debugLine="upl=pr.BuildUploadQuery(\"http://filework.ir/INSTA";
Debug.ShouldStop(256);
__ref.setField ("_upl" /*RemoteObject*/ ,__ref.getField(false,"_pr" /*RemoteObject*/ ).runMethod(false,"BuildUploadQuery",(Object)(BA.ObjectToString("http://filework.ir/INSTAFOLLOW/api/upload.php")),(Object)(RemoteObject.createImmutable("t2"))));
 BA.debugLineNum = 365;BA.debugLine="File.Copy(\"\",filename,File.DirRootExternal,\"new.p";
Debug.ShouldStop(4096);
mt_sef.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(BA.ObjectToString("")),(Object)(_filename),(Object)(mt_sef.__c.getField(false,"File").runMethod(true,"getDirRootExternal")),(Object)(RemoteObject.createImmutable("new.png")));
 BA.debugLineNum = 366;BA.debugLine="Log(File.DirRootExternal)";
Debug.ShouldStop(8192);
mt_sef.__c.runVoidMethod ("LogImpl","616515078",mt_sef.__c.getField(false,"File").runMethod(true,"getDirRootExternal"),0);
 BA.debugLineNum = 367;BA.debugLine="upl.addMultipartFile(\"uploaded_file\",filename)";
Debug.ShouldStop(16384);
__ref.getField(false,"_upl" /*RemoteObject*/ ).runVoidMethod ("addMultipartFile",(Object)(BA.ObjectToString("uploaded_file")),(Object)(_filename));
 BA.debugLineNum = 368;BA.debugLine="upl.startUploadAsString";
Debug.ShouldStop(32768);
__ref.getField(false,"_upl" /*RemoteObject*/ ).runVoidMethod ("startUploadAsString");
 BA.debugLineNum = 369;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}