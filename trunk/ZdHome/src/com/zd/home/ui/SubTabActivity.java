package com.zd.home.ui;

import roboguice.util.Ln;
import android.os.Bundle;

public class SubTabActivity extends HomeControlActivity {
	public static final CharSequence i = "My Home";
	private String a;
	protected TabActivityGroup h;

	public void a(TabActivityGroup paramTabActivityGroup) {
		this.h = paramTabActivityGroup;
	}

	public void a(String paramString) {
		this.a = paramString;
	}

	public TabActivityGroup j() {
		return this.h;
	}

	public String k() {
		return this.a;
	}

	public void onBackPressed() {
		try {
			if (this.h != null)
				this.h.onBackPressed();
			else
				super.onBackPressed();
		} catch (Exception localException) {
			Ln.e(localException);
		}
	}

	protected void onCreate(Bundle paramBundle) {
		super.onCreate(paramBundle);
		setTitle(i);
	}

	protected void onDestroy() {
		super.onDestroy();
	}

	protected void onPause() {
		super.onPause();
		System.gc();
	}

	protected void onResume() {
		System.gc();
		super.onResume();
	}

	protected void onStop() {
		super.onStop();
		System.gc();
	}
}
