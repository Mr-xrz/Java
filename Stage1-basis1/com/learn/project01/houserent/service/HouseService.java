package com.learn.project01.houserent.service;

import com.learn.project01.houserent.domain.House;

/**
 * HouseService.java<=>类 [业务层]
 * 定义House[] ,保存House对象
 * 1. 响应HouseView的调用
 * 2. 完成对房屋信息的各种操作 (增删改查 c[create] r[read] u[update] d[delete])
 */
public class HouseService {

    private House[] houses; //保存House对象
    private int houseNums = 1; //记录当前有多少个房屋信息
    private int idCounter = 1; //记录当前的id增长到哪个值

    //构造器
    public HouseService(int size) {
        //new houses
        houses = new House[size]; //当创建HouseService对象，指定数组大小
        //为了配合测试列表信息，这里初始化一个House对象
        houses[0] = new House(1, "jack", "112", "海淀区", 2000, "未出租");
    }

    //findById方法,返回House对象或者null
    public House findById(int findId) {
        //遍历数组
        for (int i = 0; i < houseNums; i++) {
            if (findId == houses[i].getId()) {
                return houses[i];
            }
        }
        return null;
    }

    //del方法，删除一个房屋信息
    public boolean del(int delId) {
        //应当先找到要删除的房屋信息对应的下标
        //！！！下标和房屋的编号不是一回事！！！
        int index = -1;
        for (int i = 0; i < houseNums; i++) {
            //判断输入的id 对应的数组中的下标 在数组里面有没有元素
            //比如：此时只有一个房屋信息，那么houseNums就为1，那么就只有下标为0的元素有房屋信息，其他都为null
            if (delId == houses[i].getId()) { //要删除的房屋(id),是数组下标为i的元素
                index = i; //就使用index记录i
            }
        }
        if (index == -1) { //说明要删除的房屋Id在数组中不存在
            return false; //直接退出方法，并返回false
        }
        //如果找到.
        for (int i = index; i < houseNums - 1; i++) { //删除后 相当于数组的最后一个有信息的元素就变为了null
            houses[i] = houses[i + 1]; //其他的元素依次向前移动
        }
        houses[houseNums - 1] = null;//把存在的房屋信息的最后一个 设置为null
        houseNums--; //房屋信息的个数减少一个
        return true;
    }

    //add方法，添加新对象,返回boolean
    public boolean add(House newHouse) {
        //判断是否还可以继续添加
        if (houseNums == houses.length) { // 房屋信息的个数 = 数组的大小 => 说明数组满了，不能再添加
            System.out.println("===房屋信息已满，无法添加===");
            return false;
        }
        //把newHouse对象加入到数组，新增加了一个房屋
        houses[houseNums++] = newHouse;
        //设计一个id自增长的机制, 然后更新newHouse的id
        newHouse.setId(++idCounter);
        return true;
    }

    //list方法，返回houses
    public House[] list() {
        return houses;
    }
}
