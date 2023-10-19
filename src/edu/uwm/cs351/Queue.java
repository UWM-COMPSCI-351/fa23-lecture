package edu.uwm.cs351;

import java.util.NoSuchElementException;

public class Queue<E> {
	// a helper method which we will find useful.
        @SuppressWarnings("unchecked")
    private E[] makeArray(int size) {
		return (E[])new Object[size]; // lying...
    }

	// TODO: data structure
        
    private int manyItems;
    private E[] data;
    private int front;
    
    private final static int DEFAULT_CAPACITY = 6;

	/** Create an empty queue */
	public Queue() {
		data = makeArray(DEFAULT_CAPACITY);
		manyItems = 0;
	}

	private void ensureCapacity(int s) {
		if (data.length >= s) return;
		int newCap;
		if (data.length * 2 >= s)
			newCap = data.length * 2;
		else
			newCap = s;
		E[] newData = makeArray(newCap);
		for (int i=0; i<manyItems; i++)
			newData[i] = data[wrapIndex(front + i)];
		data = newData;
		front = 0;
	}
	
	private int wrapIndex(int i) {
		return i % data.length;
	}

	/** Return number of elements in queue */
	public int size() {
		return manyItems; // TODO
	}

	/** Return whether queue is empty */
	public boolean isEmpty() {
		return manyItems == 0; // TODO
	}

	/** Add element to rear of queue.
	 * @param elem element to add, may be null.
	 */
	public void enqueue(E elem) {
		if (elem == null)
			throw new IllegalArgumentException("can't enqueue null");
		ensureCapacity(manyItems+1);
		data[wrapIndex(front + manyItems)] = elem;
		++manyItems;
	}

	/** Return front element of queue after removing it.
         * @return front element.
         */
	public E dequeue() {
		if (isEmpty())
			throw new NoSuchElementException("called dequeue on empty queue");
		E result = data[front];
		front = wrapIndex(front + 1);
		--manyItems;
		return result; // TODO
	}

	/** Return front element of queue without removing it.
         * @return front element
	 */
	public E front() {
		if (isEmpty())
			throw new NoSuchElementException("called front on empty queue");
		return data[front]; // TODO
	}
}

