package com.zd.model.device;

import java.util.ArrayList;

public abstract interface XMTuner extends Tuner {
	public class XMCategory {
		public String a;
		public String b;
	}

	public class XMChannel {
		public String a;
		public String b;
		public String c;
	}

	public abstract int A_();

	public abstract XMTuner.XMCategory a(String paramString);

	public abstract XMTuner.XMCategory b(int paramInt);

	public abstract XMTuner.XMChannel b(String paramString);

	public abstract XMTuner.XMChannel c(int paramInt);

	public abstract ArrayList<XMTuner.XMChannel> c(String paramString);

	public abstract String r();

	public abstract int w();
}

/*
 * Location: E:\去哪儿\com.control4.myhome-2\classes_dex2jar.jar Qualified Name:
 * com.control4.director.device.XMTuner JD-Core Version: 0.6.0
 */