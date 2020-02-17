package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class WalletSteps implements En {

     private  Wallet wallet = new Wallet();
     private CashSlot cashSlot = new CashSlot();
     private Teller teller = new Teller(cashSlot);

    public WalletSteps(){

        Given("I have deposited $200 in my wallet", () -> {
            // Write code here that turns the phrase above into concrete actions
            wallet.deposit(200);
            Assert.assertEquals("Incorrect wallet balance", 200, wallet.getBalance());
        });

        When("I request $30", () -> {
            // Write code here that turns the phrase above into concrete actions
            teller.withdraw(wallet, 30);
        });

        Then("$30 should be dispensed", () -> {
            // Write code here that turns the phrase above into concrete actions
            Assert.assertEquals(30, cashSlot.getContents());
        });

        When("I request $200", () -> {
            // Write code here that turns the phrase above into concrete actions
            teller.withdraw(wallet, 200);
        });

        Then("$200 should be dispensed", () -> {
            // Write code here that turns the phrase above into concrete actions
            Assert.assertEquals(200, cashSlot.getContents());
        });


        When("I request $250", () -> {
            // Write code here that turns the phrase above into concrete actions
            teller.withdraw(wallet, 250);
        });

        When("I request $0", () -> {
            // Write code here that turns the phrase above into concrete actions
            teller.withdraw(wallet, 0);
        });

        Given("I have deposited $0 in my wallet", () -> {
            // Write code here that turns the phrase above into concrete actions
            wallet.deposit(0);
        });

        When("I request $100", () -> {
            // Write code here that turns the phrase above into concrete actions
            teller.withdraw(wallet, 100);
        });

        Then("Any money should be dispensed", () -> {
            // Write code here that turns the phrase above into concrete actions
            Assert.assertEquals(0, cashSlot.getContents());
        });

    }
}
