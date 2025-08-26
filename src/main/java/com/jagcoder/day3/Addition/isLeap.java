package com.jagcoder.day3.Addition;

import java.util.Scanner;

public class isLeap {
    public static void isLeap(int n){
        if(((n%4) == 0 && n!=100) || (n%400==0) ){
            System.out.println("its a leap year");
        }else{
            System.out.println("its not a leap year");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        isLeap(n);
    }
}
