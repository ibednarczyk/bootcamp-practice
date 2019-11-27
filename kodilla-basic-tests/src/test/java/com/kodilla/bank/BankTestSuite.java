package com.kodilla.bank;

import com.kodilla.bank.homework.Bank;
import com.kodilla.bank.homework.CashMachine;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    public CashMachine[] cashmachine;

    Bank bank = new Bank();

    @Test
    public void shouldGetBalanceFromAllCashMachines(){
        Bank bank = new Bank ();
        int transactions[] = new int[10];
        int balance = bank.getBalanceFromAllCashMachines();
        assertEquals(15050, balance);

    }
    @Test
    public void shouldGetNumberOfDepositsFromAllCashMachines(){
        Bank bank = new Bank();
        int transactions[] = new int[10];
        int numberOfDeposits = bank.getNumberOfDepositsFromAllCashMachines();
        assertEquals(5, numberOfDeposits);

    }
    @Test
    public void shouldGetNumberOfWithdrawalsFromAllCashMachines(){
        Bank bank = new Bank();
        int transactions[] = new int[10];
        int numberOfWithdrawals = bank.getNumberOfWithdrawalsFromAllCashMachines();
        assertEquals(5, numberOfWithdrawals);

    }
    @Test
    public void shouldGetAverageOfDepositsFromAllCashMachines(){
        Bank bank = new Bank();
        int transactions[] = new int[10];
        int averageOfDeposits = bank.getNumberOfWithdrawalsFromAllCashMachines();
        assertEquals(5870, averageOfDeposits, 0.01);

    }

    @Test
    public void shouldGetAverageOfWithdrawalsFromAllCashMachines(){
        Bank bank = new Bank();
        int transactions[] = new int[10];
        int averageOfWithdrawals = bank.getNumberOfWithdrawalsFromAllCashMachines();
        assertEquals(2860, averageOfWithdrawals, 0.01);

    }


}
