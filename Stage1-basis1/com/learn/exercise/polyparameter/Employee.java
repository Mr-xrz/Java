package com.learn.exercise.polyparameter;

public class Employee {
    private String name;
    private int salary;

    public String getAnnual() {
        int annual = salary * 12;
        return name + ":  " + "年薪：" + annual + "  ";
    }

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
