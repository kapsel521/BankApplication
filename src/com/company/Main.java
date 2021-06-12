package com.company;

import utilities.CSV;

import javax.swing.text.Utilities;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //lista do przechowywania naszych kont jako obiektów
        List<Account> accounts = new LinkedList<>();

        //tu podajemy ścieżkę do pliku który będziemy ofczytywać:
        String file = "C:\\Users\\kapse\\Desktop\\Kurs TEB\\Projekt grupowy\\NewBankAccounts.csv";

        //tu zczytujemy nowe konta, a potem będziemy je generować
        List<String[]> newAccountHolder = CSV.read(file);
        //alternatuwnie możemy zapisać pętlę tak:
        for (String[] accountHolder: newAccountHolder) {

            String name = accountHolder[0];
            String sSN = accountHolder[1];
            String accountType = accountHolder[2];
            double initDeposit = Double.parseDouble(accountHolder[3]);

            if(accountType.equals("Savings")){
                accounts.add(new Savings(name, sSN, initDeposit));
            }else if(accountType.equals("Checking")){
                accounts.add(new Checking(name, sSN, initDeposit));
            }else {
                System.out.println("ERROR READING ACCOUNT TYPE");
            }
        }
        for(Account acc: accounts){
            System.out.println("***************");
            acc.showInfo();
        }
    }
}
