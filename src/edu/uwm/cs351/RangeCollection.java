package edu.uwm.cs351;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class RangeCollection extends AbstractCollection<Integer> {

	private final int lo, hi;
	
	@Override // required
	public Iterator<Integer> iterator() {
		return new MyIterator();
	}

	@Override // required
	public int size() {
		// TODO Auto-generated method stub
		return hi - lo;
	}

	/** Create the range [lo, hi)
	 * @param lo lower bound (inclusive)
	 * @param hi upper bound (exclusive)
	 */
	public RangeCollection(int lo, int hi) {
		this.lo = lo;
		this.hi = hi;
	}
	
	private class MyIterator implements Iterator<Integer> {

		int current = lo;
		
		@Override // required
		public boolean hasNext() {
			return current + 1 < hi;
		}

		@Override // required
		public Integer next() {
			if (!hasNext()) throw new NoSuchElementException("no more");
			return ++current;
		}
		
	}
}
