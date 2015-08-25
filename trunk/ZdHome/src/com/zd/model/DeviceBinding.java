package com.zd.model;

import java.util.Vector;

public class DeviceBinding {
	public class BindingClass {
		protected String a;
		protected int b;
		protected boolean c;

		public BindingClass(DeviceBinding paramDeviceBinding) {
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

		public void a(boolean paramBoolean) {
			this.c = paramBoolean;
		}

		public int b() {
			return this.b;
		}

		public boolean c() {
			return this.c;
		}
	}

	protected String a;
	protected String b;
	protected String c;
	protected int d;
	protected boolean e;
	protected Vector<DeviceBinding.BindingClass> f;
	protected int g;
	protected Vector<String> h;

	public String a() {
		return this.a;
	}

	public void a(int paramInt) {
		this.d = paramInt;
	}

	public void a(DeviceBinding.BindingClass paramBindingClass) {
		if (this.f == null)
			this.f = new Vector();
		this.f.add(paramBindingClass);
	}

	public void a(String paramString) {
		this.a = paramString;
	}

	public void a(Vector<DeviceBinding.BindingClass> paramVector) {
		this.f = paramVector;
	}

	public void a(boolean paramBoolean) {
		this.e = paramBoolean;
	}

	public String b() {
		return this.b;
	}

	public void b(int paramInt) {
		this.g = paramInt;
	}

	public void b(String paramString) {
		this.b = paramString;
	}

	public void b(Vector<String> paramVector) {
		this.h = paramVector;
	}

	public String c() {
		return this.c;
	}

	public void c(String paramString) {
		this.c = paramString;
	}

	public int d() {
		return this.d;
	}

	public void d(String paramString) {
		if (this.h == null)
			this.h = new Vector();
		this.h.add(paramString);
	}

	public boolean e() {
		return this.e;
	}

	public int f() {
		return this.g;
	}

	public Vector<DeviceBinding.BindingClass> g() {
		return this.f;
	}

	public Vector<String> h() {
		return this.h;
	}
}

/*
 * Location: E:\去哪儿\com.control4.myhome-2\classes_dex2jar.jar Qualified Name:
 * com.control4.director.data.DeviceBinding JD-Core Version: 0.6.0
 */