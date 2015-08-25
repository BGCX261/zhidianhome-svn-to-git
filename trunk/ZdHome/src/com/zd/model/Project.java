package com.zd.model;

import java.io.Flushable;

import android.database.sqlite.SQLiteDatabase;
import android.location.Location;

import com.zd.model.device.Device;
import com.zd.model.device.Light;
import com.zd.model.device.WakeupControls;

public abstract interface Project extends Flushable {
	// public abstract CustomButtonScreen a(int paramInt1, int paramInt2);

	public abstract Site a(int paramInt);

	public abstract void a(SQLiteDatabase paramSQLiteDatabase);

	public abstract boolean a();

	// public abstract int b(Building paramBuilding);

	// public abstract int b(Floor paramFloor);

	// public abstract int b(LightingScene paramLightingScene);

	public abstract int setRoom(Room paramRoom);

	public abstract int setSite(Site paramSite);

	public abstract Site getSite(int paramInt);

	public abstract Device b(int paramInt, boolean paramBoolean,
			SQLiteDatabase paramSQLiteDatabase);

	public abstract void b(SQLiteDatabase paramSQLiteDatabase);

	public abstract boolean b();

	public abstract Building c(int paramInt);

	public abstract boolean c();

	public abstract boolean c(SQLiteDatabase paramSQLiteDatabase);

	public abstract Building d(int paramInt);

	public abstract boolean d();

	public abstract Floor e(int paramInt);

	public abstract String e();

	public abstract Floor f(int paramInt);

	public abstract String f();

	public abstract Room getEnableRoom(int paramInt);

	public abstract String g();

	public abstract Room getRoom(int paramInt);

	public abstract Room getRoombyID(int paramInt);

	public abstract String h();

	public abstract boolean h(SQLiteDatabase paramSQLiteDatabase);

	public abstract LightingScene i(int paramInt);

	public abstract boolean i();

	public abstract LightingScene j(int paramInt);

	public abstract boolean loadLights(SQLiteDatabase paramSQLiteDatabase);

	public abstract int k();

	public abstract Device k(int paramInt);

	public abstract boolean loadContactDevices(
			SQLiteDatabase paramSQLiteDatabase);

	public abstract int l();

	public abstract boolean l(SQLiteDatabase paramSQLiteDatabase);

	public abstract int m();

	// public abstract CustomButtonScreen m(int paramInt);

	public abstract int n();

	public abstract Location n(int paramInt);

	public abstract boolean loadProjectInfo(SQLiteDatabase paramSQLiteDatabase);

	public abstract int o();

	public abstract void o(int paramInt);

	public abstract int p();

	// public abstract Thermostat p(int paramInt);

	public abstract int q();

	// public abstract Thermostat q(int paramInt);

	public abstract int r();

	public abstract Light r(int paramInt);

	public abstract Room s();

	public abstract Light s(int paramInt);

	public abstract int t();

	public abstract ContactDevice t(int paramInt);

	public abstract int u();

	public abstract int v();

	public abstract WakeupControls w();

	public abstract boolean x();
}
