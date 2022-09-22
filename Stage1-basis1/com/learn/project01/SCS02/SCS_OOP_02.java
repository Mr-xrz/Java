package com.learn.project01.SCS02;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SCS_OOP_02 {
    double balance; //余额
    double pay;//消费金额
    double money;//充值金额

    String details = ""; //明细


    //获取时间
    Date date = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH.mm");

    boolean loop = true;

    Scanner scanner = new Scanner(System.in);
    int num;
    String choice;

    public void Menu() { //菜单功能
        do {
            System.out.println("==================零钱通菜单==================");
            System.out.println("\t\t\t\t 1 零钱通明细");
            System.out.println("\t\t\t\t 2 充值金额");
            System.out.println("\t\t\t\t 3 消费");
            System.out.println("\t\t\t\t 4 退    出");
            System.out.print("请输入(1-4):");
            num = scanner.nextInt(); //输入(1-4)

            switch (num) { //这里用switch方法选择1-4对应的功能
                case 1: //进入零钱通明细功能
                    this.Details(); //调用Detail方法，获取零钱通的明细
                    break;

                case 2: //进入余额充值功能
                    this.Income(); //调用Income方法，进入充值功能
                    break;

                case 3: //进入消费功能
                    this.Pay(); //调用Pay方法，进入消费功能
                    break;

                case 4: //退出系统
                    this.Quit(); //调用Quit方法，进入退出功能
                    break;

                default: //输入的不是1-4，则提示
                    System.out.println("请输入正确的选项(1-4)"); //这里对应选择不正确的情况，用 default
                    break;
            }
        } while (loop); //loop可以控制循环的结束
    }

    public void Details() { //明细功能
        System.out.println("==================零钱通明细==================");
        System.out.println(details); //输出余额明细
    }

    public void Income() { //充值功能
        System.out.println("==================充值金额==================");
        boolean key1 = true;

        System.out.println("请输入充值余额：");
        money = scanner.nextDouble();

        do { //校验输入的数据
            if (money > 0) {
                key1 = false;
            } else System.out.println("请输入正确金额...");
        } while (key1);

        balance += money; //将充值金额加进余额中
        Date date = new Date(); //重新获取执行到这里的时间 => 实时时间
        details += "\n充值：\t+" + money + "\t" + sdf.format(date) + "\t余额:" + balance;
        //将充值完的信息赋给details，以便Details方法输出
    }

    public void Pay() { //消费功能
        System.out.println("================== 消 费 ==================");
        boolean key2 = true;

        System.out.println("请输入收款方");
        String name = scanner.next();

        System.out.println("请输入消费金额：");
        do { //校验输入的数据
            pay = scanner.nextDouble();
            if (pay > 0 && pay <= balance) {
                key2 = false;
            } else System.out.println("请输入正确金额,你的余额还剩:" + balance);
        } while (key2);

        balance -= pay;
        Date date = new Date(); //重新获取执行到这里的时间 => 实时时间
        details += "\n" + name + ": \t-" + pay + "\t" + sdf.format(date) + "\t余额：" + balance;
        //将消费完的信息赋给details，以便Details方法输出
    }

    public void Quit() { //退出功能
        while (true) { //这里直接进入一个while循环，用来校验输入
            System.out.println("==============确认退出系统？y/n==============");
            choice = scanner.next();
            if (choice.equals("y") || choice.equals("n")) {
                break; //这里用while循环，判断是否输入的时y/n，如果是，就break退出循环，否则就一直循环
            }
            System.out.println("请输入正确的选择y/n...");
        }
        if (choice.equals("y")) { //当输入的时y时，就退出系统
            loop = false; //当loop变成false时，菜单功能的while循环将退出
        }
    }


}


