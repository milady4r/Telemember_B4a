package com.it.fome;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class ac_telelogin_subs_0 {


public static RemoteObject  _aa(RemoteObject _usernames,RemoteObject _userid,RemoteObject _first_last,RemoteObject _phone) throws Exception{
try {
		Debug.PushSubsStack("aa (ac_telelogin) ","ac_telelogin",2,ac_telelogin.mostCurrent.activityBA,ac_telelogin.mostCurrent,662);
if (RapidSub.canDelegate("aa")) { return com.it.fome.ac_telelogin.remoteMe.runUserSub(false, "ac_telelogin","aa", _usernames, _userid, _first_last, _phone);}
RemoteObject _prfn = RemoteObject.declareNull("com.reza.sh.fastnet.Fastnet");
RemoteObject _post = RemoteObject.declareNull("com.reza.sh.fastnet.PostRequestRaper");
Debug.locals.put("usernames", _usernames);
Debug.locals.put("userid", _userid);
Debug.locals.put("first_last", _first_last);
Debug.locals.put("phone", _phone);
 BA.debugLineNum = 662;BA.debugLine="Sub aa(usernames As String,userid As String,first_";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 663;BA.debugLine="Dim prfn As PersianFastNetwork";
Debug.ShouldStop(4194304);
_prfn = RemoteObject.createNew ("com.reza.sh.fastnet.Fastnet");Debug.locals.put("prfn", _prfn);
 BA.debugLineNum = 664;BA.debugLine="prfn.initialize(\"prfn\")";
Debug.ShouldStop(8388608);
_prfn.runVoidMethod ("initialize",ac_telelogin.processBA,(Object)(RemoteObject.createImmutable("prfn")));
 BA.debugLineNum = 665;BA.debugLine="Dim post As PostRequest";
Debug.ShouldStop(16777216);
_post = RemoteObject.createNew ("com.reza.sh.fastnet.PostRequestRaper");Debug.locals.put("post", _post);
 BA.debugLineNum = 666;BA.debugLine="post=prfn.BuildPostQuery(\"http://filework.ir/INST";
Debug.ShouldStop(33554432);
_post = _prfn.runMethod(false,"BuildPostQuery",(Object)(BA.ObjectToString("http://filework.ir/INSTAFOLLOW/api/req.php")),(Object)(RemoteObject.createImmutable("iuser")));Debug.locals.put("post", _post);
 BA.debugLineNum = 668;BA.debugLine="post.addHeder(\"User-Agent\",\"Dalvik/1.6.0 (Linux;";
Debug.ShouldStop(134217728);
_post.runVoidMethod ("addHeder",(Object)(BA.ObjectToString("User-Agent")),(Object)(RemoteObject.createImmutable("Dalvik/1.6.0 (Linux; U; Android 4.4.4; SM-A700FD Build/KTU84P)")));
 BA.debugLineNum = 669;BA.debugLine="post.addParametrs(\"req\",\"tuser\")";
Debug.ShouldStop(268435456);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("req")),(Object)(RemoteObject.createImmutable("tuser")));
 BA.debugLineNum = 671;BA.debugLine="post.addParametrs(\"username\",usernames)";
Debug.ShouldStop(1073741824);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("username")),(Object)(_usernames));
 BA.debugLineNum = 672;BA.debugLine="post.addParametrs(\"userid\",userid)";
Debug.ShouldStop(-2147483648);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("userid")),(Object)(_userid));
 BA.debugLineNum = 673;BA.debugLine="post.addParametrs(\"first_last\",first_last)";
Debug.ShouldStop(1);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("first_last")),(Object)(_first_last));
 BA.debugLineNum = 674;BA.debugLine="post.addParametrs(\"phone\",phone)";
Debug.ShouldStop(2);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("phone")),(Object)(_phone));
 BA.debugLineNum = 675;BA.debugLine="post.addParametrs(\"token\",\"test\")";
Debug.ShouldStop(4);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("token")),(Object)(RemoteObject.createImmutable("test")));
 BA.debugLineNum = 679;BA.debugLine="post.executRequestAsString";
Debug.ShouldStop(64);
_post.runVoidMethod ("executRequestAsString");
 BA.debugLineNum = 684;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (ac_telelogin) ","ac_telelogin",2,ac_telelogin.mostCurrent.activityBA,ac_telelogin.mostCurrent,48);
if (RapidSub.canDelegate("activity_create")) { return com.it.fome.ac_telelogin.remoteMe.runUserSub(false, "ac_telelogin","activity_create", _firsttime);}
RemoteObject _m = null;
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _pnl_tolbar = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _cd = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
RemoteObject _ac = RemoteObject.declareNull("de.amberhome.objects.appcompat.AppCompatBase");
RemoteObject _pnl_prox = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _bg = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
RemoteObject _btn_addproxy = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
RemoteObject _btn_cancell = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
RemoteObject _btn_shabake = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 48;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 50;BA.debugLine="Try";
Debug.ShouldStop(131072);
try { BA.debugLineNum = 56;BA.debugLine="telegs.Initialize(\"telegs\")";
Debug.ShouldStop(8388608);
ac_telelogin.mostCurrent._telegs.runVoidMethod ("Initialize",ac_telelogin.processBA,(Object)(RemoteObject.createImmutable("telegs")));
 BA.debugLineNum = 60;BA.debugLine="telegs.accname=\"milad\"";
Debug.ShouldStop(134217728);
ac_telelogin.mostCurrent._telegs.setField ("accname",BA.ObjectToString("milad"));
 BA.debugLineNum = 61;BA.debugLine="Dim m(2) As String";
Debug.ShouldStop(268435456);
_m = RemoteObject.createNewArray ("String", new int[] {2}, new Object[]{});Debug.locals.put("m", _m);
 BA.debugLineNum = 62;BA.debugLine="m(0)=\"run\"";
Debug.ShouldStop(536870912);
_m.setArrayElement (BA.ObjectToString("run"),BA.numberCast(int.class, 0));
 BA.debugLineNum = 63;BA.debugLine="telegs.main(m)";
Debug.ShouldStop(1073741824);
ac_telelogin.mostCurrent._telegs.runVoidMethod ("main",(Object)(_m));
 BA.debugLineNum = 64;BA.debugLine="userid_t.Initialize";
Debug.ShouldStop(-2147483648);
ac_telelogin.mostCurrent._userid_t.runVoidMethod ("Initialize");
 BA.debugLineNum = 65;BA.debugLine="username_t.Initialize";
Debug.ShouldStop(1);
ac_telelogin.mostCurrent._username_t.runVoidMethod ("Initialize");
 BA.debugLineNum = 71;BA.debugLine="If File.Exists(File.DirInternal,\"instadb.db\")=Fa";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",ac_telelogin.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(ac_telelogin.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("instadb.db"))),ac_telelogin.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 72;BA.debugLine="File.Copy(File.DirAssets,\"instadb.db\",File.DirI";
Debug.ShouldStop(128);
ac_telelogin.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(ac_telelogin.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("instadb.db")),(Object)(ac_telelogin.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("instadb.db")));
 };
 BA.debugLineNum = 74;BA.debugLine="If sql1.IsInitialized=False Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",ac_telelogin._sql1.runMethod(true,"IsInitialized"),ac_telelogin.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 75;BA.debugLine="sql1.Initialize(File.DirInternal,\"instadb.db\",F";
Debug.ShouldStop(1024);
ac_telelogin._sql1.runVoidMethod ("Initialize",(Object)(ac_telelogin.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("instadb.db")),(Object)(ac_telelogin.mostCurrent.__c.getField(true,"False")));
 };
 BA.debugLineNum = 79;BA.debugLine="cursor1 = sql1.ExecQuery(\"SELECT * FROM tbl_tele";
Debug.ShouldStop(16384);
ac_telelogin._cursor1.setObject(ac_telelogin._sql1.runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT * FROM tbl_tele WHERE soich='1'"))));
 BA.debugLineNum = 80;BA.debugLine="Dim i As Int";
Debug.ShouldStop(32768);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 81;BA.debugLine="For i=0 To cursor1.RowCount-1";
Debug.ShouldStop(65536);
{
final int step17 = 1;
final int limit17 = RemoteObject.solve(new RemoteObject[] {ac_telelogin._cursor1.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step17 > 0 && _i.<Integer>get().intValue() <= limit17) || (step17 < 0 && _i.<Integer>get().intValue() >= limit17) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step17))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 82;BA.debugLine="cursor1.Position=i";
Debug.ShouldStop(131072);
ac_telelogin._cursor1.runMethod(true,"setPosition",_i);
 BA.debugLineNum = 83;BA.debugLine="userid_t.Add(cursor1.GetString(\"userid\"))";
Debug.ShouldStop(262144);
ac_telelogin.mostCurrent._userid_t.runVoidMethod ("Add",(Object)((ac_telelogin._cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("userid"))))));
 BA.debugLineNum = 84;BA.debugLine="username_t.Add(cursor1.GetString(\"username\"))";
Debug.ShouldStop(524288);
ac_telelogin.mostCurrent._username_t.runVoidMethod ("Add",(Object)((ac_telelogin._cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("username"))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 86;BA.debugLine="cursor1.Close";
Debug.ShouldStop(2097152);
ac_telelogin._cursor1.runVoidMethod ("Close");
 BA.debugLineNum = 89;BA.debugLine="If userid_t.Size>0 Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean(">",ac_telelogin.mostCurrent._userid_t.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 90;BA.debugLine="StartActivity(ac_tselect)";
Debug.ShouldStop(33554432);
ac_telelogin.mostCurrent.__c.runVoidMethod ("StartActivity",ac_telelogin.processBA,(Object)((ac_telelogin.mostCurrent._ac_tselect.getObject())));
 BA.debugLineNum = 91;BA.debugLine="Activity.Finish";
Debug.ShouldStop(67108864);
ac_telelogin.mostCurrent._activity.runVoidMethod ("Finish");
 };
 BA.debugLineNum = 96;BA.debugLine="Dim pnl_tolbar As Panel";
Debug.ShouldStop(-2147483648);
_pnl_tolbar = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("pnl_tolbar", _pnl_tolbar);
 BA.debugLineNum = 97;BA.debugLine="pnl_tolbar.Initialize(\"\")";
Debug.ShouldStop(1);
_pnl_tolbar.runVoidMethod ("Initialize",ac_telelogin.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 98;BA.debugLine="pnl_tolbar.Color=0xFF008AFF";
Debug.ShouldStop(2);
_pnl_tolbar.runVoidMethod ("setColor",BA.numberCast(int.class, 0xff008aff));
 BA.debugLineNum = 99;BA.debugLine="Activity.AddView(pnl_tolbar,0,0,100%x,13%X)";
Debug.ShouldStop(4);
ac_telelogin.mostCurrent._activity.runVoidMethod ("AddView",(Object)((_pnl_tolbar.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(ac_telelogin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),ac_telelogin.mostCurrent.activityBA)),(Object)(ac_telelogin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 13)),ac_telelogin.mostCurrent.activityBA)));
 BA.debugLineNum = 102;BA.debugLine="Dim cd As ColorDrawable";
Debug.ShouldStop(32);
_cd = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("cd", _cd);
 BA.debugLineNum = 103;BA.debugLine="cd.Initialize(0xFF4379F2,0)";
Debug.ShouldStop(64);
_cd.runVoidMethod ("Initialize",(Object)(BA.numberCast(int.class, 0xff4379f2)),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 105;BA.debugLine="lbl_neme.Initialize(\"\")";
Debug.ShouldStop(256);
ac_telelogin.mostCurrent._lbl_neme.runVoidMethod ("Initialize",ac_telelogin.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 106;BA.debugLine="lbl_neme.Text=\"شماره تلفن شما\"";
Debug.ShouldStop(512);
ac_telelogin.mostCurrent._lbl_neme.runMethod(true,"setText",BA.ObjectToCharSequence("شماره تلفن شما"));
 BA.debugLineNum = 107;BA.debugLine="lbl_neme.TextColor=Colors.White";
Debug.ShouldStop(1024);
ac_telelogin.mostCurrent._lbl_neme.runMethod(true,"setTextColor",ac_telelogin.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 108;BA.debugLine="lbl_neme.TextSize=19";
Debug.ShouldStop(2048);
ac_telelogin.mostCurrent._lbl_neme.runMethod(true,"setTextSize",BA.numberCast(float.class, 19));
 BA.debugLineNum = 109;BA.debugLine="lbl_neme.Gravity=Gravity.LEFT+Gravity.CENTER_VER";
Debug.ShouldStop(4096);
ac_telelogin.mostCurrent._lbl_neme.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {ac_telelogin.mostCurrent.__c.getField(false,"Gravity").getField(true,"LEFT"),ac_telelogin.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")}, "+",1, 1));
 BA.debugLineNum = 110;BA.debugLine="pnl_tolbar.AddView(lbl_neme,5%x,0,50%x,pnl_tolba";
Debug.ShouldStop(8192);
_pnl_tolbar.runVoidMethod ("AddView",(Object)((ac_telelogin.mostCurrent._lbl_neme.getObject())),(Object)(ac_telelogin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),ac_telelogin.mostCurrent.activityBA)),(Object)(BA.numberCast(int.class, 0)),(Object)(ac_telelogin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 50)),ac_telelogin.mostCurrent.activityBA)),(Object)(_pnl_tolbar.runMethod(true,"getHeight")));
 BA.debugLineNum = 112;BA.debugLine="login.Initialize(\"login\")";
Debug.ShouldStop(32768);
ac_telelogin.mostCurrent._login.runVoidMethod ("Initialize",ac_telelogin.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("login")));
 BA.debugLineNum = 113;BA.debugLine="login.Typeface=Typeface.MATERIALICONS";
Debug.ShouldStop(65536);
ac_telelogin.mostCurrent._login.runMethod(false,"setTypeface",ac_telelogin.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"getMATERIALICONS"));
 BA.debugLineNum = 114;BA.debugLine="login.Text=Chr(0xE5CA)";
Debug.ShouldStop(131072);
ac_telelogin.mostCurrent._login.runMethod(true,"setText",BA.ObjectToCharSequence(ac_telelogin.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xe5ca)))));
 BA.debugLineNum = 115;BA.debugLine="login.TextSize=30";
Debug.ShouldStop(262144);
ac_telelogin.mostCurrent._login.runMethod(true,"setTextSize",BA.numberCast(float.class, 30));
 BA.debugLineNum = 116;BA.debugLine="login.TextColor=Colors.White";
Debug.ShouldStop(524288);
ac_telelogin.mostCurrent._login.runMethod(true,"setTextColor",ac_telelogin.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 117;BA.debugLine="login.Background=cd";
Debug.ShouldStop(1048576);
ac_telelogin.mostCurrent._login.runMethod(false,"setBackground",(_cd.getObject()));
 BA.debugLineNum = 118;BA.debugLine="login.Gravity=Gravity.CENTER_HORIZONTAL+Gravity.";
Debug.ShouldStop(2097152);
ac_telelogin.mostCurrent._login.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {ac_telelogin.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL"),ac_telelogin.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")}, "+",1, 1));
 BA.debugLineNum = 119;BA.debugLine="pnl_tolbar.AddView(login,100%x-15%x,0dip,15%x,pn";
Debug.ShouldStop(4194304);
_pnl_tolbar.runVoidMethod ("AddView",(Object)((ac_telelogin.mostCurrent._login.getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {ac_telelogin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),ac_telelogin.mostCurrent.activityBA),ac_telelogin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),ac_telelogin.mostCurrent.activityBA)}, "-",1, 1)),(Object)(ac_telelogin.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(ac_telelogin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),ac_telelogin.mostCurrent.activityBA)),(Object)(_pnl_tolbar.runMethod(true,"getHeight")));
 BA.debugLineNum = 120;BA.debugLine="Dim ac As AppCompat";
Debug.ShouldStop(8388608);
_ac = RemoteObject.createNew ("de.amberhome.objects.appcompat.AppCompatBase");Debug.locals.put("ac", _ac);
 BA.debugLineNum = 121;BA.debugLine="ac.SetClickEffect(login,True)";
