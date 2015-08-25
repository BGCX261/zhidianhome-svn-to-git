package com.zd.home.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TabHost;
import android.widget.TextView;

import com.zd.adapter.ContactDevicesListAdapter;
import com.zd.home.R;
import com.zd.model.ContactDevice;

public class ContactDevicesActivity extends NavigationTabActivity {
	private boolean F;
	private GridView G;
	private RadioGroup H;
	private RadioButton J;
	private RadioButton K;
	private TextView L;
	private final CompoundButton.OnCheckedChangeListener M = new CompoundButton.OnCheckedChangeListener() {

		@Override
		public void onCheckedChanged(CompoundButton buttonView,
				boolean isChecked) {
			// TODO Auto-generated method stub

		}
	};
	private final RadioGroup.OnCheckedChangeListener N = new RadioGroup.OnCheckedChangeListener() {

		@Override
		public void onCheckedChanged(RadioGroup group, int checkedId) {
			// TODO Auto-generated method stub

		}

	};
	protected ProgressBar a;
	protected TextView b;
	protected ContactDevicesListAdapter c;
	protected ContactDevicesListAdapter d;

	private void a(int paramInt) {
		try {
			((ContactDevice) (this.G.getItemAtPosition(paramInt))).d();
		} catch (Exception localException) {

		}
	}

	private void n() {
		// while (true)
		// {
		// try
		// {
		// if (!this.F)
		// return;
		// if (this.J.isChecked())
		// {
		// if (this.c != null)
		// continue;
		// j();
		// this.d = null;
		// this.G.setAdapter(this.c);
		// String str = this.r.b() + " " + getString(2131165215);
		// this.L.setText(str);
		// this.J.setText(this.r.b());
		// this.c.a();
		// boolean bool = this.K.isChecked();
		// if (this.b == null)
		// return;
		// if (!bool)
		// break label247;
		// if (this._navigator.l().v() != 0)
		// break;
		// this.b.setText(getResources().getString(2131165452));
		// this.b.setVisibility(0);
		// }
		// }
		// catch (Exception localException)
		// {
		//
		// }
		// if (this.d == null)
		// {
		// k();
		// this.c = null;
		// }
		// this.G.setAdapter(this.d);
		// this.L.setText(getString(2131165425));
		// this.d.a();
		// }
		// this.b.setVisibility(8);
		// return;
		// label247:
		// if (this._navigator.h().N() == 0)
		// {
		// this.b.setText(getResources().getString(2131165453));
		// this.b.setVisibility(0);
		// }
		// else
		// {
		// this.b.setVisibility(8);
		// }
	}

	protected View a(TabHost paramTabHost, CharSequence paramCharSequence,
			Drawable paramDrawable) {
		View localView = ((LayoutInflater) getSystemService("layout_inflater"))
				.inflate(2130903141, paramTabHost.getTabWidget(), false);
		Object localObject = (TextView) localView.findViewById(2131558531);
		if (getResources().getConfiguration().orientation != 1)
			;
		((TextView) localObject).setText(paramCharSequence);
		localObject = (ImageView) localView.findViewById(2131558624);
		if (localObject != null)
			((ImageView) localObject).setImageDrawable(paramDrawable);
		return (View) localView;
	}

	protected View a_() {
		return this._layoutInflater.inflate(R.layout.motors_sensors_activity,
				null);
	}

	protected boolean b() {
		return false;
	}

	protected void j() {
		try {
			this.c = new ContactDevicesListAdapter(this,
					this._navigator.croom(), this._director, false);
			return;
		} catch (Exception localException) {

		}
	}

	protected void k() {
		try {
			this.d = new ContactDevicesListAdapter(this,
					this._navigator.croom(), this._director, true);
		} catch (Exception localException) {

		}
	}

	protected void initSensorsActivity() {
		Resources localResources = getResources();
		Intent localIntent = new Intent(this,
				RoomContactDevicesActivityGroup.class);
		this.tabhost.addTab(this.tabhost
				.newTabSpec("motors/sensors")
				.setIndicator(
						a(this.tabhost, this.croom.b(), localResources
								.getDrawable(R.drawable.playlists_tabicon)))
				.setContent(localIntent));
		localIntent = new Intent(this, ProjectContactDevicesActivityGroup.class);
		this.tabhost
				.addTab(this.tabhost
						.newTabSpec("motors/sensors")
						.setIndicator(
								a(this.tabhost,
										localResources
												.getString(R.string.all_motors_sensors),
										localResources
												.getDrawable(R.drawable.playlists_tabicon)))
						.setContent(localIntent));
	}

	public void onCreate(Bundle paramBundle) {
		super.onCreate(paramBundle);

		try {
			if (this._navigator.croom() == null) {
				toMainActivity();
				return;
			}
			if ((0xF & getResources().getConfiguration().screenLayout) >= 3) {

				initSensorsActivity();
				this.tabhost.setOnTabChangedListener(this);
				if (paramBundle != null)
					this.tabhost.setCurrentTab(paramBundle.getInt("activeTab"));
				this.tabhost.setup();
				if (getResources().getConfiguration().orientation == 1)
					return;
				this.D.setOrientation(1);
			}
		} catch (Exception localException1) {

		}

		this.G = ((GridView) findViewById(R.id.grid_view));
		this.L = ((TextView) findViewById(R.id.sensors_title));
		this.K = ((RadioButton) findViewById(R.id.allRadioButton));
		this.J = ((RadioButton) findViewById(R.id.roomRadioButton));
		this.H = ((RadioGroup) findViewById(R.id.sensors_radio_group));
		this.H.setOnCheckedChangeListener(this.N);
		this.a = ((ProgressBar) findViewById(R.id.progress));
		this.b = ((TextView) findViewById(R.id.no_results_label));
		j();
		this.G.setAdapter(this.c);
		// this.G.setOnItemClickListener(new ContactDevicesActivity.3(this));
		this.G.setFastScrollEnabled(true);
		n();
	}

	protected void onDestroy() {
		super.onDestroy();
		try {
			if (this.F) {
				this.c = null;
				this.d = null;
				this.G.setAdapter(null);
			}
			return;
		} catch (Exception localException) {

		}
	}
}
