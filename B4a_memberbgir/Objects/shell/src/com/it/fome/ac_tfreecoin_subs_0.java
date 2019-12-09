package com.it.fome;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class ac_tfreecoin_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (ac_tfreecoin) ","ac_tfreecoin",9,ac_tfreecoin.mostCurrent.activityBA,ac_tfreecoin.mostCurrent,36);
if (RapidSub.canDelegate("activity_create")) { return com.it.fome.ac_tfreecoin.remoteMe.runUserSub(false, "ac_tfreecoin","activity_create", _firsttime);}
int _ig = 0;
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _gradient1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.GradientDrawable");
RemoteObject _clrs = null;
RemoteObject _bkcolor = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
RemoteObject _bkcolor_st = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
RemoteObject _pnlb1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _pnl_main = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _bg = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 36;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(8);
 BA.debugLineNum = 40;BA.debugLine="telegs.Initialize(\"telegs\")";
Debug.ShouldStop(128);
ac_tfreecoin.mostCurrent._telegs.runVoidMethod ("Initialize",ac_tfreecoin.processBA,(Object)(RemoteObject.createImmutable("telegs")));
 BA.debugLineNum = 42;BA.debugLine="For ig=0 To 17";
Debug.ShouldStop(512);
{
final int step2 = 1;
final int limit2 = 17;
_ig = 0 ;
for (;(step2 > 0 && _ig <= limit2) || (step2 < 0 && _ig >= limit2) ;_ig = ((int)(0 + _ig + step2))  ) {
Debug.locals.put("ig", _ig);
 BA.debugLineNum = 43;BA.debugLine="list_com(ig).Initialize";
Debug.ShouldStop(1024);
ac_tfreecoin.mostCurrent._list_com.getArrayElement(false,BA.numberCast(int.class, _ig)).runVoidMethod ("Initialize");
 BA.debugLineNum = 44;BA.debugLine="list_like(ig).Initialize";
Debug.ShouldStop(2048);
ac_tfreecoin.mostCurrent._list_like.getArrayElement(false,BA.numberCast(int.class, _ig)).runVoidMethod ("Initialize");
 BA.debugLineNum = 45;BA.debugLine="list_follow(ig).Initialize";
Debug.ShouldStop(4096);
ac_tfreecoin.mostCurrent._list_follow.getArrayElement(false,BA.numberCast(int.class, _ig)).runVoidMethod ("Initialize");
 }
}Debug.locals.put("ig", _ig);
;
 BA.debugLineNum = 49;BA.debugLine="If File.Exists(File.DirInternal,\"instadb.db\")=Fal";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",ac_tfreecoin.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(ac_tfreecoin.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("instadb.db"))),ac_tfreecoin.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 50;BA.debugLine="File.Copy(File.DirAssets,\"instadb.db\",File.DirIn";
Debug.ShouldStop(131072);
ac_tfreecoin.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(ac_tfreecoin.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("instadb.db")),(Object)(ac_tfreecoin.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("instadb.db")));
 };
 BA.debugLineNum = 52;BA.debugLine="If sql1.IsInitialized=False Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",ac_tfreecoin._sql1.runMethod(true,"IsInitialized"),ac_tfreecoin.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 53;BA.debugLine="sql1.Initialize(File.DirInternal,\"instadb.db\",Fa";
Debug.ShouldStop(1048576);
ac_tfreecoin._sql1.runVoidMethod ("Initialize",(Object)(ac_tfreecoin.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("instadb.db")),(Object)(ac_tfreecoin.mostCurrent.__c.getField(true,"False")));
 };
 BA.debugLineNum = 57;BA.debugLine="cursor1 = sql1.ExecQuery(\"SELECT * FROM tbl_tele";
Debug.ShouldStop(16777216);
ac_tfreecoin._cursor1.setObject(ac_tfreecoin._sql1.runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT * FROM tbl_tele WHERE soich='1'"))));
 BA.debugLineNum = 58;BA.debugLine="Dim i As Int";
Debug.ShouldStop(33554432);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 59;BA.debugLine="For i=0 To cursor1.RowCount-1";
Debug.ShouldStop(67108864);
{
final int step15 = 1;
final int limit15 = RemoteObject.solve(new RemoteObject[] {ac_tfreecoin._cursor1.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step15 > 0 && _i.<Integer>get().intValue() <= limit15) || (step15 < 0 && _i.<Integer>get().intValue() >= limit15) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step15))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 60;BA.debugLine="cursor1.Position=i";
Debug.ShouldStop(134217728);
ac_tfreecoin._cursor1.runMethod(true,"setPosition",_i);
 BA.debugLineNum = 61;BA.debugLine="userid_t=cursor1.GetString(\"userid\")";
Debug.ShouldStop(268435456);
ac_tfreecoin.mostCurrent._userid_t = ac_tfreecoin._cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("userid")));
 BA.debugLineNum = 62;BA.debugLine="username_t=cursor1.GetString(\"username\")";
Debug.ShouldStop(536870912);
ac_tfreecoin.mostCurrent._username_t = ac_tfreecoin._cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("username")));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 64;BA.debugLine="cursor1.Close";
Debug.ShouldStop(-2147483648);
ac_tfreecoin._cursor1.runVoidMethod ("Close");
 BA.debugLineNum = 67;BA.debugLine="Dim Gradient1 As GradientDrawable";
Debug.ShouldStop(4);
_gradient1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.GradientDrawable");Debug.locals.put("Gradient1", _gradient1);
 BA.debugLineNum = 68;BA.debugLine="Dim Clrs(5) As Int";
Debug.ShouldStop(8);
_clrs = RemoteObject.createNewArray ("int", new int[] {5}, new Object[]{});Debug.locals.put("Clrs", _clrs);
 BA.debugLineNum = 69;BA.debugLine="Clrs(0) = 0xFFe8eaf6";
Debug.ShouldStop(16);
_clrs.setArrayElement (BA.numberCast(int.class, 0xffe8eaf6),BA.numberCast(int.class, 0));
 BA.debugLineNum = 70;BA.debugLine="Clrs(1) = 0xFFe8eaf6";
Debug.ShouldStop(32);
_clrs.setArrayElement (BA.numberCast(int.class, 0xffe8eaf6),BA.numberCast(int.class, 1));
 BA.debugLineNum = 71;BA.debugLine="Clrs(2) = 0xFFe8eaf6";
Debug.ShouldStop(64);
_clrs.setArrayElement (BA.numberCast(int.class, 0xffe8eaf6),BA.numberCast(int.class, 2));
 BA.debugLineNum = 72;BA.debugLine="Clrs(3) = 0xFF283593";
Debug.ShouldStop(128);
_clrs.setArrayElement (BA.numberCast(int.class, 0xff283593),BA.numberCast(int.class, 3));
 BA.debugLineNum = 73;BA.debugLine="Clrs(4) = 0xFF283593";
Debug.ShouldStop(256);
_clrs.setArrayElement (BA.numberCast(int.class, 0xff283593),BA.numberCast(int.class, 4));
 BA.debugLineNum = 75;BA.debugLine="Gradient1.Initialize(\"TOP_BOTTOM\", Clrs)";
Debug.ShouldStop(1024);
_gradient1.runVoidMethod ("Initialize",(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.drawable.GradientDrawable.Orientation"),"TOP_BOTTOM")),(Object)(_clrs));
 BA.debugLineNum = 76;BA.debugLine="Activity.Background=Gradient1";
Debug.ShouldStop(2048);
ac_tfreecoin.mostCurrent._activity.runMethod(false,"setBackground",(_gradient1.getObject()));
 BA.debugLineNum = 78;BA.debugLine="Dim bkcolor As ColorDrawable";
Debug.ShouldStop(8192);
_bkcolor = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("bkcolor", _bkcolor);
 BA.debugLineNum = 79;BA.debugLine="bkcolor.Initialize(Colors.White,8)";
Debug.ShouldStop(16384);
_bkcolor.runVoidMethod ("Initialize",(Object)(ac_tfreecoin.mostCurrent.__c.getField(false,"Colors").getField(true,"White")),(Object)(BA.numberCast(int.class, 8)));
 BA.debugLineNum = 80;BA.debugLine="meno.Initialize(\"meno\")";
Debug.ShouldStop(32768);
ac_tfreecoin.mostCurrent._meno.runVoidMethod ("Initialize",ac_tfreecoin.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("meno")));
 BA.debugLineNum = 81;BA.debugLine="meno.TextColor=Colors.DarkGray";
Debug.ShouldStop(65536);
ac_tfreecoin.mostCurrent._meno.runMethod(true,"setTextColor",ac_tfreecoin.mostCurrent.__c.getField(false,"Colors").getField(true,"DarkGray"));
 BA.debugLineNum = 82;BA.debugLine="meno.TextSize=37";
Debug.ShouldStop(131072);
ac_tfreecoin.mostCurrent._meno.runMethod(true,"setTextSize",BA.numberCast(float.class, 37));
 BA.debugLineNum = 83;BA.debugLine="meno.Background=bkcolor";
Debug.ShouldStop(262144);
ac_tfreecoin.mostCurrent._meno.runMethod(false,"setBackground",(_bkcolor.getObject()));
 BA.debugLineNum = 84;BA.debugLine="meno.Typeface=Typeface.MATERIALICONS";
Debug.ShouldStop(524288);
ac_tfreecoin.mostCurrent._meno.runMethod(false,"setTypeface",ac_tfreecoin.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"getMATERIALICONS"));
 BA.debugLineNum = 85;BA.debugLine="meno.Text=Chr(0xE3C7)";
Debug.ShouldStop(1048576);
ac_tfreecoin.mostCurrent._meno.runMethod(true,"setText",BA.ObjectToCharSequence(ac_tfreecoin.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xe3c7)))));
 BA.debugLineNum = 86;BA.debugLine="meno.Gravity=Gravity.CENTER_HORIZONTAL+Gravity.CE";
Debug.ShouldStop(2097152);
ac_tfreecoin.mostCurrent._meno.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {ac_tfreecoin.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL"),ac_tfreecoin.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")}, "+",1, 1));
 BA.debugLineNum = 87;BA.debugLine="Activity.AddView(meno,3%x,3%x,12%x,12%x)";
Debug.ShouldStop(4194304);
ac_tfreecoin.mostCurrent._activity.runVoidMethod ("AddView",(Object)((ac_tfreecoin.mostCurrent._meno.getObject())),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 3)),ac_tfreecoin.mostCurrent.activityBA)),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 3)),ac_tfreecoin.mostCurrent.activityBA)),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 12)),ac_tfreecoin.mostCurrent.activityBA)),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 12)),ac_tfreecoin.mostCurrent.activityBA)));
 BA.debugLineNum = 89;BA.debugLine="pnl_coins.Initialize(\"pnl_coins\")";
Debug.ShouldStop(16777216);
ac_tfreecoin.mostCurrent._pnl_coins.runVoidMethod ("Initialize",ac_tfreecoin.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("pnl_coins")));
 BA.debugLineNum = 90;BA.debugLine="Activity.AddView(pnl_coins,50%x,3%x,50%x,12%x)";
Debug.ShouldStop(33554432);
ac_tfreecoin.mostCurrent._activity.runVoidMethod ("AddView",(Object)((ac_tfreecoin.mostCurrent._pnl_coins.getObject())),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 50)),ac_tfreecoin.mostCurrent.activityBA)),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 3)),ac_tfreecoin.mostCurrent.activityBA)),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 50)),ac_tfreecoin.mostCurrent.activityBA)),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 12)),ac_tfreecoin.mostCurrent.activityBA)));
 BA.debugLineNum = 91;BA.debugLine="roundview.Initialize(pnl_coins)";
Debug.ShouldStop(67108864);
ac_tfreecoin.mostCurrent._roundview.runVoidMethod ("Initialize",ac_tfreecoin.processBA,(Object)((ac_tfreecoin.mostCurrent._pnl_coins.getObject())));
 BA.debugLineNum = 92;BA.debugLine="roundview.CornerRadius_BL=35";
Debug.ShouldStop(134217728);
ac_tfreecoin.mostCurrent._roundview.runMethod(true,"setCornerRadius_BL",BA.numberCast(int.class, 35));
 BA.debugLineNum = 93;BA.debugLine="roundview.CornerRadius_TL=35";
Debug.ShouldStop(268435456);
ac_tfreecoin.mostCurrent._roundview.runMethod(true,"setCornerRadius_TL",BA.numberCast(int.class, 35));
 BA.debugLineNum = 94;BA.debugLine="roundview.BackgroundColor=Colors.White";
Debug.ShouldStop(536870912);
ac_tfreecoin.mostCurrent._roundview.runMethod(true,"setBackgroundColor",ac_tfreecoin.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 96;BA.debugLine="Dim bkcolor_st As ColorDrawable";
Debug.ShouldStop(-2147483648);
_bkcolor_st = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("bkcolor_st", _bkcolor_st);
 BA.debugLineNum = 97;BA.debugLine="bkcolor_st.Initialize2(0xFFC67D00,50,4dip,0x82FFE";
Debug.ShouldStop(1);
_bkcolor_st.runVoidMethod ("Initialize2",(Object)(BA.numberCast(int.class, 0xffc67d00)),(Object)(BA.numberCast(int.class, 50)),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4)))),(Object)(BA.numberCast(int.class, 0x82ffe300)));
 BA.debugLineNum = 99;BA.debugLine="Dim pnlb1 As Panel";
Debug.ShouldStop(4);
_pnlb1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("pnlb1", _pnlb1);
 BA.debugLineNum = 100;BA.debugLine="pnlb1.Initialize(\"\")";
Debug.ShouldStop(8);
_pnlb1.runVoidMethod ("Initialize",ac_tfreecoin.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 101;BA.debugLine="pnlb1.Color=0xFFFFC300";
Debug.ShouldStop(16);
_pnlb1.runVoidMethod ("setColor",BA.numberCast(int.class, 0xffffc300));
 BA.debugLineNum = 102;BA.debugLine="pnlb1.Background=bkcolor_st";
Debug.ShouldStop(32);
_pnlb1.runMethod(false,"setBackground",(_bkcolor_st.getObject()));
 BA.debugLineNum = 103;BA.debugLine="pnl_coins.AddView(pnlb1,pnl_coins.Width-11%x,1%x,";
Debug.ShouldStop(64);
ac_tfreecoin.mostCurrent._pnl_coins.runVoidMethod ("AddView",(Object)((_pnlb1.getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {ac_tfreecoin.mostCurrent._pnl_coins.runMethod(true,"getWidth"),ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 11)),ac_tfreecoin.mostCurrent.activityBA)}, "-",1, 1)),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 1)),ac_tfreecoin.mostCurrent.activityBA)),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),ac_tfreecoin.mostCurrent.activityBA)),(Object)(RemoteObject.solve(new RemoteObject[] {ac_tfreecoin.mostCurrent._pnl_coins.runMethod(true,"getHeight"),ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),ac_tfreecoin.mostCurrent.activityBA)}, "-",1, 1)));
 BA.debugLineNum = 105;BA.debugLine="lbl_icon.Initialize(\"lbl_icon\")";
Debug.ShouldStop(256);
ac_tfreecoin.mostCurrent._lbl_icon.runVoidMethod ("Initialize",ac_tfreecoin.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("lbl_icon")));
 BA.debugLineNum = 106;BA.debugLine="lbl_icon.SetBackgroundImage(LoadBitmap(File.DirAs";
Debug.ShouldStop(512);
ac_tfreecoin.mostCurrent._lbl_icon.runVoidMethod ("SetBackgroundImageNew",(Object)((ac_tfreecoin.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(ac_tfreecoin.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("coins.png"))).getObject())));
 BA.debugLineNum = 107;BA.debugLine="pnl_coins.AddView(lbl_icon,pnl_coins.Width-9%x,pn";
Debug.ShouldStop(1024);
ac_tfreecoin.mostCurrent._pnl_coins.runVoidMethod ("AddView",(Object)((ac_tfreecoin.mostCurrent._lbl_icon.getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {ac_tfreecoin.mostCurrent._pnl_coins.runMethod(true,"getWidth"),ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 9)),ac_tfreecoin.mostCurrent.activityBA)}, "-",1, 1)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {ac_tfreecoin.mostCurrent._pnl_coins.runMethod(true,"getHeight"),RemoteObject.createImmutable(2),RemoteObject.createImmutable(2)}, "//",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {ac_tfreecoin.mostCurrent._pnl_coins.runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {ac_tfreecoin.mostCurrent._pnl_coins.runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "/",0, 0))));
 BA.debugLineNum = 109;BA.debugLine="lbl_nums.Initialize(\"lbl_nums\")";
Debug.ShouldStop(4096);
ac_tfreecoin.mostCurrent._lbl_nums.runVoidMethod ("Initialize",ac_tfreecoin.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("lbl_nums")));
 BA.debugLineNum = 110;BA.debugLine="lbl_nums.TextColor=Colors.DarkGray";
Debug.ShouldStop(8192);
ac_tfreecoin.mostCurrent._lbl_nums.runMethod(true,"setTextColor",ac_tfreecoin.mostCurrent.__c.getField(false,"Colors").getField(true,"DarkGray"));
 BA.debugLineNum = 111;BA.debugLine="lbl_nums.TextSize=20";
Debug.ShouldStop(16384);
ac_tfreecoin.mostCurrent._lbl_nums.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 112;BA.debugLine="lbl_nums.Typeface=Typeface.LoadFromAssets(\"iran_s";
Debug.ShouldStop(32768);
ac_tfreecoin.mostCurrent._lbl_nums.runMethod(false,"setTypeface",ac_tfreecoin.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("iran_sans.ttf"))));
 BA.debugLineNum = 113;BA.debugLine="lbl_nums.Text=0&\" سکه\"";
Debug.ShouldStop(65536);
ac_tfreecoin.mostCurrent._lbl_nums.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable(0),RemoteObject.createImmutable(" سکه"))));
 BA.debugLineNum = 114;BA.debugLine="lbl_nums.Gravity=Gravity.CENTER_VERTICAL+Gravity.";
Debug.ShouldStop(131072);
ac_tfreecoin.mostCurrent._lbl_nums.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {ac_tfreecoin.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL"),ac_tfreecoin.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT")}, "+",1, 1));
 BA.debugLineNum = 115;BA.debugLine="pnl_coins.AddView(lbl_nums,2%x,0,pnl_coins.Width-";
Debug.ShouldStop(262144);
ac_tfreecoin.mostCurrent._pnl_coins.runVoidMethod ("AddView",(Object)((ac_tfreecoin.mostCurrent._lbl_nums.getObject())),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),ac_tfreecoin.mostCurrent.activityBA)),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {ac_tfreecoin.mostCurrent._pnl_coins.runMethod(true,"getWidth"),ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),ac_tfreecoin.mostCurrent.activityBA)}, "-",1, 1)),(Object)(ac_tfreecoin.mostCurrent._pnl_coins.runMethod(true,"getHeight")));
 BA.debugLineNum = 117;BA.debugLine="Dim pnl_main As Panel";
Debug.ShouldStop(1048576);
_pnl_main = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("pnl_main", _pnl_main);
 BA.debugLineNum = 118;BA.debugLine="pnl_main.Initialize(\"pnl_main\")";
Debug.ShouldStop(2097152);
_pnl_main.runVoidMethod ("Initialize",ac_tfreecoin.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("pnl_main")));
 BA.debugLineNum = 119;BA.debugLine="Dim bg As ColorDrawable";
Debug.ShouldStop(4194304);
_bg = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("bg", _bg);
 BA.debugLineNum = 120;BA.debugLine="bg.Initialize2(Colors.White,10dip,2dip,Colors.Lig";
Debug.ShouldStop(8388608);
_bg.runVoidMethod ("Initialize2",(Object)(ac_tfreecoin.mostCurrent.__c.getField(false,"Colors").getField(true,"White")),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))),(Object)(ac_tfreecoin.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray")));
 BA.debugLineNum = 121;BA.debugLine="pnl_main.Background=bg";
Debug.ShouldStop(16777216);
_pnl_main.runMethod(false,"setBackground",(_bg.getObject()));
 BA.debugLineNum = 122;BA.debugLine="Activity.AddView(pnl_main,5%x,18%x,90%x,100%y-23%";
Debug.ShouldStop(33554432);
ac_tfreecoin.mostCurrent._activity.runVoidMethod ("AddView",(Object)((_pnl_main.getObject())),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),ac_tfreecoin.mostCurrent.activityBA)),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 18)),ac_tfreecoin.mostCurrent.activityBA)),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 90)),ac_tfreecoin.mostCurrent.activityBA)),(Object)(RemoteObject.solve(new RemoteObject[] {ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),ac_tfreecoin.mostCurrent.activityBA),ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 23)),ac_tfreecoin.mostCurrent.activityBA)}, "-",1, 1)));
 BA.debugLineNum = 124;BA.debugLine="WebView1.Initialize(\"WebView1\")";
Debug.ShouldStop(134217728);
ac_tfreecoin.mostCurrent._webview1.runVoidMethod ("Initialize",ac_tfreecoin.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("WebView1")));
 BA.debugLineNum = 125;BA.debugLine="WebView1.Color=Colors.White";
Debug.ShouldStop(268435456);
ac_tfreecoin.mostCurrent._webview1.runVoidMethod ("setColor",ac_tfreecoin.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 126;BA.debugLine="Activity.AddView(WebView1, 0, 0,0, 1dip)";
Debug.ShouldStop(536870912);
ac_tfreecoin.mostCurrent._activity.runVoidMethod ("AddView",(Object)((ac_tfreecoin.mostCurrent._webview1.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))));
 BA.debugLineNum = 129;BA.debugLine="Select type_done";
Debug.ShouldStop(1);
switch (BA.switchObjectToInt(ac_tfreecoin._type_done,BA.numberCast(int.class, 1),BA.numberCast(int.class, 0))) {
case 0: {
 BA.debugLineNum = 132;BA.debugLine="like_onCreateViewHolder(pnl_main)";
Debug.ShouldStop(8);
_like_oncreateviewholder(_pnl_main);
 BA.debugLineNum = 133;BA.debugLine="req_getlike(\"2\",\"getl\")";
Debug.ShouldStop(16);
_req_getlike(BA.ObjectToString("2"),RemoteObject.createImmutable("getl"));
 BA.debugLineNum = 134;BA.debugLine="posi=0";
Debug.ShouldStop(32);
ac_tfreecoin._posi = BA.numberCast(int.class, 0);
 break; }
case 1: {
 BA.debugLineNum = 136;BA.debugLine="follow_onCreateViewHolder(pnl_main)";
Debug.ShouldStop(128);
_follow_oncreateviewholder(_pnl_main);
 BA.debugLineNum = 137;BA.debugLine="req_getlike(\"1\",\"getf\")";
Debug.ShouldStop(256);
_req_getlike(BA.ObjectToString("1"),RemoteObject.createImmutable("getf"));
 BA.debugLineNum = 138;BA.debugLine="posi=2";
Debug.ShouldStop(512);
ac_tfreecoin._posi = BA.numberCast(int.class, 2);
 break; }
}
;
 BA.debugLineNum = 142;BA.debugLine="req_getme(\"\")";
Debug.ShouldStop(8192);
_req_getme(RemoteObject.createImmutable(""));
 BA.debugLineNum = 143;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("Activity_Pause (ac_tfreecoin) ","ac_tfreecoin",9,ac_tfreecoin.mostCurrent.activityBA,ac_tfreecoin.mostCurrent,150);
