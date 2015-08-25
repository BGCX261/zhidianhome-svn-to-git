package com.zd.model;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Vector;

import roboguice.util.Ln;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.zd.model.audio.AudioLibrary;
import com.zd.model.audio.AudioQueue;
import com.zd.model.audio.DirectorAudioLibrary;
import com.zd.model.audio.DirectorRhapsodyAudioLibrary;
import com.zd.model.audio.DirectorZoneManager;
import com.zd.model.command.CommandFactory;
import com.zd.model.command.GetBindingsByDeviceCommand;
import com.zd.model.command.GetDevicesForRoomCommand;
import com.zd.model.command.GetMediaAvailableCommand;
import com.zd.model.command.GetVariableCommand;
import com.zd.model.command.PulseVolumeCommand;
import com.zd.model.command.RegisterEventListenerCommand;
import com.zd.model.command.SendToDeviceCommand;
import com.zd.model.command.StartChangingVolumeCommand;
import com.zd.model.command.StopChangingVolumeCommand;
import com.zd.model.device.Device;
import com.zd.model.device.DeviceFactory;
import com.zd.model.device.DigitalAudio;
import com.zd.model.device.DirectorContactDevice;
import com.zd.model.device.DirectorDevice;
import com.zd.model.device.DirectorWebCam;
import com.zd.model.device.Light;
import com.zd.model.device.MyMoviesDevice;
import com.zd.model.device.NowPlayingDevice;
import com.zd.model.device.RadioStationsDevice;
import com.zd.model.device.TVChannelsDevice;
import com.zd.model.device.Thermostat;
import com.zd.model.device.WebCam;
import com.zd.model.device.WebCamerasDevice;
import com.zd.model.device.ZonesDevice;
import com.zd.model.director.broadcast.BroadcastCollection;
import com.zd.model.director.broadcast.RadioStationsCollection;
import com.zd.model.director.broadcast.TVChannelsCollection;
import com.zd.model.director.video.DirectorVideoLibrary;
import com.zd.model.director.video.VideoLibrary;

public class DirectorRoom extends DirectorLocation implements Room {
	protected static final int aI = 1000;
	protected static final int aJ = 1001;
	protected static final int aK = 1002;
	protected static final int aL = 1005;
	protected static final int aM = 1006;
	protected static final int aN = 1007;
	protected static final int aO = 1008;
	public static final int aP = 1009;
	protected static final int aQ = 1010;
	protected static final int aR = 1011;
	protected static final int aS = 1012;
	protected static final int aT = 1013;
	protected static final int aU = 1014;
	protected static final int aV = 1015;
	protected static final int aW = 1016;
	protected static final int aX = 1017;
	protected static final int aY = 1018;
	protected static final int aZ = 1019;
	protected static final int ba = 1020;
	protected static final int bb = 1021;
	protected static final int bc = 1022;
	protected static final int bd = 1023;
	protected static final int be = 1024;
	protected static final int bf = 1025;
	protected static final int bg = 1026;
	protected static final int bh = 1027;
	protected static final int bi = 1028;
	protected static final int bj = 1029;
	protected static final int bk = 1030;
	protected static final int bl = 1031;
	protected static final int bm = 1032;
	protected static final int bn = 1033;
	protected static final int bo = 1034;
	private static final long bp = 20000L;

	// @Inject
	private Provider<DirectorAudioLibrary> _audioLibraryProvider;

	@Inject
	private Control4Director _director;

	// @Inject
	private Provider<MyMoviesDevice> _myMoviesProvider;

	// @Inject
	private Provider<NowPlayingDevice> _nowPlayingProvider;

	// @Inject
	private Provider<RadioStationsDevice> _radioStationsDeviceProvider;

	// @Inject
	private Provider<RadioStationsCollection> _radioStationsLibraryProvider;

	// @Inject
	private Provider<DirectorRhapsodyAudioLibrary> _rhapsodyAudioLibraryProvider;

	// @Inject
	private Provider<TVChannelsDevice> _tvChannelsDeviceProvider;

	// @Inject
	private Provider<TVChannelsCollection> _tvChannelsLibraryProvider;

	@Inject
	private Provider<DirectorVideoLibrary> _videoLibraryProvider;

	@Inject
	private Provider<WebCamerasDevice> _webCamerasDeviceProvider;

	@Inject
	private DirectorZoneManager _zoneManager;

	@Inject
	private Provider<ZonesDevice> _zonesProvider;
	protected boolean aH = false;
	private HashIndex<Integer, DirectorDevice> bA = null;
	private boolean bB = true;
	private HashIndex<Integer, DirectorWebCam> bC = null;
	private HashIndex<Integer, DirectorContactDevice> bD = null;
	private HashIndex<Integer, CustomButtonScreen> bE = null;
	private boolean bF = false;
	private boolean bG = false;
	private boolean bH = false;
	private boolean bI = false;
	private boolean bJ = false;
	private HashIndex<Integer, Integer> bK;
	private DirectorAudioLibrary bL = null;
	private DirectorRhapsodyAudioLibrary bM = null;
	private DirectorVideoLibrary bN = null;
	private TVChannelsCollection bO = null;
	private RadioStationsCollection bP = null;
	private boolean bQ = false;
	private boolean bR = false;
	private int bS = 0;
	private boolean bT = false;
	private boolean bU = false;
	private Room.PowerState bV = Room.PowerState.a;
	private int bW = -1;
	private int bX = -1;
	private int bY = -1;
	private String bZ = null;
	private HashIndex<Integer, DirectorDevice> bq = null;
	private HashMap<Integer, DirectorDevice> br = null;
	private HashIndex<Integer, Light> bs = null;
	private HashIndex<Integer, LightingScene> bt = null;
	private HashIndex<Integer, DirectorDevice> bu = null;
	private boolean bv = true;
	private HashIndex<Integer, DirectorDevice> bw = null;
	private HashIndex<Integer, DirectorDevice> bx = null;
	private HashIndex<Integer, DirectorDevice> by = null;
	private HashIndex<Integer, DirectorDevice> bz = null;
	private String ca = null;
	private DirectorRoom.MediaInfoImpl cb = null;
	private boolean cc = true;
	private boolean cd = false;
	private volatile Boolean ce = Boolean.valueOf(false);
	private boolean cf = false;
	private int cg = -1;
	private int ch = -1;
	private Vector<Room.OnRoomUpdateListener> ci;
	private boolean cj = false;
	private boolean ck = false;

	// private final Runnable cl = new DirectorRoom.4(this);

	public DirectorRoom() {
	}

	public DirectorRoom(int paramInt1, String paramString, int paramInt2) {
		super(paramInt1, paramString, paramInt2);
	}

	// ERROR //
	private void aU() {

	}

	// ERROR //
	private void aV() {

	}

	public void A(int paramInt) {
		if (this.bK != null) {
			this.bK.c(Integer.valueOf(paramInt));
			aP();
		}
	}

	public boolean A() {

		if ((this.bD == null) || (this.bD.b()))
			return false;
		else
			return true;

	}

	public int B() {
		int i;
		if (this.ci == null)
			i = 0;
		else
			i = this.ci.size();
		return i;
	}

	public boolean B(int paramInt) {
		boolean bool;
		if (this.bK != null)
			bool = this.bK.d(Integer.valueOf(paramInt));
		else
			bool = false;
		return bool;
	}

	public boolean C() {
		return this.cf;
	}

	public int D() {
		int i;
		if (this.bq == null)
			i = 0;
		else
			i = this.bq.c();
		return i;
	}

	public int E() {
		int i;
		if (this.bs == null)
			i = 0;
		else
			i = this.bs.c();
		return i;
	}

	public int F() {
		int i;
		if (this.bt == null)
			i = 0;
		else
			i = this.bt.c();
		return i;
	}

	public int G() {
		if (this.bv)
			aJ();
		int i;
		if (this.bu == null)
			i = 0;
		else
			i = this.bu.c();
		return i;
	}

	public Thermostat H() {
		Object localObject;
		if (this.cg > 0) {
			localObject = aH();
			SQLiteDatabase localSQLiteDatabase = aI();
			if (localObject == null)
				localObject = null;
			else
				localObject = ((Project) localObject).b(this.cg, true,
						localSQLiteDatabase);
			if ((localObject != null)
					&& (((Device) localObject).getType() == Device.DeviceType.b))
				localObject = (Thermostat) localObject;
			else
				localObject = null;
		} else {
			localObject = null;
		}
		return (Thermostat) localObject;
	}

	public Thermostat I() {
		Object localObject;
		if (this.ch > 0) {
			DirectorProject localDirectorProject = aH();
			localObject = aI();
			if (localDirectorProject == null)
				localObject = null;
			else
				localObject = localDirectorProject.b(this.ch, true,
						(SQLiteDatabase) localObject);
			if ((localObject != null)
					&& (((Device) localObject).getType() == Device.DeviceType.b))
				localObject = (Thermostat) localObject;
			else
				localObject = null;
		} else {
			localObject = null;
		}
		return (Thermostat) localObject;
	}

	public int getListenDeviceCount() {
		int i;
		if (this.bw == null)
			i = 0;
		else
			i = this.bw.c();
		return i;
	}

	public int K() {
		int i;
		if (this.bz == null)
			i = 0;
		else
			i = this.bz.c();
		return i;
	}

	public int L() {
		if (this.bB)
			aK();
		int i;
		if (this.bA == null)
			i = 0;
		else
			i = this.bA.c();
		return i;
	}

	public int M() {
		int i;
		if (this.bC == null)
			i = 0;
		else
			i = this.bC.c();
		return i;
	}

	public int N() {
		int i;
		if (this.bD == null)
			i = 0;
		else
			i = this.bD.c();
		return i;
	}

	public int O() {
		int i;
		if (this.bE == null)
			i = 0;
		else
			i = this.bE.c();
		return i;
	}

	public void P() {
		// try
		// {
		// Ln.a("getUpdatedAudioInfo", new Object[0]);
		// if (this._director != null)
		// if (this._director.G())
		// this.ce = Boolean.valueOf(false);
		// }
		// catch (Exception localException1)
		// {
		// Ln.e(localException1);
		// Ln.e("Unable to get updated audio info for room " + b(), new
		// Object[0]);
		// this.cc = true;
		// synchronized (this.ce)
		// {
		// this.ce = Boolean.valueOf(false);
		// if (this.ci == null);
		// }
		// synchronized (this.ci)
		// {
		// Ln.a("Notify listeners of change in busy state. Busy: " + ao(), new
		// Object[0]);
		// try
		// {
		// Iterator localIterator1 = this.ci.iterator();
		// while (localIterator1.hasNext())
		// ((Room.OnRoomUpdateListener)localIterator1.next()).c(this);
		// }
		// catch (Exception localException2)
		// {
		// Ln.e(localException2);
		// }
		// monitorexit;
		// return;
		// localObject1 = finally;
		// monitorexit;
		// throw localObject1;
		// synchronized (this.ce)
		// {
		// this.ce = Boolean.valueOf(true);
		// if (this.ci == null);
		// }
		// synchronized (this.ci)
		// {
		// Ln.a("Notify listeners of change in busy state. Busy: " + ao(), new
		// Object[0]);
		// try
		// {
		// Iterator localIterator2 = this.ci.iterator();
		// while (localIterator2.hasNext())
		// ((Room.OnRoomUpdateListener)localIterator2.next()).c(this);
		// }
		// catch (Exception localException3)
		// {
		// Ln.e(localException3);
		// }
		// ??? = as();
		// if ((??? != null) && (((DigitalAudio)???).A()))
		// ((DigitalAudio)???).p();
		// y(1011);
		// y(1018);
		// y(1016);
		// y(1017);
		// y(1025);
		// y(1010);
		// y(1000);
		// y(1001);
		// y(1031);
		// if ((this._director.D()) && (this._zoneManager != null))
		// {
		// if ((!this._zoneManager.b()) && (!this._zoneManager.c()))
		// this._zoneManager.e();
		// if (!this._zoneManager.d())
		// this._zoneManager.f();
		// }
		// this.cc = false;
		// this._director.a(this.cl, 20000L);
		// monitorexit;
		// return;
		// localObject3 = finally;
		// monitorexit;
		// throw localObject3;
		// }
		// }
		// }
	}

