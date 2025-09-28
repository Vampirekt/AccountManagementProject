package com.example.accountProject;

import com.example.accountProject.model.Account;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.Set;

@SpringBootApplication
public class AccountProjectApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(AccountProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Account a = new Account("a", BigDecimal.ONE, LocalDateTime.now(),null, Collections.emptySet());
		Account b = new Account("a", BigDecimal.ONE, LocalDateTime.now(),null, Collections.emptySet());

	}
}
