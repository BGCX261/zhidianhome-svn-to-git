package com.zd.model;

import java.io.IOException;
import java.util.HashMap;
import java.util.Vector;

import roboguice.util.Ln;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.location.Location;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.zd.model.device.Device;
import com.zd.model.device.DeviceFactory;
import com.zd.model.device.DirectorContactDevice;
import com.zd.model.device.DirectorDevice;
import com.zd.model.device.DirectorWakeupControls;
import com.zd.model.device.Light;
import com.zd.model.device.Thermostat;
import com.zd.model.device.WakeupControls;

public class DirectorProject implements Project {

	private static final boolean Y = false;

	@Inject
	private Provider<DirectorCustomButton> _customButtonProvider;

	@Inject
	private Control4Director _director;

	@Inject
	private Provider<LightingScene> _lightingScenesProvider;

	@Inject
	private Provider<DirectorRoom> _roomProvider;

	@Inject
	private Provider<DirectorWakeupControls> _wakeupProvider;
	int a = -1;
	private HashIndex<Integer, Site> b = null;
	private HashIndex<Integer, Building> c = null;
	private HashIndex<Integer, Floor> d = null;
	private HashIndex<Integer, Room> e = null;
	private HashIndex<Integer, Room> f = null;
	private HashIndex<Integer, DirectorDevice> g = null;
	private HashMap<Integer, DirectorDevice> h = new HashMap<Integer, DirectorDevice>();
	private HashIndex<Integer, LightingScene> i = null;
	private HashIndex<Integer, Light> j = null;
	private HashIndex<String, CustomButtonScreen> k = null;
	private HashIndex<Integer, Thermostat> l = null;
	private HashMap<Integer, Integer> m = null;
	private HashIndex<Integer, ContactDevice> n = null;
	private boolean o = true;
	private boolean p = true;
	private boolean q = true;
	private boolean r = true;
	private boolean s = false;
	private String t = null;
	private String u = null;
	private String v = null;
	private String w = null;
	private DirectorWakeupControls x;
	private boolean y = false;

	public boolean c(SQLiteDatabase paramSQLiteDatabase) {
		try {
			Ln.e("Loading Project from Database...", new Object[0]);
			j();
			if (paramSQLiteDatabase != null) {
				this.y = true;
				m(paramSQLiteDatabase);
				if (!loadProjectInfo(paramSQLiteDatabase))
					Ln.e("Unable to load project info from database.",
							new Object[0]);

				if (!loadSites(paramSQLiteDatabase)) {
					Ln.e("Unable to load project sites from database.",
							new Object[0]);
					this.y = false;

				}

				if (!loadBuildings(paramSQLiteDatabase)) {
					Ln.e("Unable to load project buildings from database.",
							new Object[0]);
					this.y = false;
				}

				if (!loadFloors(paramSQLiteDatabase)) {
					Ln.e("Unable to load project floors from database.",
							new Object[0]);
					this.y = false;
				}

				if (!loadRooms(paramSQLiteDatabase)) {
					Ln.e("Unable to load project rooms from database.",
							new Object[0]);
					this.y = false;
				}

				this.o = true;
				initLights();
				h(paramSQLiteDatabase);
				this.r = true;
				z();
				i(paramSQLiteDatabase);

				this.y = l(paramSQLiteDatabase);
			}

		}

		catch (Exception localException3) {
			localException3.printStackTrace();
		}
		return true;
	}

	public CustomButtonScreen a(int paramInt1, int paramInt2) {
		String key;
		CustomButtonScreen cbs = null;
		if (this.k != null) {
			key = new String(paramInt1 + "-" + paramInt2);
			cbs = (CustomButtonScreen) this.k.a(key);
		}

		return cbs;
	}

	public Site a(int paramInt) {
		Site localSite;
		if (this.b != null)
			localSite = (Site) this.b.a(paramInt);
		else
			localSite = null;
		return localSite;
	}

	// // ERROR //

	public DirectorDevice a(int paramInt, boolean paramBoolean,
			SQLiteDatabase sqlitedatabase) {
		DirectorDevice localDirectorDevice = null;
		Device localDevice1 = null;
		int i1 = 0;
		if (this.g != null)
			localDirectorDevice = this.g.a(Integer.valueOf(paramInt));
		if (localDirectorDevice != null)
			localDevice1 = this.h.get(Integer.valueOf(paramInt));
		if (localDevice1 != null)
			i1 = localDevice1.t();
		if ((i1 == -1) || (this.g == null))
			localDirectorDevice = (DirectorDevice) this.g
					.a(Integer.valueOf(i1));

		if (paramBoolean)
			localDirectorDevice = a(paramInt, sqlitedatabase);
		if (localDirectorDevice != null)
			i1 = localDirectorDevice.y();
		if (i1 > 0) {
			Device localDevice2 = (Device) this.g.a(Integer.valueOf(i1));
			if (localDevice2 != null) {
				localDirectorDevice = null;
			}
		}

		return localDirectorDevice;
	}

	public void a(SQLiteDatabase paramSQLiteDatabase) {
		if (paramSQLiteDatabase == null)
			return;

		// try {
		// paramSQLiteDatabase.delete("sites", null, null);
		// paramSQLiteDatabase.delete("buildings", null, null);
		// paramSQLiteDatabase.delete("floors", null, null);
		// paramSQLiteDatabase.delete("rooms", null, null);
		// paramSQLiteDatabase.delete("devices", null, null);
		// paramSQLiteDatabase.delete("capabilities", null, null);
		// paramSQLiteDatabase.delete("lighting_scenes", null, null);
		// paramSQLiteDatabase.delete("lighting_scene_lights", null, null);
		// paramSQLiteDatabase.delete("custom_button_screens", null, null);
		// paramSQLiteDatabase.delete("custom_buttons", null, null);
		// paramSQLiteDatabase.delete("room_media_devices", null, null);
		// paramSQLiteDatabase.delete("room_cache", null, null);
		// } catch (Exception localException) {
		// Ln.e(localException);
		// }

	}

