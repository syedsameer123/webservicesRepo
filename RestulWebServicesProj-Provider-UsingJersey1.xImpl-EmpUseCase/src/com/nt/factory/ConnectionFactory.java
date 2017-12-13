package com.nt.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	private static Connection con=null;

	static {
		// Load And Register The Driver(Oracle Type-4 driver)
		// We Have To Know Driver Class Name,url,userName and Password
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("Error While loading Driver Class");
			e.printStackTrace();
		}
		
		// Establish The Connection
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "manager");
		} catch (SQLException e) {
			System.out.println("Error While  creating connection object");
			e.printStackTrace();
		}
	}

	public static Connection getConnection() throws Exception {
		return con;
	}

}
