package com.rest.dto;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Customer {
@Id@GeneratedValue
private int cid;

private String c_Fname;
private String c_Lname;
private String c_email;
private String password;

@OneToMany(mappedBy = "customer")
private List<Orders> order = new ArrayList<Orders>(); 



public Customer() {
super();
// TODO Auto-generated constructor stub
}
public Customer(int cid, String c_Fname,String c_Lname, String c_email, String password) {
super();
this.cid = cid;
this.c_Fname = c_Fname;
this.c_Lname = c_Lname;
this.c_email = c_email;
this.password = password;
}
public int getCid() {
return cid;
}
public void setCid(int cid) {
this.cid = cid;
}
public String getC_Lname() {
	return c_Lname;
}
public void setC_Lname(String c_Lname) {
	this.c_Lname = c_Lname;
}
public String getC_Fname() {
return c_Fname;
}
public void setC_name(String c_Fname) {
this.c_Fname = c_Fname;
}
public String getC_email() {
return c_email;
}
public void setC_email(String c_email) {
this.c_email = c_email;
}
public String getPassword() {
return password;
}
public void setPassword(String password) {
this.password = password;
}
public List<Orders> getOrder() {
return order;
}
public void setOrder(List<Orders> order) {
this.order = order;
}



}