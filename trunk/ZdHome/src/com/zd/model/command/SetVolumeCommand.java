package com.zd.model.command;

public class SetVolumeCommand extends RoomCommand {
	int a;

	public String a(long paramLong) {
		return "<c4soap name=\"SendToDeviceAsync\" async=\"1\" seq=\""
				+ paramLong
				+ "\"><param name=\"iddevice\" type=\"number\">"
				+ this.c
				+ "</param><param name=\"data\" type=\"string\">"
				+ "<devicecommand><command>SET_VOLUME_LEVEL</command><params><param><name>LEVEL</name><value type=\"INT\"><static>"
				+ this.a
				+ "</static></value></param></params></devicecommand></param></c4soap>";
	}

	public void a(int paramInt) {
		this.a = paramInt;
	}

	public int c() {
		return this.a;
	}

	public boolean n_() {
		return false;
	}
}

/*
 * Location: E:\去哪儿\com.control4.myhome-2\classes_dex2jar.jar Qualified Name:
 * com.control4.director.command.SetVolumeCommand JD-Core Version: 0.6.0
 */