	public void setBuilding(Building paramBuilding) {
		if (paramBuilding != null) {
			if (this.c == null)
				this.c = new HashIndex<Integer, Building>();
			this.c.a(Integer.valueOf(paramBuilding.a()), paramBuilding);
		}
	}

	public void a(CustomButtonScreen paramCustomButtonScreen) {
		if (paramCustomButtonScreen != null) {
			if (this.k == null)
				this.k = new HashIndex<String, CustomButtonScreen>();
			int i2 = paramCustomButtonScreen.a();
			int i1 = paramCustomButtonScreen.c();
			String str = new String("" + i2 + "-" + i1);
			this.k.a(str, paramCustomButtonScreen);
		}
	}

	public void a(Floor paramFloor) {
		if (paramFloor != null) {
			if (this.d == null)
				this.d = new HashIndex<Integer, Floor>();
			this.d.a(Integer.valueOf(paramFloor.a()), paramFloor);
		}
	}

	public void a(LightingScene paramLightingScene) {
		if (paramLightingScene != null) {
			if (this.i == null)
				this.i = new HashIndex<Integer, LightingScene>();
			this.i.a(Integer.valueOf(paramLightingScene.b()),
					paramLightingScene);
		}
	}

	public void a(Site paramSite) {
		if (paramSite != null) {
			if (this.b == null)
				this.b = new HashIndex<Integer, Site>();
			this.b.a(Integer.valueOf(paramSite.a()), paramSite);
		}
	}

	public void a(String paramString) {
		this.t = paramString;
	}

	public void a(boolean paramBoolean) {
		this.o = paramBoolean;
	}

	public boolean a() {
		return this.o;
	}

	public boolean a(CustomButtonScreen paramCustomButtonScreen,
			SQLiteDatabase paramSQLiteDatabase) {
		return false;
		// int i1;
		// if (paramCustomButtonScreen == null)
		// i1 = 0;
		// while (true)
		// {
		// return i1;
		// try
		// {
		// monitorenter;
		// try
		// {
		// String[] arrayOfString = new String[5];
		// arrayOfString[0] = "button_id";
		// arrayOfString[1] = "name";
		// arrayOfString[2] = "room_id";
		// arrayOfString[3] = "button_screen_id";
		// arrayOfString[4] = "title";
		// localObject1 = new String[2];
		// localObject1[0] = new
		// Integer(paramCustomButtonScreen.a()).toString();
		// localObject1[1] = new
		// Integer(paramCustomButtonScreen.c()).toString();
		// localObject1 = paramSQLiteDatabase.query("custom_buttons",
		// arrayOfString,
		// "button_screen_id = ? AND room_id = ?", localObject1, null, null,
		// "button_id ASC");
		// i7 = ((Cursor)localObject1).getColumnIndexOrThrow("button_id");
		// i4 = ((Cursor)localObject1).getColumnIndexOrThrow("name");
		// i5 = ((Cursor)localObject1).getColumnIndexOrThrow("room_id");
		// i8 =
		// ((Cursor)localObject1).getColumnIndexOrThrow("button_screen_id");
		// i6 = ((Cursor)localObject1).getColumnIndexOrThrow("title");
		// }
		// finally
		// {
		// try
		// {
		// Object localObject1;
		// int i7;
		// int i4;
		// int i5;
		// int i8;
		// int i6;
		// if (((Cursor)localObject1).moveToFirst())
		// {
		// boolean bool;
		// do
		// {
		// int i11 = ((Cursor)localObject1).getInt(i7);
		// String str3 = ((Cursor)localObject1).getString(i4);
		// int i9 = ((Cursor)localObject1).getInt(i5);
		// int i10 = ((Cursor)localObject1).getInt(i8);
		// String str4 = ((Cursor)localObject1).getString(i6);
		// DirectorCustomButton localDirectorCustomButton =
		// (DirectorCustomButton)this._customButtonProvider.a();
		// localDirectorCustomButton.a(i11);
		// localDirectorCustomButton.c(i9);
		// localDirectorCustomButton.b(i11);
		// localDirectorCustomButton.a(str3);
		// localDirectorCustomButton.b(str4);
		// localDirectorCustomButton.b(i10);
		// paramCustomButtonScreen.a(localDirectorCustomButton);
		// bool = ((Cursor)localObject1).moveToNext();
		// }
		// while (bool);
		// }
		// if (localObject1 != null)
		// ((Cursor)localObject1).close();
		// monitorexit;
		// i2 = 1;
		// }
		// finally
		// {
		// int i2;
		// if (i2 != null)
		// i2.close();
		// }
		// }
		// }
		// catch (Exception localException)
		// {
		// Ln.e(localException);
		// if ("Unable to load custom buttons for screen " +
		// paramCustomButtonScreen.b() == null);
		// }
		// }
		// String str2;
		// for (String str1 = paramCustomButtonScreen.b(); ; str2 = "null")
		// {
		// Ln.e(str1, new Object[0]);
		// int i3 = 0;
		// break;
		// }
	}

	public boolean a(LightingScene paramLightingScene,
			SQLiteDatabase paramSQLiteDatabase) {
		int i1;
		if ((paramLightingScene == null) || (paramSQLiteDatabase == null))
			return false;

		Vector<Integer> localVector = new Vector<Integer>();
		i1 = paramLightingScene.b();

		String[] arrayOfString = new String[] { "lighting_scene_id",
				"lighting_scene_device_id" };
		Cursor localObject3 = paramSQLiteDatabase.query(
				"lighting_scene_lights", arrayOfString, "lighting_scene_id=?",
				new String[] { new Integer(i1).toString() }, null, null, null);
		int i4 = localObject3.getColumnIndexOrThrow("lighting_scene_device_id");

		for (localObject3.moveToFirst(); !localObject3.isAfterLast(); localObject3
				.moveToNext()) {
			localVector.add(Integer.valueOf(localObject3.getInt(i4)));
		}
		if (localObject3 != null)
			localObject3.close();

		DirectorDevice localObject4 = a(localVector.elementAt(i4), true,
				paramSQLiteDatabase);
		if (localObject4 != null) {
			DirectorRoom directRoom = (DirectorRoom) getRoom(localObject4.v());
			if ((directRoom != null) && (directRoom.i(i1) == null))
				directRoom.a(paramLightingScene);
		}

		return true;

	}

