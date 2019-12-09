package com.it.fome;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class ac_shop_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (ac_shop) ","ac_shop",3,ac_shop.mostCurrent.activityBA,ac_shop.mostCurrent,37);
if (RapidSub.canDelegate("activity_create")) { return com.it.fome.ac_shop.remoteMe.runUserSub(false, "ac_shop","activity_create", _firsttime);}
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _gradient1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.GradientDrawable");
RemoteObject _clrs = null;
RemoteObject _bkcolor = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
RemoteObject _bkcolor_st = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
RemoteObject _pnlb1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _bg = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
RemoteObject _lbl_a = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _pnl_shop = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _mishop = RemoteObject.declareNull("com.it.fome.mi_shop");
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 37;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(16);
 BA.debugLineNum = 40;BA.debugLine="If File.Exists(File.DirInternal,\"instadb.db\")=Fal";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",ac_shop.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(ac_shop.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("instadb.db"))),ac_shop.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 41;BA.debugLine="File.Copy(File.DirAssets,\"instadb.db\",File.DirIn";
Debug.ShouldStop(256);
ac_shop.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(ac_shop.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("instadb.db")),(Object)(ac_shop.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("instadb.db")));
 };
 BA.debugLineNum = 43;BA.debugLine="If sql1.IsInitialized=False Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",ac_shop._sql1.runMethod(true,"IsInitialized"),ac_shop.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 44;BA.debugLine="sql1.Initialize(File.DirInternal,\"instadb.db\",Fa";
Debug.ShouldStop(2048);
ac_shop._sql1.runVoidMethod ("Initialize",(Object)(ac_shop.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("instadb.db")),(Object)(ac_shop.mostCurrent.__c.getField(true,"False")));
 };
 BA.debugLineNum = 55;BA.debugLine="cursor1 = sql1.ExecQuery(\"SELECT * FROM tbl_acc W";
Debug.ShouldStop(4194304);
ac_shop._cursor1.setObject(ac_shop._sql1.runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT * FROM tbl_acc WHERE soich='1' "))));
 BA.debugLineNum = 56;BA.debugLine="Dim i As Int";
Debug.ShouldStop(8388608);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 57;BA.debugLine="For i=0 To cursor1.RowCount-1";
Debug.ShouldStop(16777216);
{
final int step9 = 1;
final int limit9 = RemoteObject.solve(new RemoteObject[] {ac_shop._cursor1.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step9 > 0 && _i.<Integer>get().intValue() <= limit9) || (step9 < 0 && _i.<Integer>get().intValue() >= limit9) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step9))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 58;BA.debugLine="cursor1.Position=i";
Debug.ShouldStop(33554432);
ac_shop._cursor1.runMethod(true,"setPosition",_i);
 BA.debugLineNum = 59;BA.debugLine="i_cookie=cursor1.GetString(\"cookie\")";
Debug.ShouldStop(67108864);
ac_shop.mostCurrent._i_cookie = ac_shop._cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("cookie")));
 BA.debugLineNum = 60;BA.debugLine="i_username=cursor1.GetString(\"username\")";
Debug.ShouldStop(134217728);
ac_shop.mostCurrent._i_username = ac_shop._cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("username")));
 BA.debugLineNum = 61;BA.debugLine="i_pk=cursor1.GetString(\"pk\")";
Debug.ShouldStop(268435456);
ac_shop.mostCurrent._i_pk = ac_shop._cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("pk")));
 BA.debugLineNum = 62;BA.debugLine="i_pic=cursor1.GetString(\"profile_pic_url\")";
Debug.ShouldStop(536870912);
ac_shop.mostCurrent._i_pic = ac_shop._cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("profile_pic_url")));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 65;BA.debugLine="cursor1 = sql1.ExecQuery(\"SELECT * FROM tbl_tele";
Debug.ShouldStop(1);
ac_shop._cursor1.setObject(ac_shop._sql1.runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT * FROM tbl_tele WHERE soich='1'"))));
 BA.debugLineNum = 66;BA.debugLine="Dim i As Int";
Debug.ShouldStop(2);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 67;BA.debugLine="For i=0 To cursor1.RowCount-1";
Debug.ShouldStop(4);
{
final int step18 = 1;
final int limit18 = RemoteObject.solve(new RemoteObject[] {ac_shop._cursor1.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step18 > 0 && _i.<Integer>get().intValue() <= limit18) || (step18 < 0 && _i.<Integer>get().intValue() >= limit18) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step18))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 68;BA.debugLine="cursor1.Position=i";
Debug.ShouldStop(8);
ac_shop._cursor1.runMethod(true,"setPosition",_i);
 BA.debugLineNum = 69;BA.debugLine="userid_t=cursor1.GetString(\"userid\")";
Debug.ShouldStop(16);
ac_shop._userid_t = ac_shop._cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("userid")));
 BA.debugLineNum = 70;BA.debugLine="username_t=cursor1.GetString(\"username\")";
Debug.ShouldStop(32);
ac_shop._username_t = ac_shop._cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("username")));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 72;BA.debugLine="cursor1.Close";
Debug.ShouldStop(128);
ac_shop._cursor1.runVoidMethod ("Close");
 BA.debugLineNum = 74;BA.debugLine="listchats.Initialize";
Debug.ShouldStop(512);
ac_shop._listchats.runVoidMethod ("Initialize");
 BA.debugLineNum = 76;BA.debugLine="Dim Gradient1 As GradientDrawable";
Debug.ShouldStop(2048);
_gradient1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.GradientDrawable");Debug.locals.put("Gradient1", _gradient1);
 BA.debugLineNum = 77;BA.debugLine="Dim Clrs(5) As Int";
Debug.ShouldStop(4096);
_clrs = RemoteObject.createNewArray ("int", new int[] {5}, new Object[]{});Debug.locals.put("Clrs", _clrs);
 BA.debugLineNum = 78;BA.debugLine="Clrs(0) = 0xFFe8eaf6";
Debug.ShouldStop(8192);
_clrs.setArrayElement (BA.numberCast(int.class, 0xffe8eaf6),BA.numberCast(int.class, 0));
 BA.debugLineNum = 79;BA.debugLine="Clrs(1) = 0xFFe8eaf6";
Debug.ShouldStop(16384);
_clrs.setArrayElement (BA.numberCast(int.class, 0xffe8eaf6),BA.numberCast(int.class, 1));
 BA.debugLineNum = 80;BA.debugLine="Clrs(2) = 0xFFe8eaf6";
Debug.ShouldStop(32768);
_clrs.setArrayElement (BA.numberCast(int.class, 0xffe8eaf6),BA.numberCast(int.class, 2));
 BA.debugLineNum = 81;BA.debugLine="Clrs(3) = 0xFF283593";
Debug.ShouldStop(65536);
_clrs.setArrayElement (BA.numberCast(int.class, 0xff283593),BA.numberCast(int.class, 3));
 BA.debugLineNum = 82;BA.debugLine="Clrs(4) = 0xFF283593";