if (RapidSub.canDelegate("activity_pause")) { return com.it.fome.ac_tfreecoin.remoteMe.runUserSub(false, "ac_tfreecoin","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 150;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 152;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
		Debug.PushSubsStack("Activity_Resume (ac_tfreecoin) ","ac_tfreecoin",9,ac_tfreecoin.mostCurrent.activityBA,ac_tfreecoin.mostCurrent,145);
if (RapidSub.canDelegate("activity_resume")) { return com.it.fome.ac_tfreecoin.remoteMe.runUserSub(false, "ac_tfreecoin","activity_resume");}
 BA.debugLineNum = 145;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(65536);
 BA.debugLineNum = 146;BA.debugLine="req_getme(\"\")";
Debug.ShouldStop(131072);
_req_getme(RemoteObject.createImmutable(""));
 BA.debugLineNum = 148;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _auto_done(RemoteObject _runing) throws Exception{
try {
		Debug.PushSubsStack("auto_done (ac_tfreecoin) ","ac_tfreecoin",9,ac_tfreecoin.mostCurrent.activityBA,ac_tfreecoin.mostCurrent,991);
if (RapidSub.canDelegate("auto_done")) { com.it.fome.ac_tfreecoin.remoteMe.runUserSub(false, "ac_tfreecoin","auto_done", _runing); return;}
ResumableSub_auto_done rsub = new ResumableSub_auto_done(null,_runing);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_auto_done extends BA.ResumableSub {
public ResumableSub_auto_done(com.it.fome.ac_tfreecoin parent,RemoteObject _runing) {
this.parent = parent;
this._runing = _runing;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
com.it.fome.ac_tfreecoin parent;
RemoteObject _runing;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("auto_done (ac_tfreecoin) ","ac_tfreecoin",9,ac_tfreecoin.mostCurrent.activityBA,ac_tfreecoin.mostCurrent,991);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("runing", _runing);
 BA.debugLineNum = 992;BA.debugLine="Do While (runing)";
Debug.ShouldStop(-2147483648);
if (true) break;

case 1:
//do while
this.state = 10;
while ((_runing).<Boolean>get().booleanValue()) {
this.state = 3;
if (true) break;
}
if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 995;BA.debugLine="Select type_done";
Debug.ShouldStop(4);
if (true) break;

case 4:
//select
this.state = 9;
switch (BA.switchObjectToInt(parent._type_done,BA.numberCast(int.class, 1),BA.numberCast(int.class, 0))) {
case 0: {
this.state = 6;
if (true) break;
}
case 1: {
this.state = 8;
if (true) break;
}
}
if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 997;BA.debugLine="ProgressDialogShow2(\"درحال بازدید خودکار\",Fals";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogShow2",ac_tfreecoin.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence("درحال بازدید خودکار")),(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 999;BA.debugLine="lbl_req_Click";
Debug.ShouldStop(64);
_lbl_req_click();
 BA.debugLineNum = 1000;BA.debugLine="Sleep(4000)";
Debug.ShouldStop(128);
parent.mostCurrent.__c.runVoidMethod ("Sleep",ac_tfreecoin.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ac_tfreecoin", "auto_done"),BA.numberCast(int.class, 4000));
this.state = 11;
return;
case 11:
//C
this.state = 9;
;
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 1004;BA.debugLine="Log(nff)";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","611993101",BA.NumberToString(parent._nff),0);
 BA.debugLineNum = 1005;BA.debugLine="ProgressDialogShow2(\"درحال جوین خودکار\",False)";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogShow2",ac_tfreecoin.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence("درحال جوین خودکار")),(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 1007;BA.debugLine="lbl_req_Click";
Debug.ShouldStop(16384);
_lbl_req_click();
 BA.debugLineNum = 1008;BA.debugLine="Sleep(4000)";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("Sleep",ac_tfreecoin.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ac_tfreecoin", "auto_done"),BA.numberCast(int.class, 4000));
this.state = 12;
return;
case 12:
//C
this.state = 9;
;
 if (true) break;

case 9:
//C
this.state = 1;
;
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 1015;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _ch_like_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("ch_like_CheckedChange (ac_tfreecoin) ","ac_tfreecoin",9,ac_tfreecoin.mostCurrent.activityBA,ac_tfreecoin.mostCurrent,900);
if (RapidSub.canDelegate("ch_like_checkedchange")) { return com.it.fome.ac_tfreecoin.remoteMe.runUserSub(false, "ac_tfreecoin","ch_like_checkedchange", _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 900;BA.debugLine="Sub ch_like_CheckedChange(Checked As Boolean)";
Debug.ShouldStop(8);
 BA.debugLineNum = 902;BA.debugLine="Log(\"check ! \"&Checked)";
Debug.ShouldStop(32);
ac_tfreecoin.mostCurrent.__c.runVoidMethod ("LogImpl","611927554",RemoteObject.concat(RemoteObject.createImmutable("check ! "),_checked),0);
 BA.debugLineNum = 928;BA.debugLine="auto_done(Checked)";
Debug.ShouldStop(-2147483648);
_auto_done(_checked);
 BA.debugLineNum = 989;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _comment_oncreateviewholder(RemoteObject _parent) throws Exception{
try {
		Debug.PushSubsStack("comment_onCreateViewHolder (ac_tfreecoin) ","ac_tfreecoin",9,ac_tfreecoin.mostCurrent.activityBA,ac_tfreecoin.mostCurrent,503);
if (RapidSub.canDelegate("comment_oncreateviewholder")) { return com.it.fome.ac_tfreecoin.remoteMe.runUserSub(false, "ac_tfreecoin","comment_oncreateviewholder", _parent);}
RemoteObject _pnl_prof = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _bg = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
RemoteObject _pnl_caption = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _lbl_caption = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _pnl_autolike = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _ch_like = RemoteObject.declareNull("de.amberhome.objects.appcompat.ACCheckBoxWrapper");
RemoteObject _lbl_notis = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _lbl_req = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _lbl_reqs = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _lbl_next = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _lbl_nexi = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("Parent", _parent);
 BA.debugLineNum = 503;BA.debugLine="Sub comment_onCreateViewHolder (Parent As Panel)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 505;BA.debugLine="Dim pnl_prof As Panel";
Debug.ShouldStop(16777216);
_pnl_prof = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("pnl_prof", _pnl_prof);
 BA.debugLineNum = 506;BA.debugLine="pnl_prof.Initialize(\"pnl_prof\")";
Debug.ShouldStop(33554432);
_pnl_prof.runVoidMethod ("Initialize",ac_tfreecoin.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("pnl_prof")));
 BA.debugLineNum = 507;BA.debugLine="Dim bg As ColorDrawable";
Debug.ShouldStop(67108864);
_bg = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("bg", _bg);
 BA.debugLineNum = 508;BA.debugLine="bg.Initialize2(Colors.White,10dip,2dip,Colors.Lig";
Debug.ShouldStop(134217728);
_bg.runVoidMethod ("Initialize2",(Object)(ac_tfreecoin.mostCurrent.__c.getField(false,"Colors").getField(true,"White")),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))),(Object)(ac_tfreecoin.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray")));
 BA.debugLineNum = 509;BA.debugLine="pnl_prof.Background=bg";
Debug.ShouldStop(268435456);
_pnl_prof.runMethod(false,"setBackground",(_bg.getObject()));
 BA.debugLineNum = 510;BA.debugLine="Parent.AddView(pnl_prof,Parent.Width/2-20%x,5%x,4";
Debug.ShouldStop(536870912);
_parent.runVoidMethod ("AddView",(Object)((_pnl_prof.getObject())),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_parent.runMethod(true,"getWidth"),RemoteObject.createImmutable(2),ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 20)),ac_tfreecoin.mostCurrent.activityBA)}, "/-",1, 0))),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),ac_tfreecoin.mostCurrent.activityBA)),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 40)),ac_tfreecoin.mostCurrent.activityBA)),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 40)),ac_tfreecoin.mostCurrent.activityBA)));
 BA.debugLineNum = 512;BA.debugLine="img_target.Initialize(\"img_target\")";
Debug.ShouldStop(-2147483648);
ac_tfreecoin.mostCurrent._img_target.runVoidMethod ("Initialize",ac_tfreecoin.processBA,(Object)(RemoteObject.createImmutable("img_target")));
 BA.debugLineNum = 513;BA.debugLine="img_target.Gravity=Gravity.FILL";
Debug.ShouldStop(1);
ac_tfreecoin.mostCurrent._img_target.runMethod(true,"setGravity",ac_tfreecoin.mostCurrent.__c.getField(false,"Gravity").getField(true,"FILL"));
 BA.debugLineNum = 514;BA.debugLine="pnl_prof.AddView(img_target,0,0,pnl_prof.Width,pn";
Debug.ShouldStop(2);
_pnl_prof.runVoidMethod ("AddView",(Object)((ac_tfreecoin.mostCurrent._img_target.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_pnl_prof.runMethod(true,"getWidth")),(Object)(_pnl_prof.runMethod(true,"getHeight")));
 BA.debugLineNum = 516;BA.debugLine="Dim pnl_caption As Panel";
Debug.ShouldStop(8);
_pnl_caption = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("pnl_caption", _pnl_caption);
 BA.debugLineNum = 517;BA.debugLine="pnl_caption.Initialize(\"pnl_caption\")";
Debug.ShouldStop(16);
_pnl_caption.runVoidMethod ("Initialize",ac_tfreecoin.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("pnl_caption")));
 BA.debugLineNum = 518;BA.debugLine="Dim bg As ColorDrawable";
Debug.ShouldStop(32);
_bg = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("bg", _bg);
 BA.debugLineNum = 519;BA.debugLine="bg.Initialize2(Colors.White,10dip,2dip,Colors.Lig";
Debug.ShouldStop(64);
_bg.runVoidMethod ("Initialize2",(Object)(ac_tfreecoin.mostCurrent.__c.getField(false,"Colors").getField(true,"White")),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))),(Object)(ac_tfreecoin.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray")));
 BA.debugLineNum = 520;BA.debugLine="pnl_caption.Background=bg";
Debug.ShouldStop(128);
_pnl_caption.runMethod(false,"setBackground",(_bg.getObject()));
 BA.debugLineNum = 521;BA.debugLine="Parent.AddView(pnl_caption,5%x,pnl_prof.Top+pnl_p";
Debug.ShouldStop(256);
_parent.runVoidMethod ("AddView",(Object)((_pnl_caption.getObject())),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),ac_tfreecoin.mostCurrent.activityBA)),(Object)(RemoteObject.solve(new RemoteObject[] {_pnl_prof.runMethod(true,"getTop"),_pnl_prof.runMethod(true,"getHeight"),ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),ac_tfreecoin.mostCurrent.activityBA)}, "++",2, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {_parent.runMethod(true,"getWidth"),ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),ac_tfreecoin.mostCurrent.activityBA)}, "-",1, 1)),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 17)),ac_tfreecoin.mostCurrent.activityBA)));
 BA.debugLineNum = 523;BA.debugLine="Dim lbl_caption As Label";
Debug.ShouldStop(1024);
_lbl_caption = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl_caption", _lbl_caption);
 BA.debugLineNum = 524;BA.debugLine="lbl_caption.Initialize(\"lbl_caption\")";
Debug.ShouldStop(2048);
_lbl_caption.runVoidMethod ("Initialize",ac_tfreecoin.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("lbl_caption")));
 BA.debugLineNum = 525;BA.debugLine="lbl_caption.Visible=False";
Debug.ShouldStop(4096);
_lbl_caption.runMethod(true,"setVisible",ac_tfreecoin.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 526;BA.debugLine="lbl_caption.TextColor=Colors.DarkGray";
Debug.ShouldStop(8192);
_lbl_caption.runMethod(true,"setTextColor",ac_tfreecoin.mostCurrent.__c.getField(false,"Colors").getField(true,"DarkGray"));
 BA.debugLineNum = 527;BA.debugLine="lbl_caption.TextSize=14";
Debug.ShouldStop(16384);
_lbl_caption.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 528;BA.debugLine="lbl_caption.Typeface=Typeface.LoadFromAssets(\"ira";
Debug.ShouldStop(32768);
_lbl_caption.runMethod(false,"setTypeface",ac_tfreecoin.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("iran_sans.ttf"))));
 BA.debugLineNum = 529;BA.debugLine="lbl_caption.Text=\"کپشن پست در این قسمت\"";
Debug.ShouldStop(65536);
_lbl_caption.runMethod(true,"setText",BA.ObjectToCharSequence("کپشن پست در این قسمت"));
 BA.debugLineNum = 530;BA.debugLine="lbl_caption.Gravity=Gravity.CENTER_HORIZONTAL+Gra";
Debug.ShouldStop(131072);
_lbl_caption.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {ac_tfreecoin.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL"),ac_tfreecoin.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")}, "+",1, 1));
 BA.debugLineNum = 531;BA.debugLine="pnl_caption.AddView(lbl_caption,0,0,pnl_caption.W";
Debug.ShouldStop(262144);
_pnl_caption.runVoidMethod ("AddView",(Object)((_lbl_caption.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_pnl_caption.runMethod(true,"getWidth")),(Object)(_pnl_caption.runMethod(true,"getHeight")));
 BA.debugLineNum = 533;BA.debugLine="Dim pnl_autolike As Panel";
Debug.ShouldStop(1048576);
_pnl_autolike = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("pnl_autolike", _pnl_autolike);
 BA.debugLineNum = 534;BA.debugLine="pnl_autolike.Initialize(\"pnl_autolike\")";
Debug.ShouldStop(2097152);
_pnl_autolike.runVoidMethod ("Initialize",ac_tfreecoin.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("pnl_autolike")));
 BA.debugLineNum = 535;BA.debugLine="Dim bg As ColorDrawable";
Debug.ShouldStop(4194304);
_bg = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("bg", _bg);
 BA.debugLineNum = 536;BA.debugLine="bg.Initialize2(Colors.White,10dip,2dip,Colors.Lig";
Debug.ShouldStop(8388608);
_bg.runVoidMethod ("Initialize2",(Object)(ac_tfreecoin.mostCurrent.__c.getField(false,"Colors").getField(true,"White")),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))),(Object)(ac_tfreecoin.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray")));
 BA.debugLineNum = 537;BA.debugLine="pnl_autolike.Background=bg";
Debug.ShouldStop(16777216);
_pnl_autolike.runMethod(false,"setBackground",(_bg.getObject()));
 BA.debugLineNum = 538;BA.debugLine="Parent.AddView(pnl_autolike,5%x,pnl_caption.Top+p";
Debug.ShouldStop(33554432);
_parent.runVoidMethod ("AddView",(Object)((_pnl_autolike.getObject())),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),ac_tfreecoin.mostCurrent.activityBA)),(Object)(RemoteObject.solve(new RemoteObject[] {_pnl_caption.runMethod(true,"getTop"),_pnl_caption.runMethod(true,"getHeight"),ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),ac_tfreecoin.mostCurrent.activityBA)}, "++",2, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {_parent.runMethod(true,"getWidth"),ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),ac_tfreecoin.mostCurrent.activityBA)}, "-",1, 1)),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 25)),ac_tfreecoin.mostCurrent.activityBA)));
 BA.debugLineNum = 540;BA.debugLine="Dim ch_like As ACCheckBox";
Debug.ShouldStop(134217728);
_ch_like = RemoteObject.createNew ("de.amberhome.objects.appcompat.ACCheckBoxWrapper");Debug.locals.put("ch_like", _ch_like);
 BA.debugLineNum = 541;BA.debugLine="ch_like.Initialize(\"ch_like\")";
Debug.ShouldStop(268435456);
_ch_like.runVoidMethod ("Initialize",ac_tfreecoin.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("ch_like")));
 BA.debugLineNum = 542;BA.debugLine="ch_like.Text=\"کامنت خودکار\"";
Debug.ShouldStop(536870912);
_ch_like.runMethod(true,"setText",BA.ObjectToCharSequence("کامنت خودکار"));
 BA.debugLineNum = 543;BA.debugLine="ch_like.Typeface=Typeface.LoadFromAssets(\"iran_sa";
Debug.ShouldStop(1073741824);
_ch_like.runMethod(false,"setTypeface",ac_tfreecoin.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("iran_sans.ttf"))));
 BA.debugLineNum = 544;BA.debugLine="ch_like.TextSize=14";
Debug.ShouldStop(-2147483648);
_ch_like.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 545;BA.debugLine="pnl_autolike.AddView(ch_like,5%x,5%x,pnl_autolike";
Debug.ShouldStop(1);
_pnl_autolike.runVoidMethod ("AddView",(Object)((_ch_like.getObject())),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),ac_tfreecoin.mostCurrent.activityBA)),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),ac_tfreecoin.mostCurrent.activityBA)),(Object)(RemoteObject.solve(new RemoteObject[] {_pnl_autolike.runMethod(true,"getWidth"),ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),ac_tfreecoin.mostCurrent.activityBA)}, "-",1, 1)),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 7)),ac_tfreecoin.mostCurrent.activityBA)));
 BA.debugLineNum = 547;BA.debugLine="Dim lbl_notis As Label";
Debug.ShouldStop(4);
_lbl_notis = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl_notis", _lbl_notis);
 BA.debugLineNum = 548;BA.debugLine="lbl_notis.Initialize(\"lbl_notis\")";
Debug.ShouldStop(8);
_lbl_notis.runVoidMethod ("Initialize",ac_tfreecoin.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("lbl_notis")));
 BA.debugLineNum = 549;BA.debugLine="lbl_notis.TextColor=Colors.DarkGray";
Debug.ShouldStop(16);
_lbl_notis.runMethod(true,"setTextColor",ac_tfreecoin.mostCurrent.__c.getField(false,"Colors").getField(true,"DarkGray"));
 BA.debugLineNum = 550;BA.debugLine="lbl_notis.TextSize=11";
Debug.ShouldStop(32);
_lbl_notis.runMethod(true,"setTextSize",BA.numberCast(float.class, 11));
 BA.debugLineNum = 551;BA.debugLine="lbl_notis.Typeface=Typeface.LoadFromAssets(\"iran_";
Debug.ShouldStop(64);
_lbl_notis.runMethod(false,"setTypeface",ac_tfreecoin.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("iran_sans.ttf"))));
 BA.debugLineNum = 552;BA.debugLine="lbl_notis.Text=\"نکته با فعال سازی این گزینه بصورت";
Debug.ShouldStop(128);
_lbl_notis.runMethod(true,"setText",BA.ObjectToCharSequence("نکته با فعال سازی این گزینه بصورت خودکار تمامی پست ها کامنت میشوند"));
 BA.debugLineNum = 553;BA.debugLine="lbl_notis.Gravity=Gravity.CENTER_HORIZONTAL+Gravi";
Debug.ShouldStop(256);
_lbl_notis.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {ac_tfreecoin.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL"),ac_tfreecoin.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")}, "+",1, 1));
 BA.debugLineNum = 554;BA.debugLine="pnl_autolike.AddView(lbl_notis,0,5%x,pnl_autolike";
Debug.ShouldStop(512);
_pnl_autolike.runVoidMethod ("AddView",(Object)((_lbl_notis.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),ac_tfreecoin.mostCurrent.activityBA)),(Object)(_pnl_autolike.runMethod(true,"getWidth")),(Object)(_pnl_autolike.runMethod(true,"getHeight")));
 BA.debugLineNum = 556;BA.debugLine="Dim bg As ColorDrawable";
Debug.ShouldStop(2048);
_bg = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("bg", _bg);
 BA.debugLineNum = 557;BA.debugLine="bg.Initialize2(0xFF9D00FF,10dip,2dip,Colors.Light";
Debug.ShouldStop(4096);
_bg.runVoidMethod ("Initialize2",(Object)(BA.numberCast(int.class, 0xff9d00ff)),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))),(Object)(ac_tfreecoin.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray")));
 BA.debugLineNum = 559;BA.debugLine="Dim lbl_req As Label";
Debug.ShouldStop(16384);
_lbl_req = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl_req", _lbl_req);
 BA.debugLineNum = 560;BA.debugLine="lbl_req.Initialize(\"lbl_req\")";
Debug.ShouldStop(32768);
_lbl_req.runVoidMethod ("Initialize",ac_tfreecoin.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("lbl_req")));
 BA.debugLineNum = 561;BA.debugLine="lbl_req.TextColor=Colors.White";
Debug.ShouldStop(65536);
_lbl_req.runMethod(true,"setTextColor",ac_tfreecoin.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 562;BA.debugLine="lbl_req.TextSize=17";
Debug.ShouldStop(131072);
_lbl_req.runMethod(true,"setTextSize",BA.numberCast(float.class, 17));
 BA.debugLineNum = 563;BA.debugLine="lbl_req.Typeface=Typeface.LoadFromAssets(\"iran_sa";
Debug.ShouldStop(262144);
_lbl_req.runMethod(false,"setTypeface",ac_tfreecoin.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("iran_sans.ttf"))));
 BA.debugLineNum = 564;BA.debugLine="lbl_req.Text=\"کامنت بزار\"";
Debug.ShouldStop(524288);
_lbl_req.runMethod(true,"setText",BA.ObjectToCharSequence("کامنت بزار"));
 BA.debugLineNum = 565;BA.debugLine="lbl_req.Background=bg";
Debug.ShouldStop(1048576);
_lbl_req.runMethod(false,"setBackground",(_bg.getObject()));
 BA.debugLineNum = 566;BA.debugLine="lbl_req.Gravity=Gravity.CENTER_HORIZONTAL+Gravity";
Debug.ShouldStop(2097152);
_lbl_req.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {ac_tfreecoin.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL"),ac_tfreecoin.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")}, "+",1, 1));
 BA.debugLineNum = 567;BA.debugLine="Parent.AddView(lbl_req,5%x,pnl_autolike.Top+pnl_a";
Debug.ShouldStop(4194304);
_parent.runVoidMethod ("AddView",(Object)((_lbl_req.getObject())),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),ac_tfreecoin.mostCurrent.activityBA)),(Object)(RemoteObject.solve(new RemoteObject[] {_pnl_autolike.runMethod(true,"getTop"),_pnl_autolike.runMethod(true,"getHeight"),ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),ac_tfreecoin.mostCurrent.activityBA)}, "++",2, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {_parent.runMethod(true,"getWidth"),ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),ac_tfreecoin.mostCurrent.activityBA)}, "-",1, 1)),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 12)),ac_tfreecoin.mostCurrent.activityBA)));
 BA.debugLineNum = 569;BA.debugLine="Dim lbl_reqs As Label";
Debug.ShouldStop(16777216);
_lbl_reqs = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl_reqs", _lbl_reqs);
 BA.debugLineNum = 570;BA.debugLine="lbl_reqs.Initialize(\"lbl_req\")";
Debug.ShouldStop(33554432);
_lbl_reqs.runVoidMethod ("Initialize",ac_tfreecoin.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("lbl_req")));
 BA.debugLineNum = 571;BA.debugLine="lbl_reqs.TextColor=Colors.White";
Debug.ShouldStop(67108864);
_lbl_reqs.runMethod(true,"setTextColor",ac_tfreecoin.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 572;BA.debugLine="lbl_reqs.TextSize=30";
Debug.ShouldStop(134217728);
_lbl_reqs.runMethod(true,"setTextSize",BA.numberCast(float.class, 30));
 BA.debugLineNum = 573;BA.debugLine="lbl_reqs.Typeface=Typeface.MATERIALICONS";
Debug.ShouldStop(268435456);
_lbl_reqs.runMethod(false,"setTypeface",ac_tfreecoin.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"getMATERIALICONS"));
 BA.debugLineNum = 574;BA.debugLine="lbl_reqs.Text=Chr(0xE7FE)";
Debug.ShouldStop(536870912);
_lbl_reqs.runMethod(true,"setText",BA.ObjectToCharSequence(ac_tfreecoin.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xe7fe)))));
 BA.debugLineNum = 575;BA.debugLine="lbl_reqs.Gravity=Gravity.CENTER_HORIZONTAL+Gravit";
Debug.ShouldStop(1073741824);
_lbl_reqs.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {ac_tfreecoin.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL"),ac_tfreecoin.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")}, "+",1, 1));
 BA.debugLineNum = 576;BA.debugLine="Parent.AddView(lbl_reqs,15%x,pnl_autolike.Top+pnl";
Debug.ShouldStop(-2147483648);
_parent.runVoidMethod ("AddView",(Object)((_lbl_reqs.getObject())),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),ac_tfreecoin.mostCurrent.activityBA)),(Object)(RemoteObject.solve(new RemoteObject[] {_pnl_autolike.runMethod(true,"getTop"),_pnl_autolike.runMethod(true,"getHeight"),ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),ac_tfreecoin.mostCurrent.activityBA)}, "++",2, 1)),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),ac_tfreecoin.mostCurrent.activityBA)),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 12)),ac_tfreecoin.mostCurrent.activityBA)));
 BA.debugLineNum = 578;BA.debugLine="Dim bg As ColorDrawable";
Debug.ShouldStop(2);
_bg = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("bg", _bg);
 BA.debugLineNum = 579;BA.debugLine="bg.Initialize2(0xFF454149,10dip,2dip,Colors.Light";
Debug.ShouldStop(4);
_bg.runVoidMethod ("Initialize2",(Object)(BA.numberCast(int.class, 0xff454149)),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))),(Object)(ac_tfreecoin.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray")));
 BA.debugLineNum = 581;BA.debugLine="Dim lbl_next As Label";
Debug.ShouldStop(16);
_lbl_next = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl_next", _lbl_next);
 BA.debugLineNum = 582;BA.debugLine="lbl_next.Initialize(\"lbl_next\")";
Debug.ShouldStop(32);
_lbl_next.runVoidMethod ("Initialize",ac_tfreecoin.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("lbl_next")));
 BA.debugLineNum = 583;BA.debugLine="lbl_next.TextColor=Colors.White";
Debug.ShouldStop(64);
_lbl_next.runMethod(true,"setTextColor",ac_tfreecoin.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 584;BA.debugLine="lbl_next.TextSize=17";
Debug.ShouldStop(128);
_lbl_next.runMethod(true,"setTextSize",BA.numberCast(float.class, 17));
 BA.debugLineNum = 585;BA.debugLine="lbl_next.Typeface=Typeface.LoadFromAssets(\"iran_s";
Debug.ShouldStop(256);
_lbl_next.runMethod(false,"setTypeface",ac_tfreecoin.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("iran_sans.ttf"))));
 BA.debugLineNum = 586;BA.debugLine="lbl_next.Text=\"بعدی\"";
