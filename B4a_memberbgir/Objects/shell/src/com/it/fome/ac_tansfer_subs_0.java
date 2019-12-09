package com.it.fome;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class ac_tansfer_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (ac_tansfer) ","ac_tansfer",5,ac_tansfer.mostCurrent.activityBA,ac_tansfer.mostCurrent,33);
if (RapidSub.canDelegate("activity_create")) { return com.it.fome.ac_tansfer.remoteMe.runUserSub(false, "ac_tansfer","activity_create", _firsttime);}
RemoteObject _bkcolor = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
RemoteObject _bkcolor_st = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
RemoteObject _pnlb1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _gradient1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.GradientDrawable");
RemoteObject _clrs = null;
RemoteObject _card = RemoteObject.declareNull("de.amberhome.objects.CardViewWrapper");
RemoteObject _pnl_card = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _lbl_a = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _lbl_cc = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _bg = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
RemoteObject _lbl_send = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 33;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(1);
 BA.debugLineNum = 38;BA.debugLine="Dim bkcolor As ColorDrawable";
Debug.ShouldStop(32);
_bkcolor = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("bkcolor", _bkcolor);
 BA.debugLineNum = 39;BA.debugLine="bkcolor.Initialize2(Colors.White,15,2dip,Colors.L";
Debug.ShouldStop(64);
_bkcolor.runVoidMethod ("Initialize2",(Object)(ac_tansfer.mostCurrent.__c.getField(false,"Colors").getField(true,"White")),(Object)(BA.numberCast(int.class, 15)),(Object)(ac_tansfer.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))),(Object)(ac_tansfer.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray")));
 BA.debugLineNum = 40;BA.debugLine="meno.Initialize(\"meno\")";
Debug.ShouldStop(128);
ac_tansfer.mostCurrent._meno.runVoidMethod ("Initialize",ac_tansfer.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("meno")));
 BA.debugLineNum = 41;BA.debugLine="meno.TextColor=Colors.DarkGray";
Debug.ShouldStop(256);
ac_tansfer.mostCurrent._meno.runMethod(true,"setTextColor",ac_tansfer.mostCurrent.__c.getField(false,"Colors").getField(true,"DarkGray"));
 BA.debugLineNum = 42;BA.debugLine="meno.TextSize=37";
Debug.ShouldStop(512);
ac_tansfer.mostCurrent._meno.runMethod(true,"setTextSize",BA.numberCast(float.class, 37));
 BA.debugLineNum = 43;BA.debugLine="meno.Background=bkcolor";
Debug.ShouldStop(1024);
ac_tansfer.mostCurrent._meno.runMethod(false,"setBackground",(_bkcolor.getObject()));
 BA.debugLineNum = 44;BA.debugLine="meno.Typeface=Typeface.MATERIALICONS";
Debug.ShouldStop(2048);
ac_tansfer.mostCurrent._meno.runMethod(false,"setTypeface",ac_tansfer.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"getMATERIALICONS"));
 BA.debugLineNum = 45;BA.debugLine="meno.Text=Chr(0xE3C7)";
Debug.ShouldStop(4096);
ac_tansfer.mostCurrent._meno.runMethod(true,"setText",BA.ObjectToCharSequence(ac_tansfer.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xe3c7)))));
 BA.debugLineNum = 46;BA.debugLine="meno.Gravity=Gravity.CENTER_HORIZONTAL+Gravity.CE";
Debug.ShouldStop(8192);
ac_tansfer.mostCurrent._meno.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {ac_tansfer.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL"),ac_tansfer.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")}, "+",1, 1));
 BA.debugLineNum = 47;BA.debugLine="Activity.AddView(meno,3%x,3%x,12%x,12%x)";
Debug.ShouldStop(16384);
ac_tansfer.mostCurrent._activity.runVoidMethod ("AddView",(Object)((ac_tansfer.mostCurrent._meno.getObject())),(Object)(ac_tansfer.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 3)),ac_tansfer.mostCurrent.activityBA)),(Object)(ac_tansfer.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 3)),ac_tansfer.mostCurrent.activityBA)),(Object)(ac_tansfer.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 12)),ac_tansfer.mostCurrent.activityBA)),(Object)(ac_tansfer.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 12)),ac_tansfer.mostCurrent.activityBA)));
 BA.debugLineNum = 49;BA.debugLine="pnl_coins.Initialize(\"pnl_coins\")";
Debug.ShouldStop(65536);
ac_tansfer.mostCurrent._pnl_coins.runVoidMethod ("Initialize",ac_tansfer.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("pnl_coins")));
 BA.debugLineNum = 50;BA.debugLine="Activity.AddView(pnl_coins,50%x,3%x,50%x,12%x)";
Debug.ShouldStop(131072);
ac_tansfer.mostCurrent._activity.runVoidMethod ("AddView",(Object)((ac_tansfer.mostCurrent._pnl_coins.getObject())),(Object)(ac_tansfer.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 50)),ac_tansfer.mostCurrent.activityBA)),(Object)(ac_tansfer.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 3)),ac_tansfer.mostCurrent.activityBA)),(Object)(ac_tansfer.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 50)),ac_tansfer.mostCurrent.activityBA)),(Object)(ac_tansfer.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 12)),ac_tansfer.mostCurrent.activityBA)));
 BA.debugLineNum = 51;BA.debugLine="roundview.Initialize(pnl_coins)";
Debug.ShouldStop(262144);
ac_tansfer.mostCurrent._roundview.runVoidMethod ("Initialize",ac_tansfer.processBA,(Object)((ac_tansfer.mostCurrent._pnl_coins.getObject())));
 BA.debugLineNum = 52;BA.debugLine="roundview.CornerRadius_BL=10%x";
Debug.ShouldStop(524288);
ac_tansfer.mostCurrent._roundview.runMethod(true,"setCornerRadius_BL",ac_tansfer.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),ac_tansfer.mostCurrent.activityBA));
 BA.debugLineNum = 53;BA.debugLine="roundview.CornerRadius_TL=10%x";
Debug.ShouldStop(1048576);
ac_tansfer.mostCurrent._roundview.runMethod(true,"setCornerRadius_TL",ac_tansfer.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),ac_tansfer.mostCurrent.activityBA));
 BA.debugLineNum = 54;BA.debugLine="roundview.BackgroundColor=Colors.White";
Debug.ShouldStop(2097152);
ac_tansfer.mostCurrent._roundview.runMethod(true,"setBackgroundColor",ac_tansfer.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 56;BA.debugLine="Dim bkcolor_st As ColorDrawable";
Debug.ShouldStop(8388608);
_bkcolor_st = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("bkcolor_st", _bkcolor_st);
 BA.debugLineNum = 57;BA.debugLine="bkcolor_st.Initialize2(0xFFC67D00,50,4dip,0x82FFE";
Debug.ShouldStop(16777216);
_bkcolor_st.runVoidMethod ("Initialize2",(Object)(BA.numberCast(int.class, 0xffc67d00)),(Object)(BA.numberCast(int.class, 50)),(Object)(ac_tansfer.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4)))),(Object)(BA.numberCast(int.class, 0x82ffe300)));
 BA.debugLineNum = 59;BA.debugLine="Dim pnlb1 As Panel";
Debug.ShouldStop(67108864);
_pnlb1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("pnlb1", _pnlb1);
 BA.debugLineNum = 60;BA.debugLine="pnlb1.Initialize(\"\")";
Debug.ShouldStop(134217728);
_pnlb1.runVoidMethod ("Initialize",ac_tansfer.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 61;BA.debugLine="pnlb1.Color=0xFFFFC300";
Debug.ShouldStop(268435456);
_pnlb1.runVoidMethod ("setColor",BA.numberCast(int.class, 0xffffc300));
 BA.debugLineNum = 62;BA.debugLine="pnlb1.Background=bkcolor_st";
Debug.ShouldStop(536870912);
_pnlb1.runMethod(false,"setBackground",(_bkcolor_st.getObject()));
 BA.debugLineNum = 63;BA.debugLine="pnl_coins.AddView(pnlb1,pnl_coins.Width-11%x,1%x,";
Debug.ShouldStop(1073741824);
ac_tansfer.mostCurrent._pnl_coins.runVoidMethod ("AddView",(Object)((_pnlb1.getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {ac_tansfer.mostCurrent._pnl_coins.runMethod(true,"getWidth"),ac_tansfer.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 11)),ac_tansfer.mostCurrent.activityBA)}, "-",1, 1)),(Object)(ac_tansfer.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 1)),ac_tansfer.mostCurrent.activityBA)),(Object)(ac_tansfer.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),ac_tansfer.mostCurrent.activityBA)),(Object)(RemoteObject.solve(new RemoteObject[] {ac_tansfer.mostCurrent._pnl_coins.runMethod(true,"getHeight"),ac_tansfer.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),ac_tansfer.mostCurrent.activityBA)}, "-",1, 1)));
 BA.debugLineNum = 65;BA.debugLine="lbl_icon.Initialize(\"lbl_icon\")";
Debug.ShouldStop(1);
ac_tansfer.mostCurrent._lbl_icon.runVoidMethod ("Initialize",ac_tansfer.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("lbl_icon")));
 BA.debugLineNum = 66;BA.debugLine="lbl_icon.SetBackgroundImage(LoadBitmap(File.DirAs";
Debug.ShouldStop(2);
ac_tansfer.mostCurrent._lbl_icon.runVoidMethod ("SetBackgroundImageNew",(Object)((ac_tansfer.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(ac_tansfer.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("coins.png"))).getObject())));
 BA.debugLineNum = 67;BA.debugLine="pnl_coins.AddView(lbl_icon,pnl_coins.Width-9%x,pn";
Debug.ShouldStop(4);
ac_tansfer.mostCurrent._pnl_coins.runVoidMethod ("AddView",(Object)((ac_tansfer.mostCurrent._lbl_icon.getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {ac_tansfer.mostCurrent._pnl_coins.runMethod(true,"getWidth"),ac_tansfer.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 9)),ac_tansfer.mostCurrent.activityBA)}, "-",1, 1)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {ac_tansfer.mostCurrent._pnl_coins.runMethod(true,"getHeight"),RemoteObject.createImmutable(2),RemoteObject.createImmutable(2)}, "//",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {ac_tansfer.mostCurrent._pnl_coins.runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {ac_tansfer.mostCurrent._pnl_coins.runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "/",0, 0))));
 BA.debugLineNum = 69;BA.debugLine="lbl_nums.Initialize(\"lbl_nums\")";
Debug.ShouldStop(16);
ac_tansfer.mostCurrent._lbl_nums.runVoidMethod ("Initialize",ac_tansfer.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("lbl_nums")));
 BA.debugLineNum = 70;BA.debugLine="lbl_nums.TextColor=Colors.DarkGray";
