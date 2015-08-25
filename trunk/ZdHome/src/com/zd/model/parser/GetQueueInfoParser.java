package com.zd.model.parser;

import org.xmlpull.v1.XmlPullParser;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.zd.model.HashIndex;
import com.zd.model.audio.DirectorAudioLibrary;
import com.zd.model.audio.DirectorAudioQueue;
import com.zd.model.audio.DirectorSong;
import com.zd.model.audio.Song;

public class GetQueueInfoParser extends ResponseParser {

	@Inject
	protected Provider<DirectorSong> _songProvider;
	protected DirectorAudioQueue a = null;
	protected DirectorAudioLibrary b;
	protected DirectorAudioLibrary c;
	protected HashIndex<String, Song> d = new HashIndex();

	public void a(String paramString, XmlPullParser paramXmlPullParser) {
		super.a(paramString, paramXmlPullParser);

	}

	public void b(String paramString, XmlPullParser paramXmlPullParser) {
		if ((paramString.equalsIgnoreCase("id")) && (this.p != null)) {
			Object localObject = this.p.b("queue");
			if ((localObject != null)
					&& ((localObject instanceof DirectorAudioQueue))) {
				this.a = ((DirectorAudioQueue) localObject);
				if (this.q != null) {
					localObject = this.q.toString();
					if ((localObject != null)
							&& (((String) localObject).length() > 0))
						this.a.c(Integer.parseInt((String) localObject));
				}
			}
		}
		super.b(paramString, paramXmlPullParser);
	}

	public void b(XmlPullParser paramXmlPullParser) {
		super.b(paramXmlPullParser);

	}

	public void c(XmlPullParser paramXmlPullParser) {
		if (this.a != null) {
			this.a.a(this.d);
			this.a.a(false);
			this.a.b(false);
		}
		super.c(paramXmlPullParser);
	}
}

/*
 * Location: E:\去哪儿\com.control4.myhome-2\classes_dex2jar.jar Qualified Name:
 * com.control4.director.parser.GetQueueInfoParser JD-Core Version: 0.6.0
 */