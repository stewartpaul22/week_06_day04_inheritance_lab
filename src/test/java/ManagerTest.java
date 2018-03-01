import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    private Manager manager;

    @Before
    public void before() {
        manager = new Manager("Donna", "AB123456C", 40000.00, "Testing");
    }

    @Test
    public void hasName() {
        assertEquals("Donna", manager.getName());
    }

    @Test
    public void hasNiNumber() {
        assertEquals("AB123456C", manager.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(40000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void hasDepartment() {
        assertEquals("Testing", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        assertEquals(41600.00, manager.raiseSalary(4.00), 0.01);
    }

    @Test
    public void canGetBonusAmount() {
        assertEquals(400, manager.payBonus(), 0.01);
    }

}
