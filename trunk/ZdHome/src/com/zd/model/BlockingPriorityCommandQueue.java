package com.zd.model;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

import com.zd.model.command.Command;

public class BlockingPriorityCommandQueue implements Serializable {
	public final class Node<T> {
		Command a;
		Node<Command> b;
		Node<Command> c;

		Node(Command paramCommand, Node<Command> paramNode1,
				Node<Command> paramNode2) {
			this.a = paramCommand;
			this.b = paramNode1;
			this.c = paramNode2;
		}

	}

	private static final long d = -387911632671998426L;
	transient BlockingPriorityCommandQueue.Node<Command> a;
	transient BlockingPriorityCommandQueue.Node<Command> b;
	final ReentrantLock c = new ReentrantLock();
	private transient int e;
	private final int f;
	private final Condition g = this.c.newCondition();
	private final Condition h = this.c.newCondition();

	public BlockingPriorityCommandQueue() {
		this(2147483647);
	}

	public BlockingPriorityCommandQueue(int paramInt) {
		if (paramInt > 0) {
			this.f = paramInt;
			return;
		}
		throw new IllegalArgumentException();
	}

	private void a(BlockingPriorityCommandQueue.Node<Command> paramNode) {
		BlockingPriorityCommandQueue.Node localNode2 = paramNode.b;
		BlockingPriorityCommandQueue.Node localNode1 = paramNode.c;
		if (localNode2 != null) {
			if (localNode1 != null) {
				localNode2.c = localNode1;
				localNode1.b = localNode2;
				paramNode.a = null;
				this.e = (-1 + this.e);
				this.h.signal();
			} else {
				f();
			}
		} else
			e();
	}

	private void a(ObjectInputStream paramObjectInputStream) {
		try {
			paramObjectInputStream.defaultReadObject();
			this.e = 0;
			this.a = null;
			this.b = null;

			Command localCommand = (Command) paramObjectInputStream
					.readObject();
			if (localCommand != null)
				a(localCommand);
		} catch (Exception e) {

		}
	}

	private void a(ObjectOutputStream paramObjectOutputStream) {
		ReentrantLock localReentrantLock = this.c;
		localReentrantLock.lock();
		try {
			paramObjectOutputStream.defaultWriteObject();
			for (BlockingPriorityCommandQueue.Node localNode = this.a; localNode != null; localNode = localNode.c)
				paramObjectOutputStream.writeObject(localNode.a);
			paramObjectOutputStream.writeObject(null);
			return;
		} catch (Exception e) {

		} finally {
			localReentrantLock.unlock();
		}

	}

	private boolean b(Command paramCommand) {
		// if (this.e < this.f) {
		// Object localObject1 = this.a;
		// Object localObject3 = null;
		// Object localObject4;
		// if (!paramCommand.g())
		// while ((localObject1 != null)
		// && (((Command) ((BlockingPriorityCommandQueue.Node) localObject1).a)
		// .h())) {
		// localObject4 = ((BlockingPriorityCommandQueue.Node) localObject1).c;
		// localObject3 = localObject1;
		// localObject1 = localObject4;
		// }
		// while (true) {
		// int i;
		// if ((localObject1 == null)
		// || (!((Command) ((BlockingPriorityCommandQueue.Node) localObject1).a)
		// .g())) {
		// localObject3 = localObject3;
		// localObject4 = localObject1;
		// localObject1 = new BlockingPriorityCommandQueue.Node(
		// paramCommand, localObject3,
		// (BlockingPriorityCommandQueue.Node) localObject4);
		// if (localObject3 != null)
		// localObject3.c = ((BlockingPriorityCommandQueue.Node) localObject1);
		// else
		// this.a = ((BlockingPriorityCommandQueue.Node) localObject1);
		// if (localObject4 != null)
		// ((BlockingPriorityCommandQueue.Node) localObject4).b =
		// ((BlockingPriorityCommandQueue.Node) localObject1);
		// else
		// this.b = ((BlockingPriorityCommandQueue.Node) localObject1);
		// this.e = (1 + this.e);
		// this.g.signal();
		// i = 1;
		// break;
		// }
		// localObject4 = i.c;
		// localObject3 = i;
		// Object localObject2 = localObject4;
		// }
		// }

		return false;
	}

	private boolean c(Command paramCommand) {
		boolean i;
		if (this.e < this.f) {
			BlockingPriorityCommandQueue.Node localNode2 = this.b;
			BlockingPriorityCommandQueue.Node localNode1 = new BlockingPriorityCommandQueue.Node(
					paramCommand, localNode2, null);
			this.b = localNode1;
			if (this.a != null)
				localNode2.c = localNode1;
			else
				this.a = localNode1;
			this.e = (1 + this.e);
			this.g.signal();
			i = true;
		} else {
			i = false;
		}
		return i;
	}

