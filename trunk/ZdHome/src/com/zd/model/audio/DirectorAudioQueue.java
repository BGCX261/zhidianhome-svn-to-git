package com.zd.model.audio;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Vector;

import roboguice.util.Ln;

import com.google.inject.Inject;
import com.zd.model.Control4Director;
import com.zd.model.DirectorRoom;
import com.zd.model.HashIndex;

public class DirectorAudioQueue implements AudioQueue {
	private static final int a = 25;
	private ArrayList<AudioQueue.OnAudioQueueUpdateListener> A;
	private Vector<DirectorSong> B;

	@Inject
	protected Control4Director _director;
	private int b;
	private String c;
	private AudioQueue.QueueState d;
	private String e;
	private int f;
	private long g;
	private String h;
	private int i;
	private String j;
	private boolean k = true;
	private boolean l = false;
	private boolean m = true;
	private boolean n = false;
	private boolean o = false;
	private boolean p = false;
	private Timer q;
	private TimerTask r;
	private Timer s;
	private TimerTask t;
	private Timer u;
	private TimerTask v;
	private boolean w = false;
	private boolean x = false;
	private Vector<Integer> y;
	private HashIndex<String, Song> z;

	private DirectorRoom w() {
		DirectorRoom localDirectorRoom;
		if ((this.y == null) || (this.y.size() <= 0))
			localDirectorRoom = null;
		else
			localDirectorRoom = (DirectorRoom) this._director.m().getRoom(
					((Integer) this.y.get(0)).intValue());
		return localDirectorRoom;
	}

	public int a() {
		return this.b;
	}

	public void a(long paramLong) {
		this.g = paramLong;
	}

	public void a(
			AudioQueue.OnAudioQueueUpdateListener paramOnAudioQueueUpdateListener) {
		if (paramOnAudioQueueUpdateListener == null)
			;

		if (this.A == null)
			this.A = new ArrayList();
		synchronized (this.A) {
			this.A.add(paramOnAudioQueueUpdateListener);
		}

	}

	public void a(AudioQueue.QueueState paramQueueState) {
		this.d = paramQueueState;
		u();
	}

	public void a(DirectorAudioQueue paramDirectorAudioQueue) {
		// if (paramDirectorAudioQueue == null);
		// while (true)
		// {
		// return;
		// DirectorRoom localDirectorRoom;
		// try
		// {
		// if (paramDirectorAudioQueue.b() != null)
		// c(paramDirectorAudioQueue.b());
		// if (paramDirectorAudioQueue.c() != AudioQueue.QueueState.a)
		// a(paramDirectorAudioQueue.c());
		// this.e = paramDirectorAudioQueue.e;
		// this.h = paramDirectorAudioQueue.h;
		// this.j = paramDirectorAudioQueue.j;
		// this.g = paramDirectorAudioQueue.g;
		// if ((paramDirectorAudioQueue.z != null) &&
		// (paramDirectorAudioQueue.z.c() > 0))
		// this.z = paramDirectorAudioQueue.z;
		// localObject = paramDirectorAudioQueue.p();
		// if ((localObject == null) || (((Vector)localObject).size() <= 0))
		// continue;
		// DirectorProject localDirectorProject = this._director.m();
		// if ((this.y == null) || (this.y.size() <= 0))
		// break label205;
		// Iterator localIterator = this.y.iterator();
		// while (localIterator.hasNext())
		// {
		// localDirectorRoom =
		// (DirectorRoom)localDirectorProject.h(((Integer)localIterator.next()).intValue());
		// if (localDirectorRoom == null)
		// continue;
		// localDirectorRoom.A(a());
		// }
		// }
		// catch (Exception localException)
		// {
		// Ln.e(localException);
		// }
		// continue;
		// label205: this.y = ((Vector)localObject);
		// if ((this.y == null) || (this.y.size() <= 0))
		// continue;
		// Object localObject = this.y.iterator();
		// while (((Iterator)localObject).hasNext())
		// {
		// localDirectorRoom =
		// (DirectorRoom)localException.h(((Integer)((Iterator)localObject).next()).intValue());
		// if ((localDirectorRoom == null) || (localDirectorRoom.B(a())))
		// continue;
		// localDirectorRoom.z(a());
		// }
		// }
	}

