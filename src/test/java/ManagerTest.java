import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    private Manager manager;

    @Before
    public void before() {
        manager = new Manager("Niall", 49000, "JM281711C", "QA");
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(-1000);
        assertEquals(49000, manager.getSalary(), 0.0);
    }

    @Test
    public void canGiveBonus() {
        assertEquals(490, manager.payBonus(), 0.0);
    }

    @Test
    public void canChangeName() {
        manager.setName("Colin");
        assertEquals("Colin", manager.getName());
    }

    @Test
    public void notEmptyName() {
        manager.setName("");
        assertEquals("Niall", manager.getName());
    }

    @Test
    public void notNullName() {
        manager.setName(null);
        assertEquals("Niall", manager.getName());
    }
}