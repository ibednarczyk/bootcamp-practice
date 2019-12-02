package com.kodilla.bank.homework;

public class CashMachine {

    int[] transactions;
    int indexOfTransaction = 0;

    public CashMachine() {
        this.transactions = new int[10];
    }

    public void addTransaction(int transaction){
        if (indexOfTransaction<10){
            transactions[indexOfTransaction] = transaction;
            indexOfTransaction++;
        }
    }
    public int getBalance() {
        int sum = 0;
        for (int i = 0; i < transactions.length; i++) {
            if (this.transactions[i] != 0) {
                sum += transactions[i]; }
        }
        return sum;
    }


    public void addDeposit(int deposit) {
        if (indexOfTransaction<10 && deposit>0) {
            transactions[indexOfTransaction] = deposit;
            indexOfTransaction++;
        }
    }

    public int getNumbersOfDeposits() {
        int numberOfDeposits = 0;
        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] != 0) {
                transactions[i]= numberOfDeposits;
                numberOfDeposits++;
            }
        }
        return numberOfDeposits;
    }

    public void addWithdrawal(int withdrawal){
        if (indexOfTransaction<10 && withdrawal<0){
            transactions[indexOfTransaction] = withdrawal;
            indexOfTransaction++;
        }
    }

    public int getNumbersOfWithdrawals() {
        int numberOfWithdrawals = 0;
        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] != 0) {
                transactions[i] = numberOfWithdrawals;
                numberOfWithdrawals++;
            }
        }
        return numberOfWithdrawals;
    }

    public int getSumOfDeposits(){
        int sum = 0;
        for (int i = 0; i<transactions.length;i++){
            if(transactions[i] !=0){
                sum+= transactions[i];

            }
        } return sum;
    }


    public int getSumOfWithdrawals(){
        int sum =0;
        for (int i = 0; i<transactions.length; i++){
            if (transactions[i] != 0){
                sum += transactions[i];
            }
        }
        return sum;
    }

}



