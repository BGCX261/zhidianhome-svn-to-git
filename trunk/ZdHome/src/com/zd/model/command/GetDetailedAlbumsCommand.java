package com.zd.model.command;

import java.util.Vector;

import com.zd.model.parser.ParserFactory;
import com.zd.model.parser.ResponseParser;

public class GetDetailedAlbumsCommand extends RoomCommand {
	private Vector<String> a = null;

	public GetDetailedAlbumsCommand() {
		c(true);
		c(22);
	}

	public String a(long paramLong) {
		// Object localObject2 = null;
		// Object localObject1;
		// if ((this.a != null) && (this.a.size() != 0))
		// localObject1 = this.a.iterator();
		// while (true)
		// {
		// if (!((Iterator)localObject1).hasNext())
		// {
		// localObject1 = new
		// StringBuilder("<c4soap name=\"SendToDevice\" async=\"0\" seq=\"");
		// ((StringBuilder)localObject1).append(paramLong);
		// ((StringBuilder)localObject1).append("\"><param name=\"iddevice\" type=\"number\">");
		// ((StringBuilder)localObject1).append(this.c);
		// ((StringBuilder)localObject1).append("</param><param name=\"data\" type=\"string\"><devicecommand owneridtype=\"\" owneriditem=\"-1\"><command>GET_AUDIO_MEDIA</command><params><param><name>type</name><value type=\"STRING\"><static>ALBUM_INFO</static></value></param><param><name>id_list</name><value type=\"STRING\"><static>");
		// ((StringBuilder)localObject1).append(((StringBuilder)localObject2).toString());
		// ((StringBuilder)localObject1).append("</static></value></param></params></devicecommand></param></c4soap>");
		// localObject2 = ((StringBuilder)localObject1).toString();
		// return localObject2;
		// }
		// String str = (String)((Iterator)localObject1).next();
		// if (localObject2 != null)
		// {
		// ((StringBuilder)localObject2).append(", ");
		// ((StringBuilder)localObject2).append(str);
		// localObject2 = localObject2;
		// }
		// else
		// {
		// localObject2 = new StringBuilder(str);
		// }
		// localObject2 = localObject2;
		// }
		return "";
	}

	public void a(Vector<String> paramVector) {
		this.a = paramVector;
	}

	public Vector<String> c() {
		return this.a;
	}

	public ResponseParser m_() {
		return (ResponseParser) ParserFactory.GetDetailedAlbumsProvider.get();
	}
}
