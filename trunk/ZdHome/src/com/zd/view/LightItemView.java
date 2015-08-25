package com.zd.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.zd.home.R;
import com.zd.model.device.Light;

public class LightItemView extends LinearLayout {

	ImageButton switchBtn;
	TextView nameTxt;
	Light light;

	public LightItemView(Context context) {
		super(context);
		initView();
	}

	private void initView() {
		View paramView = LayoutInflater.from(getContext()).inflate(
				R.layout.light_list_item, null);
		LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(
				-1, -1);

		switchBtn = (ImageButton) paramView.findViewById(R.id.power);
		switchBtn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// light.state = !light.state;
				// if(light.state)
				// ZDApplication.deviceControl(light.id, "01");
				// else
				// ZDApplication.deviceControl(light.id, "00");
			}
		});
		nameTxt = (TextView) paramView.findViewById(R.id.device_name);
		addView(paramView, localLayoutParams);
	}

	public void setData(Light light) {
		// this.light = light;
		// nameTxt.setText(light.name);
	}

}
