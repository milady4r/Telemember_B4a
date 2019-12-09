package com.it.fome;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class firebasemessaging_subs_0 {


public static RemoteObject  _bigpicture_notification(RemoteObject _text,RemoteObject _titel,RemoteObject _collapstxt,RemoteObject _content_titel,RemoteObject _smiley,RemoteObject _larjicon) throws Exception{
try {
		Debug.PushSubsStack("BigPicture_Notification (firebasemessaging) ","firebasemessaging",6,firebasemessaging.processBA,firebasemessaging.mostCurrent,629);
if (RapidSub.canDelegate("bigpicture_notification")) { return com.it.fome.firebasemessaging.remoteMe.runUserSub(false, "firebasemessaging","bigpicture_notification", _text, _titel, _collapstxt, _content_titel, _smiley, _larjicon);}
RemoteObject _n = RemoteObject.declareNull("com.it.fome.nb6");
RemoteObject _b = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
Debug.locals.put("text", _text);
Debug.locals.put("titel", _titel);
Debug.locals.put("collapstxt", _collapstxt);
Debug.locals.put("content_titel", _content_titel);
Debug.locals.put("smiley", _smiley);
Debug.locals.put("larjicon", _larjicon);
 BA.debugLineNum = 629;BA.debugLine="Sub BigPicture_Notification(text As String,titel A";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 630;BA.debugLine="Dim n As NB6";
Debug.ShouldStop(2097152);
_n = RemoteObject.createNew ("com.it.fome.nb6");Debug.locals.put("n", _n);
 BA.debugLineNum = 631;BA.debugLine="n.Initialize(\"default\", Application.LabelName, \"D";
Debug.ShouldStop(4194304);
_n.runClassMethod (com.it.fome.nb6.class, "_initialize" /*RemoteObject*/ ,firebasemessaging.processBA,(Object)(BA.ObjectToString("default")),(Object)((firebasemessaging.mostCurrent.__c.getField(false,"Application").runMethod(true,"getLabelName"))),(Object)(RemoteObject.createImmutable("DEFAULT"))).runClassMethod (com.it.fome.nb6.class, "_smallicon" /*RemoteObject*/ ,(Object)(_smiley));
 BA.debugLineNum = 632;BA.debugLine="Dim b As Bitmap = larjicon";
Debug.ShouldStop(8388608);
_b = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
_b = _larjicon;Debug.locals.put("b", _b);Debug.locals.put("b", _b);
 BA.debugLineNum = 633;BA.debugLine="n.BigPictureStyle(b.Resize(256dip, 256dip, True),";
Debug.ShouldStop(16777216);
_n.runClassMethod (com.it.fome.nb6.class, "_bigpicturestyle" /*RemoteObject*/ ,(Object)(_b.runMethod(false,"Resize",(Object)(BA.numberCast(float.class, firebasemessaging.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 256))))),(Object)(BA.numberCast(float.class, firebasemessaging.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 256))))),(Object)(firebasemessaging.mostCurrent.__c.getField(true,"True")))),(Object)(_b),(Object)((_content_titel)),(Object)((_text)));
 BA.debugLineNum = 635;BA.debugLine="n.Color(0xFF00AEFF)";
Debug.ShouldStop(67108864);
_n.runClassMethod (com.it.fome.nb6.class, "_color" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 0xff00aeff)));
 BA.debugLineNum = 636;BA.debugLine="n.Build(titel, collapstxt, \"tagbigpicture\", Me).N";
Debug.ShouldStop(134217728);
_n.runClassMethod (com.it.fome.nb6.class, "_build" /*RemoteObject*/ ,(Object)((_titel)),(Object)((_collapstxt)),(Object)(BA.ObjectToString("tagbigpicture")),(Object)(firebasemessaging.getObject())).runVoidMethod ("Notify",(Object)(BA.numberCast(int.class, 7)));
 BA.debugLineNum = 637;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _bigtext_notification(RemoteObject _titel,RemoteObject _content,RemoteObject _sumery_txt,RemoteObject _big_text,RemoteObject _smiley) throws Exception{
try {
		Debug.PushSubsStack("BigText_Notification (firebasemessaging) ","firebasemessaging",6,firebasemessaging.processBA,firebasemessaging.mostCurrent,639);
if (RapidSub.canDelegate("bigtext_notification")) { return com.it.fome.firebasemessaging.remoteMe.runUserSub(false, "firebasemessaging","bigtext_notification", _titel, _content, _sumery_txt, _big_text, _smiley);}
RemoteObject _n = RemoteObject.declareNull("com.it.fome.nb6");
RemoteObject _cs = RemoteObject.declareNull("anywheresoftware.b4a.objects.CSBuilder");
Debug.locals.put("titel", _titel);
Debug.locals.put("content", _content);
Debug.locals.put("sumery_txt", _sumery_txt);
Debug.locals.put("big_text", _big_text);
Debug.locals.put("smiley", _smiley);
 BA.debugLineNum = 639;BA.debugLine="Sub BigText_Notification(titel As String,content A";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 640;BA.debugLine="Dim n As NB6";
Debug.ShouldStop(-2147483648);
_n = RemoteObject.createNew ("com.it.fome.nb6");Debug.locals.put("n", _n);
 BA.debugLineNum = 641;BA.debugLine="n.Initialize(\"default\", Application.LabelName, \"D";
Debug.ShouldStop(1);
_n.runClassMethod (com.it.fome.nb6.class, "_initialize" /*RemoteObject*/ ,firebasemessaging.processBA,(Object)(BA.ObjectToString("default")),(Object)((firebasemessaging.mostCurrent.__c.getField(false,"Application").runMethod(true,"getLabelName"))),(Object)(RemoteObject.createImmutable("DEFAULT"))).runClassMethod (com.it.fome.nb6.class, "_smallicon" /*RemoteObject*/ ,(Object)(_smiley));
 BA.debugLineNum = 642;BA.debugLine="Dim cs As CSBuilder";
Debug.ShouldStop(2);
_cs = RemoteObject.createNew ("anywheresoftware.b4a.objects.CSBuilder");Debug.locals.put("cs", _cs);
 BA.debugLineNum = 643;BA.debugLine="n.BigTextStyle(titel, cs.Initialize.BackgroundCol";
Debug.ShouldStop(4);
_n.runClassMethod (com.it.fome.nb6.class, "_bigtextstyle" /*RemoteObject*/ ,(Object)((_titel)),(Object)((_cs.runMethod(false,"Initialize").runMethod(false,"BackgroundColor",(Object)(firebasemessaging.mostCurrent.__c.getField(false,"Colors").getField(true,"Red"))).runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(_sumery_txt))).runMethod(false,"PopAll").getObject())),(Object)((_big_text)));
 BA.debugLineNum = 644;BA.debugLine="n.Build(titel, content, \"tag\", Me).Notify(8)";
Debug.ShouldStop(8);
_n.runClassMethod (com.it.fome.nb6.class, "_build" /*RemoteObject*/ ,(Object)((_titel)),(Object)((_content)),(Object)(BA.ObjectToString("tag")),(Object)(firebasemessaging.getObject())).runVoidMethod ("Notify",(Object)(BA.numberCast(int.class, 8)));
 BA.debugLineNum = 645;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _fm_messagearrived(RemoteObject _message) throws Exception{
try {
		Debug.PushSubsStack("fm_MessageArrived (firebasemessaging) ","firebasemessaging",6,firebasemessaging.processBA,firebasemessaging.mostCurrent,71);
if (RapidSub.canDelegate("fm_messagearrived")) { com.it.fome.firebasemessaging.remoteMe.runUserSub(false, "firebasemessaging","fm_messagearrived", _message); return;}
ResumableSub_fm_MessageArrived rsub = new ResumableSub_fm_MessageArrived(null,_message);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_fm_MessageArrived extends BA.ResumableSub {
public ResumableSub_fm_MessageArrived(com.it.fome.firebasemessaging parent,RemoteObject _message) {
this.parent = parent;
this._message = _message;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
com.it.fome.firebasemessaging parent;
RemoteObject _message;
RemoteObject _typ_push = RemoteObject.createImmutable("");
RemoteObject _token_push = RemoteObject.createImmutable("");
RemoteObject _idsef = RemoteObject.createImmutable("");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msg = RemoteObject.createImmutable("");
RemoteObject _type_n = RemoteObject.createImmutable("");
RemoteObject _value = RemoteObject.createImmutable("");
RemoteObject _url = RemoteObject.createImmutable("");
RemoteObject _bitmap1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
RemoteObject _glide = RemoteObject.declareNull("com.hitex_glide.Hitex_Glide");
RemoteObject _tag = RemoteObject.declareNull("Object");
RemoteObject _source = RemoteObject.declareNull("Object");
RemoteObject _bd = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.BitmapDrawable");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("fm_MessageArrived (firebasemessaging) ","firebasemessaging",6,firebasemessaging.processBA,firebasemessaging.mostCurrent,71);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("Message", _message);
 BA.debugLineNum = 74;BA.debugLine="Log(\"Message arrived\")";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","66553603",RemoteObject.createImmutable("Message arrived"),0);
 BA.debugLineNum = 75;BA.debugLine="Log($\"Message data: ${Message.GetData}\"$)";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","66553604",(RemoteObject.concat(RemoteObject.createImmutable("Message data: "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_message.runMethod(false,"GetData").getObject()))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 76;BA.debugLine="lusername.Initialize";
Debug.ShouldStop(2048);
parent._lusername.runVoidMethod ("Initialize");
 BA.debugLineNum = 77;BA.debugLine="cursor1 = sql1.ExecQuery(\"SELECT * FROM tbl_acc\")";
Debug.ShouldStop(4096);
parent._cursor1.setObject(parent._sql1.runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT * FROM tbl_acc"))));
 BA.debugLineNum = 79;BA.debugLine="Dim typ_push As String = Message.GetData.Get(\"typ";
Debug.ShouldStop(16384);
_typ_push = BA.ObjectToString(_message.runMethod(false,"GetData").runMethod(false,"Get",(Object)((RemoteObject.createImmutable("types")))));Debug.locals.put("typ_push", _typ_push);Debug.locals.put("typ_push", _typ_push);
 BA.debugLineNum = 80;BA.debugLine="Dim token_push As String = Message.GetData.Get(\"t";
Debug.ShouldStop(32768);
_token_push = BA.ObjectToString(_message.runMethod(false,"GetData").runMethod(false,"Get",(Object)((RemoteObject.createImmutable("target")))));Debug.locals.put("token_push", _token_push);Debug.locals.put("token_push", _token_push);
 BA.debugLineNum = 81;BA.debugLine="Dim idsef As String = Message.GetData.Get(\"id\")";
Debug.ShouldStop(65536);
_idsef = BA.ObjectToString(_message.runMethod(false,"GetData").runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("idsef", _idsef);Debug.locals.put("idsef", _idsef);
 BA.debugLineNum = 82;BA.debugLine="id_sef=idsef";
Debug.ShouldStop(131072);
parent._id_sef = _idsef;
 BA.debugLineNum = 83;BA.debugLine="token_sef=token_push";
Debug.ShouldStop(262144);
parent._token_sef = _token_push;
 BA.debugLineNum = 84;BA.debugLine="If cursor1.RowCount>0 Then";
Debug.ShouldStop(524288);
if (true) break;

case 1:
//if
this.state = 24;
if (RemoteObject.solveBoolean(">",parent._cursor1.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 86;BA.debugLine="type_sef=typ_push";
Debug.ShouldStop(2097152);
parent._type_sef = _typ_push;
 BA.debugLineNum = 87;BA.debugLine="Select typ_push";
Debug.ShouldStop(4194304);
if (true) break;

case 4:
//select
this.state = 23;
switch (BA.switchObjectToInt(_typ_push,BA.ObjectToString("9"),BA.ObjectToString("10"))) {
case 0: {
this.state = 6;
if (true) break;
}
case 1: {
this.state = 22;
if (true) break;
}
}
if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 91;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(67108864);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 92;BA.debugLine="parser.Initialize(token_push)";
Debug.ShouldStop(134217728);
_parser.runVoidMethod ("Initialize",(Object)(_token_push));
 BA.debugLineNum = 93;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(268435456);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 94;BA.debugLine="Dim msg As String = root.Get(\"msg\")";
Debug.ShouldStop(536870912);
_msg = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msg")))));Debug.locals.put("msg", _msg);Debug.locals.put("msg", _msg);
 BA.debugLineNum = 95;BA.debugLine="Dim Type_n As String = root.Get(\"type\")";
Debug.ShouldStop(1073741824);
_type_n = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("type")))));Debug.locals.put("Type_n", _type_n);Debug.locals.put("Type_n", _type_n);
 BA.debugLineNum = 96;BA.debugLine="Dim value As String = root.Get(\"value\")";
Debug.ShouldStop(-2147483648);
_value = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("value")))));Debug.locals.put("value", _value);Debug.locals.put("value", _value);
 BA.debugLineNum = 97;BA.debugLine="Dim url As String = root.Get(\"url\")";
