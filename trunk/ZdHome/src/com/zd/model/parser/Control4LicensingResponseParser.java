package com.zd.model.parser;

import org.xmlpull.v1.XmlPullParser;

import roboguice.util.Ln;

import com.zd.model.Control4Director;
import com.zd.model.Director;

public class Control4LicensingResponseParser {
	protected int a = 0;
	protected StringBuilder b;
	protected boolean c;
	protected StringBuilder d;
	protected Control4Director e;
	private boolean f;
	private boolean g;
	private boolean h;
	private String i;
	private String j;
	private String k;

	public Director a() {
		return this.e;
	}

	public void a(int paramInt) {
		this.a = paramInt;
	}

	public void a(Control4Director paramControl4Director) {
		this.e = paramControl4Director;
	}

	public void a(String paramString, XmlPullParser paramXmlPullParser) {
		// b(true);
		// if (!paramString.equalsIgnoreCase("soap:Fault"))
		// {
		// if (!paramString.equalsIgnoreCase("soap:Reason"))
		// {
		// if (paramString.equalsIgnoreCase("soap:Text"))
		// b(true);
		// }
		// else
		// {
		// b(true);
		// this.h = true;
		// }
		// }
		// else
		// {
		// b(true);
		// this.g = true;
		// }
		// StringBuilder localStringBuilder;
		// int m;
		// if ((this.f) && (this.d != null))
		// {
		// localStringBuilder = new StringBuilder("<");
		// localStringBuilder.append(paramString);
		// m = paramXmlPullParser.getAttributeCount();
		// }
		// for (int n = 0; ; n++)
		// {
		// if (n >= m)
		// {
		// localStringBuilder.append(">");
		// this.d.append(localStringBuilder.toString());
		// return;
		// }
		// localStringBuilder.append(" ");
		// localStringBuilder.append(paramXmlPullParser.getAttributeName(n));
		// localStringBuilder.append("= \"");
		// localStringBuilder.append(paramXmlPullParser.getAttributeValue(n));
		// localStringBuilder.append("\"");
		// }
	}

	// ERROR //
	public void a(XmlPullParser paramXmlPullParser) {

	}

	public void a(boolean paramBoolean) {
		this.f = paramBoolean;
	}

	public int b() {
		return this.a;
	}

	public void b(String paramString, XmlPullParser paramXmlPullParser) {
		// try
		// {
		// if (paramString.equalsIgnoreCase("soap:Fault"))
		// {
		// this.a = -1;
		// this.k = c();
		// this.g = false;
		// }
		// while (true)
		// {
		// if ((this.f) && (this.d != null))
		// {
		// this.d.append("</");
		// this.d.append(paramString);
		// this.d.append(">");
		// }
		// this.b.setLength(0);
		// return;
		// if (!paramString.equalsIgnoreCase("soap:Reason"))
		// break;
		// this.h = false;
		// }
		// }
		// catch (Exception localException)
		// {
		// while (true)
		// {
		// Ln.e(localException);
		// break;
		// if ((!paramString.equalsIgnoreCase("soap:Text")) || (!this.g) ||
		// (!this.h))
		// continue;
		// this.j = c();
		// }
		// }
	}

	public void b(XmlPullParser paramXmlPullParser) {
		if (this.b != null)
			this.b.setLength(0);
		else
			this.b = new StringBuilder();
		this.c = false;
		if (this.f)
			this.d = new StringBuilder();
		this.g = false;
		this.h = false;
		this.i = null;
		this.j = null;
		this.k = null;
		this.a = 0;
	}

	protected void b(boolean paramBoolean) {
		this.c = paramBoolean;
		this.b.setLength(0);
	}

	protected String c() {
		String str;
		if ((this.b == null) || (this.b.length() <= 0))
			str = null;
		else
			str = this.b.toString();
		return str;
	}

	public void c(XmlPullParser paramXmlPullParser) {
		// if ((this.f) && (this.d != null) && (this.d.length() > 0))
		// Ln.a("Control4 Licensing Response: " + this.d.toString(), new
		// Object[0]);
	}

	public String d() {
		return this.j;
	}

	public void d(XmlPullParser paramXmlPullParser) {
		String str = null;
		try {
			if (this.c) {
				str = paramXmlPullParser.getText();
				this.b.append(str);
			}
			if ((this.f) && (this.d != null)) {
				if (str == null)
					str = paramXmlPullParser.getText();
				if (str != null)
					this.d.append(str);
			}
			return;
		} catch (Exception localException) {
			while (true)
				Ln.e(localException);
		}
	}
}

/*
 * Location: E:\去哪儿\com.control4.myhome-2\classes_dex2jar.jar Qualified Name:
 * com.control4.director.parser.Control4LicensingResponseParser JD-Core Version:
 * 0.6.0
 */