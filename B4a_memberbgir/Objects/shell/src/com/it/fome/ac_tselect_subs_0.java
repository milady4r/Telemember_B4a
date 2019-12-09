package com.it.fome;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class ac_tselect_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (ac_tselect) ","ac_tselect",7,ac_tselect.mostCurrent.activityBA,ac_tselect.mostCurrent,26);
if (RapidSub.canDelegate("activity_create")) { return com.it.fome.ac_tselect.remoteMe.runUserSub(false, "ac_tselect","activity_create", _firsttime);}
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _gradient1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.GradientDrawable");
RemoteObject _clrs = null;
RemoteObject _bkcolor = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
RemoteObject _bkcolor_st = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
RemoteObject _pnlb1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 26;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 29;BA.debugLine="If File.Exists(File.DirInternal,\"instadb.db\")=Fal";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",ac_tselect.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(ac_tselect.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("instadb.db"))),ac_tselect.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 30;BA.debugLine="File.Copy(File.DirAssets,\"instadb.db\",File.DirIn";
Debug.ShouldStop(536870912);
ac_tselect.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(ac_tselect.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("instadb.db")),(Object)(ac_tselect.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("instadb.db")));
 };
 BA.debugLineNum = 32;BA.debugLine="If sql1.IsInitialized=False Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",ac_tselect._sql1.runMethod(true,"IsInitialized"),ac_tselect.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 33;BA.debugLine="sql1.Initialize(File.DirInternal,\"instadb.db\",Fa";
Debug.ShouldStop(1);
ac_tselect._sql1.runVoidMethod ("Initialize",(Object)(ac_tselect.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("instadb.db")),(Object)(ac_tselect.mostCurrent.__c.getField(true,"False")));
 };
 BA.debugLineNum = 45;BA.debugLine="cursor1 = sql1.ExecQuery(\"SELECT * FROM tbl_tele";
Debug.ShouldStop(4096);
ac_tselect._cursor1.setObject(ac_tselect._sql1.runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT * FROM tbl_tele WHERE soich='1'"))));
 BA.debugLineNum = 46;BA.debugLine="Dim i As Int";
Debug.ShouldStop(8192);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 47;BA.debugLine="For i=0 To cursor1.RowCount-1";
Debug.ShouldStop(16384);
{
final int step9 = 1;
final int limit9 = RemoteObject.solve(new RemoteObject[] {ac_tselect._cursor1.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step9 > 0 && _i.<Integer>get().intValue() <= limit9) || (step9 < 0 && _i.<Integer>get().intValue() >= limit9) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step9))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 48;BA.debugLine="cursor1.Position=i";
Debug.ShouldStop(32768);
ac_tselect._cursor1.runMethod(true,"setPosition",_i);
 BA.debugLineNum = 49;BA.debugLine="userid_t=cursor1.GetString(\"userid\")";
Debug.ShouldStop(65536);
ac_tselect.mostCurrent._userid_t = ac_tselect._cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("userid")));
 BA.debugLineNum = 50;BA.debugLine="username_t=cursor1.GetString(\"username\")";
Debug.ShouldStop(131072);
ac_tselect.mostCurrent._username_t = ac_tselect._cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("username")));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 52;BA.debugLine="cursor1.Close";
Debug.ShouldStop(524288);
ac_tselect._cursor1.runVoidMethod ("Close");
 BA.debugLineNum = 53;BA.debugLine="ToastMessageShow(username_t,False)";
Debug.ShouldStop(1048576);
ac_tselect.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(ac_tselect.mostCurrent._username_t)),(Object)(ac_tselect.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 54;BA.debugLine="Log(userid_t)";
Debug.ShouldStop(2097152);
ac_tselect.mostCurrent.__c.runVoidMethod ("LogImpl","68585244",ac_tselect.mostCurrent._userid_t,0);
 BA.debugLineNum = 55;BA.debugLine="Dim Gradient1 As GradientDrawable";
Debug.ShouldStop(4194304);
_gradient1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.GradientDrawable");Debug.locals.put("Gradient1", _gradient1);
 BA.debugLineNum = 56;BA.debugLine="Dim Clrs(5) As Int";
Debug.ShouldStop(8388608);
_clrs = RemoteObject.createNewArray ("int", new int[] {5}, new Object[]{});Debug.locals.put("Clrs", _clrs);
 BA.debugLineNum = 57;BA.debugLine="Clrs(0) = 0xFFe8eaf6";
Debug.ShouldStop(16777216);
_clrs.setArrayElement (BA.numberCast(int.class, 0xffe8eaf6),BA.numberCast(int.class, 0));
 BA.debugLineNum = 58;BA.debugLine="Clrs(1) = 0xFFe8eaf6";
Debug.ShouldStop(33554432);
_clrs.setArrayElement (BA.numberCast(int.class, 0xffe8eaf6),BA.numberCast(int.class, 1));
 BA.debugLineNum = 59;BA.debugLine="Clrs(2) = 0xFFe8eaf6";
Debug.ShouldStop(67108864);
_clrs.setArrayElement (BA.numberCast(int.class, 0xffe8eaf6),BA.numberCast(int.class, 2));
 BA.debugLineNum = 60;BA.debugLine="Clrs(3) = 0xFF283593";
Debug.ShouldStop(134217728);
_clrs.setArrayElement (BA.numberCast(int.class, 0xff283593),BA.numberCast(int.class, 3));
 BA.debugLineNum = 61;BA.debugLine="Clrs(4) = 0xFF283593";
Debug.ShouldStop(268435456);
_clrs.setArrayElement (BA.numberCast(int.class, 0xff283593),BA.numberCast(int.class, 4));
 BA.debugLineNum = 63;BA.debugLine="Gradient1.Initialize(\"TOP_BOTTOM\", Clrs)";
Debug.ShouldStop(1073741824);
_gradient1.runVoidMethod ("Initialize",(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.drawable.GradientDrawable.Orientation"),"TOP_BOTTOM")),(Object)(_clrs));
 BA.debugLineNum = 64;BA.debugLine="Activity.Background=Gradient1";
Debug.ShouldStop(-2147483648);
ac_tselect.mostCurrent._activity.runMethod(false,"setBackground",(_gradient1.getObject()));
 BA.debugLineNum = 66;BA.debugLine="Dim bkcolor As ColorDrawable";
Debug.ShouldStop(2);
_bkcolor = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("bkcolor", _bkcolor);
 BA.debugLineNum = 67;BA.debugLine="bkcolor.Initialize2(Colors.White,15,2dip,Colors.L";
Debug.ShouldStop(4);
_bkcolor.runVoidMethod ("Initialize2",(Object)(ac_tselect.mostCurrent.__c.getField(false,"Colors").getField(true,"White")),(Object)(BA.numberCast(int.class, 15)),(Object)(ac_tselect.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))),(Object)(ac_tselect.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray")));
 BA.debugLineNum = 68;BA.debugLine="meno.Initialize(\"meno\")";
Debug.ShouldStop(8);
ac_tselect.mostCurrent._meno.runVoidMethod ("Initialize",ac_tselect.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("meno")));
 BA.debugLineNum = 69;BA.debugLine="meno.TextColor=Colors.DarkGray";
Debug.ShouldStop(16);
ac_tselect.mostCurrent._meno.runMethod(true,"setTextColor",ac_tselect.mostCurrent.__c.getField(false,"Colors").getField(true,"DarkGray"));
 BA.debugLineNum = 70;BA.debugLine="meno.TextSize=37";
Debug.ShouldStop(32);
ac_tselect.mostCurrent._meno.runMethod(true,"setTextSize",BA.numberCast(float.class, 37));
 BA.debugLineNum = 71;BA.debugLine="meno.Background=bkcolor";
Debug.ShouldStop(64);
ac_tselect.mostCurrent._meno.runMethod(false,"setBackground",(_bkcolor.getObject()));
 BA.debugLineNum = 72;BA.debugLine="meno.Typeface=Typeface.MATERIALICONS";
Debug.ShouldStop(128);
ac_tselect.mostCurrent._meno.runMethod(false,"setTypeface",ac_tselect.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"getMATERIALICONS"));
 BA.debugLineNum = 73;BA.debugLine="meno.Text=Chr(0xE3C7)";
Debug.ShouldStop(256);
ac_tselect.mostCurrent._meno.runMethod(true,"setText",BA.ObjectToCharSequence(ac_tselect.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xe3c7)))));
 BA.debugLineNum = 74;BA.debugLine="meno.Gravity=Gravity.CENTER_HORIZONTAL+Gravity.CE";
