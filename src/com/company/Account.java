package com.company;

public abstract class Account implements BaseRate {
    String name;
    String sSN; //numer ubezpieczenia
    double balance;

    static int index = 10000;
    String accountNumber;
    double rate;

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

    public void showInfo(){
        System.out.println(
                "NAME: " + name +
                "\nACCOUNT NUMBER: " + accountNumber +
                "\nBALANCE: "  + balance +
                "\nRATE: " + rate + "%"
        );
    }
}
