package com.Automation2026;


public class TestDataProvider {
	
    
	@org.testng.annotations.DataProvider(name = "bioData", indices = {1, 2}, parallel = false)
	public static Object[][] StringMethods() {

	    Object[][] data = new Object[4][3];

	    data[0][0] = "Hariharan";
	    data[0][1] = "25";
	    data[0][2] = "Male";

	    data[1][0] = "Hanni";
	    data[1][1] = "30";
	    data[1][2] = "Female";

	    data[2][0] = "Resh";
	    data[2][1] = "24";
	    data[2][2] = "Female";

	    data[3][0] = "Manj";
	    data[3][1] = "29";
	    data[3][2] = "Male";

	    return data;
	}}
