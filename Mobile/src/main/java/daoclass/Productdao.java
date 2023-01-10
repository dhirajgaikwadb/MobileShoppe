package daoclass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import modelclass.Productmodel;

public class Productdao {
	private String jdbcURL = "jdbc:mysql://localhost:3306/mobile?useSSL=false";
	private String jdbcUsername = "root";
	private String jdbcPassword = "root";
	
	private static final String INSERT_USERS_SQL = "INSERT INTO mobile.addproduct" + "  (ProductName,Productprice,ProductQuantity,ProductRam,ProductRom) VALUES "
			+ " (?,?,?,?,?);";
	
public Productdao() {
		
	}
		public Connection getConnection() {
			Connection connection = null;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return connection;
		}
		
		public void insertUser(Productmodel user) throws SQLException {
			System.out.println(INSERT_USERS_SQL);
			// try-with-resource statement will auto close the connection.
			try (Connection connection = getConnection();
					PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
				preparedStatement.setString(1, user.getProductName());
				preparedStatement.setInt(2, user.getProductPrice());
				preparedStatement.setInt(3, user.getProductQuantity());
				preparedStatement.setInt(4, user.getRam());
				preparedStatement.setInt(5, user.getRom());
				System.out.println(preparedStatement);
				preparedStatement.executeUpdate();
			} catch (SQLException e) {
				printSQLException(e);
			}
		}
		
		private void printSQLException(SQLException e) {
			for (Throwable e1 : e) {
				if (e1 instanceof SQLException) {
					e1.printStackTrace(System.err);
					System.err.println("SQLState: " + ((SQLException) e1).getSQLState());
					System.err.println("Error Code: " + ((SQLException) e1).getErrorCode());
					System.err.println("Message: " + e1.getMessage());
					Throwable t = e1.getCause();
					while (t != null) {
						System.out.println("Cause: " + t);
						t = t.getCause();
					}
				}
		}
}
}
