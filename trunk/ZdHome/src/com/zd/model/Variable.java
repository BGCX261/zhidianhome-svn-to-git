package com.zd.model;

import java.util.HashMap;

public class Variable {
	private String a = null;
	private int b = -1;
	private String c = null;
	private int d = -1;
	private String e = null;
	private boolean f = false;
	private boolean g = false;
	private String h = null;
	private String i = null;
	private HashMap<String, String> j = null;

	public String a() {
		return this.a;
	}

	public void a(int paramInt) {
		this.b = paramInt;
	}

	public void a(String paramString) {
		this.a = paramString;
	}

	public void a(HashMap<String, String> paramHashMap) {
		this.j = paramHashMap;
	}

	public void a(boolean paramBoolean) {
		this.f = paramBoolean;
	}

	public int b() {
		return this.b;
	}

	public void b(int paramInt) {
		this.d = paramInt;
	}

	public void b(String paramString) {
		this.c = paramString;
	}

	public void b(boolean paramBoolean) {
		this.g = paramBoolean;
	}

	public String c() {
		return this.c;
	}

	public void c(String paramString) {
		this.e = paramString;
	}

	public int d() {
		return this.d;
	}

	public void d(String paramString) {
		this.h = paramString;
	}

	public String e() {
		return this.e;
	}

	public void e(String paramString) {
		this.i = paramString;
	}

	public String f(String paramString) {
		String str;
		if (this.j == null)
			str = null;
		else
			str = (String) this.j.get(paramString);
		return str;
	}

	public boolean f() {
		return this.f;
	}

	public boolean g() {
		return this.g;
	}

	public String h() {
		return this.h;
	}

	public String i() {
		return this.i;
	}

	public HashMap<String, String> j() {
		return this.j;
	}

	public String toString() {
		return "Variable [_name=" + this.a + ", _id=" + this.b + ", _value="
				+ this.c + ", _deviceID=" + this.d + ", _type=" + this.e
				+ ", _readOnly=" + this.f + ", _hidden=" + this.g
				+ ", _bindingID=" + this.h + ", _bindingName=" + this.i + "]";
	}
}
