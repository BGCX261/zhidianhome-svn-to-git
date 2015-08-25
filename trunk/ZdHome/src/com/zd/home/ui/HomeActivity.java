package com.zd.home.ui;

import roboguice.inject.InjectExtra;
import roboguice.util.Ln;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.google.inject.Inject;
import com.zd.home.R;
import com.zd.model.CustomButtonScreen;
import com.zd.model.Project;
import com.zd.model.Room;
import com.zd.model.device.Device;
import com.zd.model.device.Thermostat;

public class HomeActivity extends NavigationActivity {
	private TextView A;
	private TextView B;
	private TextView C;
	private TextView D;
	private TextView E;
	private TextView F;
	private View G;
	private Integer roomIndex;
	private Button H;
	private Button J;
	private Button K;
	private Button L;
	private Button M;
	private ProgressBar N;
	private Thermostat O;
	private Thermostat P;
	private CustomButtonWindow Q;
	private CustomButtonWindow R1;
	private final Device.OnDeviceUpdateListener S = new Device.OnDeviceUpdateListener() {

		@Override
		public void a(Device paramDevice) {
			// TODO Auto-generated method stub

		}
	};// new//new HomeActivity.5(this);

	@Inject
	private Application _app;

	@InjectExtra(value = "com.control4.ui.RoomId", optional = true)
	private Integer a;
	private View b;
	private View c;
	private View d;
	private View e;
	private AutoResizeTextView f;

