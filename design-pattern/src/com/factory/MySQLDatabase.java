package com.factory;

import java.sql.SQLException;

public class MySQLDatabase implements Database{

    @Override
    public String connect() throws SQLException {
        return "jdbs:mysql://localhost:3000";
    }
}
