package com.zd.model.parser;

import org.xmlpull.v1.XmlPullParser;

import com.zd.model.DeviceBinding;

public class GetBindingsByDeviceParser extends ResponseParser {
	protected DeviceBinding a;
	protected DeviceBinding.BindingClass b;
	protected boolean c;

	public void a(String paramString, XmlPullParser paramXmlPullParser) {
		// try
		// {
		// super.a(paramString, paramXmlPullParser);
		// b(true);
		// if (paramString.equalsIgnoreCase("binding"))
		// {
		// this.a = new DeviceBinding();
		// this.b = null;
		// this.c = false;
		// return;
		// }
		// if (paramString.equalsIgnoreCase("bindingclass"))
		// {
		// DeviceBinding localDeviceBinding = this.a;
		// localDeviceBinding.getClass();
		// this.b = new DeviceBinding.BindingClass(localDeviceBinding);
		// }
		// }
		// catch (Exception localException)
		// {
		// Ln.e(localException);
		// }
		// if (paramString.equalsIgnoreCase("bound"))
		// this.c = true;
	}

	public void b(String paramString, XmlPullParser paramXmlPullParser) {
		// try
		// {
		// if (paramString.equalsIgnoreCase("binding"))
		// if (this.a != null)
		// {
		// if ((this.p != null) && ((this.p instanceof RoomCommand)))
		// {
		// Object localObject = this._director.m();
		// if (localObject != null)
		// {
		// localObject =
		// (DirectorRoom)((Project)localObject).h(((RoomCommand)this.p).e());
		// if (localObject != null)
		// ((DirectorRoom)localObject).a(this.a);
		// }
		// }
		// this.a = null;
		// }
		// while (true)
		// {
		// super.b(paramString, paramXmlPullParser);
		// return;
		// if (!paramString.equalsIgnoreCase("name"))
		// break;
		// if ((this.a == null) || (this.q == null))
		// continue;
		// this.a.b(this.q.toString());
		// }
		// }
		// catch (Exception localException)
		// {
		// while (true)
		// {
		// Ln.e(localException);
		// continue;
		// if (paramString.equalsIgnoreCase("type"))
		// {
		// if ((this.a == null) || (this.q == null))
		// continue;
		// this.a.c(this.q.toString());
		// continue;
		// }
		// if (paramString.equalsIgnoreCase("deviceid"))
		// {
		// if ((this.a == null) || (this.q == null))
		// continue;
		// if (this.c)
		// {
		// this.a.b(Integer.parseInt(this.q.toString()));
		// continue;
		// }
		// this.a.a(Integer.parseInt(this.q.toString()));
		// continue;
		// }
		// if (paramString.equalsIgnoreCase("bindingid"))
		// {
		// if ((this.a == null) || (this.c) || (this.q == null))
		// continue;
		// this.a.a(this.q.toString());
		// continue;
		// }
		// if (paramString.equalsIgnoreCase("isbound"))
		// {
		// if ((this.a == null) || (this.q == null))
		// continue;
		// this.a.a(BooleanUtil.a(this.q.toString()));
		// continue;
		// }
		// if (paramString.equalsIgnoreCase("bindingclass"))
		// {
		// if ((this.a != null) && (this.b != null))
		// this.a.a(this.b);
		// this.b = null;
		// continue;
		// }
		// if (paramString.equalsIgnoreCase("class"))
		// {
		// if ((this.b == null) || (this.q == null))
		// continue;
		// this.b.a(this.q.toString());
		// continue;
		// }
		// if (paramString.equalsIgnoreCase("rank"))
		// {
		// if ((this.b == null) || (this.q == null))
		// continue;
		// this.b.a(Integer.parseInt(this.q.toString()));
		// continue;
		// }
		// if (paramString.equalsIgnoreCase("autobind"))
		// {
		// if ((this.b == null) || (this.q == null))
		// continue;
		// this.b.a(BooleanUtil.a(this.q.toString()));
		// continue;
		// }
		// if (paramString.equalsIgnoreCase("bound"))
		// {
		// this.c = false;
		// continue;
		// }
		// if ((!paramString.equalsIgnoreCase("boundclass")) || (this.a == null)
		// || (this.q == null))
		// continue;
		// this.a.d(this.q.toString());
		// }
		// }
	}

	public void b(XmlPullParser paramXmlPullParser) {
		super.b(paramXmlPullParser);
		this.c = false;
		this.b = null;
		this.a = null;
	}
}
