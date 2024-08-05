package com.techlabs.observer.model;

public class WhatsappNotifier implements INotifier {
    @Override
    public void notify(Account account) {
        System.out.println("WhatsApp Notification: Account " + account.getAccountNumber() + " has been updated.");
    }

}
