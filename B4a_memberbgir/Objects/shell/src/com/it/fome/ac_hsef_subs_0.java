package com.it.fome;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class ac_hsef_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (ac_hsef) ","ac_hsef",10,ac_hsef.mostCurrent.activityBA,ac_hsef.mostCurrent,27);
if (RapidSub.canDelegate("activity_create")) { return com.it.fome.ac_hsef.remoteMe.runUserSub(false, "ac_hsef","activity_create", _firsttime);}
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _gradient1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.GradientDrawable");
RemoteObject _clrs = null;
RemoteObject _bkcolor = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
RemoteObject _bkcolor_st = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
RemoteObject _pnlb1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _bg = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
RemoteObject _pnl_main = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _misef = RemoteObject.declareNull("com.it.fome.mi_topusers");
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 27;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 32;BA.debugLine="If File.Exists(File.DirInternal,\"instadb.db\")=Fal";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",ac_hsef.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(ac_hsef.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("instadb.db"))),ac_hsef.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 33;BA.debugLine="File.Copy(File.DirAssets,\"instadb.db\",File.DirIn";
Debug.ShouldStop(1);
ac_hsef.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(ac_hsef.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("instadb.db")),(Object)(ac_hsef.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("instadb.db")));
 };
 BA.debugLineNum = 35;BA.debugLine="If sql1.IsInitialized=False Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",ac_hsef._sql1.runMethod(true,"IsInitialized"),ac_hsef.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 36;BA.debugLine="sql1.Initialize(File.DirInternal,\"instadb.db\",Fa";
Debug.ShouldStop(8);
ac_hsef._sql1.runVoidMethod ("Initialize",(Object)(ac_hsef.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("instadb.db")),(Object)(ac_hsef.mostCurrent.__c.getField(true,"False")));
 };
 BA.debugLineNum = 47;BA.debugLine="cursor1 = sql1.ExecQuery(\"SELECT * FROM tbl_acc W";
Debug.ShouldStop(16384);
ac_hsef._cursor1.setObject(ac_hsef._sql1.runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT * FROM tbl_acc WHERE soich='1' "))));
 BA.debugLineNum = 48;BA.debugLine="Dim i As Int";
Debug.ShouldStop(32768);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 49;BA.debugLine="For i=0 To cursor1.RowCount-1";
Debug.ShouldStop(65536);
{
final int step9 = 1;
final int limit9 = RemoteObject.solve(new RemoteObject[] {ac_hsef._cursor1.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step9 > 0 && _i.<Integer>get().intValue() <= limit9) || (step9 < 0 && _i.<Integer>get().intValue() >= limit9) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step9))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 50;BA.debugLine="cursor1.Position=i";
Debug.ShouldStop(131072);
ac_hsef._cursor1.runMethod(true,"setPosition",_i);
 BA.debugLineNum = 51;BA.debugLine="i_cookie=cursor1.GetString(\"cookie\")";
Debug.ShouldStop(262144);
ac_hsef.mostCurrent._i_cookie = ac_hsef._cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("cookie")));
 BA.debugLineNum = 52;BA.debugLine="i_username=cursor1.GetString(\"username\")";
Debug.ShouldStop(524288);
ac_hsef.mostCurrent._i_username = ac_hsef._cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("username")));
 BA.debugLineNum = 53;BA.debugLine="i_pk=cursor1.GetString(\"pk\")";
Debug.ShouldStop(1048576);
ac_hsef.mostCurrent._i_pk = ac_hsef._cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("pk")));
 BA.debugLineNum = 54;BA.debugLine="i_pic=cursor1.GetString(\"profile_pic_url\")";
Debug.ShouldStop(2097152);
ac_hsef.mostCurrent._i_pic = ac_hsef._cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("profile_pic_url")));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 58;BA.debugLine="cursor1 = sql1.ExecQuery(\"SELECT * FROM tbl_tele";
Debug.ShouldStop(33554432);
ac_hsef._cursor1.setObject(ac_hsef._sql1.runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT * FROM tbl_tele WHERE soich='1'"))));
 BA.debugLineNum = 59;BA.debugLine="Dim i As Int";
Debug.ShouldStop(67108864);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 60;BA.debugLine="For i=0 To cursor1.RowCount-1";
Debug.ShouldStop(134217728);
{
final int step18 = 1;
final int limit18 = RemoteObject.solve(new RemoteObject[] {ac_hsef._cursor1.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step18 > 0 && _i.<Integer>get().intValue() <= limit18) || (step18 < 0 && _i.<Integer>get().intValue() >= limit18) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step18))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 61;BA.debugLine="cursor1.Position=i";
Debug.ShouldStop(268435456);
ac_hsef._cursor1.runMethod(true,"setPosition",_i);
 BA.debugLineNum = 62;BA.debugLine="userid_t=cursor1.GetString(\"userid\")";
Debug.ShouldStop(536870912);
ac_hsef.mostCurrent._userid_t = ac_hsef._cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("userid")));
 BA.debugLineNum = 63;BA.debugLine="username_t=cursor1.GetString(\"username\")";
Debug.ShouldStop(1073741824);
ac_hsef.mostCurrent._username_t = ac_hsef._cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("username")));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 65;BA.debugLine="cursor1.Close";
Debug.ShouldStop(1);
ac_hsef._cursor1.runVoidMethod ("Close");
 BA.debugLineNum = 66;BA.debugLine="ToastMessageShow(username_t,False)";
Debug.ShouldStop(2);
ac_hsef.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(ac_hsef.mostCurrent._username_t)),(Object)(ac_hsef.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 67;BA.debugLine="Log(userid_t)";
Debug.ShouldStop(4);
ac_hsef.mostCurrent.__c.runVoidMethod ("LogImpl","612779560",ac_hsef.mostCurrent._userid_t,0);
 BA.debugLineNum = 68;BA.debugLine="Dim Gradient1 As GradientDrawable";
Debug.ShouldStop(8);
_gradient1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.GradientDrawable");Debug.locals.put("Gradient1", _gradient1);
 BA.debugLineNum = 69;BA.debugLine="Dim Clrs(5) As Int";
Debug.ShouldStop(16);
_clrs = RemoteObject.createNewArray ("int", new int[] {5}, new Object[]{});Debug.locals.put("Clrs", _clrs);
 BA.debugLineNum = 70;BA.debugLine="Clrs(0) = 0xFFe8eaf6";
Debug.ShouldStop(32);
_clrs.setArrayElement (BA.numberCast(int.class, 0xffe8eaf6),BA.numberCast(int.class, 0));
 BA.debugLineNum = 71;BA.debugLine="Clrs(1) = 0xFFe8eaf6";
Debug.ShouldStop(64);
_clrs.setArrayElement (BA.numberCast(int.class, 0xffe8eaf6),BA.numberCast(int.class, 1));
 BA.debugLineNum = 72;BA.debugLine="Clrs(2) = 0xFFe8eaf6";
Debug.ShouldStop(128);
_clrs.setArrayElement (BA.numberCast(int.class, 0xffe8eaf6),BA.numberCast(int.class, 2));
 BA.debugLineNum = 73;BA.debugLine="Clrs(3) = 0xFF283593";
Debug.ShouldStop(256);
_clrs.setArrayElement (BA.numberCast(int.class, 0xff283593),BA.numberCast(int.class, 3));
 BA.debugLineNum = 74;BA.debugLine="Clrs(4) = 0xFF283593";
Debug.ShouldStop(512);
_clrs.setArrayElement (BA.numberCast(int.class, 0xff283593),BA.numberCast(int.class, 4));
 BA.debugLineNum = 76;BA.debugLine="Gradient1.Initialize(\"TOP_BOTTOM\", Clrs)";
Debug.ShouldStop(2048);
_gradient1.runVoidMethod ("Initialize",(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.drawable.GradientDrawable.Orientation"),"TOP_BOTTOM")),(Object)(_clrs));
 BA.debugLineNum = 77;BA.debugLine="Activity.Background=Gradient1";
Debug.ShouldStop(4096);
ac_hsef.mostCurrent._activity.runMethod(false,"setBackground",(_gradient1.getObject()));
 BA.debugLineNum = 79;BA.debugLine="Dim bkcolor As ColorDrawable";
Debug.ShouldStop(16384);
_bkcolor = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("bkcolor", _bkcolor);
 BA.debugLineNum = 80;BA.debugLine="bkcolor.Initialize(Colors.White,8)";
Debug.ShouldStop(32768);
_bkcolor.runVoidMethod ("Initialize",(Object)(ac_hsef.mostCurrent.__c.getField(false,"Colors").getField(true,"White")),(Object)(BA.numberCast(int.class, 8)));
 BA.debugLineNum = 81;BA.debugLine="meno.Initialize(\"meno\")";
Debug.ShouldStop(65536);
ac_hsef.mostCurrent._meno.runVoidMethod ("Initialize",ac_hsef.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("meno")));
 BA.debugLineNum = 82;BA.debugLine="meno.TextColor=Colors.DarkGray";
Debug.ShouldStop(131072);
ac_hsef.mostCurrent._meno.runMethod(true,"setTextColor",ac_hsef.mostCurrent.__c.getField(false,"Colors").getField(true,"DarkGray"));
 BA.debugLineNum = 83;BA.debugLine="meno.TextSize=37";
Debug.ShouldStop(262144);
ac_hsef.mostCurrent._meno.runMethod(true,"setTextSize",BA.numberCast(float.class, 37));
 BA.debugLineNum = 84;BA.debugLine="meno.Background=bkcolor";
Debug.ShouldStop(524288);
ac_hsef.mostCurrent._meno.runMethod(false,"setBackground",(_bkcolor.getObject()));
 BA.debugLineNum = 85;BA.debugLine="meno.Typeface=Typeface.MATERIALICONS";
Debug.ShouldStop(1048576);
ac_hsef.mostCurrent._meno.runMethod(false,"setTypeface",ac_hsef.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"getMATERIALICONS"));
 BA.debugLineNum = 86;BA.debugLine="meno.Text=Chr(0xE3C7)";
Debug.ShouldStop(2097152);
ac_hsef.mostCurrent._meno.runMethod(true,"setText",BA.ObjectToCharSequence(ac_hsef.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xe3c7)))));
 BA.debugLineNum = 87;BA.debugLine="meno.Gravity=Gravity.CENTER_HORIZONTAL+Gravity.CE";
