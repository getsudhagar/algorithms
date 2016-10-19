package com.learn.algo.queue;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue<T> implements Queue<T> {

	private Queue<T> q1 = new LinkedList<T>();
	private Queue<T> q2 = new LinkedList<T>();

	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean contains(Object paramObject) {
		// TODO Auto-generated method stub
		return false;
	}

	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	public <T> T[] toArray(T[] paramArrayOfT) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean remove(Object paramObject) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean containsAll(Collection<?> paramCollection) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean addAll(Collection<? extends T> paramCollection) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean removeAll(Collection<?> paramCollection) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean retainAll(Collection<?> paramCollection) {
		// TODO Auto-generated method stub
		return false;
	}

	public void clear() {
		q1 = new LinkedList<T>();
		q2 = new LinkedList<T>();
	}

	public boolean add(T paramE) {
		return q1.add(paramE);
	}

	public T element() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean offer(T paramE) {
		// TODO Auto-generated method stub
		return false;
	}

	public T peek() {
		// TODO Auto-generated method stub
		return null;
	}

	public T poll() {
		
		if(q2.isEmpty()){
			while(!q1.isEmpty()){
				q2.add(q1.poll());
			}
		}
		return q2.poll();
	}

	public T remove() {
		
		if(q2.isEmpty()){
			while(!q1.isEmpty()){
				q2.add(q1.remove());
			}
		}
		return q2.remove();
		
	}

}
