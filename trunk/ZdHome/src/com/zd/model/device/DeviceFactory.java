package com.zd.model.device;

import java.util.HashMap;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.zd.model.device.Device.DeviceType;

public final class DeviceFactory {
	public static final String A = "contactsingle_doorcontactsensor_c4";
	public static final String B = "contactsingle_motionsensor_c4";
	public static final String C = "relaysingle_door_c4";
	public static final String D = "relaysingle_doorlock_c4";
	public static final String E = "relaysingle_drapes_c4";
	public static final String F = "control4_contactrelayextender";
	public static final String G = "relaysingle_drivewayheater_c4";
	public static final String H = "relaysingle_electronicgate_c4";
	public static final String I = "relaysingle_fan_c4";
	public static final String J = "relaysingle_fountain_c4";
	public static final String K = "relaycontact_garagedoor_c4";
	public static final String L = "contactsingle_garagedoorsensor_c4";
	public static final String M = "relaysingle_gasfireplace_c4";
	public static final String N = "relaysingle_relay_c4";
	public static final String O = "contactsingle_carbonmonoxidedetector_c4";
	public static final String P = "contactsingle_contactswitch_c4";
	public static final String Q = "contactsingle_doorbell_c4";
	public static final String R = "contactsingle_drivewaysensor_c4";
	public static final String S = "contactsingle_gate_c4";
	public static final String T = "contactsingle_glassbreakdetector_c4";
	public static final String U = "contactsingle_heatdetector_c4";
	public static final String V = "contactsingle_humiditysensor_c4";
	public static final String W = "contactsingle_irbeam_c4";
	public static final String X = "contactsingle_pressuresensor_c4";
	public static final String Y = "contactsingle_smokedetector_c4";
	public static final String Z = "contactsingle_watersensor_c4";

	@Inject
	private static Provider<DirectorContactDevice> _blindsDeviceProvider;

	@Inject
	private static Provider<CableBox> _cableBoxProvider;

	@Inject
	private static Provider<DirectorWebCam> _cameraProvider;

	@Inject
	private static Provider<CDPlayer> _cdPlayerProvider;

	@Inject
	private static Provider<DirectorContactDevice> _contactDeviceProvider;

	@Inject
	private static Provider<DirectorDevice> _deviceProvider;

	@Inject
	private static Provider<DirectorDigitalAudio> _digitalAudioProvider;

	@Inject
	private static Provider<DiscChanger> _discChangerProvider;

	@Inject
	private static Provider<DVDPlayer> _dvdPlayerProvider;

	@Inject
	private static Provider<iPod> _iPodProvider;

	@Inject
	private static Provider<Light> _lightProvider;

	@Inject
	private static Provider<MediaPlayer> _mediaPlayerProvider;

	@Inject
	private static Provider<PoolControl> _poolControlProvider;

	@Inject
	private static Provider<Receiver> _receiverProvider;

	@Inject
	private static Provider<DirectorContactDevice> _relayDeviceProvider;

	@Inject
	private static Provider<SatelliteTV> _satelliteTVProvider;

	@Inject
	private static Provider<SecuritySystem> _securityProvider;

	@Inject
	private static Provider<Thermostat> _thermostatProvider;

	@Inject
	private static Provider<DirectorTuner> _tunerProvider;

	@Inject
	private static Provider<TV> _tvProvider;

	@Inject
	private static Provider<VCR> _vcrProvider;

