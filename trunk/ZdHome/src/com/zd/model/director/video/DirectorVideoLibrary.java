package com.zd.model.director.video;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import roboguice.util.Ln;
import android.app.Application;
import android.database.sqlite.SQLiteDatabase;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.zd.model.Cache;
import com.zd.model.Control4Director;
import com.zd.model.DirectorCache;
import com.zd.model.DirectorResults;
import com.zd.model.Results;

public class DirectorVideoLibrary implements VideoLibrary {
	private static final int b = 35;
	private static final String c = "Movies Count";
	private DirectorResults<MovieGenre> A;
	private DirectorResults<MovieRating> B;
	private DirectorCache C;
	private int D = 0;
	private final Object E = new Object();
	private final Object F = new Object();
	private final Object G = new Object();
	private final Object H = new Object();
	private final Object I = new Object();
	private ArrayList<VideoLibrary.OnDirectorsUpdateListener> J;
	private ArrayList<VideoLibrary.OnMoviesUpdateListener> K;
	private ArrayList<VideoLibrary.OnActorsUpdateListener> L;
	private ArrayList<VideoLibrary.OnMovieGenresUpdateListener> M;
	private ArrayList<VideoLibrary.OnMovieRatingsUpdateListener> N;
	private final int O = 0;

	// @Inject
	public Provider<DirectorMovieActor> _actorProvider;

	@Inject
	private Application _context;

	@Inject
	protected Control4Director _director;

	@Inject
	public Provider<DirectorMovieDirector> _directorProvider;

	// @Inject
	public Provider<DirectorMovieGenre> _genreProvider;

	// @Inject
	public Provider<DirectorMovie> _movieProvider;

	// @Inject
	public Provider<DirectorMovieRating> _ratingProvider;
	public volatile int a = 0;
	private volatile boolean d = true;
	private volatile boolean e = true;
	private volatile boolean f = true;
	private volatile boolean g = true;
	private volatile boolean h = true;
	private volatile boolean i = false;
	private volatile boolean j = false;
	private volatile boolean k = false;
	private volatile boolean l = false;
	private volatile boolean m = false;
	private Timer n;
	private TimerTask o;
	private Timer p;
	private TimerTask q;
	private Timer r;
	private TimerTask s;
	private Timer t;
	private TimerTask u;
	private Timer v;
	private TimerTask w;
	private DirectorResults<MovieActor> x;
	private DirectorResults<MovieDirector> y;
	private DirectorResults<Movie> z;

	public void A() {
		// while (true)
		// {
		// int i2;
		// try
		// {
		// if (this.B != null)
		// synchronized (this.I)
		// {
		// int i1 = u();
		// i2 = 0;
		// if (i2 >= i1)
		// continue;
		// MovieRating localMovieRating = e(i2);
		// if (localMovieRating == null)
		// break label80;
		// localMovieRating.h();
		// break label80;
		// this.B.j();
		// this.h = true;
		// }
		// }
		// catch (Exception localException)
		// {
		// Ln.e(localException);
		// }
		// return;
		// label80: i2++;
		// }
	}

	public boolean B() {
		if ((!this._director.isDemo())
				&& ((this.k) || (this.j) || (this.i) || (this.l) || (this.m)))
			return true;
		return false;
	}

	public void C() {
		this.a = (1 + this.a);
	}

	public void D() {

		this.a = (-1 + this.a);

	}

	public boolean E() {

		if (this.a > 0) {
			return true;
		}
		return false;
	}

	public int F() {
		return 0;
	}

	public int G() {
		return this.D;
	}

	public MovieActor a(int paramInt) {
		MovieActor localMovieActor;
		if (this.x == null)
			localMovieActor = null;
		else
			localMovieActor = (MovieActor) this.x.c(paramInt);
		return localMovieActor;
	}

	public MovieActor a(String paramString) {
		MovieActor localMovieActor;
		if (this.x == null)
			localMovieActor = null;
		else
			localMovieActor = (MovieActor) this.x.b(paramString);
		return localMovieActor;
	}

	// ERROR //
	public void a(DirectorMovie paramDirectorMovie) {

	}

	// ERROR //
	public void a(DirectorMovieActor paramDirectorMovieActor) {

	}

