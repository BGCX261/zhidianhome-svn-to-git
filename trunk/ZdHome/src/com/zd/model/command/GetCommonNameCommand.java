package com.zd.model.command;

import com.zd.model.parser.ParserFactory;
import com.zd.model.parser.ResponseParser;

public class GetCommonNameCommand extends Command {
	public GetCommonNameCommand() {
		this.h = 46;
		a(true);
	}

	public String a(long paramLong) {
		return "<c4soap name=\"GetCommonName\" async=\"False\" seq=\""
				+ paramLong + "\"/>";
	}

	public ResponseParser m_() {
		return (ResponseParser) ParserFactory.GetCommonNameProvider.get();
	}

	public boolean n_() {
		return true;
	}
}

/*
 * Location: E:\去哪儿\com.control4.myhome-2\classes_dex2jar.jar Qualified Name:
 * com.control4.director.command.GetCommonNameCommand JD-Core Version: 0.6.0
 */