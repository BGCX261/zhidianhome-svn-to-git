package com.zd.model.audio;

import java.util.Vector;

public abstract interface AudioQueue {
	public interface QueueState {

	}

	public interface OnAudioQueueUpdateListener {

	}

	public abstract int a();

	public abstract void a(
			AudioQueue.OnAudioQueueUpdateListener paramOnAudioQueueUpdateListener);

	public abstract boolean a(int paramInt);

	public abstract boolean a(int paramInt1, int paramInt2);

	public abstract boolean a(
			int paramInt,
			AudioQueue.OnAudioQueueUpdateListener paramOnAudioQueueUpdateListener);

	public abstract boolean a(String paramString);

	public abstract boolean a(String paramString, int paramInt1, int paramInt2);

	public abstract boolean a(boolean paramBoolean, int paramInt);

	public abstract Song b(int paramInt);

	public abstract String b();

	public abstract void b(
			AudioQueue.OnAudioQueueUpdateListener paramOnAudioQueueUpdateListener);

	public abstract boolean b(
			int paramInt,
			AudioQueue.OnAudioQueueUpdateListener paramOnAudioQueueUpdateListener);

	public abstract boolean b(boolean paramBoolean, int paramInt);

	public abstract AudioQueue.QueueState c();

	public abstract String d();

	public abstract int e();

	public abstract long f();

	public abstract String g();

	public abstract int h();

	public abstract String i();

	public abstract boolean j();

	public abstract boolean k();

	public abstract boolean l();

	public abstract boolean m();

	public abstract boolean n();

	public abstract boolean o();

	public abstract Vector<Integer> p();

	public abstract Song q();

	public abstract void r();

	public abstract String s();

	public abstract int t();
}