Debug.ShouldStop(512);
_lbl_next.runMethod(true,"setText",BA.ObjectToCharSequence("بعدی"));
 BA.debugLineNum = 587;BA.debugLine="lbl_next.Background=bg";
Debug.ShouldStop(1024);
_lbl_next.runMethod(false,"setBackground",(_bg.getObject()));
 BA.debugLineNum = 588;BA.debugLine="lbl_next.Gravity=Gravity.CENTER_HORIZONTAL+Gravit";
Debug.ShouldStop(2048);
_lbl_next.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {ac_tfreecoin.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL"),ac_tfreecoin.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")}, "+",1, 1));
 BA.debugLineNum = 589;BA.debugLine="Parent.AddView(lbl_next,5%x,lbl_req.Top+lbl_req.H";
Debug.ShouldStop(4096);
_parent.runVoidMethod ("AddView",(Object)((_lbl_next.getObject())),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),ac_tfreecoin.mostCurrent.activityBA)),(Object)(RemoteObject.solve(new RemoteObject[] {_lbl_req.runMethod(true,"getTop"),_lbl_req.runMethod(true,"getHeight"),ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),ac_tfreecoin.mostCurrent.activityBA)}, "++",2, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {_parent.runMethod(true,"getWidth"),ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),ac_tfreecoin.mostCurrent.activityBA)}, "-",1, 1)),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 12)),ac_tfreecoin.mostCurrent.activityBA)));
 BA.debugLineNum = 591;BA.debugLine="Dim lbl_nexi As Label";
Debug.ShouldStop(16384);
_lbl_nexi = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl_nexi", _lbl_nexi);
 BA.debugLineNum = 592;BA.debugLine="lbl_nexi.Initialize(\"lbl_next\")";
Debug.ShouldStop(32768);
_lbl_nexi.runVoidMethod ("Initialize",ac_tfreecoin.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("lbl_next")));
 BA.debugLineNum = 593;BA.debugLine="lbl_nexi.TextColor=Colors.LightGray";
Debug.ShouldStop(65536);
_lbl_nexi.runMethod(true,"setTextColor",ac_tfreecoin.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray"));
 BA.debugLineNum = 594;BA.debugLine="lbl_nexi.TextSize=30";
Debug.ShouldStop(131072);
_lbl_nexi.runMethod(true,"setTextSize",BA.numberCast(float.class, 30));
 BA.debugLineNum = 595;BA.debugLine="lbl_nexi.Typeface=Typeface.MATERIALICONS";
Debug.ShouldStop(262144);
_lbl_nexi.runMethod(false,"setTypeface",ac_tfreecoin.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"getMATERIALICONS"));
 BA.debugLineNum = 596;BA.debugLine="lbl_nexi.Text=Chr(0xE15F)";
Debug.ShouldStop(524288);
_lbl_nexi.runMethod(true,"setText",BA.ObjectToCharSequence(ac_tfreecoin.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xe15f)))));
 BA.debugLineNum = 597;BA.debugLine="lbl_nexi.Gravity=Gravity.CENTER_HORIZONTAL+Gravit";
Debug.ShouldStop(1048576);
_lbl_nexi.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {ac_tfreecoin.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL"),ac_tfreecoin.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")}, "+",1, 1));
 BA.debugLineNum = 598;BA.debugLine="Parent.AddView(lbl_nexi,15%x,lbl_req.Top+lbl_req.";
Debug.ShouldStop(2097152);
_parent.runVoidMethod ("AddView",(Object)((_lbl_nexi.getObject())),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),ac_tfreecoin.mostCurrent.activityBA)),(Object)(RemoteObject.solve(new RemoteObject[] {_lbl_req.runMethod(true,"getTop"),_lbl_req.runMethod(true,"getHeight"),ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),ac_tfreecoin.mostCurrent.activityBA)}, "++",2, 1)),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),ac_tfreecoin.mostCurrent.activityBA)),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 12)),ac_tfreecoin.mostCurrent.activityBA)));
 BA.debugLineNum = 599;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _follow_oncreateviewholder(RemoteObject _parent) throws Exception{
try {
		Debug.PushSubsStack("follow_onCreateViewHolder (ac_tfreecoin) ","ac_tfreecoin",9,ac_tfreecoin.mostCurrent.activityBA,ac_tfreecoin.mostCurrent,601);
if (RapidSub.canDelegate("follow_oncreateviewholder")) { return com.it.fome.ac_tfreecoin.remoteMe.runUserSub(false, "ac_tfreecoin","follow_oncreateviewholder", _parent);}
RemoteObject _pnl_prof = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _bg = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
RemoteObject _pnl_caption = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _lbl_caption = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _pnl_autolike = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _ch_like = RemoteObject.declareNull("de.amberhome.objects.appcompat.ACCheckBoxWrapper");
RemoteObject _lbl_notis = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _lbl_req = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _lbl_reqs = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _lbl_next = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _lbl_nexi = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("Parent", _parent);
 BA.debugLineNum = 601;BA.debugLine="Sub follow_onCreateViewHolder (Parent As Panel)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 603;BA.debugLine="Dim pnl_prof As Panel";
Debug.ShouldStop(67108864);
_pnl_prof = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("pnl_prof", _pnl_prof);
 BA.debugLineNum = 604;BA.debugLine="pnl_prof.Initialize(\"pnl_prof\")";
Debug.ShouldStop(134217728);
_pnl_prof.runVoidMethod ("Initialize",ac_tfreecoin.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("pnl_prof")));
 BA.debugLineNum = 605;BA.debugLine="Dim bg As ColorDrawable";
Debug.ShouldStop(268435456);
_bg = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("bg", _bg);
 BA.debugLineNum = 606;BA.debugLine="bg.Initialize2(Colors.White,10dip,2dip,Colors.Lig";
Debug.ShouldStop(536870912);
_bg.runVoidMethod ("Initialize2",(Object)(ac_tfreecoin.mostCurrent.__c.getField(false,"Colors").getField(true,"White")),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))),(Object)(ac_tfreecoin.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray")));
 BA.debugLineNum = 607;BA.debugLine="pnl_prof.Background=bg";
Debug.ShouldStop(1073741824);
_pnl_prof.runMethod(false,"setBackground",(_bg.getObject()));
 BA.debugLineNum = 608;BA.debugLine="Parent.AddView(pnl_prof,Parent.Width/2-20%x,5%x,4";
Debug.ShouldStop(-2147483648);
_parent.runVoidMethod ("AddView",(Object)((_pnl_prof.getObject())),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_parent.runMethod(true,"getWidth"),RemoteObject.createImmutable(2),ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 20)),ac_tfreecoin.mostCurrent.activityBA)}, "/-",1, 0))),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),ac_tfreecoin.mostCurrent.activityBA)),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 40)),ac_tfreecoin.mostCurrent.activityBA)),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 40)),ac_tfreecoin.mostCurrent.activityBA)));
 BA.debugLineNum = 610;BA.debugLine="img_target.Initialize(\"img_target\")";
Debug.ShouldStop(2);
ac_tfreecoin.mostCurrent._img_target.runVoidMethod ("Initialize",ac_tfreecoin.processBA,(Object)(RemoteObject.createImmutable("img_target")));
 BA.debugLineNum = 611;BA.debugLine="img_target.Gravity=Gravity.FILL";
Debug.ShouldStop(4);
ac_tfreecoin.mostCurrent._img_target.runMethod(true,"setGravity",ac_tfreecoin.mostCurrent.__c.getField(false,"Gravity").getField(true,"FILL"));
 BA.debugLineNum = 612;BA.debugLine="pnl_prof.AddView(img_target,0,0,pnl_prof.Width,pn";
Debug.ShouldStop(8);
_pnl_prof.runVoidMethod ("AddView",(Object)((ac_tfreecoin.mostCurrent._img_target.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_pnl_prof.runMethod(true,"getWidth")),(Object)(_pnl_prof.runMethod(true,"getHeight")));
 BA.debugLineNum = 614;BA.debugLine="Dim pnl_caption As Panel";
Debug.ShouldStop(32);
_pnl_caption = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("pnl_caption", _pnl_caption);
 BA.debugLineNum = 615;BA.debugLine="pnl_caption.Initialize(\"pnl_caption\")";
Debug.ShouldStop(64);
_pnl_caption.runVoidMethod ("Initialize",ac_tfreecoin.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("pnl_caption")));
 BA.debugLineNum = 616;BA.debugLine="Dim bg As ColorDrawable";
Debug.ShouldStop(128);
_bg = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("bg", _bg);
 BA.debugLineNum = 617;BA.debugLine="bg.Initialize2(Colors.White,10dip,2dip,Colors.Lig";
Debug.ShouldStop(256);
_bg.runVoidMethod ("Initialize2",(Object)(ac_tfreecoin.mostCurrent.__c.getField(false,"Colors").getField(true,"White")),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))),(Object)(ac_tfreecoin.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray")));
 BA.debugLineNum = 618;BA.debugLine="pnl_caption.Background=bg";
Debug.ShouldStop(512);
_pnl_caption.runMethod(false,"setBackground",(_bg.getObject()));
 BA.debugLineNum = 619;BA.debugLine="pnl_caption.Visible=False";
Debug.ShouldStop(1024);
_pnl_caption.runMethod(true,"setVisible",ac_tfreecoin.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 620;BA.debugLine="Parent.AddView(pnl_caption,5%x,pnl_prof.Top+pnl_p";
Debug.ShouldStop(2048);
_parent.runVoidMethod ("AddView",(Object)((_pnl_caption.getObject())),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),ac_tfreecoin.mostCurrent.activityBA)),(Object)(RemoteObject.solve(new RemoteObject[] {_pnl_prof.runMethod(true,"getTop"),_pnl_prof.runMethod(true,"getHeight"),ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),ac_tfreecoin.mostCurrent.activityBA)}, "++",2, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {_parent.runMethod(true,"getWidth"),ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),ac_tfreecoin.mostCurrent.activityBA)}, "-",1, 1)),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 17)),ac_tfreecoin.mostCurrent.activityBA)));
 BA.debugLineNum = 622;BA.debugLine="Dim lbl_caption As Label";
Debug.ShouldStop(8192);
_lbl_caption = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl_caption", _lbl_caption);
 BA.debugLineNum = 623;BA.debugLine="lbl_caption.Initialize(\"lbl_caption\")";
Debug.ShouldStop(16384);
_lbl_caption.runVoidMethod ("Initialize",ac_tfreecoin.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("lbl_caption")));
 BA.debugLineNum = 624;BA.debugLine="lbl_caption.Visible=False";
Debug.ShouldStop(32768);
_lbl_caption.runMethod(true,"setVisible",ac_tfreecoin.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 625;BA.debugLine="lbl_caption.TextColor=Colors.DarkGray";
Debug.ShouldStop(65536);
_lbl_caption.runMethod(true,"setTextColor",ac_tfreecoin.mostCurrent.__c.getField(false,"Colors").getField(true,"DarkGray"));
 BA.debugLineNum = 626;BA.debugLine="lbl_caption.TextSize=14";
Debug.ShouldStop(131072);
_lbl_caption.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 627;BA.debugLine="lbl_caption.Typeface=Typeface.LoadFromAssets(\"ira";
Debug.ShouldStop(262144);
_lbl_caption.runMethod(false,"setTypeface",ac_tfreecoin.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("iran_sans.ttf"))));
 BA.debugLineNum = 628;BA.debugLine="lbl_caption.Text=\"کپشن پست در این قسمت\"";
Debug.ShouldStop(524288);
_lbl_caption.runMethod(true,"setText",BA.ObjectToCharSequence("کپشن پست در این قسمت"));
 BA.debugLineNum = 629;BA.debugLine="lbl_caption.Gravity=Gravity.CENTER_HORIZONTAL+Gra";
Debug.ShouldStop(1048576);
_lbl_caption.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {ac_tfreecoin.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL"),ac_tfreecoin.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")}, "+",1, 1));
 BA.debugLineNum = 630;BA.debugLine="pnl_caption.AddView(lbl_caption,0,0,pnl_caption.W";
Debug.ShouldStop(2097152);
_pnl_caption.runVoidMethod ("AddView",(Object)((_lbl_caption.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_pnl_caption.runMethod(true,"getWidth")),(Object)(_pnl_caption.runMethod(true,"getHeight")));
 BA.debugLineNum = 632;BA.debugLine="Dim pnl_autolike As Panel";
Debug.ShouldStop(8388608);
_pnl_autolike = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("pnl_autolike", _pnl_autolike);
 BA.debugLineNum = 633;BA.debugLine="pnl_autolike.Initialize(\"pnl_autolike\")";
Debug.ShouldStop(16777216);
_pnl_autolike.runVoidMethod ("Initialize",ac_tfreecoin.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("pnl_autolike")));
 BA.debugLineNum = 634;BA.debugLine="Dim bg As ColorDrawable";
Debug.ShouldStop(33554432);
_bg = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("bg", _bg);
 BA.debugLineNum = 635;BA.debugLine="bg.Initialize2(Colors.White,10dip,2dip,Colors.Lig";
Debug.ShouldStop(67108864);
_bg.runVoidMethod ("Initialize2",(Object)(ac_tfreecoin.mostCurrent.__c.getField(false,"Colors").getField(true,"White")),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))),(Object)(ac_tfreecoin.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray")));
 BA.debugLineNum = 636;BA.debugLine="pnl_autolike.Background=bg";
Debug.ShouldStop(134217728);
_pnl_autolike.runMethod(false,"setBackground",(_bg.getObject()));
 BA.debugLineNum = 637;BA.debugLine="Parent.AddView(pnl_autolike,5%x,pnl_caption.Top+p";
Debug.ShouldStop(268435456);
_parent.runVoidMethod ("AddView",(Object)((_pnl_autolike.getObject())),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),ac_tfreecoin.mostCurrent.activityBA)),(Object)(RemoteObject.solve(new RemoteObject[] {_pnl_caption.runMethod(true,"getTop"),_pnl_caption.runMethod(true,"getHeight"),ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),ac_tfreecoin.mostCurrent.activityBA)}, "++",2, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {_parent.runMethod(true,"getWidth"),ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),ac_tfreecoin.mostCurrent.activityBA)}, "-",1, 1)),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 25)),ac_tfreecoin.mostCurrent.activityBA)));
 BA.debugLineNum = 639;BA.debugLine="Dim ch_like As ACCheckBox";
Debug.ShouldStop(1073741824);
_ch_like = RemoteObject.createNew ("de.amberhome.objects.appcompat.ACCheckBoxWrapper");Debug.locals.put("ch_like", _ch_like);
 BA.debugLineNum = 640;BA.debugLine="ch_like.Initialize(\"ch_like\")";
Debug.ShouldStop(-2147483648);
_ch_like.runVoidMethod ("Initialize",ac_tfreecoin.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("ch_like")));
 BA.debugLineNum = 641;BA.debugLine="ch_like.Text=\"جوین خودکار\"";
Debug.ShouldStop(1);
_ch_like.runMethod(true,"setText",BA.ObjectToCharSequence("جوین خودکار"));
 BA.debugLineNum = 642;BA.debugLine="ch_like.Typeface=Typeface.LoadFromAssets(\"iran_sa";
Debug.ShouldStop(2);
_ch_like.runMethod(false,"setTypeface",ac_tfreecoin.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("iran_sans.ttf"))));
 BA.debugLineNum = 643;BA.debugLine="ch_like.TextSize=14";
Debug.ShouldStop(4);
_ch_like.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 644;BA.debugLine="pnl_autolike.AddView(ch_like,5%x,5%x,pnl_autolike";
Debug.ShouldStop(8);
_pnl_autolike.runVoidMethod ("AddView",(Object)((_ch_like.getObject())),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),ac_tfreecoin.mostCurrent.activityBA)),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),ac_tfreecoin.mostCurrent.activityBA)),(Object)(RemoteObject.solve(new RemoteObject[] {_pnl_autolike.runMethod(true,"getWidth"),ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),ac_tfreecoin.mostCurrent.activityBA)}, "-",1, 1)),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 7)),ac_tfreecoin.mostCurrent.activityBA)));
 BA.debugLineNum = 646;BA.debugLine="Dim lbl_notis As Label";
Debug.ShouldStop(32);
_lbl_notis = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl_notis", _lbl_notis);
 BA.debugLineNum = 647;BA.debugLine="lbl_notis.Initialize(\"lbl_notis\")";
Debug.ShouldStop(64);
_lbl_notis.runVoidMethod ("Initialize",ac_tfreecoin.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("lbl_notis")));
 BA.debugLineNum = 648;BA.debugLine="lbl_notis.TextColor=Colors.DarkGray";
Debug.ShouldStop(128);
_lbl_notis.runMethod(true,"setTextColor",ac_tfreecoin.mostCurrent.__c.getField(false,"Colors").getField(true,"DarkGray"));
 BA.debugLineNum = 649;BA.debugLine="lbl_notis.TextSize=11";
Debug.ShouldStop(256);
_lbl_notis.runMethod(true,"setTextSize",BA.numberCast(float.class, 11));
 BA.debugLineNum = 650;BA.debugLine="lbl_notis.Typeface=Typeface.LoadFromAssets(\"iran_";
Debug.ShouldStop(512);
_lbl_notis.runMethod(false,"setTypeface",ac_tfreecoin.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("iran_sans.ttf"))));
 BA.debugLineNum = 651;BA.debugLine="lbl_notis.Text=\"نکته با فعال سازی این گزینه بصورت";
Debug.ShouldStop(1024);
_lbl_notis.runMethod(true,"setText",BA.ObjectToCharSequence("نکته با فعال سازی این گزینه بصورت خودکار وارد کانال میشوید"));
 BA.debugLineNum = 652;BA.debugLine="lbl_notis.Gravity=Gravity.CENTER_HORIZONTAL+Gravi";
Debug.ShouldStop(2048);
_lbl_notis.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {ac_tfreecoin.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL"),ac_tfreecoin.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")}, "+",1, 1));
 BA.debugLineNum = 653;BA.debugLine="pnl_autolike.AddView(lbl_notis,0,5%x,pnl_autolike";
Debug.ShouldStop(4096);
_pnl_autolike.runVoidMethod ("AddView",(Object)((_lbl_notis.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),ac_tfreecoin.mostCurrent.activityBA)),(Object)(_pnl_autolike.runMethod(true,"getWidth")),(Object)(_pnl_autolike.runMethod(true,"getHeight")));
 BA.debugLineNum = 655;BA.debugLine="Dim bg As ColorDrawable";
Debug.ShouldStop(16384);
_bg = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("bg", _bg);
 BA.debugLineNum = 656;BA.debugLine="bg.Initialize2(0xFF9D00FF,10dip,2dip,Colors.Light";
Debug.ShouldStop(32768);
_bg.runVoidMethod ("Initialize2",(Object)(BA.numberCast(int.class, 0xff9d00ff)),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))),(Object)(ac_tfreecoin.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray")));
 BA.debugLineNum = 658;BA.debugLine="Dim lbl_req As Label";
Debug.ShouldStop(131072);
_lbl_req = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl_req", _lbl_req);
 BA.debugLineNum = 659;BA.debugLine="lbl_req.Initialize(\"lbl_req\")";
Debug.ShouldStop(262144);
_lbl_req.runVoidMethod ("Initialize",ac_tfreecoin.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("lbl_req")));
 BA.debugLineNum = 660;BA.debugLine="lbl_req.TextColor=Colors.White";
Debug.ShouldStop(524288);
_lbl_req.runMethod(true,"setTextColor",ac_tfreecoin.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 661;BA.debugLine="lbl_req.TextSize=17";
Debug.ShouldStop(1048576);
_lbl_req.runMethod(true,"setTextSize",BA.numberCast(float.class, 17));
 BA.debugLineNum = 662;BA.debugLine="lbl_req.Typeface=Typeface.LoadFromAssets(\"iran_sa";
Debug.ShouldStop(2097152);
_lbl_req.runMethod(false,"setTypeface",ac_tfreecoin.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("iran_sans.ttf"))));
 BA.debugLineNum = 663;BA.debugLine="lbl_req.Text=\"جوین\"";
Debug.ShouldStop(4194304);
_lbl_req.runMethod(true,"setText",BA.ObjectToCharSequence("جوین"));
 BA.debugLineNum = 664;BA.debugLine="lbl_req.Background=bg";
Debug.ShouldStop(8388608);
_lbl_req.runMethod(false,"setBackground",(_bg.getObject()));
 BA.debugLineNum = 665;BA.debugLine="lbl_req.Gravity=Gravity.CENTER_HORIZONTAL+Gravity";
Debug.ShouldStop(16777216);
_lbl_req.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {ac_tfreecoin.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL"),ac_tfreecoin.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")}, "+",1, 1));
 BA.debugLineNum = 666;BA.debugLine="Parent.AddView(lbl_req,5%x,pnl_autolike.Top+pnl_a";
Debug.ShouldStop(33554432);
_parent.runVoidMethod ("AddView",(Object)((_lbl_req.getObject())),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),ac_tfreecoin.mostCurrent.activityBA)),(Object)(RemoteObject.solve(new RemoteObject[] {_pnl_autolike.runMethod(true,"getTop"),_pnl_autolike.runMethod(true,"getHeight"),ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),ac_tfreecoin.mostCurrent.activityBA)}, "++",2, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {_parent.runMethod(true,"getWidth"),ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),ac_tfreecoin.mostCurrent.activityBA)}, "-",1, 1)),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 12)),ac_tfreecoin.mostCurrent.activityBA)));
 BA.debugLineNum = 668;BA.debugLine="Dim lbl_reqs As Label";
Debug.ShouldStop(134217728);
_lbl_reqs = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl_reqs", _lbl_reqs);
 BA.debugLineNum = 669;BA.debugLine="lbl_reqs.Initialize(\"lbl_req\")";
Debug.ShouldStop(268435456);
_lbl_reqs.runVoidMethod ("Initialize",ac_tfreecoin.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("lbl_req")));
 BA.debugLineNum = 670;BA.debugLine="lbl_reqs.TextColor=Colors.White";
Debug.ShouldStop(536870912);
_lbl_reqs.runMethod(true,"setTextColor",ac_tfreecoin.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 671;BA.debugLine="lbl_reqs.TextSize=30";
Debug.ShouldStop(1073741824);
_lbl_reqs.runMethod(true,"setTextSize",BA.numberCast(float.class, 30));
 BA.debugLineNum = 672;BA.debugLine="lbl_reqs.Typeface=Typeface.MATERIALICONS";
Debug.ShouldStop(-2147483648);
_lbl_reqs.runMethod(false,"setTypeface",ac_tfreecoin.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"getMATERIALICONS"));
 BA.debugLineNum = 673;BA.debugLine="lbl_reqs.Text=Chr(0xE7FE)";
Debug.ShouldStop(1);
_lbl_reqs.runMethod(true,"setText",BA.ObjectToCharSequence(ac_tfreecoin.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xe7fe)))));
 BA.debugLineNum = 674;BA.debugLine="lbl_reqs.Gravity=Gravity.CENTER_HORIZONTAL+Gravit";
Debug.ShouldStop(2);
_lbl_reqs.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {ac_tfreecoin.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL"),ac_tfreecoin.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")}, "+",1, 1));
 BA.debugLineNum = 675;BA.debugLine="Parent.AddView(lbl_reqs,15%x,pnl_autolike.Top+pnl";
Debug.ShouldStop(4);
_parent.runVoidMethod ("AddView",(Object)((_lbl_reqs.getObject())),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),ac_tfreecoin.mostCurrent.activityBA)),(Object)(RemoteObject.solve(new RemoteObject[] {_pnl_autolike.runMethod(true,"getTop"),_pnl_autolike.runMethod(true,"getHeight"),ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),ac_tfreecoin.mostCurrent.activityBA)}, "++",2, 1)),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),ac_tfreecoin.mostCurrent.activityBA)),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 12)),ac_tfreecoin.mostCurrent.activityBA)));
 BA.debugLineNum = 677;BA.debugLine="Dim bg As ColorDrawable";
Debug.ShouldStop(16);
_bg = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("bg", _bg);
 BA.debugLineNum = 678;BA.debugLine="bg.Initialize2(0xFF454149,10dip,2dip,Colors.Light";
Debug.ShouldStop(32);
_bg.runVoidMethod ("Initialize2",(Object)(BA.numberCast(int.class, 0xff454149)),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))),(Object)(ac_tfreecoin.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray")));
 BA.debugLineNum = 680;BA.debugLine="Dim lbl_next As Label";
Debug.ShouldStop(128);
_lbl_next = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl_next", _lbl_next);
 BA.debugLineNum = 681;BA.debugLine="lbl_next.Initialize(\"lbl_next\")";
Debug.ShouldStop(256);
_lbl_next.runVoidMethod ("Initialize",ac_tfreecoin.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("lbl_next")));
 BA.debugLineNum = 682;BA.debugLine="lbl_next.TextColor=Colors.White";
