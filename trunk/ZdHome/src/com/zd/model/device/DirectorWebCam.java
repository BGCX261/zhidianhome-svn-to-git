package com.zd.model.device;

import roboguice.util.Ln;
import android.graphics.Point;
import android.graphics.Rect;

import com.zd.model.Variable;
import com.zd.model.command.CommandFactory;
import com.zd.model.command.SendToDeviceCommand;

public class DirectorWebCam extends DirectorDevice implements WebCam {
	private String k;
	private String l;
	private String m;
	private String n;
	private String o;
	private String p;
	private String q;
	private boolean r;
	private String s;
	private int t;
	private boolean u;
	private boolean v;
	private boolean w;
	private boolean x;
	private int y;
	private float z;

	public void C_() {
		super.C_();
		a(320, 240);
	}

	public Device.DeviceType getType() {
		return Device.DeviceType.g;
	}

	public void a(float paramFloat) {
		this.z = paramFloat;
	}

	public void a(int paramInt) {
		this.y = paramInt;
	}

	public void a(int paramInt1, int paramInt2) {
		// try
		// {
		// StringBuilder localStringBuilder1 = new StringBuilder();
		// localStringBuilder1.append(paramInt1);
		// localStringBuilder1.append("x");
		// localStringBuilder1.append(paramInt2);
		// StringBuilder localStringBuilder2;
		// if ((this.m == null) || (this.m.length() == 0))
		// {
		// localStringBuilder2 = new StringBuilder("http://");
		// localStringBuilder2.append(this.s);
		// localStringBuilder2.append(":");
		// localStringBuilder2.append(this.t);
		// if ((this.k == null) || (this.k.length() <= 0))
		// break label258;
		// localStringBuilder2.append(this.k);
		// }
		// label258: for (this.m =
		// localStringBuilder2.toString().replaceAll("__AMPERSAND__",
		// "&").replaceAll("\\[Resolution\\]",
		// localStringBuilder1.toString()).replaceAll("\\[Quality\\]",
		// "Clarity"); ; this.m = localStringBuilder2.toString())
		// {
		// if (this.u)
		// this.n = this.m;
		// if ((this.l == null) || (this.l.length() <= 0))
		// break;
		// localStringBuilder2 = new StringBuilder("http://");
		// localStringBuilder2.append(this.s);
		// localStringBuilder2.append(":");
		// localStringBuilder2.append(this.t);
		// localStringBuilder2.append(this.l);
		// this.o = localStringBuilder2.toString().replaceAll("__AMPERSAND__",
		// "&").replaceAll("\\[Resolution\\]",
		// localStringBuilder1.toString()).replaceAll("\\[Quality\\]",
		// "Clarity");
		// break;
		// }
		// }
		// catch (Exception localException)
		// {
		// Ln.e(localException);
		// }
	}

	public void a(Variable paramVariable, boolean paramBoolean) {
		super.a(paramVariable, paramBoolean);
	}

	public void a(String paramString) {
		this.k = paramString;
	}

	public void a(String paramString1, String paramString2) {
		// if ((paramString1 == null) || (paramString2 == null));
		// while (true)
		// {
		// return;
		// while (true)
		// {
		// try
		// {
		// if (!paramString1.equals("Device State"))
		// break label359;
		// Object localObject = (HashParser)ParserFactory.HashProvider.a();
		// XmlPullParser localXmlPullParser =
		// XmlPullParserFactory.newInstance().newPullParser();
		// localXmlPullParser.setInput(new StringReader(paramString2));
		// ((HashParser)localObject).a(localXmlPullParser);
		// localObject = ((HashParser)localObject).a();
		// this.p = ((String)((HashMap)localObject).get("basic_auth_username"));
		// this.q = ((String)((HashMap)localObject).get("basic_auth_password"));
		// this.r =
		// BooleanUtil.a((String)((HashMap)localObject).get("uses_basic_auth"));
		// this.m = ((String)((HashMap)localObject).get("url"));
		// this.s = ((String)((HashMap)localObject).get("hostname"));
		// this.t = IntegerUtil.a((String)((HashMap)localObject).get("port"));
		// localObject = (String)((HashMap)localObject).get("refresh");
		// if ((localObject == null) || (((String)localObject).length() <= 0))
		// continue;
		// this.z = Float.parseFloat((String)localObject);
		// if (((this.n == null) || (this.n.length() <= 0)) && ((this.o == null)
		// || (this.o.length() <= 0)))
		// continue;
		// this.u = true;
		// if ((!this.r) || (this.p == null) || (this.p.length() <= 0))
		// break;
		// break;
		// if ((this.m == null) || ((!this.m.contains(".jpg")) &&
		// (!this.m.contains(".jpeg")) && (!this.m.contains(".gif")) &&
		// (!this.m.contains(".png")) && (!this.m.contains(".tif")) &&
		// (!this.m.contains(".tiff")) && (!this.m.contains(".bmp"))))
		// break label351;
		// this.u = true;
		// continue;
		// }
		// catch (Exception localException)
		// {
		// Ln.e(localException);
		// }
		// break;
		// label351: this.u = false;
		// }
		// label359: if (paramString1.equals("Full Capabilities"))
		// continue;
		// if (paramString1.equalsIgnoreCase("can_pan"))
		// {
		// this.v = BooleanUtil.a(paramString2);
		// continue;
		// }
		// if (paramString1.equalsIgnoreCase("can_zoom"))
		// {
		// this.w = BooleanUtil.a(paramString2);
		// continue;
		// }
		// if (paramString1.equalsIgnoreCase("can_focus"))
		// {
		// this.x = BooleanUtil.a(paramString2);
		// continue;
		// }
		// if (paramString1.equalsIgnoreCase("presets"))
		// {
		// this.y = IntegerUtil.a(paramString2);
		// continue;
		// }
		// if (paramString1.equalsIgnoreCase("update_milliseconds"))
		// {
		// this.z = Float.parseFloat(paramString2);
		// continue;
		// }
		// if (!paramString1.equalsIgnoreCase("is_camera"))
		// continue;
		// this.u = BooleanUtil.a(paramString2);
		// }
	}

