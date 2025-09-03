package com.factory;

import java.sql.Connection;
import java.sql.SQLException;

public interface Database {
    public String connect() throws SQLException;
}
