package com.zd.home.service;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.Vector;

import android.content.SharedPreferences;

import com.google.inject.Inject;
import com.zd.home.director.DirectorConnection;

public class MyHomePreferenceService implements PreferenceService {
	private static final Method b;

	@Inject
	private SharedPreferences _prefs;
	static boolean a;;
	static {

		if (MyHomePreferenceService.class.desiredAssertionStatus())
			a = false;
		else
			a = true;
		b = o();
	}

	private static void a(SharedPreferences.Editor paramEditor) {
		if (b != null)
			;
		try {
			b.invoke(paramEditor, new Object[0]);
			return;
		} catch (IllegalAccessException localIllegalAccessException) {

		} catch (InvocationTargetException localInvocationTargetException) {

		}
	}

	private static Method o() {
		try {
			Method localMethod = SharedPreferences.Editor.class.getMethod(
					"apply", new Class[0]);
			return localMethod;
		} catch (NoSuchMethodException localNoSuchMethodException) {

		}
		return null;
	}

	public int a(String paramString, int paramInt) {
		return this._prefs.getInt(Preferences.d + paramString + "_" + paramInt,
				0);
	}

	public Vector<DirectorConnection> a() {
		String[] arrayOfString1 = this._prefs.getString(Preferences.b, "")
				.split("\\,");
		Vector localVector = new Vector(arrayOfString1.length);
		for (int i = 0;; i++) {
			if (i >= arrayOfString1.length)
				return localVector;
			String[] arrayOfString2 = arrayOfString1[i].split("\\|");
			if ((!a) && (arrayOfString2.length != 3))
				break;
			if (arrayOfString2.length != 3)
				continue;
			localVector.add(new DirectorConnection(arrayOfString2[0], Integer
					.parseInt(arrayOfString2[1]), arrayOfString2[2]));
		}
		throw new AssertionError();
	}

	public void a(int paramInt) {
		SharedPreferences.Editor localEditor = this._prefs.edit();
		localEditor.putInt(Preferences.f, paramInt);
		a(localEditor);
	}

	public void a(long paramLong) {
		SharedPreferences.Editor localEditor = this._prefs.edit();
		localEditor.putLong(Preferences.l, paramLong);
		a(localEditor);
	}

	public void a(DirectorConnection paramDirectorConnection) {
		SharedPreferences.Editor localEditor = this._prefs.edit();
		if (paramDirectorConnection == null) {
			localEditor.remove(Preferences.c);
		} else {
			StringBuilder localStringBuilder = new StringBuilder();
			localStringBuilder.append(paramDirectorConnection.a());
			localStringBuilder.append(",");
			localStringBuilder.append(paramDirectorConnection.b());
			localStringBuilder.append(",");
			localStringBuilder.append(paramDirectorConnection.c());
			localEditor.putString(Preferences.c, localStringBuilder.toString());
		}
		a(localEditor);
	}

	public void a(String paramString) {
		SharedPreferences.Editor localEditor = this._prefs.edit();
		localEditor.putString(Preferences.q, paramString);
		a(localEditor);
	}

	public void a(String paramString, int paramInt1, int paramInt2) {
		SharedPreferences.Editor localEditor = this._prefs.edit();
		localEditor.putInt(Preferences.d + paramString + "_" + paramInt1,
				paramInt2);
		a(localEditor);
	}

	public void a(Date paramDate) {
		SharedPreferences.Editor localEditor = this._prefs.edit();
		localEditor.putLong(Preferences.s, paramDate.getTime());
		a(localEditor);
	}

	public void a(Vector<DirectorConnection> paramVector) {
		StringBuilder localStringBuilder = new StringBuilder();
		SharedPreferences.Editor localEditor;
		for (int i = 0;; i++) {
			if (i >= paramVector.size()) {
				localEditor = this._prefs.edit();
				localEditor.putString(Preferences.b,
						localStringBuilder.toString());
				a(localEditor);
				return;
			}
			DirectorConnection localDirectorConnection = (DirectorConnection) paramVector
					.get(i);
			if (localStringBuilder.length() > 0)
				localStringBuilder.append(",");
			localStringBuilder.append(localDirectorConnection.a());
			localStringBuilder.append("|");
			localStringBuilder.append(localDirectorConnection.b());
			localStringBuilder.append("|");
			localStringBuilder.append(localDirectorConnection.c());
		}
	}

	public void a(boolean paramBoolean) {
		SharedPreferences.Editor localEditor = this._prefs.edit();
		localEditor.putBoolean(Preferences.e, paramBoolean);
		a(localEditor);
	}

	public DirectorConnection b() {
		DirectorConnection rst = null;
		String[] localObject = this._prefs.getString(Preferences.c, "").split(
				"\\,");
		if (localObject.length == 3)
			rst = new DirectorConnection(localObject[0],
					Integer.parseInt(localObject[1]), localObject[2]);

		return rst;
	}

	public void b(int paramInt) {
		SharedPreferences.Editor localEditor = this._prefs.edit();
		localEditor.putInt(Preferences.n, paramInt);
		a(localEditor);
	}

	public void b(String paramString) {
		SharedPreferences.Editor localEditor = this._prefs.edit();
		localEditor.putString(Preferences.r, paramString);
		a(localEditor);
	}

	public void b(boolean paramBoolean) {
		SharedPreferences.Editor localEditor = this._prefs.edit();
		localEditor.putBoolean(Preferences.g, paramBoolean);
		a(localEditor);
	}

	public void c(boolean paramBoolean) {
		SharedPreferences.Editor localEditor = this._prefs.edit();
		localEditor.putBoolean(Preferences.m, paramBoolean);
		a(localEditor);
	}

	public boolean c() {
		return this._prefs.getBoolean(Preferences.e, true);
	}

	public int d() {
		return this._prefs.getInt(Preferences.f, 0);
	}

	public void d(boolean paramBoolean) {
		SharedPreferences.Editor localEditor = this._prefs.edit();
		localEditor.putBoolean(Preferences.o, paramBoolean);
		a(localEditor);
	}

	public void e(boolean paramBoolean) {
		SharedPreferences.Editor localEditor = this._prefs.edit();
		localEditor.putBoolean(Preferences.p, paramBoolean);
		a(localEditor);
	}

	public boolean e() {
		return this._prefs.getBoolean(Preferences.g, false);
	}

	public long f() {
		return this._prefs.getLong(Preferences.l, 0L);
	}

	public void f(boolean paramBoolean) {
		SharedPreferences.Editor localEditor = this._prefs.edit();
		localEditor.putBoolean(Preferences.t, paramBoolean);
		a(localEditor);
	}

	public boolean g() {
		return this._prefs.getBoolean(Preferences.m, false);
	}

	public int h() {
		return this._prefs.getInt(Preferences.n, 0);
	}

	public boolean i() {
		return this._prefs.getBoolean(Preferences.o, false);
	}

	public boolean j() {
		return this._prefs.getBoolean(Preferences.p, true);
	}

	public String k() {
		return this._prefs.getString(Preferences.q, "");
	}

	public String l() {
		return this._prefs.getString(Preferences.r, "");
	}

	public Date m() {
		return new Date(this._prefs.getLong(Preferences.s, 0L));
	}

	public boolean n() {
		return this._prefs.getBoolean(Preferences.t, true);
	}
}
