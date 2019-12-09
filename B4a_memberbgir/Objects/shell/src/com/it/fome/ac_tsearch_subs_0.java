package com.it.fome;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class ac_tsearch_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (ac_tsearch) ","ac_tsearch",12,ac_tsearch.mostCurrent.activityBA,ac_tsearch.mostCurrent,40);
if (RapidSub.canDelegate("activity_create")) { return com.it.fome.ac_tsearch.remoteMe.runUserSub(false, "ac_tsearch","activity_create", _firsttime);}
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _gradient1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.GradientDrawable");
RemoteObject _clrs = null;
RemoteObject _bkcolor = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
RemoteObject _bkcolor_st = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
RemoteObject _pnlb1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _bg = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
RemoteObject _lbl_a = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _card = RemoteObject.declareNull("de.amberhome.objects.CardViewWrapper");
RemoteObject _pnl_search = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _lbl_search = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 40;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(128);
 BA.debugLineNum = 45;BA.debugLine="telegs.Initialize(\"telegs\")";
Debug.ShouldStop(4096);
ac_tsearch._telegs.runVoidMethod ("Initialize",ac_tsearch.processBA,(Object)(RemoteObject.createImmutable("telegs")));
 BA.debugLineNum = 46;BA.debugLine="listchats.Initialize";
Debug.ShouldStop(8192);
ac_tsearch.mostCurrent._listchats.runVoidMethod ("Initialize");
 BA.debugLineNum = 48;BA.debugLine="If File.Exists(File.DirInternal,\"instadb.db\")=Fal";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",ac_tsearch.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(ac_tsearch.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("instadb.db"))),ac_tsearch.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 49;BA.debugLine="File.Copy(File.DirAssets,\"instadb.db\",File.DirIn";
Debug.ShouldStop(65536);
ac_tsearch.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(ac_tsearch.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("instadb.db")),(Object)(ac_tsearch.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("instadb.db")));
 };
 BA.debugLineNum = 51;BA.debugLine="If sql1.IsInitialized=False Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",ac_tsearch._sql1.runMethod(true,"IsInitialized"),ac_tsearch.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 52;BA.debugLine="sql1.Initialize(File.DirInternal,\"instadb.db\",Fa";
Debug.ShouldStop(524288);
ac_tsearch._sql1.runVoidMethod ("Initialize",(Object)(ac_tsearch.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("instadb.db")),(Object)(ac_tsearch.mostCurrent.__c.getField(true,"False")));
 };
 BA.debugLineNum = 64;BA.debugLine="cursor1 = sql1.ExecQuery(\"SELECT * FROM tbl_tele";
Debug.ShouldStop(-2147483648);
ac_tsearch._cursor1.setObject(ac_tsearch._sql1.runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT * FROM tbl_tele WHERE soich='1'"))));
 BA.debugLineNum = 65;BA.debugLine="Dim i As Int";
Debug.ShouldStop(1);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 66;BA.debugLine="For i=0 To cursor1.RowCount-1";
Debug.ShouldStop(2);
{
final int step11 = 1;
final int limit11 = RemoteObject.solve(new RemoteObject[] {ac_tsearch._cursor1.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step11 > 0 && _i.<Integer>get().intValue() <= limit11) || (step11 < 0 && _i.<Integer>get().intValue() >= limit11) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step11))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 67;BA.debugLine="cursor1.Position=i";
Debug.ShouldStop(4);
ac_tsearch._cursor1.runMethod(true,"setPosition",_i);
 BA.debugLineNum = 68;BA.debugLine="userid_t=cursor1.GetString(\"userid\")";
Debug.ShouldStop(8);
ac_tsearch._userid_t = ac_tsearch._cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("userid")));
 BA.debugLineNum = 69;BA.debugLine="username_t=cursor1.GetString(\"username\")";
Debug.ShouldStop(16);
ac_tsearch._username_t = ac_tsearch._cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("username")));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 71;BA.debugLine="cursor1.Close";
Debug.ShouldStop(64);
ac_tsearch._cursor1.runVoidMethod ("Close");
 BA.debugLineNum = 74;BA.debugLine="Dim Gradient1 As GradientDrawable";
Debug.ShouldStop(512);
_gradient1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.GradientDrawable");Debug.locals.put("Gradient1", _gradient1);
 BA.debugLineNum = 75;BA.debugLine="Dim Clrs(5) As Int";
Debug.ShouldStop(1024);
_clrs = RemoteObject.createNewArray ("int", new int[] {5}, new Object[]{});Debug.locals.put("Clrs", _clrs);
 BA.debugLineNum = 76;BA.debugLine="Clrs(0) = 0xFFe8eaf6";
Debug.ShouldStop(2048);
_clrs.setArrayElement (BA.numberCast(int.class, 0xffe8eaf6),BA.numberCast(int.class, 0));
 BA.debugLineNum = 77;BA.debugLine="Clrs(1) = 0xFFe8eaf6";
Debug.ShouldStop(4096);
_clrs.setArrayElement (BA.numberCast(int.class, 0xffe8eaf6),BA.numberCast(int.class, 1));
 BA.debugLineNum = 78;BA.debugLine="Clrs(2) = 0xFFe8eaf6";
Debug.ShouldStop(8192);
_clrs.setArrayElement (BA.numberCast(int.class, 0xffe8eaf6),BA.numberCast(int.class, 2));
 BA.debugLineNum = 79;BA.debugLine="Clrs(3) = 0xFF283593";
Debug.ShouldStop(16384);
_clrs.setArrayElement (BA.numberCast(int.class, 0xff283593),BA.numberCast(int.class, 3));
 BA.debugLineNum = 80;BA.debugLine="Clrs(4) = 0xFF283593";
Debug.ShouldStop(32768);
_clrs.setArrayElement (BA.numberCast(int.class, 0xff283593),BA.numberCast(int.class, 4));
 BA.debugLineNum = 82;BA.debugLine="Gradient1.Initialize(\"TOP_BOTTOM\", Clrs)";
Debug.ShouldStop(131072);
_gradient1.runVoidMethod ("Initialize",(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.drawable.GradientDrawable.Orientation"),"TOP_BOTTOM")),(Object)(_clrs));
 BA.debugLineNum = 83;BA.debugLine="Activity.Background=Gradient1";
Debug.ShouldStop(262144);
ac_tsearch.mostCurrent._activity.runMethod(false,"setBackground",(_gradient1.getObject()));
 BA.debugLineNum = 85;BA.debugLine="Dim bkcolor As ColorDrawable";
Debug.ShouldStop(1048576);
_bkcolor = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("bkcolor", _bkcolor);
 BA.debugLineNum = 86;BA.debugLine="bkcolor.Initialize(Colors.White,8)";
Debug.ShouldStop(2097152);
_bkcolor.runVoidMethod ("Initialize",(Object)(ac_tsearch.mostCurrent.__c.getField(false,"Colors").getField(true,"White")),(Object)(BA.numberCast(int.class, 8)));
 BA.debugLineNum = 87;BA.debugLine="meno.Initialize(\"meno\")";
Debug.ShouldStop(4194304);
ac_tsearch.mostCurrent._meno.runVoidMethod ("Initialize",ac_tsearch.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("meno")));
 BA.debugLineNum = 88;BA.debugLine="meno.TextColor=Colors.DarkGray";
Debug.ShouldStop(8388608);
ac_tsearch.mostCurrent._meno.runMethod(true,"setTextColor",ac_tsearch.mostCurrent.__c.getField(false,"Colors").getField(true,"DarkGray"));
 BA.debugLineNum = 89;BA.debugLine="meno.TextSize=37";
Debug.ShouldStop(16777216);
ac_tsearch.mostCurrent._meno.runMethod(true,"setTextSize",BA.numberCast(float.class, 37));
 BA.debugLineNum = 90;BA.debugLine="meno.Background=bkcolor";
Debug.ShouldStop(33554432);
ac_tsearch.mostCurrent._meno.runMethod(false,"setBackground",(_bkcolor.getObject()));
 BA.debugLineNum = 91;BA.debugLine="meno.Typeface=Typeface.MATERIALICONS";
Debug.ShouldStop(67108864);
ac_tsearch.mostCurrent._meno.runMethod(false,"setTypeface",ac_tsearch.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"getMATERIALICONS"));
 BA.debugLineNum = 92;BA.debugLine="meno.Text=Chr(0xE3C7)";
Debug.ShouldStop(134217728);
ac_tsearch.mostCurrent._meno.runMethod(true,"setText",BA.ObjectToCharSequence(ac_tsearch.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xe3c7)))));
 BA.debugLineNum = 93;BA.debugLine="meno.Gravity=Gravity.CENTER_HORIZONTAL+Gravity.CE";
Debug.ShouldStop(268435456);
ac_tsearch.mostCurrent._meno.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {ac_tsearch.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL"),ac_tsearch.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")}, "+",1, 1));
 BA.debugLineNum = 94;BA.debugLine="Activity.AddView(meno,3%x,3%x,12%x,12%x)";
Debug.ShouldStop(536870912);
ac_tsearch.mostCurrent._activity.runVoidMethod ("AddView",(Object)((ac_tsearch.mostCurrent._meno.getObject())),(Object)(ac_tsearch.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 3)),ac_tsearch.mostCurrent.activityBA)),(Object)(ac_tsearch.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 3)),ac_tsearch.mostCurrent.activityBA)),(Object)(ac_tsearch.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 12)),ac_tsearch.mostCurrent.activityBA)),(Object)(ac_tsearch.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 12)),ac_tsearch.mostCurrent.activityBA)));
 BA.debugLineNum = 96;BA.debugLine="pnl_coins.Initialize(\"pnl_coins\")";
Debug.ShouldStop(-2147483648);
ac_tsearch.mostCurrent._pnl_coins.runVoidMethod ("Initialize",ac_tsearch.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("pnl_coins")));
 BA.debugLineNum = 97;BA.debugLine="Activity.AddView(pnl_coins,50%x,3%x,50%x,12%x)";
Debug.ShouldStop(1);
ac_tsearch.mostCurrent._activity.runVoidMethod ("AddView",(Object)((ac_tsearch.mostCurrent._pnl_coins.getObject())),(Object)(ac_tsearch.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 50)),ac_tsearch.mostCurrent.activityBA)),(Object)(ac_tsearch.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 3)),ac_tsearch.mostCurrent.activityBA)),(Object)(ac_tsearch.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 50)),ac_tsearch.mostCurrent.activityBA)),(Object)(ac_tsearch.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 12)),ac_tsearch.mostCurrent.activityBA)));
 BA.debugLineNum = 98;BA.debugLine="roundview.Initialize(pnl_coins)";
Debug.ShouldStop(2);
ac_tsearch.mostCurrent._roundview.runVoidMethod ("Initialize",ac_tsearch.processBA,(Object)((ac_tsearch.mostCurrent._pnl_coins.getObject())));
 BA.debugLineNum = 99;BA.debugLine="roundview.CornerRadius_BL=35";
Debug.ShouldStop(4);
ac_tsearch.mostCurrent._roundview.runMethod(true,"setCornerRadius_BL",BA.numberCast(int.class, 35));
 BA.debugLineNum = 100;BA.debugLine="roundview.CornerRadius_TL=35";
Debug.ShouldStop(8);
ac_tsearch.mostCurrent._roundview.runMethod(true,"setCornerRadius_TL",BA.numberCast(int.class, 35));
 BA.debugLineNum = 101;BA.debugLine="roundview.BackgroundColor=Colors.White";
Debug.ShouldStop(16);
ac_tsearch.mostCurrent._roundview.runMethod(true,"setBackgroundColor",ac_tsearch.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 103;BA.debugLine="Dim bkcolor_st As ColorDrawable";
Debug.ShouldStop(64);
_bkcolor_st = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("bkcolor_st", _bkcolor_st);
 BA.debugLineNum = 104;BA.debugLine="bkcolor_st.Initialize2(0xFFC67D00,50,4dip,0x82FFE";
Debug.ShouldStop(128);
_bkcolor_st.runVoidMethod ("Initialize2",(Object)(BA.numberCast(int.class, 0xffc67d00)),(Object)(BA.numberCast(int.class, 50)),(Object)(ac_tsearch.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4)))),(Object)(BA.numberCast(int.class, 0x82ffe300)));
 BA.debugLineNum = 106;BA.debugLine="Dim pnlb1 As Panel";
Debug.ShouldStop(512);
_pnlb1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("pnlb1", _pnlb1);
 BA.debugLineNum = 107;BA.debugLine="pnlb1.Initialize(\"\")";
Debug.ShouldStop(1024);
_pnlb1.runVoidMethod ("Initialize",ac_tsearch.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 108;BA.debugLine="pnlb1.Color=0xFFFFC300";
Debug.ShouldStop(2048);
_pnlb1.runVoidMethod ("setColor",BA.numberCast(int.class, 0xffffc300));
 BA.debugLineNum = 109;BA.debugLine="pnlb1.Background=bkcolor_st";
Debug.ShouldStop(4096);
_pnlb1.runMethod(false,"setBackground",(_bkcolor_st.getObject()));
 BA.debugLineNum = 110;BA.debugLine="pnl_coins.AddView(pnlb1,pnl_coins.Width-11%x,1%x,";
Debug.ShouldStop(8192);
ac_tsearch.mostCurrent._pnl_coins.runVoidMethod ("AddView",(Object)((_pnlb1.getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {ac_tsearch.mostCurrent._pnl_coins.runMethod(true,"getWidth"),ac_tsearch.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 11)),ac_tsearch.mostCurrent.activityBA)}, "-",1, 1)),(Object)(ac_tsearch.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 1)),ac_tsearch.mostCurrent.activityBA)),(Object)(ac_tsearch.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),ac_tsearch.mostCurrent.activityBA)),(Object)(RemoteObject.solve(new RemoteObject[] {ac_tsearch.mostCurrent._pnl_coins.runMethod(true,"getHeight"),ac_tsearch.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),ac_tsearch.mostCurrent.activityBA)}, "-",1, 1)));
 BA.debugLineNum = 112;BA.debugLine="lbl_icon.Initialize(\"lbl_icon\")";
Debug.ShouldStop(32768);
ac_tsearch.mostCurrent._lbl_icon.runVoidMethod ("Initialize",ac_tsearch.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("lbl_icon")));
 BA.debugLineNum = 113;BA.debugLine="lbl_icon.SetBackgroundImage(LoadBitmap(File.DirAs";
Debug.ShouldStop(65536);
ac_tsearch.mostCurrent._lbl_icon.runVoidMethod ("SetBackgroundImageNew",(Object)((ac_tsearch.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(ac_tsearch.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("coins.png"))).getObject())));
 BA.debugLineNum = 114;BA.debugLine="pnl_coins.AddView(lbl_icon,pnl_coins.Width-9%x,pn";
Debug.ShouldStop(131072);
ac_tsearch.mostCurrent._pnl_coins.runVoidMethod ("AddView",(Object)((ac_tsearch.mostCurrent._lbl_icon.getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {ac_tsearch.mostCurrent._pnl_coins.runMethod(true,"getWidth"),ac_tsearch.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 9)),ac_tsearch.mostCurrent.activityBA)}, "-",1, 1)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {ac_tsearch.mostCurrent._pnl_coins.runMethod(true,"getHeight"),RemoteObject.createImmutable(2),RemoteObject.createImmutable(2)}, "//",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {ac_tsearch.mostCurrent._pnl_coins.runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {ac_tsearch.mostCurrent._pnl_coins.runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "/",0, 0))));
 BA.debugLineNum = 116;BA.debugLine="lbl_nums.Initialize(\"lbl_nums\")";
Debug.ShouldStop(524288);
ac_tsearch.mostCurrent._lbl_nums.runVoidMethod ("Initialize",ac_tsearch.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("lbl_nums")));
 BA.debugLineNum = 117;BA.debugLine="lbl_nums.TextColor=Colors.DarkGray";
Debug.ShouldStop(1048576);
ac_tsearch.mostCurrent._lbl_nums.runMethod(true,"setTextColor",ac_tsearch.mostCurrent.__c.getField(false,"Colors").getField(true,"DarkGray"));
 BA.debugLineNum = 118;BA.debugLine="lbl_nums.TextSize=20";
Debug.ShouldStop(2097152);
ac_tsearch.mostCurrent._lbl_nums.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 119;BA.debugLine="lbl_nums.Typeface=Typeface.LoadFromAssets(\"iran_s";
Debug.ShouldStop(4194304);
ac_tsearch.mostCurrent._lbl_nums.runMethod(false,"setTypeface",ac_tsearch.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("iran_sans.ttf"))));
 BA.debugLineNum = 120;BA.debugLine="lbl_nums.Text=0&\" سکه\"";
