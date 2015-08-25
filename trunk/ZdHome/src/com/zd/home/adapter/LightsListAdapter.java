// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.zd.home.adapter;

import android.content.Context;

import com.zd.model.Room;

// Referenced classes of package com.control4.myhome.widget:
//            LightDeviceBaseAdapter

public class LightsListAdapter extends LightDeviceBaseAdapter {

	public LightsListAdapter(Context context, Room room) {
		super(context);
		a = room;
		a();
	}

	public void a() {
		int i = 0;
		clear();
		setNotifyOnChange(false);
		if (a != null) {
			for (int j = a.E(); i < j; i++)
				add(a.f(i));

		}
		notifyDataSetChanged();

	}

	private final Room a;
}
