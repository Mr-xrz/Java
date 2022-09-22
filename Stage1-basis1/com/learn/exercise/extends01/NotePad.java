package com.learn.exercise.extends01;

public class NotePad extends Computer {
    private String color; //颜色

    public NotePad(String cpu, String memory, String disk, String color) {
        super(cpu, memory, disk);//此处就是直接调用父类的构造器
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void printInfo02() {
        System.out.println("NotePad的信息如下：");
        System.out.println(getDetails() + " 颜色：" + color);
    }
}