Debug.ShouldStop(8388608);
ac_tsearch.mostCurrent._lbl_nums.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable(0),RemoteObject.createImmutable(" سکه"))));
 BA.debugLineNum = 121;BA.debugLine="lbl_nums.Gravity=Gravity.CENTER_VERTICAL+Gravity.";
Debug.ShouldStop(16777216);
ac_tsearch.mostCurrent._lbl_nums.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {ac_tsearch.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL"),ac_tsearch.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT")}, "+",1, 1));
 BA.debugLineNum = 122;BA.debugLine="pnl_coins.AddView(lbl_nums,2%x,0,pnl_coins.Width-";
Debug.ShouldStop(33554432);
ac_tsearch.mostCurrent._pnl_coins.runVoidMethod ("AddView",(Object)((ac_tsearch.mostCurrent._lbl_nums.getObject())),(Object)(ac_tsearch.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),ac_tsearch.mostCurrent.activityBA)),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {ac_tsearch.mostCurrent._pnl_coins.runMethod(true,"getWidth"),ac_tsearch.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),ac_tsearch.mostCurrent.activityBA)}, "-",1, 1)),(Object)(ac_tsearch.mostCurrent._pnl_coins.runMethod(true,"getHeight")));
 BA.debugLineNum = 124;BA.debugLine="Dim bg As ColorDrawable";
Debug.ShouldStop(134217728);
_bg = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("bg", _bg);
 BA.debugLineNum = 125;BA.debugLine="bg.Initialize2(Colors.White,5dip,2dip,Colors.Ligh";
Debug.ShouldStop(268435456);
_bg.runVoidMethod ("Initialize2",(Object)(ac_tsearch.mostCurrent.__c.getField(false,"Colors").getField(true,"White")),(Object)(ac_tsearch.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))),(Object)(ac_tsearch.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))),(Object)(ac_tsearch.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray")));
 BA.debugLineNum = 126;BA.debugLine="pnl_lv.Initialize(\"pnl_lv\")";
Debug.ShouldStop(536870912);
ac_tsearch.mostCurrent._pnl_lv.runVoidMethod ("Initialize",ac_tsearch.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("pnl_lv")));
 BA.debugLineNum = 127;BA.debugLine="pnl_lv.Background=bg";
Debug.ShouldStop(1073741824);
ac_tsearch.mostCurrent._pnl_lv.runMethod(false,"setBackground",(_bg.getObject()));
 BA.debugLineNum = 128;BA.debugLine="Activity.AddView(pnl_lv,5%x,12%y,100%x-10%x,90%y-";
Debug.ShouldStop(-2147483648);
ac_tsearch.mostCurrent._activity.runVoidMethod ("AddView",(Object)((ac_tsearch.mostCurrent._pnl_lv.getObject())),(Object)(ac_tsearch.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),ac_tsearch.mostCurrent.activityBA)),(Object)(ac_tsearch.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 12)),ac_tsearch.mostCurrent.activityBA)),(Object)(RemoteObject.solve(new RemoteObject[] {ac_tsearch.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),ac_tsearch.mostCurrent.activityBA),ac_tsearch.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),ac_tsearch.mostCurrent.activityBA)}, "-",1, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {ac_tsearch.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 90)),ac_tsearch.mostCurrent.activityBA),ac_tsearch.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 7)),ac_tsearch.mostCurrent.activityBA)}, "-",1, 1)));
 BA.debugLineNum = 130;BA.debugLine="Dim lbl_a As Label";
Debug.ShouldStop(2);
_lbl_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl_a", _lbl_a);
 BA.debugLineNum = 131;BA.debugLine="lbl_a.Initialize(\"lbl_a\")";
Debug.ShouldStop(4);
_lbl_a.runVoidMethod ("Initialize",ac_tsearch.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("lbl_a")));
 BA.debugLineNum = 132;BA.debugLine="lbl_a.TextColor=Colors.DarkGray";
Debug.ShouldStop(8);
_lbl_a.runMethod(true,"setTextColor",ac_tsearch.mostCurrent.__c.getField(false,"Colors").getField(true,"DarkGray"));
 BA.debugLineNum = 133;BA.debugLine="lbl_a.TextSize=14";
Debug.ShouldStop(16);
_lbl_a.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 134;BA.debugLine="lbl_a.Typeface=Typeface.LoadFromAssets(\"iran_sans";
Debug.ShouldStop(32);
_lbl_a.runMethod(false,"setTypeface",ac_tsearch.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("iran_sans.ttf"))));
 BA.debugLineNum = 135;BA.debugLine="lbl_a.Text=\"ثبت کانال جدید\"";
Debug.ShouldStop(64);
_lbl_a.runMethod(true,"setText",BA.ObjectToCharSequence("ثبت کانال جدید"));
 BA.debugLineNum = 136;BA.debugLine="lbl_a.Gravity=Gravity.CENTER_VERTICAL+Gravity.CEN";
Debug.ShouldStop(128);
_lbl_a.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {ac_tsearch.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL"),ac_tsearch.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL")}, "+",1, 1));
 BA.debugLineNum = 137;BA.debugLine="pnl_lv.AddView(lbl_a,5%x,0,pnl_lv.Width-10%x,10%x";
Debug.ShouldStop(256);
ac_tsearch.mostCurrent._pnl_lv.runVoidMethod ("AddView",(Object)((_lbl_a.getObject())),(Object)(ac_tsearch.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),ac_tsearch.mostCurrent.activityBA)),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {ac_tsearch.mostCurrent._pnl_lv.runMethod(true,"getWidth"),ac_tsearch.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),ac_tsearch.mostCurrent.activityBA)}, "-",1, 1)),(Object)(ac_tsearch.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),ac_tsearch.mostCurrent.activityBA)));
 BA.debugLineNum = 139;BA.debugLine="Dim card As CardView";
Debug.ShouldStop(1024);
_card = RemoteObject.createNew ("de.amberhome.objects.CardViewWrapper");Debug.locals.put("card", _card);
 BA.debugLineNum = 140;BA.debugLine="card.Initialize(\"\")";
Debug.ShouldStop(2048);
_card.runVoidMethod ("Initialize",ac_tsearch.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 141;BA.debugLine="card.Color=Colors.White";
Debug.ShouldStop(4096);
_card.runVoidMethod ("setColor",ac_tsearch.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 142;BA.debugLine="pnl_lv.AddView(card,5%x,lbl_a.Top+lbl_a.Height,pn";
Debug.ShouldStop(8192);
ac_tsearch.mostCurrent._pnl_lv.runVoidMethod ("AddView",(Object)((_card.getObject())),(Object)(ac_tsearch.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),ac_tsearch.mostCurrent.activityBA)),(Object)(RemoteObject.solve(new RemoteObject[] {_lbl_a.runMethod(true,"getTop"),_lbl_a.runMethod(true,"getHeight")}, "+",1, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {ac_tsearch.mostCurrent._pnl_lv.runMethod(true,"getWidth"),ac_tsearch.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),ac_tsearch.mostCurrent.activityBA)}, "-",1, 1)),(Object)(ac_tsearch.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 17)),ac_tsearch.mostCurrent.activityBA)));
 BA.debugLineNum = 144;BA.debugLine="Dim pnl_search As Panel";
Debug.ShouldStop(32768);
_pnl_search = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("pnl_search", _pnl_search);
 BA.debugLineNum = 145;BA.debugLine="pnl_search.Initialize(\"\")";
Debug.ShouldStop(65536);
_pnl_search.runVoidMethod ("Initialize",ac_tsearch.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 146;BA.debugLine="card.AddView(pnl_search,0,0,card.Width,card.Heigh";
Debug.ShouldStop(131072);
_card.runVoidMethod ("AddView",(Object)((_pnl_search.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_card.runMethod(true,"getWidth")),(Object)(_card.runMethod(true,"getHeight")));
 BA.debugLineNum = 148;BA.debugLine="Dim bg As ColorDrawable";
Debug.ShouldStop(524288);
_bg = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("bg", _bg);
 BA.debugLineNum = 149;BA.debugLine="bg.Initialize(0xFF0072FF,20dip)";
Debug.ShouldStop(1048576);
_bg.runVoidMethod ("Initialize",(Object)(BA.numberCast(int.class, 0xff0072ff)),(Object)(ac_tsearch.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))));
 BA.debugLineNum = 151;BA.debugLine="Dim lbl_search As Label";
Debug.ShouldStop(4194304);
_lbl_search = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl_search", _lbl_search);
 BA.debugLineNum = 152;BA.debugLine="lbl_search.Initialize(\"lbl_search\")";
Debug.ShouldStop(8388608);
_lbl_search.runVoidMethod ("Initialize",ac_tsearch.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("lbl_search")));
 BA.debugLineNum = 153;BA.debugLine="lbl_search.TextColor=Colors.White";
Debug.ShouldStop(16777216);
_lbl_search.runMethod(true,"setTextColor",ac_tsearch.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 154;BA.debugLine="lbl_search.TextSize=12";
Debug.ShouldStop(33554432);
_lbl_search.runMethod(true,"setTextSize",BA.numberCast(float.class, 12));
 BA.debugLineNum = 155;BA.debugLine="lbl_search.Background=bg";
Debug.ShouldStop(67108864);
_lbl_search.runMethod(false,"setBackground",(_bg.getObject()));
 BA.debugLineNum = 156;BA.debugLine="lbl_search.Typeface=Typeface.LoadFromAssets(\"iran";
Debug.ShouldStop(134217728);
_lbl_search.runMethod(false,"setTypeface",ac_tsearch.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("iran_sans.ttf"))));
 BA.debugLineNum = 157;BA.debugLine="lbl_search.Text=\"جستجو\"";
Debug.ShouldStop(268435456);
_lbl_search.runMethod(true,"setText",BA.ObjectToCharSequence("جستجو"));
 BA.debugLineNum = 158;BA.debugLine="lbl_search.Gravity=Gravity.CENTER_VERTICAL+Gravit";
Debug.ShouldStop(536870912);
_lbl_search.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {ac_tsearch.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL"),ac_tsearch.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL")}, "+",1, 1));
 BA.debugLineNum = 159;BA.debugLine="pnl_search.AddView(lbl_search,pnl_search.Width-18";
Debug.ShouldStop(1073741824);
_pnl_search.runVoidMethod ("AddView",(Object)((_lbl_search.getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {_pnl_search.runMethod(true,"getWidth"),ac_tsearch.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 18)),ac_tsearch.mostCurrent.activityBA)}, "-",1, 1)),(Object)(BA.numberCast(int.class, 0)),(Object)(ac_tsearch.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),ac_tsearch.mostCurrent.activityBA)),(Object)(_pnl_search.runMethod(true,"getHeight")));
 BA.debugLineNum = 160;BA.debugLine="pnl_search.Padding = Array As Int (10dip, 10dip,";
Debug.ShouldStop(-2147483648);
_pnl_search.runMethod(false,"setPadding",RemoteObject.createNewArray("int",new int[] {4},new Object[] {ac_tsearch.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10))),ac_tsearch.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10))),ac_tsearch.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10))),ac_tsearch.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))}));
 BA.debugLineNum = 162;BA.debugLine="edit.Initialize(\"edit\")";
Debug.ShouldStop(2);
ac_tsearch.mostCurrent._edit.runVoidMethod ("Initialize",ac_tsearch.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("edit")));
 BA.debugLineNum = 163;BA.debugLine="edit.TextColor=Colors.DarkGray";
Debug.ShouldStop(4);
ac_tsearch.mostCurrent._edit.runMethod(true,"setTextColor",ac_tsearch.mostCurrent.__c.getField(false,"Colors").getField(true,"DarkGray"));
 BA.debugLineNum = 164;BA.debugLine="edit.TextSize=15";
Debug.ShouldStop(8);
ac_tsearch.mostCurrent._edit.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 165;BA.debugLine="edit.Hint=\"Channel Username\"";
Debug.ShouldStop(16);
ac_tsearch.mostCurrent._edit.runMethod(true,"setHint",BA.ObjectToString("Channel Username"));
 BA.debugLineNum = 166;BA.debugLine="edit.HintColor=Colors.LightGray";
Debug.ShouldStop(32);
ac_tsearch.mostCurrent._edit.runMethod(true,"setHintColor",ac_tsearch.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray"));
 BA.debugLineNum = 167;BA.debugLine="edit.Gravity=Gravity.CENTER_VERTICAL+Gravity.LEFT";
Debug.ShouldStop(64);
ac_tsearch.mostCurrent._edit.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {ac_tsearch.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL"),ac_tsearch.mostCurrent.__c.getField(false,"Gravity").getField(true,"LEFT")}, "+",1, 1));
 BA.debugLineNum = 168;BA.debugLine="pnl_search.AddView(edit,0,0,pnl_search.Width-19%x";
Debug.ShouldStop(128);
_pnl_search.runVoidMethod ("AddView",(Object)((ac_tsearch.mostCurrent._edit.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {_pnl_search.runMethod(true,"getWidth"),ac_tsearch.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 19)),ac_tsearch.mostCurrent.activityBA)}, "-",1, 1)),(Object)(_pnl_search.runMethod(true,"getHeight")));
 BA.debugLineNum = 170;BA.debugLine="cardchannel.Initialize(\"cardchannel\")";
Debug.ShouldStop(512);
ac_tsearch.mostCurrent._cardchannel.runVoidMethod ("Initialize",ac_tsearch.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("cardchannel")));
 BA.debugLineNum = 171;BA.debugLine="cardchannel.Color=Colors.White";
Debug.ShouldStop(1024);
ac_tsearch.mostCurrent._cardchannel.runVoidMethod ("setColor",ac_tsearch.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 172;BA.debugLine="cardchannel.Visible=False";
Debug.ShouldStop(2048);
ac_tsearch.mostCurrent._cardchannel.runMethod(true,"setVisible",ac_tsearch.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 173;BA.debugLine="pnl_lv.AddView(cardchannel,5%x,card.Top+card.Heig";
Debug.ShouldStop(4096);
ac_tsearch.mostCurrent._pnl_lv.runVoidMethod ("AddView",(Object)((ac_tsearch.mostCurrent._cardchannel.getObject())),(Object)(ac_tsearch.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),ac_tsearch.mostCurrent.activityBA)),(Object)(RemoteObject.solve(new RemoteObject[] {_card.runMethod(true,"getTop"),_card.runMethod(true,"getHeight"),ac_tsearch.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),ac_tsearch.mostCurrent.activityBA)}, "++",2, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {ac_tsearch.mostCurrent._pnl_lv.runMethod(true,"getWidth"),ac_tsearch.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),ac_tsearch.mostCurrent.activityBA)}, "-",1, 1)),(Object)(ac_tsearch.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 15)),ac_tsearch.mostCurrent.activityBA)));
 BA.debugLineNum = 175;BA.debugLine="req_getme(userid_t)";
Debug.ShouldStop(16384);
_req_getme(ac_tsearch._userid_t);
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
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (ac_tsearch) ","ac_tsearch",12,ac_tsearch.mostCurrent.activityBA,ac_tsearch.mostCurrent,183);
if (RapidSub.canDelegate("activity_pause")) { return com.it.fome.ac_tsearch.remoteMe.runUserSub(false, "ac_tsearch","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 183;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 185;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("Activity_Resume (ac_tsearch) ","ac_tsearch",12,ac_tsearch.mostCurrent.activityBA,ac_tsearch.mostCurrent,179);
if (RapidSub.canDelegate("activity_resume")) { return com.it.fome.ac_tsearch.remoteMe.runUserSub(false, "ac_tsearch","activity_resume");}
 BA.debugLineNum = 179;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(262144);
 BA.debugLineNum = 181;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _channell_oncreateviewholder(RemoteObject _parent) throws Exception{
try {
		Debug.PushSubsStack("channell_onCreateViewHolder (ac_tsearch) ","ac_tsearch",12,ac_tsearch.mostCurrent.activityBA,ac_tsearch.mostCurrent,269);
if (RapidSub.canDelegate("channell_oncreateviewholder")) { return com.it.fome.ac_tsearch.remoteMe.runUserSub(false, "ac_tsearch","channell_oncreateviewholder", _parent);}
RemoteObject _item = RemoteObject.declareNull("com.it.fome.ac_lchats._adap_chats");
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
 BA.debugLineNum = 269;BA.debugLine="Sub channell_onCreateViewHolder (Parent As Panel)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 270;BA.debugLine="Dim Item = listchats.Get(0) As Adap_chats";
Debug.ShouldStop(8192);
_item = (ac_tsearch.mostCurrent._listchats.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("Item", _item);Debug.locals.put("Item", _item);
 BA.debugLineNum = 273;BA.debugLine="Parent.Color=Colors.White";
Debug.ShouldStop(65536);
_parent.runVoidMethod ("setColor",ac_tsearch.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 274;BA.debugLine="Parent.Height=15%y";
Debug.ShouldStop(131072);
_parent.runMethod(true,"setHeight",ac_tsearch.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 15)),ac_tsearch.mostCurrent.activityBA));
 BA.debugLineNum = 276;BA.debugLine="Dim pnl_main As Panel";
Debug.ShouldStop(524288);
_pnl_main = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("pnl_main", _pnl_main);
 BA.debugLineNum = 277;BA.debugLine="pnl_main.Initialize(\"\")";
Debug.ShouldStop(1048576);
_pnl_main.runVoidMethod ("Initialize",ac_tsearch.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 278;BA.debugLine="pnl_main.Color=Colors.White";
Debug.ShouldStop(2097152);
_pnl_main.runVoidMethod ("setColor",ac_tsearch.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 279;BA.debugLine="Parent.AddView(pnl_main,2%x,2%x,Parent.Width-4%x,";
Debug.ShouldStop(4194304);
_parent.runVoidMethod ("AddView",(Object)((_pnl_main.getObject())),(Object)(ac_tsearch.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),ac_tsearch.mostCurrent.activityBA)),(Object)(ac_tsearch.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),ac_tsearch.mostCurrent.activityBA)),(Object)(RemoteObject.solve(new RemoteObject[] {_parent.runMethod(true,"getWidth"),ac_tsearch.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 4)),ac_tsearch.mostCurrent.activityBA)}, "-",1, 1)),(Object)(ac_tsearch.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 15)),ac_tsearch.mostCurrent.activityBA)));
 BA.debugLineNum = 281;BA.debugLine="Dim lbl As Label: lbl.Initialize(\"lbl\")";
