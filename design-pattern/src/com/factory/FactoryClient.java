package com.factory;

import java.sql.SQLException;

public class FactoryClient {
    public static void main(String[] args) throws SQLException {
        DatabaseFactory factory = new MySQLFactory();
        factory.createDatabase();
        factory.testConnection();


        DatabaseFactory factory1 = new PostGreSQLFactory();
        factory1.createDatabase();
        factory1.testConnection();
    }

}
