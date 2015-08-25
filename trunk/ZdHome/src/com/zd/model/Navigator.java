package com.zd.model;

import java.text.SimpleDateFormat;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Vector;

import roboguice.util.Ln;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.database.sqlite.SQLiteDatabase;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.util.DisplayMetrics;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.zd.home.R;
import com.zd.home.service.PreferenceService;
import com.zd.model.device.Device;

@Singleton
public class Navigator {
	public interface NavigatorListener {
		public abstract void a();

		public abstract void a(int paramInt, String paramString);

		public abstract void a(Room paramRoom1, Room paramRoom2);

		public abstract void a(boolean paramBoolean);

		public abstract void b();

		public abstract boolean b(int paramInt, String paramString);

	}

	public static final int a = 192837;
	public static final boolean b = true;
	private static final int g = 40;
	private static final int h = 40000;
	private static final long i = 600000L;
	private static final long j = 30000L;
	private static final String k = "com.control4.receiver.CHECKIN";
	private String A;
	private Thread B;
	private volatile Integer C = Integer.valueOf(0);
	private volatile Boolean D = Boolean.valueOf(false);
	private volatile boolean E = false;
	private volatile boolean F;
	private volatile int G = 0;
	private volatile int H = 0;
	private volatile NetworkInfo.State I;
	private volatile NetworkInfo.State J;
	private final Runnable K = new Runnable() {

		@Override
		public void run() {
			// TODO Auto-generated method stub

		}
	};// new//new Navigator.2(this);
	private Director.DirectorListener L = new Director.DirectorListener() {

		@Override
		public void a() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void a(String paramString) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void a(boolean paramBoolean) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void b() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void c() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void d() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void e() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void f() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void g() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void h() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void i() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void j() {
			// TODO Auto-generated method stub
			
		}
	};
	private BroadcastReceiver M = new BroadcastReceiver() {

		@Override
		public void onReceive(Context context, Intent intent) {
			// TODO Auto-generated method stub

		}
	};
	private final Runnable N = new Runnable() {

		@Override
		public void run() {
			// TODO Auto-generated method stub

		}
	};
	//
	@Inject
	private ConnectivityManager _connectivityManager;
	//
	@Inject
	private final Context _context;
	//
	@Inject
	protected Director _director;
	//
	// @g
	// private Licenser _licenser;
	//
	@Inject
	protected PreferenceService _preferences;
	//
	// @g
	// private WifiManager _wifiManager;
	protected Room room;// c
	protected Floor d;
	protected Building e;
	protected Site f;
	private boolean l = true;
	private boolean m;
	private volatile boolean n = true;
	private volatile boolean o;
	private final Vector<Navigator.NavigatorListener> p = new Vector();
	private final Handler q = new Handler();
	private Thread r;
	private Thread s;
	// private String t = "vnd.youtube:XaMh55iASDQ";
	private final SimpleDateFormat u;

	private Timer v;
	private TimerTask w;
	private boolean x = false;
	private DisplayMetrics y;
	private Configuration z;

	@Inject
	public Navigator(Director paramDirector,
			PreferenceService paramPreferenceService, Context paramContext) {
		this._director = paramDirector;
		this._preferences = paramPreferenceService;
		this._context = paramContext;
		this.u = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	}

	private void initNetwork() {
		Object localObject = this._connectivityManager.getNetworkInfo(0);
		if (localObject != null)
			localObject = ((NetworkInfo) localObject).getState();
		else
			localObject = NetworkInfo.State.UNKNOWN;
		this.J = ((NetworkInfo.State) localObject);
		localObject = this._connectivityManager.getNetworkInfo(1);
		if (localObject != null)
			localObject = ((NetworkInfo) localObject).getState();
		else
			localObject = NetworkInfo.State.UNKNOWN;
		this.I = ((NetworkInfo.State) localObject);
		// Ln.a("Update connectivity state. wifi: " + d() + " mobile: " + e(),
		// new
		// Object[0]);
	}