Debug.ShouldStop(16777216);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 281;BA.debugLine="Dim lbl As Label: lbl.Initialize(\"lbl\")";
Debug.ShouldStop(16777216);
_lbl.runVoidMethod ("Initialize",ac_tsearch.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("lbl")));
 BA.debugLineNum = 282;BA.debugLine="lbl.TextColor = Colors.Black : lbl.TextSize = 18";
Debug.ShouldStop(33554432);
_lbl.runMethod(true,"setTextColor",ac_tsearch.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 282;BA.debugLine="lbl.TextColor = Colors.Black : lbl.TextSize = 18";
Debug.ShouldStop(33554432);
_lbl.runMethod(true,"setTextSize",BA.numberCast(float.class, 18));
 BA.debugLineNum = 283;BA.debugLine="lbl.Gravity=Gravity.RIGHT+Gravity.CENTER_VERTICAL";
Debug.ShouldStop(67108864);
_lbl.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {ac_tsearch.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT"),ac_tsearch.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")}, "+",1, 1));
 BA.debugLineNum = 284;BA.debugLine="lbl.TextSize=14";
Debug.ShouldStop(134217728);
_lbl.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 286;BA.debugLine="pnl_main.AddView(lbl,2%x,5dip,pnl_main.Width-17%x";
Debug.ShouldStop(536870912);
_pnl_main.runVoidMethod ("AddView",(Object)((_lbl.getObject())),(Object)(ac_tsearch.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),ac_tsearch.mostCurrent.activityBA)),(Object)(ac_tsearch.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))),(Object)(RemoteObject.solve(new RemoteObject[] {_pnl_main.runMethod(true,"getWidth"),ac_tsearch.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 17)),ac_tsearch.mostCurrent.activityBA)}, "-",1, 1)),(Object)(ac_tsearch.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),ac_tsearch.mostCurrent.activityBA)));
 BA.debugLineNum = 288;BA.debugLine="Dim lbl_iconchat As Label: lbl_iconchat.Initializ";
Debug.ShouldStop(-2147483648);
_lbl_iconchat = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl_iconchat", _lbl_iconchat);
 BA.debugLineNum = 288;BA.debugLine="Dim lbl_iconchat As Label: lbl_iconchat.Initializ";
Debug.ShouldStop(-2147483648);
_lbl_iconchat.runVoidMethod ("Initialize",ac_tsearch.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("lbl_iconchat")));
 BA.debugLineNum = 289;BA.debugLine="lbl_iconchat.TextColor = Colors.Black : lbl_iconc";
Debug.ShouldStop(1);
_lbl_iconchat.runMethod(true,"setTextColor",ac_tsearch.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 289;BA.debugLine="lbl_iconchat.TextColor = Colors.Black : lbl_iconc";
Debug.ShouldStop(1);
_lbl_iconchat.runMethod(true,"setTextSize",BA.numberCast(float.class, 30));
 BA.debugLineNum = 290;BA.debugLine="pnl_main.AddView(lbl_iconchat,5%x,5%x,10%x,10%x)";
Debug.ShouldStop(2);
_pnl_main.runVoidMethod ("AddView",(Object)((_lbl_iconchat.getObject())),(Object)(ac_tsearch.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),ac_tsearch.mostCurrent.activityBA)),(Object)(ac_tsearch.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),ac_tsearch.mostCurrent.activityBA)),(Object)(ac_tsearch.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),ac_tsearch.mostCurrent.activityBA)),(Object)(ac_tsearch.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),ac_tsearch.mostCurrent.activityBA)));
 BA.debugLineNum = 293;BA.debugLine="lbl_iconchat.Typeface=Typeface.FONTAWESOME";
Debug.ShouldStop(16);
_lbl_iconchat.runMethod(false,"setTypeface",ac_tsearch.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"getFONTAWESOME"));
 BA.debugLineNum = 294;BA.debugLine="lbl_iconchat.Text=Chr(0xF0A1)";
Debug.ShouldStop(32);
_lbl_iconchat.runMethod(true,"setText",BA.ObjectToCharSequence(ac_tsearch.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xf0a1)))));
 BA.debugLineNum = 296;BA.debugLine="Dim img_prof As ImageView";
Debug.ShouldStop(128);
_img_prof = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");Debug.locals.put("img_prof", _img_prof);
 BA.debugLineNum = 297;BA.debugLine="img_prof.Initialize(\"img_prof\")";
Debug.ShouldStop(256);
_img_prof.runVoidMethod ("Initialize",ac_tsearch.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("img_prof")));
 BA.debugLineNum = 299;BA.debugLine="img_prof.Gravity=Gravity.FILL";
Debug.ShouldStop(1024);
_img_prof.runMethod(true,"setGravity",ac_tsearch.mostCurrent.__c.getField(false,"Gravity").getField(true,"FILL"));
 BA.debugLineNum = 300;BA.debugLine="pnl_main.AddView(img_prof,pnl_main.Width-13%x,5di";
Debug.ShouldStop(2048);
_pnl_main.runVoidMethod ("AddView",(Object)((_img_prof.getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {_pnl_main.runMethod(true,"getWidth"),ac_tsearch.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 13)),ac_tsearch.mostCurrent.activityBA)}, "-",1, 1)),(Object)(ac_tsearch.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))),(Object)(ac_tsearch.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 12)),ac_tsearch.mostCurrent.activityBA)),(Object)(ac_tsearch.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 12)),ac_tsearch.mostCurrent.activityBA)));
 BA.debugLineNum = 302;BA.debugLine="Dim divi As Panel: divi.Initialize(\"divi\")";
Debug.ShouldStop(8192);
_divi = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("divi", _divi);
 BA.debugLineNum = 302;BA.debugLine="Dim divi As Panel: divi.Initialize(\"divi\")";
Debug.ShouldStop(8192);
_divi.runVoidMethod ("Initialize",ac_tsearch.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("divi")));
 BA.debugLineNum = 303;BA.debugLine="divi.Color=0xFFE1E5E6";
Debug.ShouldStop(16384);
_divi.runVoidMethod ("setColor",BA.numberCast(int.class, 0xffe1e5e6));
 BA.debugLineNum = 304;BA.debugLine="pnl_main.AddView(divi,0,15%y,100%x-78dip,1dip)";
Debug.ShouldStop(32768);
_pnl_main.runVoidMethod ("AddView",(Object)((_divi.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(ac_tsearch.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 15)),ac_tsearch.mostCurrent.activityBA)),(Object)(RemoteObject.solve(new RemoteObject[] {ac_tsearch.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),ac_tsearch.mostCurrent.activityBA),ac_tsearch.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 78)))}, "-",1, 1)),(Object)(ac_tsearch.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))));
 BA.debugLineNum = 306;BA.debugLine="Dim lbl_topmsg As Label: lbl_topmsg.Initialize(\"l";
Debug.ShouldStop(131072);
_lbl_topmsg = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl_topmsg", _lbl_topmsg);
 BA.debugLineNum = 306;BA.debugLine="Dim lbl_topmsg As Label: lbl_topmsg.Initialize(\"l";
Debug.ShouldStop(131072);
_lbl_topmsg.runVoidMethod ("Initialize",ac_tsearch.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("lbl_topmsg")));
 BA.debugLineNum = 307;BA.debugLine="lbl_topmsg.TextColor = 0xFFABACAE : lbl_topmsg.Te";
Debug.ShouldStop(262144);
_lbl_topmsg.runMethod(true,"setTextColor",BA.numberCast(int.class, 0xffabacae));
 BA.debugLineNum = 307;BA.debugLine="lbl_topmsg.TextColor = 0xFFABACAE : lbl_topmsg.Te";
Debug.ShouldStop(262144);
_lbl_topmsg.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 308;BA.debugLine="lbl_topmsg.Gravity=Gravity.RIGHT";
Debug.ShouldStop(524288);
_lbl_topmsg.runMethod(true,"setGravity",ac_tsearch.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT"));
 BA.debugLineNum = 309;BA.debugLine="lbl_topmsg.Visible=False";
Debug.ShouldStop(1048576);
_lbl_topmsg.runMethod(true,"setVisible",ac_tsearch.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 310;BA.debugLine="pnl_main.AddView(lbl_topmsg,30dip,40dip,100%x-110";
Debug.ShouldStop(2097152);
_pnl_main.runVoidMethod ("AddView",(Object)((_lbl_topmsg.getObject())),(Object)(ac_tsearch.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30)))),(Object)(ac_tsearch.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))),(Object)(RemoteObject.solve(new RemoteObject[] {ac_tsearch.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),ac_tsearch.mostCurrent.activityBA),ac_tsearch.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 110)))}, "-",1, 1)),(Object)(ac_tsearch.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))));
 BA.debugLineNum = 312;BA.debugLine="Dim lbl_time As Label: lbl_time.Initialize(\"lbl_t";
Debug.ShouldStop(8388608);
_lbl_time = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl_time", _lbl_time);
 BA.debugLineNum = 312;BA.debugLine="Dim lbl_time As Label: lbl_time.Initialize(\"lbl_t";
Debug.ShouldStop(8388608);
_lbl_time.runVoidMethod ("Initialize",ac_tsearch.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("lbl_time")));
 BA.debugLineNum = 313;BA.debugLine="lbl_time.TextColor = 0xFFABACAE : lbl_time.TextSi";
Debug.ShouldStop(16777216);
_lbl_time.runMethod(true,"setTextColor",BA.numberCast(int.class, 0xffabacae));
 BA.debugLineNum = 313;BA.debugLine="lbl_time.TextColor = 0xFFABACAE : lbl_time.TextSi";
Debug.ShouldStop(16777216);
_lbl_time.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 315;BA.debugLine="lbl_time.Visible=False";
Debug.ShouldStop(67108864);
_lbl_time.runMethod(true,"setVisible",ac_tsearch.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 316;BA.debugLine="pnl_main.AddView(lbl_time,5dip,10dip,100dip,20dip";
Debug.ShouldStop(134217728);
_pnl_main.runVoidMethod ("AddView",(Object)((_lbl_time.getObject())),(Object)(ac_tsearch.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))),(Object)(ac_tsearch.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))),(Object)(ac_tsearch.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100)))),(Object)(ac_tsearch.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))));
 BA.debugLineNum = 318;BA.debugLine="Dim lbl_unread As Label: lbl_unread.Initialize(\"l";
Debug.ShouldStop(536870912);
_lbl_unread = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl_unread", _lbl_unread);
 BA.debugLineNum = 318;BA.debugLine="Dim lbl_unread As Label: lbl_unread.Initialize(\"l";
Debug.ShouldStop(536870912);
_lbl_unread.runVoidMethod ("Initialize",ac_tsearch.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("lbl_unread")));
 BA.debugLineNum = 319;BA.debugLine="lbl_unread.TextColor = 0xFFFFFFFF : lbl_unread.Te";
Debug.ShouldStop(1073741824);
_lbl_unread.runMethod(true,"setTextColor",BA.numberCast(int.class, 0xffffffff));
 BA.debugLineNum = 319;BA.debugLine="lbl_unread.TextColor = 0xFFFFFFFF : lbl_unread.Te";
Debug.ShouldStop(1073741824);
_lbl_unread.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 320;BA.debugLine="Dim red As ColorDrawable";
Debug.ShouldStop(-2147483648);
_red = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("red", _red);
 BA.debugLineNum = 321;BA.debugLine="red.Initialize(0xFF1EF47C,60)";
Debug.ShouldStop(1);
_red.runVoidMethod ("Initialize",(Object)(BA.numberCast(int.class, 0xff1ef47c)),(Object)(BA.numberCast(int.class, 60)));
 BA.debugLineNum = 322;BA.debugLine="lbl_unread.Background=red";
Debug.ShouldStop(2);
_lbl_unread.runMethod(false,"setBackground",(_red.getObject()));
 BA.debugLineNum = 323;BA.debugLine="lbl_unread.Gravity=Gravity.CENTER";
Debug.ShouldStop(4);
_lbl_unread.runMethod(true,"setGravity",ac_tsearch.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 324;BA.debugLine="lbl_unread.Visible=False";
Debug.ShouldStop(8);
_lbl_unread.runMethod(true,"setVisible",ac_tsearch.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 325;BA.debugLine="pnl_main.AddView(lbl_unread,10dip,40dip,20dip,20d";
Debug.ShouldStop(16);
_pnl_main.runVoidMethod ("AddView",(Object)((_lbl_unread.getObject())),(Object)(ac_tsearch.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))),(Object)(ac_tsearch.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))),(Object)(ac_tsearch.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))),(Object)(ac_tsearch.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))));
 BA.debugLineNum = 327;BA.debugLine="Dim bg As ColorDrawable";
Debug.ShouldStop(64);
_bg = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("bg", _bg);
 BA.debugLineNum = 328;BA.debugLine="bg.Initialize2(0xFFE3192E,5dip,2dip,0xFFEC5765)";
Debug.ShouldStop(128);
_bg.runVoidMethod ("Initialize2",(Object)(BA.numberCast(int.class, 0xffe3192e)),(Object)(ac_tsearch.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))),(Object)(ac_tsearch.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))),(Object)(BA.numberCast(int.class, 0xffec5765)));
 BA.debugLineNum = 329;BA.debugLine="Dim lbl_sef As Label: lbl_sef.Initialize(\"lbl_sef";
Debug.ShouldStop(256);
_lbl_sef = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl_sef", _lbl_sef);
 BA.debugLineNum = 329;BA.debugLine="Dim lbl_sef As Label: lbl_sef.Initialize(\"lbl_sef";
Debug.ShouldStop(256);
_lbl_sef.runVoidMethod ("Initialize",ac_tsearch.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("lbl_sef")));
 BA.debugLineNum = 330;BA.debugLine="lbl_sef.TextColor = Colors.White : lbl_sef.TextSi";
Debug.ShouldStop(512);
_lbl_sef.runMethod(true,"setTextColor",ac_tsearch.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 330;BA.debugLine="lbl_sef.TextColor = Colors.White : lbl_sef.TextSi";
Debug.ShouldStop(512);
_lbl_sef.runMethod(true,"setTextSize",BA.numberCast(float.class, 18));
 BA.debugLineNum = 331;BA.debugLine="lbl_sef.Gravity=Gravity.CENTER_HORIZONTAL+Gravity";
Debug.ShouldStop(1024);
_lbl_sef.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {ac_tsearch.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL"),ac_tsearch.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")}, "+",1, 1));
 BA.debugLineNum = 332;BA.debugLine="lbl_sef.TextSize=17";
Debug.ShouldStop(2048);
_lbl_sef.runMethod(true,"setTextSize",BA.numberCast(float.class, 17));
 BA.debugLineNum = 333;BA.debugLine="lbl_sef.Text=\"سفارش\"";
Debug.ShouldStop(4096);
_lbl_sef.runMethod(true,"setText",BA.ObjectToCharSequence("سفارش"));
 BA.debugLineNum = 334;BA.debugLine="lbl_sef.Background=bg";
Debug.ShouldStop(8192);
_lbl_sef.runMethod(false,"setBackground",(_bg.getObject()));
 BA.debugLineNum = 336;BA.debugLine="pnl_main.AddView(lbl_sef,pnl_main.Width/2-5%x,img";
