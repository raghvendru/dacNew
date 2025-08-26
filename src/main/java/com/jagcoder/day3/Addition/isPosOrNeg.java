package com.jagcoder.day3.Addition;

import java.util.Scanner;

public class isPosOrNeg {
    public static void isPosOrNegOrZero(int n){
        if(n<0){
            System.out.println("Its NEGATIVE");
        }else if(n>0){
            System.out.println("Its POSITIVE");
        }else{
            System.out.println("its ZERO!!!!!!!");
        }
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        isPosOrNegOrZero(n);
    }
}
