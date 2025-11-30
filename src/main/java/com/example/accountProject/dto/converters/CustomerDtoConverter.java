package com.example.accountProject.dto.converters;

import com.example.accountProject.dto.CustomerDto;
import com.example.accountProject.model.Customer;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class CustomerDtoConverter {

    public CustomerDto convert(Customer from) {
        if (from == null) {
            return new CustomerDto("", "", "",null);
        }

        return new CustomerDto(from.getId(),from.getFirstname(), from.getSurname(),from.getAccounts().stream()
                .map(CustomerAccountDtoConverter::convert)
                .collect(Collectors.toSet())
        );
    }
}
