package com.zd.model;

import java.util.Timer;
import java.util.TimerTask;

public class DirectorLocation implements Location {
	protected int c_ = -1;
	private HashIndex<Integer, Location> d;
	protected String d_ = null;
	private boolean e;
	protected int e_;
	private Timer f;
	private TimerTask g;

	public DirectorLocation() {
		this.d = new HashIndex();
	}

	public DirectorLocation(int paramInt1, String paramString, int paramInt2) {
		this.c_ = paramInt1;
		this.d_ = paramString;
		this.e_ = paramInt2;
		this.e = false;
		this.d = new HashIndex();
	}

	public int a() {
		return this.c_;
	}

	public int a(Location paramLocation) {
		int i;
		if (this.d == null)
			i = -1;
		else
			i = this.d.b(paramLocation);
		return i;
	}

	public void a(DirectorLocation paramDirectorLocation) {
		if (paramDirectorLocation != null) {
			if (this.d == null)
				this.d = new HashIndex();
			this.d.a(Integer.valueOf(paramDirectorLocation.a()),
					paramDirectorLocation);
			paramDirectorLocation.b_(this.c_);
		}
	}

	public void a(Variable paramVariable, boolean paramBoolean) {
	}

	public void a(boolean paramBoolean) {
		this.e = paramBoolean;
		if (this.g != null)
			this.g.cancel();
		if (!paramBoolean) {
			if (this.f != null) {
				this.f.cancel();
				this.f = null;
			}
		} else {
			if (this.f == null)
				this.f = new Timer();
			this.g = new TimerTask() {

				@Override
				public void run() {
					// TODO Auto-generated method stub

				}
			};
			this.f.schedule(this.g, 5000L);
		}
	}

	public void a_(int paramInt) {
		this.c_ = paramInt;
	}

	public void a_(String paramString) {
		this.d_ = paramString;
	}

	public String b() {
		return this.d_;
	}

	public void b(Variable paramVariable, boolean paramBoolean) {
	}

	public void b_(int paramInt) {
		this.e_ = paramInt;
	}

	public int c() {
		return this.e_;
	}

	public Location c(int paramInt) {
		Location localLocation;
		if (this.d != null)
			localLocation = (Location) this.d.a(paramInt);
		else
			localLocation = null;
		return localLocation;
	}

	public Location d(int paramInt) {
		Location localLocation;
		if (this.d == null)
			localLocation = null;
		else
			localLocation = (Location) this.d.a(Integer.valueOf(paramInt));
		return localLocation;
	}

	public int e() {
		return this.d.c();
	}

	public boolean equals(Object paramObject) {
		boolean i = true;
		if (this != paramObject)
			if ((paramObject instanceof DirectorLocation)) {
				if (((Location) paramObject).a() != this.c_)
					i = false;
			} else
				i = false;
		return i;
	}

	public void f() {
	}

	public String toString() {
		return "Location [_id=" + this.c_ + ", _name=" + this.d_
				+ ", _parentID=" + this.e_ + "]";
	}

	public boolean w_() {
		return this.e;
	}
}

/*
 * Location: E:\去哪儿\com.control4.myhome-2\classes_dex2jar.jar Qualified Name:
 * com.control4.director.data.DirectorLocation JD-Core Version: 0.6.0
 */