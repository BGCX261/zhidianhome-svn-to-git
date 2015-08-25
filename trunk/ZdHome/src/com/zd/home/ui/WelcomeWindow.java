package com.zd.home.ui;

import roboguice.util.Ln;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;

import com.zd.home.R;
import com.zd.model.Director;
import com.zd.model.Navigator;

public class WelcomeWindow {
	private final PopupWindow a;
	private final WindowManager b;
	private final LinearLayout c;
	private boolean d = false;

	public WelcomeWindow(Activity paramActivity, Director paramDirector,
			Navigator paramNavigator) {
		this.a = new PopupWindow(paramActivity);
		this.b = ((WindowManager) paramActivity.getSystemService("window"));
		this.c = ((LinearLayout) ((LayoutInflater) paramActivity
				.getSystemService("layout_inflater")).inflate(
				R.layout.welcome_activity, null));
		this.a.setContentView(this.c);
		this.a.setTouchable(true);
		this.a.setFocusable(true);
		this.a.setOutsideTouchable(false);
		this.a.setTouchInterceptor(new OnTouchListener() {

			@Override
			public boolean onTouch(View v, MotionEvent event) {
				// TODO Auto-generated method stub
				return false;
			}
		});
		this.a.setOnDismissListener(new OnDismissListener() {

			@Override
			public void onDismiss() {
				// TODO Auto-generated method stub

			}
		});
		Object localObject = new BitmapFactory.Options();
		((BitmapFactory.Options) localObject).inDither = true;
		((BitmapFactory.Options) localObject).inPreferredConfig = Bitmap.Config.RGB_565;
		localObject = BitmapFactory.decodeResource(
				paramActivity.getResources(), 2130837833,
				(BitmapFactory.Options) localObject);
		localObject = new BitmapDrawable(paramActivity.getResources(),
				(Bitmap) localObject);
		this.c.findViewById(R.id.welcome_body_layout).setBackgroundDrawable(
				(Drawable) localObject);
		this.c.findViewById(R.id.welcome_video_button).setOnClickListener(
				new OnClickListener() {

					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub

					}
				});
		this.c.findViewById(R.id.welcome_test_button).setOnClickListener(
				new OnClickListener() {

					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub

					}
				});
		this.c.findViewById(R.id.welcome_like_button).setOnClickListener(
				new OnClickListener() {

					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub

					}
				});
		this.c.findViewById(R.id.welcome_config_button).setOnClickListener(
				new OnClickListener() {

					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub

					}
				});
	}

	public void a() {
		if (this.a != null)
			this.a.dismiss();
	}

	public boolean b() {
		boolean bool = false;
		try {
			if (this.a != null) {
				bool = this.a.isShowing();
				bool = bool;
			}
		} catch (Exception localException) {
			Ln.e(localException);
		}
		return bool;
	}

	public void show(View paramView) {
		this.c.measure(View.MeasureSpec.makeMeasureSpec(400, -2147483648),
				View.MeasureSpec.makeMeasureSpec(800, -2147483648));
		this.a.setWidth(this.c.getMeasuredWidth());
		this.a.setHeight(this.c.getMeasuredHeight());
		int j = (this.b.getDefaultDisplay().getWidth() - this.c
				.getMeasuredWidth()) / 2;
		int i = (this.b.getDefaultDisplay().getHeight() - this.c
				.getMeasuredHeight()) / 2;
		this.a.showAtLocation(paramView, 0, j, i);
	}
}
