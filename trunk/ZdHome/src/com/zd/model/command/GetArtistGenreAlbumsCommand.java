package com.zd.model.command;

public class GetArtistGenreAlbumsCommand extends GetArtistAlbumsCommand {
	public GetArtistGenreAlbumsCommand() {
		this.h = 26;
		this.g = true;
	}

	public String a(long paramLong) {
		StringBuilder localStringBuilder = new StringBuilder(
				"<c4soap name=\"SendToDevice\" async=\"0\" seq=\"");
		localStringBuilder.append(paramLong);
		localStringBuilder
				.append("\"><param name=\"iddevice\" type=\"number\">");
		localStringBuilder.append(this.c);
		localStringBuilder
				.append("</param><param name=\"data\" type=\"string\"><devicecommand owneridtype=\"\" owneriditem=\"-1\"><command>GET_AUDIO_MEDIA</command><params><param><name>type</name><value type=\"STRING\"><static>ALBUM_ID</static></value></param><param><name>category</name><value type=\"STRING\"><static>genreByArtist2</static></value></param><param><name>filter</name><value type=\"STRING\"><static>");
		localStringBuilder.append(this.a);
		localStringBuilder
				.append("</static></value></param></params></devicecommand></param></c4soap>");
		return localStringBuilder.toString();
	}
}

/*
 * Location: E:\去哪儿\com.control4.myhome-2\classes_dex2jar.jar Qualified Name:
 * com.control4.director.command.GetArtistGenreAlbumsCommand JD-Core Version:
 * 0.6.0
 */