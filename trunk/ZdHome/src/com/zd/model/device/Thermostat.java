package com.zd.model.device;

import java.util.ArrayList;

import roboguice.util.Ln;
import android.app.Application;

import com.google.inject.Inject;
import com.zd.model.Variable;

/**
 * ¿Õµ÷
 * 
 * @author jiantuan
 * 
 */
public class Thermostat extends DirectorDevice {
	public static final int C = 90;
	public static final int D = 38;
	public static final int E = 33;
	public static final int F = 3;
	public static final String Q = "OFF";
	public static final String R = "ON";
	public static final String S = "AUTO";
	public static final String T = "MEDIUM";
	public static final String U = "HIGH";
	public static final String V = "LOW";
	public static final String W = "COOL";
	public static final String X = "HEAT";
	public static final String Y = "AUTOHEAT";
	public static final String Z = "AUTOCOOL";
	public static final String aa = "PERMANENT";
	public static final String ab = "2_HOURS";
	public static final String ac = "TO_NEXT";
	public static final String ad = "OFF";
	public static final String ae = "ON";
	public static final String af = "PERMANENT";
	public static final String ag = "2 HOURS";
	public static final String ah = "UNTIL NEXT";
	private static final int ak = 1000;
	private static final int al = 1001;
	private static final int am = 1003;
	private static final int an = 1004;
	private static final int ao = 1005;
	private static final int ap = 1006;
	private static final int aq = 1118;
	private static final int ar = 1119;
	public static final String k = "Thermostat";
	public static final int l = 0;
	public static final int m = 1;
	public static final int n = 2;
	public static final int o = 3;
	public static final int p = 0;
	public static final int q = 1;
	public static final int r = 0;
	public static final int s = 1;
	public static final int t = 2;
	public static final int u = 3;
	protected int A;
	protected String B;
	protected boolean G = true;
	protected boolean H = true;
	protected boolean I = true;
	protected boolean J = true;
	protected boolean K = true;
	protected boolean L = true;
	protected boolean M = true;
	protected ArrayList<String> N = null;
	protected ArrayList<String> O = null;
	protected ArrayList<String> P = null;

	@Inject
	protected Application _context;
	private int ai = 90;
	private int aj = 38;
	protected int v;
	protected String w;
	protected String x;
	protected int y;
	protected int z;

	private void f(String paramString) {
		if (this.P == null)
			this.P = new ArrayList();
		if (!this.P.contains(paramString))
			this.P.add(paramString);
	}

	private void l(String paramString) {
		// int i = 0;
		// int j;
		// boolean bool2;
		// boolean bool1;
		// if (paramString != null)
		// {
		// String str;
		// try
		// {
		// if (paramString.length() <= 0)
		// break label206;
		// String[] arrayOfString = paramString.split(",");
		// if (arrayOfString.length <= 0)
		// break label206;
		// if (this.N == null)
		// {
		// this.N = new ArrayList();
		// break label189;
		// if (j >= arrayOfString.length)
		// break label149;
		// str = arrayOfString[j];
		// if ((str == null) || (str.length() <= 0))
		// break label200;
		// this.N.add(str);
		// if (!str.equalsIgnoreCase("Cool"))
		// break label118;
		// i = 1;
		// break label200;
		// }
		// this.N.clear();
		// }
		// catch (Exception localException)
		// {
		// Ln.e(localException);
		// }
		// return;
		// if (str.equalsIgnoreCase("Heat"))
		// bool2 = true;
		// else if (str.equalsIgnoreCase("Auto"))
		// bool1 = true;
		// }
		//
		// label149:
		// if (this.L)
		// this.I = bool1;
		// if (this.J)
		// this.G = bool2;
		// if (!this.K)
		// break label117;
		// this.H = i;
		// break label117;
		// label189: j = i;
		// bool2 = i;
		// bool1 = i;
		// break;
		// label200: j++;
		// break;
		// label206: bool2 = i;
		// bool1 = i;

	}

