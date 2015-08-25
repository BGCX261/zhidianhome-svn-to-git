package com.zd.model;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.Socket;
import java.util.Hashtable;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import roboguice.util.Ln;
import android.app.Application;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import android.util.DisplayMetrics;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.Singleton;
import com.zd.home.director.DirectorConnection;
import com.zd.home.service.FileService;
import com.zd.home.service.PreferenceService;
import com.zd.home.util.Installation;
import com.zd.model.audio.Control4Rhapsody;
import com.zd.model.audio.DirectorAlbum;
import com.zd.model.audio.DirectorArtist;
import com.zd.model.audio.DirectorGenre;
import com.zd.model.audio.DirectorPlaylist;
import com.zd.model.audio.DirectorSong;
import com.zd.model.audio.DirectorZoneManager;
import com.zd.model.audio.ZoneManager;
import com.zd.model.command.AuthenticateDeviceCommand;
import com.zd.model.command.Command;
import com.zd.model.command.CommandFactory;
import com.zd.model.command.EnableEventsCommand;
import com.zd.model.command.GetItemsCommand;
import com.zd.model.director.broadcast.DirectorBroadcast;
import com.zd.model.director.broadcast.DirectorBroadcastCollection;
import com.zd.model.rhapsody.Rhapsody;

@Singleton
public class Control4Director implements Director {
	public static final boolean a = false;
	protected static final long b = 30000L;
	public static final String c = "c4soap";
	public static final String d = "seq";
	public static final String e = "name";
	public static final String f = "result";
	private static final int k = 45000;
	private static final long l = 10000L;
	private static final long m = 15000L;
	private static final String n = "Director";
	private static final int o = 5;
	private static final int p = 250;
	private static final int q = 1500;
	private static final int r = 1500;
	private static final int s = 5;
	private static final boolean Y = false;
	private boolean A;
	private boolean B = false;
	private boolean C = false;
	private boolean D;
	private final PreferenceService E;
	private Socket F;
	private Thread G;
	private Thread H;
	private Timer I;
	private TimerTask J;
	private SQLiteDatabase K;
	private SQLiteDatabase L;
	private ExecutorService M;
	private long N = -1L;
	private volatile long O = 0L;
	private final Hashtable<Long, Command> P = new Hashtable();
	private final BlockingPriorityCommandQueue Q = new BlockingPriorityCommandQueue();
	private DirectorConnection R;
	private boolean S = false;
	private DirectorProject project;
	private Vector<Director.DirectorListener> U;
	private Director.OnProgressUpdateListener V;
	private String W;
	private FileService X;
	private boolean isDemo;
	private DisplayMetrics Z;

	@Inject
	public Provider<DirectorAlbum> _albumProvider;

	@Inject
	private Application _applicationContext;

	@Inject
	public Provider<DirectorArtist> _artistProvider;

	@Inject
	private Provider<FileService> _fileServiceProvider;

	@Inject
	public Provider<DirectorGenre> _genreProvider;

	@Inject
	public Provider<DirectorPlaylist> _playlistProvider;

	@Inject
	private Provider<DirectorProject> _projectProvider;

	@Inject
	public Provider<DirectorResult> _resultProvider;

	@Inject
	private Provider<Control4Rhapsody> _rhapsodyProvider;

	@Inject
	public Provider<DirectorSong> _songProvider;

	@Inject
	private DirectorZoneManager _zoneManager;
	private Control4Rhapsody aa;
	private boolean ab = true;
	private boolean ac = false;
	private Handler ad = new Handler();
	private Runnable ae = new Runnable() {

		@Override
		public void run() {
			// TODO Auto-generated method stub

		}
	};
	private Director.OnVersionInfoUpdateListener af = new OnVersionInfoUpdateListener() {

	};
	private volatile boolean ag = false;
	private final Director.OnAuthenticateDeviceStatusListener ah = new Director.OnAuthenticateDeviceStatusListener() {

		public void a() {

			// Control4Director.a(Control4Director.this, true);
			// Control4Director.f(Control4Director.this);
		}

		public void a(String paramString) {

			// Control4Director.a(Control4Director.this, false);
			// Control4Director.g(Control4Director.this);
		}

	};
	private String ai;
	// private final Rhapsody.RhapsodyListener aj = new
	// Control4Director.8(this);
	private Runnable ak = new Runnable() {

		@Override
		public void run() {
			// TODO Auto-generated method stub

		}
	};
	protected Thread g;
	protected Thread h;
	private String t;
	private String u;
	private String v;
	private String w;
	private double x = 2.0D;
	private boolean y = true;
	private boolean z;

	static {
		boolean bool;
		if (Control4Director.class.desiredAssertionStatus())
			bool = false;
		else
			bool = true;
		// i = bool;
	}

	@Inject
	public Control4Director(PreferenceService paramPreferenceService) {
		this.E = paramPreferenceService;
		this.isDemo = this.E.c();
	}

	private void createDatabase() {
		try {
			if (this.R != null) {
				String str = this.R.a();
				int j = this.R.b();
				this.K = new ProjectDatabaseHelper(this._applicationContext,
						str + "_" + j).getWritableDatabase();
			}
		} catch (Exception localFileNotFoundException) {
			Ln.e(localFileNotFoundException, "Database file wasn't found",
					new Object[0]);
		}

	}

