package com.Udaps.UDAPS.Bank.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AccountInfo {
    private String accountName;
    private String accountNumber;
    private BigDecimal balance;
    private String accountType;
}
