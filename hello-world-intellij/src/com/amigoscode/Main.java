package com.amigoscode;

import com.amigoscode.customer.Customer;
import com.amigoscode.customer.CustomerService;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static final String AMIGOSCODE = "AMIGOSCODE";

    public static void main(String[] args) {

        CustomerService customerService =
                new CustomerService(null);

        customerService.generateUniqueCustomerId();
        customerService.findAll();

        System.out.println(Arrays.toString(args));

        var customer = new Customer(
                1,
                "Jamila",
                List.of("Java", "Go")
        );

        System.out.println(customer);
        Person person = new Person(1, "John", "Doe", Gender.MALE);

        System.out.println(person);

        // Amigoscode

        printLower();

    }

    private static void printLower() {
        System.out.println(lower(AMIGOSCODE));
        System.out.println(lower("FOOBAR"));
    }

    public static String lower(String str) {
        return str.toLowerCase();
    }

    enum Gender {MALE, FEMALE}

    record Person(int id, String firstName, String lastName, Gender gender) {
    }
}