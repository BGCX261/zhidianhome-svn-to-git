package com.zd.model.device;

import java.util.TimerTask;

import com.zd.model.DirectorResults;
import com.zd.model.Result;

public class iPod extends DirectorDevice {
	private static final int B = 1000;
	private static final int C = 1001;
	private static final int D = 1002;
	private static final int E = 1003;
	private static final int F = 1004;
	public static final String k = "1";
	public static final String l = "2";
	public static final String m = "32001";
	public static final String n = "32002";
	public static final String o = "32003";
	public static final String p = "32004";
	public static final String q = "32005";
	public static final String r = "32006";
	public static final String s = "32007";
	public static final String t = "32008";
	public static final int u = 20;
	protected TimerTask A;
	private String G;
	private String H;
	private String I;
	private String J;
	private int K;
	private int L;
	private String M;
	private String N;
	private boolean O;
	private boolean P;
	private boolean Q;
	private boolean R;
	private String S;
	private DirectorResults<Result> T;
	// private iPod.iPodState U;
	// private ArrayList<iPod.OniPodUpdatedListener> V;
	// private volatile boolean W = false;
	// private boolean X = true;
	// iPod.iPodPlayState v;
	// iPod.iPodShuffleState w;
	// iPod.iPodRepeatState x;
	// protected volatile boolean y = false;
	// protected Timer z;
	//
	// private void f(boolean paramBoolean)
	// {
	// this.W = paramBoolean;
	// }
	//
	// public iPod.iPodShuffleState E()
	// {
	// return this.w;
	// }
	//
	// public iPod.iPodRepeatState F()
	// {
	// return this.x;
	// }
	//
	// public String G()
	// {
	// return this.S;
	// }
	//
	// public DirectorResults<Result> H()
	// {
	// return this.T;
	// }
	//
	// public iPod.iPodState I()
	// {
	// return this.U;
	// }
	//
	// public boolean J()
	// {
	// int i;
	// if (this.T != null)
	// i = 0;
	// else
	// i = 1;
	// return i;
	// }
	//
	// public boolean K()
	// {
	// return this.y;
	// }
	//
	// public boolean L()
	// {
	// int i;
	// try
	// {
	// SendToDeviceCommand localSendToDeviceCommand =
	// (SendToDeviceCommand)CommandFactory.SendToDeviceProvider.a();
	// localSendToDeviceCommand.c("RESET");
	// localSendToDeviceCommand.b(t());
	// localSendToDeviceCommand.d(true);
	// localSendToDeviceCommand.c(false);
	// StringBuilder localStringBuilder = new
	// StringBuilder("<param><name>TYPE</name><value type=\"INT\"><static>");
	// if (this.U == iPod.iPodState.c);
	// for (String str = "1"; ; str = "0")
	// {
	// localStringBuilder.append(str);
	// localStringBuilder.append("</static></value></param>");
	// localSendToDeviceCommand.a(localStringBuilder.toString());
	// Ln.a("* Resetting iPod dock (" + u() + "): " +
	// localSendToDeviceCommand.a(0L), new Object[0]);
	// boolean bool = this._director.a(localSendToDeviceCommand);
	// if (!bool)
	// break;
	// Ln.a("* Retrieving iPod dock  (" + u() +
	// ") items since we just reset it.", new Object[0]);
	// j("QUERY_CURRENT_SETTINGS");
	// break;
	// }
	// }
	// catch (Exception i)
	// {
	// Ln.e(localException);
	// i = 0;
	// }
	// return i;
	// }
	//
	// public boolean M()
	// {
	// boolean bool2 = false;
	// try
	// {
	// boolean bool1 = a("SET_SHUFFLE", true, false);
	// bool2 = N();
	// bool2 &= bool1;
	// return bool2;
	// }
	// catch (Exception localException)
	// {
	// while (true)
	// Ln.e(localException);
	// }
	// }
	//
	// public boolean N()
	// {
	// try
	// {
	// e(true);
	// f(false);
	// boolean bool = a("GET_LIST", true, false);
	// if (!bool)
	// e(false);
	// return bool;
	// }
	// catch (Exception i)
	// {
	// while (true)
	// {
	// Ln.e(localException);
	// e(false);
	// int i = 0;
	// }
	// }
	// }
	//
	// public boolean O()
	// {
	// int i = 1;
	// int j;
	// try
	// {
	// if (this.S == null)
	// L();
	// if (!K())
	// {
	// e(true);
	// f(false);
	// SendToDeviceCommand localSendToDeviceCommand =
	// (SendToDeviceCommand)CommandFactory.SendToDeviceProvider.a();
	// localSendToDeviceCommand.c("LIST_SELECT");
	// localSendToDeviceCommand.b(t());
	// localSendToDeviceCommand.d(true);
	// localSendToDeviceCommand.c(false);
	// StringBuilder localStringBuilder = new
	// StringBuilder("<param><name>TITLE</name><value type=\"STRING\"><static>");
	// localStringBuilder.append("");
	// localStringBuilder.append("</static></value></param>");
	// localStringBuilder.append("<param><name>ITEM</name><value type=\"INT\"><static>");
	// localStringBuilder.append("32003");
	// localStringBuilder.append("</static></value></param>");
	// localStringBuilder.append("<param><name>TYPE</name><value type=\"INT\"><static>");
	// localStringBuilder.append(0);
	// localStringBuilder.append("</static></value></param>");
	// Room localRoom = this._director.m().s();
	// localStringBuilder.append("<param><name>ROOM_ID</name><value type=\"INT\"><static>");
	// localStringBuilder.append(localRoom.a());
	// localStringBuilder.append("</static></value></param>");
	// localSendToDeviceCommand.a(localStringBuilder.toString());
	// boolean bool = this._director.a(localSendToDeviceCommand);
	// if (!bool)
	// {
	// e(false);
	// f(false);
	// }
	// }
	// }
	// catch (Exception j)
	// {
	// Ln.e(localException);
	// e(false);
	// f(false);
	// j = 0;
	// }
	// return j;
	// }
	//
	// public boolean P()
	// {
	// boolean bool1 = false;
	// try
	// {
	// bool1 = a("SET_REPEAT", true, false);
	// boolean bool2 = N();
	// bool1 = bool2 & bool1;
	// return bool1;
	// }
	// catch (Exception localException)
	// {
	// while (true)
	// Ln.e(localException);
	// }
	// }
	//
	// public boolean Q()
	// {
	// boolean bool2 = false;
	// try
	// {
	// boolean bool1 = a("TOGGLE_COVERART", true, false);
	// bool2 = N();
	// bool2 &= bool1;
	// return bool2;
	// }
	// catch (Exception localException)
	// {
	// while (true)
	// Ln.e(localException);
	// }
	// }
	//
	// public boolean R()
	// {
	// return j("PLAYPAUSE");
	// }
	//
	// public boolean S()
	// {
	// int i;
	// try
	// {
	// if ((this._director != null) && (!this._director.G()))
	// {
	// Room localRoom = this._director.m().s();
	// SendToDeviceCommand localSendToDeviceCommand =
	// (SendToDeviceCommand)CommandFactory.SendToDeviceProvider.a();
	// if (this.U == iPod.iPodState.c);
	// for (Object localObject = "SELECT_VIDEO_DEVICE"; ; localObject =
	// "SELECT_AUDIO_DEVICE")
	// {
	// localSendToDeviceCommand.c((String)localObject);
	// localSendToDeviceCommand.b(localRoom.a());
	// localSendToDeviceCommand.d(true);
	// localSendToDeviceCommand.c(false);
	// localObject = new
	// StringBuilder("<param><name>devicegroup</name><value type=\"STRING\"><static>");
	// ((StringBuilder)localObject).append("audio");
	// ((StringBuilder)localObject).append("</static></value></param>");
	// ((StringBuilder)localObject).append("<param><name>deviceid</name><value type=\"INT\"><static>");
	// ((StringBuilder)localObject).append(t());
	// ((StringBuilder)localObject).append("</static></value></param>");
	// ((StringBuilder)localObject).append("<param><name>ROOM_ID</name><value type=\"INT\"><static>");
	// ((StringBuilder)localObject).append(localRoom.a());
	// ((StringBuilder)localObject).append("</static></value></param>");
	// localSendToDeviceCommand.a(((StringBuilder)localObject).toString());
	// boolean bool = this._director.a(localSendToDeviceCommand);
	// break;
	// }
	// }
	// }
	// catch (Exception i)
	// {
	// Ln.e(localException);
	// i = 0;
	// break label197;
	// i = 0;
	// }
	// label197: return i;
	// }
	//
	// public boolean T()
	// {
	// boolean bool;
	// if (this.T == null)
	// bool = false;
	// else
	// bool = this.T.g();
	// return bool;
	// }
	//
	// public boolean U()
	// {
	// return this.X;
	// }
	//
	// public Device.DeviceType a()
	// {
	// return Device.DeviceType.i;
	// }
	//
	// public void a(int paramInt)
	// {
	// this.K = paramInt;
	// }
	//
	// public void a(DirectorResults<Result> paramDirectorResults)
	// {
	// this.T = paramDirectorResults;
	// }
	//
	// // ERROR //
	// public void a(com.control4.director.data.Variable paramVariable, boolean
	// paramBoolean)
	// {
	// // Byte code:
	// // 0: aload_1
	// // 1: ifnonnull +4 -> 5
	// // 4: return
	// // 5: aload_1
	// // 6: invokevirtual 289 com/control4/director/data/Variable:b ()I
	// // 9: tableswitch default:+35 -> 44, 1000:+53->62, 1001:+137->146,
	// 1002:+148->157, 1003:+159->168, 1004:+170->179
	// // 45: aload_1
	// // 46: iload_2
	// // 47: invokespecial 291 com/control4/director/device/DirectorDevice:a
	// (Lcom/control4/director/data/Variable;Z)V
	// // 50: goto -46 -> 4
	// // 53: astore_3
	// // 54: aload_3
	// // 55: invokestatic 209 roboguice/util/Ln:e (Ljava/lang/Throwable;)I
	// // 58: pop
	// // 59: goto -55 -> 4
	// // 62: aload_0
	// // 63: aload_1
	// // 64: invokevirtual 293 com/control4/director/data/Variable:c
	// ()Ljava/lang/String;
	// // 67: putfield 295 com/control4/director/device/iPod:G
	// Ljava/lang/String;
	// // 70: aload_0
	// // 71: getfield 298 com/control4/director/device/iPod:j
	// Lcom/control4/director/device/Device$OnDeviceUpdateListener;
	// // 74: ifnull +13 -> 87
	// // 77: aload_0
	// // 78: getfield 298 com/control4/director/device/iPod:j
	// Lcom/control4/director/device/Device$OnDeviceUpdateListener;
	// // 81: aload_0
	// // 82: invokeinterface 303 2 0
	// // 87: aload_0
	// // 88: getfield 305 com/control4/director/device/iPod:V
	// Ljava/util/ArrayList;
	// // 91: ifnull -87 -> 4
	// // 94: aload_0
	// // 95: getfield 305 com/control4/director/device/iPod:V
	// Ljava/util/ArrayList;
	// // 98: astore_3
	// // 99: aload_3
	// // 100: monitorenter
	// // 101: aload_0
	// // 102: getfield 305 com/control4/director/device/iPod:V
	// Ljava/util/ArrayList;
	// // 105: invokevirtual 311 java/util/ArrayList:iterator
	// ()Ljava/util/Iterator;
	// // 108: astore 4
	// // 110: aload 4
	// // 112: invokeinterface 316 1 0
	// // 117: ifeq +131 -> 248
	// // 120: aload 4
	// // 122: invokeinterface 319 1 0
	// // 127: checkcast 321
	// com/control4/director/device/iPod$OniPodUpdatedListener
	// // 130: aload_0
	// // 131: invokeinterface 324 2 0
	// // 136: goto -26 -> 110
	// // 139: astore 4
	// // 141: aload_3
	// // 142: monitorexit
	// // 143: aload 4
	// // 145: athrow
	// // 146: aload_0
	// // 147: aload_1
	// // 148: invokevirtual 293 com/control4/director/data/Variable:c
	// ()Ljava/lang/String;
	// // 151: putfield 326 com/control4/director/device/iPod:J
	// Ljava/lang/String;
	// // 154: goto -84 -> 70
	// // 157: aload_0
	// // 158: aload_1
	// // 159: invokevirtual 293 com/control4/director/data/Variable:c
	// ()Ljava/lang/String;
	// // 162: putfield 328 com/control4/director/device/iPod:I
	// Ljava/lang/String;
	// // 165: goto -95 -> 70
	// // 168: aload_0
	// // 169: aload_1
	// // 170: invokevirtual 293 com/control4/director/data/Variable:c
	// ()Ljava/lang/String;
	// // 173: putfield 330 com/control4/director/device/iPod:H
	// Ljava/lang/String;
	// // 176: goto -106 -> 70
	// // 179: aload_1
	// // 180: invokevirtual 293 com/control4/director/data/Variable:c
	// ()Ljava/lang/String;
	// // 183: astore_3
	// // 184: aload_3
	// // 185: ifnull -115 -> 70
	// // 188: aload_3
	// // 189: ldc_w 332
	// // 192: invokevirtual 337 java/lang/String:equalsIgnoreCase
	// (Ljava/lang/String;)Z
	// // 195: ifeq +13 -> 208
	// // 198: aload_0
	// // 199: getstatic 341 com/control4/director/device/iPod$iPodPlayState:c
	// Lcom/control4/director/device/iPod$iPodPlayState;
	// // 202: putfield 343 com/control4/director/device/iPod:v
	// Lcom/control4/director/device/iPod$iPodPlayState;
	// // 205: goto -135 -> 70
	// // 208: aload_3
	// // 209: ldc_w 345
	// // 212: invokevirtual 337 java/lang/String:equalsIgnoreCase
	// (Ljava/lang/String;)Z
	// // 215: ifeq +13 -> 228
	// // 218: aload_0
	// // 219: getstatic 347 com/control4/director/device/iPod$iPodPlayState:b
	// Lcom/control4/director/device/iPod$iPodPlayState;
	// // 222: putfield 343 com/control4/director/device/iPod:v
	// Lcom/control4/director/device/iPod$iPodPlayState;
	// // 225: goto -155 -> 70
	// // 228: aload_3
	// // 229: ldc_w 349
	// // 232: invokevirtual 337 java/lang/String:equalsIgnoreCase
	// (Ljava/lang/String;)Z
	// // 235: ifeq -165 -> 70
	// // 238: aload_0
	// // 239: getstatic 351 com/control4/director/device/iPod$iPodPlayState:a
	// Lcom/control4/director/device/iPod$iPodPlayState;
	// // 242: putfield 343 com/control4/director/device/iPod:v
	// Lcom/control4/director/device/iPod$iPodPlayState;
	// // 245: goto -175 -> 70
	// // 248: aload_3
	// // 249: monitorexit
	// // 250: goto -246 -> 4
	// //
	// // Exception table:
	// // from to target type
	// // 5 50 53 java/lang/Exception
	// // 62 101 53 java/lang/Exception
	// // 143 245 53 java/lang/Exception
	// // 101 143 139 finally
	// // 248 250 139 finally
	// }
	//
	// public void a(iPod.OniPodUpdatedListener paramOniPodUpdatedListener)
	// {
	// if (this.V == null)
	// this.V = new ArrayList();
	// synchronized (this.V)
	// {
	// this.V.add(paramOniPodUpdatedListener);
	// return;
	// }
	// }
	//
	// public void a(iPod.iPodPlayState paramiPodPlayState)
	// {
	// this.v = paramiPodPlayState;
	// }
	//
	// public void a(iPod.iPodRepeatState paramiPodRepeatState)
	// {
	// this.x = paramiPodRepeatState;
	// }
	//
	// public void a(iPod.iPodShuffleState paramiPodShuffleState)
	// {
	// this.w = paramiPodShuffleState;
	// }
	//
	// public void a(iPod.iPodState paramiPodState)
	// {
	// this.U = paramiPodState;
	// }
	//
	// public void a(String paramString)
	// {
	// this.G = paramString;
	// }
	//
	// public void a(boolean paramBoolean)
	// {
	// this.O = paramBoolean;
	// }
	//
	// public boolean a(int paramInt1, int paramInt2)
	// {
	// try
	// {
	// e(true);
	// f(true);
	// SendToDeviceCommand localSendToDeviceCommand =
	// (SendToDeviceCommand)CommandFactory.SendToDeviceProvider.a();
	// localSendToDeviceCommand.c("GET_NEXT");
	// localSendToDeviceCommand.b(t());
	// localSendToDeviceCommand.d(true);
	// localSendToDeviceCommand.c(false);
	// StringBuilder localStringBuilder = new
	// StringBuilder("<param><name>FIRST</name><value type=\"INT\"><static>");
	// localStringBuilder.append(paramInt1);
	// localStringBuilder.append("</static></value></param>");
	// if (paramInt2 + paramInt1 > this.T.c())
	// paramInt2 = this.T.c() - paramInt1;
	// localStringBuilder.append("<param><name>NUM</name><value type=\"INT\"><static>");
	// localStringBuilder.append(paramInt2);
	// localStringBuilder.append("</static></value></param>");
	// localSendToDeviceCommand.a(localStringBuilder.toString());
	// boolean bool = this._director.a(localSendToDeviceCommand);
	// if (!bool)
	// {
	// e(false);
	// f(false);
	// }
	// return bool;
	// }
	// catch (Exception i)
	// {
	// while (true)
	// {
	// Ln.e(localException);
	// e(false);
	// f(false);
	// int i = 0;
	// }
	// }
	// }
	//
	// public boolean a(Result paramResult)
	// {
	// int i = 1;
	// if (paramResult == null)
	// {
	// i = 0;
	// return i;
	// }
	// while (true)
	// {
	// try
	// {
	// if (K())
	// break;
	// String str = paramResult.y();
	// if ((str == null) || ((!str.equals("1")) && (!str.equals("2"))))
	// break label267;
	// S();
	// Room localRoom = this._director.m().s();
	// SendToDeviceCommand localSendToDeviceCommand =
	// (SendToDeviceCommand)CommandFactory.SendToDeviceProvider.a();
	// localSendToDeviceCommand.c("LIST_SELECT");
	// localSendToDeviceCommand.b(t());
	// localSendToDeviceCommand.d(true);
	// localSendToDeviceCommand.c(false);
	// StringBuilder localStringBuilder = new
	// StringBuilder("<param><name>TITLE</name><value type=\"STRING\"><static>");
	// localStringBuilder.append(StringUtil.b(paramResult.au()));
	// localStringBuilder.append("</static></value></param>");
	// localStringBuilder.append("<param><name>ITEM</name><value type=\"INT\"><static>");
	// localStringBuilder.append(paramResult.at());
	// localStringBuilder.append("</static></value></param>");
	// localStringBuilder.append("<param><name>TYPE</name><value type=\"INT\"><static>");
	// localStringBuilder.append(str);
	// localStringBuilder.append("</static></value></param>");
	// localStringBuilder.append("<param><name>ROOM_ID</name><value type=\"INT\"><static>");
	// localStringBuilder.append(localRoom.a());
	// localStringBuilder.append("</static></value></param>");
	// localSendToDeviceCommand.a(localStringBuilder.toString());
	// f(false);
	// boolean bool = this._director.a(localSendToDeviceCommand);
	// if (bool)
	// break;
	// e(false);
	// }
	// catch (Exception j)
	// {
	// Ln.e(localException);
	// e(false);
	// int j = 0;
	// }
	// break;
	// label267: e(true);
	// }
	// }
	//
	// public String b()
	// {
	// return this.G;
	// }
	//
	// public void b(int paramInt)
	// {
	// this.L = paramInt;
	// }
	//
	// // ERROR //
	// public void b(DirectorResults<Result> paramDirectorResults)
	// {
	//
	// }
	//
	// // ERROR //
	// public void b(com.control4.director.data.Variable paramVariable, boolean
	// paramBoolean)
	// {
	//
	// }
	//
	// public void b(iPod.OniPodUpdatedListener paramOniPodUpdatedListener)
	// {
	// if (this.V != null)
	// synchronized (this.V)
	// {
	// this.V.remove(paramOniPodUpdatedListener);
	// }
	// }
	//
	// public void b(String paramString)
	// {
	// this.H = paramString;
	// }
	//
	// public void b(boolean paramBoolean)
	// {
	// this.P = paramBoolean;
	// }
	//
	// public String c()
	// {
	// return this.H;
	// }
	//
	// public void c(String paramString)
	// {
	// this.I = paramString;
	// }
	//
	// public void c(boolean paramBoolean)
	// {
	// this.Q = paramBoolean;
	// }
	//
	// public String d()
	// {
	// return this.I;
	// }
	//
	// public void d(String paramString)
	// {
	// this.J = paramString;
	// }
	//
	// public void d(boolean paramBoolean)
	// {
	// this.R = paramBoolean;
	// }
	//
	// public String e()
	// {
	// return this.J;
	// }
	//
	// public void e(String paramString)
	// {
	// this.M = paramString;
	// }
	//
	// // ERROR //
	// public void e(boolean paramBoolean)
	// {
	// // Byte code:
	// // 0: aload_0
	// // 1: iload_1
	// // 2: putfield 88 com/control4/director/device/iPod:y Z
	// // 5: aload_0
	// // 6: monitorenter
	// // 7: aload_0
	// // 8: getfield 583 com/control4/director/device/iPod:A
	// Ljava/util/TimerTask;
	// // 11: ifnull +11 -> 22
	// // 14: aload_0
	// // 15: getfield 583 com/control4/director/device/iPod:A
	// Ljava/util/TimerTask;
	// // 18: invokevirtual 588 java/util/TimerTask:cancel ()Z
	// // 21: pop
	// // 22: aload_0
	// // 23: getfield 88 com/control4/director/device/iPod:y Z
	// // 26: ifeq +110 -> 136
	// // 29: aload_0
	// // 30: getfield 590 com/control4/director/device/iPod:z Ljava/util/Timer;
	// // 33: ifnonnull +14 -> 47
	// // 36: aload_0
	// // 37: new 592 java/util/Timer
	// // 40: dup
	// // 41: invokespecial 593 java/util/Timer:<init> ()V
	// // 44: putfield 590 com/control4/director/device/iPod:z Ljava/util/Timer;
	// // 47: aload_0
	// // 48: new 595 com/control4/director/device/iPod$1
	// // 51: dup
	// // 52: aload_0
	// // 53: invokespecial 597 com/control4/director/device/iPod$1:<init>
	// (Lcom/control4/director/device/iPod;)V
	// // 56: putfield 583 com/control4/director/device/iPod:A
	// Ljava/util/TimerTask;
	// // 59: aload_0
	// // 60: getfield 590 com/control4/director/device/iPod:z Ljava/util/Timer;
	// // 63: aload_0
	// // 64: getfield 583 com/control4/director/device/iPod:A
	// Ljava/util/TimerTask;
	// // 67: ldc2_w 598
	// // 70: invokevirtual 603 java/util/Timer:schedule
	// (Ljava/util/TimerTask;J)V
	// // 73: aload_0
	// // 74: monitorexit
	// // 75: aload_0
	// // 76: getfield 305 com/control4/director/device/iPod:V
	// Ljava/util/ArrayList;
	// // 79: ifnull +56 -> 135
	// // 82: aload_0
	// // 83: getfield 305 com/control4/director/device/iPod:V
	// Ljava/util/ArrayList;
	// // 86: astore_2
	// // 87: aload_2
	// // 88: monitorenter
	// // 89: aload_0
	// // 90: getfield 305 com/control4/director/device/iPod:V
	// Ljava/util/ArrayList;
	// // 93: invokevirtual 311 java/util/ArrayList:iterator
	// ()Ljava/util/Iterator;
	// // 96: astore_3
	// // 97: aload_3
	// // 98: invokeinterface 316 1 0
	// // 103: ifeq +116 -> 219
	// // 106: aload_3
	// // 107: invokeinterface 319 1 0
	// // 112: checkcast 321
	// com/control4/director/device/iPod$OniPodUpdatedListener
	// // 115: aload_0
	// // 116: invokeinterface 605 2 0
	// // 121: goto -24 -> 97
	// // 124: astore_3
	// // 125: aload_2
	// // 126: monitorexit
	// // 127: aload_3
	// // 128: athrow
	// // 129: astore_2
	// // 130: aload_2
	// // 131: invokestatic 209 roboguice/util/Ln:e (Ljava/lang/Throwable;)I
	// // 134: pop
	// // 135: return
	// // 136: aload_0
	// // 137: getfield 305 com/control4/director/device/iPod:V
	// Ljava/util/ArrayList;
	// // 140: ifnull +57 -> 197
	// // 143: aload_0
	// // 144: getfield 305 com/control4/director/device/iPod:V
	// Ljava/util/ArrayList;
	// // 147: astore_2
	// // 148: aload_2
	// // 149: monitorenter
	// // 150: aload_0
	// // 151: getfield 305 com/control4/director/device/iPod:V
	// Ljava/util/ArrayList;
	// // 154: invokevirtual 311 java/util/ArrayList:iterator
	// ()Ljava/util/Iterator;
	// // 157: astore_3
	// // 158: aload_3
	// // 159: invokeinterface 316 1 0
	// // 164: ifeq +31 -> 195
	// // 167: aload_3
	// // 168: invokeinterface 319 1 0
	// // 173: checkcast 321
	// com/control4/director/device/iPod$OniPodUpdatedListener
	// // 176: aload_0
	// // 177: invokeinterface 607 2 0
	// // 182: goto -24 -> 158
	// // 185: astore_3
	// // 186: aload_2
	// // 187: monitorexit
	// // 188: aload_3
	// // 189: athrow
	// // 190: astore_2
	// // 191: aload_0
	// // 192: monitorexit
	// // 193: aload_2
	// // 194: athrow
	// // 195: aload_2
	// // 196: monitorexit
	// // 197: aload_0
	// // 198: getfield 590 com/control4/director/device/iPod:z
	// Ljava/util/Timer;
	// // 201: ifnull -128 -> 73
	// // 204: aload_0
	// // 205: getfield 590 com/control4/director/device/iPod:z
	// Ljava/util/Timer;
	// // 208: invokevirtual 609 java/util/Timer:cancel ()V
	// // 211: aload_0
	// // 212: aconst_null
	// // 213: putfield 590 com/control4/director/device/iPod:z
	// Ljava/util/Timer;
	// // 216: goto -143 -> 73
	// // 219: aload_2
	// // 220: monitorexit
	// // 221: goto -86 -> 135
	// //
	// // Exception table:
	// // from to target type
	// // 89 127 124 finally
	// // 219 221 124 finally
	// // 5 7 129 java/lang/Exception
	// // 75 89 129 java/lang/Exception
	// // 127 129 129 java/lang/Exception
	// // 193 195 129 java/lang/Exception
	// // 150 188 185 finally
	// // 195 197 185 finally
	// // 7 75 190 finally
	// // 136 150 190 finally
	// // 188 193 190 finally
	// // 197 216 190 finally
	// }
	//
	// public int f()
	// {
	// return this.K;
	// }
	//
	// public void f(String paramString)
	// {
	// this.N = paramString;
	// }
	//
	// public int g()
	// {
	// return this.L;
	// }
	//
	// public String h()
	// {
	// return this.M;
	// }
	//
	// public String i()
	// {
	// return this.N;
	// }
	//
	// public boolean k()
	// {
	// return this.O;
	// }
	//
	// public void l(String paramString)
	// {
	// this.S = paramString;
	// }
	//
	// public boolean l()
	// {
	// return this.P;
	// }
	//
	// public boolean m()
	// {
	// return this.Q;
	// }
	//
	// public boolean n()
	// {
	// return this.R;
	// }
	//
	// public iPod.iPodPlayState o()
	// {
	// return this.v;
	// }
	//
	// public void p()
	// {
	// try
	// {
	// super.p();
	// j("GET_PROPERTIES");
	// j("GET_LIST");
	// j("GET_REPEAT");
	// j("GET_SHUFFLE");
	// j("QUERY_CONFIGURATION");
	// j("QUERY_CURRENT_SETTINGS");
	// g(1000);
	// g(1001);
	// g(1002);
	// g(1003);
	// g(1004);
	// return;
	// }
	// catch (Exception localException)
	// {
	// while (true)
	// Ln.e(localException);
	// }
	// }
}

/*
 * Location: E:\去哪儿\com.control4.myhome-2\classes_dex2jar.jar Qualified Name:
 * com.control4.director.device.iPod JD-Core Version: 0.6.0
 */