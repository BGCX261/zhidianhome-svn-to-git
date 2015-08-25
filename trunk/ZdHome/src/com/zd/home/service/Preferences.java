package com.zd.home.service;

import roboguice.inject.SharedPreferencesName;

public abstract interface Preferences {

	@SharedPreferencesName
	public static final String a = Preferences.class.getName();
	public static final String b = a + ".manualConnections";
	public static final String c = a + ".lastConnection";
	public static final String d = a + ".lastRoomID_";
	public static final String e = a + ".isInDemoMode";
	public static final String f = a + ".lastFriendlyMessageId";
	public static final String g = a + ".isAppDisabled";
	public static final String h = a + ".currentRoomFor_";
	public static final String i = a + ".volumeVisibleFor_";
	public static final String j = a + ".currentAudioQueueIdFor_";
	public static final String k = a + ".currentDeviceIdFor_";
	public static final String l = a + ".lastLicenseCheckDate";
	public static final String m = a + ".isInDedicatedMode";
	public static final String n = a + ".screensaverTime";
	public static final String o = a + ".stayConnected";
	public static final String p = a + ".loggingEnabled";
	public static final String q = a + ".activationCode";
	public static final String r = a + ".sessionId";
	public static final String s = a + ".sessionTimestamp";
	public static final String t = a + ".confirmRoomOff";
}