	private void m(String paramString) {
		// if (paramString != null);
		// while (true)
		// {
		// String str;
		// try
		// {
		// if (paramString.length() > 0)
		// {
		// String[] arrayOfString = paramString.split(",");
		// if (arrayOfString.length > 0)
		// {
		// if (this.O != null)
		// continue;
		// this.O = new ArrayList();
		// break label297;
		// int i;
		// if (i < arrayOfString.length)
		// {
		// str = arrayOfString[i];
		// if ((str == null) || (str.length() <= 0))
		// break label302;
		// if (this._context == null)
		// break label285;
		// if (!str.equalsIgnoreCase("ON"))
		// break label123;
		// this.O.add(this._context.getString(R.string.on));
		// break label302;
		// this.O.clear();
		// }
		// }
		// }
		// }
		// catch (Exception localException)
		// {
		// Ln.e(localException);
		// }
		// return;
		// label123: int j;
		// if (str.equalsIgnoreCase("OFF"))
		// {
		// this.O.add(this._context.getString(R.string.off));
		// }
		// else if (str.equalsIgnoreCase("AUTO"))
		// {
		// this.O.add(this._context.getString(R.string.auto));
		// }
		// else if (str.equalsIgnoreCase("MEDIUM"))
		// {
		// this.O.add(this._context.getString(R.string.medium));
		// }
		// else if (str.equalsIgnoreCase("HIGH"))
		// {
		// this.O.add(this._context.getString(R.string.high));
		// }
		// else if (str.equalsIgnoreCase("LOW"))
		// {
		// this.O.add(this._context.getString(R.string.low));
		// }
		// else
		// {
		// this.O.add(str);
		// break label302;
		// label285: this.O.add(str);
		// break label302;
		// label297: j = 0;
		// continue;
		// }
		// label302: j++;
		// }
	}

	private void n(String paramString) {
		// if (paramString != null);
		// String str;
		// try
		// {
		// if (paramString.length() > 0)
		// {
		// String[] arrayOfString = paramString.split(",");
		// if (arrayOfString.length > 0)
		// {
		// if (this.P != null)
		// continue;
		// this.P = new ArrayList();
		// break label273;
		// int i;
		// if (i < arrayOfString.length)
		// {
		// str = arrayOfString[i];
		// if ((str == null) || (str.length() <= 0))
		// break label278;
		// if (this._context == null)
		// break label260;
		// if (!str.equalsIgnoreCase("OFF"))
		// break label123;
		// this.P.add(this._context.getString(R.string.off));
		// break label278;
		// this.P.clear();
		// }
		// }
		// }
		// }
		// catch (Exception localException)
		// {
		// Ln.e(localException);
		// }
		// return;
		// label123: int j;
		// if (str.equalsIgnoreCase("ON"))
		// {
		// this.P.add(this._context.getString(R.string.on));
		// }
		// else if (str.equalsIgnoreCase("2 HOURS"))
		// {
		// this.P.add(this._context.getString(R.string.two_hours));
		// }
		// else if (str.equalsIgnoreCase("UNTIL NEXT"))
		// {
		// this.P.add(this._context.getString(R.string.until_next));
		// }
		// else if (str.equalsIgnoreCase("PERMANENT"))
		// {
		// this.P.add(this._context.getString(R.string.permanent));
		// }
		// else
		// {
		// this.P.add(str);
		// break label278;
		// label260: this.P.add(str);
		// break label278;
		// label273: j = 0;
		// continue;
		// }

	}

	public ArrayList<String> E() {
		return this.O;
	}

	public int F() {
		return this.y;
	}

	public int G() {
		return this.z;
	}

	public int H() {
		return this.A;
	}

	public String I() {
		return this.B;
	}

	public void J() {
		b(77);
		c("F");
		a(0);
		c(77);
		h(60);
		b("PERMANENT");
		a("AUTO");
		// m(this._context.getString(R.string.auto) + "," +
		// this._context.getString(R.string.on));
		// n(this._context.getString(R.string.off) + "," +
		// this._context.getString(R.string.two_hours) + "," +
		// this._context.getString(R.string.until_next) + "," +
		// this._context.getString(R.string.permanent));
	}

	public Device.DeviceType getType() {
		return Device.DeviceType.b;
	}

	public void a(int paramInt) {
		this.v = paramInt;
	}

