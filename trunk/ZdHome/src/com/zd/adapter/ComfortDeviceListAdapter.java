package com.zd.adapter;

import roboguice.util.Ln;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.inject.Inject;
import com.zd.home.R;
import com.zd.model.Room;
import com.zd.model.device.Device;
import com.zd.model.device.Thermostat;

public class ComfortDeviceListAdapter extends NotifyingDeviceListAdapter
{
  private Drawable c;
  private Drawable d;
  private Drawable e;
  private Drawable f;
  private boolean g;

  @Inject
  public ComfortDeviceListAdapter(Context paramContext, Room paramRoom)
  {
    super(paramContext, 2);

    if ((0xF & paramContext.getResources().getConfiguration().screenLayout) >= 3)
          this.g = true;
    a(paramRoom);
  }

  private Drawable a(int paramInt)
  {
    Drawable localDrawable;
    switch (paramInt)
    {
    default:
      localDrawable = null;
      break;
    case 0:
      if (this.c == null)
      {
        this.c = getContext().getResources().getDrawable(R.drawable.comfort_auto);
        localDrawable = this.c;
      }
      else
      {
        localDrawable = this.c;
      }
      break;
    case 1:
      if (this.d == null)
      {
        this.d = getContext().getResources().getDrawable(R.drawable.comfort_cool);
        localDrawable = this.d;
      }
      else
      {
        localDrawable = this.d;
      }
      break;
    case 2:
      if (this.e == null)
      {
        this.e = getContext().getResources().getDrawable(R.drawable.comfort_heat);
        localDrawable = this.e;
      }
      else
      {
        localDrawable = this.e;
      }
      break;
    case 3:
      if (this.f == null)
      {
        this.f = getContext().getResources().getDrawable(R.drawable.comfort_off);
        localDrawable = this.f;
      }
      else
      {
        localDrawable = this.f;
      }
    }
    return localDrawable;
  }

  public void a(Room paramRoom)
  {
    int j = 0;
    try
    {
      setNotifyOnChange(false);
      clear();
      if (paramRoom != null)
      {
        int i = paramRoom.G();
        while (j < i)
        {
          add(paramRoom.j(j));
          j++;
        }
      }
      notifyDataSetChanged();
      return;
    }
    catch (Exception localException)
    {
      while (true)
        Ln.e(localException);
    }
  }

