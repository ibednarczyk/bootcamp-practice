package com.kodilla.bank;

import com.kodilla.bank.homework.Bank;
import com.kodilla.bank.homework.CashMachine;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    Bank bank = new Bank();

    @Test
    public void shouldGetBalanceFromAllCashMachines(){
        CashMachine bankomat1 = new CashMachine();
        bankomat1.addTransaction(500);
        bankomat1.addTransaction(4000);
        bankomat1.addTransaction(-500);
        CashMachine bankomat2 = new CashMachine();
        bankomat2.addTransaction(50);
        bankomat2.addTransaction(6000);
        CashMachine bankomat3 = new CashMachine();
        bankomat3.addTransaction(300);
        bankomat3.addTransaction(100);
        bankomat3.addTransaction(-350);
        CashMachine bankomat4 = new CashMachine();
        bankomat4.addTransaction(-150);
        bankomat4.addTransaction(2500);
        bank.addCashmachine(bankomat1);
        bank.addCashmachine(bankomat2);
        bank.addCashmachine(bankomat3);
        bank.addCashmachine(bankomat4);
        int balance = bank.getBalanceFromAllCashMachines();
        assertEquals(12450, balance);
    }
    @Test
    public void shouldGetNumberOfDepositsFromAllCashMachines(){
        CashMachine bankomat= new CashMachine();
        bankomat.addDeposit(-500);
        bankomat.addDeposit(-500);
        bankomat.addDeposit(500);
        bank.addCashmachine(bankomat);
        int numberOfDeposits = bank.getNumberOfDepositsFromAllCashMachines();
        assertEquals(1, numberOfDeposits);

    }
    @Test
    public void shouldGetNumberOfWithdrawalsFromAllCashMachines(){
        CashMachine bankomat= new CashMachine();
        bankomat.addWithdrawal(-500);
        bankomat.addWithdrawal(-500);
        bankomat.addWithdrawal(500);
        bank.addCashmachine(bankomat);
        int numberOfWithdrawals = bank.getNumberOfWithdrawalsFromAllCashMachines();
        assertEquals(2, numberOfWithdrawals);

    }
    @Test
    public void shouldGetAverageOfDepositsFromAllCashMachines(){
        CashMachine bankomat = new CashMachine();
        bankomat.addDeposit(600);
        bankomat.addDeposit(-200);
        bankomat.addDeposit(400);
        bank.addCashmachine(bankomat);
        int averageOfDeposits = bank.getAverageOfDepositsFromAllCashMachines();
        assertEquals(500, averageOfDeposits, 0.01);
    }

    @Test
    public void shouldGetAverageOfWithdrawalsFromAllCashMachines(){
        CashMachine bankomat = new CashMachine();
        bankomat.addWithdrawal(-500);
        bankomat.addWithdrawal(-300);
        bankomat.addWithdrawal(500);
        bankomat.addWithdrawal(500);
        bank.addCashmachine(bankomat);
        int averageOfWithdrawals = bank.getAverageOfWithdrawalsFromAllCashMachines();
        assertEquals(-400, averageOfWithdrawals, 0.01);

    }

}
