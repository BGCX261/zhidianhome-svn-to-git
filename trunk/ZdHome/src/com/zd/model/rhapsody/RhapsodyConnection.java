package com.zd.model.rhapsody;

public class RhapsodyConnection {
	private String a;
	private int b = 5555;
	private boolean c = false;

	public String a() {
		return this.a;
	}

	public void a(int paramInt) {
		this.b = paramInt;
	}

	public void a(String paramString) {
		this.a = paramString;
	}

	public void a(boolean paramBoolean) {
		this.c = paramBoolean;
	}

	public int b() {
		return this.b;
	}

	public boolean c() {
		return this.c;
	}

	public String toString() {
		return this.a + ":" + this.b;
	}
}
