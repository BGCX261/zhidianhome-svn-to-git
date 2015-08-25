package com.zd.model.command;

import com.zd.model.parser.ParserFactory;
import com.zd.model.parser.ResponseParser;

public class GetZonesCommand extends Command {
	public GetZonesCommand() {
		this.h = 40;
	}

	public String a(long paramLong) {
		return "<c4soap name=\"SendToZoneManager\" async=\"False\" seq=\""
				+ paramLong
				+ "\"><param type=\"string\" name=\"data\"><devicecommand><command>GET_ZONES</command><params></params></devicecommand></param></c4soap>";
	}

	public ResponseParser m_() {
		return (ResponseParser) ParserFactory.GetZonesProvider.get();
	}

	public boolean n_() {
		return true;
	}
}

/*
 * Location: E:\去哪儿\com.control4.myhome-2\classes_dex2jar.jar Qualified Name:
 * com.control4.director.command.GetZonesCommand JD-Core Version: 0.6.0
 */