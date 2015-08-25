package com.zd.model.parser;

import java.util.HashMap;
import java.util.Stack;
import java.util.Vector;

import org.xmlpull.v1.XmlPullParser;

import roboguice.util.Ln;
import android.app.Application;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import com.google.inject.Inject;
import com.zd.home.R;

public class GetItemsParser extends ResponseParser {
	public static final int b = 1;
	public static final int c = 2;
	public static final int d = 3;
	public static final int e = 4;
	public static final int f = 5;
	public static final int g = 6;
	public static final int h = 7;
	public static final int i = 8;
	public static final int j = 9;
	private static final String k = "GetItemsParser";
	private static final boolean u = false;
	private HashMap<String, String> A = null;
	private HashMap<String, String> B = null;
	private HashMap<String, String> C = null;
	private HashMap<String, String> D = null;
	private HashMap<String, String> E = null;
	private HashMap<String, String> F = null;
	private HashMap<String, String> G = null;
	private String H = null;
	private StringBuilder I = null;
	private boolean J = false;
	private StringBuilder K = null;
	private StringBuilder L = null;
	private StringBuilder M = null;
	private StringBuilder N = null;
	private boolean O = false;
	private Vector<String> P = null;
	private boolean Q = false;
	private String R1 = null;
	private final HashMap<String, Boolean> S = new HashMap();
	private String T = null;
	private String U = null;
	private String V = null;
	private String W = null;
	private String X = null;
	private String Y = null;
	private String Z = null;

	@Inject
	private Application _context;

	@Inject
	private CustomButtonsParser _customButtonsParser;

	@Inject
	private LightingScenesParser _lightingScenesParser;

	@Inject
	private RoomStateXMLParser _roomStateParser;
	public SQLiteDatabase a = null;
	private ContentValues aa = new ContentValues();
	private SQLiteStatement ab = null;
	private SQLiteStatement ac = null;
	private SQLiteStatement ad = null;
	private boolean ae = false;
	private boolean af = true;
	private int ag;
	private boolean ah;
	private boolean ai = false;
	private HashMap<String, String> aj;
	private String ak;
	private String al;
	private boolean v = true;
	private String w = null;
	private HashMap<String, String> x = null;
	private Stack<HashMap<String, String>> y = new Stack();
	private HashMap<String, String> z = null;

	private void B() {
		try {
			this.S.put("capabilities", Boolean.valueOf(true));
			this.S.put("state", Boolean.valueOf(true));
			this.S.put("name", Boolean.valueOf(true));
			this.S.put("id", Boolean.valueOf(true));
			this.S.put("type", Boolean.valueOf(true));
			this.S.put("proxy", Boolean.valueOf(true));
			this.S.put("navigator_categories", Boolean.valueOf(true));
			this.S.put("category", Boolean.valueOf(true));
			this.S.put("driver", Boolean.valueOf(true));
			this.S.put("control", Boolean.valueOf(true));
			this.S.put("zipcode", Boolean.valueOf(true));
			this.S.put("latitude", Boolean.valueOf(true));
			this.S.put("longitude", Boolean.valueOf(true));
			this.S.put("item", Boolean.valueOf(true));
			this.S.put("irsection", Boolean.valueOf(true));
			this.S.put("search_types", Boolean.valueOf(true));
			this.S.put("states", Boolean.valueOf(true));
			this.S.put("serialsection", Boolean.valueOf(true));
			this.S.put("devicedata", Boolean.valueOf(true));
			this.S.put("connections", Boolean.valueOf(true));
			this.S.put("config_data_file", Boolean.valueOf(true));
			this.S.put("proxies", Boolean.valueOf(true));
			return;
		} catch (Exception localException) {
			Ln.e(localException);
		}
	}

	protected int A() {
		int m;
		if ((this.x != null) && (!this.Q)) {
			String str = (String) this.x.get("type");
			if ((str == null) || (str.length() <= 0))
				m = -1;
			else
				m = Integer.parseInt(str);
		} else {
			m = -1;
		}
		return m;
	}

	public SQLiteDatabase a() {
		return this.a;
	}

	public void a(SQLiteDatabase paramSQLiteDatabase) {
		this.a = paramSQLiteDatabase;
	}