	public int b(Building paramBuilding) {
		int i1;
		if ((this.c != null) && (paramBuilding != null))
			i1 = this.c.b(paramBuilding);
		else
			i1 = -1;
		return i1;
	}

	public int b(Floor paramFloor) {
		int i1;
		if ((this.d != null) && (paramFloor != null))
			i1 = this.d.b(paramFloor);
		else
			i1 = -1;
		return i1;
	}

	public int b(LightingScene paramLightingScene) {
		int i1;
		if ((this.i != null) && (paramLightingScene != null))
			i1 = this.i.b(paramLightingScene);
		else
			i1 = -1;
		return i1;
	}

	public int setRoom(Room paramRoom) {
		int i1;
		if ((this.e != null) && (paramRoom != null))
			i1 = this.e.b(paramRoom);
		else
			i1 = -1;
		return i1;
	}

	public int b(Site paramSite) {
		int i1;
		if ((this.b != null) && (paramSite != null))
			i1 = this.b.b(paramSite);
		else
			i1 = -1;
		return i1;
	}

	public Site b(int paramInt) {
		Site localSite;
		if (this.b != null)
			localSite = (Site) this.b.a(Integer.valueOf(paramInt));
		else
			localSite = null;
		return localSite;
	}

	public void b(SQLiteDatabase paramSQLiteDatabase) {
		if (paramSQLiteDatabase == null)
			return;
		try {
			paramSQLiteDatabase.delete("album_cache", null, null);
			paramSQLiteDatabase.delete("song_cache", null, null);
			paramSQLiteDatabase.delete("movie_cache", null, null);

			this._director.H().b();
		} catch (Exception localException2) {
			Ln.e(localException2);
		}

	}

	public void b(String paramString) {
		this.u = paramString;
	}

	public void b(boolean paramBoolean) {
		this.p = paramBoolean;
	}

	public boolean b() {
		return this.p;
	}

	public Building c(int paramInt) {
		Building localBuilding;
		if (this.c != null)
			localBuilding = (Building) this.c.a(paramInt);
		else
			localBuilding = null;
		return localBuilding;
	}

	public void c(String paramString) {
		this.v = paramString;
	}

	public void c(boolean paramBoolean) {
		this.q = paramBoolean;
	}

	public boolean c() {
		return this.q;
	}

	public Building d(int paramInt) {
		Building localBuilding;
		if (this.c != null)
			localBuilding = (Building) this.c.a(Integer.valueOf(paramInt));
		else
			localBuilding = null;
		return localBuilding;
	}

	public void d(String paramString) {
		this.w = paramString;
	}

	public void d(boolean paramBoolean) {
		this.r = paramBoolean;
	}

	public boolean d() {
		return this.r;
	}

	// ERROR //
	public boolean loadSites(SQLiteDatabase sqlitedatabase) {
		boolean flag = false;
		if (sqlitedatabase == null)
			return false;

		if (b == null)
			b = new HashIndex<Integer, Site>();

		String as[] = new String[] { "location_id", "name" };
		Cursor cursor = sqlitedatabase.query("sites", as, null, null, null,
				null, "name ASC");
		int j1 = cursor.getColumnIndexOrThrow("location_id");
		int i1 = cursor.getColumnIndexOrThrow("name");
		boolean flag1 = false;
		if (cursor.moveToFirst())
			do {
				a(new DirectorSite(cursor.getInt(j1), cursor.getString(i1)));
				flag1 = cursor.moveToNext();
			} while (flag1);

		cursor.close();

		return true;
		// if(b.b())

	}

	public Floor e(int paramInt) {
		Floor localFloor;
		if (this.d != null)
			localFloor = (Floor) this.d.a(paramInt);
		else
			localFloor = null;
		return localFloor;
	}

	public String e() {
		return this.t;
	}

	public void e(boolean paramBoolean) {
		this.s = paramBoolean;
	}

	// ERROR //e
	public boolean loadBuildings(SQLiteDatabase sqlitedatabase) {
		if (c == null)
			c = new HashIndex<Integer, Building>();

		String as[] = new String[3];
		as[0] = "location_id";
		as[1] = "site_id";
		as[2] = "name";
		Cursor flag = sqlitedatabase.query("buildings", as, null, null, null,
				null, "name ASC");
		int k1 = flag.getColumnIndexOrThrow("location_id");
		int i1 = flag.getColumnIndexOrThrow("site_id");
		int j1 = flag.getColumnIndexOrThrow("name");
		boolean flag1;
		if (flag.moveToFirst())
			do {
				int i2 = flag.getInt(k1);
				int l1 = flag.getInt(i1);
				DirectorBuilding directorbuilding = new DirectorBuilding(i2,
						flag.getString(j1), l1);
				setBuilding(directorbuilding);
				DirectorSite directorsite = (DirectorSite) getSite(l1);
				if (directorsite != null)
					directorsite.a(directorbuilding);
				flag1 = flag.moveToNext();
			} while (flag1);

		flag.close();

		return true;

	}

	public Floor f(int paramInt) {
		Floor localFloor;
		if (this.d != null)
			localFloor = (Floor) this.d.a(Integer.valueOf(paramInt));
		else
			localFloor = null;
		return localFloor;
	}

	public String f() {
		return this.u;
	}