Debug.ShouldStop(131072);
_clrs.setArrayElement (BA.numberCast(int.class, 0xff283593),BA.numberCast(int.class, 4));
 BA.debugLineNum = 84;BA.debugLine="Gradient1.Initialize(\"TOP_BOTTOM\", Clrs)";
Debug.ShouldStop(524288);
_gradient1.runVoidMethod ("Initialize",(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.drawable.GradientDrawable.Orientation"),"TOP_BOTTOM")),(Object)(_clrs));
 BA.debugLineNum = 85;BA.debugLine="Activity.Background=Gradient1";
Debug.ShouldStop(1048576);
ac_shop.mostCurrent._activity.runMethod(false,"setBackground",(_gradient1.getObject()));
 BA.debugLineNum = 87;BA.debugLine="Dim bkcolor As ColorDrawable";
Debug.ShouldStop(4194304);
_bkcolor = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("bkcolor", _bkcolor);
 BA.debugLineNum = 88;BA.debugLine="bkcolor.Initialize2(Colors.White,15,2dip,Colors.L";
Debug.ShouldStop(8388608);
_bkcolor.runVoidMethod ("Initialize2",(Object)(ac_shop.mostCurrent.__c.getField(false,"Colors").getField(true,"White")),(Object)(BA.numberCast(int.class, 15)),(Object)(ac_shop.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))),(Object)(ac_shop.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray")));
 BA.debugLineNum = 89;BA.debugLine="meno.Initialize(\"meno\")";
Debug.ShouldStop(16777216);
ac_shop.mostCurrent._meno.runVoidMethod ("Initialize",ac_shop.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("meno")));
 BA.debugLineNum = 90;BA.debugLine="meno.TextColor=Colors.DarkGray";
Debug.ShouldStop(33554432);
ac_shop.mostCurrent._meno.runMethod(true,"setTextColor",ac_shop.mostCurrent.__c.getField(false,"Colors").getField(true,"DarkGray"));
 BA.debugLineNum = 91;BA.debugLine="meno.TextSize=37";
Debug.ShouldStop(67108864);
ac_shop.mostCurrent._meno.runMethod(true,"setTextSize",BA.numberCast(float.class, 37));
 BA.debugLineNum = 92;BA.debugLine="meno.Background=bkcolor";
Debug.ShouldStop(134217728);
ac_shop.mostCurrent._meno.runMethod(false,"setBackground",(_bkcolor.getObject()));
 BA.debugLineNum = 93;BA.debugLine="meno.Typeface=Typeface.MATERIALICONS";
Debug.ShouldStop(268435456);
ac_shop.mostCurrent._meno.runMethod(false,"setTypeface",ac_shop.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"getMATERIALICONS"));
 BA.debugLineNum = 94;BA.debugLine="meno.Text=Chr(0xE3C7)";
Debug.ShouldStop(536870912);
ac_shop.mostCurrent._meno.runMethod(true,"setText",BA.ObjectToCharSequence(ac_shop.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xe3c7)))));
 BA.debugLineNum = 95;BA.debugLine="meno.Gravity=Gravity.CENTER_HORIZONTAL+Gravity.CE";
Debug.ShouldStop(1073741824);
ac_shop.mostCurrent._meno.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {ac_shop.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL"),ac_shop.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")}, "+",1, 1));
 BA.debugLineNum = 96;BA.debugLine="Activity.AddView(meno,3%x,3%x,12%x,12%x)";
Debug.ShouldStop(-2147483648);
ac_shop.mostCurrent._activity.runVoidMethod ("AddView",(Object)((ac_shop.mostCurrent._meno.getObject())),(Object)(ac_shop.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 3)),ac_shop.mostCurrent.activityBA)),(Object)(ac_shop.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 3)),ac_shop.mostCurrent.activityBA)),(Object)(ac_shop.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 12)),ac_shop.mostCurrent.activityBA)),(Object)(ac_shop.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 12)),ac_shop.mostCurrent.activityBA)));
 BA.debugLineNum = 98;BA.debugLine="pnl_coins.Initialize(\"pnl_coins\")";
Debug.ShouldStop(2);
ac_shop.mostCurrent._pnl_coins.runVoidMethod ("Initialize",ac_shop.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("pnl_coins")));
 BA.debugLineNum = 99;BA.debugLine="Activity.AddView(pnl_coins,50%x,3%x,50%x,12%x)";
Debug.ShouldStop(4);
ac_shop.mostCurrent._activity.runVoidMethod ("AddView",(Object)((ac_shop.mostCurrent._pnl_coins.getObject())),(Object)(ac_shop.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 50)),ac_shop.mostCurrent.activityBA)),(Object)(ac_shop.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 3)),ac_shop.mostCurrent.activityBA)),(Object)(ac_shop.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 50)),ac_shop.mostCurrent.activityBA)),(Object)(ac_shop.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 12)),ac_shop.mostCurrent.activityBA)));
 BA.debugLineNum = 100;BA.debugLine="roundview.Initialize(pnl_coins)";
Debug.ShouldStop(8);
ac_shop.mostCurrent._roundview.runVoidMethod ("Initialize",ac_shop.processBA,(Object)((ac_shop.mostCurrent._pnl_coins.getObject())));
 BA.debugLineNum = 101;BA.debugLine="roundview.CornerRadius_BL=10%x";
Debug.ShouldStop(16);
ac_shop.mostCurrent._roundview.runMethod(true,"setCornerRadius_BL",ac_shop.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),ac_shop.mostCurrent.activityBA));
 BA.debugLineNum = 102;BA.debugLine="roundview.CornerRadius_TL=10%x";
Debug.ShouldStop(32);
ac_shop.mostCurrent._roundview.runMethod(true,"setCornerRadius_TL",ac_shop.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),ac_shop.mostCurrent.activityBA));
 BA.debugLineNum = 103;BA.debugLine="roundview.BackgroundColor=Colors.White";
Debug.ShouldStop(64);
ac_shop.mostCurrent._roundview.runMethod(true,"setBackgroundColor",ac_shop.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 105;BA.debugLine="Dim bkcolor_st As ColorDrawable";
Debug.ShouldStop(256);
_bkcolor_st = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("bkcolor_st", _bkcolor_st);
 BA.debugLineNum = 106;BA.debugLine="bkcolor_st.Initialize2(0xFFC67D00,50,4dip,0x82FFE";
Debug.ShouldStop(512);
_bkcolor_st.runVoidMethod ("Initialize2",(Object)(BA.numberCast(int.class, 0xffc67d00)),(Object)(BA.numberCast(int.class, 50)),(Object)(ac_shop.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4)))),(Object)(BA.numberCast(int.class, 0x82ffe300)));
 BA.debugLineNum = 108;BA.debugLine="Dim pnlb1 As Panel";
Debug.ShouldStop(2048);
_pnlb1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("pnlb1", _pnlb1);
 BA.debugLineNum = 109;BA.debugLine="pnlb1.Initialize(\"\")";
