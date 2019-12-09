package com.it.fome;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class mi_shop_subs_0 {


public static RemoteObject  _addpnl(RemoteObject __ref,RemoteObject _pnl) throws Exception{
try {
		Debug.PushSubsStack("addpnl (mi_shop) ","mi_shop",4,__ref.getField(false, "ba"),__ref,104);
if (RapidSub.canDelegate("addpnl")) { return __ref.runUserSub(false, "mi_shop","addpnl", __ref, _pnl);}
Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 104;BA.debugLine="Sub addpnl(pnl As Panel) As View";
Debug.ShouldStop(128);
 BA.debugLineNum = 109;BA.debugLine="pnl_ulv.Initialize(\"\")";
Debug.ShouldStop(4096);
__ref.getField(false,"_pnl_ulv" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 110;BA.debugLine="pnl.AddView(pnl_ulv,0,0,pnl.Width,pnl.Height)";
Debug.ShouldStop(8192);
_pnl.runVoidMethod ("AddView",(Object)((__ref.getField(false,"_pnl_ulv" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_pnl.runMethod(true,"getWidth")),(Object)(_pnl.runMethod(true,"getHeight")));
 BA.debugLineNum = 112;BA.debugLine="LV.Initializer(\"LV\").ListView.Build";
Debug.ShouldStop(32768);
__ref.getField(false,"_lv" /*RemoteObject*/ ).runMethod(false,"Initializer",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("LV"))).runMethod(false,"ListView").runVoidMethod ("Build");
 BA.debugLineNum = 113;BA.debugLine="pnl_ulv.AddView(LV,2%x,0,pnl_ulv.Width-4%x,pnl_ul";
Debug.ShouldStop(65536);
__ref.getField(false,"_pnl_ulv" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_lv" /*RemoteObject*/ ).getObject())),(Object)(mi_shop.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),__ref.getField(false, "ba"))),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_pnl_ulv" /*RemoteObject*/ ).runMethod(true,"getWidth"),mi_shop.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 4)),__ref.getField(false, "ba"))}, "-",1, 1)),(Object)(__ref.getField(false,"_pnl_ulv" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 114;BA.debugLine="LV.CardView.CardElevation(4dip).Radius(2dip)";
Debug.ShouldStop(131072);
__ref.getField(false,"_lv" /*RemoteObject*/ ).runMethod(false,"CardView").runMethod(false,"CardElevation",(Object)(BA.numberCast(float.class, mi_shop.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4)))))).runVoidMethod ("Radius",(Object)(BA.numberCast(float.class, mi_shop.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2))))));
 BA.debugLineNum = 115;BA.debugLine="LV.Divider.Add1(Colors.Transparent,5%x)";
Debug.ShouldStop(262144);
__ref.getField(false,"_lv" /*RemoteObject*/ ).runMethod(false,"Divider").runVoidMethod ("Add1",(Object)(mi_shop.__c.getField(false,"Colors").getField(true,"Transparent")),(Object)(mi_shop.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 116;BA.debugLine="LV.Show";
Debug.ShouldStop(524288);
__ref.getField(false,"_lv" /*RemoteObject*/ ).runVoidMethodAndSync ("Show");
 BA.debugLineNum = 118;BA.debugLine="req_getme(\"\")";
Debug.ShouldStop(2097152);
__ref.runClassMethod (com.it.fome.mi_shop.class, "_req_getme" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 123;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btn_pay_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btn_pay_Click (mi_shop) ","mi_shop",4,__ref.getField(false, "ba"),__ref,343);
if (RapidSub.canDelegate("btn_pay_click")) { return __ref.runUserSub(false, "mi_shop","btn_pay_click", __ref);}
RemoteObject _b = RemoteObject.declareNull("de.amberhome.objects.appcompat.ACButtonWrapper");
 BA.debugLineNum = 343;BA.debugLine="Sub btn_pay_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 344;BA.debugLine="Dim b As ACButton";
Debug.ShouldStop(8388608);
_b = RemoteObject.createNew ("de.amberhome.objects.appcompat.ACButtonWrapper");Debug.locals.put("b", _b);
 BA.debugLineNum = 345;BA.debugLine="b=Sender";
Debug.ShouldStop(16777216);
_b.setObject(mi_shop.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));
 BA.debugLineNum = 348;BA.debugLine="Select type_history";
Debug.ShouldStop(134217728);
switch (BA.switchObjectToInt(__ref.getField(true,"_type_history" /*RemoteObject*/ ),BA.numberCast(int.class, 0),BA.numberCast(int.class, 1))) {
case 0: {
 BA.debugLineNum = 351;BA.debugLine="numc=l_insta(8).Get(b.Tag)";
Debug.ShouldStop(1073741824);
__ref.setField ("_numc" /*RemoteObject*/ ,BA.numberCast(int.class, __ref.getField(false,"_l_insta" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, 8)).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _b.runMethod(false,"getTag"))))));
 BA.debugLineNum = 352;BA.debugLine="mNivadBilling.purchase(l_insta(7).Get(b.Tag),Nu";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_mnivadbilling" /*RemoteObject*/ ).runVoidMethod ("purchase",(Object)(BA.ObjectToString(__ref.getField(false,"_l_insta" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, 7)).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _b.runMethod(false,"getTag")))))),(Object)(BA.ObjectToString(mi_shop.__c.getField(false,"Null"))));
 break; }
case 1: {
 BA.debugLineNum = 357;BA.debugLine="numc=l_insta(8).Get(b.Tag)";
Debug.ShouldStop(16);
__ref.setField ("_numc" /*RemoteObject*/ ,BA.numberCast(int.class, __ref.getField(false,"_l_insta" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, 8)).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _b.runMethod(false,"getTag"))))));
 BA.debugLineNum = 358;BA.debugLine="mNivadBilling.purchase(l_insta(7).Get(b.Tag),Nu";
Debug.ShouldStop(32);
__ref.getField(false,"_mnivadbilling" /*RemoteObject*/ ).runVoidMethod ("purchase",(Object)(BA.ObjectToString(__ref.getField(false,"_l_insta" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, 7)).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _b.runMethod(false,"getTag")))))),(Object)(BA.ObjectToString(mi_shop.__c.getField(false,"Null"))));
 break; }
}
;
 BA.debugLineNum = 363;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnf_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnf_Click (mi_shop) ","mi_shop",4,__ref.getField(false, "ba"),__ref,309);
if (RapidSub.canDelegate("btnf_click")) { return __ref.runUserSub(false, "mi_shop","btnf_click", __ref);}
 BA.debugLineNum = 309;BA.debugLine="Sub btnf_Click";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 316;BA.debugLine="If l_insta(1).Size=0 Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_l_insta" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, 1)).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 318;BA.debugLine="ToastMessageShow(\"در حال حاضر لیستی جهت خرید موج";
Debug.ShouldStop(536870912);
mi_shop.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("در حال حاضر لیستی جهت خرید موجود نمیباشد")),(Object)(mi_shop.__c.getField(true,"False")));
 BA.debugLineNum = 319;BA.debugLine="Return True";
Debug.ShouldStop(1073741824);
if (true) return BA.ObjectToString(mi_shop.__c.getField(true,"True"));
 };
 BA.debugLineNum = 322;BA.debugLine="ty=1";
Debug.ShouldStop(2);
__ref.setField ("_ty" /*RemoteObject*/ ,BA.numberCast(int.class, 1));
 BA.debugLineNum = 323;BA.debugLine="LV.notifyDataSetChanged";
Debug.ShouldStop(4);
__ref.getField(false,"_lv" /*RemoteObject*/ ).runVoidMethodAndSync ("notifyDataSetChanged");
 BA.debugLineNum = 324;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnm_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnm_Click (mi_shop) ","mi_shop",4,__ref.getField(false, "ba"),__ref,326);
if (RapidSub.canDelegate("btnm_click")) { return __ref.runUserSub(false, "mi_shop","btnm_click", __ref);}
 BA.debugLineNum = 326;BA.debugLine="Sub btnm_Click";
Debug.ShouldStop(32);
 BA.debugLineNum = 332;BA.debugLine="If l_insta(4).Size=0 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_l_insta" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, 4)).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 334;BA.debugLine="ToastMessageShow(\"در حال حاضر لیستی جهت خرید موج";
Debug.ShouldStop(8192);
mi_shop.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("در حال حاضر لیستی جهت خرید موجود نمیباشد")),(Object)(mi_shop.__c.getField(true,"False")));
 BA.debugLineNum = 335;BA.debugLine="Return True";
Debug.ShouldStop(16384);
if (true) return BA.ObjectToString(mi_shop.__c.getField(true,"True"));
 };
 BA.debugLineNum = 338;BA.debugLine="ty=2";
Debug.ShouldStop(131072);
__ref.setField ("_ty" /*RemoteObject*/ ,BA.numberCast(int.class, 2));
 BA.debugLineNum = 339;BA.debugLine="LV.notifyDataSetChanged";
