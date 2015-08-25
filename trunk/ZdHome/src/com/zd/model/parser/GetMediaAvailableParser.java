package com.zd.model.parser;

import org.xmlpull.v1.XmlPullParser;

import roboguice.util.Ln;

public class GetMediaAvailableParser extends ResponseParser {
	private static final String b = "GetMediaAvailableParser";
	int a;
	private boolean c;
	private boolean d;
	private boolean e;
	private boolean f;
	private boolean g;
	private int h;
	private int i;
	private int j;
	private int k;
	private int u;
	private String v;
	private String w;

	public void a(String paramString, XmlPullParser paramXmlPullParser) {
		try {
			super.a(paramString, paramXmlPullParser);
			if ((paramString.equalsIgnoreCase("type"))
					|| (paramString.equalsIgnoreCase("count"))
					|| (paramString.equalsIgnoreCase("mp3")))
				b(true);
			return;
		} catch (Exception localException) {
			while (true)
				Ln.e(localException);
		}
	}

	public void b(String paramString, XmlPullParser paramXmlPullParser) {

	}

	public void b(XmlPullParser paramXmlPullParser) {
		super.b(paramXmlPullParser);
		this.g = false;
		this.f = false;
		this.e = false;
		this.d = false;
		this.c = false;
		this.u = 0;
		this.k = 0;
		this.j = 0;
		this.i = 0;
		this.h = 0;
		this.w = null;
		this.v = null;
		this.a = 0;
	}

	public void c(XmlPullParser paramXmlPullParser) {

	}
}
