package com.interfacesample3;

public class Sahin extends Araba implements Fren{

	@Override
	public String getMarka(String marka) {
		System.out.println(marka);
		return marka;
	}
	

	@Override
	public String getModel(int model) {
	System.out.println(2000);
		return null;
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


}
