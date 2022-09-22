package com.learn.project01.houserent;

import com.learn.project01.houserent.view.HouseView;
//引入 HouseView类 的包，才能调用其中的方法

public class HouseRentText {
    public static void main(String[] args) {

        //创建HouseView对象,并且显示主菜单，是整个程序的入口
        new HouseView().mainMenu();
        //只需要调用 HouseView类 中的显示主菜单(mainMenu方法) 即可实现所有的功能
    }
}