Debug.ShouldStop(262144);
__ref.getField(false,"_lv" /*RemoteObject*/ ).runVoidMethodAndSync ("notifyDataSetChanged");
 BA.debugLineNum = 340;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
mi_shop._ev = RemoteObject.createImmutable("");__ref.setField("_ev",mi_shop._ev);
 //BA.debugLineNum = 3;BA.debugLine="Private obj As Object";
mi_shop._obj = RemoteObject.createNew ("Object");__ref.setField("_obj",mi_shop._obj);
 //BA.debugLineNum = 4;BA.debugLine="Dim sql1 As SQL";
mi_shop._sql1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL");__ref.setField("_sql1",mi_shop._sql1);
 //BA.debugLineNum = 5;BA.debugLine="Dim cursor1 As Cursor";
mi_shop._cursor1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");__ref.setField("_cursor1",mi_shop._cursor1);
 //BA.debugLineNum = 6;BA.debugLine="Dim pnl_insta As Panel";
mi_shop._pnl_insta = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnl_insta",mi_shop._pnl_insta);
 //BA.debugLineNum = 7;BA.debugLine="Dim LV As Hitex_LayoutView";
mi_shop._lv = RemoteObject.createNew ("wir.hitex.recycler.Hitex_LayoutView");__ref.setField("_lv",mi_shop._lv);
 //BA.debugLineNum = 8;BA.debugLine="Dim Glide As Hitex_Glide";
mi_shop._glide = RemoteObject.createNew ("com.hitex_glide.Hitex_Glide");__ref.setField("_glide",mi_shop._glide);
 //BA.debugLineNum = 9;BA.debugLine="Dim prfn As PersianFastNetwork";
mi_shop._prfn = RemoteObject.createNew ("com.reza.sh.fastnet.Fastnet");__ref.setField("_prfn",mi_shop._prfn);
 //BA.debugLineNum = 10;BA.debugLine="Dim i_username ,i_pk,i_cookie,i_pic As String";
mi_shop._i_username = RemoteObject.createImmutable("");__ref.setField("_i_username",mi_shop._i_username);
mi_shop._i_pk = RemoteObject.createImmutable("");__ref.setField("_i_pk",mi_shop._i_pk);
mi_shop._i_cookie = RemoteObject.createImmutable("");__ref.setField("_i_cookie",mi_shop._i_cookie);
mi_shop._i_pic = RemoteObject.createImmutable("");__ref.setField("_i_pic",mi_shop._i_pic);
 //BA.debugLineNum = 11;BA.debugLine="Dim l_insta(40) As List";
mi_shop._l_insta = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.collections.List", new int[] {40}, new Object[]{});__ref.setField("_l_insta",mi_shop._l_insta);
 //BA.debugLineNum = 12;BA.debugLine="Private xml As XmlLayoutBuilder";
mi_shop._xml = RemoteObject.createNew ("anywheresoftware.b4a.object.XmlLayoutBuilder");__ref.setField("_xml",mi_shop._xml);
 //BA.debugLineNum = 14;BA.debugLine="Private img1,img2 As ImageView";
mi_shop._img1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");__ref.setField("_img1",mi_shop._img1);
mi_shop._img2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");__ref.setField("_img2",mi_shop._img2);
 //BA.debugLineNum = 15;BA.debugLine="Private lbluser As Label";
mi_shop._lbluser = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbluser",mi_shop._lbluser);
 //BA.debugLineNum = 16;BA.debugLine="Private typefc=Typeface.LoadFromAssets(\"iran_sans";
mi_shop._typefc = RemoteObject.createNew ("anywheresoftware.b4a.keywords.constants.TypefaceWrapper");
mi_shop._typefc.setObject(mi_shop.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("iran_sans.ttf"))));__ref.setField("_typefc",mi_shop._typefc);
 //BA.debugLineNum = 17;BA.debugLine="Private pln1,pnl2 As Panel";
mi_shop._pln1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pln1",mi_shop._pln1);
mi_shop._pnl2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnl2",mi_shop._pnl2);
 //BA.debugLineNum = 18;BA.debugLine="Private imgf,imgm As ImageView";
mi_shop._imgf = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");__ref.setField("_imgf",mi_shop._imgf);
mi_shop._imgm = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");__ref.setField("_imgm",mi_shop._imgm);
 //BA.debugLineNum = 19;BA.debugLine="Private lblf,lblm,lblnf,lblnm As Label";
mi_shop._lblf = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblf",mi_shop._lblf);
mi_shop._lblm = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblm",mi_shop._lblm);
mi_shop._lblnf = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblnf",mi_shop._lblnf);
mi_shop._lblnm = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblnm",mi_shop._lblnm);
 //BA.debugLineNum = 20;BA.debugLine="Private btnf,btnm As ACButton";
mi_shop._btnf = RemoteObject.createNew ("de.amberhome.objects.appcompat.ACButtonWrapper");__ref.setField("_btnf",mi_shop._btnf);
mi_shop._btnm = RemoteObject.createNew ("de.amberhome.objects.appcompat.ACButtonWrapper");__ref.setField("_btnm",mi_shop._btnm);
 //BA.debugLineNum = 21;BA.debugLine="Private lbtf,lbtm As Label";
mi_shop._lbtf = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbtf",mi_shop._lbtf);
mi_shop._lbtm = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbtm",mi_shop._lbtm);
 //BA.debugLineNum = 22;BA.debugLine="Private pnldv1,pnldv2 As Panel";
mi_shop._pnldv1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnldv1",mi_shop._pnldv1);
mi_shop._pnldv2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnldv2",mi_shop._pnldv2);
 //BA.debugLineNum = 23;BA.debugLine="Private pnl_ulv As Panel";
mi_shop._pnl_ulv = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnl_ulv",mi_shop._pnl_ulv);
 //BA.debugLineNum = 24;BA.debugLine="Private LV As Hitex_LayoutView";
mi_shop._lv = RemoteObject.createNew ("wir.hitex.recycler.Hitex_LayoutView");__ref.setField("_lv",mi_shop._lv);
 //BA.debugLineNum = 25;BA.debugLine="Private Glide As Hitex_Glide";
mi_shop._glide = RemoteObject.createNew ("com.hitex_glide.Hitex_Glide");__ref.setField("_glide",mi_shop._glide);
 //BA.debugLineNum = 27;BA.debugLine="Private pay1,pay2 As Int";
mi_shop._pay1 = RemoteObject.createImmutable(0);__ref.setField("_pay1",mi_shop._pay1);
mi_shop._pay2 = RemoteObject.createImmutable(0);__ref.setField("_pay2",mi_shop._pay2);
 //BA.debugLineNum = 28;BA.debugLine="Private ty=0 As Int";
mi_shop._ty = BA.numberCast(int.class, 0);__ref.setField("_ty",mi_shop._ty);
 //BA.debugLineNum = 29;BA.debugLine="Private cm,cf As String";
mi_shop._cm = RemoteObject.createImmutable("");__ref.setField("_cm",mi_shop._cm);
mi_shop._cf = RemoteObject.createImmutable("");__ref.setField("_cf",mi_shop._cf);
 //BA.debugLineNum = 30;BA.debugLine="Private mNivadBilling As BillingProcessor";
mi_shop._mnivadbilling = RemoteObject.createNew ("io.nivad.billing.b4a.BillingProcessorWrapper");__ref.setField("_mnivadbilling",mi_shop._mnivadbilling);
 //BA.debugLineNum = 31;BA.debugLine="Private numc As Int";
mi_shop._numc = RemoteObject.createImmutable(0);__ref.setField("_numc",mi_shop._numc);
 //BA.debugLineNum = 32;BA.debugLine="Dim type_history As Int";
mi_shop._type_history = RemoteObject.createImmutable(0);__ref.setField("_type_history",mi_shop._type_history);
 //BA.debugLineNum = 33;BA.debugLine="Private username_t ,userid_t As String";
