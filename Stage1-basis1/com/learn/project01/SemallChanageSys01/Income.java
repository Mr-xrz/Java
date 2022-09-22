package com.learn.project01.SemallChanageSys01;

import java.util.Date;
import java.util.Scanner;

public class Income extends Detail {

    private double money;

    public void inc() {
        boolean loop = true;

        System.out.println("请输入充值余额：");
        Scanner myinc = new Scanner(System.in);
        money = myinc.nextDouble();

        do {
            if (money > 0) {
                loop = false;
            } else System.out.println("请输入正确金额...");
        } while (loop);

        setBalance(getBalance() + money);
        Date date = new Date();
        System.out.println("充值：+" + money + '\t' + sdf.format(date) + "\t余额:" + getBalance());
    }

    public Income(double money) {
        this.money = money;
    }

    public Income() {
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}

