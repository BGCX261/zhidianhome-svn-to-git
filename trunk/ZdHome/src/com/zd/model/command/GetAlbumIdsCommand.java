package com.zd.model.command;

import com.zd.model.parser.ParserFactory;
import com.zd.model.parser.ResponseParser;

public class GetAlbumIdsCommand extends RoomCommand {
	public GetAlbumIdsCommand() {
		this.g = true;
		this.h = 21;
	}

	public String a(long paramLong) {
		StringBuilder localStringBuilder = new StringBuilder(
				"<c4soap name=\"SendToDevice\" async=\"0\" seq=\"");
		localStringBuilder.append(paramLong);
		localStringBuilder
				.append("\"><param name=\"iddevice\" type=\"number\">");
		localStringBuilder.append(this.c);
		localStringBuilder
				.append("</param><param name=\"data\" type=\"string\"><devicecommand owneridtype=\"\" owneriditem=\"-1\"><command>GET_AUDIO_MEDIA</command><params><param><name>type</name><value type=\"STRING\"><static>ALBUM_ID</static></value></param></params></devicecommand></param></c4soap>");
		return localStringBuilder.toString();
	}

	public ResponseParser m_() {
		return (ResponseParser) ParserFactory.GetAlbumsProvider.get();
	}
}

/*
 * Location: E:\去哪儿\com.control4.myhome-2\classes_dex2jar.jar Qualified Name:
 * com.control4.director.command.GetAlbumIdsCommand JD-Core Version: 0.6.0
 */