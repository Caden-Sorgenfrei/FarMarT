package com.fmt;

public class Address {

	private final String street;
	private final String city;
	private final String state;
	private final int zip;
	private final String country;
	
	public Address(String street, String city, String state, int zip, String country) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.country = country;
	}

	public String getStreet() {
		return street;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public int getZip() {
		return zip;
	}

	public String getCountry() {
		return country;
	}
	
	public String toString() {
		return this.street +","+ this.city +","+ this.state +","+ this.zip +","+ this.country;
		
	}
	
	
}
