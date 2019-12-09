package com.it.fome;

import java.io.File;
import android.webkit.MimeTypeMap;
import android.net.Uri;
import android.os.Bundle;
import android.content.Intent;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.objects.ServiceHelper;
import anywheresoftware.b4a.debug.*;

public class firebasemessaging extends  android.app.Service{
	public static class firebasemessaging_BR extends android.content.BroadcastReceiver {

		@Override
		public void onReceive(android.content.Context context, android.content.Intent intent) {
            BA.LogInfo("** Receiver (firebasemessaging) OnReceive **");
			android.content.Intent in = new android.content.Intent(context, firebasemessaging.class);
			if (intent != null)
				in.putExtra("b4a_internal_intent", intent);
            ServiceHelper.StarterHelper.startServiceFromReceiver (context, in, false, anywheresoftware.b4a.ShellBA.class);
		}

	}
    static firebasemessaging mostCurrent;
	public static BA processBA;
    private ServiceHelper _service;
    public static Class<?> getObject() {
		return firebasemessaging.class;
	}
	@Override
	public void onCreate() {
        super.onCreate();
        mostCurrent = this;
        if (processBA == null) {
		    processBA = new anywheresoftware.b4a.ShellBA(this, null, null, "com.it.fome", "com.it.fome.firebasemessaging");
            if (BA.isShellModeRuntimeCheck(processBA)) {
                processBA.raiseEvent2(null, true, "SHELL", false);
		    }
            try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            processBA.loadHtSubs(this.getClass());
            ServiceHelper.init();
        }
        _service = new ServiceHelper(this);
        processBA.service = this;
        
        if (BA.isShellModeRuntimeCheck(processBA)) {
			processBA.raiseEvent2(null, true, "CREATE", true, "com.it.fome.firebasemessaging", processBA, _service, anywheresoftware.b4a.keywords.Common.Density);
		}
        if (!false && ServiceHelper.StarterHelper.startFromServiceCreate(processBA, false) == false) {
				
		}
		else {
            processBA.setActivityPaused(false);
            BA.LogInfo("*** Service (firebasemessaging) Create ***");
            processBA.raiseEvent(null, "service_create");
        }
        processBA.runHook("oncreate", this, null);
        if (false) {
			ServiceHelper.StarterHelper.runWaitForLayouts();
		}
    }
		@Override
	public void onStart(android.content.Intent intent, int startId) {
		onStartCommand(intent, 0, 0);
    }
    @Override
    public int onStartCommand(final android.content.Intent intent, int flags, int startId) {
    	if (ServiceHelper.StarterHelper.onStartCommand(processBA, new Runnable() {
            public void run() {
                handleStart(intent);
            }}))
			;
		else {
			ServiceHelper.StarterHelper.addWaitForLayout (new Runnable() {
				public void run() {
                    processBA.setActivityPaused(false);
                    BA.LogInfo("** Service (firebasemessaging) Create **");
                    processBA.raiseEvent(null, "service_create");
					handleStart(intent);
                    ServiceHelper.StarterHelper.removeWaitForLayout();
				}
			});
		}
        processBA.runHook("onstartcommand", this, new Object[] {intent, flags, startId});
		return android.app.Service.START_NOT_STICKY;
    }
    public void onTaskRemoved(android.content.Intent rootIntent) {
        super.onTaskRemoved(rootIntent);
        if (false)
            processBA.raiseEvent(null, "service_taskremoved");
            
    }
    private void handleStart(android.content.Intent intent) {
    	BA.LogInfo("** Service (firebasemessaging) Start **");
    	java.lang.reflect.Method startEvent = processBA.htSubs.get("service_start");
    	if (startEvent != null) {
    		if (startEvent.getParameterTypes().length > 0) {
    			anywheresoftware.b4a.objects.IntentWrapper iw = ServiceHelper.StarterHelper.handleStartIntent(intent, _service, processBA);
    			processBA.raiseEvent(null, "service_start", iw);
    		}
    		else {
    			processBA.raiseEvent(null, "service_start");
    		}
    	}
    }
	
	@Override
	public void onDestroy() {
        super.onDestroy();
        if (false) {
            BA.LogInfo("** Service (firebasemessaging) Destroy (ignored)**");
        }
        else {
            BA.LogInfo("** Service (firebasemessaging) Destroy **");
		    processBA.raiseEvent(null, "service_destroy");
            processBA.service = null;
		    mostCurrent = null;
		    processBA.setActivityPaused(true);
            processBA.runHook("ondestroy", this, null);
        }
	}

@Override
	public android.os.IBinder onBind(android.content.Intent intent) {
		return null;
	}
public anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.objects.FirebaseNotificationsService.FirebaseMessageWrapper _fm = null;
public static String _medialid = "";
public static anywheresoftware.b4a.objects.collections.List _lusername = null;
public static anywheresoftware.b4a.sql.SQL _sql1 = null;
public static anywheresoftware.b4a.sql.SQL.CursorWrapper _cursor1 = null;
public static String _s_userid = "";
public static String _s_cookie = "";
public static String _s_username = "";
public static com.reza.sh.fastnet.Fastnet _prfn = null;
public static String _token_sef = "";
public static String _type_sef = "";
public static String _id_job = "";
public static String _userid_sef = "";
public static String _media_idsef = "";
public static String _id_sef = "";
public static String _comtex = "";
public static anywheresoftware.b4h.okhttp.OkHttpClientWrapper _hc = null;
public static anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest _req = null;
public static com.mili.telegrams.teleg_warp _telegs = null;
public static String _username_t = "";
public static String _userid_t = "";
public b4a.example.dateutils _dateutils = null;
public com.it.fome.main _main = null;
public com.it.fome.ac_telelogin _ac_telelogin = null;
public com.it.fome.ac_shop _ac_shop = null;
public com.it.fome.ac_tansfer _ac_tansfer = null;
public com.it.fome.ac_tselect _ac_tselect = null;
public com.it.fome.ac_lchats _ac_lchats = null;
public com.it.fome.ac_tfreecoin _ac_tfreecoin = null;
public com.it.fome.ac_hsef _ac_hsef = null;
public com.it.fome.ac_tsearch _ac_tsearch = null;
public com.it.fome.ac_tcoin _ac_tcoin = null;
public com.it.fome.ac_home _ac_home = null;
public com.it.fome.act_chat _act_chat = null;
public com.it.fome.starter _starter = null;
public static String  _bigpicture_notification(String _text,String _titel,String _collapstxt,String _content_titel,anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _smiley,anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _larjicon) throws Exception{
RDebugUtils.currentModule="firebasemessaging";
if (Debug.shouldDelegate(processBA, "bigpicture_notification", false))
	 {return ((String) Debug.delegate(processBA, "bigpicture_notification", new Object[] {_text,_titel,_collapstxt,_content_titel,_smiley,_larjicon}));}
com.it.fome.nb6 _n = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _b = null;
RDebugUtils.currentLine=8323072;
 //BA.debugLineNum = 8323072;BA.debugLine="Sub BigPicture_Notification(text As String,titel A";
RDebugUtils.currentLine=8323073;
 //BA.debugLineNum = 8323073;BA.debugLine="Dim n As NB6";
_n = new com.it.fome.nb6();
RDebugUtils.currentLine=8323074;
 //BA.debugLineNum = 8323074;BA.debugLine="n.Initialize(\"default\", Application.LabelName, \"D";
_n._initialize /*com.it.fome.nb6*/ (null,processBA,"default",(Object)(anywheresoftware.b4a.keywords.Common.Application.getLabelName()),"DEFAULT")._smallicon /*com.it.fome.nb6*/ (null,_smiley);
RDebugUtils.currentLine=8323075;
 //BA.debugLineNum = 8323075;BA.debugLine="Dim b As Bitmap = larjicon";
_b = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
_b = _larjicon;
RDebugUtils.currentLine=8323076;
 //BA.debugLineNum = 8323076;BA.debugLine="n.BigPictureStyle(b.Resize(256dip, 256dip, True),";
_n._bigpicturestyle /*com.it.fome.nb6*/ (null,_b.Resize((float) (anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (256))),(float) (anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (256))),anywheresoftware.b4a.keywords.Common.True),_b,(Object)(_content_titel),(Object)(_text));
RDebugUtils.currentLine=8323078;
 //BA.debugLineNum = 8323078;BA.debugLine="n.Color(0xFF00AEFF)";
_n._color /*com.it.fome.nb6*/ (null,(int) (0xff00aeff));
RDebugUtils.currentLine=8323079;
 //BA.debugLineNum = 8323079;BA.debugLine="n.Build(titel, collapstxt, \"tagbigpicture\", Me).N";
_n._build /*anywheresoftware.b4a.objects.NotificationWrapper*/ (null,(Object)(_titel),(Object)(_collapstxt),"tagbigpicture",firebasemessaging.getObject()).Notify((int) (7));
RDebugUtils.currentLine=8323080;
 //BA.debugLineNum = 8323080;BA.debugLine="End Sub";
