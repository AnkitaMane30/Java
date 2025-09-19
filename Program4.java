package clg.dkte;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		final String URL="jdbc:mysql://localhost/dkte_db";
		final String USERNAME="root";
		final String PASSWORD="manager";
		
		try(Connection connection=DriverManager.getConnection(URL,USERNAME,PASSWORD))
		{
			String sql="INSERT INTO user(name,email,password,city) VALUES(?,?,?,?)";
			try(PreparedStatement insertstatement=connection.prepareStatement(sql))
			{
				try(Scanner sc=new Scanner(System.in))
				{
					System.out.println("Enter Name:");
					String name=sc.next();
					System.out.println("Enter Email:");
					String email=sc.next();
					System.out.println("Enter Password:");
					String password=sc.next();
					System.out.println("Enter city:");
					String city=sc.next();
					
					insertstatement.setString(1, name);
					insertstatement.setString(2,email);
					insertstatement.setString(3,password);
					insertstatement.setNString(4, city);
					insertstatement.executeUpdate();
					
					System.out.println("Registration is successful..");
					
				}
				
			}
	
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
				

	}

}
