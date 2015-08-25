package com.zd.model.audio;

import java.util.Iterator;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Vector;

import roboguice.util.Ln;

import com.google.inject.Inject;
import com.zd.model.Control4Director;
import com.zd.model.HashIndex;
import com.zd.model.Room;
import com.zd.model.command.AllZonesOffCommand;
import com.zd.model.command.Command;
import com.zd.model.command.CommandFactory;
import com.zd.model.command.GetZonesCommand;
import com.zd.model.command.JoinRoomsToZoneCommand;
import com.zd.model.command.RegisterEventListenerCommand;
import com.zd.model.command.RemoveRoomsFromZoneCommand;
import com.zd.model.command.UnregisterEventListenerCommand;

public class DirectorZoneManager implements ZoneManager {
	protected static final int a = 66;
	protected static final int b = 67;
	protected static final int c = 68;
	protected static final int d = 69;

	@Inject
	protected Control4Director _director;
	protected HashIndex<Integer, DirectorZone> e;
	protected HashIndex<Integer, DirectorZone> f;
	protected boolean g = false;
	protected boolean h = false;
	protected boolean i = false;
	protected Timer j;
	protected TimerTask k;
	protected ZoneManager.OnZoneManagerUpdateListener l = null;

	private void e(int paramInt) {
		Vector localVector;
		Iterator localIterator;
		try {
			localVector = new Vector();
			if (this.f != null) {
				localIterator = this.f.f().iterator();
				while (localIterator.hasNext()) {
					Integer localInteger1 = (Integer) localIterator.next();
					DirectorZone localDirectorZone = (DirectorZone) this.f
							.a(localInteger1);
					if ((localDirectorZone == null)
							|| (localDirectorZone.g() != paramInt))
						continue;
					localVector.add(localInteger1);
				}
			}
		} catch (Exception localException) {
			Ln.e(localException);
		}
		// while (true)
		// {
		// return;
		// localIterator = localVector.iterator();
		// while (localIterator.hasNext())
		// {
		// Integer localInteger2 = (Integer)localIterator.next();
		// this.f.c(localInteger2);
		// }
		// }
	}

	public Zone a(int paramInt) {
		Zone localZone;
		if (this.e == null)
			localZone = null;
		else
			localZone = (Zone) this.e.a(paramInt);
		return localZone;
	}

	public ZoneManager.OnZoneManagerUpdateListener a() {
		return this.l;
	}

	public void a(DirectorZone paramDirectorZone) {
		if (paramDirectorZone == null)
			return;

		try {
			if (this.e != null)
				return;
			this.e = new HashIndex();
			e(paramDirectorZone.g());
			this.e.a(Integer.valueOf(paramDirectorZone.g()), paramDirectorZone);
			if (this.f != null)
				return;
			this.f = new HashIndex();
			int m = 0;
			if (m >= paramDirectorZone.e())
				return;
			Room localRoom = paramDirectorZone.a(m);
			if (localRoom == null)
				return;
			this.f.a(Integer.valueOf(localRoom.a()), paramDirectorZone);
			if (this.l == null)
				return;
			this.l.a(this);
		} catch (Exception localException) {
			Ln.e(localException);
		}

	}

	public void a(
			ZoneManager.OnZoneManagerUpdateListener paramOnZoneManagerUpdateListener) {
		this.l = paramOnZoneManagerUpdateListener;
	}

	public void a(boolean paramBoolean) {
		this.g = paramBoolean;
	}