	public void a(Variable paramVariable, boolean paramBoolean) {
		// if (paramVariable == null);
		// label278:
		// while (true)
		// {
		// return;
		// try
		// {
		// String str = paramVariable.c();
		// if (str == null)
		// str = "";
		// switch (paramVariable.b())
		// {
		// default:
		// super.a(paramVariable, paramBoolean);
		// case 1003:
		// case 1005:
		// case 1119:
		// case 1004:
		// case 1118:
		// case 1000:
		// case 1001:
		// case 1006:
		// }
		// }
		// catch (Exception localException)
		// {
		// Ln.e(localException);
		// }
		// continue;
		// this.y = IntegerUtil.a(localException);
		// while (true)
		// {
		// if (this.j == null)
		// break label278;
		// this.j.a(this);
		// break;
		// if (z())
		// continue;
		// this.z = IntegerUtil.a(localException);
		// continue;
		// if (z())
		// continue;
		// this.A = IntegerUtil.a(localException);
		// continue;
		// if (localException.equalsIgnoreCase("AUTO"))
		// {
		// this.v = 0;
		// continue;
		// }
		// if ((localException.equalsIgnoreCase("COOL")) ||
		// (localException.equalsIgnoreCase("AUTOCOOL")))
		// {
		// this.v = 1;
		// continue;
		// }
		// if ((localException.equalsIgnoreCase("HEAT")) ||
		// (localException.equalsIgnoreCase("AUTOHEAT")))
		// {
		// this.v = 2;
		// continue;
		// }
		// if (!localException.equalsIgnoreCase("OFF"))
		// continue;
		// this.v = 3;
		// continue;
		// a(localException);
		// continue;
		// b(localException);
		// }
		// }
	}

	public void a(String paramString) {
		// if (paramString != null)
		// if (!paramString.equalsIgnoreCase("ON"))
		// {
		// if (!paramString.equalsIgnoreCase("OFF"))
		// {
		// if (!paramString.equalsIgnoreCase("AUTO"))
		// {
		// if (!paramString.equalsIgnoreCase("MEDIUM"))
		// {
		// if (!paramString.equalsIgnoreCase("HIGH"))
		// {
		// if (paramString.equalsIgnoreCase("LOW"))
		// paramString = this._context.getString(R.string.low);
		// }
		// else
		// paramString = this._context.getString(R.string.high);
		// }
		// else
		// paramString = this._context.getString(R.string.medium);
		// }
		// else
		// paramString = this._context.getString(R.string.auto);
		// }
		// else
		// paramString = this._context.getString(R.string.off);
		// }
		// else
		// paramString = this._context.getString(R.string.on);
		// this.w = paramString;
	}

	public void a(String paramString1, String paramString2) {
		// if (paramString1 != null)
		// while (true)
		// {
		// try
		// {
		// if (paramString1.length() == 0)
		// break;
		// if (paramString1.equalsIgnoreCase("can_heat"))
		// {
		// if ((paramString2 == null) || (paramString2.length() <= 0))
		// continue;
		// this.G = BooleanUtil.a(paramString2);
		// this.J = BooleanUtil.a(paramString2);
		// super.a(paramString1, paramString2);
		// }
		// }
		// catch (Exception localException)
		// {
		// Ln.e(localException);
		// }
		// if (paramString1.equalsIgnoreCase("can_cool"))
		// {
		// if ((paramString2 == null) || (paramString2.length() <= 0))
		// continue;
		// this.H = BooleanUtil.a(paramString2);
		// this.K = BooleanUtil.a(paramString2);
		// continue;
		// }
		// if (paramString1.equalsIgnoreCase("can_do_auto"))
		// {
		// if ((paramString2 == null) || (paramString2.length() <= 0))
		// continue;
		// this.I = BooleanUtil.a(paramString2);
		// this.L = BooleanUtil.a(paramString2);
		// continue;
		// }
		// if ((paramString1.equalsIgnoreCase("hvac_modes")) ||
		// (paramString1.equalsIgnoreCase("modelist")))
		// {
		// l(paramString2);
		// continue;
		// }
		// if ((paramString1.equalsIgnoreCase("hold_modes")) ||
		// (paramString1.equalsIgnoreCase("holdlist")))
		// {
		// n(paramString2);
		// continue;
		// }
		// if ((paramString1.equalsIgnoreCase("fan_states")) ||
		// (paramString1.equalsIgnoreCase("fan_modes")) ||
		// (paramString1.equalsIgnoreCase("fanlist")))
		// {
		// m(paramString2);
		// continue;
		// }
		// if (paramString1.equalsIgnoreCase("has_emergency_heat"))
		// {
		// this.M = BooleanUtil.a(paramString2);
		// continue;
		// }
		// if (paramString1.equalsIgnoreCase("temp_cool_max"))
		// {
		// if ((paramString2 == null) || (paramString2.length() <= 0))
		// continue;
		// this.ai = IntegerUtil.a(paramString2);
		// continue;
		// }
		// if (paramString1.equalsIgnoreCase("temp_heat_min"))
		// {
		// if ((paramString2 == null) || (paramString2.length() <= 0))
		// continue;
		// this.aj = IntegerUtil.a(paramString2);
		// continue;
		// }
		// if (paramString1.equalsIgnoreCase("hold_2_hours"))
		// {
		// if (!BooleanUtil.a(paramString2))
		// continue;
		// f(this._context.getString(R.string.two_hours));
		// continue;
		// }
		// if (paramString1.equalsIgnoreCase("hold_permanently"))
		// {
		// if (!BooleanUtil.a(paramString2))
		// continue;
		// f(this._context.getString(R.string.permanent));
		// continue;
		// }
		// if ((!paramString1.equalsIgnoreCase("hold_to_next")) ||
		// (!BooleanUtil.a(paramString2)))
		// continue;
		// f(this._context.getString(R.string.to_next));
		// }
	}

