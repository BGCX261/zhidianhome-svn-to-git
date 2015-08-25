package com.zd.model.audio;

import com.zd.model.Result;

public abstract interface Song extends Result {
	public abstract interface OnSongUpdateListener {
		public abstract void a(Song paramSong);

	}

	public abstract String A();

	public abstract int B();

	public abstract boolean C();

	public abstract boolean D();

	public abstract boolean F();

	public abstract boolean a(
			Song.OnSongUpdateListener paramOnSongUpdateListener);

	public abstract int b();

	public abstract void b(Song.OnSongUpdateListener paramOnSongUpdateListener);

	public abstract String c();

	public abstract boolean d();

	public abstract boolean f(boolean paramBoolean);

	public abstract String i();

	public abstract boolean l();

	public abstract boolean m();

	public abstract boolean n();
}
