package com.zd.model.command;

import com.zd.model.parser.ParserFactory;
import com.zd.model.parser.ResponseParser;

public class GetMovieInfoCommand extends RoomCommand {
	protected String a;

	public GetMovieInfoCommand() {
		c(true);
		c(30);
	}

	public String a(long paramLong) {
		StringBuilder localStringBuilder = new StringBuilder(
				"<c4soap name=\"SendToDevice\" async=\"0\" seq=\"");
		localStringBuilder.append(paramLong);
		localStringBuilder
				.append("\"><param name=\"iddevice\" type=\"number\">");
		localStringBuilder.append(this.c);
		localStringBuilder
				.append("</param><param name=\"data\" type=\"string\"><devicecommand owneridtype=\"\" owneriditem=\"-1\"><command>GET_VIDEO_MEDIA</command><params><param><name>type</name><value type=\"STRING\"><static>MOVIE_INFO</static></value></param><param><name>idmedia</name><value type=\"STRING\"><static>");
		localStringBuilder.append(this.a);
		localStringBuilder.append("</static></value></param>");
		localStringBuilder.append("</params></devicecommand></param></c4soap>");
		return localStringBuilder.toString();
	}

	public void a(String paramString) {
		this.a = paramString;
	}

	public String c() {
		return this.a;
	}

	public ResponseParser m_() {
		return (ResponseParser) ParserFactory.GetMovieInfoProvider.get();
	}
}

/*
 * Location: E:\去哪儿\com.control4.myhome-2\classes_dex2jar.jar Qualified Name:
 * com.control4.director.command.GetMovieInfoCommand JD-Core Version: 0.6.0
 */