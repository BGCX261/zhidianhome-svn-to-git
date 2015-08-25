// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.zd.model.audio;

import java.util.Vector;

// Referenced classes of package com.control4.director.audio:
//            Zone

public interface ZoneManager {

	public interface OnZoneManagerUpdateListener {

		void a(DirectorZoneManager directorZoneManager);

	}

	public abstract Zone a(int j);

	public abstract OnZoneManagerUpdateListener a();

	public abstract void a(
			OnZoneManagerUpdateListener onzonemanagerupdatelistener);

	public abstract boolean a(Vector<Integer> vector, Zone zone);

	public abstract Zone b(int j);

	public abstract boolean b();

	public abstract boolean b(Vector<Integer> vector, Zone zone);

	public abstract Zone c(int j);

	public abstract boolean c();

	public abstract boolean d();

	public abstract boolean e();

	public abstract boolean f();

	public abstract boolean g();

	public abstract int h();

	public abstract boolean i();
}
