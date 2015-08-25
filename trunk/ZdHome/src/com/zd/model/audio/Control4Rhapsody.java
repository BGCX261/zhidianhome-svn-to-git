package com.zd.model.audio;

import java.util.Vector;

import com.zd.model.rhapsody.Rhapsody;
import com.zd.model.rhapsody.RhapsodyChannelGuide;
import com.zd.model.rhapsody.RhapsodyConnection;
import com.zd.model.rhapsody.RhapsodyMusicGuide;
import com.zd.model.rhapsody.RhapsodyPlaylistCentral;
import com.zd.model.rhapsody.RhapsodySearch;
import com.zd.model.rhapsody.RhapsodyUser;

public class Control4Rhapsody // extends DirectorDevice
		implements Rhapsody {
	public static final int A = 11;
	public static final int B = 12;
	public static final int C = 13;
	public static final int D = 14;
	public static final int E = 15;
	public static final int F = 16;
	public static final int G = 17;
	public static final int H = 18;
	public static final int I = 19;
	public static final int J = 20;
	public static final int K = 21;
	public static final int L = 22;
	public static final int M = 23;
	public static final int N = 24;
	public static final int O = 25;
	public static final int P = 26;
	public static final int Q = 27;
	public static final int R = 28;
	public static final int S = 29;
	public static final int T = 30;
	public static final int U = 31;
	public static final int V = 32;
	public static final int W = 33;
	public static final int X = 34;
	public static final int Y = 35;
	public static final int Z = 36;
	public static final int aA = 63;
	public static final int aB = 64;
	public static final int aC = 65;
	public static final int aD = 2;
	public static final int aE = 1;
	public static final int aF = 2;
	public static final int aG = 4;
	public static final int aH = 8;
	public static final int aI = 16;
	public static final int aJ = 32;
	public static final int aK = 64;
	public static final int aL = 128;
	public static final int aM = 256;
	public static final int aN = -1;
	private static final int aQ = 10000;
	private static final int aR = 10000;
	private static final int aS = 5;
	private static final int aT = 90000;
	private static final long aU = 15000L;
	private static final long aV = 20000L;
	private static final long aW = 30000L;
	private static final long aX = 92000L;
	private static final String aY = "GET_ACTIVE_ACCOUNT";
	private static final String aZ = "GET_ACCOUNT_LIST";
	public static final int aa = 37;
	public static final int ab = 38;
	public static final int ac = 39;
	public static final int ad = 40;
	public static final int ae = 41;
	public static final int af = 42;
	public static final int ag = 43;
	public static final int ah = 44;
	public static final int ai = 45;
	public static final int aj = 46;
	public static final int ak = 47;
	public static final int al = 48;
	public static final int am = 49;
	public static final int an = 50;
	public static final int ao = 51;
	public static final int ap = 52;
	public static final int aq = 53;
	public static final int ar = 54;
	public static final int as = 55;
	public static final int at = 56;
	public static final int au = 57;
	public static final int av = 58;
	public static final int aw = 59;
	public static final int ax = 60;
	public static final int ay = 61;
	public static final int az = 62;
	private static final String ba = "SET_ACTIVE_ACCOUNT";
	private static final String bb = "SET_ACCOUNT_FLAGS";
	private static final String bc = "ADD_ACCOUNT";
	private static final String bd = "DELETE_ACCOUNT";
	private static final String be = "LOGOUT";
	private static final int bf = 1000;
	protected static final long k = 39000L;
	public static final String l = "C4SoapResponse";
	public static final String m = "seq";
	public static final String n = "name";
	public static final String o = "result";
	public static final int p = 0;
	public static final int q = 1;
	public static final int r = 2;
	public static final int s = 3;
	public static final int t = 4;
	public static final int u = 5;
	public static final int v = 6;
	public static final int w = 7;
	public static final int x = 8;
	public static final int y = 9;
	public static final int z = 10;

	//
	// @g
	// private Application _applicationContext;
	//
	// @g
	// private aw<C4RhapsodyChannelGuide> _channelGuideProvider;
	//
	// @g
	// private aw<C4RhapsodyMusicGuide> _musicGuideProvider;
	//
	// @g
	// private aw<C4RhapsodyPlaylistCentral> _playlistCentralProvider;
	//
	// @g
	// public aw<C4RhapsodyAlbum> _rhapsodyAlbumProvider;
	//
	// @g
	// public aw<C4RhapsodyArtist> _rhapsodyArtistProvider;
	//
	// @g
	// public aw<C4RhapsodyChannel> _rhapsodyChannelProvider;
	//
	// @g
	// public aw<C4RhapsodyGenre> _rhapsodyGenreProvider;
	//
	// @g
	// public aw<C4RhapsodyPlaylist> _rhapsodyPlaylistProvider;
	//
	// @g
	// public aw<C4RhapsodySong> _rhapsodySongProvider;
	//
	// @g
	// private aw<C4RhapsodySearch> _searchProvider;
	//
	// @g
	// private aw<C4RhapsodyUser> _userProvider;
	// protected Timer aO;
	// protected TimerTask aP;
	// private RhapsodyUser bA;
	// private RhapsodyAgentInfo bB;
	// private boolean bC = false;
	// private String bD;
	// private boolean bE = false;
	// private boolean bF = true;
	// private RhapsodyMusicGuide bG;
	// private RhapsodyPlaylistCentral bH;
	// private RhapsodyChannelGuide bI;
	// private RhapsodySearch bJ;
	// private boolean bg = false;
	// private boolean bh = false;
	// private Socket bi;
	// private Thread bj;
	// private Thread bk;
	// private Timer bl;
	// private TimerTask bm;
	// private volatile long bn = 0L;
	// private final ConditionVariable bo = new ConditionVariable(false);
	// private final ArrayList<RhapsodyCommand> bp = new ArrayList();
	// private final BlockingPriorityCommandQueue bq = new
	// BlockingPriorityCommandQueue();
	// private RhapsodyConnection br;
	// private boolean bs;
	// private final ArrayList<Rhapsody.RhapsodyListener> bt = new ArrayList();
	// private boolean bu = false;
	// private boolean bv = false;
	// private RhapsodyUser bw;
	// private RhapsodyUser bx;
	// private boolean by = false;
	// private boolean bz = false;
	//
	// public Control4Rhapsody()
	// {
	// d(100119);
	// this.b = "Rhapsody";
	// this.i = true;
	// }
	//
	// // ERROR //
	// private void L()
	// {
	// // Byte code:
	// // 0: aload_0
	// // 1: invokevirtual 347 com/control4/director/rhapsody/Control4Rhapsody:i
	// ()Z
	// // 4: ifne +111 -> 115
	// // 7: aload_0
	// // 8: invokevirtual 351 com/control4/director/rhapsody/Control4Rhapsody:f
	// ()Lcom/control4/director/rhapsody/RhapsodyUser;
	// // 11: ifnonnull +104 -> 115
	// // 14: aload_0
	// // 15: invokevirtual 354
	// com/control4/director/rhapsody/Control4Rhapsody:x_ ()Z
	// // 18: ifne +26 -> 44
	// // 21: aload_0
	// // 22: invokevirtual 347
	// com/control4/director/rhapsody/Control4Rhapsody:i ()Z
	// // 25: ifne +90 -> 115
	// // 28: aload_0
	// // 29: invokevirtual 356
	// com/control4/director/rhapsody/Control4Rhapsody:I ()Z
	// // 32: ifne +83 -> 115
	// // 35: aload_0
	// // 36: aconst_null
	// // 37: invokevirtual 360
	// com/control4/director/rhapsody/Control4Rhapsody:c
	// (Lcom/control4/director/rhapsody/Rhapsody$RhapsodyListener;)Z
	// // 40: pop
	// // 41: goto +74 -> 115
	// // 44: aload_0
	// // 45: getfield 315 com/control4/director/rhapsody/Control4Rhapsody:bt
	// Ljava/util/ArrayList;
	// // 48: ifnull +67 -> 115
	// // 51: aload_0
	// // 52: getfield 315 com/control4/director/rhapsody/Control4Rhapsody:bt
	// Ljava/util/ArrayList;
	// // 55: astore_1
	// // 56: aload_1
	// // 57: monitorenter
	// // 58: aload_0
	// // 59: getfield 315 com/control4/director/rhapsody/Control4Rhapsody:bt
	// Ljava/util/ArrayList;
	// // 62: invokevirtual 364 java/util/ArrayList:iterator
	// ()Ljava/util/Iterator;
	// // 65: astore_2
	// // 66: aload_2
	// // 67: invokeinterface 369 1 0
	// // 72: ifeq +41 -> 113
	// // 75: aload_2
	// // 76: invokeinterface 373 1 0
	// // 81: checkcast 375
	// com/control4/director/rhapsody/Rhapsody$RhapsodyListener
	// // 84: astore_3
	// // 85: aload_3
	// // 86: ifnull -20 -> 66
	// // 89: aload_3
	// // 90: aload_0
	// // 91: invokeinterface 378 2 0
	// // 96: goto -30 -> 66
	// // 99: astore_2
	// // 100: aload_1
	// // 101: monitorexit
	// // 102: aload_2
	// // 103: athrow
	// // 104: astore_1
	// // 105: aload_1
	// // 106: invokestatic 384 roboguice/util/Ln:e (Ljava/lang/Throwable;)I
	// // 109: pop
	// // 110: goto +5 -> 115
	// // 113: aload_1
	// // 114: monitorexit
	// // 115: return
	// //
	// // Exception table:
	// // from to target type
	// // 58 102 99 finally
	// // 113 115 99 finally
	// // 0 58 104 java/lang/Exception
	// // 102 104 104 java/lang/Exception
	// }
	//
	// private void M()
	// {
	// try
	// {
	// Object localObject = (DirectorRoom)this._director.m().s();
	// if (localObject != null)
	// {
	// localObject =
	// (DirectorRhapsodyAudioLibrary)((DirectorRoom)localObject).au();
	// if (localObject != null)
	// ((DirectorRhapsodyAudioLibrary)localObject).N();
	// }
	// return;
	// }
	// catch (Exception localException)
	// {
	// while (true)
	// Ln.e(localException);
	// }
	// }
	//
	// private void N()
	// {
	// try
	// {
	// this.bl = new Timer();
	// this.bm = new Control4Rhapsody.3(this);
	// this.bl.schedule(this.bm, 15000L, 20000L);
	// return;
	// }
	// catch (Exception localException)
	// {
	// while (true)
	// Ln.e(localException);
	// }
	// }
	//
	// private void O()
	// {
	// try
	// {
	// GetRhapsodyAuthorizationCommand localGetRhapsodyAuthorizationCommand =
	// (GetRhapsodyAuthorizationCommand)RhapsodyCommandFactory.GetRhapsodyAuthorizationProvider.a();
	// localGetRhapsodyAuthorizationCommand.a("is-from-ping",
	// Boolean.valueOf(true));
	// this.by = a(localGetRhapsodyAuthorizationCommand);
	// return;
	// }
	// catch (Exception localException)
	// {
	// while (true)
	// Ln.e(localException);
	// }
	// }
	//
	// private void P()
	// {
	// try
	// {
	// if (this.bm != null)
	// {
	// this.bm.cancel();
	// this.bm = null;
	// }
	// if (this.bl != null)
	// {
	// this.bl.cancel();
	// this.bl = null;
	// }
	// return;
	// }
	// catch (Exception localException)
	// {
	// while (true)
	// Ln.a(localException);
	// }
	// }
	//
	// private void j(boolean paramBoolean)
	// {
	// this.bE = paramBoolean;
	// }
	//
	// // ERROR //
	// private void k(boolean paramBoolean)
	// {
	// // Byte code:
	// // 0: aload_0
	// // 1: getfield 484 com/control4/director/rhapsody/Control4Rhapsody:bs Z
	// // 4: ifne +4 -> 8
	// // 7: return
	// // 8: new 486 java/lang/StringBuilder
	// // 11: dup
	// // 12: invokespecial 487 java/lang/StringBuilder:<init> ()V
	// // 15: ldc_w 489
	// // 18: invokevirtual 493 java/lang/StringBuilder:append
	// (Ljava/lang/String;)Ljava/lang/StringBuilder;
	// // 21: iload_1
	// // 22: invokevirtual 496 java/lang/StringBuilder:append
	// (Z)Ljava/lang/StringBuilder;
	// // 25: invokevirtual 500 java/lang/StringBuilder:toString
	// ()Ljava/lang/String;
	// // 28: iconst_0
	// // 29: anewarray 502 java/lang/Object
	// // 32: invokestatic 505 roboguice/util/Ln:b
	// (Ljava/lang/Object;[Ljava/lang/Object;)I
	// // 35: pop
	// // 36: aload_0
	// // 37: monitorenter
	// // 38: aload_0
	// // 39: getfield 507 com/control4/director/rhapsody/Control4Rhapsody:bj
	// Ljava/lang/Thread;
	// // 42: ifnull +15 -> 57
	// // 45: aload_0
	// // 46: getfield 507 com/control4/director/rhapsody/Control4Rhapsody:bj
	// Ljava/lang/Thread;
	// // 49: invokevirtual 512 java/lang/Thread:interrupt ()V
	// // 52: aload_0
	// // 53: aconst_null
	// // 54: putfield 507 com/control4/director/rhapsody/Control4Rhapsody:bj
	// Ljava/lang/Thread;
	// // 57: aload_0
	// // 58: getfield 514 com/control4/director/rhapsody/Control4Rhapsody:bk
	// Ljava/lang/Thread;
	// // 61: ifnull +15 -> 76
	// // 64: aload_0
	// // 65: getfield 514 com/control4/director/rhapsody/Control4Rhapsody:bk
	// Ljava/lang/Thread;
	// // 68: invokevirtual 512 java/lang/Thread:interrupt ()V
	// // 71: aload_0
	// // 72: aconst_null
	// // 73: putfield 514 com/control4/director/rhapsody/Control4Rhapsody:bk
	// Ljava/lang/Thread;
	// // 76: aload_0
	// // 77: invokespecial 479
	// com/control4/director/rhapsody/Control4Rhapsody:P ()V
	// // 80: aload_0
	// // 81: getfield 313 com/control4/director/rhapsody/Control4Rhapsody:bq
	// Lcom/control4/util/BlockingPriorityCommandQueue;
	// // 84: invokevirtual 516 com/control4/util/BlockingPriorityCommandQueue:d
	// ()V
	// // 87: aload_0
	// // 88: getfield 308 com/control4/director/rhapsody/Control4Rhapsody:bp
	// Ljava/util/ArrayList;
	// // 91: invokevirtual 519 java/util/ArrayList:clear ()V
	// // 94: aload_0
	// // 95: getfield 470 com/control4/director/rhapsody/Control4Rhapsody:bi
	// Ljava/net/Socket;
	// // 98: ifnull +15 -> 113
	// // 101: aload_0
	// // 102: getfield 470 com/control4/director/rhapsody/Control4Rhapsody:bi
	// Ljava/net/Socket;
	// // 105: invokevirtual 524 java/net/Socket:close ()V
	// // 108: aload_0
	// // 109: aconst_null
	// // 110: putfield 470 com/control4/director/rhapsody/Control4Rhapsody:bi
	// Ljava/net/Socket;
	// // 113: aload_0
	// // 114: aconst_null
	// // 115: putfield 526 com/control4/director/rhapsody/Control4Rhapsody:br
	// Lcom/control4/director/rhapsody/RhapsodyConnection;
	// // 118: aload_0
	// // 119: iconst_0
	// // 120: putfield 484 com/control4/director/rhapsody/Control4Rhapsody:bs Z
	// // 123: aload_0
	// // 124: aconst_null
	// // 125: putfield 462 com/control4/director/rhapsody/Control4Rhapsody:bw
	// Lcom/control4/director/rhapsody/RhapsodyUser;
	// // 128: aload_0
	// // 129: aconst_null
	// // 130: putfield 528 com/control4/director/rhapsody/Control4Rhapsody:bA
	// Lcom/control4/director/rhapsody/RhapsodyUser;
	// // 133: aload_0
	// // 134: iconst_0
	// // 135: putfield 323 com/control4/director/rhapsody/Control4Rhapsody:bz Z
	// // 138: aload_0
	// // 139: iconst_0
	// // 140: putfield 319 com/control4/director/rhapsody/Control4Rhapsody:bv Z
	// // 143: aload_0
	// // 144: aconst_null
	// // 145: putfield 530 com/control4/director/rhapsody/Control4Rhapsody:bB
	// Lcom/control4/director/rhapsody/RhapsodyAgentInfo;
	// // 148: aload_0
	// // 149: iconst_0
	// // 150: putfield 325 com/control4/director/rhapsody/Control4Rhapsody:bC Z
	// // 153: aload_0
	// // 154: aconst_null
	// // 155: putfield 532 com/control4/director/rhapsody/Control4Rhapsody:bx
	// Lcom/control4/director/rhapsody/RhapsodyUser;
	// // 158: aload_0
	// // 159: iload_1
	// // 160: invokespecial 534
	// com/control4/director/rhapsody/Control4Rhapsody:l (Z)V
	// // 163: aload_0
	// // 164: invokevirtual 537
	// com/control4/director/rhapsody/Control4Rhapsody:l
	// ()Lcom/control4/director/rhapsody/RhapsodyMusicGuide;
	// // 167: astore_2
	// // 168: aload_2
	// // 169: ifnull +20 -> 189
	// // 172: aload_2
	// // 173: invokeinterface 540 1 0
	// // 178: aload_2
	// // 179: invokeinterface 542 1 0
	// // 184: aload_0
	// // 185: aconst_null
	// // 186: putfield 544 com/control4/director/rhapsody/Control4Rhapsody:bG
	// Lcom/control4/director/rhapsody/RhapsodyMusicGuide;
	// // 189: aload_0
	// // 190: invokevirtual 547
	// com/control4/director/rhapsody/Control4Rhapsody:m
	// ()Lcom/control4/director/rhapsody/RhapsodyPlaylistCentral;
	// // 193: astore_2
	// // 194: aload_2
	// // 195: ifnull +14 -> 209
	// // 198: aload_2
	// // 199: invokeinterface 551 1 0
	// // 204: aload_0
	// // 205: aconst_null
	// // 206: putfield 553 com/control4/director/rhapsody/Control4Rhapsody:bH
	// Lcom/control4/director/rhapsody/RhapsodyPlaylistCentral;
	// // 209: aload_0
	// // 210: invokevirtual 556
	// com/control4/director/rhapsody/Control4Rhapsody:n
	// ()Lcom/control4/director/rhapsody/RhapsodyChannelGuide;
	// // 213: astore_2
	// // 214: aload_2
	// // 215: ifnull +14 -> 229
	// // 218: aload_2
	// // 219: invokeinterface 560 1 0
	// // 224: aload_0
	// // 225: aconst_null
	// // 226: putfield 562 com/control4/director/rhapsody/Control4Rhapsody:bI
	// Lcom/control4/director/rhapsody/RhapsodyChannelGuide;
	// // 229: aload_0
	// // 230: aconst_null
	// // 231: putfield 564 com/control4/director/rhapsody/Control4Rhapsody:bJ
	// Lcom/control4/director/rhapsody/RhapsodySearch;
	// // 234: aload_0
	// // 235: monitorexit
	// // 236: goto -229 -> 7
	// // 239: astore_2
	// // 240: aload_0
	// // 241: monitorexit
	// // 242: aload_2
	// // 243: athrow
	// // 244: astore_2
	// // 245: aload_2
	// // 246: ldc_w 566
	// // 249: iconst_0
	// // 250: anewarray 502 java/lang/Object
	// // 253: invokestatic 569 roboguice/util/Ln:e
	// (Ljava/lang/Throwable;Ljava/lang/Object;[Ljava/lang/Object;)I
	// // 256: pop
	// // 257: goto -144 -> 113
	// // 260: astore_2
	// // 261: aload_2
	// // 262: invokestatic 384 roboguice/util/Ln:e (Ljava/lang/Throwable;)I
	// // 265: pop
	// // 266: goto -32 -> 234
	// //
	// // Exception table:
	// // from to target type
	// // 38 94 239 finally
	// // 94 113 239 finally
	// // 113 163 239 finally
	// // 163 234 239 finally
	// // 234 242 239 finally
	// // 245 266 239 finally
	// // 94 113 244 java/io/IOException
	// // 163 234 260 java/lang/Exception
	// }
	//
	// // ERROR //
	// private void l(boolean paramBoolean)
	// {
	// // Byte code:
	// // 0: aload_0
	// // 1: getfield 315 com/control4/director/rhapsody/Control4Rhapsody:bt
	// Ljava/util/ArrayList;
	// // 4: ifnonnull +4 -> 8
	// // 7: return
	// // 8: aload_0
	// // 9: getfield 315 com/control4/director/rhapsody/Control4Rhapsody:bt
	// Ljava/util/ArrayList;
	// // 12: astore_2
	// // 13: aload_2
	// // 14: monitorenter
	// // 15: aload_0
	// // 16: getfield 315 com/control4/director/rhapsody/Control4Rhapsody:bt
	// Ljava/util/ArrayList;
	// // 19: invokevirtual 364 java/util/ArrayList:iterator
	// ()Ljava/util/Iterator;
	// // 22: astore_3
	// // 23: aload_3
	// // 24: invokeinterface 369 1 0
	// // 29: ifeq +27 -> 56
	// // 32: aload_3
	// // 33: invokeinterface 373 1 0
	// // 38: checkcast 375
	// com/control4/director/rhapsody/Rhapsody$RhapsodyListener
	// // 41: aload_0
	// // 42: iload_1
	// // 43: invokeinterface 574 3 0
	// // 48: goto -25 -> 23
	// // 51: astore_3
	// // 52: aload_2
	// // 53: monitorexit
	// // 54: aload_3
	// // 55: athrow
	// // 56: aload_2
	// // 57: monitorexit
	// // 58: goto -51 -> 7
	// //
	// // Exception table:
	// // from to target type
	// // 15 54 51 finally
	// // 56 58 51 finally
	// }
	//
	// public boolean E()
	// {
	// return this.bg;
	// }
	//
	// public boolean F()
	// {
	// return this.bh;
	// }
	//
	// public RhapsodyUser G()
	// {
	// return this.bw;
	// }
	//
	// public RhapsodyAgentInfo H()
	// {
	// return this.bB;
	// }
	//
	// public boolean I()
	// {
	// return this.by;
	// }
	//
	// public boolean J()
	// {
	// return this.bz;
	// }
	//
	// public boolean K()
	// {
	// try
	// {
	// boolean bool =
	// a((RhapsodyCommand)RhapsodyCommandFactory.GetRhapsodyAuthorizationProvider.a());
	// this.by = bool;
	// return bool;
	// }
	// catch (Exception i)
	// {
	// while (true)
	// {
	// Ln.e(localException);
	// int i = 0;
	// }
	// }
	// }
	//
	// public Device.DeviceType a()
	// {
	// return Device.DeviceType.s;
	// }
	//
	// // ERROR //
	// public void a(com.control4.director.data.Variable paramVariable, boolean
	// paramBoolean)
	// {
	// // Byte code:
	// // 0: aload_1
	// // 1: ifnull +134 -> 135
	// // 4: aload_1
	// // 5: invokevirtual 589 com/control4/director/data/Variable:b ()I
	// // 8: sipush 1000
	// // 11: if_icmpne +124 -> 135
	// // 14: aload_0
	// // 15: aload_1
	// // 16: invokevirtual 591 com/control4/director/data/Variable:c
	// ()Ljava/lang/String;
	// // 19: invokestatic 596 com/control4/util/BooleanUtil:a
	// (Ljava/lang/String;)Z
	// // 22: invokevirtual 598
	// com/control4/director/rhapsody/Control4Rhapsody:f (Z)V
	// // 25: aload_0
	// // 26: getfield 388
	// com/control4/director/rhapsody/Control4Rhapsody:_director
	// Lcom/control4/director/Control4Director;
	// // 29: invokevirtual 393 com/control4/director/Control4Director:m
	// ()Lcom/control4/director/data/DirectorProject;
	// // 32: invokevirtual 398 com/control4/director/data/DirectorProject:s
	// ()Lcom/control4/director/data/Room;
	// // 35: checkcast 400 com/control4/director/data/DirectorRoom
	// // 38: astore_3
	// // 39: aload_3
	// // 40: ifnull +7 -> 47
	// // 43: aload_3
	// // 44: invokevirtual 600 com/control4/director/data/DirectorRoom:aS ()V
	// // 47: aload_0
	// // 48: getfield 603 com/control4/director/rhapsody/Control4Rhapsody:j
	// Lcom/control4/director/device/Device$OnDeviceUpdateListener;
	// // 51: ifnull +13 -> 64
	// // 54: aload_0
	// // 55: getfield 603 com/control4/director/rhapsody/Control4Rhapsody:j
	// Lcom/control4/director/device/Device$OnDeviceUpdateListener;
	// // 58: aload_0
	// // 59: invokeinterface 608 2 0
	// // 64: aload_0
	// // 65: getfield 315 com/control4/director/rhapsody/Control4Rhapsody:bt
	// Ljava/util/ArrayList;
	// // 68: ifnull +67 -> 135
	// // 71: aload_0
	// // 72: getfield 315 com/control4/director/rhapsody/Control4Rhapsody:bt
	// Ljava/util/ArrayList;
	// // 75: invokevirtual 611 java/util/ArrayList:size ()I
	// // 78: ifle +57 -> 135
	// // 81: aload_0
	// // 82: getfield 315 com/control4/director/rhapsody/Control4Rhapsody:bt
	// Ljava/util/ArrayList;
	// // 85: astore_3
	// // 86: aload_3
	// // 87: monitorenter
	// // 88: aload_0
	// // 89: getfield 315 com/control4/director/rhapsody/Control4Rhapsody:bt
	// Ljava/util/ArrayList;
	// // 92: invokevirtual 364 java/util/ArrayList:iterator
	// ()Ljava/util/Iterator;
	// // 95: astore 4
	// // 97: aload 4
	// // 99: invokeinterface 369 1 0
	// // 104: ifeq +29 -> 133
	// // 107: aload 4
	// // 109: invokeinterface 373 1 0
	// // 114: checkcast 375
	// com/control4/director/rhapsody/Rhapsody$RhapsodyListener
	// // 117: aload_0
	// // 118: invokeinterface 613 2 0
	// // 123: goto -26 -> 97
	// // 126: astore 4
	// // 128: aload_3
	// // 129: monitorexit
	// // 130: aload 4
	// // 132: athrow
	// // 133: aload_3
	// // 134: monitorexit
	// // 135: return
	// //
	// // Exception table:
	// // from to target type
	// // 88 130 126 finally
	// // 133 135 126 finally
	// }
	//
	// public void a(Rhapsody.RhapsodyListener paramRhapsodyListener)
	// {
	// ArrayList localArrayList = this.bt;
	// monitorenter;
	// if (paramRhapsodyListener != null);
	// try
	// {
	// if (!this.bt.contains(paramRhapsodyListener))
	// this.bt.add(paramRhapsodyListener);
	// monitorexit;
	// return;
	// }
	// finally
	// {
	// localObject = finally;
	// monitorexit;
	// }
	// throw localObject;
	// }
	//
	// public void a(RhapsodyUser paramRhapsodyUser)
	// {
	// this.bw = paramRhapsodyUser;
	// }
	//
	// public void a(String paramString, XmlPullParser paramXmlPullParser)
	// {
	// while (true)
	// {
	// String str1;
	// try
	// {
	// Ln.b("Rhapsody-Received: " + paramString, new Object[0]);
	// paramXmlPullParser.setInput(new StringReader(paramString));
	// int i = paramXmlPullParser.getEventType();
	// if ((Thread.interrupted()) || (i == 1))
	// break label442;
	// if (i != 2)
	// continue;
	// Object localObject = paramXmlPullParser.getName();
	// if ((localObject == null) ||
	// (!((String)localObject).equals("C4SoapResponse")))
	// continue;
	// localObject = "";
	// int i3 = 0;
	// int i1 = 0;
	// if (i3 >= paramXmlPullParser.getAttributeCount())
	// break label434;
	// String str2 = paramXmlPullParser.getAttributeName(i3);
	// if (!str2.equals("seq"))
	// continue;
	// l1 = Long.parseLong(paramXmlPullParser.getAttributeValue(i3));
	// int i4 = RhapsodyResponseParser.a((String)localObject);
	// if (this.bp.size() <= 0)
	// break label419;
	// localRhapsodyCommand = (RhapsodyCommand)this.bp.remove(0);
	// if (localRhapsodyCommand != null)
	// {
	// localRhapsodyResponseParser =
	// (RhapsodyResponseParser)localRhapsodyCommand.m_();
	// if (localRhapsodyResponseParser != null)
	// continue;
	// localRhapsodyResponseParser = RhapsodyParserFactory.a(i4);
	// if (localRhapsodyResponseParser == null)
	// continue;
	// localRhapsodyResponseParser.a(localRhapsodyCommand);
	// if (localRhapsodyResponseParser == null)
	// break label442;
	// localRhapsodyResponseParser.a(this.bh);
	// localRhapsodyResponseParser.b((String)localObject);
	// localRhapsodyResponseParser.a(l1);
	// localRhapsodyResponseParser.b(i1);
	// localRhapsodyResponseParser.i();
	// localRhapsodyResponseParser.a(paramXmlPullParser);
	// localObject =
	// (Runnable)localRhapsodyCommand.b("response-received-runnable");
	// if (localObject == null)
	// break label442;
	// ((Runnable)localObject).run();
	// break label442;
	// if (!str2.equals("name"))
	// continue;
	// localObject = paramXmlPullParser.getAttributeValue(l1);
	// i1 = i1;
	// break label443;
	// if (!str2.equals("result"))
	// break label425;
	// i1 = Integer.parseInt(paramXmlPullParser.getAttributeValue(l1));
	// localObject = localObject;
	// i1 = i1;
	// localObject = localObject;
	// break label443;
	// int j = paramXmlPullParser.next();
	// j = j;
	// continue;
	// }
	// }
	// catch (XmlPullParserException localXmlPullParserException)
	// {
	// str1 = localXmlPullParserException.getMessage();
	// if ((str1.startsWith("PI must not start with xml")) ||
	// (str1.startsWith("processing instructions must not start with xml")) ||
	// (str1.contains("must not start with xml")))
	// break label442;
	// Ln.e(localXmlPullParserException, "Problem with Rhapsody pull parser",
	// new Object[0]);
	// }
	// catch (Exception localException1)
	// {
	// Ln.e(localException1);
	// }
	// RhapsodyResponseParser localRhapsodyResponseParser = null;
	// continue;
	// label419: RhapsodyCommand localRhapsodyCommand = null;
	// continue;
	// label425: Exception localException2 = localException1;
	// int i2 = str1;
	// break label443;
	// label434: long l1 = -1L;
	// continue;
	// label442: return;
	// label443: l1++;
	// i2 = i2;
	// localException2 = localException2;
	// }
	// }
	//
	// // ERROR //
	// public void a(XmlPullParser paramXmlPullParser,
	// com.control4.director.command.Command paramCommand)
	// {
	// // Byte code:
	// // 0: aconst_null
	// // 1: astore_3
	// // 2: aload_1
	// // 3: ifnull +7 -> 10
	// // 6: aload_2
	// // 7: ifnonnull +17 -> 24
	// // 10: ldc_w 744
	// // 13: iconst_0
	// // 14: anewarray 502 java/lang/Object
	// // 17: invokestatic 746 roboguice/util/Ln:e
	// (Ljava/lang/Object;[Ljava/lang/Object;)I
	// // 20: pop
	// // 21: goto +498 -> 519
	// // 24: aload_2
	// // 25: ldc_w 748
	// // 28: invokevirtual 751 com/control4/director/command/Command:b
	// (Ljava/lang/String;)Ljava/lang/Object;
	// // 31: checkcast 649 java/lang/String
	// // 34: astore 4
	// // 36: aload 4
	// // 38: ifnull +11 -> 49
	// // 41: aload 4
	// // 43: invokevirtual 754 java/lang/String:length ()I
	// // 46: ifne +26 -> 72
	// // 49: ldc_w 756
	// // 52: iconst_0
	// // 53: anewarray 502 java/lang/Object
	// // 56: invokestatic 746 roboguice/util/Ln:e
	// (Ljava/lang/Object;[Ljava/lang/Object;)I
	// // 59: pop
	// // 60: goto +459 -> 519
	// // 63: astore_3
	// // 64: aload_3
	// // 65: invokestatic 384 roboguice/util/Ln:e (Ljava/lang/Throwable;)I
	// // 68: pop
	// // 69: goto +450 -> 519
	// // 72: new 486 java/lang/StringBuilder
	// // 75: dup
	// // 76: invokespecial 487 java/lang/StringBuilder:<init> ()V
	// // 79: ldc_w 758
	// // 82: invokevirtual 493 java/lang/StringBuilder:append
	// (Ljava/lang/String;)Ljava/lang/StringBuilder;
	// // 85: aload 4
	// // 87: invokevirtual 493 java/lang/StringBuilder:append
	// (Ljava/lang/String;)Ljava/lang/StringBuilder;
	// // 90: invokevirtual 500 java/lang/StringBuilder:toString
	// ()Ljava/lang/String;
	// // 93: iconst_0
	// // 94: anewarray 502 java/lang/Object
	// // 97: invokestatic 760 roboguice/util/Ln:a
	// (Ljava/lang/Object;[Ljava/lang/Object;)I
	// // 100: pop
	// // 101: aload 4
	// // 103: ldc 106
	// // 105: invokevirtual 763 java/lang/String:equalsIgnoreCase
	// (Ljava/lang/String;)Z
	// // 108: ifne +13 -> 121
	// // 111: aload 4
	// // 113: ldc 170
	// // 115: invokevirtual 763 java/lang/String:equalsIgnoreCase
	// (Ljava/lang/String;)Z
	// // 118: ifeq +114 -> 232
	// // 121: getstatic 766
	// com/control4/director/rhapsody/parser/RhapsodyParserFactory:RhapsodyAgentProvider
	// Lcom/google/inject/aw;
	// // 124: invokeinterface 433 1 0
	// // 129: checkcast 768
	// com/control4/director/rhapsody/parser/RhapsodyAgentParser
	// // 132: astore 4
	// // 134: aload 4
	// // 136: aload_0
	// // 137: getfield 292 com/control4/director/rhapsody/Control4Rhapsody:bh Z
	// // 140: invokevirtual 769
	// com/control4/director/rhapsody/parser/RhapsodyAgentParser:a (Z)V
	// // 143: aload 4
	// // 145: aload_1
	// // 146: invokevirtual 770
	// com/control4/director/rhapsody/parser/RhapsodyAgentParser:a
	// (Lorg/xmlpull/v1/XmlPullParser;)V
	// // 149: aload 4
	// // 151: invokevirtual 772
	// com/control4/director/rhapsody/parser/RhapsodyAgentParser:m
	// ()Lcom/control4/director/rhapsody/RhapsodyAgentInfo;
	// // 154: astore 4
	// // 156: aload 4
	// // 158: ifnull +356 -> 514
	// // 161: aload 4
	// // 163: iconst_0
	// // 164: invokevirtual 777
	// com/control4/director/rhapsody/RhapsodyAgentInfo:a
	// (I)Lcom/control4/director/rhapsody/RhapsodyUser;
	// // 167: checkcast 779 com/control4/director/rhapsody/C4RhapsodyUser
	// // 170: astore_3
	// // 171: aload_3
	// // 172: ifnull +26 -> 198
	// // 175: aload_0
	// // 176: getfield 462 com/control4/director/rhapsody/Control4Rhapsody:bw
	// Lcom/control4/director/rhapsody/RhapsodyUser;
	// // 179: ifnull +10 -> 189
	// // 182: aload_0
	// // 183: getfield 319 com/control4/director/rhapsody/Control4Rhapsody:bv Z
	// // 186: ifne +333 -> 519
	// // 189: aload_0
	// // 190: aload_3
	// // 191: invokevirtual 782
	// com/control4/director/rhapsody/Control4Rhapsody:a
	// (Lcom/control4/director/rhapsody/C4RhapsodyUser;)Z
	// // 194: pop
	// // 195: goto +324 -> 519
	// // 198: ldc_w 784
	// // 201: iconst_0
	// // 202: anewarray 502 java/lang/Object
	// // 205: invokestatic 760 roboguice/util/Ln:a
	// (Ljava/lang/Object;[Ljava/lang/Object;)I
	// // 208: pop
	// // 209: aload_0
	// // 210: aconst_null
	// // 211: putfield 462 com/control4/director/rhapsody/Control4Rhapsody:bw
	// Lcom/control4/director/rhapsody/RhapsodyUser;
	// // 214: aload_0
	// // 215: aconst_null
	// // 216: putfield 532 com/control4/director/rhapsody/Control4Rhapsody:bx
	// Lcom/control4/director/rhapsody/RhapsodyUser;
	// // 219: aload_0
	// // 220: iconst_1
	// // 221: invokevirtual 786
	// com/control4/director/rhapsody/Control4Rhapsody:d (Z)V
	// // 224: aload_0
	// // 225: iconst_0
	// // 226: invokevirtual 788
	// com/control4/director/rhapsody/Control4Rhapsody:c (Z)V
	// // 229: goto +290 -> 519
	// // 232: aload 4
	// // 234: ldc 109
	// // 236: invokevirtual 763 java/lang/String:equalsIgnoreCase
	// (Ljava/lang/String;)Z
	// // 239: ifeq +50 -> 289
	// // 242: getstatic 766
	// com/control4/director/rhapsody/parser/RhapsodyParserFactory:RhapsodyAgentProvider
	// Lcom/google/inject/aw;
	// // 245: invokeinterface 433 1 0
	// // 250: checkcast 768
	// com/control4/director/rhapsody/parser/RhapsodyAgentParser
	// // 253: astore_3
	// // 254: aload_3
	// // 255: aload_0
	// // 256: getfield 292 com/control4/director/rhapsody/Control4Rhapsody:bh Z
	// // 259: invokevirtual 769
	// com/control4/director/rhapsody/parser/RhapsodyAgentParser:a (Z)V
	// // 262: aload_3
	// // 263: aload_1
	// // 264: invokevirtual 770
	// com/control4/director/rhapsody/parser/RhapsodyAgentParser:a
	// (Lorg/xmlpull/v1/XmlPullParser;)V
	// // 267: aload_0
	// // 268: aload_3
	// // 269: invokevirtual 772
	// com/control4/director/rhapsody/parser/RhapsodyAgentParser:m
	// ()Lcom/control4/director/rhapsody/RhapsodyAgentInfo;
	// // 272: putfield 530 com/control4/director/rhapsody/Control4Rhapsody:bB
	// Lcom/control4/director/rhapsody/RhapsodyAgentInfo;
	// // 275: aload_0
	// // 276: aload_0
	// // 277: getfield 530 com/control4/director/rhapsody/Control4Rhapsody:bB
	// Lcom/control4/director/rhapsody/RhapsodyAgentInfo;
	// // 280: invokevirtual 790
	// com/control4/director/rhapsody/RhapsodyAgentInfo:a ()Z
	// // 283: invokevirtual 598
	// com/control4/director/rhapsody/Control4Rhapsody:f (Z)V
	// // 286: goto +233 -> 519
	// // 289: aload 4
	// // 291: ldc 164
	// // 293: invokevirtual 763 java/lang/String:equalsIgnoreCase
	// (Ljava/lang/String;)Z
	// // 296: ifeq +194 -> 490
	// // 299: getstatic 766
	// com/control4/director/rhapsody/parser/RhapsodyParserFactory:RhapsodyAgentProvider
	// Lcom/google/inject/aw;
	// // 302: invokeinterface 433 1 0
	// // 307: checkcast 768
	// com/control4/director/rhapsody/parser/RhapsodyAgentParser
	// // 310: astore 4
	// // 312: aload 4
	// // 314: aload_0
	// // 315: getfield 292 com/control4/director/rhapsody/Control4Rhapsody:bh Z
	// // 318: invokevirtual 769
	// com/control4/director/rhapsody/parser/RhapsodyAgentParser:a (Z)V
	// // 321: aload 4
	// // 323: aload_1
	// // 324: invokevirtual 770
	// com/control4/director/rhapsody/parser/RhapsodyAgentParser:a
	// (Lorg/xmlpull/v1/XmlPullParser;)V
	// // 327: aload 4
	// // 329: invokevirtual 772
	// com/control4/director/rhapsody/parser/RhapsodyAgentParser:m
	// ()Lcom/control4/director/rhapsody/RhapsodyAgentInfo;
	// // 332: astore 5
	// // 334: aload 5
	// // 336: ifnull +10 -> 346
	// // 339: aload 5
	// // 341: iconst_0
	// // 342: invokevirtual 777
	// com/control4/director/rhapsody/RhapsodyAgentInfo:a
	// (I)Lcom/control4/director/rhapsody/RhapsodyUser;
	// // 345: astore_3
	// // 346: aload_3
	// // 347: ifnull +53 -> 400
	// // 350: aload_0
	// // 351: getfield 532 com/control4/director/rhapsody/Control4Rhapsody:bx
	// Lcom/control4/director/rhapsody/RhapsodyUser;
	// // 354: ifnull +165 -> 519
	// // 357: aload_0
	// // 358: getfield 462 com/control4/director/rhapsody/Control4Rhapsody:bw
	// Lcom/control4/director/rhapsody/RhapsodyUser;
	// // 361: ifnonnull +158 -> 519
	// // 364: aload_0
	// // 365: aload_0
	// // 366: getfield 532 com/control4/director/rhapsody/Control4Rhapsody:bx
	// Lcom/control4/director/rhapsody/RhapsodyUser;
	// // 369: putfield 462 com/control4/director/rhapsody/Control4Rhapsody:bw
	// Lcom/control4/director/rhapsody/RhapsodyUser;
	// // 372: aload_0
	// // 373: iconst_1
	// // 374: invokevirtual 786
	// com/control4/director/rhapsody/Control4Rhapsody:d (Z)V
	// // 377: aload_0
	// // 378: iconst_0
	// // 379: invokevirtual 788
	// com/control4/director/rhapsody/Control4Rhapsody:c (Z)V
	// // 382: ldc_w 792
	// // 385: iconst_0
	// // 386: anewarray 502 java/lang/Object
	// // 389: invokestatic 760 roboguice/util/Ln:a
	// (Ljava/lang/Object;[Ljava/lang/Object;)I
	// // 392: pop
	// // 393: aload_0
	// // 394: invokespecial 794
	// com/control4/director/rhapsody/Control4Rhapsody:M ()V
	// // 397: goto +122 -> 519
	// // 400: aload_0
	// // 401: aload 4
	// // 403: invokevirtual 796
	// com/control4/director/rhapsody/parser/RhapsodyAgentParser:o
	// ()Ljava/lang/String;
	// // 406: invokevirtual 798
	// com/control4/director/rhapsody/Control4Rhapsody:c (Ljava/lang/String;)V
	// // 409: aload_0
	// // 410: getfield 327 com/control4/director/rhapsody/Control4Rhapsody:bE Z
	// // 413: ifeq +106 -> 519
	// // 416: aload_0
	// // 417: iconst_0
	// // 418: invokespecial 800
	// com/control4/director/rhapsody/Control4Rhapsody:j (Z)V
	// // 421: aload_0
	// // 422: getfield 315 com/control4/director/rhapsody/Control4Rhapsody:bt
	// Ljava/util/ArrayList;
	// // 425: ifnull +94 -> 519
	// // 428: aload_0
	// // 429: getfield 315 com/control4/director/rhapsody/Control4Rhapsody:bt
	// Ljava/util/ArrayList;
	// // 432: astore_3
	// // 433: aload_3
	// // 434: monitorenter
	// // 435: aload_0
	// // 436: getfield 315 com/control4/director/rhapsody/Control4Rhapsody:bt
	// Ljava/util/ArrayList;
	// // 439: invokevirtual 364 java/util/ArrayList:iterator
	// ()Ljava/util/Iterator;
	// // 442: astore 5
	// // 444: aload 5
	// // 446: invokeinterface 369 1 0
	// // 451: ifeq +34 -> 485
	// // 454: aload 5
	// // 456: invokeinterface 373 1 0
	// // 461: checkcast 375
	// com/control4/director/rhapsody/Rhapsody$RhapsodyListener
	// // 464: aload_0
	// // 465: aload 4
	// // 467: invokevirtual 796
	// com/control4/director/rhapsody/parser/RhapsodyAgentParser:o
	// ()Ljava/lang/String;
	// // 470: invokeinterface 803 3 0
	// // 475: goto -31 -> 444
	// // 478: astore 4
	// // 480: aload_3
	// // 481: monitorexit
	// // 482: aload 4
	// // 484: athrow
	// // 485: aload_3
	// // 486: monitorexit
	// // 487: goto +32 -> 519
	// // 490: aload 4
	// // 492: ldc 176
	// // 494: invokevirtual 763 java/lang/String:equalsIgnoreCase
	// (Ljava/lang/String;)Z
	// // 497: ifeq +22 -> 519
	// // 500: ldc_w 805
	// // 503: iconst_0
	// // 504: anewarray 502 java/lang/Object
	// // 507: invokestatic 760 roboguice/util/Ln:a
	// (Ljava/lang/Object;[Ljava/lang/Object;)I
	// // 510: pop
	// // 511: goto +8 -> 519
	// // 514: aload_3
	// // 515: astore_3
	// // 516: goto -345 -> 171
	// // 519: return
	// //
	// // Exception table:
	// // from to target type
	// // 10 60 63 java/lang/Exception
	// // 72 435 63 java/lang/Exception
	// // 482 485 63 java/lang/Exception
	// // 490 511 63 java/lang/Exception
	// // 435 482 478 finally
	// // 485 487 478 finally
	// }
	//
	// public void a(boolean paramBoolean)
	// {
	// this.bg = paramBoolean;
	// }
	//
	// public void a(boolean paramBoolean1, boolean paramBoolean2)
	// {
	// this.by = paramBoolean1;
	// if (!this.by)
	// {
	// RhapsodyUser localRhapsodyUser = g();
	// if ((!paramBoolean2) && (localRhapsodyUser != null) &&
	// (!localRhapsodyUser.r()) && (!localRhapsodyUser.s()))
	// localRhapsodyUser.a(new Control4Rhapsody.2(this, localRhapsodyUser));
	// }
	// }
	//
	// public boolean a(C4RhapsodyUser paramC4RhapsodyUser)
	// {
	// int j;
	// try
	// {
	// this.bx = paramC4RhapsodyUser;
	// if (paramC4RhapsodyUser == null)
	// {
	// int i = 0;
	// }
	// else
	// {
	// String str = paramC4RhapsodyUser.d();
	// if ((str == null) || (str.length() <= 0))
	// break label255;
	// SendToDeviceCommand localSendToDeviceCommand =
	// (SendToDeviceCommand)CommandFactory.SendToDeviceProvider.a();
	// localSendToDeviceCommand.c("SET_ACTIVE_ACCOUNT");
	// localSendToDeviceCommand.a("device", this);
	// localSendToDeviceCommand.a("device command", "SET_ACTIVE_ACCOUNT");
	// localSendToDeviceCommand.b(true);
	// localSendToDeviceCommand.b(t());
	// localSendToDeviceCommand.c(true);
	// localSendToDeviceCommand.d(false);
	// StringBuilder localStringBuilder = new
	// StringBuilder("<param><name>AccountId</name><value type=\"number\"><static>");
	// localStringBuilder.append(str);
	// localStringBuilder.append("</static></value></param>");
	// localStringBuilder.append("<param><name>DisplayName</name><value type=\"string\"><static>");
	// localStringBuilder.append(paramC4RhapsodyUser.c());
	// localStringBuilder.append("</static></value></param>");
	// localStringBuilder.append("<param><name>AccountName</name><value type=\"string\"><static>");
	// localStringBuilder.append(paramC4RhapsodyUser.a());
	// localStringBuilder.append("</static></value></param>");
	// localStringBuilder.append("<param><name>AccountPassword</name><value type=\"string\"><static>");
	// localStringBuilder.append(paramC4RhapsodyUser.b());
	// localStringBuilder.append("</static></value></param>");
	// localSendToDeviceCommand.a(localStringBuilder.toString());
	// boolean bool = this._director.a(localSendToDeviceCommand);
	// if (!bool)
	// this.bx = null;
	// M();
	// b("TRACK");
	// }
	// }
	// catch (Exception j)
	// {
	// Ln.e(localException);
	// j = 0;
	// }
	// while (true)
	// {
	// return j;
	// label255: j = 0;
	// }
	// }
	//
	// // ERROR //
	// public boolean a(RhapsodyConnection paramRhapsodyConnection)
	// {
	// // Byte code:
	// // 0: aload_1
	// // 1: ifnonnull +7 -> 8
	// // 4: iconst_0
	// // 5: istore_2
	// // 6: iload_2
	// // 7: ireturn
	// // 8: new 486 java/lang/StringBuilder
	// // 11: dup
	// // 12: invokespecial 487 java/lang/StringBuilder:<init> ()V
	// // 15: ldc_w 874
	// // 18: invokevirtual 493 java/lang/StringBuilder:append
	// (Ljava/lang/String;)Ljava/lang/StringBuilder;
	// // 21: aload_1
	// // 22: invokevirtual 877 java/lang/StringBuilder:append
	// (Ljava/lang/Object;)Ljava/lang/StringBuilder;
	// // 25: invokevirtual 500 java/lang/StringBuilder:toString
	// ()Ljava/lang/String;
	// // 28: iconst_0
	// // 29: anewarray 502 java/lang/Object
	// // 32: invokestatic 505 roboguice/util/Ln:b
	// (Ljava/lang/Object;[Ljava/lang/Object;)I
	// // 35: pop
	// // 36: aload_0
	// // 37: monitorenter
	// // 38: ldc_w 879
	// // 41: iconst_0
	// // 42: anewarray 502 java/lang/Object
	// // 45: invokestatic 505 roboguice/util/Ln:b
	// (Ljava/lang/Object;[Ljava/lang/Object;)I
	// // 48: pop
	// // 49: aload_0
	// // 50: getfield 484 com/control4/director/rhapsody/Control4Rhapsody:bs Z
	// // 53: ifeq +7 -> 60
	// // 56: aload_0
	// // 57: invokevirtual 881
	// com/control4/director/rhapsody/Control4Rhapsody:c ()V
	// // 60: aload_1
	// // 61: invokevirtual 884
	// com/control4/director/rhapsody/RhapsodyConnection:a ()Ljava/lang/String;
	// // 64: astore 4
	// // 66: aload_1
	// // 67: invokevirtual 885
	// com/control4/director/rhapsody/RhapsodyConnection:b ()I
	// // 70: istore_2
	// // 71: ldc_w 887
	// // 74: iconst_0
	// // 75: anewarray 502 java/lang/Object
	// // 78: invokestatic 505 roboguice/util/Ln:b
	// (Ljava/lang/Object;[Ljava/lang/Object;)I
	// // 81: pop
	// // 82: sipush 10000
	// // 85: istore_3
	// // 86: iconst_0
	// // 87: istore 5
	// // 89: iload 5
	// // 91: iconst_5
	// // 92: if_icmpge +174 -> 266
	// // 95: aload_0
	// // 96: new 521 java/net/Socket
	// // 99: dup
	// // 100: invokespecial 888 java/net/Socket:<init> ()V
	// // 103: putfield 470 com/control4/director/rhapsody/Control4Rhapsody:bi
	// Ljava/net/Socket;
	// // 106: aload_0
	// // 107: getfield 470 com/control4/director/rhapsody/Control4Rhapsody:bi
	// Ljava/net/Socket;
	// // 110: iconst_1
	// // 111: invokevirtual 891 java/net/Socket:setKeepAlive (Z)V
	// // 114: aload_0
	// // 115: getfield 470 com/control4/director/rhapsody/Control4Rhapsody:bi
	// Ljava/net/Socket;
	// // 118: new 893 java/net/InetSocketAddress
	// // 121: dup
	// // 122: aload 4
	// // 124: iload_2
	// // 125: invokespecial 896 java/net/InetSocketAddress:<init>
	// (Ljava/lang/String;I)V
	// // 128: iload_3
	// // 129: invokevirtual 900 java/net/Socket:connect
	// (Ljava/net/SocketAddress;I)V
	// // 132: invokestatic 644 java/lang/Thread:interrupted ()Z
	// // 135: ifeq +121 -> 256
	// // 138: ldc_w 902
	// // 141: iconst_0
	// // 142: anewarray 502 java/lang/Object
	// // 145: invokestatic 505 roboguice/util/Ln:b
	// (Ljava/lang/Object;[Ljava/lang/Object;)I
	// // 148: pop
	// // 149: aload_0
	// // 150: getfield 470 com/control4/director/rhapsody/Control4Rhapsody:bi
	// Ljava/net/Socket;
	// // 153: invokevirtual 905 java/net/Socket:isConnected ()Z
	// // 156: istore_2
	// // 157: iload_2
	// // 158: ifeq +10 -> 168
	// // 161: aload_0
	// // 162: getfield 470 com/control4/director/rhapsody/Control4Rhapsody:bi
	// Ljava/net/Socket;
	// // 165: invokevirtual 524 java/net/Socket:close ()V
	// // 168: aload_0
	// // 169: aconst_null
	// // 170: putfield 470 com/control4/director/rhapsody/Control4Rhapsody:bi
	// Ljava/net/Socket;
	// // 173: new 907 java/lang/InterruptedException
	// // 176: dup
	// // 177: invokespecial 908 java/lang/InterruptedException:<init> ()V
	// // 180: athrow
	// // 181: astore_2
	// // 182: aload_0
	// // 183: monitorexit
	// // 184: aload_2
	// // 185: athrow
	// // 186: astore 6
	// // 188: aload 6
	// // 190: ldc_w 910
	// // 193: iconst_0
	// // 194: anewarray 502 java/lang/Object
	// // 197: invokestatic 912 roboguice/util/Ln:d
	// (Ljava/lang/Throwable;Ljava/lang/Object;[Ljava/lang/Object;)I
	// // 200: pop
	// // 201: goto -87 -> 114
	// // 204: pop
	// // 205: ldc_w 914
	// // 208: iconst_0
	// // 209: anewarray 502 java/lang/Object
	// // 212: invokestatic 916 roboguice/util/Ln:c
	// (Ljava/lang/Object;[Ljava/lang/Object;)I
	// // 215: pop
	// // 216: goto -84 -> 132
	// // 219: astore 6
	// // 221: new 486 java/lang/StringBuilder
	// // 224: dup
	// // 225: invokespecial 487 java/lang/StringBuilder:<init> ()V
	// // 228: ldc_w 918
	// // 231: invokevirtual 493 java/lang/StringBuilder:append
	// (Ljava/lang/String;)Ljava/lang/StringBuilder;
	// // 234: aload 6
	// // 236: invokevirtual 921 java/io/IOException:getLocalizedMessage
	// ()Ljava/lang/String;
	// // 239: invokevirtual 493 java/lang/StringBuilder:append
	// (Ljava/lang/String;)Ljava/lang/StringBuilder;
	// // 242: invokevirtual 500 java/lang/StringBuilder:toString
	// ()Ljava/lang/String;
	// // 245: iconst_0
	// // 246: anewarray 502 java/lang/Object
	// // 249: invokestatic 916 roboguice/util/Ln:c
	// (Ljava/lang/Object;[Ljava/lang/Object;)I
	// // 252: pop
	// // 253: goto -121 -> 132
	// // 256: aload_0
	// // 257: getfield 470 com/control4/director/rhapsody/Control4Rhapsody:bi
	// Ljava/net/Socket;
	// // 260: invokevirtual 905 java/net/Socket:isConnected ()Z
	// // 263: ifeq +31 -> 294
	// // 266: aload_0
	// // 267: getfield 470 com/control4/director/rhapsody/Control4Rhapsody:bi
	// Ljava/net/Socket;
	// // 270: invokevirtual 905 java/net/Socket:isConnected ()Z
	// // 273: ifne +77 -> 350
	// // 276: ldc_w 923
	// // 279: iconst_0
	// // 280: anewarray 502 java/lang/Object
	// // 283: invokestatic 505 roboguice/util/Ln:b
	// (Ljava/lang/Object;[Ljava/lang/Object;)I
	// // 286: pop
	// // 287: aload_0
	// // 288: monitorexit
	// // 289: iconst_0
	// // 290: istore_2
	// // 291: goto -285 -> 6
	// // 294: new 486 java/lang/StringBuilder
	// // 297: dup
	// // 298: invokespecial 487 java/lang/StringBuilder:<init> ()V
	// // 301: ldc_w 925
	// // 304: invokevirtual 493 java/lang/StringBuilder:append
	// (Ljava/lang/String;)Ljava/lang/StringBuilder;
	// // 307: iload 5
	// // 309: iconst_1
	// // 310: iadd
	// // 311: invokevirtual 928 java/lang/StringBuilder:append
	// (I)Ljava/lang/StringBuilder;
	// // 314: ldc_w 930
	// // 317: invokevirtual 493 java/lang/StringBuilder:append
	// (Ljava/lang/String;)Ljava/lang/StringBuilder;
	// // 320: aload_1
	// // 321: invokevirtual 877 java/lang/StringBuilder:append
	// (Ljava/lang/Object;)Ljava/lang/StringBuilder;
	// // 324: invokevirtual 500 java/lang/StringBuilder:toString
	// ()Ljava/lang/String;
	// // 327: iconst_0
	// // 328: anewarray 502 java/lang/Object
	// // 331: invokestatic 505 roboguice/util/Ln:b
	// (Ljava/lang/Object;[Ljava/lang/Object;)I
	// // 334: pop
	// // 335: iload 5
	// // 337: iconst_1
	// // 338: iadd
	// // 339: istore 5
	// // 341: wide
	// // 347: goto -258 -> 89
	// // 350: new 486 java/lang/StringBuilder
	// // 353: dup
	// // 354: invokespecial 487 java/lang/StringBuilder:<init> ()V
	// // 357: ldc_w 932
	// // 360: invokevirtual 493 java/lang/StringBuilder:append
	// (Ljava/lang/String;)Ljava/lang/StringBuilder;
	// // 363: invokestatic 644 java/lang/Thread:interrupted ()Z
	// // 366: invokevirtual 496 java/lang/StringBuilder:append
	// (Z)Ljava/lang/StringBuilder;
	// // 369: invokevirtual 500 java/lang/StringBuilder:toString
	// ()Ljava/lang/String;
	// // 372: iconst_0
	// // 373: anewarray 502 java/lang/Object
	// // 376: invokestatic 505 roboguice/util/Ln:b
	// (Ljava/lang/Object;[Ljava/lang/Object;)I
	// // 379: pop
	// // 380: aload_0
	// // 381: aload_1
	// // 382: putfield 526 com/control4/director/rhapsody/Control4Rhapsody:br
	// Lcom/control4/director/rhapsody/RhapsodyConnection;
	// // 385: aload_0
	// // 386: getfield 526 com/control4/director/rhapsody/Control4Rhapsody:br
	// Lcom/control4/director/rhapsody/RhapsodyConnection;
	// // 389: iconst_1
	// // 390: invokevirtual 933
	// com/control4/director/rhapsody/RhapsodyConnection:a (Z)V
	// // 393: aload_0
	// // 394: new 509 java/lang/Thread
	// // 397: dup
	// // 398: new 935
	// com/control4/director/rhapsody/Control4Rhapsody$ResponseRunnable
	// // 401: dup
	// // 402: aload_0
	// // 403: aconst_null
	// // 404: invokespecial 938
	// com/control4/director/rhapsody/Control4Rhapsody$ResponseRunnable:<init>
	// (Lcom/control4/director/rhapsody/Control4Rhapsody;Lcom/control4/director/rhapsody/Control4Rhapsody$1;)V
	// // 407: ldc_w 940
	// // 410: invokespecial 943 java/lang/Thread:<init>
	// (Ljava/lang/Runnable;Ljava/lang/String;)V
	// // 413: putfield 507 com/control4/director/rhapsody/Control4Rhapsody:bj
	// Ljava/lang/Thread;
	// // 416: aload_0
	// // 417: getfield 507 com/control4/director/rhapsody/Control4Rhapsody:bj
	// Ljava/lang/Thread;
	// // 420: invokevirtual 946 java/lang/Thread:start ()V
	// // 423: aload_0
	// // 424: new 509 java/lang/Thread
	// // 427: dup
	// // 428: new 948
	// com/control4/director/rhapsody/Control4Rhapsody$SendRunnable
	// // 431: dup
	// // 432: aload_0
	// // 433: aconst_null
	// // 434: invokespecial 949
	// com/control4/director/rhapsody/Control4Rhapsody$SendRunnable:<init>
	// (Lcom/control4/director/rhapsody/Control4Rhapsody;Lcom/control4/director/rhapsody/Control4Rhapsody$1;)V
	// // 437: ldc_w 951
	// // 440: invokespecial 943 java/lang/Thread:<init>
	// (Ljava/lang/Runnable;Ljava/lang/String;)V
	// // 443: putfield 514 com/control4/director/rhapsody/Control4Rhapsody:bk
	// Ljava/lang/Thread;
	// // 446: aload_0
	// // 447: getfield 514 com/control4/director/rhapsody/Control4Rhapsody:bk
	// Ljava/lang/Thread;
	// // 450: invokevirtual 946 java/lang/Thread:start ()V
	// // 453: aload_0
	// // 454: iconst_1
	// // 455: putfield 484 com/control4/director/rhapsody/Control4Rhapsody:bs Z
	// // 458: aload_0
	// // 459: sipush 1000
	// // 462: invokevirtual 954
	// com/control4/director/rhapsody/Control4Rhapsody:g (I)Z
	// // 465: pop
	// // 466: aload_0
	// // 467: iconst_0
	// // 468: putfield 319 com/control4/director/rhapsody/Control4Rhapsody:bv Z
	// // 471: aload_0
	// // 472: aconst_null
	// // 473: invokevirtual 360
	// com/control4/director/rhapsody/Control4Rhapsody:c
	// (Lcom/control4/director/rhapsody/Rhapsody$RhapsodyListener;)Z
	// // 476: pop
	// // 477: aload_0
	// // 478: ldc 109
	// // 480: iconst_1
	// // 481: iconst_0
	// // 482: invokevirtual 957
	// com/control4/director/rhapsody/Control4Rhapsody:b (Ljava/lang/String;ZZ)Z
	// // 485: pop
	// // 486: aload_0
	// // 487: iconst_0
	// // 488: putfield 323 com/control4/director/rhapsody/Control4Rhapsody:bz Z
	// // 491: aload_0
	// // 492: invokevirtual 959
	// com/control4/director/rhapsody/Control4Rhapsody:K ()Z
	// // 495: pop
	// // 496: aload_0
	// // 497: getfield 315 com/control4/director/rhapsody/Control4Rhapsody:bt
	// Ljava/util/ArrayList;
	// // 500: ifnull +87 -> 587
	// // 503: aload_0
	// // 504: getfield 315 com/control4/director/rhapsody/Control4Rhapsody:bt
	// Ljava/util/ArrayList;
	// // 507: astore_2
	// // 508: aload_2
	// // 509: monitorenter
	// // 510: aload_0
	// // 511: getfield 315 com/control4/director/rhapsody/Control4Rhapsody:bt
	// Ljava/util/ArrayList;
	// // 514: invokevirtual 364 java/util/ArrayList:iterator
	// ()Ljava/util/Iterator;
	// // 517: astore_3
	// // 518: aload_3
	// // 519: invokeinterface 369 1 0
	// // 524: ifeq +61 -> 585
	// // 527: aload_3
	// // 528: invokeinterface 373 1 0
	// // 533: checkcast 375
	// com/control4/director/rhapsody/Rhapsody$RhapsodyListener
	// // 536: astore 4
	// // 538: aload 4
	// // 540: aload_0
	// // 541: invokeinterface 961 2 0
	// // 546: goto -28 -> 518
	// // 549: astore 4
	// // 551: aload 4
	// // 553: ldc_w 963
	// // 556: iconst_0
	// // 557: anewarray 502 java/lang/Object
	// // 560: invokestatic 569 roboguice/util/Ln:e
	// (Ljava/lang/Throwable;Ljava/lang/Object;[Ljava/lang/Object;)I
	// // 563: pop
	// // 564: goto -46 -> 518
	// // 567: astore_3
	// // 568: aload_2
	// // 569: monitorexit
	// // 570: aload_3
	// // 571: athrow
	// // 572: astore_2
	// // 573: aload_2
	// // 574: invokestatic 384 roboguice/util/Ln:e (Ljava/lang/Throwable;)I
	// // 577: pop
	// // 578: aload_0
	// // 579: monitorexit
	// // 580: iconst_0
	// // 581: istore_2
	// // 582: goto -576 -> 6
	// // 585: aload_2
	// // 586: monitorexit
	// // 587: aload_0
	// // 588: monitorexit
	// // 589: ldc_w 965
	// // 592: iconst_0
	// // 593: anewarray 502 java/lang/Object
	// // 596: invokestatic 505 roboguice/util/Ln:b
	// (Ljava/lang/Object;[Ljava/lang/Object;)I
	// // 599: pop
	// // 600: iconst_1
	// // 601: istore_2
	// // 602: goto -596 -> 6
	// // 605: pop
	// // 606: goto -438 -> 168
	// //
	// // Exception table:
	// // from to target type
	// // 38 82 181 finally
	// // 95 106 181 finally
	// // 106 114 181 finally
	// // 114 132 181 finally
	// // 132 157 181 finally
	// // 161 168 181 finally
	// // 168 184 181 finally
	// // 188 201 181 finally
	// // 205 380 181 finally
	// // 380 496 181 finally
	// // 496 510 181 finally
	// // 570 580 181 finally
	// // 587 589 181 finally
	// // 106 114 186 java/net/SocketException
	// // 95 106 204 java/net/SocketTimeoutException
	// // 106 114 204 java/net/SocketTimeoutException
	// // 114 132 204 java/net/SocketTimeoutException
	// // 188 201 204 java/net/SocketTimeoutException
	// // 95 106 219 java/io/IOException
	// // 106 114 219 java/io/IOException
	// // 114 132 219 java/io/IOException
	// // 188 201 219 java/io/IOException
	// // 538 546 549 java/lang/Exception
	// // 510 538 567 finally
	// // 538 546 567 finally
	// // 551 570 567 finally
	// // 585 587 567 finally
	// // 380 496 572 java/lang/Exception
	// // 161 168 605 java/io/IOException
	// }
	//
	// public boolean a(RhapsodyCommand paramRhapsodyCommand)
	// {
	// if ((paramRhapsodyCommand != null) && (!paramRhapsodyCommand.g()))
	// L();
	// return this.bq.a(paramRhapsodyCommand);
	// }
	//
	// public boolean a(String paramString)
	// {
	// if (paramString != null)
	// try
	// {
	// if (paramString.length() != 0)
	// {
	// SendToDeviceCommand localSendToDeviceCommand =
	// (SendToDeviceCommand)CommandFactory.SendToDeviceProvider.a();
	// localSendToDeviceCommand.c("DELETE_ACCOUNT");
	// localSendToDeviceCommand.a("device", this);
	// localSendToDeviceCommand.a("device command", "DELETE_ACCOUNT");
	// localSendToDeviceCommand.b(true);
	// localSendToDeviceCommand.b(t());
	// localSendToDeviceCommand.c(false);
	// localSendToDeviceCommand.d(false);
	// StringBuilder localStringBuilder = new
	// StringBuilder("<param><name>AccountId</name><value type=\"number\"><static>");
	// localStringBuilder.append(paramString);
	// localStringBuilder.append("</static></value></param>");
	// localSendToDeviceCommand.a(localStringBuilder.toString());
	// boolean bool = this._director.a(localSendToDeviceCommand);
	// if (!bool)
	// break label139;
	// this.bB = null;
	// }
	// }
	// catch (Exception i)
	// {
	// Ln.e(localException);
	// i = 0;
	// }
	// int i = 0;
	// label139: return i;
	// }
	//
	// public boolean a(Vector<String> paramVector, DirectorAudioQueue
	// paramDirectorAudioQueue, Rhapsody.OnRhapsodyTracksRetrievedListener
	// paramOnRhapsodyTracksRetrievedListener)
	// {
	// try
	// {
	// GetRhapsodyTracksCommand localGetRhapsodyTracksCommand =
	// (GetRhapsodyTracksCommand)RhapsodyCommandFactory.GetRhapsodyTracksProvider.a();
	// localGetRhapsodyTracksCommand.a("listener",
	// paramOnRhapsodyTracksRetrievedListener);
	// localGetRhapsodyTracksCommand.a("queue", paramDirectorAudioQueue);
	// localGetRhapsodyTracksCommand.a(paramVector);
	// boolean bool = a(localGetRhapsodyTracksCommand);
	// bool = bool;
	// return bool;
	// }
	// catch (Exception i)
	// {
	// while (true)
	// {
	// Ln.e(localException);
	// int i = 0;
	// }
	// }
	// }
	//
	// public boolean a(Vector<String> paramVector,
	// Rhapsody.OnRhapsodyTracksRetrievedListener
	// paramOnRhapsodyTracksRetrievedListener)
	// {
	// try
	// {
	// GetRhapsodyTracksCommand localGetRhapsodyTracksCommand =
	// (GetRhapsodyTracksCommand)RhapsodyCommandFactory.GetRhapsodyTracksProvider.a();
	// localGetRhapsodyTracksCommand.a("listener",
	// paramOnRhapsodyTracksRetrievedListener);
	// localGetRhapsodyTracksCommand.a(paramVector);
	// boolean bool = a(localGetRhapsodyTracksCommand);
	// bool = bool;
	// return bool;
	// }
	// catch (Exception i)
	// {
	// while (true)
	// {
	// Ln.e(localException);
	// int i = 0;
	// }
	// }
	// }
	//
	// public boolean a_(String paramString1, String paramString2)
	// {
	// Object localObject1 = null;
	// int i;
	// if ((paramString1 == null) || (paramString2 == null))
	// {
	// i = 0;
	// return i;
	// }
	// while (true)
	// {
	// int i2;
	// try
	// {
	// if (paramString1.length() != 0)
	// continue;
	// i = 0;
	// break;
	// if (this.bB == null)
	// continue;
	// int i1 = this.bB.e();
	// i2 = 0;
	// if (i2 >= i1)
	// continue;
	// RhapsodyUser localRhapsodyUser = this.bB.a(i2);
	// if ((localRhapsodyUser == null) || (localRhapsodyUser.a() == null) ||
	// (!localRhapsodyUser.a().equals(paramString1)))
	// break label179;
	// Object localObject2 = localRhapsodyUser;
	// C4RhapsodyUser localC4RhapsodyUser =
	// (C4RhapsodyUser)this._userProvider.a();
	// localC4RhapsodyUser.a(paramString1);
	// localC4RhapsodyUser.b(paramString2);
	// c(null);
	// j(true);
	// if (localObject2 == null)
	// continue;
	// localC4RhapsodyUser.d(localObject2.d());
	// boolean bool = a(localC4RhapsodyUser);
	// break;
	// bool = b(localC4RhapsodyUser);
	// bool = bool;
	// }
	// catch (Exception j)
	// {
	// Ln.e(localException);
	// int j = 0;
	// }
	// break;
	// label179: i2 += 1;
	// }
	// }
	//
	// // ERROR //
	// public void b(com.control4.director.data.Variable paramVariable, boolean
	// paramBoolean)
	// {
	//
	// }
	//
	// public void b(Rhapsody.RhapsodyListener paramRhapsodyListener)
	// {
	// synchronized (this.bt)
	// {
	// if (this.bt != null)
	// this.bt.remove(paramRhapsodyListener);
	// return;
	// }
	// }
	//
	// public void b(RhapsodyUser paramRhapsodyUser)
	// {
	// this.bA = paramRhapsodyUser;
	// }
	//
	// public void b(boolean paramBoolean)
	// {
	// this.bh = paramBoolean;
	// }
	//
	// public boolean b()
	// {
	// boolean bool;
	// if (this.bi != null)
	// bool = this.bi.isConnected();
	// else
	// bool = this.bs;
	// return bool;
	// }
	//
	// public boolean b(C4RhapsodyUser paramC4RhapsodyUser)
	// {
	// if (paramC4RhapsodyUser == null)
	// {
	// int i = 0;
	// return i;
	// }
	// while (true)
	// {
	// try
	// {
	// SendToDeviceCommand localSendToDeviceCommand =
	// (SendToDeviceCommand)CommandFactory.SendToDeviceProvider.a();
	// localSendToDeviceCommand.c("ADD_ACCOUNT");
	// localSendToDeviceCommand.a("device", this);
	// localSendToDeviceCommand.a("device command", "ADD_ACCOUNT");
	// localSendToDeviceCommand.b(true);
	// localSendToDeviceCommand.b(t());
	// localSendToDeviceCommand.c(true);
	// localSendToDeviceCommand.d(false);
	// StringBuilder localStringBuilder = new
	// StringBuilder("<param><name>DisplayName</name><value type=\"string\"><static>");
	// if (paramC4RhapsodyUser.c() == null)
	// break label214;
	// str = paramC4RhapsodyUser.c();
	// localStringBuilder.append(str);
	// localStringBuilder.append("</static></value></param>");
	// localStringBuilder.append("<param><name>AccountName</name><value type=\"string\"><static>");
	// localStringBuilder.append(paramC4RhapsodyUser.a());
	// localStringBuilder.append("</static></value></param>");
	// localStringBuilder.append("<param><name>AccountPassword</name><value type=\"string\"><static>");
	// localStringBuilder.append(paramC4RhapsodyUser.b());
	// localStringBuilder.append("</static></value></param>");
	// localStringBuilder.append("<param><name>AccountFlags</name><value type=\"string\"><static>");
	// localStringBuilder.append("TRACK");
	// localStringBuilder.append("</static></value></param>");
	// localSendToDeviceCommand.a(localStringBuilder.toString());
	// boolean bool = this._director.a(localSendToDeviceCommand);
	// M();
	// }
	// catch (Exception j)
	// {
	// Ln.e(localException);
	// int j = 0;
	// }
	// break;
	// label214: String str = paramC4RhapsodyUser.a();
	// str = str;
	// }
	// }
	//
	// public boolean b(String paramString)
	// {
	// if (paramString != null)
	// try
	// {
	// if (paramString.length() > 0)
	// {
	// SendToDeviceCommand localSendToDeviceCommand =
	// (SendToDeviceCommand)CommandFactory.SendToDeviceProvider.a();
	// localSendToDeviceCommand.c("SET_ACCOUNT_FLAGS");
	// localSendToDeviceCommand.a("device", this);
	// localSendToDeviceCommand.a("device command", "SET_ACCOUNT_FLAGS");
	// localSendToDeviceCommand.b(true);
	// localSendToDeviceCommand.b(t());
	// localSendToDeviceCommand.c(true);
	// localSendToDeviceCommand.d(false);
	// StringBuilder localStringBuilder = new
	// StringBuilder("<param><name>AccountFlags</name><value type=\"string\"><static>");
	// localStringBuilder.append(paramString);
	// localStringBuilder.append("</static></value></param>");
	// localSendToDeviceCommand.a(localStringBuilder.toString());
	// boolean bool = this._director.a(localSendToDeviceCommand);
	// bool = bool;
	// }
	// }
	// catch (Exception i)
	// {
	// Ln.e(localException);
	// i = 0;
	// }
	// int i = 0;
	// return i;
	// }
	//
	// public void c()
	// {
	// k(false);
	// }
	//
	// public void c(String paramString)
	// {
	// this.bD = paramString;
	// }
	//
	// // ERROR //
	// public void c(boolean paramBoolean)
	// {
	// // Byte code:
	// // 0: aload_0
	// // 1: iload_1
	// // 2: putfield 317 com/control4/director/rhapsody/Control4Rhapsody:bu Z
	// // 5: aload_0
	// // 6: getfield 1028 com/control4/director/rhapsody/Control4Rhapsody:aP
	// Ljava/util/TimerTask;
	// // 9: ifnull +11 -> 20
	// // 12: aload_0
	// // 13: getfield 1028 com/control4/director/rhapsody/Control4Rhapsody:aP
	// Ljava/util/TimerTask;
	// // 16: invokevirtual 454 java/util/TimerTask:cancel ()Z
	// // 19: pop
	// // 20: aload_0
	// // 21: getfield 317 com/control4/director/rhapsody/Control4Rhapsody:bu Z
	// // 24: ifeq +108 -> 132
	// // 27: aload_0
	// // 28: getfield 1030 com/control4/director/rhapsody/Control4Rhapsody:aO
	// Ljava/util/Timer;
	// // 31: ifnonnull +14 -> 45
	// // 34: aload_0
	// // 35: new 409 java/util/Timer
	// // 38: dup
	// // 39: invokespecial 410 java/util/Timer:<init> ()V
	// // 42: putfield 1030 com/control4/director/rhapsody/Control4Rhapsody:aO
	// Ljava/util/Timer;
	// // 45: aload_0
	// // 46: new 1032 com/control4/director/rhapsody/Control4Rhapsody$1
	// // 49: dup
	// // 50: aload_0
	// // 51: invokespecial 1033
	// com/control4/director/rhapsody/Control4Rhapsody$1:<init>
	// (Lcom/control4/director/rhapsody/Control4Rhapsody;)V
	// // 54: putfield 1028 com/control4/director/rhapsody/Control4Rhapsody:aP
	// Ljava/util/TimerTask;
	// // 57: aload_0
	// // 58: getfield 1030 com/control4/director/rhapsody/Control4Rhapsody:aO
	// Ljava/util/Timer;
	// // 61: aload_0
	// // 62: getfield 1028 com/control4/director/rhapsody/Control4Rhapsody:aP
	// Ljava/util/TimerTask;
	// // 65: ldc2_w 1034
	// // 68: invokevirtual 1038 java/util/Timer:schedule
	// (Ljava/util/TimerTask;J)V
	// // 71: aload_0
	// // 72: getfield 317 com/control4/director/rhapsody/Control4Rhapsody:bu Z
	// // 75: ifne +81 -> 156
	// // 78: aload_0
	// // 79: getfield 327 com/control4/director/rhapsody/Control4Rhapsody:bE Z
	// // 82: ifne +74 -> 156
	// // 85: aload_0
	// // 86: getfield 315 com/control4/director/rhapsody/Control4Rhapsody:bt
	// Ljava/util/ArrayList;
	// // 89: astore_2
	// // 90: aload_2
	// // 91: monitorenter
	// // 92: aload_0
	// // 93: getfield 315 com/control4/director/rhapsody/Control4Rhapsody:bt
	// Ljava/util/ArrayList;
	// // 96: invokevirtual 364 java/util/ArrayList:iterator
	// ()Ljava/util/Iterator;
	// // 99: astore_3
	// // 100: aload_3
	// // 101: invokeinterface 369 1 0
	// // 106: ifeq +48 -> 154
	// // 109: aload_3
	// // 110: invokeinterface 373 1 0
	// // 115: checkcast 375
	// com/control4/director/rhapsody/Rhapsody$RhapsodyListener
	// // 118: aload_0
	// // 119: invokeinterface 1040 2 0
	// // 124: goto -24 -> 100
	// // 127: astore_3
	// // 128: aload_2
	// // 129: monitorexit
	// // 130: aload_3
	// // 131: athrow
	// // 132: aload_0
	// // 133: getfield 1030 com/control4/director/rhapsody/Control4Rhapsody:aO
	// Ljava/util/Timer;
	// // 136: ifnull -65 -> 71
	// // 139: aload_0
	// // 140: getfield 1030 com/control4/director/rhapsody/Control4Rhapsody:aO
	// Ljava/util/Timer;
	// // 143: invokevirtual 456 java/util/Timer:cancel ()V
	// // 146: aload_0
	// // 147: aconst_null
	// // 148: putfield 1030 com/control4/director/rhapsody/Control4Rhapsody:aO
	// Ljava/util/Timer;
	// // 151: goto -80 -> 71
	// // 154: aload_2
	// // 155: monitorexit
	// // 156: return
	// //
	// // Exception table:
	// // from to target type
	// // 92 130 127 finally
	// // 154 156 127 finally
	// }
	//
	// public boolean c(Rhapsody.RhapsodyListener paramRhapsodyListener)
	// {
	// a(paramRhapsodyListener);
	// boolean bool = b("GET_ACTIVE_ACCOUNT", true, false);
	// if (!bool)
	// this.bu = false;
	// else
	// c(bool);
	// return bool;
	// }
	//
	// public RhapsodyConnection d()
	// {
	// return this.br;
	// }
	//
	// public void d(boolean paramBoolean)
	// {
	// this.bv = paramBoolean;
	// }
	//
	// public void e(boolean paramBoolean)
	// {
	// this.bz = paramBoolean;
	// }
	//
	// public boolean e()
	// {
	// return this.bC;
	// }
	//
	// public RhapsodyUser f()
	// {
	// return this.bw;
	// }
	//
	// public void f(boolean paramBoolean)
	// {
	// this.bC = paramBoolean;
	// }
	//
	// public RhapsodyUser g()
	// {
	// return this.bA;
	// }
	//
	// public void g(boolean paramBoolean)
	// {
	// this.bF = paramBoolean;
	// if ((!paramBoolean) && (b()))
	// c();
	// }
	//
	// public boolean h()
	// {
	// int j;
	// try
	// {
	// if (this._director == null)
	// {
	// Ln.e("Unable to log out of Rhapsody since no Director.", new Object[0]);
	// int i = 0;
	// }
	// else
	// {
	// SendToDeviceCommand localSendToDeviceCommand =
	// (SendToDeviceCommand)CommandFactory.SendToDeviceProvider.a();
	// localSendToDeviceCommand.c("LOGOUT");
	// localSendToDeviceCommand.b(t());
	// localSendToDeviceCommand.d(false);
	// localSendToDeviceCommand.a(true);
	// boolean bool = this._director.a(localSendToDeviceCommand);
	// this.bw = null;
	// d(true);
	// }
	// }
	// catch (Exception j)
	// {
	// Ln.e(localException);
	// j = 0;
	// }
	// return j;
	// }
	//
	// public boolean i()
	// {
	// return this.bu;
	// }
	//
	// public String k()
	// {
	// return this.bD;
	// }
	//
	// public RhapsodyMusicGuide l()
	// {
	// if (this.bG == null)
	// this.bG = ((RhapsodyMusicGuide)this._musicGuideProvider.a());
	// return this.bG;
	// }
	//
	// public RhapsodyPlaylistCentral m()
	// {
	// if (this.bH == null)
	// this.bH = ((RhapsodyPlaylistCentral)this._playlistCentralProvider.a());
	// return this.bH;
	// }
	//
	// public RhapsodyChannelGuide n()
	// {
	// if (this.bI == null)
	// this.bI = ((RhapsodyChannelGuide)this._channelGuideProvider.a());
	// return this.bI;
	// }
	//
	// public RhapsodySearch o()
	// {
	// if (this.bJ == null)
	// this.bJ = ((RhapsodySearch)this._searchProvider.a());
	// return this.bJ;
	// }
	//
	// public boolean x_()
	// {
	// return this.bv;
	// }
	@Override
	public void a(RhapsodyListener paramRhapsodyListener) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean a(RhapsodyConnection paramRhapsodyConnection) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean a(
			Vector<String> paramVector,
			OnRhapsodyTracksRetrievedListener paramOnRhapsodyTracksRetrievedListener) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean a_(String paramString1, String paramString2) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void b(RhapsodyListener paramRhapsodyListener) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean b() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void c() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean c(RhapsodyListener paramRhapsodyListener) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public RhapsodyConnection d() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean e() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public RhapsodyUser f() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RhapsodyUser g() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean h() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean i() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String k() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RhapsodyMusicGuide l() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RhapsodyPlaylistCentral m() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RhapsodyChannelGuide n() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RhapsodySearch o() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean x_() {
		// TODO Auto-generated method stub
		return false;
	}
}