	private void S() {
		// try
		// {
		// if (this.R != null)
		// {
		// String str = this.R.a();
		// int j = this.R.b();
		// this.L = new MediaDatabaseHelper(this._applicationContext, str + "_"
		// + j).getWritableDatabase();
		// }
		// }
		// catch (FileNotFoundException localFileNotFoundException)
		// {
		// Ln.e(localFileNotFoundException, "Media Database file wasn't found",
		// new Object[0]);
		// }
		// catch (IOException localIOException)
		// {
		// Ln.e(localIOException, "Failed to open media database", new
		// Object[0]);
		// }
	}

	private void T() {
		// if (this.U == null);
		// Vector localVector = this.U;
		// int j = 0;
		// try
		// {
		//
		// int i1 = this.U.size();
		// if (j < i1)
		// try
		// {
		// ((Director.DirectorListener)this.U.get(j)).h();
		// j++;
		// }
		// catch (Exception localException)
		// {
		//
		// }
		//
		// }catch (Exception e) {
		// // TODO: handle exception
		// }

	}

	private void U() {
		// try
		// {
		// if (this.U != null)
		// synchronized (this.U)
		// {
		// Iterator localIterator = this.U.iterator();
		// while (true)
		// if (localIterator.hasNext())
		// {
		// Director.DirectorListener localDirectorListener =
		// (Director.DirectorListener)localIterator.next();
		// try
		// {
		// localDirectorListener.i();
		// }
		// catch (Exception localException2)
		// {
		// Ln.e(localException2,
		// "Exception occurred calling director listener onConnected", new
		// Object[0]);
		// }
		// }
		// }
		// }
		// catch (Exception localException1)
		// {
		// Ln.e(localException1);
		// }

	}

	private void V() {
		// try
		// {
		// if (this.V != null)
		// this.V.b();
		// return;
		// }
		// catch (Exception localException)
		// {
		//
		// }
	}

	private void W() {
		// try
		// {
		// this.I = new Timer();
		// this.J = new Control4Director.6(this);
		// this.I.schedule(this.J, 10000L, 15000L);
		// return;
		// }
		// catch (Exception localException)
		// {
		//
		// }
	}

	private void X() {
		// try
		// {
		// if (this.J != null)
		// {
		// this.J.cancel();
		// this.J = null;
		// }
		// if (this.I != null)
		// {
		// this.I.cancel();
		// this.I = null;
		// }
		// return;
		// }
		// catch (Exception localException)
		// {
		//
		// }
	}

	private void Y() {
		try {
			ab();
			aa();
			Z();
			return;
		} catch (Exception localException) {
			Ln.e(localException);
		}
	}

	private void Z() {

		// int i1;
		// InputStream localInputStream;
		// try
		// {
		// Object localObject1 = (DirectorRoom)m().s();
		// ((DirectorRoom)localObject1).h(true);
		// DirectorBroadcastCollection localDirectorBroadcastCollection =
		// (DirectorBroadcastCollection)((DirectorRoom)localObject1).aw();
		// localDirectorBroadcastCollection.a();
		// int j = localDirectorBroadcastCollection.e();
		// localObject1 = this._applicationContext.getResources();
		// i1 = 0;
		// if (i1 < j)
		// {
		// Object localObject2 =
		// (DirectorBroadcast)localDirectorBroadcastCollection.a(i1);
		// String str = ((DirectorBroadcast)localObject2).E_();
		// if ((str == null) || (str.length() == 0))
		// break label281;
		// Object localObject3 = str.split("/");
		// if (localObject3.length <= 1)
		// continue;
		// str = localObject3[(-1 + localObject3.length)];
		// localObject2 = new File(((DirectorBroadcast)localObject2).av());
		// if (((File)localObject2).exists())
		// break label281;
		// localObject3 = ((File)localObject2).getParentFile();
		// if (localObject3 == null)
		// continue;
		// ((File)localObject3).mkdirs();
		// try
		// {
		// int i2 = ((Resources)localObject1).getIdentifier("channel_" +
		// str.replace("-", "_"), "raw",
		// this._applicationContext.getPackageName());
		// if (i2 == 0)
		// break label281;
		// localInputStream = ((Resources)localObject1).openRawResource(i2);
		// if (localInputStream == null)
		// break label281;
		// localObject2 = new FileOutputStream((File)localObject2);
		// localObject3 = new byte[2048];
		// if (localInputStream.read(localObject3) <= 0)
		// break label271;
		// ((FileOutputStream)localObject2).write(localObject3);
		// continue;
		// }
		// catch (Exception localException2)
		// {
		// Ln.e(localException2);
		// }
		// }
		// }
		// catch (Exception localException1)
		// {
		// Ln.e(localException1);
		// }
		// return;
		// label271: localException2.close();
		// localInputStream.close();
		// label281: i1++;
		//
	}

