package com.zd.model.command;

public class RegisterEventListenerCommand extends Command {
	protected int a = 0;
	protected int b = 0;

	public String a(long paramLong) {
		StringBuilder localStringBuilder = new StringBuilder();
		localStringBuilder
				.append("<c4soap name=\"RegisterEventListener\" async=\"1\" seq=\"");
		localStringBuilder.append(paramLong);
		localStringBuilder
				.append("\"><param name=\"idevent\" type=\"number\">");
		localStringBuilder.append(this.a);
		localStringBuilder
				.append("</param><param name=\"iditem\" type=\"number\">");
		localStringBuilder.append(this.b);
		localStringBuilder.append("</param></c4soap>");
		return localStringBuilder.toString();
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