Debug.ShouldStop(32768);
_pnl_main.runVoidMethod ("AddView",(Object)((_lbl_sef.getObject())),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_pnl_main.runMethod(true,"getWidth"),RemoteObject.createImmutable(2),ac_tsearch.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),ac_tsearch.mostCurrent.activityBA)}, "/-",1, 0))),(Object)(RemoteObject.solve(new RemoteObject[] {_img_prof.runMethod(true,"getTop"),_img_prof.runMethod(true,"getHeight"),ac_tsearch.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 1)),ac_tsearch.mostCurrent.activityBA)}, "++",2, 1)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_pnl_main.runMethod(true,"getWidth"),RemoteObject.createImmutable(2),ac_tsearch.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),ac_tsearch.mostCurrent.activityBA)}, "/-",1, 0))),(Object)(ac_tsearch.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 8)),ac_tsearch.mostCurrent.activityBA)));
 BA.debugLineNum = 338;BA.debugLine="lbl_sef.Tag=0";
Debug.ShouldStop(131072);
_lbl_sef.runMethod(false,"setTag",RemoteObject.createImmutable((0)));
 BA.debugLineNum = 340;BA.debugLine="lbl.Text = Item.title";
Debug.ShouldStop(524288);
_lbl.runMethod(true,"setText",BA.ObjectToCharSequence(_item.getField(true,"title" /*RemoteObject*/ )));
 BA.debugLineNum = 341;BA.debugLine="If Item.img_isdwonload=\"true\" Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_item.getField(true,"img_isdwonload" /*RemoteObject*/ ),BA.ObjectToString("true"))) { 
 BA.debugLineNum = 344;BA.debugLine="glide.Load(\"\",Item.img_my).OptionalCircleCrop.In";
Debug.ShouldStop(8388608);
ac_tsearch.mostCurrent._glide.runMethod(false,"Load",ac_tsearch.mostCurrent.activityBA,(Object)(BA.ObjectToString("")),(Object)(_item.getField(true,"img_my" /*RemoteObject*/ ))).runMethod(false,"OptionalCircleCrop").runVoidMethod ("Into",(Object)(_img_prof));
 }else {
 BA.debugLineNum = 346;BA.debugLine="glide.Load(File.DirAssets,\"lazyloader.gif\").FitC";
Debug.ShouldStop(33554432);
ac_tsearch.mostCurrent._glide.runMethod(false,"Load",ac_tsearch.mostCurrent.activityBA,(Object)(ac_tsearch.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("lazyloader.gif"))).runMethod(false,"FitCenter").runVoidMethod ("Into",(Object)(_img_prof));
 BA.debugLineNum = 348;BA.debugLine="If Item.img_id=\"null\" Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",_item.getField(true,"img_id" /*RemoteObject*/ ),BA.ObjectToString("null"))) { 
 }else {
 BA.debugLineNum = 350;BA.debugLine="telegs.downloadFile(Item.img_id)";
Debug.ShouldStop(536870912);
ac_tsearch._telegs.runVoidMethod ("downloadFile",(Object)(BA.numberCast(int.class, _item.getField(true,"img_id" /*RemoteObject*/ ))));
 };
 };
 BA.debugLineNum = 356;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
		Debug.PushSubsStack("Dialog_ItemSelected (ac_tsearch) ","ac_tsearch",12,ac_tsearch.mostCurrent.activityBA,ac_tsearch.mostCurrent,471);
if (RapidSub.canDelegate("dialog_itemselected")) { return com.it.fome.ac_tsearch.remoteMe.runUserSub(false, "ac_tsearch","dialog_itemselected", _dialog, _position, _text);}
Debug.locals.put("Dialog", _dialog);
Debug.locals.put("Position", _position);
Debug.locals.put("Text", _text);
 BA.debugLineNum = 471;BA.debugLine="Sub Dialog_ItemSelected (Dialog As MaterialDialog,";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 474;BA.debugLine="Select Position";
Debug.ShouldStop(33554432);
switch (BA.switchObjectToInt(_position,BA.numberCast(int.class, 0),BA.numberCast(int.class, 1))) {
case 0: {
 BA.debugLineNum = 477;BA.debugLine="show_pnldialogs(True,0)";
Debug.ShouldStop(268435456);
_show_pnldialogs(ac_tsearch.mostCurrent.__c.getField(true,"True"),BA.numberCast(int.class, 0));
 break; }
case 1: {
 BA.debugLineNum = 479;BA.debugLine="show_pnldialogs(True,3)";
Debug.ShouldStop(1073741824);
_show_pnldialogs(ac_tsearch.mostCurrent.__c.getField(true,"True"),BA.numberCast(int.class, 3));
 break; }
}
;
 BA.debugLineNum = 483;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 19;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 20;BA.debugLine="Dim meno As Label";
ac_tsearch.mostCurrent._meno = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Dim pnl_coins As Panel";
ac_tsearch.mostCurrent._pnl_coins = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Dim lbl_icon ,lbl_nums As Label";
ac_tsearch.mostCurrent._lbl_icon = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
ac_tsearch.mostCurrent._lbl_nums = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Dim roundview As MC7RoundView";
ac_tsearch.mostCurrent._roundview = RemoteObject.createNew ("com.flycoroundview.mc7.MC7RoundView");
 //BA.debugLineNum = 24;BA.debugLine="Dim LV As Hitex_LayoutView";
ac_tsearch.mostCurrent._lv = RemoteObject.createNew ("wir.hitex.recycler.Hitex_LayoutView");
 //BA.debugLineNum = 25;BA.debugLine="Dim glide As Hitex_Glide";
ac_tsearch.mostCurrent._glide = RemoteObject.createNew ("com.hitex_glide.Hitex_Glide");
 //BA.debugLineNum = 27;BA.debugLine="Dim pnl_lv As Panel";
ac_tsearch.mostCurrent._pnl_lv = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Dim cardchannel As CardView";
ac_tsearch.mostCurrent._cardchannel = RemoteObject.createNew ("de.amberhome.objects.CardViewWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Dim listchats As List";
ac_tsearch.mostCurrent._listchats = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 30;BA.debugLine="Dim edit As EditText";
ac_tsearch.mostCurrent._edit = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Dim id_user As String";
ac_tsearch.mostCurrent._id_user = RemoteObject.createImmutable("");
 //BA.debugLineNum = 32;BA.debugLine="Dim pnl_dilogs As Panel";
ac_tsearch.mostCurrent._pnl_dilogs = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Dim username_target,title_target As String";
ac_tsearch.mostCurrent._username_target = RemoteObject.createImmutable("");
ac_tsearch.mostCurrent._title_target = RemoteObject.createImmutable("");
 //BA.debugLineNum = 34;BA.debugLine="Dim id_target As String";
ac_tsearch.mostCurrent._id_target = RemoteObject.createImmutable("");
 //BA.debugLineNum = 35;BA.debugLine="Dim img_target,idchannel_target As String";
ac_tsearch.mostCurrent._img_target = RemoteObject.createImmutable("");
ac_tsearch.mostCurrent._idchannel_target = RemoteObject.createImmutable("");
 //BA.debugLineNum = 36;BA.debugLine="Dim mimeno As mi_meno";
ac_tsearch.mostCurrent._mimeno = RemoteObject.createNew ("com.it.fome.mi_meno");
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _lbl_search_click() throws Exception{
try {
		Debug.PushSubsStack("lbl_search_Click (ac_tsearch) ","ac_tsearch",12,ac_tsearch.mostCurrent.activityBA,ac_tsearch.mostCurrent,196);
if (RapidSub.canDelegate("lbl_search_click")) { return com.it.fome.ac_tsearch.remoteMe.runUserSub(false, "ac_tsearch","lbl_search_click");}
 BA.debugLineNum = 196;BA.debugLine="Sub lbl_search_Click";
Debug.ShouldStop(8);
 BA.debugLineNum = 199;BA.debugLine="telegs.searchPublicChat(edit.Text)";
Debug.ShouldStop(64);
ac_tsearch._telegs.runVoidMethod ("searchPublicChat",(Object)(ac_tsearch.mostCurrent._edit.runMethod(true,"getText")));
 BA.debugLineNum = 200;BA.debugLine="ProgressDialogShow(\"درحال جستوجو...\")";
Debug.ShouldStop(128);
ac_tsearch.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",ac_tsearch.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("درحال جستوجو..."))));
 BA.debugLineNum = 201;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("lbl_sef_Click (ac_tsearch) ","ac_tsearch",12,ac_tsearch.mostCurrent.activityBA,ac_tsearch.mostCurrent,447);
if (RapidSub.canDelegate("lbl_sef_click")) { return com.it.fome.ac_tsearch.remoteMe.runUserSub(false, "ac_tsearch","lbl_sef_click");}
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _item = RemoteObject.declareNull("com.it.fome.ac_lchats._adap_chats");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _id_channelinfo = RemoteObject.createImmutable(0);
RemoteObject _issupergroup = RemoteObject.createImmutable("");
 BA.debugLineNum = 447;BA.debugLine="Sub lbl_sef_Click";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 448;BA.debugLine="Dim lbl As Label";
Debug.ShouldStop(-2147483648);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 449;BA.debugLine="lbl=Sender";
Debug.ShouldStop(1);
_lbl.setObject(ac_tsearch.mostCurrent.__c.runMethod(false,"Sender",ac_tsearch.mostCurrent.activityBA));
 BA.debugLineNum = 450;BA.debugLine="Dim Item = listchats.Get(lbl.Tag) As Adap_chats";
Debug.ShouldStop(2);
_item = (ac_tsearch.mostCurrent._listchats.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _lbl.runMethod(false,"getTag")))));Debug.locals.put("Item", _item);Debug.locals.put("Item", _item);
 BA.debugLineNum = 451;BA.debugLine="Log(Item.title)";
Debug.ShouldStop(4);
ac_tsearch.mostCurrent.__c.runVoidMethod ("LogImpl","615204356",_item.getField(true,"title" /*RemoteObject*/ ),0);
 BA.debugLineNum = 452;BA.debugLine="chatid=Item.chat_id";
Debug.ShouldStop(8);
ac_tsearch._chatid = BA.NumberToString(_item.getField(true,"chat_id" /*RemoteObject*/ ));
 BA.debugLineNum = 453;BA.debugLine="title_target=Item.title";
Debug.ShouldStop(16);
ac_tsearch.mostCurrent._title_target = _item.getField(true,"title" /*RemoteObject*/ );
 BA.debugLineNum = 454;BA.debugLine="If Item.img_id=\"null\" Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",_item.getField(true,"img_id" /*RemoteObject*/ ),BA.ObjectToString("null"))) { 
 BA.debugLineNum = 455;BA.debugLine="img_target=\"none\"";
Debug.ShouldStop(64);
ac_tsearch.mostCurrent._img_target = BA.ObjectToString("none");
 }else {
 BA.debugLineNum = 457;BA.debugLine="img_target=Item.img_my";
Debug.ShouldStop(256);
ac_tsearch.mostCurrent._img_target = _item.getField(true,"img_my" /*RemoteObject*/ );
 };
 BA.debugLineNum = 459;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(1024);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 460;BA.debugLine="parser.Initialize(Item.channel_info)";
Debug.ShouldStop(2048);
_parser.runVoidMethod ("Initialize",(Object)(_item.getField(true,"channel_info" /*RemoteObject*/ )));
 BA.debugLineNum = 461;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(4096);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 462;BA.debugLine="Dim id_channelinfo As Int = root.Get(\"supergroupI";
Debug.ShouldStop(8192);
_id_channelinfo = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("supergroupId")))));Debug.locals.put("id_channelinfo", _id_channelinfo);Debug.locals.put("id_channelinfo", _id_channelinfo);
 BA.debugLineNum = 463;BA.debugLine="Dim isSupergroup As String = root.Get(\"isChannel\"";
Debug.ShouldStop(16384);
_issupergroup = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("isChannel")))));Debug.locals.put("isSupergroup", _issupergroup);Debug.locals.put("isSupergroup", _issupergroup);
 BA.debugLineNum = 464;BA.debugLine="idchannel_target=id_channelinfo";
Debug.ShouldStop(32768);
ac_tsearch.mostCurrent._idchannel_target = BA.NumberToString(_id_channelinfo);
 BA.debugLineNum = 466;BA.debugLine="telegs.Getchanneluser(id_channelinfo)";
Debug.ShouldStop(131072);
ac_tsearch._telegs.runVoidMethod ("Getchanneluser",(Object)(_id_channelinfo));
 BA.debugLineNum = 469;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("lbl_x_Click (ac_tsearch) ","ac_tsearch",12,ac_tsearch.mostCurrent.activityBA,ac_tsearch.mostCurrent,624);
if (RapidSub.canDelegate("lbl_x_click")) { return com.it.fome.ac_tsearch.remoteMe.runUserSub(false, "ac_tsearch","lbl_x_click");}
 BA.debugLineNum = 624;BA.debugLine="Sub lbl_x_Click";
Debug.ShouldStop(32768);
 BA.debugLineNum = 625;BA.debugLine="show_pnldialogs(False,0)";
Debug.ShouldStop(65536);
_show_pnldialogs(ac_tsearch.mostCurrent.__c.getField(true,"False"),BA.numberCast(int.class, 0));
 BA.debugLineNum = 627;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
		Debug.PushSubsStack("meno_Click (ac_tsearch) ","ac_tsearch",12,ac_tsearch.mostCurrent.activityBA,ac_tsearch.mostCurrent,187);
if (RapidSub.canDelegate("meno_click")) { return com.it.fome.ac_tsearch.remoteMe.runUserSub(false, "ac_tsearch","meno_click");}
 BA.debugLineNum = 187;BA.debugLine="Sub meno_Click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 190;BA.debugLine="mimeno.Initialize(\"mimeno\",Me)";
Debug.ShouldStop(536870912);
ac_tsearch.mostCurrent._mimeno.runClassMethod (com.it.fome.mi_meno.class, "_initialize" /*RemoteObject*/ ,ac_tsearch.mostCurrent.activityBA,(Object)(BA.ObjectToString("mimeno")),(Object)(ac_tsearch.getObject()));
 BA.debugLineNum = 191;BA.debugLine="mimeno.addpnl";
Debug.ShouldStop(1073741824);
ac_tsearch.mostCurrent._mimeno.runClassMethod (com.it.fome.mi_meno.class, "_addpnl" /*RemoteObject*/ );
 BA.debugLineNum = 192;BA.debugLine="mimeno.open";
Debug.ShouldStop(-2147483648);
ac_tsearch.mostCurrent._mimeno.runClassMethod (com.it.fome.mi_meno.class, "_open" /*RemoteObject*/ );
 BA.debugLineNum = 194;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("mt_sef_newcoins (ac_tsearch) ","ac_tsearch",12,ac_tsearch.mostCurrent.activityBA,ac_tsearch.mostCurrent,658);
if (RapidSub.canDelegate("mt_sef_newcoins")) { return com.it.fome.ac_tsearch.remoteMe.runUserSub(false, "ac_tsearch","mt_sef_newcoins", _news);}
RemoteObject _n_coins = RemoteObject.createImmutable(0L);
Debug.locals.put("news", _news);
 BA.debugLineNum = 658;BA.debugLine="Sub mt_sef_newcoins(news As String)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 659;BA.debugLine="Dim n_coins=news As Long";
Debug.ShouldStop(262144);
_n_coins = BA.numberCast(long.class, _news);Debug.locals.put("n_coins", _n_coins);Debug.locals.put("n_coins", _n_coins);
 BA.debugLineNum = 660;BA.debugLine="If n_coins>100 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean(">",_n_coins,BA.numberCast(double.class, 100))) { 
 BA.debugLineNum = 661;BA.debugLine="lbl_nums.Text=\"سکه \"&NumberFormat(news,3,0)";
Debug.ShouldStop(1048576);
ac_tsearch.mostCurrent._lbl_nums.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("سکه "),ac_tsearch.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _news)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 0))))));
 }else {
 BA.debugLineNum = 663;BA.debugLine="lbl_nums.Text=\"سکه \"&news";
Debug.ShouldStop(4194304);
ac_tsearch.mostCurrent._lbl_nums.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("سکه "),_news)));
 };
 BA.debugLineNum = 665;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("pnl_dilogs_Touch (ac_tsearch) ","ac_tsearch",12,ac_tsearch.mostCurrent.activityBA,ac_tsearch.mostCurrent,620);
if (RapidSub.canDelegate("pnl_dilogs_touch")) { return com.it.fome.ac_tsearch.remoteMe.runUserSub(false, "ac_tsearch","pnl_dilogs_touch", _action, _x, _y);}
Debug.locals.put("Action", _action);
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
 BA.debugLineNum = 620;BA.debugLine="Sub pnl_dilogs_Touch (Action As Int, X As Float, Y";
