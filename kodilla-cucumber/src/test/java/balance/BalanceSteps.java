package balance;

import io.cucumber.java8.En;
import org.junit.Assert;

public class BalanceSteps implements En {

    private Account account = new Account();
    private CashMachineSlot slot = new CashMachineSlot();
    private CashMachine cashMachine = new CashMachine(slot);
    private String answer;

    public BalanceSteps(){
        Given("my wallet has been credited with $100", () -> {
            // Write code here that turns the phrase above into concrete actions
            account.deposit(100);
        });

        When("I withdraw $200", () -> {
            // Write code here that turns the phrase above into concrete actions
            this.answer = cashMachine.checkOperation(account, 200);
            cashMachine.withdraw(account, 200);
        });

        Then("nothing should be dispensed", () -> {
            // Write code here that turns the phrase above into concrete actions
            Assert.assertEquals(0, slot.getContents());
        });

        Then("I should be told that I have insufficient funds in my account", () -> {
            // Write code here that turns the phrase above into concrete actions
            Assert.assertEquals("You have insufficient funds in your account", answer);

        });

        Given("my account has been credited with $500", () -> {
            // Write code here that turns the phrase above into concrete actions
            account.deposit(500);
        });

        When("I check my balance", () -> {
            // Write code here that turns the phrase above into concrete actions
            this.answer = cashMachine.displayBalance(account);

        });

        Then("I should see that my balance is $500", () -> {
            // Write code here that turns the phrase above into concrete actions
            Assert.assertEquals("Your account's balance: $500", answer);

        });

        Given("my wallet has been credited with $300", () -> {
            // Write code here that turns the phrase above into concrete actions
            account.deposit(300);
        });

        When("I am trying to withdraw $0", () -> {
            // Write code here that turns the phrase above into concrete actions
            this.answer = cashMachine.checkOperation(account, 0);
            cashMachine.withdraw(account, 0);

        });

        Then("I should be told that I have to enter the correct amount", () -> {
            // Write code here that turns the phrase above into concrete actions
            Assert.assertEquals("Please, enter correct amount", answer);

        });
        Given("my wallet has been credited with $1000", () -> {
            // Write code here that turns the phrase above into concrete actions
            account.deposit(1000);
        });

        When("I withdraw $700", () -> {
            // Write code here that turns the phrase above into concrete actions
            this.answer = cashMachine.checkOperation(account, 700);
            cashMachine.withdraw(account, 700);
        });

        Then("$700 should be dispensed", () -> {
            // Write code here that turns the phrase above into concrete actions
            Assert.assertEquals(700, slot.getContents());
        });

        Then("My account's balance should be $300", () -> {
            // Write code here that turns the phrase above into concrete actions
            Assert.assertEquals(300, account.getBalance());
        });
        Then("After withdrawal I should be able to make another operation", () -> {
            // Write code here that turns the phrase above into concrete actions
            Assert.assertEquals("Successful withdrawal. Please, choose next operation", answer);
        });

    }
}
