package com.zd.model.command;

public class GetPlaylistCommand extends GetAlbumCommand {
	public GetPlaylistCommand() {
		this.g = true;
		this.h = 15;
	}

	public String a(long paramLong) {
		StringBuilder localStringBuilder = new StringBuilder(
				"<c4soap name=\"SendToDevice\" async=\"0\" seq=\"");
		localStringBuilder.append(paramLong);
		localStringBuilder
				.append("\"><param name=\"iddevice\" type=\"number\">");
		localStringBuilder.append(this.c);
		localStringBuilder
				.append("</param><param name=\"data\" type=\"string\"><devicecommand owneridtype=\"\" owneriditem=\"-1\"><command>GET_MEDIA_INFO</command><params><param><name>type</name><value type=\"STRING\"><static>PLAYLIST</static></value></param><param><name>mediaid</name><value type=\"INTEGER\"><static>");
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
}

/*
 * Location: E:\去哪儿\com.control4.myhome-2\classes_dex2jar.jar Qualified Name:
 * com.control4.director.command.GetPlaylistCommand JD-Core Version: 0.6.0
 */