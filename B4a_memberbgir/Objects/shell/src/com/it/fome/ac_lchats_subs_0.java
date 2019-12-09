package com.it.fome;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class ac_lchats_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (ac_lchats) ","ac_lchats",8,ac_lchats.mostCurrent.activityBA,ac_lchats.mostCurrent,37);
if (RapidSub.canDelegate("activity_create")) { return com.it.fome.ac_lchats.remoteMe.runUserSub(false, "ac_lchats","activity_create", _firsttime);}
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _gradient1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.GradientDrawable");
RemoteObject _clrs = null;
RemoteObject _bkcolor = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
RemoteObject _bkcolor_st = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
RemoteObject _pnlb1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _bg = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
RemoteObject _lbl_a = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _lbl_addchannel = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 37;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(16);
 BA.debugLineNum = 41;BA.debugLine="If File.Exists(File.DirInternal,\"instadb.db\")=Fal";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",ac_lchats.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(ac_lchats.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("instadb.db"))),ac_lchats.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 42;BA.debugLine="File.Copy(File.DirAssets,\"instadb.db\",File.DirIn";
Debug.ShouldStop(512);
ac_lchats.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(ac_lchats.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("instadb.db")),(Object)(ac_lchats.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("instadb.db")));
 };
 BA.debugLineNum = 44;BA.debugLine="If sql1.IsInitialized=False Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",ac_lchats._sql1.runMethod(true,"IsInitialized"),ac_lchats.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 45;BA.debugLine="sql1.Initialize(File.DirInternal,\"instadb.db\",Fa";
Debug.ShouldStop(4096);
ac_lchats._sql1.runVoidMethod ("Initialize",(Object)(ac_lchats.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("instadb.db")),(Object)(ac_lchats.mostCurrent.__c.getField(true,"False")));
 };
 BA.debugLineNum = 57;BA.debugLine="cursor1 = sql1.ExecQuery(\"SELECT * FROM tbl_tele";
Debug.ShouldStop(16777216);
ac_lchats._cursor1.setObject(ac_lchats._sql1.runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT * FROM tbl_tele WHERE soich='1'"))));
 BA.debugLineNum = 58;BA.debugLine="Dim i As Int";
Debug.ShouldStop(33554432);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 59;BA.debugLine="For i=0 To cursor1.RowCount-1";
Debug.ShouldStop(67108864);
{
final int step9 = 1;
final int limit9 = RemoteObject.solve(new RemoteObject[] {ac_lchats._cursor1.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step9 > 0 && _i.<Integer>get().intValue() <= limit9) || (step9 < 0 && _i.<Integer>get().intValue() >= limit9) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step9))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 60;BA.debugLine="cursor1.Position=i";
Debug.ShouldStop(134217728);
ac_lchats._cursor1.runMethod(true,"setPosition",_i);
 BA.debugLineNum = 61;BA.debugLine="userid_t=cursor1.GetString(\"userid\")";
Debug.ShouldStop(268435456);
ac_lchats._userid_t = ac_lchats._cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("userid")));
 BA.debugLineNum = 62;BA.debugLine="username_t=cursor1.GetString(\"username\")";
Debug.ShouldStop(536870912);
ac_lchats._username_t = ac_lchats._cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("username")));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 64;BA.debugLine="cursor1.Close";
Debug.ShouldStop(-2147483648);
ac_lchats._cursor1.runVoidMethod ("Close");
 BA.debugLineNum = 66;BA.debugLine="listchats.Initialize";
Debug.ShouldStop(2);
ac_lchats._listchats.runVoidMethod ("Initialize");
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
ac_lchats.mostCurrent._activity.runMethod(false,"setBackground",(_gradient1.getObject()));
 BA.debugLineNum = 79;BA.debugLine="Dim bkcolor As ColorDrawable";
Debug.ShouldStop(16384);
_bkcolor = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("bkcolor", _bkcolor);
 BA.debugLineNum = 80;BA.debugLine="bkcolor.Initialize2(Colors.White,15,2dip,Colors.L";
Debug.ShouldStop(32768);
_bkcolor.runVoidMethod ("Initialize2",(Object)(ac_lchats.mostCurrent.__c.getField(false,"Colors").getField(true,"White")),(Object)(BA.numberCast(int.class, 15)),(Object)(ac_lchats.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))),(Object)(ac_lchats.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray")));
 BA.debugLineNum = 81;BA.debugLine="meno.Initialize(\"meno\")";
Debug.ShouldStop(65536);
ac_lchats.mostCurrent._meno.runVoidMethod ("Initialize",ac_lchats.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("meno")));
 BA.debugLineNum = 82;BA.debugLine="meno.TextColor=Colors.DarkGray";
Debug.ShouldStop(131072);
ac_lchats.mostCurrent._meno.runMethod(true,"setTextColor",ac_lchats.mostCurrent.__c.getField(false,"Colors").getField(true,"DarkGray"));
 BA.debugLineNum = 83;BA.debugLine="meno.TextSize=37";
Debug.ShouldStop(262144);
ac_lchats.mostCurrent._meno.runMethod(true,"setTextSize",BA.numberCast(float.class, 37));
 BA.debugLineNum = 84;BA.debugLine="meno.Background=bkcolor";
Debug.ShouldStop(524288);
ac_lchats.mostCurrent._meno.runMethod(false,"setBackground",(_bkcolor.getObject()));
 BA.debugLineNum = 85;BA.debugLine="meno.Typeface=Typeface.MATERIALICONS";
Debug.ShouldStop(1048576);
ac_lchats.mostCurrent._meno.runMethod(false,"setTypeface",ac_lchats.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"getMATERIALICONS"));
 BA.debugLineNum = 86;BA.debugLine="meno.Text=Chr(0xE3C7)";
Debug.ShouldStop(2097152);
ac_lchats.mostCurrent._meno.runMethod(true,"setText",BA.ObjectToCharSequence(ac_lchats.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xe3c7)))));
 BA.debugLineNum = 87;BA.debugLine="meno.Gravity=Gravity.CENTER_HORIZONTAL+Gravity.CE";
Debug.ShouldStop(4194304);
ac_lchats.mostCurrent._meno.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {ac_lchats.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL"),ac_lchats.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")}, "+",1, 1));
 BA.debugLineNum = 88;BA.debugLine="Activity.AddView(meno,3%x,3%x,12%x,12%x)";
Debug.ShouldStop(8388608);
ac_lchats.mostCurrent._activity.runVoidMethod ("AddView",(Object)((ac_lchats.mostCurrent._meno.getObject())),(Object)(ac_lchats.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 3)),ac_lchats.mostCurrent.activityBA)),(Object)(ac_lchats.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 3)),ac_lchats.mostCurrent.activityBA)),(Object)(ac_lchats.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 12)),ac_lchats.mostCurrent.activityBA)),(Object)(ac_lchats.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 12)),ac_lchats.mostCurrent.activityBA)));
 BA.debugLineNum = 90;BA.debugLine="pnl_coins.Initialize(\"pnl_coins\")";
Debug.ShouldStop(33554432);
ac_lchats.mostCurrent._pnl_coins.runVoidMethod ("Initialize",ac_lchats.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("pnl_coins")));
 BA.debugLineNum = 91;BA.debugLine="Activity.AddView(pnl_coins,50%x,3%x,50%x,12%x)";
Debug.ShouldStop(67108864);
ac_lchats.mostCurrent._activity.runVoidMethod ("AddView",(Object)((ac_lchats.mostCurrent._pnl_coins.getObject())),(Object)(ac_lchats.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 50)),ac_lchats.mostCurrent.activityBA)),(Object)(ac_lchats.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 3)),ac_lchats.mostCurrent.activityBA)),(Object)(ac_lchats.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 50)),ac_lchats.mostCurrent.activityBA)),(Object)(ac_lchats.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 12)),ac_lchats.mostCurrent.activityBA)));
 BA.debugLineNum = 92;BA.debugLine="roundview.Initialize(pnl_coins)";
Debug.ShouldStop(134217728);
ac_lchats.mostCurrent._roundview.runVoidMethod ("Initialize",ac_lchats.processBA,(Object)((ac_lchats.mostCurrent._pnl_coins.getObject())));
 BA.debugLineNum = 93;BA.debugLine="roundview.CornerRadius_BL=10%x";
Debug.ShouldStop(268435456);
ac_lchats.mostCurrent._roundview.runMethod(true,"setCornerRadius_BL",ac_lchats.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),ac_lchats.mostCurrent.activityBA));
 BA.debugLineNum = 94;BA.debugLine="roundview.CornerRadius_TL=10%x";
Debug.ShouldStop(536870912);
ac_lchats.mostCurrent._roundview.runMethod(true,"setCornerRadius_TL",ac_lchats.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),ac_lchats.mostCurrent.activityBA));
 BA.debugLineNum = 95;BA.debugLine="roundview.BackgroundColor=Colors.White";
Debug.ShouldStop(1073741824);
ac_lchats.mostCurrent._roundview.runMethod(true,"setBackgroundColor",ac_lchats.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 97;BA.debugLine="Dim bkcolor_st As ColorDrawable";
Debug.ShouldStop(1);
_bkcolor_st = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("bkcolor_st", _bkcolor_st);
 BA.debugLineNum = 98;BA.debugLine="bkcolor_st.Initialize2(0xFFC67D00,50,4dip,0x82FFE";
Debug.ShouldStop(2);
_bkcolor_st.runVoidMethod ("Initialize2",(Object)(BA.numberCast(int.class, 0xffc67d00)),(Object)(BA.numberCast(int.class, 50)),(Object)(ac_lchats.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4)))),(Object)(BA.numberCast(int.class, 0x82ffe300)));
 BA.debugLineNum = 100;BA.debugLine="Dim pnlb1 As Panel";
Debug.ShouldStop(8);
_pnlb1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("pnlb1", _pnlb1);
 BA.debugLineNum = 101;BA.debugLine="pnlb1.Initialize(\"\")";
Debug.ShouldStop(16);
_pnlb1.runVoidMethod ("Initialize",ac_lchats.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 102;BA.debugLine="pnlb1.Color=0xFFFFC300";
Debug.ShouldStop(32);
_pnlb1.runVoidMethod ("setColor",BA.numberCast(int.class, 0xffffc300));
 BA.debugLineNum = 103;BA.debugLine="pnlb1.Background=bkcolor_st";
Debug.ShouldStop(64);
_pnlb1.runMethod(false,"setBackground",(_bkcolor_st.getObject()));
 BA.debugLineNum = 104;BA.debugLine="pnl_coins.AddView(pnlb1,pnl_coins.Width-11%x,1%x,";
Debug.ShouldStop(128);
ac_lchats.mostCurrent._pnl_coins.runVoidMethod ("AddView",(Object)((_pnlb1.getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {ac_lchats.mostCurrent._pnl_coins.runMethod(true,"getWidth"),ac_lchats.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 11)),ac_lchats.mostCurrent.activityBA)}, "-",1, 1)),(Object)(ac_lchats.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 1)),ac_lchats.mostCurrent.activityBA)),(Object)(ac_lchats.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),ac_lchats.mostCurrent.activityBA)),(Object)(RemoteObject.solve(new RemoteObject[] {ac_lchats.mostCurrent._pnl_coins.runMethod(true,"getHeight"),ac_lchats.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),ac_lchats.mostCurrent.activityBA)}, "-",1, 1)));
 BA.debugLineNum = 106;BA.debugLine="lbl_icon.Initialize(\"lbl_icon\")";
Debug.ShouldStop(512);
ac_lchats.mostCurrent._lbl_icon.runVoidMethod ("Initialize",ac_lchats.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("lbl_icon")));
 BA.debugLineNum = 107;BA.debugLine="lbl_icon.SetBackgroundImage(LoadBitmap(File.DirAs";
Debug.ShouldStop(1024);
ac_lchats.mostCurrent._lbl_icon.runVoidMethod ("SetBackgroundImageNew",(Object)((ac_lchats.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(ac_lchats.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("coins.png"))).getObject())));
 BA.debugLineNum = 108;BA.debugLine="pnl_coins.AddView(lbl_icon,pnl_coins.Width-9%x,pn";
Debug.ShouldStop(2048);
ac_lchats.mostCurrent._pnl_coins.runVoidMethod ("AddView",(Object)((ac_lchats.mostCurrent._lbl_icon.getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {ac_lchats.mostCurrent._pnl_coins.runMethod(true,"getWidth"),ac_lchats.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 9)),ac_lchats.mostCurrent.activityBA)}, "-",1, 1)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {ac_lchats.mostCurrent._pnl_coins.runMethod(true,"getHeight"),RemoteObject.createImmutable(2),RemoteObject.createImmutable(2)}, "//",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {ac_lchats.mostCurrent._pnl_coins.runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {ac_lchats.mostCurrent._pnl_coins.runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "/",0, 0))));
 BA.debugLineNum = 110;BA.debugLine="lbl_nums.Initialize(\"lbl_nums\")";
Debug.ShouldStop(8192);
ac_lchats.mostCurrent._lbl_nums.runVoidMethod ("Initialize",ac_lchats.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("lbl_nums")));
 BA.debugLineNum = 111;BA.debugLine="lbl_nums.TextColor=Colors.DarkGray";
Debug.ShouldStop(16384);
ac_lchats.mostCurrent._lbl_nums.runMethod(true,"setTextColor",ac_lchats.mostCurrent.__c.getField(false,"Colors").getField(true,"DarkGray"));
 BA.debugLineNum = 112;BA.debugLine="lbl_nums.TextSize=20";
Debug.ShouldStop(32768);
ac_lchats.mostCurrent._lbl_nums.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 113;BA.debugLine="lbl_nums.Typeface=Typeface.LoadFromAssets(\"iran_s";
Debug.ShouldStop(65536);
ac_lchats.mostCurrent._lbl_nums.runMethod(false,"setTypeface",ac_lchats.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("iran_sans.ttf"))));
 BA.debugLineNum = 114;BA.debugLine="lbl_nums.Text=0&\" سکه\"";
Debug.ShouldStop(131072);
ac_lchats.mostCurrent._lbl_nums.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable(0),RemoteObject.createImmutable(" سکه"))));
 BA.debugLineNum = 115;BA.debugLine="lbl_nums.Gravity=Gravity.CENTER_VERTICAL+Gravity.";
Debug.ShouldStop(262144);
ac_lchats.mostCurrent._lbl_nums.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {ac_lchats.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL"),ac_lchats.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT")}, "+",1, 1));
 BA.debugLineNum = 116;BA.debugLine="pnl_coins.AddView(lbl_nums,2%x,0,pnl_coins.Width-";
Debug.ShouldStop(524288);
ac_lchats.mostCurrent._pnl_coins.runVoidMethod ("AddView",(Object)((ac_lchats.mostCurrent._lbl_nums.getObject())),(Object)(ac_lchats.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),ac_lchats.mostCurrent.activityBA)),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {ac_lchats.mostCurrent._pnl_coins.runMethod(true,"getWidth"),ac_lchats.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),ac_lchats.mostCurrent.activityBA)}, "-",1, 1)),(Object)(ac_lchats.mostCurrent._pnl_coins.runMethod(true,"getHeight")));
 BA.debugLineNum = 118;BA.debugLine="Dim bg As ColorDrawable";
Debug.ShouldStop(2097152);
_bg = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("bg", _bg);
 BA.debugLineNum = 119;BA.debugLine="bg.Initialize2(Colors.White,5dip,2dip,Colors.Ligh";
Debug.ShouldStop(4194304);
_bg.runVoidMethod ("Initialize2",(Object)(ac_lchats.mostCurrent.__c.getField(false,"Colors").getField(true,"White")),(Object)(ac_lchats.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))),(Object)(ac_lchats.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))),(Object)(ac_lchats.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray")));
 BA.debugLineNum = 120;BA.debugLine="pnl_lv.Initialize(\"pnl_lv\")";
Debug.ShouldStop(8388608);
ac_lchats.mostCurrent._pnl_lv.runVoidMethod ("Initialize",ac_lchats.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("pnl_lv")));
 BA.debugLineNum = 121;BA.debugLine="pnl_lv.Background=bg";
Debug.ShouldStop(16777216);
ac_lchats.mostCurrent._pnl_lv.runMethod(false,"setBackground",(_bg.getObject()));
 BA.debugLineNum = 122;BA.debugLine="Activity.AddView(pnl_lv,5%x,12%y,100%x-10%x,90%y-";
Debug.ShouldStop(33554432);
ac_lchats.mostCurrent._activity.runVoidMethod ("AddView",(Object)((ac_lchats.mostCurrent._pnl_lv.getObject())),(Object)(ac_lchats.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),ac_lchats.mostCurrent.activityBA)),(Object)(ac_lchats.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 12)),ac_lchats.mostCurrent.activityBA)),(Object)(RemoteObject.solve(new RemoteObject[] {ac_lchats.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),ac_lchats.mostCurrent.activityBA),ac_lchats.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),ac_lchats.mostCurrent.activityBA)}, "-",1, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {ac_lchats.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 90)),ac_lchats.mostCurrent.activityBA),ac_lchats.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 7)),ac_lchats.mostCurrent.activityBA)}, "-",1, 1)));
 BA.debugLineNum = 124;BA.debugLine="Dim lbl_a As Label";
Debug.ShouldStop(134217728);
_lbl_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl_a", _lbl_a);
 BA.debugLineNum = 125;BA.debugLine="lbl_a.Initialize(\"lbl_a\")";
Debug.ShouldStop(268435456);
_lbl_a.runVoidMethod ("Initialize",ac_lchats.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("lbl_a")));
 BA.debugLineNum = 126;BA.debugLine="lbl_a.TextColor=Colors.DarkGray";
Debug.ShouldStop(536870912);
_lbl_a.runMethod(true,"setTextColor",ac_lchats.mostCurrent.__c.getField(false,"Colors").getField(true,"DarkGray"));
 BA.debugLineNum = 127;BA.debugLine="lbl_a.TextSize=20";
