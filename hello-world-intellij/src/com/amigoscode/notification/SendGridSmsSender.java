package com.amigoscode.notification;

public class SendGridSmsSender implements SmsSender {
    @Override
    public void sendSms(String phoneNumber, String message) {
        System.out.println("SendGrid");
        System.out.println("Sending SMS to " + phoneNumber);
    }
}