Debug.ShouldStop(4194304);
ac_hsef.mostCurrent._meno.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {ac_hsef.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL"),ac_hsef.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")}, "+",1, 1));
 BA.debugLineNum = 88;BA.debugLine="Activity.AddView(meno,3%x,3%x,12%x,12%x)";
Debug.ShouldStop(8388608);
ac_hsef.mostCurrent._activity.runVoidMethod ("AddView",(Object)((ac_hsef.mostCurrent._meno.getObject())),(Object)(ac_hsef.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 3)),ac_hsef.mostCurrent.activityBA)),(Object)(ac_hsef.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 3)),ac_hsef.mostCurrent.activityBA)),(Object)(ac_hsef.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 12)),ac_hsef.mostCurrent.activityBA)),(Object)(ac_hsef.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 12)),ac_hsef.mostCurrent.activityBA)));
 BA.debugLineNum = 90;BA.debugLine="pnl_coins.Initialize(\"pnl_coins\")";
Debug.ShouldStop(33554432);
ac_hsef.mostCurrent._pnl_coins.runVoidMethod ("Initialize",ac_hsef.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("pnl_coins")));
 BA.debugLineNum = 91;BA.debugLine="Activity.AddView(pnl_coins,50%x,3%x,50%x,12%x)";
Debug.ShouldStop(67108864);
ac_hsef.mostCurrent._activity.runVoidMethod ("AddView",(Object)((ac_hsef.mostCurrent._pnl_coins.getObject())),(Object)(ac_hsef.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 50)),ac_hsef.mostCurrent.activityBA)),(Object)(ac_hsef.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 3)),ac_hsef.mostCurrent.activityBA)),(Object)(ac_hsef.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 50)),ac_hsef.mostCurrent.activityBA)),(Object)(ac_hsef.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 12)),ac_hsef.mostCurrent.activityBA)));
 BA.debugLineNum = 92;BA.debugLine="roundview.Initialize(pnl_coins)";
Debug.ShouldStop(134217728);
ac_hsef.mostCurrent._roundview.runVoidMethod ("Initialize",ac_hsef.processBA,(Object)((ac_hsef.mostCurrent._pnl_coins.getObject())));
 BA.debugLineNum = 93;BA.debugLine="roundview.CornerRadius_BL=35";
Debug.ShouldStop(268435456);
ac_hsef.mostCurrent._roundview.runMethod(true,"setCornerRadius_BL",BA.numberCast(int.class, 35));
 BA.debugLineNum = 94;BA.debugLine="roundview.CornerRadius_TL=35";
Debug.ShouldStop(536870912);
ac_hsef.mostCurrent._roundview.runMethod(true,"setCornerRadius_TL",BA.numberCast(int.class, 35));
 BA.debugLineNum = 95;BA.debugLine="roundview.BackgroundColor=Colors.White";
Debug.ShouldStop(1073741824);
ac_hsef.mostCurrent._roundview.runMethod(true,"setBackgroundColor",ac_hsef.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 97;BA.debugLine="Dim bkcolor_st As ColorDrawable";
Debug.ShouldStop(1);
_bkcolor_st = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("bkcolor_st", _bkcolor_st);
 BA.debugLineNum = 98;BA.debugLine="bkcolor_st.Initialize2(0xFFC67D00,50,4dip,0x82FFE";
Debug.ShouldStop(2);
_bkcolor_st.runVoidMethod ("Initialize2",(Object)(BA.numberCast(int.class, 0xffc67d00)),(Object)(BA.numberCast(int.class, 50)),(Object)(ac_hsef.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4)))),(Object)(BA.numberCast(int.class, 0x82ffe300)));
 BA.debugLineNum = 100;BA.debugLine="Dim pnlb1 As Panel";
Debug.ShouldStop(8);
_pnlb1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("pnlb1", _pnlb1);
 BA.debugLineNum = 101;BA.debugLine="pnlb1.Initialize(\"\")";
Debug.ShouldStop(16);
_pnlb1.runVoidMethod ("Initialize",ac_hsef.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 102;BA.debugLine="pnlb1.Color=0xFFFFC300";
Debug.ShouldStop(32);
_pnlb1.runVoidMethod ("setColor",BA.numberCast(int.class, 0xffffc300));
 BA.debugLineNum = 103;BA.debugLine="pnlb1.Background=bkcolor_st";
Debug.ShouldStop(64);
_pnlb1.runMethod(false,"setBackground",(_bkcolor_st.getObject()));
 BA.debugLineNum = 104;BA.debugLine="pnl_coins.AddView(pnlb1,pnl_coins.Width-11%x,1%x,";
Debug.ShouldStop(128);
ac_hsef.mostCurrent._pnl_coins.runVoidMethod ("AddView",(Object)((_pnlb1.getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {ac_hsef.mostCurrent._pnl_coins.runMethod(true,"getWidth"),ac_hsef.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 11)),ac_hsef.mostCurrent.activityBA)}, "-",1, 1)),(Object)(ac_hsef.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 1)),ac_hsef.mostCurrent.activityBA)),(Object)(ac_hsef.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),ac_hsef.mostCurrent.activityBA)),(Object)(RemoteObject.solve(new RemoteObject[] {ac_hsef.mostCurrent._pnl_coins.runMethod(true,"getHeight"),ac_hsef.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),ac_hsef.mostCurrent.activityBA)}, "-",1, 1)));
 BA.debugLineNum = 106;BA.debugLine="lbl_icon.Initialize(\"lbl_icon\")";
Debug.ShouldStop(512);
ac_hsef.mostCurrent._lbl_icon.runVoidMethod ("Initialize",ac_hsef.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("lbl_icon")));
 BA.debugLineNum = 107;BA.debugLine="lbl_icon.SetBackgroundImage(LoadBitmap(File.DirAs";
Debug.ShouldStop(1024);
ac_hsef.mostCurrent._lbl_icon.runVoidMethod ("SetBackgroundImageNew",(Object)((ac_hsef.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(ac_hsef.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("coins.png"))).getObject())));
 BA.debugLineNum = 108;BA.debugLine="pnl_coins.AddView(lbl_icon,pnl_coins.Width-9%x,pn";
Debug.ShouldStop(2048);
ac_hsef.mostCurrent._pnl_coins.runVoidMethod ("AddView",(Object)((ac_hsef.mostCurrent._lbl_icon.getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {ac_hsef.mostCurrent._pnl_coins.runMethod(true,"getWidth"),ac_hsef.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 9)),ac_hsef.mostCurrent.activityBA)}, "-",1, 1)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {ac_hsef.mostCurrent._pnl_coins.runMethod(true,"getHeight"),RemoteObject.createImmutable(2),RemoteObject.createImmutable(2)}, "//",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {ac_hsef.mostCurrent._pnl_coins.runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {ac_hsef.mostCurrent._pnl_coins.runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "/",0, 0))));
 BA.debugLineNum = 110;BA.debugLine="lbl_nums.Initialize(\"lbl_nums\")";
Debug.ShouldStop(8192);
ac_hsef.mostCurrent._lbl_nums.runVoidMethod ("Initialize",ac_hsef.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("lbl_nums")));
 BA.debugLineNum = 111;BA.debugLine="lbl_nums.TextColor=Colors.DarkGray";
Debug.ShouldStop(16384);
ac_hsef.mostCurrent._lbl_nums.runMethod(true,"setTextColor",ac_hsef.mostCurrent.__c.getField(false,"Colors").getField(true,"DarkGray"));
 BA.debugLineNum = 112;BA.debugLine="lbl_nums.TextSize=20";
Debug.ShouldStop(32768);
ac_hsef.mostCurrent._lbl_nums.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 113;BA.debugLine="lbl_nums.Typeface=Typeface.LoadFromAssets(\"iran_s";
Debug.ShouldStop(65536);
ac_hsef.mostCurrent._lbl_nums.runMethod(false,"setTypeface",ac_hsef.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("iran_sans.ttf"))));
 BA.debugLineNum = 114;BA.debugLine="lbl_nums.Text=0&\" سکه\"";
Debug.ShouldStop(131072);
ac_hsef.mostCurrent._lbl_nums.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable(0),RemoteObject.createImmutable(" سکه"))));
 BA.debugLineNum = 115;BA.debugLine="lbl_nums.Gravity=Gravity.CENTER_VERTICAL+Gravity.";
Debug.ShouldStop(262144);
ac_hsef.mostCurrent._lbl_nums.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {ac_hsef.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL"),ac_hsef.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT")}, "+",1, 1));
 BA.debugLineNum = 116;BA.debugLine="pnl_coins.AddView(lbl_nums,2%x,0,pnl_coins.Width-";
