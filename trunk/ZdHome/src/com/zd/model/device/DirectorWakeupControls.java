package com.zd.model.device;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import org.xmlpull.v1.XmlPullParser;

import roboguice.util.Ln;
import android.app.Application;

import com.google.inject.Inject;
import com.zd.home.R;
import com.zd.model.HashIndex;
import com.zd.model.Variable;
import com.zd.model.command.Command;

public class DirectorWakeupControls extends DirectorDevice implements
		WakeupControls {

	@Inject
	private Application _context;
	protected Timer k;
	protected TimerTask l;
	protected ArrayList<WakeupControls.OnWakeupControlsUpdateListener> m;
	private HashIndex<String, WakeupControls.WakeupScene> n;
	private HashIndex<Integer, WakeupControls.WakeupSetting> o;
	private boolean p = true;
	private boolean q = false;
	private final HashIndex<Integer, Boolean> r = new HashIndex();
	private final HashIndex<Integer, Boolean> s = new HashIndex();
	private final HashIndex<Integer, Timer> t = new HashIndex();
	private final HashIndex<Integer, TimerTask> u = new HashIndex();

	public DirectorWakeupControls() {
		d(100104);
	}

	public Device.DeviceType getType() {
		return Device.DeviceType.B;
	}

	public WakeupControls.WakeupScene a(String paramString) {
		WakeupControls.WakeupScene localWakeupScene;
		if (this.n == null)
			localWakeupScene = null;
		else
			localWakeupScene = (WakeupControls.WakeupScene) this.n
					.a(paramString);
		return localWakeupScene;
	}

	public void a(int paramInt, boolean paramBoolean) {
		try {
			this.r.a(Integer.valueOf(paramInt), Boolean.valueOf(paramBoolean));
			return;
		} catch (Exception localException) {
			while (true)
				Ln.e(localException);
		}
	}

	public void a(Variable paramVariable, boolean paramBoolean) {
		super.a(paramVariable, paramBoolean);
	}

	public void a(
			WakeupControls.OnWakeupControlsUpdateListener paramOnWakeupControlsUpdateListener) {
		if (paramOnWakeupControlsUpdateListener == null)
			;
		if (this.m == null)
			this.m = new ArrayList();
		synchronized (this.m) {
			this.m.add(paramOnWakeupControlsUpdateListener);
		}

	}

	public void a(WakeupControls.WakeupScene paramWakeupScene) {
		if (paramWakeupScene == null)
			;
		try {
			if (this.n == null)
				this.n = new HashIndex();
			this.n.a(paramWakeupScene.a, paramWakeupScene);
		} catch (Exception localException) {
			Ln.e(localException);
		}

	}

	public void a(WakeupControls.WakeupSetting paramWakeupSetting, int paramInt) {
		try {
			if (this.o == null)
				this.o = new HashIndex();
			this.o.a(Integer.valueOf(paramInt), paramWakeupSetting);
			return;
		} catch (Exception localException) {
			while (true)
				Ln.e(localException);
		}
	}

	public void a(XmlPullParser paramXmlPullParser, Command paramCommand) {
		super.a(paramXmlPullParser, paramCommand);
	}

	public void a(boolean paramBoolean) {
		this.p = paramBoolean;
	}

	public boolean a(int paramInt) {
		try {
			Boolean localBoolean = (Boolean) this.r
					.a(Integer.valueOf(paramInt));

			return localBoolean;
		} catch (Exception i) {

		}
		return false;
	}

	public boolean a(String paramString1, String paramString2, int paramInt,
			boolean paramBoolean) {
		// Object localObject1 = null;
		// try
		// {
		// Ln.a("Scheduling Wakeup.", new Object[0]);
		// Object localObject2 = new
		// StringBuilder().append("<param><name>ENABLE</name><value type=\"BOOL\"><static>");
		// if (paramBoolean);
		// int j;
		// for (int i = 1; ; j = 0)
		// {
		// localObject2 = i + "</static></value></param>" +
		// "<param><name>TIME</name><value type=\"STRING\"><static>" +
		// paramString1 + "</static></value></param>" +
		// "<param><name>SCENE_ID</name><value type=\"INT\"><static>" +
		// paramString2 + "</static></value></param>" +
		// "<param><name>ROOM</name><value type=\"INT\"><static>" + paramInt +
		// "</static></value></param>";
		// SendToDeviceCommand localSendToDeviceCommand =
		// (SendToDeviceCommand)CommandFactory.SendToDeviceProvider.a();
		// localSendToDeviceCommand.c("SCHEDULE_WAKEUP");
		// localSendToDeviceCommand.b(t());
		// localSendToDeviceCommand.d(true);
		// localSendToDeviceCommand.c(false);
		// localSendToDeviceCommand.a((String)localObject2);
		// bool = this._director.a(localSendToDeviceCommand);
		// if (bool)
		// {
		// WakeupControls.WakeupSetting localWakeupSetting = i(paramInt);
		// if (localWakeupSetting != null)
		// {
		// localWakeupSetting.b = paramBoolean;
		// localWakeupSetting.a = paramString2;
		// localObject2 = paramString1.split(":");
		// if (localObject2.length <= 0)
		// break;
		// localSendToDeviceCommand = localObject2[0];
		// if (localObject2.length > 1)
		// localObject1 = localObject2[1];
		// localWakeupSetting.c = localSendToDeviceCommand;
		// localWakeupSetting.d = localObject1;
		// }
		// }
		// return bool;
		// }
		// }
		// catch (Exception localException1)
		// {
		//
		// }
		return false;
	}

	public int b() {
		int i;
		if (this.n == null)
			i = 0;
		else
			i = this.n.c();
		return i;
	}

	public int b(String paramString) {
		int j = 0;
		if (this.n == null) {
			int i = -1;
		} else {
			WakeupControls.WakeupScene localWakeupScene = (WakeupControls.WakeupScene) this.n
					.a(paramString);
			j = this.n.b(localWakeupScene);
		}
		return j;
	}

	// ERROR //
	public void b(int paramInt, boolean paramBoolean) {

	}

	public void b(Variable paramVariable, boolean paramBoolean) {
		// if (paramVariable == null);
		// while (true)
		// {
		// return;
		// try
		// {
		// Object localObject1 = paramVariable.e();
		// if ((localObject1 == null) ||
		// (!((String)localObject1).equalsIgnoreCase("xml")))
		// continue;
		// localObject1 = paramVariable.f("room");
		// if ((localObject1 == null) || (((String)localObject1).length() <= 0))
		// continue;
		// int i = Integer.parseInt((String)localObject1);
		// String str1 = paramVariable.f("enable");
		// String str2 = paramVariable.f("time");
		// Object localObject2 = paramVariable.f("sceneid");
		// localObject1 = i(i);
		// if (localObject1 == null)
		// {
		// localObject1 = new WakeupControls.WakeupSetting();
		// a((WakeupControls.WakeupSetting)localObject1, i);
		// }
		// if (str1 != null)
		// ((WakeupControls.WakeupSetting)localObject1).b = BooleanUtil.a(str1);
		// ((WakeupControls.WakeupSetting)localObject1).a =
		// ((String)localObject2);
		// if ((str2 != null) && (str2.length() > 0))
		// {
		// localObject2 = str2.split(":");
		// if (localObject2.length > 0)
		// ((WakeupControls.WakeupSetting)localObject1).c = localObject2[0];
		// if (localObject2.length > 1)
		// ((WakeupControls.WakeupSetting)localObject1).d = localObject2[1];
		// }
		// if (this.j == null)
		// continue;
		// this.j.a(this);
		// }
		// catch (Exception localException)
		// {
		// Ln.e(localException);
		// }
		// }
	}

	public void b(
			WakeupControls.OnWakeupControlsUpdateListener paramOnWakeupControlsUpdateListener) {
		if (paramOnWakeupControlsUpdateListener == null)
			;

		if (this.m == null)
			return;
		synchronized (this.m) {
			this.m.remove(paramOnWakeupControlsUpdateListener);
		}

	}

	// ERROR //
	public void b(boolean paramBoolean) {

	}

	public boolean b(int paramInt) {
		try {
			Boolean localBoolean = (Boolean) this.s
					.a(Integer.valueOf(paramInt));

			return localBoolean;
		} catch (Exception i) {

		}
		return false;
	}

	public boolean c() {
		return this.p;
	}

	public boolean c(int paramInt) {
		// try
		// {
		// b(paramInt, true);
		// String str = "<param><name>ROOM</name><value type=\"INT\"><static>" +
		// paramInt + "</static></value></param>";
		// SendToDeviceCommand localSendToDeviceCommand =
		// (SendToDeviceCommand)CommandFactory.SendToDeviceProvider.a();
		// localSendToDeviceCommand.c("GET_WAKEUP");
		// localSendToDeviceCommand.b(t());
		// localSendToDeviceCommand.d(false);
		// localSendToDeviceCommand.c(true);
		// localSendToDeviceCommand.a(str);
		// localSendToDeviceCommand.c(39);
		// boolean bool = this._director.a(localSendToDeviceCommand);
		// if (!bool)
		// b(paramInt, false);
		// return bool;
		// }
		// catch (Exception i)
		// {
		// while (true)
		// {
		// Ln.e(localException);
		// b(paramInt, false);
		// int i = 0;
		// }
		// }
		return false;
	}

	public boolean d() {
		return this.q;
	}

	public boolean e() {
		// try
		// {
		// b(true);
		// SendToDeviceCommand localSendToDeviceCommand =
		// (SendToDeviceCommand)CommandFactory.SendToDeviceProvider.a();
		// localSendToDeviceCommand.c("ENUM_SCENARIOS");
		// localSendToDeviceCommand.b(t());
		// localSendToDeviceCommand.d(false);
		// localSendToDeviceCommand.c(true);
		// localSendToDeviceCommand.c(38);
		// boolean bool = this._director.a(localSendToDeviceCommand);
		// if (!bool)
		// b(false);
		// return bool;
		// }
		// catch (Exception i)
		// {
		// while (true)
		// {
		// Ln.e(localException);
		// b(false);
		// int i = 0;
		// }
		// }
		return false;
	}

	public WakeupControls.WakeupScene h(int paramInt) {
		WakeupControls.WakeupScene localWakeupScene;
		if (this.n == null)
			localWakeupScene = null;
		else
			localWakeupScene = (WakeupControls.WakeupScene) this.n.a(paramInt);
		return localWakeupScene;
	}

	public WakeupControls.WakeupSetting i(int paramInt) {
		WakeupControls.WakeupSetting localWakeupSetting;
		if (this.o == null)
			localWakeupSetting = null;
		else
			localWakeupSetting = (WakeupControls.WakeupSetting) this.o
					.a(Integer.valueOf(paramInt));
		return localWakeupSetting;
	}

	public boolean j(int paramInt) {
		boolean bool = false;
		try {
			bool = a(
					"ENABLE_WAKEUP",
					true,
					false,
					"<param><name>ROOM</name><value type=\"INT\"><static>"
							+ paramInt
							+ "</static></value></param>"
							+ "<param><name>ENABLE</name><value type=\"BOOL\"><static>"
							+ "1" + "</static></value></param>");
			bool = bool;
			return bool;
		} catch (Exception localException) {
			while (true)
				Ln.e(localException);
		}
	}

	public boolean k(int paramInt) {
		boolean bool = false;
		try {
			bool = a(
					"ENABLE_WAKEUP",
					true,
					false,
					"<param><name>ROOM</name><value type=\"INT\"><static>"
							+ paramInt
							+ "</static></value></param>"
							+ "<param><name>ENABLE</name><value type=\"BOOL\"><static>"
							+ "0" + "</static></value></param>");
			bool = bool;
			return bool;
		} catch (Exception localException) {
			while (true)
				Ln.e(localException);
		}
	}

	public boolean l(int paramInt) {
		int i = 0;
		try {
			return a("UNSCHEDULE_WAKEUP", true, false,
					"<param><name>ROOM</name><value type=\"INT\"><static>"
							+ paramInt + "</static></value></param>");

		} catch (Exception localException) {

		}
		return false;
	}

	public int t() {
		return 100104;
	}

	public String getName() {
		String str;
		if (this._context == null)
			str = "Wakeups";
		else
			str = this._context.getString(R.string.wakeups);
		return str;
	}
}
