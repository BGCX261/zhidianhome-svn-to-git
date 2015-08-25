package com.zd.model.parser;

import org.xmlpull.v1.XmlPullParser;

import roboguice.util.Ln;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.zd.model.audio.DirectorSong;

public class GetTracksParser extends ResponseParser {

	@Inject
	private Provider<DirectorSong> _songProvider;
	private DirectorSong a;

	public void a(String paramString, XmlPullParser paramXmlPullParser) {
		super.a(paramString, paramXmlPullParser);
		try {
			if (paramString.equalsIgnoreCase("track"))
				this.a = ((DirectorSong) this._songProvider.get());
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

	}
}