Debug.ShouldStop(16777216);
_ac.runVoidMethod ("SetClickEffect",ac_telelogin.mostCurrent.activityBA,(Object)((ac_telelogin.mostCurrent._login.getObject())),(Object)(ac_telelogin.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 122;BA.debugLine="Activity.Color=Colors.White";
Debug.ShouldStop(33554432);
ac_telelogin.mostCurrent._activity.runVoidMethod ("setColor",ac_telelogin.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 124;BA.debugLine="p.Initialize(\"p\")";
Debug.ShouldStop(134217728);
ac_telelogin.mostCurrent._p.runVoidMethod ("Initialize",ac_telelogin.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("p")));
 BA.debugLineNum = 125;BA.debugLine="p.Color=Colors.White";
Debug.ShouldStop(268435456);
ac_telelogin.mostCurrent._p.runVoidMethod ("setColor",ac_telelogin.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 126;BA.debugLine="Activity.AddView(p,0,pnl_tolbar.Height,100%x,100";
Debug.ShouldStop(536870912);
ac_telelogin.mostCurrent._activity.runVoidMethod ("AddView",(Object)((ac_telelogin.mostCurrent._p.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(_pnl_tolbar.runMethod(true,"getHeight")),(Object)(ac_telelogin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),ac_telelogin.mostCurrent.activityBA)),(Object)(RemoteObject.solve(new RemoteObject[] {ac_telelogin.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),ac_telelogin.mostCurrent.activityBA),_pnl_tolbar.runMethod(true,"getHeight")}, "-",1, 1)));
 BA.debugLineNum = 128;BA.debugLine="edit_pish.Initialize(\"edit_pish\")";
Debug.ShouldStop(-2147483648);
ac_telelogin.mostCurrent._edit_pish.runVoidMethod ("Initialize",ac_telelogin.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("edit_pish")));
 BA.debugLineNum = 129;BA.debugLine="edit_pish.Text=\"+98\"";
Debug.ShouldStop(1);
ac_telelogin.mostCurrent._edit_pish.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("+98"));
 BA.debugLineNum = 130;BA.debugLine="edit_pish.InputType=edit_pish.INPUT_TYPE_NUMBERS";
Debug.ShouldStop(2);
ac_telelogin.mostCurrent._edit_pish.runMethod(true,"setInputType",ac_telelogin.mostCurrent._edit_pish.getField(true,"INPUT_TYPE_NUMBERS"));
 BA.debugLineNum = 132;BA.debugLine="p.AddView(edit_pish,5%x,5%x,15%x,12%x)";
Debug.ShouldStop(8);
ac_telelogin.mostCurrent._p.runVoidMethod ("AddView",(Object)((ac_telelogin.mostCurrent._edit_pish.getObject())),(Object)(ac_telelogin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),ac_telelogin.mostCurrent.activityBA)),(Object)(ac_telelogin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),ac_telelogin.mostCurrent.activityBA)),(Object)(ac_telelogin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),ac_telelogin.mostCurrent.activityBA)),(Object)(ac_telelogin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 12)),ac_telelogin.mostCurrent.activityBA)));
 BA.debugLineNum = 134;BA.debugLine="edit_number.Initialize(\"edit_number\")";
Debug.ShouldStop(32);
ac_telelogin.mostCurrent._edit_number.runVoidMethod ("Initialize",ac_telelogin.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("edit_number")));
 BA.debugLineNum = 135;BA.debugLine="edit_number.InputType=edit_number.INPUT_TYPE_NUM";
Debug.ShouldStop(64);
ac_telelogin.mostCurrent._edit_number.runMethod(true,"setInputType",ac_telelogin.mostCurrent._edit_number.getField(true,"INPUT_TYPE_NUMBERS"));
 BA.debugLineNum = 136;BA.debugLine="edit_number.Hint=\"__ __ __  __ __ __  __ __  __";
Debug.ShouldStop(128);
ac_telelogin.mostCurrent._edit_number.runMethod(true,"setHint",BA.ObjectToString("__ __ __  __ __ __  __ __  __ __"));
 BA.debugLineNum = 138;BA.debugLine="p.AddView(edit_number,22%x,5%x,100%x-25%x,12%x)";
Debug.ShouldStop(512);
ac_telelogin.mostCurrent._p.runVoidMethod ("AddView",(Object)((ac_telelogin.mostCurrent._edit_number.getObject())),(Object)(ac_telelogin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 22)),ac_telelogin.mostCurrent.activityBA)),(Object)(ac_telelogin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),ac_telelogin.mostCurrent.activityBA)),(Object)(RemoteObject.solve(new RemoteObject[] {ac_telelogin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),ac_telelogin.mostCurrent.activityBA),ac_telelogin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 25)),ac_telelogin.mostCurrent.activityBA)}, "-",1, 1)),(Object)(ac_telelogin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 12)),ac_telelogin.mostCurrent.activityBA)));
 BA.debugLineNum = 140;BA.debugLine="btn_code.Initialize(\"btn_code\")";
Debug.ShouldStop(2048);
ac_telelogin.mostCurrent._btn_code.runVoidMethod ("Initialize",ac_telelogin.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("btn_code")));
 BA.debugLineNum = 141;BA.debugLine="btn_code.Typeface=Typeface.MATERIALICONS";
Debug.ShouldStop(4096);
ac_telelogin.mostCurrent._btn_code.runMethod(false,"setTypeface",ac_telelogin.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"getMATERIALICONS"));
 BA.debugLineNum = 142;BA.debugLine="btn_code.Text=Chr(0xE5CA)";
Debug.ShouldStop(8192);
ac_telelogin.mostCurrent._btn_code.runMethod(true,"setText",BA.ObjectToCharSequence(ac_telelogin.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xe5ca)))));
 BA.debugLineNum = 143;BA.debugLine="btn_code.Visible=False";
Debug.ShouldStop(16384);
ac_telelogin.mostCurrent._btn_code.runMethod(true,"setVisible",ac_telelogin.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 144;BA.debugLine="btn_code.TextSize=28";
Debug.ShouldStop(32768);
ac_telelogin.mostCurrent._btn_code.runMethod(true,"setTextSize",BA.numberCast(float.class, 28));
 BA.debugLineNum = 145;BA.debugLine="btn_code.TextColor=Colors.White";
Debug.ShouldStop(65536);
ac_telelogin.mostCurrent._btn_code.runMethod(true,"setTextColor",ac_telelogin.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 146;BA.debugLine="btn_code.Background=cd";
Debug.ShouldStop(131072);
ac_telelogin.mostCurrent._btn_code.runMethod(false,"setBackground",(_cd.getObject()));
 BA.debugLineNum = 147;BA.debugLine="btn_code.Gravity=Gravity.CENTER_HORIZONTAL+Gravi";
Debug.ShouldStop(262144);
ac_telelogin.mostCurrent._btn_code.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {ac_telelogin.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL"),ac_telelogin.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")}, "+",1, 1));
 BA.debugLineNum = 148;BA.debugLine="pnl_tolbar.AddView(btn_code,100%x-15%x,0,15%x,pn";
Debug.ShouldStop(524288);
_pnl_tolbar.runVoidMethod ("AddView",(Object)((ac_telelogin.mostCurrent._btn_code.getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {ac_telelogin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),ac_telelogin.mostCurrent.activityBA),ac_telelogin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),ac_telelogin.mostCurrent.activityBA)}, "-",1, 1)),(Object)(BA.numberCast(int.class, 0)),(Object)(ac_telelogin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),ac_telelogin.mostCurrent.activityBA)),(Object)(_pnl_tolbar.runMethod(true,"getHeight")));
 BA.debugLineNum = 150;BA.debugLine="edit_code.Initialize(\"edit_code\")";
Debug.ShouldStop(2097152);
ac_telelogin.mostCurrent._edit_code.runVoidMethod ("Initialize",ac_telelogin.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("edit_code")));
 BA.debugLineNum = 151;BA.debugLine="edit_code.Visible=False";
Debug.ShouldStop(4194304);
ac_telelogin.mostCurrent._edit_code.runMethod(true,"setVisible",ac_telelogin.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 152;BA.debugLine="edit_code.InputType=edit_code.INPUT_TYPE_NUMBERS";
Debug.ShouldStop(8388608);
ac_telelogin.mostCurrent._edit_code.runMethod(true,"setInputType",ac_telelogin.mostCurrent._edit_code.getField(true,"INPUT_TYPE_NUMBERS"));
 BA.debugLineNum = 153;BA.debugLine="edit_code.Hint=\"کد\"";
Debug.ShouldStop(16777216);
ac_telelogin.mostCurrent._edit_code.runMethod(true,"setHint",BA.ObjectToString("کد"));
 BA.debugLineNum = 156;BA.debugLine="p.AddView(edit_code,22%x,5%x,100%x-25%x,12%x)";
Debug.ShouldStop(134217728);
ac_telelogin.mostCurrent._p.runVoidMethod ("AddView",(Object)((ac_telelogin.mostCurrent._edit_code.getObject())),(Object)(ac_telelogin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 22)),ac_telelogin.mostCurrent.activityBA)),(Object)(ac_telelogin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),ac_telelogin.mostCurrent.activityBA)),(Object)(RemoteObject.solve(new RemoteObject[] {ac_telelogin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),ac_telelogin.mostCurrent.activityBA),ac_telelogin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 25)),ac_telelogin.mostCurrent.activityBA)}, "-",1, 1)),(Object)(ac_telelogin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 12)),ac_telelogin.mostCurrent.activityBA)));
 BA.debugLineNum = 157;BA.debugLine="edit_pass.Initialize(\"edit_pass\")";
Debug.ShouldStop(268435456);
ac_telelogin.mostCurrent._edit_pass.runVoidMethod ("Initialize",ac_telelogin.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("edit_pass")));
 BA.debugLineNum = 158;BA.debugLine="edit_pass.InputType=edit_pass.INPUT_TYPE_TEXT";
Debug.ShouldStop(536870912);
ac_telelogin.mostCurrent._edit_pass.runMethod(true,"setInputType",ac_telelogin.mostCurrent._edit_pass.getField(true,"INPUT_TYPE_TEXT"));
 BA.debugLineNum = 159;BA.debugLine="edit_pass.Hint=\"گذرواژه\"";
Debug.ShouldStop(1073741824);
ac_telelogin.mostCurrent._edit_pass.runMethod(true,"setHint",BA.ObjectToString("گذرواژه"));
 BA.debugLineNum = 160;BA.debugLine="edit_pass.HintColor=Colors.DarkGray";
Debug.ShouldStop(-2147483648);
ac_telelogin.mostCurrent._edit_pass.runMethod(true,"setHintColor",ac_telelogin.mostCurrent.__c.getField(false,"Colors").getField(true,"DarkGray"));
 BA.debugLineNum = 161;BA.debugLine="edit_pass.Visible=False";
Debug.ShouldStop(1);
ac_telelogin.mostCurrent._edit_pass.runMethod(true,"setVisible",ac_telelogin.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 163;BA.debugLine="p.AddView(edit_pass,22%x,5%x,100%x-25%x,12%x)";
Debug.ShouldStop(4);
ac_telelogin.mostCurrent._p.runVoidMethod ("AddView",(Object)((ac_telelogin.mostCurrent._edit_pass.getObject())),(Object)(ac_telelogin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 22)),ac_telelogin.mostCurrent.activityBA)),(Object)(ac_telelogin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),ac_telelogin.mostCurrent.activityBA)),(Object)(RemoteObject.solve(new RemoteObject[] {ac_telelogin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),ac_telelogin.mostCurrent.activityBA),ac_telelogin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 25)),ac_telelogin.mostCurrent.activityBA)}, "-",1, 1)),(Object)(ac_telelogin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 12)),ac_telelogin.mostCurrent.activityBA)));
 BA.debugLineNum = 165;BA.debugLine="btn_pass.Initialize(\"btn_pass\")";
Debug.ShouldStop(16);
ac_telelogin.mostCurrent._btn_pass.runVoidMethod ("Initialize",ac_telelogin.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("btn_pass")));
 BA.debugLineNum = 167;BA.debugLine="btn_pass.Typeface=Typeface.MATERIALICONS";
Debug.ShouldStop(64);
ac_telelogin.mostCurrent._btn_pass.runMethod(false,"setTypeface",ac_telelogin.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"getMATERIALICONS"));
 BA.debugLineNum = 168;BA.debugLine="btn_pass.Text=Chr(0xE5CA)";
Debug.ShouldStop(128);
ac_telelogin.mostCurrent._btn_pass.runMethod(true,"setText",BA.ObjectToCharSequence(ac_telelogin.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xe5ca)))));
 BA.debugLineNum = 169;BA.debugLine="btn_pass.Visible=False";
Debug.ShouldStop(256);
ac_telelogin.mostCurrent._btn_pass.runMethod(true,"setVisible",ac_telelogin.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 170;BA.debugLine="btn_pass.TextColor=Colors.White";
Debug.ShouldStop(512);
ac_telelogin.mostCurrent._btn_pass.runMethod(true,"setTextColor",ac_telelogin.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 171;BA.debugLine="btn_pass.Background=cd";
Debug.ShouldStop(1024);
ac_telelogin.mostCurrent._btn_pass.runMethod(false,"setBackground",(_cd.getObject()));
 BA.debugLineNum = 172;BA.debugLine="btn_pass.TextSize=28";
Debug.ShouldStop(2048);
ac_telelogin.mostCurrent._btn_pass.runMethod(true,"setTextSize",BA.numberCast(float.class, 28));
 BA.debugLineNum = 173;BA.debugLine="btn_pass.Gravity=Gravity.CENTER_HORIZONTAL+Gravi";
Debug.ShouldStop(4096);
ac_telelogin.mostCurrent._btn_pass.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {ac_telelogin.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL"),ac_telelogin.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")}, "+",1, 1));
 BA.debugLineNum = 174;BA.debugLine="pnl_tolbar.AddView(btn_pass,100%x-15%x,0,15%x,pn";
Debug.ShouldStop(8192);
_pnl_tolbar.runVoidMethod ("AddView",(Object)((ac_telelogin.mostCurrent._btn_pass.getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {ac_telelogin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),ac_telelogin.mostCurrent.activityBA),ac_telelogin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),ac_telelogin.mostCurrent.activityBA)}, "-",1, 1)),(Object)(BA.numberCast(int.class, 0)),(Object)(ac_telelogin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),ac_telelogin.mostCurrent.activityBA)),(Object)(_pnl_tolbar.runMethod(true,"getHeight")));
 BA.debugLineNum = 176;BA.debugLine="lbl_st.Initialize(\"\")";
Debug.ShouldStop(32768);
ac_telelogin.mostCurrent._lbl_st.runVoidMethod ("Initialize",ac_telelogin.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 177;BA.debugLine="lbl_st.Text=\"لطفا شماره تلفنتون رو وارد کنید\"";
Debug.ShouldStop(65536);
ac_telelogin.mostCurrent._lbl_st.runMethod(true,"setText",BA.ObjectToCharSequence("لطفا شماره تلفنتون رو وارد کنید"));
 BA.debugLineNum = 178;BA.debugLine="lbl_st.TextColor=Colors.DarkGray";
Debug.ShouldStop(131072);
ac_telelogin.mostCurrent._lbl_st.runMethod(true,"setTextColor",ac_telelogin.mostCurrent.__c.getField(false,"Colors").getField(true,"DarkGray"));
 BA.debugLineNum = 179;BA.debugLine="lbl_st.TextSize=14";
Debug.ShouldStop(262144);
ac_telelogin.mostCurrent._lbl_st.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 180;BA.debugLine="p.AddView(lbl_st,5%x,edit_code.Top+edit_code.Hei";
Debug.ShouldStop(524288);
ac_telelogin.mostCurrent._p.runVoidMethod ("AddView",(Object)((ac_telelogin.mostCurrent._lbl_st.getObject())),(Object)(ac_telelogin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),ac_telelogin.mostCurrent.activityBA)),(Object)(RemoteObject.solve(new RemoteObject[] {ac_telelogin.mostCurrent._edit_code.runMethod(true,"getTop"),ac_telelogin.mostCurrent._edit_code.runMethod(true,"getHeight"),ac_telelogin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 7)),ac_telelogin.mostCurrent.activityBA)}, "++",2, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {ac_telelogin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),ac_telelogin.mostCurrent.activityBA),ac_telelogin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),ac_telelogin.mostCurrent.activityBA)}, "-",1, 1)),(Object)(ac_telelogin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),ac_telelogin.mostCurrent.activityBA)));
 BA.debugLineNum = 181;BA.debugLine="p.Height=lbl_st.Top+lbl_st.Height+5%x";
Debug.ShouldStop(1048576);
ac_telelogin.mostCurrent._p.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {ac_telelogin.mostCurrent._lbl_st.runMethod(true,"getTop"),ac_telelogin.mostCurrent._lbl_st.runMethod(true,"getHeight"),ac_telelogin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),ac_telelogin.mostCurrent.activityBA)}, "++",2, 1));
 BA.debugLineNum = 183;BA.debugLine="Dim pnl_prox As Panel";
Debug.ShouldStop(4194304);
_pnl_prox = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("pnl_prox", _pnl_prox);
 BA.debugLineNum = 184;BA.debugLine="pnl_prox.Initialize(\"pnl_prox\")";
Debug.ShouldStop(8388608);
_pnl_prox.runVoidMethod ("Initialize",ac_telelogin.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("pnl_prox")));
 BA.debugLineNum = 185;BA.debugLine="pnl_prox.Color=0xFFD9D9D9";
Debug.ShouldStop(16777216);
_pnl_prox.runVoidMethod ("setColor",BA.numberCast(int.class, 0xffd9d9d9));
 BA.debugLineNum = 187;BA.debugLine="Activity.AddView(pnl_prox,0,p.Top+p.Height+5%x,1";
