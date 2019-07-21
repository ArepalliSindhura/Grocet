package com.rest.dto;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Product{
@Id@GeneratedValue
private int pid;
private String name;
private int price;
private String category;


@ManyToMany(mappedBy = "product")
private List<Orders> order = new ArrayList<Orders>();

public Product() {
super();
// TODO Auto-generated constructor stub
}
public Product(int pid, String name, int price, String category) {
super();
this.pid = pid;
this.name = name;
this.price = price;
this.category = category;
}
public int getPid() {
return pid;
}
public void setPid(int pid) {
this.pid = pid;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public int getPrice() {
return price;
}
public void setPrice(int price) {
this.price = price;
}
public String getCategory() {
return category;
}
public void setCategory(String category) {
this.category = category;
}
public List<Orders> getOrder() {
return order;
}
public void setOrder(List<Orders> order) {
this.order = order;
}


}
