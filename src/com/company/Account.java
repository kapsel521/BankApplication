package com.company;

public abstract class Account implements BaseRate {
    private String name;
    private String sSN; //numer ubezpieczenia
    private double balance;

    private static int index = 10000;
    protected String accountNumber;
    protected double rate;

    public Account(String name, String sSN, double initDeposit){
        this.name = name;
        this.sSN = sSN;
        this.balance = initDeposit;

        index++;
        this.accountNumber = setAcountNumber();
        setRate();
    }

    private String setAcountNumber(){
        String lastTwoSSN = sSN.substring(sSN.length()-2);
        int uniqueID = index;
        int randomNumber = (int) (Math.random() * Math.pow(10, 3));
        return lastTwoSSN + uniqueID + randomNumber;
    }

    public abstract void setRate();

    public void compound(){
        double accruedInterest = balance * (rate/100);
        balance = balance + accruedInterest;
        System.out.println("Accrued Interest: $" + accruedInterest);
        printBalance();
    }


    public void deposit(double amount){
        balance = balance + amount;
        printBalance();
    }
    public void withdraw(double amount){
        balance = balance - amount;
        printBalance();
    }
    public void transfer(String toWhere, double amount){
        balance = balance - amount;
        System.out.println("Transfered $" + amount + "to: " + toWhere);
        printBalance();
    }
    public void printBalance(){
        System.out.println("Your balance is $" + balance);
    }

    public void showInfo(){
        System.out.println(
                "NAME: " + name +
                "\nACCOUNT NUMBER: " + accountNumber +
                "\nBALANCE: "  + balance +
                "\nRATE: " + rate + "%"
        );
    }
}