	// private PendingIntent M()
	// {
	// Intent localIntent = new Intent();
	// localIntent.setAction("com.control4.receiver.CHECKIN");
	// return PendingIntent.getBroadcast(this._context, 192837, localIntent,
	// 134217728);
	// }
	//
	// private JSONObject N()
	// {
	// JSONObject localJSONObject = new JSONObject();
	// localJSONObject.put("installationId", Installation.a(this._context));
	// localJSONObject.put("osVersion", Build.VERSION.RELEASE);
	// localJSONObject.put("deviceModel", Build.MODEL);
	// localJSONObject.put("control4Version", this._director.d());
	// localJSONObject.put("controllerUUID", this._director.L());
	// localJSONObject.put("isInDemoMode", this._director.G());
	// if (this.y != null)
	// {
	// localJSONObject.put("screenWidth", this.y.widthPixels);
	// localJSONObject.put("screenHeight", this.y.heightPixels);
	// localJSONObject.put("screenDensity", this.y.densityDpi);
	// }
	// Object localObject2 = "";
	// String str2 = "";
	// String str1 = "";
	// Object localObject1 = this._director.m();
	// if (localObject1 != null)
	// {
	// ((Project)localObject1).n(m());
	// localObject2 = ((Project)localObject1).f();
	// str2 = ((Project)localObject1).h();
	// str1 = ((Project)localObject1).g();
	// }
	// localJSONObject.put("zipCode", localObject2);
	// localJSONObject.put("latitude", str2);
	// localJSONObject.put("longitude", str1);
	// localJSONObject.put("appVersion",
	// this._context.getPackageManager().getPackageInfo("com.control4.myhome",
	// 0).versionName);
	// localObject1 = "";
	// if (this.z != null)
	// {
	// localObject2 = this.z.locale;
	// if (localObject2 != null)
	// localObject1 = ((Locale)localObject2).getLanguage();
	// }
	// localJSONObject.put("locale", localObject1);
	// return (JSONObject)(JSONObject)localJSONObject;
	// }
	//
	// private void O()
	// {
	// Vector localVector = this.p;
	// monitorenter;
	// int i1 = 0;
	// try
	// {
	// while (true)
	// if (i1 < this.p.size())
	// {
	// Navigator.NavigatorListener localNavigatorListener =
	// (Navigator.NavigatorListener)this.p.get(i1);
	// if (localNavigatorListener != null);
	// try
	// {
	// localNavigatorListener.a();
	// i1++;
	// }
	// catch (Exception localException)
	// {
	// while (true)
	// Ln.e(localException, "Exception caught in reconnect started listener.",
	// new Object[0]);
	// }
	// }
	// }
	// finally
	// {
	// monitorexit;
	// }
	// monitorexit;
	// }
	//
	// private void P()
	// {
	// Vector localVector = this.p;
	// monitorenter;
	// int i1 = 0;
	// try
	// {
	// while (true)
	// if (i1 < this.p.size())
	// {
	// Navigator.NavigatorListener localNavigatorListener =
	// (Navigator.NavigatorListener)this.p.get(i1);
	// if (localNavigatorListener != null);
	// try
	// {
	// localNavigatorListener.b();
	// i1++;
	// }
	// catch (Exception localException)
	// {
	// while (true)
	// Ln.e(localException, "Exception caught in reconnect canceled listener.",
	// new Object[0]);
	// }
	// }
	// }
	// finally
	// {
	// monitorexit;
	// }
	// monitorexit;
	// }
	//
	public void a(boolean flag) {
		o = flag;
	}