Debug.ShouldStop(1);
_url = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("url")))));Debug.locals.put("url", _url);Debug.locals.put("url", _url);
 BA.debugLineNum = 99;BA.debugLine="Dim Bitmap1 As Bitmap";
Debug.ShouldStop(4);
_bitmap1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("Bitmap1", _bitmap1);
 BA.debugLineNum = 100;BA.debugLine="Bitmap1.Initialize(File.DirAssets, \"view_icon.";
Debug.ShouldStop(8);
_bitmap1.runVoidMethod ("Initialize",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("view_icon.png")));
 BA.debugLineNum = 102;BA.debugLine="Select Type_n";
Debug.ShouldStop(32);
if (true) break;

case 7:
//select
this.state = 20;
switch (BA.switchObjectToInt(_type_n,BA.ObjectToString("1"),BA.ObjectToString("2"),BA.ObjectToString("3"),BA.ObjectToString("4"),BA.ObjectToString("5"),BA.ObjectToString("6"))) {
case 0: {
this.state = 9;
if (true) break;
}
case 1: {
this.state = 11;
if (true) break;
}
case 2: {
this.state = 13;
if (true) break;
}
case 3: {
this.state = 15;
if (true) break;
}
case 4: {
this.state = 17;
if (true) break;
}
case 5: {
this.state = 19;
if (true) break;
}
}
if (true) break;

case 9:
//C
this.state = 20;
 BA.debugLineNum = 105;BA.debugLine="sql1.ExecNonQuery(\"INSERT INTO tbl_notif VAL";
Debug.ShouldStop(256);
parent._sql1.runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("INSERT INTO tbl_notif VALUES(Null,'"),_type_n,RemoteObject.createImmutable("','"),_msg,RemoteObject.createImmutable("','"),_url,RemoteObject.createImmutable("','"),_value,RemoteObject.createImmutable("','0','1')"))));
 if (true) break;

case 11:
//C
this.state = 20;
 BA.debugLineNum = 109;BA.debugLine="Simple_Notification(\"فالو ممبر\",msg,Bitmap1)";
Debug.ShouldStop(4096);
_simple_notification(BA.ObjectToString("فالو ممبر"),_msg,_bitmap1);
 if (true) break;

case 13:
//C
this.state = 20;
 BA.debugLineNum = 113;BA.debugLine="Dim glide As Hitex_Glide";
Debug.ShouldStop(65536);
_glide = RemoteObject.createNew ("com.hitex_glide.Hitex_Glide");Debug.locals.put("glide", _glide);
 BA.debugLineNum = 114;BA.debugLine="glide.Load2(value).Into2(\"Glide\",\"Tag\")";
Debug.ShouldStop(131072);
_glide.runMethod(false,"Load2",firebasemessaging.processBA,(Object)(_value)).runVoidMethod ("Into2",firebasemessaging.processBA,(Object)(BA.ObjectToString("Glide")),(Object)((RemoteObject.createImmutable("Tag"))));
 BA.debugLineNum = 116;BA.debugLine="Wait For Glide_onResourceReady (Tag As Objec";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","glide_onresourceready", firebasemessaging.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "firebasemessaging", "fm_messagearrived"), null);
this.state = 25;
return;
case 25:
//C
this.state = 20;
_tag = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Tag", _tag);
_source = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("Source", _source);
;
 BA.debugLineNum = 117;BA.debugLine="Dim BD = Source As BitmapDrawable";
Debug.ShouldStop(1048576);
_bd = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.BitmapDrawable");
_bd.setObject(_source);Debug.locals.put("BD", _bd);
 BA.debugLineNum = 118;BA.debugLine="Sleep(1500)";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("Sleep",firebasemessaging.processBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "firebasemessaging", "fm_messagearrived"),BA.numberCast(int.class, 1500));
this.state = 26;
return;
case 26:
//C
this.state = 20;
;
 BA.debugLineNum = 119;BA.debugLine="Simple_NotificationWithCSBuilderAndAFewExtra";
Debug.ShouldStop(4194304);
_simple_notificationwithcsbuilderandafewextrafields(BA.ObjectToString("فالو ممبر"),BA.ObjectToString("اطلاعیه"),_msg,_bitmap1,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), _bd.runMethod(false,"getBitmap")));
 if (true) break;

case 15:
//C
this.state = 20;
 BA.debugLineNum = 121;BA.debugLine="Dim glide As Hitex_Glide";
Debug.ShouldStop(16777216);
_glide = RemoteObject.createNew ("com.hitex_glide.Hitex_Glide");Debug.locals.put("glide", _glide);
 BA.debugLineNum = 122;BA.debugLine="glide.Load2(value).Into2(\"Glide\",\"Tag\")";
Debug.ShouldStop(33554432);
_glide.runMethod(false,"Load2",firebasemessaging.processBA,(Object)(_value)).runVoidMethod ("Into2",firebasemessaging.processBA,(Object)(BA.ObjectToString("Glide")),(Object)((RemoteObject.createImmutable("Tag"))));
 BA.debugLineNum = 124;BA.debugLine="Wait For Glide_onResourceReady (Tag As Objec";
Debug.ShouldStop(134217728);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","glide_onresourceready", firebasemessaging.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "firebasemessaging", "fm_messagearrived"), null);
this.state = 27;
return;
case 27:
//C
this.state = 20;
_tag = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Tag", _tag);
_source = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("Source", _source);
;
 BA.debugLineNum = 125;BA.debugLine="Dim BD = Source As BitmapDrawable";
Debug.ShouldStop(268435456);
_bd = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.BitmapDrawable");
_bd.setObject(_source);Debug.locals.put("BD", _bd);
 BA.debugLineNum = 126;BA.debugLine="Sleep(1500)";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("Sleep",firebasemessaging.processBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "firebasemessaging", "fm_messagearrived"),BA.numberCast(int.class, 1500));
this.state = 28;
return;
case 28:
//C
this.state = 20;
;
 BA.debugLineNum = 127;BA.debugLine="BigPicture_Notification(\"فالو ممبر\",\"اطلاعیه";
Debug.ShouldStop(1073741824);
_bigpicture_notification(BA.ObjectToString("فالو ممبر"),BA.ObjectToString("اطلاعیه"),BA.ObjectToString("other txt..."),_msg,_bitmap1,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), _bd.runMethod(false,"getBitmap")));
 if (true) break;

case 17:
//C
this.state = 20;
 BA.debugLineNum = 129;BA.debugLine="BigText_Notification(\"فالو ممبر\",\"اطلاعیه\",\"";
Debug.ShouldStop(1);
_bigtext_notification(BA.ObjectToString("فالو ممبر"),BA.ObjectToString("اطلاعیه"),BA.ObjectToString(""),_msg,_bitmap1);
 if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 131;BA.debugLine="sql1.ExecNonQuery(\"INSERT INTO tbl_notif VAL";
Debug.ShouldStop(4);
parent._sql1.runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("INSERT INTO tbl_notif VALUES(Null,'"),_type_n,RemoteObject.createImmutable("','"),_msg,RemoteObject.createImmutable("','"),_url,RemoteObject.createImmutable("','"),_value,RemoteObject.createImmutable("','0','1')"))));
 if (true) break;

case 20:
//C
this.state = 23;
;
 if (true) break;

case 22:
//C
this.state = 23;
 BA.debugLineNum = 137;BA.debugLine="get_seftele(\"1\")";
Debug.ShouldStop(256);
_get_seftele(RemoteObject.createImmutable("1"));
 if (true) break;

case 23:
//C
this.state = 24;
;
 if (true) break;

case 24:
//C
this.state = -1;
;
 BA.debugLineNum = 141;BA.debugLine="cursor1.Close";
Debug.ShouldStop(4096);
parent._cursor1.runVoidMethod ("Close");
 BA.debugLineNum = 143;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
public static void  _glide_onresourceready(RemoteObject _tag,RemoteObject _source) throws Exception{
}
public static RemoteObject  _get_sef(RemoteObject _type_req) throws Exception{
try {
		Debug.PushSubsStack("get_sef (firebasemessaging) ","firebasemessaging",6,firebasemessaging.processBA,firebasemessaging.mostCurrent,181);
if (RapidSub.canDelegate("get_sef")) { return com.it.fome.firebasemessaging.remoteMe.runUserSub(false, "firebasemessaging","get_sef", _type_req);}
RemoteObject _post = RemoteObject.declareNull("com.reza.sh.fastnet.PostRequestRaper");
Debug.locals.put("type_req", _type_req);
 BA.debugLineNum = 181;BA.debugLine="Sub get_sef(type_req As String)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 182;BA.debugLine="Try";
Debug.ShouldStop(2097152);
try { BA.debugLineNum = 193;BA.debugLine="prfn.initialize(\"prfn\")";
Debug.ShouldStop(1);
firebasemessaging._prfn.runVoidMethod ("initialize",firebasemessaging.processBA,(Object)(RemoteObject.createImmutable("prfn")));
 BA.debugLineNum = 194;BA.debugLine="Dim post As PostRequest";
Debug.ShouldStop(2);
_post = RemoteObject.createNew ("com.reza.sh.fastnet.PostRequestRaper");Debug.locals.put("post", _post);
 BA.debugLineNum = 195;BA.debugLine="post=prfn.BuildPostQuery(\"http://filework.ir/INS";
Debug.ShouldStop(4);
_post = firebasemessaging._prfn.runMethod(false,"BuildPostQuery",(Object)(BA.ObjectToString("http://filework.ir/INSTAFOLLOW/api/req.php")),(Object)(RemoteObject.createImmutable("getsef")));Debug.locals.put("post", _post);
 BA.debugLineNum = 197;BA.debugLine="post.addHeder(\"User-Agent\",\"Dalvik/1.6.0 (Linux;";
Debug.ShouldStop(16);
_post.runVoidMethod ("addHeder",(Object)(BA.ObjectToString("User-Agent")),(Object)(RemoteObject.createImmutable("Dalvik/1.6.0 (Linux; U; Android 4.4.4; SM-A700FD Build/KTU84P)")));
 BA.debugLineNum = 198;BA.debugLine="post.addParametrs(\"req\",\"get_push\")";
Debug.ShouldStop(32);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("req")),(Object)(RemoteObject.createImmutable("get_push")));
 BA.debugLineNum = 200;BA.debugLine="post.addParametrs(\"types\",type_req)";
Debug.ShouldStop(128);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("types")),(Object)(_type_req));
 BA.debugLineNum = 202;BA.debugLine="post.addParametrs(\"ida\",id_sef)";
