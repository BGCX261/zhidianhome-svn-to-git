package com.zd.model;

public abstract interface Cache {
	public abstract interface Cacheable {
		public abstract String at();

		public abstract void h();
	}

	public abstract void a();

	public abstract void a(int paramInt);

	public abstract void a(String paramString);

	public abstract boolean a(Cache.Cacheable paramCacheable);

	public abstract boolean a(Object paramObject, boolean paramBoolean);

	public abstract int b();

	public abstract boolean b(Cache.Cacheable paramCacheable);

	public abstract String c();

	public abstract boolean c(Cache.Cacheable paramCacheable);
}
