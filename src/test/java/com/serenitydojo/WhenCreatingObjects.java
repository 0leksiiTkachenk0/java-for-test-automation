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

        System.out.println(felix.getName());
        System.out.println(felix.getFavoriteFood());
        System.out.println(felix.getAge());


        Cat spot = new Cat("Spot", "Mice", 3);
        System.out.println(spot.getName());
        System.out.println(spot.getFavoriteFood());
        System.out.println(spot.getAge());

    }
}
