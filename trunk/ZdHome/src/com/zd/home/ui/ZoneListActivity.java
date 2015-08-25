package com.zd.home.ui;

import roboguice.inject.InjectExtra;
import roboguice.util.Ln;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.google.inject.Inject;
import com.zd.home.R;
import com.zd.home.adapter.ZoneListAdapter;
import com.zd.home.service.PreferenceService;
import com.zd.model.DirectorProject;
import com.zd.model.Project;
import com.zd.model.Room;
import com.zd.model.audio.DirectorZoneManager;
import com.zd.model.audio.Zone;
import com.zd.model.audio.ZoneManager;
import com.zd.model.device.Device;

public class ZoneListActivity extends NavigationActivity {
	public static final String a = "com.control4.ui.ZoneListActivity.RoomId";
	private static final int b = 11223;
	private static final int c = 11224;
	private Room A;
	private Zone B;

	// @j
	@InjectExtra(value = "com.control4.ui.ZoneListActivity.RoomId", optional = true)
	private Integer C;
	private final ZoneListAdapter.OnZoneClickedListener D = new ZoneListAdapter.OnZoneClickedListener() {

		@Override
		public void b(Room paramRoom) {
			// TODO Auto-generated method stub

		}

		@Override
		public void a(Room paramRoom) {
			// TODO Auto-generated method stub

		}

		@Override
		public void a(Zone paramZone) {
			// TODO Auto-generated method stub

		}
	};// ZoneListActivity.1.1(this);
	 private final ZoneManager.OnZoneManagerUpdateListener E = new ZoneManager.OnZoneManagerUpdateListener() {
		
		@Override
		public void a(DirectorZoneManager directorZoneManager) {
			runOnUiThread(new  Runnable() {
				public void run() {
				    try
				    {
				      ZoneListActivity.d(ZoneListActivity.this).c();
				      ZoneListActivity.e(ZoneListActivity.this);
				    }
				    catch (Exception localException)
				    {
				        Ln.e(localException);
				    }
				}
			});
			
		}
	};
	// private final Device.OnDeviceUpdateListener F = new
	// ZoneListActivity.5(this);
    static Room c(ZoneListActivity zonelistactivity)
    {
        return zonelistactivity.A;
    }
    static ZoneListAdapter d(ZoneListActivity zonelistactivity)
    {
        return zonelistactivity.f;
    }

    static void e(ZoneListActivity zonelistactivity)
    {
        zonelistactivity.n();
    }
	@Inject
	private PreferenceService _prefs;
	private ListView d;
	private TextView e;
	private ZoneListAdapter f;

	private void n() {
		int i = 0;
		try {
			ZoneManager localZoneManager = this._director.J();
			if ((localZoneManager != null) && (!localZoneManager.c())
					&& (localZoneManager.h() == 0)) {
				int j = 1;
				TextView localTextView = this.e;
				if (j == 0){
					localTextView.setVisibility(i);
//					return;
//					i = 4;
				}
			}
		} catch (Exception localException) {
	
		}
	}

	protected void a(boolean paramBoolean) {
		super.a(paramBoolean);
		if (paramBoolean) {
//			Ln.a("Refreshing Zones list adapter from updateRoomVolumeControls()",
//					new Object[0]);
			this.f.b();
			n();
		}
	}

	protected View a_() {
		return this._layoutInflater.inflate(2130903170, null);
	}

	protected void i_() {
		super.i_();
		// Ln.a("NOT Refreshing Zones list adapter from updateRoomControls()",
		// new Object[0]);
		n();
	}

	protected void j() {
		while (true) {
			int i = 0 ;
			try {
				DirectorProject localDirectorProject = this._director.m();
				i = 0;
				if (i < localDirectorProject.n()) {
					Room localRoom = localDirectorProject.getRoom(i);
					if (localRoom != null)
					   localRoom.P();
					if (!localRoom.m())
					    localRoom.R();
				}
				else
				{
					break;
				}
			} catch (Exception localException) {
				Ln.e(localException);
			}
			 i++;
		}
	}

	protected void k() {
		while(true)
		{
		int i = 0;
		try {
			DirectorProject localDirectorProject = this._director.m();
			
			if (i < localDirectorProject.n()) {
				Room localRoom = localDirectorProject.getRoom(i);
				if ((localRoom != null) && (localRoom != this.croom))
				localRoom.T();
			}
			else
			{
				break;
			}
		} catch (Exception localException) {
			Ln.e(localException);
		}
		i++;
		}

	}