Debug.ShouldStop(32);
ac_tansfer.mostCurrent._lbl_nums.runMethod(true,"setTextColor",ac_tansfer.mostCurrent.__c.getField(false,"Colors").getField(true,"DarkGray"));
 BA.debugLineNum = 71;BA.debugLine="lbl_nums.TextSize=20";
Debug.ShouldStop(64);
ac_tansfer.mostCurrent._lbl_nums.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 72;BA.debugLine="lbl_nums.Typeface=Typeface.LoadFromAssets(\"iran_s";
Debug.ShouldStop(128);
ac_tansfer.mostCurrent._lbl_nums.runMethod(false,"setTypeface",ac_tansfer.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("iran_sans.ttf"))));
 BA.debugLineNum = 73;BA.debugLine="lbl_nums.Text=0&\" سکه\"";
Debug.ShouldStop(256);
ac_tansfer.mostCurrent._lbl_nums.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable(0),RemoteObject.createImmutable(" سکه"))));
 BA.debugLineNum = 74;BA.debugLine="lbl_nums.Gravity=Gravity.CENTER_VERTICAL+Gravity.";
Debug.ShouldStop(512);
ac_tansfer.mostCurrent._lbl_nums.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {ac_tansfer.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL"),ac_tansfer.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT")}, "+",1, 1));
 BA.debugLineNum = 75;BA.debugLine="pnl_coins.AddView(lbl_nums,2%x,0,pnl_coins.Width-";
Debug.ShouldStop(1024);
ac_tansfer.mostCurrent._pnl_coins.runVoidMethod ("AddView",(Object)((ac_tansfer.mostCurrent._lbl_nums.getObject())),(Object)(ac_tansfer.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),ac_tansfer.mostCurrent.activityBA)),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {ac_tansfer.mostCurrent._pnl_coins.runMethod(true,"getWidth"),ac_tansfer.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),ac_tansfer.mostCurrent.activityBA)}, "-",1, 1)),(Object)(ac_tansfer.mostCurrent._pnl_coins.runMethod(true,"getHeight")));
 BA.debugLineNum = 79;BA.debugLine="If File.Exists(File.DirInternal,\"instadb.db\")=Fal";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",ac_tansfer.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(ac_tansfer.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("instadb.db"))),ac_tansfer.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 80;BA.debugLine="File.Copy(File.DirAssets,\"instadb.db\",File.DirIn";
Debug.ShouldStop(32768);
ac_tansfer.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(ac_tansfer.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("instadb.db")),(Object)(ac_tansfer.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("instadb.db")));
 };
 BA.debugLineNum = 82;BA.debugLine="If sql1.IsInitialized=False Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",ac_tansfer._sql1.runMethod(true,"IsInitialized"),ac_tansfer.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 83;BA.debugLine="sql1.Initialize(File.DirInternal,\"instadb.db\",Fa";
Debug.ShouldStop(262144);
ac_tansfer._sql1.runVoidMethod ("Initialize",(Object)(ac_tansfer.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("instadb.db")),(Object)(ac_tansfer.mostCurrent.__c.getField(true,"False")));
 };
 BA.debugLineNum = 89;BA.debugLine="Select type_s";
Debug.ShouldStop(16777216);
switch (BA.switchObjectToInt(ac_tansfer._type_s,BA.numberCast(int.class, 0),BA.numberCast(int.class, 1))) {
case 0: {
 BA.debugLineNum = 91;BA.debugLine="cursor1 = sql1.ExecQuery(\"SELECT * FROM tbl_acc";
Debug.ShouldStop(67108864);
ac_tansfer._cursor1.setObject(ac_tansfer._sql1.runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT * FROM tbl_acc WHERE soich='1' "))));
 BA.debugLineNum = 92;BA.debugLine="Dim i As Int";
Debug.ShouldStop(134217728);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 93;BA.debugLine="For i=0 To cursor1.RowCount-1";
Debug.ShouldStop(268435456);
{
final int step44 = 1;
final int limit44 = RemoteObject.solve(new RemoteObject[] {ac_tansfer._cursor1.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step44 > 0 && _i.<Integer>get().intValue() <= limit44) || (step44 < 0 && _i.<Integer>get().intValue() >= limit44) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step44))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 94;BA.debugLine="cursor1.Position=i";
Debug.ShouldStop(536870912);
ac_tansfer._cursor1.runMethod(true,"setPosition",_i);
 BA.debugLineNum = 95;BA.debugLine="i_cookie=cursor1.GetString(\"cookie\")";
Debug.ShouldStop(1073741824);
ac_tansfer.mostCurrent._i_cookie = ac_tansfer._cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("cookie")));
 BA.debugLineNum = 96;BA.debugLine="i_username=cursor1.GetString(\"username\")";
Debug.ShouldStop(-2147483648);
ac_tansfer.mostCurrent._i_username = ac_tansfer._cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("username")));
 BA.debugLineNum = 97;BA.debugLine="i_pk=cursor1.GetString(\"pk\")";
Debug.ShouldStop(1);
ac_tansfer.mostCurrent._i_pk = ac_tansfer._cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("pk")));
 BA.debugLineNum = 98;BA.debugLine="i_pic=cursor1.GetString(\"profile_pic_url\")";
Debug.ShouldStop(2);
ac_tansfer.mostCurrent._i_pic = ac_tansfer._cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("profile_pic_url")));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 102;BA.debugLine="Dim Gradient1 As GradientDrawable";
Debug.ShouldStop(32);
_gradient1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.GradientDrawable");Debug.locals.put("Gradient1", _gradient1);
 BA.debugLineNum = 103;BA.debugLine="Dim Clrs(2) As Int";
Debug.ShouldStop(64);
_clrs = RemoteObject.createNewArray ("int", new int[] {2}, new Object[]{});Debug.locals.put("Clrs", _clrs);
 BA.debugLineNum = 104;BA.debugLine="Clrs(0) = 0xFFD91A99";
Debug.ShouldStop(128);
_clrs.setArrayElement (BA.numberCast(int.class, 0xffd91a99),BA.numberCast(int.class, 0));
 BA.debugLineNum = 105;BA.debugLine="Clrs(1) = 0xFFA91AD9";
Debug.ShouldStop(256);
_clrs.setArrayElement (BA.numberCast(int.class, 0xffa91ad9),BA.numberCast(int.class, 1));
 BA.debugLineNum = 106;BA.debugLine="Gradient1.Initialize(\"TOP_BOTTOM\", Clrs)";
Debug.ShouldStop(512);
_gradient1.runVoidMethod ("Initialize",(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.drawable.GradientDrawable.Orientation"),"TOP_BOTTOM")),(Object)(_clrs));
 BA.debugLineNum = 107;BA.debugLine="Activity.Background=Gradient1";
Debug.ShouldStop(1024);
ac_tansfer.mostCurrent._activity.runMethod(false,"setBackground",(_gradient1.getObject()));
 BA.debugLineNum = 109;BA.debugLine="req_insta(i_pk)";
Debug.ShouldStop(4096);
_req_insta(ac_tansfer.mostCurrent._i_pk);
 BA.debugLineNum = 110;BA.debugLine="bg1.Initialize(0xFFBC11C6,2%x)";
Debug.ShouldStop(8192);
ac_tansfer.mostCurrent._bg1.runVoidMethod ("Initialize",(Object)(BA.numberCast(int.class, 0xffbc11c6)),(Object)(ac_tansfer.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),ac_tansfer.mostCurrent.activityBA)));
 break; }
case 1: {
 BA.debugLineNum = 114;BA.debugLine="Dim Gradient1 As GradientDrawable";
Debug.ShouldStop(131072);
_gradient1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.GradientDrawable");Debug.locals.put("Gradient1", _gradient1);
 BA.debugLineNum = 115;BA.debugLine="Dim Clrs(5) As Int";
Debug.ShouldStop(262144);
_clrs = RemoteObject.createNewArray ("int", new int[] {5}, new Object[]{});Debug.locals.put("Clrs", _clrs);
 BA.debugLineNum = 116;BA.debugLine="Clrs(0) = 0xFFe8eaf6";
Debug.ShouldStop(524288);
_clrs.setArrayElement (BA.numberCast(int.class, 0xffe8eaf6),BA.numberCast(int.class, 0));
 BA.debugLineNum = 117;BA.debugLine="Clrs(1) = 0xFFe8eaf6";
Debug.ShouldStop(1048576);
_clrs.setArrayElement (BA.numberCast(int.class, 0xffe8eaf6),BA.numberCast(int.class, 1));
 BA.debugLineNum = 118;BA.debugLine="Clrs(2) = 0xFFe8eaf6";
Debug.ShouldStop(2097152);
_clrs.setArrayElement (BA.numberCast(int.class, 0xffe8eaf6),BA.numberCast(int.class, 2));
 BA.debugLineNum = 119;BA.debugLine="Clrs(3) = 0xFF283593";
Debug.ShouldStop(4194304);
_clrs.setArrayElement (BA.numberCast(int.class, 0xff283593),BA.numberCast(int.class, 3));
 BA.debugLineNum = 120;BA.debugLine="Clrs(4) = 0xFF283593";
Debug.ShouldStop(8388608);
_clrs.setArrayElement (BA.numberCast(int.class, 0xff283593),BA.numberCast(int.class, 4));
 BA.debugLineNum = 122;BA.debugLine="Gradient1.Initialize(\"TOP_BOTTOM\", Clrs)";
Debug.ShouldStop(33554432);
_gradient1.runVoidMethod ("Initialize",(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.drawable.GradientDrawable.Orientation"),"TOP_BOTTOM")),(Object)(_clrs));
 BA.debugLineNum = 123;BA.debugLine="Activity.Background=Gradient1";
Debug.ShouldStop(67108864);
ac_tansfer.mostCurrent._activity.runMethod(false,"setBackground",(_gradient1.getObject()));
 BA.debugLineNum = 126;BA.debugLine="cursor1 = sql1.ExecQuery(\"SELECT * FROM tbl_tel";
Debug.ShouldStop(536870912);
ac_tansfer._cursor1.setObject(ac_tansfer._sql1.runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT * FROM tbl_tele WHERE soich='1'"))));
 BA.debugLineNum = 127;BA.debugLine="Dim i As Int";
Debug.ShouldStop(1073741824);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 128;BA.debugLine="For i=0 To cursor1.RowCount-1";
Debug.ShouldStop(-2147483648);
{
final int step71 = 1;
final int limit71 = RemoteObject.solve(new RemoteObject[] {ac_tansfer._cursor1.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step71 > 0 && _i.<Integer>get().intValue() <= limit71) || (step71 < 0 && _i.<Integer>get().intValue() >= limit71) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step71))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 129;BA.debugLine="cursor1.Position=i";
Debug.ShouldStop(1);
ac_tansfer._cursor1.runMethod(true,"setPosition",_i);
 BA.debugLineNum = 130;BA.debugLine="userid_t=cursor1.GetString(\"userid\")";
Debug.ShouldStop(2);
ac_tansfer.mostCurrent._userid_t = ac_tansfer._cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("userid")));
 BA.debugLineNum = 131;BA.debugLine="username_t=cursor1.GetString(\"username\")";
Debug.ShouldStop(4);
ac_tansfer.mostCurrent._username_t = ac_tansfer._cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("username")));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 133;BA.debugLine="req_tele(\"\")";
Debug.ShouldStop(16);
_req_tele(RemoteObject.createImmutable(""));
 BA.debugLineNum = 134;BA.debugLine="bg1.Initialize(0xFF1D69C6,2%x)";
