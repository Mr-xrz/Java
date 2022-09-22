package com.learn.exercise.PolyArray01;

public class Test_PolyArray01 {
    public static void main(String[] args) {

        Person[] arr = new Person[5]; //创建一个5个元素的数组

        arr[0] = new Person("name", 0);
        arr[1] = new Student("jack", 18, 92.5);
        arr[2] = new Student("tom", 17, 60);
        arr[3] = new Teacher("king", 35, 10000);
        arr[4] = new Teacher("lucy", 28, 12000);
        //多态数组里面每一个元素，都是一个新的对象

        //arr[i]的编译类型是Person
        //但运行类型，在遍历多态数组的时候，会对应每次的运行类型，由JVM自行判断
        //因此，根据动态绑定机制，每次调用的say方法都是各自运行机制对应的say方法
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].say());//遍历多态数组，调用say方法

            //调用子类特有的方法——teach()、study()
            // instanceof 可以判断一个对象的 *运行类型* 是不是XXX类型，是就返回"true"，不是则返回"false"
            if (arr[i] instanceof Student) { //判断此时的arr[i]这个对象的 *运行类型* 是不是Student
                Student student = (Student) arr[i]; //*向下转型*
                student.study();   //这两行可以简写为：(Student)arr[i].study();
            } else if (arr[i] instanceof Teacher) { //判断此时的arr[i]这个对象的 *运行类型* 是不是Teacher
                Teacher teacher = (Teacher) arr[i]; //*向下转型*
                teacher.teach();   //这两行可以简写为：(Teacher)arr[i].teach();
            }else {
                System.out.println("...类型有误，无法调用子类特有方法...");
                //因为arr[0]的行为类型是Person，所以这里一定会输出这句话
                System.out.println("===============================");
            }
        }
    }
}
