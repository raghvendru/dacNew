package com.jagcoder.day3.Addition;

import java.util.Scanner;

public class StudentPassOrFail {
    public static void passOrFail(int marks){
        if(marks>=50){
            System.out.println("Congarts!!! you passed");
        }else{
            System.out.println("sorry!better luck next time");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter marks");
        int marks = sc.nextInt();
        passOrFail(marks);
    }
}