mi_shop._username_t = RemoteObject.createImmutable("");__ref.setField("_username_t",mi_shop._username_t);
mi_shop._userid_t = RemoteObject.createImmutable("");__ref.setField("_userid_t",mi_shop._userid_t);
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _eventname,RemoteObject _module) throws Exception{
try {
		Debug.PushSubsStack("Initialize (mi_shop) ","mi_shop",4,__ref.getField(false, "ba"),__ref,38);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "mi_shop","initialize", __ref, _ba, _eventname, _module);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
int _ia = 0;
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _bazaarrsakey = RemoteObject.createImmutable("");
RemoteObject _nivadapplicationid = RemoteObject.createImmutable("");
RemoteObject _nivadbillingsecret = RemoteObject.createImmutable("");
Debug.locals.put("ba", _ba);
Debug.locals.put("EventName", _eventname);
Debug.locals.put("Module", _module);
 BA.debugLineNum = 38;BA.debugLine="Public Sub Initialize(EventName As String,Module A";
Debug.ShouldStop(32);
 BA.debugLineNum = 39;BA.debugLine="Ev = EventName";
Debug.ShouldStop(64);
__ref.setField ("_ev" /*RemoteObject*/ ,_eventname);
 BA.debugLineNum = 40;BA.debugLine="obj = Module";
Debug.ShouldStop(128);
__ref.setField ("_obj" /*RemoteObject*/ ,_module);
 BA.debugLineNum = 43;BA.debugLine="For ia=0 To 38";
Debug.ShouldStop(1024);
{
final int step3 = 1;
final int limit3 = 38;
_ia = 0 ;
for (;(step3 > 0 && _ia <= limit3) || (step3 < 0 && _ia >= limit3) ;_ia = ((int)(0 + _ia + step3))  ) {
Debug.locals.put("ia", _ia);
 BA.debugLineNum = 45;BA.debugLine="l_insta(ia).Initialize";
Debug.ShouldStop(4096);
__ref.getField(false,"_l_insta" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, _ia)).runVoidMethod ("Initialize");
 }
}Debug.locals.put("ia", _ia);
;
 BA.debugLineNum = 51;BA.debugLine="If File.Exists(File.DirInternal,\"instadb.db\")=Fal";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",mi_shop.__c.getField(false,"File").runMethod(true,"Exists",(Object)(mi_shop.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("instadb.db"))),mi_shop.__c.getField(true,"False"))) { 
 BA.debugLineNum = 52;BA.debugLine="File.Copy(File.DirAssets,\"instadb.db\",File.DirIn";
Debug.ShouldStop(524288);
mi_shop.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(mi_shop.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("instadb.db")),(Object)(mi_shop.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("instadb.db")));
 };
 BA.debugLineNum = 54;BA.debugLine="If sql1.IsInitialized=False Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),mi_shop.__c.getField(true,"False"))) { 
 BA.debugLineNum = 55;BA.debugLine="sql1.Initialize(File.DirInternal,\"instadb.db\",Fa";
Debug.ShouldStop(4194304);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(mi_shop.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("instadb.db")),(Object)(mi_shop.__c.getField(true,"False")));
 };
 BA.debugLineNum = 59;BA.debugLine="cursor1 = sql1.ExecQuery(\"SELECT * FROM tbl_acc W";
Debug.ShouldStop(67108864);
__ref.getField(false,"_cursor1" /*RemoteObject*/ ).setObject (__ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT * FROM tbl_acc WHERE soich='1' "))));
 BA.debugLineNum = 60;BA.debugLine="Dim i As Int";
Debug.ShouldStop(134217728);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 61;BA.debugLine="For i=0 To cursor1.RowCount-1";
Debug.ShouldStop(268435456);
{
final int step14 = 1;
final int limit14 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cursor1" /*RemoteObject*/ ).runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step14 > 0 && _i.<Integer>get().intValue() <= limit14) || (step14 < 0 && _i.<Integer>get().intValue() >= limit14) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step14))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 62;BA.debugLine="cursor1.Position=i";
Debug.ShouldStop(536870912);
__ref.getField(false,"_cursor1" /*RemoteObject*/ ).runMethod(true,"setPosition",_i);
 BA.debugLineNum = 63;BA.debugLine="i_cookie=cursor1.GetString(\"cookie\")";
Debug.ShouldStop(1073741824);
__ref.setField ("_i_cookie" /*RemoteObject*/ ,__ref.getField(false,"_cursor1" /*RemoteObject*/ ).runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("cookie"))));
 BA.debugLineNum = 64;BA.debugLine="i_username=cursor1.GetString(\"username\")";
Debug.ShouldStop(-2147483648);
__ref.setField ("_i_username" /*RemoteObject*/ ,__ref.getField(false,"_cursor1" /*RemoteObject*/ ).runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("username"))));
 BA.debugLineNum = 65;BA.debugLine="i_pk=cursor1.GetString(\"pk\")";
Debug.ShouldStop(1);
__ref.setField ("_i_pk" /*RemoteObject*/ ,__ref.getField(false,"_cursor1" /*RemoteObject*/ ).runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("pk"))));
 BA.debugLineNum = 66;BA.debugLine="i_pic=cursor1.GetString(\"profile_pic_url\")";
Debug.ShouldStop(2);
__ref.setField ("_i_pic" /*RemoteObject*/ ,__ref.getField(false,"_cursor1" /*RemoteObject*/ ).runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("profile_pic_url"))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 68;BA.debugLine="Log(i_pic)";
Debug.ShouldStop(8);
mi_shop.__c.runVoidMethod ("LogImpl","64522014",__ref.getField(true,"_i_pic" /*RemoteObject*/ ),0);
 BA.debugLineNum = 70;BA.debugLine="cursor1 = sql1.ExecQuery(\"SELECT * FROM tbl_tele";
Debug.ShouldStop(32);
__ref.getField(false,"_cursor1" /*RemoteObject*/ ).setObject (__ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT * FROM tbl_tele WHERE soich='1'"))));
 BA.debugLineNum = 71;BA.debugLine="Dim i As Int";
Debug.ShouldStop(64);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 72;BA.debugLine="For i=0 To cursor1.RowCount-1";
Debug.ShouldStop(128);
{
final int step24 = 1;
final int limit24 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cursor1" /*RemoteObject*/ ).runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step24 > 0 && _i.<Integer>get().intValue() <= limit24) || (step24 < 0 && _i.<Integer>get().intValue() >= limit24) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step24))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 73;BA.debugLine="cursor1.Position=i";
Debug.ShouldStop(256);
__ref.getField(false,"_cursor1" /*RemoteObject*/ ).runMethod(true,"setPosition",_i);
 BA.debugLineNum = 74;BA.debugLine="userid_t=cursor1.GetString(\"userid\")";
Debug.ShouldStop(512);
__ref.setField ("_userid_t" /*RemoteObject*/ ,__ref.getField(false,"_cursor1" /*RemoteObject*/ ).runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("userid"))));
 BA.debugLineNum = 75;BA.debugLine="username_t=cursor1.GetString(\"username\")";
