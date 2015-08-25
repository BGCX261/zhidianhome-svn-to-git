package com.zd.model.rhapsody;

import com.zd.model.Results;
import com.zd.model.audio.Genre;
import com.zd.model.audio.Playlist;

public abstract interface RhapsodyPlaylistCentral {
	public abstract interface OnRhapsodyDynamicPlaylistsListener {
		public abstract void a(
				RhapsodyPlaylistCentral paramRhapsodyPlaylistCentral);
	}

	public abstract interface OnRhapsodyFeaturedPlaylistsListener {
		public abstract void a(
				RhapsodyPlaylistCentral paramRhapsodyPlaylistCentral);
	}

	public abstract interface OnRhapsodyPlaylistGenresListener {
		public abstract void a(
				RhapsodyPlaylistCentral paramRhapsodyPlaylistCentral);
	}

	public abstract interface OnRhapsodyRecentPlaylistsListener {
		public abstract void a(
				RhapsodyPlaylistCentral paramRhapsodyPlaylistCentral);
	}

	public abstract interface OnRhapsodyTopPlaylistsListener {
		public abstract void a(
				RhapsodyPlaylistCentral paramRhapsodyPlaylistCentral);
	}

	public abstract boolean a();

	public abstract boolean a(
			RhapsodyPlaylistCentral.OnRhapsodyDynamicPlaylistsListener paramOnRhapsodyDynamicPlaylistsListener);

	public abstract boolean a(
			RhapsodyPlaylistCentral.OnRhapsodyFeaturedPlaylistsListener paramOnRhapsodyFeaturedPlaylistsListener);

	public abstract boolean a(
			RhapsodyPlaylistCentral.OnRhapsodyPlaylistGenresListener paramOnRhapsodyPlaylistGenresListener);

	public abstract boolean a(
			RhapsodyPlaylistCentral.OnRhapsodyRecentPlaylistsListener paramOnRhapsodyRecentPlaylistsListener);

	public abstract boolean a(
			RhapsodyPlaylistCentral.OnRhapsodyTopPlaylistsListener paramOnRhapsodyTopPlaylistsListener);

	public abstract void b(
			RhapsodyPlaylistCentral.OnRhapsodyDynamicPlaylistsListener paramOnRhapsodyDynamicPlaylistsListener);

	public abstract void b(
			RhapsodyPlaylistCentral.OnRhapsodyFeaturedPlaylistsListener paramOnRhapsodyFeaturedPlaylistsListener);

	public abstract void b(
			RhapsodyPlaylistCentral.OnRhapsodyPlaylistGenresListener paramOnRhapsodyPlaylistGenresListener);

	public abstract void b(
			RhapsodyPlaylistCentral.OnRhapsodyRecentPlaylistsListener paramOnRhapsodyRecentPlaylistsListener);

	public abstract void b(
			RhapsodyPlaylistCentral.OnRhapsodyTopPlaylistsListener paramOnRhapsodyTopPlaylistsListener);

	public abstract boolean b();

	public abstract Results<Playlist> c();

	public abstract boolean d();

	public abstract boolean e();

	public abstract Results<Playlist> f();

	public abstract boolean g();

	public abstract boolean h();

	public abstract Results<Playlist> i();

	public abstract boolean j();

	public abstract boolean k();

	public abstract Results<Genre> l();

	public abstract boolean m();

	public abstract boolean n();

	public abstract Results<Playlist> o();

	public abstract void p();

	public abstract void q();

	public abstract void r();

	public abstract void s();

	public abstract void t();

	public abstract void u();
}
