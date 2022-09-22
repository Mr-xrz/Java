package com.learn.exercise.override01;

public class Student extends Person {
    public String id;
    private double score;

    public Student(String s) {
    }

    public Student(String name, int age, String id, double score) {
        super(name, age); //这里会调用父类的构造器
        this.id = id;
        this.score = score;
    }

    public String say() { //代码复用
        //super明确了这里调用的是父类的say方法
        //如果这里没有super，根据就近原则，那就调用的是本类（Student）的say方法
        return super.say() + " 学生id：" + id + " 成绩:" + score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