  public int getItemViewType(int paramInt)
  {
    int k = 0;
    try
    {
      if (this.g)
      {
        int i = 0;
      }
      else
      {
        Device.DeviceType localDeviceType2 = ((Device)getItem(paramInt)).getType();
        Device.DeviceType localDeviceType1 = Device.DeviceType.b;
        int j = 0;
        if (localDeviceType2 == localDeviceType1)
          j = 1;
        
          if (j != 0)
          {
            j = 0;
          }
          else
          {
            j = 1;
          }
      }
    }
    catch (Exception e)
    {
   
    }
    return k;
  }

  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
	return null;
//    Object localObject1 = null;
//    try
//    {
//      Object localObject3 = (Device)getItem(paramInt);
//      int i;
//      if (((Device)localObject3).a() == Device.DeviceType.b)
//      {
//        i = 1;
//        if (paramView != null)
//          break label697;
//        if (!this.g)
//          break label392;
//        localView = this.a.inflate(R.layout.thermostat_list_item, null);
//        localView = localView;
//      }
//      while (true)
//      {
//        ComfortDeviceListAdapter.ThermostatHolder localThermostatHolder;
//        int j;
//        label392: Object localObject2;
//        try
//        {
//          localObject4 = localView.getTag();
//          if (localObject4 != null)
//            break label504;
//          if ((!this.g) && (i == 0))
//            continue;
//          localThermostatHolder = new ComfortDeviceListAdapter.ThermostatHolder(this);
//          localThermostatHolder.a = ((TextView)localView.findViewById(R.id.temperature_text));
//          localThermostatHolder.b = ((TextView)localView.findViewById(R.id.temperature_text_scale));
//          localThermostatHolder.c = ((TextView)localView.findViewById(R.id.device_name));
//          localThermostatHolder.d = ((TextView)localView.findViewById(R.id.device_details));
//          localThermostatHolder.e = ((ImageView)localView.findViewById(R.id.thermostat_mode));
//          localThermostatHolder.f = ((FrameLayout)localView.findViewById(R.id.icon));
//          localView.setTag(localThermostatHolder);
//          localObject4 = localObject1;
//          localObject1 = localThermostatHolder;
//          localObject4 = localObject4;
//          if (i == 0)
//            break label544;
//          localObject3 = (Thermostat)localObject3;
//          String str1 = Integer.toString(((Thermostat)localObject3).F());
//          localObject1.a.setText(str1 + '°');
//          str1 = ((Thermostat)localObject3).I();
//          if ((str1 == null) || (str1.length() <= 0))
//            continue;
//          str1 = str1.substring(0, 1);
//          localObject1.b.setText(str1);
//          localObject1.c.setText(((Thermostat)localObject3).u());
//          localObject1.c.setMaxLines(2);
//          localObject1.c.setEllipsize(TextUtils.TruncateAt.END);
//          localObject1.d.setText(((Thermostat)localObject3).i());
//          localObject1.e.setImageDrawable(a(((Thermostat)localObject3).b()));
//          localObject1.e.setVisibility(0);
//          localObject1.f.setBackgroundResource(R.drawable.comfort_thermostat);
//          localView = localView;
//          return localView;
//          j = 0;
//          break;
//          if (j == 0)
//            continue;
//          localView = this.a.inflate(R.layout.thermostat_list_item, null);
//          continue;
//          localView = this.a.inflate(R.layout.list_item, null);
//          localView = localView;
//          continue;
//          localObject4 = new ComfortDeviceListAdapter.DeviceHolder(this);
//          ((ComfortDeviceListAdapter.DeviceHolder)localObject4).a = ((TextView)localView.findViewById(R.id.item_text));
//          ((ComfortDeviceListAdapter.DeviceHolder)localObject4).b = ((ImageView)localView.findViewById(R.id.icon));
//          localView.setTag(localObject4);
//          continue;
//        }
//        catch (Exception localObject2)
//        {
//          localObject2 = localException1;
//          localView = localView;
//        }
//        Ln.e((Throwable)localObject2);
//        continue;
//        label504: if ((this.g) || (j != 0))
//        {
//          localThermostatHolder = (ComfortDeviceListAdapter.ThermostatHolder)localObject4;
//          localObject4 = localObject2;
//          localObject2 = localThermostatHolder;
//          continue;
//        }
//        Object localObject4 = (ComfortDeviceListAdapter.DeviceHolder)localObject4;
//        continue;
//        label544: String str2 = ((Device)localObject3).u();
//        if (str2 == null)
//          str2 = "";
//        if (this.g)
//        {
//          ((ComfortDeviceListAdapter.ThermostatHolder)localObject2).a.setText("");
//          ((ComfortDeviceListAdapter.ThermostatHolder)localObject2).b.setText("");
//          ((ComfortDeviceListAdapter.ThermostatHolder)localObject2).c.setText(str2);
//          ((ComfortDeviceListAdapter.ThermostatHolder)localObject2).d.setText("");
//          ((ComfortDeviceListAdapter.ThermostatHolder)localObject2).e.setVisibility(8);
//          ((ComfortDeviceListAdapter.ThermostatHolder)localObject2).f.setBackgroundDrawable(a(((Device)localObject3).a(), this.b));
//          continue;
//        }
//        ((ComfortDeviceListAdapter.DeviceHolder)localObject4).a.setText(str2);
//        ((ComfortDeviceListAdapter.DeviceHolder)localObject4).b.setImageDrawable(a(((Device)localObject3).a(), this.b));
//      }
//    }
//    catch (Exception localException3)
//    {
//  
//    }
  }

  public int getViewTypeCount()
  {
    int i;
    if (!this.g)
      i = 2;
    else
      i = 1;
    return i;
  }
}