Debug.ShouldStop(4096);
_pnlb1.runVoidMethod ("Initialize",ac_shop.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 110;BA.debugLine="pnlb1.Color=0xFFFFC300";
Debug.ShouldStop(8192);
_pnlb1.runVoidMethod ("setColor",BA.numberCast(int.class, 0xffffc300));
 BA.debugLineNum = 111;BA.debugLine="pnlb1.Background=bkcolor_st";
Debug.ShouldStop(16384);
_pnlb1.runMethod(false,"setBackground",(_bkcolor_st.getObject()));
 BA.debugLineNum = 112;BA.debugLine="pnl_coins.AddView(pnlb1,pnl_coins.Width-11%x,1%x,";
Debug.ShouldStop(32768);
ac_shop.mostCurrent._pnl_coins.runVoidMethod ("AddView",(Object)((_pnlb1.getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {ac_shop.mostCurrent._pnl_coins.runMethod(true,"getWidth"),ac_shop.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 11)),ac_shop.mostCurrent.activityBA)}, "-",1, 1)),(Object)(ac_shop.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 1)),ac_shop.mostCurrent.activityBA)),(Object)(ac_shop.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),ac_shop.mostCurrent.activityBA)),(Object)(RemoteObject.solve(new RemoteObject[] {ac_shop.mostCurrent._pnl_coins.runMethod(true,"getHeight"),ac_shop.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),ac_shop.mostCurrent.activityBA)}, "-",1, 1)));
 BA.debugLineNum = 114;BA.debugLine="lbl_icon.Initialize(\"lbl_icon\")";
Debug.ShouldStop(131072);
ac_shop.mostCurrent._lbl_icon.runVoidMethod ("Initialize",ac_shop.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("lbl_icon")));
 BA.debugLineNum = 115;BA.debugLine="lbl_icon.SetBackgroundImage(LoadBitmap(File.DirAs";
Debug.ShouldStop(262144);
ac_shop.mostCurrent._lbl_icon.runVoidMethod ("SetBackgroundImageNew",(Object)((ac_shop.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(ac_shop.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("coins.png"))).getObject())));
 BA.debugLineNum = 116;BA.debugLine="pnl_coins.AddView(lbl_icon,pnl_coins.Width-9%x,pn";
Debug.ShouldStop(524288);
ac_shop.mostCurrent._pnl_coins.runVoidMethod ("AddView",(Object)((ac_shop.mostCurrent._lbl_icon.getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {ac_shop.mostCurrent._pnl_coins.runMethod(true,"getWidth"),ac_shop.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 9)),ac_shop.mostCurrent.activityBA)}, "-",1, 1)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {ac_shop.mostCurrent._pnl_coins.runMethod(true,"getHeight"),RemoteObject.createImmutable(2),RemoteObject.createImmutable(2)}, "//",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {ac_shop.mostCurrent._pnl_coins.runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {ac_shop.mostCurrent._pnl_coins.runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "/",0, 0))));
 BA.debugLineNum = 118;BA.debugLine="lbl_nums.Initialize(\"lbl_nums\")";
Debug.ShouldStop(2097152);
ac_shop.mostCurrent._lbl_nums.runVoidMethod ("Initialize",ac_shop.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("lbl_nums")));
 BA.debugLineNum = 119;BA.debugLine="lbl_nums.TextColor=Colors.DarkGray";
Debug.ShouldStop(4194304);
ac_shop.mostCurrent._lbl_nums.runMethod(true,"setTextColor",ac_shop.mostCurrent.__c.getField(false,"Colors").getField(true,"DarkGray"));
 BA.debugLineNum = 120;BA.debugLine="lbl_nums.TextSize=20";
Debug.ShouldStop(8388608);
ac_shop.mostCurrent._lbl_nums.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 121;BA.debugLine="lbl_nums.Typeface=Typeface.LoadFromAssets(\"iran_s";
Debug.ShouldStop(16777216);
ac_shop.mostCurrent._lbl_nums.runMethod(false,"setTypeface",ac_shop.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("iran_sans.ttf"))));
 BA.debugLineNum = 122;BA.debugLine="lbl_nums.Text=0&\" سکه\"";
Debug.ShouldStop(33554432);
ac_shop.mostCurrent._lbl_nums.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable(0),RemoteObject.createImmutable(" سکه"))));
 BA.debugLineNum = 123;BA.debugLine="lbl_nums.Gravity=Gravity.CENTER_VERTICAL+Gravity.";
Debug.ShouldStop(67108864);
ac_shop.mostCurrent._lbl_nums.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {ac_shop.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL"),ac_shop.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT")}, "+",1, 1));
 BA.debugLineNum = 124;BA.debugLine="pnl_coins.AddView(lbl_nums,2%x,0,pnl_coins.Width-";
Debug.ShouldStop(134217728);
ac_shop.mostCurrent._pnl_coins.runVoidMethod ("AddView",(Object)((ac_shop.mostCurrent._lbl_nums.getObject())),(Object)(ac_shop.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),ac_shop.mostCurrent.activityBA)),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {ac_shop.mostCurrent._pnl_coins.runMethod(true,"getWidth"),ac_shop.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),ac_shop.mostCurrent.activityBA)}, "-",1, 1)),(Object)(ac_shop.mostCurrent._pnl_coins.runMethod(true,"getHeight")));
 BA.debugLineNum = 126;BA.debugLine="Dim bg As ColorDrawable";
Debug.ShouldStop(536870912);
_bg = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("bg", _bg);
 BA.debugLineNum = 127;BA.debugLine="bg.Initialize2(Colors.White,5dip,2dip,Colors.Ligh";
Debug.ShouldStop(1073741824);
_bg.runVoidMethod ("Initialize2",(Object)(ac_shop.mostCurrent.__c.getField(false,"Colors").getField(true,"White")),(Object)(ac_shop.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))),(Object)(ac_shop.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))),(Object)(ac_shop.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray")));
 BA.debugLineNum = 128;BA.debugLine="pnl_lv.Initialize(\"pnl_lv\")";
Debug.ShouldStop(-2147483648);
ac_shop.mostCurrent._pnl_lv.runVoidMethod ("Initialize",ac_shop.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("pnl_lv")));
 BA.debugLineNum = 129;BA.debugLine="pnl_lv.Background=bg";
Debug.ShouldStop(1);
ac_shop.mostCurrent._pnl_lv.runMethod(false,"setBackground",(_bg.getObject()));
 BA.debugLineNum = 130;BA.debugLine="Activity.AddView(pnl_lv,5%x,12%y,100%x-10%x,90%y-";
Debug.ShouldStop(2);
ac_shop.mostCurrent._activity.runVoidMethod ("AddView",(Object)((ac_shop.mostCurrent._pnl_lv.getObject())),(Object)(ac_shop.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),ac_shop.mostCurrent.activityBA)),(Object)(ac_shop.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 12)),ac_shop.mostCurrent.activityBA)),(Object)(RemoteObject.solve(new RemoteObject[] {ac_shop.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),ac_shop.mostCurrent.activityBA),ac_shop.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),ac_shop.mostCurrent.activityBA)}, "-",1, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {ac_shop.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 90)),ac_shop.mostCurrent.activityBA),ac_shop.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 7)),ac_shop.mostCurrent.activityBA)}, "-",1, 1)));
 BA.debugLineNum = 132;BA.debugLine="Dim lbl_a As Label";
