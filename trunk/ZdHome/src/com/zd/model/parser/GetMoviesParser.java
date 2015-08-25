package com.zd.model.parser;

import java.util.ArrayList;

import org.xmlpull.v1.XmlPullParser;

import roboguice.util.Ln;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.zd.model.director.video.DirectorMovie;
import com.zd.model.director.video.DirectorVideoLibrary;

public class GetMoviesParser extends ResponseParser {

	@Inject
	private Provider<DirectorMovie> _movieProvider;
	private DirectorVideoLibrary a;
	private DirectorMovie b;
	private ArrayList<DirectorMovie> c;
	private boolean d;

	// private final Runnable e = new GetMoviesParser.1(this);

	public void a(String paramString, XmlPullParser paramXmlPullParser) {
		super.a(paramString, paramXmlPullParser);
		try {
			if (paramString.equalsIgnoreCase("movie"))
				this.b = ((DirectorMovie) this._movieProvider.get());
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

	}

	public void c(XmlPullParser paramXmlPullParser) {

	}
}

/*
 * Location: E:\去哪儿\com.control4.myhome-2\classes_dex2jar.jar Qualified Name:
 * com.control4.director.parser.GetMoviesParser JD-Core Version: 0.6.0
 */