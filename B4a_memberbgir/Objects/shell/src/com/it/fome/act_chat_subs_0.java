package com.it.fome;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class act_chat_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (act_chat) ","act_chat",16,act_chat.mostCurrent.activityBA,act_chat.mostCurrent,58);
if (RapidSub.canDelegate("activity_create")) { return com.it.fome.act_chat.remoteMe.runUserSub(false, "act_chat","activity_create", _firsttime);}
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _personimage = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
RemoteObject _personname = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _font2 = RemoteObject.declareNull("anywheresoftware.b4a.keywords.constants.TypefaceWrapper");
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 58;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 59;BA.debugLine="pr.initialize(\"pr\")";
Debug.ShouldStop(67108864);
act_chat.mostCurrent._pr.runVoidMethod ("initialize",act_chat.processBA,(Object)(RemoteObject.createImmutable("pr")));
 BA.debugLineNum = 60;BA.debugLine="If File.Exists(File.DirInternal,\"instadb.db\")=Fal";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",act_chat.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(act_chat.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("instadb.db"))),act_chat.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 61;BA.debugLine="File.Copy(File.DirAssets,\"instadb.db\",File.DirIn";
Debug.ShouldStop(268435456);
act_chat.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(act_chat.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("instadb.db")),(Object)(act_chat.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("instadb.db")));
 };
 BA.debugLineNum = 63;BA.debugLine="If sql1.IsInitialized=False Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",act_chat._sql1.runMethod(true,"IsInitialized"),act_chat.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 64;BA.debugLine="sql1.Initialize(File.DirInternal,\"instadb.db\",Fa";
Debug.ShouldStop(-2147483648);
act_chat._sql1.runVoidMethod ("Initialize",(Object)(act_chat.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("instadb.db")),(Object)(act_chat.mostCurrent.__c.getField(true,"False")));
 };
 BA.debugLineNum = 68;BA.debugLine="cursor1 = sql1.ExecQuery(\"SELECT * FROM tbl_tele";
Debug.ShouldStop(8);
act_chat._cursor1.setObject(act_chat._sql1.runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT * FROM tbl_tele WHERE soich='1'"))));
 BA.debugLineNum = 69;BA.debugLine="Dim i As Int";
Debug.ShouldStop(16);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 70;BA.debugLine="For i=0 To cursor1.RowCount-1";
Debug.ShouldStop(32);
{
final int step10 = 1;
final int limit10 = RemoteObject.solve(new RemoteObject[] {act_chat._cursor1.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step10 > 0 && _i.<Integer>get().intValue() <= limit10) || (step10 < 0 && _i.<Integer>get().intValue() >= limit10) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step10))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 71;BA.debugLine="cursor1.Position=i";
Debug.ShouldStop(64);
act_chat._cursor1.runMethod(true,"setPosition",_i);
 BA.debugLineNum = 72;BA.debugLine="userid_t=cursor1.GetString(\"userid\")";
Debug.ShouldStop(128);
act_chat.mostCurrent._userid_t = act_chat._cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("userid")));
 BA.debugLineNum = 73;BA.debugLine="username_t=cursor1.GetString(\"username\")";
Debug.ShouldStop(256);
act_chat.mostCurrent._username_t = act_chat._cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("username")));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 75;BA.debugLine="cursor1.Close";
Debug.ShouldStop(1024);
act_chat._cursor1.runVoidMethod ("Close");
 BA.debugLineNum = 77;BA.debugLine="ItemList.Initialize";
Debug.ShouldStop(4096);
act_chat.mostCurrent._itemlist.runVoidMethod ("Initialize");
 BA.debugLineNum = 78;BA.debugLine="IME.Initialize(\"IME\")";
Debug.ShouldStop(8192);
act_chat.mostCurrent._ime.runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("IME")));
 BA.debugLineNum = 79;BA.debugLine="IME.AddHeightChangedEvent";
Debug.ShouldStop(16384);
act_chat.mostCurrent._ime.runVoidMethod ("AddHeightChangedEvent",act_chat.mostCurrent.activityBA);
 BA.debugLineNum = 80;BA.debugLine="Font = Typeface.LoadFromAssets(\"iran_sans.ttf\")";
Debug.ShouldStop(32768);
act_chat.mostCurrent._font.setObject(act_chat.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("iran_sans.ttf"))));
 BA.debugLineNum = 81;BA.debugLine="SB.Initialize";
Debug.ShouldStop(65536);
act_chat.mostCurrent._sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 82;BA.debugLine="Toolbar.Initialize(\"Toolbar\")";
Debug.ShouldStop(131072);
act_chat.mostCurrent._toolbar.runVoidMethod ("Initialize",act_chat.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Toolbar")));
 BA.debugLineNum = 83;BA.debugLine="Toolbar.Color = AppCompat.GetThemeAttribute(\"colo";
Debug.ShouldStop(262144);
act_chat.mostCurrent._toolbar.runVoidMethod ("setColor",act_chat.mostCurrent._appcompat.runMethod(true,"GetThemeAttribute",act_chat.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("colorPrimary"))));
 BA.debugLineNum = 85;BA.debugLine="Activity.AddView(Toolbar,0,0,100%x,10%y)";
Debug.ShouldStop(1048576);
act_chat.mostCurrent._activity.runVoidMethod ("AddView",(Object)((act_chat.mostCurrent._toolbar.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(act_chat.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),act_chat.mostCurrent.activityBA)),(Object)(act_chat.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),act_chat.mostCurrent.activityBA)));
 BA.debugLineNum = 86;BA.debugLine="Toolbar.Elevation = 8dip";
Debug.ShouldStop(2097152);
act_chat.mostCurrent._toolbar.runMethod(true,"setElevation",BA.numberCast(float.class, act_chat.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 8)))));
 BA.debugLineNum = 87;BA.debugLine="Dim PersonImage As ImageView : PersonImage.Initia";
Debug.ShouldStop(4194304);
_personimage = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");Debug.locals.put("PersonImage", _personimage);
 BA.debugLineNum = 87;BA.debugLine="Dim PersonImage As ImageView : PersonImage.Initia";
Debug.ShouldStop(4194304);
_personimage.runVoidMethod ("Initialize",act_chat.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("PersonImage")));
 BA.debugLineNum = 88;BA.debugLine="Toolbar.AddView(PersonImage,10%x,1%y,8%y,8%y)";
Debug.ShouldStop(8388608);
act_chat.mostCurrent._toolbar.runVoidMethod ("AddView",(Object)((_personimage.getObject())),(Object)(act_chat.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),act_chat.mostCurrent.activityBA)),(Object)(act_chat.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 1)),act_chat.mostCurrent.activityBA)),(Object)(act_chat.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 8)),act_chat.mostCurrent.activityBA)),(Object)(act_chat.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 8)),act_chat.mostCurrent.activityBA)));
 BA.debugLineNum = 89;BA.debugLine="Glide.Load(\"\",imgchat).OptionalCircleCrop.Into(Pe";
Debug.ShouldStop(16777216);
act_chat.mostCurrent._glide.runMethod(false,"Load",act_chat.mostCurrent.activityBA,(Object)(BA.ObjectToString("")),(Object)(act_chat._imgchat)).runMethod(false,"OptionalCircleCrop").runVoidMethod ("Into",(Object)(_personimage));
 BA.debugLineNum = 90;BA.debugLine="Dim PersonName As Label : PersonName.Initialize(\"";
Debug.ShouldStop(33554432);
_personname = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("PersonName", _personname);
 BA.debugLineNum = 90;BA.debugLine="Dim PersonName As Label : PersonName.Initialize(\"";
Debug.ShouldStop(33554432);
_personname.runVoidMethod ("Initialize",act_chat.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("PersonName")));
 BA.debugLineNum = 91;BA.debugLine="Toolbar.AddView(PersonName,20%x+11%y,5dip,42%x,5%";
Debug.ShouldStop(67108864);
act_chat.mostCurrent._toolbar.runVoidMethod ("AddView",(Object)((_personname.getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {act_chat.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 20)),act_chat.mostCurrent.activityBA),act_chat.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 11)),act_chat.mostCurrent.activityBA)}, "+",1, 1)),(Object)(act_chat.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))),(Object)(act_chat.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 42)),act_chat.mostCurrent.activityBA)),(Object)(act_chat.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),act_chat.mostCurrent.activityBA)));
 BA.debugLineNum = 92;BA.debugLine="PersonName.Text = name_chat";
Debug.ShouldStop(134217728);
_personname.runMethod(true,"setText",BA.ObjectToCharSequence(act_chat._name_chat));
 BA.debugLineNum = 93;BA.debugLine="PersonName.Gravity = Gravity.LEFT";
Debug.ShouldStop(268435456);
_personname.runMethod(true,"setGravity",act_chat.mostCurrent.__c.getField(false,"Gravity").getField(true,"LEFT"));
 BA.debugLineNum = 94;BA.debugLine="PersonName.TextColor = 0xFFFAFAFA";
Debug.ShouldStop(536870912);
_personname.runMethod(true,"setTextColor",BA.numberCast(int.class, 0xfffafafa));
 BA.debugLineNum = 95;BA.debugLine="PersonName.TextSize = 18";
Debug.ShouldStop(1073741824);
_personname.runMethod(true,"setTextSize",BA.numberCast(float.class, 18));
 BA.debugLineNum = 96;BA.debugLine="Private Font2 = Typeface.CreateNew(Font,Typeface.";
Debug.ShouldStop(-2147483648);
_font2 = RemoteObject.createNew ("anywheresoftware.b4a.keywords.constants.TypefaceWrapper");
_font2.setObject(act_chat.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"CreateNew",(Object)((act_chat.mostCurrent._font.getObject())),(Object)(act_chat.mostCurrent.__c.getField(false,"Typeface").getField(true,"STYLE_BOLD"))));Debug.locals.put("Font2", _font2);
 BA.debugLineNum = 97;BA.debugLine="PersonName.Typeface = Font2";
Debug.ShouldStop(1);
_personname.runMethod(false,"setTypeface",(_font2.getObject()));
 BA.debugLineNum = 99;BA.debugLine="Status.Initialize(\"Status\")";
Debug.ShouldStop(4);
act_chat.mostCurrent._status.runVoidMethod ("Initialize",act_chat.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Status")));
 BA.debugLineNum = 100;BA.debugLine="Toolbar.AddView(Status,20%x+11%y,5%y,42%x,4%y)";
Debug.ShouldStop(8);
act_chat.mostCurrent._toolbar.runVoidMethod ("AddView",(Object)((act_chat.mostCurrent._status.getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {act_chat.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 20)),act_chat.mostCurrent.activityBA),act_chat.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 11)),act_chat.mostCurrent.activityBA)}, "+",1, 1)),(Object)(act_chat.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),act_chat.mostCurrent.activityBA)),(Object)(act_chat.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 42)),act_chat.mostCurrent.activityBA)),(Object)(act_chat.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 4)),act_chat.mostCurrent.activityBA)));
 BA.debugLineNum = 101;BA.debugLine="Status.Text = \"last seen recently\"";
Debug.ShouldStop(16);
act_chat.mostCurrent._status.runMethod(true,"setText",BA.ObjectToCharSequence("last seen recently"));
 BA.debugLineNum = 102;BA.debugLine="Status.Gravity = Gravity.LEFT";
Debug.ShouldStop(32);
act_chat.mostCurrent._status.runMethod(true,"setGravity",act_chat.mostCurrent.__c.getField(false,"Gravity").getField(true,"LEFT"));
 BA.debugLineNum = 103;BA.debugLine="Status.TextColor = 0xFFFAFAFA";
Debug.ShouldStop(64);
act_chat.mostCurrent._status.runMethod(true,"setTextColor",BA.numberCast(int.class, 0xfffafafa));
 BA.debugLineNum = 104;BA.debugLine="Status.TextSize = 15";
Debug.ShouldStop(128);
act_chat.mostCurrent._status.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 105;BA.debugLine="Status.Typeface = Font";
Debug.ShouldStop(256);
act_chat.mostCurrent._status.runMethod(false,"setTypeface",(act_chat.mostCurrent._font.getObject()));
 BA.debugLineNum = 115;BA.debugLine="Height = 99%y-Toolbar.Height";
Debug.ShouldStop(262144);
act_chat._height = RemoteObject.solve(new RemoteObject[] {act_chat.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 99)),act_chat.mostCurrent.activityBA),act_chat.mostCurrent._toolbar.runMethod(true,"getHeight")}, "-",1, 1);
 BA.debugLineNum = 117;BA.debugLine="LV.Initializer(\"LV\").ListView.ReverseLayout.Build";
Debug.ShouldStop(1048576);
act_chat.mostCurrent._lv.runMethod(false,"Initializer",act_chat.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("LV"))).runMethod(false,"ListView").runMethod(false,"ReverseLayout").runVoidMethod ("Build");
 BA.debugLineNum = 118;BA.debugLine="Activity.AddView(LV,0,Toolbar.Height,100%x,Height";
Debug.ShouldStop(2097152);
act_chat.mostCurrent._activity.runVoidMethod ("AddView",(Object)((act_chat.mostCurrent._lv.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(act_chat.mostCurrent._toolbar.runMethod(true,"getHeight")),(Object)(act_chat.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),act_chat.mostCurrent.activityBA)),(Object)(act_chat._height));
 BA.debugLineNum = 154;BA.debugLine="Activity.SetBackgroundImage(LoadBitmap(File.DirAs";
Debug.ShouldStop(33554432);
act_chat.mostCurrent._activity.runVoidMethod ("SetBackgroundImageNew",(Object)((act_chat.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(act_chat.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("background_hd.jpg"))).getObject())));
 BA.debugLineNum = 156;BA.debugLine="LV.Ripple.Alpha(0).Color(Colors.Transparent)";
