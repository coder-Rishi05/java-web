
// 8. Write a Java program to connect the Java API to Database, if connection not successful then throw an exception

import java.sql.*;

class DatabaseConnectionException extends Exception {
    public DatabaseConnectionException(String message) {
        super(message);
    }
}

class a {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java_db",
                    "root",
                    "root12");

            if (con == null) {
                throw new DatabaseConnectionException("Connection not successful!");
            }

            System.out.println("Database connected successfully.");
            con.close();

        } catch (DatabaseConnectionException e) {
            System.out.println(e.getMessage());
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

/*
Output:
Database connected successfully.
*/
