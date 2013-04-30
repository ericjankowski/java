import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SimpleClassTest{
	@Test
	public void testStuff(){
		SimpleClass s = new SimpleClass();
		
		int result = s.times(2,2);

		assertEquals(4, result);
	}
}
