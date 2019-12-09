package com.it.fome;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class starter_subs_0 {


public static RemoteObject  _application_error(RemoteObject _error,RemoteObject _stacktrace) throws Exception{
try {
		Debug.PushSubsStack("Application_Error (starter) ","starter",17,starter.processBA,starter.mostCurrent,29);
if (RapidSub.canDelegate("application_error")) { return com.it.fome.starter.remoteMe.runUserSub(false, "starter","application_error", _error, _stacktrace);}
Debug.locals.put("Error", _error);
Debug.locals.put("StackTrace", _stacktrace);
 BA.debugLineNum = 29;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 30;BA.debugLine="Return True";
Debug.ShouldStop(536870912);
if (true) return starter.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 31;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _service_create() throws Exception{
try {
		Debug.PushSubsStack("Service_Create (starter) ","starter",17,starter.processBA,starter.mostCurrent,12);
if (RapidSub.canDelegate("service_create")) { return com.it.fome.starter.remoteMe.runUserSub(false, "starter","service_create");}
 BA.debugLineNum = 12;BA.debugLine="Sub Service_Create";
Debug.ShouldStop(2048);
 BA.debugLineNum = 15;BA.debugLine="CallSubDelayed(FirebaseMessaging, \"SubscribeToTop";
Debug.ShouldStop(16384);
starter.mostCurrent.__c.runVoidMethod ("CallSubDelayed",starter.processBA,(Object)((starter.mostCurrent._firebasemessaging.getObject())),(Object)(RemoteObject.createImmutable("SubscribeToTopics")));
 BA.debugLineNum = 17;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _service_destroy() throws Exception{
try {
		Debug.PushSubsStack("Service_Destroy (starter) ","starter",17,starter.processBA,starter.mostCurrent,33);
if (RapidSub.canDelegate("service_destroy")) { return com.it.fome.starter.remoteMe.runUserSub(false, "starter","service_destroy");}
 BA.debugLineNum = 33;BA.debugLine="Sub Service_Destroy";
Debug.ShouldStop(1);
 BA.debugLineNum = 35;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _service_start(RemoteObject _startingintent) throws Exception{
try {
		Debug.PushSubsStack("Service_Start (starter) ","starter",17,starter.processBA,starter.mostCurrent,19);
if (RapidSub.canDelegate("service_start")) { return com.it.fome.starter.remoteMe.runUserSub(false, "starter","service_start", _startingintent);}
Debug.locals.put("StartingIntent", _startingintent);
 BA.debugLineNum = 19;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 22;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _service_taskremoved() throws Exception{
try {
		Debug.PushSubsStack("Service_TaskRemoved (starter) ","starter",17,starter.processBA,starter.mostCurrent,24);
if (RapidSub.canDelegate("service_taskremoved")) { return com.it.fome.starter.remoteMe.runUserSub(false, "starter","service_taskremoved");}
 BA.debugLineNum = 24;BA.debugLine="Sub Service_TaskRemoved";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 26;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}