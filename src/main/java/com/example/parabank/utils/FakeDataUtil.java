package com.example.parabank.utils;

import com.github.javafaker.Faker;

public class FakeDataUtil {
    private static Faker faker = new Faker();

    public static String getFirstName() {
        return faker.name().firstName();
    }

    public static String getLastName() {
        return faker.name().lastName();
    }

    public static String getEmail() {
        return faker.internet().emailAddress();
    }

    // Add more methods as needed...
}