Debug.ShouldStop(32);
ac_tansfer.mostCurrent._bg1.runVoidMethod ("Initialize",(Object)(BA.numberCast(int.class, 0xff1d69c6)),(Object)(ac_tansfer.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),ac_tansfer.mostCurrent.activityBA)));
 break; }
}
;
 BA.debugLineNum = 143;BA.debugLine="Dim card As CardView";
Debug.ShouldStop(16384);
_card = RemoteObject.createNew ("de.amberhome.objects.CardViewWrapper");Debug.locals.put("card", _card);
 BA.debugLineNum = 144;BA.debugLine="card.Initialize(\"card\")";
Debug.ShouldStop(32768);
_card.runVoidMethod ("Initialize",ac_tansfer.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("card")));
 BA.debugLineNum = 145;BA.debugLine="card.Color=Colors.White";
Debug.ShouldStop(65536);
_card.runVoidMethod ("setColor",ac_tansfer.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 146;BA.debugLine="card.CornerRadius=3%x";
Debug.ShouldStop(131072);
_card.runMethod(true,"setCornerRadius",BA.numberCast(float.class, ac_tansfer.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 3)),ac_tansfer.mostCurrent.activityBA)));
 BA.debugLineNum = 147;BA.debugLine="Activity.AddView(card,3%x,20%x,100%x-6%x,10dip)";
Debug.ShouldStop(262144);
ac_tansfer.mostCurrent._activity.runVoidMethod ("AddView",(Object)((_card.getObject())),(Object)(ac_tansfer.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 3)),ac_tansfer.mostCurrent.activityBA)),(Object)(ac_tansfer.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 20)),ac_tansfer.mostCurrent.activityBA)),(Object)(RemoteObject.solve(new RemoteObject[] {ac_tansfer.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),ac_tansfer.mostCurrent.activityBA),ac_tansfer.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 6)),ac_tansfer.mostCurrent.activityBA)}, "-",1, 1)),(Object)(ac_tansfer.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))));
 BA.debugLineNum = 149;BA.debugLine="Dim pnl_card As Panel";
Debug.ShouldStop(1048576);
_pnl_card = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("pnl_card", _pnl_card);
 BA.debugLineNum = 150;BA.debugLine="pnl_card.Initialize(\"pnl_card\")";
Debug.ShouldStop(2097152);
_pnl_card.runVoidMethod ("Initialize",ac_tansfer.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("pnl_card")));
 BA.debugLineNum = 151;BA.debugLine="pnl_card.Color=Colors.White";
Debug.ShouldStop(4194304);
_pnl_card.runVoidMethod ("setColor",ac_tansfer.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 152;BA.debugLine="card.AddView(pnl_card,0,0,card.Width,card.Height)";
Debug.ShouldStop(8388608);
_card.runVoidMethod ("AddView",(Object)((_pnl_card.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_card.runMethod(true,"getWidth")),(Object)(_card.runMethod(true,"getHeight")));
 BA.debugLineNum = 154;BA.debugLine="Dim lbl_a As Label";
Debug.ShouldStop(33554432);
_lbl_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl_a", _lbl_a);
 BA.debugLineNum = 155;BA.debugLine="lbl_a.Initialize(\"lbl_a\")";
Debug.ShouldStop(67108864);
_lbl_a.runVoidMethod ("Initialize",ac_tansfer.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("lbl_a")));
 BA.debugLineNum = 156;BA.debugLine="lbl_a.TextColor=Colors.DarkGray";
Debug.ShouldStop(134217728);
_lbl_a.runMethod(true,"setTextColor",ac_tansfer.mostCurrent.__c.getField(false,"Colors").getField(true,"DarkGray"));
 BA.debugLineNum = 157;BA.debugLine="lbl_a.TextSize=18";
Debug.ShouldStop(268435456);
_lbl_a.runMethod(true,"setTextSize",BA.numberCast(float.class, 18));
 BA.debugLineNum = 158;BA.debugLine="lbl_a.Typeface=Typeface.LoadFromAssets(\"iran_sans";
Debug.ShouldStop(536870912);
_lbl_a.runMethod(false,"setTypeface",ac_tansfer.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("iran_sans.ttf"))));
 BA.debugLineNum = 159;BA.debugLine="lbl_a.Text=\"انتقال سکه\"";
Debug.ShouldStop(1073741824);
_lbl_a.runMethod(true,"setText",BA.ObjectToCharSequence("انتقال سکه"));
 BA.debugLineNum = 160;BA.debugLine="lbl_a.Gravity=Gravity.CENTER_VERTICAL+Gravity.CEN";
Debug.ShouldStop(-2147483648);
_lbl_a.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {ac_tansfer.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL"),ac_tansfer.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL")}, "+",1, 1));
 BA.debugLineNum = 161;BA.debugLine="pnl_card.AddView(lbl_a,5%x,0,pnl_card.Width-10%x,";
Debug.ShouldStop(1);
_pnl_card.runVoidMethod ("AddView",(Object)((_lbl_a.getObject())),(Object)(ac_tansfer.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),ac_tansfer.mostCurrent.activityBA)),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {_pnl_card.runMethod(true,"getWidth"),ac_tansfer.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),ac_tansfer.mostCurrent.activityBA)}, "-",1, 1)),(Object)(ac_tansfer.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),ac_tansfer.mostCurrent.activityBA)));
 BA.debugLineNum = 163;BA.debugLine="Dim lbl_cc As Label";
Debug.ShouldStop(4);
_lbl_cc = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl_cc", _lbl_cc);
 BA.debugLineNum = 164;BA.debugLine="lbl_cc.Initialize(\"lbl_cc\")";
Debug.ShouldStop(8);
_lbl_cc.runVoidMethod ("Initialize",ac_tansfer.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("lbl_cc")));
 BA.debugLineNum = 165;BA.debugLine="lbl_cc.TextColor=Colors.DarkGray";
Debug.ShouldStop(16);
_lbl_cc.runMethod(true,"setTextColor",ac_tansfer.mostCurrent.__c.getField(false,"Colors").getField(true,"DarkGray"));
 BA.debugLineNum = 166;BA.debugLine="lbl_cc.TextSize=14";
Debug.ShouldStop(32);
_lbl_cc.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 167;BA.debugLine="lbl_cc.Typeface=Typeface.LoadFromAssets(\"iran_san";
Debug.ShouldStop(64);
_lbl_cc.runMethod(false,"setTypeface",ac_tansfer.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("iran_sans.ttf"))));
 BA.debugLineNum = 168;BA.debugLine="Select type_s";
Debug.ShouldStop(128);
switch (BA.switchObjectToInt(ac_tansfer._type_s,BA.numberCast(int.class, 0),BA.numberCast(int.class, 1))) {
case 0: {
 BA.debugLineNum = 170;BA.debugLine="lbl_cc.Text=\"کد کاربری شما : \"&i_pk";
Debug.ShouldStop(512);
_lbl_cc.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("کد کاربری شما : "),ac_tansfer.mostCurrent._i_pk)));
 break; }
case 1: {
 BA.debugLineNum = 173;BA.debugLine="lbl_cc.Text=\"کد کاربری شما : \"&userid_t";
Debug.ShouldStop(4096);
_lbl_cc.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("کد کاربری شما : "),ac_tansfer.mostCurrent._userid_t)));
 break; }
}
;
 BA.debugLineNum = 176;BA.debugLine="lbl_cc.Gravity=Gravity.CENTER_VERTICAL+Gravity.CE";
Debug.ShouldStop(32768);
_lbl_cc.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {ac_tansfer.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL"),ac_tansfer.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL")}, "+",1, 1));
 BA.debugLineNum = 177;BA.debugLine="pnl_card.AddView(lbl_cc,5%x,lbl_a.Top+lbl_a.Heigh";
Debug.ShouldStop(65536);
_pnl_card.runVoidMethod ("AddView",(Object)((_lbl_cc.getObject())),(Object)(ac_tansfer.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),ac_tansfer.mostCurrent.activityBA)),(Object)(RemoteObject.solve(new RemoteObject[] {_lbl_a.runMethod(true,"getTop"),_lbl_a.runMethod(true,"getHeight"),ac_tansfer.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 1)),ac_tansfer.mostCurrent.activityBA)}, "++",2, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {_pnl_card.runMethod(true,"getWidth"),ac_tansfer.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),ac_tansfer.mostCurrent.activityBA)}, "-",1, 1)),(Object)(ac_tansfer.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),ac_tansfer.mostCurrent.activityBA)));
 BA.debugLineNum = 180;BA.debugLine="Dim bg As ColorDrawable";
Debug.ShouldStop(524288);
_bg = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("bg", _bg);
 BA.debugLineNum = 181;BA.debugLine="bg.Initialize2(Colors.Transparent,5%x,2dip,Colors";
Debug.ShouldStop(1048576);
_bg.runVoidMethod ("Initialize2",(Object)(ac_tansfer.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent")),(Object)(ac_tansfer.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),ac_tansfer.mostCurrent.activityBA)),(Object)(ac_tansfer.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))),(Object)(ac_tansfer.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray")));
 BA.debugLineNum = 182;BA.debugLine="edit_target.Initialize(\"edit_target\")";
Debug.ShouldStop(2097152);
ac_tansfer.mostCurrent._edit_target.runVoidMethod ("Initialize",ac_tansfer.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("edit_target")));
 BA.debugLineNum = 183;BA.debugLine="edit_target.TextColor=Colors.DarkGray";
Debug.ShouldStop(4194304);
ac_tansfer.mostCurrent._edit_target.runMethod(true,"setTextColor",ac_tansfer.mostCurrent.__c.getField(false,"Colors").getField(true,"DarkGray"));
 BA.debugLineNum = 184;BA.debugLine="edit_target.TextSize=14";
Debug.ShouldStop(8388608);
ac_tansfer.mostCurrent._edit_target.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 185;BA.debugLine="edit_target.Typeface=Typeface.LoadFromAssets(\"ira";
Debug.ShouldStop(16777216);
ac_tansfer.mostCurrent._edit_target.runMethod(false,"setTypeface",ac_tansfer.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("iran_sans.ttf"))));
 BA.debugLineNum = 186;BA.debugLine="edit_target.Gravity=Gravity.CENTER_VERTICAL+Gravi";
