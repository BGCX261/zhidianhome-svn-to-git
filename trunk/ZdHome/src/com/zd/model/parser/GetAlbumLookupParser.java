package com.zd.model.parser;

import org.xmlpull.v1.XmlPullParser;

import roboguice.util.Ln;

import com.zd.model.DirectorLookupAlpha;
import com.zd.model.DirectorLookupMap;

public class GetAlbumLookupParser extends ResponseParser {
	private DirectorLookupMap a;
	private DirectorLookupAlpha b;

	public void a(String paramString, XmlPullParser paramXmlPullParser) {
		super.a(paramString, paramXmlPullParser);
		try {
			if (paramString.equalsIgnoreCase("alpha"))
				this.b = new DirectorLookupAlpha();
			else if ((paramString.equalsIgnoreCase("letter"))
					|| (paramString.equalsIgnoreCase("offset"))
					|| (paramString.equalsIgnoreCase("count")))
				b(true);
		} catch (Exception localException) {
			Ln.e(localException);
		}
	}

	public void b(String paramString, XmlPullParser paramXmlPullParser) {
		// try
		// {
		// if (paramString.equalsIgnoreCase("alpha"))
		// if (this.b != null)
		// {
		// this.a.a(this.b);
		// this.b = null;
		// }
		// while (true)
		// {
		// super.b(paramString, paramXmlPullParser);
		// return;
		// if (!paramString.equalsIgnoreCase("letter"))
		// break;
		// if ((this.b == null) || (this.q == null))
		// continue;
		// this.b.a(this.q.toString());
		// }
		// }
		// catch (Exception localException)
		// {
		// while (true)
		// {
		// Ln.e(localException);
		// continue;
		// if (paramString.equalsIgnoreCase("offset"))
		// {
		// if ((this.b == null) || (this.q == null))
		// continue;
		// this.b.a(IntegerUtil.a(this.q.toString()));
		// continue;
		// }
		// if ((!paramString.equalsIgnoreCase("count")) || (this.b == null) ||
		// (this.q == null))
		// continue;
		// this.b.b(IntegerUtil.a(this.q.toString()));
		// }
		// }
	}

	public void b(XmlPullParser paramXmlPullParser) {
		super.b(paramXmlPullParser);
		this.b = null;
		this.a = new DirectorLookupMap();
	}

	public void c(XmlPullParser paramXmlPullParser) {
		// try
		// {
		// DirectorAudioLibrary localDirectorAudioLibrary =
		// (DirectorAudioLibrary)this.p.b("audio-library");
		// localDirectorAudioLibrary.a(this.a);
		// localDirectorAudioLibrary.e(false);
		// localDirectorAudioLibrary.h(false);
		// super.c(paramXmlPullParser);
		// return;
		// }
		// catch (Exception localException)
		// {
		// while (true)
		// Ln.e(localException);
		// }
	}
}

/*
 * Location: E:\去哪儿\com.control4.myhome-2\classes_dex2jar.jar Qualified Name:
 * com.control4.director.parser.GetAlbumLookupParser JD-Core Version: 0.6.0
 */