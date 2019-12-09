package com.it.fome;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class nb6_subs_0 {


public static RemoteObject  _addbuttonaction(RemoteObject __ref,RemoteObject _bmp,RemoteObject _title,RemoteObject _service,RemoteObject _action) throws Exception{
try {
		Debug.PushSubsStack("AddButtonAction (nb6) ","nb6",18,__ref.getField(false, "ba"),__ref,69);
if (RapidSub.canDelegate("addbuttonaction")) { return __ref.runUserSub(false, "nb6","addbuttonaction", __ref, _bmp, _title, _service, _action);}
RemoteObject _ac = RemoteObject.declareNull("Object");
Debug.locals.put("Bmp", _bmp);
Debug.locals.put("Title", _title);
Debug.locals.put("Service", _service);
Debug.locals.put("Action", _action);
 BA.debugLineNum = 69;BA.debugLine="Public Sub AddButtonAction (Bmp As Bitmap, Title A";
Debug.ShouldStop(16);
 BA.debugLineNum = 70;BA.debugLine="If IsBuilder = False Then Return Me";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (com.it.fome.nb6.class, "_isbuilder" /*RemoteObject*/ ),nb6.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 71;BA.debugLine="Dim ac As Object = CreateAction(Bmp, Title, Creat";
Debug.ShouldStop(64);
_ac = __ref.runClassMethod (com.it.fome.nb6.class, "_createaction" /*RemoteObject*/ ,(Object)(_bmp),(Object)(_title),(Object)(__ref.runClassMethod (com.it.fome.nb6.class, "_createreceiverpendingintent" /*RemoteObject*/ ,(Object)(_service),(Object)(_action))));Debug.locals.put("ac", _ac);Debug.locals.put("ac", _ac);
 BA.debugLineNum = 72;BA.debugLine="NotificationBuilder.RunMethod(\"addAction\", Array(";
Debug.ShouldStop(128);
__ref.getField(false,"_notificationbuilder" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("addAction")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {_ac})));
 BA.debugLineNum = 73;BA.debugLine="Return Me";
Debug.ShouldStop(256);
if (true) return (__ref);
 BA.debugLineNum = 74;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _autocancel(RemoteObject __ref,RemoteObject _cancel) throws Exception{
try {
		Debug.PushSubsStack("AutoCancel (nb6) ","nb6",18,__ref.getField(false, "ba"),__ref,119);
if (RapidSub.canDelegate("autocancel")) { return __ref.runUserSub(false, "nb6","autocancel", __ref, _cancel);}
Debug.locals.put("Cancel", _cancel);
 BA.debugLineNum = 119;BA.debugLine="Public Sub AutoCancel (Cancel As Boolean) As NB6";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 120;BA.debugLine="If IsOld Then";
Debug.ShouldStop(8388608);
if (__ref.runClassMethod (com.it.fome.nb6.class, "_isold" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 121;BA.debugLine="OldNotification.AutoCancel = Cancel";
Debug.ShouldStop(16777216);
__ref.getField(false,"_oldnotification" /*RemoteObject*/ ).runVoidMethod ("setAutoCancel",_cancel);
 }else {
 BA.debugLineNum = 123;BA.debugLine="NotificationBuilder.RunMethod(\"setAutoCancel\", A";
Debug.ShouldStop(67108864);
__ref.getField(false,"_notificationbuilder" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setAutoCancel")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_cancel)})));
 };
 BA.debugLineNum = 125;BA.debugLine="Return Me";
Debug.ShouldStop(268435456);
if (true) return (__ref);
 BA.debugLineNum = 126;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _badgeicontype(RemoteObject __ref,RemoteObject _icontype) throws Exception{
try {
		Debug.PushSubsStack("BadgeIconType (nb6) ","nb6",18,__ref.getField(false, "ba"),__ref,130);
if (RapidSub.canDelegate("badgeicontype")) { return __ref.runUserSub(false, "nb6","badgeicontype", __ref, _icontype);}
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("IconType", _icontype);
 BA.debugLineNum = 130;BA.debugLine="Public Sub BadgeIconType (IconType As String) As N";
Debug.ShouldStop(2);
 BA.debugLineNum = 131;BA.debugLine="If SdkLevel >= 26 Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("g",__ref.getField(true,"_sdklevel" /*RemoteObject*/ ),BA.numberCast(double.class, 26))) { 
 BA.debugLineNum = 132;BA.debugLine="Dim m As Map = CreateMap(\"LARGE\": 2, \"NONE\": 0,";
Debug.ShouldStop(8);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_m = nb6.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("LARGE")),RemoteObject.createImmutable((2)),RemoteObject.createImmutable(("NONE")),RemoteObject.createImmutable((0)),RemoteObject.createImmutable(("SMALL")),RemoteObject.createImmutable((1))}));Debug.locals.put("m", _m);Debug.locals.put("m", _m);
 BA.debugLineNum = 133;BA.debugLine="NotificationBuilder.RunMethod(\"setBadgeIconType\"";
Debug.ShouldStop(16);
__ref.getField(false,"_notificationbuilder" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setBadgeIconType")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {_m.runMethod(false,"Get",(Object)((_icontype)))})));
 };
 BA.debugLineNum = 135;BA.debugLine="Return Me";
Debug.ShouldStop(64);
if (true) return (__ref);
 BA.debugLineNum = 136;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _bigpicturestyle(RemoteObject __ref,RemoteObject _largeiconbmp,RemoteObject _picture,RemoteObject _contenttitle,RemoteObject _summarytext) throws Exception{
try {
		Debug.PushSubsStack("BigPictureStyle (nb6) ","nb6",18,__ref.getField(false, "ba"),__ref,235);
if (RapidSub.canDelegate("bigpicturestyle")) { return __ref.runUserSub(false, "nb6","bigpicturestyle", __ref, _largeiconbmp, _picture, _contenttitle, _summarytext);}
Debug.locals.put("LargeIconBmp", _largeiconbmp);
Debug.locals.put("Picture", _picture);
Debug.locals.put("ContentTitle", _contenttitle);
Debug.locals.put("SummaryText", _summarytext);
 BA.debugLineNum = 235;BA.debugLine="Public Sub BigPictureStyle(LargeIconBmp As Bitmap,";
Debug.ShouldStop(1024);
 BA.debugLineNum = 236;BA.debugLine="If IsBuilder Then";
Debug.ShouldStop(2048);
if (__ref.runClassMethod (com.it.fome.nb6.class, "_isbuilder" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 237;BA.debugLine="SetStyle(\"android.app.Notification$BigPictureSty";
Debug.ShouldStop(4096);
__ref.runClassMethod (com.it.fome.nb6.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("android.app.Notification$BigPictureStyle")),(Object)(nb6.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("bigLargeIcon")),(_largeiconbmp.getObject()),RemoteObject.createImmutable(("bigPicture")),(_picture.getObject()),RemoteObject.createImmutable(("setBigContentTitle")),_contenttitle,RemoteObject.createImmutable(("setSummaryText")),_summarytext}))));
 };
 BA.debugLineNum = 243;BA.debugLine="Return Me";
Debug.ShouldStop(262144);
if (true) return (__ref);
 BA.debugLineNum = 244;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _bigtextstyle(RemoteObject __ref,RemoteObject _contenttitle,RemoteObject _summarytext,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("BigTextStyle (nb6) ","nb6",18,__ref.getField(false, "ba"),__ref,247);
if (RapidSub.canDelegate("bigtextstyle")) { return __ref.runUserSub(false, "nb6","bigtextstyle", __ref, _contenttitle, _summarytext, _text);}
Debug.locals.put("ContentTitle", _contenttitle);
Debug.locals.put("SummaryText", _summarytext);
Debug.locals.put("Text", _text);
 BA.debugLineNum = 247;BA.debugLine="Public Sub BigTextStyle (ContentTitle As Object, S";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 248;BA.debugLine="If IsBuilder Then";
Debug.ShouldStop(8388608);
if (__ref.runClassMethod (com.it.fome.nb6.class, "_isbuilder" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 249;BA.debugLine="SetStyle(\"android.app.Notification$BigTextStyle\"";
Debug.ShouldStop(16777216);
__ref.runClassMethod (com.it.fome.nb6.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("android.app.Notification$BigTextStyle")),(Object)(nb6.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("bigText")),_text,RemoteObject.createImmutable(("setBigContentTitle")),_contenttitle,RemoteObject.createImmutable(("setSummaryText")),_summarytext}))));
 };
 BA.debugLineNum = 252;BA.debugLine="Return Me";