Debug.ShouldStop(33554432);
ac_tansfer.mostCurrent._edit_target.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {ac_tansfer.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL"),ac_tansfer.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL")}, "+",1, 1));
 BA.debugLineNum = 187;BA.debugLine="edit_target.Hint=\"کد کاربری مورد نظر شما\"";
Debug.ShouldStop(67108864);
ac_tansfer.mostCurrent._edit_target.runMethod(true,"setHint",BA.ObjectToString("کد کاربری مورد نظر شما"));
 BA.debugLineNum = 188;BA.debugLine="edit_target.HintColor=Colors.LightGray";
Debug.ShouldStop(134217728);
ac_tansfer.mostCurrent._edit_target.runMethod(true,"setHintColor",ac_tansfer.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray"));
 BA.debugLineNum = 189;BA.debugLine="edit_target.Background=bg";
Debug.ShouldStop(268435456);
ac_tansfer.mostCurrent._edit_target.runMethod(false,"setBackground",(_bg.getObject()));
 BA.debugLineNum = 190;BA.debugLine="edit_target.InputType=edit_target.INPUT_TYPE_NUMB";
Debug.ShouldStop(536870912);
ac_tansfer.mostCurrent._edit_target.runMethod(true,"setInputType",ac_tansfer.mostCurrent._edit_target.getField(true,"INPUT_TYPE_NUMBERS"));
 BA.debugLineNum = 191;BA.debugLine="pnl_card.AddView(edit_target,5%x,lbl_cc.Top+lbl_c";
Debug.ShouldStop(1073741824);
_pnl_card.runVoidMethod ("AddView",(Object)((ac_tansfer.mostCurrent._edit_target.getObject())),(Object)(ac_tansfer.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),ac_tansfer.mostCurrent.activityBA)),(Object)(RemoteObject.solve(new RemoteObject[] {_lbl_cc.runMethod(true,"getTop"),_lbl_cc.runMethod(true,"getHeight"),ac_tansfer.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),ac_tansfer.mostCurrent.activityBA)}, "++",2, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {_pnl_card.runMethod(true,"getWidth"),ac_tansfer.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),ac_tansfer.mostCurrent.activityBA)}, "-",1, 1)),(Object)(ac_tansfer.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 12)),ac_tansfer.mostCurrent.activityBA)));
 BA.debugLineNum = 193;BA.debugLine="Dim bg As ColorDrawable";
Debug.ShouldStop(1);
_bg = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("bg", _bg);
 BA.debugLineNum = 194;BA.debugLine="bg.Initialize2(Colors.Transparent,5%x,2dip,Colors";
Debug.ShouldStop(2);
_bg.runVoidMethod ("Initialize2",(Object)(ac_tansfer.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent")),(Object)(ac_tansfer.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),ac_tansfer.mostCurrent.activityBA)),(Object)(ac_tansfer.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))),(Object)(ac_tansfer.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray")));
 BA.debugLineNum = 196;BA.debugLine="edit_nums.Initialize(\"edit_nums\")";
Debug.ShouldStop(8);
ac_tansfer.mostCurrent._edit_nums.runVoidMethod ("Initialize",ac_tansfer.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("edit_nums")));
 BA.debugLineNum = 197;BA.debugLine="edit_nums.TextColor=Colors.DarkGray";
Debug.ShouldStop(16);
ac_tansfer.mostCurrent._edit_nums.runMethod(true,"setTextColor",ac_tansfer.mostCurrent.__c.getField(false,"Colors").getField(true,"DarkGray"));
 BA.debugLineNum = 198;BA.debugLine="edit_nums.TextSize=14";
Debug.ShouldStop(32);
ac_tansfer.mostCurrent._edit_nums.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 199;BA.debugLine="edit_nums.Typeface=Typeface.LoadFromAssets(\"iran_";
Debug.ShouldStop(64);
ac_tansfer.mostCurrent._edit_nums.runMethod(false,"setTypeface",ac_tansfer.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("iran_sans.ttf"))));
 BA.debugLineNum = 200;BA.debugLine="edit_nums.Gravity=Gravity.CENTER_VERTICAL+Gravity";
Debug.ShouldStop(128);
ac_tansfer.mostCurrent._edit_nums.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {ac_tansfer.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL"),ac_tansfer.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL")}, "+",1, 1));
 BA.debugLineNum = 201;BA.debugLine="edit_nums.Hint=\"تعداد سکه های مورد نیاز جهت انتقا";
Debug.ShouldStop(256);
ac_tansfer.mostCurrent._edit_nums.runMethod(true,"setHint",BA.ObjectToString("تعداد سکه های مورد نیاز جهت انتقال"));
 BA.debugLineNum = 202;BA.debugLine="edit_nums.HintColor=Colors.LightGray";
Debug.ShouldStop(512);
ac_tansfer.mostCurrent._edit_nums.runMethod(true,"setHintColor",ac_tansfer.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray"));
 BA.debugLineNum = 203;BA.debugLine="edit_nums.Background=bg";
Debug.ShouldStop(1024);
ac_tansfer.mostCurrent._edit_nums.runMethod(false,"setBackground",(_bg.getObject()));
 BA.debugLineNum = 204;BA.debugLine="edit_nums.InputType=edit_nums.INPUT_TYPE_NUMBERS";
Debug.ShouldStop(2048);
ac_tansfer.mostCurrent._edit_nums.runMethod(true,"setInputType",ac_tansfer.mostCurrent._edit_nums.getField(true,"INPUT_TYPE_NUMBERS"));
 BA.debugLineNum = 205;BA.debugLine="pnl_card.AddView(edit_nums,5%x,edit_target.Top+ed";
Debug.ShouldStop(4096);
_pnl_card.runVoidMethod ("AddView",(Object)((ac_tansfer.mostCurrent._edit_nums.getObject())),(Object)(ac_tansfer.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),ac_tansfer.mostCurrent.activityBA)),(Object)(RemoteObject.solve(new RemoteObject[] {ac_tansfer.mostCurrent._edit_target.runMethod(true,"getTop"),ac_tansfer.mostCurrent._edit_target.runMethod(true,"getHeight"),ac_tansfer.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),ac_tansfer.mostCurrent.activityBA)}, "++",2, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {_pnl_card.runMethod(true,"getWidth"),ac_tansfer.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),ac_tansfer.mostCurrent.activityBA)}, "-",1, 1)),(Object)(ac_tansfer.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 12)),ac_tansfer.mostCurrent.activityBA)));
 BA.debugLineNum = 208;BA.debugLine="Dim lbl_send As Label";
Debug.ShouldStop(32768);
_lbl_send = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl_send", _lbl_send);
 BA.debugLineNum = 209;BA.debugLine="lbl_send.Initialize(\"lbl_send\")";
Debug.ShouldStop(65536);
_lbl_send.runVoidMethod ("Initialize",ac_tansfer.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("lbl_send")));
 BA.debugLineNum = 210;BA.debugLine="lbl_send.TextColor=Colors.White";
Debug.ShouldStop(131072);
_lbl_send.runMethod(true,"setTextColor",ac_tansfer.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 211;BA.debugLine="lbl_send.TextSize=17";
Debug.ShouldStop(262144);
_lbl_send.runMethod(true,"setTextSize",BA.numberCast(float.class, 17));
 BA.debugLineNum = 212;BA.debugLine="lbl_send.Typeface=Typeface.LoadFromAssets(\"iran_s";
Debug.ShouldStop(524288);
_lbl_send.runMethod(false,"setTypeface",ac_tansfer.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("iran_sans.ttf"))));
 BA.debugLineNum = 213;BA.debugLine="lbl_send.Text=\"انجام انتقال سکه\"";
Debug.ShouldStop(1048576);
_lbl_send.runMethod(true,"setText",BA.ObjectToCharSequence("انجام انتقال سکه"));
 BA.debugLineNum = 214;BA.debugLine="lbl_send.Background=bg1";
Debug.ShouldStop(2097152);
_lbl_send.runMethod(false,"setBackground",(ac_tansfer.mostCurrent._bg1.getObject()));
 BA.debugLineNum = 215;BA.debugLine="lbl_send.Gravity=Gravity.CENTER_VERTICAL+Gravity.";
Debug.ShouldStop(4194304);
_lbl_send.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {ac_tansfer.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL"),ac_tansfer.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL")}, "+",1, 1));
 BA.debugLineNum = 216;BA.debugLine="pnl_card.AddView(lbl_send,5%x,edit_nums.Top+edit_";
Debug.ShouldStop(8388608);
_pnl_card.runVoidMethod ("AddView",(Object)((_lbl_send.getObject())),(Object)(ac_tansfer.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),ac_tansfer.mostCurrent.activityBA)),(Object)(RemoteObject.solve(new RemoteObject[] {ac_tansfer.mostCurrent._edit_nums.runMethod(true,"getTop"),ac_tansfer.mostCurrent._edit_nums.runMethod(true,"getHeight"),ac_tansfer.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),ac_tansfer.mostCurrent.activityBA)}, "++",2, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {_pnl_card.runMethod(true,"getWidth"),ac_tansfer.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),ac_tansfer.mostCurrent.activityBA)}, "-",1, 1)),(Object)(ac_tansfer.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 12)),ac_tansfer.mostCurrent.activityBA)));
 BA.debugLineNum = 218;BA.debugLine="pnl_card.Height=lbl_send.Top+lbl_send.Height+5%x";
Debug.ShouldStop(33554432);
_pnl_card.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {_lbl_send.runMethod(true,"getTop"),_lbl_send.runMethod(true,"getHeight"),ac_tansfer.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),ac_tansfer.mostCurrent.activityBA)}, "++",2, 1));
 BA.debugLineNum = 219;BA.debugLine="card.Height=pnl_card.Height";
Debug.ShouldStop(67108864);
_card.runMethod(true,"setHeight",_pnl_card.runMethod(true,"getHeight"));
 BA.debugLineNum = 220;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (ac_tansfer) ","ac_tansfer",5,ac_tansfer.mostCurrent.activityBA,ac_tansfer.mostCurrent,226);
