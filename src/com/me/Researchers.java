package com.me;

public abstract class Researchers implements IPerson{

    private String firstName;
    private String lastName;
    private String projects;

    public Researchers(String firstName, String lastName, String projects) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.projects = projects;
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
    public String projects() {
        return projects;
    }
}
