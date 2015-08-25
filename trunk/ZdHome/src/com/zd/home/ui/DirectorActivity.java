package com.zd.home.ui;

import android.os.Handler;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.zd.home.director.DirectorConnection;

public class DirectorActivity extends NavigationActivity implements
		AdapterView.OnItemClickListener, AdapterView.OnItemSelectedListener {
	private static final String a = "c4:director";
	// private static final int b;
	private ArrayAdapter<DirectorConnection> A;
	private ListView B;
	private Button C;
	private Button D;
	private Button E;
	private Button F;
	private ProgressBar G;
	private ProgressBar H;
	private TextView J;
	private int K = -1;
	private boolean L = false;
	private volatile Boolean M = Boolean.valueOf(false);
	private final Handler N = new Handler();
	private boolean O = true;
	private boolean P = false;

	// private final BroadcastReceiver Q = new DirectorActivity.1(this);
	// private final a.a.a.c.b R = new DirectorActivity.5(this);
	// private final Director.DirectorListener S = new DirectorActivity.6(this);
	// private final Runnable T = new DirectorActivity.7(this);
	//
	// @Inject
	// private Director _director;
	// private Vector<DirectorConnection> c;
	// private final a.a.a.b d = new a.a.a.b();
	// private DirectorActivity.ControlPointLaunchTask2 e;
	// private volatile DirectorActivity.ConnectAsyncTask2 f;
	//
	// private boolean j()
	// {
	// return this._director.r();
	// }
	//
	// private void k()
	// {
	// Button localButton = this.F;
	// boolean bool;
	// if ((this._director == null) || (!this._director.r()) ||
	// (!this._director.F()) || (this._director.n()))
	// bool = false;
	// else
	// bool = true;
	// localButton.setEnabled(bool);
	// }
	//
	// private void l()
	// {
	// if (this.K != -1)
	// {
	// DirectorConnection localDirectorConnection =
	// (DirectorConnection)this.A.getItem(this.K);
	// this.E.setEnabled(this.c.contains(localDirectorConnection));
	// }
	// Button localButton = this.D;
	// boolean bool;
	// if (this.K == -1)
	// bool = false;
	// else
	// bool = true;
	// localButton.setEnabled(bool);
	// }
	//
	// // ERROR //
	// private void m()
	// {
	// // Byte code:
	// // 0: aload_0
	// // 1: getfield 79 com/control4/ui/DirectorActivity:M Ljava/lang/Boolean;
	// // 4: astore_2
	// // 5: aload_2
	// // 6: monitorenter
	// // 7: aload_0
	// // 8: getfield 79 com/control4/ui/DirectorActivity:M Ljava/lang/Boolean;
	// // 11: invokevirtual 190 java/lang/Boolean:booleanValue ()Z
	// // 14: ifeq +69 -> 83
	// // 17: ldc 192
	// // 19: iconst_0
	// // 20: anewarray 194 java/lang/Object
	// // 23: invokestatic 199 roboguice/util/Ln:b
	// (Ljava/lang/Object;[Ljava/lang/Object;)I
	// // 26: pop
	// // 27: aload_0
	// // 28: getfield 67 com/control4/ui/DirectorActivity:d La/a/a/b;
	// // 31: invokevirtual 201 a/a/a/b:g ()V
	// // 34: aload_0
	// // 35: invokespecial 134 com/control4/ui/DirectorActivity:n ()V
	// // 38: aload_0
	// // 39: getfield 142 com/control4/ui/DirectorActivity:C
	// Landroid/widget/Button;
	// // 42: iconst_0
	// // 43: invokevirtual 167 android/widget/Button:setEnabled (Z)V
	// // 46: aload_0
	// // 47: getfield 171 com/control4/ui/DirectorActivity:G
	// Landroid/widget/ProgressBar;
	// // 50: iconst_0
	// // 51: invokevirtual 207 android/widget/ProgressBar:setVisibility (I)V
	// // 54: aload_0
	// // 55: getfield 67 com/control4/ui/DirectorActivity:d La/a/a/b;
	// // 58: ldc 12
	// // 60: invokevirtual 210 a/a/a/b:d (Ljava/lang/String;)V
	// // 63: aload_0
	// // 64: getfield 84 com/control4/ui/DirectorActivity:N
	// Landroid/os/Handler;
	// // 67: aload_0
	// // 68: getfield 110 com/control4/ui/DirectorActivity:T
	// Ljava/lang/Runnable;
	// // 71: ldc2_w 211
	// // 74: invokevirtual 216 android/os/Handler:postDelayed
	// (Ljava/lang/Runnable;J)Z
	// // 77: pop
	// // 78: aload_2
	// // 79: monitorexit
	// // 80: goto +71 -> 151
	// // 83: aload_0
	// // 84: getfield 116 com/control4/ui/DirectorActivity:e
	// Lcom/control4/ui/DirectorActivity$ControlPointLaunchTask2;
	// // 87: ifnull +23 -> 110
	// // 90: ldc 218
	// // 92: iconst_0
	// // 93: anewarray 194 java/lang/Object
	// // 96: invokestatic 199 roboguice/util/Ln:b
	// (Ljava/lang/Object;[Ljava/lang/Object;)I
	// // 99: pop
	// // 100: aload_2
	// // 101: monitorexit
	// // 102: goto +49 -> 151
	// // 105: astore_1
	// // 106: aload_2
	// // 107: monitorexit
	// // 108: aload_1
	// // 109: athrow
	// // 110: ldc 220
	// // 112: iconst_0
	// // 113: anewarray 194 java/lang/Object
	// // 116: invokestatic 199 roboguice/util/Ln:b
	// (Ljava/lang/Object;[Ljava/lang/Object;)I
	// // 119: pop
	// // 120: aload_0
	// // 121: new 222 com/control4/ui/DirectorActivity$ControlPointLaunchTask2
	// // 124: dup
	// // 125: aload_0
	// // 126: aload_0
	// // 127: getfield 67 com/control4/ui/DirectorActivity:d La/a/a/b;
	// // 130: invokespecial 225
	// com/control4/ui/DirectorActivity$ControlPointLaunchTask2:<init>
	// (Lcom/control4/ui/DirectorActivity;La/a/a/b;)V
	// // 133: putfield 116 com/control4/ui/DirectorActivity:e
	// Lcom/control4/ui/DirectorActivity$ControlPointLaunchTask2;
	// // 136: aload_0
	// // 137: getfield 116 com/control4/ui/DirectorActivity:e
	// Lcom/control4/ui/DirectorActivity$ControlPointLaunchTask2;
	// // 140: iconst_0
	// // 141: anewarray 227 java/lang/Void
	// // 144: invokevirtual 231
	// com/control4/ui/DirectorActivity$ControlPointLaunchTask2:execute
	// ([Ljava/lang/Object;)Landroid/os/AsyncTask;
	// // 147: pop
	// // 148: goto -70 -> 78
	// // 151: return
	// //
	// // Exception table:
	// // from to target type
	// // 7 108 105 finally
	// // 110 148 105 finally
	// }
	//
	// private void n()
	// {
	// Ln.b("Updating director list", new Object[0]);
	// this.C.setEnabled(true);
	// this.G.setVisibility(8);
	// this.H.setVisibility(8);
	// this.A.clear();
	// this.J.setText("");
	// DirectorConnection localDirectorConnection;
	// for (int i = 0; ; localDirectorConnection++)
	// {
	// if (i >= this.c.size())
	// {
	// localObject = this.d.f();
	// for (int j = 0; ; j++)
	// {
	// if (j >= ((c)localObject).size())
	// {
	// if (this._director.r())
	// {
	// Ln.a("Director is connected, marking list item connected", new
	// Object[0]);
	// localObject = this._director.s();
	// if (localObject == null)
	// {
	// Ln.d("Director isConnected, but getOpenConnection is null", new
	// Object[0]);
	// this.J.setText("");
	// }
	// else
	// {
	// j = this.A.getPosition(localObject);
	// if (j != -1)
	// {
	// localDirectorConnection = (DirectorConnection)this.A.getItem(j);
	// localDirectorConnection.a(true);
	// Ln.a("Setting item at position: " + j + " as connected. " +
	// localDirectorConnection, new Object[0]);
	// }
	// else
	// {
	// Ln.a("Connected item not found in list, adding.", new Object[0]);
	// this.A.add(localObject);
	// }
	// this.J.setText(((DirectorConnection)localObject).a());
	// }
	// }
	// k();
	// return;
	// }
	// localDirectorConnection = new DirectorConnection(((c)localObject).a(j));
	// if (this.A.getPosition(localDirectorConnection) != -1)
	// continue;
	// this.A.add(localDirectorConnection);
	// localDirectorConnection.a(false);
	// }
	// }
	// Object localObject =
	// (DirectorConnection)this.c.get(localDirectorConnection);
	// ((DirectorConnection)localObject).a(false);
	// this.A.add(localObject);
	// }
	// }
	//
	// protected View a_()
	// {
	// return LayoutInflater.from(this).inflate(2130903063, null);
	// }
	//
	// protected boolean b()
	// {
	// return false;
	// }
	//
	// public void onAddClicked(View paramView)
	// {
	// showDialog(0);
	// }
	//
	// public void onBackPressed()
	// {
	// try
	// {
	// if ((!this._director.r()) && (!this._director.G()))
	// {
	// G();
	// finish();
	// return;
	// }
	// }
	// catch (Exception localException)
	// {
	// while (true)
	// {
	// Ln.e(localException);
	// super.onBackPressed();
	// }
	// }
	// }
	//
	// public void onConnectClicked(View paramView)
	// {
	// try
	// {
	// if (this.K != -1)
	// {
	// DirectorConnection localDirectorConnection =
	// (DirectorConnection)this.A.getItem(this.K);
	// if (this.f != null)
	// {
	// Ln.b("Cancelling current connect task", new Object[0]);
	// this.f.a(true);
	// }
	// this.F.setEnabled(false);
	// this.f = new DirectorActivity.ConnectAsyncTask2(this,
	// localDirectorConnection);
	// this.f.g();
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
	// public void onCreate(Bundle paramBundle)
	// {
	// super.onCreate(paramBundle);
	// try
	// {
	// this.c = this._preferences.a();
	// this.J = ((TextView)findViewById(2131558516));
	// this.G = ((ProgressBar)findViewById(2131558519));
	// this.H = ((ProgressBar)findViewById(2131558523));
	// this.C = ((Button)findViewById(2131558521));
	// this.D = ((Button)findViewById(2131558500));
	// this.E = ((Button)findViewById(2131558522));
	// this.F = ((Button)findViewById(2131558494));
	// this.B = ((ListView)findViewById(2131558518));
	// this.A = new DirectorConnectionListAdapter(this);
	// this.B.setAdapter(this.A);
	// this.B.setOnItemSelectedListener(this);
	// this.B.setOnItemClickListener(this);
	// this.H.setVisibility(8);
	// l();
	// this.d.a(this.R);
	// n();
	// m();
	// this._director.a(this.S);
	// try
	// {
	// getApplicationContext().registerReceiver(this.Q, new
	// IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
	// return;
	// }
	// catch (Exception localException1)
	// {
	// while (true)
	// Ln.e(localException1);
	// }
	// }
	// catch (Exception localException2)
	// {
	// while (true)
	// Ln.e(localException2);
	// }
	// }
	//
	// protected Dialog onCreateDialog(int paramInt)
	// {
	// Dialog localDialog;
	// switch (paramInt)
	// {
	// default:
	// localDialog = super.onCreateDialog(paramInt);
	// break;
	// case 0:
	// localDialog = new Dialog(this);
	// localDialog.setContentView(2130903058);
	// localDialog.setTitle(getString(2131165502));
	// TextView localTextView1 = (TextView)localDialog.findViewById(2131558498);
	// TextView localTextView2 = (TextView)localDialog.findViewById(2131558422);
	// Button localButton = (Button)localDialog.findViewById(2131558500);
	// localButton.setEnabled(false);
	// localTextView1.addTextChangedListener(new DirectorActivity.2(this,
	// localButton, localTextView2));
	// localTextView2.addTextChangedListener(new DirectorActivity.3(this,
	// localButton, localTextView1));
	// localButton.setOnClickListener(new DirectorActivity.4(this,
	// localTextView1, localTextView2, localDialog));
	// localDialog = localDialog;
	// }
	// return localDialog;
	// }
	//
	// protected void onDestroy()
	// {
	// super.onDestroy();
	// try
	// {
	// this._director.b(this.S);
	// if (this.d != null)
	// this.d.n();
	// if (this.e != null)
	// this.e.cancel(true);
	// if (this.f != null)
	// this.f.a(true);
	// }
	// catch (Exception localException)
	// {
	// try
	// {
	// while (true)
	// {
	// getApplicationContext().unregisterReceiver(this.Q);
	// label75: return;
	// localException = localException;
	// Ln.e(localException);
	// }
	// }
	// catch (IllegalArgumentException localIllegalArgumentException)
	// {
	// break label75;
	// }
	// }
	// }
	//
	// public void onItemClick(AdapterView<?> paramAdapterView, View paramView,
	// int paramInt, long paramLong)
	// {
	// this.B.getCheckedItemPosition();
	// this.K = paramInt;
	// l();
	// }
	//
	// public void onItemSelected(AdapterView<?> paramAdapterView, View
	// paramView, int paramInt, long paramLong)
	// {
	// this.K = paramInt;
	// l();
	// }
	//
	// public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
	// {
	// boolean bool;
	// if (paramInt != 4)
	// {
	// bool = super.onKeyDown(paramInt, paramKeyEvent);
	// }
	// else
	// {
	// if (!this.L)
	// finish();
	// else
	// onNavHomeClicked(null);
	// bool = true;
	// }
	// return bool;
	// }
	//
	// public void onNavBackClicked(View paramView)
	// {
	// try
	// {
	// if ((!this._director.r()) && (!this._director.G()))
	// {
	// G();
	// finish();
	// return;
	// }
	// }
	// catch (Exception localException)
	// {
	// while (true)
	// {
	// Ln.e(localException);
	// if (this.L)
	// {
	// onNavHomeClicked(null);
	// continue;
	// }
	// super.onNavBackClicked(paramView);
	// }
	// }
	// }
	//
	// public void onNavHomeClicked(View paramView)
	// {
	// try
	// {
	// if ((!this._director.r()) && (!this._director.G()))
	// {
	// G();
	// finish();
	// return;
	// }
	// }
	// catch (Exception localException)
	// {
	// while (true)
	// {
	// Ln.e(localException);
	// super.onNavHomeClicked(paramView);
	// }
	// }
	// }
	//
	// public void onNothingSelected(AdapterView<?> paramAdapterView)
	// {
	// this.K = -1;
	// l();
	// }
	//
	// protected void onPrepareDialog(int paramInt, Dialog paramDialog)
	// {
	// switch (paramInt)
	// {
	// case 0:
	// TextView localTextView = (TextView)paramDialog.findViewById(2131558498);
	// if (localTextView != null)
	// {
	// localTextView.setText("");
	// localTextView.requestFocus();
	// }
	// localTextView = (TextView)paramDialog.findViewById(2131558422);
	// if (localTextView != null)
	// localTextView.setText("");
	// ((Button)paramDialog.findViewById(2131558500)).setEnabled(false);
	// }
	// super.onPrepareDialog(paramInt, paramDialog);
	// }
	//
	// public void onRefreshClicked(View paramView)
	// {
	// try
	// {
	// m();
	// return;
	// }
	// catch (Exception localException)
	// {
	// while (true)
	// Ln.e(localException);
	// }
	// }
	//
	// public void onRemoveClicked(View paramView)
	// {
	// try
	// {
	// if (this.K != -1)
	// {
	// DirectorConnection localDirectorConnection =
	// (DirectorConnection)this.A.getItem(this.K);
	// if (this.c.contains(localDirectorConnection))
	// {
	// this.c.remove(localDirectorConnection);
	// this._director.c(localDirectorConnection);
	// this._preferences.a(this.c);
	// if (localDirectorConnection.equals(this._preferences.b()))
	// this._preferences.a(null);
	// if ((!this._director.r()) ||
	// (!this._director.s().equals(localDirectorConnection)))
	// break label137;
	// this._director.x();
	// }
	// while (true)
	// {
	// n();
	// break;
	// label137: if ((!this._director.a()) || (this.f == null))
	// continue;
	// this.f.a(true);
	// this.f = null;
	// }
	// }
	// }
	// catch (Exception localException)
	// {
	// Ln.e(localException);
	// }
	// }
	//
	// protected void onResume()
	// {
	// super.onResume();
	// try
	// {
	// if (this.P)
	// {
	// Ln.a("Creating new DirectorActivity onResume.", new Object[0]);
	// Intent localIntent = new Intent(this, DirectorActivity.class);
	// localIntent.setFlags(67108864);
	// startActivity(localIntent);
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
	// public void onUpdateClicked(View paramView)
	// {
	// if (j())
	// {
	// Intent localIntent = new Intent(this, ConfigActivity.class);
	// localIntent.putExtra("force_update", true);
	// startActivity(localIntent);
	// }
	// }
	@Override
	public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
			long arg3) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		// TODO Auto-generated method stub

	}

	@Override
	protected View a_() {
		// TODO Auto-generated method stub
		return null;
	}
}
