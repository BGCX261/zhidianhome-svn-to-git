package com.zd.model.device;

import roboguice.util.Ln;
import android.app.Application;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.zd.home.R;
import com.zd.model.HashIndex;
import com.zd.model.Variable;
import com.zd.model.audio.AudioQueue;
import com.zd.model.audio.DirectorAudioQueue;
import com.zd.model.audio.DirectorSong;
import com.zd.model.command.CommandFactory;
import com.zd.model.command.SendToDeviceCommand;

class DirectorDigitalAudio extends DirectorDevice implements DigitalAudio {
	private static final int k = 1006;
	private static final int l = 1003;
	private static final int m = 1007;

	@Inject
	protected Provider<DirectorAudioQueue> _audioQueueProvider;

	@Inject
	private Application _context;

	@Inject
	protected Provider<DirectorSong> _songProvider;
	private HashIndex<Integer, DirectorAudioQueue> n;
	private boolean o = false;

	public boolean C() {
		return super.C();
	}

	public AudioQueue a(int paramInt) {
		try {
			if (this.n != null)
				;
			for (AudioQueue localAudioQueue = (AudioQueue) this.n.a(paramInt);; localAudioQueue = null)
				return localAudioQueue;
		} catch (Exception localObject) {

		}
		return null;
	}

	public Device.DeviceType getType() {
		return Device.DeviceType.h;
	}

	public void a(DirectorAudioQueue paramDirectorAudioQueue) {
		// try
		// {
		// if (this.n == null)
		// {
		// this.n = new HashIndex();
		// break label121;
		// this.n.a(Integer.valueOf(paramDirectorAudioQueue.a()),
		// paramDirectorAudioQueue);
		// DirectorProject localDirectorProject = this._director.m();
		// Vector localVector = paramDirectorAudioQueue.p();
		// if (localVector == null)
		// return;
		// int j = localVector.size();
		// for (int i = 0; i < j; i++)
		// {
		// DirectorRoom localDirectorRoom =
		// (DirectorRoom)localDirectorProject.h(((Integer)localVector.elementAt(i)).intValue());
		// if (localDirectorRoom == null)
		// continue;
		// localDirectorRoom.z(paramDirectorAudioQueue.a());
		// }
		// }
		// }
		// catch (Exception localException)
		// {
		//
		// }
	}

	public void a(Variable paramVariable, boolean paramBoolean) {
		// int j = 0;
		// if (paramVariable == null)
		// return;
		// while (true)
		// {
		// try
		// {
		// int i1 = paramVariable.b();
		// String str = paramVariable.c();
		// if (i1 != 1006)
		// continue;
		// Object localObject4 = new
		// DirectorDigitalAudio.AudioQueueStatusParser(this);
		// ((DirectorDigitalAudio.AudioQueueStatusParser)localObject4).a(this._director);
		// localObject3 = XmlPullParserFactory.newInstance().newPullParser();
		// ((XmlPullParser)localObject3).setInput(new StringReader(str));
		// ((DirectorDigitalAudio.AudioQueueStatusParser)localObject4).a((XmlPullParser)localObject3);
		// localObject4 =
		// ((DirectorDigitalAudio.AudioQueueStatusParser)localObject4).a();
		// int i = e();
		// if (j >= i)
		// continue;
		// localObject3 = a(j);
		// if ((localObject3 == null) || ((localObject4 != null) &&
		// (((HashIndex)localObject4).a(Integer.valueOf(((AudioQueue)localObject3).a()))
		// != null)))
		// break label377;
		// c(((AudioQueue)localObject3).a());
		// break label377;
		// if (localObject3 != 1003)
		// break label267;
		// localObject2 = new
		// DirectorDigitalAudio.RoomQueueSettingsParser(this);
		// ((DirectorDigitalAudio.RoomQueueSettingsParser)localObject2).a(this._director);
		// localObject3 = XmlPullParserFactory.newInstance().newPullParser();
		// ((XmlPullParser)localObject3).setInput(new StringReader(i));
		// ((DirectorDigitalAudio.RoomQueueSettingsParser)localObject2).a((XmlPullParser)localObject3);
		// if (this.j == null)
		// continue;
		// this.j.a(this);
		// if (this._director == null)
		// break;
		// Object localObject1 = this._director.m();
		// if (localObject1 == null)
		// break;
		// localObject1 = (DirectorRoom)((Project)localObject1).s();
		// if (localObject1 == null)
		// break;
		// ((DirectorRoom)localObject1).aP();
		// }
		// catch (Exception localException)
		// {
		// Ln.e(localException);
		// }
		// break;
		// label267: if (localObject3 != 1007)
		// continue;
		// Object localObject2 = new
		// DirectorDigitalAudio.AudioQueueInfoParser(this);
		// ((DirectorDigitalAudio.AudioQueueInfoParser)localObject2).a(this._director);
		// Object localObject3 =
		// XmlPullParserFactory.newInstance().newPullParser();
		// ((XmlPullParser)localObject3).setInput(new
		// StringReader(localException));
		// ((DirectorDigitalAudio.AudioQueueInfoParser)localObject2).a((XmlPullParser)localObject3);
		// if (!this.o)
		// continue;
		// localObject2 =
		// ((DirectorDigitalAudio.AudioQueueInfoParser)localObject2).a();
		// if (localObject2 != null)
		// {
		// DirectorProject localDirectorProject = this._director.m();
		// a(((AudioQueue)localObject2).a(), localDirectorProject.r());
		// }
		// this.o = false;
		// continue;
		// label377: localObject2++;
		// }
	}

