package com.zd.model;

import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;

import com.zd.model.audio.AudioQueue;
import com.zd.model.device.Device;
import com.zd.model.device.Light;
import com.zd.model.device.Thermostat;

public abstract interface Room extends Location {
	public enum PlayState {
		b

	}

	public abstract interface MediaInfo {
		public abstract void a();

		public abstract void a(Bitmap paramBitmap);

		public abstract String b();

		public abstract String c();

		public abstract String d();

		public abstract Bitmap e();

		public abstract int f();

		public abstract String g();

		public abstract String h();

		public abstract int i();

		public abstract boolean j();

		public abstract boolean k();
	}

	public interface OnRoomUpdateListener {

	}

	public enum PowerState {
		a, b, c
	}

	public static final String A = "START_UP";
	public static final String B = "STOP_UP";
	public static final String C = "DOWN";
	public static final String D = "START_DOWN";
	public static final String E = "STOP_DOWN";
	public static final String F = "RIGHT";
	public static final String G = "START_RIGHT";
	public static final String H = "STOP_RIGHT";
	public static final String I = "LEFT";
	public static final String J = "START_LEFT";
	public static final String K = "STOP_LEFT";
	public static final String L = "RECALL";
	public static final String M = "INFO";
	public static final String N = "CANCEL";
	public static final String O = "BACK";
	public static final String P = "PVR";
	public static final String Q = "SKIP_REV";
	public static final String R = "SKIP_FWD";
	public static final String S = "SCAN_REV";
	public static final String T = "START_SCAN_REV";
	public static final String U = "STOP_SCAN_REV";
	public static final String V = "SCAN_FWD";
	public static final String W = "START_SCAN_FWD";
	public static final String X = "STOP_SCAN_FWD";
	public static final String Y = "PAUSE";
	public static final String Z = "STOP";
	public static final String a = "PIP";
	public static final String aA = "FUNCTION";
	public static final String aB = "POWER";
	public static final String aC = "TV_VIDEO";
	public static final String aD = "PULSE_ASPECT_RATIO";
	public static final String aE = "START_ASPECT_RATIO";
	public static final String aF = "STOP_ASPECT_RATIO";
	public static final String aG = "ROOM_OFF";
	public static final String aa = "RECORD";
	public static final String ab = "PLAY";
	public static final String ac = "OPEN_CLOSE";
	public static final String ad = "EJECT";
	public static final String ae = "NUMBER_1";
	public static final String af = "NUMBER_2";
	public static final String ag = "NUMBER_3";
	public static final String ah = "NUMBER_4";
	public static final String ai = "NUMBER_5";
	public static final String aj = "NUMBER_6";
	public static final String ak = "NUMBER_7";
	public static final String al = "NUMBER_8";
	public static final String am = "NUMBER_9";
	public static final String an = "NUMBER_0";
	public static final String ao = "DASH";
	public static final String ap = "STAR";
	public static final String aq = "POUND";
	public static final String ar = "CONTROL4";
	public static final String as = "PROGRAM_A";
	public static final String at = "PROGRAM_B";
	public static final String au = "PROGRAM_C";
	public static final String av = "PROGRAM_D";
	public static final String aw = "TV_OFF";
	public static final String ax = "ORDER";
	public static final String ay = "CLOSED_CAPTIONED";
	public static final String az = "EXIT";
	public static final String b = "MENU";
	public static final String c = "MUTE_TOGGLE";
	public static final String d = "MUTE_ON";
	public static final String e = "MUTE_OFF";
	public static final String f = "PULSE_VOL_UP";
	public static final String g = "START_VOL_UP";
	public static final String h = "STOP_VOL_UP";
	public static final String i = "PULSE_VOL_DOWN";
	public static final String j = "START_VOL_DOWN";
	public static final String k = "STOP_VOL_DOWN";
	public static final String l = "PAGE_UP";
	public static final String m = "START_PAGE_UP";
	public static final String n = "STOP_PAGE_UP";
	public static final String o = "PAGE_DOWN";
	public static final String p = "START_PAGE_DOWN";
	public static final String q = "STOP_PAGE_DOWN";
	public static final String r = "PULSE_CH_UP";
	public static final String s = "START_CH_UP";
	public static final String t = "STOP_CH_UP";
	public static final String u = "PULSE_CH_DOWN";
	public static final String v = "START_CH_DOWN";
	public static final String w = "STOP_CH_DOWN";
	public static final String x = "GUIDE";
	public static final String y = "ENTER";
	public static final String z = "UP";