Debug.ShouldStop(512);
ac_tselect.mostCurrent._meno.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {ac_tselect.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL"),ac_tselect.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")}, "+",1, 1));
 BA.debugLineNum = 75;BA.debugLine="Activity.AddView(meno,3%x,3%x,12%x,12%x)";
Debug.ShouldStop(1024);
ac_tselect.mostCurrent._activity.runVoidMethod ("AddView",(Object)((ac_tselect.mostCurrent._meno.getObject())),(Object)(ac_tselect.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 3)),ac_tselect.mostCurrent.activityBA)),(Object)(ac_tselect.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 3)),ac_tselect.mostCurrent.activityBA)),(Object)(ac_tselect.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 12)),ac_tselect.mostCurrent.activityBA)),(Object)(ac_tselect.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 12)),ac_tselect.mostCurrent.activityBA)));
 BA.debugLineNum = 77;BA.debugLine="pnl_coins.Initialize(\"pnl_coins\")";
Debug.ShouldStop(4096);
ac_tselect.mostCurrent._pnl_coins.runVoidMethod ("Initialize",ac_tselect.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("pnl_coins")));
 BA.debugLineNum = 78;BA.debugLine="Activity.AddView(pnl_coins,50%x,3%x,50%x,12%x)";
Debug.ShouldStop(8192);
ac_tselect.mostCurrent._activity.runVoidMethod ("AddView",(Object)((ac_tselect.mostCurrent._pnl_coins.getObject())),(Object)(ac_tselect.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 50)),ac_tselect.mostCurrent.activityBA)),(Object)(ac_tselect.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 3)),ac_tselect.mostCurrent.activityBA)),(Object)(ac_tselect.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 50)),ac_tselect.mostCurrent.activityBA)),(Object)(ac_tselect.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 12)),ac_tselect.mostCurrent.activityBA)));
 BA.debugLineNum = 79;BA.debugLine="roundview.Initialize(pnl_coins)";
Debug.ShouldStop(16384);
ac_tselect.mostCurrent._roundview.runVoidMethod ("Initialize",ac_tselect.processBA,(Object)((ac_tselect.mostCurrent._pnl_coins.getObject())));
 BA.debugLineNum = 80;BA.debugLine="roundview.CornerRadius_BL=10%x";
Debug.ShouldStop(32768);
ac_tselect.mostCurrent._roundview.runMethod(true,"setCornerRadius_BL",ac_tselect.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),ac_tselect.mostCurrent.activityBA));
 BA.debugLineNum = 81;BA.debugLine="roundview.CornerRadius_TL=10%x";
Debug.ShouldStop(65536);
ac_tselect.mostCurrent._roundview.runMethod(true,"setCornerRadius_TL",ac_tselect.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),ac_tselect.mostCurrent.activityBA));
 BA.debugLineNum = 82;BA.debugLine="roundview.BackgroundColor=Colors.White";
Debug.ShouldStop(131072);
ac_tselect.mostCurrent._roundview.runMethod(true,"setBackgroundColor",ac_tselect.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 84;BA.debugLine="Dim bkcolor_st As ColorDrawable";
Debug.ShouldStop(524288);
_bkcolor_st = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("bkcolor_st", _bkcolor_st);
 BA.debugLineNum = 85;BA.debugLine="bkcolor_st.Initialize2(0xFFC67D00,50,4dip,0x82FFE";
Debug.ShouldStop(1048576);
_bkcolor_st.runVoidMethod ("Initialize2",(Object)(BA.numberCast(int.class, 0xffc67d00)),(Object)(BA.numberCast(int.class, 50)),(Object)(ac_tselect.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4)))),(Object)(BA.numberCast(int.class, 0x82ffe300)));
 BA.debugLineNum = 87;BA.debugLine="Dim pnlb1 As Panel";
Debug.ShouldStop(4194304);
_pnlb1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("pnlb1", _pnlb1);
 BA.debugLineNum = 88;BA.debugLine="pnlb1.Initialize(\"\")";
Debug.ShouldStop(8388608);
_pnlb1.runVoidMethod ("Initialize",ac_tselect.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 89;BA.debugLine="pnlb1.Color=0xFFFFC300";
Debug.ShouldStop(16777216);
_pnlb1.runVoidMethod ("setColor",BA.numberCast(int.class, 0xffffc300));
 BA.debugLineNum = 90;BA.debugLine="pnlb1.Background=bkcolor_st";
Debug.ShouldStop(33554432);
_pnlb1.runMethod(false,"setBackground",(_bkcolor_st.getObject()));
 BA.debugLineNum = 91;BA.debugLine="pnl_coins.AddView(pnlb1,pnl_coins.Width-11%x,1%x,";
Debug.ShouldStop(67108864);
ac_tselect.mostCurrent._pnl_coins.runVoidMethod ("AddView",(Object)((_pnlb1.getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {ac_tselect.mostCurrent._pnl_coins.runMethod(true,"getWidth"),ac_tselect.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 11)),ac_tselect.mostCurrent.activityBA)}, "-",1, 1)),(Object)(ac_tselect.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 1)),ac_tselect.mostCurrent.activityBA)),(Object)(ac_tselect.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),ac_tselect.mostCurrent.activityBA)),(Object)(RemoteObject.solve(new RemoteObject[] {ac_tselect.mostCurrent._pnl_coins.runMethod(true,"getHeight"),ac_tselect.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),ac_tselect.mostCurrent.activityBA)}, "-",1, 1)));
 BA.debugLineNum = 93;BA.debugLine="lbl_icon.Initialize(\"lbl_icon\")";
Debug.ShouldStop(268435456);
ac_tselect.mostCurrent._lbl_icon.runVoidMethod ("Initialize",ac_tselect.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("lbl_icon")));
 BA.debugLineNum = 94;BA.debugLine="lbl_icon.SetBackgroundImage(LoadBitmap(File.DirAs";
Debug.ShouldStop(536870912);
ac_tselect.mostCurrent._lbl_icon.runVoidMethod ("SetBackgroundImageNew",(Object)((ac_tselect.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(ac_tselect.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("coins.png"))).getObject())));
 BA.debugLineNum = 95;BA.debugLine="pnl_coins.AddView(lbl_icon,pnl_coins.Width-9%x,pn";
Debug.ShouldStop(1073741824);
ac_tselect.mostCurrent._pnl_coins.runVoidMethod ("AddView",(Object)((ac_tselect.mostCurrent._lbl_icon.getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {ac_tselect.mostCurrent._pnl_coins.runMethod(true,"getWidth"),ac_tselect.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 9)),ac_tselect.mostCurrent.activityBA)}, "-",1, 1)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {ac_tselect.mostCurrent._pnl_coins.runMethod(true,"getHeight"),RemoteObject.createImmutable(2),RemoteObject.createImmutable(2)}, "//",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {ac_tselect.mostCurrent._pnl_coins.runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {ac_tselect.mostCurrent._pnl_coins.runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "/",0, 0))));
 BA.debugLineNum = 97;BA.debugLine="lbl_nums.Initialize(\"lbl_nums\")";
