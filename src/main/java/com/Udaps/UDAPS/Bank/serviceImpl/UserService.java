package com.Udaps.UDAPS.Bank.serviceImpl;

import com.Udaps.UDAPS.Bank.dto.*;

public interface UserService {

    BankResponse createAccount(UserRequests userRequestsU);

    BankResponse balanceEnquiry(EnquiryRequest request);
    String nameEnquiry(EnquiryRequest request);
    BankResponse creditAccount(CreditDebitRequest request);
    BankResponse debitAccount(CreditDebitRequest request);
    BankResponse transfer(TransferRequest request);


}
