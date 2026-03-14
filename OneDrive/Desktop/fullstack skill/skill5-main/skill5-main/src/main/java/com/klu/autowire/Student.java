package com.klu.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {

    private int id;
    private String name;
    private String gender;

    @Autowired
    private Certification certification;

    public Student() {
        this.id = 1;
        this.name = "Sreeja Raj";
        this.gender = "Female";
    }

    public void display() {

        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Gender: " + gender);

        System.out.println("Certification ID: " + certification.getId());
        System.out.println("Certification Name: " + certification.getName());
        System.out.println("Completion Date: " + certification.getDateOfCompletion());

    }

}