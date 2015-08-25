package com.zd.adapter;

import roboguice.util.Ln;
import android.content.Context;

import com.google.inject.Inject;
import com.zd.model.Room;

public class SecurityDeviceListAdapter extends DeviceListAdapter {
	@Inject
	public SecurityDeviceListAdapter(Context paramContext, Room paramRoom) {
		super(paramContext, 3);
		a(paramRoom);
	}

	public void a(Room paramRoom) {
		int i = 0;
		try {
			setNotifyOnChange(false);
			clear();
			while (i < paramRoom.L()) {
				add(paramRoom.p(i));
				i++;
			}
			notifyDataSetChanged();
		} catch (Exception localException) {
			Ln.e(localException);
		}
	}
}
