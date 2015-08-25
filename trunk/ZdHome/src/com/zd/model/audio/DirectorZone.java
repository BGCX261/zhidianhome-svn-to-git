package com.zd.model.audio;

import roboguice.util.Ln;
import android.app.Application;

import com.google.inject.Inject;
import com.zd.home.R;
import com.zd.model.HashIndex;
import com.zd.model.Room;
import com.zd.model.device.Device;

public class DirectorZone implements Zone {

	@Inject
	private Application _context;
	protected int a;
	protected int b;
	protected String c;
	protected String d;
	protected Device e;
	protected AudioQueue f;
	HashIndex<Integer, Room> g;
	HashIndex<Integer, Room> h;

	public Room a(int paramInt) {
		try {
			if (this.g != null)
				;
			for (Room localRoom = (Room) this.g.a(paramInt);; localRoom = null)
				return localRoom;
		} catch (Exception localObject) {

		}
		return null;
	}

	public String a() {
		String str = this._context.getString(R.string.zone);

		// StringBuilder localStringBuilder;
		// int j;
		// try
		// {
		// int i = e();
		// localStringBuilder = null;
		// j = 0;
		// if (j < i)
		// {
		// Object localObject = a(j);
		// if (localObject == null)
		// break label129;
		// localObject = ((Room)localObject).b();
		// if ((localObject == null) || (((String)localObject).length() <= 0))
		// break label129;
		// if (localStringBuilder == null)
		// continue;
		// localStringBuilder.append(", ");
		// localStringBuilder.append((String)localObject);
		// break label129;
		// localStringBuilder = new StringBuilder((String)localObject);
		// }
		// }
		// catch (Exception e)
		// {
		//
		// }
		// if (localStringBuilder != null)
		// {
		// str = localStringBuilder.toString();
		// continue;
		// }
		return str;

	}

	public void a(AudioQueue paramAudioQueue) {
		this.f = paramAudioQueue;
	}

	public void a(Room paramRoom) {
		if (paramRoom == null)
			;

		try {
			if (this.g == null)
				this.g = new HashIndex();
			this.g.a(Integer.valueOf(paramRoom.a()), paramRoom);
		} catch (Exception localException) {
			Ln.e(localException);
		}

	}

	public void a(Device paramDevice) {
		this.e = paramDevice;
	}

	public void a(String paramString) {
		this.c = paramString;
	}

	public Room b(int paramInt) {
		try {
			if (this.g != null)
				;
			for (Room localRoom = (Room) this.g.a(Integer.valueOf(paramInt));; localRoom = null)
				return localRoom;
		} catch (Exception localObject) {

		}
		return null;
	}

	public String b() {
		// StringBuilder localStringBuilder = new StringBuilder();
		// while (true)
		// {
		// String str;
		// try
		// {
		// Object localObject1 = a(0);
		// if (localObject1 == null)
		// continue;
		// Object localObject2 = ((Room)localObject1).s();
		// if (localObject2 == null)
		// continue;
		// switch (((Room.MediaInfo)localObject2).f())
		// {
		// default:
		// if (this.e == null)
		// continue;
		// if ((this.e.t() != 100002) || (((Room.MediaInfo)localObject2).g() ==
		// null) ||
		// (!((Room.MediaInfo)localObject2).g().equalsIgnoreCase("IPODSONG")))
		// continue;
		// localStringBuilder.append("iPod");
		// if ((((Room.MediaInfo)localObject2).c() == null) ||
		// (((Room.MediaInfo)localObject2).c().length() <= 0))
		// continue;
		// localStringBuilder.append(" - ");
		// localStringBuilder.append(((Room.MediaInfo)localObject2).c());
		// if ((((Room.MediaInfo)localObject2).b() == null) ||
		// (((Room.MediaInfo)localObject2).b().length() <= 0))
		// continue;
		// localStringBuilder.append("-");
		// localStringBuilder.append(((Room.MediaInfo)localObject2).b());
		// if ((localStringBuilder.length() != 0) || (this.f == null))
		// continue;
		// localObject2 = this.f.q();
		// if ((localObject2 == null) || (((Song)localObject2).au() == null))
		// continue;
		// switch (((Song)localObject2).b())
		// {
		// default:
		// localObject1 = ((Song)localObject2).au();
		// if ((!((Song)localObject2).l()) || (((Song)localObject2).m()))
		// continue;
		// ((Song)localObject2).a(new DirectorZone.1(this));
		// localStringBuilder.append((String)localObject1);
		// if ((this.e == null) || (localStringBuilder.length() != 0))
		// continue;
		// if (this.e.a() != Device.DeviceType.i)
		// continue;
		// if (!this.e.A())
		// continue;
		// this.e.p();
		// localObject1 = (iPod)this.e;
		// if (((iPod)localObject1).e() == null)
		// continue;
		// localStringBuilder.append(this.e.u());
		// localStringBuilder.append(" - ");
		// localStringBuilder.append(((iPod)localObject1).e());
		// localObject1 = localStringBuilder.toString();
		// case 1:
		// case 2:
		// case 3:
		// }
		// break;
		// case 1:
		// localStringBuilder.append("Digital Audio");
		// continue;
		// case 2:
		// case 3:
		// }
		// }
		// catch (Exception str)
		// {
		// Ln.e(localException);
		// str = localStringBuilder.toString();
		// break label617;
		// localStringBuilder.append("Rhapsody");
		// continue;
		// localStringBuilder.append("Rhapsody Channel");
		// continue;
		// str = this.e.u();
		// if ((str == null) || (str.length() <= 0))
		// continue;
		// localStringBuilder.append(str);
		// continue;
		// localStringBuilder.append("Digital Audio - ");
		// continue;
		// localStringBuilder.append("Rhapsody - ");
		// continue;
		// localStringBuilder.append("Rhapsody Channel - ");
		// continue;
		// switch (this.f.e())
		// {
		// case 2:
		// localStringBuilder.append("Rhapsody Track");
		// break;
		// case 3:
		// localStringBuilder.append("Rhapsody Channel");
		// continue;
		// if (str.u() == null)
		// continue;
		// localStringBuilder.append(this.e.u());
		// continue;
		// if (this.e.u() == null)
		// continue;
		// localStringBuilder.append(this.e.u());
		// continue;
		// }
		// }
		// label617: return str;
		// }
		return null;
	}