Debug.ShouldStop(134217728);
if (true) return (__ref);
 BA.debugLineNum = 253;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _build(RemoteObject __ref,RemoteObject _contenttitle,RemoteObject _contenttext,RemoteObject _tag,RemoteObject _activity) throws Exception{
try {
		Debug.PushSubsStack("Build (nb6) ","nb6",18,__ref.getField(false, "ba"),__ref,272);
if (RapidSub.canDelegate("build")) { return __ref.runUserSub(false, "nb6","build", __ref, _contenttitle, _contenttext, _tag, _activity);}
RemoteObject _in = RemoteObject.declareNull("anywheresoftware.b4a.objects.IntentWrapper");
RemoteObject _pendingintent = RemoteObject.declareNull("Object");
RemoteObject _manager = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("ContentTitle", _contenttitle);
Debug.locals.put("ContentText", _contenttext);
Debug.locals.put("Tag", _tag);
Debug.locals.put("Activity", _activity);
 BA.debugLineNum = 272;BA.debugLine="Public Sub Build (ContentTitle As Object, ContentT";
Debug.ShouldStop(32768);
 BA.debugLineNum = 273;BA.debugLine="If IsOld Then";
Debug.ShouldStop(65536);
if (__ref.runClassMethod (com.it.fome.nb6.class, "_isold" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 274;BA.debugLine="OldNotification.SetInfo2(ContentTitle, ContentTe";
Debug.ShouldStop(131072);
__ref.getField(false,"_oldnotification" /*RemoteObject*/ ).runVoidMethod ("SetInfo2New",__ref.getField(false, "ba"),(Object)(BA.ObjectToCharSequence(_contenttitle)),(Object)(BA.ObjectToCharSequence(_contenttext)),(Object)(BA.ObjectToCharSequence(_tag)),(Object)(_activity));
 BA.debugLineNum = 275;BA.debugLine="Return OldNotification";
Debug.ShouldStop(262144);
if (true) return __ref.getField(false,"_oldnotification" /*RemoteObject*/ );
 }else {
 BA.debugLineNum = 277;BA.debugLine="Dim in As Intent = CreateIntent(Activity, False)";
Debug.ShouldStop(1048576);
_in = RemoteObject.createNew ("anywheresoftware.b4a.objects.IntentWrapper");
_in = __ref.runClassMethod (com.it.fome.nb6.class, "_createintent" /*RemoteObject*/ ,(Object)(_activity),(Object)(nb6.__c.getField(true,"False")));Debug.locals.put("in", _in);Debug.locals.put("in", _in);
 BA.debugLineNum = 278;BA.debugLine="in.Flags = Bit.Or(268435456, 131072) 'FLAG_ACTIV";
Debug.ShouldStop(2097152);
_in.runMethod(true,"setFlags",nb6.__c.getField(false,"Bit").runMethod(true,"Or",(Object)(BA.numberCast(int.class, 268435456)),(Object)(BA.numberCast(int.class, 131072))));
 BA.debugLineNum = 279;BA.debugLine="in.PutExtra(\"Notification_Tag\", Tag)";
Debug.ShouldStop(4194304);
_in.runVoidMethod ("PutExtra",(Object)(BA.ObjectToString("Notification_Tag")),(Object)((_tag)));
 BA.debugLineNum = 280;BA.debugLine="Dim PendingIntent As Object = PendingIntentStati";
Debug.ShouldStop(8388608);
_pendingintent = __ref.getField(false,"_pendingintentstatic" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getActivity")),(Object)(RemoteObject.createNewArray("Object",new int[] {4},new Object[] {(__ref.getField(false,"_ctxt" /*RemoteObject*/ ).getObject()),(nb6.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0x7fffffff)))),(_in.getObject()),RemoteObject.createImmutable((0))})));Debug.locals.put("PendingIntent", _pendingintent);Debug.locals.put("PendingIntent", _pendingintent);
 BA.debugLineNum = 281;BA.debugLine="NotificationBuilder.RunMethodJO(\"setContentTitle";
Debug.ShouldStop(16777216);
__ref.getField(false,"_notificationbuilder" /*RemoteObject*/ ).runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("setContentTitle")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {_contenttitle}))).runVoidMethod ("RunMethodJO",(Object)(BA.ObjectToString("setContentText")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {_contenttext})));
 BA.debugLineNum = 282;BA.debugLine="NotificationBuilder.RunMethod(\"setContentIntent\"";
Debug.ShouldStop(33554432);
__ref.getField(false,"_notificationbuilder" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setContentIntent")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {_pendingintent})));
 BA.debugLineNum = 284;BA.debugLine="If IsChannel Then";
Debug.ShouldStop(134217728);
if (__ref.runClassMethod (com.it.fome.nb6.class, "_ischannel" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 285;BA.debugLine="Dim manager As JavaObject = ctxt.RunMethod(\"get";
Debug.ShouldStop(268435456);
_manager = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_manager.setObject(__ref.getField(false,"_ctxt" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getSystemService")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("notification"))}))));Debug.locals.put("manager", _manager);
 BA.debugLineNum = 286;BA.debugLine="manager.RunMethod(\"createNotificationChannel\",";
Debug.ShouldStop(536870912);
_manager.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("createNotificationChannel")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(__ref.getField(false,"_channel" /*RemoteObject*/ ).getObject())})));
 };
 BA.debugLineNum = 289;BA.debugLine="Return NotificationBuilder.RunMethod(\"build\", Nu";
Debug.ShouldStop(1);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.NotificationWrapper"), __ref.getField(false,"_notificationbuilder" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("build")),(Object)((nb6.__c.getField(false,"Null")))));
 };
 BA.debugLineNum = 291;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private Channel As JavaObject";
nb6._channel = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");__ref.setField("_channel",nb6._channel);
 //BA.debugLineNum = 4;BA.debugLine="Private NotificationBuilder As JavaObject";
