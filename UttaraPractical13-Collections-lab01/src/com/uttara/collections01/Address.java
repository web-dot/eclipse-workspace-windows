package com.uttara.collections01;

public class Address {
	
	private String city;
	private String street;
	private String pin;
	private String zip;
	
	
	public Address(String city, String street, String pin, String zip) {
		this.city = city;
		this.street = street;
		this.pin = pin;
		this.zip = zip;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	
	public boolean equals(Object obj) {
		try {
			System.out.println("in Address class equals()");
			Address other = (Address)obj;
			if(city.equals(other.city) && street.equals(other.street) && pin.equals(other.pin) && zip.equals(other.zip)) {
				return true;
			}
		}catch(Exception e) {
			//NullPointerException
			//ClassCastException
			return false;
		}
		return false;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((pin == null) ? 0 : pin.hashCode());
		result = prime * result + ((street == null) ? 0 : street.hashCode());
		result = prime * result + ((zip == null) ? 0 : zip.hashCode());
		return result;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", street=" + street + ", pin=" + pin + ", zip=" + zip + "]";
	}
	
	
	
}
