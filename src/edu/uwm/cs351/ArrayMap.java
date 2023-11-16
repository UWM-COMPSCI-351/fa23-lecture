package edu.uwm.cs351;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class ArrayMap<E> extends AbstractMap<Integer, E> {
	private final E[] array;
	public ArrayMap(E[] array) {
		this.array = array;
	}
	
	@Override // required
	public Set<Entry<Integer, E>> entrySet() {
		return new EntrySet();
	}

	@Override // implementation
	public E put(Integer key, E value) {
		E old = array[key];
		array[key] = value;
		return old;
	}

	@Override // efficiency
	public E get(Object key) {
		Integer index = (Integer)key;
		if (index < 0 || index >= array.length) return null;
		return array[index];
	}

	private class EntrySet extends AbstractSet<Map.Entry<Integer,E>> {

		@Override // required
		public int size() {
			return array.length;
		}

		@Override // required
		public Iterator<Entry<Integer, E>> iterator() {
			return new MyIterator();
		}
		
	}
	
	private class MyIterator implements Iterator<Map.Entry<Integer, E>> {

		int index = -1;
		
		@Override
		public boolean hasNext() {
			return index + 1 < array.length;
		}

		@Override
		public Entry<Integer, E> next() {
			if (!hasNext()) throw new NoSuchElementException("no more");
			++index;
			// need to use AbstractEntry
			return new DefaultEntry<Integer, E>(index, array[index]); // XXX: Won't work
		}
		
	}
}
