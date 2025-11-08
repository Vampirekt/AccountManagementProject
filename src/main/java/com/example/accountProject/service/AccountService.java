package com.example.accountProject.service;

import com.example.accountProject.dto.AccountDto;
import com.example.accountProject.dto.CreateAccountRequest;
import com.example.accountProject.model.Account;
import com.example.accountProject.model.Customer;
import com.example.accountProject.repository.AccountRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.UUID;

@Service
public class AccountService {

    private final AccountRepository accountRepository;
    private final CustomerService customerService;
    private final TransactionService transactionService;


    public AccountService(AccountRepository accountRepository, CustomerService customerService, TransactionService transactionService) {
        this.accountRepository = accountRepository;
        this.customerService = customerService;
        this.transactionService = transactionService;
    }

    public AccountDto(CreateAccountRequest createAccountRequest){
        Customer customer = customerService.findCustomerById(createAccountRequest.getCustomerId());
        Account account = new Account(
                UUID.randomUUID().toString(),
                createAccountRequest.getInitialBalance(),
                LocalDateTime.now(),
                customer,
                new HashSet<>() // leere Transaktionsliste
        );
         return account;
    }
}
