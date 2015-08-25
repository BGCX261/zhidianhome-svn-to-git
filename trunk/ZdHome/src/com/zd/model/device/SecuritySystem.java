package com.zd.model.device;

import roboguice.util.Ln;

import com.zd.model.HashIndex;
import com.zd.model.Variable;

public class SecuritySystem extends DirectorDevice {
	public class SecuritySystemButton {

	}

	public static final String k = "HOME";
	public static final String l = "AWAY";
	public static final String m = "DISARMED";
	public static final String n = "ALARM";
	public static final boolean o = false;
	private static final int u = 1000;
	private static final int v = 1001;
	private static final int w = 1002;
	private static final int x = 1003;
	private static final int y = 1004;
	private static final int z = 1005;
	private HashIndex<String, SecuritySystem.SecuritySystemButton> p;
	private HashIndex<String, SecuritySystem.SecuritySystemButton> q;
	private String r;
	private String s;
	private String t;

	public Device.DeviceType getType() {
		return Device.DeviceType.f;
	}

	public SecuritySystem.SecuritySystemButton a(int paramInt) {
		return null;
		// try
		// {
		// if (this.p != null);
		// for (SecuritySystem.SecuritySystemButton localSecuritySystemButton =
		// (SecuritySystem.SecuritySystemButton)this.p.a(paramInt); ;
		// localSecuritySystemButton = null)
		// return localSecuritySystemButton;
		// }
		// catch (Exception localObject)
		// {
		//
		// }
	}

	public SecuritySystem.SecuritySystemButton a(int paramInt,
			String paramString) {
		return null;
		// try
		// {
		// if (this.p != null)
		// localObject1 = paramInt + " - " + paramString;
		// for (Object localObject1 =
		// (SecuritySystem.SecuritySystemButton)this.p.a(localObject1); ;
		// localObject1 = null)
		// return localObject1;
		// }
		// catch (Exception localObject2)
		// {
		// while (true)
		// {
		// Ln.e(localException);
		// Object localObject2 = null;
		// }
		// }
	}

	public void a(Variable paramVariable, boolean paramBoolean) {
		// if (paramVariable == null);
		// label275:
		// while (true)
		// {
		// return;
		// try
		// {
		// Ln.a("Security System onVariableChanged: " + paramVariable +
		// ". value: " + paramVariable.c(), new Object[0]);
		// String str = paramVariable.c();
		// switch (paramVariable.b())
		// {
		// default:
		// super.a(paramVariable, paramBoolean);
		// case 1000:
		// case 1001:
		// case 1002:
		// case 1003:
		// case 1004:
		// case 1005:
		// }
		// }
		// catch (Exception localException)
		// {
		// Ln.e(localException);
		// }
		// continue;
		// if ((localException != null) && (BooleanUtil.a(localException)))
		// this.t = "HOME";
		// while (true)
		// {
		// if (this.j == null)
		// break label275;
		// this.j.a(this);
		// break;
		// if ((localException == null) || (!BooleanUtil.a(localException)))
		// continue;
		// this.t = "AWAY";
		// continue;
		// if ((localException == null) || (!BooleanUtil.a(localException)))
		// continue;
		// this.t = "DISARMED";
		// continue;
		// if ((localException == null) || (!BooleanUtil.a(localException)))
		// continue;
		// this.t = "ALARM";
		// continue;
		// Ln.a("Security System display text received in onVariableChanged: " +
		// localException, new Object[0]);
		// this.r = localException;
		// continue;
		// Ln.a("Security System trouble text received in onVariableChanged: " +
		// localException, new Object[0]);
		// this.s = localException;
		// }
		// }
	}

	protected void a(
			SecuritySystem.SecuritySystemButton paramSecuritySystemButton) {
		// if (paramSecuritySystemButton == null);
		// while (true)
		// {
		// return;
		// try
		// {
		// if (this.p == null)
		// this.p = new HashIndex();
		// String str = paramSecuritySystemButton.a() + " - " +
		// paramSecuritySystemButton.b();
		// if (this.p.a(str) != null)
		// this.p.c(str);
		// this.p.a(str, paramSecuritySystemButton);
		// }
		// catch (Exception localException)
		// {
		// Ln.e(localException);
		// }
		// }
	}

