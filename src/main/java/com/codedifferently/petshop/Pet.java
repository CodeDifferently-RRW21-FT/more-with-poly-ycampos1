package com.codedifferently.petshop;

public abstract class Pet {
    private String name;
    private Integer age;

    public Pet(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString(){
        return name + " " + age;
    }

}