Debug.ShouldStop(524288);
ac_hsef.mostCurrent._pnl_coins.runVoidMethod ("AddView",(Object)((ac_hsef.mostCurrent._lbl_nums.getObject())),(Object)(ac_hsef.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),ac_hsef.mostCurrent.activityBA)),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {ac_hsef.mostCurrent._pnl_coins.runMethod(true,"getWidth"),ac_hsef.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),ac_hsef.mostCurrent.activityBA)}, "-",1, 1)),(Object)(ac_hsef.mostCurrent._pnl_coins.runMethod(true,"getHeight")));
 BA.debugLineNum = 118;BA.debugLine="Dim bg As ColorDrawable";
Debug.ShouldStop(2097152);
_bg = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("bg", _bg);
 BA.debugLineNum = 119;BA.debugLine="bg.Initialize2(Colors.White,5dip,2dip,Colors.Ligh";
Debug.ShouldStop(4194304);
_bg.runVoidMethod ("Initialize2",(Object)(ac_hsef.mostCurrent.__c.getField(false,"Colors").getField(true,"White")),(Object)(ac_hsef.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))),(Object)(ac_hsef.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))),(Object)(ac_hsef.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray")));
 BA.debugLineNum = 121;BA.debugLine="Dim pnl_main As Panel";
Debug.ShouldStop(16777216);
_pnl_main = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("pnl_main", _pnl_main);
 BA.debugLineNum = 122;BA.debugLine="pnl_main.Initialize(\"\")";
Debug.ShouldStop(33554432);
_pnl_main.runVoidMethod ("Initialize",ac_hsef.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 124;BA.debugLine="Activity.AddView(pnl_main,0,10%y,100%x,90%y)";
Debug.ShouldStop(134217728);
ac_hsef.mostCurrent._activity.runVoidMethod ("AddView",(Object)((_pnl_main.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(ac_hsef.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),ac_hsef.mostCurrent.activityBA)),(Object)(ac_hsef.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),ac_hsef.mostCurrent.activityBA)),(Object)(ac_hsef.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 90)),ac_hsef.mostCurrent.activityBA)));
 BA.debugLineNum = 131;BA.debugLine="Select typesef";