	public void b(Room paramRoom) {
		if (paramRoom == null)
			;
		try {
			if (this.h == null)
				this.h = new HashIndex();
			this.h.a(Integer.valueOf(paramRoom.a()), paramRoom);
		} catch (Exception localException) {
			Ln.e(localException);
		}

	}

	public void b(String paramString) {
		this.d = paramString;
	}

	public Zone.ZoneType c() {
		Zone.ZoneType localZoneType2 = null;
		// try
		// {
		// Object localObject;
		// if (this.f != null)
		// {
		// localObject = Zone.ZoneType.a;
		// }
		// else
		// {
		// if (this.e != null)
		// {
		// localObject = a(0);
		// if (localObject != null)
		// {
		// int i = ((Room)localObject).r();
		// if (this.e.t() == i)
		// {
		// localZoneType1 = Zone.ZoneType.b;
		// break label82;
		// }
		// localZoneType1 = Zone.ZoneType.a;
		// break label82;
		// }
		// }
		// Zone.ZoneType localZoneType1 = Zone.ZoneType.a;
		// }
		// }
		// catch (Exception localZoneType2)
		// {
		// Ln.e(localException);
		// localZoneType2 = Zone.ZoneType.a;
		// }
		// label82:
		return localZoneType2;
	}

	public Room c(int paramInt) {
		try {
			if (this.h != null)
				;
			for (Room localRoom = (Room) this.h.a(paramInt);; localRoom = null)
				return localRoom;
		} catch (Exception localObject) {

		}
		return null;
	}

	public void d(int paramInt) {
		this.a = paramInt;
	}

	public boolean d() {
		boolean bool1 = true;
		try {
			int i = e();
			int j = 0;
			while (j < i) {
				Room localRoom = a(j);
				if (localRoom != null) {
					boolean bool2 = localRoom.an();
					bool1 |= bool2;
				}
				j += 1;
			}
		} catch (Exception localException) {
			Ln.e(localException);
			bool1 = false;
		}
		return bool1;
	}

	public int e() {
		int i;
		if (this.g == null)
			i = 0;
		else
			i = this.g.c();
		return i;
	}

	public void e(int paramInt) {
		this.b = paramInt;
	}

	public int f() {
		int i;
		if (this.h == null)
			i = 0;
		else
			i = this.h.c();
		return i;
	}

	public int g() {
		return this.a;
	}

	public int h() {
		return this.b;
	}

	public String i() {
		return this.c;
	}

	public String j() {
		return this.d;
	}

	public Device k() {
		return this.e;
	}

	public AudioQueue l() {
		return this.f;
	}

	public boolean m() {
		boolean bool1 = true;
		try {
			int j = e();
			int i = 0;
			while (true) {
				if (i < j) {
					Room localRoom = a(i);
					if (localRoom != null) {
						boolean bool2 = localRoom.n();
						bool1 &= bool2;
					}
					if (bool1)
						;
				} else {
					return bool1;
				}
				i += 1;
			}
		} catch (Exception localException) {
			while (true) {
				Ln.e(localException);
				bool1 = false;
			}
		}
	}
}

/*
 * Location: E:\去哪儿\com.control4.myhome-2\classes_dex2jar.jar Qualified Name:
 * com.control4.director.audio.DirectorZone JD-Core Version: 0.6.0
 */