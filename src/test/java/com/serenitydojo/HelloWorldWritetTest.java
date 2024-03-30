package com.serenitydojo;

import org.junit.Test;

public class HelloWorldWritetTest {
    @Test
    public void shouldWriteHelloWorldToTheConsole() {
        HelloWorldWriter writer = new HelloWorldWriter();
        writer.writeHelloWorld();
    }
}
