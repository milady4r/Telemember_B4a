package com.it.fome;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class ac_home_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (ac_home) ","ac_home",15,ac_home.mostCurrent.activityBA,ac_home.mostCurrent,27);
if (RapidSub.canDelegate("activity_create")) { return com.it.fome.ac_home.remoteMe.runUserSub(false, "ac_home","activity_create", _firsttime);}
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _gradient1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.GradientDrawable");
RemoteObject _clrs = null;
RemoteObject _bkcolor = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
RemoteObject _bkcolor_st = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
RemoteObject _pnlb1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 27;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 29;BA.debugLine="If File.Exists(File.DirInternal,\"instadb.db\")=Fal";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",ac_home.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(ac_home.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("instadb.db"))),ac_home.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 30;BA.debugLine="File.Copy(File.DirAssets,\"instadb.db\",File.DirIn";
Debug.ShouldStop(536870912);
ac_home.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(ac_home.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("instadb.db")),(Object)(ac_home.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("instadb.db")));
 };
 BA.debugLineNum = 32;BA.debugLine="If sql1.IsInitialized=False Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",ac_home._sql1.runMethod(true,"IsInitialized"),ac_home.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 33;BA.debugLine="sql1.Initialize(File.DirInternal,\"instadb.db\",Fa";
Debug.ShouldStop(1);
ac_home._sql1.runVoidMethod ("Initialize",(Object)(ac_home.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("instadb.db")),(Object)(ac_home.mostCurrent.__c.getField(true,"False")));
 };
 BA.debugLineNum = 38;BA.debugLine="cursor1 = sql1.ExecQuery(\"SELECT * FROM tbl_acc W";
Debug.ShouldStop(32);
ac_home._cursor1.setObject(ac_home._sql1.runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT * FROM tbl_acc WHERE soich='1' "))));
 BA.debugLineNum = 39;BA.debugLine="Dim i As Int";
Debug.ShouldStop(64);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 40;BA.debugLine="For i=0 To cursor1.RowCount-1";
Debug.ShouldStop(128);
{
final int step9 = 1;
final int limit9 = RemoteObject.solve(new RemoteObject[] {ac_home._cursor1.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step9 > 0 && _i.<Integer>get().intValue() <= limit9) || (step9 < 0 && _i.<Integer>get().intValue() >= limit9) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step9))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 41;BA.debugLine="cursor1.Position=i";
Debug.ShouldStop(256);
ac_home._cursor1.runMethod(true,"setPosition",_i);
 BA.debugLineNum = 42;BA.debugLine="i_cookie=cursor1.GetString(\"cookie\")";
Debug.ShouldStop(512);
ac_home.mostCurrent._i_cookie = ac_home._cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("cookie")));
 BA.debugLineNum = 43;BA.debugLine="i_username=cursor1.GetString(\"username\")";
Debug.ShouldStop(1024);
ac_home.mostCurrent._i_username = ac_home._cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("username")));
 BA.debugLineNum = 44;BA.debugLine="i_pk=cursor1.GetString(\"pk\")";
Debug.ShouldStop(2048);
ac_home.mostCurrent._i_pk = ac_home._cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("pk")));
 BA.debugLineNum = 45;BA.debugLine="i_pic=cursor1.GetString(\"profile_pic_url\")";
Debug.ShouldStop(4096);
ac_home.mostCurrent._i_pic = ac_home._cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("profile_pic_url")));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 49;BA.debugLine="Dim Gradient1 As GradientDrawable";
Debug.ShouldStop(65536);
_gradient1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.GradientDrawable");Debug.locals.put("Gradient1", _gradient1);
 BA.debugLineNum = 50;BA.debugLine="Dim Clrs(6) As Int";
Debug.ShouldStop(131072);
_clrs = RemoteObject.createNewArray ("int", new int[] {6}, new Object[]{});Debug.locals.put("Clrs", _clrs);
 BA.debugLineNum = 51;BA.debugLine="Clrs(0) = 0xFFFF00AE";
Debug.ShouldStop(262144);
_clrs.setArrayElement (BA.numberCast(int.class, 0xffff00ae),BA.numberCast(int.class, 0));
 BA.debugLineNum = 52;BA.debugLine="Clrs(1) = 0xFFEE2CB0";
Debug.ShouldStop(524288);
_clrs.setArrayElement (BA.numberCast(int.class, 0xffee2cb0),BA.numberCast(int.class, 1));
 BA.debugLineNum = 58;BA.debugLine="Clrs(2) = 0xFF0E85F6";
Debug.ShouldStop(33554432);
_clrs.setArrayElement (BA.numberCast(int.class, 0xff0e85f6),BA.numberCast(int.class, 2));
 BA.debugLineNum = 59;BA.debugLine="Clrs(3) = 0xFF2E95F6";
Debug.ShouldStop(67108864);
_clrs.setArrayElement (BA.numberCast(int.class, 0xff2e95f6),BA.numberCast(int.class, 3));
 BA.debugLineNum = 60;BA.debugLine="Clrs(4) = 0xFF409DF6";
Debug.ShouldStop(134217728);
_clrs.setArrayElement (BA.numberCast(int.class, 0xff409df6),BA.numberCast(int.class, 4));
 BA.debugLineNum = 61;BA.debugLine="Clrs(5) = 0xFF57A3EC";
Debug.ShouldStop(268435456);
_clrs.setArrayElement (BA.numberCast(int.class, 0xff57a3ec),BA.numberCast(int.class, 5));
 BA.debugLineNum = 64;BA.debugLine="Gradient1.Initialize(\"TOP_BOTTOM\", Clrs)";
Debug.ShouldStop(-2147483648);
_gradient1.runVoidMethod ("Initialize",(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.drawable.GradientDrawable.Orientation"),"TOP_BOTTOM")),(Object)(_clrs));
 BA.debugLineNum = 65;BA.debugLine="Activity.Background=Gradient1";
Debug.ShouldStop(1);
ac_home.mostCurrent._activity.runMethod(false,"setBackground",(_gradient1.getObject()));
 BA.debugLineNum = 67;BA.debugLine="Dim bkcolor As ColorDrawable";
Debug.ShouldStop(4);
_bkcolor = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("bkcolor", _bkcolor);
 BA.debugLineNum = 68;BA.debugLine="bkcolor.Initialize2(Colors.White,15,2dip,Colors.L";
Debug.ShouldStop(8);
_bkcolor.runVoidMethod ("Initialize2",(Object)(ac_home.mostCurrent.__c.getField(false,"Colors").getField(true,"White")),(Object)(BA.numberCast(int.class, 15)),(Object)(ac_home.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))),(Object)(ac_home.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray")));
 BA.debugLineNum = 69;BA.debugLine="meno.Initialize(\"meno\")";
Debug.ShouldStop(16);
ac_home.mostCurrent._meno.runVoidMethod ("Initialize",ac_home.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("meno")));
 BA.debugLineNum = 70;BA.debugLine="meno.TextColor=Colors.DarkGray";
Debug.ShouldStop(32);
ac_home.mostCurrent._meno.runMethod(true,"setTextColor",ac_home.mostCurrent.__c.getField(false,"Colors").getField(true,"DarkGray"));
 BA.debugLineNum = 71;BA.debugLine="meno.TextSize=37";
Debug.ShouldStop(64);
ac_home.mostCurrent._meno.runMethod(true,"setTextSize",BA.numberCast(float.class, 37));
 BA.debugLineNum = 72;BA.debugLine="meno.Background=bkcolor";
Debug.ShouldStop(128);
ac_home.mostCurrent._meno.runMethod(false,"setBackground",(_bkcolor.getObject()));
 BA.debugLineNum = 73;BA.debugLine="meno.Typeface=Typeface.MATERIALICONS";
Debug.ShouldStop(256);
ac_home.mostCurrent._meno.runMethod(false,"setTypeface",ac_home.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"getMATERIALICONS"));
 BA.debugLineNum = 74;BA.debugLine="meno.Text=Chr(0xE3C7)";