Debug.ShouldStop(512);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("ida")),(Object)(firebasemessaging._id_sef));
 BA.debugLineNum = 205;BA.debugLine="post.executRequestAsString";
Debug.ShouldStop(4096);
_post.runVoidMethod ("executRequestAsString");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e11) {
			BA.rdebugUtils.runVoidMethod("setLastException",firebasemessaging.processBA, e11.toString()); BA.debugLineNum = 208;BA.debugLine="Log(LastException)";
Debug.ShouldStop(32768);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","66815771",BA.ObjectToString(firebasemessaging.mostCurrent.__c.runMethod(false,"LastException",firebasemessaging.processBA)),0);
 };
 BA.debugLineNum = 211;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _get_seftele(RemoteObject _type_req) throws Exception{
try {
		Debug.PushSubsStack("get_seftele (firebasemessaging) ","firebasemessaging",6,firebasemessaging.processBA,firebasemessaging.mostCurrent,228);
if (RapidSub.canDelegate("get_seftele")) { return com.it.fome.firebasemessaging.remoteMe.runUserSub(false, "firebasemessaging","get_seftele", _type_req);}
RemoteObject _post = RemoteObject.declareNull("com.reza.sh.fastnet.PostRequestRaper");
Debug.locals.put("type_req", _type_req);
 BA.debugLineNum = 228;BA.debugLine="Sub get_seftele(type_req As String)";
Debug.ShouldStop(8);
 BA.debugLineNum = 229;BA.debugLine="Try";
Debug.ShouldStop(16);
try { BA.debugLineNum = 240;BA.debugLine="prfn.initialize(\"prfn\")";
Debug.ShouldStop(32768);
firebasemessaging._prfn.runVoidMethod ("initialize",firebasemessaging.processBA,(Object)(RemoteObject.createImmutable("prfn")));
 BA.debugLineNum = 241;BA.debugLine="Dim post As PostRequest";
Debug.ShouldStop(65536);
_post = RemoteObject.createNew ("com.reza.sh.fastnet.PostRequestRaper");Debug.locals.put("post", _post);
 BA.debugLineNum = 242;BA.debugLine="post=prfn.BuildPostQuery(\"http://filework.ir/INS";
Debug.ShouldStop(131072);
_post = firebasemessaging._prfn.runMethod(false,"BuildPostQuery",(Object)(BA.ObjectToString("http://filework.ir/INSTAFOLLOW/api/req.php")),(Object)(RemoteObject.createImmutable("getseftele")));Debug.locals.put("post", _post);
 BA.debugLineNum = 244;BA.debugLine="post.addHeder(\"User-Agent\",\"Dalvik/1.6.0 (Linux;";
Debug.ShouldStop(524288);
_post.runVoidMethod ("addHeder",(Object)(BA.ObjectToString("User-Agent")),(Object)(RemoteObject.createImmutable("Dalvik/1.6.0 (Linux; U; Android 4.4.4; SM-A700FD Build/KTU84P)")));
 BA.debugLineNum = 245;BA.debugLine="post.addParametrs(\"req\",\"get_pushtele\")";
Debug.ShouldStop(1048576);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("req")),(Object)(RemoteObject.createImmutable("get_pushtele")));
 BA.debugLineNum = 247;BA.debugLine="post.addParametrs(\"types\",type_req)";
Debug.ShouldStop(4194304);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("types")),(Object)(_type_req));
 BA.debugLineNum = 249;BA.debugLine="post.addParametrs(\"ida\",id_sef)";
Debug.ShouldStop(16777216);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("ida")),(Object)(firebasemessaging._id_sef));
 BA.debugLineNum = 252;BA.debugLine="post.executRequestAsString";
