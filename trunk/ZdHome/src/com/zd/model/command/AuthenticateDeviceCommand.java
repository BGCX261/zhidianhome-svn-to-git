package com.zd.model.command;

import com.zd.model.parser.ParserFactory;
import com.zd.model.parser.ResponseParser;

public class AuthenticateDeviceCommand extends Command {
	String a;

	protected AuthenticateDeviceCommand() {
		this.h = 44;
		this.i = true;
	}

	public String a(long paramLong) {
		return "<c4soap name=\"AuthenticateLicensedDevice\" async=\"False\" seq=\""
				+ paramLong
				+ "\"><param name=\"manufactureid\" type=\"string\">"
				+ "Control4MyHomeAndroid"
				+ "</param><param name=\"deviceid\" type=\"string\">"
				+ this.a
				+ "</param></c4soap>";
	}

	public void a(String paramString) {
		this.a = paramString;
	}

	public ResponseParser m_() {
		return (ResponseParser) ParserFactory.AuthenticateDeviceProvider.get();
	}

	public boolean n_() {
		return true;
	}
}
