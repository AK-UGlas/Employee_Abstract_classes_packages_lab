import staff.techStaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    private DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("Spencer", 40000, "JM281711C");
    }

    @Test
    public void canRaiseSalary() {
        databaseAdmin.raiseSalary(5000);
        assertEquals(45000, databaseAdmin.getSalary(), 0.0);
    }

    @Test
    public void canGiveBonus() {
        assertEquals(400, databaseAdmin.payBonus(), 0.0);
    }

}
