package com.inhertancesample3;

public class Civic extends Araba{

	@Override
	public String getMarka(String marka) {
		System.out.println(marka);
		return marka;
	}

	@Override
	public void brake(int getFrenID) {
		switch (getFrenID) {
		case 1:
				System.out.println("Fren Yap...");
				break;
		case 2:
				System.out.println("ABS Fren Yap...");
				break;
		default:
				System.out.println("Ne Yapaca��m� Bilemedim...");
				break;
		}
	}

	@Override
	public void openSunroof(int getSunroofID) {
		switch (getSunroofID) {
		case 1:
				System.out.println("Tavan Cam�n� A�...");
				break;
		case 2:
				System.out.println("Tavan Cam�n� A�ma...");
				break;
		default:
				System.out.println("Ne Yapaca��m� Bilemedim...");
				break;
		}
	}
	
	//g�vdeli(normal) metod
	@Override
	public int getPower(int power) {
		System.out.println(power+ " beygir");
		return super.getPower(power);
	}
}
