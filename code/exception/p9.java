// 9. Write a Java program to manage the driver with path, username and password, if not successful then throw an exception

import java.io.*;
import java.sql.*;

class DatabaseConnectionException extends Exception {
    public DatabaseConnectionException(String message) {
        super(message);
    }
}

class InputData {
    public int roll;
    public String name;
}

class a {
    public static void main(String[] args) {
        InputData obj = new InputData();
        Connection con = null;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Enter your roll no: ");
            obj.roll = Integer.parseInt(br.readLine());

            System.out.print("Enter your name: ");
            obj.name = br.readLine();

            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/java_db";
            String username = "root";
            String password = "root12";

            con = DriverManager.getConnection(url, username, password);

            if (con == null) {
                throw new DatabaseConnectionException("Connection failed: Could not establish database connection.");
            }

            Statement stmt = con.createStatement();
            int result = stmt.executeUpdate(
                    "INSERT INTO java_work (roll, name) VALUES (" + obj.roll + ", '" + obj.name + "')");

            System.out.println("Insert successful: " + result + " row(s) affected.");

        } catch (DatabaseConnectionException | SQLException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println("Input Error: " + e.getMessage());
        } finally {
            try {
                if (con != null) con.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

/*
Output:
Insert successful: 1 row(s) affected.
*/

