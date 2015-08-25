package com.zd.model.director.video;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import roboguice.util.Ln;
import android.database.sqlite.SQLiteStatement;

import com.zd.model.DirectorCache;
import com.zd.model.DirectorResult;
import com.zd.model.Room;
import com.zd.model.command.Command;
import com.zd.model.command.CommandFactory;
import com.zd.model.command.GetMovieInfoCommand;

public class DirectorMovie extends DirectorResult implements Movie {
	private static SQLiteStatement p = null;
	protected volatile boolean a = true;
	protected volatile boolean b = false;
	protected Timer c;
	protected TimerTask d;
	protected ArrayList<Movie.OnMovieUpdateListener> e;
	private int f;
	private String g;
	private String h;
	private String i;
	private String j;
	private String k;
	private String l;
	private String m;
	private ArrayList<String> n;
	private ArrayList<String> o;

	public DirectorMovie() {
		this.H = true;
	}

	public DirectorCache E() {
		return null;
		// try
		// {
		// DirectorCache localObject1 = z();
		// if (localObject1 != null);
		// for (localObject1 = (DirectorCache)((VideoLibrary)localObject1).k();
		// ; localObject1 = null)
		// return localObject1;
		// }
		// catch (Exception localObject2)
		// {
		//
		// }
	}

	public void a(int paramInt) {
		this.f = paramInt;
	}

	public void a(DirectorResult paramDirectorResult) {
		try {
			super.a(paramDirectorResult);
			if ((paramDirectorResult != null)
					&& ((paramDirectorResult instanceof DirectorMovie))) {
				DirectorMovie localDirectorMovie = (DirectorMovie) paramDirectorResult;
				String str = localDirectorMovie.c();
				if ((str != null) && (str.length() > 0))
					b(str);
				str = localDirectorMovie.p_();
				if ((str != null) && (str.length() > 0))
					c(str);
				int i1 = localDirectorMovie.j();
				if (i1 > 0)
					a(i1);
				d(localDirectorMovie.d());
				e(localDirectorMovie.e());
				f(localDirectorMovie.f());
				a(localDirectorMovie.i());
				g(localDirectorMovie.g());
				if ((localDirectorMovie.n != null)
						&& (localDirectorMovie.n.size() > 0))
					this.n = localDirectorMovie.n;
				if ((localDirectorMovie.o != null)
						&& (localDirectorMovie.o.size() > 0))
					this.o = localDirectorMovie.o;
				d(false);
			}
		} catch (Exception localException) {
			Ln.e(localException);
		}
	}

	public void a(String paramString) {
		this.g = paramString;
	}

	public void a(ArrayList<String> paramArrayList) {
		this.n = paramArrayList;
	}

	public boolean a() {
		return this.a;
	}

	// ERROR //
	public boolean a(android.database.sqlite.SQLiteDatabase paramSQLiteDatabase) {
		return false;
	}

	public boolean a(Movie.OnMovieUpdateListener paramOnMovieUpdateListener) {
		try {
			if (!this.b) {
				a(this._director.q());
				d(true);
				Room localRoom = this._director.m().s();
				Object localObject = (GetMovieInfoCommand) CommandFactory.GetMovieInfoProvider
						.get();
				((GetMovieInfoCommand) localObject).a(at());
				((GetMovieInfoCommand) localObject).b(localRoom.a());
				((GetMovieInfoCommand) localObject).a("movie", this);
				b(paramOnMovieUpdateListener);
				boolean bool = this._director.a((Command) localObject);
				if (!bool)
					d(false);
				localObject = E();
				if (localObject != null)
					((DirectorCache) localObject).a(this);
			}
		} catch (Exception e) {

		}
		return false;
	}

	public void b(Movie.OnMovieUpdateListener paramOnMovieUpdateListener) {
		if (paramOnMovieUpdateListener != null) {
			if (this.e == null)
				this.e = new ArrayList();
			this.e.add(paramOnMovieUpdateListener);
		}
	}

	public void b(String paramString) {
		this.h = paramString;
	}

	public void b(ArrayList<String> paramArrayList) {
		this.o = paramArrayList;
	}

	public boolean b() {
		return this.b;
	}

	public String c() {
		return this.h;
	}

	public void c(String paramString) {
		this.i = paramString;
	}

	public void c(boolean paramBoolean) {
		this.a = paramBoolean;
	}

	// ERROR //
	public boolean c(android.database.sqlite.SQLiteDatabase paramSQLiteDatabase) {
		return false;

	}

