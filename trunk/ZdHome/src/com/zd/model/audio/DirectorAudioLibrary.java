package com.zd.model.audio;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Vector;

import roboguice.util.Ln;
import android.app.Application;

import com.google.inject.Inject;
import com.zd.model.Cache;
import com.zd.model.Control4Director;
import com.zd.model.DirectorCache;
import com.zd.model.DirectorLookupMap;
import com.zd.model.DirectorResults;
import com.zd.model.HashIndex;
import com.zd.model.Results;

public class DirectorAudioLibrary implements AudioLibrary {
	protected static DirectorSong T;
	private static final int U = 35;
	protected DirectorResults<Album> A;
	protected DirectorResults<Genre> B;
	protected DirectorResults<Song> C;
	protected DirectorResults<Channel> D;
	protected DirectorLookupMap E;
	protected HashIndex<String, Album> F;
	protected HashIndex<String, Artist> G;
	protected HashIndex<String, Genre> H;
	protected HashIndex<String, Playlist> I;
	protected HashIndex<String, Channel> J;
	protected DirectorCache K;
	protected HashMap<String, Boolean> L;
	protected int M = 0;
	protected ArrayList<AudioLibrary.OnPlaylistsUpdateListener> N;
	protected ArrayList<AudioLibrary.OnAlbumsUpdateListener> O;
	protected ArrayList<AudioLibrary.OnArtistsUpdateListener> P;
	protected ArrayList<AudioLibrary.OnGenresUpdateListener> Q;
	protected ArrayList<AudioLibrary.OnChannelsUpdateListener> R1;
	protected volatile int S = 0;
	private final Object V = new Object();
	private final Object W = new Object();
	private final Object X = new Object();
	private final Object Y = new Object();
	private final Object Z = new Object();

	@Inject
	protected Application _context;

	@Inject
	protected Control4Director _director;
	protected volatile boolean a = true;
	protected volatile boolean b = true;
	protected volatile boolean c = true;
	protected volatile boolean d = true;
	protected volatile boolean e = false;
	protected volatile boolean f = true;
	protected volatile boolean g = false;
	protected volatile boolean h = false;
	protected volatile boolean i = false;
	protected volatile boolean j = false;
	protected volatile boolean k = false;
	protected volatile boolean l = false;
	protected Timer m;
	protected TimerTask n;
	protected Timer o;
	protected TimerTask p;
	protected Timer q;
	protected TimerTask r;
	protected Timer s;
	protected TimerTask t;
	protected Timer u;
	protected TimerTask v;
	protected Timer w;
	protected TimerTask x;
	protected DirectorResults<Playlist> y;
	protected DirectorResults<Artist> z;

	public boolean A() {
		return this.k;
	}

	public Results<Channel> B() {
		return this.D;
	}

	public int C() {
		int i1;
		if (this.D == null)
			i1 = 0;
		else
			i1 = this.D.h();
		return i1;
	}

	public void D() {
		// monitorenter;
		// try
		// {
		// this.S = (1 + this.S);
		// monitorexit;
		// return;
		// }
		// finally
		// {
		// localObject = finally;
		// monitorexit;
		// }
		// throw localObject;
	}

	public void E() {
		// monitorenter;
		// try
		// {
		// this.S = (-1 + this.S);
		// monitorexit;
		// return;
		// }
		// finally
		// {
		//
		// }

	}

	public boolean F() {
		//
		// while (true)
		// {
		// try
		// {
		// if (this.S > 0)
		// {
		// int i1 = 1;
		// monitorexit;
		// return i1;
		// }
		// }
		// finally
		// {
		//
		// }
		// int i2 = 0;
		// }
		return false;
	}

	public int G() {
		int i1 = 0;
		try {
			if (this.L != null) {
				i1 = this.L.size();
				i1 = i1;
			}
			return i1;
		} catch (Exception localException) {
			while (true)
				Ln.e(localException);
		}
	}

	public Song H() {
		// try
		// {
		// if (T == null)
		// {
		// T = (DirectorSong)this._director._songProvider.a();
		// T.l("12341234");
		// T.m(this._context.getString(R.string.all_songs));
		// }
		// DirectorSong localDirectorSong1 = T;
		// return localDirectorSong1;
		// }
		// catch (Exception localDirectorSong2)
		// {
		// Ln.e(localException);
		// }
		// finally
		// {
		//
		// }
		return null;
	}

	public int I() {
		return this.M;
	}

	public void J() {
		try {
			if (this.z != null) {
				DirectorLookupMap localDirectorLookupMap = (DirectorLookupMap) this.z
						.d();
				if (localDirectorLookupMap != null)
					synchronized (this.W) {
						if (!localDirectorLookupMap.c())
							localDirectorLookupMap.b();
					}
			}
		} catch (Exception localException) {
			Ln.e(localException);
		}
	}