Debug.ShouldStop(67108864);
ac_telelogin.mostCurrent._activity.runVoidMethod ("AddView",(Object)((_pnl_prox.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {ac_telelogin.mostCurrent._p.runMethod(true,"getTop"),ac_telelogin.mostCurrent._p.runMethod(true,"getHeight"),ac_telelogin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),ac_telelogin.mostCurrent.activityBA)}, "++",2, 1)),(Object)(ac_telelogin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),ac_telelogin.mostCurrent.activityBA)),(Object)(ac_telelogin.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),ac_telelogin.mostCurrent.activityBA)));
 BA.debugLineNum = 189;BA.debugLine="Dim bg As ColorDrawable";
Debug.ShouldStop(268435456);
_bg = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("bg", _bg);
 BA.debugLineNum = 190;BA.debugLine="bg.Initialize2(Colors.Transparent,5dip,2dip,Colo";
Debug.ShouldStop(536870912);
_bg.runVoidMethod ("Initialize2",(Object)(ac_telelogin.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent")),(Object)(ac_telelogin.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))),(Object)(ac_telelogin.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))),(Object)(ac_telelogin.mostCurrent.__c.getField(false,"Colors").getField(true,"White")));
 BA.debugLineNum = 191;BA.debugLine="Dim btn_addproxy As Button";
Debug.ShouldStop(1073741824);
_btn_addproxy = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");Debug.locals.put("btn_addproxy", _btn_addproxy);
 BA.debugLineNum = 192;BA.debugLine="btn_addproxy.Initialize(\"btn_addproxy\")";
Debug.ShouldStop(-2147483648);
_btn_addproxy.runVoidMethod ("Initialize",ac_telelogin.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("btn_addproxy")));
 BA.debugLineNum = 193;BA.debugLine="btn_addproxy.Typeface=Typeface.LoadFromAssets(\"i";
Debug.ShouldStop(1);
_btn_addproxy.runMethod(false,"setTypeface",ac_telelogin.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("iran_sans.ttf"))));
 BA.debugLineNum = 194;BA.debugLine="btn_addproxy.Text=\"اتصال به پروکسی\"";
Debug.ShouldStop(2);
_btn_addproxy.runMethod(true,"setText",BA.ObjectToCharSequence("اتصال به پروکسی"));
 BA.debugLineNum = 195;BA.debugLine="btn_addproxy.TextColor=Colors.White";
Debug.ShouldStop(4);
_btn_addproxy.runMethod(true,"setTextColor",ac_telelogin.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 196;BA.debugLine="btn_addproxy.Background=bg";
Debug.ShouldStop(8);
_btn_addproxy.runMethod(false,"setBackground",(_bg.getObject()));
 BA.debugLineNum = 197;BA.debugLine="btn_addproxy.TextSize=12";
Debug.ShouldStop(16);
_btn_addproxy.runMethod(true,"setTextSize",BA.numberCast(float.class, 12));
 BA.debugLineNum = 198;BA.debugLine="btn_addproxy.Gravity=Gravity.CENTER_HORIZONTAL+G";
Debug.ShouldStop(32);
_btn_addproxy.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {ac_telelogin.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL"),ac_telelogin.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")}, "+",1, 1));
 BA.debugLineNum = 199;BA.debugLine="pnl_prox.AddView(btn_addproxy,5%x,2%x,pnl_prox.W";
Debug.ShouldStop(64);
_pnl_prox.runVoidMethod ("AddView",(Object)((_btn_addproxy.getObject())),(Object)(ac_telelogin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),ac_telelogin.mostCurrent.activityBA)),(Object)(ac_telelogin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),ac_telelogin.mostCurrent.activityBA)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_pnl_prox.runMethod(true,"getWidth"),RemoteObject.createImmutable(2),ac_telelogin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),ac_telelogin.mostCurrent.activityBA)}, "/-",1, 0))),(Object)(RemoteObject.solve(new RemoteObject[] {_pnl_prox.runMethod(true,"getHeight"),ac_telelogin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 4)),ac_telelogin.mostCurrent.activityBA)}, "-",1, 1)));
 BA.debugLineNum = 201;BA.debugLine="Dim btn_cancell As Button";
Debug.ShouldStop(256);
_btn_cancell = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");Debug.locals.put("btn_cancell", _btn_cancell);
 BA.debugLineNum = 202;BA.debugLine="btn_cancell.Initialize(\"btn_cancell\")";
Debug.ShouldStop(512);
_btn_cancell.runVoidMethod ("Initialize",ac_telelogin.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("btn_cancell")));
 BA.debugLineNum = 203;BA.debugLine="btn_cancell.Typeface=Typeface.LoadFromAssets(\"ir";
Debug.ShouldStop(1024);
_btn_cancell.runMethod(false,"setTypeface",ac_telelogin.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("iran_sans.ttf"))));
 BA.debugLineNum = 204;BA.debugLine="btn_cancell.Text=\"اتصال به شبکه گوشی\"";
Debug.ShouldStop(2048);
_btn_cancell.runMethod(true,"setText",BA.ObjectToCharSequence("اتصال به شبکه گوشی"));
 BA.debugLineNum = 205;BA.debugLine="btn_cancell.TextColor=Colors.White";
Debug.ShouldStop(4096);
_btn_cancell.runMethod(true,"setTextColor",ac_telelogin.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 206;BA.debugLine="btn_cancell.Background=bg";
Debug.ShouldStop(8192);
_btn_cancell.runMethod(false,"setBackground",(_bg.getObject()));
 BA.debugLineNum = 207;BA.debugLine="btn_cancell.TextSize=12";
Debug.ShouldStop(16384);
_btn_cancell.runMethod(true,"setTextSize",BA.numberCast(float.class, 12));
 BA.debugLineNum = 208;BA.debugLine="btn_cancell.Gravity=Gravity.CENTER_HORIZONTAL+Gr";
Debug.ShouldStop(32768);
_btn_cancell.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {ac_telelogin.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL"),ac_telelogin.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")}, "+",1, 1));
 BA.debugLineNum = 209;BA.debugLine="pnl_prox.AddView(btn_cancell,btn_addproxy.Left+b";
Debug.ShouldStop(65536);
_pnl_prox.runVoidMethod ("AddView",(Object)((_btn_cancell.getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {_btn_addproxy.runMethod(true,"getLeft"),_btn_addproxy.runMethod(true,"getWidth"),ac_telelogin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),ac_telelogin.mostCurrent.activityBA)}, "++",2, 1)),(Object)(ac_telelogin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),ac_telelogin.mostCurrent.activityBA)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_pnl_prox.runMethod(true,"getWidth"),RemoteObject.createImmutable(2),ac_telelogin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),ac_telelogin.mostCurrent.activityBA)}, "/-",1, 0))),(Object)(RemoteObject.solve(new RemoteObject[] {_pnl_prox.runMethod(true,"getHeight"),ac_telelogin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 4)),ac_telelogin.mostCurrent.activityBA)}, "-",1, 1)));
 BA.debugLineNum = 211;BA.debugLine="pnl_prox.Height=btn_cancell.Top+btn_cancell.Heig";
Debug.ShouldStop(262144);
_pnl_prox.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {_btn_cancell.runMethod(true,"getTop"),_btn_cancell.runMethod(true,"getHeight"),ac_telelogin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),ac_telelogin.mostCurrent.activityBA)}, "++",2, 1));
 BA.debugLineNum = 213;BA.debugLine="Dim btn_shabake As Button";
Debug.ShouldStop(1048576);
_btn_shabake = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");Debug.locals.put("btn_shabake", _btn_shabake);
 BA.debugLineNum = 214;BA.debugLine="btn_shabake.Initialize(\"btn_shabake\")";
Debug.ShouldStop(2097152);
_btn_shabake.runVoidMethod ("Initialize",ac_telelogin.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("btn_shabake")));
 BA.debugLineNum = 215;BA.debugLine="btn_shabake.Typeface=Typeface.LoadFromAssets(\"ir";
Debug.ShouldStop(4194304);
_btn_shabake.runMethod(false,"setTypeface",ac_telelogin.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("iran_sans.ttf"))));
 BA.debugLineNum = 216;BA.debugLine="btn_shabake.Text=\" شبکه فعلی  \"";
Debug.ShouldStop(8388608);
_btn_shabake.runMethod(true,"setText",BA.ObjectToCharSequence(" شبکه فعلی  "));
 BA.debugLineNum = 217;BA.debugLine="btn_shabake.TextColor=Colors.White";
Debug.ShouldStop(16777216);
_btn_shabake.runMethod(true,"setTextColor",ac_telelogin.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 218;BA.debugLine="btn_shabake.Background=bg";
Debug.ShouldStop(33554432);
_btn_shabake.runMethod(false,"setBackground",(_bg.getObject()));
 BA.debugLineNum = 219;BA.debugLine="btn_shabake.TextSize=15";
Debug.ShouldStop(67108864);
_btn_shabake.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 220;BA.debugLine="btn_shabake.Visible=False";
Debug.ShouldStop(134217728);
_btn_shabake.runMethod(true,"setVisible",ac_telelogin.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 221;BA.debugLine="btn_shabake.Gravity=Gravity.CENTER_HORIZONTAL+Gr";
Debug.ShouldStop(268435456);
_btn_shabake.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {ac_telelogin.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL"),ac_telelogin.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")}, "+",1, 1));
 BA.debugLineNum = 222;BA.debugLine="pnl_prox.AddView(btn_shabake,5%x,btn_cancell.Top";
Debug.ShouldStop(536870912);
_pnl_prox.runVoidMethod ("AddView",(Object)((_btn_shabake.getObject())),(Object)(ac_telelogin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),ac_telelogin.mostCurrent.activityBA)),(Object)(RemoteObject.solve(new RemoteObject[] {_btn_cancell.runMethod(true,"getTop"),_btn_cancell.runMethod(true,"getHeight"),ac_telelogin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),ac_telelogin.mostCurrent.activityBA)}, "++",2, 1)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_pnl_prox.runMethod(true,"getWidth"),RemoteObject.createImmutable(2),ac_telelogin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),ac_telelogin.mostCurrent.activityBA)}, "/-",1, 0))),(Object)(RemoteObject.solve(new RemoteObject[] {_pnl_prox.runMethod(true,"getHeight"),ac_telelogin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 4)),ac_telelogin.mostCurrent.activityBA)}, "-",1, 1)));
 BA.debugLineNum = 224;BA.debugLine="lbl_shabake.Initialize(\"lbl_shabake\")";
Debug.ShouldStop(-2147483648);
ac_telelogin.mostCurrent._lbl_shabake.runVoidMethod ("Initialize",ac_telelogin.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("lbl_shabake")));
 BA.debugLineNum = 225;BA.debugLine="lbl_shabake.Typeface=Typeface.LoadFromAssets(\"ir";
Debug.ShouldStop(1);
ac_telelogin.mostCurrent._lbl_shabake.runMethod(false,"setTypeface",ac_telelogin.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("iran_sans.ttf"))));
 BA.debugLineNum = 226;BA.debugLine="lbl_shabake.Text=\"شبکه فعلی : \"&\"192.168.11.10\"";
Debug.ShouldStop(2);
ac_telelogin.mostCurrent._lbl_shabake.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("شبکه فعلی : "),RemoteObject.createImmutable("192.168.11.10"))));
 BA.debugLineNum = 227;BA.debugLine="lbl_shabake.TextColor=Colors.White";
Debug.ShouldStop(4);
ac_telelogin.mostCurrent._lbl_shabake.runMethod(true,"setTextColor",ac_telelogin.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 228;BA.debugLine="lbl_shabake.Visible=False";
Debug.ShouldStop(8);
ac_telelogin.mostCurrent._lbl_shabake.runMethod(true,"setVisible",ac_telelogin.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 230;BA.debugLine="lbl_shabake.TextSize=14";
Debug.ShouldStop(32);
ac_telelogin.mostCurrent._lbl_shabake.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 231;BA.debugLine="lbl_shabake.Gravity=Gravity.LEFT+Gravity.CENTER_";
Debug.ShouldStop(64);
ac_telelogin.mostCurrent._lbl_shabake.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {ac_telelogin.mostCurrent.__c.getField(false,"Gravity").getField(true,"LEFT"),ac_telelogin.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")}, "+",1, 1));
 BA.debugLineNum = 232;BA.debugLine="pnl_prox.AddView(lbl_shabake,btn_shabake.Width+b";
Debug.ShouldStop(128);
_pnl_prox.runVoidMethod ("AddView",(Object)((ac_telelogin.mostCurrent._lbl_shabake.getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {_btn_shabake.runMethod(true,"getWidth"),_btn_shabake.runMethod(true,"getLeft"),ac_telelogin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),ac_telelogin.mostCurrent.activityBA)}, "++",2, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {_btn_cancell.runMethod(true,"getTop"),_btn_cancell.runMethod(true,"getHeight"),ac_telelogin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),ac_telelogin.mostCurrent.activityBA)}, "++",2, 1)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_pnl_prox.runMethod(true,"getWidth"),RemoteObject.createImmutable(2),ac_telelogin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),ac_telelogin.mostCurrent.activityBA)}, "/-",1, 0))),(Object)(RemoteObject.solve(new RemoteObject[] {_pnl_prox.runMethod(true,"getHeight"),ac_telelogin.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 4)),ac_telelogin.mostCurrent.activityBA)}, "-",1, 1)));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e140) {
			BA.rdebugUtils.runVoidMethod("setLastException",ac_telelogin.processBA, e140.toString()); BA.debugLineNum = 237;BA.debugLine="Log(LastException)";
Debug.ShouldStop(4096);
ac_telelogin.mostCurrent.__c.runVoidMethod ("LogImpl","61179837",BA.ObjectToString(ac_telelogin.mostCurrent.__c.runMethod(false,"LastException",ac_telelogin.mostCurrent.activityBA)),0);
 };
 BA.debugLineNum = 241;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Activity_Pause (ac_telelogin) ","ac_telelogin",2,ac_telelogin.mostCurrent.activityBA,ac_telelogin.mostCurrent,247);
if (RapidSub.canDelegate("activity_pause")) { return com.it.fome.ac_telelogin.remoteMe.runUserSub(false, "ac_telelogin","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 247;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 250;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
		Debug.PushSubsStack("Activity_Resume (ac_telelogin) ","ac_telelogin",2,ac_telelogin.mostCurrent.activityBA,ac_telelogin.mostCurrent,243);
if (RapidSub.canDelegate("activity_resume")) { return com.it.fome.ac_telelogin.remoteMe.runUserSub(false, "ac_telelogin","activity_resume");}
 BA.debugLineNum = 243;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(262144);
 BA.debugLineNum = 245;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _aes_decrypt_b4i(RemoteObject _szinputtodecrypt,RemoteObject _bakey,RemoteObject _baiv) throws Exception{
try {
		Debug.PushSubsStack("AES_Decrypt_B4I (ac_telelogin) ","ac_telelogin",2,ac_telelogin.mostCurrent.activityBA,ac_telelogin.mostCurrent,515);
if (RapidSub.canDelegate("aes_decrypt_b4i")) { return com.it.fome.ac_telelogin.remoteMe.runUserSub(false, "ac_telelogin","aes_decrypt_b4i", _szinputtodecrypt, _bakey, _baiv);}
RemoteObject _bainputdata = null;
RemoteObject _badecrypteddata = null;
RemoteObject _szdeccrypteddata = RemoteObject.createImmutable("");
RemoteObject _kg = RemoteObject.declareNull("anywheresoftware.b4a.agraham.encryption.CipherWrapper.KeyGeneratorWrapper");
RemoteObject _c = RemoteObject.declareNull("anywheresoftware.b4a.agraham.encryption.CipherWrapper");
Debug.locals.put("szInputToDecrypt", _szinputtodecrypt);
Debug.locals.put("baKey", _bakey);
Debug.locals.put("baIV", _baiv);
 BA.debugLineNum = 515;BA.debugLine="Sub AES_Decrypt_B4I(szInputToDecrypt As String, ba";
Debug.ShouldStop(4);
 BA.debugLineNum = 516;BA.debugLine="Dim baInputdata() As Byte";
Debug.ShouldStop(8);
_bainputdata = RemoteObject.createNewArray ("byte", new int[] {0}, new Object[]{});Debug.locals.put("baInputdata", _bainputdata);
 BA.debugLineNum = 517;BA.debugLine="Dim baDecryptedData(0) As Byte";
Debug.ShouldStop(16);
_badecrypteddata = RemoteObject.createNewArray ("byte", new int[] {0}, new Object[]{});Debug.locals.put("baDecryptedData", _badecrypteddata);
 BA.debugLineNum = 518;BA.debugLine="Dim szDeccryptedData As String";
Debug.ShouldStop(32);
_szdeccrypteddata = RemoteObject.createImmutable("");Debug.locals.put("szDeccryptedData", _szdeccrypteddata);
 BA.debugLineNum = 519;BA.debugLine="Dim kg As KeyGenerator";
Debug.ShouldStop(64);
_kg = RemoteObject.createNew ("anywheresoftware.b4a.agraham.encryption.CipherWrapper.KeyGeneratorWrapper");Debug.locals.put("kg", _kg);
 BA.debugLineNum = 521;BA.debugLine="kg.Initialize(\"AES\")";
Debug.ShouldStop(256);
_kg.runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("AES")));
 BA.debugLineNum = 522;BA.debugLine="kg.KeyFromBytes(baKey)";
Debug.ShouldStop(512);
_kg.runVoidMethod ("KeyFromBytes",(Object)(_bakey));
 BA.debugLineNum = 523;BA.debugLine="baInputdata = StringUtils1.DecodeBase64(szInputTo";
Debug.ShouldStop(1024);
_bainputdata = ac_telelogin.mostCurrent._stringutils1.runMethod(false,"DecodeBase64",(Object)(_szinputtodecrypt));Debug.locals.put("baInputdata", _bainputdata);
 BA.debugLineNum = 525;BA.debugLine="Dim c As Cipher";
Debug.ShouldStop(4096);
_c = RemoteObject.createNew ("anywheresoftware.b4a.agraham.encryption.CipherWrapper");Debug.locals.put("c", _c);
 BA.debugLineNum = 526;BA.debugLine="C.Initialize(\"AES/CBC/PKCS7Padding\")";
Debug.ShouldStop(8192);
_c.runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("AES/CBC/PKCS7Padding")));
 BA.debugLineNum = 527;BA.debugLine="C.InitialisationVector = baIV";
