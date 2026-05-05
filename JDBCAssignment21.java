package project;

import java.sql.*;

public class JDBCAssignment21 {
	static final String DB_URL="jdbc:mysql://localhost:3306/vk";
	static final String USER="root";
	static final String PASS="admin@123";
	
    public static void main(String[] args) {
        try (     	
        	Connection con = DriverManager.getConnection(DB_URL,USER,PASS);
            CallableStatement cs = con.prepareCall("{call insertStudent(?, ?, ?)}");)
        
        {
            // Set values
            cs.setInt(1, 103);
            cs.setString(2, "Jeeva");
            cs.setInt(3, 85);
            
            cs.setInt(1, 104);
            cs.setString(2,"manju");
            cs.setInt(3,90);

            // Execute
            cs.execute();

            System.out.println("Data inserted using CallableStatement");

            cs.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
