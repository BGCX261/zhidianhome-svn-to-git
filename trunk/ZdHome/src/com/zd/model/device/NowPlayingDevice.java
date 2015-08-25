package com.zd.model.device;

import android.app.Application;

import com.google.inject.Inject;
import com.zd.home.R;

public class NowPlayingDevice extends DirectorDevice {
	public static final int k = 1547451;

	@Inject
	private Application _context;

	public NowPlayingDevice() {
		i(false);
		this.i = true;
		this.f_ = 1547451;
		if (this._context == null)
			this.name = "Now Playing";
		else
			this.name = this._context.getString(R.string.now_playing);
	}

	public Device.DeviceType getType() {
		return Device.DeviceType.A;
	}

	public String getName() {
		if (this._context == null)
			this.name = "Now Playing";
		else
			this.name = this._context.getString(R.string.now_playing);
		return this.name;
	}
}
