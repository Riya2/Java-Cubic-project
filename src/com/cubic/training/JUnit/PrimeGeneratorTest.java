package com.cubic.training.JUnit;

import static org.junit.Assert.*;

import org.junit.Test;

public class PrimeGeneratorTest {

	@Test
	public void testGetPrimeNumbers() {
		PrimeGenerator PG=new PrimeGenerator();
	    boolean b=PG.GetPrimeNumbers(2);
		assertEquals(b,true);
		
	}

}
