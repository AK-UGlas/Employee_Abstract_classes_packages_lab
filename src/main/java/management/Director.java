package management;

import management.Manager;

public class Director extends Manager {

    private double budget;

    public Director(String name, double salary, String ni, String deptName, double budget){
        super(name, salary, ni, deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return this.budget;
    }

    @Override
    public double payBonus() {
        return super.getSalary() * 0.02;
    }
}
