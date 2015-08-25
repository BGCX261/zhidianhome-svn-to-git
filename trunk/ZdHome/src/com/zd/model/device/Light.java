package com.zd.model.device;

import roboguice.util.Ln;

import com.zd.model.DirectorRoom;
import com.zd.model.Project;
import com.zd.model.Variable;

public class Light extends DirectorDevice {
	public static final String k = "Light";
	private static final int o = 1000;
	private static final int p = 1001;
	boolean l;
	int m;
	int n;

	private void e() {
		try {
			if (this.j != null)
				this.j.a(this);
			if (this._director != null) {
				Object localObject = this._director.m();
				if (localObject != null) {
					localObject = (DirectorRoom) ((Project) localObject).s();
					if (localObject != null)
						((DirectorRoom) localObject).aQ();
				}
			}
			return;
		} catch (Exception localException) {
			while (true)
				Ln.e(localException);
		}
	}

	public Device.DeviceType getType() {
		return Device.DeviceType.c;
	}

	public void a(int paramInt) {
		this.m = paramInt;
	}

	public void a(Variable paramVariable, boolean paramBoolean) {
		// int j = 0;
		// if (paramVariable == null)
		// return;
		// while (true)
		// {
		// int i1;
		// String str;
		// try
		// {
		// i1 = this.m;
		// Ln.a("* OnVariableChanged for Light: " + u() + ", variable: " +
		// paramVariable.b() + ", value = " + paramVariable.c(), new Object[0]);
		// int i = paramVariable.b();
		// str = paramVariable.c();
		// if (i != 1001)
		// break label121;
		// j = Integer.parseInt(str);
		// if ((!z()) || (paramBoolean))
		// break label159;
		// i(true);
		// }
		// catch (Exception localException)
		// {
		// Ln.e(localException);
		// }
		// break;
		// label121: if (localException == 1000)
		// {
		// if (!b())
		// {
		// if (Integer.parseInt(str) <= 0)
		// continue;
		// j = 100;
		// continue;
		// }
		// }
		// else
		// {
		// super.a(paramVariable, paramBoolean);
		// break;
		// this.m = j;
		// e();
		// break;
		// }
		// label159: j = i1;
		// }
	}

	public void a(String paramString1, String paramString2) {
		super.a(paramString1, paramString2);
		if ((paramString1 != null)
				&& (paramString1.equalsIgnoreCase("set_level")))
			if ((paramString2 == null)
					|| (!paramString2.equalsIgnoreCase("True")))
				this.l = false;
			else
				this.l = true;
	}

	public void a(boolean paramBoolean) {
		this.l = paramBoolean;
	}

	public void b(Variable paramVariable, boolean paramBoolean) {
		// if (paramVariable == null);
		// while (true)
		// {
		// return;
		// try
		// {
		// Ln.a("* OnDataToUI for Light: " + u() + ", variable value = " +
		// paramVariable.c() + ", xmltags = " + paramVariable.j(), new
		// Object[0]);
		// if ((z()) && (!paramBoolean))
		// break label112;
		// String str = paramVariable.f("light_level");
		// if ((str != null) && (str.length() > 0))
		// this.m = Integer.parseInt(str);
		// e();
		// }
		// catch (Exception localException)
		// {
		// Ln.e(localException);
		// }
		// continue;
		// label112: i(true);
		// }
	}

	public boolean b() {
		return this.l;
	}

	public boolean b(int paramInt) {
		return false;
		// int i = 0;
		// if (this._director == null);
		// while (true)
		// {
		// return i;
		// if ((paramInt == 100) || (paramInt == 0));
		// try
		// {
		// String str1 = "SET_LEVEL";
		// for (String str3 =
		// "<param><name>LEVEL</name><value type=\"INTEGER\"><static>" +
		// paramInt + "</static></value></param>"; ; str3 = str3)
		// {
		// boolean bool = a(str1, true, false, str3);
		// if (!bool)
		// break;
		// this.m = paramInt;
		// h(true);
		// break;
		// String str2 = "RAMP_TO_LEVEL";
		// str3 = "<param><name>LEVEL</name><value type=\"INTEGER\"><static>" +
		// paramInt +
		// "</static></value></param><param><name>TIME</name><value type=\"INTEGER\"><static>"
		// + 1000 + "</static></value></param>";
		// }
		// }
		// catch (Exception localException)
		// {
		// Ln.e(localException);
		// }
		// continue;
		// i = localException;
		// }
	}

	public int c() {
		return this.m;
	}

	public boolean d() {
		return false;
		// boolean bool1 = true;
		// if ((this._director == null) || ((!this._director.r()) &&
		// (!this._director.G())))
		// bool1 = false;
		// while (true)
		// {
		// return bool1;
		// boolean bool3;
		// while (true)
		// {
		// try
		// {
		// if (this.m <= 0)
		// break label75;
		// bool3 = bool1;
		// if (!this._director.G())
		// break label89;
		// if (!bool3)
		// break label80;
		// this.m = 0;
		// }
		// catch (Exception bool2)
		// {
		// Ln.e(localException);
		// bool2 = false;
		// }
		// break;
		// label75: bool3 = false;
		// }
		// label80: this.m = 100;
		// continue;
		// label89: Ln.a("* Toggling Light: " + u() + ", wasOn: " + bool3, new
		// Object[0]);
		// if (b());
		// for (boolean bool2 = a("CLICK_TOGGLE_BUTTON", true, false); ; bool2 =
		// a("TOGGLE_PRESET", true, false))
		// {
		// if ((!bool2) || (this.l))
		// break label177;
		// if (!bool3)
		// break label179;
		// this.m = 0;
		// break;
		// }
		// label177: continue;
		// label179: this.m = 100;
		// }
	}

	public void p() {
		try {
			super.p();
			if (this._director == null)
				return;
			this.n = this.m;
			if (this.l)
				g(1001);
		} catch (Exception localException) {
			Ln.e(localException);
		}
		g(1000);
	}
}
