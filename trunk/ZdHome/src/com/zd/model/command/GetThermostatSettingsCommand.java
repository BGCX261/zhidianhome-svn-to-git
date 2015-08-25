package com.zd.model.command;

public class GetThermostatSettingsCommand extends DeviceCommand {
	public String a(long paramLong) {
		return "<c4soap name=\"SendToDeviceAsync\" async=\"True\" seq=\""
				+ paramLong
				+ "\"><param name=\"iddevice\" type=\"number\">"
				+ this.a
				+ "</param><param name=\"data\" type=\"string\"><devicecommand owneridtype=\"\" owneriditem=\"-1\">"
				+ "<command>CURRENT_SETTINGS</command></devicecommand></param></c4soap>";
	}

	public boolean n_() {
		return false;
	}
}

/*
 * Location: E:\去哪儿\com.control4.myhome-2\classes_dex2jar.jar Qualified Name:
 * com.control4.director.command.GetThermostatSettingsCommand JD-Core Version:
 * 0.6.0
 */