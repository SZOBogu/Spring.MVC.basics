package example;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

public class Person {
    @Pattern(regexp = "\\w*", message = "Only alphanumeric characters acceptable")
    @NotEmpty(message = "You must enter name")
    private String name;

    @NotEmpty(message = "You must enter last name")
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
