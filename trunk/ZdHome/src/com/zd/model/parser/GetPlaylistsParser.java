package com.zd.model.parser;

import org.xmlpull.v1.XmlPullParser;

import roboguice.util.Ln;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.zd.model.audio.DirectorAudioLibrary;
import com.zd.model.audio.DirectorPlaylist;

public class GetPlaylistsParser extends ResponseParser {

	@Inject
	protected Provider<DirectorPlaylist> _playlistProvider;
	protected DirectorPlaylist a;
	protected DirectorAudioLibrary b;

	public void a(String paramString, XmlPullParser paramXmlPullParser) {
		super.a(paramString, paramXmlPullParser);
		try {
			if (paramString.equalsIgnoreCase("album")) {
				this.a = ((DirectorPlaylist) this._playlistProvider.get());
				return;
			}
			if (paramString.equalsIgnoreCase("playlist")) {
				if (this.a == null)
					this.a = ((DirectorPlaylist) this._playlistProvider.get());
				b(true);
			}
		} catch (Exception localException) {
			Ln.e(localException);
		}
		if ((paramString.equalsIgnoreCase("id"))
				|| (paramString.equalsIgnoreCase("device_id"))
				|| (paramString.equalsIgnoreCase("title"))
				|| (paramString.equalsIgnoreCase("img"))
				|| (paramString.equalsIgnoreCase("song_num"))
				|| (paramString.equalsIgnoreCase("amgid"))
				|| (paramString.equalsIgnoreCase("artist"))
				|| (paramString.equalsIgnoreCase("record_label"))
				|| (paramString.equalsIgnoreCase("genre"))
				|| (paramString.equalsIgnoreCase("release_date")))
			b(true);
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
 * com.control4.director.parser.GetPlaylistsParser JD-Core Version: 0.6.0
 */