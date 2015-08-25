package com.zd.model.parser;

import org.xmlpull.v1.XmlPullParser;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.zd.model.CustomButtonScreen;
import com.zd.model.Director;
import com.zd.model.DirectorCustomButton;

public class CustomButtonsParser extends ResponseParser {

	@Inject
	private Provider<DirectorCustomButton> _customButtonProvider;

	@Inject
	protected Provider<Director> _directorProvider;
	private CustomButtonScreen a = null;
	private DirectorCustomButton b = null;

	public void a(String paramString, XmlPullParser paramXmlPullParser) {
		super.a(paramString, paramXmlPullParser);
		if (!paramString.equalsIgnoreCase("screen")) {
			if (!paramString.equalsIgnoreCase("button")) {
				if ((!paramString.equalsIgnoreCase("id"))
						&& (!paramString.equalsIgnoreCase("name"))
						&& (!paramString.equalsIgnoreCase("title")))
					b(true);
				else
					b(true);
			} else {
				this.b = ((DirectorCustomButton) this._customButtonProvider
						.get());
				b(true);
			}
		} else {
			this.a = new CustomButtonScreen();
			this.a.b(Integer.parseInt(paramXmlPullParser.getAttributeValue(
					null, "roomid")));
			b(true);
		}
	}

	public void b(String paramString, XmlPullParser paramXmlPullParser) {
		// try
		// {
		// if (paramString.equalsIgnoreCase("screen"))
		// {
		// if (this.a != null)
		// {
		// SQLiteDatabase localSQLiteDatabase =
		// ((Director)this._directorProvider.a()).p();
		// ContentValues localContentValues1 = new ContentValues(3);
		// localContentValues1.put("screen_id", new Integer(this.a.a()));
		// localContentValues1.put("name", this.a.b());
		// localContentValues1.put("room_id", Integer.valueOf(this.a.c()));
		// long l1 = localSQLiteDatabase.insert("custom_button_screens", null,
		// localContentValues1);
		// if (l1 < 0L)
		// Ln.e("Unable to insert custom button screen " + this.a.b() +
		// " into the DB.  " + l1, new Object[0]);
		// int j = this.a.d();
		// i = 0;
		// if (i < j)
		// {
		// CustomButton localCustomButton = this.a.c(i);
		// ContentValues localContentValues2 = new ContentValues(5);
		// localContentValues2.put("room_id", new Integer(this.a.c()));
		// localContentValues2.put("button_id", new
		// Integer(localCustomButton.a()));
		// localContentValues2.put("name", localCustomButton.b());
		// localContentValues2.put("button_screen_id", new Integer(this.a.a()));
		// localContentValues2.put("title", localCustomButton.c());
		// long l2 = localSQLiteDatabase.insert("custom_buttons", null,
		// localContentValues2);
		// if (l2 >= 0L)
		// break label571;
		// Ln.e("Unable to insert custom button " + localCustomButton.b() +
		// " into the DB.  " + l2, new Object[0]);
		// break label571;
		// }
		// }
		// }
		// else
		// {
		// if (!paramString.equalsIgnoreCase("button"))
		// break label402;
		// if ((this.b != null) && (this.a != null))
		// this.a.a(this.b);
		// this.b = null;
		// }
		// while (true)
		// {
		// super.b(paramString, paramXmlPullParser);
		// return;
		// label402: if (!paramString.equalsIgnoreCase("id"))
		// break label481;
		// if (this.b == null)
		// break;
		// this.b.a(Integer.parseInt(this.q.toString()));
		// }
		// }
		// catch (Exception localException)
		// {
		// while (true)
		// {
		// int i;
		// Ln.e(localException.toString(), new Object[0]);
		// continue;
		// if (this.a == null)
		// continue;
		// this.a.a(Integer.parseInt(this.q.toString()));
		// continue;
		// label481: if (paramString.equalsIgnoreCase("name"))
		// {
		// if (this.b != null)
		// {
		// this.b.a(this.q.toString());
		// continue;
		// }
		// if (this.a == null)
		// continue;
		// this.a.a(this.q.toString());
		// continue;
		// }
		// if ((!paramString.equalsIgnoreCase("title")) || (this.b == null))
		// continue;
		// this.b.b(this.q.toString());
		// continue;
		// label571: i++;
		// }
		// }
	}

	public void b(XmlPullParser paramXmlPullParser) {
		super.b(paramXmlPullParser);
		this.a = null;
		this.b = null;
	}
}