Debug.ShouldStop(8);
_lbl_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl_a", _lbl_a);
 BA.debugLineNum = 133;BA.debugLine="lbl_a.Initialize(\"lbl_a\")";
Debug.ShouldStop(16);
_lbl_a.runVoidMethod ("Initialize",ac_shop.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("lbl_a")));
 BA.debugLineNum = 134;BA.debugLine="lbl_a.TextColor=Colors.DarkGray";
Debug.ShouldStop(32);
_lbl_a.runMethod(true,"setTextColor",ac_shop.mostCurrent.__c.getField(false,"Colors").getField(true,"DarkGray"));
 BA.debugLineNum = 135;BA.debugLine="lbl_a.TextSize=20";
Debug.ShouldStop(64);
_lbl_a.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 136;BA.debugLine="lbl_a.Typeface=Typeface.LoadFromAssets(\"iran_sans";
Debug.ShouldStop(128);
_lbl_a.runMethod(false,"setTypeface",ac_shop.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("iran_sans.ttf"))));
 BA.debugLineNum = 137;BA.debugLine="lbl_a.Text=\"فروشگاه سکه\"";
Debug.ShouldStop(256);
_lbl_a.runMethod(true,"setText",BA.ObjectToCharSequence("فروشگاه سکه"));
 BA.debugLineNum = 138;BA.debugLine="lbl_a.Gravity=Gravity.CENTER_VERTICAL+Gravity.CEN";
Debug.ShouldStop(512);
_lbl_a.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {ac_shop.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL"),ac_shop.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL")}, "+",1, 1));
 BA.debugLineNum = 139;BA.debugLine="pnl_lv.AddView(lbl_a,5%x,0,pnl_lv.Width-10%x,12%x";
Debug.ShouldStop(1024);
ac_shop.mostCurrent._pnl_lv.runVoidMethod ("AddView",(Object)((_lbl_a.getObject())),(Object)(ac_shop.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),ac_shop.mostCurrent.activityBA)),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {ac_shop.mostCurrent._pnl_lv.runMethod(true,"getWidth"),ac_shop.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),ac_shop.mostCurrent.activityBA)}, "-",1, 1)),(Object)(ac_shop.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 12)),ac_shop.mostCurrent.activityBA)));
 BA.debugLineNum = 147;BA.debugLine="Dim pnl_shop As Panel";
Debug.ShouldStop(262144);
_pnl_shop = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("pnl_shop", _pnl_shop);
 BA.debugLineNum = 148;BA.debugLine="pnl_shop.Initialize(\"pnl_shop\")";
Debug.ShouldStop(524288);
_pnl_shop.runVoidMethod ("Initialize",ac_shop.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("pnl_shop")));
 BA.debugLineNum = 149;BA.debugLine="pnl_lv.AddView(pnl_shop,0,lbl_a.Top+lbl_a.Height+";
Debug.ShouldStop(1048576);
ac_shop.mostCurrent._pnl_lv.runVoidMethod ("AddView",(Object)((_pnl_shop.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {_lbl_a.runMethod(true,"getTop"),_lbl_a.runMethod(true,"getHeight"),ac_shop.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),ac_shop.mostCurrent.activityBA)}, "++",2, 1)),(Object)(ac_shop.mostCurrent._pnl_lv.runMethod(true,"getWidth")),(Object)(RemoteObject.solve(new RemoteObject[] {ac_shop.mostCurrent._pnl_lv.runMethod(true,"getHeight"),_lbl_a.runMethod(true,"getTop"),_lbl_a.runMethod(true,"getHeight"),ac_shop.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 3)),ac_shop.mostCurrent.activityBA)}, "---",3, 1)));
 BA.debugLineNum = 151;BA.debugLine="Select typesef";