	public int b() {
		return this.v;
	}

	public void b(int paramInt) {
		this.y = paramInt;
	}

	public void b(Variable paramVariable, boolean paramBoolean) {
		// int i = 0;
		// if (paramVariable == null);
		// String str2;
		// do
		// while (true)
		// {
		// return;
		// try
		// {
		// str2 = paramVariable.c();
		// if ((!z()) || (paramBoolean))
		// break;
		// Ln.a("Ignoring thermostat onDataToUI call since the device is already locally changed.",
		// new Object[0]);
		// }
		// catch (Exception localException1)
		// {
		// Ln.e(localException1);
		// }
		// }
		// while ((str2 == null) || (str2.length() <= 0));
		// boolean bool = str2.startsWith("<settings>");
		// if (bool);
		// while (true)
		// {
		// Object localObject2;
		// Object localObject3;
		// try
		// {
		// localObject2 =
		// (ThermostatSettingsParser)ParserFactory.ThermostatSettingsProvider.a();
		// ((ThermostatSettingsParser)localObject2).a(this);
		// Object localObject1 =
		// XmlPullParserFactory.newInstance().newPullParser();
		// ((XmlPullParser)localObject1).setInput(new StringReader(str2));
		// ((ThermostatSettingsParser)localObject2).a((XmlPullParser)localObject1);
		// localObject2 = paramVariable.f("heat_setpoint");
		// str2 = paramVariable.f("cool_setpoint");
		// localObject3 = paramVariable.f("scale");
		// localObject1 = paramVariable.f("temperature");
		// if ((localObject2 == null) || (((String)localObject2).length() <= 0))
		// continue;
		// this.A = Integer.parseInt((String)localObject2);
		// if ((str2 == null) || (str2.length() <= 0))
		// continue;
		// this.z = Integer.parseInt(str2);
		// if ((localObject3 == null) || (((String)localObject3).length() <= 0))
		// continue;
		// c((String)localObject3);
		// if ((localObject1 == null) || (((String)localObject1).length() <= 0))
		// break label1320;
		// this.y = Integer.parseInt((String)localObject1);
		// break label1320;
		// if ((localObject1 == 0) || (this.j == null))
		// break;
		// this.j.a(this);
		// }
		// catch (Exception localException2)
		// {
		// Ln.e(localException2);
		// continue;
		// }
		// if ((str2.startsWith("<hvacmode>")) ||
		// (str2.startsWith("<hvac_mode>")))
		// {
		// str2 = paramVariable.f("hvacmode");
		// if (str2 == null)
		// str2 = paramVariable.f("hvac_mode");
		// if ((str2 != null) && (str2.length() > 0))
		// {
		// if (str2.equalsIgnoreCase("COOL"))
		// {
		// this.v = 1;
		// break label1325;
		// }
		// if (str2.equalsIgnoreCase("OFF"))
		// {
		// this.v = 3;
		// break label1325;
		// }
		// if (str2.equalsIgnoreCase("HEAT"))
		// {
		// this.v = 2;
		// break label1325;
		// }
		// if ((!str2.equalsIgnoreCase("AUTO")) &&
		// (!str2.equalsIgnoreCase("AUTOCOOL")) &&
		// (!str2.equalsIgnoreCase("AUTOHEAT")))
		// break label1325;
		// this.v = 0;
		// break label1325;
		// }
		// }
		// else
		// {
		// if ((str2.startsWith("<holdmode>")) ||
		// (str2.startsWith("<hold_mode>")))
		// {
		// str2 = paramVariable.f("holdmode");
		// if (str2 == null)
		// str2 = paramVariable.f("hold_mode");
		// if ((str2 == null) || (str2.length() <= 0))
		// continue;
		// b(str2);
		// int j = 1;
		// continue;
		// }
		// if (str2.startsWith("<temperature_info>"))
		// {
		// String str1 = paramVariable.f("heat_setpoint");
		// localObject2 = paramVariable.f("cool_setpoint");
		// str2 = paramVariable.f("scale");
		// localObject3 = paramVariable.f("temperature");
		// if ((str1 != null) && (str1.length() > 0))
		// this.A = Integer.parseInt(str1);
		// if ((localObject2 != null) && (((String)localObject2).length() > 0))
		// this.z = Integer.parseInt((String)localObject2);
		// if ((localObject3 != null) && (((String)localObject3).length() > 0))
		// this.y = Integer.parseInt((String)localObject3);
		// if ((str2 == null) || (str2.length() <= 0))
		// break label1332;
		// c(str2);
		// break label1332;
		// }
		// if (str2.startsWith("<scale>"))
		// {
		// str2 = paramVariable.f("scale");
		// if ((str2 == null) || (str2.length() <= 0))
		// continue;
		// c(str2);
		// i1 = 1;
		// continue;
		// }
		// if ((str2.startsWith("<fanmode>")) ||
		// (str2.startsWith("<fan_mode>")))
		// {
		// str2 = paramVariable.f("fanmode");
		// if (str2 == null)
		// str2 = paramVariable.f("fan_mode");
		// if ((str2 == null) || (str2.length() <= 0))
		// continue;
		// a(str2);
		// i1 = 1;
		// continue;
		// }
		// if (str2.startsWith("<temperature>"))
		// {
		// str2 = paramVariable.f("temperature");
		// if ((str2 == null) || (str2.length() <= 0))
		// continue;
		// this.y = Integer.parseInt(str2);
		// i1 = 1;
		// continue;
		// }
		// if (str2.startsWith("<heat_setpoint>"))
		// {
		// str2 = paramVariable.f("heat_setpoint");
		// if ((str2 == null) || (str2.length() <= 0))
		// continue;
		// this.A = Integer.parseInt(str2);
		// i1 = 1;
		// continue;
		// }
		// if (str2.startsWith("<cool_setpoint>"))
		// {
		// str2 = paramVariable.f("cool_setpoint");
		// if ((str2 == null) || (str2.length() <= 0))
		// continue;
		// this.z = Integer.parseInt(str2);
		// i1 = 1;
		// continue;
		// }
		// if (!str2.startsWith("<thermostat_info>"))
		// continue;
		// Ln.a("Thermostat Info for (" + u() + "): " + paramVariable, new
		// Object[0]);
		// localObject2 = paramVariable.j();
		// if ((paramVariable.j() == null) || (paramVariable.j().size() == 0))
		// {
		// localObject3 = (HashParser)ParserFactory.HashProvider.a();
		// localObject2 = XmlPullParserFactory.newInstance().newPullParser();
		// ((XmlPullParser)localObject2).setInput(new StringReader(str2));
		// ((HashParser)localObject3).a((XmlPullParser)localObject2);
		// }
		// for (localObject2 = ((HashParser)localObject3).a(); ; localObject2 =
		// localObject2)
		// {
		// str2 = (String)((HashMap)localObject2).get("hold_modes");
		// if ((str2 == null) || (str2.length() == 0));
		// for (str2 = (String)((HashMap)localObject2).get("holdlist"); ; str2 =
		// str2)
		// {
		// localObject3 = (String)((HashMap)localObject2).get("fan_modes");
		// if ((localObject3 == null) || (((String)localObject3).length() ==
		// 0));
		// for (localObject3 = (String)((HashMap)localObject2).get("fanlist"); ;
		// localObject3 = localObject3)
		// {
		// String str3 = (String)((HashMap)localObject2).get("hvac_modes");
		// if ((str3 == null) || (str3.length() == 0));
		// for (String str4 = (String)((HashMap)localObject2).get("modelist"); ;
		// str4 = str3)
		// {
		// String str5 = (String)((HashMap)localObject2).get("can_heat");
		// str3 = (String)((HashMap)localObject2).get("can_cool");
		// localObject2 = (String)((HashMap)localObject2).get("can_do_auto");
		// if ((str2 != null) && (str2.length() > 0))
		// n(str2);
		// if ((localObject3 != null) && (((String)localObject3).length() > 0))
		// m((String)localObject3);
		// if ((str4 != null) && (str4.length() > 0))
		// l(str4);
		// if ((str5 != null) && (str5.length() > 0))
		// this.G = BooleanUtil.a(str5);
		// if ((str3 != null) && (str3.length() > 0))
		// this.H = BooleanUtil.a(str3);
		// if ((localObject2 == null) || (((String)localObject2).length() <= 0))
		// break;
		// this.I = BooleanUtil.a((String)localObject2);
		// break;
		// }
		// }
		// }
		// }
		// }
		// int i1 = i1;
		// break label1327;
		// label1320: i1 = 1;
		// continue;
		// label1325: i1 = 1;
		// label1327: i1 = i1;
		// continue;
		// label1332: i1 = 1;
		// }
	}

