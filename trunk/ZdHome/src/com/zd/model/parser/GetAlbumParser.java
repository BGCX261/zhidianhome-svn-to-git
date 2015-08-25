package com.zd.model.parser;

import org.xmlpull.v1.XmlPullParser;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.zd.model.audio.DirectorAlbum;
import com.zd.model.audio.DirectorPlaylist;
import com.zd.model.audio.DirectorSong;

public class GetAlbumParser extends ResponseParser {

	@Inject
	protected Provider<DirectorAlbum> _albumProvider;

	@Inject
	protected Provider<DirectorPlaylist> _playlistProvider;

	@Inject
	protected Provider<DirectorSong> _songProvider;
	protected DirectorAlbum a;
	protected DirectorSong b;

	public void a(String paramString, XmlPullParser paramXmlPullParser) {
		super.a(paramString, paramXmlPullParser);
		// try
		// {
		// if (paramString.equalsIgnoreCase("album"))
		// this.a = ((DirectorAlbum)this._albumProvider.get());
		// while (true)
		// {
		// b(true);
		// return;
		// if ((!paramString.equalsIgnoreCase("album_id")) &&
		// (!paramString.equalsIgnoreCase("album_title")))
		// break;
		// if (this.a != null)
		// continue;
		// this.a = ((DirectorAlbum)this._albumProvider.get());
		// }
		// }
		// catch (Exception localException)
		// {
		// while (true)
		// {
		// Ln.e(localException);
		// break;
		// if (paramString.equalsIgnoreCase("playlist"))
		// {
		// if (this.a != null)
		// continue;
		// this.a = ((DirectorAlbum)this._playlistProvider.get());
		// continue;
		// }
		// if (!paramString.equalsIgnoreCase("song"))
		// continue;
		// this.b = ((DirectorSong)this._songProvider.get());
		// }
		// }
	}