Debug.ShouldStop(1024);
__ref.setField ("_username_t" /*RemoteObject*/ ,__ref.getField(false,"_cursor1" /*RemoteObject*/ ).runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("username"))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 77;BA.debugLine="cursor1.Close";
Debug.ShouldStop(4096);
__ref.getField(false,"_cursor1" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 79;BA.debugLine="pay1=50";
Debug.ShouldStop(16384);
__ref.setField ("_pay1" /*RemoteObject*/ ,BA.numberCast(int.class, 50));
 BA.debugLineNum = 80;BA.debugLine="pay2=1000";
Debug.ShouldStop(32768);
__ref.setField ("_pay2" /*RemoteObject*/ ,BA.numberCast(int.class, 1000));
 BA.debugLineNum = 82;BA.debugLine="cursor1 = sql1.ExecQuery(\"SELECT * FROM tbl_coin";
Debug.ShouldStop(131072);
__ref.getField(false,"_cursor1" /*RemoteObject*/ ).setObject (__ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM tbl_coin WHERE userid='"),__ref.getField(true,"_i_pk" /*RemoteObject*/ ),RemoteObject.createImmutable("' ")))));
 BA.debugLineNum = 83;BA.debugLine="Dim i As Int";
Debug.ShouldStop(262144);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 84;BA.debugLine="For i=0 To cursor1.RowCount-1";
Debug.ShouldStop(524288);
{
final int step34 = 1;
final int limit34 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cursor1" /*RemoteObject*/ ).runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step34 > 0 && _i.<Integer>get().intValue() <= limit34) || (step34 < 0 && _i.<Integer>get().intValue() >= limit34) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step34))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 85;BA.debugLine="cursor1.Position=i";
Debug.ShouldStop(1048576);
__ref.getField(false,"_cursor1" /*RemoteObject*/ ).runMethod(true,"setPosition",_i);
 BA.debugLineNum = 86;BA.debugLine="cm=cursor1.GetString(\"cm\")";
Debug.ShouldStop(2097152);
__ref.setField ("_cm" /*RemoteObject*/ ,__ref.getField(false,"_cursor1" /*RemoteObject*/ ).runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("cm"))));
 BA.debugLineNum = 87;BA.debugLine="cf=cursor1.GetString(\"cf\")";
Debug.ShouldStop(4194304);
__ref.setField ("_cf" /*RemoteObject*/ ,__ref.getField(false,"_cursor1" /*RemoteObject*/ ).runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("cf"))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 90;BA.debugLine="Dim bazaarRSAKey As String";
Debug.ShouldStop(33554432);
_bazaarrsakey = RemoteObject.createImmutable("");Debug.locals.put("bazaarRSAKey", _bazaarrsakey);
 BA.debugLineNum = 91;BA.debugLine="Dim nivadApplicationID As String";
Debug.ShouldStop(67108864);
_nivadapplicationid = RemoteObject.createImmutable("");Debug.locals.put("nivadApplicationID", _nivadapplicationid);
 BA.debugLineNum = 92;BA.debugLine="Dim nivadBillingSecret As String";
Debug.ShouldStop(134217728);
_nivadbillingsecret = RemoteObject.createImmutable("");Debug.locals.put("nivadBillingSecret", _nivadbillingsecret);
 BA.debugLineNum = 94;BA.debugLine="bazaarRSAKey = \"MIHNMA0GCSqGSIb3DQEBAQUAA4G7ADCBt";
Debug.ShouldStop(536870912);
_bazaarrsakey = BA.ObjectToString("MIHNMA0GCSqGSIb3DQEBAQUAA4G7ADCBtwKBrwDpILXW5YROn8aS7zjkX20eTq841CSXg/6+rHGljI8i2LOZ6j+lB7J1ePVHqhvd9tgfnHTjdMNma2fgvAtxMwDuJM3x96mHLS/ryQTNLZoBpN6pjpPa72UjUyXKH1dfSeXuJjhNtXGH6CXrAVG4v6iS8nbzyxJKAqTLyNs0KcDa6Lx/oYDdJaA9GDwgjLMSmwJSyLA76nMJRsxsZmnmwpDp+ehQwCSSKXEYf40GrDECAwEAAQ==");Debug.locals.put("bazaarRSAKey", _bazaarrsakey);
 BA.debugLineNum = 95;BA.debugLine="nivadApplicationID = \"4a220906-839f-477a-9740-ab9";
Debug.ShouldStop(1073741824);
_nivadapplicationid = BA.ObjectToString("4a220906-839f-477a-9740-ab9287f96909");Debug.locals.put("nivadApplicationID", _nivadapplicationid);
 BA.debugLineNum = 96;BA.debugLine="nivadBillingSecret = \"sdL43cUCx9JYKS3p9HLCbT9Hmd4";
Debug.ShouldStop(-2147483648);
_nivadbillingsecret = BA.ObjectToString("sdL43cUCx9JYKS3p9HLCbT9Hmd4TaN7CMnV4QrAscf5JUf4YD2kIKwJz6wgNrAbk");Debug.locals.put("nivadBillingSecret", _nivadbillingsecret);
 BA.debugLineNum = 98;BA.debugLine="mNivadBilling.initialize(bazaarRSAKey, nivadAppli";
Debug.ShouldStop(2);
__ref.getField(false,"_mnivadbilling" /*RemoteObject*/ ).runVoidMethod ("initialize",__ref.getField(false, "ba"),(Object)(_bazaarrsakey),(Object)(_nivadapplicationid),(Object)(_nivadbillingsecret));
 BA.debugLineNum = 101;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _insta_user_followdone(RemoteObject __ref,RemoteObject _response,RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("insta_user_FollowDone (mi_shop) ","mi_shop",4,__ref.getField(false, "ba"),__ref,125);
if (RapidSub.canDelegate("insta_user_followdone")) { return __ref.runUserSub(false, "mi_shop","insta_user_followdone", __ref, _response, _job);}
Debug.locals.put("response", _response);
Debug.locals.put("job", _job);
 BA.debugLineNum = 125;BA.debugLine="Sub insta_user_FollowDone(response As String,job A";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 126;BA.debugLine="Log(job)";
Debug.ShouldStop(536870912);
mi_shop.__c.runVoidMethod ("LogImpl","64653057",BA.ObjectToString(_job),0);
 BA.debugLineNum = 127;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
		Debug.PushSubsStack("LV_GetItemCount (mi_shop) ","mi_shop",4,__ref.getField(false, "ba"),__ref,171);
if (RapidSub.canDelegate("lv_getitemcount")) { return __ref.runUserSub(false, "mi_shop","lv_getitemcount", __ref);}
 BA.debugLineNum = 171;BA.debugLine="Sub LV_GetItemCount As Int 								        '$ Item";
Debug.ShouldStop(1024);
 BA.debugLineNum = 172;BA.debugLine="Select ty";
Debug.ShouldStop(2048);
switch (BA.switchObjectToInt(__ref.getField(true,"_ty" /*RemoteObject*/ ),BA.numberCast(int.class, 1),BA.numberCast(int.class, 2))) {
case 0: {
 BA.debugLineNum = 175;BA.debugLine="Return l_insta(1).Size";
Debug.ShouldStop(16384);
if (true) return __ref.getField(false,"_l_insta" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, 1)).runMethod(true,"getSize");
 break; }
case 1: {
 BA.debugLineNum = 177;BA.debugLine="Return l_insta(5).Size";
Debug.ShouldStop(65536);
if (true) return __ref.getField(false,"_l_insta" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, 5)).runMethod(true,"getSize");
 break; }
}
;
 BA.debugLineNum = 180;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
		Debug.PushSubsStack("LV_onBindViewHolder (mi_shop) ","mi_shop",4,__ref.getField(false, "ba"),__ref,158);
if (RapidSub.canDelegate("lv_onbindviewholder")) { return __ref.runUserSub(false, "mi_shop","lv_onbindviewholder", __ref, _parent, _position);}
RemoteObject _pnl_main = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _btn_pay = RemoteObject.declareNull("de.amberhome.objects.appcompat.ACButtonWrapper");
Debug.locals.put("Parent", _parent);
Debug.locals.put("Position", _position);
 BA.debugLineNum = 158;BA.debugLine="Sub LV_onBindViewHolder (Parent As Panel, Position";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 159;BA.debugLine="Dim pnl_main = Parent.GetView(0) As Panel";
Debug.ShouldStop(1073741824);
_pnl_main = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_pnl_main.setObject(_parent.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).getObject());Debug.locals.put("pnl_main", _pnl_main);
 BA.debugLineNum = 160;BA.debugLine="Dim lbl = pnl_main.GetView(0) As Label";
Debug.ShouldStop(-2147483648);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_lbl.setObject(_pnl_main.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).getObject());Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 161;BA.debugLine="Dim btn_pay = pnl_main.GetView(1) As ACButton";
Debug.ShouldStop(1);
_btn_pay = RemoteObject.createNew ("de.amberhome.objects.appcompat.ACButtonWrapper");
_btn_pay.setObject(_pnl_main.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1))).getObject());Debug.locals.put("btn_pay", _btn_pay);
 BA.debugLineNum = 163;BA.debugLine="btn_pay.Tag=Position";
Debug.ShouldStop(4);
_btn_pay.runMethod(false,"setTag",(_position));
 BA.debugLineNum = 166;BA.debugLine="lbl.Text = \"خرید \"&l_insta(8).Get(Position)&\" سکه";
Debug.ShouldStop(32);
_lbl.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("خرید "),__ref.getField(false,"_l_insta" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, 8)).runMethod(false,"Get",(Object)(_position)),RemoteObject.createImmutable(" سکه "),mi_shop.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, __ref.getField(false,"_l_insta" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, 6)).runMethod(false,"Get",(Object)(_position)))),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 0))),RemoteObject.createImmutable(" تومان "))));
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
public static RemoteObject  _lv_oncreateviewholder(RemoteObject __ref,RemoteObject _parent,RemoteObject _viewtype) throws Exception{
try {
		Debug.PushSubsStack("LV_onCreateViewHolder (mi_shop) ","mi_shop",4,__ref.getField(false, "ba"),__ref,130);
if (RapidSub.canDelegate("lv_oncreateviewholder")) { return __ref.runUserSub(false, "mi_shop","lv_oncreateviewholder", __ref, _parent, _viewtype);}
RemoteObject _pnl_main = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _btn_pay = RemoteObject.declareNull("de.amberhome.objects.appcompat.ACButtonWrapper");
Debug.locals.put("Parent", _parent);
Debug.locals.put("ViewType", _viewtype);
 BA.debugLineNum = 130;BA.debugLine="Sub LV_onCreateViewHolder (Parent As Panel, ViewTy";
Debug.ShouldStop(2);
 BA.debugLineNum = 132;BA.debugLine="Dim pnl_main As Panel";
Debug.ShouldStop(8);
_pnl_main = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("pnl_main", _pnl_main);
 BA.debugLineNum = 133;BA.debugLine="pnl_main.Initialize(\"pnl_main\")";
Debug.ShouldStop(16);
_pnl_main.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("pnl_main")));
 BA.debugLineNum = 134;BA.debugLine="pnl_main.Color=Colors.White";
Debug.ShouldStop(32);
_pnl_main.runVoidMethod ("setColor",mi_shop.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 135;BA.debugLine="Parent.AddView(pnl_main,0,0,Parent.Width,Parent.H";
Debug.ShouldStop(64);
_parent.runVoidMethod ("AddView",(Object)((_pnl_main.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_parent.runMethod(true,"getWidth")),(Object)(_parent.runMethod(true,"getHeight")));
 BA.debugLineNum = 137;BA.debugLine="Dim lbl As Label : lbl.Initialize(\"lbl\")";
Debug.ShouldStop(256);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 137;BA.debugLine="Dim lbl As Label : lbl.Initialize(\"lbl\")";
Debug.ShouldStop(256);
_lbl.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("lbl")));
 BA.debugLineNum = 138;BA.debugLine="lbl.TextColor = Colors.DarkGray : lbl.TextSize =";
Debug.ShouldStop(512);
_lbl.runMethod(true,"setTextColor",mi_shop.__c.getField(false,"Colors").getField(true,"DarkGray"));
 BA.debugLineNum = 138;BA.debugLine="lbl.TextColor = Colors.DarkGray : lbl.TextSize =";
