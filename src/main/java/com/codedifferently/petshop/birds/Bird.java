package com.codedifferently.petshop.birds;

import com.codedifferently.petshop.ActivityTime;
import com.codedifferently.petshop.Pet;

public abstract class Bird extends Pet {
    private ActivityTime activityTime;

    public Bird(String name, Integer age, ActivityTime activityTime) {
        super(name, age);
        this.activityTime = activityTime;
    }

    public ActivityTime getActivityTime() {
        return activityTime;
    }

    @Override
    public String toString(){
        return this.getName() + " " + this.getAge() + " " + activityTime;
    }
}
