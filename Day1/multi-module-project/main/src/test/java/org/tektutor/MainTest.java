package org.tektutor;

import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {

	@Test
	public void testGetModuleName() {

		Main mainObj = new Main();

		String actualResponse   = mainObj.getModuleName();
		String expectedResponse = "Main";

		assertEquals ( expectedResponse, actualResponse );
	}

}
