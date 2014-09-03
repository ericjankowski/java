package chapter_02.self_test_exercises;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ClockTest {
	
	Clock clock;

	@Before
	public void setUp(){
		clock = new Clock();
	}
	
	@Test
	public void defaultToMidnightHour() {
		assertEquals(12, clock.getHour());
	}
	
	@Test
	public void advance60Minutes(){
		clock.shift(60);
		
		assertEquals(1, clock.getHour());
	}

	@Test
	public void advance120Minutes(){
		clock.shift(120);
		
		assertEquals(2, clock.getHour());
	}
	
	@Test
	public void advance720Minutes(){
		clock.shift(720);
		
		assertEquals(12, clock.getHour());
	}
	
	@Test
	public void advance780Minutes(){
		clock.shift(780);
		
		assertEquals(1, clock.getHour());
	}
	
	@Test
	public void defaultToZeroMinutes(){
		assertEquals(0, clock.getMinute());
	}

	@Test
	public void advanceOneMinute(){
		clock.shift(1);
		
		assertEquals(1, clock.getMinute());
	}
	
	@Test
	public void advanceSixytyOneMinutes(){
		clock.shift(61);
		
		assertEquals(1, clock.getHour());
		assertEquals(1, clock.getMinute());
	}
	
	@Test
	public void isMorning(){
		assertEquals(false, clock.isAfternoon());
	}
	
	@Test
	public void isAfternoon(){
		clock.shift(720);
		assertEquals(true, clock.isAfternoon());
	}
	
	@Test
	public void isMorningIn24hours(){
		clock.shift(1440);
		assertEquals(false, clock.isAfternoon());
	}
	
	@Test
	public void carryTheMinutes(){
		clock.shift(31);
		clock.shift(30);
		assertEquals(1, clock.getMinute());
		assertEquals(1, clock.getHour());
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void cantSetMinuteToAnythingOver59(){
		clock.setTime(12, 60);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void cantSetHourToAnythingOver12(){
		clock.setTime(13,0);
	}
}
