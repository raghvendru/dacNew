package com.jagcoder.day3.Addition;

import java.util.Scanner;

public class EvenOdd {
    public static void isEvenOrOdd(int num){
        if(num<=0) return;
        if(num%2 == 0){
            System.out.println(num +": is even");
        }else{
            System.out.println(num +": is odd");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a num");
        int n = sc.nextInt();
        isEvenOrOdd(n);
    }
}
