package com.zd.home.ui;

import roboguice.activity.RoboActivity;
import roboguice.util.Ln;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

import com.google.inject.Inject;
import com.zd.home.service.PreferenceService;

public class HomeControlActivity extends RoboActivity {
	public static final int I = 4;

	@Inject
	protected PreferenceService _preferences;

	private void b(View paramView) {
		try {
			paramView.setBackgroundDrawable(null);
		} catch (Exception localException1) {
			// try
			// {
			// while (true)
			// {
			// if ((paramView instanceof ImageView))
			// ((ImageView)paramView).setImageDrawable(null);
			// return;
			//
			// }
			// }
			// catch (Exception localException2)
			// {
			//
			// }
		}
	}

	public String J() {
		String str = "0.8";
		try {
			str = getBaseContext().getPackageManager().getPackageInfo(
					getBaseContext().getPackageName(), 0).versionName;
			return str;
		} catch (Exception localException) {
			while (true)
				Ln.e("Error getting application version", new Object[0]);
		}
	}

	public void toMainActivity() {
		try {
			Intent localIntent = new Intent(this, HomeActivity.class);
			localIntent.setFlags(67108864);
			startActivity(localIntent);
			return;
		} catch (Exception localException) {
			Ln.e(localException);
		}
	}

	protected void a(View paramView) {
		if (paramView != null)
			try {
				if ((paramView instanceof ViewGroup)) {
					ViewGroup localViewGroup = (ViewGroup) paramView;
					int i = localViewGroup.getChildCount();
					for (int j = 0; j < i; j++)
						a(localViewGroup.getChildAt(j));
				}
			} catch (Exception localException) {
				b(paramView);
			}
	}

	protected void onCreate(Bundle paramBundle) {
		super.onCreate(paramBundle);
		// if (((this instanceof HomeActivity)) && (this._preferences.j()))
		// CustomLogPrint.b();
	}

	protected void onDestroy() {
		super.onDestroy();
		System.gc();
	}

}
