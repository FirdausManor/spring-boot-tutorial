package com.example.demo.controller;

import java.util.List;
import java.util.NoSuchElementException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Customer;
import com.example.demo.service.CustomerService;

@RestController
@RequestMapping("/api")
public class CustomerController {
    @Autowired
    protected CustomerService customerService;

    @GetMapping("/search-all-customers")
    public List<Customer> list() 
    {
        System.out.println("Search All Customers Successfully!!");
        return customerService.listAllCustomer();
    }

    @GetMapping("/search-customer-by-id/{id}")
    public ResponseEntity<?> getCustomer(@PathVariable String id)
    {
        try {
            Customer customer = customerService.getCustomer(id);
            System.out.println("Search a Customer By ID Successfully!!");
            return new ResponseEntity<Customer>(customer, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/create-customer")
    public String add(@RequestBody Customer customer)
    {
        customerService.saveCustomer(customer);
        return "Success!!";
    }

    @PutMapping("/update-customer/{id}")
    public ResponseEntity<?> update(@RequestBody Customer customer, @PathVariable String id) {
        try {
            Customer existCustomer = customerService.getCustomer(id);
            customer.setCustermerId(id);
            customerService.saveCustomer(customer);
			System.out.println("Update a Customer Successfully!");
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
	
	@DeleteMapping("/delete-customer/{id}")
    public String delete(@PathVariable String id) {
		customerService.deleteCustomer(id);
		System.out.println("Delete a Customer Successfully!");
		return "Success!"; 
    }
}
