import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeapYearTestSuite {

    @Test
    public void shouldCheckWhetherLeapYear(){
        LeapYear year = new LeapYear();
        Assertions.assertTrue(year.isLeapYear(2020));
        Assertions.assertFalse(year.isLeapYear(2100));
    }
}
