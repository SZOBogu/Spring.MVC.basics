package example;

import java.util.ArrayList;

public class GreetingDatabase {
    private ArrayList<Greeting> db;

    public GreetingDatabase(){
        this.db = new ArrayList<>();
    }

    public ArrayList<Greeting> getDb() {
        return db;
    }
}