Debug.ShouldStop(1);
ac_tselect.mostCurrent._lbl_nums.runVoidMethod ("Initialize",ac_tselect.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("lbl_nums")));
 BA.debugLineNum = 98;BA.debugLine="lbl_nums.TextColor=Colors.DarkGray";
Debug.ShouldStop(2);
ac_tselect.mostCurrent._lbl_nums.runMethod(true,"setTextColor",ac_tselect.mostCurrent.__c.getField(false,"Colors").getField(true,"DarkGray"));
 BA.debugLineNum = 99;BA.debugLine="lbl_nums.TextSize=20";
Debug.ShouldStop(4);
ac_tselect.mostCurrent._lbl_nums.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 100;BA.debugLine="lbl_nums.Typeface=Typeface.LoadFromAssets(\"iran_s";
Debug.ShouldStop(8);
ac_tselect.mostCurrent._lbl_nums.runMethod(false,"setTypeface",ac_tselect.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("iran_sans.ttf"))));
 BA.debugLineNum = 101;BA.debugLine="lbl_nums.Text=0&\" سکه\"";
Debug.ShouldStop(16);
ac_tselect.mostCurrent._lbl_nums.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable(0),RemoteObject.createImmutable(" سکه"))));
 BA.debugLineNum = 102;BA.debugLine="lbl_nums.Gravity=Gravity.CENTER_VERTICAL+Gravity.";
Debug.ShouldStop(32);
ac_tselect.mostCurrent._lbl_nums.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {ac_tselect.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL"),ac_tselect.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT")}, "+",1, 1));
 BA.debugLineNum = 103;BA.debugLine="pnl_coins.AddView(lbl_nums,2%x,0,pnl_coins.Width-";
Debug.ShouldStop(64);
ac_tselect.mostCurrent._pnl_coins.runVoidMethod ("AddView",(Object)((ac_tselect.mostCurrent._lbl_nums.getObject())),(Object)(ac_tselect.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),ac_tselect.mostCurrent.activityBA)),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {ac_tselect.mostCurrent._pnl_coins.runMethod(true,"getWidth"),ac_tselect.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),ac_tselect.mostCurrent.activityBA)}, "-",1, 1)),(Object)(ac_tselect.mostCurrent._pnl_coins.runMethod(true,"getHeight")));
 BA.debugLineNum = 105;BA.debugLine="LV.Initializer(\"LV\").ListView.Build";
Debug.ShouldStop(256);
ac_tselect.mostCurrent._lv.runMethod(false,"Initializer",ac_tselect.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("LV"))).runMethod(false,"ListView").runVoidMethod ("Build");
 BA.debugLineNum = 106;BA.debugLine="Activity.AddView(LV,0,10%y,100%x,90%y)";
Debug.ShouldStop(512);
ac_tselect.mostCurrent._activity.runVoidMethod ("AddView",(Object)((ac_tselect.mostCurrent._lv.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(ac_tselect.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),ac_tselect.mostCurrent.activityBA)),(Object)(ac_tselect.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),ac_tselect.mostCurrent.activityBA)),(Object)(ac_tselect.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 90)),ac_tselect.mostCurrent.activityBA)));
 BA.debugLineNum = 107;BA.debugLine="LV.Ripple.Color(0xFF5E23DE).Alpha(0.2f).Duration(";
Debug.ShouldStop(1024);
ac_tselect.mostCurrent._lv.runMethod(false,"Ripple").runMethod(false,"Color",(Object)(BA.numberCast(int.class, 0xff5e23de))).runMethod(false,"Alpha",(Object)(BA.numberCast(float.class, 0.2f))).runVoidMethod ("Duration",(Object)(BA.numberCast(int.class, 350)));
 BA.debugLineNum = 108;BA.debugLine="LV.Show";
Debug.ShouldStop(2048);
ac_tselect.mostCurrent._lv.runVoidMethodAndSync ("Show");
 BA.debugLineNum = 110;BA.debugLine="req_getme(userid_t)";
Debug.ShouldStop(8192);
_req_getme(ac_tselect.mostCurrent._userid_t);
 BA.debugLineNum = 111;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Activity_Pause (ac_tselect) ","ac_tselect",7,ac_tselect.mostCurrent.activityBA,ac_tselect.mostCurrent,118);
