package com.it.fome;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class nb6 extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "com.it.fome.nb6");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", com.it.fome.nb6.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.object.JavaObject _channel = null;
public anywheresoftware.b4j.object.JavaObject _notificationbuilder = null;
public int _sdklevel = 0;
public anywheresoftware.b4j.object.JavaObject _ctxt = null;
public int _s_old = 0;
public int _s_builder = 0;
public int _s_channel = 0;
public int _supportlevel = 0;
public anywheresoftware.b4a.objects.NotificationWrapper _oldnotification = null;
public anywheresoftware.b4j.object.JavaObject _pendingintentstatic = null;
public anywheresoftware.b4j.object.JavaObject _notificationstatic = null;
public anywheresoftware.b4j.object.JavaObject _common = null;
public b4a.example.dateutils _dateutils = null;
public com.it.fome.main _main = null;
public com.it.fome.ac_telelogin _ac_telelogin = null;
public com.it.fome.ac_shop _ac_shop = null;
public com.it.fome.ac_tansfer _ac_tansfer = null;
public com.it.fome.firebasemessaging _firebasemessaging = null;
public com.it.fome.ac_tselect _ac_tselect = null;
public com.it.fome.ac_lchats _ac_lchats = null;
public com.it.fome.ac_tfreecoin _ac_tfreecoin = null;
public com.it.fome.ac_hsef _ac_hsef = null;
public com.it.fome.ac_tsearch _ac_tsearch = null;
public com.it.fome.ac_tcoin _ac_tcoin = null;
public com.it.fome.ac_home _ac_home = null;
public com.it.fome.act_chat _act_chat = null;
public com.it.fome.starter _starter = null;
public com.it.fome.nb6  _initialize(com.it.fome.nb6 __ref,anywheresoftware.b4a.BA _ba,String _channelid,Object _channelname,String _importancelevel) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="nb6";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((com.it.fome.nb6) Debug.delegate(ba, "initialize", new Object[] {_ba,_channelid,_channelname,_importancelevel}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
anywheresoftware.b4a.objects.collections.Map _im = null;
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _pm = null;
int _p = 0;
RDebugUtils.currentLine=22675456;
 //BA.debugLineNum = 22675456;BA.debugLine="Public Sub Initialize (ChannelId As String, Channe";
RDebugUtils.currentLine=22675457;
 //BA.debugLineNum = 22675457;BA.debugLine="ctxt.InitializeContext";
__ref._ctxt /*anywheresoftware.b4j.object.JavaObject*/ .InitializeContext(ba);
RDebugUtils.currentLine=22675458;
 //BA.debugLineNum = 22675458;BA.debugLine="PendingIntentStatic.InitializeStatic(\"android.app";
__ref._pendingintentstatic /*anywheresoftware.b4j.object.JavaObject*/ .InitializeStatic("android.app.PendingIntent");
RDebugUtils.currentLine=22675459;
 //BA.debugLineNum = 22675459;BA.debugLine="NotificationStatic.InitializeStatic(\"android.app.";
__ref._notificationstatic /*anywheresoftware.b4j.object.JavaObject*/ .InitializeStatic("android.app.Notification");
RDebugUtils.currentLine=22675460;
 //BA.debugLineNum = 22675460;BA.debugLine="common.InitializeStatic(\"anywheresoftware.b4a.key";
__ref._common /*anywheresoftware.b4j.object.JavaObject*/ .InitializeStatic("anywheresoftware.b4a.keywords.Common");
RDebugUtils.currentLine=22675461;
 //BA.debugLineNum = 22675461;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=22675462;
 //BA.debugLineNum = 22675462;BA.debugLine="SdkLevel = jo.InitializeStatic(\"android.os.Build$";
__ref._sdklevel /*int*/  = (int)(BA.ObjectToNumber(_jo.InitializeStatic("android.os.Build$VERSION").GetField("SDK_INT")));
RDebugUtils.currentLine=22675463;
 //BA.debugLineNum = 22675463;BA.debugLine="If SdkLevel < 23 Then";
if (__ref._sdklevel /*int*/ <23) { 
RDebugUtils.currentLine=22675464;
 //BA.debugLineNum = 22675464;BA.debugLine="SupportLevel = S_OLD";
__ref._supportlevel /*int*/  = __ref._s_old /*int*/ ;
 }else 
{RDebugUtils.currentLine=22675465;
 //BA.debugLineNum = 22675465;BA.debugLine="Else if SdkLevel >= 26 Then";
if (__ref._sdklevel /*int*/ >=26) { 
RDebugUtils.currentLine=22675466;
 //BA.debugLineNum = 22675466;BA.debugLine="SupportLevel = S_CHANNEL";
__ref._supportlevel /*int*/  = __ref._s_channel /*int*/ ;
 }else {
RDebugUtils.currentLine=22675468;
 //BA.debugLineNum = 22675468;BA.debugLine="SupportLevel = S_BUILDER";
__ref._supportlevel /*int*/  = __ref._s_builder /*int*/ ;
 }}
;
RDebugUtils.currentLine=22675470;
 //BA.debugLineNum = 22675470;BA.debugLine="If IsOld Then";
if (__ref._isold /*boolean*/ (null)) { 
RDebugUtils.currentLine=22675471;
 //BA.debugLineNum = 22675471;BA.debugLine="OldNotification.Initialize";
__ref._oldnotification /*anywheresoftware.b4a.objects.NotificationWrapper*/ .Initialize();
RDebugUtils.currentLine=22675472;
 //BA.debugLineNum = 22675472;BA.debugLine="OldNotification.Icon = \"icon\"";
__ref._oldnotification /*anywheresoftware.b4a.objects.NotificationWrapper*/ .setIcon("icon");
 }else 
{RDebugUtils.currentLine=22675473;
 //BA.debugLineNum = 22675473;BA.debugLine="Else if IsChannel Then";
if (__ref._ischannel /*boolean*/ (null)) { 
RDebugUtils.currentLine=22675474;
 //BA.debugLineNum = 22675474;BA.debugLine="ChannelId = ChannelId & \"_\" & ImportanceLevel";
_channelid = _channelid+"_"+_importancelevel;
RDebugUtils.currentLine=22675475;
 //BA.debugLineNum = 22675475;BA.debugLine="NotificationBuilder.InitializeNewInstance(\"andro";
__ref._notificationbuilder /*anywheresoftware.b4j.object.JavaObject*/ .InitializeNewInstance("android.app.Notification$Builder",new Object[]{(Object)(__ref._ctxt /*anywheresoftware.b4j.object.JavaObject*/ .getObject()),(Object)(_channelid)});
RDebugUtils.currentLine=22675476;
 //BA.debugLineNum = 22675476;BA.debugLine="Dim im As Map = CreateMap(\"MIN\": 1, \"LOW\": 2, \"D";
_im = new anywheresoftware.b4a.objects.collections.Map();
_im = __c.createMap(new Object[] {(Object)("MIN"),(Object)(1),(Object)("LOW"),(Object)(2),(Object)("DEFAULT"),(Object)(3),(Object)("HIGH"),(Object)(4)});
RDebugUtils.currentLine=22675477;
 //BA.debugLineNum = 22675477;BA.debugLine="Dim i As Int = im.Get(ImportanceLevel)";
_i = (int)(BA.ObjectToNumber(_im.Get((Object)(_importancelevel))));
RDebugUtils.currentLine=22675478;
 //BA.debugLineNum = 22675478;BA.debugLine="Channel.InitializeNewInstance(\"android.app.Notif";
__ref._channel /*anywheresoftware.b4j.object.JavaObject*/ .InitializeNewInstance("android.app.NotificationChannel",new Object[]{(Object)(_channelid),(Object)(__c.Application.getLabelName()),(Object)(_i)});
 }else {
RDebugUtils.currentLine=22675480;
 //BA.debugLineNum = 22675480;BA.debugLine="NotificationBuilder.InitializeNewInstance(\"andro";
__ref._notificationbuilder /*anywheresoftware.b4j.object.JavaObject*/ .InitializeNewInstance("android.app.Notification$Builder",new Object[]{(Object)(__ref._ctxt /*anywheresoftware.b4j.object.JavaObject*/ .getObject())});
RDebugUtils.currentLine=22675481;
 //BA.debugLineNum = 22675481;BA.debugLine="Dim pm As Map = CreateMap(\"MIN\": -2, \"LOW\": -1,";
_pm = new anywheresoftware.b4a.objects.collections.Map();
_pm = __c.createMap(new Object[] {(Object)("MIN"),(Object)(-2),(Object)("LOW"),(Object)(-1),(Object)("DEFAULT"),(Object)(0),(Object)("HIGH"),(Object)(1)});
RDebugUtils.currentLine=22675482;
 //BA.debugLineNum = 22675482;BA.debugLine="Dim p As Int = pm.Get(ImportanceLevel)";
_p = (int)(BA.ObjectToNumber(_pm.Get((Object)(_importancelevel))));
RDebugUtils.currentLine=22675483;
 //BA.debugLineNum = 22675483;BA.debugLine="NotificationBuilder.RunMethod(\"setPriority\", Arr";
__ref._notificationbuilder /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setPriority",new Object[]{(Object)(_p)});
 }}
;
RDebugUtils.currentLine=22675485;
 //BA.debugLineNum = 22675485;BA.debugLine="If ImportanceLevel = \"DEFAULT\" Or ImportanceLevel";
if ((_importancelevel).equals("DEFAULT") || (_importancelevel).equals("HIGH")) { 
RDebugUtils.currentLine=22675486;
 //BA.debugLineNum = 22675486;BA.debugLine="SetDefaults(True, True, True)";
__ref._setdefaults /*com.it.fome.nb6*/ (null,__c.True,__c.True,__c.True);
 }else {
RDebugUtils.currentLine=22675488;
 //BA.debugLineNum = 22675488;BA.debugLine="SetDefaults(False, True, True)";
__ref._setdefaults /*com.it.fome.nb6*/ (null,__c.False,__c.True,__c.True);
 };
RDebugUtils.currentLine=22675490;
 //BA.debugLineNum = 22675490;BA.debugLine="Return Me";
if (true) return (com.it.fome.nb6)(this);
RDebugUtils.currentLine=22675491;
 //BA.debugLineNum = 22675491;BA.debugLine="End Sub";
return null;
}
public com.it.fome.nb6  _smallicon(com.it.fome.nb6 __ref,anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _icon) throws Exception{
__ref = this;
RDebugUtils.currentModule="nb6";
if (Debug.shouldDelegate(ba, "smallicon", false))
	 {return ((com.it.fome.nb6) Debug.delegate(ba, "smallicon", new Object[] {_icon}));}
RDebugUtils.currentLine=22937600;
 //BA.debugLineNum = 22937600;BA.debugLine="Public Sub SmallIcon (Icon As Bitmap) As NB6";
RDebugUtils.currentLine=22937601;
 //BA.debugLineNum = 22937601;BA.debugLine="If IsBuilder Then";
if (__ref._isbuilder /*boolean*/ (null)) { 
RDebugUtils.currentLine=22937602;
 //BA.debugLineNum = 22937602;BA.debugLine="NotificationBuilder.RunMethod(\"setSmallIcon\", Ar";
__ref._notificationbuilder /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setSmallIcon",new Object[]{__ref._createiconfrombitmap /*Object*/ (null,_icon)});
 };
RDebugUtils.currentLine=22937604;
 //BA.debugLineNum = 22937604;BA.debugLine="Return Me";
if (true) return (com.it.fome.nb6)(this);
RDebugUtils.currentLine=22937605;
 //BA.debugLineNum = 22937605;BA.debugLine="End Sub";
return null;
}
public com.it.fome.nb6  _bigpicturestyle(com.it.fome.nb6 __ref,anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _largeiconbmp,anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _picture,Object _contenttitle,Object _summarytext) throws Exception{
__ref = this;
RDebugUtils.currentModule="nb6";
if (Debug.shouldDelegate(ba, "bigpicturestyle", false))
	 {return ((com.it.fome.nb6) Debug.delegate(ba, "bigpicturestyle", new Object[] {_largeiconbmp,_picture,_contenttitle,_summarytext}));}
RDebugUtils.currentLine=23789568;
 //BA.debugLineNum = 23789568;BA.debugLine="Public Sub BigPictureStyle(LargeIconBmp As Bitmap,";
RDebugUtils.currentLine=23789569;
 //BA.debugLineNum = 23789569;BA.debugLine="If IsBuilder Then";
if (__ref._isbuilder /*boolean*/ (null)) { 
RDebugUtils.currentLine=23789570;
 //BA.debugLineNum = 23789570;BA.debugLine="SetStyle(\"android.app.Notification$BigPictureSty";
__ref._setstyle /*String*/ (null,"android.app.Notification$BigPictureStyle",__c.createMap(new Object[] {(Object)("bigLargeIcon"),(Object)(_largeiconbmp.getObject()),(Object)("bigPicture"),(Object)(_picture.getObject()),(Object)("setBigContentTitle"),_contenttitle,(Object)("setSummaryText"),_summarytext}));
 };
RDebugUtils.currentLine=23789576;
 //BA.debugLineNum = 23789576;BA.debugLine="Return Me";
if (true) return (com.it.fome.nb6)(this);
RDebugUtils.currentLine=23789577;
 //BA.debugLineNum = 23789577;BA.debugLine="End Sub";
return null;
}
public com.it.fome.nb6  _color(com.it.fome.nb6 __ref,int _clr) throws Exception{
__ref = this;
RDebugUtils.currentModule="nb6";
if (Debug.shouldDelegate(ba, "color", false))
	 {return ((com.it.fome.nb6) Debug.delegate(ba, "color", new Object[] {_clr}));}
RDebugUtils.currentLine=23265280;
 //BA.debugLineNum = 23265280;BA.debugLine="Public Sub Color (Clr As Int) As NB6";
RDebugUtils.currentLine=23265281;
 //BA.debugLineNum = 23265281;BA.debugLine="If IsBuilder Then";
if (__ref._isbuilder /*boolean*/ (null)) { 
RDebugUtils.currentLine=23265282;
 //BA.debugLineNum = 23265282;BA.debugLine="NotificationBuilder.RunMethod(\"setColor\", Array(";
__ref._notificationbuilder /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setColor",new Object[]{(Object)(_clr)});
 };
RDebugUtils.currentLine=23265284;
 //BA.debugLineNum = 23265284;BA.debugLine="Return Me";
if (true) return (com.it.fome.nb6)(this);
RDebugUtils.currentLine=23265285;
 //BA.debugLineNum = 23265285;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.NotificationWrapper  _build(com.it.fome.nb6 __ref,Object _contenttitle,Object _contenttext,String _tag,Object _activity) throws Exception{
__ref = this;
RDebugUtils.currentModule="nb6";
if (Debug.shouldDelegate(ba, "build", false))
	 {return ((anywheresoftware.b4a.objects.NotificationWrapper) Debug.delegate(ba, "build", new Object[] {_contenttitle,_contenttext,_tag,_activity}));}
anywheresoftware.b4a.objects.IntentWrapper _in = null;
Object _pendingintent = null;
anywheresoftware.b4j.object.JavaObject _manager = null;
RDebugUtils.currentLine=23986176;
 //BA.debugLineNum = 23986176;BA.debugLine="Public Sub Build (ContentTitle As Object, ContentT";
RDebugUtils.currentLine=23986177;
 //BA.debugLineNum = 23986177;BA.debugLine="If IsOld Then";
if (__ref._isold /*boolean*/ (null)) { 
RDebugUtils.currentLine=23986178;
 //BA.debugLineNum = 23986178;BA.debugLine="OldNotification.SetInfo2(ContentTitle, ContentTe";
__ref._oldnotification /*anywheresoftware.b4a.objects.NotificationWrapper*/ .SetInfo2New(ba,BA.ObjectToCharSequence(_contenttitle),BA.ObjectToCharSequence(_contenttext),BA.ObjectToCharSequence(_tag),_activity);
RDebugUtils.currentLine=23986179;
 //BA.debugLineNum = 23986179;BA.debugLine="Return OldNotification";
if (true) return __ref._oldnotification /*anywheresoftware.b4a.objects.NotificationWrapper*/ ;
 }else {
RDebugUtils.currentLine=23986181;
 //BA.debugLineNum = 23986181;BA.debugLine="Dim in As Intent = CreateIntent(Activity, False)";
_in = new anywheresoftware.b4a.objects.IntentWrapper();
_in = __ref._createintent /*anywheresoftware.b4a.objects.IntentWrapper*/ (null,_activity,__c.False);
RDebugUtils.currentLine=23986182;
 //BA.debugLineNum = 23986182;BA.debugLine="in.Flags = Bit.Or(268435456, 131072) 'FLAG_ACTIV";
_in.setFlags(__c.Bit.Or((int) (268435456),(int) (131072)));
RDebugUtils.currentLine=23986183;
 //BA.debugLineNum = 23986183;BA.debugLine="in.PutExtra(\"Notification_Tag\", Tag)";
_in.PutExtra("Notification_Tag",(Object)(_tag));
RDebugUtils.currentLine=23986184;
 //BA.debugLineNum = 23986184;BA.debugLine="Dim PendingIntent As Object = PendingIntentStati";
_pendingintent = __ref._pendingintentstatic /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getActivity",new Object[]{(Object)(__ref._ctxt /*anywheresoftware.b4j.object.JavaObject*/ .getObject()),(Object)(__c.Rnd((int) (0),(int) (0x7fffffff))),(Object)(_in.getObject()),(Object)(0)});
RDebugUtils.currentLine=23986185;
 //BA.debugLineNum = 23986185;BA.debugLine="NotificationBuilder.RunMethodJO(\"setContentTitle";
__ref._notificationbuilder /*anywheresoftware.b4j.object.JavaObject*/ .RunMethodJO("setContentTitle",new Object[]{_contenttitle}).RunMethodJO("setContentText",new Object[]{_contenttext});
RDebugUtils.currentLine=23986186;
 //BA.debugLineNum = 23986186;BA.debugLine="NotificationBuilder.RunMethod(\"setContentIntent\"";
__ref._notificationbuilder /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setContentIntent",new Object[]{_pendingintent});
RDebugUtils.currentLine=23986188;
 //BA.debugLineNum = 23986188;BA.debugLine="If IsChannel Then";
if (__ref._ischannel /*boolean*/ (null)) { 
RDebugUtils.currentLine=23986189;
 //BA.debugLineNum = 23986189;BA.debugLine="Dim manager As JavaObject = ctxt.RunMethod(\"get";
_manager = new anywheresoftware.b4j.object.JavaObject();
_manager.setObject((java.lang.Object)(__ref._ctxt /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getSystemService",new Object[]{(Object)("notification")})));
RDebugUtils.currentLine=23986190;
 //BA.debugLineNum = 23986190;BA.debugLine="manager.RunMethod(\"createNotificationChannel\",";
_manager.RunMethod("createNotificationChannel",new Object[]{(Object)(__ref._channel /*anywheresoftware.b4j.object.JavaObject*/ .getObject())});
 };
RDebugUtils.currentLine=23986193;
 //BA.debugLineNum = 23986193;BA.debugLine="Return NotificationBuilder.RunMethod(\"build\", Nu";
if (true) return (anywheresoftware.b4a.objects.NotificationWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.NotificationWrapper(), (java.lang.Object)(__ref._notificationbuilder /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("build",(Object[])(__c.Null))));
 };
RDebugUtils.currentLine=23986195;
 //BA.debugLineNum = 23986195;BA.debugLine="End Sub";
return null;
}
public com.it.fome.nb6  _bigtextstyle(com.it.fome.nb6 __ref,Object _contenttitle,Object _summarytext,Object _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="nb6";
if (Debug.shouldDelegate(ba, "bigtextstyle", false))
	 {return ((com.it.fome.nb6) Debug.delegate(ba, "bigtextstyle", new Object[] {_contenttitle,_summarytext,_text}));}
RDebugUtils.currentLine=23855104;
 //BA.debugLineNum = 23855104;BA.debugLine="Public Sub BigTextStyle (ContentTitle As Object, S";
RDebugUtils.currentLine=23855105;
 //BA.debugLineNum = 23855105;BA.debugLine="If IsBuilder Then";
if (__ref._isbuilder /*boolean*/ (null)) { 
RDebugUtils.currentLine=23855106;
 //BA.debugLineNum = 23855106;BA.debugLine="SetStyle(\"android.app.Notification$BigTextStyle\"";
__ref._setstyle /*String*/ (null,"android.app.Notification$BigTextStyle",__c.createMap(new Object[] {(Object)("bigText"),_text,(Object)("setBigContentTitle"),_contenttitle,(Object)("setSummaryText"),_summarytext}));
 };
RDebugUtils.currentLine=23855109;
 //BA.debugLineNum = 23855109;BA.debugLine="Return Me";
if (true) return (com.it.fome.nb6)(this);
RDebugUtils.currentLine=23855110;
 //BA.debugLineNum = 23855110;BA.debugLine="End Sub";
return null;
}
public com.it.fome.nb6  _autocancel(com.it.fome.nb6 __ref,boolean _cancel) throws Exception{
__ref = this;
RDebugUtils.currentModule="nb6";
if (Debug.shouldDelegate(ba, "autocancel", false))
	 {return ((com.it.fome.nb6) Debug.delegate(ba, "autocancel", new Object[] {_cancel}));}
RDebugUtils.currentLine=23134208;
 //BA.debugLineNum = 23134208;BA.debugLine="Public Sub AutoCancel (Cancel As Boolean) As NB6";
RDebugUtils.currentLine=23134209;
 //BA.debugLineNum = 23134209;BA.debugLine="If IsOld Then";
if (__ref._isold /*boolean*/ (null)) { 
RDebugUtils.currentLine=23134210;
 //BA.debugLineNum = 23134210;BA.debugLine="OldNotification.AutoCancel = Cancel";
__ref._oldnotification /*anywheresoftware.b4a.objects.NotificationWrapper*/ .setAutoCancel(_cancel);
 }else {
RDebugUtils.currentLine=23134212;
 //BA.debugLineNum = 23134212;BA.debugLine="NotificationBuilder.RunMethod(\"setAutoCancel\", A";
__ref._notificationbuilder /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setAutoCancel",new Object[]{(Object)(_cancel)});
 };
RDebugUtils.currentLine=23134214;
 //BA.debugLineNum = 23134214;BA.debugLine="Return Me";
if (true) return (com.it.fome.nb6)(this);
RDebugUtils.currentLine=23134215;
 //BA.debugLineNum = 23134215;BA.debugLine="End Sub";
return null;
}
public com.it.fome.nb6  _subtext(com.it.fome.nb6 __ref,Object _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="nb6";
if (Debug.shouldDelegate(ba, "subtext", false))
	 {return ((com.it.fome.nb6) Debug.delegate(ba, "subtext", new Object[] {_text}));}
RDebugUtils.currentLine=23527424;
 //BA.debugLineNum = 23527424;BA.debugLine="Public Sub SubText (Text As Object) As NB6";
RDebugUtils.currentLine=23527425;
 //BA.debugLineNum = 23527425;BA.debugLine="If IsBuilder Then";
if (__ref._isbuilder /*boolean*/ (null)) { 
RDebugUtils.currentLine=23527426;
 //BA.debugLineNum = 23527426;BA.debugLine="NotificationBuilder.RunMethod(\"setSubText\", Arra";
__ref._notificationbuilder /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setSubText",new Object[]{_text});
 };
RDebugUtils.currentLine=23527428;
 //BA.debugLineNum = 23527428;BA.debugLine="Return Me";
if (true) return (com.it.fome.nb6)(this);
RDebugUtils.currentLine=23527429;
 //BA.debugLineNum = 23527429;BA.debugLine="End Sub";
return null;
}
public com.it.fome.nb6  _largeicon(com.it.fome.nb6 __ref,anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _icon) throws Exception{
__ref = this;
RDebugUtils.currentModule="nb6";
if (Debug.shouldDelegate(ba, "largeicon", false))
	 {return ((com.it.fome.nb6) Debug.delegate(ba, "largeicon", new Object[] {_icon}));}
RDebugUtils.currentLine=23003136;
 //BA.debugLineNum = 23003136;BA.debugLine="Public Sub LargeIcon (Icon As Bitmap) As NB6";
RDebugUtils.currentLine=23003137;
 //BA.debugLineNum = 23003137;BA.debugLine="If IsBuilder Then";
if (__ref._isbuilder /*boolean*/ (null)) { 
RDebugUtils.currentLine=23003138;
 //BA.debugLineNum = 23003138;BA.debugLine="NotificationBuilder.RunMethod(\"setLargeIcon\", Ar";
__ref._notificationbuilder /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setLargeIcon",new Object[]{__ref._createiconfrombitmap /*Object*/ (null,_icon)});
 };
RDebugUtils.currentLine=23003140;
 //BA.debugLineNum = 23003140;BA.debugLine="Return Me";
if (true) return (com.it.fome.nb6)(this);
RDebugUtils.currentLine=23003141;
 //BA.debugLineNum = 23003141;BA.debugLine="End Sub";
return null;
}
public com.it.fome.nb6  _badgeicontype(com.it.fome.nb6 __ref,String _icontype) throws Exception{
__ref = this;
RDebugUtils.currentModule="nb6";
if (Debug.shouldDelegate(ba, "badgeicontype", false))
	 {return ((com.it.fome.nb6) Debug.delegate(ba, "badgeicontype", new Object[] {_icontype}));}
anywheresoftware.b4a.objects.collections.Map _m = null;
RDebugUtils.currentLine=23199744;
 //BA.debugLineNum = 23199744;BA.debugLine="Public Sub BadgeIconType (IconType As String) As N";
RDebugUtils.currentLine=23199745;
 //BA.debugLineNum = 23199745;BA.debugLine="If SdkLevel >= 26 Then";
if (__ref._sdklevel /*int*/ >=26) { 
RDebugUtils.currentLine=23199746;
 //BA.debugLineNum = 23199746;BA.debugLine="Dim m As Map = CreateMap(\"LARGE\": 2, \"NONE\": 0,";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = __c.createMap(new Object[] {(Object)("LARGE"),(Object)(2),(Object)("NONE"),(Object)(0),(Object)("SMALL"),(Object)(1)});
RDebugUtils.currentLine=23199747;
 //BA.debugLineNum = 23199747;BA.debugLine="NotificationBuilder.RunMethod(\"setBadgeIconType\"";
__ref._notificationbuilder /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setBadgeIconType",new Object[]{_m.Get((Object)(_icontype))});
 };
RDebugUtils.currentLine=23199749;
 //BA.debugLineNum = 23199749;BA.debugLine="Return Me";
if (true) return (com.it.fome.nb6)(this);
RDebugUtils.currentLine=23199750;
 //BA.debugLineNum = 23199750;BA.debugLine="End Sub";
return null;
}
public com.it.fome.nb6  _number(com.it.fome.nb6 __ref,int _num) throws Exception{
__ref = this;
RDebugUtils.currentModule="nb6";
if (Debug.shouldDelegate(ba, "number", false))
	 {return ((com.it.fome.nb6) Debug.delegate(ba, "number", new Object[] {_num}));}
RDebugUtils.currentLine=23330816;
 //BA.debugLineNum = 23330816;BA.debugLine="Public Sub Number (Num As Int) As NB6";
RDebugUtils.currentLine=23330817;
 //BA.debugLineNum = 23330817;BA.debugLine="If IsOld Then";
if (__ref._isold /*boolean*/ (null)) { 
RDebugUtils.currentLine=23330818;
 //BA.debugLineNum = 23330818;BA.debugLine="OldNotification.Number = Num";
__ref._oldnotification /*anywheresoftware.b4a.objects.NotificationWrapper*/ .setNumber(_num);
 }else {
RDebugUtils.currentLine=23330820;
 //BA.debugLineNum = 23330820;BA.debugLine="NotificationBuilder.RunMethod(\"setNumber\", Array";
__ref._notificationbuilder /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setNumber",new Object[]{(Object)(_num)});
 };
RDebugUtils.currentLine=23330822;
 //BA.debugLineNum = 23330822;BA.debugLine="Return Me";
if (true) return (com.it.fome.nb6)(this);
RDebugUtils.currentLine=23330823;
 //BA.debugLineNum = 23330823;BA.debugLine="End Sub";
return null;
}
public com.it.fome.nb6  _showwhen(com.it.fome.nb6 __ref,long _time) throws Exception{
__ref = this;
RDebugUtils.currentModule="nb6";
if (Debug.shouldDelegate(ba, "showwhen", false))
	 {return ((com.it.fome.nb6) Debug.delegate(ba, "showwhen", new Object[] {_time}));}
RDebugUtils.currentLine=23396352;
 //BA.debugLineNum = 23396352;BA.debugLine="Public Sub ShowWhen (Time As Long) As NB6";
RDebugUtils.currentLine=23396353;
 //BA.debugLineNum = 23396353;BA.debugLine="If IsBuilder Then";
if (__ref._isbuilder /*boolean*/ (null)) { 
RDebugUtils.currentLine=23396354;
 //BA.debugLineNum = 23396354;BA.debugLine="NotificationBuilder.RunMethod(\"setShowWhen\", Arr";
__ref._notificationbuilder /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setShowWhen",new Object[]{(Object)(__c.True)});
RDebugUtils.currentLine=23396355;
 //BA.debugLineNum = 23396355;BA.debugLine="NotificationBuilder.RunMethod(\"setWhen\", Array(T";
__ref._notificationbuilder /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setWhen",new Object[]{(Object)(_time)});
 };
RDebugUtils.currentLine=23396357;
 //BA.debugLineNum = 23396357;BA.debugLine="Return Me";
if (true) return (com.it.fome.nb6)(this);
RDebugUtils.currentLine=23396358;
 //BA.debugLineNum = 23396358;BA.debugLine="End Sub";
return null;
}
public com.it.fome.nb6  _addbuttonaction(com.it.fome.nb6 __ref,anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp,Object _title,Object _service,String _action) throws Exception{
__ref = this;
RDebugUtils.currentModule="nb6";
if (Debug.shouldDelegate(ba, "addbuttonaction", false))
	 {return ((com.it.fome.nb6) Debug.delegate(ba, "addbuttonaction", new Object[] {_bmp,_title,_service,_action}));}
Object _ac = null;
RDebugUtils.currentLine=22740992;
 //BA.debugLineNum = 22740992;BA.debugLine="Public Sub AddButtonAction (Bmp As Bitmap, Title A";
RDebugUtils.currentLine=22740993;
 //BA.debugLineNum = 22740993;BA.debugLine="If IsBuilder = False Then Return Me";
if (__ref._isbuilder /*boolean*/ (null)==__c.False) { 
if (true) return (com.it.fome.nb6)(this);};
RDebugUtils.currentLine=22740994;
 //BA.debugLineNum = 22740994;BA.debugLine="Dim ac As Object = CreateAction(Bmp, Title, Creat";
_ac = __ref._createaction /*Object*/ (null,_bmp,_title,__ref._createreceiverpendingintent /*Object*/ (null,_service,_action));
RDebugUtils.currentLine=22740995;
 //BA.debugLineNum = 22740995;BA.debugLine="NotificationBuilder.RunMethod(\"addAction\", Array(";
__ref._notificationbuilder /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("addAction",new Object[]{_ac});
RDebugUtils.currentLine=22740996;
 //BA.debugLineNum = 22740996;BA.debugLine="Return Me";
if (true) return (com.it.fome.nb6)(this);
RDebugUtils.currentLine=22740997;
 //BA.debugLineNum = 22740997;BA.debugLine="End Sub";
return null;
}
public boolean  _isbuilder(com.it.fome.nb6 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="nb6";
if (Debug.shouldDelegate(ba, "isbuilder", false))
	 {return ((Boolean) Debug.delegate(ba, "isbuilder", null));}
RDebugUtils.currentLine=24313856;
 //BA.debugLineNum = 24313856;BA.debugLine="Private Sub IsBuilder As Boolean";
RDebugUtils.currentLine=24313857;
 //BA.debugLineNum = 24313857;BA.debugLine="Return SupportLevel >= S_BUILDER";
if (true) return __ref._supportlevel /*int*/ >=__ref._s_builder /*int*/ ;
RDebugUtils.currentLine=24313858;
 //BA.debugLineNum = 24313858;BA.debugLine="End Sub";
return false;
}
public Object  _createaction(com.it.fome.nb6 __ref,anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp,Object _title,Object _pendingintent) throws Exception{
__ref = this;
RDebugUtils.currentModule="nb6";
if (Debug.shouldDelegate(ba, "createaction", false))
	 {return ((Object) Debug.delegate(ba, "createaction", new Object[] {_bmp,_title,_pendingintent}));}
anywheresoftware.b4j.object.JavaObject _builder = null;
RDebugUtils.currentLine=24182784;
 //BA.debugLineNum = 24182784;BA.debugLine="Private Sub CreateAction (Bmp As Bitmap, Title As";
RDebugUtils.currentLine=24182785;
 //BA.debugLineNum = 24182785;BA.debugLine="Dim builder As JavaObject";
_builder = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=24182786;
 //BA.debugLineNum = 24182786;BA.debugLine="builder.InitializeNewInstance(\"android.app.Notifi";
_builder.InitializeNewInstance("android.app.Notification$Action$Builder",new Object[]{__ref._createiconfrombitmap /*Object*/ (null,_bmp),_title,_pendingintent});
RDebugUtils.currentLine=24182787;
 //BA.debugLineNum = 24182787;BA.debugLine="Return builder.RunMethod(\"build\", Null)";
if (true) return _builder.RunMethod("build",(Object[])(__c.Null));
RDebugUtils.currentLine=24182788;
 //BA.debugLineNum = 24182788;BA.debugLine="End Sub";
return null;
}
public Object  _createreceiverpendingintent(com.it.fome.nb6 __ref,Object _service,String _action) throws Exception{
__ref = this;
RDebugUtils.currentModule="nb6";
if (Debug.shouldDelegate(ba, "createreceiverpendingintent", false))
	 {return ((Object) Debug.delegate(ba, "createreceiverpendingintent", new Object[] {_service,_action}));}
anywheresoftware.b4a.objects.IntentWrapper _in = null;
RDebugUtils.currentLine=24051712;
 //BA.debugLineNum = 24051712;BA.debugLine="Private Sub CreateReceiverPendingIntent (Service A";
RDebugUtils.currentLine=24051713;
 //BA.debugLineNum = 24051713;BA.debugLine="Dim in As Intent = CreateIntent(Service, True)";
_in = new anywheresoftware.b4a.objects.IntentWrapper();
_in = __ref._createintent /*anywheresoftware.b4a.objects.IntentWrapper*/ (null,_service,__c.True);
RDebugUtils.currentLine=24051714;
 //BA.debugLineNum = 24051714;BA.debugLine="in.Action = Action";
_in.setAction(_action);
RDebugUtils.currentLine=24051715;
 //BA.debugLineNum = 24051715;BA.debugLine="Return PendingIntentStatic.RunMethod(\"getBroadcas";
if (true) return __ref._pendingintentstatic /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getBroadcast",new Object[]{(Object)(__ref._ctxt /*anywheresoftware.b4j.object.JavaObject*/ .getObject()),(Object)(1),(Object)(_in.getObject()),(Object)(0)});
RDebugUtils.currentLine=24051716;
 //BA.debugLineNum = 24051716;BA.debugLine="End Sub";
return null;
}
public boolean  _isold(com.it.fome.nb6 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="nb6";
if (Debug.shouldDelegate(ba, "isold", false))
	 {return ((Boolean) Debug.delegate(ba, "isold", null));}
RDebugUtils.currentLine=24379392;
 //BA.debugLineNum = 24379392;BA.debugLine="Private Sub IsOld As Boolean";
RDebugUtils.currentLine=24379393;
 //BA.debugLineNum = 24379393;BA.debugLine="Return SupportLevel = S_OLD";
if (true) return __ref._supportlevel /*int*/ ==__ref._s_old /*int*/ ;
RDebugUtils.currentLine=24379394;
 //BA.debugLineNum = 24379394;BA.debugLine="End Sub";
return false;
}
public String  _setstyle(com.it.fome.nb6 __ref,String _stylename,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="nb6";
if (Debug.shouldDelegate(ba, "setstyle", false))
	 {return ((String) Debug.delegate(ba, "setstyle", new Object[] {_stylename,_props}));}
anywheresoftware.b4j.object.JavaObject _style = null;
String _method = "";
Object _value = null;
RDebugUtils.currentLine=23920640;
 //BA.debugLineNum = 23920640;BA.debugLine="Private Sub SetStyle(StyleName As String, Props As";
RDebugUtils.currentLine=23920641;
 //BA.debugLineNum = 23920641;BA.debugLine="Dim style As JavaObject";
_style = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=23920642;
 //BA.debugLineNum = 23920642;BA.debugLine="style.InitializeNewInstance(StyleName, Null)";
_style.InitializeNewInstance(_stylename,(Object[])(__c.Null));
RDebugUtils.currentLine=23920643;
 //BA.debugLineNum = 23920643;BA.debugLine="For Each method As String In Props.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _props.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_method = BA.ObjectToString(group3.Get(index3));
RDebugUtils.currentLine=23920644;
 //BA.debugLineNum = 23920644;BA.debugLine="Dim value As Object = Props.Get(method)";
_value = _props.Get((Object)(_method));
RDebugUtils.currentLine=23920645;
 //BA.debugLineNum = 23920645;BA.debugLine="If value <> Null Then";
if (_value!= null) { 
RDebugUtils.currentLine=23920646;
 //BA.debugLineNum = 23920646;BA.debugLine="style.RunMethod(method, Array(value))";
_style.RunMethod(_method,new Object[]{_value});
 };
 }
};
RDebugUtils.currentLine=23920649;
 //BA.debugLineNum = 23920649;BA.debugLine="NotificationBuilder.RunMethod(\"setStyle\", Array(s";
__ref._notificationbuilder /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setStyle",new Object[]{(Object)(_style.getObject())});
RDebugUtils.currentLine=23920650;
 //BA.debugLineNum = 23920650;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.IntentWrapper  _createintent(com.it.fome.nb6 __ref,Object _target,boolean _receiver) throws Exception{
__ref = this;
RDebugUtils.currentModule="nb6";
if (Debug.shouldDelegate(ba, "createintent", false))
	 {return ((anywheresoftware.b4a.objects.IntentWrapper) Debug.delegate(ba, "createintent", new Object[] {_target,_receiver}));}
anywheresoftware.b4j.object.JavaObject _in = null;
RDebugUtils.currentLine=24117248;
 //BA.debugLineNum = 24117248;BA.debugLine="Private Sub CreateIntent (Target As Object, Receiv";
RDebugUtils.currentLine=24117249;
 //BA.debugLineNum = 24117249;BA.debugLine="Target = common.RunMethod(\"getComponentClass\", Ar";
_target = __ref._common /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getComponentClass",new Object[]{__c.Null,_target,(Object)(_receiver)});
RDebugUtils.currentLine=24117250;
 //BA.debugLineNum = 24117250;BA.debugLine="Dim in As JavaObject";
_in = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=24117251;
 //BA.debugLineNum = 24117251;BA.debugLine="in.InitializeNewInstance(\"android.content.Intent\"";
_in.InitializeNewInstance("android.content.Intent",new Object[]{(Object)(__ref._ctxt /*anywheresoftware.b4j.object.JavaObject*/ .getObject()),_target});
RDebugUtils.currentLine=24117252;
 //BA.debugLineNum = 24117252;BA.debugLine="Return in";
if (true) return (anywheresoftware.b4a.objects.IntentWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.IntentWrapper(), (android.content.Intent)(_in.getObject()));
RDebugUtils.currentLine=24117253;
 //BA.debugLineNum = 24117253;BA.debugLine="End Sub";
return null;
}
public boolean  _ischannel(com.it.fome.nb6 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="nb6";
if (Debug.shouldDelegate(ba, "ischannel", false))
	 {return ((Boolean) Debug.delegate(ba, "ischannel", null));}
RDebugUtils.currentLine=24444928;
 //BA.debugLineNum = 24444928;BA.debugLine="Private Sub IsChannel As Boolean";
RDebugUtils.currentLine=24444929;
 //BA.debugLineNum = 24444929;BA.debugLine="Return SupportLevel = S_CHANNEL";
if (true) return __ref._supportlevel /*int*/ ==__ref._s_channel /*int*/ ;
RDebugUtils.currentLine=24444930;
 //BA.debugLineNum = 24444930;BA.debugLine="End Sub";
return false;
}
public String  _class_globals(com.it.fome.nb6 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="nb6";
RDebugUtils.currentLine=22609920;
 //BA.debugLineNum = 22609920;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=22609921;
 //BA.debugLineNum = 22609921;BA.debugLine="Private Channel As JavaObject";
_channel = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=22609922;
 //BA.debugLineNum = 22609922;BA.debugLine="Private NotificationBuilder As JavaObject";
_notificationbuilder = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=22609923;
 //BA.debugLineNum = 22609923;BA.debugLine="Private SdkLevel As Int";
_sdklevel = 0;
RDebugUtils.currentLine=22609924;
 //BA.debugLineNum = 22609924;BA.debugLine="Private ctxt As JavaObject";
_ctxt = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=22609925;
 //BA.debugLineNum = 22609925;BA.debugLine="Private const S_OLD = 0, S_BUILDER = 1, S_CHANNEL";
_s_old = (int) (0);
_s_builder = (int) (1);
_s_channel = (int) (2);
RDebugUtils.currentLine=22609926;
 //BA.debugLineNum = 22609926;BA.debugLine="Private SupportLevel As Int";
_supportlevel = 0;
RDebugUtils.currentLine=22609927;
 //BA.debugLineNum = 22609927;BA.debugLine="Private OldNotification As Notification";
_oldnotification = new anywheresoftware.b4a.objects.NotificationWrapper();
RDebugUtils.currentLine=22609928;
 //BA.debugLineNum = 22609928;BA.debugLine="Private PendingIntentStatic As JavaObject";
_pendingintentstatic = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=22609929;
 //BA.debugLineNum = 22609929;BA.debugLine="Private NotificationStatic As JavaObject";
_notificationstatic = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=22609930;
 //BA.debugLineNum = 22609930;BA.debugLine="Private common As JavaObject";
_common = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=22609932;
 //BA.debugLineNum = 22609932;BA.debugLine="End Sub";
return "";
}
public Object  _createiconfrombitmap(com.it.fome.nb6 __ref,anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp) throws Exception{
__ref = this;
RDebugUtils.currentModule="nb6";
if (Debug.shouldDelegate(ba, "createiconfrombitmap", false))
	 {return ((Object) Debug.delegate(ba, "createiconfrombitmap", new Object[] {_bmp}));}
anywheresoftware.b4j.object.JavaObject _icon = null;
RDebugUtils.currentLine=24248320;
 //BA.debugLineNum = 24248320;BA.debugLine="Private Sub CreateIconFromBitmap(bmp As Bitmap) As";
RDebugUtils.currentLine=24248321;
 //BA.debugLineNum = 24248321;BA.debugLine="If bmp = Null Or bmp.IsInitialized = False Then R";
if (_bmp== null || _bmp.IsInitialized()==__c.False) { 
if (true) return (Object)(0);};
RDebugUtils.currentLine=24248322;
 //BA.debugLineNum = 24248322;BA.debugLine="Dim icon As JavaObject";
_icon = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=24248323;
 //BA.debugLineNum = 24248323;BA.debugLine="Return icon.InitializeStatic(\"android.graphics.dr";
if (true) return _icon.InitializeStatic("android.graphics.drawable.Icon").RunMethod("createWithBitmap",new Object[]{(Object)(_bmp.getObject())});
RDebugUtils.currentLine=24248324;
 //BA.debugLineNum = 24248324;BA.debugLine="End Sub";
return null;
}
public com.it.fome.nb6  _customsound(com.it.fome.nb6 __ref,Object _fileprovideruri) throws Exception{
__ref = this;
RDebugUtils.currentModule="nb6";
if (Debug.shouldDelegate(ba, "customsound", false))
	 {return ((com.it.fome.nb6) Debug.delegate(ba, "customsound", new Object[] {_fileprovideruri}));}
RDebugUtils.currentLine=23658496;
 //BA.debugLineNum = 23658496;BA.debugLine="Public Sub CustomSound (FileProviderUri As Object)";
RDebugUtils.currentLine=23658497;
 //BA.debugLineNum = 23658497;BA.debugLine="If IsOld Then Return Me";
if (__ref._isold /*boolean*/ (null)) { 
if (true) return (com.it.fome.nb6)(this);};
RDebugUtils.currentLine=23658498;
 //BA.debugLineNum = 23658498;BA.debugLine="ctxt.RunMethod(\"grantUriPermission\", Array(\"com.a";
__ref._ctxt /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("grantUriPermission",new Object[]{(Object)("com.android.systemui"),_fileprovideruri,(Object)(1)});
RDebugUtils.currentLine=23658499;
 //BA.debugLineNum = 23658499;BA.debugLine="If IsBuilder Then";
if (__ref._isbuilder /*boolean*/ (null)) { 
RDebugUtils.currentLine=23658500;
 //BA.debugLineNum = 23658500;BA.debugLine="NotificationBuilder.RunMethod(\"setSound\", Array(";
__ref._notificationbuilder /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setSound",new Object[]{_fileprovideruri,__ref._notificationstatic /*anywheresoftware.b4j.object.JavaObject*/ .GetField("AUDIO_ATTRIBUTES_DEFAULT")});
RDebugUtils.currentLine=23658501;
 //BA.debugLineNum = 23658501;BA.debugLine="If IsChannel Then";
if (__ref._ischannel /*boolean*/ (null)) { 
RDebugUtils.currentLine=23658502;
 //BA.debugLineNum = 23658502;BA.debugLine="Channel.RunMethod(\"setSound\", Array(FileProvide";
__ref._channel /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setSound",new Object[]{_fileprovideruri,__ref._notificationstatic /*anywheresoftware.b4j.object.JavaObject*/ .GetField("AUDIO_ATTRIBUTES_DEFAULT")});
 };
 };
RDebugUtils.currentLine=23658505;
 //BA.debugLineNum = 23658505;BA.debugLine="Return Me";
if (true) return (com.it.fome.nb6)(this);
RDebugUtils.currentLine=23658506;
 //BA.debugLineNum = 23658506;BA.debugLine="End Sub";
return null;
}
public com.it.fome.nb6  _deleteaction(com.it.fome.nb6 __ref,Object _service,String _action) throws Exception{
__ref = this;
RDebugUtils.currentModule="nb6";
if (Debug.shouldDelegate(ba, "deleteaction", false))
	 {return ((com.it.fome.nb6) Debug.delegate(ba, "deleteaction", new Object[] {_service,_action}));}
RDebugUtils.currentLine=22806528;
 //BA.debugLineNum = 22806528;BA.debugLine="Public Sub DeleteAction (Service As Object, Action";
RDebugUtils.currentLine=22806529;
 //BA.debugLineNum = 22806529;BA.debugLine="If IsBuilder Then";
if (__ref._isbuilder /*boolean*/ (null)) { 
RDebugUtils.currentLine=22806530;
 //BA.debugLineNum = 22806530;BA.debugLine="NotificationBuilder.RunMethod(\"setDeleteIntent\",";
__ref._notificationbuilder /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setDeleteIntent",new Object[]{__ref._createreceiverpendingintent /*Object*/ (null,_service,_action)});
 };
RDebugUtils.currentLine=22806532;
 //BA.debugLineNum = 22806532;BA.debugLine="Return Me";
if (true) return (com.it.fome.nb6)(this);
RDebugUtils.currentLine=22806533;
 //BA.debugLineNum = 22806533;BA.debugLine="End Sub";
return null;
}
public com.it.fome.nb6  _setdefaults(com.it.fome.nb6 __ref,boolean _sound,boolean _light,boolean _vibrate) throws Exception{
__ref = this;
RDebugUtils.currentModule="nb6";
if (Debug.shouldDelegate(ba, "setdefaults", false))
	 {return ((com.it.fome.nb6) Debug.delegate(ba, "setdefaults", new Object[] {_sound,_light,_vibrate}));}
int _currentdefaults = 0;
RDebugUtils.currentLine=23592960;
 //BA.debugLineNum = 23592960;BA.debugLine="Public Sub SetDefaults (Sound As Boolean, Light As";
RDebugUtils.currentLine=23592961;
 //BA.debugLineNum = 23592961;BA.debugLine="If IsOld Then";
if (__ref._isold /*boolean*/ (null)) { 
RDebugUtils.currentLine=23592962;
 //BA.debugLineNum = 23592962;BA.debugLine="OldNotification.Sound = Sound";
__ref._oldnotification /*anywheresoftware.b4a.objects.NotificationWrapper*/ .setSound(_sound);
RDebugUtils.currentLine=23592963;
 //BA.debugLineNum = 23592963;BA.debugLine="OldNotification.Light = Light";
__ref._oldnotification /*anywheresoftware.b4a.objects.NotificationWrapper*/ .setLight(_light);
RDebugUtils.currentLine=23592964;
 //BA.debugLineNum = 23592964;BA.debugLine="OldNotification.Vibrate = Vibrate";
__ref._oldnotification /*anywheresoftware.b4a.objects.NotificationWrapper*/ .setVibrate(_vibrate);
 }else {
RDebugUtils.currentLine=23592966;
 //BA.debugLineNum = 23592966;BA.debugLine="If IsChannel Then";
if (__ref._ischannel /*boolean*/ (null)) { 
RDebugUtils.currentLine=23592967;
 //BA.debugLineNum = 23592967;BA.debugLine="Channel.RunMethod(\"enableLights\", Array(Light))";
__ref._channel /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("enableLights",new Object[]{(Object)(_light)});
RDebugUtils.currentLine=23592968;
 //BA.debugLineNum = 23592968;BA.debugLine="Channel.RunMethod(\"enableVibration\", Array(Vibr";
__ref._channel /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("enableVibration",new Object[]{(Object)(_vibrate)});
 }else {
RDebugUtils.currentLine=23592970;
 //BA.debugLineNum = 23592970;BA.debugLine="Dim CurrentDefaults As Int";
_currentdefaults = 0;
RDebugUtils.currentLine=23592971;
 //BA.debugLineNum = 23592971;BA.debugLine="If Sound Then CurrentDefaults = 1";
if (_sound) { 
_currentdefaults = (int) (1);};
RDebugUtils.currentLine=23592972;
 //BA.debugLineNum = 23592972;BA.debugLine="If Vibrate Then CurrentDefaults = Bit.Or(Curren";
if (_vibrate) { 
_currentdefaults = __c.Bit.Or(_currentdefaults,(int) (2));};
RDebugUtils.currentLine=23592973;
 //BA.debugLineNum = 23592973;BA.debugLine="If Light Then CurrentDefaults = Bit.Or(CurrentD";
if (_light) { 
_currentdefaults = __c.Bit.Or(_currentdefaults,(int) (4));};
RDebugUtils.currentLine=23592974;
 //BA.debugLineNum = 23592974;BA.debugLine="NotificationBuilder.RunMethod(\"setDefaults\", Ar";
__ref._notificationbuilder /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setDefaults",new Object[]{(Object)(_currentdefaults)});
 };
 };
RDebugUtils.currentLine=23592977;
 //BA.debugLineNum = 23592977;BA.debugLine="Return Me";
if (true) return (com.it.fome.nb6)(this);
RDebugUtils.currentLine=23592978;
 //BA.debugLineNum = 23592978;BA.debugLine="End Sub";
return null;
}
public com.it.fome.nb6  _oldnotificationicon(com.it.fome.nb6 __ref,String _resourcename) throws Exception{
__ref = this;
RDebugUtils.currentModule="nb6";
if (Debug.shouldDelegate(ba, "oldnotificationicon", false))
	 {return ((com.it.fome.nb6) Debug.delegate(ba, "oldnotificationicon", new Object[] {_resourcename}));}
RDebugUtils.currentLine=22872064;
 //BA.debugLineNum = 22872064;BA.debugLine="Public Sub OldNotificationIcon (ResourceName As St";
RDebugUtils.currentLine=22872065;
 //BA.debugLineNum = 22872065;BA.debugLine="If IsOld Then";
if (__ref._isold /*boolean*/ (null)) { 
RDebugUtils.currentLine=22872066;
 //BA.debugLineNum = 22872066;BA.debugLine="OldNotification.Icon = ResourceName";
__ref._oldnotification /*anywheresoftware.b4a.objects.NotificationWrapper*/ .setIcon(_resourcename);
 };
RDebugUtils.currentLine=22872068;
 //BA.debugLineNum = 22872068;BA.debugLine="Return Me";
if (true) return (com.it.fome.nb6)(this);
RDebugUtils.currentLine=22872069;
 //BA.debugLineNum = 22872069;BA.debugLine="End Sub";
return null;
}
public com.it.fome.nb6  _onlyalertonce(com.it.fome.nb6 __ref,boolean _once) throws Exception{
__ref = this;
RDebugUtils.currentModule="nb6";
if (Debug.shouldDelegate(ba, "onlyalertonce", false))
	 {return ((com.it.fome.nb6) Debug.delegate(ba, "onlyalertonce", new Object[] {_once}));}
RDebugUtils.currentLine=23068672;
 //BA.debugLineNum = 23068672;BA.debugLine="Public Sub OnlyAlertOnce (Once As Boolean) As NB6";
RDebugUtils.currentLine=23068673;
 //BA.debugLineNum = 23068673;BA.debugLine="If IsBuilder Then";
if (__ref._isbuilder /*boolean*/ (null)) { 
RDebugUtils.currentLine=23068674;
 //BA.debugLineNum = 23068674;BA.debugLine="NotificationBuilder.RunMethod(\"setOnlyAlertOnce\"";
__ref._notificationbuilder /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setOnlyAlertOnce",new Object[]{(Object)(_once)});
 };
RDebugUtils.currentLine=23068676;
 //BA.debugLineNum = 23068676;BA.debugLine="Return Me";
if (true) return (com.it.fome.nb6)(this);
RDebugUtils.currentLine=23068677;
 //BA.debugLineNum = 23068677;BA.debugLine="End Sub";
return null;
}
public com.it.fome.nb6  _progress(com.it.fome.nb6 __ref,int _value,int _maxvalue,boolean _indeterminate) throws Exception{
__ref = this;
RDebugUtils.currentModule="nb6";
if (Debug.shouldDelegate(ba, "progress", false))
	 {return ((com.it.fome.nb6) Debug.delegate(ba, "progress", new Object[] {_value,_maxvalue,_indeterminate}));}
RDebugUtils.currentLine=23461888;
 //BA.debugLineNum = 23461888;BA.debugLine="Public Sub Progress (Value As Int, MaxValue As Int";
RDebugUtils.currentLine=23461889;
 //BA.debugLineNum = 23461889;BA.debugLine="If IsBuilder Then";
if (__ref._isbuilder /*boolean*/ (null)) { 
RDebugUtils.currentLine=23461890;
 //BA.debugLineNum = 23461890;BA.debugLine="NotificationBuilder.RunMethod(\"setProgress\", Arr";
__ref._notificationbuilder /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setProgress",new Object[]{(Object)(_maxvalue),(Object)(_value),(Object)(_indeterminate)});
 };
RDebugUtils.currentLine=23461892;
 //BA.debugLineNum = 23461892;BA.debugLine="Return Me";
if (true) return (com.it.fome.nb6)(this);
RDebugUtils.currentLine=23461893;
 //BA.debugLineNum = 23461893;BA.debugLine="End Sub";
return null;
}
public com.it.fome.nb6  _visibility(com.it.fome.nb6 __ref,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="nb6";
if (Debug.shouldDelegate(ba, "visibility", false))
	 {return ((com.it.fome.nb6) Debug.delegate(ba, "visibility", new Object[] {_value}));}
anywheresoftware.b4a.objects.collections.Map _m = null;
int _i = 0;
RDebugUtils.currentLine=23724032;
 //BA.debugLineNum = 23724032;BA.debugLine="Public Sub Visibility (Value As String) As NB6";
RDebugUtils.currentLine=23724033;
 //BA.debugLineNum = 23724033;BA.debugLine="If IsBuilder Then";
if (__ref._isbuilder /*boolean*/ (null)) { 
RDebugUtils.currentLine=23724034;
 //BA.debugLineNum = 23724034;BA.debugLine="Dim m As Map = CreateMap(\"PUBLIC\": 1, \"SECRET\":";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = __c.createMap(new Object[] {(Object)("PUBLIC"),(Object)(1),(Object)("SECRET"),(Object)(-1),(Object)("PRIVATE"),(Object)(0)});
RDebugUtils.currentLine=23724035;
 //BA.debugLineNum = 23724035;BA.debugLine="Dim i As Int = m.Get(Value)";
_i = (int)(BA.ObjectToNumber(_m.Get((Object)(_value))));
RDebugUtils.currentLine=23724036;
 //BA.debugLineNum = 23724036;BA.debugLine="NotificationBuilder.RunMethod(\"setVisibility\", A";
__ref._notificationbuilder /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setVisibility",new Object[]{(Object)(_i)});
 };
RDebugUtils.currentLine=23724038;
 //BA.debugLineNum = 23724038;BA.debugLine="Return Me";
if (true) return (com.it.fome.nb6)(this);
RDebugUtils.currentLine=23724039;
 //BA.debugLineNum = 23724039;BA.debugLine="End Sub";
return null;
}
}