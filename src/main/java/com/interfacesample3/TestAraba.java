package com.interfacesample3;

public class TestAraba {

	public static void main(String[] args) {
		
		Araba sahin=new Sahin();
		Araba civic=new Civic();
		
		Fren sahinFren=new Sahin();
		Fren civicFren=new Civic();
		
		sahin.getMarka("Þahin");
		sahin.getModel(2005);
		sahin.hello();
		sahinFren.brake(1);
		System.out.println("************");
		civic.getMarka("Civic");
		civic.getModel(2003);
		civicFren.brake(2);
		civicFren.openSunroof(1);
	}
}
