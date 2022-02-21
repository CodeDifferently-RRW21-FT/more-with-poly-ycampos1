package com.codedifferently.petshop.store;

import com.codedifferently.petshop.ActivityTime;
import com.codedifferently.petshop.Pet;
import com.codedifferently.petshop.birds.Parrot;
import com.codedifferently.petshop.staff.Employee;
import com.codedifferently.petshop.staff.TrainedEmployee;

import java.util.ArrayList;

public class PetStore {
    private ArrayList<TrainedEmployee> employees;
    private ArrayList<Pet> pets;

    public PetStore (){
        this.employees= new ArrayList<>();
        this.pets = new ArrayList<>();
        TrainedEmployee trainedEmployee = new TrainedEmployee("Bosco");
        Parrot parrot = new Parrot("Tariq", 80, ActivityTime.NOCTURNAL);
        pets.add(parrot);
        employees.add(trainedEmployee);
    }

    private void feedPets (TrainedEmployee employee){
      Integer count = employee.feedAnimals(pets);
      String outPut= String.format("%s Just fed %d pets", employee.getName(),count);
        System.out.println(outPut);
    }

    public void run (){
        System.out.println("Welcome to our pet store!");
        TrainedEmployee employee = employees.get(0);
        feedPets(employee);

    }

    public static void main(String[] args) {
        PetStore petStore= new PetStore();
        petStore.run();
    }
}
