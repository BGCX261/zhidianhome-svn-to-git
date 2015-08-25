package com.zd.model;

import java.io.Flushable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Vector;

import roboguice.util.Ln;

public class CustomButtonScreen implements Flushable {
	private int a = -1;
	private String b = null;
	private int c = -1;
	private Vector<CustomButton> d = new Vector();
	private HashMap<String, CustomButton> e = new HashMap();

	public int a() {
		return this.a;
	}

	public void a(int paramInt) {
		this.a = paramInt;
	}

	public void a(CustomButton paramCustomButton) {
		if (paramCustomButton != null) {
			if (this.d == null)
				this.d = new Vector();
			if (this.e == null)
				this.e = new HashMap();
			if (b(paramCustomButton.c()) == null) {
				paramCustomButton.b(this.a);
				this.d.add(paramCustomButton);
				this.e.put(paramCustomButton.c(), paramCustomButton);
			}
		}
	}

	public void a(String paramString) {
		this.b = paramString;
	}

	public CustomButton b(String paramString) {
		return (CustomButton) this.e.get(paramString);
	}

	public String b() {
		return this.b;
	}

	public void b(int paramInt) {
		this.c = paramInt;
	}

	public int c() {
		return this.c;
	}

	public CustomButton c(int paramInt) {
		CustomButton localObject2 = null;
		if (paramInt >= 0)
			;

		try {
			if (paramInt < d()) {
				CustomButton localCustomButton = (CustomButton) this.d
						.elementAt(paramInt);
				localObject2 = localCustomButton;
				return localObject2;
			}
		} catch (Exception localException) {
			Ln.e(localException);
		}
		return null;

	}

	public int d() {
		return this.d.size();
	}

	public void j() {
		// Iterator localIterator;
		// if (this.d != null)
		// localIterator = this.d.iterator();
		//
		// if (!localIterator.hasNext())
		// {
		// this.d.clear();
		// if (this.e != null)
		// this.e.clear();
		// return;
		// }
		// ((CustomButton)localIterator.next()).j();

	}

	@Override
	public void flush() throws IOException {
		// TODO Auto-generated method stub

	}
}

/*
 * Location: E:\去哪儿\com.control4.myhome-2\classes_dex2jar.jar Qualified Name:
 * com.control4.director.data.CustomButtonScreen JD-Core Version: 0.6.0
 */