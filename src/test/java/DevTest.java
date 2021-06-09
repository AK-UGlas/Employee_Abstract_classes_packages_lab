import staff.techStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DevTest {

    private Developer developer;

    @Before
    public void before() {
        developer = new Developer("Allen", 60000, "JM281711C");
    }

    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(5000);
        assertEquals(65000, developer.getSalary(), 0.0);
    }

    @Test
    public void canGiveBonus() {
        assertEquals(600, developer.payBonus(), 0.0);
    }

}
