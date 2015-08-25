package com.zd.model.audio;

import java.util.Vector;

import com.zd.home.R;
import com.zd.model.DirectorLookupMap;
import com.zd.model.DirectorResults;

public class DirectorRhapsodyAudioLibrary extends DirectorAudioLibrary {
	public static final Object U = Integer.valueOf(2000);
	public static final Object V = Integer.valueOf(2000);
	public static final Object W = Integer.valueOf(2000);

	public DirectorRhapsodyAudioLibrary() {
		this.e = true;
	}

	public boolean L() {
		this.l = false;
		this.f = false;
		return true;
	}

	public void a(Album paramAlbum, boolean paramBoolean) {
		if (this.A == null) {
			this.A = new DirectorResults();
			this.A.a(false);
			this.A.b(true);
			this.A.d(false);
			this.A.a(this._context.getString(R.string.albums));
		}
		super.a(paramAlbum, paramBoolean);
	}

	public boolean a(
			AudioLibrary.OnAlbumsUpdateListener paramOnAlbumsUpdateListener) {
		return a;
		// int i = 1;
		// int j;
		// try
		// {
		// if ((!k()) && (this.c) && (!this._director.G()))
		// {
		// Control4Rhapsody localControl4Rhapsody = this._director.K();
		// if ((localControl4Rhapsody == null) || (localControl4Rhapsody.e()))
		// break label237;
		// g(true);
		// RhapsodyCommand localRhapsodyCommand =
		// (RhapsodyCommand)RhapsodyCommandFactory.commandProvider.a();
		// StringBuilder localStringBuilder = new
		// StringBuilder("<C4SoapRequest><Function>GetAlbumsInLibrary</Function><Data><Start>");
		// localStringBuilder.append(0);
		// localStringBuilder.append("</Start><Count>");
		// localStringBuilder.append(U);
		// localStringBuilder.append("</Count><InterestFlags>");
		// localStringBuilder.append(2);
		// localStringBuilder.append("</InterestFlags></Data></C4SoapRequest>");
		// localRhapsodyCommand.c(localStringBuilder.toString());
		// localRhapsodyCommand.c(true);
		// localRhapsodyCommand.c(5);
		// localRhapsodyCommand.a("listener", paramOnAlbumsUpdateListener);
		// if (paramOnAlbumsUpdateListener != null)
		// b(paramOnAlbumsUpdateListener);
		// localRhapsodyCommand.a("audio-library", this);
		// localRhapsodyCommand.a("results in library", Boolean.valueOf(true));
		// localRhapsodyCommand.a("albums in lookup", Boolean.valueOf(true));
		// localRhapsodyCommand.a("all rhapsody albums", Boolean.valueOf(true));
		// localRhapsodyCommand.a("retrieved album songs",
		// Boolean.valueOf(false));
		// boolean bool = localControl4Rhapsody.a(localRhapsodyCommand);
		// if (!bool)
		// g(false);
		// }
		// }
		// catch (Exception j)
		// {
		// Ln.e(localException);
		// g(false);
		// j = 0;
		// }
		// while (true)
		// {
		// return j;
		// label237: j = 0;
		// }
	}

	public boolean a(
			AudioLibrary.OnArtistsUpdateListener paramOnArtistsUpdateListener) {
		// int i = 1;
		// int j;
		// try
		// {
		// if ((!f()) && (this.b) && (!this._director.G()))
		// {
		// Control4Rhapsody localControl4Rhapsody = this._director.K();
		// if ((localControl4Rhapsody == null) || (localControl4Rhapsody.e()))
		// break label249;
		// d(true);
		// t();
		// RhapsodyCommand localRhapsodyCommand =
		// (RhapsodyCommand)RhapsodyCommandFactory.commandProvider.a();
		// StringBuilder localStringBuilder = new
		// StringBuilder("<C4SoapRequest><Function>GetArtistsInLibrary</Function><Data><Start>");
		// localStringBuilder.append(0);
		// localStringBuilder.append("</Start><Count>");
		// localStringBuilder.append(V);
		// localStringBuilder.append("</Count><InterestFlags>");
		// localStringBuilder.append(2);
		// localStringBuilder.append("</InterestFlags></Data></C4SoapRequest>");
		// localRhapsodyCommand.c(localStringBuilder.toString());
		// localRhapsodyCommand.c(true);
		// localRhapsodyCommand.c(6);
		// localRhapsodyCommand.a("listener", paramOnArtistsUpdateListener);
		// if (paramOnArtistsUpdateListener != null)
		// b(paramOnArtistsUpdateListener);
		// localRhapsodyCommand.a("audio-library", this);
		// localRhapsodyCommand.a("results in library", Boolean.valueOf(true));
		// localRhapsodyCommand.a("channels in library",
		// Boolean.valueOf(false));
		// localRhapsodyCommand.a("artists in lookup", Boolean.valueOf(true));
		// localRhapsodyCommand.a("all rhapsody artists",
		// Boolean.valueOf(true));
		// boolean bool = localControl4Rhapsody.a(localRhapsodyCommand);
		// if (!bool)
		// d(false);
		// }
		// }
		// catch (Exception j)
		// {
		// Ln.e(localException);
		// d(false);
		// j = 0;
		// }
		// while (true)
		// {
		// return j;
		// label249: j = 0;
		// }
		return false;
	}

