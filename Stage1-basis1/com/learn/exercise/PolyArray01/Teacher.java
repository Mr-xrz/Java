package com.learn.exercise.PolyArray01;

public class Teacher extends Person {
    private int salary;

    public Teacher(String name, int age, int salary) {
        super(name, age);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String say() {
        return super.say() + "  " + "薪水：" + salary;
    }

    public void teach() {
        System.out.println("老师" + getName() + "正在教学...");
        System.out.println("===============================");
    }
}