	// ERROR //
	public void a(DirectorMovieDirector paramDirectorMovieDirector) {

	}

	// ERROR //
	public void a(DirectorMovieGenre paramDirectorMovieGenre) {

	}

	// ERROR //
	public void a(DirectorMovieRating paramDirectorMovieRating) {

	}

	public void a(boolean paramBoolean) {
		this.e = paramBoolean;
	}

	public boolean a() {
		return this.e;
	}

	public boolean a(SQLiteDatabase paramSQLiteDatabase) {
		return false;
	}

	public boolean a(
			VideoLibrary.OnActorsUpdateListener paramOnActorsUpdateListener) {
		boolean bool1 = true;
		// try
		// {
		// if (this._director == null)
		// {
		// bool1 = false;
		// break label148;
		// }
		// if ((this.j) || (!this.e))
		// break label148;
		// if (this._director.G())
		// {
		// bool1 = a(this._director.q());
		// if (paramOnActorsUpdateListener == null)
		// break label148;
		// paramOnActorsUpdateListener.a(this);
		// }
		// }
		// catch (Exception i1)
		// {
		// Ln.e(localException);
		// b(false);
		// int i1 = 0;
		// }
		// w();
		// b(true);
		// GetMovieActorsCommand localGetMovieActorsCommand =
		// (GetMovieActorsCommand)CommandFactory.GetMovieActorsProvider.a();
		// localGetMovieActorsCommand.b(this.D);
		// localGetMovieActorsCommand.a("video-library", this);
		// localGetMovieActorsCommand.a("listener",
		// paramOnActorsUpdateListener);
		// b(paramOnActorsUpdateListener);
		// boolean bool2 = this._director.a(localGetMovieActorsCommand);
		// if (!bool2)
		// b(false);
		// label148:
		return bool1;
	}

	public boolean a(
			VideoLibrary.OnDirectorsUpdateListener paramOnDirectorsUpdateListener) {
		boolean bool1 = true;
		// try
		// {
		// if (this._director == null)
		// {
		// bool1 = false;
		// break label148;
		// }
		// if ((this.i) || (!this.d))
		// break label148;
		// if (this._director.G())
		// {
		// bool1 = b(this._director.q());
		// if (paramOnDirectorsUpdateListener == null)
		// break label148;
		// paramOnDirectorsUpdateListener.a(this);
		// }
		// }
		// catch (Exception i1)
		// {
		// Ln.e(localException);
		// d(false);
		// int i1 = 0;
		// }
		// x();
		// d(true);
		// GetMovieDirectorsCommand localGetMovieDirectorsCommand =
		// (GetMovieDirectorsCommand)CommandFactory.GetMovieDirectorsProvider.a();
		// localGetMovieDirectorsCommand.b(this.D);
		// localGetMovieDirectorsCommand.a("video-library", this);
		// localGetMovieDirectorsCommand.a("listener",
		// paramOnDirectorsUpdateListener);
		// b(paramOnDirectorsUpdateListener);
		// boolean bool2 = this._director.a(localGetMovieDirectorsCommand);
		// if (!bool2)
		// d(false);
		// label148:
		return bool1;
	}

	public boolean a(
			VideoLibrary.OnMovieGenresUpdateListener paramOnMovieGenresUpdateListener) {
		boolean bool1 = true;
		// try
		// {
		// if (this._director == null)
		// {
		// bool1 = false;
		// break label148;
		// }
		// if ((this.l) || (!this.g))
		// break label148;
		// if (this._director.G())
		// {
		// bool1 = c(this._director.q());
		// if (paramOnMovieGenresUpdateListener == null)
		// break label148;
		// paramOnMovieGenresUpdateListener.a(this);
		// }
		// }
		// catch (Exception i1)
		// {
		// Ln.e(localException);
		// h(false);
		// int i1 = 0;
		// }
		// z();
		// h(true);
		// GetMovieGenresCommand localGetMovieGenresCommand =
		// (GetMovieGenresCommand)CommandFactory.GetMovieGenresProvider.a();
		// localGetMovieGenresCommand.b(this.D);
		// localGetMovieGenresCommand.a("video-library", this);
		// localGetMovieGenresCommand.a("listener",
		// paramOnMovieGenresUpdateListener);
		// b(paramOnMovieGenresUpdateListener);
		// boolean bool2 = this._director.a(localGetMovieGenresCommand);
		// if (!bool2)
		// h(false);
		// label148:
		return bool1;
	}

