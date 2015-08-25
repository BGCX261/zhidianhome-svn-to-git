package com.zd.model.command;

import com.zd.model.parser.ParserFactory;
import com.zd.model.parser.ResponseParser;

public class GetSongCommand extends RoomCommand {
	private String a;

	public GetSongCommand() {
		c(17);
		c(true);
	}

	public String a(long paramLong) {
		StringBuilder localStringBuilder = new StringBuilder(
				"<c4soap name=\"SendToDevice\" async=\"0\" seq=\"");
		localStringBuilder.append(paramLong);
		localStringBuilder
				.append("\"><param name=\"iddevice\" type=\"number\">");
		localStringBuilder.append(this.c);
		localStringBuilder
				.append("</param><param name=\"data\" type=\"string\"><devicecommand owneridtype=\"\" owneriditem=\"-1\"><command>GET_MEDIA_INFO</command><params><param><name>type</name><value type=\"STRING\"><static>SONG</static></value></param><param><name>mediaid</name><value type=\"INTEGER\"><static>");
		localStringBuilder.append(this.a);
		localStringBuilder
				.append("</static></value></param><param><name>getimg</name><value type=\"INTEGER\"><static>1</static></value></param></params></devicecommand></param></c4soap>");
		return localStringBuilder.toString();
	}

	public void a(String paramString) {
		this.a = paramString;
	}

	public String c() {
		return this.a;
	}

	public ResponseParser m_() {
		return (ResponseParser) ParserFactory.GetAlbumProvider.get();
	}
}

/*
 * Location: E:\去哪儿\com.control4.myhome-2\classes_dex2jar.jar Qualified Name:
 * com.control4.director.command.GetSongCommand JD-Core Version: 0.6.0
 */