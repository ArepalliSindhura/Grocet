//customer and order
//one to many

package com.rest.dto;
import org.hibernate.*;
import org.hibernate.cfg.*;
import java.util.*;

public class TestClient2
{
public static void main(String args[])
{
Configuration cfg=new AnnotationConfiguration();

cfg=cfg.configure("hibernate.cfg.xml");

SessionFactory factory=cfg.buildSessionFactory();

Session session=factory.openSession();

Transaction tx = session.beginTransaction();
/*Customer customer = new Customer();
customer.setC_name("Sindhu");
customer.setC_email("sindhu@gmail.com");
customer.setPassword("sindhu");

Orders order1 = new Orders();
order1.setOrder_date("5/10/18");
order1.setDelivery_status("dispatched");


Orders order2 = new Orders();
order2.setOrder_date("9/11/19");
order2.setDelivery_status("dispatched");


customer.getOrder().add(order1);
customer.getOrder().add(order2);

order1.setCustomer(customer);
order2.setCustomer(customer);



session.persist(customer);
*/
tx.commit();
System.out.println("successful");
} 


}