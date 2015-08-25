package com.zd.model.rhapsody;

import java.util.ArrayList;

import com.zd.model.audio.Album;
import com.zd.model.audio.Artist;
import com.zd.model.audio.Song;

public abstract interface RhapsodySearch {
	public enum SearchType {
		a, b, c, d, e
	}

	public abstract interface OnRecentSearchResults {
		public abstract void a(RhapsodySearch.SearchType paramSearchType,
				ArrayList<String> paramArrayList);
	}

	public abstract interface OnSearchForAlbumsResults {
		public abstract void a(ArrayList<Album> paramArrayList);
	}

	public abstract interface OnSearchForArtistResults {
		public abstract void a(ArrayList<Artist> paramArrayList);
	}

	public abstract interface OnSearchForComposersResults {
		public abstract void a(ArrayList<Artist> paramArrayList);
	}

	public abstract interface OnSearchForTracksResults {
		public abstract void a(ArrayList<Song> paramArrayList);
	}

	public abstract boolean a(RhapsodySearch.SearchType paramSearchType,
			RhapsodySearch.OnRecentSearchResults paramOnRecentSearchResults);

	public abstract boolean a(
			String paramString,
			RhapsodySearch.OnSearchForAlbumsResults paramOnSearchForAlbumsResults);

	public abstract boolean a(
			String paramString,
			RhapsodySearch.OnSearchForArtistResults paramOnSearchForArtistResults);

	public abstract boolean a(
			String paramString,
			RhapsodySearch.OnSearchForComposersResults paramOnSearchForComposersResults);

	public abstract boolean a(
			String paramString,
			RhapsodySearch.OnSearchForTracksResults paramOnSearchForTracksResults);

	public abstract boolean b(
			String paramString,
			RhapsodySearch.OnSearchForTracksResults paramOnSearchForTracksResults);
}
