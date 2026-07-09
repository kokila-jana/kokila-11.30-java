package morning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Database {

	public static void main(String[] args) throws SQLException
	{
		String url="jdbc:mysql://localhost/Morning";
		String user="root";
		String pass="kokilajana";
		Connection con=DriverManager.getConnection(url, user, pass);
		String Sql="insert into info values(?,?,?)";
		PreparedStatement ps=con.prepareStatement(Sql);
		ps.setString(1,"Jana");
		ps.setString(2,"Python");
		ps.setString(3,"9095589221");
		ps.execute();
		System.out.println("hejerj");
		
	}

}