Debug.ShouldStop(134217728);
act_chat.mostCurrent._lv.runMethod(false,"Ripple").runMethod(false,"Alpha",(Object)(BA.numberCast(float.class, 0))).runVoidMethod ("Color",(Object)(act_chat.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent")));
 BA.debugLineNum = 158;BA.debugLine="LV.Show";
Debug.ShouldStop(536870912);
act_chat.mostCurrent._lv.runVoidMethodAndSync ("Show");
 BA.debugLineNum = 163;BA.debugLine="Canvas.Initialize(Activity)";
Debug.ShouldStop(4);
act_chat.mostCurrent._canvas.runVoidMethod ("Initialize",(Object)((act_chat.mostCurrent._activity.getObject())));
 BA.debugLineNum = 187;BA.debugLine="telegs.Initialize(\"telegs\")";
Debug.ShouldStop(67108864);
act_chat.mostCurrent._telegs.runVoidMethod ("Initialize",act_chat.processBA,(Object)(RemoteObject.createImmutable("telegs")));
 BA.debugLineNum = 188;BA.debugLine="telegs.getChatHistory(chat_id,0,0,1,False)";
Debug.ShouldStop(134217728);
act_chat.mostCurrent._telegs.runVoidMethod ("getChatHistory",(Object)(BA.numberCast(long.class, act_chat._chat_id)),(Object)(BA.numberCast(long.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 1)),(Object)(act_chat.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 191;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_keypress(RemoteObject _keycode) throws Exception{
try {
		Debug.PushSubsStack("Activity_KeyPress (act_chat) ","act_chat",16,act_chat.mostCurrent.activityBA,act_chat.mostCurrent,865);
if (RapidSub.canDelegate("activity_keypress")) { return com.it.fome.act_chat.remoteMe.runUserSub(false, "act_chat","activity_keypress", _keycode);}
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 865;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
Debug.ShouldStop(1);
 BA.debugLineNum = 866;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_keycode,BA.numberCast(double.class, act_chat.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK")))) { 
 BA.debugLineNum = 874;BA.debugLine="Back_Click";
Debug.ShouldStop(512);
_back_click();
 };
 BA.debugLineNum = 877;BA.debugLine="Return False";
Debug.ShouldStop(4096);
if (true) return act_chat.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 878;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (act_chat) ","act_chat",16,act_chat.mostCurrent.activityBA,act_chat.mostCurrent,794);
if (RapidSub.canDelegate("activity_pause")) { return com.it.fome.act_chat.remoteMe.runUserSub(false, "act_chat","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 794;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 796;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
		Debug.PushSubsStack("Activity_Resume (act_chat) ","act_chat",16,act_chat.mostCurrent.activityBA,act_chat.mostCurrent,790);
if (RapidSub.canDelegate("activity_resume")) { return com.it.fome.act_chat.remoteMe.runUserSub(false, "act_chat","activity_resume");}
 BA.debugLineNum = 790;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 792;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_touch(RemoteObject _action,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("Activity_Touch (act_chat) ","act_chat",16,act_chat.mostCurrent.activityBA,act_chat.mostCurrent,880);
if (RapidSub.canDelegate("activity_touch")) { return com.it.fome.act_chat.remoteMe.runUserSub(false, "act_chat","activity_touch", _action, _x, _y);}
Debug.locals.put("Action", _action);
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
 BA.debugLineNum = 880;BA.debugLine="Sub Activity_Touch (Action As Int, X As Float, Y A";
Debug.ShouldStop(32768);
 BA.debugLineNum = 881;BA.debugLine="If y < 100%y-75.5%x And stp.Top = 100%y-75.5%x Th";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("<",_y,BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {act_chat.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),act_chat.mostCurrent.activityBA),act_chat.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 75.5)),act_chat.mostCurrent.activityBA)}, "-",1, 1))) && RemoteObject.solveBoolean("=",act_chat.mostCurrent._stp.runMethod(true,"getTop"),BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {act_chat.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),act_chat.mostCurrent.activityBA),act_chat.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 75.5)),act_chat.mostCurrent.activityBA)}, "-",1, 1)))) { 
act_chat.mostCurrent._stp.runMethod(true,"setTop",act_chat.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),act_chat.mostCurrent.activityBA));};
 BA.debugLineNum = 882;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _art(RemoteObject _text,RemoteObject _label) throws Exception{
try {
		Debug.PushSubsStack("art (act_chat) ","act_chat",16,act_chat.mostCurrent.activityBA,act_chat.mostCurrent,812);
if (RapidSub.canDelegate("art")) { return com.it.fome.act_chat.remoteMe.runUserSub(false, "act_chat","art", _text, _label);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _before = RemoteObject.createImmutable(0f);
RemoteObject _after = RemoteObject.createImmutable(0f);
Debug.locals.put("Text", _text);
Debug.locals.put("Label", _label);
 BA.debugLineNum = 812;BA.debugLine="Sub art(Text As String, Label As Label) As Float";
Debug.ShouldStop(2048);
 BA.debugLineNum = 813;BA.debugLine="ht = StrUtil.MeasureMultilineTextHeight(Label, T";
Debug.ShouldStop(4096);
act_chat._ht = BA.numberCast(float.class, act_chat.mostCurrent._strutil.runMethod(true,"MeasureMultilineTextHeight",(Object)((_label.getObject())),(Object)(BA.ObjectToCharSequence(_text))));
 BA.debugLineNum = 814;BA.debugLine="Dim JO = Label As JavaObject";
Debug.ShouldStop(8192);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo.setObject(_label.getObject());Debug.locals.put("JO", _jo);
 BA.debugLineNum = 815;BA.debugLine="Dim before = JO.RunMethod(\"getLineHeight\",Null)";
Debug.ShouldStop(16384);
_before = BA.numberCast(float.class, _jo.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getLineHeight")),(Object)((act_chat.mostCurrent.__c.getField(false,"Null")))));Debug.locals.put("before", _before);Debug.locals.put("before", _before);
 BA.debugLineNum = 816;BA.debugLine="JO.RunMethod(\"setLineSpacing\", Array(0.0f,1.0f))";
Debug.ShouldStop(32768);
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setLineSpacing")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {RemoteObject.createImmutable((0.0f)),RemoteObject.createImmutable((1.0f))})));
 BA.debugLineNum = 817;BA.debugLine="Dim after = JO.RunMethod(\"getLineHeight\",Null) *";
Debug.ShouldStop(65536);
_after = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _jo.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getLineHeight")),(Object)((act_chat.mostCurrent.__c.getField(false,"Null"))))),act_chat._ht}, "*",0, 0));Debug.locals.put("after", _after);Debug.locals.put("after", _after);
 BA.debugLineNum = 818;BA.debugLine="Return (after/before)";
Debug.ShouldStop(131072);
if (true) return BA.numberCast(float.class, (RemoteObject.solve(new RemoteObject[] {_after,_before}, "/",0, 0)));
 BA.debugLineNum = 819;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable(0f);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _autoanswer() throws Exception{
try {
		Debug.PushSubsStack("AutoAnswer (act_chat) ","act_chat",16,act_chat.mostCurrent.activityBA,act_chat.mostCurrent,727);
if (RapidSub.canDelegate("autoanswer")) { return com.it.fome.act_chat.remoteMe.runUserSub(false, "act_chat","autoanswer");}
RemoteObject _item = RemoteObject.declareNull("com.it.fome.act_chat._adapter");
RemoteObject _olditem = RemoteObject.declareNull("com.it.fome.act_chat._adapter");
RemoteObject _salam = null;
RemoteObject _khobi = null;
RemoteObject _chetori = null;
RemoteObject _chekhabar = null;
RemoteObject _recycler = null;
 BA.debugLineNum = 727;BA.debugLine="Sub AutoAnswer";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 728;BA.debugLine="Dim Item As Adapter";
Debug.ShouldStop(8388608);
_item = RemoteObject.createNew ("com.it.fome.act_chat._adapter");Debug.locals.put("Item", _item);
 BA.debugLineNum = 729;BA.debugLine="Item.ViewType = Their";
Debug.ShouldStop(16777216);
_item.setField ("ViewType" /*RemoteObject*/ ,act_chat._their);
 BA.debugLineNum = 731;BA.debugLine="Dim OldItem = ItemList.Get(ItemList.Size-1) As Ad";
Debug.ShouldStop(67108864);
_olditem = (act_chat.mostCurrent._itemlist.runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {act_chat.mostCurrent._itemlist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1))));Debug.locals.put("OldItem", _olditem);Debug.locals.put("OldItem", _olditem);
 BA.debugLineNum = 733;BA.debugLine="If (OldItem.MyText.Contains(\"سلام\")) Then";
Debug.ShouldStop(268435456);
if ((_olditem.getField(true,"MyText" /*RemoteObject*/ ).runMethod(true,"contains",(Object)(RemoteObject.createImmutable("سلام")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 734;BA.debugLine="Dim Salam(6) As String = Array As String (\"سلام";
Debug.ShouldStop(536870912);
_salam = RemoteObject.createNewArray("String",new int[] {6},new Object[] {BA.ObjectToString("سلام داداش"),BA.ObjectToString("علیکم السلام اخوی"),BA.ObjectToString("درود"),BA.ObjectToString("سلام و درود"),BA.ObjectToString("سلام رفیق"),RemoteObject.createImmutable("سلام گل پسر")});Debug.locals.put("Salam", _salam);Debug.locals.put("Salam", _salam);
 BA.debugLineNum = 735;BA.debugLine="Item.TheirText = Salam(Rnd(0,6))";
Debug.ShouldStop(1073741824);
_item.setField ("TheirText" /*RemoteObject*/ ,_salam.getArrayElement(true,act_chat.mostCurrent.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 6)))));
 }else 
{ BA.debugLineNum = 736;BA.debugLine="else If (OldItem.MyText.Contains(\"خوبی\")) Then";
Debug.ShouldStop(-2147483648);
if ((_olditem.getField(true,"MyText" /*RemoteObject*/ ).runMethod(true,"contains",(Object)(RemoteObject.createImmutable("خوبی")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 737;BA.debugLine="Dim Khobi(6) As String = Array As String (\"مرسی";
Debug.ShouldStop(1);
_khobi = RemoteObject.createNewArray("String",new int[] {6},new Object[] {BA.ObjectToString("مرسی شما خوبی"),BA.ObjectToString("خوبم ممنون"),BA.ObjectToString("تشکر"),BA.ObjectToString("الحمدلله"),BA.ObjectToString("ای ... بد نیستیم"),RemoteObject.createImmutable("بهله خوبم")});Debug.locals.put("Khobi", _khobi);Debug.locals.put("Khobi", _khobi);
 BA.debugLineNum = 738;BA.debugLine="Item.TheirText = Khobi(Rnd(0,6))";
Debug.ShouldStop(2);
_item.setField ("TheirText" /*RemoteObject*/ ,_khobi.getArrayElement(true,act_chat.mostCurrent.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 6)))));
 }else 
{ BA.debugLineNum = 739;BA.debugLine="else If (OldItem.MyText.Contains(\"چطوری\")) Then";
Debug.ShouldStop(4);
if ((_olditem.getField(true,"MyText" /*RemoteObject*/ ).runMethod(true,"contains",(Object)(RemoteObject.createImmutable("چطوری")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 740;BA.debugLine="Dim Chetori(6) As String = Array As String (\"چطو";
Debug.ShouldStop(8);
_chetori = RemoteObject.createNewArray("String",new int[] {6},new Object[] {BA.ObjectToString("چطورم"),BA.ObjectToString("تو چطوری"),BA.ObjectToString("خوووووووبم 😁"),BA.ObjectToString("I'm Fine 😊"),BA.ObjectToString("عالی"),RemoteObject.createImmutable("خوبه خوب")});Debug.locals.put("Chetori", _chetori);Debug.locals.put("Chetori", _chetori);
 BA.debugLineNum = 741;BA.debugLine="Item.TheirText = Chetori(Rnd(0,6))";
Debug.ShouldStop(16);
_item.setField ("TheirText" /*RemoteObject*/ ,_chetori.getArrayElement(true,act_chat.mostCurrent.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 6)))));
 }else 
{ BA.debugLineNum = 742;BA.debugLine="else If (OldItem.MyText.Contains(\"چه خبر\")) Then";
Debug.ShouldStop(32);
if ((_olditem.getField(true,"MyText" /*RemoteObject*/ ).runMethod(true,"contains",(Object)(RemoteObject.createImmutable("چه خبر")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 743;BA.debugLine="Dim CheKhabar(6) As String = Array As String (\"خ";
Debug.ShouldStop(64);
_chekhabar = RemoteObject.createNewArray("String",new int[] {6},new Object[] {BA.ObjectToString("خبر خاصی نیس"),BA.ObjectToString("سلامتی"),BA.ObjectToString("سلامتی شما چه خبر"),BA.ObjectToString("خبرا دست شماس"),BA.ObjectToString("بی خبر"),RemoteObject.createImmutable("😠 دسته تبر")});Debug.locals.put("CheKhabar", _chekhabar);Debug.locals.put("CheKhabar", _chekhabar);
 BA.debugLineNum = 744;BA.debugLine="Item.TheirText = CheKhabar(Rnd(0,6))";
Debug.ShouldStop(128);
_item.setField ("TheirText" /*RemoteObject*/ ,_chekhabar.getArrayElement(true,act_chat.mostCurrent.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 6)))));
 }else 
{ BA.debugLineNum = 745;BA.debugLine="else If (OldItem.MyText.Contains(\"تست\")) Then";
Debug.ShouldStop(256);
if ((_olditem.getField(true,"MyText" /*RemoteObject*/ ).runMethod(true,"contains",(Object)(RemoteObject.createImmutable("تست")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 746;BA.debugLine="Item.TheirText = \"hello how are you man it is a";
Debug.ShouldStop(512);
_item.setField ("TheirText" /*RemoteObject*/ ,BA.ObjectToString("hello how are you man it is a test message suieiuhello how are you man it is a test message suieiuehf sfs hello how are you man it is a test message suieiuehf sfs hello how are you man it is a test message suieiuehf sfs ehf sfs ofoshduf suhf siuf suiisdfuishfus hf sfusfs ifuish fushfosiuf"));
 }else {
 BA.debugLineNum = 748;BA.debugLine="Dim Recycler(8) As String = Array As String (\"😜";
Debug.ShouldStop(2048);
_recycler = RemoteObject.createNewArray("String",new int[] {8},new Object[] {BA.ObjectToString("😜 این برنامه با هایتکس ریسایکلر ویو درست شده 🙌"),BA.ObjectToString("سازنده : صادق نامنی 😎"),BA.ObjectToString("چه خبر ؟"),BA.ObjectToString("نمیدونم چی میگی"),BA.ObjectToString("Created By Sadeq Nameni 😎"),BA.ObjectToString("Hitexroid 😜"),BA.ObjectToString("hello how are you man it is a test message"),RemoteObject.createImmutable("suieiuehf sfs ofoshduf suhf siuf suiisdfuishfus hf sfusfs ifuish fushfosiuf")});Debug.locals.put("Recycler", _recycler);Debug.locals.put("Recycler", _recycler);
 BA.debugLineNum = 749;BA.debugLine="Item.TheirText = Recycler(Rnd(0,8))";
Debug.ShouldStop(4096);
_item.setField ("TheirText" /*RemoteObject*/ ,_recycler.getArrayElement(true,act_chat.mostCurrent.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 8)))));
 }}}}}
;
 BA.debugLineNum = 751;BA.debugLine="Status.Text = \"online\"";
Debug.ShouldStop(16384);
act_chat.mostCurrent._status.runMethod(true,"setText",BA.ObjectToCharSequence("online"));
 BA.debugLineNum = 752;BA.debugLine="ItemList.Add(Item)";
Debug.ShouldStop(32768);
act_chat.mostCurrent._itemlist.runVoidMethod ("Add",(Object)((_item)));
 BA.debugLineNum = 754;BA.debugLine="tm.Initialize(\"TM\",200)";
Debug.ShouldStop(131072);
act_chat._tm.runVoidMethod ("Initialize",act_chat.processBA,(Object)(BA.ObjectToString("TM")),(Object)(BA.numberCast(long.class, 200)));
 BA.debugLineNum = 755;BA.debugLine="tm.Enabled = True";
Debug.ShouldStop(262144);
act_chat._tm.runMethod(true,"setEnabled",act_chat.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 757;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _autoanswer2() throws Exception{
try {
		Debug.PushSubsStack("AutoAnswer2 (act_chat) ","act_chat",16,act_chat.mostCurrent.activityBA,act_chat.mostCurrent,759);
if (RapidSub.canDelegate("autoanswer2")) { return com.it.fome.act_chat.remoteMe.runUserSub(false, "act_chat","autoanswer2");}
RemoteObject _item = RemoteObject.declareNull("com.it.fome.act_chat._adapter");
 BA.debugLineNum = 759;BA.debugLine="Sub AutoAnswer2";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 760;BA.debugLine="Dim Item As Adapter";
Debug.ShouldStop(8388608);
_item = RemoteObject.createNew ("com.it.fome.act_chat._adapter");Debug.locals.put("Item", _item);
 BA.debugLineNum = 761;BA.debugLine="Item.ViewType = MINEST2";
Debug.ShouldStop(16777216);
_item.setField ("ViewType" /*RemoteObject*/ ,act_chat._minest2);
 BA.debugLineNum = 762;BA.debugLine="ItemList.Add(Item)";
Debug.ShouldStop(33554432);
act_chat.mostCurrent._itemlist.runVoidMethod ("Add",(Object)((_item)));
 BA.debugLineNum = 763;BA.debugLine="LV.notifyItemAdded";
Debug.ShouldStop(67108864);
act_chat.mostCurrent._lv.runVoidMethodAndSync ("notifyItemAdded");
 BA.debugLineNum = 764;BA.debugLine="LV.SmoothScrollToPosition(ItemList.Size)";
Debug.ShouldStop(134217728);
act_chat.mostCurrent._lv.runVoidMethod ("SmoothScrollToPosition",(Object)(act_chat.mostCurrent._itemlist.runMethod(true,"getSize")));
 BA.debugLineNum = 765;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _back_click() throws Exception{
try {
		Debug.PushSubsStack("Back_Click (act_chat) ","act_chat",16,act_chat.mostCurrent.activityBA,act_chat.mostCurrent,784);
if (RapidSub.canDelegate("back_click")) { return com.it.fome.act_chat.remoteMe.runUserSub(false, "act_chat","back_click");}
 BA.debugLineNum = 784;BA.debugLine="Sub Back_Click";
Debug.ShouldStop(32768);
 BA.debugLineNum = 785;BA.debugLine="IME.HideKeyboard";
Debug.ShouldStop(65536);
act_chat.mostCurrent._ime.runVoidMethod ("HideKeyboard",act_chat.mostCurrent.activityBA);
 BA.debugLineNum = 786;BA.debugLine="StartActivity(ac_lchats)";
Debug.ShouldStop(131072);
act_chat.mostCurrent.__c.runVoidMethod ("StartActivity",act_chat.processBA,(Object)((act_chat.mostCurrent._ac_lchats.getObject())));
 BA.debugLineNum = 787;BA.debugLine="Activity.Finish";
Debug.ShouldStop(262144);
act_chat.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 788;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnatt_click() throws Exception{
try {
		Debug.PushSubsStack("Btnatt_Click (act_chat) ","act_chat",16,act_chat.mostCurrent.activityBA,act_chat.mostCurrent,839);
if (RapidSub.canDelegate("btnatt_click")) { return com.it.fome.act_chat.remoteMe.runUserSub(false, "act_chat","btnatt_click");}
 BA.debugLineNum = 839;BA.debugLine="Sub Btnatt_Click";
Debug.ShouldStop(64);
 BA.debugLineNum = 840;BA.debugLine="re.Top = 0";
Debug.ShouldStop(128);
act_chat.mostCurrent._re.runMethod(true,"setTop",BA.numberCast(int.class, 0));
 BA.debugLineNum = 841;BA.debugLine="re.SetColorAnimated(1000,Colors.Transparent,Color";
Debug.ShouldStop(256);
act_chat.mostCurrent._re.runVoidMethod ("SetColorAnimated",(Object)(BA.numberCast(int.class, 1000)),(Object)(act_chat.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent")),(Object)(act_chat.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 80)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)))));
 BA.debugLineNum = 842;BA.debugLine="re.Show3(78.5%x,92.5%y+3.5%x,1000)";
Debug.ShouldStop(512);
act_chat.mostCurrent._re.runVoidMethod ("Show3",(Object)(act_chat.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 78.5)),act_chat.mostCurrent.activityBA)),(Object)(RemoteObject.solve(new RemoteObject[] {act_chat.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 92.5)),act_chat.mostCurrent.activityBA),act_chat.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 3.5)),act_chat.mostCurrent.activityBA)}, "+",1, 1)),(Object)(BA.numberCast(int.class, 1000)));
 BA.debugLineNum = 843;BA.debugLine="Btnatt.Enabled = False";
Debug.ShouldStop(1024);
act_chat.mostCurrent._btnatt.runMethod(true,"setEnabled",act_chat.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 844;BA.debugLine="En";
Debug.ShouldStop(2048);
_en();
 BA.debugLineNum = 845;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnsend_click() throws Exception{
try {
		Debug.PushSubsStack("BtnSend_Click (act_chat) ","act_chat",16,act_chat.mostCurrent.activityBA,act_chat.mostCurrent,692);
if (RapidSub.canDelegate("btnsend_click")) { return com.it.fome.act_chat.remoteMe.runUserSub(false, "act_chat","btnsend_click");}
RemoteObject _item = RemoteObject.declareNull("com.it.fome.act_chat._adapter");
 BA.debugLineNum = 692;BA.debugLine="Sub BtnSend_Click";
Debug.ShouldStop(524288);
 BA.debugLineNum = 693;BA.debugLine="an.InitializeScaleCenter(\"send\",1,1,0.7,0.7,BtnSe";
Debug.ShouldStop(1048576);
act_chat.mostCurrent._an.runVoidMethod ("InitializeScaleCenter",act_chat.mostCurrent.activityBA,(Object)(BA.ObjectToString("send")),(Object)(BA.numberCast(float.class, 1)),(Object)(BA.numberCast(float.class, 1)),(Object)(BA.numberCast(float.class, 0.7)),(Object)(BA.numberCast(float.class, 0.7)),(Object)((act_chat.mostCurrent._btnsend.getObject())));
 BA.debugLineNum = 694;BA.debugLine="an.Duration = 100";
Debug.ShouldStop(2097152);
act_chat.mostCurrent._an.runMethod(true,"setDuration",BA.numberCast(long.class, 100));
 BA.debugLineNum = 695;BA.debugLine="an.RepeatCount = 1";
Debug.ShouldStop(4194304);
act_chat.mostCurrent._an.runMethod(true,"setRepeatCount",BA.numberCast(int.class, 1));
 BA.debugLineNum = 696;BA.debugLine="an.RepeatMode = an.REPEAT_REVERSE";
Debug.ShouldStop(8388608);
act_chat.mostCurrent._an.runMethod(true,"setRepeatMode",act_chat.mostCurrent._an.getField(true,"REPEAT_REVERSE"));
 BA.debugLineNum = 697;BA.debugLine="an.Start(BtnSend)";
Debug.ShouldStop(16777216);
act_chat.mostCurrent._an.runVoidMethod ("Start",(Object)((act_chat.mostCurrent._btnsend.getObject())));
 BA.debugLineNum = 699;BA.debugLine="If EditText.Text <> \"\" Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("!",act_chat.mostCurrent._edittext.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 701;BA.debugLine="Dim Item As Adapter";
Debug.ShouldStop(268435456);
_item = RemoteObject.createNew ("com.it.fome.act_chat._adapter");Debug.locals.put("Item", _item);
 BA.debugLineNum = 702;BA.debugLine="Item.ViewType = MINE";
Debug.ShouldStop(536870912);
_item.setField ("ViewType" /*RemoteObject*/ ,act_chat._mine);
 BA.debugLineNum = 703;BA.debugLine="Item.MyText = EditText.Text";
Debug.ShouldStop(1073741824);
_item.setField ("MyText" /*RemoteObject*/ ,act_chat.mostCurrent._edittext.runMethod(true,"getText"));
 BA.debugLineNum = 705;BA.debugLine="ItemList.Add(Item)";
Debug.ShouldStop(1);
act_chat.mostCurrent._itemlist.runVoidMethod ("Add",(Object)((_item)));
 BA.debugLineNum = 706;BA.debugLine="LV.notifyItemAdded";
Debug.ShouldStop(2);
act_chat.mostCurrent._lv.runVoidMethodAndSync ("notifyItemAdded");
 BA.debugLineNum = 708;BA.debugLine="LV.SmoothScrollToPosition(ItemList.Size)";
Debug.ShouldStop(8);
act_chat.mostCurrent._lv.runVoidMethod ("SmoothScrollToPosition",(Object)(act_chat.mostCurrent._itemlist.runMethod(true,"getSize")));
 BA.debugLineNum = 709;BA.debugLine="Timer.Enabled = True";
Debug.ShouldStop(16);
act_chat._timer.runMethod(true,"setEnabled",act_chat.mostCurrent.__c.getField(true,"True"));
 };
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
public static RemoteObject  _dialog_buttonpressed(RemoteObject _dialog,RemoteObject _action) throws Exception{
try {
		Debug.PushSubsStack("Dialog_ButtonPressed (act_chat) ","act_chat",16,act_chat.mostCurrent.activityBA,act_chat.mostCurrent,1279);
if (RapidSub.canDelegate("dialog_buttonpressed")) { return com.it.fome.act_chat.remoteMe.runUserSub(false, "act_chat","dialog_buttonpressed", _dialog, _action);}
RemoteObject _cm = RemoteObject.createImmutable("");
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _builder = RemoteObject.declareNull("de.amberhome.materialdialogs.MaterialDialogBuilderWrapper");
Debug.locals.put("Dialog", _dialog);
Debug.locals.put("Action", _action);
 BA.debugLineNum = 1279;BA.debugLine="Sub Dialog_ButtonPressed (Dialog As MaterialDialog";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 1280;BA.debugLine="Log(Action)";
Debug.ShouldStop(-2147483648);
act_chat.mostCurrent.__c.runVoidMethod ("LogImpl","622478849",_action,0);
 BA.debugLineNum = 1281;BA.debugLine="Select Action";
Debug.ShouldStop(1);
switch (BA.switchObjectToInt(_action,BA.ObjectToString("POSITIVE"))) {
case 0: {
 BA.debugLineNum = 1284;BA.debugLine="Dim cm As String";
Debug.ShouldStop(8);
_cm = RemoteObject.createImmutable("");Debug.locals.put("cm", _cm);
 BA.debugLineNum = 1285;BA.debugLine="cursor1 = sql1.ExecQuery(\"SELECT * FROM tbl_coi";
Debug.ShouldStop(16);
act_chat._cursor1.setObject(act_chat._sql1.runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM tbl_coin WHERE userid='"),act_chat.mostCurrent._userid_t,RemoteObject.createImmutable("' ")))));
 BA.debugLineNum = 1286;BA.debugLine="Dim i As Int";
Debug.ShouldStop(32);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 1287;BA.debugLine="For i=0 To cursor1.RowCount-1";
Debug.ShouldStop(64);
{
final int step7 = 1;
final int limit7 = RemoteObject.solve(new RemoteObject[] {act_chat._cursor1.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step7 > 0 && _i.<Integer>get().intValue() <= limit7) || (step7 < 0 && _i.<Integer>get().intValue() >= limit7) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step7))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1288;BA.debugLine="cursor1.Position=i";
Debug.ShouldStop(128);
act_chat._cursor1.runMethod(true,"setPosition",_i);
 BA.debugLineNum = 1289;BA.debugLine="cm=cursor1.GetString(\"cm\")";
Debug.ShouldStop(256);
_cm = act_chat._cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("cm")));Debug.locals.put("cm", _cm);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1293;BA.debugLine="Dim Builder As MaterialDialogBuilder";
Debug.ShouldStop(4096);
_builder = RemoteObject.createNew ("de.amberhome.materialdialogs.MaterialDialogBuilderWrapper");Debug.locals.put("Builder", _builder);
 BA.debugLineNum = 1294;BA.debugLine="Builder.Initialize(\"Dialog\")";
Debug.ShouldStop(8192);
_builder.runVoidMethod ("Initialize",act_chat.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Dialog")));
 BA.debugLineNum = 1295;BA.debugLine="Builder.Title(\"سفارش ممبر\")";
Debug.ShouldStop(16384);
_builder.runVoidMethod ("Title",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("سفارش ممبر"))));
 BA.debugLineNum = 1296;BA.debugLine="Builder.Content(\"درحال ثبت سفارش ...\")";
Debug.ShouldStop(32768);
_builder.runVoidMethod ("Content",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("درحال ثبت سفارش ..."))));
 BA.debugLineNum = 1297;BA.debugLine="Builder.Progress(True, 0)";
Debug.ShouldStop(65536);
_builder.runVoidMethod ("Progress",(Object)(act_chat.mostCurrent.__c.getField(true,"True")),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 1298;BA.debugLine="Builder.ProgressIndeterminateStyle(True)";
Debug.ShouldStop(131072);
_builder.runVoidMethod ("ProgressIndeterminateStyle",(Object)(act_chat.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 1299;BA.debugLine="progressDialog = Builder.Show";
Debug.ShouldStop(262144);
act_chat.mostCurrent._progressdialog = _builder.runMethod(false,"Show");
 BA.debugLineNum = 1306;BA.debugLine="If imgchat=\"http://filework.ir/INSTAFOLLOW/api/";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",act_chat._imgchat,BA.ObjectToString("http://filework.ir/INSTAFOLLOW/api/asset/noimage.png"))) { 
 BA.debugLineNum = 1308;BA.debugLine="reqsef(userid_t,\"2\",chat_id,numfinish,msg_id_s";
Debug.ShouldStop(134217728);
_reqsef(act_chat.mostCurrent._userid_t,BA.ObjectToString("2"),act_chat._chat_id,act_chat._numfinish,act_chat.mostCurrent._msg_id_select,act_chat._us_name,_getname_img(act_chat._imgchat));
 }else {
 BA.debugLineNum = 1312;BA.debugLine="upload(imgchat,\"\",\"\",\"\")";
Debug.ShouldStop(-2147483648);
_upload(act_chat._imgchat,BA.ObjectToString(""),BA.ObjectToString(""),RemoteObject.createImmutable(""));
 };
 break; }
}
;
 BA.debugLineNum = 1321;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _dis() throws Exception{
try {
		Debug.PushSubsStack("Dis (act_chat) ","act_chat",16,act_chat.mostCurrent.activityBA,act_chat.mostCurrent,435);
if (RapidSub.canDelegate("dis")) { return com.it.fome.act_chat.remoteMe.runUserSub(false, "act_chat","dis");}
RemoteObject _v = RemoteObject.declareNull("anywheresoftware.b4a.objects.ConcreteViewWrapper");
 BA.debugLineNum = 435;BA.debugLine="Sub Dis";
Debug.ShouldStop(262144);
 BA.debugLineNum = 436;BA.debugLine="For Each V As View In re.Panel.GetAllViewsRecursi";
Debug.ShouldStop(524288);
_v = RemoteObject.createNew ("anywheresoftware.b4a.objects.ConcreteViewWrapper");
{
final RemoteObject group1 = act_chat.mostCurrent._re.runMethod(false,"Panel").runMethod(false,"GetAllViewsRecursive");
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_v.setObject(group1.runMethod(false,"Get",index1));
Debug.locals.put("V", _v);
 BA.debugLineNum = 437;BA.debugLine="V.Enabled = False";
Debug.ShouldStop(1048576);
_v.runMethod(true,"setEnabled",act_chat.mostCurrent.__c.getField(true,"False"));
 }
}Debug.locals.put("V", _v);
;
 BA.debugLineNum = 439;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittext_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditText_TextChanged (act_chat) ","act_chat",16,act_chat.mostCurrent.activityBA,act_chat.mostCurrent,826);
if (RapidSub.canDelegate("edittext_textchanged")) { return com.it.fome.act_chat.remoteMe.runUserSub(false, "act_chat","edittext_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 826;BA.debugLine="Sub EditText_TextChanged (Old As String, New As St";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 827;BA.debugLine="If EditText.Text = \"\" Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",act_chat.mostCurrent._edittext.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 828;BA.debugLine="Btnatt.Visible = True";
Debug.ShouldStop(134217728);
act_chat.mostCurrent._btnatt.runMethod(true,"setVisible",act_chat.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 829;BA.debugLine="Mic.Visible = True";
Debug.ShouldStop(268435456);
act_chat.mostCurrent._mic.runMethod(true,"setVisible",act_chat.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 830;BA.debugLine="BtnSend.Visible = False";
Debug.ShouldStop(536870912);
act_chat.mostCurrent._btnsend.runMethod(true,"setVisible",act_chat.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 832;BA.debugLine="If EditText.Text <> \"\" Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("!",act_chat.mostCurrent._edittext.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 833;BA.debugLine="Btnatt.Visible = False";
Debug.ShouldStop(1);
act_chat.mostCurrent._btnatt.runMethod(true,"setVisible",act_chat.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 834;BA.debugLine="Mic.Visible = False";
Debug.ShouldStop(2);
act_chat.mostCurrent._mic.runMethod(true,"setVisible",act_chat.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 835;BA.debugLine="BtnSend.Visible = True";
Debug.ShouldStop(4);
act_chat.mostCurrent._btnsend.runMethod(true,"setVisible",act_chat.mostCurrent.__c.getField(true,"True"));
 };
 BA.debugLineNum = 837;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _en() throws Exception{
try {
		Debug.PushSubsStack("En (act_chat) ","act_chat",16,act_chat.mostCurrent.activityBA,act_chat.mostCurrent,441);
if (RapidSub.canDelegate("en")) { return com.it.fome.act_chat.remoteMe.runUserSub(false, "act_chat","en");}
RemoteObject _v = RemoteObject.declareNull("anywheresoftware.b4a.objects.ConcreteViewWrapper");
 BA.debugLineNum = 441;BA.debugLine="Sub En";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 442;BA.debugLine="For Each V As View In re.Panel.GetAllViewsRecursi";
Debug.ShouldStop(33554432);
_v = RemoteObject.createNew ("anywheresoftware.b4a.objects.ConcreteViewWrapper");
{
final RemoteObject group1 = act_chat.mostCurrent._re.runMethod(false,"Panel").runMethod(false,"GetAllViewsRecursive");
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_v.setObject(group1.runMethod(false,"Get",index1));
Debug.locals.put("V", _v);
 BA.debugLineNum = 443;BA.debugLine="V.Enabled = True";
Debug.ShouldStop(67108864);
_v.runMethod(true,"setEnabled",act_chat.mostCurrent.__c.getField(true,"True"));
 }
}Debug.locals.put("V", _v);
;
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
public static RemoteObject  _getmore(RemoteObject _msid) throws Exception{
try {
		Debug.PushSubsStack("getmore (act_chat) ","act_chat",16,act_chat.mostCurrent.activityBA,act_chat.mostCurrent,1101);
if (RapidSub.canDelegate("getmore")) { return com.it.fome.act_chat.remoteMe.runUserSub(false, "act_chat","getmore", _msid);}
Debug.locals.put("msid", _msid);
 BA.debugLineNum = 1101;BA.debugLine="Sub getmore(msid As Long)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 1104;BA.debugLine="LogColor(\"get morrrrrrrrrrrrrrrrrrrrrrrrrrrrre \",";
Debug.ShouldStop(32768);
act_chat.mostCurrent.__c.runVoidMethod ("LogImpl","621561347",BA.ObjectToString("get morrrrrrrrrrrrrrrrrrrrrrrrrrrrre "),act_chat.mostCurrent.__c.getField(false,"Colors").getField(true,"Blue"));
 BA.debugLineNum = 1105;BA.debugLine="telegs.getChatHistory(chat_id,msid,-1,50,True)";
Debug.ShouldStop(65536);
act_chat.mostCurrent._telegs.runVoidMethod ("getChatHistory",(Object)(BA.numberCast(long.class, act_chat._chat_id)),(Object)(_msid),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(BA.numberCast(int.class, 50)),(Object)(act_chat.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 1109;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getname_img(RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("getname_img (act_chat) ","act_chat",16,act_chat.mostCurrent.activityBA,act_chat.mostCurrent,1272);
if (RapidSub.canDelegate("getname_img")) { return com.it.fome.act_chat.remoteMe.runUserSub(false, "act_chat","getname_img", _str);}
Debug.locals.put("str", _str);
 BA.debugLineNum = 1272;BA.debugLine="Sub getname_img(str As String) As String";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 1273;BA.debugLine="str=str.SubString2(str.IndexOf(\"profile_photos\"),";
Debug.ShouldStop(16777216);
_str = _str.runMethod(true,"substring",(Object)(_str.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("profile_photos")))),(Object)(_str.runMethod(true,"length")));Debug.locals.put("str", _str);
 BA.debugLineNum = 1274;BA.debugLine="str=str.Replace(\"profile_photos/\",\"\")";
Debug.ShouldStop(33554432);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString("profile_photos/")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("str", _str);
 BA.debugLineNum = 1275;BA.debugLine="Return str";
Debug.ShouldStop(67108864);
if (true) return _str;
 BA.debugLineNum = 1276;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 22;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 23;BA.debugLine="Private telegs As milad_telegramv3";
act_chat.mostCurrent._telegs = RemoteObject.createNew ("com.mili.telegrams.teleg_warp");
 //BA.debugLineNum = 24;BA.debugLine="Private progressDialog As MaterialDialog";
act_chat.mostCurrent._progressdialog = RemoteObject.createNew ("de.amberhome.materialdialogs.MaterialDialogWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Dim upl As UploadRequest";
act_chat.mostCurrent._upl = RemoteObject.createNew ("com.reza.sh.fastnet.UploadRequest");
 //BA.debugLineNum = 27;BA.debugLine="Dim pr As PersianFastNetwork";
act_chat.mostCurrent._pr = RemoteObject.createNew ("com.reza.sh.fastnet.Fastnet");
 //BA.debugLineNum = 29;BA.debugLine="Private LV As Hitex_LayoutView";
act_chat.mostCurrent._lv = RemoteObject.createNew ("wir.hitex.recycler.Hitex_LayoutView");
 //BA.debugLineNum = 30;BA.debugLine="Dim re As Hitex_RevealLayout";
act_chat.mostCurrent._re = RemoteObject.createNew ("ir.hitex.reveallayout.Hitex_RevealLayout");
 //BA.debugLineNum = 31;BA.debugLine="Private EditText As EditText";
act_chat.mostCurrent._edittext = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private BtnSend,Btnatt,Mic,Stic As ImageView";
act_chat.mostCurrent._btnsend = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
act_chat.mostCurrent._btnatt = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
act_chat.mostCurrent._mic = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
act_chat.mostCurrent._stic = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Public ItemList As List";
act_chat.mostCurrent._itemlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 34;BA.debugLine="Type Adapter (ViewType As Int, MyText As String,";
;
 //BA.debugLineNum = 35;BA.debugLine="Private XML As XmlLayoutBuilder";
act_chat.mostCurrent._xml = RemoteObject.createNew ("anywheresoftware.b4a.object.XmlLayoutBuilder");
 //BA.debugLineNum = 36;BA.debugLine="Private AppCompat As AppCompat";
act_chat.mostCurrent._appcompat = RemoteObject.createNew ("de.amberhome.objects.appcompat.AppCompatBase");
 //BA.debugLineNum = 37;BA.debugLine="Private Toolbar As Panel";
act_chat.mostCurrent._toolbar = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Dim Status As Label";
act_chat.mostCurrent._status = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 39;BA.debugLine="Private Height As Int";
act_chat._height = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 40;BA.debugLine="Private Canvas As Canvas";
act_chat.mostCurrent._canvas = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper");
 //BA.debugLineNum = 41;BA.debugLine="Private Font As Typeface";
act_chat.mostCurrent._font = RemoteObject.createNew ("anywheresoftware.b4a.keywords.constants.TypefaceWrapper");
 //BA.debugLineNum = 42;BA.debugLine="Dim SB As StringBuilder";
act_chat.mostCurrent._sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");
 //BA.debugLineNum = 43;BA.debugLine="Private Glide As Hitex_Glide";
act_chat.mostCurrent._glide = RemoteObject.createNew ("com.hitex_glide.Hitex_Glide");
 //BA.debugLineNum = 44;BA.debugLine="Dim Pan As Panel";
act_chat.mostCurrent._pan = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 45;BA.debugLine="Dim StrUtil As StringUtils";
act_chat.mostCurrent._strutil = RemoteObject.createNew ("anywheresoftware.b4a.objects.StringUtils");
 //BA.debugLineNum = 46;BA.debugLine="Dim ht As Float";
act_chat._ht = RemoteObject.createImmutable(0f);
 //BA.debugLineNum = 47;BA.debugLine="Dim an As Animation";
act_chat.mostCurrent._an = RemoteObject.createNew ("anywheresoftware.b4a.objects.AnimationWrapper");
 //BA.debugLineNum = 48;BA.debugLine="Dim IME As IME";
act_chat.mostCurrent._ime = RemoteObject.createNew ("anywheresoftware.b4a.objects.IME");
 //BA.debugLineNum = 49;BA.debugLine="Dim q = 0,q2 = 0 As Int";
act_chat._q = BA.numberCast(int.class, 0);
act_chat._q2 = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 50;BA.debugLine="Dim Top As Int = 100%y-61%x";
act_chat._top = RemoteObject.solve(new RemoteObject[] {act_chat.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),act_chat.mostCurrent.activityBA),act_chat.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 61)),act_chat.mostCurrent.activityBA)}, "-",1, 1);
 //BA.debugLineNum = 51;BA.debugLine="Dim sho = False As Boolean";
act_chat._sho = act_chat.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 53;BA.debugLine="Dim stp As Panel";
act_chat.mostCurrent._stp = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 54;BA.debugLine="Dim username_t ,userid_t As String";
act_chat.mostCurrent._username_t = RemoteObject.createImmutable("");
act_chat.mostCurrent._userid_t = RemoteObject.createImmutable("");
 //BA.debugLineNum = 55;BA.debugLine="Dim msg_id_select As String";
act_chat.mostCurrent._msg_id_select = RemoteObject.createImmutable("");
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _hid_click() throws Exception{
try {
		Debug.PushSubsStack("hid_Click (act_chat) ","act_chat",16,act_chat.mostCurrent.activityBA,act_chat.mostCurrent,428);
if (RapidSub.canDelegate("hid_click")) { return com.it.fome.act_chat.remoteMe.runUserSub(false, "act_chat","hid_click");}
 BA.debugLineNum = 428;BA.debugLine="Sub hid_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 429;BA.debugLine="re.SetColorAnimated(1500,Colors.ARGB(80,0,0,0),Co";
Debug.ShouldStop(4096);
act_chat.mostCurrent._re.runVoidMethod ("SetColorAnimated",(Object)(BA.numberCast(int.class, 1500)),(Object)(act_chat.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 80)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)))),(Object)(act_chat.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent")));
 BA.debugLineNum = 430;BA.debugLine="re.Hide3(78.5%x,92.5%y+3.5%x,400)";
Debug.ShouldStop(8192);
act_chat.mostCurrent._re.runVoidMethod ("Hide3",(Object)(act_chat.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 78.5)),act_chat.mostCurrent.activityBA)),(Object)(RemoteObject.solve(new RemoteObject[] {act_chat.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 92.5)),act_chat.mostCurrent.activityBA),act_chat.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 3.5)),act_chat.mostCurrent.activityBA)}, "+",1, 1)),(Object)(BA.numberCast(int.class, 400)));
 BA.debugLineNum = 431;BA.debugLine="Btnatt.Enabled = True";
Debug.ShouldStop(16384);
act_chat.mostCurrent._btnatt.runMethod(true,"setEnabled",act_chat.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 432;BA.debugLine="Dis";
Debug.ShouldStop(32768);
_dis();
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
public static RemoteObject  _image_click() throws Exception{
try {
		Debug.PushSubsStack("Image_Click (act_chat) ","act_chat",16,act_chat.mostCurrent.activityBA,act_chat.mostCurrent,413);
if (RapidSub.canDelegate("image_click")) { return com.it.fome.act_chat.remoteMe.runUserSub(false, "act_chat","image_click");}
RemoteObject _image = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
int _i = 0;
 BA.debugLineNum = 413;BA.debugLine="Sub Image_Click";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 414;BA.debugLine="Dim Image As ImageView = Sender";
Debug.ShouldStop(536870912);
_image = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
_image.setObject(act_chat.mostCurrent.__c.runMethod(false,"Sender",act_chat.mostCurrent.activityBA));Debug.locals.put("Image", _image);
 BA.debugLineNum = 415;BA.debugLine="For i = 0 To 7";
Debug.ShouldStop(1073741824);
{
final int step2 = 1;
final int limit2 = 7;
_i = 0 ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 416;BA.debugLine="If i = Image.Tag Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_i),BA.numberCast(double.class, _image.runMethod(false,"getTag")))) { 
 BA.debugLineNum = 417;BA.debugLine="If Image.Tag = 7 Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",_image.runMethod(false,"getTag"),RemoteObject.createImmutable((7)))) { 
 BA.debugLineNum = 418;BA.debugLine="hid_Click";
Debug.ShouldStop(2);
_hid_click();
 }else {
 BA.debugLineNum = 420;BA.debugLine="re.Hide3(Image.Left+(Image.Width/2),Top+Image.";
Debug.ShouldStop(8);
act_chat.mostCurrent._re.runVoidMethod ("Hide3",(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_image.runMethod(true,"getLeft"),(RemoteObject.solve(new RemoteObject[] {_image.runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "/",0, 0))}, "+",1, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {act_chat._top,_image.runMethod(true,"getTop"),(RemoteObject.solve(new RemoteObject[] {_image.runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "/",0, 0))}, "++",2, 0))),(Object)(BA.numberCast(int.class, 600)));
 BA.debugLineNum = 421;BA.debugLine="Btnatt.Enabled = True";
Debug.ShouldStop(16);
act_chat.mostCurrent._btnatt.runMethod(true,"setEnabled",act_chat.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 422;BA.debugLine="Dis";
Debug.ShouldStop(32);
_dis();
 };
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 426;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ime_heightchanged(RemoteObject _newheight,RemoteObject _oldheight) throws Exception{
try {
		Debug.PushSubsStack("IME_HeightChanged (act_chat) ","act_chat",16,act_chat.mostCurrent.activityBA,act_chat.mostCurrent,821);
if (RapidSub.canDelegate("ime_heightchanged")) { return com.it.fome.act_chat.remoteMe.runUserSub(false, "act_chat","ime_heightchanged", _newheight, _oldheight);}
Debug.locals.put("NewHeight", _newheight);
Debug.locals.put("OldHeight", _oldheight);
 BA.debugLineNum = 821;BA.debugLine="Sub IME_HeightChanged(NewHeight As Int, OldHeight";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 822;BA.debugLine="Pan.Top = NewHeight - Pan.Height";
Debug.ShouldStop(2097152);
act_chat.mostCurrent._pan.runMethod(true,"setTop",RemoteObject.solve(new RemoteObject[] {_newheight,act_chat.mostCurrent._pan.runMethod(true,"getHeight")}, "-",1, 1));
 BA.debugLineNum = 823;BA.debugLine="LV.Height = NewHeight - 56dip-10%y";
Debug.ShouldStop(4194304);
act_chat.mostCurrent._lv.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {_newheight,act_chat.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 56))),act_chat.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),act_chat.mostCurrent.activityBA)}, "--",2, 1));
 BA.debugLineNum = 824;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lv_getitemcount() throws Exception{
try {
		Debug.PushSubsStack("LV_GetItemCount (act_chat) ","act_chat",16,act_chat.mostCurrent.activityBA,act_chat.mostCurrent,664);
if (RapidSub.canDelegate("lv_getitemcount")) { return com.it.fome.act_chat.remoteMe.runUserSub(false, "act_chat","lv_getitemcount");}
 BA.debugLineNum = 664;BA.debugLine="Sub LV_GetItemCount As Int 								        '💯 Ite";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 665;BA.debugLine="Return ItemList.Size";
Debug.ShouldStop(16777216);
if (true) return act_chat.mostCurrent._itemlist.runMethod(true,"getSize");
 BA.debugLineNum = 666;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lv_getitemviewtype(RemoteObject _position) throws Exception{
try {
		Debug.PushSubsStack("LV_GetItemViewType (act_chat) ","act_chat",16,act_chat.mostCurrent.activityBA,act_chat.mostCurrent,667);
if (RapidSub.canDelegate("lv_getitemviewtype")) { return com.it.fome.act_chat.remoteMe.runUserSub(false, "act_chat","lv_getitemviewtype", _position);}
RemoteObject _item = RemoteObject.declareNull("com.it.fome.act_chat._adapter");
Debug.locals.put("Position", _position);
 BA.debugLineNum = 667;BA.debugLine="Sub LV_GetItemViewType (Position As Int) As Int";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 668;BA.debugLine="Dim Item = ItemList.Get(Position) As Adapter";
Debug.ShouldStop(134217728);
_item = (act_chat.mostCurrent._itemlist.runMethod(false,"Get",(Object)(_position)));Debug.locals.put("Item", _item);Debug.locals.put("Item", _item);
 BA.debugLineNum = 669;BA.debugLine="Return Item.ViewType";
Debug.ShouldStop(268435456);
if (true) return _item.getField(true,"ViewType" /*RemoteObject*/ );
 BA.debugLineNum = 670;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lv_itemclick(RemoteObject _clickeditem,RemoteObject _position) throws Exception{
try {
		Debug.PushSubsStack("LV_ItemClick (act_chat) ","act_chat",16,act_chat.mostCurrent.activityBA,act_chat.mostCurrent,672);
if (RapidSub.canDelegate("lv_itemclick")) { return com.it.fome.act_chat.remoteMe.runUserSub(false, "act_chat","lv_itemclick", _clickeditem, _position);}
RemoteObject _item = RemoteObject.declareNull("com.it.fome.act_chat._adapter");
RemoteObject _str_c = RemoteObject.createImmutable("");
RemoteObject _builder = RemoteObject.declareNull("de.amberhome.materialdialogs.MaterialDialogBuilderWrapper");
Debug.locals.put("ClickedItem", _clickeditem);
Debug.locals.put("Position", _position);
 BA.debugLineNum = 672;BA.debugLine="Sub LV_ItemClick (ClickedItem As Panel, Position A";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 673;BA.debugLine="Dim Item = ItemList.Get(Position) As Adapter";
Debug.ShouldStop(1);
_item = (act_chat.mostCurrent._itemlist.runMethod(false,"Get",(Object)(_position)));Debug.locals.put("Item", _item);Debug.locals.put("Item", _item);
 BA.debugLineNum = 674;BA.debugLine="msg_id_select=Item.msg_id";
Debug.ShouldStop(2);
act_chat.mostCurrent._msg_id_select = _item.getField(true,"msg_id" /*RemoteObject*/ );
 BA.debugLineNum = 675;BA.debugLine="Log(\"msg id : \"&Item.msg_id)";
Debug.ShouldStop(4);
act_chat.mostCurrent.__c.runVoidMethod ("LogImpl","620119555",RemoteObject.concat(RemoteObject.createImmutable("msg id : "),_item.getField(true,"msg_id" /*RemoteObject*/ )),0);
 BA.debugLineNum = 676;BA.debugLine="telegs.Viewmsg(chat_id,Array As Long(Item.msg_id)";
Debug.ShouldStop(8);
act_chat.mostCurrent._telegs.runVoidMethod ("Viewmsg",(Object)(BA.numberCast(long.class, act_chat._chat_id)),(Object)(RemoteObject.createNewArray("long",new int[] {1},new Object[] {BA.numberCast(long.class, _item.getField(true,"msg_id" /*RemoteObject*/ ))})));
 BA.debugLineNum = 677;BA.debugLine="telegs.Getingmsg(chat_id,Array As Long(Item.msg_i";
Debug.ShouldStop(16);
act_chat.mostCurrent._telegs.runVoidMethod ("Getingmsg",(Object)(BA.numberCast(long.class, act_chat._chat_id)),(Object)(RemoteObject.createNewArray("long",new int[] {1},new Object[] {BA.numberCast(long.class, _item.getField(true,"msg_id" /*RemoteObject*/ ))})),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(act_chat._us_name));
 BA.debugLineNum = 678;BA.debugLine="Dim str_c As String";
Debug.ShouldStop(32);
_str_c = RemoteObject.createImmutable("");Debug.locals.put("str_c", _str_c);
 BA.debugLineNum = 679;BA.debugLine="str_c=\"افزایش\"&\" \"&numfinish&\" بازدید\"";
Debug.ShouldStop(64);
_str_c = RemoteObject.concat(RemoteObject.createImmutable("افزایش"),RemoteObject.createImmutable(" "),act_chat._numfinish,RemoteObject.createImmutable(" بازدید"));Debug.locals.put("str_c", _str_c);
 BA.debugLineNum = 680;BA.debugLine="Dim Builder As MaterialDialogBuilder";
Debug.ShouldStop(128);
_builder = RemoteObject.createNew ("de.amberhome.materialdialogs.MaterialDialogBuilderWrapper");Debug.locals.put("Builder", _builder);
 BA.debugLineNum = 681;BA.debugLine="Builder.Initialize(\"Dialog\")";
Debug.ShouldStop(256);
_builder.runVoidMethod ("Initialize",act_chat.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Dialog")));
 BA.debugLineNum = 682;BA.debugLine="Builder.Title(\" سفارش بازدید\")";
Debug.ShouldStop(512);
_builder.runVoidMethod ("Title",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable(" سفارش بازدید"))));
 BA.debugLineNum = 683;BA.debugLine="Builder.Content(str_c)";
Debug.ShouldStop(1024);
_builder.runVoidMethod ("Content",(Object)(BA.ObjectToCharSequence(_str_c)));
 BA.debugLineNum = 684;BA.debugLine="Builder.ItemsCallback";
Debug.ShouldStop(2048);
_builder.runVoidMethod ("ItemsCallback");
 BA.debugLineNum = 685;BA.debugLine="Builder.NegativeText(\"بیخیال\")";
Debug.ShouldStop(4096);
_builder.runVoidMethod ("NegativeText",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("بیخیال"))));
 BA.debugLineNum = 686;BA.debugLine="Builder.PositiveText(\"ثبت سفارش\")";
Debug.ShouldStop(8192);
_builder.runVoidMethod ("PositiveText",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("ثبت سفارش"))));
 BA.debugLineNum = 687;BA.debugLine="Builder.PositiveColor(0xFF522E52)";
Debug.ShouldStop(16384);
_builder.runVoidMethod ("PositiveColor",(Object)(BA.numberCast(int.class, 0xff522e52)));
 BA.debugLineNum = 688;BA.debugLine="Builder.Show";
Debug.ShouldStop(32768);
_builder.runVoidMethod ("Show");
 BA.debugLineNum = 691;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lv_onbindviewholder(RemoteObject _parent,RemoteObject _position) throws Exception{
try {
		Debug.PushSubsStack("LV_onBindViewHolder (act_chat) ","act_chat",16,act_chat.mostCurrent.activityBA,act_chat.mostCurrent,454);
if (RapidSub.canDelegate("lv_onbindviewholder")) { return com.it.fome.act_chat.remoteMe.runUserSub(false, "act_chat","lv_onbindviewholder", _parent, _position);}
RemoteObject _item = RemoteObject.declareNull("com.it.fome.act_chat._adapter");
RemoteObject _pan_s = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _lbl_txt = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _bmp = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _i2 = RemoteObject.createImmutable(0);
RemoteObject _pnl_img = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _img_post = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
RemoteObject _bt = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
Debug.locals.put("Parent", _parent);
Debug.locals.put("Position", _position);
 BA.debugLineNum = 454;BA.debugLine="Sub LV_onBindViewHolder (Parent As Panel, Position";
Debug.ShouldStop(32);
 BA.debugLineNum = 455;BA.debugLine="Dim Item = ItemList.Get(Position) As Adapter";
Debug.ShouldStop(64);
_item = (act_chat.mostCurrent._itemlist.runMethod(false,"Get",(Object)(_position)));Debug.locals.put("Item", _item);Debug.locals.put("Item", _item);
 BA.debugLineNum = 456;BA.debugLine="Parent.Height=0";
Debug.ShouldStop(128);
_parent.runMethod(true,"setHeight",BA.numberCast(int.class, 0));
 BA.debugLineNum = 457;BA.debugLine="Parent.Color=Colors.Transparent";
Debug.ShouldStop(256);
_parent.runVoidMethod ("setColor",act_chat.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 458;BA.debugLine="Parent.RemoveAllViews";
Debug.ShouldStop(512);
_parent.runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 459;BA.debugLine="Select Item.ViewType";
Debug.ShouldStop(1024);
switch (BA.switchObjectToInt(_item.getField(true,"ViewType" /*RemoteObject*/ ),act_chat._mine,act_chat._their,act_chat._minest,act_chat._minest2,act_chat._videome)) {
case 0: {
 BA.debugLineNum = 462;BA.debugLine="LogColor(\"msg me\",Colors.Red)";
Debug.ShouldStop(8192);
act_chat.mostCurrent.__c.runVoidMethod ("LogImpl","619922952",BA.ObjectToString("msg me"),act_chat.mostCurrent.__c.getField(false,"Colors").getField(true,"Red"));
 BA.debugLineNum = 463;BA.debugLine="Dim Pan_s As Panel:Pan_s.Initialize(\"Pan_s\")";
Debug.ShouldStop(16384);
_pan_s = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("Pan_s", _pan_s);
 BA.debugLineNum = 463;BA.debugLine="Dim Pan_s As Panel:Pan_s.Initialize(\"Pan_s\")";
Debug.ShouldStop(16384);
_pan_s.runVoidMethod ("Initialize",act_chat.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Pan_s")));
 BA.debugLineNum = 464;BA.debugLine="Pan_s.Color=Colors.Transparent";
Debug.ShouldStop(32768);
_pan_s.runVoidMethod ("setColor",act_chat.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 465;BA.debugLine="Parent.AddView(Pan_s,0,1%x,Parent.Width,-2)";
Debug.ShouldStop(65536);
_parent.runVoidMethod ("AddView",(Object)((_pan_s.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(act_chat.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 1)),act_chat.mostCurrent.activityBA)),(Object)(_parent.runMethod(true,"getWidth")),(Object)(BA.numberCast(int.class, -(double) (0 + 2))));
 BA.debugLineNum = 467;BA.debugLine="Dim lbl_txt As Label";
Debug.ShouldStop(262144);
_lbl_txt = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl_txt", _lbl_txt);
 BA.debugLineNum = 468;BA.debugLine="lbl_txt.Initialize(\"lbl_txt\")";
Debug.ShouldStop(524288);
_lbl_txt.runVoidMethod ("Initialize",act_chat.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("lbl_txt")));
 BA.debugLineNum = 469;BA.debugLine="lbl_txt.TextColor = Colors.Black : lbl_txt.Text";
Debug.ShouldStop(1048576);
_lbl_txt.runMethod(true,"setTextColor",act_chat.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 469;BA.debugLine="lbl_txt.TextColor = Colors.Black : lbl_txt.Text";
Debug.ShouldStop(1048576);
_lbl_txt.runMethod(true,"setTextSize",BA.numberCast(float.class, 18));
 BA.debugLineNum = 470;BA.debugLine="lbl_txt.Typeface=Typeface.DEFAULT";
Debug.ShouldStop(2097152);
_lbl_txt.runMethod(false,"setTypeface",act_chat.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 471;BA.debugLine="Pan_s.AddView(lbl_txt,5dip,5dip,70%x,-2)";
Debug.ShouldStop(4194304);
_pan_s.runVoidMethod ("AddView",(Object)((_lbl_txt.getObject())),(Object)(act_chat.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))),(Object)(act_chat.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))),(Object)(act_chat.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 70)),act_chat.mostCurrent.activityBA)),(Object)(BA.numberCast(int.class, -(double) (0 + 2))));
 BA.debugLineNum = 475;BA.debugLine="SetNinePatchDrawable(lbl_txt, \"msging\")";
Debug.ShouldStop(67108864);
_setninepatchdrawable(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), _lbl_txt.getObject()),RemoteObject.createImmutable("msging"));
 BA.debugLineNum = 477;BA.debugLine="lbl_txt.Text=\" \"&Item.MyText";
Debug.ShouldStop(268435456);
_lbl_txt.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable(" "),_item.getField(true,"MyText" /*RemoteObject*/ ))));
 BA.debugLineNum = 481;BA.debugLine="Dim Canvas As Canvas";