Debug.ShouldStop(1073741824);
_lbl_a.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 128;BA.debugLine="lbl_a.Typeface=Typeface.LoadFromAssets(\"iran_sans";
Debug.ShouldStop(-2147483648);
_lbl_a.runMethod(false,"setTypeface",ac_lchats.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("iran_sans.ttf"))));
 BA.debugLineNum = 129;BA.debugLine="lbl_a.Text=\"کانال های شما\"";
Debug.ShouldStop(1);
_lbl_a.runMethod(true,"setText",BA.ObjectToCharSequence("کانال های شما"));
 BA.debugLineNum = 130;BA.debugLine="lbl_a.Gravity=Gravity.CENTER_VERTICAL+Gravity.CEN";
Debug.ShouldStop(2);
_lbl_a.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {ac_lchats.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL"),ac_lchats.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL")}, "+",1, 1));
 BA.debugLineNum = 131;BA.debugLine="pnl_lv.AddView(lbl_a,5%x,0,pnl_lv.Width-10%x,10%x";
Debug.ShouldStop(4);
ac_lchats.mostCurrent._pnl_lv.runVoidMethod ("AddView",(Object)((_lbl_a.getObject())),(Object)(ac_lchats.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),ac_lchats.mostCurrent.activityBA)),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {ac_lchats.mostCurrent._pnl_lv.runMethod(true,"getWidth"),ac_lchats.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),ac_lchats.mostCurrent.activityBA)}, "-",1, 1)),(Object)(ac_lchats.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),ac_lchats.mostCurrent.activityBA)));
 BA.debugLineNum = 133;BA.debugLine="Dim bg As ColorDrawable";
Debug.ShouldStop(16);
_bg = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("bg", _bg);
 BA.debugLineNum = 134;BA.debugLine="bg.Initialize2(0xFF0072FF,5dip,2dip,0xFF003BFF)";
Debug.ShouldStop(32);
_bg.runVoidMethod ("Initialize2",(Object)(BA.numberCast(int.class, 0xff0072ff)),(Object)(ac_lchats.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))),(Object)(ac_lchats.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))),(Object)(BA.numberCast(int.class, 0xff003bff)));
 BA.debugLineNum = 136;BA.debugLine="Dim lbl_addchannel As Label";
Debug.ShouldStop(128);
_lbl_addchannel = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl_addchannel", _lbl_addchannel);
 BA.debugLineNum = 137;BA.debugLine="lbl_addchannel.Initialize(\"lbl_addchannel\")";
Debug.ShouldStop(256);
_lbl_addchannel.runVoidMethod ("Initialize",ac_lchats.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("lbl_addchannel")));
 BA.debugLineNum = 138;BA.debugLine="lbl_addchannel.TextColor=Colors.White";
Debug.ShouldStop(512);
_lbl_addchannel.runMethod(true,"setTextColor",ac_lchats.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 139;BA.debugLine="lbl_addchannel.TextSize=20";
Debug.ShouldStop(1024);
_lbl_addchannel.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 140;BA.debugLine="lbl_addchannel.Background=bg";
Debug.ShouldStop(2048);
_lbl_addchannel.runMethod(false,"setBackground",(_bg.getObject()));
 BA.debugLineNum = 141;BA.debugLine="lbl_addchannel.Typeface=Typeface.LoadFromAssets(\"";
Debug.ShouldStop(4096);
_lbl_addchannel.runMethod(false,"setTypeface",ac_lchats.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("iran_sans.ttf"))));
 BA.debugLineNum = 142;BA.debugLine="lbl_addchannel.Text=\"ثبت کانال جدید\"";
Debug.ShouldStop(8192);
_lbl_addchannel.runMethod(true,"setText",BA.ObjectToCharSequence("ثبت کانال جدید"));
 BA.debugLineNum = 143;BA.debugLine="lbl_addchannel.Gravity=Gravity.CENTER_VERTICAL+Gr";
Debug.ShouldStop(16384);
_lbl_addchannel.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {ac_lchats.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL"),ac_lchats.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL")}, "+",1, 1));
 BA.debugLineNum = 144;BA.debugLine="pnl_lv.AddView(lbl_addchannel,5%x,lbl_a.Top+lbl_a";
Debug.ShouldStop(32768);
ac_lchats.mostCurrent._pnl_lv.runVoidMethod ("AddView",(Object)((_lbl_addchannel.getObject())),(Object)(ac_lchats.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),ac_lchats.mostCurrent.activityBA)),(Object)(RemoteObject.solve(new RemoteObject[] {_lbl_a.runMethod(true,"getTop"),_lbl_a.runMethod(true,"getHeight"),ac_lchats.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),ac_lchats.mostCurrent.activityBA)}, "++",2, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {ac_lchats.mostCurrent._pnl_lv.runMethod(true,"getWidth"),ac_lchats.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),ac_lchats.mostCurrent.activityBA)}, "-",1, 1)),(Object)(ac_lchats.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),ac_lchats.mostCurrent.activityBA)));
 BA.debugLineNum = 146;BA.debugLine="LV.Initializer(\"LV\").ListView.FastScrollType(2).B";
Debug.ShouldStop(131072);
ac_lchats.mostCurrent._lv.runMethod(false,"Initializer",ac_lchats.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("LV"))).runMethod(false,"ListView").runMethod(false,"FastScrollType",(Object)(BA.numberCast(int.class, 2))).runVoidMethod ("Build");
 BA.debugLineNum = 147;BA.debugLine="pnl_lv.AddView(LV,0,lbl_addchannel.Top+lbl_addcha";
Debug.ShouldStop(262144);
ac_lchats.mostCurrent._pnl_lv.runVoidMethod ("AddView",(Object)((ac_lchats.mostCurrent._lv.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {_lbl_addchannel.runMethod(true,"getTop"),_lbl_addchannel.runMethod(true,"getHeight"),ac_lchats.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),ac_lchats.mostCurrent.activityBA)}, "++",2, 1)),(Object)(ac_lchats.mostCurrent._pnl_lv.runMethod(true,"getWidth")),(Object)(RemoteObject.solve(new RemoteObject[] {ac_lchats.mostCurrent._pnl_lv.runMethod(true,"getHeight"),_lbl_addchannel.runMethod(true,"getTop"),_lbl_addchannel.runMethod(true,"getHeight"),ac_lchats.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 3)),ac_lchats.mostCurrent.activityBA)}, "---",3, 1)));
 BA.debugLineNum = 148;BA.debugLine="LV.CardView.CardElevation(4dip).Radius(2dip)";
Debug.ShouldStop(524288);
ac_lchats.mostCurrent._lv.runMethod(false,"CardView").runMethod(false,"CardElevation",(Object)(BA.numberCast(float.class, ac_lchats.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4)))))).runVoidMethod ("Radius",(Object)(BA.numberCast(float.class, ac_lchats.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2))))));
 BA.debugLineNum = 149;BA.debugLine="LV.Show";
Debug.ShouldStop(1048576);
ac_lchats.mostCurrent._lv.runVoidMethodAndSync ("Show");
 BA.debugLineNum = 152;BA.debugLine="telegs.Initialize(\"telegs\")";
Debug.ShouldStop(8388608);
ac_lchats._telegs.runVoidMethod ("Initialize",ac_lchats.processBA,(Object)(RemoteObject.createImmutable("telegs")));
 BA.debugLineNum = 153;BA.debugLine="telegs.getChats(0,0,100)";
Debug.ShouldStop(16777216);
ac_lchats._telegs.runVoidMethod ("getChats",(Object)(BA.numberCast(long.class, 0)),(Object)(BA.numberCast(long.class, 0)),(Object)(BA.numberCast(int.class, 100)));
 BA.debugLineNum = 156;BA.debugLine="req_getme(userid_t)";
Debug.ShouldStop(134217728);
_req_getme(ac_lchats._userid_t);
 BA.debugLineNum = 158;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_keypress(RemoteObject _keycode) throws Exception{
try {
		Debug.PushSubsStack("Activity_KeyPress (ac_lchats) ","ac_lchats",8,ac_lchats.mostCurrent.activityBA,ac_lchats.mostCurrent,781);
if (RapidSub.canDelegate("activity_keypress")) { return com.it.fome.ac_lchats.remoteMe.runUserSub(false, "ac_lchats","activity_keypress", _keycode);}
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 781;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
Debug.ShouldStop(4096);
 BA.debugLineNum = 782;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",_keycode,BA.numberCast(double.class, ac_lchats.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK")))) { 
 BA.debugLineNum = 783;BA.debugLine="StartActivity(ac_tselect)";
Debug.ShouldStop(16384);
ac_lchats.mostCurrent.__c.runVoidMethod ("StartActivity",ac_lchats.processBA,(Object)((ac_lchats.mostCurrent._ac_tselect.getObject())));
 BA.debugLineNum = 784;BA.debugLine="Activity.Finish";
Debug.ShouldStop(32768);
ac_lchats.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 785;BA.debugLine="Return True";
Debug.ShouldStop(65536);
if (true) return ac_lchats.mostCurrent.__c.getField(true,"True");
 };
 BA.debugLineNum = 788;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (ac_lchats) ","ac_lchats",8,ac_lchats.mostCurrent.activityBA,ac_lchats.mostCurrent,165);
if (RapidSub.canDelegate("activity_pause")) { return com.it.fome.ac_lchats.remoteMe.runUserSub(false, "ac_lchats","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 165;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(16);
 BA.debugLineNum = 167;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
		Debug.PushSubsStack("Activity_Resume (ac_lchats) ","ac_lchats",8,ac_lchats.mostCurrent.activityBA,ac_lchats.mostCurrent,160);
if (RapidSub.canDelegate("activity_resume")) { return com.it.fome.ac_lchats.remoteMe.runUserSub(false, "ac_lchats","activity_resume");}
 BA.debugLineNum = 160;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 161;BA.debugLine="req_getme(userid_t)";
Debug.ShouldStop(1);
_req_getme(ac_lchats._userid_t);
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
public static RemoteObject  _dialog_itemselected(RemoteObject _dialog,RemoteObject _position,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("Dialog_ItemSelected (ac_lchats) ","ac_lchats",8,ac_lchats.mostCurrent.activityBA,ac_lchats.mostCurrent,568);
if (RapidSub.canDelegate("dialog_itemselected")) { return com.it.fome.ac_lchats.remoteMe.runUserSub(false, "ac_lchats","dialog_itemselected", _dialog, _position, _text);}
Debug.locals.put("Dialog", _dialog);
Debug.locals.put("Position", _position);
Debug.locals.put("Text", _text);
 BA.debugLineNum = 568;BA.debugLine="Sub Dialog_ItemSelected (Dialog As MaterialDialog,";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 571;BA.debugLine="Select Position";
Debug.ShouldStop(67108864);
switch (BA.switchObjectToInt(_position,BA.numberCast(int.class, 0),BA.numberCast(int.class, 1))) {
case 0: {
 BA.debugLineNum = 574;BA.debugLine="show_pnldialogs(True,0)";
Debug.ShouldStop(536870912);
_show_pnldialogs(ac_lchats.mostCurrent.__c.getField(true,"True"),BA.numberCast(int.class, 0));
 break; }
case 1: {
 BA.debugLineNum = 576;BA.debugLine="show_pnldialogs(True,3)";
Debug.ShouldStop(-2147483648);
_show_pnldialogs(ac_lchats.mostCurrent.__c.getField(true,"True"),BA.numberCast(int.class, 3));
 break; }
}
;
 BA.debugLineNum = 580;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
ac_lchats.mostCurrent._meno = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Dim pnl_coins As Panel";
ac_lchats.mostCurrent._pnl_coins = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Dim lbl_icon ,lbl_nums As Label";
ac_lchats.mostCurrent._lbl_icon = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
ac_lchats.mostCurrent._lbl_nums = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Dim roundview As MC7RoundView";
ac_lchats.mostCurrent._roundview = RemoteObject.createNew ("com.flycoroundview.mc7.MC7RoundView");
 //BA.debugLineNum = 23;BA.debugLine="Dim LV As Hitex_LayoutView";
ac_lchats.mostCurrent._lv = RemoteObject.createNew ("wir.hitex.recycler.Hitex_LayoutView");
 //BA.debugLineNum = 24;BA.debugLine="Dim glide As Hitex_Glide";
ac_lchats.mostCurrent._glide = RemoteObject.createNew ("com.hitex_glide.Hitex_Glide");
 //BA.debugLineNum = 26;BA.debugLine="Dim pnl_lv As Panel";
ac_lchats.mostCurrent._pnl_lv = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Dim pnl_dilogs As Panel";
ac_lchats.mostCurrent._pnl_dilogs = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Dim username_target,title_target As String";
ac_lchats.mostCurrent._username_target = RemoteObject.createImmutable("");
ac_lchats.mostCurrent._title_target = RemoteObject.createImmutable("");
 //BA.debugLineNum = 29;BA.debugLine="Dim id_target ,idchannel_target As String";
ac_lchats.mostCurrent._id_target = RemoteObject.createImmutable("");
ac_lchats.mostCurrent._idchannel_target = RemoteObject.createImmutable("");
 //BA.debugLineNum = 30;BA.debugLine="Dim img_target As String";
ac_lchats.mostCurrent._img_target = RemoteObject.createImmutable("");
 //BA.debugLineNum = 32;BA.debugLine="Dim mimeno As mi_meno";
ac_lchats.mostCurrent._mimeno = RemoteObject.createNew ("com.it.fome.mi_meno");
 //BA.debugLineNum = 33;BA.debugLine="Dim us_name As String";
ac_lchats.mostCurrent._us_name = RemoteObject.createImmutable("");
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _lbl_addchannel_click() throws Exception{
try {
		Debug.PushSubsStack("lbl_addchannel_Click (ac_lchats) ","ac_lchats",8,ac_lchats.mostCurrent.activityBA,ac_lchats.mostCurrent,582);
if (RapidSub.canDelegate("lbl_addchannel_click")) { return com.it.fome.ac_lchats.remoteMe.runUserSub(false, "ac_lchats","lbl_addchannel_click");}
 BA.debugLineNum = 582;BA.debugLine="Sub lbl_addchannel_Click";
Debug.ShouldStop(32);
 BA.debugLineNum = 583;BA.debugLine="StartActivity(ac_tsearch)";
Debug.ShouldStop(64);
ac_lchats.mostCurrent.__c.runVoidMethod ("StartActivity",ac_lchats.processBA,(Object)((ac_lchats.mostCurrent._ac_tsearch.getObject())));
 BA.debugLineNum = 585;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lbl_sef_click() throws Exception{
try {
		Debug.PushSubsStack("lbl_sef_Click (ac_lchats) ","ac_lchats",8,ac_lchats.mostCurrent.activityBA,ac_lchats.mostCurrent,531);
if (RapidSub.canDelegate("lbl_sef_click")) { return com.it.fome.ac_lchats.remoteMe.runUserSub(false, "ac_lchats","lbl_sef_click");}
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _item = RemoteObject.declareNull("com.it.fome.ac_lchats._adap_chats");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _id_channelinfo = RemoteObject.createImmutable(0);
RemoteObject _issupergroup = RemoteObject.createImmutable("");
 BA.debugLineNum = 531;BA.debugLine="Sub lbl_sef_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 540;BA.debugLine="Dim lbl As Label";
Debug.ShouldStop(134217728);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 541;BA.debugLine="lbl=Sender";
Debug.ShouldStop(268435456);
_lbl.setObject(ac_lchats.mostCurrent.__c.runMethod(false,"Sender",ac_lchats.mostCurrent.activityBA));
 BA.debugLineNum = 542;BA.debugLine="Dim Item = listchats.Get(lbl.Tag) As Adap_chats";
Debug.ShouldStop(536870912);
_item = (ac_lchats._listchats.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _lbl.runMethod(false,"getTag")))));Debug.locals.put("Item", _item);Debug.locals.put("Item", _item);
 BA.debugLineNum = 543;BA.debugLine="Log(Item.title)";
Debug.ShouldStop(1073741824);
ac_lchats.mostCurrent.__c.runVoidMethod ("LogImpl","610027020",_item.getField(true,"title" /*RemoteObject*/ ),0);
 BA.debugLineNum = 544;BA.debugLine="chatid=Item.chat_id";
Debug.ShouldStop(-2147483648);
ac_lchats._chatid = BA.NumberToString(_item.getField(true,"chat_id" /*RemoteObject*/ ));
 BA.debugLineNum = 545;BA.debugLine="title_target=Item.title";
Debug.ShouldStop(1);
ac_lchats.mostCurrent._title_target = _item.getField(true,"title" /*RemoteObject*/ );
 BA.debugLineNum = 546;BA.debugLine="LogColor(\" img id : \"&Item.img_my.Length,Colors.R";
Debug.ShouldStop(2);
ac_lchats.mostCurrent.__c.runVoidMethod ("LogImpl","610027023",RemoteObject.concat(RemoteObject.createImmutable(" img id : "),_item.getField(true,"img_my" /*RemoteObject*/ ).runMethod(true,"length")),ac_lchats.mostCurrent.__c.getField(false,"Colors").getField(true,"Red"));
 BA.debugLineNum = 547;BA.debugLine="If Item.img_my.Length>5 Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean(">",_item.getField(true,"img_my" /*RemoteObject*/ ).runMethod(true,"length"),BA.numberCast(double.class, 5))) { 
 BA.debugLineNum = 549;BA.debugLine="img_target=Item.img_my";
Debug.ShouldStop(16);
ac_lchats.mostCurrent._img_target = _item.getField(true,"img_my" /*RemoteObject*/ );
 }else {
 BA.debugLineNum = 552;BA.debugLine="img_target=\"http://filework.ir/INSTAFOLLOW/api/a";
Debug.ShouldStop(128);
ac_lchats.mostCurrent._img_target = BA.ObjectToString("http://filework.ir/INSTAFOLLOW/api/asset/noimage.png");
 BA.debugLineNum = 553;BA.debugLine="LogColor(\" no img : \",Colors.Red)";
Debug.ShouldStop(256);
ac_lchats.mostCurrent.__c.runVoidMethod ("LogImpl","610027030",BA.ObjectToString(" no img : "),ac_lchats.mostCurrent.__c.getField(false,"Colors").getField(true,"Red"));
 };
 BA.debugLineNum = 555;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(1024);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 556;BA.debugLine="parser.Initialize(Item.channel_info)";
Debug.ShouldStop(2048);
_parser.runVoidMethod ("Initialize",(Object)(_item.getField(true,"channel_info" /*RemoteObject*/ )));
 BA.debugLineNum = 557;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(4096);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 558;BA.debugLine="Dim id_channelinfo As Int = root.Get(\"supergroupI";
Debug.ShouldStop(8192);
_id_channelinfo = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("supergroupId")))));Debug.locals.put("id_channelinfo", _id_channelinfo);Debug.locals.put("id_channelinfo", _id_channelinfo);
 BA.debugLineNum = 559;BA.debugLine="Dim isSupergroup As String = root.Get(\"isChannel\"";