Debug.ShouldStop(512);
ac_home.mostCurrent._meno.runMethod(true,"setText",BA.ObjectToCharSequence(ac_home.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xe3c7)))));
 BA.debugLineNum = 75;BA.debugLine="meno.Gravity=Gravity.CENTER_HORIZONTAL+Gravity.CE";
Debug.ShouldStop(1024);
ac_home.mostCurrent._meno.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {ac_home.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL"),ac_home.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")}, "+",1, 1));
 BA.debugLineNum = 76;BA.debugLine="Activity.AddView(meno,3%x,3%x,12%x,12%x)";
Debug.ShouldStop(2048);
ac_home.mostCurrent._activity.runVoidMethod ("AddView",(Object)((ac_home.mostCurrent._meno.getObject())),(Object)(ac_home.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 3)),ac_home.mostCurrent.activityBA)),(Object)(ac_home.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 3)),ac_home.mostCurrent.activityBA)),(Object)(ac_home.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 12)),ac_home.mostCurrent.activityBA)),(Object)(ac_home.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 12)),ac_home.mostCurrent.activityBA)));
 BA.debugLineNum = 78;BA.debugLine="pnl_coins.Initialize(\"pnl_coins\")";
Debug.ShouldStop(8192);
ac_home.mostCurrent._pnl_coins.runVoidMethod ("Initialize",ac_home.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("pnl_coins")));
 BA.debugLineNum = 79;BA.debugLine="pnl_coins.Visible=False";
Debug.ShouldStop(16384);
ac_home.mostCurrent._pnl_coins.runMethod(true,"setVisible",ac_home.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 80;BA.debugLine="Activity.AddView(pnl_coins,50%x,3%x,50%x,12%x)";
Debug.ShouldStop(32768);
ac_home.mostCurrent._activity.runVoidMethod ("AddView",(Object)((ac_home.mostCurrent._pnl_coins.getObject())),(Object)(ac_home.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 50)),ac_home.mostCurrent.activityBA)),(Object)(ac_home.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 3)),ac_home.mostCurrent.activityBA)),(Object)(ac_home.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 50)),ac_home.mostCurrent.activityBA)),(Object)(ac_home.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 12)),ac_home.mostCurrent.activityBA)));
 BA.debugLineNum = 81;BA.debugLine="roundview.Initialize(pnl_coins)";
Debug.ShouldStop(65536);
ac_home.mostCurrent._roundview.runVoidMethod ("Initialize",ac_home.processBA,(Object)((ac_home.mostCurrent._pnl_coins.getObject())));
 BA.debugLineNum = 82;BA.debugLine="roundview.CornerRadius_BL=10%x";
Debug.ShouldStop(131072);
ac_home.mostCurrent._roundview.runMethod(true,"setCornerRadius_BL",ac_home.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),ac_home.mostCurrent.activityBA));
 BA.debugLineNum = 83;BA.debugLine="roundview.CornerRadius_TL=10%x";
Debug.ShouldStop(262144);
ac_home.mostCurrent._roundview.runMethod(true,"setCornerRadius_TL",ac_home.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),ac_home.mostCurrent.activityBA));
 BA.debugLineNum = 84;BA.debugLine="roundview.BackgroundColor=Colors.White";
Debug.ShouldStop(524288);
ac_home.mostCurrent._roundview.runMethod(true,"setBackgroundColor",ac_home.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 86;BA.debugLine="Dim bkcolor_st As ColorDrawable";
Debug.ShouldStop(2097152);
_bkcolor_st = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("bkcolor_st", _bkcolor_st);
 BA.debugLineNum = 87;BA.debugLine="bkcolor_st.Initialize2(0xFFC67D00,50,4dip,0x82FFE";
Debug.ShouldStop(4194304);
_bkcolor_st.runVoidMethod ("Initialize2",(Object)(BA.numberCast(int.class, 0xffc67d00)),(Object)(BA.numberCast(int.class, 50)),(Object)(ac_home.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4)))),(Object)(BA.numberCast(int.class, 0x82ffe300)));
 BA.debugLineNum = 89;BA.debugLine="Dim pnlb1 As Panel";
Debug.ShouldStop(16777216);
_pnlb1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("pnlb1", _pnlb1);
 BA.debugLineNum = 90;BA.debugLine="pnlb1.Initialize(\"\")";
Debug.ShouldStop(33554432);
_pnlb1.runVoidMethod ("Initialize",ac_home.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 91;BA.debugLine="pnlb1.Color=0xFFFFC300";
Debug.ShouldStop(67108864);
_pnlb1.runVoidMethod ("setColor",BA.numberCast(int.class, 0xffffc300));
 BA.debugLineNum = 92;BA.debugLine="pnlb1.Background=bkcolor_st";
Debug.ShouldStop(134217728);
_pnlb1.runMethod(false,"setBackground",(_bkcolor_st.getObject()));
 BA.debugLineNum = 93;BA.debugLine="pnl_coins.AddView(pnlb1,pnl_coins.Width-11%x,1%x,";
Debug.ShouldStop(268435456);
ac_home.mostCurrent._pnl_coins.runVoidMethod ("AddView",(Object)((_pnlb1.getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {ac_home.mostCurrent._pnl_coins.runMethod(true,"getWidth"),ac_home.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 11)),ac_home.mostCurrent.activityBA)}, "-",1, 1)),(Object)(ac_home.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 1)),ac_home.mostCurrent.activityBA)),(Object)(ac_home.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),ac_home.mostCurrent.activityBA)),(Object)(RemoteObject.solve(new RemoteObject[] {ac_home.mostCurrent._pnl_coins.runMethod(true,"getHeight"),ac_home.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),ac_home.mostCurrent.activityBA)}, "-",1, 1)));
 BA.debugLineNum = 95;BA.debugLine="lbl_icon.Initialize(\"lbl_icon\")";
Debug.ShouldStop(1073741824);
ac_home.mostCurrent._lbl_icon.runVoidMethod ("Initialize",ac_home.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("lbl_icon")));
 BA.debugLineNum = 96;BA.debugLine="lbl_icon.SetBackgroundImage(LoadBitmap(File.DirAs";
Debug.ShouldStop(-2147483648);
ac_home.mostCurrent._lbl_icon.runVoidMethod ("SetBackgroundImageNew",(Object)((ac_home.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(ac_home.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("coins.png"))).getObject())));
 BA.debugLineNum = 97;BA.debugLine="pnl_coins.AddView(lbl_icon,pnl_coins.Width-9%x,pn";
Debug.ShouldStop(1);
ac_home.mostCurrent._pnl_coins.runVoidMethod ("AddView",(Object)((ac_home.mostCurrent._lbl_icon.getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {ac_home.mostCurrent._pnl_coins.runMethod(true,"getWidth"),ac_home.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 9)),ac_home.mostCurrent.activityBA)}, "-",1, 1)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {ac_home.mostCurrent._pnl_coins.runMethod(true,"getHeight"),RemoteObject.createImmutable(2),RemoteObject.createImmutable(2)}, "//",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {ac_home.mostCurrent._pnl_coins.runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {ac_home.mostCurrent._pnl_coins.runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "/",0, 0))));
 BA.debugLineNum = 99;BA.debugLine="lbl_nums.Initialize(\"lbl_nums\")";
Debug.ShouldStop(4);
ac_home.mostCurrent._lbl_nums.runVoidMethod ("Initialize",ac_home.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("lbl_nums")));
 BA.debugLineNum = 100;BA.debugLine="lbl_nums.TextColor=Colors.DarkGray";