	public boolean K() {
		return this.f;
	}

	public boolean L() {
		// int i1 = 1;
		// try
		// {
		// if (this._director == null)
		// {
		// i1 = 0;
		// break label121;
		// }
		// if (this.l)
		// break label121;
		// if (this._director.G())
		// {
		// e(false);
		// h(false);
		// }
		// }
		// catch (Exception i2)
		// {
		// Ln.e(localException);
		// h(false);
		// int i2 = 0;
		// }
		// boolean bool;
		// if (this.f)
		// {
		// O();
		// h(true);
		// GetAlbumLookupCommand localGetAlbumLookupCommand =
		// (GetAlbumLookupCommand)CommandFactory.GetAlbumLookupProvider.a();
		// localGetAlbumLookupCommand.b(this.M);
		// localGetAlbumLookupCommand.a("audio-library", this);
		// bool = this._director.a(localGetAlbumLookupCommand);
		// if (!bool)
		// h(false);
		// }
		// label121: return bool;
		return false;
	}

	public DirectorLookupMap M() {
		return this.E;
	}

	public void N() {
		this.d = true;
		this.a = true;
		this.b = true;
		this.f = true;
		this.c = true;
	}

	public void O() {
		try {
			synchronized (this.V) {
				this.E = new DirectorLookupMap();
				this.f = true;
			}
		} catch (Exception localException) {
			Ln.e(localException);
		}
	}

	public Playlist a(int paramInt) {
		Playlist localPlaylist;
		if (this.y == null)
			localPlaylist = null;
		else
			localPlaylist = (Playlist) this.y.c(paramInt);
		return localPlaylist;
	}

	public Playlist a(String paramString) {
		Playlist localPlaylist = null;
		if (this.y != null)
			localPlaylist = (Playlist) this.y.b(paramString);
		if ((localPlaylist == null) && (this.I != null))
			localPlaylist = (Playlist) this.I.a(paramString);
		return localPlaylist;
	}

	public Song a(String paramString, boolean paramBoolean,
			Song.OnSongUpdateListener paramOnSongUpdateListener) {
		// if (paramString != null)
		// while (true)
		// {
		// try
		// {
		// if (paramString.length() == 0)
		// break;
		// if (this.C != null)
		// {
		// localObject = (DirectorSong)this.C.b(paramString);
		// if (this.C != null)
		// continue;
		// this.C = new DirectorResults();
		// this.C.a(false);
		// this.C.b(false);
		// this.C.a(this._context.getString(R.string.tracks));
		// if ((!paramBoolean) || ((localObject != null) &&
		// (!((DirectorSong)localObject).l())))
		// break label233;
		// if (localObject != null)
		// continue;
		// localObject = (DirectorSong)this._director._songProvider.a();
		// ((DirectorSong)localObject).l(paramString);
		// if (!((DirectorSong)localObject).n())
		// continue;
		// DirectorSong localDirectorSong =
		// (DirectorSong)this._director.K()._rhapsodySongProvider.a();
		// localDirectorSong.a((DirectorSong)localObject);
		// localObject = localDirectorSong;
		// ((DirectorSong)localObject).a(this._director.q());
		// this.C.a((Result)localObject);
		// if (((DirectorSong)localObject).m())
		// break label233;
		// ((DirectorSong)localObject).a(paramOnSongUpdateListener);
		// }
		// }
		// catch (Exception localException)
		// {
		// Ln.e(localException);
		// localObject = null;
		// }
		// localObject = null;
		// }
		// Object localObject = null;
		// label233: return (Song)localObject;
		return null;
	}

	// ERROR //
	public void a(Album paramAlbum, boolean paramBoolean) {

	}

	public void a(Artist paramArtist, boolean paramBoolean) {
		// if (paramBoolean);
		// do
		// try
		// {
		// a((DirectorArtist)paramArtist);
		// continue;
		// String str = paramArtist.at();
		// if ((str == null) || (str.length() == 0))
		// break;
		// synchronized (this.W)
		// {
		// if (this.G == null)
		// this.G = new HashIndex();
		// this.G.a(str, paramArtist);
		// }
		// }
		// catch (Exception localException)
		// {
		// Ln.e(localException);
		// }
		// while (paramArtist != null);
	}

