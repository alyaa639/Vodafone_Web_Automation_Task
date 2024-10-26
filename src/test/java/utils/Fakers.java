package utils;

import base.TestBase;
import com.github.javafaker.Faker;
import org.apache.commons.lang3.RandomStringUtils;

public class Fakers  {
    private static final Faker faker = new Faker();

    public static String generateRandomName() {
        return faker.name().fullName();
    }

    public static String generateRandomEmail() {
        return faker.internet().emailAddress();
    }

    public static String generateRandomPassword(int length) {
        String lettersAndNumbers = RandomStringUtils.randomAlphanumeric(length - 2);
        String specialCharacters = RandomStringUtils.random(2, "!@#$%^&*");
        return lettersAndNumbers + specialCharacters;
    }
}
