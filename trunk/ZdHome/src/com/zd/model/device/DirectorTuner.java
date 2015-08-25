package com.zd.model.device;

import com.zd.model.Variable;

public class DirectorTuner extends DirectorDevice implements Tuner {
	private static final String A = "AMBand";
	private static final String B = "FMBand";
	private static final String C = "XMBand";
	private static final int D = 3001;
	private static final int E = 3003;
	private static final int t = 1001;
	private static final int u = 1002;
	private static final int v = 1004;
	private static final int w = 1005;
	private static final int x = 1006;
	private static final int y = 1007;
	private static final int z = 1008;
	protected int k;
	protected Tuner.TunerBand l;
	protected String m;
	protected String n;
	protected String o;
	protected String p;
	protected boolean q = false;
	protected boolean r = false;
	protected boolean s = false;

	private void e(String paramString) {
		// if ((paramString != null) && (paramString.length() > 0))
		// {
		// int i = IntegerUtil.a(paramString);
		// if (i != 3001)
		// {
		// if (i == 3003)
		// a(Tuner.TunerBand.c);
		// }
		// else
		// a(Tuner.TunerBand.b);
		// }
	}

	public Device.DeviceType getType() {
		return Device.DeviceType.w;
	}

	public void a(Variable paramVariable, boolean paramBoolean) {
		// if (paramVariable == null)
		// label4: return;
		// int i = 1;
		// while (true)
		// {
		// try
		// {
		// switch (paramVariable.b())
		// {
		// case 1005:
		// case 1006:
		// if ((i == 0) || (this.j == null))
		// break label4;
		// this.j.a(this);
		// case 1001:
		// case 1004:
		// case 1008:
		// case 1002:
		// case 1003:
		// case 1007:
		// }
		// }
		// catch (Exception localException)
		// {
		// Ln.e(localException);
		// }
		// break;
		// d(paramVariable.c());
		// continue;
		// c_(paramVariable.c());
		// continue;
		// String str = paramVariable.c();
		// if (str == null)
		// {
		// a(Tuner.TunerBand.a);
		// continue;
		// }
		// if (str.equals("AMBand"))
		// {
		// a(Tuner.TunerBand.b);
		// continue;
		// }
		// if (str.equals("FMBand"))
		// {
		// a(Tuner.TunerBand.c);
		// continue;
		// }
		// if (str.equals("XMBand"))
		// {
		// a(Tuner.TunerBand.d);
		// continue;
		// }
		// a(Tuner.TunerBand.a);
		// continue;
		// Ln.a("AM/FM Tuner Current Input: " + paramVariable, new Object[0]);
		// e(paramVariable.c());
		// continue;
		// int j = 0;
		// continue;
		// j = 0;
		// }
	}

	protected void a(Tuner.TunerBand paramTunerBand) {
		this.l = paramTunerBand;
	}

	public void a(String paramString1, String paramString2) {
		// if ((paramString1 != null) && (paramString1.length() != 0))
		// if (!paramString1.equalsIgnoreCase("preset_count"))
		// {
		// if (!paramString1.equalsIgnoreCase("has_discrete_channel_select"))
		// {
		// if (!paramString1.equalsIgnoreCase("has_discrete_input_select"))
		// {
		// if (!paramString1.equalsIgnoreCase("has_preset_up_down"))
		// {
		// if (paramString1.equalsIgnoreCase("has_discrete_channel_select"))
		// this.r = BooleanUtil.a(paramString2);
		// }
		// else
		// this.s = BooleanUtil.a(paramString2);
		// }
		// else
		// this.q = BooleanUtil.a(paramString2);
		// }
		// else
		// this.r = BooleanUtil.a(paramString2);
		// }
		// else
		// this.k = IntegerUtil.a(paramString2);
	}

	public boolean a(int paramInt) {

		return a("SET_PRESET", true, true,
				"<param><name>PRESET</name><value type=\"INT\"><static>"
						+ paramInt + "</static></value></param>");

	}

	public Tuner.TunerBand b() {
		return this.l;
	}

