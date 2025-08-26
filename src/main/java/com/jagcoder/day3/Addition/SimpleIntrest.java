package com.jagcoder.day3.Addition;

import java.util.Scanner;

public class SimpleIntrest {
    public static double si(int p,int r,int t){
        return  ((p*r*t)/100.0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int r= sc.nextInt();
        int t = sc.nextInt();
        double res = si(p,r,t);
        System.out.println(res);
    }
}
