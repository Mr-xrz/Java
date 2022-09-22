package com.learn.exercise.equals_overwirte;


public class Texs {
    public static void main(String[] args) {

        Person jack1 = new Person("jack", 18, '男');
        Person jack2 = new Person("jack", 18, '男');
        Person jack3 = new Person("jack", 20, '男');

        System.out.println(jack1 == jack2); //false
        //当两者都是引用类型时， == 是直接判断两者地址是否相同(即 是否为同一对象)
        System.out.println(jack1.equals(jack2)); //true
        /*注意：如果不对Object类中的equals方法进行重写
          直接用equals方法，调用的就会是顶级父类Object类中的(即 默认的)equals方法
          默认的equals方法就是 判断地址是否相同    (这里输出就会是 false)
         */
        System.out.println(jack1.equals(jack3)); //false
    }
}

class Person {
    private String name; //名字
    private int age; //年龄

    private char gender; //性别 输入的单个字符要用 ‘单引号’ 括起来


    //=============================对equals方法的重写===================================

    //这里对Object类(顶级父类)中的equals方法进行 重写 ，以便可以用来对新定义的Person类中对象进行比较
    public boolean equals(Object obj) {
        if (this == obj) {
            //先确定两者是否为同一个对象(用 == 来进行判断)，如果是，则可直接判断两者相等
            return true;
        } else if (obj instanceof Person) {
            //先比较运行类型是否为Person类， 不是则直接判断不同
            Person p = (Person) obj; //向下转型 目的是得到obj的各个属性
            return this.name.equals(p.name) && this.age == (p.age) && this.gender == p.gender;
            //此时用基本数据类型来比较各个属性的值是否相同  相同返回true 不同返回false
            //注意此处的equals方法
            //两者比较的是.name(定义属性时确定了是String类)，所以这里其实是用的String类中重写后的equals方法
        }
        return false;
    }
    //=============================对equals方法的重写===================================


    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