Debug.ShouldStop(8);
ac_home.mostCurrent._lbl_nums.runMethod(true,"setTextColor",ac_home.mostCurrent.__c.getField(false,"Colors").getField(true,"DarkGray"));
 BA.debugLineNum = 101;BA.debugLine="lbl_nums.TextSize=20";
Debug.ShouldStop(16);
ac_home.mostCurrent._lbl_nums.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 102;BA.debugLine="lbl_nums.Typeface=Typeface.LoadFromAssets(\"iran_s";
Debug.ShouldStop(32);
ac_home.mostCurrent._lbl_nums.runMethod(false,"setTypeface",ac_home.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("iran_sans.ttf"))));
 BA.debugLineNum = 103;BA.debugLine="lbl_nums.Text=0&\" سکه\"";
Debug.ShouldStop(64);
ac_home.mostCurrent._lbl_nums.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable(0),RemoteObject.createImmutable(" سکه"))));
 BA.debugLineNum = 104;BA.debugLine="lbl_nums.Gravity=Gravity.CENTER_VERTICAL+Gravity.";
Debug.ShouldStop(128);
ac_home.mostCurrent._lbl_nums.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {ac_home.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL"),ac_home.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT")}, "+",1, 1));
 BA.debugLineNum = 105;BA.debugLine="pnl_coins.AddView(lbl_nums,2%x,0,pnl_coins.Width-";
Debug.ShouldStop(256);
ac_home.mostCurrent._pnl_coins.runVoidMethod ("AddView",(Object)((ac_home.mostCurrent._lbl_nums.getObject())),(Object)(ac_home.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),ac_home.mostCurrent.activityBA)),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {ac_home.mostCurrent._pnl_coins.runMethod(true,"getWidth"),ac_home.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),ac_home.mostCurrent.activityBA)}, "-",1, 1)),(Object)(ac_home.mostCurrent._pnl_coins.runMethod(true,"getHeight")));
 BA.debugLineNum = 107;BA.debugLine="LV.Initializer(\"LV\").ListView.Build";
Debug.ShouldStop(1024);
ac_home.mostCurrent._lv.runMethod(false,"Initializer",ac_home.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("LV"))).runMethod(false,"ListView").runVoidMethod ("Build");
 BA.debugLineNum = 108;BA.debugLine="Activity.AddView(LV,0,10%y,100%x,90%y)";
Debug.ShouldStop(2048);
ac_home.mostCurrent._activity.runVoidMethod ("AddView",(Object)((ac_home.mostCurrent._lv.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(ac_home.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),ac_home.mostCurrent.activityBA)),(Object)(ac_home.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),ac_home.mostCurrent.activityBA)),(Object)(ac_home.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 90)),ac_home.mostCurrent.activityBA)));
 BA.debugLineNum = 109;BA.debugLine="LV.Ripple.Color(0xFF5E23DE).Alpha(0.2f).Duration(";
Debug.ShouldStop(4096);
ac_home.mostCurrent._lv.runMethod(false,"Ripple").runMethod(false,"Color",(Object)(BA.numberCast(int.class, 0xff5e23de))).runMethod(false,"Alpha",(Object)(BA.numberCast(float.class, 0.2f))).runVoidMethod ("Duration",(Object)(BA.numberCast(int.class, 350)));
 BA.debugLineNum = 110;BA.debugLine="LV.Show";
Debug.ShouldStop(8192);
ac_home.mostCurrent._lv.runVoidMethodAndSync ("Show");
 BA.debugLineNum = 117;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("Activity_Pause (ac_home) ","ac_home",15,ac_home.mostCurrent.activityBA,ac_home.mostCurrent,123);
