package com.interfacesample1;

public class Civic implements Araba{

	@Override
	public String getMarka(String marka) {
		System.out.println(marka);
		return null;
	}

	@Override
	public String getModel(int model) {
	System.out.println(model);
		return null;
	}
	
}
