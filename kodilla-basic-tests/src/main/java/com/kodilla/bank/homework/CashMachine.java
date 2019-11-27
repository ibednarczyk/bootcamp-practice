package com.kodilla.bank.homework;

public class CashMachine {

    int[] transaction;

    public CashMachine() {
        this.transaction = new int[10];

    }

    public static void main(String[] args) {

        int[] transaction = new int[10];

        transaction[0] = 5000;
        transaction[1] = 10000;
        transaction[2] = (-200);
        transaction[3] = (-3500);
        transaction[4] = 600;
        transaction[5] = (-4500);
        transaction[6] = 5550;
        transaction[7] = (-50);
        transaction[8] = 8200;
        transaction[9] = (-6050);

    }


    public int getBalance() {
        int sum = 0;
        for (int i = 0; i < transaction.length; i++) {
            sum += transaction[i];
        }
        return sum;


    }

    public int getNumbersOfTransactions() {
        return transaction.length;
    }

    public int getNumbersOfDeposits() {
        int numberOfDeposit = 0;
        for (int i = 0; i < transaction.length; i++) {
            if (transaction[i] > 0) ;

        }
        return numberOfDeposit;
    }

    public int getNumbersOfWithdrawals() {
        int numberOfWithdrawals = 0;
        for (int i = 0; i < transaction.length; i++) {
            if (transaction[i] < 0) ;

        }
        return numberOfWithdrawals;
    }

    public int getAverageOfDeposits() {
        int sum = 0;
        int average =0;

        for (int i = 0; i < transaction.length; i++) {
            if (transaction[i] > 0) {
                sum += transaction[i];
                average = sum / getNumbersOfDeposits();
            }

        }
        return average;

    }

    public int getAverageOfWithdrawals() {
        int sum = 0;
        int average = 0;

        for (int i = 0; i < transaction.length; i++) {
            if (transaction[i] < 0) {
                sum += transaction[i];
                average = sum / getNumbersOfWithdrawals();
            }

        }
        return average;

    }
}