if (RapidSub.canDelegate("activity_pause")) { return com.it.fome.ac_home.remoteMe.runUserSub(false, "ac_home","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 123;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (ac_home) ","ac_home",15,ac_home.mostCurrent.activityBA,ac_home.mostCurrent,119);
if (RapidSub.canDelegate("activity_resume")) { return com.it.fome.ac_home.remoteMe.runUserSub(false, "ac_home","activity_resume");}
 BA.debugLineNum = 119;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 121;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
 //BA.debugLineNum = 17;BA.debugLine="Dim meno As Label";
ac_home.mostCurrent._meno = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Dim pnl_coins As Panel";
ac_home.mostCurrent._pnl_coins = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Dim lbl_icon ,lbl_nums As Label";
ac_home.mostCurrent._lbl_icon = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
ac_home.mostCurrent._lbl_nums = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Dim roundview As MC7RoundView";
ac_home.mostCurrent._roundview = RemoteObject.createNew ("com.flycoroundview.mc7.MC7RoundView");
 //BA.debugLineNum = 21;BA.debugLine="Dim LV As Hitex_LayoutView";
ac_home.mostCurrent._lv = RemoteObject.createNew ("wir.hitex.recycler.Hitex_LayoutView");
 //BA.debugLineNum = 22;BA.debugLine="Dim glide As Hitex_Glide";
ac_home.mostCurrent._glide = RemoteObject.createNew ("com.hitex_glide.Hitex_Glide");
 //BA.debugLineNum = 23;BA.debugLine="Dim i_username ,i_pk,i_cookie,i_pic As String";
ac_home.mostCurrent._i_username = RemoteObject.createImmutable("");
ac_home.mostCurrent._i_pk = RemoteObject.createImmutable("");
ac_home.mostCurrent._i_cookie = RemoteObject.createImmutable("");
ac_home.mostCurrent._i_pic = RemoteObject.createImmutable("");
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _lv_getitemcount() throws Exception{
try {
		Debug.PushSubsStack("LV_GetItemCount (ac_home) ","ac_home",15,ac_home.mostCurrent.activityBA,ac_home.mostCurrent,210);
if (RapidSub.canDelegate("lv_getitemcount")) { return com.it.fome.ac_home.remoteMe.runUserSub(false, "ac_home","lv_getitemcount");}
 BA.debugLineNum = 210;BA.debugLine="Sub LV_GetItemCount As Int 								        '$ Item";
Debug.ShouldStop(131072);
 BA.debugLineNum = 211;BA.debugLine="Return 2 'ItemList.Size";
Debug.ShouldStop(262144);
if (true) return BA.numberCast(int.class, 2);
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
		Debug.PushSubsStack("LV_ItemClick (ac_home) ","ac_home",15,ac_home.mostCurrent.activityBA,ac_home.mostCurrent,214);
if (RapidSub.canDelegate("lv_itemclick")) { com.it.fome.ac_home.remoteMe.runUserSub(false, "ac_home","lv_itemclick", _clickeditem, _position); return;}
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
public ResumableSub_LV_ItemClick(com.it.fome.ac_home parent,RemoteObject _clickeditem,RemoteObject _position) {
this.parent = parent;
this._clickeditem = _clickeditem;
this._position = _position;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
com.it.fome.ac_home parent;
RemoteObject _clickeditem;
RemoteObject _position;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("LV_ItemClick (ac_home) ","ac_home",15,ac_home.mostCurrent.activityBA,ac_home.mostCurrent,214);
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
parent.mostCurrent.__c.runVoidMethod ("Sleep",ac_home.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ac_home", "lv_itemclick"),BA.numberCast(int.class, 0));
this.state = 23;
return;
case 23:
//C
this.state = 1;
;
 BA.debugLineNum = 216;BA.debugLine="Select Position";
Debug.ShouldStop(8388608);
if (true) break;

case 1:
//select
this.state = 22;
switch (BA.switchObjectToInt(_position,BA.numberCast(int.class, 0),BA.numberCast(int.class, 1),BA.numberCast(int.class, 2),BA.numberCast(int.class, 3))) {
case 0: {
this.state = 3;
if (true) break;
}
case 1: {
this.state = 11;
if (true) break;
}
case 2: {
this.state = 19;
if (true) break;
}
case 3: {
this.state = 21;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 218;BA.debugLine="cursor1 = sql1.ExecQuery(\"SELECT * FROM tbl_acc";
Debug.ShouldStop(33554432);
parent._cursor1.setObject(parent._sql1.runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT * FROM tbl_acc"))));
 BA.debugLineNum = 219;BA.debugLine="If cursor1.RowCount=0 Then";
Debug.ShouldStop(67108864);
if (true) break;

case 4:
//if
this.state = 9;
if (RemoteObject.solveBoolean("=",parent._cursor1.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 220;BA.debugLine="Log(\"nist\")";
Debug.ShouldStop(134217728);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","618677766",RemoteObject.createImmutable("nist"),0);
 BA.debugLineNum = 222;BA.debugLine="SetAnimation(\"anim3\", \"anim4\")";
Debug.ShouldStop(536870912);
_setanimation(BA.ObjectToString("anim3"),RemoteObject.createImmutable("anim4"));
 BA.debugLineNum = 224;BA.debugLine="Activity.Finish";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._activity.runVoidMethod ("Finish");
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 226;BA.debugLine="Log(\"hast\")";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","618677772",RemoteObject.createImmutable("hast"),0);
 BA.debugLineNum = 229;BA.debugLine="SetAnimation(\"anim3\", \"anim4\")";
Debug.ShouldStop(16);
_setanimation(BA.ObjectToString("anim3"),RemoteObject.createImmutable("anim4"));
 BA.debugLineNum = 231;BA.debugLine="Activity.Finish";
Debug.ShouldStop(64);
parent.mostCurrent._activity.runVoidMethod ("Finish");
 if (true) break;

case 9:
//C
this.state = 22;
;
 BA.debugLineNum = 236;BA.debugLine="SetAnimation(\"anim3\", \"anim4\")";
Debug.ShouldStop(2048);
_setanimation(BA.ObjectToString("anim3"),RemoteObject.createImmutable("anim4"));
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 239;BA.debugLine="cursor1 = sql1.ExecQuery(\"SELECT * FROM tbl_tel";
Debug.ShouldStop(16384);
parent._cursor1.setObject(parent._sql1.runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT * FROM tbl_tele WHERE soich='1'"))));
 BA.debugLineNum = 240;BA.debugLine="If cursor1.RowCount=0 Then";
Debug.ShouldStop(32768);
if (true) break;

case 12:
//if
this.state = 17;
if (RemoteObject.solveBoolean("=",parent._cursor1.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
this.state = 14;
}else {
this.state = 16;
}if (true) break;

case 14:
//C
this.state = 17;
 BA.debugLineNum = 241;BA.debugLine="Log(\"nist\")";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","618677787",RemoteObject.createImmutable("nist"),0);
 BA.debugLineNum = 242;BA.debugLine="StartActivity(ac_telelogin)";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",ac_home.processBA,(Object)((parent.mostCurrent._ac_telelogin.getObject())));
 BA.debugLineNum = 243;BA.debugLine="SetAnimation(\"anim3\", \"anim4\")";
Debug.ShouldStop(262144);
_setanimation(BA.ObjectToString("anim3"),RemoteObject.createImmutable("anim4"));
 BA.debugLineNum = 245;BA.debugLine="Activity.Finish";
Debug.ShouldStop(1048576);
parent.mostCurrent._activity.runVoidMethod ("Finish");
 if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 247;BA.debugLine="Log(\"hast\")";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","618677793",RemoteObject.createImmutable("hast"),0);
 BA.debugLineNum = 249;BA.debugLine="StartActivity(ac_telelogin)";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",ac_home.processBA,(Object)((parent.mostCurrent._ac_telelogin.getObject())));
 BA.debugLineNum = 250;BA.debugLine="SetAnimation(\"anim3\", \"anim4\")";
Debug.ShouldStop(33554432);
_setanimation(BA.ObjectToString("anim3"),RemoteObject.createImmutable("anim4"));
 BA.debugLineNum = 252;BA.debugLine="Activity.Finish";
Debug.ShouldStop(134217728);
parent.mostCurrent._activity.runVoidMethod ("Finish");
 if (true) break;

case 17:
//C
this.state = 22;
;
 BA.debugLineNum = 256;BA.debugLine="SetAnimation(\"anim2\", \"anim1\")";
Debug.ShouldStop(-2147483648);
_setanimation(BA.ObjectToString("anim2"),RemoteObject.createImmutable("anim1"));
 if (true) break;

case 19:
//C
this.state = 22;
 if (true) break;

case 21:
//C
this.state = 22;
 if (true) break;

case 22:
//C
this.state = -1;
;
 BA.debugLineNum = 270;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("LV_onBindViewHolder (ac_home) ","ac_home",15,ac_home.mostCurrent.activityBA,ac_home.mostCurrent,179);
if (RapidSub.canDelegate("lv_onbindviewholder")) { return com.it.fome.ac_home.remoteMe.runUserSub(false, "ac_home","lv_onbindviewholder", _parent, _position);}
RemoteObject _pnl_main = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _lbl_itemicon = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _lbl_name = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _lbl_notis = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("Parent", _parent);
Debug.locals.put("Position", _position);
 BA.debugLineNum = 179;BA.debugLine="Sub LV_onBindViewHolder (Parent As Panel, Position";
Debug.ShouldStop(262144);
 BA.debugLineNum = 180;BA.debugLine="Dim pnl_main = Parent.GetView(0) As Panel";
Debug.ShouldStop(524288);
_pnl_main = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_pnl_main.setObject(_parent.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).getObject());Debug.locals.put("pnl_main", _pnl_main);
 BA.debugLineNum = 181;BA.debugLine="Dim lbl_itemicon = pnl_main.GetView(0) As Label";
Debug.ShouldStop(1048576);
_lbl_itemicon = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_lbl_itemicon.setObject(_pnl_main.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).getObject());Debug.locals.put("lbl_itemicon", _lbl_itemicon);
 BA.debugLineNum = 182;BA.debugLine="Dim lbl_name = pnl_main.GetView(1) As Label";
Debug.ShouldStop(2097152);
_lbl_name = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_lbl_name.setObject(_pnl_main.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1))).getObject());Debug.locals.put("lbl_name", _lbl_name);
 BA.debugLineNum = 184;BA.debugLine="Dim lbl_notis = pnl_main.GetView(2) As Label";
Debug.ShouldStop(8388608);
_lbl_notis = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_lbl_notis.setObject(_pnl_main.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 2))).getObject());Debug.locals.put("lbl_notis", _lbl_notis);
 BA.debugLineNum = 186;BA.debugLine="Select Position";
Debug.ShouldStop(33554432);
switch (BA.switchObjectToInt(_position,BA.numberCast(int.class, 0),BA.numberCast(int.class, 1),BA.numberCast(int.class, 2),BA.numberCast(int.class, 3))) {
case 0: {
 BA.debugLineNum = 188;BA.debugLine="lbl_name.Text=\"اینستاگرام\"";
Debug.ShouldStop(134217728);
_lbl_name.runMethod(true,"setText",BA.ObjectToCharSequence("اینستاگرام"));
 BA.debugLineNum = 189;BA.debugLine="lbl_notis.Text=\"فالوور-لایک-کامنت-ویو\"";
Debug.ShouldStop(268435456);
_lbl_notis.runMethod(true,"setText",BA.ObjectToCharSequence("فالوور-لایک-کامنت-ویو"));
 BA.debugLineNum = 190;BA.debugLine="lbl_itemicon.Text=Chr(0xF16D)";
Debug.ShouldStop(536870912);
_lbl_itemicon.runMethod(true,"setText",BA.ObjectToCharSequence(ac_home.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xf16d)))));
 break; }
case 1: {
 BA.debugLineNum = 193;BA.debugLine="lbl_name.Text=\"تلگرام\"";
Debug.ShouldStop(1);
_lbl_name.runMethod(true,"setText",BA.ObjectToCharSequence("تلگرام"));
 BA.debugLineNum = 194;BA.debugLine="lbl_notis.Text=\"ممبر - بازدید\"";
Debug.ShouldStop(2);
_lbl_notis.runMethod(true,"setText",BA.ObjectToCharSequence("ممبر - بازدید"));
 BA.debugLineNum = 195;BA.debugLine="lbl_itemicon.Text=Chr(0xF2C6)";
Debug.ShouldStop(4);
_lbl_itemicon.runMethod(true,"setText",BA.ObjectToCharSequence(ac_home.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xf2c6)))));
 BA.debugLineNum = 196;BA.debugLine="lbl_itemicon.TextColor=0xFF0099FF";
