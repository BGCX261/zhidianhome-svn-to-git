package com.zd.home.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.widget.Button;

public class AutoResizeButton extends Button {
	public static final float a = 2.0F;
	private static final Canvas b = new Canvas();
	private static final String c = "...";
	private OnTextResizeListener d;
	private boolean e = false;
	private float f = getTextSize();
	private float g = 0.0F;
	private float h = 2.0F;
	private float i = 1.0F;
	private float j = 0.0F;
	private boolean k = false;

	public AutoResizeButton(Context paramContext) {
		super(paramContext);
	}

	public AutoResizeButton(Context paramContext, AttributeSet paramAttributeSet) {
		super(paramContext, paramAttributeSet);
	}

	public AutoResizeButton(Context paramContext,
			AttributeSet paramAttributeSet, int paramInt) {
		super(paramContext, paramAttributeSet, paramInt);
	}

	private int a(CharSequence paramCharSequence, TextPaint paramTextPaint,
			int paramInt, float paramFloat) {
		paramTextPaint.setTextSize(paramFloat);
		StaticLayout localStaticLayout = new StaticLayout(paramCharSequence,
				paramTextPaint, paramInt, Layout.Alignment.ALIGN_NORMAL,
				this.i, this.j, true);
		localStaticLayout.draw(b);
		return localStaticLayout.getHeight();
	}

	private int f() {
		try {
			int m = getTotalPaddingBottom();
			int n = getTotalPaddingTop();
			m += n;
			return m;
		} catch (Exception localException) {

			return getPaddingTop() + getPaddingBottom();
		}
	}

	private int g() {
		try {
			int n = getTotalPaddingLeft() + getTotalPaddingRight();
			int m = getCompoundDrawablePadding();
			m = n + m;
			return m;
		} catch (Exception localException) {

			return getPaddingLeft() + getPaddingRight()
					+ getCompoundDrawablePadding();
		}
	}

	public float a() {
		return this.g;
	}

	public void a(int paramInt1, int paramInt2) {
		CharSequence localCharSequence = getText();
		TextPaint localTextPaint = null;
		float f1 = 0;
		int n = 0;
		float f2 = 0;
		float f3 = 0;
		if ((localCharSequence != null) && (localCharSequence.length() != 0)
				&& (paramInt2 > 0) && (paramInt1 > 0) && (this.f != 0.0F)) {
			localTextPaint = getPaint();
			f1 = localTextPaint.getTextSize();
			if (this.g <= 0.0F)
				f3 = this.f;
			else
				f3 = Math.min(this.f, this.g);
			n = a(localCharSequence, localTextPaint, paramInt1, f3);
			if (n <= paramInt2) {
				if (n < paramInt2)
					f2 = f3;
				while (true) {
					if ((n >= paramInt2) || (f2 >= this.g)) {
						if (n > paramInt2) {
							f2 = f3;
							f3 = n;
							break;
						}
						f3 = n;
						f2 = f2;
						break;
					}
					f2 = Math.min(f2 + 2.0F, this.g);
					n = a(localCharSequence, localTextPaint, paramInt1, f2);
				}
			}
			n = n;
			f2 = f3;
		}
		int m;
		for (f3 = n;; m = a(localCharSequence, localTextPaint, paramInt1, f2)) {
			if ((f3 <= paramInt2) || (f2 <= this.h)) {
				f2 = f2;
				if ((this.k) && (f2 == this.h) && (f3 > paramInt2)) {
					StaticLayout localStaticLayout = new StaticLayout(
							localCharSequence, localTextPaint, paramInt1,
							Layout.Alignment.ALIGN_NORMAL, this.i, this.j,
							false);
					localStaticLayout.draw(b);
					if (localStaticLayout.getLineCount() > 0) {
						int i1 = -1
								+ localStaticLayout
										.getLineForVertical(paramInt2);
						if (i1 >= 0) {
							m = localStaticLayout.getLineStart(i1);
							n = localStaticLayout.getLineEnd(i1);
							float f5 = localStaticLayout.getLineWidth(i1);
							float f4 = localTextPaint.measureText("...");
							while (true) {
								if (paramInt1 >= f5 + f4) {
									setText(localCharSequence.subSequence(0, n)
											+ "...");
									break;
								}
								n--;
								f5 = localTextPaint
										.measureText(localCharSequence
												.subSequence(m, n + 1)
												.toString());
							}
						}
						setText("");
					}
				}
				localTextPaint.setTextSize(f2);
				setLineSpacing(this.j, this.i);
				if (this.d != null)
					this.d.a(this, f1, f2);
				this.e = false;
				return;
			}
			f2 = Math.max(f2 - 2.0F, this.h);
		}
	}

	public float b() {
		return this.h;
	}

	public boolean c() {
		return this.k;
	}

	public void d() {
		super.setTextSize(0, this.f);
		this.g = this.f;
	}

	public void e() {
		int m = getHeight() - f();
		a(getWidth() - g(), m);
	}

	protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2,
			int paramInt3, int paramInt4) {
		if ((paramBoolean) || (this.e))
			e();
		super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
	}

	protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3,
			int paramInt4) {
		if ((paramInt1 != paramInt3) || (paramInt2 != paramInt4))
			this.e = true;
	}

	protected void onTextChanged(CharSequence paramCharSequence, int paramInt1,
			int paramInt2, int paramInt3) {
		this.e = true;
		d();
	}

	public void setAddEllipsis(boolean paramBoolean) {
		this.k = paramBoolean;
	}

	public void setLineSpacing(float paramFloat1, float paramFloat2) {
		super.setLineSpacing(paramFloat1, paramFloat2);
		this.i = paramFloat2;
		this.j = paramFloat1;
	}

	public void setMaxTextSize(float paramFloat) {
		this.g = paramFloat;
		requestLayout();
		invalidate();
	}

	public void setMinTextSize(float paramFloat) {
		this.h = paramFloat;
		requestLayout();
		invalidate();
	}

	public void setOnResizeListener(
			OnTextResizeListener paramOnTextResizeListener) {
		this.d = paramOnTextResizeListener;
	}

	public void setTextSize(float paramFloat) {
		super.setTextSize(paramFloat);
		this.f = getTextSize();
	}

	public void setTextSize(int paramInt, float paramFloat) {
		super.setTextSize(paramInt, paramFloat);
		this.f = getTextSize();
	}
}
