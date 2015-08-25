package com.zd.model.command;

public class AllZonesOffCommand extends Command {
	public String a(long paramLong) {
		return "<c4soap name=\"SendToZoneManager\" async=\"False\" seq=\""
				+ paramLong
				+ "\"><param type=\"string\" name=\"data\"><devicecommand><command>ALL_ZONES_OFF</command><params></params></devicecommand></param></c4soap>";
	}
}