	// // ERROR //f
	public boolean loadFloors(SQLiteDatabase sqlitedatabase) {
		if (d == null)
			d = new HashIndex<Integer, Floor>();

		String as[] = new String[3];
		as[0] = "location_id";
		as[1] = "building_id";
		as[2] = "name";
		Cursor flag = sqlitedatabase.query("floors", as, null, null, null,
				null, "name ASC");
		int k1 = flag.getColumnIndexOrThrow("location_id");
		int i1 = flag.getColumnIndexOrThrow("building_id");
		int j1 = flag.getColumnIndexOrThrow("name");
		boolean flag1 = false;
		if (flag.moveToFirst())
			do {
				int i2 = flag.getInt(k1);
				int l1 = flag.getInt(i1);
				DirectorFloor directorfloor = new DirectorFloor(i2,
						flag.getString(j1), l1);
				a(directorfloor);
				DirectorBuilding directorbuilding = (DirectorBuilding) d(l1);
				if (directorbuilding != null)
					directorbuilding.a(directorfloor);
				flag1 = flag.moveToNext();
			} while (flag1);

		flag.close();

		return true;

	}

	public Room getEnableRoom(int paramInt) {
		Room localRoom;
		if (this.e != null)
			localRoom = (Room) this.e.a(paramInt);
		else
			localRoom = null;
		return localRoom;
	}

	public String g() {
		return this.v;
	}

	/**
	 * 装在房间
	 * 
	 * @param paramSQLiteDatabase
	 * @return
	 */

	public boolean loadRooms(SQLiteDatabase sqlitedatabase) {
		if (e == null)
			e = new HashIndex<Integer, Room>();

		if (f == null)
			f = new HashIndex<Integer, Room>();

		boolean flag;

		String as[] = new String[] { "location_id", "floor_id", "name",
				"hidden" };
		Cursor cursor = sqlitedatabase.query("rooms", as, null, null, null,
				null, "name ASC");
		int k1 = cursor.getColumnIndexOrThrow("location_id");
		int i1 = cursor.getColumnIndexOrThrow("floor_id");
		int j1 = cursor.getColumnIndexOrThrow("name");
		int l1 = cursor.getColumnIndexOrThrow("hidden");
		for (cursor.moveToFirst(); !cursor.isAfterLast(); cursor.moveToNext()) {
			boolean flag2 = false;
			int j2 = cursor.getInt(k1);
			int i2 = cursor.getInt(i1);
			String name = cursor.getString(j1);
			if (cursor.getInt(l1) != 0)
				flag2 = true;

			DirectorRoom directorroom = (DirectorRoom) _roomProvider.get();
			directorroom.a_(j2);
			directorroom.a_(name);
			directorroom.b_(i2);
			directorroom.f(flag2);
			insertRoom(directorroom);

			if (!flag2) {
				DirectorFloor directorfloor = (DirectorFloor) f(i2);
				if (directorfloor != null)
					directorfloor.a(directorroom);
			}
		}

		cursor.close();

		return true;

	}

	public String h() {
		return this.w;
	}

	public LightingScene i(int paramInt) {
		LightingScene localLightingScene;
		if (this.i != null)
			localLightingScene = (LightingScene) this.i.a(paramInt);
		else
			localLightingScene = null;
		return localLightingScene;
	}

	public boolean i() {
		return this.s;
	}

	// // ERROR //
	public boolean i(SQLiteDatabase paramSQLiteDatabase) {
		return false;
	}

	public LightingScene j(int paramInt) {
		LightingScene localLightingScene;
		if (this.i != null)
			localLightingScene = (LightingScene) this.i.a(Integer
					.valueOf(paramInt));
		else
			localLightingScene = null;
		return localLightingScene;
	}

	public boolean k(SQLiteDatabase paramSQLiteDatabase) {

		this.r = false;
		Vector<DirectorDevice> localVector = new Vector<DirectorDevice>();

		String[] localObject3 = new String[8];
		localObject3[0] = "device_id";
		localObject3[1] = "name";
		localObject3[2] = "device_proxy";
		localObject3[3] = "device_control";
		localObject3[4] = "room_id";
		localObject3[5] = "type";
		localObject3[6] = "device_proxy_device_id";
		localObject3[7] = "driver";
		String[] arrayOfString = new String[4];
		arrayOfString[0] = "%contact%";
		arrayOfString[1] = "%relay%";
		arrayOfString[2] = "%c4%";
		arrayOfString[3] = "%blind%";
		Cursor cursor = paramSQLiteDatabase
				.query("devices",
						localObject3,
						new String(
								"device_proxy like ? or device_proxy like ? and device_proxy like ? or device_proxy like ?"),
						arrayOfString, null, null, "name ASC");
		int i4 = cursor.getColumnIndexOrThrow("device_id");
		int i7 = cursor.getColumnIndexOrThrow("name");
		int i5 = cursor.getColumnIndexOrThrow("device_proxy");
		int i3 = cursor.getColumnIndexOrThrow("device_control");
		int i2 = cursor.getColumnIndexOrThrow("room_id");
		int i6 = cursor.getColumnIndexOrThrow("device_proxy_device_id");
		int i8 = cursor.getColumnIndexOrThrow("driver");

		for (cursor.moveToFirst(); !cursor.isAfterLast(); cursor.moveToNext()) {
			int i9 = cursor.getInt(i4);
			String str1 = cursor.getString(i7);
			String str2 = cursor.getString(i5);
			String str3 = cursor.getString(i3);
			int i10 = cursor.getInt(i2);
			int i11 = cursor.getInt(i6);
			String localObject4 = cursor.getString(i8);
			if (i11 > 0) {
				DirectorDevice localObject5 = new DirectorDevice();
				localObject5.d(i9);
				localObject5.setName(str1);
				localObject5.h(str2);
				localObject5.e(i10);
				localObject5.f(i11);
				localObject5.i(str3);
				localObject5.k(localObject4);
				this.h.put(Integer.valueOf(i11), localObject5);
			} else {
				DirectorRoom directorroom = (DirectorRoom) getRoom(i10);
				Device device = (Device) this.h.get(Integer.valueOf(i9));

				DirectorDevice directordevice1 = null;
				if (directorroom != null)
					directordevice1 = (DirectorDevice) directorroom.e(i3);
				if (directordevice1 == null)
					if (!this._director.G()) {
						if (str2 == null)
							str2 = "";
						if (str3 == null)
							str3 = "";

						directordevice1 = DeviceFactory.b(str2, str3,
								localObject4, device);
						if (directordevice1 != null) {
							directordevice1.d(i9);
							directordevice1.setName(str2);
							directordevice1.e(i10);
						}
						if (directordevice1 != null) {
							a(directordevice1);
							localVector.add(directordevice1);
							if (directorroom != null)
								directorroom.a(directordevice1, 0);
						}
					}
			}
		}
		for (int i1 = 0; i1 < localVector.size(); i1++) {
			a(localVector.elementAt(i1), paramSQLiteDatabase);
		}
		return false;

		// localDirectorDevice = (DirectorDevice)localDirectorRoom.e(i9);
		// if (localDirectorDevice != null)
		//
		// }

		// if (bool1.size() > 0);
		// for (boolean bool1 = true; ; bool1 = false)
		// {
		// this.s = bool1;
		// this.r = false;
		// bool1 = true;
		// break;
		// }

	}

