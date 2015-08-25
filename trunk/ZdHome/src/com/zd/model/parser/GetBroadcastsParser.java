package com.zd.model.parser;

import org.xmlpull.v1.XmlPullParser;

import roboguice.util.Ln;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.zd.model.director.broadcast.DirectorBroadcast;
import com.zd.model.director.broadcast.DirectorBroadcastCollection;

public class GetBroadcastsParser extends ResponseParser {

	@Inject
	private Provider<DirectorBroadcast> _broadcastProvider;
	private DirectorBroadcast a;
	private DirectorBroadcastCollection b;

	public void a(String paramString, XmlPullParser paramXmlPullParser) {
		super.a(paramString, paramXmlPullParser);
		// try
		// {
		// if (paramString.equalsIgnoreCase("broadcast"))
		// this.a = ((DirectorBroadcast)this._broadcastProvider.a());
		// b(true);
		// return;
		// }
		// catch (Exception localException)
		// {
		// while (true)
		// Ln.e(localException);
		// }
	}

	public void b(String paramString, XmlPullParser paramXmlPullParser) {
		// try
		// {
		// if (paramString.equalsIgnoreCase("broadcast"))
		// if (this.a != null)
		// {
		// if (this.b != null)
		// this.b.a(this.a);
		// this.a = null;
		// }
		// while (true)
		// {
		// super.b(paramString, paramXmlPullParser);
		// return;
		// if (!paramString.equalsIgnoreCase("id"))
		// break;
		// if (this.a == null)
		// continue;
		// this.a.l(j());
		// }
		// }
		// catch (Exception localException)
		// {
		// while (true)
		// {
		// Ln.e(localException);
		// continue;
		// if (paramString.equalsIgnoreCase("name"))
		// {
		// if (this.a == null)
		// continue;
		// this.a.a(j());
		// if (this.a.au() != null)
		// continue;
		// this.a.m(j());
		// continue;
		// }
		// if (paramString.equalsIgnoreCase("title"))
		// {
		// if (this.a == null)
		// continue;
		// this.a.m(j());
		// continue;
		// }
		// if (paramString.equalsIgnoreCase("audio_only"))
		// {
		// if (this.a == null)
		// continue;
		// this.a.c(BooleanUtil.a(j()));
		// continue;
		// }
		// if (paramString.equalsIgnoreCase("device_id"))
		// {
		// if (this.a == null)
		// continue;
		// this.a.a(IntegerUtil.a(j()));
		// continue;
		// }
		// if (paramString.equalsIgnoreCase("location"))
		// {
		// if (this.a == null)
		// continue;
		// this.a.f(j());
		// continue;
		// }
		// if (paramString.equalsIgnoreCase("img"))
		// {
		// if (this.a == null)
		// continue;
		// this.a.n(j());
		// continue;
		// }
		// if (paramString.equalsIgnoreCase("rating"))
		// {
		// if (this.a == null)
		// continue;
		// this.a.c(j());
		// continue;
		// }
		// if (paramString.equalsIgnoreCase("genre"))
		// {
		// if (this.a == null)
		// continue;
		// this.a.b(j());
		// continue;
		// }
		// if (paramString.equalsIgnoreCase("format"))
		// {
		// if (this.a == null)
		// continue;
		// this.a.d(j());
		// continue;
		// }
		// if ((!paramString.equalsIgnoreCase("description")) || (this.a ==
		// null))
		// continue;
		// this.a.e(j());
		// }
		// }
	}

	public void b(XmlPullParser paramXmlPullParser) {
		super.b(paramXmlPullParser);
		try {
			this.a = null;
			this.b = ((DirectorBroadcastCollection) this.p
					.b("broadcast-library"));
			return;
		} catch (Exception localException) {
			while (true)
				Ln.e(localException);
		}
	}

	public void c(XmlPullParser paramXmlPullParser) {
		try {
			if (this.b != null) {
				this.b.b(false);
				this.b.a(false);
			}
			super.c(paramXmlPullParser);
			return;
		} catch (Exception localException) {
			while (true)
				Ln.e(localException);
		}
	}
}
