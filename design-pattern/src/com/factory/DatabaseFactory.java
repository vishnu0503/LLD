package com.factory;

import java.sql.SQLException;

public abstract class DatabaseFactory{
    public abstract Database createDatabase();
    public void testConnection() throws SQLException {
        Database db = createDatabase();
        String conn = db.connect();
        System.out.println("Connection obtained: "+conn);
    }
}
