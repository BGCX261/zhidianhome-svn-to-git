package com.zd.home.service;

import java.util.Date;
import java.util.Vector;

import com.google.inject.ImplementedBy;
import com.zd.home.director.DirectorConnection;

@ImplementedBy(MyHomePreferenceService.class)
public abstract interface PreferenceService {
	public abstract int a(String paramString, int paramInt);

	public abstract Vector<DirectorConnection> a();

	public abstract void a(int paramInt);

	public abstract void a(long paramLong);

	public abstract void a(DirectorConnection paramDirectorConnection);

	public abstract void a(String paramString);

	public abstract void a(String paramString, int paramInt1, int paramInt2);

	public abstract void a(Date paramDate);

	public abstract void a(Vector<DirectorConnection> paramVector);

	public abstract void a(boolean paramBoolean);

	public abstract DirectorConnection b();

	public abstract void b(int paramInt);

	public abstract void b(String paramString);

	public abstract void b(boolean paramBoolean);

	public abstract void c(boolean paramBoolean);

	public abstract boolean c();

	public abstract int d();

	public abstract void d(boolean paramBoolean);

	public abstract void e(boolean paramBoolean);

	public abstract boolean e();

	public abstract long f();

	public abstract void f(boolean paramBoolean);

	public abstract boolean g();

	public abstract int h();

	public abstract boolean i();

	public abstract boolean j();

	public abstract String k();

	public abstract String l();

	public abstract Date m();

	public abstract boolean n();
}
