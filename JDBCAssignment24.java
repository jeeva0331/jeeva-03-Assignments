package project;
import java.sql.*;

public class JDBCAssignment24 {

    static final String DB_URL = "jdbc:mysql://localhost:3306/assignment";
    static final String USER = "root";
    static final String PASS = "admin@123";

    public static void main(String[] args) {

        try (
            Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
            CallableStatement cs = con.prepareCall("{call updateMarks(?, ?)}");
        ) {

            // Set values
            cs.setInt(1, 101);   // student id
            cs.setInt(2, 95);    // new marks

            // Execute
            cs.executeUpdate();

            System.out.println("Marks updated successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
