package com.serenitydojo;

import org.junit.Assert;
import org.junit.Test;
import static com.serenitydojo.Cat.usualFood;

public class WhenCreatingObjects {

    @Test
    public void creating_a_cat() {
        String name = "Felix";
        String favoriteFood = "Tuna";
        int age = 4;

        Cat felix = new Cat(name, favoriteFood, age);

        System.out.println("This adorable pet's name is " + felix.getName());
        System.out.println(name + "likes to eat " + felix.getFavoriteFood());
        System.out.println(name + " 's age is " + felix.getAge());


        Cat spot = new Cat("Spot", "Mice", 3);
        System.out.println("This adorable pet's name is " + spot.getName());
        System.out.println("Spot likes to eat " + spot.getFavoriteFood());
        System.out.println("Spot's age is " + spot.getAge());

        Pet hamster = new Hamster ("Rusty","wheel", 5);

    }

    @Test
    public void creating_a_hamster() {
        Hamster rusty = new Hamster("Rusty","Wheel",1);

        Assert.assertEquals(rusty.getName(),"Rusty");
        Assert.assertEquals(rusty.getFavoriteGame(), "Wheel");
        Assert.assertEquals(rusty.getAge(), 1);
    }
    @Test
    public void cat_makes_noise() {
        Cat felix = new Cat("Felix", "Tuna", 4);

        System.out.println("Felix goes " + felix.makeNoise());
    }

    @Test
    public void dog_makes_noise() {
        Dog fido = new Dog("Fido", "bone", 5);
        System.out.println("Fido goes " + fido.makeNoise());
    }

    @Test
    public void pets_make_noise() {
        Pet felix = new Cat("Felix", 4);
        Pet fido = new Dog("Fido", "bone", 5);
        Pet rusty = new Hamster("Rusty", "wheels", 1);

        System.out.println("Felix goes " + felix.makeNoise());
        System.out.println("Fido goes " + fido.makeNoise());
        System.out.println("Rusty goes " + rusty.makeNoise());
    }
}
