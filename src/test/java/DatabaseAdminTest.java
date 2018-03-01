import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    private DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("Dave", "CD345678E", 33000.00);
    }

    @Test
    public void hasName() {
        assertEquals("Dave", databaseAdmin.getName());
    }

    @Test
    public void hasNiNumber() {
        assertEquals("CD345678E", databaseAdmin.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(33000.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        assertEquals(35151.60, databaseAdmin.raiseSalary(6.52), 0.01);
    }

    @Test
    public void canGetBonusAmount() {
        assertEquals(330, databaseAdmin.payBonus(), 0.01);
    }
}