	public String d() {
		return this.j;
	}

	public void d(String paramString) {
		this.j = paramString;
	}

	public void d(boolean paramBoolean) {
		// this.b = paramBoolean;
		// if (this.d != null)
		// this.d.cancel();
		// if (!this.b)
		// {
		// Iterator localIterator;
		// if (this.e != null)
		// localIterator = this.e.iterator();
		// while (true)
		// {
		// if (!localIterator.hasNext())
		// {
		// this.e.clear();
		// if (this.c == null)
		// break;
		// this.c.cancel();
		// this.c = null;
		// break;
		// }
		// Movie.OnMovieUpdateListener localOnMovieUpdateListener =
		// (Movie.OnMovieUpdateListener)localIterator.next();
		// if (localOnMovieUpdateListener == null)
		// continue;
		// localOnMovieUpdateListener.a(this);
		// }
		// }
		// if (this.c == null)
		// this.c = new Timer();
		// this.d = new DirectorMovie.1(this);
		// this.c.schedule(this.d, 20000L);
	}

	public String e() {
		return this.k;
	}

	public void e(String paramString) {
		this.k = paramString;
	}

	public String f() {
		return this.l;
	}

	public void f(String paramString) {
		this.l = paramString;
	}

	public String g() {
		return this.m;
	}

	public void g(String paramString) {
		this.m = paramString;
	}

	public void h() {
		super.h();
		if (!this.Q) {
			this.l = null;
			this.j = null;
			this.k = null;
			this.i = null;
			this.n = null;
			this.o = null;
			this.g = null;
			this.m = null;
			this.a = true;
		}
	}

	public String i() {
		return this.g;
	}

	public int j() {
		return this.f;
	}

	public ArrayList<String> k() {
		return this.n;
	}

	public ArrayList<String> l() {
		return this.o;
	}

	public boolean m() {
		// int i4;
		// try
		// {
		// if (this._director == null)
		// {
		// int i1 = 0;
		// }
		// else
		// {
		// DirectorProject localDirectorProject = this._director.m();
		// int i2;
		// if (localDirectorProject == null)
		// {
		// i2 = 0;
		// }
		// else
		// {
		// DirectorRoom localDirectorRoom = (DirectorRoom)i2.s();
		// int i3;
		// if (localDirectorRoom == null)
		// {
		// i3 = 0;
		// }
		// else
		// {
		// StringBuilder localStringBuilder = new
		// StringBuilder("<param><name>mediaid</name><value type=\"INT\"><static>");
		// localStringBuilder.append(at());
		// localStringBuilder.append("</static></value></param>");
		// localStringBuilder.append("<param><name>ROOM_ID</name><value type=\"INTEGER\"><static>");
		// localStringBuilder.append(this._director.m().r());
		// localStringBuilder.append("</static></value></param>");
		// localStringBuilder.append("<param><name>type</name><value type=\"STRING\"><static>");
		// localStringBuilder.append("MOVIE");
		// localStringBuilder.append("</static></value></param>");
		// SendToDeviceCommand localSendToDeviceCommand =
		// (SendToDeviceCommand)CommandFactory.SendToDeviceProvider.a();
		// localSendToDeviceCommand.d(true);
		// localSendToDeviceCommand.b(i3.a());
		// localSendToDeviceCommand.a(localStringBuilder.toString());
		// localSendToDeviceCommand.c("SELECT_VIDEO_MEDIA");
		// i3.j(true);
		// boolean bool = this._director.a(localSendToDeviceCommand);
		// if (!bool)
		// i3.j(false);
		// i3 = bool;
		// }
		// }
		// }
		// }
		// catch (Exception i4)
		// {
		// Ln.e(localException);
		// i4 = 0;
		// }
		// return i4;
		return false;
	}

	public void n() {
		this.l = null;
		this.j = null;
		this.k = null;
		this.i = null;
		this.n = null;
		this.o = null;
		this.g = null;
		this.m = null;
		this.a = true;
	}

	public String p_() {
		return this.i;
	}

	protected String s_() {
		return "movie";
	}

	public String u() {
		return au();
	}

	public String v() {
		return c();
	}

	public String w() {
		return v();
	}

	public DirectorVideoLibrary z() {
		// try
		// {
		// DirectorVideoLibrary localDirectorVideoLibrary =
		// (DirectorVideoLibrary)this._director.m().s().av();
		// return localDirectorVideoLibrary;
		// }
		// catch (Exception localObject)
		// {
		//
		// }
		return null;
	}
}
