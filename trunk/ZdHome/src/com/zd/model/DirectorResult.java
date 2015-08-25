package com.zd.model;

import java.io.File;
import java.lang.ref.SoftReference;

import roboguice.util.Ln;

import com.google.inject.Inject;
import com.zd.model.Director.DirectorListener;

import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.DisplayMetrics;

public class DirectorResult implements Result {
	public class AddToCacheRunnable implements DirectorListener {

		public AddToCacheRunnable(DirectorResult directorResult, Object object) {
			// TODO Auto-generated constructor stub
		}

		@Override
		public void a() {
			// TODO Auto-generated method stub

		}

		@Override
		public void a(String paramString) {
			// TODO Auto-generated method stub

		}

		@Override
		public void a(boolean paramBoolean) {
			// TODO Auto-generated method stub

		}

		@Override
		public void b() {
			// TODO Auto-generated method stub

		}

		@Override
		public void c() {
			// TODO Auto-generated method stub

		}

		@Override
		public void d() {
			// TODO Auto-generated method stub

		}

		@Override
		public void e() {
			// TODO Auto-generated method stub

		}

		@Override
		public void f() {
			// TODO Auto-generated method stub

		}

		@Override
		public void g() {
			// TODO Auto-generated method stub

		}

		@Override
		public void h() {
			// TODO Auto-generated method stub

		}

		@Override
		public void i() {
			// TODO Auto-generated method stub

		}

		@Override
		public void j() {
			// TODO Auto-generated method stub

		}

	}

	public class DownloadImageRunnable implements Runnable {

		public DownloadImageRunnable(DirectorResult directorResult,
				Object object) {
			// TODO Auto-generated constructor stub
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub

		}

	}

	protected static BitmapFactory.Options R1 = null;
	protected String F;
	protected String G;
	protected boolean H = false;
	protected String I = null;
	protected SoftReference<Bitmap> J = null;
	protected boolean K = false;
	protected boolean L = false;
	protected boolean M = false;
	protected Result.OnImageUpdateListener N = null;
	protected String O = null;
	protected String P = null;
	protected boolean Q = false;

	@Inject
	protected Control4Director _director;

	protected String D_() {
		StringBuilder localStringBuilder = new StringBuilder(this._director.I());
		localStringBuilder.append(s_());
		localStringBuilder.append("/");
		localStringBuilder.append(E_());
		if (!this.K)
			localStringBuilder.append("_m");
		localStringBuilder.append(".jpg");
		return localStringBuilder.toString();

	}

	public DirectorCache E() {
		return null;
	}

	public String E_() {
		return this.I;
	}

	public int a(Result paramResult) {
		int i = 1;
		if (paramResult != null) {
			String str1 = au();
			String str2 = paramResult.au();
			if (str1 != null) {
				if (str2 != null)
					i = str1.compareToIgnoreCase(str2);
				else
					i = -1;
			} else if (str2 == null)
				i = 0;
		}
		return i;
	}

	public void a(Control4Director paramControl4Director) {
		this._director = paramControl4Director;
	}

	public void a(DirectorResult paramDirectorResult) {
		if (paramDirectorResult == null)
			return;

		try {
			Object localObject = paramDirectorResult.at();
			if ((localObject != null) && (((String) localObject).length() > 0))
				l((String) localObject);
			localObject = paramDirectorResult.au();
			if ((localObject != null) && (((String) localObject).length() > 0))
				m((String) localObject);
			localObject = paramDirectorResult.E_();
			if ((localObject != null) && (((String) localObject).length() > 0))
				n((String) localObject);
			localObject = paramDirectorResult.p();
			if (localObject == null)
				return;
			this.J = new SoftReference(localObject);
			this.K = paramDirectorResult.t();
			this.M = paramDirectorResult.s();
		} catch (Exception localException) {
		}

	}

	public void a(Result.OnImageUpdateListener paramOnImageUpdateListener) {
		this.N = paramOnImageUpdateListener;
	}

	public void a(boolean paramBoolean) {
		this.Q = paramBoolean;
	}

	public void a(boolean paramBoolean,
			Result.OnImageUpdateListener paramOnImageUpdateListener) {
		try {
			if (((!this.L) || (paramBoolean)) && (this.I != null)
					&& (this.I.length() != 0)) {
				this.L = true;
				this.K = paramBoolean;
				if (paramOnImageUpdateListener != null)
					a(paramOnImageUpdateListener);
				this._director.b(new DirectorResult.DownloadImageRunnable(this,
						null));
			}
		} catch (Exception localException) {
			Ln.e(localException);
			this.L = false;
		}
	}

