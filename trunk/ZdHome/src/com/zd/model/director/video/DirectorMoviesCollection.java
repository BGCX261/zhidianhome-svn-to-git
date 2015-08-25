package com.zd.model.director.video;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import roboguice.util.Ln;
import android.app.Application;

import com.zd.model.DirectorResult;
import com.zd.model.DirectorResults;
import com.zd.model.Result;
import com.zd.model.Results;
import com.zd.model.Room;
import com.zd.model.command.ContainerMoviesCommand;

public abstract class DirectorMoviesCollection extends DirectorResult implements
		MoviesCollection {

	// @Inject
	protected Application _context;
	protected volatile boolean b = true;
	protected volatile boolean c = false;
	protected Timer d;
	protected TimerTask e;
	protected ArrayList<MoviesCollection.OnMoviesCollectionUpdateListener> f;
	protected DirectorResults<Movie> g;

	public Object a(int paramInt) {
		Result localResult;
		if (this.g == null)
			localResult = null;
		else
			localResult = this.g.c(paramInt);
		return localResult;
	}

	public void a(DirectorResult paramDirectorResult) {
		try {
			super.a(paramDirectorResult);
			if ((paramDirectorResult instanceof DirectorMoviesCollection)) {
				DirectorMoviesCollection localDirectorMoviesCollection = (DirectorMoviesCollection) paramDirectorResult;
				if ((localDirectorMoviesCollection.g != null)
						&& (localDirectorMoviesCollection.g.h() > 0))
					this.g = localDirectorMoviesCollection.g;
			}
		} catch (Exception localException) {
			Ln.e(localException);
		}
	}

	public void a(DirectorMovie paramDirectorMovie) {
		// if (paramDirectorMovie == null);
		// try
		// {
		// String str = paramDirectorMovie.at();
		// if ((str == null) || (str.length() == 0))
		// continue;
		// if (this.g == null)
		// {
		// this.g = new DirectorResults();
		// this.g.a(false);
		// this.g.a(this._context.getString(R.string.movies));
		// this.g.b(true);
		// }
		// if ((Movie)this.g.b(str) != null)
		// continue;
		// this.g.a(paramDirectorMovie);
		// }
		// catch (Exception localException)
		// {
		// Ln.e(localException);
		// }

	}

	public boolean a() {
		return this.b;
	}

	public boolean a(
			MoviesCollection.OnMoviesCollectionUpdateListener paramOnMoviesCollectionUpdateListener) {
		int i = 1;
		int j;
		try {
			if (!this.c) {
				d(true);
				Room localRoom = this._director.m().s();
				ContainerMoviesCommand localGetContainerMoviesCommand = getContainerMoviesCommand();
				// localGetContainerMoviesCommand.a(au());
				// localGetContainerMoviesCommand.b(localRoom.a());
				// localGetContainerMoviesCommand.a("container", this);
				// b(paramOnMoviesCollectionUpdateListener);
				// boolean bool =
				// this._director.a(localGetContainerMoviesCommand);
				// if (!bool)
				// d(false);
			}
		} catch (Exception e) {

		}
		return false;
	}

	public void b(
			MoviesCollection.OnMoviesCollectionUpdateListener paramOnMoviesCollectionUpdateListener) {
		if (paramOnMoviesCollectionUpdateListener != null) {
			if (this.f == null)
				this.f = new ArrayList();
			this.f.add(paramOnMoviesCollectionUpdateListener);
		}
	}

	public boolean b() {
		return this.c;
	}

	public Results<Movie> c() {
		return this.g;
	}

	public void c(boolean paramBoolean) {
		this.b = paramBoolean;
	}

	public int d() {
		int i;
		if (this.g == null)
			i = 0;
		else
			i = this.g.h();
		return i;
	}

	public void d(boolean paramBoolean) {
		// this.c = paramBoolean;
		// if (this.e != null)
		// this.e.cancel();
		// if (!this.c)
		// {
		// Iterator localIterator;
		// if (this.f != null)
		// localIterator = this.f.iterator();
		// while (true)
		// {
		// if (!localIterator.hasNext())
		// {
		// this.f.clear();
		// if (this.d == null)
		// break;
		// this.d.cancel();
		// this.d = null;
		// break;
		// }
		// MoviesCollection.OnMoviesCollectionUpdateListener
		// localOnMoviesCollectionUpdateListener =
		// (MoviesCollection.OnMoviesCollectionUpdateListener)localIterator.next();
		// if (localOnMoviesCollectionUpdateListener == null)
		// continue;
		// localOnMoviesCollectionUpdateListener.a(this);
		// }
		// }
		// if (this.d == null)
		// this.d = new Timer();
		// this.e = new DirectorMoviesCollection.1(this);
		// this.d.schedule(this.e, 20000L);
	}

	protected abstract ContainerMoviesCommand getContainerMoviesCommand();

	public void h() {
		try {
			super.h();
			if ((!this.Q) && (this.g != null))
				this.g.j();
		} catch (Exception localException) {
			Ln.e(localException);
		}
	}
}
