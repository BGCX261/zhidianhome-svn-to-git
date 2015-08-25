package com.zd.home.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;

import com.zd.home.R;
import com.zd.home.widget.RoomPicker;

public class RoomPickerWindow {
	private final PopupWindow a;
	private final WindowManager b;
	private final int c;
	private final RoomPicker d;

	public RoomPickerWindow(Context paramContext, int paramInt) {
		this.c = paramInt;
		this.a = new PopupWindow(paramContext);
		this.b = ((WindowManager) paramContext.getSystemService("window"));
		this.d = ((RoomPicker) ((LayoutInflater) paramContext
				.getSystemService("layout_inflater")).inflate(
				R.layout.room_picker, null));
		RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(
				-1, -2);
		this.d.setLayoutParams(localLayoutParams);
		this.a.setContentView(this.d);
		this.a.setTouchable(true);
		this.a.setFocusable(true);
		this.a.setOutsideTouchable(false);
		this.a.setAnimationStyle(R.anim.slide_in_bottom);
	}

	public RoomPicker a() {
		return this.d;
	}

	public void b() {
		this.a.dismiss();
	}

	public void show(View paramView) {
		int i = this.b.getDefaultDisplay().getHeight();
		this.d.measure(View.MeasureSpec.makeMeasureSpec(this.c, 1073741824),
				View.MeasureSpec.makeMeasureSpec(i, -2147483648));
		this.a.setWidth(this.d.getMeasuredWidth());
		this.a.setHeight(this.d.getMeasuredHeight());
		i -= this.d.getMeasuredHeight();
		this.a.showAtLocation(paramView, 0, 0, i);
	}
}