Debug.ShouldStop(2048);
 BA.debugLineNum = 621;BA.debugLine="show_pnldialogs(False,0)";
Debug.ShouldStop(4096);
_show_pnldialogs(ac_tsearch.mostCurrent.__c.getField(true,"False"),BA.numberCast(int.class, 0));
 BA.debugLineNum = 622;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("prfn_onPostStringErrorListener (ac_tsearch) ","ac_tsearch",12,ac_tsearch.mostCurrent.activityBA,ac_tsearch.mostCurrent,520);
if (RapidSub.canDelegate("prfn_onpoststringerrorlistener")) { return com.it.fome.ac_tsearch.remoteMe.runUserSub(false, "ac_tsearch","prfn_onpoststringerrorlistener", _error, _tag);}
Debug.locals.put("Error", _error);
Debug.locals.put("Tag", _tag);
 BA.debugLineNum = 520;BA.debugLine="Sub prfn_onPostStringErrorListener(Error As Respon";
Debug.ShouldStop(128);
 BA.debugLineNum = 522;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(512);
ac_tsearch.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 523;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("prfn_onPostStringOkListener (ac_tsearch) ","ac_tsearch",12,ac_tsearch.mostCurrent.activityBA,ac_tsearch.mostCurrent,525);
if (RapidSub.canDelegate("prfn_onpoststringoklistener")) { return com.it.fome.ac_tsearch.remoteMe.runUserSub(false, "ac_tsearch","prfn_onpoststringoklistener", _result, _tag);}
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
 BA.debugLineNum = 525;BA.debugLine="Sub prfn_onPostStringOkListener(Result As String";
Debug.ShouldStop(4096);
 BA.debugLineNum = 527;BA.debugLine="Select Tag";
Debug.ShouldStop(16384);
switch (BA.switchObjectToInt(_tag,BA.ObjectToString("iuser"),BA.ObjectToString("getinsta"))) {
case 0: {
 BA.debugLineNum = 529;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(65536);
ac_tsearch.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 530;BA.debugLine="Log(Result)";
Debug.ShouldStop(131072);
ac_tsearch.mostCurrent.__c.runVoidMethod ("LogImpl","615597573",_result,0);
 break; }
case 1: {
 BA.debugLineNum = 533;BA.debugLine="Log(Result)";
Debug.ShouldStop(1048576);
ac_tsearch.mostCurrent.__c.runVoidMethod ("LogImpl","615597576",_result,0);
 BA.debugLineNum = 534;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(2097152);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 535;BA.debugLine="parser.Initialize(Result)";
Debug.ShouldStop(4194304);
_parser.runVoidMethod ("Initialize",(Object)(_result));
 BA.debugLineNum = 536;BA.debugLine="Dim root As List = parser.NextArray";
Debug.ShouldStop(8388608);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_root = _parser.runMethod(false,"NextArray");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 537;BA.debugLine="For Each colroot As Map In root";
Debug.ShouldStop(16777216);
_colroot = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group10 = _root;
final int groupLen10 = group10.runMethod(true,"getSize").<Integer>get()
;int index10 = 0;
;
for (; index10 < groupLen10;index10++){
_colroot.setObject(group10.runMethod(false,"Get",index10));
Debug.locals.put("colroot", _colroot);
 BA.debugLineNum = 538;BA.debugLine="Dim Result As String = colroot.Get(\"result\")";
Debug.ShouldStop(33554432);
_result = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("result")))));Debug.locals.put("Result", _result);Debug.locals.put("Result", _result);
 BA.debugLineNum = 539;BA.debugLine="Dim c_m As String = colroot.Get(\"c_m\")";
Debug.ShouldStop(67108864);
_c_m = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("c_m")))));Debug.locals.put("c_m", _c_m);Debug.locals.put("c_m", _c_m);
 BA.debugLineNum = 540;BA.debugLine="Dim uid As String = colroot.Get(\"uid\")";
Debug.ShouldStop(134217728);
_uid = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("uid")))));Debug.locals.put("uid", _uid);Debug.locals.put("uid", _uid);
 BA.debugLineNum = 541;BA.debugLine="Dim first_last As String = colroot.Get(\"first_";
Debug.ShouldStop(268435456);
_first_last = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("first_last")))));Debug.locals.put("first_last", _first_last);Debug.locals.put("first_last", _first_last);
 BA.debugLineNum = 542;BA.debugLine="Dim id As String = colroot.Get(\"id\")";
Debug.ShouldStop(536870912);
_id = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 543;BA.debugLine="Dim userid As String = colroot.Get(\"userid\")";
Debug.ShouldStop(1073741824);
_userid = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("userid")))));Debug.locals.put("userid", _userid);Debug.locals.put("userid", _userid);
 BA.debugLineNum = 544;BA.debugLine="Dim username As String = colroot.Get(\"username";
Debug.ShouldStop(-2147483648);
_username = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("username")))));Debug.locals.put("username", _username);Debug.locals.put("username", _username);
 BA.debugLineNum = 545;BA.debugLine="Dim c_ch As String = colroot.Get(\"c_ch\")";
Debug.ShouldStop(1);
_c_ch = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("c_ch")))));Debug.locals.put("c_ch", _c_ch);Debug.locals.put("c_ch", _c_ch);
 BA.debugLineNum = 546;BA.debugLine="Dim n_coins=c_m As Long";
Debug.ShouldStop(2);
_n_coins = BA.numberCast(long.class, _c_m);Debug.locals.put("n_coins", _n_coins);Debug.locals.put("n_coins", _n_coins);
 BA.debugLineNum = 547;BA.debugLine="If n_coins>100 Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean(">",_n_coins,BA.numberCast(double.class, 100))) { 
 BA.debugLineNum = 548;BA.debugLine="lbl_nums.Text=\"سکه \"&NumberFormat(c_m,3,0)";
Debug.ShouldStop(8);
ac_tsearch.mostCurrent._lbl_nums.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("سکه "),ac_tsearch.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _c_m)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 0))))));
 }else {
 BA.debugLineNum = 550;BA.debugLine="lbl_nums.Text=\"سکه \"&c_m";
Debug.ShouldStop(32);
ac_tsearch.mostCurrent._lbl_nums.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("سکه "),_c_m)));
 };
 BA.debugLineNum = 554;BA.debugLine="sql1.ExecNonQuery(\"UPDATE tbl_coin set cm='\"&c";
Debug.ShouldStop(512);
ac_tsearch._sql1.runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE tbl_coin set cm='"),_c_m,RemoteObject.createImmutable("',cf='"),_c_ch,RemoteObject.createImmutable("' WHERE userid='"),ac_tsearch._userid_t,RemoteObject.createImmutable("' "))));
 }
}Debug.locals.put("colroot", _colroot);
;
 break; }
}
;
 BA.debugLineNum = 560;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 10;BA.debugLine="Dim telegs As milad_telegramv3";
ac_tsearch._telegs = RemoteObject.createNew ("com.mili.telegrams.teleg_warp");
 //BA.debugLineNum = 11;BA.debugLine="Type Adap_search (chat_id As Long,img_isdwonload";
;
 //BA.debugLineNum = 12;BA.debugLine="Private sql1 As SQL";
ac_tsearch._sql1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL");
 //BA.debugLineNum = 13;BA.debugLine="Private cursor1 As Cursor";
ac_tsearch._cursor1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
 //BA.debugLineNum = 14;BA.debugLine="Dim username_t ,userid_t As String";
ac_tsearch._username_t = RemoteObject.createImmutable("");
ac_tsearch._userid_t = RemoteObject.createImmutable("");
 //BA.debugLineNum = 15;BA.debugLine="Dim chatid As String";
ac_tsearch._chatid = RemoteObject.createImmutable("");
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _req_getme(RemoteObject _userid) throws Exception{
try {
		Debug.PushSubsStack("req_getme (ac_tsearch) ","ac_tsearch",12,ac_tsearch.mostCurrent.activityBA,ac_tsearch.mostCurrent,502);
if (RapidSub.canDelegate("req_getme")) { return com.it.fome.ac_tsearch.remoteMe.runUserSub(false, "ac_tsearch","req_getme", _userid);}
RemoteObject _prfn = RemoteObject.declareNull("com.reza.sh.fastnet.Fastnet");
RemoteObject _post = RemoteObject.declareNull("com.reza.sh.fastnet.PostRequestRaper");
Debug.locals.put("userid", _userid);
 BA.debugLineNum = 502;BA.debugLine="Sub req_getme(userid As String)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 503;BA.debugLine="Dim prfn As PersianFastNetwork";
Debug.ShouldStop(4194304);
_prfn = RemoteObject.createNew ("com.reza.sh.fastnet.Fastnet");Debug.locals.put("prfn", _prfn);
 BA.debugLineNum = 504;BA.debugLine="prfn.initialize(\"prfn\")";
Debug.ShouldStop(8388608);
_prfn.runVoidMethod ("initialize",ac_tsearch.processBA,(Object)(RemoteObject.createImmutable("prfn")));
 BA.debugLineNum = 506;BA.debugLine="Dim post As PostRequest";
Debug.ShouldStop(33554432);
_post = RemoteObject.createNew ("com.reza.sh.fastnet.PostRequestRaper");Debug.locals.put("post", _post);
 BA.debugLineNum = 507;BA.debugLine="post=prfn.BuildPostQuery(\"http://filework.ir/INST";
Debug.ShouldStop(67108864);
_post = _prfn.runMethod(false,"BuildPostQuery",(Object)(BA.ObjectToString("http://filework.ir/INSTAFOLLOW/api/req.php")),(Object)(RemoteObject.createImmutable("getinsta")));Debug.locals.put("post", _post);
 BA.debugLineNum = 509;BA.debugLine="post.addHeder(\"User-Agent\",\"Dalvik/1.6.0 (Linux;";
Debug.ShouldStop(268435456);
_post.runVoidMethod ("addHeder",(Object)(BA.ObjectToString("User-Agent")),(Object)(RemoteObject.createImmutable("Dalvik/1.6.0 (Linux; U; Android 4.4.4; SM-A700FD Build/KTU84P)")));
 BA.debugLineNum = 511;BA.debugLine="post.addParametrs(\"ui\",\"1\")";
Debug.ShouldStop(1073741824);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("ui")),(Object)(RemoteObject.createImmutable("1")));
 BA.debugLineNum = 512;BA.debugLine="post.addParametrs(\"userid\",userid_t)";
Debug.ShouldStop(-2147483648);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("userid")),(Object)(ac_tsearch._userid_t));
 BA.debugLineNum = 514;BA.debugLine="post.addParametrs(\"req\",\"get_acct\")";
Debug.ShouldStop(2);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("req")),(Object)(RemoteObject.createImmutable("get_acct")));
 BA.debugLineNum = 517;BA.debugLine="post.executRequestAsString";
Debug.ShouldStop(16);
_post.runVoidMethod ("executRequestAsString");
 BA.debugLineNum = 518;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
		Debug.PushSubsStack("SetAnimation (ac_tsearch) ","ac_tsearch",12,ac_tsearch.mostCurrent.activityBA,ac_tsearch.mostCurrent,490);
if (RapidSub.canDelegate("setanimation")) { return com.it.fome.ac_tsearch.remoteMe.runUserSub(false, "ac_tsearch","setanimation", _inanimation, _outanimation);}
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
RemoteObject _package = RemoteObject.createImmutable("");
RemoteObject _in = RemoteObject.createImmutable(0);
RemoteObject _out = RemoteObject.createImmutable(0);
Debug.locals.put("InAnimation", _inanimation);
Debug.locals.put("OutAnimation", _outanimation);
 BA.debugLineNum = 490;BA.debugLine="Sub SetAnimation(InAnimation As String, OutAnimati";
Debug.ShouldStop(512);
 BA.debugLineNum = 491;BA.debugLine="Dim r As Reflector";
Debug.ShouldStop(1024);
_r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("r", _r);
 BA.debugLineNum = 492;BA.debugLine="Dim package As String";
Debug.ShouldStop(2048);
_package = RemoteObject.createImmutable("");Debug.locals.put("package", _package);
 BA.debugLineNum = 493;BA.debugLine="Dim In, out As Int";
Debug.ShouldStop(4096);
_in = RemoteObject.createImmutable(0);Debug.locals.put("In", _in);
_out = RemoteObject.createImmutable(0);Debug.locals.put("out", _out);
 BA.debugLineNum = 494;BA.debugLine="package = r.GetStaticField(\"anywheresoftware.b4a.";
Debug.ShouldStop(8192);
_package = BA.ObjectToString(_r.runMethod(false,"GetStaticField",(Object)(BA.ObjectToString("anywheresoftware.b4a.BA")),(Object)(RemoteObject.createImmutable("packageName"))));Debug.locals.put("package", _package);
 BA.debugLineNum = 495;BA.debugLine="In = r.GetStaticField(package & \".R$anim\", InAnim";
Debug.ShouldStop(16384);
_in = BA.numberCast(int.class, _r.runMethod(false,"GetStaticField",(Object)(RemoteObject.concat(_package,RemoteObject.createImmutable(".R$anim"))),(Object)(_inanimation)));Debug.locals.put("In", _in);
 BA.debugLineNum = 496;BA.debugLine="out = r.GetStaticField(package & \".R$anim\", OutAn";
Debug.ShouldStop(32768);
_out = BA.numberCast(int.class, _r.runMethod(false,"GetStaticField",(Object)(RemoteObject.concat(_package,RemoteObject.createImmutable(".R$anim"))),(Object)(_outanimation)));Debug.locals.put("out", _out);
 BA.debugLineNum = 497;BA.debugLine="r.Target = r.GetActivity";
Debug.ShouldStop(65536);
_r.setField ("Target",(_r.runMethod(false,"GetActivity",ac_tsearch.processBA)));
 BA.debugLineNum = 498;BA.debugLine="r.RunMethod4(\"overridePendingTransition\", Array A";
Debug.ShouldStop(131072);
_r.runVoidMethod ("RunMethod4",(Object)(BA.ObjectToString("overridePendingTransition")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_in),(_out)})),(Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.ObjectToString("java.lang.int"),RemoteObject.createImmutable("java.lang.int")})));
 BA.debugLineNum = 499;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
		Debug.PushSubsStack("show_pnldialogs (ac_tsearch) ","ac_tsearch",12,ac_tsearch.mostCurrent.activityBA,ac_tsearch.mostCurrent,562);
if (RapidSub.canDelegate("show_pnldialogs")) { return com.it.fome.ac_tsearch.remoteMe.runUserSub(false, "ac_tsearch","show_pnldialogs", _isshsowa, _typesef);}
RemoteObject _lbl_s = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _mt_sef = RemoteObject.declareNull("com.it.fome.mt_sef");
RemoteObject _lbl_x = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _bg = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
RemoteObject _pnlmain = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
Debug.locals.put("isshsowa", _isshsowa);
Debug.locals.put("typesef", _typesef);
 BA.debugLineNum = 562;BA.debugLine="Sub show_pnldialogs(isshsowa As Boolean,typesef As";
Debug.ShouldStop(131072);
 BA.debugLineNum = 563;BA.debugLine="Select isshsowa";
Debug.ShouldStop(262144);
switch (BA.switchObjectToInt(_isshsowa,ac_tsearch.mostCurrent.__c.getField(true,"True"),ac_tsearch.mostCurrent.__c.getField(true,"False"))) {
case 0: {
 BA.debugLineNum = 565;BA.debugLine="pnl_dilogs.Initialize(\"pnl_dilogs\")";
Debug.ShouldStop(1048576);
ac_tsearch.mostCurrent._pnl_dilogs.runVoidMethod ("Initialize",ac_tsearch.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("pnl_dilogs")));
 BA.debugLineNum = 566;BA.debugLine="pnl_dilogs.Color=Colors.LightGray";
Debug.ShouldStop(2097152);
ac_tsearch.mostCurrent._pnl_dilogs.runVoidMethod ("setColor",ac_tsearch.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray"));
 BA.debugLineNum = 567;BA.debugLine="Activity.AddView(pnl_dilogs,0,20%x,100%x,100%y-";
Debug.ShouldStop(4194304);
ac_tsearch.mostCurrent._activity.runVoidMethod ("AddView",(Object)((ac_tsearch.mostCurrent._pnl_dilogs.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(ac_tsearch.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 20)),ac_tsearch.mostCurrent.activityBA)),(Object)(ac_tsearch.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),ac_tsearch.mostCurrent.activityBA)),(Object)(RemoteObject.solve(new RemoteObject[] {ac_tsearch.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),ac_tsearch.mostCurrent.activityBA),ac_tsearch.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 20)),ac_tsearch.mostCurrent.activityBA)}, "-",1, 1)));
 BA.debugLineNum = 569;BA.debugLine="Dim lbl_s As Label";
