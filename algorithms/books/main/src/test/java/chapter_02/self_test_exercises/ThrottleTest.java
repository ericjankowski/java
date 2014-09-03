package chapter_02.self_test_exercises;

import static org.junit.Assert.*;

import org.junit.Test;

import chapter_02.Throttle;

public class ThrottleTest {

	@Test
	public void equalsMethodTrue() {
		Throttle a = new Throttle(10, 5);
		Throttle b = new Throttle(10, 5);
		
		assertEquals(a, b);
	}
	
	@Test
	public void equalsMethodFalseForDifferentSizes() {
		Throttle a = new Throttle(10, 5);
		Throttle b = new Throttle(11, 5);
		
		assertNotEquals(a, b);
	}
	
	@Test
	public void equalsMethodFalseForDifferentPositions() {
		Throttle a = new Throttle(10, 5);
		Throttle b = new Throttle(10, 6);
		
		assertNotEquals(a, b);
	}

}