	public boolean Q() {
		// try
		// {
		// boolean bool = R();
		// int j = D();
		// int n = 0;
		// Object localObject1;
		// if (n < j)
		// {
		// localObject1 = b(n);
		// if (localObject1 != null)
		// {
		// Device.DeviceType localDeviceType = ((Device)localObject1).a();
		// if (((localDeviceType == Device.DeviceType.c) || (localDeviceType ==
		// Device.DeviceType.h) || (localDeviceType == Device.DeviceType.f) ||
		// (localDeviceType == Device.DeviceType.b) || (localDeviceType ==
		// Device.DeviceType.l)) && (!((Device)localObject1).B()))
		// bool |= ((Device)localObject1).q();
		// }
		// }
		// else
		// {
		// localObject1 = this._director.m();
		// if (((Project)localObject1).b())
		// ((Project)localObject1).l(this._director.p());
		// j = ((Project)localObject1).t();
		// int k = 0;
		// if (k < j)
		// {
		// localThermostat2 = ((Project)localObject1).p(k);
		// if ((localThermostat2 == null) || (localThermostat2.B()))
		// break label386;
		// localThermostat2.q();
		// break label386;
		// }
		// Object localObject2 = H();
		// localThermostat1 = I();
		// if ((localObject2 != null) && (!((Thermostat)localObject2).B()))
		// bool |= ((Thermostat)localObject2).q();
		// if ((localThermostat1 != null) && (!localThermostat1.B()))
		// bool |= localThermostat1.q();
		// if (localObject1 != null)
		// {
		// localObject2 = ((Project)localObject1).w();
		// if ((localObject2 != null) && (!((WakeupControls)localObject2).B()))
		// bool |= ((WakeupControls)localObject2).q();
		// }
		// if ((this.cb != null) && (this.cb.a > 0))
		// {
		// localObject2 = aI();
		// if (localObject1 != null)
		// {
		// localObject1 = ((Project)localObject1).b(this.cb.a, true,
		// (SQLiteDatabase)localObject2);
		// if ((localObject1 != null) && (!((Device)localObject1).B()))
		// bool |= ((Device)localObject1).q();
		// }
		// }
		// this.aH = true;
		// return bool;
		// }
		// }
		// catch (Exception i)
		// {
		// while (true)
		// {
		// Thermostat localThermostat2;
		// Thermostat localThermostat1;
		// Ln.e(localException);
		// Ln.e("Unable to register for events for room " + b(), new Object[0]);
		// int i = 0;
		// continue;
		// int i1;
		// localThermostat2 += 1;
		// continue;
		// label386: int m;
		// localThermostat1 += 1;
		// }
		// }
		return false;
	}

	public boolean R() {
		boolean bool1 = false;
		try {
			if (this._director != null) {
				RegisterEventListenerCommand localRegisterEventListenerCommand = (RegisterEventListenerCommand) CommandFactory.RegisterEventListenerProvider
						.get();
				localRegisterEventListenerCommand.b(a());
				localRegisterEventListenerCommand.a(38);
				boolean bool2 = this._director
						.a(localRegisterEventListenerCommand);
				localRegisterEventListenerCommand = (RegisterEventListenerCommand) CommandFactory.RegisterEventListenerProvider
						.get();
				localRegisterEventListenerCommand.b(a());
				localRegisterEventListenerCommand.a(32);
				bool1 = bool2
						| this._director.a(localRegisterEventListenerCommand);
				this.cd = true;
				bool1 = bool1;
			}
		} catch (Exception localException) {

		}
		return bool1;
	}

	public boolean S() {
		// try
		// {
		// boolean bool1 = T();
		// int j = D();
		// int k = 0;
		// Object localObject2;
		// if (k < j)
		// {
		// Device localDevice = b(k);
		// if (localDevice != null)
		// {
		// localObject2 = localDevice.a();
		// if ((localObject2 != Device.DeviceType.c) && (localObject2 !=
		// Device.DeviceType.l) && (localObject2 != Device.DeviceType.h) &&
		// (localDevice.B()))
		// bool1 |= localDevice.C();
		// }
		// }
		// else
		// {
		// Object localObject1 = this._director.m();
		// if (((Project)localObject1).b())
		// ((Project)localObject1).l(this._director.p());
		// int n = ((Project)localObject1).t();
		// k = 0;
		// if (k < n)
		// {
		// localObject2 = ((Project)localObject1).p(k);
		// if ((localObject2 == null) || (!((Thermostat)localObject2).B()))
		// break label350;
		// ((Thermostat)localObject2).C();
		// break label350;
		// }
		// localObject2 = H();
		// localThermostat = I();
		// if (localObject2 != null)
		// bool1 |= ((Thermostat)localObject2).C();
		// if (localThermostat != null)
		// bool1 |= localThermostat.C();
		// if (localObject1 != null)
		// {
		// localObject2 = ((Project)localObject1).w();
		// if (localObject2 != null)
		// bool1 |= ((WakeupControls)localObject2).C();
		// }
		// if ((this.cb != null) && (this.cb.a > 0))
		// {
		// localObject2 = aI();
		// if (localObject1 != null)
		// {
		// localObject1 = ((Project)localObject1).b(this.cb.a, true,
		// (SQLiteDatabase)localObject2);
		// if ((localObject1 != null) && (((Device)localObject1).a() !=
		// Device.DeviceType.h))
		// {
		// boolean bool2 = ((Device)localObject1).C();
		// bool1 |= bool2;
		// }
		// }
		// }
		// this.aH = false;
		// return bool1;
		// }
		// }
		// catch (Exception i)
		// {
		// while (true)
		// {
		// Thermostat localThermostat;
		// Ln.e(localException);
		// Ln.e("Unable to register for events for room " + b(), new Object[0]);
		// int i = 0;
		// continue;
		// int m;
		// localThermostat += 1;
		// continue;
		// label350: m += 1;
		// }
		// }
		return false;
	}

	public boolean T() {

		// try
		// {
		// if (this._director != null)
		// {
		// UnregisterEventListenerCommand localUnregisterEventListenerCommand1 =
		// (UnregisterEventListenerCommand)CommandFactory.UnregisterEventListenerProvider.a();
		// localUnregisterEventListenerCommand1.b(a());
		// localUnregisterEventListenerCommand1.a(38);
		// Exception localException2 =
		// this._director.a(localUnregisterEventListenerCommand1);
		// UnregisterEventListenerCommand localUnregisterEventListenerCommand2 =
		// (UnregisterEventListenerCommand)CommandFactory.UnregisterEventListenerProvider.a();
		// localUnregisterEventListenerCommand2.b(a());
		// localUnregisterEventListenerCommand2.a(32);
		// boolean bool =
		// this._director.a(localUnregisterEventListenerCommand2);
		// localException2 = bool | localException2;
		// this.cd = localException1;
		// localException1 = localException2;
		// }
		// }
		// catch (Exception localException3)
		// {
		//
		// }
		return false;
	}

	public boolean U() {
		boolean j = false;
		try {
			if (this._director.isDemo()) {
				a(aI(), 5);
				int i = 1;
			} else {
				GetDevicesForRoomCommand localGetDevicesForRoomCommand = (GetDevicesForRoomCommand) CommandFactory.GetDevicesForRoomProvider
						.get();
				localGetDevicesForRoomCommand.b(a());
				localGetDevicesForRoomCommand.a(5);
				boolean bool = this._director.a(localGetDevicesForRoomCommand);
				bool = bool;
			}
		} catch (Exception e) {

		}
		return j;
	}

	public boolean V() {
		boolean j = false;
		try {
			if (this._director.isDemo()) {
				a(aI(), 4);
				int i = 1;
			} else {
				aS();
				GetDevicesForRoomCommand localGetDevicesForRoomCommand = (GetDevicesForRoomCommand) CommandFactory.GetDevicesForRoomProvider
						.get();
				localGetDevicesForRoomCommand.b(a());
				localGetDevicesForRoomCommand.a(4);
				boolean bool = this._director.a(localGetDevicesForRoomCommand);
				bool = bool;
			}
		} catch (Exception e) {

		}
		return j;
	}

	public boolean W() {
		boolean j = false;
		try {
			if (this._director.isDemo()) {
				a(aI(), 8);
				int i = 1;
			} else {
				aS();
				GetDevicesForRoomCommand localGetDevicesForRoomCommand = (GetDevicesForRoomCommand) CommandFactory.GetDevicesForRoomProvider
						.get();
				localGetDevicesForRoomCommand.b(a());
				localGetDevicesForRoomCommand.a(8);
				boolean bool = this._director.a(localGetDevicesForRoomCommand);
				bool = bool;
			}
		} catch (Exception e) {

		}
		return j;
	}

	public boolean X() {
		boolean j = false;
		try {
			if (this._director.isDemo()) {
				a(aI(), 9);
				int i = 1;
			} else {
				aS();
				GetDevicesForRoomCommand localGetDevicesForRoomCommand = (GetDevicesForRoomCommand) CommandFactory.GetDevicesForRoomProvider
						.get();
				localGetDevicesForRoomCommand.b(a());
				localGetDevicesForRoomCommand.a(9);
				boolean bool = this._director.a(localGetDevicesForRoomCommand);

			}
		} catch (Exception e) {

		}
		return j;
	}

	public boolean Y() {
		if ((this.bW <= 0) || (this.bW != this.bX))
			return false;
		else
			return true;

	}

	public boolean Z() {
		boolean i = false;
		try {
			Room.MediaInfo localMediaInfo = s();
			if ((localMediaInfo != null)
					&& (((localMediaInfo.g() != null) && (localMediaInfo.g()
							.equals("INTERNET_MEDIA"))) || ((localMediaInfo.h() != null) && (localMediaInfo
							.h().equals("INTERNET_MEDIA"))))) {
				i = true;
			}
			return i;
		} catch (Exception localException) {
			Ln.e(localException);
		}
		return i;
	}

	// ERROR //
	public int a(SQLiteDatabase paramSQLiteDatabase, int paramInt) {
		return 0;

	}

	public Room.OnRoomUpdateListener a(int paramInt) {
		try {
			if (this.ci != null)
				;
			for (Room.OnRoomUpdateListener localOnRoomUpdateListener = (Room.OnRoomUpdateListener) this.ci
					.elementAt(paramInt);; localOnRoomUpdateListener = null)
				return localOnRoomUpdateListener;
		} catch (Exception localObject) {

		}
		return null;
	}

	public void a(CustomButtonScreen paramCustomButtonScreen) {
		if (paramCustomButtonScreen != null) {
			if (this.bE == null)
				this.bE = new HashIndex();
			this.bE.a(Integer.valueOf(paramCustomButtonScreen.a()),
					paramCustomButtonScreen);
		}
	}

	public void a(DeviceBinding paramDeviceBinding) {
		if (paramDeviceBinding != null)
			try {
				if ((paramDeviceBinding.e()) && (paramDeviceBinding.f() > 0)
						&& (paramDeviceBinding.h() != null)) {
					DirectorProject localDirectorProject = this._director.m();
					if (localDirectorProject != null) {
						Iterator localIterator = paramDeviceBinding.h()
								.iterator();
						while (localIterator.hasNext()) {
							Object localObject = (String) localIterator.next();
							if ((localObject == null)
									|| (((String) localObject).length() == 0)
									|| (!((String) localObject)
											.equalsIgnoreCase("SECURITY_SYSTEM")))
								continue;
							localObject = (DirectorDevice) localDirectorProject
									.b(paramDeviceBinding.f(), true,
											this._director.p());
							if ((localObject == null)
									|| (q(((DirectorDevice) localObject).t()) != null))
								continue;
							f((DirectorDevice) localObject);
						}
					}
				}
			} catch (Exception localException) {
				Ln.e(localException);
			}
	}

	public void a(LightingScene paramLightingScene) {
		if (paramLightingScene != null) {
			if (this.bt == null)
				this.bt = new HashIndex();
			this.bt.a(Integer.valueOf(paramLightingScene.b()),
					paramLightingScene);
		}
	}

	public void a(Room.OnRoomUpdateListener paramOnRoomUpdateListener) {
		if (this.ci == null)
			this.ci = new Vector();
		synchronized (this.ci) {
			if (!this.ci.contains(paramOnRoomUpdateListener))
				this.ci.add(paramOnRoomUpdateListener);
			return;
		}
	}

