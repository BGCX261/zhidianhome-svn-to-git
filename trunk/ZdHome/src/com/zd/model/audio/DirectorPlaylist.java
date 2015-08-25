package com.zd.model.audio;

import roboguice.util.Ln;
import android.app.Application;

import com.google.inject.Inject;

public class DirectorPlaylist extends DirectorAlbum implements Playlist {

	@Inject
	private Application _context;
	int a;

	public DirectorPlaylist() {
		this.H = false;
		this.p = true;
	}

	// public void a(DirectorResult paramDirectorResult)
	// {
	// super.a(paramDirectorResult);
	// if (paramDirectorResult != null)
	// try
	// {
	// if ((paramDirectorResult instanceof DirectorPlaylist))
	// b(((DirectorPlaylist)paramDirectorResult).i());
	// }
	// catch (Exception localException)
	// {
	// Ln.e(localException);
	// }
	// }

	public boolean a(int paramInt, boolean paramBoolean) {
		boolean bool = false;
		try {
			Song localSong = a(paramInt);
			if (localSong != null) {
				bool = localSong.f(paramBoolean);
				bool = bool;
			}
		} catch (Exception localException) {
			Ln.e(localException);
		}
		return bool;
	}
	//
	// public boolean a(Album.OnAlbumUpdateListener paramOnAlbumUpdateListener)
	// {
	// boolean bool1 = true;
	// int i;
	// try
	// {
	// if (this._director == null)
	// {
	// bool1 = false;
	// break label236;
	// }
	// if (this.l)
	// break label236;
	// if (this._director.G())
	// {
	// bool1 = b(this._director.q());
	// f(false);
	// g(false);
	// if (paramOnAlbumUpdateListener == null)
	// break label236;
	// paramOnAlbumUpdateListener.a(this);
	// }
	// }
	// catch (Exception i)
	// {
	// Ln.e(localException);
	// g(false);
	// i = 0;
	// }
	// g(true);
	// if ((this._director.d() != null) && (this._director.c() < 1.99D))
	// i = 0;
	// if (i != 0);
	// GetAlbumCommand localGetAlbumCommand2;
	// for (GetAlbumCommand localGetAlbumCommand1 =
	// (GetAlbumCommand)CommandFactory.GetPlaylistProvider.a(); ;
	// localGetAlbumCommand2 =
	// (GetAlbumCommand)CommandFactory.GetAlbumProvider.a())
	// {
	// Room localRoom = this._director.m().s();
	// localGetAlbumCommand1.a(at());
	// localGetAlbumCommand1.b(localRoom.a());
	// localGetAlbumCommand1.a("playlist", this);
	// localGetAlbumCommand1.a("listener", paramOnAlbumUpdateListener);
	// if (paramOnAlbumUpdateListener != null)
	// b(paramOnAlbumUpdateListener);
	// localGetAlbumCommand1.a("audio-library", m());
	// localGetAlbumCommand1.c(15);
	// boolean bool2 = this._director.a(localGetAlbumCommand1);
	// if (bool2)
	// break;
	// g(false);
	// break;
	// }
	// label236: return localGetAlbumCommand2;
	// }
	//
	// public void b(int paramInt)
	// {
	// this.a = paramInt;
	// }
	//
	// public boolean d(boolean paramBoolean)
	// {
	// boolean bool;
	// int m;
	// try
	// {
	// if (this._director == null)
	// {
	// int i = 0;
	// }
	// else
	// {
	// DirectorProject localDirectorProject = this._director.m();
	// int j;
	// if (localDirectorProject == null)
	// {
	// j = 0;
	// }
	// else
	// {
	// Room localRoom = j.s();
	// int k;
	// if (localRoom == null)
	// {
	// k = 0;
	// }
	// else
	// {
	// Object localObject1 = k.ar();
	// if ((localObject1 != null) && (((AudioQueue)localObject1).c() ==
	// AudioQueue.QueueState.b));
	// localObject1 = new
	// StringBuilder("<param><name>MEDIA_ID</name><value type=\"STRING\"><static>");
	// ((StringBuilder)localObject1).append(at());
	// ((StringBuilder)localObject1).append("</static></value></param>");
	// ((StringBuilder)localObject1).append("<param><name>ROOM_ID</name><value type=\"INTEGER\"><static>");
	// ((StringBuilder)localObject1).append(this._director.m().r());
	// ((StringBuilder)localObject1).append("</static></value></param>");
	// ((StringBuilder)localObject1).append("<param><name>PLAY_NOW</name><value type=\"STRING\"><static>");
	// ((StringBuilder)localObject1).append("1");
	// ((StringBuilder)localObject1).append("</static></value></param>");
	// ((StringBuilder)localObject1).append("<param><name>PLAY_NEXT</name><value type=\"STRING\"><static>");
	// if (paramBoolean);
	// for (Object localObject2 = "1"; ; localObject2 = "0")
	// {
	// ((StringBuilder)localObject1).append((String)localObject2);
	// ((StringBuilder)localObject1).append("</static></value></param>");
	// k.ag();
	// localObject2 =
	// (SendToDeviceCommand)CommandFactory.SendToDeviceProvider.a();
	// ((SendToDeviceCommand)localObject2).d(false);
	// ((SendToDeviceCommand)localObject2).c(true);
	// ((SendToDeviceCommand)localObject2).c(27);
	// ((SendToDeviceCommand)localObject2).b(100002);
	// ((SendToDeviceCommand)localObject2).a(((StringBuilder)localObject1).toString());
	// ((SendToDeviceCommand)localObject2).c("ADD_PLAYLIST");
	// bool = this._director.a((Command)localObject2);
	// DirectorDigitalAudio localDirectorDigitalAudio =
	// (DirectorDigitalAudio)k.as();
	// if (localDirectorDigitalAudio == null)
	// break;
	// localDirectorDigitalAudio.i(true);
	// break;
	// }
	// }
	// }
	// }
	// }
	// catch (Exception m)
	// {
	// Ln.e(localException);
	// m = 0;
	// }
	// while (true)
	// {
	// return m;
	// m = bool;
	// }
	// }
	//
	// public void h()
	// {
	// super.h();
	// }
	//
	// public int i()
	// {
	// return this.a;
	// }
	//
	// // ERROR //
	// public void l()
	// {

	// }
	//
	// public DirectorAudioLibrary m()
	// {
	// try
	// {
	// DirectorAudioLibrary localDirectorAudioLibrary =
	// (DirectorAudioLibrary)this._director.m().s().au();
	// return localDirectorAudioLibrary;
	// }
	// catch (Exception localObject)
	// {
	// while (true)
	// {
	// Ln.e(localException);
	// Object localObject = null;
	// }
	// }
	// }
	//
	// public ArrayList<Album.OnAlbumUpdateListener> n()
	// {
	// return this.r;
	// }
	//
	// public String v()
	// {
	// return null;
	// }
	//
	// public String w()
	// {
	// String str;
	// if (this.a <= 0)
	// str = null;
	// else
	// str = this.a + this._context.getString(R.string.tracks);
	// return str;
	// }
}