Debug.ShouldStop(8);
_lbl_itemicon.runMethod(true,"setTextColor",BA.numberCast(int.class, 0xff0099ff));
 break; }
case 2: {
 BA.debugLineNum = 198;BA.debugLine="lbl_name.Text=\"آنفالووریاب\"";
Debug.ShouldStop(32);
_lbl_name.runMethod(true,"setText",BA.ObjectToCharSequence("آنفالووریاب"));
 BA.debugLineNum = 199;BA.debugLine="lbl_notis.Text=\"چه کسانی شما رو آنفالو کرده اند";
Debug.ShouldStop(64);
_lbl_notis.runMethod(true,"setText",BA.ObjectToCharSequence("چه کسانی شما رو آنفالو کرده اند؟"));
 BA.debugLineNum = 200;BA.debugLine="lbl_itemicon.Text=Chr(0xE5CD)";
Debug.ShouldStop(128);
_lbl_itemicon.runMethod(true,"setText",BA.ObjectToCharSequence(ac_home.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xe5cd)))));
 break; }
case 3: {
 BA.debugLineNum = 202;BA.debugLine="lbl_name.Text=\"سفارشات\"";
Debug.ShouldStop(512);
_lbl_name.runMethod(true,"setText",BA.ObjectToCharSequence("سفارشات"));
 BA.debugLineNum = 203;BA.debugLine="lbl_notis.Text=\"پیگیری سفارشات\"";
Debug.ShouldStop(1024);
_lbl_notis.runMethod(true,"setText",BA.ObjectToCharSequence("پیگیری سفارشات"));
 BA.debugLineNum = 204;BA.debugLine="lbl_itemicon.Text=Chr(0xE06D)";
Debug.ShouldStop(2048);
_lbl_itemicon.runMethod(true,"setText",BA.ObjectToCharSequence(ac_home.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xe06d)))));
 break; }
}
;
 BA.debugLineNum = 206;BA.debugLine="lbl_notis.Top=pnl_main.Height-10%x";
Debug.ShouldStop(8192);
_lbl_notis.runMethod(true,"setTop",RemoteObject.solve(new RemoteObject[] {_pnl_main.runMethod(true,"getHeight"),ac_home.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),ac_home.mostCurrent.activityBA)}, "-",1, 1));
 BA.debugLineNum = 207;BA.debugLine="Parent.Height=pnl_main.Height+10%x";
Debug.ShouldStop(16384);
_parent.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {_pnl_main.runMethod(true,"getHeight"),ac_home.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),ac_home.mostCurrent.activityBA)}, "+",1, 1));
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
		Debug.PushSubsStack("LV_onCreateViewHolder (ac_home) ","ac_home",15,ac_home.mostCurrent.activityBA,ac_home.mostCurrent,127);
if (RapidSub.canDelegate("lv_oncreateviewholder")) { return com.it.fome.ac_home.remoteMe.runUserSub(false, "ac_home","lv_oncreateviewholder", _parent, _viewtype);}
RemoteObject _bkcolors = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
RemoteObject _pnl_main = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _lbl_itemicon = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _lbl_name = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _bkcolor = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
RemoteObject _lbl_notis = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("Parent", _parent);
Debug.locals.put("ViewType", _viewtype);
 BA.debugLineNum = 127;BA.debugLine="Sub LV_onCreateViewHolder (Parent As Panel, ViewTy";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 129;BA.debugLine="Parent.Color=Colors.Transparent";
Debug.ShouldStop(1);
_parent.runVoidMethod ("setColor",ac_home.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 131;BA.debugLine="Dim bkcolors As ColorDrawable";
Debug.ShouldStop(4);
_bkcolors = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("bkcolors", _bkcolors);
 BA.debugLineNum = 132;BA.debugLine="bkcolors.Initialize(Colors.White,3%x)";
Debug.ShouldStop(8);
_bkcolors.runVoidMethod ("Initialize",(Object)(ac_home.mostCurrent.__c.getField(false,"Colors").getField(true,"White")),(Object)(ac_home.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 3)),ac_home.mostCurrent.activityBA)));
 BA.debugLineNum = 134;BA.debugLine="Dim pnl_main As Panel : pnl_main.Initialize(\"pnl_";
Debug.ShouldStop(32);
_pnl_main = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("pnl_main", _pnl_main);
 BA.debugLineNum = 134;BA.debugLine="Dim pnl_main As Panel : pnl_main.Initialize(\"pnl_";
Debug.ShouldStop(32);
_pnl_main.runVoidMethod ("Initialize",ac_home.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("pnl_main")));
 BA.debugLineNum = 135;BA.debugLine="pnl_main.Color=Colors.White";
Debug.ShouldStop(64);
_pnl_main.runVoidMethod ("setColor",ac_home.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 136;BA.debugLine="pnl_main.Background=bkcolors";
Debug.ShouldStop(128);
_pnl_main.runMethod(false,"setBackground",(_bkcolors.getObject()));
 BA.debugLineNum = 137;BA.debugLine="Parent.AddView(pnl_main,5%x,2%x,90%x,35%x)";
Debug.ShouldStop(256);
_parent.runVoidMethod ("AddView",(Object)((_pnl_main.getObject())),(Object)(ac_home.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),ac_home.mostCurrent.activityBA)),(Object)(ac_home.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),ac_home.mostCurrent.activityBA)),(Object)(ac_home.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 90)),ac_home.mostCurrent.activityBA)),(Object)(ac_home.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 35)),ac_home.mostCurrent.activityBA)));
 BA.debugLineNum = 139;BA.debugLine="Dim lbl_itemicon As Label";
Debug.ShouldStop(1024);
_lbl_itemicon = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl_itemicon", _lbl_itemicon);
 BA.debugLineNum = 140;BA.debugLine="lbl_itemicon.Initialize(\"lbl_itemicon\")";
Debug.ShouldStop(2048);
_lbl_itemicon.runVoidMethod ("Initialize",ac_home.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("lbl_itemicon")));
 BA.debugLineNum = 141;BA.debugLine="lbl_itemicon.TextColor=0xFFD305BA";
Debug.ShouldStop(4096);
_lbl_itemicon.runMethod(true,"setTextColor",BA.numberCast(int.class, 0xffd305ba));
 BA.debugLineNum = 142;BA.debugLine="lbl_itemicon.TextSize=40";
Debug.ShouldStop(8192);
_lbl_itemicon.runMethod(true,"setTextSize",BA.numberCast(float.class, 40));
 BA.debugLineNum = 143;BA.debugLine="lbl_itemicon.Typeface=Typeface.FONTAWESOME";
Debug.ShouldStop(16384);
_lbl_itemicon.runMethod(false,"setTypeface",ac_home.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"getFONTAWESOME"));
 BA.debugLineNum = 144;BA.debugLine="lbl_itemicon.Gravity=Gravity.CENTER_VERTICAL+Grav";
