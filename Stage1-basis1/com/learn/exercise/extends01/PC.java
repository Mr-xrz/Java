package com.learn.exercise.extends01;

public class PC extends Computer {
    private String brand; //品牌

    public PC(String cpu, String memory, String disk, String brand) {
        super(cpu, memory, disk);//此处就是直接调用父类的构造器
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void printInfo01() {
        System.out.println("PC的信息如下：");
        System.out.println(getDetails() + " 品牌：" + brand);
    }
}