Debug.ShouldStop(16384);
_issupergroup = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("isChannel")))));Debug.locals.put("isSupergroup", _issupergroup);Debug.locals.put("isSupergroup", _issupergroup);
 BA.debugLineNum = 560;BA.debugLine="idchannel_target=id_channelinfo";
Debug.ShouldStop(32768);
ac_lchats.mostCurrent._idchannel_target = BA.NumberToString(_id_channelinfo);
 BA.debugLineNum = 563;BA.debugLine="telegs.Getchanneluser(id_channelinfo)";
Debug.ShouldStop(262144);
ac_lchats._telegs.runVoidMethod ("Getchanneluser",(Object)(_id_channelinfo));
 BA.debugLineNum = 566;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lbl_x_click() throws Exception{
try {
		Debug.PushSubsStack("lbl_x_Click (ac_lchats) ","ac_lchats",8,ac_lchats.mostCurrent.activityBA,ac_lchats.mostCurrent,732);
if (RapidSub.canDelegate("lbl_x_click")) { return com.it.fome.ac_lchats.remoteMe.runUserSub(false, "ac_lchats","lbl_x_click");}
 BA.debugLineNum = 732;BA.debugLine="Sub lbl_x_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 733;BA.debugLine="show_pnldialogs(False,0)";
Debug.ShouldStop(268435456);
_show_pnldialogs(ac_lchats.mostCurrent.__c.getField(true,"False"),BA.numberCast(int.class, 0));
 BA.debugLineNum = 735;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lv_getitemcount() throws Exception{
try {
		Debug.PushSubsStack("LV_GetItemCount (ac_lchats) ","ac_lchats",8,ac_lchats.mostCurrent.activityBA,ac_lchats.mostCurrent,379);
if (RapidSub.canDelegate("lv_getitemcount")) { return com.it.fome.ac_lchats.remoteMe.runUserSub(false, "ac_lchats","lv_getitemcount");}
 BA.debugLineNum = 379;BA.debugLine="Sub LV_GetItemCount As Int 								        '$ Item";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 380;BA.debugLine="Return listchats.Size 'ItemList.Size";
Debug.ShouldStop(134217728);
if (true) return ac_lchats._listchats.runMethod(true,"getSize");
 BA.debugLineNum = 381;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lv_onbindviewholder(RemoteObject _parent,RemoteObject _position) throws Exception{
try {
		Debug.PushSubsStack("LV_onBindViewHolder (ac_lchats) ","ac_lchats",8,ac_lchats.mostCurrent.activityBA,ac_lchats.mostCurrent,235);
if (RapidSub.canDelegate("lv_onbindviewholder")) { return com.it.fome.ac_lchats.remoteMe.runUserSub(false, "ac_lchats","lv_onbindviewholder", _parent, _position);}
RemoteObject _item = RemoteObject.declareNull("com.it.fome.ac_lchats._adap_chats");
RemoteObject _pnl_main = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _lbl_iconchat = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _img_prof = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
RemoteObject _divi = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _lbl_topmsg = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _lbl_time = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _lbl_unread = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _lbl_sef = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _dir = RemoteObject.createImmutable("");
RemoteObject _names = RemoteObject.createImmutable("");
RemoteObject _expdate = RemoteObject.createImmutable(0L);
RemoteObject _s = RemoteObject.createImmutable(0);
RemoteObject _su = RemoteObject.declareNull("anywheresoftware.b4a.objects.StringUtils");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _id_channelinfo = RemoteObject.createImmutable(0);
RemoteObject _issupergroup = RemoteObject.createImmutable("");
RemoteObject _photoid_topmsg = RemoteObject.createImmutable("");
RemoteObject _caption_topmsg = RemoteObject.createImmutable("");
RemoteObject _msgdoc_caption = RemoteObject.createImmutable("");
RemoteObject _msg_text = RemoteObject.createImmutable("");
Debug.locals.put("Parent", _parent);
Debug.locals.put("Position", _position);
 BA.debugLineNum = 235;BA.debugLine="Sub LV_onBindViewHolder (Parent As Panel, Position";
Debug.ShouldStop(1024);
 BA.debugLineNum = 236;BA.debugLine="Dim Item = listchats.Get(Position) As Adap_chats";
Debug.ShouldStop(2048);
_item = (ac_lchats._listchats.runMethod(false,"Get",(Object)(_position)));Debug.locals.put("Item", _item);Debug.locals.put("Item", _item);
 BA.debugLineNum = 237;BA.debugLine="Dim pnl_main =Parent.GetView(0) As Panel";
Debug.ShouldStop(4096);
_pnl_main = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_pnl_main.setObject(_parent.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).getObject());Debug.locals.put("pnl_main", _pnl_main);
 BA.debugLineNum = 238;BA.debugLine="Dim lbl = pnl_main.GetView(0) As Label";
Debug.ShouldStop(8192);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_lbl.setObject(_pnl_main.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).getObject());Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 239;BA.debugLine="Dim lbl_iconchat = pnl_main.GetView(1) As Label";
Debug.ShouldStop(16384);
_lbl_iconchat = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_lbl_iconchat.setObject(_pnl_main.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1))).getObject());Debug.locals.put("lbl_iconchat", _lbl_iconchat);
 BA.debugLineNum = 240;BA.debugLine="Dim img_prof = pnl_main.GetView(2) As ImageView";
Debug.ShouldStop(32768);
_img_prof = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
_img_prof.setObject(_pnl_main.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 2))).getObject());Debug.locals.put("img_prof", _img_prof);
 BA.debugLineNum = 241;BA.debugLine="Dim divi = pnl_main.GetView(3) As Panel";
Debug.ShouldStop(65536);
_divi = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_divi.setObject(_pnl_main.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 3))).getObject());Debug.locals.put("divi", _divi);
 BA.debugLineNum = 242;BA.debugLine="Dim lbl_topmsg = pnl_main.GetView(4) As Label";
Debug.ShouldStop(131072);
_lbl_topmsg = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_lbl_topmsg.setObject(_pnl_main.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 4))).getObject());Debug.locals.put("lbl_topmsg", _lbl_topmsg);
 BA.debugLineNum = 243;BA.debugLine="Dim lbl_time = pnl_main.GetView(5) As Label";
Debug.ShouldStop(262144);
_lbl_time = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_lbl_time.setObject(_pnl_main.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 5))).getObject());Debug.locals.put("lbl_time", _lbl_time);
 BA.debugLineNum = 244;BA.debugLine="Dim lbl_unread = pnl_main.GetView(6) As Label";
Debug.ShouldStop(524288);
_lbl_unread = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_lbl_unread.setObject(_pnl_main.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 6))).getObject());Debug.locals.put("lbl_unread", _lbl_unread);
 BA.debugLineNum = 245;BA.debugLine="Dim lbl_sef = pnl_main.GetView(7) As Label";
Debug.ShouldStop(1048576);
_lbl_sef = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_lbl_sef.setObject(_pnl_main.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 7))).getObject());Debug.locals.put("lbl_sef", _lbl_sef);
 BA.debugLineNum = 247;BA.debugLine="lbl_sef.Tag=Position";
Debug.ShouldStop(4194304);
_lbl_sef.runMethod(false,"setTag",(_position));
 BA.debugLineNum = 250;BA.debugLine="Dim dir,names As String";
Debug.ShouldStop(33554432);
_dir = RemoteObject.createImmutable("");Debug.locals.put("dir", _dir);
_names = RemoteObject.createImmutable("");Debug.locals.put("names", _names);
 BA.debugLineNum = 253;BA.debugLine="Dim ExpDate As Long = DateUtils.UnixTimeToTicks(I";
Debug.ShouldStop(268435456);
_expdate = ac_lchats.mostCurrent._dateutils.runMethod(true,"_unixtimetoticks",ac_lchats.mostCurrent.activityBA,(Object)(BA.numberCast(long.class, _item.getField(true,"topdate" /*RemoteObject*/ ))));Debug.locals.put("ExpDate", _expdate);Debug.locals.put("ExpDate", _expdate);
 BA.debugLineNum = 255;BA.debugLine="lbl_time.Text=DateTime.time(ExpDate)";
Debug.ShouldStop(1073741824);
_lbl_time.runMethod(true,"setText",BA.ObjectToCharSequence(ac_lchats.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(_expdate))));
 BA.debugLineNum = 257;BA.debugLine="If Item.unreadCount>0 Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean(">",_item.getField(true,"unreadCount" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 };
 BA.debugLineNum = 263;BA.debugLine="Dim s As Int";
Debug.ShouldStop(64);
_s = RemoteObject.createImmutable(0);Debug.locals.put("s", _s);
 BA.debugLineNum = 264;BA.debugLine="Dim su As StringUtils";
Debug.ShouldStop(128);
_su = RemoteObject.createNew ("anywheresoftware.b4a.objects.StringUtils");Debug.locals.put("su", _su);
 BA.debugLineNum = 265;BA.debugLine="lbl.Text = Item.title";
Debug.ShouldStop(256);
_lbl.runMethod(true,"setText",BA.ObjectToCharSequence(_item.getField(true,"title" /*RemoteObject*/ )));
 BA.debugLineNum = 266;BA.debugLine="s = su.MeasureMultilineTextHeight(lbl,lbl.Text)+5";
Debug.ShouldStop(512);
_s = RemoteObject.solve(new RemoteObject[] {_su.runMethod(true,"MeasureMultilineTextHeight",(Object)((_lbl.getObject())),(Object)(BA.ObjectToCharSequence(_lbl.runMethod(true,"getText")))),ac_lchats.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 50)),ac_lchats.mostCurrent.activityBA)}, "+",1, 1);Debug.locals.put("s", _s);
 BA.debugLineNum = 269;BA.debugLine="Select Item.ChatConstructor";
Debug.ShouldStop(4096);
switch (BA.switchObjectToInt(_item.getField(true,"ChatConstructor" /*RemoteObject*/ ),BA.ObjectToString("955152366"),BA.ObjectToString("1276053779"),BA.ObjectToString("-241270753"))) {
case 0: {
 BA.debugLineNum = 271;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(16384);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 272;BA.debugLine="parser.Initialize(Item.channel_info)";
Debug.ShouldStop(32768);
_parser.runVoidMethod ("Initialize",(Object)(_item.getField(true,"channel_info" /*RemoteObject*/ )));
 BA.debugLineNum = 273;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(65536);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 274;BA.debugLine="Dim id_channelinfo As Int = root.Get(\"supergrou";
Debug.ShouldStop(131072);
_id_channelinfo = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("supergroupId")))));Debug.locals.put("id_channelinfo", _id_channelinfo);Debug.locals.put("id_channelinfo", _id_channelinfo);
 BA.debugLineNum = 275;BA.debugLine="Dim isSupergroup As String = root.Get(\"isChanne";
Debug.ShouldStop(262144);
_issupergroup = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("isChannel")))));Debug.locals.put("isSupergroup", _issupergroup);Debug.locals.put("isSupergroup", _issupergroup);
 BA.debugLineNum = 277;BA.debugLine="If isSupergroup=True Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_issupergroup,BA.ObjectToString(ac_lchats.mostCurrent.__c.getField(true,"True")))) { 
 BA.debugLineNum = 278;BA.debugLine="lbl_iconchat.Typeface=Typeface.FONTAWESOME";
Debug.ShouldStop(2097152);
_lbl_iconchat.runMethod(false,"setTypeface",ac_lchats.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"getFONTAWESOME"));
 BA.debugLineNum = 279;BA.debugLine="lbl_iconchat.Text=Chr(0xF0A1)";
Debug.ShouldStop(4194304);
_lbl_iconchat.runMethod(true,"setText",BA.ObjectToCharSequence(ac_lchats.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xf0a1)))));
 }else {
 BA.debugLineNum = 281;BA.debugLine="lbl_iconchat.Typeface=Typeface.FONTAWESOME";
Debug.ShouldStop(16777216);
_lbl_iconchat.runMethod(false,"setTypeface",ac_lchats.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"getFONTAWESOME"));
 BA.debugLineNum = 282;BA.debugLine="lbl_iconchat.Text=Chr(0xF0C0)";
Debug.ShouldStop(33554432);
_lbl_iconchat.runMethod(true,"setText",BA.ObjectToCharSequence(ac_lchats.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xf0c0)))));
 };
 break; }
case 1: {
 BA.debugLineNum = 286;BA.debugLine="lbl_iconchat.Typeface=Typeface.MATERIALICONS";
Debug.ShouldStop(536870912);
_lbl_iconchat.runMethod(false,"setTypeface",ac_lchats.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"getMATERIALICONS"));
 BA.debugLineNum = 287;BA.debugLine="lbl_iconchat.Text=Chr(0xE7EF)";
Debug.ShouldStop(1073741824);
_lbl_iconchat.runMethod(true,"setText",BA.ObjectToCharSequence(ac_lchats.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xe7ef)))));
 break; }
case 2: {
 BA.debugLineNum = 291;BA.debugLine="lbl_iconchat.Typeface=Typeface.FONTAWESOME";
Debug.ShouldStop(4);
_lbl_iconchat.runMethod(false,"setTypeface",ac_lchats.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"getFONTAWESOME"));
 BA.debugLineNum = 292;BA.debugLine="lbl_iconchat.Text=Chr(0xF2C0)";
Debug.ShouldStop(8);
_lbl_iconchat.runMethod(true,"setText",BA.ObjectToCharSequence(ac_lchats.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xf2c0)))));
 break; }
}
;
 BA.debugLineNum = 296;BA.debugLine="Select Item.topmasg_type";
Debug.ShouldStop(128);
switch (BA.switchObjectToInt(_item.getField(true,"topmasg_type" /*RemoteObject*/ ),BA.ObjectToString("photo"),BA.ObjectToString("document"),BA.ObjectToString("message"),BA.ObjectToString("voice"))) {
case 0: {
 BA.debugLineNum = 299;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(1024);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 300;BA.debugLine="parser.Initialize(Item.topmsg_info)";
Debug.ShouldStop(2048);
_parser.runVoidMethod ("Initialize",(Object)(_item.getField(true,"topmsg_info" /*RemoteObject*/ )));
 BA.debugLineNum = 301;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(4096);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 302;BA.debugLine="Dim photoid_topmsg As String = root.Get(\"photoi";
Debug.ShouldStop(8192);
_photoid_topmsg = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photoid_topmsg")))));Debug.locals.put("photoid_topmsg", _photoid_topmsg);Debug.locals.put("photoid_topmsg", _photoid_topmsg);
 BA.debugLineNum = 303;BA.debugLine="Dim caption_topmsg As String = root.Get(\"captio";
Debug.ShouldStop(16384);
_caption_topmsg = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("caption_topmsg")))));Debug.locals.put("caption_topmsg", _caption_topmsg);Debug.locals.put("caption_topmsg", _caption_topmsg);
 BA.debugLineNum = 305;BA.debugLine="If caption_topmsg.Length>60 Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean(">",_caption_topmsg.runMethod(true,"length"),BA.numberCast(double.class, 60))) { 
 BA.debugLineNum = 307;BA.debugLine="lbl_topmsg.Text=caption_topmsg.SubString2(0,50";
Debug.ShouldStop(262144);
_lbl_topmsg.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(_caption_topmsg.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 50))),RemoteObject.createImmutable("..."))));
 }else {
 BA.debugLineNum = 309;BA.debugLine="lbl_topmsg.Text=caption_topmsg";
Debug.ShouldStop(1048576);
_lbl_topmsg.runMethod(true,"setText",BA.ObjectToCharSequence(_caption_topmsg));
 };
 break; }
case 1: {
 BA.debugLineNum = 315;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(67108864);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 316;BA.debugLine="parser.Initialize(Item.topmsg_info)";
Debug.ShouldStop(134217728);
_parser.runVoidMethod ("Initialize",(Object)(_item.getField(true,"topmsg_info" /*RemoteObject*/ )));
 BA.debugLineNum = 317;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(268435456);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 318;BA.debugLine="Dim msgdoc_caption As String = root.Get(\"msgdoc";
Debug.ShouldStop(536870912);
_msgdoc_caption = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgdoc_caption")))));Debug.locals.put("msgdoc_caption", _msgdoc_caption);Debug.locals.put("msgdoc_caption", _msgdoc_caption);
 BA.debugLineNum = 319;BA.debugLine="If msgdoc_caption.Length>60 Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean(">",_msgdoc_caption.runMethod(true,"length"),BA.numberCast(double.class, 60))) { 
 BA.debugLineNum = 321;BA.debugLine="lbl_topmsg.Text=msgdoc_caption.SubString2(0,50";
Debug.ShouldStop(1);
_lbl_topmsg.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(_msgdoc_caption.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 50))),RemoteObject.createImmutable("..."))));
 }else {
 BA.debugLineNum = 323;BA.debugLine="lbl_topmsg.Text=msgdoc_caption";
Debug.ShouldStop(4);
_lbl_topmsg.runMethod(true,"setText",BA.ObjectToCharSequence(_msgdoc_caption));
 };
 break; }
