package com.zd.home.ui;

import roboguice.inject.InjectView;
import roboguice.util.Ln;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.text.TextUtils;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.google.inject.Inject;
import com.google.inject.internal.Nullable;
import com.zd.home.R;
import com.zd.home.widget.RoomPicker;
import com.zd.model.Director;
import com.zd.model.Director.DirectorListener;
import com.zd.model.Navigator;
import com.zd.model.Project;
import com.zd.model.Room;
import com.zd.model.device.Device;
import com.zd.model.rhapsody.Rhapsody;
import com.zd.model.rhapsody.Rhapsody.RhapsodyListener;
import com.zd.model.rhapsody.RhapsodyUser;

public abstract class NavigationActivity extends HomeControlActivity {
	private static final int A = 600;
	private static KeyguardManager.KeyguardLock B;
	private static final int a = 1000;
	private static final int b = 1002;
	private static final int c = 1006;
	private static final int d = 1007;
	private static final String e = "volumeVisibility";
	private static final String f = "mediaVisibility";
	protected static final int g = 1003;
	protected static final int h = 1004;
	protected static final int i = 1005;
	public static final int j = -1;
	static final boolean x;
	//
	@InjectView(R.id.nav_toolbar)
	private View C;

	@InjectView(R.id.room_button)
	private View D;
	//
	@InjectView(R.id.volume_toolbar)
	private View E;
	//
	@InjectView(R.id.volume)
	private TextView F;
	//
	@InjectView(R.id.mute)
	private ImageView G;
	//
	@InjectView(R.id.volume_up)
	private View H;
	//
	@InjectView(R.id.volume_down)
	private View J;
	//
	@InjectView(R.id.power)
	private View K;

	@InjectView(R.id.close)
	private View L;
	//
	// @Nullable
	// @InjectView(R.id.volume_seekbar)
	private SeekBar M;
	//
	@InjectView(R.id.zones_toolbar)
	private View N;
	//
	@InjectView(R.id.media_toolbar)
	private View O;
	//
	@InjectView(R.id.cover)
	private ImageView P;
	//
	@InjectView(R.id.song)
	private TextView Q;
	//
	@InjectView(R.id.artist)
	private TextView R1;
	//
	@InjectView(R.id.device_name)
	private TextView S;
	//
	@InjectView(R.id.play)
	private ImageView T;
	//
	@InjectView(R.id.skip_back)
	private View U;
	//
	// @InjectView(2131558633)
	private View V;
	//
	// @Nullable
	// @InjectView(2131558805)
	private ImageView W;
	//
	// @Nullable
	// @InjectView(2131558801)
	private View X;
	//
	// @Nullable
	// @InjectView(2131558799)
	private View Y;
	//
	// @Nullable
	// @InjectView(2131558800)
	private AutoResizeTextView Z;
	//
	// @g
	// protected MyHomeApplication _application;
	//
	@Inject
	protected Director _director;
	//
	@Inject
	private KeyguardManager _keyguardManager;
	//
	@Inject
	protected LayoutInflater _layoutInflater;
	//
	@Inject
	protected Navigator _navigator;
	//
	@Inject
	private NotificationManager _notificationManager;

	// @InjectView(R.id.media_power)
	 private ImageView aa;
	//
	// @Nullable
	// @InjectView(2131558672)
	private View ab;
	private RoomPickerWindow ac;
	private RoomPicker ad;
	private RelativeLayout ae;
	private View af;
	// private final Handler ag = new Handler();
	private String ah;
	private String ai;
	private boolean aj = false;
	private boolean ak = false;
	private WelcomeWindow al = null;
	private boolean am = true;
	private boolean an = false;
	private final View.OnTouchListener ao = new View.OnTouchListener() {

		@Override
		public boolean onTouch(View v, MotionEvent event) {
			// TODO Auto-generated method stub
			return false;
		}
	};// NavigationActivity.25.25(this);
	private final SeekBar.OnSeekBarChangeListener ap = new SeekBar.OnSeekBarChangeListener() {

		public void onProgressChanged(SeekBar seekbar, int i1, boolean flag) {
			// if(flag && !b)
			// {
			// b = true;
			// c.postDelayed(d, 250L);
			// }
		}

		public void onStartTrackingTouch(SeekBar seekbar) {
		}

		public void onStopTrackingTouch(SeekBar seekbar) {
			// c.removeCallbacks(d);
			// croom.x(NavigationActivity.h(NavigationActivity.this).getProgress());
		}
	};// NavigationActivity.26.26(this);

	static void b(NavigationActivity navigationactivity, boolean flag) {
		navigationactivity.b(flag);
	}

	static SeekBar h(NavigationActivity navigationactivity) {
		return navigationactivity.M;
	}