nb6._notificationbuilder = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");__ref.setField("_notificationbuilder",nb6._notificationbuilder);
 //BA.debugLineNum = 5;BA.debugLine="Private SdkLevel As Int";
nb6._sdklevel = RemoteObject.createImmutable(0);__ref.setField("_sdklevel",nb6._sdklevel);
 //BA.debugLineNum = 6;BA.debugLine="Private ctxt As JavaObject";
nb6._ctxt = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");__ref.setField("_ctxt",nb6._ctxt);
 //BA.debugLineNum = 7;BA.debugLine="Private const S_OLD = 0, S_BUILDER = 1, S_CHANNEL";
nb6._s_old = BA.numberCast(int.class, 0);__ref.setField("_s_old",nb6._s_old);
nb6._s_builder = BA.numberCast(int.class, 1);__ref.setField("_s_builder",nb6._s_builder);
nb6._s_channel = BA.numberCast(int.class, 2);__ref.setField("_s_channel",nb6._s_channel);
 //BA.debugLineNum = 8;BA.debugLine="Private SupportLevel As Int";
nb6._supportlevel = RemoteObject.createImmutable(0);__ref.setField("_supportlevel",nb6._supportlevel);
 //BA.debugLineNum = 9;BA.debugLine="Private OldNotification As Notification";
nb6._oldnotification = RemoteObject.createNew ("anywheresoftware.b4a.objects.NotificationWrapper");__ref.setField("_oldnotification",nb6._oldnotification);
 //BA.debugLineNum = 10;BA.debugLine="Private PendingIntentStatic As JavaObject";
nb6._pendingintentstatic = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");__ref.setField("_pendingintentstatic",nb6._pendingintentstatic);
 //BA.debugLineNum = 11;BA.debugLine="Private NotificationStatic As JavaObject";
nb6._notificationstatic = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");__ref.setField("_notificationstatic",nb6._notificationstatic);
 //BA.debugLineNum = 12;BA.debugLine="Private common As JavaObject";
nb6._common = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");__ref.setField("_common",nb6._common);
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _color(RemoteObject __ref,RemoteObject _clr) throws Exception{
try {
		Debug.PushSubsStack("Color (nb6) ","nb6",18,__ref.getField(false, "ba"),__ref,139);
if (RapidSub.canDelegate("color")) { return __ref.runUserSub(false, "nb6","color", __ref, _clr);}
Debug.locals.put("Clr", _clr);
 BA.debugLineNum = 139;BA.debugLine="Public Sub Color (Clr As Int) As NB6";
Debug.ShouldStop(1024);
 BA.debugLineNum = 140;BA.debugLine="If IsBuilder Then";
Debug.ShouldStop(2048);
if (__ref.runClassMethod (com.it.fome.nb6.class, "_isbuilder" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 141;BA.debugLine="NotificationBuilder.RunMethod(\"setColor\", Array(";
Debug.ShouldStop(4096);
__ref.getField(false,"_notificationbuilder" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setColor")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_clr)})));
 };
 BA.debugLineNum = 143;BA.debugLine="Return Me";
Debug.ShouldStop(16384);
if (true) return (__ref);
 BA.debugLineNum = 144;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createaction(RemoteObject __ref,RemoteObject _bmp,RemoteObject _title,RemoteObject _pendingintent) throws Exception{
try {
		Debug.PushSubsStack("CreateAction (nb6) ","nb6",18,__ref.getField(false, "ba"),__ref,306);
if (RapidSub.canDelegate("createaction")) { return __ref.runUserSub(false, "nb6","createaction", __ref, _bmp, _title, _pendingintent);}
RemoteObject _builder = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("Bmp", _bmp);
Debug.locals.put("Title", _title);
Debug.locals.put("PendingIntent", _pendingintent);
 BA.debugLineNum = 306;BA.debugLine="Private Sub CreateAction (Bmp As Bitmap, Title As";
Debug.ShouldStop(131072);
 BA.debugLineNum = 307;BA.debugLine="Dim builder As JavaObject";
Debug.ShouldStop(262144);
_builder = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("builder", _builder);
 BA.debugLineNum = 308;BA.debugLine="builder.InitializeNewInstance(\"android.app.Notifi";
Debug.ShouldStop(524288);
_builder.runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("android.app.Notification$Action$Builder")),(Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {__ref.runClassMethod (com.it.fome.nb6.class, "_createiconfrombitmap" /*RemoteObject*/ ,(Object)(_bmp)),_title,_pendingintent})));
 BA.debugLineNum = 309;BA.debugLine="Return builder.RunMethod(\"build\", Null)";
Debug.ShouldStop(1048576);
if (true) return _builder.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("build")),(Object)((nb6.__c.getField(false,"Null"))));
 BA.debugLineNum = 310;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createiconfrombitmap(RemoteObject __ref,RemoteObject _bmp) throws Exception{
try {
		Debug.PushSubsStack("CreateIconFromBitmap (nb6) ","nb6",18,__ref.getField(false, "ba"),__ref,312);
if (RapidSub.canDelegate("createiconfrombitmap")) { return __ref.runUserSub(false, "nb6","createiconfrombitmap", __ref, _bmp);}
RemoteObject _icon = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 312;BA.debugLine="Private Sub CreateIconFromBitmap(bmp As Bitmap) As";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 313;BA.debugLine="If bmp = Null Or bmp.IsInitialized = False Then R";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("n",_bmp) || RemoteObject.solveBoolean("=",_bmp.runMethod(true,"IsInitialized"),nb6.__c.getField(true,"False"))) { 
if (true) return RemoteObject.createImmutable((0));};
 BA.debugLineNum = 314;BA.debugLine="Dim icon As JavaObject";
Debug.ShouldStop(33554432);
_icon = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("icon", _icon);
 BA.debugLineNum = 315;BA.debugLine="Return icon.InitializeStatic(\"android.graphics.dr";
Debug.ShouldStop(67108864);
if (true) return _icon.runMethod(false,"InitializeStatic",(Object)(RemoteObject.createImmutable("android.graphics.drawable.Icon"))).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("createWithBitmap")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_bmp.getObject())})));
 BA.debugLineNum = 316;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createintent(RemoteObject __ref,RemoteObject _target,RemoteObject _receiver) throws Exception{
try {
		Debug.PushSubsStack("CreateIntent (nb6) ","nb6",18,__ref.getField(false, "ba"),__ref,299);
if (RapidSub.canDelegate("createintent")) { return __ref.runUserSub(false, "nb6","createintent", __ref, _target, _receiver);}
RemoteObject _in = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("Target", _target);
Debug.locals.put("Receiver", _receiver);
 BA.debugLineNum = 299;BA.debugLine="Private Sub CreateIntent (Target As Object, Receiv";
Debug.ShouldStop(1024);
 BA.debugLineNum = 300;BA.debugLine="Target = common.RunMethod(\"getComponentClass\", Ar";
Debug.ShouldStop(2048);
_target = __ref.getField(false,"_common" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getComponentClass")),(Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {nb6.__c.getField(false,"Null"),_target,(_receiver)})));Debug.locals.put("Target", _target);
 BA.debugLineNum = 301;BA.debugLine="Dim in As JavaObject";
Debug.ShouldStop(4096);
_in = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("in", _in);
 BA.debugLineNum = 302;BA.debugLine="in.InitializeNewInstance(\"android.content.Intent\"";
Debug.ShouldStop(8192);
_in.runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("android.content.Intent")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(__ref.getField(false,"_ctxt" /*RemoteObject*/ ).getObject()),_target})));
 BA.debugLineNum = 303;BA.debugLine="Return in";
