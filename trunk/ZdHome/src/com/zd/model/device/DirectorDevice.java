package com.zd.model.device;

import java.io.Flushable;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

import org.xmlpull.v1.XmlPullParser;

import com.google.inject.Inject;
import com.zd.model.Control4Director;
import com.zd.model.Variable;
import com.zd.model.command.Command;
import com.zd.model.command.CommandFactory;
import com.zd.model.command.GetVariableCommand;
import com.zd.model.command.RegisterEventListenerCommand;

public class DirectorDevice implements Flushable, Device {
	private static final String n = "Device";

	@Inject
	protected Control4Director _director;
	protected String name = null;
	protected int roomId;
	protected String type;
	protected String control;
	protected String id;
	protected int f_ = -1;
	protected int proxyDeviceId;
	protected boolean h = true;
	protected boolean i = false;
	protected Device.OnDeviceUpdateListener j;
	private boolean k = false;
	private Timer l;
	private TimerTask m;

	public boolean A() {
		return this.h;
	}

	public boolean B() {
		return this.i;
	}

	public String B_() {
		return this.type;
	}

	public boolean C() {
		// Exception localException1 = 0;
		// try
		// {
		// if (this._director != null)
		// {
		// UnregisterEventListenerCommand localUnregisterEventListenerCommand1 =
		// (UnregisterEventListenerCommand)CommandFactory.UnregisterEventListenerProvider.a();
		// localUnregisterEventListenerCommand1.b(t());
		// localUnregisterEventListenerCommand1.a(5);
		// Exception localException2 =
		// this._director.a(localUnregisterEventListenerCommand1);
		// UnregisterEventListenerCommand localUnregisterEventListenerCommand2 =
		// (UnregisterEventListenerCommand)CommandFactory.UnregisterEventListenerProvider.a();
		// localUnregisterEventListenerCommand2.b(t());
		// localUnregisterEventListenerCommand2.a(6);
		// boolean bool =
		// this._director.a(localUnregisterEventListenerCommand2);
		// localException2 = bool | localException2;
		// this.i = localException1;
		// localException1 = localException2;
		// }
		// }
		// catch (Exception localException3)
		// {
		// while (true)
		// {
		// Ln.e(localException3);
		// Ln.e("Unable to register for events for device " + u() + "(" + t() +
		// ")", new Object[localException1]);
		// localException3 = localException1;
		// }
		// }
		// return localException1;
		return false;
	}

	public void C_() {
	}

	public String D() {
		return this.id;
	}

	public Device.DeviceType getType() {
		return Device.DeviceType.a;
	}

	public void a(Variable paramVariable, boolean paramBoolean) {
	}

	public void a(Device.OnDeviceUpdateListener paramOnDeviceUpdateListener) {
		this.j = paramOnDeviceUpdateListener;
	}

	public void a(String paramString1, String paramString2) {
	}

	public void a(XmlPullParser paramXmlPullParser, Command paramCommand) {
	}

	public boolean a(String paramString, boolean paramBoolean1,
			boolean paramBoolean2) {
		return a(paramString, paramBoolean1, paramBoolean2, null);
	}

	public boolean a(String paramString1, boolean paramBoolean1,
			boolean paramBoolean2, String paramString2) {
		// if (paramString1 != null)
		// try
		// {
		// if (this._director != null)
		// {
		// SendToDeviceCommand localSendToDeviceCommand =
		// (SendToDeviceCommand)CommandFactory.SendToDeviceProvider.a();
		// localSendToDeviceCommand.c(paramString1);
		// localSendToDeviceCommand.a(paramString2);
		// localSendToDeviceCommand.b(t());
		// localSendToDeviceCommand.d(paramBoolean1);
		// if (paramBoolean2)
		// localSendToDeviceCommand.a(v());
		// boolean bool = this._director.a(localSendToDeviceCommand);
		// bool = bool;
		// }
		// }
		// catch (Exception i1)
		// {
		// Ln.e(localException);
		// Ln.e("Unable to send command " + paramString1 + " to device " + this,
		// new Object[0]);
		// i1 = 0;
		// }
		// int i1 = 0;
		// return i1;
		return false;
	}

	public void b(Variable paramVariable, boolean paramBoolean) {
	}