Debug.ShouldStop(512);
_lbl_next.runMethod(true,"setTextColor",ac_tfreecoin.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 683;BA.debugLine="lbl_next.TextSize=17";
Debug.ShouldStop(1024);
_lbl_next.runMethod(true,"setTextSize",BA.numberCast(float.class, 17));
 BA.debugLineNum = 684;BA.debugLine="lbl_next.Typeface=Typeface.LoadFromAssets(\"iran_s";
Debug.ShouldStop(2048);
_lbl_next.runMethod(false,"setTypeface",ac_tfreecoin.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("iran_sans.ttf"))));
 BA.debugLineNum = 685;BA.debugLine="lbl_next.Text=\"بعدی\"";
Debug.ShouldStop(4096);
_lbl_next.runMethod(true,"setText",BA.ObjectToCharSequence("بعدی"));
 BA.debugLineNum = 686;BA.debugLine="lbl_next.Background=bg";
Debug.ShouldStop(8192);
_lbl_next.runMethod(false,"setBackground",(_bg.getObject()));
 BA.debugLineNum = 687;BA.debugLine="lbl_next.Gravity=Gravity.CENTER_HORIZONTAL+Gravit";
Debug.ShouldStop(16384);
_lbl_next.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {ac_tfreecoin.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL"),ac_tfreecoin.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")}, "+",1, 1));
 BA.debugLineNum = 688;BA.debugLine="Parent.AddView(lbl_next,5%x,lbl_req.Top+lbl_req.H";
Debug.ShouldStop(32768);
_parent.runVoidMethod ("AddView",(Object)((_lbl_next.getObject())),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),ac_tfreecoin.mostCurrent.activityBA)),(Object)(RemoteObject.solve(new RemoteObject[] {_lbl_req.runMethod(true,"getTop"),_lbl_req.runMethod(true,"getHeight"),ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),ac_tfreecoin.mostCurrent.activityBA)}, "++",2, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {_parent.runMethod(true,"getWidth"),ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),ac_tfreecoin.mostCurrent.activityBA)}, "-",1, 1)),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 12)),ac_tfreecoin.mostCurrent.activityBA)));
 BA.debugLineNum = 690;BA.debugLine="Dim lbl_nexi As Label";
Debug.ShouldStop(131072);
_lbl_nexi = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl_nexi", _lbl_nexi);
 BA.debugLineNum = 691;BA.debugLine="lbl_nexi.Initialize(\"lbl_next\")";
Debug.ShouldStop(262144);
_lbl_nexi.runVoidMethod ("Initialize",ac_tfreecoin.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("lbl_next")));
 BA.debugLineNum = 692;BA.debugLine="lbl_nexi.TextColor=Colors.LightGray";
Debug.ShouldStop(524288);
_lbl_nexi.runMethod(true,"setTextColor",ac_tfreecoin.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray"));
 BA.debugLineNum = 693;BA.debugLine="lbl_nexi.TextSize=30";
Debug.ShouldStop(1048576);
_lbl_nexi.runMethod(true,"setTextSize",BA.numberCast(float.class, 30));
 BA.debugLineNum = 694;BA.debugLine="lbl_nexi.Typeface=Typeface.MATERIALICONS";
Debug.ShouldStop(2097152);
_lbl_nexi.runMethod(false,"setTypeface",ac_tfreecoin.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"getMATERIALICONS"));
 BA.debugLineNum = 695;BA.debugLine="lbl_nexi.Text=Chr(0xE15F)";
Debug.ShouldStop(4194304);
_lbl_nexi.runMethod(true,"setText",BA.ObjectToCharSequence(ac_tfreecoin.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xe15f)))));
 BA.debugLineNum = 696;BA.debugLine="lbl_nexi.Gravity=Gravity.CENTER_HORIZONTAL+Gravit";
Debug.ShouldStop(8388608);
_lbl_nexi.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {ac_tfreecoin.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL"),ac_tfreecoin.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")}, "+",1, 1));
 BA.debugLineNum = 697;BA.debugLine="Parent.AddView(lbl_nexi,15%x,lbl_req.Top+lbl_req.";
Debug.ShouldStop(16777216);
_parent.runVoidMethod ("AddView",(Object)((_lbl_nexi.getObject())),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),ac_tfreecoin.mostCurrent.activityBA)),(Object)(RemoteObject.solve(new RemoteObject[] {_lbl_req.runMethod(true,"getTop"),_lbl_req.runMethod(true,"getHeight"),ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),ac_tfreecoin.mostCurrent.activityBA)}, "++",2, 1)),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),ac_tfreecoin.mostCurrent.activityBA)),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 12)),ac_tfreecoin.mostCurrent.activityBA)));
 BA.debugLineNum = 698;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getnex(RemoteObject _posis) throws Exception{
try {
		Debug.PushSubsStack("getnex (ac_tfreecoin) ","ac_tfreecoin",9,ac_tfreecoin.mostCurrent.activityBA,ac_tfreecoin.mostCurrent,1107);
if (RapidSub.canDelegate("getnex")) { return com.it.fome.ac_tfreecoin.remoteMe.runUserSub(false, "ac_tfreecoin","getnex", _posis);}
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _n_coins = RemoteObject.createImmutable(0L);
Debug.locals.put("posis", _posis);
 BA.debugLineNum = 1107;BA.debugLine="Sub getnex(posis As Int)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 1108;BA.debugLine="Try";
Debug.ShouldStop(524288);
try { BA.debugLineNum = 1109;BA.debugLine="cursor1 = sql1.ExecQuery(\"SELECT * FROM tbl_coin";
Debug.ShouldStop(1048576);
ac_tfreecoin._cursor1.setObject(ac_tfreecoin._sql1.runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM tbl_coin WHERE userid='"),ac_tfreecoin.mostCurrent._userid_t,RemoteObject.createImmutable("' ")))));
 BA.debugLineNum = 1110;BA.debugLine="Dim i As Int";
Debug.ShouldStop(2097152);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 1111;BA.debugLine="For i=0 To cursor1.RowCount-1";
Debug.ShouldStop(4194304);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {ac_tfreecoin._cursor1.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step4 > 0 && _i.<Integer>get().intValue() <= limit4) || (step4 < 0 && _i.<Integer>get().intValue() >= limit4) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1112;BA.debugLine="cursor1.Position=i";
Debug.ShouldStop(8388608);
ac_tfreecoin._cursor1.runMethod(true,"setPosition",_i);
 BA.debugLineNum = 1113;BA.debugLine="cm=cursor1.GetString(\"cm\")";
Debug.ShouldStop(16777216);
ac_tfreecoin.mostCurrent._cm = ac_tfreecoin._cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("cm")));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1117;BA.debugLine="Select type_done";
Debug.ShouldStop(268435456);
switch (BA.switchObjectToInt(ac_tfreecoin._type_done,BA.numberCast(int.class, 1),BA.numberCast(int.class, 0))) {
case 0: {
 BA.debugLineNum = 1119;BA.debugLine="nll=nll-1";
Debug.ShouldStop(1073741824);
ac_tfreecoin._nll = RemoteObject.solve(new RemoteObject[] {ac_tfreecoin._nll,RemoteObject.createImmutable(1)}, "-",1, 1);
 BA.debugLineNum = 1121;BA.debugLine="glide.Load2(list_like(9).Get(nll)).OptionalCir";
Debug.ShouldStop(1);
ac_tfreecoin.mostCurrent._glide.runMethod(false,"Load2",ac_tfreecoin.mostCurrent.activityBA,(Object)(BA.ObjectToString(ac_tfreecoin.mostCurrent._list_like.getArrayElement(false,BA.numberCast(int.class, 9)).runMethod(false,"Get",(Object)(ac_tfreecoin._nll))))).runMethod(false,"OptionalCircleCrop").runVoidMethod ("Into",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ImageViewWrapper"), ac_tfreecoin.mostCurrent._img_target.getObject()));
 BA.debugLineNum = 1123;BA.debugLine="Dim n_coins=cm As Long";
Debug.ShouldStop(4);
_n_coins = BA.numberCast(long.class, ac_tfreecoin.mostCurrent._cm);Debug.locals.put("n_coins", _n_coins);Debug.locals.put("n_coins", _n_coins);
 BA.debugLineNum = 1124;BA.debugLine="If n_coins>100 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean(">",_n_coins,BA.numberCast(double.class, 100))) { 
 BA.debugLineNum = 1125;BA.debugLine="lbl_nums.Text=\"سکه \"&NumberFormat(n_coins,3,0";
Debug.ShouldStop(16);
ac_tfreecoin.mostCurrent._lbl_nums.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("سکه "),ac_tfreecoin.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _n_coins)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 0))))));
 }else {
 BA.debugLineNum = 1127;BA.debugLine="lbl_nums.Text=\"سکه \"&n_coins";
Debug.ShouldStop(64);
ac_tfreecoin.mostCurrent._lbl_nums.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("سکه "),_n_coins)));
 };
 break; }
case 1: {
 BA.debugLineNum = 1132;BA.debugLine="nff=nff-1";
Debug.ShouldStop(2048);
ac_tfreecoin._nff = RemoteObject.solve(new RemoteObject[] {ac_tfreecoin._nff,RemoteObject.createImmutable(1)}, "-",1, 1);
 BA.debugLineNum = 1134;BA.debugLine="glide.Load2(list_follow(9).Get(nff)).OptionalC";
Debug.ShouldStop(8192);
ac_tfreecoin.mostCurrent._glide.runMethod(false,"Load2",ac_tfreecoin.mostCurrent.activityBA,(Object)(BA.ObjectToString(ac_tfreecoin.mostCurrent._list_follow.getArrayElement(false,BA.numberCast(int.class, 9)).runMethod(false,"Get",(Object)(ac_tfreecoin._nff))))).runMethod(false,"OptionalCircleCrop").runVoidMethod ("Into",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ImageViewWrapper"), ac_tfreecoin.mostCurrent._img_target.getObject()));
 BA.debugLineNum = 1136;BA.debugLine="Dim n_coins=cm As Long";
Debug.ShouldStop(32768);
_n_coins = BA.numberCast(long.class, ac_tfreecoin.mostCurrent._cm);Debug.locals.put("n_coins", _n_coins);Debug.locals.put("n_coins", _n_coins);
 BA.debugLineNum = 1137;BA.debugLine="If n_coins>100 Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean(">",_n_coins,BA.numberCast(double.class, 100))) { 
 BA.debugLineNum = 1138;BA.debugLine="lbl_nums.Text=\"سکه \"&NumberFormat(n_coins,3,0";
Debug.ShouldStop(131072);
ac_tfreecoin.mostCurrent._lbl_nums.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("سکه "),ac_tfreecoin.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _n_coins)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 0))))));
 }else {
 BA.debugLineNum = 1140;BA.debugLine="lbl_nums.Text=\"سکه \"&n_coins";
Debug.ShouldStop(524288);
ac_tfreecoin.mostCurrent._lbl_nums.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("سکه "),_n_coins)));
 };
 break; }
}
;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e29) {
			BA.rdebugUtils.runVoidMethod("setLastException",ac_tfreecoin.processBA, e29.toString()); BA.debugLineNum = 1144;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8388608);
ac_tfreecoin.mostCurrent.__c.runVoidMethod ("LogImpl","612255269",BA.ObjectToString(ac_tfreecoin.mostCurrent.__c.runMethod(false,"LastException",ac_tfreecoin.mostCurrent.activityBA)),0);
 };
 BA.debugLineNum = 1149;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 16;BA.debugLine="Dim meno As Label";
ac_tfreecoin.mostCurrent._meno = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Dim pnl_coins As Panel";
ac_tfreecoin.mostCurrent._pnl_coins = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Dim lbl_icon ,lbl_nums As Label";
ac_tfreecoin.mostCurrent._lbl_icon = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
ac_tfreecoin.mostCurrent._lbl_nums = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Dim roundview As MC7RoundView";
ac_tfreecoin.mostCurrent._roundview = RemoteObject.createNew ("com.flycoroundview.mc7.MC7RoundView");
 //BA.debugLineNum = 20;BA.debugLine="Dim LV As Hitex_LayoutView";
ac_tfreecoin.mostCurrent._lv = RemoteObject.createNew ("wir.hitex.recycler.Hitex_LayoutView");
 //BA.debugLineNum = 21;BA.debugLine="Dim glide As Hitex_Glide";
ac_tfreecoin.mostCurrent._glide = RemoteObject.createNew ("com.hitex_glide.Hitex_Glide");
 //BA.debugLineNum = 22;BA.debugLine="Dim i_username ,i_pk,i_cookie,i_pic As String";
ac_tfreecoin.mostCurrent._i_username = RemoteObject.createImmutable("");
ac_tfreecoin.mostCurrent._i_pk = RemoteObject.createImmutable("");
ac_tfreecoin.mostCurrent._i_cookie = RemoteObject.createImmutable("");
ac_tfreecoin.mostCurrent._i_pic = RemoteObject.createImmutable("");
 //BA.debugLineNum = 23;BA.debugLine="Private list_like(20),list_com(20),list_follow(20";
ac_tfreecoin.mostCurrent._list_like = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.collections.List", new int[] {20}, new Object[]{});
ac_tfreecoin.mostCurrent._list_com = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.collections.List", new int[] {20}, new Object[]{});
ac_tfreecoin.mostCurrent._list_follow = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.collections.List", new int[] {20}, new Object[]{});
 //BA.debugLineNum = 24;BA.debugLine="Private nll=0,ncc=0,nff=0 As Int";
ac_tfreecoin._nll = BA.numberCast(int.class, 0);
ac_tfreecoin._ncc = BA.numberCast(int.class, 0);
ac_tfreecoin._nff = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 25;BA.debugLine="Dim cm As String";
ac_tfreecoin.mostCurrent._cm = RemoteObject.createImmutable("");
 //BA.debugLineNum = 26;BA.debugLine="Dim img_target As Hitex_ImageView";
ac_tfreecoin.mostCurrent._img_target = RemoteObject.createNew ("com.hitex_glide.Hitex_ImageView");
 //BA.debugLineNum = 27;BA.debugLine="Private posi As Int";
ac_tfreecoin._posi = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 28;BA.debugLine="Dim username_t ,userid_t As String";
ac_tfreecoin.mostCurrent._username_t = RemoteObject.createImmutable("");
ac_tfreecoin.mostCurrent._userid_t = RemoteObject.createImmutable("");
 //BA.debugLineNum = 29;BA.debugLine="Dim mimeno As mi_meno";
ac_tfreecoin.mostCurrent._mimeno = RemoteObject.createNew ("com.it.fome.mi_meno");
 //BA.debugLineNum = 30;BA.debugLine="Dim telegs As milad_telegramv3";
ac_tfreecoin.mostCurrent._telegs = RemoteObject.createNew ("com.mili.telegrams.teleg_warp");
 //BA.debugLineNum = 32;BA.debugLine="Dim WebView1 As WebView";
