package clg.dkte;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		final String URL = "jdbc:mysql://localhost:3306/dkte_db";
		final String USERNAME = "root";
		final String PASSWORD = "manager";
		System.out.println("Login Page - ");
		try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
			String sql = "SELECT * FROM user WHERE email = ? AND password = ?";
			try (PreparedStatement statement = connection.prepareStatement(sql)) {
				try (Scanner sc = new Scanner(System.in)) {
					System.out.print("Enter email - ");
					String email = sc.next();
					System.out.print("Enter passsword - ");
					String password = sc.next();
					statement.setString(1, email);
					statement.setString(2, password);
					ResultSet rs = statement.executeQuery();
					if (rs.next()) {
						System.out.println("Login Successful");
						System.out.println("Hi - " + rs.getString(2));
					} else
						System.out.println("Invalid Credentials...");
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
