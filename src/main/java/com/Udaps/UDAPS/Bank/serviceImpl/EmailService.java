package com.Udaps.UDAPS.Bank.serviceImpl;

import com.Udaps.UDAPS.Bank.dto.EmailDetails;

public interface EmailService {
    void sendEmailAlert(EmailDetails emailDetails);
    void sendEmailWithAttachment(EmailDetails emailDetails);
}
