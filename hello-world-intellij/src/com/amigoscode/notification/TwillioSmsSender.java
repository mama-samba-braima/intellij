package com.amigoscode.notification;

public class TwillioSmsSender implements SmsSender {
    @Override
    public void sendSms(String phoneNumber, String message) {
        System.out.println("Twillio");
        System.out.println("Sending SMS to " + phoneNumber);
    }
}