	public boolean a(Vector<Integer> paramVector, Zone paramZone) {
		StringBuilder localStringBuilder;

		int n;
		try {
			int m = 0;
			if (this._director == null) {
				return false;
			} else {
				if ((paramZone == null) || (paramVector == null)
						|| (paramVector.size() == 0))
					return false;
				localStringBuilder = null;
				Iterator localIterator = paramVector.iterator();
				if (!localIterator.hasNext())

					m = ((Integer) localIterator.next()).intValue();
				if (paramZone.b(m) != null)

					if (localStringBuilder == null) {
						localStringBuilder = new StringBuilder(m);
						localStringBuilder.append(m);

					}
				localStringBuilder.append(",");
				localStringBuilder.append(m);

				JoinRoomsToZoneCommand localJoinRoomsToZoneCommand = (JoinRoomsToZoneCommand) CommandFactory.JoinRoomsToZoneProvider
						.get();
				localJoinRoomsToZoneCommand.a(paramZone.g());
				localJoinRoomsToZoneCommand.a(localStringBuilder.toString());
				boolean bool = this._director.a(localJoinRoomsToZoneCommand);

			}
		} catch (Exception e) {

		}
		// while (true)
		// {
		// return n;
		// label171: n = 0;
		// continue;
		// while (true)
		// {
		// label176: localStringBuilder = localStringBuilder;
		// break;
		// label183: localStringBuilder = localStringBuilder;
		// }
		// label190: if (localStringBuilder != null)
		// break label116;
		// n = 0;
		// }

		return false;
	}

	public Zone b(int paramInt) {
		Zone localZone;
		if (this.e == null)
			localZone = null;
		else
			localZone = (Zone) this.e.a(Integer.valueOf(paramInt));
		return localZone;
	}

	public void b(boolean paramBoolean) {
		this.h = paramBoolean;
		if (this.k != null)
			this.k.cancel();
		if (!paramBoolean) {
			if (this.j != null) {
				this.j.cancel();
				this.j = null;
			}
		} else {
			if (this.j == null)
				this.j = new Timer();
			// this.k = new DirectorZoneManager.1(this);
			// this.j.schedule(this.k, 25000L);
		}
	}

	public boolean b() {
		return this.g;
	}

	public boolean b(Vector<Integer> paramVector, Zone paramZone) {
		StringBuilder localStringBuilder;
		try {
			int m;
			if (this._director == null) {
				m = 0;
			} else {
				if ((paramZone == null) || (paramVector == null)
						|| (paramVector.size() == 0))
					return false;
				localStringBuilder = null;
				Iterator localIterator = paramVector.iterator();
				while (true)
					if (localIterator.hasNext()) {
						m = ((Integer) localIterator.next()).intValue();
						if (paramZone.b(m) == null)
							continue;
						if (localStringBuilder == null) {
							localStringBuilder = new StringBuilder();
							localStringBuilder.append(m);
						} else {
							localStringBuilder.append(",");
							localStringBuilder.append(m);
							RemoveRoomsFromZoneCommand localRemoveRoomsFromZoneCommand = (RemoveRoomsFromZoneCommand) CommandFactory.RemoveRoomsFromZoneProvider
									.get();
							localRemoveRoomsFromZoneCommand.a(paramZone.g());
							localRemoveRoomsFromZoneCommand
									.a(localStringBuilder.toString());
							boolean bool = this._director
									.a(localRemoveRoomsFromZoneCommand);

						}
					}
			}
		} catch (Exception e) {

		}
		// while (true)
		// {
		// return n;
		// label174: n = 0;
		// continue;
		// localStringBuilder = localStringBuilder;
		// break;
		// if (localStringBuilder != null)
		// break label119;
		// n = 0;
		// }
		return false;
	}

	public Zone c(int paramInt) {
		try {
			if (this.f != null)
				;
			for (Zone localZone = (Zone) this.f.a(Integer.valueOf(paramInt));; localZone = null)
				return localZone;
		} catch (Exception localObject) {

		}
		return null;
	}

	public boolean c() {
		return this.h;
	}

	public void d(int paramInt) {
		if (this.e != null)
			this.e.c(Integer.valueOf(paramInt));
		e(paramInt);
		if (this.l != null)
			this.l.a(this);
	}

	public boolean d() {
		return this.i;
	}

	public boolean e() {
		int n;
		try {
			int m;
			if (this._director == null) {
				m = 0;
			} else if (this.h) {
				m = 0;
			} else {
				b(true);
				GetZonesCommand localGetZonesCommand = (GetZonesCommand) CommandFactory.GetZonesProvider
						.get();
				boolean bool = this._director.a(localGetZonesCommand);
				if (!bool)
					b(false);
			}
		} catch (Exception e) {

		}
		return false;
	}