Debug.ShouldStop(512);
_lbl.runMethod(true,"setTextSize",BA.numberCast(float.class, 12));
 BA.debugLineNum = 139;BA.debugLine="lbl.Typeface=typefc";
Debug.ShouldStop(1024);
_lbl.runMethod(false,"setTypeface",(__ref.getField(false,"_typefc" /*RemoteObject*/ ).getObject()));
 BA.debugLineNum = 140;BA.debugLine="lbl.Gravity=Gravity.CENTER_HORIZONTAL+Gravity.CEN";
Debug.ShouldStop(2048);
_lbl.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {mi_shop.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL"),mi_shop.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")}, "+",1, 1));
 BA.debugLineNum = 141;BA.debugLine="lbl.Typeface=Typeface.LoadFromAssets(\"iran_sans.t";
Debug.ShouldStop(4096);
_lbl.runMethod(false,"setTypeface",mi_shop.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("iran_sans.ttf"))));
 BA.debugLineNum = 142;BA.debugLine="pnl_main.AddView(lbl,22%x,0,pnl_main.Width-22%x,p";
Debug.ShouldStop(8192);
_pnl_main.runVoidMethod ("AddView",(Object)((_lbl.getObject())),(Object)(mi_shop.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 22)),__ref.getField(false, "ba"))),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {_pnl_main.runMethod(true,"getWidth"),mi_shop.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 22)),__ref.getField(false, "ba"))}, "-",1, 1)),(Object)(_pnl_main.runMethod(true,"getHeight")));
 BA.debugLineNum = 144;BA.debugLine="Dim btn_pay As ACButton : btn_pay.Initialize(\"btn";
Debug.ShouldStop(32768);
_btn_pay = RemoteObject.createNew ("de.amberhome.objects.appcompat.ACButtonWrapper");Debug.locals.put("btn_pay", _btn_pay);
 BA.debugLineNum = 144;BA.debugLine="Dim btn_pay As ACButton : btn_pay.Initialize(\"btn";
Debug.ShouldStop(32768);
_btn_pay.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("btn_pay")));
 BA.debugLineNum = 145;BA.debugLine="btn_pay.TextColor = Colors.White : btn_pay.TextSi";
Debug.ShouldStop(65536);
_btn_pay.runMethod(true,"setTextColor",mi_shop.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 145;BA.debugLine="btn_pay.TextColor = Colors.White : btn_pay.TextSi";
Debug.ShouldStop(65536);
_btn_pay.runMethod(true,"setTextSize",BA.numberCast(float.class, 17));
 BA.debugLineNum = 146;BA.debugLine="btn_pay.Typeface=typefc";
Debug.ShouldStop(131072);
_btn_pay.runMethod(false,"setTypeface",(__ref.getField(false,"_typefc" /*RemoteObject*/ ).getObject()));
 BA.debugLineNum = 147;BA.debugLine="btn_pay.Color=0xFF1C5C41";
Debug.ShouldStop(262144);
_btn_pay.runVoidMethod ("setColor",BA.numberCast(int.class, 0xff1c5c41));
 BA.debugLineNum = 148;BA.debugLine="btn_pay.Text=\"خرید\"";
Debug.ShouldStop(524288);
_btn_pay.runMethod(true,"setText",BA.ObjectToCharSequence("خرید"));
 BA.debugLineNum = 149;BA.debugLine="btn_pay.Typeface=Typeface.LoadFromAssets(\"iran_sa";
Debug.ShouldStop(1048576);
_btn_pay.runMethod(false,"setTypeface",mi_shop.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("iran_sans.ttf"))));
 BA.debugLineNum = 150;BA.debugLine="btn_pay.Gravity=Gravity.CENTER_HORIZONTAL+Gravity";
Debug.ShouldStop(2097152);
_btn_pay.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {mi_shop.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL"),mi_shop.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")}, "+",1, 1));
 BA.debugLineNum = 151;BA.debugLine="pnl_main.AddView(btn_pay,0,0,20%x,pnl_main.Height";
Debug.ShouldStop(4194304);
_pnl_main.runVoidMethod ("AddView",(Object)((_btn_pay.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(mi_shop.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 20)),__ref.getField(false, "ba"))),(Object)(_pnl_main.runMethod(true,"getHeight")));
 BA.debugLineNum = 153;BA.debugLine="pnl_main.Height=18%x";
Debug.ShouldStop(16777216);
_pnl_main.runMethod(true,"setHeight",mi_shop.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 18)),__ref.getField(false, "ba")));
 BA.debugLineNum = 154;BA.debugLine="Parent.Height=18%x";
Debug.ShouldStop(33554432);
_parent.runMethod(true,"setHeight",mi_shop.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 18)),__ref.getField(false, "ba")));
 BA.debugLineNum = 155;BA.debugLine="Parent.Color=Colors.Transparent";
