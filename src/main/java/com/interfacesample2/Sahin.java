package com.interfacesample2;

public class Sahin implements Araba{

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

	@Override
	public void openSunroof(int getSunroofID) {
		
	}

	@Override
	public String getModel(int model) {
	System.out.println(model);
		return null;
	}



}
