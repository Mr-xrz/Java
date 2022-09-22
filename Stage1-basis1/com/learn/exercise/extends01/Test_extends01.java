package com.learn.exercise.extends01;

public class Test_extends01 {
    public static void main(String[] args) {
        PC pc = new PC("i9-9700","16g","512g+1T","联想");
        pc.printInfo01();
        NotePad notePad = new NotePad("A15","8g","512g","粉色");
        notePad.printInfo02();
    }
}