	private Command e() {
		BlockingPriorityCommandQueue.Node localNode1 = this.a;
		Command localCommand;
		if (localNode1 != null) {
			BlockingPriorityCommandQueue.Node localNode2 = localNode1.c;
			localCommand = (Command) localNode1.a;
			localNode1.a = null;
			localNode1.c = localNode1;
			this.a = localNode2;
			if (localNode2 != null)
				localNode2.b = null;
			else
				this.b = null;
			this.e = (-1 + this.e);
			this.h.signal();
		} else {
			localCommand = null;
		}
		return localCommand;
	}

	private Command f() {
		BlockingPriorityCommandQueue.Node localNode2 = this.b;
		Command localCommand;
		if (localNode2 != null) {
			BlockingPriorityCommandQueue.Node localNode1 = localNode2.b;
			localCommand = (Command) localNode2.a;
			localNode2.a = null;
			localNode2.b = localNode2;
			this.b = localNode1;
			if (localNode1 != null)
				localNode1.c = null;
			else
				this.a = null;
			this.e = (-1 + this.e);
			this.h.signal();
		} else {
			localCommand = null;
		}
		return localCommand;
	}

	private Command g() {
		ReentrantLock localReentrantLock = this.c;
		localReentrantLock.lock();
		try {
			Command localCommand = e();
			// if (localCommand == null)
			// this.g.await();
			// else
			return localCommand;
		} finally {
			localReentrantLock.unlock();
		}
		// return null;
	}

	public Command a() {
		return g();
	}

	public boolean a(Command paramCommand) {
		if (paramCommand == null)
			throw new NullPointerException();
		ReentrantLock localReentrantLock = this.c;
		localReentrantLock.lock();
		try {
			boolean bool = false;
			if ((paramCommand.h()) || (paramCommand.g())) {
				bool = b(paramCommand);
			}
			return bool;

		} finally {
			localReentrantLock.unlock();
		}

	}

	public boolean a(Object paramObject) {
		boolean i = false;
		if (paramObject == null)
			return false;

		ReentrantLock localReentrantLock = this.c;
		localReentrantLock.lock();
		try {

			// boolean bool = paramObject.equals(localNode.a);
			// if (bool)
			return true;

		} finally {
			localReentrantLock.unlock();
		}

	}

	public <T> T[] a(T[] paramArrayOfT) {
		ReentrantLock localReentrantLock = this.c;
		localReentrantLock.lock();
		try {
			// if (paramArrayOfT.length < this.e)
			// paramArrayOfT = (Object[]) (Object[]) Array.newInstance(
			// paramArrayOfT.getClass().getComponentType(), this.e);
			// int i = 0;
			// BlockingPriorityCommandQueue.Node localNode = this.a;
			// while (localNode != null) {
			// int j = i + 1;
			// paramArrayOfT[i] = localNode.a;
			// localNode = localNode.c;
			// i = j;
			// }
			// if (paramArrayOfT.length > i)
			// paramArrayOfT[i] = null;
			return null;
		} finally {
			localReentrantLock.unlock();
		}

	}

	public int b() {
		ReentrantLock localReentrantLock = this.c;
		localReentrantLock.lock();
		try {
			int i = this.e;
			return i;
		} finally {
			localReentrantLock.unlock();
		}

	}

	public Object[] c() {
		ReentrantLock localReentrantLock = this.c;
		localReentrantLock.lock();
		try {
			Object[] arrayOfObject = new Object[this.e];
			int i = 0;
			BlockingPriorityCommandQueue.Node localNode = this.a;
			while (localNode != null) {
				int j = i + 1;
				arrayOfObject[i] = localNode.a;
				localNode = localNode.c;
				i = j;
			}
			return arrayOfObject;
		} finally {
			localReentrantLock.unlock();
		}

	}

	public void d() {
		ReentrantLock localReentrantLock = this.c;
		localReentrantLock.lock();
		try {
			BlockingPriorityCommandQueue.Node localNode;
			for (Object localObject1 = this.a; localObject1 != null; localObject1 = localNode) {
				((BlockingPriorityCommandQueue.Node) localObject1).a = null;
				localNode = ((BlockingPriorityCommandQueue.Node) localObject1).c;
				((BlockingPriorityCommandQueue.Node) localObject1).b = null;
				((BlockingPriorityCommandQueue.Node) localObject1).c = null;
			}
			this.b = null;
			this.a = null;
			this.e = 0;
			this.h.signalAll();
			return;
		} finally {
			localReentrantLock.unlock();
		}

	}

	public String toString() {
		ReentrantLock localReentrantLock = this.c;
		localReentrantLock.lock();
		try {
			String str = super.toString();
			return str;
		} finally {
			localReentrantLock.unlock();
		}

	}
}
