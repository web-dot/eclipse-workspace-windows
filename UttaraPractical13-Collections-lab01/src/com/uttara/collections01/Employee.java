package com.uttara.collections01;

public class Employee {

	private String name;
	private String email;
	private String dob;
	private Address homeAddress;
	private Address officeAddress;
	
	public Employee(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name == null || name.equals(" ")) {
			throw new IllegalArgumentException();
		}
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if(email == null || email.equals(" ")) {
			throw new IllegalArgumentException();
		}
		this.email = email;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		if(dob == null || dob.equals(" ")) {
			throw new IllegalArgumentException();
		}
		this.dob = dob;
	}

	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Address getOfficeAddress() {
		return officeAddress;
	}

	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		try {
			System.out.println("in Employee class equals()");
			Employee other = (Employee)obj;
			if(name.equals(other.getName()) && email.equals(other.getEmail()) && dob.equals(other.getDob())) {
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
		System.out.println("in Employee class hashcode()");
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dob == null) ? 0 : dob.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((homeAddress == null) ? 0 : homeAddress.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((officeAddress == null) ? 0 : officeAddress.hashCode());
		return result;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", email=" + email + ", dob=" + dob + ", homeAddress=" + homeAddress
		        + ", officeAddress=" + officeAddress + "]";
	}

	
}
