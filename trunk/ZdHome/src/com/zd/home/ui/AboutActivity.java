package com.zd.home.ui;

import roboguice.util.Ln;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.google.inject.Inject;
import com.zd.model.Director;

public class AboutActivity extends NavigationActivity {

	@Inject
	private Director _director;
	private TextView a;
	private TextView b;
	private TextView c;
	private TextView d;
	private TextView e;

	private void j() {
		// while (true)
		// {
		// try
		// {
		// Object localObject1 = "0.8";
		// try
		// {
		// localObject1 =
		// getBaseContext().getPackageManager().getPackageInfo(getBaseContext().getPackageName(),
		// 0).versionName;
		// this.d.setText((CharSequence)localObject1);
		// localObject1 = Installation.a(getBaseContext());
		// if (localObject1 == null)
		// continue;
		// this.a.setText((CharSequence)localObject1);
		// if (this._director == null)
		// continue;
		// localObject1 = this._director.k();
		// if (localObject1 == null)
		// continue;
		// this.b.setText((CharSequence)localObject1);
		// Object localObject2 = this._director.d();
		// str = this._director.f();
		// if ((localObject2 == null) || (((String)localObject2).length() <= 0))
		// continue;
		// localObject1 = this.c;
		// localObject2 = new
		// StringBuilder().append((String)localObject2).append(" - ");
		// if (str == null)
		// break label310;
		// ((TextView)localObject1).setText(str);
		// localObject2 = this._director.g();
		// str = this._director.h();
		// if ((localObject2 == null) || (((String)localObject2).length() <= 0))
		// continue;
		// localObject1 = this.e;
		// localObject2 = new
		// StringBuilder().append((String)localObject2).append(" - ");
		// if (str == null)
		// break label316;
		// ((TextView)localObject1).setText(str);
		// }
		// catch (Exception localException2)
		// {
		// Ln.e("Error getting application version", new Object[0]);
		// continue;
		// }
		// }
		// catch (Exception localException1)
		// {
		// Ln.e(localException1);
		// break label309;
		// this.b.setText("");
		// continue;
		// this.c.setText("");
		// continue;
		// this.e.setText("");
		// break label309;
		// this.b.setText("");
		// this.c.setText("");
		// this.e.setText("");
		// }
		// label309: return;
		// label310: String str = "";
		// continue;
		// label316: str = "";
		// }
	}

	protected View a_() {
		return LayoutInflater.from(this).inflate(2130903040, null);
	}

	protected boolean b() {
		return false;
	}

	public void onCreate(Bundle paramBundle) {
		super.onCreate(paramBundle);
		try {
			// this._director.a(new AboutActivity.1(this));
			this.a = ((TextView) findViewById(2131558402));
			this.b = ((TextView) findViewById(2131558406));
			this.c = ((TextView) findViewById(2131558408));
			this.d = ((TextView) findViewById(2131558404));
			this.e = ((TextView) findViewById(2131558410));
			j();
			return;
		} catch (Exception localException) {
			while (true)
				Ln.e(localException);
		}
	}

	protected void onResume() {
		super.onResume();
		j();
	}
}
