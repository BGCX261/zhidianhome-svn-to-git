package com.zd.home;

import roboguice.activity.RoboActivity;
import roboguice.inject.InjectView;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.inject.internal.Nullable;

public abstract class BaseActivity extends RoboActivity implements
		View.OnClickListener {
	protected Handler handler;
	@InjectView(R.id.txtTitle)
	@Nullable
	protected TextView txtTitle = null;
	private LinearLayout cityLayout;
	protected TextView txtCityContent;
	@InjectView(R.id.title_left_btn)
	@Nullable
	protected Button titelLeftButton;

	@InjectView(R.id.title_right_btn)
	@Nullable
	protected Button titelRightButton;
	protected AnimationDrawable frameAnimation;
	private ZDApplication appclication;
	private static final String TAG = "BaseActivity";

	public BaseActivity() {

		this.handler = new Handler() {
			public void handleMessage(Message paramMessage) {
				switch (paramMessage.what) {
				case 1001:
					break;
				case 1002:

				case 1003:
				case 1004:
				}
			}

		};
	}

	protected void qStartActivityForResult(Class paramClass,
			Bundle paramBundle, int paramInt) {
		Intent localIntent = new Intent();
		if (paramBundle != null)
			localIntent.putExtras(paramBundle);
		localIntent.setClass(this, paramClass);
		startActivityForResult(localIntent, paramInt);
	}

	public void showAlertDialog(String paramString1, String paramString2) {
		AlertDialog.Builder localBuilder = new AlertDialog.Builder(this);
		localBuilder.setTitle(paramString1);
		localBuilder.setMessage(paramString2);
		localBuilder.setNegativeButton("х╥хо",
				new DialogInterface.OnClickListener() {

					@Override
					public void onClick(DialogInterface paramDialogInterface,
							int which) {
						paramDialogInterface.dismiss();

					}
				});
		localBuilder.create().show();
	}

	protected void qStartActivity(Class paramClass, Bundle paramBundle) {
		Intent localIntent = new Intent();
		if (paramBundle != null) {
			localIntent.putExtras(paramBundle);
		}
		localIntent.setClass(this, paramClass);
		startActivity(localIntent);
	}

	public ProgressDialog buildProcessDialog(String paramString1,
			String paramString2) {
		ProgressDialog localProgressDialog = new ProgressDialog(this);
		localProgressDialog.setTitle(paramString1);
		localProgressDialog.setMessage(paramString2);
		return localProgressDialog;
	}

	protected void setTitleText(CharSequence paramCharSequence) {
		if (txtTitle != null)
			this.txtTitle.setText(paramCharSequence);

	}

	protected void setTitleText(int paramInt) {
		if (txtTitle != null)
			this.txtTitle.setText(paramInt);
	}

	public void setDefaultMenu(boolean paramBoolean) {
		// this.hasDefaultMenu = paramBoolean;
	}

	protected void setContentView(int paramInt1, int paramInt2) {
		this.appclication = (ZDApplication) this.getApplication();
		switch (paramInt2) {
		case 1:
			break;
		case 2:
			this.setTheme(R.style.titleSecondary);
			requestWindowFeature(7);
			setContentView(paramInt1);
			getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE,
					R.layout.title_secondary);
			break;
		case 3:
			this.setTheme(R.style.titleMajor);
			requestWindowFeature(7);
			setContentView(paramInt1);
			getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE,
					R.layout.title_threadary);

			this.setLeftButtonListener(new OnClickListener() {

				@Override
				public void onClick(View v) {
					BaseActivity.this.finish();
				}
			});
			break;
		case 4:
			requestWindowFeature(1);
			setContentView(paramInt1);
			return;
		}

		txtTitle = (TextView) this.findViewById(R.id.txtTitle);
		if (titelRightButton != null)
			titelRightButton.setVisibility(View.GONE);
	}

	public void showToast(String paramString) {
		Toast.makeText(this, paramString, 0).show();
	}

	protected void qOpenWebView(String paramString) {
		Bundle localBundle = new Bundle();
		localBundle.putString("url", paramString);
		// qStartActivity(WebActivity.class, localBundle);

	}

	protected void qBackForResult(int paramInt, Bundle paramBundle) {
		Intent localIntent = new Intent();
		if (paramBundle != null)
			localIntent.putExtras(paramBundle);
		setResult(paramInt, localIntent);
		finish();
	}

	protected void qStartShareActivity(String paramString) {
		Intent localIntent1 = new Intent("android.intent.action.SEND");
		localIntent1.setType("text/plain");
		localIntent1.putExtra("android.intent.extra.TEXT", paramString);
		String str = getString(2131231495);
		Intent localIntent2 = Intent.createChooser(localIntent1, str);
		startActivity(localIntent2);
	}

	protected void setLeftButtonText(String leftText) {

		if (titelLeftButton != null)
			titelLeftButton.setText(leftText);
	}

	protected void setRinghtButtonText(String leftText) {
		if (titelRightButton != null) {
			titelRightButton.setVisibility(View.VISIBLE);
			titelRightButton.setText(leftText);
		}
	}

	protected void setLeftButtonListener(View.OnClickListener listener) {

		if (titelLeftButton != null)
			titelLeftButton.setOnClickListener(listener);
	}

	protected void setRinghtButtonListener(View.OnClickListener listener) {

		if (titelRightButton != null) {
			titelRightButton.setVisibility(View.VISIBLE);
			titelRightButton.setOnClickListener(listener);
		}
	}

	@Override
	public void onWindowFocusChanged(boolean hasFocus) {
		super.onWindowFocusChanged(hasFocus);
		if (frameAnimation != null) {
			frameAnimation.stop();
			frameAnimation.start();
		}
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub

	}

}