case 2: {
 BA.debugLineNum = 328;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(128);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 329;BA.debugLine="parser.Initialize(Item.topmsg_info)";
Debug.ShouldStop(256);
_parser.runVoidMethod ("Initialize",(Object)(_item.getField(true,"topmsg_info" /*RemoteObject*/ )));
 BA.debugLineNum = 330;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(512);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 332;BA.debugLine="Dim msg_text As String = root.Get(\"msg_text\")";
Debug.ShouldStop(2048);
_msg_text = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msg_text")))));Debug.locals.put("msg_text", _msg_text);Debug.locals.put("msg_text", _msg_text);
 BA.debugLineNum = 334;BA.debugLine="If msg_text.Length>60 Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean(">",_msg_text.runMethod(true,"length"),BA.numberCast(double.class, 60))) { 
 BA.debugLineNum = 336;BA.debugLine="lbl_topmsg.Text=msg_text.SubString2(0,50)&\"...";
Debug.ShouldStop(32768);
_lbl_topmsg.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(_msg_text.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 50))),RemoteObject.createImmutable("..."))));
 }else {
 BA.debugLineNum = 338;BA.debugLine="lbl_topmsg.Text=msg_text";
Debug.ShouldStop(131072);
_lbl_topmsg.runMethod(true,"setText",BA.ObjectToCharSequence(_msg_text));
 };
 break; }
case 3: {
 break; }
}
;
 BA.debugLineNum = 347;BA.debugLine="If Item.img_isdwonload=\"true\" Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_item.getField(true,"img_isdwonload" /*RemoteObject*/ ),BA.ObjectToString("true"))) { 
 BA.debugLineNum = 350;BA.debugLine="glide.Load(\"\",Item.img_my).OptionalCircleCrop.In";
Debug.ShouldStop(536870912);
ac_lchats.mostCurrent._glide.runMethod(false,"Load",ac_lchats.mostCurrent.activityBA,(Object)(BA.ObjectToString("")),(Object)(_item.getField(true,"img_my" /*RemoteObject*/ ))).runMethod(false,"OptionalCircleCrop").runVoidMethod ("Into",(Object)(_img_prof));
 }else {
 BA.debugLineNum = 352;BA.debugLine="glide.Load(File.DirAssets,\"lazyloader.gif\").FitC";
Debug.ShouldStop(-2147483648);
ac_lchats.mostCurrent._glide.runMethod(false,"Load",ac_lchats.mostCurrent.activityBA,(Object)(ac_lchats.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("lazyloader.gif"))).runMethod(false,"FitCenter").runVoidMethod ("Into",(Object)(_img_prof));
 BA.debugLineNum = 354;BA.debugLine="If Item.img_id=\"null\" Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_item.getField(true,"img_id" /*RemoteObject*/ ),BA.ObjectToString("null"))) { 
 }else {
 BA.debugLineNum = 356;BA.debugLine="telegs.downloadFile(Item.img_id)";
Debug.ShouldStop(8);
ac_lchats._telegs.runVoidMethod ("downloadFile",(Object)(BA.numberCast(int.class, _item.getField(true,"img_id" /*RemoteObject*/ ))));
 };
 };
 BA.debugLineNum = 377;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("LV_onCreateViewHolder (ac_lchats) ","ac_lchats",8,ac_lchats.mostCurrent.activityBA,ac_lchats.mostCurrent,170);
if (RapidSub.canDelegate("lv_oncreateviewholder")) { return com.it.fome.ac_lchats.remoteMe.runUserSub(false, "ac_lchats","lv_oncreateviewholder", _parent, _viewtype);}
RemoteObject _pnl_main = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _lbl_iconchat = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _img_prof = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
RemoteObject _divi = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _lbl_topmsg = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _lbl_time = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _lbl_unread = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _red = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
RemoteObject _bg = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
RemoteObject _lbl_sef = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("Parent", _parent);
Debug.locals.put("ViewType", _viewtype);
 BA.debugLineNum = 170;BA.debugLine="Sub LV_onCreateViewHolder (Parent As Panel, ViewTy";
Debug.ShouldStop(512);
 BA.debugLineNum = 171;BA.debugLine="Parent.Color=Colors.White";
Debug.ShouldStop(1024);
_parent.runVoidMethod ("setColor",ac_lchats.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 172;BA.debugLine="Parent.Height=15%y";
Debug.ShouldStop(2048);
_parent.runMethod(true,"setHeight",ac_lchats.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 15)),ac_lchats.mostCurrent.activityBA));
 BA.debugLineNum = 174;BA.debugLine="Dim pnl_main As Panel";
Debug.ShouldStop(8192);
_pnl_main = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("pnl_main", _pnl_main);
 BA.debugLineNum = 175;BA.debugLine="pnl_main.Initialize(\"\")";
Debug.ShouldStop(16384);
_pnl_main.runVoidMethod ("Initialize",ac_lchats.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 176;BA.debugLine="pnl_main.Color=Colors.White";
Debug.ShouldStop(32768);
_pnl_main.runVoidMethod ("setColor",ac_lchats.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 177;BA.debugLine="Parent.AddView(pnl_main,2%x,2%x,Parent.Width-4%x,";
Debug.ShouldStop(65536);
_parent.runVoidMethod ("AddView",(Object)((_pnl_main.getObject())),(Object)(ac_lchats.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),ac_lchats.mostCurrent.activityBA)),(Object)(ac_lchats.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),ac_lchats.mostCurrent.activityBA)),(Object)(RemoteObject.solve(new RemoteObject[] {_parent.runMethod(true,"getWidth"),ac_lchats.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 4)),ac_lchats.mostCurrent.activityBA)}, "-",1, 1)),(Object)(ac_lchats.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 15)),ac_lchats.mostCurrent.activityBA)));
 BA.debugLineNum = 179;BA.debugLine="Dim lbl As Label: lbl.Initialize(\"lbl\")";
Debug.ShouldStop(262144);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 179;BA.debugLine="Dim lbl As Label: lbl.Initialize(\"lbl\")";
Debug.ShouldStop(262144);
_lbl.runVoidMethod ("Initialize",ac_lchats.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("lbl")));
 BA.debugLineNum = 180;BA.debugLine="lbl.TextColor = Colors.Black : lbl.TextSize = 18";
Debug.ShouldStop(524288);
_lbl.runMethod(true,"setTextColor",ac_lchats.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 180;BA.debugLine="lbl.TextColor = Colors.Black : lbl.TextSize = 18";
Debug.ShouldStop(524288);
_lbl.runMethod(true,"setTextSize",BA.numberCast(float.class, 18));
 BA.debugLineNum = 181;BA.debugLine="lbl.Gravity=Gravity.RIGHT+Gravity.CENTER_VERTICAL";
Debug.ShouldStop(1048576);
_lbl.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {ac_lchats.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT"),ac_lchats.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")}, "+",1, 1));
 BA.debugLineNum = 182;BA.debugLine="lbl.TextSize=14";
Debug.ShouldStop(2097152);
_lbl.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 184;BA.debugLine="pnl_main.AddView(lbl,2%x,5dip,pnl_main.Width-17%x";
Debug.ShouldStop(8388608);
_pnl_main.runVoidMethod ("AddView",(Object)((_lbl.getObject())),(Object)(ac_lchats.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),ac_lchats.mostCurrent.activityBA)),(Object)(ac_lchats.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))),(Object)(RemoteObject.solve(new RemoteObject[] {_pnl_main.runMethod(true,"getWidth"),ac_lchats.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 17)),ac_lchats.mostCurrent.activityBA)}, "-",1, 1)),(Object)(ac_lchats.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),ac_lchats.mostCurrent.activityBA)));
 BA.debugLineNum = 186;BA.debugLine="Dim lbl_iconchat As Label: lbl_iconchat.Initializ";
Debug.ShouldStop(33554432);
_lbl_iconchat = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl_iconchat", _lbl_iconchat);
 BA.debugLineNum = 186;BA.debugLine="Dim lbl_iconchat As Label: lbl_iconchat.Initializ";
Debug.ShouldStop(33554432);
_lbl_iconchat.runVoidMethod ("Initialize",ac_lchats.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("lbl_iconchat")));
 BA.debugLineNum = 187;BA.debugLine="lbl_iconchat.TextColor = Colors.Black : lbl_iconc";
Debug.ShouldStop(67108864);
_lbl_iconchat.runMethod(true,"setTextColor",ac_lchats.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 187;BA.debugLine="lbl_iconchat.TextColor = Colors.Black : lbl_iconc";
Debug.ShouldStop(67108864);
_lbl_iconchat.runMethod(true,"setTextSize",BA.numberCast(float.class, 30));
 BA.debugLineNum = 188;BA.debugLine="pnl_main.AddView(lbl_iconchat,5%x,5%x,10%x,10%x)";
Debug.ShouldStop(134217728);
_pnl_main.runVoidMethod ("AddView",(Object)((_lbl_iconchat.getObject())),(Object)(ac_lchats.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),ac_lchats.mostCurrent.activityBA)),(Object)(ac_lchats.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),ac_lchats.mostCurrent.activityBA)),(Object)(ac_lchats.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),ac_lchats.mostCurrent.activityBA)),(Object)(ac_lchats.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),ac_lchats.mostCurrent.activityBA)));
 BA.debugLineNum = 192;BA.debugLine="Dim img_prof As ImageView";
Debug.ShouldStop(-2147483648);
_img_prof = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");Debug.locals.put("img_prof", _img_prof);
 BA.debugLineNum = 193;BA.debugLine="img_prof.Initialize(\"img_prof\")";
Debug.ShouldStop(1);
_img_prof.runVoidMethod ("Initialize",ac_lchats.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("img_prof")));
 BA.debugLineNum = 195;BA.debugLine="img_prof.Gravity=Gravity.FILL";
Debug.ShouldStop(4);
_img_prof.runMethod(true,"setGravity",ac_lchats.mostCurrent.__c.getField(false,"Gravity").getField(true,"FILL"));
 BA.debugLineNum = 196;BA.debugLine="pnl_main.AddView(img_prof,pnl_main.Width-13%x,5di";
Debug.ShouldStop(8);
_pnl_main.runVoidMethod ("AddView",(Object)((_img_prof.getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {_pnl_main.runMethod(true,"getWidth"),ac_lchats.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 13)),ac_lchats.mostCurrent.activityBA)}, "-",1, 1)),(Object)(ac_lchats.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))),(Object)(ac_lchats.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 12)),ac_lchats.mostCurrent.activityBA)),(Object)(ac_lchats.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 12)),ac_lchats.mostCurrent.activityBA)));
 BA.debugLineNum = 198;BA.debugLine="Dim divi As Panel: divi.Initialize(\"divi\")";
Debug.ShouldStop(32);
_divi = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("divi", _divi);
 BA.debugLineNum = 198;BA.debugLine="Dim divi As Panel: divi.Initialize(\"divi\")";
Debug.ShouldStop(32);
_divi.runVoidMethod ("Initialize",ac_lchats.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("divi")));
 BA.debugLineNum = 199;BA.debugLine="divi.Color=0xFFE1E5E6";
Debug.ShouldStop(64);
_divi.runVoidMethod ("setColor",BA.numberCast(int.class, 0xffe1e5e6));
 BA.debugLineNum = 200;BA.debugLine="pnl_main.AddView(divi,0,15%y,100%x-78dip,1dip)";
Debug.ShouldStop(128);
_pnl_main.runVoidMethod ("AddView",(Object)((_divi.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(ac_lchats.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 15)),ac_lchats.mostCurrent.activityBA)),(Object)(RemoteObject.solve(new RemoteObject[] {ac_lchats.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),ac_lchats.mostCurrent.activityBA),ac_lchats.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 78)))}, "-",1, 1)),(Object)(ac_lchats.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))));
 BA.debugLineNum = 202;BA.debugLine="Dim lbl_topmsg As Label: lbl_topmsg.Initialize(\"l";
Debug.ShouldStop(512);
_lbl_topmsg = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl_topmsg", _lbl_topmsg);
 BA.debugLineNum = 202;BA.debugLine="Dim lbl_topmsg As Label: lbl_topmsg.Initialize(\"l";
Debug.ShouldStop(512);
_lbl_topmsg.runVoidMethod ("Initialize",ac_lchats.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("lbl_topmsg")));
 BA.debugLineNum = 203;BA.debugLine="lbl_topmsg.TextColor = 0xFFABACAE : lbl_topmsg.Te";
Debug.ShouldStop(1024);
_lbl_topmsg.runMethod(true,"setTextColor",BA.numberCast(int.class, 0xffabacae));
 BA.debugLineNum = 203;BA.debugLine="lbl_topmsg.TextColor = 0xFFABACAE : lbl_topmsg.Te";
Debug.ShouldStop(1024);
_lbl_topmsg.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 204;BA.debugLine="lbl_topmsg.Gravity=Gravity.RIGHT";
Debug.ShouldStop(2048);
_lbl_topmsg.runMethod(true,"setGravity",ac_lchats.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT"));
 BA.debugLineNum = 205;BA.debugLine="lbl_topmsg.Visible=False";
Debug.ShouldStop(4096);
_lbl_topmsg.runMethod(true,"setVisible",ac_lchats.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 206;BA.debugLine="pnl_main.AddView(lbl_topmsg,30dip,40dip,100%x-110";
Debug.ShouldStop(8192);
_pnl_main.runVoidMethod ("AddView",(Object)((_lbl_topmsg.getObject())),(Object)(ac_lchats.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30)))),(Object)(ac_lchats.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))),(Object)(RemoteObject.solve(new RemoteObject[] {ac_lchats.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),ac_lchats.mostCurrent.activityBA),ac_lchats.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 110)))}, "-",1, 1)),(Object)(ac_lchats.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))));
 BA.debugLineNum = 208;BA.debugLine="Dim lbl_time As Label: lbl_time.Initialize(\"lbl_t";
Debug.ShouldStop(32768);
_lbl_time = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl_time", _lbl_time);
 BA.debugLineNum = 208;BA.debugLine="Dim lbl_time As Label: lbl_time.Initialize(\"lbl_t";
Debug.ShouldStop(32768);
_lbl_time.runVoidMethod ("Initialize",ac_lchats.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("lbl_time")));
 BA.debugLineNum = 209;BA.debugLine="lbl_time.TextColor = 0xFFABACAE : lbl_time.TextSi";
Debug.ShouldStop(65536);
_lbl_time.runMethod(true,"setTextColor",BA.numberCast(int.class, 0xffabacae));
 BA.debugLineNum = 209;BA.debugLine="lbl_time.TextColor = 0xFFABACAE : lbl_time.TextSi";
Debug.ShouldStop(65536);
_lbl_time.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 211;BA.debugLine="lbl_time.Visible=False";
Debug.ShouldStop(262144);
_lbl_time.runMethod(true,"setVisible",ac_lchats.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 212;BA.debugLine="pnl_main.AddView(lbl_time,5dip,10dip,100dip,20dip";
Debug.ShouldStop(524288);
_pnl_main.runVoidMethod ("AddView",(Object)((_lbl_time.getObject())),(Object)(ac_lchats.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))),(Object)(ac_lchats.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))),(Object)(ac_lchats.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100)))),(Object)(ac_lchats.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))));
 BA.debugLineNum = 214;BA.debugLine="Dim lbl_unread As Label: lbl_unread.Initialize(\"l";
Debug.ShouldStop(2097152);
_lbl_unread = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl_unread", _lbl_unread);
 BA.debugLineNum = 214;BA.debugLine="Dim lbl_unread As Label: lbl_unread.Initialize(\"l";
Debug.ShouldStop(2097152);
_lbl_unread.runVoidMethod ("Initialize",ac_lchats.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("lbl_unread")));
 BA.debugLineNum = 215;BA.debugLine="lbl_unread.TextColor = 0xFFFFFFFF : lbl_unread.Te";
Debug.ShouldStop(4194304);
_lbl_unread.runMethod(true,"setTextColor",BA.numberCast(int.class, 0xffffffff));
 BA.debugLineNum = 215;BA.debugLine="lbl_unread.TextColor = 0xFFFFFFFF : lbl_unread.Te";
Debug.ShouldStop(4194304);
_lbl_unread.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 216;BA.debugLine="Dim red As ColorDrawable";
Debug.ShouldStop(8388608);
_red = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("red", _red);
 BA.debugLineNum = 217;BA.debugLine="red.Initialize(0xFF1EF47C,60)";
Debug.ShouldStop(16777216);
_red.runVoidMethod ("Initialize",(Object)(BA.numberCast(int.class, 0xff1ef47c)),(Object)(BA.numberCast(int.class, 60)));
 BA.debugLineNum = 218;BA.debugLine="lbl_unread.Background=red";
Debug.ShouldStop(33554432);
_lbl_unread.runMethod(false,"setBackground",(_red.getObject()));
 BA.debugLineNum = 219;BA.debugLine="lbl_unread.Gravity=Gravity.CENTER";
Debug.ShouldStop(67108864);
_lbl_unread.runMethod(true,"setGravity",ac_lchats.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 220;BA.debugLine="lbl_unread.Visible=False";
Debug.ShouldStop(134217728);
_lbl_unread.runMethod(true,"setVisible",ac_lchats.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 221;BA.debugLine="pnl_main.AddView(lbl_unread,10dip,40dip,20dip,20d";
Debug.ShouldStop(268435456);
_pnl_main.runVoidMethod ("AddView",(Object)((_lbl_unread.getObject())),(Object)(ac_lchats.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))),(Object)(ac_lchats.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))),(Object)(ac_lchats.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))),(Object)(ac_lchats.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))));
 BA.debugLineNum = 223;BA.debugLine="Dim bg As ColorDrawable";
