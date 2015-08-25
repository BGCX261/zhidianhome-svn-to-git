package com.zd.model.device;

public abstract interface WakeupControls extends Device {
	public class WakeupScene {
		public String a;
		public String b;
	}

	public class WakeupSetting {
		public String a;
		public boolean b;
		public String c;
		public String d;
	}

	public abstract interface OnWakeupControlsUpdateListener {
		public abstract void a(WakeupControls paramWakeupControls);

		public abstract void a(WakeupControls paramWakeupControls, int paramInt);
	}

	public abstract WakeupControls.WakeupScene a(String paramString);

	public abstract void a(
			WakeupControls.OnWakeupControlsUpdateListener paramOnWakeupControlsUpdateListener);

	public abstract boolean a(int paramInt);

	public abstract boolean a(String paramString1, String paramString2,
			int paramInt, boolean paramBoolean);

	public abstract int b();

	public abstract int b(String paramString);

	public abstract void b(
			WakeupControls.OnWakeupControlsUpdateListener paramOnWakeupControlsUpdateListener);

	public abstract boolean b(int paramInt);

	public abstract boolean c();

	public abstract boolean c(int paramInt);

	public abstract boolean d();

	public abstract boolean e();

	public abstract WakeupControls.WakeupScene h(int paramInt);

	public abstract WakeupControls.WakeupSetting i(int paramInt);

	public abstract boolean j(int paramInt);

	public abstract boolean k(int paramInt);

	public abstract boolean l(int paramInt);
}
