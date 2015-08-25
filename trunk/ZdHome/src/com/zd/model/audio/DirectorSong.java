package com.zd.model.audio;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import android.database.sqlite.SQLiteStatement;

import com.zd.model.DirectorResult;

public class DirectorSong extends DirectorResult implements Song {
	private static final String[] n;
	private static SQLiteStatement o;
	protected int a = 1;
	protected String b;
	protected String c;
	protected String d;
	protected String e;
	protected boolean f = true;
	protected String g;
	protected volatile boolean h = true;
	protected volatile boolean i = false;
	protected volatile boolean j = false;
	protected Timer k;
	protected TimerTask l;
	protected ArrayList<Song.OnSongUpdateListener> m;
	private int p = 0;

	static {
		String[] arrayOfString = new String[7];
		arrayOfString[0] = "name";
		arrayOfString[1] = "album_id";
		arrayOfString[2] = "location";
		arrayOfString[3] = "sequence";
		arrayOfString[4] = "source";
		arrayOfString[5] = "type";
		arrayOfString[6] = "track_id";
		n = arrayOfString;
		o = null;
	}

	public DirectorSong() {
		this.H = false;
	}

	public String A() {
		return null;
	}

	public int B() {
		return this.p;
	}

	public boolean C() {
		return false;
	}

	public boolean D() {
		return false;
	}

	public boolean F() {
		return this.j;
	}

	public void a(int paramInt) {
		this.a = paramInt;
	}

	public void a(DirectorSong paramDirectorSong) {
		// int i1 = 0;
		// if (paramDirectorSong == null)
		// return;
		// while (true)
		// {
		// try
		// {
		// String str1 = paramDirectorSong.au();
		// if ((str1 == null) || (str1.length() <= 3))
		// break label211;
		// String str2 = str1.substring(0, 4);
		// if ((str2 == null) || (!str2.equalsIgnoreCase("tra.")))
		// break label198;
		// if (i1 == 0)
		// continue;
		// m(str1);
		// if ((paramDirectorSong.at() == null) ||
		// (paramDirectorSong.at().length() <= 0))
		// continue;
		// l(paramDirectorSong.at());
		// b(paramDirectorSong.e());
		// o(paramDirectorSong.y());
		// c(paramDirectorSong.g());
		// str1 = paramDirectorSong.c();
		// if ((str1 == null) || (str1.length() <= 0))
		// continue;
		// a(str1);
		// str1 = paramDirectorSong.f();
		// if ((str1 == null) || (str1.length() <= 0))
		// continue;
		// d(str1);
		// str1 = paramDirectorSong.i();
		// if ((str1 == null) || (str1.length() <= 0))
		// continue;
		// e(str1);
		// a(paramDirectorSong.b());
		// this.h = false;
		// e(false);
		// }
		// catch (Exception localException)
		// {
		// Ln.e(localException);
		// }
		// break;
		// label198: boolean bool =
		// localException.equalsIgnoreCase("Rhapsody Track");
		// if (bool)
		// continue;
		// label211: i1 = 1;
		// }
	}

	public void a(String paramString) {
		this.g = paramString;
	}

	// ERROR //
	public boolean a(android.database.sqlite.SQLiteDatabase paramSQLiteDatabase) {
		return false;
	}

	public boolean a(Song.OnSongUpdateListener paramOnSongUpdateListener) {
		int i1 = 1;
		// int i2;
		// while (true)
		// {
		// Object localObject1;
		// try
		// {
		// if (m())
		// break;
		// a(this._director.q());
		// if (this._director != null)
		// continue;
		// i1 = 0;
		// break;
		// e(true);
		// DirectorProject localDirectorProject = this._director.m();
		// localObject1 = this.c;
		// if ((localObject1 == null) || (((String)localObject1).length() == 0))
		// {
		// localObject2 = at();
		// localObject1 = (GetSongCommand)CommandFactory.GetSongProvider.a();
		// ((GetSongCommand)localObject1).b(localDirectorProject.r());
		// ((GetSongCommand)localObject1).a((String)localObject2);
		// ((GetSongCommand)localObject1).a("song", this);
		// ((GetSongCommand)localObject1).a("listener",
		// paramOnSongUpdateListener);
		// boolean bool = this._director.a((Command)localObject1);
		// if (bool)
		// break;
		// e(false);
		// }
		// }
		// catch (Exception i2)
		// {
		// Ln.e(localException);
		// e(false);
		// i2 = 0;
		// }
		// Object localObject2 = localObject1;
		// }
		return false;
	}

	public int b() {
		return this.a;
	}

	public void b(int paramInt) {
		this.p = paramInt;
	}

	public void b(Song.OnSongUpdateListener paramOnSongUpdateListener) {
		if (paramOnSongUpdateListener == null)
			return;
		if (this.m == null)
			this.m = new ArrayList();
		synchronized (this.m) {
			this.m.add(paramOnSongUpdateListener);
		}

	}

