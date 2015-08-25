package com.zd.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.inject.Inject;
import com.zd.home.R;
import com.zd.model.Navigator;
import com.zd.model.Room;
import com.zd.model.device.Device;

public abstract class DeviceListAdapter extends ArrayAdapter<Device> {
	private Drawable A;
	protected final LayoutInflater a;
	protected int b;
	private Drawable c;
	private Drawable d;
	private Drawable e;
	private Drawable f;
	private Drawable g;
	private Drawable h;
	private Drawable i;
	private Drawable j;
	private Drawable k;
	private Drawable l;
	private Drawable m;
	private Drawable n;
	private Drawable o;
	private Drawable p;
	private Drawable q;
	private Drawable r;
	private Drawable s;
	private Drawable t;
	private Drawable u;
	private Drawable v;
	private Drawable w;
	private Drawable x;
	private Drawable y;
	private Drawable z;

	@Inject
	public DeviceListAdapter(Context paramContext, int paramInt) {
		super(paramContext, R.layout.list_item);
		this.b = paramInt;
		this.a = LayoutInflater.from(paramContext);
	}

	protected Drawable a(Device.DeviceType paramDeviceType, int paramInt) {
		Drawable localDrawable;
		switch (paramDeviceType.ordinal()) {
		default:
			if (this.m == null)
				this.m = b(paramDeviceType, paramInt);
			localDrawable = this.m;
			break;
		case 1:
			if (this.c == null)
				this.c = b(paramDeviceType, paramInt);
			localDrawable = this.c;
			break;
		case 2:
			if (this.d == null)
				this.d = b(paramDeviceType, paramInt);
			localDrawable = this.d;
			break;
		case 3:
			if (this.s == null)
				this.s = b(paramDeviceType, paramInt);
			localDrawable = this.s;
			break;
		case 4:
			if (this.e == null)
				this.e = b(paramDeviceType, paramInt);
			localDrawable = this.e;
			break;
		case 5:
			if (this.f == null)
				this.f = b(paramDeviceType, paramInt);
			localDrawable = this.f;
			break;
		case 6:
			if (this.g == null)
				this.g = b(paramDeviceType, paramInt);
			localDrawable = this.g;
			break;
		case 7:
			if (this.h == null)
				this.h = b(paramDeviceType, paramInt);
			localDrawable = this.h;
			break;
		case 8:
			if (this.i == null)
				this.i = b(paramDeviceType, paramInt);
			localDrawable = this.i;
			break;
		case 9:
			if (this.j == null)
				this.j = b(paramDeviceType, paramInt);
			localDrawable = this.j;
			break;
		case 10:
			if (this.k == null)
				this.k = b(paramDeviceType, paramInt);
			localDrawable = this.k;
			break;
		case 11:
		case 12:
			if (this.l == null)
				this.l = b(paramDeviceType, paramInt);
			localDrawable = this.l;
			break;
		case 13:
			if (this.n == null)
				this.n = b(paramDeviceType, paramInt);
			localDrawable = this.n;
			break;
		case 14:
			if (this.o == null)
				this.o = b(paramDeviceType, paramInt);
			localDrawable = this.o;
			break;
		case 15:
			if (this.p == null)
				this.p = b(paramDeviceType, paramInt);
			localDrawable = this.p;
			break;
		case 16:
			if (this.q == null)
				this.q = b(paramDeviceType, paramInt);
			localDrawable = this.q;
			break;
		case 17:
			if (this.r == null)
				this.r = b(paramDeviceType, paramInt);
			localDrawable = this.r;
			break;
		case 18:
			if (this.t == null)
				this.t = b(paramDeviceType, paramInt);
			localDrawable = this.t;
			break;
		case 19:
			if (this.u == null)
				this.u = b(paramDeviceType, paramInt);
			localDrawable = this.u;
			break;
		case 20:
			if (this.v == null)
				this.v = b(paramDeviceType, paramInt);
			localDrawable = this.v;
			break;
		case 21:
			if (this.w == null)
				this.w = b(paramDeviceType, paramInt);
			localDrawable = this.w;
			break;
		case 22:
			if (this.x == null)
				this.x = b(paramDeviceType, paramInt);
			localDrawable = this.x;
			break;
		case 23:
			if (this.y == null)
				this.y = b(paramDeviceType, paramInt);
			localDrawable = this.y;
			break;
		case 24:
			if (this.z == null)
				this.z = b(paramDeviceType, paramInt);
			localDrawable = this.z;
			break;
		case 25:
			if (this.A == null)
				this.A = b(paramDeviceType, paramInt);
			localDrawable = this.A;
		}
		return localDrawable;
	}

	public abstract void a(Room paramRoom);

	public int b() {
		return this.b;
	}

	protected Drawable b(Device.DeviceType paramDeviceType, int paramInt) {
		int i1 = Navigator.a(paramDeviceType, paramInt);
		return getContext().getResources().getDrawable(i1);
	}

	public View getView(int paramInt, View paramView, ViewGroup paramViewGroup) {

		Holder localObject1;
		View localView1;
		if (paramView == null) {
			localView1 = this.a.inflate(R.layout.list_item, null);
			localObject1 = new DeviceListAdapter.Holder(this);
			((DeviceListAdapter.Holder) localObject1).a = ((TextView) localView1
					.findViewById(R.id.item_text));
			((DeviceListAdapter.Holder) localObject1).b = ((ImageView) localView1
					.findViewById(R.id.icon));
			localView1.setTag(localObject1);
			paramView = localView1;
		} else {
			localObject1 = (DeviceListAdapter.Holder) paramView.getTag();
		}

		Device device = (Device) getItem(paramInt);
		if (device == null)
			return paramView;
		String str = device.getName();
		if (str == null)
			str = "";
		localObject1.a.setText(str);
		localObject1.b.setImageDrawable(a(device.getType(), this.b));
		return paramView;

	}

	public class Holder {
		TextView a;
		ImageView b;

		public Holder(DeviceListAdapter paramDeviceListAdapter) {
		}
	}
}
