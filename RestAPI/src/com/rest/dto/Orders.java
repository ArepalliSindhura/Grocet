package com.rest.dto;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Orders{
@Id@GeneratedValue
private int Oid;
private String Order_date;
private String Delivery_status;

@ManyToOne(targetEntity = Customer.class)
@JoinColumn(name = "customerId")
private Customer customer;

@ManyToMany
private List<Product> product = new ArrayList<Product>();

public Orders() {
super();
// TODO Auto-generated constructor stub
}

public Orders(int oid, String order_date, String delivery_status) {
super();
Oid = oid;
Order_date = order_date;
Delivery_status = delivery_status;
}

public int getOid() {
return Oid;
}
public void setOid(int oid) {
Oid = oid;
}
public String getOrder_date() {
return Order_date;
}
public void setOrder_date(String order_date) {
Order_date = order_date;
}
public String getDelivery_status() {
return Delivery_status;
}
public void setDelivery_status(String delivery_status) {
Delivery_status = delivery_status;
}

public Customer getCustomer() {
return customer;
}

public void setCustomer(Customer customer) {
this.customer = customer;
}

public List<Product> getProduct() {
return product;
}

public void setProduct(List<Product> product) {
this.product = product;
}
}