Debug.ShouldStop(1);
act_chat.mostCurrent._canvas = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper");
 BA.debugLineNum = 482;BA.debugLine="Dim bmp As Bitmap";
Debug.ShouldStop(2);
_bmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 483;BA.debugLine="bmp.InitializeMutable(1dip,1dip)";
Debug.ShouldStop(4);
_bmp.runVoidMethod ("InitializeMutable",(Object)(act_chat.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))),(Object)(act_chat.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))));
 BA.debugLineNum = 484;BA.debugLine="Canvas.Initialize2(bmp)";
Debug.ShouldStop(8);
act_chat.mostCurrent._canvas.runVoidMethod ("Initialize2",(Object)((_bmp.getObject())));
 BA.debugLineNum = 486;BA.debugLine="Dim i As Int = Canvas.MeasureStringWidth(Item.M";
Debug.ShouldStop(32);
_i = BA.numberCast(int.class, act_chat.mostCurrent._canvas.runMethod(true,"MeasureStringWidth",(Object)(_item.getField(true,"MyText" /*RemoteObject*/ )),(Object)((act_chat.mostCurrent._font.getObject())),(Object)(BA.numberCast(float.class, 16.0f))));Debug.locals.put("i", _i);Debug.locals.put("i", _i);
 BA.debugLineNum = 488;BA.debugLine="DateTime.TimeFormat = \"HH:mm\"";
Debug.ShouldStop(128);
act_chat.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setTimeFormat",BA.ObjectToString("HH:mm"));
 BA.debugLineNum = 491;BA.debugLine="If (i > 80%x) Then";
Debug.ShouldStop(1024);
if ((RemoteObject.solveBoolean(">",_i,BA.numberCast(double.class, act_chat.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 80)),act_chat.mostCurrent.activityBA))))) { 
 BA.debugLineNum = 492;BA.debugLine="lbl_txt.Width = 90%x";
Debug.ShouldStop(2048);
_lbl_txt.runMethod(true,"setWidth",act_chat.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 90)),act_chat.mostCurrent.activityBA));
 BA.debugLineNum = 493;BA.debugLine="lbl_txt.Left = 5%x";
Debug.ShouldStop(4096);
_lbl_txt.runMethod(true,"setLeft",act_chat.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),act_chat.mostCurrent.activityBA));
 }else {
 BA.debugLineNum = 495;BA.debugLine="lbl_txt.Width = i + 38dip";
Debug.ShouldStop(16384);
_lbl_txt.runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {_i,act_chat.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 38)))}, "+",1, 1));
 BA.debugLineNum = 496;BA.debugLine="If lbl_txt.Width > 90%x Then lbl_txt.Width = 9";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean(">",_lbl_txt.runMethod(true,"getWidth"),BA.numberCast(double.class, act_chat.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 90)),act_chat.mostCurrent.activityBA)))) { 
_lbl_txt.runMethod(true,"setWidth",act_chat.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 90)),act_chat.mostCurrent.activityBA));};
 BA.debugLineNum = 497;BA.debugLine="lbl_txt.Left = (95%x - lbl_txt.Width)";
Debug.ShouldStop(65536);
_lbl_txt.runMethod(true,"setLeft",(RemoteObject.solve(new RemoteObject[] {act_chat.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 95)),act_chat.mostCurrent.activityBA),_lbl_txt.runMethod(true,"getWidth")}, "-",1, 1)));
 };
 BA.debugLineNum = 500;BA.debugLine="lbl_txt.Height = art(Item.MyText,lbl_txt)+10dip";
Debug.ShouldStop(524288);
_lbl_txt.runMethod(true,"setHeight",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_art(_item.getField(true,"MyText" /*RemoteObject*/ ),_lbl_txt),act_chat.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10))),act_chat.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 2)),act_chat.mostCurrent.activityBA)}, "++",2, 0)));
 BA.debugLineNum = 501;BA.debugLine="Parent.Height = lbl_txt.Height+2.5%y";
Debug.ShouldStop(1048576);
_parent.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {_lbl_txt.runMethod(true,"getHeight"),act_chat.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 2.5)),act_chat.mostCurrent.activityBA)}, "+",1, 1));
 break; }
case 1: {
 BA.debugLineNum = 506;BA.debugLine="Dim Pan_s As Panel:Pan_s.Initialize(\"Pan_s\")";
Debug.ShouldStop(33554432);
_pan_s = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("Pan_s", _pan_s);
 BA.debugLineNum = 506;BA.debugLine="Dim Pan_s As Panel:Pan_s.Initialize(\"Pan_s\")";
Debug.ShouldStop(33554432);
_pan_s.runVoidMethod ("Initialize",act_chat.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Pan_s")));
 BA.debugLineNum = 507;BA.debugLine="Pan_s.Color=Colors.Transparent";
Debug.ShouldStop(67108864);
_pan_s.runVoidMethod ("setColor",act_chat.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 508;BA.debugLine="Parent.AddView(Pan_s,0,1%x,Parent.Width,-2)";
Debug.ShouldStop(134217728);
_parent.runVoidMethod ("AddView",(Object)((_pan_s.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(act_chat.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 1)),act_chat.mostCurrent.activityBA)),(Object)(_parent.runMethod(true,"getWidth")),(Object)(BA.numberCast(int.class, -(double) (0 + 2))));
 BA.debugLineNum = 510;BA.debugLine="Dim lbl_txt As Label";
Debug.ShouldStop(536870912);
_lbl_txt = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl_txt", _lbl_txt);
 BA.debugLineNum = 511;BA.debugLine="lbl_txt.Initialize(\"lbl_txt\")";
Debug.ShouldStop(1073741824);
_lbl_txt.runVoidMethod ("Initialize",act_chat.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("lbl_txt")));
 BA.debugLineNum = 512;BA.debugLine="lbl_txt.TextColor = Colors.Black : lbl_txt.Text";
Debug.ShouldStop(-2147483648);
_lbl_txt.runMethod(true,"setTextColor",act_chat.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 512;BA.debugLine="lbl_txt.TextColor = Colors.Black : lbl_txt.Text";
Debug.ShouldStop(-2147483648);
_lbl_txt.runMethod(true,"setTextSize",BA.numberCast(float.class, 18));
 BA.debugLineNum = 513;BA.debugLine="lbl_txt.Typeface=Typeface.DEFAULT";
Debug.ShouldStop(1);
_lbl_txt.runMethod(false,"setTypeface",act_chat.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 514;BA.debugLine="Pan_s.AddView(lbl_txt,5dip,5dip,10%x,-2)";
Debug.ShouldStop(2);
_pan_s.runVoidMethod ("AddView",(Object)((_lbl_txt.getObject())),(Object)(act_chat.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))),(Object)(act_chat.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))),(Object)(act_chat.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),act_chat.mostCurrent.activityBA)),(Object)(BA.numberCast(int.class, -(double) (0 + 2))));
 BA.debugLineNum = 517;BA.debugLine="SetNinePatchDrawable(lbl_txt, \"msg_in_7_9\")";
Debug.ShouldStop(16);
_setninepatchdrawable(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), _lbl_txt.getObject()),RemoteObject.createImmutable("msg_in_7_9"));
 BA.debugLineNum = 521;BA.debugLine="Dim Canvas As Canvas";
Debug.ShouldStop(256);
act_chat.mostCurrent._canvas = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper");
 BA.debugLineNum = 522;BA.debugLine="Dim bmp As Bitmap";
Debug.ShouldStop(512);
_bmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 523;BA.debugLine="bmp.InitializeMutable(1dip,1dip)";
Debug.ShouldStop(1024);
_bmp.runVoidMethod ("InitializeMutable",(Object)(act_chat.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))),(Object)(act_chat.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))));
 BA.debugLineNum = 524;BA.debugLine="Canvas.Initialize2(bmp)";
Debug.ShouldStop(2048);
act_chat.mostCurrent._canvas.runVoidMethod ("Initialize2",(Object)((_bmp.getObject())));
 BA.debugLineNum = 525;BA.debugLine="Dim i2 As Int = Canvas.MeasureStringWidth(Item.";
Debug.ShouldStop(4096);
_i2 = BA.numberCast(int.class, act_chat.mostCurrent._canvas.runMethod(true,"MeasureStringWidth",(Object)(_item.getField(true,"TheirText" /*RemoteObject*/ )),(Object)((act_chat.mostCurrent._font.getObject())),(Object)(BA.numberCast(float.class, 20.0f))));Debug.locals.put("i2", _i2);Debug.locals.put("i2", _i2);
 BA.debugLineNum = 526;BA.debugLine="lbl_txt.Text = \"    \"&Item.TheirText";
Debug.ShouldStop(8192);
_lbl_txt.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("    "),_item.getField(true,"TheirText" /*RemoteObject*/ ))));
 BA.debugLineNum = 528;BA.debugLine="DateTime.TimeFormat = \"HH:mm\"";
Debug.ShouldStop(32768);
act_chat.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setTimeFormat",BA.ObjectToString("HH:mm"));
 BA.debugLineNum = 531;BA.debugLine="If (i2 > 80%x) Then";
Debug.ShouldStop(262144);
if ((RemoteObject.solveBoolean(">",_i2,BA.numberCast(double.class, act_chat.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 80)),act_chat.mostCurrent.activityBA))))) { 
 BA.debugLineNum = 532;BA.debugLine="lbl_txt.Width = 95%x";
Debug.ShouldStop(524288);
_lbl_txt.runMethod(true,"setWidth",act_chat.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 95)),act_chat.mostCurrent.activityBA));
 BA.debugLineNum = 533;BA.debugLine="lbl_txt.Left = 1%x";
Debug.ShouldStop(1048576);
_lbl_txt.runMethod(true,"setLeft",act_chat.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 1)),act_chat.mostCurrent.activityBA));
 }else {
 BA.debugLineNum = 535;BA.debugLine="lbl_txt.Width = i2 + 40dip";
Debug.ShouldStop(4194304);
_lbl_txt.runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {_i2,act_chat.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))}, "+",1, 1));
 BA.debugLineNum = 536;BA.debugLine="If lbl_txt.Width > 90%x Then lbl_txt.Width = 9";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean(">",_lbl_txt.runMethod(true,"getWidth"),BA.numberCast(double.class, act_chat.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 90)),act_chat.mostCurrent.activityBA)))) { 
_lbl_txt.runMethod(true,"setWidth",act_chat.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 95)),act_chat.mostCurrent.activityBA));};
 BA.debugLineNum = 537;BA.debugLine="lbl_txt.Left = 1%x";
Debug.ShouldStop(16777216);
_lbl_txt.runMethod(true,"setLeft",act_chat.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 1)),act_chat.mostCurrent.activityBA));
 };
 BA.debugLineNum = 540;BA.debugLine="lbl_txt.Height = art(Item.TheirText,lbl_txt)+10";
Debug.ShouldStop(134217728);
_lbl_txt.runMethod(true,"setHeight",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_art(_item.getField(true,"TheirText" /*RemoteObject*/ ),_lbl_txt),act_chat.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10))),act_chat.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 2)),act_chat.mostCurrent.activityBA)}, "++",2, 0)));
 BA.debugLineNum = 541;BA.debugLine="Parent.Height = lbl_txt.Height+2.5%y";
Debug.ShouldStop(268435456);
_parent.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {_lbl_txt.runMethod(true,"getHeight"),act_chat.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 2.5)),act_chat.mostCurrent.activityBA)}, "+",1, 1));
 break; }
