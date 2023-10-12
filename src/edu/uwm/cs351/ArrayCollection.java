package edu.uwm.cs351;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayCollection<E> extends AbstractCollection<E> {
	private static final int INITIAL_CAPACITY = 3;

	public E[] array; // do not do this! (make public)
	private int used;
	
	private void ensureCapacity(int needed) {
		// TODO
	}
	
	@SuppressWarnings("unchecked")
	public ArrayCollection() {
		array = (E[]) new Object[INITIAL_CAPACITY]; // lie!
	}
	
	
	@Override // implementation
	public boolean add(E e) {
		ensureCapacity(used+1);
		array[used] = e;
		++used;
		return true;
	}


	@Override // required
	public Iterator<E> iterator() {
		return new MyIterator();
	}

	@Override // required
	public int size() {
		return used;
	}

	private class MyIterator implements Iterator<E> {
		int index = -1;
		
		@Override // required
		public boolean hasNext() {
			return index + 1 < used;
		}

		@Override // required
		public E next() {
			if (!hasNext()) throw new NoSuchElementException("no more");
			++index;
			return array[index];
		}

		@Override // required / implementation
		public void remove() {
			--used;
			for (int i=index; i < used; ++i) {
				array[i] = array[i+1];
			}
		}
		
	}
}
