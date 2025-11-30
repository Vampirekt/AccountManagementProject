package com.example.accountProject.dto.converters;

import com.example.accountProject.dto.AccountCustomerDto;
import com.example.accountProject.dto.CustomerAccountDto;
import com.example.accountProject.dto.CustomerDto;
import com.example.accountProject.model.Account;
import com.example.accountProject.model.Customer;

import java.time.LocalDateTime;
import java.util.stream.Collectors;

public class CustomerAccountDtoConverter {
        public CustomerAccountDto convert(Account from) {
        if (from == null) {
            return new CustomerAccountDto("",null, LocalDateTime.now(), null);
        }

        return new CustomerAccountDto(
                from.getId(),
                from.getBalance(),
                from.getCreationDate(),
                from.getTransaction().stream()
                        .map(Customer)
                        .collect(Collectors.toSet())
        );
    }
}
}
