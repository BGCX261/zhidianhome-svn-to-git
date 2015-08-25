package com.zd.model.command;

import java.util.HashMap;

import com.zd.model.parser.ResponseParser;

public abstract class Command {
	public abstract interface NotificationListener {
		public abstract void a();

		public abstract void a(String paramString);

		public abstract void b();

	}

	private boolean a = false;
	protected Command.NotificationListener e;
	protected HashMap<String, Object> f;
	protected boolean g = false;
	protected int h = -1;
	protected boolean i = false;

	public abstract String a(long paramLong);

	public void a(Command.NotificationListener paramNotificationListener) {
		this.e = paramNotificationListener;
	}

	public void a(String paramString, Object paramObject) {
		if (this.f == null)
			this.f = new HashMap();
		if ((paramString != null) && (paramObject != null))
			this.f.put(paramString, paramObject);

	}

	public void a(boolean paramBoolean) {
		this.i = paramBoolean;
	}

	public Object b(String paramString) {
		Object localObject;
		if ((this.f != null) && (paramString != null))
			localObject = this.f.get(paramString);
		else
			localObject = null;
		return localObject;
	}

	public void b(boolean paramBoolean) {
		this.a = paramBoolean;
	}

	public void c(int paramInt) {
		this.h = paramInt;
	}

	public void c(boolean paramBoolean) {
		this.g = paramBoolean;
	}

	public boolean g() {
		return this.i;
	}

	public boolean h() {
		return this.a;
	}

	public int i() {
		return this.h;
	}

	public Command.NotificationListener j() {
		return this.e;
	}

	public ResponseParser m_() {
		ResponseParser localResponseParser = null;
		// if ((this.g) && (this.h >= 0))
		// localResponseParser = ParserFactory.a(this.h);
		// else
		// localResponseParser = null;
		return localResponseParser;
	}

	public boolean n_() {
		return this.g;
	}
}
