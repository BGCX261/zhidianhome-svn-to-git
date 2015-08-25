package com.zd.model.command;

import com.zd.model.parser.ParserFactory;
import com.zd.model.parser.ResponseParser;

public class GetPlaylistsCommand extends RoomCommand {
	public GetPlaylistsCommand() {
		c(14);
		c(true);
	}

	public String a(long paramLong) {
		return "<c4soap name=\"SendToDevice\" async=\"0\" seq=\""
				+ paramLong
				+ "\"><param name=\"iddevice\" type=\"number\">"
				+ this.c
				+ "</param><param name=\"data\" type=\"string\"><devicecommand owneridtype=\"\" owneriditem=\"-1\"><command>GET_AUDIO_MEDIA</command><params><param><name>type</name><value type=\"STRING\"><static>PLAYLIST</static></value></param></params></devicecommand></param></c4soap>";
	}

	public ResponseParser m_() {
		return (ResponseParser) ParserFactory.GetPlaylistsProvider.get();
	}
}

/*
 * Location: E:\去哪儿\com.control4.myhome-2\classes_dex2jar.jar Qualified Name:
 * com.control4.director.command.GetPlaylistsCommand JD-Core Version: 0.6.0
 */