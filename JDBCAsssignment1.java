package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCCallable {

	static final String DB_URL="jdbc:mysql://localhost:3306/jeeva";
    static final String USER="root";
    static final String PASS="admin@123";
	
	
	public static void main(String[] args) {
	
		

		
		try(Connection conn=DriverManager.getConnection(DB_URL,USER,PASS);
			
		PreparedStatement ps=conn.prepareStatement("INSERT INTO Student(sid,sname,srollno) VALUES (?,?,?)");)
		
		{
			
			ps.setInt(1,1);
			ps.setString(2,"Jeeva");
			ps.setInt(3, 90);
			
			int i=ps.executeUpdate();
			System.out.println(i+"record inserted succesfully");
			
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}

	}

}
