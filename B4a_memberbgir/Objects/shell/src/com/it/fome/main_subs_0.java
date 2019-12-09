package com.it.fome;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static void  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,33);
if (RapidSub.canDelegate("activity_create")) { com.it.fome.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime); return;}
ResumableSub_Activity_Create rsub = new ResumableSub_Activity_Create(null,_firsttime);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Activity_Create extends BA.ResumableSub {
public ResumableSub_Activity_Create(com.it.fome.main parent,RemoteObject _firsttime) {
this.parent = parent;
this._firsttime = _firsttime;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
com.it.fome.main parent;
RemoteObject _firsttime;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,33);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 34;BA.debugLine="Activity.SetBackgroundImage(LoadBitmap(File.DirAs";
Debug.ShouldStop(2);
parent.mostCurrent._activity.runVoidMethod ("SetBackgroundImageNew",(Object)((parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("spaleshmember.png"))).getObject())));
 BA.debugLineNum = 36;BA.debugLine="skv11.Initialize(\"skv11\")";
Debug.ShouldStop(8);
parent.mostCurrent._skv11.runVoidMethod ("Initialize",main.processBA,(Object)(RemoteObject.createImmutable("skv11")));
 BA.debugLineNum = 37;BA.debugLine="Activity.AddView(skv11,35%x,70%y,30%x,30%x)";
Debug.ShouldStop(16);
parent.mostCurrent._activity.runVoidMethod ("AddView",(Object)((parent.mostCurrent._skv11.getObject())),(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 35)),main.mostCurrent.activityBA)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 70)),main.mostCurrent.activityBA)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 30)),main.mostCurrent.activityBA)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 30)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 38;BA.debugLine="skv11.Visible = True";
Debug.ShouldStop(32);
parent.mostCurrent._skv11.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 39;BA.debugLine="skv11.SpinKitColor = Colors.Cyan";
Debug.ShouldStop(64);
parent.mostCurrent._skv11.runVoidMethod ("setSpinKitColor",parent.mostCurrent.__c.getField(false,"Colors").getField(true,"Cyan"));
 BA.debugLineNum = 40;BA.debugLine="skv11.SpinKitType = skv11.CIRCLE";
Debug.ShouldStop(128);
parent.mostCurrent._skv11.runVoidMethod ("setSpinKitType",parent.mostCurrent._skv11.getField(true,"CIRCLE"));
 BA.debugLineNum = 41;BA.debugLine="skv11.goForIt";
Debug.ShouldStop(256);
parent.mostCurrent._skv11.runVoidMethod ("goForIt");
 BA.debugLineNum = 43;BA.debugLine="Sleep(4000)";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("Sleep",main.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "activity_create"),BA.numberCast(int.class, 4000));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 BA.debugLineNum = 44;BA.debugLine="StartActivity(ac_telelogin)";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((parent.mostCurrent._ac_telelogin.getObject())));
 BA.debugLineNum = 45;BA.debugLine="Activity.Finish";
Debug.ShouldStop(4096);
parent.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 46;BA.debugLine="End Sub";
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
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,52);
if (RapidSub.canDelegate("activity_pause")) { return com.it.fome.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 52;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 54;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,48);
if (RapidSub.canDelegate("activity_resume")) { return com.it.fome.main.remoteMe.runUserSub(false, "main","activity_resume");}
 BA.debugLineNum = 48;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(32768);
 BA.debugLineNum = 50;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 27;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 28;BA.debugLine="Private skv11 As SpinKitView";
main.mostCurrent._skv11 = RemoteObject.createNew ("spinkitwrapper.spinKitWrapper");
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
ac_telelogin_subs_0._process_globals();
ac_shop_subs_0._process_globals();
ac_tansfer_subs_0._process_globals();
firebasemessaging_subs_0._process_globals();
ac_tselect_subs_0._process_globals();
ac_lchats_subs_0._process_globals();
ac_tfreecoin_subs_0._process_globals();
ac_hsef_subs_0._process_globals();
ac_tsearch_subs_0._process_globals();
ac_tcoin_subs_0._process_globals();
ac_home_subs_0._process_globals();
act_chat_subs_0._process_globals();
starter_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("com.it.fome.main");
mi_meno.myClass = BA.getDeviceClass ("com.it.fome.mi_meno");
ac_telelogin.myClass = BA.getDeviceClass ("com.it.fome.ac_telelogin");
ac_shop.myClass = BA.getDeviceClass ("com.it.fome.ac_shop");
mi_shop.myClass = BA.getDeviceClass ("com.it.fome.mi_shop");
ac_tansfer.myClass = BA.getDeviceClass ("com.it.fome.ac_tansfer");
firebasemessaging.myClass = BA.getDeviceClass ("com.it.fome.firebasemessaging");
ac_tselect.myClass = BA.getDeviceClass ("com.it.fome.ac_tselect");
ac_lchats.myClass = BA.getDeviceClass ("com.it.fome.ac_lchats");
ac_tfreecoin.myClass = BA.getDeviceClass ("com.it.fome.ac_tfreecoin");
ac_hsef.myClass = BA.getDeviceClass ("com.it.fome.ac_hsef");
mi_topusers.myClass = BA.getDeviceClass ("com.it.fome.mi_topusers");
ac_tsearch.myClass = BA.getDeviceClass ("com.it.fome.ac_tsearch");
mt_sef.myClass = BA.getDeviceClass ("com.it.fome.mt_sef");
ac_tcoin.myClass = BA.getDeviceClass ("com.it.fome.ac_tcoin");
ac_home.myClass = BA.getDeviceClass ("com.it.fome.ac_home");
act_chat.myClass = BA.getDeviceClass ("com.it.fome.act_chat");
starter.myClass = BA.getDeviceClass ("com.it.fome.starter");
nb6.myClass = BA.getDeviceClass ("com.it.fome.nb6");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 22;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}