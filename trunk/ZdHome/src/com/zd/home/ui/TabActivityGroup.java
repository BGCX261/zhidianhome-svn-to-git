package com.zd.home.ui;

import java.util.ArrayList;

import roboguice.util.Ln;
import android.app.Activity;
import android.app.ActivityGroup;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

public class TabActivityGroup extends ActivityGroup {
	public interface OnTabActivityGroupListener {
		public abstract void a(TabActivityGroup paramTabActivityGroup,
				View paramView1, View paramView2, boolean paramBoolean);

	}

	protected ArrayList<View> a;
	protected boolean b = true;
	protected TabActivityGroup.OnTabActivityGroupListener c = null;

	private void b(View paramView) {
		try {
			paramView.setBackgroundDrawable(null);
		} catch (Exception localException1) {
		}
	}

	public void a() {
		try {
			if (this.a.size() > 1) {
				View localView1 = (View) this.a.remove(-1 + this.a.size());
				View localView2 = (View) this.a.get(-1 + this.a.size());
				Context localContext = localView2.getContext();
				if ((localContext != null)
						&& ((localContext instanceof SubTabActivity)))
					((SubTabActivity) localContext).a(this);
				setContentView(localView2);
				if (this.c != null)
					this.c.a(this, localView1, localView2, true);
			} else {
				finish();
			}
		} catch (Exception localException) {
			Ln.e(localException);
		}
	}

	public void a(Intent paramIntent, String paramString) {
		try {
			View localView = getLocalActivityManager().startActivity(
					paramString, paramIntent.addFlags(67108864)).getDecorView();
			Object localObject = localView.getContext();
			if ((localObject != null)
					&& ((localObject instanceof SubTabActivity))) {
				localObject = (SubTabActivity) localObject;
				((SubTabActivity) localObject).a(this);
				((SubTabActivity) localObject).a(paramString);
			}
			push(localView);
			return;
		} catch (Exception localException) {
			while (true)
				Ln.e(localException);
		}
	}

	protected void a(View paramView) {
		if (paramView != null)
			try {
				if ((paramView instanceof ViewGroup)) {
					ViewGroup localViewGroup = (ViewGroup) paramView;
					int j = localViewGroup.getChildCount();
					for (int i = 0; i < j; i++)
						a(localViewGroup.getChildAt(i));
				}
			} catch (Exception localException) {
				b(paramView);
			}
	}

	public void a(
			TabActivityGroup.OnTabActivityGroupListener paramOnTabActivityGroupListener) {
		this.c = paramOnTabActivityGroupListener;
	}

	public TabActivityGroup.OnTabActivityGroupListener b() {
		return this.c;
	}

	public Activity c() {
		Object localObject1 = null;
		try {
			if (this.a.size() > 0) {
				localObject1 = ((View) this.a.get(-1 + this.a.size()))
						.getContext();
				if (!(localObject1 instanceof Activity))
					return null;
			}

			return (Activity) localObject1;
		} catch (Exception localObject2) {

		}

		return null;
	}

	public void d() {

		try {
			Object localObject = c();
			if ((localObject instanceof NavigationActivity)) {
				localObject = (NavigationActivity) localObject;
				((NavigationActivity) localObject).h();
			} else if (localObject == null) {

				onBackPressed();
			}
		} catch (Exception localException) {
			Ln.e(localException);
		}
	}

	public void e() {
		try {
			Intent localIntent = new Intent(this, HomeActivity.class);
			localIntent.setFlags(67108864);
			startActivity(localIntent);
			return;
		} catch (Exception localException) {
			while (true)
				Ln.e(localException);
		}
	}

	public void onBackPressed() {
		a();
	}

	protected void onCreate(Bundle paramBundle) {
		super.onCreate(paramBundle);
		this.a = new ArrayList();
	}

	protected void onDestroy() {
		super.onDestroy();
		System.gc();
	}

	protected void onPause() {
		super.onPause();
		System.gc();
	}

	protected void onResume() {
		System.gc();
		super.onResume();
		View localView = null;
		try {
			if ((this.a != null) && (this.a.size() > 0))
				localView = (View) this.a.get(0);

			return;
		} catch (Exception localException) {
			while (true)
				Ln.e(localException);
		}
	}

	protected void onStop() {
		super.onStop();
		System.gc();
	}

	public void push(View paramView) {
		if (paramView == null)
			return;

		View localView = null;
		try {
			if ((this.b) && (this.a != null) && (this.a.size() > 0))
				localView = (View) this.a.get(-1 + this.a.size());
			if (this.b)
				this.a.add(paramView);
			setContentView(paramView);
			if (this.c != null)
				this.c.a(this, localView, paramView, false);
		} catch (Exception localException) {

		}
	}

}