	public int l() {
		int i1;
		if (this.c == null)
			i1 = 0;
		else
			i1 = this.c.c();
		return i1;
	}

	public void l(int paramInt) {
		if (a(paramInt, false, null) != null) {
			Device localDevice = (Device) this.g.c(Integer.valueOf(paramInt));
			if (localDevice != null)
				if (localDevice.getType() != Device.DeviceType.c) {
					if (localDevice.getType() != Device.DeviceType.b) {
						if (localDevice.getType() != Device.DeviceType.l) {
							if (localDevice.getType() == Device.DeviceType.j)
								this.q = true;
						} else
							this.r = true;
					} else {
						this.p = true;
						if (this.l != null)
							this.l.c(Integer.valueOf(paramInt));
					}
				} else
					this.o = true;
		}
	}

	public boolean l(SQLiteDatabase paramSQLiteDatabase) {
		int i8;
		int i6;
		int i3;
		int i2;
		int i1;

		Vector<DirectorDevice> localVector = new Vector<DirectorDevice>();
		String[] localObject3 = new String[8];
		localObject3[0] = "device_id";
		localObject3[1] = "name";
		localObject3[2] = "device_proxy";
		localObject3[3] = "device_control";
		localObject3[4] = "room_id";
		localObject3[5] = "type";
		localObject3[6] = "device_proxy_device_id";
		localObject3[7] = "driver";
		String[] arrayOfString = new String[4];
		arrayOfString[0] = "control4_thermostat_proxy";
		arrayOfString[1] = new Integer(22).toString();
		arrayOfString[2] = "standalonethermostat";
		arrayOfString[3] = "%thermostat%";

		Cursor cursor = paramSQLiteDatabase
				.query("devices",
						localObject3,
						new String(
								"device_proxy = ? or device_proxy = ? or device_proxy = ? or device_proxy LIKE ?"),
						arrayOfString, null, null, null);
		i8 = cursor.getColumnIndexOrThrow("device_id");
		i6 = cursor.getColumnIndexOrThrow("name");
		int i5 = cursor.getColumnIndexOrThrow("device_proxy");
		i3 = cursor.getColumnIndexOrThrow("device_control");
		int i7 = cursor.getColumnIndexOrThrow("room_id");
		int i9 = cursor.getColumnIndexOrThrow("device_proxy_device_id");
		int i4 = cursor.getColumnIndexOrThrow("driver");

		String str1;
		String str3;
		String str2;
		int i12;

		for (cursor.moveToFirst(); !cursor.isAfterLast(); cursor.moveToNext()) {
			int i10 = cursor.getInt(i8);
			str1 = cursor.getString(i6);
			str3 = cursor.getString(i5);
			str2 = cursor.getString(i3);
			i12 = cursor.getInt(i7);
			int i13 = cursor.getInt(i9);
			String localObject4 = cursor.getString(i4);

			if (i13 > 0) {
				DirectorDevice localDirectorDevice = new DirectorDevice();
				localDirectorDevice.d(i10);
				localDirectorDevice.setName(str1);
				localDirectorDevice.h(str3);
				localDirectorDevice.e(i12);
				localDirectorDevice.f(i13);
				localDirectorDevice.i(str2);
				localDirectorDevice.k((String) localObject4);
				this.h.put(Integer.valueOf(i13), localDirectorDevice);
			} else {
				DirectorRoom localDirectorRoom2 = (DirectorRoom) getRoom(i12);
				DirectorDevice ddevice = DeviceFactory
						.b(str3, str2, localObject4,
								(Device) this.h.get(Integer.valueOf(i10)));
				ddevice.d(i10);
				ddevice.setName(str1);
				ddevice.e(i12);
				if (localDirectorRoom2 != null)
					localDirectorRoom2.a(ddevice, 0);
				a(ddevice);
				localVector.add(ddevice);
			}

		}

		for (int i = 0; i < localVector.size(); i++) {
			a(localVector.elementAt(i), paramSQLiteDatabase);
		}
		return false;

		// this.p = false;
		// if (this._director.G()) {
		// i6 = n();
		// for (i3 = 0; i3 < i6; i3++) {
		// DirectorRoom localDirectorRoom1 = (DirectorRoom) getRoom(i3);
		// for (i8 = 0; i8 < i2; i8++) {
		// Device localDevice = (Device) i1.elementAt(i8);
		// ((Thermostat) localDevice).J();
		// Variable localVariable = new Variable();
		// localVariable.a(1012);
		// localVariable.b(Integer.toString(localDevice.t()));
		// localDirectorRoom1.a(localVariable, false);
		// localVariable.a(1013);
		// localDirectorRoom1.a(localVariable, false);
		// }
		// }
		// }

	}

	public int m() {
		int i1;
		if (this.d == null)
			i1 = 0;
		else
			i1 = this.d.c();
		return i1;
	}

	public CustomButtonScreen m(int paramInt) {
		CustomButtonScreen localCustomButtonScreen;
		if (this.k != null)
			localCustomButtonScreen = (CustomButtonScreen) this.k.a(paramInt);
		else
			localCustomButtonScreen = null;
		return localCustomButtonScreen;
	}

	public boolean m(SQLiteDatabase paramSQLiteDatabase) {
		return false;
	}

