package example;

import java.util.ArrayList;

public class PersonDatabase {
    private ArrayList<Person> db;

    public PersonDatabase(){
        this.db = new ArrayList<>();
    }

    public ArrayList<Person> getDb() {
        return db;
    }

    public Person getPerson(int index){
        return this.db.get(index);
    }

    public void add(Person person){
        this.db.add(person);
    }
}
