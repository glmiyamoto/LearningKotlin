package com.glmiyamoto.learningkotlin.java;

public class PropertiesAndFields {
    final int a = 1;
    int b = 2;
    int c;

    String firstName;
    String lastName;

    String getFullname() {
        return firstName + lastName;
    }
}
