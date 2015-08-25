// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.zd.home.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.ToggleButton;

import com.zd.home.R;
import com.zd.model.device.Device.OnDeviceUpdateListener;
import com.zd.model.device.Light;

public abstract class LightDeviceBaseAdapter extends ArrayAdapter {

	public LightDeviceBaseAdapter(Context context) {
		super(context, R.layout.light_list_item);
		b = false;
		a = LayoutInflater.from(context);
		c = context.getResources().getDrawable(R.drawable.light_list_item);
		d = context.getResources().getDrawable(R.drawable.light_list_item_alt);
		e = context.getResources().getDrawable(
				R.drawable.light_toggle_list_item);
		f = context.getResources().getDrawable(
				R.drawable.light_toggle_list_item_alt);
		g = context.getResources().getDrawable(R.drawable.bkg_light_div);
		h = context.getResources().getDrawable(R.drawable.bkg_light_div_alt);
	}

	private void a(Holder holder, Light light, boolean flag) {
		int k = light.c();
		if (light.b()) {
			if (flag && holder.e != null)
				holder.e.setProgress(k);
			if (holder.f != null)
				holder.f.setText((new StringBuilder()).append(k).append("%")
						.toString());
		}
		android.content.res.ColorStateList colorstatelist = a.getContext()
				.getResources().getColorStateList(R.color.list_item_text);
		if (k <= 0) {
			holder.b.setImageResource(R.drawable.light_bulb);
		} else {
			holder.b.setImageResource(R.drawable.light_bulb_on);
			colorstatelist = a.getContext().getResources()
					.getColorStateList(R.color.light_on_text_color);
		}
		if (holder.c != null)
			holder.c.setTextColor(colorstatelist);
		if (holder.d != null)
			holder.d.setTextColor(colorstatelist);
		if (holder.f != null)
			holder.f.setTextColor(colorstatelist);
	}

	static void a(LightDeviceBaseAdapter lightdevicebaseadapter, Holder holder,
			Light light, boolean flag) {
		lightdevicebaseadapter.a(holder, light, flag);
	}

	protected String a(int k) {
		return "";
	}

	public abstract void a();

	public void a(OnDeviceUpdateListener ondeviceupdatelistener) {
		int k = 0;
		do {
			if (k >= getCount())
				return;
			Light light = (Light) getItem(k);
			if (!light.B())
				light.q();
			if (light.A())
				light.p();
			light.a(ondeviceupdatelistener);
			k++;
		} while (true);
	}

	protected void a(boolean flag) {
		b = flag;
	}

	public void b() {
		int k = 0;
		do {
			if (k >= getCount())
				return;
			Light light = (Light) getItem(k);
			light.a(null);
			light.C();
			k++;
		} while (true);
	}

	public int getItemViewType(int k) {
		Light light = (Light) getItem(k);
		if (light == null)
			return 0;
		boolean flag = light.b();
		if (flag)
			return 0;
		return 1;
	}

	public View getView(int k, View view, ViewGroup viewgroup) {
		Holder holder = null;
		View view1 = null;
		Light obj1 = (Light) getItem(k);
		LightHolder obj = new LightHolder();
		obj.a = obj1;
		if (view == null) {
			if (obj1.b()) {
				view1 = a.inflate(R.layout.light_list_item, null);
			} else
				view1 = a.inflate(R.layout.light_toggle_list_item, null);
			holder = new Holder();
			holder.a = k;
			holder.b = (ImageButton) view1.findViewById(R.id.power);
			obj.b = holder;
			holder.b.setTag(holder);
			holder.b.setOnClickListener(i);
			holder.c = (TextView) view1.findViewById(R.id.device_name);
			holder.d = (TextView) view1.findViewById(R.id.room);
			holder.d.setVisibility(0);
			holder.e = (SeekBar) view1.findViewById(R.id.seekbar);
			// holder.e.setTag(obj);
			// holder.e.setOnSeekBarChangeListener(j);
			holder.f = (TextView) view1.findViewById(R.id.percentage);
			holder.i = (ImageView) view1
					.findViewById(R.id.percentage_separator);
			holder.h = (ImageView) view1
					.findViewById(R.id.bulb_button_separator);
			view1.setTag(holder);
		} else {
			view1 = view;
			holder = (Holder) view.getTag();
		}

		holder.c.setText(obj1.getName());
		if (b)
			holder.d.setText(a(((Light) (obj1)).v()));
		a(holder, ((Light) (obj1)), true);
		if (!((Light) (obj1)).b()) // goto _L19; else goto _L18
		// _L18:
			holder.c.setLines(1);
		holder.c.setMaxLines(1);
		holder.c.setHorizontallyScrolling(true);
		holder.c.setEllipsize(android.text.TextUtils.TruncateAt.END);

		// holder.c.setLines(2);
		// holder.c.setMaxLines(2);
		// holder.c.setHorizontallyScrolling(false);
		// holder.c.setEllipsize(android.text.TextUtils.TruncateAt.END);

		return view1;

		// holder.e.setPadding(10, l, 10, i1);
		// holder.e.setThumbOffset(14);

		// _L2:
		// holder = (Holder)null.getTag();
		// obj.b = holder;
		// view1 = null;
		// holder = holder;
		// goto _L25
		// _L31:
		// view1.setBackgroundDrawable(d);
		// if(holder.h != null)
		// holder.h.setBackgroundDrawable(h);
		// if(holder.i != null)
		// holder.i.setBackgroundDrawable(h);
		// goto _L26
		// _L16:
		// if(holder.e != null)
		// holder.e.setVisibility(8);
		// if(holder.f != null)
		// holder.f.setVisibility(8);
		// goto _L27
		// _L32:
		// view1.setBackgroundDrawable(e);
		// if(holder.h != null)
		// holder.h.setBackgroundDrawable(g);
		// goto _L26
		// _L33:
		// view1.setBackgroundDrawable(f);
		// if(holder.h != null)
		// holder.h.setBackgroundDrawable(h);
		// goto _L26
		// _L19:

		// _L17:
		// if(k != 0 && k % 2 != 0) goto _L31; else goto _L30
		// goto _L29
		// _L27:
		// if(k != 0 && k % 2 != 0) goto _L33; else goto _L32

	}