Debug.ShouldStop(4194304);
switch (BA.switchObjectToInt(ac_shop._typesef,BA.numberCast(int.class, 0),BA.numberCast(int.class, 1))) {
case 0: {
 BA.debugLineNum = 153;BA.debugLine="Dim mishop As MI_shop";
Debug.ShouldStop(16777216);
_mishop = RemoteObject.createNew ("com.it.fome.mi_shop");Debug.locals.put("mishop", _mishop);
 BA.debugLineNum = 154;BA.debugLine="mishop.Initialize(\"mishop\",Me)";
Debug.ShouldStop(33554432);
_mishop.runClassMethod (com.it.fome.mi_shop.class, "_initialize" /*RemoteObject*/ ,ac_shop.mostCurrent.activityBA,(Object)(BA.ObjectToString("mishop")),(Object)(ac_shop.getObject()));
 BA.debugLineNum = 155;BA.debugLine="mishop.type_history=0";
Debug.ShouldStop(67108864);
_mishop.setField ("_type_history" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 156;BA.debugLine="mishop.addpnl(pnl_shop)";
Debug.ShouldStop(134217728);
_mishop.runClassMethod (com.it.fome.mi_shop.class, "_addpnl" /*RemoteObject*/ ,(Object)(_pnl_shop));
 BA.debugLineNum = 157;BA.debugLine="req_igetme(i_pk)";
Debug.ShouldStop(268435456);
_req_igetme(ac_shop.mostCurrent._i_pk);
 break; }
case 1: {
 BA.debugLineNum = 159;BA.debugLine="Dim mishop As MI_shop";
Debug.ShouldStop(1073741824);
_mishop = RemoteObject.createNew ("com.it.fome.mi_shop");Debug.locals.put("mishop", _mishop);
 BA.debugLineNum = 160;BA.debugLine="mishop.Initialize(\"mishop\",Me)";
Debug.ShouldStop(-2147483648);
_mishop.runClassMethod (com.it.fome.mi_shop.class, "_initialize" /*RemoteObject*/ ,ac_shop.mostCurrent.activityBA,(Object)(BA.ObjectToString("mishop")),(Object)(ac_shop.getObject()));
 BA.debugLineNum = 161;BA.debugLine="mishop.type_history=1";
Debug.ShouldStop(1);
_mishop.setField ("_type_history" /*RemoteObject*/ ,BA.numberCast(int.class, 1));
 BA.debugLineNum = 162;BA.debugLine="mishop.addpnl(pnl_shop)";
Debug.ShouldStop(2);
_mishop.runClassMethod (com.it.fome.mi_shop.class, "_addpnl" /*RemoteObject*/ ,(Object)(_pnl_shop));
 BA.debugLineNum = 163;BA.debugLine="req_getme(userid_t)";
Debug.ShouldStop(4);
_req_getme(ac_shop._userid_t);
 break; }
}
;
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
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (ac_shop) ","ac_shop",3,ac_shop.mostCurrent.activityBA,ac_shop.mostCurrent,175);
if (RapidSub.canDelegate("activity_pause")) { return com.it.fome.ac_shop.remoteMe.runUserSub(false, "ac_shop","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 175;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 177;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("Activity_Resume (ac_shop) ","ac_shop",3,ac_shop.mostCurrent.activityBA,ac_shop.mostCurrent,171);
if (RapidSub.canDelegate("activity_resume")) { return com.it.fome.ac_shop.remoteMe.runUserSub(false, "ac_shop","activity_resume");}
 BA.debugLineNum = 171;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(1024);
 BA.debugLineNum = 173;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 18;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 19;BA.debugLine="Dim meno As Label";
ac_shop.mostCurrent._meno = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Dim pnl_coins As Panel";
ac_shop.mostCurrent._pnl_coins = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Dim lbl_icon ,lbl_nums As Label";
ac_shop.mostCurrent._lbl_icon = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
ac_shop.mostCurrent._lbl_nums = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Dim roundview As MC7RoundView";
ac_shop.mostCurrent._roundview = RemoteObject.createNew ("com.flycoroundview.mc7.MC7RoundView");
 //BA.debugLineNum = 23;BA.debugLine="Dim LV As Hitex_LayoutView";
ac_shop.mostCurrent._lv = RemoteObject.createNew ("wir.hitex.recycler.Hitex_LayoutView");
 //BA.debugLineNum = 24;BA.debugLine="Dim glide As Hitex_Glide";
ac_shop.mostCurrent._glide = RemoteObject.createNew ("com.hitex_glide.Hitex_Glide");
 //BA.debugLineNum = 26;BA.debugLine="Dim pnl_lv As Panel";
ac_shop.mostCurrent._pnl_lv = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Dim pnl_dilogs As Panel";
ac_shop.mostCurrent._pnl_dilogs = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Dim username_target,title_target As String";
ac_shop.mostCurrent._username_target = RemoteObject.createImmutable("");
ac_shop.mostCurrent._title_target = RemoteObject.createImmutable("");
 //BA.debugLineNum = 29;BA.debugLine="Dim id_target ,idchannel_target As String";
ac_shop.mostCurrent._id_target = RemoteObject.createImmutable("");
ac_shop.mostCurrent._idchannel_target = RemoteObject.createImmutable("");
 //BA.debugLineNum = 30;BA.debugLine="Dim img_target As String";
ac_shop.mostCurrent._img_target = RemoteObject.createImmutable("");
 //BA.debugLineNum = 32;BA.debugLine="Dim i_username ,i_pk,i_cookie,i_pic As String";
ac_shop.mostCurrent._i_username = RemoteObject.createImmutable("");
ac_shop.mostCurrent._i_pk = RemoteObject.createImmutable("");
ac_shop.mostCurrent._i_cookie = RemoteObject.createImmutable("");
ac_shop.mostCurrent._i_pic = RemoteObject.createImmutable("");
 //BA.debugLineNum = 33;BA.debugLine="Dim mimeno As mi_meno";
ac_shop.mostCurrent._mimeno = RemoteObject.createNew ("com.it.fome.mi_meno");
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _meno_click() throws Exception{
try {
		Debug.PushSubsStack("meno_Click (ac_shop) ","ac_shop",3,ac_shop.mostCurrent.activityBA,ac_shop.mostCurrent,307);
if (RapidSub.canDelegate("meno_click")) { return com.it.fome.ac_shop.remoteMe.runUserSub(false, "ac_shop","meno_click");}
 BA.debugLineNum = 307;BA.debugLine="Sub meno_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 308;BA.debugLine="mimeno.Initialize(\"mimeno\",Me)";
Debug.ShouldStop(524288);
ac_shop.mostCurrent._mimeno.runClassMethod (com.it.fome.mi_meno.class, "_initialize" /*RemoteObject*/ ,ac_shop.mostCurrent.activityBA,(Object)(BA.ObjectToString("mimeno")),(Object)(ac_shop.getObject()));
 BA.debugLineNum = 309;BA.debugLine="mimeno.addpnl";
Debug.ShouldStop(1048576);
ac_shop.mostCurrent._mimeno.runClassMethod (com.it.fome.mi_meno.class, "_addpnl" /*RemoteObject*/ );
 BA.debugLineNum = 310;BA.debugLine="mimeno.open";
Debug.ShouldStop(2097152);
ac_shop.mostCurrent._mimeno.runClassMethod (com.it.fome.mi_meno.class, "_open" /*RemoteObject*/ );
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
public static RemoteObject  _mishop_newcointele(RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("mishop_newcointele (ac_shop) ","ac_shop",3,ac_shop.mostCurrent.activityBA,ac_shop.mostCurrent,296);
if (RapidSub.canDelegate("mishop_newcointele")) { return com.it.fome.ac_shop.remoteMe.runUserSub(false, "ac_shop","mishop_newcointele", _value);}
RemoteObject _n_coins = RemoteObject.createImmutable(0L);
Debug.locals.put("value", _value);
 BA.debugLineNum = 296;BA.debugLine="Sub mishop_newcointele(value As String)";
Debug.ShouldStop(128);
 BA.debugLineNum = 297;BA.debugLine="Log(\"coin : \"&value)";
Debug.ShouldStop(256);
ac_shop.mostCurrent.__c.runVoidMethod ("LogImpl","64325377",RemoteObject.concat(RemoteObject.createImmutable("coin : "),_value),0);
 BA.debugLineNum = 298;BA.debugLine="Dim n_coins=value As Long";
Debug.ShouldStop(512);
_n_coins = BA.numberCast(long.class, _value);Debug.locals.put("n_coins", _n_coins);Debug.locals.put("n_coins", _n_coins);
 BA.debugLineNum = 299;BA.debugLine="If n_coins>100 Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean(">",_n_coins,BA.numberCast(double.class, 100))) { 
 BA.debugLineNum = 300;BA.debugLine="lbl_nums.Text=\"سکه \"&NumberFormat(n_coins,3,0)";
Debug.ShouldStop(2048);
ac_shop.mostCurrent._lbl_nums.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("سکه "),ac_shop.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _n_coins)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 0))))));
 }else {
 BA.debugLineNum = 302;BA.debugLine="lbl_nums.Text=\"سکه \"&n_coins";
Debug.ShouldStop(8192);
ac_shop.mostCurrent._lbl_nums.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("سکه "),_n_coins)));
 };
 BA.debugLineNum = 304;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("prfn_onPostStringErrorListener (ac_shop) ","ac_shop",3,ac_shop.mostCurrent.activityBA,ac_shop.mostCurrent,227);
if (RapidSub.canDelegate("prfn_onpoststringerrorlistener")) { return com.it.fome.ac_shop.remoteMe.runUserSub(false, "ac_shop","prfn_onpoststringerrorlistener", _error, _tag);}
Debug.locals.put("Error", _error);
Debug.locals.put("Tag", _tag);
 BA.debugLineNum = 227;BA.debugLine="Sub prfn_onPostStringErrorListener(Error As Respon";
Debug.ShouldStop(4);
 BA.debugLineNum = 229;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(16);