	public static int a(Device.DeviceType paramDeviceType, int paramInt) {
		int i1;
		switch (paramDeviceType.ordinal()) {
		default:
			i1 = R.drawable.btnico_device;
			break;
		case 1:
			i1 = R.drawable.watch_tv;
			break;
		case 2:
			i1 = R.drawable.watch_cable;
			break;
		case 3:
			i1 = R.drawable.watch_satellite;
			break;
		case 4:
			i1 = R.drawable.watch_dvd;
			break;
		case 5:
			i1 = R.drawable.listen_ipod;
			break;
		case 6:
			i1 = R.drawable.listen_digitalaudio;
			break;
		case 7:
			i1 = R.drawable.watch_vcr;
			break;
		case 8:
			i1 = R.drawable.watch_discchanger;
			break;
		case 9:
			i1 = R.drawable.listen_audiocd;
			break;
		case 10:
			i1 = R.drawable.security_securitysystem;
			break;
		case 11:
		case 12:
			i1 = R.drawable.security_camera;
			break;
		case 13:
			i1 = R.drawable.watch_movies;
			break;
		case 14:
			i1 = R.drawable.listen_rhapsody;
			break;
		case 15:
			i1 = R.drawable.watch_channels;
			break;
		case 16:
			i1 = R.drawable.listen_stations;
			break;
		case 17:
			i1 = R.drawable.listen_mediaplayer;
			break;
		case 18:
			i1 = R.drawable.listen_amfmtuner;
			break;
		case 19:
			i1 = R.drawable.listen_xmtuner;
			break;
		case 20:
			i1 = R.drawable.listen_receiver;
			break;
		case 21:
			i1 = R.drawable.more_pool;
			break;
		case 22:
			i1 = R.drawable.listen_zones;
			break;
		case 23:
			i1 = R.drawable.listen_nowplaying;
			break;
		case 24:
			i1 = R.drawable.more_wakeups;
			break;
		case 25:
			i1 = R.drawable.more_motors;
		}
		return i1;
	}

	// private void a(PendingIntent paramPendingIntent)
	// {
	// if (paramPendingIntent == null)
	// M();
	// ((AlarmManager)this._context.getSystemService("alarm"));
	// Calendar.getInstance().add(6, 5);
	// }

