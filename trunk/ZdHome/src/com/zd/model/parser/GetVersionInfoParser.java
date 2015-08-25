package com.zd.model.parser;

import org.xmlpull.v1.XmlPullParser;

import roboguice.util.Ln;

public class GetVersionInfoParser extends ResponseParser {
	private static final String a = "version";

	public void a(String paramString, XmlPullParser paramXmlPullParser) {
		try {
			super.a(paramString, paramXmlPullParser);
			if ((paramString.equalsIgnoreCase("version")) && (this.n == 1)) {
				String str1 = paramXmlPullParser
						.getAttributeValue(null, "name");
				String str3 = paramXmlPullParser.getAttributeValue(null,
						"version");
				String str2 = paramXmlPullParser.getAttributeValue(null,
						"buildtime");
				String str4 = paramXmlPullParser.getAttributeValue(null,
						"builddate");
				if ((str1 != null) && (str1.equalsIgnoreCase("Director"))) {
					this._director.a(str3);
					this._director.b(str4 + " " + str2);
				} else if ((str1 != null)
						&& (str1.equalsIgnoreCase("MediaManager"))) {
					this._director.c(str3);
					this._director.d(str4 + " " + str2);
				}
			}
		} catch (Exception localException) {
			Ln.e(localException);
		}
	}

	public void c(XmlPullParser paramXmlPullParser) {

	}
}

/*
 * Location: E:\去哪儿\com.control4.myhome-2\classes_dex2jar.jar Qualified Name:
 * com.control4.director.parser.GetVersionInfoParser JD-Core Version: 0.6.0
 */