	public void a(Variable paramVariable, boolean paramBoolean) {
		// int i = -1;
		// if (paramVariable == null);
		// label869: Object localObject19;
		// label1117: String str3;
		// label1232: label1381: label1905: label1917: Object localObject13;
		// while (true)
		// {
		// return;
		// try
		// {
		// switch (paramVariable.b())
		// {
		// case 1000:
		// this.bW = Integer.parseInt(paramVariable.c());
		// Vector localVector1 = this.ci;
		// if (localVector1 == null)
		// continue;
		// try
		// {
		// aP();
		// }
		// catch (Exception localException1)
		// {
		// Ln.e(localException1);
		// }
		// case 1011:
		// case 1016:
		// case 1017:
		// case 1018:
		// case 1025:
		// case 1001:
		// case 1002:
		// case 1005:
		// case 1006:
		// case 1010:
		// case 1031:
		// case 1012:
		// case 1013:
		// case 1033:
		// case 1014:
		// case 1034:
		// case 1003:
		// case 1004:
		// case 1007:
		// case 1008:
		// case 1009:
		// case 1015:
		// case 1019:
		// case 1020:
		// case 1021:
		// case 1022:
		// case 1023:
		// case 1024:
		// case 1026:
		// case 1027:
		// case 1028:
		// case 1029:
		// case 1030:
		// case 1032:
		// }
		// }
		// catch (Exception localException2)
		// {
		// localException2.printStackTrace();
		// }
		// continue;
		// if ((w_()) && (!paramBoolean))
		// Ln.a("Ignoring Volume onVariableChanged call since the user has changed volume recently.",
		// new Object[0]);
		// while (this.ci != null)
		// {
		// synchronized (this.ci)
		// {
		// try
		// {
		// Iterator localIterator1 = this.ci.iterator();
		// while (localIterator1.hasNext())
		// ((Room.OnRoomUpdateListener)localIterator1.next()).e(this);
		// }
		// catch (Exception localException7)
		// {
		// Ln.e(localException7);
		// }
		// }
		// this.bS = Integer.parseInt(paramVariable.c());
		// }
		// continue;
		// this.bQ = BooleanUtil.a(paramVariable.c());
		// if (this.ci == null)
		// continue;
		// synchronized (this.ci)
		// {
		// try
		// {
		// Iterator localIterator2 = this.ci.iterator();
		// while (localIterator2.hasNext())
		// ((Room.OnRoomUpdateListener)localIterator2.next()).d(this);
		// }
		// catch (Exception localException8)
		// {
		// Ln.e(localException8);
		// }
		// }
		// this.bR = BooleanUtil.a(paramVariable.c());
		// if (this.ci == null)
		// continue;
		// synchronized (this.ci)
		// {
		// try
		// {
		// Iterator localIterator3 = this.ci.iterator();
		// while (localIterator3.hasNext())
		// ((Room.OnRoomUpdateListener)localIterator3.next()).d(this);
		// }
		// catch (Exception localException9)
		// {
		// Ln.e(localException9);
		// }
		// }
		// this.bT = BooleanUtil.a(paramVariable.c());
		// if (this.ci == null)
		// continue;
		// synchronized (this.ci)
		// {
		// try
		// {
		// Iterator localIterator4 = this.ci.iterator();
		// while (localIterator4.hasNext())
		// ((Room.OnRoomUpdateListener)localIterator4.next()).e(this);
		// }
		// catch (Exception localException10)
		// {
		// Ln.e(localException10);
		// }
		// }
		// this.bU = BooleanUtil.a(paramVariable.c());
		// if (this.ci == null)
		// continue;
		// synchronized (this.ci)
		// {
		// try
		// {
		// Iterator localIterator5 = this.ci.iterator();
		// while (localIterator5.hasNext())
		// ((Room.OnRoomUpdateListener)localIterator5.next()).d(this);
		// }
		// catch (Exception localException11)
		// {
		// Ln.e(localException11);
		// }
		// }
		// this.bX = Integer.parseInt(paramVariable.c());
		// ??? = this.ci;
		// if (??? == null)
		// continue;
		// try
		// {
		// aP();
		// }
		// catch (Exception localException3)
		// {
		// Ln.e(localException3);
		// }
		// continue;
		// this.bY = Integer.parseInt(paramVariable.c());
		// Vector localVector3 = this.ci;
		// if (localVector3 == null)
		// continue;
		// try
		// {
		// aP();
		// }
		// catch (Exception localException4)
		// {
		// Ln.e(localException4);
		// }
		// continue;
		// Object localObject1 = paramVariable.j();
		// if (localObject1 == null)
		// continue;
		// this.bZ = ((String)((HashMap)localObject1).get("mediaid"));
		// this.ca = ((String)((HashMap)localObject1).get("mediatype"));
		// localObject1 = this.ci;
		// if (localObject1 == null)
		// continue;
		// try
		// {
		// aP();
		// }
		// catch (Exception localException5)
		// {
		// Ln.e(localException5);
		// }
		// continue;
		// this.ca = paramVariable.c();
		// Object localObject2 = (DirectorDigitalAudio)as();
		// if ((localObject2 != null) &&
		// (((DirectorDigitalAudio)localObject2).t() == paramVariable.d()))
		// ((DirectorDigitalAudio)localObject2).a(paramVariable, paramBoolean);
		// localObject2 = this.ci;
		// if (localObject2 == null)
		// continue;
		// try
		// {
		// aP();
		// }
		// catch (Exception localException6)
		// {
		// Ln.e(localException6);
		// }
		// continue;
		// String str1 = paramVariable.c();
		// if ((str1 == null) || (str1.length() <= 0))
		// break;
		// int j = Integer.parseInt(str1);
		// if (j == 0)
		// {
		// this.bV = Room.PowerState.a;
		// if (this.cb != null)
		// {
		// Ln.a("Manually clearing media info source due to power off onVariableChanged for room "
		// + b(), new Object[0]);
		// this.cb.c = 0;
		// }
		// }
		// while (this.ci != null)
		// {
		// synchronized (this.ci)
		// {
		// try
		// {
		// Iterator localIterator6 = this.ci.iterator();
		// while (localIterator6.hasNext())
		// {
		// localObject19 = (Room.OnRoomUpdateListener)localIterator6.next();
		// ((Room.OnRoomUpdateListener)localObject19).d(this);
		// ((Room.OnRoomUpdateListener)localObject19).e(this);
		// ((Room.OnRoomUpdateListener)localObject19).b(this);
		// }
		// }
		// catch (Exception localException12)
		// {
		// Ln.e(localException12);
		// }
		// }
		// this.bV = Room.PowerState.b;
		// }
		// continue;
		// ??? = paramVariable.j();
		// Object localObject11;
		// if ((??? != null) && (((HashMap)???).size() > 0))
		// {
		// if (this.cb == null)
		// this.cb = new DirectorRoom.MediaInfoImpl(this);
		// this.cb.e = ((String)((HashMap)???).get("mediatype"));
		// localObject11 = (String)((HashMap)???).get("deviceid");
		// if ((localObject11 == null) || (((String)localObject11).length() <=
		// 0))
		// break label1893;
		// this.cb.a = Integer.parseInt((String)localObject11);
		// if (this.cb.a > 0)
		// {
		// localObject11 = aH().b(this.cb.a, true, aI());
		// if ((localObject11 != null) && (!((Device)localObject11).B()))
		// ((Device)localObject11).q();
		// if ((localObject11 != null) && (((Device)localObject11).A()))
		// ((Device)localObject11).p();
		// }
		// localObject11 = (String)((HashMap)???).get("queueid");
		// if ((localObject11 == null) || (((String)localObject11).length() <=
		// 0))
		// break label1905;
		// this.cb.b = Integer.parseInt((String)localObject11);
		// localObject11 = (String)((HashMap)???).get("source");
		// if ((localObject11 != null) && (((String)localObject11).length() >
		// 0))
		// this.cb.c = Integer.parseInt((String)localObject11);
		// this.cb.h = ((String)((HashMap)???).get("artist"));
		// this.cb.g = ((String)((HashMap)???).get("album"));
		// this.cb.i = ((String)((HashMap)???).get("title"));
		// localObject19 = (String)((HashMap)???).get("mediatypeV2");
		// this.cb.f = ((String)localObject19);
		// str3 = (String)((HashMap)???).get("mediaid");
		// localObject11 = (String)((HashMap)???).get("mediaidV2");
		// if ((localObject11 == null) || (((String)localObject11).length() ==
		// 0))
		// break label2626;
		// this.cb.d = ((String)localObject11);
		// str3 = (String)((HashMap)???).get("img");
		// if ((this.cb.e == null) || (!this.cb.e.equalsIgnoreCase("SONG")))
		// break label1917;
		// str3 = new String(Base64.c(str3.getBytes()));
		// label1445: this.cb.j = str3;
		// this.cb.m = false;
		// this.cb.l = false;
		// this.cb.a();
		// if ((this.cb.e == null) || (!this.cb.e.equalsIgnoreCase("SONG")))
		// break label2025;
		// if ((localObject19 == null) ||
		// (!((String)localObject19).equalsIgnoreCase("RHAPSODY")))
		// break label1946;
		// localObject19 = (DirectorAudioQueue)ar();
		// if ((localObject19 != null) &&
		// (((DirectorAudioQueue)localObject19).a() == this.cb.b))
		// {
		// ??? = null;
		// if ((localObject11 != null) && (((String)localObject11).length() >
		// 0))
		// ??? = localObject11;
		// ((DirectorAudioQueue)localObject19).d((String)???);
		// au();
		// localObject11 = (DirectorSong)this.bM.a((String)???, false, new
		// DirectorRoom.1(this));
		// if (localObject11 == null)
		// {
		// localObject11 =
		// (DirectorSong)this._director.K()._rhapsodySongProvider.a();
		// ((DirectorSong)localObject11).l((String)???);
		// this.bM.a((DirectorSong)localObject11);
		// }
		// ((DirectorSong)localObject11).l((String)???);
		// ((DirectorSong)localObject11).b((String)???);
		// ((DirectorSong)localObject11).m(this.cb.i);
		// ((DirectorSong)localObject11).a(this.cb.c);
		// ((DirectorSong)localObject11).a(this.cb.h);
		// if (((DirectorSong)localObject11).i() != null)
		// {
		// ??? = (DirectorAlbum)this.bM.c(((DirectorSong)localObject11).i());
		// if (??? != null)
		// {
		// ((DirectorAlbum)???).f(this.cb.h);
		// ((DirectorAlbum)???).m(this.cb.g);
		// ((DirectorAlbum)???).c(this.cb.a);
		// ((DirectorAlbum)???).n(this.cb.j);
		// }
		// }
		// }
		// }
		// label1759: label1893: label2025:
		// do
		// while (true)
		// {
		// while (true)
		// {
		// this._director.a(this.cl);
		// this.ce = Boolean.valueOf(false);
		// if (this.ci == null)
		// break;
		// synchronized (this.ci)
		// {
		// try
		// {
		// Ln.a("Room busy state changed. Busy: " + ao(), new Object[0]);
		// localObject11 = this.ci.iterator();
		// while (((Iterator)localObject11).hasNext())
		// {
		// localObject19 =
		// (Room.OnRoomUpdateListener)((Iterator)localObject11).next();
		// ((Room.OnRoomUpdateListener)localObject19).c(this);
		// ((Room.OnRoomUpdateListener)localObject19).b(this);
		// }
		// }
		// catch (Exception localException13)
		// {
		// Ln.e(localException13);
		// }
		// }
		// }
		// this.cb.a = -1;
		// break label1117;
		// this.cb.b = -1;
		// break label1232;
		// if ((this.cb.e == null) ||
		// (!this.cb.e.equalsIgnoreCase("BROADCAST")))
		// break label1445;
		// break label1445;
		// if ((localObject19 == null) ||
		// (!((String)localObject19).equalsIgnoreCase("INTERNET_MEDIA")))
		// continue;
		// this.cb.h = ((String)((HashMap)???).get("channel"));
		// ??? = (String)((HashMap)???).get("genre");
		// if ((??? == null) || (((String)???).length() <= 0))
		// continue;
		// this.cb.g = new String(Base64.c(((String)???).getBytes()));
		// continue;
		// if ((this.cb.e == null) || (!this.cb.e.equalsIgnoreCase("MOVIE")))
		// break label2111;
		// if (this.ck)
		// {
		// aR();
		// this.ck = false;
		// }
		// localObject13 = new
		// StringBuilder().append("Movie Media Info received: ");
		// if (??? == null)
		// break label2633;
		// ??? = ((HashMap)???).toString();
		// Ln.a((String)???, new Object[0]);
		// }
		// while ((this.cb.e == null) ||
		// (!this.cb.e.equalsIgnoreCase("BROADCAST")));
		// label1946: label2091: label2111: localObject13 = new
		// StringBuilder().append("Broadcast Media Info received: ");
		// if (??? == null)
		// break label2640;
		// }
		// label2626: label2633: String str2;
		// label2640: for (??? = ((HashMap)???).toString(); ; str2 = "null")
		// {
		// while (true)
		// {
		// while (true)
		// {
		// while (true)
		// {
		// Ln.a((String)???, new Object[0]);
		// break label1759;
		// this.cg = Integer.parseInt(paramVariable.c());
		// ??? = H();
		// if (??? != null)
		// {
		// ((Thermostat)???).q();
		// ((Thermostat)???).p();
		// aJ();
		// }
		// if (this.ci == null)
		// break;
		// synchronized (this.ci)
		// {
		// try
		// {
		// localObject13 = this.ci.iterator();
		// while (((Iterator)localObject13).hasNext())
		// ((Room.OnRoomUpdateListener)((Iterator)localObject13).next()).f(this);
		// }
		// catch (Exception localException14)
		// {
		// Ln.e(localException14);
		// }
		// }
		// }
		// this.ch = Integer.parseInt(paramVariable.c());
		// ??? = I();
		// if (??? != null)
		// {
		// ((Thermostat)???).q();
		// ((Thermostat)???).p();
		// aJ();
		// }
		// if (this.ci == null)
		// break;
		// synchronized (this.ci)
		// {
		// try
		// {
		// Iterator localIterator7 = this.ci.iterator();
		// while (localIterator7.hasNext())
		// ((Room.OnRoomUpdateListener)localIterator7.next()).f(this);
		// }
		// catch (Exception localException15)
		// {
		// Ln.e(localException15);
		// }
		// }
		// }
		// ??? = paramVariable.c();
		// if ((??? == null) || (((String)???).length() <= 0))
		// break;
		// Object localObject16 =
		// (CamerasParser)ParserFactory.CamerasProvider.a();
		// ((CamerasParser)localObject16).a(this);
		// localObject19 = XmlPullParserFactory.newInstance().newPullParser();
		// ((XmlPullParser)localObject19).setInput(new
		// StringReader((String)???));
		// ((CamerasParser)localObject16).a((XmlPullParser)localObject19);
		// break;
		// localObject16 = aH();
		// localObject19 = paramVariable.c();
		// int k;
		// if ((localObject19 != null) && (((String)localObject19).length() >
		// 0))
		// k = Integer.parseInt((String)localObject19);
		// if ((localObject16 == null) || (k < 0))
		// break;
		// ??? = (DirectorDevice)((Project)localObject16).b(k, true, aI());
		// if (??? == null)
		// break;
		// f((DirectorDevice)???);
		// if (this.ci == null)
		// break;
		// synchronized (this.ci)
		// {
		// try
		// {
		// localObject16 = this.ci.iterator();
		// while (((Iterator)localObject16).hasNext())
		// ((Room.OnRoomUpdateListener)((Iterator)localObject16).next()).g(this);
		// }
		// catch (Exception localException16)
		// {
		// Ln.e(localException16);
		// }
		// }
		// }
		// ??? = paramVariable.c();
		// if (??? == null)
		// break;
		// int m = ((String)???).length();
		// if (m <= 0)
		// break;
		// break;
		// m = 0;
		// break label869;
		// break;
		// Object localObject18 = str3;
		// break label1381;
		// str2 = "null";
		// break label2091;
		// }
	}

