package com.example.accountProject.dto;

import com.example.accountProject.model.Customer;
import com.example.accountProject.model.Transaction;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Set;

public class AccountDto {
    private String id;
    private BigDecimal balance;
    private LocalDateTime creationDate;
    private Set<TransactionDto> transaction;
    private AccountCustomerDto customer;

    public AccountDto(String id, BigDecimal balance, LocalDateTime creationDate, Set<TransactionDto> transaction, AccountCustomerDto customer) {
        this.id = id;
        this.balance = balance;
        this.creationDate = creationDate;
        this.transaction = transaction;
        this.customer = customer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public Set<TransactionDto> getTransaction() {
        return transaction;
    }

    public void setTransaction(Set<TransactionDto> transaction) {
        this.transaction = transaction;
    }

    public AccountCustomerDto getCustomer() {
        return customer;
    }

    public void setCustomer(AccountCustomerDto customer) {
        this.customer = customer;
    }

}