Debug.ShouldStop(134217728);
_post.runVoidMethod ("executRequestAsString");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e11) {
			BA.rdebugUtils.runVoidMethod("setLastException",firebasemessaging.processBA, e11.toString()); BA.debugLineNum = 255;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1073741824);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","66946843",BA.ObjectToString(firebasemessaging.mostCurrent.__c.runMethod(false,"LastException",firebasemessaging.processBA)),0);
 };
 BA.debugLineNum = 258;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getapk_streamfinish(RemoteObject _success,RemoteObject _taskid) throws Exception{
try {
		Debug.PushSubsStack("GetAPK_StreamFinish (firebasemessaging) ","firebasemessaging",6,firebasemessaging.processBA,firebasemessaging.mostCurrent,526);
if (RapidSub.canDelegate("getapk_streamfinish")) { return com.it.fome.firebasemessaging.remoteMe.runUserSub(false, "firebasemessaging","getapk_streamfinish", _success, _taskid);}
RemoteObject _j = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("Success", _success);
Debug.locals.put("TaskId", _taskid);
 BA.debugLineNum = 526;BA.debugLine="Sub GetAPK_StreamFinish(Success As Boolean, TaskId";
Debug.ShouldStop(8192);
 BA.debugLineNum = 528;BA.debugLine="If Success Then";
Debug.ShouldStop(32768);
if (_success.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 529;BA.debugLine="Try";
Debug.ShouldStop(65536);
try { BA.debugLineNum = 532;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(524288);
firebasemessaging.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 534;BA.debugLine="Dim j As JavaObject";
Debug.ShouldStop(2097152);
_j = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("j", _j);
 BA.debugLineNum = 535;BA.debugLine="j.InitializeContext";
Debug.ShouldStop(4194304);
_j.runVoidMethod ("InitializeContext",firebasemessaging.processBA);
 BA.debugLineNum = 536;BA.debugLine="j.RunMethod(\"startopen\",Array As Object(File.Co";
Debug.ShouldStop(8388608);
_j.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("startopen")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(firebasemessaging.mostCurrent.__c.getField(false,"File").runMethod(true,"Combine",(Object)(firebasemessaging.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(RemoteObject.createImmutable("instafollow.apk"))))})));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e8) {
			BA.rdebugUtils.runVoidMethod("setLastException",firebasemessaging.processBA, e8.toString()); BA.debugLineNum = 549;BA.debugLine="Log(LastException)";
Debug.ShouldStop(16);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","68060951",BA.ObjectToString(firebasemessaging.mostCurrent.__c.runMethod(false,"LastException",firebasemessaging.processBA)),0);
 };
 };
 BA.debugLineNum = 554;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcom_sef(RemoteObject _id_req) throws Exception{
try {
		Debug.PushSubsStack("getcom_sef (firebasemessaging) ","firebasemessaging",6,firebasemessaging.processBA,firebasemessaging.mostCurrent,405);
if (RapidSub.canDelegate("getcom_sef")) { return com.it.fome.firebasemessaging.remoteMe.runUserSub(false, "firebasemessaging","getcom_sef", _id_req);}
RemoteObject _post = RemoteObject.declareNull("com.reza.sh.fastnet.PostRequestRaper");
Debug.locals.put("id_req", _id_req);
 BA.debugLineNum = 405;BA.debugLine="Sub getcom_sef(id_req As String)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 407;BA.debugLine="prfn.initialize(\"prfn\")";
Debug.ShouldStop(4194304);
firebasemessaging._prfn.runVoidMethod ("initialize",firebasemessaging.processBA,(Object)(RemoteObject.createImmutable("prfn")));
 BA.debugLineNum = 410;BA.debugLine="Dim post As PostRequest";
Debug.ShouldStop(33554432);
_post = RemoteObject.createNew ("com.reza.sh.fastnet.PostRequestRaper");Debug.locals.put("post", _post);
 BA.debugLineNum = 411;BA.debugLine="post.addParametrs(\"id\",id_job)";
Debug.ShouldStop(67108864);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("id")),(Object)(firebasemessaging._id_job));
 BA.debugLineNum = 412;BA.debugLine="post=prfn.WithCookieManager.BuildPostQuery(\"http:";
Debug.ShouldStop(134217728);
_post = firebasemessaging._prfn.runMethod(false,"WithCookieManager").runMethod(false,"BuildPostQuery",(Object)(BA.ObjectToString("http://ejbari.info/insta/user1/app/done/l_getComments.php")),(Object)(RemoteObject.createImmutable("coments_sef")));Debug.locals.put("post", _post);
 BA.debugLineNum = 413;BA.debugLine="post.executRequestAsJSONObject";
Debug.ShouldStop(268435456);
_post.runVoidMethod ("executRequestAsJSONObject");
 BA.debugLineNum = 415;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hc_responseerror(RemoteObject _response,RemoteObject _reason,RemoteObject _statuscode,RemoteObject _taskid) throws Exception{
try {
		Debug.PushSubsStack("hc_ResponseError (firebasemessaging) ","firebasemessaging",6,firebasemessaging.processBA,firebasemessaging.mostCurrent,517);
if (RapidSub.canDelegate("hc_responseerror")) { return com.it.fome.firebasemessaging.remoteMe.runUserSub(false, "firebasemessaging","hc_responseerror", _response, _reason, _statuscode, _taskid);}
Debug.locals.put("Response", _response);
Debug.locals.put("Reason", _reason);
Debug.locals.put("StatusCode", _statuscode);
Debug.locals.put("TaskId", _taskid);
 BA.debugLineNum = 517;BA.debugLine="Sub hc_ResponseError(Response As OkHttpResponse, R";
Debug.ShouldStop(16);
 BA.debugLineNum = 522;BA.debugLine="ExitApplication";
Debug.ShouldStop(512);
firebasemessaging.mostCurrent.__c.runVoidMethod ("ExitApplication");
 BA.debugLineNum = 524;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hc_responsesuccess(RemoteObject _response,RemoteObject _taskid) throws Exception{
try {
		Debug.PushSubsStack("hc_ResponseSuccess (firebasemessaging) ","firebasemessaging",6,firebasemessaging.processBA,firebasemessaging.mostCurrent,509);
if (RapidSub.canDelegate("hc_responsesuccess")) { return com.it.fome.firebasemessaging.remoteMe.runUserSub(false, "firebasemessaging","hc_responsesuccess", _response, _taskid);}
Debug.locals.put("Response", _response);
Debug.locals.put("TaskId", _taskid);
 BA.debugLineNum = 509;BA.debugLine="Sub hc_ResponseSuccess(Response As OkHttpResponse,";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 512;BA.debugLine="Response.GetAsynchronously(\"GetAPK\", File.OpenOut";
Debug.ShouldStop(-2147483648);
_response.runVoidMethod ("GetAsynchronously",firebasemessaging.processBA,(Object)(BA.ObjectToString("GetAPK")),(Object)((firebasemessaging.mostCurrent.__c.getField(false,"File").runMethod(false,"OpenOutput",(Object)(firebasemessaging.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(BA.ObjectToString("instafollow.apk")),(Object)(firebasemessaging.mostCurrent.__c.getField(true,"False"))).getObject())),(Object)(firebasemessaging.mostCurrent.__c.getField(true,"True")),(Object)(_taskid));
 BA.debugLineNum = 515;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _inforeq(RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("inforeq (firebasemessaging) ","firebasemessaging",6,firebasemessaging.processBA,firebasemessaging.mostCurrent,157);
if (RapidSub.canDelegate("inforeq")) { return com.it.fome.firebasemessaging.remoteMe.runUserSub(false, "firebasemessaging","inforeq", _str);}
RemoteObject _su = RemoteObject.declareNull("anywheresoftware.b4a.objects.StringUtils");
RemoteObject _url = RemoteObject.createImmutable("");
RemoteObject _encodedurl = RemoteObject.createImmutable("");
Debug.locals.put("str", _str);
 BA.debugLineNum = 157;BA.debugLine="Sub inforeq(str As String)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 159;BA.debugLine="Dim su As StringUtils";
Debug.ShouldStop(1073741824);
_su = RemoteObject.createNew ("anywheresoftware.b4a.objects.StringUtils");Debug.locals.put("su", _su);
 BA.debugLineNum = 160;BA.debugLine="Dim url, encodedUrl As String";
Debug.ShouldStop(-2147483648);
_url = RemoteObject.createImmutable("");Debug.locals.put("url", _url);
_encodedurl = RemoteObject.createImmutable("");Debug.locals.put("encodedUrl", _encodedurl);
 BA.debugLineNum = 161;BA.debugLine="url=\"\"&str";
Debug.ShouldStop(1);
_url = RemoteObject.concat(RemoteObject.createImmutable(""),_str);Debug.locals.put("url", _url);
 BA.debugLineNum = 162;BA.debugLine="encodedUrl = su.EncodeUrl(url, \"UTF8\")";
Debug.ShouldStop(2);
_encodedurl = _su.runMethod(true,"EncodeUrl",(Object)(_url),(Object)(RemoteObject.createImmutable("UTF8")));Debug.locals.put("encodedUrl", _encodedurl);
 BA.debugLineNum = 163;BA.debugLine="Log(encodedUrl)";
Debug.ShouldStop(4);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","66750214",_encodedurl,0);
 BA.debugLineNum = 179;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _inser_notif(RemoteObject _values) throws Exception{
try {
		Debug.PushSubsStack("inser_notif (firebasemessaging) ","firebasemessaging",6,firebasemessaging.processBA,firebasemessaging.mostCurrent,150);
if (RapidSub.canDelegate("inser_notif")) { return com.it.fome.firebasemessaging.remoteMe.runUserSub(false, "firebasemessaging","inser_notif", _values);}
Debug.locals.put("values", _values);
 BA.debugLineNum = 150;BA.debugLine="Sub inser_notif(values As String)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 154;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _join() throws Exception{
try {
		Debug.PushSubsStack("join (firebasemessaging) ","firebasemessaging",6,firebasemessaging.processBA,firebasemessaging.mostCurrent,484);
if (RapidSub.canDelegate("join")) { com.it.fome.firebasemessaging.remoteMe.runUserSub(false, "firebasemessaging","join"); return;}
ResumableSub_join rsub = new ResumableSub_join(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_join extends BA.ResumableSub {
public ResumableSub_join(com.it.fome.firebasemessaging parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
com.it.fome.firebasemessaging parent;
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _value = RemoteObject.createImmutable("");
int step3;
int limit3;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("join (firebasemessaging) ","firebasemessaging",6,firebasemessaging.processBA,firebasemessaging.mostCurrent,484);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 486;BA.debugLine="cursor1 = sql1.ExecQuery(\"SELECT * FROM tbl_tele";
Debug.ShouldStop(32);
parent._cursor1.setObject(parent._sql1.runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT * FROM tbl_tele WHERE soich='1'"))));
 BA.debugLineNum = 487;BA.debugLine="Dim i As Int";
Debug.ShouldStop(64);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 488;BA.debugLine="For i=0 To cursor1.RowCount-1";
Debug.ShouldStop(128);
if (true) break;

case 1:
//for
this.state = 10;
step3 = 1;
limit3 = RemoteObject.solve(new RemoteObject[] {parent._cursor1.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
Debug.locals.put("i", _i);
this.state = 11;
if (true) break;

case 11:
//C
this.state = 10;
if ((step3 > 0 && _i.<Integer>get().intValue() <= limit3) || (step3 < 0 && _i.<Integer>get().intValue() >= limit3)) this.state = 3;
if (true) break;

case 12:
//C
this.state = 11;
_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step3)) ;
Debug.locals.put("i", _i);
if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 489;BA.debugLine="cursor1.Position=i";
Debug.ShouldStop(256);
parent._cursor1.runMethod(true,"setPosition",_i);
 BA.debugLineNum = 490;BA.debugLine="userid_t=cursor1.GetString(\"userid\")";
Debug.ShouldStop(512);
parent._userid_t = parent._cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("userid")));
 BA.debugLineNum = 491;BA.debugLine="username_t=cursor1.GetString(\"username\")";
Debug.ShouldStop(1024);
parent._username_t = parent._cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("username")));
 BA.debugLineNum = 494;BA.debugLine="telegs.Joinchannel(medialid,userid_t)";
Debug.ShouldStop(8192);
parent._telegs.runVoidMethod ("Joinchannel",(Object)(parent._medialid),(Object)(BA.numberCast(int.class, parent._userid_t)));
 BA.debugLineNum = 495;BA.debugLine="Wait For telegs_joinchannel(value As String)";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","telegs_joinchannel", firebasemessaging.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "firebasemessaging", "join"), null);
this.state = 13;
return;
case 13:
//C
this.state = 4;
_value = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("value", _value);
;
 BA.debugLineNum = 496;BA.debugLine="If value=\"ok\" Then";
Debug.ShouldStop(32768);
if (true) break;

case 4:
//if
this.state = 9;
if (RemoteObject.solveBoolean("=",_value,BA.ObjectToString("ok"))) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 498;BA.debugLine="up_sef(id_job)";
Debug.ShouldStop(131072);
_up_sef(parent._id_job);
 if (true) break;

case 8:
//C
this.state = 9;
 if (true) break;

case 9:
//C
this.state = 12;
;
 if (true) break;
if (true) break;

case 10:
//C
this.state = -1;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 507;BA.debugLine="End Sub";
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
public static void  _telegs_joinchannel(RemoteObject _value) throws Exception{
}
public static RemoteObject  _prfn_onpostjsonobjecterrorlistener(RemoteObject _error,RemoteObject _tag) throws Exception{
try {
		Debug.PushSubsStack("prfn_onPostJSONObjectErrorListener (firebasemessaging) ","firebasemessaging",6,firebasemessaging.processBA,firebasemessaging.mostCurrent,417);
if (RapidSub.canDelegate("prfn_onpostjsonobjecterrorlistener")) { return com.it.fome.firebasemessaging.remoteMe.runUserSub(false, "firebasemessaging","prfn_onpostjsonobjecterrorlistener", _error, _tag);}
Debug.locals.put("Error", _error);
Debug.locals.put("Tag", _tag);
 BA.debugLineNum = 417;BA.debugLine="Sub prfn_onPostJSONObjectErrorListener(Error As Re";
Debug.ShouldStop(1);
 BA.debugLineNum = 418;BA.debugLine="Log(Error.ErrorBody)";
Debug.ShouldStop(2);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","67274497",_error.runMethod(true,"getErrorBody"),0);
 BA.debugLineNum = 419;BA.debugLine="Log(Error.CauseMessage)";
Debug.ShouldStop(4);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","67274498",_error.runMethod(true,"getCauseMessage"),0);
 BA.debugLineNum = 420;BA.debugLine="Log(Error.ErrorBody)";
Debug.ShouldStop(8);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","67274499",_error.runMethod(true,"getErrorBody"),0);
 BA.debugLineNum = 421;BA.debugLine="Log(Error.ErrorMsage)";
Debug.ShouldStop(16);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","67274500",_error.runMethod(true,"getErrorMsage"),0);
 BA.debugLineNum = 422;BA.debugLine="Log(Error.ResponseBody)";
Debug.ShouldStop(32);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","67274501",_error.runMethod(true,"getResponseBody"),0);
 BA.debugLineNum = 424;BA.debugLine="Select Tag";
Debug.ShouldStop(128);
switch (BA.switchObjectToInt(_tag,BA.ObjectToString("getsef"),BA.ObjectToString("up_sef"),BA.ObjectToString("coments_sef"))) {
case 0: {
 break; }
case 1: {
 BA.debugLineNum = 429;BA.debugLine="LogColor(\"error \",Colors.Red)";
Debug.ShouldStop(4096);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","67274508",BA.ObjectToString("error "),firebasemessaging.mostCurrent.__c.getField(false,"Colors").getField(true,"Red"));
 break; }
case 2: {
 break; }
}
;
 BA.debugLineNum = 433;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("prfn_onPostJSONObjectOkListener (firebasemessaging) ","firebasemessaging",6,firebasemessaging.processBA,firebasemessaging.mostCurrent,435);
if (RapidSub.canDelegate("prfn_onpostjsonobjectoklistener")) { return com.it.fome.firebasemessaging.remoteMe.runUserSub(false, "firebasemessaging","prfn_onpostjsonobjectoklistener", _jsonstring, _tag);}
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _uiadmin = RemoteObject.createImmutable("");
RemoteObject _type_s = RemoteObject.createImmutable("");
RemoteObject _time_create = RemoteObject.createImmutable("");
RemoteObject _finish = RemoteObject.createImmutable("");
RemoteObject _id = RemoteObject.createImmutable("");
RemoteObject _num_id = RemoteObject.createImmutable("");
RemoteObject _time_done = RemoteObject.createImmutable("");
RemoteObject _done = RemoteObject.createImmutable("");
RemoteObject _userid = RemoteObject.createImmutable("");
RemoteObject _username = RemoteObject.createImmutable("");
RemoteObject _status = RemoteObject.createImmutable("");
RemoteObject _token = RemoteObject.createImmutable("");
RemoteObject _username_sef = RemoteObject.createImmutable("");
Debug.locals.put("JsonString", _jsonstring);
Debug.locals.put("Tag", _tag);
 BA.debugLineNum = 435;BA.debugLine="Sub prfn_onPostJSONObjectOkListener(JsonString As";
Debug.ShouldStop(262144);
 BA.debugLineNum = 436;BA.debugLine="Select Tag";
Debug.ShouldStop(524288);
switch (BA.switchObjectToInt(_tag,BA.ObjectToString("getsef"),BA.ObjectToString("up_sef"),BA.ObjectToString(""))) {
case 0: {
 BA.debugLineNum = 439;BA.debugLine="Log(\"ok gets\")";
Debug.ShouldStop(4194304);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","67340036",RemoteObject.createImmutable("ok gets"),0);
 BA.debugLineNum = 440;BA.debugLine="Log(JsonString)";
Debug.ShouldStop(8388608);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","67340037",_jsonstring,0);
 BA.debugLineNum = 441;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(16777216);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 442;BA.debugLine="parser.Initialize(JsonString)";
Debug.ShouldStop(33554432);
_parser.runVoidMethod ("Initialize",(Object)(_jsonstring));
 BA.debugLineNum = 443;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(67108864);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 444;BA.debugLine="Dim uiadmin As String = root.Get(\"uiadmin\")";
Debug.ShouldStop(134217728);
_uiadmin = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("uiadmin")))));Debug.locals.put("uiadmin", _uiadmin);Debug.locals.put("uiadmin", _uiadmin);
 BA.debugLineNum = 445;BA.debugLine="Dim type_s As String = root.Get(\"type_s\")";
Debug.ShouldStop(268435456);
_type_s = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("type_s")))));Debug.locals.put("type_s", _type_s);Debug.locals.put("type_s", _type_s);
 BA.debugLineNum = 446;BA.debugLine="Dim time_create As String = root.Get(\"time_crea";
Debug.ShouldStop(536870912);
_time_create = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("time_create")))));Debug.locals.put("time_create", _time_create);Debug.locals.put("time_create", _time_create);
 BA.debugLineNum = 447;BA.debugLine="Dim finish As String = root.Get(\"finish\")";
Debug.ShouldStop(1073741824);
_finish = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("finish")))));Debug.locals.put("finish", _finish);Debug.locals.put("finish", _finish);
 BA.debugLineNum = 448;BA.debugLine="Dim id As String = root.Get(\"id\")";
Debug.ShouldStop(-2147483648);
_id = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 449;BA.debugLine="Dim num_id As String = root.Get(\"num_id\")";
Debug.ShouldStop(1);
_num_id = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("num_id")))));Debug.locals.put("num_id", _num_id);Debug.locals.put("num_id", _num_id);
 BA.debugLineNum = 450;BA.debugLine="Dim time_done As String = root.Get(\"time_done\")";
