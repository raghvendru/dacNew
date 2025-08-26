package com.jagcoder.day3.Addition;

import java.util.Scanner;

public class LargestOf3No {
    public static int largest(int n1,int n2,int n3){
        return Math.max(Math.max(n1,n2),n3);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 3 numbers");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int largest = largest(n1,n2,n3);
        System.out.println("largest num is : "+largest);
    }
}
