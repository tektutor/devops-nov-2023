package org.tektutor;

import org.junit.Test;
import static org.junit.Assert.*;

public class DataAccessLayerTest {

	@Test
	public void testGetModuleName() {

		DataAccessLayer dal = new DataAccessLayer();

		String actualResponse   = dal.getModuleName();
		String expectedResponse = "DataAccessLayer";

		assertEquals ( expectedResponse, actualResponse );
	}

}