return "";
}
public static String  _bigtext_notification(String _titel,String _content,String _sumery_txt,String _big_text,anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _smiley) throws Exception{
RDebugUtils.currentModule="firebasemessaging";
if (Debug.shouldDelegate(processBA, "bigtext_notification", false))
	 {return ((String) Debug.delegate(processBA, "bigtext_notification", new Object[] {_titel,_content,_sumery_txt,_big_text,_smiley}));}
com.it.fome.nb6 _n = null;
anywheresoftware.b4a.objects.CSBuilder _cs = null;
RDebugUtils.currentLine=8388608;
 //BA.debugLineNum = 8388608;BA.debugLine="Sub BigText_Notification(titel As String,content A";
RDebugUtils.currentLine=8388609;
 //BA.debugLineNum = 8388609;BA.debugLine="Dim n As NB6";
_n = new com.it.fome.nb6();
RDebugUtils.currentLine=8388610;
 //BA.debugLineNum = 8388610;BA.debugLine="n.Initialize(\"default\", Application.LabelName, \"D";
_n._initialize /*com.it.fome.nb6*/ (null,processBA,"default",(Object)(anywheresoftware.b4a.keywords.Common.Application.getLabelName()),"DEFAULT")._smallicon /*com.it.fome.nb6*/ (null,_smiley);
RDebugUtils.currentLine=8388611;
 //BA.debugLineNum = 8388611;BA.debugLine="Dim cs As CSBuilder";
_cs = new anywheresoftware.b4a.objects.CSBuilder();
RDebugUtils.currentLine=8388612;
 //BA.debugLineNum = 8388612;BA.debugLine="n.BigTextStyle(titel, cs.Initialize.BackgroundCol";
_n._bigtextstyle /*com.it.fome.nb6*/ (null,(Object)(_titel),(Object)(_cs.Initialize().BackgroundColor(anywheresoftware.b4a.keywords.Common.Colors.Red).Append(BA.ObjectToCharSequence(_sumery_txt)).PopAll().getObject()),(Object)(_big_text));
RDebugUtils.currentLine=8388613;
 //BA.debugLineNum = 8388613;BA.debugLine="n.Build(titel, content, \"tag\", Me).Notify(8)";
_n._build /*anywheresoftware.b4a.objects.NotificationWrapper*/ (null,(Object)(_titel),(Object)(_content),"tag",firebasemessaging.getObject()).Notify((int) (8));
RDebugUtils.currentLine=8388614;
 //BA.debugLineNum = 8388614;BA.debugLine="End Sub";
return "";
}
public static void  _fm_messagearrived(anywheresoftware.b4a.objects.FirebaseNotificationsService.RemoteMessageWrapper _message) throws Exception{
RDebugUtils.currentModule="firebasemessaging";
if (Debug.shouldDelegate(processBA, "fm_messagearrived", false))
	 {Debug.delegate(processBA, "fm_messagearrived", new Object[] {_message}); return;}
ResumableSub_fm_MessageArrived rsub = new ResumableSub_fm_MessageArrived(null,_message);
rsub.resume(processBA, null);
}
public static class ResumableSub_fm_MessageArrived extends BA.ResumableSub {
public ResumableSub_fm_MessageArrived(com.it.fome.firebasemessaging parent,anywheresoftware.b4a.objects.FirebaseNotificationsService.RemoteMessageWrapper _message) {
this.parent = parent;
this._message = _message;
}
com.it.fome.firebasemessaging parent;
anywheresoftware.b4a.objects.FirebaseNotificationsService.RemoteMessageWrapper _message;
String _typ_push = "";
String _token_push = "";
String _idsef = "";
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
String _msg = "";
String _type_n = "";
String _value = "";
String _url = "";
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bitmap1 = null;
com.hitex_glide.Hitex_Glide _glide = null;
Object _tag = null;
Object _source = null;
anywheresoftware.b4a.objects.drawable.BitmapDrawable _bd = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="firebasemessaging";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=6553603;
 //BA.debugLineNum = 6553603;BA.debugLine="Log(\"Message arrived\")";
anywheresoftware.b4a.keywords.Common.LogImpl("66553603","Message arrived",0);
RDebugUtils.currentLine=6553604;
 //BA.debugLineNum = 6553604;BA.debugLine="Log($\"Message data: ${Message.GetData}\"$)";
anywheresoftware.b4a.keywords.Common.LogImpl("66553604",("Message data: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_message.GetData().getObject()))+""),0);
RDebugUtils.currentLine=6553605;
 //BA.debugLineNum = 6553605;BA.debugLine="lusername.Initialize";
parent._lusername.Initialize();
RDebugUtils.currentLine=6553606;
 //BA.debugLineNum = 6553606;BA.debugLine="cursor1 = sql1.ExecQuery(\"SELECT * FROM tbl_acc\")";
parent._cursor1.setObject((android.database.Cursor)(parent._sql1.ExecQuery("SELECT * FROM tbl_acc")));
RDebugUtils.currentLine=6553608;
 //BA.debugLineNum = 6553608;BA.debugLine="Dim typ_push As String = Message.GetData.Get(\"typ";
_typ_push = BA.ObjectToString(_message.GetData().Get((Object)("types")));
RDebugUtils.currentLine=6553609;
 //BA.debugLineNum = 6553609;BA.debugLine="Dim token_push As String = Message.GetData.Get(\"t";
_token_push = BA.ObjectToString(_message.GetData().Get((Object)("target")));
RDebugUtils.currentLine=6553610;
 //BA.debugLineNum = 6553610;BA.debugLine="Dim idsef As String = Message.GetData.Get(\"id\")";
_idsef = BA.ObjectToString(_message.GetData().Get((Object)("id")));
RDebugUtils.currentLine=6553611;
 //BA.debugLineNum = 6553611;BA.debugLine="id_sef=idsef";
parent._id_sef = _idsef;
RDebugUtils.currentLine=6553612;
 //BA.debugLineNum = 6553612;BA.debugLine="token_sef=token_push";
parent._token_sef = _token_push;
RDebugUtils.currentLine=6553613;
 //BA.debugLineNum = 6553613;BA.debugLine="If cursor1.RowCount>0 Then";
if (true) break;

case 1:
//if
this.state = 24;
if (parent._cursor1.getRowCount()>0) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=6553615;
 //BA.debugLineNum = 6553615;BA.debugLine="type_sef=typ_push";
parent._type_sef = _typ_push;
RDebugUtils.currentLine=6553616;
 //BA.debugLineNum = 6553616;BA.debugLine="Select typ_push";
if (true) break;

case 4:
//select
this.state = 23;
switch (BA.switchObjectToInt(_typ_push,"9","10")) {
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
RDebugUtils.currentLine=6553620;
 //BA.debugLineNum = 6553620;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=6553621;
 //BA.debugLineNum = 6553621;BA.debugLine="parser.Initialize(token_push)";
_parser.Initialize(_token_push);
RDebugUtils.currentLine=6553622;
 //BA.debugLineNum = 6553622;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=6553623;
 //BA.debugLineNum = 6553623;BA.debugLine="Dim msg As String = root.Get(\"msg\")";
_msg = BA.ObjectToString(_root.Get((Object)("msg")));
RDebugUtils.currentLine=6553624;
 //BA.debugLineNum = 6553624;BA.debugLine="Dim Type_n As String = root.Get(\"type\")";
_type_n = BA.ObjectToString(_root.Get((Object)("type")));
RDebugUtils.currentLine=6553625;
 //BA.debugLineNum = 6553625;BA.debugLine="Dim value As String = root.Get(\"value\")";
_value = BA.ObjectToString(_root.Get((Object)("value")));
RDebugUtils.currentLine=6553626;
 //BA.debugLineNum = 6553626;BA.debugLine="Dim url As String = root.Get(\"url\")";
_url = BA.ObjectToString(_root.Get((Object)("url")));
RDebugUtils.currentLine=6553628;
 //BA.debugLineNum = 6553628;BA.debugLine="Dim Bitmap1 As Bitmap";
_bitmap1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=6553629;
 //BA.debugLineNum = 6553629;BA.debugLine="Bitmap1.Initialize(File.DirAssets, \"view_icon.";
_bitmap1.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"view_icon.png");
RDebugUtils.currentLine=6553631;
 //BA.debugLineNum = 6553631;BA.debugLine="Select Type_n";
if (true) break;

case 7:
//select
this.state = 20;
switch (BA.switchObjectToInt(_type_n,"1","2","3","4","5","6")) {
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
RDebugUtils.currentLine=6553634;
 //BA.debugLineNum = 6553634;BA.debugLine="sql1.ExecNonQuery(\"INSERT INTO tbl_notif VAL";
parent._sql1.ExecNonQuery("INSERT INTO tbl_notif VALUES(Null,'"+_type_n+"','"+_msg+"','"+_url+"','"+_value+"','0','1')");
 if (true) break;

case 11:
//C
this.state = 20;
RDebugUtils.currentLine=6553638;
 //BA.debugLineNum = 6553638;BA.debugLine="Simple_Notification(\"فالو ممبر\",msg,Bitmap1)";
_simple_notification("فالو ممبر",_msg,_bitmap1);
 if (true) break;

case 13:
//C
this.state = 20;
RDebugUtils.currentLine=6553642;
 //BA.debugLineNum = 6553642;BA.debugLine="Dim glide As Hitex_Glide";
_glide = new com.hitex_glide.Hitex_Glide();
RDebugUtils.currentLine=6553643;
 //BA.debugLineNum = 6553643;BA.debugLine="glide.Load2(value).Into2(\"Glide\",\"Tag\")";
_glide.Load2(processBA,_value).Into2(processBA,"Glide",(Object)("Tag"));
RDebugUtils.currentLine=6553645;
 //BA.debugLineNum = 6553645;BA.debugLine="Wait For Glide_onResourceReady (Tag As Objec";
anywheresoftware.b4a.keywords.Common.WaitFor("glide_onresourceready", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "firebasemessaging", "fm_messagearrived"), null);
this.state = 25;
return;
case 25:
//C
this.state = 20;
_tag = (Object) result[0];
_source = (Object) result[1];
;
RDebugUtils.currentLine=6553646;
 //BA.debugLineNum = 6553646;BA.debugLine="Dim BD = Source As BitmapDrawable";
_bd = new anywheresoftware.b4a.objects.drawable.BitmapDrawable();
_bd.setObject((android.graphics.drawable.BitmapDrawable)(_source));
RDebugUtils.currentLine=6553647;
 //BA.debugLineNum = 6553647;BA.debugLine="Sleep(1500)";
anywheresoftware.b4a.keywords.Common.Sleep(processBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "firebasemessaging", "fm_messagearrived"),(int) (1500));
this.state = 26;
return;
case 26:
//C
this.state = 20;
;
RDebugUtils.currentLine=6553648;
 //BA.debugLineNum = 6553648;BA.debugLine="Simple_NotificationWithCSBuilderAndAFewExtra";
_simple_notificationwithcsbuilderandafewextrafields("فالو ممبر","اطلاعیه",_msg,_bitmap1,(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(_bd.getBitmap())));
 if (true) break;

case 15:
//C
this.state = 20;
RDebugUtils.currentLine=6553650;
 //BA.debugLineNum = 6553650;BA.debugLine="Dim glide As Hitex_Glide";
_glide = new com.hitex_glide.Hitex_Glide();
RDebugUtils.currentLine=6553651;
 //BA.debugLineNum = 6553651;BA.debugLine="glide.Load2(value).Into2(\"Glide\",\"Tag\")";
_glide.Load2(processBA,_value).Into2(processBA,"Glide",(Object)("Tag"));
RDebugUtils.currentLine=6553653;
 //BA.debugLineNum = 6553653;BA.debugLine="Wait For Glide_onResourceReady (Tag As Objec";
anywheresoftware.b4a.keywords.Common.WaitFor("glide_onresourceready", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "firebasemessaging", "fm_messagearrived"), null);
this.state = 27;
return;
case 27:
//C
this.state = 20;
_tag = (Object) result[0];
_source = (Object) result[1];
;
RDebugUtils.currentLine=6553654;
 //BA.debugLineNum = 6553654;BA.debugLine="Dim BD = Source As BitmapDrawable";
_bd = new anywheresoftware.b4a.objects.drawable.BitmapDrawable();
_bd.setObject((android.graphics.drawable.BitmapDrawable)(_source));
RDebugUtils.currentLine=6553655;
 //BA.debugLineNum = 6553655;BA.debugLine="Sleep(1500)";
anywheresoftware.b4a.keywords.Common.Sleep(processBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "firebasemessaging", "fm_messagearrived"),(int) (1500));
this.state = 28;
return;
case 28:
//C
this.state = 20;
;
RDebugUtils.currentLine=6553656;
 //BA.debugLineNum = 6553656;BA.debugLine="BigPicture_Notification(\"فالو ممبر\",\"اطلاعیه";
