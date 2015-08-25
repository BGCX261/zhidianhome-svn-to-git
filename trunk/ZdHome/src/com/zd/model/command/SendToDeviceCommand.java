package com.zd.model.command;

public class SendToDeviceCommand extends Command {
	protected String a = "";
	protected int b = 0;
	protected int c = -1;
	protected boolean d = true;
	protected String j = null;

	public String a(long paramLong) {
		// String str = "";
		// if (this.c != -1)
		// str = "<param><name>ROOM_ID</name><value type=\"INT\"><static>" +
		// this.c + "</static></value></param>";
		// if (this.j != null)
		// str = str.concat(this.j);
		// StringBuilder localStringBuilder = new
		// StringBuilder().append("<c4soap name=\"");
		// if (!this.d)
		// localObject = "SendToDevice";
		// else
		// localObject = "SendToDeviceAsync";
		// Object localObject =
		// localStringBuilder.append((String)localObject).append("\" async=\"");
		// int i;
		// if (!this.d)
		// i = 0;
		// else
		// i = 1;
		// return (String)(i + "\" seq=\"" + paramLong +
		// "\"><param name=\"iddevice\" type=\"number\">" + this.b +
		// "</param><param name=\"data\" type=\"string\"><devicecommand><command>"
		// + this.a + "</command><params>" + str +
		// "</params></devicecommand></param></c4soap>");
		return null;
	}

	public void a(int paramInt) {
		this.c = paramInt;
	}

	public void a(String paramString) {
		this.j = paramString;
	}

	public void b(int paramInt) {
		this.b = paramInt;
	}

	public void c(String paramString) {
		this.a = paramString;
	}

	public void d(boolean paramBoolean) {
		this.d = paramBoolean;
	}
}

/*
 * Location: E:\去哪儿\com.control4.myhome-2\classes_dex2jar.jar Qualified Name:
 * com.control4.director.command.SendToDeviceCommand JD-Core Version: 0.6.0
 */