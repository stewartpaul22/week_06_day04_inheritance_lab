import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    private Developer developer;

    @Before
    public void before() {
        developer = new Developer("Angela", "BC234567D", 30000.00);
    }

    @Test
    public void hasName() {
        assertEquals("Angela", developer.getName());
    }

    @Test
    public void hasNiNumber() {
        assertEquals("BC234567D", developer.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(30000.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        assertEquals(31350, developer.raiseSalary(4.50), 0.01);
    }

    @Test
    public void canGetBonusAmount() {
        assertEquals(300, developer.payBonus(), 0.01);
    }
}
