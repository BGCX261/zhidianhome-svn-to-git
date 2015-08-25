package com.zd.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashIndex<Key, Value> {
	private HashMap<Key, Value> a = null;
	private ArrayList<Value> b = null;
	private boolean c = false;

	public HashIndex() {
		this.b = new ArrayList();
		this.a = new HashMap();
	}

	public HashIndex(int paramInt) {
		this.b = new ArrayList(paramInt);
		this.a = new HashMap(paramInt);
	}

	public Value a(int paramInt) {
		try {
			Value localObject1 = this.b.get(paramInt);
			return localObject1;
		} catch (Exception localObject2) {

		}
		return null;
	}

	public Value a(Key paramKey) {
		Value localObject = null;
		if ((paramKey != null) && (this.a != null))
			localObject = this.a.get(paramKey);
		return localObject;
	}

	public ArrayList<Value> a() {
		return this.b;
	}

	public void a(Key paramKey, Value paramValue) {
		if ((paramKey != null) && (paramValue != null)) {
			if (this.a == null)
				this.a = new HashMap();
			if (this.b == null)
				this.b = new ArrayList();
			Value localObject = a(paramKey);
			if ((localObject != null) && (!this.c)) {
				int i = b(localObject);
				this.b.remove(i);
				this.a.remove(paramKey);
			}
			this.b.add(paramValue);
			this.a.put(paramKey, paramValue);
		}
	}

	public void a(Key paramKey, Value paramValue, int paramInt) {
		if ((paramKey != null) && (paramValue != null)) {
			if (this.a == null)
				this.a = new HashMap();
			if (this.b == null)
				this.b = new ArrayList();
			Value localObject = a(paramKey);
			if (localObject != null) {
				int i = b(localObject);
				this.b.remove(i);
				this.a.remove(paramKey);
			}
			this.b.add(paramInt, paramValue);
			this.a.put(paramKey, paramValue);
		}
	}

	public void a(boolean paramBoolean) {
		this.c = paramBoolean;
	}

	public int b(Value paramValue) {
		int j = 0;
		int i = 0;
		if ((this.b != null) && (paramValue != null)) {
			j = c();
			i = 0;
		}

		if (i >= j) {
			i = -1;
		}
		// else
		// {
		// Object localObject = a(i);
		// if ((localObject != null) && (localObject.equals(paramValue)))
		// break;
		// i++;
		// continue;
		// i = -1;
		// }
		return i;
	}

	public Value b(int paramInt) {
		Value localObject2 = null;
		if (this.b != null)
			localObject2 = this.b.remove(paramInt);
		if ((localObject2 != null) && (this.a != null)
				&& (this.a.containsValue(localObject2))) {
			Iterator localIterator = this.a.keySet().iterator();
			while (localIterator.hasNext()) {
				Object localObject1 = localIterator.next();
				if (this.a.get(localObject1) != localObject2)
					continue;
				this.a.remove(localObject1);
			}
		}
		return localObject2;
	}

	public boolean b() {
		boolean i = false;
		if (c() != 0)
			i = false;
		else
			i = true;
		return i;
	}

	public int c() {
		int i;
		if (this.b == null)
			i = 0;
		else
			i = this.b.size();
		return i;
	}

	public Value c(Key paramKey) {
		Value localObject = null;
		if (this.a != null)
			localObject = this.a.remove(paramKey);
		if ((localObject != null) && (this.b != null))
			this.b.remove(localObject);
		return localObject;
	}

	// d()
	public void clear() {
		if (this.a != null)
			this.a.clear();
		if (this.b != null)
			this.b.clear();
	}

	public boolean d(Key paramKey) {
		boolean i = false;
		if ((paramKey != null) && (this.a != null)
				&& (this.a.get(paramKey) != null))
			i = true;
		return i;
	}

	public boolean e() {
		return this.c;
	}

	public Set<Key> f() {
		Set localSet;
		if (this.a == null)
			localSet = null;
		else
			localSet = this.a.keySet();
		return localSet;
	}
}
