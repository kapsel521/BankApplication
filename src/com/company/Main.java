package com.company;

public class Main {

    public static void main(String[] args) {
        Checking checkingAccount = new Checking("John Smith",
                "123456789", 1500);
        Savings savings1 = new Savings("Marek Kowalski",
                "123456789", 2500);

        checkingAccount.showInfo();
        System.out.println("*************");
        savings1.showInfo();
    }
}
