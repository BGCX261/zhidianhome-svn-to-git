package com.zd.model.director.video;

import com.zd.model.Result;
import com.zd.model.Results;

public abstract interface MoviesCollection extends Result {
	public interface OnMoviesCollectionUpdateListener {
		public abstract void a(MoviesCollection paramMoviesCollection);
	}

	public static final String a = "(Empty)";

	public abstract Object a(int paramInt);

	public abstract boolean a();

	public abstract boolean a(
			MoviesCollection.OnMoviesCollectionUpdateListener paramOnMoviesCollectionUpdateListener);

	public abstract void b(
			MoviesCollection.OnMoviesCollectionUpdateListener paramOnMoviesCollectionUpdateListener);

	public abstract boolean b();

	public abstract Results<Movie> c();

	public abstract int d();
}
