package com.interfacesample1;

public class TestAraba {

	public static void main(String[] args) {
		
		Araba sahin=new Sahin();
		Araba civic=new Civic();
		
		sahin.getMarka("Þahin");
		sahin.getModel(2000);
		System.out.println("*****************");
		civic.getMarka("Civic");
		civic.getModel(2005);
	}
}
