package com.zd.model.parser;

import org.xmlpull.v1.XmlPullParser;

import roboguice.util.Ln;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.zd.model.director.video.DirectorMovieDirector;
import com.zd.model.director.video.DirectorVideoLibrary;

public class GetMovieDirectorsParser extends ResponseParser {

	@Inject
	private Provider<DirectorMovieDirector> _directorProvider;
	private DirectorMovieDirector a;
	private DirectorVideoLibrary b;

	public void a(String paramString, XmlPullParser paramXmlPullParser) {
		super.a(paramString, paramXmlPullParser);
		try {
			if (paramString.equalsIgnoreCase("director")) {
				this.a = ((DirectorMovieDirector) this._directorProvider.get());
				b(true);
			}
			return;
		} catch (Exception localException) {
			while (true)
				Ln.e(localException);
		}
	}

	public void b(String paramString, XmlPullParser paramXmlPullParser) {
		//
	}

	public void b(XmlPullParser paramXmlPullParser) {
		super.b(paramXmlPullParser);

	}

	public void c(XmlPullParser paramXmlPullParser) {
		try {
			this.b.c(false);
			this.b.d(false);
			super.c(paramXmlPullParser);
			return;
		} catch (Exception localException) {

			Ln.e(localException);
		}
	}
}