	public boolean a(
			AudioLibrary.OnChannelsUpdateListener paramOnChannelsUpdateListener) {
		// int i = 1;
		// int j;
		// try
		// {
		// if ((!A()) && (this.e) && (!this._director.G()))
		// {
		// Control4Rhapsody localControl4Rhapsody = this._director.K();
		// if ((localControl4Rhapsody == null) || (localControl4Rhapsody.e()))
		// break label194;
		// l(true);
		// RhapsodyCommand localRhapsodyCommand =
		// (RhapsodyCommand)RhapsodyCommandFactory.commandProvider.a();
		// localRhapsodyCommand.c("<C4SoapRequest><Function>GetStationsInLibrary</Function><Data><Start>0</Start><Count>"
		// + U + "</Count><InterestFlags>" + 2 +
		// "</InterestFlags></Data></C4SoapRequest>");
		// localRhapsodyCommand.c(true);
		// localRhapsodyCommand.c(17);
		// localRhapsodyCommand.a("listener", paramOnChannelsUpdateListener);
		// if (paramOnChannelsUpdateListener != null)
		// b(paramOnChannelsUpdateListener);
		// localRhapsodyCommand.a("audio-library", this);
		// localRhapsodyCommand.a("results in library", Boolean.valueOf(true));
		// localRhapsodyCommand.a("all rhapsody channels",
		// Boolean.valueOf(true));
		// boolean bool = localControl4Rhapsody.a(localRhapsodyCommand);
		// if (!bool)
		// l(false);
		// }
		// }
		// catch (Exception j)
		// {
		// Ln.e(localException);
		// l(false);
		// j = 0;
		// }
		// while (true)
		// {
		// return j;
		// label194: j = 0;
		// }
		return false;
	}

	public boolean a(
			AudioLibrary.OnGenresUpdateListener paramOnGenresUpdateListener) {
		// int i = 1;
		// int j;
		// try
		// {
		// if ((!p()) && (this.d) && (!this._director.G()))
		// {
		// Control4Rhapsody localControl4Rhapsody = this._director.K();
		// if ((localControl4Rhapsody == null) || (localControl4Rhapsody.e()))
		// break label223;
		// j(true);
		// RhapsodyCommand localRhapsodyCommand =
		// (RhapsodyCommand)RhapsodyCommandFactory.commandProvider.a();
		// StringBuilder localStringBuilder = new
		// StringBuilder("<C4SoapRequest><Function>GetGenresInLibrary</Function><Data><Start>");
		// localStringBuilder.append(0);
		// localStringBuilder.append("</Start><Count>");
		// localStringBuilder.append(W);
		// localStringBuilder.append("</Count><InterestFlags>");
		// localStringBuilder.append(2);
		// localStringBuilder.append("</InterestFlags></Data></C4SoapRequest>");
		// localRhapsodyCommand.c(localStringBuilder.toString());
		// localRhapsodyCommand.c(true);
		// localRhapsodyCommand.c(7);
		// localRhapsodyCommand.a("listener", paramOnGenresUpdateListener);
		// if (paramOnGenresUpdateListener != null)
		// b(paramOnGenresUpdateListener);
		// localRhapsodyCommand.a("audio-library", this);
		// localRhapsodyCommand.a("results in library", Boolean.valueOf(true));
		// localRhapsodyCommand.a("all rhapsody genres", Boolean.valueOf(true));
		// boolean bool = localControl4Rhapsody.a(localRhapsodyCommand);
		// if (!bool)
		// j(false);
		// }
		// }
		// catch (Exception j)
		// {
		// Ln.e(localException);
		// j(false);
		// j = 0;
		// }
		// while (true)
		// {
		// return j;
		// label223: j = 0;
		// }
		return false;
	}

