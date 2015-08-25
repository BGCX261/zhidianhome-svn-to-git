package com.zd.home.service;

import java.io.File;

import roboguice.util.Ln;

import com.google.inject.Inject;
import com.zd.model.Director;

public class FileServiceImpl implements FileService {

	@Inject
	private Director _director;
	private File a = null;

	public static boolean a(File paramFile) {
		// int i = 0;
		// while (true)
		// {
		// try
		// {
		// if (paramFile.exists())
		// {
		// File[] arrayOfFile = paramFile.listFiles();
		// int j = i;
		// if (j < arrayOfFile.length)
		// {
		// if (!arrayOfFile[j].isDirectory())
		// continue;
		// a(arrayOfFile[j]);
		// break label69;
		// arrayOfFile[j].delete();
		// }
		// }
		// }
		// catch (Exception localException)
		// {
		// Ln.e(localException);
		// return i;
		// }
		// i = paramFile.delete();
		// i = i;
		// continue;
		// label69: localException++;
		// }
		return false;
	}

	public File a() {
		// try
		// {
		// Object localObject;
		// if (this.a == null)
		// {
		// localObject = Environment.getExternalStorageDirectory();
		// if (!this._director.G())
		// break label198;
		// }
		// for (String str = "demo"; ; str = str)
		// {
		// localObject = ((File)localObject).getAbsolutePath() +
		// "/Android/data/com.control4.myhome/files/media/" + str;
		// this.a = new File((String)localObject);
		// this.a.mkdirs();
		// new File((String)localObject + "/album").mkdirs();
		// new File((String)localObject + "/movie").mkdirs();
		// new File((String)localObject + "/channel").mkdirs();
		// new File((String)localObject + "/station").mkdirs();
		// return this.a;
		// label198: str = this._director.k();
		// }
		// }
		// catch (Exception localException)
		// {
		// Ln.e(localException);
		// }
		return null;
	}

	public void b() {
		try {
			a(a());
			this.a = null;
			return;
		} catch (Exception localException) {
			Ln.e(localException);
		}
	}
}