	public void a(Device paramDevice, int paramInt) {
		if (paramDevice == null)
			return;
		// ;
		// while (true) {
		// return;
		// if ((paramInt == 4) || (paramInt == 5)) {
		// try {
		// String str = "SELECT_VIDEO_DEVICE";
		// Object localObject = "video";
		// if (paramInt == 4) {
		// str = "SELECT_AUDIO_DEVICE";
		// localObject = "audio";
		// }
		// StringBuilder localStringBuilder = new StringBuilder(
		// "<param><name>devicegroup</name><value type=\"STRING\"><static>");
		// localStringBuilder.append((String) localObject);
		// localStringBuilder.append("</static></value></param>");
		// localStringBuilder
		// .append("<param><name>deviceid</name><value type=\"INTEGER\"><static>");
		// localStringBuilder.append(paramDevice.t());
		// localStringBuilder.append("</static></value></param>");
		// localObject = (SendToDeviceCommand)
		// CommandFactory.SendToDeviceProvider
		// .a();
		// ((SendToDeviceCommand) localObject).c(str);
		// ((SendToDeviceCommand) localObject).b(a());
		// ((SendToDeviceCommand) localObject).d(true);
		// ((SendToDeviceCommand) localObject).a(localStringBuilder
		// .toString());
		// boolean bool = this._director.a((Command) localObject);
		// if (!bool)
		// continue;
		// } catch (Exception localException) {
		// Ln.e(localException);
		// }
		// continue;
		// }
		// }
	}

	public void a(DirectorContactDevice paramDirectorContactDevice) {
		// if (paramDirectorContactDevice != null) {
		// if (this.bD == null)
		// this.bD = new HashIndex();
		// Object localObject = this._director.m();
		// if (localObject == null) {
		// this.bD.a(Integer.valueOf(paramDirectorContactDevice.t()),
		// paramDirectorContactDevice);
		// } else {
		// localObject = (DirectorContactDevice) ((DirectorProject) localObject)
		// .a(paramDirectorContactDevice.t(), false, null);
		// if (localObject == null)
		// this.bD.a(Integer.valueOf(paramDirectorContactDevice.t()),
		// paramDirectorContactDevice);
		// else
		// this.bD.a(
		// Integer.valueOf(((DirectorContactDevice) localObject)
		// .t()), localObject);
		// }
		// }
	}

	public void a(DirectorDevice paramDirectorDevice) {
		if (paramDirectorDevice != null) {
			if (this.bu == null)
				this.bu = new HashIndex();
			this.bu.a(Integer.valueOf(paramDirectorDevice.t()),
					paramDirectorDevice);
		}
	}

	public void a(DirectorDevice paramDirectorDevice, int paramInt) {
		if (paramDirectorDevice != null) {
			if (this.bq == null)
				this.bq = new HashIndex();
			if (paramInt == 0) {
				int i = DeviceFactory.a(paramDirectorDevice.B_());
				if ((i == 1) || (i == 2) || (i == 3))
					paramInt = i;
			}

			Object localObject;
			if (paramInt == 1) {
				localObject = this._director.m();
				if (localObject != null) {
					localObject = ((DirectorProject) localObject).a(
							paramDirectorDevice.t(), false, null);
					if (localObject != null)
						paramDirectorDevice = (DirectorDevice) localObject;
				}
			}
			if (paramDirectorDevice.getType() != Device.DeviceType.l) {
				localObject = paramDirectorDevice;
			} else {
				localObject = this._director.m();
				if (localObject != null) {
					localObject = ((DirectorProject) localObject).a(
							paramDirectorDevice.t(), false, null);
					if (localObject == null)
						localObject = paramDirectorDevice;
				}
				a((DirectorContactDevice) localObject);
			}
			if (e(((DirectorDevice) localObject).t()) == null)
				this.bq.a(Integer.valueOf(((DirectorDevice) localObject).t()),
						(DirectorDevice) localObject);
			switch (paramInt) {
			case 6:
			case 7:
			default:
				break;
			case 1:
				a((Light) localObject);
				break;
			case 2:
				a((DirectorDevice) localObject);
				break;
			case 3:
				if (((DirectorDevice) localObject).getType() == Device.DeviceType.g)
					break;
				f((DirectorDevice) localObject);
				break;
			case 4:
				b((DirectorDevice) localObject);
				break;
			case 5:
				e((DirectorDevice) localObject);
				break;
			case 8:
				c((DirectorDevice) localObject);
				break;
			case 9:
				d((DirectorDevice) localObject);
			}
		}
	}

	public void a(DirectorWebCam paramDirectorWebCam) {
		if (paramDirectorWebCam != null) {
			if (this.bC == null)
				this.bC = new HashIndex();
			this.bC.a(Integer.valueOf(paramDirectorWebCam.t()),
					paramDirectorWebCam);
			if (q(177127) == null)
				f((DirectorDevice) this._webCamerasDeviceProvider.get());
		}
	}

	public void a(Light paramLight) {
		if (paramLight != null) {
			if (this.bs == null)
				this.bs = new HashIndex<Integer, Light>();
			DirectorProject localObject = this._director.m();
			if (localObject == null) {
				this.bs.a(Integer.valueOf(paramLight.t()), paramLight);
			} else {
				Light light = (Light) localObject
						.a(paramLight.t(), false, null);
				if (light == null)
					this.bs.a(Integer.valueOf(paramLight.t()), paramLight);
				else
					this.bs.a(Integer.valueOf(light.t()), light);
			}
		}
	}

	public boolean a(int paramInt1, int paramInt2,
			SQLiteDatabase paramSQLiteDatabase) {
		return false;
		// Exception localException1 = 0;
		// int i = 1;
		// if (paramSQLiteDatabase == null);
		// while (true)
		// {
		// return localException1;
		// try
		// {
		// monitorenter;
		// try
		// {
		// ContentValues localContentValues = new ContentValues(3);
		// localContentValues.put("device_id", Integer.valueOf(paramInt1));
		// localContentValues.put("media_type", Integer.valueOf(paramInt2));
		// localContentValues.put("room_id", Integer.valueOf(a()));
		// long l = paramSQLiteDatabase.insert("room_media_devices", null,
		// localContentValues);
		// if (l < 0L)
		// Ln.e("Unable to insert mapping of device " + paramInt1 +
		// " to category " + paramInt2 + " for room " + a() + " into the DB.  "
		// + l, new Object[0]);
		// monitorexit;
		// }
		// finally
		// {
		// localObject = finally;
		// monitorexit;
		// throw localObject;
		// }
		// }
		// catch (Exception localException2)
		// {
		// Ln.e(localException2);
		// localException2 = localException1;
		// localException1 = localException2;
		// }
		// }
	}