	public void b(String paramString) {
		// if (paramString != null)
		// if ((!paramString.equalsIgnoreCase("PERMANENT")) &&
		// (!paramString.equalsIgnoreCase("PERMANENT")))
		// {
		// if ((!paramString.equalsIgnoreCase("TO_NEXT")) &&
		// (!paramString.equalsIgnoreCase("UNTIL NEXT")))
		// {
		// if ((!paramString.equalsIgnoreCase("ON")) &&
		// (!paramString.equalsIgnoreCase("ON")))
		// {
		// if ((!paramString.equalsIgnoreCase("OFF")) &&
		// (!paramString.equalsIgnoreCase("OFF")))
		// {
		// if ((paramString.equalsIgnoreCase("2_HOURS")) ||
		// (paramString.equalsIgnoreCase("2 HOURS")))
		// paramString = this._context.getString(R.string.two_hours);
		// }
		// else
		// paramString = this._context.getString(R.string.off);
		// }
		// else
		// paramString = this._context.getString(R.string.on);
		// }
		// else
		// paramString = this._context.getString(R.string.until_next);
		// }
		// else
		// paramString = this._context.getString(R.string.permanent);
		// this.x = paramString;
	}

	public void c(int paramInt) {
		this.z = paramInt;
	}

	public void c(String paramString) {
		this.B = paramString;
		if (paramString != null)
			;
		try {
			if ((paramString.length() > 0)
					&& (paramString.substring(0, 1).equalsIgnoreCase("C"))) {
				this.aj = 3;
				this.ai = 33;
				return;
			}
			if ((paramString != null) && (paramString.length() > 0)
					&& (paramString.substring(0, 1).equalsIgnoreCase("F"))) {
				this.aj = 38;
				this.ai = 90;
			}
		} catch (Exception localException) {
			Ln.e(localException);
		}
		this.aj = 3;
		this.ai = 90;
	}