Debug.ShouldStop(4);
switch (BA.switchObjectToInt(ac_hsef._typesef,BA.numberCast(int.class, 0),BA.numberCast(int.class, 1))) {
case 0: {
 BA.debugLineNum = 134;BA.debugLine="Dim Gradient1 As GradientDrawable";
Debug.ShouldStop(32);
_gradient1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.GradientDrawable");Debug.locals.put("Gradient1", _gradient1);
 BA.debugLineNum = 135;BA.debugLine="Dim Clrs(2) As Int";
Debug.ShouldStop(64);
_clrs = RemoteObject.createNewArray ("int", new int[] {2}, new Object[]{});Debug.locals.put("Clrs", _clrs);
 BA.debugLineNum = 136;BA.debugLine="Clrs(0) = 0xFFD91A99";
Debug.ShouldStop(128);
_clrs.setArrayElement (BA.numberCast(int.class, 0xffd91a99),BA.numberCast(int.class, 0));
 BA.debugLineNum = 137;BA.debugLine="Clrs(1) = 0xFFA91AD9";
Debug.ShouldStop(256);
_clrs.setArrayElement (BA.numberCast(int.class, 0xffa91ad9),BA.numberCast(int.class, 1));
 BA.debugLineNum = 138;BA.debugLine="Gradient1.Initialize(\"TOP_BOTTOM\", Clrs)";
Debug.ShouldStop(512);
_gradient1.runVoidMethod ("Initialize",(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.drawable.GradientDrawable.Orientation"),"TOP_BOTTOM")),(Object)(_clrs));
 BA.debugLineNum = 139;BA.debugLine="Activity.Background=Gradient1";
Debug.ShouldStop(1024);
ac_hsef.mostCurrent._activity.runMethod(false,"setBackground",(_gradient1.getObject()));
 BA.debugLineNum = 142;BA.debugLine="Dim misef As MI_topusers";
Debug.ShouldStop(8192);
_misef = RemoteObject.createNew ("com.it.fome.mi_topusers");Debug.locals.put("misef", _misef);
 BA.debugLineNum = 143;BA.debugLine="misef.Initialize(\"misef\",Me)";
Debug.ShouldStop(16384);
_misef.runClassMethod (com.it.fome.mi_topusers.class, "_initialize" /*RemoteObject*/ ,ac_hsef.mostCurrent.activityBA,(Object)(BA.ObjectToString("misef")),(Object)(ac_hsef.getObject()));
 BA.debugLineNum = 144;BA.debugLine="misef.type_history=0";
Debug.ShouldStop(32768);
_misef.setField ("_type_history" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 145;BA.debugLine="misef.addpnl(pnl_main)";
Debug.ShouldStop(65536);
_misef.runClassMethod (com.it.fome.mi_topusers.class, "_addpnl" /*RemoteObject*/ ,(Object)(_pnl_main));
 BA.debugLineNum = 146;BA.debugLine="req_igetme(i_pk)";
Debug.ShouldStop(131072);
_req_igetme(ac_hsef.mostCurrent._i_pk);
 break; }
case 1: {
 BA.debugLineNum = 149;BA.debugLine="Dim Gradient1 As GradientDrawable";
Debug.ShouldStop(1048576);
_gradient1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.GradientDrawable");Debug.locals.put("Gradient1", _gradient1);
 BA.debugLineNum = 150;BA.debugLine="Dim Clrs(5) As Int";
Debug.ShouldStop(2097152);
_clrs = RemoteObject.createNewArray ("int", new int[] {5}, new Object[]{});Debug.locals.put("Clrs", _clrs);
 BA.debugLineNum = 151;BA.debugLine="Clrs(0) = 0xFFe8eaf6";
Debug.ShouldStop(4194304);
_clrs.setArrayElement (BA.numberCast(int.class, 0xffe8eaf6),BA.numberCast(int.class, 0));
 BA.debugLineNum = 152;BA.debugLine="Clrs(1) = 0xFFe8eaf6";
Debug.ShouldStop(8388608);
_clrs.setArrayElement (BA.numberCast(int.class, 0xffe8eaf6),BA.numberCast(int.class, 1));
 BA.debugLineNum = 153;BA.debugLine="Clrs(2) = 0xFFe8eaf6";
Debug.ShouldStop(16777216);
_clrs.setArrayElement (BA.numberCast(int.class, 0xffe8eaf6),BA.numberCast(int.class, 2));
 BA.debugLineNum = 154;BA.debugLine="Clrs(3) = 0xFF283593";
Debug.ShouldStop(33554432);
_clrs.setArrayElement (BA.numberCast(int.class, 0xff283593),BA.numberCast(int.class, 3));
 BA.debugLineNum = 155;BA.debugLine="Clrs(4) = 0xFF283593";
Debug.ShouldStop(67108864);
_clrs.setArrayElement (BA.numberCast(int.class, 0xff283593),BA.numberCast(int.class, 4));
 BA.debugLineNum = 157;BA.debugLine="Gradient1.Initialize(\"TOP_BOTTOM\", Clrs)";
Debug.ShouldStop(268435456);
_gradient1.runVoidMethod ("Initialize",(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.drawable.GradientDrawable.Orientation"),"TOP_BOTTOM")),(Object)(_clrs));
 BA.debugLineNum = 158;BA.debugLine="Activity.Background=Gradient1";
Debug.ShouldStop(536870912);
ac_hsef.mostCurrent._activity.runMethod(false,"setBackground",(_gradient1.getObject()));
 BA.debugLineNum = 161;BA.debugLine="Dim misef As MI_topusers";
Debug.ShouldStop(1);
_misef = RemoteObject.createNew ("com.it.fome.mi_topusers");Debug.locals.put("misef", _misef);
 BA.debugLineNum = 162;BA.debugLine="misef.Initialize(\"misef\",Me)";
Debug.ShouldStop(2);
_misef.runClassMethod (com.it.fome.mi_topusers.class, "_initialize" /*RemoteObject*/ ,ac_hsef.mostCurrent.activityBA,(Object)(BA.ObjectToString("misef")),(Object)(ac_hsef.getObject()));
 BA.debugLineNum = 163;BA.debugLine="misef.type_history=1";
Debug.ShouldStop(4);
_misef.setField ("_type_history" /*RemoteObject*/ ,BA.numberCast(int.class, 1));
 BA.debugLineNum = 164;BA.debugLine="misef.addpnl(pnl_main)";
Debug.ShouldStop(8);
_misef.runClassMethod (com.it.fome.mi_topusers.class, "_addpnl" /*RemoteObject*/ ,(Object)(_pnl_main));
 BA.debugLineNum = 165;BA.debugLine="req_getme(userid_t)";
Debug.ShouldStop(16);
_req_getme(ac_hsef.mostCurrent._userid_t);
 break; }
}
;
 BA.debugLineNum = 168;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
		Debug.PushSubsStack("Activity_Pause (ac_hsef) ","ac_hsef",10,ac_hsef.mostCurrent.activityBA,ac_hsef.mostCurrent,174);
if (RapidSub.canDelegate("activity_pause")) { return com.it.fome.ac_hsef.remoteMe.runUserSub(false, "ac_hsef","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 174;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 176;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("Activity_Resume (ac_hsef) ","ac_hsef",10,ac_hsef.mostCurrent.activityBA,ac_hsef.mostCurrent,170);
if (RapidSub.canDelegate("activity_resume")) { return com.it.fome.ac_hsef.remoteMe.runUserSub(false, "ac_hsef","activity_resume");}
 BA.debugLineNum = 170;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(512);
 BA.debugLineNum = 172;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 14;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 15;BA.debugLine="Dim meno As Label";
ac_hsef.mostCurrent._meno = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 16;BA.debugLine="Dim pnl_coins As Panel";
ac_hsef.mostCurrent._pnl_coins = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Dim lbl_icon ,lbl_nums As Label";
ac_hsef.mostCurrent._lbl_icon = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
ac_hsef.mostCurrent._lbl_nums = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Dim roundview As MC7RoundView";
ac_hsef.mostCurrent._roundview = RemoteObject.createNew ("com.flycoroundview.mc7.MC7RoundView");
 //BA.debugLineNum = 19;BA.debugLine="Dim LV As Hitex_LayoutView";
ac_hsef.mostCurrent._lv = RemoteObject.createNew ("wir.hitex.recycler.Hitex_LayoutView");
 //BA.debugLineNum = 20;BA.debugLine="Dim glide As Hitex_Glide";
ac_hsef.mostCurrent._glide = RemoteObject.createNew ("com.hitex_glide.Hitex_Glide");
 //BA.debugLineNum = 21;BA.debugLine="Dim username_t ,userid_t As String";
ac_hsef.mostCurrent._username_t = RemoteObject.createImmutable("");
ac_hsef.mostCurrent._userid_t = RemoteObject.createImmutable("");
 //BA.debugLineNum = 22;BA.debugLine="Dim i_username ,i_pk,i_cookie,i_pic As String";
ac_hsef.mostCurrent._i_username = RemoteObject.createImmutable("");
ac_hsef.mostCurrent._i_pk = RemoteObject.createImmutable("");
ac_hsef.mostCurrent._i_cookie = RemoteObject.createImmutable("");
ac_hsef.mostCurrent._i_pic = RemoteObject.createImmutable("");
 //BA.debugLineNum = 23;BA.debugLine="Dim mimeno As mi_meno";
ac_hsef.mostCurrent._mimeno = RemoteObject.createNew ("com.it.fome.mi_meno");
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _lv_getitemcount() throws Exception{
try {
		Debug.PushSubsStack("LV_GetItemCount (ac_hsef) ","ac_hsef",10,ac_hsef.mostCurrent.activityBA,ac_hsef.mostCurrent,254);
if (RapidSub.canDelegate("lv_getitemcount")) { return com.it.fome.ac_hsef.remoteMe.runUserSub(false, "ac_hsef","lv_getitemcount");}
 BA.debugLineNum = 254;BA.debugLine="Sub LV_GetItemCount As Int 								        '$ Item";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 255;BA.debugLine="Return 3 'ItemList.Size";
Debug.ShouldStop(1073741824);
if (true) return BA.numberCast(int.class, 3);
 BA.debugLineNum = 256;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _lv_itemclick(RemoteObject _clickeditem,RemoteObject _position) throws Exception{
try {
		Debug.PushSubsStack("LV_ItemClick (ac_hsef) ","ac_hsef",10,ac_hsef.mostCurrent.activityBA,ac_hsef.mostCurrent,258);
if (RapidSub.canDelegate("lv_itemclick")) { com.it.fome.ac_hsef.remoteMe.runUserSub(false, "ac_hsef","lv_itemclick", _clickeditem, _position); return;}
ResumableSub_LV_ItemClick rsub = new ResumableSub_LV_ItemClick(null,_clickeditem,_position);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_LV_ItemClick extends BA.ResumableSub {
public ResumableSub_LV_ItemClick(com.it.fome.ac_hsef parent,RemoteObject _clickeditem,RemoteObject _position) {
this.parent = parent;
this._clickeditem = _clickeditem;
this._position = _position;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
com.it.fome.ac_hsef parent;
RemoteObject _clickeditem;
RemoteObject _position;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("LV_ItemClick (ac_hsef) ","ac_hsef",10,ac_hsef.mostCurrent.activityBA,ac_hsef.mostCurrent,258);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("ClickedItem", _clickeditem);
Debug.locals.put("Position", _position);
 BA.debugLineNum = 259;BA.debugLine="Sleep(0)";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("Sleep",ac_hsef.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ac_hsef", "lv_itemclick"),BA.numberCast(int.class, 0));
this.state = 11;
return;
case 11:
//C
this.state = 1;
;
 BA.debugLineNum = 260;BA.debugLine="Select Position";
Debug.ShouldStop(8);
if (true) break;

case 1:
//select
this.state = 10;
switch (BA.switchObjectToInt(_position,BA.numberCast(int.class, 0),BA.numberCast(int.class, 1),BA.numberCast(int.class, 2),BA.numberCast(int.class, 3))) {
case 0: {
this.state = 3;
if (true) break;
}
case 1: {
this.state = 5;
if (true) break;
}
case 2: {
this.state = 7;
if (true) break;
}
case 3: {
this.state = 9;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 10;
 BA.debugLineNum = 266;BA.debugLine="SetAnimation(\"anim3\", \"anim4\")";
Debug.ShouldStop(512);
_setanimation(BA.ObjectToString("anim3"),RemoteObject.createImmutable("anim4"));
 if (true) break;

case 5:
//C
this.state = 10;
 BA.debugLineNum = 269;BA.debugLine="SetAnimation(\"anim2\", \"anim1\")";
Debug.ShouldStop(4096);
_setanimation(BA.ObjectToString("anim2"),RemoteObject.createImmutable("anim1"));
 if (true) break;

case 7:
//C
this.state = 10;
 if (true) break;

case 9:
//C
this.state = 10;
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 283;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
public static RemoteObject  _lv_onbindviewholder(RemoteObject _parent,RemoteObject _position) throws Exception{
try {
		Debug.PushSubsStack("LV_onBindViewHolder (ac_hsef) ","ac_hsef",10,ac_hsef.mostCurrent.activityBA,ac_hsef.mostCurrent,229);
if (RapidSub.canDelegate("lv_onbindviewholder")) { return com.it.fome.ac_hsef.remoteMe.runUserSub(false, "ac_hsef","lv_onbindviewholder", _parent, _position);}
RemoteObject _pnl_main = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _lbl_itemicon = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _lbl_name = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _lbl_notis = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("Parent", _parent);
Debug.locals.put("Position", _position);
 BA.debugLineNum = 229;BA.debugLine="Sub LV_onBindViewHolder (Parent As Panel, Position";
Debug.ShouldStop(16);
 BA.debugLineNum = 230;BA.debugLine="Dim pnl_main = Parent.GetView(0) As Panel";
Debug.ShouldStop(32);
_pnl_main = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_pnl_main.setObject(_parent.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).getObject());Debug.locals.put("pnl_main", _pnl_main);
 BA.debugLineNum = 231;BA.debugLine="Dim lbl_itemicon = pnl_main.GetView(0) As Label";
Debug.ShouldStop(64);
_lbl_itemicon = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_lbl_itemicon.setObject(_pnl_main.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).getObject());Debug.locals.put("lbl_itemicon", _lbl_itemicon);
 BA.debugLineNum = 232;BA.debugLine="Dim lbl_name = pnl_main.GetView(1) As Label";
Debug.ShouldStop(128);
_lbl_name = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_lbl_name.setObject(_pnl_main.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1))).getObject());Debug.locals.put("lbl_name", _lbl_name);
 BA.debugLineNum = 234;BA.debugLine="Dim lbl_notis = pnl_main.GetView(2) As Label";
Debug.ShouldStop(512);
_lbl_notis = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_lbl_notis.setObject(_pnl_main.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 2))).getObject());Debug.locals.put("lbl_notis", _lbl_notis);
 BA.debugLineNum = 236;BA.debugLine="Select Position";
Debug.ShouldStop(2048);
switch (BA.switchObjectToInt(_position,BA.numberCast(int.class, 0),BA.numberCast(int.class, 1),BA.numberCast(int.class, 2))) {
case 0: {
 BA.debugLineNum = 238;BA.debugLine="lbl_name.Text=\"سفارش بده\"";
Debug.ShouldStop(8192);
_lbl_name.runMethod(true,"setText",BA.ObjectToCharSequence("سفارش بده"));
 BA.debugLineNum = 239;BA.debugLine="lbl_notis.Text=\"ممبر-ویو\"";
Debug.ShouldStop(16384);
_lbl_notis.runMethod(true,"setText",BA.ObjectToCharSequence("ممبر-ویو"));
 BA.debugLineNum = 240;BA.debugLine="lbl_itemicon.Text=Chr(0xE003)";
Debug.ShouldStop(32768);
_lbl_itemicon.runMethod(true,"setText",BA.ObjectToCharSequence(ac_hsef.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xe003)))));
 break; }
case 1: {
 BA.debugLineNum = 243;BA.debugLine="lbl_name.Text=\"سکه بگیر\"";
Debug.ShouldStop(262144);
_lbl_name.runMethod(true,"setText",BA.ObjectToCharSequence("سکه بگیر"));
 BA.debugLineNum = 244;BA.debugLine="lbl_notis.Text=\"سکه رایگان\"";
Debug.ShouldStop(524288);
_lbl_notis.runMethod(true,"setText",BA.ObjectToCharSequence("سکه رایگان"));
 BA.debugLineNum = 245;BA.debugLine="lbl_itemicon.Text=Chr(0xE8E5)";
Debug.ShouldStop(1048576);
_lbl_itemicon.runMethod(true,"setText",BA.ObjectToCharSequence(ac_hsef.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xe8e5)))));
 break; }
case 2: {
 BA.debugLineNum = 247;BA.debugLine="lbl_name.Text=\"سفارشات\"";
Debug.ShouldStop(4194304);
_lbl_name.runMethod(true,"setText",BA.ObjectToCharSequence("سفارشات"));
 BA.debugLineNum = 248;BA.debugLine="lbl_notis.Text=\"پیگیری سفارشات\"";
Debug.ShouldStop(8388608);
_lbl_notis.runMethod(true,"setText",BA.ObjectToCharSequence("پیگیری سفارشات"));
 BA.debugLineNum = 249;BA.debugLine="lbl_itemicon.Text=Chr(0xE06D)";
Debug.ShouldStop(16777216);
_lbl_itemicon.runMethod(true,"setText",BA.ObjectToCharSequence(ac_hsef.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xe06d)))));
 break; }
}
;
 BA.debugLineNum = 251;BA.debugLine="Parent.Height=20%y";
Debug.ShouldStop(67108864);
_parent.runMethod(true,"setHeight",ac_hsef.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 20)),ac_hsef.mostCurrent.activityBA));
 BA.debugLineNum = 252;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lv_oncreateviewholder(RemoteObject _parent,RemoteObject _viewtype) throws Exception{
try {
		Debug.PushSubsStack("LV_onCreateViewHolder (ac_hsef) ","ac_hsef",10,ac_hsef.mostCurrent.activityBA,ac_hsef.mostCurrent,178);
if (RapidSub.canDelegate("lv_oncreateviewholder")) { return com.it.fome.ac_hsef.remoteMe.runUserSub(false, "ac_hsef","lv_oncreateviewholder", _parent, _viewtype);}
RemoteObject _bkcolors = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
RemoteObject _pnl_main = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _lbl_itemicon = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _lbl_name = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _bkcolor = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
RemoteObject _lbl_notis = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("Parent", _parent);
Debug.locals.put("ViewType", _viewtype);
 BA.debugLineNum = 178;BA.debugLine="Sub LV_onCreateViewHolder (Parent As Panel, ViewTy";
Debug.ShouldStop(131072);
 BA.debugLineNum = 179;BA.debugLine="Parent.Color=Colors.Transparent";
Debug.ShouldStop(262144);
_parent.runVoidMethod ("setColor",ac_hsef.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 181;BA.debugLine="Dim bkcolors As ColorDrawable";
Debug.ShouldStop(1048576);
_bkcolors = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("bkcolors", _bkcolors);
 BA.debugLineNum = 182;BA.debugLine="bkcolors.Initialize(Colors.White,15)";
Debug.ShouldStop(2097152);
_bkcolors.runVoidMethod ("Initialize",(Object)(ac_hsef.mostCurrent.__c.getField(false,"Colors").getField(true,"White")),(Object)(BA.numberCast(int.class, 15)));
 BA.debugLineNum = 184;BA.debugLine="Dim pnl_main As Panel : pnl_main.Initialize(\"pnl_";
Debug.ShouldStop(8388608);
_pnl_main = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("pnl_main", _pnl_main);
 BA.debugLineNum = 184;BA.debugLine="Dim pnl_main As Panel : pnl_main.Initialize(\"pnl_";
Debug.ShouldStop(8388608);
_pnl_main.runVoidMethod ("Initialize",ac_hsef.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("pnl_main")));
 BA.debugLineNum = 185;BA.debugLine="pnl_main.Color=Colors.White";
Debug.ShouldStop(16777216);
_pnl_main.runVoidMethod ("setColor",ac_hsef.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 186;BA.debugLine="pnl_main.Background=bkcolors";
Debug.ShouldStop(33554432);
_pnl_main.runMethod(false,"setBackground",(_bkcolors.getObject()));
 BA.debugLineNum = 187;BA.debugLine="Parent.AddView(pnl_main,5%x,2%x,90%x,18%y)";
Debug.ShouldStop(67108864);
_parent.runVoidMethod ("AddView",(Object)((_pnl_main.getObject())),(Object)(ac_hsef.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),ac_hsef.mostCurrent.activityBA)),(Object)(ac_hsef.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),ac_hsef.mostCurrent.activityBA)),(Object)(ac_hsef.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 90)),ac_hsef.mostCurrent.activityBA)),(Object)(ac_hsef.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 18)),ac_hsef.mostCurrent.activityBA)));
 BA.debugLineNum = 189;BA.debugLine="Dim lbl_itemicon As Label";
