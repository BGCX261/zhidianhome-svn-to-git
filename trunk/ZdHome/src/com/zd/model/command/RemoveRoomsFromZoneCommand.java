package com.zd.model.command;

public class RemoveRoomsFromZoneCommand extends JoinRoomsToZoneCommand {
	public String a(long paramLong) {
		return "<c4soap name=\"SendToZoneManager\" async=\"True\" seq=\""
				+ paramLong
				+ "\"><param type=\"string\" name=\"data\"><devicecommand><command>REMOVE_ROOMS</command><params>"
				+ "<param><name>MEDIAZONE_ID</name><value type=\"string\"><static>"
				+ this.a
				+ "</static></value></param>"
				+ "<param><name>ROOM_IDS</name><value type=\"string\"><static>"
				+ this.b
				+ "</static></value></param></params></devicecommand></param></c4soap>";
	}
}

/*
 * Location: E:\去哪儿\com.control4.myhome-2\classes_dex2jar.jar Qualified Name:
 * com.control4.director.command.RemoveRoomsFromZoneCommand JD-Core Version:
 * 0.6.0
 */