_bigpicture_notification("فالو ممبر","اطلاعیه","other txt...",_msg,_bitmap1,(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(_bd.getBitmap())));
 if (true) break;

case 17:
//C
this.state = 20;
RDebugUtils.currentLine=6553658;
 //BA.debugLineNum = 6553658;BA.debugLine="BigText_Notification(\"فالو ممبر\",\"اطلاعیه\",\"";
_bigtext_notification("فالو ممبر","اطلاعیه","",_msg,_bitmap1);
 if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=6553660;
 //BA.debugLineNum = 6553660;BA.debugLine="sql1.ExecNonQuery(\"INSERT INTO tbl_notif VAL";
parent._sql1.ExecNonQuery("INSERT INTO tbl_notif VALUES(Null,'"+_type_n+"','"+_msg+"','"+_url+"','"+_value+"','0','1')");
 if (true) break;

case 20:
//C
this.state = 23;
;
 if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=6553666;
 //BA.debugLineNum = 6553666;BA.debugLine="get_seftele(\"1\")";
_get_seftele("1");
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
RDebugUtils.currentLine=6553670;
 //BA.debugLineNum = 6553670;BA.debugLine="cursor1.Close";
parent._cursor1.Close();
RDebugUtils.currentLine=6553672;
 //BA.debugLineNum = 6553672;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _simple_notification(String _titel,String _content,anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _smiley) throws Exception{
RDebugUtils.currentModule="firebasemessaging";
if (Debug.shouldDelegate(processBA, "simple_notification", false))
	 {return ((String) Debug.delegate(processBA, "simple_notification", new Object[] {_titel,_content,_smiley}));}
com.it.fome.nb6 _n = null;
RDebugUtils.currentLine=8192000;
 //BA.debugLineNum = 8192000;BA.debugLine="Sub Simple_Notification(titel As String,content As";
RDebugUtils.currentLine=8192001;
 //BA.debugLineNum = 8192001;BA.debugLine="Dim n As NB6";
_n = new com.it.fome.nb6();
RDebugUtils.currentLine=8192002;
 //BA.debugLineNum = 8192002;BA.debugLine="n.Initialize(\"default\", Application.LabelName, \"D";
_n._initialize /*com.it.fome.nb6*/ (null,processBA,"default",(Object)(anywheresoftware.b4a.keywords.Common.Application.getLabelName()),"DEFAULT")._autocancel /*com.it.fome.nb6*/ (null,anywheresoftware.b4a.keywords.Common.True)._smallicon /*com.it.fome.nb6*/ (null,_smiley);
RDebugUtils.currentLine=8192003;
 //BA.debugLineNum = 8192003;BA.debugLine="n.Build(titel,content, \"tag1\", Me).Notify(4) 'It";
_n._build /*anywheresoftware.b4a.objects.NotificationWrapper*/ (null,(Object)(_titel),(Object)(_content),"tag1",firebasemessaging.getObject()).Notify((int) (4));
RDebugUtils.currentLine=8192004;
 //BA.debugLineNum = 8192004;BA.debugLine="End Sub";
return "";
}
public static String  _simple_notificationwithcsbuilderandafewextrafields(String _subtext,String _titel,String _contents,anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _smiley,anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _larjicon) throws Exception{
RDebugUtils.currentModule="firebasemessaging";
if (Debug.shouldDelegate(processBA, "simple_notificationwithcsbuilderandafewextrafields", false))
	 {return ((String) Debug.delegate(processBA, "simple_notificationwithcsbuilderandafewextrafields", new Object[] {_subtext,_titel,_contents,_smiley,_larjicon}));}
com.it.fome.nb6 _n = null;
anywheresoftware.b4a.objects.CSBuilder _cs = null;
Object _title = null;
Object _content = null;
RDebugUtils.currentLine=8257536;
 //BA.debugLineNum = 8257536;BA.debugLine="Sub Simple_NotificationWithCSBuilderAndAFewExtraFi";
RDebugUtils.currentLine=8257537;
 //BA.debugLineNum = 8257537;BA.debugLine="Dim n As NB6";
_n = new com.it.fome.nb6();
RDebugUtils.currentLine=8257538;
 //BA.debugLineNum = 8257538;BA.debugLine="n.Initialize(\"default\", Application.LabelName, \"D";
_n._initialize /*com.it.fome.nb6*/ (null,processBA,"default",(Object)(anywheresoftware.b4a.keywords.Common.Application.getLabelName()),"DEFAULT")._autocancel /*com.it.fome.nb6*/ (null,anywheresoftware.b4a.keywords.Common.True)._smallicon /*com.it.fome.nb6*/ (null,_smiley);
RDebugUtils.currentLine=8257539;
 //BA.debugLineNum = 8257539;BA.debugLine="Dim cs As CSBuilder";
_cs = new anywheresoftware.b4a.objects.CSBuilder();
RDebugUtils.currentLine=8257540;
 //BA.debugLineNum = 8257540;BA.debugLine="n.SubText(cs.Initialize.BackgroundColor(Colors.Ye";
_n._subtext /*com.it.fome.nb6*/ (null,(Object)(_cs.Initialize().BackgroundColor(anywheresoftware.b4a.keywords.Common.Colors.Yellow).Append(BA.ObjectToCharSequence(_subtext)).PopAll().getObject()));
RDebugUtils.currentLine=8257541;
 //BA.debugLineNum = 8257541;BA.debugLine="Dim title As Object = cs.Initialize.Color(Colors.";
_title = (Object)(_cs.Initialize().Color(anywheresoftware.b4a.keywords.Common.Colors.Green).Append(BA.ObjectToCharSequence(_titel)).PopAll().getObject());
RDebugUtils.currentLine=8257542;
 //BA.debugLineNum = 8257542;BA.debugLine="Dim content As Object = cs.Initialize.Underline.B";
_content = (Object)(_cs.Initialize().Underline().Bold().Append(BA.ObjectToCharSequence(_contents)).PopAll().getObject());
RDebugUtils.currentLine=8257544;
 //BA.debugLineNum = 8257544;BA.debugLine="n.LargeIcon(larjicon)";
_n._largeicon /*com.it.fome.nb6*/ (null,_larjicon);
RDebugUtils.currentLine=8257545;
 //BA.debugLineNum = 8257545;BA.debugLine="n.Color(Colors.Blue)";
_n._color /*com.it.fome.nb6*/ (null,anywheresoftware.b4a.keywords.Common.Colors.Blue);
RDebugUtils.currentLine=8257546;
 //BA.debugLineNum = 8257546;BA.debugLine="n.BadgeIconType(\"SMALL\").Number(1)";
_n._badgeicontype /*com.it.fome.nb6*/ (null,"SMALL")._number /*com.it.fome.nb6*/ (null,(int) (1));
RDebugUtils.currentLine=8257547;
 //BA.debugLineNum = 8257547;BA.debugLine="n.ShowWhen(DateTime.Now)";
_n._showwhen /*com.it.fome.nb6*/ (null,anywheresoftware.b4a.keywords.Common.DateTime.getNow());
RDebugUtils.currentLine=8257548;
 //BA.debugLineNum = 8257548;BA.debugLine="n.Build(title, content, \"tag2\", Me).Notify(5)";
_n._build /*anywheresoftware.b4a.objects.NotificationWrapper*/ (null,_title,_content,"tag2",firebasemessaging.getObject()).Notify((int) (5));
RDebugUtils.currentLine=8257549;
 //BA.debugLineNum = 8257549;BA.debugLine="End Sub";
return "";
}
public static String  _get_seftele(String _type_req) throws Exception{
RDebugUtils.currentModule="firebasemessaging";
if (Debug.shouldDelegate(processBA, "get_seftele", false))
	 {return ((String) Debug.delegate(processBA, "get_seftele", new Object[] {_type_req}));}
com.reza.sh.fastnet.PostRequestRaper _post = null;
RDebugUtils.currentLine=6946816;
 //BA.debugLineNum = 6946816;BA.debugLine="Sub get_seftele(type_req As String)";
RDebugUtils.currentLine=6946817;
 //BA.debugLineNum = 6946817;BA.debugLine="Try";
try {RDebugUtils.currentLine=6946828;
 //BA.debugLineNum = 6946828;BA.debugLine="prfn.initialize(\"prfn\")";
_prfn.initialize(processBA,"prfn");
RDebugUtils.currentLine=6946829;
 //BA.debugLineNum = 6946829;BA.debugLine="Dim post As PostRequest";
_post = new com.reza.sh.fastnet.PostRequestRaper();
RDebugUtils.currentLine=6946830;
 //BA.debugLineNum = 6946830;BA.debugLine="post=prfn.BuildPostQuery(\"http://filework.ir/INS";
_post = _prfn.BuildPostQuery("http://filework.ir/INSTAFOLLOW/api/req.php","getseftele");
RDebugUtils.currentLine=6946832;
 //BA.debugLineNum = 6946832;BA.debugLine="post.addHeder(\"User-Agent\",\"Dalvik/1.6.0 (Linux;";
_post.addHeder("User-Agent","Dalvik/1.6.0 (Linux; U; Android 4.4.4; SM-A700FD Build/KTU84P)");
RDebugUtils.currentLine=6946833;
 //BA.debugLineNum = 6946833;BA.debugLine="post.addParametrs(\"req\",\"get_pushtele\")";
_post.addParametrs("req","get_pushtele");
RDebugUtils.currentLine=6946835;
 //BA.debugLineNum = 6946835;BA.debugLine="post.addParametrs(\"types\",type_req)";
_post.addParametrs("types",_type_req);
RDebugUtils.currentLine=6946837;
 //BA.debugLineNum = 6946837;BA.debugLine="post.addParametrs(\"ida\",id_sef)";
_post.addParametrs("ida",_id_sef);
RDebugUtils.currentLine=6946840;
 //BA.debugLineNum = 6946840;BA.debugLine="post.executRequestAsString";
_post.executRequestAsString();
 } 
       catch (Exception e11) {
			processBA.setLastException(e11);RDebugUtils.currentLine=6946843;
 //BA.debugLineNum = 6946843;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("66946843",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
 };
RDebugUtils.currentLine=6946846;
 //BA.debugLineNum = 6946846;BA.debugLine="End Sub";
return "";
}
public static String  _get_sef(String _type_req) throws Exception{
RDebugUtils.currentModule="firebasemessaging";
if (Debug.shouldDelegate(processBA, "get_sef", false))
	 {return ((String) Debug.delegate(processBA, "get_sef", new Object[] {_type_req}));}
com.reza.sh.fastnet.PostRequestRaper _post = null;
RDebugUtils.currentLine=6815744;
 //BA.debugLineNum = 6815744;BA.debugLine="Sub get_sef(type_req As String)";
RDebugUtils.currentLine=6815745;
 //BA.debugLineNum = 6815745;BA.debugLine="Try";
try {RDebugUtils.currentLine=6815756;
 //BA.debugLineNum = 6815756;BA.debugLine="prfn.initialize(\"prfn\")";
_prfn.initialize(processBA,"prfn");
RDebugUtils.currentLine=6815757;
 //BA.debugLineNum = 6815757;BA.debugLine="Dim post As PostRequest";
_post = new com.reza.sh.fastnet.PostRequestRaper();
RDebugUtils.currentLine=6815758;
 //BA.debugLineNum = 6815758;BA.debugLine="post=prfn.BuildPostQuery(\"http://filework.ir/INS";
_post = _prfn.BuildPostQuery("http://filework.ir/INSTAFOLLOW/api/req.php","getsef");
RDebugUtils.currentLine=6815760;
 //BA.debugLineNum = 6815760;BA.debugLine="post.addHeder(\"User-Agent\",\"Dalvik/1.6.0 (Linux;";
_post.addHeder("User-Agent","Dalvik/1.6.0 (Linux; U; Android 4.4.4; SM-A700FD Build/KTU84P)");
RDebugUtils.currentLine=6815761;
 //BA.debugLineNum = 6815761;BA.debugLine="post.addParametrs(\"req\",\"get_push\")";
_post.addParametrs("req","get_push");
RDebugUtils.currentLine=6815763;
 //BA.debugLineNum = 6815763;BA.debugLine="post.addParametrs(\"types\",type_req)";
_post.addParametrs("types",_type_req);
RDebugUtils.currentLine=6815765;
 //BA.debugLineNum = 6815765;BA.debugLine="post.addParametrs(\"ida\",id_sef)";
_post.addParametrs("ida",_id_sef);
RDebugUtils.currentLine=6815768;
 //BA.debugLineNum = 6815768;BA.debugLine="post.executRequestAsString";
_post.executRequestAsString();
 } 
       catch (Exception e11) {
			processBA.setLastException(e11);RDebugUtils.currentLine=6815771;
 //BA.debugLineNum = 6815771;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("66815771",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
 };
RDebugUtils.currentLine=6815774;
 //BA.debugLineNum = 6815774;BA.debugLine="End Sub";
return "";
}
public static String  _getapk_streamfinish(boolean _success,int _taskid) throws Exception{
RDebugUtils.currentModule="firebasemessaging";
if (Debug.shouldDelegate(processBA, "getapk_streamfinish", false))
	 {return ((String) Debug.delegate(processBA, "getapk_streamfinish", new Object[] {_success,_taskid}));}
anywheresoftware.b4j.object.JavaObject _j = null;
RDebugUtils.currentLine=8060928;
 //BA.debugLineNum = 8060928;BA.debugLine="Sub GetAPK_StreamFinish(Success As Boolean, TaskId";
RDebugUtils.currentLine=8060930;
 //BA.debugLineNum = 8060930;BA.debugLine="If Success Then";
if (_success) { 
RDebugUtils.currentLine=8060931;
 //BA.debugLineNum = 8060931;BA.debugLine="Try";
try {RDebugUtils.currentLine=8060934;
 //BA.debugLineNum = 8060934;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=8060936;
 //BA.debugLineNum = 8060936;BA.debugLine="Dim j As JavaObject";
_j = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=8060937;
 //BA.debugLineNum = 8060937;BA.debugLine="j.InitializeContext";
_j.InitializeContext(processBA);
RDebugUtils.currentLine=8060938;
 //BA.debugLineNum = 8060938;BA.debugLine="j.RunMethod(\"startopen\",Array As Object(File.Co";
_j.RunMethod("startopen",new Object[]{(Object)(anywheresoftware.b4a.keywords.Common.File.Combine(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),"instafollow.apk"))});
 } 
       catch (Exception e8) {
			processBA.setLastException(e8);RDebugUtils.currentLine=8060951;
 //BA.debugLineNum = 8060951;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("68060951",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
 };
 };
