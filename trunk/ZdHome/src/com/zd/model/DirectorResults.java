package com.zd.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import roboguice.util.Ln;

public class DirectorResults<T extends Result> implements Results<T> {
	private HashIndex<String, T> a;
	private DirectorLookupMap b;
	private boolean c = false;
	private boolean d = true;
	private boolean e = false;
	private int f = 0;
	private int g = 0;
	private String h;
	private boolean i = false;
	private boolean j = false;
	private HashMap<String, Object> k = null;

	public int a() {
		return this.f;
	}

	public void a(int paramInt) {
		this.f = paramInt;
	}

	public void a(DirectorLookupMap paramDirectorLookupMap) {
		this.b = paramDirectorLookupMap;
	}

	public void a(String paramString) {
		this.h = paramString;
	}

	public void a(String paramString, Object paramObject) {
		if (paramString != null)
			try {
				if (paramString.length() != 0) {
					if (this.k == null)
						this.k = new HashMap();
					this.k.put(paramString, paramObject);
				}
			} catch (Exception localException) {
				Ln.e(localException);
			}
	}

	public void a(boolean paramBoolean) {
		this.j = paramBoolean;
	}

	public boolean a(T paramT) {
		// int m;
		// if (paramT == null)
		// m = 0;
		// while (true)
		// {
		// return m;
		// while (true)
		// {
		// try
		// {
		// Object localObject = paramT.at();
		// if ((localObject == null) || (((String)localObject).length() == 0))
		// break label260;
		// if (this.a != null)
		// continue;
		// this.a = new HashIndex();
		// this.a.a(this.j);
		// if ((this.f != 0) || (this.g != h()))
		// break label255;
		// m = 1;
		// this.a.a(localObject, paramT);
		// if (m == 0)
		// continue;
		// this.g = this.a.c();
		// if (!this.c)
		// continue;
		// if (this.b != null)
		// continue;
		// this.b = new DirectorLookupMap();
		// this.b.b(this.d);
		// this.b.a(this.e);
		// localObject = this.b.a(paramT);
		// if (localObject == null)
		// continue;
		// DirectorLookupAlpha localDirectorLookupAlpha =
		// (DirectorLookupAlpha)this.b.a((String)localObject);
		// if (localDirectorLookupAlpha != null)
		// continue;
		// localDirectorLookupAlpha = new
		// DirectorLookupAlpha((String)localObject);
		// localObject = this.b.a(-1 + this.b.a());
		// if (localObject == null)
		// continue;
		// localDirectorLookupAlpha.a(((LookupAlpha)localObject).b() +
		// ((LookupAlpha)localObject).c());
		// this.b.a(localDirectorLookupAlpha);
		// localDirectorLookupAlpha.c(1);
		// int n = 1;
		// }
		// catch (Exception i1)
		// {
		// Ln.e(localException);
		// i1 = 0;
		// }
		// break;
		// label255: i1 = 0;
		// }
		// label260: int i1 = 0;
		// }
		return false;
	}

	public boolean a(T paramT, int paramInt) {
		// int m;
		// if (paramT == null)
		// m = 0;
		// while (true)
		// {
		// return m;
		// while (true)
		// {
		// try
		// {
		// Object localObject1 = paramT.at();
		// if ((localObject1 == null) || (((String)localObject1).length() == 0))
		// break label272;
		// if (this.a != null)
		// continue;
		// this.a = new HashIndex();
		// this.a.a(this.j);
		// if ((this.f != 0) || (this.g != h()))
		// break label266;
		// int i2 = 1;
		// this.a.a(localObject1, paramT, paramInt);
		// if (i2 == 0)
		// continue;
		// this.g = this.a.c();
		// if (!this.c)
		// continue;
		// if (this.b != null)
		// continue;
		// this.b = new DirectorLookupMap();
		// this.b.b(this.d);
		// this.b.a(this.e);
		// Object localObject2 = this.b.a(paramT);
		// if (localObject2 == null)
		// continue;
		// localObject1 = (DirectorLookupAlpha)this.b.a((String)localObject2);
		// if (localObject1 != null)
		// continue;
		// localObject1 = new DirectorLookupAlpha((String)localObject2);
		// localObject2 = this.b.a(-1 + this.b.a());
		// if (localObject2 == null)
		// continue;
		// ((DirectorLookupAlpha)localObject1).a(((LookupAlpha)localObject2).b()
		// + ((LookupAlpha)localObject2).c());
		// this.b.a((DirectorLookupAlpha)localObject1);
		// ((DirectorLookupAlpha)localObject1).c(1);
		// int n = 1;
		// }
		// catch (Exception i1)
		// {
		// Ln.e(localException);
		// i1 = 0;
		// }
		// break;
		// label266: int i3 = 0;
		// }
		// label272: int i1 = 0;
		// }
		return false;
	}

	public T b(String paramString) {
		T localResult;
		if (this.a == null)
			localResult = null;
		else
			localResult = this.a.a(paramString);
		return localResult;
	}

	public void b(int paramInt) {
		this.g = paramInt;
	}

	public void b(boolean paramBoolean) {
		this.c = paramBoolean;
	}

	public boolean b() {
		return this.j;
	}

	public int c() {
		return this.g;
	}

	public T c(int paramInt) {
		T localResult;
		if (this.a == null)
			localResult = null;
		else
			localResult = this.a.a(paramInt);
		return localResult;
	}

	public Object c(String paramString) {
		Object localObject2 = null;
		try {
			Object localObject1;
			if ((this.k == null) || (paramString == null)
					|| (paramString.length() == 0)) {
				localObject1 = Boolean.valueOf(false);
			} else {
				localObject1 = this.k.get(paramString);

			}
		} catch (Exception E) {

		}
		return localObject2;
	}

	public void c(boolean paramBoolean) {
		this.i = paramBoolean;
	}

	public LookupMap d() {
		return this.b;
	}

	public void d(boolean paramBoolean) {
		this.d = paramBoolean;
	}

	public void e(boolean paramBoolean) {
		this.e = paramBoolean;
	}

	public boolean e() {
		return this.i;
	}

	public String f() {
		return this.h;
	}

	public void f(boolean paramBoolean) {
		try {
			Collections.sort(this.a.a());
			return;
		} catch (Exception localException) {
			while (true)
				Ln.e(localException);
		}
	}

	public boolean g() {
		boolean m = false;
		if (this.f + h() >= this.g)
			m = false;
		else
			m = true;
		return m;
	}

	public int h() {
		int m;
		if (this.a == null)
			m = 0;
		else
			m = this.a.c();
		return m;
	}

	public ArrayList<T> i() {
		ArrayList localArrayList;
		if (this.a == null)
			localArrayList = null;
		else
			localArrayList = this.a.a();
		return localArrayList;
	}

	public void j() {
		try {
			if (this.a != null)
				this.a.clear();
			this.b = null;
			this.g = 0;
			this.f = 0;
			this.h = null;
			this.i = false;
			if (this.k != null)
				this.k.clear();
			return;
		} catch (Exception localException) {
			while (true)
				Ln.e(localException);
		}
	}
}
