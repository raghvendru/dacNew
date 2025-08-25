package com.jagcoder;

import java.util.*;

public class Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter user name and password");

        String userName = sc.nextLine();
        String password = sc.nextLine();

//		String password = "admin123";

//		if(userName=="admin" && password =="adminwww") {
        if(userName.equals("admin") && password.equals("admin123")){
            System.out.println("Login is successfull");
        }else {
            System.out.println("Please enter valid credentials");
        }
    }


}
