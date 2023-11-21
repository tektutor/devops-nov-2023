package org.tektutor;

public class BusinessLayer {

	public String getModuleName() {
		DataAccessLayer dal = new DataAccessLayer();
		System.out.println ( dal.getModuleName() );
		
		return "BusinessLayer";
	}
}
