package com.zd.model.parser;

import org.xmlpull.v1.XmlPullParser;

import roboguice.util.Ln;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.zd.model.director.video.DirectorMovieGenre;
import com.zd.model.director.video.DirectorVideoLibrary;

public class GetMovieGenresParser extends ResponseParser {

	@Inject
	private Provider<DirectorMovieGenre> _genreProvider;
	private DirectorMovieGenre a;
	private DirectorVideoLibrary b;

	public void a(String paramString, XmlPullParser paramXmlPullParser) {
		super.a(paramString, paramXmlPullParser);
		try {
			if (paramString.equalsIgnoreCase("genre")) {
				this.a = ((DirectorMovieGenre) this._genreProvider.get());
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
			this.b.g(false);
			this.b.h(false);
			super.c(paramXmlPullParser);
			return;
		} catch (Exception localException) {
			while (true)
				Ln.e(localException);
		}
	}
}

/*
 * Location: E:\去哪儿\com.control4.myhome-2\classes_dex2jar.jar Qualified Name:
 * com.control4.director.parser.GetMovieGenresParser JD-Core Version: 0.6.0
 */