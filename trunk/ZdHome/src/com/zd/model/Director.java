package com.zd.model;

import android.database.sqlite.SQLiteDatabase;
import android.util.DisplayMetrics;

import com.zd.home.director.DirectorConnection;
import com.zd.model.audio.ZoneManager;
import com.zd.model.rhapsody.Rhapsody;

//@ImplementedBy(Control4Director.class)
public abstract interface Director {
	public interface OnAuthenticateDeviceStatusListener {
		public abstract void a();

		public abstract void a(String paramString);
	}

	public class OnVersionInfoUpdateListener {

	}

	public class OnIdentifyDeviceStatusListener {

	}

	public abstract interface DirectorListener
	{
	  public abstract void a();

	  public abstract void a(String paramString);

	  public abstract void a(boolean paramBoolean);

	  public abstract void b();

	  public abstract void c();

	  public abstract void d();

	  public abstract void e();

	  public abstract void f();

	  public abstract void g();

	  public abstract void h();

	  public abstract void i();

	  public abstract void j();
	}


	public interface OnProgressUpdateListener {
		public abstract void a();

		public abstract void a(String paramString);

		public abstract void b();

	}

	public static final int j = 5020;

	public abstract Director.OnProgressUpdateListener A();

	public abstract boolean B();

	public abstract boolean D();

	public abstract void E();

	public abstract boolean F();

	public abstract boolean isDemo();

	public abstract ZoneManager J();

	public abstract String L();

	public abstract boolean M();

	public abstract void O();

	public abstract String P();

	public abstract Rhapsody Q();

	public abstract void a(DisplayMetrics paramDisplayMetrics);

	public abstract void a(Director.DirectorListener paramDirectorListener);

	public abstract void a(
			Director.OnProgressUpdateListener paramOnProgressUpdateListener);

	public abstract void a(Runnable paramRunnable);

	public abstract void a(Runnable paramRunnable, long paramLong);

	public abstract void a(boolean paramBoolean);

	public abstract boolean a();

	public abstract boolean a(
			Director.OnIdentifyDeviceStatusListener paramOnIdentifyDeviceStatusListener);

	public abstract boolean a(
			Director.OnVersionInfoUpdateListener paramOnVersionInfoUpdateListener);

	public abstract boolean a(DirectorConnection paramDirectorConnection);

	// public abstract boolean a(Command.NotificationListener
	// paramNotificationListener);

	public abstract void b(Director.DirectorListener paramDirectorListener);

	public abstract void b(Runnable paramRunnable);

	public abstract boolean b();

	public abstract void c(DirectorConnection paramDirectorConnection);

	public abstract String d();

	public abstract void d(boolean paramBoolean);

	public abstract DisplayMetrics e();

	public abstract void e(boolean paramBoolean);

	public abstract String f();

	public abstract String g();

	public abstract String h();

	public abstract String k();

	public abstract int l();

	public abstract DirectorProject m();

	public abstract boolean n();

	public abstract SQLiteDatabase p();

	public abstract SQLiteDatabase q();

	public abstract boolean r();

	public abstract DirectorConnection s();

	public abstract boolean t();

	public abstract boolean u();

	public abstract void v();

	public abstract void w();

	public abstract void x();

	public abstract void y();
}