	public void a(DirectorSong paramDirectorSong) {
		try {
			if (this.z == null) {
				this.z = new HashIndex();
				this.z.a(true);
			}
			if ((paramDirectorSong != null) && (paramDirectorSong.at() != null))
				this.z.a(paramDirectorSong.at(), paramDirectorSong);
		} catch (Exception localException) {
			Ln.e(localException);
		}
	}

	public void a(HashIndex<String, Song> paramHashIndex) {
		this.z = paramHashIndex;
	}

	public void a(boolean paramBoolean) {
		this.k = paramBoolean;
	}

	public boolean a(int paramInt) {
		// int i2;
		// try
		// {
		// if (this._director == null)
		// {
		// int i1 = 0;
		// }
		// else
		// {
		// SendToDeviceCommand localSendToDeviceCommand =
		// (SendToDeviceCommand)CommandFactory.SendToDeviceProvider.a();
		// localSendToDeviceCommand.c("REMOVE_QUEUE");
		// localSendToDeviceCommand.b(100002);
		// localSendToDeviceCommand.a(paramInt);
		// boolean bool = this._director.a(localSendToDeviceCommand);
		// bool = bool;
		// }
		// }
		// catch (Exception i2)
		// {
		// Ln.e(localException);
		// i2 = 0;
		// }
		// return i2;
		return false;
	}

	public boolean a(int paramInt1, int paramInt2) {
		boolean bool = false;
		try {
			Song localSong = b(paramInt1);
			if (localSong != null) {
				bool = a(localSong.at(), localSong.b(), paramInt2);
				bool = bool;
			}
		} catch (Exception localException) {
			Ln.e(localException);
		}
		return bool;
	}

	public boolean a(
			int paramInt,
			AudioQueue.OnAudioQueueUpdateListener paramOnAudioQueueUpdateListener) {
		// int i1 = 1;
		// try
		// {
		// if (this._director == null)
		// {
		// i1 = 0;
		// break label168;
		// }
		// if (this.l)
		// Ln.a("Ignoring AudioQueue.getDetailedInfo request since we are already getting the info for this queue.",
		// new Object[0]);
		// }
		// catch (Exception i2)
		// {
		// Ln.e(localException);
		// b(false);
		// int i2 = 0;
		// }
		// b(true);
		// SendToDeviceCommand localSendToDeviceCommand =
		// (SendToDeviceCommand)CommandFactory.SendToDeviceProvider.a();
		// localSendToDeviceCommand.c("GET_QUEUE_INFO");
		// localSendToDeviceCommand.b(100002);
		// localSendToDeviceCommand.d(false);
		// localSendToDeviceCommand.a(paramInt);
		// localSendToDeviceCommand.c(true);
		// localSendToDeviceCommand.c(28);
		// localSendToDeviceCommand.a("queue", this);
		// localSendToDeviceCommand.a("audio-library",
		// this._director.m().h(paramInt).at());
		// if (paramOnAudioQueueUpdateListener != null)
		// localSendToDeviceCommand.a("listener",
		// paramOnAudioQueueUpdateListener);
		// boolean bool = this._director.a(localSendToDeviceCommand);
		// if (bool)
		// b(true);
		// else
		// b(false);
		// label168: return bool;
		return false;
	}

	public boolean a(String paramString) {
		// try
		// {
		// if ((this._director != null) && (!this._director.G()))
		// {
		// Object localObject1 = w();
		// DirectorDigitalAudio localDirectorDigitalAudio =
		// (DirectorDigitalAudio)((DirectorRoom)localObject1).as();
		// StringBuilder localStringBuilder = new
		// StringBuilder("<param><name>NAME</name><value type=\"STRING\"><static>");
		// localStringBuilder.append(paramString);
		// localStringBuilder.append("</static></value></param>");
		// localStringBuilder.append("<param><name>ROOM_ID</name><value type=\"INTEGER\"><static>");
		// localStringBuilder.append(((DirectorRoom)localObject1).a());
		// localStringBuilder.append("</static></value></param>");
		// Object localObject2 = localDirectorDigitalAudio.a("SAVE_PLAYLIST",
		// true, false, localStringBuilder.toString());
		// localObject1 =
		// (DirectorAudioLibrary)((DirectorRoom)localObject1).at();
		// if (localObject1 != null)
		// ((DirectorAudioLibrary)localObject1).a(true);
		// localObject1 = localObject2;
		// }
		// }
		// catch (Exception i1)
		// {
		// Ln.e(localException);
		// i1 = 0;
		// }
		// int i1 = 0;
		// return i1;
		return false;
	}

