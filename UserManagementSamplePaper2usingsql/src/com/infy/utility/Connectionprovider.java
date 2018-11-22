package com.infy.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connectionprovider {
	public static Connection getConnection() {
		Connection con = null;
		try {

			Class.forName("oracle.jdbc.OracleDriver");

			con = DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
		} catch (ClassNotFoundException | SQLException e) {

		}

		return con;
	}

}