	protected void l() {
		try {
			DirectorProject localDirectorProject = this._director.m();
			for (int i = 0; i < localDirectorProject.n(); i++) {
				Room localRoom = localDirectorProject.getRoom(i);
				if (localRoom != null)
				  localRoom.b(this.w);
			}
		} catch (Exception localException) {
			Ln.e(localException);
		}
	}

	protected void m() {
		try {
			DirectorProject localDirectorProject = this._director.m();
			for (int i = 0; i < localDirectorProject.n(); i++) {
				Room localRoom = localDirectorProject.getRoom(i);
				if (localRoom != null)
				   localRoom.a(this.w);
			}
		} catch (Exception localException) {
			Ln.e(localException);
		}
	}

	public void onCreate(Bundle paramBundle) {
		super.onCreate(paramBundle);
		try {
			this.f = new ZoneListAdapter(this, this._director.J());
			this.f.a(this.D);
			this.d = ((ListView) findViewById(R.id.list_view));
			this.d.setAdapter(this.f);
			this.d.setOnScrollListener(this.f);
			//this.e = ((TextView) findViewById(R.id.noActiveZonesText ));
			if (this.C != null) {
				//Ln.b("Room id passed to activity:" + this.C, new Object[0]);
				Project project = this._navigator.getProject();
				if (project != null) {
					Room room = project.getEnableRoom(this.C.intValue());
					if (room != null)
						a(room);
				}
			}
			if (this._navigator.getProject() == null)
				this.toMainActivity();
			else
				n();
		} catch (Exception localException) {
			Ln.e(localException);
		}
	}

	protected Dialog onCreateDialog(int paramInt)
  {
	AlertDialog.Builder localObject = null;
	Dialog rst = null ;
    switch (paramInt)
    {
  
    case 11223:
      if (this.B != null){
      localObject = new AlertDialog.Builder(this);
      localObject.setTitle(R.string.zone_off_confirmation_title);
      localObject.setMessage(R.string.zone_off_confirmation_message );
      localObject.setPositiveButton(R.string.yes, new OnClickListener() {
		
		@Override
		public void onClick(DialogInterface dialog, int which) {
			dialog.dismiss();
			    ZoneListActivity.b(ZoneListActivity.this).d();

		}
	});
      localObject.setNegativeButton(R.string.no, new OnClickListener() {
		
		@Override
		public void onClick(DialogInterface dialog, int which) {
			dialog.dismiss();

		}
	});
      rst = localObject.create();
      }
      break;
    case 11224:
      if (this.A != null){
      localObject = new AlertDialog.Builder(this);
      localObject.setTitle(R.string.room_off_confirmation_title);
      localObject.setMessage(getResources().getString(R.string.room_off_confirmation_message) + ": " + this.A.b() + "?");
      localObject.setPositiveButton(R.string.yes, new OnClickListener() {
		
		@Override
		public void onClick(DialogInterface dialog, int which) {
			dialog.dismiss();
			    ZoneListActivity.c(ZoneListActivity.this).an();

		}
	});
      localObject.setNegativeButton(R.string.no, new OnClickListener() {
		
		@Override
		public void onClick(DialogInterface dialog, int which) {
			dialog.dismiss();

		}
	});
      rst = localObject.create();
      }
    }
   
    rst = super.onCreateDialog(paramInt);

    return rst;
  }

	protected void onDestroy() {
		if (this.f != null)
			this.f.a(null);
		super.onDestroy();
	}

	protected void onPause()
  {
    super.onPause();
    try
    {
      ZoneManager localZoneManager = this._director.J();
      if ((localZoneManager != null) && (localZoneManager.a() == this.E))
        localZoneManager.a(null);
      if (this.f != null)
        this.f.a(null);
      l();
      this._director.b(new Runnable() {
		
		@Override
		public void run() {
			k();
			
		}
	});
      return;
    }
    catch (Exception localException)
    {
        Ln.e(localException);
    }
  }

	protected void onPrepareDialog(int paramInt, Dialog paramDialog) {
		switch (paramInt) {
		case 11224:
			if (this.A == null)
				break;
			String str = getResources().getString(2131165385) + ": "
					+ this.A.b() + "?";
			((AlertDialog) paramDialog).setMessage(str);
		default:
			super.onPrepareDialog(paramInt, paramDialog);
		}
	}

	protected void onResume()
  {
    super.onResume();
    try
    {
      ZoneManager localZoneManager = this._director.J();
      if (localZoneManager != null)
        localZoneManager.a(this.E);
      if (this.f != null)
        this.f.a(this.D);
      m();
      this._director.b(new Runnable() {
		
		@Override
		public void run() {
		j();
		}
	});
      if (this.f != null)
        this.f.c();
      return;
    }
    catch (Exception localException)
    {
        Ln.e(localException);
    }
  }
}