ac_tfreecoin.mostCurrent._webview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.WebViewWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Dim WebViewExtras1 As WebViewExtras";
ac_tfreecoin.mostCurrent._webviewextras1 = RemoteObject.createNew ("uk.co.martinpearman.b4a.webkit.WebViewExtras");
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _lbl_next_click() throws Exception{
try {
		Debug.PushSubsStack("lbl_next_Click (ac_tfreecoin) ","ac_tfreecoin",9,ac_tfreecoin.mostCurrent.activityBA,ac_tfreecoin.mostCurrent,873);
if (RapidSub.canDelegate("lbl_next_click")) { return com.it.fome.ac_tfreecoin.remoteMe.runUserSub(false, "ac_tfreecoin","lbl_next_click");}
 BA.debugLineNum = 873;BA.debugLine="Sub lbl_next_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 874;BA.debugLine="Select type_done";
Debug.ShouldStop(512);
switch (BA.switchObjectToInt(ac_tfreecoin._type_done,BA.numberCast(int.class, 1),BA.numberCast(int.class, 0))) {
case 0: {
 BA.debugLineNum = 877;BA.debugLine="If nll=1 Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",ac_tfreecoin._nll,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 878;BA.debugLine="Log(\"get new list\")";
Debug.ShouldStop(8192);
ac_tfreecoin.mostCurrent.__c.runVoidMethod ("LogImpl","611862021",RemoteObject.createImmutable("get new list"),0);
 BA.debugLineNum = 879;BA.debugLine="req_getlike(\"2\",\"getl\")";
Debug.ShouldStop(16384);
_req_getlike(BA.ObjectToString("2"),RemoteObject.createImmutable("getl"));
 }else {
 BA.debugLineNum = 882;BA.debugLine="getnex(0)";
Debug.ShouldStop(131072);
_getnex(BA.numberCast(int.class, 0));
 };
 break; }
case 1: {
 BA.debugLineNum = 887;BA.debugLine="If nff=1 Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",ac_tfreecoin._nff,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 888;BA.debugLine="Log(\"get new list\")";
Debug.ShouldStop(8388608);
ac_tfreecoin.mostCurrent.__c.runVoidMethod ("LogImpl","611862031",RemoteObject.createImmutable("get new list"),0);
 BA.debugLineNum = 889;BA.debugLine="req_getlike(\"1\",\"getf\")";
Debug.ShouldStop(16777216);
_req_getlike(BA.ObjectToString("1"),RemoteObject.createImmutable("getf"));
 }else {
 BA.debugLineNum = 892;BA.debugLine="getnex(2)";
Debug.ShouldStop(134217728);
_getnex(BA.numberCast(int.class, 2));
 };
 break; }
}
;
 BA.debugLineNum = 898;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _lbl_req_click() throws Exception{
try {
		Debug.PushSubsStack("lbl_req_Click (ac_tfreecoin) ","ac_tfreecoin",9,ac_tfreecoin.mostCurrent.activityBA,ac_tfreecoin.mostCurrent,704);
if (RapidSub.canDelegate("lbl_req_click")) { com.it.fome.ac_tfreecoin.remoteMe.runUserSub(false, "ac_tfreecoin","lbl_req_click"); return;}
ResumableSub_lbl_req_Click rsub = new ResumableSub_lbl_req_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_lbl_req_Click extends BA.ResumableSub {
public ResumableSub_lbl_req_Click(com.it.fome.ac_tfreecoin parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
com.it.fome.ac_tfreecoin parent;
RemoteObject _ln_chatid = RemoteObject.createImmutable(0L);
RemoteObject _ln_msgid = RemoteObject.createImmutable(0L);
RemoteObject _javascriptinterface1 = RemoteObject.declareNull("uk.co.martinpearman.b4a.webkit.DefaultJavascriptInterface");
RemoteObject _urls = RemoteObject.createImmutable("");
RemoteObject _url = RemoteObject.createImmutable("");
RemoteObject _value = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("lbl_req_Click (ac_tfreecoin) ","ac_tfreecoin",9,ac_tfreecoin.mostCurrent.activityBA,ac_tfreecoin.mostCurrent,704);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 705;BA.debugLine="Select type_done";
Debug.ShouldStop(1);
if (true) break;

case 1:
//select
this.state = 38;
switch (BA.switchObjectToInt(parent._type_done,BA.numberCast(int.class, 1),BA.numberCast(int.class, 2),BA.numberCast(int.class, 0))) {
case 0: {
this.state = 3;
if (true) break;
}
case 1: {
this.state = 17;
if (true) break;
}
case 2: {
this.state = 25;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 709;BA.debugLine="If nll=0 Then";
Debug.ShouldStop(16);
if (true) break;

case 4:
//if
this.state = 15;
if (RemoteObject.solveBoolean("=",parent._nll,BA.numberCast(double.class, 0))) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 15;
 BA.debugLineNum = 710;BA.debugLine="Log(\"get new list\")";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","611796486",RemoteObject.createImmutable("get new list"),0);
 BA.debugLineNum = 711;BA.debugLine="req_getlike(\"2\",\"getl\")";
Debug.ShouldStop(64);
_req_getlike(BA.ObjectToString("2"),RemoteObject.createImmutable("getl"));
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 714;BA.debugLine="posi=0";
Debug.ShouldStop(512);
parent._posi = BA.numberCast(int.class, 0);
 BA.debugLineNum = 715;BA.debugLine="ProgressDialogShow(\"در حال بازدید...\")";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",ac_tfreecoin.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("در حال بازدید..."))));
 BA.debugLineNum = 717;BA.debugLine="Log(\"chat id \"&list_like(6).Get(nll))";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","611796493",RemoteObject.concat(RemoteObject.createImmutable("chat id "),parent.mostCurrent._list_like.getArrayElement(false,BA.numberCast(int.class, 6)).runMethod(false,"Get",(Object)(parent._nll))),0);
 BA.debugLineNum = 718;BA.debugLine="Log(\"msg id \"&list_like(10).Get(nll))";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","611796494",RemoteObject.concat(RemoteObject.createImmutable("msg id "),parent.mostCurrent._list_like.getArrayElement(false,BA.numberCast(int.class, 10)).runMethod(false,"Get",(Object)(parent._nll))),0);
 BA.debugLineNum = 719;BA.debugLine="Log(\"user \"&list_like(11).Get(nll))";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","611796495",RemoteObject.concat(RemoteObject.createImmutable("user "),parent.mostCurrent._list_like.getArrayElement(false,BA.numberCast(int.class, 11)).runMethod(false,"Get",(Object)(parent._nll))),0);
 BA.debugLineNum = 720;BA.debugLine="Dim ln_chatid,ln_msgid As Long";
Debug.ShouldStop(32768);
_ln_chatid = RemoteObject.createImmutable(0L);Debug.locals.put("ln_chatid", _ln_chatid);
_ln_msgid = RemoteObject.createImmutable(0L);Debug.locals.put("ln_msgid", _ln_msgid);
 BA.debugLineNum = 721;BA.debugLine="ln_chatid=list_like(6).Get(nll)";
Debug.ShouldStop(65536);
_ln_chatid = BA.numberCast(long.class, parent.mostCurrent._list_like.getArrayElement(false,BA.numberCast(int.class, 6)).runMethod(false,"Get",(Object)(parent._nll)));Debug.locals.put("ln_chatid", _ln_chatid);
 BA.debugLineNum = 722;BA.debugLine="ln_msgid=list_like(10).Get(nll)";
Debug.ShouldStop(131072);
_ln_msgid = BA.numberCast(long.class, parent.mostCurrent._list_like.getArrayElement(false,BA.numberCast(int.class, 10)).runMethod(false,"Get",(Object)(parent._nll)));Debug.locals.put("ln_msgid", _ln_msgid);
 BA.debugLineNum = 725;BA.debugLine="Dim JavascriptInterface1 As DefaultJavascriptI";
Debug.ShouldStop(1048576);
_javascriptinterface1 = RemoteObject.createNew ("uk.co.martinpearman.b4a.webkit.DefaultJavascriptInterface");Debug.locals.put("JavascriptInterface1", _javascriptinterface1);
 BA.debugLineNum = 726;BA.debugLine="JavascriptInterface1.Initialize";
Debug.ShouldStop(2097152);
_javascriptinterface1.runVoidMethod ("Initialize",ac_tfreecoin.mostCurrent.activityBA);
 BA.debugLineNum = 727;BA.debugLine="WebViewExtras1.Initialize(WebView1)";
Debug.ShouldStop(4194304);
parent.mostCurrent._webviewextras1.runVoidMethod ("Initialize",(Object)((parent.mostCurrent._webview1.getObject())));
 BA.debugLineNum = 728;BA.debugLine="WebViewExtras1.addJavascriptInterface(Javascri";
Debug.ShouldStop(8388608);
parent.mostCurrent._webviewextras1.runVoidMethod ("AddJavascriptInterface",(Object)((_javascriptinterface1)),(Object)(RemoteObject.createImmutable("B4A")));
 BA.debugLineNum = 729;BA.debugLine="ln_msgid=ln_msgid/1048576";
Debug.ShouldStop(16777216);
_ln_msgid = BA.numberCast(long.class, RemoteObject.solve(new RemoteObject[] {_ln_msgid,RemoteObject.createImmutable(1048576)}, "/",0, 0));Debug.locals.put("ln_msgid", _ln_msgid);
 BA.debugLineNum = 730;BA.debugLine="Dim urls As String";
Debug.ShouldStop(33554432);
_urls = RemoteObject.createImmutable("");Debug.locals.put("urls", _urls);
 BA.debugLineNum = 731;BA.debugLine="urls=\"https://t.me/\"&list_like(11).Get(nll)&\"/";
Debug.ShouldStop(67108864);
_urls = RemoteObject.concat(RemoteObject.createImmutable("https://t.me/"),parent.mostCurrent._list_like.getArrayElement(false,BA.numberCast(int.class, 11)).runMethod(false,"Get",(Object)(parent._nll)),RemoteObject.createImmutable("/"),_ln_msgid);Debug.locals.put("urls", _urls);
 BA.debugLineNum = 732;BA.debugLine="Log(urls)";
Debug.ShouldStop(134217728);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","611796508",_urls,0);
 BA.debugLineNum = 734;BA.debugLine="WebViewExtras1.LoadUrl(urls)";
Debug.ShouldStop(536870912);
parent.mostCurrent._webviewextras1.runVoidMethod ("LoadUrl",(Object)(_urls));
 BA.debugLineNum = 735;BA.debugLine="Wait For WebView1_PageFinished (url As String)";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","webview1_pagefinished", ac_tfreecoin.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ac_tfreecoin", "lbl_req_click"), null);
this.state = 39;
return;
case 39:
//C
this.state = 9;
_url = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("url", _url);
;
 BA.debugLineNum = 736;BA.debugLine="If url=urls Then";
Debug.ShouldStop(-2147483648);
if (true) break;

case 9:
//if
this.state = 14;
if (RemoteObject.solveBoolean("=",_url,_urls)) { 
this.state = 11;
}else {
this.state = 13;
}if (true) break;

case 11:
//C
this.state = 14;
 BA.debugLineNum = 737;BA.debugLine="Log(url)";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","611796513",_url,0);
 BA.debugLineNum = 738;BA.debugLine="setreq(userid_t,list_like(8).Get(nll),1)";
Debug.ShouldStop(2);
_setreq(parent.mostCurrent._userid_t,BA.ObjectToString(parent.mostCurrent._list_like.getArrayElement(false,BA.numberCast(int.class, 8)).runMethod(false,"Get",(Object)(parent._nll))),BA.NumberToString(1));
 BA.debugLineNum = 740;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 742;BA.debugLine="getnex(posi)";
Debug.ShouldStop(32);
_getnex(parent._posi);
 BA.debugLineNum = 743;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 if (true) break;

case 14:
//C
this.state = 15;
;
 if (true) break;

case 15:
//C
this.state = 38;
;
 if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 810;BA.debugLine="If ncc=0 Then";
Debug.ShouldStop(512);
if (true) break;

case 18:
//if
this.state = 23;
if (RemoteObject.solveBoolean("=",parent._ncc,BA.numberCast(double.class, 0))) { 
this.state = 20;
}else {
this.state = 22;
}if (true) break;

case 20:
//C
this.state = 23;
 BA.debugLineNum = 811;BA.debugLine="Log(\"get new list\")";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","611796587",RemoteObject.createImmutable("get new list"),0);
 BA.debugLineNum = 812;BA.debugLine="req_getlike(\"2\",\"getc\")";
Debug.ShouldStop(2048);
_req_getlike(BA.ObjectToString("2"),RemoteObject.createImmutable("getc"));
 if (true) break;

case 22:
//C
this.state = 23;
 if (true) break;

case 23:
//C
this.state = 38;
;
 if (true) break;

case 25:
//C
this.state = 26;
 BA.debugLineNum = 823;BA.debugLine="posi=2";
Debug.ShouldStop(4194304);
parent._posi = BA.numberCast(int.class, 2);
 BA.debugLineNum = 824;BA.debugLine="If nff=1 Then";
Debug.ShouldStop(8388608);
if (true) break;

case 26:
//if
this.state = 37;
if (RemoteObject.solveBoolean("=",parent._nff,BA.numberCast(double.class, 1))) { 
this.state = 28;
}else {
this.state = 30;
}if (true) break;

case 28:
//C
this.state = 37;
 BA.debugLineNum = 825;BA.debugLine="Log(\"get new list\")";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","611796601",RemoteObject.createImmutable("get new list"),0);
 BA.debugLineNum = 826;BA.debugLine="req_getlike(\"1\",\"getf\")";
Debug.ShouldStop(33554432);
_req_getlike(BA.ObjectToString("1"),RemoteObject.createImmutable("getf"));
 if (true) break;

case 30:
//C
this.state = 31;
 BA.debugLineNum = 829;BA.debugLine="ProgressDialogShow(\"در حال جوین...\")";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",ac_tfreecoin.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("در حال جوین..."))));
 BA.debugLineNum = 833;BA.debugLine="telegs.Joinchannel(list_follow(6).Get(nff),use";
Debug.ShouldStop(1);
parent.mostCurrent._telegs.runVoidMethod ("Joinchannel",(Object)(BA.ObjectToString(parent.mostCurrent._list_follow.getArrayElement(false,BA.numberCast(int.class, 6)).runMethod(false,"Get",(Object)(parent._nff)))),(Object)(BA.numberCast(int.class, parent.mostCurrent._userid_t)));
 BA.debugLineNum = 834;BA.debugLine="Wait For telegs_joinchannel(value As String)";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","telegs_joinchannel", ac_tfreecoin.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ac_tfreecoin", "lbl_req_click"), null);
this.state = 40;
return;
case 40:
//C
this.state = 31;
_value = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("value", _value);
;
 BA.debugLineNum = 835;BA.debugLine="LogColor(\"view : \"&value,Colors.Red)";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","611796611",RemoteObject.concat(RemoteObject.createImmutable("view : "),_value),parent.mostCurrent.__c.getField(false,"Colors").getField(true,"Red"));
 BA.debugLineNum = 836;BA.debugLine="If value=\"ok\" Then";
Debug.ShouldStop(8);
if (true) break;

case 31:
//if
this.state = 36;
if (RemoteObject.solveBoolean("=",_value,BA.ObjectToString("ok"))) { 
this.state = 33;
}else {
this.state = 35;
}if (true) break;

case 33:
//C
this.state = 36;
 BA.debugLineNum = 838;BA.debugLine="setreq(userid_t,list_follow(8).Get(nff),1)";
Debug.ShouldStop(32);
_setreq(parent.mostCurrent._userid_t,BA.ObjectToString(parent.mostCurrent._list_follow.getArrayElement(false,BA.numberCast(int.class, 8)).runMethod(false,"Get",(Object)(parent._nff))),BA.NumberToString(1));
 if (true) break;

case 35:
//C
this.state = 36;
 BA.debugLineNum = 842;BA.debugLine="getnex(2)";
Debug.ShouldStop(512);
_getnex(BA.numberCast(int.class, 2));
 if (true) break;

case 36:
//C
this.state = 37;
;
 if (true) break;

case 37:
//C
this.state = 38;
;
 if (true) break;

case 38:
//C
this.state = -1;
;
 BA.debugLineNum = 871;BA.debugLine="End Sub";
Debug.ShouldStop(64);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _webview1_pagefinished(RemoteObject _url) throws Exception{
}
public static void  _telegs_joinchannel(RemoteObject _value) throws Exception{
}
public static RemoteObject  _like_onbindviewholder(RemoteObject _parent,RemoteObject _position) throws Exception{
try {
		Debug.PushSubsStack("like_onBindViewHolder (ac_tfreecoin) ","ac_tfreecoin",9,ac_tfreecoin.mostCurrent.activityBA,ac_tfreecoin.mostCurrent,700);
if (RapidSub.canDelegate("like_onbindviewholder")) { return com.it.fome.ac_tfreecoin.remoteMe.runUserSub(false, "ac_tfreecoin","like_onbindviewholder", _parent, _position);}
Debug.locals.put("Parent", _parent);
Debug.locals.put("Position", _position);
 BA.debugLineNum = 700;BA.debugLine="Sub like_onBindViewHolder (Parent As Panel, Positi";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 702;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _like_oncreateviewholder(RemoteObject _parent) throws Exception{
try {
		Debug.PushSubsStack("like_onCreateViewHolder (ac_tfreecoin) ","ac_tfreecoin",9,ac_tfreecoin.mostCurrent.activityBA,ac_tfreecoin.mostCurrent,404);
if (RapidSub.canDelegate("like_oncreateviewholder")) { return com.it.fome.ac_tfreecoin.remoteMe.runUserSub(false, "ac_tfreecoin","like_oncreateviewholder", _parent);}
RemoteObject _pnl_prof = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _bg = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
RemoteObject _pnl_caption = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _lbl_caption = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _pnl_autolike = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _ch_like = RemoteObject.declareNull("de.amberhome.objects.appcompat.ACCheckBoxWrapper");
RemoteObject _lbl_notis = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _lbl_req = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _lbl_reqs = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _lbl_next = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _lbl_nexi = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("Parent", _parent);
 BA.debugLineNum = 404;BA.debugLine="Sub like_onCreateViewHolder (Parent As Panel)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 406;BA.debugLine="Dim pnl_prof As Panel";
Debug.ShouldStop(2097152);
_pnl_prof = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("pnl_prof", _pnl_prof);
 BA.debugLineNum = 407;BA.debugLine="pnl_prof.Initialize(\"pnl_prof\")";
Debug.ShouldStop(4194304);
_pnl_prof.runVoidMethod ("Initialize",ac_tfreecoin.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("pnl_prof")));
 BA.debugLineNum = 408;BA.debugLine="Dim bg As ColorDrawable";
Debug.ShouldStop(8388608);
_bg = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("bg", _bg);
 BA.debugLineNum = 409;BA.debugLine="bg.Initialize2(Colors.White,10dip,2dip,Colors.Lig";
Debug.ShouldStop(16777216);
_bg.runVoidMethod ("Initialize2",(Object)(ac_tfreecoin.mostCurrent.__c.getField(false,"Colors").getField(true,"White")),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))),(Object)(ac_tfreecoin.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray")));
 BA.debugLineNum = 410;BA.debugLine="pnl_prof.Background=bg";
Debug.ShouldStop(33554432);
_pnl_prof.runMethod(false,"setBackground",(_bg.getObject()));
 BA.debugLineNum = 411;BA.debugLine="Parent.AddView(pnl_prof,Parent.Width/2-20%x,5%x,4";
Debug.ShouldStop(67108864);
_parent.runVoidMethod ("AddView",(Object)((_pnl_prof.getObject())),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_parent.runMethod(true,"getWidth"),RemoteObject.createImmutable(2),ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 20)),ac_tfreecoin.mostCurrent.activityBA)}, "/-",1, 0))),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),ac_tfreecoin.mostCurrent.activityBA)),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 40)),ac_tfreecoin.mostCurrent.activityBA)),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 40)),ac_tfreecoin.mostCurrent.activityBA)));
 BA.debugLineNum = 413;BA.debugLine="img_target.Initialize(\"img_target\")";
Debug.ShouldStop(268435456);
ac_tfreecoin.mostCurrent._img_target.runVoidMethod ("Initialize",ac_tfreecoin.processBA,(Object)(RemoteObject.createImmutable("img_target")));
 BA.debugLineNum = 414;BA.debugLine="img_target.Gravity=Gravity.FILL";
Debug.ShouldStop(536870912);
ac_tfreecoin.mostCurrent._img_target.runMethod(true,"setGravity",ac_tfreecoin.mostCurrent.__c.getField(false,"Gravity").getField(true,"FILL"));
 BA.debugLineNum = 415;BA.debugLine="pnl_prof.AddView(img_target,0,0,pnl_prof.Width,pn";
Debug.ShouldStop(1073741824);
_pnl_prof.runVoidMethod ("AddView",(Object)((ac_tfreecoin.mostCurrent._img_target.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_pnl_prof.runMethod(true,"getWidth")),(Object)(_pnl_prof.runMethod(true,"getHeight")));
 BA.debugLineNum = 417;BA.debugLine="Dim pnl_caption As Panel";
Debug.ShouldStop(1);
_pnl_caption = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("pnl_caption", _pnl_caption);
 BA.debugLineNum = 418;BA.debugLine="pnl_caption.Initialize(\"pnl_caption\")";
Debug.ShouldStop(2);
_pnl_caption.runVoidMethod ("Initialize",ac_tfreecoin.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("pnl_caption")));
 BA.debugLineNum = 419;BA.debugLine="Dim bg As ColorDrawable";
Debug.ShouldStop(4);
_bg = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("bg", _bg);
 BA.debugLineNum = 420;BA.debugLine="bg.Initialize2(Colors.White,10dip,2dip,Colors.Lig";
Debug.ShouldStop(8);
_bg.runVoidMethod ("Initialize2",(Object)(ac_tfreecoin.mostCurrent.__c.getField(false,"Colors").getField(true,"White")),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))),(Object)(ac_tfreecoin.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray")));
 BA.debugLineNum = 421;BA.debugLine="pnl_caption.Background=bg";
Debug.ShouldStop(16);
_pnl_caption.runMethod(false,"setBackground",(_bg.getObject()));
 BA.debugLineNum = 422;BA.debugLine="pnl_caption.Visible=False";
Debug.ShouldStop(32);
_pnl_caption.runMethod(true,"setVisible",ac_tfreecoin.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 423;BA.debugLine="Parent.AddView(pnl_caption,5%x,pnl_prof.Top+pnl_p";
Debug.ShouldStop(64);
_parent.runVoidMethod ("AddView",(Object)((_pnl_caption.getObject())),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),ac_tfreecoin.mostCurrent.activityBA)),(Object)(RemoteObject.solve(new RemoteObject[] {_pnl_prof.runMethod(true,"getTop"),_pnl_prof.runMethod(true,"getHeight"),ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),ac_tfreecoin.mostCurrent.activityBA)}, "++",2, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {_parent.runMethod(true,"getWidth"),ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),ac_tfreecoin.mostCurrent.activityBA)}, "-",1, 1)),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 17)),ac_tfreecoin.mostCurrent.activityBA)));
 BA.debugLineNum = 425;BA.debugLine="Dim lbl_caption As Label";
Debug.ShouldStop(256);
_lbl_caption = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl_caption", _lbl_caption);
 BA.debugLineNum = 426;BA.debugLine="lbl_caption.Initialize(\"lbl_caption\")";
Debug.ShouldStop(512);
_lbl_caption.runVoidMethod ("Initialize",ac_tfreecoin.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("lbl_caption")));
 BA.debugLineNum = 427;BA.debugLine="lbl_caption.TextColor=Colors.DarkGray";
Debug.ShouldStop(1024);
_lbl_caption.runMethod(true,"setTextColor",ac_tfreecoin.mostCurrent.__c.getField(false,"Colors").getField(true,"DarkGray"));
 BA.debugLineNum = 428;BA.debugLine="lbl_caption.TextSize=14";
Debug.ShouldStop(2048);
_lbl_caption.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 429;BA.debugLine="lbl_caption.Typeface=Typeface.LoadFromAssets(\"ira";
Debug.ShouldStop(4096);
_lbl_caption.runMethod(false,"setTypeface",ac_tfreecoin.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("iran_sans.ttf"))));
 BA.debugLineNum = 430;BA.debugLine="lbl_caption.Text=\"کپشن پست در این قسمت\"";
Debug.ShouldStop(8192);
_lbl_caption.runMethod(true,"setText",BA.ObjectToCharSequence("کپشن پست در این قسمت"));
 BA.debugLineNum = 431;BA.debugLine="lbl_caption.Visible=False";
Debug.ShouldStop(16384);
_lbl_caption.runMethod(true,"setVisible",ac_tfreecoin.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 432;BA.debugLine="lbl_caption.Gravity=Gravity.CENTER_HORIZONTAL+Gra";
Debug.ShouldStop(32768);
_lbl_caption.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {ac_tfreecoin.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL"),ac_tfreecoin.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")}, "+",1, 1));
 BA.debugLineNum = 433;BA.debugLine="pnl_caption.AddView(lbl_caption,0,0,pnl_caption.W";
Debug.ShouldStop(65536);
_pnl_caption.runVoidMethod ("AddView",(Object)((_lbl_caption.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_pnl_caption.runMethod(true,"getWidth")),(Object)(_pnl_caption.runMethod(true,"getHeight")));
 BA.debugLineNum = 435;BA.debugLine="Dim pnl_autolike As Panel";
Debug.ShouldStop(262144);
_pnl_autolike = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("pnl_autolike", _pnl_autolike);
 BA.debugLineNum = 436;BA.debugLine="pnl_autolike.Initialize(\"pnl_autolike\")";
Debug.ShouldStop(524288);
_pnl_autolike.runVoidMethod ("Initialize",ac_tfreecoin.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("pnl_autolike")));
 BA.debugLineNum = 437;BA.debugLine="Dim bg As ColorDrawable";
Debug.ShouldStop(1048576);
_bg = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("bg", _bg);
 BA.debugLineNum = 438;BA.debugLine="bg.Initialize2(Colors.White,10dip,2dip,Colors.Lig";
Debug.ShouldStop(2097152);
_bg.runVoidMethod ("Initialize2",(Object)(ac_tfreecoin.mostCurrent.__c.getField(false,"Colors").getField(true,"White")),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))),(Object)(ac_tfreecoin.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray")));
 BA.debugLineNum = 439;BA.debugLine="pnl_autolike.Background=bg";
Debug.ShouldStop(4194304);
_pnl_autolike.runMethod(false,"setBackground",(_bg.getObject()));
 BA.debugLineNum = 440;BA.debugLine="Parent.AddView(pnl_autolike,5%x,pnl_caption.Top+p";
Debug.ShouldStop(8388608);
_parent.runVoidMethod ("AddView",(Object)((_pnl_autolike.getObject())),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),ac_tfreecoin.mostCurrent.activityBA)),(Object)(RemoteObject.solve(new RemoteObject[] {_pnl_caption.runMethod(true,"getTop"),_pnl_caption.runMethod(true,"getHeight"),ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),ac_tfreecoin.mostCurrent.activityBA)}, "++",2, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {_parent.runMethod(true,"getWidth"),ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),ac_tfreecoin.mostCurrent.activityBA)}, "-",1, 1)),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 25)),ac_tfreecoin.mostCurrent.activityBA)));
 BA.debugLineNum = 442;BA.debugLine="Dim ch_like As ACCheckBox";
Debug.ShouldStop(33554432);
_ch_like = RemoteObject.createNew ("de.amberhome.objects.appcompat.ACCheckBoxWrapper");Debug.locals.put("ch_like", _ch_like);
 BA.debugLineNum = 443;BA.debugLine="ch_like.Initialize(\"ch_like\")";
Debug.ShouldStop(67108864);
_ch_like.runVoidMethod ("Initialize",ac_tfreecoin.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("ch_like")));
 BA.debugLineNum = 444;BA.debugLine="ch_like.Text=\"بازدید خودکار\"";
Debug.ShouldStop(134217728);
_ch_like.runMethod(true,"setText",BA.ObjectToCharSequence("بازدید خودکار"));
 BA.debugLineNum = 445;BA.debugLine="ch_like.Typeface=Typeface.LoadFromAssets(\"iran_sa";
Debug.ShouldStop(268435456);
_ch_like.runMethod(false,"setTypeface",ac_tfreecoin.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("iran_sans.ttf"))));
 BA.debugLineNum = 446;BA.debugLine="ch_like.TextSize=14";
Debug.ShouldStop(536870912);
_ch_like.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 447;BA.debugLine="pnl_autolike.AddView(ch_like,5%x,5%x,pnl_autolike";
Debug.ShouldStop(1073741824);
_pnl_autolike.runVoidMethod ("AddView",(Object)((_ch_like.getObject())),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),ac_tfreecoin.mostCurrent.activityBA)),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),ac_tfreecoin.mostCurrent.activityBA)),(Object)(RemoteObject.solve(new RemoteObject[] {_pnl_autolike.runMethod(true,"getWidth"),ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),ac_tfreecoin.mostCurrent.activityBA)}, "-",1, 1)),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 7)),ac_tfreecoin.mostCurrent.activityBA)));
 BA.debugLineNum = 449;BA.debugLine="Dim lbl_notis As Label";
Debug.ShouldStop(1);
_lbl_notis = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl_notis", _lbl_notis);
 BA.debugLineNum = 450;BA.debugLine="lbl_notis.Initialize(\"lbl_notis\")";
Debug.ShouldStop(2);
_lbl_notis.runVoidMethod ("Initialize",ac_tfreecoin.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("lbl_notis")));
 BA.debugLineNum = 451;BA.debugLine="lbl_notis.TextColor=Colors.DarkGray";
Debug.ShouldStop(4);
_lbl_notis.runMethod(true,"setTextColor",ac_tfreecoin.mostCurrent.__c.getField(false,"Colors").getField(true,"DarkGray"));
 BA.debugLineNum = 452;BA.debugLine="lbl_notis.TextSize=11";
Debug.ShouldStop(8);
_lbl_notis.runMethod(true,"setTextSize",BA.numberCast(float.class, 11));
 BA.debugLineNum = 453;BA.debugLine="lbl_notis.Typeface=Typeface.LoadFromAssets(\"iran_";
Debug.ShouldStop(16);
_lbl_notis.runMethod(false,"setTypeface",ac_tfreecoin.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("iran_sans.ttf"))));
 BA.debugLineNum = 454;BA.debugLine="lbl_notis.Text=\"نکته با فعال سازی این گزینه بصورت";
Debug.ShouldStop(32);
_lbl_notis.runMethod(true,"setText",BA.ObjectToCharSequence("نکته با فعال سازی این گزینه بصورت خودکار تمامی پست ها بازدید میشوند"));
 BA.debugLineNum = 455;BA.debugLine="lbl_notis.Gravity=Gravity.CENTER_HORIZONTAL+Gravi";
Debug.ShouldStop(64);
_lbl_notis.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {ac_tfreecoin.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL"),ac_tfreecoin.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")}, "+",1, 1));
 BA.debugLineNum = 456;BA.debugLine="pnl_autolike.AddView(lbl_notis,0,5%x,pnl_autolike";
Debug.ShouldStop(128);
_pnl_autolike.runVoidMethod ("AddView",(Object)((_lbl_notis.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),ac_tfreecoin.mostCurrent.activityBA)),(Object)(_pnl_autolike.runMethod(true,"getWidth")),(Object)(_pnl_autolike.runMethod(true,"getHeight")));
 BA.debugLineNum = 458;BA.debugLine="Dim bg As ColorDrawable";
Debug.ShouldStop(512);
_bg = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("bg", _bg);
 BA.debugLineNum = 459;BA.debugLine="bg.Initialize2(0xFF9D00FF,10dip,2dip,Colors.Light";
Debug.ShouldStop(1024);
_bg.runVoidMethod ("Initialize2",(Object)(BA.numberCast(int.class, 0xff9d00ff)),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))),(Object)(ac_tfreecoin.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray")));
 BA.debugLineNum = 461;BA.debugLine="Dim lbl_req As Label";
Debug.ShouldStop(4096);
_lbl_req = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl_req", _lbl_req);
 BA.debugLineNum = 462;BA.debugLine="lbl_req.Initialize(\"lbl_req\")";
Debug.ShouldStop(8192);
_lbl_req.runVoidMethod ("Initialize",ac_tfreecoin.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("lbl_req")));
 BA.debugLineNum = 463;BA.debugLine="lbl_req.TextColor=Colors.White";
Debug.ShouldStop(16384);
_lbl_req.runMethod(true,"setTextColor",ac_tfreecoin.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 464;BA.debugLine="lbl_req.TextSize=17";
Debug.ShouldStop(32768);
_lbl_req.runMethod(true,"setTextSize",BA.numberCast(float.class, 17));
 BA.debugLineNum = 465;BA.debugLine="lbl_req.Typeface=Typeface.LoadFromAssets(\"iran_sa";
Debug.ShouldStop(65536);
_lbl_req.runMethod(false,"setTypeface",ac_tfreecoin.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("iran_sans.ttf"))));
 BA.debugLineNum = 466;BA.debugLine="lbl_req.Text=\"بازدید\"";
Debug.ShouldStop(131072);
_lbl_req.runMethod(true,"setText",BA.ObjectToCharSequence("بازدید"));
 BA.debugLineNum = 467;BA.debugLine="lbl_req.Background=bg";
Debug.ShouldStop(262144);
_lbl_req.runMethod(false,"setBackground",(_bg.getObject()));
 BA.debugLineNum = 468;BA.debugLine="lbl_req.Gravity=Gravity.CENTER_HORIZONTAL+Gravity";
Debug.ShouldStop(524288);
_lbl_req.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {ac_tfreecoin.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL"),ac_tfreecoin.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")}, "+",1, 1));
 BA.debugLineNum = 469;BA.debugLine="Parent.AddView(lbl_req,5%x,pnl_autolike.Top+pnl_a";
Debug.ShouldStop(1048576);
_parent.runVoidMethod ("AddView",(Object)((_lbl_req.getObject())),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),ac_tfreecoin.mostCurrent.activityBA)),(Object)(RemoteObject.solve(new RemoteObject[] {_pnl_autolike.runMethod(true,"getTop"),_pnl_autolike.runMethod(true,"getHeight"),ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),ac_tfreecoin.mostCurrent.activityBA)}, "++",2, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {_parent.runMethod(true,"getWidth"),ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),ac_tfreecoin.mostCurrent.activityBA)}, "-",1, 1)),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 12)),ac_tfreecoin.mostCurrent.activityBA)));
 BA.debugLineNum = 471;BA.debugLine="Dim lbl_reqs As Label";