Debug.ShouldStop(268435456);
_lbl_itemicon = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl_itemicon", _lbl_itemicon);
 BA.debugLineNum = 190;BA.debugLine="lbl_itemicon.Initialize(\"lbl_itemicon\")";
Debug.ShouldStop(536870912);
_lbl_itemicon.runVoidMethod ("Initialize",ac_hsef.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("lbl_itemicon")));
 BA.debugLineNum = 191;BA.debugLine="lbl_itemicon.TextColor=0xFFD305BA";
Debug.ShouldStop(1073741824);
_lbl_itemicon.runMethod(true,"setTextColor",BA.numberCast(int.class, 0xffd305ba));
 BA.debugLineNum = 192;BA.debugLine="lbl_itemicon.TextSize=40";
Debug.ShouldStop(-2147483648);
_lbl_itemicon.runMethod(true,"setTextSize",BA.numberCast(float.class, 40));
 BA.debugLineNum = 193;BA.debugLine="lbl_itemicon.Typeface=Typeface.MATERIALICONS";
Debug.ShouldStop(1);
_lbl_itemicon.runMethod(false,"setTypeface",ac_hsef.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"getMATERIALICONS"));
 BA.debugLineNum = 194;BA.debugLine="lbl_itemicon.Gravity=Gravity.CENTER_VERTICAL+Grav";
Debug.ShouldStop(2);
_lbl_itemicon.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {ac_hsef.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL"),ac_hsef.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL")}, "+",1, 1));
 BA.debugLineNum = 195;BA.debugLine="pnl_main.AddView(lbl_itemicon,0,3%x,pnl_main.Widt";
Debug.ShouldStop(4);
_pnl_main.runVoidMethod ("AddView",(Object)((_lbl_itemicon.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(ac_hsef.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 3)),ac_hsef.mostCurrent.activityBA)),(Object)(_pnl_main.runMethod(true,"getWidth")),(Object)(ac_hsef.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),ac_hsef.mostCurrent.activityBA)));
 BA.debugLineNum = 197;BA.debugLine="Dim lbl_name As Label";
Debug.ShouldStop(16);
_lbl_name = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl_name", _lbl_name);
 BA.debugLineNum = 198;BA.debugLine="lbl_name.Initialize(\"lbl_name\")";
Debug.ShouldStop(32);
_lbl_name.runVoidMethod ("Initialize",ac_hsef.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("lbl_name")));
 BA.debugLineNum = 199;BA.debugLine="lbl_name.TextColor=Colors.DarkGray";
Debug.ShouldStop(64);
_lbl_name.runMethod(true,"setTextColor",ac_hsef.mostCurrent.__c.getField(false,"Colors").getField(true,"DarkGray"));
 BA.debugLineNum = 200;BA.debugLine="lbl_name.TextSize=17";
Debug.ShouldStop(128);
_lbl_name.runMethod(true,"setTextSize",BA.numberCast(float.class, 17));
 BA.debugLineNum = 201;BA.debugLine="lbl_name.Typeface=Typeface.LoadFromAssets(\"iran_s";
Debug.ShouldStop(256);
_lbl_name.runMethod(false,"setTypeface",ac_hsef.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("iran_sans.ttf"))));
 BA.debugLineNum = 202;BA.debugLine="lbl_name.Gravity=Gravity.CENTER_VERTICAL+Gravity.";
Debug.ShouldStop(512);
_lbl_name.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {ac_hsef.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL"),ac_hsef.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL")}, "+",1, 1));
 BA.debugLineNum = 203;BA.debugLine="pnl_main.AddView(lbl_name,0,lbl_itemicon.Top+lbl_";
Debug.ShouldStop(1024);
_pnl_main.runVoidMethod ("AddView",(Object)((_lbl_name.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {_lbl_itemicon.runMethod(true,"getTop"),_lbl_itemicon.runMethod(true,"getHeight"),ac_hsef.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),ac_hsef.mostCurrent.activityBA)}, "+-",2, 1)),(Object)(_pnl_main.runMethod(true,"getWidth")),(Object)(ac_hsef.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),ac_hsef.mostCurrent.activityBA)));
 BA.debugLineNum = 205;BA.debugLine="Dim bkcolor As ColorDrawable";
Debug.ShouldStop(4096);
_bkcolor = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("bkcolor", _bkcolor);
 BA.debugLineNum = 206;BA.debugLine="bkcolor.Initialize(0xFFFFD82B,10)";
Debug.ShouldStop(8192);
_bkcolor.runVoidMethod ("Initialize",(Object)(BA.numberCast(int.class, 0xffffd82b)),(Object)(BA.numberCast(int.class, 10)));
 BA.debugLineNum = 207;BA.debugLine="Dim lbl_notis As Label";
Debug.ShouldStop(16384);
_lbl_notis = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl_notis", _lbl_notis);
 BA.debugLineNum = 208;BA.debugLine="lbl_notis.Initialize(\"lbl_notis\")";
