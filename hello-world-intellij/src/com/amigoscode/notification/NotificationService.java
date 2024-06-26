package com.amigoscode.notification;

import com.amigoscode.customer.CustomerService;

public class NotificationService {
    private final SmsSender smsSender;

    public NotificationService(SmsSender smsSender) {
        this.smsSender = smsSender;
    }

    public void sendSms(String phoneNumber, String message) {
        CustomerService customerService =
                new CustomerService(null);
        customerService.findAll();
        smsSender.sendSms(phoneNumber, message);
    }
}