if (RapidSub.canDelegate("activity_pause")) { return com.it.fome.ac_tansfer.remoteMe.runUserSub(false, "ac_tansfer","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 226;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(2);
 BA.debugLineNum = 228;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (ac_tansfer) ","ac_tansfer",5,ac_tansfer.mostCurrent.activityBA,ac_tansfer.mostCurrent,222);
if (RapidSub.canDelegate("activity_resume")) { return com.it.fome.ac_tansfer.remoteMe.runUserSub(false, "ac_tansfer","activity_resume");}
 BA.debugLineNum = 222;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 224;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 16;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 18;BA.debugLine="Dim meno As Label";
ac_tansfer.mostCurrent._meno = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Dim pnl_coins As Panel";
ac_tansfer.mostCurrent._pnl_coins = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Dim lbl_icon ,lbl_nums As Label";
ac_tansfer.mostCurrent._lbl_icon = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
ac_tansfer.mostCurrent._lbl_nums = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Dim roundview As MC7RoundView";
ac_tansfer.mostCurrent._roundview = RemoteObject.createNew ("com.flycoroundview.mc7.MC7RoundView");
 //BA.debugLineNum = 22;BA.debugLine="Dim username_t ,userid_t As String";
ac_tansfer.mostCurrent._username_t = RemoteObject.createImmutable("");
ac_tansfer.mostCurrent._userid_t = RemoteObject.createImmutable("");
 //BA.debugLineNum = 23;BA.debugLine="Dim i_username ,i_pk,i_cookie,i_pic As String";
ac_tansfer.mostCurrent._i_username = RemoteObject.createImmutable("");
ac_tansfer.mostCurrent._i_pk = RemoteObject.createImmutable("");
ac_tansfer.mostCurrent._i_cookie = RemoteObject.createImmutable("");
ac_tansfer.mostCurrent._i_pic = RemoteObject.createImmutable("");
 //BA.debugLineNum = 24;BA.debugLine="Dim edit_nums As EditText";
ac_tansfer.mostCurrent._edit_nums = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Dim edit_target As EditText";
ac_tansfer.mostCurrent._edit_target = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Dim mtoast As KJ_MaterialToast";
ac_tansfer.mostCurrent._mtoast = RemoteObject.createNew ("com.valdesekamdem.library.mdtoast.MaterialToast");
 //BA.debugLineNum = 27;BA.debugLine="Private progressDialog As MaterialDialog";
ac_tansfer.mostCurrent._progressdialog = RemoteObject.createNew ("de.amberhome.materialdialogs.MaterialDialogWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Dim bg1 As ColorDrawable";
ac_tansfer.mostCurrent._bg1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");
 //BA.debugLineNum = 29;BA.debugLine="Dim mimeno As mi_meno";
ac_tansfer.mostCurrent._mimeno = RemoteObject.createNew ("com.it.fome.mi_meno");
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _lbl_send_click() throws Exception{
try {
		Debug.PushSubsStack("lbl_send_Click (ac_tansfer) ","ac_tansfer",5,ac_tansfer.mostCurrent.activityBA,ac_tansfer.mostCurrent,230);
if (RapidSub.canDelegate("lbl_send_click")) { return com.it.fome.ac_tansfer.remoteMe.runUserSub(false, "ac_tansfer","lbl_send_click");}
RemoteObject _builder = RemoteObject.declareNull("de.amberhome.materialdialogs.MaterialDialogBuilderWrapper");
 BA.debugLineNum = 230;BA.debugLine="Sub lbl_send_Click";
Debug.ShouldStop(32);
 BA.debugLineNum = 231;BA.debugLine="If edit_target.Text=\"\" Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",ac_tansfer.mostCurrent._edit_target.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 233;BA.debugLine="mtoast.Initialize(\"فیلد کاربر مورد نظر نمی تواند";
Debug.ShouldStop(256);
ac_tansfer.mostCurrent._mtoast.runVoidMethod ("Initialize",ac_tansfer.mostCurrent.activityBA,(Object)(BA.ObjectToString("فیلد کاربر مورد نظر نمی تواند خالی باشد")),(Object)(ac_tansfer.mostCurrent._mtoast.getField(true,"LENGTH_SHORT")),(Object)(ac_tansfer.mostCurrent._mtoast.getField(true,"TYPE_INFO")));
 BA.debugLineNum = 234;BA.debugLine="Return";
Debug.ShouldStop(512);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 237;BA.debugLine="If edit_nums.Text=\"\" Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",ac_tansfer.mostCurrent._edit_nums.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 239;BA.debugLine="mtoast.Initialize(\"فیلد تعداد سکه نمی تواند خالی";
Debug.ShouldStop(16384);
ac_tansfer.mostCurrent._mtoast.runVoidMethod ("Initialize",ac_tansfer.mostCurrent.activityBA,(Object)(BA.ObjectToString("فیلد تعداد سکه نمی تواند خالی باشد")),(Object)(ac_tansfer.mostCurrent._mtoast.getField(true,"LENGTH_SHORT")),(Object)(ac_tansfer.mostCurrent._mtoast.getField(true,"TYPE_INFO")));
 BA.debugLineNum = 240;BA.debugLine="Return";
Debug.ShouldStop(32768);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 243;BA.debugLine="Select type_s";
Debug.ShouldStop(262144);
switch (BA.switchObjectToInt(ac_tansfer._type_s,BA.numberCast(int.class, 0),BA.numberCast(int.class, 1))) {
case 0: {
 BA.debugLineNum = 245;BA.debugLine="req_tarns(i_pk,edit_target.Text,edit_nums.Text,";
Debug.ShouldStop(1048576);
_req_tarns(ac_tansfer.mostCurrent._i_pk,ac_tansfer.mostCurrent._edit_target.runMethod(true,"getText"),ac_tansfer.mostCurrent._edit_nums.runMethod(true,"getText"),RemoteObject.createImmutable("0"));
 BA.debugLineNum = 247;BA.debugLine="Dim Builder As MaterialDialogBuilder";
Debug.ShouldStop(4194304);
_builder = RemoteObject.createNew ("de.amberhome.materialdialogs.MaterialDialogBuilderWrapper");Debug.locals.put("Builder", _builder);
 BA.debugLineNum = 248;BA.debugLine="Builder.Initialize(\"Dialog\")";
Debug.ShouldStop(8388608);
_builder.runVoidMethod ("Initialize",ac_tansfer.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Dialog")));
 BA.debugLineNum = 249;BA.debugLine="Builder.Title(\"انتقال سکه\")";
Debug.ShouldStop(16777216);
_builder.runVoidMethod ("Title",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("انتقال سکه"))));
 BA.debugLineNum = 250;BA.debugLine="Builder.Content(\"درحال ثبت ...\")";
Debug.ShouldStop(33554432);
_builder.runVoidMethod ("Content",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("درحال ثبت ..."))));
 BA.debugLineNum = 251;BA.debugLine="Builder.Progress(True, 0)";
Debug.ShouldStop(67108864);
_builder.runVoidMethod ("Progress",(Object)(ac_tansfer.mostCurrent.__c.getField(true,"True")),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 252;BA.debugLine="Builder.ProgressIndeterminateStyle(True)";
Debug.ShouldStop(134217728);
_builder.runVoidMethod ("ProgressIndeterminateStyle",(Object)(ac_tansfer.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 253;BA.debugLine="progressDialog = Builder.Show";
Debug.ShouldStop(268435456);
ac_tansfer.mostCurrent._progressdialog = _builder.runMethod(false,"Show");
 break; }
case 1: {
 BA.debugLineNum = 256;BA.debugLine="req_tarns(userid_t,edit_target.Text,edit_nums.T";
Debug.ShouldStop(-2147483648);
_req_tarns(ac_tansfer.mostCurrent._userid_t,ac_tansfer.mostCurrent._edit_target.runMethod(true,"getText"),ac_tansfer.mostCurrent._edit_nums.runMethod(true,"getText"),RemoteObject.createImmutable("1"));
 BA.debugLineNum = 257;BA.debugLine="Dim Builder As MaterialDialogBuilder";
Debug.ShouldStop(1);
_builder = RemoteObject.createNew ("de.amberhome.materialdialogs.MaterialDialogBuilderWrapper");Debug.locals.put("Builder", _builder);
 BA.debugLineNum = 258;BA.debugLine="Builder.Initialize(\"Dialog\")";
Debug.ShouldStop(2);
_builder.runVoidMethod ("Initialize",ac_tansfer.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Dialog")));
 BA.debugLineNum = 259;BA.debugLine="Builder.Title(\"انتقال سکه\")";
Debug.ShouldStop(4);
_builder.runVoidMethod ("Title",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("انتقال سکه"))));
 BA.debugLineNum = 260;BA.debugLine="Builder.Content(\"درحال ثبت ...\")";
Debug.ShouldStop(8);
_builder.runVoidMethod ("Content",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("درحال ثبت ..."))));
 BA.debugLineNum = 261;BA.debugLine="Builder.Progress(True, 0)";
Debug.ShouldStop(16);
_builder.runVoidMethod ("Progress",(Object)(ac_tansfer.mostCurrent.__c.getField(true,"True")),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 262;BA.debugLine="Builder.ProgressIndeterminateStyle(True)";
Debug.ShouldStop(32);
_builder.runVoidMethod ("ProgressIndeterminateStyle",(Object)(ac_tansfer.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 263;BA.debugLine="progressDialog = Builder.Show";
Debug.ShouldStop(64);
ac_tansfer.mostCurrent._progressdialog = _builder.runMethod(false,"Show");
 break; }
}
;
 BA.debugLineNum = 268;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _meno_click() throws Exception{
try {
		Debug.PushSubsStack("meno_Click (ac_tansfer) ","ac_tansfer",5,ac_tansfer.mostCurrent.activityBA,ac_tansfer.mostCurrent,464);
if (RapidSub.canDelegate("meno_click")) { return com.it.fome.ac_tansfer.remoteMe.runUserSub(false, "ac_tansfer","meno_click");}
 BA.debugLineNum = 464;BA.debugLine="Sub meno_Click";
Debug.ShouldStop(32768);
 BA.debugLineNum = 465;BA.debugLine="mimeno.Initialize(\"mimeno\",Me)";
Debug.ShouldStop(65536);
ac_tansfer.mostCurrent._mimeno.runClassMethod (com.it.fome.mi_meno.class, "_initialize" /*RemoteObject*/ ,ac_tansfer.mostCurrent.activityBA,(Object)(BA.ObjectToString("mimeno")),(Object)(ac_tansfer.getObject()));
 BA.debugLineNum = 466;BA.debugLine="mimeno.addpnl";
Debug.ShouldStop(131072);
ac_tansfer.mostCurrent._mimeno.runClassMethod (com.it.fome.mi_meno.class, "_addpnl" /*RemoteObject*/ );
 BA.debugLineNum = 467;BA.debugLine="mimeno.open";
Debug.ShouldStop(262144);
ac_tansfer.mostCurrent._mimeno.runClassMethod (com.it.fome.mi_meno.class, "_open" /*RemoteObject*/ );
 BA.debugLineNum = 468;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _prfn_onpoststringerrorlistener(RemoteObject _error,RemoteObject _tag) throws Exception{
try {
		Debug.PushSubsStack("prfn_onPostStringErrorListener (ac_tansfer) ","ac_tansfer",5,ac_tansfer.mostCurrent.activityBA,ac_tansfer.mostCurrent,328);
if (RapidSub.canDelegate("prfn_onpoststringerrorlistener")) { return com.it.fome.ac_tansfer.remoteMe.runUserSub(false, "ac_tansfer","prfn_onpoststringerrorlistener", _error, _tag);}
Debug.locals.put("Error", _error);
Debug.locals.put("Tag", _tag);
 BA.debugLineNum = 328;BA.debugLine="Sub prfn_onPostStringErrorListener(Error As Respon";
Debug.ShouldStop(128);
 BA.debugLineNum = 330;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(512);
ac_tansfer.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 331;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _prfn_onpoststringoklistener(RemoteObject _result,RemoteObject _tag) throws Exception{
try {
		Debug.PushSubsStack("prfn_onPostStringOkListener (ac_tansfer) ","ac_tansfer",5,ac_tansfer.mostCurrent.activityBA,ac_tansfer.mostCurrent,333);
if (RapidSub.canDelegate("prfn_onpoststringoklistener")) { return com.it.fome.ac_tansfer.remoteMe.runUserSub(false, "ac_tansfer","prfn_onpoststringoklistener", _result, _tag);}
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
RemoteObject _n_coins = RemoteObject.createImmutable(0L);
RemoteObject _c_f = RemoteObject.createImmutable("");
RemoteObject _pic = RemoteObject.createImmutable("");
RemoteObject _statusx = RemoteObject.createImmutable("");
RemoteObject _isuserx = RemoteObject.createImmutable("");
RemoteObject _mojodix = RemoteObject.createImmutable("");
Debug.locals.put("Tag", _tag);
 BA.debugLineNum = 333;BA.debugLine="Sub prfn_onPostStringOkListener(Result As String";
Debug.ShouldStop(4096);
 BA.debugLineNum = 334;BA.debugLine="Log(Result)";
Debug.ShouldStop(8192);
ac_tansfer.mostCurrent.__c.runVoidMethod ("LogImpl","66160385",_result,0);
 BA.debugLineNum = 335;BA.debugLine="Select Tag";
Debug.ShouldStop(16384);
switch (BA.switchObjectToInt(_tag,BA.ObjectToString("iuser"),BA.ObjectToString("gettele"),BA.ObjectToString("getinsta"),BA.ObjectToString("tansfer"))) {
case 0: {
 BA.debugLineNum = 337;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(65536);
ac_tansfer.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 break; }
case 1: {
 BA.debugLineNum = 340;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(524288);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 341;BA.debugLine="parser.Initialize(Result)";
Debug.ShouldStop(1048576);
_parser.runVoidMethod ("Initialize",(Object)(_result));
 BA.debugLineNum = 342;BA.debugLine="Dim root As List = parser.NextArray";
Debug.ShouldStop(2097152);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_root = _parser.runMethod(false,"NextArray");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 343;BA.debugLine="For Each colroot As Map In root";
Debug.ShouldStop(4194304);
_colroot = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group9 = _root;
final int groupLen9 = group9.runMethod(true,"getSize").<Integer>get()
;int index9 = 0;
;
for (; index9 < groupLen9;index9++){
_colroot.setObject(group9.runMethod(false,"Get",index9));
Debug.locals.put("colroot", _colroot);
 BA.debugLineNum = 344;BA.debugLine="Dim Result As String = colroot.Get(\"result\")";
Debug.ShouldStop(8388608);
_result = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("result")))));Debug.locals.put("Result", _result);Debug.locals.put("Result", _result);
 BA.debugLineNum = 345;BA.debugLine="Dim c_m As String = colroot.Get(\"c_m\")";
Debug.ShouldStop(16777216);
_c_m = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("c_m")))));Debug.locals.put("c_m", _c_m);Debug.locals.put("c_m", _c_m);
 BA.debugLineNum = 346;BA.debugLine="Dim uid As String = colroot.Get(\"uid\")";
Debug.ShouldStop(33554432);
_uid = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("uid")))));Debug.locals.put("uid", _uid);Debug.locals.put("uid", _uid);
 BA.debugLineNum = 347;BA.debugLine="Dim first_last As String = colroot.Get(\"first_";
Debug.ShouldStop(67108864);
_first_last = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("first_last")))));Debug.locals.put("first_last", _first_last);Debug.locals.put("first_last", _first_last);
 BA.debugLineNum = 348;BA.debugLine="Dim id As String = colroot.Get(\"id\")";