Debug.ShouldStop(32768);
_lbl_notis.runVoidMethod ("Initialize",ac_hsef.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("lbl_notis")));
 BA.debugLineNum = 209;BA.debugLine="lbl_notis.TextColor=Colors.DarkGray";
Debug.ShouldStop(65536);
_lbl_notis.runMethod(true,"setTextColor",ac_hsef.mostCurrent.__c.getField(false,"Colors").getField(true,"DarkGray"));
 BA.debugLineNum = 210;BA.debugLine="lbl_notis.TextSize=17";
Debug.ShouldStop(131072);
_lbl_notis.runMethod(true,"setTextSize",BA.numberCast(float.class, 17));
 BA.debugLineNum = 211;BA.debugLine="lbl_notis.Typeface=Typeface.LoadFromAssets(\"iran_";
Debug.ShouldStop(262144);
_lbl_notis.runMethod(false,"setTypeface",ac_hsef.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("iran_sans.ttf"))));
 BA.debugLineNum = 212;BA.debugLine="lbl_notis.Text=\"با قیمت مناسب و کیفیت تضمینی !\"";
Debug.ShouldStop(524288);
_lbl_notis.runMethod(true,"setText",BA.ObjectToCharSequence("با قیمت مناسب و کیفیت تضمینی !"));
 BA.debugLineNum = 213;BA.debugLine="lbl_notis.Gravity=Gravity.CENTER_VERTICAL+Gravity";
Debug.ShouldStop(1048576);
_lbl_notis.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {ac_hsef.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL"),ac_hsef.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL")}, "+",1, 1));
 BA.debugLineNum = 215;BA.debugLine="pnl_main.AddView(lbl_notis,5%x,lbl_name.Top+lbl_n";
Debug.ShouldStop(4194304);
_pnl_main.runVoidMethod ("AddView",(Object)((_lbl_notis.getObject())),(Object)(ac_hsef.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),ac_hsef.mostCurrent.activityBA)),(Object)(RemoteObject.solve(new RemoteObject[] {_lbl_name.runMethod(true,"getTop"),_lbl_name.runMethod(true,"getHeight"),ac_hsef.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 1)),ac_hsef.mostCurrent.activityBA)}, "+-",2, 1)),(Object)(ac_hsef.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 80)),ac_hsef.mostCurrent.activityBA)),(Object)(ac_hsef.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 9)),ac_hsef.mostCurrent.activityBA)));
 BA.debugLineNum = 217;BA.debugLine="lbl_name.Text=\"فالوور بگیر\"";
Debug.ShouldStop(16777216);
_lbl_name.runMethod(true,"setText",BA.ObjectToCharSequence("فالوور بگیر"));
 BA.debugLineNum = 218;BA.debugLine="lbl_itemicon.Text=Chr(0xE8D3)";
Debug.ShouldStop(33554432);
_lbl_itemicon.runMethod(true,"setText",BA.ObjectToCharSequence(ac_hsef.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xe8d3)))));
 BA.debugLineNum = 220;BA.debugLine="roundview.Initialize(lbl_notis)";
Debug.ShouldStop(134217728);
ac_hsef.mostCurrent._roundview.runVoidMethod ("Initialize",ac_hsef.processBA,(Object)((_lbl_notis.getObject())));
 BA.debugLineNum = 221;BA.debugLine="roundview.CornerRadius_BL=30";
Debug.ShouldStop(268435456);
ac_hsef.mostCurrent._roundview.runMethod(true,"setCornerRadius_BL",BA.numberCast(int.class, 30));
 BA.debugLineNum = 222;BA.debugLine="roundview.CornerRadius_BR=30";
Debug.ShouldStop(536870912);
ac_hsef.mostCurrent._roundview.runMethod(true,"setCornerRadius_BR",BA.numberCast(int.class, 30));
 BA.debugLineNum = 223;BA.debugLine="roundview.CornerRadius_TL=30";
Debug.ShouldStop(1073741824);
ac_hsef.mostCurrent._roundview.runMethod(true,"setCornerRadius_TL",BA.numberCast(int.class, 30));
 BA.debugLineNum = 224;BA.debugLine="roundview.CornerRadius_TR=30";
Debug.ShouldStop(-2147483648);
ac_hsef.mostCurrent._roundview.runMethod(true,"setCornerRadius_TR",BA.numberCast(int.class, 30));
 BA.debugLineNum = 225;BA.debugLine="roundview.BackgroundColor=0xFFFFD82B";
Debug.ShouldStop(1);
ac_hsef.mostCurrent._roundview.runMethod(true,"setBackgroundColor",BA.numberCast(int.class, 0xffffd82b));
 BA.debugLineNum = 227;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
		Debug.PushSubsStack("meno_Click (ac_hsef) ","ac_hsef",10,ac_hsef.mostCurrent.activityBA,ac_hsef.mostCurrent,402);
if (RapidSub.canDelegate("meno_click")) { return com.it.fome.ac_hsef.remoteMe.runUserSub(false, "ac_hsef","meno_click");}
 BA.debugLineNum = 402;BA.debugLine="Sub meno_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 403;BA.debugLine="mimeno.Initialize(\"mimeno\",Me)";
Debug.ShouldStop(262144);
ac_hsef.mostCurrent._mimeno.runClassMethod (com.it.fome.mi_meno.class, "_initialize" /*RemoteObject*/ ,ac_hsef.mostCurrent.activityBA,(Object)(BA.ObjectToString("mimeno")),(Object)(ac_hsef.getObject()));
 BA.debugLineNum = 404;BA.debugLine="mimeno.addpnl";
Debug.ShouldStop(524288);
ac_hsef.mostCurrent._mimeno.runClassMethod (com.it.fome.mi_meno.class, "_addpnl" /*RemoteObject*/ );
 BA.debugLineNum = 405;BA.debugLine="mimeno.open";
Debug.ShouldStop(1048576);
ac_hsef.mostCurrent._mimeno.runClassMethod (com.it.fome.mi_meno.class, "_open" /*RemoteObject*/ );
 BA.debugLineNum = 406;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("prfn_onPostStringErrorListener (ac_hsef) ","ac_hsef",10,ac_hsef.mostCurrent.activityBA,ac_hsef.mostCurrent,333);
if (RapidSub.canDelegate("prfn_onpoststringerrorlistener")) { return com.it.fome.ac_hsef.remoteMe.runUserSub(false, "ac_hsef","prfn_onpoststringerrorlistener", _error, _tag);}
Debug.locals.put("Error", _error);
Debug.locals.put("Tag", _tag);
 BA.debugLineNum = 333;BA.debugLine="Sub prfn_onPostStringErrorListener(Error As Respon";
Debug.ShouldStop(4096);
 BA.debugLineNum = 335;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(16384);
ac_hsef.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 336;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("prfn_onPostStringOkListener (ac_hsef) ","ac_hsef",10,ac_hsef.mostCurrent.activityBA,ac_hsef.mostCurrent,338);
if (RapidSub.canDelegate("prfn_onpoststringoklistener")) { return com.it.fome.ac_hsef.remoteMe.runUserSub(false, "ac_hsef","prfn_onpoststringoklistener", _result, _tag);}
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colroot = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _c_m = RemoteObject.createImmutable("");
RemoteObject _uid = RemoteObject.createImmutable("");
RemoteObject _id = RemoteObject.createImmutable("");
RemoteObject _c_f = RemoteObject.createImmutable("");
RemoteObject _pic = RemoteObject.createImmutable("");
RemoteObject _userid = RemoteObject.createImmutable("");
RemoteObject _username = RemoteObject.createImmutable("");
RemoteObject _n_coins = RemoteObject.createImmutable(0L);
RemoteObject _first_last = RemoteObject.createImmutable("");
RemoteObject _c_ch = RemoteObject.createImmutable("");
Debug.locals.put("Tag", _tag);
 BA.debugLineNum = 338;BA.debugLine="Sub prfn_onPostStringOkListener(Result As String";
Debug.ShouldStop(131072);
 BA.debugLineNum = 340;BA.debugLine="Select Tag";
Debug.ShouldStop(524288);
switch (BA.switchObjectToInt(_tag,BA.ObjectToString("iuser"),BA.ObjectToString("igetinsta"),BA.ObjectToString("getinsta"))) {
case 0: {
 BA.debugLineNum = 342;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(2097152);
ac_hsef.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 343;BA.debugLine="Log(Result)";
Debug.ShouldStop(4194304);
ac_hsef.mostCurrent.__c.runVoidMethod ("LogImpl","613500421",_result,0);
 break; }
case 1: {
 BA.debugLineNum = 345;BA.debugLine="Log(Result)";
Debug.ShouldStop(16777216);
ac_hsef.mostCurrent.__c.runVoidMethod ("LogImpl","613500423",_result,0);
 BA.debugLineNum = 346;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(33554432);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 347;BA.debugLine="parser.Initialize(Result)";
Debug.ShouldStop(67108864);
_parser.runVoidMethod ("Initialize",(Object)(_result));
 BA.debugLineNum = 348;BA.debugLine="Dim root As List = parser.NextArray";
Debug.ShouldStop(134217728);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_root = _parser.runMethod(false,"NextArray");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 349;BA.debugLine="For Each colroot As Map In root";
Debug.ShouldStop(268435456);
_colroot = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group10 = _root;
final int groupLen10 = group10.runMethod(true,"getSize").<Integer>get()
;int index10 = 0;
;
for (; index10 < groupLen10;index10++){
_colroot.setObject(group10.runMethod(false,"Get",index10));
Debug.locals.put("colroot", _colroot);
 BA.debugLineNum = 350;BA.debugLine="Dim Result As String = colroot.Get(\"result\")";
Debug.ShouldStop(536870912);
_result = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("result")))));Debug.locals.put("Result", _result);Debug.locals.put("Result", _result);
 BA.debugLineNum = 351;BA.debugLine="Dim c_m As String = colroot.Get(\"c_m\")";
