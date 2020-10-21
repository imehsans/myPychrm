package com.ehsan.designpatterns.course;

public class User {
// fields (attributes)
    public String name;

    public User(String name) {
        this.name = name;
    }

    //methodes
    public void sayHello(){
        System.out.println("Hi, My name is "+ this.name);
    }
}