	// ERROR //
	public void a(Channel paramChannel) {
		// Byte code:
		// 0: aload_1
		// 1: ifnonnull +4 -> 5
		// 4: return
		// 5: aload_1
		// 6: invokeinterface 364 1 0
		// 11: astore_3
		// 12: aload_3
		// 13: ifnull -9 -> 4
		// 16: aload_3
		// 17: invokevirtual 261 java/lang/String:length ()I
		// 20: ifeq -16 -> 4
		// 23: aload_0
		// 24: getfield 131 com/control4/director/audio/DirectorAudioLibrary:Z
		// Ljava/lang/Object;
		// 27: astore_2
		// 28: aload_2
		// 29: monitorenter
		// 30: aload_0
		// 31: getfield 137 com/control4/director/audio/DirectorAudioLibrary:D
		// Lcom/control4/director/data/DirectorResults;
		// 34: ifnonnull +47 -> 81
		// 37: aload_0
		// 38: new 140 com/control4/director/data/DirectorResults
		// 41: dup
		// 42: invokespecial 264
		// com/control4/director/data/DirectorResults:<init> ()V
		// 45: putfield 137 com/control4/director/audio/DirectorAudioLibrary:D
		// Lcom/control4/director/data/DirectorResults;
		// 48: aload_0
		// 49: getfield 137 com/control4/director/audio/DirectorAudioLibrary:D
		// Lcom/control4/director/data/DirectorResults;
		// 52: iconst_0
		// 53: invokevirtual 266 com/control4/director/data/DirectorResults:a
		// (Z)V
		// 56: aload_0
		// 57: getfield 137 com/control4/director/audio/DirectorAudioLibrary:D
		// Lcom/control4/director/data/DirectorResults;
		// 60: iconst_0
		// 61: invokevirtual 268 com/control4/director/data/DirectorResults:b
		// (Z)V
		// 64: aload_0
		// 65: getfield 137 com/control4/director/audio/DirectorAudioLibrary:D
		// Lcom/control4/director/data/DirectorResults;
		// 68: aload_0
		// 69: getfield 181
		// com/control4/director/audio/DirectorAudioLibrary:_context
		// Landroid/app/Application;
		// 72: getstatic 367 com/control4/myhome/director/R$string:channels I
		// 75: invokevirtual 192 android/app/Application:getString
		// (I)Ljava/lang/String;
		// 78: invokevirtual 273 com/control4/director/data/DirectorResults:a
		// (Ljava/lang/String;)V
		// 81: aload_0
		// 82: getfield 137 com/control4/director/audio/DirectorAudioLibrary:D
		// Lcom/control4/director/data/DirectorResults;
		// 85: aload_3
		// 86: invokevirtual 248 com/control4/director/data/DirectorResults:b
		// (Ljava/lang/String;)Lcom/control4/director/data/Result;
		// 89: checkcast 363 com/control4/director/audio/Channel
		// 92: astore_3
		// 93: aload_3
		// 94: ifnull +47 -> 141
		// 97: aload_3
		// 98: instanceof 369
		// 101: ifeq +21 -> 122
		// 104: aload_1
		// 105: instanceof 369
		// 108: ifeq +14 -> 122
		// 111: aload_3
		// 112: checkcast 369 com/control4/director/data/DirectorResult
		// 115: aload_1
		// 116: checkcast 369 com/control4/director/data/DirectorResult
		// 119: invokevirtual 372 com/control4/director/data/DirectorResult:a
		// (Lcom/control4/director/data/DirectorResult;)V
		// 122: aload_2
		// 123: monitorexit
		// 124: goto -120 -> 4
		// 127: astore_3
		// 128: aload_2
		// 129: monitorexit
		// 130: aload_3
		// 131: athrow
		// 132: astore_2
		// 133: aload_2
		// 134: invokestatic 156 roboguice/util/Ln:e (Ljava/lang/Throwable;)I
		// 137: pop
		// 138: goto -134 -> 4
		// 141: aload_0
		// 142: getfield 137 com/control4/director/audio/DirectorAudioLibrary:D
		// Lcom/control4/director/data/DirectorResults;
		// 145: aload_1
		// 146: invokevirtual 297 com/control4/director/data/DirectorResults:a
		// (Lcom/control4/director/data/Result;)Z
		// 149: pop
		// 150: goto -28 -> 122
		//
		// Exception table:
		// from to target type
		// 30 130 127 finally
		// 141 150 127 finally
		// 5 30 132 java/lang/Exception
		// 130 132 132 java/lang/Exception
	}

	public void a(Channel paramChannel, boolean paramBoolean) {
		// if (paramBoolean)
		// a(paramChannel);
		// while (true)
		// {
		// return;
		// if (paramChannel != null)
		// {
		// try
		// {
		// String str = paramChannel.at();
		// if ((str == null) || (str.length() == 0))
		// continue;
		// synchronized (this.Z)
		// {
		// if (this.J == null)
		// this.J = new HashIndex();
		// this.J.a(str, paramChannel);
		// }
		// }
		// catch (Exception localException)
		// {
		// Ln.e(localException);
		// }
		// continue;
		// }
		// }
	}

	// ERROR //
	public void a(DirectorArtist paramDirectorArtist) {

	}

	// ERROR //
	public void a(DirectorGenre paramDirectorGenre) {

	}

