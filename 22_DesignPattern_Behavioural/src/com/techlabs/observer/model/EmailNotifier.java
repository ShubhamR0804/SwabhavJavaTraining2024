package com.techlabs.observer.model;

public class EmailNotifier implements INotifier {
    @Override
    public void notify(Account account) {
        System.out.println("Email Notification: Account " + account.getAccountNumber() + " has been updated.");
    }

}
