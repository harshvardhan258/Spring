package com.infy.service;

import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.infy.dao.ManagerUserImpl;

import com.infy.model.User;

@Path("service")
public class RestController {

	private ManagerUserImpl i = new ManagerUserImpl();

	@Path("get")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<User> getAllProject() throws Exception {

		return i.getAllProjects();
	}

	/*@Path("add")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
   @Produces(MediaType.TEXT_PLAIN)
	public String addProject(User prj) throws SQLException {

		i.addProject(prj);

		return "Record Added";
	}*/
	
/*	@Path("viewage/{a}/{b}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<User> viewByAge(@PathParam("a") int a, @PathParam("b") int b) {

		List<User> list = i.viewByAge(a, b);
		return list;
	}

	@Path("view/{a}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<User> getUser(@PathParam("a") String eid) {
		List<User> list = i.getUser(eid);
		return list;

	}

	@Path("update")
	@PUT
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces(MediaType.TEXT_PLAIN)
	public String updateUser(User e) {

		i.updateUser(e);
		return "Record updated";

	}
	@Path("remove/{id}")
	@DELETE
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes( MediaType.APPLICATION_JSON )
	public String deleteUser(@PathParam("id") String pId) {
		i.deleteUser(pId);
		return "record deleted";
	}
	
	
	@Path("update/{id}")
	@PUT
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces(MediaType.TEXT_PLAIN)
	public String updateUser(User e,@PathParam("id") String id) {

		i.updateUser(e);
		return "Record updated";

	}
	
	
	
	*/
	

}