	@Inject
	private static Provider<DirectorXMTuner> _xmTunerProvider;
	public static final int a = 10;
	public static final String aA = "contactsingle_glassbreakdetector";
	public static final String aB = "contactsingle_heatdetector";
	public static final String aC = "contactsingle_humiditysensor";
	public static final String aD = "contactsingle_irbeam";
	public static final String aE = "contactsingle_pressuresensor";
	public static final String aF = "contactsingle_smokedetector";
	public static final String aG = "contactsingle_watersensor";
	public static final String aH = "relaysingle_sprinklers";
	public static final String aI = "relaysingle_motorizedlift";
	public static final String aJ = "relaysingle_motorizedscreen";
	public static final String aK = "relaysingle_pump";
	public static final String aL = "relaysingle_radiantfloor";
	public static final String aM = "cardaccess_wirelesscontact";
	public static final String aN = "cardaccess_wirelessrelay";
	public static final String aO = "contact_cabridge_micro_dws";
	private static HashMap<String, Device.DeviceType> aP = null;
	private static HashMap<String, Device.DeviceType> aQ = null;
	private static HashMap<String, Device.DeviceType> aR = null;
	private static final String aS = "6ee4d6d4-e772-411f-8166-5b8b8c0386ca";
	public static final String aa = "relaysingle_sprinklers_c4";
	public static final String ab = "relaysingle_motorizedlift_c4";
	public static final String ac = "relaysingle_motorizedscreen_c4";
	public static final String ad = "relaysingle_pump_c4";
	public static final String ae = "relaysingle_radiantfloor_c4";
	public static final String af = "contactsingle_windowcontactsensor";
	public static final String ag = "contactsingle_doorcontactsensor";
	public static final String ah = "contactsingle_motionsensor";
	public static final String ai = "relaysingle_door";
	public static final String aj = "relaysingle_doorlock";
	public static final String ak = "relaysingle_drapes";
	public static final String al = "control4_contactrelayextender_c4";
	public static final String am = "relaysingle_drivewayheater";
	public static final String an = "relaysingle_electronicgate";
	public static final String ao = "relaysingle_fan";
	public static final String ap = "relaysingle_fountain";
	public static final String aq = "relaycontact_garagedoor";
	public static final String ar = "contactsingle_garagedoorsensor";
	public static final String as = "relaysingle_garagedoor_c4";
	public static final String at = "relaysingle_gasfireplace";
	public static final String au = "relaysingle_relay";
	public static final String av = "contactsingle_carbonmonoxidedetector";
	public static final String aw = "contactsingle_contactswitch";
	public static final String ax = "contactsingle_doorbell";
	public static final String ay = "contactsingle_drivewaysensor";
	public static final String az = "contactsingle_gate";
	public static final int b = 11;
	public static final int c = 12;
	public static final int d = 13;
	public static final int e = 14;
	public static final int f = 15;
	public static final int g = 16;
	public static final int h = 17;
	public static final int i = 18;
	public static final int j = 19;
	public static final int k = 20;
	public static final int l = 21;
	public static final int m = 22;
	public static final int n = 23;
	public static final int o = 24;
	public static final int p = 25;
	public static final int q = 26;
	public static final int r = 27;
	public static final int s = 28;
	public static final int t = 29;
	public static final int u = 30;
	public static final int v = 31;
	public static final int w = 100004;
	public static final int x = 100007;
	public static final String y = "6ee4d6d4-e772-411f-8166-5b8b8c0386ca";
	public static final String z = "contactsingle_windowcontactsensor_c4";

	public static int a(String s1) {
		int i1 = 0;
		if (!(s1 != null && s1.length() != 0))
			return i1;
		if (s1 != null)
			s1 = s1.toLowerCase();
		String s2;
		int j1;
		int k1;
		if (s1 != null && s1.length() > 13)
			s2 = s1.substring(i1, 14);
		else
			s2 = null;
		if (s1 != null) {
			if (s1.indexOf("thermostat") >= 0)
				j1 = 1;
			else
				j1 = i1;
			if (s1.indexOf("ipod") >= 0) {
				k1 = j1;
				j1 = 1;
			} else {
				k1 = j1;
				j1 = i1;
			}
		} else {
			j1 = i1;
			k1 = i1;
		}
		int l1 = -1;
		try {
			l1 = Integer.parseInt(s1);
		} catch (Exception e) {
			// TODO: handle exception
		}
		if (!(l1 != 10 && !s1.equals("light") && !s1.equals("outlet_light")))
			i1 = 1;
		if (k1 != 0 || l1 == 22) {
			if (!s1.contains("thermostat_232_aprilaire")
					&& !s1.contains("thermostat_485_aprilaire"))
				i1 = 2;
		} else if (s1.equals("camera_ip_http_URL") || s2 != null
				&& s2.equals("camera_ip_http"))
			i1 = 3;
		else if (j1 != 0 || l1 == 15 || l1 == 21
				|| s1.equals("control4_digitalaudio") || s1.equals("Rhapsody")
				|| s1.equals("Audio Zones"))
			i1 = 4;
		else if (l1 == 23 || l1 == 29)
			i1 = 4;
		else if (l1 == 14 || l1 == 17 || l1 == 28 || s1.equals("discchanger"))
			i1 = 5;
		else if (l1 == 11 || l1 == 19 || s1.equals("cable")
				|| s1.equals("rf_cable") || s1.equals("satellite"))
			i1 = 5;
		else if (l1 != 25 && !s1.equals("security"))
			if (l1 == 30 || s1.equals("pool"))
				i1 = 3;
			else if (s1.equals("media_player") || l1 == 12)
				i1 = 7;

		return i1;

	}

