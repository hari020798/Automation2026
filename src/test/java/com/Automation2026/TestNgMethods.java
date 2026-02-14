package com.Automation2026;

import org.testng.annotations.Test;

public class TestNgMethods {

	@Test(priority =  1)
	public void Animal1() {

		System.out.println("Lion");
	}

	@Test(priority = 2)
	public void Animal2() {
		// TODO Auto-generated method stub
		System.out.println("Tiger");
	}

	@Test(priority = 0)
	public void Animal4() {
		// TODO Auto-generated method stub
		System.out.println("Elephant");
	}

	@Test(priority =  -1)
	public void Animal3() {
		// TODO Auto-generated method stub
		System.out.println("Cheetah");
	}

}
