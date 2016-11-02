package com.inhertancesample2;

public abstract class Araba {
	
	public abstract String getMarka(String marka); 
	public abstract int getModel(int model);
	
	//yeni soyut(abstract) metodlar
	public abstract void brake(int getFrenID);
	public abstract void openSunroof(int getSunroofID);
}
