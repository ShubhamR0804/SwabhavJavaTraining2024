package com.techlabs.observer.model;

public class SmsNotifier implements INotifier {
    @Override
    public void notify(Account account) {
        System.out.println("SMS Notification: Account " + account.getAccountNumber() + " has been updated.");
    }

}
