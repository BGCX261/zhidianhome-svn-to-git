package com.zd.model;

import java.io.IOException;

import com.google.inject.Inject;

public class DirectorCustomButton implements CustomButton {

	@Inject
	private Control4Director _director;
	private int a = -1;
	private String b = null;
	private String c = null;
	private int d = -1;
	private int e = -1;

	public int a() {
		return this.a;
	}

	public void a(int paramInt) {
		this.a = paramInt;
	}

	public void a(String paramString) {
		this.b = paramString;
	}

	public String b() {
		return this.b;
	}

	public void b(int paramInt) {
		this.d = paramInt;
	}

	public void b(String paramString) {
		this.c = paramString;
	}

	public String c() {
		return this.c;
	}

	public void c(int paramInt) {
		this.e = paramInt;
	}

	public int d() {
		return this.d;
	}

	public int e() {
		return this.e;
	}

	public void f() {
		// try
		// {
		// if ((this._director != null) && (!this._director.G()))
		// {
		// SendToDeviceCommand localSendToDeviceCommand =
		// (SendToDeviceCommand)CommandFactory.SendToDeviceProvider.a();
		// localSendToDeviceCommand.d(true);
		// localSendToDeviceCommand.c("PRESS_BUTTON");
		// localSendToDeviceCommand.b(100111);
		// StringBuilder localStringBuilder = new
		// StringBuilder("<param><name>ID</name><value type=\"INT\"><static>");
		// localStringBuilder.append(a());
		// localStringBuilder.append("</static></value></param>");
		// localSendToDeviceCommand.a(localStringBuilder.toString());
		// this._director.a(localSendToDeviceCommand);
		// }
		// }
		// catch (Exception localException)
		// {
		// Ln.e(localException);
		// }
	}

	public void g() {
		// try
		// {
		// if ((this._director != null) && (!this._director.G()))
		// {
		// SendToDeviceCommand localSendToDeviceCommand =
		// (SendToDeviceCommand)CommandFactory.SendToDeviceProvider.a();
		// localSendToDeviceCommand.d(true);
		// localSendToDeviceCommand.c("RELEASE_BUTTON");
		// localSendToDeviceCommand.b(100111);
		// StringBuilder localStringBuilder = new
		// StringBuilder("<param><name>ID</name><value type=\"INT\"><static>");
		// localStringBuilder.append(a());
		// localStringBuilder.append("</static></value></param>");
		// localSendToDeviceCommand.a(localStringBuilder.toString());
		// this._director.a(localSendToDeviceCommand);
		// }
		// }
		// catch (Exception localException)
		// {
		// Ln.e(localException);
		// }
	}

	public void j() {
	}

	@Override
	public void flush() throws IOException {
		// TODO Auto-generated method stub

	}
}
