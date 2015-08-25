package com.zd.model;

import java.util.Set;

public class DirectorLookupMap implements LookupMap {
	private HashIndex<String, DirectorLookupAlpha> a = null;
	private boolean b = false;
	private boolean c = false;
	private int d = 1;
	private final boolean e = false;
	private boolean f = true;

	public int a() {
		int i;
		if (this.a == null)
			i = 0;
		else
			i = this.a.c();
		return i;
	}

	public LookupAlpha a(int paramInt) {
		LookupAlpha localLookupAlpha;
		if (this.a == null)
			localLookupAlpha = null;
		else
			localLookupAlpha = (LookupAlpha) this.a.a(paramInt);
		return localLookupAlpha;
	}

	public LookupAlpha a(String paramString) {
		LookupAlpha localLookupAlpha;
		if (this.a == null)
			localLookupAlpha = null;
		else
			localLookupAlpha = (LookupAlpha) this.a.a(paramString);
		return localLookupAlpha;
	}

	// ERROR //
	public String a(Result paramResult) {
		return "";
	}

	// ERROR //
	public void a(DirectorLookupAlpha paramDirectorLookupAlpha) {

	}

	public void a(boolean paramBoolean) {
		this.b = paramBoolean;
	}

	public int b(String paramString) {
		// int i = 0;
		// int k;
		// if ((paramString == null) || (paramString.length() == 0))
		// {
		// k = -1;
		// return k;
		// }
		// if (this.a != null);
		// while (true)
		// {
		// int i3;
		// try
		// {
		// while (true)
		// {
		// monitorenter;
		// try
		// {
		// if (!this.b)
		// paramString = paramString.toUpperCase();
		// int j = a();
		// k = i;
		// if (i < j)
		// {
		// Object localObject2 = a(i);
		// if (localObject2 == null)
		// break label176;
		// localObject2 = ((LookupAlpha)localObject2).a();
		// if ((localObject2 == null) || (((String)localObject2).length() == 0))
		// break label176;
		// i3 = paramString.compareTo((String)localObject2);
		// if (!paramString.equals("#"))
		// break label147;
		// if (!((String)localObject2).matches("[a-z]*"))
		// break label141;
		// }
		// monitorexit;
		// break;
		// }
		// finally
		// {
		// localObject1 = finally;
		// monitorexit;
		// throw localObject1;
		// }
		// }
		// }
		// catch (Exception localException)
		// {
		// Ln.e(localException);
		// k = -1;
		// }
		// break;
		// label141: int m = localException;
		// continue;
		// label147: if (i3 == 0)
		// {
		// int n = localException;
		// continue;
		// }
		// if (i3 > 0)
		// {
		// int i1 = localException;
		// break label176;
		// int i2 = -1;
		// break;
		// }
		// label176: localException++;
		// }

		return 0;
	}

	public void b() {
		// if ((this.a == null) || (this.a.c() == 0));
		// while (true)
		// {
		// return;
		// this.c = true;
		// try
		// {
		// monitorenter;
		// try
		// {
		// if (this.d > 1);
		// int i;
		// do
		// {
		// monitorexit;
		// this.c = false;
		// break;
		// i = this.a.c();
		// j = 0;
		// k = 0;
		// }
		// while (j >= i);
		// DirectorLookupAlpha localDirectorLookupAlpha =
		// (DirectorLookupAlpha)this.a.a(j);
		// if (localDirectorLookupAlpha != null)
		// {
		// localDirectorLookupAlpha.a(k);
		// k += localDirectorLookupAlpha.c();
		// }
		// }
		// finally
		// {
		// monitorexit;
		// }
		// }
		// catch (Exception localException)
		// {
		// while (true)
		// {
		// int j;
		// Ln.e(localException);
		// continue;
		// int k = k;
		// j += 1;
		// k = k;
		// }
		// }
		// }
	}

	public void b(int paramInt) {
		this.d = paramInt;
	}

	public void b(boolean paramBoolean) {
		this.f = paramBoolean;
	}

	public boolean c() {
		return this.c;
	}

	public int d() {
		return this.d;
	}

	public boolean e() {
		return this.b;
	}

	public Set<String> f() {
		Set localSet;
		if (this.a == null)
			localSet = null;
		else
			localSet = this.a.f();
		return localSet;
	}

	public boolean g() {
		return this.f;
	}
}