	public boolean a(String paramString, int paramInt1, int paramInt2) {
		// int i2;
		// try
		// {
		// if (this._director == null)
		// {
		// int i1 = 0;
		// }
		// else
		// {
		// Object localObject =
		// "<param><name>MEDIA_ID</name><value type=\"STRING\"><static>" +
		// paramString + "</static></value></param>" +
		// "<param><name>SOURCE</name><value type=\"INT\"><static>" + paramInt1
		// + "</static></value></param>";
		// SendToDeviceCommand localSendToDeviceCommand =
		// (SendToDeviceCommand)CommandFactory.SendToDeviceProvider.a();
		// localSendToDeviceCommand.c("GO_TO_SONG");
		// localSendToDeviceCommand.b(100002);
		// localSendToDeviceCommand.a(paramInt2);
		// localSendToDeviceCommand.c(false);
		// localSendToDeviceCommand.a((String)localObject);
		// boolean bool = this._director.a(localSendToDeviceCommand);
		// if (bool)
		// {
		// localObject = this._director.m().h(paramInt2);
		// if (localObject != null)
		// {
		// localObject = (DirectorDigitalAudio)((Room)localObject).as();
		// if (localObject != null)
		// {
		// ((DirectorDigitalAudio)localObject).a(true);
		// ((DirectorDigitalAudio)localObject).i(true);
		// }
		// }
		// }
		// bool = bool;
		// }
		// }
		// catch (Exception i2)
		// {
		// Ln.e(localException);
		// i2 = 0;
		// }
		// return i2;
		return false;
	}

	public boolean a(boolean paramBoolean, int paramInt) {
		// String str2;
		// while (true)
		// {
		// try
		// {
		// if (this._director != null)
		// continue;
		// int i1 = 0;
		// break;
		// Object localObject = new
		// StringBuilder().append("<param><name>SHUFFLE</name><value type=\"BOOL\"><static>");
		// if (paramBoolean)
		// {
		// String str1 = "1";
		// str1 = str1 + "</static></value></param>";
		// localObject =
		// (SendToDeviceCommand)CommandFactory.SendToDeviceProvider.a();
		// ((SendToDeviceCommand)localObject).c("SHUFFLE");
		// ((SendToDeviceCommand)localObject).b(100002);
		// ((SendToDeviceCommand)localObject).a(str1);
		// ((SendToDeviceCommand)localObject).a(paramInt);
		// boolean bool = this._director.a((Command)localObject);
		// if (!bool)
		// break;
		// this.w = paramBoolean;
		// }
		// }
		// catch (Exception i2)
		// {
		// Ln.e(localException);
		// int i2 = 0;
		// }
		// str2 = "0";
		// }
		// return str2;
		return false;
	}

	public Song b(int paramInt) {
		Song localSong;
		if (this.z == null)
			localSong = null;
		else
			localSong = (Song) this.z.a(paramInt);
		return localSong;
	}

	public Song b(String paramString) {
		Song localSong;
		if (this.z == null)
			localSong = null;
		else
			localSong = (Song) this.z.a(paramString);
		return localSong;
	}

	public String b() {
		return this.c;
	}

	public void b(
			AudioQueue.OnAudioQueueUpdateListener paramOnAudioQueueUpdateListener) {
		if (paramOnAudioQueueUpdateListener == null)
			;
		try {
			if (this.A != null)
				synchronized (this.A) {
					this.A.remove(paramOnAudioQueueUpdateListener);
				}
		} catch (Exception localException) {
			Ln.e(localException);
		}

	}

	public void b(boolean paramBoolean) {
		// this.l = paramBoolean;
		// if (this.r != null)
		// this.r.cancel();
		// if (!paramBoolean)
		// {
		// u();
		// if (this.q != null)
		// {
		// this.q.cancel();
		// this.q = null;
		// }
		// }
		// else
		// {
		// if (this.q == null)
		// this.q = new Timer();
		// this.r = new DirectorAudioQueue.3(this);
		// this.q.schedule(this.r, 30000L);
		// }
	}

