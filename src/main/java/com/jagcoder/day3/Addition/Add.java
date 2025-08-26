package com.jagcoder.day3.Addition;
import java.util.*;
public class Add {
    public static void op(int n1,int n2,char op){
        switch (op){
            case '+':
                System.out.println(n1+n2);
                break;
            case '-':
                System.out.println(n1-n2);
                break;
            case '*':
                System.out.println(n1*n2);
                break;
            case '/':
                System.out.println(n1/n2);
               break;
            default:
                System.out.println("Please enter valid operator");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n1");
        int n1 = sc.nextInt();
        System.out.println("Enter n2");
        int n2 = sc.nextInt();
        System.out.println("Enter operator");
        char ch = sc.next().charAt(0);
        op(n1,n2,ch);

    }
}
