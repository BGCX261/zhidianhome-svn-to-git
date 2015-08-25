package com.zd.home.ui;

import roboguice.inject.InjectView;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.OnClickListener;

import com.google.inject.Inject;
import com.zd.home.R;
import com.zd.model.Director;
import com.zd.model.Navigator;

public class WelcomeActivity extends HomeControlActivity {
	@Inject
	private Director _director;

	@Inject
	private Navigator _navigator;

	static Navigator a(WelcomeActivity welcomeactivity) {
		return welcomeactivity._navigator;
	}

	static Director b(WelcomeActivity welcomeactivity) {
		return welcomeactivity._director;
	}

	public void onBackPressed() {
		moveTaskToBack(true);
		finish();
	}

	@InjectView(R.id.welcome_body_layout)
	public void onCreate(Bundle paramBundle) {
		super.onCreate(paramBundle);
		setContentView(R.layout.welcome_activity);
		BitmapFactory.Options localObject = new BitmapFactory.Options();
		localObject.inDither = true;
		localObject.inPreferredConfig = Bitmap.Config.RGB_565;
		if (this._navigator.H()) {
			DisplayMetrics localDisplayMetrics = new DisplayMetrics();
			getWindowManager().getDefaultDisplay().getMetrics(
					localDisplayMetrics);
			this._navigator.a(localDisplayMetrics, getResources()
					.getConfiguration(), J());
		}
		findViewById(R.id.welcome_test_button).setOnClickListener(
				new OnClickListener() {

					@Override
					public void onClick(View v) {
						WelcomeActivity.a(WelcomeActivity.this).a(false);
						WelcomeActivity.b(WelcomeActivity.this).d(true);
						WelcomeActivity.this.finish();

					}
				});
		findViewById(R.id.welcome_video_button).setOnClickListener(
				new OnClickListener() {

					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub

					}
				});
		findViewById(R.id.welcome_like_button).setOnClickListener(
				new OnClickListener() {

					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub

					}
				});
		findViewById(R.id.welcome_config_button).setOnClickListener(
				new OnClickListener() {

					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub

					}
				});
	}

	protected void onPause() {
		super.onPause();
		this._navigator.s();
	}

	protected void onResume() {
		super.onResume();
		this._navigator.t();
	}
}