	public void a(DirectorPlaylist paramDirectorPlaylist) {
		// if (paramDirectorPlaylist != null)
		// try
		// {
		// if (paramDirectorPlaylist.at() != null)
		// synchronized (this.Y)
		// {
		// if (this.y == null)
		// {
		// this.y = new DirectorResults();
		// this.y.a(false);
		// this.y.b(false);
		// this.y.a(this._context.getString(R.string.playlists));
		// }
		// this.y.a(paramDirectorPlaylist);
		// }
		// }
		// catch (Exception localException)
		// {
		// Ln.e(localException);
		// }
	}

	public void a(DirectorSong paramDirectorSong) {
		// if (paramDirectorSong == null);
		// while (true)
		// {
		// return;
		// try
		// {
		// String str = paramDirectorSong.at();
		// if ((str == null) || (str.length() == 0))
		// continue;
		// if (this.C == null)
		// {
		// this.C = new DirectorResults();
		// this.C.a(false);
		// this.C.b(false);
		// this.C.a(this._context.getString(R.string.tracks));
		// }
		// this.C.a(paramDirectorSong);
		// str = paramDirectorSong.au();
		// if ((str != null) && (!str.equalsIgnoreCase("Rhapsody Track")))
		// continue;
		// paramDirectorSong.a(this._director.q());
		// }
		// catch (Exception localException)
		// {
		// Ln.e(localException);
		// }
		// }
	}

	public void a(Genre paramGenre, boolean paramBoolean) {
		// if (paramBoolean)
		// a((DirectorGenre)paramGenre);
		// while (true)
		// {
		// return;
		// if (paramGenre != null)
		// {
		// try
		// {
		// String str = paramGenre.at();
		// if ((str == null) || (str.length() == 0))
		// continue;
		// synchronized (this.X)
		// {
		// if (this.H == null)
		// this.H = new HashIndex();
		// this.H.a(str, paramGenre);
		// }
		// }
		// catch (Exception localException)
		// {
		// Ln.e(localException);
		// }
		// continue;
		// }
		// }
	}

	public void a(Playlist paramPlaylist, boolean paramBoolean) {
		// if (paramBoolean)
		// a((DirectorPlaylist)paramPlaylist);
		// while (true)
		// {
		// return;
		// if (paramPlaylist != null)
		// {
		// try
		// {
		// if (paramPlaylist.at() == null)
		// continue;
		// synchronized (this.Y)
		// {
		// if (this.I == null)
		// this.I = new HashIndex();
		// this.I.a(paramPlaylist.at(), paramPlaylist);
		// }
		// }
		// catch (Exception localException)
		// {
		// Ln.e(localException);
		// }
		// continue;
		// }
		// }
	}

	public void a(DirectorLookupMap paramDirectorLookupMap) {
		this.E = paramDirectorLookupMap;
		if (this.A != null)
			this.A.a(this.E);
	}

	public void a(String paramString, boolean paramBoolean) {
		try {
			if (this.L == null)
				this.L = new HashMap();
			if (paramBoolean)
				this.L.put(paramString, Boolean.valueOf(paramBoolean));
			else
				this.L.remove(paramString);
		} catch (Exception localException) {
			Ln.e(localException);
		}
	}

	public void a(boolean paramBoolean) {
		this.a = paramBoolean;
	}

	public boolean a() {
		return this.a;
	}

	// ERROR //
	public boolean a(android.database.sqlite.SQLiteDatabase paramSQLiteDatabase) {
		return false;
	}

	public boolean a(
			AudioLibrary.OnAlbumsUpdateListener paramOnAlbumsUpdateListener) {
		// boolean bool = true;
		// try
		// {
		// if (this._director == null)
		// {
		// bool = false;
		// break label196;
		// }
		// if ((this.f) && (!this.l))
		// L();
		// if ((this.i) || (!this.c))
		// break label196;
		// if (this._director.G())
		// {
		// bool = c(this._director.q());
		// if (this.A != null)
		// {
		// LookupMap localLookupMap = this.A.d();
		// if (localLookupMap != null)
		// localLookupMap.b();
		// }
		// f(false);
		// g(false);
		// if (paramOnAlbumsUpdateListener == null)
		// break label196;
		// paramOnAlbumsUpdateListener.a(this);
		// }
		// }
		// catch (Exception localException)
		// {
		// Ln.e(localException);
		// g(false);
		// bool = false;
		// }
		// u();
		// g(true);
		// GetAlbumIdsCommand localGetAlbumIdsCommand =
		// (GetAlbumIdsCommand)CommandFactory.GetAlbumIdsProvider.a();
		// localGetAlbumIdsCommand.b(this.M);
		// localGetAlbumIdsCommand.a("audio-library", this);
		// localGetAlbumIdsCommand.a("listener", paramOnAlbumsUpdateListener);
		// bool = this._director.a(localGetAlbumIdsCommand);
		// if (!bool)
		// g(false);
		// label196: return bool;
		return false;
	}

