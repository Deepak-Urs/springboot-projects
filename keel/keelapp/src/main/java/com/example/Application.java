package com.example;

import io.micronaut.runtime.Micronaut;

public class Application {
    public static void main(String[] args) {
        Micronaut.build(args)
                 .packages("com.example")
                 .mainClass(Application.class)
                 .start();
    }
}
