import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    private Director director;

    @Before
    public void before() {
        director = new Director("Vanessa", "DE456789F", 64000.00, "Finance", 250000.00);
    }

    @Test
    public void hasName() {
        assertEquals("Vanessa", director.getName());
    }

    @Test
    public void hasNiNumber() {
        assertEquals("DE456789F", director.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(64000.00, director.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        assertEquals(68800.00, director.raiseSalary(7.5), 0.01);
    }

    @Test
    public void canGetBonusAmount() {
        assertEquals(640, director.payBonus(), 0.01);
    }

    @Test
    public void hasBudget() {
        assertEquals(250000, director.getBudget(), 0.01);
    }
}