Debug.ShouldStop(16384);
_c.runMethod(false,"setInitialisationVector",_baiv);
 BA.debugLineNum = 529;BA.debugLine="baDecryptedData=c.Decrypt(baInputdata,kg.Key,True";
Debug.ShouldStop(65536);
_badecrypteddata = _c.runMethod(false,"Decrypt",(Object)(_bainputdata),(Object)((_kg.runMethod(false,"getKey"))),(Object)(ac_telelogin.mostCurrent.__c.getField(true,"True")));Debug.locals.put("baDecryptedData", _badecrypteddata);
 BA.debugLineNum = 530;BA.debugLine="szDeccryptedData = ByteConv.StringFromBytes(baDec";
Debug.ShouldStop(131072);
_szdeccrypteddata = ac_telelogin.mostCurrent._byteconv.runMethod(true,"StringFromBytes",(Object)(_badecrypteddata),(Object)(RemoteObject.createImmutable("UTF8")));Debug.locals.put("szDeccryptedData", _szdeccrypteddata);
 BA.debugLineNum = 531;BA.debugLine="Return szDeccryptedData";
Debug.ShouldStop(262144);
if (true) return _szdeccrypteddata;
 BA.debugLineNum = 533;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _bb() throws Exception{
try {
		Debug.PushSubsStack("bb (ac_telelogin) ","ac_telelogin",2,ac_telelogin.mostCurrent.activityBA,ac_telelogin.mostCurrent,451);
if (RapidSub.canDelegate("bb")) { return com.it.fome.ac_telelogin.remoteMe.runUserSub(false, "ac_telelogin","bb");}
RemoteObject _prfn = RemoteObject.declareNull("com.reza.sh.fastnet.Fastnet");
RemoteObject _post = RemoteObject.declareNull("com.reza.sh.fastnet.GetRequestRaper");
 BA.debugLineNum = 451;BA.debugLine="Sub bb";
Debug.ShouldStop(4);
 BA.debugLineNum = 452;BA.debugLine="Dim prfn As PersianFastNetwork";
Debug.ShouldStop(8);
_prfn = RemoteObject.createNew ("com.reza.sh.fastnet.Fastnet");Debug.locals.put("prfn", _prfn);
 BA.debugLineNum = 453;BA.debugLine="prfn.initialize(\"prfn\")";
Debug.ShouldStop(16);
_prfn.runVoidMethod ("initialize",ac_telelogin.processBA,(Object)(RemoteObject.createImmutable("prfn")));
 BA.debugLineNum = 455;BA.debugLine="Dim post As GetRequest";
Debug.ShouldStop(64);
_post = RemoteObject.createNew ("com.reza.sh.fastnet.GetRequestRaper");Debug.locals.put("post", _post);
 BA.debugLineNum = 459;BA.debugLine="post.executRequestAsJSONObject";
Debug.ShouldStop(1024);
_post.runVoidMethod ("executRequestAsJSONObject");
 BA.debugLineNum = 461;BA.debugLine="ProgressDialogShow(\"در حال پردازش...\")";
Debug.ShouldStop(4096);
ac_telelogin.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",ac_telelogin.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("در حال پردازش..."))));
 BA.debugLineNum = 466;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btn_addproxy_click() throws Exception{
try {
		Debug.PushSubsStack("btn_addproxy_Click (ac_telelogin) ","ac_telelogin",2,ac_telelogin.mostCurrent.activityBA,ac_telelogin.mostCurrent,804);
if (RapidSub.canDelegate("btn_addproxy_click")) { return com.it.fome.ac_telelogin.remoteMe.runUserSub(false, "ac_telelogin","btn_addproxy_click");}
 BA.debugLineNum = 804;BA.debugLine="Sub btn_addproxy_Click";
Debug.ShouldStop(8);
 BA.debugLineNum = 805;BA.debugLine="bb";
Debug.ShouldStop(16);
_bb();
 BA.debugLineNum = 806;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btn_cancell_click() throws Exception{
try {
		Debug.PushSubsStack("btn_cancell_Click (ac_telelogin) ","ac_telelogin",2,ac_telelogin.mostCurrent.activityBA,ac_telelogin.mostCurrent,800);
if (RapidSub.canDelegate("btn_cancell_click")) { return com.it.fome.ac_telelogin.remoteMe.runUserSub(false, "ac_telelogin","btn_cancell_click");}
 BA.debugLineNum = 800;BA.debugLine="Sub btn_cancell_Click";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 801;BA.debugLine="telegs.emptyProxy()";
Debug.ShouldStop(1);
ac_telelogin.mostCurrent._telegs.runVoidMethod ("emptyProxy");
 BA.debugLineNum = 802;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btn_code_click() throws Exception{
try {
		Debug.PushSubsStack("btn_code_Click (ac_telelogin) ","ac_telelogin",2,ac_telelogin.mostCurrent.activityBA,ac_telelogin.mostCurrent,282);
if (RapidSub.canDelegate("btn_code_click")) { return com.it.fome.ac_telelogin.remoteMe.runUserSub(false, "ac_telelogin","btn_code_click");}
 BA.debugLineNum = 282;BA.debugLine="Sub btn_code_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 283;BA.debugLine="Log(\"codee\")";
Debug.ShouldStop(67108864);
ac_telelogin.mostCurrent.__c.runVoidMethod ("LogImpl","61441793",RemoteObject.createImmutable("codee"),0);
 BA.debugLineNum = 284;BA.debugLine="If edit_code.Text=\"\" Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",ac_telelogin.mostCurrent._edit_code.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 285;BA.debugLine="ToastMessageShow(\"کد نمیتواند خالی باشد\",False)";
Debug.ShouldStop(268435456);
ac_telelogin.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("کد نمیتواند خالی باشد")),(Object)(ac_telelogin.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 286;BA.debugLine="Return True";
Debug.ShouldStop(536870912);
if (true) return BA.ObjectToString(ac_telelogin.mostCurrent.__c.getField(true,"True"));
 };
 BA.debugLineNum = 288;BA.debugLine="ToastMessageShow(\"در حال بارگذاری ...\",False)";
Debug.ShouldStop(-2147483648);
ac_telelogin.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("در حال بارگذاری ...")),(Object)(ac_telelogin.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 291;BA.debugLine="telegs.checkCode(edit_code.Text)";
Debug.ShouldStop(4);
ac_telelogin.mostCurrent._telegs.runVoidMethod ("checkCode",(Object)(ac_telelogin.mostCurrent._edit_code.runMethod(true,"getText")));
 BA.debugLineNum = 293;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btn_pass_click() throws Exception{
try {
		Debug.PushSubsStack("btn_pass_Click (ac_telelogin) ","ac_telelogin",2,ac_telelogin.mostCurrent.activityBA,ac_telelogin.mostCurrent,295);
if (RapidSub.canDelegate("btn_pass_click")) { return com.it.fome.ac_telelogin.remoteMe.runUserSub(false, "ac_telelogin","btn_pass_click");}
 BA.debugLineNum = 295;BA.debugLine="Sub btn_pass_Click";
Debug.ShouldStop(64);
 BA.debugLineNum = 296;BA.debugLine="If edit_pass.Text=\"\" Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",ac_telelogin.mostCurrent._edit_pass.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 297;BA.debugLine="ToastMessageShow(\"گذرواژه نمیتواند خالی باشد\",Fa";
Debug.ShouldStop(256);
ac_telelogin.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("گذرواژه نمیتواند خالی باشد")),(Object)(ac_telelogin.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 298;BA.debugLine="Return True";
Debug.ShouldStop(512);
if (true) return BA.ObjectToString(ac_telelogin.mostCurrent.__c.getField(true,"True"));
 };
 BA.debugLineNum = 300;BA.debugLine="ProgressDialogShow(\"در حال بارگزاری...\")";
Debug.ShouldStop(2048);
ac_telelogin.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",ac_telelogin.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("در حال بارگزاری..."))));
 BA.debugLineNum = 301;BA.debugLine="telegs.checkPassword(edit_pass.Text)";
Debug.ShouldStop(4096);
ac_telelogin.mostCurrent._telegs.runVoidMethod ("checkPassword",(Object)(ac_telelogin.mostCurrent._edit_pass.runMethod(true,"getText")));
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
public static RemoteObject  _btn_shabake_click() throws Exception{
try {
		Debug.PushSubsStack("btn_shabake_Click (ac_telelogin) ","ac_telelogin",2,ac_telelogin.mostCurrent.activityBA,ac_telelogin.mostCurrent,796);
if (RapidSub.canDelegate("btn_shabake_click")) { return com.it.fome.ac_telelogin.remoteMe.runUserSub(false, "ac_telelogin","btn_shabake_click");}
 BA.debugLineNum = 796;BA.debugLine="Sub btn_shabake_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 798;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button1_click() throws Exception{
try {
		Debug.PushSubsStack("Button1_Click (ac_telelogin) ","ac_telelogin",2,ac_telelogin.mostCurrent.activityBA,ac_telelogin.mostCurrent,306);
if (RapidSub.canDelegate("button1_click")) { return com.it.fome.ac_telelogin.remoteMe.runUserSub(false, "ac_telelogin","button1_click");}
 BA.debugLineNum = 306;BA.debugLine="Sub Button1_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 309;BA.debugLine="telegs.Setphone(\"+989306698421\")";
Debug.ShouldStop(1048576);
ac_telelogin.mostCurrent._telegs.runVoidMethod ("Setphone",(Object)(RemoteObject.createImmutable("+989306698421")));
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
public static RemoteObject  _button2_click() throws Exception{
try {
		Debug.PushSubsStack("Button2_Click (ac_telelogin) ","ac_telelogin",2,ac_telelogin.mostCurrent.activityBA,ac_telelogin.mostCurrent,313);
if (RapidSub.canDelegate("button2_click")) { return com.it.fome.ac_telelogin.remoteMe.runUserSub(false, "ac_telelogin","button2_click");}
 BA.debugLineNum = 313;BA.debugLine="Sub Button2_Click";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 316;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button3_click() throws Exception{
try {
		Debug.PushSubsStack("Button3_Click (ac_telelogin) ","ac_telelogin",2,ac_telelogin.mostCurrent.activityBA,ac_telelogin.mostCurrent,318);
if (RapidSub.canDelegate("button3_click")) { return com.it.fome.ac_telelogin.remoteMe.runUserSub(false, "ac_telelogin","button3_click");}
 BA.debugLineNum = 318;BA.debugLine="Sub Button3_Click";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 321;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button4_click() throws Exception{
try {
		Debug.PushSubsStack("Button4_Click (ac_telelogin) ","ac_telelogin",2,ac_telelogin.mostCurrent.activityBA,ac_telelogin.mostCurrent,323);
if (RapidSub.canDelegate("button4_click")) { return com.it.fome.ac_telelogin.remoteMe.runUserSub(false, "ac_telelogin","button4_click");}
 BA.debugLineNum = 323;BA.debugLine="Sub Button4_Click";
Debug.ShouldStop(4);
 BA.debugLineNum = 354;BA.debugLine="StartActivity(ac_lchats)";
Debug.ShouldStop(2);
ac_telelogin.mostCurrent.__c.runVoidMethod ("StartActivity",ac_telelogin.processBA,(Object)((ac_telelogin.mostCurrent._ac_lchats.getObject())));
 BA.debugLineNum = 357;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button5_click() throws Exception{
try {
		Debug.PushSubsStack("Button5_Click (ac_telelogin) ","ac_telelogin",2,ac_telelogin.mostCurrent.activityBA,ac_telelogin.mostCurrent,571);
if (RapidSub.canDelegate("button5_click")) { return com.it.fome.ac_telelogin.remoteMe.runUserSub(false, "ac_telelogin","button5_click");}
 BA.debugLineNum = 571;BA.debugLine="Sub Button5_Click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 572;BA.debugLine="bb";
Debug.ShouldStop(134217728);
_bb();
 BA.debugLineNum = 574;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button6_click() throws Exception{
try {
		Debug.PushSubsStack("Button6_Click (ac_telelogin) ","ac_telelogin",2,ac_telelogin.mostCurrent.activityBA,ac_telelogin.mostCurrent,576);
if (RapidSub.canDelegate("button6_click")) { return com.it.fome.ac_telelogin.remoteMe.runUserSub(false, "ac_telelogin","button6_click");}
 BA.debugLineNum = 576;BA.debugLine="Sub Button6_Click";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 577;BA.debugLine="telegs.emptyProxy()";
Debug.ShouldStop(1);
ac_telelogin.mostCurrent._telegs.runVoidMethod ("emptyProxy");
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
public static RemoteObject  _encrypt_s(RemoteObject _datatoencrypt,RemoteObject _bakey,RemoteObject _baiv) throws Exception{
try {
		Debug.PushSubsStack("Encrypt_s (ac_telelogin) ","ac_telelogin",2,ac_telelogin.mostCurrent.activityBA,ac_telelogin.mostCurrent,534);
if (RapidSub.canDelegate("encrypt_s")) { return com.it.fome.ac_telelogin.remoteMe.runUserSub(false, "ac_telelogin","encrypt_s", _datatoencrypt, _bakey, _baiv);}
RemoteObject _su = RemoteObject.declareNull("anywheresoftware.b4a.objects.StringUtils");
RemoteObject _kg = RemoteObject.declareNull("anywheresoftware.b4a.agraham.encryption.CipherWrapper.KeyGeneratorWrapper");
RemoteObject _encrypted = null;
RemoteObject _chashkey = RemoteObject.createImmutable("");
RemoteObject _c = RemoteObject.declareNull("anywheresoftware.b4a.agraham.encryption.CipherWrapper");
Debug.locals.put("dataToEncrypt", _datatoencrypt);
Debug.locals.put("baKey", _bakey);
Debug.locals.put("baIV", _baiv);
 BA.debugLineNum = 534;BA.debugLine="Sub Encrypt_s(dataToEncrypt As String, baKey() As";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 536;BA.debugLine="Dim su As StringUtils";
Debug.ShouldStop(8388608);
_su = RemoteObject.createNew ("anywheresoftware.b4a.objects.StringUtils");Debug.locals.put("su", _su);
 BA.debugLineNum = 537;BA.debugLine="Dim kg As KeyGenerator";
Debug.ShouldStop(16777216);
_kg = RemoteObject.createNew ("anywheresoftware.b4a.agraham.encryption.CipherWrapper.KeyGeneratorWrapper");Debug.locals.put("kg", _kg);
 BA.debugLineNum = 538;BA.debugLine="Dim encrypted() As Byte";
Debug.ShouldStop(33554432);
_encrypted = RemoteObject.createNewArray ("byte", new int[] {0}, new Object[]{});Debug.locals.put("encrypted", _encrypted);
 BA.debugLineNum = 539;BA.debugLine="Dim cHashKey As String";
Debug.ShouldStop(67108864);
_chashkey = RemoteObject.createImmutable("");Debug.locals.put("cHashKey", _chashkey);
 BA.debugLineNum = 541;BA.debugLine="kg.Initialize(\"AES\")";
Debug.ShouldStop(268435456);
_kg.runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("AES")));
 BA.debugLineNum = 542;BA.debugLine="kg.KeyFromBytes(baKey)";
Debug.ShouldStop(536870912);
_kg.runVoidMethod ("KeyFromBytes",(Object)(_bakey));
 BA.debugLineNum = 544;BA.debugLine="Dim c As Cipher";
Debug.ShouldStop(-2147483648);
_c = RemoteObject.createNew ("anywheresoftware.b4a.agraham.encryption.CipherWrapper");Debug.locals.put("c", _c);
 BA.debugLineNum = 545;BA.debugLine="c.Initialize(\"AES/CBC/PKCS7Padding\")";
Debug.ShouldStop(1);
_c.runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("AES/CBC/PKCS7Padding")));
 BA.debugLineNum = 546;BA.debugLine="c.InitialisationVector = baIV";
Debug.ShouldStop(2);
_c.runMethod(false,"setInitialisationVector",_baiv);
 BA.debugLineNum = 548;BA.debugLine="encrypted = c.Encrypt(dataToEncrypt.GetBytes(\"UTF";
Debug.ShouldStop(8);
_encrypted = _c.runMethod(false,"Encrypt",(Object)(_datatoencrypt.runMethod(false,"getBytes",(Object)(RemoteObject.createImmutable("UTF8")))),(Object)((_kg.runMethod(false,"getKey"))),(Object)(ac_telelogin.mostCurrent.__c.getField(true,"True")));Debug.locals.put("encrypted", _encrypted);
 BA.debugLineNum = 550;BA.debugLine="Return su.EncodeBase64(encrypted)";
Debug.ShouldStop(32);
if (true) return _su.runMethod(true,"EncodeBase64",(Object)(_encrypted));
 BA.debugLineNum = 551;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
 //BA.debugLineNum = 15;BA.debugLine="Dim telegs As milad_telegramv3";
ac_telelogin.mostCurrent._telegs = RemoteObject.createNew ("com.mili.telegrams.teleg_warp");
 //BA.debugLineNum = 19;BA.debugLine="Private Button1 As Button";
ac_telelogin.mostCurrent._button1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private ImageView1 As ImageView";
ac_telelogin.mostCurrent._imageview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Dim glide As Hitex_GlideTransformation";
ac_telelogin.mostCurrent._glide = RemoteObject.createNew ("com.glide.transformation.Hitex_GlideTransformation");
 //BA.debugLineNum = 22;BA.debugLine="Dim ii As Int = 0";
ac_telelogin._ii = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 23;BA.debugLine="Dim chatids As Long";
ac_telelogin._chatids = RemoteObject.createImmutable(0L);
 //BA.debugLineNum = 26;BA.debugLine="Dim ENC_KEY_LENGTH As Int = 16";
ac_telelogin._enc_key_length = BA.numberCast(int.class, 16);
 //BA.debugLineNum = 28;BA.debugLine="Dim ByteConv As ByteConverter";
ac_telelogin.mostCurrent._byteconv = RemoteObject.createNew ("anywheresoftware.b4a.agraham.byteconverter.ByteConverter");
 //BA.debugLineNum = 29;BA.debugLine="Dim StringUtils1 As StringUtils";
ac_telelogin.mostCurrent._stringutils1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.StringUtils");
 //BA.debugLineNum = 30;BA.debugLine="Dim bconv As ByteConverter";
ac_telelogin.mostCurrent._bconv = RemoteObject.createNew ("anywheresoftware.b4a.agraham.byteconverter.ByteConverter");
 //BA.debugLineNum = 32;BA.debugLine="Dim username,password,server As String";
ac_telelogin.mostCurrent._username = RemoteObject.createImmutable("");
ac_telelogin.mostCurrent._password = RemoteObject.createImmutable("");
ac_telelogin.mostCurrent._server = RemoteObject.createImmutable("");
 //BA.debugLineNum = 33;BA.debugLine="Dim ports As Int";
ac_telelogin._ports = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 35;BA.debugLine="Dim p As Panel";
ac_telelogin.mostCurrent._p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 37;BA.debugLine="Dim lbl_neme As Label";
ac_telelogin.mostCurrent._lbl_neme = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Dim login As Button";
ac_telelogin.mostCurrent._login = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 39;BA.debugLine="Dim edit_pish,edit_number ,edit_code,edit_pass As";
ac_telelogin.mostCurrent._edit_pish = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
ac_telelogin.mostCurrent._edit_number = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
ac_telelogin.mostCurrent._edit_code = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
ac_telelogin.mostCurrent._edit_pass = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 40;BA.debugLine="Dim userid_t,username_t As List";
ac_telelogin.mostCurrent._userid_t = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
ac_telelogin.mostCurrent._username_t = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 42;BA.debugLine="Dim btn_code,btn_pass As Button";
ac_telelogin.mostCurrent._btn_code = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
ac_telelogin.mostCurrent._btn_pass = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 43;BA.debugLine="Dim lbl_st As Label";
ac_telelogin.mostCurrent._lbl_st = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 44;BA.debugLine="Dim lbl_shabake As Label";
ac_telelogin.mostCurrent._lbl_shabake = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 45;BA.debugLine="Dim sta_conn As String";
ac_telelogin.mostCurrent._sta_conn = RemoteObject.createImmutable("");
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _login_click() throws Exception{
try {
		Debug.PushSubsStack("login_Click (ac_telelogin) ","ac_telelogin",2,ac_telelogin.mostCurrent.activityBA,ac_telelogin.mostCurrent,252);
if (RapidSub.canDelegate("login_click")) { return com.it.fome.ac_telelogin.remoteMe.runUserSub(false, "ac_telelogin","login_click");}
 BA.debugLineNum = 252;BA.debugLine="Sub login_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 254;BA.debugLine="If edit_pish.Text=\"\" Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",ac_telelogin.mostCurrent._edit_pish.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 255;BA.debugLine="ToastMessageShow(\"پیش شماره نمیتواند خالی باشد\",";
Debug.ShouldStop(1073741824);
ac_telelogin.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("پیش شماره نمیتواند خالی باشد")),(Object)(ac_telelogin.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 256;BA.debugLine="Return True";
Debug.ShouldStop(-2147483648);
if (true) return BA.ObjectToString(ac_telelogin.mostCurrent.__c.getField(true,"True"));
 };
 BA.debugLineNum = 259;BA.debugLine="If edit_number.Text=\"\" Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",ac_telelogin.mostCurrent._edit_number.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 260;BA.debugLine="ToastMessageShow(\"شماره تلفن نمیتواند خالی باشد\"";
Debug.ShouldStop(8);
ac_telelogin.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("شماره تلفن نمیتواند خالی باشد")),(Object)(ac_telelogin.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 261;BA.debugLine="Return True";
Debug.ShouldStop(16);
if (true) return BA.ObjectToString(ac_telelogin.mostCurrent.__c.getField(true,"True"));
 };
 BA.debugLineNum = 271;BA.debugLine="telegs.Setphone(edit_pish.Text&edit_number.Text)";
Debug.ShouldStop(16384);
ac_telelogin.mostCurrent._telegs.runVoidMethod ("Setphone",(Object)(RemoteObject.concat(ac_telelogin.mostCurrent._edit_pish.runMethod(true,"getText"),ac_telelogin.mostCurrent._edit_number.runMethod(true,"getText"))));
 BA.debugLineNum = 274;BA.debugLine="ToastMessageShow(\"در حال بارگذاری ...\",False)";
Debug.ShouldStop(131072);
ac_telelogin.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("در حال بارگذاری ...")),(Object)(ac_telelogin.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 279;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _prfn_ongetjsonobjecterrorlistener(RemoteObject _error,RemoteObject _tag) throws Exception{
try {
		Debug.PushSubsStack("prfn_onGetJSONObjectErrorListener (ac_telelogin) ","ac_telelogin",2,ac_telelogin.mostCurrent.activityBA,ac_telelogin.mostCurrent,510);
if (RapidSub.canDelegate("prfn_ongetjsonobjecterrorlistener")) { return com.it.fome.ac_telelogin.remoteMe.runUserSub(false, "ac_telelogin","prfn_ongetjsonobjecterrorlistener", _error, _tag);}
Debug.locals.put("Error", _error);
Debug.locals.put("Tag", _tag);
 BA.debugLineNum = 510;BA.debugLine="Sub prfn_onGetJSONObjectErrorListener(Error As Res";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 511;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(1073741824);
ac_telelogin.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 513;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _prfn_ongetjsonobjectoklistener(RemoteObject _jsonstring,RemoteObject _tag) throws Exception{
try {
		Debug.PushSubsStack("prfn_onGetJSONObjectOkListener (ac_telelogin) ","ac_telelogin",2,ac_telelogin.mostCurrent.activityBA,ac_telelogin.mostCurrent,468);
if (RapidSub.canDelegate("prfn_ongetjsonobjectoklistener")) { return com.it.fome.ac_telelogin.remoteMe.runUserSub(false, "ac_telelogin","prfn_ongetjsonobjectoklistener", _jsonstring, _tag);}
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _data = RemoteObject.createImmutable("");
RemoteObject _respo = RemoteObject.createImmutable("");
RemoteObject _enc = RemoteObject.createImmutable("");
RemoteObject _test = null;
RemoteObject _string_crypt = RemoteObject.createImmutable("");
RemoteObject _prt = RemoteObject.createImmutable(0);
RemoteObject _usr = RemoteObject.createImmutable("");
RemoteObject _ip = RemoteObject.createImmutable("");
RemoteObject _pwd = RemoteObject.createImmutable("");
RemoteObject _ttl = RemoteObject.createImmutable(0);
Debug.locals.put("JsonString", _jsonstring);
Debug.locals.put("Tag", _tag);
 BA.debugLineNum = 468;BA.debugLine="Sub prfn_onGetJSONObjectOkListener(JsonString As S";
Debug.ShouldStop(524288);
 BA.debugLineNum = 469;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(1048576);
ac_telelogin.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 470;BA.debugLine="Log(JsonString)";
Debug.ShouldStop(2097152);
ac_telelogin.mostCurrent.__c.runVoidMethod ("LogImpl","62359298",_jsonstring,0);
 BA.debugLineNum = 471;BA.debugLine="JsonString=JsonString.Replace(\"[\",\"\").Replace(\"]\"";
Debug.ShouldStop(4194304);
_jsonstring = _jsonstring.runMethod(true,"replace",(Object)(BA.ObjectToString("[")),(Object)(RemoteObject.createImmutable(""))).runMethod(true,"replace",(Object)(BA.ObjectToString("]")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("JsonString", _jsonstring);
 BA.debugLineNum = 472;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(8388608);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 473;BA.debugLine="parser.Initialize(JsonString)";
Debug.ShouldStop(16777216);
_parser.runVoidMethod ("Initialize",(Object)(_jsonstring));
 BA.debugLineNum = 474;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(33554432);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 475;BA.debugLine="Dim data As String = root.Get(\"data\")";
Debug.ShouldStop(67108864);
_data = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("data")))));Debug.locals.put("data", _data);Debug.locals.put("data", _data);
 BA.debugLineNum = 476;BA.debugLine="Log(\"date : \"&data)";
Debug.ShouldStop(134217728);
ac_telelogin.mostCurrent.__c.runVoidMethod ("LogImpl","62359304",RemoteObject.concat(RemoteObject.createImmutable("date : "),_data),0);
 BA.debugLineNum = 477;BA.debugLine="Dim respo,enc As String";
Debug.ShouldStop(268435456);
_respo = RemoteObject.createImmutable("");Debug.locals.put("respo", _respo);
_enc = RemoteObject.createImmutable("");Debug.locals.put("enc", _enc);
 BA.debugLineNum = 478;BA.debugLine="respo=AES_Decrypt_B4I(data,bconv.StringToBytes(\"K";
Debug.ShouldStop(536870912);
_respo = _aes_decrypt_b4i(_data,ac_telelogin.mostCurrent._bconv.runMethod(false,"StringToBytes",(Object)(BA.ObjectToString("KCH@LQj#>6VCqqLg")),(Object)(RemoteObject.createImmutable("UTF8"))),ac_telelogin.mostCurrent._bconv.runMethod(false,"StringToBytes",(Object)(BA.ObjectToString("YC'2bmK=b%#NQ?9j")),(Object)(RemoteObject.createImmutable("UTF8"))));Debug.locals.put("respo", _respo);
 BA.debugLineNum = 479;BA.debugLine="Log(\"js : \"&respo)";
Debug.ShouldStop(1073741824);
ac_telelogin.mostCurrent.__c.runVoidMethod ("LogImpl","62359307",RemoteObject.concat(RemoteObject.createImmutable("js : "),_respo),0);
 BA.debugLineNum = 481;BA.debugLine="Dim test() As Byte";
Debug.ShouldStop(1);
_test = RemoteObject.createNewArray ("byte", new int[] {0}, new Object[]{});Debug.locals.put("test", _test);
 BA.debugLineNum = 482;BA.debugLine="Dim string_crypt As String";
Debug.ShouldStop(2);
_string_crypt = RemoteObject.createImmutable("");Debug.locals.put("string_crypt", _string_crypt);
 BA.debugLineNum = 488;BA.debugLine="enc=Encrypt_s(respo,bconv.StringToBytes(\"KCH@LQj#";
Debug.ShouldStop(128);
_enc = _encrypt_s(_respo,ac_telelogin.mostCurrent._bconv.runMethod(false,"StringToBytes",(Object)(BA.ObjectToString("KCH@LQj#>6VCqqLg")),(Object)(RemoteObject.createImmutable("UTF8"))),ac_telelogin.mostCurrent._bconv.runMethod(false,"StringToBytes",(Object)(BA.ObjectToString("YC'2bmK=b%#NQ?9j")),(Object)(RemoteObject.createImmutable("UTF8"))));Debug.locals.put("enc", _enc);
 BA.debugLineNum = 489;BA.debugLine="Log(\" return : \"&enc)";
Debug.ShouldStop(256);
ac_telelogin.mostCurrent.__c.runVoidMethod ("LogImpl","62359317",RemoteObject.concat(RemoteObject.createImmutable(" return : "),_enc),0);
 BA.debugLineNum = 490;BA.debugLine="enc=AES_Decrypt_B4I(enc,bconv.StringToBytes(\"KCH@";
Debug.ShouldStop(512);
_enc = _aes_decrypt_b4i(_enc,ac_telelogin.mostCurrent._bconv.runMethod(false,"StringToBytes",(Object)(BA.ObjectToString("KCH@LQj#>6VCqqLg")),(Object)(RemoteObject.createImmutable("UTF8"))),ac_telelogin.mostCurrent._bconv.runMethod(false,"StringToBytes",(Object)(BA.ObjectToString("YC'2bmK=b%#NQ?9j")),(Object)(RemoteObject.createImmutable("UTF8"))));Debug.locals.put("enc", _enc);
 BA.debugLineNum = 491;BA.debugLine="Log(\"js : \"&enc)";
Debug.ShouldStop(1024);
ac_telelogin.mostCurrent.__c.runVoidMethod ("LogImpl","62359319",RemoteObject.concat(RemoteObject.createImmutable("js : "),_enc),0);
 BA.debugLineNum = 492;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(2048);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 493;BA.debugLine="parser.Initialize(respo)";
Debug.ShouldStop(4096);
_parser.runVoidMethod ("Initialize",(Object)(_respo));
 BA.debugLineNum = 494;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(8192);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 495;BA.debugLine="Dim prt As Int = root.Get(\"prt\")";
Debug.ShouldStop(16384);
_prt = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("prt")))));Debug.locals.put("prt", _prt);Debug.locals.put("prt", _prt);
 BA.debugLineNum = 496;BA.debugLine="Dim usr As String = root.Get(\"usr\")";
Debug.ShouldStop(32768);
_usr = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("usr")))));Debug.locals.put("usr", _usr);Debug.locals.put("usr", _usr);
 BA.debugLineNum = 497;BA.debugLine="Dim ip As String = root.Get(\"ip\")";
Debug.ShouldStop(65536);
_ip = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ip")))));Debug.locals.put("ip", _ip);Debug.locals.put("ip", _ip);
 BA.debugLineNum = 498;BA.debugLine="Dim pwd As String = root.Get(\"pwd\")";
Debug.ShouldStop(131072);
_pwd = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("pwd")))));Debug.locals.put("pwd", _pwd);Debug.locals.put("pwd", _pwd);
 BA.debugLineNum = 499;BA.debugLine="Dim ttl As Int = root.Get(\"ttl\")";
Debug.ShouldStop(262144);
_ttl = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ttl")))));Debug.locals.put("ttl", _ttl);Debug.locals.put("ttl", _ttl);
 BA.debugLineNum = 500;BA.debugLine="username=usr";
Debug.ShouldStop(524288);
ac_telelogin.mostCurrent._username = _usr;
 BA.debugLineNum = 501;BA.debugLine="password=pwd";
Debug.ShouldStop(1048576);
ac_telelogin.mostCurrent._password = _pwd;
 BA.debugLineNum = 502;BA.debugLine="server=ip";
Debug.ShouldStop(2097152);
ac_telelogin.mostCurrent._server = _ip;
 BA.debugLineNum = 503;BA.debugLine="ports=prt";
Debug.ShouldStop(4194304);
ac_telelogin._ports = _prt;
 BA.debugLineNum = 504;BA.debugLine="telegs.setProxy(ports,server,username,password)";
Debug.ShouldStop(8388608);
ac_telelogin.mostCurrent._telegs.runVoidMethod ("setProxy",(Object)(ac_telelogin._ports),(Object)(ac_telelogin.mostCurrent._server),(Object)(ac_telelogin.mostCurrent._username),(Object)(ac_telelogin.mostCurrent._password));
 BA.debugLineNum = 507;BA.debugLine="Log(ip)";
Debug.ShouldStop(67108864);
ac_telelogin.mostCurrent.__c.runVoidMethod ("LogImpl","62359335",_ip,0);
 BA.debugLineNum = 508;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _prfn_onpostjsonobjecterrorlistener(RemoteObject _error,RemoteObject _tag) throws Exception{
try {
		Debug.PushSubsStack("prfn_onPostJSONObjectErrorListener (ac_telelogin) ","ac_telelogin",2,ac_telelogin.mostCurrent.activityBA,ac_telelogin.mostCurrent,686);
if (RapidSub.canDelegate("prfn_onpostjsonobjecterrorlistener")) { return com.it.fome.ac_telelogin.remoteMe.runUserSub(false, "ac_telelogin","prfn_onpostjsonobjecterrorlistener", _error, _tag);}
Debug.locals.put("Error", _error);
Debug.locals.put("Tag", _tag);
 BA.debugLineNum = 686;BA.debugLine="Sub prfn_onPostJSONObjectErrorListener(Error As Re";
Debug.ShouldStop(8192);
 BA.debugLineNum = 692;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(524288);
ac_telelogin.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 693;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _prfn_onpostjsonobjectoklistener(RemoteObject _jsonstring,RemoteObject _tag) throws Exception{
try {
		Debug.PushSubsStack("prfn_onPostJSONObjectOkListener (ac_telelogin) ","ac_telelogin",2,ac_telelogin.mostCurrent.activityBA,ac_telelogin.mostCurrent,695);
if (RapidSub.canDelegate("prfn_onpostjsonobjectoklistener")) { return com.it.fome.ac_telelogin.remoteMe.runUserSub(false, "ac_telelogin","prfn_onpostjsonobjectoklistener", _jsonstring, _tag);}
Debug.locals.put("JsonString", _jsonstring);
Debug.locals.put("Tag", _tag);
 BA.debugLineNum = 695;BA.debugLine="Sub prfn_onPostJSONObjectOkListener(JsonString As";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 696;BA.debugLine="Log(JsonString)";
Debug.ShouldStop(8388608);
ac_telelogin.mostCurrent.__c.runVoidMethod ("LogImpl","63211265",_jsonstring,0);
 BA.debugLineNum = 702;BA.debugLine="Log(\"okkk\")";
Debug.ShouldStop(536870912);
ac_telelogin.mostCurrent.__c.runVoidMethod ("LogImpl","63211271",RemoteObject.createImmutable("okkk"),0);
 BA.debugLineNum = 703;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(1073741824);
ac_telelogin.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 705;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
		Debug.PushSubsStack("prfn_onPostStringErrorListener (ac_telelogin) ","ac_telelogin",2,ac_telelogin.mostCurrent.activityBA,ac_telelogin.mostCurrent,713);
if (RapidSub.canDelegate("prfn_onpoststringerrorlistener")) { return com.it.fome.ac_telelogin.remoteMe.runUserSub(false, "ac_telelogin","prfn_onpoststringerrorlistener", _error, _tag);}
Debug.locals.put("Error", _error);
Debug.locals.put("Tag", _tag);
 BA.debugLineNum = 713;BA.debugLine="Sub prfn_onPostStringErrorListener(Error As Respon";
Debug.ShouldStop(256);
 BA.debugLineNum = 714;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(512);
ac_telelogin.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 715;BA.debugLine="Log(Error.CauseMessage)";
Debug.ShouldStop(1024);
ac_telelogin.mostCurrent.__c.runVoidMethod ("LogImpl","63342338",_error.runMethod(true,"getCauseMessage"),0);
 BA.debugLineNum = 716;BA.debugLine="Log(Error.ErrorBody)";
Debug.ShouldStop(2048);
ac_telelogin.mostCurrent.__c.runVoidMethod ("LogImpl","63342339",_error.runMethod(true,"getErrorBody"),0);
 BA.debugLineNum = 717;BA.debugLine="Log(Error.ErrorDetails)";
Debug.ShouldStop(4096);
ac_telelogin.mostCurrent.__c.runVoidMethod ("LogImpl","63342340",_error.runMethod(true,"getErrorDetails"),0);
 BA.debugLineNum = 718;BA.debugLine="Log(Error.ErrorMsage)";
Debug.ShouldStop(8192);
ac_telelogin.mostCurrent.__c.runVoidMethod ("LogImpl","63342341",_error.runMethod(true,"getErrorMsage"),0);
 BA.debugLineNum = 719;BA.debugLine="Log(Error.ResponseBody)";
Debug.ShouldStop(16384);
ac_telelogin.mostCurrent.__c.runVoidMethod ("LogImpl","63342342",_error.runMethod(true,"getResponseBody"),0);
 BA.debugLineNum = 720;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("prfn_onPostStringOkListener (ac_telelogin) ","ac_telelogin",2,ac_telelogin.mostCurrent.activityBA,ac_telelogin.mostCurrent,707);
if (RapidSub.canDelegate("prfn_onpoststringoklistener")) { return com.it.fome.ac_telelogin.remoteMe.runUserSub(false, "ac_telelogin","prfn_onpoststringoklistener", _result, _tag);}
Debug.locals.put("Result", _result);
Debug.locals.put("Tag", _tag);
 BA.debugLineNum = 707;BA.debugLine="Sub prfn_onPostStringOkListener(Result As String";
Debug.ShouldStop(4);
 BA.debugLineNum = 708;BA.debugLine="Log(\"okkk\")";
Debug.ShouldStop(8);
ac_telelogin.mostCurrent.__c.runVoidMethod ("LogImpl","63276801",RemoteObject.createImmutable("okkk"),0);
 BA.debugLineNum = 709;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(16);
ac_telelogin.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 710;BA.debugLine="Log	(Result)";
Debug.ShouldStop(32);
ac_telelogin.mostCurrent.__c.runVoidMethod ("LogImpl","63276803",_result,0);
 BA.debugLineNum = 711;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 7;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="Private sql1 As SQL";
ac_telelogin._sql1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL");
 //BA.debugLineNum = 11;BA.debugLine="Private cursor1 As Cursor";
ac_telelogin._cursor1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _telegs_accpass(RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("telegs_accpass (ac_telelogin) ","ac_telelogin",2,ac_telelogin.mostCurrent.activityBA,ac_telelogin.mostCurrent,625);
if (RapidSub.canDelegate("telegs_accpass")) { return com.it.fome.ac_telelogin.remoteMe.runUserSub(false, "ac_telelogin","telegs_accpass", _value);}
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _pass_recovery = RemoteObject.createImmutable("");
RemoteObject _pass_email = RemoteObject.createImmutable("");
RemoteObject _pass_hint = RemoteObject.createImmutable("");
Debug.locals.put("value", _value);
 BA.debugLineNum = 625;BA.debugLine="Sub telegs_accpass(value As String)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 626;BA.debugLine="LogColor(value,Colors.Blue)";
Debug.ShouldStop(131072);
ac_telelogin.mostCurrent.__c.runVoidMethod ("LogImpl","62949121",_value,ac_telelogin.mostCurrent.__c.getField(false,"Colors").getField(true,"Blue"));
 BA.debugLineNum = 628;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(524288);
ac_telelogin.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 629;BA.debugLine="ToastMessageShow(\"لطفا پسورد را وارد کنید\",False)";
Debug.ShouldStop(1048576);
ac_telelogin.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("لطفا پسورد را وارد کنید")),(Object)(ac_telelogin.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 630;BA.debugLine="edit_code.Visible=False";
Debug.ShouldStop(2097152);
ac_telelogin.mostCurrent._edit_code.runMethod(true,"setVisible",ac_telelogin.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 631;BA.debugLine="btn_code.Visible=False";
Debug.ShouldStop(4194304);
ac_telelogin.mostCurrent._btn_code.runMethod(true,"setVisible",ac_telelogin.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 632;BA.debugLine="edit_pass.Visible=True";
Debug.ShouldStop(8388608);
ac_telelogin.mostCurrent._edit_pass.runMethod(true,"setVisible",ac_telelogin.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 633;BA.debugLine="btn_pass.Visible=True";
Debug.ShouldStop(16777216);
ac_telelogin.mostCurrent._btn_pass.runMethod(true,"setVisible",ac_telelogin.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 634;BA.debugLine="Log(\"titele :D \"&value)";
Debug.ShouldStop(33554432);
ac_telelogin.mostCurrent.__c.runVoidMethod ("LogImpl","62949129",RemoteObject.concat(RemoteObject.createImmutable("titele :D "),_value),0);
 BA.debugLineNum = 637;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(268435456);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 638;BA.debugLine="parser.Initialize(value)";
Debug.ShouldStop(536870912);
_parser.runVoidMethod ("Initialize",(Object)(_value));
 BA.debugLineNum = 639;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(1073741824);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 640;BA.debugLine="Dim pass_recovery As String = root.Get(\"pass_reco";
Debug.ShouldStop(-2147483648);
_pass_recovery = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("pass_recovery")))));Debug.locals.put("pass_recovery", _pass_recovery);Debug.locals.put("pass_recovery", _pass_recovery);
 BA.debugLineNum = 641;BA.debugLine="Dim pass_email As String = root.Get(\"pass_email\")";
Debug.ShouldStop(1);
_pass_email = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("pass_email")))));Debug.locals.put("pass_email", _pass_email);Debug.locals.put("pass_email", _pass_email);
 BA.debugLineNum = 642;BA.debugLine="Dim pass_hint As String = root.Get(\"pass_hint\")";
Debug.ShouldStop(2);
_pass_hint = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("pass_hint")))));Debug.locals.put("pass_hint", _pass_hint);Debug.locals.put("pass_hint", _pass_hint);
 BA.debugLineNum = 643;BA.debugLine="lbl_st.Text=\"شما بازبینی دو مرحله ای را فعال کرده";
Debug.ShouldStop(4);
ac_telelogin.mostCurrent._lbl_st.runMethod(true,"setText",BA.ObjectToCharSequence("شما بازبینی دو مرحله ای را فعال کرده اید. در نتیجه حساب شما با یک گذرواژه ی اضافه محافظت می شود."));
 BA.debugLineNum = 644;BA.debugLine="edit_pass.Hint=pass_hint";
Debug.ShouldStop(8);
ac_telelogin.mostCurrent._edit_pass.runMethod(true,"setHint",_pass_hint);
 BA.debugLineNum = 645;BA.debugLine="ToastMessageShow(\"password hint : \"&pass_hint,Fal";
Debug.ShouldStop(16);
ac_telelogin.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("password hint : "),_pass_hint))),(Object)(ac_telelogin.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 646;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _telegs_codemsg(RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("telegs_codemsg (ac_telelogin) ","ac_telelogin",2,ac_telelogin.mostCurrent.activityBA,ac_telelogin.mostCurrent,648);
if (RapidSub.canDelegate("telegs_codemsg")) { return com.it.fome.ac_telelogin.remoteMe.runUserSub(false, "ac_telelogin","telegs_codemsg", _value);}
Debug.locals.put("value", _value);
 BA.debugLineNum = 648;BA.debugLine="Sub telegs_codemsg(value As String)";
Debug.ShouldStop(128);
 BA.debugLineNum = 650;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(512);
ac_telelogin.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 651;BA.debugLine="ToastMessageShow(\"لطفا کد را وارد کنید\",False)";
Debug.ShouldStop(1024);
ac_telelogin.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("لطفا کد را وارد کنید")),(Object)(ac_telelogin.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 652;BA.debugLine="lbl_neme.Text=\"تایید تلفن\"";
Debug.ShouldStop(2048);
ac_telelogin.mostCurrent._lbl_neme.runMethod(true,"setText",BA.ObjectToCharSequence("تایید تلفن"));
 BA.debugLineNum = 653;BA.debugLine="lbl_st.Text=\"ما کد را به برنامه تلگرامی روی دستگا";
Debug.ShouldStop(4096);
ac_telelogin.mostCurrent._lbl_st.runMethod(true,"setText",BA.ObjectToCharSequence("ما کد را به برنامه تلگرامی روی دستگاه دیگر فرستادیم."));
 BA.debugLineNum = 654;BA.debugLine="edit_code.Visible=True";
Debug.ShouldStop(8192);
ac_telelogin.mostCurrent._edit_code.runMethod(true,"setVisible",ac_telelogin.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 655;BA.debugLine="btn_code.Visible=True";
Debug.ShouldStop(16384);
ac_telelogin.mostCurrent._btn_code.runMethod(true,"setVisible",ac_telelogin.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 656;BA.debugLine="edit_number.Visible=False";
Debug.ShouldStop(32768);
ac_telelogin.mostCurrent._edit_number.runMethod(true,"setVisible",ac_telelogin.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 657;BA.debugLine="edit_pish.Visible=False";
Debug.ShouldStop(65536);
ac_telelogin.mostCurrent._edit_pish.runMethod(true,"setVisible",ac_telelogin.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 658;BA.debugLine="login.Visible=False";
Debug.ShouldStop(131072);
ac_telelogin.mostCurrent._login.runMethod(true,"setVisible",ac_telelogin.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 659;BA.debugLine="LogColor(\"titele :D \"&value,Colors.Red)";
Debug.ShouldStop(262144);
ac_telelogin.mostCurrent.__c.runVoidMethod ("LogImpl","63014667",RemoteObject.concat(RemoteObject.createImmutable("titele :D "),_value),ac_telelogin.mostCurrent.__c.getField(false,"Colors").getField(true,"Red"));
 BA.debugLineNum = 660;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
		Debug.PushSubsStack("telegs_errormsg (ac_telelogin) ","ac_telelogin",2,ac_telelogin.mostCurrent.activityBA,ac_telelogin.mostCurrent,582);
if (RapidSub.canDelegate("telegs_errormsg")) { return com.it.fome.ac_telelogin.remoteMe.runUserSub(false, "ac_telelogin","telegs_errormsg", _value);}
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _error_msg = RemoteObject.createImmutable("");
RemoteObject _errorconstructor = RemoteObject.createImmutable(0);
RemoteObject _error_code = RemoteObject.createImmutable(0);
Debug.locals.put("value", _value);
 BA.debugLineNum = 582;BA.debugLine="Sub telegs_errormsg(value As String)";
Debug.ShouldStop(32);
 BA.debugLineNum = 583;BA.debugLine="LogColor(value,Colors.Blue)";
Debug.ShouldStop(64);
ac_telelogin.mostCurrent.__c.runVoidMethod ("LogImpl","62818049",_value,ac_telelogin.mostCurrent.__c.getField(false,"Colors").getField(true,"Blue"));
 BA.debugLineNum = 584;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(128);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 585;BA.debugLine="parser.Initialize(value)";
Debug.ShouldStop(256);
_parser.runVoidMethod ("Initialize",(Object)(_value));
 BA.debugLineNum = 586;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(512);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 587;BA.debugLine="Dim Error_msg As String = root.Get(\"Error_msg\")";
Debug.ShouldStop(1024);
_error_msg = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Error_msg")))));Debug.locals.put("Error_msg", _error_msg);Debug.locals.put("Error_msg", _error_msg);
 BA.debugLineNum = 588;BA.debugLine="Dim ErrorConstructor As Int = root.Get(\"ErrorCons";
Debug.ShouldStop(2048);
_errorconstructor = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ErrorConstructor")))));Debug.locals.put("ErrorConstructor", _errorconstructor);Debug.locals.put("ErrorConstructor", _errorconstructor);
 BA.debugLineNum = 589;BA.debugLine="Dim Error_code As Int = root.Get(\"Error_code\")";
Debug.ShouldStop(4096);
_error_code = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Error_code")))));Debug.locals.put("Error_code", _error_code);Debug.locals.put("Error_code", _error_code);
 BA.debugLineNum = 590;BA.debugLine="ToastMessageShow(Error_msg,False)";
Debug.ShouldStop(8192);
ac_telelogin.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(_error_msg)),(Object)(ac_telelogin.mostCurrent.__c.getField(true,"False")));
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
public static RemoteObject  _telegs_getchat(RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("telegs_getchat (ac_telelogin) ","ac_telelogin",2,ac_telelogin.mostCurrent.activityBA,ac_telelogin.mostCurrent,419);
if (RapidSub.canDelegate("telegs_getchat")) { return com.it.fome.ac_telelogin.remoteMe.runUserSub(false, "ac_telelogin","telegs_getchat", _value);}
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colroot = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _chatconstructor = RemoteObject.createImmutable(0);
RemoteObject _topdate = RemoteObject.createImmutable(0);
RemoteObject _unreadcount = RemoteObject.createImmutable(0);
RemoteObject _lastreadinboxmessageid = RemoteObject.createImmutable("");
RemoteObject _title = RemoteObject.createImmutable("");
RemoteObject _lastreadoutboxmessageid = RemoteObject.createImmutable("");
RemoteObject _content = RemoteObject.createImmutable(0);
RemoteObject _replymarkupmessageid = RemoteObject.createImmutable(0);
RemoteObject _chat_id = RemoteObject.createImmutable("");
Debug.locals.put("value", _value);
 BA.debugLineNum = 419;BA.debugLine="Sub telegs_getchat(value As String)";
Debug.ShouldStop(4);
 BA.debugLineNum = 420;BA.debugLine="Log(value)";
Debug.ShouldStop(8);
ac_telelogin.mostCurrent.__c.runVoidMethod ("LogImpl","62097153",_value,0);
 BA.debugLineNum = 421;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(16);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 422;BA.debugLine="parser.Initialize(value)";
Debug.ShouldStop(32);
_parser.runVoidMethod ("Initialize",(Object)(_value));
 BA.debugLineNum = 423;BA.debugLine="Dim root As List = parser.NextArray";
Debug.ShouldStop(64);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_root = _parser.runMethod(false,"NextArray");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 424;BA.debugLine="For Each colroot As Map In root";
Debug.ShouldStop(128);
_colroot = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group5 = _root;
final int groupLen5 = group5.runMethod(true,"getSize").<Integer>get()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_colroot.setObject(group5.runMethod(false,"Get",index5));
Debug.locals.put("colroot", _colroot);
 BA.debugLineNum = 425;BA.debugLine="Dim ChatConstructor As Int = colroot.Get(\"ChatCo";
Debug.ShouldStop(256);
_chatconstructor = BA.numberCast(int.class, _colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ChatConstructor")))));Debug.locals.put("ChatConstructor", _chatconstructor);Debug.locals.put("ChatConstructor", _chatconstructor);
 BA.debugLineNum = 426;BA.debugLine="Dim topdate As Int = colroot.Get(\"topdate\")";
Debug.ShouldStop(512);
_topdate = BA.numberCast(int.class, _colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("topdate")))));Debug.locals.put("topdate", _topdate);Debug.locals.put("topdate", _topdate);
 BA.debugLineNum = 427;BA.debugLine="Dim unreadCount As Int = colroot.Get(\"unreadCoun";
Debug.ShouldStop(1024);
_unreadcount = BA.numberCast(int.class, _colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("unreadCount")))));Debug.locals.put("unreadCount", _unreadcount);Debug.locals.put("unreadCount", _unreadcount);
 BA.debugLineNum = 428;BA.debugLine="Dim lastReadInboxMessageId As String = colroot.G";
Debug.ShouldStop(2048);
_lastreadinboxmessageid = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lastReadInboxMessageId")))));Debug.locals.put("lastReadInboxMessageId", _lastreadinboxmessageid);Debug.locals.put("lastReadInboxMessageId", _lastreadinboxmessageid);
 BA.debugLineNum = 429;BA.debugLine="Dim title As String = colroot.Get(\"title\")";
Debug.ShouldStop(4096);
_title = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("title")))));Debug.locals.put("title", _title);Debug.locals.put("title", _title);
 BA.debugLineNum = 430;BA.debugLine="Dim lastReadOutboxMessageId As String = colroot.";
Debug.ShouldStop(8192);
_lastreadoutboxmessageid = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lastReadOutboxMessageId")))));Debug.locals.put("lastReadOutboxMessageId", _lastreadoutboxmessageid);Debug.locals.put("lastReadOutboxMessageId", _lastreadoutboxmessageid);
 BA.debugLineNum = 431;BA.debugLine="Dim content As Int = colroot.Get(\"content\")";
Debug.ShouldStop(16384);
_content = BA.numberCast(int.class, _colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("content")))));Debug.locals.put("content", _content);Debug.locals.put("content", _content);
 BA.debugLineNum = 432;BA.debugLine="Dim replyMarkupMessageId As Int = colroot.Get(\"r";
