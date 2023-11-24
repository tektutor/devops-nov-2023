package org.tektutor;

import org.junit.Test;
import static org.junit.Assert.*;

public class HelloTest {


	@Test
	public void testSayHello() {

		Hello hello = new Hello();

		String actualResponse = hello.sayHello();
		String expectedResponse = "Hello World!";

		assertEquals ( expectedResponse, actualResponse );

	}


}
