package com.simplilearn.webservice.phase3springwebservice07042022.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.webservice.phase3springwebservice07042022.entity.Customer;

@RestController
public class CustomerController {

	List<Customer> customers = new ArrayList<Customer>();

	@RequestMapping(value = "/customers", method = RequestMethod.GET)
	public List<Customer> getCustomers() {
		if (customers.isEmpty()) {
			addDefaultData();
		}
		return customers;
	}

	@RequestMapping(value = "/product/{id}", method = RequestMethod.GET)
	public Customer getCustomer(@PathVariable("id") int id) {
		for (Customer customer : customers) {
			if (customer.getId() == id) {
				return customer;
			}
		}
		return null;
	}

	@RequestMapping(value = "/customer", method = RequestMethod.GET)
	public Customer getProduct(@RequestParam("name") String name) {
		for (Customer customer : customers) {
			if (customer.getName().equals(name)) {
				return customer;
			}
		}
		return null;
	}

	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public Customer searchCustomer(@RequestParam("name") String name) {
		for (Customer customer : customers) {
			if (customer.getName().contains(name)) {
				return customer;
			}
		}
		return null;
	}

	// add product
	@RequestMapping(value = "/customers", method = RequestMethod.POST)
	public List<Customer> addProduct(@RequestBody Customer customer) {
		customers.add(customer);
		return customers;
	}

	// update product
	@RequestMapping(value = "/customers", method = RequestMethod.PUT)
	public Customer updateCustomer(@RequestBody Customer customer) {
		for (int index = 0; index < customers.size(); index++) {
			if(customers.get(index).getId()== customer.getId()) {
				customers.set(index, customer);
				return customer;
			}
		}
		return null;
	}
	
	// delete product
	@RequestMapping(value = "/customers/{id}", method = RequestMethod.DELETE)
	public Customer deleteCustomer(@PathVariable("id") int id) {
		for (int index = 0; index < customers.size(); index++) {
			if(customers.get(index).getId()== id) {
				Customer remove = customers.get(index);
				customers.remove(remove);
				return remove;
			}
		}
		return null;
	}
	
	//add default data when list is empty
	private void addDefaultData() {
		customers.add(new Customer(10001, "john Smith", 9876543, "Washington", "jsmith@gmail.com"));
		customers.add(
				new Customer(10002, "Will Smith", 3456789, "Las vegas", "smith@gmail.com"));
		customers.add(
				new Customer(10003, "Mike Smith", 1122334, "Los Angelos", "Msmith@gmail.com"));
		customers.add(
				new Customer(10004, "Payal Smith", 3322114, "New York", "Psmith@gmail.com"));
	}
	
}
