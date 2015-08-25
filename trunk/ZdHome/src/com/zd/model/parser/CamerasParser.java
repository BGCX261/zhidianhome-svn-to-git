package com.zd.model.parser;

import org.xmlpull.v1.XmlPullParser;

import roboguice.util.Ln;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.zd.model.DirectorRoom;
import com.zd.model.device.DirectorWebCam;

public class CamerasParser extends ResponseParser {

	@Inject
	private Provider<DirectorWebCam> _cameraProvider;
	DirectorRoom a;
	DirectorWebCam b;

	public DirectorRoom a() {
		return this.a;
	}

	public void a(DirectorRoom paramDirectorRoom) {
		this.a = paramDirectorRoom;
	}

	public void a(String paramString, XmlPullParser paramXmlPullParser) {
		super.a(paramString, paramXmlPullParser);
		try {
			if (paramString.equalsIgnoreCase("camera"))
				this.b = ((DirectorWebCam) this._cameraProvider.get());
			b(true);
			return;
		} catch (Exception localException) {
			while (true)
				Ln.e(localException);
		}
	}

	public void a(XmlPullParser paramXmlPullParser) {
		// while (true)
		// {
		// try
		// {
		// if (this.q != null)
		// continue;
		// this.q = new StringBuilder();
		// this.r = false;
		// b(paramXmlPullParser);
		// int i = paramXmlPullParser.getEventType();
		// if (i == 1)
		// break label120;
		// if (i == 2)
		// {
		// a(paramXmlPullParser.getName(), paramXmlPullParser);
		// i = paramXmlPullParser.next();
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
		// String str;
		// if (localXmlPullParserException == 3)
		// {
		// str = paramXmlPullParser.getName();
		// b(str, paramXmlPullParser);
		// if ((!str.equalsIgnoreCase("c4soap")) &&
		// (!str.equalsIgnoreCase("Cameras")))
		// continue;
		// label120: c(paramXmlPullParser);
		// continue;
		// }
		// if (str != 4)
		// continue;
		// d(paramXmlPullParser);
		// }
	}

	public void b(String paramString, XmlPullParser paramXmlPullParser) {
		// try
		// {
		// if (paramString.equalsIgnoreCase("camera"))
		// if (this.b != null)
		// {
		// this._director.m().a(this.b, this._director.p());
		// if (this.a != null)
		// this.a.a(this.b);
		// }
		// while (true)
		// {
		// super.b(paramString, paramXmlPullParser);
		// return;
		// if (!paramString.equalsIgnoreCase("deviceId"))
		// break;
		// if (this.b == null)
		// continue;
		// this.b.d(IntegerUtil.a(j()));
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
		// if (this.b == null)
		// continue;
		// this.b.g(j());
		// continue;
		// }
		// if (paramString.equalsIgnoreCase("URL"))
		// {
		// if (this.b == null)
		// continue;
		// this.b.f(j());
		// continue;
		// }
		// if (paramString.equalsIgnoreCase("GET_MJPEG"))
		// {
		// if (this.b == null)
		// continue;
		// this.b.b(j());
		// continue;
		// }
		// if (paramString.equalsIgnoreCase("GET_IMAGE"))
		// {
		// if (this.b == null)
		// continue;
		// this.b.a(j());
		// continue;
		// }
		// if (paramString.equalsIgnoreCase("Hostname"))
		// {
		// if (this.b == null)
		// continue;
		// this.b.e(j());
		// continue;
		// }
		// if (paramString.equalsIgnoreCase("Port"))
		// {
		// if (this.b == null)
		// continue;
		// this.b.b(IntegerUtil.a(j()));
		// continue;
		// }
		// if ((!paramString.equalsIgnoreCase("Refresh")) || (this.b == null))
		// continue;
		// this.b.a(IntegerUtil.a(j()));
		// }
		// }
	}

	public void b(XmlPullParser paramXmlPullParser) {
		super.b(paramXmlPullParser);
		this.b = null;
	}

	public void c(XmlPullParser paramXmlPullParser) {
		super.c(paramXmlPullParser);
	}
}

/*
 * Location: E:\去哪儿\com.control4.myhome-2\classes_dex2jar.jar Qualified Name:
 * com.control4.director.parser.CamerasParser JD-Core Version: 0.6.0
 */