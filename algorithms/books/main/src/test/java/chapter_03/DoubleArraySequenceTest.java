package chapter_03;

import static org.junit.Assert.*;

import org.junit.Test;

public class DoubleArraySequenceTest {

	@Test
	public void buildOneElementSequenceWithAddBefore() {
		DoubleArraySequence sequence = new DoubleArraySequence(1);
		sequence.start();
		sequence.addBefore(0.1d);
		
		assertEquals(0.1d, sequence.getCurrent(), 0.00001);
		assertEquals(1, sequence.size());
	}
	
	@Test
	public void buildOneElementSequenceWithAddAfter() {
		DoubleArraySequence sequence = new DoubleArraySequence(1);
		sequence.start();
		sequence.addAfter(0.1d);
		
		assertEquals(0.1d, sequence.getCurrent(), 0.00001);
		assertEquals(1, sequence.size());
	}
	
	@Test
	public void buildTwoElementSequenceWithAddBefore() {
		DoubleArraySequence sequence = new DoubleArraySequence(1);
		sequence.start();
		sequence.addBefore(0.2d);
		sequence.addBefore(0.1d);
		
		sequence.start();
		assertEquals(0.1d, sequence.getCurrent(), 0.00001);
		sequence.advance();
		assertEquals(0.2d, sequence.getCurrent(), 0.00001);
		assertEquals(2, sequence.size());
	}
	
	@Test
	public void buildTwoElementSequenceWithAddAfter() {
		DoubleArraySequence sequence = new DoubleArraySequence(1);
		sequence.start();
		sequence.addAfter(0.1d);
		sequence.addAfter(0.2d);
		
		sequence.start();
		assertEquals(0.1d, sequence.getCurrent(), 0.00001);
		sequence.advance();
		assertEquals(0.2d, sequence.getCurrent(), 0.00001);
		assertEquals(2, sequence.size());
	}
	
	@Test
	public void buildThreeElementSequenceWithAddAfter() {
		DoubleArraySequence sequence = new DoubleArraySequence(1);
		sequence.start();
		sequence.addAfter(0.1d);
		sequence.addAfter(0.3d);
		sequence.addAfter(0.2d);
		
		sequence.start();
		assertEquals(0.1d, sequence.getCurrent(), 0.00001);
		sequence.advance();
		assertEquals(0.2d, sequence.getCurrent(), 0.00001);
		sequence.advance();
		assertEquals(0.3d, sequence.getCurrent(), 0.00001);
		assertEquals(3, sequence.size());
	}
	
	@Test
	public void removeAnElement() {
		DoubleArraySequence sequence = new DoubleArraySequence(1);
		sequence.start();
		sequence.addAfter(0.1d);
		sequence.addAfter(0.3d);
		sequence.addAfter(0.2d);
		sequence.removeCurrent();
		
		sequence.start();
		assertEquals(0.2d, sequence.getCurrent(), 0.00001);
		sequence.advance();
		assertEquals(0.3d, sequence.getCurrent(), 0.00001);
		assertEquals(2, sequence.size());
	}
	
	@Test
	public void removeADifferentElement() {
		DoubleArraySequence sequence = new DoubleArraySequence(1);
		sequence.start();
		sequence.addAfter(0.1d);
		sequence.addAfter(0.3d);
		sequence.addAfter(0.2d);
		sequence.start();
		sequence.advance();
		sequence.removeCurrent();
		
		sequence.start();
		assertEquals(0.1d, sequence.getCurrent(), 0.00001);
		sequence.advance();
		assertEquals(0.3d, sequence.getCurrent(), 0.00001);
		assertEquals(2, sequence.size());
	}
	
	@Test
	public void removeLastElement() {
		DoubleArraySequence sequence = new DoubleArraySequence(1);
		sequence.start();
		sequence.addAfter(0.1d);
		sequence.addAfter(0.3d);
		sequence.addAfter(0.2d);
		sequence.start();
		sequence.advance();
		sequence.advance();
		sequence.removeCurrent();
		
		sequence.start();
		System.out.println(sequence);
		assertEquals(0.1d, sequence.getCurrent(), 0.00001);
		sequence.advance();
		assertEquals(0.2d, sequence.getCurrent(), 0.00001);
		assertEquals(2, sequence.size());
	}
}
