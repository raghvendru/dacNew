package com.jagcoder;

import java.util.*;

public class Unit {
    public static void main(String[] args) {
        //int unit = 320;
        System.out.println("please enter unit");
        Scanner sc = new Scanner(System.in);
        int unit = sc.nextInt();
        int bill =0;
        if(unit<=100) {
            bill = unit*1;
        }
        else if(unit<=200) {
            bill = (100*1)+(unit-100)*2;
        }
        else if(unit<=300) {
            bill = (100*1)+(100*2)+(unit-200)*3;
        }else {
            bill = (100*1)+(100*2)+(100*3)+(unit-300)*4;
        }
        System.out.println("your bill is :"+bill);
    }
}
