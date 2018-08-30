package com.hibernate.entity;

import javax.persistence.Embeddable;
import javax.persistence.Id;

@Embeddable
public class Address {

	
	int doorNo;
	String address;
	
	public int getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
