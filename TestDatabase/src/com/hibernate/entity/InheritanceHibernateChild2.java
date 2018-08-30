package com.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "INHERITANCE_CHILD2")
@Entity
public class InheritanceHibernateChild2 extends InheritanceHibernateParent {

	/*@Id
	@GeneratedValue(strategy = GenerationType.TABLE)*/
	int childID2;
	String childName;
	String childAddress;
	
	
	
	public int getChildID2() {
		return childID2;
	}
	public void setChildID2(int childID2) {
		this.childID2 = childID2;
	}
	public String getChildName() {
		return childName;
	}
	public void setChildName(String childName) {
		this.childName = childName;
	}
	public String getChildAddress() {
		return childAddress;
	}
	public void setChildAddress(String childAddress) {
		this.childAddress = childAddress;
	}
}
