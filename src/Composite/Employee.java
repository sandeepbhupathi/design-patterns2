package Composite;

import java.util.List;

public class Employee {
    private String name;
    private String dept;
    private int empId;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", empId=" + empId +
                ", subodinates=" + subodinates +
                '}';
    }

    public Employee(String name, String dept, int empId, List<Employee> subodinates) {
        this.name = name;
        this.dept = dept;
        this.empId = empId;
        this.subodinates = subodinates;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public int getEmpId() {
        return empId;
    }

    public List<Employee> getSubodinates() {
        return subodinates;
    }


    private List<Employee> subodinates;

}
