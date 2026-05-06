package project;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCAssignment23 {



    static final String DB_URL = "jdbc:mysql://localhost:3306/assignment";
    static final String USER = "root";
    static final String PASS = "admin@123";

    public static void main(String[] args) {

        try (
            Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
            CallableStatement cs = con.prepareCall("{call insertUser(?, ?, ?)}");
        ) {

            // Set input values
            cs.setInt(1, 1);
            cs.setString(2, "Jeeva");
            cs.setString(3, "jeeva@gmail.com");

            // Execute procedure
            int i=cs.executeUpdate();

            System.out.println(i+"User inserted successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
