// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.zd.home.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;

import com.zd.home.R;
import com.zd.model.LightingScene;

public abstract class LightingScenesBaseAdapter extends ArrayAdapter {

	public LightingScenesBaseAdapter(Context context) {
		super(context, R.layout.light_list_item);
		a = LayoutInflater.from(context);
	}

	protected abstract void a();

	public View getView(int i, View view, ViewGroup viewgroup) {
		View obj = null;
		Holder obj1 = null;
		if (view == null) {
			obj = a.inflate(R.layout.lightingscene_list_item, null);
			obj1 = new Holder();
			obj1.b = (Button) obj.findViewById(R.id.lighting_scene);
			obj1.b.setTag(obj1);
			obj1.b.setOnClickListener(b);
			obj.setTag(obj1);

		} else {
			obj = view;
			obj1 = (Holder) view.getTag();
		}

		LightingScene lightingscene = (LightingScene) getItem(i);
		obj1.b.setText(lightingscene.a());

		return obj;

	}

	private final LayoutInflater a;
	private final android.view.View.OnClickListener b = new _cls1();

	private class _cls1 implements android.view.View.OnClickListener {

		public void onClick(View view) {
			Holder holder = (Holder) view.getTag();
			((LightingScene) a.getItem(holder.a)).c();
		}

		final LightingScenesBaseAdapter a;

		_cls1() {
			a = LightingScenesBaseAdapter.this;

		}
	}

	private class Holder {

		int a;
		Button b;
		final LightingScenesBaseAdapter c;

		public Holder() {
			c = LightingScenesBaseAdapter.this;
		}
	}

}