	public boolean a(
			VideoLibrary.OnMovieRatingsUpdateListener paramOnMovieRatingsUpdateListener) {
		boolean bool1 = true;
		// try
		// {
		// if (this._director == null)
		// {
		// bool1 = false;
		// break label148;
		// }
		// if ((this.m) || (!this.h))
		// break label148;
		// if (this._director.G())
		// {
		// bool1 = e(this._director.q());
		// if (paramOnMovieRatingsUpdateListener == null)
		// break label148;
		// paramOnMovieRatingsUpdateListener.a(this);
		// }
		// }
		// catch (Exception i1)
		// {
		// Ln.e(localException);
		// j(false);
		// int i1 = 0;
		// }
		// A();
		// j(true);
		// GetMovieRatingsCommand localGetMovieRatingsCommand =
		// (GetMovieRatingsCommand)CommandFactory.GetMovieRatingsProvider.a();
		// localGetMovieRatingsCommand.b(this.D);
		// localGetMovieRatingsCommand.a("video-library", this);
		// localGetMovieRatingsCommand.a("listener",
		// paramOnMovieRatingsUpdateListener);
		// b(paramOnMovieRatingsUpdateListener);
		// boolean bool2 = this._director.a(localGetMovieRatingsCommand);
		// if (!bool2)
		// j(false);
		// label148:
		return bool1;
	}

	public boolean a(
			VideoLibrary.OnMoviesUpdateListener paramOnMoviesUpdateListener) {
		boolean bool1 = true;
		// try
		// {
		// if (this._director == null)
		// {
		// bool1 = false;
		// break label143;
		// }
		// if ((this.k) || (!this.f))
		// break label143;
		// if (this._director.G())
		// {
		// bool1 = d(this._director.q());
		// if (paramOnMoviesUpdateListener == null)
		// break label143;
		// paramOnMoviesUpdateListener.a(this);
		// }
		// }
		// catch (Exception i1)
		// {
		// Ln.e(localException);
		// f(false);
		// int i1 = 0;
		// }
		// y();
		// f(true);
		// GetMoviesCommand localGetMoviesCommand =
		// (GetMoviesCommand)CommandFactory.GetMoviesProvider.a();
		// localGetMoviesCommand.b(this.D);
		// localGetMoviesCommand.a("video-library", this);
		// localGetMoviesCommand.a("listener", paramOnMoviesUpdateListener);
		// boolean bool2 = this._director.a(localGetMoviesCommand);
		// if (!bool2)
		// f(false);
		// label143:
		return bool1;
	}

	public MovieDirector b(int paramInt) {
		MovieDirector localMovieDirector;
		if (this.y == null)
			localMovieDirector = null;
		else
			localMovieDirector = (MovieDirector) this.y.c(paramInt);
		return localMovieDirector;
	}

	public MovieDirector b(String paramString) {
		MovieDirector localMovieDirector;
		if (this.y == null)
			localMovieDirector = null;
		else
			localMovieDirector = (MovieDirector) this.y.b(paramString);
		return localMovieDirector;
	}

	public void b(
			VideoLibrary.OnActorsUpdateListener paramOnActorsUpdateListener) {
		if (paramOnActorsUpdateListener != null) {
			if (this.L == null)
				this.L = new ArrayList();
			this.L.add(paramOnActorsUpdateListener);
		}
	}

	public void b(
			VideoLibrary.OnDirectorsUpdateListener paramOnDirectorsUpdateListener) {
		if (paramOnDirectorsUpdateListener != null) {
			if (this.J == null)
				this.J = new ArrayList();
			this.J.add(paramOnDirectorsUpdateListener);
		}
	}

	public void b(
			VideoLibrary.OnMovieGenresUpdateListener paramOnMovieGenresUpdateListener) {
		if (paramOnMovieGenresUpdateListener != null) {
			if (this.M == null)
				this.M = new ArrayList();
			this.M.add(paramOnMovieGenresUpdateListener);
		}
	}

