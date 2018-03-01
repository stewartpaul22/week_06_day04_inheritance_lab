import org.junit.Before;

public class EmplyeeTest {

    private Employee employee;

    @Before
    public void before() {
        employee = new Employee("Bob", "LN655443T", 30000.00);
    }

}