Debug.ShouldStop(32768);
_lbl_itemicon.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {ac_home.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL"),ac_home.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL")}, "+",1, 1));
 BA.debugLineNum = 145;BA.debugLine="pnl_main.AddView(lbl_itemicon,0,3%x,pnl_main.Widt";
Debug.ShouldStop(65536);
_pnl_main.runVoidMethod ("AddView",(Object)((_lbl_itemicon.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(ac_home.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 3)),ac_home.mostCurrent.activityBA)),(Object)(_pnl_main.runMethod(true,"getWidth")),(Object)(ac_home.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 17)),ac_home.mostCurrent.activityBA)));
 BA.debugLineNum = 147;BA.debugLine="Dim lbl_name As Label";
Debug.ShouldStop(262144);
_lbl_name = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl_name", _lbl_name);
 BA.debugLineNum = 148;BA.debugLine="lbl_name.Initialize(\"lbl_name\")";
Debug.ShouldStop(524288);
_lbl_name.runVoidMethod ("Initialize",ac_home.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("lbl_name")));
 BA.debugLineNum = 149;BA.debugLine="lbl_name.TextColor=Colors.DarkGray";
Debug.ShouldStop(1048576);
_lbl_name.runMethod(true,"setTextColor",ac_home.mostCurrent.__c.getField(false,"Colors").getField(true,"DarkGray"));
 BA.debugLineNum = 150;BA.debugLine="lbl_name.TextSize=17";
Debug.ShouldStop(2097152);
_lbl_name.runMethod(true,"setTextSize",BA.numberCast(float.class, 17));
 BA.debugLineNum = 151;BA.debugLine="lbl_name.Typeface=Typeface.LoadFromAssets(\"iran_s";
Debug.ShouldStop(4194304);
_lbl_name.runMethod(false,"setTypeface",ac_home.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("iran_sans.ttf"))));
 BA.debugLineNum = 152;BA.debugLine="lbl_name.Gravity=Gravity.CENTER_VERTICAL+Gravity.";
Debug.ShouldStop(8388608);
_lbl_name.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {ac_home.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL"),ac_home.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL")}, "+",1, 1));
 BA.debugLineNum = 153;BA.debugLine="pnl_main.AddView(lbl_name,0,lbl_itemicon.Top+lbl_";
Debug.ShouldStop(16777216);
_pnl_main.runVoidMethod ("AddView",(Object)((_lbl_name.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {_lbl_itemicon.runMethod(true,"getTop"),_lbl_itemicon.runMethod(true,"getHeight")}, "+",1, 1)),(Object)(_pnl_main.runMethod(true,"getWidth")),(Object)(ac_home.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 11)),ac_home.mostCurrent.activityBA)));
 BA.debugLineNum = 155;BA.debugLine="Dim bkcolor As ColorDrawable";
Debug.ShouldStop(67108864);
_bkcolor = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("bkcolor", _bkcolor);
 BA.debugLineNum = 156;BA.debugLine="bkcolor.Initialize(0xFFFFD82B,30)";
Debug.ShouldStop(134217728);
_bkcolor.runVoidMethod ("Initialize",(Object)(BA.numberCast(int.class, 0xffffd82b)),(Object)(BA.numberCast(int.class, 30)));
 BA.debugLineNum = 157;BA.debugLine="Dim lbl_notis As Label";
Debug.ShouldStop(268435456);
_lbl_notis = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl_notis", _lbl_notis);
 BA.debugLineNum = 158;BA.debugLine="lbl_notis.Initialize(\"lbl_notis\")";
Debug.ShouldStop(536870912);
_lbl_notis.runVoidMethod ("Initialize",ac_home.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("lbl_notis")));
 BA.debugLineNum = 159;BA.debugLine="lbl_notis.TextColor=Colors.DarkGray";
Debug.ShouldStop(1073741824);
_lbl_notis.runMethod(true,"setTextColor",ac_home.mostCurrent.__c.getField(false,"Colors").getField(true,"DarkGray"));
 BA.debugLineNum = 160;BA.debugLine="lbl_notis.TextSize=17";
Debug.ShouldStop(-2147483648);
_lbl_notis.runMethod(true,"setTextSize",BA.numberCast(float.class, 17));
 BA.debugLineNum = 161;BA.debugLine="lbl_notis.Typeface=Typeface.LoadFromAssets(\"iran_";
Debug.ShouldStop(1);
_lbl_notis.runMethod(false,"setTypeface",ac_home.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("iran_sans.ttf"))));
 BA.debugLineNum = 162;BA.debugLine="lbl_notis.Text=\"با قیمت مناسب و کیفیت تضمینی !\"";
Debug.ShouldStop(2);
_lbl_notis.runMethod(true,"setText",BA.ObjectToCharSequence("با قیمت مناسب و کیفیت تضمینی !"));
 BA.debugLineNum = 163;BA.debugLine="lbl_notis.Gravity=Gravity.CENTER_VERTICAL+Gravity";
Debug.ShouldStop(4);
_lbl_notis.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {ac_home.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL"),ac_home.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL")}, "+",1, 1));
 BA.debugLineNum = 165;BA.debugLine="pnl_main.AddView(lbl_notis,1%x,lbl_name.Top+lbl_n";
Debug.ShouldStop(16);
_pnl_main.runVoidMethod ("AddView",(Object)((_lbl_notis.getObject())),(Object)(ac_home.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 1)),ac_home.mostCurrent.activityBA)),(Object)(RemoteObject.solve(new RemoteObject[] {_lbl_name.runMethod(true,"getTop"),_lbl_name.runMethod(true,"getHeight")}, "+",1, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {_pnl_main.runMethod(true,"getWidth"),ac_home.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),ac_home.mostCurrent.activityBA)}, "-",1, 1)),(Object)(ac_home.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 9)),ac_home.mostCurrent.activityBA)));
 BA.debugLineNum = 167;BA.debugLine="lbl_name.Text=\"فالوور بگیر\"";
Debug.ShouldStop(64);
_lbl_name.runMethod(true,"setText",BA.ObjectToCharSequence("فالوور بگیر"));
 BA.debugLineNum = 168;BA.debugLine="lbl_itemicon.Text=Chr(0xE8D3)";
Debug.ShouldStop(128);
_lbl_itemicon.runMethod(true,"setText",BA.ObjectToCharSequence(ac_home.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xe8d3)))));
 BA.debugLineNum = 170;BA.debugLine="roundview.Initialize(lbl_notis)";
Debug.ShouldStop(512);
ac_home.mostCurrent._roundview.runVoidMethod ("Initialize",ac_home.processBA,(Object)((_lbl_notis.getObject())));
 BA.debugLineNum = 171;BA.debugLine="roundview.CornerRadius_BL=30";
Debug.ShouldStop(1024);
ac_home.mostCurrent._roundview.runMethod(true,"setCornerRadius_BL",BA.numberCast(int.class, 30));
 BA.debugLineNum = 172;BA.debugLine="roundview.CornerRadius_BR=30";
Debug.ShouldStop(2048);
ac_home.mostCurrent._roundview.runMethod(true,"setCornerRadius_BR",BA.numberCast(int.class, 30));
 BA.debugLineNum = 173;BA.debugLine="roundview.CornerRadius_TL=30";
Debug.ShouldStop(4096);
ac_home.mostCurrent._roundview.runMethod(true,"setCornerRadius_TL",BA.numberCast(int.class, 30));
 BA.debugLineNum = 174;BA.debugLine="roundview.CornerRadius_TR=30";
Debug.ShouldStop(8192);
ac_home.mostCurrent._roundview.runMethod(true,"setCornerRadius_TR",BA.numberCast(int.class, 30));
 BA.debugLineNum = 175;BA.debugLine="roundview.BackgroundColor=0xFFFFD82B";
