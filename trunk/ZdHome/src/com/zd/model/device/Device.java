package com.zd.model.device;

public abstract interface Device {
	public abstract interface OnDeviceUpdateListener {
		public abstract void a(Device paramDevice);
	}

	public enum DeviceType {
		a, b, p, A, r, h, q, u, z, g, l, B, c, f, w, x, I, J, N, i, y, j, d, k, o, v, n, m, t, s, H, F, K, L, G, M, E, C, D, e

	}

	public abstract boolean A();

	public abstract boolean B();

	public abstract boolean C();

	// a()
	public abstract Device.DeviceType getType();

	public abstract void a(
			Device.OnDeviceUpdateListener paramOnDeviceUpdateListener);

	public abstract void p();

	public abstract boolean q();

	public abstract Device.OnDeviceUpdateListener s();

	public abstract int t();
    //u()
	public abstract String getName();

	public abstract int v();
}
