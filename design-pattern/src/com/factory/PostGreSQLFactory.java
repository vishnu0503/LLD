package com.factory;

public class PostGreSQLFactory extends DatabaseFactory {

    @Override
    public Database createDatabase() {
        return new PostGreSQLDatabase();
    }
}
