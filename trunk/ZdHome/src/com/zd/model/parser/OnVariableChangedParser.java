package com.zd.model.parser;

import java.util.HashMap;

import org.xmlpull.v1.XmlPullParser;

import com.zd.model.Variable;

public class OnVariableChangedParser extends ResponseParser {
	protected Variable a;
	protected String b;
	protected String c;
	protected boolean d;
	protected StringBuilder e;
	protected boolean f;
	protected boolean g = false;

	public Variable a() {
		return this.a;
	}

	public void a(String paramString, XmlPullParser paramXmlPullParser) {
		String str1;
		if (this.q.length() <= 0)
			str1 = null;
		else
			str1 = this.q.toString();
		super.a(paramString, paramXmlPullParser);
		if (!paramString.equalsIgnoreCase("param")) {
			if (this.f) {
				if ((str1 == null) && (this.e == null))
					this.e = new StringBuilder("");
				StringBuilder localStringBuilder = new StringBuilder("<");
				localStringBuilder.append(paramString);
				int j = paramXmlPullParser.getAttributeCount();
				for (int i = 0;; i++) {
					if (i >= j) {
						localStringBuilder.append(">");
						if (this.e == null) {
							this.e = new StringBuilder(
									localStringBuilder.toString());
							break;
						}
						this.e.append(localStringBuilder.toString());
						break;
					}
					String str2 = paramXmlPullParser.getAttributeName(i);
					String str3 = paramXmlPullParser.getAttributeValue(i);
					localStringBuilder.append(" ");
					localStringBuilder.append(str2);
					localStringBuilder.append("=\"");
					localStringBuilder.append(str3);
					localStringBuilder.append("\"");
				}
			}
		} else {
			this.b = paramXmlPullParser.getAttributeValue(null, "name");
			this.c = paramXmlPullParser.getAttributeValue(null, "type");
			this.d = true;
			b(true);
			if ((this.c != null)
					&& ((this.c.equalsIgnoreCase("xml"))
							|| (this.c.equals("13")) || (this.c.equals("10"))))
				this.f = true;
		}
		b(true);
	}

	public void b(String paramString, XmlPullParser paramXmlPullParser) {
		Object localObject;
		if (!paramString.equalsIgnoreCase("param")) {
			if ((this.d)
					&& (this.c != null)
					&& ((this.c.equalsIgnoreCase("xml"))
							|| (this.c.equalsIgnoreCase("13")) || (this.c
								.equalsIgnoreCase("10")))) {
				localObject = this.a.j();
				if (localObject == null) {
					localObject = new HashMap();
					this.a.a((HashMap) localObject);
				}
				((HashMap) localObject).put(paramString, this.q.toString());
				if (this.f) {
					localObject = "";
					if (this.q.length() > 0)
						localObject = this.q.toString();
					localObject = new StringBuilder((String) localObject);
					((StringBuilder) localObject).append("</");
					((StringBuilder) localObject).append(paramString);
					((StringBuilder) localObject).append(">");
					if (this.e == null)
						this.e = new StringBuilder(
								((StringBuilder) localObject).toString());
					else
						this.e.append(((StringBuilder) localObject).toString());
					b(false);
				}
			}
		} else {
			if ((this.a != null) && (this.b != null))
				if (!this.b.equalsIgnoreCase("iddevice")) {
					if (!this.b.equalsIgnoreCase("idvariable")) {
						if (!this.b.equalsIgnoreCase("value")) {
							if (!this.b.equalsIgnoreCase("type")) {
								if (this.b.equalsIgnoreCase("data")) {
									localObject = this.a.e();
									if ((localObject == null)
											|| (((String) localObject).length() == 0))
										this.a.c(this.c);
									this.a.b(this.q.toString());
								}
							} else
								this.a.c(this.q.toString());
						} else
							this.a.b(this.q.toString());
					} else if (this.q.length() > 0)
						this.a.a(Integer.parseInt(this.q.toString()));
				} else if (this.q.length() > 0)
					this.a.b(Integer.parseInt(this.q.toString()));
			this.d = false;
			this.f = false;
		}
		super.b(paramString, paramXmlPullParser);
	}

	public void b(XmlPullParser paramXmlPullParser) {
		super.b(paramXmlPullParser);
		this.a = new Variable();
		this.e = null;
		this.f = false;
		this.d = false;
	}

	public void c(XmlPullParser paramXmlPullParser) {
		// if ((!this.g) && (this.a != null))
		// {
		// Object localObject1 = this.a.e();
		// if ((this.e != null) && (this.e.length() > 0) && (localObject1 !=
		// null) && ((((String)localObject1).equalsIgnoreCase("xml")) ||
		// (((String)localObject1).equals("13")) ||
		// (((String)localObject1).equals("10"))))
		// this.a.b(this.e.toString());
		// if (this._director != null)
		// {
		// localObject1 = this._director.m();
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
		// Ln.a("Updating location on variable change: " + localObject1, new
		// Object[0]);
		// ((DirectorLocation)localObject1).a(this.a, false);
		// this.g = true;
		// }
		// }
		// else
		// {
		// Ln.a("Updating device on variable change: " + localObject2, new
		// Object[0]);
		// ((DirectorDevice)localObject2).a(this.a, false);
		// this.g = true;
		// }
		// }
		// }
		// else
		// {
		// localObject1 = this._director.K();
		// if (localObject1 != null)
		// {
		// ((Control4Rhapsody)localObject1).a(this.a, false);
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
 * com.control4.director.parser.OnVariableChangedParser JD-Core Version: 0.6.0
 */