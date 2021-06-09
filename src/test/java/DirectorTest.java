import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    private Director director;

    @Before
    public void before() {
        director = new Director("Niall", 49000, "JM281711C", "QA", 200000);
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(5000);
        assertEquals(54000, director.getSalary(), 0.0);
    }

    @Test
    public void canGiveTwoPercentBonus() {
        assertEquals(980, director.payBonus(), 0.0);
    }

    @Test
    public void hasBudget() {
        assertEquals(200000, director.getBudget(), 0.0);
    }

}
