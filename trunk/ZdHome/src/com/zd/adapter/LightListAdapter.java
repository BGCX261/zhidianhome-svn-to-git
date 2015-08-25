package com.zd.adapter;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.zd.model.device.Light;
import com.zd.view.LightItemView;

public class LightListAdapter extends BaseAdapter {
	List<Light> lights = new ArrayList<Light>();
	private Context context = null;

	public LightListAdapter(Context context) {
		this.context = context;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return lights.size();
	}

	@Override
	public Object getItem(int position) {
		return lights.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		if (convertView == null) {
			convertView = new LightItemView(context);

		}
		// ((LightItemView)convertView).setData(this.lights.get(position));
		return convertView;
	}

	public void setData(List<Light> lights) {
		this.lights = lights;
		this.notifyDataSetChanged();
	}

}
