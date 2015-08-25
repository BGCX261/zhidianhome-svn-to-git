package com.zd.model.command;

import com.zd.model.parser.ParserFactory;
import com.zd.model.parser.ResponseParser;

public class GetAlbumCommand extends RoomCommand {
	protected String a;
	protected boolean b = true;

	public GetAlbumCommand() {
		this.g = true;
		this.h = 23;
	}

	public String a(long paramLong) {
		StringBuilder localStringBuilder = new StringBuilder(
				"<c4soap name=\"SendToDevice\" async=\"0\" seq=\"");
		localStringBuilder.append(paramLong);
		localStringBuilder
				.append("\"><param name=\"iddevice\" type=\"number\">");
		localStringBuilder.append(this.c);
		localStringBuilder
				.append("</param><param name=\"data\" type=\"string\"><devicecommand owneridtype=\"\" owneriditem=\"-1\"><command>GET_MEDIA_INFO</command><params><param><name>type</name><value type=\"STRING\"><static>ALBUM</static></value></param><param><name>mediaid</name><value type=\"INTEGER\"><static>");
		localStringBuilder.append(this.a);
		localStringBuilder
				.append("</static></value></param><param><name>getimg</name><value type=\"INTEGER\"><static>");
		String str;
		if (!this.b)
			str = "0";
		else
			str = "1";
		localStringBuilder.append(str);
		localStringBuilder
				.append("</static></value></param></params></devicecommand></param></c4soap>");
		return localStringBuilder.toString();
	}

	public void a(String paramString) {
		this.a = paramString;
	}

	public String c() {
		return this.a;
	}

	public void d(boolean paramBoolean) {
		this.b = paramBoolean;
	}

	public boolean d() {
		return this.b;
	}

	public ResponseParser m_() {
		return (ResponseParser) ParserFactory.GetAlbumProvider.get();
	}
}
