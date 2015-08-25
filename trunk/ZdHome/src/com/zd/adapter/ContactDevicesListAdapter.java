package com.zd.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.zd.home.R;
import com.zd.model.ContactDevice;
import com.zd.model.ContactDevice.ContactDeviceType;
import com.zd.model.Director;
import com.zd.model.Project;
import com.zd.model.Room;
import com.zd.model.device.Device;

public class ContactDevicesListAdapter extends ArrayAdapter<ContactDevice>
		implements Device.OnDeviceUpdateListener {
	private Drawable A;
	private Drawable B;
	private Drawable C;
	private Drawable D;
	private Drawable E;
	private Drawable F;
	private Drawable G;
	private Drawable H;
	private Drawable I;
	private Drawable J;
	private Drawable K;
	private Drawable L;
	private Drawable M;
	private Drawable N;
	private Drawable O;
	private Drawable P;
	private Drawable Q;
	private Drawable motors20;
	private Drawable S;
	private Drawable T;
	private Drawable U;
	private Drawable V;
	private Drawable W;
	private Drawable X;
	private Drawable Y;
	private Drawable Z;
	protected final Room room;
	private Drawable aa;
	private Drawable ab;
	private Drawable ac;
	private Drawable ad;
	private Drawable ae;
	private Drawable af;
	private Drawable ag;
	private Drawable ah;
	private Drawable ai;
	private Drawable aj;
	private Drawable ak;
	private Drawable al;
	private Drawable am;
	protected Project project;
	protected final Director c;
	private final LayoutInflater d;
	private final boolean isall;
	private final Context f;
	// private final Runnable g = new ContactDevicesListAdapter.1(this);
	private Drawable h;
	private Drawable i;
	private Drawable j;
	private Drawable k;
	private Drawable l;
	private Drawable m;
	private Drawable n;
	private Drawable o;
	private Drawable p;
	private Drawable q;
	private Drawable r;
	private Drawable s;
	private Drawable t;
	private Drawable u;
	private Drawable v;
	private Drawable w;
	private Drawable x;
	private Drawable y;
	private Drawable z;

	public ContactDevicesListAdapter(Context paramContext, Room paramRoom,
			Director paramDirector, boolean paramBoolean) {
		super(paramContext, R.layout.sensor_grid_item);
		this.f = paramContext;
		this.room = paramRoom;
		this.c = paramDirector;
		if (paramDirector != null)
			this.project = paramDirector.m();
		this.d = LayoutInflater.from(paramContext);
		this.isall = paramBoolean;
	}

	private Drawable a(ContactDevice paramContactDevice) {
		ContactDeviceType localObject = paramContactDevice.e();
		switch (localObject.ordinal()) {
		default:
			if (!paramContactDevice.b()) {
				if (this.i == null)
					this.i = this.f.getResources().getDrawable(
							R.drawable.motors_contactswitch_open);
			} else {
				if (this.h == null)
					this.h = this.f.getResources().getDrawable(
							R.drawable.motors_contactswitch_close);
			}
			break;
		case 1:
			if (!paramContactDevice.b()) {
				if (this.j == null)
					this.j = this.f.getResources().getDrawable(
							R.drawable.motors_relay_open);
			} else {
				if (this.k == null)
					this.k = this.f.getResources().getDrawable(
							R.drawable.motors_relay_close);
			}
			break;
		case 2:
			if (!paramContactDevice.b()) {
				if (this.m == null)
					this.m = this.f.getResources().getDrawable(
							R.drawable.motors_door_open);

			} else {
				if (this.l == null)
					this.l = this.f.getResources().getDrawable(
							R.drawable.motors_door_close);
			}
			break;
		case 3:
			if (!paramContactDevice.b()) {
				if (this.o == null)
					this.o = this.f.getResources().getDrawable(
							R.drawable.motors_lock_open);

			} else {
				if (this.n == null)
					this.n = this.f.getResources().getDrawable(
							R.drawable.motors_lock_close);
			}
			break;
		case 4:
			if (!paramContactDevice.b()) {
				if (this.H == null)
					this.H = this.f.getResources().getDrawable(
							R.drawable.motors_garage_open);
			} else {
				if (this.I == null)
					this.I = this.f.getResources().getDrawable(
							R.drawable.motors_garage_close);
			}
			break;
		case 5:
			if (!paramContactDevice.b()) {
				if (this.F == null)
					this.F = this.f.getResources().getDrawable(
							R.drawable.motors_drapes_open);

			} else {
				if (this.G == null)
					this.G = this.f.getResources().getDrawable(
							R.drawable.motors_drapes_close);

			}
			break;
		case 6:
			if (!paramContactDevice.b()) {
				if (this.al == null)
					this.al = this.f.getResources().getDrawable(
							R.drawable.motors_blinds_open);

			} else {
				if (this.am == null)
					this.am = this.f.getResources().getDrawable(
							R.drawable.motors_blinds_close);
			}
			break;
		case 7:
			if (!paramContactDevice.b()) {
				if (this.z == null)
					this.z = this.f.getResources().getDrawable(
							R.drawable.motors_fan_open);
			} else {
				if (this.A == null)
					this.A = this.f.getResources().getDrawable(
							R.drawable.motors_fan_close);
			}
			break;
		case 8:
			if (!paramContactDevice.b()) {
				if (this.x == null)
					this.x = this.f.getResources().getDrawable(
							R.drawable.motors_fountain_open);
			} else {
				if (this.y == null)
					this.y = this.f.getResources().getDrawable(
							R.drawable.motors_fountain_close);
			}
			break;
		case 9:
			if (!paramContactDevice.b()) {
				if (this.N == null)
					this.N = this.f.getResources().getDrawable(
							R.drawable.motors_carbonmonoxidedetector_open);
			} else {
				if (this.O == null)
					this.O = this.f.getResources().getDrawable(
							R.drawable.motors_carbonmonoxidedetector_close);
				;
			}
			break;
		case 10:
			if (!paramContactDevice.b()) {
				if (this.P == null)
					this.P = this.f.getResources().getDrawable(
							R.drawable.motors_doorbell_open);
			} else {
				if (this.Q == null)
					this.Q = this.f.getResources().getDrawable(
							R.drawable.motors_doorbell_close);
			}
			break;
		case 11:
			if (!paramContactDevice.b()) {
				if (this.ab == null)
					this.ab = this.f.getResources().getDrawable(
							R.drawable.motors_motion_off);

			} else {
				if (this.ac == null)
					this.ac = this.f.getResources().getDrawable(
							R.drawable.motors_motion_on);

			}
			break;
		case 12:
			if (!paramContactDevice.b()) {
				if (this.ad == null)
					this.ad = this.f.getResources().getDrawable(
							R.drawable.motors_pressuresensor_open);

			} else {
				if (this.ae == null)
					this.ae = this.f.getResources().getDrawable(
							R.drawable.motors_pressuresensor_close);

			}
			break;
		case 13:
			if (!paramContactDevice.b()) {
				if (this.B == null)
					this.B = this.f.getResources().getDrawable(
							R.drawable.motors_gate_open);

			} else {
				if (this.C == null)
					this.C = this.f.getResources().getDrawable(
							R.drawable.motors_gate_close);

			}
			break;
		case 14:
			if (!paramContactDevice.b()) {
				if (this.v == null)
					this.v = this.f.getResources().getDrawable(
							R.drawable.motors_fireplace_open);

			} else {
				if (this.w == null)
					this.w = this.f.getResources().getDrawable(
							R.drawable.motors_fireplace_close);

			}
			break;
		case 15:
			if (!paramContactDevice.b()) {
				if (this.t == null)
					this.t = this.f.getResources().getDrawable(
							R.drawable.motors_motorizedlift_open);

			} else {
				if (this.u == null)
					this.u = this.f.getResources().getDrawable(
							R.drawable.motors_motorizedlift_close);

			}
			break;
		case 16:
			if (!paramContactDevice.b()) {
				if (this.r == null)
					this.r = this.f.getResources().getDrawable(
							R.drawable.motors_screen_down);

			} else {
				if (this.s == null)
					this.s = this.f.getResources().getDrawable(
							R.drawable.motors_screen_up);

			}
			break;
		case 17:
			if (!paramContactDevice.b()) {
				if (this.p == null)
					this.p = this.f.getResources().getDrawable(
							R.drawable.motors_pump_open);

			} else {
				if (this.q == null)
					this.q = this.f.getResources().getDrawable(
							R.drawable.motors_pump_close);

			}
			break;
		case 18:
			if (!paramContactDevice.b()) {
				if (this.K == null)
					this.K = this.f.getResources().getDrawable(
							R.drawable.motors_radiantfloor_open);

			} else {
				if (this.J == null)
					this.J = this.f.getResources().getDrawable(
							R.drawable.motors_radiantfloor_close);

			}
			break;
		case 19:
			if (!paramContactDevice.b()) {
				if (this.M == null)
					this.M = this.f.getResources().getDrawable(
							R.drawable.motors_sprinklers_open);

			} else {
				if (this.L == null)
					this.L = this.f.getResources().getDrawable(
							R.drawable.motors_sprinklers_close);

			}
			break;
		case 20:
			if (!paramContactDevice.b()) {
				if (this.motors20 == null)
					this.motors20 = this.f.getResources().getDrawable(
							R.drawable.motors_drivewaysensor_open);
			} else {
				if (this.S == null)
					this.S = this.f.getResources().getDrawable(
							R.drawable.motors_drivewaysensor_close);

			}
			break;
		case 21:
			if (!paramContactDevice.b()) {
				if (this.T == null)
					this.T = this.f.getResources().getDrawable(
							R.drawable.motors_glassbreakdetector_open);

			} else {
				if (this.U == null)
					this.U = this.f.getResources().getDrawable(
							R.drawable.motors_glassbreakdetector_close);

			}
			break;
		case 22:
			if (!paramContactDevice.b()) {
				if (this.X == null)
					this.X = this.f.getResources().getDrawable(
							R.drawable.motors_humiditysensor_open);

			} else {
				if (this.Y == null)
					this.Y = this.f.getResources().getDrawable(
							R.drawable.motors_humiditysensor_close);

			}
			break;
		case 23:
			if (!paramContactDevice.b()) {
				if (this.Z == null)
					this.Z = this.f.getResources().getDrawable(
							R.drawable.motors_irbeam_open);

			} else {
				if (this.aa == null)
					this.aa = this.f.getResources().getDrawable(
							R.drawable.motors_irbeam_close);
			}
			break;
		case 24:
			if (!paramContactDevice.b()) {
				if (this.ah == null)
					this.ah = this.f.getResources().getDrawable(
							R.drawable.motors_watersensor_open);

			} else {
				if (this.ai == null)
					this.ai = this.f.getResources().getDrawable(
							R.drawable.motors_watersensor_closed);

			}
			break;
		case 25:
			if (!paramContactDevice.b()) {
				if (this.aj == null)
					this.aj = this.f.getResources().getDrawable(
							R.drawable.motors_windowcontactsensor_open);

			} else {
				if (this.ak == null)
					this.ak = this.f.getResources().getDrawable(
							R.drawable.motors_windowcontactsensor_close);

			}
			break;
		case 26:
			if (!paramContactDevice.b()) {
				if (this.D == null)
					this.D = this.f.getResources().getDrawable(
							R.drawable.motors_drivewayheater_open);

			} else {
				if (this.E == null)
					this.E = this.f.getResources().getDrawable(
							R.drawable.motors_drivewayheater_close);

			}
			break;
		case 27:
			if (!paramContactDevice.b()) {
				if (this.V == null)
					this.V = this.f.getResources().getDrawable(
							R.drawable.motors_heatdetector_open);

			} else {
				if (this.W == null)
					this.W = this.f.getResources().getDrawable(
							R.drawable.motors_heatdetector_close);

			}
			break;
		case 28:
			if (!paramContactDevice.b()) {
				if (this.ag == null)
					this.ag = this.f.getResources().getDrawable(
							R.drawable.motors_smokedetector_open);

			} else {
				if (this.af == null)
					this.af = this.f.getResources().getDrawable(
							R.drawable.motors_smokedetector_close);

			}
		}
		return (Drawable) null;
	}

	public ContactDevice a(int paramInt) {
		ContactDevice localObject = null;
		try {
			ContactDevice localContactDevice;
			if (this.isall) {
				localContactDevice = this.project.t(paramInt);
			} else {
				localContactDevice = this.room.t(paramInt);
			}
			return localContactDevice;
		} catch (Exception e) {

		}
		return localObject;
	}

	public void a() {
		try {
			// 2
			this.c.b(new Runnable() {

				@Override
				public void run() {
					// TODO Auto-generated method stub

				}
			});
			return;
		} catch (Exception localException) {

		}
	}

	public void a(Device paramDevice) {
		// try {
		// ((Activity) this.f).runOnUiThread(this.g);
		// } catch (Exception localException) {
		//
		// }
	}

	public void b() {
		try {
			// 3
			this.c.b(new Runnable() {

				@Override
				public void run() {
					// TODO Auto-generated method stub

				}
			});

		} catch (Exception localException) {

		}
	}

	public int getCount() {
		try {
			if (this.isall) {
				return this.project.v();
			} else {
				return this.room.N();
			}
		} catch (Exception e) {

		}
		return 0;
	}

	public long getItemId(int paramInt) {
		return paramInt;
	}

	public View getView(int paramInt, View paramView, ViewGroup paramViewGroup) {
		if (paramView == null) {
			try {
				Holder localObject2 = new Holder();
				paramView = this.d.inflate(R.layout.sensor_grid_item, null);
				localObject2.a = ((ImageView) paramView
						.findViewById(R.id.thumbnail));
				localObject2.b = ((TextView) paramView.findViewById(R.id.name));
				paramView.setTag(localObject2);

			} catch (Exception localView) {

			}
		}

		Holder localObject1 = (Holder) paramView.getTag();
		ContactDevice localContactDevice = a(paramInt);
		localObject1.c = paramInt;
		localObject1.b.setText(localContactDevice.getName());
		localObject1.a.setImageDrawable(a(localContactDevice));

		return paramView;

	}

	class Holder {
		public ImageView a;
		public TextView b;
		public int c;

		private Holder() {
		};
	}

}
