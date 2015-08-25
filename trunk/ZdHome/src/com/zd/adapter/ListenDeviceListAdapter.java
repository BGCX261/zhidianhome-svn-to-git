package com.zd.adapter;

import roboguice.util.Ln;
import android.content.Context;

import com.google.inject.Inject;
import com.zd.model.Room;

public class ListenDeviceListAdapter extends DeviceListAdapter
{
  @Inject
  public ListenDeviceListAdapter(Context paramContext, Room paramRoom)
  {
    super(paramContext, 4);
    a(paramRoom);
  }

  public void a(Room paramRoom)
  {
    int i = 0;
    try
    {
      setNotifyOnChange(false);
      clear();
      int j = paramRoom.getListenDeviceCount();
      while (i < j)
      {
        add(paramRoom.l(i));
        i++;
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

