package Structural.Object.Adapter.DatabaseAdapter.Adapter;

import Structural.Object.Adapter.DatabaseAdapter.Adaptee.LegacyDatabaseSystem;
import Structural.Object.Adapter.DatabaseAdapter.Target.DatabaseSystem;

public class LegacyDatabaseAdapter extends LegacyDatabaseSystem implements DatabaseSystem {

    LegacyDatabaseSystem legacyDatabaseSystem;

    public  static final  LegacyDatabaseAdapter INSTANCE = new LegacyDatabaseAdapter();

    private LegacyDatabaseAdapter(){
        this.legacyDatabaseSystem = LegacyDatabaseSystem.INSTANCE;
    }


    @Override
    public void runQuery() {
        legacyDatabaseSystem.runLegacyDB();
    }
}