	public void a(String paramString1, String paramString2) {
		// if ((paramString1 == null) || (paramString2 == null));
		// while (true)
		// {
		// return;
		// try
		// {
		// if (!paramString1.equalsIgnoreCase("Full Capabilities"))
		// break label67;
		// SecuritySystem.CapabilitiesParser localCapabilitiesParser = new
		// SecuritySystem.CapabilitiesParser(this);
		// XmlPullParser localXmlPullParser =
		// XmlPullParserFactory.newInstance().newPullParser();
		// localXmlPullParser.setInput(new StringReader(paramString2));
		// localCapabilitiesParser.a(localXmlPullParser);
		// }
		// catch (Exception localException)
		// {
		// Ln.e(localException);
		// }
		// continue;
		// label67: super.a(paramString1, paramString2);
		// }
	}

	public SecuritySystem.SecuritySystemButton b(int paramInt) {
		return null;
		// try
		// {
		// if (this.q != null);
		// for (SecuritySystem.SecuritySystemButton localSecuritySystemButton =
		// (SecuritySystem.SecuritySystemButton)this.q.a(paramInt); ;
		// localSecuritySystemButton = null)
		// return localSecuritySystemButton;
		// }
		// catch (Exception localObject)
		// {
		// while (true)
		// {
		// Ln.e(localException);
		// Object localObject = null;
		// }
		// }
	}

	public SecuritySystem.SecuritySystemButton b(int paramInt,
			String paramString) {
		return null;
		// try
		// {
		// if (this.q != null)
		// localObject1 = paramInt + " - " + paramString;
		// for (Object localObject1 =
		// (SecuritySystem.SecuritySystemButton)this.q.a(localObject1); ;
		// localObject1 = null)
		// return localObject1;
		// }
		// catch (Exception localObject2)
		// {
		// while (true)
		// {
		// Ln.e(localException);
		// Object localObject2 = null;
		// }
		// }
	}

	public String b() {
		return this.r;
	}

	public void b(Variable paramVariable, boolean paramBoolean) {
		// if (paramVariable == null);
		// while (true)
		// {
		// return;
		// try
		// {
		// Ln.a("Security System onDataToUI: " + paramVariable, new Object[0]);
		// String str = paramVariable.f("armed");
		// if ((str != null) && (str.equalsIgnoreCase("DISARMED")))
		// this.t = "DISARMED";
		// if (this.j == null)
		// continue;
		// this.j.a(this);
		// }
		// catch (Exception localException)
		// {
		// Ln.e(localException);
		// }
		// }
	}

	protected void b(
			SecuritySystem.SecuritySystemButton paramSecuritySystemButton) {
		// if (paramSecuritySystemButton == null);
		// while (true)
		// {
		// return;
		// try
		// {
		// if (this.q == null)
		// this.q = new HashIndex();
		// String str = paramSecuritySystemButton.a() + " - " +
		// paramSecuritySystemButton.b();
		// if (this.q.a(str) != null)
		// this.q.c(str);
		// this.q.a(str, paramSecuritySystemButton);
		// }
		// catch (Exception localException)
		// {
		// Ln.e(localException);
		// }
		// }
	}

	public String c() {
		return this.s;
	}

	public String d() {
		return this.t;
	}

	public int e() {
		int i = 0;
		try {
			if (this.p != null) {
				i = this.p.c();
				i = i;
			}
			return i;
		} catch (Exception localException) {
			while (true)
				Ln.e(localException);
		}
	}

	public int f() {
		int j = 0;
		try {
			if (this.q != null) {
				int i = this.q.c();
				j = i;
			}
			return j;
		} catch (Exception localException) {
			while (true)
				Ln.e(localException);
		}
	}

	public void p() {
		super.p();
		g(1000);
		g(1001);
		g(1002);
		g(1003);
		g(1004);
		g(1005);
	}
}

/*
 * Location: E:\去哪儿\com.control4.myhome-2\classes_dex2jar.jar Qualified Name:
 * com.control4.director.device.SecuritySystem JD-Core Version: 0.6.0
 */