	public void b(String paramString) {
		this.c = paramString;
	}

	public String c() {
		return this.g;
	}

	public void c(String paramString) {
		this.d = paramString;
	}

	public void c(boolean paramBoolean) {
		this.f = paramBoolean;
	}

	// ERROR //
	public boolean c(android.database.sqlite.SQLiteDatabase paramSQLiteDatabase) {
		return false;
	}

	public void d(String paramString) {
		this.e = paramString;
	}

	public void d(boolean paramBoolean) {
		this.h = paramBoolean;
	}

	public boolean d() {
		return this.f;
	}

	public String e() {
		return this.c;
	}

	public void e(String paramString) {
		this.b = paramString;
	}

	// ERROR //
	public void e(boolean paramBoolean) {
		// Byte code:
		// 0: aload_0
		// 1: iload_1
		// 2: putfield 66 com/control4/director/audio/DirectorSong:i Z
		// 5: aload_0
		// 6: getfield 300 com/control4/director/audio/DirectorSong:l
		// Ljava/util/TimerTask;
		// 9: ifnull +11 -> 20
		// 12: aload_0
		// 13: getfield 300 com/control4/director/audio/DirectorSong:l
		// Ljava/util/TimerTask;
		// 16: invokevirtual 305 java/util/TimerTask:cancel ()Z
		// 19: pop
		// 20: aload_0
		// 21: getfield 66 com/control4/director/audio/DirectorSong:i Z
		// 24: ifeq +48 -> 72
		// 27: aload_0
		// 28: getfield 307 com/control4/director/audio/DirectorSong:k
		// Ljava/util/Timer;
		// 31: ifnonnull +14 -> 45
		// 34: aload_0
		// 35: new 309 java/util/Timer
		// 38: dup
		// 39: invokespecial 310 java/util/Timer:<init> ()V
		// 42: putfield 307 com/control4/director/audio/DirectorSong:k
		// Ljava/util/Timer;
		// 45: aload_0
		// 46: new 312 com/control4/director/audio/DirectorSong$1
		// 49: dup
		// 50: aload_0
		// 51: invokespecial 314
		// com/control4/director/audio/DirectorSong$1:<init>
		// (Lcom/control4/director/audio/DirectorSong;)V
		// 54: putfield 300 com/control4/director/audio/DirectorSong:l
		// Ljava/util/TimerTask;
		// 57: aload_0
		// 58: getfield 307 com/control4/director/audio/DirectorSong:k
		// Ljava/util/Timer;
		// 61: aload_0
		// 62: getfield 300 com/control4/director/audio/DirectorSong:l
		// Ljava/util/TimerTask;
		// 65: ldc2_w 315
		// 68: invokevirtual 320 java/util/Timer:schedule
		// (Ljava/util/TimerTask;J)V
		// 71: return
		// 72: aload_0
		// 73: getfield 234 com/control4/director/audio/DirectorSong:m
		// Ljava/util/ArrayList;
		// 76: ifnull +59 -> 135
		// 79: aload_0
		// 80: getfield 234 com/control4/director/audio/DirectorSong:m
		// Ljava/util/ArrayList;
		// 83: astore_2
		// 84: aload_2
		// 85: monitorenter
		// 86: aload_0
		// 87: getfield 234 com/control4/director/audio/DirectorSong:m
		// Ljava/util/ArrayList;
		// 90: invokevirtual 324 java/util/ArrayList:iterator
		// ()Ljava/util/Iterator;
		// 93: astore_3
		// 94: aload_3
		// 95: invokeinterface 329 1 0
		// 100: ifeq +26 -> 126
		// 103: aload_3
		// 104: invokeinterface 332 1 0
		// 109: checkcast 334
		// com/control4/director/audio/Song$OnSongUpdateListener
		// 112: aload_0
		// 113: invokeinterface 337 2 0
		// 118: goto -24 -> 94
		// 121: astore_3
		// 122: aload_2
		// 123: monitorexit
		// 124: aload_3
		// 125: athrow
		// 126: aload_0
		// 127: getfield 234 com/control4/director/audio/DirectorSong:m
		// Ljava/util/ArrayList;
		// 130: invokevirtual 340 java/util/ArrayList:clear ()V
		// 133: aload_2
		// 134: monitorexit
		// 135: aload_0
		// 136: getfield 307 com/control4/director/audio/DirectorSong:k
		// Ljava/util/Timer;
		// 139: ifnull -68 -> 71
		// 142: aload_0
		// 143: getfield 307 com/control4/director/audio/DirectorSong:k
		// Ljava/util/Timer;
		// 146: invokevirtual 342 java/util/Timer:cancel ()V
		// 149: aload_0
		// 150: aconst_null
		// 151: putfield 307 com/control4/director/audio/DirectorSong:k
		// Ljava/util/Timer;
		// 154: goto -83 -> 71
		//
		// Exception table:
		// from to target type
		// 86 124 121 finally
		// 126 135 121 finally
	}