	public void b(
			VideoLibrary.OnMovieRatingsUpdateListener paramOnMovieRatingsUpdateListener) {
		if (paramOnMovieRatingsUpdateListener != null) {
			if (this.N == null)
				this.N = new ArrayList();
			this.N.add(paramOnMovieRatingsUpdateListener);
		}
	}

	public void b(
			VideoLibrary.OnMoviesUpdateListener paramOnMoviesUpdateListener) {
		if (paramOnMoviesUpdateListener != null) {
			if (this.K == null)
				this.K = new ArrayList();
			this.K.add(paramOnMoviesUpdateListener);
		}
	}

	public void b(boolean paramBoolean) {
		// this.j = paramBoolean;
		// if (this.q != null)
		// this.q.cancel();
		// if (!this.j)
		// {
		// Object localObject;
		// if (this.x != null)
		// {
		// localObject = this.x.d();
		// if (localObject != null)
		// ((LookupMap)localObject).b();
		// }
		// if (this.L != null)
		// localObject = this.L.iterator();
		// while (true)
		// {
		// if (!((Iterator)localObject).hasNext())
		// {
		// this.L.clear();
		// if (this.p == null)
		// break;
		// this.p.cancel();
		// this.p = null;
		// break;
		// }
		// VideoLibrary.OnActorsUpdateListener localOnActorsUpdateListener =
		// (VideoLibrary.OnActorsUpdateListener)((Iterator)localObject).next();
		// if (localOnActorsUpdateListener == null)
		// continue;
		// localOnActorsUpdateListener.a(this);
		// }
		// }
		// if (this.p == null)
		// this.p = new Timer();
		// this.q = new DirectorVideoLibrary.1(this);
		// this.p.schedule(this.q, 25000L);
	}

	public boolean b() {
		return this.j;
	}

	public boolean b(SQLiteDatabase paramSQLiteDatabase) {
		return false;
	}

	public Results<MovieActor> c() {
		return this.x;
	}

	public Movie c(int paramInt) {
		Movie localMovie;
		if (this.z == null)
			localMovie = null;
		else
			localMovie = (Movie) this.z.c(paramInt);
		return localMovie;
	}

	public Movie c(String paramString) {
		Movie localMovie;
		if (this.z == null)
			localMovie = null;
		else
			localMovie = (Movie) this.z.b(paramString);
		return localMovie;
	}

	public void c(boolean paramBoolean) {
		this.d = paramBoolean;
	}

	public boolean c(SQLiteDatabase paramSQLiteDatabase) {
		return false;
	}

	public int d() {
		int i1;
		if (this.x == null)
			i1 = 0;
		else
			i1 = this.x.h();
		return i1;
	}

	public MovieGenre d(int paramInt) {
		MovieGenre localMovieGenre;
		if (this.A == null)
			localMovieGenre = null;
		else
			localMovieGenre = (MovieGenre) this.A.c(paramInt);
		return localMovieGenre;
	}

	public MovieGenre d(String paramString) {
		MovieGenre localMovieGenre;
		if (this.A == null)
			localMovieGenre = null;
		else
			localMovieGenre = (MovieGenre) this.A.b(paramString);
		return localMovieGenre;
	}

	public void d(boolean paramBoolean) {
		// this.i = paramBoolean;
		// if (this.o != null)
		// this.o.cancel();
		// if (!this.i)
		// {
		// Object localObject;
		// if (this.y != null)
		// {
		// localObject = this.y.d();
		// if (localObject != null)
		// ((LookupMap)localObject).b();
		// }
		// if (this.J != null)
		// localObject = this.J.iterator();
		// while (true)
		// {
		// if (!((Iterator)localObject).hasNext())
		// {
		// this.J.clear();
		// if (this.n == null)
		// break;
		// this.n.cancel();
		// this.n = null;
		// break;
		// }
		// VideoLibrary.OnDirectorsUpdateListener localOnDirectorsUpdateListener
		// =
		// (VideoLibrary.OnDirectorsUpdateListener)((Iterator)localObject).next();
		// if (localOnDirectorsUpdateListener == null)
		// continue;
		// localOnDirectorsUpdateListener.a(this);
		// }
		// }
		// if (this.n == null)
		// this.n = new Timer();
		// this.o = new DirectorVideoLibrary.2(this);
		// this.n.schedule(this.o, 25000L);
	}

