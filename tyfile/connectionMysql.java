package tySystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class connectionMysql {
	public static void main(String [] args) throws ClassNotFoundException, SQLException {
		java.sql.Statement statement =null;
		ResultSet resultSet =null;
		Connection connection=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url ="jdbc:mysql://127.0.0.1:3306/wty20?serverTimezone=GMT%2B8";
			String username ="root";
			String password ="root";
			
			connection =DriverManager.getConnection(url, username, password);
			statement = connection.createStatement();
			String sql ="select * from tys";
			resultSet =((java.sql.Statement) statement).executeQuery(sql);
			
			while (resultSet.next()) {
				int id =resultSet.getInt("id");
				String booknumber =resultSet.getString("booknumber");
				String bookname =resultSet.getString("bookname");
				int bookprices =resultSet.getInt("bookprices");
				System.out.print(id+"	|	"+booknumber+"	|	"+bookname+"	|	"+bookprices);
				
				
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}