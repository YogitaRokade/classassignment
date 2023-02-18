package com.hibe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class StudentTable {

	public static void main(String[] args) {
		Connection con=null;
		
		try {
			
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Estiblishing the connection
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anudip","root","mysql");
			//create statement
			Statement stmt=con.createStatement();
			
			//create  table query
			String sql="create table studentinfo"+
			"(id int primary key,name varchar(30) not null,address varchar(20) not null)";
			
			//to execute query
			int table=stmt.executeUpdate(sql);
			System.out.println(table+"Table created successfully");
		}
		//for handling exception
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
