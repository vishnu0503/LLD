package com.factory;

public class MySQLFactory extends DatabaseFactory{

    @Override
    public Database createDatabase() {
        return new MySQLDatabase();
    }
}
