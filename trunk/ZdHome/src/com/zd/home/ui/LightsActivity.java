package com.zd.home.ui;

import roboguice.util.Ln;
import android.app.LocalActivityManager;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TabHost;
import android.widget.TabWidget;
import android.widget.TextView;

import com.zd.home.R;
import com.zd.home.adapter.AllLightingScenesListAdapter;
import com.zd.home.adapter.AllLightsListAdapter;
import com.zd.home.adapter.LightingScenesListAdapter;
import com.zd.home.adapter.LightsListAdapter;
import com.zd.model.Project;
import com.zd.model.Room;
import com.zd.model.device.Device;

public class LightsActivity extends NavigationActivity {
	private static final String a = "states";
	private LightingScenesListAdapter A;
	private AllLightingScenesListAdapter B;
	private boolean C;
	private ListView D;
	private ListView E;
	private RadioGroup F;
	private RadioButton G;
	private RadioButton H;
	private TextView J;
	private final CompoundButton.OnCheckedChangeListener K = new CompoundButton.OnCheckedChangeListener() {

		@Override
		public void onCheckedChanged(CompoundButton buttonView,
				boolean isChecked) {
			// TODO Auto-generated method stub

		}
	};// LightsActivity.1//LightsActivity.1(this);
	private final RadioGroup.OnCheckedChangeListener L = new RadioGroup.OnCheckedChangeListener() {

		@Override
		public void onCheckedChanged(RadioGroup group, int checkedId) {
			// TODO Auto-generated method stub

		}
	};// LightsActivity.2//LightsActivity.2(this);
	private final Device.OnDeviceUpdateListener M = new Device.OnDeviceUpdateListener() {

		@Override
		public void a(Device paramDevice) {
			// TODO Auto-generated method stub

		}
	};// LightsActivity.3//LightsActivity.3(this);
	private TabHost b;
	private TabWidget c;
	private LocalActivityManager d;
	private LightsListAdapter e;
	private AllLightsListAdapter f;

	private void j() {

		try {
			if (!this.C)
				return;
			if (!this.G.isChecked())
				return;
			this.D.setAdapter(this.e);
			this.E.setAdapter(this.A);
			if (this.croom != null) {
				String str1 = this.croom.b() + " " + getString(2131165254);
				this.J.setText(str1);
				this.G.setText(str1);
			}
		} catch (Exception localException) {
			Ln.e(localException);
		}
		String str2 = getString(com.zd.home.R.string.lights);
		this.D.setAdapter(this.f);
		this.E.setAdapter(this.B);
		this.J.setText(getString(com.zd.home.R.string.all_lights));

	}

	protected View a(TabHost paramTabHost, CharSequence paramCharSequence,
			Drawable paramDrawable) {
		View localView = ((LayoutInflater) getSystemService("layout_inflater"))
				.inflate(com.zd.home.R.layout.tab_indicator_vertical,
						paramTabHost.getTabWidget(), false);
		((TextView) localView.findViewById(R.id.title))
				.setText(paramCharSequence);
		ImageView localImageView = (ImageView) localView
				.findViewById(R.id.icon);
		if (localImageView != null)
			localImageView.setImageDrawable(paramDrawable);
		return localView;
	}

	protected View a_() {
		return this._layoutInflater.inflate(
				com.zd.home.R.layout.lights_activity, null);
	}

