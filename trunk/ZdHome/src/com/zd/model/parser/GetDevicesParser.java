package com.zd.model.parser;

import java.util.Vector;

import org.xmlpull.v1.XmlPullParser;

import roboguice.util.Ln;

import com.zd.model.device.DirectorDevice;

public class GetDevicesParser extends ResponseParser {
	public static final String a = "GetDeviceParser";
	Vector<DirectorDevice> b;
	int c;
	int d = 0;

	public int a() {
		return this.d;
	}

	public void a(String paramString, XmlPullParser paramXmlPullParser) {
		super.a(paramString, paramXmlPullParser);
		try {
			if ((paramString.equalsIgnoreCase("source"))
					|| (paramString.equalsIgnoreCase("id")))
				b(true);
			return;
		} catch (Exception localException) {
			while (true)
				Ln.e(localException);
		}
	}

	public void b(String paramString, XmlPullParser paramXmlPullParser) {
		// try
		// {
		// if (paramString.equalsIgnoreCase("source"))
		// {
		// DirectorDevice localDirectorDevice;
		// DirectorRoom localDirectorRoom;
		// if (this.c != -1)
		// {
		// DirectorProject localDirectorProject = this._director.m();
		// localDirectorDevice = (DirectorDevice)localDirectorProject.b(this.c,
		// true, this._director.p());
		// localDirectorRoom = null;
		// if ((this.p != null) && ((this.p instanceof RoomCommand)))
		// localDirectorRoom =
		// (DirectorRoom)localDirectorProject.h(((RoomCommand)this.p).e());
		// if (localDirectorDevice == null)
		// break label153;
		// if (localDirectorRoom != null)
		// localDirectorRoom.a(localDirectorDevice, this.d);
		// }
		// while (true)
		// {
		// this.b.add(localDirectorDevice);
		// if (localDirectorRoom != null)
		// localDirectorRoom.a(this.c, this.d, this._director.p());
		// super.b(paramString, paramXmlPullParser);
		// return;
		// label153: localDirectorDevice = new DirectorDevice();
		// localDirectorDevice.d(this.c);
		// }
		// }
		// }
		// catch (Exception str)
		// {
		// while (true)
		// {
		// Ln.e(localException);
		// continue;
		// if (!paramString.equalsIgnoreCase("id"))
		// continue;
		// String str = this.q.toString();
		// if ((str != null) && (str.length() > 0))
		// {
		// this.c = Integer.parseInt(str);
		// continue;
		// }
		// this.c = -1;
		// }
		// }
	}

	public void b(XmlPullParser paramXmlPullParser) {
		try {
			super.b(paramXmlPullParser);
			this.b = new Vector();
			this.c = -1;
			return;
		} catch (Exception localException) {
			while (true)
				Ln.e(localException);
		}
	}

	public void c(int paramInt) {
		this.d = paramInt;
	}
}
