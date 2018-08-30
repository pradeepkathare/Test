	package com.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*
	 * Pradeep.kathare
	* 
	*/
	@Entity
	public class Vehicle {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int vehicleId;
		private String vehicleName;
		public int getVehicleId() {
			return vehicleId;
		}
		public void setVehicleId(int vehicleId) {
			this.vehicleId = vehicleId;
		}
		public String getVehicleName() {
			return vehicleName;
		}
		public void setVehicleName(String vehicleName) {
			this.vehicleName = vehicleName;
		}
		
		
	}