	public void onCreate(Bundle paramBundle) {

		Bundle localBundle2 = null;
		super.onCreate(paramBundle);

		try {
			if (this._navigator == null)
				return;
			Project localObject2 = this._navigator.getProject();
			Room localObject1 = this._navigator.croom();
			if (localObject1 == null) {
				// toMainActivity();
				this.a(localObject2.getRoom(5));
				localObject1 = this._navigator.croom();
				// return;
			}

			this.v = true;
			this.e = new LightsListAdapter(this, localObject1);
			this.f = new AllLightsListAdapter(this, localObject2);
			this.A = new LightingScenesListAdapter(this, localObject1);
			this.B = new AllLightingScenesListAdapter(this, localObject2);
			if ((0xF & getResources().getConfiguration().screenLayout) >= 3)
				this.C = true;

			if (!this.C) {
				this.d = new LocalActivityManager(this, true);
				if (paramBundle != null)
					localBundle2 = paramBundle.getBundle("states");
				this.d.dispatchCreate(localBundle2);
				this.b = ((TabHost) findViewById(16908306));
				this.c = ((TabWidget) findViewById(16908307));
				this.b.setup(this.d);

				if (getResources().getConfiguration().orientation != 1)
					this.c.setOrientation(1);
				this.b.addTab(this.b
						.newTabSpec("lights")
						.setIndicator(
								a(this.b,
										getResources().getString(
												R.string.lights),
										getResources().getDrawable(
												R.drawable.bulb_tabicon)))
						.setContent(R.id.lights_list));
				this.b.addTab(this.b
						.newTabSpec("lightingscenes")
						.setIndicator(
								a(this.b,
										getResources().getString(
												R.string.scenes),
										getResources().getDrawable(
												R.drawable.bulbs_tabicon)))
						.setContent(R.id.lighting_scenes_list));
				this.b.addTab(this.b
						.newTabSpec("allLights")
						.setIndicator(
								a(this.b,
										getResources().getString(
												R.string.all_lights),
										getResources().getDrawable(
												R.drawable.bulb_tabicon)))
						.setContent(R.id.all_lights_list));
				this.b.addTab(this.b
						.newTabSpec("allLightingScenes")
						.setIndicator(
								a(this.b,
										getResources().getString(
												R.string.all_scenes),
										getResources().getDrawable(
												R.drawable.bulbs_tabicon)))
						.setContent(R.id.all_lighting_scenes_list));
				this.b.setCurrentTab(0);
				z();
				((ListView) findViewById(R.id.lights_list)).setAdapter(this.e);
				((ListView) findViewById(R.id.all_lights_list))
						.setAdapter(this.f);
				((ListView) findViewById(R.id.lighting_scenes_list))
						.setAdapter(this.A);
				((ListView) findViewById(R.id.all_lighting_scenes_list))
						.setAdapter(this.B);
			} else {
				this.D = ((ListView) findViewById(R.id.lights_list));
				this.E = ((ListView) findViewById(R.id.lighting_scenes_list));
				// this.J = ((TextView) findViewById(R.id.lights_title ));
				// this.H = ((RadioButton)
				// findViewById(R.id.allLightRadioButton));
				// this.G = ((RadioButton)
				// findViewById(R.id.roomLightsRadioButton ));
				// this.F = ((RadioGroup)
				// findViewById(R.id.lights_radio_group));
				// this.F.setOnCheckedChangeListener(this.L);
				j();
			}
		} catch (Exception localException) {
			Ln.e(localException);
		}

	}

	public void onLightsClicked(View paramView) {
	}

	protected void onPause() {
		try {
			super.onPause();
			this.f.b();
			return;
		} catch (Exception localException) {
			Ln.e(localException);
		}
	}

	protected void onRestoreInstanceState(Bundle paramBundle) {
		super.onRestoreInstanceState(paramBundle);
		try {
			if (!this.C) {
				String str = paramBundle.getString("currentTab");
				if (str != null)
					this.b.setCurrentTabByTag(str);
				if (this.b.getCurrentTab() < 0)
					this.b.setCurrentTab(0);
			}
			return;
		} catch (Exception localException) {

			Ln.e(localException);
		}
	}

	protected void onResume() {
		try {
			super.onResume();
			this.f.a(this.M);
			if (this.e != null)
				this.e.a();
			if (this.f != null)
				this.f.a();
			return;
		} catch (Exception localException) {
			Ln.e(localException);
		}
	}

	protected void onSaveInstanceState(Bundle paramBundle) {
		try {
			super.onSaveInstanceState(paramBundle);
			if (!this.C) {
				String str = this.b.getCurrentTabTag();
				if (str != null)
					paramBundle.putString("currentTab", str);
			}
			return;
		} catch (Exception localException) {
			Ln.e(localException);
		}
	}
}
