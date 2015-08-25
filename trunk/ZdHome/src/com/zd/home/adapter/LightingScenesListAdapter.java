package com.zd.home.adapter;

import roboguice.util.Ln;
import android.content.Context;

import com.google.inject.Inject;
import com.zd.model.Room;

public class LightingScenesListAdapter extends LightingScenesBaseAdapter {
	private final Room a;

	@Inject
	public LightingScenesListAdapter(Context paramContext, Room paramRoom) {
		super(paramContext);
		this.a = paramRoom;
		a();
	}

	protected void a() {
		int j = 0;
		try {
			clear();
			setNotifyOnChange(false);
			if (this.a != null) {
				int i = this.a.F();
				while (j < i) {
					add(this.a.h(j));
					j++;
				}
			}
			setNotifyOnChange(true);
			return;
		} catch (Exception localException) {
			Ln.e(localException);
		}
	}
}