Debug.ShouldStop(32768);
_replymarkupmessageid = BA.numberCast(int.class, _colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("replyMarkupMessageId")))));Debug.locals.put("replyMarkupMessageId", _replymarkupmessageid);Debug.locals.put("replyMarkupMessageId", _replymarkupmessageid);
 BA.debugLineNum = 433;BA.debugLine="Dim chat_id As String = colroot.Get(\"chat_id\")";
Debug.ShouldStop(65536);
_chat_id = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("chat_id")))));Debug.locals.put("chat_id", _chat_id);Debug.locals.put("chat_id", _chat_id);
 BA.debugLineNum = 434;BA.debugLine="Log(title)";
Debug.ShouldStop(131072);
ac_telelogin.mostCurrent.__c.runVoidMethod ("LogImpl","62097167",_title,0);
 BA.debugLineNum = 435;BA.debugLine="Log(chat_id)";
Debug.ShouldStop(262144);
ac_telelogin.mostCurrent.__c.runVoidMethod ("LogImpl","62097168",_chat_id,0);
 }
}Debug.locals.put("colroot", _colroot);
;
 BA.debugLineNum = 438;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("telegs_getme (ac_telelogin) ","ac_telelogin",2,ac_telelogin.mostCurrent.activityBA,ac_telelogin.mostCurrent,723);
