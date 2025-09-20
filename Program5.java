package clg.dkte;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		final String URL="Jdbc:mysql://localhost:3306/dkte_db";
		final String USERNAME="root";
		final String PASSWORD="manager";
		try(Connection connection=DriverManager.getConnection(URL,USERNAME,PASSWORD))
		{
			try(Scanner sc=new Scanner(System.in))
			{
				System.out.println("Enter email:");
				String email=sc.next();
				
				System.out.println("Enter current password");
				String cpassword=sc.next();
				
				String selectsql="SELECT * FROM user WHERE email=? AND password=?";
				try(PreparedStatement selectstatement=connection.prepareStatement(selectsql))
				{
					selectstatement.setString(1,email);
					selectstatement.setString(2, cpassword);
					ResultSet rs=selectstatement.executeQuery();
					if(rs.next())
					{
						System.out.println("Enter new password");
						String npassword=sc.next();
						
						String updatesql="UPDATE user SET password=? WHERE email=?";
						try(PreparedStatement updatestatement=connection.prepareStatement(updatesql))
						{
							updatestatement.setString(1, npassword);
							updatestatement.setString(2,email);
							updatestatement.executeUpdate();
							System.out.println("Password changed successfully...");
						}
					}
					else
					{
						System.out.println("Invalid Credential..");
					}
					
				}
			}	
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