	public boolean loadProjectInfo(SQLiteDatabase sqlitedatabase) {
		Object obj = 0;
		if (sqlitedatabase == null)
			return false;
		String as[];
		String s1;
		String as1[];
		int j1;
		as = new String[] { "device_id", "capability", "capability_value" };
		s1 = new String("device_id=? and capability=?");
		as1 = new String[] { (new Integer(0x20c1ac0)).toString(),
				"Project-Name" };
		Cursor cursor = sqlitedatabase.query("capabilities", as, s1, as1, null,
				null, null);
		j1 = cursor.getColumnIndexOrThrow("capability_value");
		if (cursor.moveToFirst())
			t = cursor.getString(j1);
		cursor.close();

		as1 = new String[] { (new Integer(0x20c1ac0)).toString(), "Project-Zip" };
		cursor = sqlitedatabase.query("capabilities", as, s1, as1, null, null,
				null);
		j1 = cursor.getColumnIndexOrThrow("capability_value");
		if (cursor.moveToFirst())
			u = cursor.getString(j1);
		cursor.close();

		as1 = new String[] { (new Integer(0x20c1ac0)).toString(),
				"Project-Latitude" };
		as1[0] = (new Integer(0x20c1ac0)).toString();
		as1[1] = "Project-Latitude";
		cursor = sqlitedatabase.query("capabilities", as, s1, as1, null, null,
				null);
		j1 = cursor.getColumnIndexOrThrow("capability_value");
		if (cursor.moveToFirst())
			w = cursor.getString(j1);
		cursor.close();

		Object obj1;
		int i1;
		as1 = new String[] { (new Integer(0x20c1ac0)).toString(),
				"Project-Longitude" };
		cursor = sqlitedatabase.query("capabilities", as, s1, as1, null, null,
				null);
		i1 = cursor.getColumnIndexOrThrow("capability_value");
		if (cursor.moveToFirst())
			v = cursor.getString(i1);
		cursor.close();

		return true;

	}

	public int o() {
		int i1;
		if (this.i == null)
			i1 = 0;
		else
			i1 = this.i.c();
		return i1;
	}

	public void o(int paramInt) {
		this.a = paramInt;
	}

	public int p() {
		int i1;
		if (this.g != null)
			i1 = this.g.c();
		else
			i1 = 0;
		return i1;
	}

	public Thermostat p(int paramInt) {
		try {
			if (this.l != null)
				;
			for (Thermostat localThermostat = (Thermostat) this.l.a(paramInt);; localThermostat = null)
				return localThermostat;
		} catch (Exception localObject) {

		}
		return null;
	}

	public int q() {
		int i1;
		if (this.k == null)
			i1 = 0;
		else
			i1 = this.k.c();
		return i1;
	}

	public Thermostat q(int paramInt) {
		try {
			if (this.l != null)
				;
			for (Thermostat localThermostat = (Thermostat) this.l.a(Integer
					.valueOf(paramInt));; localThermostat = null)
				return localThermostat;
		} catch (Exception localObject) {

		}
		return null;
	}

	public int r() {
		return this.a;
	}

	public Light r(int paramInt) {
		initLights();
		Light localLight;
		if (this.j == null)
			localLight = null;
		else
			localLight = (Light) this.j.a(paramInt);
		return localLight;
	}

	//
	public void j() {
		if (this.b != null)
			this.b.clear();
		if (this.c != null)
			this.c.clear();
		if (this.d != null)
			this.d.clear();
		// if(f != null)
		// f.d();
		if (e != null)
			for (Room room : e.a()) {
				room.ap();
			}
		if (g != null) // goto _L6; else goto _L5
			for (DirectorDevice directorDevice : g.a()) {

				directorDevice.j();
			}
		if (j != null) // goto _L10; else goto _L9
			for (Light light : j.a()) {

				light.j();
			}
		if (n != null) // goto _L14; else goto _L13
			for (ContactDevice contactdevice : n.a()) {
				((DirectorContactDevice) contactdevice).j();

			}

		if (k != null) // goto _L18; else goto _L17
			for (CustomButtonScreen cbs : k.a()) {
				cbs.j();

			}
		if (l != null)
			for (Thermostat thermostat : l.a()) {
				thermostat.j();

			}
		o = true;
		p = true;
		q = true;
		r = true;
		s = false;
		t = null;
		u = null;
		v = null;
		w = null;
		x = (DirectorWakeupControls) _wakeupProvider.get();
		a(x);
		return;
	}

	public boolean loadLights(SQLiteDatabase paramSQLiteDatabase) {
		DirectorDevice localDirectorDevice;
		this.o = false;
		Vector<DirectorDevice> localVector = new Vector<DirectorDevice>();

		String[] arrayOfString = new String[] { "device_id", "name",
				"device_proxy", "device_control", "room_id", "type",
				"device_proxy_device_id", "driver" };
		String[] lparams = new String[] { "light", "outlet_light" };

		Cursor cursor = paramSQLiteDatabase.query("devices", arrayOfString,
				new String("device_proxy=? or device_proxy=?"), lparams, null,
				null, "room_id ASC, name ASC");
		int i9 = cursor.getColumnIndexOrThrow("device_id");
		int i3 = cursor.getColumnIndexOrThrow("name");
		int i5 = cursor.getColumnIndexOrThrow("device_proxy");
		int i4 = cursor.getColumnIndexOrThrow("device_control");
		int i6 = cursor.getColumnIndexOrThrow("room_id");
		int i8 = cursor.getColumnIndexOrThrow("driver");
		int i7 = cursor.getColumnIndexOrThrow("device_proxy_device_id");
		for (cursor.moveToFirst(); !cursor.isAfterLast(); cursor.moveToNext()) {
			int deviceId = cursor.getInt(i9);
			String name = cursor.getString(i3);
			String proxy = cursor.getString(i5);
			String control = cursor.getString(i4);
			int roomId = cursor.getInt(i6);
			int proxyId = cursor.getInt(i7);
			String driver = cursor.getString(i8);
			if (proxyId > 0) {
				DirectorDevice localObject5 = new DirectorDevice();
				localObject5.d(deviceId);
				localObject5.setName(name);
				localObject5.h(proxy);
				localObject5.e(roomId);
				localObject5.f(proxyId);
				localObject5.i(control);
				localObject5.k(driver);
				this.h.put(proxyId, localObject5);
			}

			else {
				DirectorRoom directorroom;
				DirectorDevice directordevice1 = null;
				Device device;
				directorroom = (DirectorRoom) getRoombyID(roomId);
				device = (Device) h.get(Integer.valueOf(deviceId));
				if (directorroom != null)
					directordevice1 = (DirectorDevice) directorroom.e(deviceId);
				if (directordevice1 == null) // goto _L9; else goto _L8
				{
					DirectorDevice obj1 = DeviceFactory.b(proxy, control,
							driver, device);
					obj1.d(deviceId);
					obj1.setName(name);
					obj1.e(roomId);
					a(obj1);
					localVector.add(obj1);
					if (directorroom != null)
						directorroom.a(obj1, 0);
				}

			}
		}

		cursor.close();

		for (DirectorDevice dd : localVector)
			a(dd, paramSQLiteDatabase);

		return false;

	}

