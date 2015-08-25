package com.zd.model.parser;

import java.util.Vector;

import org.xmlpull.v1.XmlPullParser;

import roboguice.util.Ln;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.zd.model.audio.DirectorZone;
import com.zd.model.audio.DirectorZoneManager;

public class GetZonesParser extends ResponseParser {

	@Inject
	DirectorZoneManager _zoneManager;

	@Inject
	protected Provider<DirectorZone> _zoneProvider;
	protected DirectorZone a;
	protected Vector<DirectorZone> b;

	public void a(String paramString, XmlPullParser paramXmlPullParser) {
		super.a(paramString, paramXmlPullParser);
		try {
			if (paramString.equalsIgnoreCase("mediazone"))
				this.a = ((DirectorZone) this._zoneProvider.get());
			else if ((paramString.equalsIgnoreCase("zoneid"))
					|| (paramString.equalsIgnoreCase("deviceid"))
					|| (paramString.equalsIgnoreCase("roomids"))
					|| (paramString.equalsIgnoreCase("potential_roomids")))
				b(true);
		} catch (Exception localException) {
			Ln.e(localException);
		}
	}

	public void b(String paramString, XmlPullParser paramXmlPullParser) {
		// try
		// {
		// if (paramString.equalsIgnoreCase("mediazone"))
		// if (this.a != null)
		// {
		// if (this.b == null)
		// this.b = new Vector();
		// this.b.add(this.a);
		// this.a = null;
		// }
		// while (true)
		// {
		// super.b(paramString, paramXmlPullParser);
		// return;
		// if (!paramString.equalsIgnoreCase("zoneid"))
		// break;
		// if ((this.a == null) || (this.q == null))
		// continue;
		// String str1 = this.q.toString();
		// if ((str1 == null) || (str1.length() <= 0))
		// continue;
		// this.a.d(Integer.parseInt(str1));
		// }
		// }
		// catch (Exception str2)
		// {
		// while (true)
		// {
		// Ln.e(localException);
		// continue;
		// if (paramString.equalsIgnoreCase("deviceid"))
		// {
		// if ((this.a == null) || (this.q == null))
		// continue;
		// String str2 = this.q.toString();
		// if ((str2 == null) || (str2.length() <= 0))
		// continue;
		// this.a.e(Integer.parseInt(str2));
		// continue;
		// }
		// if (paramString.equalsIgnoreCase("roomids"))
		// {
		// if ((this.a == null) || (this.q == null))
		// continue;
		// this.a.a(this.q.toString());
		// continue;
		// }
		// if ((!paramString.equalsIgnoreCase("potential_roomids")) || (this.a
		// == null) || (this.q == null))
		// continue;
		// this.a.b(this.q.toString());
		// }
		// }
	}

	public void b(XmlPullParser paramXmlPullParser) {
		super.b(paramXmlPullParser);
		this.b = null;
		this.a = null;
	}

	public void c(XmlPullParser paramXmlPullParser) {
		// while (true)
		// {
		// int j;
		// DirectorZone localDirectorZone;
		// int n;
		// int m;
		// try
		// {
		// if ((this.m != 0) || (this.p == null))
		// continue;
		// this.m = this.p.i();
		// if (this.m != 40)
		// continue;
		// this._zoneManager.j();
		// if (this.b == null)
		// break label461;
		// j = this.b.size();
		// DirectorProject localDirectorProject = this._director.m();
		// int i = 0;
		// if (i >= j)
		// break label396;
		// localDirectorZone = (DirectorZone)this.b.elementAt(i);
		// if (localDirectorZone == null)
		// break label466;
		// if (this.m == 43)
		// continue;
		// if (localDirectorZone.h() <= 0)
		// continue;
		// localDirectorZone.a(localDirectorProject.b(localDirectorZone.h(),
		// true, this._director.p()));
		// String str1 = localDirectorZone.i();
		// if ((str1 == null) || (str1.length() <= 0))
		// continue;
		// String[] arrayOfString = str1.split(",");
		// int k = arrayOfString.length;
		// n = 0;
		// if (n >= k)
		// continue;
		// Object localObject = arrayOfString[n];
		// if ((localObject == null) || (((String)localObject).length() <= 0))
		// break label472;
		// localObject =
		// localDirectorProject.h(Integer.parseInt((String)localObject));
		// if (localObject == null)
		// break label472;
		// localDirectorZone.a((Room)localObject);
		// break label472;
		// String str2 = localDirectorZone.j();
		// if ((str2 == null) || (str2.length() <= 0))
		// continue;
		// arrayOfString = str2.split(",");
		// n = arrayOfString.length;
		// m = 0;
		// if (m >= n)
		// continue;
		// localObject = arrayOfString[m];
		// if ((localObject == null) || (((String)localObject).length() <= 0))
		// break label478;
		// localObject =
		// localDirectorProject.h(Integer.parseInt((String)localObject));
		// if (localObject == null)
		// break label478;
		// localDirectorZone.b((Room)localObject);
		// break label478;
		// if ((this.m == 41) || (this.m == 40) || (this.m == 42))
		// this._zoneManager.a(localDirectorZone);
		// }
		// catch (Exception localException1)
		// {
		// Ln.e(localException1);
		// super.c(paramXmlPullParser);
		// return;
		// }
		// if (this.m == 43)
		// {
		// this._zoneManager.d(localDirectorZone.g());
		// break label466;
		// label396: if (this.m == 40)
		// {
		// this._zoneManager.a(true);
		// this._zoneManager.b(false);
		// }
		// ZoneManager.OnZoneManagerUpdateListener
		// localOnZoneManagerUpdateListener = this._zoneManager.a();
		// if (localOnZoneManagerUpdateListener == null)
		// continue;
		// try
		// {
		// localOnZoneManagerUpdateListener.a(this._zoneManager);
		// }
		// catch (Exception localException2)
		// {
		// Ln.e(localException2,
		// "Exception calling zone manager update listener", new Object[0]);
		// }
		// continue;
		// label461: j = 0;
		// continue;
		// }
		// label466: localException2++;
		// continue;
		// label472: n++;
		// continue;
		// label478: m++;
		// }
	}
}

/*
 * Location: E:\去哪儿\com.control4.myhome-2\classes_dex2jar.jar Qualified Name:
 * com.control4.director.parser.GetZonesParser JD-Core Version: 0.6.0
 */