	public boolean f() {
		int m = 1;
		int n;
		try {
			if (!this.i)
				if (this._director == null) {
					return false;
				} else {
					this.i = true;
					m = this._director.m().s().a();
					RegisterEventListenerCommand localRegisterEventListenerCommand1 = (RegisterEventListenerCommand) CommandFactory.RegisterEventListenerProvider
							.get();
					localRegisterEventListenerCommand1.b(m);
					localRegisterEventListenerCommand1.a(66);
					boolean bool2 = this._director
							.a(localRegisterEventListenerCommand1);
					RegisterEventListenerCommand localRegisterEventListenerCommand2 = (RegisterEventListenerCommand) CommandFactory.RegisterEventListenerProvider
							.get();
					localRegisterEventListenerCommand2.b(m);
					localRegisterEventListenerCommand2.a(68);
					bool2 |= this._director
							.a(localRegisterEventListenerCommand2);
					localRegisterEventListenerCommand2 = (RegisterEventListenerCommand) CommandFactory.RegisterEventListenerProvider
							.get();
					localRegisterEventListenerCommand2.b(m);
					localRegisterEventListenerCommand2.a(67);
					bool2 |= this._director
							.a(localRegisterEventListenerCommand2);
					localRegisterEventListenerCommand2 = (RegisterEventListenerCommand) CommandFactory.RegisterEventListenerProvider
							.get();
					localRegisterEventListenerCommand2.b(m);
					localRegisterEventListenerCommand2.a(69);
					boolean bool1 = bool2
							| this._director
									.a(localRegisterEventListenerCommand2)
							| this._director
									.a((Command) CommandFactory.EnableEventsProvider
											.get());
					this.i = bool1;
				}
		} catch (Exception e) {

		}
		return false;
	}

	public boolean g() {
		int n;
		try {
			if (this._director == null) {
				int m = 0;
			} else {
				UnregisterEventListenerCommand localUnregisterEventListenerCommand = (UnregisterEventListenerCommand) CommandFactory.UnregisterEventListenerProvider
						.get();
				localUnregisterEventListenerCommand.b(100002);
				localUnregisterEventListenerCommand.a(66);
				boolean bool2 = this._director
						.a(localUnregisterEventListenerCommand);
				localUnregisterEventListenerCommand = (UnregisterEventListenerCommand) CommandFactory.UnregisterEventListenerProvider
						.get();
				localUnregisterEventListenerCommand.b(100002);
				localUnregisterEventListenerCommand.a(68);
				bool2 |= this._director.a(localUnregisterEventListenerCommand);
				localUnregisterEventListenerCommand = (UnregisterEventListenerCommand) CommandFactory.UnregisterEventListenerProvider
						.get();
				localUnregisterEventListenerCommand.b(100002);
				localUnregisterEventListenerCommand.a(67);
				bool2 |= this._director.a(localUnregisterEventListenerCommand);
				localUnregisterEventListenerCommand = (UnregisterEventListenerCommand) CommandFactory.UnregisterEventListenerProvider
						.get();
				localUnregisterEventListenerCommand.b(100002);
				localUnregisterEventListenerCommand.a(69);
				boolean bool1 = bool2
						| this._director.a(localUnregisterEventListenerCommand);
				this.i = false;
			}
		} catch (Exception e) {

		}
		return false;
	}

	public int h() {
		int m;
		if (this.e == null)
			m = 0;
		else
			m = this.e.c();
		return m;
	}

	public boolean i() {

		try {
			if (this._director == null) {
				return false;
			} else {
				AllZonesOffCommand localAllZonesOffCommand = (AllZonesOffCommand) CommandFactory.AllZonesOffProvider
						.get();
				return this._director.a(localAllZonesOffCommand);

			}
		} catch (Exception e) {
		}
		return false;
	}

	public void j() {
		if (this.e != null)
			this.e.clear();
		if (this.f != null)
			this.f.clear();
	}
}
