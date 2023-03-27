package com.xworkz.Xworkz.Runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCRunner {
	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/blackperl", "root",
					"Xworkzodc@123");
			String insertQuery = "insert into alcohol_table values(0,'redlabel','uday',5000,'wiskey','india')";
			Statement statement = connection.createStatement();
			int rows = statement.executeUpdate(insertQuery);
			System.out.println("rows" + rows);
			connection.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			System.err.println("SQLException check url or userName or password");

		}
	}

}
