package com.zd.home;

import roboguice.inject.InjectView;
import android.os.Bundle;
import android.widget.ListView;

import com.zd.adapter.CurtainListAdapter;

public class EnvironmentActivity extends BaseActivity {
	@InjectView(R.id.lights_list)
	ListView lvLight;
	ZDApplication app;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		this.setContentView(R.layout.lights_activity, 2);
		this.setTitleText("»·¾³¿ØÖÆ");
		app = (ZDApplication) this.getApplication();
		initLightList();
	}

	private void initLightList() {
		lvLight = (ListView) this.findViewById(R.id.lights_list);
		CurtainListAdapter llAdapter = new CurtainListAdapter(this);
		lvLight.setAdapter(llAdapter);
		llAdapter.setData(app.getChuanglianList());

	}
}
