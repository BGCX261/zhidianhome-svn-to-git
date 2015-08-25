package com.zd.home;

import java.util.ArrayList;
import java.util.List;

import roboguice.application.RoboApplication;

import com.google.inject.Module;
import com.zd.model.Curtain;
import com.zd.model.device.Light;
import com.zd.net.GetNetworkTask;
import com.zd.net.NetworkParam;

public class ZDApplication extends RoboApplication {
	public static final String HOME_URL = "http://222.91.190.141/cgi-bin/homecontrol.cgi?";
	public static final String COMMAND_CONTROL = "101";
	public static final String COMMAND_GET_LIGHT = "l";
	public static final String COMMAND_GET_WINDOWS = "c";

	private List<Light> lightList;
	private List<Curtain> chuanglianList;

	@Override
	protected void addApplicationModules(List<Module> modules) {
		// TODO Auto-generated method stub
		modules.add(new HomeControlModule());
		super.addApplicationModules(modules);
	}

	public static boolean deviceControl(String deviceId, String command) {

		NetworkParam np = new NetworkParam();
		np.url = String.format(HOME_URL + "%s%s%s", COMMAND_CONTROL, deviceId,
				command);
		GetNetworkTask gnt = new GetNetworkTask(np);
		byte[] rst = gnt.run();
		if (rst == null)
			return false;

		String rsts = new String(rst);
		if (rsts.contains("success"))
			return true;

		return false;
	}

	public String getDeviceList(String devicetype) {

		NetworkParam np = new NetworkParam();
		np.url = String.format(HOME_URL + "%s=123", devicetype);
		GetNetworkTask gnt = new GetNetworkTask(np);
		byte[] rst = gnt.run();
		if (rst == null)
			return null;

		return new String(rst);

	}

	public List<Light> getLightList() {

		if (lightList == null) {
			lightList = new ArrayList<Light>();
			String lst = this.getDeviceList("l");
			if (lst != null && lst.length() > 0) {
				String[] ts = lst.split(",");
				for (int i = 0; i < ts.length; i += 2) {
					Light lg = new Light();
					// lg.id = ts[i];
					// lg.name = ts[i+1];
					lightList.add(lg);
				}
			}
		}

		return lightList;
	}

	public List<Curtain> getChuanglianList() {

		if (chuanglianList == null) {
			chuanglianList = new ArrayList<Curtain>();
			String lst = this.getDeviceList("c");
			if (lst != null && lst.length() > 0) {
				String[] ts = lst.split(",");
				for (int i = 0; i < ts.length; i += 2) {
					Curtain lg = new Curtain();
					lg.id = ts[i];
					lg.name = ts[i + 1];
					chuanglianList.add(lg);
				}
			}
		}

		return chuanglianList;
	}

}
