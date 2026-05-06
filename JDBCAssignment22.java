
package project;
import java.sql.*;

public class JDBCEAssignment22 {

    static final String DB_URL = "jdbc:mysql://localhost:3306/vk";
    static final String USER = "root";
    static final String PASS = "admin@123";

    public static void main(String[] args) {

        try (
            Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
            CallableStatement cs = con.prepareCall("{call addEmployee(?, ?, ?, ?)}");
        ) {

        	

        	cs.setInt(1, 102);
        	cs.setString(2, "Mani");
        	cs.setDouble(3, 45000);
        	cs.setInt(4, 2);

        	cs.executeUpdate();

            // Execute
            cs.executeUpdate();

            System.out.println("Employee inserted successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
