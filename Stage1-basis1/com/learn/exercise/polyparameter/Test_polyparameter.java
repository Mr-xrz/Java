package com.learn.exercise.polyparameter;

public class Test_polyparameter {
    public static void main(String[] args) {

        Woker jack = new Woker("jack", 7000);
        Woker tom = new Woker("tom", 8500);
        Manager lucy = new Manager("lucy", 15000, 40000);
        Manager cendy = new Manager("cendy", 13000, 35000);

        Test_polyparameter parameter = new Test_polyparameter();
        parameter.getEmpAnnual(lucy);//改变对象名(lucy)，方法中就会接收相应不同的对象
        //用这个parameter对象去调用方法，传入刚刚新创建的对象(Work类和Manager类)
        parameter.testwork(lucy); //改变对象名(lucy)，方法中就会接收相应不同的对象
    }

    public void getEmpAnnual(Employee a) {
        //这里用父类的引用(Employee X)来接收对象，这样传入不同的对象，根据动态绑定机制，就可以匹配调用不同的方法
        System.out.println(a.getAnnual());
        System.out.println("===================");
    }

    public void testwork(Employee a) {
        if (a instanceof Woker) {
            ((Woker) a).work(); //向下转型
        } else if (a instanceof Manager) {
            ((Manager) a).manage(); //向下转型
        } else
            System.out.println("...这个人既不是普通员工，也不是经理...");
    }
}