package com.zd.model.parser;

import org.xmlpull.v1.XmlPullParser;

import com.zd.model.device.Thermostat;

public class ThermostatSettingsParser extends ResponseParser {
	protected Thermostat a;

	public void a(Thermostat paramThermostat) {
		this.a = paramThermostat;
	}

	public void a(String paramString, XmlPullParser paramXmlPullParser) {
		super.a(paramString, paramXmlPullParser);
		b(true);
	}

	public void a(XmlPullParser paramXmlPullParser) {
		// while (true)
		// {
		// try
		// {
		// if (this.q != null)
		// continue;
		// this.q = new StringBuilder();
		// this.r = false;
		// b(paramXmlPullParser);
		// int i = paramXmlPullParser.getEventType();
		// if (i == 1)
		// break label120;
		// if (i == 2)
		// {
		// a(paramXmlPullParser.getName(), paramXmlPullParser);
		// i = paramXmlPullParser.next();
		// continue;
		// this.q.setLength(0);
		// continue;
		// }
		// }
		// catch (XmlPullParserException localXmlPullParserException)
		// {
		// Ln.e(localXmlPullParserException);
		// return;
		// }
		// String str;
		// if (localXmlPullParserException == 3)
		// {
		// str = paramXmlPullParser.getName();
		// b(str, paramXmlPullParser);
		// if ((!str.equalsIgnoreCase("c4soap")) &&
		// (!str.equalsIgnoreCase("settings")))
		// continue;
		// label120: c(paramXmlPullParser);
		// continue;
		// }
		// if (str != 4)
		// continue;
		// d(paramXmlPullParser);
		// }
	}

	public void b(String paramString, XmlPullParser paramXmlPullParser) {
		// try
		// {
		// if (this.a == null)
		// Ln.e("No thermostat!", new Object[0]);
		// else if (this.q.toString().length() != 0)
		// if (paramString.equalsIgnoreCase("hvacmode"))
		// {
		// String str1 = this.q.toString();
		// if (str1.equalsIgnoreCase("COOL"))
		// this.a.a(1);
		// while (true)
		// {
		// super.b(paramString, paramXmlPullParser);
		// return;
		// if (!str1.equalsIgnoreCase("OFF"))
		// break;
		// this.a.a(3);
		// }
		// }
		// }
		// catch (Exception str2)
		// {
		// while (true)
		// {
		// Ln.e(localException);
		// continue;
		// if (localException.equalsIgnoreCase("HEAT"))
		// {
		// this.a.a(2);
		// continue;
		// }
		// if ((!localException.equalsIgnoreCase("AUTO")) &&
		// (!localException.equalsIgnoreCase("AUTOCOOL")) &&
		// (!localException.equalsIgnoreCase("AUTOHEAT")))
		// continue;
		// this.a.a(0);
		// continue;
		// String str2;
		// if (paramString.equalsIgnoreCase("fanmode"))
		// {
		// str2 = this.q.toString();
		// this.a.a(str2);
		// continue;
		// }
		// if (paramString.equalsIgnoreCase("holdmode"))
		// {
		// str2 = this.q.toString();
		// this.a.b(str2);
		// continue;
		// }
		// if (paramString.equalsIgnoreCase("cool_setpoint"))
		// {
		// this.a.c(Integer.parseInt(this.q.toString()));
		// continue;
		// }
		// if (paramString.equalsIgnoreCase("heat_setpoint"))
		// {
		// this.a.h(Integer.parseInt(this.q.toString()));
		// continue;
		// }
		// if (paramString.equalsIgnoreCase("scale"))
		// {
		// this.a.c(this.q.toString());
		// continue;
		// }
		// if (!paramString.equalsIgnoreCase("temperature"))
		// continue;
		// this.a.b(Integer.parseInt(this.q.toString()));
		// }
		// }
	}

	public void b(XmlPullParser paramXmlPullParser) {
		super.b(paramXmlPullParser);
		b(true);
	}
}

/*
 * Location: E:\去哪儿\com.control4.myhome-2\classes_dex2jar.jar Qualified Name:
 * com.control4.director.parser.ThermostatSettingsParser JD-Core Version: 0.6.0
 */