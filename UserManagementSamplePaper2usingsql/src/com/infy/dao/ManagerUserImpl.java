package com.infy.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.infy.model.User;

import com.infy.utility.Connectionprovider;

public class ManagerUserImpl implements ManagerUser {
	Connection con = null;
	ResultSet rs = null;
	PreparedStatement ps;

	@Override
	public List<User> getAllProjects() throws SQLException {
		User p;
		List<User> pList = new ArrayList<User>();
		con = Connectionprovider.getConnection();
		ps = con.prepareStatement("select * from user_details12");
		rs = ps.executeQuery();

		while (rs.next()) {
			p = new User();
			System.out.println(rs.getInt(1));
			p.setId(rs.getString(1));
			p.setName(rs.getString(2));
			p.setAge(rs.getInt(3));
			p.setAddress(rs.getString(4));

			System.out.println(p);
			pList.add(p);
		}

		return pList;
	}

	

	@Override
	public void addProject(User proj) throws SQLException {
		System.out.println("Insert method");
		String id=proj.getId();
		String name=proj.getName();
		int age=proj.getAge();
         String address=proj.getAddress();
		
		
		String query = "INSERT into user_details12 VALUES(?,?,?,?)";
		con=Connectionprovider.getConnection();
		ps=con.prepareStatement(query);
		ps.setString(1, id);
		ps.setString(2, name);
		ps.setInt(3, age);
		ps.setString(4, address);
		ps.execute();
		System.out.println("Inserted");
	}

	/*@Override
	public List<User> getUser(String id) {
		AnnotationConfiguration configuration = new AnnotationConfiguration();
		SessionFactory factory = configuration.configure().buildSessionFactory();
		Session session = factory.openSession();
		List<User> elist = new ArrayList<User>();
		Transaction transaction = session.beginTransaction();
		Query q = session.createQuery("from User where id =?");
		q.setString(0, id);

		elist = q.list();
		transaction.commit();
		return elist;

	}

	@Override
	public void updateUser(User u) {
		AnnotationConfiguration configuration = new AnnotationConfiguration();
		SessionFactory factory = configuration.configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		User user = (User) session.get(User.class, u.getId());
		user.setAddress(u.getAddress());
		user.setAge(u.getAge());
		user.setName(u.getName());
		session.update(user);
		transaction.commit();

	}

	
	 * @Override public void update(User u,String name) {
	 * AnnotationConfiguration configuration = new AnnotationConfiguration();
	 * SessionFactory factory = configuration.configure().buildSessionFactory();
	 * Session session = factory.openSession(); Transaction transaction =
	 * session.beginTransaction();
	 * 
	 * User user=(User) session.get(User.class, u.getId());
	 * user.setAddress(u.getAddress()); user.setAge(u.getAge());
	 * user.setName(name); session.update(user); transaction.commit();
	 * 
	 * 
	 * 
	 * 
	 * 
	 * }
	 

	@Override
	public List<User> viewByAge(int a, int b) {

		AnnotationConfiguration configuration = new AnnotationConfiguration();
		SessionFactory factory = configuration.configure().buildSessionFactory();
		Session session = factory.openSession();
		List<User> elist = new ArrayList<User>();
		Transaction transaction = session.beginTransaction();
		Query q = session.createQuery("from User where age > ? and age < ?");
		q.setInteger(0, a);
		q.setInteger(1, b);
		elist = q.list();
		transaction.commit();

		return elist;

	}

	@Override
	public String deleteUser(String id) {
		// TODO Auto-generated method stub
		AnnotationConfiguration configuration = new AnnotationConfiguration();
		SessionFactory factory = configuration.configure().buildSessionFactory();
		Session session = factory.openSession();

		List<User> eList = new ArrayList<User>();

		Transaction t = session.beginTransaction();
		Query query = session.createQuery("from User where Id=?");
		query.setString(0, id);
		eList = query.list();
		for (User e : eList) {
			session.delete(e);
		}
		t.commit();
		return "record deleted";

	}*/

}