	public int k() {
		int i1;
		if (this.b == null)
			i1 = 0;
		else
			i1 = this.b.c();

		return i1;
	}

	public Device k(int paramInt) {
		Device localDevice;
		if (this.g != null)
			localDevice = (Device) this.g.a(paramInt);
		else
			localDevice = null;
		return localDevice;
	}

	/**
	 * 按照index取得房间
	 */
	public Room getRoom(int paramInt) {
		Room localRoom = null;
		if (this.e != null)
			localRoom = (Room) this.e.a(paramInt);
		if ((localRoom == null) && (this.f != null))
			localRoom = (Room) this.f.a(paramInt);
		return localRoom;
	}

	public Room getRoombyID(int paramInt) {
		Room localRoom = null;
		if (this.e != null)
			localRoom = (Room) this.e.a(new Integer(paramInt));
		if ((localRoom == null) && (this.f != null))
			localRoom = (Room) this.f.a(new Integer(paramInt));
		return localRoom;
	}

	public boolean a(DirectorDevice paramDirectorDevice,
			SQLiteDatabase paramSQLiteDatabase) {
		int i1;
		if ((paramDirectorDevice == null) || (paramSQLiteDatabase == null))
			return false;

		String[] cparams = new String[] { "device_id", "capability",
				"capability_value" };

		Cursor cursor = paramSQLiteDatabase.query("capabilities", cparams,
				"device_id=?", new String[] { paramDirectorDevice.t() + "" },
				null, null, null);
		int i4 = cursor.getColumnIndexOrThrow("capability");
		int i5 = cursor.getColumnIndexOrThrow("capability_value");

		for (cursor.moveToFirst(); !cursor.isAfterLast(); cursor.moveToNext()) {
			paramDirectorDevice.a(cursor.getString(i4), cursor.getString(i5));
		}
		cursor.close();

		paramDirectorDevice.C_();

		return false;

	}

	/**
	 * 插入一个新的房间
	 * 
	 * @param paramRoom
	 */
	public void insertRoom(Room paramRoom) {
		if (paramRoom != null)
			if (paramRoom.ay()) {
				if (this.f == null)
					this.f = new HashIndex<Integer, Room>();
				this.f.a(paramRoom.a(), paramRoom);
			} else {
				if (this.e == null)
					this.e = new HashIndex<Integer, Room>();
				this.e.a(paramRoom.a(), paramRoom);
			}
	}

	private void initLights() {
		if (j == null || j.c() == 0)
			o = true;
		if (!o)
			return;
		if (j != null)
			j.clear();
		else
			j = new HashIndex<Integer, Light>();
		loadLights(_director.p());
		for (int j1 = 0; j1 < n(); j1++) {
			Room obj = getEnableRoom(j1);
			if (obj != null)
				for (int i1 = 0; i1 < obj.E(); i1++) {
					Light light = obj.f(i1);
					if (light != null)
						j.a(light.t(), light);
				}
		}

	}

	private void z() {
		int i3;
		try {
			if ((this.n == null) || (this.n.c() == 0))
				if (this.r) {
					if (this.n == null)
						this.n.clear();
					loadContactDevices(this._director.p());
					int i5 = n();
					i3 = 0;
					if (i3 < i5) {
						Room localRoom = getEnableRoom(i3);
						if (localRoom != null)
							this.n = new HashIndex();
					}
				}
		} catch (Exception localException) {

		}

		//
		// int i4 =0; //localException.N();
		// int i2 = 0;
		//
		// if (i2 < i4)
		// {
		// ContactDevice localContactDevice = localException.t(i2);
		// if (localContactDevice != null)
		// this.n.a(Integer.valueOf(localContactDevice.t()),
		// localContactDevice);
		// i2++;
		// int i1 = 1;
		//
		// }
		//
	}

	public DirectorDevice a(int paramInt, SQLiteDatabase paramSQLiteDatabase) {
		return null;
	}

	public void a(DirectorDevice paramDirectorDevice) {
		if ((paramDirectorDevice != null) && (paramDirectorDevice.y() >= 0)) {
			if (this.g == null)
				this.g = new HashIndex();
			this.g.a(Integer.valueOf(paramDirectorDevice.t()),
					paramDirectorDevice);
			if (paramDirectorDevice.getType() != Device.DeviceType.b) {
				if (paramDirectorDevice.getType() != Device.DeviceType.l) {
					if (paramDirectorDevice.getType() == Device.DeviceType.c) {
						if (this.j == null)
							this.j = new HashIndex();
						// this.j.a(paramDirectorDevice.t(),
						// (com.zd.model.device.Light)paramDirectorDevice);
					}
				} else {
					if (this.n == null)
						this.n = new HashIndex<Integer, ContactDevice>();
					this.n.a(Integer.valueOf(paramDirectorDevice.t()),
							(ContactDevice) paramDirectorDevice);
				}
			} else {
				if (this.l == null)
					this.l = new HashIndex();
				this.l.a(Integer.valueOf(paramDirectorDevice.t()),
						(Thermostat) paramDirectorDevice);
			}
		}
	}