Debug.ShouldStop(67108864);
_parent.runVoidMethod ("setColor",mi_shop.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 156;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _nivadbilling_product_purchased(RemoteObject __ref,RemoteObject _sku,RemoteObject _details) throws Exception{
try {
		Debug.PushSubsStack("nivadbilling_product_purchased (mi_shop) ","mi_shop",4,__ref.getField(false, "ba"),__ref,366);
if (RapidSub.canDelegate("nivadbilling_product_purchased")) { return __ref.runUserSub(false, "mi_shop","nivadbilling_product_purchased", __ref, _sku, _details);}
Debug.locals.put("sku", _sku);
Debug.locals.put("details", _details);
 BA.debugLineNum = 366;BA.debugLine="Sub nivadbilling_product_purchased(sku As String,";
Debug.ShouldStop(8192);
 BA.debugLineNum = 367;BA.debugLine="Log(\"Purchased\" & sku)";
Debug.ShouldStop(16384);
mi_shop.__c.runVoidMethod ("LogImpl","65308417",RemoteObject.concat(RemoteObject.createImmutable("Purchased"),_sku),0);
 BA.debugLineNum = 368;BA.debugLine="ToastMessageShow( \"خرید با موفقیت انجام شد!\",Fals";
Debug.ShouldStop(32768);
mi_shop.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("خرید با موفقیت انجام شد!")),(Object)(mi_shop.__c.getField(true,"False")));
 BA.debugLineNum = 369;BA.debugLine="mNivadBilling.consumePurchase(\"gold_version\")";
Debug.ShouldStop(65536);
__ref.getField(false,"_mnivadbilling" /*RemoteObject*/ ).runVoidMethod ("consumePurchase",(Object)(RemoteObject.createImmutable("gold_version")));
 BA.debugLineNum = 370;BA.debugLine="mNivadBilling.consumePurchase(sku)";
Debug.ShouldStop(131072);
__ref.getField(false,"_mnivadbilling" /*RemoteObject*/ ).runVoidMethod ("consumePurchase",(Object)(_sku));
 BA.debugLineNum = 371;BA.debugLine="Select type_history";
Debug.ShouldStop(262144);
switch (BA.switchObjectToInt(__ref.getField(true,"_type_history" /*RemoteObject*/ ),BA.numberCast(int.class, 0),BA.numberCast(int.class, 1))) {
case 0: {
 BA.debugLineNum = 374;BA.debugLine="reqsef(i_pk,\"1\",numc)";
Debug.ShouldStop(2097152);
__ref.runClassMethod (com.it.fome.mi_shop.class, "_reqsef" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_i_pk" /*RemoteObject*/ )),(Object)(BA.ObjectToString("1")),(Object)(BA.NumberToString(__ref.getField(true,"_numc" /*RemoteObject*/ ))));
 break; }
case 1: {
 BA.debugLineNum = 377;BA.debugLine="reqsef_tele(userid_t,\"1\",numc)";
Debug.ShouldStop(16777216);
__ref.runClassMethod (com.it.fome.mi_shop.class, "_reqsef_tele" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_userid_t" /*RemoteObject*/ )),(Object)(BA.ObjectToString("1")),(Object)(BA.NumberToString(__ref.getField(true,"_numc" /*RemoteObject*/ ))));
 break; }
}
;
 BA.debugLineNum = 382;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("prfn_onPostStringErrorListener (mi_shop) ","mi_shop",4,__ref.getField(false, "ba"),__ref,200);
if (RapidSub.canDelegate("prfn_onpoststringerrorlistener")) { return __ref.runUserSub(false, "mi_shop","prfn_onpoststringerrorlistener", __ref, _error, _tag);}
Debug.locals.put("Error", _error);
Debug.locals.put("Tag", _tag);
 BA.debugLineNum = 200;BA.debugLine="Sub prfn_onPostStringErrorListener(Error As Respon";
Debug.ShouldStop(128);
 BA.debugLineNum = 201;BA.debugLine="Log(Error.ErrorBody)";
Debug.ShouldStop(256);
mi_shop.__c.runVoidMethod ("LogImpl","64980737",_error.runMethod(true,"getErrorBody"),0);
 BA.debugLineNum = 202;BA.debugLine="Log(Error.CauseMessage)";
Debug.ShouldStop(512);
mi_shop.__c.runVoidMethod ("LogImpl","64980738",_error.runMethod(true,"getCauseMessage"),0);
 BA.debugLineNum = 203;BA.debugLine="Log(Error.ErrorDetails)";
Debug.ShouldStop(1024);
mi_shop.__c.runVoidMethod ("LogImpl","64980739",_error.runMethod(true,"getErrorDetails"),0);
 BA.debugLineNum = 204;BA.debugLine="Log(Error.ErrorLocalizedMsage)";
Debug.ShouldStop(2048);
mi_shop.__c.runVoidMethod ("LogImpl","64980740",_error.runMethod(true,"getErrorLocalizedMsage"),0);
 BA.debugLineNum = 205;BA.debugLine="Log(Error.ErrorMsage)";
Debug.ShouldStop(4096);
mi_shop.__c.runVoidMethod ("LogImpl","64980741",_error.runMethod(true,"getErrorMsage"),0);
 BA.debugLineNum = 206;BA.debugLine="Log(Error.ResponseBody)";
Debug.ShouldStop(8192);
mi_shop.__c.runVoidMethod ("LogImpl","64980742",_error.runMethod(true,"getResponseBody"),0);
 BA.debugLineNum = 208;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(32768);
mi_shop.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 210;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
		Debug.PushSubsStack("prfn_onPostStringOkListener (mi_shop) ","mi_shop",4,__ref.getField(false, "ba"),__ref,212);
if (RapidSub.canDelegate("prfn_onpoststringoklistener")) { return __ref.runUserSub(false, "mi_shop","prfn_onpoststringoklistener", __ref, _result, _tag);}
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colroot = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _t_old = RemoteObject.createImmutable("");
RemoteObject _price = RemoteObject.createImmutable("");
RemoteObject _name = RemoteObject.createImmutable("");
RemoteObject _x = RemoteObject.createImmutable("");
RemoteObject _t_new = RemoteObject.createImmutable("");
RemoteObject _id = RemoteObject.createImmutable("");
RemoteObject _c_m = RemoteObject.createImmutable("");
RemoteObject _uid = RemoteObject.createImmutable("");
RemoteObject _c_f = RemoteObject.createImmutable("");
RemoteObject _pic = RemoteObject.createImmutable("");
RemoteObject _userid = RemoteObject.createImmutable("");
RemoteObject _username = RemoteObject.createImmutable("");
RemoteObject _first_last = RemoteObject.createImmutable("");
RemoteObject _c_ch = RemoteObject.createImmutable("");
RemoteObject _n_coins = RemoteObject.createImmutable(0L);
Debug.locals.put("Tag", _tag);
 BA.debugLineNum = 212;BA.debugLine="Sub prfn_onPostStringOkListener(Result As String";
Debug.ShouldStop(524288);
 BA.debugLineNum = 213;BA.debugLine="LogColor(Result,Colors.Red)";
Debug.ShouldStop(1048576);
mi_shop.__c.runVoidMethod ("LogImpl","65046273",_result,mi_shop.__c.getField(false,"Colors").getField(true,"Red"));
 BA.debugLineNum = 214;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(2097152);
mi_shop.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 215;BA.debugLine="Select Tag";
Debug.ShouldStop(4194304);
switch (BA.switchObjectToInt(_tag,BA.ObjectToString("getinsta"),BA.ObjectToString("sefss"),BA.ObjectToString("seftele"))) {
case 0: {
 BA.debugLineNum = 218;BA.debugLine="Log(Result)";
Debug.ShouldStop(33554432);
mi_shop.__c.runVoidMethod ("LogImpl","65046278",_result,0);
 BA.debugLineNum = 220;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(134217728);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 221;BA.debugLine="parser.Initialize(Result)";
Debug.ShouldStop(268435456);
_parser.runVoidMethod ("Initialize",(Object)(_result));
 BA.debugLineNum = 223;BA.debugLine="Dim root As List = parser.NextArray";
Debug.ShouldStop(1073741824);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_root = _parser.runMethod(false,"NextArray");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 224;BA.debugLine="For Each colroot As Map In root";
Debug.ShouldStop(-2147483648);
_colroot = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group9 = _root;
final int groupLen9 = group9.runMethod(true,"getSize").<Integer>get()
;int index9 = 0;
;
for (; index9 < groupLen9;index9++){
_colroot.setObject(group9.runMethod(false,"Get",index9));
Debug.locals.put("colroot", _colroot);
 BA.debugLineNum = 225;BA.debugLine="Dim t_old As String = colroot.Get(\"t_old\")";
Debug.ShouldStop(1);
_t_old = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("t_old")))));Debug.locals.put("t_old", _t_old);Debug.locals.put("t_old", _t_old);
 BA.debugLineNum = 226;BA.debugLine="Dim price As String = colroot.Get(\"price\")";
Debug.ShouldStop(2);
_price = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("price")))));Debug.locals.put("price", _price);Debug.locals.put("price", _price);
 BA.debugLineNum = 227;BA.debugLine="Dim name As String = colroot.Get(\"name\")";
Debug.ShouldStop(4);
_name = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name")))));Debug.locals.put("name", _name);Debug.locals.put("name", _name);
 BA.debugLineNum = 228;BA.debugLine="Dim x As String = colroot.Get(\"x\")";
Debug.ShouldStop(8);
_x = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("x")))));Debug.locals.put("x", _x);Debug.locals.put("x", _x);
 BA.debugLineNum = 229;BA.debugLine="Dim t_new As String = colroot.Get(\"t_new\")";
Debug.ShouldStop(16);
_t_new = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("t_new")))));Debug.locals.put("t_new", _t_new);Debug.locals.put("t_new", _t_new);
 BA.debugLineNum = 230;BA.debugLine="Dim id As String = colroot.Get(\"id\")";
Debug.ShouldStop(32);
_id = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 232;BA.debugLine="Select x";
Debug.ShouldStop(128);
switch (BA.switchObjectToInt(_x,BA.ObjectToString("follow"),BA.ObjectToString("like"))) {
case 0: {
 BA.debugLineNum = 234;BA.debugLine="l_insta(1).Add(t_old)";
Debug.ShouldStop(512);
__ref.getField(false,"_l_insta" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, 1)).runVoidMethod ("Add",(Object)((_t_old)));
 BA.debugLineNum = 235;BA.debugLine="l_insta(2).Add(price)";
Debug.ShouldStop(1024);
__ref.getField(false,"_l_insta" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, 2)).runVoidMethod ("Add",(Object)((_price)));
 BA.debugLineNum = 236;BA.debugLine="l_insta(3).Add(name)";
Debug.ShouldStop(2048);
__ref.getField(false,"_l_insta" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, 3)).runVoidMethod ("Add",(Object)((_name)));
 BA.debugLineNum = 237;BA.debugLine="l_insta(4).Add(t_new)";
Debug.ShouldStop(4096);
__ref.getField(false,"_l_insta" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, 4)).runVoidMethod ("Add",(Object)((_t_new)));
 break; }
case 1: {
 BA.debugLineNum = 240;BA.debugLine="l_insta(5).Add(t_old)";
Debug.ShouldStop(32768);
__ref.getField(false,"_l_insta" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, 5)).runVoidMethod ("Add",(Object)((_t_old)));
 BA.debugLineNum = 241;BA.debugLine="l_insta(6).Add(price)";
Debug.ShouldStop(65536);
__ref.getField(false,"_l_insta" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, 6)).runVoidMethod ("Add",(Object)((_price)));
 BA.debugLineNum = 242;BA.debugLine="l_insta(7).Add(name)";
Debug.ShouldStop(131072);
__ref.getField(false,"_l_insta" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, 7)).runVoidMethod ("Add",(Object)((_name)));
 BA.debugLineNum = 243;BA.debugLine="l_insta(8).Add(t_new)";
Debug.ShouldStop(262144);
__ref.getField(false,"_l_insta" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, 8)).runVoidMethod ("Add",(Object)((_t_new)));
 break; }
}
;
 }
}Debug.locals.put("colroot", _colroot);
;
 BA.debugLineNum = 251;BA.debugLine="btnm_Click";
Debug.ShouldStop(67108864);
__ref.runClassMethod (com.it.fome.mi_shop.class, "_btnm_click" /*RemoteObject*/ );
 break; }