	public int getViewTypeCount() {
		return 2;
	}

	private final LayoutInflater a;
	private boolean b;
	private final Drawable c;
	private final Drawable d;
	private final Drawable e;
	private final Drawable f;
	private final Drawable g;
	private final Drawable h;
	private final android.view.View.OnClickListener i = new _cls1();
	private final android.widget.SeekBar.OnSeekBarChangeListener j = new _cls2();

	private class _cls1 implements android.view.View.OnClickListener {

		public void onClick(View view) {
			// Ln.a((new
			// StringBuilder()).append("* OnPowerClicked for light button: ").append(view).toString(),
			// new Object[0]);
			Object obj = (LightHolder) view.getTag();
			Holder holder = ((LightHolder) (obj)).b;
			obj = ((LightHolder) (obj)).a;
			// Ln.a((new
			// StringBuilder()).append("* Toggling Light: ").append(((Light)
			// (obj)).u()).append(", for power clicked: ").append(view).toString(),
			// new Object[0]);
			((Light) (obj)).d();
			LightDeviceBaseAdapter.a(a, holder, ((Light) (obj)), true);
		}

		final LightDeviceBaseAdapter a;

		_cls1() {
			a = LightDeviceBaseAdapter.this;
			// super();
		}
	}

	private class _cls2 implements
			android.widget.SeekBar.OnSeekBarChangeListener {

		Handler a(_cls2 _pcls2) {
			return _pcls2.b;
		}

		Light b(_cls2 _pcls2) {
			return _pcls2.c;
		}

		int c(_cls2 _pcls2) {
			return _pcls2.d;
		}

		Runnable d(_cls2 _pcls2) {
			return _pcls2.e;
		}

		public void onProgressChanged(SeekBar seekbar, int k, boolean flag) {
			if (flag) {
				d = k;
				Holder holder = ((LightHolder) seekbar.getTag()).b;
				LightDeviceBaseAdapter.a(a, holder, c, false);
			}
		}

		public void onStartTrackingTouch(SeekBar seekbar) {
			LightHolder lightholder = (LightHolder) seekbar.getTag();
			Holder _tmp = lightholder.b;
			c = lightholder.a;
			b.postDelayed(e, 250L);
		}

		public void onStopTrackingTouch(SeekBar seekbar) {
			Handler handler = b;
			e.run();
			Holder holder = ((LightHolder) seekbar.getTag()).b;
			LightDeviceBaseAdapter.a(a, holder, c, false);
			c = null;
			return;
		}

		LightDeviceBaseAdapter a;
		private final Handler b = new Handler();
		private Light c;
		private int d;
		private final Runnable e = new _cls1();

		// a = LightDeviceBaseAdapter.this;
		class _cls1 implements Runnable {

			public void run() {
				// Handler handler = _cls2.a(a);
				// handler;
				// JVM INSTR monitorenter ;
				// if(_cls2.b(a) != null)
				// {
				// _cls2.b(a).b(_cls2.c(a));
				// _cls2.a(a).postDelayed(_cls2.d(a), 250L);
				// }
				return;
			}

			final _cls2 a;

			_cls1() {
				a = _cls2.this;

			}
		}

	}

	private class Holder {

		public int a;
		ImageButton b;
		TextView c;
		TextView d;
		SeekBar e;
		TextView f;
		ToggleButton g;
		ImageView h;
		ImageView i;
		final LightDeviceBaseAdapter j;

		public Holder() {
			j = LightDeviceBaseAdapter.this;
			// super();
		}
	}

	private class LightHolder {

		public Light a;
		public Holder b;
		final LightDeviceBaseAdapter c;

		public LightHolder() {
			c = LightDeviceBaseAdapter.this;
			// super();
		}
	}

}