case 2: {
 BA.debugLineNum = 545;BA.debugLine="LogColor(\"img\",Colors.Red)";
Debug.ShouldStop(1);
act_chat.mostCurrent.__c.runVoidMethod ("LogImpl","619923035",BA.ObjectToString("img"),act_chat.mostCurrent.__c.getField(false,"Colors").getField(true,"Red"));
 BA.debugLineNum = 546;BA.debugLine="Dim Pan_s As Panel:Pan_s.Initialize(\"Pan_s\")";
Debug.ShouldStop(2);
_pan_s = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("Pan_s", _pan_s);
 BA.debugLineNum = 546;BA.debugLine="Dim Pan_s As Panel:Pan_s.Initialize(\"Pan_s\")";
Debug.ShouldStop(2);
_pan_s.runVoidMethod ("Initialize",act_chat.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Pan_s")));
 BA.debugLineNum = 547;BA.debugLine="Pan_s.Color=Colors.Transparent";
Debug.ShouldStop(4);
_pan_s.runVoidMethod ("setColor",act_chat.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 548;BA.debugLine="Parent.AddView(Pan_s,3%x,1%x,Parent.Width-15%x,";
Debug.ShouldStop(8);
_parent.runVoidMethod ("AddView",(Object)((_pan_s.getObject())),(Object)(act_chat.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 3)),act_chat.mostCurrent.activityBA)),(Object)(act_chat.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 1)),act_chat.mostCurrent.activityBA)),(Object)(RemoteObject.solve(new RemoteObject[] {_parent.runMethod(true,"getWidth"),act_chat.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),act_chat.mostCurrent.activityBA)}, "-",1, 1)),(Object)(BA.numberCast(int.class, -(double) (0 + 2))));
 BA.debugLineNum = 550;BA.debugLine="Dim pnl_img As Panel";
Debug.ShouldStop(32);
_pnl_img = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("pnl_img", _pnl_img);
 BA.debugLineNum = 551;BA.debugLine="pnl_img.Initialize(\"pnl_img\")";
Debug.ShouldStop(64);
_pnl_img.runVoidMethod ("Initialize",act_chat.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("pnl_img")));
 BA.debugLineNum = 552;BA.debugLine="pnl_img.Color=Colors.White";
Debug.ShouldStop(128);
_pnl_img.runVoidMethod ("setColor",act_chat.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 553;BA.debugLine="Pan_s.AddView(pnl_img,2dip,2dip,-2,1dip)";
Debug.ShouldStop(256);
_pan_s.runVoidMethod ("AddView",(Object)((_pnl_img.getObject())),(Object)(act_chat.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))),(Object)(act_chat.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))),(Object)(BA.numberCast(int.class, -(double) (0 + 2))),(Object)(act_chat.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))));
 BA.debugLineNum = 555;BA.debugLine="Dim img_post As ImageView";
Debug.ShouldStop(1024);
_img_post = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");Debug.locals.put("img_post", _img_post);
 BA.debugLineNum = 556;BA.debugLine="img_post.Initialize(\"img_post\")";
Debug.ShouldStop(2048);
_img_post.runVoidMethod ("Initialize",act_chat.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("img_post")));
 BA.debugLineNum = 557;BA.debugLine="img_post.Gravity=Gravity.FILL";
Debug.ShouldStop(4096);
_img_post.runMethod(true,"setGravity",act_chat.mostCurrent.__c.getField(false,"Gravity").getField(true,"FILL"));
 BA.debugLineNum = 558;BA.debugLine="pnl_img.AddView(img_post,0,0,-2,-2)";
Debug.ShouldStop(8192);
_pnl_img.runVoidMethod ("AddView",(Object)((_img_post.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, -(double) (0 + 2))),(Object)(BA.numberCast(int.class, -(double) (0 + 2))));
 BA.debugLineNum = 560;BA.debugLine="Dim lbl_txt As Label";
Debug.ShouldStop(32768);
_lbl_txt = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl_txt", _lbl_txt);
 BA.debugLineNum = 561;BA.debugLine="lbl_txt.Initialize(\"lbl_txt\")";
Debug.ShouldStop(65536);
_lbl_txt.runVoidMethod ("Initialize",act_chat.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("lbl_txt")));
 BA.debugLineNum = 562;BA.debugLine="lbl_txt.TextColor = Colors.Black : lbl_txt.Text";
Debug.ShouldStop(131072);
_lbl_txt.runMethod(true,"setTextColor",act_chat.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 562;BA.debugLine="lbl_txt.TextColor = Colors.Black : lbl_txt.Text";
Debug.ShouldStop(131072);
_lbl_txt.runMethod(true,"setTextSize",BA.numberCast(float.class, 18));
 BA.debugLineNum = 563;BA.debugLine="lbl_txt.Typeface=Typeface.DEFAULT";
Debug.ShouldStop(262144);
_lbl_txt.runMethod(false,"setTypeface",act_chat.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 564;BA.debugLine="pnl_img.AddView(lbl_txt,5dip,img_post.Top+img_p";
Debug.ShouldStop(524288);
_pnl_img.runVoidMethod ("AddView",(Object)((_lbl_txt.getObject())),(Object)(act_chat.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))),(Object)(RemoteObject.solve(new RemoteObject[] {_img_post.runMethod(true,"getTop"),_img_post.runMethod(true,"getHeight"),act_chat.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 4)),act_chat.mostCurrent.activityBA)}, "++",2, 1)),(Object)(BA.numberCast(int.class, -(double) (0 + 2))),(Object)(BA.numberCast(int.class, -(double) (0 + 2))));
 BA.debugLineNum = 566;BA.debugLine="SetNinePatchDrawable(pnl_img, \"msg_in_2_photo_9";
Debug.ShouldStop(2097152);
_setninepatchdrawable(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), _pnl_img.getObject()),RemoteObject.createImmutable("msg_in_2_photo_9"));
 BA.debugLineNum = 568;BA.debugLine="If Item.img_isdwonload=\"true\" Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",_item.getField(true,"img_isdwonload" /*RemoteObject*/ ),BA.ObjectToString("true"))) { 
 BA.debugLineNum = 570;BA.debugLine="img_post.Bitmap = LoadBitmap(\"\",Item.img_my)";
Debug.ShouldStop(33554432);
_img_post.runMethod(false,"setBitmap",(act_chat.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(BA.ObjectToString("")),(Object)(_item.getField(true,"img_my" /*RemoteObject*/ ))).getObject()));
 BA.debugLineNum = 572;BA.debugLine="Log(\"img : \"&Item.img_my)";
Debug.ShouldStop(134217728);
act_chat.mostCurrent.__c.runVoidMethod ("LogImpl","619923062",RemoteObject.concat(RemoteObject.createImmutable("img : "),_item.getField(true,"img_my" /*RemoteObject*/ )),0);
 BA.debugLineNum = 573;BA.debugLine="Log(\"img dl : \"&Item.img_isdwonload)";
Debug.ShouldStop(268435456);
act_chat.mostCurrent.__c.runVoidMethod ("LogImpl","619923063",RemoteObject.concat(RemoteObject.createImmutable("img dl : "),_item.getField(true,"img_isdwonload" /*RemoteObject*/ )),0);
 BA.debugLineNum = 574;BA.debugLine="Dim bt As Bitmap";
Debug.ShouldStop(536870912);
_bt = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("bt", _bt);
 BA.debugLineNum = 575;BA.debugLine="bt.Initialize(\"\",Item.img_my)";
Debug.ShouldStop(1073741824);
_bt.runVoidMethod ("Initialize",(Object)(BA.ObjectToString("")),(Object)(_item.getField(true,"img_my" /*RemoteObject*/ )));
 BA.debugLineNum = 576;BA.debugLine="Log(bt.Scale)";
Debug.ShouldStop(-2147483648);
act_chat.mostCurrent.__c.runVoidMethod ("LogImpl","619923066",BA.NumberToString(_bt.runMethod(true,"getScale")),0);
 BA.debugLineNum = 581;BA.debugLine="If bt.Width>90%x Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean(">",_bt.runMethod(true,"getWidth"),BA.numberCast(double.class, act_chat.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 90)),act_chat.mostCurrent.activityBA)))) { 
 BA.debugLineNum = 582;BA.debugLine="pnl_img.Width=70%x";
Debug.ShouldStop(32);
_pnl_img.runMethod(true,"setWidth",act_chat.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 70)),act_chat.mostCurrent.activityBA));
 }else {
 BA.debugLineNum = 585;BA.debugLine="pnl_img.Width=bt.Width/1.5";
Debug.ShouldStop(256);
_pnl_img.runMethod(true,"setWidth",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_bt.runMethod(true,"getWidth"),RemoteObject.createImmutable(1.5)}, "/",0, 0)));
 };
 BA.debugLineNum = 589;BA.debugLine="pnl_img.Height=bt.Height/1.5";
Debug.ShouldStop(4096);
_pnl_img.runMethod(true,"setHeight",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_bt.runMethod(true,"getHeight"),RemoteObject.createImmutable(1.5)}, "/",0, 0)));
 BA.debugLineNum = 590;BA.debugLine="img_post.SetLayout(1%x,1%x,pnl_img.Width-2%x,p";
Debug.ShouldStop(8192);
_img_post.runVoidMethod ("SetLayout",(Object)(act_chat.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 1)),act_chat.mostCurrent.activityBA)),(Object)(act_chat.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 1)),act_chat.mostCurrent.activityBA)),(Object)(RemoteObject.solve(new RemoteObject[] {_pnl_img.runMethod(true,"getWidth"),act_chat.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),act_chat.mostCurrent.activityBA)}, "-",1, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {_pnl_img.runMethod(true,"getHeight"),act_chat.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),act_chat.mostCurrent.activityBA)}, "-",1, 1)));
 }else {
 BA.debugLineNum = 594;BA.debugLine="Glide.Load(File.DirAssets,\"lazyloader.gif\").Fi";
Debug.ShouldStop(131072);
act_chat.mostCurrent._glide.runMethod(false,"Load",act_chat.mostCurrent.activityBA,(Object)(act_chat.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("lazyloader.gif"))).runMethod(false,"FitCenter").runVoidMethod ("Into",(Object)(_img_post));
 BA.debugLineNum = 595;BA.debugLine="pnl_img.Width=40%x";
Debug.ShouldStop(262144);
_pnl_img.runMethod(true,"setWidth",act_chat.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 40)),act_chat.mostCurrent.activityBA));
 BA.debugLineNum = 596;BA.debugLine="pnl_img.Height=40%x";
Debug.ShouldStop(524288);
_pnl_img.runMethod(true,"setHeight",act_chat.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 40)),act_chat.mostCurrent.activityBA));
 BA.debugLineNum = 597;BA.debugLine="LogColor(\"img nist $ download\",Colors.Green)";
Debug.ShouldStop(1048576);
act_chat.mostCurrent.__c.runVoidMethod ("LogImpl","619923087",BA.ObjectToString("img nist $ download"),act_chat.mostCurrent.__c.getField(false,"Colors").getField(true,"Green"));
 BA.debugLineNum = 598;BA.debugLine="telegs.downloadFile(Item.img_id)";
Debug.ShouldStop(2097152);
act_chat.mostCurrent._telegs.runVoidMethod ("downloadFile",(Object)(BA.numberCast(int.class, _item.getField(true,"img_id" /*RemoteObject*/ ))));
 BA.debugLineNum = 599;BA.debugLine="list_dl=Position";
Debug.ShouldStop(4194304);
act_chat._list_dl = BA.NumberToString(_position);
 };
 BA.debugLineNum = 602;BA.debugLine="If Item.caption_topmsg.Length>0 Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean(">",_item.getField(true,"caption_topmsg" /*RemoteObject*/ ).runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 604;BA.debugLine="Log(\"caption : \"&Item.caption_topmsg)";
Debug.ShouldStop(134217728);
act_chat.mostCurrent.__c.runVoidMethod ("LogImpl","619923094",RemoteObject.concat(RemoteObject.createImmutable("caption : "),_item.getField(true,"caption_topmsg" /*RemoteObject*/ )),0);
 BA.debugLineNum = 606;BA.debugLine="Dim Canvas As Canvas";
Debug.ShouldStop(536870912);
act_chat.mostCurrent._canvas = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper");
 BA.debugLineNum = 607;BA.debugLine="Dim bmp As Bitmap";
Debug.ShouldStop(1073741824);
_bmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 608;BA.debugLine="bmp.InitializeMutable(1dip,1dip)";
Debug.ShouldStop(-2147483648);
_bmp.runVoidMethod ("InitializeMutable",(Object)(act_chat.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))),(Object)(act_chat.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))));
 BA.debugLineNum = 609;BA.debugLine="Canvas.Initialize2(bmp)";
Debug.ShouldStop(1);
act_chat.mostCurrent._canvas.runVoidMethod ("Initialize2",(Object)((_bmp.getObject())));
 BA.debugLineNum = 610;BA.debugLine="Dim i2 As Int = Canvas.MeasureStringWidth(Item";
Debug.ShouldStop(2);
_i2 = BA.numberCast(int.class, act_chat.mostCurrent._canvas.runMethod(true,"MeasureStringWidth",(Object)(_item.getField(true,"caption_topmsg" /*RemoteObject*/ )),(Object)((act_chat.mostCurrent._font.getObject())),(Object)(BA.numberCast(float.class, 16.0f))));Debug.locals.put("i2", _i2);Debug.locals.put("i2", _i2);
 BA.debugLineNum = 611;BA.debugLine="lbl_txt.Text = Item.caption_topmsg";
Debug.ShouldStop(4);
_lbl_txt.runMethod(true,"setText",BA.ObjectToCharSequence(_item.getField(true,"caption_topmsg" /*RemoteObject*/ )));
 BA.debugLineNum = 613;BA.debugLine="DateTime.TimeFormat = \"HH:mm\"";
Debug.ShouldStop(16);
act_chat.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setTimeFormat",BA.ObjectToString("HH:mm"));
 BA.debugLineNum = 616;BA.debugLine="If (i2 > pnl_img.Width) Then";
Debug.ShouldStop(128);
if ((RemoteObject.solveBoolean(">",_i2,BA.numberCast(double.class, _pnl_img.runMethod(true,"getWidth"))))) { 
 BA.debugLineNum = 617;BA.debugLine="lbl_txt.Width = pnl_img.Width-5%x";
Debug.ShouldStop(256);
_lbl_txt.runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {_pnl_img.runMethod(true,"getWidth"),act_chat.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),act_chat.mostCurrent.activityBA)}, "-",1, 1));
 BA.debugLineNum = 618;BA.debugLine="lbl_txt.Left = 0";
Debug.ShouldStop(512);
_lbl_txt.runMethod(true,"setLeft",BA.numberCast(int.class, 0));
 }else {
 BA.debugLineNum = 620;BA.debugLine="lbl_txt.Width = pnl_img.Height-5%x";
Debug.ShouldStop(2048);
_lbl_txt.runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {_pnl_img.runMethod(true,"getHeight"),act_chat.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),act_chat.mostCurrent.activityBA)}, "-",1, 1));
 BA.debugLineNum = 621;BA.debugLine="If lbl_txt.Width > pnl_img.Width-5%x Then lbl";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean(">",_lbl_txt.runMethod(true,"getWidth"),BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_pnl_img.runMethod(true,"getWidth"),act_chat.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),act_chat.mostCurrent.activityBA)}, "-",1, 1)))) { 
_lbl_txt.runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {_pnl_img.runMethod(true,"getWidth"),act_chat.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),act_chat.mostCurrent.activityBA)}, "-",1, 1));};
 BA.debugLineNum = 622;BA.debugLine="lbl_txt.Left = 0";
Debug.ShouldStop(8192);
_lbl_txt.runMethod(true,"setLeft",BA.numberCast(int.class, 0));
 };
 BA.debugLineNum = 624;BA.debugLine="lbl_txt.Top=pnl_img.Height+4dip";
Debug.ShouldStop(32768);
_lbl_txt.runMethod(true,"setTop",RemoteObject.solve(new RemoteObject[] {_pnl_img.runMethod(true,"getHeight"),act_chat.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4)))}, "+",1, 1));
 BA.debugLineNum = 625;BA.debugLine="lbl_txt.Height = art(Item.caption_topmsg,lbl_t";
Debug.ShouldStop(65536);
_lbl_txt.runMethod(true,"setHeight",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_art(_item.getField(true,"caption_topmsg" /*RemoteObject*/ ),_lbl_txt),act_chat.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10))),act_chat.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 2)),act_chat.mostCurrent.activityBA)}, "++",2, 0)));
 BA.debugLineNum = 626;BA.debugLine="pnl_img.Height=pnl_img.Height+lbl_txt.Height";
Debug.ShouldStop(131072);
_pnl_img.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {_pnl_img.runMethod(true,"getHeight"),_lbl_txt.runMethod(true,"getHeight")}, "+",1, 1));
 };
 BA.debugLineNum = 632;BA.debugLine="Parent.Height = pnl_img.Height+2.5%y";
Debug.ShouldStop(8388608);
_parent.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {_pnl_img.runMethod(true,"getHeight"),act_chat.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 2.5)),act_chat.mostCurrent.activityBA)}, "+",1, 1));
 break; }
case 3: {
 BA.debugLineNum = 646;BA.debugLine="LogColor(\"img oter\",Colors.Red)";
Debug.ShouldStop(32);
act_chat.mostCurrent.__c.runVoidMethod ("LogImpl","619923136",BA.ObjectToString("img oter"),act_chat.mostCurrent.__c.getField(false,"Colors").getField(true,"Red"));
 break; }
case 4: {
 break; }
}
;
 BA.debugLineNum = 653;BA.debugLine="an.InitializeScaleCenter(\"\",1,1,1,1,Parent)";
Debug.ShouldStop(4096);
act_chat.mostCurrent._an.runVoidMethod ("InitializeScaleCenter",act_chat.mostCurrent.activityBA,(Object)(BA.ObjectToString("")),(Object)(BA.numberCast(float.class, 1)),(Object)(BA.numberCast(float.class, 1)),(Object)(BA.numberCast(float.class, 1)),(Object)(BA.numberCast(float.class, 1)),(Object)((_parent.getObject())));
 BA.debugLineNum = 654;BA.debugLine="an.Duration = 50";
Debug.ShouldStop(8192);
act_chat.mostCurrent._an.runMethod(true,"setDuration",BA.numberCast(long.class, 50));
 BA.debugLineNum = 655;BA.debugLine="an.Start(Parent)";
Debug.ShouldStop(16384);
act_chat.mostCurrent._an.runVoidMethod ("Start",(Object)((_parent.getObject())));
 BA.debugLineNum = 656;BA.debugLine="Log(\"posi : \"&Position&\" msg id \"&Item.msg_id)";
Debug.ShouldStop(32768);
act_chat.mostCurrent.__c.runVoidMethod ("LogImpl","619923146",RemoteObject.concat(RemoteObject.createImmutable("posi : "),_position,RemoteObject.createImmutable(" msg id "),_item.getField(true,"msg_id" /*RemoteObject*/ )),0);
 BA.debugLineNum = 657;BA.debugLine="If Position=ItemList.Size-10 Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_position,BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {act_chat.mostCurrent._itemlist.runMethod(true,"getSize"),RemoteObject.createImmutable(10)}, "-",1, 1)))) { 
 BA.debugLineNum = 658;BA.debugLine="LogColor(\"get more \",Colors.Blue)";
Debug.ShouldStop(131072);
act_chat.mostCurrent.__c.runVoidMethod ("LogImpl","619923148",BA.ObjectToString("get more "),act_chat.mostCurrent.__c.getField(false,"Colors").getField(true,"Blue"));
 BA.debugLineNum = 659;BA.debugLine="getmore(Item.msg_id)";
Debug.ShouldStop(262144);
_getmore(BA.numberCast(long.class, _item.getField(true,"msg_id" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 663;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
		Debug.PushSubsStack("LV_onCreateViewHolder (act_chat) ","act_chat",16,act_chat.mostCurrent.activityBA,act_chat.mostCurrent,447);
if (RapidSub.canDelegate("lv_oncreateviewholder")) { return com.it.fome.act_chat.remoteMe.runUserSub(false, "act_chat","lv_oncreateviewholder", _parent, _viewtype);}
Debug.locals.put("Parent", _parent);
Debug.locals.put("ViewType", _viewtype);
 BA.debugLineNum = 447;BA.debugLine="Sub LV_onCreateViewHolder (Parent As Panel, ViewTy";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 453;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mipost_newcoins(RemoteObject _newstr) throws Exception{
try {
		Debug.PushSubsStack("mipost_newcoins (act_chat) ","act_chat",16,act_chat.mostCurrent.activityBA,act_chat.mostCurrent,1261);
if (RapidSub.canDelegate("mipost_newcoins")) { return com.it.fome.act_chat.remoteMe.runUserSub(false, "act_chat","mipost_newcoins", _newstr);}
Debug.locals.put("newstr", _newstr);
 BA.debugLineNum = 1261;BA.debugLine="Sub mipost_newcoins(newstr As String)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 1270;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pr_onjsonobjectuploaderror(RemoteObject _error,RemoteObject _tag) throws Exception{
try {
		Debug.PushSubsStack("pr_onJSONObjectUploadError (act_chat) ","act_chat",16,act_chat.mostCurrent.activityBA,act_chat.mostCurrent,1174);
if (RapidSub.canDelegate("pr_onjsonobjectuploaderror")) { return com.it.fome.act_chat.remoteMe.runUserSub(false, "act_chat","pr_onjsonobjectuploaderror", _error, _tag);}
Debug.locals.put("Error", _error);
Debug.locals.put("Tag", _tag);
 BA.debugLineNum = 1174;BA.debugLine="Sub pr_onJSONObjectUploadError(Error As ResponseEr";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 1175;BA.debugLine="Log(Error.ErrorLocalizedMsage)";
Debug.ShouldStop(4194304);
act_chat.mostCurrent.__c.runVoidMethod ("LogImpl","622020097",_error.runMethod(true,"getErrorLocalizedMsage"),0);
 BA.debugLineNum = 1176;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pr_onjsonobjectuploadok(RemoteObject _jsonstring,RemoteObject _tag) throws Exception{
try {
		Debug.PushSubsStack("pr_onJSONObjectUploadOK (act_chat) ","act_chat",16,act_chat.mostCurrent.activityBA,act_chat.mostCurrent,1158);
if (RapidSub.canDelegate("pr_onjsonobjectuploadok")) { return com.it.fome.act_chat.remoteMe.runUserSub(false, "act_chat","pr_onjsonobjectuploadok", _jsonstring, _tag);}
Debug.locals.put("JsonString", _jsonstring);
Debug.locals.put("Tag", _tag);
 BA.debugLineNum = 1158;BA.debugLine="Sub pr_onJSONObjectUploadOK(JsonString As String ,";
Debug.ShouldStop(32);
 BA.debugLineNum = 1159;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(64);
act_chat.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 1160;BA.debugLine="If JsonString<>Null Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("N",_jsonstring)) { 
 };
 BA.debugLineNum = 1172;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pr_onstringuploaderror(RemoteObject _error,RemoteObject _tag) throws Exception{
try {
		Debug.PushSubsStack("pr_onStringUploadError (act_chat) ","act_chat",16,act_chat.mostCurrent.activityBA,act_chat.mostCurrent,1138);
if (RapidSub.canDelegate("pr_onstringuploaderror")) { return com.it.fome.act_chat.remoteMe.runUserSub(false, "act_chat","pr_onstringuploaderror", _error, _tag);}
Debug.locals.put("Error", _error);
Debug.locals.put("Tag", _tag);
 BA.debugLineNum = 1138;BA.debugLine="Sub pr_onStringUploadError(Error As ResponseError";
Debug.ShouldStop(131072);
 BA.debugLineNum = 1139;BA.debugLine="Log(Error.ErrorLocalizedMsage)";
Debug.ShouldStop(262144);
act_chat.mostCurrent.__c.runVoidMethod ("LogImpl","621823489",_error.runMethod(true,"getErrorLocalizedMsage"),0);
 BA.debugLineNum = 1141;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pr_onstringuploadok(RemoteObject _response,RemoteObject _tag) throws Exception{
try {
		Debug.PushSubsStack("pr_onStringUploadOK (act_chat) ","act_chat",16,act_chat.mostCurrent.activityBA,act_chat.mostCurrent,1143);
if (RapidSub.canDelegate("pr_onstringuploadok")) { return com.it.fome.act_chat.remoteMe.runUserSub(false, "act_chat","pr_onstringuploadok", _response, _tag);}
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _statusss = RemoteObject.createImmutable("");
Debug.locals.put("response", _response);
Debug.locals.put("Tag", _tag);
 BA.debugLineNum = 1143;BA.debugLine="Sub pr_onStringUploadOK(response As String  , Tag";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 1144;BA.debugLine="Log(response)";
Debug.ShouldStop(8388608);
act_chat.mostCurrent.__c.runVoidMethod ("LogImpl","621889025",_response,0);
 BA.debugLineNum = 1145;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(16777216);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 1146;BA.debugLine="parser.Initialize(response)";
Debug.ShouldStop(33554432);
_parser.runVoidMethod ("Initialize",(Object)(_response));
 BA.debugLineNum = 1147;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(67108864);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 1148;BA.debugLine="Dim Statusss As String = root.Get(\"status\")";
Debug.ShouldStop(134217728);
_statusss = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("status")))));Debug.locals.put("Statusss", _statusss);Debug.locals.put("Statusss", _statusss);
 BA.debugLineNum = 1150;BA.debugLine="If  Statusss=\"ok\" Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_statusss,BA.ObjectToString("ok"))) { 
 BA.debugLineNum = 1151;BA.debugLine="reqsef(userid_t,\"2\",chat_id,numfinish,msg_id_sel";
Debug.ShouldStop(1073741824);
_reqsef(act_chat.mostCurrent._userid_t,BA.ObjectToString("2"),act_chat._chat_id,act_chat._numfinish,act_chat.mostCurrent._msg_id_select,act_chat._us_name,_getname_img(act_chat._imgchat));
 }else {
 BA.debugLineNum = 1154;BA.debugLine="ToastMessageShow(\"خطا\",False)";
Debug.ShouldStop(2);
act_chat.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("خطا")),(Object)(act_chat.mostCurrent.__c.getField(true,"False")));
 };
 BA.debugLineNum = 1156;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pr_onuploadprogress(RemoteObject _uploaded,RemoteObject _total,RemoteObject _tag) throws Exception{
try {
		Debug.PushSubsStack("pr_onUploadProgress (act_chat) ","act_chat",16,act_chat.mostCurrent.activityBA,act_chat.mostCurrent,1178);
if (RapidSub.canDelegate("pr_onuploadprogress")) { return com.it.fome.act_chat.remoteMe.runUserSub(false, "act_chat","pr_onuploadprogress", _uploaded, _total, _tag);}
Debug.locals.put("uploaded", _uploaded);
Debug.locals.put("total", _total);
Debug.locals.put("Tag", _tag);
 BA.debugLineNum = 1178;BA.debugLine="Sub pr_onUploadProgress(uploaded As Long,total As";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 1179;BA.debugLine="Log((uploaded/total))";
Debug.ShouldStop(67108864);
act_chat.mostCurrent.__c.runVoidMethod ("LogImpl","622085633",BA.NumberToString((RemoteObject.solve(new RemoteObject[] {_uploaded,_total}, "/",0, 0))),0);
 BA.debugLineNum = 1180;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
		Debug.PushSubsStack("prfn_onPostStringErrorListener (act_chat) ","act_chat",16,act_chat.mostCurrent.activityBA,act_chat.mostCurrent,1213);
if (RapidSub.canDelegate("prfn_onpoststringerrorlistener")) { return com.it.fome.act_chat.remoteMe.runUserSub(false, "act_chat","prfn_onpoststringerrorlistener", _error, _tag);}
Debug.locals.put("Error", _error);
Debug.locals.put("Tag", _tag);
 BA.debugLineNum = 1213;BA.debugLine="Sub prfn_onPostStringErrorListener(Error As Respon";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 1215;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(1073741824);
act_chat.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 1216;BA.debugLine="Log(\"errror\")";
Debug.ShouldStop(-2147483648);
act_chat.mostCurrent.__c.runVoidMethod ("LogImpl","622216707",RemoteObject.createImmutable("errror"),0);
 BA.debugLineNum = 1217;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
		Debug.PushSubsStack("prfn_onPostStringOkListener (act_chat) ","act_chat",16,act_chat.mostCurrent.activityBA,act_chat.mostCurrent,1219);
if (RapidSub.canDelegate("prfn_onpoststringoklistener")) { return com.it.fome.act_chat.remoteMe.runUserSub(false, "act_chat","prfn_onpoststringoklistener", _result, _tag);}
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
RemoteObject _mtoasst = RemoteObject.declareNull("com.valdesekamdem.library.mdtoast.MaterialToast");
Debug.locals.put("Tag", _tag);
 BA.debugLineNum = 1219;BA.debugLine="Sub prfn_onPostStringOkListener(Result As String";
Debug.ShouldStop(4);
 BA.debugLineNum = 1221;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(16);
act_chat.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 1222;BA.debugLine="Log(Result)";
Debug.ShouldStop(32);
act_chat.mostCurrent.__c.runVoidMethod ("LogImpl","622282243",_result,0);
 BA.debugLineNum = 1224;BA.debugLine="Select Tag";
Debug.ShouldStop(128);
switch (BA.switchObjectToInt(_tag,BA.ObjectToString("sefss"))) {
case 0: {
 BA.debugLineNum = 1226;BA.debugLine="If Result.Contains(\"error_code\")=True Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_result.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("error_code"))),act_chat.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 1227;BA.debugLine="ToastMessageShow(\"ثبت سفارش ناموفق بود :)\",Fal";
Debug.ShouldStop(1024);
act_chat.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("ثبت سفارش ناموفق بود :)")),(Object)(act_chat.mostCurrent.__c.getField(true,"False")));
 }else {
 BA.debugLineNum = 1229;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(4096);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 1230;BA.debugLine="parser.Initialize(Result)";
Debug.ShouldStop(8192);
_parser.runVoidMethod ("Initialize",(Object)(_result));
 BA.debugLineNum = 1231;BA.debugLine="Dim root As List = parser.NextArray";
Debug.ShouldStop(16384);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_root = _parser.runMethod(false,"NextArray");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 1232;BA.debugLine="For Each colroot As Map In root";
Debug.ShouldStop(32768);
_colroot = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group11 = _root;
final int groupLen11 = group11.runMethod(true,"getSize").<Integer>get()
;int index11 = 0;
;
for (; index11 < groupLen11;index11++){
_colroot.setObject(group11.runMethod(false,"Get",index11));
Debug.locals.put("colroot", _colroot);
 BA.debugLineNum = 1233;BA.debugLine="Dim Result As String = colroot.Get(\"result\")";
Debug.ShouldStop(65536);
_result = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("result")))));Debug.locals.put("Result", _result);Debug.locals.put("Result", _result);
 BA.debugLineNum = 1234;BA.debugLine="Dim c_m As String = colroot.Get(\"c_m\")";
Debug.ShouldStop(131072);
_c_m = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("c_m")))));Debug.locals.put("c_m", _c_m);Debug.locals.put("c_m", _c_m);
 BA.debugLineNum = 1235;BA.debugLine="Dim uid As String = colroot.Get(\"uid\")";
