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
				System.out.println("Ne Yapacaðýmý Bilemedim...");
				break;
		}
	}

	//þahin sýnýfýnda tavan açma özelliði yok. Bu büyük bir hata yazýlým adýna.
	@Override
	public void openSunroof(int getSunroofID) {}

	//gövdeli(normal) metod
		@Override
		public int getPower(int power) {
			System.out.println(power+ " beygir");
			return super.getPower(power);
		}

}
