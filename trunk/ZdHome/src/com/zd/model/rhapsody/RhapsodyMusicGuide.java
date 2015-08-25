package com.zd.model.rhapsody;

import com.zd.model.Cache;
import com.zd.model.Results;
import com.zd.model.audio.Album;
import com.zd.model.audio.Artist;
import com.zd.model.audio.Genre;
import com.zd.model.audio.Song;

public abstract interface RhapsodyMusicGuide {
	public abstract interface OnRhapsodyExclusiveAlbumsListener {
		public abstract void a(RhapsodyMusicGuide paramRhapsodyMusicGuide);
	}

	public abstract interface OnRhapsodyGenresListener {
		public abstract void a(RhapsodyMusicGuide paramRhapsodyMusicGuide);
	}

	public abstract interface OnRhapsodyJustAddedAlbumsListener {
		public abstract void a(RhapsodyMusicGuide paramRhapsodyMusicGuide);
	}

	public abstract interface OnRhapsodyMusicGuideListener extends
			RhapsodyMusicGuide.OnRhapsodyJustAddedAlbumsListener,
			RhapsodyMusicGuide.OnRhapsodyNewReleaseAlbumsListener,
			RhapsodyMusicGuide.OnRhapsodyStaffPickAlbumsListener,
			RhapsodyMusicGuide.OnRhapsodyTopAlbumsListener,
			RhapsodyMusicGuide.OnRhapsodyTopArtistsListener,
			RhapsodyMusicGuide.OnRhapsodyTopTracksListener {
	}

	public abstract interface OnRhapsodyNewReleaseAlbumsListener {
		public abstract void a_(RhapsodyMusicGuide paramRhapsodyMusicGuide);
	}

	public abstract interface OnRhapsodyRecommendsAlbumsListener {
		public abstract void a(RhapsodyMusicGuide paramRhapsodyMusicGuide);
	}

	public abstract interface OnRhapsodyStaffPickAlbumsListener {
		public abstract void b_(RhapsodyMusicGuide paramRhapsodyMusicGuide);
	}

	public abstract interface OnRhapsodyTopAlbumsListener {
		public abstract void d_(RhapsodyMusicGuide paramRhapsodyMusicGuide);
	}

	public abstract interface OnRhapsodyTopArtistsListener {
		public abstract void e_(RhapsodyMusicGuide paramRhapsodyMusicGuide);
	}

	public abstract interface OnRhapsodyTopTracksListener {
		public abstract void c_(RhapsodyMusicGuide paramRhapsodyMusicGuide);
	}

	public abstract Results<Artist> A();

	public abstract void B();

	public abstract void C();

	public abstract void D();

	public abstract boolean E();

	public abstract boolean F();

	public abstract Results<Album> G();

	public abstract void H();

	public abstract boolean I();

	public abstract boolean J();

	public abstract Results<Genre> K();

	public abstract void L();

	public abstract boolean M();

	public abstract boolean N();

	public abstract Results<Album> O();

	public abstract void P();

	public abstract void a();

	public abstract boolean a(
			RhapsodyMusicGuide.OnRhapsodyExclusiveAlbumsListener paramOnRhapsodyExclusiveAlbumsListener);

	public abstract boolean a(
			RhapsodyMusicGuide.OnRhapsodyGenresListener paramOnRhapsodyGenresListener);

	public abstract boolean a(
			RhapsodyMusicGuide.OnRhapsodyJustAddedAlbumsListener paramOnRhapsodyJustAddedAlbumsListener);

	public abstract boolean a(
			RhapsodyMusicGuide.OnRhapsodyNewReleaseAlbumsListener paramOnRhapsodyNewReleaseAlbumsListener);

	public abstract boolean a(
			RhapsodyMusicGuide.OnRhapsodyRecommendsAlbumsListener paramOnRhapsodyRecommendsAlbumsListener);

	public abstract boolean a(
			RhapsodyMusicGuide.OnRhapsodyStaffPickAlbumsListener paramOnRhapsodyStaffPickAlbumsListener);

	public abstract boolean a(
			RhapsodyMusicGuide.OnRhapsodyTopAlbumsListener paramOnRhapsodyTopAlbumsListener);

	public abstract boolean a(
			RhapsodyMusicGuide.OnRhapsodyTopArtistsListener paramOnRhapsodyTopArtistsListener);

	public abstract boolean a(
			RhapsodyMusicGuide.OnRhapsodyTopTracksListener paramOnRhapsodyTopTracksListener);

	public abstract void b();

	public abstract void b(
			RhapsodyMusicGuide.OnRhapsodyExclusiveAlbumsListener paramOnRhapsodyExclusiveAlbumsListener);

	public abstract void b(
			RhapsodyMusicGuide.OnRhapsodyGenresListener paramOnRhapsodyGenresListener);

	public abstract void b(
			RhapsodyMusicGuide.OnRhapsodyJustAddedAlbumsListener paramOnRhapsodyJustAddedAlbumsListener);

	public abstract void b(
			RhapsodyMusicGuide.OnRhapsodyNewReleaseAlbumsListener paramOnRhapsodyNewReleaseAlbumsListener);

	public abstract void b(
			RhapsodyMusicGuide.OnRhapsodyRecommendsAlbumsListener paramOnRhapsodyRecommendsAlbumsListener);

	public abstract void b(
			RhapsodyMusicGuide.OnRhapsodyStaffPickAlbumsListener paramOnRhapsodyStaffPickAlbumsListener);

	public abstract void b(
			RhapsodyMusicGuide.OnRhapsodyTopAlbumsListener paramOnRhapsodyTopAlbumsListener);

	public abstract void b(
			RhapsodyMusicGuide.OnRhapsodyTopArtistsListener paramOnRhapsodyTopArtistsListener);

	public abstract void b(
			RhapsodyMusicGuide.OnRhapsodyTopTracksListener paramOnRhapsodyTopTracksListener);

	public abstract boolean c();

	public abstract void d();

	public abstract boolean e();

	public abstract boolean f();

	public abstract Results<Album> g();

	public abstract boolean h();

	public abstract boolean i();

	public abstract Results<Album> j();

	public abstract boolean k();

	public abstract boolean l();

	public abstract Results<Album> m();

	public abstract Cache n();

	public abstract void o();

	public abstract void p();

	public abstract void q();

	public abstract void r();

	public abstract boolean s();

	public abstract boolean t();

	public abstract Results<Song> u();

	public abstract boolean v();

	public abstract boolean w();

	public abstract Results<Album> x();

	public abstract boolean y();

	public abstract boolean z();
}