if (RapidSub.canDelegate("activity_pause")) { return com.it.fome.ac_tselect.remoteMe.runUserSub(false, "ac_tselect","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 118;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 120;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Activity_Resume (ac_tselect) ","ac_tselect",7,ac_tselect.mostCurrent.activityBA,ac_tselect.mostCurrent,113);
if (RapidSub.canDelegate("activity_resume")) { return com.it.fome.ac_tselect.remoteMe.runUserSub(false, "ac_tselect","activity_resume");}
 BA.debugLineNum = 113;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(65536);
 BA.debugLineNum = 114;BA.debugLine="req_getme(userid_t)";
Debug.ShouldStop(131072);
_req_getme(ac_tselect.mostCurrent._userid_t);
 BA.debugLineNum = 116;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
ac_tselect.mostCurrent._meno = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 16;BA.debugLine="Dim pnl_coins As Panel";
ac_tselect.mostCurrent._pnl_coins = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Dim lbl_icon ,lbl_nums As Label";
ac_tselect.mostCurrent._lbl_icon = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
ac_tselect.mostCurrent._lbl_nums = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Dim roundview As MC7RoundView";
ac_tselect.mostCurrent._roundview = RemoteObject.createNew ("com.flycoroundview.mc7.MC7RoundView");
 //BA.debugLineNum = 19;BA.debugLine="Dim LV As Hitex_LayoutView";
ac_tselect.mostCurrent._lv = RemoteObject.createNew ("wir.hitex.recycler.Hitex_LayoutView");
 //BA.debugLineNum = 20;BA.debugLine="Dim glide As Hitex_Glide";
ac_tselect.mostCurrent._glide = RemoteObject.createNew ("com.hitex_glide.Hitex_Glide");
 //BA.debugLineNum = 21;BA.debugLine="Dim username_t ,userid_t As String";
ac_tselect.mostCurrent._username_t = RemoteObject.createImmutable("");
ac_tselect.mostCurrent._userid_t = RemoteObject.createImmutable("");
 //BA.debugLineNum = 22;BA.debugLine="Dim mimeno As mi_meno";
ac_tselect.mostCurrent._mimeno = RemoteObject.createNew ("com.it.fome.mi_meno");
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _lv_getitemcount() throws Exception{
try {
		Debug.PushSubsStack("LV_GetItemCount (ac_tselect) ","ac_tselect",7,ac_tselect.mostCurrent.activityBA,ac_tselect.mostCurrent,210);
if (RapidSub.canDelegate("lv_getitemcount")) { return com.it.fome.ac_tselect.remoteMe.runUserSub(false, "ac_tselect","lv_getitemcount");}
 BA.debugLineNum = 210;BA.debugLine="Sub LV_GetItemCount As Int 								        '$ Item";
Debug.ShouldStop(131072);
 BA.debugLineNum = 211;BA.debugLine="Return 5 'ItemList.Size";
Debug.ShouldStop(262144);
if (true) return BA.numberCast(int.class, 5);
 BA.debugLineNum = 212;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
		Debug.PushSubsStack("LV_ItemClick (ac_tselect) ","ac_tselect",7,ac_tselect.mostCurrent.activityBA,ac_tselect.mostCurrent,214);
if (RapidSub.canDelegate("lv_itemclick")) { com.it.fome.ac_tselect.remoteMe.runUserSub(false, "ac_tselect","lv_itemclick", _clickeditem, _position); return;}
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
public ResumableSub_LV_ItemClick(com.it.fome.ac_tselect parent,RemoteObject _clickeditem,RemoteObject _position) {
this.parent = parent;
this._clickeditem = _clickeditem;
this._position = _position;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
com.it.fome.ac_tselect parent;
RemoteObject _clickeditem;
RemoteObject _position;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("LV_ItemClick (ac_tselect) ","ac_tselect",7,ac_tselect.mostCurrent.activityBA,ac_tselect.mostCurrent,214);
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
 BA.debugLineNum = 215;BA.debugLine="Sleep(0)";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("Sleep",ac_tselect.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ac_tselect", "lv_itemclick"),BA.numberCast(int.class, 0));
this.state = 13;
return;
case 13:
//C
this.state = 1;
;
 BA.debugLineNum = 216;BA.debugLine="Select Position";
Debug.ShouldStop(8388608);
if (true) break;

case 1:
//select
this.state = 12;
switch (BA.switchObjectToInt(_position,BA.numberCast(int.class, 0),BA.numberCast(int.class, 1),BA.numberCast(int.class, 2),BA.numberCast(int.class, 3),BA.numberCast(int.class, 4))) {
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
case 4: {
this.state = 11;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 12;
 BA.debugLineNum = 219;BA.debugLine="StartActivity(ac_lchats)";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",ac_tselect.processBA,(Object)((parent.mostCurrent._ac_lchats.getObject())));
 BA.debugLineNum = 222;BA.debugLine="SetAnimation(\"anim3\", \"anim4\")";
Debug.ShouldStop(536870912);
_setanimation(BA.ObjectToString("anim3"),RemoteObject.createImmutable("anim4"));
 if (true) break;

case 5:
//C
this.state = 12;
 BA.debugLineNum = 224;BA.debugLine="StartActivity(ac_tcoin)";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",ac_tselect.processBA,(Object)((parent.mostCurrent._ac_tcoin.getObject())));
 BA.debugLineNum = 225;BA.debugLine="SetAnimation(\"anim2\", \"anim1\")";
Debug.ShouldStop(1);
_setanimation(BA.ObjectToString("anim2"),RemoteObject.createImmutable("anim1"));
 if (true) break;

case 7:
//C
this.state = 12;
 BA.debugLineNum = 228;BA.debugLine="ac_hsef.typesef=1";
Debug.ShouldStop(8);
parent.mostCurrent._ac_hsef._typesef /*RemoteObject*/  = BA.numberCast(int.class, 1);
 BA.debugLineNum = 229;BA.debugLine="StartActivity(ac_hsef)";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",ac_tselect.processBA,(Object)((parent.mostCurrent._ac_hsef.getObject())));
 BA.debugLineNum = 230;BA.debugLine="SetAnimation(\"anim2\", \"anim1\")";
Debug.ShouldStop(32);
_setanimation(BA.ObjectToString("anim2"),RemoteObject.createImmutable("anim1"));
 if (true) break;

case 9:
//C
this.state = 12;
 BA.debugLineNum = 233;BA.debugLine="ac_shop.typesef=1";
Debug.ShouldStop(256);
parent.mostCurrent._ac_shop._typesef /*RemoteObject*/  = BA.numberCast(int.class, 1);
 BA.debugLineNum = 234;BA.debugLine="StartActivity(ac_shop)";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",ac_tselect.processBA,(Object)((parent.mostCurrent._ac_shop.getObject())));
 BA.debugLineNum = 235;BA.debugLine="SetAnimation(\"anim2\", \"anim1\")";
Debug.ShouldStop(1024);
_setanimation(BA.ObjectToString("anim2"),RemoteObject.createImmutable("anim1"));
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 238;BA.debugLine="ac_tansfer.type_s=1";
Debug.ShouldStop(8192);
parent.mostCurrent._ac_tansfer._type_s /*RemoteObject*/  = BA.numberCast(int.class, 1);
 BA.debugLineNum = 239;BA.debugLine="StartActivity(ac_tansfer)";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",ac_tselect.processBA,(Object)((parent.mostCurrent._ac_tansfer.getObject())));
 BA.debugLineNum = 240;BA.debugLine="SetAnimation(\"anim2\", \"anim1\")";
Debug.ShouldStop(32768);
_setanimation(BA.ObjectToString("anim2"),RemoteObject.createImmutable("anim1"));
 if (true) break;

case 12:
//C
this.state = -1;
;
 BA.debugLineNum = 245;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("LV_onBindViewHolder (ac_tselect) ","ac_tselect",7,ac_tselect.mostCurrent.activityBA,ac_tselect.mostCurrent,174);
if (RapidSub.canDelegate("lv_onbindviewholder")) { return com.it.fome.ac_tselect.remoteMe.runUserSub(false, "ac_tselect","lv_onbindviewholder", _parent, _position);}
RemoteObject _pnl_main = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _lbl_itemicon = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _lbl_name = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _lbl_notis = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("Parent", _parent);
Debug.locals.put("Position", _position);
 BA.debugLineNum = 174;BA.debugLine="Sub LV_onBindViewHolder (Parent As Panel, Position";
Debug.ShouldStop(8192);
 BA.debugLineNum = 175;BA.debugLine="Dim pnl_main = Parent.GetView(0) As Panel";
Debug.ShouldStop(16384);
_pnl_main = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_pnl_main.setObject(_parent.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).getObject());Debug.locals.put("pnl_main", _pnl_main);
 BA.debugLineNum = 176;BA.debugLine="Dim lbl_itemicon = pnl_main.GetView(0) As Label";
Debug.ShouldStop(32768);
_lbl_itemicon = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_lbl_itemicon.setObject(_pnl_main.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).getObject());Debug.locals.put("lbl_itemicon", _lbl_itemicon);
 BA.debugLineNum = 177;BA.debugLine="Dim lbl_name = pnl_main.GetView(1) As Label";
Debug.ShouldStop(65536);
_lbl_name = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_lbl_name.setObject(_pnl_main.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1))).getObject());Debug.locals.put("lbl_name", _lbl_name);
 BA.debugLineNum = 179;BA.debugLine="Dim lbl_notis = pnl_main.GetView(2) As Label";
Debug.ShouldStop(262144);
_lbl_notis = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_lbl_notis.setObject(_pnl_main.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 2))).getObject());Debug.locals.put("lbl_notis", _lbl_notis);
 BA.debugLineNum = 181;BA.debugLine="Select Position";
Debug.ShouldStop(1048576);
switch (BA.switchObjectToInt(_position,BA.numberCast(int.class, 0),BA.numberCast(int.class, 1),BA.numberCast(int.class, 2),BA.numberCast(int.class, 3),BA.numberCast(int.class, 4))) {
case 0: {
 BA.debugLineNum = 183;BA.debugLine="lbl_name.Text=\"سفارش بده\"";
Debug.ShouldStop(4194304);
_lbl_name.runMethod(true,"setText",BA.ObjectToCharSequence("سفارش بده"));
 BA.debugLineNum = 184;BA.debugLine="lbl_notis.Text=\"ممبر-ویو\"";
Debug.ShouldStop(8388608);
_lbl_notis.runMethod(true,"setText",BA.ObjectToCharSequence("ممبر-ویو"));
 BA.debugLineNum = 185;BA.debugLine="lbl_itemicon.Text=Chr(0xE003)";
Debug.ShouldStop(16777216);
_lbl_itemicon.runMethod(true,"setText",BA.ObjectToCharSequence(ac_tselect.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xe003)))));
 break; }
