package com.serenitydojo;

import org.junit.Test;

public class WhenCreatingObjects {

    @Test
    public void creating_a_cat() {
        String name = "Felix";
        String favoriteFood = "Tune";
        int age = 4;

        Cat felix = new Cat("Felix", "Tuna", 4);
        felix.setFavoriteFood("Tuna");

        System.out.println("This adorable pet's name is " + felix.getName());
        System.out.println("Spot likes to eat " + felix.getFavoriteFood());
        System.out.println("Spot's age is " + felix.getAge());


        Cat spot = new Cat("Spot", "Mice", 3);
        System.out.println("This adorable pet's name is " + spot.getName());
        System.out.println("Spot likes to eat " + spot.getFavoriteFood());
        System.out.println("Spot's age is " + spot.getAge());


    }
}
