package com.zd.home.ui;

import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.PopupWindow;

import com.zd.model.CustomButtonScreen;

public class CustomButtonWindow {
	private int[] a;
	private int[] b;
	private PopupWindow c;
	private WindowManager d;
	private LinearLayout e;
	private Button f;
	private Button g;
	private PopupWindow.OnDismissListener h;
	private PopupWindow.OnDismissListener i;

	public CustomButtonWindow(Context paramContext, int paramInt) {
		int[] arrayOfInt = new int[5];
		arrayOfInt[0] = 2131558503;
		arrayOfInt[1] = 2131558505;
		arrayOfInt[2] = 2131558507;
		arrayOfInt[3] = 2131558509;
		arrayOfInt[4] = 2131558511;
		this.a = arrayOfInt;
		arrayOfInt = new int[6];
		arrayOfInt[0] = 2131558495;
		arrayOfInt[1] = 2131558504;
		arrayOfInt[2] = 2131558506;
		arrayOfInt[3] = 2131558508;
		arrayOfInt[4] = 2131558510;
		arrayOfInt[5] = 2131558512;
		this.b = arrayOfInt;
		// this.i = new CustomButtonWindow.1(this);
		// this.c = new PopupWindow(paramContext);
		// this.d = ((WindowManager)paramContext.getSystemService("window"));
		// this.e =
		// ((LinearLayout)((LayoutInflater)paramContext.getSystemService("layout_inflater")).inflate(paramInt,
		// null));
		// this.f = ((Button)this.e.findViewById(2131558501));
		// this.g = ((Button)this.e.findViewById(2131558514));
		// this.f.setOnClickListener(new CustomButtonWindow.2(this));
		// this.g.setOnClickListener(new CustomButtonWindow.3(this));
		// this.c.setContentView(this.e);
		// this.c.setTouchable(true);
		// this.c.setFocusable(true);
		// this.c.setOutsideTouchable(true);
		// this.c.setBackgroundDrawable(paramContext.getResources().getDrawable(2130838065));
		// this.c.setTouchInterceptor(new CustomButtonWindow.4(this));
		// this.c.setOnDismissListener(this.i);
	}

	public void a(View paramView, CustomButtonScreen paramCustomButtonScreen,
			PopupWindow.OnDismissListener paramOnDismissListener) {
		int j = 1;
		this.h = paramOnDismissListener;
		Object localObject2;
		Object localObject1;
		if (paramCustomButtonScreen != null) {
			localObject2 = this.e.findViewById(2131558502);
			if (localObject2 != null)
				((View) localObject2).setVisibility(8);
			localObject1 = this.e.findViewById(2131558513);
			if (localObject1 != null)
				((View) localObject1).setVisibility(8);
		}
		// Object localObject3;
		// for (int m = 0; ; localObject3++)
		// {
		// if (m >= this.a.length)
		// for (m = 0; ; localObject3++)
		// {
		// if (m >= this.b.length)
		// {
		// int i1 = paramCustomButtonScreen.d();
		// this.f.setText(paramCustomButtonScreen.b());
		// this.g.setText(paramCustomButtonScreen.b());
		// for (m = 0; ; localObject3++)
		// {
		// if (m >= i1)
		// {
		// localObject3 = new int[2];
		// paramView.getLocationOnScreen(localObject3);
		// localObject3 = new Rect(localObject3[0], localObject3[j],
		// localObject3[0] + paramView.getWidth(), localObject3[j] +
		// paramView.getHeight());
		// int n;
		// if (((Rect)localObject3).top >=
		// this.d.getDefaultDisplay().getHeight() / 2)
		// n = 0;
		// else
		// n = j;
		// if (((Rect)localObject3).left >=
		// this.d.getDefaultDisplay().getWidth() / 2)
		// j = 0;
		// if (n == 0)
		// {
		// localObject1 = this.f;
		// if (j == 0)
		// j = 2130837803;
		// else
		// j = 2130837802;
		// ((Button)localObject1).setBackgroundResource(j);
		// this.f.setVisibility(0);
		// this.g.setVisibility(8);
		// if (localObject2 != null)
		// ((View)localObject2).setVisibility(0);
		// this.c.setAnimationStyle(2131361848);
		// }
		// else
		// {
		// localObject2 = this.g;
		// if (j == 0)
		// j = 2130837806;
		// else
		// j = 2130837805;
		// ((Button)localObject2).setBackgroundResource(j);
		// this.g.setVisibility(0);
		// if (localObject1 != null)
		// ((View)localObject1).setVisibility(0);
		// this.f.setVisibility(8);
		// this.c.setAnimationStyle(2131361847);
		// }
		// this.e.measure(View.MeasureSpec.makeMeasureSpec(this.d.getDefaultDisplay().getWidth(),
		// -2147483648),
		// View.MeasureSpec.makeMeasureSpec(this.d.getDefaultDisplay().getHeight(),
		// -2147483648));
		// j = this.e.getMeasuredHeight();
		// int k;
		// if (n == 0)
		// k = ((Rect)localObject3).bottom - j;
		// else
		// k = ((Rect)localObject3).top;
		// this.c.setWidth(paramView.getWidth());
		// this.c.setHeight(j);
		// this.c.showAtLocation(paramView, 0, ((Rect)localObject3).left, k);
		// return;
		// }
		// CustomButton localCustomButton =
		// paramCustomButtonScreen.c(localObject3);
		// if (localObject3 < i1 - 1)
		// this.e.findViewById(this.a[localObject3]).setVisibility(0);
		// Button localButton =
		// (Button)this.e.findViewById(this.b[localObject3]);
		// localButton.setVisibility(0);
		// localButton.setText(localCustomButton.b());
		// localButton.setOnTouchListener(new CustomButtonWindow.5(this,
		// localCustomButton));
		// }
		// }
		// ((Button)this.e.findViewById(this.b[localObject3])).setVisibility(8);
		// }
		// this.e.findViewById(this.a[localObject3]).setVisibility(8);
		// }
	}
}
