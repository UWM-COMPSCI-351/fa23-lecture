

import java.util.Collection;
import java.util.Iterator;

import edu.uwm.cs351.RangeCollection;
import junit.framework.TestCase;

public class TestRange extends TestCase {

	public void test00() {
		Collection<Integer> r = new RangeCollection(1,10);
		assertFalse(r.isEmpty());
		for (Iterator<Integer> it = r.iterator(); it.hasNext();) {
			Integer i = it.next();
			System.out.println(i);
		}
		for (Integer x : r) {
			System.out.println(x);
		}
		assertFalse(r.isEmpty());
		assertTrue(r.contains(5));
		assertFalse(r.contains(0));
		assertFalse(r.contains(10));
	}
	
	public void test01() {
		Collection<Integer> r = new RangeCollection(10,10);
		for (Iterator<Integer> it = r.iterator(); it.hasNext();) {
			Integer i = it.next();
			System.out.println(i);
		}
		assertEquals(0,r.size());
		assertTrue(r.isEmpty());
		r.clear();
	}
	
	public void test50() {
		Collection<Integer> r = new RangeCollection(0,10);
		try {
			r.add(-3);
			assertFalse("should have thrown an exception!", true);
		} catch (RuntimeException ex) {
			assertTrue(UnsupportedOperationException.class.isInstance(ex));
		}
	}
	
	public void test90() {
		Collection<Integer> r = new RangeCollection(0,10);
		assertFalse(r.contains(null));
	}
	
	public void test99() {
		Collection<Integer> r = new RangeCollection(-1000_000_000,1000_000_000);
		assertTrue(r.contains(9999999));
		assertFalse(r.contains(2000000000));
	}
}
