package com.zd.model.device;

import roboguice.util.Ln;

import com.zd.model.ContactDevice;
import com.zd.model.Variable;

public class DirectorContactDevice extends DirectorDevice implements
		ContactDevice {
	private static final int k = 1000;
	private boolean l = true;
	private boolean m = false;
	private boolean n = false;
	private boolean o = false;
	private boolean p = false;

	public Device.DeviceType getType() {
		return Device.DeviceType.l;
	}

	public void a(Variable paramVariable, boolean paramBoolean) {
		// if (paramVariable != null);
		// try
		// {
		// String str = paramVariable.c();
		// if (paramVariable.b() == 1000)
		// if (BooleanUtil.a(str))
		// break label34;
		// label34: for (boolean bool = true; ; bool = false)
		// {
		// a(bool);
		// return;
		// }
		// }
		// catch (Exception localException)
		// {
		//
		// }
	}

	public void a(String paramString1, String paramString2) {
		// if (paramString1 != null);
		// try
		// {
		// if (paramString1.equals("Device State"))
		// {
		// Object localObject2 = (HashParser)ParserFactory.HashProvider.a();
		// Object localObject1 =
		// XmlPullParserFactory.newInstance().newPullParser();
		// ((XmlPullParser)localObject1).setInput(new
		// StringReader(paramString2));
		// ((HashParser)localObject2).a((XmlPullParser)localObject1);
		// localObject2 = ((HashParser)localObject2).a();
		// if (localObject2 != null)
		// {
		// localObject1 = (String)((HashMap)localObject2).get("invertsensor");
		// localObject2 = (String)((HashMap)localObject2).get("invertrelay");
		// if (BooleanUtil.a((String)localObject1))
		// break label238;
		// if (!BooleanUtil.a((String)localObject2))
		// break label152;
		// break label238;
		// this.n = localObject1;
		// if (this.n)
		// Ln.a("Invert State set for " + this, new Object[0]);
		// }
		// }
		// label152:
		// do
		// {
		// super.a(paramString1, paramString2);
		// return;
		// boolean bool1 = false;
		// break;
		// bool1 = paramString1.equals("Device-Driver");
		// if (!bool1)
		// break label224;
		// }
		// while (paramString2 == null);
		// i = -1;
		// }
		// catch (Exception bool2)
		// {
		// while (true)
		// {
		// try
		// {
		// int i = Integer.parseInt(paramString2);
		// i = i;
		// if (i != 100007)
		// continue;
		// b(true);
		// continue;
		// localException1 = localException1;
		// Ln.e(localException1);
		// }
		// catch (Exception localException2)
		// {
		// Ln.e(localException2);
		// continue;
		// b(false);
		// }
		// continue;
		// label224: boolean bool2 = paramString1.equals("Device-Driver-Name");
		// if (!bool2)
		// continue;
		// continue;
		// label238: bool2 = true;
		// }
		// }
	}

	public void a(boolean paramBoolean) {
		this.l = paramBoolean;
		if (this.j != null)
			this.j.a(this);
	}

	public void b(Variable paramVariable, boolean paramBoolean) {
		// if (paramVariable != null);
		// try
		// {
		// String str = paramVariable.f("state");
		// if ((str != null) && (str.length() > 0))
		// if (BooleanUtil.a(str))
		// break label37;
		// label37: for (boolean bool = true; ; bool = false)
		// {
		// a(bool);
		// return;
		// }
		// }
		// catch (Exception localException)
		// {
		// while (true)
		// Ln.e(localException);
		// }
	}

	public void b(boolean paramBoolean) {
		this.m = paramBoolean;
	}

	public boolean b() {
		boolean bool = true;
		// ContactDevice.ContactDeviceType localContactDeviceType = e();
		// if (localContactDeviceType != ContactDevice.ContactDeviceType.d)
		// {
		// if (localContactDeviceType != ContactDevice.ContactDeviceType.i)
		// {
		// if ((localContactDeviceType != ContactDevice.ContactDeviceType.b) &&
		// (localContactDeviceType != ContactDevice.ContactDeviceType.f) &&
		// (localContactDeviceType != ContactDevice.ContactDeviceType.x) &&
		// (localContactDeviceType != ContactDevice.ContactDeviceType.C) &&
		// (localContactDeviceType != ContactDevice.ContactDeviceType.r) &&
		// (localContactDeviceType != ContactDevice.ContactDeviceType.A) &&
		// (localContactDeviceType != ContactDevice.ContactDeviceType.v) &&
		// (localContactDeviceType != ContactDevice.ContactDeviceType.s) &&
		// (localContactDeviceType != ContactDevice.ContactDeviceType.z) &&
		// (localContactDeviceType != ContactDevice.ContactDeviceType.t) &&
		// (localContactDeviceType != ContactDevice.ContactDeviceType.u) &&
		// (localContactDeviceType != ContactDevice.ContactDeviceType.w) &&
		// (localContactDeviceType != ContactDevice.ContactDeviceType.q) &&
		// (localContactDeviceType != ContactDevice.ContactDeviceType.B))
		// {
		// if (localContactDeviceType != ContactDevice.ContactDeviceType.e)
		// {
		// if (localContactDeviceType != ContactDevice.ContactDeviceType.c)
		// {
		// if (localContactDeviceType != ContactDevice.ContactDeviceType.m)
		// bool = this.l;
		// else
		// bool = this.l;
		// }
		// else
		// bool = this.l;
		// }
		// else
		// bool = this.l;
		// }
		// else if (this.l)
		// bool = false;
		// }
		// else if (!f())
		// {
		// if (this.l)
		// bool = false;
		// }
		// else
		// bool = this.l;
		// }
		// else
		// bool = this.l;
		return bool;
	}

	public boolean c() {
		return this.m;
	}

	public boolean d() {
		boolean bool = false;
		try {
			if (!this.m) {
				bool = j("TOGGLE");
				bool = bool;
			}
		} catch (Exception localException) {
			Ln.e(localException);
		}
		return bool;
	}

	public ContactDevice.ContactDeviceType e() {
		ContactDevice.ContactDeviceType localContactDeviceType = ContactDevice.ContactDeviceType.a;
		// try
		// {
		// String str = B_();
		// if ((str != null) && (str.length() != 0))
		// if (str.contains("contactswitch"))
		// localContactDeviceType = ContactDevice.ContactDeviceType.b;
		// else if (str.contains("_door_"))
		// localContactDeviceType = ContactDevice.ContactDeviceType.d;
		// else if (str.contains("doorcontactsensor"))
		// localContactDeviceType = ContactDevice.ContactDeviceType.d;
		// else if (str.contains("doorlock"))
		// localContactDeviceType = ContactDevice.ContactDeviceType.e;
		// else if (str.contains("doorbell"))
		// localContactDeviceType = ContactDevice.ContactDeviceType.s;
		// else if (str.contains("drapes"))
		// localContactDeviceType = ContactDevice.ContactDeviceType.g;
		// else if (str.contains("drivewayheater"))
		// localContactDeviceType = ContactDevice.ContactDeviceType.h;
		// else if (str.contains("drivewaysensor"))
		// localContactDeviceType = ContactDevice.ContactDeviceType.t;
		// else if (str.contains("electronicgate"))
		// localContactDeviceType = ContactDevice.ContactDeviceType.i;
		// else if (str.contains("_gate_"))
		// localContactDeviceType = ContactDevice.ContactDeviceType.i;
		// else if (str.contains("_fan_"))
		// localContactDeviceType = ContactDevice.ContactDeviceType.j;
		// else if (str.contains("_fountain_"))
		// localContactDeviceType = ContactDevice.ContactDeviceType.k;
		// else if (str.contains("carbonmonoxidedetector"))
		// localContactDeviceType = ContactDevice.ContactDeviceType.r;
		// else if (str.contains("garagedoor"))
		// localContactDeviceType = ContactDevice.ContactDeviceType.f;
		// else if (str.contains("fireplace"))
		// localContactDeviceType = ContactDevice.ContactDeviceType.l;
		// else if (str.contains("glassbreakdetector"))
		// localContactDeviceType = ContactDevice.ContactDeviceType.u;
		// else if (str.contains("heatdetector"))
		// localContactDeviceType = ContactDevice.ContactDeviceType.v;
		// else if (str.contains("humiditysensor"))
		// localContactDeviceType = ContactDevice.ContactDeviceType.w;
		// else if (str.contains("irbeam"))
		// localContactDeviceType = ContactDevice.ContactDeviceType.x;
		// else if (str.contains("motionsensor"))
		// localContactDeviceType = ContactDevice.ContactDeviceType.y;
		// else if (str.contains("motorizedlift"))
		// localContactDeviceType = ContactDevice.ContactDeviceType.m;
		// else if (str.contains("motorizedscreen"))
		// localContactDeviceType = ContactDevice.ContactDeviceType.n;
		// else if (str.contains("pressuresensor"))
		// localContactDeviceType = ContactDevice.ContactDeviceType.z;
		// else if (str.contains("_pump_"))
		// localContactDeviceType = ContactDevice.ContactDeviceType.o;
		// else if (str.contains("radiantfloor"))
		// localContactDeviceType = ContactDevice.ContactDeviceType.p;
		// else if (str.contains("_relay_"))
		// localContactDeviceType = ContactDevice.ContactDeviceType.c;
		// else if (str.contains("smokedetector"))
		// localContactDeviceType = ContactDevice.ContactDeviceType.A;
		// else if (str.contains("sprinkler"))
		// localContactDeviceType = ContactDevice.ContactDeviceType.q;
		// else if (str.contains("watersensor"))
		// localContactDeviceType = ContactDevice.ContactDeviceType.B;
		// else if (str.contains("windowcontactsensor"))
		// localContactDeviceType = ContactDevice.ContactDeviceType.C;
		// else if (str.contains("blind"))
		// localContactDeviceType = ContactDevice.ContactDeviceType.D;
		// else
		// Ln.a("Unknown contact device type " + str, new Object[0]);
		// }
		// catch (Exception localException)
		// {
		// Ln.e(localException);
		// }
		return localContactDeviceType;
	}

	public boolean f() {
		boolean bool = false;
		if (!this.p) {
			String str = B_();
			if ((str != null) && (str.length() != 0)) {
				if (!str.contains("relay"))
					this.o = bool;
				else
					this.o = true;
				this.p = true;
				bool = this.o;
			}
		} else {
			bool = this.o;
		}
		return bool;
	}

	public void p() {
		super.p();
		g(1000);
	}
}

/*
 * Location: E:\去哪儿\com.control4.myhome-2\classes_dex2jar.jar Qualified Name:
 * com.control4.director.device.DirectorContactDevice JD-Core Version: 0.6.0
 */