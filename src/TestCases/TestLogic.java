package TestCases;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Logic.UpdateTheNumber;

public class TestLogic {
	
	@Test
	public void testNumberFormat() {
		
		assertEquals(00000000000033.34,UpdateTheNumber.updateNumber(33.3400));
		assertEquals(-0000000000033.34,UpdateTheNumber.updateNumber(-33.3400));
		assertEquals(00000000000033.00,UpdateTheNumber.updateNumber(33.0));
	}

}
