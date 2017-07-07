package com.cubic.training.JUnit;

import static org.junit.Assert.*;

import org.junit.Test;

public class CreditCardTest {

	@Test
	public void getCashRewardtest() 
	{
		CreditCard C=new CreditCard();
		int re=C.getCashReward(30);
		assertEquals(re,30);
	}

}
