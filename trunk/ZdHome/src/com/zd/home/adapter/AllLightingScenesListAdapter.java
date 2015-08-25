// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.zd.home.adapter;

import android.content.Context;

import com.zd.model.Project;

// Referenced classes of package com.control4.myhome.widget:
//            LightingScenesBaseAdapter

public class AllLightingScenesListAdapter extends LightingScenesBaseAdapter {

	public AllLightingScenesListAdapter(Context context, Project project) {
		super(context);
		a = project;
		a();
	}

	protected void a() {
		int i = 0;
		clear();
		setNotifyOnChange(false);
		if (a != null) {
			for (int j = a.o(); i < j; i++)
				add(a.i(i));

		}
		notifyDataSetChanged();

	}

	private final Project a;
}
