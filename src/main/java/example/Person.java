package example;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Person {
    @Size(min = 1, max=20)
    //@Pattern(regexp = "^[A-Z][a-z]$", message = "regep wyjebalo")
    private String name;

    @Size(min = 1, max=20)
    private String lastName;
    private String country;

    public Person(String name, String lastName, String country) {
        this.name = name;
        this.lastName = lastName;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
