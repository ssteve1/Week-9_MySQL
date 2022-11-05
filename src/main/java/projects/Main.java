package projects;

import projects.dao.DbConnection;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        Connection connection = DbConnection.getConnection();
    }
}