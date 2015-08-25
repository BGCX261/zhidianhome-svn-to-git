package com.zd.model.director.broadcast;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import com.google.inject.Inject;
import com.zd.model.Control4Director;
import com.zd.model.DirectorResults;
import com.zd.model.Results;

public abstract class DirectorBroadcastCollection implements
		BroadcastCollection {

	@Inject
	protected Control4Director _director;
	protected boolean a = true;
	protected boolean b = false;
	protected Timer c;
	protected TimerTask d;
	protected DirectorResults<Broadcast> e;
	protected int f = 0;
	protected final Object g = new Object();
	protected ArrayList<BroadcastCollection.OnBroadcastsUpdateListener> h;

	public Broadcast a(int paramInt) {
		Broadcast localBroadcast;
		if (this.e == null)
			localBroadcast = null;
		else
			localBroadcast = (Broadcast) this.e.c(paramInt);
		return localBroadcast;
	}

	public Broadcast a(String paramString) {
		Broadcast localBroadcast;
		if (this.e == null)
			localBroadcast = null;
		else
			localBroadcast = (Broadcast) this.e.b(paramString);
		return localBroadcast;
	}

	public void a() {
	}

	// ERROR //
	public void a(DirectorBroadcast paramDirectorBroadcast) {

	}

	public void a(boolean paramBoolean) {
		// this.b = paramBoolean;
		// if (this.d != null)
		// this.d.cancel();
		// if (!this.b)
		// {
		// Iterator localIterator;
		// if (this.h != null)
		// localIterator = this.h.iterator();
		// while (true)
		// {
		// if (!localIterator.hasNext())
		// {
		// this.h.clear();
		// if (this.c == null)
		// break;
		// this.c.cancel();
		// this.c = null;
		// break;
		// }
		// BroadcastCollection.OnBroadcastsUpdateListener
		// localOnBroadcastsUpdateListener =
		// (BroadcastCollection.OnBroadcastsUpdateListener)localIterator.next();
		// if (localOnBroadcastsUpdateListener == null)
		// continue;
		// localOnBroadcastsUpdateListener.a(this);
		// }
		// }
		// if (this.c == null)
		// this.c = new Timer();
		// this.d = new DirectorBroadcastCollection.1(this);
		// this.c.schedule(this.d, 35000L);
	}

	public void b(int paramInt) {
		this.f = paramInt;
	}

	public void b(
			BroadcastCollection.OnBroadcastsUpdateListener paramOnBroadcastsUpdateListener) {
		if (paramOnBroadcastsUpdateListener != null) {
			if (this.h == null)
				this.h = new ArrayList();
			this.h.add(paramOnBroadcastsUpdateListener);
		}
	}

	public void b(boolean paramBoolean) {
		this.a = paramBoolean;
	}

	public boolean b() {
		return this.a;
	}

	public boolean c() {
		return this.b;
	}

	public Results<Broadcast> d() {
		return this.e;
	}

	public int e() {
		int i;
		if (this.e == null)
			i = 0;
		else
			i = this.e.h();
		return i;
	}

	public void f() {
		// while (true)
		// {
		// int i;
		// try
		// {
		// if (this.e != null)
		// continue;
		// this.a = true;
		// break label83;
		// synchronized (this.g)
		// {
		// int j = e();
		// i = 0;
		// if (i >= j)
		// continue;
		// Broadcast localBroadcast = a(i);
		// if (localBroadcast == null)
		// break label84;
		// localBroadcast.h();
		// break label84;
		// this.e.j();
		// this.a = true;
		// }
		// }
		// catch (Exception localException)
		// {
		// Ln.e(localException);
		// }
		// label83: return;
		// label84: i++;
		// }
	}

	public int g() {
		return this.f;
	}
}
