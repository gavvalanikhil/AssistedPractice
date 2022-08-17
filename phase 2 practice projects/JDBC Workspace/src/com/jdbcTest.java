package com;

import java.util.*;
import java.sql.*;
public class jdbcTest {
	
	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");     //mysql 8x version
			//Class.forName("com.mysql.jdbc.Driver");      //mysql 5x version
			System.out.println("Driver loaded Successully");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javatraining", "root", "Nikhil@2001");
			System.out.println("Connected Successfully");
			Statement stmt = con.createStatement();
			System.out.println("Statement is ready..");
			
			Scanner obj = new Scanner(System.in);
			
			//insert operation
			
//			int res = stmt.executeUpdate("insert into employee values(5,'likhita',7000)");
//			if(res>0) {
//				System.out.println("record inserted");
//			}
			
			
//			//insert operation using prepared statement
//			PreparedStatement pstmt = con.prepareStatement("insert into employee values(?,?,?)");
//			System.out.println("Enter the id");
//			int id = obj.nextInt();
//			pstmt.setInt(1, id);
//			
//			System.out.println("Enter the name");
//			String name = obj.next();
//			pstmt.setString(2,name);
//			
//			System.out.println("Enter the salary");
//			float salary = obj.nextFloat();
//			pstmt.setFloat(3, salary);
//			
//			int res = pstmt.executeUpdate();
//			if(res>0) {
//				System.out.println("Record inserted successfully");
//				
//			}
			
			
			
			
			// delete operation
			
			
//			int res = stmt.executeUpdate("delete from employee where id=4 ");
//			if (res>0) {
//				System.out.println("Record deleted Successfully");
//			}
//			else {
//				System.out.println("Record not found");
//			}
			
			
//			Delete query using PraparedStatement
			
//			PreparedStatement pstmt = con.prepareStatement("delete from employee where id=?");
//			System.out.println("Enter the id to delete the record");
//			int id = obj.nextInt();
//			pstmt.setInt(1, id);
//			int res = pstmt.executeUpdate();
//			if(res>0)
//			{
//				System.out.println("Record deleted successfully");
//				
//			}else {
//				System.out.println("Record not found");
//			}
					
				
			
			
			//update operation
			
//			int res = stmt.executeUpdate("update employee set salary=500000 where id=5");
//			if (res>0) {
//				System.out.println("Record updated Successfully");
//			}
//			else {
//				System.out.println("Record not found");
//			}
			
//			update query using PreparedStatement
//			PreparedStatement pstmt = con.prepareStatement("update employee set salary = ? where id = ?");
//			System.out.println("Enter the id to update the salary");
//			int id =obj.nextInt();
//			pstmt.setInt(2, id);
//			System.out.println("Enter the salary");
//			float salary = obj.nextFloat();
//			pstmt.setFloat(1, salary);
//			int res=pstmt.executeUpdate();
//			if(res>0) {
//				System.out.println("Salary is updated to "+salary);
//				
//			}else {
//				System.out.println("record not found");
//			}
					
			
//			retrive query
			
			
//			ResultSet rs = stmt.executeQuery("select * from employee");
//			while(rs.next())
//			{
//				System.out.println("id is "+ rs.getInt(1)+". Name is "+rs.getString(2)+". Salary is "+rs.getFloat(3));
//				//System.out.println("id is "+ rs.getInt("id")+". Name is "+rs.getString("name")+". Salary is "+rs.getFloat("salary"));
//				
//			}
			
			
			//retrieve query using PreparedStatement
			//PreparedStatement pstmt = con.prepareStatement("select * from employee" );
			PreparedStatement pstmt = con.prepareStatement("select * from employee where id>?" );
			System.out.println("enter the id");
			int id = obj.nextInt();
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				//System.out.println("id is "+ rs.getInt(1)+". Name is "+rs.getString(2)+". Salary is "+rs.getFloat(3));
				//System.out.println("id is "+ rs.getInt("id")+". Name is "+rs.getString("name")+". Salary is "+rs.getFloat("salary"));
				System.out.println("name is "+ rs.getString("name"));
				
			}
			
     		rs.close();
			stmt.close();
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
