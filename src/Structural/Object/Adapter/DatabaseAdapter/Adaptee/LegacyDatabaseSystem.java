package Structural.Object.Adapter.DatabaseAdapter.Adaptee;

public class LegacyDatabaseSystem {

    public final static LegacyDatabaseSystem INSTANCE = new LegacyDatabaseSystem();
    public void  runLegacyDB(){
        System.out.println("RUN LEGACY DATABASE SYSTEM.");
    }
}
