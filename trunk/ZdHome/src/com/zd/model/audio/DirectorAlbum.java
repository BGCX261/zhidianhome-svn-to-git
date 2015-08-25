package com.zd.model.audio;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import android.app.Application;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import com.google.inject.Inject;
import com.zd.model.DirectorResult;
import com.zd.model.Results;

public class DirectorAlbum extends DirectorResult implements Album {
	private static SQLiteStatement a = null;
	protected static DirectorSong q;

	@Inject
	private Application _context;
	protected int b;
	protected String c;
	protected String d;
	protected String e;
	protected String f;
	protected String g;
	protected String h;
	protected boolean i = true;
	protected volatile boolean j = true;
	protected volatile boolean k = true;
	protected volatile boolean l = false;
	protected Timer m;
	protected TimerTask n;
	protected Results<Song> o;
	protected boolean p = false;
	protected ArrayList<Album.OnAlbumUpdateListener> r;

	// public DirectorAlbum()
	// {
	// this.H = true;
	// }
	//
	// public void A()
	// {
	// this.o = null;
	// q = null;
	// f(true);
	// }
	//
	// public boolean B()
	// {
	// return this.j;
	// }
	//
	// public boolean C()
	// {
	// return this.k;
	// }
	//
	// public boolean D()
	// {
	// return this.l;
	// }
	//
	// public DirectorCache E()
	// {
	// try
	// {
	// Object localObject1 = m();
	// if (localObject1 != null);
	// for (localObject1 = (DirectorCache)((AudioLibrary)localObject1).l(); ;
	// localObject1 = null)
	// return localObject1;
	// }
	// catch (Exception localObject2)
	// {
	// while (true)
	// {
	// Ln.e(localException);
	// Object localObject2 = null;
	// }
	// }
	// }
	//
	// public boolean F()
	// {
	// return this.i;
	// }
	//
	// public String G()
	// {
	// return this.c;
	// }
	//
	// public String H()
	// {
	// return this.f;
	// }
	//
	// public String I()
	// {
	// return this.e;
	// }
	//
	// public String J()
	// {
	// return this.d;
	// }
	//
	// public String K()
	// {
	// return this.g;
	// }
	//
	// public Results<Song> L()
	// {
	// return this.o;
	// }
	//
	// public int M()
	// {
	// return this.b;
	// }
	//
	// public String N()
	// {
	// return this.h;
	// }
	//
	// public Song O()
	// {
	// try
	// {
	// if (q == null)
	// {
	// q = (DirectorSong)this._director._songProvider.a();
	// q.l("12341234");
	// q.m(this._context.getString(R.string.all_songs));
	// }
	// DirectorSong localDirectorSong1 = q;
	// return localDirectorSong1;
	// }
	// catch (Exception localDirectorSong2)
	// {
	// Ln.e(localException);
	// }
	// finally
	// {
	// while (true)
	// DirectorSong localDirectorSong2 = q;
	// }
	// }
	//
	// public Song a(int paramInt)
	// {
	// try
	// {
	// if (this.o != null);
	// for (Song localSong = (Song)this.o.c(paramInt); ; localSong = null)
	// return localSong;
	// }
	// catch (Exception localObject)
	// {
	// while (true)
	// {
	// Ln.e(localException);
	// Object localObject = null;
	// }
	// }
	// }
	//
	// public void a(DirectorResult paramDirectorResult)
	// {
	// try
	// {
	// super.a(paramDirectorResult);
	// if ((paramDirectorResult != null) && ((paramDirectorResult instanceof
	// DirectorAlbum)))
	// {
	// Object localObject = (DirectorAlbum)paramDirectorResult;
	// String str = ((DirectorAlbum)localObject).G();
	// if ((str != null) && (str.length() > 0))
	// f(str);
	// str = ((DirectorAlbum)localObject).J();
	// if ((str != null) && (str.length() > 0))
	// h(str);
	// int i1 = ((DirectorAlbum)localObject).M();
	// if (i1 > 0)
	// c(i1);
	// e(((DirectorAlbum)localObject).N());
	// g(((DirectorAlbum)localObject).H());
	// i(((DirectorAlbum)localObject).I());
	// j(((DirectorAlbum)localObject).K());
	// localObject = ((DirectorAlbum)localObject).L();
	// if ((localObject != null) && (((Results)localObject).h() > 0))
	// this.o = ((Results)localObject);
	// if (this.o != null)
	// {
	// f(false);
	// g(false);
	// }
	// }
	// }
	// catch (Exception localException)
	// {
	// Ln.e(localException);
	// }
	// }
	//
	// public boolean a(int paramInt, boolean paramBoolean)
	// {
	// boolean bool = false;
	// try
	// {
	// Song localSong = a(paramInt);
	// if (localSong != null)
	// {
	// bool = localSong.f(paramBoolean);
	// bool = bool;
	// }
	// return bool;
	// }
	// catch (Exception localException)
	// {
	// while (true)
	// Ln.e(localException);
	// }
	// }
	//
	// // ERROR //
	// public boolean a(SQLiteDatabase paramSQLiteDatabase)
	// {
	//
	// }
	//
	// public boolean a(Album.OnAlbumUpdateListener paramOnAlbumUpdateListener)
	// {
	// int i1 = 1;
	// try
	// {
	// if (this.l)
	// break label222;
	// if (((a(this._director.q())) || (this._director.G())) &&
	// (b(this._director.q())) && (paramOnAlbumUpdateListener != null))
	// {
	// f(false);
	// paramOnAlbumUpdateListener.a(this);
	// }
	// if (this._director.G())
	// {
	// f(false);
	// g(false);
	// }
	// }
	// catch (Exception i2)
	// {
	// Ln.e(localException);
	// g(false);
	// int i2 = 0;
	// }
	// g(true);
	// Object localObject = this._director.m().s();
	// GetAlbumCommand localGetAlbumCommand =
	// (GetAlbumCommand)CommandFactory.GetAlbumProvider.a();
	// localGetAlbumCommand.a(at());
	// localGetAlbumCommand.b(((Room)localObject).a());
	// localGetAlbumCommand.a("album", this);
	// localGetAlbumCommand.a("listener", paramOnAlbumUpdateListener);
	// if (paramOnAlbumUpdateListener != null)
	// b(paramOnAlbumUpdateListener);
	// localGetAlbumCommand.a("audio-library", m());
	// boolean bool = this._director.a(localGetAlbumCommand);
	// if (!bool)
	// g(false);
	// localObject = E();
	// if (localObject != null)
	// ((DirectorCache)localObject).a(this);
	// label222: return bool;
	// }
	//
	// public boolean a(DirectorSong paramDirectorSong)
	// {
	// int i1;
	// if (paramDirectorSong == null)
	// i1 = 0;
	// while (true)
	// {
	// return i1;
	// try
	// {
	// if (this.o == null)
	// this.o = new DirectorResults();
	// DirectorResults localDirectorResults = (DirectorResults)this.o;
	// localDirectorResults.a(this.p);
	// int i2;
	// if ((!this.p) && (d(paramDirectorSong.at()) != null))
	// {
	// i2 = 0;
	// continue;
	// }
	// i2.a(paramDirectorSong);
	// paramDirectorSong.e(at());
	// DirectorAudioLibrary localDirectorAudioLibrary = m();
	// if (localDirectorAudioLibrary != null)
	// localDirectorAudioLibrary.a(paramDirectorSong);
	// int i3 = 1;
	// }
	// catch (Exception i4)
	// {
	// Ln.e(localException);
	// int i4 = 0;
	// }
	// }
	// }
	//
	// public void b(Album.OnAlbumUpdateListener paramOnAlbumUpdateListener)
	// {
	// if (paramOnAlbumUpdateListener == null);
	// while (true)
	// {
	// return;
	// if (this.r == null)
	// this.r = new ArrayList();
	// synchronized (this.r)
	// {
	// if (!this.r.contains(paramOnAlbumUpdateListener))
	// this.r.add(paramOnAlbumUpdateListener);
	// }
	// }
	// }
	//
	// // ERROR //
	// public boolean b(SQLiteDatabase paramSQLiteDatabase)
	// {
	//
	// }
	//
	// public void c(int paramInt)
	// {
	// this.b = paramInt;
	// }
	//
	// public void c(Album.OnAlbumUpdateListener paramOnAlbumUpdateListener)
	// {
	// if (paramOnAlbumUpdateListener == null);
	// while (true)
	// {
	// return;
	// if (this.r == null)
	// continue;
	// synchronized (this.r)
	// {
	// this.r.remove(paramOnAlbumUpdateListener);
	// }
	// }
	// }
	//
	// // ERROR //
	// public boolean c(SQLiteDatabase paramSQLiteDatabase)
	// {
	//
	// }
	//
	// public Song d(String paramString)
	// {
	// try
	// {
	// if (this.o != null);
	// for (Song localSong = (Song)this.o.b(paramString); ; localSong = null)
	// return localSong;
	// }
	// catch (Exception localObject)
	// {
	// while (true)
	// {
	// Ln.e(localException);
	// Object localObject = null;
	// }
	// }
	// }
	//
	// public boolean d(SQLiteDatabase paramSQLiteDatabase)
	// {
	// boolean bool1 = true;
	// if (paramSQLiteDatabase == null)
	// bool1 = false;
	// while (true)
	// {
	// return bool1;
	// while (true)
	// {
	// try
	// {
	// while (true)
	// {
	// String str = at();
	// if ((str == null) || (str.length() == 0))
	// break label128;
	// monitorenter;
	// try
	// {
	// String[] arrayOfString = new String[1];
	// arrayOfString[0] = str;
	// paramSQLiteDatabase.delete("song_cache", "album_id = ?", arrayOfString);
	// monitorexit;
	// int i3 = e();
	// int i2 = 0;
	// while (i2 < i3)
	// {
	// DirectorSong localDirectorSong = (DirectorSong)a(i2);
	// if (localDirectorSong == null)
	// break label123;
	// boolean bool2 = localDirectorSong.c(paramSQLiteDatabase);
	// bool1 = bool2 & bool1;
	// i2 += 1;
	// bool1 = bool1;
	// }
	// }
	// finally
	// {
	// monitorexit;
	// }
	// }
	// }
	// catch (Exception i1)
	// {
	// Ln.e(localException);
	// i1 = 0;
	// }
	// break;
	// label123: i1 = i1;
	// }
	// label128: int i1 = 0;
	// }
	// }
	//
	// public boolean d(boolean paramBoolean)
	// {
	// int i1;
	// try
	// {
	// boolean bool;
	// if (this.k)
	// {
	// bool = a(new DirectorAlbum.2(this, paramBoolean));
	// }
	// else
	// {
	// bool = i(paramBoolean);
	// bool = bool;
	// }
	// }
	// catch (Exception i1)
	// {
	// Ln.e(localException);
	// i1 = 0;
	// }
	// return i1;
	// }
	//
	// public int e()
	// {
	// int i1 = 0;
	// try
	// {
	// if (this.o != null)
	// {
	// i1 = this.o.h();
	// i1 = i1;
	// }
	// return i1;
	// }
	// catch (Exception localException)
	// {
	// while (true)
	// Ln.e(localException);
	// }
	// }
	//
	// public void e(String paramString)
	// {
	// this.h = paramString;
	// }
	//
	// public void e(boolean paramBoolean)
	// {
	// this.j = paramBoolean;
	// }
	//
	// public void f(String paramString)
	// {
	// this.c = paramString;
	// }
	//
	// public void f(boolean paramBoolean)
	// {
	// this.k = paramBoolean;
	// }
	//
	// public boolean f()
	// {
	// return false;
	// }
	//
	// public void g(String paramString)
	// {
	// this.f = paramString;
	// }
	//
	// // ERROR //
	// public void g(boolean paramBoolean)
	// {
	//
	// }
	//
	// public boolean g()
	// {
	// return false;
	// }
	//
	// public void h()
	// {
	// super.h();
	// this.h = null;
	// this.f = null;
	// this.j = true;
	// if (!this.Q)
	// {
	// this.e = null;
	// this.d = null;
	// this.o = null;
	// this.k = true;
	// }
	// }
	//
	// public void h(String paramString)
	// {
	// this.d = paramString;
	// }
	//
	// public void h(boolean paramBoolean)
	// {
	// this.i = paramBoolean;
	// }
	//
	// public void i(String paramString)
	// {
	// this.e = paramString;
	// }
	//
	// protected boolean i(boolean paramBoolean)
	// {
	// while (true)
	// {
	// boolean bool;
	// int i4;
	// try
	// {
	// if (this._director != null)
	// continue;
	// int i1 = 0;
	// break label418;
	// DirectorProject localDirectorProject = this._director.m();
	// if (localDirectorProject != null)
	// continue;
	// int i2 = 0;
	// break label418;
	// Room localRoom = i2.s();
	// if (localRoom != null)
	// continue;
	// int i3 = 0;
	// break label418;
	// Object localObject1 = i3.ar();
	// if ((localObject1 == null) || (((AudioQueue)localObject1).c() !=
	// AudioQueue.QueueState.b))
	// continue;
	// localObject1 = new StringBuilder("<MEDIA>");
	// int i7 = e();
	// if (i7 == 0)
	// {
	// i3 = 0;
	// break label418;
	// int i5;
	// if (i5 >= i7)
	// continue;
	// Song localSong = a(i5);
	// if (localSong == null)
	// break label426;
	// ((StringBuilder)localObject1).append("<SONG ID=\"");
	// ((StringBuilder)localObject1).append(localSong.at());
	// ((StringBuilder)localObject1).append("\" SOURCE=\"");
	// ((StringBuilder)localObject1).append(localSong.b());
	// ((StringBuilder)localObject1).append("\"/>");
	// break label426;
	// ((StringBuilder)localObject1).append("</MEDIA>");
	// Object localObject2 = new
	// StringBuilder("<param><name>MEDIA</name><value type=\"STRING\"><static>");
	// ((StringBuilder)localObject2).append(((StringBuilder)localObject1).toString());
	// ((StringBuilder)localObject2).append("</static></value></param>");
	// ((StringBuilder)localObject2).append("<param><name>ROOM_ID</name><value type=\"INTEGER\"><static>");
	// ((StringBuilder)localObject2).append(i3.a());
	// ((StringBuilder)localObject2).append("</static></value></param>");
	// ((StringBuilder)localObject2).append("<param><name>PLAY_NOW</name><value type=\"STRING\"><static>");
	// ((StringBuilder)localObject2).append("1");
	// ((StringBuilder)localObject2).append("</static></value></param>");
	// ((StringBuilder)localObject2).append("<param><name>PLAY_NEXT</name><value type=\"STRING\"><static>");
	// if (!paramBoolean)
	// break label437;
	// localObject1 = "1";
	// ((StringBuilder)localObject2).append((String)localObject1);
	// ((StringBuilder)localObject2).append("</static></value></param>");
	// i3.ag();
	// localObject1 =
	// (SendToDeviceCommand)CommandFactory.SendToDeviceProvider.a();
	// ((SendToDeviceCommand)localObject1).d(false);
	// ((SendToDeviceCommand)localObject1).c(true);
	// ((SendToDeviceCommand)localObject1).c(27);
	// ((SendToDeviceCommand)localObject1).b(100002);
	// ((SendToDeviceCommand)localObject1).a(((StringBuilder)localObject2).toString());
	// ((SendToDeviceCommand)localObject1).c("ADD_SONG_LIST");
	// if (!paramBoolean)
	// continue;
	// localObject2 = "true";
	// ((SendToDeviceCommand)localObject1).a("play-now", localObject2);
	// bool = this._director.a((Command)localObject1);
	// DirectorDigitalAudio localDirectorDigitalAudio =
	// (DirectorDigitalAudio)i3.as();
	// if (localDirectorDigitalAudio == null)
	// break label432;
	// localDirectorDigitalAudio.i(true);
	// break label432;
	// localObject2 = "false";
	// continue;
	// }
	// }
	// catch (Exception i4)
	// {
	// Ln.e(localException);
	// i4 = 0;
	// }
	// while (true)
	// {
	// label418: return i4;
	// int i6 = 0;
	// break;
	// label426: i6++;
	// break;
	// label432: i4 = bool;
	// }
	// label437: String str = "0";
	// }
	// }
	//
	// public void j(String paramString)
	// {
	// this.g = paramString;
	// }
	//
	// // ERROR //
	// public void l()
	// {
	//
	// }
	//
	// public DirectorAudioLibrary m()
	// {
	// try
	// {
	// DirectorAudioLibrary localDirectorAudioLibrary =
	// (DirectorAudioLibrary)this._director.m().s().at();
	// return localDirectorAudioLibrary;
	// }
	// catch (Exception localObject)
	// {
	// while (true)
	// {
	// Ln.e(localException);
	// Object localObject = null;
	// }
	// }
	// }

	protected String s_() {
		return "album";
	}

	public String v() {
		return this.c;
	}

	@Override
	public void A() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean B() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean C() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean D() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean F() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String G() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String H() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String I() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String J() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String K() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Results<Song> L() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Song O() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Song a(int paramInt) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean a(int paramInt, boolean paramBoolean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean a(OnAlbumUpdateListener paramOnAlbumUpdateListener) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void b(OnAlbumUpdateListener paramOnAlbumUpdateListener) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean b(SQLiteDatabase paramSQLiteDatabase) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void c(OnAlbumUpdateListener paramOnAlbumUpdateListener) {
		// TODO Auto-generated method stub

	}

	@Override
	public Song d(String paramString) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean d(boolean paramBoolean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int e() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean f() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean g() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public AudioLibrary z() {
		// TODO Auto-generated method stub
		return null;
	}
}
