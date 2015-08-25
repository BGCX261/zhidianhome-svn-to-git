package com.zd.model.director.broadcast;

import roboguice.util.Ln;

public class RadioStationsCollection extends DirectorBroadcastCollection {
	public void a() {
		try {
			DirectorBroadcast localDirectorBroadcast = new DirectorBroadcast();
			localDirectorBroadcast.a(this._director);
			localDirectorBroadcast.m("The '40s");
			localDirectorBroadcast.l("demo_40s");
			localDirectorBroadcast.f("4");
			localDirectorBroadcast.n("demo/demo_40s");
			localDirectorBroadcast.c(true);
			a(localDirectorBroadcast);
			localDirectorBroadcast = new DirectorBroadcast();
			localDirectorBroadcast.a(this._director);
			localDirectorBroadcast.m("The '50s");
			localDirectorBroadcast.l("demo_50s");
			localDirectorBroadcast.f("5");
			localDirectorBroadcast.n("demo/demo_50s");
			localDirectorBroadcast.c(true);
			a(localDirectorBroadcast);
			localDirectorBroadcast = new DirectorBroadcast();
			localDirectorBroadcast.a(this._director);
			localDirectorBroadcast.m("The '60s");
			localDirectorBroadcast.l("demo_60s");
			localDirectorBroadcast.f("6");
			localDirectorBroadcast.n("demo/demo_60s");
			localDirectorBroadcast.c(true);
			a(localDirectorBroadcast);
			localDirectorBroadcast = new DirectorBroadcast();
			localDirectorBroadcast.a(this._director);
			localDirectorBroadcast.m("The '70s");
			localDirectorBroadcast.l("demo_70s");
			localDirectorBroadcast.f("7");
			localDirectorBroadcast.n("demo/demo_70s");
			localDirectorBroadcast.c(true);
			a(localDirectorBroadcast);
			localDirectorBroadcast = new DirectorBroadcast();
			localDirectorBroadcast.a(this._director);
			localDirectorBroadcast.m("The '80s");
			localDirectorBroadcast.l("demo_80s");
			localDirectorBroadcast.f("8");
			localDirectorBroadcast.n("demo/demo_80s");
			localDirectorBroadcast.c(true);
			a(localDirectorBroadcast);
			localDirectorBroadcast = new DirectorBroadcast();
			localDirectorBroadcast.a(this._director);
			localDirectorBroadcast.m("The '90s");
			localDirectorBroadcast.l("demo_90s");
			localDirectorBroadcast.f("9");
			localDirectorBroadcast.n("demo/demo_90s");
			localDirectorBroadcast.c(true);
			a(localDirectorBroadcast);
			localDirectorBroadcast = new DirectorBroadcast();
			localDirectorBroadcast.a(this._director);
			localDirectorBroadcast.m("WLRN");
			localDirectorBroadcast.l("demo_wlrn");
			localDirectorBroadcast.f("91.3 FM");
			localDirectorBroadcast.n("demo/demo_wlrn");
			localDirectorBroadcast.c(true);
			a(localDirectorBroadcast);
			return;
		} catch (Exception localException) {
			while (true)
				Ln.e(localException);
		}
	}

	public void a(boolean paramBoolean) {
		if ((!paramBoolean) && (this.e != null))
			;
		synchronized (this.g) {
			this.e.f(true);
			super.a(paramBoolean);
			return;
		}
	}

	public boolean a(
			BroadcastCollection.OnBroadcastsUpdateListener paramOnBroadcastsUpdateListener) {
		// int i = 1;
		// try
		// {
		// if (this._director == null)
		// {
		// i = 0;
		// break label202;
		// }
		// if (this.b)
		// break label202;
		// if (this._director.G())
		// {
		// a();
		// b(false);
		// a(false);
		// if (paramOnBroadcastsUpdateListener == null)
		// break label202;
		// paramOnBroadcastsUpdateListener.a(this);
		// }
		// }
		// catch (Exception j)
		// {
		// Ln.e(j);
		// a(false);
		// int j = 0;
		// }
		// boolean bool;
		// if (this.a)
		// {
		// a(true);
		// SendToDeviceCommand localSendToDeviceCommand =
		// (SendToDeviceCommand)CommandFactory.SendToDeviceProvider.a();
		// localSendToDeviceCommand.c("GET_AUDIO_MEDIA");
		// localSendToDeviceCommand.b(this.f);
		// localSendToDeviceCommand.d(false);
		// localSendToDeviceCommand.c(true);
		// localSendToDeviceCommand.c(37);
		// StringBuilder localStringBuilder = new
		// StringBuilder("<param><name>type</name><value type=\"STRING\"><static>");
		// localStringBuilder.append("BROADCAST_AUDIO");
		// localStringBuilder.append("</static></value></param>");
		// localSendToDeviceCommand.a(localStringBuilder.toString());
		// if (paramOnBroadcastsUpdateListener != null)
		// {
		// localSendToDeviceCommand.a("listener",
		// paramOnBroadcastsUpdateListener);
		// b(paramOnBroadcastsUpdateListener);
		// }
		// localSendToDeviceCommand.a("broadcast-library", this);
		// bool = this._director.a(localSendToDeviceCommand);
		// if (!bool)
		// a(false);
		// }
		// label202: return bool;
		return false;
	}
}

/*
 * Location: E:\去哪儿\com.control4.myhome-2\classes_dex2jar.jar Qualified Name:
 * com.control4.director.broadcast.RadioStationsCollection JD-Core Version:
 * 0.6.0
 */