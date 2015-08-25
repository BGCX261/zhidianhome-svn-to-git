package com.zd.model.parser;

import org.xmlpull.v1.XmlPullParser;

public class AuthenticateDeviceParser extends ResponseParser {
	private String a;
	private String b;

	public void a(String paramString, XmlPullParser paramXmlPullParser) {
		super.a(paramString, paramXmlPullParser);
		if (!paramString.equalsIgnoreCase("result")) {
			if (paramString.equalsIgnoreCase("error"))
				b(true);
		} else
			b(true);
	}

	public void b(String paramString, XmlPullParser paramXmlPullParser) {
		if (!paramString.equalsIgnoreCase("result")) {
			if (paramString.equalsIgnoreCase("error"))
				this.b = this.q.toString();
		} else
			this.a = this.q.toString();
		super.b(paramString, paramXmlPullParser);
	}

	public void c(XmlPullParser paramXmlPullParser) {
		// Object localObject;
		// if (this.p != null)
		// {
		// localObject = this.p.b("listener");
		// if ((localObject == null) || (!(localObject instanceof
		// Director.OnAuthenticateDeviceStatusListener)));
		// }
		// try
		// {
		// if ("failed".equalsIgnoreCase(this.a))
		// ((Director.OnAuthenticateDeviceStatusListener)localObject).a(this.b);
		// while (true)
		// {
		// super.c(paramXmlPullParser);
		// return;
		// ((Director.OnAuthenticateDeviceStatusListener)localObject).a();
		// }
		// }
		// catch (Exception localException)
		// {
		// while (true)
		// Ln.e(localException, "device status listener failed", new Object[0]);
		// }
	}
}
