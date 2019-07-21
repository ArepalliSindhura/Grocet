package com.ts.dao;


import java.util.List;

import org.hibernate.SessionFactory;

import com.rest.dto.Customer;
import com.ts.db.MyConnection;
import java.sql.Connection;
import com.ts.db.HibernateTemplate;

public class CustomerDAO {

	private SessionFactory factory = null;
	
	public int register(Customer customer) {
		return HibernateTemplate.addObject(customer);
		
	}
	
	public Customer getCustomerByUserPass(String c_email,String password) {

		return (Customer)HibernateTemplate.getObjectByUserPass(c_email,password);
	}
	
	public List<Customer> getAllCustomers() {
		List<Customer> Customers=(List)HibernateTemplate.getObjectListByQuery("From Customer");
		System.out.println("Inside All Customers ..."+Customers);
		return Customers;	
		}

		public Customer getCustomer(int id) {
		return (Customer)HibernateTemplate.getObject(Customer.class,id);
		}
		
		
		
}