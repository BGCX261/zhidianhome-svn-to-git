package com.zd.home.adapter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

import roboguice.util.Ln;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.inject.Inject;
import com.zd.home.R;
import com.zd.model.Room;
import com.zd.model.audio.Zone;
import com.zd.model.audio.ZoneManager;

public class ZoneListAdapter extends ArrayAdapter<Object>
  implements AbsListView.OnScrollListener
{
	public abstract interface OnZoneClickedListener
	{
	  public abstract void a(Zone paramZone);

	  public abstract void a(Room paramRoom);

	  public abstract void b(Room paramRoom);
	}
	public class HolderBase
	{
	  public int j;

	  public HolderBase(ZoneListAdapter paramZoneListAdapter)
	  {
	  }
	}
	public class ZoneHolder extends ZoneListAdapter.HolderBase
	{
	  public TextView a;
	  public TextView b;
	  public TextView c;
	  public TextView d;
	  public ImageView e;
	  public ImageView f;
	  public ImageView g;
	  public ImageView h;

	  public ZoneHolder(ZoneListAdapter paramZoneListAdapter)
	  {
	    super(paramZoneListAdapter);
	  }
	}
	public class ZoneRoomHolder extends ZoneListAdapter.HolderBase
	{
	  public TextView a;
	  public TextView b;
	  public TextView c;
	  public ImageView d;
	  public ImageView e;
	  public ImageView f;
	  public ImageView g;

	  public ZoneRoomHolder(ZoneListAdapter paramZoneListAdapter)
	  {
	    super(paramZoneListAdapter);
	  }
	}
	
	public class AddToZone
	{
	  Zone a;

	  public AddToZone(ZoneListAdapter paramZoneListAdapter, Zone paramZone)
	  {
	    this.a = paramZone;
	  }
	}
	public class AddToZoneHolder extends ZoneListAdapter.HolderBase
	{
	  public Button a;

	  public AddToZoneHolder(ZoneListAdapter paramZoneListAdapter)
	  {
	    super(paramZoneListAdapter);
	  }
	}
  protected final LayoutInflater a;
  private ZoneListAdapter.OnZoneClickedListener b;
  private ArrayList<View> c;
  private ArrayList<Object> d;
  private Room e;
  private final ZoneManager f;
  private final LinkedList<View> g = new LinkedList();
  private final View.OnClickListener h = null;//new ZoneListAdapter.1(this);
  private final View.OnClickListener i = null;//new ZoneListAdapter.2(this);
  private final View.OnClickListener j = null;//new ZoneListAdapter.3(this);
  private final View.OnClickListener k = null;//new ZoneListAdapter.4(this);
  private final View.OnClickListener l = null;//new ZoneListAdapter.5(this);
  private final View.OnClickListener m = null;//new ZoneListAdapter.6(this);
  private final View.OnClickListener n = null;//new ZoneListAdapter.7(this);
  private final View.OnClickListener o = null;//new ZoneListAdapter.8(this);
  private final View.OnClickListener p = null;//new ZoneListAdapter.9(this);
  private final View.OnTouchListener q = null;//new ZoneListAdapter.10(this);
  private final View.OnTouchListener r = null;//new ZoneListAdapter.11(this);
  private final View.OnClickListener s = null;//new ZoneListAdapter.12(this);

  @Inject
  public ZoneListAdapter(Context paramContext, ZoneManager paramZoneManager)
  {
    super(paramContext, R.layout.zone_list_item);
    this.f = paramZoneManager;
    this.a = LayoutInflater.from(paramContext);
    c();
  }

  private void a(ZoneListAdapter.ZoneHolder paramZoneHolder, Zone paramZone)
  {
    if (paramZone != null)
    {
      Object localObject = paramZone.a();
      String str = paramZone.b();
      if ((str == null) || (str.length() <= 0))
      {
        paramZoneHolder.b.setText((CharSequence)localObject);
        paramZoneHolder.a.setVisibility(4);
        paramZoneHolder.c.setVisibility(4);
        paramZoneHolder.b.setVisibility(0);
      }
      else
      {
        paramZoneHolder.a.setText((CharSequence)localObject);
        paramZoneHolder.c.setText(str);
        paramZoneHolder.a.setVisibility(0);
        paramZoneHolder.c.setVisibility(0);
        paramZoneHolder.b.setVisibility(4);
      }
      if (paramZone.e() > 0)
      {
        localObject = paramZone.a(0);
        if (!((Room)localObject).d())
          paramZoneHolder.d.setText("");
        else
          paramZoneHolder.d.setText(((Room)localObject).h() + "%");
      }
      if (!paramZone.m())
        paramZoneHolder.h.setImageResource(R.drawable.md_mute_button);
      else
        paramZoneHolder.h.setImageResource(R.drawable.md_muteon_button);
    }
  }

  private void a(ZoneListAdapter.ZoneRoomHolder paramZoneRoomHolder, Room paramRoom)
  {
    if (paramRoom != null)
    {
      paramZoneRoomHolder.b.setText(paramRoom.b());
      paramZoneRoomHolder.b.setVisibility(0);
      if (!paramRoom.d())
        paramZoneRoomHolder.c.setText("");
      else
        paramZoneRoomHolder.c.setText(paramRoom.h() + "%");
      if ((!paramRoom.g()) || (!paramRoom.n()))
        paramZoneRoomHolder.g.setImageResource(R.drawable.md_mute_button);
      else
        paramZoneRoomHolder.g.setImageResource(R.drawable.md_muteon_button);
    }
  }

  private void d()
  {
    try
    {
//      if (this.c != null)
//      {
//        Iterator localIterator = this.c.iterator();
//        while (true)
//        {
//          if (!localIterator.hasNext())
//            return;
//          localObject2 = (ZoneListAdapter.HolderBase)((View)localIterator.next()).getTag();
//          localObject1 = getItem(((ZoneListAdapter.HolderBase)localObject2).j);
//          if (localObject1 == null)
//            continue;
//          if (!(localObject2 instanceof ZoneListAdapter.ZoneHolder))
//            break;
//          localObject2 = (ZoneListAdapter.ZoneHolder)localObject2;
//          if (!(localObject1 instanceof Zone))
//            continue;
//          localObject1 = (Zone)localObject1;
//          if (localObject2 == null)
//            continue;
//          a((ZoneListAdapter.ZoneHolder)localObject2, (Zone)localObject1);
//        }
//      }
    }
    catch (Exception localException)
    {
      
//        
//        if ((!(localObject2 instanceof ZoneListAdapter.ZoneRoomHolder)) || (!(localObject1 instanceof Room)))
//          continue;
//        Object localObject1 = (Room)localObject1;
//        Object localObject2 = (ZoneListAdapter.ZoneRoomHolder)localObject2;
//        if (localObject2 == null)
//          continue;
//        a((ZoneListAdapter.ZoneRoomHolder)localObject2, (Room)localObject1);
      
    }
  }

  public ZoneListAdapter.OnZoneClickedListener a()
  {
    return this.b;
  }

  public void a(ZoneListAdapter.OnZoneClickedListener paramOnZoneClickedListener)
  {
    this.b = paramOnZoneClickedListener;
  }

  public void b()
  {
    try
    {
      d();
    }
    catch (Exception localException)
    {
        Ln.e(localException);
    }
  }

  public void c()
  {
  
      setNotifyOnChange(false);
      clear();
      int i2 = 0;
      if (i2 < this.f.h())
      {
        Zone localZone = this.f.a(i2);
        if (localZone != null)
            add(localZone);
        if (localZone.e() > 1)
        {
          int i1 = 0;
          if (i1 < localZone.e())
          {
            Room localRoom = localZone.a(i1);
            if (localRoom != null)
              add(localRoom);

          }
        }
        add(new ZoneListAdapter.AddToZone(this, localZone));
   
      }
      else
      {
        notifyDataSetChanged();
       
      }
    
   
  }

  public int getCount()
  {
    return super.getCount();
  }

  public Object getItem(int paramInt)
  {
    return super.getItem(paramInt);
  }

  public int getItemViewType(int paramInt)
  {
    int i1 = 0;
    try
    {
      Object localObject = getItem(paramInt);
      if (!(localObject instanceof Zone))
      {
        if (localObject instanceof Room)
          i1 = 1;
        else
          i1 = 2;
      }
    }
    catch (Exception localException)
    {
      Ln.e(localException);
    }
    return i1;
  }

  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
	return null;
//    try
//    {
//      Object localObject1 = getItem(paramInt);
//      Object localObject2;
//      Object localObject4;
//      ZoneListAdapter.AddToZone localAddToZone;
//      if ((localObject1 instanceof Zone))
//      {
//        localObject1 = (Zone)localObject1;
//        localObject2 = null;
//        localObject4 = localObject1;
//        localAddToZone = null;
//      }
//      while (true)
//        if (paramView == null)
//        {
//          if (localObject4 != null)
//          {
//            localObject1 = this.a.inflate(R.layout.zone_header_list_item, null);
//            localObject1 = localObject1;
//          }
//          try
//          {
//            label58: if (this.c == null)
//              this.c = new ArrayList();
//            this.c.add(localObject1);
//            if (localObject4 != null)
//            {
//              localObject2 = (ZoneListAdapter.ZoneHolder)((View)localObject1).getTag();
//              if (localObject2 == null)
//              {
//                localObject2 = new ZoneListAdapter.ZoneHolder(this);
//                ((ZoneListAdapter.ZoneHolder)localObject2).a = ((TextView)((View)localObject1).findViewById(R.id.zone_title));
//                ((ZoneListAdapter.ZoneHolder)localObject2).b = ((TextView)((View)localObject1).findViewById(R.id.zone_single_title));
//                ((ZoneListAdapter.ZoneHolder)localObject2).c = ((TextView)((View)localObject1).findViewById(R.id.zone_subtitle));
//                ((ZoneListAdapter.ZoneHolder)localObject2).d = ((TextView)((View)localObject1).findViewById(R.id.zone_volume));
//                ((ZoneListAdapter.ZoneHolder)localObject2).h = ((ImageView)((View)localObject1).findViewById(R.id.volume_mute));
//                ((ZoneListAdapter.ZoneHolder)localObject2).h.setOnClickListener(this.i);
//                ((ZoneListAdapter.ZoneHolder)localObject2).h.setTag(localObject2);
//                ((ZoneListAdapter.ZoneHolder)localObject2).g = ((ImageView)((View)localObject1).findViewById(R.id.volume_down));
//                ((ZoneListAdapter.ZoneHolder)localObject2).g.setOnClickListener(this.j);
//                ((ZoneListAdapter.ZoneHolder)localObject2).g.setOnTouchListener(this.r);
//                ((ZoneListAdapter.ZoneHolder)localObject2).g.setTag(localObject2);
//                ((ZoneListAdapter.ZoneHolder)localObject2).f = ((ImageView)((View)localObject1).findViewById(R.id.volume_up));
//                ((ZoneListAdapter.ZoneHolder)localObject2).f.setOnClickListener(this.k);
//                ((ZoneListAdapter.ZoneHolder)localObject2).g.setOnTouchListener(this.q);
//                ((ZoneListAdapter.ZoneHolder)localObject2).f.setTag(localObject2);
//                ((ZoneListAdapter.ZoneHolder)localObject2).e = ((ImageView)((View)localObject1).findViewById(R.id.power));
//                ((ZoneListAdapter.ZoneHolder)localObject2).e.setOnClickListener(this.l);
//                ((ZoneListAdapter.ZoneHolder)localObject2).e.setTag(localObject2);
//                if (((Zone)localObject4).e() != 1)
//                  break label575;
//                ((ZoneListAdapter.ZoneHolder)localObject2).g.setOnTouchListener(this.r);
//                ((ZoneListAdapter.ZoneHolder)localObject2).f.setOnTouchListener(this.q);
//              }
//              while (true)
//              {
//                ((View)localObject1).setTag(localObject2);
//                ((ZoneListAdapter.ZoneHolder)localObject2).b.setOnClickListener(this.h);
//                ((ZoneListAdapter.ZoneHolder)localObject2).b.setTag(localObject2);
//                ((ZoneListAdapter.ZoneHolder)localObject2).a.setOnClickListener(this.h);
//                ((ZoneListAdapter.ZoneHolder)localObject2).a.setTag(localObject2);
//                ((ZoneListAdapter.ZoneHolder)localObject2).c.setOnClickListener(this.h);
//                ((ZoneListAdapter.ZoneHolder)localObject2).c.setTag(localObject2);
//                localObject2 = localObject2;
//                ((ZoneListAdapter.ZoneHolder)localObject2).j = paramInt;
//                a((ZoneListAdapter.ZoneHolder)localObject2, (Zone)localObject4);
//                localObject1 = localObject1;
//                return localObject1;
//                if ((localObject1 instanceof Room))
//                {
//                  localObject2 = (Room)localObject1;
//                  localObject4 = null;
//                  localAddToZone = null;
//                  break;
//                }
//                localAddToZone = (ZoneListAdapter.AddToZone)localObject1;
//                localObject2 = null;
//                localObject4 = null;
//                break;
//                if (localObject2 != null)
//                {
//                  localObject1 = this.a.inflate(R.layout.zone_room_list_item, null);
//                  break label58;
//                }
//                if (localAddToZone == null)
//                  break label1041;
//                localObject1 = this.a.inflate(R.layout.zone_footer_list_item, null);
//                localObject1 = localObject1;
//                break label58;
//                label575: ((ZoneListAdapter.ZoneHolder)localObject2).g.setOnTouchListener(null);
//                ((ZoneListAdapter.ZoneHolder)localObject2).f.setOnTouchListener(null);
//              }
//            }
//          }
//          catch (Exception localObject3)
//          {
//            while (true)
//            {
//              localObject1 = localObject1;
//              localObject3 = localException2;
//              Ln.e((Throwable)localObject3);
//              continue;
//              if (localObject3 != null)
//              {
//                localObject4 = (ZoneListAdapter.ZoneRoomHolder)((View)localObject1).getTag();
//                if (localObject4 == null)
//                {
//                  localObject4 = new ZoneListAdapter.ZoneRoomHolder(this);
//                  ((ZoneListAdapter.ZoneRoomHolder)localObject4).a = ((TextView)((View)localObject1).findViewById(R.id.zone_title));
//                  ((ZoneListAdapter.ZoneRoomHolder)localObject4).b = ((TextView)((View)localObject1).findViewById(R.id.zone_single_title));
//                  ((ZoneListAdapter.ZoneRoomHolder)localObject4).c = ((TextView)((View)localObject1).findViewById(R.id.zone_volume));
//                  ((ZoneListAdapter.ZoneRoomHolder)localObject4).g = ((ImageView)((View)localObject1).findViewById(R.id.volume_mute));
//                  ((ZoneListAdapter.ZoneRoomHolder)localObject4).g.setTag(localObject4);
//                  ((ZoneListAdapter.ZoneRoomHolder)localObject4).f = ((ImageView)((View)localObject1).findViewById(R.id.volume_down));
//                  ((ZoneListAdapter.ZoneRoomHolder)localObject4).f.setTag(localObject4);
//                  ((ZoneListAdapter.ZoneRoomHolder)localObject4).e = ((ImageView)((View)localObject1).findViewById(R.id.volume_up));
//                  ((ZoneListAdapter.ZoneRoomHolder)localObject4).e.setTag(localObject4);
//                  ((ZoneListAdapter.ZoneRoomHolder)localObject4).d = ((ImageView)((View)localObject1).findViewById(R.id.power));
//                  ((ZoneListAdapter.ZoneRoomHolder)localObject4).d.setTag(localObject4);
//                  ((ZoneListAdapter.ZoneRoomHolder)localObject4).g.setOnClickListener(this.n);
//                  ((ZoneListAdapter.ZoneRoomHolder)localObject4).f.setOnClickListener(this.o);
//                  ((ZoneListAdapter.ZoneRoomHolder)localObject4).f.setOnTouchListener(this.r);
//                  ((ZoneListAdapter.ZoneRoomHolder)localObject4).e.setOnTouchListener(this.q);
//                  ((ZoneListAdapter.ZoneRoomHolder)localObject4).e.setOnClickListener(this.p);
//                  ((ZoneListAdapter.ZoneRoomHolder)localObject4).d.setOnClickListener(this.s);
//                  ((ZoneListAdapter.ZoneRoomHolder)localObject4).b.setOnClickListener(this.h);
//                  ((ZoneListAdapter.ZoneRoomHolder)localObject4).b.setTag(localObject4);
//                  ((ZoneListAdapter.ZoneRoomHolder)localObject4).a.setOnClickListener(this.h);
//                  ((ZoneListAdapter.ZoneRoomHolder)localObject4).a.setTag(localObject4);
//                  ((View)localObject1).setTag(localObject4);
//                  localObject4 = localObject4;
//                }
//                ((ZoneListAdapter.ZoneRoomHolder)localObject4).j = paramInt;
//                a((ZoneListAdapter.ZoneRoomHolder)localObject4, (Room)localObject3);
//                continue;
//              }
//              if (localAddToZone == null)
//                continue;
//              localObject3 = (ZoneListAdapter.AddToZoneHolder)((View)localObject1).getTag();
//              if (localObject3 == null)
//              {
//                localObject3 = new ZoneListAdapter.AddToZoneHolder(this);
//                ((ZoneListAdapter.AddToZoneHolder)localObject3).a = ((Button)((View)localObject1).findViewById(R.id.add_zone));
//                ((ZoneListAdapter.AddToZoneHolder)localObject3).a.setOnClickListener(this.m);
//                ((ZoneListAdapter.AddToZoneHolder)localObject3).a.setTag(localObject3);
//                ((View)localObject1).setTag(localObject3);
//                localObject3 = localObject3;
//              }
//              ((ZoneListAdapter.AddToZoneHolder)localObject3).j = paramInt;
//            }
//          }
//        }
//    }
//    catch (Exception e)
//    {
//    
//    }
  }

  public int getViewTypeCount()
  {
    return 3;
  }

  public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    if ((paramInt == 2) || (paramInt == 1));
    try
    {
      if (this.e != null)
      {
        //Ln.a("Stopping room volume ramping due to scroll state changed.", new Object[0]);
        this.e.b(true);
        this.e.b(false);
        this.e = null;
      }
      return;
    }
    catch (Exception localException)
    {
    
    }
  }
}

