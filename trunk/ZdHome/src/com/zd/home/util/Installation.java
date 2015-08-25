package com.zd.home.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import android.content.Context;
import android.net.wifi.WifiManager;

public class Installation {
	private static String a = null;
	private static final String b = "INSTALLATION";
	private static final boolean c = true;

	/** @deprecated */
	public static String a(Context paramContext) {

		File file = null;
		if (a == null)
			file = new File(paramContext.getFilesDir(), "INSTALLATION");
		if ((!file.exists()) || (file.length() == 0L))
			a(file, paramContext);
		return a(file);

	}

	private static String a(File paramFile) {
		try {
			RandomAccessFile localRandomAccessFile = new RandomAccessFile(
					paramFile, "r");
			byte[] arrayOfByte = new byte[(int) localRandomAccessFile.length()];
			localRandomAccessFile.readFully(arrayOfByte);
			localRandomAccessFile.close();
			return new String(arrayOfByte);
		} catch (Exception e) {

		}
		return null;
	}

	public static final String a(String paramString) {
		try {
			Object localObject = MessageDigest.getInstance("MD5");
			((MessageDigest) localObject).update(paramString.getBytes());
			byte[] arrayOfByte = ((MessageDigest) localObject).digest();
			StringBuffer localStringBuffer = new StringBuffer();
			for (int i = 0; i < arrayOfByte.length; i++) {
				for (localObject = Integer.toHexString(0xFF & arrayOfByte[i]); ((String) localObject)
						.length() < 2; localObject = "0" + (String) localObject)
					;
				localStringBuffer.append((String) localObject);
			}
			return localStringBuffer.toString();
		} catch (NoSuchAlgorithmException str) {

		}
		return null;
	}

	private static void a(File paramFile, Context paramContext) {
		try {
			FileOutputStream localFileOutputStream = new FileOutputStream(
					paramFile);
			WifiManager wifiManager = (WifiManager) paramContext
					.getSystemService("wifi");
			if (wifiManager != null) {
				String macaddress = wifiManager.getConnectionInfo()
						.getMacAddress();
				if (macaddress != null)
					localFileOutputStream.write(macaddress.getBytes());
			}
			localFileOutputStream.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
