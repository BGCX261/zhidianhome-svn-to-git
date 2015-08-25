package com.zd.model.director.broadcast;

import com.zd.model.Results;

public abstract interface BroadcastCollection {
	public interface OnBroadcastsUpdateListener {
		public abstract void a(BroadcastCollection paramBroadcastCollection);
	}

	public abstract Broadcast a(int paramInt);

	public abstract Broadcast a(String paramString);

	public abstract boolean a(
			BroadcastCollection.OnBroadcastsUpdateListener paramOnBroadcastsUpdateListener);

	public abstract void b(
			BroadcastCollection.OnBroadcastsUpdateListener paramOnBroadcastsUpdateListener);

	public abstract boolean b();

	public abstract boolean c();

	public abstract Results<Broadcast> d();

	public abstract int e();

	public abstract void f();
}

/*
 * Location: E:\去哪儿\com.control4.myhome-2\classes_dex2jar.jar Qualified Name:
 * com.control4.director.broadcast.BroadcastCollection JD-Core Version: 0.6.0
 */