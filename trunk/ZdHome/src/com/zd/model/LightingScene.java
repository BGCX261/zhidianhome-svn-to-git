package com.zd.model;

import com.google.inject.Inject;

public class LightingScene {

	@Inject
	protected Control4Director _director;
	private String a = null;
	private int b = -1;

	public LightingScene() {
	}

	public LightingScene(int paramInt, String paramString) {
		this.b = paramInt;
		this.a = paramString;
	}

	public String a() {
		return this.a;
	}

	public void a(int paramInt) {
		this.b = paramInt;
	}

	public void a(String paramString) {
		this.a = paramString;
	}

	public int b() {
		return this.b;
	}

	public boolean c() {
		boolean j = false;
		// try
		// {
		// if (this._director == null)
		// {
		// int i = 0;
		// }
		// else
		// {
		// SendToDeviceCommand localSendToDeviceCommand =
		// (SendToDeviceCommand)CommandFactory.SendToDeviceProvider.a();
		// localSendToDeviceCommand.c("EXECUTE_SCENE");
		// localSendToDeviceCommand.a("<param><name>SCENE_ID</name><value type=\"INT\"><static>"
		// + b() + "</static></value></param>");
		// localSendToDeviceCommand.b(100102);
		// localSendToDeviceCommand.d(true);
		// boolean bool = this._director.a(localSendToDeviceCommand);
		// bool = bool;
		// }
		// }
		// catch (Exception j)
		// {
		// Ln.e(localException);
		// j = 0;
		// }
		return j;
	}
}

/*
 * Location: E:\去哪儿\com.control4.myhome-2\classes_dex2jar.jar Qualified Name:
 * com.control4.director.data.LightingScene JD-Core Version: 0.6.0
 */