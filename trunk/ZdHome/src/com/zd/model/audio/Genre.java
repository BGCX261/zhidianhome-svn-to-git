package com.zd.model.audio;

import com.zd.model.Result;
import com.zd.model.Results;

public abstract interface Genre extends Result {
	public interface OnGenreUpdateListener {

	}

	public interface OnGenreTopTracksUpdateListener {

	}

	public interface OnGenreTopArtistsUpdateListener {

	}

	public interface OnGenreTopAlbumsUpdateListener {

	}

	public interface OnGenreSubGenresUpdateListener {

	}

	public interface OnGenrePlaylistsUpdateListener {

	}

	public interface OnGenreSamplerTracksUpdateListener {

	}

	public interface OnGenreNewAlbumsUpdateListener {

	}

	public interface OnGenreKeyArtistsUpdateListener {

	}

	public interface OnGenreKeyAlbumsUpdateListener {

	}

	public interface OnGenreChannelsUpdateListener {

	}

	public static final String b_ = "(Empty)";

	public abstract boolean A();

	public abstract boolean B();

	public abstract Results<Artist> C();

	public abstract boolean D();

	public abstract boolean F();

	public abstract Results<Album> G();

	public abstract boolean H();

	public abstract boolean I();

	public abstract boolean J();

	public abstract Results<Song> K();

	public abstract boolean L();

	public abstract boolean M();

	public abstract boolean N();

	public abstract Results<Song> O();

	public abstract boolean P();

	public abstract boolean Q();

	public abstract boolean R();

	public abstract Results<Album> S();

	public abstract boolean T();

	public abstract boolean U();

	public abstract boolean V();

	public abstract Results<Artist> W();

	public abstract boolean X();

	public abstract boolean Y();

	public abstract boolean Z();

	public abstract Artist a(int paramInt);

	public abstract Artist a(String paramString);

	public abstract boolean a(
			Genre.OnGenreChannelsUpdateListener paramOnGenreChannelsUpdateListener);

	public abstract boolean a(
			Genre.OnGenreKeyAlbumsUpdateListener paramOnGenreKeyAlbumsUpdateListener);

	public abstract boolean a(
			Genre.OnGenreKeyArtistsUpdateListener paramOnGenreKeyArtistsUpdateListener);

	public abstract boolean a(
			Genre.OnGenreNewAlbumsUpdateListener paramOnGenreNewAlbumsUpdateListener);

	public abstract boolean a(
			Genre.OnGenrePlaylistsUpdateListener paramOnGenrePlaylistsUpdateListener);

	public abstract boolean a(
			Genre.OnGenreSamplerTracksUpdateListener paramOnGenreSamplerTracksUpdateListener);

	public abstract boolean a(
			Genre.OnGenreSubGenresUpdateListener paramOnGenreSubGenresUpdateListener);

	public abstract boolean a(
			Genre.OnGenreTopAlbumsUpdateListener paramOnGenreTopAlbumsUpdateListener);

	public abstract boolean a(
			Genre.OnGenreTopArtistsUpdateListener paramOnGenreTopArtistsUpdateListener);

	public abstract boolean a(
			Genre.OnGenreTopTracksUpdateListener paramOnGenreTopTracksUpdateListener);

	public abstract boolean a(
			Genre.OnGenreUpdateListener paramOnGenreUpdateListener);

	public abstract Results<Album> aa();

	public abstract boolean ab();

	public abstract boolean ac();

	public abstract boolean ad();

	public abstract Results<Playlist> ae();

	public abstract void af();

	public abstract void ag();

	public abstract void ah();

	public abstract void ai();

	public abstract void aj();

	public abstract void ak();

	public abstract void al();

	public abstract void am();

	public abstract void an();

	public abstract boolean ao();

	public abstract boolean ap();

	public abstract boolean aq();

	public abstract Results<Channel> ar();

	public abstract void as();

	public abstract void b(
			Genre.OnGenreChannelsUpdateListener paramOnGenreChannelsUpdateListener);

	public abstract void b(
			Genre.OnGenreKeyAlbumsUpdateListener paramOnGenreKeyAlbumsUpdateListener);

	public abstract void b(
			Genre.OnGenreKeyArtistsUpdateListener paramOnGenreKeyArtistsUpdateListener);

	public abstract void b(
			Genre.OnGenreNewAlbumsUpdateListener paramOnGenreNewAlbumsUpdateListener);

	public abstract void b(
			Genre.OnGenrePlaylistsUpdateListener paramOnGenrePlaylistsUpdateListener);

	public abstract void b(
			Genre.OnGenreSamplerTracksUpdateListener paramOnGenreSamplerTracksUpdateListener);

	public abstract void b(
			Genre.OnGenreSubGenresUpdateListener paramOnGenreSubGenresUpdateListener);

	public abstract void b(
			Genre.OnGenreTopAlbumsUpdateListener paramOnGenreTopAlbumsUpdateListener);

	public abstract void b(
			Genre.OnGenreTopArtistsUpdateListener paramOnGenreTopArtistsUpdateListener);

	public abstract void b(
			Genre.OnGenreTopTracksUpdateListener paramOnGenreTopTracksUpdateListener);

	public abstract void b(
			Genre.OnGenreUpdateListener paramOnGenreUpdateListener);

	public abstract boolean b();

	public abstract boolean c();

	public abstract Results<Artist> e();

	public abstract int f();

	public abstract boolean g();

	public abstract boolean i();

	public abstract boolean l();

	public abstract boolean m();

	public abstract Results<Genre> n();

	public abstract boolean u_();

	public abstract boolean z();
}
