package clg.dkte;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {
		final String URL="jdbc:mysql://localhost:3306/dkte_db";
		final String USERNAME="root";
		final String PASSWORD="manager";
		try(Connection connection=DriverManager.getConnection(URL,USERNAME,PASSWORD))
		{
			String sql="DELETE FROM user WHERE uid=?";
			try(PreparedStatement deletestatement=connection.prepareStatement(sql))
			{
				try(Scanner sc=new Scanner(System.in))
				{
				System.out.println("Enter user id to delete:");
				int uid=sc.nextInt();
				
				deletestatement.setInt(1,uid);
				deletestatement.executeUpdate();
				System.out.println("User Deleted..:(");
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