	private void aa() {
		int i1;


		DirectorRoom localDirectorRoom = (DirectorRoom) m().s();
		localDirectorRoom.i(true);
		DirectorBroadcastCollection localDirectorBroadcastCollection = (DirectorBroadcastCollection) localDirectorRoom
				.ax();
		localDirectorBroadcastCollection.a();
		int j = localDirectorBroadcastCollection.e();
		Resources localResources = this._applicationContext.getResources();
		i1 = 0;
		try {
			if (i1 < j) {
				DirectorBroadcast localObject2 = (DirectorBroadcast) localDirectorBroadcastCollection
						.a(i1);
				String str = ((DirectorBroadcast) localObject2).E_();
				if ((str != null) && (str.length() != 0)) {
					String[] str1 = str.split("/");
					if (str1.length > 1) {
						str = str1[(-1 + str1.length)];
						File file = new File(localObject2.av());
						if (file.exists()) {
							File pfile = file.getParentFile();
							if (pfile != null)
								pfile.mkdirs();

							int i2 = localResources.getIdentifier("station_"
									+ str.replace("-", "_"), "raw",
									this._applicationContext.getPackageName());
							if (i2 != 0) {
								InputStream localInputStream = localResources
										.openRawResource(i2);
								if (localInputStream != null) {
									FileOutputStream fileOutputStream = new FileOutputStream(
											pfile);
									byte[] buffer = new byte[2048];
									if (localInputStream.read(buffer) > 0)
										fileOutputStream.write(buffer);
								}
							}
						}
					}
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	private void ab() {
		// while (true)
		// {
		// int j;
		// Object localObject2;
		// try
		// {
		// DirectorAudioLibrary localDirectorAudioLibrary =
		// (DirectorAudioLibrary)m().s().at();
		// localDirectorAudioLibrary.c();
		// int i1 = localDirectorAudioLibrary.n();
		// Resources localResources = this._applicationContext.getResources();
		// j = 0;
		// if (j < i1)
		// {
		// localObject2 = (DirectorAlbum)localDirectorAudioLibrary.c(j);
		// String str = ((DirectorAlbum)localObject2).E_();
		// if ((str == null) || (str.length() == 0))
		// break label277;
		// Object localObject1 = str.split("/");
		// if (localObject1.length <= 1)
		// continue;
		// str = localObject1[(-1 + localObject1.length)];
		// localObject1 = new File(((DirectorAlbum)localObject2).av());
		// if (((File)localObject1).exists())
		// break label277;
		// localObject2 = ((File)localObject1).getParentFile();
		// if (localObject2 == null)
		// continue;
		// ((File)localObject2).mkdirs();
		// try
		// {
		// int i2 = localResources.getIdentifier("album_" + str.replace("-",
		// "_"), "raw", this._applicationContext.getPackageName());
		// if (i2 == 0)
		// break label277;
		// InputStream localInputStream = localResources.openRawResource(i2);
		// if (localInputStream == null)
		// break label277;
		// localObject2 = new FileOutputStream((File)localObject1);
		// localObject1 = new byte[2048];
		// if (localInputStream.read(localObject1) <= 0)
		// break label267;
		// ((FileOutputStream)localObject2).write(localObject1);
		// continue;
		// }
		// catch (Exception localException2)
		// {
		// Ln.e(localException2);
		// }
		// }
		// }
		// catch (Exception localException1)
		// {
		// Ln.e(localException1);
		// }
		// return;
		// label267: ((FileOutputStream)localObject2).close();
		// localException2.close();
		// label277: j++;
		// }
	}

	private void ac() {
		// if (this.U == null);
		// while (true)
		// {
		// return;
		// Vector localVector = this.U;
		// monitorenter;
		// int j = 0;
		// try
		// {
		// while (true)
		// {
		// int i1 = this.U.size();
		// if (j < i1)
		// try
		// {
		// ((Director.DirectorListener)this.U.get(j)).j();
		// j++;
		// }
		// catch (Exception localException)
		// {
		// while (true)
		// Ln.e(localException, "event handler failed", new Object[0]);
		// }
		// }
		// }
		// finally
		// {
		// monitorexit;
		// }
		// monitorexit;
		// }
	}

	private void f(boolean paramBoolean) {
		this.D = paramBoolean;
	}

	// ERROR //
	private void g(boolean paramBoolean) {

	}

	private void h(String paramString) {
		// if (this.ah != null)
		// this.ah.a(paramString);
		// if (this.U == null);
		// while (true)
		// {
		// return;
		// Vector localVector = this.U;
		// monitorenter;
		// int j = 0;
		// try
		// {
		// while (true)
		// {
		// int i1 = this.U.size();
		// if (j < i1)
		// try
		// {
		// ((Director.DirectorListener)this.U.get(j)).a(paramString);
		// j++;
		// }
		// catch (Exception localException)
		// {
		// while (true)
		// Ln.e(localException, "event handler failed", new Object[0]);
		// }
		// }
		// }
		// finally
		// {
		// monitorexit;
		// }
		// monitorexit;
		// }
	}

	private void h(boolean paramBoolean) {
		// if (this.U == null);
		// while (true)
		// {
		// return;
		// Vector localVector = this.U;
		// monitorenter;
		// int j = 0;
		// try
		// {
		// while (j < this.U.size())
		// {
		// ((Director.DirectorListener)this.U.get(j)).a(paramBoolean);
		// j++;
		// }
		// monitorexit;
		// continue;
		// }
		// finally
		// {
		// localObject = finally;
		// monitorexit;
		// }
		// }
		// throw localObject;
	}

	public Director.OnProgressUpdateListener A() {
		return this.V;
	}

	public boolean B() {
		boolean bool = false;
		// if (this.y)
		// bool = a((Command)CommandFactory.GetNetworkBindingsProvider.a());
		// else
		// bool = false;
		return bool;
	}

	public boolean C() {
		boolean bool = false;
		// if (this.y)
		// bool = a((Command)CommandFactory.GetCommonNameProvider.a());
		// else
		// bool = false;
		return bool;
	}

	public boolean D() {
		boolean bool1 = false;
		// label96: boolean bool3;
		// try
		// {
		// if (this.A)
		// {
		// bool1 = this.z;
		// }
		// else if ((this.t != null) && (this.t.length() != 0))
		// {
		// this.z = false;
		// Object localObject = this.t.split("\\.");
		// if (localObject.length > 0)
		// {
		// localObject = localObject[0];
		// if ((localObject != null) && (((String)localObject).length() > 0))
		// {
		// if (Integer.parseInt((String)localObject) < 2)
		// break label96;
		// this.z = true;
		// }
		// }
		// for (this.A = true; ; this.A = true)
		// {
		// boolean bool2 = this.z;
		// break;
		// this.z = false;
		// }
		// }
		// }
		// catch (Exception bool3)
		// {
		// Ln.e(localException);
		// bool3 = this.z;
		// }
		return bool1;
	}

	public void E() {
		// if (this.aa.b())
		// {
		// Ln.a("Rhapsody already connected", new Object[0]);
		// this.aa.c();
		// }
		// if (this.g != null)
		// Ln.a("Rhapsody already reconnecting", new Object[0]);
		// while (true)
		// {
		// return;
		// try
		// {
		// b(this.R);
		// }
		// catch (InterruptedException localInterruptedException)
		// {
		// Ln.b("Rhapsody reconnect interrupted", new Object[0]);
		// }
		// }
	}

	public boolean F() {
		boolean j = false;
		if ((!this.ag) && (!isDemo()))
			j = false;
		else
			j = true;
		return j;
	}

	public boolean isDemo() {
		return this.isDemo;
	}

	public FileService H() {
		// if (this.X == null)
		// this.X = ((FileService)this._fileServiceProvider.a());
		return this.X;
	}

	public String I() {
		Object localObject = null;
		// try
		// {
		// String str = "media";
		// if (d() != null)
		// {
		// double d1 = c();
		// if (d1 <= 1.9D)
		// break label89;
		// str = "";
		// }
		// while (true)
		// {
		// StringBuilder localStringBuilder = new StringBuilder("http://");
		// localStringBuilder.append(k());
		// if ((str != null) && (str.length() > 0))
		// {
		// localStringBuilder.append("/");
		// localStringBuilder.append(str);
		// }
		// localStringBuilder.append("/images/");
		// str = localStringBuilder.toString();
		// break;
		// if (localStringBuilder <= 1.79D)
		// continue;
		// str = "packages/media";
		// }
		// }
		// catch (Exception localObject)
		// {
		// Ln.e(localException);
		// localObject = null;
		// }
		return null;
	}

	public Control4Rhapsody K() {
		return this.aa;
	}

	public String L() {
		return this.W;
	}

	public boolean M() {
		return this.y;
	}

	public void N() {
		// try
		// {
		// Object localObject = P();
		// Ln.a("Device Identified.  Controller: " + (String)localObject, new
		// Object[0]);
		// if ((localObject == null) || (((String)localObject).length() <= 0))
		// {
		// localObject =
		// (GetCommonNameCommand)CommandFactory.GetCommonNameProvider.a();
		// ((GetCommonNameCommand)localObject).a(new Control4Director.7(this));
		// a((Command)localObject);
		// }
		// else
		// {
		// O();
		// }
		// }
		// catch (Exception localException)
		// {
		// Ln.e(localException);
		// }
	}

	public void O() {
		// try
		// {
		// Object localObject2 = new
		// StringBuilder("<soap:Envelope xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:v1=\"https://services.control4.com/Security/v1_0/\">");
		// ((StringBuilder)localObject2).append("<soap:Header/>");
		// ((StringBuilder)localObject2).append("<soap:Body>");
		// ((StringBuilder)localObject2).append("<v1:MyHomeAndroidCheckin>");
		// ((StringBuilder)localObject2).append("<v1:deviceUdid>");
		// ((StringBuilder)localObject2).append(Installation.a(this._applicationContext));
		// ((StringBuilder)localObject2).append("</v1:deviceUdid>");
		// ((StringBuilder)localObject2).append("<v1:controllerCommonName>");
		// ((StringBuilder)localObject2).append(P());
		// ((StringBuilder)localObject2).append("</v1:controllerCommonName>");
		// ((StringBuilder)localObject2).append("</v1:MyHomeAndroidCheckin>");
		// ((StringBuilder)localObject2).append("</soap:Body>");
		// ((StringBuilder)localObject2).append("</soap:Envelope>");
		// Ln.a("Attempting call to https://services.control4.com/Security/v1_0/Reporting.asmx?wsdl.  Body: "
		// + ((StringBuilder)localObject2).toString(), new Object[0]);
		// HttpPost localHttpPost = new
		// HttpPost("https://services.control4.com/Security/v1_0/Reporting.asmx?wsdl");
		// localObject2 = new
		// StringEntity(((StringBuilder)localObject2).toString(), "UTF-16");
		// ((StringEntity)localObject2).setContentType("text/xml");
		// localHttpPost.setHeader("Content-Type", "text/xml;charset=UTF-16");
		// localHttpPost.setHeader("SOAPAction",
		// "https://services.control4.com/Security/v1_0/MyHomeAndroidCheckin");
		// localHttpPost.setEntity((HttpEntity)localObject2);
		// localObject2 = (BasicHttpResponse)new
		// DefaultHttpClient().execute(localHttpPost);
		// int j =
		// ((BasicHttpResponse)localObject2).getStatusLine().getStatusCode();
		// Ln.a("Status of call to Reporting.asmx.  Status: " +
		// Integer.toString(j), new Object[0]);
		// Object localObject1 = ((BasicHttpResponse)localObject2).getEntity();
		// if (localObject1 != null)
		// {
		// localObject2 = ((HttpEntity)localObject1).getContent();
		// localObject1 = XmlPullParserFactory.newInstance().newPullParser();
		// ((XmlPullParser)localObject1).setInput((InputStream)localObject2,
		// null);
		// localObject2 = new Control4LicensingResponseParser();
		// ((Control4LicensingResponseParser)localObject2).a(this);
		// ((Control4LicensingResponseParser)localObject2).a((XmlPullParser)localObject1);
		// int i1 = ((Control4LicensingResponseParser)localObject2).b();
		// Ln.a("Result of call to Reporting.asmx.  Result: " +
		// Integer.toString(i1), new Object[0]);
		// if (i1 != 0)
		// {
		// this.ag = false;
		// h(((Control4LicensingResponseParser)localObject2).d());
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
	}

	public String P() {
		return this.ai;
	}

	public void a(double paramDouble) {
		this.x = paramDouble;
	}

	public void a(DisplayMetrics paramDisplayMetrics) {
		this.Z = paramDisplayMetrics;
	}

	public void a(Director.DirectorListener paramDirectorListener) {
		if (this.U == null)
			this.U = new Vector();
		synchronized (this.U) {
			if (!this.U.contains(paramDirectorListener))
				this.U.add(paramDirectorListener);
			return;
		}
	}

	public void a(
			Director.OnProgressUpdateListener paramOnProgressUpdateListener) {
		this.V = paramOnProgressUpdateListener;
	}

	public void a(DirectorProject paramDirectorProject) {
		this.project = paramDirectorProject;
	}

	public void a(Runnable paramRunnable) {
		this.ad.removeCallbacks(paramRunnable);
	}

	public void a(Runnable paramRunnable, long paramLong) {
		this.ad.postDelayed(paramRunnable, paramLong);
	}

	public void a(String paramString) {
		this.t = paramString;
		if (paramString != null)
			;
		try {
			String[] arrayOfString = this.t.split("\\.");
			if (arrayOfString.length > 0) {
				String str2 = arrayOfString[0];
				String str1 = "";
				if (arrayOfString.length > 1)
					str1 = arrayOfString[1];
				a(Double.parseDouble(str2 + "." + str1));
			}
			return;
		} catch (Exception localException) {
			while (true)
				Ln.e(localException);
		}
	}

	public void a(boolean paramBoolean) {
		this.ab = paramBoolean;
	}

	public boolean a() {
		return this.ac;
	}

	public boolean a(
			Director.OnIdentifyDeviceStatusListener paramOnIdentifyDeviceStatusListener) {
		boolean bool = false;
		// if (this.y)
		// {
		// IdentifyDeviceCommand localIdentifyDeviceCommand =
		// (IdentifyDeviceCommand)CommandFactory.IdentifyDeviceProvider.a();
		// localIdentifyDeviceCommand.a(Installation.a(this._applicationContext));
		// if (paramOnIdentifyDeviceStatusListener != null)
		// localIdentifyDeviceCommand.a("listener",
		// paramOnIdentifyDeviceStatusListener);
		// bool = a(localIdentifyDeviceCommand);
		// }
		// else
		// {
		// bool = false;
		// }
		return bool;
	}

	public boolean a(
			Director.OnVersionInfoUpdateListener paramOnVersionInfoUpdateListener) {
		boolean bool = false;
		// if (this.y)
		// {
		// Command localCommand =
		// (Command)CommandFactory.GetVersionInfoProvider.a();
		// if (paramOnVersionInfoUpdateListener != null)
		// localCommand.a("listener", paramOnVersionInfoUpdateListener);
		// bool = a(localCommand);
		// }
		// else
		// {
		// bool = false;
		// }
		return bool;
	}

	// ERROR //
	public boolean a(DirectorConnection directorconnection) {
		// if(y) return false;
		// Object obj;
		// Ln.e("Not connecting to disabled director.", new Object[0]);
		// obj = 0;
		// return false;;
		// if(directorconnection == null)
		// {
		// obj = 0;
		// continue; /* Loop/switch isn't completed */
		// }
		// ac = true;
		// N = -1L;
		// d(false);
		// // Ln.b((new
		// StringBuilder()).append("Beginning connect1ng to ").append(directorconnection).toString(),
		// new Object[0]);
		// // this;
		// Object obj1;
		// // Ln.b("Inside synchronized connection", new Object[0]);
		// if(S)
		// x();
		// a(true);
		// obj1 = directorconnection.a();
		// obj = directorconnection.b();
		// // Ln.b("Prepar1ng to open socket", new Object[0]);
		// int j1 = 1500;
		// int i1 = 0;
		// if(i1 >= 5)
		// break MISSING_BLOCK_LABEL_319;
		// F = new Socket();
		// F.setKeepAlive(true);
		// F.connect(new InetSocketAddress(((String) (obj1)), ((int) (obj))),
		// j1);
		// if(!Thread.interrupted())
		// break MISSING_BLOCK_LABEL_309;
		// // Ln.b("Director socket connection interrupted. Cancelling.", new
		// Object[0]);
		// obj = F.isConnected();
		//
		//
		// try
		// {
		// F.close();
		// }
		// catch(IOException _ex) { }
		// F = null;
		// throw new InterruptedException();
		//
		//
		// ac = false;
		//
		// if(!F.isConnected())
		// //break MISSING_BLOCK_LABEL_352;
		// if(F.isConnected())
		// //break MISSING_BLOCK_LABEL_408;
		//
		// ac = false;
		// obj = 0;
		// // Ln.b((new StringBuilder()).append("Connection attempt ").append(i1
		// +
		// 1).append(" failed. Unable to connect to: ").append(directorconnection).toString(),
		// new Object[0]);
		// i1++;
		// j1 += 1500;
		// // goto _L5
		// // Ln.b((new
		// StringBuilder()).append("Socket connection completed. Interrupted: ").append(Thread.interrupted()).toString(),
		// new Object[0]);
		// obj2 = new ProjectDatabaseHelper(_applicationContext, (new
		// StringBuilder()).append(((String) (obj1))).append("_").append(((int)
		// (obj))).toString());
		// obj = new MediaDatabaseHelper(_applicationContext, (new
		// StringBuilder()).append(((String) (obj1))).append("_").append(((int)
		// (obj))).toString());
		R = directorconnection;
		// R.a(true);
		// E.a(directorconnection);
		// K = ((ProjectDatabaseHelper) (obj2)).getWritableDatabase();
		// if(K == null)
		// throw new
		// RuntimeException("Could not get a writeable director database.");
		//
		// Ln.e(((Throwable) (obj)), "Database file wasn't found", new
		// Object[0]);
		//
		// ac = false;
		// obj = 0;
		//
		// Ln.e(((Throwable) (obj)), "Failed to open database", new Object[0]);
		//
		// ac = false;
		// obj = 0;
		//
		// Ln.e(((Throwable) (obj)), "Media Database file wasn't found", new
		// Object[0]);
		//
		// ac = false;
		// obj = 0;
		//
		// Ln.e(((Throwable) (obj)), "Failed to open media database", new
		// Object[0]);
		//
		// ac = false;
		// obj = 0;
		// continue; /* Loop/switch isn't completed */
		// L = ((MediaDatabaseHelper) (obj)).getWritableDatabase();
		// if(L == null)
		// throw new
		// RuntimeException("Could not get a writeable media database.");
		// T = (DirectorProject)_projectProvider.get();
		// M = Executors.newFixedThreadPool(4);
		// G.start();
		// // H = new Thread(new SendRunnable(null), "Director-Send");
		// H.start();
		// A = false;
		// if(_zoneManager != null)
		// _zoneManager.a(false);
		// w();
		// a((Command)CommandFactory.EnableEventsProvider.a());
		// a((Command)CommandFactory.UnregisterEventListenerProvider.a());
		// T.c(K);
		// C();
		// B();
		// a(af);
		// aa = (Control4Rhapsody)_rhapsodyProvider.a();
		// aa.a(aj);
		// T.a(aa);
		// b(directorconnection);
		// if(!Thread.interrupted())
		//
		// g(false);
		//
		// ac = false;
		// obj = 0;
		//
		// g(false);
		//
		// S = true;
		// if(U == null) goto _L7; else goto _L6
		// obj = U;
		//
		// obj1 = U.iterator();
		//
		// obj2 = (Director.DirectorListener)((Iterator) (obj1)).next();
		// try
		// {
		// ((Director.DirectorListener) (obj2)).b();
		// }
		// catch(Exception exception1)
		// {
		// Ln.e(exception1,
		// "Exception occurred calling director listener onConnected", new
		// Object[0]);
		// }
		// ac = false;
		return true;

	}

	public boolean a(Command.NotificationListener paramNotificationListener) {
		boolean j = false;
		if (!this.y)
			j = false;
		if ((!F()) || (!r()) || (n())) {
			return false;
		}
		try {
			Object localObject1 = (EnableEventsCommand) CommandFactory.EnableEventsProvider
					.get();
			((EnableEventsCommand) localObject1).d(false);
			a((Command) localObject1);
			a((Command) CommandFactory.UnregisterEventListenerProvider.get());
			y();
			if (this.project != null) {
				this.project.j();
			}
			f(true);
			localObject1 = (GetItemsCommand) CommandFactory.GetItemsProvider
					.get();
			((GetItemsCommand) localObject1).a(8);
			((GetItemsCommand) localObject1).f(false);
			((GetItemsCommand) localObject1).d(false);
			((GetItemsCommand) localObject1).e(true);

			Object localObject2 = new Timer();
			// Control4Director.4 local4 = new Control4Director.4(this);
			// ((GetItemsCommand)localObject1).a(new Control4Director.5(this,
			// local4, (Timer)localObject2));
			// ((Timer)localObject2).schedule(local4, 25000L);
			boolean bool = a((Command) localObject1);
			if (!bool) {
				f(false);

			}
			localObject2 = (GetItemsCommand) CommandFactory.GetItemsProvider
					.get();
			((GetItemsCommand) localObject2).f(true);
			((GetItemsCommand) localObject2).d(false);
			bool &= a((Command) localObject2);
			if (!bool) {
				f(false);

			}
			localObject2 = (GetItemsCommand) CommandFactory.GetItemsProvider
					.get();
			((GetItemsCommand) localObject2).a(166);
			((GetItemsCommand) localObject2).f(false);
			((GetItemsCommand) localObject2).d(false);
			((GetItemsCommand) localObject2).g(true);
			bool &= a((Command) localObject2);
			if (!bool) {
				f(false);

			}

			localObject2 = (GetItemsCommand) CommandFactory.GetItemsProvider
					.get();
			((GetItemsCommand) localObject2).f(false);
			((GetItemsCommand) localObject2).d(true);
			((GetItemsCommand) localObject2).a(1);
			((GetItemsCommand) localObject2).a(paramNotificationListener);
			bool &= a((Command) localObject2);
			if (bool)
				f(false);
		} catch (Exception i1) {

		}

		return j;
	}

	public boolean a(Command paramCommand) {
		boolean j = false;
		try {
			if (this.y) {
				if (!r())
					Ln.e("** Director unable to send command: " + paramCommand
							+ ".  Not connected.", new Object[0]);
				boolean bool = this.Q.a(paramCommand);
				j = bool;
			}
		} catch (Exception localException) {
			Ln.e(localException);
		}
		return false;
	}

	public void b(Director.DirectorListener paramDirectorListener) {
		if (this.U != null)
			synchronized (this.U) {
				this.U.remove(paramDirectorListener);
			}
	}

	public void b(DirectorConnection paramDirectorConnection) {
		// if ((this.y) && (paramDirectorConnection != null))
		// {
		// RhapsodyConnection localRhapsodyConnection = new
		// RhapsodyConnection();
		// localRhapsodyConnection.a(paramDirectorConnection.a());
		// this.aa.a(localRhapsodyConnection);
		// }
	}

	public void b(Runnable paramRunnable) {
		if (this.M != null)
			this.M.execute(paramRunnable);
	}

	public void b(String paramString) {
		this.u = paramString;
	}

	public void b(boolean paramBoolean) {
		this.B = paramBoolean;
	}

	public boolean b() {
		return this.ab;
	}

	public double c() {
		return this.x;
	}

	public void c(DirectorConnection paramDirectorConnection) {
		ProjectDatabaseHelper
				.a(this._applicationContext, paramDirectorConnection.a() + "_"
						+ paramDirectorConnection.b());
		// MediaDatabaseHelper.a(this._applicationContext,
		// paramDirectorConnection.a() + "_" + paramDirectorConnection.b());
	}

	public void c(String paramString) {
		this.v = paramString;
	}

	public void c(boolean paramBoolean) {
		this.C = paramBoolean;
	}

	public String d() {
		return this.t;
	}

	public void d(String paramString) {
		this.w = paramString;
	}

	// ERROR //
	public void d(boolean paramBoolean) {
		Object obj;
		ProjectDatabaseHelper obj1;
		obj = null;
		// obj1 = Y;
		isDemo = paramBoolean;
		E.a(isDemo);
		if (!isDemo)
			return;
		if (r())
			x();
		obj1 = new ProjectDatabaseHelper(_applicationContext, "DEMO");
		obj = new MediaDatabaseHelper(_applicationContext, "DEMO");

		R = null;
		if (_zoneManager != null)
			_zoneManager.j();

		K = obj1.getWritableDatabase();
		if (K == null) {
			throw new RuntimeException(
					"Could not get a writeable demo director database.");
		}

		// Ln.e(((Throwable) (obj1)), "Database file wasn't found", new
		// Object[0]);
		// Ln.e(((Throwable) (obj1)), "Failed to open database", new Object[0]);
		// Ln.e(((Throwable) (obj2)), "Media Database file wasn't found", new
		// Object[0]);
		// Ln.e(((Throwable) (obj2)), "Failed to open media database", new
		// Object[0]);

		L = ((MediaDatabaseHelper) (obj)).getWritableDatabase();
		if (L == null)
			throw new RuntimeException(
					"Could not get a writeable demo media database.");

		project = (DirectorProject) _projectProvider.get();
		M = Executors.newFixedThreadPool(4);
		A = true;
		z = true;
		S = true;
		a("2.0");
		b("Demo");
		project.c(K);
		// if(U == null) goto _L5; else goto _L4
		// for(obj1 = U.iterator(); ((Iterator) (obj1)).hasNext();
		// ((Director.DirectorListener)((Iterator) (obj1)).next()).b());

		Y();
		v();
		g(false);

	}

	public DisplayMetrics e() {
		return this.Z;
	}

	public void e(String paramString) {

		// try
		// {
		// if (this.V != null)
		// this.V.a(paramString);
		// return;
		// }
		// catch (Exception localException)
		// {
		// }
	}

	public void e(boolean paramBoolean) {

	}

	public String f() {
		return this.u;
	}

	public void f(String paramString) {
		this.W = paramString;
	}

	public String g() {
		return this.v;
	}

	public void g(String paramString) {
		this.ai = paramString;
	}

	public String h() {
		return this.w;
	}

	public boolean i() {
		return this.B;
	}

	public boolean j() {
		return this.C;
	}

	public String k() {
		String str;
		if (this.R == null) {
			str = null;
		} else {
			str = this.R.a();
			if ((str != null) && (str.length() > 0))
				str = str.trim();
		}
		return str;
	}

	public int l() {
		int j;
		if (this.R == null)
			j = -1;
		else
			j = this.R.b();
		return j;
	}

	public DirectorProject m() {
		DirectorProject localDirectorProject;
		if (this.y) {
			// y();
			localDirectorProject = this.project;
		} else
			localDirectorProject = null;
		return localDirectorProject;
	}

	public boolean n() {
		return this.D;
	}

	public void o() {
		// this.T.c(this.K);
		// Ln.b("Beginning upload of device data", new Object[0]);
		// v();
		// a((Command)CommandFactory.EnableEventsProvider.a());
		// this.D = false;
		// z();
		// if (this.U != null)
		// {
		// synchronized (this.U)
		// {
		// Iterator localIterator = new Vector(this.U).iterator();
		// while (true)
		// if (localIterator.hasNext())
		// {
		// Director.DirectorListener localDirectorListener =
		// (Director.DirectorListener)localIterator.next();
		// try
		// {
		// localDirectorListener.a();
		// }
		// catch (Exception localException)
		// {
		// Ln.e(localException,
		// "Exception occurred calling director listener onItemsRetrieved", new
		// Object[0]);
		// }
		// }
		// }
		// monitorexit;
		// }
	}

	public SQLiteDatabase p() {
		SQLiteDatabase localSQLiteDatabase;
		if (this.y) {
			if ((this.K == null) || (!this.K.isOpen())) {
				Ln.e("Project Database is null or not open.  Creating a new one.",
						new Object[0]);
				createDatabase();
			}
			localSQLiteDatabase = this.K;
		} else {
			localSQLiteDatabase = null;
		}
		return localSQLiteDatabase;
	}

	public SQLiteDatabase q() {
		SQLiteDatabase localSQLiteDatabase;
		if (this.y) {
			if ((this.L == null) || (!this.L.isOpen())) {
				Ln.e("Media Database is null or not open.  Creating a new one.",
						new Object[0]);
				S();
			}
			localSQLiteDatabase = this.L;
		} else {
			localSQLiteDatabase = null;
		}
		return localSQLiteDatabase;
	}

	public boolean r() {
		boolean bool;
		if (this.F != null)
			bool = this.F.isConnected();
		else
			bool = this.S;
		return bool;
	}

	public DirectorConnection s() {
		return this.R;
	}

	public boolean t() {
		// int i2 = 1;
		// int j = 0;
		// Exception localException1;
		// try
		// {
		// if ((this.E.e()) && (M()))
		// e(false);
		// if (M())
		// if ((!i) && (this.E == null))
		// throw new AssertionError();
		// }
		// catch (Exception localException2)
		// {
		// Ln.e(localException2);
		// break label116;
		// if (this.E != null)
		// if (this.E.c())
		// {
		// int i1 = localException2;
		// }
		// else
		// {
		// DirectorConnection localDirectorConnection = this.E.b();
		// if (localDirectorConnection != null);
		// while (true)
		// {
		// localException1 = localException2;
		// break;
		// localException2 = localException1;
		// }
		// }
		// }
		// label116: return localException1;
		return false;
	}

	public boolean u() {
		boolean bool = false;
		// if ((this.E.e()) && (M()))
		// e(bool);
		// if (M())
		// {
		// if ((!i) && (this.E == null))
		// break label91;
		// if (this.E != null)
		// if (!this.E.c())
		// {
		// bool = a(this.E.b());
		// }
		// else
		// {
		// d(true);
		// bool = true;
		// }
		// }
		return bool;
	}

	public void v() {
		this.h = new Thread(this.ae, "UploadDeviceData");
		this.h.start();
	}

	public void w() {
		AuthenticateDeviceCommand localAuthenticateDeviceCommand = (AuthenticateDeviceCommand) CommandFactory.AuthenticateDeviceProvider
				.get();
		localAuthenticateDeviceCommand.a("listener", this.ah);
		localAuthenticateDeviceCommand.a(Installation
				.a(this._applicationContext));
		a(localAuthenticateDeviceCommand);
	}

	public void x() {
		this.ab = false;
		if (this.S)
			g(false);
	}

	public void y() {
		try {
			if ((this.S) && (!ProjectDatabaseHelper.a())) {
				if (this.project == null)
					this.project = ((DirectorProject) this._projectProvider
							.get());

				this.project.a(this.K);

				this.project.b(this.L);

			}
		} catch (Exception localException) {
			Ln.e(localException);
		}
	}

	public void z() {
		try {
			if (this._zoneManager != null)
				this._zoneManager.a(false);
			if (this.V != null)
				this.V.a();
		} catch (Exception localException) {
			Ln.e(localException,
					"Exception calling progress update listener onProgressCompleted",
					new Object[0]);
		}
	}

	@Override
	public Rhapsody Q() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean G() {
		return Y;
	}

	@Override
	public ZoneManager J() {
		return this._zoneManager;
	}
}
