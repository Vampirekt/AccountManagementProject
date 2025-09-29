package com.example.accountProject.dto;

import com.example.accountProject.model.Account;
import com.example.accountProject.model.Transaction;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TransactionDto {
    private String id;
    private Transaction.TransactionType transactionType = Transaction.TransactionType.INITIAL;
    private BigDecimal amount;
    private LocalDateTime transactionDate;


    public TransactionDto(String id, Transaction.TransactionType transactionType, BigDecimal amount, LocalDateTime transactionDate) {
        this.id = id;
        this.transactionType = transactionType;
        this.amount = amount;
        this.transactionDate = transactionDate;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Transaction.TransactionType getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(Transaction.TransactionType transactionType) {
        this.transactionType = transactionType;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public LocalDateTime getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDateTime transactionDate) {
        this.transactionDate = transactionDate;
    }



}
