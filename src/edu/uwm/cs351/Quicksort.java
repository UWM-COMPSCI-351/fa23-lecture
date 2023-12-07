package edu.uwm.cs351;

import java.util.Comparator;

public class Quicksort<T> {
	private final Comparator<T> comparator;
	
	public Quicksort(Comparator<T> comp) {
		comparator = comp;
	}
	
	private int partition(T[] array, int lo, int hi) {
		int hole = lo;
		T pivot = array[hole];
		--hi;
		while (lo < hi) {
			if (hole == lo) {
				if (comparator.compare(pivot, array[hi]) <= 0) {
					--hi;
				} else {
					array[hole] = array[hi];
					hole = hi;
				}
			} else if (hole == hi) {
				if (comparator.compare(pivot,  array[lo]) > 0) {
					++lo;
				} else {
					array[hole] = array[lo];
					hole = lo;
				}
			}
		}
		array[hole] = pivot;
		return hole;
	}
	
	public void sort(T[] array, int lo, int hi) {
		
	}
	
	public void sort(T[] array) {
		sort(array, 0, array.length);
	}
}
