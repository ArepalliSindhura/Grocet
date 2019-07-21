package com.ts.dao;


import java.util.List;
import com.ts.db.MyConnection;
import java.sql.Connection;
import org.hibernate.SessionFactory;
import com.rest.dto.*;
import com.ts.db.HibernateTemplate;

public class OrdersDAO {

	private SessionFactory factory = null;
	
	
		public List<Orders> getAllOrders() {
			List<Orders> Orders=(List)HibernateTemplate.getObjectListByQuery("From Orders");
			//System.out.println("Inside All Customers ..."+);
			return Orders;	
			}
}