Debug.ShouldStop(134217728);
_id = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 349;BA.debugLine="Dim userid As String = colroot.Get(\"userid\")";
Debug.ShouldStop(268435456);
_userid = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("userid")))));Debug.locals.put("userid", _userid);Debug.locals.put("userid", _userid);
 BA.debugLineNum = 350;BA.debugLine="Dim username As String = colroot.Get(\"username";
Debug.ShouldStop(536870912);
_username = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("username")))));Debug.locals.put("username", _username);Debug.locals.put("username", _username);
 BA.debugLineNum = 351;BA.debugLine="Dim c_ch As String = colroot.Get(\"c_ch\")";
Debug.ShouldStop(1073741824);
_c_ch = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("c_ch")))));Debug.locals.put("c_ch", _c_ch);Debug.locals.put("c_ch", _c_ch);
 BA.debugLineNum = 352;BA.debugLine="Dim n_coins=c_m As Long";
Debug.ShouldStop(-2147483648);
_n_coins = BA.numberCast(long.class, _c_m);Debug.locals.put("n_coins", _n_coins);Debug.locals.put("n_coins", _n_coins);
 BA.debugLineNum = 353;BA.debugLine="If n_coins>100 Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean(">",_n_coins,BA.numberCast(double.class, 100))) { 
 BA.debugLineNum = 354;BA.debugLine="lbl_nums.Text=\"سکه \"&NumberFormat(c_m,3,0)";
Debug.ShouldStop(2);
ac_tansfer.mostCurrent._lbl_nums.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("سکه "),ac_tansfer.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _c_m)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 0))))));
 }else {
 BA.debugLineNum = 356;BA.debugLine="lbl_nums.Text=\"سکه \"&c_m";
Debug.ShouldStop(8);
ac_tansfer.mostCurrent._lbl_nums.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("سکه "),_c_m)));
 };
 BA.debugLineNum = 360;BA.debugLine="sql1.ExecNonQuery(\"UPDATE tbl_coin set cm='\"&c";
Debug.ShouldStop(128);
ac_tansfer._sql1.runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE tbl_coin set cm='"),_c_m,RemoteObject.createImmutable("',cf='"),_c_ch,RemoteObject.createImmutable("' WHERE userid='"),ac_tansfer.mostCurrent._userid_t,RemoteObject.createImmutable("' "))));
 }
}Debug.locals.put("colroot", _colroot);
;
 break; }
case 2: {
 BA.debugLineNum = 364;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(2048);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 365;BA.debugLine="parser.Initialize(Result)";
Debug.ShouldStop(4096);
_parser.runVoidMethod ("Initialize",(Object)(_result));
 BA.debugLineNum = 366;BA.debugLine="Dim root As List = parser.NextArray";
Debug.ShouldStop(8192);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_root = _parser.runMethod(false,"NextArray");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 367;BA.debugLine="For Each colroot As Map In root";
Debug.ShouldStop(16384);
_colroot = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group30 = _root;
final int groupLen30 = group30.runMethod(true,"getSize").<Integer>get()
;int index30 = 0;
;
for (; index30 < groupLen30;index30++){
_colroot.setObject(group30.runMethod(false,"Get",index30));
Debug.locals.put("colroot", _colroot);
 BA.debugLineNum = 368;BA.debugLine="Dim Result As String = colroot.Get(\"result\")";
Debug.ShouldStop(32768);
_result = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("result")))));Debug.locals.put("Result", _result);Debug.locals.put("Result", _result);
 BA.debugLineNum = 369;BA.debugLine="Dim c_m As String = colroot.Get(\"c_m\")";
Debug.ShouldStop(65536);
_c_m = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("c_m")))));Debug.locals.put("c_m", _c_m);Debug.locals.put("c_m", _c_m);
 BA.debugLineNum = 370;BA.debugLine="Dim uid As String = colroot.Get(\"uid\")";
Debug.ShouldStop(131072);
_uid = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("uid")))));Debug.locals.put("uid", _uid);Debug.locals.put("uid", _uid);
 BA.debugLineNum = 371;BA.debugLine="Dim id As String = colroot.Get(\"id\")";
Debug.ShouldStop(262144);
_id = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 372;BA.debugLine="Dim c_f As String = colroot.Get(\"c_f\")";
Debug.ShouldStop(524288);
_c_f = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("c_f")))));Debug.locals.put("c_f", _c_f);Debug.locals.put("c_f", _c_f);
 BA.debugLineNum = 373;BA.debugLine="Dim pic As String = colroot.Get(\"pic\")";
Debug.ShouldStop(1048576);
_pic = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("pic")))));Debug.locals.put("pic", _pic);Debug.locals.put("pic", _pic);
 BA.debugLineNum = 374;BA.debugLine="Dim userid As String = colroot.Get(\"userid\")";
Debug.ShouldStop(2097152);
_userid = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("userid")))));Debug.locals.put("userid", _userid);Debug.locals.put("userid", _userid);
 BA.debugLineNum = 375;BA.debugLine="Dim username As String = colroot.Get(\"username";
Debug.ShouldStop(4194304);
_username = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("username")))));Debug.locals.put("username", _username);Debug.locals.put("username", _username);
 BA.debugLineNum = 376;BA.debugLine="Log(c_f)";
Debug.ShouldStop(8388608);
ac_tansfer.mostCurrent.__c.runVoidMethod ("LogImpl","66160427",_c_f,0);
 BA.debugLineNum = 377;BA.debugLine="Dim n_coins=c_m As Long";
Debug.ShouldStop(16777216);
_n_coins = BA.numberCast(long.class, _c_m);Debug.locals.put("n_coins", _n_coins);Debug.locals.put("n_coins", _n_coins);
 BA.debugLineNum = 378;BA.debugLine="If n_coins>100 Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean(">",_n_coins,BA.numberCast(double.class, 100))) { 
 BA.debugLineNum = 379;BA.debugLine="lbl_nums.Text=\"سکه \"&NumberFormat(c_m,3,0)";
Debug.ShouldStop(67108864);
ac_tansfer.mostCurrent._lbl_nums.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("سکه "),ac_tansfer.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _c_m)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 0))))));
 }else {
 BA.debugLineNum = 381;BA.debugLine="lbl_nums.Text=\"سکه \"&c_m";
Debug.ShouldStop(268435456);
ac_tansfer.mostCurrent._lbl_nums.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("سکه "),_c_m)));
 };
 BA.debugLineNum = 385;BA.debugLine="sql1.ExecNonQuery(\"UPDATE tbl_coin set cm='\"&c";
Debug.ShouldStop(1);
ac_tansfer._sql1.runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE tbl_coin set cm='"),_c_m,RemoteObject.createImmutable("',cf='"),_c_f,RemoteObject.createImmutable("' WHERE userid='"),ac_tansfer.mostCurrent._i_pk,RemoteObject.createImmutable("' "))));
 }
}Debug.locals.put("colroot", _colroot);
;
 break; }
