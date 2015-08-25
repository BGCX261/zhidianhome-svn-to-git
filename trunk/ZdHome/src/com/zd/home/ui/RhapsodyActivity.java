package com.zd.home.ui;

public abstract class RhapsodyActivity extends NavigationActivity {
	// protected static final int f;
	// protected final Rhapsody.RhapsodyListener A = new
	// RhapsodyActivity.1(this);
	// private Dialog a;
	//
	// protected void b(boolean paramBoolean)
	// {
	// }
	//
	// protected boolean c()
	// {
	// return true;
	// }
	//
	// protected void n()
	// {
	// }
	//
	// protected void o()
	// {
	// }
	//
	// protected Dialog onCreateDialog(int paramInt)
	// {
	// Object localObject;
	// switch (paramInt)
	// {
	// default:
	// localObject = super.onCreateDialog(paramInt);
	// break;
	// case 0:
	// Dialog localDialog = new Dialog(this);
	// localDialog.setContentView(2130903099);
	// localDialog.setTitle(getResources().getString(2131165364));
	// TextView localTextView3 = (TextView)localDialog.findViewById(2131558626);
	// TextView localTextView2 = (TextView)localDialog.findViewById(2131558627);
	// Button localButton = (Button)localDialog.findViewById(2131558628);
	// TextView localTextView1 = (TextView)localDialog.findViewById(2131558629);
	// ProgressBar localProgressBar =
	// (ProgressBar)localDialog.findViewById(2131558434);
	// Rhapsody localRhapsody = this._director.Q();
	// localObject = localRhapsody.k();
	// if (localObject == null)
	// {
	// localTextView1.setText("");
	// localTextView1.setVisibility(4);
	// }
	// else
	// {
	// localTextView1.setText((CharSequence)localObject);
	// localTextView1.setVisibility(0);
	// }
	// localButton.setOnClickListener(new RhapsodyActivity.2(this,
	// localProgressBar, localTextView3, localTextView2, localRhapsody));
	// localDialog.setOnCancelListener(new RhapsodyActivity.3(this));
	// this.a = localDialog;
	// localObject = localDialog;
	// }
	// return (Dialog)localObject;
	// }
	//
	// protected void onDestroy()
	// {
	// try
	// {
	// this._director.Q().b(this.A);
	// super.onDestroy();
	// return;
	// }
	// catch (Exception localException)
	// {
	// while (true)
	// Ln.e(localException);
	// }
	// }
	//
	// protected void onPause()
	// {
	// try
	// {
	// Rhapsody localRhapsody = this._director.Q();
	// if (localRhapsody != null)
	// localRhapsody.b(this.A);
	// super.onPause();
	// return;
	// }
	// catch (Exception localException)
	// {
	// while (true)
	// Ln.e(localException);
	// }
	// }
	//
	// protected void onPrepareDialog(int paramInt, Dialog paramDialog)
	// {
	// switch (paramInt)
	// {
	// case 0:
	// TextView localTextView = (TextView)paramDialog.findViewById(2131558629);
	// String str = this._director.Q().k();
	// if (str == null)
	// {
	// localTextView.setText("");
	// localTextView.setVisibility(4);
	// }
	// else
	// {
	// localTextView.setText(str);
	// localTextView.setVisibility(0);
	// }
	// this.a = paramDialog;
	// }
	// super.onPrepareDialog(paramInt, paramDialog);
	// }
	//
	// protected void onResume()
	// {
	// super.onResume();
	// p();
	// }
	//
	// public void p()
	// {
	// try
	// {
	// localObject = this._director.Q();
	// ((Rhapsody)localObject).a(this.A);
	// RhapsodyUser localRhapsodyUser = ((Rhapsody)localObject).f();
	// if (localRhapsodyUser == null)
	// b(true);
	// while (true)
	// {
	// if ((((Rhapsody)localObject).i()) || (localRhapsodyUser != null))
	// return;
	// if (((Rhapsody)localObject).x_())
	// break;
	// if (((Rhapsody)localObject).i())
	// return;
	// ((Rhapsody)localObject).c(this.A);
	// return;
	// b(false);
	// }
	// }
	// catch (Exception localTextView)
	// {
	// Object localObject;
	// Ln.e(localException);
	// return;
	// if (c())
	// if ((this.a == null) || (!this.a.isShowing()))
	// {
	// showDialog(0);
	// }
	// else
	// {
	// TextView localTextView = (TextView)this.a.findViewById(2131558629);
	// ProgressBar localProgressBar =
	// (ProgressBar)this.a.findViewById(2131558434);
	// localObject = ((Rhapsody)localObject).k();
	// if (localObject != null)
	// {
	// localTextView.setText((CharSequence)localObject);
	// localTextView.setVisibility(0);
	// }
	// while (localProgressBar != null)
	// {
	// localProgressBar.setVisibility(4);
	// break;
	// localTextView.setText("");
	// localTextView.setVisibility(4);
	// }
	// }
	// }
	// }
}