	public boolean a(
			AudioLibrary.OnArtistsUpdateListener paramOnArtistsUpdateListener) {
		// boolean bool1 = true;
		// try
		// {
		// if (this._director == null)
		// {
		// bool1 = false;
		// break label152;
		// }
		// if (this.h)
		// break label152;
		// if (this._director.G())
		// {
		// bool1 = b(this._director.q());
		// c(false);
		// d(false);
		// if (paramOnArtistsUpdateListener == null)
		// break label152;
		// paramOnArtistsUpdateListener.a(this);
		// }
		// }
		// catch (Exception i1)
		// {
		// Ln.e(localException);
		// d(false);
		// int i1 = 0;
		// }
		// boolean bool2;
		// if (this.b)
		// {
		// d(true);
		// t();
		// GetArtistsCommand localGetArtistsCommand =
		// (GetArtistsCommand)CommandFactory.GetArtistsProvider.a();
		// localGetArtistsCommand.b(this.M);
		// localGetArtistsCommand.a("listener", paramOnArtistsUpdateListener);
		// localGetArtistsCommand.a("audio-library", this);
		// bool2 = this._director.a(localGetArtistsCommand);
		// if (!bool2)
		// d(false);
		// }
		// label152: return bool2;
		return false;
	}

	public boolean a(
			AudioLibrary.OnChannelsUpdateListener paramOnChannelsUpdateListener) {
		return false;
	}

	public boolean a(
			AudioLibrary.OnGenresUpdateListener paramOnGenresUpdateListener) {
		// boolean bool1 = true;
		// try
		// {
		// if (this._director == null)
		// {
		// bool1 = false;
		// break label148;
		// }
		// if (this.j)
		// break label148;
		// if (this._director.G())
		// {
		// bool1 = d(this._director.q());
		// i(false);
		// j(false);
		// if (paramOnGenresUpdateListener == null)
		// break label148;
		// paramOnGenresUpdateListener.a(this);
		// }
		// }
		// catch (Exception i1)
		// {
		// Ln.e(localException);
		// j(false);
		// int i1 = 0;
		// }
		// boolean bool2;
		// if (this.d)
		// {
		// j(true);
		// GetGenresCommand localGetGenresCommand =
		// (GetGenresCommand)CommandFactory.GetGenresProvider.a();
		// localGetGenresCommand.b(this.M);
		// localGetGenresCommand.a("listener", paramOnGenresUpdateListener);
		// localGetGenresCommand.a("audio-library", this);
		// bool2 = this._director.a(localGetGenresCommand);
		// if (!bool2)
		// j(false);
		// }
		// label148: return bool2;
		return false;
	}

	public boolean a(
			AudioLibrary.OnPlaylistsUpdateListener paramOnPlaylistsUpdateListener) {
		// boolean bool1 = true;
		// try
		// {
		// if (this._director == null)
		// {
		// bool1 = false;
		// break label148;
		// }
		// if (this.g)
		// break label148;
		// if (this._director.G())
		// {
		// bool1 = a(this._director.q());
		// a(false);
		// b(false);
		// if (paramOnPlaylistsUpdateListener == null)
		// break label148;
		// paramOnPlaylistsUpdateListener.a(this);
		// }
		// }
		// catch (Exception i1)
		// {
		// Ln.e(localException);
		// b(false);
		// int i1 = 0;
		// }
		// boolean bool2;
		// if (this.a)
		// {
		// b(true);
		// GetPlaylistsCommand localGetPlaylistsCommand =
		// (GetPlaylistsCommand)CommandFactory.GetPlaylistsProvider.a();
		// localGetPlaylistsCommand.b(this.M);
		// localGetPlaylistsCommand.a("listener",
		// paramOnPlaylistsUpdateListener);
		// localGetPlaylistsCommand.a("audio-library", this);
		// bool2 = this._director.a(localGetPlaylistsCommand);
		// if (!bool2)
		// b(false);
		// }
		// label148: return bool2;
		return false;
	}

	public boolean a(String paramString,
			AudioLibrary.OnAlbumsUpdateListener paramOnAlbumsUpdateListener) {
		Vector localVector = new Vector(1);
		localVector.add(paramString);
		return a(localVector, paramOnAlbumsUpdateListener);
	}

