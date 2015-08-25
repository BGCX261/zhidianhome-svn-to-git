package com.zd.home.ui;

import roboguice.activity.RoboActivity;
import android.os.Bundle;
import android.os.Handler;

public class LandscapeRefreshActivity extends RoboActivity {
	private final Handler a = new Handler();

	protected void onCreate(Bundle paramBundle) {
		super.onCreate(paramBundle);
		setContentView(2130903090);
	}

	protected void onStart() {
		super.onStart();
		// Ln.a("Landscape Refresh Activity Started.", new Object[0]);
		// this.a.postDelayed(new LandscapeRefreshActivity.1(this), 2000L);
	}
}
