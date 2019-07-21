//order and product
//many to many

package com.rest.dto;
import org.hibernate.*;
import org.hibernate.cfg.*;
import java.util.*;

public class TestClient
{
public static void main(String args[])
{
Configuration cfg=new AnnotationConfiguration();

cfg=cfg.configure("hibernate.cfg.xml");

SessionFactory factory=cfg.buildSessionFactory();

Session session=factory.openSession();

Transaction tx = session.beginTransaction();

Product product1 = new Product();
product1.setName("tomato");
product1.setPrice(50);
product1.setCategory("vegetables");

Product product2 = new Product();
product2.setName("potato");
product2.setPrice(30);
product2.setCategory("vegetables");

Orders order1 = new Orders();
order1.setOrder_date("08/09/19");
order1.setDelivery_status("accepted");

Orders order2 = new Orders();
order2.setOrder_date("08/06/18");
order2.setDelivery_status("delivered");

product1.getOrder().add(order1);
product1.getOrder().add(order2);
product2.getOrder().add(order1);
product2.getOrder().add(order2);

order1.getProduct().add(product1);
order1.getProduct().add(product2);
order2.getProduct().add(product1);
order2.getProduct().add(product2);

session.save(product1);
session.save(product2);
session.save(order1);
session.save(order2);

tx.commit();
session.close();
System.out.println("Objects saved successfully...");



} 
}