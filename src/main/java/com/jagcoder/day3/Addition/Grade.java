package com.jagcoder.day3.Addition;

import java.awt.*;
import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double per = sc.nextDouble();
        if(per>=22 &&per<=30){
            System.out.println("GARDE F");
        }else if(per<=50 && per>30){
            System.out.println("GRADE D");
        }else if(per<=50 && per>30){
            System.out.println("GRADE C");
        }
        else {
            System.out.println("A");

        }
    }
}