Debug.ShouldStop(2);
_time_done = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("time_done")))));Debug.locals.put("time_done", _time_done);Debug.locals.put("time_done", _time_done);
 BA.debugLineNum = 451;BA.debugLine="Dim done As String = root.Get(\"done\")";
Debug.ShouldStop(4);
_done = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("done")))));Debug.locals.put("done", _done);Debug.locals.put("done", _done);
 BA.debugLineNum = 452;BA.debugLine="Dim userid As String = root.Get(\"userid\")";
Debug.ShouldStop(8);
_userid = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("userid")))));Debug.locals.put("userid", _userid);Debug.locals.put("userid", _userid);
 BA.debugLineNum = 453;BA.debugLine="Dim username As String = root.Get(\"username\")";
Debug.ShouldStop(16);
_username = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("username")))));Debug.locals.put("username", _username);Debug.locals.put("username", _username);
 BA.debugLineNum = 454;BA.debugLine="Dim status As String = root.Get(\"status\")";
Debug.ShouldStop(32);
_status = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("status")))));Debug.locals.put("status", _status);Debug.locals.put("status", _status);
 BA.debugLineNum = 455;BA.debugLine="Dim token As String = root.Get(\"token\")";
Debug.ShouldStop(64);
_token = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("token")))));Debug.locals.put("token", _token);Debug.locals.put("token", _token);
 BA.debugLineNum = 457;BA.debugLine="id_job=id";
Debug.ShouldStop(256);
firebasemessaging._id_job = _id;
 BA.debugLineNum = 458;BA.debugLine="userid_sef=userid";
Debug.ShouldStop(512);
firebasemessaging._userid_sef = _userid;
 BA.debugLineNum = 459;BA.debugLine="username_sef=username";
Debug.ShouldStop(1024);
_username_sef = _username;Debug.locals.put("username_sef", _username_sef);
 BA.debugLineNum = 460;BA.debugLine="medialid=num_id";
Debug.ShouldStop(2048);
firebasemessaging._medialid = _num_id;
 BA.debugLineNum = 462;BA.debugLine="Select type_s";
Debug.ShouldStop(8192);
switch (BA.switchObjectToInt(_type_s,BA.ObjectToString("1"),BA.ObjectToString("2"),BA.ObjectToString("3"))) {
case 0: {
 break; }
case 1: {
 break; }
case 2: {
 break; }
}
;
 break; }
case 1: {
 break; }
case 2: {
 break; }
}
;
 BA.debugLineNum = 482;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("prfn_onPostStringErrorListener (firebasemessaging) ","firebasemessaging",6,firebasemessaging.processBA,firebasemessaging.mostCurrent,275);
if (RapidSub.canDelegate("prfn_onpoststringerrorlistener")) { return com.it.fome.firebasemessaging.remoteMe.runUserSub(false, "firebasemessaging","prfn_onpoststringerrorlistener", _error, _tag);}
Debug.locals.put("Error", _error);
Debug.locals.put("Tag", _tag);
 BA.debugLineNum = 275;BA.debugLine="Sub prfn_onPostStringErrorListener(Error As Respon";
Debug.ShouldStop(262144);
 BA.debugLineNum = 276;BA.debugLine="Log(Error.ErrorBody)";
Debug.ShouldStop(524288);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","67077889",_error.runMethod(true,"getErrorBody"),0);
 BA.debugLineNum = 277;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("prfn_onPostStringOkListener (firebasemessaging) ","firebasemessaging",6,firebasemessaging.processBA,firebasemessaging.mostCurrent,279);
if (RapidSub.canDelegate("prfn_onpoststringoklistener")) { return com.it.fome.firebasemessaging.remoteMe.runUserSub(false, "firebasemessaging","prfn_onpoststringoklistener", _result, _tag);}
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colroot = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _uid = RemoteObject.createImmutable("");
RemoteObject _types = RemoteObject.createImmutable("");
RemoteObject _start = RemoteObject.createImmutable("");
RemoteObject _finish = RemoteObject.createImmutable("");
RemoteObject _ida = RemoteObject.createImmutable("");
RemoteObject _userid = RemoteObject.createImmutable("");
RemoteObject _target = RemoteObject.createImmutable("");
RemoteObject _status = RemoteObject.createImmutable("");
RemoteObject _token = RemoteObject.createImmutable("");
RemoteObject _comtext = RemoteObject.createImmutable("");
Debug.locals.put("Result", _result);
Debug.locals.put("Tag", _tag);
 BA.debugLineNum = 279;BA.debugLine="Sub prfn_onPostStringOkListener(Result As String";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 281;BA.debugLine="Select Tag";
Debug.ShouldStop(16777216);
switch (BA.switchObjectToInt(_tag,BA.ObjectToString("getsef"),BA.ObjectToString("getseftele"),BA.ObjectToString("upsef"),BA.ObjectToString("upseftele"))) {
case 0: {
 BA.debugLineNum = 284;BA.debugLine="Log(Result)";
Debug.ShouldStop(134217728);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","67143429",_result,0);
 BA.debugLineNum = 285;BA.debugLine="Log(\"ok gets\")";
Debug.ShouldStop(268435456);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","67143430",RemoteObject.createImmutable("ok gets"),0);
 BA.debugLineNum = 286;BA.debugLine="If Result.Contains(\"error_code\")=True Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_result.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("error_code"))),firebasemessaging.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 287;BA.debugLine="Log(\"notfound\")";
Debug.ShouldStop(1073741824);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","67143432",RemoteObject.createImmutable("notfound"),0);
 }else {
 BA.debugLineNum = 289;BA.debugLine="Log(Result)";
Debug.ShouldStop(1);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","67143434",_result,0);
 BA.debugLineNum = 290;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(2);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 291;BA.debugLine="parser.Initialize(Result)";
Debug.ShouldStop(4);
_parser.runVoidMethod ("Initialize",(Object)(_result));
 BA.debugLineNum = 292;BA.debugLine="Dim root As List = parser.NextArray";
Debug.ShouldStop(8);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_root = _parser.runMethod(false,"NextArray");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 293;BA.debugLine="For Each colroot As Map In root";
Debug.ShouldStop(16);
_colroot = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group12 = _root;
final int groupLen12 = group12.runMethod(true,"getSize").<Integer>get()
;int index12 = 0;
;
for (; index12 < groupLen12;index12++){
_colroot.setObject(group12.runMethod(false,"Get",index12));
Debug.locals.put("colroot", _colroot);
 BA.debugLineNum = 294;BA.debugLine="Dim uid As String = colroot.Get(\"uid\")";
Debug.ShouldStop(32);
_uid = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("uid")))));Debug.locals.put("uid", _uid);Debug.locals.put("uid", _uid);
 BA.debugLineNum = 295;BA.debugLine="Dim types As String = colroot.Get(\"types\")";
Debug.ShouldStop(64);
_types = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("types")))));Debug.locals.put("types", _types);Debug.locals.put("types", _types);
 BA.debugLineNum = 296;BA.debugLine="Dim start As String = colroot.Get(\"start\")";
Debug.ShouldStop(128);
_start = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("start")))));Debug.locals.put("start", _start);Debug.locals.put("start", _start);
 BA.debugLineNum = 297;BA.debugLine="Dim finish As String = colroot.Get(\"finish\")";
Debug.ShouldStop(256);
_finish = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("finish")))));Debug.locals.put("finish", _finish);Debug.locals.put("finish", _finish);
 BA.debugLineNum = 298;BA.debugLine="Dim ida As String = colroot.Get(\"id\")";
Debug.ShouldStop(512);
_ida = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("ida", _ida);Debug.locals.put("ida", _ida);
 BA.debugLineNum = 299;BA.debugLine="Dim userid As String = colroot.Get(\"userid\")";
Debug.ShouldStop(1024);
_userid = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("userid")))));Debug.locals.put("userid", _userid);Debug.locals.put("userid", _userid);
 BA.debugLineNum = 300;BA.debugLine="Dim target As String = colroot.Get(\"target\")";
Debug.ShouldStop(2048);
_target = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("target")))));Debug.locals.put("target", _target);Debug.locals.put("target", _target);
 BA.debugLineNum = 301;BA.debugLine="Dim status As String = colroot.Get(\"status\")";
Debug.ShouldStop(4096);
_status = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("status")))));Debug.locals.put("status", _status);Debug.locals.put("status", _status);
 BA.debugLineNum = 302;BA.debugLine="Dim token As String = colroot.Get(\"token\")";
Debug.ShouldStop(8192);
_token = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("token")))));Debug.locals.put("token", _token);Debug.locals.put("token", _token);
 BA.debugLineNum = 303;BA.debugLine="If types=\"2\" Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_types,BA.ObjectToString("2"))) { 
 BA.debugLineNum = 304;BA.debugLine="Dim comtext As String = colroot.Get(\"comtext";
Debug.ShouldStop(32768);
_comtext = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("comtext")))));Debug.locals.put("comtext", _comtext);Debug.locals.put("comtext", _comtext);
 BA.debugLineNum = 306;BA.debugLine="comtex=comtext";
Debug.ShouldStop(131072);
firebasemessaging._comtex = _comtext;
 };
 BA.debugLineNum = 310;BA.debugLine="If types=\"7\" Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",_types,BA.ObjectToString("7"))) { 
 BA.debugLineNum = 311;BA.debugLine="Dim comtext As String = colroot.Get(\"comtext";
Debug.ShouldStop(4194304);
_comtext = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("comtext")))));Debug.locals.put("comtext", _comtext);Debug.locals.put("comtext", _comtext);
 BA.debugLineNum = 313;BA.debugLine="comtex=comtext";
Debug.ShouldStop(16777216);
firebasemessaging._comtex = _comtext;
 };
 }
}Debug.locals.put("colroot", _colroot);
;
 BA.debugLineNum = 319;BA.debugLine="id_job=ida";
Debug.ShouldStop(1073741824);
firebasemessaging._id_job = _ida;
 BA.debugLineNum = 320;BA.debugLine="userid_sef=userid";
Debug.ShouldStop(-2147483648);
firebasemessaging._userid_sef = _userid;
 BA.debugLineNum = 322;BA.debugLine="medialid=target";
Debug.ShouldStop(2);
firebasemessaging._medialid = _target;
 BA.debugLineNum = 323;BA.debugLine="Select types";
Debug.ShouldStop(4);
switch (BA.switchObjectToInt(_types,BA.ObjectToString("1"),BA.ObjectToString("2"),BA.ObjectToString("3"),BA.ObjectToString("4"),BA.ObjectToString("6"),BA.ObjectToString("7"),BA.ObjectToString("8"))) {
case 0: {
 break; }
case 1: {
 break; }
case 2: {
 break; }
case 3: {
 break; }
case 4: {
 break; }
case 5: {
 break; }
case 6: {
 break; }
}
;
 };
 break; }