	public void a(CustomButtonsParser paramCustomButtonsParser) {
		this._customButtonsParser = paramCustomButtonsParser;
	}

	public void a(LightingScenesParser paramLightingScenesParser) {
		this._lightingScenesParser = paramLightingScenesParser;
	}

	public void a(RoomStateXMLParser paramRoomStateXMLParser) {
		this._roomStateParser = paramRoomStateXMLParser;
	}

	public void a(String paramString, XmlPullParser paramXmlPullParser) {
		super.a(paramString, paramXmlPullParser);
		b(false);
		if (!this.Q) {
			this.w = paramString;
			if ((this.J) || (this.O) || (this.S.get(paramString) != null)) {
				if (!paramString.equalsIgnoreCase("capabilities")) {
					if ((this.G == null) || (!this.J)) {
						String str1;
						String str2;
						if (!paramString.equalsIgnoreCase("state")) {
							if (!paramString.equalsIgnoreCase("name")) {
								if (!paramString.equalsIgnoreCase("proxies")) {
									if ((!paramString.equalsIgnoreCase("id"))
											&& (!paramString
													.equalsIgnoreCase("type"))
											&& (!paramString
													.equalsIgnoreCase("config_data_file"))) {
										if (!paramString
												.equalsIgnoreCase("proxy")) {
											if (!paramString
													.equalsIgnoreCase("devicedata")) {
												if (!paramString
														.equalsIgnoreCase("navigator_categories")) {
													if (!paramString
															.equalsIgnoreCase("category")) {
														if (!paramString
																.equalsIgnoreCase("driver")) {
															if (!paramString
																	.equalsIgnoreCase("control")) {
																if ((!paramString
																		.equalsIgnoreCase("zipcode"))
																		&& (!paramString
																				.equalsIgnoreCase("latitude"))
																		&& (!paramString
																				.equalsIgnoreCase("longitude"))) {
																	if (!paramString
																			.equalsIgnoreCase("item")) {
																		if ((!paramString
																				.equalsIgnoreCase("irsection"))
																				&& (!paramString
																						.equalsIgnoreCase("search_types"))
																				&& (!paramString
																						.equalsIgnoreCase("states"))
																				&& (!paramString
																						.equalsIgnoreCase("serialsection"))
																				&& (!paramString
																						.equalsIgnoreCase("connections"))) {
																			b(false);
																		} else {
																			this.Q = true;
																			this.R1 = paramString;
																		}
																	} else {
																		this.x = new HashMap();
																		this.y.push(this.x);
																	}
																} else
																	b(true);
															} else
																b(true);
														} else {
															b(true);
															this.U = paramXmlPullParser
																	.getAttributeValue(
																			null,
																			"name");
														}
													} else if (this.O)
														b(true);
												} else {
													this.O = false;
													b(true);
													this.P = new Vector();
												}
											} else
												this.ae = true;
										} else {
											b(true);
											if (this.ai) {
												str1 = paramXmlPullParser
														.getAttributeValue(
																null, "name");
												str2 = paramXmlPullParser
														.getAttributeValue(
																null,
																"proxybindingid");
												this.ak = str1;
												this.al = str2;
											}
										}
									} else
										b(true);
								} else {
									this.ai = true;
									this.aj = new HashMap();
									b(true);
								}
							} else if (!this.ae)
								b(true);
						} else if (!this.Q) {
							if (this.F == null)
								str1 = null;
							else
								str1 = (String) this.F.get("id");
							int m;
							if ((str1 == null) || (str1.length() <= 0))
								m = -1;
							else
								m = Integer.parseInt(str1);
							if (this.C == null)
								str1 = null;
							else
								str1 = (String) this.C.get("id");
							if (this.D == null)
								str2 = null;
							else
								str2 = (String) this.D.get("id");
							if (((str2 == null) || (str2.length() == 0))
									&& (this.E != null))
								str2 = (String) this.E.get("id");
							if ((m >= 0)
									&& ((m == 100102) || (m == 100111) || (m == 100119)))
								b(true);
							if ((str1 != null) || (str2 != null))
								b(true);
						} else {
							b(false);
						}
					} else {
						this.H = paramString;
						if (this.I != null)
							this.I.append("<" + paramString + ">");
						b(true);
					}
				} else {
					if (this.G != null)
						this.G.clear();
					else
						this.G = new HashMap();
					this.J = true;
					if (this.I != null) {
						this.I.setLength(0);
						this.I.append("<capabilities>");
					} else {
						this.I = new StringBuilder("<capabilities>");
					}
					b(true);
				}
				if (this.Q)
					b(false);
			} else {
				b(false);
			}
		}
	}

