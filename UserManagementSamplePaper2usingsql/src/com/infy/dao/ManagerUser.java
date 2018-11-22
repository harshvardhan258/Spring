package com.infy.dao;

import java.sql.SQLException;
import java.util.List;


import com.infy.model.User;

public interface ManagerUser {

	List<User> getAllProjects()throws Exception;
	void addProject(User proj) throws Exception;
	/*public List<User> getUser(String id)throws Exception;
	public void updateUser(User u)throws Exception;
	public List<User> viewByAge(int a,int b)throws Exception ;
	public String deleteUser(String id)throws Exception;
	*/
	//public void update(User u,String name); 
}
