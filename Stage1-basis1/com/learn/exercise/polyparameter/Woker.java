package com.learn.exercise.polyparameter;

public class Woker extends Employee {

    @Override
    public String getAnnual() {
        return super.getAnnual();
    }

    public void work() {
        System.out.println("员工" + getName() + "正在工作...");
    }

    public Woker(String name, int salary) {
        super(name, salary);
    }
}