	private static DirectorDevice a(Device.DeviceType paramDeviceType,
			String paramString1, String paramString2, String paramString3,
			Device paramDevice) {
		DirectorDevice localDirectorDevice = null;
		if (paramDeviceType != Device.DeviceType.e) {
			if (paramDeviceType != Device.DeviceType.o) {
				if (paramDeviceType != Device.DeviceType.l) {
					if (paramDeviceType != Device.DeviceType.N) {
						if (paramDeviceType != Device.DeviceType.F)
							if (paramDeviceType != Device.DeviceType.h) {
								if (paramDeviceType != Device.DeviceType.n) {
									if (paramDeviceType != Device.DeviceType.k) {
										if ((paramDeviceType != Device.DeviceType.L)
												&& (paramDeviceType != Device.DeviceType.u))
											if (paramDeviceType != Device.DeviceType.i) {
												if (paramDeviceType != Device.DeviceType.c) {
													if ((paramDeviceType != Device.DeviceType.E)
															&& (paramDeviceType != Device.DeviceType.K))
														if (paramDeviceType != Device.DeviceType.t) {
															if ((paramDeviceType != Device.DeviceType.M)
																	&& (paramDeviceType != Device.DeviceType.p)
																	&& (paramDeviceType != Device.DeviceType.J)
																	&& (paramDeviceType != Device.DeviceType.A))
																if (paramDeviceType != Device.DeviceType.j) {
																	if ((paramDeviceType != Device.DeviceType.D)
																			&& (paramDeviceType != Device.DeviceType.r))
																		if (paramDeviceType != Device.DeviceType.y) {
																			if (paramDeviceType != Device.DeviceType.I) {
																				if ((paramDeviceType != Device.DeviceType.H)
																						&& (paramDeviceType != Device.DeviceType.s)
																						&& (paramDeviceType != Device.DeviceType.C))
																					if (paramDeviceType != Device.DeviceType.v) {
																						if (paramDeviceType != Device.DeviceType.G)
																							if (paramDeviceType != Device.DeviceType.f) {
																								if (paramDeviceType != Device.DeviceType.b) {
																									if (paramDeviceType != Device.DeviceType.w) {
																										if (paramDeviceType != Device.DeviceType.q)
																											if (paramDeviceType != Device.DeviceType.d) {
																												if (paramDeviceType != Device.DeviceType.m) {
																													if (paramDeviceType != Device.DeviceType.B)
																														if (paramDeviceType != Device.DeviceType.g) {
																															if (paramDeviceType != Device.DeviceType.x) {
																																if (paramDeviceType != Device.DeviceType.z)
																																	;
																															} else
																																localDirectorDevice = (DirectorDevice) _xmTunerProvider
																																		.get();
																														} else
																															localDirectorDevice = (DirectorDevice) _cameraProvider
																																	.get();
																												} else
																													localDirectorDevice = (DirectorDevice) _vcrProvider
																															.get();
																											} else
																												localDirectorDevice = (DirectorDevice) _tvProvider
																														.get();
																									} else
																										localDirectorDevice = (DirectorDevice) _tunerProvider
																												.get();
																								} else
																									localDirectorDevice = (DirectorDevice) _thermostatProvider
																											.get();
																							} else
																								localDirectorDevice = (DirectorDevice) _securityProvider
																										.get();
																					} else if ((paramString1 == null)
																							|| (!paramString1
																									.equalsIgnoreCase("cable")))
																						localDirectorDevice = (DirectorDevice) _satelliteTVProvider
																								.get();
																					else
																						localDirectorDevice = (DirectorDevice) _cableBoxProvider
																								.get();
																			} else
																				localDirectorDevice = (DirectorDevice) _relayDeviceProvider
																						.get();
																		} else
																			localDirectorDevice = (DirectorDevice) _receiverProvider
																					.get();
																} else
																	localDirectorDevice = (DirectorDevice) _poolControlProvider
																			.get();
														} else
															localDirectorDevice = (DirectorDevice) _mediaPlayerProvider
																	.get();
												} else
													localDirectorDevice = (DirectorDevice) _lightProvider
															.get();
											} else
												localDirectorDevice = (DirectorDevice) _iPodProvider
														.get();
									} else
										localDirectorDevice = (DirectorDevice) _dvdPlayerProvider
												.get();
								} else
									localDirectorDevice = (DirectorDevice) _discChangerProvider
											.get();
							} else
								localDirectorDevice = (DirectorDevice) _digitalAudioProvider
										.get();
					} else
						localDirectorDevice = (DirectorDevice) _blindsDeviceProvider
								.get();
				} else
					localDirectorDevice = (DirectorDevice) _contactDeviceProvider
							.get();
			} else
				localDirectorDevice = (DirectorDevice) _cdPlayerProvider.get();
		} else
			localDirectorDevice = (DirectorDevice) _cableBoxProvider.get();
		return localDirectorDevice;
	}

