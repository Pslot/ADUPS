package com.Udaps.UDAPS.Bank.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserRequests {

    private String firstName;
    private String lastName;
    private String gender;
    private String accountType;
    private String address;
    private String country;
    private String email;
    private String phoneNumber;

}
