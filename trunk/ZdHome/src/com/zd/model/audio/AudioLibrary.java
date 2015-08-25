package com.zd.model.audio;

import java.io.Flushable;
import java.util.Vector;

import com.zd.model.Cache;
import com.zd.model.Results;

public abstract interface AudioLibrary extends Flushable {
	public interface OnSongsUpdateListener {

	}

	public interface OnPlaylistsUpdateListener {

	}

	public interface OnGenresUpdateListener {

	}

	public interface OnChannelsUpdateListener {

	}

	public interface OnArtistsUpdateListener {

	}

	public class OnAlbumsUpdateListener {

	}

	public abstract boolean A();

	public abstract Results<Channel> B();

	public abstract int C();

	public abstract void D();

	public abstract void E();

	public abstract boolean F();

	public abstract int G();

	public abstract Song H();

	public abstract Playlist a(int paramInt);

	public abstract Playlist a(String paramString);

	public abstract Song a(String paramString, boolean paramBoolean,
			Song.OnSongUpdateListener paramOnSongUpdateListener);

	public abstract void a(Album paramAlbum, boolean paramBoolean);

	public abstract void a(Artist paramArtist, boolean paramBoolean);

	public abstract void a(Channel paramChannel, boolean paramBoolean);

	public abstract void a(Genre paramGenre, boolean paramBoolean);

	public abstract void a(Playlist paramPlaylist, boolean paramBoolean);

	public abstract boolean a();

	public abstract boolean a(
			AudioLibrary.OnAlbumsUpdateListener paramOnAlbumsUpdateListener);

	public abstract boolean a(
			AudioLibrary.OnArtistsUpdateListener paramOnArtistsUpdateListener);

	public abstract boolean a(
			AudioLibrary.OnChannelsUpdateListener paramOnChannelsUpdateListener);

	public abstract boolean a(
			AudioLibrary.OnGenresUpdateListener paramOnGenresUpdateListener);

	public abstract boolean a(
			AudioLibrary.OnPlaylistsUpdateListener paramOnPlaylistsUpdateListener);

	public abstract boolean a(String paramString,
			AudioLibrary.OnAlbumsUpdateListener paramOnAlbumsUpdateListener);

	public abstract boolean a(Vector<String> paramVector,
			AudioLibrary.OnAlbumsUpdateListener paramOnAlbumsUpdateListener);

	public abstract boolean a(Vector<Song> paramVector,
			AudioLibrary.OnSongsUpdateListener paramOnSongsUpdateListener);

	public abstract Artist b(int paramInt);

	public abstract Artist b(String paramString);

	public abstract void b(
			AudioLibrary.OnAlbumsUpdateListener paramOnAlbumsUpdateListener);

	public abstract void b(
			AudioLibrary.OnArtistsUpdateListener paramOnArtistsUpdateListener);

	public abstract void b(
			AudioLibrary.OnChannelsUpdateListener paramOnChannelsUpdateListener);

	public abstract void b(
			AudioLibrary.OnGenresUpdateListener paramOnGenresUpdateListener);

	public abstract void b(
			AudioLibrary.OnPlaylistsUpdateListener paramOnPlaylistsUpdateListener);

	public abstract boolean b();

	public abstract Album c(int paramInt);

	public abstract Album c(String paramString);

	public abstract Results<Playlist> c();

	public abstract int d();

	public abstract Genre d(int paramInt);

	public abstract boolean d(String paramString);

	public abstract Channel e(int paramInt);

	public abstract Genre e(String paramString);

	public abstract boolean e();

	public abstract boolean f();

	public abstract boolean f(String paramString);

	public abstract Channel g(String paramString);

	public abstract Results<Artist> g();

	public abstract int h();

	public abstract boolean i();

	public abstract void j();

	public abstract boolean k();

	public abstract Cache l();

	public abstract Results<Album> m();

	public abstract int n();

	public abstract boolean o();

	public abstract boolean p();

	public abstract Results<Genre> q();

	public abstract int r();

	public abstract void s();

	public abstract void t();

	public abstract void u();

	public abstract void v();

	public abstract void w();

	public abstract void x();

	public abstract boolean y();

	public abstract boolean z();
}
