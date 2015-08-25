package com.zd.model;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

import com.zd.home.R;

public class ProjectDatabaseHelper extends SQLiteOpenHelper {
	private static final String a = "_project.db3";
	private static final int b = 4;

	public ProjectDatabaseHelper(Context context, String name,
			CursorFactory factory, int version) {
		super(context, name, factory, version);
	}

	public ProjectDatabaseHelper(Context context, String s) {
		super(context, (new StringBuilder()).append(s).append("_project.db3")
				.toString(), null, 4);
		File obj = context.getDatabasePath((new StringBuilder()).append(s)
				.append("_project.db3").toString());
		boolean flag = false;
		int i;
		byte abyte0[];
		if (obj.exists()) {
			SQLiteDatabase obj1 = context.openOrCreateDatabase(
					(new StringBuilder()).append(s).append("_project.db3")
							.toString(), 0, null);
			try {
				i = obj1.getVersion();
			} catch (SQLiteException sqliteexception2) {

				flag = false;
				return;
			}
			if (i != 4)
				flag = true;
			else
				flag = false;
			if (!flag)
				return;

			if (obj1 != null && obj1.isOpen())
				obj1.close();
		}

		// _L7:
		else {
			if (!((File) (obj)).exists() || s.equals("DEMO"))
				if (s.equals("DEMO")) {
					// Ln.c("Copying demo project database file.", new
					// Object[0]);
					flag = true;
				} else {
					// Ln.c("Copying new project database file", new Object[0]);
					flag = true;
				}
			if (flag) {
				(new File(obj.getParent())).mkdirs();
				InputStream obj3 = null;
				try {
					if (s.equals("DEMO"))
						obj3 = context.getResources().openRawResource(
								R.raw.demo_project);
					else
						obj3 = context.getResources().openRawResource(
								R.raw.project);
					FileOutputStream fs = new FileOutputStream(obj);

					for (abyte0 = new byte[2048]; obj3.read(abyte0) > 0; fs
							.write(abyte0))
						;
					fs.close();
					obj3.close();
				} catch (Exception e) {
					// TODO: handle exception
				}

			}
		}

	}

	public static void a(Context paramContext, String paramString) {
		if (!paramString.equals("DEMO")) {
			File localFile = paramContext.getDatabasePath(paramString
					+ "_project.db3");
			if (localFile.exists())
				localFile.delete();
		}
	}

	public static boolean a() {
		return false;
	}

	public void onCreate(SQLiteDatabase paramSQLiteDatabase) {
	}

	public void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1,
			int paramInt2) {

	}
}