if (RapidSub.canDelegate("telegs_getme")) { return com.it.fome.ac_telelogin.remoteMe.runUserSub(false, "ac_telelogin","telegs_getme", _value);}
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _lastname = RemoteObject.createImmutable("");
RemoteObject _firstname = RemoteObject.createImmutable("");
RemoteObject _phonenumber = RemoteObject.createImmutable("");
RemoteObject _profilephoto = RemoteObject.createImmutable("");
RemoteObject _isverified = RemoteObject.createImmutable("");
RemoteObject _id = RemoteObject.createImmutable("");
RemoteObject _restrictionreason = RemoteObject.createImmutable("");
RemoteObject _haveaccess = RemoteObject.createImmutable("");
RemoteObject _typess = RemoteObject.createImmutable("");
RemoteObject _usernamess = RemoteObject.createImmutable("");
RemoteObject _status = RemoteObject.createImmutable("");
int _i = 0;
RemoteObject _new_num = RemoteObject.createImmutable(0);
int _ia = 0;
RemoteObject _new_nums = RemoteObject.createImmutable(0);
Debug.locals.put("value", _value);
 BA.debugLineNum = 723;BA.debugLine="Sub telegs_getme(value As String)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 724;BA.debugLine="LogColor(value,Colors.Blue)";
