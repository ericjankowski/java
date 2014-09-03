package chapter_02.programming_projects;

import static org.junit.Assert.*;

import org.junit.Test;

public class LockTest {

	@Test
	public void successfulOpen() {
		Lock lock = new Lock(2, 4, 6);
		
		lock.turn("CLOCKWISE", 2);
		lock.turn("COUNTER_CLOCKWISE", 4);
		lock.turn("CLOCKWISE", 6);
		
		assertEquals("SUCCESS!! Lock is OPEN.", lock.attemptToOpen());
	}
	
	@Test
	public void failOnFirstTarget() {
		Lock lock = new Lock(2, 4, 6);
		
		lock.turn("CLOCKWISE", 1);
		lock.turn("COUNTER_CLOCKWISE", 4);
		lock.turn("CLOCKWISE", 6);
		
		assertEquals("FAILURE!! Lock is not OPEN.", lock.attemptToOpen());
	}
	
	@Test
	public void failOnSecondTarget() {
		Lock lock = new Lock(2, 4, 6);
		
		lock.turn("CLOCKWISE", 2);
		lock.turn("COUNTER_CLOCKWISE", 5);
		lock.turn("CLOCKWISE", 6);
		
		assertEquals("FAILURE!! Lock is not OPEN.", lock.attemptToOpen());
	}
	
	@Test
	public void failOnThirdTarget() {
		Lock lock = new Lock(2, 4, 6);
		
		lock.turn("CLOCKWISE", 2);
		lock.turn("COUNTER_CLOCKWISE", 4);
		lock.turn("CLOCKWISE", 7);
		
		assertEquals("FAILURE!! Lock is not OPEN.", lock.attemptToOpen());
	}
	
	@Test
	public void failOnFirstDirection() {
		Lock lock = new Lock(2, 4, 6);
		
		lock.turn("COUNTER_CLOCKWISE", 2);
		lock.turn("COUNTER_CLOCKWISE", 4);
		lock.turn("CLOCKWISE", 6);
		
		assertEquals("FAILURE!! Lock is not OPEN.", lock.attemptToOpen());
	}
	
	@Test
	public void failOnSecondDirection() {
		Lock lock = new Lock(2, 4, 6);
		
		lock.turn("CLOCKWISE", 2);
		lock.turn("CLOCKWISE", 4);
		lock.turn("CLOCKWISE", 6);
		
		assertEquals("FAILURE!! Lock is not OPEN.", lock.attemptToOpen());
	}
	
	@Test
	public void failOnThirdDirection() {
		Lock lock = new Lock(2, 4, 6);
		
		lock.turn("CLOCKWISE", 2);
		lock.turn("COUNTER_CLOCKWISE", 4);
		lock.turn("COUNTER_CLOCKWISE", 6);
		
		assertEquals("FAILURE!! Lock is not OPEN.", lock.attemptToOpen());
	}
	
	@Test
	public void randomOneHundredTestsForOpening() {
		for(int i = 0; i < 100; i++){
			Lock lock = new Lock(2, 4, 6);
			String turns = "";
			int numberOfBadTurns = (int)(Math.random()*100);
			for(int j = 0; j < numberOfBadTurns;j ++){
				String direction = ((int)(Math.random()*1000000))%2 == 0 ? "CLOCKWISE" : "COUNTER_CLOCKWISE";
				int target = (int)(Math.random()*39);
				turns += "Turning " + direction + " to " + target + "\n"; 
				lock.turn(direction, target);
			}
			lock.turn("COUNTER_CLOCKWISE", 7);
			lock.turn("CLOCKWISE", 2);
			lock.turn("COUNTER_CLOCKWISE", 4);
			lock.turn("CLOCKWISE", 6);
		
			assertEquals(turns, "SUCCESS!! Lock is OPEN.", lock.attemptToOpen());
		}
	}

}
