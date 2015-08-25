package com.zd.adapter;

import roboguice.util.Ln;
import android.content.Context;

import com.google.inject.Inject;
import com.zd.model.Room;

public class WatchDeviceListAdapter extends DeviceListAdapter
{
  @Inject
  public WatchDeviceListAdapter(Context paramContext, Room paramRoom)
  {
    super(paramContext, 5);
    a(paramRoom);
  }

  public void a(Room paramRoom)
  {
    int j = 0;
    try
    {
      setNotifyOnChange(false);
      clear();
      int i = paramRoom.K();
      while (j < i)
      {
        add(paramRoom.n(j));
        j++;
      }
      notifyDataSetChanged();
      return;
    }
    catch (Exception localException)
    {

        Ln.e(localException);
    }
  }
}

