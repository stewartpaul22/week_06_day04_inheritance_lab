import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    private Employee employee;

    @Before
    public void before() {
        employee = new Employee("Bob", "LN655443T", 30000.00);
    }

    @Test
    public void hasName() {
        assertEquals("Bob", employee.getName());
    }

    @Test
    public void canChangeEmployeeName() {
        employee.setName("Linda");
        assertEquals("Linda", employee.getName());
    }

    @Test
    public void cantChangeNameIfNull() {
        employee.setName(null);
        assertEquals("Bob", employee.getName());
    }

    @Test
    public void hasNiNumber() {
        assertEquals("LN655443T", employee.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(30000.00, employee.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        assertEquals(31500.00, employee.raiseSalary(5.00), 0.01);
    }

    @Test
    public void canGetBonusAmount() {
        assertEquals(300.00, employee.payBonus(), 0.01);
    }

}
