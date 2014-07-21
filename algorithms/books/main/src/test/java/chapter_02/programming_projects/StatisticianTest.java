package chapter_02.programming_projects;

import static org.junit.Assert.*;

import org.junit.Test;

public class StatisticianTest {

	@Test
	public void lengthOfSequence() {
		Statistician s = new Statistician();
		s.nextNumber(1.1);
		
		assertEquals(1, s.getLengthOfSequence());
	}
	
	@Test
	public void lengthOfSequenceMoreThanOne() {
		Statistician s = new Statistician();
		s.nextNumber(1.1);
		s.nextNumber(5.1);
		s.nextNumber(5.0);
		
		assertEquals(3, s.getLengthOfSequence());
	}
	
	@Test
	public void lastNumberOfSmallSequence(){
		Statistician s = new Statistician();
		s.nextNumber(1.1);
		
		assertEquals(1.1, s.getLastNumberOfSequence(), 0.0001);
	}
	
	@Test
	public void lastNumberOfLargerSequence(){
		Statistician s = new Statistician();
		s.nextNumber(1.1);
		s.nextNumber(5.1);
		s.nextNumber(5.0);
		
		assertEquals(5.0, s.getLastNumberOfSequence(), 0.0001);
	}
	
	@Test
	public void sumOfSmallSequence(){
		Statistician s = new Statistician();
		s.nextNumber(1.1);
		
		assertEquals(1.1, s.getSum(), 0.0001);
	}
	
	@Test
	public void sumOfLargerSequence(){
		Statistician s = new Statistician();
		s.nextNumber(1.1);
		s.nextNumber(5.1);
		s.nextNumber(5.0);
		
		assertEquals(11.2, s.getSum(), 0.0001);
	}
	
	@Test
	public void meanOfSmallSequence(){
		Statistician s = new Statistician();
		s.nextNumber(1.1);
		assertEquals(1.1, s.getMean(), 0.0001);
	}
	
	@Test
	public void meanOfLargerSequence(){
		Statistician s = new Statistician();
		s.nextNumber(2.0);
		s.nextNumber(2.0);
		s.nextNumber(2.0);
		assertEquals(2.0, s.getMean(), 0.0001);
	}
	
	@Test
	public void minOfSmallSequence(){
		Statistician s = new Statistician();
		s.nextNumber(1.1);
		assertEquals(1.1, s.getMin(), 0.0001);
	}
	
	@Test
	public void minOfLargerSequence(){
		Statistician s = new Statistician();
		s.nextNumber(1.1);
		s.nextNumber(1.0);
		s.nextNumber(12.0);
		s.nextNumber(211.0);
		assertEquals(1.0, s.getMin(), 0.0001);
	}
	
	@Test
	public void maxOfSmallSequence(){
		Statistician s = new Statistician();
		s.nextNumber(1.1);
		assertEquals(1.1, s.getMax(), 0.0001);
	}
	
	@Test
	public void maxOfLargerSequence(){
		Statistician s = new Statistician();
		s.nextNumber(1.1);
		s.nextNumber(1.0);
		s.nextNumber(12.0);
		s.nextNumber(211.0);
		assertEquals(211.0, s.getMax(), 0.0001);
	}
	
	@Test
	public void maxOfAnEmptySequence(){
		Statistician s = new Statistician();
		assertEquals(Double.NaN, s.getMax(), 0.0001);
	}

	@Test
	public void minOfAnEmptySequence(){
		Statistician s = new Statistician();
		assertEquals(Double.NaN, s.getMin(), 0.0001);
	}
	
	@Test
	public void meanOfAnEmptySequence(){
		Statistician s = new Statistician();
		assertEquals(Double.NaN, s.getMean(), 0.0001);
	}
	
	@Test
	public void lastNumberOfAnEmptySequence(){
		Statistician s = new Statistician();
		assertEquals(Double.NaN, s.getLastNumberOfSequence(), 0.0001);
	}
}