Debug.ShouldStop(1073741824);
_bg = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("bg", _bg);
 BA.debugLineNum = 224;BA.debugLine="bg.Initialize2(0xFFE3192E,5dip,2dip,0xFFEC5765)";
Debug.ShouldStop(-2147483648);
_bg.runVoidMethod ("Initialize2",(Object)(BA.numberCast(int.class, 0xffe3192e)),(Object)(ac_lchats.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))),(Object)(ac_lchats.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))),(Object)(BA.numberCast(int.class, 0xffec5765)));
 BA.debugLineNum = 225;BA.debugLine="Dim lbl_sef As Label: lbl_sef.Initialize(\"lbl_sef";
Debug.ShouldStop(1);
_lbl_sef = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl_sef", _lbl_sef);
 BA.debugLineNum = 225;BA.debugLine="Dim lbl_sef As Label: lbl_sef.Initialize(\"lbl_sef";
Debug.ShouldStop(1);
_lbl_sef.runVoidMethod ("Initialize",ac_lchats.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("lbl_sef")));
 BA.debugLineNum = 226;BA.debugLine="lbl_sef.TextColor = Colors.White : lbl_sef.TextSi";
Debug.ShouldStop(2);
_lbl_sef.runMethod(true,"setTextColor",ac_lchats.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 226;BA.debugLine="lbl_sef.TextColor = Colors.White : lbl_sef.TextSi";
Debug.ShouldStop(2);
_lbl_sef.runMethod(true,"setTextSize",BA.numberCast(float.class, 18));
 BA.debugLineNum = 227;BA.debugLine="lbl_sef.Gravity=Gravity.CENTER_HORIZONTAL+Gravity";
Debug.ShouldStop(4);
_lbl_sef.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {ac_lchats.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL"),ac_lchats.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")}, "+",1, 1));
 BA.debugLineNum = 228;BA.debugLine="lbl_sef.TextSize=17";
Debug.ShouldStop(8);
_lbl_sef.runMethod(true,"setTextSize",BA.numberCast(float.class, 17));
 BA.debugLineNum = 229;BA.debugLine="lbl_sef.Text=\"سفارش\"";
Debug.ShouldStop(16);
_lbl_sef.runMethod(true,"setText",BA.ObjectToCharSequence("سفارش"));
 BA.debugLineNum = 230;BA.debugLine="lbl_sef.Background=bg";
Debug.ShouldStop(32);
_lbl_sef.runMethod(false,"setBackground",(_bg.getObject()));
 BA.debugLineNum = 232;BA.debugLine="pnl_main.AddView(lbl_sef,pnl_main.Width/2-5%x,img";
Debug.ShouldStop(128);
_pnl_main.runVoidMethod ("AddView",(Object)((_lbl_sef.getObject())),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_pnl_main.runMethod(true,"getWidth"),RemoteObject.createImmutable(2),ac_lchats.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),ac_lchats.mostCurrent.activityBA)}, "/-",1, 0))),(Object)(RemoteObject.solve(new RemoteObject[] {_img_prof.runMethod(true,"getTop"),_img_prof.runMethod(true,"getHeight"),ac_lchats.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 1)),ac_lchats.mostCurrent.activityBA)}, "++",2, 1)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_pnl_main.runMethod(true,"getWidth"),RemoteObject.createImmutable(2),ac_lchats.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),ac_lchats.mostCurrent.activityBA)}, "/-",1, 0))),(Object)(ac_lchats.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 8)),ac_lchats.mostCurrent.activityBA)));
 BA.debugLineNum = 234;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
		Debug.PushSubsStack("meno_Click (ac_lchats) ","ac_lchats",8,ac_lchats.mostCurrent.activityBA,ac_lchats.mostCurrent,775);
if (RapidSub.canDelegate("meno_click")) { return com.it.fome.ac_lchats.remoteMe.runUserSub(false, "ac_lchats","meno_click");}
 BA.debugLineNum = 775;BA.debugLine="Sub meno_Click";
Debug.ShouldStop(64);
 BA.debugLineNum = 776;BA.debugLine="mimeno.Initialize(\"mimeno\",Me)";
Debug.ShouldStop(128);
ac_lchats.mostCurrent._mimeno.runClassMethod (com.it.fome.mi_meno.class, "_initialize" /*RemoteObject*/ ,ac_lchats.mostCurrent.activityBA,(Object)(BA.ObjectToString("mimeno")),(Object)(ac_lchats.getObject()));
 BA.debugLineNum = 777;BA.debugLine="mimeno.addpnl";
Debug.ShouldStop(256);
ac_lchats.mostCurrent._mimeno.runClassMethod (com.it.fome.mi_meno.class, "_addpnl" /*RemoteObject*/ );
 BA.debugLineNum = 778;BA.debugLine="mimeno.open";
Debug.ShouldStop(512);
ac_lchats.mostCurrent._mimeno.runClassMethod (com.it.fome.mi_meno.class, "_open" /*RemoteObject*/ );
 BA.debugLineNum = 779;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mt_sef_newcoins(RemoteObject _news) throws Exception{
try {
		Debug.PushSubsStack("mt_sef_newcoins (ac_lchats) ","ac_lchats",8,ac_lchats.mostCurrent.activityBA,ac_lchats.mostCurrent,766);
if (RapidSub.canDelegate("mt_sef_newcoins")) { return com.it.fome.ac_lchats.remoteMe.runUserSub(false, "ac_lchats","mt_sef_newcoins", _news);}
RemoteObject _n_coins = RemoteObject.createImmutable(0L);
Debug.locals.put("news", _news);
 BA.debugLineNum = 766;BA.debugLine="Sub mt_sef_newcoins(news As String)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 767;BA.debugLine="Dim n_coins=news As Long";
Debug.ShouldStop(1073741824);
_n_coins = BA.numberCast(long.class, _news);Debug.locals.put("n_coins", _n_coins);Debug.locals.put("n_coins", _n_coins);
 BA.debugLineNum = 768;BA.debugLine="If n_coins>100 Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean(">",_n_coins,BA.numberCast(double.class, 100))) { 
 BA.debugLineNum = 769;BA.debugLine="lbl_nums.Text=\"سکه \"&NumberFormat(news,3,0)";
Debug.ShouldStop(1);
ac_lchats.mostCurrent._lbl_nums.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("سکه "),ac_lchats.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _news)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 0))))));
 }else {
 BA.debugLineNum = 771;BA.debugLine="lbl_nums.Text=\"سکه \"&news";
Debug.ShouldStop(4);
ac_lchats.mostCurrent._lbl_nums.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("سکه "),_news)));
 };
 BA.debugLineNum = 773;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pnl_dilogs_touch(RemoteObject _action,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("pnl_dilogs_Touch (ac_lchats) ","ac_lchats",8,ac_lchats.mostCurrent.activityBA,ac_lchats.mostCurrent,728);
if (RapidSub.canDelegate("pnl_dilogs_touch")) { return com.it.fome.ac_lchats.remoteMe.runUserSub(false, "ac_lchats","pnl_dilogs_touch", _action, _x, _y);}
Debug.locals.put("Action", _action);
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
 BA.debugLineNum = 728;BA.debugLine="Sub pnl_dilogs_Touch (Action As Int, X As Float, Y";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 729;BA.debugLine="show_pnldialogs(False,0)";
Debug.ShouldStop(16777216);
_show_pnldialogs(ac_lchats.mostCurrent.__c.getField(true,"False"),BA.numberCast(int.class, 0));
 BA.debugLineNum = 730;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
		Debug.PushSubsStack("prfn_onPostStringErrorListener (ac_lchats) ","ac_lchats",8,ac_lchats.mostCurrent.activityBA,ac_lchats.mostCurrent,618);
if (RapidSub.canDelegate("prfn_onpoststringerrorlistener")) { return com.it.fome.ac_lchats.remoteMe.runUserSub(false, "ac_lchats","prfn_onpoststringerrorlistener", _error, _tag);}
Debug.locals.put("Error", _error);
Debug.locals.put("Tag", _tag);
 BA.debugLineNum = 618;BA.debugLine="Sub prfn_onPostStringErrorListener(Error As Respon";
Debug.ShouldStop(512);
 BA.debugLineNum = 620;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(2048);
ac_lchats.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 621;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("prfn_onPostStringOkListener (ac_lchats) ","ac_lchats",8,ac_lchats.mostCurrent.activityBA,ac_lchats.mostCurrent,623);
if (RapidSub.canDelegate("prfn_onpoststringoklistener")) { return com.it.fome.ac_lchats.remoteMe.runUserSub(false, "ac_lchats","prfn_onpoststringoklistener", _result, _tag);}
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
Debug.locals.put("Tag", _tag);
 BA.debugLineNum = 623;BA.debugLine="Sub prfn_onPostStringOkListener(Result As String";
Debug.ShouldStop(16384);
 BA.debugLineNum = 625;BA.debugLine="Select Tag";
Debug.ShouldStop(65536);
switch (BA.switchObjectToInt(_tag,BA.ObjectToString("iuser"),BA.ObjectToString("getinsta"))) {
case 0: {
 BA.debugLineNum = 627;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(262144);
ac_lchats.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 628;BA.debugLine="Log(Result)";
Debug.ShouldStop(524288);
ac_lchats.mostCurrent.__c.runVoidMethod ("LogImpl","610420229",_result,0);
 break; }
case 1: {
 BA.debugLineNum = 631;BA.debugLine="Log(Result)";
Debug.ShouldStop(4194304);
ac_lchats.mostCurrent.__c.runVoidMethod ("LogImpl","610420232",_result,0);
 BA.debugLineNum = 632;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(8388608);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 633;BA.debugLine="parser.Initialize(Result)";
Debug.ShouldStop(16777216);
_parser.runVoidMethod ("Initialize",(Object)(_result));
 BA.debugLineNum = 634;BA.debugLine="Dim root As List = parser.NextArray";
Debug.ShouldStop(33554432);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_root = _parser.runMethod(false,"NextArray");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 635;BA.debugLine="For Each colroot As Map In root";
Debug.ShouldStop(67108864);
_colroot = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group10 = _root;
final int groupLen10 = group10.runMethod(true,"getSize").<Integer>get()
;int index10 = 0;
;
for (; index10 < groupLen10;index10++){
_colroot.setObject(group10.runMethod(false,"Get",index10));
Debug.locals.put("colroot", _colroot);
 BA.debugLineNum = 636;BA.debugLine="Dim Result As String = colroot.Get(\"result\")";
Debug.ShouldStop(134217728);
_result = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("result")))));Debug.locals.put("Result", _result);Debug.locals.put("Result", _result);
 BA.debugLineNum = 637;BA.debugLine="Dim c_m As String = colroot.Get(\"c_m\")";
Debug.ShouldStop(268435456);
_c_m = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("c_m")))));Debug.locals.put("c_m", _c_m);Debug.locals.put("c_m", _c_m);
 BA.debugLineNum = 638;BA.debugLine="Dim uid As String = colroot.Get(\"uid\")";
Debug.ShouldStop(536870912);
_uid = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("uid")))));Debug.locals.put("uid", _uid);Debug.locals.put("uid", _uid);
 BA.debugLineNum = 639;BA.debugLine="Dim first_last As String = colroot.Get(\"first_";
Debug.ShouldStop(1073741824);
_first_last = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("first_last")))));Debug.locals.put("first_last", _first_last);Debug.locals.put("first_last", _first_last);
 BA.debugLineNum = 640;BA.debugLine="Dim id As String = colroot.Get(\"id\")";
Debug.ShouldStop(-2147483648);
_id = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 641;BA.debugLine="Dim userid As String = colroot.Get(\"userid\")";
Debug.ShouldStop(1);
_userid = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("userid")))));Debug.locals.put("userid", _userid);Debug.locals.put("userid", _userid);
 BA.debugLineNum = 642;BA.debugLine="Dim username As String = colroot.Get(\"username";
Debug.ShouldStop(2);
_username = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("username")))));Debug.locals.put("username", _username);Debug.locals.put("username", _username);
 BA.debugLineNum = 643;BA.debugLine="Dim c_ch As String = colroot.Get(\"c_ch\")";
Debug.ShouldStop(4);
_c_ch = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("c_ch")))));Debug.locals.put("c_ch", _c_ch);Debug.locals.put("c_ch", _c_ch);
 BA.debugLineNum = 645;BA.debugLine="Dim n_coins=c_m As Long";
Debug.ShouldStop(16);
_n_coins = BA.numberCast(long.class, _c_m);Debug.locals.put("n_coins", _n_coins);Debug.locals.put("n_coins", _n_coins);
 BA.debugLineNum = 646;BA.debugLine="If n_coins>100 Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean(">",_n_coins,BA.numberCast(double.class, 100))) { 
 BA.debugLineNum = 647;BA.debugLine="lbl_nums.Text=\"سکه \"&NumberFormat(c_m,3,0)";
Debug.ShouldStop(64);
ac_lchats.mostCurrent._lbl_nums.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("سکه "),ac_lchats.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _c_m)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 0))))));
 }else {
 BA.debugLineNum = 649;BA.debugLine="lbl_nums.Text=\"سکه \"&c_m";
Debug.ShouldStop(256);
ac_lchats.mostCurrent._lbl_nums.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("سکه "),_c_m)));
 };
 BA.debugLineNum = 653;BA.debugLine="sql1.ExecNonQuery(\"UPDATE tbl_coin set cm='\"&c";
Debug.ShouldStop(4096);
ac_lchats._sql1.runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE tbl_coin set cm='"),_c_m,RemoteObject.createImmutable("',cf='"),_c_ch,RemoteObject.createImmutable("' WHERE userid='"),ac_lchats._userid_t,RemoteObject.createImmutable("' "))));
 }
}Debug.locals.put("colroot", _colroot);
;
 break; }
}
;
 BA.debugLineNum = 659;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
 //BA.debugLineNum = 7;BA.debugLine="Type Adap_chats (chat_id As Long,img_isdwonload A";
;
 //BA.debugLineNum = 8;BA.debugLine="Dim listchats As List";
ac_lchats._listchats = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 9;BA.debugLine="Dim telegs As milad_telegramv3";
ac_lchats._telegs = RemoteObject.createNew ("com.mili.telegrams.teleg_warp");
 //BA.debugLineNum = 10;BA.debugLine="Private sql1 As SQL";
ac_lchats._sql1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL");
 //BA.debugLineNum = 11;BA.debugLine="Private cursor1 As Cursor";
ac_lchats._cursor1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
 //BA.debugLineNum = 12;BA.debugLine="Dim username_t ,userid_t As String";
ac_lchats._username_t = RemoteObject.createImmutable("");
ac_lchats._userid_t = RemoteObject.createImmutable("");
 //BA.debugLineNum = 13;BA.debugLine="Dim chatid As String";
ac_lchats._chatid = RemoteObject.createImmutable("");
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _req_getme(RemoteObject _userid) throws Exception{
try {
		Debug.PushSubsStack("req_getme (ac_lchats) ","ac_lchats",8,ac_lchats.mostCurrent.activityBA,ac_lchats.mostCurrent,600);
if (RapidSub.canDelegate("req_getme")) { return com.it.fome.ac_lchats.remoteMe.runUserSub(false, "ac_lchats","req_getme", _userid);}
RemoteObject _prfn = RemoteObject.declareNull("com.reza.sh.fastnet.Fastnet");
RemoteObject _post = RemoteObject.declareNull("com.reza.sh.fastnet.PostRequestRaper");
Debug.locals.put("userid", _userid);
 BA.debugLineNum = 600;BA.debugLine="Sub req_getme(userid As String)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 601;BA.debugLine="Dim prfn As PersianFastNetwork";
Debug.ShouldStop(16777216);
_prfn = RemoteObject.createNew ("com.reza.sh.fastnet.Fastnet");Debug.locals.put("prfn", _prfn);
 BA.debugLineNum = 602;BA.debugLine="prfn.initialize(\"prfn\")";
Debug.ShouldStop(33554432);
_prfn.runVoidMethod ("initialize",ac_lchats.processBA,(Object)(RemoteObject.createImmutable("prfn")));
 BA.debugLineNum = 604;BA.debugLine="Dim post As PostRequest";
Debug.ShouldStop(134217728);
_post = RemoteObject.createNew ("com.reza.sh.fastnet.PostRequestRaper");Debug.locals.put("post", _post);
 BA.debugLineNum = 605;BA.debugLine="post=prfn.BuildPostQuery(\"http://filework.ir/INST";
Debug.ShouldStop(268435456);
_post = _prfn.runMethod(false,"BuildPostQuery",(Object)(BA.ObjectToString("http://filework.ir/INSTAFOLLOW/api/req.php")),(Object)(RemoteObject.createImmutable("getinsta")));Debug.locals.put("post", _post);
 BA.debugLineNum = 607;BA.debugLine="post.addHeder(\"User-Agent\",\"Dalvik/1.6.0 (Linux;";
Debug.ShouldStop(1073741824);
_post.runVoidMethod ("addHeder",(Object)(BA.ObjectToString("User-Agent")),(Object)(RemoteObject.createImmutable("Dalvik/1.6.0 (Linux; U; Android 4.4.4; SM-A700FD Build/KTU84P)")));
 BA.debugLineNum = 609;BA.debugLine="post.addParametrs(\"ui\",\"1\")";
Debug.ShouldStop(1);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("ui")),(Object)(RemoteObject.createImmutable("1")));
 BA.debugLineNum = 610;BA.debugLine="post.addParametrs(\"userid\",userid_t)";
Debug.ShouldStop(2);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("userid")),(Object)(ac_lchats._userid_t));
 BA.debugLineNum = 612;BA.debugLine="post.addParametrs(\"req\",\"get_acct\")";
