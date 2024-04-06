package com.serenitydojo;

import org.junit.Test;

public class CreatingDogClass {

    @Test
    public void creating_a_dog() {
        String name = "Fido";
        String favoriteToy = "Bone";
        int age = 5;

        Dog fido = new Dog("Fido", "Bone", 5);

        System.out.println(fido.getName());
        System.out.println(fido.getFavoriteToy());
        System.out.println(fido.getAge());
    }
}
