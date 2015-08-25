package com.zd.model.director.video;

import java.util.ArrayList;

import com.zd.model.Result;

public abstract interface Movie extends Result {
	public interface OnMovieUpdateListener {
		public abstract void a(Movie paramMovie);
	}

	public abstract boolean a();

	public abstract boolean a(
			Movie.OnMovieUpdateListener paramOnMovieUpdateListener);

	public abstract void b(
			Movie.OnMovieUpdateListener paramOnMovieUpdateListener);

	public abstract boolean b();

	public abstract String c();

	public abstract String d();

	public abstract String e();

	public abstract String f();

	public abstract String g();

	public abstract String i();

	public abstract int j();

	public abstract ArrayList<String> k();

	public abstract ArrayList<String> l();

	public abstract boolean m();

	public abstract void n();

	public abstract String p_();
}

/*
 * Location: E:\去哪儿\com.control4.myhome-2\classes_dex2jar.jar Qualified Name:
 * com.control4.director.video.Movie JD-Core Version: 0.6.0
 */