Debug.ShouldStop(4194304);
_lbl_reqs = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl_reqs", _lbl_reqs);
 BA.debugLineNum = 472;BA.debugLine="lbl_reqs.Initialize(\"lbl_req\")";
Debug.ShouldStop(8388608);
_lbl_reqs.runVoidMethod ("Initialize",ac_tfreecoin.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("lbl_req")));
 BA.debugLineNum = 473;BA.debugLine="lbl_reqs.TextColor=Colors.White";
Debug.ShouldStop(16777216);
_lbl_reqs.runMethod(true,"setTextColor",ac_tfreecoin.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 474;BA.debugLine="lbl_reqs.TextSize=30";
Debug.ShouldStop(33554432);
_lbl_reqs.runMethod(true,"setTextSize",BA.numberCast(float.class, 30));
 BA.debugLineNum = 475;BA.debugLine="lbl_reqs.Typeface=Typeface.MATERIALICONS";
Debug.ShouldStop(67108864);
_lbl_reqs.runMethod(false,"setTypeface",ac_tfreecoin.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"getMATERIALICONS"));
 BA.debugLineNum = 476;BA.debugLine="lbl_reqs.Text=Chr(0xE417)";
Debug.ShouldStop(134217728);
_lbl_reqs.runMethod(true,"setText",BA.ObjectToCharSequence(ac_tfreecoin.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xe417)))));
 BA.debugLineNum = 477;BA.debugLine="lbl_reqs.Gravity=Gravity.CENTER_HORIZONTAL+Gravit";
Debug.ShouldStop(268435456);
_lbl_reqs.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {ac_tfreecoin.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL"),ac_tfreecoin.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")}, "+",1, 1));
 BA.debugLineNum = 478;BA.debugLine="Parent.AddView(lbl_reqs,15%x,pnl_autolike.Top+pnl";
Debug.ShouldStop(536870912);
_parent.runVoidMethod ("AddView",(Object)((_lbl_reqs.getObject())),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),ac_tfreecoin.mostCurrent.activityBA)),(Object)(RemoteObject.solve(new RemoteObject[] {_pnl_autolike.runMethod(true,"getTop"),_pnl_autolike.runMethod(true,"getHeight"),ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),ac_tfreecoin.mostCurrent.activityBA)}, "++",2, 1)),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),ac_tfreecoin.mostCurrent.activityBA)),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 12)),ac_tfreecoin.mostCurrent.activityBA)));
 BA.debugLineNum = 480;BA.debugLine="Dim bg As ColorDrawable";
Debug.ShouldStop(-2147483648);
_bg = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("bg", _bg);
 BA.debugLineNum = 481;BA.debugLine="bg.Initialize2(0xFF454149,10dip,2dip,Colors.Light";
Debug.ShouldStop(1);
_bg.runVoidMethod ("Initialize2",(Object)(BA.numberCast(int.class, 0xff454149)),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))),(Object)(ac_tfreecoin.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray")));
 BA.debugLineNum = 483;BA.debugLine="Dim lbl_next As Label";
Debug.ShouldStop(4);
_lbl_next = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl_next", _lbl_next);
 BA.debugLineNum = 484;BA.debugLine="lbl_next.Initialize(\"lbl_next\")";
Debug.ShouldStop(8);
_lbl_next.runVoidMethod ("Initialize",ac_tfreecoin.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("lbl_next")));
 BA.debugLineNum = 485;BA.debugLine="lbl_next.TextColor=Colors.White";
Debug.ShouldStop(16);
_lbl_next.runMethod(true,"setTextColor",ac_tfreecoin.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 486;BA.debugLine="lbl_next.TextSize=17";
Debug.ShouldStop(32);
_lbl_next.runMethod(true,"setTextSize",BA.numberCast(float.class, 17));
 BA.debugLineNum = 487;BA.debugLine="lbl_next.Typeface=Typeface.LoadFromAssets(\"iran_s";
Debug.ShouldStop(64);
_lbl_next.runMethod(false,"setTypeface",ac_tfreecoin.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("iran_sans.ttf"))));
 BA.debugLineNum = 488;BA.debugLine="lbl_next.Text=\"بعدی\"";
Debug.ShouldStop(128);
_lbl_next.runMethod(true,"setText",BA.ObjectToCharSequence("بعدی"));
 BA.debugLineNum = 489;BA.debugLine="lbl_next.Background=bg";
Debug.ShouldStop(256);
_lbl_next.runMethod(false,"setBackground",(_bg.getObject()));
 BA.debugLineNum = 490;BA.debugLine="lbl_next.Gravity=Gravity.CENTER_HORIZONTAL+Gravit";
Debug.ShouldStop(512);
_lbl_next.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {ac_tfreecoin.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL"),ac_tfreecoin.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")}, "+",1, 1));
 BA.debugLineNum = 491;BA.debugLine="Parent.AddView(lbl_next,5%x,lbl_req.Top+lbl_req.H";
Debug.ShouldStop(1024);
_parent.runVoidMethod ("AddView",(Object)((_lbl_next.getObject())),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),ac_tfreecoin.mostCurrent.activityBA)),(Object)(RemoteObject.solve(new RemoteObject[] {_lbl_req.runMethod(true,"getTop"),_lbl_req.runMethod(true,"getHeight"),ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),ac_tfreecoin.mostCurrent.activityBA)}, "++",2, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {_parent.runMethod(true,"getWidth"),ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),ac_tfreecoin.mostCurrent.activityBA)}, "-",1, 1)),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 12)),ac_tfreecoin.mostCurrent.activityBA)));
 BA.debugLineNum = 493;BA.debugLine="Dim lbl_nexi As Label";
Debug.ShouldStop(4096);
_lbl_nexi = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl_nexi", _lbl_nexi);
 BA.debugLineNum = 494;BA.debugLine="lbl_nexi.Initialize(\"lbl_next\")";
Debug.ShouldStop(8192);
_lbl_nexi.runVoidMethod ("Initialize",ac_tfreecoin.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("lbl_next")));
 BA.debugLineNum = 495;BA.debugLine="lbl_nexi.TextColor=Colors.LightGray";
Debug.ShouldStop(16384);
_lbl_nexi.runMethod(true,"setTextColor",ac_tfreecoin.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray"));
 BA.debugLineNum = 496;BA.debugLine="lbl_nexi.TextSize=30";
Debug.ShouldStop(32768);
_lbl_nexi.runMethod(true,"setTextSize",BA.numberCast(float.class, 30));
 BA.debugLineNum = 497;BA.debugLine="lbl_nexi.Typeface=Typeface.MATERIALICONS";
Debug.ShouldStop(65536);
_lbl_nexi.runMethod(false,"setTypeface",ac_tfreecoin.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"getMATERIALICONS"));
 BA.debugLineNum = 498;BA.debugLine="lbl_nexi.Text=Chr(0xE15F)";
Debug.ShouldStop(131072);
_lbl_nexi.runMethod(true,"setText",BA.ObjectToCharSequence(ac_tfreecoin.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xe15f)))));
 BA.debugLineNum = 499;BA.debugLine="lbl_nexi.Gravity=Gravity.CENTER_HORIZONTAL+Gravit";
Debug.ShouldStop(262144);
_lbl_nexi.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {ac_tfreecoin.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL"),ac_tfreecoin.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")}, "+",1, 1));
 BA.debugLineNum = 500;BA.debugLine="Parent.AddView(lbl_nexi,15%x,lbl_req.Top+lbl_req.";
Debug.ShouldStop(524288);
_parent.runVoidMethod ("AddView",(Object)((_lbl_nexi.getObject())),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),ac_tfreecoin.mostCurrent.activityBA)),(Object)(RemoteObject.solve(new RemoteObject[] {_lbl_req.runMethod(true,"getTop"),_lbl_req.runMethod(true,"getHeight"),ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),ac_tfreecoin.mostCurrent.activityBA)}, "++",2, 1)),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),ac_tfreecoin.mostCurrent.activityBA)),(Object)(ac_tfreecoin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 12)),ac_tfreecoin.mostCurrent.activityBA)));
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
public static RemoteObject  _meno_click() throws Exception{
try {
		Debug.PushSubsStack("meno_Click (ac_tfreecoin) ","ac_tfreecoin",9,ac_tfreecoin.mostCurrent.activityBA,ac_tfreecoin.mostCurrent,1169);
if (RapidSub.canDelegate("meno_click")) { return com.it.fome.ac_tfreecoin.remoteMe.runUserSub(false, "ac_tfreecoin","meno_click");}
 BA.debugLineNum = 1169;BA.debugLine="Sub meno_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 1170;BA.debugLine="mimeno.Initialize(\"mimeno\",Me)";
Debug.ShouldStop(131072);
ac_tfreecoin.mostCurrent._mimeno.runClassMethod (com.it.fome.mi_meno.class, "_initialize" /*RemoteObject*/ ,ac_tfreecoin.mostCurrent.activityBA,(Object)(BA.ObjectToString("mimeno")),(Object)(ac_tfreecoin.getObject()));
 BA.debugLineNum = 1171;BA.debugLine="mimeno.addpnl";
Debug.ShouldStop(262144);
ac_tfreecoin.mostCurrent._mimeno.runClassMethod (com.it.fome.mi_meno.class, "_addpnl" /*RemoteObject*/ );
 BA.debugLineNum = 1172;BA.debugLine="mimeno.open";
Debug.ShouldStop(524288);
ac_tfreecoin.mostCurrent._mimeno.runClassMethod (com.it.fome.mi_meno.class, "_open" /*RemoteObject*/ );
 BA.debugLineNum = 1173;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("prfn_onPostStringErrorListener (ac_tfreecoin) ","ac_tfreecoin",9,ac_tfreecoin.mostCurrent.activityBA,ac_tfreecoin.mostCurrent,184);
if (RapidSub.canDelegate("prfn_onpoststringerrorlistener")) { return com.it.fome.ac_tfreecoin.remoteMe.runUserSub(false, "ac_tfreecoin","prfn_onpoststringerrorlistener", _error, _tag);}
Debug.locals.put("Error", _error);
Debug.locals.put("Tag", _tag);
 BA.debugLineNum = 184;BA.debugLine="Sub prfn_onPostStringErrorListener(Error As Respon";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 186;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(33554432);
ac_tfreecoin.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 187;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("prfn_onPostStringOkListener (ac_tfreecoin) ","ac_tfreecoin",9,ac_tfreecoin.mostCurrent.activityBA,ac_tfreecoin.mostCurrent,189);
if (RapidSub.canDelegate("prfn_onpoststringoklistener")) { return com.it.fome.ac_tfreecoin.remoteMe.runUserSub(false, "ac_tfreecoin","prfn_onpoststringoklistener", _result, _tag);}
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
RemoteObject _msg_idx = RemoteObject.createImmutable("");
RemoteObject _types = RemoteObject.createImmutable("");
RemoteObject _start = RemoteObject.createImmutable("");
RemoteObject _finish = RemoteObject.createImmutable("");
RemoteObject _picx = RemoteObject.createImmutable("");
RemoteObject _chat_idx = RemoteObject.createImmutable("");
RemoteObject _status = RemoteObject.createImmutable("");
RemoteObject _token = RemoteObject.createImmutable("");
RemoteObject _njob = RemoteObject.createImmutable("");
RemoteObject _codes = RemoteObject.createImmutable("");
RemoteObject _comtext = RemoteObject.createImmutable("");
RemoteObject _imgpost = RemoteObject.createImmutable("");
RemoteObject _target = RemoteObject.createImmutable("");
Debug.locals.put("Tag", _tag);
 BA.debugLineNum = 189;BA.debugLine="Sub prfn_onPostStringOkListener(Result As String";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 190;BA.debugLine="LogColor(Result,Colors.Blue)";
Debug.ShouldStop(536870912);
ac_tfreecoin.mostCurrent.__c.runVoidMethod ("LogImpl","611468801",_result,ac_tfreecoin.mostCurrent.__c.getField(false,"Colors").getField(true,"Blue"));
 BA.debugLineNum = 191;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(1073741824);
ac_tfreecoin.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 192;BA.debugLine="Select Tag";
Debug.ShouldStop(-2147483648);
switch (BA.switchObjectToInt(_tag,BA.ObjectToString("iuser"),BA.ObjectToString("getinsta"),BA.ObjectToString("getl"),BA.ObjectToString("getc"),BA.ObjectToString("getf"),BA.ObjectToString("donereq"))) {
case 0: {
 BA.debugLineNum = 194;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(2);
ac_tfreecoin.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 195;BA.debugLine="Log(Result)";
Debug.ShouldStop(4);
ac_tfreecoin.mostCurrent.__c.runVoidMethod ("LogImpl","611468806",_result,0);
 break; }
case 1: {
 BA.debugLineNum = 198;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(32);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 199;BA.debugLine="parser.Initialize(Result)";
Debug.ShouldStop(64);
_parser.runVoidMethod ("Initialize",(Object)(_result));
 BA.debugLineNum = 200;BA.debugLine="Dim root As List = parser.NextArray";
Debug.ShouldStop(128);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_root = _parser.runMethod(false,"NextArray");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 201;BA.debugLine="For Each colroot As Map In root";
Debug.ShouldStop(256);
_colroot = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group11 = _root;
final int groupLen11 = group11.runMethod(true,"getSize").<Integer>get()
;int index11 = 0;
;
for (; index11 < groupLen11;index11++){
_colroot.setObject(group11.runMethod(false,"Get",index11));
Debug.locals.put("colroot", _colroot);
 BA.debugLineNum = 202;BA.debugLine="Dim Result As String = colroot.Get(\"result\")";
Debug.ShouldStop(512);
_result = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("result")))));Debug.locals.put("Result", _result);Debug.locals.put("Result", _result);
 BA.debugLineNum = 203;BA.debugLine="Dim c_m As String = colroot.Get(\"c_m\")";
Debug.ShouldStop(1024);
_c_m = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("c_m")))));Debug.locals.put("c_m", _c_m);Debug.locals.put("c_m", _c_m);
 BA.debugLineNum = 204;BA.debugLine="Dim uid As String = colroot.Get(\"uid\")";
Debug.ShouldStop(2048);
_uid = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("uid")))));Debug.locals.put("uid", _uid);Debug.locals.put("uid", _uid);
 BA.debugLineNum = 205;BA.debugLine="Dim first_last As String = colroot.Get(\"first_";
Debug.ShouldStop(4096);
_first_last = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("first_last")))));Debug.locals.put("first_last", _first_last);Debug.locals.put("first_last", _first_last);
 BA.debugLineNum = 206;BA.debugLine="Dim id As String = colroot.Get(\"id\")";
Debug.ShouldStop(8192);
_id = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 207;BA.debugLine="Dim userid As String = colroot.Get(\"userid\")";
Debug.ShouldStop(16384);
_userid = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("userid")))));Debug.locals.put("userid", _userid);Debug.locals.put("userid", _userid);
 BA.debugLineNum = 208;BA.debugLine="Dim username As String = colroot.Get(\"username";
Debug.ShouldStop(32768);
_username = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("username")))));Debug.locals.put("username", _username);Debug.locals.put("username", _username);
 BA.debugLineNum = 209;BA.debugLine="Dim c_ch As String = colroot.Get(\"c_ch\")";
Debug.ShouldStop(65536);
_c_ch = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("c_ch")))));Debug.locals.put("c_ch", _c_ch);Debug.locals.put("c_ch", _c_ch);
 BA.debugLineNum = 210;BA.debugLine="Dim n_coins=c_m As Long";
Debug.ShouldStop(131072);
_n_coins = BA.numberCast(long.class, _c_m);Debug.locals.put("n_coins", _n_coins);Debug.locals.put("n_coins", _n_coins);
 BA.debugLineNum = 211;BA.debugLine="If n_coins>100 Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean(">",_n_coins,BA.numberCast(double.class, 100))) { 
 BA.debugLineNum = 212;BA.debugLine="lbl_nums.Text=\"سکه \"&NumberFormat(c_m,3,0)";
Debug.ShouldStop(524288);
ac_tfreecoin.mostCurrent._lbl_nums.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("سکه "),ac_tfreecoin.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _c_m)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 0))))));
 }else {
 BA.debugLineNum = 214;BA.debugLine="lbl_nums.Text=\"سکه \"&c_m";
Debug.ShouldStop(2097152);
ac_tfreecoin.mostCurrent._lbl_nums.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("سکه "),_c_m)));
 };
 BA.debugLineNum = 218;BA.debugLine="sql1.ExecNonQuery(\"UPDATE tbl_coin set cm='\"&c";
Debug.ShouldStop(33554432);
ac_tfreecoin._sql1.runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE tbl_coin set cm='"),_c_m,RemoteObject.createImmutable("',cf='"),_c_ch,RemoteObject.createImmutable("' WHERE userid='"),ac_tfreecoin.mostCurrent._userid_t,RemoteObject.createImmutable("' "))));
 }
}Debug.locals.put("colroot", _colroot);
;
 break; }
case 2: {
 BA.debugLineNum = 226;BA.debugLine="Log(Result)";
Debug.ShouldStop(2);
ac_tfreecoin.mostCurrent.__c.runVoidMethod ("LogImpl","611468837",_result,0);
 BA.debugLineNum = 227;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(4);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 228;BA.debugLine="parser.Initialize(Result)";
Debug.ShouldStop(8);
_parser.runVoidMethod ("Initialize",(Object)(_result));
 BA.debugLineNum = 229;BA.debugLine="Dim root As List = parser.NextArray";
Debug.ShouldStop(16);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_root = _parser.runMethod(false,"NextArray");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 230;BA.debugLine="For Each colroot As Map In root";
Debug.ShouldStop(32);
_colroot = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group33 = _root;
final int groupLen33 = group33.runMethod(true,"getSize").<Integer>get()
;int index33 = 0;
;
for (; index33 < groupLen33;index33++){
_colroot.setObject(group33.runMethod(false,"Get",index33));
Debug.locals.put("colroot", _colroot);
 BA.debugLineNum = 231;BA.debugLine="Dim uid As String = colroot.Get(\"uid\")";
Debug.ShouldStop(64);
_uid = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("uid")))));Debug.locals.put("uid", _uid);Debug.locals.put("uid", _uid);
 BA.debugLineNum = 232;BA.debugLine="Dim msg_idx As String = colroot.Get(\"msg_id\")";
Debug.ShouldStop(128);
_msg_idx = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msg_id")))));Debug.locals.put("msg_idx", _msg_idx);Debug.locals.put("msg_idx", _msg_idx);
 BA.debugLineNum = 233;BA.debugLine="Dim types As String = colroot.Get(\"types\")";
Debug.ShouldStop(256);
_types = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("types")))));Debug.locals.put("types", _types);Debug.locals.put("types", _types);
 BA.debugLineNum = 234;BA.debugLine="Dim start As String = colroot.Get(\"start\")";
Debug.ShouldStop(512);
_start = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("start")))));Debug.locals.put("start", _start);Debug.locals.put("start", _start);
 BA.debugLineNum = 235;BA.debugLine="Dim finish As String = colroot.Get(\"finish\")";
Debug.ShouldStop(1024);
_finish = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("finish")))));Debug.locals.put("finish", _finish);Debug.locals.put("finish", _finish);
 BA.debugLineNum = 236;BA.debugLine="Dim id As String = colroot.Get(\"id\")";
Debug.ShouldStop(2048);
_id = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 237;BA.debugLine="Dim userid As String = colroot.Get(\"userid\")";
Debug.ShouldStop(4096);
_userid = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("userid")))));Debug.locals.put("userid", _userid);Debug.locals.put("userid", _userid);
 BA.debugLineNum = 238;BA.debugLine="Dim picx As String = colroot.Get(\"pic\")";
Debug.ShouldStop(8192);
_picx = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("pic")))));Debug.locals.put("picx", _picx);Debug.locals.put("picx", _picx);
 BA.debugLineNum = 239;BA.debugLine="Dim chat_idx As String = colroot.Get(\"chat_id\"";
Debug.ShouldStop(16384);
_chat_idx = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("chat_id")))));Debug.locals.put("chat_idx", _chat_idx);Debug.locals.put("chat_idx", _chat_idx);
 BA.debugLineNum = 240;BA.debugLine="Dim status As String = colroot.Get(\"status\")";
Debug.ShouldStop(32768);
_status = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("status")))));Debug.locals.put("status", _status);Debug.locals.put("status", _status);
 BA.debugLineNum = 241;BA.debugLine="Dim token As String = colroot.Get(\"token\")";
Debug.ShouldStop(65536);
_token = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("token")))));Debug.locals.put("token", _token);Debug.locals.put("token", _token);
 BA.debugLineNum = 242;BA.debugLine="Dim njob As String = colroot.Get(\"njob\")";
Debug.ShouldStop(131072);
_njob = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("njob")))));Debug.locals.put("njob", _njob);Debug.locals.put("njob", _njob);
 BA.debugLineNum = 243;BA.debugLine="list_like(0).Add(uid)";
Debug.ShouldStop(262144);
ac_tfreecoin.mostCurrent._list_like.getArrayElement(false,BA.numberCast(int.class, 0)).runVoidMethod ("Add",(Object)((_uid)));
 BA.debugLineNum = 244;BA.debugLine="list_like(1).Add(types)";
Debug.ShouldStop(524288);
ac_tfreecoin.mostCurrent._list_like.getArrayElement(false,BA.numberCast(int.class, 1)).runVoidMethod ("Add",(Object)((_types)));
 BA.debugLineNum = 245;BA.debugLine="list_like(2).Add(start)";
Debug.ShouldStop(1048576);
ac_tfreecoin.mostCurrent._list_like.getArrayElement(false,BA.numberCast(int.class, 2)).runVoidMethod ("Add",(Object)((_start)));
 BA.debugLineNum = 246;BA.debugLine="list_like(3).Add(finish)";
Debug.ShouldStop(2097152);
ac_tfreecoin.mostCurrent._list_like.getArrayElement(false,BA.numberCast(int.class, 3)).runVoidMethod ("Add",(Object)((_finish)));
 BA.debugLineNum = 247;BA.debugLine="list_like(4).Add(id)";
Debug.ShouldStop(4194304);
ac_tfreecoin.mostCurrent._list_like.getArrayElement(false,BA.numberCast(int.class, 4)).runVoidMethod ("Add",(Object)((_id)));
 BA.debugLineNum = 248;BA.debugLine="list_like(5).Add(userid)";
Debug.ShouldStop(8388608);
ac_tfreecoin.mostCurrent._list_like.getArrayElement(false,BA.numberCast(int.class, 5)).runVoidMethod ("Add",(Object)((_userid)));
 BA.debugLineNum = 249;BA.debugLine="list_like(6).Add(chat_idx)";
Debug.ShouldStop(16777216);
ac_tfreecoin.mostCurrent._list_like.getArrayElement(false,BA.numberCast(int.class, 6)).runVoidMethod ("Add",(Object)((_chat_idx)));
 BA.debugLineNum = 250;BA.debugLine="list_like(7).Add(status)";
Debug.ShouldStop(33554432);
ac_tfreecoin.mostCurrent._list_like.getArrayElement(false,BA.numberCast(int.class, 7)).runVoidMethod ("Add",(Object)((_status)));
 BA.debugLineNum = 251;BA.debugLine="list_like(8).Add(token)";
Debug.ShouldStop(67108864);
ac_tfreecoin.mostCurrent._list_like.getArrayElement(false,BA.numberCast(int.class, 8)).runVoidMethod ("Add",(Object)((_token)));
 BA.debugLineNum = 252;BA.debugLine="list_like(9).Add(picx)";
Debug.ShouldStop(134217728);
ac_tfreecoin.mostCurrent._list_like.getArrayElement(false,BA.numberCast(int.class, 9)).runVoidMethod ("Add",(Object)((_picx)));
 BA.debugLineNum = 253;BA.debugLine="list_like(10).Add(msg_idx)";
Debug.ShouldStop(268435456);
ac_tfreecoin.mostCurrent._list_like.getArrayElement(false,BA.numberCast(int.class, 10)).runVoidMethod ("Add",(Object)((_msg_idx)));
 BA.debugLineNum = 254;BA.debugLine="list_like(11).Add(njob)";
Debug.ShouldStop(536870912);
ac_tfreecoin.mostCurrent._list_like.getArrayElement(false,BA.numberCast(int.class, 11)).runVoidMethod ("Add",(Object)((_njob)));
 }
}Debug.locals.put("colroot", _colroot);
;
 BA.debugLineNum = 260;BA.debugLine="nll=list_like(4).Size";
Debug.ShouldStop(8);
ac_tfreecoin._nll = ac_tfreecoin.mostCurrent._list_like.getArrayElement(false,BA.numberCast(int.class, 4)).runMethod(true,"getSize");
 BA.debugLineNum = 262;BA.debugLine="If list_like(4).Size>0 Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean(">",ac_tfreecoin.mostCurrent._list_like.getArrayElement(false,BA.numberCast(int.class, 4)).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 263;BA.debugLine="setviewsa(0)";
