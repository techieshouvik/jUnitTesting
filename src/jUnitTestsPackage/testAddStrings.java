package jUnitTestsPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddStrings {

	@Test
	public void test(){
		jUnitFunction junit = new jUnitFunction();
		String result = junit.addStrings("100","200");
		assertEquals ("100200",result);
	}

}
