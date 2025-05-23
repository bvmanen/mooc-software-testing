package tudelft.leapyear;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeapYearTest {
    
        private LeapYear ly;

    @BeforeEach
    public void initialize() {
        ly = new LeapYear();
    }
    
    @Test
    public void leapYearsThatAreNonCenturialYears() {
        Assertions.assertTrue(ly.isLeapYear(2016));
    }

    @Test
    public void leapCenturialYears() {
        Assertions.assertTrue(ly.isLeapYear(2000));
    }

    @Test
    public void nonLeapCenturialYears() {
        Assertions.assertFalse(ly.isLeapYear(1500));
    }

    @Test
    public void nonLeapYears() {
        Assertions.assertFalse(ly.isLeapYear(2017));
    }
}
