package com.zd.model.device;

import android.app.Application;

import com.google.inject.Inject;
import com.zd.home.R;

public class MyMoviesDevice extends DirectorDevice {
	public static final int k = 121121;

	@Inject
	private Application _context;

	public MyMoviesDevice() {
		i(false);
		this.i = true;
		this.f_ = 121121;
		if (this._context == null)
			this.name = "Movies";
		else
			this.name = this._context.getString(R.string.movies);
	}

	public Device.DeviceType getType() {
		return Device.DeviceType.p;
	}

	public String getName() {
		if (this._context == null)
			this.name = "Movies";
		else
			this.name = this._context.getString(R.string.movies);
		return this.name;
	}
}
