package com.zd.model.command;

public class StopChangingVolumeCommand extends RoomCommand {
	boolean a;

	public StopChangingVolumeCommand() {
		b(true);
	}

	public String a(long paramLong) {
		StringBuilder localStringBuilder = new StringBuilder()
				.append("<c4soap name=\"SendToDeviceAsync\" async=\"1\" seq=\"")
				.append(paramLong)
				.append("\"><param name=\"iddevice\" type=\"number\">")
				.append(this.c)
				.append("</param><param name=\"data\" type=\"string\"><devicecommand><command>");
		String str;
		if (!this.a)
			str = "STOP_VOL_DOWN";
		else
			str = "STOP_VOL_UP";
		return str
				+ "</command><params></params></devicecommand></param></c4soap>";
	}

	public boolean c() {
		return this.a;
	}

	public void d(boolean paramBoolean) {
		this.a = paramBoolean;
	}

	public boolean n_() {
		return false;
	}
}

/*
 * Location: E:\去哪儿\com.control4.myhome-2\classes_dex2jar.jar Qualified Name:
 * com.control4.director.command.StopChangingVolumeCommand JD-Core Version:
 * 0.6.0
 */