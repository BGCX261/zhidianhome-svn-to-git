package com.zd.model.parser;

import org.xmlpull.v1.XmlPullParser;

public class OnDataToUIParser extends OnVariableChangedParser {
	public void c(XmlPullParser paramXmlPullParser) {
		// if ((!this.g) && (this.a != null))
		// {
		// if ((this.a.c() == null) || (this.a.c().length() == 0))
		// this.a.b(this.e.toString());
		// if (this._director != null)
		// {
		// Object localObject1 = this._director.m();
		// if (this.a.d() != 100119)
		// {
		// if (localObject1 != null)
		// {
		// Object localObject2 = this._director.p();
		// localObject2 = (DirectorDevice)((Project)localObject1).b(this.a.d(),
		// true, (SQLiteDatabase)localObject2);
		// if (localObject2 == null)
		// {
		// localObject1 =
		// (DirectorLocation)((Project)localObject1).n(this.a.d());
		// if (localObject1 != null)
		// {
		// ((DirectorLocation)localObject1).b(this.a, false);
		// this.g = true;
		// }
		// }
		// else
		// {
		// ((DirectorDevice)localObject2).b(this.a, false);
		// this.g = true;
		// }
		// }
		// }
		// else
		// {
		// localObject1 = this._director.K();
		// if (localObject1 != null)
		// {
		// ((Control4Rhapsody)localObject1).b(this.a, false);
		// this.g = true;
		// }
		// }
		// }
		// }
		super.c(paramXmlPullParser);
	}
}

/*
 * Location: E:\去哪儿\com.control4.myhome-2\classes_dex2jar.jar Qualified Name:
 * com.control4.director.parser.OnDataToUIParser JD-Core Version: 0.6.0
 */