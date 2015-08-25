package com.zd.model.parser;

import org.xmlpull.v1.XmlPullParser;

import roboguice.util.Ln;

import com.zd.model.device.DirectorWakeupControls;
import com.zd.model.device.WakeupControls;

public class GetWakeupScenesParser extends ResponseParser {
	private WakeupControls.WakeupScene a;

	private DirectorWakeupControls a() {
		return (DirectorWakeupControls) this._director.m().w();
	}

	public void a(String paramString, XmlPullParser paramXmlPullParser) {
		super.a(paramString, paramXmlPullParser);
		try {
			if (paramString.equalsIgnoreCase("scenario"))
				this.a = new WakeupControls.WakeupScene();
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
		this.a = null;
	}

	public void c(XmlPullParser paramXmlPullParser) {
		try {
			DirectorWakeupControls localDirectorWakeupControls = a();
			localDirectorWakeupControls.a(false);
			localDirectorWakeupControls.b(false);
			super.c(paramXmlPullParser);
			return;
		} catch (Exception localException) {
			Ln.e(localException);
		}
	}
}

/*
 * Location: E:\去哪儿\com.control4.myhome-2\classes_dex2jar.jar Qualified Name:
 * com.control4.director.parser.GetWakeupScenesParser JD-Core Version: 0.6.0
 */