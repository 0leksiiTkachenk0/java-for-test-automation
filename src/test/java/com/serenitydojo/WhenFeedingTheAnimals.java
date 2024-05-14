package com.serenitydojo;

import com.serenitydojo.model.Feeder;
import org.junit.Test;

public class WhenFeedingTheAnimals {

    @Test
    public void shouldFeedTheAnimalsWithTheRightFood() {
        Feeder feeder = new Feeder();

        String food = feeder.feeds("Cat");
        System.out.println();
    }
}