	public static DirectorDevice a(String paramString1, String paramString2,
			String paramString3, Device paramDevice) {
		DirectorDevice localDirectorDevice = null;
		String str1, str2, str3;
		DeviceType localDeviceType;

		if (aP == null)
			c();
		if (aQ == null)
			b();
		if (aR == null)
			a();
		// Ln.a("Creating Device. Type: " + paramString1 + ", deviceControl: " +
		// paramString2 + ", driver: " + paramString3 + ", proxyDevice: " +
		// paramDevice, new Object[0]);
		if (paramString1 != null)
			str1 = paramString1.toLowerCase();
		else {
			// Ln.a("No Type given for control: " + paramString2 +
			// ", proxyDevice: " + paramDevice, new Object[0]);
			str1 = "";
		}
		if (paramString2 != null)
			str2 = paramString2.toLowerCase();
		else {
			// label242: Ln.a("No Device Control given for type: " + str1 +
			// ", proxyDevice: " + paramDevice, new Object[0]);
			str2 = "";
		}
		if (paramString3 != null)
			str3 = paramString3.toLowerCase();
		else {
			// label289: Ln.a("No Device Driver given for type: " + str1 +
			// ", proxyDevice: " + paramDevice, new Object[0]);
			str3 = "";
		}
		localDeviceType = (Device.DeviceType) aP.get(str2);
		if (localDeviceType != null)
			localDirectorDevice = a(localDeviceType, str1, str2, str3,
					paramDevice);
		else {
			localDeviceType = (Device.DeviceType) aR.get(str3);
			if (localDeviceType != null)
				localDirectorDevice = a(localDeviceType, str1, str2, str3,
						paramDevice);
			else {
				localDeviceType = (Device.DeviceType) aP.get(str1);
				if (localDeviceType != null)
					localDirectorDevice = a(localDeviceType, str1, str2, str3,
							paramDevice);
			}
		}
		if (localDirectorDevice == null)
			localDirectorDevice = (DirectorDevice) _deviceProvider.get();

		localDirectorDevice.h(str1);
		localDirectorDevice.i(str2);
		localDirectorDevice.k(str3);
		return localDirectorDevice;

	}