	public boolean c() {
		return this.I;
	}

	public boolean d() {
		return this.H;
	}

	public boolean d(String paramString) {
		// int i = 0;
		// try
		// {
		// if (this._director == null)
		// {
		// Ln.e("No Director - unable to change the fan mode.", new Object[0]);
		// }
		// else
		// {
		// if (paramString != null)
		// {
		// if
		// (!paramString.equalsIgnoreCase(this._context.getString(R.string.on)))
		// break label100;
		// paramString = "ON";
		// }
		// while (true)
		// {
		// boolean bool = a("SET_FAN_MODE", true, false,
		// "<param><name>FANMODE</name><value  type=\"STRING\"><static>" +
		// paramString + "</static></value></param>");
		// if (!bool)
		// break;
		// this.w = paramString;
		// h(true);
		// break;
		// label100: if
		// (paramString.equalsIgnoreCase(this._context.getString(R.string.off)))
		// {
		// paramString = "OFF";
		// continue;
		// }
		// if
		// (paramString.equalsIgnoreCase(this._context.getString(R.string.auto)))
		// {
		// paramString = "AUTO";
		// continue;
		// }
		// if
		// (paramString.equalsIgnoreCase(this._context.getString(R.string.medium)))
		// {
		// paramString = "MEDIUM";
		// continue;
		// }
		// if
		// (paramString.equalsIgnoreCase(this._context.getString(R.string.high)))
		// {
		// paramString = "HIGH";
		// continue;
		// }
		// if
		// (!paramString.equalsIgnoreCase(this._context.getString(R.string.low)))
		// continue;
		// paramString = "LOW";
		// }
		// }
		// }
		// catch (Exception localException)
		// {
		// Ln.e(localException);
		// }
		// while (true)
		// {
		// return i;
		// i = localException;
		// }
		return false;
	}

	public boolean e() {
		return this.G;
	}