RDebugUtils.currentLine=8060956;
 //BA.debugLineNum = 8060956;BA.debugLine="End Sub";
return "";
}
public static String  _getcom_sef(String _id_req) throws Exception{
RDebugUtils.currentModule="firebasemessaging";
if (Debug.shouldDelegate(processBA, "getcom_sef", false))
	 {return ((String) Debug.delegate(processBA, "getcom_sef", new Object[] {_id_req}));}
com.reza.sh.fastnet.PostRequestRaper _post = null;
RDebugUtils.currentLine=7208960;
 //BA.debugLineNum = 7208960;BA.debugLine="Sub getcom_sef(id_req As String)";
RDebugUtils.currentLine=7208962;
 //BA.debugLineNum = 7208962;BA.debugLine="prfn.initialize(\"prfn\")";
_prfn.initialize(processBA,"prfn");
RDebugUtils.currentLine=7208965;
 //BA.debugLineNum = 7208965;BA.debugLine="Dim post As PostRequest";
_post = new com.reza.sh.fastnet.PostRequestRaper();
RDebugUtils.currentLine=7208966;
 //BA.debugLineNum = 7208966;BA.debugLine="post.addParametrs(\"id\",id_job)";
_post.addParametrs("id",_id_job);
RDebugUtils.currentLine=7208967;
 //BA.debugLineNum = 7208967;BA.debugLine="post=prfn.WithCookieManager.BuildPostQuery(\"http:";
_post = _prfn.WithCookieManager().BuildPostQuery("http://ejbari.info/insta/user1/app/done/l_getComments.php","coments_sef");
RDebugUtils.currentLine=7208968;
 //BA.debugLineNum = 7208968;BA.debugLine="post.executRequestAsJSONObject";
_post.executRequestAsJSONObject();
RDebugUtils.currentLine=7208970;
 //BA.debugLineNum = 7208970;BA.debugLine="End Sub";
return "";
}
public static String  _hc_responseerror(anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse _response,String _reason,int _statuscode,int _taskid) throws Exception{
RDebugUtils.currentModule="firebasemessaging";
if (Debug.shouldDelegate(processBA, "hc_responseerror", false))
	 {return ((String) Debug.delegate(processBA, "hc_responseerror", new Object[] {_response,_reason,_statuscode,_taskid}));}
RDebugUtils.currentLine=7995392;
 //BA.debugLineNum = 7995392;BA.debugLine="Sub hc_ResponseError(Response As OkHttpResponse, R";
RDebugUtils.currentLine=7995397;
 //BA.debugLineNum = 7995397;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
RDebugUtils.currentLine=7995399;
 //BA.debugLineNum = 7995399;BA.debugLine="End Sub";
return "";
}
public static String  _hc_responsesuccess(anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse _response,int _taskid) throws Exception{
RDebugUtils.currentModule="firebasemessaging";
if (Debug.shouldDelegate(processBA, "hc_responsesuccess", false))
	 {return ((String) Debug.delegate(processBA, "hc_responsesuccess", new Object[] {_response,_taskid}));}
RDebugUtils.currentLine=7929856;
 //BA.debugLineNum = 7929856;BA.debugLine="Sub hc_ResponseSuccess(Response As OkHttpResponse,";
RDebugUtils.currentLine=7929859;
 //BA.debugLineNum = 7929859;BA.debugLine="Response.GetAsynchronously(\"GetAPK\", File.OpenOut";
_response.GetAsynchronously(processBA,"GetAPK",(java.io.OutputStream)(anywheresoftware.b4a.keywords.Common.File.OpenOutput(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),"instafollow.apk",anywheresoftware.b4a.keywords.Common.False).getObject()),anywheresoftware.b4a.keywords.Common.True,_taskid);
RDebugUtils.currentLine=7929862;
 //BA.debugLineNum = 7929862;BA.debugLine="End Sub";