ac_shop.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 230;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
		Debug.PushSubsStack("prfn_onPostStringOkListener (ac_shop) ","ac_shop",3,ac_shop.mostCurrent.activityBA,ac_shop.mostCurrent,232);
if (RapidSub.canDelegate("prfn_onpoststringoklistener")) { return com.it.fome.ac_shop.remoteMe.runUserSub(false, "ac_shop","prfn_onpoststringoklistener", _result, _tag);}
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
 BA.debugLineNum = 232;BA.debugLine="Sub prfn_onPostStringOkListener(Result As String";
Debug.ShouldStop(128);
 BA.debugLineNum = 234;BA.debugLine="Select Tag";
Debug.ShouldStop(512);
switch (BA.switchObjectToInt(_tag,BA.ObjectToString("iuser"),BA.ObjectToString("igetinsta"),BA.ObjectToString("getinsta"))) {
case 0: {
 BA.debugLineNum = 236;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(2048);
ac_shop.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 237;BA.debugLine="Log(Result)";
Debug.ShouldStop(4096);
ac_shop.mostCurrent.__c.runVoidMethod ("LogImpl","64259845",_result,0);
 break; }
case 1: {
 BA.debugLineNum = 239;BA.debugLine="Log(Result)";
Debug.ShouldStop(16384);
ac_shop.mostCurrent.__c.runVoidMethod ("LogImpl","64259847",_result,0);
 BA.debugLineNum = 240;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(32768);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 241;BA.debugLine="parser.Initialize(Result)";
Debug.ShouldStop(65536);
_parser.runVoidMethod ("Initialize",(Object)(_result));
 BA.debugLineNum = 242;BA.debugLine="Dim root As List = parser.NextArray";
Debug.ShouldStop(131072);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_root = _parser.runMethod(false,"NextArray");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 243;BA.debugLine="For Each colroot As Map In root";
Debug.ShouldStop(262144);
_colroot = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group10 = _root;
final int groupLen10 = group10.runMethod(true,"getSize").<Integer>get()
;int index10 = 0;
;
for (; index10 < groupLen10;index10++){
_colroot.setObject(group10.runMethod(false,"Get",index10));
Debug.locals.put("colroot", _colroot);
 BA.debugLineNum = 244;BA.debugLine="Dim Result As String = colroot.Get(\"result\")";
Debug.ShouldStop(524288);
_result = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("result")))));Debug.locals.put("Result", _result);Debug.locals.put("Result", _result);
 BA.debugLineNum = 245;BA.debugLine="Dim c_m As String = colroot.Get(\"c_m\")";
Debug.ShouldStop(1048576);
_c_m = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("c_m")))));Debug.locals.put("c_m", _c_m);Debug.locals.put("c_m", _c_m);
 BA.debugLineNum = 246;BA.debugLine="Dim uid As String = colroot.Get(\"uid\")";
Debug.ShouldStop(2097152);
_uid = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("uid")))));Debug.locals.put("uid", _uid);Debug.locals.put("uid", _uid);
 BA.debugLineNum = 247;BA.debugLine="Dim id As String = colroot.Get(\"id\")";
Debug.ShouldStop(4194304);
_id = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 248;BA.debugLine="Dim c_f As String = colroot.Get(\"c_f\")";
Debug.ShouldStop(8388608);
_c_f = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("c_f")))));Debug.locals.put("c_f", _c_f);Debug.locals.put("c_f", _c_f);
 BA.debugLineNum = 249;BA.debugLine="Dim pic As String = colroot.Get(\"pic\")";
Debug.ShouldStop(16777216);
_pic = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("pic")))));Debug.locals.put("pic", _pic);Debug.locals.put("pic", _pic);
 BA.debugLineNum = 250;BA.debugLine="Dim userid As String = colroot.Get(\"userid\")";
Debug.ShouldStop(33554432);
_userid = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("userid")))));Debug.locals.put("userid", _userid);Debug.locals.put("userid", _userid);
 BA.debugLineNum = 251;BA.debugLine="Dim username As String = colroot.Get(\"username";
Debug.ShouldStop(67108864);
_username = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("username")))));Debug.locals.put("username", _username);Debug.locals.put("username", _username);
 BA.debugLineNum = 252;BA.debugLine="Log(c_f)";
Debug.ShouldStop(134217728);
ac_shop.mostCurrent.__c.runVoidMethod ("LogImpl","64259860",_c_f,0);
 BA.debugLineNum = 253;BA.debugLine="Dim n_coins=c_m As Long";
Debug.ShouldStop(268435456);
_n_coins = BA.numberCast(long.class, _c_m);Debug.locals.put("n_coins", _n_coins);Debug.locals.put("n_coins", _n_coins);
 BA.debugLineNum = 254;BA.debugLine="If n_coins>100 Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean(">",_n_coins,BA.numberCast(double.class, 100))) { 
 BA.debugLineNum = 255;BA.debugLine="lbl_nums.Text=\"سکه \"&NumberFormat(c_m,3,0)";
Debug.ShouldStop(1073741824);
ac_shop.mostCurrent._lbl_nums.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("سکه "),ac_shop.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _c_m)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 0))))));
 }else {
 BA.debugLineNum = 257;BA.debugLine="lbl_nums.Text=\"سکه \"&c_m";
Debug.ShouldStop(1);
ac_shop.mostCurrent._lbl_nums.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("سکه "),_c_m)));
 };
 BA.debugLineNum = 261;BA.debugLine="sql1.ExecNonQuery(\"UPDATE tbl_coin set cm='\"&c";
Debug.ShouldStop(16);
ac_shop._sql1.runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE tbl_coin set cm='"),_c_m,RemoteObject.createImmutable("',cf='"),_c_f,RemoteObject.createImmutable("' WHERE userid='"),ac_shop.mostCurrent._i_pk,RemoteObject.createImmutable("' "))));
 }
}Debug.locals.put("colroot", _colroot);
;
 break; }
case 2: {
 BA.debugLineNum = 265;BA.debugLine="Log(Result)";
Debug.ShouldStop(256);
ac_shop.mostCurrent.__c.runVoidMethod ("LogImpl","64259873",_result,0);
 BA.debugLineNum = 266;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(512);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 267;BA.debugLine="parser.Initialize(Result)";
Debug.ShouldStop(1024);
_parser.runVoidMethod ("Initialize",(Object)(_result));
 BA.debugLineNum = 268;BA.debugLine="Dim root As List = parser.NextArray";
Debug.ShouldStop(2048);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_root = _parser.runMethod(false,"NextArray");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 269;BA.debugLine="For Each colroot As Map In root";
Debug.ShouldStop(4096);
_colroot = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group33 = _root;
final int groupLen33 = group33.runMethod(true,"getSize").<Integer>get()
;int index33 = 0;
;
for (; index33 < groupLen33;index33++){
_colroot.setObject(group33.runMethod(false,"Get",index33));
Debug.locals.put("colroot", _colroot);
 BA.debugLineNum = 270;BA.debugLine="Dim Result As String = colroot.Get(\"result\")";
Debug.ShouldStop(8192);
_result = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("result")))));Debug.locals.put("Result", _result);Debug.locals.put("Result", _result);
 BA.debugLineNum = 271;BA.debugLine="Dim c_m As String = colroot.Get(\"c_m\")";