Debug.ShouldStop(262144);
_uid = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("uid")))));Debug.locals.put("uid", _uid);Debug.locals.put("uid", _uid);
 BA.debugLineNum = 1236;BA.debugLine="Dim first_last As String = colroot.Get(\"first";
Debug.ShouldStop(524288);
_first_last = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("first_last")))));Debug.locals.put("first_last", _first_last);Debug.locals.put("first_last", _first_last);
 BA.debugLineNum = 1237;BA.debugLine="Dim id As String = colroot.Get(\"id\")";
Debug.ShouldStop(1048576);
_id = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 1238;BA.debugLine="Dim userid As String = colroot.Get(\"userid\")";
Debug.ShouldStop(2097152);
_userid = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("userid")))));Debug.locals.put("userid", _userid);Debug.locals.put("userid", _userid);
 BA.debugLineNum = 1239;BA.debugLine="Dim username As String = colroot.Get(\"usernam";
Debug.ShouldStop(4194304);
_username = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("username")))));Debug.locals.put("username", _username);Debug.locals.put("username", _username);
 BA.debugLineNum = 1240;BA.debugLine="Dim c_ch As String = colroot.Get(\"c_ch\")";
Debug.ShouldStop(8388608);
_c_ch = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("c_ch")))));Debug.locals.put("c_ch", _c_ch);Debug.locals.put("c_ch", _c_ch);
 BA.debugLineNum = 1242;BA.debugLine="sql1.ExecNonQuery(\"UPDATE tbl_coin set cm='\"&";
Debug.ShouldStop(33554432);
act_chat._sql1.runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE tbl_coin set cm='"),_c_m,RemoteObject.createImmutable("',cf='"),_c_ch,RemoteObject.createImmutable("' WHERE userid='"),act_chat.mostCurrent._userid_t,RemoteObject.createImmutable("' "))));
 }
}Debug.locals.put("colroot", _colroot);
;
 BA.debugLineNum = 1250;BA.debugLine="progressDialog.Hide";
Debug.ShouldStop(2);
act_chat.mostCurrent._progressdialog.runVoidMethod ("Hide");
 BA.debugLineNum = 1252;BA.debugLine="Dim mtoasst As KJ_MaterialToast";
Debug.ShouldStop(8);
_mtoasst = RemoteObject.createNew ("com.valdesekamdem.library.mdtoast.MaterialToast");Debug.locals.put("mtoasst", _mtoasst);
 BA.debugLineNum = 1253;BA.debugLine="mtoasst.Initialize(\"سفارش با موفقیت ثبت شد\",mt";
Debug.ShouldStop(16);
_mtoasst.runVoidMethod ("Initialize",act_chat.mostCurrent.activityBA,(Object)(BA.ObjectToString("سفارش با موفقیت ثبت شد")),(Object)(_mtoasst.getField(true,"LENGTH_SHORT")),(Object)(_mtoasst.getField(true,"TYPE_SUCCESS")));
 };
 break; }
}
;
 BA.debugLineNum = 1259;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
 //BA.debugLineNum = 8;BA.debugLine="Dim Timer,Timer2,tm As Timer";
act_chat._timer = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");
act_chat._timer2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");
act_chat._tm = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");
 //BA.debugLineNum = 9;BA.debugLine="Public MINE = 0, Their = 1,MINEST = 2,MINEST2 = 3";
act_chat._mine = BA.numberCast(int.class, 0);
act_chat._their = BA.numberCast(int.class, 1);
act_chat._minest = BA.numberCast(int.class, 2);
act_chat._minest2 = BA.numberCast(int.class, 3);
act_chat._videome = BA.numberCast(int.class, 4);
act_chat._videothire = BA.numberCast(int.class, 5);
 //BA.debugLineNum = 10;BA.debugLine="Public IMAGENAME As String";
act_chat._imagename = RemoteObject.createImmutable("");
 //BA.debugLineNum = 11;BA.debugLine="Public NAME As String";
act_chat._name = RemoteObject.createImmutable("");
 //BA.debugLineNum = 12;BA.debugLine="Dim msg() As String";
act_chat._msg = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});
 //BA.debugLineNum = 14;BA.debugLine="Dim name_chat ,chat_id,numcoins,numfinish,channel";
act_chat._name_chat = RemoteObject.createImmutable("");
act_chat._chat_id = RemoteObject.createImmutable("");
act_chat._numcoins = RemoteObject.createImmutable("");
act_chat._numfinish = RemoteObject.createImmutable("");
act_chat._channelid = RemoteObject.createImmutable("");
act_chat._imgchat = RemoteObject.createImmutable("");
 //BA.debugLineNum = 15;BA.debugLine="Dim list_dl As String";
act_chat._list_dl = RemoteObject.createImmutable("");
 //BA.debugLineNum = 17;BA.debugLine="Private sql1 As SQL";
act_chat._sql1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL");
 //BA.debugLineNum = 18;BA.debugLine="Private cursor1 As Cursor";
act_chat._cursor1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Dim us_name As String";
act_chat._us_name = RemoteObject.createImmutable("");
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _re_onparentchanged(RemoteObject _shown) throws Exception{
try {
		Debug.PushSubsStack("RE_onParentChanged (act_chat) ","act_chat",16,act_chat.mostCurrent.activityBA,act_chat.mostCurrent,858);
if (RapidSub.canDelegate("re_onparentchanged")) { return com.it.fome.act_chat.remoteMe.runUserSub(false, "act_chat","re_onparentchanged", _shown);}
Debug.locals.put("Shown", _shown);
 BA.debugLineNum = 858;BA.debugLine="Sub RE_onParentChanged (Shown As Boolean)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 859;BA.debugLine="sho = Shown";
Debug.ShouldStop(67108864);
act_chat._sho = _shown;
 BA.debugLineNum = 860;BA.debugLine="If sho = False Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",act_chat._sho,act_chat.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 861;BA.debugLine="re.Top = 100%y";
Debug.ShouldStop(268435456);
act_chat.mostCurrent._re.runMethod(true,"setTop",act_chat.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),act_chat.mostCurrent.activityBA));
 };
 BA.debugLineNum = 863;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _re_touch(RemoteObject _action,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("Re_Touch (act_chat) ","act_chat",16,act_chat.mostCurrent.activityBA,act_chat.mostCurrent,847);
if (RapidSub.canDelegate("re_touch")) { return com.it.fome.act_chat.remoteMe.runUserSub(false, "act_chat","re_touch", _action, _x, _y);}
Debug.locals.put("Action", _action);
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
 BA.debugLineNum = 847;BA.debugLine="Sub Re_Touch (Action As Int, X As Float, Y As Floa";
Debug.ShouldStop(16384);
 BA.debugLineNum = 848;BA.debugLine="If sho = False Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",act_chat._sho,act_chat.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 849;BA.debugLine="If x > 75%x And X < 82%x And y > Btnatt.Top+90%y";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean(">",_x,BA.numberCast(double.class, act_chat.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 75)),act_chat.mostCurrent.activityBA))) && RemoteObject.solveBoolean("<",_x,BA.numberCast(double.class, act_chat.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 82)),act_chat.mostCurrent.activityBA))) && RemoteObject.solveBoolean(">",_y,BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {act_chat.mostCurrent._btnatt.runMethod(true,"getTop"),act_chat.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 90)),act_chat.mostCurrent.activityBA)}, "+",1, 1))) && RemoteObject.solveBoolean("<",_y,BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {act_chat.mostCurrent._btnatt.runMethod(true,"getTop"),act_chat.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 90)),act_chat.mostCurrent.activityBA),act_chat.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 7)),act_chat.mostCurrent.activityBA)}, "++",2, 1)))) { 
_btnatt_click();};
 };
 BA.debugLineNum = 852;BA.debugLine="If sho Then";
Debug.ShouldStop(524288);
if (act_chat._sho.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 853;BA.debugLine="If Y < Top And Action = re.Panel.ACTION_UP Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("<",_y,BA.numberCast(double.class, act_chat._top)) && RemoteObject.solveBoolean("=",_action,BA.numberCast(double.class, act_chat.mostCurrent._re.runMethod(false,"Panel").getField(true,"ACTION_UP")))) { 
_hid_click();};
 };
 BA.debugLineNum = 856;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _reload() throws Exception{
try {
		Debug.PushSubsStack("REload (act_chat) ","act_chat",16,act_chat.mostCurrent.activityBA,act_chat.mostCurrent,334);
if (RapidSub.canDelegate("reload")) { return com.it.fome.act_chat.remoteMe.runUserSub(false, "act_chat","reload");}
RemoteObject _img = null;
RemoteObject _limg = null;
RemoteObject _names = null;
RemoteObject _mleft = RemoteObject.createImmutable(0);
RemoteObject _mtop = RemoteObject.createImmutable(0);
RemoteObject _mtop2 = RemoteObject.createImmutable(0);
int _i = 0;
 BA.debugLineNum = 334;BA.debugLine="Sub REload";
Debug.ShouldStop(8192);
 BA.debugLineNum = 335;BA.debugLine="Dim img(8) As ImageView : Dim Limg(8) As Label";
Debug.ShouldStop(16384);
_img = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.ImageViewWrapper", new int[] {8}, new Object[]{});Debug.locals.put("img", _img);
 BA.debugLineNum = 335;BA.debugLine="Dim img(8) As ImageView : Dim Limg(8) As Label";
Debug.ShouldStop(16384);
_limg = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.LabelWrapper", new int[] {8}, new Object[]{});Debug.locals.put("Limg", _limg);
 BA.debugLineNum = 336;BA.debugLine="Dim Names() As String = Array As String(\"Camera\",";
Debug.ShouldStop(32768);
_names = RemoteObject.createNewArray("String",new int[] {8},new Object[] {BA.ObjectToString("Camera"),BA.ObjectToString("Gallery"),BA.ObjectToString("Video"),BA.ObjectToString("Music"),BA.ObjectToString("File"),BA.ObjectToString("Contact"),BA.ObjectToString("Location"),RemoteObject.createImmutable("")});Debug.locals.put("Names", _names);Debug.locals.put("Names", _names);
 BA.debugLineNum = 337;BA.debugLine="Dim mLeft = 4%x, mTop = 4%x,mTop2 = 24%x As Int";
Debug.ShouldStop(65536);
_mleft = act_chat.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 4)),act_chat.mostCurrent.activityBA);Debug.locals.put("mLeft", _mleft);Debug.locals.put("mLeft", _mleft);
_mtop = act_chat.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 4)),act_chat.mostCurrent.activityBA);Debug.locals.put("mTop", _mtop);Debug.locals.put("mTop", _mtop);
_mtop2 = act_chat.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 24)),act_chat.mostCurrent.activityBA);Debug.locals.put("mTop2", _mtop2);Debug.locals.put("mTop2", _mtop2);
 BA.debugLineNum = 339;BA.debugLine="For i = 0 To img.Length-1";
Debug.ShouldStop(262144);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {_img.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 340;BA.debugLine="img(i).Initialize(\"Image\")";
Debug.ShouldStop(524288);
_img.getArrayElement(false,BA.numberCast(int.class, _i)).runVoidMethod ("Initialize",act_chat.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Image")));
 BA.debugLineNum = 341;BA.debugLine="img(i).Bitmap = LoadBitmap(File.DirAssets,i & \".";
Debug.ShouldStop(1048576);
_img.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(false,"setBitmap",(act_chat.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(act_chat.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.concat(RemoteObject.createImmutable(_i),RemoteObject.createImmutable(".png")))).getObject()));
 BA.debugLineNum = 342;BA.debugLine="img(i).Gravity = Gravity.FILL : img(i).Tag = i";
Debug.ShouldStop(2097152);
_img.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"setGravity",act_chat.mostCurrent.__c.getField(false,"Gravity").getField(true,"FILL"));
 BA.debugLineNum = 342;BA.debugLine="img(i).Gravity = Gravity.FILL : img(i).Tag = i";
Debug.ShouldStop(2097152);
_img.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(false,"setTag",RemoteObject.createImmutable((_i)));
 BA.debugLineNum = 343;BA.debugLine="Limg(i).Initialize(\"\") : Limg(i).Text = Names(i)";
Debug.ShouldStop(4194304);
_limg.getArrayElement(false,BA.numberCast(int.class, _i)).runVoidMethod ("Initialize",act_chat.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 343;BA.debugLine="Limg(i).Initialize(\"\") : Limg(i).Text = Names(i)";
Debug.ShouldStop(4194304);
_limg.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"setText",BA.ObjectToCharSequence(_names.getArrayElement(true,BA.numberCast(int.class, _i))));
 BA.debugLineNum = 343;BA.debugLine="Limg(i).Initialize(\"\") : Limg(i).Text = Names(i)";
Debug.ShouldStop(4194304);
_limg.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"setTextColor",BA.numberCast(int.class, 0xff565656));
 BA.debugLineNum = 344;BA.debugLine="Limg(i).TextSize= 14 : Limg(i).Gravity = Gravity";
Debug.ShouldStop(8388608);
_limg.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 344;BA.debugLine="Limg(i).TextSize= 14 : Limg(i).Gravity = Gravity";
Debug.ShouldStop(8388608);
_limg.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"setGravity",act_chat.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 344;BA.debugLine="Limg(i).TextSize= 14 : Limg(i).Gravity = Gravity";
Debug.ShouldStop(8388608);
_limg.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(false,"setTypeface",(act_chat.mostCurrent._font.getObject()));
 BA.debugLineNum = 345;BA.debugLine="re.Panel.AddView(img(i),mLeft,mTop,20%x,20%x)";
Debug.ShouldStop(16777216);
act_chat.mostCurrent._re.runMethod(false,"Panel").runVoidMethod ("AddView",(Object)((_img.getArrayElement(false,BA.numberCast(int.class, _i)).getObject())),(Object)(_mleft),(Object)(_mtop),(Object)(act_chat.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 20)),act_chat.mostCurrent.activityBA)),(Object)(act_chat.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 20)),act_chat.mostCurrent.activityBA)));
 BA.debugLineNum = 346;BA.debugLine="re.Panel.AddView(Limg(i),mLeft,mTop2,20%x,5%x)";
Debug.ShouldStop(33554432);
act_chat.mostCurrent._re.runMethod(false,"Panel").runVoidMethod ("AddView",(Object)((_limg.getArrayElement(false,BA.numberCast(int.class, _i)).getObject())),(Object)(_mleft),(Object)(_mtop2),(Object)(act_chat.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 20)),act_chat.mostCurrent.activityBA)),(Object)(act_chat.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),act_chat.mostCurrent.activityBA)));
 BA.debugLineNum = 347;BA.debugLine="mLeft = mLeft + 24%x";
Debug.ShouldStop(67108864);
_mleft = RemoteObject.solve(new RemoteObject[] {_mleft,act_chat.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 24)),act_chat.mostCurrent.activityBA)}, "+",1, 1);Debug.locals.put("mLeft", _mleft);
 BA.debugLineNum = 348;BA.debugLine="If (i = 3) Then";
Debug.ShouldStop(134217728);
if ((RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_i),BA.numberCast(double.class, 3)))) { 
 BA.debugLineNum = 349;BA.debugLine="mTop = 32%x";
Debug.ShouldStop(268435456);
_mtop = act_chat.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 32)),act_chat.mostCurrent.activityBA);Debug.locals.put("mTop", _mtop);
 BA.debugLineNum = 350;BA.debugLine="mTop2 = 52%x";
Debug.ShouldStop(536870912);
_mtop2 = act_chat.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 52)),act_chat.mostCurrent.activityBA);Debug.locals.put("mTop2", _mtop2);
 BA.debugLineNum = 351;BA.debugLine="mLeft = 4%x";
Debug.ShouldStop(1073741824);
_mleft = act_chat.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 4)),act_chat.mostCurrent.activityBA);Debug.locals.put("mLeft", _mleft);
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 355;BA.debugLine="Dis";
Debug.ShouldStop(4);
_dis();
 BA.debugLineNum = 357;BA.debugLine="STLoad";
Debug.ShouldStop(16);
_stload();
 BA.debugLineNum = 359;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _reqsef(RemoteObject _userid,RemoteObject _types,RemoteObject _chat_ida,RemoteObject _finish,RemoteObject _msg_ida,RemoteObject _njob,RemoteObject _picname) throws Exception{
try {
		Debug.PushSubsStack("reqsef (act_chat) ","act_chat",16,act_chat.mostCurrent.activityBA,act_chat.mostCurrent,1182);
if (RapidSub.canDelegate("reqsef")) { return com.it.fome.act_chat.remoteMe.runUserSub(false, "act_chat","reqsef", _userid, _types, _chat_ida, _finish, _msg_ida, _njob, _picname);}
RemoteObject _prfn = RemoteObject.declareNull("com.reza.sh.fastnet.Fastnet");
RemoteObject _post = RemoteObject.declareNull("com.reza.sh.fastnet.PostRequestRaper");
Debug.locals.put("userid", _userid);
Debug.locals.put("types", _types);
Debug.locals.put("chat_ida", _chat_ida);
Debug.locals.put("finish", _finish);
Debug.locals.put("msg_ida", _msg_ida);
Debug.locals.put("njob", _njob);
Debug.locals.put("picname", _picname);
 BA.debugLineNum = 1182;BA.debugLine="Sub reqsef(userid As String,types As String,chat_i";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 1186;BA.debugLine="Dim prfn As PersianFastNetwork";
Debug.ShouldStop(2);
_prfn = RemoteObject.createNew ("com.reza.sh.fastnet.Fastnet");Debug.locals.put("prfn", _prfn);
 BA.debugLineNum = 1187;BA.debugLine="prfn.initialize(\"prfn\")";
Debug.ShouldStop(4);
_prfn.runVoidMethod ("initialize",act_chat.processBA,(Object)(RemoteObject.createImmutable("prfn")));
 BA.debugLineNum = 1188;BA.debugLine="Dim post As PostRequest";
Debug.ShouldStop(8);
_post = RemoteObject.createNew ("com.reza.sh.fastnet.PostRequestRaper");Debug.locals.put("post", _post);
 BA.debugLineNum = 1189;BA.debugLine="post=prfn.BuildPostQuery(\"http://filework.ir/INST";
Debug.ShouldStop(16);
_post = _prfn.runMethod(false,"BuildPostQuery",(Object)(BA.ObjectToString("http://filework.ir/INSTAFOLLOW/api/req.php")),(Object)(RemoteObject.createImmutable("sefss")));Debug.locals.put("post", _post);
 BA.debugLineNum = 1191;BA.debugLine="post.addHeder(\"User-Agent\",\"Dalvik/1.6.0 (Linux;";
Debug.ShouldStop(64);
_post.runVoidMethod ("addHeder",(Object)(BA.ObjectToString("User-Agent")),(Object)(RemoteObject.createImmutable("Dalvik/1.6.0 (Linux; U; Android 4.4.4; SM-A700FD Build/KTU84P)")));
 BA.debugLineNum = 1192;BA.debugLine="post.addParametrs(\"req\",\"t_sef\")";
Debug.ShouldStop(128);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("req")),(Object)(RemoteObject.createImmutable("t_sef")));
 BA.debugLineNum = 1194;BA.debugLine="post.addParametrs(\"uid\",\"1\")";
Debug.ShouldStop(512);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("uid")),(Object)(RemoteObject.createImmutable("1")));
 BA.debugLineNum = 1195;BA.debugLine="post.addParametrs(\"types\",types)";
Debug.ShouldStop(1024);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("types")),(Object)(_types));
 BA.debugLineNum = 1196;BA.debugLine="post.addParametrs(\"userid\",userid)";
Debug.ShouldStop(2048);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("userid")),(Object)(_userid));
 BA.debugLineNum = 1197;BA.debugLine="post.addParametrs(\"chat_id\",chat_ida)";
Debug.ShouldStop(4096);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("chat_id")),(Object)(_chat_ida));
 BA.debugLineNum = 1198;BA.debugLine="post.addParametrs(\"finish\",finish)";
Debug.ShouldStop(8192);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("finish")),(Object)(_finish));
 BA.debugLineNum = 1199;BA.debugLine="post.addParametrs(\"msg_id\",msg_ida)";
Debug.ShouldStop(16384);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("msg_id")),(Object)(_msg_ida));
 BA.debugLineNum = 1200;BA.debugLine="post.addParametrs(\"njob\",njob)";
Debug.ShouldStop(32768);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("njob")),(Object)(_njob));
 BA.debugLineNum = 1202;BA.debugLine="post.addParametrs(\"pic\",\"http://filework.ir/INSTA";
Debug.ShouldStop(131072);
_post.runVoidMethod ("addParametrs",(Object)(BA.ObjectToString("pic")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://filework.ir/INSTAFOLLOW/api/telepic/"),_picname)));
 BA.debugLineNum = 1206;BA.debugLine="post.executRequestAsString";
Debug.ShouldStop(2097152);
_post.runVoidMethod ("executRequestAsString");
 BA.debugLineNum = 1211;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _send_animationend() throws Exception{
try {
		Debug.PushSubsStack("send_AnimationEnd (act_chat) ","act_chat",16,act_chat.mostCurrent.activityBA,act_chat.mostCurrent,713);
if (RapidSub.canDelegate("send_animationend")) { return com.it.fome.act_chat.remoteMe.runUserSub(false, "act_chat","send_animationend");}
 BA.debugLineNum = 713;BA.debugLine="Sub send_AnimationEnd";
Debug.ShouldStop(256);
 BA.debugLineNum = 714;BA.debugLine="EditText.Text = \"\"";
Debug.ShouldStop(512);
act_chat.mostCurrent._edittext.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 715;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setninepatchdrawable(RemoteObject _control,RemoteObject _imagenamse) throws Exception{
try {
		Debug.PushSubsStack("SetNinePatchDrawable (act_chat) ","act_chat",16,act_chat.mostCurrent.activityBA,act_chat.mostCurrent,1111);
if (RapidSub.canDelegate("setninepatchdrawable")) { return com.it.fome.act_chat.remoteMe.runUserSub(false, "act_chat","setninepatchdrawable", _control, _imagenamse);}
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
RemoteObject _package = RemoteObject.createImmutable("");
RemoteObject _id = RemoteObject.createImmutable(0);
Debug.locals.put("Control", _control);
Debug.locals.put("IMAGENAMsE", _imagenamse);
 BA.debugLineNum = 1111;BA.debugLine="Sub SetNinePatchDrawable(Control As View, IMAGENAM";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 1112;BA.debugLine="Dim r As Reflector";
Debug.ShouldStop(8388608);
_r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("r", _r);
 BA.debugLineNum = 1113;BA.debugLine="Dim package As String";
Debug.ShouldStop(16777216);
_package = RemoteObject.createImmutable("");Debug.locals.put("package", _package);
 BA.debugLineNum = 1114;BA.debugLine="Dim id As Int";
Debug.ShouldStop(33554432);
_id = RemoteObject.createImmutable(0);Debug.locals.put("id", _id);
 BA.debugLineNum = 1115;BA.debugLine="package = r.GetStaticField(\"anywheresoftware.b4a.";
Debug.ShouldStop(67108864);
_package = BA.ObjectToString(_r.runMethod(false,"GetStaticField",(Object)(BA.ObjectToString("anywheresoftware.b4a.BA")),(Object)(RemoteObject.createImmutable("packageName"))));Debug.locals.put("package", _package);
 BA.debugLineNum = 1116;BA.debugLine="id = r.GetStaticField(package & \".R$drawable\", IM";
Debug.ShouldStop(134217728);
_id = BA.numberCast(int.class, _r.runMethod(false,"GetStaticField",(Object)(RemoteObject.concat(_package,RemoteObject.createImmutable(".R$drawable"))),(Object)(_imagenamse)));Debug.locals.put("id", _id);
 BA.debugLineNum = 1117;BA.debugLine="r.Target = r.GetContext";
Debug.ShouldStop(268435456);
_r.setField ("Target",(_r.runMethod(false,"GetContext",act_chat.processBA)));
 BA.debugLineNum = 1118;BA.debugLine="r.Target = r.RunMethod(\"getResources\")";
Debug.ShouldStop(536870912);
_r.setField ("Target",_r.runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getResources"))));
 BA.debugLineNum = 1119;BA.debugLine="Control.Background = r.RunMethod2(\"getDrawable\",";
Debug.ShouldStop(1073741824);
_control.runMethod(false,"setBackground",(_r.runMethod(false,"RunMethod2",(Object)(BA.ObjectToString("getDrawable")),(Object)(BA.NumberToString(_id)),(Object)(RemoteObject.createImmutable("java.lang.int")))));
 BA.debugLineNum = 1120;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _stic_click() throws Exception{
try {
		Debug.PushSubsStack("Stic_Click (act_chat) ","act_chat",16,act_chat.mostCurrent.activityBA,act_chat.mostCurrent,408);
if (RapidSub.canDelegate("stic_click")) { return com.it.fome.act_chat.remoteMe.runUserSub(false, "act_chat","stic_click");}
 BA.debugLineNum = 408;BA.debugLine="Sub Stic_Click";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 409;BA.debugLine="stp.Top = 100%y-75.5%x";
Debug.ShouldStop(16777216);
act_chat.mostCurrent._stp.runMethod(true,"setTop",RemoteObject.solve(new RemoteObject[] {act_chat.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),act_chat.mostCurrent.activityBA),act_chat.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 75.5)),act_chat.mostCurrent.activityBA)}, "-",1, 1));
 BA.debugLineNum = 410;BA.debugLine="IME.HideKeyboard";
Debug.ShouldStop(33554432);
act_chat.mostCurrent._ime.runVoidMethod ("HideKeyboard",act_chat.mostCurrent.activityBA);
 BA.debugLineNum = 411;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _stimage_click() throws Exception{
try {
		Debug.PushSubsStack("STImage_Click (act_chat) ","act_chat",16,act_chat.mostCurrent.activityBA,act_chat.mostCurrent,388);
if (RapidSub.canDelegate("stimage_click")) { return com.it.fome.act_chat.remoteMe.runUserSub(false, "act_chat","stimage_click");}
RemoteObject _image = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
RemoteObject _item = RemoteObject.declareNull("com.it.fome.act_chat._adapter");
 BA.debugLineNum = 388;BA.debugLine="Sub STImage_Click";
Debug.ShouldStop(8);
 BA.debugLineNum = 389;BA.debugLine="Dim Image As ImageView = Sender";
Debug.ShouldStop(16);
_image = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
_image.setObject(act_chat.mostCurrent.__c.runMethod(false,"Sender",act_chat.mostCurrent.activityBA));Debug.locals.put("Image", _image);
 BA.debugLineNum = 390;BA.debugLine="Select Image.Tag";
Debug.ShouldStop(32);
switch (BA.switchObjectToInt(_image.runMethod(false,"getTag"),_image.runMethod(false,"getTag"))) {
case 0: {
 BA.debugLineNum = 392;BA.debugLine="stp.Top = 100%y";
Debug.ShouldStop(128);
act_chat.mostCurrent._stp.runMethod(true,"setTop",act_chat.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),act_chat.mostCurrent.activityBA));
 BA.debugLineNum = 393;BA.debugLine="re.Invalidate";
Debug.ShouldStop(256);
act_chat.mostCurrent._re.runVoidMethod ("Invalidate");
 BA.debugLineNum = 395;BA.debugLine="Dim Item As Adapter";
Debug.ShouldStop(1024);
_item = RemoteObject.createNew ("com.it.fome.act_chat._adapter");Debug.locals.put("Item", _item);
 BA.debugLineNum = 396;BA.debugLine="Item.ViewType = MINEST";
Debug.ShouldStop(2048);
_item.setField ("ViewType" /*RemoteObject*/ ,act_chat._minest);
 BA.debugLineNum = 397;BA.debugLine="Item.MyText = Image.Tag";
Debug.ShouldStop(4096);
_item.setField ("MyText" /*RemoteObject*/ ,BA.ObjectToString(_image.runMethod(false,"getTag")));
 BA.debugLineNum = 399;BA.debugLine="ItemList.Add(Item)";
Debug.ShouldStop(16384);
act_chat.mostCurrent._itemlist.runVoidMethod ("Add",(Object)((_item)));
 BA.debugLineNum = 400;BA.debugLine="LV.notifyItemAdded";
Debug.ShouldStop(32768);
act_chat.mostCurrent._lv.runVoidMethodAndSync ("notifyItemAdded");
 BA.debugLineNum = 402;BA.debugLine="LV.SmoothScrollToPosition(ItemList.Size)";
Debug.ShouldStop(131072);
act_chat.mostCurrent._lv.runVoidMethod ("SmoothScrollToPosition",(Object)(act_chat.mostCurrent._itemlist.runMethod(true,"getSize")));
 BA.debugLineNum = 403;BA.debugLine="Timer2.Enabled = True";
Debug.ShouldStop(262144);
act_chat._timer2.runMethod(true,"setEnabled",act_chat.mostCurrent.__c.getField(true,"True"));
 break; }
}
;
 BA.debugLineNum = 406;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _stload() throws Exception{
try {
		Debug.PushSubsStack("STLoad (act_chat) ","act_chat",16,act_chat.mostCurrent.activityBA,act_chat.mostCurrent,361);
if (RapidSub.canDelegate("stload")) { return com.it.fome.act_chat.remoteMe.runUserSub(false, "act_chat","stload");}
RemoteObject _mleft = RemoteObject.createImmutable(0);
RemoteObject _mtop = RemoteObject.createImmutable(0);
RemoteObject _img = null;
int _i = 0;
 BA.debugLineNum = 361;BA.debugLine="Sub STLoad";
Debug.ShouldStop(256);
 BA.debugLineNum = 362;BA.debugLine="Dim mLeft = 2%x, mTop = 4%x As Int";
Debug.ShouldStop(512);
_mleft = act_chat.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),act_chat.mostCurrent.activityBA);Debug.locals.put("mLeft", _mleft);Debug.locals.put("mLeft", _mleft);
_mtop = act_chat.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 4)),act_chat.mostCurrent.activityBA);Debug.locals.put("mTop", _mtop);Debug.locals.put("mTop", _mtop);
 BA.debugLineNum = 364;BA.debugLine="stp.Initialize(\"\")";
Debug.ShouldStop(2048);
act_chat.mostCurrent._stp.runVoidMethod ("Initialize",act_chat.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 365;BA.debugLine="Activity.AddView(stp,0,100%y,100%x,75.5%x)";
Debug.ShouldStop(4096);
act_chat.mostCurrent._activity.runVoidMethod ("AddView",(Object)((act_chat.mostCurrent._stp.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(act_chat.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),act_chat.mostCurrent.activityBA)),(Object)(act_chat.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),act_chat.mostCurrent.activityBA)),(Object)(act_chat.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 75.5)),act_chat.mostCurrent.activityBA)));
 BA.debugLineNum = 366;BA.debugLine="stp.Color = 0xFFFAFAFA";
