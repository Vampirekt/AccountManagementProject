package com.example.accountProject.dto;

import com.example.accountProject.model.Account;
import org.springframework.stereotype.Component;

import java.util.Objects;
import java.util.stream.Collectors;

@Component
public class AccountDtoConverter {
    private final AccountCustomerDtoConverter accountCustomerDtoConverter;
    private final TransactionDtoConverter transactionDtoConverter;

    public AccountDtoConverter(AccountCustomerDtoConverter accountCustomerDtoConverter,TransactionDtoConverter transactionDtoConverter) {
        this.accountCustomerDtoConverter = accountCustomerDtoConverter;
        this.transactionDtoConverter = transactionDtoConverter;
    }

    public AccountDto convert(Account from){
        return new AccountDto(from.getId(),from.getBalance(),from.getCreationDate(),
                from.getTransaction().stream()
                        .map(transactionDtoConverter::convert)
                        .collect(Collectors.toSet())
                ,accountCustomerDtoConverter.convert(from.getCustomer()));
    }
}
