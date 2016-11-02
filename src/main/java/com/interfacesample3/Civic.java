package com.interfacesample3;

public class Civic extends Araba implements Fren{

	@Override
	public String getMarka(String marka) {
		System.out.println(marka);
		return marka;
	}
	

	@Override
	public String getModel(int model) {
	System.out.println(2005);
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

	@Override
	public void openSunroof(int getSunroofID) {
		switch (getSunroofID) {
		case 1:
				System.out.println("Tavan Camýný Aç...");
				break;
		case 2:
				System.out.println("Tavan Camýný Açma...");
				break;
		default:
				System.out.println("Ne Yapacaðýmý Bilemedim...");
				break;
		}
	}


}
