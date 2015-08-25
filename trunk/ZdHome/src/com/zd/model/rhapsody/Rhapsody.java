package com.zd.model.rhapsody;

import java.util.ArrayList;
import java.util.Vector;

import com.zd.model.audio.Song;

public abstract interface Rhapsody {
	public abstract interface RhapsodyListener {
		public abstract void a(Rhapsody paramRhapsody);

		public abstract void a(Rhapsody paramRhapsody, String paramString);

		public abstract void a(Rhapsody paramRhapsody, boolean paramBoolean);

		public abstract void b(Rhapsody paramRhapsody);

		public abstract void c(Rhapsody paramRhapsody);

		public abstract void d(Rhapsody paramRhapsody);

		public abstract void e(Rhapsody paramRhapsody);

		public abstract void f(Rhapsody paramRhapsody);
	}

	public abstract interface OnRhapsodyTracksRetrievedListener {
		public abstract void a(Rhapsody paramRhapsody,
				ArrayList<Song> paramArrayList);
	}

	public static final int a = 5555;
	public static final String g_ = "Rhapsody Track";
	public static final String h_ = "Rhapsody Song";

	public abstract void a(Rhapsody.RhapsodyListener paramRhapsodyListener);

	public abstract boolean a(RhapsodyConnection paramRhapsodyConnection);

	public abstract boolean a(
			Vector<String> paramVector,
			Rhapsody.OnRhapsodyTracksRetrievedListener paramOnRhapsodyTracksRetrievedListener);

	public abstract boolean a_(String paramString1, String paramString2);

	public abstract void b(Rhapsody.RhapsodyListener paramRhapsodyListener);

	public abstract boolean b();

	public abstract void c();

	public abstract boolean c(Rhapsody.RhapsodyListener paramRhapsodyListener);

	public abstract RhapsodyConnection d();

	public abstract boolean e();

	public abstract RhapsodyUser f();

	public abstract RhapsodyUser g();

	public abstract boolean h();

	public abstract boolean i();

	public abstract String k();

	public abstract RhapsodyMusicGuide l();

	public abstract RhapsodyPlaylistCentral m();

	public abstract RhapsodyChannelGuide n();

	public abstract RhapsodySearch o();

	public abstract boolean x_();
}
