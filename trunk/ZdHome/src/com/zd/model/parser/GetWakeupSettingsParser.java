package com.zd.model.parser;

import org.xmlpull.v1.XmlPullParser;

import roboguice.util.Ln;

import com.zd.model.device.DirectorWakeupControls;
import com.zd.model.device.WakeupControls;

public class GetWakeupSettingsParser extends ResponseParser {
	WakeupControls.WakeupSetting a;
	int b;

	private DirectorWakeupControls a() {
		return (DirectorWakeupControls) this._director.m().w();
	}

	public void a(String paramString, XmlPullParser paramXmlPullParser) {
		super.a(paramString, paramXmlPullParser);
		b(true);
	}

	public void b(String paramString, XmlPullParser paramXmlPullParser) {
		// try
		// {
		// if (paramString.equalsIgnoreCase("room"))
		// this.b = IntegerUtil.a(j());
		// while (true)
		// {
		// super.b(paramString, paramXmlPullParser);
		// return;
		// if (!paramString.equalsIgnoreCase("enabled"))
		// break;
		// this.a.b = BooleanUtil.a(j());
		// }
		// }
		// catch (Exception localObject)
		// {
		// while (true)
		// {
		// Ln.e(localException);
		// continue;
		// if (paramString.equalsIgnoreCase("scene_id"))
		// {
		// this.a.a = j();
		// continue;
		// }
		// if (!paramString.equalsIgnoreCase("time"))
		// continue;
		// Object localObject = j();
		// if (localObject == null)
		// continue;
		// localObject = ((String)localObject).split(":");
		// if (localObject.length > 0)
		// this.a.c = localObject[0];
		// if (localObject.length <= 1)
		// continue;
		// this.a.d = localObject[1];
		// }
		// }
	}

	public void b(XmlPullParser paramXmlPullParser) {
		super.b(paramXmlPullParser);
		this.a = new WakeupControls.WakeupSetting();
		this.b = -1;
	}

	public void c(XmlPullParser paramXmlPullParser) {
		try {
			if (this.b != -1) {
				DirectorWakeupControls localDirectorWakeupControls = a();
				localDirectorWakeupControls.a(this.a, this.b);
				localDirectorWakeupControls.a(this.b, false);
				localDirectorWakeupControls.b(this.b, false);
			}
			super.c(paramXmlPullParser);
			return;
		} catch (Exception localException) {
			while (true)
				Ln.e(localException);
		}
	}
}