	public boolean a(Vector<String> paramVector,
			AudioLibrary.OnAlbumsUpdateListener paramOnAlbumsUpdateListener) {
		// boolean bool1 = true;
		// boolean bool2;
		// if (paramVector != null)
		// {
		// try
		// {
		// if (paramVector.size() == 0)
		// break label278;
		// if (this._director.G())
		// {
		// Vector localVector = new Vector();
		// Iterator localIterator = paramVector.iterator();
		// if (localIterator.hasNext())
		// {
		// String str = (String)localIterator.next();
		// localObject1 = (DirectorAlbum)c(str);
		// if (localObject1 == null)
		// {
		// localObject1 = (DirectorAlbum)this._director._albumProvider.a();
		// ((DirectorAlbum)localObject1).l(str);
		// }
		// bool2 = ((DirectorAlbum)localObject1).a(this._director.q());
		// if (!bool2)
		// break label282;
		// localVector.add(localObject1);
		// break label282;
		// }
		// if (paramOnAlbumsUpdateListener == null)
		// break label292;
		// paramOnAlbumsUpdateListener.a(this, localVector);
		// break label292;
		// }
		// Object localObject1 = paramVector.iterator();
		// while (((Iterator)localObject1).hasNext())
		// a((String)((Iterator)localObject1).next(), true);
		// }
		// catch (Exception i1)
		// {
		// Ln.e(localException);
		// int i1 = 0;
		// }
		// Object localObject2 =
		// (GetDetailedAlbumsCommand)CommandFactory.GetDetailedAlbumsProvider.a();
		// ((GetDetailedAlbumsCommand)localObject2).a(paramVector);
		// ((GetDetailedAlbumsCommand)localObject2).b(this.M);
		// ((GetDetailedAlbumsCommand)localObject2).a("listener",
		// paramOnAlbumsUpdateListener);
		// ((GetDetailedAlbumsCommand)localObject2).a("audio-library", this);
		// Object localObject3 = this._director.a((Command)localObject2);
		// if (localObject3 == 0)
		// {
		// localObject2 = paramVector.iterator();
		// while (((Iterator)localObject2).hasNext())
		// a((String)((Iterator)localObject2).next(), false);
		// }
		// localObject2 = localObject3;
		// }
		// label278: label282: label292: for (int i2 = 0; ; i2 = bool1)
		// {
		// return i2;
		// bool1 &= bool2;
		// break;
		// }
		return false;
	}

	public boolean a(Vector<Song> paramVector,
			AudioLibrary.OnSongsUpdateListener paramOnSongsUpdateListener) {
		// if (paramVector != null);
		// while (true)
		// {
		// int i2;
		// try
		// {
		// if (paramVector.size() != 0)
		// {
		// DirectorAudioLibrary.7 local7 = new DirectorAudioLibrary.7(this,
		// paramOnSongsUpdateListener, paramVector);
		// bool1 = true;
		// int i1 = paramVector.size();
		// i2 = 0;
		// if (i2 >= i1)
		// break label127;
		// Song localSong = (Song)paramVector.elementAt(i2);
		// if (localSong != null)
		// continue;
		// bool1 = bool1;
		// break label130;
		// if (i2 != i1 + -1)
		// continue;
		// bool1 &= localSong.a(local7);
		// break label130;
		// boolean bool2 = localSong.a(null);
		// bool1 = bool2 & bool1;
		// }
		// }
		// catch (Exception localException)
		// {
		// Ln.e(localException);
		// bool1 = false;
		// break label127;
		// }
		// boolean bool1 = false;
		// label127: return bool1;
		// label130: i2 += 1;
		// bool1 = bool1;
		// }
		return false;
	}

	public Artist b(int paramInt) {
		Artist localArtist;
		if (this.z == null)
			localArtist = null;
		else
			localArtist = (Artist) this.z.c(paramInt);
		return localArtist;
	}

	public Artist b(String paramString) {
		Artist localArtist = null;
		if (this.z != null)
			localArtist = (Artist) this.z.b(paramString);
		if ((localArtist == null) && (this.G != null))
			localArtist = (Artist) this.G.a(paramString);
		return localArtist;
	}

	public void b(
			AudioLibrary.OnAlbumsUpdateListener paramOnAlbumsUpdateListener) {
		if (paramOnAlbumsUpdateListener == null)
			;
		if (this.O == null)
			this.O = new ArrayList();
		synchronized (this.O) {
			this.O.add(paramOnAlbumsUpdateListener);
		}

	}

	public void b(
			AudioLibrary.OnArtistsUpdateListener paramOnArtistsUpdateListener) {
		if (paramOnArtistsUpdateListener == null)
			;
		if (this.P == null)
			this.P = new ArrayList();
		synchronized (this.P) {
			this.P.add(paramOnArtistsUpdateListener);
		}

	}

	public void b(
			AudioLibrary.OnChannelsUpdateListener paramOnChannelsUpdateListener) {
		if (paramOnChannelsUpdateListener == null)
			;

		if (this.R1 == null)
			this.R1 = new ArrayList();
		synchronized (this.R1) {
			this.R1.add(paramOnChannelsUpdateListener);
		}

	}