Debug.ShouldStop(16777216);
_lbl_s = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl_s", _lbl_s);
 BA.debugLineNum = 570;BA.debugLine="lbl_s.Initialize(\"lbl_nums\")";
Debug.ShouldStop(33554432);
_lbl_s.runVoidMethod ("Initialize",ac_tsearch.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("lbl_nums")));
 BA.debugLineNum = 571;BA.debugLine="lbl_s.TextColor=Colors.White";
Debug.ShouldStop(67108864);
_lbl_s.runMethod(true,"setTextColor",ac_tsearch.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 572;BA.debugLine="lbl_s.TextSize=20";
Debug.ShouldStop(134217728);
_lbl_s.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 573;BA.debugLine="lbl_s.Typeface=Typeface.LoadFromAssets(\"iran_sa";
Debug.ShouldStop(268435456);
_lbl_s.runMethod(false,"setTypeface",ac_tsearch.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("iran_sans.ttf"))));
 BA.debugLineNum = 574;BA.debugLine="lbl_s.Gravity=Gravity.CENTER_VERTICAL+Gravity.R";
Debug.ShouldStop(536870912);
_lbl_s.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {ac_tsearch.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL"),ac_tsearch.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT")}, "+",1, 1));
 BA.debugLineNum = 575;BA.debugLine="pnl_dilogs.AddView(lbl_s,2%x,0,pnl_dilogs.Width";
Debug.ShouldStop(1073741824);
ac_tsearch.mostCurrent._pnl_dilogs.runVoidMethod ("AddView",(Object)((_lbl_s.getObject())),(Object)(ac_tsearch.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),ac_tsearch.mostCurrent.activityBA)),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {ac_tsearch.mostCurrent._pnl_dilogs.runMethod(true,"getWidth"),ac_tsearch.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),ac_tsearch.mostCurrent.activityBA)}, "-",1, 1)),(Object)(ac_tsearch.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),ac_tsearch.mostCurrent.activityBA)));
 BA.debugLineNum = 577;BA.debugLine="Dim mt_sef As mt_sef";
Debug.ShouldStop(1);
_mt_sef = RemoteObject.createNew ("com.it.fome.mt_sef");Debug.locals.put("mt_sef", _mt_sef);
 BA.debugLineNum = 578;BA.debugLine="mt_sef.Initialize(\"mt_sef\",Me)";
Debug.ShouldStop(2);
_mt_sef.runClassMethod (com.it.fome.mt_sef.class, "_initialize" /*RemoteObject*/ ,ac_tsearch.mostCurrent.activityBA,(Object)(BA.ObjectToString("mt_sef")),(Object)(ac_tsearch.getObject()));
 BA.debugLineNum = 580;BA.debugLine="Select typesef";
Debug.ShouldStop(8);
switch (BA.switchObjectToInt(_typesef,BA.numberCast(int.class, 0),BA.numberCast(int.class, 3))) {
case 0: {
 BA.debugLineNum = 582;BA.debugLine="lbl_s.Text=\"سفارش ممبر\"";
Debug.ShouldStop(32);
_lbl_s.runMethod(true,"setText",BA.ObjectToCharSequence("سفارش ممبر"));
 BA.debugLineNum = 583;BA.debugLine="mt_sef.username_target=username_target";
Debug.ShouldStop(64);
_mt_sef.setField ("_username_target" /*RemoteObject*/ ,ac_tsearch.mostCurrent._username_target);
 break; }
case 1: {
 BA.debugLineNum = 586;BA.debugLine="lbl_s.Text=\"سفارش ویو\"";
Debug.ShouldStop(512);
_lbl_s.runMethod(true,"setText",BA.ObjectToCharSequence("سفارش ویو"));
 BA.debugLineNum = 587;BA.debugLine="mt_sef.username_target=chatid";
Debug.ShouldStop(1024);
_mt_sef.setField ("_username_target" /*RemoteObject*/ ,ac_tsearch._chatid);
 BA.debugLineNum = 588;BA.debugLine="mt_sef.us_name=username_target";
Debug.ShouldStop(2048);
_mt_sef.setField ("_us_name" /*RemoteObject*/ ,ac_tsearch.mostCurrent._username_target);
 BA.debugLineNum = 589;BA.debugLine="mt_sef.idchannel_t=idchannel_target";
Debug.ShouldStop(4096);
_mt_sef.setField ("_idchannel_t" /*RemoteObject*/ ,ac_tsearch.mostCurrent._idchannel_target);
 BA.debugLineNum = 590;BA.debugLine="mt_sef.titelchat_target=title_target";
Debug.ShouldStop(8192);
_mt_sef.setField ("_titelchat_target" /*RemoteObject*/ ,ac_tsearch.mostCurrent._title_target);
 break; }
}
;
 BA.debugLineNum = 593;BA.debugLine="Dim lbl_x As Label";
Debug.ShouldStop(65536);
_lbl_x = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl_x", _lbl_x);
 BA.debugLineNum = 594;BA.debugLine="lbl_x.Initialize(\"lbl_x\")";
Debug.ShouldStop(131072);
_lbl_x.runVoidMethod ("Initialize",ac_tsearch.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("lbl_x")));
 BA.debugLineNum = 595;BA.debugLine="lbl_x.TextColor=Colors.White";
Debug.ShouldStop(262144);
_lbl_x.runMethod(true,"setTextColor",ac_tsearch.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 596;BA.debugLine="lbl_x.TextSize=28";
Debug.ShouldStop(524288);
_lbl_x.runMethod(true,"setTextSize",BA.numberCast(float.class, 28));
 BA.debugLineNum = 597;BA.debugLine="lbl_x.Typeface=Typeface.MATERIALICONS";
Debug.ShouldStop(1048576);
_lbl_x.runMethod(false,"setTypeface",ac_tsearch.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"getMATERIALICONS"));
 BA.debugLineNum = 598;BA.debugLine="lbl_x.Gravity=Gravity.CENTER_VERTICAL+Gravity.C";
Debug.ShouldStop(2097152);
_lbl_x.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {ac_tsearch.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL"),ac_tsearch.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL")}, "+",1, 1));
 BA.debugLineNum = 599;BA.debugLine="lbl_x.Text=Chr(0xE5C8)";
Debug.ShouldStop(4194304);
_lbl_x.runMethod(true,"setText",BA.ObjectToCharSequence(ac_tsearch.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xe5c8)))));
 BA.debugLineNum = 600;BA.debugLine="pnl_dilogs.AddView(lbl_x,pnl_dilogs.Width-15%x,";
Debug.ShouldStop(8388608);
ac_tsearch.mostCurrent._pnl_dilogs.runVoidMethod ("AddView",(Object)((_lbl_x.getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {ac_tsearch.mostCurrent._pnl_dilogs.runMethod(true,"getWidth"),ac_tsearch.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),ac_tsearch.mostCurrent.activityBA)}, "-",1, 1)),(Object)(BA.numberCast(int.class, 0)),(Object)(ac_tsearch.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),ac_tsearch.mostCurrent.activityBA)),(Object)(ac_tsearch.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),ac_tsearch.mostCurrent.activityBA)));
 BA.debugLineNum = 602;BA.debugLine="Dim bg As ColorDrawable";
Debug.ShouldStop(33554432);
_bg = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("bg", _bg);
 BA.debugLineNum = 603;BA.debugLine="bg.Initialize2(Colors.White,5dip,2dip,Colors.Li";
Debug.ShouldStop(67108864);
_bg.runVoidMethod ("Initialize2",(Object)(ac_tsearch.mostCurrent.__c.getField(false,"Colors").getField(true,"White")),(Object)(ac_tsearch.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))),(Object)(ac_tsearch.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))),(Object)(ac_tsearch.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray")));
 BA.debugLineNum = 604;BA.debugLine="Dim pnlmain As Panel";
Debug.ShouldStop(134217728);
_pnlmain = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("pnlmain", _pnlmain);
 BA.debugLineNum = 605;BA.debugLine="pnlmain.Initialize(\"\")";
Debug.ShouldStop(268435456);
_pnlmain.runVoidMethod ("Initialize",ac_tsearch.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 606;BA.debugLine="pnlmain.Background=bg";
Debug.ShouldStop(536870912);
_pnlmain.runMethod(false,"setBackground",(_bg.getObject()));
 BA.debugLineNum = 607;BA.debugLine="pnl_dilogs.AddView(pnlmain,5%x,10%x,pnl_dilogs.";
Debug.ShouldStop(1073741824);
ac_tsearch.mostCurrent._pnl_dilogs.runVoidMethod ("AddView",(Object)((_pnlmain.getObject())),(Object)(ac_tsearch.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),ac_tsearch.mostCurrent.activityBA)),(Object)(ac_tsearch.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),ac_tsearch.mostCurrent.activityBA)),(Object)(RemoteObject.solve(new RemoteObject[] {ac_tsearch.mostCurrent._pnl_dilogs.runMethod(true,"getWidth"),ac_tsearch.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),ac_tsearch.mostCurrent.activityBA)}, "-",1, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {ac_tsearch.mostCurrent._pnl_dilogs.runMethod(true,"getHeight"),ac_tsearch.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 20)),ac_tsearch.mostCurrent.activityBA)}, "-",1, 1)));
 BA.debugLineNum = 609;BA.debugLine="mt_sef.Type_sef=typesef";
Debug.ShouldStop(1);
_mt_sef.setField ("_type_sef" /*RemoteObject*/ ,_typesef);
 BA.debugLineNum = 610;BA.debugLine="mt_sef.img_address_target=img_target";
Debug.ShouldStop(2);
_mt_sef.setField ("_img_address_target" /*RemoteObject*/ ,ac_tsearch.mostCurrent._img_target);
 BA.debugLineNum = 611;BA.debugLine="mt_sef.addpnl(pnlmain)";
Debug.ShouldStop(4);
_mt_sef.runClassMethod (com.it.fome.mt_sef.class, "_addpnl" /*RemoteObject*/ ,(Object)(_pnlmain));
 break; }
case 1: {
 BA.debugLineNum = 614;BA.debugLine="If pnl_dilogs.IsInitialized=True And pnl_dilogs";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",ac_tsearch.mostCurrent._pnl_dilogs.runMethod(true,"IsInitialized"),ac_tsearch.mostCurrent.__c.getField(true,"True")) && RemoteObject.solveBoolean("=",ac_tsearch.mostCurrent._pnl_dilogs.runMethod(true,"getEnabled"),ac_tsearch.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 615;BA.debugLine="pnl_dilogs.Visible=False";
Debug.ShouldStop(64);
ac_tsearch.mostCurrent._pnl_dilogs.runMethod(true,"setVisible",ac_tsearch.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 616;BA.debugLine="pnl_dilogs.Enabled=False";
Debug.ShouldStop(128);
ac_tsearch.mostCurrent._pnl_dilogs.runMethod(true,"setEnabled",ac_tsearch.mostCurrent.__c.getField(true,"False"));
 };
 break; }
}
;
 BA.debugLineNum = 619;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _showsearch(RemoteObject _isshow) throws Exception{
try {
		Debug.PushSubsStack("showsearch (ac_tsearch) ","ac_tsearch",12,ac_tsearch.mostCurrent.activityBA,ac_tsearch.mostCurrent,203);
if (RapidSub.canDelegate("showsearch")) { return com.it.fome.ac_tsearch.remoteMe.runUserSub(false, "ac_tsearch","showsearch", _isshow);}
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
Debug.locals.put("isshow", _isshow);
 BA.debugLineNum = 203;BA.debugLine="Sub showsearch(isshow As Boolean)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 204;BA.debugLine="If isshow=True Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",_isshow,ac_tsearch.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 205;BA.debugLine="cardchannel.Visible=True";
Debug.ShouldStop(4096);
ac_tsearch.mostCurrent._cardchannel.runMethod(true,"setVisible",ac_tsearch.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 206;BA.debugLine="Dim pnl As Panel";
Debug.ShouldStop(8192);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 207;BA.debugLine="pnl.Initialize(\"\")";
Debug.ShouldStop(16384);
_pnl.runVoidMethod ("Initialize",ac_tsearch.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 208;BA.debugLine="cardchannel.AddView(pnl,0,0,cardchannel.Width,ca";
Debug.ShouldStop(32768);
ac_tsearch.mostCurrent._cardchannel.runVoidMethod ("AddView",(Object)((_pnl.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(ac_tsearch.mostCurrent._cardchannel.runMethod(true,"getWidth")),(Object)(ac_tsearch.mostCurrent._cardchannel.runMethod(true,"getHeight")));
 BA.debugLineNum = 209;BA.debugLine="channell_onCreateViewHolder(pnl)";
Debug.ShouldStop(65536);
_channell_oncreateviewholder(_pnl);
 }else {
 BA.debugLineNum = 211;BA.debugLine="cardchannel.Visible=False";
Debug.ShouldStop(262144);
ac_tsearch.mostCurrent._cardchannel.runMethod(true,"setVisible",ac_tsearch.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 213;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("telegs_errormsg (ac_tsearch) ","ac_tsearch",12,ac_tsearch.mostCurrent.activityBA,ac_tsearch.mostCurrent,414);
if (RapidSub.canDelegate("telegs_errormsg")) { return com.it.fome.ac_tsearch.remoteMe.runUserSub(false, "ac_tsearch","telegs_errormsg", _value);}
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _error_msg = RemoteObject.createImmutable("");
RemoteObject _errorconstructor = RemoteObject.createImmutable(0);
RemoteObject _error_code = RemoteObject.createImmutable(0);
Debug.locals.put("value", _value);
 BA.debugLineNum = 414;BA.debugLine="Sub telegs_errormsg(value As String)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 415;BA.debugLine="LogColor(value,Colors.Blue)";
Debug.ShouldStop(1073741824);
ac_tsearch.mostCurrent.__c.runVoidMethod ("LogImpl","615073281",_value,ac_tsearch.mostCurrent.__c.getField(false,"Colors").getField(true,"Blue"));
 BA.debugLineNum = 416;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(-2147483648);
ac_tsearch.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 417;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(1);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 418;BA.debugLine="parser.Initialize(value)";
Debug.ShouldStop(2);
_parser.runVoidMethod ("Initialize",(Object)(_value));
 BA.debugLineNum = 419;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(4);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 420;BA.debugLine="Dim Error_msg As String = root.Get(\"Error_msg\")";
Debug.ShouldStop(8);
_error_msg = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Error_msg")))));Debug.locals.put("Error_msg", _error_msg);Debug.locals.put("Error_msg", _error_msg);
 BA.debugLineNum = 421;BA.debugLine="Dim ErrorConstructor As Int = root.Get(\"ErrorCons";
Debug.ShouldStop(16);
_errorconstructor = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ErrorConstructor")))));Debug.locals.put("ErrorConstructor", _errorconstructor);Debug.locals.put("ErrorConstructor", _errorconstructor);
 BA.debugLineNum = 422;BA.debugLine="Dim Error_code As Int = root.Get(\"Error_code\")";
Debug.ShouldStop(32);
_error_code = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Error_code")))));Debug.locals.put("Error_code", _error_code);Debug.locals.put("Error_code", _error_code);
 BA.debugLineNum = 423;BA.debugLine="ToastMessageShow(Error_msg,False)";
Debug.ShouldStop(64);
ac_tsearch.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(_error_msg)),(Object)(ac_tsearch.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 424;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _telegs_getme(RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("telegs_getme (ac_tsearch) ","ac_tsearch",12,ac_tsearch.mostCurrent.activityBA,ac_tsearch.mostCurrent,426);
if (RapidSub.canDelegate("telegs_getme")) { return com.it.fome.ac_tsearch.remoteMe.runUserSub(false, "ac_tsearch","telegs_getme", _value);}
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _lastname = RemoteObject.createImmutable("");
RemoteObject _firstname = RemoteObject.createImmutable("");
RemoteObject _phonenumber = RemoteObject.createImmutable("");
RemoteObject _profilephoto = RemoteObject.createImmutable("");
RemoteObject _isverified = RemoteObject.createImmutable("");
RemoteObject _id = RemoteObject.createImmutable(0);
RemoteObject _restrictionreason = RemoteObject.createImmutable("");
RemoteObject _haveaccess = RemoteObject.createImmutable("");
RemoteObject _typess = RemoteObject.createImmutable("");
RemoteObject _username = RemoteObject.createImmutable("");
RemoteObject _status = RemoteObject.createImmutable("");
Debug.locals.put("value", _value);
 BA.debugLineNum = 426;BA.debugLine="Sub telegs_getme(value As String)";
Debug.ShouldStop(512);
 BA.debugLineNum = 427;BA.debugLine="LogColor(value,Colors.Blue)";
Debug.ShouldStop(1024);
ac_tsearch.mostCurrent.__c.runVoidMethod ("LogImpl","615138817",_value,ac_tsearch.mostCurrent.__c.getField(false,"Colors").getField(true,"Blue"));
 BA.debugLineNum = 428;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(2048);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 429;BA.debugLine="parser.Initialize(value)";
Debug.ShouldStop(4096);
_parser.runVoidMethod ("Initialize",(Object)(_value));
 BA.debugLineNum = 430;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(8192);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 431;BA.debugLine="Dim lastName As String = root.Get(\"lastName\")";
Debug.ShouldStop(16384);
_lastname = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lastName")))));Debug.locals.put("lastName", _lastname);Debug.locals.put("lastName", _lastname);
 BA.debugLineNum = 432;BA.debugLine="Dim firstName As String = root.Get(\"firstName\")";
Debug.ShouldStop(32768);
_firstname = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("firstName")))));Debug.locals.put("firstName", _firstname);Debug.locals.put("firstName", _firstname);
 BA.debugLineNum = 433;BA.debugLine="Dim phoneNumber As String = root.Get(\"phoneNumber";
Debug.ShouldStop(65536);
_phonenumber = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("phoneNumber")))));Debug.locals.put("phoneNumber", _phonenumber);Debug.locals.put("phoneNumber", _phonenumber);
 BA.debugLineNum = 434;BA.debugLine="Dim profilePhoto As String = root.Get(\"profilePho";
