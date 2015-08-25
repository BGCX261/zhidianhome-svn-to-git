package com.zd.model;

import java.io.File;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class MediaDatabaseHelper extends SQLiteOpenHelper {
	public MediaDatabaseHelper(Context context, String name,
			CursorFactory factory, int version) {
		super(context, name, factory, version);
		// TODO Auto-generated constructor stub
	}

	private static final String a = "media.db3";
	private static final int b = 4;

	// // ERROR //
	public MediaDatabaseHelper(Context paramContext, String paramString) {
		super(paramContext, paramString, null, 1);
	}

	public static void a(Context paramContext, String paramString) {
		if (!paramString.equals("DEMO")) {
			File localFile = paramContext.getDatabasePath(paramString
					+ "media.db3");
			if (localFile.exists())
				localFile.delete();
		}
	}

	public void onCreate(SQLiteDatabase paramSQLiteDatabase) {
	}

	public void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1,
			int paramInt2) {
	}
}

/*
 * Location: E:\去哪儿\com.control4.myhome-2\classes_dex2jar.jar Qualified Name:
 * com.control4.director.data.MediaDatabaseHelper JD-Core Version: 0.6.0
 */