	public void a(boolean paramBoolean) {
		this.r = paramBoolean;
	}

	public boolean a(Point paramPoint, Rect paramRect) {
		// int j;
		// try
		// {
		// if (this._director == null)
		// {
		// int i = 0;
		// }
		// else
		// {
		// SendToDeviceCommand localSendToDeviceCommand =
		// (SendToDeviceCommand)CommandFactory.SendToDeviceProvider.get();
		// localSendToDeviceCommand.d(true);
		// localSendToDeviceCommand.c(false);
		// localSendToDeviceCommand.c("CLICK_POSITION");
		// localSendToDeviceCommand.b(t());
		// StringBuilder localStringBuilder = new
		// StringBuilder("<param><name>Width</name><value type=\"INT\"><static>");
		// localStringBuilder.append(paramRect.width());
		// localStringBuilder.append("</static></value></param>");
		// localStringBuilder.append("<param><name>Height</name><value type=\"INT\"><static>");
		// localStringBuilder.append(paramRect.height());
		// localStringBuilder.append("</static></value></param>");
		// localStringBuilder.append("<param><name>X</name><value type=\"INT\"><static>");
		// localStringBuilder.append(paramPoint.x);
		// localStringBuilder.append("</static></value></param>");
		// localStringBuilder.append("<param><name>Y</name><value type=\"INT\"><static>");
		// localStringBuilder.append(paramPoint.y);
		// localStringBuilder.append("</static></value></param>");
		// localSendToDeviceCommand.a(localStringBuilder.toString());
		// boolean bool = this._director.a(localSendToDeviceCommand);
		// bool = bool;
		// }
		// }
		// catch (Exception j)
		// {
		// Ln.e(localException);
		// j = 0;
		// }
		// return j;
		return false;
	}

	public void b(int paramInt) {
		this.t = paramInt;
	}

	public void b(Variable paramVariable, boolean paramBoolean) {
		super.b(paramVariable, paramBoolean);
	}

	public void b(String paramString) {
		this.l = paramString;
	}

	public void b(boolean paramBoolean) {
		this.u = paramBoolean;
	}

	public boolean b() {
		return this.r;
	}

	public void c(String paramString) {
		this.p = paramString;
	}

	public void c(boolean paramBoolean) {
		this.v = paramBoolean;
	}

	public boolean c() {
		return this.u;
	}

	public boolean c(int paramInt) {
		try {
			SendToDeviceCommand localSendToDeviceCommand = (SendToDeviceCommand) CommandFactory.SendToDeviceProvider
					.get();
			localSendToDeviceCommand.d(true);
			localSendToDeviceCommand.c(false);
			localSendToDeviceCommand.c("PRESET");
			localSendToDeviceCommand.b(t());
			localSendToDeviceCommand
					.a("<param><name>Preset</name><value type=\"INTEGER\"><static>"
							+ paramInt + "</static></value></param>");
			boolean bool = this._director.a(localSendToDeviceCommand);
			bool = bool;
			return bool;
		} catch (Exception i) {

		}
		return false;
	}

	public void d(String paramString) {
		this.q = paramString;
	}

	public void d(boolean paramBoolean) {
		this.w = paramBoolean;
	}

	public boolean d() {
		return this.v;
	}

	public void e(String paramString) {
		this.s = paramString;
	}

	public void e(boolean paramBoolean) {
		this.x = paramBoolean;
	}

	public boolean e() {
		return this.w;
	}

	public void f(String paramString) {
		this.m = paramString;
	}

	public boolean f() {
		return this.x;
	}

	public boolean f(boolean paramBoolean) {
		String str;
		if (!paramBoolean)
			str = "ZOOM_OUT";
		else
			str = "ZOOM_IN";
		return j(str);
	}

	public int g() {
		return this.y;
	}

	public boolean g(boolean paramBoolean) {
		String str;
		if (!paramBoolean)
			str = "FOCUS_NEAR";
		else
			str = "FOCUS_FAR";
		return j(str);
	}

	public String h() {
		return this.n;
	}

	public String i() {
		return this.o;
	}

	public String k() {
		return this.q;
	}

	public String l() {
		return this.m;
	}

	public boolean m() {
		boolean i = true;
		String str = l().toLowerCase();
		if ((str == null)
				|| ((!str.endsWith("jpeg")) && (!str.endsWith("jpg"))
						&& (!str.endsWith("bmp")) && (!str.endsWith("png"))))
			i = false;
		return i;
	}

	public float n() {
		return this.z;
	}

	public boolean o() {
		return j("FOCUS_AUTO");
	}

	public void p() {
		try {
			super.p();
			a("GET_CAMERA_INFO", false, false);
			return;
		} catch (Exception localException) {
			while (true)
				Ln.e(localException);
		}
	}

	public boolean q() {
		return super.q();

	}

	public String q_() {
		return this.p;
	}
}
