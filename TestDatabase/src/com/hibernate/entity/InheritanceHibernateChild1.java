package com.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.xerces.dom.ParentNode;

@Table(name = "INHERITANCE_CHILD1")
@Entity
public class InheritanceHibernateChild1 extends InheritanceHibernateParent {

	/*@Id
	@GeneratedValue(strategy = GenerationType.TABLE)*/
	int childID1;
	String childName;
	String childAddress;
	
	
	public int getChildID1() {
		return childID1;
	}
	public void setChildID1(int childID1) {
		this.childID1 = childID1;
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