case 1: {
 BA.debugLineNum = 188;BA.debugLine="lbl_name.Text=\"سکه بگیر\"";
Debug.ShouldStop(134217728);
_lbl_name.runMethod(true,"setText",BA.ObjectToCharSequence("سکه بگیر"));
 BA.debugLineNum = 189;BA.debugLine="lbl_notis.Text=\"سکه رایگان\"";
Debug.ShouldStop(268435456);
_lbl_notis.runMethod(true,"setText",BA.ObjectToCharSequence("سکه رایگان"));
 BA.debugLineNum = 190;BA.debugLine="lbl_itemicon.Text=Chr(0xE8E5)";
Debug.ShouldStop(536870912);
_lbl_itemicon.runMethod(true,"setText",BA.ObjectToCharSequence(ac_tselect.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xe8e5)))));
 break; }
case 2: {
 BA.debugLineNum = 192;BA.debugLine="lbl_name.Text=\"سفارشات\"";
Debug.ShouldStop(-2147483648);
_lbl_name.runMethod(true,"setText",BA.ObjectToCharSequence("سفارشات"));
 BA.debugLineNum = 193;BA.debugLine="lbl_notis.Text=\"پیگیری سفارشات\"";
Debug.ShouldStop(1);
_lbl_notis.runMethod(true,"setText",BA.ObjectToCharSequence("پیگیری سفارشات"));
 BA.debugLineNum = 194;BA.debugLine="lbl_itemicon.Text=Chr(0xE06D)";
Debug.ShouldStop(2);
_lbl_itemicon.runMethod(true,"setText",BA.ObjectToCharSequence(ac_tselect.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xe06d)))));
 break; }
case 3: {
 BA.debugLineNum = 196;BA.debugLine="lbl_name.Text=\"فروشگاه\"";
Debug.ShouldStop(8);
_lbl_name.runMethod(true,"setText",BA.ObjectToCharSequence("فروشگاه"));
 BA.debugLineNum = 197;BA.debugLine="lbl_notis.Text=\"خرید سکه\"";
Debug.ShouldStop(16);
_lbl_notis.runMethod(true,"setText",BA.ObjectToCharSequence("خرید سکه"));
 BA.debugLineNum = 198;BA.debugLine="lbl_itemicon.Text=Chr(0xE854)";
Debug.ShouldStop(32);
_lbl_itemicon.runMethod(true,"setText",BA.ObjectToCharSequence(ac_tselect.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xe854)))));
 break; }
case 4: {
 BA.debugLineNum = 200;BA.debugLine="lbl_name.Text=\"انتقال سکه\"";
Debug.ShouldStop(128);
_lbl_name.runMethod(true,"setText",BA.ObjectToCharSequence("انتقال سکه"));
 BA.debugLineNum = 201;BA.debugLine="lbl_notis.Text=\"انتقال سکه به دیگر کاربران\"";
Debug.ShouldStop(256);
_lbl_notis.runMethod(true,"setText",BA.ObjectToCharSequence("انتقال سکه به دیگر کاربران"));
 BA.debugLineNum = 202;BA.debugLine="lbl_itemicon.Text=Chr(0xE863)";
Debug.ShouldStop(512);
_lbl_itemicon.runMethod(true,"setText",BA.ObjectToCharSequence(ac_tselect.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xe863)))));
 break; }
}
;
 BA.debugLineNum = 206;BA.debugLine="lbl_notis.Top=pnl_main.Height-10%x";
Debug.ShouldStop(8192);
_lbl_notis.runMethod(true,"setTop",RemoteObject.solve(new RemoteObject[] {_pnl_main.runMethod(true,"getHeight"),ac_tselect.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),ac_tselect.mostCurrent.activityBA)}, "-",1, 1));
 BA.debugLineNum = 207;BA.debugLine="Parent.Height=pnl_main.Height+5%x";
Debug.ShouldStop(16384);
_parent.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {_pnl_main.runMethod(true,"getHeight"),ac_tselect.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),ac_tselect.mostCurrent.activityBA)}, "+",1, 1));
 BA.debugLineNum = 208;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("LV_onCreateViewHolder (ac_tselect) ","ac_tselect",7,ac_tselect.mostCurrent.activityBA,ac_tselect.mostCurrent,122);
if (RapidSub.canDelegate("lv_oncreateviewholder")) { return com.it.fome.ac_tselect.remoteMe.runUserSub(false, "ac_tselect","lv_oncreateviewholder", _parent, _viewtype);}
RemoteObject _bkcolors = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
RemoteObject _pnl_main = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _lbl_itemicon = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _lbl_name = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _bkcolor = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
RemoteObject _lbl_notis = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("Parent", _parent);
Debug.locals.put("ViewType", _viewtype);
 BA.debugLineNum = 122;BA.debugLine="Sub LV_onCreateViewHolder (Parent As Panel, ViewTy";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 123;BA.debugLine="Parent.Color=Colors.Transparent";
Debug.ShouldStop(67108864);
_parent.runVoidMethod ("setColor",ac_tselect.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 125;BA.debugLine="Dim bkcolors As ColorDrawable";
Debug.ShouldStop(268435456);
_bkcolors = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("bkcolors", _bkcolors);
 BA.debugLineNum = 126;BA.debugLine="bkcolors.Initialize(Colors.White,3%x)";
Debug.ShouldStop(536870912);
_bkcolors.runVoidMethod ("Initialize",(Object)(ac_tselect.mostCurrent.__c.getField(false,"Colors").getField(true,"White")),(Object)(ac_tselect.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 3)),ac_tselect.mostCurrent.activityBA)));
 BA.debugLineNum = 128;BA.debugLine="Dim pnl_main As Panel : pnl_main.Initialize(\"pnl_";
Debug.ShouldStop(-2147483648);
_pnl_main = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("pnl_main", _pnl_main);
 BA.debugLineNum = 128;BA.debugLine="Dim pnl_main As Panel : pnl_main.Initialize(\"pnl_";
Debug.ShouldStop(-2147483648);
_pnl_main.runVoidMethod ("Initialize",ac_tselect.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("pnl_main")));
 BA.debugLineNum = 129;BA.debugLine="pnl_main.Color=Colors.White";
Debug.ShouldStop(1);
_pnl_main.runVoidMethod ("setColor",ac_tselect.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 130;BA.debugLine="pnl_main.Background=bkcolors";
Debug.ShouldStop(2);
_pnl_main.runMethod(false,"setBackground",(_bkcolors.getObject()));
 BA.debugLineNum = 131;BA.debugLine="Parent.AddView(pnl_main,5%x,2%x,90%x,35%x)";
Debug.ShouldStop(4);
_parent.runVoidMethod ("AddView",(Object)((_pnl_main.getObject())),(Object)(ac_tselect.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),ac_tselect.mostCurrent.activityBA)),(Object)(ac_tselect.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),ac_tselect.mostCurrent.activityBA)),(Object)(ac_tselect.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 90)),ac_tselect.mostCurrent.activityBA)),(Object)(ac_tselect.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 35)),ac_tselect.mostCurrent.activityBA)));
 BA.debugLineNum = 133;BA.debugLine="Dim lbl_itemicon As Label";
Debug.ShouldStop(16);
_lbl_itemicon = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl_itemicon", _lbl_itemicon);
 BA.debugLineNum = 134;BA.debugLine="lbl_itemicon.Initialize(\"lbl_itemicon\")";
Debug.ShouldStop(32);
_lbl_itemicon.runVoidMethod ("Initialize",ac_tselect.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("lbl_itemicon")));
 BA.debugLineNum = 135;BA.debugLine="lbl_itemicon.TextColor=0xFFD305BA";
Debug.ShouldStop(64);
_lbl_itemicon.runMethod(true,"setTextColor",BA.numberCast(int.class, 0xffd305ba));
 BA.debugLineNum = 136;BA.debugLine="lbl_itemicon.TextSize=35";
Debug.ShouldStop(128);
_lbl_itemicon.runMethod(true,"setTextSize",BA.numberCast(float.class, 35));
 BA.debugLineNum = 137;BA.debugLine="lbl_itemicon.Typeface=Typeface.MATERIALICONS";