	public void b(
			AudioLibrary.OnGenresUpdateListener paramOnGenresUpdateListener) {
		if (paramOnGenresUpdateListener == null)
			;

		if (this.Q == null)
			this.Q = new ArrayList();
		synchronized (this.Q) {
			this.Q.add(paramOnGenresUpdateListener);
		}

	}

	public void b(
			AudioLibrary.OnPlaylistsUpdateListener paramOnPlaylistsUpdateListener) {
		if (paramOnPlaylistsUpdateListener == null)
			;

		if (this.N == null)
			this.N = new ArrayList();
		synchronized (this.N) {
			this.N.add(paramOnPlaylistsUpdateListener);
		}

	}

	// ERROR //
	public void b(boolean paramBoolean) {

	}

	public boolean b() {
		return this.g;
	}

	// ERROR //
	public boolean b(android.database.sqlite.SQLiteDatabase paramSQLiteDatabase) {
		return false;
	}

	public Album c(int paramInt) {
		Album localAlbum;
		if (this.A == null)
			localAlbum = null;
		else
			localAlbum = (Album) this.A.c(paramInt);
		return localAlbum;
	}

	public Album c(String paramString) {
		try {
			if (this.A != null) {
				Album localAlbum = (Album) this.A.b(paramString);
				if ((localAlbum == null) && (this.F != null))
					localAlbum = (Album) this.F.a(paramString);
				return localAlbum;
			}
		} catch (Exception localObject) {

		}
		return null;
	}

	public Results<Playlist> c() {
		return this.y;
	}

	public void c(boolean paramBoolean) {
		this.b = paramBoolean;
	}

	// ERROR //
	public boolean c(android.database.sqlite.SQLiteDatabase paramSQLiteDatabase) {
		return false;
	}

	public int d() {
		int i1;
		if (this.y == null)
			i1 = 0;
		else
			i1 = this.y.h();
		return i1;
	}

	public Genre d(int paramInt) {
		Genre localGenre;
		if (this.B == null)
			localGenre = null;
		else
			localGenre = (Genre) this.B.c(paramInt);
		return localGenre;
	}

	// ERROR //
	public void d(boolean paramBoolean) {

	}

	// ERROR //
	public boolean d(android.database.sqlite.SQLiteDatabase paramSQLiteDatabase) {
		return false;
	}

	public boolean d(String paramString) {
		// int i1 = 0;
		// try
		// {
		// if (this.L != null)
		// {
		// Boolean localBoolean = (Boolean)this.L.get(paramString);
		// if (localBoolean == null)
		// break label40;
		// boolean bool = localBoolean.booleanValue();
		// if (!bool)
		// break label40;
		// }
		// label40: for (i1 = 1; ; i1 = i1)
		// {
		// i1 = i1;
		// return i1;
		// }
		// }
		// catch (Exception localException)
		// {
		//
		// }
		return false;
	}

	public Channel e(int paramInt) {
		Channel localChannel;
		if (this.D == null)
			localChannel = null;
		else
			localChannel = (Channel) this.D.c(paramInt);
		return localChannel;
	}

	public Genre e(String paramString) {
		Genre localGenre = null;
		if (this.B != null)
			localGenre = (Genre) this.B.b(paramString);
		if ((localGenre == null) && (this.H != null))
			localGenre = (Genre) this.H.a(paramString);
		return localGenre;
	}

	public void e(boolean paramBoolean) {
		this.f = paramBoolean;
	}

	public boolean e() {
		return this.b;
	}

	public void f(int paramInt) {
		this.M = paramInt;
	}

	public void f(boolean paramBoolean) {
		this.c = paramBoolean;
	}

	public boolean f() {
		return this.h;
	}

	public boolean f(String paramString) {
		// Album localAlbum = null;
		// try
		// {
		// if (this.A != null)
		// localAlbum = (Album)this.A.b(paramString);
		// if (localAlbum != null);
		// for (int i1 = 1; ; i1 = 0)
		// return i1;
		// }
		// catch (Exception i2)
		// {
		//
		// }
		return false;
	}

	public Channel g(String paramString) {
		Channel localChannel = null;
		if (this.D != null)
			localChannel = (Channel) this.D.b(paramString);
		if ((localChannel == null) && (this.J != null))
			localChannel = (Channel) this.J.a(paramString);
		return localChannel;
	}

	public Results<Artist> g() {
		return this.z;
	}

	// ERROR //
	public void g(boolean paramBoolean) {

	}

	public int h() {
		int i1;
		if (this.z == null)
			i1 = 0;
		else
			i1 = this.z.h();
		return i1;
	}

	public void h(boolean paramBoolean) {
		// this.l = paramBoolean;
		// if (this.t != null)
		// this.t.cancel();
		// if (!this.l)
		// {
		// if (this.s != null)
		// {
		// this.s.cancel();
		// this.s = null;
		// }
		// }
		// else
		// {
		// if (this.s == null)
		// this.s = new Timer();
		// this.t = new DirectorAudioLibrary.4(this);
		// this.s.schedule(this.t, 25000L);
		// }
	}

