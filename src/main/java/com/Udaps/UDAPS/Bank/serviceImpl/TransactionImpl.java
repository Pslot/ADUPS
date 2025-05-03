package com.Udaps.UDAPS.Bank.serviceImpl;

import com.Udaps.UDAPS.Bank.dto.TransactionDto;
import com.Udaps.UDAPS.Bank.entity.Transaction;
import com.Udaps.UDAPS.Bank.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TransactionImpl implements TransactionService{

    @Autowired
    TransactionRepository transactionRepository;


    @Override
    public void saveTransactionId(TransactionDto transactionDto) {

        Transaction transaction = Transaction.builder()
                .transactionType(transactionDto.getTransactionType())
                .accountNumber(transactionDto.getAccountNumber())
                .amount(transactionDto.getAmount())
                .status("SUCCESS")
                .build();
        transactionRepository.save(transaction);
        System.out.println("Transaction saved successfully");

    }
}
