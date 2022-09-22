package com.learn.project01.SemallChanageSys01;

import java.util.Date;
import java.util.Scanner;

public class Consume extends Income {

    private double consume;

    public void consume() {
        boolean loop = true;

        Scanner mycons = new Scanner(System.in);

        System.out.println("请输入收款方");
        String name = mycons.next();

        System.out.println("请输入消费金额：");

        do {
            consume = mycons.nextDouble();
            if (consume > 0 && consume <= getBalance()) {
                loop = false;
            } else System.out.println("请输入正确金额,你的余额还剩" + getBalance());
        } while (loop);

        setBalance(getBalance() - consume);
        Date date = new Date();
        System.out.println(name + "\t消费：-" + consume + '\t' + sdf.format(date) + "\t余额：" + getBalance());
    }

    public Consume() {
        this.consume = consume;
    }

    public Consume(double consume) {
        this.consume = consume;
    }

    public double getConsume() {
        return consume;
    }

    public void setConsume(double consume) {
        this.consume = consume;
    }
}
