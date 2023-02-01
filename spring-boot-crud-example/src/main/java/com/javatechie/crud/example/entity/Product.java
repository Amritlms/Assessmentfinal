package com.javatechie.crud.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

@Entity
public class Product {
	
	@Table(name = "userdetails")
	public class Description {
		@GeneratedValue
		private int id;
		@Column
	    private String userName;
	    @Column
	    private String firstname;
	    @Column
	    private String lastname;
	    @Column
	    private int aadharnumber;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getFirstname() {
			return firstname;
		}
		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}
		public String getLastname() {
			return lastname;
		}
		public void setLastname(String lastname) {
			this.lastname = lastname;
		}
		public int getAadharnumber() {
			return aadharnumber;
		}
		public void setAadharnumber(int aadharnumber) {
			this.aadharnumber = aadharnumber;
		}
		@Override
		public String toString() {
			return "Description [userName=" + userName + ", firstname=" + firstname + ", lastname=" + lastname
					+ ", aadharnumber=" + aadharnumber + "]";
		}
		
	}

}
