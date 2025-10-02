package com.example.accountProject.dto;

import com.example.accountProject.model.Account;

import java.util.Set;

public class CustomerDto {
    private String id;
    private String firstname;
    private String surname;

    private Set<Account> accounts;

    public CustomerDto(String id, String firstname, String surname,Set<Account> accounts) {
        this.id = id;
        this.firstname = firstname;
        this.surname = surname;
        this.accounts = accounts;
    }

    public Set<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(Set<Account> accounts) {
        this.accounts = accounts;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

}
