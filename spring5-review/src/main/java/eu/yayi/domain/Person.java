package eu.yayi.domain;

public class Person {

    private String firstName;
    private String lastName ;

    public Person() {
    }

    public Person(String firsName, String lastName) {
        this.firstName = firsName;
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firsName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
