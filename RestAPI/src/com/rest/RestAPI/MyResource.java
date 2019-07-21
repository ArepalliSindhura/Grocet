package com.rest.RestAPI;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.rest.dto.Customer;

import com.rest.dto.Orders;
import com.ts.dao.CustomerDAO;
import com.ts.dao.OrdersDAO;

@Path("myresource")
public class MyResource {
    @Path("hi")
	@GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hi() {
        return "Hi Service!";
    }
    
    @Path("hello")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello Service!";
    }
    
    @Path("register")
    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public void register(@FormParam("c_Fname") String c_Fname, @FormParam("c_Lname") String c_Lname) {
    }
    
    @Path("registerEmp")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void registerEmp(Customer customer) {
    	//System.out.println("Inside REST..."+user);
    	CustomerDAO customerDAO = new CustomerDAO();
    	customerDAO.register(customer); //send to database code 
    	//System.out.println(customer.employee.getEmpId()+" "+employee.getEmpName()+" "+employee.getSalary());
    }
    
    @Path("getCustomers")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Customer> getCustomers(){
    	CustomerDAO customerDAO = new CustomerDAO();
    	List<Customer> CustList = customerDAO.getAllCustomers();
    	return CustList;
    }
    
    @Path("getOrders")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Orders> getOrders(){
    	OrdersDAO ordersDAO = new OrdersDAO();
    	List<Orders> CustList = ordersDAO.getAllOrders();
    	return CustList;
    }
    
    
    
 
    @Path("getCustomerByUserPass/{c_email}/{password}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Customer getCustomerByUserPass(@PathParam("c_email") String c_email,@PathParam("password") String password) {
        System.out.println("Recieved path params: "+ c_email +" "+password); 
    	CustomerDAO customerDAO = new CustomerDAO();
        Customer customer = customerDAO.getCustomerByUserPass(c_email, password);
        return customer;
    }

	/*@POST
	 * +
	@Path("/uploadImage")
	@Consumes({MediaType.MULTIPART_FORM_DATA})
	public void uploadImage(@FormDataParam("Image") InputStream fileInputStream, @FormDataParam("Image") FormDataContentDisposition 
    formDataContentDisposition, @FormDataParam("ImageCaption") String caption) throws IOException {
		int read = 0;
	    byte[] bytes = new byte[1024];
	 System.out.println("METHOD CALLED...."+caption);
	    FileOutputStream out = new FileOutputStream(new File("C:/Users/tsuser/RESTAPI_9pm/RestAPI/src/main/webapp/image/", formDataContentDisposition.getFileName()));
	    while ((read = fileInputStream.read(bytes)) != -1) {
	    	out.write(bytes, 0, read);
	    }
	    out.flush();
	    out.close();*/
	    /*
	    Student student = new Student();
		student.setId(id);
		student.setName(name);
		student.setFile(formDataContentDisposition.getFileName());
		
		students.add(student); 
		*/
		//return Response.ok("Data Submitted Successfully.").build();	
    
	}