package com.zd.model.device;

import android.app.Application;

import com.google.inject.Inject;
import com.zd.home.R;

public class WebCamerasDevice extends DirectorDevice {
	public static final int k = 177127;

	@Inject
	private Application _context;

	public WebCamerasDevice() {
		i(false);
		this.i = true;
		this.f_ = 177127;
		if (this._context == null)
			this.name = "IP Cameras";
		else
			this.name = this._context.getString(R.string.ip_cameras);
	}

	public Device.DeviceType getType() {
		return Device.DeviceType.u;
	}

	public String getName() {
		if (this._context == null)
			this.name = "IP Cameras";
		else
			this.name = this._context.getString(R.string.ip_cameras);
		return this.name;
	}
}
