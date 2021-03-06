package com.coderbd.day5.domain;

/**
 *
 * @author Instructor
 */
//step-1 :: class declaration
public class Department {

    //step-2 field declaration
    private int id;
    private String name;
//step-3 default constructor

    public Department() {
    }

    //step-4 Argumentative constructor
    public Department(int id, String name) {
        this.id = id;
        this.name = name;
    }
//step-5 getter methods

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
