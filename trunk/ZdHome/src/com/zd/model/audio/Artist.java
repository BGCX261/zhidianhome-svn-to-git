package com.zd.model.audio;

import com.zd.model.Result;
import com.zd.model.Results;

public abstract interface Artist extends Result {
	public class OnArtistUpdateListener {

	}

	public class OnArtistTopTracksListener {

	}

	public class OnArtistTopAlbumsListener {

	}

	public class OnRelatedArtistsListener {

	}

	public class OnArtistSamplerListener {

	}

	public static final String a_ = "(Empty)";

	public abstract Results<Album> A();

	public abstract boolean B();

	public abstract boolean C();

	public abstract boolean D();

	public abstract boolean F();

	public abstract boolean G();

	public abstract boolean H();

	public abstract Results<Song> I();

	public abstract boolean J();

	public abstract boolean K();

	public abstract boolean L();

	public abstract Results<Artist> M();

	public abstract void N();

	public abstract void O();

	public abstract void P();

	public abstract void Q();

	public abstract CharSequence R();

	public abstract CharSequence S();

	public abstract boolean T();

	public abstract boolean U();

	public abstract Results<Album> V();

	public abstract int W();

	public abstract boolean X();

	public abstract boolean Y();

	public abstract String Z();

	public abstract Album a(int paramInt);

	public abstract boolean a(
			Artist.OnArtistSamplerListener paramOnArtistSamplerListener);

	public abstract boolean a(
			Artist.OnArtistTopAlbumsListener paramOnArtistTopAlbumsListener);

	public abstract boolean a(
			Artist.OnArtistTopTracksListener paramOnArtistTopTracksListener);

	public abstract boolean a(
			Artist.OnArtistUpdateListener paramOnArtistUpdateListener);

	public abstract boolean a(
			Artist.OnRelatedArtistsListener paramOnRelatedArtistsListener);

	public abstract boolean a(String paramString,
			Artist.OnArtistUpdateListener paramOnArtistUpdateListener);

	public abstract boolean a(boolean paramBoolean, String paramString);

	public abstract Results<Album> aa();

	public abstract int ab();

	public abstract boolean ac();

	public abstract void ad();

	public abstract void ae();

	public abstract Album b(int paramInt);

	public abstract void b(
			Artist.OnArtistSamplerListener paramOnArtistSamplerListener);

	public abstract void b(
			Artist.OnArtistTopAlbumsListener paramOnArtistTopAlbumsListener);

	public abstract void b(
			Artist.OnArtistTopTracksListener paramOnArtistTopTracksListener);

	public abstract void b(
			Artist.OnArtistUpdateListener paramOnArtistUpdateListener);

	public abstract void b(
			Artist.OnRelatedArtistsListener paramOnRelatedArtistsListener);

	public abstract Album f(String paramString);

	public abstract void g(String paramString);

	public abstract Album h(String paramString);

	public abstract Channel i();

	public abstract boolean m();

	public abstract boolean n();

	public abstract Results<Song> r_();

	public abstract boolean z();
}

/*
 * Location: E:\去哪儿\com.control4.myhome-2\classes_dex2jar.jar Qualified Name:
 * com.control4.director.audio.Artist JD-Core Version: 0.6.0
 */