	public boolean b(
			int paramInt,
			AudioQueue.OnAudioQueueUpdateListener paramOnAudioQueueUpdateListener) {
		// int i3;
		// Object localObject7;
		// Object localObject1;
		// Vector localVector2;
		// Object localObject3;
		// Object localObject8;
		// Object localObject2;
		// try
		// {
		// if (this._director == null)
		// {
		// i3 = 0;
		// break label697;
		// }
		// if ((this.n) || (this.o))
		// {
		// Ln.a("Ignoring AudioQueue.getSongs request since we are already getting the songs for this queue.",
		// new Object[0]);
		// i3 = 1;
		// break label697;
		// }
		// d(true);
		// localObject7 = null;
		// Vector localVector1 = new Vector();
		// localObject1 = new Vector();
		// localVector2 = new Vector();
		// int i4 = t();
		// int i1 = 0;
		// localObject3 = 0;
		// bool2 = false;
		// i3 = 0;
		// if (i3 >= i4)
		// break label690;
		// DirectorSong localDirectorSong = (DirectorSong)b(i3);
		// if ((localDirectorSong == null) || ((localDirectorSong.au() != null)
		// && (!localDirectorSong.l())) || (localDirectorSong.m()) ||
		// (localDirectorSong.F()))
		// break label671;
		// if (localDirectorSong.n())
		// break label568;
		// if (i1 < 25)
		// {
		// if (localObject7 == null)
		// localObject7 = new StringBuilder(localDirectorSong.at());
		// while (true)
		// {
		// localDirectorSong.e(true);
		// ((Vector)localObject1).add(localDirectorSong);
		// localObject8 = i1 + 1;
		// localObject2 = localObject7;
		// localObject7 = localObject3;
		// localObject3 = localObject8;
		// bool2 = bool2;
		// localObject8 = localObject7;
		// break;
		// ((StringBuilder)localObject7).append(", " +
		// ((DirectorSong)localObject8).at());
		// }
		// }
		// }
		// catch (Exception localException)
		// {
		// Ln.e(localException);
		// d(false);
		// e(false);
		// i3 = 0;
		// }
		// boolean bool2 = true;
		// label293: boolean bool1;
		// label568: Object localObject5;
		// if (localObject3 >= 25)
		// while (true)
		// {
		// this.p = bool2;
		// i3 = 1;
		// if (localObject2 > 0)
		// {
		// Object localObject6 = ((StringBuilder)localObject7).toString();
		// String str =
		// "<param><name>type</name><value type=\"STRING\"><static>TRACK_INFO</static></value></param><param><name>id_type</name><value type=\"STRING\"><static>ID_TRACKS</static></value></param><param><name>id_list</name><value type=\"STRING\"><static>"
		// + (String)localObject6 + "</static></value></param>";
		// localObject6 =
		// (SendToDeviceCommand)CommandFactory.SendToDeviceProvider.a();
		// ((SendToDeviceCommand)localObject6).c("GET_AUDIO_MEDIA");
		// ((SendToDeviceCommand)localObject6).b(paramInt);
		// ((SendToDeviceCommand)localObject6).a(str);
		// ((SendToDeviceCommand)localObject6).c(true);
		// ((SendToDeviceCommand)localObject6).c(16);
		// ((SendToDeviceCommand)localObject6).a("queue", this);
		// ((SendToDeviceCommand)localObject6).a("audio-library",
		// this._director.m().h(paramInt).at());
		// ((SendToDeviceCommand)localObject6).d(false);
		// if (paramOnAudioQueueUpdateListener != null)
		// {
		// ((SendToDeviceCommand)localObject6).a("listener",
		// paramOnAudioQueueUpdateListener);
		// a(paramOnAudioQueueUpdateListener);
		// }
		// ((SendToDeviceCommand)localObject6).a("listener", new
		// DirectorAudioQueue.1(this, (Vector)localObject1));
		// bool1 = this._director.a((Command)localObject6);
		// if (bool1)
		// {
		// d(true);
		// if (localObject3 > 0)
		// {
		// localObject1 = this._director.K();
		// if (localObject1 != null)
		// {
		// this.B = localVector2;
		// bool1 = ((Control4Rhapsody)localObject1).a(localException, this, new
		// DirectorAudioQueue.2(this, localVector2,
		// paramOnAudioQueueUpdateListener));
		// if (!bool1)
		// break label658;
		// e(true);
		// }
		// }
		// }
		// }
		// Object localObject4;
		// while (true)
		// {
		// if ((localObject2 != 0) || (localObject3 != 0))
		// break label697;
		// c(false);
		// d(false);
		// e(false);
		// break label697;
		// if (localObject3 >= 25)
		// break label722;
		// localException.add(((DirectorSong)localObject8).at());
		// localVector2.add(localObject8);
		// localObject3 += 1;
		// ((DirectorSong)localObject8).e(true);
		// bool2 = bool2;
		// localObject8 = localObject3;
		// localObject4 = localObject2;
		// localObject2 = localObject7;
		// break label700;
		// d(false);
		// break;
		// if (localObject4 == 0)
		// {
		// this.n = false;
		// break;
		// }
		// e(true);
		// this.n = false;
		// break;
		// label658: this.B = null;
		// e(false);
		// }
		// label671: bool2 = bool2;
		// localObject8 = localObject4;
		// localObject5 = localObject2;
		// localObject2 = localObject7;
		// break;
		// label690: bool2 = bool2;
		// continue;
		// label697: return bool1;
		// }
		// while (true)
		// {
		// label700: bool1++;
		// localObject7 = localObject2;
		// localObject2 = localObject5;
		// localObject5 = localObject8;
		// bool2 = bool2;
		// break;
		// label722: bool2 = true;
		// if (localObject2 >= 25)
		// break label293;
		// localObject8 = localObject5;
		// int i2 = localObject2;
		// localObject2 = localObject7;
		// }
		return false;
	}

