package com.amigoscode.customer

import java.util.*

class CustomerServiceKT(private val customerRepository: CustomerRepository) {

    private val random = Random()

    fun findById(id: Int): Optional<Customer> {
        return customerRepository.findById(id)
    }

    fun saveCustomer(customer: Customer?) {
        customer?.let {
            if (it.name.isNullOrEmpty()) {
                throw IllegalArgumentException("Customer name cannot be null or empty")
            }

            val generatedId = generateUniqueCustomerId()

            val newCustomer = Customer(generatedId, it.name, it.programmingLanguages())
            customerRepository.save(newCustomer)
        } ?: throw IllegalArgumentException("Customer cannot be null")
    }

    private fun generateUniqueCustomerId(): Int {
        var id: Int
        do {
            id = random.nextInt(Int.MAX_VALUE)
        } while (customerRepository.findById(id).isPresent)
        return id
    }

    fun findAll(): List<Customer> {
        return customerRepository.findAll()
    }
}