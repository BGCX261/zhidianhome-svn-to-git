package com.zd.model.parser;

import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;

import roboguice.util.Ln;

import com.google.inject.Inject;
import com.zd.model.Control4Director;
import com.zd.model.Director;
import com.zd.model.command.Command;

public class ResponseParser extends DefaultHandler {

	@Inject
	protected Control4Director _director;
	private boolean a;
	protected String l = null;
	protected int m = 0;
	protected int n = 0;
	protected long o = -1L;
	protected Command p = null;
	protected StringBuilder q;
	protected boolean r;
	protected StringBuilder s;
	protected Command.NotificationListener t;

	public static int a(String paramString) {
		int i = 0;
		if (paramString != null)
			if (!paramString.equalsIgnoreCase("GetVariable")) {
				if (!paramString.equalsIgnoreCase("OnVariableChanged")) {
					if (!paramString.equalsIgnoreCase("OnDataToUI")) {
						if (!paramString.equalsIgnoreCase("OnAlive")) {
							if (!paramString
									.equalsIgnoreCase("OnDeviceOffline")) {
								if (!paramString
										.equalsIgnoreCase("SendToDevice")) {
									if (!paramString
											.equalsIgnoreCase("GetVersionInfo")) {
										if (!paramString
												.equalsIgnoreCase("GetItems")) {
											if (!paramString
													.equalsIgnoreCase("AuthenticateLicensedDevice")) {
												if (!paramString
														.equalsIgnoreCase("IdentifyLicensedDevice")) {
													if (!paramString
															.equalsIgnoreCase("OnMediaZoneChanged")) {
														if (!paramString
																.equalsIgnoreCase("OnMediaZoneAdded")) {
															if (!paramString
																	.equalsIgnoreCase("OnMediaZoneRemoved")) {
																if (paramString
																		.equalsIgnoreCase("SendToZoneManager"))
																	i = 40;
															} else
																i = 43;
														} else
															i = 41;
													} else
														i = 42;
												} else
													i = 45;
											} else
												i = 44;
										} else
											i = 2;
									} else
										i = 1;
								} else
									i = 11;
							} else
								i = 8;
						} else
							i = 7;
					} else
						i = 6;
				} else
					i = 5;
			} else
				i = 4;
		return i;
	}

	public void a(int paramInt) {
		this.m = paramInt;
	}

	public void a(long paramLong) {
		this.o = paramLong;
	}

	public void a(Control4Director paramControl4Director) {
		this._director = paramControl4Director;
	}

	public void a(Command.NotificationListener paramNotificationListener) {
		this.t = paramNotificationListener;
	}

	public void a(Command paramCommand) {
		this.p = paramCommand;
	}

	public void a(String paramString, XmlPullParser paramXmlPullParser) {
		// int i = 0;
		// Object localObject;
		// if ((!paramString.equalsIgnoreCase("c4soap")) &&
		// (!paramString.equalsIgnoreCase("C4SoapResponse")))
		// {
		// b(i);
		// }
		// else
		// {
		// this.l = paramXmlPullParser.getAttributeValue(null, "name");
		// i();
		// localObject = paramXmlPullParser.getAttributeValue(null, "result");
		// if (localObject != null)
		// this.n = IntegerUtil.a((String)localObject);
		// localObject = paramXmlPullParser.getAttributeValue(null, "seq");
		// if ((localObject != null) && (((String)localObject).length() > 0))
		// this.o = new Integer((String)localObject).intValue();
		// }
		// int j;
		// if ((this.a) && (this.s != null))
		// {
		// localObject = new StringBuilder("<");
		// ((StringBuilder)localObject).append(paramString);
		// j = paramXmlPullParser.getAttributeCount();
		// }
		//
		// if (i >= j)
		// {
		// ((StringBuilder)localObject).append(">");
		// this.s.append(((StringBuilder)localObject).toString());
		// return;
		// }
		// ((StringBuilder)localObject).append(" ");
		// ((StringBuilder)localObject).append(paramXmlPullParser.getAttributeName(i));
		// ((StringBuilder)localObject).append("= \"");
		// ((StringBuilder)localObject).append(paramXmlPullParser.getAttributeValue(i));
		// ((StringBuilder)localObject).append("\"");
		// i++;

	}