	public boolean b(boolean paramBoolean, int paramInt) {
		// String str2;
		// while (true)
		// {
		// try
		// {
		// if (this._director != null)
		// continue;
		// int i1 = 0;
		// break;
		// Object localObject = new
		// StringBuilder().append("<param><name>REPEAT</name><value type=\"BOOL\"><static>");
		// if (paramBoolean)
		// {
		// String str1 = "1";
		// str1 = str1 + "</static></value></param>";
		// localObject =
		// (SendToDeviceCommand)CommandFactory.SendToDeviceProvider.a();
		// ((SendToDeviceCommand)localObject).c("REPEAT");
		// ((SendToDeviceCommand)localObject).b(100002);
		// ((SendToDeviceCommand)localObject).a(str1);
		// ((SendToDeviceCommand)localObject).a(paramInt);
		// boolean bool = this._director.a((Command)localObject);
		// if (!bool)
		// break;
		// this.x = paramBoolean;
		// }
		// }
		// catch (Exception i2)
		// {
		// Ln.e(localException);
		// int i2 = 0;
		// }
		// str2 = "0";
		// }
		// return str2;
		return false;
	}

	public AudioQueue.QueueState c() {
		return this.d;
	}

	public void c(int paramInt) {
		this.b = paramInt;
	}

	public void c(String paramString) {
		this.c = paramString;
	}

	public void c(boolean paramBoolean) {
		if ((paramBoolean) || (!this.p))
			this.m = paramBoolean;

	}

	public String d() {
		return this.e;
	}

	public void d(int paramInt) {
		this.f = paramInt;
	}

	public void d(String paramString) {
		this.e = paramString;
	}