	public boolean e(String paramString) {
		// int i = 0;
		// try
		// {
		// if (this._director == null)
		// {
		// Ln.e("No Director - unable to change the hold mode.", new Object[0]);
		// }
		// else
		// {
		// if ((paramString != null) && (this._context != null))
		// {
		// if
		// (!paramString.equalsIgnoreCase(this._context.getString(R.string.permanent)))
		// break label107;
		// paramString = "PERMANENT";
		// }
		// while (true)
		// {
		// boolean bool = a("SET_HOLD_MODE", true, false,
		// "<param><name>HOLDMODE</name><value  type=\"STRING\"><static>" +
		// paramString + "</static></value></param>");
		// if (!bool)
		// break;
		// b(paramString);
		// h(true);
		// break;
		// label107: if
		// (paramString.equalsIgnoreCase(this._context.getString(R.string.until_next)))
		// {
		// paramString = "TO_NEXT";
		// continue;
		// }
		// if
		// (paramString.equalsIgnoreCase(this._context.getString(R.string.on)))
		// {
		// paramString = "ON";
		// continue;
		// }
		// if
		// (paramString.equalsIgnoreCase(this._context.getString(R.string.off)))
		// {
		// paramString = "OFF";
		// continue;
		// }
		// if
		// (!paramString.equalsIgnoreCase(this._context.getString(R.string.two_hours)))
		// continue;
		// paramString = "2_HOURS";
		// }
		// }
		// }
		// catch (Exception localException)
		// {
		// Ln.e(localException);
		// }
		// while (true)
		// {
		// return i;
		// i = localException;
		// }
		return false;
	}

	public boolean f() {
		boolean i = false;
		if ((this.P == null) || (this.P.size() <= 0))
			i = false;
		else
			i = true;
		return i;
	}

	public boolean g() {
		boolean i = false;
		if ((this.O == null) || (this.O.size() <= 0))
			i = false;
		else
			i = true;
		return i;
	}

	public void h(int paramInt) {
		this.A = paramInt;
	}

	public boolean h() {
		return this.M;
	}

	public String i() {
		// Object localObject3;
		// Object localObject2;
		// if (this.v != 0)
		// {
		// if (this.v != 3)
		// {
		// if (this.v != 2)
		// {
		// localObject3 = this._context;
		// int j = R.string.thermostat_mode_format;
		// Object localObject1 = new Object[2];
		// localObject1[0] = this._context.getString(R.string.thermostat_cool);
		// localObject1[1] = Integer.valueOf(this.z);
		// localObject1 = ((Application)localObject3).getString(j,
		// localObject1);
		// }
		// else
		// {
		// localObject3 = this._context;
		// int i = R.string.thermostat_mode_format;
		// Object[] arrayOfObject = new Object[2];
		// arrayOfObject[0] = this._context.getString(R.string.thermostat_heat);
		// arrayOfObject[1] = Integer.valueOf(this.A);
		// localObject2 = ((Application)localObject3).getString(i,
		// arrayOfObject);
		// }
		// }
		// else
		// localObject2 =
		// this._context.getString(R.string.thermostat_mode_format_off);
		// }
		// else
		// {
		// localObject2 = this._context;
		// int i1 = R.string.thermostat_mode_format_auto;
		// localObject3 = new Object[2];
		// localObject3[0] = Integer.valueOf(this.A);
		// localObject3[1] = Integer.valueOf(this.z);
		// localObject2 = ((Application)localObject2).getString(i1,
		// localObject3);
		// }
		// return (String)(String)(String)localObject2;
		return "";
	}

	public boolean i(int paramInt) {
		// int i = 0;
		// try
		// {
		// if (this._director != null)
		// break label133;
		// Ln.e("No Director - unable to change the mode.", new Object[0]);
		// break label131;
		// Ln.e("Unable to change mode to " + paramInt +
		// ".  Unknown mode constant.", new Object[0]);
		// }
		// catch (Exception localException)
		// {
		// Ln.e(localException);
		// }
		// String str1 = "AUTO";
		// while (true)
		// {
		// boolean bool = a("SET_MODE", true, false,
		// "<param><name>HVACMODE</name><value  type=\"STRING\"><static>" + str1
		// + "</static></value></param>");
		// if (bool)
		// {
		// this.v = paramInt;
		// h(true);
		// break label164;
		// str2 = "OFF";
		// continue;
		// }
		// while (true)
		// {
		// label131: return i;
		// switch (paramInt)
		// {
		// default:
		// case 0:
		// case 3:
		// label133: label164: i = str2;
		// case 1:
		// case 2:
		// }
		// }
		// String str2 = "COOL";
		// continue;
		// str2 = "HEAT";
		// }
		return false;
	}

