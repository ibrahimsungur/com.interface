package com.interfacesample2;

public class TestAraba {

	public static void main(String[] args) {
		
		Araba sahin=new Sahin();
		Araba civic=new Civic();
		
		sahin.getMarka("Þahin");
		sahin.getModel(2000);
		sahin.brake(1);
		System.out.println("*****************");
		civic.getMarka("Civic");
		civic.getModel(2005);
		civic.brake(2);
		civic.openSunroof(1);
	
	}
}
