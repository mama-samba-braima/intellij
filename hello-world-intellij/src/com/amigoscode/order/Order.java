package com.amigoscode.order;

import com.amigoscode.customer.Customer;

import java.time.ZonedDateTime;
import java.util.Objects;

public class Order {
    private String id;
    private Customer customer;
    private ZonedDateTime orderDate;

    public Order(String id, Customer customer, ZonedDateTime orderDate) {
        this.id = id;
        this.customer = customer;
        this.orderDate = orderDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ZonedDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(ZonedDateTime orderDate) {
        this.orderDate = orderDate;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", customer=" + customer +
                ", orderDate=" + orderDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(id, order.id) && Objects.equals(customer, order.customer) && Objects.equals(orderDate, order.orderDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, customer, orderDate);
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