Debug.ShouldStop(8);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("req")),(Object)(RemoteObject.createImmutable("get_acct")));
 BA.debugLineNum = 615;BA.debugLine="post.executRequestAsString";
Debug.ShouldStop(64);
_post.runVoidMethod ("executRequestAsString");
 BA.debugLineNum = 616;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
		Debug.PushSubsStack("SetAnimation (ac_lchats) ","ac_lchats",8,ac_lchats.mostCurrent.activityBA,ac_lchats.mostCurrent,588);
if (RapidSub.canDelegate("setanimation")) { return com.it.fome.ac_lchats.remoteMe.runUserSub(false, "ac_lchats","setanimation", _inanimation, _outanimation);}
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
RemoteObject _package = RemoteObject.createImmutable("");
RemoteObject _in = RemoteObject.createImmutable(0);
RemoteObject _out = RemoteObject.createImmutable(0);
Debug.locals.put("InAnimation", _inanimation);
Debug.locals.put("OutAnimation", _outanimation);
 BA.debugLineNum = 588;BA.debugLine="Sub SetAnimation(InAnimation As String, OutAnimati";
Debug.ShouldStop(2048);
 BA.debugLineNum = 589;BA.debugLine="Dim r As Reflector";
Debug.ShouldStop(4096);
_r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("r", _r);
 BA.debugLineNum = 590;BA.debugLine="Dim package As String";
Debug.ShouldStop(8192);
_package = RemoteObject.createImmutable("");Debug.locals.put("package", _package);
 BA.debugLineNum = 591;BA.debugLine="Dim In, out As Int";
Debug.ShouldStop(16384);
_in = RemoteObject.createImmutable(0);Debug.locals.put("In", _in);
_out = RemoteObject.createImmutable(0);Debug.locals.put("out", _out);
 BA.debugLineNum = 592;BA.debugLine="package = r.GetStaticField(\"anywheresoftware.b4a.";
Debug.ShouldStop(32768);
_package = BA.ObjectToString(_r.runMethod(false,"GetStaticField",(Object)(BA.ObjectToString("anywheresoftware.b4a.BA")),(Object)(RemoteObject.createImmutable("packageName"))));Debug.locals.put("package", _package);
 BA.debugLineNum = 593;BA.debugLine="In = r.GetStaticField(package & \".R$anim\", InAnim";
Debug.ShouldStop(65536);
_in = BA.numberCast(int.class, _r.runMethod(false,"GetStaticField",(Object)(RemoteObject.concat(_package,RemoteObject.createImmutable(".R$anim"))),(Object)(_inanimation)));Debug.locals.put("In", _in);
 BA.debugLineNum = 594;BA.debugLine="out = r.GetStaticField(package & \".R$anim\", OutAn";
Debug.ShouldStop(131072);
_out = BA.numberCast(int.class, _r.runMethod(false,"GetStaticField",(Object)(RemoteObject.concat(_package,RemoteObject.createImmutable(".R$anim"))),(Object)(_outanimation)));Debug.locals.put("out", _out);
 BA.debugLineNum = 595;BA.debugLine="r.Target = r.GetActivity";
Debug.ShouldStop(262144);
_r.setField ("Target",(_r.runMethod(false,"GetActivity",ac_lchats.processBA)));
 BA.debugLineNum = 596;BA.debugLine="r.RunMethod4(\"overridePendingTransition\", Array A";
Debug.ShouldStop(524288);
_r.runVoidMethod ("RunMethod4",(Object)(BA.ObjectToString("overridePendingTransition")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_in),(_out)})),(Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.ObjectToString("java.lang.int"),RemoteObject.createImmutable("java.lang.int")})));
 BA.debugLineNum = 597;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _show_pnldialogs(RemoteObject _isshsowa,RemoteObject _typesef) throws Exception{
try {
		Debug.PushSubsStack("show_pnldialogs (ac_lchats) ","ac_lchats",8,ac_lchats.mostCurrent.activityBA,ac_lchats.mostCurrent,661);
if (RapidSub.canDelegate("show_pnldialogs")) { return com.it.fome.ac_lchats.remoteMe.runUserSub(false, "ac_lchats","show_pnldialogs", _isshsowa, _typesef);}
RemoteObject _lbl_s = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _mt_sef = RemoteObject.declareNull("com.it.fome.mt_sef");
RemoteObject _lbl_x = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _bg = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
RemoteObject _bgs = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
RemoteObject _pnlmain = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _pp = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
Debug.locals.put("isshsowa", _isshsowa);
Debug.locals.put("typesef", _typesef);
 BA.debugLineNum = 661;BA.debugLine="Sub show_pnldialogs(isshsowa As Boolean,typesef As";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 662;BA.debugLine="Select isshsowa";
Debug.ShouldStop(2097152);
switch (BA.switchObjectToInt(_isshsowa,ac_lchats.mostCurrent.__c.getField(true,"True"),ac_lchats.mostCurrent.__c.getField(true,"False"))) {
case 0: {
 BA.debugLineNum = 664;BA.debugLine="pnl_dilogs.Initialize(\"pnl_dilogs\")";
Debug.ShouldStop(8388608);
ac_lchats.mostCurrent._pnl_dilogs.runVoidMethod ("Initialize",ac_lchats.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("pnl_dilogs")));
 BA.debugLineNum = 665;BA.debugLine="pnl_dilogs.Color=Colors.LightGray";
Debug.ShouldStop(16777216);
ac_lchats.mostCurrent._pnl_dilogs.runVoidMethod ("setColor",ac_lchats.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray"));
 BA.debugLineNum = 666;BA.debugLine="Activity.AddView(pnl_dilogs,0,20%x,100%x,100%y-";
Debug.ShouldStop(33554432);
ac_lchats.mostCurrent._activity.runVoidMethod ("AddView",(Object)((ac_lchats.mostCurrent._pnl_dilogs.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(ac_lchats.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 20)),ac_lchats.mostCurrent.activityBA)),(Object)(ac_lchats.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),ac_lchats.mostCurrent.activityBA)),(Object)(RemoteObject.solve(new RemoteObject[] {ac_lchats.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),ac_lchats.mostCurrent.activityBA),ac_lchats.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 20)),ac_lchats.mostCurrent.activityBA)}, "-",1, 1)));
 BA.debugLineNum = 668;BA.debugLine="Dim lbl_s As Label";
Debug.ShouldStop(134217728);
_lbl_s = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl_s", _lbl_s);
 BA.debugLineNum = 669;BA.debugLine="lbl_s.Initialize(\"lbl_nums\")";
Debug.ShouldStop(268435456);
_lbl_s.runVoidMethod ("Initialize",ac_lchats.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("lbl_nums")));
 BA.debugLineNum = 670;BA.debugLine="lbl_s.TextColor=Colors.White";
Debug.ShouldStop(536870912);
_lbl_s.runMethod(true,"setTextColor",ac_lchats.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 671;BA.debugLine="lbl_s.TextSize=20";
Debug.ShouldStop(1073741824);
_lbl_s.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 672;BA.debugLine="lbl_s.Typeface=Typeface.LoadFromAssets(\"iran_sa";
Debug.ShouldStop(-2147483648);
_lbl_s.runMethod(false,"setTypeface",ac_lchats.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("iran_sans.ttf"))));
 BA.debugLineNum = 673;BA.debugLine="lbl_s.Gravity=Gravity.CENTER_VERTICAL+Gravity.R";
Debug.ShouldStop(1);
_lbl_s.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {ac_lchats.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL"),ac_lchats.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT")}, "+",1, 1));
 BA.debugLineNum = 674;BA.debugLine="pnl_dilogs.AddView(lbl_s,2%x,0,pnl_dilogs.Width";
Debug.ShouldStop(2);
ac_lchats.mostCurrent._pnl_dilogs.runVoidMethod ("AddView",(Object)((_lbl_s.getObject())),(Object)(ac_lchats.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),ac_lchats.mostCurrent.activityBA)),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {ac_lchats.mostCurrent._pnl_dilogs.runMethod(true,"getWidth"),ac_lchats.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),ac_lchats.mostCurrent.activityBA)}, "-",1, 1)),(Object)(ac_lchats.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),ac_lchats.mostCurrent.activityBA)));
 BA.debugLineNum = 676;BA.debugLine="Dim mt_sef As mt_sef";
Debug.ShouldStop(8);
_mt_sef = RemoteObject.createNew ("com.it.fome.mt_sef");Debug.locals.put("mt_sef", _mt_sef);
 BA.debugLineNum = 677;BA.debugLine="mt_sef.Initialize(\"mt_sef\",Me)";
Debug.ShouldStop(16);
_mt_sef.runClassMethod (com.it.fome.mt_sef.class, "_initialize" /*RemoteObject*/ ,ac_lchats.mostCurrent.activityBA,(Object)(BA.ObjectToString("mt_sef")),(Object)(ac_lchats.getObject()));
 BA.debugLineNum = 679;BA.debugLine="Select typesef";
Debug.ShouldStop(64);
switch (BA.switchObjectToInt(_typesef,BA.numberCast(int.class, 0),BA.numberCast(int.class, 3))) {
case 0: {
 BA.debugLineNum = 681;BA.debugLine="lbl_s.Text=\"سفارش ممبر\"";
Debug.ShouldStop(256);
_lbl_s.runMethod(true,"setText",BA.ObjectToCharSequence("سفارش ممبر"));
 BA.debugLineNum = 682;BA.debugLine="mt_sef.username_target=username_target";
Debug.ShouldStop(512);
_mt_sef.setField ("_username_target" /*RemoteObject*/ ,ac_lchats.mostCurrent._username_target);
 break; }
case 1: {
 BA.debugLineNum = 685;BA.debugLine="lbl_s.Text=\"سفارش ویو\"";
Debug.ShouldStop(4096);
_lbl_s.runMethod(true,"setText",BA.ObjectToCharSequence("سفارش ویو"));
 BA.debugLineNum = 686;BA.debugLine="mt_sef.username_target=chatid";
Debug.ShouldStop(8192);
_mt_sef.setField ("_username_target" /*RemoteObject*/ ,ac_lchats._chatid);
 BA.debugLineNum = 687;BA.debugLine="mt_sef.idchannel_t=idchannel_target";
Debug.ShouldStop(16384);
_mt_sef.setField ("_idchannel_t" /*RemoteObject*/ ,ac_lchats.mostCurrent._idchannel_target);
 BA.debugLineNum = 688;BA.debugLine="mt_sef.titelchat_target=title_target";
Debug.ShouldStop(32768);
_mt_sef.setField ("_titelchat_target" /*RemoteObject*/ ,ac_lchats.mostCurrent._title_target);
 BA.debugLineNum = 689;BA.debugLine="mt_sef.us_name=us_name";
Debug.ShouldStop(65536);
_mt_sef.setField ("_us_name" /*RemoteObject*/ ,ac_lchats.mostCurrent._us_name);
 break; }
}
;
 BA.debugLineNum = 692;BA.debugLine="Dim lbl_x As Label";
Debug.ShouldStop(524288);
_lbl_x = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl_x", _lbl_x);
 BA.debugLineNum = 693;BA.debugLine="lbl_x.Initialize(\"lbl_x\")";
Debug.ShouldStop(1048576);
_lbl_x.runVoidMethod ("Initialize",ac_lchats.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("lbl_x")));
 BA.debugLineNum = 694;BA.debugLine="lbl_x.TextColor=Colors.White";
Debug.ShouldStop(2097152);
_lbl_x.runMethod(true,"setTextColor",ac_lchats.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 695;BA.debugLine="lbl_x.TextSize=28";
Debug.ShouldStop(4194304);
_lbl_x.runMethod(true,"setTextSize",BA.numberCast(float.class, 28));
 BA.debugLineNum = 696;BA.debugLine="lbl_x.Typeface=Typeface.MATERIALICONS";
Debug.ShouldStop(8388608);
_lbl_x.runMethod(false,"setTypeface",ac_lchats.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"getMATERIALICONS"));
 BA.debugLineNum = 697;BA.debugLine="lbl_x.Gravity=Gravity.CENTER_VERTICAL+Gravity.C";
Debug.ShouldStop(16777216);
_lbl_x.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {ac_lchats.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL"),ac_lchats.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL")}, "+",1, 1));
 BA.debugLineNum = 698;BA.debugLine="lbl_x.Text=Chr(0xE5C8)";
Debug.ShouldStop(33554432);
_lbl_x.runMethod(true,"setText",BA.ObjectToCharSequence(ac_lchats.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xe5c8)))));
 BA.debugLineNum = 699;BA.debugLine="pnl_dilogs.AddView(lbl_x,pnl_dilogs.Width-15%x,";
Debug.ShouldStop(67108864);
ac_lchats.mostCurrent._pnl_dilogs.runVoidMethod ("AddView",(Object)((_lbl_x.getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {ac_lchats.mostCurrent._pnl_dilogs.runMethod(true,"getWidth"),ac_lchats.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),ac_lchats.mostCurrent.activityBA)}, "-",1, 1)),(Object)(BA.numberCast(int.class, 0)),(Object)(ac_lchats.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),ac_lchats.mostCurrent.activityBA)),(Object)(ac_lchats.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),ac_lchats.mostCurrent.activityBA)));
 BA.debugLineNum = 701;BA.debugLine="Dim bg As ColorDrawable";
Debug.ShouldStop(268435456);
_bg = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("bg", _bg);
 BA.debugLineNum = 702;BA.debugLine="bg.Initialize2(Colors.White,5dip,2dip,Colors.Li";
Debug.ShouldStop(536870912);
_bg.runVoidMethod ("Initialize2",(Object)(ac_lchats.mostCurrent.__c.getField(false,"Colors").getField(true,"White")),(Object)(ac_lchats.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))),(Object)(ac_lchats.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))),(Object)(ac_lchats.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray")));
 BA.debugLineNum = 704;BA.debugLine="Dim bgs As ColorDrawable";
Debug.ShouldStop(-2147483648);
_bgs = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("bgs", _bgs);
 BA.debugLineNum = 705;BA.debugLine="bgs.Initialize2(Colors.White,5%x,2dip,Colors.Li";
Debug.ShouldStop(1);
_bgs.runVoidMethod ("Initialize2",(Object)(ac_lchats.mostCurrent.__c.getField(false,"Colors").getField(true,"White")),(Object)(ac_lchats.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),ac_lchats.mostCurrent.activityBA)),(Object)(ac_lchats.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))),(Object)(ac_lchats.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray")));
 BA.debugLineNum = 707;BA.debugLine="Dim pnlmain As Panel";
Debug.ShouldStop(4);
_pnlmain = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("pnlmain", _pnlmain);
 BA.debugLineNum = 708;BA.debugLine="pnlmain.Initialize(\"\")";
Debug.ShouldStop(8);
_pnlmain.runVoidMethod ("Initialize",ac_lchats.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 709;BA.debugLine="pnlmain.Background=bg";
Debug.ShouldStop(16);
_pnlmain.runMethod(false,"setBackground",(_bg.getObject()));
 BA.debugLineNum = 710;BA.debugLine="pnl_dilogs.AddView(pnlmain,5%x,10%x,pnl_dilogs.";
Debug.ShouldStop(32);
ac_lchats.mostCurrent._pnl_dilogs.runVoidMethod ("AddView",(Object)((_pnlmain.getObject())),(Object)(ac_lchats.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),ac_lchats.mostCurrent.activityBA)),(Object)(ac_lchats.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),ac_lchats.mostCurrent.activityBA)),(Object)(RemoteObject.solve(new RemoteObject[] {ac_lchats.mostCurrent._pnl_dilogs.runMethod(true,"getWidth"),ac_lchats.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),ac_lchats.mostCurrent.activityBA)}, "-",1, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {ac_lchats.mostCurrent._pnl_dilogs.runMethod(true,"getHeight"),ac_lchats.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 20)),ac_lchats.mostCurrent.activityBA)}, "-",1, 1)));
 BA.debugLineNum = 712;BA.debugLine="Dim pp As Panel";
Debug.ShouldStop(128);
_pp = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("pp", _pp);
 BA.debugLineNum = 713;BA.debugLine="pp.Initialize(\"pp\")";
Debug.ShouldStop(256);
_pp.runVoidMethod ("Initialize",ac_lchats.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("pp")));
 BA.debugLineNum = 714;BA.debugLine="pnlmain.AddView(pp,3%x,2%x,pnlmain.Width-6%x,pn";
Debug.ShouldStop(512);
_pnlmain.runVoidMethod ("AddView",(Object)((_pp.getObject())),(Object)(ac_lchats.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 3)),ac_lchats.mostCurrent.activityBA)),(Object)(ac_lchats.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),ac_lchats.mostCurrent.activityBA)),(Object)(RemoteObject.solve(new RemoteObject[] {_pnlmain.runMethod(true,"getWidth"),ac_lchats.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 6)),ac_lchats.mostCurrent.activityBA)}, "-",1, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {_pnlmain.runMethod(true,"getHeight"),ac_lchats.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 4)),ac_lchats.mostCurrent.activityBA)}, "-",1, 1)));
 BA.debugLineNum = 716;BA.debugLine="mt_sef.Type_sef=typesef";
Debug.ShouldStop(2048);
_mt_sef.setField ("_type_sef" /*RemoteObject*/ ,_typesef);
 BA.debugLineNum = 717;BA.debugLine="mt_sef.img_address_target=img_target";
Debug.ShouldStop(4096);
_mt_sef.setField ("_img_address_target" /*RemoteObject*/ ,ac_lchats.mostCurrent._img_target);
 BA.debugLineNum = 718;BA.debugLine="mt_sef.addpnl(pp)";
Debug.ShouldStop(8192);
_mt_sef.runClassMethod (com.it.fome.mt_sef.class, "_addpnl" /*RemoteObject*/ ,(Object)(_pp));
 break; }
