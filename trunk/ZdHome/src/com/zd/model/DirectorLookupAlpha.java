package com.zd.model;

public class DirectorLookupAlpha implements LookupAlpha {
	private String a = null;
	private int b = 0;
	private int c = 0;

	public DirectorLookupAlpha() {
		this.a = null;
	}

	public DirectorLookupAlpha(String paramString) {
		this.a = paramString;
	}

	public String a() {
		return this.a;
	}

	public void a(int paramInt) {
		this.b = paramInt;
	}

	public void a(String paramString) {
		this.a = paramString;
	}

	public int b() {
		return this.b;
	}

	public void b(int paramInt) {
		this.c = paramInt;
	}

	public int c() {
		return this.c;
	}

	public void c(int paramInt) {
		this.c = (paramInt + this.c);
	}

	public String toString() {
		return "DirectorLookupAlpha [_letter=" + this.a + ", _offset=" + this.b
				+ ", _count=" + this.c + "]";
	}
}
