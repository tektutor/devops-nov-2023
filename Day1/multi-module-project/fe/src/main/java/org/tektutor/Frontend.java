package org.tektutor;

public class Frontend {

	public String getModuleName() {
		
		BusinessLayer bl = new BusinessLayer();

		System.out.println ( bl.getModuleName() );
		return "Frontend";
	}
}