Debug.ShouldStop(131072);
_profilephoto = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("profilePhoto")))));Debug.locals.put("profilePhoto", _profilephoto);Debug.locals.put("profilePhoto", _profilephoto);
 BA.debugLineNum = 435;BA.debugLine="Dim isVerified As String = root.Get(\"isVerified\")";
Debug.ShouldStop(262144);
_isverified = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("isVerified")))));Debug.locals.put("isVerified", _isverified);Debug.locals.put("isVerified", _isverified);
 BA.debugLineNum = 436;BA.debugLine="Dim id As Int = root.Get(\"id\")";
Debug.ShouldStop(524288);
_id = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 437;BA.debugLine="Dim restrictionReason As String = root.Get(\"restr";
Debug.ShouldStop(1048576);
_restrictionreason = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("restrictionReason")))));Debug.locals.put("restrictionReason", _restrictionreason);Debug.locals.put("restrictionReason", _restrictionreason);
 BA.debugLineNum = 438;BA.debugLine="Dim haveAccess As String = root.Get(\"haveAccess\")";
Debug.ShouldStop(2097152);
_haveaccess = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("haveAccess")))));Debug.locals.put("haveAccess", _haveaccess);Debug.locals.put("haveAccess", _haveaccess);
 BA.debugLineNum = 439;BA.debugLine="Dim Typess As String = root.Get(\"type\")";
Debug.ShouldStop(4194304);
_typess = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("type")))));Debug.locals.put("Typess", _typess);Debug.locals.put("Typess", _typess);
 BA.debugLineNum = 440;BA.debugLine="Dim username As String = root.Get(\"username\")";
Debug.ShouldStop(8388608);
_username = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("username")))));Debug.locals.put("username", _username);Debug.locals.put("username", _username);
 BA.debugLineNum = 441;BA.debugLine="Dim status As String = root.Get(\"status\")";
Debug.ShouldStop(16777216);
_status = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("status")))));Debug.locals.put("status", _status);Debug.locals.put("status", _status);
 BA.debugLineNum = 442;BA.debugLine="id_user=id";
Debug.ShouldStop(33554432);
ac_tsearch.mostCurrent._id_user = BA.NumberToString(_id);
 BA.debugLineNum = 445;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("telegs_getsupergroup (ac_tsearch) ","ac_tsearch",12,ac_tsearch.mostCurrent.activityBA,ac_tsearch.mostCurrent,629);
if (RapidSub.canDelegate("telegs_getsupergroup")) { return com.it.fome.ac_tsearch.remoteMe.runUserSub(false, "ac_tsearch","telegs_getsupergroup", _value);}
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
RemoteObject _username = RemoteObject.createImmutable("");
RemoteObject _status = RemoteObject.createImmutable("");
RemoteObject _builder = RemoteObject.declareNull("de.amberhome.materialdialogs.MaterialDialogBuilderWrapper");
Debug.locals.put("value", _value);
 BA.debugLineNum = 629;BA.debugLine="Sub telegs_getsupergroup(value As String)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 630;BA.debugLine="Log(value)";
Debug.ShouldStop(2097152);
ac_tsearch.mostCurrent.__c.runVoidMethod ("LogImpl","615859713",_value,0);
 BA.debugLineNum = 631;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(4194304);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 632;BA.debugLine="parser.Initialize(value)";
Debug.ShouldStop(8388608);
_parser.runVoidMethod ("Initialize",(Object)(_value));
 BA.debugLineNum = 633;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(16777216);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 634;BA.debugLine="Dim date As Int = root.Get(\"date\")";
Debug.ShouldStop(33554432);
_date = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("date")))));Debug.locals.put("date", _date);Debug.locals.put("date", _date);
 BA.debugLineNum = 635;BA.debugLine="Dim isVerified As String = root.Get(\"isVerified\")";
Debug.ShouldStop(67108864);
_isverified = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("isVerified")))));Debug.locals.put("isVerified", _isverified);Debug.locals.put("isVerified", _isverified);
 BA.debugLineNum = 636;BA.debugLine="Dim isChannel As String = root.Get(\"isChannel\")";
Debug.ShouldStop(134217728);
_ischannel = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("isChannel")))));Debug.locals.put("isChannel", _ischannel);Debug.locals.put("isChannel", _ischannel);
 BA.debugLineNum = 637;BA.debugLine="Dim signMessages As String = root.Get(\"signMessag";
Debug.ShouldStop(268435456);
_signmessages = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("signMessages")))));Debug.locals.put("signMessages", _signmessages);Debug.locals.put("signMessages", _signmessages);
 BA.debugLineNum = 638;BA.debugLine="Dim memberCount As Int = root.Get(\"memberCount\")";
Debug.ShouldStop(536870912);
_membercount = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("memberCount")))));Debug.locals.put("memberCount", _membercount);Debug.locals.put("memberCount", _membercount);
 BA.debugLineNum = 639;BA.debugLine="Dim id As Int = root.Get(\"id\")";
Debug.ShouldStop(1073741824);
_id = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 640;BA.debugLine="Dim restrictionReason As String = root.Get(\"restr";
Debug.ShouldStop(-2147483648);
_restrictionreason = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("restrictionReason")))));Debug.locals.put("restrictionReason", _restrictionreason);Debug.locals.put("restrictionReason", _restrictionreason);
 BA.debugLineNum = 641;BA.debugLine="Dim anyoneCanInvite As String = root.Get(\"anyoneC";
Debug.ShouldStop(1);
_anyonecaninvite = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("anyoneCanInvite")))));Debug.locals.put("anyoneCanInvite", _anyonecaninvite);Debug.locals.put("anyoneCanInvite", _anyonecaninvite);
 BA.debugLineNum = 642;BA.debugLine="Dim username As String = root.Get(\"username\")";
Debug.ShouldStop(2);
_username = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("username")))));Debug.locals.put("username", _username);Debug.locals.put("username", _username);
 BA.debugLineNum = 643;BA.debugLine="Dim status As String = root.Get(\"status\")";
Debug.ShouldStop(4);
_status = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("status")))));Debug.locals.put("status", _status);Debug.locals.put("status", _status);
 BA.debugLineNum = 645;BA.debugLine="id_target=id";
Debug.ShouldStop(16);
ac_tsearch.mostCurrent._id_target = BA.NumberToString(_id);
 BA.debugLineNum = 646;BA.debugLine="username_target=username";
Debug.ShouldStop(32);
ac_tsearch.mostCurrent._username_target = _username;
 BA.debugLineNum = 649;BA.debugLine="Dim Builder As MaterialDialogBuilder";
Debug.ShouldStop(256);
_builder = RemoteObject.createNew ("de.amberhome.materialdialogs.MaterialDialogBuilderWrapper");Debug.locals.put("Builder", _builder);
 BA.debugLineNum = 650;BA.debugLine="Builder.Initialize(\"Dialog\")";
Debug.ShouldStop(512);
_builder.runVoidMethod ("Initialize",ac_tsearch.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Dialog")));
 BA.debugLineNum = 652;BA.debugLine="Builder.Items(Array As String(\"سفارش ممبر برای کا";
Debug.ShouldStop(2048);
_builder.runVoidMethod ("Items",(Object)((RemoteObject.createNewArray("String",new int[] {2},new Object[] {RemoteObject.concat(RemoteObject.createImmutable("سفارش ممبر برای کانال "),ac_tsearch.mostCurrent._title_target),RemoteObject.concat(RemoteObject.createImmutable("سفارش ویو برای کانال "),ac_tsearch.mostCurrent._title_target)}))));
 BA.debugLineNum = 653;BA.debugLine="Builder.ItemsCallback";
Debug.ShouldStop(4096);
_builder.runVoidMethod ("ItemsCallback");
 BA.debugLineNum = 654;BA.debugLine="Builder.Show";
Debug.ShouldStop(8192);
_builder.runVoidMethod ("Show");
 BA.debugLineNum = 656;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _telegs_joinchannel(RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("telegs_joinchannel (ac_tsearch) ","ac_tsearch",12,ac_tsearch.mostCurrent.activityBA,ac_tsearch.mostCurrent,485);
if (RapidSub.canDelegate("telegs_joinchannel")) { return com.it.fome.ac_tsearch.remoteMe.runUserSub(false, "ac_tsearch","telegs_joinchannel", _value);}
Debug.locals.put("value", _value);
 BA.debugLineNum = 485;BA.debugLine="Sub telegs_joinchannel(value As String)";
Debug.ShouldStop(16);
 BA.debugLineNum = 486;BA.debugLine="LogColor(value,Colors.Blue)";
Debug.ShouldStop(32);
ac_tsearch.mostCurrent.__c.runVoidMethod ("LogImpl","615335425",_value,ac_tsearch.mostCurrent.__c.getField(false,"Colors").getField(true,"Blue"));
 BA.debugLineNum = 488;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _telegs_searchpublicchat(RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("telegs_searchpublicchat (ac_tsearch) ","ac_tsearch",12,ac_tsearch.mostCurrent.activityBA,ac_tsearch.mostCurrent,215);
if (RapidSub.canDelegate("telegs_searchpublicchat")) { return com.it.fome.ac_tsearch.remoteMe.runUserSub(false, "ac_tsearch","telegs_searchpublicchat", _value);}
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _chat_type = RemoteObject.createImmutable("");
RemoteObject _photo_l_canbedeleted = RemoteObject.createImmutable("");
RemoteObject _chat_id = RemoteObject.createImmutable("");
RemoteObject _photo_id = RemoteObject.createImmutable("");
RemoteObject _photo_r_isuploadingactive = RemoteObject.createImmutable("");
RemoteObject _photo_r_id = RemoteObject.createImmutable("");
RemoteObject _chat_title = RemoteObject.createImmutable("");
RemoteObject _photo_l_canbedownloaded = RemoteObject.createImmutable("");
RemoteObject _chat_clientdata = RemoteObject.createImmutable("");
RemoteObject _photo_r_uploadedsize = RemoteObject.createImmutable("");
RemoteObject _photo_l_path = RemoteObject.createImmutable("");
RemoteObject _photo_l_isdownloadingcompleted = RemoteObject.createImmutable("");
RemoteObject _channel_info = RemoteObject.createImmutable("");
RemoteObject _photo_size = RemoteObject.createImmutable("");
RemoteObject _photo_l_downloadedsize = RemoteObject.createImmutable("");
RemoteObject _photo_l_isdownloadingactive = RemoteObject.createImmutable("");
RemoteObject _photo_expectedsize = RemoteObject.createImmutable("");
RemoteObject _photo_r_isuploadingcompleted = RemoteObject.createImmutable("");
RemoteObject _photo_l_downloadedprefixsize = RemoteObject.createImmutable("");
RemoteObject _chat_order = RemoteObject.createImmutable("");
RemoteObject _item = RemoteObject.declareNull("com.it.fome.ac_lchats._adap_chats");
Debug.locals.put("value", _value);
 BA.debugLineNum = 215;BA.debugLine="Sub telegs_searchpublicchat(value As String)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 216;BA.debugLine="Log(value)";
Debug.ShouldStop(8388608);
ac_tsearch.mostCurrent.__c.runVoidMethod ("LogImpl","614876673",_value,0);
 BA.debugLineNum = 217;BA.debugLine="listchats.Initialize";
Debug.ShouldStop(16777216);
ac_tsearch.mostCurrent._listchats.runVoidMethod ("Initialize");
 BA.debugLineNum = 218;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(33554432);
ac_tsearch.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 219;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(67108864);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 220;BA.debugLine="parser.Initialize(value)";
Debug.ShouldStop(134217728);
_parser.runVoidMethod ("Initialize",(Object)(_value));
 BA.debugLineNum = 221;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(268435456);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 222;BA.debugLine="Dim Chat_type As String = root.Get(\"Chat_type\")";
Debug.ShouldStop(536870912);
_chat_type = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Chat_type")))));Debug.locals.put("Chat_type", _chat_type);Debug.locals.put("Chat_type", _chat_type);
 BA.debugLineNum = 223;BA.debugLine="Dim photo_l_canBeDeleted As String = root.Get(\"ph";
Debug.ShouldStop(1073741824);
_photo_l_canbedeleted = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photo_l_canBeDeleted")))));Debug.locals.put("photo_l_canBeDeleted", _photo_l_canbedeleted);Debug.locals.put("photo_l_canBeDeleted", _photo_l_canbedeleted);
 BA.debugLineNum = 224;BA.debugLine="Dim Chat_id As String = root.Get(\"Chat_id\")";
Debug.ShouldStop(-2147483648);
_chat_id = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Chat_id")))));Debug.locals.put("Chat_id", _chat_id);Debug.locals.put("Chat_id", _chat_id);
 BA.debugLineNum = 225;BA.debugLine="Dim photo_id As String = root.Get(\"photo_id\")";
Debug.ShouldStop(1);
_photo_id = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photo_id")))));Debug.locals.put("photo_id", _photo_id);Debug.locals.put("photo_id", _photo_id);
 BA.debugLineNum = 226;BA.debugLine="Dim photo_r_isUploadingActive As String = root.Ge";
Debug.ShouldStop(2);
_photo_r_isuploadingactive = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photo_r_isUploadingActive")))));Debug.locals.put("photo_r_isUploadingActive", _photo_r_isuploadingactive);Debug.locals.put("photo_r_isUploadingActive", _photo_r_isuploadingactive);
 BA.debugLineNum = 227;BA.debugLine="Dim photo_r_id As String = root.Get(\"photo_r_id\")";
Debug.ShouldStop(4);
_photo_r_id = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photo_r_id")))));Debug.locals.put("photo_r_id", _photo_r_id);Debug.locals.put("photo_r_id", _photo_r_id);
 BA.debugLineNum = 228;BA.debugLine="Dim Chat_title As String = root.Get(\"Chat_title\")";
Debug.ShouldStop(8);
_chat_title = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Chat_title")))));Debug.locals.put("Chat_title", _chat_title);Debug.locals.put("Chat_title", _chat_title);
 BA.debugLineNum = 229;BA.debugLine="Dim photo_l_canBeDownloaded As String = root.Get(";
Debug.ShouldStop(16);
_photo_l_canbedownloaded = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photo_l_canBeDownloaded")))));Debug.locals.put("photo_l_canBeDownloaded", _photo_l_canbedownloaded);Debug.locals.put("photo_l_canBeDownloaded", _photo_l_canbedownloaded);
 BA.debugLineNum = 230;BA.debugLine="Dim Chat_clientData As String = root.Get(\"Chat_cl";
Debug.ShouldStop(32);
_chat_clientdata = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Chat_clientData")))));Debug.locals.put("Chat_clientData", _chat_clientdata);Debug.locals.put("Chat_clientData", _chat_clientdata);
 BA.debugLineNum = 231;BA.debugLine="Dim photo_r_uploadedSize As String = root.Get(\"ph";
Debug.ShouldStop(64);
_photo_r_uploadedsize = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photo_r_uploadedSize")))));Debug.locals.put("photo_r_uploadedSize", _photo_r_uploadedsize);Debug.locals.put("photo_r_uploadedSize", _photo_r_uploadedsize);
 BA.debugLineNum = 232;BA.debugLine="Dim photo_l_path As String = root.Get(\"photo_l_pa";
Debug.ShouldStop(128);
_photo_l_path = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photo_l_path")))));Debug.locals.put("photo_l_path", _photo_l_path);Debug.locals.put("photo_l_path", _photo_l_path);
 BA.debugLineNum = 233;BA.debugLine="Dim photo_l_isDownloadingCompleted As String = ro";
Debug.ShouldStop(256);
_photo_l_isdownloadingcompleted = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photo_l_isDownloadingCompleted")))));Debug.locals.put("photo_l_isDownloadingCompleted", _photo_l_isdownloadingcompleted);Debug.locals.put("photo_l_isDownloadingCompleted", _photo_l_isdownloadingcompleted);
 BA.debugLineNum = 234;BA.debugLine="Dim channel_info As String = root.Get(\"channel_in";
Debug.ShouldStop(512);
_channel_info = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("channel_info")))));Debug.locals.put("channel_info", _channel_info);Debug.locals.put("channel_info", _channel_info);
 BA.debugLineNum = 235;BA.debugLine="Dim photo_size As String = root.Get(\"photo_size\")";