Debug.ShouldStop(8192);
act_chat.mostCurrent._stp.runVoidMethod ("setColor",BA.numberCast(int.class, 0xfffafafa));
 BA.debugLineNum = 368;BA.debugLine="Dim img(12) As ImageView";
Debug.ShouldStop(32768);
_img = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.ImageViewWrapper", new int[] {12}, new Object[]{});Debug.locals.put("img", _img);
 BA.debugLineNum = 369;BA.debugLine="For i = 0 To img.Length-1";
Debug.ShouldStop(65536);
{
final int step6 = 1;
final int limit6 = RemoteObject.solve(new RemoteObject[] {_img.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6) ;_i = ((int)(0 + _i + step6))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 370;BA.debugLine="img(i).Initialize(\"STImage\")";
Debug.ShouldStop(131072);
_img.getArrayElement(false,BA.numberCast(int.class, _i)).runVoidMethod ("Initialize",act_chat.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("STImage")));
 BA.debugLineNum = 371;BA.debugLine="img(i).Bitmap = LoadBitmap(File.DirAssets,\"96/0\"";
Debug.ShouldStop(262144);
_img.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(false,"setBitmap",(act_chat.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(act_chat.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("96/0"),RemoteObject.createImmutable(_i),RemoteObject.createImmutable(".png")))).getObject()));
 BA.debugLineNum = 372;BA.debugLine="img(i).Gravity = Gravity.FILL : img(i).Tag = i";
Debug.ShouldStop(524288);
_img.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"setGravity",act_chat.mostCurrent.__c.getField(false,"Gravity").getField(true,"FILL"));
 BA.debugLineNum = 372;BA.debugLine="img(i).Gravity = Gravity.FILL : img(i).Tag = i";
Debug.ShouldStop(524288);
_img.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(false,"setTag",RemoteObject.createImmutable((_i)));
 BA.debugLineNum = 374;BA.debugLine="stp.AddView(img(i),mLeft,mTop,22.5%x,22.5%x)";
Debug.ShouldStop(2097152);
act_chat.mostCurrent._stp.runVoidMethod ("AddView",(Object)((_img.getArrayElement(false,BA.numberCast(int.class, _i)).getObject())),(Object)(_mleft),(Object)(_mtop),(Object)(act_chat.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 22.5)),act_chat.mostCurrent.activityBA)),(Object)(act_chat.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 22.5)),act_chat.mostCurrent.activityBA)));
 BA.debugLineNum = 376;BA.debugLine="mLeft = mLeft + 24%x";
Debug.ShouldStop(8388608);
_mleft = RemoteObject.solve(new RemoteObject[] {_mleft,act_chat.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 24)),act_chat.mostCurrent.activityBA)}, "+",1, 1);Debug.locals.put("mLeft", _mleft);
 BA.debugLineNum = 377;BA.debugLine="If (i = 3) Then";
Debug.ShouldStop(16777216);
if ((RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_i),BA.numberCast(double.class, 3)))) { 
 BA.debugLineNum = 378;BA.debugLine="mTop = 26.5%x";
Debug.ShouldStop(33554432);
_mtop = act_chat.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 26.5)),act_chat.mostCurrent.activityBA);Debug.locals.put("mTop", _mtop);
 BA.debugLineNum = 379;BA.debugLine="mLeft = 2%x";
Debug.ShouldStop(67108864);
_mleft = act_chat.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),act_chat.mostCurrent.activityBA);Debug.locals.put("mLeft", _mleft);
 }else 
{ BA.debugLineNum = 380;BA.debugLine="else if (i = 7) Then";
Debug.ShouldStop(134217728);
if ((RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_i),BA.numberCast(double.class, 7)))) { 
 BA.debugLineNum = 381;BA.debugLine="mTop = 51%x";
Debug.ShouldStop(268435456);
_mtop = act_chat.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 51)),act_chat.mostCurrent.activityBA);Debug.locals.put("mTop", _mtop);
 BA.debugLineNum = 382;BA.debugLine="mLeft = 2%x";
Debug.ShouldStop(536870912);
_mleft = act_chat.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),act_chat.mostCurrent.activityBA);Debug.locals.put("mLeft", _mleft);
 }}
;
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 386;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _telegs_chatgroup(RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("telegs_chatgroup (act_chat) ","act_chat",16,act_chat.mostCurrent.activityBA,act_chat.mostCurrent,1323);
if (RapidSub.canDelegate("telegs_chatgroup")) { return com.it.fome.act_chat.remoteMe.runUserSub(false, "act_chat","telegs_chatgroup", _value);}
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colroot = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _meg_replytomessageid = RemoteObject.createImmutable(0);
RemoteObject _meg_chatid = RemoteObject.createImmutable(0L);
RemoteObject _meg_senderuserid = RemoteObject.createImmutable(0);
RemoteObject _meg_editdate = RemoteObject.createImmutable(0);
RemoteObject _meg_ispost = RemoteObject.createImmutable("");
RemoteObject _meg_id = RemoteObject.createImmutable(0L);
RemoteObject _meg_views = RemoteObject.createImmutable(0);
RemoteObject _msg_type = RemoteObject.createImmutable("");
RemoteObject _meg_canbedeleted = RemoteObject.createImmutable("");
RemoteObject _massege_info = RemoteObject.createImmutable("");
RemoteObject _meg_viabotuserid = RemoteObject.createImmutable(0);
RemoteObject _meg_date = RemoteObject.createImmutable(0);
RemoteObject _meg_canbeedited = RemoteObject.createImmutable("");
RemoteObject _replymarkup = RemoteObject.createImmutable("");
Debug.locals.put("value", _value);
 BA.debugLineNum = 1323;BA.debugLine="Sub telegs_chatgroup(value As String)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 1324;BA.debugLine="LogColor(value,Colors.red)";
Debug.ShouldStop(2048);
act_chat.mostCurrent.__c.runVoidMethod ("LogImpl","622544385",_value,act_chat.mostCurrent.__c.getField(false,"Colors").getField(true,"Red"));
 BA.debugLineNum = 1325;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(4096);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 1326;BA.debugLine="parser.Initialize(value)";
Debug.ShouldStop(8192);
_parser.runVoidMethod ("Initialize",(Object)(_value));
 BA.debugLineNum = 1327;BA.debugLine="Dim root As List = parser.NextArray";
Debug.ShouldStop(16384);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_root = _parser.runMethod(false,"NextArray");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 1328;BA.debugLine="For Each colroot As Map In root";
Debug.ShouldStop(32768);
_colroot = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group5 = _root;
final int groupLen5 = group5.runMethod(true,"getSize").<Integer>get()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_colroot.setObject(group5.runMethod(false,"Get",index5));
Debug.locals.put("colroot", _colroot);
 BA.debugLineNum = 1329;BA.debugLine="Dim meg_replyToMessageId As Int = colroot.Get(\"m";
Debug.ShouldStop(65536);
_meg_replytomessageid = BA.numberCast(int.class, _colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("meg_replyToMessageId")))));Debug.locals.put("meg_replyToMessageId", _meg_replytomessageid);Debug.locals.put("meg_replyToMessageId", _meg_replytomessageid);
 BA.debugLineNum = 1330;BA.debugLine="Dim meg_chatId As Long = colroot.Get(\"meg_chatId";
Debug.ShouldStop(131072);
_meg_chatid = BA.numberCast(long.class, _colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("meg_chatId")))));Debug.locals.put("meg_chatId", _meg_chatid);Debug.locals.put("meg_chatId", _meg_chatid);
 BA.debugLineNum = 1331;BA.debugLine="Dim meg_senderUserId As Int = colroot.Get(\"meg_s";
Debug.ShouldStop(262144);
_meg_senderuserid = BA.numberCast(int.class, _colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("meg_senderUserId")))));Debug.locals.put("meg_senderUserId", _meg_senderuserid);Debug.locals.put("meg_senderUserId", _meg_senderuserid);
 BA.debugLineNum = 1332;BA.debugLine="Dim meg_editDate As Int = colroot.Get(\"meg_editD";
Debug.ShouldStop(524288);
_meg_editdate = BA.numberCast(int.class, _colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("meg_editDate")))));Debug.locals.put("meg_editDate", _meg_editdate);Debug.locals.put("meg_editDate", _meg_editdate);
 BA.debugLineNum = 1333;BA.debugLine="Dim meg_isPost As String = colroot.Get(\"meg_isPo";
Debug.ShouldStop(1048576);
_meg_ispost = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("meg_isPost")))));Debug.locals.put("meg_isPost", _meg_ispost);Debug.locals.put("meg_isPost", _meg_ispost);
 BA.debugLineNum = 1334;BA.debugLine="Dim meg_id As Long = colroot.Get(\"meg_id\")";
Debug.ShouldStop(2097152);
_meg_id = BA.numberCast(long.class, _colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("meg_id")))));Debug.locals.put("meg_id", _meg_id);Debug.locals.put("meg_id", _meg_id);
 BA.debugLineNum = 1336;BA.debugLine="Dim meg_views As Int = colroot.Get(\"meg_views\")";
Debug.ShouldStop(8388608);
_meg_views = BA.numberCast(int.class, _colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("meg_views")))));Debug.locals.put("meg_views", _meg_views);Debug.locals.put("meg_views", _meg_views);
 BA.debugLineNum = 1337;BA.debugLine="Dim msg_type As String = colroot.Get(\"msg_type\")";
Debug.ShouldStop(16777216);
_msg_type = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msg_type")))));Debug.locals.put("msg_type", _msg_type);Debug.locals.put("msg_type", _msg_type);
 BA.debugLineNum = 1338;BA.debugLine="Dim meg_canBeDeleted As String = colroot.Get(\"me";
Debug.ShouldStop(33554432);
_meg_canbedeleted = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("meg_canBeDeleted")))));Debug.locals.put("meg_canBeDeleted", _meg_canbedeleted);Debug.locals.put("meg_canBeDeleted", _meg_canbedeleted);
 BA.debugLineNum = 1339;BA.debugLine="Dim massege_info As String = colroot.Get(\"masseg";
Debug.ShouldStop(67108864);
_massege_info = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("massege_info")))));Debug.locals.put("massege_info", _massege_info);Debug.locals.put("massege_info", _massege_info);
 BA.debugLineNum = 1340;BA.debugLine="Dim meg_viaBotUserId As Int = colroot.Get(\"meg_v";
Debug.ShouldStop(134217728);
_meg_viabotuserid = BA.numberCast(int.class, _colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("meg_viaBotUserId")))));Debug.locals.put("meg_viaBotUserId", _meg_viabotuserid);Debug.locals.put("meg_viaBotUserId", _meg_viabotuserid);
 BA.debugLineNum = 1341;BA.debugLine="Dim meg_date As Int = colroot.Get(\"meg_date\")";
Debug.ShouldStop(268435456);
_meg_date = BA.numberCast(int.class, _colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("meg_date")))));Debug.locals.put("meg_date", _meg_date);Debug.locals.put("meg_date", _meg_date);
 BA.debugLineNum = 1342;BA.debugLine="Dim meg_canBeEdited As String = colroot.Get(\"meg";
Debug.ShouldStop(536870912);
_meg_canbeedited = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("meg_canBeEdited")))));Debug.locals.put("meg_canBeEdited", _meg_canbeedited);Debug.locals.put("meg_canBeEdited", _meg_canbeedited);
 BA.debugLineNum = 1343;BA.debugLine="Dim ReplyMarkup As String = colroot.Get(\"ReplyMa";
Debug.ShouldStop(1073741824);
_replymarkup = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ReplyMarkup")))));Debug.locals.put("ReplyMarkup", _replymarkup);Debug.locals.put("ReplyMarkup", _replymarkup);
 BA.debugLineNum = 1344;BA.debugLine="Log(\"ReplyMarkup: \"&ReplyMarkup)";
Debug.ShouldStop(-2147483648);
act_chat.mostCurrent.__c.runVoidMethod ("LogImpl","622544405",RemoteObject.concat(RemoteObject.createImmutable("ReplyMarkup: "),_replymarkup),0);
 BA.debugLineNum = 1345;BA.debugLine="LogColor(meg_id,Colors.Blue)";
Debug.ShouldStop(1);
act_chat.mostCurrent.__c.runVoidMethod ("LogImpl","622544406",BA.NumberToString(_meg_id),act_chat.mostCurrent.__c.getField(false,"Colors").getField(true,"Blue"));
 BA.debugLineNum = 1346;BA.debugLine="telegs.Viewmsg(meg_chatId,Array As Long(meg_id))";
Debug.ShouldStop(2);
act_chat.mostCurrent._telegs.runVoidMethod ("Viewmsg",(Object)(_meg_chatid),(Object)(RemoteObject.createNewArray("long",new int[] {1},new Object[] {_meg_id})));
 }
}Debug.locals.put("colroot", _colroot);
;
 BA.debugLineNum = 1348;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _telegs_getchatshistory(RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("telegs_getchatshistory (act_chat) ","act_chat",16,act_chat.mostCurrent.activityBA,act_chat.mostCurrent,194);
if (RapidSub.canDelegate("telegs_getchatshistory")) { return com.it.fome.act_chat.remoteMe.runUserSub(false, "act_chat","telegs_getchatshistory", _value);}
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colroot = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _meg_replytomessageid = RemoteObject.createImmutable(0);
RemoteObject _meg_chatid = RemoteObject.createImmutable(0L);
RemoteObject _meg_senderuserid = RemoteObject.createImmutable(0);
RemoteObject _meg_editdate = RemoteObject.createImmutable(0);
RemoteObject _meg_ispost = RemoteObject.createImmutable("");
RemoteObject _meg_id = RemoteObject.createImmutable(0L);
RemoteObject _meg_views = RemoteObject.createImmutable(0);
RemoteObject _msg_type = RemoteObject.createImmutable("");
RemoteObject _meg_canbedeleted = RemoteObject.createImmutable("");
RemoteObject _massege_info = RemoteObject.createImmutable("");
RemoteObject _meg_viabotuserid = RemoteObject.createImmutable(0);
RemoteObject _meg_date = RemoteObject.createImmutable(0);
RemoteObject _meg_canbeedited = RemoteObject.createImmutable("");
RemoteObject _replymarkup = RemoteObject.createImmutable("");
RemoteObject _parser_msg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _root_msg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msg_text = RemoteObject.createImmutable("");
RemoteObject _item = RemoteObject.declareNull("com.it.fome.act_chat._adapter");
RemoteObject _parser_photo = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _root_photo = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _photoid_isdownloadingcompleted = RemoteObject.createImmutable("");
RemoteObject _photoid_topmsg = RemoteObject.createImmutable(0);
RemoteObject _photoid_downloadedprefixsize = RemoteObject.createImmutable(0);
RemoteObject _caption_topmsg = RemoteObject.createImmutable("");
RemoteObject _photoid_path = RemoteObject.createImmutable("");
RemoteObject _photoid_downloadedsize = RemoteObject.createImmutable(0);
RemoteObject _photoid_height = RemoteObject.createImmutable(0);
RemoteObject _photoid_type = RemoteObject.createImmutable("");
RemoteObject _photoid_size = RemoteObject.createImmutable(0);
RemoteObject _caption_id = RemoteObject.createImmutable("");
RemoteObject _photoid_width = RemoteObject.createImmutable(0);
RemoteObject _photoid_isdownloadingactive = RemoteObject.createImmutable("");
RemoteObject _photoid_remote = RemoteObject.createImmutable("");
RemoteObject _photoid_canbedownloaded = RemoteObject.createImmutable("");
RemoteObject _photoid_canbedeleted = RemoteObject.createImmutable("");
Debug.locals.put("value", _value);
 BA.debugLineNum = 194;BA.debugLine="Sub telegs_getchatshistory(value As String)";
Debug.ShouldStop(2);
 BA.debugLineNum = 196;BA.debugLine="If value =\"\" Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",_value,BA.ObjectToString(""))) { 
 BA.debugLineNum = 197;BA.debugLine="Return";
Debug.ShouldStop(16);
if (true) return RemoteObject.createImmutable("");
 }else {
 BA.debugLineNum = 199;BA.debugLine="Log(\"chats ready!\")";
Debug.ShouldStop(64);
act_chat.mostCurrent.__c.runVoidMethod ("LogImpl","619267589",RemoteObject.createImmutable("chats ready!"),0);
 BA.debugLineNum = 200;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(128);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 201;BA.debugLine="parser.Initialize(value)";
Debug.ShouldStop(256);
_parser.runVoidMethod ("Initialize",(Object)(_value));
 BA.debugLineNum = 202;BA.debugLine="Dim root As List = parser.NextArray";
Debug.ShouldStop(512);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_root = _parser.runMethod(false,"NextArray");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 203;BA.debugLine="For Each colroot As Map In root";
Debug.ShouldStop(1024);
_colroot = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group8 = _root;
final int groupLen8 = group8.runMethod(true,"getSize").<Integer>get()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_colroot.setObject(group8.runMethod(false,"Get",index8));
Debug.locals.put("colroot", _colroot);
 BA.debugLineNum = 204;BA.debugLine="Dim meg_replyToMessageId As Int = colroot.Get(\"";
Debug.ShouldStop(2048);
_meg_replytomessageid = BA.numberCast(int.class, _colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("meg_replyToMessageId")))));Debug.locals.put("meg_replyToMessageId", _meg_replytomessageid);Debug.locals.put("meg_replyToMessageId", _meg_replytomessageid);
 BA.debugLineNum = 205;BA.debugLine="Dim meg_chatId As Long = colroot.Get(\"meg_chatI";
Debug.ShouldStop(4096);
_meg_chatid = BA.numberCast(long.class, _colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("meg_chatId")))));Debug.locals.put("meg_chatId", _meg_chatid);Debug.locals.put("meg_chatId", _meg_chatid);
 BA.debugLineNum = 206;BA.debugLine="Dim meg_senderUserId As Int = colroot.Get(\"meg_";
Debug.ShouldStop(8192);
_meg_senderuserid = BA.numberCast(int.class, _colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("meg_senderUserId")))));Debug.locals.put("meg_senderUserId", _meg_senderuserid);Debug.locals.put("meg_senderUserId", _meg_senderuserid);
 BA.debugLineNum = 207;BA.debugLine="Dim meg_editDate As Int = colroot.Get(\"meg_edit";
Debug.ShouldStop(16384);
_meg_editdate = BA.numberCast(int.class, _colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("meg_editDate")))));Debug.locals.put("meg_editDate", _meg_editdate);Debug.locals.put("meg_editDate", _meg_editdate);
 BA.debugLineNum = 208;BA.debugLine="Dim meg_isPost As String = colroot.Get(\"meg_isP";
Debug.ShouldStop(32768);
_meg_ispost = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("meg_isPost")))));Debug.locals.put("meg_isPost", _meg_ispost);Debug.locals.put("meg_isPost", _meg_ispost);
 BA.debugLineNum = 209;BA.debugLine="Dim meg_id As Long = colroot.Get(\"meg_id\")";
Debug.ShouldStop(65536);
_meg_id = BA.numberCast(long.class, _colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("meg_id")))));Debug.locals.put("meg_id", _meg_id);Debug.locals.put("meg_id", _meg_id);
 BA.debugLineNum = 211;BA.debugLine="Dim meg_views As Int = colroot.Get(\"meg_views\")";
Debug.ShouldStop(262144);
_meg_views = BA.numberCast(int.class, _colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("meg_views")))));Debug.locals.put("meg_views", _meg_views);Debug.locals.put("meg_views", _meg_views);
 BA.debugLineNum = 212;BA.debugLine="Dim msg_type As String = colroot.Get(\"msg_type\"";
Debug.ShouldStop(524288);
_msg_type = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msg_type")))));Debug.locals.put("msg_type", _msg_type);Debug.locals.put("msg_type", _msg_type);
 BA.debugLineNum = 213;BA.debugLine="Dim meg_canBeDeleted As String = colroot.Get(\"m";
Debug.ShouldStop(1048576);
_meg_canbedeleted = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("meg_canBeDeleted")))));Debug.locals.put("meg_canBeDeleted", _meg_canbedeleted);Debug.locals.put("meg_canBeDeleted", _meg_canbedeleted);
 BA.debugLineNum = 214;BA.debugLine="Dim massege_info As String = colroot.Get(\"masse";
Debug.ShouldStop(2097152);
_massege_info = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("massege_info")))));Debug.locals.put("massege_info", _massege_info);Debug.locals.put("massege_info", _massege_info);
 BA.debugLineNum = 215;BA.debugLine="Dim meg_viaBotUserId As Int = colroot.Get(\"meg_";
Debug.ShouldStop(4194304);
_meg_viabotuserid = BA.numberCast(int.class, _colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("meg_viaBotUserId")))));Debug.locals.put("meg_viaBotUserId", _meg_viabotuserid);Debug.locals.put("meg_viaBotUserId", _meg_viabotuserid);
 BA.debugLineNum = 216;BA.debugLine="Dim meg_date As Int = colroot.Get(\"meg_date\")";
Debug.ShouldStop(8388608);
_meg_date = BA.numberCast(int.class, _colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("meg_date")))));Debug.locals.put("meg_date", _meg_date);Debug.locals.put("meg_date", _meg_date);
 BA.debugLineNum = 217;BA.debugLine="Dim meg_canBeEdited As String = colroot.Get(\"me";
Debug.ShouldStop(16777216);
_meg_canbeedited = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("meg_canBeEdited")))));Debug.locals.put("meg_canBeEdited", _meg_canbeedited);Debug.locals.put("meg_canBeEdited", _meg_canbeedited);
 BA.debugLineNum = 218;BA.debugLine="Dim ReplyMarkup As String = colroot.Get(\"ReplyM";
Debug.ShouldStop(33554432);
_replymarkup = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ReplyMarkup")))));Debug.locals.put("ReplyMarkup", _replymarkup);Debug.locals.put("ReplyMarkup", _replymarkup);
 BA.debugLineNum = 219;BA.debugLine="Log(\"ReplyMarkup: \"&ReplyMarkup)";
Debug.ShouldStop(67108864);
act_chat.mostCurrent.__c.runVoidMethod ("LogImpl","619267609",RemoteObject.concat(RemoteObject.createImmutable("ReplyMarkup: "),_replymarkup),0);
 BA.debugLineNum = 220;BA.debugLine="LogColor(meg_id,Colors.Blue)";
Debug.ShouldStop(134217728);
act_chat.mostCurrent.__c.runVoidMethod ("LogImpl","619267610",BA.NumberToString(_meg_id),act_chat.mostCurrent.__c.getField(false,"Colors").getField(true,"Blue"));
 BA.debugLineNum = 222;BA.debugLine="Select msg_type";
