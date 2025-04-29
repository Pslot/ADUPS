package com.Udaps.UDAPS.Bank.repository;

import com.Udaps.UDAPS.Bank.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, String> {
}
