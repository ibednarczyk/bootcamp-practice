package com.kodilla.bank.homework;

public class Bank {

    public CashMachine[] cashmachine;

    public Bank(){

        this.cashmachine = new CashMachine[4];
    }
    public static void main(String[] args) {

        CashMachine [] cashmachine = new CashMachine[4];
        cashmachine[0] = new CashMachine ();
        cashmachine[1] =new CashMachine ();
        cashmachine[2] =new CashMachine ();
        cashmachine[3] =new CashMachine ();

    }

    public int getBalanceFromAllCashMachines(){
        int sum = 0;
        for(int i = 0; i<cashmachine.length; i++){
            this.cashmachine[i].getBalance();
        }

        return sum;
    }
    public int getNumberOfDepositsFromAllCashMachines(){
        int numberOfDepositsFromAllCashMachines = 0;
        for(int i = 0; i<cashmachine.length; i++){
            this.cashmachine[i].getNumbersOfDeposits();
        }

        return numberOfDepositsFromAllCashMachines;
    }
    public int getNumberOfWithdrawalsFromAllCashMachines(){
        int numberOfWithdrawalsFromAllCashMachines = 0;
        for(int i = 0; i<cashmachine.length; i++){
            this.cashmachine[i].getNumbersOfWithdrawals();
        }

        return numberOfWithdrawalsFromAllCashMachines;
    }
    public int getAverageOfDepositsFromAllCashMachines(){
        int averageOfDepositsFromAllCashMachines = 0;
        for(int i = 0; i<cashmachine.length; i++){
            this.cashmachine[i].getAverageOfDeposits();
        }

        return averageOfDepositsFromAllCashMachines;
    }
    public int getAverageOfWithdrawalsFromAllCashMachines(){
        int averageOfWithdrawalsFromAllCashMachines= 0;
        for(int i = 0; i<cashmachine.length; i++){
            this.cashmachine[i].getAverageOfWithdrawals();
        }

        return averageOfWithdrawalsFromAllCashMachines;
    }







}
