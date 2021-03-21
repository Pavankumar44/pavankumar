package com.cognizant.truyum.dao;

import java.io.FileInputStream; 
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionHandler {

	private static Connection con = null;
	private static Properties props = new Properties();
	
	public static Connection getConnection() {
		Connection con = null;
		
		try {
			FileInputStream fis = null;
			
			fis = new FileInputStream("C:\\Users\\hp\\OneDrive\\Desktop\\truYum\\src\\connection.properties");
			
			props.load(fis);
			
			try {
				Class.forName(props.getProperty("db.classname"));
			}
			catch(ClassNotFoundException e) {
				e.printStackTrace();
			}
			con = DriverManager.getConnection(props.getProperty("db.url"), props.getProperty("db.username"), props.getProperty("db.password"));
			
			if(con != null) {
				System.out.println("connected to the database");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Not connected to the database");
			e.printStackTrace();
		} catch(IOException e) {
			System.out.println("Connection Properties file not found");
			e.printStackTrace();
		}
		return con;
		
	}
	
}
