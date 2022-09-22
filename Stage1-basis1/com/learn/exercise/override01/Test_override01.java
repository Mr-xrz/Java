package com.learn.exercise.override01;

public class Test_override01 {
    public static void main(String[] args) {

        Person per = new Person("大明", 20);
        Student stu = new Student("小明", 18, "123", 80.0);
        System.out.println(stu.say());//此处的say方法是父类（Person）的say方法
        System.out.println(per.say());//此处的say方法是子类（Student）的say方法
        //say方法进行了 方法的重写 ，遵循就近原则，要清楚每个对象用的say是谁的方法
        //对象per就是Person的一个对象，所以系统会先在Person中找say方法，找不到就上一级，直到Object
        //对象stu是Student的一个对象，系统会先在Student中寻找say方法，找不到再到Person中找......
    }
}

