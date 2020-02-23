package example;

import validation.CustomValidationAnnotation;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

public class Person {
    @Pattern(regexp = "\\w*", message = "Only alphanumeric characters and underscores acceptable")
    @NotEmpty(message = "You must enter name")
    private String name;

    @NotEmpty(message = "You must enter last name")
    private String lastName;
    private String country;
    @CustomValidationAnnotation(message = "can you rewrite a simple message?")
    private String someTest;

    public Person(String name, String lastName, String country, String someTest) {
        this.name = name;
        this.lastName = lastName;
        this.country = country;
        this.someTest = someTest;
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

    public String getSomeTest() {
        return someTest;
    }

    public void setSomeTest(String someTest) {
        this.someTest = someTest;
    }
}
