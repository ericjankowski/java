package chapter_05;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayBagTest {

	@Test
	public void instantiation() {
		ArrayBag<String> bagOfStrings = new ArrayBag<String>();
		ArrayBag<Integer> bagOfIntegers = new ArrayBag<Integer>();
		
		bagOfStrings.add("Thunder");
		bagOfIntegers.add(42);
		
		assertEquals(1, bagOfStrings.size());
		assertEquals(1, bagOfIntegers.size());
	}

}
