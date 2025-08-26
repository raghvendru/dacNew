package com.jagcoder.day3.Addition;

public class Ternary {
    public static int greater(int n1,int n2){
        return (n1>n2) ? n1 :n2;
    }

    public static void main(String[] args) {
        int n1 = 22,n2=25;
       int g =  greater(n1,n2);
        System.out.println("graeter num is : "+g);
    }
}
