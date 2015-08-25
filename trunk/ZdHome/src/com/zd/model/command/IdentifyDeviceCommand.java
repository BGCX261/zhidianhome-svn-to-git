package com.zd.model.command;

import com.zd.model.parser.ParserFactory;
import com.zd.model.parser.ResponseParser;

public class IdentifyDeviceCommand extends RoomCommand {
	String a;

	protected IdentifyDeviceCommand() {
		this.h = 45;
		this.i = true;
	}

	public String a(long paramLong) {
		return "<c4soap name=\"IdentifyLicensedDevice\" async=\"False\" seq=\""
				+ paramLong
				+ "\"><param name=\"manufactureid\" type=\"string\">"
				+ "Control4MyHomeAndroid"
				+ "</param><param name=\"deviceid\" type=\"string\">" + this.a
				+ "</param></c4soap>";
	}

	public void a(String paramString) {
		this.a = paramString;
	}

	public ResponseParser m_() {
		return (ResponseParser) ParserFactory.IdentifyDeviceProvider.get();
	}

	public boolean n_() {
		return true;
	}
}

/*
 * Location: E:\去哪儿\com.control4.myhome-2\classes_dex2jar.jar Qualified Name:
 * com.control4.director.command.IdentifyDeviceCommand JD-Core Version: 0.6.0
 */