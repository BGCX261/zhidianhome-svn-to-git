package com.zd.model.command;

public abstract class RoomCommand extends Command {
	protected int c = 0;

	public void b(int paramInt) {
		this.c = paramInt;
	}

	public int e() {
		return this.c;
	}
}

/*
 * Location: E:\去哪儿\com.control4.myhome-2\classes_dex2jar.jar Qualified Name:
 * com.control4.director.command.RoomCommand JD-Core Version: 0.6.0
 */