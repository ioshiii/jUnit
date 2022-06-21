package jUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAddStrings {

	@Test
	public void test() {
		jUnitFunctions fn = new jUnitFunctions();
		String result = fn.addStrings("Hello ", "World!");
		assertEquals("Hello World!", result);
	}

}