	public void b(String paramString, XmlPullParser paramXmlPullParser) {
		// try
		// {
		// if (paramString.equalsIgnoreCase("id"))
		// {
		// if (this.q != null)
		// {
		// if (this.b == null)
		// break label97;
		// this.b.l(this.q.toString());
		// if (this.b.n())
		// {
		// C4RhapsodySong localC4RhapsodySong =
		// (C4RhapsodySong)this._director.K()._rhapsodySongProvider.a();
		// localC4RhapsodySong.l(this.b.at());
		// localC4RhapsodySong.a(this.b);
		// this.b = localC4RhapsodySong;
		// }
		// }
		// while (true)
		// {
		// super.b(paramString, paramXmlPullParser);
		// return;
		// label97: if (this.a == null)
		// continue;
		// this.a.l(this.q.toString());
		// }
		// }
		// }
		// catch (Exception bool)
		// {
		// while (true)
		// {
		// Ln.e(localException);
		// continue;
		// if (paramString.equalsIgnoreCase("song_id"))
		// {
		// if ((this.b == null) || (this.q == null))
		// continue;
		// this.b.l(this.q.toString());
		// continue;
		// }
		// if (paramString.equalsIgnoreCase("album_id"))
		// {
		// if ((this.a == null) || ((this.a instanceof DirectorPlaylist)) ||
		// (this.q == null))
		// continue;
		// this.a.l(this.q.toString());
		// continue;
		// }
		// if (paramString.equalsIgnoreCase("title"))
		// {
		// if ((this.b != null) || (this.q == null))
		// continue;
		// this.a.m(this.q.toString());
		// continue;
		// }
		// if (paramString.equalsIgnoreCase("album_title"))
		// {
		// if ((this.a == null) || ((this.a instanceof DirectorPlaylist)) ||
		// (this.q == null))
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
		// if (paramString.equalsIgnoreCase("record_label"))
		// {
		// if ((this.a == null) || (this.q == null))
		// continue;
		// this.a.g(this.q.toString());
		// continue;
		// }
		// if (paramString.equalsIgnoreCase("release_date"))
		// {
		// if ((this.a == null) || (this.q == null))
		// continue;
		// this.a.i(this.q.toString());
		// continue;
		// }
		// if (paramString.equalsIgnoreCase("description"))
		// {
		// if ((this.a == null) || (this.q == null))
		// continue;
		// this.a.j(this.q.toString());
		// continue;
		// }
		// if (paramString.equalsIgnoreCase("genre"))
		// {
		// if ((this.a == null) || (this.q == null))
		// continue;
		// this.a.h(this.q.toString());
		// continue;
		// }
		// if (paramString.equalsIgnoreCase("artist"))
		// {
		// if (this.p.i() == 17)
		// {
		// if (this.b == null)
		// continue;
		// this.b.a(j());
		// continue;
		// }
		// if ((this.a == null) || (this.q == null))
		// continue;
		// if ((this.a instanceof DirectorPlaylist))
		// {
		// if (this.b == null)
		// continue;
		// this.b.a(this.q.toString());
		// continue;
		// }
		// this.a.f(this.q.toString());
		// continue;
		// }
		// if (paramString.equalsIgnoreCase("song"))
		// {
		// if (this.b == null)
		// continue;
		// if (this.b.n())
		// {
		// Object localObject = this.b.e();
		// this.b.l(this.b.z());
		// boolean bool = this.b.a(this._director.q());
		// this.b.b((String)localObject);
		// localObject =
		// (C4RhapsodySong)this._director.K()._rhapsodySongProvider.a();
		// ((C4RhapsodySong)localObject).a(this.b);
		// this.b = ((DirectorSong)localObject);
		// if (bool)
		// this.b.c(this._director.q());
		// if ((this.b.au() == null) || (this.b.c() == null))
		// break label910;
		// this.b.d(false);
		// }
		// while (true)
		// {
		// if (this.a != null)
		// this.a.a(this.b);
		// if ((!this.b.n()) && (this.b.au() != null))
		// this.b.d(false);
		// this.b = null;
		// break;
		// label910: this.b.d(true);
		// }
		// }
		// if (paramString.equalsIgnoreCase("track_id"))
		// {
		// if ((this.b == null) || (this.q == null))
		// continue;
		// this.b.b(this.q.toString());
		// continue;
		// }
		// if (paramString.equalsIgnoreCase("name"))
		// {
		// if ((this.b == null) || (this.q == null))
		// continue;
		// this.b.m(this.q.toString());
		// continue;
		// }
		// if (paramString.equalsIgnoreCase("type"))
		// {
		// if ((this.b == null) || (this.q == null))
		// continue;
		// this.b.o(this.q.toString());
		// continue;
		// }
		// if (paramString.equalsIgnoreCase("location"))
		// {
		// if ((this.b == null) || (this.q == null))
		// continue;
		// this.b.c(this.q.toString());
		// continue;
		// }
		// if (paramString.equalsIgnoreCase("sequence"))
		// {
		// if ((this.b == null) || (this.q == null))
		// continue;
		// this.b.d(this.q.toString());
		// continue;
		// }
		// if ((!paramString.equalsIgnoreCase("track_no")) || (this.b == null)
		// || (this.q == null))
		// continue;
		// this.b.b(IntegerUtil.a(this.q.toString()));
		// }
		// }
	}

	public void b(XmlPullParser paramXmlPullParser) {
		super.b(paramXmlPullParser);
		this.b = null;
		this.a = null;
	}

