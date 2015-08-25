package com.zd.model;

import java.util.ArrayList;

public abstract interface Results<T extends Result> {
	public abstract int a();

	public abstract void a(String paramString, Object paramObject);

	public abstract T b(String paramString);

	public abstract void b(boolean paramBoolean);

	public abstract int c();

	public abstract T c(int paramInt);

	public abstract Object c(String paramString);

	public abstract LookupMap d();

	public abstract boolean e();

	public abstract String f();

	public abstract boolean g();

	public abstract int h();

	public abstract ArrayList<T> i();
}
