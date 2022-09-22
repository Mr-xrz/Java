package com.learn.project01.SemallChanageSys01;


import java.text.SimpleDateFormat;
import java.util.Date;

public class Detail {
    private static double balance = 500.0;
    Date date = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH.mm");

    public Detail() {
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
