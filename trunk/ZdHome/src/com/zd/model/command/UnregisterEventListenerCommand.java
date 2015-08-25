package com.zd.model.command;

public class UnregisterEventListenerCommand extends Command {
	protected int a = 0;
	protected int b = 0;

	public String a(long paramLong) {
		return "<c4soap name=\"UnregisterEventListener\" async=\"1\" seq=\""
				+ paramLong + "\"><param name=\"idevent\" type=\"number\">"
				+ this.a + "</param><param name=\"iditem\" type=\"number\">"
				+ this.b + "</param></c4soap>";
	}

	public void a(int paramInt) {
		this.a = paramInt;
	}

	public void b(int paramInt) {
		this.b = paramInt;
	}

	public boolean n_() {
		return false;
	}
}

/*
 * Location: E:\去哪儿\com.control4.myhome-2\classes_dex2jar.jar Qualified Name:
 * com.control4.director.command.UnregisterEventListenerCommand JD-Core Version:
 * 0.6.0
 */