	private void a(Room paramRoom1, Room paramRoom2) {
		Vector localVector = this.p;
		int i1 = 0;
		try {

			if (i1 < this.p.size()) {
				Navigator.NavigatorListener localNavigatorListener = (Navigator.NavigatorListener) this.p
						.get(i1);
				if (localNavigatorListener != null)
					;

				try {
					localNavigatorListener.a(paramRoom1, paramRoom2);
					i1++;
				} catch (Exception localException) {

				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	// private void b(PendingIntent paramPendingIntent)
	// {
	// if (paramPendingIntent == null)
	// paramPendingIntent = M();
	// ((AlarmManager)this._context.getSystemService("alarm")).cancel(paramPendingIntent);
	// }
	//
	// private void b(boolean paramBoolean)
	// {
	// Vector localVector = this.p;
	// monitorenter;
	// int i1 = 0;
	// try
	// {
	// while (true)
	// if (i1 < this.p.size())
	// {
	// Navigator.NavigatorListener localNavigatorListener =
	// (Navigator.NavigatorListener)this.p.get(i1);
	// if (localNavigatorListener != null);
	// try
	// {
	// localNavigatorListener.a(paramBoolean);
	// i1++;
	// }
	// catch (Exception localException)
	// {
	// while (true)
	// Ln.e(localException, "Exception caught in reconnect finished listener.",
	// new Object[0]);
	// }
	// }
	// }
	// finally
	// {
	// monitorexit;
	// }
	// monitorexit;
	// }
	//
	// protected void A()
	// {
	// try
	// {
	// this.v = new Timer();
	// this.w = new Navigator.3(this);
	// this.v.schedule(this.w, 600000L);
	// return;
	// }
	// catch (Exception localException)
	// {
	// while (true)
	// Ln.e(localException);
	// }
	// }

	protected void B() {
		try {
			if (this.w != null)
				this.w.cancel();
			if (this.v != null) {
				this.v.cancel();
				this.v = null;
			}

		} catch (Exception localException) {

			Ln.e(localException);
		}
	}

	public void C() {
		Project localProject = getProject();
		if (localProject != null) {
			Room localRoom = localProject.getRoombyID(this._preferences.a(
					this._director.k(), this._director.l()));
			if ((localRoom == null) && (localProject.n() > 0))
				localRoom = localProject.getEnableRoom(0);
			if (localRoom != null)
				b(localRoom);
			else
				Ln.d("Unable to find a room to activate.", new Object[0]);
		} else {
			Ln.d("Director does not have a project.  Unable to select last known room.",
					new Object[0]);
		}
	}

	public void D() {
		if (this.room != null) {
			this.room.S();
			this.room.ap();
			this.room = null;
			this.d = null;
			this.f = null;
			this.e = null;
		}
	}

	public boolean E() {
		if (this.C.intValue() <= 0)
			return false;
		else
			return true;

	}

	public void F() {
		if ((this._director.isDemo()) || (!this._director.M())
				|| (this._director.r()) || (this.C.intValue() > 0))
			;
		{
			if (!this._director.t()) {
				// Ln.a("Not attempting to reconnect to Director since it does not have a previous to try and connect to.",
				// new Object[0]);
				return;
			}
			synchronized (this.C) {
				// Ln.b("Creating new reconnect task", new Object[0]);
				this.C = Integer.valueOf(1 + this.C.intValue());
				this.B = new Thread(this.N, "Reconnect");
				this.B.start();
			}
		}
	}

	// public void G()
	// {
	// synchronized (this.C)
	// {
	// Ln.b("Cancelling Navigator reconnect. Current count: " + this.C, new
	// Object[0]);
	// if ((this.C.intValue() > 0) && (this.B != null))
	// {
	// Ln.b("Cancelling reconnect task for reconnect", new Object[0]);
	// this.B.interrupt();
	// }
	// this.B = null;
	// return;
	// }
	// }

	public boolean H() {
		return this.n;
	}

	public boolean I() {
		return this.x;
	}

	// public void J()
	// {
	// try
	// {
	// this.r = new Thread(new Navigator.7(this), "Video-URL-Retrieval");
	// this.r.start();
	// return;
	// }
	// catch (Exception localException)
	// {
	// while (true)
	// Ln.e(localException);
	// }
	// }
	//
	// protected void K()
	// {
	// Object localObject1 = null;
	// try
	// {
	// Object localObject2 = new
	// StringBuilder("<?xml version=\"1.0\" encoding=\"utf-8\"?><GetIntroVideoURLRequest xmlns=\"\"><DeviceType>Android</DeviceType><DeviceOSVersion>");
	// ((StringBuilder)localObject2).append(Build.VERSION.RELEASE);
	// ((StringBuilder)localObject2).append("</DeviceOSVersion><DeviceUDID>");
	// ((StringBuilder)localObject2).append(Installation.a(this._context));
	// ((StringBuilder)localObject2).append("</DeviceUDID><DeviceLocale>");
	// if (this.z != null)
	// {
	// localObject3 = this.z.locale;
	// if (localObject3 != null)
	// localObject1 = ((Locale)localObject3).getLanguage();
	// }
	// ((StringBuilder)localObject2).append((String)localObject1);
	// ((StringBuilder)localObject2).append("</DeviceLocale><AppVersion>");
	// ((StringBuilder)localObject2).append(this.A);
	// ((StringBuilder)localObject2).append("</AppVersion></GetIntroVideoURLRequest>");
	// Object localObject3 = new
	// HttpPost("http://mbl.control4.com/myhome/app.php");
	// localObject2 = new StringEntity(((StringBuilder)localObject2).toString(),
	// "UTF-8");
	// ((StringEntity)localObject2).setContentType("text/xml");
	// ((HttpPost)localObject3).setHeader("Content-Type",
	// "text/xml;charset=UTF-8");
	// ((HttpPost)localObject3).setHeader("X-CONTROL4-API-CALL-NAME",
	// "GetIntroVideoURL");
	// ((HttpPost)localObject3).setHeader("X-CONTROL4-API-LOCALE",
	// (String)localObject1);
	// ((HttpPost)localObject3).setEntity((HttpEntity)localObject2);
	// localObject1 = (BasicHttpResponse)new
	// DefaultHttpClient().execute((HttpUriRequest)localObject3);
	// if (((BasicHttpResponse)localObject1).getStatusLine().getStatusCode() ==
	// 200)
	// {
	// localObject1 = ((BasicHttpResponse)localObject1).getEntity();
	// if (localObject1 != null)
	// {
	// localObject2 = ((HttpEntity)localObject1).getContent();
	// localObject1 = XmlPullParserFactory.newInstance().newPullParser();
	// ((XmlPullParser)localObject1).setInput((InputStream)localObject2, null);
	// localObject2 = new HashParser();
	// ((HashParser)localObject2).a((XmlPullParser)localObject1);
	// localObject1 = ((HashParser)localObject2).a();
	// if ((localObject1 != null) && (((HashMap)localObject1).size() > 0))
	// {
	// localObject2 = (String)((HashMap)localObject1).get("URL");
	// IntegerUtil.a((String)((HashMap)localObject1).get("Status"));
	// ((String)((HashMap)localObject1).get("StatusMessage"));
	// if (localObject2 != null)
	// this.t = ((String)localObject2);
	// }
	// }
	// }
	// return;
	// }
	// catch (IOException localIOException)
	// {
	// while (true)
	// Ln.e(localIOException);
	// }
	// catch (IllegalStateException localIllegalStateException)
	// {
	// while (true)
	// Ln.e(localIllegalStateException);
	// }
	// catch (Exception localException)
	// {
	// while (true)
	// Ln.e(localException);
	// }
	// }
	//
	// public JSONObject a(String paramString1, String paramString2)
	// {
	// try
	// {
	// Object localObject = N();
	// ((JSONObject)localObject).put("code", paramString1);
	// ((JSONObject)localObject).put("code_email", paramString2);
	// localJSONObject = this._licenser.a((JSONObject)localObject);
	// if ((localJSONObject.has("status")) &&
	// (localJSONObject.getString("status").equalsIgnoreCase("SUCCESS")) &&
	// (localJSONObject.has("sessionId")) && (localJSONObject.has("timeStamp")))
	// {
	// Calendar localCalendar = Calendar.getInstance();
	// localObject = TimeZone.getDefault();
	// localCalendar.setTimeInMillis(this.u.parse(localJSONObject.getString("timeStamp")).getTime());
	// localCalendar.add(14,
	// ((TimeZone)localObject).getOffset(localCalendar.getTimeInMillis()));
	// this._preferences.a(paramString1);
	// this._preferences.b(localJSONObject.getString("sessionId"));
	// this._preferences.a(localCalendar.getTime());
	// this._director.d(false);
	// this.o = false;
	// w();
	// }
	// return localJSONObject;
	// }
	// catch (Exception localException)
	// {
	// while (true)
	// {
	// Ln.e(localException);
	// JSONObject localJSONObject = new JSONObject();
	// }
	// }
	// }
	//
	// public void a(int paramInt, String paramString)
	// {
	// int i1 = 0;
	// this.x = true;
	// try
	// {
	// this._preferences.b(true);
	// }
	// catch (Exception localException2)
	// {
	// try
	// {
	// while (true)
	// {
	// D();
	// this._director.e(false);
	// synchronized (this.p)
	// {
	// while (true)
	// {
	// Vector localVector;
	// if (i1 < this.p.size())
	// {
	// Navigator.NavigatorListener localNavigatorListener =
	// (Navigator.NavigatorListener)this.p.get(i1);
	// if (localNavigatorListener != null)
	// localNavigatorListener.a(paramInt, paramString);
	// i1++;
	// continue;
	// localException2 = localException2;
	// Ln.e(localException2);
	// break;
	// }
	// }
	// }
	// }
	// }
	// catch (Exception localException1)
	// {
	// Ln.e(localException1);
	// }
	// }
	// }
	//
	public void a(DisplayMetrics paramDisplayMetrics,
			Configuration paramConfiguration, String paramString) {
		this.y = paramDisplayMetrics;
		this.z = paramConfiguration;
		this.A = paramString;
		this._director.a(paramDisplayMetrics);
	}

	public void a(Building paramBuilding) {
		this.e = paramBuilding;
	}

	public void a(Floor paramFloor) {
		this.d = paramFloor;
	}

	public void a(Room paramRoom) {
		this.room = paramRoom;
	}

	public void a(Site paramSite) {
		this.f = paramSite;
	}

	public void a(Navigator.NavigatorListener paramNavigatorListener) {
		synchronized (this.p) {
			if (!this.p.contains(paramNavigatorListener))
				this.p.add(paramNavigatorListener);
			return;
		}
	}

	public boolean a() {
		return this.D.booleanValue();
	}

	public void b() {
		// Ln.a("Starting Navigator.startup", new Object[0]);
		synchronized (this.D) {
			if (this.D.booleanValue())
				return;
			this.D = Boolean.valueOf(true);
			// Ln.b("Navigator.startup", new Object[0]);
			if (this._director.r())
				C();
			this._director.a(this.L);
			initNetwork();
		}
		try {
			this._context.registerReceiver(this.M, new IntentFilter(
					"android.net.conn.CONNECTIVITY_CHANGE"));

			return;

		} catch (Exception localException) {

		}
	}

	// public void b(int paramInt, String paramString)
	// {
	// Vector localVector = this.p;
	// monitorenter;
	// int i1 = 0;
	// try
	// {
	// while (true)
	// if (i1 < this.p.size())
	// {
	// Navigator.NavigatorListener localNavigatorListener =
	// (Navigator.NavigatorListener)this.p.get(i1);
	// if (localNavigatorListener != null)
	// {
	// int i2 = this._preferences.d();
	// if (i2 >= paramInt);
	// }
	// try
	// {
	// if (localNavigatorListener.b(paramInt, paramString))
	// this._preferences.a(paramInt);
	// i1++;
	// }
	// catch (Exception localException)
	// {
	// while (true)
	// Ln.e(localException, "Exception caught in display message listener", new
	// Object[0]);
	// }
	// }
	// }
	// finally
	// {
	// monitorexit;
	// }
	// monitorexit;
	// }
	//
	public void b(Room paramRoom) {
		if ((this.room != paramRoom) || (this.room == null) || (!this.room.l())) {
			Room localRoom = this.room;
			D();
			this.room = paramRoom;
			if (paramRoom != null) {
				this._preferences.a(this._director.k(), this._director.l(),
						paramRoom.a());
				Project localProject = getProject();
				if (localProject != null) {
					this.d = localProject.f(paramRoom.c());
					if (this.d != null) {
						this.e = localProject.d(this.d.c());
						if (this.e != null)
							this.f = localProject.getSite(this.e.c());
					}
				}
				localProject.o(paramRoom.a());
				if (!this.room.C())
					this.room.a(m());
				this.room.Q();
				this.room.f();
				a(localRoom, this.room);
			}
		}
	}

	public void b(Navigator.NavigatorListener paramNavigatorListener) {
		synchronized (this.p) {
			if (this.p.contains(paramNavigatorListener))
				this.p.remove(paramNavigatorListener);
			return;
		}
	}

	public void c() {
		synchronized (this.D) {
			if (!this.D.booleanValue())
				return;
			// Ln.b("Navigator.shutdown", new Object[0]);
			if (this._director != null)
				this._director.b(this.L);
		}
		try {
			this._context.unregisterReceiver(this.M);
			// label64:
			this.D = Boolean.valueOf(false);
			this.l = true;

		} catch (IllegalArgumentException localIllegalArgumentException) {

		}
	}

	public boolean d() {

		if ((this.I != NetworkInfo.State.CONNECTED)
				&& (this.I != NetworkInfo.State.CONNECTING))
			return false;
		else
			return true;
	}

	public boolean e() {
		if ((this.J != NetworkInfo.State.CONNECTED)
				&& (this.J != NetworkInfo.State.CONNECTING))
			return false;
		else
			return true;
	}

	public boolean f() {
		int i1;
		if ((!d()) && (!e()))
			return false;
		else
			return true;
	}

	public boolean g() {
		return this._director.r();
	}

	public Room croom() // h
	{
		return this.room;
	}

	public Floor i() {
		return this.d;
	}

	public Building j() {
		return this.e;
	}

	public Site k() {
		return this.f;
	}

	// l()
	public Project getProject() {
		DirectorProject localDirectorProject;
		if (this._director == null) {
			localDirectorProject = null;
		} else {
			localDirectorProject = this._director.m();
		}
		return localDirectorProject;
	}

	public SQLiteDatabase m() {
		SQLiteDatabase localSQLiteDatabase;
		if (this._director == null) {

			localSQLiteDatabase = null;
		} else {
			localSQLiteDatabase = this._director.p();
		}
		return localSQLiteDatabase;
	}

	public SQLiteDatabase n() {
		SQLiteDatabase localSQLiteDatabase;
		if (this._director == null) {
			Ln.e("Navigator has no Director!   Unable to get the media database.",
					new Object[0]);
			localSQLiteDatabase = null;
		} else {
			localSQLiteDatabase = this._director.q();
		}
		return localSQLiteDatabase;
	}

	public Director o() {
		return this._director;
	}

	public boolean p() {
		return this.m;
	}

	public boolean r() {
		boolean bool;
		if ((this._director != null) && (this._director.isDemo())) {
			if (this._director.isDemo())
				bool = this.o;
			else
				bool = false;
		} else
			bool = true;
		return bool;
	}

	public void s() {

		try {
			this.m = false;
			if (!this.q.postDelayed(this.K, 30000L))
				Ln.e("Failed to postDelayed app background runnable",
						new Object[0]);

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public void t() {

		try {
			this.m = true;
			this._director.a(true);
			B();
			if (this.n) {
				this.r = new Thread(new Runnable() {

					@Override
					public void run() {
						// TODO Auto-generated method stub

					}
				}, "L-Check");
				this.r.start();
			}

		} catch (Exception e) {
			// TODO: handle exception
		} finally {

		}

	}

	// public JSONObject u()
	// {
	// Object localObject = N();
	// ((JSONObject)localObject).put("code", this._preferences.k());
	// ((JSONObject)localObject).put("sessionId", this._preferences.l());
	// ((JSONObject)localObject).put("timeStamp",
	// this.u.format(this._preferences.m()));
	// PendingIntent localPendingIntent = M();
	// b(localPendingIntent);
	// JSONObject localJSONObject = this._licenser.b((JSONObject)localObject);
	// if ((localJSONObject.has("status")) &&
	// (localJSONObject.getString("status").equalsIgnoreCase("SUCCESS")) &&
	// (localJSONObject.has("sessionId")) && (localJSONObject.has("timeStamp")))
	// {
	// Calendar localCalendar = Calendar.getInstance();
	// localObject = TimeZone.getDefault();
	// localCalendar.setTimeInMillis(this.u.parse(localJSONObject.getString("timeStamp")).getTime());
	// localCalendar.add(14,
	// ((TimeZone)localObject).getOffset(localCalendar.getTimeInMillis()));
	// this._preferences.b(localJSONObject.getString("sessionId"));
	// this._preferences.a(localCalendar.getTime());
	// a(localPendingIntent);
	// }
	// return (JSONObject)localJSONObject;
	// }
	//
	// public JSONObject v()
	// {
	// try
	// {
	// JSONObject localJSONObject1 = N();
	// localJSONObject1.put("code", this._preferences.k());
	// localJSONObject1.put("sessionId", this._preferences.l());
	// localJSONObject1.put("timeStamp", this.u.format(this._preferences.m()));
	// localJSONObject1 = this._licenser.c(localJSONObject1);
	// if ((localJSONObject1.has("status")) &&
	// (localJSONObject1.getString("status").equalsIgnoreCase("SUCCESS")))
	// {
	// this._preferences.a("");
	// this._preferences.b("");
	// this._director.d(true);
	// this.o = true;
	// b(M());
	// }
	// return localJSONObject1;
	// }
	// catch (Exception localJSONObject2)
	// {
	// while (true)
	// {
	// Ln.e(localException);
	// JSONObject localJSONObject2 = new JSONObject();
	// }
	// }
	// }

	public void w() {
		a((Building) null);
	}

	// public void x()
	// {
	// b(null);
	// }

	public boolean y() {
		Intent localIntent = new Intent("com.control4.receiver.CHECKIN");
		int i1;
		if (PendingIntent.getBroadcast(this._context, 192837, localIntent,
				536870912) == null)
			return false;
		else
			return true;

	}

	// public void z()
	// {
	// while (true)
	// {
	// try
	// {
	// if (!this.n)
	// break label746;
	// if (this.m)
	// continue;
	// Ln.a("Not checking with license server since we don't have an active activity.",
	// new Object[0]);
	// this.n = false;
	// localObject1 = Installation.a(this._context);
	// if (this.y != null)
	// {
	// int i5 = this.y.heightPixels;
	// i4 = this.y.widthPixels;
	// int i1 = this.y.densityDpi;
	// i4 = i4;
	// i6 = i5;
	// String str2 = Build.MODEL;
	// String str5 = Build.VERSION.RELEASE;
	// str3 = this._director.d();
	// str4 = this._director.L();
	// boolean bool = this._director.G();
	// str1 = null;
	// if (this.z == null)
	// continue;
	// localObject2 = this.z.locale;
	// if (localObject2 == null)
	// continue;
	// str1 = ((Locale)localObject2).getLanguage();
	// str6 = "";
	// localObject2 = "";
	// str7 = "";
	// Object localObject3 = this._director.m();
	// if (localObject3 == null)
	// continue;
	// ((Project)localObject3).n(m());
	// str6 = ((Project)localObject3).f();
	// localObject2 = ((Project)localObject3).h();
	// str7 = ((Project)localObject3).g();
	// localObject3 = new ArrayList(15);
	// ((List)localObject3).add(new BasicNameValuePair("installationId",
	// (String)localObject1));
	// ((List)localObject3).add(new BasicNameValuePair("appVersion", this.A));
	// ((List)localObject3).add(new BasicNameValuePair("osVersion", str5));
	// if (str3 == null)
	// continue;
	// ((List)localObject3).add(new BasicNameValuePair("control4Version",
	// str3));
	// ((List)localObject3).add(new BasicNameValuePair("deviceModel", str2));
	// ((List)localObject3).add(new BasicNameValuePair("screenWidth",
	// Integer.toString(i4)));
	// ((List)localObject3).add(new BasicNameValuePair("screenHeight",
	// Integer.toString(i6)));
	// ((List)localObject3).add(new BasicNameValuePair("screenDensity",
	// Integer.toString(i1)));
	// if (str4 == null)
	// break label747;
	// ((List)localObject3).add(new BasicNameValuePair("controllerUUID", str4));
	// ((List)localObject3).add(new BasicNameValuePair("isInDemoMode",
	// Boolean.toString(bool)));
	// if (str6 == null)
	// break label755;
	// ((List)localObject3).add(new BasicNameValuePair("zipCode", str6));
	// if (localObject2 == null)
	// break label763;
	// ((List)localObject3).add(new BasicNameValuePair("latitude",
	// (String)localObject2));
	// if (str7 == null)
	// break label771;
	// ((List)localObject3).add(new BasicNameValuePair("longitude", str7));
	// if (str1 == null)
	// break label779;
	// ((List)localObject3).add(new BasicNameValuePair("locale", str1));
	// ((List)localObject3).add(new BasicNameValuePair("seed",
	// UUID.randomUUID().toString()));
	// localObject1 = this._licenser.a((List)localObject3);
	// if (localObject1 == null)
	// continue;
	// if (((Licenser.LicenseCheckResult)localObject1).a != 0)
	// continue;
	// a(((Licenser.LicenseCheckResult)localObject1).c,
	// ((Licenser.LicenseCheckResult)localObject1).b);
	// this._director.w();
	// }
	// }
	// catch (IllegalStateException i2)
	// {
	// Object localObject1;
	// Ln.e(localIllegalStateException);
	// break label746;
	// String str3 = "";
	// continue;
	// this._preferences.b(false);
	// if ((((Licenser.LicenseCheckResult)localObject1).b == null) ||
	// (((Licenser.LicenseCheckResult)localObject1).b.length() <= 0))
	// continue;
	// int i2 = this._preferences.d();
	// if (((Licenser.LicenseCheckResult)localObject1).c <= i2)
	// continue;
	// b(((Licenser.LicenseCheckResult)localObject1).c,
	// ((Licenser.LicenseCheckResult)localObject1).b);
	// if (this._director.M())
	// continue;
	// this._director.e(true);
	// continue;
	// }
	// catch (Exception localException)
	// {
	// Ln.e(localException);
	// this.n = false;
	// }
	// int i3 = 0;
	// int i4 = 0;
	// int i6 = 0;
	// continue;
	// label746: return;
	// label747: String str4 = "";
	// continue;
	// label755: String str6 = "";
	// continue;
	// label763: Object localObject2 = "";
	// continue;
	// label771: String str7 = "";
	// continue;
	// label779: String str1 = "";
	// }
	// }
}
