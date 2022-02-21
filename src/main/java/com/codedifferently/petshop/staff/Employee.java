package com.codedifferently.petshop.staff;

public class Employee extends Person {
    private static Integer idCount = 0;
    private Integer id;

    public Employee(String name) {
        super(name);
        id = ++idCount;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return this.getName() + " " + id;
    }
}
