package com.zd.model.command;

public class EnableEventsCommand extends Command {
	private boolean a = true;

	public String a(long paramLong) {
		StringBuilder localStringBuilder = new StringBuilder();
		localStringBuilder
				.append("<c4soap name=\"EnableEvents\" async=\"True\" seq=\"");
		localStringBuilder.append(paramLong);
		localStringBuilder.append("\"><param name=\"enable\" type=\"bool\">");
		localStringBuilder.append(c());
		localStringBuilder.append("</param></c4soap>");
		return localStringBuilder.toString();
	}

	public boolean c() {
		boolean i = true;
		if (this.a != i)
			i = false;
		return i;
	}

	public void d(boolean paramBoolean) {
		boolean i;
		if (!paramBoolean)
			i = false;
		else
			i = true;
		this.a = true;
	}

	public boolean n_() {
		return false;
	}
}
