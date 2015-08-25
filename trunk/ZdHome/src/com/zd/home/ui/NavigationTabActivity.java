package com.zd.home.ui;

import roboguice.util.Ln;
import android.app.LocalActivityManager;
import android.os.Bundle;
import android.view.View;
import android.widget.TabHost;
import android.widget.TabWidget;

public abstract class NavigationTabActivity extends NavigationActivity
		implements TabHost.OnTabChangeListener,
		TabActivityGroup.OnTabActivityGroupListener {
	protected static final String A = "tabActivityName";
	protected static final String B = "activeTab";
	private static final String a = "states";
	protected static final String e = "numTabActivities";
	protected static final String f = "tabActivityIntent";
	protected TabHost tabhost;
	protected TabWidget D;
	protected LocalActivityManager E;

	public void a(TabActivityGroup paramTabActivityGroup, View paramView1,
			View paramView2, boolean paramBoolean) {
		try {
			i_();
			if ((paramBoolean) && (paramView1 != null)) {
				Object localObject = paramView2.getContext();
				if ((localObject != null)
						&& ((localObject instanceof SubTabActivity))) {
					localObject = (SubTabActivity) localObject;
					this.E.destroyActivity(((SubTabActivity) localObject).k(),
							true);
				}
			}
			return;
		} catch (Exception localException) {
			while (true)
				Ln.e(localException);
		}
	}

	protected View a_() {
		return null;
	}

	protected void h() {
		try {

			TabActivityGroup localTabActivityGroup = m();
			if (localTabActivityGroup != null) {
				;
				localTabActivityGroup.d();
			}
			return;
		} catch (Exception localException) {
			while (true)
				Ln.e(localException);
		}
	}

	public TabActivityGroup m() {
		Object localObject2 = null;
		try {
			if (this.tabhost != null) {

				if (this.tabhost.getCurrentView() != null) {
					Object localObject1 = this.tabhost.getCurrentView()
							.getContext();
					if ((localObject1 instanceof TabActivityGroup))
						localObject2 = (TabActivityGroup) localObject1;
					else
						localObject2 = null;
				}
			}
		} catch (Exception e) {

		}
		return (TabActivityGroup) localObject2;
	}

	public void onBackPressed() {
		TabActivityGroup localTabActivityGroup = m();
		if (localTabActivityGroup == null)
			super.onBackPressed();
		else
			localTabActivityGroup.onBackPressed();
	}

	public void onCreate(Bundle paramBundle) {
		super.onCreate(paramBundle);
		try {
			this.E = new LocalActivityManager(this, true);
			if (paramBundle != null)
				;
			{
				Bundle localBundle = paramBundle.getBundle("states");
				this.E.dispatchCreate(localBundle);
				this.tabhost = ((TabHost) findViewById(16908306));
				this.D = ((TabWidget) findViewById(16908307));
				if (this.tabhost != null) {
					this.tabhost.setup(this.E);
					this.tabhost.setOnTabChangedListener(this);
				}
				return;
			}
		} catch (Exception localException) {

		}
	}

	protected void onDestroy() {
		try {
			TabActivityGroup localTabActivityGroup = m();
			if ((localTabActivityGroup != null)
					&& (localTabActivityGroup.b() == this))
				localTabActivityGroup.a();
			if (this.tabhost != null) {
				this.tabhost.clearAllTabs();
				this.tabhost = null;
			}
			if (this.D != null) {
				this.D.removeAllViews();
				this.D = null;
			}
			if (this.E != null)
				this.E.removeAllActivities();
			return;
		} catch (Exception localException) {

		} finally {
			super.onDestroy();
		}

	}

	public void onNavBackClicked(View paramView) {
		try {
			TabActivityGroup localTabActivityGroup = m();
			if (localTabActivityGroup != null)
				localTabActivityGroup.a();
			else
				super.onNavBackClicked(paramView);
		} catch (Exception localException) {
			Ln.e(localException);
		}
	}

	protected void onPause() {
		try {
			TabActivityGroup localTabActivityGroup = m();
			if (localTabActivityGroup != null)
				localTabActivityGroup.onPause();
			super.onPause();
			return;
		} catch (Exception localException) {
			while (true)
				Ln.e(localException);
		}
	}

	protected void onPostCreate(Bundle paramBundle) {
		super.onPostCreate(paramBundle);

		try {
			TabActivityGroup localTabActivityGroup = m();
			// if (localTabActivityGroup == null)
			// continue;
			// localTabActivityGroup.a(this);
			// if (paramBundle != null) {
			// i = paramBundle.getInt("numTabActivities");
			// String str = paramBundle.getString("tabActivityName");
			// j = i;
			// break label132;
			// if (i >= j)
			// continue;
			// Intent localIntent = (Intent) paramBundle
			// .getParcelable("tabActivityIntent" + i);
			// if (localIntent == null)
			// break label143;
			// localTabActivityGroup.a(localIntent, str + i);
			// }
		} catch (Exception localException) {
			Ln.e(localException);

		} finally {
		}

	}

	protected void onResume() {
		try {

			TabActivityGroup localTabActivityGroup = m();
			if (localTabActivityGroup != null) {

				localTabActivityGroup.onResume();
			}
			super.onResume();
			return;
		} catch (Exception localException) {
			while (true)
				Ln.e(localException);
		}
	}

	protected void onSaveInstanceState(Bundle paramBundle) {
		super.onSaveInstanceState(paramBundle);
		// if (paramBundle != null)
		// {
		// try {
		// if (this.C == null)
		// break;
		// paramBundle.putInt("activeTab", this.C.getCurrentTab());
		// TabActivityGroup localTabActivityGroup = m();
		// if (localTabActivityGroup == null)
		// break;
		// paramBundle.putString("tabActivityName",
		// localTabActivityGroup.getLocalClassName());
		// Object localObject = localTabActivityGroup.a;
		// if ((localObject == null)
		// || (((ArrayList) localObject).size() <= 1))
		// break;
		// paramBundle.putInt("numTabActivities",
		// ((ArrayList) localObject).size());
		// int i = 0;
		// localObject = ((ArrayList) localObject).iterator();
		// if (!((Iterator) localObject).hasNext())
		// break;
		// Context localContext = ((View) ((Iterator) localObject)
		// .next()).getContext();
		// if ((localContext != null)
		// && ((localContext instanceof Activity))) {
		// Intent localIntent = ((Activity) localContext)
		// .getIntent();
		// StringBuilder localStringBuilder = new StringBuilder()
		// .append("tabActivityIntent");
		// int j = i + 1;
		// paramBundle.putParcelable(i, localIntent);
		// i = j;
		// continue;
		// }
		// } catch (Exception localException) {
		// Ln.e(localException);
		// }
		// int k = localException;
		// }
	}

	protected void onStop() {
		try {
			TabActivityGroup localTabActivityGroup = m();
			if (localTabActivityGroup != null)
				localTabActivityGroup.onStop();
			super.onStop();
			return;
		} catch (Exception localException) {
			while (true)
				Ln.e(localException);
		}
	}

	public void onTabChanged(String paramString) {
		TabActivityGroup localTabActivityGroup = m();
		if (localTabActivityGroup != null) {
			localTabActivityGroup.a(this);
			localTabActivityGroup.onResume();
		}
		i_();
	}
}
