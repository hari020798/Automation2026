package com.Automation2026;

import org.testng.annotations.Test;

public class DP {

//	data
	@Test(dataProvider = "bioData", dataProviderClass = DataProvider.class)
	public void Bio(String str1, String str2, String str3) {

		System.out.println(str1 + str2 + str3);

	}

}
