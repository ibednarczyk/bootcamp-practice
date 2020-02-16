package numberchecker;

import io.cucumber.java8.En;
import org.junit.Assert;

public class IsDivisibleSteps implements En {
    private int number;
    private String answer;

    public IsDivisibleSteps(){
        Given("There is a 3", () -> {
            // Write code here that turns the phrase above into concrete actions
            this.number = 3;
        });


        Given("There is a 5", () -> {
            // Write code here that turns the phrase above into concrete actions
            this.number = 5;
        });


        Given("There is a 8", () -> {
            // Write code here that turns the phrase above into concrete actions
            this.number = 8;
        });


        Given("There is a 10", () -> {
            // Write code here that turns the phrase above into concrete actions
            this.number = 10;
        });


        Given("There is a 15", () -> {
            // Write code here that turns the phrase above into concrete actions
            this.number = 15;;
        });


        Given("There is a 21", () -> {
            // Write code here that turns the phrase above into concrete actions
            this.number = 21;
        });


        Given("There is a 30", () -> {
            // Write code here that turns the phrase above into concrete actions
            this.number = 30;
        });

        Given("There is a 35", () -> {
            // Write code here that turns the phrase above into concrete actions
            this.number = 35;
        });

        Given("There is a 41", () -> {
            // Write code here that turns the phrase above into concrete actions
            this.number = 41;
        });

        Given("There is a 45", () -> {
            // Write code here that turns the phrase above into concrete actions
            this.number = 45;
        });

        Given("There is a 48", () -> {
            // Write code here that turns the phrase above into concrete actions
            this.number = 48;
        });

        When("Check whether number is divisible by three, five, or three and five", () -> {
            // Write code here that turns the phrase above into concrete actions
            NumberChecker checker = new NumberChecker();
            this.answer = checker.checkIfDivisible(this.number);
        });

        Then("I should receive {string}", (String string) -> {
            // Write code here that turns the phrase above into concrete actions
            Assert.assertEquals(string, this.answer);
        });



    }
}
