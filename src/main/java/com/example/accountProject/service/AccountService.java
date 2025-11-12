package com.example.accountProject.service;

import com.example.accountProject.dto.AccountDto;
import com.example.accountProject.dto.AccountDtoConverter;
import com.example.accountProject.dto.createDtos.CreateAccountRequest;
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
    private final AccountDtoConverter accountDtoConverter;

    public AccountService(AccountRepository accountRepository,
                          CustomerService customerService,
                          AccountDtoConverter accountDtoConverter) {
        this.accountRepository = accountRepository;
        this.customerService = customerService;
        this.accountDtoConverter = accountDtoConverter;
    }

    public AccountDto createAccount(CreateAccountRequest createAccountRequest) {
        // 1️⃣ Kunden aus DB holen
        Customer customer = customerService.findCustomerById(createAccountRequest.getCustomerId());

        // 2️⃣ Neues Konto erzeugen
        Account account = new Account(
                UUID.randomUUID().toString(),
                createAccountRequest.getInitialBalance(),
                LocalDateTime.now(),
                customer,
                new HashSet<>()
        );

        // 3️⃣ In DB speichern
        Account savedAccount = accountRepository.save(account);

        // 4️⃣ DTO zurückgeben
        return accountDtoConverter.convert(savedAccount);
    }
}
