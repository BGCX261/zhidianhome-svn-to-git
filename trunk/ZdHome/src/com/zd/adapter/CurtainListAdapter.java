package com.zd.adapter;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.zd.model.Curtain;
import com.zd.view.CurtainItemView;

public class CurtainListAdapter extends BaseAdapter {
	List<Curtain> lights = new ArrayList<Curtain>();
	private Context context = null;

	public CurtainListAdapter(Context context) {
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
			convertView = new CurtainItemView(context);

		}
		((CurtainItemView) convertView).setData(this.lights.get(position));
		return convertView;
	}

	public void setData(List<Curtain> lights) {
		this.lights = lights;
		this.notifyDataSetChanged();
	}

}
