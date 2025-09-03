package com.factory;

import java.sql.SQLException;

public class PostGreSQLDatabase implements Database{

    @Override
    public String connect() throws SQLException {
        return "jdbs:postgresql://localhost:5000";
    }
}
