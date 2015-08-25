package com.zd.model.command;

import com.zd.model.parser.ParserFactory;
import com.zd.model.parser.ResponseParser;

public class GetVariableCommand extends DeviceCommand {
	protected int b = 0;

	public GetVariableCommand() {
		this.h = 4;
	}

	public String a(long paramLong) {
		return "<c4soap name=\"GetVariable\" async=\"False\" seq=\""
				+ paramLong + "\">"
				+ "<param name=\"iddevice\" type=\"number\">" + this.a
				+ "</param>" + "<param name=\"idvariable\" type=\"number\">"
				+ this.b + "</param></c4soap>";
	}

	public void b(int paramInt) {
		this.b = paramInt;
	}

	public ResponseParser m_() {
		return (ResponseParser) ParserFactory.GetVariableProvider.get();
	}

	public boolean n_() {
		return true;
	}
}
