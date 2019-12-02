package com.kodilla.bank.homework;

public class Bank {
    int indexOfCashMachine = 0;

    public CashMachine[] cashmachine;

    public Bank() {

        this.cashmachine = new CashMachine[4];
    }

    public void addCashmachine(CashMachine numberOfCashMachine) {
        if (indexOfCashMachine < 4) {
            cashmachine[indexOfCashMachine] = numberOfCashMachine;
            indexOfCashMachine++;
        }
    }

    public int getBalanceFromAllCashMachines() {
        int sum = 0;
        for (int i = 0; i < cashmachine.length; i++) {
            if (this.cashmachine[i] != null) {
                sum += this.cashmachine[i].getBalance();
            }
        }
        return sum;
    }

    public int getNumberOfDepositsFromAllCashMachines() {
        int numberOfDepositsFromAllCashMachines =0;
        for (int i = 0; i < cashmachine.length; i++) {
            if (this.cashmachine[i] != null) {
                numberOfDepositsFromAllCashMachines+= this.cashmachine[i].getNumbersOfDeposits();
            }
        }
        return numberOfDepositsFromAllCashMachines;
    }

    public int getNumberOfWithdrawalsFromAllCashMachines() {
        int numberOfWithdrawalsFromAllCashMachines = 0;
        for (int i = 0; i < cashmachine.length; i++) {
            if (this.cashmachine[i] != null) {
                numberOfWithdrawalsFromAllCashMachines+= this.cashmachine[i].getNumbersOfWithdrawals();
            }
        }
        return numberOfWithdrawalsFromAllCashMachines;

    }

    public int getAverageOfDepositsFromAllCashMachines() {
        int sum =0;
        int averageOfDepositsFromAllCashMachines;
        for (int i = 0; i < cashmachine.length; i++) {
            if (this.cashmachine[i] != null) {
                sum+= this.cashmachine[i].getSumOfDeposits();
            }

        } averageOfDepositsFromAllCashMachines= sum / getNumberOfDepositsFromAllCashMachines();

        return averageOfDepositsFromAllCashMachines;

    }

    public int getAverageOfWithdrawalsFromAllCashMachines() {
        int sum =0;
        int averageOfWithdrawalsFromAllCashMachines;
        for (int i = 0; i < cashmachine.length; i++) {
            if (this.cashmachine[i] != null) {
                sum+= this.cashmachine[i].getSumOfWithdrawals();
            }
        }  averageOfWithdrawalsFromAllCashMachines = sum / getNumberOfWithdrawalsFromAllCashMachines();

        return averageOfWithdrawalsFromAllCashMachines;
    }












}