	private final Navigator.NavigatorListener aq = new Navigator.NavigatorListener() {

		@Override
		public boolean b(int paramInt, String paramString) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public void b() {
			// TODO Auto-generated method stub

		}

		@Override
		public void a(boolean paramBoolean) {
			// TODO Auto-generated method stub

		}

		@Override
		public void a(Room paramRoom1, final Room paramRoom2) {

			runOnUiThread(new Runnable() {
				public void run() {
					NavigationActivity.this.a(paramRoom2);
				}
			});
		}

		@Override
		public void a(int paramInt, String paramString) {
			// TODO Auto-generated method stub

		}

		@Override
		public void a() {
			// TODO Auto-generated method stub

		}
	};
	// NavigationActivity.28(this);
	private final Director.DirectorListener ar = new DirectorListener() {

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
	// NavigationActivity.29(this);
	private BroadcastReceiver as = new BroadcastReceiver() {

		@Override
		public void onReceive(Context context, Intent intent) {
			// TODO Auto-generated method stub

		}
	};
	//
	@Nullable
	@InjectView(R.id.nav_home)
	protected View k;
	@Nullable
	@InjectView(R.id.nav_back)
	protected View l;
	@Nullable
	@InjectView(R.id.demo)
	protected TextView m;

	@InjectView(R.id.room_text)
	protected TextView n;
	@Nullable
	@InjectView(R.id.nav_lights)
	protected View o;
	@Nullable
	@InjectView(R.id.nav_volume)
	protected View p;
	@Nullable
	@InjectView(R.id.nav_zones)
	protected View q;
	protected Room croom;
	protected boolean s = true;
	protected boolean t;
	protected Intent u;
	protected boolean v;
	protected final Room.OnRoomUpdateListener w = new Room.OnRoomUpdateListener() {
	};

	static RoomPicker b(NavigationActivity navigationactivity) {
		return navigationactivity.ad;
	}

	static void a(NavigationActivity navigationactivity, boolean flag) {
		navigationactivity.c(flag);
	}

	static {
		boolean bool;
		if (NavigationActivity.class.desiredAssertionStatus())
			bool = false;
		else
			bool = true;
		x = bool;
	}

	private void I() {
		this.O.setVisibility(8);
		this.q.setVisibility(0);
	}

	private void L() {
//		int i1 = 0;
//		
//		 Room.MediaInfo localMediaInfo;
//		 try
//		 {
//		 if (this.croom == null)
//		     return;
//		 localMediaInfo = this.croom.s();
//		 if (localMediaInfo == null)
//		 {
//			 this.P.setVisibility(4);
//		     this.Q.setText("");
//		     this.R1.setText("");
//		     return ;
//		 }
//		 Object localObject = localMediaInfo.e();
//		 if (localObject != null)
//		 {
//		 this.P.setImageBitmap((Bitmap)localObject);
//		 this.P.setVisibility(0);
//		 this.Q.setText(localMediaInfo.c());
//		 this.R1.setText(localMediaInfo.b());
//		 this.Q.setMaxLines(1);
//		 this.Q.setLines(1);
//		 this.Q.setEllipsize(TextUtils.TruncateAt.END);
//		 this.R1.setMaxLines(1);
//		 this.R1.setLines(1);
//		 this.R1.setEllipsize(TextUtils.TruncateAt.END);
//		 if (this.croom.af() != Room.PlayState.b)
//			 this.T.setImageResource(2130837903);
//		 else
//		    this.T.setImageResource(R.drawable.md_pause_button);
//		 this.S.setText("");
//		 if (this.ab == null)
//		 continue;
//		 localObject = this.ab;
//		 if (this.croom.ar() == null)
//		 break label356;
//		 ((View)localObject).setVisibility(i1);
//		 this.ab.setEnabled(true);
//		 if ((!this.t) || (getResources().getConfiguration().orientation !=
//		 1))
//		 break;
//		 if (this.ab == null)
//		 continue;
//		 this.ab.setVisibility(8);
//		 if (this.W == null)
//		 continue;
//		 this.W.setVisibility(8);
//		 if (this.aa == null)
//		 break;
//		 this.aa.setVisibility(8);
//		 }
//		 }
//		 catch (Exception localException)
//		 {
//		
//		 }
//		 this.P.setImageResource(2130837691);
//		 if (localMediaInfo.j())
//		 continue;
//		 localMediaInfo.a();
//		 continue;
//		 label356: int i2 = 4;

	}

	private void M() {
		if (this.N.getVisibility() == 0) {
			this.O.setVisibility(0);
			this.U.setVisibility(4);
			this.V.setVisibility(4);
			this.T.setVisibility(4);
			this.q.setVisibility(4);
			if (this.ab != null)
				this.ab.setVisibility(8);
			O();
		}
	}

	private void N() {
		this.O.setVisibility(8);
	}

	private void O() {
		try {
			if (this.croom == null)
				return;
			if (this.croom.ad())
				this.S.setText("");
		} catch (Exception localException) {
			Ln.e(localException);
		}
		this.Q.setText("");
		this.R1.setText("");
		this.croom.s();
		int i1 = this.croom.p();
		if (i1 > 0) {
			Device localDevice = this._navigator.getProject().b(i1, true,
					this._navigator.m());
			if (localDevice != null) {
				i1 = Navigator.a(localDevice.getType(), 5);
				this.P.setImageResource(i1);
				this.S.setText(localDevice.getName());
			} else {
				this.P.setImageResource(2130837767);
				this.S.setText("");

			}
		}
		if (this.ab != null) {
			this.ab.setVisibility(8);
		}
	}

	private void P() {
		this.ad = null;
		if (this.ad == null)
			l();
		if (this.ad != null)
			this.ac.show(this.D);
	}

	private void Q() {
		S();
		T();
		// Ln.b("Show reconnect dialog", new Object[0]);
		if (!this._director.r())
			showDialog(1006);
	}

	private void R() {
		try {
			removeDialog(1006);
			// Ln.b("Close reconnect dialog", new Object[0]);
		} catch (IllegalArgumentException localIllegalArgumentException) {

		}
	}

	private void S() {
		try {
			removeDialog(1002);
			// Ln.b("Close failed reconnect dialog", new Object[0]);
			// label18: return;
		} catch (IllegalArgumentException localIllegalArgumentException) {
		}
	}

	private void T() {
		try {
			removeDialog(1007);
			// Ln.b("Close rhapsody reconnect dialog", new Object[0]);
			// label18: return;
		} catch (IllegalArgumentException localIllegalArgumentException) {

		}
	}

	private void a(Uri paramUri) {
		// Ln.b("show activation screen", new Object[0]);
		Object localObject;
		if (this._navigator.H()) {
			localObject = new DisplayMetrics();
			getWindowManager().getDefaultDisplay().getMetrics(
					(DisplayMetrics) localObject);
			String str = J();
			this._navigator.a((DisplayMetrics) localObject, getResources()
					.getConfiguration(), str);
		}
		if ((0xF & getResources().getConfiguration().screenLayout) < 3) {
			// localObject = new Intent(this, ActivationActivity.class);
			// if (paramUri != null)
			// ((Intent)localObject).putExtra("com.control4.ui.ACTIVATION_CODE",
			// paramUri.getSchemeSpecificPart().replace("/", ""));
			// startActivity((Intent)localObject);
		} else {
			// this.ae.post(new NavigationActivity.11(this, paramUri));
		}
	}

	private void a(Bundle paramBundle) {
		int i1;
		if (paramBundle == null)
			i1 = 8;
		else
			i1 = paramBundle.getInt("volumeVisibility", 8);
		this.E.setVisibility(i1);
		b(false);
		this.L.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				NavigationActivity.b(NavigationActivity.this, true);

			}
		});
		if (this.M != null) {
			this.M.setOnSeekBarChangeListener(this.ap);
			if ((this.croom != null) && (this.croom.d())) {
				this.F.setVisibility(8);
				this.M.setVisibility(0);
			}
		}
		this.J.setOnTouchListener(this.ao);
		this.H.setOnTouchListener(this.ao);
		this.G.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

			}
		});// NavigationActivity.16.16(this));
	}

	private void a(Menu paramMenu) {
		boolean bool2 = false;
		boolean bool1 = false;
		boolean bool3 = false;
		boolean bool5 = false;

		MenuItem localMenuItem3 = paramMenu.findItem(R.id.watch);
		MenuItem localMenuItem5 = paramMenu.findItem(R.id.listen);
		MenuItem localMenuItem4 = paramMenu.findItem(R.id.security);
		MenuItem localMenuItem2 = paramMenu.findItem(R.id.comfort);
		MenuItem localMenuItem1 = paramMenu.findItem(R.id.lights);
		if (this.croom != null) {
			if ((this.croom.t()) && (this._director.F()))
				bool1 = false;
			else
				bool1 = true;
			if ((!this.croom.v()) || (!this._director.F()))
				bool3 = false;
			else
				bool3 = true;
			if ((!this.croom.x()) || (!this._director.F()))
				bool5 = false;
			else
				bool5 = true;

			if ((!this.croom.z()) || (!this._director.F()))
				bool2 = false;
			else
				bool2 = true;
		}

		if (localMenuItem3 != null)
			localMenuItem3.setEnabled(bool1);
		if (localMenuItem5 != null)
			localMenuItem5.setEnabled(bool3);
		if (localMenuItem4 != null)
			localMenuItem4.setEnabled(bool5);
		if (localMenuItem2 != null)
			localMenuItem2.setEnabled(bool2);
		if (localMenuItem1 != null)
			localMenuItem1.setEnabled(this._director.F());

	}

	private void b(Bundle paramBundle) {
		int i1 = 8;
		if (paramBundle != null)
			i1 = paramBundle.getInt("mediaVisibility", i1);
		this.O.setVisibility(i1);
		if (this.X != null)
			this.X.setOnTouchListener(this.ao);
		if (this.Y != null)
			this.Y.setOnTouchListener(this.ao);
		// this.U.setOnClickListener(new NavigationActivity.18(this));
		// this.V.setOnClickListener(new NavigationActivity.19(this));
		// this.T.setOnClickListener(new NavigationActivity.20(this));
		// NavigationActivity.21 local21 = new NavigationActivity.21(this);
		// this.P.setClickable(true);
		// this.P.setOnClickListener(local21);
		// this.R.setClickable(true);
		// this.R.setOnClickListener(local21);
		// this.Q.setClickable(true);
		// this.Q.setOnClickListener(local21);
		// if (this.W != null)
		// this.W.setOnClickListener(new NavigationActivity.22(this));
	}

	private void b(boolean paramBoolean) {
		if (this.E.getVisibility() == 0) {
			if (!paramBoolean) {
				this.E.setVisibility(8);
			} else {
				Animation localAnimation = AnimationUtils.loadAnimation(this,
						2130968583);
				this.E.startAnimation(localAnimation);
				localAnimation.setAnimationListener(new AnimationListener() {

					@Override
					public void onAnimationStart(Animation animation) {
						// TODO Auto-generated method stub

					}

					@Override
					public void onAnimationRepeat(Animation animation) {
						// TODO Auto-generated method stub

					}

					@Override
					public void onAnimationEnd(Animation animation) {
						// TODO Auto-generated method stub

					}
				});// new//new NavigationActivity.17(this));
			}
			this.D.setEnabled(true);
		}
	}

	private void c(Bundle paramBundle) {
		int i1 = 8;
		if (paramBundle != null)
			i1 = paramBundle.getInt("mediaVisibility", i1);
		this.O.setVisibility(i1);
	}

	private void c(boolean paramBoolean) {
		try {
			if (this.ad != null) {
				this.ac.b();
				this.ad = null;
			}
		} catch (Exception localException) {
			Ln.e(localException);
		}
	}

	private void j() {
		try {
			this.t = false;
			if ((0xF & getResources().getConfiguration().screenLayout) == 3) {
				DisplayMetrics localDisplayMetrics = new DisplayMetrics();
				getWindowManager().getDefaultDisplay().getMetrics(
						localDisplayMetrics);
				if (localDisplayMetrics.widthPixels < localDisplayMetrics.heightPixels
						&& localDisplayMetrics.widthPixels < 600)
					;
				this.t = true;
			}
		} catch (Exception localException) {
			Ln.e(localException);
		}
	}

	private void k() {

		if (!_preferences.g())
			E();
		else
			D();
		if (_navigator.H()) {
			DisplayMetrics displaymetrics = new DisplayMetrics();
			getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
			String s1 = J();
			_navigator.a(displaymetrics, getResources().getConfiguration(), s1);
		}
		C();
		_navigator.t();
		_navigator.a(aq);
		_director.a(ar);
		if (!(this instanceof DirectorActivity))
			if (!_director.r()) {
				if (!_navigator.E()) {
					if (!_director.t()) {
						// Ln.a("No previous connection, showing welcome screen",
						// new Object[0]);
						G();
					} else {
						// Ln.a("Has previous connection, reconnecting", new
						// Object[0]);
						_navigator.F();
					}
				} else {
					// Ln.a("In reconnect, showing reconnect dialog", new
					// Object[0]);
					Q();
				}
			} else {
				if (u == null)
					return;
				A();
			}
		t();
		if (c())
			p();
		if (!_navigator.y()) {
			_navigator.w();
			return;
		}

		// Ln.b((new
		// StringBuilder()).append("Navigating to: ").append(u.toString()).toString(),
		// new Object[0]);
		startActivity(u);
		u = null;

	}

	private void l() {
		this.ac = new RoomPickerWindow(this, this.ae.getWidth());
		this.ad = this.ac.a();
		this.ad.setZoneManager(this._director.J());
		this.ad.setNavigator(this._navigator);
		this.ad.setPickerListener(new RoomPicker.PickerListener() {

			@Override
			public void e() {
				// TODO Auto-generated method stub

			}

			@Override
			public void d() {
				try {
					if (NavigationActivity.b(NavigationActivity.this) != null) {
						if (NavigationActivity.this.croom != NavigationActivity
								.b(NavigationActivity.this).f()) {
							NavigationActivity.this.a(NavigationActivity.b(
									NavigationActivity.this).f());
							Intent intent = new Intent(NavigationActivity.this,
									HomeActivity.class);
							intent.setFlags(0x4000000);
							// intent.putExtra("com.control4.ui.RoomId",
							// NavigationActivity.this.bc)
							NavigationActivity.this.startActivity(intent);
						}
						NavigationActivity.a(NavigationActivity.this, true);
					}
				} catch (Exception localException) {

					Ln.e(localException);
				}

			}

			@Override
			public void c() {
				// TODO Auto-generated method stub

			}

			@Override
			public void b() {
				// TODO Auto-generated method stub

			}

			@Override
			public void a() {
				// TODO Auto-generated method stub

			}
		});
	}

	private void m() {
		int i1 = 1;
		if (this.croom != null) {
			if (!this.croom.d()) {
				this.F.setText(R.string.volume);
				if (this.Z != null) {
					this.Z.setText(R.string.volume);
					this.Z.resizeText();
				}
			} else {
				String str = this.croom.h() + "%";
				this.F.setText(str);
				if (this.Z != null) {
					this.Z.setText(str);
					this.Z.resizeText();
				}
				if (this.M != null) {
					if ((!this.t)
							|| (getResources().getConfiguration().orientation != i1))
						i1 = 0;
					if (i1 == 0) {
						this.F.setVisibility(8);
						this.M.setVisibility(0);
						this.M.setProgress(this.croom.h());
					} else {
						this.F.setVisibility(0);
						this.M.setVisibility(8);
						this.M.setProgress(this.croom.h());
					}
				}
			}
			if (!this.croom.n()) {
				this.G.setImageResource(R.drawable.md_mute_button);
				if (this.W != null)
					this.W.setImageResource(R.drawable.md_mute_button);
			} else {
				this.G.setImageResource(R.drawable.md_muteon_button);
				if (this.W != null)
					this.W.setImageResource(R.drawable.md_muteon_button);
			}
		}
	}

	private void o() {
		if (this.N.getVisibility() == 0) {
			this.O.setVisibility(0);
			this.U.setVisibility(0);
			this.V.setVisibility(0);
			this.T.setVisibility(0);
			this.q.setVisibility(4);
			L();
		}
	}

	protected void A() {
		if ((this._director.r()) && (this._director.F())) {
			// Ln.b("Checking for empty project", new Object[0]);
			Project localProject = this._navigator.getProject();
			if ((localProject != null) && (localProject.n() == 0)
					&& (!this._director.isDemo())
					&& (!(this instanceof ConfigActivity)))
				runOnUiThread(new Runnable() {

					@Override
					public void run() {
						// TODO Auto-generated method stub

					}
				});// NavigationActivity.13(this));
		}
	}

	// protected boolean B()
	// {
	// int i1 = 0;
	// Ln.b("Checking for empty project", new Object[i1]);
	// Project localProject = this._navigator.l();
	// if ((localProject != null) && (localProject.n() == 0))
	// i1 = 1;
	// return i1;
	// }
	//
	protected void C() {
		// Room localRoom = this.croom;
		if (this.croom != null)
			this.croom.b(this.w);
		this.croom = this._navigator.croom();
		if (this.croom != null)
			this.croom.a(this.w);
		// Ln.a("Update current room - previous room: " + localRoom +
		// " currentRoom: " + this.croom, new Object[0]);
		i_();
	}

	protected void D() {
		if (!this.aj) {
			this.aj = true;
			// Ln.b("enterDedicatedMode", new Object[0]);
			if (B == null) {
				// Ln.b("Disabling keyguard lock", new Object[0]);
				B = this._keyguardManager.newKeyguardLock("Control4.MyHome");
				B.disableKeyguard();
			}
			IntentFilter localIntentFilter = new IntentFilter(
					"android.intent.action.SCREEN_OFF");
			registerReceiver(this.as, localIntentFilter);
		}
	}

	protected void E() {
		if (!this.aj) {
			// Ln.b("exitDedicatedMode", new Object[0]);
			if (B != null) {
				// Ln.b("Enabling keyguard lock", new Object[0]);
				B.reenableKeyguard();
				B = null;
			}
			try {
				unregisterReceiver(this.as);
				this.aj = false;
			} catch (IllegalArgumentException localIllegalArgumentException) {
			}
		}
	}

	// protected void F()
	// {
	// Ln.a("onDirectorDisconnected called for: " + this, new Object[0]);
	// }

	protected void G() {
		try {
			// Ln.b("show welcome screen", new Object[0]);
			// if ((0xF & getResources().getConfiguration().screenLayout) >= 4)
			// this.ae.post(new NavigationActivity.24(this));
			// else
			startActivity(new Intent(this, WelcomeActivity.class));
		} catch (Exception localException) {
			Ln.e(localException);
		}
	}

	protected void H() {
		if (this.al != null)
			this.al.a();
	}

	protected void a(Room paramRoom) {
		if (paramRoom != this.croom) {
			if (this.croom != null)
				this.croom.b(this.w);
			this.croom = paramRoom;
			this._navigator.b(this.croom);
			this.croom.a(this.w);
			i_();
		}
	}

	// public void a(String paramString1, String paramString2)
	// {
	// try
	// {
	// AlertDialog localAlertDialog = new AlertDialog.Builder(this).create();
	// if (paramString1 == null)
	// {
	// str = (String)getText(2131165459);
	// localAlertDialog.setTitle(str);
	// localAlertDialog.setMessage(paramString2);
	// localAlertDialog.setCancelable(true);
	// localAlertDialog.setButton(getText(2131165286), new
	// NavigationActivity.23(this, localAlertDialog));
	// localAlertDialog.show();
	// return;
	// }
	// }
	// catch (Exception localException)
	// {
	// while (true)
	// {
	// Ln.e(localException);
	// continue;
	// String str = paramString1;
	// }
	// }
	// }

	protected void a(boolean paramBoolean) {
		m();
	}

	protected abstract View a_();

	@Deprecated
	protected boolean b() {
		return false;
	}

	protected boolean c() {
		return false;
	}

	// public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
	// {
	// int i1 = 1;
	// int i3;
	// int i2;
	// try
	// {
	// i3 = paramKeyEvent.getAction();
	// switch (paramKeyEvent.getKeyCode())
	// {
	// default:
	// i1 = super.dispatchKeyEvent(paramKeyEvent);
	// break;
	// case 24:
	// if (i3 == 0)
	// this.r.a_(true);
	// if (i3 != i1)
	// break;
	// this.r.b(true);
	// case 25:
	// }
	// }
	// catch (Exception i2)
	// {
	// Ln.e(localException);
	// i2 = super.dispatchKeyEvent(paramKeyEvent);
	// }
	// if (i3 == 0)
	// this.r.a_(false);
	// if (i3 == i2)
	// this.r.b(false);
	// return i2;
	// }

	protected void h() {

		if (this.u != null) {
			startActivity(this.u);
			this.u = null;
		}
	}

	protected void i() {
	}

	protected void i_() {

		if (this.croom != null) {
			this.n.setText(this.croom.b());
			if (!this.croom.ad()) {
				I();
				if (this.croom.ae()) {
					M();
					O();
				}
			} else {
				N();
				o();
				L();
			}
		}
		m();
	}

	protected void j_() {
	}

	protected void k_() {
	}

	protected int l_() {
		return -1;
	}

	// protected void onActivityResult(int paramInt1, int paramInt2, Intent
	// paramIntent)
	// {
	// try
	// {
	// Ln.a("onActivityResult for " + paramIntent, new Object[0]);
	// super.onActivityResult(paramInt1, paramInt2, paramIntent);
	// return;
	// }
	// catch (Exception localException)
	// {
	// while (true)
	// Ln.e(localException);
	// }
	// }
	//
	// public void onBackPressed()
	// {
	// try
	// {
	// if ((this.al != null) && (this.al.b()))
	// {
	// Ln.a("Showing Welcome Window when onBackPressed.", new Object[0]);
	// H();
	// }
	// if (q())
	// onNavHomeClicked(this.k);
	// super.onBackPressed();
	// return;
	// }
	// catch (Exception localException)
	// {
	// while (true)
	// Ln.e(localException);
	// }
	// }
	//
	// public void onConfigurationChanged(Configuration paramConfiguration)
	// {
	// super.onConfigurationChanged(paramConfiguration);
	// }
	//
	public void onCreate(Bundle paramBundle) {
		super.onCreate(paramBundle);
		try {
			this.am = true;
			if (((0xF & getResources().getConfiguration().screenLayout) < 3)
					&& (getResources().getConfiguration().orientation == 2)) {
				getWindow().setFlags(1024, 1024);
			}
			setContentView(R.layout.nav_activity);
			this.s = true;
			Intent localIntent = getIntent();
			if ((localIntent != null) && (localIntent.hasExtra("NavigateTo"))
					&& ((0x100000 & localIntent.getFlags()) == 0)) {
				this.u = ((Intent) localIntent.getExtras().get("NavigateTo"));
				localIntent.removeExtra("NavigateTo");
			}
			j();
			this.croom = this._navigator.croom();
			this.ae = ((RelativeLayout) findViewById(R.id.nav_layout));
			// if ((!x) && (this.ae == null))
			// throw new AssertionError();
		} catch (Exception localException) {
			Ln.e(localException);
		}
		// while (true)
		// {
		// return;
		this.af = a_();
		if (this.af != null) {
			RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(
					-1, -1);
			localLayoutParams.setMargins(0, 0, 0, 0);
			localLayoutParams.addRule(3, R.id.nav_toolbar);
			localLayoutParams.addRule(2, R.id.zones_toolbar);
			this.ae.addView(this.af, localLayoutParams);
		}
		a(paramBundle);
		m();
		b(paramBundle);
		// c(paramBundle);
		// }
	}

	// protected Dialog onCreateDialog(int paramInt)
	// {
	// Object localObject1 = null;
	// switch (paramInt)
	// {
	// case 1001:
	// default:
	// localObject1 = super.onCreateDialog(paramInt);
	// case 1000:
	// case 1002:
	// case 1004:
	// case 1003:
	// case 1005:
	// case 1006:
	// case 1007:
	// }
	// while (true)
	// {
	// return localObject1;
	// try
	// {
	// if (!this._director.M())
	// continue;
	// localObject1 = new
	// AlertDialog.Builder(this).setTitle(2131165280).setMessage(2131165281).setCancelable(true).setPositiveButton(2131165282,
	// new NavigationActivity.3(this)).setNegativeButton(2131165283, new
	// NavigationActivity.2(this)).create();
	// continue;
	// if (!this._director.M())
	// continue;
	// localObject1 = new AlertDialog.Builder(this);
	// ((AlertDialog.Builder)localObject1).setTitle(2131165297);
	// ((AlertDialog.Builder)localObject1).setMessage(2131165300);
	// ((AlertDialog.Builder)localObject1).setPositiveButton(2131165301, new
	// NavigationActivity.4(this));
	// ((AlertDialog.Builder)localObject1).setOnCancelListener(new
	// NavigationActivity.5(this));
	// localObject1 = ((AlertDialog.Builder)localObject1).create();
	// continue;
	// if ((this.ai == null) || (this.ai.length() == 0))
	// continue;
	// localObject1 = new AlertDialog.Builder(this);
	// ((AlertDialog.Builder)localObject1).setMessage(this.ai);
	// ((AlertDialog.Builder)localObject1).setPositiveButton(2131165286, new
	// NavigationActivity.6(this));
	// localObject1 = ((AlertDialog.Builder)localObject1).create();
	// continue;
	// localObject1 = new AlertDialog.Builder(this);
	// ((AlertDialog.Builder)localObject1).setTitle(2131165382);
	// if (this.ah == null)
	// ((AlertDialog.Builder)localObject1).setMessage(2131165383);
	// while (true)
	// {
	// ((AlertDialog.Builder)localObject1).setCancelable(false);
	// localObject1 = ((AlertDialog.Builder)localObject1).create();
	// break;
	// ((AlertDialog.Builder)localObject1).setMessage(this.ah);
	// }
	// }
	// catch (Exception localException)
	// {
	// Ln.e(localException);
	// }
	// break;
	// Object localObject2 = new AlertDialog.Builder(this);
	// ((AlertDialog.Builder)localObject2).setTitle(2131165384);
	// ((AlertDialog.Builder)localObject2).setMessage(getResources().getString(2131165385)
	// + ": " + this.r.b() + "?");
	// ((AlertDialog.Builder)localObject2).setPositiveButton(2131165388, new
	// NavigationActivity.7(this));
	// ((AlertDialog.Builder)localObject2).setNegativeButton(2131165389, new
	// NavigationActivity.8(this));
	// localObject2 = ((AlertDialog.Builder)localObject2).create();
	// continue;
	// localObject2 = ProgressDialog.show(this, getString(2131165297),
	// getString(2131165298), true, true, new NavigationActivity.9(this));
	// continue;
	// if (!this._director.M())
	// continue;
	// localObject2 = new AlertDialog.Builder(this);
	// ((AlertDialog.Builder)localObject2).setCancelable(true);
	// ((AlertDialog.Builder)localObject2).setTitle(2131165302);
	// ((AlertDialog.Builder)localObject2).setMessage(2131165303);
	// ((AlertDialog.Builder)localObject2).setPositiveButton(2131165304, new
	// NavigationActivity.10(this));
	// localObject2 = ((AlertDialog.Builder)localObject2).create();
	// localObject2 = localObject2;
	// }
	// }
	
	 public boolean onCreateOptionsMenu(Menu paramMenu)
	 {
	 getMenuInflater().inflate(R.menu.navigate_menu, paramMenu);
	 a(paramMenu);
	 return true;
	 }
	
	// protected void onDestroy()
	// {
	// Ln.b("Destroying activity: " + getClass().getName(), new Object[0]);
	// a(this.ae);
	// this.ae = null;
	// this.s = false;
	// super.onDestroy();
	// if (this._preferences.g())
	// E();
	// }
	//
	// public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
	// {
	// boolean bool;
	// if ((paramInt != 4) || (this.al == null) || (!this.al.b()))
	// {
	// bool = super.onKeyDown(paramInt, paramKeyEvent);
	// }
	// else
	// {
	// onBackPressed();
	// bool = true;
	// }
	// return bool;
	// }

	public void onLightsClicked(View paramView) {
		if (this._director.F()) {
			startActivity(new Intent(this, LightsActivity.class));
			i();
		}
	}

	// public void onMediaArtClicked(View paramView)
	// {
	// try
	// {
	// if (!this._director.F())
	// return;
	// if (this.r.ad())
	// {
	// startActivity(new Intent(this, MusicNowPlayingActivity.class));
	// i();
	// }
	// }
	// catch (Exception localException)
	// {
	// Ln.e(localException);
	// }
	// if (this.r.ae())
	// {
	// Object localObject = this.r.e(this.r.p());
	// if ((this instanceof DeviceActivity))
	// {
	// i1 = ((DeviceActivity)this).d();
	// if ((localObject == null) || (((Device)localObject).t() != i1));
	// }
	// for (int i1 = 1; i1 == 0; i1 = 0)
	// {
	// localObject = DeviceActivityFactory.a(this, (Device)localObject);
	// if (localObject == null)
	// break;
	// if (this.r.Y())
	// ((Intent)localObject).putExtra("com.control4.ui.DeviceCategory", 4);
	// while (true)
	// {
	// ((Intent)localObject).setFlags(67108864);
	// startActivity((Intent)localObject);
	// i();
	// break;
	// if (!this.r.aa())
	// continue;
	// ((Intent)localObject).putExtra("com.control4.ui.DeviceCategory", 5);
	// }
	// }
	// }
	// }
	//
	public void onNavBackClicked(View paramView) {
		if (!q()) {
			finish();
			i();
		} else {
			onNavHomeClicked(this.k);
		}
	}

	public void onNavHomeClicked(View paramView) {
		Intent localIntent = new Intent(this, HomeActivity.class);
		localIntent.setFlags(71303168);
		startActivity(localIntent);
		i();
	}

	// public boolean onOptionsItemSelected(MenuItem paramMenuItem)
	// {
	// boolean bool = true;
	// Intent localIntent;
	// switch (paramMenuItem.getItemId())
	// {
	// case 2131558545:
	// case 2131558547:
	// case 2131558549:
	// case 2131558551:
	// case 2131558552:
	// case 2131558554:
	// case 2131558555:
	// case 2131558556:
	// default:
	// bool = super.onOptionsItemSelected(paramMenuItem);
	// break;
	// case 2131558544:
	// localIntent = new Intent(this, DeviceListActivity.class);
	// localIntent.putExtra("com.control4.ui.DeviceCategory", 5);
	// startActivity(localIntent);
	// break;
	// case 2131558546:
	// localIntent = new Intent(this, DeviceListActivity.class);
	// localIntent.putExtra("com.control4.ui.DeviceCategory", 4);
	// startActivity(localIntent);
	// break;
	// case 2131558548:
	// localIntent = new Intent(this, DeviceListActivity.class);
	// localIntent.putExtra("com.control4.ui.DeviceCategory", 3);
	// startActivity(localIntent);
	// break;
	// case 2131558550:
	// onLightsClicked(this.o);
	// break;
	// case 2131558553:
	// localIntent = new Intent(this, DeviceListActivity.class);
	// localIntent.putExtra("com.control4.ui.DeviceCategory", 2);
	// startActivity(localIntent);
	// break;
	// case 2131558557:
	// startActivity(new Intent(this, MoreActivity.class));
	// }
	// return bool;
	// }
	//
	// protected void onPause()
	// {
	// Ln.b("Pausing activity: " + getClass().getName(), new Object[0]);
	// super.onPause();
	// if (this.r != null)
	// this.r.b(this.w);
	// this._navigator.s();
	// this._navigator.b(this.aq);
	// this._director.b(this.ar);
	// this.s = false;
	// if (this.ad != null)
	// if (this.ad.getVisibility() != 0)
	// this.ad = null;
	// else
	// c(false);
	// System.gc();
	// }

	public void onPowerClicked(View paramView) {
		if ((this._director.F()) && (this.croom != null))
			if ((!this._preferences.n()) || (!this.croom.ac()))
				this.croom.an();
			else
				showDialog(1005);
	}

	protected void onPrepareDialog(int paramInt, Dialog paramDialog) {
		Object localObject;
		switch (paramInt) {
		case 1003:
			localObject = (AlertDialog) paramDialog;
			if (this.ah != null)
				((AlertDialog) localObject).setMessage(this.ah);
			else
				((AlertDialog) localObject).setMessage(getResources()
						.getString(2131165383));
			break;
		case 1004:
			if ((this.ai == null) || (this.ai.length() == 0))
				return;
			((AlertDialog) paramDialog).setMessage(this.ai);
			break;
		case 1005:
			paramDialog.setTitle(2131165384);
			localObject = getResources().getString(2131165385) + ": "
					+ this.croom.b() + "?";
			((AlertDialog) paramDialog).setMessage((CharSequence) localObject);
		}
		super.onPrepareDialog(paramInt, paramDialog);
	}

	public boolean onPrepareOptionsMenu(Menu paramMenu) {
		a(paramMenu);
		return true;
	}

	// public void onQueueClicked(View paramView)
	// {
	// if ((!(this instanceof QueueActivity)) && (this._director.F()))
	// {
	// startActivity(new Intent(this, QueueActivity.class));
	// i();
	// }
	// }
	//
	protected void onResume() {
		try {

			System.gc();
			super.onResume();
			if (am) {
				am = false;
			} else {
				if (an)
					return;
				if ((0xf & getResources().getConfiguration().screenLayout) < 3
						&& getResources().getConfiguration().orientation == 2) {
					an = true;
					// Ln.a((new
					// StringBuilder()).append("Starting Landscape Refresh Activity from ").append(this).toString(),
					// new Object[0]);
					startActivity(new Intent(this,
							LandscapeRefreshActivity.class));
				}
			}
		} catch (Exception exception) {
			Ln.e(exception);
			// break MISSING_BLOCK_LABEL_607;
		}
		// L1:
		if (_director.r()) {
			R();
			S();
		}
		Rhapsody obj = _director.Q();
		if (obj != null && obj.b())
			T();
		s = true;
		ak = false;
		_notificationManager.cancel(1);
		b(false);

		if (b() && ae != null && ae.getBackground() == null) {
			// Ln.a("Loading carbon_blue as 565 background", new Object[0]);
			BitmapFactory.Options obj1 = new android.graphics.BitmapFactory.Options();
			obj1.inDither = true;
			obj1.inPreferredConfig = android.graphics.Bitmap.Config.RGB_565;
			obj1.inPurgeable = true;
			obj1.inInputShareable = false;
			Bitmap obj2 = BitmapFactory.decodeResource(getResources(),
					0x7f020118, obj1);
			BitmapDrawable obj3 = new BitmapDrawable(getResources(), obj2);
			ae.setBackgroundDrawable(obj3);
		}
		if (l_() != -1 && ae != null && ae.getBackground() == null) {
			// Ln.a("Loading bkg_device_lists as 565 background", new
			// Object[0]);
			BitmapFactory.Options obj1 = new android.graphics.BitmapFactory.Options();
			obj1.inDither = true;
			obj1.inPreferredConfig = android.graphics.Bitmap.Config.RGB_565;
			obj1.inPurgeable = true;
			obj1.inInputShareable = false;
			Bitmap obj2 = BitmapFactory.decodeResource(getResources(), l_(),
					obj1);
			BitmapDrawable obj3 = new BitmapDrawable(getResources(), obj2);
			ae.setBackgroundDrawable(obj3);
		}
		Intent intent = getIntent();
		if (intent != null && intent.getData() != null) {
			Uri obj4 = intent.getData();
			intent.setData(null);
			setIntent(intent);
			if ("myhome.activation".equals(obj4.getScheme())) {
				a(obj4);
				// break MISSING_BLOCK_LABEL_607;
				return;
			}
		}
		// break MISSING_BLOCK_LABEL_481;
		an = false;
		// goto _L1
		// k();
		// break MISSING_BLOCK_LABEL_607;
		if (!(this instanceof DirectorActivity)
				&& !(this instanceof AuthenticationActivity) && _navigator.r())
			G();
		else if (!_director.isDemo()) {
			a(((Uri) (null)));
		} else {
			k();
			H();
			if (croom == null && !(this instanceof HomeActivity)
					&& !(this instanceof AboutActivity)
					&& !(this instanceof ConfigActivity)
					&& !(this instanceof DirectorActivity)
					&& !(this instanceof AuthenticationActivity)) {
				k();
				finish();
			}
		}
	}

	public void onRoomClicked(View paramView) {
		if (this._director.F()) {
			if (this.ad == null)
				l();
			P();
		}
	}

	protected void onSaveInstanceState(Bundle paramBundle) {
		paramBundle.putInt("volumeVisibility", this.E.getVisibility());
		paramBundle.putInt("mediaVisibility", this.O.getVisibility());
		super.onSaveInstanceState(paramBundle);
	}

	public void onShowVolumeClicked(View paramView) {
		Animation localAnimation = AnimationUtils.loadAnimation(this,
				com.zd.home.R.anim.slide_in_top);
		this.E.setAnimation(localAnimation);
		this.E.setVisibility(0);
		this.D.setEnabled(false);
		m();
	}

	protected void onStart() {
		super.onStart();
		// Ln.b("Starting activity: " + getClass().getName(), new Object[0]);
	}

	// protected void onStop()
	// {
	// try
	// {
	// Ln.b("Stopping activity: " + getClass().getName(), new Object[0]);
	// super.onStop();
	// if ((b()) && (this.ae != null))
	// this.ae.setBackgroundDrawable(null);
	// return;
	// }
	// catch (Exception localException)
	// {
	// while (true)
	// Ln.e(localException);
	// }
	// }

	public void onZonesClicked(View paramView) {
		if ((this._director.F()) && (!(this instanceof ZoneListActivity))) {
			startActivity(new Intent(this, ZoneListActivity.class));
			i();
		}
	}

	public void p() {
		try {
			Rhapsody localRhapsody = this._director.Q();
			if ((localRhapsody == null) || (localRhapsody.e()))
				return;
			RhapsodyUser localRhapsodyUser = localRhapsody.f();
			if ((localRhapsody.i()) || (localRhapsodyUser != null))
				return;
			if (!localRhapsody.x_()) {
				if (localRhapsody.i())
					return;
				localRhapsody.c(new RhapsodyListener() {

					@Override
					public void f(Rhapsody paramRhapsody) {
						// TODO Auto-generated method stub

					}

					@Override
					public void e(Rhapsody paramRhapsody) {
						// TODO Auto-generated method stub

					}

					@Override
					public void d(Rhapsody paramRhapsody) {
						// TODO Auto-generated method stub

					}

					@Override
					public void c(Rhapsody paramRhapsody) {
						// TODO Auto-generated method stub

					}

					@Override
					public void b(Rhapsody paramRhapsody) {
						// TODO Auto-generated method stub

					}

					@Override
					public void a(Rhapsody paramRhapsody, boolean paramBoolean) {
						// TODO Auto-generated method stub

					}

					@Override
					public void a(Rhapsody paramRhapsody, String paramString) {
						// TODO Auto-generated method stub

					}

					@Override
					public void a(Rhapsody paramRhapsody) {
						// TODO Auto-generated method stub

					}
				});// NavigationActivity.1.1(this));
			}
		} catch (Exception localException) {
			Ln.e(localException);
		}
		if (c())
			startActivity(new Intent(this, RhapsodyHomeActivity.class));
	}

	protected boolean q() {
		return this.v;
	}

	// protected boolean r()
	// {
	// return this.s;
	// }
	//
	// protected void s()
	// {
	// }

	protected void t() {
		L();
		O();
	}

	protected void u() {
	}

	protected void v() {
	}

	protected void w() {
	}

	protected void x() {
		View localView = findViewById(R.id.nav_back);
		if ((x) || (localView != null)) {
			localView.setVisibility(8);
			return;
		}
		throw new AssertionError();
	}

	protected void y() {
		View localView = findViewById(R.id.nav_home);
		if ((x) || (localView != null)) {
			localView.setVisibility(8);
			return;
		}
		throw new AssertionError();
	}

	protected void z() {
		this.N.setVisibility(8);
		RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(
				-1, -2);
		localLayoutParams.addRule(3, R.id.nav_toolbar);
		localLayoutParams.addRule(12);
		this.af.setLayoutParams(localLayoutParams);
	}
}