	private void j() {
		int i = 8;
		// Ln.a("updateCustomButtons  currentRoom: " + this.croom, new
		// Object[0]);
		if (this.croom != null) {
			CustomButtonScreen localCustomButtonScreen4 = this.croom.w(1);
			CustomButtonScreen localCustomButtonScreen1 = this.croom.w(2);
			CustomButtonScreen localCustomButtonScreen2 = this.croom.w(3);
			CustomButtonScreen localCustomButtonScreen3 = this.croom.w(4);
			Button localButton = this.J;
			int j;
			if ((localCustomButtonScreen4 == null) || (this.J == this.H))
				j = i;
			else
				j = 0;
			localButton.setVisibility(j);
			localButton = this.K;
			if ((localCustomButtonScreen1 == null) || (this.K == this.H))
				j = i;
			else
				j = 0;
			localButton.setVisibility(j);
			localButton = this.L;
			if ((localCustomButtonScreen2 == null) || (this.L == this.H))
				j = i;
			else
				j = 0;
			localButton.setVisibility(j);
			localButton = this.M;
			if ((localCustomButtonScreen3 != null) && (this.M != this.H))
				i = 0;
			localButton.setVisibility(i);
			if (localCustomButtonScreen4 != null) {
				// Ln.a("Showing Screen 1 for current Room with name: " +
				// localCustomButtonScreen4.b(), new Object[0]);
				this.J.setText(localCustomButtonScreen4.b());
				this.J.setOnClickListener(new View.OnClickListener() {

					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub

					}
				}); // new HomeActivity.1(this,localCustomButtonScreen4));
			}
			if (localCustomButtonScreen1 != null) {
				// Ln.a("Showing Screen 2 for current Room with name: " +
				// localCustomButtonScreen1.b(), new Object[0]);
				this.K.setText(localCustomButtonScreen1.b());
				this.K.setOnClickListener(new View.OnClickListener() {

					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub

					}
				});// new HomeActivity.2(this,localCustomButtonScreen1));
			}
			if (localCustomButtonScreen2 != null) {
				// Ln.a("Showing Screen 3 for current Room with name: " +
				// localCustomButtonScreen2.b(), new Object[0]);
				this.L.setText(localCustomButtonScreen2.b());
				this.L.setOnClickListener(new View.OnClickListener() {

					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub

					}
				});// new HomeActivity.3(this,localCustomButtonScreen2));
			}
			if (localCustomButtonScreen3 != null) {
				// Ln.a("Showing Screen 4 for current Room with name: " +
				// localCustomButtonScreen3.b(), new Object[0]);
				this.M.setText(localCustomButtonScreen3.b());
				this.M.setOnClickListener(new View.OnClickListener() {

					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub

					}
				});// new HomeActivity.4(this,localCustomButtonScreen3));
			}
		}
	}

	private void k() {
		// Ln.a("updateHomeButtons  currentRoom: " + this.r, new Object[0]);
		try {
			if (this.croom != null) {
				this.b.setEnabled(this.croom.y());
				this.c.setEnabled(this.croom.t());
				this.d.setEnabled(this.croom.z());
				l();
				this.G.setEnabled(this.croom.x());
				this.e.setEnabled(this.croom.v());
				this.f.resizeText();
				if (this.croom.x()) {
					this.G.setBackgroundResource(2130838028);
					this.f.setTextColor(-1);
				}
				if (this.croom.Y()) {
					this.e.setBackgroundResource(2130837848);
					if (!this.croom.v())
						return;
					this.B.setTextColor(-1);
					if (!this.croom.aa())
						return;
					this.c.setBackgroundResource(2130838093);
					if (!this.croom.t())
						return;
					this.C.setTextColor(-1);
					if (!this.croom.ab())
						return;
					this.b.setBackgroundResource(2130837830);
					if (!this.croom.y())
						return;
					this.A.setTextColor(-1);
					if (!this.croom.z())
						return;
					this.D.setTextColor(-1);
					this.G.setBackgroundResource(2130837670);
					this.f.setTextColor(-7829368);
				}
			}
		} catch (Exception localException) {
			// while (true)
			// {
			//
			// this.e.setBackgroundResource(2130837843);
			// continue;
			// label350: this.B.setTextColor(-7829368);
			// continue;
			// label362: this.c.setBackgroundResource(2130838086);
			// continue;
			// label374: this.C.setTextColor(-7829368);
			// continue;
			// label386: this.b.setBackgroundResource(2130837829);
			// continue;
			// label398: this.A.setTextColor(-7829368);
			// label410: this.D.setTextColor(-7829368);
			// }

		}
	}

	private void l() {
		// Ln.a("updateComfortButtons  currentRoom: " + this.croom, new
		// Object[0]);

		try {
			if (this.croom != null) {
				m();
				if (this.O != null)
					return;
				this.d.setBackgroundResource(R.drawable.comfort_button);
				if (this.P != null)
					return;
				this.E.setText("");
				this.F.setText("");

				switch (this.O.b()) {
				case 0:
					this.d.setBackgroundResource(R.drawable.comfort_auto_button);
					break;
				case 1:
				case 2:
				case 3:
				}
			}
		} catch (Exception stlocalExceptionr) {
			//
			// break label261;
			// this.d.setBackgroundResource(2130837793);
			// continue;
			// this.d.setBackgroundResource(2130837795);
			// continue;
			// this.d.setBackgroundResource(2130837791);
			// continue;
			// String str = Integer.toString(this.P.F());
			// this.E.setText(str + '°');
			// if (this.O.I() == null)
			// continue;
			// this.F.setText(this.O.I().substring(0, 1));
			// break label261;
			// this.F.setText("");
		}

	}

	private void m() {
		if (this.croom != null) {
			Thermostat localThermostat = this.croom.I();
			if (localThermostat != this.O) {
				if (this.O != null)
					this.O.a("");
				if (localThermostat != null)
					localThermostat.a(this.S);
				this.O = localThermostat;
				localThermostat = this.croom.H();
				if (localThermostat != this.P) {
					if (this.P != null)
						this.P.a("");
					if (localThermostat != null)
						localThermostat.a(this.S);
					this.P = localThermostat;
				}
			}
		}
	}

	protected View a_() {
		return this._layoutInflater.inflate(R.layout.home_activity, null);
	}

	protected void i_() {
		int i = 0;
		try {
			super.i_();
			k();
			j();
			m();
			if (this.m != null) {
				if (!this._director.isDemo())
					return;
				this.m.setVisibility(0);
			}

			if (this.croom != null) {
				if (this.N == null)
					return;
				// Ln.a("Setting progress bar visibility. Visible: " + bool, new
				// Object[0]);
				ProgressBar localProgressBar = this.N;
				if (!this.croom.ao())
					return;
				localProgressBar.setVisibility(i);
				this.m.setVisibility(4);
			}
		} catch (Exception localException) {
			// while (true)
			// {
			// Ln.e(localException);
			// break;
			// Ln.a("Current room null", new Object[0]);
			// boolean bool = i;
			// continue;
			// label150: i = 4;
			// }
		}
	}

	protected void j_() {
		super.j_();
		m();
		l();
	}

	protected void k_() {
		k();
	}

	protected int l_() {
		return com.zd.home.R.drawable.carbon_blue;
	}

	public void onComfortClicked(View paramView) {
		Intent localIntent = new Intent(this, DeviceListActivity.class);
		localIntent.putExtra("com.control4.ui.DeviceCategory", 2);
		startActivity(localIntent);
	}

	public void onCreate(Bundle paramBundle) {

		super.onCreate(paramBundle);
		this._navigator.b();
		// startService(new Intent(this,
		// MediaAppWidgetUpdateService.class).setAction("com.control4.appwidget.MediaAppWidget.REFRESH"));
		if (_preferences.g())
			D();
		else
			E();
		y();
		x();
		roomIndex = 0;
		// this.b = findViewById(2131558550);
		// this.c = findViewById(2131558544);
		// this.d = findViewById(2131558553);
		// this.G = findViewById(2131558548);
		// this.e = findViewById(2131558546);
		this.A = ((TextView) findViewById(2131558551));
		this.C = ((TextView) findViewById(2131558545));
		// this.f = ((AutoResizeTextView)findViewById(2131558549));
		// this.f.setAddEllipsis(false);
		this.B = ((TextView) findViewById(2131558547));
		this.D = ((TextView) findViewById(2131558554));
		this.E = ((TextView) findViewById(2131558555));
		this.F = ((TextView) findViewById(2131558556));
		// this.J = ((Button)findViewById(2131558559));
		// this.K = ((Button)findViewById(2131558560));
		// this.L = ((Button)findViewById(2131558561));
		// this.M = ((Button)findViewById(2131558562));
		// this.N = ((ProgressBar)findViewById(2131558434));
		// this.Q = new CustomButtonWindow(this, 2130903059);
		// this.R = new CustomButtonWindow(this, 2130903060);
		// if (this.a == null)
		// break;
		// Ln.b("Room id passed to activity:" + this.a, new Object[0]);
		if (this.a != null) {
			Project localObject = this._navigator.getProject();
			if (localObject != null) {
				Room troom = localObject.getRoom(this.a);
				if (troom != null)
					a(troom);
			}
		}
		E();

	}

	protected void onDestroy() {
		super.onDestroy();
		if (isFinishing()) {
			if (this._preferences.g())
				E();
			if (this.croom != null)
				this.croom.b(this.w);
			if (this._director.r())
				this._director.x();
			this._navigator.c();
			this.croom = null;
			this._director = null;
			this._navigator = null;
		}
	}

	public void onListenClicked(View paramView) {
		Intent localIntent = new Intent(this, DeviceListActivity.class);
		localIntent.putExtra("com.control4.ui.DeviceCategory", 4);
		startActivity(localIntent);
	}

	public void onMoreClicked(View paramView) {
		// startActivity(new Intent(this, MoreActivity.class));
	}

	protected void onNewIntent(Intent paramIntent) {
		super.onNewIntent(paramIntent);
		int i = paramIntent.getIntExtra("com.control4.ui.RoomId", -1);
		if (i != -1)
			this.a = Integer.valueOf(i);
		if (this.a != null) {
			// Ln.b("Room id passed to activity:" + this.a, new Object[0]);
			Project localObject = this._navigator.getProject();
			if (localObject != null) {
				Room room = localObject.getRoom(this.a.intValue());
				if (room != null)
					a(room);
			}
		}
		if ((paramIntent != null) && (paramIntent.hasExtra("NavigateTo"))
				&& ((0x100000 & paramIntent.getFlags()) == 0)) {
			this.u = ((Intent) paramIntent.getExtras().get("NavigateTo"));
			paramIntent.removeExtra("NavigateTo");
			// Ln.a("Has NAVIGATE_EXTRA: " + this.u, new Object[0]);
		}
	}

	protected void onPause() {
		super.onPause();
		if (this.O != null)
			this.O.a("");
		if (this.P != null)
			this.P.a("");
	}

	protected void onResume() {
		// Ln.a("Resuming Home Activity.", new Object[0]);
		super.onResume();
		try {
			if (this._preferences.g())
				D();
			if (this.O != null)
				this.O.a(this.S);
			if (this.P != null)
				this.P.a(this.S);
			// MediaAppWidgetUpdateService.b();
			return;
		} catch (Exception localException) {
			while (true)
				Ln.e(localException);
		}
	}

	public void onSecurityClicked(View paramView) {
		Intent localIntent = new Intent(this, DeviceListActivity.class);
		localIntent.putExtra("com.control4.ui.DeviceCategory", 3);
		startActivity(localIntent);
	}

	public void onWatchClicked(View paramView) {
		Intent localIntent = new Intent(this, DeviceListActivity.class);
		localIntent.putExtra("com.control4.ui.DeviceCategory", 5);
		startActivity(localIntent);
	}
}
