package com.cubic.training.JUnit;

import static org.junit.Assert.*;

import org.junit.Test;

public class getGradeTest {
	

	@Test
	public void test() {
		StudentDetail s=new StudentDetail();
		String A = s.getGrade(78);
		assertEquals(A,"B");
	}

}
