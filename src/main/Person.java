package main;

abstract class Person implements Greeter{
    protected String firstName;
    protected String lastName;

    public Person (String firstName, String lastName) {
        firstName = this.firstName;
        lastName = this.lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    @Override
    public String sayHello() {
        return "Hello from " + firstName + lastName;
    }

    public static void main(String[] args) {

    }
}