	public void b(Variable paramVariable, boolean paramBoolean) {
		// Exception localException1 = 1;
		// if (paramVariable == null);
		// while (true)
		// {
		// return;
		// Exception localException3 = 0;
		// try
		// {
		// if (paramVariable.f("current_state") != null)
		// {
		// String str = paramVariable.f("last_channel");
		// if ((str != null) && (str.length() > 0))
		// {
		// d(str);
		// localException3 = localException1;
		// }
		// str = paramVariable.f("current_input");
		// if ((str != null) && (str.length() > 0))
		// {
		// e(str);
		// localException3 = localException1;
		// }
		// str = paramVariable.f("current_psn");
		// if ((str != null) && (str.length() > 0))
		// {
		// b_(str);
		// if ((localException1 != 0) && (this.j != null))
		// this.j.a(this);
		// super.b(paramVariable, paramBoolean);
		// }
		// }
		// }
		// catch (Exception localException2)
		// {
		// while (true)
		// {
		// Ln.e(localException2);
		// continue;
		// localException2 = localException3;
		// }
		// }
		// }
	}

	protected void b_(String paramString) {
		this.p = paramString;
	}

	public String c() {
		// StringBuilder localStringBuilder = new StringBuilder();
		// String str1 = m();
		// if (str1 == null)
		// str2 = "";
		// else
		// str2 = str1 + " ";
		// localStringBuilder.append(str2);
		// String str2 = "";
		// if (this.l != Tuner.TunerBand.b)
		// {
		// if (this.l != Tuner.TunerBand.c)
		// {
		// if (this.l == Tuner.TunerBand.d)
		// str2 = "XM";
		// }
		// else
		// str2 = "FM";
		// }
		// else
		// str2 = "AM";
		// localStringBuilder.append(str2);
		// if ((str1 == null) || (str1.length() <= 0) || (str2.length() <= 0))
		// str1 = "";
		// else
		// str1 = " - ";
		// if ((this.o == null) || (this.o.length() <= 0))
		// str1 = "";
		// else
		// str1 = str1 + this.o;
		// localStringBuilder.append(str1);
		// return localStringBuilder.toString();
		return null;
	}

	protected void c_(String paramString) {
		this.o = paramString;
	}

	protected void d(String paramString) {
		this.m = paramString;
	}

	public boolean d() {
		return false;
	}

	protected void d_(String paramString) {
		this.n = null;
	}

	public boolean e() {

		return j("INPUT_TOGGLE");

	}

	public boolean f() {

		return a(
				"SET_INPUT",
				true,
				true,
				"<param><name>INPUT</name><value type=\"INT\"><static>3001</static></value></param>");

	}

	public boolean g() {

		return a(
				"SET_INPUT",
				true,
				true,
				"<param><name>INPUT</name><value type=\"INT\"><static>3003</static></value></param>");

	}

	public boolean h() {
		return this.r;
	}

	public boolean i() {
		return this.s;
	}

	public boolean k() {

		return j("PRESET_UP");

	}

	public String l() {
		return this.o;
	}

	public String m() {
		String str2 = null;
		try {
			String str1 = this.m;
			if ((this.l == Tuner.TunerBand.c) && (this.m != null)) {
				int i = this.m.length();
				String str5 = this.m.substring(0, i - 2);
				String str4 = this.m.substring(i - 2, i);
				if ((str4 != null) && (str4.endsWith("0")))
					str4 = this.m.substring(i - 2, i - 1);
				str2 = str5 + "." + str4;

			}

		} catch (Exception str3) {
		}
		return str2;
	}

	public String n() {
		return this.n;
	}

	public String o() {
		return this.p;
	}

	public int o_() {
		return this.k;
	}

	public void p() {
		super.p();
		g(1001);
		g(1002);
		g(1004);
		g(1005);
		g(1006);
		g(1007);
		g(1008);
	}

	public boolean y_() {

		return j("PRESET_DOWN");

	}
}

/*
 * Location: E:\去哪儿\com.control4.myhome-2\classes_dex2jar.jar Qualified Name:
 * com.control4.director.device.DirectorTuner JD-Core Version: 0.6.0
 */