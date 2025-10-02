package com.example.accountProject.dto;

import com.example.accountProject.model.Customer;
import org.springframework.stereotype.Component;

@Component
public class CustomerDtoConverter {
    public AccountCustomerDto convert(Customer from){
        if(from==null){
            return new AccountCustomerDto("","","");
        }
        return new AccountCustomerDto(from.getId(), from.getFirstname(), from.getSurname());
    }
}
