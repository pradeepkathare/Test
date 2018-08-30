package com.hibernate.entity;

//import java.awt.Window.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.CollectionOfElements;
import org.hibernate.annotations.Columns;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

// To override attributes we have to perform 
@Entity
public class Employee1 {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", updatable = false, nullable = false)
	private int id;
	
//	@Column(name = "NAME")	
	private String name;
	
//	@Column(name = "DEPARTMENT")
	private String department;
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride (
				name = "doorNo" ,column= @Column(name = "Home_DoorNo")  
				)
		
	})
			
	private Address address;
	
	@ElementCollection
	//@OneToMany
	private ArrayList<String> list = new ArrayList<String>();
	
	@ElementCollection
	@OneToMany(fetch = FetchType.EAGER)
	private Collection<Address> listOfAddress = new ArrayList<Address>();
	
	@OneToOne
	private Vehicle vehicle;
	
	@ElementCollection
	@OneToMany
	private Collection<Vehicle> listOfVehicle = new ArrayList<Vehicle>();
	
	
	
	public Collection<Vehicle> getListOfVehicle() {
		return listOfVehicle;
	}

	public void setListOfVehicle(Collection<Vehicle> listOfVehicle) {
		this.listOfVehicle = listOfVehicle;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	

	public Collection<Address> getListOfAddress() {
		return listOfAddress;
	}

	public void setListOfAddress(Collection<Address> listOfAddress) {
		this.listOfAddress = listOfAddress;
	}

	public ArrayList<String> getList() {
		return list;
	}
	
	public void setList(ArrayList<String> list) {
		this.list = list;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "name : "+getName() +"id : "+getId()+"getAddress : "+getAddress()+"listOfAddress : "+getListOfAddress();
	}
	
}
