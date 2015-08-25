package com.zd.model.parser;

import org.xmlpull.v1.XmlPullParser;

import roboguice.util.Ln;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.zd.model.audio.DirectorArtist;
import com.zd.model.audio.DirectorAudioLibrary;

public class GetArtistsParser extends ResponseParser {

	@Inject
	private Provider<DirectorArtist> _artistProvider;
	private DirectorAudioLibrary a;

	public void a(String paramString, XmlPullParser paramXmlPullParser) {
		super.a(paramString, paramXmlPullParser);
		try {
			if (paramString.equalsIgnoreCase("artist"))
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
		// if (paramString.equalsIgnoreCase("artist"))
		// {
		// String str = this.q.toString();
		// if (str == null)
		// break label171;
		// if (str.length() != 0)
		// break label166;
		// break label171;
		// localObject2 = (DirectorGenre)this.p.b("genre");
		// if (localObject2 != null)
		// break label159;
		// localObject2 = (String)this.p.b("genreId");
		// localObject2 = (DirectorGenre)this.a.e((String)localObject2);
		// DirectorArtist localDirectorArtist = (DirectorArtist)this.a.b(str);
		// if (localDirectorArtist == null)
		// {
		// localDirectorArtist = (DirectorArtist)this._artistProvider.a();
		// localDirectorArtist.m(str);
		// localDirectorArtist.l(str);
		// this.a.a(localDirectorArtist);
		// }
		// if (localObject2 != null)
		// ((DirectorGenre)localObject2).a(localDirectorArtist);
		// }
		// super.b(paramString, paramXmlPullParser);
		// return;
		// }
		// catch (Exception localObject1)
		// {
		// while (true)
		// {
		// Ln.e(localException);
		// continue;
		// label159: Object localObject2 = localObject2;
		// continue;
		// label166: Object localObject1 = localException;
		// continue;
		// label171: localObject1 = "(Empty)";
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
		// Object localObject1 = this.p.b("listener");
		// localObject2 = (DirectorGenre)this.p.b("genre");
		// if (localObject2 == null)
		// {
		// localObject2 = (String)this.p.b("genreId");
		// localObject2 = (DirectorGenre)this.a.e((String)localObject2);
		// if (localObject2 != null)
		// {
		// ((DirectorGenre)localObject2).c(false);
		// ((DirectorGenre)localObject2).d(false);
		// if ((localObject1 instanceof Genre.OnGenreUpdateListener))
		// ((Genre.OnGenreUpdateListener)localObject1).a((Genre)localObject2);
		// }
		// while (true)
		// {
		// super.c(paramXmlPullParser);
		// return;
		// this.a.J();
		// this.a.c(false);
		// this.a.d(false);
		// if (!(localObject1 instanceof AudioLibrary.OnArtistsUpdateListener))
		// continue;
		// ((AudioLibrary.OnArtistsUpdateListener)localObject1).a(this.a);
		// }
		// }
		// }
		// catch (Exception localException)
		// {
		// while (true)
		// {
		// Ln.e(localException);
		// continue;
		// Object localObject2 = localObject2;
		// }
		// }
	}
}

/*
 * Location: E:\去哪儿\com.control4.myhome-2\classes_dex2jar.jar Qualified Name:
 * com.control4.director.parser.GetArtistsParser JD-Core Version: 0.6.0
 */