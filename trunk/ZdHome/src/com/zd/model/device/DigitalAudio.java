package com.zd.model.device;

import com.zd.model.audio.AudioQueue;

public abstract interface DigitalAudio extends Device {
	public abstract AudioQueue a(int paramInt);

	public abstract boolean a(int paramInt1, int paramInt2);

	public abstract AudioQueue b(int paramInt);

	public abstract boolean c();

	public abstract boolean d();

	public abstract int e();
}
