package com.company;

public class Savings extends Account{
    private int safetyDepositBoxID;
    private int safetyDepositBoxPin;

    public Savings(String name, String sSN, double initDeposit){
        super(name, sSN, initDeposit);
        accountNumber = "1" + accountNumber;
        setSafetyDepositBox();
    }

    @Override
    public void setRate() {
        rate = getBaseRate() - 0.25;
    }

    private void setSafetyDepositBox(){
        safetyDepositBoxID = (int) (Math.random() * Math.pow(10,3));
        safetyDepositBoxPin = (int) (Math.random() * Math.pow(10,4));
    }

    //NADPISANIE METODY Z KLASY ACCOUNT
    public void showInfo(){
        super.showInfo();
        System.out.println(
                "ACCOUNT TYPE: Savings" +
                "\nDEPOSIT BOX ID: " + safetyDepositBoxID +
                "\nDEPOSIT BOX PIN: " +safetyDepositBoxPin
        );
    }
}
