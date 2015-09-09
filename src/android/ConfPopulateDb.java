package it.fcorvino.populatedb;

public class ConfPopulateDb {
    private String populationDb = "create.db";

    public static ConfPopulateDb loadFromProperties(Properties prop){
        ConfPopulateDb fromProps = new ConfPopulateDb();
        fromProps.populationDb = prop.getProperty("population.db")
        return fromProps;
    }
}