	public void c(XmlPullParser paramXmlPullParser) {
		// int i = 0;
		// try
		// {
		// localObject2 = this._director.m();
		// if ((this.p != null) && ((this.p instanceof RoomCommand)))
		// {
		// localObject2 = ((Project)localObject2).h(((RoomCommand)this.p).e());
		// DirectorAudioLibrary localDirectorAudioLibrary =
		// (DirectorAudioLibrary)this.p.b("audio-library");
		// if ((localDirectorAudioLibrary == null) && (localObject2 != null))
		// {
		// localObject2 = (DirectorAudioLibrary)((Room)localObject2).at();
		// if (localObject2 != null)
		// {
		// int j = this.p.i();
		// if (j != 23)
		// break label230;
		// localDirectorAlbum = (DirectorAlbum)this.p.b("album");
		// if (((localDirectorAlbum == null) || (!(localDirectorAlbum instanceof
		// DirectorAlbum))) && (this.a != null))
		// localDirectorAlbum =
		// (DirectorAlbum)((DirectorAudioLibrary)localObject2).c(this.a.at());
		// if (localDirectorAlbum == null)
		// break label225;
		// localDirectorAlbum.a(this.a);
		// localDirectorAlbum.f(false);
		// if (((DirectorAudioLibrary)localObject2).f(this.a.at()));
		// if (i != 0)
		// {
		// ((DirectorAudioLibrary)localObject2).a(this.a, true);
		// this.a.f(false);
		// localDirectorAlbum = this.a;
		// }
		// localDirectorAlbum.g(false);
		// localDirectorAlbum.l();
		// }
		// while (true)
		// {
		// super.c(paramXmlPullParser);
		// return;
		// label225: i = 1;
		// break;
		// label230: if (localDirectorAlbum != 15)
		// break label379;
		// DirectorPlaylist localDirectorPlaylist =
		// (DirectorPlaylist)this.p.b("playlist");
		// if ((localDirectorPlaylist == null) || (!(localDirectorPlaylist
		// instanceof DirectorPlaylist)))
		// localDirectorPlaylist =
		// (DirectorPlaylist)((DirectorAudioLibrary)localObject2).a(this.a.at());
		// if (localDirectorPlaylist == null)
		// break label348;
		// localDirectorPlaylist.a(this.a);
		// localDirectorPlaylist = localDirectorPlaylist;
		// localObject2 = localDirectorPlaylist.n();
		// if (localObject2 != null)
		// ((ArrayList)((ArrayList)localObject2).clone());
		// localDirectorPlaylist.f(false);
		// localDirectorPlaylist.g(false);
		// if (localDirectorPlaylist.i() == 0)
		// localDirectorPlaylist.b(localDirectorPlaylist.e());
		// localDirectorPlaylist.l();
		// }
		// }
		// }
		// }
		// catch (Exception localObject1)
		// {
		// while (true)
		// {
		// DirectorAlbum localDirectorAlbum;
		// Ln.e(localException);
		// continue;
		// label348: Object localObject1 =
		// (DirectorPlaylist)this._playlistProvider.a();
		// ((DirectorPlaylist)localObject1).a(this.a);
		// ((DirectorAudioLibrary)localObject2).a((DirectorPlaylist)localObject1);
		// localObject1 = localObject1;
		// continue;
		// label379: if ((localDirectorAlbum != 17) || (this.a == null) ||
		// (this.a.at() == null))
		// continue;
		// if (((DirectorAudioLibrary)localObject2).c(this.a.at()) == null)
		// ((DirectorAudioLibrary)localObject2).a(this.a, false);
		// Object localObject2 = (DirectorSong)this.a.a(0);
		// if (localObject2 == null)
		// continue;
		// localObject1 = (DirectorSong)this.p.b("song");
		// if (localObject1 != null)
		// ((DirectorSong)localObject1).a((DirectorSong)localObject2);
		// while (true)
		// {
		// ((DirectorSong)localObject1).c(this._director.q());
		// if (this.p == null)
		// break;
		// localObject2 = this.p.b("listener");
		// if ((localObject2 == null) || (!(localObject2 instanceof
		// Song.OnSongUpdateListener)))
		// break;
		// ((Song.OnSongUpdateListener)localObject2).a((Song)localObject1);
		// break;
		// localObject1 = localObject2;
		// }
		// localObject2 = localDirectorAlbum;
		// continue;
		// localObject2 = null;
		// }
		// }
	}
}

/*
 * Location: E:\去哪儿\com.control4.myhome-2\classes_dex2jar.jar Qualified Name:
 * com.control4.director.parser.GetAlbumParser JD-Core Version: 0.6.0
 */