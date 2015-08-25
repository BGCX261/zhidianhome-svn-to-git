package com.zd.model.rhapsody;

import com.zd.model.Results;
import com.zd.model.audio.Channel;
import com.zd.model.audio.Genre;

public abstract interface RhapsodyChannelGuide {
	public abstract interface OnRhapsodyAllChannelsListener {
		public abstract void a(RhapsodyChannelGuide paramRhapsodyChannelGuide);
	}

	public abstract interface OnRhapsodyChannelGenresListener {
		public abstract void a(RhapsodyChannelGuide paramRhapsodyChannelGuide);
	}

	public abstract interface OnRhapsodyTopChannelsListener {
		public abstract void a(RhapsodyChannelGuide paramRhapsodyChannelGuide);
	}

	public abstract void a();

	public abstract boolean a(
			RhapsodyChannelGuide.OnRhapsodyAllChannelsListener paramOnRhapsodyAllChannelsListener);

	public abstract boolean a(
			RhapsodyChannelGuide.OnRhapsodyChannelGenresListener paramOnRhapsodyChannelGenresListener);

	public abstract boolean a(
			RhapsodyChannelGuide.OnRhapsodyTopChannelsListener paramOnRhapsodyTopChannelsListener);

	public abstract void b(
			RhapsodyChannelGuide.OnRhapsodyAllChannelsListener paramOnRhapsodyAllChannelsListener);

	public abstract void b(
			RhapsodyChannelGuide.OnRhapsodyChannelGenresListener paramOnRhapsodyChannelGenresListener);

	public abstract void b(
			RhapsodyChannelGuide.OnRhapsodyTopChannelsListener paramOnRhapsodyTopChannelsListener);

	public abstract boolean b();

	public abstract boolean c();

	public abstract Results<Channel> d();

	public abstract void e();

	public abstract boolean f();

	public abstract boolean g();

	public abstract Results<Channel> h();

	public abstract void i();

	public abstract boolean j();

	public abstract boolean k();

	public abstract Results<Genre> l();

	public abstract void m();
}
