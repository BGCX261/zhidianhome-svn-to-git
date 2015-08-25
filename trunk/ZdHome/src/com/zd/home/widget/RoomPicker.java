package com.zd.home.widget;

import roboguice.util.Ln;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ToggleButton;

import com.zd.home.R;
import com.zd.home.adapter.LocationArrayAdapter;
import com.zd.model.Building;
import com.zd.model.Floor;
import com.zd.model.Navigator;
import com.zd.model.Project;
import com.zd.model.Room;
import com.zd.model.Site;
import com.zd.model.audio.ZoneManager;

public class RoomPicker extends RelativeLayout implements
		AdapterView.OnItemClickListener {

	public enum LocationShowing {
		a, b, c, d
	}

	public interface PickerListener {
		public void a();

		public void b();

		public void c();

		public void d();

		public void e();
	}

	private RoomPicker.PickerListener a;
	private Navigator b;
	private ToggleButton c;
	private ToggleButton d;
	private ToggleButton e;
	private ToggleButton f;
	private Button g;
	private ListView h;
	private TextView i;
	private LocationArrayAdapter j;
	private Project k;
	private Site l;
	private Building m;
	private Floor n;
	private Room o;
	private RoomPicker.LocationShowing p = RoomPicker.LocationShowing.d;
	private ZoneManager q;

	public RoomPicker(Context paramContext) {
		super(paramContext);
	}

	public RoomPicker(Context paramContext, AttributeSet paramAttributeSet) {
		super(paramContext, paramAttributeSet);
	}

	public RoomPicker(Context paramContext, AttributeSet paramAttributeSet,
			int paramInt) {
		super(paramContext, paramAttributeSet, paramInt);
	}

	public Navigator a() {
		return this.b;
	}

	public RoomPicker.PickerListener b() {
		return this.a;
	}

	public Site c() {
		return this.l;
	}

	public Building d() {
		return this.m;
	}

	public Floor e() {
		return this.n;
	}

	public Room f() {
		return this.o;
	}

	protected void g() {
		this.k = this.b.getProject();
		this.l = this.b.k();
		this.m = this.b.j();
		this.n = this.b.i();
		this.o = this.b.croom();
		h();
	}

	protected void h() {
		int i1 = 4;
		if ((this.l != null) && ((this.k == null) || (this.k.k() != 1))) {
			this.c.setVisibility(0);
			this.c.setTextOn(this.l.b());
			this.c.setTextOff(this.l.b());
			this.c.setText(this.l.b());
		} else {
			this.c.setVisibility(8);
			i1 = 3;
		}
		if ((this.m != null)
				&& ((this.l == null) || (this.l.e() != 1) || (this.c
						.getVisibility() != 8))) {
			this.d.setVisibility(0);
			this.d.setTextOn(this.m.b());
			this.d.setTextOff(this.m.b());
			this.d.setText(this.m.b());
		} else {
			this.d.setVisibility(8);
			i1--;
		}
		if ((this.n != null)
				&& ((this.m == null) || (this.m.e() != 1) || (this.d
						.getVisibility() != 8))) {
			this.e.setVisibility(0);
			this.e.setTextOn(this.n.b());
			this.e.setTextOff(this.n.b());
			this.e.setText(this.n.b());
		} else {
			this.e.setVisibility(8);
			i1--;
		}
		if (this.o != null) {
			this.f.setVisibility(0);
			this.f.setTextOn(this.o.b());
			this.f.setTextOff(this.o.b());
			this.f.setText(this.o.b());
		} else {
			this.f.setVisibility(8);
			// (i1 - 1);
		}
	}

	protected void i() {
		int i1 = 0;
		Project localProject = this.b.getProject();
		if (localProject != null) {
			this.p = RoomPicker.LocationShowing.a;
			this.i.setText(R.string.choose_a_site);
			this.c.setChecked(true);
			this.d.setChecked(false);
			this.e.setChecked(false);
			this.f.setChecked(false);
			this.j.setNotifyOnChange(false);
			this.j.clear();

			while (true) {
				if (i1 >= localProject.k()) {
					this.j.notifyDataSetChanged();
					this.h.setItemChecked(this.j.getPosition(this.l), true);
					return;
				}
				this.j.add(localProject.a(i1));
				i1 += 1;
			}
		}
	}

	protected void j() {
		int i1 = 0;
		if (this.l != null) {
			this.p = RoomPicker.LocationShowing.b;
			this.i.setText(R.string.choose_a_building);
			this.c.setChecked(false);
			this.d.setChecked(true);
			this.e.setChecked(false);
			this.f.setChecked(false);
			this.j.setNotifyOnChange(false);
			this.j.clear();

			while (true) {
				if (i1 >= this.l.e()) {
					this.j.notifyDataSetChanged();
					this.h.setItemChecked(this.j.getPosition(this.m), true);
					return;
				}
				this.j.add(this.l.c(i1));
				i1 += 1;
			}
		}
	}

	protected void k() {
		int i1 = 0;
		if (this.m != null) {
			this.p = RoomPicker.LocationShowing.c;
			this.i.setText(R.string.choose_a_floor);
			this.c.setChecked(false);
			this.d.setChecked(false);
			this.e.setChecked(true);
			this.f.setChecked(false);
			this.j.setNotifyOnChange(false);
			this.j.clear();

			while (true) {
				if (i1 >= this.m.e()) {
					this.j.notifyDataSetChanged();
					this.h.setItemChecked(this.j.getPosition(this.n), true);
					return;
				}
				this.j.add(this.m.c(i1));
				i1 += 1;
			}
		}
	}

	protected void l() {
		int i1 = 0;
		this.p = RoomPicker.LocationShowing.d;
		this.i.setText(R.string.choose_a_room);
		this.c.setChecked(false);
		this.d.setChecked(false);
		this.e.setChecked(false);
		this.f.setChecked(false);
		this.j.setNotifyOnChange(false);
		this.j.clear();
		int i2 = 0;
		if (this.n == null) {
			Ln.e("No Current Floor in the project - adding all of the rooms.",
					new Object[i1]);
			while (i1 < this.k.n()) {
				this.j.add(this.k.getRoom(i1));
				i1 += 1;
			}
		} else {
			while (true) {
				if (i2 >= this.n.e()) {
					this.j.notifyDataSetChanged();
					this.h.setItemChecked(this.j.getPosition(this.o), true);
					return;
				}
				this.j.add(this.n.c(i2));
				i2 += 1;
			}
		}
	}

	protected void onFinishInflate() {
		super.onFinishInflate();
		if (!isInEditMode()) {
			this.c = ((ToggleButton) findViewById(R.id.site));
			this.c.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v) {
					i();

				}
			});
			this.d = ((ToggleButton) findViewById(R.id.building));
			this.d.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v) {
					j();
				}
			});
			this.e = ((ToggleButton) findViewById(R.id.floor));
			this.e.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v) {
					k();
				}
			});
			this.f = ((ToggleButton) findViewById(R.id.room));
			this.f.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v) {
					l();
				}
			});
			this.g = ((Button) findViewById(R.id.done));
			this.g.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v) {
					if (RoomPicker.this.a != null)
						RoomPicker.this.a.d();

				}
			});
			this.h = ((ListView) findViewById(R.id.location_list));
			this.j = new LocationArrayAdapter(getContext(), this.q);
			this.h.setAdapter(this.j);
			this.h.setOnItemClickListener(this);
			this.i = ((TextView) findViewById(R.id.selected_text));
		}
	}

	public void onItemClick(AdapterView<?> paramAdapterView, View paramView,
			int paramInt, long paramLong) {
		Object localObject;
		switch (this.p.ordinal()) {
		case 0:
			localObject = (Site) this.j.getItem(paramInt);
			if (this.l == localObject)
				break;
			setCurrentSite((Site) localObject);
			h();
			j();
			if (this.a == null)
				break;
			this.a.a();
			break;
		case 1:
			localObject = (Building) this.j.getItem(paramInt);
			if (this.m == localObject)
				break;
			setCurrentBuilding((Building) localObject);
			h();
			k();
			if (this.a == null)
				break;
			this.a.e();
			break;
		case 2:
			localObject = (Floor) this.j.getItem(paramInt);
			if (this.n == localObject)
				break;
			setCurrentFloor((Floor) localObject);
			h();
			l();
			if (this.a == null)
				break;
			this.a.c();
			break;
		case 3:
			localObject = (Room) this.j.getItem(paramInt);
			if (this.o == localObject)
				break;
			setCurrentRoom((Room) localObject);
			h();
			if (this.a == null)
				break;
			this.a.b();
		}
	}

	public void setCurrentBuilding(Building paramBuilding) {
		this.m = paramBuilding;
		if ((this.m != null) && (this.m.e() != 0)) {
			setCurrentFloor((Floor) this.m.c(0));
		} else {
			this.n = null;
			this.o = null;
		}
	}

	public void setCurrentFloor(Floor paramFloor) {
		this.n = paramFloor;
		if ((this.n != null) && (this.n.e() != 0))
			setCurrentRoom((Room) this.n.c(0));
		else
			this.o = null;
	}

	public void setCurrentRoom(Room paramRoom) {
		this.o = paramRoom;
	}

	public void setCurrentSite(Site paramSite) {
		this.l = paramSite;
		if ((this.l != null) && (this.l.e() != 0)) {
			setCurrentBuilding((Building) this.l.c(0));
		} else {
			this.m = null;
			this.n = null;
			this.o = null;
		}
	}

	public void setNavigator(Navigator paramNavigator) {
		this.b = paramNavigator;
		if (this.b.o() != null)
			setZoneManager(this.b.o().J());
		g();
		l();
	}

	public void setPickerListener(RoomPicker.PickerListener paramPickerListener) {
		this.a = paramPickerListener;
	}

	public void setVisibility(int paramInt) {
		if (paramInt == 0) {
			g();
			l();
		}
		super.setVisibility(paramInt);
	}

	public void setZoneManager(ZoneManager paramZoneManager) {
		this.q = paramZoneManager;
		if (this.j != null)
			this.j.a(paramZoneManager);
	}
}
