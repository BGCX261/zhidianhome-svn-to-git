package com.zd.model.parser;

import org.xmlpull.v1.XmlPullParser;

import roboguice.util.Ln;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.zd.model.audio.DirectorAudioLibrary;
import com.zd.model.audio.DirectorGenre;

public class GetGenresParser extends ResponseParser {

	@Inject
	private Provider<DirectorGenre> _genreProvider;
	private DirectorAudioLibrary a;

	public void a(String paramString, XmlPullParser paramXmlPullParser) {
		super.a(paramString, paramXmlPullParser);
		try {
			if (paramString.equalsIgnoreCase("genre"))
				b(true);
			return;
		} catch (Exception localException) {
			while (true)
				Ln.e(localException);
		}
	}

	public void b(String paramString, XmlPullParser paramXmlPullParser) {
		// try
		// {
		// if ((paramString.equalsIgnoreCase("genre")) && (this.q != null))
		// {
		// String str = this.q.toString();
		// if (str == null)
		// break label108;
		// if (str.length() != 0)
		// break label103;
		// break label108;
		// if ((DirectorGenre)this.a.e(str) == null)
		// {
		// DirectorGenre localDirectorGenre =
		// (DirectorGenre)this._genreProvider.a();
		// localDirectorGenre.l(str);
		// localDirectorGenre.m(str);
		// this.a.a(localDirectorGenre);
		// }
		// }
		// super.b(paramString, paramXmlPullParser);
		// return;
		// }
		// catch (Exception localObject)
		// {
		// while (true)
		// {
		// Ln.e(localException);
		// continue;
		// label103: Object localObject = localException;
		// continue;
		// label108: localObject = "(Empty)";
		// }
		// }
	}

	public void b(XmlPullParser paramXmlPullParser) {
		super.b(paramXmlPullParser);
		// try
		// {
		// this.a = ((DirectorAudioLibrary)this.p.b("audio-library"));
		// if (this.a == null)
		// this.a = ((DirectorAudioLibrary)this._director.m().s().at());
		// return;
		// }
		// catch (Exception localException)
		// {
		// while (true)
		// Ln.e(localException);
		// }
	}

	public void c(XmlPullParser paramXmlPullParser) {
		// try
		// {
		// this.a.i(false);
		// this.a.j(false);
		// Object localObject = this.p.b("listener");
		// if ((localObject != null) && ((localObject instanceof
		// AudioLibrary.OnGenresUpdateListener)))
		// ((AudioLibrary.OnGenresUpdateListener)localObject).a(this.a);
		// super.c(paramXmlPullParser);
		// return;
		// }
		// catch (Exception localException)
		// {
		//
		// Ln.e(localException);
		// }
	}
}

/*
 * Location: E:\去哪儿\com.control4.myhome-2\classes_dex2jar.jar Qualified Name:
 * com.control4.director.parser.GetGenresParser JD-Core Version: 0.6.0
 */