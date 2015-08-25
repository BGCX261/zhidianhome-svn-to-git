package com.zd.model.parser;

import org.xmlpull.v1.XmlPullParser;

import roboguice.util.Ln;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.zd.model.director.video.DirectorMovieActor;
import com.zd.model.director.video.DirectorVideoLibrary;

public class GetMovieActorsParser extends ResponseParser {

	@Inject
	private Provider<DirectorMovieActor> _actorProvider;
	private DirectorMovieActor a;
	private DirectorVideoLibrary b;

	public void a(String paramString, XmlPullParser paramXmlPullParser) {
		super.a(paramString, paramXmlPullParser);
		try {
			if (paramString.equalsIgnoreCase("actor")) {
				this.a = ((DirectorMovieActor) this._actorProvider.get());
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
		// try
		// {
		// this.a = null;
		// if (this.p != null)
		// this.b = ((DirectorVideoLibrary)this.p.b("video-library"));
		// if ((this.b == null) && (this.p != null) && ((this.p instanceof
		// RoomCommand)))
		// {
		// Object localObject = (RoomCommand)this.p;
		// localObject = this._director.m().h(((RoomCommand)localObject).e());
		// if (localObject != null)
		// this.b = ((DirectorVideoLibrary)((Room)localObject).av());
		// }
		// return;
		// }
		// catch (Exception localException)
		// {
		//
		// Ln.e(localException);
		// }
	}

	public void c(XmlPullParser paramXmlPullParser) {
		try {
			this.b.a(false);
			this.b.b(false);
			super.c(paramXmlPullParser);
			return;
		} catch (Exception localException) {
			Ln.e(localException);
		}
	}
}