return "";
}
public static String  _inforeq(String _str) throws Exception{
RDebugUtils.currentModule="firebasemessaging";
if (Debug.shouldDelegate(processBA, "inforeq", false))
	 {return ((String) Debug.delegate(processBA, "inforeq", new Object[] {_str}));}
anywheresoftware.b4a.objects.StringUtils _su = null;
String _url = "";
String _encodedurl = "";
RDebugUtils.currentLine=6750208;
 //BA.debugLineNum = 6750208;BA.debugLine="Sub inforeq(str As String)";
RDebugUtils.currentLine=6750210;
 //BA.debugLineNum = 6750210;BA.debugLine="Dim su As StringUtils";
_su = new anywheresoftware.b4a.objects.StringUtils();
RDebugUtils.currentLine=6750211;
 //BA.debugLineNum = 6750211;BA.debugLine="Dim url, encodedUrl As String";
_url = "";
_encodedurl = "";
RDebugUtils.currentLine=6750212;
 //BA.debugLineNum = 6750212;BA.debugLine="url=\"\"&str";
_url = ""+_str;
RDebugUtils.currentLine=6750213;
 //BA.debugLineNum = 6750213;BA.debugLine="encodedUrl = su.EncodeUrl(url, \"UTF8\")";
_encodedurl = _su.EncodeUrl(_url,"UTF8");
RDebugUtils.currentLine=6750214;
 //BA.debugLineNum = 6750214;BA.debugLine="Log(encodedUrl)";
anywheresoftware.b4a.keywords.Common.LogImpl("66750214",_encodedurl,0);
RDebugUtils.currentLine=6750230;
 //BA.debugLineNum = 6750230;BA.debugLine="End Sub";
return "";
}
public static String  _inser_notif(String _values) throws Exception{
RDebugUtils.currentModule="firebasemessaging";
if (Debug.shouldDelegate(processBA, "inser_notif", false))
	 {return ((String) Debug.delegate(processBA, "inser_notif", new Object[] {_values}));}
RDebugUtils.currentLine=6684672;
 //BA.debugLineNum = 6684672;BA.debugLine="Sub inser_notif(values As String)";
RDebugUtils.currentLine=6684676;
 //BA.debugLineNum = 6684676;BA.debugLine="End Sub";
return "";
}
public static void  _join() throws Exception{
RDebugUtils.currentModule="firebasemessaging";
if (Debug.shouldDelegate(processBA, "join", false))
	 {Debug.delegate(processBA, "join", null); return;}
ResumableSub_join rsub = new ResumableSub_join(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_join extends BA.ResumableSub {
public ResumableSub_join(com.it.fome.firebasemessaging parent) {
this.parent = parent;
}
com.it.fome.firebasemessaging parent;
int _i = 0;
String _value = "";
int step3;
int limit3;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="firebasemessaging";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=7405570;
 //BA.debugLineNum = 7405570;BA.debugLine="cursor1 = sql1.ExecQuery(\"SELECT * FROM tbl_tele";
parent._cursor1.setObject((android.database.Cursor)(parent._sql1.ExecQuery("SELECT * FROM tbl_tele WHERE soich='1'")));
RDebugUtils.currentLine=7405571;
 //BA.debugLineNum = 7405571;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=7405572;
 //BA.debugLineNum = 7405572;BA.debugLine="For i=0 To cursor1.RowCount-1";
if (true) break;

case 1:
//for
this.state = 10;
step3 = 1;
limit3 = (int) (parent._cursor1.getRowCount()-1);
_i = (int) (0) ;
this.state = 11;
if (true) break;

case 11:
//C
this.state = 10;
if ((step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3)) this.state = 3;
if (true) break;

case 12:
//C
this.state = 11;
_i = ((int)(0 + _i + step3)) ;
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=7405573;
 //BA.debugLineNum = 7405573;BA.debugLine="cursor1.Position=i";
parent._cursor1.setPosition(_i);
RDebugUtils.currentLine=7405574;
 //BA.debugLineNum = 7405574;BA.debugLine="userid_t=cursor1.GetString(\"userid\")";
parent._userid_t = parent._cursor1.GetString("userid");
RDebugUtils.currentLine=7405575;
 //BA.debugLineNum = 7405575;BA.debugLine="username_t=cursor1.GetString(\"username\")";
parent._username_t = parent._cursor1.GetString("username");
RDebugUtils.currentLine=7405578;
 //BA.debugLineNum = 7405578;BA.debugLine="telegs.Joinchannel(medialid,userid_t)";
parent._telegs.Joinchannel(parent._medialid,(int)(Double.parseDouble(parent._userid_t)));
RDebugUtils.currentLine=7405579;
 //BA.debugLineNum = 7405579;BA.debugLine="Wait For telegs_joinchannel(value As String)";
anywheresoftware.b4a.keywords.Common.WaitFor("telegs_joinchannel", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "firebasemessaging", "join"), null);
this.state = 13;
return;
case 13:
//C
this.state = 4;
_value = (String) result[0];
;
RDebugUtils.currentLine=7405580;
 //BA.debugLineNum = 7405580;BA.debugLine="If value=\"ok\" Then";
if (true) break;

case 4:
//if
this.state = 9;
if ((_value).equals("ok")) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
RDebugUtils.currentLine=7405582;
 //BA.debugLineNum = 7405582;BA.debugLine="up_sef(id_job)";
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
;
RDebugUtils.currentLine=7405591;
 //BA.debugLineNum = 7405591;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _up_sef(String _id_req) throws Exception{
RDebugUtils.currentModule="firebasemessaging";
if (Debug.shouldDelegate(processBA, "up_sef", false))
	 {return ((String) Debug.delegate(processBA, "up_sef", new Object[] {_id_req}));}
com.reza.sh.fastnet.PostRequestRaper _post = null;
RDebugUtils.currentLine=6881280;
 //BA.debugLineNum = 6881280;BA.debugLine="Sub up_sef(id_req As String)";
RDebugUtils.currentLine=6881282;
 //BA.debugLineNum = 6881282;BA.debugLine="prfn.initialize(\"prfn\")";
_prfn.initialize(processBA,"prfn");
RDebugUtils.currentLine=6881283;
 //BA.debugLineNum = 6881283;BA.debugLine="Dim post As PostRequest";
_post = new com.reza.sh.fastnet.PostRequestRaper();
RDebugUtils.currentLine=6881284;
 //BA.debugLineNum = 6881284;BA.debugLine="post=prfn.BuildPostQuery(\"http://filework.ir/INST";
_post = _prfn.BuildPostQuery("http://filework.ir/INSTAFOLLOW/api/req.php","upsef");
RDebugUtils.currentLine=6881286;
 //BA.debugLineNum = 6881286;BA.debugLine="post.addHeder(\"User-Agent\",\"Dalvik/1.6.0 (Linux;";
_post.addHeder("User-Agent","Dalvik/1.6.0 (Linux; U; Android 4.4.4; SM-A700FD Build/KTU84P)");
RDebugUtils.currentLine=6881287;
 //BA.debugLineNum = 6881287;BA.debugLine="post.addParametrs(\"req\",\"upsef\")";
_post.addParametrs("req","upsef");
RDebugUtils.currentLine=6881289;
 //BA.debugLineNum = 6881289;BA.debugLine="post.addParametrs(\"ids\",id_req)";
_post.addParametrs("ids",_id_req);
RDebugUtils.currentLine=6881291;
 //BA.debugLineNum = 6881291;BA.debugLine="post.executRequestAsString";
_post.executRequestAsString();
RDebugUtils.currentLine=6881293;
 //BA.debugLineNum = 6881293;BA.debugLine="End Sub";
return "";
}
public static String  _prfn_onpostjsonobjecterrorlistener(com.reza.sh.fastnet.Error _error,String _tag) throws Exception{
RDebugUtils.currentModule="firebasemessaging";
if (Debug.shouldDelegate(processBA, "prfn_onpostjsonobjecterrorlistener", false))
	 {return ((String) Debug.delegate(processBA, "prfn_onpostjsonobjecterrorlistener", new Object[] {_error,_tag}));}
RDebugUtils.currentLine=7274496;
 //BA.debugLineNum = 7274496;BA.debugLine="Sub prfn_onPostJSONObjectErrorListener(Error As Re";
RDebugUtils.currentLine=7274497;
 //BA.debugLineNum = 7274497;BA.debugLine="Log(Error.ErrorBody)";
anywheresoftware.b4a.keywords.Common.LogImpl("67274497",_error.getErrorBody(),0);
RDebugUtils.currentLine=7274498;
 //BA.debugLineNum = 7274498;BA.debugLine="Log(Error.CauseMessage)";
anywheresoftware.b4a.keywords.Common.LogImpl("67274498",_error.getCauseMessage(),0);
RDebugUtils.currentLine=7274499;
 //BA.debugLineNum = 7274499;BA.debugLine="Log(Error.ErrorBody)";
anywheresoftware.b4a.keywords.Common.LogImpl("67274499",_error.getErrorBody(),0);
RDebugUtils.currentLine=7274500;
 //BA.debugLineNum = 7274500;BA.debugLine="Log(Error.ErrorMsage)";
anywheresoftware.b4a.keywords.Common.LogImpl("67274500",_error.getErrorMsage(),0);
RDebugUtils.currentLine=7274501;
 //BA.debugLineNum = 7274501;BA.debugLine="Log(Error.ResponseBody)";
anywheresoftware.b4a.keywords.Common.LogImpl("67274501",_error.getResponseBody(),0);
RDebugUtils.currentLine=7274503;
 //BA.debugLineNum = 7274503;BA.debugLine="Select Tag";
switch (BA.switchObjectToInt(_tag,"getsef","up_sef","coments_sef")) {
case 0: {
 break; }
case 1: {
RDebugUtils.currentLine=7274508;
 //BA.debugLineNum = 7274508;BA.debugLine="LogColor(\"error \",Colors.Red)";
anywheresoftware.b4a.keywords.Common.LogImpl("67274508","error ",anywheresoftware.b4a.keywords.Common.Colors.Red);
 break; }
case 2: {
 break; }
}
;
RDebugUtils.currentLine=7274512;
 //BA.debugLineNum = 7274512;BA.debugLine="End Sub";
return "";
}
public static String  _prfn_onpostjsonobjectoklistener(String _jsonstring,String _tag) throws Exception{
RDebugUtils.currentModule="firebasemessaging";
if (Debug.shouldDelegate(processBA, "prfn_onpostjsonobjectoklistener", false))
	 {return ((String) Debug.delegate(processBA, "prfn_onpostjsonobjectoklistener", new Object[] {_jsonstring,_tag}));}
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
String _uiadmin = "";
String _type_s = "";
String _time_create = "";
String _finish = "";
String _id = "";
String _num_id = "";
String _time_done = "";
String _done = "";
String _userid = "";
String _username = "";
String _status = "";
String _token = "";
String _username_sef = "";
RDebugUtils.currentLine=7340032;
 //BA.debugLineNum = 7340032;BA.debugLine="Sub prfn_onPostJSONObjectOkListener(JsonString As";
RDebugUtils.currentLine=7340033;
 //BA.debugLineNum = 7340033;BA.debugLine="Select Tag";
switch (BA.switchObjectToInt(_tag,"getsef","up_sef","")) {
case 0: {
RDebugUtils.currentLine=7340036;
 //BA.debugLineNum = 7340036;BA.debugLine="Log(\"ok gets\")";
anywheresoftware.b4a.keywords.Common.LogImpl("67340036","ok gets",0);
RDebugUtils.currentLine=7340037;
 //BA.debugLineNum = 7340037;BA.debugLine="Log(JsonString)";
anywheresoftware.b4a.keywords.Common.LogImpl("67340037",_jsonstring,0);
RDebugUtils.currentLine=7340038;
 //BA.debugLineNum = 7340038;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=7340039;
 //BA.debugLineNum = 7340039;BA.debugLine="parser.Initialize(JsonString)";
_parser.Initialize(_jsonstring);
RDebugUtils.currentLine=7340040;
 //BA.debugLineNum = 7340040;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=7340041;
 //BA.debugLineNum = 7340041;BA.debugLine="Dim uiadmin As String = root.Get(\"uiadmin\")";
_uiadmin = BA.ObjectToString(_root.Get((Object)("uiadmin")));
RDebugUtils.currentLine=7340042;
 //BA.debugLineNum = 7340042;BA.debugLine="Dim type_s As String = root.Get(\"type_s\")";
_type_s = BA.ObjectToString(_root.Get((Object)("type_s")));
RDebugUtils.currentLine=7340043;
 //BA.debugLineNum = 7340043;BA.debugLine="Dim time_create As String = root.Get(\"time_crea";
_time_create = BA.ObjectToString(_root.Get((Object)("time_create")));
RDebugUtils.currentLine=7340044;
 //BA.debugLineNum = 7340044;BA.debugLine="Dim finish As String = root.Get(\"finish\")";
_finish = BA.ObjectToString(_root.Get((Object)("finish")));
RDebugUtils.currentLine=7340045;
 //BA.debugLineNum = 7340045;BA.debugLine="Dim id As String = root.Get(\"id\")";
_id = BA.ObjectToString(_root.Get((Object)("id")));
RDebugUtils.currentLine=7340046;
 //BA.debugLineNum = 7340046;BA.debugLine="Dim num_id As String = root.Get(\"num_id\")";
_num_id = BA.ObjectToString(_root.Get((Object)("num_id")));
RDebugUtils.currentLine=7340047;
 //BA.debugLineNum = 7340047;BA.debugLine="Dim time_done As String = root.Get(\"time_done\")";
_time_done = BA.ObjectToString(_root.Get((Object)("time_done")));
RDebugUtils.currentLine=7340048;
 //BA.debugLineNum = 7340048;BA.debugLine="Dim done As String = root.Get(\"done\")";
_done = BA.ObjectToString(_root.Get((Object)("done")));
RDebugUtils.currentLine=7340049;
 //BA.debugLineNum = 7340049;BA.debugLine="Dim userid As String = root.Get(\"userid\")";
_userid = BA.ObjectToString(_root.Get((Object)("userid")));
RDebugUtils.currentLine=7340050;
 //BA.debugLineNum = 7340050;BA.debugLine="Dim username As String = root.Get(\"username\")";
_username = BA.ObjectToString(_root.Get((Object)("username")));
RDebugUtils.currentLine=7340051;
 //BA.debugLineNum = 7340051;BA.debugLine="Dim status As String = root.Get(\"status\")";
_status = BA.ObjectToString(_root.Get((Object)("status")));
RDebugUtils.currentLine=7340052;
 //BA.debugLineNum = 7340052;BA.debugLine="Dim token As String = root.Get(\"token\")";
_token = BA.ObjectToString(_root.Get((Object)("token")));
RDebugUtils.currentLine=7340054;
 //BA.debugLineNum = 7340054;BA.debugLine="id_job=id";
_id_job = _id;
RDebugUtils.currentLine=7340055;
 //BA.debugLineNum = 7340055;BA.debugLine="userid_sef=userid";
_userid_sef = _userid;
RDebugUtils.currentLine=7340056;
 //BA.debugLineNum = 7340056;BA.debugLine="username_sef=username";
_username_sef = _username;
RDebugUtils.currentLine=7340057;
 //BA.debugLineNum = 7340057;BA.debugLine="medialid=num_id";
_medialid = _num_id;
RDebugUtils.currentLine=7340059;
 //BA.debugLineNum = 7340059;BA.debugLine="Select type_s";
switch (BA.switchObjectToInt(_type_s,"1","2","3")) {
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
RDebugUtils.currentLine=7340079;
 //BA.debugLineNum = 7340079;BA.debugLine="End Sub";
return "";
}
public static String  _prfn_onpoststringerrorlistener(com.reza.sh.fastnet.Error _error,String _tag) throws Exception{
RDebugUtils.currentModule="firebasemessaging";
if (Debug.shouldDelegate(processBA, "prfn_onpoststringerrorlistener", false))
	 {return ((String) Debug.delegate(processBA, "prfn_onpoststringerrorlistener", new Object[] {_error,_tag}));}
RDebugUtils.currentLine=7077888;
 //BA.debugLineNum = 7077888;BA.debugLine="Sub prfn_onPostStringErrorListener(Error As Respon";
RDebugUtils.currentLine=7077889;
 //BA.debugLineNum = 7077889;BA.debugLine="Log(Error.ErrorBody)";
anywheresoftware.b4a.keywords.Common.LogImpl("67077889",_error.getErrorBody(),0);
RDebugUtils.currentLine=7077890;
 //BA.debugLineNum = 7077890;BA.debugLine="End Sub";
return "";
}
public static String  _prfn_onpoststringoklistener(String _result,String _tag) throws Exception{
RDebugUtils.currentModule="firebasemessaging";
if (Debug.shouldDelegate(processBA, "prfn_onpoststringoklistener", false))
	 {return ((String) Debug.delegate(processBA, "prfn_onpoststringoklistener", new Object[] {_result,_tag}));}
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.List _root = null;
anywheresoftware.b4a.objects.collections.Map _colroot = null;
String _uid = "";
String _types = "";
String _start = "";
String _finish = "";
String _ida = "";
String _userid = "";
String _target = "";
String _status = "";
String _token = "";
String _comtext = "";
RDebugUtils.currentLine=7143424;
 //BA.debugLineNum = 7143424;BA.debugLine="Sub prfn_onPostStringOkListener(Result As String";
RDebugUtils.currentLine=7143426;
 //BA.debugLineNum = 7143426;BA.debugLine="Select Tag";
switch (BA.switchObjectToInt(_tag,"getsef","getseftele","upsef","upseftele")) {
case 0: {
RDebugUtils.currentLine=7143429;
 //BA.debugLineNum = 7143429;BA.debugLine="Log(Result)";
anywheresoftware.b4a.keywords.Common.LogImpl("67143429",_result,0);
RDebugUtils.currentLine=7143430;
 //BA.debugLineNum = 7143430;BA.debugLine="Log(\"ok gets\")";
anywheresoftware.b4a.keywords.Common.LogImpl("67143430","ok gets",0);
RDebugUtils.currentLine=7143431;
 //BA.debugLineNum = 7143431;BA.debugLine="If Result.Contains(\"error_code\")=True Then";
if (_result.contains("error_code")==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=7143432;
 //BA.debugLineNum = 7143432;BA.debugLine="Log(\"notfound\")";
anywheresoftware.b4a.keywords.Common.LogImpl("67143432","notfound",0);
 }else {
RDebugUtils.currentLine=7143434;
 //BA.debugLineNum = 7143434;BA.debugLine="Log(Result)";
anywheresoftware.b4a.keywords.Common.LogImpl("67143434",_result,0);
RDebugUtils.currentLine=7143435;
 //BA.debugLineNum = 7143435;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=7143436;
 //BA.debugLineNum = 7143436;BA.debugLine="parser.Initialize(Result)";
_parser.Initialize(_result);
RDebugUtils.currentLine=7143437;
 //BA.debugLineNum = 7143437;BA.debugLine="Dim root As List = parser.NextArray";
_root = new anywheresoftware.b4a.objects.collections.List();
_root = _parser.NextArray();
RDebugUtils.currentLine=7143438;
 //BA.debugLineNum = 7143438;BA.debugLine="For Each colroot As Map In root";
_colroot = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group12 = _root;
final int groupLen12 = group12.getSize()
;int index12 = 0;
;
for (; index12 < groupLen12;index12++){
_colroot.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group12.Get(index12)));
RDebugUtils.currentLine=7143439;
 //BA.debugLineNum = 7143439;BA.debugLine="Dim uid As String = colroot.Get(\"uid\")";
_uid = BA.ObjectToString(_colroot.Get((Object)("uid")));
RDebugUtils.currentLine=7143440;
 //BA.debugLineNum = 7143440;BA.debugLine="Dim types As String = colroot.Get(\"types\")";
_types = BA.ObjectToString(_colroot.Get((Object)("types")));
RDebugUtils.currentLine=7143441;
 //BA.debugLineNum = 7143441;BA.debugLine="Dim start As String = colroot.Get(\"start\")";
_start = BA.ObjectToString(_colroot.Get((Object)("start")));
RDebugUtils.currentLine=7143442;
 //BA.debugLineNum = 7143442;BA.debugLine="Dim finish As String = colroot.Get(\"finish\")";
_finish = BA.ObjectToString(_colroot.Get((Object)("finish")));
RDebugUtils.currentLine=7143443;
 //BA.debugLineNum = 7143443;BA.debugLine="Dim ida As String = colroot.Get(\"id\")";
_ida = BA.ObjectToString(_colroot.Get((Object)("id")));
RDebugUtils.currentLine=7143444;
 //BA.debugLineNum = 7143444;BA.debugLine="Dim userid As String = colroot.Get(\"userid\")";
_userid = BA.ObjectToString(_colroot.Get((Object)("userid")));
RDebugUtils.currentLine=7143445;
 //BA.debugLineNum = 7143445;BA.debugLine="Dim target As String = colroot.Get(\"target\")";
_target = BA.ObjectToString(_colroot.Get((Object)("target")));
RDebugUtils.currentLine=7143446;
 //BA.debugLineNum = 7143446;BA.debugLine="Dim status As String = colroot.Get(\"status\")";
_status = BA.ObjectToString(_colroot.Get((Object)("status")));
RDebugUtils.currentLine=7143447;
 //BA.debugLineNum = 7143447;BA.debugLine="Dim token As String = colroot.Get(\"token\")";
_token = BA.ObjectToString(_colroot.Get((Object)("token")));
RDebugUtils.currentLine=7143448;
 //BA.debugLineNum = 7143448;BA.debugLine="If types=\"2\" Then";
if ((_types).equals("2")) { 
RDebugUtils.currentLine=7143449;
 //BA.debugLineNum = 7143449;BA.debugLine="Dim comtext As String = colroot.Get(\"comtext";
_comtext = BA.ObjectToString(_colroot.Get((Object)("comtext")));
RDebugUtils.currentLine=7143451;
 //BA.debugLineNum = 7143451;BA.debugLine="comtex=comtext";
_comtex = _comtext;
 };
RDebugUtils.currentLine=7143455;
 //BA.debugLineNum = 7143455;BA.debugLine="If types=\"7\" Then";
if ((_types).equals("7")) { 
RDebugUtils.currentLine=7143456;
 //BA.debugLineNum = 7143456;BA.debugLine="Dim comtext As String = colroot.Get(\"comtext";
_comtext = BA.ObjectToString(_colroot.Get((Object)("comtext")));
RDebugUtils.currentLine=7143458;
 //BA.debugLineNum = 7143458;BA.debugLine="comtex=comtext";
_comtex = _comtext;
 };
 }
};
RDebugUtils.currentLine=7143464;
 //BA.debugLineNum = 7143464;BA.debugLine="id_job=ida";
_id_job = _ida;
RDebugUtils.currentLine=7143465;
 //BA.debugLineNum = 7143465;BA.debugLine="userid_sef=userid";
_userid_sef = _userid;
RDebugUtils.currentLine=7143467;
 //BA.debugLineNum = 7143467;BA.debugLine="medialid=target";
_medialid = _target;
RDebugUtils.currentLine=7143468;
 //BA.debugLineNum = 7143468;BA.debugLine="Select types";
switch (BA.switchObjectToInt(_types,"1","2","3","4","6","7","8")) {
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
RDebugUtils.currentLine=7143498;
 //BA.debugLineNum = 7143498;BA.debugLine="Log(Result)";
anywheresoftware.b4a.keywords.Common.LogImpl("67143498",_result,0);
RDebugUtils.currentLine=7143499;
 //BA.debugLineNum = 7143499;BA.debugLine="Log(\"ok gets\")";
anywheresoftware.b4a.keywords.Common.LogImpl("67143499","ok gets",0);
RDebugUtils.currentLine=7143500;
 //BA.debugLineNum = 7143500;BA.debugLine="If Result.Contains(\"error_code\")=True Then";
if (_result.contains("error_code")==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=7143501;
 //BA.debugLineNum = 7143501;BA.debugLine="Log(\"notfound\")";
anywheresoftware.b4a.keywords.Common.LogImpl("67143501","notfound",0);
 }else {
RDebugUtils.currentLine=7143503;
 //BA.debugLineNum = 7143503;BA.debugLine="Log(Result)";
anywheresoftware.b4a.keywords.Common.LogImpl("67143503",_result,0);
RDebugUtils.currentLine=7143504;
 //BA.debugLineNum = 7143504;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=7143505;
 //BA.debugLineNum = 7143505;BA.debugLine="parser.Initialize(Result)";
_parser.Initialize(_result);
RDebugUtils.currentLine=7143506;
 //BA.debugLineNum = 7143506;BA.debugLine="Dim root As List = parser.NextArray";
_root = new anywheresoftware.b4a.objects.collections.List();
_root = _parser.NextArray();
RDebugUtils.currentLine=7143507;
 //BA.debugLineNum = 7143507;BA.debugLine="For Each colroot As Map In root";
_colroot = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group54 = _root;
final int groupLen54 = group54.getSize()
;int index54 = 0;
;
for (; index54 < groupLen54;index54++){
_colroot.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group54.Get(index54)));
RDebugUtils.currentLine=7143509;
 //BA.debugLineNum = 7143509;BA.debugLine="Dim types As String = colroot.Get(\"types\")";
_types = BA.ObjectToString(_colroot.Get((Object)("types")));
RDebugUtils.currentLine=7143510;
 //BA.debugLineNum = 7143510;BA.debugLine="Dim start As String = colroot.Get(\"start\")";
_start = BA.ObjectToString(_colroot.Get((Object)("start")));
RDebugUtils.currentLine=7143511;
 //BA.debugLineNum = 7143511;BA.debugLine="Dim finish As String = colroot.Get(\"finish\")";
_finish = BA.ObjectToString(_colroot.Get((Object)("finish")));
RDebugUtils.currentLine=7143512;
 //BA.debugLineNum = 7143512;BA.debugLine="Dim ida As String = colroot.Get(\"id\")";
_ida = BA.ObjectToString(_colroot.Get((Object)("id")));
RDebugUtils.currentLine=7143513;
 //BA.debugLineNum = 7143513;BA.debugLine="Dim userid As String = colroot.Get(\"userid\")";
_userid = BA.ObjectToString(_colroot.Get((Object)("userid")));
RDebugUtils.currentLine=7143514;
 //BA.debugLineNum = 7143514;BA.debugLine="Dim target As String = colroot.Get(\"target\")";
_target = BA.ObjectToString(_colroot.Get((Object)("target")));
RDebugUtils.currentLine=7143515;
 //BA.debugLineNum = 7143515;BA.debugLine="Dim status As String = colroot.Get(\"status\")";
_status = BA.ObjectToString(_colroot.Get((Object)("status")));
RDebugUtils.currentLine=7143516;
 //BA.debugLineNum = 7143516;BA.debugLine="Dim token As String = colroot.Get(\"token\")";
_token = BA.ObjectToString(_colroot.Get((Object)("token")));
 }
};
RDebugUtils.currentLine=7143521;
 //BA.debugLineNum = 7143521;BA.debugLine="id_job=ida";
_id_job = _ida;
RDebugUtils.currentLine=7143522;
 //BA.debugLineNum = 7143522;BA.debugLine="userid_sef=userid";
_userid_sef = _userid;
RDebugUtils.currentLine=7143524;
 //BA.debugLineNum = 7143524;BA.debugLine="medialid=target";
_medialid = _target;
RDebugUtils.currentLine=7143525;
 //BA.debugLineNum = 7143525;BA.debugLine="Select types";
switch (BA.switchObjectToInt(_types,"1","2")) {
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
RDebugUtils.currentLine=7143548;
 //BA.debugLineNum = 7143548;BA.debugLine="End Sub";
return "";
}
public static String  _req_getme(String _reelid,String _reelowner,String _reeltakenat,String _icookies) throws Exception{
RDebugUtils.currentModule="firebasemessaging";
if (Debug.shouldDelegate(processBA, "req_getme", false))
	 {return ((String) Debug.delegate(processBA, "req_getme", new Object[] {_reelid,_reelowner,_reeltakenat,_icookies}));}
com.reza.sh.fastnet.PostRequestRaper _post = null;
RDebugUtils.currentLine=8126464;
 //BA.debugLineNum = 8126464;BA.debugLine="Sub req_getme(reelid As String,reelowner As String";
RDebugUtils.currentLine=8126465;
 //BA.debugLineNum = 8126465;BA.debugLine="Dim prfn As PersianFastNetwork";
_prfn = new com.reza.sh.fastnet.Fastnet();
RDebugUtils.currentLine=8126466;
 //BA.debugLineNum = 8126466;BA.debugLine="prfn.initialize(\"prfn\").WithSSL.Build";
_prfn.initialize(processBA,"prfn").WithSSL().Build();
RDebugUtils.currentLine=8126468;
 //BA.debugLineNum = 8126468;BA.debugLine="Dim post As PostRequest";
_post = new com.reza.sh.fastnet.PostRequestRaper();
RDebugUtils.currentLine=8126469;
 //BA.debugLineNum = 8126469;BA.debugLine="post=prfn.WithCookieManager.BuildPostQuery(\"https";
_post = _prfn.WithCookieManager().BuildPostQuery("https://www.instagram.com/stories/reel/seen","sefss");
RDebugUtils.currentLine=8126478;
 //BA.debugLineNum = 8126478;BA.debugLine="post.addParametrs(\"reelMediaId\",reelid)";
_post.addParametrs("reelMediaId",_reelid);
RDebugUtils.currentLine=8126479;
 //BA.debugLineNum = 8126479;BA.debugLine="post.addParametrs(\"reelMediaOwnerId\",reelowner)";
_post.addParametrs("reelMediaOwnerId",_reelowner);
RDebugUtils.currentLine=8126480;
 //BA.debugLineNum = 8126480;BA.debugLine="post.addParametrs(\"reelId\",reelowner)";
_post.addParametrs("reelId",_reelowner);
RDebugUtils.currentLine=8126481;
 //BA.debugLineNum = 8126481;BA.debugLine="post.addParametrs(\"reelMediaTakenAt\",reeltakenat)";
_post.addParametrs("reelMediaTakenAt",_reeltakenat);
RDebugUtils.currentLine=8126482;
 //BA.debugLineNum = 8126482;BA.debugLine="post.addParametrs(\"viewSeenAt\",reeltakenat)";
_post.addParametrs("viewSeenAt",_reeltakenat);
RDebugUtils.currentLine=8126494;
 //BA.debugLineNum = 8126494;BA.debugLine="post.addHeder(\"accept\",\" */*\")";
_post.addHeder("accept"," */*");
RDebugUtils.currentLine=8126495;
 //BA.debugLineNum = 8126495;BA.debugLine="post.addHeder(\"accept-encoding\",\"UTF8\")";
_post.addHeder("accept-encoding","UTF8");
RDebugUtils.currentLine=8126496;
 //BA.debugLineNum = 8126496;BA.debugLine="post.addHeder(\"accept-language\",\" en,fa;q=0.9,en-";
_post.addHeder("accept-language"," en,fa;q=0.9,en-US;q=0.8");
RDebugUtils.currentLine=8126497;
 //BA.debugLineNum = 8126497;BA.debugLine="post.addHeder(\"content-length\",\" 127\")";
_post.addHeder("content-length"," 127");
RDebugUtils.currentLine=8126498;
 //BA.debugLineNum = 8126498;BA.debugLine="post.addHeder(\"content-Type\",\" Application/x-www-";
_post.addHeder("content-Type"," Application/x-www-form-urlencoded");
RDebugUtils.currentLine=8126501;
 //BA.debugLineNum = 8126501;BA.debugLine="post.addHeder(\"cookie\",icookies)";
_post.addHeder("cookie",_icookies);
RDebugUtils.currentLine=8126503;
 //BA.debugLineNum = 8126503;BA.debugLine="post.addHeder(\"referer\",\" https://www.instagram.c";
_post.addHeder("referer"," https://www.instagram.com/stories/amirhossin_pk/");
RDebugUtils.currentLine=8126504;
 //BA.debugLineNum = 8126504;BA.debugLine="post.addHeder(\"user-agent\",\" Mozilla/5.0 (Windows";
_post.addHeder("user-agent"," Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/68.0.3440.106 Safari/537.36");
RDebugUtils.currentLine=8126505;
 //BA.debugLineNum = 8126505;BA.debugLine="post.addHeder(\"x-csrftoken\",\" AqzDnmSiSrCYQ3vZO02";
_post.addHeder("x-csrftoken"," AqzDnmSiSrCYQ3vZO02WaeOsaJyXoXwS");
RDebugUtils.currentLine=8126506;
 //BA.debugLineNum = 8126506;BA.debugLine="post.addHeder(\"x-instagram-ajax\",\" 0f6941ba75b0\")";
_post.addHeder("x-instagram-ajax"," 0f6941ba75b0");
RDebugUtils.currentLine=8126507;
 //BA.debugLineNum = 8126507;BA.debugLine="post.addHeder(\"x-requested-with\",\" XMLHttpRequest";
_post.addHeder("x-requested-with"," XMLHttpRequest");
RDebugUtils.currentLine=8126509;
 //BA.debugLineNum = 8126509;BA.debugLine="post.executRequestAsString";
_post.executRequestAsString();
RDebugUtils.currentLine=8126512;
 //BA.debugLineNum = 8126512;BA.debugLine="End Sub";
return "";
}
public static String  _service_create() throws Exception{
RDebugUtils.currentModule="firebasemessaging";
if (Debug.shouldDelegate(processBA, "service_create", false))
	 {return ((String) Debug.delegate(processBA, "service_create", null));}
int _i = 0;
RDebugUtils.currentLine=6356992;
 //BA.debugLineNum = 6356992;BA.debugLine="Sub Service_Create";
RDebugUtils.currentLine=6356993;
 //BA.debugLineNum = 6356993;BA.debugLine="fm.Initialize(\"fm\")";
_fm.Initialize(processBA,"fm");
RDebugUtils.currentLine=6356994;
 //BA.debugLineNum = 6356994;BA.debugLine="lusername.Initialize";
_lusername.Initialize();
RDebugUtils.currentLine=6356996;
 //BA.debugLineNum = 6356996;BA.debugLine="If File.Exists(File.DirInternal,\"instadb.db\")=Fal";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"instadb.db")==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=6356997;
 //BA.debugLineNum = 6356997;BA.debugLine="File.Copy(File.DirAssets,\"instadb.db\",File.DirIn";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"instadb.db",anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"instadb.db");
 };
RDebugUtils.currentLine=6356999;
 //BA.debugLineNum = 6356999;BA.debugLine="If sql1.IsInitialized=False Then";
if (_sql1.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=6357000;
 //BA.debugLineNum = 6357000;BA.debugLine="sql1.Initialize(File.DirInternal,\"instadb.db\",Fa";
_sql1.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"instadb.db",anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=6357005;
 //BA.debugLineNum = 6357005;BA.debugLine="cursor1 = sql1.ExecQuery(\"SELECT * FROM tbl_acc\")";
_cursor1.setObject((android.database.Cursor)(_sql1.ExecQuery("SELECT * FROM tbl_acc")));
RDebugUtils.currentLine=6357006;
 //BA.debugLineNum = 6357006;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=6357007;
 //BA.debugLineNum = 6357007;BA.debugLine="For i=0 To cursor1.RowCount-1";
{
final int step11 = 1;
final int limit11 = (int) (_cursor1.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit11 ;_i = _i + step11 ) {
RDebugUtils.currentLine=6357008;
 //BA.debugLineNum = 6357008;BA.debugLine="cursor1.Position=i";
_cursor1.setPosition(_i);
RDebugUtils.currentLine=6357009;
 //BA.debugLineNum = 6357009;BA.debugLine="lusername.Add(cursor1.GetString(\"username\"))";
_lusername.Add((Object)(_cursor1.GetString("username")));
 }
};
RDebugUtils.currentLine=6357012;
 //BA.debugLineNum = 6357012;BA.debugLine="cursor1.Close";
_cursor1.Close();
RDebugUtils.currentLine=6357014;
 //BA.debugLineNum = 6357014;BA.debugLine="cursor1 = sql1.ExecQuery(\"SELECT * FROM tbl_tele";
_cursor1.setObject((android.database.Cursor)(_sql1.ExecQuery("SELECT * FROM tbl_tele WHERE soich='1'")));
RDebugUtils.currentLine=6357015;
 //BA.debugLineNum = 6357015;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=6357016;
 //BA.debugLineNum = 6357016;BA.debugLine="For i=0 To cursor1.RowCount-1";
{
final int step18 = 1;
final int limit18 = (int) (_cursor1.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit18 ;_i = _i + step18 ) {
RDebugUtils.currentLine=6357017;
 //BA.debugLineNum = 6357017;BA.debugLine="cursor1.Position=i";
_cursor1.setPosition(_i);
RDebugUtils.currentLine=6357018;
 //BA.debugLineNum = 6357018;BA.debugLine="userid_t=cursor1.GetString(\"userid\")";
_userid_t = _cursor1.GetString("userid");
RDebugUtils.currentLine=6357019;
 //BA.debugLineNum = 6357019;BA.debugLine="username_t=cursor1.GetString(\"username\")";
_username_t = _cursor1.GetString("username");
 }
};
RDebugUtils.currentLine=6357021;
 //BA.debugLineNum = 6357021;BA.debugLine="cursor1.Close";
_cursor1.Close();
RDebugUtils.currentLine=6357023;
 //BA.debugLineNum = 6357023;BA.debugLine="telegs.Initialize(\"telegs\")";
_telegs.Initialize(processBA,"telegs");
RDebugUtils.currentLine=6357024;
 //BA.debugLineNum = 6357024;BA.debugLine="End Sub";
return "";
}
public static String  _service_destroy() throws Exception{
RDebugUtils.currentModule="firebasemessaging";
if (Debug.shouldDelegate(processBA, "service_destroy", false))
	 {return ((String) Debug.delegate(processBA, "service_destroy", null));}
RDebugUtils.currentLine=6619136;
 //BA.debugLineNum = 6619136;BA.debugLine="Sub Service_Destroy";
RDebugUtils.currentLine=6619139;
 //BA.debugLineNum = 6619139;BA.debugLine="End Sub";
return "";
}
public static String  _service_start(anywheresoftware.b4a.objects.IntentWrapper _startingintent) throws Exception{
RDebugUtils.currentModule="firebasemessaging";
if (Debug.shouldDelegate(processBA, "service_start", false))
	 {return ((String) Debug.delegate(processBA, "service_start", new Object[] {_startingintent}));}
RDebugUtils.currentLine=6488064;
 //BA.debugLineNum = 6488064;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
RDebugUtils.currentLine=6488065;
 //BA.debugLineNum = 6488065;BA.debugLine="If StartingIntent.IsInitialized And fm.HandleInte";
if (_startingintent.IsInitialized() && _fm.HandleIntent((android.content.Intent)(_startingintent.getObject()))) { 
if (true) return "";};
RDebugUtils.currentLine=6488066;
 //BA.debugLineNum = 6488066;BA.debugLine="End Sub";
return "";
}
public static String  _subscribetotopics() throws Exception{
RDebugUtils.currentModule="firebasemessaging";
if (Debug.shouldDelegate(processBA, "subscribetotopics", false))
	 {return ((String) Debug.delegate(processBA, "subscribetotopics", null));}
RDebugUtils.currentLine=6422528;
 //BA.debugLineNum = 6422528;BA.debugLine="Public Sub SubscribeToTopics";
RDebugUtils.currentLine=6422529;
 //BA.debugLineNum = 6422529;BA.debugLine="fm.SubscribeToTopic(\"allusers\") 'you can subscrib";
_fm.SubscribeToTopic("allusers");
RDebugUtils.currentLine=6422530;
 //BA.debugLineNum = 6422530;BA.debugLine="Log(fm.Token)";
anywheresoftware.b4a.keywords.Common.LogImpl("66422530",_fm.getToken(),0);
RDebugUtils.currentLine=6422531;
 //BA.debugLineNum = 6422531;BA.debugLine="End Sub";
return "";
}
public static String  _up_seftele(String _id_req) throws Exception{
RDebugUtils.currentModule="firebasemessaging";
if (Debug.shouldDelegate(processBA, "up_seftele", false))
	 {return ((String) Debug.delegate(processBA, "up_seftele", new Object[] {_id_req}));}
com.reza.sh.fastnet.PostRequestRaper _post = null;
RDebugUtils.currentLine=7012352;
 //BA.debugLineNum = 7012352;BA.debugLine="Sub up_seftele(id_req As String)";
RDebugUtils.currentLine=7012354;
 //BA.debugLineNum = 7012354;BA.debugLine="prfn.initialize(\"prfn\")";
_prfn.initialize(processBA,"prfn");
RDebugUtils.currentLine=7012355;
 //BA.debugLineNum = 7012355;BA.debugLine="Dim post As PostRequest";
_post = new com.reza.sh.fastnet.PostRequestRaper();
RDebugUtils.currentLine=7012356;
 //BA.debugLineNum = 7012356;BA.debugLine="post=prfn.BuildPostQuery(\"http://filework.ir/INST";
_post = _prfn.BuildPostQuery("http://filework.ir/INSTAFOLLOW/api/req.php","upseftele");
RDebugUtils.currentLine=7012358;
 //BA.debugLineNum = 7012358;BA.debugLine="post.addHeder(\"User-Agent\",\"Dalvik/1.6.0 (Linux;";
_post.addHeder("User-Agent","Dalvik/1.6.0 (Linux; U; Android 4.4.4; SM-A700FD Build/KTU84P)");
RDebugUtils.currentLine=7012359;
 //BA.debugLineNum = 7012359;BA.debugLine="post.addParametrs(\"req\",\"upseftele\")";
_post.addParametrs("req","upseftele");
RDebugUtils.currentLine=7012361;
 //BA.debugLineNum = 7012361;BA.debugLine="post.addParametrs(\"ids\",id_req)";
_post.addParametrs("ids",_id_req);
RDebugUtils.currentLine=7012363;
 //BA.debugLineNum = 7012363;BA.debugLine="post.executRequestAsString";
_post.executRequestAsString();
RDebugUtils.currentLine=7012365;
 //BA.debugLineNum = 7012365;BA.debugLine="End Sub";
return "";
}

public void startopen(String name){
	//pejman nikravan
	Intent intent = new Intent(Intent.ACTION_VIEW);
	MimeTypeMap mime = MimeTypeMap.getSingleton();
	String ext = name.substring(name.lastIndexOf(".") + 1);
	String type = mime.getMimeTypeFromExtension(ext);
	intent.setDataAndType(Uri.fromFile(new File(name)), type);
	startActivity(intent);
}
}