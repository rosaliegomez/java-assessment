package main;

import main.Person;

abstract class User extends Person {
    protected static boolean isAdmin;
    public User(String firstName, String lastName, boolean isAdmin) {
        super(firstName, lastName);
        this.firstName = firstName;
        this.lastName = lastName;
        this.isAdmin = isAdmin;
    }
    public static boolean isAdmin(){
        return isAdmin;
    }

}
