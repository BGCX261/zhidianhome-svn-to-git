package com.zd.model.director.broadcast;

import roboguice.util.Ln;

public class TVChannelsCollection extends DirectorBroadcastCollection {
	public void a() {
		try {
			DirectorBroadcast localDirectorBroadcast = new DirectorBroadcast();
			localDirectorBroadcast.a(this._director);
			localDirectorBroadcast.m("WTVJ");
			localDirectorBroadcast.l("demo_6");
			localDirectorBroadcast.f("6");
			localDirectorBroadcast.n("demo/demo_6");
			a(localDirectorBroadcast);
			localDirectorBroadcast = new DirectorBroadcast();
			localDirectorBroadcast.a(this._director);
			localDirectorBroadcast.m("WTVJ");
			localDirectorBroadcast.l("demo_7");
			localDirectorBroadcast.n("demo/demo_7");
			localDirectorBroadcast.f("7");
			a(localDirectorBroadcast);
			localDirectorBroadcast = new DirectorBroadcast();
			localDirectorBroadcast.a(this._director);
			localDirectorBroadcast.m("TWC");
			localDirectorBroadcast.l("demo_weather");
			localDirectorBroadcast.f("27");
			localDirectorBroadcast.n("demo/demo_weather");
			a(localDirectorBroadcast);
			localDirectorBroadcast = new DirectorBroadcast();
			localDirectorBroadcast.a(this._director);
			localDirectorBroadcast.m("CNN");
			localDirectorBroadcast.f("28");
			localDirectorBroadcast.l("demo_cnn");
			localDirectorBroadcast.n("demo/demo_cnn");
			a(localDirectorBroadcast);
			localDirectorBroadcast = new DirectorBroadcast();
			localDirectorBroadcast.a(this._director);
			localDirectorBroadcast.m("MSNBC");
			localDirectorBroadcast.f("30");
			localDirectorBroadcast.l("demo_msnbc");
			localDirectorBroadcast.n("demo/demo_msnbc");
			a(localDirectorBroadcast);
			localDirectorBroadcast = new DirectorBroadcast();
			localDirectorBroadcast.a(this._director);
			localDirectorBroadcast.m("CNBC");
			localDirectorBroadcast.f("31");
			localDirectorBroadcast.l("demo_cnbc");
			localDirectorBroadcast.n("demo/demo_cnbc");
			a(localDirectorBroadcast);
			localDirectorBroadcast = new DirectorBroadcast();
			localDirectorBroadcast.a(this._director);
			localDirectorBroadcast.m("FNC");
			localDirectorBroadcast.f("32");
			localDirectorBroadcast.l("demo_foxnews");
			localDirectorBroadcast.n("demo/demo_foxnews");
			a(localDirectorBroadcast);
			localDirectorBroadcast = new DirectorBroadcast();
			localDirectorBroadcast.a(this._director);
			localDirectorBroadcast.m("ESPN");
			localDirectorBroadcast.f("34");
			localDirectorBroadcast.l("demo_espn");
			localDirectorBroadcast.n("demo/demo_espn");
			a(localDirectorBroadcast);
			localDirectorBroadcast = new DirectorBroadcast();
			localDirectorBroadcast.a(this._director);
			localDirectorBroadcast.m("TBS");
			localDirectorBroadcast.f("43");
			localDirectorBroadcast.l("demo_tbs");
			localDirectorBroadcast.n("demo/demo_tbs");
			a(localDirectorBroadcast);
			localDirectorBroadcast = new DirectorBroadcast();
			localDirectorBroadcast.a(this._director);
			localDirectorBroadcast.m("ANIMAL");
			localDirectorBroadcast.f("54");
			localDirectorBroadcast.l("demo_animalplanet");
			localDirectorBroadcast.n("demo/demo_animalplanet");
			a(localDirectorBroadcast);
			localDirectorBroadcast = new DirectorBroadcast();
			localDirectorBroadcast.a(this._director);
			localDirectorBroadcast.m("ESPNHD");
			localDirectorBroadcast.f("403");
			localDirectorBroadcast.l("demo_espnhd");
			localDirectorBroadcast.n("demo/demo_espnhd");
			a(localDirectorBroadcast);
			localDirectorBroadcast = new DirectorBroadcast();
			localDirectorBroadcast.a(this._director);
			localDirectorBroadcast.m("TNTHD");
			localDirectorBroadcast.f("407");
			localDirectorBroadcast.l("demo_tnt");
			localDirectorBroadcast.n("demo/demo_tnt");
			a(localDirectorBroadcast);
			localDirectorBroadcast = new DirectorBroadcast();
			localDirectorBroadcast.a(this._director);
			localDirectorBroadcast.m("HBOHD");
			localDirectorBroadcast.f("416");
			localDirectorBroadcast.l("demo_hbohd");
			localDirectorBroadcast.n("demo/demo_hbohd");
			a(localDirectorBroadcast);
			localDirectorBroadcast = new DirectorBroadcast();
			localDirectorBroadcast.a(this._director);
			localDirectorBroadcast.m("SHOHD");
			localDirectorBroadcast.f("418");
			localDirectorBroadcast.l("demo_shohd");
			localDirectorBroadcast.n("demo/demo_shohd");
			a(localDirectorBroadcast);
			return;
		} catch (Exception localException) {
			while (true)
				Ln.e(localException);
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
		//
		// }
		// boolean bool;
		// if (this.a)
		// {
		// a(true);
		// SendToDeviceCommand localSendToDeviceCommand =
		// (SendToDeviceCommand)CommandFactory.SendToDeviceProvider.a();
		// localSendToDeviceCommand.c("GET_VIDEO_MEDIA");
		// localSendToDeviceCommand.b(this.f);
		// localSendToDeviceCommand.d(false);
		// localSendToDeviceCommand.c(true);
		// localSendToDeviceCommand.c(36);
		// StringBuilder localStringBuilder = new
		// StringBuilder("<param><name>type</name><value type=\"STRING\"><static>");
		// localStringBuilder.append("BROADCAST_VIDEO");
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
