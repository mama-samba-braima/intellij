package com.amigoscode.customer;

import java.util.List;
import java.util.Optional;

public interface CustomerRepository {
    Optional<Customer> findById(int id);
    Optional<Customer> findByName(String name);
    List<Customer> findAll();
    void save(Customer customer);
    void delete(Integer id);
}
