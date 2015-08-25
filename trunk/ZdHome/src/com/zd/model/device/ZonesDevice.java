package com.zd.model.device;

import android.app.Application;

import com.google.inject.Inject;
import com.zd.home.R;

public class ZonesDevice extends DirectorDevice {
	public static final int k = 1547126;

	@Inject
	private Application _context;

	public ZonesDevice() {
		i(false);
		this.i = true;
		this.f_ = 1547126;
		if (this._context == null)
			this.name = "Zones";
		else
			this.name = this._context.getString(R.string.zones);
	}

	public DeviceType getType() {
		return Device.DeviceType.z;
	}

	public String getName() {
		if (this._context == null)
			this.name = "Zones";
		else
			this.name = this._context.getString(R.string.zones);
		return this.name;
	}
}
