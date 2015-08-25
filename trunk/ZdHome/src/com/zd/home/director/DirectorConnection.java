package com.zd.home.director;

public class DirectorConnection {
	// private final a a;
	private String b;
	private int c = 5020;
	private final String d;
	private boolean e = false;

	// public DirectorConnection(a parama)
	// {
	// this.a = parama;
	// this.b = parama.c();
	// try
	// {
	// this.b = new URL(parama.c()).getHost();
	// label47: this.d = parama.n();
	// return;
	// }
	// catch (MalformedURLException localMalformedURLException)
	// {
	// break label47;
	// }
	// }

	public DirectorConnection(String paramString1, int paramInt,
			String paramString2) {
		// / this.a = null;
		this.b = paramString1;
		this.c = paramInt;
		this.d = paramString2;
	}

	public String a() {
		return this.b;
	}

	public void a(boolean paramBoolean) {
		this.e = paramBoolean;
	}

	public int b() {
		return this.c;
	}

	public String c() {
		return this.d;
	}

	public boolean d() {
		return this.e;
	}

	public boolean equals(Object paramObject) {
		boolean i = true;
		if (this != paramObject)
			if ((paramObject != null) && (getClass() == paramObject.getClass())) {
				DirectorConnection localDirectorConnection = (DirectorConnection) paramObject;
				if ((this.c != localDirectorConnection.c)
						|| (!this.b.equals(localDirectorConnection.b)))
					i = false;
			} else {
				i = false;
			}
		return i;
	}

	public int hashCode() {
		return this.d.hashCode();
	}

	public String toString() {
		return a();
	}
}