case 3: {
 BA.debugLineNum = 389;BA.debugLine="progressDialog.Hide";
Debug.ShouldStop(16);
ac_tansfer.mostCurrent._progressdialog.runVoidMethod ("Hide");
 BA.debugLineNum = 391;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(64);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 392;BA.debugLine="parser.Initialize(Result)";
Debug.ShouldStop(128);
_parser.runVoidMethod ("Initialize",(Object)(_result));
 BA.debugLineNum = 393;BA.debugLine="Dim root As List = parser.NextArray";
Debug.ShouldStop(256);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_root = _parser.runMethod(false,"NextArray");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 394;BA.debugLine="For Each colroot As Map In root";
Debug.ShouldStop(512);
_colroot = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group53 = _root;
final int groupLen53 = group53.runMethod(true,"getSize").<Integer>get()
;int index53 = 0;
;
for (; index53 < groupLen53;index53++){
_colroot.setObject(group53.runMethod(false,"Get",index53));
Debug.locals.put("colroot", _colroot);
 BA.debugLineNum = 396;BA.debugLine="Dim statusx As String = colroot.Get(\"status\")";
Debug.ShouldStop(2048);
_statusx = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("status")))));Debug.locals.put("statusx", _statusx);Debug.locals.put("statusx", _statusx);
 BA.debugLineNum = 397;BA.debugLine="Dim isuserx As String = colroot.Get(\"isuser\")";
Debug.ShouldStop(4096);
_isuserx = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("isuser")))));Debug.locals.put("isuserx", _isuserx);Debug.locals.put("isuserx", _isuserx);
 BA.debugLineNum = 398;BA.debugLine="Dim mojodix As String = colroot.Get(\"mojodi\")";
Debug.ShouldStop(8192);
_mojodix = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("mojodi")))));Debug.locals.put("mojodix", _mojodix);Debug.locals.put("mojodix", _mojodix);
 BA.debugLineNum = 400;BA.debugLine="If isuserx=\"ok\" Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",_isuserx,BA.ObjectToString("ok"))) { 
 BA.debugLineNum = 402;BA.debugLine="If mojodix=\"ok\" Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_mojodix,BA.ObjectToString("ok"))) { 
 BA.debugLineNum = 403;BA.debugLine="mtoast.Initialize(\"با موفقیت انتقال یافت\",mt";
Debug.ShouldStop(262144);
ac_tansfer.mostCurrent._mtoast.runVoidMethod ("Initialize",ac_tansfer.mostCurrent.activityBA,(Object)(BA.ObjectToString("با موفقیت انتقال یافت")),(Object)(ac_tansfer.mostCurrent._mtoast.getField(true,"LENGTH_SHORT")),(Object)(ac_tansfer.mostCurrent._mtoast.getField(true,"TYPE_SUCCESS")));
 BA.debugLineNum = 405;BA.debugLine="Select type_s";
Debug.ShouldStop(1048576);
switch (BA.switchObjectToInt(ac_tansfer._type_s,BA.numberCast(int.class, 0),BA.numberCast(int.class, 1))) {
case 0: {
 BA.debugLineNum = 408;BA.debugLine="Dim c_m As String = colroot.Get(\"c_m\")";
Debug.ShouldStop(8388608);
_c_m = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("c_m")))));Debug.locals.put("c_m", _c_m);Debug.locals.put("c_m", _c_m);
 BA.debugLineNum = 409;BA.debugLine="Dim uid As String = colroot.Get(\"uid\")";
Debug.ShouldStop(16777216);
_uid = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("uid")))));Debug.locals.put("uid", _uid);Debug.locals.put("uid", _uid);
 BA.debugLineNum = 410;BA.debugLine="Dim id As String = colroot.Get(\"id\")";
Debug.ShouldStop(33554432);
_id = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 411;BA.debugLine="Dim c_f As String = colroot.Get(\"c_f\")";
Debug.ShouldStop(67108864);
_c_f = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("c_f")))));Debug.locals.put("c_f", _c_f);Debug.locals.put("c_f", _c_f);
 BA.debugLineNum = 412;BA.debugLine="Dim pic As String = colroot.Get(\"pic\")";
Debug.ShouldStop(134217728);
_pic = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("pic")))));Debug.locals.put("pic", _pic);Debug.locals.put("pic", _pic);
 BA.debugLineNum = 413;BA.debugLine="Dim userid As String = colroot.Get(\"userid";
Debug.ShouldStop(268435456);
_userid = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("userid")))));Debug.locals.put("userid", _userid);Debug.locals.put("userid", _userid);
 BA.debugLineNum = 414;BA.debugLine="Dim username As String = colroot.Get(\"user";
Debug.ShouldStop(536870912);
_username = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("username")))));Debug.locals.put("username", _username);Debug.locals.put("username", _username);
 BA.debugLineNum = 415;BA.debugLine="Log(c_f)";
Debug.ShouldStop(1073741824);
ac_tansfer.mostCurrent.__c.runVoidMethod ("LogImpl","66160466",_c_f,0);
 BA.debugLineNum = 416;BA.debugLine="Dim n_coins=c_m As Long";
Debug.ShouldStop(-2147483648);
_n_coins = BA.numberCast(long.class, _c_m);Debug.locals.put("n_coins", _n_coins);Debug.locals.put("n_coins", _n_coins);
 BA.debugLineNum = 417;BA.debugLine="If n_coins>100 Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean(">",_n_coins,BA.numberCast(double.class, 100))) { 
 BA.debugLineNum = 418;BA.debugLine="lbl_nums.Text=\"سکه \"&NumberFormat(c_m,3,0";
Debug.ShouldStop(2);
ac_tansfer.mostCurrent._lbl_nums.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("سکه "),ac_tansfer.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _c_m)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 0))))));
 }else {
 BA.debugLineNum = 420;BA.debugLine="lbl_nums.Text=\"سکه \"&c_m";
Debug.ShouldStop(8);
ac_tansfer.mostCurrent._lbl_nums.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("سکه "),_c_m)));
 };
 BA.debugLineNum = 422;BA.debugLine="sql1.ExecNonQuery(\"UPDATE tbl_coin set cm=";
Debug.ShouldStop(32);
ac_tansfer._sql1.runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE tbl_coin set cm='"),_c_m,RemoteObject.createImmutable("',cf='"),_c_f,RemoteObject.createImmutable("' WHERE userid='"),ac_tansfer.mostCurrent._i_pk,RemoteObject.createImmutable("' "))));
 break; }
case 1: {
 BA.debugLineNum = 427;BA.debugLine="Dim c_m As String = colroot.Get(\"c_m\")";
Debug.ShouldStop(1024);
_c_m = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("c_m")))));Debug.locals.put("c_m", _c_m);Debug.locals.put("c_m", _c_m);
 BA.debugLineNum = 428;BA.debugLine="Dim uid As String = colroot.Get(\"uid\")";
Debug.ShouldStop(2048);
_uid = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("uid")))));Debug.locals.put("uid", _uid);Debug.locals.put("uid", _uid);
 BA.debugLineNum = 429;BA.debugLine="Dim first_last As String = colroot.Get(\"fi";
Debug.ShouldStop(4096);
_first_last = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("first_last")))));Debug.locals.put("first_last", _first_last);Debug.locals.put("first_last", _first_last);
 BA.debugLineNum = 430;BA.debugLine="Dim id As String = colroot.Get(\"id\")";
Debug.ShouldStop(8192);
_id = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 431;BA.debugLine="Dim userid As String = colroot.Get(\"userid";
Debug.ShouldStop(16384);
_userid = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("userid")))));Debug.locals.put("userid", _userid);Debug.locals.put("userid", _userid);
 BA.debugLineNum = 432;BA.debugLine="Dim username As String = colroot.Get(\"user";
Debug.ShouldStop(32768);
_username = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("username")))));Debug.locals.put("username", _username);Debug.locals.put("username", _username);
 BA.debugLineNum = 433;BA.debugLine="Dim c_ch As String = colroot.Get(\"c_ch\")";
Debug.ShouldStop(65536);
_c_ch = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("c_ch")))));Debug.locals.put("c_ch", _c_ch);Debug.locals.put("c_ch", _c_ch);
 BA.debugLineNum = 434;BA.debugLine="Dim n_coins=c_m As Long";
Debug.ShouldStop(131072);
_n_coins = BA.numberCast(long.class, _c_m);Debug.locals.put("n_coins", _n_coins);Debug.locals.put("n_coins", _n_coins);
 BA.debugLineNum = 435;BA.debugLine="If n_coins>100 Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean(">",_n_coins,BA.numberCast(double.class, 100))) { 
 BA.debugLineNum = 436;BA.debugLine="lbl_nums.Text=\"سکه \"&NumberFormat(c_m,3,0";
Debug.ShouldStop(524288);
ac_tansfer.mostCurrent._lbl_nums.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("سکه "),ac_tansfer.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _c_m)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 0))))));
 }else {
 BA.debugLineNum = 438;BA.debugLine="lbl_nums.Text=\"سکه \"&c_m";
Debug.ShouldStop(2097152);
ac_tansfer.mostCurrent._lbl_nums.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("سکه "),_c_m)));
 };
 BA.debugLineNum = 441;BA.debugLine="sql1.ExecNonQuery(\"UPDATE tbl_coin set cm=";
Debug.ShouldStop(16777216);
ac_tansfer._sql1.runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE tbl_coin set cm='"),_c_m,RemoteObject.createImmutable("',cf='"),_c_ch,RemoteObject.createImmutable("' WHERE userid='"),ac_tansfer.mostCurrent._userid_t,RemoteObject.createImmutable("' "))));
 break; }
}
;
 }else {
 BA.debugLineNum = 448;BA.debugLine="mtoast.Initialize(\"تعداد سکه های انتخابی بیش";
Debug.ShouldStop(-2147483648);
ac_tansfer.mostCurrent._mtoast.runVoidMethod ("Initialize",ac_tansfer.mostCurrent.activityBA,(Object)(BA.ObjectToString("تعداد سکه های انتخابی بیشتر از موجودی شماست")),(Object)(ac_tansfer.mostCurrent._mtoast.getField(true,"LENGTH_LONG")),(Object)(ac_tansfer.mostCurrent._mtoast.getField(true,"TYPE_WARNING")));
 };
 }else {
 BA.debugLineNum = 454;BA.debugLine="mtoast.Initialize(\"کاربر مورد نظر یافت نشد!\"";
Debug.ShouldStop(32);
ac_tansfer.mostCurrent._mtoast.runVoidMethod ("Initialize",ac_tansfer.mostCurrent.activityBA,(Object)(BA.ObjectToString("کاربر مورد نظر یافت نشد!")),(Object)(ac_tansfer.mostCurrent._mtoast.getField(true,"LENGTH_SHORT")),(Object)(ac_tansfer.mostCurrent._mtoast.getField(true,"TYPE_INFO")));
 };
 }
}Debug.locals.put("colroot", _colroot);
;
 break; }
}
;
 BA.debugLineNum = 462;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 8;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 11;BA.debugLine="Private sql1 As SQL";
