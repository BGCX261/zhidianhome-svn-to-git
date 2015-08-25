package com.zd.model.command;

import com.zd.model.parser.GetItemsParser;
import com.zd.model.parser.ParserFactory;
import com.zd.model.parser.ResponseParser;

public class GetItemsCommand extends Command {
	public static final int a = 0;
	public static final int b = 1;
	public static final int c = 2;
	public static final int d = 4;
	public static final int j = 8;
	public static final int k = 16;
	public static final int l = 32;
	public static final int m = 128;
	public static final int n = 268435456;
	protected int o = 31;
	protected boolean p = true;
	protected boolean q = false;
	protected boolean r = true;
	private boolean s = false;

	protected GetItemsCommand() {
		this.h = 2;
	}

	public String a(long paramLong) {
		return "<c4soap name=\"GetItems\" async=\"False\" seq=\"" + paramLong
				+ "\"><param name=\"filter\" type=\"number\">" + this.o
				+ "</param></c4soap>";
	}

	public void a(int paramInt) {
		this.o = paramInt;
	}

	public boolean c() {
		return this.r;
	}

	public void d(boolean paramBoolean) {
		this.r = paramBoolean;
	}

	public boolean d() {
		return this.q;
	}

	public int e() {
		return this.o;
	}

	public void e(boolean paramBoolean) {
		this.q = paramBoolean;
	}

	public void f(boolean paramBoolean) {
		this.p = paramBoolean;
	}

	public void g(boolean paramBoolean) {
		this.s = paramBoolean;
	}

	public ResponseParser m_() {
		GetItemsParser localGetItemsParser = (GetItemsParser) ParserFactory.GetItemsParserProvider
				.get();
		localGetItemsParser.c(this.p);
		localGetItemsParser.a(this.e);
		localGetItemsParser.d(this.r);
		localGetItemsParser.e(this.s);
		localGetItemsParser.d(this.o);
		return localGetItemsParser;
	}

	public boolean n_() {
		return true;
	}
}

/*
 * Location: E:\去哪儿\com.control4.myhome-2\classes_dex2jar.jar Qualified Name:
 * com.control4.director.command.GetItemsCommand JD-Core Version: 0.6.0
 */