package org.example;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String connectionUrl = "jdbc:mysql://localhost:3306/db_summer_2024";
        String username = "root";
        String password = "root";
        Connection con;
        try {
            con = DriverManager.getConnection(connectionUrl, username, password);

//            PreparedStatement ps1 = con.prepareStatement("INSERT INTO persons VALUES(4,?, ?, 40)");
//            ps1.setString(1, "TEST USER");
//            ps1.setString(2, "TEST");
//            ps1.execute();

            ResultSet rs = con.createStatement().executeQuery("SELECT * FROM persons");

            while (rs.next()){
                System.out.println(rs.getInt("ID") + " " + rs.getString("FIRST_NAME") + " " + rs.getString("LAST_NAME"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        TestObject o = new TestObject();
        o.setId(1);
        o.setFirstName("Alex");
        System.out.println(o.getFirstName());

    }
}