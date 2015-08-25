package com.zd.model.director.video;

import com.zd.model.Cache;
import com.zd.model.Results;

public abstract interface VideoLibrary {
	public interface OnMoviesUpdateListener {
		public abstract void a(VideoLibrary paramVideoLibrary);
	}

	public interface OnMovieRatingsUpdateListener {
		public abstract void a(VideoLibrary paramVideoLibrary);
	}

	public interface OnMovieGenresUpdateListener {
		public abstract void a(VideoLibrary paramVideoLibrary);
	}

	public interface OnActorsUpdateListener {
		public abstract void a(VideoLibrary paramVideoLibrary);
	}

	public interface OnDirectorsUpdateListener {
		public abstract void a(VideoLibrary paramVideoLibrary);
	}

	public abstract void A();

	public abstract boolean B();

	public abstract void C();

	public abstract void D();

	public abstract boolean E();

	public abstract MovieActor a(int paramInt);

	public abstract MovieActor a(String paramString);

	public abstract boolean a();

	public abstract boolean a(
			VideoLibrary.OnActorsUpdateListener paramOnActorsUpdateListener);

	public abstract boolean a(
			VideoLibrary.OnDirectorsUpdateListener paramOnDirectorsUpdateListener);

	public abstract boolean a(
			VideoLibrary.OnMovieGenresUpdateListener paramOnMovieGenresUpdateListener);

	public abstract boolean a(
			VideoLibrary.OnMovieRatingsUpdateListener paramOnMovieRatingsUpdateListener);

	public abstract boolean a(
			VideoLibrary.OnMoviesUpdateListener paramOnMoviesUpdateListener);

	public abstract MovieDirector b(int paramInt);

	public abstract MovieDirector b(String paramString);

	public abstract void b(
			VideoLibrary.OnActorsUpdateListener paramOnActorsUpdateListener);

	public abstract void b(
			VideoLibrary.OnDirectorsUpdateListener paramOnDirectorsUpdateListener);

	public abstract void b(
			VideoLibrary.OnMovieGenresUpdateListener paramOnMovieGenresUpdateListener);

	public abstract void b(
			VideoLibrary.OnMovieRatingsUpdateListener paramOnMovieRatingsUpdateListener);

	public abstract void b(
			VideoLibrary.OnMoviesUpdateListener paramOnMoviesUpdateListener);

	public abstract boolean b();

	public abstract Results<MovieActor> c();

	public abstract Movie c(int paramInt);

	public abstract Movie c(String paramString);

	public abstract int d();

	public abstract MovieGenre d(int paramInt);

	public abstract MovieGenre d(String paramString);

	public abstract MovieRating e(int paramInt);

	public abstract MovieRating e(String paramString);

	public abstract boolean e();

	public abstract boolean f();

	public abstract Results<MovieDirector> g();

	public abstract int h();

	public abstract boolean i();

	public abstract boolean j();

	public abstract Cache k();

	public abstract Results<Movie> l();

	public abstract int m();

	public abstract boolean n();

	public abstract boolean o();

	public abstract Results<MovieGenre> p();

	public abstract int q();

	public abstract boolean r();

	public abstract boolean s();

	public abstract Results<MovieRating> t();

	public abstract int u();

	public abstract void v();

	public abstract void w();

	public abstract void x();

	public abstract void y();

	public abstract void z();
}

/*
 * Location: E:\去哪儿\com.control4.myhome-2\classes_dex2jar.jar Qualified Name:
 * com.control4.director.video.VideoLibrary JD-Core Version: 0.6.0
 */