case 1: {
 BA.debugLineNum = 721;BA.debugLine="If pnl_dilogs.IsInitialized=True And pnl_dilogs";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",ac_lchats.mostCurrent._pnl_dilogs.runMethod(true,"IsInitialized"),ac_lchats.mostCurrent.__c.getField(true,"True")) && RemoteObject.solveBoolean("=",ac_lchats.mostCurrent._pnl_dilogs.runMethod(true,"getEnabled"),ac_lchats.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 722;BA.debugLine="pnl_dilogs.Visible=False";
Debug.ShouldStop(131072);
ac_lchats.mostCurrent._pnl_dilogs.runMethod(true,"setVisible",ac_lchats.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 723;BA.debugLine="pnl_dilogs.Enabled=False";
Debug.ShouldStop(262144);
ac_lchats.mostCurrent._pnl_dilogs.runMethod(true,"setEnabled",ac_lchats.mostCurrent.__c.getField(true,"False"));
 };
 break; }
}
;
 BA.debugLineNum = 726;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _telegs_getchat(RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("telegs_getchat (ac_lchats) ","ac_lchats",8,ac_lchats.mostCurrent.activityBA,ac_lchats.mostCurrent,384);
if (RapidSub.canDelegate("telegs_getchat")) { return com.it.fome.ac_lchats.remoteMe.runUserSub(false, "ac_lchats","telegs_getchat", _value);}
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colroot = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _photosmall_id = RemoteObject.createImmutable(0);
RemoteObject _chat_id = RemoteObject.createImmutable(0L);
RemoteObject _title = RemoteObject.createImmutable("");
RemoteObject _chatconstructor = RemoteObject.createImmutable("");
RemoteObject _topdate = RemoteObject.createImmutable("");
RemoteObject _chat_type = RemoteObject.createImmutable("");
RemoteObject _channel_info = RemoteObject.createImmutable("");
RemoteObject _group_info = RemoteObject.createImmutable("");
RemoteObject _privatechat_info = RemoteObject.createImmutable("");
RemoteObject _replytomessageid = RemoteObject.createImmutable("");
RemoteObject _lastreadinboxmessageid = RemoteObject.createImmutable("");
RemoteObject _lastreadoutboxmessageid = RemoteObject.createImmutable("");
RemoteObject _unreadcount = RemoteObject.createImmutable("");
RemoteObject _photo_id = RemoteObject.createImmutable("");
RemoteObject _photo_l_isdownloadingcompleted = RemoteObject.createImmutable("");
RemoteObject _photo_l_path = RemoteObject.createImmutable("");
RemoteObject _photo_r_id = RemoteObject.createImmutable("");
RemoteObject _content = RemoteObject.createImmutable(0L);
RemoteObject _topmasg_type = RemoteObject.createImmutable("");
RemoteObject _topmsg_info = RemoteObject.createImmutable("");
RemoteObject _parser_a = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _root_a = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _id_channelinfo = RemoteObject.createImmutable(0);
RemoteObject _issupergroup = RemoteObject.createImmutable("");
RemoteObject _item = RemoteObject.declareNull("com.it.fome.ac_lchats._adap_chats");
Debug.locals.put("value", _value);
 BA.debugLineNum = 384;BA.debugLine="Sub telegs_getchat(value As String)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 386;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(2);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 387;BA.debugLine="parser.Initialize(value)";
Debug.ShouldStop(4);
_parser.runVoidMethod ("Initialize",(Object)(_value));
 BA.debugLineNum = 388;BA.debugLine="Dim root As List = parser.NextArray";
Debug.ShouldStop(8);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_root = _parser.runMethod(false,"NextArray");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 389;BA.debugLine="For Each colroot As Map In root";
Debug.ShouldStop(16);
_colroot = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group4 = _root;
final int groupLen4 = group4.runMethod(true,"getSize").<Integer>get()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_colroot.setObject(group4.runMethod(false,"Get",index4));
Debug.locals.put("colroot", _colroot);
 BA.debugLineNum = 390;BA.debugLine="Dim photosmall_id As Int";
Debug.ShouldStop(32);
_photosmall_id = RemoteObject.createImmutable(0);Debug.locals.put("photosmall_id", _photosmall_id);
 BA.debugLineNum = 391;BA.debugLine="If colroot.Get(\"photosmall_id\")=Null Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("n",_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photosmall_id")))))) { 
 }else {
 BA.debugLineNum = 393;BA.debugLine="photosmall_id	=colroot.Get(\"photosmall_id\")";
Debug.ShouldStop(256);
_photosmall_id = BA.numberCast(int.class, _colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photosmall_id")))));Debug.locals.put("photosmall_id", _photosmall_id);
 };
 BA.debugLineNum = 395;BA.debugLine="Dim chat_id As Long = colroot.Get(\"chat_id\")";
Debug.ShouldStop(1024);
_chat_id = BA.numberCast(long.class, _colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("chat_id")))));Debug.locals.put("chat_id", _chat_id);Debug.locals.put("chat_id", _chat_id);
 BA.debugLineNum = 396;BA.debugLine="Dim title As String = colroot.Get(\"title\")";
Debug.ShouldStop(2048);
_title = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("title")))));Debug.locals.put("title", _title);Debug.locals.put("title", _title);
 BA.debugLineNum = 397;BA.debugLine="Dim ChatConstructor As String = colroot.Get(\"Cha";
Debug.ShouldStop(4096);
_chatconstructor = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ChatConstructor")))));Debug.locals.put("ChatConstructor", _chatconstructor);Debug.locals.put("ChatConstructor", _chatconstructor);
 BA.debugLineNum = 398;BA.debugLine="Dim topdate As String = colroot.Get(\"topdate\")";
Debug.ShouldStop(8192);
_topdate = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("topdate")))));Debug.locals.put("topdate", _topdate);Debug.locals.put("topdate", _topdate);
 BA.debugLineNum = 399;BA.debugLine="Dim chat_type As String = colroot.Get(\"chat_type";
Debug.ShouldStop(16384);
_chat_type = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("chat_type")))));Debug.locals.put("chat_type", _chat_type);Debug.locals.put("chat_type", _chat_type);
 BA.debugLineNum = 400;BA.debugLine="Dim channel_info As String = colroot.Get(\"channe";
Debug.ShouldStop(32768);
_channel_info = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("channel_info")))));Debug.locals.put("channel_info", _channel_info);Debug.locals.put("channel_info", _channel_info);
 BA.debugLineNum = 401;BA.debugLine="Dim group_info As String = colroot.Get(\"group_in";
Debug.ShouldStop(65536);
_group_info = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("group_info")))));Debug.locals.put("group_info", _group_info);Debug.locals.put("group_info", _group_info);
 BA.debugLineNum = 402;BA.debugLine="Dim privatechat_info As String = colroot.Get(\"pr";
Debug.ShouldStop(131072);
_privatechat_info = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("privatechat_info")))));Debug.locals.put("privatechat_info", _privatechat_info);Debug.locals.put("privatechat_info", _privatechat_info);
 BA.debugLineNum = 403;BA.debugLine="Dim replyToMessageId As String = colroot.Get(\"re";
Debug.ShouldStop(262144);
_replytomessageid = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("replyToMessageId")))));Debug.locals.put("replyToMessageId", _replytomessageid);Debug.locals.put("replyToMessageId", _replytomessageid);
 BA.debugLineNum = 404;BA.debugLine="Dim lastReadInboxMessageId As String = colroot.G";
Debug.ShouldStop(524288);
_lastreadinboxmessageid = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lastReadInboxMessageId")))));Debug.locals.put("lastReadInboxMessageId", _lastreadinboxmessageid);Debug.locals.put("lastReadInboxMessageId", _lastreadinboxmessageid);
 BA.debugLineNum = 405;BA.debugLine="Dim lastReadOutboxMessageId As String = colroot.";
Debug.ShouldStop(1048576);
_lastreadoutboxmessageid = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lastReadOutboxMessageId")))));Debug.locals.put("lastReadOutboxMessageId", _lastreadoutboxmessageid);Debug.locals.put("lastReadOutboxMessageId", _lastreadoutboxmessageid);
 BA.debugLineNum = 406;BA.debugLine="Dim unreadCount As String = colroot.Get(\"unreadC";
Debug.ShouldStop(2097152);
_unreadcount = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("unreadCount")))));Debug.locals.put("unreadCount", _unreadcount);Debug.locals.put("unreadCount", _unreadcount);
 BA.debugLineNum = 408;BA.debugLine="Dim photo_id As String = colroot.Get(\"photo_id\")";
Debug.ShouldStop(8388608);
_photo_id = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photo_id")))));Debug.locals.put("photo_id", _photo_id);Debug.locals.put("photo_id", _photo_id);
 BA.debugLineNum = 409;BA.debugLine="Dim photo_l_isDownloadingCompleted As String = c";
Debug.ShouldStop(16777216);
_photo_l_isdownloadingcompleted = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photo_l_isDownloadingCompleted")))));Debug.locals.put("photo_l_isDownloadingCompleted", _photo_l_isdownloadingcompleted);Debug.locals.put("photo_l_isDownloadingCompleted", _photo_l_isdownloadingcompleted);
 BA.debugLineNum = 410;BA.debugLine="Dim photo_l_path As String = colroot.Get(\"photo_";
Debug.ShouldStop(33554432);
_photo_l_path = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photo_l_path")))));Debug.locals.put("photo_l_path", _photo_l_path);Debug.locals.put("photo_l_path", _photo_l_path);
 BA.debugLineNum = 411;BA.debugLine="Dim photo_r_id As String = colroot.Get(\"photo_r_";
Debug.ShouldStop(67108864);
_photo_r_id = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photo_r_id")))));Debug.locals.put("photo_r_id", _photo_r_id);Debug.locals.put("photo_r_id", _photo_r_id);
 BA.debugLineNum = 417;BA.debugLine="Log(\"chat : \"&title&\"reply :\"& replyToMessageId&";
Debug.ShouldStop(1);
ac_lchats.mostCurrent.__c.runVoidMethod ("LogImpl","69895969",RemoteObject.concat(RemoteObject.createImmutable("chat : "),_title,RemoteObject.createImmutable("reply :"),_replytomessageid,RemoteObject.createImmutable(" lastin : "),_lastreadinboxmessageid,RemoteObject.createImmutable(" lastout : "),_lastreadoutboxmessageid,RemoteObject.createImmutable(" unread : "),_unreadcount),0);
 BA.debugLineNum = 419;BA.debugLine="Dim content As Long = colroot.Get(\"content\")";
Debug.ShouldStop(4);
_content = BA.numberCast(long.class, _colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("content")))));Debug.locals.put("content", _content);Debug.locals.put("content", _content);
 BA.debugLineNum = 422;BA.debugLine="Dim topmasg_type As String = colroot.Get(\"topmas";
Debug.ShouldStop(32);
_topmasg_type = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("topmasg_type")))));Debug.locals.put("topmasg_type", _topmasg_type);Debug.locals.put("topmasg_type", _topmasg_type);
 BA.debugLineNum = 423;BA.debugLine="Dim topmsg_info As String = colroot.Get(\"topmsg_";
Debug.ShouldStop(64);
_topmsg_info = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("topmsg_info")))));Debug.locals.put("topmsg_info", _topmsg_info);Debug.locals.put("topmsg_info", _topmsg_info);
 BA.debugLineNum = 425;BA.debugLine="Select ChatConstructor";
Debug.ShouldStop(256);
switch (BA.switchObjectToInt(_chatconstructor,BA.ObjectToString("955152366"))) {
case 0: {
 BA.debugLineNum = 427;BA.debugLine="Dim parser_a As JSONParser";
Debug.ShouldStop(1024);
_parser_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser_a", _parser_a);
 BA.debugLineNum = 428;BA.debugLine="parser_a.Initialize(channel_info)";
Debug.ShouldStop(2048);
_parser_a.runVoidMethod ("Initialize",(Object)(_channel_info));
 BA.debugLineNum = 429;BA.debugLine="Dim root_a As Map = parser_a.NextObject";
Debug.ShouldStop(4096);
_root_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root_a = _parser_a.runMethod(false,"NextObject");Debug.locals.put("root_a", _root_a);Debug.locals.put("root_a", _root_a);
 BA.debugLineNum = 430;BA.debugLine="Dim id_channelinfo As Int = root_a.Get(\"superg";
Debug.ShouldStop(8192);
_id_channelinfo = BA.numberCast(int.class, _root_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("supergroupId")))));Debug.locals.put("id_channelinfo", _id_channelinfo);Debug.locals.put("id_channelinfo", _id_channelinfo);
 BA.debugLineNum = 431;BA.debugLine="Dim isSupergroup As String = root_a.Get(\"isCha";
Debug.ShouldStop(16384);
_issupergroup = BA.ObjectToString(_root_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("isChannel")))));Debug.locals.put("isSupergroup", _issupergroup);Debug.locals.put("isSupergroup", _issupergroup);
 BA.debugLineNum = 433;BA.debugLine="If isSupergroup=True Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_issupergroup,BA.ObjectToString(ac_lchats.mostCurrent.__c.getField(true,"True")))) { 
 BA.debugLineNum = 437;BA.debugLine="Dim Item As Adap_chats";
Debug.ShouldStop(1048576);
_item = RemoteObject.createNew ("com.it.fome.ac_lchats._adap_chats");Debug.locals.put("Item", _item);
 BA.debugLineNum = 438;BA.debugLine="Item.chat_id=chat_id";
Debug.ShouldStop(2097152);
_item.setField ("chat_id" /*RemoteObject*/ ,_chat_id);
 BA.debugLineNum = 439;BA.debugLine="Item.title=title";
Debug.ShouldStop(4194304);
_item.setField ("title" /*RemoteObject*/ ,_title);
 BA.debugLineNum = 440;BA.debugLine="Item.topdate=topdate";
Debug.ShouldStop(8388608);
_item.setField ("topdate" /*RemoteObject*/ ,_topdate);
 BA.debugLineNum = 441;BA.debugLine="Item.chat_type=chat_type";
Debug.ShouldStop(16777216);
_item.setField ("chat_type" /*RemoteObject*/ ,_chat_type);
 BA.debugLineNum = 442;BA.debugLine="Item.channel_info=channel_info";
Debug.ShouldStop(33554432);
_item.setField ("channel_info" /*RemoteObject*/ ,_channel_info);
 BA.debugLineNum = 443;BA.debugLine="Item.group_info=group_info";
Debug.ShouldStop(67108864);
_item.setField ("group_info" /*RemoteObject*/ ,_group_info);
 BA.debugLineNum = 444;BA.debugLine="Item.privatechat_info=privatechat_info";
Debug.ShouldStop(134217728);
_item.setField ("privatechat_info" /*RemoteObject*/ ,_privatechat_info);
 BA.debugLineNum = 445;BA.debugLine="Item.topmasg_type=topmasg_type";
Debug.ShouldStop(268435456);
_item.setField ("topmasg_type" /*RemoteObject*/ ,_topmasg_type);
 BA.debugLineNum = 446;BA.debugLine="Item.topmsg_info=topmsg_info";
Debug.ShouldStop(536870912);
_item.setField ("topmsg_info" /*RemoteObject*/ ,_topmsg_info);
 BA.debugLineNum = 447;BA.debugLine="Item.unreadCount=unreadCount";
Debug.ShouldStop(1073741824);
_item.setField ("unreadCount" /*RemoteObject*/ ,BA.numberCast(int.class, _unreadcount));
 BA.debugLineNum = 448;BA.debugLine="Item.ChatConstructor=ChatConstructor";
Debug.ShouldStop(-2147483648);
_item.setField ("ChatConstructor" /*RemoteObject*/ ,_chatconstructor);
 BA.debugLineNum = 450;BA.debugLine="Item.img_isdwonload=photo_l_isDownloadingComp";
Debug.ShouldStop(2);
_item.setField ("img_isdwonload" /*RemoteObject*/ ,_photo_l_isdownloadingcompleted);
 BA.debugLineNum = 451;BA.debugLine="Item.img_id=photo_id";
Debug.ShouldStop(4);
_item.setField ("img_id" /*RemoteObject*/ ,_photo_id);
 BA.debugLineNum = 452;BA.debugLine="Item.img_remote=photo_r_id";
Debug.ShouldStop(8);
_item.setField ("img_remote" /*RemoteObject*/ ,_photo_r_id);
 BA.debugLineNum = 453;BA.debugLine="Item.img_my=photo_l_path";
Debug.ShouldStop(16);
_item.setField ("img_my" /*RemoteObject*/ ,_photo_l_path);
 BA.debugLineNum = 454;BA.debugLine="listchats.Add(Item)";
Debug.ShouldStop(32);
ac_lchats._listchats.runVoidMethod ("Add",(Object)((_item)));
 BA.debugLineNum = 455;BA.debugLine="LV.notifyItemAdded";
Debug.ShouldStop(64);
ac_lchats.mostCurrent._lv.runVoidMethodAndSync ("notifyItemAdded");
 }else {
 };
 break; }
}
;
 }
}Debug.locals.put("colroot", _colroot);
;
 BA.debugLineNum = 468;BA.debugLine="LogColor(\"meg_chatId \"&chat_id,Colors.Blue)";
Debug.ShouldStop(524288);
ac_lchats.mostCurrent.__c.runVoidMethod ("LogImpl","69896020",RemoteObject.concat(RemoteObject.createImmutable("meg_chatId "),_chat_id),ac_lchats.mostCurrent.__c.getField(false,"Colors").getField(true,"Blue"));
 BA.debugLineNum = 470;BA.debugLine="LV.notifyDataSetChanged";