Debug.ShouldStop(256);
_lbl_itemicon.runMethod(false,"setTypeface",ac_tselect.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"getMATERIALICONS"));
 BA.debugLineNum = 138;BA.debugLine="lbl_itemicon.Gravity=Gravity.CENTER_VERTICAL+Grav";
Debug.ShouldStop(512);
_lbl_itemicon.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {ac_tselect.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL"),ac_tselect.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL")}, "+",1, 1));
 BA.debugLineNum = 139;BA.debugLine="pnl_main.AddView(lbl_itemicon,0,3%x,pnl_main.Widt";
Debug.ShouldStop(1024);
_pnl_main.runVoidMethod ("AddView",(Object)((_lbl_itemicon.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(ac_tselect.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 3)),ac_tselect.mostCurrent.activityBA)),(Object)(_pnl_main.runMethod(true,"getWidth")),(Object)(ac_tselect.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),ac_tselect.mostCurrent.activityBA)));
 BA.debugLineNum = 141;BA.debugLine="Dim lbl_name As Label";
Debug.ShouldStop(4096);
_lbl_name = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl_name", _lbl_name);
 BA.debugLineNum = 142;BA.debugLine="lbl_name.Initialize(\"lbl_name\")";
Debug.ShouldStop(8192);
_lbl_name.runVoidMethod ("Initialize",ac_tselect.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("lbl_name")));
 BA.debugLineNum = 143;BA.debugLine="lbl_name.TextColor=Colors.DarkGray";
Debug.ShouldStop(16384);
_lbl_name.runMethod(true,"setTextColor",ac_tselect.mostCurrent.__c.getField(false,"Colors").getField(true,"DarkGray"));
 BA.debugLineNum = 144;BA.debugLine="lbl_name.TextSize=17";
Debug.ShouldStop(32768);
_lbl_name.runMethod(true,"setTextSize",BA.numberCast(float.class, 17));
 BA.debugLineNum = 145;BA.debugLine="lbl_name.Typeface=Typeface.LoadFromAssets(\"iran_s";
Debug.ShouldStop(65536);
_lbl_name.runMethod(false,"setTypeface",ac_tselect.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("iran_sans.ttf"))));
 BA.debugLineNum = 146;BA.debugLine="lbl_name.Gravity=Gravity.CENTER_VERTICAL+Gravity.";
Debug.ShouldStop(131072);
_lbl_name.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {ac_tselect.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL"),ac_tselect.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL")}, "+",1, 1));
 BA.debugLineNum = 147;BA.debugLine="pnl_main.AddView(lbl_name,0,lbl_itemicon.Top+lbl_";
Debug.ShouldStop(262144);
_pnl_main.runVoidMethod ("AddView",(Object)((_lbl_name.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {_lbl_itemicon.runMethod(true,"getTop"),_lbl_itemicon.runMethod(true,"getHeight")}, "+",1, 1)),(Object)(_pnl_main.runMethod(true,"getWidth")),(Object)(ac_tselect.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),ac_tselect.mostCurrent.activityBA)));
 BA.debugLineNum = 149;BA.debugLine="Dim bkcolor As ColorDrawable";
Debug.ShouldStop(1048576);
_bkcolor = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("bkcolor", _bkcolor);
 BA.debugLineNum = 150;BA.debugLine="bkcolor.Initialize(0xFFFFD82B,30)";
Debug.ShouldStop(2097152);
_bkcolor.runVoidMethod ("Initialize",(Object)(BA.numberCast(int.class, 0xffffd82b)),(Object)(BA.numberCast(int.class, 30)));
 BA.debugLineNum = 151;BA.debugLine="Dim lbl_notis As Label";
Debug.ShouldStop(4194304);
_lbl_notis = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl_notis", _lbl_notis);
 BA.debugLineNum = 152;BA.debugLine="lbl_notis.Initialize(\"lbl_notis\")";
Debug.ShouldStop(8388608);
_lbl_notis.runVoidMethod ("Initialize",ac_tselect.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("lbl_notis")));
 BA.debugLineNum = 153;BA.debugLine="lbl_notis.TextColor=Colors.DarkGray";
Debug.ShouldStop(16777216);
_lbl_notis.runMethod(true,"setTextColor",ac_tselect.mostCurrent.__c.getField(false,"Colors").getField(true,"DarkGray"));
 BA.debugLineNum = 154;BA.debugLine="lbl_notis.TextSize=17";
Debug.ShouldStop(33554432);
_lbl_notis.runMethod(true,"setTextSize",BA.numberCast(float.class, 17));
 BA.debugLineNum = 155;BA.debugLine="lbl_notis.Typeface=Typeface.LoadFromAssets(\"iran_";
Debug.ShouldStop(67108864);
_lbl_notis.runMethod(false,"setTypeface",ac_tselect.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("iran_sans.ttf"))));
 BA.debugLineNum = 156;BA.debugLine="lbl_notis.Text=\"با قیمت مناسب و کیفیت تضمینی !\"";
Debug.ShouldStop(134217728);
_lbl_notis.runMethod(true,"setText",BA.ObjectToCharSequence("با قیمت مناسب و کیفیت تضمینی !"));
 BA.debugLineNum = 157;BA.debugLine="lbl_notis.Gravity=Gravity.CENTER_VERTICAL+Gravity";
Debug.ShouldStop(268435456);
_lbl_notis.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {ac_tselect.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL"),ac_tselect.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL")}, "+",1, 1));
 BA.debugLineNum = 159;BA.debugLine="pnl_main.AddView(lbl_notis,1%x,lbl_name.Top+lbl_n";
Debug.ShouldStop(1073741824);
_pnl_main.runVoidMethod ("AddView",(Object)((_lbl_notis.getObject())),(Object)(ac_tselect.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 1)),ac_tselect.mostCurrent.activityBA)),(Object)(RemoteObject.solve(new RemoteObject[] {_lbl_name.runMethod(true,"getTop"),_lbl_name.runMethod(true,"getHeight")}, "+",1, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {_pnl_main.runMethod(true,"getWidth"),ac_tselect.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),ac_tselect.mostCurrent.activityBA)}, "-",1, 1)),(Object)(ac_tselect.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 9)),ac_tselect.mostCurrent.activityBA)));
 BA.debugLineNum = 161;BA.debugLine="lbl_name.Text=\"فالوور بگیر\"";
Debug.ShouldStop(1);
_lbl_name.runMethod(true,"setText",BA.ObjectToCharSequence("فالوور بگیر"));
 BA.debugLineNum = 162;BA.debugLine="lbl_itemicon.Text=Chr(0xE8D3)";
Debug.ShouldStop(2);
_lbl_itemicon.runMethod(true,"setText",BA.ObjectToCharSequence(ac_tselect.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xe8d3)))));
 BA.debugLineNum = 164;BA.debugLine="roundview.Initialize(lbl_notis)";
Debug.ShouldStop(8);
ac_tselect.mostCurrent._roundview.runVoidMethod ("Initialize",ac_tselect.processBA,(Object)((_lbl_notis.getObject())));
 BA.debugLineNum = 165;BA.debugLine="roundview.CornerRadius_BL=30";
Debug.ShouldStop(16);
ac_tselect.mostCurrent._roundview.runMethod(true,"setCornerRadius_BL",BA.numberCast(int.class, 30));
 BA.debugLineNum = 166;BA.debugLine="roundview.CornerRadius_BR=30";
Debug.ShouldStop(32);
ac_tselect.mostCurrent._roundview.runMethod(true,"setCornerRadius_BR",BA.numberCast(int.class, 30));
 BA.debugLineNum = 167;BA.debugLine="roundview.CornerRadius_TL=30";
