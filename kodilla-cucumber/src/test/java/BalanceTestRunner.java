import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/balance/prevent_users_from_going_overdrawn.feature",
                "src/test/resources/balance/display_balance.feature",
                "src/test/resources/balance/checking_correctness_of_entered_amount.feature",
                "src/test/resources/balance/successful_withdrawal.feature"})
public class BalanceTestRunner {

}
