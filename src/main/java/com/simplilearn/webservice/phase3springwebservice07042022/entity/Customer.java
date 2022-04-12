package com.simplilearn.webservice.phase3springwebservice07042022.entity;

public class Customer {
	
	// properties
		private int id;
		private String name;
		private double phone;
		private String address;
		private String email;

	

		// public get and sets methods
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

		public double getPhone() {
			return phone;
		}

		public void setPhone(double phone) {
			this.phone = phone;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}
		
		public String getEmail() {
			return email;
		}

		public void setEmal(String email) {
			this.email = email;
		}

		
		// constructor
		public Customer() {
			super();
		}

		public Customer(int id, String name, double phone, String address, String email) {
			super();
			this.id = id;
			this.name = name;
			this.phone = phone;
			this.address = address;
			this.email = email;

		}

		@Override
		public String toString() {
			return "Product [id=" + id + ", name=" + name + ", phone=" + phone + ", address=" + address
					+ ", email=" + email + "]";
		}
	}