	public String f() {
		return this.e;
	}

	public boolean f(boolean paramBoolean) {
		boolean bool;
		// int i4;
		// try
		// {
		// if (this._director == null)
		// {
		// int i1 = 0;
		// }
		// else
		// {
		// DirectorProject localDirectorProject = this._director.m();
		// int i2;
		// if (localDirectorProject == null)
		// {
		// i2 = 0;
		// }
		// else
		// {
		// Room localRoom = i2.s();
		// int i3;
		// if (localRoom == null)
		// {
		// i3 = 0;
		// }
		// else
		// {
		// Object localObject1 = i3.ar();
		// if ((localObject1 != null) && (((AudioQueue)localObject1).c() ==
		// AudioQueue.QueueState.b));
		// localObject1 = new
		// StringBuilder("<param><name>MEDIA_ID</name><value type=\"STRING\"><static>");
		// ((StringBuilder)localObject1).append(at());
		// ((StringBuilder)localObject1).append("</static></value></param>");
		// ((StringBuilder)localObject1).append("<param><name>ROOM_ID</name><value type=\"INTEGER\"><static>");
		// ((StringBuilder)localObject1).append(this._director.m().r());
		// ((StringBuilder)localObject1).append("</static></value></param>");
		// ((StringBuilder)localObject1).append("<param><name>PLAY_NOW</name><value type=\"STRING\"><static>");
		// ((StringBuilder)localObject1).append("1");
		// ((StringBuilder)localObject1).append("</static></value></param>");
		// ((StringBuilder)localObject1).append("<param><name>PLAY_NEXT</name><value type=\"STRING\"><static>");
		// if (paramBoolean);
		// Object localObject2;
		// for (String str = "1"; ; localObject2 = "0")
		// {
		// ((StringBuilder)localObject1).append(str);
		// ((StringBuilder)localObject1).append("</static></value></param>");
		// int i5 = b();
		// if (n())
		// i5 = 2;
		// ((StringBuilder)localObject1).append("<param><name>SOURCE</name><value type=\"INT\"><static>");
		// ((StringBuilder)localObject1).append(i5);
		// ((StringBuilder)localObject1).append("</static></value></param>");
		// i3.ag();
		// localObject2 =
		// (SendToDeviceCommand)CommandFactory.SendToDeviceProvider.a();
		// ((SendToDeviceCommand)localObject2).d(false);
		// ((SendToDeviceCommand)localObject2).c(true);
		// ((SendToDeviceCommand)localObject2).c(27);
		// ((SendToDeviceCommand)localObject2).b(100002);
		// ((SendToDeviceCommand)localObject2).a(((StringBuilder)localObject1).toString());
		// ((SendToDeviceCommand)localObject2).c("ADD_SONG");
		// bool = this._director.a((Command)localObject2);
		// DirectorDigitalAudio localDirectorDigitalAudio =
		// (DirectorDigitalAudio)i3.as();
		// if (localDirectorDigitalAudio == null)
		// break;
		// localDirectorDigitalAudio.i(true);
		// break;
		// }
		// }
		// }
		// }
		// }
		// catch (Exception i4)
		// {
		// Ln.e(localException);
		// i4 = 0;
		// }
		// while (true)
		// {
		// return i4;
		// i4 = bool;
		// }
		return false;
	}

	public String g() {
		return this.d;
	}

	public void g(boolean paramBoolean) {
		this.j = paramBoolean;
	}

	public void h() {
		super.h();
		this.d = null;
		this.e = null;
		this.g = null;
		if (this.m != null)
			this.m.clear();
		if (this.l != null)
			this.l.cancel();
		if (this.k != null) {
			this.k.cancel();
			this.k = null;
		}
		this.j = false;
	}

	public String i() {
		return this.b;
	}

	public boolean l() {
		return this.h;
	}

	public boolean m() {
		return this.i;
	}

	public boolean n() {
		// int i1 = 1;
		// int i2;
		// try
		// {
		// String str = at();
		// if ((str == null) || ((!str.startsWith("Tra.")) &&
		// (!str.startsWith("tra."))))
		// {
		// str = e();
		// if ((str == null) || ((!str.startsWith("Tra.")) &&
		// (!str.startsWith("tra."))))
		// {
		// str = y();
		// if (str != null)
		// {
		// boolean bool = str.equalsIgnoreCase("RHAPSODY_SONG");
		// if (bool);
		// }
		// else
		// {
		// i1 = 0;
		// }
		// }
		// }
		// }
		// catch (Exception i2)
		// {
		// Ln.e(localException);
		// i2 = 0;
		// }
		// return i2;
		return false;
	}

	public String z() {
		return au();
	}
}
