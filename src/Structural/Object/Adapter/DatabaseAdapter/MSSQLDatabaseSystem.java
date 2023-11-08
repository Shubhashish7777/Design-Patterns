package Structural.Object.Adapter.DatabaseAdapter;

import Structural.Object.Adapter.DatabaseAdapter.Target.DatabaseSystem;

public class MSSQLDatabaseSystem implements DatabaseSystem {


    public static final  MSSQLDatabaseSystem INSTANCE  = new MSSQLDatabaseSystem();

    private MSSQLDatabaseSystem(){

    }
    @Override
    public void runQuery() {
        System.out.println("RUN MS SQL DATABASE SYSTEM");
    }
}