	// ERROR //
	public boolean d(SQLiteDatabase paramSQLiteDatabase) {
		return false;

	}

	public MovieRating e(int paramInt) {
		MovieRating localMovieRating;
		if (this.B == null)
			localMovieRating = null;
		else
			localMovieRating = (MovieRating) this.B.c(paramInt);
		return localMovieRating;
	}

	public MovieRating e(String paramString) {
		MovieRating localMovieRating;
		if (this.B == null)
			localMovieRating = null;
		else
			localMovieRating = (MovieRating) this.B.b(paramString);
		return localMovieRating;
	}

	public void e(boolean paramBoolean) {
		this.f = paramBoolean;
	}

	public boolean e() {
		return this.d;
	}

	// ERROR //
	public boolean e(SQLiteDatabase paramSQLiteDatabase) {
		return false;

	}

	public void f(int paramInt) {
		this.D = paramInt;
	}

	public void f(boolean paramBoolean) {
		// this.k = paramBoolean;
		// if (this.s != null)
		// this.s.cancel();
		// if (!this.k)
		// {
		// Object localObject = this.z.d();
		// if (localObject != null)
		// ((LookupMap)localObject).b();
		// Iterator localIterator;
		// if (this.K != null)
		// localIterator = this.K.iterator();
		// while (true)
		// {
		// if (!localIterator.hasNext())
		// {
		// this.K.clear();
		// if (this.r == null)
		// break;
		// this.r.cancel();
		// this.r = null;
		// break;
		// }
		// localObject =
		// (VideoLibrary.OnMoviesUpdateListener)localIterator.next();
		// if (localObject == null)
		// continue;
		// ((VideoLibrary.OnMoviesUpdateListener)localObject).a(this);
		// }
		// }
		// if (this.r == null)
		// this.r = new Timer();
		// this.s = new DirectorVideoLibrary.3(this);
		// this.r.schedule(this.s, 25000L);
	}

	public boolean f() {
		return this.i;
	}

	public Results<MovieDirector> g() {
		return this.y;
	}

	public void g(boolean paramBoolean) {
		this.g = paramBoolean;
	}

	public int h() {
		int i1;
		if (this.y == null)
			i1 = 0;
		else
			i1 = this.y.h();
		return i1;
	}

	public void h(boolean paramBoolean) {
		// this.l = paramBoolean;
		// if (this.w != null)
		// this.w.cancel();
		// if (!this.l)
		// {
		// Object localObject;
		// if (this.A != null)
		// {
		// localObject = this.A.d();
		// if (localObject != null)
		// ((LookupMap)localObject).b();
		// }
		// Iterator localIterator;
		// if (this.M != null)
		// localIterator = this.M.iterator();
		// while (true)
		// {
		// if (!localIterator.hasNext())
		// {
		// this.M.clear();
		// if (this.v == null)
		// break;
		// this.v.cancel();
		// this.v = null;
		// break;
		// }
		// localObject =
		// (VideoLibrary.OnMovieGenresUpdateListener)localIterator.next();
		// if (localObject == null)
		// continue;
		// ((VideoLibrary.OnMovieGenresUpdateListener)localObject).a(this);
		// }
		// }
		// if (this.v == null)
		// this.v = new Timer();
		// this.w = new DirectorVideoLibrary.4(this);
		// this.v.schedule(this.w, 25000L);
	}

	public void i(boolean paramBoolean) {
		this.h = paramBoolean;
	}

	public boolean i() {
		return this.f;
	}

