package com.Udaps.UDAPS.Bank.serviceImpl;

import com.Udaps.UDAPS.Bank.dto.TransactionDto;
import com.Udaps.UDAPS.Bank.entity.Transaction;

public interface TransactionService {
    void saveTransactionId(TransactionDto transactionDto);
}
