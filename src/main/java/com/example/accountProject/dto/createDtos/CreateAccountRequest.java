package com.example.accountProject.dto.createDtos;

import java.math.BigDecimal;

public class CreateAccountRequest {
    private BigDecimal initialBalance;
    private String customerId;

    // Getter + Setter
    public BigDecimal getInitialBalance() {
        return initialBalance;
    }

    public void setInitialBalance(BigDecimal initialBalance) {
        this.initialBalance = initialBalance;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
}

