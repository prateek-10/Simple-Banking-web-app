package com.github.prateek10.Banking.Application.repository;

import com.github.prateek10.Banking.Application.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {

    
} 