	// ERROR //
	public void a(XmlPullParser paramXmlPullParser) {
		// Byte code:
		// 0: aload_0
		// 1: getfield 165 com/control4/director/parser/ResponseParser:q
		// Ljava/lang/StringBuilder;
		// 4: ifnonnull +16 -> 20
		// 7: aload_0
		// 8: new 130 java/lang/StringBuilder
		// 11: dup
		// 12: ldc 167
		// 14: invokespecial 133 java/lang/StringBuilder:<init>
		// (Ljava/lang/String;)V
		// 17: putfield 165 com/control4/director/parser/ResponseParser:q
		// Ljava/lang/StringBuilder;
		// 20: aload_0
		// 21: iconst_0
		// 22: putfield 169 com/control4/director/parser/ResponseParser:r Z
		// 25: aload_0
		// 26: aload_1
		// 27: invokevirtual 171 com/control4/director/parser/ResponseParser:b
		// (Lorg/xmlpull/v1/XmlPullParser;)V
		// 30: aload_1
		// 31: invokeinterface 174 1 0
		// 36: istore_2
		// 37: iload_2
		// 38: istore_2
		// 39: iload_2
		// 40: iconst_1
		// 41: if_icmpeq +74 -> 115
		// 44: iload_2
		// 45: iconst_2
		// 46: if_icmpne +32 -> 78
		// 49: aload_1
		// 50: invokeinterface 177 1 0
		// 55: astore_3
		// 56: aload_3
		// 57: ifnull +9 -> 66
		// 60: aload_0
		// 61: aload_3
		// 62: aload_1
		// 63: invokevirtual 179 com/control4/director/parser/ResponseParser:a
		// (Ljava/lang/String;Lorg/xmlpull/v1/XmlPullParser;)V
		// 66: aload_1
		// 67: invokeinterface 182 1 0
		// 72: istore_2
		// 73: iload_2
		// 74: istore_2
		// 75: goto -36 -> 39
		// 78: iload_2
		// 79: iconst_3
		// 80: if_icmpne +54 -> 134
		// 83: aload_1
		// 84: invokeinterface 177 1 0
		// 89: astore 4
		// 91: aload 4
		// 93: ifnull -27 -> 66
		// 96: aload_0
		// 97: aload 4
		// 99: aload_1
		// 100: invokevirtual 184 com/control4/director/parser/ResponseParser:b
		// (Ljava/lang/String;Lorg/xmlpull/v1/XmlPullParser;)V
		// 103: aload 4
		// 105: ldc 87
		// 107: invokevirtual 49 java/lang/String:equalsIgnoreCase
		// (Ljava/lang/String;)Z
		// 110: istore_3
		// 111: iload_3
		// 112: ifeq +9 -> 121
		// 115: aload_0
		// 116: aload_1
		// 117: invokevirtual 187 com/control4/director/parser/ResponseParser:c
		// (Lorg/xmlpull/v1/XmlPullParser;)V
		// 120: return
		// 121: aload 4
		// 123: ldc 89
		// 125: invokevirtual 49 java/lang/String:equalsIgnoreCase
		// (Ljava/lang/String;)Z
		// 128: ifeq -62 -> 66
		// 131: goto -16 -> 115
		// 134: iload_2
		// 135: iconst_4
		// 136: if_icmpne -70 -> 66
		// 139: aload_0
		// 140: aload_1
		// 141: invokevirtual 190 com/control4/director/parser/ResponseParser:d
		// (Lorg/xmlpull/v1/XmlPullParser;)V
		// 144: goto -78 -> 66
		// 147: astore_3
		// 148: aload_3
		// 149: invokestatic 196 roboguice/util/Ln:e (Ljava/lang/Throwable;)I
		// 152: pop
		// 153: goto -87 -> 66
		// 156: astore_2
		// 157: aload_2
		// 158: invokestatic 196 roboguice/util/Ln:e (Ljava/lang/Throwable;)I
		// 161: pop
		// 162: goto -47 -> 115
		// 165: astore_3
		// 166: aload_3
		// 167: invokevirtual 199
		// org/xmlpull/v1/XmlPullParserException:getMessage ()Ljava/lang/String;
		// 170: astore 4
		// 172: aload 4
		// 174: ldc 201
		// 176: invokevirtual 204 java/lang/String:startsWith
		// (Ljava/lang/String;)Z
		// 179: ifne -140 -> 39
		// 182: aload 4
		// 184: ldc 206
		// 186: invokevirtual 204 java/lang/String:startsWith
		// (Ljava/lang/String;)Z
		// 189: ifne -150 -> 39
		// 192: aload 4
		// 194: ldc 208
		// 196: invokevirtual 212 java/lang/String:contains
		// (Ljava/lang/CharSequence;)Z
		// 199: ifne -160 -> 39
		// 202: aload_3
		// 203: new 130 java/lang/StringBuilder
		// 206: dup
		// 207: invokespecial 213 java/lang/StringBuilder:<init> ()V
		// 210: ldc 215
		// 212: invokevirtual 137 java/lang/StringBuilder:append
		// (Ljava/lang/String;)Ljava/lang/StringBuilder;
		// 215: aload_0
		// 216: invokevirtual 218 java/lang/StringBuilder:append
		// (Ljava/lang/Object;)Ljava/lang/StringBuilder;
		// 219: invokevirtual 146 java/lang/StringBuilder:toString
		// ()Ljava/lang/String;
		// 222: iconst_0
		// 223: anewarray 220 java/lang/Object
		// 226: invokestatic 223 roboguice/util/Ln:e
		// (Ljava/lang/Throwable;Ljava/lang/Object;[Ljava/lang/Object;)I
		// 229: pop
		// 230: goto -191 -> 39
		//
		// Exception table:
		// from to target type
		// 49 66 147 java/lang/Exception
		// 83 111 147 java/lang/Exception
		// 121 144 147 java/lang/Exception
		// 0 37 156 org/xmlpull/v1/XmlPullParserException
		// 49 66 156 org/xmlpull/v1/XmlPullParserException
		// 83 111 156 org/xmlpull/v1/XmlPullParserException
		// 121 144 156 org/xmlpull/v1/XmlPullParserException
		// 148 153 156 org/xmlpull/v1/XmlPullParserException
		// 166 230 156 org/xmlpull/v1/XmlPullParserException
		// 66 73 165 org/xmlpull/v1/XmlPullParserException
	}