case 1: {
 BA.debugLineNum = 253;BA.debugLine="If Result.Contains(\"error_code\")=True Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",_result.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("error_code"))),mi_shop.__c.getField(true,"True"))) { 
 BA.debugLineNum = 254;BA.debugLine="ToastMessageShow(\"ثبت خرید ناموفق بود :)\",Fals";
Debug.ShouldStop(536870912);
mi_shop.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("ثبت خرید ناموفق بود :)")),(Object)(mi_shop.__c.getField(true,"False")));
 }else {
 BA.debugLineNum = 256;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(-2147483648);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 257;BA.debugLine="parser.Initialize(Result)";
Debug.ShouldStop(1);
_parser.runVoidMethod ("Initialize",(Object)(_result));
 BA.debugLineNum = 258;BA.debugLine="Dim root As List = parser.NextArray";
Debug.ShouldStop(2);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_root = _parser.runMethod(false,"NextArray");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 259;BA.debugLine="For Each colroot As Map In root";
Debug.ShouldStop(4);
_colroot = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group37 = _root;
final int groupLen37 = group37.runMethod(true,"getSize").<Integer>get()
;int index37 = 0;
;
for (; index37 < groupLen37;index37++){
_colroot.setObject(group37.runMethod(false,"Get",index37));
Debug.locals.put("colroot", _colroot);
 BA.debugLineNum = 260;BA.debugLine="Log(Result)";
Debug.ShouldStop(8);
mi_shop.__c.runVoidMethod ("LogImpl","65046320",_result,0);
 BA.debugLineNum = 261;BA.debugLine="Dim Result As String = colroot.Get(\"result\")";
Debug.ShouldStop(16);
_result = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("result")))));Debug.locals.put("Result", _result);Debug.locals.put("Result", _result);
 BA.debugLineNum = 262;BA.debugLine="Dim c_m As String = colroot.Get(\"c_m\")";
Debug.ShouldStop(32);
_c_m = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("c_m")))));Debug.locals.put("c_m", _c_m);Debug.locals.put("c_m", _c_m);
 BA.debugLineNum = 263;BA.debugLine="Dim uid As String = colroot.Get(\"uid\")";
Debug.ShouldStop(64);
_uid = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("uid")))));Debug.locals.put("uid", _uid);Debug.locals.put("uid", _uid);
 BA.debugLineNum = 264;BA.debugLine="Dim id As String = colroot.Get(\"id\")";
Debug.ShouldStop(128);
_id = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 265;BA.debugLine="Dim c_f As String = colroot.Get(\"c_f\")";
Debug.ShouldStop(256);
_c_f = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("c_f")))));Debug.locals.put("c_f", _c_f);Debug.locals.put("c_f", _c_f);
 BA.debugLineNum = 266;BA.debugLine="Dim pic As String = colroot.Get(\"pic\")";
Debug.ShouldStop(512);
_pic = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("pic")))));Debug.locals.put("pic", _pic);Debug.locals.put("pic", _pic);
 BA.debugLineNum = 267;BA.debugLine="Dim userid As String = colroot.Get(\"userid\")";
Debug.ShouldStop(1024);
_userid = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("userid")))));Debug.locals.put("userid", _userid);Debug.locals.put("userid", _userid);
 BA.debugLineNum = 268;BA.debugLine="Dim username As String = colroot.Get(\"username";
Debug.ShouldStop(2048);
_username = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("username")))));Debug.locals.put("username", _username);Debug.locals.put("username", _username);
 BA.debugLineNum = 269;BA.debugLine="Log(c_f)";
Debug.ShouldStop(4096);
mi_shop.__c.runVoidMethod ("LogImpl","65046329",_c_f,0);
 BA.debugLineNum = 270;BA.debugLine="Log(c_m)";
Debug.ShouldStop(8192);
mi_shop.__c.runVoidMethod ("LogImpl","65046330",_c_m,0);
 BA.debugLineNum = 273;BA.debugLine="CallSubDelayed2(obj,Ev&\"_\"&\"newcointele\",c_m)";
Debug.ShouldStop(65536);
mi_shop.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_obj" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_ev" /*RemoteObject*/ ),RemoteObject.createImmutable("_"),RemoteObject.createImmutable("newcointele"))),(Object)((_c_m)));
 BA.debugLineNum = 275;BA.debugLine="sql1.ExecNonQuery(\"UPDATE tbl_coin set cm='\"&c";
Debug.ShouldStop(262144);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE tbl_coin set cm='"),_c_m,RemoteObject.createImmutable("',cf='"),_c_f,RemoteObject.createImmutable("' WHERE userid='"),__ref.getField(true,"_i_pk" /*RemoteObject*/ ),RemoteObject.createImmutable("' "))));
 }
}Debug.locals.put("colroot", _colroot);
;
 };
 break; }
case 2: {
 BA.debugLineNum = 280;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(8388608);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 281;BA.debugLine="parser.Initialize(Result)";
Debug.ShouldStop(16777216);
_parser.runVoidMethod ("Initialize",(Object)(_result));
 BA.debugLineNum = 282;BA.debugLine="Dim root As List = parser.NextArray";
Debug.ShouldStop(33554432);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_root = _parser.runMethod(false,"NextArray");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 283;BA.debugLine="For Each colroot As Map In root";
Debug.ShouldStop(67108864);
_colroot = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group57 = _root;
final int groupLen57 = group57.runMethod(true,"getSize").<Integer>get()
;int index57 = 0;
;
for (; index57 < groupLen57;index57++){
_colroot.setObject(group57.runMethod(false,"Get",index57));
Debug.locals.put("colroot", _colroot);
 BA.debugLineNum = 284;BA.debugLine="Dim Result As String = colroot.Get(\"result\")";
Debug.ShouldStop(134217728);
_result = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("result")))));Debug.locals.put("Result", _result);Debug.locals.put("Result", _result);
 BA.debugLineNum = 285;BA.debugLine="Dim c_m As String = colroot.Get(\"c_m\")";
Debug.ShouldStop(268435456);
_c_m = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("c_m")))));Debug.locals.put("c_m", _c_m);Debug.locals.put("c_m", _c_m);
 BA.debugLineNum = 286;BA.debugLine="Dim uid As String = colroot.Get(\"uid\")";
Debug.ShouldStop(536870912);
_uid = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("uid")))));Debug.locals.put("uid", _uid);Debug.locals.put("uid", _uid);
 BA.debugLineNum = 287;BA.debugLine="Dim first_last As String = colroot.Get(\"first_";
Debug.ShouldStop(1073741824);
_first_last = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("first_last")))));Debug.locals.put("first_last", _first_last);Debug.locals.put("first_last", _first_last);
 BA.debugLineNum = 288;BA.debugLine="Dim id As String = colroot.Get(\"id\")";
Debug.ShouldStop(-2147483648);
_id = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 289;BA.debugLine="Dim userid As String = colroot.Get(\"userid\")";
Debug.ShouldStop(1);
_userid = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("userid")))));Debug.locals.put("userid", _userid);Debug.locals.put("userid", _userid);
 BA.debugLineNum = 290;BA.debugLine="Dim username As String = colroot.Get(\"username";
Debug.ShouldStop(2);
_username = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("username")))));Debug.locals.put("username", _username);Debug.locals.put("username", _username);
 BA.debugLineNum = 291;BA.debugLine="Dim c_ch As String = colroot.Get(\"c_ch\")";
Debug.ShouldStop(4);
_c_ch = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("c_ch")))));Debug.locals.put("c_ch", _c_ch);Debug.locals.put("c_ch", _c_ch);
 BA.debugLineNum = 293;BA.debugLine="Log(\"cc : \"&c_m)";
Debug.ShouldStop(16);
mi_shop.__c.runVoidMethod ("LogImpl","65046353",RemoteObject.concat(RemoteObject.createImmutable("cc : "),_c_m),0);
 BA.debugLineNum = 294;BA.debugLine="Dim n_coins=c_m As Long";
Debug.ShouldStop(32);
_n_coins = BA.numberCast(long.class, _c_m);Debug.locals.put("n_coins", _n_coins);Debug.locals.put("n_coins", _n_coins);
 BA.debugLineNum = 295;BA.debugLine="CallSubDelayed2(obj,Ev&\"_\"&\"newcointele\",c_m)";
Debug.ShouldStop(64);
mi_shop.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_obj" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_ev" /*RemoteObject*/ ),RemoteObject.createImmutable("_"),RemoteObject.createImmutable("newcointele"))),(Object)((_c_m)));
 BA.debugLineNum = 303;BA.debugLine="sql1.ExecNonQuery(\"UPDATE tbl_coin set cm='\"&c";
Debug.ShouldStop(16384);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE tbl_coin set cm='"),_c_m,RemoteObject.createImmutable("',cf='"),_c_ch,RemoteObject.createImmutable("' WHERE userid='"),__ref.getField(true,"_userid_t" /*RemoteObject*/ ),RemoteObject.createImmutable("' "))));
 }
}Debug.locals.put("colroot", _colroot);
;
 break; }
}
;
 BA.debugLineNum = 307;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
		Debug.PushSubsStack("req_getme (mi_shop) ","mi_shop",4,__ref.getField(false, "ba"),__ref,182);
