package com.Automation2026;


public class DataProvider {
	
    
	@org.testng.annotations.DataProvider(indices = {1,2}, parallel =  !true)
	
	public static String[][] StringMethods() {
		
		String [] [] data = new String [3] [2];
		
		data [0] [0] = "Hariharan";
		data [0] [1] = "25";
		
		data [1] [0] = "Hanni";
		data [1] [1] = "30";
		
		data [2] [0] = "Resh";
		data [2] [1] = "24";
		
		return data;
		
	}

}
