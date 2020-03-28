package org.example.springrest.service;

import org.example.springrest.entity.Customer;

import java.util.List;

public interface CustomerService {
    public List<Customer> getCustomers();
    public void saveOrUpdateCustomer(Customer customer);
    public Customer getCustomer(int id);
    public void deleteCustomer(int id);
}
