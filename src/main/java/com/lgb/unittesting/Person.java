package com.lgb.unittesting;

public class Person {
    private String firstname, lastname;
    public Person(String firstname, String lastname){
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFullName(){
        return firstname + " " + lastname;
    }

    public  double add(double n1, double n2){
        return  n1 + n2;
    }
}