	public boolean b(String paramString, boolean paramBoolean1,
			boolean paramBoolean2) {
		// if (paramString != null)
		// try
		// {
		// if (this._director != null)
		// {
		// SendToDeviceCommand localSendToDeviceCommand =
		// (SendToDeviceCommand)CommandFactory.SendToDeviceProvider.a();
		// localSendToDeviceCommand.c(paramString);
		// localSendToDeviceCommand.b(t());
		// localSendToDeviceCommand.d(false);
		// localSendToDeviceCommand.a(v());
		// localSendToDeviceCommand.a("device", this);
		// localSendToDeviceCommand.a("device command", paramString);
		// localSendToDeviceCommand.b(paramBoolean1);
		// localSendToDeviceCommand.a(paramBoolean2);
		// localSendToDeviceCommand.c(true);
		// boolean bool = this._director.a(localSendToDeviceCommand);
		// bool = bool;
		// }
		// }
		// catch (Exception i1)
		// {
		// Ln.e(localException);
		// Ln.e("Unable to send command with response " + paramString +
		// " to device " + this, new Object[0]);
		// i1 = 0;
		// }
		// int i1 = 0;
		// return i1;
		return false;
	}

	public void d(int paramInt) {
		this.f_ = paramInt;
	}

	public void e(int paramInt) {
		this.roomId = paramInt;
	}

	public void f(int paramInt) {
		this.proxyDeviceId = paramInt;
	}

	public void setName(String paramString) {
		this.name = paramString;
	}

	public boolean g(int paramInt) {
		boolean bool = false;
		try {
			if (this._director != null) {
				GetVariableCommand localGetVariableCommand = (GetVariableCommand) CommandFactory.GetVariableProvider
						.get();
				localGetVariableCommand.b(paramInt);
				localGetVariableCommand.a(t());
				bool = this._director.a(localGetVariableCommand);
			}
		} catch (Exception localException) {

		}
		return bool;
	}

	public void h(String paramString) {
		this.type = paramString;
	}

	public void h(boolean paramBoolean) {
		// this.k = paramBoolean;
		// if (this.m != null)
		// this.m.cancel();
		// if (!paramBoolean)
		// {
		// if (this.l != null)
		// {
		// this.l.cancel();
		// this.l = null;
		// }
		// }
		// else
		// {
		// if (this.l == null)
		// this.l = new Timer();
		// this.m = new DirectorDevice.1(this);
		// this.l.schedule(this.m, 5000L);
		// }
	}

	public void i(String paramString) {
		this.control = paramString;
	}

	public void i(boolean paramBoolean) {
		this.h = paramBoolean;
	}

	public void j() {
		this.j = null;
		if (this.m != null) {
			this.m.cancel();
			this.m = null;
		}
		if (this.l != null) {
			this.l.cancel();
			this.l = null;
		}
	}

	public boolean j(String paramString) {
		return a(paramString, true, true, null);
	}

	public void k(String paramString) {
		this.id = paramString;
	}

	public void p() {
		this.h = false;
	}

	public boolean q() {
		boolean bool1 = false;
		try {
			if (this._director != null)
				if (this.i) {
					bool1 = true;
				} else {
					RegisterEventListenerCommand localRegisterEventListenerCommand1 = (RegisterEventListenerCommand) CommandFactory.RegisterEventListenerProvider
							.get();
					localRegisterEventListenerCommand1.b(t());
					localRegisterEventListenerCommand1.a(38);
					boolean bool2 = this._director
							.a(localRegisterEventListenerCommand1);
					RegisterEventListenerCommand localRegisterEventListenerCommand2 = (RegisterEventListenerCommand) CommandFactory.RegisterEventListenerProvider
							.get();
					localRegisterEventListenerCommand2.b(t());
					localRegisterEventListenerCommand2.a(32);
					bool1 = bool2
							| this._director
									.a(localRegisterEventListenerCommand2);
					this.i = true;
					bool1 = bool1;
				}
		} catch (Exception localException) {

		}
		return bool1;
	}

	public Device.OnDeviceUpdateListener s() {
		return this.j;
	}

	public int t() {
		return this.f_;
	}

	public String toString() {
		return "Device [_id=" + this.f_ + ", _name=" + this.name + ", _roomId="
				+ this.roomId + ", _type=" + this.type + ", _control="
				+ this.control + ", _proxyDeviceId=" + this.proxyDeviceId + "]";
	}

	// u()
	public String getName() {
		return this.name;
	}

	public int v() {
		return this.roomId;
	}

	public String x() {
		return this.control;
	}

	public int y() {
		return this.proxyDeviceId;
	}

	public boolean z() {
		return this.k;
	}

	@Override
	public void flush() throws IOException {
		// TODO Auto-generated method stub

	}
}