	// ERROR //
	public void d(boolean paramBoolean) {
		// Byte code:
		// 0: aload_0
		// 1: iload_1
		// 2: putfield 64 com/control4/director/audio/DirectorAudioQueue:n Z
		// 5: aload_0
		// 6: getfield 429 com/control4/director/audio/DirectorAudioQueue:t
		// Ljava/util/TimerTask;
		// 9: ifnull +11 -> 20
		// 12: aload_0
		// 13: getfield 429 com/control4/director/audio/DirectorAudioQueue:t
		// Ljava/util/TimerTask;
		// 16: invokevirtual 350 java/util/TimerTask:cancel ()Z
		// 19: pop
		// 20: iload_1
		// 21: ifeq +48 -> 69
		// 24: aload_0
		// 25: getfield 431 com/control4/director/audio/DirectorAudioQueue:s
		// Ljava/util/Timer;
		// 28: ifnonnull +14 -> 42
		// 31: aload_0
		// 32: new 354 java/util/Timer
		// 35: dup
		// 36: invokespecial 357 java/util/Timer:<init> ()V
		// 39: putfield 431 com/control4/director/audio/DirectorAudioQueue:s
		// Ljava/util/Timer;
		// 42: aload_0
		// 43: new 433 com/control4/director/audio/DirectorAudioQueue$4
		// 46: dup
		// 47: aload_0
		// 48: invokespecial 434
		// com/control4/director/audio/DirectorAudioQueue$4:<init>
		// (Lcom/control4/director/audio/DirectorAudioQueue;)V
		// 51: putfield 429 com/control4/director/audio/DirectorAudioQueue:t
		// Ljava/util/TimerTask;
		// 54: aload_0
		// 55: getfield 431 com/control4/director/audio/DirectorAudioQueue:s
		// Ljava/util/Timer;
		// 58: aload_0
		// 59: getfield 429 com/control4/director/audio/DirectorAudioQueue:t
		// Ljava/util/TimerTask;
		// 62: ldc2_w 362
		// 65: invokevirtual 367 java/util/Timer:schedule
		// (Ljava/util/TimerTask;J)V
		// 68: return
		// 69: aload_0
		// 70: getfield 408 com/control4/director/audio/DirectorAudioQueue:B
		// Ljava/util/Vector;
		// 73: ifnull +73 -> 146
		// 76: aload_0
		// 77: getfield 408 com/control4/director/audio/DirectorAudioQueue:B
		// Ljava/util/Vector;
		// 80: invokevirtual 81 java/util/Vector:size ()I
		// 83: ifle +63 -> 146
		// 86: aload_0
		// 87: getfield 408 com/control4/director/audio/DirectorAudioQueue:B
		// Ljava/util/Vector;
		// 90: astore_2
		// 91: aload_2
		// 92: monitorenter
		// 93: aload_0
		// 94: getfield 408 com/control4/director/audio/DirectorAudioQueue:B
		// Ljava/util/Vector;
		// 97: invokevirtual 161 java/util/Vector:iterator
		// ()Ljava/util/Iterator;
		// 100: astore 4
		// 102: aload 4
		// 104: invokeinterface 167 1 0
		// 109: ifeq +63 -> 172
		// 112: aload 4
		// 114: invokeinterface 171 1 0
		// 119: checkcast 193 com/control4/director/audio/DirectorSong
		// 122: astore_3
		// 123: aload_3
		// 124: ifnull -22 -> 102
		// 127: aload_3
		// 128: iconst_1
		// 129: invokevirtual 436 com/control4/director/audio/DirectorSong:g
		// (Z)V
		// 132: goto -30 -> 102
		// 135: astore_3
		// 136: aload_2
		// 137: monitorexit
		// 138: aload_3
		// 139: athrow
		// 140: astore_2
		// 141: aload_2
		// 142: invokestatic 181 roboguice/util/Ln:e (Ljava/lang/Throwable;)I
		// 145: pop
		// 146: aload_0
		// 147: invokevirtual 124
		// com/control4/director/audio/DirectorAudioQueue:u ()V
		// 150: aload_0
		// 151: getfield 431 com/control4/director/audio/DirectorAudioQueue:s
		// Ljava/util/Timer;
		// 154: ifnull -86 -> 68
		// 157: aload_0
		// 158: getfield 431 com/control4/director/audio/DirectorAudioQueue:s
		// Ljava/util/Timer;
		// 161: invokevirtual 356 java/util/Timer:cancel ()V
		// 164: aload_0
		// 165: aconst_null
		// 166: putfield 431 com/control4/director/audio/DirectorAudioQueue:s
		// Ljava/util/Timer;
		// 169: goto -101 -> 68
		// 172: aload_2
		// 173: monitorexit
		// 174: goto -28 -> 146
		//
		// Exception table:
		// from to target type
		// 93 138 135 finally
		// 172 174 135 finally
		// 86 93 140 java/lang/Exception
		// 138 140 140 java/lang/Exception
	}

	public int e() {
		return this.f;
	}

	public void e(int paramInt) {
		this.i = paramInt;
	}

	public void e(String paramString) {
		this.h = paramString;
	}

