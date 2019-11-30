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
        CashMachine bankomat1= new CashMachine();
        bankomat1.addDeposit(-500);
        bankomat1.addDeposit(-500);
        bankomat1.addDeposit(500);
        bankomat1.addDeposit(100);
        CashMachine bankomat2 = new CashMachine();
        bankomat2.addDeposit(-3000);
        bankomat2.addDeposit(3000);
        CashMachine bankomat3 = new CashMachine();
        bankomat3.addDeposit(2250);
        bankomat3.addDeposit(400);
        bank.addCashmachine(bankomat1);
        bank.addCashmachine(bankomat2);
        bank.addCashmachine(bankomat3);
        int numberOfDeposits = bank.getNumberOfDepositsFromAllCashMachines();
        assertEquals(5, numberOfDeposits);

    }
    @Test
    public void shouldGetNumberOfWithdrawalsFromAllCashMachines(){
        CashMachine bankomat1= new CashMachine();
        bankomat1.addWithdrawal(-500);
        bankomat1.addWithdrawal(-500);
        bankomat1.addWithdrawal(500);
        CashMachine bankomat2 = new CashMachine();
        bankomat2.addWithdrawal(-600);
        bankomat2.addWithdrawal(100);
        CashMachine bankomat3 = new CashMachine();
        bankomat3.addWithdrawal(-150);
        bankomat3.addWithdrawal(1000);
        bank.addCashmachine(bankomat1);
        bank.addCashmachine(bankomat2);
        bank.addCashmachine(bankomat3);
        int numberOfWithdrawals = bank.getNumberOfWithdrawalsFromAllCashMachines();
        assertEquals(4, numberOfWithdrawals);

    }
    @Test
    public void shouldGetAverageOfDepositsFromAllCashMachines(){
        CashMachine bankomat1 = new CashMachine();
        bankomat1.addDeposit(600);
        bankomat1.addDeposit(-200);
        bankomat1.addDeposit(400);
        CashMachine bankomat2 = new CashMachine();
        bankomat2.addDeposit(-3000);
        bankomat2.addDeposit(3000);
        CashMachine bankomat3 = new CashMachine();
        bankomat3.addDeposit(2250);
        bankomat3.addDeposit(400);
        bank.addCashmachine(bankomat1);
        bank.addCashmachine(bankomat2);
        bank.addCashmachine(bankomat3);
        int averageOfDeposits = bank.getAverageOfDepositsFromAllCashMachines();
        assertEquals(1330, averageOfDeposits, 0.01);
    }

    @Test
    public void shouldGetAverageOfWithdrawalsFromAllCashMachines(){
        CashMachine bankomat1 = new CashMachine();
        bankomat1.addWithdrawal(-500);
        bankomat1.addWithdrawal(-300);
        bankomat1.addWithdrawal(500);
        bankomat1.addWithdrawal(500);
        CashMachine bankomat2 = new CashMachine();
        bankomat2.addWithdrawal(-600);
        bankomat2.addWithdrawal(100);
        CashMachine bankomat3 = new CashMachine();
        bankomat3.addWithdrawal(-150);
        bankomat3.addWithdrawal(1000);
        bank.addCashmachine(bankomat1);
        bank.addCashmachine(bankomat2);
        bank.addCashmachine(bankomat3);
        int averageOfWithdrawals = bank.getAverageOfWithdrawalsFromAllCashMachines();
        assertEquals(-387.5, averageOfWithdrawals, 0.5);

    }

}