Debug.ShouldStop(64);
_setviewsa(BA.numberCast(int.class, 0));
 };
 break; }
case 3: {
 BA.debugLineNum = 269;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(4096);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 270;BA.debugLine="parser.Initialize(Result)";
Debug.ShouldStop(8192);
_parser.runVoidMethod ("Initialize",(Object)(_result));
 BA.debugLineNum = 271;BA.debugLine="Dim root As List = parser.NextArray";
Debug.ShouldStop(16384);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_root = _parser.runMethod(false,"NextArray");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 272;BA.debugLine="For Each colroot As Map In root";
Debug.ShouldStop(32768);
_colroot = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group67 = _root;
final int groupLen67 = group67.runMethod(true,"getSize").<Integer>get()
;int index67 = 0;
;
for (; index67 < groupLen67;index67++){
_colroot.setObject(group67.runMethod(false,"Get",index67));
Debug.locals.put("colroot", _colroot);
 BA.debugLineNum = 273;BA.debugLine="Dim uid As String = colroot.Get(\"uid\")";
Debug.ShouldStop(65536);
_uid = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("uid")))));Debug.locals.put("uid", _uid);Debug.locals.put("uid", _uid);
 BA.debugLineNum = 274;BA.debugLine="Dim codes As String = colroot.Get(\"codes\")";
Debug.ShouldStop(131072);
_codes = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("codes")))));Debug.locals.put("codes", _codes);Debug.locals.put("codes", _codes);
 BA.debugLineNum = 275;BA.debugLine="Dim types As String = colroot.Get(\"types\")";
Debug.ShouldStop(262144);
_types = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("types")))));Debug.locals.put("types", _types);Debug.locals.put("types", _types);
 BA.debugLineNum = 276;BA.debugLine="Dim comtext As String = colroot.Get(\"comtext\")";
Debug.ShouldStop(524288);
_comtext = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("comtext")))));Debug.locals.put("comtext", _comtext);Debug.locals.put("comtext", _comtext);
 BA.debugLineNum = 277;BA.debugLine="Dim start As String = colroot.Get(\"start\")";
Debug.ShouldStop(1048576);
_start = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("start")))));Debug.locals.put("start", _start);Debug.locals.put("start", _start);
 BA.debugLineNum = 278;BA.debugLine="Dim finish As String = colroot.Get(\"finish\")";
Debug.ShouldStop(2097152);
_finish = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("finish")))));Debug.locals.put("finish", _finish);Debug.locals.put("finish", _finish);
 BA.debugLineNum = 279;BA.debugLine="Dim id As String = colroot.Get(\"id\")";
Debug.ShouldStop(4194304);
_id = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 280;BA.debugLine="Dim userid As String = colroot.Get(\"userid\")";
Debug.ShouldStop(8388608);
_userid = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("userid")))));Debug.locals.put("userid", _userid);Debug.locals.put("userid", _userid);
 BA.debugLineNum = 281;BA.debugLine="Dim imgpost As String = colroot.Get(\"imgpost\")";
Debug.ShouldStop(16777216);
_imgpost = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("imgpost")))));Debug.locals.put("imgpost", _imgpost);Debug.locals.put("imgpost", _imgpost);
 BA.debugLineNum = 282;BA.debugLine="Dim target As String = colroot.Get(\"target\")";
Debug.ShouldStop(33554432);
_target = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("target")))));Debug.locals.put("target", _target);Debug.locals.put("target", _target);
 BA.debugLineNum = 283;BA.debugLine="Dim status As String = colroot.Get(\"status\")";
Debug.ShouldStop(67108864);
_status = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("status")))));Debug.locals.put("status", _status);Debug.locals.put("status", _status);
 BA.debugLineNum = 284;BA.debugLine="Dim token As String = colroot.Get(\"token\")";
Debug.ShouldStop(134217728);
_token = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("token")))));Debug.locals.put("token", _token);Debug.locals.put("token", _token);
 BA.debugLineNum = 286;BA.debugLine="list_com(0).Add(uid)";
Debug.ShouldStop(536870912);
ac_tfreecoin.mostCurrent._list_com.getArrayElement(false,BA.numberCast(int.class, 0)).runVoidMethod ("Add",(Object)((_uid)));
 BA.debugLineNum = 287;BA.debugLine="list_com(1).Add(types)";
Debug.ShouldStop(1073741824);
ac_tfreecoin.mostCurrent._list_com.getArrayElement(false,BA.numberCast(int.class, 1)).runVoidMethod ("Add",(Object)((_types)));
 BA.debugLineNum = 288;BA.debugLine="list_com(2).Add(start)";
Debug.ShouldStop(-2147483648);
ac_tfreecoin.mostCurrent._list_com.getArrayElement(false,BA.numberCast(int.class, 2)).runVoidMethod ("Add",(Object)((_start)));
 BA.debugLineNum = 289;BA.debugLine="list_com(3).Add(finish)";
Debug.ShouldStop(1);
ac_tfreecoin.mostCurrent._list_com.getArrayElement(false,BA.numberCast(int.class, 3)).runVoidMethod ("Add",(Object)((_finish)));
 BA.debugLineNum = 290;BA.debugLine="list_com(4).Add(id)";
Debug.ShouldStop(2);
ac_tfreecoin.mostCurrent._list_com.getArrayElement(false,BA.numberCast(int.class, 4)).runVoidMethod ("Add",(Object)((_id)));
 BA.debugLineNum = 291;BA.debugLine="list_com(5).Add(userid)";
Debug.ShouldStop(4);
ac_tfreecoin.mostCurrent._list_com.getArrayElement(false,BA.numberCast(int.class, 5)).runVoidMethod ("Add",(Object)((_userid)));
 BA.debugLineNum = 292;BA.debugLine="list_com(6).Add(target)";
Debug.ShouldStop(8);
ac_tfreecoin.mostCurrent._list_com.getArrayElement(false,BA.numberCast(int.class, 6)).runVoidMethod ("Add",(Object)((_target)));
 BA.debugLineNum = 293;BA.debugLine="list_com(7).Add(status)";
Debug.ShouldStop(16);
ac_tfreecoin.mostCurrent._list_com.getArrayElement(false,BA.numberCast(int.class, 7)).runVoidMethod ("Add",(Object)((_status)));
 BA.debugLineNum = 294;BA.debugLine="list_com(8).Add(token)";
Debug.ShouldStop(32);
ac_tfreecoin.mostCurrent._list_com.getArrayElement(false,BA.numberCast(int.class, 8)).runVoidMethod ("Add",(Object)((_token)));
 BA.debugLineNum = 295;BA.debugLine="list_com(9).Add(comtext)";
Debug.ShouldStop(64);
ac_tfreecoin.mostCurrent._list_com.getArrayElement(false,BA.numberCast(int.class, 9)).runVoidMethod ("Add",(Object)((_comtext)));
 BA.debugLineNum = 296;BA.debugLine="list_com(10).Add(imgpost)";
Debug.ShouldStop(128);
ac_tfreecoin.mostCurrent._list_com.getArrayElement(false,BA.numberCast(int.class, 10)).runVoidMethod ("Add",(Object)((_imgpost)));
 }
}Debug.locals.put("colroot", _colroot);
;
 BA.debugLineNum = 303;BA.debugLine="Log(comtext)";
Debug.ShouldStop(16384);
ac_tfreecoin.mostCurrent.__c.runVoidMethod ("LogImpl","611468914",_comtext,0);
 BA.debugLineNum = 305;BA.debugLine="ncc=list_com(4).Size";
Debug.ShouldStop(65536);
ac_tfreecoin._ncc = ac_tfreecoin.mostCurrent._list_com.getArrayElement(false,BA.numberCast(int.class, 4)).runMethod(true,"getSize");
 BA.debugLineNum = 307;BA.debugLine="setviewsa(1)";
Debug.ShouldStop(262144);
_setviewsa(BA.numberCast(int.class, 1));
 break; }
case 4: {
 BA.debugLineNum = 310;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(2097152);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 311;BA.debugLine="parser.Initialize(Result)";
Debug.ShouldStop(4194304);
_parser.runVoidMethod ("Initialize",(Object)(_result));
 BA.debugLineNum = 312;BA.debugLine="Dim root As List = parser.NextArray";
Debug.ShouldStop(8388608);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_root = _parser.runMethod(false,"NextArray");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 313;BA.debugLine="For Each colroot As Map In root";
Debug.ShouldStop(16777216);
_colroot = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group99 = _root;
final int groupLen99 = group99.runMethod(true,"getSize").<Integer>get()
;int index99 = 0;
;
for (; index99 < groupLen99;index99++){
_colroot.setObject(group99.runMethod(false,"Get",index99));
Debug.locals.put("colroot", _colroot);
 BA.debugLineNum = 314;BA.debugLine="Dim uid As String = colroot.Get(\"uid\")";
Debug.ShouldStop(33554432);
_uid = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("uid")))));Debug.locals.put("uid", _uid);Debug.locals.put("uid", _uid);
 BA.debugLineNum = 315;BA.debugLine="Dim msg_idx As String = colroot.Get(\"msg_id\")";
Debug.ShouldStop(67108864);
_msg_idx = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msg_id")))));Debug.locals.put("msg_idx", _msg_idx);Debug.locals.put("msg_idx", _msg_idx);
 BA.debugLineNum = 316;BA.debugLine="Dim types As String = colroot.Get(\"types\")";
Debug.ShouldStop(134217728);
_types = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("types")))));Debug.locals.put("types", _types);Debug.locals.put("types", _types);
 BA.debugLineNum = 317;BA.debugLine="Dim start As String = colroot.Get(\"start\")";
Debug.ShouldStop(268435456);
_start = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("start")))));Debug.locals.put("start", _start);Debug.locals.put("start", _start);
 BA.debugLineNum = 318;BA.debugLine="Dim finish As String = colroot.Get(\"finish\")";
Debug.ShouldStop(536870912);
_finish = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("finish")))));Debug.locals.put("finish", _finish);Debug.locals.put("finish", _finish);
 BA.debugLineNum = 319;BA.debugLine="Dim id As String = colroot.Get(\"id\")";
Debug.ShouldStop(1073741824);
_id = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 320;BA.debugLine="Dim userid As String = colroot.Get(\"userid\")";
Debug.ShouldStop(-2147483648);
_userid = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("userid")))));Debug.locals.put("userid", _userid);Debug.locals.put("userid", _userid);
 BA.debugLineNum = 321;BA.debugLine="Dim picx As String = colroot.Get(\"pic\")";
Debug.ShouldStop(1);
_picx = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("pic")))));Debug.locals.put("picx", _picx);Debug.locals.put("picx", _picx);
 BA.debugLineNum = 322;BA.debugLine="Dim chat_idx As String = colroot.Get(\"chat_id\"";
Debug.ShouldStop(2);
_chat_idx = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("chat_id")))));Debug.locals.put("chat_idx", _chat_idx);Debug.locals.put("chat_idx", _chat_idx);
 BA.debugLineNum = 323;BA.debugLine="Dim status As String = colroot.Get(\"status\")";
Debug.ShouldStop(4);
_status = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("status")))));Debug.locals.put("status", _status);Debug.locals.put("status", _status);
 BA.debugLineNum = 324;BA.debugLine="Dim token As String = colroot.Get(\"token\")";
Debug.ShouldStop(8);
_token = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("token")))));Debug.locals.put("token", _token);Debug.locals.put("token", _token);
 BA.debugLineNum = 325;BA.debugLine="Log(\"pic : \"&picx)";
Debug.ShouldStop(16);
ac_tfreecoin.mostCurrent.__c.runVoidMethod ("LogImpl","611468936",RemoteObject.concat(RemoteObject.createImmutable("pic : "),_picx),0);
 BA.debugLineNum = 326;BA.debugLine="list_follow(0).Add(uid)";
Debug.ShouldStop(32);
ac_tfreecoin.mostCurrent._list_follow.getArrayElement(false,BA.numberCast(int.class, 0)).runVoidMethod ("Add",(Object)((_uid)));
 BA.debugLineNum = 327;BA.debugLine="list_follow(1).Add(types)";
Debug.ShouldStop(64);
ac_tfreecoin.mostCurrent._list_follow.getArrayElement(false,BA.numberCast(int.class, 1)).runVoidMethod ("Add",(Object)((_types)));
 BA.debugLineNum = 328;BA.debugLine="list_follow(2).Add(start)";
Debug.ShouldStop(128);
ac_tfreecoin.mostCurrent._list_follow.getArrayElement(false,BA.numberCast(int.class, 2)).runVoidMethod ("Add",(Object)((_start)));
 BA.debugLineNum = 329;BA.debugLine="list_follow(3).Add(finish)";
Debug.ShouldStop(256);
ac_tfreecoin.mostCurrent._list_follow.getArrayElement(false,BA.numberCast(int.class, 3)).runVoidMethod ("Add",(Object)((_finish)));
 BA.debugLineNum = 330;BA.debugLine="list_follow(4).Add(id)";
Debug.ShouldStop(512);
ac_tfreecoin.mostCurrent._list_follow.getArrayElement(false,BA.numberCast(int.class, 4)).runVoidMethod ("Add",(Object)((_id)));
 BA.debugLineNum = 331;BA.debugLine="list_follow(5).Add(userid)";
Debug.ShouldStop(1024);
ac_tfreecoin.mostCurrent._list_follow.getArrayElement(false,BA.numberCast(int.class, 5)).runVoidMethod ("Add",(Object)((_userid)));
 BA.debugLineNum = 332;BA.debugLine="list_follow(6).Add(chat_idx)";
Debug.ShouldStop(2048);
ac_tfreecoin.mostCurrent._list_follow.getArrayElement(false,BA.numberCast(int.class, 6)).runVoidMethod ("Add",(Object)((_chat_idx)));
 BA.debugLineNum = 333;BA.debugLine="list_follow(7).Add(status)";
Debug.ShouldStop(4096);
ac_tfreecoin.mostCurrent._list_follow.getArrayElement(false,BA.numberCast(int.class, 7)).runVoidMethod ("Add",(Object)((_status)));
 BA.debugLineNum = 334;BA.debugLine="list_follow(8).Add(token)";
Debug.ShouldStop(8192);
ac_tfreecoin.mostCurrent._list_follow.getArrayElement(false,BA.numberCast(int.class, 8)).runVoidMethod ("Add",(Object)((_token)));
 BA.debugLineNum = 335;BA.debugLine="list_follow(9).Add(picx)";
Debug.ShouldStop(16384);
ac_tfreecoin.mostCurrent._list_follow.getArrayElement(false,BA.numberCast(int.class, 9)).runVoidMethod ("Add",(Object)((_picx)));
 BA.debugLineNum = 336;BA.debugLine="list_follow(10).Add(msg_idx)";
Debug.ShouldStop(32768);
ac_tfreecoin.mostCurrent._list_follow.getArrayElement(false,BA.numberCast(int.class, 10)).runVoidMethod ("Add",(Object)((_msg_idx)));
 }
}Debug.locals.put("colroot", _colroot);
;
 BA.debugLineNum = 338;BA.debugLine="nff=list_follow(4).Size";
Debug.ShouldStop(131072);
ac_tfreecoin._nff = ac_tfreecoin.mostCurrent._list_follow.getArrayElement(false,BA.numberCast(int.class, 4)).runMethod(true,"getSize");
 BA.debugLineNum = 339;BA.debugLine="If list_follow(4).Size>0 Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean(">",ac_tfreecoin.mostCurrent._list_follow.getArrayElement(false,BA.numberCast(int.class, 4)).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 340;BA.debugLine="setviewsa(2)";
Debug.ShouldStop(524288);
_setviewsa(BA.numberCast(int.class, 2));
 };
 break; }
case 5: {
 BA.debugLineNum = 346;BA.debugLine="If Result.Contains(\"error_code\")=True Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",_result.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("error_code"))),ac_tfreecoin.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 347;BA.debugLine="Select type_done";
Debug.ShouldStop(67108864);
switch (BA.switchObjectToInt(ac_tfreecoin._type_done,BA.numberCast(int.class, 1),BA.numberCast(int.class, 2),BA.numberCast(int.class, 0))) {
case 0: {
 BA.debugLineNum = 349;BA.debugLine="ToastMessageShow(\"از قبل بازدید شده\",False)";
Debug.ShouldStop(268435456);
ac_tfreecoin.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("از قبل بازدید شده")),(Object)(ac_tfreecoin.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 350;BA.debugLine="getnex(0)";
Debug.ShouldStop(536870912);
_getnex(BA.numberCast(int.class, 0));
 break; }
case 1: {
 BA.debugLineNum = 353;BA.debugLine="ToastMessageShow(\"از قبل جوین شده\",False)";
Debug.ShouldStop(1);
ac_tfreecoin.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("از قبل جوین شده")),(Object)(ac_tfreecoin.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 354;BA.debugLine="getnex(2)";
Debug.ShouldStop(2);
_getnex(BA.numberCast(int.class, 2));
 break; }
case 2: {
 BA.debugLineNum = 357;BA.debugLine="ToastMessageShow(\"از قبل جوین شده\",False)";
Debug.ShouldStop(16);
ac_tfreecoin.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("از قبل جوین شده")),(Object)(ac_tfreecoin.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 358;BA.debugLine="getnex(2)";
Debug.ShouldStop(32);
_getnex(BA.numberCast(int.class, 2));
 break; }
}
;
 }else {
 BA.debugLineNum = 362;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(512);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 363;BA.debugLine="parser.Initialize(Result)";
Debug.ShouldStop(1024);
_parser.runVoidMethod ("Initialize",(Object)(_result));
 BA.debugLineNum = 364;BA.debugLine="Dim root As List = parser.NextArray";
Debug.ShouldStop(2048);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_root = _parser.runMethod(false,"NextArray");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 365;BA.debugLine="For Each colroot As Map In root";
Debug.ShouldStop(4096);
_colroot = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group145 = _root;
final int groupLen145 = group145.runMethod(true,"getSize").<Integer>get()
;int index145 = 0;
;
for (; index145 < groupLen145;index145++){
_colroot.setObject(group145.runMethod(false,"Get",index145));
Debug.locals.put("colroot", _colroot);
 BA.debugLineNum = 366;BA.debugLine="Dim Result As String = colroot.Get(\"result\")";
Debug.ShouldStop(8192);
_result = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("result")))));Debug.locals.put("Result", _result);Debug.locals.put("Result", _result);
 BA.debugLineNum = 367;BA.debugLine="Dim c_m As String = colroot.Get(\"c_m\")";
Debug.ShouldStop(16384);
_c_m = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("c_m")))));Debug.locals.put("c_m", _c_m);Debug.locals.put("c_m", _c_m);
 BA.debugLineNum = 368;BA.debugLine="Dim uid As String = colroot.Get(\"uid\")";
Debug.ShouldStop(32768);
_uid = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("uid")))));Debug.locals.put("uid", _uid);Debug.locals.put("uid", _uid);
 BA.debugLineNum = 369;BA.debugLine="Dim id As String = colroot.Get(\"id\")";
Debug.ShouldStop(65536);
_id = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 372;BA.debugLine="Dim userid As String = colroot.Get(\"userid\")";
Debug.ShouldStop(524288);
_userid = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("userid")))));Debug.locals.put("userid", _userid);Debug.locals.put("userid", _userid);
 BA.debugLineNum = 373;BA.debugLine="Dim username As String = colroot.Get(\"usernam";
Debug.ShouldStop(1048576);
_username = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("username")))));Debug.locals.put("username", _username);Debug.locals.put("username", _username);
 BA.debugLineNum = 376;BA.debugLine="sql1.ExecNonQuery(\"UPDATE tbl_coin set cm='\"&";
Debug.ShouldStop(8388608);
ac_tfreecoin._sql1.runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE tbl_coin set cm='"),_c_m,RemoteObject.createImmutable("',cf='0' WHERE userid='"),ac_tfreecoin.mostCurrent._userid_t,RemoteObject.createImmutable("' "))));
 }
}Debug.locals.put("colroot", _colroot);
;
 BA.debugLineNum = 380;BA.debugLine="Dim n_coins=c_m As Long";
Debug.ShouldStop(134217728);
_n_coins = BA.numberCast(long.class, _c_m);Debug.locals.put("n_coins", _n_coins);Debug.locals.put("n_coins", _n_coins);
 BA.debugLineNum = 381;BA.debugLine="If n_coins>100 Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean(">",_n_coins,BA.numberCast(double.class, 100))) { 
 BA.debugLineNum = 382;BA.debugLine="lbl_nums.Text=\"سکه \"&NumberFormat(n_coins,3,0";
Debug.ShouldStop(536870912);
ac_tfreecoin.mostCurrent._lbl_nums.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("سکه "),ac_tfreecoin.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _n_coins)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 0))))));
 }else {
 BA.debugLineNum = 384;BA.debugLine="lbl_nums.Text=\"سکه \"&n_coins";
Debug.ShouldStop(-2147483648);
ac_tfreecoin.mostCurrent._lbl_nums.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("سکه "),_n_coins)));
 };
 BA.debugLineNum = 387;BA.debugLine="Select type_done";
Debug.ShouldStop(4);
switch (BA.switchObjectToInt(ac_tfreecoin._type_done,BA.numberCast(int.class, 1),BA.numberCast(int.class, 0))) {
case 0: {
 BA.debugLineNum = 390;BA.debugLine="getnex(nll)";
Debug.ShouldStop(32);
_getnex(ac_tfreecoin._nll);
 break; }
case 1: {
 BA.debugLineNum = 393;BA.debugLine="getnex(nff)";
Debug.ShouldStop(256);
_getnex(ac_tfreecoin._nff);
 break; }
}
;
 };
 break; }
}
;
 BA.debugLineNum = 401;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
 //BA.debugLineNum = 9;BA.debugLine="Private sql1 As SQL";
ac_tfreecoin._sql1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL");
 //BA.debugLineNum = 10;BA.debugLine="Private cursor1 As Cursor";
ac_tfreecoin._cursor1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
 //BA.debugLineNum = 11;BA.debugLine="Dim type_done As Int";
ac_tfreecoin._type_done = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _req_getlike(RemoteObject _types,RemoteObject _tagreq) throws Exception{
try {
		Debug.PushSubsStack("req_getlike (ac_tfreecoin) ","ac_tfreecoin",9,ac_tfreecoin.mostCurrent.activityBA,ac_tfreecoin.mostCurrent,1040);
if (RapidSub.canDelegate("req_getlike")) { return com.it.fome.ac_tfreecoin.remoteMe.runUserSub(false, "ac_tfreecoin","req_getlike", _types, _tagreq);}
RemoteObject _prfn = RemoteObject.declareNull("com.reza.sh.fastnet.Fastnet");
RemoteObject _post = RemoteObject.declareNull("com.reza.sh.fastnet.PostRequestRaper");
Debug.locals.put("types", _types);
Debug.locals.put("tagreq", _tagreq);
 BA.debugLineNum = 1040;BA.debugLine="Sub req_getlike(types As String,tagreq As String)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 1041;BA.debugLine="Log(\"get\")";
Debug.ShouldStop(65536);
ac_tfreecoin.mostCurrent.__c.runVoidMethod ("LogImpl","612124161",RemoteObject.createImmutable("get"),0);
 BA.debugLineNum = 1042;BA.debugLine="Dim prfn As PersianFastNetwork";
Debug.ShouldStop(131072);
_prfn = RemoteObject.createNew ("com.reza.sh.fastnet.Fastnet");Debug.locals.put("prfn", _prfn);
 BA.debugLineNum = 1044;BA.debugLine="prfn.initialize(\"prfn\")";
Debug.ShouldStop(524288);
_prfn.runVoidMethod ("initialize",ac_tfreecoin.processBA,(Object)(RemoteObject.createImmutable("prfn")));
 BA.debugLineNum = 1046;BA.debugLine="Dim post As PostRequest";
Debug.ShouldStop(2097152);
_post = RemoteObject.createNew ("com.reza.sh.fastnet.PostRequestRaper");Debug.locals.put("post", _post);
 BA.debugLineNum = 1047;BA.debugLine="post=prfn.BuildPostQuery(\"http://filework.ir/INST";
Debug.ShouldStop(4194304);
_post = _prfn.runMethod(false,"BuildPostQuery",(Object)(BA.ObjectToString("http://filework.ir/INSTAFOLLOW/api/req.php")),(Object)(_tagreq));Debug.locals.put("post", _post);
 BA.debugLineNum = 1049;BA.debugLine="post.addHeder(\"User-Agent\",\"Dalvik/1.6.0 (Linux;";
Debug.ShouldStop(16777216);
_post.runVoidMethod ("addHeder",(Object)(BA.ObjectToString("User-Agent")),(Object)(RemoteObject.createImmutable("Dalvik/1.6.0 (Linux; U; Android 4.4.4; SM-A700FD Build/KTU84P)")));
 BA.debugLineNum = 1051;BA.debugLine="post.addParametrs(\"types\",types)";
Debug.ShouldStop(67108864);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("types")),(Object)(_types));
 BA.debugLineNum = 1054;BA.debugLine="post.addParametrs(\"req\",\"get_telegram\")";
Debug.ShouldStop(536870912);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("req")),(Object)(RemoteObject.createImmutable("get_telegram")));
 BA.debugLineNum = 1058;BA.debugLine="post.executRequestAsString";