Debug.ShouldStop(1024);
_photo_size = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photo_size")))));Debug.locals.put("photo_size", _photo_size);Debug.locals.put("photo_size", _photo_size);
 BA.debugLineNum = 236;BA.debugLine="Dim Chat_type As String = root.Get(\"chat_type\")";
Debug.ShouldStop(2048);
_chat_type = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("chat_type")))));Debug.locals.put("Chat_type", _chat_type);Debug.locals.put("Chat_type", _chat_type);
 BA.debugLineNum = 237;BA.debugLine="Dim photo_l_downloadedSize As String = root.Get(\"";
Debug.ShouldStop(4096);
_photo_l_downloadedsize = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photo_l_downloadedSize")))));Debug.locals.put("photo_l_downloadedSize", _photo_l_downloadedsize);Debug.locals.put("photo_l_downloadedSize", _photo_l_downloadedsize);
 BA.debugLineNum = 238;BA.debugLine="Dim photo_l_isDownloadingActive As String = root.";
Debug.ShouldStop(8192);
_photo_l_isdownloadingactive = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photo_l_isDownloadingActive")))));Debug.locals.put("photo_l_isDownloadingActive", _photo_l_isdownloadingactive);Debug.locals.put("photo_l_isDownloadingActive", _photo_l_isdownloadingactive);
 BA.debugLineNum = 239;BA.debugLine="Dim photo_expectedSize As String = root.Get(\"phot";
Debug.ShouldStop(16384);
_photo_expectedsize = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photo_expectedSize")))));Debug.locals.put("photo_expectedSize", _photo_expectedsize);Debug.locals.put("photo_expectedSize", _photo_expectedsize);
 BA.debugLineNum = 240;BA.debugLine="Dim photo_r_isUploadingCompleted As String = root";
Debug.ShouldStop(32768);
_photo_r_isuploadingcompleted = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photo_r_isUploadingCompleted")))));Debug.locals.put("photo_r_isUploadingCompleted", _photo_r_isuploadingcompleted);Debug.locals.put("photo_r_isUploadingCompleted", _photo_r_isuploadingcompleted);
 BA.debugLineNum = 241;BA.debugLine="Dim photo_l_downloadedPrefixSize As String = root";
Debug.ShouldStop(65536);
_photo_l_downloadedprefixsize = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photo_l_downloadedPrefixSize")))));Debug.locals.put("photo_l_downloadedPrefixSize", _photo_l_downloadedprefixsize);Debug.locals.put("photo_l_downloadedPrefixSize", _photo_l_downloadedprefixsize);
 BA.debugLineNum = 242;BA.debugLine="Dim Chat_order As String = root.Get(\"Chat_order\")";
Debug.ShouldStop(131072);
_chat_order = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Chat_order")))));Debug.locals.put("Chat_order", _chat_order);Debug.locals.put("Chat_order", _chat_order);
 BA.debugLineNum = 245;BA.debugLine="Dim Item As Adap_chats";
Debug.ShouldStop(1048576);
_item = RemoteObject.createNew ("com.it.fome.ac_lchats._adap_chats");Debug.locals.put("Item", _item);
 BA.debugLineNum = 246;BA.debugLine="Item.chat_id=Chat_id";
Debug.ShouldStop(2097152);
_item.setField ("chat_id" /*RemoteObject*/ ,BA.numberCast(long.class, _chat_id));
 BA.debugLineNum = 247;BA.debugLine="Item.title=Chat_title";
Debug.ShouldStop(4194304);
_item.setField ("title" /*RemoteObject*/ ,_chat_title);
 BA.debugLineNum = 249;BA.debugLine="Item.chat_type=Chat_type";
Debug.ShouldStop(16777216);
_item.setField ("chat_type" /*RemoteObject*/ ,_chat_type);
 BA.debugLineNum = 250;BA.debugLine="Item.channel_info=channel_info";
Debug.ShouldStop(33554432);
_item.setField ("channel_info" /*RemoteObject*/ ,_channel_info);
 BA.debugLineNum = 258;BA.debugLine="Item.img_isdwonload=photo_l_isDownloadingComplete";
Debug.ShouldStop(2);
_item.setField ("img_isdwonload" /*RemoteObject*/ ,_photo_l_isdownloadingcompleted);
 BA.debugLineNum = 259;BA.debugLine="Item.img_id=photo_id";
Debug.ShouldStop(4);
_item.setField ("img_id" /*RemoteObject*/ ,_photo_id);
 BA.debugLineNum = 260;BA.debugLine="Item.img_remote=photo_r_id";
Debug.ShouldStop(8);
_item.setField ("img_remote" /*RemoteObject*/ ,_photo_r_id);
 BA.debugLineNum = 261;BA.debugLine="Item.img_my=photo_l_path";
Debug.ShouldStop(16);
_item.setField ("img_my" /*RemoteObject*/ ,_photo_l_path);
 BA.debugLineNum = 262;BA.debugLine="listchats.Add(Item)";
Debug.ShouldStop(32);
ac_tsearch.mostCurrent._listchats.runVoidMethod ("Add",(Object)((_item)));
 BA.debugLineNum = 263;BA.debugLine="showsearch(True)";
Debug.ShouldStop(64);
_showsearch(ac_tsearch.mostCurrent.__c.getField(true,"True"));
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
public static RemoteObject  _telegs_update_file(RemoteObject _respon) throws Exception{
try {
		Debug.PushSubsStack("telegs_update_file (ac_tsearch) ","ac_tsearch",12,ac_tsearch.mostCurrent.activityBA,ac_tsearch.mostCurrent,358);
if (RapidSub.canDelegate("telegs_update_file")) { return com.it.fome.ac_tsearch.remoteMe.runUserSub(false, "ac_tsearch","telegs_update_file", _respon);}
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
 BA.debugLineNum = 358;BA.debugLine="Sub telegs_update_file(respon As String)";
Debug.ShouldStop(32);
 BA.debugLineNum = 360;BA.debugLine="LogColor(respon,Colors.Blue)";
Debug.ShouldStop(128);
ac_tsearch.mostCurrent.__c.runVoidMethod ("LogImpl","615007746",_respon,ac_tsearch.mostCurrent.__c.getField(false,"Colors").getField(true,"Blue"));
 BA.debugLineNum = 361;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(256);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 362;BA.debugLine="parser.Initialize(respon)";
Debug.ShouldStop(512);
_parser.runVoidMethod ("Initialize",(Object)(_respon));
 BA.debugLineNum = 363;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(1024);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 364;BA.debugLine="Dim photof_remot_id As String = root.Get(\"photof_";
Debug.ShouldStop(2048);
_photof_remot_id = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photof_remot_id")))));Debug.locals.put("photof_remot_id", _photof_remot_id);Debug.locals.put("photof_remot_id", _photof_remot_id);
 BA.debugLineNum = 365;BA.debugLine="Dim photof_local_candownload As String = root.Get";
Debug.ShouldStop(4096);
_photof_local_candownload = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photof_local_candownload")))));Debug.locals.put("photof_local_candownload", _photof_local_candownload);Debug.locals.put("photof_local_candownload", _photof_local_candownload);
 BA.debugLineNum = 366;BA.debugLine="Dim photof_local_isdownload As String = root.Get(";
Debug.ShouldStop(8192);
_photof_local_isdownload = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photof_local_isdownload")))));Debug.locals.put("photof_local_isdownload", _photof_local_isdownload);Debug.locals.put("photof_local_isdownload", _photof_local_isdownload);
 BA.debugLineNum = 367;BA.debugLine="Dim photof_expectedSize As Int = root.Get(\"photof";
Debug.ShouldStop(16384);
_photof_expectedsize = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photof_expectedSize")))));Debug.locals.put("photof_expectedSize", _photof_expectedsize);Debug.locals.put("photof_expectedSize", _photof_expectedsize);
 BA.debugLineNum = 368;BA.debugLine="Dim photof_remot_uploadsize As Int = root.Get(\"ph";
Debug.ShouldStop(32768);
_photof_remot_uploadsize = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photof_remot_uploadsize")))));Debug.locals.put("photof_remot_uploadsize", _photof_remot_uploadsize);Debug.locals.put("photof_remot_uploadsize", _photof_remot_uploadsize);
 BA.debugLineNum = 369;BA.debugLine="Dim photof_size As Int = root.Get(\"photof_size\")";
Debug.ShouldStop(65536);
_photof_size = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photof_size")))));Debug.locals.put("photof_size", _photof_size);Debug.locals.put("photof_size", _photof_size);
 BA.debugLineNum = 370;BA.debugLine="Dim photof_remot_isuploadactive As String = root.";
Debug.ShouldStop(131072);
_photof_remot_isuploadactive = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photof_remot_isuploadactive")))));Debug.locals.put("photof_remot_isuploadactive", _photof_remot_isuploadactive);Debug.locals.put("photof_remot_isuploadactive", _photof_remot_isuploadactive);
 BA.debugLineNum = 371;BA.debugLine="Dim photof_local_perfexsize As Int = root.Get(\"ph";
Debug.ShouldStop(262144);
_photof_local_perfexsize = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photof_local_perfexsize")))));Debug.locals.put("photof_local_perfexsize", _photof_local_perfexsize);Debug.locals.put("photof_local_perfexsize", _photof_local_perfexsize);
 BA.debugLineNum = 372;BA.debugLine="Dim photof_remot_isuploadcomplit As String = root";
Debug.ShouldStop(524288);
_photof_remot_isuploadcomplit = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photof_remot_isuploadcomplit")))));Debug.locals.put("photof_remot_isuploadcomplit", _photof_remot_isuploadcomplit);Debug.locals.put("photof_remot_isuploadcomplit", _photof_remot_isuploadcomplit);
 BA.debugLineNum = 373;BA.debugLine="Dim photof_local_downloadsize As Int = root.Get(\"";
Debug.ShouldStop(1048576);
_photof_local_downloadsize = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photof_local_downloadsize")))));Debug.locals.put("photof_local_downloadsize", _photof_local_downloadsize);Debug.locals.put("photof_local_downloadsize", _photof_local_downloadsize);
 BA.debugLineNum = 374;BA.debugLine="Dim photof_local_canbedlelte As String = root.Get";
Debug.ShouldStop(2097152);
_photof_local_canbedlelte = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photof_local_canbedlelte")))));Debug.locals.put("photof_local_canbedlelte", _photof_local_canbedlelte);Debug.locals.put("photof_local_canbedlelte", _photof_local_canbedlelte);
 BA.debugLineNum = 375;BA.debugLine="Dim photof_id As Int = root.Get(\"photof_id\")";
Debug.ShouldStop(4194304);
_photof_id = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photof_id")))));Debug.locals.put("photof_id", _photof_id);Debug.locals.put("photof_id", _photof_id);
 BA.debugLineNum = 376;BA.debugLine="Dim photof_local_isdowloaded As String = root.Get";
Debug.ShouldStop(8388608);
_photof_local_isdowloaded = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photof_local_isdowloaded")))));Debug.locals.put("photof_local_isdowloaded", _photof_local_isdowloaded);Debug.locals.put("photof_local_isdowloaded", _photof_local_isdowloaded);
 BA.debugLineNum = 377;BA.debugLine="Dim photof_localpath As String = root.Get(\"photof";
Debug.ShouldStop(16777216);
_photof_localpath = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photof_localpath")))));Debug.locals.put("photof_localpath", _photof_localpath);Debug.locals.put("photof_localpath", _photof_localpath);
 BA.debugLineNum = 379;BA.debugLine="Log(\" isdowloaded \"&photof_local_isdowloaded&\" si";
Debug.ShouldStop(67108864);
ac_tsearch.mostCurrent.__c.runVoidMethod ("LogImpl","615007765",RemoteObject.concat(RemoteObject.createImmutable(" isdowloaded "),_photof_local_isdowloaded,RemoteObject.createImmutable(" size "),_photof_size,RemoteObject.createImmutable(" dl size : "),_photof_local_downloadsize,RemoteObject.createImmutable(" is download "),_photof_local_isdownload,RemoteObject.createImmutable(" can dl : "),_photof_local_candownload),0);
 BA.debugLineNum = 380;BA.debugLine="Log(\"p : \"&photof_localpath)";
Debug.ShouldStop(134217728);
ac_tsearch.mostCurrent.__c.runVoidMethod ("LogImpl","615007766",RemoteObject.concat(RemoteObject.createImmutable("p : "),_photof_localpath),0);
 BA.debugLineNum = 382;BA.debugLine="Try";
Debug.ShouldStop(536870912);
try { BA.debugLineNum = 383;BA.debugLine="If photof_local_isdowloaded=\"true\" Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_photof_local_isdowloaded,BA.ObjectToString("true"))) { 
 BA.debugLineNum = 384;BA.debugLine="For ss=0 To listchats.Size-1";
Debug.ShouldStop(-2147483648);
{
final int step23 = 1;
final int limit23 = RemoteObject.solve(new RemoteObject[] {ac_tsearch.mostCurrent._listchats.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_ss = 0 ;
for (;(step23 > 0 && _ss <= limit23) || (step23 < 0 && _ss >= limit23) ;_ss = ((int)(0 + _ss + step23))  ) {
Debug.locals.put("ss", _ss);
 BA.debugLineNum = 385;BA.debugLine="Dim Itema = listchats.Get(ss) As Adap_chats";
Debug.ShouldStop(1);
_itema = (ac_tsearch.mostCurrent._listchats.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _ss))));Debug.locals.put("Itema", _itema);Debug.locals.put("Itema", _itema);
 BA.debugLineNum = 386;BA.debugLine="If Itema.img_id=photof_id Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_itema.getField(true,"img_id" /*RemoteObject*/ ),BA.NumberToString(_photof_id))) { 
 BA.debugLineNum = 387;BA.debugLine="Log(ss&\" img id ready!\")";
Debug.ShouldStop(4);
ac_tsearch.mostCurrent.__c.runVoidMethod ("LogImpl","615007773",RemoteObject.concat(RemoteObject.createImmutable(_ss),RemoteObject.createImmutable(" img id ready!")),0);
 BA.debugLineNum = 389;BA.debugLine="Itema.img_my = photof_localpath";
Debug.ShouldStop(16);
_itema.setField ("img_my" /*RemoteObject*/ ,_photof_localpath);
 BA.debugLineNum = 390;BA.debugLine="Itema.img_isdwonload=photof_local_isdowloaded";
Debug.ShouldStop(32);
_itema.setField ("img_isdwonload" /*RemoteObject*/ ,_photof_local_isdowloaded);
 BA.debugLineNum = 391;BA.debugLine="Itema.img_remote=photof_remot_id";
Debug.ShouldStop(64);
_itema.setField ("img_remote" /*RemoteObject*/ ,_photof_remot_id);
 BA.debugLineNum = 392;BA.debugLine="Itema.img_id=photof_id";
Debug.ShouldStop(128);
_itema.setField ("img_id" /*RemoteObject*/ ,BA.NumberToString(_photof_id));
 BA.debugLineNum = 393;BA.debugLine="showsearch(True)";
Debug.ShouldStop(256);
_showsearch(ac_tsearch.mostCurrent.__c.getField(true,"True"));
 };
 }
}Debug.locals.put("ss", _ss);
;
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e36) {
			BA.rdebugUtils.runVoidMethod("setLastException",ac_tsearch.processBA, e36.toString()); BA.debugLineNum = 403;BA.debugLine="Log(LastException)";
Debug.ShouldStop(262144);
ac_tsearch.mostCurrent.__c.runVoidMethod ("LogImpl","615007789",BA.ObjectToString(ac_tsearch.mostCurrent.__c.runMethod(false,"LastException",ac_tsearch.mostCurrent.activityBA)),0);
 };
 BA.debugLineNum = 412;BA.debugLine="End Sub";
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