Debug.ShouldStop(1073741824);
_c_m = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("c_m")))));Debug.locals.put("c_m", _c_m);Debug.locals.put("c_m", _c_m);
 BA.debugLineNum = 352;BA.debugLine="Dim uid As String = colroot.Get(\"uid\")";
Debug.ShouldStop(-2147483648);
_uid = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("uid")))));Debug.locals.put("uid", _uid);Debug.locals.put("uid", _uid);
 BA.debugLineNum = 353;BA.debugLine="Dim id As String = colroot.Get(\"id\")";
Debug.ShouldStop(1);
_id = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 354;BA.debugLine="Dim c_f As String = colroot.Get(\"c_f\")";
Debug.ShouldStop(2);
_c_f = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("c_f")))));Debug.locals.put("c_f", _c_f);Debug.locals.put("c_f", _c_f);
 BA.debugLineNum = 355;BA.debugLine="Dim pic As String = colroot.Get(\"pic\")";
Debug.ShouldStop(4);
_pic = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("pic")))));Debug.locals.put("pic", _pic);Debug.locals.put("pic", _pic);
 BA.debugLineNum = 356;BA.debugLine="Dim userid As String = colroot.Get(\"userid\")";
Debug.ShouldStop(8);
_userid = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("userid")))));Debug.locals.put("userid", _userid);Debug.locals.put("userid", _userid);
 BA.debugLineNum = 357;BA.debugLine="Dim username As String = colroot.Get(\"username";
Debug.ShouldStop(16);
_username = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("username")))));Debug.locals.put("username", _username);Debug.locals.put("username", _username);
 BA.debugLineNum = 358;BA.debugLine="Log(c_f)";
Debug.ShouldStop(32);
ac_hsef.mostCurrent.__c.runVoidMethod ("LogImpl","613500436",_c_f,0);
 BA.debugLineNum = 359;BA.debugLine="Dim n_coins=c_m As Long";
Debug.ShouldStop(64);
_n_coins = BA.numberCast(long.class, _c_m);Debug.locals.put("n_coins", _n_coins);Debug.locals.put("n_coins", _n_coins);
 BA.debugLineNum = 360;BA.debugLine="If n_coins>100 Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean(">",_n_coins,BA.numberCast(double.class, 100))) { 
 BA.debugLineNum = 361;BA.debugLine="lbl_nums.Text=\"سکه \"&NumberFormat(c_m,3,0)";
Debug.ShouldStop(256);
ac_hsef.mostCurrent._lbl_nums.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("سکه "),ac_hsef.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _c_m)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 0))))));
 }else {
 BA.debugLineNum = 363;BA.debugLine="lbl_nums.Text=\"سکه \"&c_m";
Debug.ShouldStop(1024);
ac_hsef.mostCurrent._lbl_nums.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("سکه "),_c_m)));
 };
 BA.debugLineNum = 367;BA.debugLine="sql1.ExecNonQuery(\"UPDATE tbl_coin set cm='\"&c";
Debug.ShouldStop(16384);
ac_hsef._sql1.runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE tbl_coin set cm='"),_c_m,RemoteObject.createImmutable("',cf='"),_c_f,RemoteObject.createImmutable("' WHERE userid='"),ac_hsef.mostCurrent._i_pk,RemoteObject.createImmutable("' "))));
 }
}Debug.locals.put("colroot", _colroot);
;
 break; }
case 2: {
 BA.debugLineNum = 371;BA.debugLine="Log(Result)";
Debug.ShouldStop(262144);
ac_hsef.mostCurrent.__c.runVoidMethod ("LogImpl","613500449",_result,0);
 BA.debugLineNum = 372;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(524288);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 373;BA.debugLine="parser.Initialize(Result)";
Debug.ShouldStop(1048576);
_parser.runVoidMethod ("Initialize",(Object)(_result));
 BA.debugLineNum = 374;BA.debugLine="Dim root As List = parser.NextArray";
Debug.ShouldStop(2097152);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_root = _parser.runMethod(false,"NextArray");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 375;BA.debugLine="For Each colroot As Map In root";
Debug.ShouldStop(4194304);
_colroot = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group33 = _root;
final int groupLen33 = group33.runMethod(true,"getSize").<Integer>get()
;int index33 = 0;
;
for (; index33 < groupLen33;index33++){
_colroot.setObject(group33.runMethod(false,"Get",index33));
Debug.locals.put("colroot", _colroot);
 BA.debugLineNum = 376;BA.debugLine="Dim Result As String = colroot.Get(\"result\")";
Debug.ShouldStop(8388608);
_result = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("result")))));Debug.locals.put("Result", _result);Debug.locals.put("Result", _result);
 BA.debugLineNum = 377;BA.debugLine="Dim c_m As String = colroot.Get(\"c_m\")";
Debug.ShouldStop(16777216);
_c_m = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("c_m")))));Debug.locals.put("c_m", _c_m);Debug.locals.put("c_m", _c_m);
 BA.debugLineNum = 378;BA.debugLine="Dim uid As String = colroot.Get(\"uid\")";
Debug.ShouldStop(33554432);
_uid = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("uid")))));Debug.locals.put("uid", _uid);Debug.locals.put("uid", _uid);
 BA.debugLineNum = 379;BA.debugLine="Dim first_last As String = colroot.Get(\"first_";
Debug.ShouldStop(67108864);
_first_last = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("first_last")))));Debug.locals.put("first_last", _first_last);Debug.locals.put("first_last", _first_last);
 BA.debugLineNum = 380;BA.debugLine="Dim id As String = colroot.Get(\"id\")";
Debug.ShouldStop(134217728);
_id = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 381;BA.debugLine="Dim userid As String = colroot.Get(\"userid\")";
Debug.ShouldStop(268435456);
_userid = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("userid")))));Debug.locals.put("userid", _userid);Debug.locals.put("userid", _userid);
 BA.debugLineNum = 382;BA.debugLine="Dim username As String = colroot.Get(\"username";
Debug.ShouldStop(536870912);
_username = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("username")))));Debug.locals.put("username", _username);Debug.locals.put("username", _username);
 BA.debugLineNum = 383;BA.debugLine="Dim c_ch As String = colroot.Get(\"c_ch\")";
Debug.ShouldStop(1073741824);
_c_ch = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("c_ch")))));Debug.locals.put("c_ch", _c_ch);Debug.locals.put("c_ch", _c_ch);
 BA.debugLineNum = 385;BA.debugLine="Log(c_m)";
Debug.ShouldStop(1);
ac_hsef.mostCurrent.__c.runVoidMethod ("LogImpl","613500463",_c_m,0);
 BA.debugLineNum = 386;BA.debugLine="Dim n_coins=c_m As Long";
Debug.ShouldStop(2);
_n_coins = BA.numberCast(long.class, _c_m);Debug.locals.put("n_coins", _n_coins);Debug.locals.put("n_coins", _n_coins);
 BA.debugLineNum = 387;BA.debugLine="If n_coins>100 Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean(">",_n_coins,BA.numberCast(double.class, 100))) { 
 BA.debugLineNum = 388;BA.debugLine="lbl_nums.Text=\"سکه \"&NumberFormat(c_m,3,0)";
Debug.ShouldStop(8);
ac_hsef.mostCurrent._lbl_nums.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("سکه "),ac_hsef.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _c_m)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 0))))));
 }else {
 BA.debugLineNum = 390;BA.debugLine="lbl_nums.Text=\"سکه \"&c_m";
Debug.ShouldStop(32);
ac_hsef.mostCurrent._lbl_nums.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("سکه "),_c_m)));
 };
 BA.debugLineNum = 394;BA.debugLine="sql1.ExecNonQuery(\"UPDATE tbl_coin set cm='\"&c";
Debug.ShouldStop(512);
ac_hsef._sql1.runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE tbl_coin set cm='"),_c_m,RemoteObject.createImmutable("',cf='"),_c_ch,RemoteObject.createImmutable("' WHERE userid='"),ac_hsef.mostCurrent._userid_t,RemoteObject.createImmutable("' "))));
 }
}Debug.locals.put("colroot", _colroot);
;
 break; }
}
;
 BA.debugLineNum = 400;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
ac_hsef._sql1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL");
 //BA.debugLineNum = 10;BA.debugLine="Private cursor1 As Cursor";
ac_hsef._cursor1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
 //BA.debugLineNum = 11;BA.debugLine="Dim typesef As Int";
