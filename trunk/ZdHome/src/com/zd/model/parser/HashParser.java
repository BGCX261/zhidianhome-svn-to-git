package com.zd.model.parser;

import java.util.HashMap;

import org.xmlpull.v1.XmlPullParser;

public class HashParser extends ResponseParser {
	private String a;
	private HashMap<String, String> b;

	public HashMap<String, String> a() {
		return this.b;
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
		// this.r = true;
		// b(paramXmlPullParser);
		// int i = paramXmlPullParser.getEventType();
		// if (i == 1)
		// break label136;
		// if (i == 2)
		// {
		// String str1 = paramXmlPullParser.getName();
		// if (this.a != null)
		// continue;
		// this.a = str1;
		// a(str1, paramXmlPullParser);
		// int j = paramXmlPullParser.next();
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
		// String str2;
		// if (localXmlPullParserException == 3)
		// {
		// str2 = paramXmlPullParser.getName();
		// b(str2, paramXmlPullParser);
		// if ((!str2.equalsIgnoreCase("c4soap")) && (!str2.equals(this.a)))
		// continue;
		// label136: c(paramXmlPullParser);
		// continue;
		// }
		// if (str2 != 4)
		// continue;
		// d(paramXmlPullParser);
		// }
	}

	public void b(String paramString, XmlPullParser paramXmlPullParser) {
		String str = j();
		if (str != null)
			this.b.put(paramString, str);
		super.b(paramString, paramXmlPullParser);
	}

	public void b(XmlPullParser paramXmlPullParser) {
		super.b(paramXmlPullParser);
		this.b = new HashMap();
		this.a = null;
	}
}

/*
 * Location: E:\去哪儿\com.control4.myhome-2\classes_dex2jar.jar Qualified Name:
 * com.control4.director.parser.HashParser JD-Core Version: 0.6.0
 */