package com.zd.home.ui;

import android.content.Intent;
import android.os.Bundle;

public class ProjectContactDevicesActivityGroup extends TabActivityGroup {
	protected void onCreate(Bundle paramBundle) {
		super.onCreate(paramBundle);
		Intent localIntent = new Intent(this, ContactDevicesListActivity.class);
		localIntent.putExtra("com.control4.ui..AllContactDevices", new Boolean(
				true));
		a(localIntent, "All Motors");
	}
}
