
package com.it.fome;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class main implements IRemote{
	public static main mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public main() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
	public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("main"), "com.it.fome.main");
	}

public boolean isSingleton() {
		return true;
	}
     public static RemoteObject getObject() {
		return myClass;
	 }

	public RemoteObject activityBA;
	public RemoteObject _activity;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
		activityBA = (RemoteObject) args[2];
		_activity = (RemoteObject) args[3];
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[4];
        remoteMe = (RemoteObject) args[5];
		pcBA = new PCBA(this, main.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _skv11 = RemoteObject.declareNull("spinkitwrapper.spinKitWrapper");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static com.it.fome.ac_telelogin _ac_telelogin = null;
public static com.it.fome.ac_shop _ac_shop = null;
public static com.it.fome.ac_tansfer _ac_tansfer = null;
public static com.it.fome.firebasemessaging _firebasemessaging = null;
public static com.it.fome.ac_tselect _ac_tselect = null;
public static com.it.fome.ac_lchats _ac_lchats = null;
public static com.it.fome.ac_tfreecoin _ac_tfreecoin = null;
public static com.it.fome.ac_hsef _ac_hsef = null;
public static com.it.fome.ac_tsearch _ac_tsearch = null;
public static com.it.fome.ac_tcoin _ac_tcoin = null;
public static com.it.fome.ac_home _ac_home = null;
public static com.it.fome.act_chat _act_chat = null;
public static com.it.fome.starter _starter = null;
  public Object[] GetGlobals() {
		return new Object[] {"ac_home",Debug.moduleToString(com.it.fome.ac_home.class),"ac_hsef",Debug.moduleToString(com.it.fome.ac_hsef.class),"ac_lchats",Debug.moduleToString(com.it.fome.ac_lchats.class),"ac_shop",Debug.moduleToString(com.it.fome.ac_shop.class),"ac_tansfer",Debug.moduleToString(com.it.fome.ac_tansfer.class),"ac_tcoin",Debug.moduleToString(com.it.fome.ac_tcoin.class),"ac_telelogin",Debug.moduleToString(com.it.fome.ac_telelogin.class),"ac_tfreecoin",Debug.moduleToString(com.it.fome.ac_tfreecoin.class),"ac_tsearch",Debug.moduleToString(com.it.fome.ac_tsearch.class),"ac_tselect",Debug.moduleToString(com.it.fome.ac_tselect.class),"Act_Chat",Debug.moduleToString(com.it.fome.act_chat.class),"Activity",main.mostCurrent._activity,"DateUtils",main.mostCurrent._dateutils,"FirebaseMessaging",Debug.moduleToString(com.it.fome.firebasemessaging.class),"skv11",main.mostCurrent._skv11,"Starter",Debug.moduleToString(com.it.fome.starter.class)};
}
}