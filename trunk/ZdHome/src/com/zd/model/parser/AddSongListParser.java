package com.zd.model.parser;

import org.xmlpull.v1.XmlPullParser;

public class AddSongListParser extends ResponseParser {
	public void a(String paramString, XmlPullParser paramXmlPullParser) {
		super.a(paramString, paramXmlPullParser);
		if (paramString.equalsIgnoreCase("queueid"))
			b(true);
	}

	public void b(String paramString, XmlPullParser paramXmlPullParser) {
		// try
		// {
		// if (paramString.equalsIgnoreCase("queueid"))
		// {
		// Room localRoom = this._director.m().s();
		// DirectorDigitalAudio localDirectorDigitalAudio =
		// (DirectorDigitalAudio)localRoom.as();
		// if (localDirectorDigitalAudio != null)
		// {
		// localDirectorDigitalAudio.a(Integer.parseInt(this.q.toString()),
		// localRoom.a());
		// localDirectorDigitalAudio.c();
		// }
		// }
		// super.b(paramString, paramXmlPullParser);
		// return;
		// }
		// catch (Exception localException)
		// {
		// while (true)
		// Ln.e(localException);
		// }
	}
}
