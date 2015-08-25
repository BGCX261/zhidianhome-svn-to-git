// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.zd.home.adapter;

import android.content.Context;

import com.zd.model.Project;
import com.zd.model.Room;

// Referenced classes of package com.control4.myhome.widget:
//            LightDeviceBaseAdapter

public class AllLightsListAdapter extends LightDeviceBaseAdapter {

	public AllLightsListAdapter(Context context, Project project) {
		super(context);
		a = project;
		a(true);
		a();
	}

	protected String a(int i) {
		Object obj = null;
		try {
			if (a != null)
				obj = a.getRoom(i);
			if (obj != null)
				obj = ((Room) (obj)).b();
			else
				obj = "";
		}
		// Misplaced declaration of an exception variable
		catch (Exception e) {

		}
		return ((String) (obj));
	}

	public void a() {
		int j = 0;
		clear();
		setNotifyOnChange(false);
		if (a != null) {
			for (int i = a.u(); j < i; j++)
				add(a.r(j));

		}
		notifyDataSetChanged();

	}

	private final Project a;
}
