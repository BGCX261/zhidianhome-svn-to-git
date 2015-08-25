package com.zd.home.ui;

import roboguice.inject.InjectExtra;
import roboguice.util.Ln;
import android.os.Bundle;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.ListView;

import com.zd.adapter.ComfortDeviceListAdapter;
import com.zd.adapter.DeviceListAdapter;
import com.zd.adapter.ListenDeviceListAdapter;
import com.zd.adapter.NotifyingDeviceListAdapter;
import com.zd.adapter.SecurityDeviceListAdapter;
import com.zd.adapter.WatchDeviceListAdapter;
import com.zd.home.R;
import com.zd.home.R.layout;
import com.zd.model.device.Device;

public class DeviceListActivity extends NavigationActivity {

	@InjectExtra(value = "com.control4.ui.DeviceCategory")
	private int a;
	private AbsListView b;
	private DeviceListAdapter c;
	private final Device.OnDeviceUpdateListener d = new Device.OnDeviceUpdateListener() {

		@Override
		public void a(Device paramDevice) {
			// TODO Auto-generated method stub

		}
	};// new//new DeviceListActivity.2(this);

	protected View a_() {
		return this._layoutInflater.inflate(R.layout.devicelist_activity, null);
	}

	protected void k_() {
	}

	public void onCreate(Bundle paramBundle) {
		super.onCreate(paramBundle);

		if (this._navigator.croom() == null)
		{
			this.toMainActivity();
			return;
		}

		this.v = true;
		switch (this.a) {
		case 2:
			this.c = new ComfortDeviceListAdapter(this, this.croom);
		case 5:
			this.c = new WatchDeviceListAdapter(this, this.croom);
		case 4:
			this.c = new ListenDeviceListAdapter(this, this.croom);
		case 3:
			this.c = new SecurityDeviceListAdapter(this, this.croom);
		}
		this.b = ((AbsListView) findViewById(R.id.list_view));
		if ((this.b instanceof ListView)) {
			((ListView) this.b).setAdapter(this.c);
			this.b.setOnItemClickListener(new OnItemClickListener() {
				@Override
				public void onItemClick(AdapterView<?> arg0, View arg1,
						int arg2, long arg3) {

				}
			});
		}
		if (this.b instanceof GridView)
			((GridView) this.b).setAdapter(this.c);

	}

	protected void onPause() {
		super.onPause();
		if ((this.c instanceof NotifyingDeviceListAdapter))
			((NotifyingDeviceListAdapter) this.c).a();
	}

	protected void onResume() {
		super.onResume();
		try {
			this.c.a(this.croom);
			if ((this.c instanceof NotifyingDeviceListAdapter))
				((NotifyingDeviceListAdapter) this.c).a(this.d);
		} catch (Exception localException) {

		}
	}

	protected void u() {
		if (this.a == 4) {
			this.c.a(this.croom);
		}
	}

	protected void w() {
		if (this.a == 5)
			this.c.a(this.croom);
	}
}
