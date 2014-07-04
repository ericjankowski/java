package chapter_02.self_test_exercises;

import static org.junit.Assert.*;

import org.junit.Test;

public class ThermometerTest {

	@Test
	public void testBoilingCtoF() {
		Thermometer thermometer = new Thermometer();
		
		thermometer.setCentigrade(100.0d);
		
		assertEquals(212.0, thermometer.getFahrenheit(), 1.0);
	}
	
	@Test
	public void testBoilingFtoC() {
		Thermometer thermometer = new Thermometer();
		
		thermometer.setFahrenheit(212.0d);
		
		assertEquals(100.0, thermometer.getCentigrade(), 1.0);
	}
	
	@Test
	public void questionSixteenValue() {
		Thermometer thermometer = new Thermometer();
		
		thermometer.setCentigrade(10.0d);
		
		System.out.println(thermometer.getFahrenheit());
		
		assertEquals(50.0, thermometer.getFahrenheit(), 1.0);
	}

}
