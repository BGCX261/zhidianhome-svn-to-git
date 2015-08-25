package com.zd.home.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.zd.home.R;
import com.zd.model.Location;
import com.zd.model.audio.ZoneManager;

public class LocationArrayAdapter extends ArrayAdapter<Location> {
	public class Holder {
		public TextView a;
		public TextView b;

		private Holder(LocationArrayAdapter paramLocationArrayAdapter) {
		}
	}

	private ZoneManager a;
	private final LayoutInflater b;

	public LocationArrayAdapter(Context paramContext,
			ZoneManager paramZoneManager) {
		super(paramContext, R.layout.checked_text_view);
		this.b = LayoutInflater.from(paramContext);
		this.a = paramZoneManager;
	}

	public void a(ZoneManager paramZoneManager) {
		this.a = paramZoneManager;
	}

	public View getView(int paramInt, View paramView, ViewGroup paramViewGroup) {
		Holder localObject;
		if (paramView != null) {
			localObject = (LocationArrayAdapter.Holder) paramView.getTag();
		} else {
			paramView = this.b.inflate(R.layout.checked_text_view, null);
			localObject = null;
		}
		LocationArrayAdapter.Holder localHolder;
		if (localObject != null) {
			localHolder = (LocationArrayAdapter.Holder) paramView.getTag();
		} else {
			localHolder = new LocationArrayAdapter.Holder(null);
			localHolder.a = ((TextView) paramView.findViewById(16908308));
			localHolder.b = ((TextView) paramView.findViewById(16908309));
		}

		Location location = (Location) getItem(paramInt);
		if (location == null)
			localHolder.a.setText("");
		else
			localHolder.a.setText(location.b());
		return (View) paramView;
	}
}
