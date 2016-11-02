package com.inhertancesample3;

public abstract class Araba {
	
	public abstract String getMarka(String marka); 
	
	//yeni soyut(abstract) metodlar
	public abstract void brake(int getFrenID);
	public abstract void openSunroof(int getSunroofID);
	
	//yeni gövdeli metod. Bu sýnýfý kalýtan sýnýfa göre ister kalýtýlýr ister kalýtýlmaz.
	//insiyatiftir.
	public int getPower(int power){
		return power;
	}
}
