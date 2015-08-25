package com.zd.model.device;

import android.app.Application;

import com.google.inject.Inject;
import com.zd.home.R;

public class RadioStationsDevice extends DirectorDevice {
	public static final int k = 122126;

	@Inject
	private Application _context;

	public RadioStationsDevice() {
		i(false);
		this.i = true;
		this.f_ = 122126;
		if (this._context == null)
			this.name = "Stations";
		else
			this.name = this._context.getString(R.string.stations);
	}

	public Device.DeviceType getType() {
		return Device.DeviceType.r;
	}

	public String getName() {
		if (this._context == null)
			this.name = "Stations";
		else
			this.name = this._context.getString(R.string.stations);
		return this.name;
	}
}

/*
 * Location: E:\去哪儿\com.control4.myhome-2\classes_dex2jar.jar Qualified Name:
 * com.control4.director.device.RadioStationsDevice JD-Core Version: 0.6.0
 */