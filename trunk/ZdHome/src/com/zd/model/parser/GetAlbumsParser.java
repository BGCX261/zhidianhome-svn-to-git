package com.zd.model.parser;

import org.xmlpull.v1.XmlPullParser;

import roboguice.util.Ln;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.zd.model.audio.DirectorAlbum;
import com.zd.model.audio.DirectorAudioLibrary;

public class GetAlbumsParser extends ResponseParser {

	@Inject
	private Provider<DirectorAlbum> _albumProvider;
	protected DirectorAlbum a;
	protected DirectorAudioLibrary b;

	public void a(String paramString, XmlPullParser paramXmlPullParser) {
		super.a(paramString, paramXmlPullParser);
		try {
			if (paramString.equalsIgnoreCase("id")) {
				this.a = ((DirectorAlbum) this._albumProvider.get());
				b(true);
			}
			return;
		} catch (Exception localException) {
			while (true)
				Ln.e(localException);
		}
	}

	public void b(String paramString, XmlPullParser paramXmlPullParser) {
		try {
			if (paramString.equalsIgnoreCase("id")) {
				if ((this.a != null) && (this.q != null)) {
					String str = this.q.toString();
					this.a.l(str);
					if ((this.b != null)
							&& ((this.b.c(str) == null) || (this.b.f(str))))
						this.b.a(this.a, true);
				}
				this.a = null;
			}
			super.b(paramString, paramXmlPullParser);
			return;
		} catch (Exception localException) {
			while (true)
				Ln.e(localException);
		}
	}

	public void b(XmlPullParser paramXmlPullParser) {
		super.b(paramXmlPullParser);
		this.a = null;
		this.b = ((DirectorAudioLibrary) this.p.b("audio-library"));
	}

	public void c(XmlPullParser paramXmlPullParser) {
		// try
		// {
		// if (this.b != null)
		// {
		// this.b.f(false);
		// this.b.g(false);
		// }
		// Object localObject = this.p.b("listener");
		// if ((localObject != null) && ((localObject instanceof
		// AudioLibrary.OnAlbumsUpdateListener)))
		// localObject = (AudioLibrary.OnAlbumsUpdateListener)localObject;
		// try
		// {
		// ((AudioLibrary.OnAlbumsUpdateListener)localObject).a(this.b);
		// super.c(paramXmlPullParser);
		// return;
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

/*
 * Location: E:\去哪儿\com.control4.myhome-2\classes_dex2jar.jar Qualified Name:
 * com.control4.director.parser.GetAlbumsParser JD-Core Version: 0.6.0
 */