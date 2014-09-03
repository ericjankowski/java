package chapter_02;

import static org.junit.Assert.*;

import org.junit.Test;

public class LocationTest {

	@Test
	public void testingSomeCloning() {
		Location original = new Location(2.0d, 2.0d);
		
		Location clone = original.clone();
		
		assertEquals(original, clone);
		assertFalse(original == clone);
	}

}