Debug.ShouldStop(64);
ac_tselect.mostCurrent._roundview.runMethod(true,"setCornerRadius_TL",BA.numberCast(int.class, 30));
 BA.debugLineNum = 168;BA.debugLine="roundview.CornerRadius_TR=30";
Debug.ShouldStop(128);
ac_tselect.mostCurrent._roundview.runMethod(true,"setCornerRadius_TR",BA.numberCast(int.class, 30));
 BA.debugLineNum = 169;BA.debugLine="roundview.BackgroundColor=0xFFFFD82B";
Debug.ShouldStop(256);
ac_tselect.mostCurrent._roundview.runMethod(true,"setBackgroundColor",BA.numberCast(int.class, 0xffffd82b));
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
public static RemoteObject  _meno_click() throws Exception{
try {
		Debug.PushSubsStack("meno_Click (ac_tselect) ","ac_tselect",7,ac_tselect.mostCurrent.activityBA,ac_tselect.mostCurrent,321);
if (RapidSub.canDelegate("meno_click")) { return com.it.fome.ac_tselect.remoteMe.runUserSub(false, "ac_tselect","meno_click");}
 BA.debugLineNum = 321;BA.debugLine="Sub meno_Click";
Debug.ShouldStop(1);
 BA.debugLineNum = 322;BA.debugLine="mimeno.Initialize(\"mimeno\",Me)";
Debug.ShouldStop(2);
ac_tselect.mostCurrent._mimeno.runClassMethod (com.it.fome.mi_meno.class, "_initialize" /*RemoteObject*/ ,ac_tselect.mostCurrent.activityBA,(Object)(BA.ObjectToString("mimeno")),(Object)(ac_tselect.getObject()));
 BA.debugLineNum = 323;BA.debugLine="mimeno.addpnl";
Debug.ShouldStop(4);
ac_tselect.mostCurrent._mimeno.runClassMethod (com.it.fome.mi_meno.class, "_addpnl" /*RemoteObject*/ );
 BA.debugLineNum = 324;BA.debugLine="mimeno.open";
Debug.ShouldStop(8);
ac_tselect.mostCurrent._mimeno.runClassMethod (com.it.fome.mi_meno.class, "_open" /*RemoteObject*/ );
 BA.debugLineNum = 325;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
		Debug.PushSubsStack("prfn_onPostStringErrorListener (ac_tselect) ","ac_tselect",7,ac_tselect.mostCurrent.activityBA,ac_tselect.mostCurrent,277);
if (RapidSub.canDelegate("prfn_onpoststringerrorlistener")) { return com.it.fome.ac_tselect.remoteMe.runUserSub(false, "ac_tselect","prfn_onpoststringerrorlistener", _error, _tag);}
Debug.locals.put("Error", _error);
Debug.locals.put("Tag", _tag);
 BA.debugLineNum = 277;BA.debugLine="Sub prfn_onPostStringErrorListener(Error As Respon";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 279;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(4194304);
ac_tselect.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 280;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
		Debug.PushSubsStack("prfn_onPostStringOkListener (ac_tselect) ","ac_tselect",7,ac_tselect.mostCurrent.activityBA,ac_tselect.mostCurrent,282);
if (RapidSub.canDelegate("prfn_onpoststringoklistener")) { return com.it.fome.ac_tselect.remoteMe.runUserSub(false, "ac_tselect","prfn_onpoststringoklistener", _result, _tag);}
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
 BA.debugLineNum = 282;BA.debugLine="Sub prfn_onPostStringOkListener(Result As String";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 284;BA.debugLine="Select Tag";
Debug.ShouldStop(134217728);
switch (BA.switchObjectToInt(_tag,BA.ObjectToString("iuser"),BA.ObjectToString("getinsta"))) {
case 0: {
 BA.debugLineNum = 286;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(536870912);
ac_tselect.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 287;BA.debugLine="Log(Result)";
Debug.ShouldStop(1073741824);
ac_tselect.mostCurrent.__c.runVoidMethod ("LogImpl","69240581",_result,0);
 break; }
case 1: {
 BA.debugLineNum = 290;BA.debugLine="Log(Result)";
Debug.ShouldStop(2);
ac_tselect.mostCurrent.__c.runVoidMethod ("LogImpl","69240584",_result,0);
 BA.debugLineNum = 291;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(4);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 292;BA.debugLine="parser.Initialize(Result)";
Debug.ShouldStop(8);
_parser.runVoidMethod ("Initialize",(Object)(_result));
 BA.debugLineNum = 293;BA.debugLine="Dim root As List = parser.NextArray";
Debug.ShouldStop(16);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_root = _parser.runMethod(false,"NextArray");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 294;BA.debugLine="For Each colroot As Map In root";
Debug.ShouldStop(32);
_colroot = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group10 = _root;
final int groupLen10 = group10.runMethod(true,"getSize").<Integer>get()
;int index10 = 0;
;
for (; index10 < groupLen10;index10++){
_colroot.setObject(group10.runMethod(false,"Get",index10));
Debug.locals.put("colroot", _colroot);
 BA.debugLineNum = 295;BA.debugLine="Dim Result As String = colroot.Get(\"result\")";
Debug.ShouldStop(64);
_result = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("result")))));Debug.locals.put("Result", _result);Debug.locals.put("Result", _result);
 BA.debugLineNum = 296;BA.debugLine="Dim c_m As String = colroot.Get(\"c_m\")";
Debug.ShouldStop(128);
_c_m = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("c_m")))));Debug.locals.put("c_m", _c_m);Debug.locals.put("c_m", _c_m);
 BA.debugLineNum = 297;BA.debugLine="Dim uid As String = colroot.Get(\"uid\")";
Debug.ShouldStop(256);
_uid = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("uid")))));Debug.locals.put("uid", _uid);Debug.locals.put("uid", _uid);
 BA.debugLineNum = 298;BA.debugLine="Dim first_last As String = colroot.Get(\"first_";
Debug.ShouldStop(512);
_first_last = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("first_last")))));Debug.locals.put("first_last", _first_last);Debug.locals.put("first_last", _first_last);
 BA.debugLineNum = 299;BA.debugLine="Dim id As String = colroot.Get(\"id\")";
Debug.ShouldStop(1024);
_id = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 300;BA.debugLine="Dim userid As String = colroot.Get(\"userid\")";
Debug.ShouldStop(2048);
_userid = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("userid")))));Debug.locals.put("userid", _userid);Debug.locals.put("userid", _userid);
 BA.debugLineNum = 301;BA.debugLine="Dim username As String = colroot.Get(\"username";
Debug.ShouldStop(4096);
_username = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("username")))));Debug.locals.put("username", _username);Debug.locals.put("username", _username);
 BA.debugLineNum = 302;BA.debugLine="Dim c_ch As String = colroot.Get(\"c_ch\")";
Debug.ShouldStop(8192);
_c_ch = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("c_ch")))));Debug.locals.put("c_ch", _c_ch);Debug.locals.put("c_ch", _c_ch);
 BA.debugLineNum = 304;BA.debugLine="Log(c_m)";
Debug.ShouldStop(32768);
ac_tselect.mostCurrent.__c.runVoidMethod ("LogImpl","69240598",_c_m,0);
 BA.debugLineNum = 305;BA.debugLine="Dim n_coins=c_m As Long";
Debug.ShouldStop(65536);
_n_coins = BA.numberCast(long.class, _c_m);Debug.locals.put("n_coins", _n_coins);Debug.locals.put("n_coins", _n_coins);
 BA.debugLineNum = 306;BA.debugLine="If n_coins>100 Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean(">",_n_coins,BA.numberCast(double.class, 100))) { 
 BA.debugLineNum = 307;BA.debugLine="lbl_nums.Text=\"سکه \"&NumberFormat(c_m,3,0)";
