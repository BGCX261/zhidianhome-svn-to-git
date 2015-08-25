package com.zd.model.parser;

import org.xmlpull.v1.XmlPullParser;

public class IdentifyDeviceParser extends ResponseParser {
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
	}

	public void c(XmlPullParser paramXmlPullParser) {
		// Object localObject;
		// if (this.p != null)
		// {
		// localObject = this.p.b("listener");
		// if ((localObject == null) || (!(localObject instanceof
		// Director.OnIdentifyDeviceStatusListener)));
		// }
		// try
		// {
		// if ("failed".equalsIgnoreCase(this.a))
		// ((Director.OnIdentifyDeviceStatusListener)localObject).a(this.b);
		// while (true)
		// {
		// super.c(paramXmlPullParser);
		// return;
		// ((Director.OnIdentifyDeviceStatusListener)localObject).a();
		// this._director.N();
		// }
		// }
		// catch (Exception localException)
		// {
		// while (true)
		// Ln.e(localException, "device status listener failed", new Object[0]);
		// }
	}
}

/*
 * Location: E:\去哪儿\com.control4.myhome-2\classes_dex2jar.jar Qualified Name:
 * com.control4.director.parser.IdentifyDeviceParser JD-Core Version: 0.6.0
 */