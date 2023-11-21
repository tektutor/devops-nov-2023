package org.tektutor;

public class Main {

	public String getModuleName() {
		return "Main";
	}

	public static void main ( String[] args ) {

		Frontend fe = new Frontend();
		System.out.println ( fe.getModuleName() );
	}
}
