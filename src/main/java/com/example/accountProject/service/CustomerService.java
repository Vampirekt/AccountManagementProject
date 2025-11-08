package com.example.accountProject.service;

import com.example.accountProject.exception.CustomerNotFoundException;
import com.example.accountProject.model.Customer;
import com.example.accountProject.repository.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }

    protected Customer findCustomerById(String id){
        return customerRepository.findById(id).orElseThrow(()-> new CustomerNotFoundException("Customer didnt found."));
    }

}
