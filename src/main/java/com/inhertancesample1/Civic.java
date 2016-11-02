package com.inhertancesample1;

public class Civic extends Araba{

	@Override
	public String getMarka(String marka) {
		
		System.out.println(marka);
		return null;
	}

	@Override
	public int getModel(int model) {
	System.out.println(model);
		return 0;
	}
	
}