Debug.ShouldStop(16384);
ac_home.mostCurrent._roundview.runMethod(true,"setBackgroundColor",BA.numberCast(int.class, 0xffffd82b));
 BA.debugLineNum = 176;BA.debugLine="pnl_main.Height=lbl_notis.Top+lbl_notis.Height+5%";
Debug.ShouldStop(32768);
_pnl_main.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {_lbl_notis.runMethod(true,"getTop"),_lbl_notis.runMethod(true,"getHeight"),ac_home.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),ac_home.mostCurrent.activityBA)}, "++",2, 1));
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
public static RemoteObject  _meno_click() throws Exception{
try {
		Debug.PushSubsStack("meno_Click (ac_home) ","ac_home",15,ac_home.mostCurrent.activityBA,ac_home.mostCurrent,345);
if (RapidSub.canDelegate("meno_click")) { return com.it.fome.ac_home.remoteMe.runUserSub(false, "ac_home","meno_click");}
RemoteObject _mimeno = RemoteObject.declareNull("com.it.fome.mi_meno");
 BA.debugLineNum = 345;BA.debugLine="Sub meno_Click";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 346;BA.debugLine="Dim mimeno As mi_meno";
Debug.ShouldStop(33554432);
_mimeno = RemoteObject.createNew ("com.it.fome.mi_meno");Debug.locals.put("mimeno", _mimeno);
 BA.debugLineNum = 348;BA.debugLine="mimeno.Initialize(\"mimeno\",Me)";
Debug.ShouldStop(134217728);
_mimeno.runClassMethod (com.it.fome.mi_meno.class, "_initialize" /*RemoteObject*/ ,ac_home.mostCurrent.activityBA,(Object)(BA.ObjectToString("mimeno")),(Object)(ac_home.getObject()));
 BA.debugLineNum = 349;BA.debugLine="mimeno.addpnl";
Debug.ShouldStop(268435456);
_mimeno.runClassMethod (com.it.fome.mi_meno.class, "_addpnl" /*RemoteObject*/ );
 BA.debugLineNum = 350;BA.debugLine="mimeno.open";
Debug.ShouldStop(536870912);
_mimeno.runClassMethod (com.it.fome.mi_meno.class, "_open" /*RemoteObject*/ );
 BA.debugLineNum = 351;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
		Debug.PushSubsStack("prfn_onPostStringErrorListener (ac_home) ","ac_home",15,ac_home.mostCurrent.activityBA,ac_home.mostCurrent,302);
if (RapidSub.canDelegate("prfn_onpoststringerrorlistener")) { return com.it.fome.ac_home.remoteMe.runUserSub(false, "ac_home","prfn_onpoststringerrorlistener", _error, _tag);}
Debug.locals.put("Error", _error);
Debug.locals.put("Tag", _tag);
 BA.debugLineNum = 302;BA.debugLine="Sub prfn_onPostStringErrorListener(Error As Respon";
Debug.ShouldStop(8192);
 BA.debugLineNum = 304;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(32768);
ac_home.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 305;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("prfn_onPostStringOkListener (ac_home) ","ac_home",15,ac_home.mostCurrent.activityBA,ac_home.mostCurrent,307);
if (RapidSub.canDelegate("prfn_onpoststringoklistener")) { return com.it.fome.ac_home.remoteMe.runUserSub(false, "ac_home","prfn_onpoststringoklistener", _result, _tag);}
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
Debug.locals.put("Tag", _tag);
 BA.debugLineNum = 307;BA.debugLine="Sub prfn_onPostStringOkListener(Result As String";
Debug.ShouldStop(262144);
 BA.debugLineNum = 309;BA.debugLine="Select Tag";
Debug.ShouldStop(1048576);
switch (BA.switchObjectToInt(_tag,BA.ObjectToString("iuser"),BA.ObjectToString("getinsta"))) {
case 0: {
 BA.debugLineNum = 311;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(4194304);
ac_home.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 312;BA.debugLine="Log(Result)";
Debug.ShouldStop(8388608);
ac_home.mostCurrent.__c.runVoidMethod ("LogImpl","618939909",_result,0);
 break; }
case 1: {
 BA.debugLineNum = 315;BA.debugLine="Log(Result)";
Debug.ShouldStop(67108864);
ac_home.mostCurrent.__c.runVoidMethod ("LogImpl","618939912",_result,0);
 BA.debugLineNum = 316;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(134217728);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 317;BA.debugLine="parser.Initialize(Result)";
Debug.ShouldStop(268435456);
_parser.runVoidMethod ("Initialize",(Object)(_result));
 BA.debugLineNum = 318;BA.debugLine="Dim root As List = parser.NextArray";
Debug.ShouldStop(536870912);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_root = _parser.runMethod(false,"NextArray");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 319;BA.debugLine="For Each colroot As Map In root";
Debug.ShouldStop(1073741824);
_colroot = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group10 = _root;
final int groupLen10 = group10.runMethod(true,"getSize").<Integer>get()
;int index10 = 0;
;
for (; index10 < groupLen10;index10++){
_colroot.setObject(group10.runMethod(false,"Get",index10));
Debug.locals.put("colroot", _colroot);
 BA.debugLineNum = 320;BA.debugLine="Dim Result As String = colroot.Get(\"result\")";
Debug.ShouldStop(-2147483648);
_result = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("result")))));Debug.locals.put("Result", _result);Debug.locals.put("Result", _result);
 BA.debugLineNum = 321;BA.debugLine="Dim c_m As String = colroot.Get(\"c_m\")";
Debug.ShouldStop(1);
_c_m = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("c_m")))));Debug.locals.put("c_m", _c_m);Debug.locals.put("c_m", _c_m);
 BA.debugLineNum = 322;BA.debugLine="Dim uid As String = colroot.Get(\"uid\")";
Debug.ShouldStop(2);
_uid = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("uid")))));Debug.locals.put("uid", _uid);Debug.locals.put("uid", _uid);
 BA.debugLineNum = 323;BA.debugLine="Dim id As String = colroot.Get(\"id\")";
Debug.ShouldStop(4);
_id = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 324;BA.debugLine="Dim c_f As String = colroot.Get(\"c_f\")";
Debug.ShouldStop(8);
_c_f = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("c_f")))));Debug.locals.put("c_f", _c_f);Debug.locals.put("c_f", _c_f);
 BA.debugLineNum = 325;BA.debugLine="Dim pic As String = colroot.Get(\"pic\")";
Debug.ShouldStop(16);
_pic = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("pic")))));Debug.locals.put("pic", _pic);Debug.locals.put("pic", _pic);
 BA.debugLineNum = 326;BA.debugLine="Dim userid As String = colroot.Get(\"userid\")";
Debug.ShouldStop(32);
_userid = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("userid")))));Debug.locals.put("userid", _userid);Debug.locals.put("userid", _userid);
 BA.debugLineNum = 327;BA.debugLine="Dim username As String = colroot.Get(\"username";
Debug.ShouldStop(64);
_username = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("username")))));Debug.locals.put("username", _username);Debug.locals.put("username", _username);
 BA.debugLineNum = 328;BA.debugLine="Log(c_f)";
Debug.ShouldStop(128);
ac_home.mostCurrent.__c.runVoidMethod ("LogImpl","618939925",_c_f,0);
 BA.debugLineNum = 329;BA.debugLine="Dim n_coins=c_m As Long";
Debug.ShouldStop(256);
_n_coins = BA.numberCast(long.class, _c_m);Debug.locals.put("n_coins", _n_coins);Debug.locals.put("n_coins", _n_coins);
 BA.debugLineNum = 330;BA.debugLine="If n_coins>100 Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean(">",_n_coins,BA.numberCast(double.class, 100))) { 
 BA.debugLineNum = 331;BA.debugLine="lbl_nums.Text=\"سکه \"&NumberFormat(c_m,3,0)";