Debug.ShouldStop(2097152);
ac_lchats.mostCurrent._lv.runVoidMethodAndSync ("notifyDataSetChanged");
 BA.debugLineNum = 472;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _telegs_getsupergroup(RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("telegs_getsupergroup (ac_lchats) ","ac_lchats",8,ac_lchats.mostCurrent.activityBA,ac_lchats.mostCurrent,737);
if (RapidSub.canDelegate("telegs_getsupergroup")) { return com.it.fome.ac_lchats.remoteMe.runUserSub(false, "ac_lchats","telegs_getsupergroup", _value);}
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _date = RemoteObject.createImmutable(0);
RemoteObject _isverified = RemoteObject.createImmutable("");
RemoteObject _ischannel = RemoteObject.createImmutable("");
RemoteObject _signmessages = RemoteObject.createImmutable("");
RemoteObject _membercount = RemoteObject.createImmutable(0);
RemoteObject _id = RemoteObject.createImmutable(0);
RemoteObject _restrictionreason = RemoteObject.createImmutable("");
RemoteObject _anyonecaninvite = RemoteObject.createImmutable("");
RemoteObject _usernames = RemoteObject.createImmutable("");
RemoteObject _status = RemoteObject.createImmutable("");
RemoteObject _builder = RemoteObject.declareNull("de.amberhome.materialdialogs.MaterialDialogBuilderWrapper");
Debug.locals.put("value", _value);
 BA.debugLineNum = 737;BA.debugLine="Sub telegs_getsupergroup(value As String)";
Debug.ShouldStop(1);
 BA.debugLineNum = 738;BA.debugLine="Log(value)";
Debug.ShouldStop(2);
ac_lchats.mostCurrent.__c.runVoidMethod ("LogImpl","610682369",_value,0);
 BA.debugLineNum = 739;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(4);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 740;BA.debugLine="parser.Initialize(value)";
Debug.ShouldStop(8);
_parser.runVoidMethod ("Initialize",(Object)(_value));
 BA.debugLineNum = 741;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(16);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 742;BA.debugLine="Dim date As Int = root.Get(\"date\")";
Debug.ShouldStop(32);
_date = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("date")))));Debug.locals.put("date", _date);Debug.locals.put("date", _date);
 BA.debugLineNum = 743;BA.debugLine="Dim isVerified As String = root.Get(\"isVerified\")";
Debug.ShouldStop(64);
_isverified = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("isVerified")))));Debug.locals.put("isVerified", _isverified);Debug.locals.put("isVerified", _isverified);
 BA.debugLineNum = 744;BA.debugLine="Dim isChannel As String = root.Get(\"isChannel\")";
Debug.ShouldStop(128);
_ischannel = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("isChannel")))));Debug.locals.put("isChannel", _ischannel);Debug.locals.put("isChannel", _ischannel);
 BA.debugLineNum = 745;BA.debugLine="Dim signMessages As String = root.Get(\"signMessag";
Debug.ShouldStop(256);
_signmessages = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("signMessages")))));Debug.locals.put("signMessages", _signmessages);Debug.locals.put("signMessages", _signmessages);
 BA.debugLineNum = 746;BA.debugLine="Dim memberCount As Int = root.Get(\"memberCount\")";
Debug.ShouldStop(512);
_membercount = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("memberCount")))));Debug.locals.put("memberCount", _membercount);Debug.locals.put("memberCount", _membercount);
 BA.debugLineNum = 747;BA.debugLine="Dim id As Int = root.Get(\"id\")";
Debug.ShouldStop(1024);
_id = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 748;BA.debugLine="Dim restrictionReason As String = root.Get(\"restr";
Debug.ShouldStop(2048);
_restrictionreason = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("restrictionReason")))));Debug.locals.put("restrictionReason", _restrictionreason);Debug.locals.put("restrictionReason", _restrictionreason);
 BA.debugLineNum = 749;BA.debugLine="Dim anyoneCanInvite As String = root.Get(\"anyoneC";
Debug.ShouldStop(4096);
_anyonecaninvite = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("anyoneCanInvite")))));Debug.locals.put("anyoneCanInvite", _anyonecaninvite);Debug.locals.put("anyoneCanInvite", _anyonecaninvite);
 BA.debugLineNum = 750;BA.debugLine="Dim usernames As String = root.Get(\"username\")";
Debug.ShouldStop(8192);
_usernames = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("username")))));Debug.locals.put("usernames", _usernames);Debug.locals.put("usernames", _usernames);
 BA.debugLineNum = 751;BA.debugLine="Dim status As String = root.Get(\"status\")";
Debug.ShouldStop(16384);
_status = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("status")))));Debug.locals.put("status", _status);Debug.locals.put("status", _status);
 BA.debugLineNum = 753;BA.debugLine="id_target=id";
Debug.ShouldStop(65536);
ac_lchats.mostCurrent._id_target = BA.NumberToString(_id);
 BA.debugLineNum = 754;BA.debugLine="username_target=usernames";
Debug.ShouldStop(131072);
ac_lchats.mostCurrent._username_target = _usernames;
 BA.debugLineNum = 756;BA.debugLine="us_name=usernames";
Debug.ShouldStop(524288);
ac_lchats.mostCurrent._us_name = _usernames;
 BA.debugLineNum = 757;BA.debugLine="Dim Builder As MaterialDialogBuilder";
Debug.ShouldStop(1048576);
_builder = RemoteObject.createNew ("de.amberhome.materialdialogs.MaterialDialogBuilderWrapper");Debug.locals.put("Builder", _builder);
 BA.debugLineNum = 758;BA.debugLine="Builder.Initialize(\"Dialog\")";
Debug.ShouldStop(2097152);
_builder.runVoidMethod ("Initialize",ac_lchats.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Dialog")));
 BA.debugLineNum = 760;BA.debugLine="Builder.Items(Array As String(\"سفارش ممبر برای کا";
Debug.ShouldStop(8388608);
_builder.runVoidMethod ("Items",(Object)((RemoteObject.createNewArray("String",new int[] {2},new Object[] {RemoteObject.concat(RemoteObject.createImmutable("سفارش ممبر برای کانال "),ac_lchats.mostCurrent._title_target),RemoteObject.concat(RemoteObject.createImmutable("سفارش ویو برای کانال "),ac_lchats.mostCurrent._title_target)}))));
 BA.debugLineNum = 761;BA.debugLine="Builder.ItemsCallback";
Debug.ShouldStop(16777216);
_builder.runVoidMethod ("ItemsCallback");
 BA.debugLineNum = 762;BA.debugLine="Builder.Show";
Debug.ShouldStop(33554432);
_builder.runVoidMethod ("Show");
 BA.debugLineNum = 764;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _telegs_update_file(RemoteObject _respon) throws Exception{
try {
		Debug.PushSubsStack("telegs_update_file (ac_lchats) ","ac_lchats",8,ac_lchats.mostCurrent.activityBA,ac_lchats.mostCurrent,475);
if (RapidSub.canDelegate("telegs_update_file")) { return com.it.fome.ac_lchats.remoteMe.runUserSub(false, "ac_lchats","telegs_update_file", _respon);}
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _photof_remot_id = RemoteObject.createImmutable("");
RemoteObject _photof_local_candownload = RemoteObject.createImmutable("");
RemoteObject _photof_local_isdownload = RemoteObject.createImmutable("");
RemoteObject _photof_expectedsize = RemoteObject.createImmutable(0);
RemoteObject _photof_remot_uploadsize = RemoteObject.createImmutable(0);
RemoteObject _photof_size = RemoteObject.createImmutable(0);
RemoteObject _photof_remot_isuploadactive = RemoteObject.createImmutable("");
RemoteObject _photof_local_perfexsize = RemoteObject.createImmutable(0);
RemoteObject _photof_remot_isuploadcomplit = RemoteObject.createImmutable("");
RemoteObject _photof_local_downloadsize = RemoteObject.createImmutable(0);
RemoteObject _photof_local_canbedlelte = RemoteObject.createImmutable("");
RemoteObject _photof_id = RemoteObject.createImmutable(0);
RemoteObject _photof_local_isdowloaded = RemoteObject.createImmutable("");
RemoteObject _photof_localpath = RemoteObject.createImmutable("");
int _ss = 0;
RemoteObject _itema = RemoteObject.declareNull("com.it.fome.ac_lchats._adap_chats");
Debug.locals.put("respon", _respon);
 BA.debugLineNum = 475;BA.debugLine="Sub telegs_update_file(respon As String)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 477;BA.debugLine="LogColor(respon,Colors.Blue)";
Debug.ShouldStop(268435456);
ac_lchats.mostCurrent.__c.runVoidMethod ("LogImpl","69961474",_respon,ac_lchats.mostCurrent.__c.getField(false,"Colors").getField(true,"Blue"));
 BA.debugLineNum = 478;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(536870912);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 479;BA.debugLine="parser.Initialize(respon)";
Debug.ShouldStop(1073741824);
_parser.runVoidMethod ("Initialize",(Object)(_respon));
 BA.debugLineNum = 480;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(-2147483648);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 481;BA.debugLine="Dim photof_remot_id As String = root.Get(\"photof_";
Debug.ShouldStop(1);
_photof_remot_id = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photof_remot_id")))));Debug.locals.put("photof_remot_id", _photof_remot_id);Debug.locals.put("photof_remot_id", _photof_remot_id);
 BA.debugLineNum = 482;BA.debugLine="Dim photof_local_candownload As String = root.Get";
Debug.ShouldStop(2);
_photof_local_candownload = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photof_local_candownload")))));Debug.locals.put("photof_local_candownload", _photof_local_candownload);Debug.locals.put("photof_local_candownload", _photof_local_candownload);
 BA.debugLineNum = 483;BA.debugLine="Dim photof_local_isdownload As String = root.Get(";
Debug.ShouldStop(4);
_photof_local_isdownload = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photof_local_isdownload")))));Debug.locals.put("photof_local_isdownload", _photof_local_isdownload);Debug.locals.put("photof_local_isdownload", _photof_local_isdownload);
 BA.debugLineNum = 484;BA.debugLine="Dim photof_expectedSize As Int = root.Get(\"photof";
Debug.ShouldStop(8);
_photof_expectedsize = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photof_expectedSize")))));Debug.locals.put("photof_expectedSize", _photof_expectedsize);Debug.locals.put("photof_expectedSize", _photof_expectedsize);
 BA.debugLineNum = 485;BA.debugLine="Dim photof_remot_uploadsize As Int = root.Get(\"ph";
Debug.ShouldStop(16);
_photof_remot_uploadsize = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photof_remot_uploadsize")))));Debug.locals.put("photof_remot_uploadsize", _photof_remot_uploadsize);Debug.locals.put("photof_remot_uploadsize", _photof_remot_uploadsize);
 BA.debugLineNum = 486;BA.debugLine="Dim photof_size As Int = root.Get(\"photof_size\")";
Debug.ShouldStop(32);
_photof_size = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photof_size")))));Debug.locals.put("photof_size", _photof_size);Debug.locals.put("photof_size", _photof_size);
 BA.debugLineNum = 487;BA.debugLine="Dim photof_remot_isuploadactive As String = root.";
Debug.ShouldStop(64);
_photof_remot_isuploadactive = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photof_remot_isuploadactive")))));Debug.locals.put("photof_remot_isuploadactive", _photof_remot_isuploadactive);Debug.locals.put("photof_remot_isuploadactive", _photof_remot_isuploadactive);
 BA.debugLineNum = 488;BA.debugLine="Dim photof_local_perfexsize As Int = root.Get(\"ph";
Debug.ShouldStop(128);
_photof_local_perfexsize = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photof_local_perfexsize")))));Debug.locals.put("photof_local_perfexsize", _photof_local_perfexsize);Debug.locals.put("photof_local_perfexsize", _photof_local_perfexsize);
 BA.debugLineNum = 489;BA.debugLine="Dim photof_remot_isuploadcomplit As String = root";
Debug.ShouldStop(256);
_photof_remot_isuploadcomplit = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photof_remot_isuploadcomplit")))));Debug.locals.put("photof_remot_isuploadcomplit", _photof_remot_isuploadcomplit);Debug.locals.put("photof_remot_isuploadcomplit", _photof_remot_isuploadcomplit);
 BA.debugLineNum = 490;BA.debugLine="Dim photof_local_downloadsize As Int = root.Get(\"";
Debug.ShouldStop(512);
_photof_local_downloadsize = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photof_local_downloadsize")))));Debug.locals.put("photof_local_downloadsize", _photof_local_downloadsize);Debug.locals.put("photof_local_downloadsize", _photof_local_downloadsize);
 BA.debugLineNum = 491;BA.debugLine="Dim photof_local_canbedlelte As String = root.Get";
Debug.ShouldStop(1024);
_photof_local_canbedlelte = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photof_local_canbedlelte")))));Debug.locals.put("photof_local_canbedlelte", _photof_local_canbedlelte);Debug.locals.put("photof_local_canbedlelte", _photof_local_canbedlelte);
 BA.debugLineNum = 492;BA.debugLine="Dim photof_id As Int = root.Get(\"photof_id\")";
Debug.ShouldStop(2048);
_photof_id = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photof_id")))));Debug.locals.put("photof_id", _photof_id);Debug.locals.put("photof_id", _photof_id);
 BA.debugLineNum = 493;BA.debugLine="Dim photof_local_isdowloaded As String = root.Get";
Debug.ShouldStop(4096);
_photof_local_isdowloaded = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photof_local_isdowloaded")))));Debug.locals.put("photof_local_isdowloaded", _photof_local_isdowloaded);Debug.locals.put("photof_local_isdowloaded", _photof_local_isdowloaded);
 BA.debugLineNum = 494;BA.debugLine="Dim photof_localpath As String = root.Get(\"photof";
Debug.ShouldStop(8192);
_photof_localpath = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photof_localpath")))));Debug.locals.put("photof_localpath", _photof_localpath);Debug.locals.put("photof_localpath", _photof_localpath);
 BA.debugLineNum = 496;BA.debugLine="Log(\" isdowloaded \"&photof_local_isdowloaded&\" si";
Debug.ShouldStop(32768);
ac_lchats.mostCurrent.__c.runVoidMethod ("LogImpl","69961493",RemoteObject.concat(RemoteObject.createImmutable(" isdowloaded "),_photof_local_isdowloaded,RemoteObject.createImmutable(" size "),_photof_size,RemoteObject.createImmutable(" dl size : "),_photof_local_downloadsize,RemoteObject.createImmutable(" is download "),_photof_local_isdownload,RemoteObject.createImmutable(" can dl : "),_photof_local_candownload),0);
 BA.debugLineNum = 497;BA.debugLine="Log(\"p : \"&photof_localpath)";
Debug.ShouldStop(65536);
ac_lchats.mostCurrent.__c.runVoidMethod ("LogImpl","69961494",RemoteObject.concat(RemoteObject.createImmutable("p : "),_photof_localpath),0);
 BA.debugLineNum = 499;BA.debugLine="Try";
Debug.ShouldStop(262144);
try { BA.debugLineNum = 500;BA.debugLine="If photof_local_isdowloaded=\"true\" Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_photof_local_isdowloaded,BA.ObjectToString("true"))) { 
 BA.debugLineNum = 501;BA.debugLine="For ss=0 To listchats.Size-1";
Debug.ShouldStop(1048576);
{
final int step23 = 1;
final int limit23 = RemoteObject.solve(new RemoteObject[] {ac_lchats._listchats.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_ss = 0 ;
for (;(step23 > 0 && _ss <= limit23) || (step23 < 0 && _ss >= limit23) ;_ss = ((int)(0 + _ss + step23))  ) {
Debug.locals.put("ss", _ss);
 BA.debugLineNum = 502;BA.debugLine="Dim Itema = listchats.Get(ss) As Adap_chats";
Debug.ShouldStop(2097152);
_itema = (ac_lchats._listchats.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _ss))));Debug.locals.put("Itema", _itema);Debug.locals.put("Itema", _itema);
 BA.debugLineNum = 503;BA.debugLine="If Itema.img_id=photof_id Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",_itema.getField(true,"img_id" /*RemoteObject*/ ),BA.NumberToString(_photof_id))) { 
 BA.debugLineNum = 504;BA.debugLine="Log(ss&\" img id ready!\")";
Debug.ShouldStop(8388608);
ac_lchats.mostCurrent.__c.runVoidMethod ("LogImpl","69961501",RemoteObject.concat(RemoteObject.createImmutable(_ss),RemoteObject.createImmutable(" img id ready!")),0);
 BA.debugLineNum = 506;BA.debugLine="Itema.img_my = photof_localpath";
Debug.ShouldStop(33554432);
_itema.setField ("img_my" /*RemoteObject*/ ,_photof_localpath);
 BA.debugLineNum = 507;BA.debugLine="Itema.img_isdwonload=photof_local_isdowloaded";
Debug.ShouldStop(67108864);
_itema.setField ("img_isdwonload" /*RemoteObject*/ ,_photof_local_isdowloaded);
 BA.debugLineNum = 508;BA.debugLine="Itema.img_remote=photof_remot_id";
Debug.ShouldStop(134217728);
_itema.setField ("img_remote" /*RemoteObject*/ ,_photof_remot_id);
 BA.debugLineNum = 509;BA.debugLine="Itema.img_id=photof_id";
Debug.ShouldStop(268435456);
_itema.setField ("img_id" /*RemoteObject*/ ,BA.NumberToString(_photof_id));
 BA.debugLineNum = 511;BA.debugLine="LV.notifyItemChanged(ss)";
Debug.ShouldStop(1073741824);
ac_lchats.mostCurrent._lv.runVoidMethod ("notifyItemChanged",(Object)(BA.numberCast(int.class, _ss)));
 };
 }
}Debug.locals.put("ss", _ss);
;
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e36) {
			BA.rdebugUtils.runVoidMethod("setLastException",ac_lchats.processBA, e36.toString()); BA.debugLineNum = 520;BA.debugLine="Log(LastException)";
Debug.ShouldStop(128);
ac_lchats.mostCurrent.__c.runVoidMethod ("LogImpl","69961517",BA.ObjectToString(ac_lchats.mostCurrent.__c.runMethod(false,"LastException",ac_lchats.mostCurrent.activityBA)),0);
 };
 BA.debugLineNum = 529;BA.debugLine="End Sub";
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