Debug.ShouldStop(16384);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.IntentWrapper"), _in.getObject());
 BA.debugLineNum = 304;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createreceiverpendingintent(RemoteObject __ref,RemoteObject _service,RemoteObject _action) throws Exception{
try {
		Debug.PushSubsStack("CreateReceiverPendingIntent (nb6) ","nb6",18,__ref.getField(false, "ba"),__ref,293);
if (RapidSub.canDelegate("createreceiverpendingintent")) { return __ref.runUserSub(false, "nb6","createreceiverpendingintent", __ref, _service, _action);}
RemoteObject _in = RemoteObject.declareNull("anywheresoftware.b4a.objects.IntentWrapper");
Debug.locals.put("Service", _service);
Debug.locals.put("Action", _action);
 BA.debugLineNum = 293;BA.debugLine="Private Sub CreateReceiverPendingIntent (Service A";
Debug.ShouldStop(16);
 BA.debugLineNum = 294;BA.debugLine="Dim in As Intent = CreateIntent(Service, True)";
Debug.ShouldStop(32);
_in = RemoteObject.createNew ("anywheresoftware.b4a.objects.IntentWrapper");
_in = __ref.runClassMethod (com.it.fome.nb6.class, "_createintent" /*RemoteObject*/ ,(Object)(_service),(Object)(nb6.__c.getField(true,"True")));Debug.locals.put("in", _in);Debug.locals.put("in", _in);
 BA.debugLineNum = 295;BA.debugLine="in.Action = Action";
Debug.ShouldStop(64);
_in.runMethod(true,"setAction",_action);
 BA.debugLineNum = 296;BA.debugLine="Return PendingIntentStatic.RunMethod(\"getBroadcas";
Debug.ShouldStop(128);
if (true) return __ref.getField(false,"_pendingintentstatic" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getBroadcast")),(Object)(RemoteObject.createNewArray("Object",new int[] {4},new Object[] {(__ref.getField(false,"_ctxt" /*RemoteObject*/ ).getObject()),RemoteObject.createImmutable((1)),(_in.getObject()),RemoteObject.createImmutable((0))})));
 BA.debugLineNum = 297;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _customsound(RemoteObject __ref,RemoteObject _fileprovideruri) throws Exception{
try {
		Debug.PushSubsStack("CustomSound (nb6) ","nb6",18,__ref.getField(false, "ba"),__ref,208);
if (RapidSub.canDelegate("customsound")) { return __ref.runUserSub(false, "nb6","customsound", __ref, _fileprovideruri);}
Debug.locals.put("FileProviderUri", _fileprovideruri);
 BA.debugLineNum = 208;BA.debugLine="Public Sub CustomSound (FileProviderUri As Object)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 209;BA.debugLine="If IsOld Then Return Me";
Debug.ShouldStop(65536);
if (__ref.runClassMethod (com.it.fome.nb6.class, "_isold" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
if (true) return (__ref);};
 BA.debugLineNum = 210;BA.debugLine="ctxt.RunMethod(\"grantUriPermission\", Array(\"com.a";
Debug.ShouldStop(131072);
__ref.getField(false,"_ctxt" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("grantUriPermission")),(Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {RemoteObject.createImmutable(("com.android.systemui")),_fileprovideruri,RemoteObject.createImmutable((1))})));
 BA.debugLineNum = 211;BA.debugLine="If IsBuilder Then";
Debug.ShouldStop(262144);
if (__ref.runClassMethod (com.it.fome.nb6.class, "_isbuilder" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 212;BA.debugLine="NotificationBuilder.RunMethod(\"setSound\", Array(";
Debug.ShouldStop(524288);
__ref.getField(false,"_notificationbuilder" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setSound")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {_fileprovideruri,__ref.getField(false,"_notificationstatic" /*RemoteObject*/ ).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("AUDIO_ATTRIBUTES_DEFAULT")))})));
 BA.debugLineNum = 213;BA.debugLine="If IsChannel Then";
Debug.ShouldStop(1048576);
if (__ref.runClassMethod (com.it.fome.nb6.class, "_ischannel" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 214;BA.debugLine="Channel.RunMethod(\"setSound\", Array(FileProvide";
Debug.ShouldStop(2097152);
__ref.getField(false,"_channel" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setSound")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {_fileprovideruri,__ref.getField(false,"_notificationstatic" /*RemoteObject*/ ).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("AUDIO_ATTRIBUTES_DEFAULT")))})));
 };
 };
 BA.debugLineNum = 217;BA.debugLine="Return Me";
Debug.ShouldStop(16777216);
if (true) return (__ref);
 BA.debugLineNum = 218;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _deleteaction(RemoteObject __ref,RemoteObject _service,RemoteObject _action) throws Exception{
try {
		Debug.PushSubsStack("DeleteAction (nb6) ","nb6",18,__ref.getField(false, "ba"),__ref,79);
if (RapidSub.canDelegate("deleteaction")) { return __ref.runUserSub(false, "nb6","deleteaction", __ref, _service, _action);}
Debug.locals.put("Service", _service);
Debug.locals.put("Action", _action);
 BA.debugLineNum = 79;BA.debugLine="Public Sub DeleteAction (Service As Object, Action";
Debug.ShouldStop(16384);
 BA.debugLineNum = 80;BA.debugLine="If IsBuilder Then";
Debug.ShouldStop(32768);
if (__ref.runClassMethod (com.it.fome.nb6.class, "_isbuilder" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 81;BA.debugLine="NotificationBuilder.RunMethod(\"setDeleteIntent\",";
Debug.ShouldStop(65536);
__ref.getField(false,"_notificationbuilder" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setDeleteIntent")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {__ref.runClassMethod (com.it.fome.nb6.class, "_createreceiverpendingintent" /*RemoteObject*/ ,(Object)(_service),(Object)(_action))})));
 };
 BA.debugLineNum = 83;BA.debugLine="Return Me";
Debug.ShouldStop(262144);
if (true) return (__ref);
 BA.debugLineNum = 84;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _channelid,RemoteObject _channelname,RemoteObject _importancelevel) throws Exception{
try {
		Debug.PushSubsStack("Initialize (nb6) ","nb6",18,__ref.getField(false, "ba"),__ref,27);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "nb6","initialize", __ref, _ba, _channelid, _channelname, _importancelevel);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _im = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _pm = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _p = RemoteObject.createImmutable(0);
Debug.locals.put("ba", _ba);
Debug.locals.put("ChannelId", _channelid);
Debug.locals.put("ChannelName", _channelname);
Debug.locals.put("ImportanceLevel", _importancelevel);
 BA.debugLineNum = 27;BA.debugLine="Public Sub Initialize (ChannelId As String, Channe";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 28;BA.debugLine="ctxt.InitializeContext";
Debug.ShouldStop(134217728);
__ref.getField(false,"_ctxt" /*RemoteObject*/ ).runVoidMethod ("InitializeContext",__ref.getField(false, "ba"));
 BA.debugLineNum = 29;BA.debugLine="PendingIntentStatic.InitializeStatic(\"android.app";
Debug.ShouldStop(268435456);
__ref.getField(false,"_pendingintentstatic" /*RemoteObject*/ ).runVoidMethod ("InitializeStatic",(Object)(RemoteObject.createImmutable("android.app.PendingIntent")));
 BA.debugLineNum = 30;BA.debugLine="NotificationStatic.InitializeStatic(\"android.app.";
Debug.ShouldStop(536870912);
__ref.getField(false,"_notificationstatic" /*RemoteObject*/ ).runVoidMethod ("InitializeStatic",(Object)(RemoteObject.createImmutable("android.app.Notification")));
 BA.debugLineNum = 31;BA.debugLine="common.InitializeStatic(\"anywheresoftware.b4a.key";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_common" /*RemoteObject*/ ).runVoidMethod ("InitializeStatic",(Object)(RemoteObject.createImmutable("anywheresoftware.b4a.keywords.Common")));
 BA.debugLineNum = 32;BA.debugLine="Dim jo As JavaObject";
Debug.ShouldStop(-2147483648);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("jo", _jo);
 BA.debugLineNum = 33;BA.debugLine="SdkLevel = jo.InitializeStatic(\"android.os.Build$";
Debug.ShouldStop(1);
__ref.setField ("_sdklevel" /*RemoteObject*/ ,BA.numberCast(int.class, _jo.runMethod(false,"InitializeStatic",(Object)(RemoteObject.createImmutable("android.os.Build$VERSION"))).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("SDK_INT")))));
 BA.debugLineNum = 34;BA.debugLine="If SdkLevel < 23 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("<",__ref.getField(true,"_sdklevel" /*RemoteObject*/ ),BA.numberCast(double.class, 23))) { 
 BA.debugLineNum = 35;BA.debugLine="SupportLevel = S_OLD";
Debug.ShouldStop(4);
__ref.setField ("_supportlevel" /*RemoteObject*/ ,__ref.getField(true,"_s_old" /*RemoteObject*/ ));
 }else 
{ BA.debugLineNum = 36;BA.debugLine="Else if SdkLevel >= 26 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("g",__ref.getField(true,"_sdklevel" /*RemoteObject*/ ),BA.numberCast(double.class, 26))) { 
 BA.debugLineNum = 37;BA.debugLine="SupportLevel = S_CHANNEL";
Debug.ShouldStop(16);
__ref.setField ("_supportlevel" /*RemoteObject*/ ,__ref.getField(true,"_s_channel" /*RemoteObject*/ ));
 }else {
 BA.debugLineNum = 39;BA.debugLine="SupportLevel = S_BUILDER";
Debug.ShouldStop(64);
__ref.setField ("_supportlevel" /*RemoteObject*/ ,__ref.getField(true,"_s_builder" /*RemoteObject*/ ));
 }}
;
 BA.debugLineNum = 41;BA.debugLine="If IsOld Then";
Debug.ShouldStop(256);
if (__ref.runClassMethod (com.it.fome.nb6.class, "_isold" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 42;BA.debugLine="OldNotification.Initialize";
Debug.ShouldStop(512);
__ref.getField(false,"_oldnotification" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 43;BA.debugLine="OldNotification.Icon = \"icon\"";
Debug.ShouldStop(1024);
__ref.getField(false,"_oldnotification" /*RemoteObject*/ ).runVoidMethod ("setIcon",BA.ObjectToString("icon"));
 }else 
{ BA.debugLineNum = 44;BA.debugLine="Else if IsChannel Then";
Debug.ShouldStop(2048);
if (__ref.runClassMethod (com.it.fome.nb6.class, "_ischannel" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 45;BA.debugLine="ChannelId = ChannelId & \"_\" & ImportanceLevel";
Debug.ShouldStop(4096);
_channelid = RemoteObject.concat(_channelid,RemoteObject.createImmutable("_"),_importancelevel);Debug.locals.put("ChannelId", _channelid);
 BA.debugLineNum = 46;BA.debugLine="NotificationBuilder.InitializeNewInstance(\"andro";
Debug.ShouldStop(8192);
__ref.getField(false,"_notificationbuilder" /*RemoteObject*/ ).runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("android.app.Notification$Builder")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(__ref.getField(false,"_ctxt" /*RemoteObject*/ ).getObject()),(_channelid)})));
 BA.debugLineNum = 47;BA.debugLine="Dim im As Map = CreateMap(\"MIN\": 1, \"LOW\": 2, \"D";
Debug.ShouldStop(16384);
_im = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_im = nb6.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("MIN")),RemoteObject.createImmutable((1)),RemoteObject.createImmutable(("LOW")),RemoteObject.createImmutable((2)),RemoteObject.createImmutable(("DEFAULT")),RemoteObject.createImmutable((3)),RemoteObject.createImmutable(("HIGH")),RemoteObject.createImmutable((4))}));Debug.locals.put("im", _im);Debug.locals.put("im", _im);
 BA.debugLineNum = 48;BA.debugLine="Dim i As Int = im.Get(ImportanceLevel)";
Debug.ShouldStop(32768);
_i = BA.numberCast(int.class, _im.runMethod(false,"Get",(Object)((_importancelevel))));Debug.locals.put("i", _i);Debug.locals.put("i", _i);
 BA.debugLineNum = 49;BA.debugLine="Channel.InitializeNewInstance(\"android.app.Notif";
Debug.ShouldStop(65536);
__ref.getField(false,"_channel" /*RemoteObject*/ ).runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("android.app.NotificationChannel")),(Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {(_channelid),(nb6.__c.getField(false,"Application").runMethod(true,"getLabelName")),(_i)})));
 }else {
 BA.debugLineNum = 51;BA.debugLine="NotificationBuilder.InitializeNewInstance(\"andro";
Debug.ShouldStop(262144);
__ref.getField(false,"_notificationbuilder" /*RemoteObject*/ ).runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("android.app.Notification$Builder")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(__ref.getField(false,"_ctxt" /*RemoteObject*/ ).getObject())})));
 BA.debugLineNum = 52;BA.debugLine="Dim pm As Map = CreateMap(\"MIN\": -2, \"LOW\": -1,";
