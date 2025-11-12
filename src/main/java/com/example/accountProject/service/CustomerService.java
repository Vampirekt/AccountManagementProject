package com.example.accountProject.service;

import com.example.accountProject.dto.CustomerDto;
import com.example.accountProject.dto.CustomerDtoConverter;
import com.example.accountProject.dto.createDtos.CreateCustomerRequest;
import com.example.accountProject.exception.CustomerNotFoundException;
import com.example.accountProject.model.Customer;
import com.example.accountProject.repository.AccountRepository;
import com.example.accountProject.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.UUID;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;
    private final AccountRepository accountRepository;
    private final CustomerDtoConverter customerDtoConverter;

    public CustomerService(CustomerRepository customerRepository, AccountRepository accountRepository, CustomerDtoConverter customerDtoConverter) {
        this.customerRepository = customerRepository;
        this.accountRepository = accountRepository;
        this.customerDtoConverter = customerDtoConverter;
    }


    protected Customer findCustomerById(String id){
        return customerRepository.findById(id).orElseThrow(()-> new CustomerNotFoundException("Customer didnt found."));
    }

    public CustomerDto createCustomer(CreateCustomerRequest createCustomerRequest) {

        Customer customer = new Customer(
                UUID.randomUUID().toString(),
                createCustomerRequest.getFirstname(),
                createCustomerRequest.getSurname(),
                new HashSet<>()

        );
        Customer savedCustomer = customerRepository.save(customer);
        return customerDtoConverter.convert(savedCustomer);


    }
}