case 1: {
 BA.debugLineNum = 353;BA.debugLine="Log(Result)";
Debug.ShouldStop(1);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","67143498",_result,0);
 BA.debugLineNum = 354;BA.debugLine="Log(\"ok gets\")";
Debug.ShouldStop(2);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","67143499",RemoteObject.createImmutable("ok gets"),0);
 BA.debugLineNum = 355;BA.debugLine="If Result.Contains(\"error_code\")=True Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_result.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("error_code"))),firebasemessaging.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 356;BA.debugLine="Log(\"notfound\")";
Debug.ShouldStop(8);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","67143501",RemoteObject.createImmutable("notfound"),0);
 }else {
 BA.debugLineNum = 358;BA.debugLine="Log(Result)";
Debug.ShouldStop(32);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","67143503",_result,0);
 BA.debugLineNum = 359;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(64);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 360;BA.debugLine="parser.Initialize(Result)";
Debug.ShouldStop(128);
_parser.runVoidMethod ("Initialize",(Object)(_result));
 BA.debugLineNum = 361;BA.debugLine="Dim root As List = parser.NextArray";
Debug.ShouldStop(256);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_root = _parser.runMethod(false,"NextArray");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 362;BA.debugLine="For Each colroot As Map In root";
Debug.ShouldStop(512);
_colroot = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group54 = _root;
final int groupLen54 = group54.runMethod(true,"getSize").<Integer>get()
;int index54 = 0;
;
for (; index54 < groupLen54;index54++){
_colroot.setObject(group54.runMethod(false,"Get",index54));
Debug.locals.put("colroot", _colroot);
 BA.debugLineNum = 364;BA.debugLine="Dim types As String = colroot.Get(\"types\")";
Debug.ShouldStop(2048);
_types = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("types")))));Debug.locals.put("types", _types);Debug.locals.put("types", _types);
 BA.debugLineNum = 365;BA.debugLine="Dim start As String = colroot.Get(\"start\")";
Debug.ShouldStop(4096);
_start = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("start")))));Debug.locals.put("start", _start);Debug.locals.put("start", _start);
 BA.debugLineNum = 366;BA.debugLine="Dim finish As String = colroot.Get(\"finish\")";
Debug.ShouldStop(8192);
_finish = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("finish")))));Debug.locals.put("finish", _finish);Debug.locals.put("finish", _finish);
 BA.debugLineNum = 367;BA.debugLine="Dim ida As String = colroot.Get(\"id\")";
Debug.ShouldStop(16384);
_ida = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("ida", _ida);Debug.locals.put("ida", _ida);
 BA.debugLineNum = 368;BA.debugLine="Dim userid As String = colroot.Get(\"userid\")";
Debug.ShouldStop(32768);
_userid = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("userid")))));Debug.locals.put("userid", _userid);Debug.locals.put("userid", _userid);
 BA.debugLineNum = 369;BA.debugLine="Dim target As String = colroot.Get(\"target\")";
Debug.ShouldStop(65536);
_target = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("target")))));Debug.locals.put("target", _target);Debug.locals.put("target", _target);
 BA.debugLineNum = 370;BA.debugLine="Dim status As String = colroot.Get(\"status\")";
Debug.ShouldStop(131072);
_status = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("status")))));Debug.locals.put("status", _status);Debug.locals.put("status", _status);
 BA.debugLineNum = 371;BA.debugLine="Dim token As String = colroot.Get(\"token\")";
Debug.ShouldStop(262144);
_token = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("token")))));Debug.locals.put("token", _token);Debug.locals.put("token", _token);
 }
}Debug.locals.put("colroot", _colroot);
;
 BA.debugLineNum = 376;BA.debugLine="id_job=ida";
Debug.ShouldStop(8388608);
firebasemessaging._id_job = _ida;
 BA.debugLineNum = 377;BA.debugLine="userid_sef=userid";
Debug.ShouldStop(16777216);
firebasemessaging._userid_sef = _userid;
 BA.debugLineNum = 379;BA.debugLine="medialid=target";
Debug.ShouldStop(67108864);
firebasemessaging._medialid = _target;
 BA.debugLineNum = 380;BA.debugLine="Select types";
Debug.ShouldStop(134217728);
switch (BA.switchObjectToInt(_types,BA.ObjectToString("1"),BA.ObjectToString("2"))) {
case 0: {
 break; }
case 1: {
 break; }
}
;
 };
 break; }
case 2: {
 break; }
case 3: {
 break; }
}
;
 BA.debugLineNum = 403;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 7;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 8;BA.debugLine="Private fm As FirebaseMessaging";
firebasemessaging._fm = RemoteObject.createNew ("anywheresoftware.b4a.objects.FirebaseNotificationsService.FirebaseMessageWrapper");
 //BA.debugLineNum = 9;BA.debugLine="Dim medialid As String";
firebasemessaging._medialid = RemoteObject.createImmutable("");
 //BA.debugLineNum = 10;BA.debugLine="Dim lusername As List";
firebasemessaging._lusername = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 11;BA.debugLine="Private sql1 As SQL";
firebasemessaging._sql1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL");
 //BA.debugLineNum = 12;BA.debugLine="Private cursor1 As Cursor";
firebasemessaging._cursor1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
 //BA.debugLineNum = 13;BA.debugLine="Dim s_userid,s_cookie,s_username As String";
firebasemessaging._s_userid = RemoteObject.createImmutable("");
firebasemessaging._s_cookie = RemoteObject.createImmutable("");
firebasemessaging._s_username = RemoteObject.createImmutable("");
 //BA.debugLineNum = 14;BA.debugLine="Dim prfn As PersianFastNetwork";
firebasemessaging._prfn = RemoteObject.createNew ("com.reza.sh.fastnet.Fastnet");
 //BA.debugLineNum = 15;BA.debugLine="Dim token_sef ,type_sef ,id_job As String";
firebasemessaging._token_sef = RemoteObject.createImmutable("");
firebasemessaging._type_sef = RemoteObject.createImmutable("");
firebasemessaging._id_job = RemoteObject.createImmutable("");
 //BA.debugLineNum = 16;BA.debugLine="Dim s_userid,s_cookie,s_username As String";
firebasemessaging._s_userid = RemoteObject.createImmutable("");
firebasemessaging._s_cookie = RemoteObject.createImmutable("");
firebasemessaging._s_username = RemoteObject.createImmutable("");
 //BA.debugLineNum = 17;BA.debugLine="Dim userid_sef,media_idsef ,id_sef As String";
firebasemessaging._userid_sef = RemoteObject.createImmutable("");
firebasemessaging._media_idsef = RemoteObject.createImmutable("");
firebasemessaging._id_sef = RemoteObject.createImmutable("");
 //BA.debugLineNum = 18;BA.debugLine="Private comtex As String";
firebasemessaging._comtex = RemoteObject.createImmutable("");
 //BA.debugLineNum = 20;BA.debugLine="Private hc As OkHttpClient";
firebasemessaging._hc = RemoteObject.createNew ("anywheresoftware.b4h.okhttp.OkHttpClientWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private req As OkHttpRequest";
firebasemessaging._req = RemoteObject.createNew ("anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest");
 //BA.debugLineNum = 22;BA.debugLine="Dim telegs As milad_telegramv3";
firebasemessaging._telegs = RemoteObject.createNew ("com.mili.telegrams.teleg_warp");
 //BA.debugLineNum = 23;BA.debugLine="Dim username_t ,userid_t As String";
firebasemessaging._username_t = RemoteObject.createImmutable("");
firebasemessaging._userid_t = RemoteObject.createImmutable("");
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _req_getme(RemoteObject _reelid,RemoteObject _reelowner,RemoteObject _reeltakenat,RemoteObject _icookies) throws Exception{
try {
		Debug.PushSubsStack("req_getme (firebasemessaging) ","firebasemessaging",6,firebasemessaging.processBA,firebasemessaging.mostCurrent,557);
if (RapidSub.canDelegate("req_getme")) { return com.it.fome.firebasemessaging.remoteMe.runUserSub(false, "firebasemessaging","req_getme", _reelid, _reelowner, _reeltakenat, _icookies);}
RemoteObject _post = RemoteObject.declareNull("com.reza.sh.fastnet.PostRequestRaper");
Debug.locals.put("reelid", _reelid);
Debug.locals.put("reelowner", _reelowner);
Debug.locals.put("reeltakenat", _reeltakenat);
Debug.locals.put("icookies", _icookies);
 BA.debugLineNum = 557;BA.debugLine="Sub req_getme(reelid As String,reelowner As String";
Debug.ShouldStop(4096);
 BA.debugLineNum = 558;BA.debugLine="Dim prfn As PersianFastNetwork";
Debug.ShouldStop(8192);
firebasemessaging._prfn = RemoteObject.createNew ("com.reza.sh.fastnet.Fastnet");
 BA.debugLineNum = 559;BA.debugLine="prfn.initialize(\"prfn\").WithSSL.Build";
Debug.ShouldStop(16384);
firebasemessaging._prfn.runMethod(false,"initialize",firebasemessaging.processBA,(Object)(RemoteObject.createImmutable("prfn"))).runMethod(false,"WithSSL").runVoidMethod ("Build");
 BA.debugLineNum = 561;BA.debugLine="Dim post As PostRequest";
Debug.ShouldStop(65536);
_post = RemoteObject.createNew ("com.reza.sh.fastnet.PostRequestRaper");Debug.locals.put("post", _post);
 BA.debugLineNum = 562;BA.debugLine="post=prfn.WithCookieManager.BuildPostQuery(\"https";
Debug.ShouldStop(131072);
_post = firebasemessaging._prfn.runMethod(false,"WithCookieManager").runMethod(false,"BuildPostQuery",(Object)(BA.ObjectToString("https://www.instagram.com/stories/reel/seen")),(Object)(RemoteObject.createImmutable("sefss")));Debug.locals.put("post", _post);
 BA.debugLineNum = 571;BA.debugLine="post.addParametrs(\"reelMediaId\",reelid)";
Debug.ShouldStop(67108864);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("reelMediaId")),(Object)(_reelid));
 BA.debugLineNum = 572;BA.debugLine="post.addParametrs(\"reelMediaOwnerId\",reelowner)";
Debug.ShouldStop(134217728);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("reelMediaOwnerId")),(Object)(_reelowner));
 BA.debugLineNum = 573;BA.debugLine="post.addParametrs(\"reelId\",reelowner)";
Debug.ShouldStop(268435456);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("reelId")),(Object)(_reelowner));
 BA.debugLineNum = 574;BA.debugLine="post.addParametrs(\"reelMediaTakenAt\",reeltakenat)";
Debug.ShouldStop(536870912);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("reelMediaTakenAt")),(Object)(_reeltakenat));
 BA.debugLineNum = 575;BA.debugLine="post.addParametrs(\"viewSeenAt\",reeltakenat)";
Debug.ShouldStop(1073741824);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("viewSeenAt")),(Object)(_reeltakenat));
 BA.debugLineNum = 587;BA.debugLine="post.addHeder(\"accept\",\" */*\")";
Debug.ShouldStop(1024);
_post.runVoidMethod ("addHeder",(Object)(BA.ObjectToString("accept")),(Object)(RemoteObject.createImmutable(" */*")));
 BA.debugLineNum = 588;BA.debugLine="post.addHeder(\"accept-encoding\",\"UTF8\")";
Debug.ShouldStop(2048);
_post.runVoidMethod ("addHeder",(Object)(BA.ObjectToString("accept-encoding")),(Object)(RemoteObject.createImmutable("UTF8")));
 BA.debugLineNum = 589;BA.debugLine="post.addHeder(\"accept-language\",\" en,fa;q=0.9,en-";
Debug.ShouldStop(4096);
_post.runVoidMethod ("addHeder",(Object)(BA.ObjectToString("accept-language")),(Object)(RemoteObject.createImmutable(" en,fa;q=0.9,en-US;q=0.8")));
 BA.debugLineNum = 590;BA.debugLine="post.addHeder(\"content-length\",\" 127\")";
Debug.ShouldStop(8192);
_post.runVoidMethod ("addHeder",(Object)(BA.ObjectToString("content-length")),(Object)(RemoteObject.createImmutable(" 127")));
 BA.debugLineNum = 591;BA.debugLine="post.addHeder(\"content-Type\",\" Application/x-www-";
Debug.ShouldStop(16384);
_post.runVoidMethod ("addHeder",(Object)(BA.ObjectToString("content-Type")),(Object)(RemoteObject.createImmutable(" Application/x-www-form-urlencoded")));
 BA.debugLineNum = 594;BA.debugLine="post.addHeder(\"cookie\",icookies)";
