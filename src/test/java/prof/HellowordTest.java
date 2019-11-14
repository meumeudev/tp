package prof;

import static org.junit.Assert.*;

import org.junit.Test;

import test.Helloword;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class HellowordTest {

	private Helloword subject;

	@Before
	public void setup() {
		subject = new Helloword();
	}
	
	@Test
	public void testGetMessage() {
		assertEquals("Hello World!", subject.getMessage(null));
	}

	@Test
	public void testGetMessage2() {
		assertEquals("Hello Tonux!", subject.getMessage("Tonux"));
	}

	@Test
	public void testSum(){
		assertEquals(4, subject.sum(2,2));
	}
	
}
