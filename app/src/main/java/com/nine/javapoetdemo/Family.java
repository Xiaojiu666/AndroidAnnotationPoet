package com.nine.javapoetdemo;

import com.nine.Person;
import com.nine.Pet;
import com.nine.component.DaggerPersonComponent;


import javax.inject.Inject;

public class Family {

    @Inject
    Person person;
    @Inject
    Pet pet;

    public void initFamily() {
        DaggerPersonComponent.create().inject(this);
        person.mouth("AAA");
        pet.mouth("AAA");
//        DaggerPersonComponent.create().inject(this);
    }
}
