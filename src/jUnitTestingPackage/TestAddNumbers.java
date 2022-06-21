package jUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAddNumbers {

	@Test
	public void test() {
		jUnitFunctions fn = new jUnitFunctions();
		int result = fn.addNumbers(100, 200);
		assertEquals(300, result);
	}

}
