package com.amigoscode.notification;

public interface SmsSender {
    void sendSms(String phoneNumber, String message);
}