Debug.ShouldStop(262144);
ac_tselect.mostCurrent._lbl_nums.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("سکه "),ac_tselect.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _c_m)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 0))))));
 }else {
 BA.debugLineNum = 309;BA.debugLine="lbl_nums.Text=\"سکه \"&c_m";
Debug.ShouldStop(1048576);
ac_tselect.mostCurrent._lbl_nums.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("سکه "),_c_m)));
 };
 BA.debugLineNum = 313;BA.debugLine="sql1.ExecNonQuery(\"UPDATE tbl_coin set cm='\"&c";
Debug.ShouldStop(16777216);
ac_tselect._sql1.runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE tbl_coin set cm='"),_c_m,RemoteObject.createImmutable("',cf='"),_c_ch,RemoteObject.createImmutable("' WHERE userid='"),ac_tselect.mostCurrent._userid_t,RemoteObject.createImmutable("' "))));
 }
}Debug.locals.put("colroot", _colroot);
;
 break; }
}
;
 BA.debugLineNum = 319;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
ac_tselect._sql1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL");
 //BA.debugLineNum = 10;BA.debugLine="Private cursor1 As Cursor";
ac_tselect._cursor1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _req_getme(RemoteObject _userid) throws Exception{
try {
		Debug.PushSubsStack("req_getme (ac_tselect) ","ac_tselect",7,ac_tselect.mostCurrent.activityBA,ac_tselect.mostCurrent,259);
if (RapidSub.canDelegate("req_getme")) { return com.it.fome.ac_tselect.remoteMe.runUserSub(false, "ac_tselect","req_getme", _userid);}
RemoteObject _prfn = RemoteObject.declareNull("com.reza.sh.fastnet.Fastnet");
RemoteObject _post = RemoteObject.declareNull("com.reza.sh.fastnet.PostRequestRaper");
Debug.locals.put("userid", _userid);
 BA.debugLineNum = 259;BA.debugLine="Sub req_getme(userid As String)";
Debug.ShouldStop(4);
 BA.debugLineNum = 260;BA.debugLine="Dim prfn As PersianFastNetwork";
Debug.ShouldStop(8);
_prfn = RemoteObject.createNew ("com.reza.sh.fastnet.Fastnet");Debug.locals.put("prfn", _prfn);
 BA.debugLineNum = 261;BA.debugLine="prfn.initialize(\"prfn\")";
Debug.ShouldStop(16);
_prfn.runVoidMethod ("initialize",ac_tselect.processBA,(Object)(RemoteObject.createImmutable("prfn")));
 BA.debugLineNum = 263;BA.debugLine="Dim post As PostRequest";
Debug.ShouldStop(64);
_post = RemoteObject.createNew ("com.reza.sh.fastnet.PostRequestRaper");Debug.locals.put("post", _post);
 BA.debugLineNum = 264;BA.debugLine="post=prfn.BuildPostQuery(\"http://filework.ir/INST";
Debug.ShouldStop(128);
_post = _prfn.runMethod(false,"BuildPostQuery",(Object)(BA.ObjectToString("http://filework.ir/INSTAFOLLOW/api/req.php")),(Object)(RemoteObject.createImmutable("getinsta")));Debug.locals.put("post", _post);
 BA.debugLineNum = 266;BA.debugLine="post.addHeder(\"User-Agent\",\"Dalvik/1.6.0 (Linux;";
Debug.ShouldStop(512);
_post.runVoidMethod ("addHeder",(Object)(BA.ObjectToString("User-Agent")),(Object)(RemoteObject.createImmutable("Dalvik/1.6.0 (Linux; U; Android 4.4.4; SM-A700FD Build/KTU84P)")));
 BA.debugLineNum = 268;BA.debugLine="post.addParametrs(\"ui\",\"1\")";
Debug.ShouldStop(2048);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("ui")),(Object)(RemoteObject.createImmutable("1")));
 BA.debugLineNum = 269;BA.debugLine="post.addParametrs(\"userid\",userid_t)";
Debug.ShouldStop(4096);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("userid")),(Object)(ac_tselect.mostCurrent._userid_t));
 BA.debugLineNum = 271;BA.debugLine="post.addParametrs(\"req\",\"get_acct\")";
Debug.ShouldStop(16384);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("req")),(Object)(RemoteObject.createImmutable("get_acct")));
 BA.debugLineNum = 274;BA.debugLine="post.executRequestAsString";
Debug.ShouldStop(131072);
_post.runVoidMethod ("executRequestAsString");
 BA.debugLineNum = 275;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
		Debug.PushSubsStack("SetAnimation (ac_tselect) ","ac_tselect",7,ac_tselect.mostCurrent.activityBA,ac_tselect.mostCurrent,247);
if (RapidSub.canDelegate("setanimation")) { return com.it.fome.ac_tselect.remoteMe.runUserSub(false, "ac_tselect","setanimation", _inanimation, _outanimation);}
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
RemoteObject _package = RemoteObject.createImmutable("");
RemoteObject _in = RemoteObject.createImmutable(0);
RemoteObject _out = RemoteObject.createImmutable(0);
Debug.locals.put("InAnimation", _inanimation);
Debug.locals.put("OutAnimation", _outanimation);
 BA.debugLineNum = 247;BA.debugLine="Sub SetAnimation(InAnimation As String, OutAnimati";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 248;BA.debugLine="Dim r As Reflector";
Debug.ShouldStop(8388608);
_r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("r", _r);
 BA.debugLineNum = 249;BA.debugLine="Dim package As String";
Debug.ShouldStop(16777216);
_package = RemoteObject.createImmutable("");Debug.locals.put("package", _package);
 BA.debugLineNum = 250;BA.debugLine="Dim In, out As Int";
Debug.ShouldStop(33554432);
_in = RemoteObject.createImmutable(0);Debug.locals.put("In", _in);
_out = RemoteObject.createImmutable(0);Debug.locals.put("out", _out);
 BA.debugLineNum = 251;BA.debugLine="package = r.GetStaticField(\"anywheresoftware.b4a.";
Debug.ShouldStop(67108864);
_package = BA.ObjectToString(_r.runMethod(false,"GetStaticField",(Object)(BA.ObjectToString("anywheresoftware.b4a.BA")),(Object)(RemoteObject.createImmutable("packageName"))));Debug.locals.put("package", _package);
 BA.debugLineNum = 252;BA.debugLine="In = r.GetStaticField(package & \".R$anim\", InAnim";
Debug.ShouldStop(134217728);
_in = BA.numberCast(int.class, _r.runMethod(false,"GetStaticField",(Object)(RemoteObject.concat(_package,RemoteObject.createImmutable(".R$anim"))),(Object)(_inanimation)));Debug.locals.put("In", _in);
 BA.debugLineNum = 253;BA.debugLine="out = r.GetStaticField(package & \".R$anim\", OutAn";
Debug.ShouldStop(268435456);
_out = BA.numberCast(int.class, _r.runMethod(false,"GetStaticField",(Object)(RemoteObject.concat(_package,RemoteObject.createImmutable(".R$anim"))),(Object)(_outanimation)));Debug.locals.put("out", _out);
 BA.debugLineNum = 254;BA.debugLine="r.Target = r.GetActivity";
Debug.ShouldStop(536870912);
_r.setField ("Target",(_r.runMethod(false,"GetActivity",ac_tselect.processBA)));
 BA.debugLineNum = 255;BA.debugLine="r.RunMethod4(\"overridePendingTransition\", Array A";
Debug.ShouldStop(1073741824);
_r.runVoidMethod ("RunMethod4",(Object)(BA.ObjectToString("overridePendingTransition")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_in),(_out)})),(Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.ObjectToString("java.lang.int"),RemoteObject.createImmutable("java.lang.int")})));
 BA.debugLineNum = 256;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}