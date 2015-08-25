package com.zd.adapter;

import android.content.Context;

import com.zd.model.device.Device;

public abstract class NotifyingDeviceListAdapter extends DeviceListAdapter
{
  public NotifyingDeviceListAdapter(Context paramContext, int paramInt)
  {
    super(paramContext, paramInt);
  }

  public void a()
  {
    for (int i = 0; ; i++)
    {
      if (i >= getCount())
        return;
      Device localDevice = (Device)getItem(i);
      localDevice.a(null);
      localDevice.C();
    }
  }

  public void a(Device.OnDeviceUpdateListener paramOnDeviceUpdateListener)
  {
    for (int i = 0; ; i++)
    {
      if (i >= getCount())
        return;
      Device localDevice = (Device)getItem(i);
      if (!localDevice.B())
        localDevice.q();
      if (localDevice.A())
        localDevice.p();
      localDevice.a(paramOnDeviceUpdateListener);
    }
  }
}

