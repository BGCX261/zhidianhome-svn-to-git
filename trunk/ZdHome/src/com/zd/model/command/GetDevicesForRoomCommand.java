package com.zd.model.command;

import com.zd.model.parser.GetDevicesParser;
import com.zd.model.parser.ParserFactory;
import com.zd.model.parser.ResponseParser;

public class GetDevicesForRoomCommand extends RoomCommand {
	protected int a = 0;

	public GetDevicesForRoomCommand() {
		this.h = 12;
	}

	public String a(long paramLong) {
		String str = "";
		if (this.a != 5) {
			if (this.a != 4) {
				if (this.a != 8) {
					if (this.a == 9)
						str = "GET_RADIO_DEVICES";
				} else
					str = "GET_MUSIC_DEVICES";
			} else
				str = "GET_LISTEN_DEVICES";
		} else
			str = "GET_WATCH_DEVICES";
		return "<c4soap name=\"SendToDevice\" async=\"0\" seq=\""
				+ paramLong
				+ "\">"
				+ "<param name=\"iddevice\" type=\"number\">"
				+ this.c
				+ "</param>"
				+ "<param name=\"data\" type=\"string\">"
				+ "<devicecommand owneridtype=\"\" owneriditem=\"-1\"><command>"
				+ str + "</command><params></params></devicecommand>"
				+ "</param></c4soap>";
	}

	public void a(int paramInt) {
		this.a = paramInt;
		if (this.a != 5) {
			if (this.a != 4) {
				if (this.a != 8) {
					if (this.a == 9)
						this.h = 49;
				} else
					this.h = 48;
			} else
				this.h = 12;
		} else
			this.h = 13;
	}

	public ResponseParser m_() {
		GetDevicesParser localGetDevicesParser = (GetDevicesParser) ParserFactory.GetDevicesProvider
				.get();
		localGetDevicesParser.c(this.a);
		return localGetDevicesParser;
	}

	public boolean n_() {
		return true;
	}
}

/*
 * Location: E:\去哪儿\com.control4.myhome-2\classes_dex2jar.jar Qualified Name:
 * com.control4.director.command.GetDevicesForRoomCommand JD-Core Version: 0.6.0
 */