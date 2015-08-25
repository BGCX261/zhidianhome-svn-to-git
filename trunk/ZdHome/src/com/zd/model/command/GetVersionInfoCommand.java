package com.zd.model.command;

import com.zd.model.parser.ParserFactory;
import com.zd.model.parser.ResponseParser;

public class GetVersionInfoCommand extends Command {
	protected GetVersionInfoCommand() {
		this.h = 1;
		a(true);
	}

	public String a(long paramLong) {
		return "<c4soap name=\"GetVersionInfo\" async=\"False\" seq=\""
				+ paramLong + "\"/>";
	}

	public ResponseParser m_() {
		return (ResponseParser) ParserFactory.GetVersionInfoProvider.get();
	}

	public boolean n_() {
		return true;
	}
}

/*
 * Location: E:\去哪儿\com.control4.myhome-2\classes_dex2jar.jar Qualified Name:
 * com.control4.director.command.GetVersionInfoCommand JD-Core Version: 0.6.0
 */