Debug.ShouldStop(524288);
ac_telelogin.mostCurrent.__c.runVoidMethod ("LogImpl","63407873",_value,ac_telelogin.mostCurrent.__c.getField(false,"Colors").getField(true,"Blue"));
 BA.debugLineNum = 725;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(1048576);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 726;BA.debugLine="parser.Initialize(value)";
Debug.ShouldStop(2097152);
_parser.runVoidMethod ("Initialize",(Object)(_value));
 BA.debugLineNum = 727;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(4194304);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 728;BA.debugLine="Dim lastName As String = root.Get(\"lastName\")";
Debug.ShouldStop(8388608);
_lastname = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lastName")))));Debug.locals.put("lastName", _lastname);Debug.locals.put("lastName", _lastname);
 BA.debugLineNum = 729;BA.debugLine="Dim firstName As String = root.Get(\"firstName\")";
Debug.ShouldStop(16777216);
_firstname = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("firstName")))));Debug.locals.put("firstName", _firstname);Debug.locals.put("firstName", _firstname);
 BA.debugLineNum = 730;BA.debugLine="Dim phoneNumber As String = root.Get(\"phoneNumber";
Debug.ShouldStop(33554432);
_phonenumber = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("phoneNumber")))));Debug.locals.put("phoneNumber", _phonenumber);Debug.locals.put("phoneNumber", _phonenumber);
 BA.debugLineNum = 731;BA.debugLine="Dim profilePhoto As String = root.Get(\"profilePho";
Debug.ShouldStop(67108864);
_profilephoto = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("profilePhoto")))));Debug.locals.put("profilePhoto", _profilephoto);Debug.locals.put("profilePhoto", _profilephoto);
 BA.debugLineNum = 732;BA.debugLine="Dim isVerified As String = root.Get(\"isVerified\")";
Debug.ShouldStop(134217728);
_isverified = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("isVerified")))));Debug.locals.put("isVerified", _isverified);Debug.locals.put("isVerified", _isverified);
 BA.debugLineNum = 733;BA.debugLine="Dim id As String = root.Get(\"id\")";
Debug.ShouldStop(268435456);
_id = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 734;BA.debugLine="Dim restrictionReason As String = root.Get(\"restr";
Debug.ShouldStop(536870912);
_restrictionreason = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("restrictionReason")))));Debug.locals.put("restrictionReason", _restrictionreason);Debug.locals.put("restrictionReason", _restrictionreason);
 BA.debugLineNum = 735;BA.debugLine="Dim haveAccess As String = root.Get(\"haveAccess\")";
Debug.ShouldStop(1073741824);
_haveaccess = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("haveAccess")))));Debug.locals.put("haveAccess", _haveaccess);Debug.locals.put("haveAccess", _haveaccess);
 BA.debugLineNum = 736;BA.debugLine="Dim Typess As String = root.Get(\"type\")";
Debug.ShouldStop(-2147483648);
_typess = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("type")))));Debug.locals.put("Typess", _typess);Debug.locals.put("Typess", _typess);
 BA.debugLineNum = 737;BA.debugLine="Dim usernamess As String = root.Get(\"username\")";
Debug.ShouldStop(1);
_usernamess = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("username")))));Debug.locals.put("usernamess", _usernamess);Debug.locals.put("usernamess", _usernamess);
 BA.debugLineNum = 738;BA.debugLine="Dim status As String = root.Get(\"status\")";
Debug.ShouldStop(2);
_status = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("status")))));Debug.locals.put("status", _status);Debug.locals.put("status", _status);
 BA.debugLineNum = 740;BA.debugLine="Log(id)";
Debug.ShouldStop(8);
ac_telelogin.mostCurrent.__c.runVoidMethod ("LogImpl","63407889",_id,0);
 BA.debugLineNum = 741;BA.debugLine="If userid_t.Size=0 Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",ac_telelogin.mostCurrent._userid_t.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 742;BA.debugLine="aa(usernamess,id,firstName&\"_\"&lastName,\"+\"&phon";
Debug.ShouldStop(32);
_aa(_usernamess,_id,RemoteObject.concat(_firstname,RemoteObject.createImmutable("_"),_lastname),RemoteObject.concat(RemoteObject.createImmutable("+"),_phonenumber));
 BA.debugLineNum = 745;BA.debugLine="cursor1=sql1.ExecQuery(\"SELECT id FROM tbl_tele";
Debug.ShouldStop(256);
ac_telelogin._cursor1.setObject(ac_telelogin._sql1.runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT id FROM tbl_tele WHERE soich='1'"))));
 BA.debugLineNum = 746;BA.debugLine="If cursor1.RowCount>0 Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean(">",ac_telelogin._cursor1.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 747;BA.debugLine="For i=0 To cursor1.RowCount-1";
Debug.ShouldStop(1024);
{
final int step21 = 1;
final int limit21 = RemoteObject.solve(new RemoteObject[] {ac_telelogin._cursor1.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step21 > 0 && _i <= limit21) || (step21 < 0 && _i >= limit21) ;_i = ((int)(0 + _i + step21))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 748;BA.debugLine="cursor1.Position=i";
Debug.ShouldStop(2048);
ac_telelogin._cursor1.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 749;BA.debugLine="Dim new_num As Int";
Debug.ShouldStop(4096);
_new_num = RemoteObject.createImmutable(0);Debug.locals.put("new_num", _new_num);
 BA.debugLineNum = 750;BA.debugLine="new_num=cursor1.GetInt(\"id\")";
Debug.ShouldStop(8192);
_new_num = ac_telelogin._cursor1.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("id")));Debug.locals.put("new_num", _new_num);
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 753;BA.debugLine="cursor1.Close";
Debug.ShouldStop(65536);
ac_telelogin._cursor1.runVoidMethod ("Close");
 BA.debugLineNum = 754;BA.debugLine="new_num=new_num+1";
Debug.ShouldStop(131072);
_new_num = RemoteObject.solve(new RemoteObject[] {_new_num,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("new_num", _new_num);
 BA.debugLineNum = 757;BA.debugLine="sql1.ExecNonQuery(\"INSERT INTO tbl_tele VALUES('";
Debug.ShouldStop(1048576);
ac_telelogin._sql1.runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("INSERT INTO tbl_tele VALUES('"),_new_num,RemoteObject.createImmutable("','"),_id,RemoteObject.createImmutable("','"),_usernamess,RemoteObject.createImmutable("','"),_phonenumber,RemoteObject.createImmutable("','none','none','"),_firstname,RemoteObject.createImmutable("','"),_lastname,RemoteObject.createImmutable("','1')"))));
 BA.debugLineNum = 759;BA.debugLine="cursor1=sql1.ExecQuery(\"SELECT id FROM tbl_coin\"";
Debug.ShouldStop(4194304);
ac_telelogin._cursor1.setObject(ac_telelogin._sql1.runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT id FROM tbl_coin"))));
 BA.debugLineNum = 760;BA.debugLine="If cursor1.RowCount>0 Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean(">",ac_telelogin._cursor1.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 761;BA.debugLine="For ia=0 To cursor1.RowCount-1";
Debug.ShouldStop(16777216);
{
final int step32 = 1;
final int limit32 = RemoteObject.solve(new RemoteObject[] {ac_telelogin._cursor1.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_ia = 0 ;
for (;(step32 > 0 && _ia <= limit32) || (step32 < 0 && _ia >= limit32) ;_ia = ((int)(0 + _ia + step32))  ) {
Debug.locals.put("ia", _ia);
 BA.debugLineNum = 762;BA.debugLine="cursor1.Position=ia";
Debug.ShouldStop(33554432);
ac_telelogin._cursor1.runMethod(true,"setPosition",BA.numberCast(int.class, _ia));
 BA.debugLineNum = 763;BA.debugLine="Dim new_nums As Int";
Debug.ShouldStop(67108864);
_new_nums = RemoteObject.createImmutable(0);Debug.locals.put("new_nums", _new_nums);
 BA.debugLineNum = 764;BA.debugLine="new_nums=cursor1.GetInt(\"id\")";
Debug.ShouldStop(134217728);
_new_nums = ac_telelogin._cursor1.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("id")));Debug.locals.put("new_nums", _new_nums);
 }
}Debug.locals.put("ia", _ia);
;
 };
 BA.debugLineNum = 767;BA.debugLine="new_nums=new_nums+1";
Debug.ShouldStop(1073741824);
_new_nums = RemoteObject.solve(new RemoteObject[] {_new_nums,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("new_nums", _new_nums);
 BA.debugLineNum = 768;BA.debugLine="sql1.ExecNonQuery(\"INSERT INTO tbl_coin VALUES('";
Debug.ShouldStop(-2147483648);
ac_telelogin._sql1.runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("INSERT INTO tbl_coin VALUES('"),_new_nums,RemoteObject.createImmutable("','"),_id,RemoteObject.createImmutable("','15','15')"))));
 BA.debugLineNum = 770;BA.debugLine="StartActivity(ac_tselect)";
Debug.ShouldStop(2);
ac_telelogin.mostCurrent.__c.runVoidMethod ("StartActivity",ac_telelogin.processBA,(Object)((ac_telelogin.mostCurrent._ac_tselect.getObject())));
 BA.debugLineNum = 771;BA.debugLine="Activity.Finish";
