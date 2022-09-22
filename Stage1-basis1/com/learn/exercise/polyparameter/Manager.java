package com.learn.exercise.polyparameter;

public class Manager extends Employee {
    private int bonus;

    @Override
    public String getAnnual() {
        return super.getAnnual() + "奖金：" + bonus;
    }

    public void manage() {
        System.out.println("经理" + getName() + "正在管理公司...");
    }

    public Manager(String name, int salary, int bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