	public boolean j(int paramInt) {
		// int i = 0;
		// try
		// {
		// if (this._director == null)
		// {
		// Ln.e("No Director - unable to change the cool set point.", new
		// Object[0]);
		// break label188;
		// }
		// if (paramInt > this.ai)
		// Ln.a("Unable to change cool set point to be: " + paramInt +
		// ".  That is greater than the max set point temperature of: " +
		// this.ai, new Object[0]);
		// }
		// catch (Exception localException)
		// {
		// Ln.e(localException);
		// }
		// if (paramInt < this.aj)
		// {
		// Ln.a("Unable to change cool set point to be: " + paramInt +
		// ".  That is less than the min set point temperature of: " + this.aj,
		// new Object[0]);
		// }
		// else
		// {
		// boolean bool = a("SET_COOL_SETPOINT", true, false,
		// "<param><name>SETPOINT</name><value  type=\"STRING\"><static>" +
		// paramInt + "</static></value></param>");
		// if (bool)
		// {
		// this.z = paramInt;
		// h(true);
		// }
		// i = bool;
		// }
		// label188: return i;
		return false;
	}

	public String k() {
		return this.w;
	}

	public boolean k(int paramInt) {
		// int i = 0;
		// try
		// {
		// if (this._director == null)
		// {
		// Ln.e("No Director - unable to change the heat set point.", new
		// Object[0]);
		// break label188;
		// }
		// if (paramInt > this.ai)
		// Ln.a("Unable to change heat set point to be: " + paramInt +
		// ".  That is greater than the max set point temperature of: " +
		// this.ai, new Object[0]);
		// }
		// catch (Exception localException)
		// {
		// Ln.e(localException);
		// }
		// if (paramInt < this.aj)
		// {
		// Ln.a("Unable to change heat set point to be: " + paramInt +
		// ".  That is less than the min set point temperature of: " + this.aj,
		// new Object[0]);
		// }
		// else
		// {
		// boolean bool = a("SET_HEAT_SETPOINT", true, false,
		// "<param><name>SETPOINT</name><value  type=\"STRING\"><static>" +
		// paramInt + "</static></value></param>");
		// if (bool)
		// {
		// this.A = paramInt;
		// h(true);
		// }
		// i = bool;
		// }
		// label188: return i;

		return false;
	}

	public String l() {
		return this.x;
	}

	public int m() {
		// try
		// {
		// if ((this.O != null) && (this.O.size() != 0))
		// {
		// Iterator localIterator2 = 0;
		// Iterator localIterator1 = this.O.iterator();
		// while (localIterator1.hasNext())
		// {
		// String str = (String)localIterator1.next();
		// if (str != null)
		// {
		// boolean bool = str.equalsIgnoreCase(this.w);
		// if (bool)
		// {
		// localIterator1 = localIterator2;
		// break label98;
		// }
		// }
		// localIterator2++;
		// }
		// int i = -1;
		// }
		// }
		// catch (Exception j)
		// {
		// Ln.e(localException);
		// j = -1;
		// }
		// int j = -1;
		// label98: return j;
		return 0;
	}

	public int n() {
		// try
		// {
		// if ((this.P != null) && (this.P.size() != 0))
		// {
		// int i = 0;
		// Iterator localIterator = this.P.iterator();
		// while (localIterator.hasNext())
		// {
		// String str = (String)localIterator.next();
		// if (str != null)
		// {
		// boolean bool = str.equalsIgnoreCase(this.x);
		// if (bool)
		// {
		// i = i;
		// break label98;
		// }
		// }
		// i++;
		// }
		// i = -1;
		// }
		// }
		// catch (Exception j)
		// {
		// Ln.e(localException);
		// j = -1;
		// }
		// int j = -1;
		// label98: return j;
		return 0;
	}

	public ArrayList<String> o() {
		return this.P;
	}

	public void p() {
		super.p();
		// try
		// {
		// if (this._director == null)
		// Ln.e("No Director!  Unable to get updated information on this device",
		// new Object[0]);
		// g(1003);
		// g(1000);
		// g(1005);
		// g(1004);
		// g(1001);
		// g(1006);
		// GetThermostatSettingsCommand localGetThermostatSettingsCommand =
		// (GetThermostatSettingsCommand)CommandFactory.GetThermostatSettingsProvider.a();
		// localGetThermostatSettingsCommand.a(t());
		// this._director.a(localGetThermostatSettingsCommand);
		// j("QUERY_THERMOSTAT_INFO");
		// return;
		// }
		// catch (Exception localException)
		// {
		//
		// Ln.e(localException);
		// }
	}
}
