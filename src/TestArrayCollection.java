import edu.uwm.cs351.ArrayCollection;

public class TestArrayCollection extends TestCollection<String> {
	@Override
	protected void initCollections() {
		e = new String[] { null, "apples", "bread", "celery", "donuts", "eggs", "fish", "graps", "hello", "ice", "jello", "kale" };
		c = new ArrayCollection<String>();
	}

	public void test90() {
		ArrayCollection<Integer> ac = new ArrayCollection<>();
		ac.add(Integer.valueOf(42));
		Integer result = ac.array[0];
		System.out.println("a[0] = " + result);
	}
}
