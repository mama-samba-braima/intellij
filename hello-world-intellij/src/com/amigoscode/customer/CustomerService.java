package com.amigoscode.customer;

import java.util.List;
import java.util.Optional;
import java.util.Random;

public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Optional<Customer> findById(int id) {
        return customerRepository.findById(id);
    }

    /**
     * Saves a customer to the customer repository.
     *
     * @param customer The customer to be saved. Must not be null and the name must not be null or empty.
     * @throws IllegalArgumentException If the customer is null or the name is null or empty.
     */
    public void saveCustomer(Customer customer) {
        if (customer == null) {
            throw new IllegalArgumentException("Customer cannot be null");
        }
        if (customer.name() == null || customer.name().trim().isEmpty()) {
            throw new IllegalArgumentException("Customer name cannot be null or empty");
        }

        Integer generatedId = generateUniqueCustomerId();

        Customer newCustomer = new Customer(generatedId, customer.name(), customer.programmingLanguages());
        customerRepository.save(newCustomer);
    }


    private final Random random = new Random();

    /**
     * Generates a unique customer ID by randomly generating integers until a unique one is found.
     *
     * @return The unique customer ID.
     */
    public Integer generateUniqueCustomerId() {
        Integer id;
        do {
            id = random.nextInt(Integer.MAX_VALUE);
        } while (customerRepository.findById(id).isPresent());
        return id;
    }

    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}