	public boolean a(SQLiteDatabase paramSQLiteDatabase) {
		if (paramSQLiteDatabase == null) {
			return false;
		}

		DirectorDevice localDirectorDevice1;
		// try
		// {
		DirectorProject localDirectorProject = aH();
		Vector<DirectorDevice> localVector = new Vector<DirectorDevice>();

		// try
		// {
		String[] arrayOfString = new String[8];
		arrayOfString[0] = "device_id";
		arrayOfString[1] = "name";
		arrayOfString[2] = "device_proxy";
		arrayOfString[3] = "device_control";
		arrayOfString[4] = "room_id";
		arrayOfString[5] = "type";
		arrayOfString[6] = "device_proxy_device_id";
		arrayOfString[7] = "driver";
		String localObject3[] = new String[] { a() + "" };

		Cursor cursor = paramSQLiteDatabase.query("devices", arrayOfString,
				new String("room_id = ?"), localObject3, null, null, null);
		int n = cursor.getColumnIndexOrThrow("device_id");
		int i4 = cursor.getColumnIndexOrThrow("name");
		int m = cursor.getColumnIndexOrThrow("device_proxy");
		int i2 = cursor.getColumnIndexOrThrow("device_control");
		int i3 = cursor.getColumnIndexOrThrow("room_id");
		int i5 = cursor.getColumnIndexOrThrow("device_proxy_device_id");
		int i1 = cursor.getColumnIndexOrThrow("driver");
		for (cursor.moveToFirst(); !cursor.isAfterLast(); cursor.moveToNext()) {
			int i6 = cursor.getInt(n);
			String str2 = cursor.getString(i4);
			String str4 = cursor.getString(m);
			String str1 = cursor.getString(i2);
			int i7 = cursor.getInt(i3);
			int i8 = cursor.getInt(i5);
			String str3 = cursor.getString(i1);
			if (i8 <= 0)
				continue;
			DirectorDevice localObject4 = new DirectorDevice();
			localObject4.d(i6);
			localObject4.setName(str2);
			localObject4.h(str4);
			localObject4.e(i7);
			localObject4.f(i8);
			localObject4.i(str1);
			localObject4.k(str3);
			if (this.br == null)
				this.br = new HashMap();
			this.br.put(Integer.valueOf(i8), localObject4);

			for (i1 = 0; i1 < localVector.size(); i1++) {

				localDirectorDevice1 = (DirectorDevice) localVector
						.elementAt(i1);
				localDirectorProject.a(localDirectorDevice1,
						paramSQLiteDatabase);
				m = 1;
				if (((localDirectorDevice1 instanceof DirectorWebCam))
						|| ((localDirectorDevice1 instanceof Light))
						|| ((localDirectorDevice1 instanceof DirectorContactDevice)))
					if (((localDirectorDevice1 instanceof Light))
							|| (!(localDirectorDevice1 instanceof DirectorContactDevice)))
						continue;
				a(localDirectorDevice1, 0);
				if (m == 0)
					continue;
				localDirectorProject.a(localDirectorDevice1);
			}

			if (e(i6) != null)
				continue;
			if (this.br == null)
				br = new HashMap<Integer, DirectorDevice>();
			localObject4 = this.br.get(Integer.valueOf(i6));

			DirectorDevice localDirectorDevice2 = null;
			localDirectorDevice2 = localDirectorProject.a(i6, false, null);
			if (localDirectorDevice2 != null)
				continue;

			if (!((!this._director.G()) || (str4 != null)))
				str4 = "";

			localDirectorDevice2 = DeviceFactory.b(str4, null, str3,
					(Device) localObject4);
			if (localDirectorDevice2 == null)
				continue;
			localDirectorDevice2.d(i6);
			localDirectorDevice2.setName(str2);
			localDirectorDevice2.e(i7);
			localDirectorProject.a(localDirectorDevice2);
			localVector.add(localDirectorDevice2);

		}
		cursor.close();
		this.cf = true;
		return false;
	}

	public boolean a(String paramString) {
		if (paramString != null)
			try {
				if (this._director != null) {
					SendToDeviceCommand localSendToDeviceCommand = (SendToDeviceCommand) CommandFactory.SendToDeviceProvider
							.get();
					localSendToDeviceCommand.c(paramString);
					localSendToDeviceCommand.b(a());
					localSendToDeviceCommand.d(true);
					boolean bool = this._director.a(localSendToDeviceCommand);

				}
			} catch (Exception e) {

			}

		return false;
	}

	public void aA() {
		try {
			R();
			if ((this.cb != null) && (this.cb.a > 0)) {
				Object localObject = aI();
				DirectorProject localDirectorProject = this._director.m();
				if (localDirectorProject != null) {
					localObject = localDirectorProject.b(this.cb.a, true,
							(SQLiteDatabase) localObject);
					if ((localObject != null) && (!((Device) localObject).B()))
						((Device) localObject).q();
				}
			}
			return;
		} catch (Exception localException) {

		}
	}

	public void aB() {
		// try {
		// aL();
		// W();
		// X();
		// V();
		// i = 0;
		// if (i < D()) {
		// DirectorDevice localDirectorDevice = (DirectorDevice) b(i);
		// Device.DeviceType localDeviceType = localDirectorDevice.a();
		// if ((localDeviceType == Device.DeviceType.h)
		// || (localDeviceType == Device.DeviceType.i)
		// || (localDeviceType == Device.DeviceType.s))
		// localDirectorDevice.p();
		// } else {
		// P();
		// y(1002);
		// y(1005);
		// y(1006);
		// aO();
		// return;
		// }
		// } catch (Exception localException) {
		//
		// }
	}

	public void aC() {
		try {
			T();
			if ((this.cb != null) && (this.cb.a > 0)) {
				SQLiteDatabase localSQLiteDatabase = aI();
				Object localObject = this._director.m();
				if (localObject != null) {
					localObject = ((Project) localObject).b(this.cb.a, true,
							localSQLiteDatabase);
					if ((localObject != null)
							&& (((Device) localObject).getType() != Device.DeviceType.h))
						((Device) localObject).C();
				}
			}
			return;
		} catch (Exception localException) {
			while (true)
				Ln.e(localException);
		}
	}

	public int aD() {
		return this.cg;
	}

	public int aE() {
		return this.ch;
	}

	public String aF() {
		return this.bZ;
	}

	public String aG() {
		return this.ca;
	}

	public DirectorProject aH() {
		DirectorProject localDirectorProject;
		if (this._director == null)
			localDirectorProject = null;
		else
			localDirectorProject = this._director.m();
		return localDirectorProject;
	}

	public SQLiteDatabase aI() {
		SQLiteDatabase localSQLiteDatabase;
		if (this._director == null)
			localSQLiteDatabase = null;
		else
			localSQLiteDatabase = this._director.p();
		return localSQLiteDatabase;
	}

	protected void aJ() {
		// int j = 0;
		// try
		// {
		// DirectorProject localDirectorProject = this._director.m();
		// if (localDirectorProject.b())
		// localDirectorProject.l(this._director.p());
		// Thermostat localThermostat2 = H();
		// if (localThermostat2 != null)
		// b(localThermostat2, 0);
		// Thermostat localThermostat3 = I();
		// if ((localThermostat3 != null) && (localThermostat3 !=
		// localThermostat2))
		// b(localThermostat3, 0);
		// int i = localDirectorProject.t();
		// if (j < i)
		// {
		// Thermostat localThermostat1 = localDirectorProject.p(j);
		// if ((localThermostat1 != localThermostat2) && (localThermostat1 !=
		// localThermostat3))
		// a(localThermostat1);
		// }
		// else
		// {
		// DirectorWakeupControls localDirectorWakeupControls =
		// (DirectorWakeupControls)localDirectorProject.w();
		// if (localDirectorWakeupControls != null)
		// a(localDirectorWakeupControls);
		// this.bv = false;
		// return;
		// }
		// }
		// catch (Exception localException)
		// {
		//
		// }
	}

	protected void aK() {
		DirectorProject directorproject = _director.m();
		if (directorproject.d())
			directorproject.loadContactDevices(_director.p());
		if (bA != null) {
			for (int i1 = 0; i1 < bA.c(); i1++) {
				Device device = (Device) bA.a(i1);
				if (device != null && device.getType() == Device.DeviceType.g)
					bA.c(Integer.valueOf(device.t()));

			}

		}
		// bB = false;
		//
		// return;
		// exception;
		// Ln.e(exception);
		// bB = true;
		// goto _L1
	}

	public boolean aL() {
		boolean i = false;
		try {
			if (this._director.isDemo()) {
				boolean bool1 = b(this._director.q());
			} else {
				GetMediaAvailableCommand localGetMediaAvailableCommand = (GetMediaAvailableCommand) CommandFactory.GetMediaAvailableProvider
						.get();
				localGetMediaAvailableCommand.b(a());
				boolean bool2 = this._director.a(localGetMediaAvailableCommand);
				bool2 = bool2;
			}
		} catch (Exception e) {

		}
		return i;
	}

	public boolean aM() {
		return y(1033);
	}

	public boolean aN() {
		try {
			boolean bool1 = y(1012);
			boolean bool2 = y(1013);
			bool1 &= bool2;
			return bool1;
		} catch (Exception i) {

		}
		return false;
	}

	public boolean aO() {
		boolean j = false;
		try {
			if (this._director == null) {
				int i = 0;
			} else {
				GetBindingsByDeviceCommand localGetBindingsByDeviceCommand = (GetBindingsByDeviceCommand) CommandFactory.GetBindingsByDeviceProvider
						.get();
				localGetBindingsByDeviceCommand.b(a());
				boolean bool = this._director
						.a(localGetBindingsByDeviceCommand);
				bool = bool;
			}
		} catch (Exception e) {

		}
		return j;
	}

	public void aP() {
		// try
		// {
		// if (this.ci != null)
		// synchronized (this.ci)
		// {
		// Iterator localIterator = this.ci.iterator();
		// if (localIterator.hasNext())
		// {
		// Room.OnRoomUpdateListener localOnRoomUpdateListener =
		// (Room.OnRoomUpdateListener)localIterator.next();
		// try
		// {
		// localOnRoomUpdateListener.b(this);
		// }
		// catch (Exception localException2)
		// {
		// Ln.e(localException2,
		// "Error occurred calling onRoomMediaInfoChanged listener.", new
		// Object[0]);
		// }
		// }
		// }
		// }
		// catch (Exception localException1)
		// {
		//
		// }
	}

	public void aQ() {
		// try
		// {
		// if (this.ci != null)
		// synchronized (this.ci)
		// {
		// Iterator localIterator = this.ci.iterator();
		// while (true)
		// if (localIterator.hasNext())
		// {
		// Room.OnRoomUpdateListener localOnRoomUpdateListener =
		// (Room.OnRoomUpdateListener)localIterator.next();
		// try
		// {
		// localOnRoomUpdateListener.k(this);
		// }
		// catch (Exception localException2)
		// {
		// Ln.e(localException2,
		// "Error occurred calling onRoomLightsChanged listener.", new
		// Object[0]);
		// }
		// }
		// }
		// }
		// catch (Exception localException1)
		// {
		//
		// }
	}

	public void aR() {
		// try
		// {
		// if (this.ci != null)
		// synchronized (this.ci)
		// {
		// Iterator localIterator = this.ci.iterator();
		// while (true)
		// if (localIterator.hasNext())
		// {
		// Room.OnRoomUpdateListener localOnRoomUpdateListener =
		// (Room.OnRoomUpdateListener)localIterator.next();
		// try
		// {
		// localOnRoomUpdateListener.m(this);
		// }
		// catch (Exception localException2)
		// {
		// Ln.e(localException2,
		// "Error occurred calling onRoomShowCurrentDeviceControls listener.",
		// new Object[0]);
		// }
		// }
		// }
		// }
		// catch (Exception localException1)
		// {
		//
		// }
	}

	public void aS() {
		// int i = 1;
		// while (true)
		// {
		// Control4Rhapsody localControl4Rhapsody;
		// try
		// {
		// if (this._director.G())
		// break;
		// localControl4Rhapsody = this._director.K();
		// if (as() == null)
		// break;
		// if (localControl4Rhapsody == null)
		// break label140;
		// if (localControl4Rhapsody.e())
		// break label116;
		// if (e(100119) == null)
		// {
		// a(localControl4Rhapsody, 4);
		// if ((i == 0) || (this.ci == null))
		// break;
		// aU();
		// }
		// }
		// catch (Exception localException)
		// {
		// Ln.e(localException);
		// }
		// if ((this.bw == null) || (this.bw.a(Integer.valueOf(100119)) ==
		// null))
		// {
		// a(localControl4Rhapsody, 4);
		// continue;
		// label116: if (this.bw != null)
		// {
		// this.bw.c(Integer.valueOf(100119));
		// continue;
		// if (this.bw != null)
		// {
		// this.bw.c(Integer.valueOf(100119));
		// continue;
		// }
		// }
		// }
		// label140: int j = 0;
		// }
	}

	public boolean aT() {
		return this.ck;
	}

	public boolean a_(boolean paramBoolean) {
		boolean j = false;
		try {
			if (this._director == null) {
				int i = 0;
			} else {
				StartChangingVolumeCommand localStartChangingVolumeCommand = (StartChangingVolumeCommand) CommandFactory.StartChangingVolumeProvider
						.get();
				localStartChangingVolumeCommand.b(a());
				localStartChangingVolumeCommand.d(paramBoolean);
				boolean bool = this._director
						.a(localStartChangingVolumeCommand);
				bool = bool;
			}
		} catch (Exception localException) {
			Ln.e(localException);

		}
		return j;
	}

	public boolean aa() {
		if ((this.bW <= 0) || (this.bW != this.bY))
			return false;
		else
			return true;

	}