Debug.ShouldStop(16384);
_c_m = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("c_m")))));Debug.locals.put("c_m", _c_m);Debug.locals.put("c_m", _c_m);
 BA.debugLineNum = 272;BA.debugLine="Dim uid As String = colroot.Get(\"uid\")";
Debug.ShouldStop(32768);
_uid = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("uid")))));Debug.locals.put("uid", _uid);Debug.locals.put("uid", _uid);
 BA.debugLineNum = 273;BA.debugLine="Dim first_last As String = colroot.Get(\"first_";
Debug.ShouldStop(65536);
_first_last = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("first_last")))));Debug.locals.put("first_last", _first_last);Debug.locals.put("first_last", _first_last);
 BA.debugLineNum = 274;BA.debugLine="Dim id As String = colroot.Get(\"id\")";
Debug.ShouldStop(131072);
_id = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 275;BA.debugLine="Dim userid As String = colroot.Get(\"userid\")";
Debug.ShouldStop(262144);
_userid = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("userid")))));Debug.locals.put("userid", _userid);Debug.locals.put("userid", _userid);
 BA.debugLineNum = 276;BA.debugLine="Dim username As String = colroot.Get(\"username";
Debug.ShouldStop(524288);
_username = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("username")))));Debug.locals.put("username", _username);Debug.locals.put("username", _username);
 BA.debugLineNum = 277;BA.debugLine="Dim c_ch As String = colroot.Get(\"c_ch\")";
Debug.ShouldStop(1048576);
_c_ch = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("c_ch")))));Debug.locals.put("c_ch", _c_ch);Debug.locals.put("c_ch", _c_ch);
 BA.debugLineNum = 279;BA.debugLine="Log(c_m)";
Debug.ShouldStop(4194304);
ac_shop.mostCurrent.__c.runVoidMethod ("LogImpl","64259887",_c_m,0);
 BA.debugLineNum = 280;BA.debugLine="Dim n_coins=c_m As Long";
Debug.ShouldStop(8388608);
_n_coins = BA.numberCast(long.class, _c_m);Debug.locals.put("n_coins", _n_coins);Debug.locals.put("n_coins", _n_coins);
 BA.debugLineNum = 281;BA.debugLine="If n_coins>100 Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean(">",_n_coins,BA.numberCast(double.class, 100))) { 
 BA.debugLineNum = 282;BA.debugLine="lbl_nums.Text=\"سکه \"&NumberFormat(c_m,3,0)";
Debug.ShouldStop(33554432);
ac_shop.mostCurrent._lbl_nums.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("سکه "),ac_shop.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _c_m)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 0))))));
 }else {
 BA.debugLineNum = 284;BA.debugLine="lbl_nums.Text=\"سکه \"&c_m";
Debug.ShouldStop(134217728);
ac_shop.mostCurrent._lbl_nums.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("سکه "),_c_m)));
 };
 BA.debugLineNum = 288;BA.debugLine="sql1.ExecNonQuery(\"UPDATE tbl_coin set cm='\"&c";
Debug.ShouldStop(-2147483648);
ac_shop._sql1.runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE tbl_coin set cm='"),_c_m,RemoteObject.createImmutable("',cf='"),_c_ch,RemoteObject.createImmutable("' WHERE userid='"),ac_shop._userid_t,RemoteObject.createImmutable("' "))));
 }
}Debug.locals.put("colroot", _colroot);
;
 break; }
}
;
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
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Private listchats As List";
ac_shop._listchats = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 9;BA.debugLine="Private sql1 As SQL";
ac_shop._sql1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL");
 //BA.debugLineNum = 10;BA.debugLine="Private cursor1 As Cursor";
ac_shop._cursor1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
 //BA.debugLineNum = 11;BA.debugLine="Private username_t ,userid_t As String";
ac_shop._username_t = RemoteObject.createImmutable("");
ac_shop._userid_t = RemoteObject.createImmutable("");
 //BA.debugLineNum = 12;BA.debugLine="Private chatid As String";
ac_shop._chatid = RemoteObject.createImmutable("");
 //BA.debugLineNum = 14;BA.debugLine="Dim typesef As Int";
ac_shop._typesef = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _req_getme(RemoteObject _userid) throws Exception{
try {
		Debug.PushSubsStack("req_getme (ac_shop) ","ac_shop",3,ac_shop.mostCurrent.activityBA,ac_shop.mostCurrent,191);
if (RapidSub.canDelegate("req_getme")) { return com.it.fome.ac_shop.remoteMe.runUserSub(false, "ac_shop","req_getme", _userid);}
RemoteObject _prfn = RemoteObject.declareNull("com.reza.sh.fastnet.Fastnet");
RemoteObject _post = RemoteObject.declareNull("com.reza.sh.fastnet.PostRequestRaper");
Debug.locals.put("userid", _userid);
 BA.debugLineNum = 191;BA.debugLine="Sub req_getme(userid As String)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 192;BA.debugLine="Dim prfn As PersianFastNetwork";
Debug.ShouldStop(-2147483648);
_prfn = RemoteObject.createNew ("com.reza.sh.fastnet.Fastnet");Debug.locals.put("prfn", _prfn);
 BA.debugLineNum = 193;BA.debugLine="prfn.initialize(\"prfn\")";
Debug.ShouldStop(1);
_prfn.runVoidMethod ("initialize",ac_shop.processBA,(Object)(RemoteObject.createImmutable("prfn")));
 BA.debugLineNum = 195;BA.debugLine="Dim post As PostRequest";
Debug.ShouldStop(4);
_post = RemoteObject.createNew ("com.reza.sh.fastnet.PostRequestRaper");Debug.locals.put("post", _post);
 BA.debugLineNum = 196;BA.debugLine="post=prfn.BuildPostQuery(\"http://filework.ir/INST";
Debug.ShouldStop(8);
_post = _prfn.runMethod(false,"BuildPostQuery",(Object)(BA.ObjectToString("http://filework.ir/INSTAFOLLOW/api/req.php")),(Object)(RemoteObject.createImmutable("getinsta")));Debug.locals.put("post", _post);
 BA.debugLineNum = 198;BA.debugLine="post.addHeder(\"User-Agent\",\"Dalvik/1.6.0 (Linux;";
Debug.ShouldStop(32);
_post.runVoidMethod ("addHeder",(Object)(BA.ObjectToString("User-Agent")),(Object)(RemoteObject.createImmutable("Dalvik/1.6.0 (Linux; U; Android 4.4.4; SM-A700FD Build/KTU84P)")));
 BA.debugLineNum = 200;BA.debugLine="post.addParametrs(\"ui\",\"1\")";
Debug.ShouldStop(128);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("ui")),(Object)(RemoteObject.createImmutable("1")));
 BA.debugLineNum = 201;BA.debugLine="post.addParametrs(\"userid\",userid_t)";