Debug.ShouldStop(1024);
ac_home.mostCurrent._lbl_nums.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("سکه "),ac_home.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _c_m)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 0))))));
 }else {
 BA.debugLineNum = 333;BA.debugLine="lbl_nums.Text=\"سکه \"&c_m";
Debug.ShouldStop(4096);
ac_home.mostCurrent._lbl_nums.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("سکه "),_c_m)));
 };
 BA.debugLineNum = 337;BA.debugLine="sql1.ExecNonQuery(\"UPDATE tbl_coin set cm='\"&c";
Debug.ShouldStop(65536);
ac_home._sql1.runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE tbl_coin set cm='"),_c_m,RemoteObject.createImmutable("',cf='"),_c_f,RemoteObject.createImmutable("' WHERE userid='"),ac_home.mostCurrent._i_pk,RemoteObject.createImmutable("' "))));
 }
}Debug.locals.put("colroot", _colroot);
;
 break; }
}
;
 BA.debugLineNum = 343;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
ac_home._sql1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL");
 //BA.debugLineNum = 10;BA.debugLine="Private cursor1 As Cursor";
ac_home._cursor1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _req_getme(RemoteObject _userid) throws Exception{
try {
		Debug.PushSubsStack("req_getme (ac_home) ","ac_home",15,ac_home.mostCurrent.activityBA,ac_home.mostCurrent,284);
if (RapidSub.canDelegate("req_getme")) { return com.it.fome.ac_home.remoteMe.runUserSub(false, "ac_home","req_getme", _userid);}
RemoteObject _prfn = RemoteObject.declareNull("com.reza.sh.fastnet.Fastnet");
RemoteObject _post = RemoteObject.declareNull("com.reza.sh.fastnet.PostRequestRaper");
Debug.locals.put("userid", _userid);
 BA.debugLineNum = 284;BA.debugLine="Sub req_getme(userid As String)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 285;BA.debugLine="Dim prfn As PersianFastNetwork";
Debug.ShouldStop(268435456);
_prfn = RemoteObject.createNew ("com.reza.sh.fastnet.Fastnet");Debug.locals.put("prfn", _prfn);
 BA.debugLineNum = 286;BA.debugLine="prfn.initialize(\"prfn\")";
Debug.ShouldStop(536870912);
_prfn.runVoidMethod ("initialize",ac_home.processBA,(Object)(RemoteObject.createImmutable("prfn")));
 BA.debugLineNum = 288;BA.debugLine="Dim post As PostRequest";
Debug.ShouldStop(-2147483648);
_post = RemoteObject.createNew ("com.reza.sh.fastnet.PostRequestRaper");Debug.locals.put("post", _post);
 BA.debugLineNum = 289;BA.debugLine="post=prfn.BuildPostQuery(\"http://filework.ir/INST";
Debug.ShouldStop(1);
_post = _prfn.runMethod(false,"BuildPostQuery",(Object)(BA.ObjectToString("http://filework.ir/INSTAFOLLOW/api/req.php")),(Object)(RemoteObject.createImmutable("getinsta")));Debug.locals.put("post", _post);
 BA.debugLineNum = 291;BA.debugLine="post.addHeder(\"User-Agent\",\"Dalvik/1.6.0 (Linux;";
Debug.ShouldStop(4);
_post.runVoidMethod ("addHeder",(Object)(BA.ObjectToString("User-Agent")),(Object)(RemoteObject.createImmutable("Dalvik/1.6.0 (Linux; U; Android 4.4.4; SM-A700FD Build/KTU84P)")));
 BA.debugLineNum = 293;BA.debugLine="post.addParametrs(\"ui\",\"1\")";
Debug.ShouldStop(16);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("ui")),(Object)(RemoteObject.createImmutable("1")));
 BA.debugLineNum = 294;BA.debugLine="post.addParametrs(\"userid\",i_pk)";
Debug.ShouldStop(32);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("userid")),(Object)(ac_home.mostCurrent._i_pk));
 BA.debugLineNum = 296;BA.debugLine="post.addParametrs(\"req\",\"get_acci\")";
Debug.ShouldStop(128);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("req")),(Object)(RemoteObject.createImmutable("get_acci")));
 BA.debugLineNum = 299;BA.debugLine="post.executRequestAsString";
Debug.ShouldStop(1024);
_post.runVoidMethod ("executRequestAsString");
 BA.debugLineNum = 300;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("SetAnimation (ac_home) ","ac_home",15,ac_home.mostCurrent.activityBA,ac_home.mostCurrent,272);
if (RapidSub.canDelegate("setanimation")) { return com.it.fome.ac_home.remoteMe.runUserSub(false, "ac_home","setanimation", _inanimation, _outanimation);}
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
RemoteObject _package = RemoteObject.createImmutable("");
RemoteObject _in = RemoteObject.createImmutable(0);
RemoteObject _out = RemoteObject.createImmutable(0);
Debug.locals.put("InAnimation", _inanimation);
Debug.locals.put("OutAnimation", _outanimation);
 BA.debugLineNum = 272;BA.debugLine="Sub SetAnimation(InAnimation As String, OutAnimati";
Debug.ShouldStop(32768);
 BA.debugLineNum = 273;BA.debugLine="Dim r As Reflector";
Debug.ShouldStop(65536);
_r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("r", _r);
 BA.debugLineNum = 274;BA.debugLine="Dim package As String";
Debug.ShouldStop(131072);
_package = RemoteObject.createImmutable("");Debug.locals.put("package", _package);
 BA.debugLineNum = 275;BA.debugLine="Dim In, out As Int";
Debug.ShouldStop(262144);
_in = RemoteObject.createImmutable(0);Debug.locals.put("In", _in);
_out = RemoteObject.createImmutable(0);Debug.locals.put("out", _out);
 BA.debugLineNum = 276;BA.debugLine="package = r.GetStaticField(\"anywheresoftware.b4a.";
Debug.ShouldStop(524288);
_package = BA.ObjectToString(_r.runMethod(false,"GetStaticField",(Object)(BA.ObjectToString("anywheresoftware.b4a.BA")),(Object)(RemoteObject.createImmutable("packageName"))));Debug.locals.put("package", _package);
 BA.debugLineNum = 277;BA.debugLine="In = r.GetStaticField(package & \".R$anim\", InAnim";
Debug.ShouldStop(1048576);
_in = BA.numberCast(int.class, _r.runMethod(false,"GetStaticField",(Object)(RemoteObject.concat(_package,RemoteObject.createImmutable(".R$anim"))),(Object)(_inanimation)));Debug.locals.put("In", _in);
 BA.debugLineNum = 278;BA.debugLine="out = r.GetStaticField(package & \".R$anim\", OutAn";
Debug.ShouldStop(2097152);
_out = BA.numberCast(int.class, _r.runMethod(false,"GetStaticField",(Object)(RemoteObject.concat(_package,RemoteObject.createImmutable(".R$anim"))),(Object)(_outanimation)));Debug.locals.put("out", _out);
 BA.debugLineNum = 279;BA.debugLine="r.Target = r.GetActivity";
Debug.ShouldStop(4194304);
_r.setField ("Target",(_r.runMethod(false,"GetActivity",ac_home.processBA)));
 BA.debugLineNum = 280;BA.debugLine="r.RunMethod4(\"overridePendingTransition\", Array A";
Debug.ShouldStop(8388608);
_r.runVoidMethod ("RunMethod4",(Object)(BA.ObjectToString("overridePendingTransition")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_in),(_out)})),(Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.ObjectToString("java.lang.int"),RemoteObject.createImmutable("java.lang.int")})));
 BA.debugLineNum = 281;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}