Debug.ShouldStop(131072);
_post.runVoidMethod ("addHeder",(Object)(BA.ObjectToString("cookie")),(Object)(_icookies));
 BA.debugLineNum = 596;BA.debugLine="post.addHeder(\"referer\",\" https://www.instagram.c";
Debug.ShouldStop(524288);
_post.runVoidMethod ("addHeder",(Object)(BA.ObjectToString("referer")),(Object)(RemoteObject.createImmutable(" https://www.instagram.com/stories/amirhossin_pk/")));
 BA.debugLineNum = 597;BA.debugLine="post.addHeder(\"user-agent\",\" Mozilla/5.0 (Windows";
Debug.ShouldStop(1048576);
_post.runVoidMethod ("addHeder",(Object)(BA.ObjectToString("user-agent")),(Object)(RemoteObject.createImmutable(" Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/68.0.3440.106 Safari/537.36")));
 BA.debugLineNum = 598;BA.debugLine="post.addHeder(\"x-csrftoken\",\" AqzDnmSiSrCYQ3vZO02";
Debug.ShouldStop(2097152);
_post.runVoidMethod ("addHeder",(Object)(BA.ObjectToString("x-csrftoken")),(Object)(RemoteObject.createImmutable(" AqzDnmSiSrCYQ3vZO02WaeOsaJyXoXwS")));
 BA.debugLineNum = 599;BA.debugLine="post.addHeder(\"x-instagram-ajax\",\" 0f6941ba75b0\")";
Debug.ShouldStop(4194304);
_post.runVoidMethod ("addHeder",(Object)(BA.ObjectToString("x-instagram-ajax")),(Object)(RemoteObject.createImmutable(" 0f6941ba75b0")));
 BA.debugLineNum = 600;BA.debugLine="post.addHeder(\"x-requested-with\",\" XMLHttpRequest";
Debug.ShouldStop(8388608);
_post.runVoidMethod ("addHeder",(Object)(BA.ObjectToString("x-requested-with")),(Object)(RemoteObject.createImmutable(" XMLHttpRequest")));
 BA.debugLineNum = 602;BA.debugLine="post.executRequestAsString";
Debug.ShouldStop(33554432);
_post.runVoidMethod ("executRequestAsString");
 BA.debugLineNum = 605;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _service_create() throws Exception{
try {
		Debug.PushSubsStack("Service_Create (firebasemessaging) ","firebasemessaging",6,firebasemessaging.processBA,firebasemessaging.mostCurrent,28);
if (RapidSub.canDelegate("service_create")) { return com.it.fome.firebasemessaging.remoteMe.runUserSub(false, "firebasemessaging","service_create");}
RemoteObject _i = RemoteObject.createImmutable(0);
 BA.debugLineNum = 28;BA.debugLine="Sub Service_Create";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 29;BA.debugLine="fm.Initialize(\"fm\")";
Debug.ShouldStop(268435456);
firebasemessaging._fm.runVoidMethod ("Initialize",firebasemessaging.processBA,(Object)(RemoteObject.createImmutable("fm")));
 BA.debugLineNum = 30;BA.debugLine="lusername.Initialize";
Debug.ShouldStop(536870912);
firebasemessaging._lusername.runVoidMethod ("Initialize");
 BA.debugLineNum = 32;BA.debugLine="If File.Exists(File.DirInternal,\"instadb.db\")=Fal";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",firebasemessaging.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(firebasemessaging.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("instadb.db"))),firebasemessaging.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 33;BA.debugLine="File.Copy(File.DirAssets,\"instadb.db\",File.DirIn";
Debug.ShouldStop(1);
firebasemessaging.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(firebasemessaging.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("instadb.db")),(Object)(firebasemessaging.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("instadb.db")));
 };
 BA.debugLineNum = 35;BA.debugLine="If sql1.IsInitialized=False Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",firebasemessaging._sql1.runMethod(true,"IsInitialized"),firebasemessaging.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 36;BA.debugLine="sql1.Initialize(File.DirInternal,\"instadb.db\",Fa";
Debug.ShouldStop(8);
firebasemessaging._sql1.runVoidMethod ("Initialize",(Object)(firebasemessaging.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("instadb.db")),(Object)(firebasemessaging.mostCurrent.__c.getField(true,"False")));
 };
 BA.debugLineNum = 41;BA.debugLine="cursor1 = sql1.ExecQuery(\"SELECT * FROM tbl_acc\")";
Debug.ShouldStop(256);
firebasemessaging._cursor1.setObject(firebasemessaging._sql1.runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT * FROM tbl_acc"))));
 BA.debugLineNum = 42;BA.debugLine="Dim i As Int";
Debug.ShouldStop(512);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 43;BA.debugLine="For i=0 To cursor1.RowCount-1";
Debug.ShouldStop(1024);
{
final int step11 = 1;
final int limit11 = RemoteObject.solve(new RemoteObject[] {firebasemessaging._cursor1.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step11 > 0 && _i.<Integer>get().intValue() <= limit11) || (step11 < 0 && _i.<Integer>get().intValue() >= limit11) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step11))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 44;BA.debugLine="cursor1.Position=i";
Debug.ShouldStop(2048);
firebasemessaging._cursor1.runMethod(true,"setPosition",_i);
 BA.debugLineNum = 45;BA.debugLine="lusername.Add(cursor1.GetString(\"username\"))";
Debug.ShouldStop(4096);
firebasemessaging._lusername.runVoidMethod ("Add",(Object)((firebasemessaging._cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("username"))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 48;BA.debugLine="cursor1.Close";
Debug.ShouldStop(32768);
firebasemessaging._cursor1.runVoidMethod ("Close");
 BA.debugLineNum = 50;BA.debugLine="cursor1 = sql1.ExecQuery(\"SELECT * FROM tbl_tele";
Debug.ShouldStop(131072);
firebasemessaging._cursor1.setObject(firebasemessaging._sql1.runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT * FROM tbl_tele WHERE soich='1'"))));
 BA.debugLineNum = 51;BA.debugLine="Dim i As Int";
Debug.ShouldStop(262144);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 52;BA.debugLine="For i=0 To cursor1.RowCount-1";
Debug.ShouldStop(524288);
{
final int step18 = 1;
final int limit18 = RemoteObject.solve(new RemoteObject[] {firebasemessaging._cursor1.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step18 > 0 && _i.<Integer>get().intValue() <= limit18) || (step18 < 0 && _i.<Integer>get().intValue() >= limit18) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step18))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 53;BA.debugLine="cursor1.Position=i";
Debug.ShouldStop(1048576);
firebasemessaging._cursor1.runMethod(true,"setPosition",_i);
 BA.debugLineNum = 54;BA.debugLine="userid_t=cursor1.GetString(\"userid\")";
Debug.ShouldStop(2097152);
firebasemessaging._userid_t = firebasemessaging._cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("userid")));
 BA.debugLineNum = 55;BA.debugLine="username_t=cursor1.GetString(\"username\")";
Debug.ShouldStop(4194304);
firebasemessaging._username_t = firebasemessaging._cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("username")));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 57;BA.debugLine="cursor1.Close";
Debug.ShouldStop(16777216);
firebasemessaging._cursor1.runVoidMethod ("Close");
 BA.debugLineNum = 59;BA.debugLine="telegs.Initialize(\"telegs\")";
Debug.ShouldStop(67108864);
firebasemessaging._telegs.runVoidMethod ("Initialize",firebasemessaging.processBA,(Object)(RemoteObject.createImmutable("telegs")));
 BA.debugLineNum = 60;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
		Debug.PushSubsStack("Service_Destroy (firebasemessaging) ","firebasemessaging",6,firebasemessaging.processBA,firebasemessaging.mostCurrent,145);
if (RapidSub.canDelegate("service_destroy")) { return com.it.fome.firebasemessaging.remoteMe.runUserSub(false, "firebasemessaging","service_destroy");}
 BA.debugLineNum = 145;BA.debugLine="Sub Service_Destroy";
Debug.ShouldStop(65536);
 BA.debugLineNum = 148;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
		Debug.PushSubsStack("Service_Start (firebasemessaging) ","firebasemessaging",6,firebasemessaging.processBA,firebasemessaging.mostCurrent,67);
if (RapidSub.canDelegate("service_start")) { return com.it.fome.firebasemessaging.remoteMe.runUserSub(false, "firebasemessaging","service_start", _startingintent);}
Debug.locals.put("StartingIntent", _startingintent);
 BA.debugLineNum = 67;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
