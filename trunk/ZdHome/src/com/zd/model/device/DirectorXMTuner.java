package com.zd.model.device;

import java.util.ArrayList;

import com.zd.model.HashIndex;
import com.zd.model.Variable;

public class DirectorXMTuner extends DirectorTuner implements XMTuner {
	private static final int t = 1001;
	private static final int u = 1004;
	private static final int v = 1005;
	private static final int w = 1006;
	private static final int x = 1007;
	private static final int y = 1008;
	private HashIndex<String, XMTuner.XMCategory> A;
	private HashIndex<String, XMTuner.XMChannel> B;
	private HashIndex<String, XMTuner.XMChannel> C;
	private String z;

	private void e(String paramString) {
		this.z = paramString;
	}

	public int A_() {
		int i;
		if (this.B == null)
			i = 0;
		else
			i = this.B.c();
		return i;
	}

	public Device.DeviceType getType() {
		return Device.DeviceType.x;
	}

	public XMTuner.XMCategory a(String paramString) {
		XMTuner.XMCategory localXMCategory;
		if (this.A == null)
			localXMCategory = null;
		else
			localXMCategory = (XMTuner.XMCategory) this.A.a(paramString);
		return localXMCategory;
	}

	public void a(Variable paramVariable, boolean paramBoolean) {
		// if (paramVariable == null)
		// label4: return;
		// int i = 1;
		// while (true)
		// {
		// try
		// {
		// switch (paramVariable.b())
		// {
		// case 1001:
		// if ((i == 0) || (this.j == null))
		// break label4;
		// this.j.a(this);
		// case 1004:
		// case 1008:
		// case 1005:
		// case 1006:
		// case 1007:
		// case 1002:
		// case 1003:
		// }
		// }
		// catch (Exception localException)
		// {
		// Ln.e(localException);
		// }
		// break;
		// Ln.a("XM Tuner (" + u() + ") retrieved last channel: " +
		// paramVariable, new Object[0]);
		// d(paramVariable.c());
		// continue;
		// Object localObject2 = paramVariable.f("artist");
		// Object localObject1 = paramVariable.f("title");
		// String str1 = paramVariable.f("name");
		// String str2 = paramVariable.f("channel");
		// d_((String)localObject2);
		// c_(str1);
		// b_((String)localObject1);
		// d(str2);
		// continue;
		// e(paramVariable.c());
		// continue;
		// paramVariable.f("channel");
		// localObject1 = paramVariable.f("name");
		// paramVariable.f("category");
		// c_((String)localObject1);
		// continue;
		// if (this.B != null)
		// this.B.d();
		// localObject2 = new DirectorXMTuner.XMChannelsParser(this);
		// localObject1 = XmlPullParserFactory.newInstance().newPullParser();
		// ((XmlPullParser)localObject1).setInput(new
		// StringReader(paramVariable.c()));
		// ((DirectorXMTuner.XMChannelsParser)localObject2).a((XmlPullParser)localObject1);
		// continue;
		// if (this.A != null)
		// this.A.d();
		// localObject2 = new DirectorXMTuner.XMCategoriesParser(this);
		// localObject1 = XmlPullParserFactory.newInstance().newPullParser();
		// ((XmlPullParser)localObject1).setInput(new
		// StringReader(paramVariable.c()));
		// ((DirectorXMTuner.XMCategoriesParser)localObject2).a((XmlPullParser)localObject1);
		// continue;
		// int j = 0;
		// }
	}

	public void a(XMTuner.XMCategory paramXMCategory) {
		if (this.A == null)
			this.A = new HashIndex();
		this.A.a(paramXMCategory.a, paramXMCategory);
	}

	public void a(XMTuner.XMChannel paramXMChannel) {
		if (this.B == null)
			this.B = new HashIndex();
		this.B.a(paramXMChannel.a, paramXMChannel);
	}

	public XMTuner.XMCategory b(int paramInt) {
		XMTuner.XMCategory localXMCategory;
		if (this.A == null)
			localXMCategory = null;
		else
			localXMCategory = (XMTuner.XMCategory) this.A.a(paramInt);
		return localXMCategory;
	}

	public XMTuner.XMChannel b(String paramString) {
		XMTuner.XMChannel localXMChannel;
		if (this.B == null)
			localXMChannel = null;
		else
			localXMChannel = (XMTuner.XMChannel) this.B.a(paramString);
		return localXMChannel;
	}

	public void b(Variable paramVariable, boolean paramBoolean) {
		// if (paramVariable == null);
		// while (true)
		// {
		// return;
		// int i = 0;
		// try
		// {
		// int j;
		// if (paramVariable.f("current_state") != null)
		// {
		// Object localObject = paramVariable.f("xmsonginfo");
		// if ((localObject != null) && (((String)localObject).length() > 0))
		// {
		// DirectorXMTuner.XMSongInfoParser localXMSongInfoParser = new
		// DirectorXMTuner.XMSongInfoParser(this);
		// localObject = XmlPullParserFactory.newInstance().newPullParser();
		// ((XmlPullParser)localObject).setInput(new
		// StringReader(paramVariable.c()));
		// localXMSongInfoParser.a((XmlPullParser)localObject);
		// j = 1;
		// }
		// }
		// if (j == 0)
		// break label112;
		// if (this.j == null)
		// continue;
		// this.j.a(this);
		// }
		// catch (Exception localException)
		// {
		// Ln.e(localException);
		// }
		// continue;
		// label112: super.b(paramVariable, paramBoolean);
		// }
	}

	public XMTuner.XMChannel c(int paramInt) {
		XMTuner.XMChannel localXMChannel;
		if (this.B == null)
			localXMChannel = null;
		else
			localXMChannel = (XMTuner.XMChannel) this.B.a(paramInt);
		return localXMChannel;
	}

	public ArrayList<XMTuner.XMChannel> c(String paramString) {
		// ArrayList localArrayList = new ArrayList();
		// if (paramString == null);
		// while (true)
		// {
		// return localArrayList;
		// try
		// {
		// int j = A_();
		// for (int i = 0; i < j; i++)
		// {
		// XMTuner.XMChannel localXMChannel = c(i);
		// if ((localXMChannel == null) || (localXMChannel.c == null) ||
		// (!localXMChannel.c.equals(paramString)))
		// continue;
		// localArrayList.add(localXMChannel);
		// }
		// }
		// catch (Exception localException)
		// {
		// Ln.e(localException);
		// }
		// }
		return null;
	}

	public String r() {
		return this.z;
	}

	public int w() {
		int i;
		if (this.A == null)
			i = 0;
		else
			i = this.A.c();
		return i;
	}
}

/*
 * Location: E:\去哪儿\com.control4.myhome-2\classes_dex2jar.jar Qualified Name:
 * com.control4.director.device.DirectorXMTuner JD-Core Version: 0.6.0
 */