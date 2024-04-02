package com.serenitydojo;

import org.junit.Test;

public class WhenCreatingObjects {

    @Test
    public void creating_a_cat() {
        String name = "Felix";
        String favoriteFood = "Tune";
        int age = 4;

        Cat felix = new Cat();

        felix.name = "Felix";
        felix.favoriteFood = "Tuna";
        felix.age = 4;

        Cat spot = new Cat();

        spot.name = "Spot";
        spot.favoriteFood = "Mice";
        spot.age = 28;

    }
}
