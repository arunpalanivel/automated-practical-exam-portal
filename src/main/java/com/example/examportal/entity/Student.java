package com.example.examportal.entity;

import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String rollNumber;
    private String name;

    public Student(){

    }

    public Student(String rollNumber, String name){
        this.rollNumber = rollNumber;
        this.name = name;
    }

    public long getId(){
        return id;
    }

    public String getRollnumber() {
        return rollNumber;
    }

    public void setRollnumber(String rollnumber) {
        this.rollNumber = rollnumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
