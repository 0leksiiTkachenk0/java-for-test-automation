package com.serenitydojo;

import org.junit.Test;

public class HelloWorldWriterTest {

    @Test
    public void shouldWriteHelloWorldToTheConsole() {
        HelloWorldWriter writer = new HelloWorldWriter();
        writer.writeHelloWorld();
    }

    @Test
    public void declaringNumericalVariables() {

        final int ageThisYear = 42;

        int ageNextYear = ageThisYear +1;

        long StarsInTheGalaxy = 1000000000000L;

        float weight = 65.1F;

        double height = 111.1D;

        System.out.println("age = " + ageNextYear);
    }

    @Test
    public void workingWithStrings() {

        String firstName = " Pavel Mutas ";

        String upperCaseFirstName = firstName.replaceFirst("Mutas", "The Great");
        System.out.println(firstName.trim());
    }
}
