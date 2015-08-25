package com.zd.model.parser;

import java.util.HashMap;

import org.xmlpull.v1.XmlPullParser;

import com.google.inject.Inject;
import com.zd.model.Director;
import com.zd.model.LightingScene;

public class LightingScenesParser extends ResponseParser {

	@Inject
	private com.google.inject.Provider<Director> _directorProvider;
	LightingScene a = null;
	HashMap<String, String> b = null;

	public void a(String paramString, XmlPullParser paramXmlPullParser) {
		super.a(paramString, paramXmlPullParser);
		if (!paramString.equalsIgnoreCase("scene")) {
			if ((!paramString.equalsIgnoreCase("sceneid"))
					&& (!paramString.equalsIgnoreCase("name"))) {
				if ((!paramString.equalsIgnoreCase("light"))
						&& (!paramString.equalsIgnoreCase("outlet_light"))) {
					if ((paramString.equalsIgnoreCase("deviceid"))
							|| (paramString.equalsIgnoreCase("ramprate"))
							|| (paramString.equalsIgnoreCase("ramplevel"))
							|| (paramString.equalsIgnoreCase("timetype")))
						b(true);
				} else {
					this.b = new HashMap();
					b(true);
				}
			} else
				b(true);
		} else {
			this.a = new LightingScene();
			b(true);
		}
	}

	public void b(String paramString, XmlPullParser paramXmlPullParser) {
		// try
		// {
		// if (paramString.equalsIgnoreCase("scene"))
		// {
		// if (this.a != null)
		// {
		// localObject = ((Director)this._directorProvider.a()).p();
		// ContentValues localContentValues1 = new ContentValues(2);
		// localContentValues1.put("lighting_scene_id",
		// Integer.valueOf(this.a.b()));
		// localContentValues1.put("name", this.a.a());
		// long l1 = ((SQLiteDatabase)localObject).insert("lighting_scenes",
		// null, localContentValues1);
		// if (l1 < 0L)
		// Ln.e("Unable to insert lighting scene " + this.a.a() +
		// " into the DB.  " + l1, new Object[0]);
		// }
		// while (true)
		// {
		// super.b(paramString, paramXmlPullParser);
		// return;
		// Ln.e("Unable to handle a lighting scene in XML parser - no current scene.",
		// new Object[0]);
		// }
		// }
		// }
		// catch (Exception i)
		// {
		// while (true)
		// {
		// Object localObject;
		// Ln.e(localException);
		// continue;
		// if (paramString.equalsIgnoreCase("sceneid"))
		// {
		// if ((this.a == null) || (this.q.length() <= 0))
		// continue;
		// this.a.a(Integer.parseInt(this.q.toString()));
		// continue;
		// }
		// if (paramString.equalsIgnoreCase("name"))
		// {
		// if ((this.a == null) || (this.q.length() <= 0))
		// continue;
		// this.a.a(this.q.toString());
		// continue;
		// }
		// if ((paramString.equalsIgnoreCase("light")) ||
		// (paramString.equalsIgnoreCase("outlet_light")))
		// {
		// if ((this.b != null) && (this.a != null))
		// {
		// localObject = (String)this.b.get("deviceid");
		// int i = this.a.b();
		// SQLiteDatabase localSQLiteDatabase =
		// ((Director)this._directorProvider.a()).p();
		// ContentValues localContentValues2 = new ContentValues(2);
		// localContentValues2.put("lighting_scene_id", Integer.valueOf(i));
		// localContentValues2.put("lighting_scene_device_id",
		// Integer.valueOf(Integer.parseInt((String)localObject)));
		// long l2 = localSQLiteDatabase.insert("lighting_scene_lights", null,
		// localContentValues2);
		// if (l2 >= 0L)
		// continue;
		// Ln.e("Unable to insert lighting scene light " + (String)localObject +
		// " into the DB for scene " + i + ".  " + l2, new Object[0]);
		// continue;
		// }
		// Ln.e("Unable to parse a light for a lighting scene.  No Current Light or Scene",
		// new Object[0]);
		// continue;
		// }
		// if (((!paramString.equalsIgnoreCase("deviceid")) &&
		// (!paramString.equalsIgnoreCase("ramprate")) &&
		// (!paramString.equalsIgnoreCase("ramplevel")) &&
		// (!paramString.equalsIgnoreCase("timetype"))) || (this.b == null))
		// continue;
		// this.b.put(paramString, this.q.toString());
		// }
		// }
	}
}