Debug.ShouldStop(524288);
_pm = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_pm = nb6.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("MIN")),RemoteObject.createImmutable((-(double) (0 + 2))),RemoteObject.createImmutable(("LOW")),RemoteObject.createImmutable((-(double) (0 + 1))),RemoteObject.createImmutable(("DEFAULT")),RemoteObject.createImmutable((0)),RemoteObject.createImmutable(("HIGH")),RemoteObject.createImmutable((1))}));Debug.locals.put("pm", _pm);Debug.locals.put("pm", _pm);
 BA.debugLineNum = 53;BA.debugLine="Dim p As Int = pm.Get(ImportanceLevel)";
Debug.ShouldStop(1048576);
_p = BA.numberCast(int.class, _pm.runMethod(false,"Get",(Object)((_importancelevel))));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 54;BA.debugLine="NotificationBuilder.RunMethod(\"setPriority\", Arr";
Debug.ShouldStop(2097152);
__ref.getField(false,"_notificationbuilder" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setPriority")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_p)})));
 }}
;
 BA.debugLineNum = 56;BA.debugLine="If ImportanceLevel = \"DEFAULT\" Or ImportanceLevel";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",_importancelevel,BA.ObjectToString("DEFAULT")) || RemoteObject.solveBoolean("=",_importancelevel,BA.ObjectToString("HIGH"))) { 
 BA.debugLineNum = 57;BA.debugLine="SetDefaults(True, True, True)";