Debug.ShouldStop(256);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("userid")),(Object)(ac_shop._userid_t));
 BA.debugLineNum = 203;BA.debugLine="post.addParametrs(\"req\",\"get_acct\")";
Debug.ShouldStop(1024);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("req")),(Object)(RemoteObject.createImmutable("get_acct")));
 BA.debugLineNum = 206;BA.debugLine="post.executRequestAsString";
Debug.ShouldStop(8192);
_post.runVoidMethod ("executRequestAsString");
 BA.debugLineNum = 207;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("req_igetme (ac_shop) ","ac_shop",3,ac_shop.mostCurrent.activityBA,ac_shop.mostCurrent,209);
if (RapidSub.canDelegate("req_igetme")) { return com.it.fome.ac_shop.remoteMe.runUserSub(false, "ac_shop","req_igetme", _userid);}
RemoteObject _prfn = RemoteObject.declareNull("com.reza.sh.fastnet.Fastnet");
RemoteObject _post = RemoteObject.declareNull("com.reza.sh.fastnet.PostRequestRaper");
Debug.locals.put("userid", _userid);
 BA.debugLineNum = 209;BA.debugLine="Sub req_igetme(userid As String)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 210;BA.debugLine="Dim prfn As PersianFastNetwork";
Debug.ShouldStop(131072);
_prfn = RemoteObject.createNew ("com.reza.sh.fastnet.Fastnet");Debug.locals.put("prfn", _prfn);
 BA.debugLineNum = 211;BA.debugLine="prfn.initialize(\"prfn\")";
Debug.ShouldStop(262144);
_prfn.runVoidMethod ("initialize",ac_shop.processBA,(Object)(RemoteObject.createImmutable("prfn")));
 BA.debugLineNum = 213;BA.debugLine="Dim post As PostRequest";
Debug.ShouldStop(1048576);
_post = RemoteObject.createNew ("com.reza.sh.fastnet.PostRequestRaper");Debug.locals.put("post", _post);
 BA.debugLineNum = 214;BA.debugLine="post=prfn.BuildPostQuery(\"http://filework.ir/INST";
Debug.ShouldStop(2097152);
_post = _prfn.runMethod(false,"BuildPostQuery",(Object)(BA.ObjectToString("http://filework.ir/INSTAFOLLOW/api/req.php")),(Object)(RemoteObject.createImmutable("igetinsta")));Debug.locals.put("post", _post);
 BA.debugLineNum = 216;BA.debugLine="post.addHeder(\"User-Agent\",\"Dalvik/1.6.0 (Linux;";
Debug.ShouldStop(8388608);
_post.runVoidMethod ("addHeder",(Object)(BA.ObjectToString("User-Agent")),(Object)(RemoteObject.createImmutable("Dalvik/1.6.0 (Linux; U; Android 4.4.4; SM-A700FD Build/KTU84P)")));
 BA.debugLineNum = 218;BA.debugLine="post.addParametrs(\"ui\",\"1\")";
Debug.ShouldStop(33554432);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("ui")),(Object)(RemoteObject.createImmutable("1")));
 BA.debugLineNum = 219;BA.debugLine="post.addParametrs(\"userid\",i_pk)";
Debug.ShouldStop(67108864);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("userid")),(Object)(ac_shop.mostCurrent._i_pk));
 BA.debugLineNum = 221;BA.debugLine="post.addParametrs(\"req\",\"get_acci\")";
Debug.ShouldStop(268435456);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("req")),(Object)(RemoteObject.createImmutable("get_acci")));
 BA.debugLineNum = 224;BA.debugLine="post.executRequestAsString";
Debug.ShouldStop(-2147483648);
_post.runVoidMethod ("executRequestAsString");
 BA.debugLineNum = 225;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
		Debug.PushSubsStack("SetAnimation (ac_shop) ","ac_shop",3,ac_shop.mostCurrent.activityBA,ac_shop.mostCurrent,179);
if (RapidSub.canDelegate("setanimation")) { return com.it.fome.ac_shop.remoteMe.runUserSub(false, "ac_shop","setanimation", _inanimation, _outanimation);}
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
RemoteObject _package = RemoteObject.createImmutable("");
RemoteObject _in = RemoteObject.createImmutable(0);
RemoteObject _out = RemoteObject.createImmutable(0);
Debug.locals.put("InAnimation", _inanimation);
Debug.locals.put("OutAnimation", _outanimation);
 BA.debugLineNum = 179;BA.debugLine="Sub SetAnimation(InAnimation As String, OutAnimati";
Debug.ShouldStop(262144);
 BA.debugLineNum = 180;BA.debugLine="Dim r As Reflector";
Debug.ShouldStop(524288);
_r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("r", _r);
 BA.debugLineNum = 181;BA.debugLine="Dim package As String";
Debug.ShouldStop(1048576);
_package = RemoteObject.createImmutable("");Debug.locals.put("package", _package);
 BA.debugLineNum = 182;BA.debugLine="Dim In, out As Int";
Debug.ShouldStop(2097152);
_in = RemoteObject.createImmutable(0);Debug.locals.put("In", _in);
_out = RemoteObject.createImmutable(0);Debug.locals.put("out", _out);
 BA.debugLineNum = 183;BA.debugLine="package = r.GetStaticField(\"anywheresoftware.b4a.";
Debug.ShouldStop(4194304);
_package = BA.ObjectToString(_r.runMethod(false,"GetStaticField",(Object)(BA.ObjectToString("anywheresoftware.b4a.BA")),(Object)(RemoteObject.createImmutable("packageName"))));Debug.locals.put("package", _package);
 BA.debugLineNum = 184;BA.debugLine="In = r.GetStaticField(package & \".R$anim\", InAnim";
Debug.ShouldStop(8388608);
_in = BA.numberCast(int.class, _r.runMethod(false,"GetStaticField",(Object)(RemoteObject.concat(_package,RemoteObject.createImmutable(".R$anim"))),(Object)(_inanimation)));Debug.locals.put("In", _in);
 BA.debugLineNum = 185;BA.debugLine="out = r.GetStaticField(package & \".R$anim\", OutAn";
Debug.ShouldStop(16777216);
_out = BA.numberCast(int.class, _r.runMethod(false,"GetStaticField",(Object)(RemoteObject.concat(_package,RemoteObject.createImmutable(".R$anim"))),(Object)(_outanimation)));Debug.locals.put("out", _out);
 BA.debugLineNum = 186;BA.debugLine="r.Target = r.GetActivity";
Debug.ShouldStop(33554432);
_r.setField ("Target",(_r.runMethod(false,"GetActivity",ac_shop.processBA)));
 BA.debugLineNum = 187;BA.debugLine="r.RunMethod4(\"overridePendingTransition\", Array A";
Debug.ShouldStop(67108864);
_r.runVoidMethod ("RunMethod4",(Object)(BA.ObjectToString("overridePendingTransition")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_in),(_out)})),(Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.ObjectToString("java.lang.int"),RemoteObject.createImmutable("java.lang.int")})));
 BA.debugLineNum = 188;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}