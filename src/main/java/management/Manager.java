package management;

import staff.Employee;

public class Manager extends Employee {

    private String deptName;

    public Manager(String name, double salary, String ni, String deptName) {
        super(name, salary, ni);
        this.deptName = deptName;
    }


    public String getDeptName() {
        return this.deptName;
    }

}

