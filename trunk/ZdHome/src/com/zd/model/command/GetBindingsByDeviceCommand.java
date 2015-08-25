package com.zd.model.command;

import com.zd.model.parser.GetBindingsByDeviceParser;
import com.zd.model.parser.ParserFactory;
import com.zd.model.parser.ResponseParser;

public class GetBindingsByDeviceCommand extends RoomCommand {
	public GetBindingsByDeviceCommand() {
		this.h = 9;
	}

	public String a(long paramLong) {
		return "<c4soap name=\"GetBindingsByDevice\" async=\"False\" seq=\""
				+ paramLong + "\"><param name=\"iddevice\" type=\"number\">"
				+ this.c + "</param></c4soap>";
	}

	public ResponseParser m_() {
		return (GetBindingsByDeviceParser) ParserFactory.GetBindingsByDeviceProvider
				.get();
	}

	public boolean n_() {
		return true;
	}
}

/*
 * Location: E:\去哪儿\com.control4.myhome-2\classes_dex2jar.jar Qualified Name:
 * com.control4.director.command.GetBindingsByDeviceCommand JD-Core Version:
 * 0.6.0
 */