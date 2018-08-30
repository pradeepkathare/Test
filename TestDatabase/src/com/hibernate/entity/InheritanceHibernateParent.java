package com.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Table(name = "INHERITANCE_PARENT_TABLE_PER_CLASS")
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE) -- one table is created 
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Entity
public class InheritanceHibernateParent {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	int parentId;
	String parentName;
	String parentAddress;
	
	public int getParentId() {
		return parentId;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	public String getParentName() {
		return parentName;
	}
	public void setParentName(String parentName) {
		this.parentName = parentName;
	}
	
	
}