	public void e(boolean paramBoolean) {
		// this.o = paramBoolean;
		// if (this.v != null)
		// this.v.cancel();
		// if (!paramBoolean)
		// {
		// u();
		// if (this.u != null)
		// {
		// this.u.cancel();
		// this.u = null;
		// }
		// }
		// else
		// {
		// if (this.u == null)
		// this.u = new Timer();
		// this.v = new DirectorAudioQueue.5(this);
		// this.u.schedule(this.v, 30000L);
		// }
	}

	public long f() {
		return this.g;
	}

	public void f(int paramInt) {
		if (this.y == null)
			this.y = new Vector();
		this.y.add(Integer.valueOf(paramInt));
	}

	public void f(String paramString) {
		this.j = paramString;
	}

	public void f(boolean paramBoolean) {
		this.w = paramBoolean;
		u();
	}

	public String g() {
		return this.h;
	}

	public void g(boolean paramBoolean) {
		this.x = paramBoolean;
		u();
	}

	public int h() {
		return this.i;
	}

	public String i() {
		return this.j;
	}

	public boolean j() {
		return this.k;
	}

	public boolean k() {
		return this.l;
	}

	public boolean l() {
		return this.m;
	}

	public boolean m() {
		boolean i1 = false;
		if ((!this.n) && (!this.o))
			i1 = false;
		else
			i1 = true;
		return i1;
	}

	public boolean n() {
		return this.w;
	}

	public boolean o() {
		return this.x;
	}

	public Vector<Integer> p() {
		return this.y;
	}

	public Song q() {
		// try
		// {
		// if ((this.y != null) && (this.y.size() > 0))
		// {
		// localObject1 =
		// this._director.m().h(((Integer)this.y.get(0)).intValue());
		// if (localObject1 != null)
		// {
		// localObject1 = ((Room)localObject1).at();
		// if (localObject1 != null)
		// localObject1 = ((AudioLibrary)localObject1).a(this.e, true, null);
		// }
		// }
		// for (Object localObject1 = localObject1; ; localObject1 = null)
		// return localObject1;
		// }
		// catch (Exception localObject2)
		// {
		//
		// }
		return null;
	}

	public void r() {
		//
		// try
		// {
		// int i2 = t();
		// int i1 = 0;
		// if (i1 < i2)
		// {
		// Song localSong = b(i1);
		// if (((this.e != null) && (this.e.equals(localSong.at()))) || ((this.h
		// != null) && (this.h.equals(localSong.at()))))
		// break label83;
		// localSong.h();
		// }
		// }
		// catch (Exception localException)
		// {
		// Ln.e(localException);
		// }

	}

	public String s() {
		// Object localObject3;
		// Object localObject2;
		// String str;
		// try
		// {
		// Object localObject1;
		// if (this._director == null)
		// {
		// localObject1 = b();
		// }
		// else
		// {
		// DirectorProject localDirectorProject = this._director.m();
		// if (localDirectorProject == null)
		// {
		// localObject1 = b();
		// }
		// else
		// {
		// localObject3 = null;
		// localObject1 = this.y.iterator();
		// if (((Iterator)localObject1).hasNext())
		// {
		// localObject2 =
		// localDirectorProject.h(((Integer)((Iterator)localObject1).next()).intValue());
		// if (localObject2 == null)
		// break label180;
		// if (localObject3 == null)
		// {
		// localObject2 = new StringBuilder(((Room)localObject2).b());
		// break label174;
		// }
		// localObject3.append(", " + ((Room)localObject2).b());
		// break label180;
		// }
		// localObject1 = localObject3.toString();
		// if ((localObject1 == null) || (((String)localObject1).length() <= 0))
		// {
		// localObject1 = b();
		// localObject1 = localObject1;
		// }
		// }
		// }
		// }
		// catch (Exception str)
		// {
		// Ln.e(localException);
		// str = b();
		// }
		// return str;
		// while (true)
		// {
		// label174: localObject3 = localObject2;
		// break;
		// label180: localObject2 = localObject3;
		// }
		return "";
	}

	public int t() {
		int i1;
		if (this.z == null)
			i1 = 0;
		else
			i1 = this.z.c();
		return i1;
	}

	public String toString() {
		return "DirectorAudioQueue [_id=" + this.b + ", _name=" + this.c + "]";
	}

	// ERROR //
	public void u() {

	}

	public void v() {
		if (this.z != null)
			this.z.clear();
		c(true);
	}
}
