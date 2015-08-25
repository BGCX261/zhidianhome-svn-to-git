package com.zd.model.command;

public class JoinRoomsToZoneCommand extends Command {
	protected int a;
	protected String b;

	public String a(long paramLong) {
		return "<c4soap name=\"SendToZoneManager\" async=\"True\" seq=\""
				+ paramLong
				+ "\"><param type=\"string\" name=\"data\"><devicecommand><command>ADD_ROOMS</command><params>"
				+ "<param><name>MEDIAZONE_ID</name><value type=\"string\"><static>"
				+ this.a
				+ "</static></value></param>"
				+ "<param><name>ROOM_IDS</name><value type=\"string\"><static>"
				+ this.b
				+ "</static></value></param></params></devicecommand></param></c4soap>";
	}

	public void a(int paramInt) {
		this.a = paramInt;
	}

	public void a(String paramString) {
		this.b = paramString;
	}

	public int c() {
		return this.a;
	}

	public String d() {
		return this.b;
	}
}

/*
 * Location: E:\去哪儿\com.control4.myhome-2\classes_dex2jar.jar Qualified Name:
 * com.control4.director.command.JoinRoomsToZoneCommand JD-Core Version: 0.6.0
 */