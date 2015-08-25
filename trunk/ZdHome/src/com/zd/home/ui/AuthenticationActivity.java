package com.zd.home.ui;

import roboguice.util.Ln;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.google.inject.Inject;
import com.zd.model.Director;

public class AuthenticationActivity extends NavigationActivity {

	@Inject
	private Director _director;
	private TextView a;
	private View b;
	private ProgressBar c;

	private void b(boolean paramBoolean) {
		try {
			this.n.setEnabled(paramBoolean);
			this.o.setEnabled(paramBoolean);
			this.p.setEnabled(paramBoolean);
			this.k.setEnabled(paramBoolean);
			this.q.setEnabled(paramBoolean);
			return;
		} catch (Exception localException) {
			while (true)
				Ln.e(localException);
		}
	}

	protected View a_() {
		return LayoutInflater.from(this).inflate(2130903047, null);
	}

	protected void h() {
		super.h();
		// runOnUiThread(new AuthenticationActivity.2(this));
	}

	public void j() {
		try {
			if (this._director.F()) {
				this.a.setText(2131165457);
				this.b.setVisibility(4);
				b(true);
			} else {
				this.a.setText(2131165456);
				this.b.setVisibility(0);
				b(false);
			}
		} catch (Exception localException) {
			Ln.e(localException);
		}
	}

	public void onCreate(Bundle paramBundle) {
		super.onCreate(paramBundle);
		this.a = ((TextView) findViewById(2131558439));
		this.b = findViewById(2131558440);
		this.c = ((ProgressBar) findViewById(2131558427));
		j();
	}

	protected void onDestroy() {
		super.onDestroy();
		if ((this._director.r()) && (!this._director.F()))
			this._director.x();
	}

	public void onIdentifyClicked(View paramView) {
		this.c.setVisibility(0);
		// this._director.a(new AuthenticationActivity.1(this));
	}

	protected void onResume() {
		super.onResume();
		j();
	}

	public void onTestWebServiceClicked(View paramView) {
		this._director.O();
	}
}