Debug.ShouldStop(4);
ac_telelogin.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 774;BA.debugLine="Return";
Debug.ShouldStop(32);
if (true) return RemoteObject.createImmutable("");
 }else {
 BA.debugLineNum = 777;BA.debugLine="Log(\"hast !\")";
Debug.ShouldStop(256);
ac_telelogin.mostCurrent.__c.runVoidMethod ("LogImpl","63407926",RemoteObject.createImmutable("hast !"),0);
 BA.debugLineNum = 780;BA.debugLine="StartActivity(ac_tselect)";
Debug.ShouldStop(2048);
ac_telelogin.mostCurrent.__c.runVoidMethod ("StartActivity",ac_telelogin.processBA,(Object)((ac_telelogin.mostCurrent._ac_tselect.getObject())));
 BA.debugLineNum = 781;BA.debugLine="Activity.Finish";
Debug.ShouldStop(4096);
ac_telelogin.mostCurrent._activity.runVoidMethod ("Finish");
 };
 BA.debugLineNum = 794;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _telegs_getuserinfo(RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("telegs_getuserinfo (ac_telelogin) ","ac_telelogin",2,ac_telelogin.mostCurrent.activityBA,ac_telelogin.mostCurrent,374);
if (RapidSub.canDelegate("telegs_getuserinfo")) { com.it.fome.ac_telelogin.remoteMe.runUserSub(false, "ac_telelogin","telegs_getuserinfo", _value); return;}
ResumableSub_telegs_getuserinfo rsub = new ResumableSub_telegs_getuserinfo(null,_value);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_telegs_getuserinfo extends BA.ResumableSub {
public ResumableSub_telegs_getuserinfo(com.it.fome.ac_telelogin parent,RemoteObject _value) {
this.parent = parent;
this._value = _value;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
com.it.fome.ac_telelogin parent;
RemoteObject _value;
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _user_bot = RemoteObject.createImmutable("");
RemoteObject _user_id = RemoteObject.createImmutable(0);
RemoteObject _user_phonenumber = RemoteObject.createImmutable("");
RemoteObject _user_username = RemoteObject.createImmutable("");
RemoteObject _user_persistentid = RemoteObject.createImmutable("");
RemoteObject _user_lastname = RemoteObject.createImmutable("");
RemoteObject _user_photoid = RemoteObject.createImmutable(0);
RemoteObject _user_firstname = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("telegs_getuserinfo (ac_telelogin) ","ac_telelogin",2,ac_telelogin.mostCurrent.activityBA,ac_telelogin.mostCurrent,374);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("value", _value);
 BA.debugLineNum = 376;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(8388608);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 377;BA.debugLine="parser.Initialize(value)";
Debug.ShouldStop(16777216);
_parser.runVoidMethod ("Initialize",(Object)(_value));
 BA.debugLineNum = 378;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(33554432);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 379;BA.debugLine="Dim user_bot As String = root.Get(\"user_bot\")";
Debug.ShouldStop(67108864);
_user_bot = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("user_bot")))));Debug.locals.put("user_bot", _user_bot);Debug.locals.put("user_bot", _user_bot);
 BA.debugLineNum = 380;BA.debugLine="Dim user_id As Int = root.Get(\"user_id\")";
Debug.ShouldStop(134217728);
_user_id = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("user_id")))));Debug.locals.put("user_id", _user_id);Debug.locals.put("user_id", _user_id);
 BA.debugLineNum = 381;BA.debugLine="Dim user_phoneNumber As String = root.Get(\"user_p";
Debug.ShouldStop(268435456);
_user_phonenumber = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("user_phoneNumber")))));Debug.locals.put("user_phoneNumber", _user_phonenumber);Debug.locals.put("user_phoneNumber", _user_phonenumber);
 BA.debugLineNum = 382;BA.debugLine="Dim user_username As String = root.Get(\"user_user";
Debug.ShouldStop(536870912);
_user_username = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("user_username")))));Debug.locals.put("user_username", _user_username);Debug.locals.put("user_username", _user_username);
 BA.debugLineNum = 383;BA.debugLine="Dim user_persistentId As String = root.Get(\"user_";
Debug.ShouldStop(1073741824);
_user_persistentid = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("user_persistentId")))));Debug.locals.put("user_persistentId", _user_persistentid);Debug.locals.put("user_persistentId", _user_persistentid);
 BA.debugLineNum = 384;BA.debugLine="Dim user_lastName As String = root.Get(\"user_last";
Debug.ShouldStop(-2147483648);
_user_lastname = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("user_lastName ")))));Debug.locals.put("user_lastName", _user_lastname);Debug.locals.put("user_lastName", _user_lastname);
 BA.debugLineNum = 385;BA.debugLine="Dim user_photoid As Int = root.Get(\"user_photoid\"";
Debug.ShouldStop(1);
_user_photoid = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("user_photoid")))));Debug.locals.put("user_photoid", _user_photoid);Debug.locals.put("user_photoid", _user_photoid);
 BA.debugLineNum = 386;BA.debugLine="Dim user_firstName As String = root.Get(\"user_fir";
Debug.ShouldStop(2);
_user_firstname = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("user_firstName ")))));Debug.locals.put("user_firstName", _user_firstname);Debug.locals.put("user_firstName", _user_firstname);
 BA.debugLineNum = 389;BA.debugLine="If user_username=\"\" Then";
Debug.ShouldStop(16);
if (true) break;

case 1:
//if
this.state = 10;
if (RemoteObject.solveBoolean("=",_user_username,BA.ObjectToString(""))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 10;
 BA.debugLineNum = 390;BA.debugLine="ii=ii+1";
Debug.ShouldStop(32);
parent._ii = RemoteObject.solve(new RemoteObject[] {parent._ii,RemoteObject.createImmutable(1)}, "+",1, 1);
 BA.debugLineNum = 391;BA.debugLine="Log(ii&\" \"&user_id)";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","61966097",RemoteObject.concat(parent._ii,RemoteObject.createImmutable(" "),_user_id),0);
 BA.debugLineNum = 392;BA.debugLine="Log(\"bot nist \"&user_firstName)";
Debug.ShouldStop(128);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","61966098",RemoteObject.concat(RemoteObject.createImmutable("bot nist "),_user_firstname),0);
 BA.debugLineNum = 393;BA.debugLine="telegs.invieUser(user_id,-1001003834789,10)";
Debug.ShouldStop(256);
parent.mostCurrent._telegs.runVoidMethod ("invieUser",(Object)(_user_id),(Object)(BA.numberCast(long.class, -1001003834789L)),(Object)(BA.numberCast(int.class, 10)));
 BA.debugLineNum = 394;BA.debugLine="telegs.invieUserContact(user_id,-1001003834789,1";
Debug.ShouldStop(512);
parent.mostCurrent._telegs.runVoidMethod ("invieUserContact",(Object)(_user_id),(Object)(BA.numberCast(long.class, -1001003834789L)),(Object)(BA.numberCast(int.class, 10)));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 396;BA.debugLine="If user_username.Contains(\"Bot\")=True Then";
Debug.ShouldStop(2048);
if (true) break;

case 6:
//if
this.state = 9;
if (RemoteObject.solveBoolean("=",_user_username.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("Bot"))),parent.mostCurrent.__c.getField(true,"True"))) { 
this.state = 8;
}if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 397;BA.debugLine="LogColor(\"bot \"&user_username,Colors.Blue)";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","61966103",RemoteObject.concat(RemoteObject.createImmutable("bot "),_user_username),parent.mostCurrent.__c.getField(false,"Colors").getField(true,"Blue"));
 if (true) break;

case 9:
//C
this.state = 10;
;
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 400;BA.debugLine="Sleep(2000)";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("Sleep",ac_telelogin.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ac_telelogin", "telegs_getuserinfo"),BA.numberCast(int.class, 2000));
this.state = 11;
return;
case 11:
//C
this.state = -1;
;
 BA.debugLineNum = 401;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
public static RemoteObject  _telegs_getusersban(RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("telegs_getusersban (ac_telelogin) ","ac_telelogin",2,ac_telelogin.mostCurrent.activityBA,ac_telelogin.mostCurrent,403);
if (RapidSub.canDelegate("telegs_getusersban")) { return com.it.fome.ac_telelogin.remoteMe.runUserSub(false, "ac_telelogin","telegs_getusersban", _value);}
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colroot = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _user_idss = RemoteObject.createImmutable(0);
Debug.locals.put("value", _value);
 BA.debugLineNum = 403;BA.debugLine="Sub telegs_getusersban(value As String)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 405;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(1048576);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 406;BA.debugLine="parser.Initialize(value)";
Debug.ShouldStop(2097152);
_parser.runVoidMethod ("Initialize",(Object)(_value));
 BA.debugLineNum = 407;BA.debugLine="Dim root As List = parser.NextArray";
Debug.ShouldStop(4194304);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_root = _parser.runMethod(false,"NextArray");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 408;BA.debugLine="For Each colroot As Map In root";
Debug.ShouldStop(8388608);
_colroot = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group4 = _root;
final int groupLen4 = group4.runMethod(true,"getSize").<Integer>get()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_colroot.setObject(group4.runMethod(false,"Get",index4));
Debug.locals.put("colroot", _colroot);
 BA.debugLineNum = 409;BA.debugLine="Dim user_idss As Int = colroot.Get(\"user_id\")";
Debug.ShouldStop(16777216);
_user_idss = BA.numberCast(int.class, _colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("user_id")))));Debug.locals.put("user_idss", _user_idss);Debug.locals.put("user_idss", _user_idss);
 BA.debugLineNum = 411;BA.debugLine="telegs.invieUser(user_idss,-1001003834789,10)";
Debug.ShouldStop(67108864);
ac_telelogin.mostCurrent._telegs.runVoidMethod ("invieUser",(Object)(_user_idss),(Object)(BA.numberCast(long.class, -1001003834789L)),(Object)(BA.numberCast(int.class, 10)));
 BA.debugLineNum = 414;BA.debugLine="Log(user_idss)";
Debug.ShouldStop(536870912);
ac_telelogin.mostCurrent.__c.runVoidMethod ("LogImpl","62031627",BA.NumberToString(_user_idss),0);
 }
}Debug.locals.put("colroot", _colroot);
;
 BA.debugLineNum = 417;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _telegs_imgphoto(RemoteObject _img,RemoteObject _tag) throws Exception{
try {
		Debug.PushSubsStack("telegs_imgphoto (ac_telelogin) ","ac_telelogin",2,ac_telelogin.mostCurrent.activityBA,ac_telelogin.mostCurrent,363);
if (RapidSub.canDelegate("telegs_imgphoto")) { return com.it.fome.ac_telelogin.remoteMe.runUserSub(false, "ac_telelogin","telegs_imgphoto", _img, _tag);}
Debug.locals.put("img", _img);
Debug.locals.put("tag", _tag);
 BA.debugLineNum = 363;BA.debugLine="Sub telegs_imgphoto(img As Bitmap, tag As Object)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 364;BA.debugLine="Try";
Debug.ShouldStop(2048);
try { Debug.CheckDeviceExceptions();
} 
       catch (Exception e3) {
			BA.rdebugUtils.runVoidMethod("setLastException",ac_telelogin.processBA, e3.toString()); BA.debugLineNum = 370;BA.debugLine="Log(LastException)";
Debug.ShouldStop(131072);
ac_telelogin.mostCurrent.__c.runVoidMethod ("LogImpl","61900551",BA.ObjectToString(ac_telelogin.mostCurrent.__c.runMethod(false,"LastException",ac_telelogin.mostCurrent.activityBA)),0);
 };
 BA.debugLineNum = 372;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _telegs_loginok(RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("telegs_loginok (ac_telelogin) ","ac_telelogin",2,ac_telelogin.mostCurrent.activityBA,ac_telelogin.mostCurrent,618);
if (RapidSub.canDelegate("telegs_loginok")) { return com.it.fome.ac_telelogin.remoteMe.runUserSub(false, "ac_telelogin","telegs_loginok", _value);}
Debug.locals.put("value", _value);
 BA.debugLineNum = 618;BA.debugLine="Sub telegs_loginok(value As String)";
Debug.ShouldStop(512);
 BA.debugLineNum = 619;BA.debugLine="LogColor(value,Colors.Blue)";
Debug.ShouldStop(1024);
ac_telelogin.mostCurrent.__c.runVoidMethod ("LogImpl","62883585",_value,ac_telelogin.mostCurrent.__c.getField(false,"Colors").getField(true,"Blue"));
 BA.debugLineNum = 620;BA.debugLine="ToastMessageShow(\"باموفقیت وارد شدید\",False)";
Debug.ShouldStop(2048);
ac_telelogin.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("باموفقیت وارد شدید")),(Object)(ac_telelogin.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 621;BA.debugLine="telegs.Getme()";
Debug.ShouldStop(4096);
ac_telelogin.mostCurrent._telegs.runVoidMethod ("Getme");
 BA.debugLineNum = 623;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _telegs_msgphone(RemoteObject _ss) throws Exception{
try {
		Debug.PushSubsStack("telegs_msgphone (ac_telelogin) ","ac_telelogin",2,ac_telelogin.mostCurrent.activityBA,ac_telelogin.mostCurrent,359);
if (RapidSub.canDelegate("telegs_msgphone")) { return com.it.fome.ac_telelogin.remoteMe.runUserSub(false, "ac_telelogin","telegs_msgphone", _ss);}
Debug.locals.put("ss", _ss);
 BA.debugLineNum = 359;BA.debugLine="Sub telegs_msgphone(ss As String)";
Debug.ShouldStop(64);
 BA.debugLineNum = 360;BA.debugLine="Log(ss)";
Debug.ShouldStop(128);
ac_telelogin.mostCurrent.__c.runVoidMethod ("LogImpl","61835009",_ss,0);
 BA.debugLineNum = 361;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("telegs_searchpublicchat (ac_telelogin) ","ac_telelogin",2,ac_telelogin.mostCurrent.activityBA,ac_telelogin.mostCurrent,445);
if (RapidSub.canDelegate("telegs_searchpublicchat")) { return com.it.fome.ac_telelogin.remoteMe.runUserSub(false, "ac_telelogin","telegs_searchpublicchat", _value);}
Debug.locals.put("value", _value);
 BA.debugLineNum = 445;BA.debugLine="Sub telegs_searchpublicchat(value As String)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 446;BA.debugLine="Log(value)";
Debug.ShouldStop(536870912);
ac_telelogin.mostCurrent.__c.runVoidMethod ("LogImpl","62228225",_value,0);
 BA.debugLineNum = 447;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _telegs_update_conn(RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("telegs_update_conn (ac_telelogin) ","ac_telelogin",2,ac_telelogin.mostCurrent.activityBA,ac_telelogin.mostCurrent,553);
if (RapidSub.canDelegate("telegs_update_conn")) { return com.it.fome.ac_telelogin.remoteMe.runUserSub(false, "ac_telelogin","telegs_update_conn", _value);}
Debug.locals.put("value", _value);
 BA.debugLineNum = 553;BA.debugLine="Sub telegs_update_conn(value As String)";
Debug.ShouldStop(256);
 BA.debugLineNum = 554;BA.debugLine="LogColor(value,Colors.Blue)";
Debug.ShouldStop(512);
ac_telelogin.mostCurrent.__c.runVoidMethod ("LogImpl","62621441",_value,ac_telelogin.mostCurrent.__c.getField(false,"Colors").getField(true,"Blue"));
 BA.debugLineNum = 555;BA.debugLine="Select value";
Debug.ShouldStop(1024);
switch (BA.switchObjectToInt(_value,BA.ObjectToString("ConnectionStateConnecting"),BA.ObjectToString("ConnectionStateReady"),BA.ObjectToString("ConnectionStateConnectingToProxy"))) {
case 0: {
 BA.debugLineNum = 557;BA.debugLine="lbl_neme.Text=\"در حال اتصال...\"";
Debug.ShouldStop(4096);
ac_telelogin.mostCurrent._lbl_neme.runMethod(true,"setText",BA.ObjectToCharSequence("در حال اتصال..."));
 break; }
case 1: {
 BA.debugLineNum = 560;BA.debugLine="lbl_neme.Text=\"ارتباط برقرار است\"";
Debug.ShouldStop(32768);
ac_telelogin.mostCurrent._lbl_neme.runMethod(true,"setText",BA.ObjectToCharSequence("ارتباط برقرار است"));
 BA.debugLineNum = 561;BA.debugLine="sta_conn=\"ConnectionStateReady\"";
Debug.ShouldStop(65536);
ac_telelogin.mostCurrent._sta_conn = BA.ObjectToString("ConnectionStateReady");
 break; }
case 2: {
 BA.debugLineNum = 563;BA.debugLine="lbl_neme.Text=\"در حال اتصال به پروکسی\"&\"...\"";
Debug.ShouldStop(262144);
ac_telelogin.mostCurrent._lbl_neme.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("در حال اتصال به پروکسی"),RemoteObject.createImmutable("..."))));
 break; }
}
;
 BA.debugLineNum = 568;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _telegs_update_newmsg(RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("telegs_update_newmsg (ac_telelogin) ","ac_telelogin",2,ac_telelogin.mostCurrent.activityBA,ac_telelogin.mostCurrent,440);
if (RapidSub.canDelegate("telegs_update_newmsg")) { return com.it.fome.ac_telelogin.remoteMe.runUserSub(false, "ac_telelogin","telegs_update_newmsg", _value);}
Debug.locals.put("value", _value);
 BA.debugLineNum = 440;BA.debugLine="Sub telegs_update_newmsg(value As String)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 441;BA.debugLine="Log(\"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
Debug.ShouldStop(16777216);
ac_telelogin.mostCurrent.__c.runVoidMethod ("LogImpl","62162689",RemoteObject.createImmutable("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"),0);
 BA.debugLineNum = 442;BA.debugLine="Log(\"main : \"&value)";
Debug.ShouldStop(33554432);
ac_telelogin.mostCurrent.__c.runVoidMethod ("LogImpl","62162690",RemoteObject.concat(RemoteObject.createImmutable("main : "),_value),0);
 BA.debugLineNum = 443;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}