	public void a(boolean paramBoolean) {
		this.a = paramBoolean;
	}

	public Director b() {
		return this._director;
	}

	public void b(int paramInt) {
		this.n = paramInt;
	}

	public void b(String paramString) {
		this.l = paramString;
	}

	public void b(String paramString, XmlPullParser paramXmlPullParser) {
		try {
			if ((this.a) && (this.s != null)) {
				this.s.append("</");
				this.s.append(paramString);
				this.s.append(">");
			}
			this.q.setLength(0);
			return;
		} catch (Exception localException) {
			while (true)
				Ln.e(localException);
		}
	}

	public void b(XmlPullParser paramXmlPullParser) {
		if (this.q != null)
			this.q.setLength(0);
		else
			this.q = new StringBuilder();
		this.r = false;
		if (this.a)
			this.s = new StringBuilder();
	}

	protected void b(boolean paramBoolean) {
		this.r = paramBoolean;
		this.q.setLength(0);
	}

	public Command.NotificationListener c() {
		return this.t;
	}

	protected void c(String paramString) {
		try {
			if (this.t != null)
				this.t.a(paramString);
			return;
		} catch (Exception localException) {
			while (true)
				Ln.e(localException,
						"Exception on calling notification listener onUpdate",
						new Object[0]);
		}
	}

	public void c(XmlPullParser paramXmlPullParser) {
		// if ((this.a) && (this.s != null) && (this.s.length() > 0))
		// Ln.a("RECEIVED: " + this.s.toString(), new Object[0]);
	}

	public String d() {
		return this.l;
	}

	public void d(XmlPullParser paramXmlPullParser) {
		String str = null;
		try {
			if (this.r) {
				str = paramXmlPullParser.getText();
				this.q.append(str);
			}
			if ((this.a) && (this.s != null)) {
				if (str == null)
					str = paramXmlPullParser.getText();
				if (str != null)
					this.s.append(str);
			}
			return;
		} catch (Exception localException) {
			while (true)
				Ln.e(localException);
		}
	}

	public int e() {
		return this.m;
	}

	public int f() {
		return this.n;
	}

	public long g() {
		return this.o;
	}

	public Command h() {
		return this.p;
	}

	public void i() {
		this.m = a(this.l);
	}

	protected String j() {
		String str;
		if ((this.q == null) || (this.q.length() <= 0))
			str = null;
		else
			str = this.q.toString();
		return str;
	}

	protected void k() {
		try {
			if (this.t != null)
				this.t.a();
			return;
		} catch (Exception localException) {

			Ln.e(localException,
					"Exception on calling notification listener onStart",
					new Object[0]);
		}
	}

	protected void l() {
		try {
			if (this.t != null)
				this.t.b();
			return;
		} catch (Exception localException) {
			while (true)
				Ln.e(localException,
						"Exception on calling notification listener onComplete",
						new Object[0]);
		}
	}
}
