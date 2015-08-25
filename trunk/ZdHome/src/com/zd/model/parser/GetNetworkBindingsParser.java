package com.zd.model.parser;

import org.xmlpull.v1.XmlPullParser;

public class GetNetworkBindingsParser extends ResponseParser {
	public class NetworkBinding {
		protected String a;
		protected String b;

		public NetworkBinding(
				GetNetworkBindingsParser paramGetNetworkBindingsParser) {
		}
	}

	protected GetNetworkBindingsParser.NetworkBinding a;
	protected GetNetworkBindingsParser.NetworkBinding b;

	public void a(String paramString, XmlPullParser paramXmlPullParser) {
		super.a(paramString, paramXmlPullParser);
		if (paramString.equalsIgnoreCase("networkbinding"))
			this.a = new GetNetworkBindingsParser.NetworkBinding(this);
		b(true);
	}

	public void b(String paramString, XmlPullParser paramXmlPullParser) {
		if (!paramString.equalsIgnoreCase("networkbinding")) {
			if (!paramString.equalsIgnoreCase("addr")) {
				if ((paramString.equalsIgnoreCase("uuid")) && (this.a != null)
						&& (this.q != null))
					this.a.b = this.q.toString();
			} else if ((this.a != null) && (this.q != null))
				this.a.a = this.q.toString();
		} else {
			if ((this.a != null) && (this.a.a != null)
					&& (this.a.a.equals("127.0.0.1")))
				this.b = this.a;
			this.a = null;
		}
		super.b(paramString, paramXmlPullParser);
	}

	public void b(XmlPullParser paramXmlPullParser) {
		super.b(paramXmlPullParser);
		this.b = null;
		this.a = null;
	}

	public void c(XmlPullParser paramXmlPullParser) {
		if ((this.b != null) && (this._director != null))
			this._director.f(this.b.b);
		super.c(paramXmlPullParser);
	}
}