	public void a(XmlPullParser paramXmlPullParser) {
		d(this._context.getString(R.string.updating_project_info));
		super.a(paramXmlPullParser);
	}

	public void b(String paramString, XmlPullParser paramXmlPullParser) {
	}

	public void b(XmlPullParser paramXmlPullParser) {
		super.b(paramXmlPullParser);
		this.a = this._director.p();
		this.a.beginTransaction();
		B();
		k();
	}

	public void c(XmlPullParser paramXmlPullParser) {
		super.c(paramXmlPullParser);

	}

	public void c(boolean paramBoolean) {
		this.v = paramBoolean;
	}

	protected boolean c(int paramInt) {
		boolean m = false;
		if (A() != paramInt)
			m = false;
		else
			m = true;
		return m;
	}

	public void d(int paramInt) {
		this.ag = paramInt;
	}

	public void d(String paramString) {
		c(paramString);
		this._director.e(paramString);
	}

	public void d(XmlPullParser paramXmlPullParser) {
		super.d(paramXmlPullParser);
		if (!this.Q) {
			if ((!this.J) && (this.r) && (this.w != null)) {
				String str = paramXmlPullParser.getText().replaceAll("\n", "")
						.trim();
				if ((str.length() > 0) && (this.x != null))
					this.x.put(this.w, str);
			}
			this.w = null;
		}
	}

	public void d(boolean paramBoolean) {
		this.af = paramBoolean;
	}

	public void e(boolean paramBoolean) {
		this.ah = paramBoolean;
	}

	public boolean m() {
		return this.v;
	}

	public LightingScenesParser n() {
		return this._lightingScenesParser;
	}

	public CustomButtonsParser o() {
		return this._customButtonsParser;
	}

	public RoomStateXMLParser p() {
		return this._roomStateParser;
	}

	public void q() {
		this.x = null;
		this.y = new Stack();
		this.z = null;
		this.A = null;
		this.B = null;
		this.D = null;
		this.E = null;
		this.F = null;
		this.G = null;
		this.H = null;
		this.I = null;
		this.K = null;
		this._lightingScenesParser = new LightingScenesParser();
		this.L = null;
		this._customButtonsParser = new CustomButtonsParser();
		this.M = null;
		this._roomStateParser = new RoomStateXMLParser();
		this.N = null;
		this.H = null;
		this.P = null;
		this.T = null;
		this.U = null;
		this.V = null;
		b(false);
		this.Q = false;
		this.R1 = null;
		this.aa = new ContentValues();
	}

	protected void r() {
		if ((!this.Q) && (this.x != null))
			switch (Integer.parseInt((String) this.x.get("type"))) {
			default:
				break;
			case 2:
				this.z = this.x;
				break;
			case 3:
				this.A = this.x;
				break;
			case 4:
				this.B = this.x;
				break;
			case 5:
			case 8:
				this.C = this.x;
				break;
			case 6:
				this.D = this.x;
				break;
			case 7:
				this.E = this.x;
				break;
			case 9:
				this.F = this.x;
			}
	}

	protected boolean s() {
		return c(1);
	}

	protected boolean t() {
		return c(2);
	}

	protected boolean u() {
		return c(3);
	}

	protected boolean v() {
		return c(4);
	}

	protected boolean w() {
		boolean m = false;
		if ((!c(8)) && (!c(5)))
			m = false;
		else
			m = true;
		return m;
	}

	protected boolean x() {
		return c(6);
	}

	protected boolean y() {
		return c(7);
	}

	protected boolean z() {
		return c(9);
	}
}

/*
 * Location: E:\去哪儿\com.control4.myhome-2\classes_dex2jar.jar Qualified Name:
 * com.control4.director.parser.GetItemsParser JD-Core Version: 0.6.0
 */