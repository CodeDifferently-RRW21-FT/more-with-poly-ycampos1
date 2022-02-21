package com.codedifferently.petshop.staff;

import com.codedifferently.petshop.Pet;

import java.util.ArrayList;

public class TrainedEmployee extends Employee implements PetGroomer, PetFeeder {

    public TrainedEmployee(String name) {
        super(name);
    }

    @Override
    public Integer feedAnimals(ArrayList<Pet> pets) {

        return pets.size();
    }
}
