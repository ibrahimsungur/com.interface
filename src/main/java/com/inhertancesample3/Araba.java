package com.inhertancesample3;

public abstract class Araba {
	
	public abstract String getMarka(String marka); 
	
	//yeni soyut(abstract) metodlar
	public abstract void brake(int getFrenID);
	public abstract void openSunroof(int getSunroofID);
	
	//yeni g�vdeli metod. Bu s�n�f� kal�tan s�n�fa g�re ister kal�t�l�r ister kal�t�lmaz.
	//insiyatiftir.
	public int getPower(int power){
		return power;
	}
}
