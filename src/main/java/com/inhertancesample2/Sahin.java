package com.inhertancesample2;

public class Sahin extends Araba{

	@Override
	public String getMarka(String marka) {
		System.out.println(marka);
		return marka;
	}
	
	@Override
	public int getModel(int model) {
	System.out.println(model);
		return 0;
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

	//�ahin s�n�f�nda tavan a�ma �zelli�i yok. Bu b�y�k bir hata yaz�l�m ad�na.
	@Override
	public void openSunroof(int getSunroofID) {}

	


}
