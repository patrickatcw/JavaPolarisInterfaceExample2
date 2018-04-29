package com.me;

public abstract class Employee implements IPerson{

    private String firstName;
    private String lastName;
    private String organization;

    public Employee(String firstName, String lastName, String organization) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.organization = organization;

    }

    @Override
    public String firstName() {
        return firstName;
    }

    @Override
    public String lastName() {
        return lastName;
    }

    @Override
    public String organization() {
        return organization;
    }
}