	public boolean a(
			AudioLibrary.OnPlaylistsUpdateListener paramOnPlaylistsUpdateListener) {
		// int i = 1;
		// int j;
		// try
		// {
		// if ((!b()) && (this.a) && (!this._director.G()))
		// {
		// Control4Rhapsody localControl4Rhapsody = this._director.K();
		// if ((localControl4Rhapsody == null) || (localControl4Rhapsody.e()))
		// break label150;
		// b(true);
		// RhapsodyCommand localRhapsodyCommand =
		// (RhapsodyCommand)RhapsodyCommandFactory.commandProvider.a();
		// localRhapsodyCommand.c("<C4SoapRequest><Function>GetMemberPlaylists</Function><Data/></C4SoapRequest>");
		// localRhapsodyCommand.c(true);
		// localRhapsodyCommand.c(4);
		// localRhapsodyCommand.a("listener", paramOnPlaylistsUpdateListener);
		// if (paramOnPlaylistsUpdateListener != null)
		// b(paramOnPlaylistsUpdateListener);
		// localRhapsodyCommand.a("audio-library", this);
		// localRhapsodyCommand.a("results in library", Boolean.valueOf(true));
		// boolean bool = localControl4Rhapsody.a(localRhapsodyCommand);
		// if (!bool)
		// b(false);
		// }
		// }
		// catch (Exception j)
		// {
		// Ln.e(localException);
		// b(false);
		// j = 0;
		// }
		// while (true)
		// {
		// return j;
		// label150: j = 0;
		// }
		return false;
	}

	public boolean a(String paramString,
			AudioLibrary.OnAlbumsUpdateListener paramOnAlbumsUpdateListener) {
		return super.a(paramString, paramOnAlbumsUpdateListener);
	}

	public boolean a(Vector<String> paramVector,
			AudioLibrary.OnAlbumsUpdateListener paramOnAlbumsUpdateListener) {
		return super.a(paramVector, paramOnAlbumsUpdateListener);
	}

	public boolean a(Vector<Song> paramVector,
			AudioLibrary.OnSongsUpdateListener paramOnSongsUpdateListener) {
		// if (paramVector != null)
		// try
		// {
		// if (paramVector.size() != 0)
		// {
		// localObject4 = this._director.K();
		// if ((localObject4 == null) || (((Control4Rhapsody)localObject4).e()))
		// break label300;
		// localGetRhapsodyTracksCommand =
		// (GetRhapsodyTracksCommand)RhapsodyCommandFactory.GetRhapsodyTracksProvider.a();
		// localObject2 = new Vector();
		// Iterator localIterator = paramVector.iterator();
		// while (localIterator.hasNext())
		// {
		// Song localSong = (Song)localIterator.next();
		// if (localSong == null)
		// continue;
		// ((Vector)localObject2).add(localSong.at());
		// localGetRhapsodyTracksCommand.a("song-" + localSong.at(), localSong);
		// ((DirectorSong)localSong).e(true);
		// }
		// }
		// }
		// catch (Exception i)
		// {
		// Object localObject4;
		// GetRhapsodyTracksCommand localGetRhapsodyTracksCommand;
		// Object localObject2;
		// Ln.e(localException);
		// Object localObject1 = paramVector.iterator();
		// while (((Iterator)localObject1).hasNext())
		// {
		// localObject2 = (Song)((Iterator)localObject1).next();
		// if (localObject2 == null)
		// continue;
		// ((DirectorSong)localObject2).e(false);
		// continue;
		// localGetRhapsodyTracksCommand.a((Vector)localObject2);
		// localGetRhapsodyTracksCommand.a("results in library",
		// Boolean.valueOf(true));
		// localGetRhapsodyTracksCommand.a("listener", new
		// DirectorRhapsodyAudioLibrary.1(this, paramVector,
		// paramOnSongsUpdateListener));
		// Object localObject3 =
		// ((Control4Rhapsody)localObject4).a(localGetRhapsodyTracksCommand);
		// if (localObject3 == 0)
		// {
		// localObject4 = paramVector.iterator();
		// while (((Iterator)localObject4).hasNext())
		// {
		// localObject1 = (Song)((Iterator)localObject4).next();
		// if (localObject1 == null)
		// continue;
		// ((DirectorSong)localObject1).e(false);
		// }
		// }
		// localObject1 = localObject3;
		// break label298;
		// }
		// i = 0;
		// }
		// label298: label300: for (int i = 0; ; i = 0)
		// return i;
		return false;
	}

	public void g(boolean paramBoolean) {
		if (this.A != null)
			this.E = ((DirectorLookupMap) this.A.d());
		super.g(paramBoolean);
	}
}

/*
 * Location: E:\去哪儿\com.control4.myhome-2\classes_dex2jar.jar Qualified Name:
 * com.control4.director.audio.DirectorRhapsodyAudioLibrary JD-Core Version:
 * 0.6.0
 */