	private static void a() {
		aR = new HashMap();
		aR.put("100000", Device.DeviceType.C);
		aR.put(Integer.toString(11), Device.DeviceType.d);
		aR.put(Integer.toString(14), Device.DeviceType.k);
		aR.put(Integer.toString(15), Device.DeviceType.o);
		aR.put(Integer.toString(17), Device.DeviceType.n);
		aR.put(Integer.toString(19), Device.DeviceType.v);
		aR.put(Integer.toString(21), Device.DeviceType.n);
		aR.put(Integer.toString(28), Device.DeviceType.m);
		aR.put("6ee4d6d4-e772-411f-8166-5b8b8c0386ca", Device.DeviceType.t);
		aR.put(Integer.toString(23), Device.DeviceType.w);
		aR.put(Integer.toString(29), Device.DeviceType.x);
		aR.put(Integer.toString(12), Device.DeviceType.y);
		aR.put(Integer.toString(12), Device.DeviceType.b);
		aR.put(Integer.toString(20), Device.DeviceType.D);
		aR.put(Integer.toString(24), Device.DeviceType.t);
	}

	public static DirectorDevice b(String paramString1, String paramString2,
			String paramString3, Device paramDevice) {
		return a(paramString1, paramString2, paramString3, paramDevice);
	}

	private static void b() {
		aQ = new HashMap();
		aQ.put("100102", Device.DeviceType.E);
		aQ.put("100104", Device.DeviceType.B);
		aQ.put("100111", Device.DeviceType.F);
		aQ.put("100112", Device.DeviceType.G);
		aQ.put("100117", Device.DeviceType.H);
		aQ.put("100119", Device.DeviceType.s);
	}

	private static void c() {
		aP = new HashMap();
		aP.put("control4_contactsingle", Device.DeviceType.l);
		aP.put("control4_relaysingle", Device.DeviceType.I);
		aP.put("camera_ip_http", Device.DeviceType.g);
		aP.put("control4_hcgeneric", Device.DeviceType.J);
		aP.put("control4_hc200", Device.DeviceType.J);
		aP.put("control4_hc300", Device.DeviceType.J);
		aP.put("control4_hc500", Device.DeviceType.J);
		aP.put("control4_hc800", Device.DeviceType.J);
		aP.put("control4_hc250", Device.DeviceType.J);
		aP.put("control4_hc100", Device.DeviceType.J);
		aP.put("control4_touchscreen", Device.DeviceType.J);
		aP.put("control4_touchscreen_z7", Device.DeviceType.J);
		aP.put("control4_touchscreen_c57", Device.DeviceType.J);
		aP.put("control4_touchscreen_z10", Device.DeviceType.J);
		aP.put("control4_touchscreen_bcm7", Device.DeviceType.J);
		aP.put("light", Device.DeviceType.c);
		aP.put("thermostat", Device.DeviceType.b);
		aP.put("thermostatv2", Device.DeviceType.b);
		aP.put("blind", Device.DeviceType.N);
		aP.put("blindv2", Device.DeviceType.N);
		aP.put("control4_digitalaudio", Device.DeviceType.h);
		aP.put("ipod", Device.DeviceType.i);
		aP.put("receiver", Device.DeviceType.y);
		aP.put("security", Device.DeviceType.f);
		aP.put("pool", Device.DeviceType.j);
		aP.put("tv", Device.DeviceType.d);
		aP.put("dvd", Device.DeviceType.k);
		aP.put("cd", Device.DeviceType.o);
		aP.put("satellite", Device.DeviceType.v);
		aP.put("discchanger", Device.DeviceType.n);
		aP.put("vcr", Device.DeviceType.m);
		aP.put("media_player", Device.DeviceType.t);
		aP.put("control4_agent_rhapsody", Device.DeviceType.s);
		aP.put("control4_agent_rhapsody", Device.DeviceType.H);
		aP.put("control4_agent_wakeup", Device.DeviceType.B);
		aP.put("control4_agent_custombuttons", Device.DeviceType.F);
		aP.put("control4_agent_macros", Device.DeviceType.K);
		aP.put("control4_agent_intercom", Device.DeviceType.L);
		aP.put("control4_agent_screensaver", Device.DeviceType.G);
		aP.put("control4_network_mediastorage", Device.DeviceType.M);
	}
}