Debug.ShouldStop(536870912);
switch (BA.switchObjectToInt(_msg_type,BA.ObjectToString("message"),BA.ObjectToString("photo"))) {
case 0: {
 BA.debugLineNum = 224;BA.debugLine="Dim parser_msg As JSONParser";
Debug.ShouldStop(-2147483648);
_parser_msg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser_msg", _parser_msg);
 BA.debugLineNum = 225;BA.debugLine="parser_msg.Initialize(massege_info)";
Debug.ShouldStop(1);
_parser_msg.runVoidMethod ("Initialize",(Object)(_massege_info));
 BA.debugLineNum = 226;BA.debugLine="Dim root_msg As Map = parser_msg.NextObject";
Debug.ShouldStop(2);
_root_msg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root_msg = _parser_msg.runMethod(false,"NextObject");Debug.locals.put("root_msg", _root_msg);Debug.locals.put("root_msg", _root_msg);
 BA.debugLineNum = 227;BA.debugLine="Dim msg_text As String = root_msg.Get(\"msg_te";
Debug.ShouldStop(4);
_msg_text = BA.ObjectToString(_root_msg.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msg_text")))));Debug.locals.put("msg_text", _msg_text);Debug.locals.put("msg_text", _msg_text);
 BA.debugLineNum = 229;BA.debugLine="Dim Item As Adapter";
Debug.ShouldStop(16);
_item = RemoteObject.createNew ("com.it.fome.act_chat._adapter");Debug.locals.put("Item", _item);
 BA.debugLineNum = 230;BA.debugLine="Item.ViewType = Their";
Debug.ShouldStop(32);
_item.setField ("ViewType" /*RemoteObject*/ ,act_chat._their);
 BA.debugLineNum = 231;BA.debugLine="Item.TheirText = msg_text";
Debug.ShouldStop(64);
_item.setField ("TheirText" /*RemoteObject*/ ,_msg_text);
 BA.debugLineNum = 232;BA.debugLine="Item.msg_id=meg_id";
Debug.ShouldStop(128);
_item.setField ("msg_id" /*RemoteObject*/ ,BA.NumberToString(_meg_id));
 BA.debugLineNum = 236;BA.debugLine="ItemList.Add(Item)";
Debug.ShouldStop(2048);
act_chat.mostCurrent._itemlist.runVoidMethod ("Add",(Object)((_item)));
 BA.debugLineNum = 237;BA.debugLine="LV.notifyItemAdded";
Debug.ShouldStop(4096);
act_chat.mostCurrent._lv.runVoidMethodAndSync ("notifyItemAdded");
 break; }
case 1: {
 BA.debugLineNum = 243;BA.debugLine="Log(\"photo\")";
Debug.ShouldStop(262144);
act_chat.mostCurrent.__c.runVoidMethod ("LogImpl","619267633",RemoteObject.createImmutable("photo"),0);
 BA.debugLineNum = 244;BA.debugLine="Dim parser_photo As JSONParser";
Debug.ShouldStop(524288);
_parser_photo = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser_photo", _parser_photo);
 BA.debugLineNum = 245;BA.debugLine="parser_photo.Initialize(massege_info)";
Debug.ShouldStop(1048576);
_parser_photo.runVoidMethod ("Initialize",(Object)(_massege_info));
 BA.debugLineNum = 246;BA.debugLine="Dim root_photo As Map = parser_photo.NextObje";
Debug.ShouldStop(2097152);
_root_photo = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root_photo = _parser_photo.runMethod(false,"NextObject");Debug.locals.put("root_photo", _root_photo);Debug.locals.put("root_photo", _root_photo);
 BA.debugLineNum = 247;BA.debugLine="Dim photoid_isDownloadingCompleted As String";
Debug.ShouldStop(4194304);
_photoid_isdownloadingcompleted = BA.ObjectToString(_root_photo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photoid_isDownloadingCompleted")))));Debug.locals.put("photoid_isDownloadingCompleted", _photoid_isdownloadingcompleted);Debug.locals.put("photoid_isDownloadingCompleted", _photoid_isdownloadingcompleted);
 BA.debugLineNum = 248;BA.debugLine="Dim photoid_topmsg As Int = root_photo.Get(\"p";
Debug.ShouldStop(8388608);
_photoid_topmsg = BA.numberCast(int.class, _root_photo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photoid_topmsg")))));Debug.locals.put("photoid_topmsg", _photoid_topmsg);Debug.locals.put("photoid_topmsg", _photoid_topmsg);
 BA.debugLineNum = 249;BA.debugLine="Dim photoid_downloadedPrefixSize As Int = roo";
Debug.ShouldStop(16777216);
_photoid_downloadedprefixsize = BA.numberCast(int.class, _root_photo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photoid_downloadedPrefixSize")))));Debug.locals.put("photoid_downloadedPrefixSize", _photoid_downloadedprefixsize);Debug.locals.put("photoid_downloadedPrefixSize", _photoid_downloadedprefixsize);
 BA.debugLineNum = 250;BA.debugLine="Dim caption_topmsg As String = root_photo.Get";
Debug.ShouldStop(33554432);
_caption_topmsg = BA.ObjectToString(_root_photo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("caption_topmsg")))));Debug.locals.put("caption_topmsg", _caption_topmsg);Debug.locals.put("caption_topmsg", _caption_topmsg);
 BA.debugLineNum = 251;BA.debugLine="Dim photoid_path As String = root_photo.Get(\"";
Debug.ShouldStop(67108864);
_photoid_path = BA.ObjectToString(_root_photo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photoid_path")))));Debug.locals.put("photoid_path", _photoid_path);Debug.locals.put("photoid_path", _photoid_path);
 BA.debugLineNum = 252;BA.debugLine="Dim photoid_downloadedSize As Int = root_phot";
Debug.ShouldStop(134217728);
_photoid_downloadedsize = BA.numberCast(int.class, _root_photo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photoid_downloadedSize")))));Debug.locals.put("photoid_downloadedSize", _photoid_downloadedsize);Debug.locals.put("photoid_downloadedSize", _photoid_downloadedsize);
 BA.debugLineNum = 253;BA.debugLine="Dim photoid_height As Int = root_photo.Get(\"p";
Debug.ShouldStop(268435456);
_photoid_height = BA.numberCast(int.class, _root_photo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photoid_height")))));Debug.locals.put("photoid_height", _photoid_height);Debug.locals.put("photoid_height", _photoid_height);
 BA.debugLineNum = 254;BA.debugLine="Dim photoid_type As String = root_photo.Get(\"";
Debug.ShouldStop(536870912);
_photoid_type = BA.ObjectToString(_root_photo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photoid_type")))));Debug.locals.put("photoid_type", _photoid_type);Debug.locals.put("photoid_type", _photoid_type);
 BA.debugLineNum = 255;BA.debugLine="Dim photoid_size As Int = root_photo.Get(\"pho";
Debug.ShouldStop(1073741824);
_photoid_size = BA.numberCast(int.class, _root_photo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photoid_size")))));Debug.locals.put("photoid_size", _photoid_size);Debug.locals.put("photoid_size", _photoid_size);
 BA.debugLineNum = 256;BA.debugLine="Dim caption_id As String = root_photo.Get(\"ca";
Debug.ShouldStop(-2147483648);
_caption_id = BA.ObjectToString(_root_photo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("caption_id")))));Debug.locals.put("caption_id", _caption_id);Debug.locals.put("caption_id", _caption_id);
 BA.debugLineNum = 257;BA.debugLine="Dim photoid_width As Int = root_photo.Get(\"ph";
Debug.ShouldStop(1);
_photoid_width = BA.numberCast(int.class, _root_photo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photoid_width")))));Debug.locals.put("photoid_width", _photoid_width);Debug.locals.put("photoid_width", _photoid_width);
 BA.debugLineNum = 258;BA.debugLine="Dim photoid_isDownloadingActive As String = r";
Debug.ShouldStop(2);
_photoid_isdownloadingactive = BA.ObjectToString(_root_photo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photoid_isDownloadingActive")))));Debug.locals.put("photoid_isDownloadingActive", _photoid_isdownloadingactive);Debug.locals.put("photoid_isDownloadingActive", _photoid_isdownloadingactive);
 BA.debugLineNum = 259;BA.debugLine="Dim photoid_remote As String = root_photo.Get";
Debug.ShouldStop(4);
_photoid_remote = BA.ObjectToString(_root_photo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photoid_remote")))));Debug.locals.put("photoid_remote", _photoid_remote);Debug.locals.put("photoid_remote", _photoid_remote);
 BA.debugLineNum = 260;BA.debugLine="Dim photoid_canBeDownloaded As String = root_";
Debug.ShouldStop(8);
_photoid_canbedownloaded = BA.ObjectToString(_root_photo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photoid_canBeDownloaded")))));Debug.locals.put("photoid_canBeDownloaded", _photoid_canbedownloaded);Debug.locals.put("photoid_canBeDownloaded", _photoid_canbedownloaded);
 BA.debugLineNum = 261;BA.debugLine="Dim photoid_canBeDeleted As String = root_pho";
Debug.ShouldStop(16);
_photoid_canbedeleted = BA.ObjectToString(_root_photo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photoid_canBeDeleted")))));Debug.locals.put("photoid_canBeDeleted", _photoid_canbedeleted);Debug.locals.put("photoid_canBeDeleted", _photoid_canbedeleted);
 BA.debugLineNum = 265;BA.debugLine="Log(\"path \"&photoid_topmsg)";
Debug.ShouldStop(256);
act_chat.mostCurrent.__c.runVoidMethod ("LogImpl","619267655",RemoteObject.concat(RemoteObject.createImmutable("path "),_photoid_topmsg),0);
 BA.debugLineNum = 267;BA.debugLine="If photoid_path=\"\" Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",_photoid_path,BA.ObjectToString(""))) { 
 BA.debugLineNum = 268;BA.debugLine="LogColor(\"in downloading\",Colors.Red)";
Debug.ShouldStop(2048);
act_chat.mostCurrent.__c.runVoidMethod ("LogImpl","619267658",BA.ObjectToString("in downloading"),act_chat.mostCurrent.__c.getField(false,"Colors").getField(true,"Red"));
 BA.debugLineNum = 270;BA.debugLine="telegs.downloadFile(photoid_topmsg)";
Debug.ShouldStop(8192);
act_chat.mostCurrent._telegs.runVoidMethod ("downloadFile",(Object)(_photoid_topmsg));
 }else {
 BA.debugLineNum = 274;BA.debugLine="Log(photoid_path)";
Debug.ShouldStop(131072);
act_chat.mostCurrent.__c.runVoidMethod ("LogImpl","619267664",_photoid_path,0);
 BA.debugLineNum = 275;BA.debugLine="Dim Item As Adapter";
Debug.ShouldStop(262144);
_item = RemoteObject.createNew ("com.it.fome.act_chat._adapter");Debug.locals.put("Item", _item);
 BA.debugLineNum = 276;BA.debugLine="Item.ViewType =MINEST";
Debug.ShouldStop(524288);
_item.setField ("ViewType" /*RemoteObject*/ ,act_chat._minest);
 BA.debugLineNum = 277;BA.debugLine="Item.img_my = photoid_path";
Debug.ShouldStop(1048576);
_item.setField ("img_my" /*RemoteObject*/ ,_photoid_path);
 BA.debugLineNum = 278;BA.debugLine="Item.img_id=photoid_topmsg";
Debug.ShouldStop(2097152);
_item.setField ("img_id" /*RemoteObject*/ ,BA.NumberToString(_photoid_topmsg));
 BA.debugLineNum = 279;BA.debugLine="If caption_topmsg=\"null\" Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",_caption_topmsg,BA.ObjectToString("null"))) { 
 }else {
 BA.debugLineNum = 281;BA.debugLine="Item.caption_topmsg=caption_topmsg";
Debug.ShouldStop(16777216);
_item.setField ("caption_topmsg" /*RemoteObject*/ ,_caption_topmsg);
 };
 BA.debugLineNum = 284;BA.debugLine="Item.img_isdwonload=photoid_isDownloadingCom";
Debug.ShouldStop(134217728);
_item.setField ("img_isdwonload" /*RemoteObject*/ ,_photoid_isdownloadingcompleted.runMethod(true,"toLowerCase"));
 BA.debugLineNum = 285;BA.debugLine="Item.img_remote=photoid_remote";
Debug.ShouldStop(268435456);
_item.setField ("img_remote" /*RemoteObject*/ ,_photoid_remote);
 BA.debugLineNum = 286;BA.debugLine="Item.msg_id=meg_id";
Debug.ShouldStop(536870912);
_item.setField ("msg_id" /*RemoteObject*/ ,BA.NumberToString(_meg_id));
 BA.debugLineNum = 288;BA.debugLine="ItemList.Add(Item)";
Debug.ShouldStop(-2147483648);
act_chat.mostCurrent._itemlist.runVoidMethod ("Add",(Object)((_item)));
 BA.debugLineNum = 290;BA.debugLine="LV.notifyItemAdded";
Debug.ShouldStop(2);
act_chat.mostCurrent._lv.runVoidMethodAndSync ("notifyItemAdded");
 };
 break; }
}
;
 BA.debugLineNum = 315;BA.debugLine="Log(meg_id)";
Debug.ShouldStop(67108864);
act_chat.mostCurrent.__c.runVoidMethod ("LogImpl","619267705",BA.NumberToString(_meg_id),0);
 }
}Debug.locals.put("colroot", _colroot);
;
 BA.debugLineNum = 322;BA.debugLine="LV.notifyDataSetChanged";
Debug.ShouldStop(2);
act_chat.mostCurrent._lv.runVoidMethodAndSync ("notifyDataSetChanged");
 BA.debugLineNum = 323;BA.debugLine="If ItemList.Size<2 Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("<",act_chat.mostCurrent._itemlist.runMethod(true,"getSize"),BA.numberCast(double.class, 2))) { 
 BA.debugLineNum = 324;BA.debugLine="telegs.getChatHistory(chat_id,0,0,100,False)";
Debug.ShouldStop(8);
act_chat.mostCurrent._telegs.runVoidMethod ("getChatHistory",(Object)(BA.numberCast(long.class, act_chat._chat_id)),(Object)(BA.numberCast(long.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 100)),(Object)(act_chat.mostCurrent.__c.getField(true,"False")));
 };
 };
 BA.debugLineNum = 331;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _telegs_imgaddress(RemoteObject _respon) throws Exception{
try {
		Debug.PushSubsStack("telegs_imgaddress (act_chat) ","act_chat",16,act_chat.mostCurrent.activityBA,act_chat.mostCurrent,1037);
if (RapidSub.canDelegate("telegs_imgaddress")) { return com.it.fome.act_chat.remoteMe.runUserSub(false, "act_chat","telegs_imgaddress", _respon);}
Debug.locals.put("respon", _respon);
 BA.debugLineNum = 1037;BA.debugLine="Sub telegs_imgaddress(respon As String)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 1039;BA.debugLine="LogColor(\"img addres\",Colors.Red)";
Debug.ShouldStop(16384);
act_chat.mostCurrent.__c.runVoidMethod ("LogImpl","621430274",BA.ObjectToString("img addres"),act_chat.mostCurrent.__c.getField(false,"Colors").getField(true,"Red"));
 BA.debugLineNum = 1041;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("telegs_update_file (act_chat) ","act_chat",16,act_chat.mostCurrent.activityBA,act_chat.mostCurrent,1043);
if (RapidSub.canDelegate("telegs_update_file")) { return com.it.fome.act_chat.remoteMe.runUserSub(false, "act_chat","telegs_update_file", _respon);}
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
RemoteObject _itema = RemoteObject.declareNull("com.it.fome.act_chat._adapter");
Debug.locals.put("respon", _respon);
 BA.debugLineNum = 1043;BA.debugLine="Sub telegs_update_file(respon As String)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 1045;BA.debugLine="LogColor(respon,Colors.Blue)";
Debug.ShouldStop(1048576);
act_chat.mostCurrent.__c.runVoidMethod ("LogImpl","621495810",_respon,act_chat.mostCurrent.__c.getField(false,"Colors").getField(true,"Blue"));
 BA.debugLineNum = 1046;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(2097152);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 1047;BA.debugLine="parser.Initialize(respon)";
Debug.ShouldStop(4194304);
_parser.runVoidMethod ("Initialize",(Object)(_respon));
 BA.debugLineNum = 1048;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(8388608);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 1049;BA.debugLine="Dim photof_remot_id As String = root.Get(\"photof_";
Debug.ShouldStop(16777216);
_photof_remot_id = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photof_remot_id")))));Debug.locals.put("photof_remot_id", _photof_remot_id);Debug.locals.put("photof_remot_id", _photof_remot_id);
 BA.debugLineNum = 1050;BA.debugLine="Dim photof_local_candownload As String = root.Get";
Debug.ShouldStop(33554432);
_photof_local_candownload = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photof_local_candownload")))));Debug.locals.put("photof_local_candownload", _photof_local_candownload);Debug.locals.put("photof_local_candownload", _photof_local_candownload);
 BA.debugLineNum = 1051;BA.debugLine="Dim photof_local_isdownload As String = root.Get(";
Debug.ShouldStop(67108864);
_photof_local_isdownload = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photof_local_isdownload")))));Debug.locals.put("photof_local_isdownload", _photof_local_isdownload);Debug.locals.put("photof_local_isdownload", _photof_local_isdownload);
 BA.debugLineNum = 1052;BA.debugLine="Dim photof_expectedSize As Int = root.Get(\"photof";
Debug.ShouldStop(134217728);
_photof_expectedsize = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photof_expectedSize")))));Debug.locals.put("photof_expectedSize", _photof_expectedsize);Debug.locals.put("photof_expectedSize", _photof_expectedsize);
 BA.debugLineNum = 1053;BA.debugLine="Dim photof_remot_uploadsize As Int = root.Get(\"ph";
Debug.ShouldStop(268435456);
_photof_remot_uploadsize = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photof_remot_uploadsize")))));Debug.locals.put("photof_remot_uploadsize", _photof_remot_uploadsize);Debug.locals.put("photof_remot_uploadsize", _photof_remot_uploadsize);
 BA.debugLineNum = 1054;BA.debugLine="Dim photof_size As Int = root.Get(\"photof_size\")";
Debug.ShouldStop(536870912);
_photof_size = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photof_size")))));Debug.locals.put("photof_size", _photof_size);Debug.locals.put("photof_size", _photof_size);
 BA.debugLineNum = 1055;BA.debugLine="Dim photof_remot_isuploadactive As String = root.";
Debug.ShouldStop(1073741824);
_photof_remot_isuploadactive = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photof_remot_isuploadactive")))));Debug.locals.put("photof_remot_isuploadactive", _photof_remot_isuploadactive);Debug.locals.put("photof_remot_isuploadactive", _photof_remot_isuploadactive);
 BA.debugLineNum = 1056;BA.debugLine="Dim photof_local_perfexsize As Int = root.Get(\"ph";
Debug.ShouldStop(-2147483648);
_photof_local_perfexsize = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photof_local_perfexsize")))));Debug.locals.put("photof_local_perfexsize", _photof_local_perfexsize);Debug.locals.put("photof_local_perfexsize", _photof_local_perfexsize);
 BA.debugLineNum = 1057;BA.debugLine="Dim photof_remot_isuploadcomplit As String = root";
Debug.ShouldStop(1);
_photof_remot_isuploadcomplit = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photof_remot_isuploadcomplit")))));Debug.locals.put("photof_remot_isuploadcomplit", _photof_remot_isuploadcomplit);Debug.locals.put("photof_remot_isuploadcomplit", _photof_remot_isuploadcomplit);
 BA.debugLineNum = 1058;BA.debugLine="Dim photof_local_downloadsize As Int = root.Get(\"";
Debug.ShouldStop(2);
_photof_local_downloadsize = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photof_local_downloadsize")))));Debug.locals.put("photof_local_downloadsize", _photof_local_downloadsize);Debug.locals.put("photof_local_downloadsize", _photof_local_downloadsize);
 BA.debugLineNum = 1059;BA.debugLine="Dim photof_local_canbedlelte As String = root.Get";
Debug.ShouldStop(4);
_photof_local_canbedlelte = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photof_local_canbedlelte")))));Debug.locals.put("photof_local_canbedlelte", _photof_local_canbedlelte);Debug.locals.put("photof_local_canbedlelte", _photof_local_canbedlelte);
 BA.debugLineNum = 1060;BA.debugLine="Dim photof_id As Int = root.Get(\"photof_id\")";
Debug.ShouldStop(8);
_photof_id = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photof_id")))));Debug.locals.put("photof_id", _photof_id);Debug.locals.put("photof_id", _photof_id);
 BA.debugLineNum = 1061;BA.debugLine="Dim photof_local_isdowloaded As String = root.Get";
Debug.ShouldStop(16);
_photof_local_isdowloaded = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photof_local_isdowloaded")))));Debug.locals.put("photof_local_isdowloaded", _photof_local_isdowloaded);Debug.locals.put("photof_local_isdowloaded", _photof_local_isdowloaded);
 BA.debugLineNum = 1062;BA.debugLine="Dim photof_localpath As String = root.Get(\"photof";
Debug.ShouldStop(32);
_photof_localpath = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photof_localpath")))));Debug.locals.put("photof_localpath", _photof_localpath);Debug.locals.put("photof_localpath", _photof_localpath);
 BA.debugLineNum = 1064;BA.debugLine="Log(\" isdowloaded \"&photof_local_isdowloaded&\" si";
Debug.ShouldStop(128);
act_chat.mostCurrent.__c.runVoidMethod ("LogImpl","621495829",RemoteObject.concat(RemoteObject.createImmutable(" isdowloaded "),_photof_local_isdowloaded,RemoteObject.createImmutable(" size "),_photof_size,RemoteObject.createImmutable(" dl size : "),_photof_local_downloadsize,RemoteObject.createImmutable(" is download "),_photof_local_isdownload,RemoteObject.createImmutable(" can dl : "),_photof_local_candownload),0);
 BA.debugLineNum = 1065;BA.debugLine="Log(\"p : \"&photof_localpath)";
Debug.ShouldStop(256);
act_chat.mostCurrent.__c.runVoidMethod ("LogImpl","621495830",RemoteObject.concat(RemoteObject.createImmutable("p : "),_photof_localpath),0);
 BA.debugLineNum = 1067;BA.debugLine="Try";
Debug.ShouldStop(1024);
try { BA.debugLineNum = 1068;BA.debugLine="If photof_local_isdowloaded=\"true\" Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",_photof_local_isdowloaded,BA.ObjectToString("true"))) { 
 BA.debugLineNum = 1069;BA.debugLine="For ss=0 To ItemList.Size-1";
Debug.ShouldStop(4096);
{
final int step23 = 1;
final int limit23 = RemoteObject.solve(new RemoteObject[] {act_chat.mostCurrent._itemlist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_ss = 0 ;
for (;(step23 > 0 && _ss <= limit23) || (step23 < 0 && _ss >= limit23) ;_ss = ((int)(0 + _ss + step23))  ) {
Debug.locals.put("ss", _ss);
 BA.debugLineNum = 1070;BA.debugLine="Dim Itema = ItemList.Get(ss) As Adapter";
Debug.ShouldStop(8192);
_itema = (act_chat.mostCurrent._itemlist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _ss))));Debug.locals.put("Itema", _itema);Debug.locals.put("Itema", _itema);
 BA.debugLineNum = 1071;BA.debugLine="If Itema.img_id=photof_id Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_itema.getField(true,"img_id" /*RemoteObject*/ ),BA.NumberToString(_photof_id))) { 
 BA.debugLineNum = 1072;BA.debugLine="Log(ss&\" img id ready!\")";
Debug.ShouldStop(32768);
act_chat.mostCurrent.__c.runVoidMethod ("LogImpl","621495837",RemoteObject.concat(RemoteObject.createImmutable(_ss),RemoteObject.createImmutable(" img id ready!")),0);
 BA.debugLineNum = 1073;BA.debugLine="Itema.ViewType =MINEST";
Debug.ShouldStop(65536);
_itema.setField ("ViewType" /*RemoteObject*/ ,act_chat._minest);
 BA.debugLineNum = 1074;BA.debugLine="Itema.img_my = photof_localpath";
Debug.ShouldStop(131072);
_itema.setField ("img_my" /*RemoteObject*/ ,_photof_localpath);
 BA.debugLineNum = 1075;BA.debugLine="Itema.img_isdwonload=photof_local_isdowloaded";
Debug.ShouldStop(262144);
_itema.setField ("img_isdwonload" /*RemoteObject*/ ,_photof_local_isdowloaded);
 BA.debugLineNum = 1076;BA.debugLine="Itema.img_remote=photof_remot_id";
Debug.ShouldStop(524288);
_itema.setField ("img_remote" /*RemoteObject*/ ,_photof_remot_id);
 BA.debugLineNum = 1077;BA.debugLine="Itema.img_id=photof_id";
Debug.ShouldStop(1048576);
_itema.setField ("img_id" /*RemoteObject*/ ,BA.NumberToString(_photof_id));
 BA.debugLineNum = 1079;BA.debugLine="LV.notifyItemChanged(ss)";
Debug.ShouldStop(4194304);
act_chat.mostCurrent._lv.runVoidMethod ("notifyItemChanged",(Object)(BA.numberCast(int.class, _ss)));
 };
 }
}Debug.locals.put("ss", _ss);
;
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e37) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_chat.processBA, e37.toString()); BA.debugLineNum = 1088;BA.debugLine="Log(LastException)";
Debug.ShouldStop(-2147483648);
act_chat.mostCurrent.__c.runVoidMethod ("LogImpl","621495853",BA.ObjectToString(act_chat.mostCurrent.__c.runMethod(false,"LastException",act_chat.mostCurrent.activityBA)),0);
 };
 BA.debugLineNum = 1097;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("telegs_update_newmsg (act_chat) ","act_chat",16,act_chat.mostCurrent.activityBA,act_chat.mostCurrent,885);
if (RapidSub.canDelegate("telegs_update_newmsg")) { return com.it.fome.act_chat.remoteMe.runUserSub(false, "act_chat","telegs_update_newmsg", _value);}
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colroot = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _meg_replytomessageid = RemoteObject.createImmutable(0);
RemoteObject _meg_chatid = RemoteObject.createImmutable(0L);
RemoteObject _meg_senderuserid = RemoteObject.createImmutable(0);
RemoteObject _meg_editdate = RemoteObject.createImmutable(0);
RemoteObject _meg_ispost = RemoteObject.createImmutable("");
RemoteObject _meg_id = RemoteObject.createImmutable(0L);
RemoteObject _meg_views = RemoteObject.createImmutable(0);
RemoteObject _msg_type = RemoteObject.createImmutable("");
RemoteObject _meg_canbedeleted = RemoteObject.createImmutable("");
RemoteObject _massege_info = RemoteObject.createImmutable("");
RemoteObject _meg_viabotuserid = RemoteObject.createImmutable(0);
RemoteObject _meg_date = RemoteObject.createImmutable(0);
RemoteObject _meg_canbeedited = RemoteObject.createImmutable("");
RemoteObject _replymarkup = RemoteObject.createImmutable("");
RemoteObject _parser_msg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _root_msg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msg_text = RemoteObject.createImmutable("");
RemoteObject _item = RemoteObject.declareNull("com.it.fome.act_chat._adapter");
RemoteObject _parser_photo = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _root_photo = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _photoid_isdownloadingcompleted = RemoteObject.createImmutable("");
RemoteObject _photoid_topmsg = RemoteObject.createImmutable(0);
RemoteObject _photoid_downloadedprefixsize = RemoteObject.createImmutable(0);
RemoteObject _caption_topmsg = RemoteObject.createImmutable("");
RemoteObject _photoid_path = RemoteObject.createImmutable("");
RemoteObject _photoid_downloadedsize = RemoteObject.createImmutable(0);
RemoteObject _photoid_height = RemoteObject.createImmutable(0);
RemoteObject _photoid_type = RemoteObject.createImmutable("");
RemoteObject _photoid_size = RemoteObject.createImmutable(0);
RemoteObject _caption_id = RemoteObject.createImmutable("");
RemoteObject _photoid_width = RemoteObject.createImmutable(0);
RemoteObject _photoid_isdownloadingactive = RemoteObject.createImmutable("");
RemoteObject _photoid_remote = RemoteObject.createImmutable("");
RemoteObject _photoid_canbedownloaded = RemoteObject.createImmutable("");
RemoteObject _photoid_canbedeleted = RemoteObject.createImmutable("");
Debug.locals.put("value", _value);
 BA.debugLineNum = 885;BA.debugLine="Sub telegs_update_newmsg(value As String)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 886;BA.debugLine="Log(\"in chat : \"&value)";
Debug.ShouldStop(2097152);
act_chat.mostCurrent.__c.runVoidMethod ("LogImpl","621364737",RemoteObject.concat(RemoteObject.createImmutable("in chat : "),_value),0);
 BA.debugLineNum = 887;BA.debugLine="If value =\"\" Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",_value,BA.ObjectToString(""))) { 
 BA.debugLineNum = 888;BA.debugLine="Return";
Debug.ShouldStop(8388608);
if (true) return RemoteObject.createImmutable("");
 }else {
 BA.debugLineNum = 890;BA.debugLine="Log(\"chats ready!\")";
Debug.ShouldStop(33554432);
act_chat.mostCurrent.__c.runVoidMethod ("LogImpl","621364741",RemoteObject.createImmutable("chats ready!"),0);
 BA.debugLineNum = 891;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(67108864);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 892;BA.debugLine="parser.Initialize(value)";
Debug.ShouldStop(134217728);
_parser.runVoidMethod ("Initialize",(Object)(_value));
 BA.debugLineNum = 893;BA.debugLine="Dim root As List = parser.NextArray";
Debug.ShouldStop(268435456);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_root = _parser.runMethod(false,"NextArray");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 894;BA.debugLine="For Each colroot As Map In root";
Debug.ShouldStop(536870912);
_colroot = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group9 = _root;
final int groupLen9 = group9.runMethod(true,"getSize").<Integer>get()
;int index9 = 0;
;
for (; index9 < groupLen9;index9++){
_colroot.setObject(group9.runMethod(false,"Get",index9));
Debug.locals.put("colroot", _colroot);
 BA.debugLineNum = 895;BA.debugLine="Dim meg_replyToMessageId As Int = colroot.Get(\"";
Debug.ShouldStop(1073741824);
_meg_replytomessageid = BA.numberCast(int.class, _colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("meg_replyToMessageId")))));Debug.locals.put("meg_replyToMessageId", _meg_replytomessageid);Debug.locals.put("meg_replyToMessageId", _meg_replytomessageid);
 BA.debugLineNum = 896;BA.debugLine="Dim meg_chatId As Long = colroot.Get(\"meg_chatI";
Debug.ShouldStop(-2147483648);
_meg_chatid = BA.numberCast(long.class, _colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("meg_chatId")))));Debug.locals.put("meg_chatId", _meg_chatid);Debug.locals.put("meg_chatId", _meg_chatid);
 BA.debugLineNum = 897;BA.debugLine="If chat_id=meg_chatId Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",act_chat._chat_id,BA.NumberToString(_meg_chatid))) { 
 BA.debugLineNum = 899;BA.debugLine="Dim meg_senderUserId As Int = colroot.Get(\"meg";
Debug.ShouldStop(4);
_meg_senderuserid = BA.numberCast(int.class, _colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("meg_senderUserId")))));Debug.locals.put("meg_senderUserId", _meg_senderuserid);Debug.locals.put("meg_senderUserId", _meg_senderuserid);
 BA.debugLineNum = 900;BA.debugLine="Dim meg_editDate As Int = colroot.Get(\"meg_edi";
