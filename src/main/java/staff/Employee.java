package staff;

import java.util.Objects;

public abstract class Employee {

    private String name;
    private double salary;
    private String ni;

    public Employee(String name, double salary, String ni) {
        this.name = name;
        this.salary = salary;
        this.ni = ni;
    }

    public void raiseSalary(double payRise) {
        if (payRise > 0) {
            this.salary += payRise;
        }
    }

    public double payBonus() {
        return salary * 0.01;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getNi() {
        return ni;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }
}
