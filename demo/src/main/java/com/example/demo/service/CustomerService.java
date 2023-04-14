package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepository;

@Service
public class CustomerService {
    @Autowired
    protected CustomerRepository customerRepository;

    public List<Customer> listAllCustomer() 
    {
        return customerRepository.findAll();
    }

    public void saveCustomer(Customer customer) 
    {
        customerRepository.save(customer);
    }

    public Customer getCustomer(String id) 
    {
        return customerRepository.findById(id).get();
    }

    public void deleteCustomer(String id) 
    {
        customerRepository.deleteById(id);
    }
}