Debug.ShouldStop(2);
_post.runVoidMethod ("executRequestAsString");
 BA.debugLineNum = 1059;BA.debugLine="ProgressDialogShow2(\"در حال دریافت لیست...\",True)";
Debug.ShouldStop(4);
ac_tfreecoin.mostCurrent.__c.runVoidMethod ("ProgressDialogShow2",ac_tfreecoin.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence("در حال دریافت لیست...")),(Object)(ac_tfreecoin.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 1060;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _req_getme(RemoteObject _userid) throws Exception{
try {
		Debug.PushSubsStack("req_getme (ac_tfreecoin) ","ac_tfreecoin",9,ac_tfreecoin.mostCurrent.activityBA,ac_tfreecoin.mostCurrent,166);
if (RapidSub.canDelegate("req_getme")) { return com.it.fome.ac_tfreecoin.remoteMe.runUserSub(false, "ac_tfreecoin","req_getme", _userid);}
RemoteObject _prfn = RemoteObject.declareNull("com.reza.sh.fastnet.Fastnet");
RemoteObject _post = RemoteObject.declareNull("com.reza.sh.fastnet.PostRequestRaper");
Debug.locals.put("userid", _userid);
 BA.debugLineNum = 166;BA.debugLine="Sub req_getme(userid As String)";
Debug.ShouldStop(32);
 BA.debugLineNum = 167;BA.debugLine="Dim prfn As PersianFastNetwork";
Debug.ShouldStop(64);
_prfn = RemoteObject.createNew ("com.reza.sh.fastnet.Fastnet");Debug.locals.put("prfn", _prfn);
 BA.debugLineNum = 168;BA.debugLine="prfn.initialize(\"prfn\")";
Debug.ShouldStop(128);
_prfn.runVoidMethod ("initialize",ac_tfreecoin.processBA,(Object)(RemoteObject.createImmutable("prfn")));
 BA.debugLineNum = 170;BA.debugLine="Dim post As PostRequest";
Debug.ShouldStop(512);
_post = RemoteObject.createNew ("com.reza.sh.fastnet.PostRequestRaper");Debug.locals.put("post", _post);
 BA.debugLineNum = 171;BA.debugLine="post=prfn.BuildPostQuery(\"http://filework.ir/INST";
Debug.ShouldStop(1024);
_post = _prfn.runMethod(false,"BuildPostQuery",(Object)(BA.ObjectToString("http://filework.ir/INSTAFOLLOW/api/req.php")),(Object)(RemoteObject.createImmutable("getinsta")));Debug.locals.put("post", _post);
 BA.debugLineNum = 173;BA.debugLine="post.addHeder(\"User-Agent\",\"Dalvik/1.6.0 (Linux;";
Debug.ShouldStop(4096);
_post.runVoidMethod ("addHeder",(Object)(BA.ObjectToString("User-Agent")),(Object)(RemoteObject.createImmutable("Dalvik/1.6.0 (Linux; U; Android 4.4.4; SM-A700FD Build/KTU84P)")));
 BA.debugLineNum = 175;BA.debugLine="post.addParametrs(\"ui\",\"1\")";
Debug.ShouldStop(16384);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("ui")),(Object)(RemoteObject.createImmutable("1")));
 BA.debugLineNum = 176;BA.debugLine="post.addParametrs(\"userid\",userid_t)";
Debug.ShouldStop(32768);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("userid")),(Object)(ac_tfreecoin.mostCurrent._userid_t));
 BA.debugLineNum = 178;BA.debugLine="post.addParametrs(\"req\",\"get_acct\")";
Debug.ShouldStop(131072);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("req")),(Object)(RemoteObject.createImmutable("get_acct")));
 BA.debugLineNum = 181;BA.debugLine="post.executRequestAsString";
Debug.ShouldStop(1048576);
_post.runVoidMethod ("executRequestAsString");
 BA.debugLineNum = 182;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setanimation(RemoteObject _inanimation,RemoteObject _outanimation) throws Exception{
try {
		Debug.PushSubsStack("SetAnimation (ac_tfreecoin) ","ac_tfreecoin",9,ac_tfreecoin.mostCurrent.activityBA,ac_tfreecoin.mostCurrent,154);
if (RapidSub.canDelegate("setanimation")) { return com.it.fome.ac_tfreecoin.remoteMe.runUserSub(false, "ac_tfreecoin","setanimation", _inanimation, _outanimation);}
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
RemoteObject _package = RemoteObject.createImmutable("");
RemoteObject _in = RemoteObject.createImmutable(0);
RemoteObject _out = RemoteObject.createImmutable(0);
Debug.locals.put("InAnimation", _inanimation);
Debug.locals.put("OutAnimation", _outanimation);
 BA.debugLineNum = 154;BA.debugLine="Sub SetAnimation(InAnimation As String, OutAnimati";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 155;BA.debugLine="Dim r As Reflector";
Debug.ShouldStop(67108864);
_r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("r", _r);
 BA.debugLineNum = 156;BA.debugLine="Dim package As String";
Debug.ShouldStop(134217728);
_package = RemoteObject.createImmutable("");Debug.locals.put("package", _package);
 BA.debugLineNum = 157;BA.debugLine="Dim In, out As Int";
Debug.ShouldStop(268435456);
_in = RemoteObject.createImmutable(0);Debug.locals.put("In", _in);
_out = RemoteObject.createImmutable(0);Debug.locals.put("out", _out);
 BA.debugLineNum = 158;BA.debugLine="package = r.GetStaticField(\"anywheresoftware.b4a.";
Debug.ShouldStop(536870912);
_package = BA.ObjectToString(_r.runMethod(false,"GetStaticField",(Object)(BA.ObjectToString("anywheresoftware.b4a.BA")),(Object)(RemoteObject.createImmutable("packageName"))));Debug.locals.put("package", _package);
 BA.debugLineNum = 159;BA.debugLine="In = r.GetStaticField(package & \".R$anim\", InAnim";
Debug.ShouldStop(1073741824);
_in = BA.numberCast(int.class, _r.runMethod(false,"GetStaticField",(Object)(RemoteObject.concat(_package,RemoteObject.createImmutable(".R$anim"))),(Object)(_inanimation)));Debug.locals.put("In", _in);
 BA.debugLineNum = 160;BA.debugLine="out = r.GetStaticField(package & \".R$anim\", OutAn";
Debug.ShouldStop(-2147483648);
_out = BA.numberCast(int.class, _r.runMethod(false,"GetStaticField",(Object)(RemoteObject.concat(_package,RemoteObject.createImmutable(".R$anim"))),(Object)(_outanimation)));Debug.locals.put("out", _out);
 BA.debugLineNum = 161;BA.debugLine="r.Target = r.GetActivity";
Debug.ShouldStop(1);
_r.setField ("Target",(_r.runMethod(false,"GetActivity",ac_tfreecoin.processBA)));
 BA.debugLineNum = 162;BA.debugLine="r.RunMethod4(\"overridePendingTransition\", Array A";
Debug.ShouldStop(2);
_r.runVoidMethod ("RunMethod4",(Object)(BA.ObjectToString("overridePendingTransition")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_in),(_out)})),(Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.ObjectToString("java.lang.int"),RemoteObject.createImmutable("java.lang.int")})));
 BA.debugLineNum = 163;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setreq(RemoteObject _userid,RemoteObject _mediaid,RemoteObject _typemodule) throws Exception{
try {
		Debug.PushSubsStack("setreq (ac_tfreecoin) ","ac_tfreecoin",9,ac_tfreecoin.mostCurrent.activityBA,ac_tfreecoin.mostCurrent,1017);
if (RapidSub.canDelegate("setreq")) { return com.it.fome.ac_tfreecoin.remoteMe.runUserSub(false, "ac_tfreecoin","setreq", _userid, _mediaid, _typemodule);}
RemoteObject _prfn = RemoteObject.declareNull("com.reza.sh.fastnet.Fastnet");
RemoteObject _post = RemoteObject.declareNull("com.reza.sh.fastnet.PostRequestRaper");
Debug.locals.put("userid", _userid);
Debug.locals.put("mediaid", _mediaid);
Debug.locals.put("typemodule", _typemodule);
 BA.debugLineNum = 1017;BA.debugLine="Sub setreq(userid As String,mediaid As String,type";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 1022;BA.debugLine="Dim prfn As PersianFastNetwork";
Debug.ShouldStop(536870912);
_prfn = RemoteObject.createNew ("com.reza.sh.fastnet.Fastnet");Debug.locals.put("prfn", _prfn);
 BA.debugLineNum = 1023;BA.debugLine="prfn.initialize(\"prfn\")";
Debug.ShouldStop(1073741824);
_prfn.runVoidMethod ("initialize",ac_tfreecoin.processBA,(Object)(RemoteObject.createImmutable("prfn")));
 BA.debugLineNum = 1024;BA.debugLine="Dim post As PostRequest";
Debug.ShouldStop(-2147483648);
_post = RemoteObject.createNew ("com.reza.sh.fastnet.PostRequestRaper");Debug.locals.put("post", _post);
 BA.debugLineNum = 1025;BA.debugLine="post=prfn.BuildPostQuery(\"http://filework.ir/INST";
Debug.ShouldStop(1);
_post = _prfn.runMethod(false,"BuildPostQuery",(Object)(BA.ObjectToString("http://filework.ir/INSTAFOLLOW/api/req.php")),(Object)(RemoteObject.createImmutable("donereq")));Debug.locals.put("post", _post);
 BA.debugLineNum = 1027;BA.debugLine="post.addHeder(\"User-Agent\",\"Dalvik/1.6.0 (Linux;";
Debug.ShouldStop(4);
_post.runVoidMethod ("addHeder",(Object)(BA.ObjectToString("User-Agent")),(Object)(RemoteObject.createImmutable("Dalvik/1.6.0 (Linux; U; Android 4.4.4; SM-A700FD Build/KTU84P)")));
 BA.debugLineNum = 1028;BA.debugLine="post.addParametrs(\"req\",\"donereqt\")";
Debug.ShouldStop(8);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("req")),(Object)(RemoteObject.createImmutable("donereqt")));
 BA.debugLineNum = 1029;BA.debugLine="post.addParametrs(\"userid\",userid)";
Debug.ShouldStop(16);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("userid")),(Object)(_userid));
 BA.debugLineNum = 1030;BA.debugLine="post.addParametrs(\"mediaid\",mediaid)";
Debug.ShouldStop(32);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("mediaid")),(Object)(_mediaid));
 BA.debugLineNum = 1031;BA.debugLine="post.addParametrs(\"typemodule\",\"1\")";
Debug.ShouldStop(64);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("typemodule")),(Object)(RemoteObject.createImmutable("1")));
 BA.debugLineNum = 1033;BA.debugLine="post.executRequestAsString";
Debug.ShouldStop(256);
_post.runVoidMethod ("executRequestAsString");
 BA.debugLineNum = 1035;BA.debugLine="ProgressDialogShow(\"در حال پردازش...\")";
Debug.ShouldStop(1024);
ac_tfreecoin.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",ac_tfreecoin.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("در حال پردازش..."))));
 BA.debugLineNum = 1038;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setviewsa(RemoteObject _posisa) throws Exception{
try {
		Debug.PushSubsStack("setviewsa (ac_tfreecoin) ","ac_tfreecoin",9,ac_tfreecoin.mostCurrent.activityBA,ac_tfreecoin.mostCurrent,1062);
if (RapidSub.canDelegate("setviewsa")) { return com.it.fome.ac_tfreecoin.remoteMe.runUserSub(false, "ac_tfreecoin","setviewsa", _posisa);}
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _n_coins = RemoteObject.createImmutable(0L);
Debug.locals.put("posisa", _posisa);
 BA.debugLineNum = 1062;BA.debugLine="Sub setviewsa(posisa As Int)";
Debug.ShouldStop(32);
 BA.debugLineNum = 1063;BA.debugLine="Try";
Debug.ShouldStop(64);
try { BA.debugLineNum = 1064;BA.debugLine="cursor1 = sql1.ExecQuery(\"SELECT * FROM tbl_coin";
Debug.ShouldStop(128);
ac_tfreecoin._cursor1.setObject(ac_tfreecoin._sql1.runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM tbl_coin WHERE userid='"),ac_tfreecoin.mostCurrent._userid_t,RemoteObject.createImmutable("' ")))));
 BA.debugLineNum = 1065;BA.debugLine="Dim i As Int";
Debug.ShouldStop(256);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 1066;BA.debugLine="For i=0 To cursor1.RowCount-1";
Debug.ShouldStop(512);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {ac_tfreecoin._cursor1.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step4 > 0 && _i.<Integer>get().intValue() <= limit4) || (step4 < 0 && _i.<Integer>get().intValue() >= limit4) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1067;BA.debugLine="cursor1.Position=i";
Debug.ShouldStop(1024);
ac_tfreecoin._cursor1.runMethod(true,"setPosition",_i);
 BA.debugLineNum = 1068;BA.debugLine="cm=cursor1.GetString(\"cm\")";
Debug.ShouldStop(2048);
ac_tfreecoin.mostCurrent._cm = ac_tfreecoin._cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("cm")));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1073;BA.debugLine="Select type_done";
Debug.ShouldStop(65536);
switch (BA.switchObjectToInt(ac_tfreecoin._type_done,BA.numberCast(int.class, 1),BA.numberCast(int.class, 0))) {
case 0: {
 BA.debugLineNum = 1075;BA.debugLine="nll=nll-1";
Debug.ShouldStop(262144);
ac_tfreecoin._nll = RemoteObject.solve(new RemoteObject[] {ac_tfreecoin._nll,RemoteObject.createImmutable(1)}, "-",1, 1);
 BA.debugLineNum = 1077;BA.debugLine="glide.Load2(list_like(9).Get(nll)).OptionalCir";
Debug.ShouldStop(1048576);
ac_tfreecoin.mostCurrent._glide.runMethod(false,"Load2",ac_tfreecoin.mostCurrent.activityBA,(Object)(BA.ObjectToString(ac_tfreecoin.mostCurrent._list_like.getArrayElement(false,BA.numberCast(int.class, 9)).runMethod(false,"Get",(Object)(ac_tfreecoin._nll))))).runMethod(false,"OptionalCircleCrop").runVoidMethod ("Into",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ImageViewWrapper"), ac_tfreecoin.mostCurrent._img_target.getObject()));
 BA.debugLineNum = 1080;BA.debugLine="Dim n_coins=cm As Long";
Debug.ShouldStop(8388608);
_n_coins = BA.numberCast(long.class, ac_tfreecoin.mostCurrent._cm);Debug.locals.put("n_coins", _n_coins);Debug.locals.put("n_coins", _n_coins);
 BA.debugLineNum = 1081;BA.debugLine="If n_coins>100 Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean(">",_n_coins,BA.numberCast(double.class, 100))) { 
 BA.debugLineNum = 1082;BA.debugLine="lbl_nums.Text=\"سکه \"&NumberFormat(n_coins,3,0";
Debug.ShouldStop(33554432);
ac_tfreecoin.mostCurrent._lbl_nums.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("سکه "),ac_tfreecoin.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _n_coins)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 0))))));
 }else {
 BA.debugLineNum = 1084;BA.debugLine="lbl_nums.Text=\"سکه \"&n_coins";
Debug.ShouldStop(134217728);
ac_tfreecoin.mostCurrent._lbl_nums.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("سکه "),_n_coins)));
 };
 break; }
case 1: {
 BA.debugLineNum = 1088;BA.debugLine="nff=nff-1";
Debug.ShouldStop(-2147483648);
ac_tfreecoin._nff = RemoteObject.solve(new RemoteObject[] {ac_tfreecoin._nff,RemoteObject.createImmutable(1)}, "-",1, 1);
 BA.debugLineNum = 1089;BA.debugLine="Log(\"img : \"&list_follow(9).Get(nff))";
Debug.ShouldStop(1);
ac_tfreecoin.mostCurrent.__c.runVoidMethod ("LogImpl","612189723",RemoteObject.concat(RemoteObject.createImmutable("img : "),ac_tfreecoin.mostCurrent._list_follow.getArrayElement(false,BA.numberCast(int.class, 9)).runMethod(false,"Get",(Object)(ac_tfreecoin._nff))),0);
 BA.debugLineNum = 1090;BA.debugLine="glide.Load2(list_follow(9).Get(nff)).OptionalC";
Debug.ShouldStop(2);
ac_tfreecoin.mostCurrent._glide.runMethod(false,"Load2",ac_tfreecoin.mostCurrent.activityBA,(Object)(BA.ObjectToString(ac_tfreecoin.mostCurrent._list_follow.getArrayElement(false,BA.numberCast(int.class, 9)).runMethod(false,"Get",(Object)(ac_tfreecoin._nff))))).runMethod(false,"OptionalCenterCrop").runVoidMethod ("Into",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ImageViewWrapper"), ac_tfreecoin.mostCurrent._img_target.getObject()));
 BA.debugLineNum = 1093;BA.debugLine="Dim n_coins=cm As Long";
Debug.ShouldStop(16);
_n_coins = BA.numberCast(long.class, ac_tfreecoin.mostCurrent._cm);Debug.locals.put("n_coins", _n_coins);Debug.locals.put("n_coins", _n_coins);
 BA.debugLineNum = 1094;BA.debugLine="If n_coins>100 Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean(">",_n_coins,BA.numberCast(double.class, 100))) { 
 BA.debugLineNum = 1095;BA.debugLine="lbl_nums.Text=\"سکه \"&NumberFormat(n_coins,3,0";
Debug.ShouldStop(64);
ac_tfreecoin.mostCurrent._lbl_nums.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("سکه "),ac_tfreecoin.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _n_coins)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 0))))));
 }else {
 BA.debugLineNum = 1097;BA.debugLine="lbl_nums.Text=\"سکه \"&n_coins";
Debug.ShouldStop(256);
ac_tfreecoin.mostCurrent._lbl_nums.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("سکه "),_n_coins)));
 };
 break; }
}
;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e30) {
			BA.rdebugUtils.runVoidMethod("setLastException",ac_tfreecoin.processBA, e30.toString()); BA.debugLineNum = 1101;BA.debugLine="Log(LastException)";
Debug.ShouldStop(4096);
ac_tfreecoin.mostCurrent.__c.runVoidMethod ("LogImpl","612189735",BA.ObjectToString(ac_tfreecoin.mostCurrent.__c.runMethod(false,"LastException",ac_tfreecoin.mostCurrent.activityBA)),0);
 };
 BA.debugLineNum = 1105;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _telegs_chatgroup(RemoteObject _stt) throws Exception{
try {
		Debug.PushSubsStack("telegs_chatgroup (ac_tfreecoin) ","ac_tfreecoin",9,ac_tfreecoin.mostCurrent.activityBA,ac_tfreecoin.mostCurrent,1175);
if (RapidSub.canDelegate("telegs_chatgroup")) { return com.it.fome.ac_tfreecoin.remoteMe.runUserSub(false, "ac_tfreecoin","telegs_chatgroup", _stt);}
Debug.locals.put("stt", _stt);
 BA.debugLineNum = 1175;BA.debugLine="Sub telegs_chatgroup(stt As String)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 1176;BA.debugLine="Log(stt)";
Debug.ShouldStop(8388608);
ac_tfreecoin.mostCurrent.__c.runVoidMethod ("LogImpl","612517377",_stt,0);
 BA.debugLineNum = 1177;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _telegs_errormsg(RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("telegs_errormsg (ac_tfreecoin) ","ac_tfreecoin",9,ac_tfreecoin.mostCurrent.activityBA,ac_tfreecoin.mostCurrent,1151);
if (RapidSub.canDelegate("telegs_errormsg")) { return com.it.fome.ac_tfreecoin.remoteMe.runUserSub(false, "ac_tfreecoin","telegs_errormsg", _value);}
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _error_msg = RemoteObject.createImmutable("");
RemoteObject _errorconstructor = RemoteObject.createImmutable(0);
RemoteObject _error_code = RemoteObject.createImmutable(0);
RemoteObject _mt = RemoteObject.declareNull("com.valdesekamdem.library.mdtoast.MaterialToast");
Debug.locals.put("value", _value);
 BA.debugLineNum = 1151;BA.debugLine="Sub telegs_errormsg(value As String)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 1152;BA.debugLine="LogColor(value,Colors.Blue)";
Debug.ShouldStop(-2147483648);
ac_tfreecoin.mostCurrent.__c.runVoidMethod ("LogImpl","612320769",_value,ac_tfreecoin.mostCurrent.__c.getField(false,"Colors").getField(true,"Blue"));
 BA.debugLineNum = 1153;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(1);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 1154;BA.debugLine="parser.Initialize(value)";
Debug.ShouldStop(2);
_parser.runVoidMethod ("Initialize",(Object)(_value));
 BA.debugLineNum = 1155;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(4);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 1156;BA.debugLine="Dim Error_msg As String = root.Get(\"Error_msg\")";
Debug.ShouldStop(8);
_error_msg = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Error_msg")))));Debug.locals.put("Error_msg", _error_msg);Debug.locals.put("Error_msg", _error_msg);
 BA.debugLineNum = 1157;BA.debugLine="Dim ErrorConstructor As Int = root.Get(\"ErrorCons";
Debug.ShouldStop(16);
_errorconstructor = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ErrorConstructor")))));Debug.locals.put("ErrorConstructor", _errorconstructor);Debug.locals.put("ErrorConstructor", _errorconstructor);
 BA.debugLineNum = 1158;BA.debugLine="Dim Error_code As Int = root.Get(\"Error_code\")";
Debug.ShouldStop(32);
_error_code = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Error_code")))));Debug.locals.put("Error_code", _error_code);Debug.locals.put("Error_code", _error_code);
 BA.debugLineNum = 1160;BA.debugLine="Dim mt As KJ_MaterialToast";
Debug.ShouldStop(128);
_mt = RemoteObject.createNew ("com.valdesekamdem.library.mdtoast.MaterialToast");Debug.locals.put("mt", _mt);
 BA.debugLineNum = 1161;BA.debugLine="mt.Initialize(\"خطا : \"&Error_msg,mt.LENGTH_LONG,m";
Debug.ShouldStop(256);
_mt.runVoidMethod ("Initialize",ac_tfreecoin.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("خطا : "),_error_msg)),(Object)(_mt.getField(true,"LENGTH_LONG")),(Object)(_mt.getField(true,"TYPE_INFO")));
 BA.debugLineNum = 1163;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _telegs_getsmessagess(RemoteObject _stt) throws Exception{
try {
		Debug.PushSubsStack("telegs_getsmessagess (ac_tfreecoin) ","ac_tfreecoin",9,ac_tfreecoin.mostCurrent.activityBA,ac_tfreecoin.mostCurrent,1179);
if (RapidSub.canDelegate("telegs_getsmessagess")) { return com.it.fome.ac_tfreecoin.remoteMe.runUserSub(false, "ac_tfreecoin","telegs_getsmessagess", _stt);}
Debug.locals.put("stt", _stt);
 BA.debugLineNum = 1179;BA.debugLine="Sub telegs_getsmessagess(stt As String)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 1181;BA.debugLine="Log(stt)";
Debug.ShouldStop(268435456);
ac_tfreecoin.mostCurrent.__c.runVoidMethod ("LogImpl","612582914",_stt,0);
 BA.debugLineNum = 1182;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _telegs_viewdon(RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("telegs_viewdon (ac_tfreecoin) ","ac_tfreecoin",9,ac_tfreecoin.mostCurrent.activityBA,ac_tfreecoin.mostCurrent,1165);
if (RapidSub.canDelegate("telegs_viewdon")) { return com.it.fome.ac_tfreecoin.remoteMe.runUserSub(false, "ac_tfreecoin","telegs_viewdon", _value);}
Debug.locals.put("value", _value);
 BA.debugLineNum = 1165;BA.debugLine="Sub telegs_viewdon(value As String)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 1166;BA.debugLine="LogColor(\"view : \"&value,Colors.Blue)";
Debug.ShouldStop(8192);
ac_tfreecoin.mostCurrent.__c.runVoidMethod ("LogImpl","612386305",RemoteObject.concat(RemoteObject.createImmutable("view : "),_value),ac_tfreecoin.mostCurrent.__c.getField(false,"Colors").getField(true,"Blue"));
 BA.debugLineNum = 1167;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}