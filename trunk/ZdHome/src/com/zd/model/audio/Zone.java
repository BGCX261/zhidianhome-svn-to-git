package com.zd.model.audio;

import com.zd.model.Room;
import com.zd.model.device.Device;

public abstract interface Zone {
	public enum ZoneType {

	}

	public abstract Room a(int paramInt);

	public abstract String a();

	public abstract Room b(int paramInt);

	public abstract String b();

	public abstract Zone.ZoneType c();

	public abstract Room c(int paramInt);

	public abstract boolean d();

	public abstract int e();

	public abstract int f();

	public abstract int g();

	public abstract int h();

	public abstract String i();

	public abstract String j();

	public abstract Device k();

	public abstract AudioQueue l();

	public abstract boolean m();
}
