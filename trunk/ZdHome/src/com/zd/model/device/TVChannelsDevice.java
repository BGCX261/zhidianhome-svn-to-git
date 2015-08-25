package com.zd.model.device;

import android.app.Application;

import com.google.inject.Inject;
import com.zd.home.R;

public class TVChannelsDevice extends DirectorDevice {
	public static final int k = 122123;

	@Inject
	private Application _context;

	public TVChannelsDevice() {
		i(false);
		this.i = true;
		this.f_ = 122123;
		if (this._context == null)
			this.name = "Channels";
		else
			this.name = this._context.getString(R.string.channels);
	}

	public Device.DeviceType getType() {
		return Device.DeviceType.q;
	}

	public String getName() {
		if (this._context == null)
			this.name = "Channels";
		else
			this.name = this._context.getString(R.string.channels);
		return this.name;
	}
}
