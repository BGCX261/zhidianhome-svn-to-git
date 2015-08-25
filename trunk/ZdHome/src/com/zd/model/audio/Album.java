package com.zd.model.audio;

import android.database.sqlite.SQLiteDatabase;

import com.zd.model.Result;
import com.zd.model.Results;

public abstract interface Album extends Result {
	public class OnAlbumUpdateListener {

	}

	public abstract void A();

	public abstract boolean B();

	public abstract boolean C();

	public abstract boolean D();

	public abstract boolean F();

	public abstract String G();

	public abstract String H();

	public abstract String I();

	public abstract String J();

	public abstract String K();

	public abstract Results<Song> L();

	public abstract Song O();

	public abstract Song a(int paramInt);

	public abstract boolean a(int paramInt, boolean paramBoolean);

	public abstract boolean a(
			Album.OnAlbumUpdateListener paramOnAlbumUpdateListener);

	public abstract void b(
			Album.OnAlbumUpdateListener paramOnAlbumUpdateListener);

	public abstract boolean b(SQLiteDatabase paramSQLiteDatabase);

	public abstract void c(
			Album.OnAlbumUpdateListener paramOnAlbumUpdateListener);

	public abstract Song d(String paramString);

	public abstract boolean d(boolean paramBoolean);

	public abstract int e();

	public abstract boolean f();

	public abstract boolean g();

	public abstract AudioLibrary z();
}
