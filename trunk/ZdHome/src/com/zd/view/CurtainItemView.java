package com.zd.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.zd.home.R;
import com.zd.home.ZDApplication;
import com.zd.model.Curtain;

public class CurtainItemView extends LinearLayout {

	ImageButton openBtn;
	ImageButton closehBtn;
	ImageButton stopBtn;
	TextView nameTxt;
	Curtain light;

	public CurtainItemView(Context context) {
		super(context);
		initView();
	}

	private void initView() {
		View paramView = LayoutInflater.from(getContext()).inflate(
				R.layout.curtain_list_item, null);
		LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(
				-1, -1);

		openBtn = (ImageButton) paramView.findViewById(R.id.openBtn);
		closehBtn = (ImageButton) paramView.findViewById(R.id.closeBtn);
		stopBtn = (ImageButton) paramView.findViewById(R.id.stopBtn);
		openBtn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				ZDApplication.deviceControl(light.id, "01");
			}
		});
		closehBtn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				ZDApplication.deviceControl(light.id, "00");
			}
		});
		nameTxt = (TextView) paramView.findViewById(R.id.device_name);
		addView(paramView, localLayoutParams);
	}

	public void setData(Curtain light) {
		this.light = light;
		nameTxt.setText(light.name);
	}

}
