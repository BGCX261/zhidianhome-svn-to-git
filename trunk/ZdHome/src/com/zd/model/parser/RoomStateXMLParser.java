package com.zd.model.parser;

import org.xmlpull.v1.XmlPullParser;

public class RoomStateXMLParser extends ResponseParser {
	private String a = null;
	private boolean b;

	public String a() {
		return this.a;
	}

	public void a(String paramString, XmlPullParser paramXmlPullParser) {
		super.a(paramString, paramXmlPullParser);
		if (!paramString.equalsIgnoreCase("RoomHidden"))
			b(false);
		else
			b(true);
	}

	public void b(String paramString, XmlPullParser paramXmlPullParser) {
		// if (paramString.equalsIgnoreCase("RoomHidden"))
		// this.b = BooleanUtil.a(this.q.toString());
		// super.b(paramString, paramXmlPullParser);
	}

	public void b(XmlPullParser paramXmlPullParser) {
		super.b(paramXmlPullParser);
		this.b = false;
	}

	public void d(String paramString) {
		this.a = paramString;
	}

	public boolean m() {
		return this.b;
	}
}

/*
 * Location: E:\去哪儿\com.control4.myhome-2\classes_dex2jar.jar Qualified Name:
 * com.control4.director.parser.RoomStateXMLParser JD-Core Version: 0.6.0
 */