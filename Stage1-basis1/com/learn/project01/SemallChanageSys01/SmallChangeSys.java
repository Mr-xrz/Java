package com.learn.project01.SemallChanageSys01;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys {
    public static void main(String[] args) {

        boolean loop = true;
        int num;
        Scanner scanner = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH.mm");
        Consume consume = new Consume();
        Income income = new Income();

        do {
            System.out.println("==================零钱通菜单==================");
            System.out.println("\t\t\t\t 1 零钱通明细");
            System.out.println("\t\t\t\t 2 充值金额");
            System.out.println("\t\t\t\t 3 消费");
            System.out.println("\t\t\t\t 4 退    出");
            System.out.print("请输入(1-4):");
            num = scanner.nextInt();

            if (num < 5 && num > 0) {
                switch (num) {
                    case 1:
                        System.out.println("==================零钱通明细==================");
                        Date date = new Date();
                        System.out.println("余额：" + consume.getBalance() + '\t' + sdf.format(date));
                        break;

                    case 2:
                        System.out.println("==================充值金额==================");
                        income.inc();
                        break;

                    case 3:
                        System.out.println("================== 消 费 ==================");
                        consume.consume();
                        break;

                    case 4:
                        System.out.println("==============确认退出系统？y/n==============");
                        do {
                            String key = scanner.next();
                            if (key.equals("y") || key.equals("n")) {
                                if (key.equals("y")) {
                                    System.out.println("==================退出系统==================");
                                    loop = false;
                                }
                            }
                            System.out.println("请输入正确的 y/n ...");
                        } while (loop);
                        break;
                }
            } else System.out.println("请输入正确选项(1-4)..");
        } while (loop);
        System.out.println("程序已退出...");
    }
}
