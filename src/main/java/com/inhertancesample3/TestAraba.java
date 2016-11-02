package com.inhertancesample3;

public class TestAraba {

	public static void main(String[] args) {
		
		Araba sahin=new Sahin();
		Araba civic=new Civic();
		
		sahin.getMarka("Þahin");
		sahin.brake(1);
		sahin.getPower(90);
		System.out.println("************");
		civic.getMarka("Civic");
		civic.brake(2);
		civic.openSunroof(1);
		civic.getPower(150);
	}
}
