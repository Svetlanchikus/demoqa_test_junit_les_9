package demoqa.utils;

import com.github.javafaker.Faker;

public class randomUtils {
    Faker faker = new Faker();

    public String getFullName() {

        return faker.name().fullName();
    }

    public String getEmail() {

        return faker.internet().emailAddress();
    }

    public String getCurrentAddress() {

        return faker.address().fullAddress();
    }

    public String getPermanentAddress() {

        return faker.address().fullAddress();
    }
}