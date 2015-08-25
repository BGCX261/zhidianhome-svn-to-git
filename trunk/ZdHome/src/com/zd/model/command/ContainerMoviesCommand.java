package com.zd.model.command;

import com.zd.model.parser.ParserFactory;
import com.zd.model.parser.ResponseParser;

public class ContainerMoviesCommand // extends MoviesCommand
{
	protected String a;
	protected String b;

	// public GetContainerMoviesCommand()
	// {
	// //c(true);
	// //c(29);
	// }
	//
	// public String a(long paramLong)
	// {
	// StringBuilder localStringBuilder = new
	// StringBuilder("<c4soap name=\"SendToDevice\" async=\"0\" seq=\"");
	// // localStringBuilder.append(paramLong);
	// //
	// localStringBuilder.append("\"><param name=\"iddevice\" type=\"number\">");
	// // localStringBuilder.append(this.c);
	// //
	// localStringBuilder.append("</param><param name=\"data\" type=\"string\"><devicecommand owneridtype=\"\" owneriditem=\"-1\"><command>GET_VIDEO_MEDIA</command><params><param><name>type</name><value type=\"STRING\"><static>MOVIE</static></value></param>");
	// //
	// localStringBuilder.append("<param><name>category</name><value type=\"STRING\"><static>");
	// // localStringBuilder.append(this.b);
	// // localStringBuilder.append("</static></value></param>");
	// // if ((this.a == null) || (this.a.equals("(Empty)")))
	// // this.a = "";
	// // this.a = this.a.replaceAll("&", "&amp;");
	// //
	// localStringBuilder.append("<param><name>filter</name><value type=\"STRING\"><static>");
	// // localStringBuilder.append(this.a);
	// // localStringBuilder.append("</static></value></param>");
	// //
	// localStringBuilder.append("</params></devicecommand></param></c4soap>");
	// return localStringBuilder.toString();
	// }

	public void a(String paramString) {
		this.a = paramString;
	}

	public String c() {
		return this.a;
	}

	public ResponseParser m_() {
		return (ResponseParser) ParserFactory.GetMoviesProvider.get();
	}
}