	public Room s() {
		return getRoom(this.a);
	}

	public Light s(int paramInt) {
		initLights();
		Light localLight;
		if (this.j == null)
			localLight = null;
		else
			localLight = (Light) this.j.a(Integer.valueOf(paramInt));
		return localLight;
	}

	public int t() {
		int i1;
		if (this.l == null)
			i1 = 0;
		else
			i1 = this.l.c();
		return i1;
	}

	public ContactDevice t(int paramInt) {
		z();
		ContactDevice localContactDevice;
		if (this.n == null)
			localContactDevice = null;
		else
			localContactDevice = (ContactDevice) this.n.a(paramInt);
		return localContactDevice;
	}

	public int u() {
		initLights();
		int i1;
		if (this.j == null)
			i1 = 0;
		else
			i1 = this.j.c();
		return i1;
	}

	public int v() {
		z();
		int i1;
		if (this.n == null)
			i1 = 0;
		else
			i1 = this.n.c();
		return i1;
	}

	public WakeupControls w() {
		if (this.x == null)
			this.x = ((DirectorWakeupControls) this._wakeupProvider.get());
		return this.x;
	}

	public boolean x() {
		return this.y;
	}

	@Override
	public void flush() throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public Site getSite(int paramInt) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Device b(int paramInt, boolean paramBoolean,
			SQLiteDatabase paramSQLiteDatabase) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean h(SQLiteDatabase paramSQLiteDatabase) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean loadContactDevices(SQLiteDatabase sqlitedatabase) {
		r = false;
		Vector flag = new Vector();

		Cursor i1;
		String as[] = new String[8];
		as[0] = "device_id";
		as[1] = "name";
		as[2] = "device_proxy";
		as[3] = "device_control";
		as[4] = "room_id";
		as[5] = "type";
		as[6] = "device_proxy_device_id";
		as[7] = "driver";
		String as1[] = new String[4];
		as1[0] = "%contact%";
		as1[1] = "%relay%";
		as1[2] = "%c4%";
		as1[3] = "%blind%";
		i1 = sqlitedatabase
				.query("devices",
						as,
						new String(
								"device_proxy like ? or device_proxy like ? and device_proxy like ? or device_proxy like ?"),
						as1, null, null, "name ASC");
		int l1 = i1.getColumnIndexOrThrow("device_id");
		int k2 = i1.getColumnIndexOrThrow("name");
		int i2 = i1.getColumnIndexOrThrow("device_proxy");
		int k1 = i1.getColumnIndexOrThrow("device_control");
		int j1 = i1.getColumnIndexOrThrow("room_id");
		int j2 = i1.getColumnIndexOrThrow("device_proxy_device_id");
		int l2 = i1.getColumnIndexOrThrow("driver");

		if (i1.moveToFirst()) // goto _L2; else goto _L1_L1:
			do {
				int i3 = i1.getInt(l1);
				String obj = i1.getString(k2);
				String s1 = i1.getString(i2);
				String s2 = i1.getString(k1);
				int j3 = i1.getInt(j1);
				int k3 = i1.getInt(j2);
				String obj1 = i1.getString(l2);
				if (k3 > 0) // goto _L4; else goto _L3
				{
					DirectorDevice directordevice = new DirectorDevice();
					directordevice.d(i3);
					directordevice.setName(obj);
					directordevice.h(s1);
					directordevice.e(j3);
					directordevice.f(k3);
					directordevice.i(s2);
					directordevice.k(obj1);
					h.put(Integer.valueOf(k3), directordevice);
				} else {

					DirectorRoom directorroom = null;
					Device device;
					DirectorDevice directordevice1;
					directorroom = (DirectorRoom) getRoom(j3);
					device = (Device) h.get(Integer.valueOf(i3));
					directordevice1 = null;
					if (directorroom != null)
						directordevice1 = (DirectorDevice) directorroom.e(i3);

					// _L9:

					if (directordevice1 != null) {
						a(directordevice1);
						flag.add(directordevice1);
						if (directorroom != null)
							directorroom.a(directordevice1, 0);
					}
				}

			} while (i1.moveToNext());

		//
		// _L4:
		// DirectorRoom directorroom;
		// Device device;
		// DirectorDevice directordevice1;
		// directorroom = (DirectorRoom)h(j3);
		// device = (Device)h.get(Integer.valueOf(i3));
		// directordevice1 = null;
		// if(directorroom != null)
		// directordevice1 = (DirectorDevice)directorroom.e(i3);
		// if(directordevice1 == null) //goto _L9; else goto _L8
		// if(_director.G()) //goto _L11; else goto _L10
		// if(s1 == null)
		// s1 = "";
		// if(i1 == null)
		// break MISSING_BLOCK_LABEL_372;
		// i1.close();
		// j1 = flag.size();
		// i1 = 0;
		// _L7:
		// if(i1 < j1) //goto _L6; else goto _L5
		// a((DirectorDevice)flag.elementAt(i1), sqlitedatabase);
		// i1++;
		// goto _L7
		//
		// _L12:
		// if(s2 == null)
		// {
		// s2 = "";
		// }
		//
		// obj1 = DeviceFactory.b(s1, s2, ((String) (obj1)), device);
		// if(obj1 != null)
		// {
		// ((DirectorDevice) (obj1)).d(i3);
		// ((DirectorDevice) (obj1)).g(((String) (obj)));
		// ((DirectorDevice) (obj1)).e(j3);
		// }
		//
		//
		// if(i1 != null)
		// i1.close();

		// _L6:
		// if(flag.size() > 0)
		// flag = true;
		//

		return false;

	}

	@Override
	public int n() {
		int i1;
		if (e == null)
			i1 = 0;
		else
			i1 = e.c();
		return i1;
	}

	@Override
	public Location n(int paramInt) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int setSite(Site paramSite) {
		// TODO Auto-generated method stub
		return 0;
	}

}
