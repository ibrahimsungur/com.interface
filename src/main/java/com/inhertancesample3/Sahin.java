package com.inhertancesample3;

public class Sahin extends Araba{

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

	//�ahin s�n�f�nda tavan a�ma �zelli�i yok. Bu b�y�k bir hata yaz�l�m ad�na.
	@Override
	public void openSunroof(int getSunroofID) {}

	//g�vdeli(normal) metod
		@Override
		public int getPower(int power) {
			System.out.println(power+ " beygir");
			return super.getPower(power);
		}

}