	public void a(boolean paramBoolean) {
		this.o = paramBoolean;
	}

	public boolean a(int paramInt1, int paramInt2) {
		boolean j = false;
		try {
			if (this._director == null) {
				int i = 0;
			} else {
				String str = "<param><name>deviceid</name><value type=\"INTEGER\"><static>"
						+ t()
						+ "</static></value></param>"
						+ "<param><name>queueid</name><value type=\"INTEGER\"><static>"
						+ paramInt1
						+ "</static></value></param>"
						+ "<param><name>devicegroup</name><value type=\"STRING\"><static>listen</static></value></param>";
				SendToDeviceCommand localSendToDeviceCommand = (SendToDeviceCommand) CommandFactory.SendToDeviceProvider
						.get();
				localSendToDeviceCommand.c("SELECT_AUDIO_DEVICE");
				localSendToDeviceCommand.d(true);
				localSendToDeviceCommand.b(paramInt2);
				localSendToDeviceCommand.a(str);
				boolean bool = this._director.a(localSendToDeviceCommand);

			}
		} catch (Exception e) {

		}
		return j;
	}

	public AudioQueue b(int paramInt) {
		try {
			if (this.n != null)
				;
			for (AudioQueue localAudioQueue = (AudioQueue) this.n.a(Integer
					.valueOf(paramInt));; localAudioQueue = null)
				return localAudioQueue;
		} catch (Exception localObject) {

		}
		return null;
	}

	public boolean b() {
		return this.o;
	}

	public void c(int paramInt) {
		// Object localObject;
		// DirectorProject localDirectorProject;
		// int i;
		// if (this.n != null)
		// {
		// localObject = b(paramInt);
		// if (localObject != null)
		// {
		// localDirectorProject = this._director.m();
		// localObject = ((AudioQueue)localObject).p();
		// if (localObject != null)
		// i = ((Vector)localObject).size();
		// }
		// }
		// for (int j = 0; ; j++)
		// {
		// if (j >= i)
		// {
		// this.n.c(Integer.valueOf(paramInt));
		// return;
		// }
		// DirectorRoom localDirectorRoom =
		// (DirectorRoom)localDirectorProject.h(((Integer)((Vector)localObject).elementAt(j)).intValue());
		// if (localDirectorRoom == null)
		// continue;
		// localDirectorRoom.A(paramInt);
		// }
	}

	public boolean c() {
		boolean bool1 = false;
		try {
			if (this._director != null) {
				bool1 = g(1006);
				boolean bool2 = g(1007);
				bool1 = bool2 & bool1;
			}
		} catch (Exception localException) {
			Ln.e(localException);
		}
		return bool1;
	}

	public boolean d() {
		boolean bool = false;
		try {
			if (this._director != null) {
				bool = g(1003);
				bool = bool;
			}
		} catch (Exception localException) {
			Ln.e(localException);
		}
		return bool;
	}

	public int e() {
		int i;
		if (this.n == null)
			i = 0;
		else
			i = this.n.c();
		return i;
	}

	public void p() {
		try {
			super.p();
			c();
			d();
			return;
		} catch (Exception localException) {
			while (true)
				Ln.e(localException);
		}
	}

	public String getName() {
		return this._context.getString(R.string.my_music);
	}
}