ac_tansfer._sql1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL");
 //BA.debugLineNum = 12;BA.debugLine="Private cursor1 As Cursor";
ac_tansfer._cursor1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
 //BA.debugLineNum = 13;BA.debugLine="Dim type_s As Int";
ac_tansfer._type_s = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _req_insta(RemoteObject _userid) throws Exception{
try {
		Debug.PushSubsStack("req_insta (ac_tansfer) ","ac_tansfer",5,ac_tansfer.mostCurrent.activityBA,ac_tansfer.mostCurrent,310);
if (RapidSub.canDelegate("req_insta")) { return com.it.fome.ac_tansfer.remoteMe.runUserSub(false, "ac_tansfer","req_insta", _userid);}
RemoteObject _prfn = RemoteObject.declareNull("com.reza.sh.fastnet.Fastnet");
RemoteObject _post = RemoteObject.declareNull("com.reza.sh.fastnet.PostRequestRaper");
Debug.locals.put("userid", _userid);
 BA.debugLineNum = 310;BA.debugLine="Sub req_insta(userid As String)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 311;BA.debugLine="Dim prfn As PersianFastNetwork";
Debug.ShouldStop(4194304);
_prfn = RemoteObject.createNew ("com.reza.sh.fastnet.Fastnet");Debug.locals.put("prfn", _prfn);
 BA.debugLineNum = 312;BA.debugLine="prfn.initialize(\"prfn\")";
Debug.ShouldStop(8388608);
_prfn.runVoidMethod ("initialize",ac_tansfer.processBA,(Object)(RemoteObject.createImmutable("prfn")));
 BA.debugLineNum = 314;BA.debugLine="Dim post As PostRequest";
Debug.ShouldStop(33554432);
_post = RemoteObject.createNew ("com.reza.sh.fastnet.PostRequestRaper");Debug.locals.put("post", _post);
 BA.debugLineNum = 315;BA.debugLine="post=prfn.BuildPostQuery(\"http://filework.ir/INST";
Debug.ShouldStop(67108864);
_post = _prfn.runMethod(false,"BuildPostQuery",(Object)(BA.ObjectToString("http://filework.ir/INSTAFOLLOW/api/req.php")),(Object)(RemoteObject.createImmutable("getinsta")));Debug.locals.put("post", _post);
 BA.debugLineNum = 317;BA.debugLine="post.addHeder(\"User-Agent\",\"Dalvik/1.6.0 (Linux;";
Debug.ShouldStop(268435456);
_post.runVoidMethod ("addHeder",(Object)(BA.ObjectToString("User-Agent")),(Object)(RemoteObject.createImmutable("Dalvik/1.6.0 (Linux; U; Android 4.4.4; SM-A700FD Build/KTU84P)")));
 BA.debugLineNum = 319;BA.debugLine="post.addParametrs(\"ui\",\"1\")";
Debug.ShouldStop(1073741824);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("ui")),(Object)(RemoteObject.createImmutable("1")));
 BA.debugLineNum = 320;BA.debugLine="post.addParametrs(\"userid\",i_pk)";
Debug.ShouldStop(-2147483648);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("userid")),(Object)(ac_tansfer.mostCurrent._i_pk));
 BA.debugLineNum = 322;BA.debugLine="post.addParametrs(\"req\",\"get_acci\")";
Debug.ShouldStop(2);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("req")),(Object)(RemoteObject.createImmutable("get_acci")));
 BA.debugLineNum = 325;BA.debugLine="post.executRequestAsString";
Debug.ShouldStop(16);
_post.runVoidMethod ("executRequestAsString");
 BA.debugLineNum = 326;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _req_tarns(RemoteObject _useridx,RemoteObject _targetx,RemoteObject _numsx,RemoteObject _typex) throws Exception{
try {
		Debug.PushSubsStack("req_tarns (ac_tansfer) ","ac_tansfer",5,ac_tansfer.mostCurrent.activityBA,ac_tansfer.mostCurrent,270);
if (RapidSub.canDelegate("req_tarns")) { return com.it.fome.ac_tansfer.remoteMe.runUserSub(false, "ac_tansfer","req_tarns", _useridx, _targetx, _numsx, _typex);}
RemoteObject _prfn = RemoteObject.declareNull("com.reza.sh.fastnet.Fastnet");
RemoteObject _post = RemoteObject.declareNull("com.reza.sh.fastnet.PostRequestRaper");
Debug.locals.put("useridx", _useridx);
Debug.locals.put("targetx", _targetx);
Debug.locals.put("numsx", _numsx);
Debug.locals.put("typex", _typex);
 BA.debugLineNum = 270;BA.debugLine="Sub req_tarns(useridx As String,targetx As String,";
Debug.ShouldStop(8192);
 BA.debugLineNum = 271;BA.debugLine="Dim prfn As PersianFastNetwork";
Debug.ShouldStop(16384);
_prfn = RemoteObject.createNew ("com.reza.sh.fastnet.Fastnet");Debug.locals.put("prfn", _prfn);
 BA.debugLineNum = 272;BA.debugLine="prfn.initialize(\"prfn\")";
Debug.ShouldStop(32768);
_prfn.runVoidMethod ("initialize",ac_tansfer.processBA,(Object)(RemoteObject.createImmutable("prfn")));
 BA.debugLineNum = 274;BA.debugLine="Dim post As PostRequest";
Debug.ShouldStop(131072);
_post = RemoteObject.createNew ("com.reza.sh.fastnet.PostRequestRaper");Debug.locals.put("post", _post);
 BA.debugLineNum = 275;BA.debugLine="post=prfn.BuildPostQuery(\"http://filework.ir/INST";
Debug.ShouldStop(262144);
_post = _prfn.runMethod(false,"BuildPostQuery",(Object)(BA.ObjectToString("http://filework.ir/INSTAFOLLOW/api/req.php")),(Object)(RemoteObject.createImmutable("tansfer")));Debug.locals.put("post", _post);
 BA.debugLineNum = 277;BA.debugLine="post.addHeder(\"User-Agent\",\"Dalvik/1.6.0 (Linux;";
Debug.ShouldStop(1048576);
_post.runVoidMethod ("addHeder",(Object)(BA.ObjectToString("User-Agent")),(Object)(RemoteObject.createImmutable("Dalvik/1.6.0 (Linux; U; Android 4.4.4; SM-A700FD Build/KTU84P)")));
 BA.debugLineNum = 279;BA.debugLine="post.addParametrs(\"userid\",useridx)";
Debug.ShouldStop(4194304);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("userid")),(Object)(_useridx));
 BA.debugLineNum = 280;BA.debugLine="post.addParametrs(\"target\",targetx)";
Debug.ShouldStop(8388608);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("target")),(Object)(_targetx));
 BA.debugLineNum = 281;BA.debugLine="post.addParametrs(\"nums\",numsx)";
Debug.ShouldStop(16777216);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("nums")),(Object)(_numsx));
 BA.debugLineNum = 282;BA.debugLine="post.addParametrs(\"type\",typex)";
Debug.ShouldStop(33554432);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("type")),(Object)(_typex));
 BA.debugLineNum = 285;BA.debugLine="post.addParametrs(\"req\",\"transfer_coins\")";
Debug.ShouldStop(268435456);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("req")),(Object)(RemoteObject.createImmutable("transfer_coins")));
 BA.debugLineNum = 288;BA.debugLine="post.executRequestAsString";
Debug.ShouldStop(-2147483648);
_post.runVoidMethod ("executRequestAsString");
 BA.debugLineNum = 289;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _req_tele(RemoteObject _userid) throws Exception{
try {
		Debug.PushSubsStack("req_tele (ac_tansfer) ","ac_tansfer",5,ac_tansfer.mostCurrent.activityBA,ac_tansfer.mostCurrent,291);
if (RapidSub.canDelegate("req_tele")) { return com.it.fome.ac_tansfer.remoteMe.runUserSub(false, "ac_tansfer","req_tele", _userid);}
RemoteObject _prfn = RemoteObject.declareNull("com.reza.sh.fastnet.Fastnet");
RemoteObject _post = RemoteObject.declareNull("com.reza.sh.fastnet.PostRequestRaper");
Debug.locals.put("userid", _userid);
 BA.debugLineNum = 291;BA.debugLine="Sub req_tele(userid As String)";
Debug.ShouldStop(4);
 BA.debugLineNum = 292;BA.debugLine="Dim prfn As PersianFastNetwork";
Debug.ShouldStop(8);
_prfn = RemoteObject.createNew ("com.reza.sh.fastnet.Fastnet");Debug.locals.put("prfn", _prfn);
 BA.debugLineNum = 293;BA.debugLine="prfn.initialize(\"prfn\")";
Debug.ShouldStop(16);
_prfn.runVoidMethod ("initialize",ac_tansfer.processBA,(Object)(RemoteObject.createImmutable("prfn")));
 BA.debugLineNum = 295;BA.debugLine="Dim post As PostRequest";
Debug.ShouldStop(64);
_post = RemoteObject.createNew ("com.reza.sh.fastnet.PostRequestRaper");Debug.locals.put("post", _post);
 BA.debugLineNum = 296;BA.debugLine="post=prfn.BuildPostQuery(\"http://filework.ir/INST";
Debug.ShouldStop(128);
_post = _prfn.runMethod(false,"BuildPostQuery",(Object)(BA.ObjectToString("http://filework.ir/INSTAFOLLOW/api/req.php")),(Object)(RemoteObject.createImmutable("gettele")));Debug.locals.put("post", _post);
 BA.debugLineNum = 298;BA.debugLine="post.addHeder(\"User-Agent\",\"Dalvik/1.6.0 (Linux;";
Debug.ShouldStop(512);
_post.runVoidMethod ("addHeder",(Object)(BA.ObjectToString("User-Agent")),(Object)(RemoteObject.createImmutable("Dalvik/1.6.0 (Linux; U; Android 4.4.4; SM-A700FD Build/KTU84P)")));
 BA.debugLineNum = 300;BA.debugLine="post.addParametrs(\"ui\",\"1\")";
Debug.ShouldStop(2048);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("ui")),(Object)(RemoteObject.createImmutable("1")));
 BA.debugLineNum = 301;BA.debugLine="post.addParametrs(\"userid\",userid_t)";
Debug.ShouldStop(4096);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("userid")),(Object)(ac_tansfer.mostCurrent._userid_t));
 BA.debugLineNum = 303;BA.debugLine="post.addParametrs(\"req\",\"get_acct\")";
Debug.ShouldStop(16384);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("req")),(Object)(RemoteObject.createImmutable("get_acct")));
 BA.debugLineNum = 306;BA.debugLine="post.executRequestAsString";
Debug.ShouldStop(131072);
_post.runVoidMethod ("executRequestAsString");
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
}