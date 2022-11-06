package projects.dao;

import projects.exception.DbException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    private static final String  HOST = "localhost";
    private static final String USERNAME = "projects";
    private static final String PASSWORD = "projects";
    private static final String SCHEMA = "projects";
    private static final int PORT =3306;

    public static Connection getConnection(){
        String uri = "jdbc:mysql://localhost:3306/projects";
        try {
            System.out.println("Connected to: " + uri);
            return DriverManager.getConnection(uri, USERNAME, PASSWORD);
        } catch (SQLException e) {
            String msg = "Unable to connect at" + uri;
            System.out.println(msg);
            throw new DbException(msg);
        }
    }
}