	public boolean ab() {
		boolean i = false;
		// try
		// {
		// int k = E();
		// for (int j = i; ; j++)
		// {
		// if (j < k)
		// {
		// Light localLight = f(j);
		// if (localLight == null)
		// continue;
		// int m = localLight.c();
		// if (m <= 0)
		// continue;
		// i = 1;
		// }
		// return i;
		// }
		// }
		// catch (Exception localException)
		// {
		//
		// Ln.e(localException);
		// }
		return i;
	}

	public boolean ac() {

		if ((!Y()) && (!aa()) && (!ae()) && (!ad()))
			return false;
		else
			return true;

	}

	public boolean ad() {
		// int j = 1;
		// if (this.cb != null)
		// {
		// if (((this.cb.e != null) && (this.cb.e.equals("BROADCAST_AUDIO"))) ||
		// ((this.ca != null) && (this.ca.equals("BROADCAST_AUDIO"))))
		// {
		// Device localDevice = e(this.cb.a);
		// Device.DeviceType localDeviceType = Device.DeviceType.a;
		// if (localDevice != null)
		// localDeviceType = localDevice.a();
		// if ((localDeviceType != Device.DeviceType.w) && (localDeviceType !=
		// Device.DeviceType.x))
		// {
		// // Ln.a("* Current Media type is BROADCAST_AUDIO for " + b() +
		// ", and current device type is " + localDeviceType +
		// ".  Recognizing media info instead of showing device controls.", new
		// Object[0]);
		// break label286;
		// }
		// }
		// if (!Z())
		// {
		// int i;
		// if (((this.cb.g == null) || (this.cb.g.length() <= 0)) && ((this.cb.h
		// == null) || (this.cb.h.length() <= 0)) && ((this.cb.i == null) ||
		// (this.cb.i.length() <= 0)) && (this.cb.b <= 0))
		// i = 0;
		// else
		// i = j;
		// j = i;
		// }
		// else
		// {
		// Ln.a("Room: " + b() +
		// ", is listening to Internet Audio, so we have media info.", new
		// Object[0]);
		// }
		// }
		// else
		// {
		// j = 0;
		// }
		// label286: return j;
		return false;
	}

	public boolean ae() {
		if ((this.cb != null) && (this.cb.a > 0))
			return true;

		return false;
	}

	public Room.PlayState af() {
		return null;
		// Room.PlayState localPlayState;
		// try
		// {
		// Object localObject = as();
		// if ((localObject != null) && (((DigitalAudio)localObject).A()))
		// ((DigitalAudio)localObject).p();
		// Device localDevice = null;
		// if ((this.cb != null) && (this.cb.a > 0))
		// {
		// localDevice = aH().b(this.cb.a, true, aI());
		// if ((localDevice != null) && (localDevice.A()))
		// localDevice.p();
		// }
		// localObject = ar();
		// if ((localObject != null) && ((localDevice == null) ||
		// (localDevice.a() != Device.DeviceType.i)))
		// {
		// if ((((AudioQueue)localObject).j()) &&
		// (!((AudioQueue)localObject).k()))
		// ((AudioQueue)localObject).a(this.c_, new DirectorRoom.3(this));
		// if (((AudioQueue)localObject).c() == AudioQueue.QueueState.b)
		// localObject = Room.PlayState.b;
		// else
		// localObject = Room.PlayState.a;
		// }
		// else
		// {
		// if ((this.cb != null) && (this.cb.a > 0))
		// {
		// aH();
		// if (localDevice != null)
		// {
		// if (localDevice.A())
		// localDevice.p();
		// if (localDevice.a() == Device.DeviceType.i)
		// {
		// localObject = ((iPod)localDevice).o();
		// if ((localObject == iPod.iPodPlayState.b) || (localObject ==
		// iPod.iPodPlayState.a))
		// {
		// localObject = Room.PlayState.a;
		// break label285;
		// }
		// if (localObject == iPod.iPodPlayState.c)
		// {
		// localObject = Room.PlayState.b;
		// break label285;
		// }
		// }
		// }
		// }
		// localObject = Room.PlayState.a;
		// }
		// }
		// catch (Exception localPlayState)
		// {
		// Ln.e(localException);
		// localPlayState = Room.PlayState.a;
		// }
		// label285: return (Room.PlayState)localPlayState;
	}

	public boolean ag() {

		return a("PLAY");
	}

	public boolean ah() {
		return a("PAUSE");
	}

	public boolean ai() {
		return a("SKIP_FWD");
	}

	public boolean aj() {
		return a("SKIP_REV");
	}

	public boolean ak() {
		boolean j = false;
		try {
			if (this._director == null) {
				int i = 0;
			} else {
				PulseVolumeCommand localPulseVolumeCommand = (PulseVolumeCommand) CommandFactory.PulseVolumeProvider
						.get();
				localPulseVolumeCommand.b(a());
				localPulseVolumeCommand.d(true);
				boolean bool = this._director.a(localPulseVolumeCommand);
				bool = bool;
			}
		} catch (Exception e) {

		}
		return j;
	}

	public boolean al() {
		boolean j = false;
		try {
			if (this._director == null) {
				int i = 0;
			} else {
				PulseVolumeCommand localPulseVolumeCommand = (PulseVolumeCommand) CommandFactory.PulseVolumeProvider
						.get();
				localPulseVolumeCommand.b(a());
				localPulseVolumeCommand.d(false);
				boolean bool = this._director.a(localPulseVolumeCommand);
				bool = bool;
			}
		} catch (Exception je) {

		}
		return j;
	}

	public boolean am() {
		return a("MUTE_TOGGLE");
	}

	public boolean an() {
		return a("ROOM_OFF");
	}

	public boolean ao() {
		boolean bool;
		if (this.bL == null) {
			bool = false;
		} else {
			bool = false | this.bL.y();
			// Ln.a("Audio library isBusy: " + this.bL.y(), new Object[0]);
		}
		if (this.bN != null) {
			bool |= this.bN.B();
			// Ln.a("Video library isBusy: " + this.bN.B(), new Object[0]);
		}
		if (this.bO != null) {
			bool |= this.bO.c();
			// Ln.a("TV channels isBusy: " + this.bO.c(), new Object[0]);
		}
		if (this.bP != null) {
			bool |= this.bP.c();
			// Ln.a("Radio station isBusy: " + this.bP.c(), new Object[0]);
		}
		bool |= this.ce.booleanValue();
		// Ln.a("Getting audio info isBusy: " + this.ce, new Object[0]);
		return bool;
	}

	public void ap() {
		// this._director.a(this.cl);
		// if (this.bL != null)
		// this.bL.j();
		// if (this.bM != null)
		// this.bM.j();
		// if (this.bN != null)
		// this.bN.v();
		// if (this.bO != null)
		// this.bO.f();
		// if (this.bP != null)
		// this.bP.f();
		// aq();
	}

	public void aq() {
		// DirectorProject localDirectorProject = aH();
		// int k = D();
		// int i = 0;
		// while (true)
		// {
		// Object localObject;
		// if (i >= k)
		// {
		// Iterator localIterator;
		// if (this.bq != null)
		// localIterator = this.bq.a().iterator();
		// while (true)
		// {
		// if (!localIterator.hasNext())
		// {
		// this.bq.d();
		// if (this.bu != null)
		// localObject = this.bu.a().iterator();
		// while (true)
		// {
		// if (!((Iterator)localObject).hasNext())
		// {
		// this.bu.d();
		// if (this.bz != null)
		// localObject = this.bz.a().iterator();
		// while (true)
		// {
		// if (!((Iterator)localObject).hasNext())
		// {
		// this.bz.d();
		// if (this.bw != null)
		// localObject = this.bw.a().iterator();
		// while (true)
		// {
		// if (!((Iterator)localObject).hasNext())
		// {
		// this.bw.d();
		// this.bw = null;
		// if (this.bx != null)
		// localObject = this.bx.a().iterator();
		// while (true)
		// {
		// if (!((Iterator)localObject).hasNext())
		// {
		// this.bx.d();
		// this.bx = null;
		// if (this.by != null)
		// localObject = this.by.a().iterator();
		// while (true)
		// {
		// if (!((Iterator)localObject).hasNext())
		// {
		// this.by.d();
		// this.by = null;
		// if (this.bC != null)
		// localObject = this.bC.a().iterator();
		// while (true)
		// {
		// if (!((Iterator)localObject).hasNext())
		// {
		// this.bC.d();
		// if (this.br != null)
		// this.br.clear();
		// this.bv = true;
		// this.bB = true;
		// this.cf = false;
		// return;
		// }
		// ((DirectorWebCam)((Iterator)localObject).next()).j();
		// }
		// }
		// ((DirectorDevice)((Iterator)localObject).next()).j();
		// }
		// }
		// ((DirectorDevice)((Iterator)localObject).next()).j();
		// }
		// }
		// ((DirectorDevice)((Iterator)localObject).next()).j();
		// }
		// }
		// ((DirectorDevice)((Iterator)localObject).next()).j();
		// }
		// }
		// ((DirectorDevice)((Iterator)localObject).next()).j();
		// }
		// }
		// localObject = (DirectorDevice)localIterator.next();
		// if ((((DirectorDevice)localObject).a() == Device.DeviceType.c) ||
		// (((DirectorDevice)localObject).a() == Device.DeviceType.b) ||
		// (((DirectorDevice)localObject).a() == Device.DeviceType.g) ||
		// (((DirectorDevice)localObject).a() == Device.DeviceType.l))
		// continue;
		// ((DirectorDevice)localObject).j();
		// }
		// }
		// Device localDevice = b(localObject);
		// if ((localDevice != null) && (localDevice.a() != Device.DeviceType.c)
		// && (localDevice.a() != Device.DeviceType.b) && (localDevice.a() !=
		// Device.DeviceType.g) && (localDevice.a() != Device.DeviceType.l))
		// localDirectorProject.l(localDevice.t());
		// int j;
		// localObject += 1;
		// }
	}

	public AudioQueue ar() {
		AudioQueue localAudioQueue = null;
		// try
		// {
		// DigitalAudio localDigitalAudio = as();
		// if (localDigitalAudio == null)
		// {
		// localAudioQueue = null;
		// }
		// else if ((this.cb != null) && (this.cb.b > 0))
		// {
		// localAudioQueue = localDigitalAudio.b(this.cb.b);
		// }
		// else
		// {
		// if (this.bK != null)
		// {
		// int j = this.bK.c();
		// for (int i = 0; i < j; i++)
		// {
		// localAudioQueue =
		// localDigitalAudio.b(((Integer)this.bK.a(i)).intValue());
		// localAudioQueue = localAudioQueue;
		// if (localAudioQueue != null)
		// break label124;
		// }
		// }
		// localAudioQueue = null;
		// }
		// }
		// catch (Exception localException)
		// {
		// Ln.e(localException);
		// localAudioQueue = null;
		// }
		// label124:
		return localAudioQueue;
	}

	public DigitalAudio as() {
		return null;
		// try
		// {
		// Object localObject1 = e(100002);
		// if (localObject1 == null)
		// localObject1 = e(100119);
		// if ((localObject1 != null) && ((localObject1 instanceof
		// DigitalAudio)));
		// for (localObject1 = (DigitalAudio)localObject1; ; localObject1 =
		// null)
		// return localObject1;
		// }
		// catch (Exception localObject2)
		// {
		// while (true)
		// {
		// Ln.e(localException);
		// Object localObject2 = null;
		// }
		// }
	}

	public AudioLibrary at() {
		DirectorAudioLibrary localDirectorAudioLibrary;
		if (this.bL == null) {
			if ((this.bL == null) && (this._audioLibraryProvider != null)) {
				this.bL = (DirectorAudioLibrary) this._audioLibraryProvider
						.get();
				this.bL.f(a());
			}
			localDirectorAudioLibrary = this.bL;
		} else {
			localDirectorAudioLibrary = this.bL;
		}
		return localDirectorAudioLibrary;
	}

	public AudioLibrary au() {
		DirectorRhapsodyAudioLibrary localDirectorRhapsodyAudioLibrary;
		if (this.bM == null) {
			if ((this.bM == null)
					&& (this._rhapsodyAudioLibraryProvider != null)) {
				this.bM = ((DirectorRhapsodyAudioLibrary) this._rhapsodyAudioLibraryProvider
						.get());
				this.bM.f(a());
			}
			localDirectorRhapsodyAudioLibrary = this.bM;
		} else {
			localDirectorRhapsodyAudioLibrary = this.bM;
		}
		return localDirectorRhapsodyAudioLibrary;
	}

