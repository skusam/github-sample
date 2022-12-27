package de.infodesign.sample;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class SampleServiceTest {

	private SampleService testee = new SampleService();
	
	@Test
	public void testSayHello() {
		testee.sayHello();
		assertTrue(true);
	}

	@Test
	public void testSayHelloString() {
		testee.sayHello("you");
		assertTrue(true);
	}

}
