package com.zd.model;

import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;

public abstract interface Result extends Identifiable, Cache.Cacheable,
		Comparable<Result> {
	public abstract interface OnImageUpdateListener {
		public abstract void b(Result paramResult);

		public abstract void c(Result paramResult);
	}

	public abstract void a(boolean paramBoolean);

	public abstract void a(boolean paramBoolean,
			Result.OnImageUpdateListener paramOnImageUpdateListener);

	public abstract boolean a(SQLiteDatabase paramSQLiteDatabase);

	public abstract Bitmap b(boolean paramBoolean);

	public abstract boolean o();

	public abstract Bitmap p();

	public abstract boolean q();

	public abstract boolean r();

	public abstract boolean s();

	public abstract boolean t();

	public abstract String u();

	public abstract String v();

	public abstract String w();

	public abstract boolean x();

	public abstract String y();
}