	public abstract boolean A();

	public abstract int B();

	public abstract boolean C();

	public abstract int D();

	public abstract int E();

	public abstract int F();

	public abstract int G();

	public abstract Thermostat H();

	public abstract Thermostat I();
    //J()
	public abstract int getListenDeviceCount();

	public abstract int K();

	public abstract int L();

	public abstract int M();

	public abstract int N();

	public abstract int O();

	public abstract void P();

	public abstract boolean Q();

	public abstract boolean R();

	public abstract boolean S();

	public abstract boolean T();

	public abstract boolean U();

	public abstract boolean V();

	public abstract boolean W();

	public abstract boolean X();

	public abstract boolean Y();

	public abstract boolean Z();

	public abstract Room.OnRoomUpdateListener a(int paramInt);

	public abstract void a(Room.OnRoomUpdateListener paramOnRoomUpdateListener);

	public abstract void a(Device paramDevice, int paramInt);

	public abstract boolean a(SQLiteDatabase paramSQLiteDatabase);

	public abstract boolean a(String paramString);

	public abstract void aA();

	public abstract void aB();

	public abstract void aC();

	public abstract boolean a_(boolean paramBoolean);

	public abstract boolean aa();

	public abstract boolean ab();

	public abstract boolean ac();

	public abstract boolean ad();

	public abstract boolean ae();

	public abstract Room.PlayState af();

	public abstract boolean ag();

	public abstract boolean ah();

	public abstract boolean ai();

	public abstract boolean aj();

	public abstract boolean ak();

	public abstract boolean al();

	public abstract boolean am();

	public abstract boolean an();

	public abstract boolean ao();

	public abstract void ap();

	public abstract void aq();

	 public abstract AudioQueue ar();
	//
	// public abstract DigitalAudio as();
	//
	// public abstract AudioLibrary at();
	//
	// public abstract AudioLibrary au();
	//
	// public abstract VideoLibrary av();
	//
	// public abstract BroadcastCollection aw();
	//
	// public abstract BroadcastCollection ax();

	public abstract boolean ay();

	public abstract void az();

	public abstract Device b(int paramInt);

	public abstract void b(Room.OnRoomUpdateListener paramOnRoomUpdateListener);

	public abstract boolean b(boolean paramBoolean);

	public abstract boolean c(boolean paramBoolean);

	public abstract boolean d();

	public abstract Device e(int paramInt);

	public abstract Light f(int paramInt);

	public abstract void f();

	public abstract Light g(int paramInt);

	public abstract boolean g();

	public abstract int h();

	public abstract LightingScene h(int paramInt);

	public abstract LightingScene i(int paramInt);

	public abstract boolean i();

	public abstract Device j(int paramInt);

	public abstract boolean j();

	public abstract Device k(int paramInt);

	public abstract boolean k();

	public abstract Device l(int paramInt);

	public abstract boolean l();

	public abstract Device m(int paramInt);

	public abstract boolean m();

	public abstract Device n(int paramInt);

	public abstract boolean n();

	// public abstract Room.PowerState o();

	public abstract Device o(int paramInt);

	public abstract int p();

	public abstract Device p(int paramInt);

	public abstract int q();

	public abstract Device q(int paramInt);

	public abstract int r();

	// public abstract WebCam r(int paramInt);

	public abstract Room.MediaInfo s();

	// public abstract WebCam s(int paramInt);

	public abstract ContactDevice t(int paramInt);

	public abstract boolean t();

	public abstract ContactDevice u(int paramInt);

	public abstract boolean u();

	// / public abstract CustomButtonScreen v(int paramInt);

	public abstract boolean v();

	public abstract CustomButtonScreen w(int paramInt);

	public abstract boolean w();

	public abstract boolean x();

	public abstract boolean x(int paramInt);

	public abstract boolean y();

	public abstract boolean z();
}
