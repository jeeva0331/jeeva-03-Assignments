package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCAssignment4 {

	static final String DB_URL="jdbc:mysql://localhost:3306/jeeva";
	static final String USER="root";
	static final String PASS="admin@123";
	
	public static void main(String[] args) {
		
		try(Connection conn=DriverManager.getConnection(DB_URL,USER,PASS);
				PreparedStatement ps=conn.prepareStatement("UPDATE student SET sname=?,smarks=? WHERE sid=?");)
		{
			ps.setString(1,"jeeva");
			ps.setInt(2, 95);
			ps.setInt(3,3);
			int i=ps.executeUpdate();
			System.out.println(i+"record inserted");
			
		}catch(SQLException e) {
			System.out.println(e);
			
		}
	}
}
