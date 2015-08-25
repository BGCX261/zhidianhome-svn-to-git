package com.zd.model.parser;

import org.xmlpull.v1.XmlPullParser;

import roboguice.util.Ln;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.zd.model.director.video.DirectorMovie;

public class GetMovieInfoParser extends ResponseParser {

	@Inject
	private Provider<DirectorMovie> _movieProvider;
	private DirectorMovie a = null;

	public void a(String paramString, XmlPullParser paramXmlPullParser) {
		super.a(paramString, paramXmlPullParser);
		try {
			if (paramString.equalsIgnoreCase("movie")) {
				this.a = ((DirectorMovie) this.p.b("movie"));
				if (this.a == null)
					this.a = ((DirectorMovie) this._movieProvider.get());
			}
			b(true);
			return;
		} catch (Exception localException) {
			while (true)
				Ln.e(localException);
		}
	}

	public void b(String paramString, XmlPullParser paramXmlPullParser) {

	}
}
