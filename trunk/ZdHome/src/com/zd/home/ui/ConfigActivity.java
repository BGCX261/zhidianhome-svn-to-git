package com.zd.home.ui;

import android.os.Handler;
import android.view.View;
import android.widget.Button;

public class ConfigActivity extends NavigationActivity {
	private static final String a = "LastProgressMessage";
	private Button A;
	private final Handler B = new Handler();

	// private volatile ConfigActivity.UpdateProjectTask C;
	// private final Director.OnProgressUpdateListener D = new
	// ConfigActivity.4(this);
	// private final Command.NotificationListener E = new
	// ConfigActivity.5(this);
	// private final Director.DirectorListener F = new ConfigActivity.6(this);
	//
	// @g
	// private MyHomeApplication _app;
	//
	// @g
	// private Director _director;
	//
	// @g
	// private NotificationManager _notificationManager;
	//
	// @InjectResource(a=2131165273)
	// private String b;
	//
	// @InjectResource(a=2131165274)
	// private String c;
	//
	// @InjectExtra(a="force_update", b=true)
	// private boolean d;
	// private String e;
	// private ProgressDialog f;
	//
	// private void j()
	// {
	// try
	// {
	// Button localButton = this.A;
	// if ((!this._director.G()) && (this._director.F()) && (this._director.r())
	// && (!this._director.n()));
	// for (boolean bool = true; ; bool = false)
	// {
	// localButton.setEnabled(bool);
	// return;
	// }
	// }
	// catch (Exception localException)
	// {
	// while (true)
	// Ln.e(localException);
	// }
	// }
	//
	// private void k()
	// {
	// try
	// {
	// Ln.b("startShowProgress", new Object[0]);
	// this.f = ProgressDialog.show(this, null, null, true, false);
	// if ((this.e != null) && (this.e.length() > 0))
	// this.f.setMessage(this.e);
	// this._director.a(this.D);
	// return;
	// }
	// catch (Exception localException)
	// {
	// while (true)
	// Ln.e(localException);
	// }
	// }
	//
	// private void l()
	// {
	// try
	// {
	// if (this.f != null)
	// {
	// Ln.b("Dismissing progress dialog", new Object[0]);
	// this.f.dismiss();
	// this.f = null;
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
	// protected View a_()
	// {
	// return LayoutInflater.from(this).inflate(2130903056, null);
	// }
	//
	// protected boolean b()
	// {
	// return false;
	// }
	//
	// public void onCreate(Bundle paramBundle)
	// {
	// super.onCreate(paramBundle);
	// try
	// {
	// this.A = ((Button)findViewById(2131558494));
	// if ((paramBundle != null) &&
	// (paramBundle.containsKey("LastProgressMessage")));
	// for (this.e = paramBundle.getString("LastProgressMessage"); ; this.e =
	// getString(2131165260))
	// {
	// if (this.d)
	// this.B.postDelayed(new ConfigActivity.1(this), 50L);
	// EditText localEditText = (EditText)findViewById(2131558417);
	// if (localEditText != null)
	// {
	// localEditText.setText(this._preferences.k(),
	// TextView.BufferType.EDITABLE);
	// localEditText.setEnabled(false);
	// }
	// j();
	// this._director.a(this.F);
	// break;
	// }
	// }
	// catch (Exception localException)
	// {
	// Ln.e(localException);
	// }
	// }
	//
	// public void onDeactivateClicked(View paramView)
	// {
	// while (true)
	// {
	// AlertDialog localAlertDialog;
	// try
	// {
	// JSONObject localJSONObject = this._navigator.v();
	// if ((!localJSONObject.has("status")) ||
	// (!localJSONObject.getString("status").equalsIgnoreCase("SUCCESS")))
	// continue;
	// localAlertDialog = new AlertDialog.Builder(this).create();
	// localAlertDialog.setTitle(getText(2131165440));
	// if (!localJSONObject.has("messageText"))
	// continue;
	// localAlertDialog.setMessage(localJSONObject.getString("messageText"));
	// localAlertDialog.setCancelable(true);
	// localAlertDialog.setButton(getText(2131165286), new
	// ConfigActivity.2(this, localAlertDialog));
	// localAlertDialog.show();
	// break;
	// localAlertDialog = new AlertDialog.Builder(this).create();
	// localAlertDialog.setTitle(getText(2131165439));
	// if (localJSONObject.has("messageText"))
	// {
	// localAlertDialog.setMessage(localJSONObject.getString("messageText"));
	// localAlertDialog.setCancelable(true);
	// localAlertDialog.setButton(getText(2131165286), new
	// ConfigActivity.3(this, localAlertDialog));
	// localAlertDialog.show();
	// }
	// }
	// catch (JSONException localJSONException)
	// {
	// localJSONException.printStackTrace();
	// }
	// localAlertDialog.setMessage(getText(2131165438));
	// }
	// }
	//
	// protected void onDestroy()
	// {
	// super.onDestroy();
	// try
	// {
	// this._director.b(this.F);
	// if (this.C != null)
	// synchronized (this.C)
	// {
	// if (this.C != null)
	// {
	// this.C.a(true);
	// this.C = null;
	// }
	// }
	// }
	// catch (Exception localException)
	// {
	// Ln.e(localException);
	// }
	// }
	//
	// protected void onPause()
	// {
	// super.onPause();
	// }
	//
	// protected void onRestart()
	// {
	// try
	// {
	// super.onRestart();
	// j();
	// return;
	// }
	// catch (Exception localException)
	// {
	// while (true)
	// Ln.e(localException);
	// }
	// }
	//
	// protected void onResume()
	// {
	// super.onResume();
	// try
	// {
	// if ((this._director.r()) && (this._director.F()) && (this._director.n()))
	// k();
	// while (true)
	// {
	// j();
	// break;
	// l();
	// }
	// }
	// catch (Exception localException)
	// {
	// Ln.e(localException);
	// }
	// }
	//
	// protected void onSaveInstanceState(Bundle paramBundle)
	// {
	// super.onSaveInstanceState(paramBundle);
	// paramBundle.putString("LastProgressMessage", this.e);
	// }
	//
	// protected void onStop()
	// {
	// super.onStop();
	// l();
	// }
	//
	// public void onUpdateClicked(View paramView)
	// {
	// try
	// {
	// if ((this._director.G()) || (this._director.n()))
	// return;
	// if (!this._director.F())
	// {
	// Ln.a("Not updating project since director is not authenticated.", new
	// Object[0]);
	// a(null, getString(2131165284));
	// }
	// }
	// catch (Exception localException)
	// {
	// Ln.e(localException);
	// j();
	// }
	// this.A.setEnabled(false);
	// this.C = new ConfigActivity.UpdateProjectTask(this, null);
	// this.C.g();
	// }
	@Override
	protected View a_() {
		// TODO Auto-generated method stub
		return null;
	}
}
