package com.mvc.onlinestore;

import java.io.Serializable;

public class OrderBean implements Serializable {
	
	@Override
	public String toString() {
		return "OrderBean [uname=" + uname + ", email=" + email + ", mobile=" + mobile + ", addressline1="
		        + addressline1 + ", addressline2=" + addressline2 + ", landmark=" + landmark + ", paymentmethod="
		        + paymentmethod + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((addressline1 == null) ? 0 : addressline1.hashCode());
		result = prime * result + ((addressline2 == null) ? 0 : addressline2.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((landmark == null) ? 0 : landmark.hashCode());
		result = prime * result + ((mobile == null) ? 0 : mobile.hashCode());
		result = prime * result + ((paymentmethod == null) ? 0 : paymentmethod.hashCode());
		result = prime * result + ((uname == null) ? 0 : uname.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderBean other = (OrderBean) obj;
		if (addressline1 == null) {
			if (other.addressline1 != null)
				return false;
		} else if (!addressline1.equals(other.addressline1))
			return false;
		if (addressline2 == null) {
			if (other.addressline2 != null)
				return false;
		} else if (!addressline2.equals(other.addressline2))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (landmark == null) {
			if (other.landmark != null)
				return false;
		} else if (!landmark.equals(other.landmark))
			return false;
		if (mobile == null) {
			if (other.mobile != null)
				return false;
		} else if (!mobile.equals(other.mobile))
			return false;
		if (paymentmethod == null) {
			if (other.paymentmethod != null)
				return false;
		} else if (!paymentmethod.equals(other.paymentmethod))
			return false;
		if (uname == null) {
			if (other.uname != null)
				return false;
		} else if (!uname.equals(other.uname))
			return false;
		return true;
	}

	String uname, email, mobile, addressline1, addressline2, landmark, paymentmethod;

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		System.out.println("in OrderBean setUname()");
		this.uname = uname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		System.out.println("in OrderBean setEmail()");
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		System.out.println("in OrderBean setMobile()");
		this.mobile = mobile;
	}

	public String getAddressline1() {
		return addressline1;
	}

	public void setAddressline1(String addressline1) {
		System.out.println("in OrderBean setAddressline1()");
		this.addressline1 = addressline1;
	}

	public String getAddressline2() {
		return addressline2;
	}

	public void setAddressline2(String addressline2) {
		System.out.println("in OrderBean setAddressline2()");
		this.addressline2 = addressline2;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		System.out.println("in OrderBean setLandmark()");
		this.landmark = landmark;
	}

	public String getPaymentmethod() {
		return paymentmethod;
	}

	public void setPaymentmethod(String paymentmethod) {
		System.out.println("in OrderBean setPaymentmethod()");
		this.paymentmethod = paymentmethod;
	}
	
	public String validate() {
		
		StringBuilder sb = new StringBuilder();
		if(uname == null || uname.equals(" ") || uname.isEmpty()) {
			sb.append("Please fill in name<br>");
		}
		if(email == null || email.equals(" ") || email.isEmpty()){
			sb.append("Please fill in email<br>");
		}
		if(mobile == null || mobile.equals(" ") || mobile.isEmpty()){
			sb.append("Please enter mobile<br>");
		}
		if(addressline1 == null || addressline1.equals(" ") || addressline1.isEmpty()){
			sb.append("Please fill in address1<br>");
		}
		if(addressline2 == null || addressline2.equals(" ") || addressline2.isEmpty()){
			sb.append("Please fill in address2<br>");
		}
		if(paymentmethod == null || paymentmethod.equals(" ") || paymentmethod.isEmpty()){
			sb.append("Please select a payment method<br>");
		}
		
		String message = sb.toString();
		
		if(message.equals("")) {
			return Constants.SUCCESS;
		}
		else {
			return message;
		}
	}
}