package com.zd.model.parser;

import org.xmlpull.v1.XmlPullParser;

import com.zd.model.audio.DirectorArtist;

public class GetArtistAlbumsParser extends GetAlbumsParser {
	private DirectorArtist c;

	public void b(String paramString, XmlPullParser paramXmlPullParser) {
		// try
		// {
		// Object localObject1;
		// Object localObject3;
		// if ((paramString.equalsIgnoreCase("id")) && (this.a != null) &&
		// (this.q != null))
		// {
		// localObject1 = this.q.toString();
		// this.a.l((String)localObject1);
		// localDirectorAlbum = this.a;
		// localObject3 = (DirectorAudioLibrary)this.p.b("audio-library");
		// if (localObject3 == null)
		// break label164;
		// localObject1 =
		// (DirectorAlbum)((DirectorAudioLibrary)localObject3).c(localDirectorAlbum.at());
		// if (localObject1 == null)
		// break label133;
		// if (this.c != null)
		// {
		// localObject3 = (String)this.p.b("genreId");
		// if ((localObject3 == null) || (((String)localObject3).length() <= 0))
		// break label144;
		// this.c.a((DirectorAlbum)localObject1, (String)localObject3);
		// }
		// }
		// while (true)
		// {
		// super.b(paramString, paramXmlPullParser);
		// return;
		// label133: ((DirectorAudioLibrary)localObject3).a(localDirectorAlbum,
		// false);
		// break;
		// label144: this.c.a((DirectorAlbum)localObject1);
		// }
		// }
		// catch (Exception localObject2)
		// {
		// while (true)
		// {
		// DirectorAlbum localDirectorAlbum;
		// Ln.e(localException);
		// continue;
		// label164: Object localObject2 = localDirectorAlbum;
		// }
		// }
	}

	public void b(XmlPullParser paramXmlPullParser) {
		super.b(paramXmlPullParser);
		try {
			this.c = ((DirectorArtist) this.p.b("artist"));
			this.b = null;
			return;
		} catch (Exception localException) {

		}
	}

	public void c(XmlPullParser paramXmlPullParser) {
		// try
		// {
		// Object localObject;
		// if (this.c != null)
		// {
		// localObject = this.p.b("listener");
		// String str = (String)this.p.b("genreId");
		// if ((str == null) || (str.length() <= 0))
		// break label88;
		// this.c.n(false);
		// this.c.o(false);
		// if ((localObject != null) && ((localObject instanceof
		// Artist.OnArtistUpdateListener)))
		// ((Artist.OnArtistUpdateListener)localObject).a(this.c, str);
		// }
		// while (true)
		// {
		// super.c(paramXmlPullParser);
		// return;
		// label88: this.c.l(false);
		// this.c.m(false);
		// if ((localObject == null) || (!(localObject instanceof
		// Artist.OnArtistUpdateListener)))
		// continue;
		// ((Artist.OnArtistUpdateListener)localObject).a(this.c);
		// }
		// }
		// catch (Exception localException)
		// {
		// while (true)
		// Ln.e(localException);
		// }
	}
}