Debug.ShouldStop(16777216);
__ref.runClassMethod (com.it.fome.nb6.class, "_setdefaults" /*RemoteObject*/ ,(Object)(nb6.__c.getField(true,"True")),(Object)(nb6.__c.getField(true,"True")),(Object)(nb6.__c.getField(true,"True")));
 }else {
 BA.debugLineNum = 59;BA.debugLine="SetDefaults(False, True, True)";
Debug.ShouldStop(67108864);
__ref.runClassMethod (com.it.fome.nb6.class, "_setdefaults" /*RemoteObject*/ ,(Object)(nb6.__c.getField(true,"False")),(Object)(nb6.__c.getField(true,"True")),(Object)(nb6.__c.getField(true,"True")));
 };
 BA.debugLineNum = 61;BA.debugLine="Return Me";
Debug.ShouldStop(268435456);
if (true) return (__ref);
 BA.debugLineNum = 62;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isbuilder(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("IsBuilder (nb6) ","nb6",18,__ref.getField(false, "ba"),__ref,318);
if (RapidSub.canDelegate("isbuilder")) { return __ref.runUserSub(false, "nb6","isbuilder", __ref);}
 BA.debugLineNum = 318;BA.debugLine="Private Sub IsBuilder As Boolean";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 319;BA.debugLine="Return SupportLevel >= S_BUILDER";
Debug.ShouldStop(1073741824);
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean("g",__ref.getField(true,"_supportlevel" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_s_builder" /*RemoteObject*/ ))));
 BA.debugLineNum = 320;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ischannel(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("IsChannel (nb6) ","nb6",18,__ref.getField(false, "ba"),__ref,326);
if (RapidSub.canDelegate("ischannel")) { return __ref.runUserSub(false, "nb6","ischannel", __ref);}
 BA.debugLineNum = 326;BA.debugLine="Private Sub IsChannel As Boolean";
Debug.ShouldStop(32);
 BA.debugLineNum = 327;BA.debugLine="Return SupportLevel = S_CHANNEL";
Debug.ShouldStop(64);
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean("=",__ref.getField(true,"_supportlevel" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_s_channel" /*RemoteObject*/ ))));
 BA.debugLineNum = 328;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isold(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("IsOld (nb6) ","nb6",18,__ref.getField(false, "ba"),__ref,322);
if (RapidSub.canDelegate("isold")) { return __ref.runUserSub(false, "nb6","isold", __ref);}
 BA.debugLineNum = 322;BA.debugLine="Private Sub IsOld As Boolean";
Debug.ShouldStop(2);
 BA.debugLineNum = 323;BA.debugLine="Return SupportLevel = S_OLD";
Debug.ShouldStop(4);
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean("=",__ref.getField(true,"_supportlevel" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_s_old" /*RemoteObject*/ ))));
 BA.debugLineNum = 324;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _largeicon(RemoteObject __ref,RemoteObject _icon) throws Exception{
try {
		Debug.PushSubsStack("LargeIcon (nb6) ","nb6",18,__ref.getField(false, "ba"),__ref,103);
if (RapidSub.canDelegate("largeicon")) { return __ref.runUserSub(false, "nb6","largeicon", __ref, _icon);}
Debug.locals.put("Icon", _icon);
 BA.debugLineNum = 103;BA.debugLine="Public Sub LargeIcon (Icon As Bitmap) As NB6";
Debug.ShouldStop(64);
 BA.debugLineNum = 104;BA.debugLine="If IsBuilder Then";
Debug.ShouldStop(128);
if (__ref.runClassMethod (com.it.fome.nb6.class, "_isbuilder" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 105;BA.debugLine="NotificationBuilder.RunMethod(\"setLargeIcon\", Ar";
Debug.ShouldStop(256);
__ref.getField(false,"_notificationbuilder" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setLargeIcon")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {__ref.runClassMethod (com.it.fome.nb6.class, "_createiconfrombitmap" /*RemoteObject*/ ,(Object)(_icon))})));
 };
 BA.debugLineNum = 107;BA.debugLine="Return Me";
Debug.ShouldStop(1024);
if (true) return (__ref);
 BA.debugLineNum = 108;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _number(RemoteObject __ref,RemoteObject _num) throws Exception{
try {
		Debug.PushSubsStack("Number (nb6) ","nb6",18,__ref.getField(false, "ba"),__ref,147);
if (RapidSub.canDelegate("number")) { return __ref.runUserSub(false, "nb6","number", __ref, _num);}
Debug.locals.put("Num", _num);
 BA.debugLineNum = 147;BA.debugLine="Public Sub Number (Num As Int) As NB6";
Debug.ShouldStop(262144);
 BA.debugLineNum = 148;BA.debugLine="If IsOld Then";
Debug.ShouldStop(524288);
if (__ref.runClassMethod (com.it.fome.nb6.class, "_isold" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 149;BA.debugLine="OldNotification.Number = Num";
Debug.ShouldStop(1048576);
__ref.getField(false,"_oldnotification" /*RemoteObject*/ ).runMethod(true,"setNumber",_num);
 }else {
 BA.debugLineNum = 151;BA.debugLine="NotificationBuilder.RunMethod(\"setNumber\", Array";
Debug.ShouldStop(4194304);
__ref.getField(false,"_notificationbuilder" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setNumber")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_num)})));
 };
 BA.debugLineNum = 153;BA.debugLine="Return Me";
Debug.ShouldStop(16777216);
if (true) return (__ref);
 BA.debugLineNum = 154;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _oldnotificationicon(RemoteObject __ref,RemoteObject _resourcename) throws Exception{
try {
		Debug.PushSubsStack("OldNotificationIcon (nb6) ","nb6",18,__ref.getField(false, "ba"),__ref,87);
if (RapidSub.canDelegate("oldnotificationicon")) { return __ref.runUserSub(false, "nb6","oldnotificationicon", __ref, _resourcename);}
Debug.locals.put("ResourceName", _resourcename);
 BA.debugLineNum = 87;BA.debugLine="Public Sub OldNotificationIcon (ResourceName As St";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 88;BA.debugLine="If IsOld Then";
Debug.ShouldStop(8388608);
if (__ref.runClassMethod (com.it.fome.nb6.class, "_isold" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 89;BA.debugLine="OldNotification.Icon = ResourceName";
Debug.ShouldStop(16777216);
__ref.getField(false,"_oldnotification" /*RemoteObject*/ ).runVoidMethod ("setIcon",_resourcename);
 };
 BA.debugLineNum = 91;BA.debugLine="Return Me";
Debug.ShouldStop(67108864);
if (true) return (__ref);
 BA.debugLineNum = 92;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _onlyalertonce(RemoteObject __ref,RemoteObject _once) throws Exception{
try {
		Debug.PushSubsStack("OnlyAlertOnce (nb6) ","nb6",18,__ref.getField(false, "ba"),__ref,111);
if (RapidSub.canDelegate("onlyalertonce")) { return __ref.runUserSub(false, "nb6","onlyalertonce", __ref, _once);}
Debug.locals.put("Once", _once);
 BA.debugLineNum = 111;BA.debugLine="Public Sub OnlyAlertOnce (Once As Boolean) As NB6";
Debug.ShouldStop(16384);
 BA.debugLineNum = 112;BA.debugLine="If IsBuilder Then";
Debug.ShouldStop(32768);
if (__ref.runClassMethod (com.it.fome.nb6.class, "_isbuilder" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 113;BA.debugLine="NotificationBuilder.RunMethod(\"setOnlyAlertOnce\"";
Debug.ShouldStop(65536);
__ref.getField(false,"_notificationbuilder" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setOnlyAlertOnce")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_once)})));
 };
 BA.debugLineNum = 115;BA.debugLine="Return Me";
Debug.ShouldStop(262144);
if (true) return (__ref);
 BA.debugLineNum = 116;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _progress(RemoteObject __ref,RemoteObject _value,RemoteObject _maxvalue,RemoteObject _indeterminate) throws Exception{
try {
		Debug.PushSubsStack("Progress (nb6) ","nb6",18,__ref.getField(false, "ba"),__ref,169);
if (RapidSub.canDelegate("progress")) { return __ref.runUserSub(false, "nb6","progress", __ref, _value, _maxvalue, _indeterminate);}
Debug.locals.put("Value", _value);
Debug.locals.put("MaxValue", _maxvalue);
Debug.locals.put("Indeterminate", _indeterminate);
 BA.debugLineNum = 169;BA.debugLine="Public Sub Progress (Value As Int, MaxValue As Int";
Debug.ShouldStop(256);
 BA.debugLineNum = 170;BA.debugLine="If IsBuilder Then";
Debug.ShouldStop(512);
if (__ref.runClassMethod (com.it.fome.nb6.class, "_isbuilder" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 171;BA.debugLine="NotificationBuilder.RunMethod(\"setProgress\", Arr";
Debug.ShouldStop(1024);
__ref.getField(false,"_notificationbuilder" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setProgress")),(Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {(_maxvalue),(_value),(_indeterminate)})));
 };
 BA.debugLineNum = 173;BA.debugLine="Return Me";
Debug.ShouldStop(4096);
if (true) return (__ref);
 BA.debugLineNum = 174;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdefaults(RemoteObject __ref,RemoteObject _sound,RemoteObject _light,RemoteObject _vibrate) throws Exception{
try {
		Debug.PushSubsStack("SetDefaults (nb6) ","nb6",18,__ref.getField(false, "ba"),__ref,186);
if (RapidSub.canDelegate("setdefaults")) { return __ref.runUserSub(false, "nb6","setdefaults", __ref, _sound, _light, _vibrate);}
RemoteObject _currentdefaults = RemoteObject.createImmutable(0);
Debug.locals.put("Sound", _sound);
Debug.locals.put("Light", _light);
Debug.locals.put("Vibrate", _vibrate);
 BA.debugLineNum = 186;BA.debugLine="Public Sub SetDefaults (Sound As Boolean, Light As";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 187;BA.debugLine="If IsOld Then";
Debug.ShouldStop(67108864);
if (__ref.runClassMethod (com.it.fome.nb6.class, "_isold" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 188;BA.debugLine="OldNotification.Sound = Sound";
Debug.ShouldStop(134217728);
__ref.getField(false,"_oldnotification" /*RemoteObject*/ ).runVoidMethod ("setSound",_sound);
 BA.debugLineNum = 189;BA.debugLine="OldNotification.Light = Light";
Debug.ShouldStop(268435456);
__ref.getField(false,"_oldnotification" /*RemoteObject*/ ).runVoidMethod ("setLight",_light);
 BA.debugLineNum = 190;BA.debugLine="OldNotification.Vibrate = Vibrate";
Debug.ShouldStop(536870912);
__ref.getField(false,"_oldnotification" /*RemoteObject*/ ).runVoidMethod ("setVibrate",_vibrate);
 }else {
 BA.debugLineNum = 192;BA.debugLine="If IsChannel Then";
Debug.ShouldStop(-2147483648);
if (__ref.runClassMethod (com.it.fome.nb6.class, "_ischannel" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 193;BA.debugLine="Channel.RunMethod(\"enableLights\", Array(Light))";
Debug.ShouldStop(1);
__ref.getField(false,"_channel" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("enableLights")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_light)})));
 BA.debugLineNum = 194;BA.debugLine="Channel.RunMethod(\"enableVibration\", Array(Vibr";
Debug.ShouldStop(2);
__ref.getField(false,"_channel" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("enableVibration")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_vibrate)})));
 }else {
 BA.debugLineNum = 196;BA.debugLine="Dim CurrentDefaults As Int";
Debug.ShouldStop(8);
_currentdefaults = RemoteObject.createImmutable(0);Debug.locals.put("CurrentDefaults", _currentdefaults);
 BA.debugLineNum = 197;BA.debugLine="If Sound Then CurrentDefaults = 1";
Debug.ShouldStop(16);
if (_sound.<Boolean>get().booleanValue()) { 
_currentdefaults = BA.numberCast(int.class, 1);Debug.locals.put("CurrentDefaults", _currentdefaults);};
 BA.debugLineNum = 198;BA.debugLine="If Vibrate Then CurrentDefaults = Bit.Or(Curren";
Debug.ShouldStop(32);
if (_vibrate.<Boolean>get().booleanValue()) { 
_currentdefaults = nb6.__c.getField(false,"Bit").runMethod(true,"Or",(Object)(_currentdefaults),(Object)(BA.numberCast(int.class, 2)));Debug.locals.put("CurrentDefaults", _currentdefaults);};
 BA.debugLineNum = 199;BA.debugLine="If Light Then CurrentDefaults = Bit.Or(CurrentD";
Debug.ShouldStop(64);
if (_light.<Boolean>get().booleanValue()) { 
_currentdefaults = nb6.__c.getField(false,"Bit").runMethod(true,"Or",(Object)(_currentdefaults),(Object)(BA.numberCast(int.class, 4)));Debug.locals.put("CurrentDefaults", _currentdefaults);};
 BA.debugLineNum = 200;BA.debugLine="NotificationBuilder.RunMethod(\"setDefaults\", Ar";
Debug.ShouldStop(128);
__ref.getField(false,"_notificationbuilder" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setDefaults")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_currentdefaults)})));
 };
 };
 BA.debugLineNum = 203;BA.debugLine="Return Me";
Debug.ShouldStop(1024);
if (true) return (__ref);
 BA.debugLineNum = 204;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstyle(RemoteObject __ref,RemoteObject _stylename,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("SetStyle (nb6) ","nb6",18,__ref.getField(false, "ba"),__ref,255);
if (RapidSub.canDelegate("setstyle")) { return __ref.runUserSub(false, "nb6","setstyle", __ref, _stylename, _props);}
RemoteObject _style = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _method = RemoteObject.createImmutable("");
RemoteObject _value = RemoteObject.declareNull("Object");
Debug.locals.put("StyleName", _stylename);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 255;BA.debugLine="Private Sub SetStyle(StyleName As String, Props As";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 256;BA.debugLine="Dim style As JavaObject";
Debug.ShouldStop(-2147483648);
_style = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("style", _style);
 BA.debugLineNum = 257;BA.debugLine="style.InitializeNewInstance(StyleName, Null)";
Debug.ShouldStop(1);
_style.runVoidMethod ("InitializeNewInstance",(Object)(_stylename),(Object)((nb6.__c.getField(false,"Null"))));
 BA.debugLineNum = 258;BA.debugLine="For Each method As String In Props.Keys";
Debug.ShouldStop(2);
{
final RemoteObject group3 = _props.runMethod(false,"Keys");
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_method = BA.ObjectToString(group3.runMethod(false,"Get",index3));Debug.locals.put("method", _method);
Debug.locals.put("method", _method);
 BA.debugLineNum = 259;BA.debugLine="Dim value As Object = Props.Get(method)";
Debug.ShouldStop(4);
_value = _props.runMethod(false,"Get",(Object)((_method)));Debug.locals.put("value", _value);Debug.locals.put("value", _value);
 BA.debugLineNum = 260;BA.debugLine="If value <> Null Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("N",_value)) { 
 BA.debugLineNum = 261;BA.debugLine="style.RunMethod(method, Array(value))";
Debug.ShouldStop(16);
_style.runVoidMethod ("RunMethod",(Object)(_method),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {_value})));
 };
 }
}Debug.locals.put("method", _method);
;
 BA.debugLineNum = 264;BA.debugLine="NotificationBuilder.RunMethod(\"setStyle\", Array(s";
Debug.ShouldStop(128);
__ref.getField(false,"_notificationbuilder" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setStyle")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_style.getObject())})));
 BA.debugLineNum = 265;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _showwhen(RemoteObject __ref,RemoteObject _time) throws Exception{
try {
		Debug.PushSubsStack("ShowWhen (nb6) ","nb6",18,__ref.getField(false, "ba"),__ref,157);
if (RapidSub.canDelegate("showwhen")) { return __ref.runUserSub(false, "nb6","showwhen", __ref, _time);}
Debug.locals.put("Time", _time);
 BA.debugLineNum = 157;BA.debugLine="Public Sub ShowWhen (Time As Long) As NB6";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 158;BA.debugLine="If IsBuilder Then";
Debug.ShouldStop(536870912);
if (__ref.runClassMethod (com.it.fome.nb6.class, "_isbuilder" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 159;BA.debugLine="NotificationBuilder.RunMethod(\"setShowWhen\", Arr";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_notificationbuilder" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setShowWhen")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(nb6.__c.getField(true,"True"))})));
 BA.debugLineNum = 160;BA.debugLine="NotificationBuilder.RunMethod(\"setWhen\", Array(T";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_notificationbuilder" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setWhen")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_time)})));
 };
 BA.debugLineNum = 162;BA.debugLine="Return Me";
Debug.ShouldStop(2);
if (true) return (__ref);
 BA.debugLineNum = 163;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _smallicon(RemoteObject __ref,RemoteObject _icon) throws Exception{
try {
		Debug.PushSubsStack("SmallIcon (nb6) ","nb6",18,__ref.getField(false, "ba"),__ref,95);
if (RapidSub.canDelegate("smallicon")) { return __ref.runUserSub(false, "nb6","smallicon", __ref, _icon);}
Debug.locals.put("Icon", _icon);
 BA.debugLineNum = 95;BA.debugLine="Public Sub SmallIcon (Icon As Bitmap) As NB6";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 96;BA.debugLine="If IsBuilder Then";
Debug.ShouldStop(-2147483648);
if (__ref.runClassMethod (com.it.fome.nb6.class, "_isbuilder" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 97;BA.debugLine="NotificationBuilder.RunMethod(\"setSmallIcon\", Ar";
Debug.ShouldStop(1);
__ref.getField(false,"_notificationbuilder" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setSmallIcon")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {__ref.runClassMethod (com.it.fome.nb6.class, "_createiconfrombitmap" /*RemoteObject*/ ,(Object)(_icon))})));
 };
 BA.debugLineNum = 99;BA.debugLine="Return Me";
Debug.ShouldStop(4);
if (true) return (__ref);
 BA.debugLineNum = 100;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _subtext(RemoteObject __ref,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("SubText (nb6) ","nb6",18,__ref.getField(false, "ba"),__ref,177);
if (RapidSub.canDelegate("subtext")) { return __ref.runUserSub(false, "nb6","subtext", __ref, _text);}
Debug.locals.put("Text", _text);
 BA.debugLineNum = 177;BA.debugLine="Public Sub SubText (Text As Object) As NB6";
Debug.ShouldStop(65536);
 BA.debugLineNum = 178;BA.debugLine="If IsBuilder Then";
Debug.ShouldStop(131072);
if (__ref.runClassMethod (com.it.fome.nb6.class, "_isbuilder" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 179;BA.debugLine="NotificationBuilder.RunMethod(\"setSubText\", Arra";
Debug.ShouldStop(262144);
__ref.getField(false,"_notificationbuilder" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setSubText")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {_text})));
 };
 BA.debugLineNum = 181;BA.debugLine="Return Me";
Debug.ShouldStop(1048576);
if (true) return (__ref);
 BA.debugLineNum = 182;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _visibility(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("Visibility (nb6) ","nb6",18,__ref.getField(false, "ba"),__ref,225);
if (RapidSub.canDelegate("visibility")) { return __ref.runUserSub(false, "nb6","visibility", __ref, _value);}
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _i = RemoteObject.createImmutable(0);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 225;BA.debugLine="Public Sub Visibility (Value As String) As NB6";
Debug.ShouldStop(1);
 BA.debugLineNum = 226;BA.debugLine="If IsBuilder Then";
Debug.ShouldStop(2);
if (__ref.runClassMethod (com.it.fome.nb6.class, "_isbuilder" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 227;BA.debugLine="Dim m As Map = CreateMap(\"PUBLIC\": 1, \"SECRET\":";
Debug.ShouldStop(4);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_m = nb6.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("PUBLIC")),RemoteObject.createImmutable((1)),RemoteObject.createImmutable(("SECRET")),RemoteObject.createImmutable((-(double) (0 + 1))),RemoteObject.createImmutable(("PRIVATE")),RemoteObject.createImmutable((0))}));Debug.locals.put("m", _m);Debug.locals.put("m", _m);
 BA.debugLineNum = 228;BA.debugLine="Dim i As Int = m.Get(Value)";
Debug.ShouldStop(8);
_i = BA.numberCast(int.class, _m.runMethod(false,"Get",(Object)((_value))));Debug.locals.put("i", _i);Debug.locals.put("i", _i);
 BA.debugLineNum = 229;BA.debugLine="NotificationBuilder.RunMethod(\"setVisibility\", A";
Debug.ShouldStop(16);
__ref.getField(false,"_notificationbuilder" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setVisibility")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_i)})));
 };
 BA.debugLineNum = 231;BA.debugLine="Return Me";
Debug.ShouldStop(64);
if (true) return (__ref);
 BA.debugLineNum = 232;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}