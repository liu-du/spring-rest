package org.example.springrest.dao;

import org.example.springrest.entity.Customer;

import java.util.List;

public interface CustomerDAO {
    public List<Customer> getCustomers();
    public void saveOrUpdateCustomer(Customer customer);
    public Customer getCustomer(int id);
    public void deleteCustomer(int id);
}
