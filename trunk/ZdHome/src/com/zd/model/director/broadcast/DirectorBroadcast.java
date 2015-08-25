package com.zd.model.director.broadcast;

import com.zd.model.DirectorResult;
import com.zd.model.Project;
import com.zd.model.command.CommandFactory;
import com.zd.model.command.SendToDeviceCommand;
import com.zd.model.device.Device;

public class DirectorBroadcast extends DirectorResult implements Broadcast {
	private String a;
	private int b;
	private String c;
	private String d;
	private String e;
	private String f;
	private String g;
	private boolean h;
	private String i = null;

	public void a(int paramInt) {
		this.b = paramInt;
	}

	public void a(DirectorResult paramDirectorResult) {
		super.a(paramDirectorResult);
		// if ((paramDirectorResult == null) || (!(paramDirectorResult
		// instanceof DirectorBroadcast)));
		// while (true)
		// {
		// return;
		// try
		// {
		// DirectorBroadcast localDirectorBroadcast =
		// (DirectorBroadcast)paramDirectorResult;
		// if ((localDirectorBroadcast.a != null) &&
		// (localDirectorBroadcast.a.length() > 0))
		// this.a = localDirectorBroadcast.a;
		// if ((localDirectorBroadcast.c != null) &&
		// (localDirectorBroadcast.c.length() > 0))
		// this.c = localDirectorBroadcast.c;
		// if ((localDirectorBroadcast.d != null) &&
		// (localDirectorBroadcast.d.length() > 0))
		// this.d = localDirectorBroadcast.d;
		// if ((localDirectorBroadcast.e != null) &&
		// (localDirectorBroadcast.e.length() > 0))
		// this.e = localDirectorBroadcast.e;
		// if ((localDirectorBroadcast.f != null) &&
		// (localDirectorBroadcast.f.length() > 0))
		// this.f = localDirectorBroadcast.f;
		// if ((localDirectorBroadcast.g != null) &&
		// (localDirectorBroadcast.g.length() > 0))
		// this.g = localDirectorBroadcast.g;
		// if ((localDirectorBroadcast.i != null) &&
		// (localDirectorBroadcast.i.length() > 0))
		// this.i = localDirectorBroadcast.i;
		// if (localDirectorBroadcast.b > -1)
		// this.b = localDirectorBroadcast.b;
		// this.h = localDirectorBroadcast.h;
		// }
		// catch (Exception localException)
		// {
		// Ln.e(localException);
		// }
		// }
	}

	public void a(String paramString) {
		this.a = paramString;
	}

	public String au() {
		String str = super.au();
		if (str == null)
			str = this.a;
		return str;
	}

	public String b() {
		return this.a;
	}

	public void b(String paramString) {
		this.d = paramString;
	}

	public int c() {
		return this.b;
	}

	public void c(String paramString) {
		this.e = paramString;
	}

	public void c(boolean paramBoolean) {
		this.h = paramBoolean;
	}

	public String d() {
		return this.d;
	}

	public void d(String paramString) {
		this.f = paramString;
	}

	public String e() {
		return this.e;
	}

	public void e(String paramString) {
		this.g = paramString;
	}

	public String f() {
		return this.f;
	}

	public void f(String paramString) {
		this.c = paramString;
	}

	public String g() {
		return this.g;
	}

	public void h() {
		super.h();
		this.a = null;
		this.c = null;
		this.d = null;
		this.e = null;
		this.f = null;
		this.g = null;
		this.i = null;
	}

	public boolean i() {
		return this.h;
	}

	public String l() {
		return this.c;
	}

	public boolean m() {

		 int j;
		 try
		 {
		 if ((this._director != null) && (!this._director.G()))
		 {
		 int k = this._director.m().r();
		 SendToDeviceCommand localSendToDeviceCommand =
		 (SendToDeviceCommand)CommandFactory.SendToDeviceProvider.get();
		 localSendToDeviceCommand.d(true);
		 if (i())
		 localSendToDeviceCommand.c("SELECT_AUDIO_MEDIA");
		 localSendToDeviceCommand.b(k);
		 StringBuilder localStringBuilder = new
		 StringBuilder("<param><name>mediaid</name><value type=\"INT\"><static>");
		 localStringBuilder.append(at());
		 localStringBuilder.append("</static></value></param>");
		 localStringBuilder.append("<param><name>type</name><value type=\"STRING\"><static>");
		 if (i())
		 localStringBuilder.append("BROADCAST_AUDIO");
		 localStringBuilder.append("</static></value></param>");
		 localSendToDeviceCommand.a(localStringBuilder.toString());
		 boolean bool = this._director.a(localSendToDeviceCommand);
//		 break label163;
//		 str = "BROADCAST_VIDEO";
//		 continue;
		 }
		 }
		 catch (Exception rt)
		 {

		 }
	
			 return false;
		// label165: String str = "SELECT_VIDEO_MEDIA";
	
	}

	protected String s_() {
		return "broadcast";
	}

	public String v() {
		Object localObject1;
		if (this.i != null)
			localObject1 = this.i;
		else {
			try {
				localObject1 = new StringBuilder();
				if (this.c != null)
					((StringBuilder) localObject1).append(this.c);
				if (this.b > -1) {
					Project project = this._director.m();
					if (project != null) {
						Device device = project.b(this.b, true,
								this._director.p());
						if (device != null) {
							String name = device.getName();
							if ((name != null) && (name.length() > 0)) {
								if (((StringBuilder) localObject1).length() > 0)
									((StringBuilder) localObject1)
											.append(" - ");
								((StringBuilder) localObject1).append(name);
							}
						}
					}
				}
				this.i = ((StringBuilder) localObject1).toString();
				localObject1 = this.i;
			} catch (Exception str) {

			}
		}
		return this.i;
	}
}
