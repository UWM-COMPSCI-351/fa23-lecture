package edu.uwm.cs351;

public class Queue<E> {
	// a helper method which we will find useful.
        @SuppressWarnings("unchecked")
        private E[] makeArray(int size) {
		return (E[])new Object[size]; // lying...
        }

	// TODO: data structure

	/** Create an empty queue */
	public Queue() {
		// TODO
	}

	private void ensureCapacity(int s) {
		// TODO
	}

	/** Return number of elements in queue */
	public int size() {
		return -1; // TODO
	}

	/** Return whether queue is empty */
	public boolean isEmpty() {
		return false; // TODO
	}

	/** Add element to rear of queue.
	 * @param elem element to add, may be null.
	 */
	public void enqueue(E elem) {
		// TODO
	}

	/** Return front element of queue after removing it.
         * @return front element.
         */
	public E dequeue() {
		return null; // TODO
	}

	/** Return front element of queue without removing it.
         * @return front element
	 */
	public E front() {
		return null; // TODO
	}
}