	public VideoLibrary av() {
		DirectorVideoLibrary localDirectorVideoLibrary;
		if (this.bN == null) {
			if ((this.bN == null) && (this._videoLibraryProvider != null)) {
				this.bN = ((DirectorVideoLibrary) this._videoLibraryProvider
						.get());
				this.bN.f(a());
			}
			localDirectorVideoLibrary = this.bN;
		} else {
			localDirectorVideoLibrary = this.bN;
		}
		return localDirectorVideoLibrary;
	}

	public BroadcastCollection aw() {
		return this.bO;
	}

	public BroadcastCollection ax() {
		return this.bP;
	}

	public boolean ay() {
		return this.cj;
	}

	public void az() {
		int i = 0;
		try {
			while (i < M()) {
				WebCam localWebCam = r(i);
				if (!localWebCam.B())
					localWebCam.q();
				localWebCam.p();
				i++;
			}
		} catch (Exception localException) {
			Ln.e(localException);
		}
	}

	public Device b(int paramInt) {
		Device localDevice;
		if (this.bq == null)
			localDevice = null;
		else
			localDevice = (Device) this.bq.a(paramInt);
		return localDevice;
	}

	public void b(Room.OnRoomUpdateListener paramOnRoomUpdateListener) {
		if (this.ci == null)
			;
		synchronized (this.ci) {
			this.ci.remove(paramOnRoomUpdateListener);
		}

	}

	public void b(Variable paramVariable, boolean paramBoolean) {
	}

	public void b(DirectorDevice directordevice) {
		int i1 = 0;
		if (directordevice == null)
			return;

		ZonesDevice zonesDevice;
		if (this.bw == null) {
			this.bw = new HashIndex<Integer, DirectorDevice>();
			zonesDevice = this._zonesProvider.get();
			this.bw.a(Integer.valueOf(zonesDevice.t()), zonesDevice);
			NowPlayingDevice npd = (NowPlayingDevice) this._nowPlayingProvider
					.get();
			this.bw.a(Integer.valueOf(npd.t()), npd);
		}

		if (directordevice.getType() == Device.DeviceType.h)
			this.bw.a(Integer.valueOf(directordevice.t()), directordevice, 0);


		Device device = null;
		if (directordevice.getType() == Device.DeviceType.s) {
			if (bw.c() > 0)
				device = (Device) bw.a(0);
			if (device != null
					&& (device.getType() == Device.DeviceType.h || device
							.getType() == Device.DeviceType.s))
				i1 = 1;
			bw.a(Integer.valueOf(directordevice.t()), directordevice, i1);
		}

		if (directordevice.getType() == Device.DeviceType.r) {
			if (bw.c() > 0) // goto _L9; else goto _L8
				device = (Device) bw.a(0);
			if (device != null
					&& (device.getType() == Device.DeviceType.h || device
							.getType() == Device.DeviceType.s))
				i1 = 1;
			if (bw.c() > 1) {
				// Device device1 = (Device)bw.a(1);
				// if(device1 != null && (device1.getType() ==
				// Device.DeviceType.h || device1.getType() ==
				// Device.DeviceType.s))
			}
			bw.a(Integer.valueOf(directordevice.t()), directordevice, i1);
		}
		
		if (directordevice.getType() == Device.DeviceType.h)
			aS();
		aU();

	}

	public void b(DirectorDevice paramDirectorDevice, int paramInt) {
		if (paramDirectorDevice != null) {
			if (this.bu == null)
				this.bu = new HashIndex();
			this.bu.a(Integer.valueOf(paramDirectorDevice.t()),
					paramDirectorDevice, paramInt);
		}
	}

	// ERROR //
	public boolean b(SQLiteDatabase paramSQLiteDatabase) {
		return false;

	}

	public boolean b(boolean paramBoolean) {
		boolean j = false;
		try {
			if (this._director == null) {
				int i = 0;
			} else {
				StopChangingVolumeCommand localStopChangingVolumeCommand = (StopChangingVolumeCommand) CommandFactory.StopChangingVolumeProvider
						.get();
				localStopChangingVolumeCommand.b(a());
				localStopChangingVolumeCommand.d(paramBoolean);
				boolean bool = this._director.a(localStopChangingVolumeCommand);
				bool = bool;
			}
		} catch (Exception e) {

		}
		return j;
	}

	public void c(DirectorDevice paramDirectorDevice) {
		// int i = 0;
		// if (paramDirectorDevice == null)
		// return;
		// label86: Device localDevice;
		// while (true)
		// {
		// try
		// {
		// if (this.bx != null)
		// continue;
		// this.bx = new HashIndex();
		// if (paramDirectorDevice.a() != Device.DeviceType.h)
		// break label86;
		// this.bx.a(Integer.valueOf(paramDirectorDevice.t()),
		// paramDirectorDevice, 0);
		// b(paramDirectorDevice);
		// if (paramDirectorDevice.a() != Device.DeviceType.h)
		// continue;
		// aS();
		// aU();
		// }
		// catch (Exception localException)
		// {
		// Ln.e(localException);
		// }
		// break;
		// if (paramDirectorDevice.a() != Device.DeviceType.s)
		// break label168;
		// if (this.bx.c() > 0)
		// {
		// localDevice = (Device)this.bx.a(0);
		// if ((localDevice != null) && ((localDevice.a() ==
		// Device.DeviceType.h) || (localDevice.a() == Device.DeviceType.s)))
		// break label327;
		// }
		// label149: this.bx.a(Integer.valueOf(paramDirectorDevice.t()),
		// paramDirectorDevice, localException);
		// }
		// label168: if (paramDirectorDevice.a() == Device.DeviceType.r)
		// {
		// if (this.bx.c() <= 0)
		// break label322;
		// localDevice = (Device)this.bx.a(0);
		// if ((localDevice != null) && ((localDevice.a() ==
		// Device.DeviceType.h) || (localDevice.a() == Device.DeviceType.s)))
		// break label332;
		// label231: if (this.bx.c() <= 1)
		// break label322;
		// localDevice = (Device)this.bx.a(1);
		// if (localDevice == null)
		// break label322;
		// if (localDevice.a() == Device.DeviceType.h)
		// break label337;
		// if (localDevice.a() != Device.DeviceType.s)
		// break label322;
		// break label337;
		// }
		// while (true)
		// {
		// this.bx.a(Integer.valueOf(paramDirectorDevice.t()),
		// paramDirectorDevice, localException);
		// break;
		// this.bx.a(Integer.valueOf(paramDirectorDevice.t()),
		// paramDirectorDevice);
		// break;
		// label322: int j = localException;
		// continue;
		// label327: int k = 1;
		// break label149;
		// label332: k = 1;
		// break label231;
		// label337: k = 2;
		// }
	}

	public boolean c(boolean paramBoolean) {
		String str = "MUTE_ON";
		if (!paramBoolean)
			str = "MUTE_OFF";
		return a(str);
	}

	public void d(DirectorDevice paramDirectorDevice) {
		// int i = 0;
		// if (paramDirectorDevice == null)
		// return;
		// label81: Device localDevice;
		// while (true)
		// {
		// try
		// {
		// if (this.by != null)
		// continue;
		// this.by = new HashIndex();
		// if (paramDirectorDevice.a() != Device.DeviceType.h)
		// break label81;
		// this.by.a(Integer.valueOf(paramDirectorDevice.t()),
		// paramDirectorDevice, 0);
		// if (paramDirectorDevice.a() != Device.DeviceType.h)
		// continue;
		// aS();
		// aU();
		// }
		// catch (Exception localException)
		// {
		// Ln.e(localException);
		// }
		// break;
		// if (paramDirectorDevice.a() != Device.DeviceType.s)
		// break label163;
		// if (this.by.c() > 0)
		// {
		// localDevice = (Device)this.by.a(0);
		// if ((localDevice != null) && ((localDevice.a() ==
		// Device.DeviceType.h) || (localDevice.a() == Device.DeviceType.s)))
		// break label322;
		// }
		// label144: this.by.a(Integer.valueOf(paramDirectorDevice.t()),
		// paramDirectorDevice, localException);
		// }
		// label163: if (paramDirectorDevice.a() == Device.DeviceType.r)
		// {
		// if (this.by.c() <= 0)
		// break label317;
		// localDevice = (Device)this.bx.a(0);
		// if ((localDevice != null) && ((localDevice.a() ==
		// Device.DeviceType.h) || (localDevice.a() == Device.DeviceType.s)))
		// break label327;
		// label226: if (this.by.c() <= 1)
		// break label317;
		// localDevice = (Device)this.bx.a(1);
		// if (localDevice == null)
		// break label317;
		// if (localDevice.a() == Device.DeviceType.h)
		// break label332;
		// if (localDevice.a() != Device.DeviceType.s)
		// break label317;
		// break label332;
		// }
		// while (true)
		// {
		// this.by.a(Integer.valueOf(paramDirectorDevice.t()),
		// paramDirectorDevice, localException);
		// break;
		// this.by.a(Integer.valueOf(paramDirectorDevice.t()),
		// paramDirectorDevice);
		// break;
		// label317: int j = localException;
		// continue;
		// label322: int k = 1;
		// break label144;
		// label327: k = 1;
		// break label226;
		// label332: k = 2;
		// }
	}

	public void d(boolean paramBoolean) {
		this.bF = paramBoolean;
	}

	public boolean d() {
		return this.bQ;
	}

	public Device e(int paramInt) {
		Device localDevice;
		if (this.bq == null)
			localDevice = null;
		else
			localDevice = (Device) this.bq.a(Integer.valueOf(paramInt));
		return localDevice;
	}

	public void e(DirectorDevice paramDirectorDevice) {
		if (paramDirectorDevice == null)
			return;
		try {
			if (this.bz == null)
				this.bz = new HashIndex<Integer, DirectorDevice>();

			if ((!this.bI) || (this.bz.c() <= 0))
				this.bz.a(Integer.valueOf(paramDirectorDevice.t()),
						paramDirectorDevice, 0);
			else {
				this.bz.a(Integer.valueOf(paramDirectorDevice.t()),
						paramDirectorDevice, 1);
			}
			aV();
		} catch (Exception localException) {
			Ln.e(localException);
		}

	}

	public void e(boolean paramBoolean) {
		this.bG = paramBoolean;
	}

	public Light f(int paramInt) {
		Light localLight;
		if (this.bs == null)
			localLight = null;
		else
			localLight = (Light) this.bs.a(paramInt);
		return localLight;
	}

	public void f() {
		// while (true)
		// {
		// Object localObject;
		// try
		// {
		// aL();
		// W();
		// X();
		// V();
		// U();
		// aM();
		// y(1014);
		// y(1034);
		// if (this._director != null)
		// {
		// aN();
		// k = D();
		// int i = 0;
		// if (i >= k)
		// continue;
		// Device localDevice = b(i);
		// if (localDevice == null)
		// break label383;
		// Device.DeviceType localDeviceType = localDevice.a();
		// if ((localDeviceType != Device.DeviceType.c) && (localDeviceType !=
		// Device.DeviceType.h) && (localDeviceType != Device.DeviceType.f) &&
		// (localDeviceType != Device.DeviceType.b) && (localDeviceType !=
		// Device.DeviceType.l) && (localDeviceType != Device.DeviceType.i) &&
		// (localDeviceType != Device.DeviceType.g))
		// break label383;
		// localDevice.p();
		// }
		// }
		// catch (Exception localObject)
		// {
		// Ln.e(localException);
		// Ln.e("Unable to get updated info for room " + b(), new Object[0]);
		// break label382;
		// localObject = this._director.m();
		// if (!((Project)localObject).b())
		// continue;
		// ((Project)localObject).l(this._director.p());
		// int j = ((Project)localObject).t();
		// int k = 0;
		// if (k >= j)
		// continue;
		// ((Project)localObject).p(k).p();
		// k++;
		// continue;
		// Thermostat localThermostat1 = H();
		// Thermostat localThermostat2 = I();
		// if ((localThermostat1 == null) || (e(localThermostat1.t()) != null))
		// continue;
		// localThermostat1.p();
		// if ((localThermostat2 == null) || ((localThermostat1 != null) &&
		// (localThermostat1.t() == localThermostat2.t())) ||
		// (e(localThermostat2.t()) != null))
		// continue;
		// localThermostat2.p();
		// P();
		// y(1002);
		// y(1005);
		// y(1006);
		// if (localObject == null)
		// continue;
		// localObject = ((Project)localObject).w();
		// if (localObject == null)
		// continue;
		// ((WakeupControls)localObject).c(this.c_);
		// aO();
		// }
		// label382: return;
		// label383: localObject++;
		// }
	}