	public boolean a(SQLiteDatabase paramSQLiteDatabase) {
		return false;
	}

	public String at() {
		return this.F;
	}

	public String au() {
		return this.G;
	}

	public String av() {
		String str = null;
		if (this.O == null)
			return str;

		str = this.O;

		try {
			if (this._director != null) {
				File file = this._director.H().a();
				if (file != null) {
					StringBuilder sb = new StringBuilder(file.getAbsolutePath());
					sb.append(File.separator);
					sb.append(s_());
					sb.append(File.separator);
					sb.append(at());
					sb.append(".jpg");
					this.O = sb.toString();
					str = this.O;
				}
			}
		} catch (Exception localException) {
			Ln.e(localException);
			this.O = str;
		}
		return this.O;
	}

	protected BitmapFactory.Options aw() {
		Object localObject = this._director.e();
		if (localObject == null) {
			localObject = null;
		} else {
			if (R1 == null)
				R1 = new BitmapFactory.Options();
			R1.inDensity = ((DisplayMetrics) localObject).densityDpi;
			R1.inTargetDensity = ((DisplayMetrics) localObject).densityDpi;
			R1.inPurgeable = true;
			R1.inScaled = true;
			R1.inSampleSize = 1;
			localObject = R1;
		}
		return (BitmapFactory.Options) localObject;
	}

	public Result.OnImageUpdateListener ax() {
		return this.N;
	}

	public Bitmap b(boolean paramBoolean) {
		Bitmap localBitmap = null;
		try {
			if (((!this.L) || (paramBoolean)) && (this.I != null)
					&& (this.I.length() != 0)) {
				this.L = true;
				this.K = paramBoolean;
				new DirectorResult.DownloadImageRunnable(this, null).run();
				if ((this.J != null) && (this.J.get() != null)) {
					localBitmap = (Bitmap) this.J.get();
				}
			}
		} catch (Exception localException) {
			while (true) {
				Ln.e(localException);
				this.L = false;
				if ((this.J == null) || (this.J.get() == null))
					break;
				localBitmap = (Bitmap) this.J.get();

			}
		}
		return localBitmap;
	}

	public boolean c(SQLiteDatabase paramSQLiteDatabase) {
		return false;
	}

	public void h() {
		if (!this.Q) {
			Bitmap localBitmap;
			if ((this.J == null) || (this.J.get() == null)) {
				localBitmap = null;
			} else {
				localBitmap = (Bitmap) this.J.get();
				this.J.clear();
				this.J = null;
			}
			if (this.N != null)
				this.N.c(this);
			if (localBitmap != null)
				;
			this.M = false;
			this.L = false;
			this.K = false;
		}
	}

	public void l(String paramString) {
		this.F = paramString;
	}

	public void m(String paramString) {
		this.G = paramString;
	}

	public void n(String paramString) {
		this.I = paramString;
	}

	public void o(String paramString) {
		this.P = paramString;
	}

	public boolean o() {
		return this.H;
	}

	public Bitmap p() {
		Bitmap localBitmap = null;
		if ((this.J != null) && (this.J.get() != null))
			localBitmap = (Bitmap) this.J.get();
		return localBitmap;
	}

	public boolean q() {
		Bitmap localBitmap = null;
		int i = 0;
		try {
			if ((this.I != null) && (this.I.length() != 0)) {
				File localFile = new File(av());
				if (localFile.exists())
					localBitmap = BitmapFactory.decodeFile(localFile
							.getAbsolutePath());
				if (localBitmap != null) {
					this.J = new SoftReference(localBitmap);
					if (this.N != null)
						this.N.b(this);
					this._director.b(new DirectorResult.AddToCacheRunnable(
							this, null));
					i = 1;
				}
			}
		} catch (Exception localException) {
			Ln.e(localException);
		}
		return false;
	}

	public boolean r() {
		return this.L;
	}

	public boolean s() {
		return this.M;
	}

	protected String s_() {
		return "result";
	}

	public boolean t() {
		return this.K;
	}

	public String toString() {
		return "DirectorResult [_id=" + this.F + ", _name=" + this.G + "]";
	}

	public String u() {
		return au();
	}

	public String v() {
		return null;
	}

	public String w() {
		return v();
	}

	public boolean x() {
		return this.Q;
	}

	public String y() {
		return this.P;
	}

	@Override
	public int compareTo(Result another) {
		// TODO Auto-generated method stub
		return 0;
	}
}