Debug.ShouldStop(8);
_meg_editdate = BA.numberCast(int.class, _colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("meg_editDate")))));Debug.locals.put("meg_editDate", _meg_editdate);Debug.locals.put("meg_editDate", _meg_editdate);
 BA.debugLineNum = 901;BA.debugLine="Dim meg_isPost As String = colroot.Get(\"meg_is";
Debug.ShouldStop(16);
_meg_ispost = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("meg_isPost")))));Debug.locals.put("meg_isPost", _meg_ispost);Debug.locals.put("meg_isPost", _meg_ispost);
 BA.debugLineNum = 902;BA.debugLine="Dim meg_id As Long = colroot.Get(\"meg_id\")";
Debug.ShouldStop(32);
_meg_id = BA.numberCast(long.class, _colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("meg_id")))));Debug.locals.put("meg_id", _meg_id);Debug.locals.put("meg_id", _meg_id);
 BA.debugLineNum = 904;BA.debugLine="Dim meg_views As Int = colroot.Get(\"meg_views\"";
Debug.ShouldStop(128);
_meg_views = BA.numberCast(int.class, _colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("meg_views")))));Debug.locals.put("meg_views", _meg_views);Debug.locals.put("meg_views", _meg_views);
 BA.debugLineNum = 905;BA.debugLine="Dim msg_type As String = colroot.Get(\"msg_type";
Debug.ShouldStop(256);
_msg_type = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msg_type")))));Debug.locals.put("msg_type", _msg_type);Debug.locals.put("msg_type", _msg_type);
 BA.debugLineNum = 906;BA.debugLine="Dim meg_canBeDeleted As String = colroot.Get(\"";
Debug.ShouldStop(512);
_meg_canbedeleted = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("meg_canBeDeleted")))));Debug.locals.put("meg_canBeDeleted", _meg_canbedeleted);Debug.locals.put("meg_canBeDeleted", _meg_canbedeleted);
 BA.debugLineNum = 907;BA.debugLine="Dim massege_info As String = colroot.Get(\"mass";
Debug.ShouldStop(1024);
_massege_info = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("massege_info")))));Debug.locals.put("massege_info", _massege_info);Debug.locals.put("massege_info", _massege_info);
 BA.debugLineNum = 908;BA.debugLine="Dim meg_viaBotUserId As Int = colroot.Get(\"meg";
Debug.ShouldStop(2048);
_meg_viabotuserid = BA.numberCast(int.class, _colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("meg_viaBotUserId")))));Debug.locals.put("meg_viaBotUserId", _meg_viabotuserid);Debug.locals.put("meg_viaBotUserId", _meg_viabotuserid);
 BA.debugLineNum = 909;BA.debugLine="Dim meg_date As Int = colroot.Get(\"meg_date\")";
Debug.ShouldStop(4096);
_meg_date = BA.numberCast(int.class, _colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("meg_date")))));Debug.locals.put("meg_date", _meg_date);Debug.locals.put("meg_date", _meg_date);
 BA.debugLineNum = 910;BA.debugLine="Dim meg_canBeEdited As String = colroot.Get(\"m";
Debug.ShouldStop(8192);
_meg_canbeedited = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("meg_canBeEdited")))));Debug.locals.put("meg_canBeEdited", _meg_canbeedited);Debug.locals.put("meg_canBeEdited", _meg_canbeedited);
 BA.debugLineNum = 911;BA.debugLine="Dim ReplyMarkup As String = colroot.Get(\"Reply";
Debug.ShouldStop(16384);
_replymarkup = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ReplyMarkup")))));Debug.locals.put("ReplyMarkup", _replymarkup);Debug.locals.put("ReplyMarkup", _replymarkup);
 BA.debugLineNum = 912;BA.debugLine="Log(\"ReplyMarkup: \"&msg_type)";
Debug.ShouldStop(32768);
act_chat.mostCurrent.__c.runVoidMethod ("LogImpl","621364763",RemoteObject.concat(RemoteObject.createImmutable("ReplyMarkup: "),_msg_type),0);
 BA.debugLineNum = 914;BA.debugLine="Select msg_type";
Debug.ShouldStop(131072);
switch (BA.switchObjectToInt(_msg_type,BA.ObjectToString("message"),BA.ObjectToString("photo"))) {
case 0: {
 BA.debugLineNum = 916;BA.debugLine="Dim parser_msg As JSONParser";
Debug.ShouldStop(524288);
_parser_msg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser_msg", _parser_msg);
 BA.debugLineNum = 917;BA.debugLine="parser_msg.Initialize(massege_info)";
Debug.ShouldStop(1048576);
_parser_msg.runVoidMethod ("Initialize",(Object)(_massege_info));
 BA.debugLineNum = 918;BA.debugLine="Dim root_msg As Map = parser_msg.NextObject";
Debug.ShouldStop(2097152);
_root_msg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root_msg = _parser_msg.runMethod(false,"NextObject");Debug.locals.put("root_msg", _root_msg);Debug.locals.put("root_msg", _root_msg);
 BA.debugLineNum = 919;BA.debugLine="Dim msg_text As String = root_msg.Get(\"msg_t";
Debug.ShouldStop(4194304);
_msg_text = BA.ObjectToString(_root_msg.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msg_text")))));Debug.locals.put("msg_text", _msg_text);Debug.locals.put("msg_text", _msg_text);
 BA.debugLineNum = 920;BA.debugLine="Log(msg_text)";
Debug.ShouldStop(8388608);
act_chat.mostCurrent.__c.runVoidMethod ("LogImpl","621364771",_msg_text,0);
 BA.debugLineNum = 921;BA.debugLine="Dim Item As Adapter";
Debug.ShouldStop(16777216);
_item = RemoteObject.createNew ("com.it.fome.act_chat._adapter");Debug.locals.put("Item", _item);
 BA.debugLineNum = 922;BA.debugLine="Item.ViewType =Their";
Debug.ShouldStop(33554432);
_item.setField ("ViewType" /*RemoteObject*/ ,act_chat._their);
 BA.debugLineNum = 923;BA.debugLine="Item.TheirText = msg_text";
Debug.ShouldStop(67108864);
_item.setField ("TheirText" /*RemoteObject*/ ,_msg_text);
 BA.debugLineNum = 924;BA.debugLine="Item.msg_id=meg_id";
Debug.ShouldStop(134217728);
_item.setField ("msg_id" /*RemoteObject*/ ,BA.NumberToString(_meg_id));
 BA.debugLineNum = 927;BA.debugLine="ItemList.InsertAt(0,Item)";
Debug.ShouldStop(1073741824);
act_chat.mostCurrent._itemlist.runVoidMethod ("InsertAt",(Object)(BA.numberCast(int.class, 0)),(Object)((_item)));
 BA.debugLineNum = 929;BA.debugLine="LV.notifyItemInserted(0)";
Debug.ShouldStop(1);
act_chat.mostCurrent._lv.runVoidMethodAndSync ("notifyItemInserted",(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 931;BA.debugLine="LV.ScrollToPosition(0)";
Debug.ShouldStop(4);
act_chat.mostCurrent._lv.runVoidMethod ("ScrollToPosition",(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 932;BA.debugLine="msg_text=\"\"";
Debug.ShouldStop(8);
_msg_text = BA.ObjectToString("");Debug.locals.put("msg_text", _msg_text);
 break; }
case 1: {
 BA.debugLineNum = 935;BA.debugLine="Log(\"photo\")";
Debug.ShouldStop(64);
act_chat.mostCurrent.__c.runVoidMethod ("LogImpl","621364786",RemoteObject.createImmutable("photo"),0);
 BA.debugLineNum = 936;BA.debugLine="Dim parser_photo As JSONParser";
Debug.ShouldStop(128);
_parser_photo = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser_photo", _parser_photo);
 BA.debugLineNum = 937;BA.debugLine="parser_photo.Initialize(massege_info)";
Debug.ShouldStop(256);
_parser_photo.runVoidMethod ("Initialize",(Object)(_massege_info));
 BA.debugLineNum = 938;BA.debugLine="Dim root_photo As Map = parser_photo.NextObj";
Debug.ShouldStop(512);
_root_photo = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root_photo = _parser_photo.runMethod(false,"NextObject");Debug.locals.put("root_photo", _root_photo);Debug.locals.put("root_photo", _root_photo);
 BA.debugLineNum = 939;BA.debugLine="Dim photoid_isDownloadingCompleted As String";
Debug.ShouldStop(1024);
_photoid_isdownloadingcompleted = BA.ObjectToString(_root_photo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photoid_isDownloadingCompleted")))));Debug.locals.put("photoid_isDownloadingCompleted", _photoid_isdownloadingcompleted);Debug.locals.put("photoid_isDownloadingCompleted", _photoid_isdownloadingcompleted);
 BA.debugLineNum = 940;BA.debugLine="Dim photoid_topmsg As Int = root_photo.Get(\"";
Debug.ShouldStop(2048);
_photoid_topmsg = BA.numberCast(int.class, _root_photo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photoid_topmsg")))));Debug.locals.put("photoid_topmsg", _photoid_topmsg);Debug.locals.put("photoid_topmsg", _photoid_topmsg);
 BA.debugLineNum = 941;BA.debugLine="Dim photoid_downloadedPrefixSize As Int = ro";
Debug.ShouldStop(4096);
_photoid_downloadedprefixsize = BA.numberCast(int.class, _root_photo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photoid_downloadedPrefixSize")))));Debug.locals.put("photoid_downloadedPrefixSize", _photoid_downloadedprefixsize);Debug.locals.put("photoid_downloadedPrefixSize", _photoid_downloadedprefixsize);
 BA.debugLineNum = 942;BA.debugLine="Dim caption_topmsg As String = root_photo.Ge";
Debug.ShouldStop(8192);
_caption_topmsg = BA.ObjectToString(_root_photo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("caption_topmsg")))));Debug.locals.put("caption_topmsg", _caption_topmsg);Debug.locals.put("caption_topmsg", _caption_topmsg);
 BA.debugLineNum = 943;BA.debugLine="Dim photoid_path As String = root_photo.Get(";
Debug.ShouldStop(16384);
_photoid_path = BA.ObjectToString(_root_photo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photoid_path")))));Debug.locals.put("photoid_path", _photoid_path);Debug.locals.put("photoid_path", _photoid_path);
 BA.debugLineNum = 944;BA.debugLine="Dim photoid_downloadedSize As Int = root_pho";
Debug.ShouldStop(32768);
_photoid_downloadedsize = BA.numberCast(int.class, _root_photo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photoid_downloadedSize")))));Debug.locals.put("photoid_downloadedSize", _photoid_downloadedsize);Debug.locals.put("photoid_downloadedSize", _photoid_downloadedsize);
 BA.debugLineNum = 945;BA.debugLine="Dim photoid_height As Int = root_photo.Get(\"";
Debug.ShouldStop(65536);
_photoid_height = BA.numberCast(int.class, _root_photo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photoid_height")))));Debug.locals.put("photoid_height", _photoid_height);Debug.locals.put("photoid_height", _photoid_height);
 BA.debugLineNum = 946;BA.debugLine="Dim photoid_type As String = root_photo.Get(";
Debug.ShouldStop(131072);
_photoid_type = BA.ObjectToString(_root_photo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photoid_type")))));Debug.locals.put("photoid_type", _photoid_type);Debug.locals.put("photoid_type", _photoid_type);
 BA.debugLineNum = 947;BA.debugLine="Dim photoid_size As Int = root_photo.Get(\"ph";
Debug.ShouldStop(262144);
_photoid_size = BA.numberCast(int.class, _root_photo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photoid_size")))));Debug.locals.put("photoid_size", _photoid_size);Debug.locals.put("photoid_size", _photoid_size);
 BA.debugLineNum = 948;BA.debugLine="Dim caption_id As String = root_photo.Get(\"c";
Debug.ShouldStop(524288);
_caption_id = BA.ObjectToString(_root_photo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("caption_id")))));Debug.locals.put("caption_id", _caption_id);Debug.locals.put("caption_id", _caption_id);
 BA.debugLineNum = 949;BA.debugLine="Dim photoid_width As Int = root_photo.Get(\"p";
Debug.ShouldStop(1048576);
_photoid_width = BA.numberCast(int.class, _root_photo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photoid_width")))));Debug.locals.put("photoid_width", _photoid_width);Debug.locals.put("photoid_width", _photoid_width);
 BA.debugLineNum = 950;BA.debugLine="Dim photoid_isDownloadingActive As String =";
Debug.ShouldStop(2097152);
_photoid_isdownloadingactive = BA.ObjectToString(_root_photo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photoid_isDownloadingActive")))));Debug.locals.put("photoid_isDownloadingActive", _photoid_isdownloadingactive);Debug.locals.put("photoid_isDownloadingActive", _photoid_isdownloadingactive);
 BA.debugLineNum = 951;BA.debugLine="Dim photoid_remote As String = root_photo.Ge";
Debug.ShouldStop(4194304);
_photoid_remote = BA.ObjectToString(_root_photo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photoid_remote")))));Debug.locals.put("photoid_remote", _photoid_remote);Debug.locals.put("photoid_remote", _photoid_remote);
 BA.debugLineNum = 952;BA.debugLine="Dim photoid_canBeDownloaded As String = root";
Debug.ShouldStop(8388608);
_photoid_canbedownloaded = BA.ObjectToString(_root_photo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photoid_canBeDownloaded")))));Debug.locals.put("photoid_canBeDownloaded", _photoid_canbedownloaded);Debug.locals.put("photoid_canBeDownloaded", _photoid_canbedownloaded);
 BA.debugLineNum = 953;BA.debugLine="Dim photoid_canBeDeleted As String = root_ph";
Debug.ShouldStop(16777216);
_photoid_canbedeleted = BA.ObjectToString(_root_photo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photoid_canBeDeleted")))));Debug.locals.put("photoid_canBeDeleted", _photoid_canbedeleted);Debug.locals.put("photoid_canBeDeleted", _photoid_canbedeleted);
 BA.debugLineNum = 957;BA.debugLine="Log(\"path \"&caption_topmsg)";
Debug.ShouldStop(268435456);
act_chat.mostCurrent.__c.runVoidMethod ("LogImpl","621364808",RemoteObject.concat(RemoteObject.createImmutable("path "),_caption_topmsg),0);
 BA.debugLineNum = 958;BA.debugLine="If photoid_path=\"\" Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_photoid_path,BA.ObjectToString(""))) { 
 BA.debugLineNum = 959;BA.debugLine="LogColor(\"in downloading\",Colors.Red)";
Debug.ShouldStop(1073741824);
act_chat.mostCurrent.__c.runVoidMethod ("LogImpl","621364810",BA.ObjectToString("in downloading"),act_chat.mostCurrent.__c.getField(false,"Colors").getField(true,"Red"));
 BA.debugLineNum = 963;BA.debugLine="Dim Item As Adapter";
Debug.ShouldStop(4);
_item = RemoteObject.createNew ("com.it.fome.act_chat._adapter");Debug.locals.put("Item", _item);
 BA.debugLineNum = 964;BA.debugLine="Item.ViewType =MINEST";
Debug.ShouldStop(8);
_item.setField ("ViewType" /*RemoteObject*/ ,act_chat._minest);
 BA.debugLineNum = 965;BA.debugLine="Item.img_my = \"\"";
Debug.ShouldStop(16);
_item.setField ("img_my" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 967;BA.debugLine="If caption_topmsg=\"null\" Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_caption_topmsg,BA.ObjectToString("null"))) { 
 }else {
 BA.debugLineNum = 969;BA.debugLine="Item.caption_topmsg=caption_topmsg";
Debug.ShouldStop(256);
_item.setField ("caption_topmsg" /*RemoteObject*/ ,_caption_topmsg);
 };
 BA.debugLineNum = 972;BA.debugLine="Item.img_isdwonload=photoid_isDownloadingCo";
Debug.ShouldStop(2048);
_item.setField ("img_isdwonload" /*RemoteObject*/ ,_photoid_isdownloadingcompleted);
 BA.debugLineNum = 973;BA.debugLine="Item.img_remote=photoid_remote";
Debug.ShouldStop(4096);
_item.setField ("img_remote" /*RemoteObject*/ ,_photoid_remote);
 BA.debugLineNum = 974;BA.debugLine="Item.msg_id=meg_id";
Debug.ShouldStop(8192);
_item.setField ("msg_id" /*RemoteObject*/ ,BA.NumberToString(_meg_id));
 BA.debugLineNum = 975;BA.debugLine="Item.img_id=photoid_topmsg";
Debug.ShouldStop(16384);
_item.setField ("img_id" /*RemoteObject*/ ,BA.NumberToString(_photoid_topmsg));
 BA.debugLineNum = 978;BA.debugLine="ItemList.InsertAt(0,Item)";
Debug.ShouldStop(131072);
act_chat.mostCurrent._itemlist.runVoidMethod ("InsertAt",(Object)(BA.numberCast(int.class, 0)),(Object)((_item)));
 BA.debugLineNum = 981;BA.debugLine="LV.notifyDataSetChanged";
Debug.ShouldStop(1048576);
act_chat.mostCurrent._lv.runVoidMethodAndSync ("notifyDataSetChanged");
 BA.debugLineNum = 983;BA.debugLine="LV.SmoothScrollToPosition(0)";
Debug.ShouldStop(4194304);
act_chat.mostCurrent._lv.runVoidMethod ("SmoothScrollToPosition",(Object)(BA.numberCast(int.class, 0)));
 }else {
 BA.debugLineNum = 996;BA.debugLine="Log(photoid_path)";
Debug.ShouldStop(8);
act_chat.mostCurrent.__c.runVoidMethod ("LogImpl","621364847",_photoid_path,0);
 BA.debugLineNum = 997;BA.debugLine="Dim Item As Adapter";
Debug.ShouldStop(16);
_item = RemoteObject.createNew ("com.it.fome.act_chat._adapter");Debug.locals.put("Item", _item);
 BA.debugLineNum = 998;BA.debugLine="Item.ViewType =MINEST";
Debug.ShouldStop(32);
_item.setField ("ViewType" /*RemoteObject*/ ,act_chat._minest);
 BA.debugLineNum = 999;BA.debugLine="Item.img_my = photoid_path";
Debug.ShouldStop(64);
_item.setField ("img_my" /*RemoteObject*/ ,_photoid_path);
 BA.debugLineNum = 1000;BA.debugLine="Item.img_id=photoid_topmsg";
Debug.ShouldStop(128);
_item.setField ("img_id" /*RemoteObject*/ ,BA.NumberToString(_photoid_topmsg));
 BA.debugLineNum = 1001;BA.debugLine="Item.msg_id=meg_id";
Debug.ShouldStop(256);
_item.setField ("msg_id" /*RemoteObject*/ ,BA.NumberToString(_meg_id));
 BA.debugLineNum = 1002;BA.debugLine="If caption_topmsg=\"null\" Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_caption_topmsg,BA.ObjectToString("null"))) { 
 }else {
 BA.debugLineNum = 1004;BA.debugLine="Item.caption_topmsg=caption_topmsg";
Debug.ShouldStop(2048);
_item.setField ("caption_topmsg" /*RemoteObject*/ ,_caption_topmsg);
 };
 BA.debugLineNum = 1008;BA.debugLine="Item.img_remote=photoid_remote";
Debug.ShouldStop(32768);
_item.setField ("img_remote" /*RemoteObject*/ ,_photoid_remote);
 BA.debugLineNum = 1009;BA.debugLine="Item.img_isdwonload=photoid_isDownloadingCo";
Debug.ShouldStop(65536);
_item.setField ("img_isdwonload" /*RemoteObject*/ ,_photoid_isdownloadingcompleted);
 BA.debugLineNum = 1011;BA.debugLine="ItemList.InsertAt(0,Item)";
Debug.ShouldStop(262144);
act_chat.mostCurrent._itemlist.runVoidMethod ("InsertAt",(Object)(BA.numberCast(int.class, 0)),(Object)((_item)));
 BA.debugLineNum = 1015;BA.debugLine="LV.notifyItemInserted(0)";
Debug.ShouldStop(4194304);
act_chat.mostCurrent._lv.runVoidMethodAndSync ("notifyItemInserted",(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 1017;BA.debugLine="LV.SmoothScrollToPosition(0)";
Debug.ShouldStop(16777216);
act_chat.mostCurrent._lv.runVoidMethod ("SmoothScrollToPosition",(Object)(BA.numberCast(int.class, 0)));
 };
 break; }
}
;
 };
 }
}Debug.locals.put("colroot", _colroot);
;
 };
 BA.debugLineNum = 1035;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _telegs_viewdon(RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("telegs_viewdon (act_chat) ","act_chat",16,act_chat.mostCurrent.activityBA,act_chat.mostCurrent,1122);
if (RapidSub.canDelegate("telegs_viewdon")) { return com.it.fome.act_chat.remoteMe.runUserSub(false, "act_chat","telegs_viewdon", _value);}
Debug.locals.put("value", _value);
 BA.debugLineNum = 1122;BA.debugLine="Sub telegs_viewdon(value As String)";
Debug.ShouldStop(2);
 BA.debugLineNum = 1123;BA.debugLine="LogColor(\"view : \"&value,Colors.Blue)";
Debug.ShouldStop(4);
act_chat.mostCurrent.__c.runVoidMethod ("LogImpl","621692417",RemoteObject.concat(RemoteObject.createImmutable("view : "),_value),act_chat.mostCurrent.__c.getField(false,"Colors").getField(true,"Blue"));
 BA.debugLineNum = 1124;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _timer_tick() throws Exception{
try {
		Debug.PushSubsStack("Timer_Tick (act_chat) ","act_chat",16,act_chat.mostCurrent.activityBA,act_chat.mostCurrent,717);
if (RapidSub.canDelegate("timer_tick")) { return com.it.fome.act_chat.remoteMe.runUserSub(false, "act_chat","timer_tick");}
 BA.debugLineNum = 717;BA.debugLine="Sub Timer_Tick";
Debug.ShouldStop(4096);
 BA.debugLineNum = 718;BA.debugLine="Timer.Enabled = False";
Debug.ShouldStop(8192);
act_chat._timer.runMethod(true,"setEnabled",act_chat.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 719;BA.debugLine="AutoAnswer";
Debug.ShouldStop(16384);
_autoanswer();
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
public static RemoteObject  _timer2_tick() throws Exception{
try {
		Debug.PushSubsStack("Timer2_Tick (act_chat) ","act_chat",16,act_chat.mostCurrent.activityBA,act_chat.mostCurrent,722);
if (RapidSub.canDelegate("timer2_tick")) { return com.it.fome.act_chat.remoteMe.runUserSub(false, "act_chat","timer2_tick");}
 BA.debugLineNum = 722;BA.debugLine="Sub Timer2_Tick";
Debug.ShouldStop(131072);
 BA.debugLineNum = 723;BA.debugLine="Timer2.Enabled = False";
Debug.ShouldStop(262144);
act_chat._timer2.runMethod(true,"setEnabled",act_chat.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 724;BA.debugLine="AutoAnswer2";
Debug.ShouldStop(524288);
_autoanswer2();
 BA.debugLineNum = 725;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tm_tick() throws Exception{
try {
		Debug.PushSubsStack("TM_Tick (act_chat) ","act_chat",16,act_chat.mostCurrent.activityBA,act_chat.mostCurrent,767);
if (RapidSub.canDelegate("tm_tick")) { return com.it.fome.act_chat.remoteMe.runUserSub(false, "act_chat","tm_tick");}
 BA.debugLineNum = 767;BA.debugLine="Sub TM_Tick";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 768;BA.debugLine="q = q + 1";
Debug.ShouldStop(-2147483648);
act_chat._q = RemoteObject.solve(new RemoteObject[] {act_chat._q,RemoteObject.createImmutable(1)}, "+",1, 1);
 BA.debugLineNum = 769;BA.debugLine="q2 = q2 + 1";
Debug.ShouldStop(1);
act_chat._q2 = RemoteObject.solve(new RemoteObject[] {act_chat._q2,RemoteObject.createImmutable(1)}, "+",1, 1);
 BA.debugLineNum = 770;BA.debugLine="If q = 1 Then Status.Text = \"is typing\"";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",act_chat._q,BA.numberCast(double.class, 1))) { 
act_chat.mostCurrent._status.runMethod(true,"setText",BA.ObjectToCharSequence("is typing"));};
 BA.debugLineNum = 771;BA.debugLine="If q = 2 Then Status.Text = \"is typing .\"";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",act_chat._q,BA.numberCast(double.class, 2))) { 
act_chat.mostCurrent._status.runMethod(true,"setText",BA.ObjectToCharSequence("is typing ."));};
 BA.debugLineNum = 772;BA.debugLine="If q = 3 Then Status.Text = \"is typing ..\"";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",act_chat._q,BA.numberCast(double.class, 3))) { 
act_chat.mostCurrent._status.runMethod(true,"setText",BA.ObjectToCharSequence("is typing .."));};
 BA.debugLineNum = 773;BA.debugLine="If q = 4 Then Status.Text = \"is typing ...\"";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",act_chat._q,BA.numberCast(double.class, 4))) { 
act_chat.mostCurrent._status.runMethod(true,"setText",BA.ObjectToCharSequence("is typing ..."));};
 BA.debugLineNum = 774;BA.debugLine="If q > 4 Then q = 0";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean(">",act_chat._q,BA.numberCast(double.class, 4))) { 
act_chat._q = BA.numberCast(int.class, 0);};
 BA.debugLineNum = 775;BA.debugLine="If q2 = 20 Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",act_chat._q2,BA.numberCast(double.class, 20))) { 
 BA.debugLineNum = 776;BA.debugLine="tm.Enabled = False";
Debug.ShouldStop(128);
act_chat._tm.runMethod(true,"setEnabled",act_chat.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 777;BA.debugLine="LV.notifyItemAdded";
Debug.ShouldStop(256);
act_chat.mostCurrent._lv.runVoidMethodAndSync ("notifyItemAdded");
 BA.debugLineNum = 778;BA.debugLine="LV.SmoothScrollToPosition(ItemList.Size)";
Debug.ShouldStop(512);
act_chat.mostCurrent._lv.runVoidMethod ("SmoothScrollToPosition",(Object)(act_chat.mostCurrent._itemlist.runMethod(true,"getSize")));
 BA.debugLineNum = 779;BA.debugLine="Status.Text = \"online\"";
Debug.ShouldStop(1024);
act_chat.mostCurrent._status.runMethod(true,"setText",BA.ObjectToCharSequence("online"));
 BA.debugLineNum = 780;BA.debugLine="q2 = 0";
Debug.ShouldStop(2048);
act_chat._q2 = BA.numberCast(int.class, 0);
 };
 BA.debugLineNum = 782;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _upload(RemoteObject _filename,RemoteObject _emailn,RemoteObject _namen,RemoteObject _familyn) throws Exception{
try {
		Debug.PushSubsStack("upload (act_chat) ","act_chat",16,act_chat.mostCurrent.activityBA,act_chat.mostCurrent,1127);
if (RapidSub.canDelegate("upload")) { return com.it.fome.act_chat.remoteMe.runUserSub(false, "act_chat","upload", _filename, _emailn, _namen, _familyn);}
Debug.locals.put("filename", _filename);
Debug.locals.put("emailn", _emailn);
Debug.locals.put("namen", _namen);
Debug.locals.put("familyn", _familyn);
 BA.debugLineNum = 1127;BA.debugLine="Sub upload(filename As String,emailn As String,nam";
Debug.ShouldStop(64);
 BA.debugLineNum = 1128;BA.debugLine="upl=pr.BuildUploadQuery(\"http://filework.ir/INSTA";
Debug.ShouldStop(128);
act_chat.mostCurrent._upl = act_chat.mostCurrent._pr.runMethod(false,"BuildUploadQuery",(Object)(BA.ObjectToString("http://filework.ir/INSTAFOLLOW/api/upload.php")),(Object)(RemoteObject.createImmutable("t2")));
 BA.debugLineNum = 1132;BA.debugLine="File.Copy(\"\",filename,File.DirRootExternal,\"new.p";
Debug.ShouldStop(2048);
act_chat.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(BA.ObjectToString("")),(Object)(_filename),(Object)(act_chat.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirRootExternal")),(Object)(RemoteObject.createImmutable("new.png")));
 BA.debugLineNum = 1133;BA.debugLine="Log(File.DirRootExternal)";
Debug.ShouldStop(4096);
act_chat.mostCurrent.__c.runVoidMethod ("LogImpl","621757958",act_chat.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirRootExternal"),0);
 BA.debugLineNum = 1134;BA.debugLine="upl.addMultipartFile(\"uploaded_file\",filename)";
Debug.ShouldStop(8192);
act_chat.mostCurrent._upl.runVoidMethod ("addMultipartFile",(Object)(BA.ObjectToString("uploaded_file")),(Object)(_filename));
 BA.debugLineNum = 1135;BA.debugLine="upl.startUploadAsString";
Debug.ShouldStop(16384);
act_chat.mostCurrent._upl.runVoidMethod ("startUploadAsString");
 BA.debugLineNum = 1136;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}