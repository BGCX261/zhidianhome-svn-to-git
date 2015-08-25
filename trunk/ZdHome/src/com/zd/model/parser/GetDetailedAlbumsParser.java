package com.zd.model.parser;

import java.util.Vector;

import org.xmlpull.v1.XmlPullParser;

import roboguice.util.Ln;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.zd.model.audio.Album;
import com.zd.model.audio.DirectorAlbum;
import com.zd.model.audio.DirectorAudioLibrary;

public class GetDetailedAlbumsParser extends ResponseParser {

	@Inject
	private Provider<DirectorAlbum> _albumProvider;
	private DirectorAlbum a;
	private Vector<Album> b;

	private DirectorAudioLibrary a() {
		DirectorAudioLibrary localDirectorAudioLibrary = (DirectorAudioLibrary) this.p
				.b("audio-library");
		// if ((localDirectorAudioLibrary == null) && ((this.p instanceof
		// RoomCommand)))
		// {
		// Room localRoom = this._director.m().h(((RoomCommand)this.p).e());
		// if (localRoom != null)
		// localDirectorAudioLibrary = (DirectorAudioLibrary)localRoom.at();
		// }
		return localDirectorAudioLibrary;
	}

	public void a(String paramString, XmlPullParser paramXmlPullParser) {
		super.a(paramString, paramXmlPullParser);
		try {
			if (paramString.equalsIgnoreCase("album"))
				this.a = ((DirectorAlbum) this._albumProvider.get());
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
		// DirectorAudioLibrary localDirectorAudioLibrary;
		// DirectorAlbum localDirectorAlbum;
		// if (paramString.equalsIgnoreCase("album"))
		// {
		// localDirectorAudioLibrary = a();
		// localDirectorAlbum =
		// (DirectorAlbum)localDirectorAudioLibrary.c(this.a.at());
		// if (localDirectorAlbum != null)
		// {
		// localDirectorAlbum.a(this.a);
		// this.b.add(localDirectorAlbum);
		// localDirectorAlbum.e(false);
		// localDirectorAlbum.c(this._director.q());
		// localDirectorAudioLibrary.a(this.a.at(), false);
		// this.a = null;
		// }
		// }
		// while (true)
		// {
		// super.b(paramString, paramXmlPullParser);
		// return;
		// localDirectorAudioLibrary.a(this.a, true);
		// localDirectorAlbum = this.a;
		// break;
		// if (!paramString.equalsIgnoreCase("id"))
		// break label161;
		// if ((this.a == null) || (this.q == null))
		// continue;
		// this.a.l(this.q.toString());
		// }
		// }
		// catch (Exception localException)
		// {
		// while (true)
		// {
		// Ln.e(localException);
		// continue;
		// label161: if (paramString.equalsIgnoreCase("title"))
		// {
		// if ((this.a == null) || (this.q == null))
		// continue;
		// this.a.m(this.q.toString());
		// continue;
		// }
		// if (paramString.equalsIgnoreCase("device_id"))
		// {
		// if ((this.a == null) || (this.q == null))
		// continue;
		// this.a.c(IntegerUtil.a(this.q.toString()));
		// continue;
		// }
		// if (paramString.equalsIgnoreCase("img"))
		// {
		// if ((this.a == null) || (this.q == null))
		// continue;
		// this.a.n(this.q.toString());
		// continue;
		// }
		// if (paramString.equalsIgnoreCase("amgid"))
		// {
		// if ((this.a == null) || (this.q == null))
		// continue;
		// this.a.e(this.q.toString());
		// continue;
		// }
		// if (paramString.equalsIgnoreCase("artist"))
		// {
		// if ((this.a == null) || (this.q == null))
		// continue;
		// this.a.f(this.q.toString());
		// continue;
		// }
		// if (paramString.equalsIgnoreCase("genre"))
		// {
		// if ((this.a == null) || (this.q == null))
		// continue;
		// this.a.h(this.q.toString());
		// continue;
		// }
		// if (paramString.equalsIgnoreCase("release_date"))
		// {
		// if ((this.a == null) || (this.q == null))
		// continue;
		// this.a.i(this.q.toString());
		// continue;
		// }
		// if (paramString.equalsIgnoreCase("record_label"))
		// {
		// if ((this.a == null) || (this.q == null))
		// continue;
		// this.a.g(this.q.toString());
		// continue;
		// }
		// if ((!paramString.equalsIgnoreCase("description")) || (this.a ==
		// null) || (this.q == null))
		// continue;
		// this.a.j(this.q.toString());
		// }
		// }
	}

	public void b(XmlPullParser paramXmlPullParser) {
		this.a = null;
		this.b = new Vector();
		super.b(paramXmlPullParser);
	}

	public void c(XmlPullParser paramXmlPullParser) {
		// try
		// {
		// Object localObject = this.p.b("listener");
		// if (localObject != null)
		// {
		// boolean bool = localObject instanceof
		// AudioLibrary.OnAlbumsUpdateListener;
		// if (!bool);
		// }
		// try
		// {
		// if (this.b.size() == 1)
		// ((AudioLibrary.OnAlbumsUpdateListener)localObject).a(a(),
		// (Album)this.b.elementAt(0));
		// while (true)
		// {
		// super.c(paramXmlPullParser);
		// return;
		// ((AudioLibrary.OnAlbumsUpdateListener)localObject).a(a(), this.b);
		// }
		// }
		// catch (Exception localException1)
		// {
		// while (true)
		// Ln.e(localException1);
		// }
		// }
		// catch (Exception localException2)
		// {
		// while (true)
		// Ln.e(localException2);
		// }
	}
}