ac_hsef._typesef = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _req_getme(RemoteObject _userid) throws Exception{
try {
		Debug.PushSubsStack("req_getme (ac_hsef) ","ac_hsef",10,ac_hsef.mostCurrent.activityBA,ac_hsef.mostCurrent,297);
if (RapidSub.canDelegate("req_getme")) { return com.it.fome.ac_hsef.remoteMe.runUserSub(false, "ac_hsef","req_getme", _userid);}
RemoteObject _prfn = RemoteObject.declareNull("com.reza.sh.fastnet.Fastnet");
RemoteObject _post = RemoteObject.declareNull("com.reza.sh.fastnet.PostRequestRaper");
Debug.locals.put("userid", _userid);
 BA.debugLineNum = 297;BA.debugLine="Sub req_getme(userid As String)";
Debug.ShouldStop(256);
 BA.debugLineNum = 298;BA.debugLine="Dim prfn As PersianFastNetwork";
Debug.ShouldStop(512);
_prfn = RemoteObject.createNew ("com.reza.sh.fastnet.Fastnet");Debug.locals.put("prfn", _prfn);
 BA.debugLineNum = 299;BA.debugLine="prfn.initialize(\"prfn\")";
Debug.ShouldStop(1024);
_prfn.runVoidMethod ("initialize",ac_hsef.processBA,(Object)(RemoteObject.createImmutable("prfn")));
 BA.debugLineNum = 301;BA.debugLine="Dim post As PostRequest";
Debug.ShouldStop(4096);
_post = RemoteObject.createNew ("com.reza.sh.fastnet.PostRequestRaper");Debug.locals.put("post", _post);
 BA.debugLineNum = 302;BA.debugLine="post=prfn.BuildPostQuery(\"http://filework.ir/INST";
Debug.ShouldStop(8192);
_post = _prfn.runMethod(false,"BuildPostQuery",(Object)(BA.ObjectToString("http://filework.ir/INSTAFOLLOW/api/req.php")),(Object)(RemoteObject.createImmutable("getinsta")));Debug.locals.put("post", _post);
 BA.debugLineNum = 304;BA.debugLine="post.addHeder(\"User-Agent\",\"Dalvik/1.6.0 (Linux;";
Debug.ShouldStop(32768);
_post.runVoidMethod ("addHeder",(Object)(BA.ObjectToString("User-Agent")),(Object)(RemoteObject.createImmutable("Dalvik/1.6.0 (Linux; U; Android 4.4.4; SM-A700FD Build/KTU84P)")));
 BA.debugLineNum = 306;BA.debugLine="post.addParametrs(\"ui\",\"1\")";
Debug.ShouldStop(131072);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("ui")),(Object)(RemoteObject.createImmutable("1")));
 BA.debugLineNum = 307;BA.debugLine="post.addParametrs(\"userid\",userid_t)";
Debug.ShouldStop(262144);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("userid")),(Object)(ac_hsef.mostCurrent._userid_t));
 BA.debugLineNum = 309;BA.debugLine="post.addParametrs(\"req\",\"get_acct\")";
Debug.ShouldStop(1048576);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("req")),(Object)(RemoteObject.createImmutable("get_acct")));
 BA.debugLineNum = 312;BA.debugLine="post.executRequestAsString";
Debug.ShouldStop(8388608);
_post.runVoidMethod ("executRequestAsString");
 BA.debugLineNum = 313;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _req_igetme(RemoteObject _userid) throws Exception{
try {
		Debug.PushSubsStack("req_igetme (ac_hsef) ","ac_hsef",10,ac_hsef.mostCurrent.activityBA,ac_hsef.mostCurrent,315);
if (RapidSub.canDelegate("req_igetme")) { return com.it.fome.ac_hsef.remoteMe.runUserSub(false, "ac_hsef","req_igetme", _userid);}
RemoteObject _prfn = RemoteObject.declareNull("com.reza.sh.fastnet.Fastnet");
RemoteObject _post = RemoteObject.declareNull("com.reza.sh.fastnet.PostRequestRaper");
Debug.locals.put("userid", _userid);
 BA.debugLineNum = 315;BA.debugLine="Sub req_igetme(userid As String)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 316;BA.debugLine="Dim prfn As PersianFastNetwork";
Debug.ShouldStop(134217728);
_prfn = RemoteObject.createNew ("com.reza.sh.fastnet.Fastnet");Debug.locals.put("prfn", _prfn);
 BA.debugLineNum = 317;BA.debugLine="prfn.initialize(\"prfn\")";
Debug.ShouldStop(268435456);
_prfn.runVoidMethod ("initialize",ac_hsef.processBA,(Object)(RemoteObject.createImmutable("prfn")));
 BA.debugLineNum = 319;BA.debugLine="Dim post As PostRequest";
Debug.ShouldStop(1073741824);
_post = RemoteObject.createNew ("com.reza.sh.fastnet.PostRequestRaper");Debug.locals.put("post", _post);
 BA.debugLineNum = 320;BA.debugLine="post=prfn.BuildPostQuery(\"http://filework.ir/INST";
Debug.ShouldStop(-2147483648);
_post = _prfn.runMethod(false,"BuildPostQuery",(Object)(BA.ObjectToString("http://filework.ir/INSTAFOLLOW/api/req.php")),(Object)(RemoteObject.createImmutable("igetinsta")));Debug.locals.put("post", _post);
 BA.debugLineNum = 322;BA.debugLine="post.addHeder(\"User-Agent\",\"Dalvik/1.6.0 (Linux;";
Debug.ShouldStop(2);
_post.runVoidMethod ("addHeder",(Object)(BA.ObjectToString("User-Agent")),(Object)(RemoteObject.createImmutable("Dalvik/1.6.0 (Linux; U; Android 4.4.4; SM-A700FD Build/KTU84P)")));
 BA.debugLineNum = 324;BA.debugLine="post.addParametrs(\"ui\",\"1\")";
Debug.ShouldStop(8);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("ui")),(Object)(RemoteObject.createImmutable("1")));
 BA.debugLineNum = 325;BA.debugLine="post.addParametrs(\"userid\",i_pk)";
Debug.ShouldStop(16);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("userid")),(Object)(ac_hsef.mostCurrent._i_pk));
 BA.debugLineNum = 327;BA.debugLine="post.addParametrs(\"req\",\"get_acci\")";
Debug.ShouldStop(64);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("req")),(Object)(RemoteObject.createImmutable("get_acci")));
 BA.debugLineNum = 330;BA.debugLine="post.executRequestAsString";
Debug.ShouldStop(512);
_post.runVoidMethod ("executRequestAsString");
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
public static RemoteObject  _setanimation(RemoteObject _inanimation,RemoteObject _outanimation) throws Exception{
try {
		Debug.PushSubsStack("SetAnimation (ac_hsef) ","ac_hsef",10,ac_hsef.mostCurrent.activityBA,ac_hsef.mostCurrent,285);
if (RapidSub.canDelegate("setanimation")) { return com.it.fome.ac_hsef.remoteMe.runUserSub(false, "ac_hsef","setanimation", _inanimation, _outanimation);}
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
RemoteObject _package = RemoteObject.createImmutable("");
RemoteObject _in = RemoteObject.createImmutable(0);
RemoteObject _out = RemoteObject.createImmutable(0);
Debug.locals.put("InAnimation", _inanimation);
Debug.locals.put("OutAnimation", _outanimation);
 BA.debugLineNum = 285;BA.debugLine="Sub SetAnimation(InAnimation As String, OutAnimati";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 286;BA.debugLine="Dim r As Reflector";
Debug.ShouldStop(536870912);
_r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("r", _r);
 BA.debugLineNum = 287;BA.debugLine="Dim package As String";
Debug.ShouldStop(1073741824);
_package = RemoteObject.createImmutable("");Debug.locals.put("package", _package);
 BA.debugLineNum = 288;BA.debugLine="Dim In, out As Int";
Debug.ShouldStop(-2147483648);
_in = RemoteObject.createImmutable(0);Debug.locals.put("In", _in);
_out = RemoteObject.createImmutable(0);Debug.locals.put("out", _out);
 BA.debugLineNum = 289;BA.debugLine="package = r.GetStaticField(\"anywheresoftware.b4a.";
Debug.ShouldStop(1);
_package = BA.ObjectToString(_r.runMethod(false,"GetStaticField",(Object)(BA.ObjectToString("anywheresoftware.b4a.BA")),(Object)(RemoteObject.createImmutable("packageName"))));Debug.locals.put("package", _package);
 BA.debugLineNum = 290;BA.debugLine="In = r.GetStaticField(package & \".R$anim\", InAnim";
Debug.ShouldStop(2);
_in = BA.numberCast(int.class, _r.runMethod(false,"GetStaticField",(Object)(RemoteObject.concat(_package,RemoteObject.createImmutable(".R$anim"))),(Object)(_inanimation)));Debug.locals.put("In", _in);
 BA.debugLineNum = 291;BA.debugLine="out = r.GetStaticField(package & \".R$anim\", OutAn";
Debug.ShouldStop(4);
_out = BA.numberCast(int.class, _r.runMethod(false,"GetStaticField",(Object)(RemoteObject.concat(_package,RemoteObject.createImmutable(".R$anim"))),(Object)(_outanimation)));Debug.locals.put("out", _out);
 BA.debugLineNum = 292;BA.debugLine="r.Target = r.GetActivity";
Debug.ShouldStop(8);
_r.setField ("Target",(_r.runMethod(false,"GetActivity",ac_hsef.processBA)));
 BA.debugLineNum = 293;BA.debugLine="r.RunMethod4(\"overridePendingTransition\", Array A";
Debug.ShouldStop(16);
_r.runVoidMethod ("RunMethod4",(Object)(BA.ObjectToString("overridePendingTransition")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_in),(_out)})),(Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.ObjectToString("java.lang.int"),RemoteObject.createImmutable("java.lang.int")})));
 BA.debugLineNum = 294;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}