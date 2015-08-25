package com.zd.model.parser;

import org.xmlpull.v1.XmlPullParser;

public class GetCommonNameParser extends ResponseParser {
	public void a(String paramString, XmlPullParser paramXmlPullParser) {
		super.a(paramString, paramXmlPullParser);
		if (paramString.equalsIgnoreCase("common_name"))
			b(true);
	}

	public void b(String paramString, XmlPullParser paramXmlPullParser) {
		if (paramString.equalsIgnoreCase("common_name"))
			this._director.g(j());
		super.b(paramString, paramXmlPullParser);
	}

	public void c(XmlPullParser paramXmlPullParser) {
		super.c(paramXmlPullParser);
		l();
	}
}

/*
 * Location: E:\去哪儿\com.control4.myhome-2\classes_dex2jar.jar Qualified Name:
 * com.control4.director.parser.GetCommonNameParser JD-Core Version: 0.6.0
 */