	public void f(DirectorDevice paramDirectorDevice) {
		if ((paramDirectorDevice != null)
				&& (paramDirectorDevice.getType() != Device.DeviceType.g)) {
			if (this.bA == null)
				this.bA = new HashIndex();
			if (paramDirectorDevice.getType() != Device.DeviceType.u)
				this.bA.a(Integer.valueOf(paramDirectorDevice.t()),
						paramDirectorDevice);
			else
				this.bA.a(Integer.valueOf(paramDirectorDevice.t()),
						paramDirectorDevice, 0);
			if (this.bq == null)
				this.bq = new HashIndex();
			if (e(paramDirectorDevice.t()) == null)
				this.bq.a(Integer.valueOf(paramDirectorDevice.t()),
						paramDirectorDevice);
		}
	}

	public void f(boolean paramBoolean) {
		this.cj = paramBoolean;
	}

	public Light g(int paramInt) {
		Light localLight;
		if (this.bs == null)
			localLight = null;
		else
			localLight = (Light) this.bs.a(Integer.valueOf(paramInt));
		return localLight;
	}

	public void g(boolean paramBoolean) {
		this.bH = paramBoolean;
		if (!this.bH) {
			if (this.bz != null) {
				this.bz.c(Integer.valueOf(121121));
				aV();
			}
		} else
			e((DirectorDevice) this._myMoviesProvider.get());
	}

	public boolean g() {
		return this.bR;
	}

	public int h() {
		if (this.bS == -1)
			this.bS = 0;
		return this.bS;
	}

	public LightingScene h(int paramInt) {
		LightingScene localLightingScene;
		if (this.bt == null)
			localLightingScene = null;
		else
			localLightingScene = (LightingScene) this.bt.a(paramInt);
		return localLightingScene;
	}

	public void h(boolean paramBoolean) {
		this.bI = paramBoolean;
		if (!this.bI) {
			if (this.bz != null) {
				this.bz.c(Integer.valueOf(122123));
				aV();
			}
		} else {
			if (this.bO == null)
				this.bO = ((TVChannelsCollection) this._tvChannelsLibraryProvider
						.get());
			this.bO.b(a());
			e((DirectorDevice) this._tvChannelsDeviceProvider.get());
		}
	}

	public LightingScene i(int paramInt) {
		LightingScene localLightingScene;
		if (this.bt == null)
			localLightingScene = null;
		else
			localLightingScene = (LightingScene) this.bt.a(Integer
					.valueOf(paramInt));
		return localLightingScene;
	}

	public void i(boolean paramBoolean) {
		this.bJ = paramBoolean;
		if (!this.bJ) {
			if (this.bw != null) {
				this.bw.c(Integer.valueOf(122126));
				aU();
			}
		} else {
			if (this.bP == null)
				this.bP = ((RadioStationsCollection) this._radioStationsLibraryProvider
						.get());
			this.bP.b(a());
			b((DirectorDevice) this._radioStationsDeviceProvider.get());
		}
	}

	public boolean i() {
		return this.bU;
	}

	public Device j(int paramInt) {
		if (this.bv)
			aJ();
		Device localDevice;
		if (this.bu == null)
			localDevice = null;
		else
			localDevice = (Device) this.bu.a(paramInt);
		return localDevice;
	}

	public void j(boolean paramBoolean) {
		this.ck = paramBoolean;
	}

	public boolean j() {
		return this.cc;
	}

	public Device k(int paramInt) {
		if (this.bv)
			aJ();
		Device localDevice;
		if (this.bu == null)
			localDevice = null;
		else
			localDevice = (Device) this.bu.a(Integer.valueOf(paramInt));
		return localDevice;
	}

	public boolean k() {
		return this.ce.booleanValue();
	}

	public Device l(int paramInt) {
		Device localDevice;
		if (this.bw == null)
			localDevice = null;
		else
			localDevice = (Device) this.bw.a(paramInt);
		return localDevice;
	}

	public boolean l() {
		return this.aH;
	}

	public Device m(int paramInt) {
		Device localDevice;
		if (this.bw == null)
			localDevice = null;
		else
			localDevice = (Device) this.bw.a(Integer.valueOf(paramInt));
		return localDevice;
	}

	public boolean m() {
		return this.cd;
	}

	public Device n(int paramInt) {
		Device localDevice;
		if (this.bz == null)
			localDevice = null;
		else
			localDevice = (Device) this.bz.a(paramInt);
		return localDevice;
	}

	public boolean n() {
		return this.bT;
	}

	public Room.PowerState o() {
		return this.bV;
	}

	public Device o(int paramInt) {
		Device localDevice;
		if (this.bz == null)
			localDevice = null;
		else
			localDevice = (Device) this.bz.a(Integer.valueOf(paramInt));
		return localDevice;
	}

	public int p() {
		return this.bW;
	}

	public Device p(int paramInt) {
		if (this.bB)
			aK();
		Object localObject1;
		if (this.bA == null) {
			localObject1 = null;
		} else {
			localObject1 = (Device) this.bA.a(paramInt);
			if (localObject1 != null) {
				Object localObject2 = this._director.m();
				if (localObject2 != null) {
					localObject2 = ((Project) localObject2).b(
							((Device) localObject1).t(), false, null);
					if (localObject2 != null)
						localObject1 = localObject2;
				}
			}
		}
		return (Device) (Device) localObject1;
	}

	public int q() {
		return this.bX;
	}

	public Device q(int paramInt) {
		if (this.bB)
			aK();
		Object localObject1;
		if (this.bA == null) {
			localObject1 = null;
		} else {
			localObject1 = (Device) this.bA.a(Integer.valueOf(paramInt));
			if (localObject1 != null) {
				Object localObject2 = this._director.m();
				if (localObject2 != null) {
					localObject2 = ((Project) localObject2).b(paramInt, false,
							null);
					if (localObject2 != null)
						localObject1 = localObject2;
				}
			}
		}
		return (Device) (Device) localObject1;
	}

	public int r() {
		return this.bY;
	}

	public WebCam r(int paramInt) {
		WebCam localWebCam;
		if (this.bC == null)
			localWebCam = null;
		else
			localWebCam = (WebCam) this.bC.a(paramInt);
		return localWebCam;
	}

	public Room.MediaInfo s() {
		return this.cb;
	}

	public WebCam s(int paramInt) {
		WebCam localWebCam;
		if (this.bC == null)
			localWebCam = null;
		else
			localWebCam = (WebCam) this.bC.a(Integer.valueOf(paramInt));
		return localWebCam;
	}

	public ContactDevice t(int paramInt) {
		Object localObject1 = null;
		// if (this.bD == null)
		// {
		// localObject1 = null;
		// }
		// else
		// {
		// localObject1 = (ContactDevice)this.bD.a(paramInt);
		// if (localObject1 != null)
		// {
		// Object localObject2 = this._director.m();
		// if (localObject2 != null)
		// {
		// localObject2 =
		// (ContactDevice)((Project)localObject2).b(((ContactDevice)localObject1).t(),
		// false, null);
		// if (localObject2 != null)
		// localObject1 = localObject2;
		// }
		// }
		// }
		return (ContactDevice) (ContactDevice) localObject1;
	}

	public boolean t() {

		if ((!this.bF) && (K() <= 0))
			return false;
		else
			return true;

	}

	public ContactDevice u(int paramInt) {
		ContactDevice localContactDevice;
		if (this.bD == null)
			localContactDevice = null;
		else
			localContactDevice = (ContactDevice) this.bD.a(Integer
					.valueOf(paramInt));
		return localContactDevice;
	}

	public boolean u() {
		return this.bI;
	}

	public CustomButtonScreen v(int paramInt) {
		CustomButtonScreen localCustomButtonScreen;
		if (this.bE == null)
			localCustomButtonScreen = null;
		else
			localCustomButtonScreen = (CustomButtonScreen) this.bE.a(paramInt);
		return localCustomButtonScreen;
	}

	public boolean v() {

		if ((!this.bG) && (getListenDeviceCount() <= 0))
			return false;
		else
			return true;

	}

	public CustomButtonScreen w(int paramInt) {
		CustomButtonScreen localCustomButtonScreen;
		if (this.bE == null)
			localCustomButtonScreen = null;
		else
			localCustomButtonScreen = (CustomButtonScreen) this.bE.a(Integer
					.valueOf(paramInt));
		return localCustomButtonScreen;
	}

	public boolean w() {
		return this.bJ;
	}

	public boolean x() {
		if (this.bB)
			aK();
		int i;
		if ((L() <= 0) && (M() <= 0))
			return false;
		else
			return true;
	}

	public boolean x(int paramInt) {
		return false;
		// while (true)
		// {
		// int j;
		// try
		// {
		// if (this._director != null)
		// break label112;
		// int i = 0;
		// break label110;
		// Ln.e("Unable to change the volume to " + paramInt +
		// ".  0-100 is valid range.", new Object[0]);
		// i = 0;
		// break label110;
		// SetVolumeCommand localSetVolumeCommand =
		// (SetVolumeCommand)CommandFactory.SetVolumeProvider.a();
		// localSetVolumeCommand.a(paramInt);
		// localSetVolumeCommand.b(a());
		// boolean bool = this._director.a(localSetVolumeCommand);
		// if (bool)
		// {
		// this.bS = paramInt;
		// a(true);
		// }
		// }
		// catch (Exception j)
		// {
		// Ln.e(localException);
		// j = 0;
		// }
		// label110: return j;
		// label112: if (paramInt < 0)
		// continue;
		// if (paramInt <= 100)
		// continue;
		// }
	}

	public boolean y() {

		if (E() <= 0)
			return false;
		else
			return true;

	}

	public boolean y(int paramInt) {
		boolean bool = false;
		try {
			if (this._director != null) {
				GetVariableCommand localGetVariableCommand = (GetVariableCommand) CommandFactory.GetVariableProvider
						.get();
				localGetVariableCommand.b(paramInt);
				localGetVariableCommand.a(a());
				bool = this._director.a(localGetVariableCommand);
				bool = bool;
				bool = bool;
			}
		} catch (Exception localException) {

		}
		return bool;
	}

	public void z(int paramInt) {
		if (this.bK == null)
			this.bK = new HashIndex();
		this.bK.a(Integer.valueOf(paramInt), Integer.valueOf(paramInt));
		aP();
	}

	public boolean z() {
		if (this.bv)
			aJ();
		int i;
		if ((G() <= 0) && (this.cg <= 0) && (this.ch <= 0))
			return false;
		else
			return true;

	}

	public class MediaInfoImpl implements Room.MediaInfo {
		public int a = -1;
		public int b = -1;
		public int c = 0;
		public String d = null;
		public String e = null;
		public String f = null;
		public String g = null;
		public String h = null;
		public String i = null;
		public String j = null;
		public Bitmap k = null;
		public boolean l = false;
		public boolean m = false;

		// private final Runnable o = new DirectorRoom.MediaInfoImpl.1(this);

		protected MediaInfoImpl(DirectorRoom paramDirectorRoom) {
		}

		public void a() {
			// if ((this.j != null) && (this.j.length() != 0))
			// {
			// this.l = true;
			// DirectorRoom.b(this.n).b(this.o);
			// }
			//
		}

		public void a(Bitmap paramBitmap) {

			this.k = paramBitmap;
			// this.n.aP();
		}

		public String b() {
			return this.h;
		}

		public String c() {
			return this.i;
		}

		public String d() {
			return this.g;
		}

		public Bitmap e() {
			Bitmap localBitmap = this.k;
			return localBitmap;

		}

		public int f() {
			return this.c;
		}

		public String g() {
			return this.e;
		}

		public String h() {
			return this.f;
		}

		public int i() {
			return this.a;
		}

		public boolean j() {
			return this.l;
		}

		public boolean k() {
			return this.m;
		}
	}

}
