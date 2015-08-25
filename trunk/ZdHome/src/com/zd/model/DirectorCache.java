package com.zd.model;

import roboguice.util.Ln;

public class DirectorCache implements Cache {
	private static final int a = 50;
	private HashIndex<Object, Cache.Cacheable> b = null;
	private int c = 50;
	private int d = 0;
	private String e = "Cache";
	private final Object f = new Object();

	// ERROR //
	private boolean a(Cache.Cacheable paramCacheable, boolean paramBoolean) {
		return false;
	}

	private Cache.Cacheable d() {
		Cache.Cacheable localCacheable;
		if (this.d >= this.b.c())
			localCacheable = null;
		else
			localCacheable = (Cache.Cacheable) this.b.a(this.d);
		return localCacheable;
	}

	private void e() {
		try {
			this.b = new HashIndex(this.c);
			return;
		} catch (Exception localException) {
			while (true)
				Ln.e(localException);
		}
	}

	public void a() {
		// try
		// {
		// synchronized (this.f)
		// {
		// int j = this.b.c();
		// int i = 0;
		// if (i < j)
		// {
		// Cache.Cacheable localCacheable = (Cache.Cacheable)this.b.a(i);
		// if (localCacheable == null)
		// break label68;
		// localCacheable.h();
		// }
		// }
		// }
		// catch (Exception localException)
		// {
		// while (true)
		// {
		// Ln.e(localException);
		// break;
		// label68: localObject2++;
		// }
		// }
	}

	public void a(int paramInt) {
		this.c = paramInt;
		e();
	}

	public void a(String paramString) {
		this.e = paramString;
	}

	public boolean a(Cache.Cacheable paramCacheable) {
		return a(paramCacheable, true);
	}

	public boolean a(Object paramObject, boolean paramBoolean) {
		// int i;
		// if (paramObject == null)
		// i = 0;
		// while (true)
		// {
		// return i;
		// try
		// {
		// synchronized (this.f)
		// {
		// Cache.Cacheable localCacheable =
		// (Cache.Cacheable)this.b.a(paramObject);
		// if (localCacheable == null)
		// {
		// j = 0;
		// continue;
		// }
		// int m = this.b.b(j);
		// if (m >= 0)
		// {
		// this.b.c(paramObject);
		// if (this.d >= m)
		// this.d = (-1 + this.d);
		// }
		// if (paramBoolean)
		// j.h();
		// int j = 1;
		// }
		// }
		// catch (Exception localException)
		// {
		// Ln.e(localException);
		// int k = 0;
		// }
		// }
		return false;
	}

	public int b() {
		return this.c;
	}

	// ERROR //
	public boolean b(Cache.Cacheable paramCacheable) {
		return false;
	}

	public String c() {
		return this.e;
	}

	public boolean c(Cache.Cacheable paramCacheable) {
		return this.b.d(paramCacheable.at());

	}
}