Debug.ShouldStop(4);
 BA.debugLineNum = 68;BA.debugLine="If StartingIntent.IsInitialized And fm.HandleInte";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean(".",_startingintent.runMethod(true,"IsInitialized")) && RemoteObject.solveBoolean(".",firebasemessaging._fm.runMethod(true,"HandleIntent",(Object)((_startingintent.getObject()))))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 69;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _simple_notification(RemoteObject _titel,RemoteObject _content,RemoteObject _smiley) throws Exception{
try {
		Debug.PushSubsStack("Simple_Notification (firebasemessaging) ","firebasemessaging",6,firebasemessaging.processBA,firebasemessaging.mostCurrent,608);
if (RapidSub.canDelegate("simple_notification")) { return com.it.fome.firebasemessaging.remoteMe.runUserSub(false, "firebasemessaging","simple_notification", _titel, _content, _smiley);}
RemoteObject _n = RemoteObject.declareNull("com.it.fome.nb6");
Debug.locals.put("titel", _titel);
Debug.locals.put("content", _content);
Debug.locals.put("smiley", _smiley);
 BA.debugLineNum = 608;BA.debugLine="Sub Simple_Notification(titel As String,content As";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 609;BA.debugLine="Dim n As NB6";
Debug.ShouldStop(1);
_n = RemoteObject.createNew ("com.it.fome.nb6");Debug.locals.put("n", _n);
 BA.debugLineNum = 610;BA.debugLine="n.Initialize(\"default\", Application.LabelName, \"D";
Debug.ShouldStop(2);
_n.runClassMethod (com.it.fome.nb6.class, "_initialize" /*RemoteObject*/ ,firebasemessaging.processBA,(Object)(BA.ObjectToString("default")),(Object)((firebasemessaging.mostCurrent.__c.getField(false,"Application").runMethod(true,"getLabelName"))),(Object)(RemoteObject.createImmutable("DEFAULT"))).runClassMethod (com.it.fome.nb6.class, "_autocancel" /*RemoteObject*/ ,(Object)(firebasemessaging.mostCurrent.__c.getField(true,"True"))).runClassMethod (com.it.fome.nb6.class, "_smallicon" /*RemoteObject*/ ,(Object)(_smiley));
 BA.debugLineNum = 611;BA.debugLine="n.Build(titel,content, \"tag1\", Me).Notify(4) 'It";
Debug.ShouldStop(4);
_n.runClassMethod (com.it.fome.nb6.class, "_build" /*RemoteObject*/ ,(Object)((_titel)),(Object)((_content)),(Object)(BA.ObjectToString("tag1")),(Object)(firebasemessaging.getObject())).runVoidMethod ("Notify",(Object)(BA.numberCast(int.class, 4)));
 BA.debugLineNum = 612;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _simple_notificationwithcsbuilderandafewextrafields(RemoteObject _subtext,RemoteObject _titel,RemoteObject _contents,RemoteObject _smiley,RemoteObject _larjicon) throws Exception{
try {
		Debug.PushSubsStack("Simple_NotificationWithCSBuilderAndAFewExtraFields (firebasemessaging) ","firebasemessaging",6,firebasemessaging.processBA,firebasemessaging.mostCurrent,614);
if (RapidSub.canDelegate("simple_notificationwithcsbuilderandafewextrafields")) { return com.it.fome.firebasemessaging.remoteMe.runUserSub(false, "firebasemessaging","simple_notificationwithcsbuilderandafewextrafields", _subtext, _titel, _contents, _smiley, _larjicon);}
RemoteObject _n = RemoteObject.declareNull("com.it.fome.nb6");
RemoteObject _cs = RemoteObject.declareNull("anywheresoftware.b4a.objects.CSBuilder");
RemoteObject _title = RemoteObject.declareNull("Object");
RemoteObject _content = RemoteObject.declareNull("Object");
Debug.locals.put("subtext", _subtext);
Debug.locals.put("titel", _titel);
Debug.locals.put("contents", _contents);
Debug.locals.put("smiley", _smiley);
Debug.locals.put("larjicon", _larjicon);
 BA.debugLineNum = 614;BA.debugLine="Sub Simple_NotificationWithCSBuilderAndAFewExtraFi";
Debug.ShouldStop(32);
 BA.debugLineNum = 615;BA.debugLine="Dim n As NB6";
Debug.ShouldStop(64);
_n = RemoteObject.createNew ("com.it.fome.nb6");Debug.locals.put("n", _n);
 BA.debugLineNum = 616;BA.debugLine="n.Initialize(\"default\", Application.LabelName, \"D";
Debug.ShouldStop(128);
_n.runClassMethod (com.it.fome.nb6.class, "_initialize" /*RemoteObject*/ ,firebasemessaging.processBA,(Object)(BA.ObjectToString("default")),(Object)((firebasemessaging.mostCurrent.__c.getField(false,"Application").runMethod(true,"getLabelName"))),(Object)(RemoteObject.createImmutable("DEFAULT"))).runClassMethod (com.it.fome.nb6.class, "_autocancel" /*RemoteObject*/ ,(Object)(firebasemessaging.mostCurrent.__c.getField(true,"True"))).runClassMethod (com.it.fome.nb6.class, "_smallicon" /*RemoteObject*/ ,(Object)(_smiley));
 BA.debugLineNum = 617;BA.debugLine="Dim cs As CSBuilder";
Debug.ShouldStop(256);
_cs = RemoteObject.createNew ("anywheresoftware.b4a.objects.CSBuilder");Debug.locals.put("cs", _cs);
 BA.debugLineNum = 618;BA.debugLine="n.SubText(cs.Initialize.BackgroundColor(Colors.Ye";
Debug.ShouldStop(512);
_n.runClassMethod (com.it.fome.nb6.class, "_subtext" /*RemoteObject*/ ,(Object)((_cs.runMethod(false,"Initialize").runMethod(false,"BackgroundColor",(Object)(firebasemessaging.mostCurrent.__c.getField(false,"Colors").getField(true,"Yellow"))).runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(_subtext))).runMethod(false,"PopAll").getObject())));
 BA.debugLineNum = 619;BA.debugLine="Dim title As Object = cs.Initialize.Color(Colors.";
Debug.ShouldStop(1024);
_title = (_cs.runMethod(false,"Initialize").runMethod(false,"Color",(Object)(firebasemessaging.mostCurrent.__c.getField(false,"Colors").getField(true,"Green"))).runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(_titel))).runMethod(false,"PopAll").getObject());Debug.locals.put("title", _title);Debug.locals.put("title", _title);
 BA.debugLineNum = 620;BA.debugLine="Dim content As Object = cs.Initialize.Underline.B";
Debug.ShouldStop(2048);
_content = (_cs.runMethod(false,"Initialize").runMethod(false,"Underline").runMethod(false,"Bold").runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(_contents))).runMethod(false,"PopAll").getObject());Debug.locals.put("content", _content);Debug.locals.put("content", _content);
 BA.debugLineNum = 622;BA.debugLine="n.LargeIcon(larjicon)";
Debug.ShouldStop(8192);
_n.runClassMethod (com.it.fome.nb6.class, "_largeicon" /*RemoteObject*/ ,(Object)(_larjicon));
 BA.debugLineNum = 623;BA.debugLine="n.Color(Colors.Blue)";
Debug.ShouldStop(16384);
_n.runClassMethod (com.it.fome.nb6.class, "_color" /*RemoteObject*/ ,(Object)(firebasemessaging.mostCurrent.__c.getField(false,"Colors").getField(true,"Blue")));
 BA.debugLineNum = 624;BA.debugLine="n.BadgeIconType(\"SMALL\").Number(1)";
Debug.ShouldStop(32768);
_n.runClassMethod (com.it.fome.nb6.class, "_badgeicontype" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("SMALL"))).runClassMethod (com.it.fome.nb6.class, "_number" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 1)));
 BA.debugLineNum = 625;BA.debugLine="n.ShowWhen(DateTime.Now)";
Debug.ShouldStop(65536);
_n.runClassMethod (com.it.fome.nb6.class, "_showwhen" /*RemoteObject*/ ,(Object)(firebasemessaging.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")));
 BA.debugLineNum = 626;BA.debugLine="n.Build(title, content, \"tag2\", Me).Notify(5)";
Debug.ShouldStop(131072);
_n.runClassMethod (com.it.fome.nb6.class, "_build" /*RemoteObject*/ ,(Object)(_title),(Object)(_content),(Object)(BA.ObjectToString("tag2")),(Object)(firebasemessaging.getObject())).runVoidMethod ("Notify",(Object)(BA.numberCast(int.class, 5)));
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
public static RemoteObject  _subscribetotopics() throws Exception{
try {
		Debug.PushSubsStack("SubscribeToTopics (firebasemessaging) ","firebasemessaging",6,firebasemessaging.processBA,firebasemessaging.mostCurrent,62);
if (RapidSub.canDelegate("subscribetotopics")) { return com.it.fome.firebasemessaging.remoteMe.runUserSub(false, "firebasemessaging","subscribetotopics");}
 BA.debugLineNum = 62;BA.debugLine="Public Sub SubscribeToTopics";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 63;BA.debugLine="fm.SubscribeToTopic(\"allusers\") 'you can subscrib";
Debug.ShouldStop(1073741824);
firebasemessaging._fm.runVoidMethod ("SubscribeToTopic",(Object)(RemoteObject.createImmutable("allusers")));
 BA.debugLineNum = 64;BA.debugLine="Log(fm.Token)";
Debug.ShouldStop(-2147483648);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","66422530",firebasemessaging._fm.runMethod(true,"getToken"),0);
 BA.debugLineNum = 65;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _up_sef(RemoteObject _id_req) throws Exception{
try {
		Debug.PushSubsStack("up_sef (firebasemessaging) ","firebasemessaging",6,firebasemessaging.processBA,firebasemessaging.mostCurrent,213);
if (RapidSub.canDelegate("up_sef")) { return com.it.fome.firebasemessaging.remoteMe.runUserSub(false, "firebasemessaging","up_sef", _id_req);}
RemoteObject _post = RemoteObject.declareNull("com.reza.sh.fastnet.PostRequestRaper");
Debug.locals.put("id_req", _id_req);
 BA.debugLineNum = 213;BA.debugLine="Sub up_sef(id_req As String)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 215;BA.debugLine="prfn.initialize(\"prfn\")";
Debug.ShouldStop(4194304);
firebasemessaging._prfn.runVoidMethod ("initialize",firebasemessaging.processBA,(Object)(RemoteObject.createImmutable("prfn")));
 BA.debugLineNum = 216;BA.debugLine="Dim post As PostRequest";
Debug.ShouldStop(8388608);
_post = RemoteObject.createNew ("com.reza.sh.fastnet.PostRequestRaper");Debug.locals.put("post", _post);
 BA.debugLineNum = 217;BA.debugLine="post=prfn.BuildPostQuery(\"http://filework.ir/INST";
Debug.ShouldStop(16777216);
_post = firebasemessaging._prfn.runMethod(false,"BuildPostQuery",(Object)(BA.ObjectToString("http://filework.ir/INSTAFOLLOW/api/req.php")),(Object)(RemoteObject.createImmutable("upsef")));Debug.locals.put("post", _post);
 BA.debugLineNum = 219;BA.debugLine="post.addHeder(\"User-Agent\",\"Dalvik/1.6.0 (Linux;";
Debug.ShouldStop(67108864);
_post.runVoidMethod ("addHeder",(Object)(BA.ObjectToString("User-Agent")),(Object)(RemoteObject.createImmutable("Dalvik/1.6.0 (Linux; U; Android 4.4.4; SM-A700FD Build/KTU84P)")));
 BA.debugLineNum = 220;BA.debugLine="post.addParametrs(\"req\",\"upsef\")";
Debug.ShouldStop(134217728);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("req")),(Object)(RemoteObject.createImmutable("upsef")));
 BA.debugLineNum = 222;BA.debugLine="post.addParametrs(\"ids\",id_req)";
Debug.ShouldStop(536870912);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("ids")),(Object)(_id_req));
 BA.debugLineNum = 224;BA.debugLine="post.executRequestAsString";
Debug.ShouldStop(-2147483648);
_post.runVoidMethod ("executRequestAsString");
 BA.debugLineNum = 226;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _up_seftele(RemoteObject _id_req) throws Exception{
try {
		Debug.PushSubsStack("up_seftele (firebasemessaging) ","firebasemessaging",6,firebasemessaging.processBA,firebasemessaging.mostCurrent,260);
if (RapidSub.canDelegate("up_seftele")) { return com.it.fome.firebasemessaging.remoteMe.runUserSub(false, "firebasemessaging","up_seftele", _id_req);}
RemoteObject _post = RemoteObject.declareNull("com.reza.sh.fastnet.PostRequestRaper");
Debug.locals.put("id_req", _id_req);
 BA.debugLineNum = 260;BA.debugLine="Sub up_seftele(id_req As String)";
Debug.ShouldStop(8);
 BA.debugLineNum = 262;BA.debugLine="prfn.initialize(\"prfn\")";
Debug.ShouldStop(32);
firebasemessaging._prfn.runVoidMethod ("initialize",firebasemessaging.processBA,(Object)(RemoteObject.createImmutable("prfn")));
 BA.debugLineNum = 263;BA.debugLine="Dim post As PostRequest";
Debug.ShouldStop(64);
_post = RemoteObject.createNew ("com.reza.sh.fastnet.PostRequestRaper");Debug.locals.put("post", _post);
 BA.debugLineNum = 264;BA.debugLine="post=prfn.BuildPostQuery(\"http://filework.ir/INST";
Debug.ShouldStop(128);
_post = firebasemessaging._prfn.runMethod(false,"BuildPostQuery",(Object)(BA.ObjectToString("http://filework.ir/INSTAFOLLOW/api/req.php")),(Object)(RemoteObject.createImmutable("upseftele")));Debug.locals.put("post", _post);
 BA.debugLineNum = 266;BA.debugLine="post.addHeder(\"User-Agent\",\"Dalvik/1.6.0 (Linux;";
Debug.ShouldStop(512);
_post.runVoidMethod ("addHeder",(Object)(BA.ObjectToString("User-Agent")),(Object)(RemoteObject.createImmutable("Dalvik/1.6.0 (Linux; U; Android 4.4.4; SM-A700FD Build/KTU84P)")));
 BA.debugLineNum = 267;BA.debugLine="post.addParametrs(\"req\",\"upseftele\")";
Debug.ShouldStop(1024);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("req")),(Object)(RemoteObject.createImmutable("upseftele")));
 BA.debugLineNum = 269;BA.debugLine="post.addParametrs(\"ids\",id_req)";
Debug.ShouldStop(4096);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("ids")),(Object)(_id_req));
 BA.debugLineNum = 271;BA.debugLine="post.executRequestAsString";
Debug.ShouldStop(16384);
_post.runVoidMethod ("executRequestAsString");
 BA.debugLineNum = 273;BA.debugLine="End Sub";
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