if (RapidSub.canDelegate("req_getme")) { return __ref.runUserSub(false, "mi_shop","req_getme", __ref, _userid);}
RemoteObject _post = RemoteObject.declareNull("com.reza.sh.fastnet.PostRequestRaper");
Debug.locals.put("userid", _userid);
 BA.debugLineNum = 182;BA.debugLine="Sub req_getme(userid As String)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 183;BA.debugLine="prfn.initialize(\"prfn\").WithSSL.WithCookieManager";
Debug.ShouldStop(4194304);
__ref.getField(false,"_prfn" /*RemoteObject*/ ).runMethod(false,"initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("prfn"))).runMethod(false,"WithSSL").runMethod(false,"WithCookieManager").runVoidMethod ("Build");
 BA.debugLineNum = 184;BA.debugLine="Dim post As PostRequest";
Debug.ShouldStop(8388608);
_post = RemoteObject.createNew ("com.reza.sh.fastnet.PostRequestRaper");Debug.locals.put("post", _post);
 BA.debugLineNum = 185;BA.debugLine="post=prfn.WithCookieManager.WithSSL.BuildPostQuer";
Debug.ShouldStop(16777216);
_post = __ref.getField(false,"_prfn" /*RemoteObject*/ ).runMethod(false,"WithCookieManager").runMethod(false,"WithSSL").runMethod(false,"BuildPostQuery",(Object)(BA.ObjectToString("http://filework.ir/INSTAFOLLOW/api/pay_list.php")),(Object)(RemoteObject.createImmutable("getinsta")));Debug.locals.put("post", _post);
 BA.debugLineNum = 187;BA.debugLine="post.addHeder(\"User-Agent\",\"Dalvik/1.6.0 (Linux;";
Debug.ShouldStop(67108864);
_post.runVoidMethod ("addHeder",(Object)(BA.ObjectToString("User-Agent")),(Object)(RemoteObject.createImmutable("Dalvik/1.6.0 (Linux; U; Android 4.4.4; SM-A700FD Build/KTU84P)")));
 BA.debugLineNum = 188;BA.debugLine="post.executRequestAsString";
Debug.ShouldStop(134217728);
_post.runVoidMethod ("executRequestAsString");
 BA.debugLineNum = 198;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _reqsef(RemoteObject __ref,RemoteObject _userid,RemoteObject _types,RemoteObject _target) throws Exception{
try {
		Debug.PushSubsStack("reqsef (mi_shop) ","mi_shop",4,__ref.getField(false, "ba"),__ref,386);
if (RapidSub.canDelegate("reqsef")) { return __ref.runUserSub(false, "mi_shop","reqsef", __ref, _userid, _types, _target);}
RemoteObject _post = RemoteObject.declareNull("com.reza.sh.fastnet.PostRequestRaper");
Debug.locals.put("userid", _userid);
Debug.locals.put("types", _types);
Debug.locals.put("target", _target);
 BA.debugLineNum = 386;BA.debugLine="Sub reqsef(userid As String,types As String,target";
Debug.ShouldStop(2);
 BA.debugLineNum = 389;BA.debugLine="prfn.initialize(\"prfn\")";
Debug.ShouldStop(16);
__ref.getField(false,"_prfn" /*RemoteObject*/ ).runVoidMethod ("initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("prfn")));
 BA.debugLineNum = 390;BA.debugLine="Dim post As PostRequest";
Debug.ShouldStop(32);
_post = RemoteObject.createNew ("com.reza.sh.fastnet.PostRequestRaper");Debug.locals.put("post", _post);
 BA.debugLineNum = 391;BA.debugLine="post=prfn.BuildPostQuery(\"http://filework.ir/INST";
Debug.ShouldStop(64);
_post = __ref.getField(false,"_prfn" /*RemoteObject*/ ).runMethod(false,"BuildPostQuery",(Object)(BA.ObjectToString("http://filework.ir/INSTAFOLLOW/api/req.php")),(Object)(RemoteObject.createImmutable("sefss")));Debug.locals.put("post", _post);
 BA.debugLineNum = 393;BA.debugLine="post.addHeder(\"User-Agent\",\"Dalvik/1.6.0 (Linux;";
Debug.ShouldStop(256);
_post.runVoidMethod ("addHeder",(Object)(BA.ObjectToString("User-Agent")),(Object)(RemoteObject.createImmutable("Dalvik/1.6.0 (Linux; U; Android 4.4.4; SM-A700FD Build/KTU84P)")));
 BA.debugLineNum = 394;BA.debugLine="post.addParametrs(\"req\",\"coin_pay\")";
Debug.ShouldStop(512);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("req")),(Object)(RemoteObject.createImmutable("coin_pay")));
 BA.debugLineNum = 396;BA.debugLine="post.addParametrs(\"uid\",\"1\")";
Debug.ShouldStop(2048);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("uid")),(Object)(RemoteObject.createImmutable("1")));
 BA.debugLineNum = 397;BA.debugLine="post.addParametrs(\"types\",types)";
Debug.ShouldStop(4096);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("types")),(Object)(_types));
 BA.debugLineNum = 398;BA.debugLine="post.addParametrs(\"userid\",userid)";
Debug.ShouldStop(8192);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("userid")),(Object)(_userid));
 BA.debugLineNum = 399;BA.debugLine="post.addParametrs(\"target\",target)";
Debug.ShouldStop(16384);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("target")),(Object)(_target));
 BA.debugLineNum = 403;BA.debugLine="post.executRequestAsString";
Debug.ShouldStop(262144);
_post.runVoidMethod ("executRequestAsString");
 BA.debugLineNum = 405;BA.debugLine="ProgressDialogShow(\"در حال پردازش...\")";
Debug.ShouldStop(1048576);
mi_shop.__c.runVoidMethod ("ProgressDialogShow",__ref.getField(false, "ba"),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("در حال پردازش..."))));
 BA.debugLineNum = 408;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _reqsef_tele(RemoteObject __ref,RemoteObject _userid,RemoteObject _types,RemoteObject _target) throws Exception{
try {
		Debug.PushSubsStack("reqsef_tele (mi_shop) ","mi_shop",4,__ref.getField(false, "ba"),__ref,410);
if (RapidSub.canDelegate("reqsef_tele")) { return __ref.runUserSub(false, "mi_shop","reqsef_tele", __ref, _userid, _types, _target);}
RemoteObject _post = RemoteObject.declareNull("com.reza.sh.fastnet.PostRequestRaper");
Debug.locals.put("userid", _userid);
Debug.locals.put("types", _types);
Debug.locals.put("target", _target);
 BA.debugLineNum = 410;BA.debugLine="Sub reqsef_tele(userid As String,types As String,t";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 413;BA.debugLine="prfn.initialize(\"prfn\")";
Debug.ShouldStop(268435456);
__ref.getField(false,"_prfn" /*RemoteObject*/ ).runVoidMethod ("initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("prfn")));
 BA.debugLineNum = 414;BA.debugLine="Dim post As PostRequest";
Debug.ShouldStop(536870912);
_post = RemoteObject.createNew ("com.reza.sh.fastnet.PostRequestRaper");Debug.locals.put("post", _post);
 BA.debugLineNum = 415;BA.debugLine="post=prfn.BuildPostQuery(\"http://filework.ir/INST";
Debug.ShouldStop(1073741824);
_post = __ref.getField(false,"_prfn" /*RemoteObject*/ ).runMethod(false,"BuildPostQuery",(Object)(BA.ObjectToString("http://filework.ir/INSTAFOLLOW/api/req.php")),(Object)(RemoteObject.createImmutable("seftele")));Debug.locals.put("post", _post);
 BA.debugLineNum = 417;BA.debugLine="post.addHeder(\"User-Agent\",\"Dalvik/1.6.0 (Linux;";
Debug.ShouldStop(1);
_post.runVoidMethod ("addHeder",(Object)(BA.ObjectToString("User-Agent")),(Object)(RemoteObject.createImmutable("Dalvik/1.6.0 (Linux; U; Android 4.4.4; SM-A700FD Build/KTU84P)")));
 BA.debugLineNum = 418;BA.debugLine="post.addParametrs(\"req\",\"coin_paytele\")";
Debug.ShouldStop(2);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("req")),(Object)(RemoteObject.createImmutable("coin_paytele")));
 BA.debugLineNum = 420;BA.debugLine="post.addParametrs(\"uid\",\"1\")";
Debug.ShouldStop(8);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("uid")),(Object)(RemoteObject.createImmutable("1")));
 BA.debugLineNum = 421;BA.debugLine="post.addParametrs(\"types\",types)";
Debug.ShouldStop(16);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("types")),(Object)(_types));
 BA.debugLineNum = 422;BA.debugLine="post.addParametrs(\"userid\",userid)";
Debug.ShouldStop(32);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("userid")),(Object)(_userid));
 BA.debugLineNum = 423;BA.debugLine="post.addParametrs(\"target\",target)";
Debug.ShouldStop(64);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("target")),(Object)(_target));
 BA.debugLineNum = 427;BA.debugLine="post.executRequestAsString";
Debug.ShouldStop(1024);
_post.runVoidMethod ("executRequestAsString");
 BA.debugLineNum = 429;BA.debugLine="ProgressDialogShow(\"در حال پردازش...\")";
Debug.ShouldStop(4096);
mi_shop.__c.runVoidMethod ("ProgressDialogShow",__ref.getField(false, "ba"),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("در حال پردازش..."))));
 BA.debugLineNum = 432;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}