	public void j(boolean paramBoolean) {
		// this.m = paramBoolean;
		// if (this.u != null)
		// this.u.cancel();
		// if (!this.m)
		// {
		// Object localObject;
		// if (this.B != null)
		// {
		// localObject = this.B.d();
		// if (localObject != null)
		// ((LookupMap)localObject).b();
		// }
		// if (this.N != null)
		// localObject = this.N.iterator();
		// while (true)
		// {
		// if (!((Iterator)localObject).hasNext())
		// {
		// this.N.clear();
		// if (this.t == null)
		// break;
		// this.t.cancel();
		// this.t = null;
		// break;
		// }
		// VideoLibrary.OnMovieRatingsUpdateListener
		// localOnMovieRatingsUpdateListener =
		// (VideoLibrary.OnMovieRatingsUpdateListener)((Iterator)localObject).next();
		// if (localOnMovieRatingsUpdateListener == null)
		// continue;
		// localOnMovieRatingsUpdateListener.a(this);
		// }
		// }
		// if (this.t == null)
		// this.t = new Timer();
		// this.u = new DirectorVideoLibrary.5(this);
		// this.t.schedule(this.u, 25000L);
	}

	public boolean j() {
		return this.k;
	}

	public Cache k() {
		return this.C;
	}

	public Results<Movie> l() {
		return this.z;
	}

	public int m() {
		int i1;
		if (this.z == null)
			i1 = 0;
		else
			i1 = this.z.h();
		return i1;
	}

	public boolean n() {
		return this.g;
	}

	public boolean o() {
		return this.l;
	}

	public Results<MovieGenre> p() {
		return this.A;
	}

	public int q() {
		int i1;
		if (this.A == null)
			i1 = 0;
		else
			i1 = this.A.h();
		return i1;
	}

	public boolean r() {
		return this.h;
	}

	public boolean s() {
		return this.m;
	}

	public Results<MovieRating> t() {
		return this.B;
	}

	public int u() {
		int i1;
		if (this.B == null)
			i1 = 0;
		else
			i1 = this.B.h();
		return i1;
	}

	public void v() {
		try {
			w();
			y();
			x();
			A();
			z();
			return;
		} catch (Exception localException) {
			while (true)
				Ln.e(localException);
		}
	}

	public void w() {
		// while (true)
		// {
		// int i1;
		// try
		// {
		// if (this.x != null)
		// synchronized (this.F)
		// {
		// int i2 = d();
		// i1 = 0;
		// if (i1 >= i2)
		// continue;
		// MovieActor localMovieActor = a(i1);
		// if (localMovieActor == null)
		// break label79;
		// localMovieActor.h();
		// break label79;
		// this.x.j();
		// this.e = true;
		// }
		// }
		// catch (Exception localException)
		// {
		// Ln.e(localException);
		// }
		// return;
		// label79: i1++;
		// }
	}

	public void x() {
		// while (true)
		// {
		// int i2;
		// try
		// {
		// if (this.y != null)
		// synchronized (this.G)
		// {
		// int i1 = h();
		// i2 = 0;
		// if (i2 >= i1)
		// continue;
		// MovieDirector localMovieDirector = b(i2);
		// if (localMovieDirector == null)
		// break label80;
		// localMovieDirector.h();
		// break label80;
		// this.y.j();
		// this.d = true;
		// }
		// }
		// catch (Exception localException)
		// {
		// Ln.e(localException);
		// }
		// return;
		// label80: i2++;
		// }
	}

	public void y() {
		// while (true)
		// {
		// try
		// {
		// if (this.z != null)
		// synchronized (this.E)
		// {
		// int i2 = m();
		// int i1 = 0;
		// if (i1 >= i2)
		// continue;
		// Movie localMovie = c(i1);
		// if (localMovie == null)
		// break label94;
		// localMovie.h();
		// break label94;
		// if (this.C == null)
		// continue;
		// this.C.a();
		// this.z.j();
		// this.f = true;
		// }
		// }
		// catch (Exception localException)
		// {
		// Ln.e(localException);
		// }
		// return;
		// label94: localObject2++;
		// }
	}

	public void z() {
		// while (true)
		// {
		// int i2;
		// try
		// {
		// if (this.A != null)
		// synchronized (this.H)
		// {
		// int i1 = q();
		// i2 = 0;
		// if (i2 >= i1)
		// continue;
		// MovieGenre localMovieGenre = d(i2);
		// if (localMovieGenre == null)
		// break label80;
		// localMovieGenre.h();
		// break label80;
		// this.A.j();
		// this.g = true;
		// }
		// }
		// catch (Exception localException)
		// {
		// Ln.e(localException);
		// }
		// return;
		// label80: i2++;
		// }
	}
}
