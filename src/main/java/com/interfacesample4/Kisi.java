package com.interfacesample4;

public class Kisi extends Insan implements Job {

	@Override
	public void getJob(String job) {
	System.out.println(job);
	}

	@Override
	public String getName(String name) {
	System.out.println(name);
		return name;
	}

	@Override
	public String getSurname(String surname) {
	System.out.println(surname);
		return surname;
	}

	@Override
	public int getYas(int yas) {
	System.out.println(yas);
		return yas;
	}

	@Override
	public String getCity(String city) {
	System.out.println(city);
		return city;
	}


	
	

}
