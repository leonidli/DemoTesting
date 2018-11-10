import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class DemoTest {
	
	
//	@Before
//	public void setUp() {
//		System.out.println("Init");
//	}
	
	@Test
	public void testCheckStringForSelf() throws IncorrectDataException{
		String actual = Demo.checkString("Ivanoff");
		assertEquals("string",  "Ivanoff", actual);
	}
	
	@Test
	public void testCheckStringLength3() throws IncorrectDataException {
		String actual = Demo.checkString("Iva");
		assertEquals("string",  "IVA", actual);
	}
	
	@Test
	public void testCheckStringLength4() throws IncorrectDataException {
		String actual = Demo.checkString("Ivan");
		assertEquals("string",  "ivan", actual);
	}
	
	@Test(expected = IncorrectDataException.class)
	public void testCheckStringNull() throws IncorrectDataException {
		String actual = Demo.checkString(null);
		assertEquals("string",  "ivan", actual);
	}

//	@Test
//	public void testSomething() {
//		System.out.println("Testing");
//		assertTrue(true);
//		assertNotEquals("Names", "Ivan", "Ivan");
//	}
}

