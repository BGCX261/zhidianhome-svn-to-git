package com.zd.model.parser;

import java.util.Vector;

import org.xmlpull.v1.XmlPullParser;

import com.zd.model.Variable;

public class GetVariableParser extends ResponseParser {
	Vector<Variable> a;
	Variable b;
	boolean c;
	String d;
	StringBuilder e;

	public Variable a() {
		return this.b;
	}

	public void a(String paramString, XmlPullParser paramXmlPullParser) {
		// Object localObject;
		// if (this.q.length() <= 0)
		// localObject = null;
		// else
		// localObject = this.q.toString();
		// super.a(paramString, paramXmlPullParser);
		// this.d = paramString;
		// if (this.e != null)
		// this.e.setLength(0);
		// else
		// this.e = new StringBuilder("");
		// String str5;
		// String str3;
		// if (!paramString.equalsIgnoreCase("variable"))
		// {
		// if ((this.c) && (this.b != null))
		// {
		// String str1 = this.b.e();
		// if ((str1 != null) && ((str1.equals("13")) || (str1.equals("10")) ||
		// (str1.equalsIgnoreCase("xml"))))
		// {
		// b(true);
		// if (localObject != null)
		// this.q.append((String)localObject);
		// localObject = new StringBuilder("<");
		// ((StringBuilder)localObject).append(paramString);
		// int i = paramXmlPullParser.getAttributeCount();
		// for (int j = 0; ; j++)
		// {
		// if (j >= i)
		// {
		// ((StringBuilder)localObject).append(">");
		// this.q.append(((StringBuilder)localObject).toString());
		// break;
		// }
		// str5 = paramXmlPullParser.getAttributeName(j);
		// str3 = paramXmlPullParser.getAttributeValue(j);
		// ((StringBuilder)localObject).append(" ");
		// ((StringBuilder)localObject).append(str5);
		// ((StringBuilder)localObject).append("=\"");
		// ((StringBuilder)localObject).append(str3);
		// ((StringBuilder)localObject).append("\"");
		// }
		// }
		// }
		// }
		// else
		// {
		// str3 = paramXmlPullParser.getAttributeValue(null, "name");
		// String str2 = paramXmlPullParser.getAttributeValue(null, "type");
		// localObject = paramXmlPullParser.getAttributeValue(null, "deviceid");
		// String str7 = paramXmlPullParser.getAttributeValue(null,
		// "variableid");
		// String str4 = paramXmlPullParser.getAttributeValue(null, "readonly");
		// String str8 = paramXmlPullParser.getAttributeValue(null, "hidden");
		// str5 = paramXmlPullParser.getAttributeValue(null, "bindingID");
		// String str6 = paramXmlPullParser.getAttributeValue(null,
		// "bindingName");
		// if (this.b == null)
		// this.b = new Variable();
		// if (this.a == null)
		// this.a = new Vector();
		// this.b.a(str3);
		// this.b.c(str2);
		// this.b.a(Integer.parseInt(str7));
		// this.b.b(Integer.parseInt((String)localObject));
		// this.b.a(BooleanUtil.a(str4));
		// this.b.b(BooleanUtil.a(str8));
		// this.b.d(str5);
		// this.b.e(str6);
		// this.a.add(this.b);
		// b(true);
		// this.c = true;
		// }
	}

	public void b(String paramString, XmlPullParser paramXmlPullParser) {

	}

	public void b(XmlPullParser paramXmlPullParser) {
		super.b(paramXmlPullParser);
		this.b = new Variable();
		this.a = null;
		this.c = false;
		this.d = null;
		this.e = null;
	}

	public void c(XmlPullParser paramXmlPullParser) {

		super.c(paramXmlPullParser);
	}

	public void d(XmlPullParser paramXmlPullParser) {
		super.d(paramXmlPullParser);
		if (this.e != null)
			this.e.append(paramXmlPullParser.getText());
	}

	public Vector<Variable> m() {
		return this.a;
	}
}