	public void i(boolean paramBoolean) {
		this.d = paramBoolean;
	}

	public boolean i() {
		return this.c;
	}

	public void j() {
		try {
			s();
			u();
			O();
			t();
			v();
			w();
			x();
			return;
		} catch (Exception localException) {
			while (true)
				Ln.e(localException);
		}
	}

	// ERROR //
	public void j(boolean paramBoolean) {

	}

	public void k(boolean paramBoolean) {
		this.e = paramBoolean;
	}

	public boolean k() {
		return this.i;
	}

	public Cache l() {
		if (this.K == null) {
			this.K = new DirectorCache();
			this.K.a(35);
			this.K.a("Albums");
		}
		return this.K;
	}

	// ERROR //
	public void l(boolean paramBoolean) {

	}

	public Results<Album> m() {
		return this.A;
	}

	public int n() {
		int i1;
		if (this.A == null)
			i1 = 0;
		else
			i1 = this.A.h();
		return i1;
	}

	public boolean o() {
		return this.d;
	}

	public boolean p() {
		return this.j;
	}

	public Results<Genre> q() {
		return this.B;
	}

	public int r() {
		int i1;
		if (this.B == null)
			i1 = 0;
		else
			i1 = this.B.h();
		return i1;
	}

	public void s() {
		//
		// int i2;
		// try
		// {
		// if (this.y != null)
		// synchronized (this.Y)
		// {
		// int i1 = d();
		// i2 = 0;
		// if (i2 >= i1)
		// continue;
		// Playlist localPlaylist = a(i2);
		// if (localPlaylist == null)
		// break label80;
		// localPlaylist.h();
		// break label80;
		// this.y.j();
		// this.a = true;
		// }
		// }
		// catch (Exception localException)
		// {
		// Ln.e(localException);
		// }

	}

	public void t() {
		//
		// int i2;
		// try
		// {
		// if (this.z != null)
		// synchronized (this.W)
		// {
		// int i1 = h();
		// i2 = 0;
		// if (i2 >= i1)
		// continue;
		// Artist localArtist = b(i2);
		// if (localArtist == null)
		// break label80;
		// localArtist.h();
		// break label80;
		// this.z.j();
		// this.b = true;
		// }
		// }
		// catch (Exception localException)
		// {
		// Ln.e(localException);
		// }

	}

	public void u() {
		// try
		// {
		// synchronized (this.V)
		// {
		// if (this.F != null)
		// this.F.d();
		// if (this.K != null)
		// this.K.a();
		// if (this.A != null)
		// {
		// int i1 = n();
		// i2 = 0;
		// if (i2 < i1)
		// {
		// Album localAlbum = c(i2);
		// if (localAlbum != null)
		// localAlbum.h();
		// }
		// else
		// {
		// this.A.j();
		// }
		// }
		// else
		// {
		// this.c = true;
		// }
		// }
		// }
		// catch (Exception localException)
		// {
		//
		// }
	}

	public void v() {
		// if (this.B == null)
		// return;
		// while (true)
		// {
		// int i2;
		// synchronized (this.X)
		// {
		// int i1 = r();
		// i2 = 0;
		// if (i2 >= i1)
		// continue;
		// Genre localGenre = d(i2);
		// if (localGenre != null)
		// {
		// localGenre.h();
		// break label71;
		// this.B.j();
		// this.d = true;
		// }
		// }
		// label71: i2++;
		// }
	}

	public void w() {
		// int i2;
		// if (this.C != null)
		// i2 = this.C.h();
		// for (int i1 = 0; ; i1++)
		// {
		// if (i1 >= i2)
		// {
		// this.C.j();
		// T = null;
		// return;
		// }
		// Song localSong = (Song)this.C.c(i1);
		// if (localSong == null)
		// continue;
		// localSong.h();
		// }
	}

	public void x() {
		//
		// int i2;
		// try
		// {
		// if (this.D != null)
		// synchronized (this.Z)
		// {
		// int i1 = C();
		// i2 = 0;
		// if (i2 >= i1)
		// continue;
		// Channel localChannel = e(i2);
		// if (localChannel == null)
		// break label80;
		// localChannel.h();
		// break label80;
		// this.D.j();
		// this.e = true;
		// }
		// }
		// catch (Exception localException)
		// {
		// Ln.e(localException);
		// }

	}

	public boolean y() {

		if ((!this._director.isDemo())
				&& ((this.l) || (this.i) || (this.g) || (this.j) || (this.h)))
			return true;
		return false;
	}

	public boolean z() {
		return this.e;
	}

	@Override
	public void flush() throws IOException {
		// TODO Auto-generated method stub

	}
}
