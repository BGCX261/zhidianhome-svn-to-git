package com.zd.model.parser;

import org.xmlpull.v1.XmlPullParser;

import roboguice.util.Ln;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.zd.model.director.video.DirectorMovieRating;
import com.zd.model.director.video.DirectorVideoLibrary;

public class GetMovieRatingsParser extends ResponseParser {

	@Inject
	private Provider<DirectorMovieRating> _ratingProvider;
	private DirectorMovieRating a;
	private DirectorVideoLibrary b;

	public void a(String paramString, XmlPullParser paramXmlPullParser) {
		super.a(paramString, paramXmlPullParser);
		try {
			if (paramString.equalsIgnoreCase("rating")) {
				this.a = ((DirectorMovieRating) this._ratingProvider.get());
				b(true);
			}
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

	}

	public void c(XmlPullParser paramXmlPullParser) {
		try {
			this.b.i(false);
			this.b.j(false);
			super.c(paramXmlPullParser);
		} catch (Exception localException) {
			Ln.e(localException);
		}
	}
}
