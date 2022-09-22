package com.learn.exercise.extends01;

public class Computer {
    private String cpu; //cpu
    private String memory; //内存
    private String disk; //硬盘

    public Computer() { //无参构造器
    }

    public Computer(String cpu, String memory, String disk) {
        this.cpu = cpu;
        this.memory = memory;
        this.disk = disk;
    }

    //返回详细信息
    public String getDetails() {

        return "cpu:" + cpu + " 内存:" + memory + " 硬盘:" + disk;
    }


    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getDisk() {
        return disk;
    }

    public void setDisk(String disk) {
        this.disk = disk;
    }
}


