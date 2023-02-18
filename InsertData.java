package com.hibe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class InsertData {

	public static void main(String[] args) {
		Connection con=null;
		
		Scanner sc=new Scanner(System.in);
		
		try {
			//register driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//driver manager
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anudip","root","mysql");
			
			//insert query for  insert values
			String sql="insert into studentinfo values(?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			//data from user
			System.out.println("Enter ID:");
			int id=sc.nextInt();
			
			sc.nextLine();
			System.out.println("Enter Name:");
			String name=sc.nextLine();
			
			System.out.println("Enter Address:");
			String address=sc.nextLine();
			
			//set data into table
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, address);
			
			//for executing insert operation
			int row=ps.executeUpdate();
			System.out.println(row+"Row has been inserted successfully");
			ps.close();
			
			//to showing the result of table after inserting value
			String sql2="select * from studentinfo";
			PreparedStatement ps1=con.prepareStatement(sql2);
			ResultSet rs=ps1.executeQuery();
			
			//loop for display 
			while(rs.next())
			{
				System.out.println("Id:"+rs.getInt(1));
				System.out.println("Name:"+rs.getString(2));
				System.out.println("Address:"+rs.getString(3));
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
}
}
