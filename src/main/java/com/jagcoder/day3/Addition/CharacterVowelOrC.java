package com.jagcoder.day3.Addition;

import java.util.Scanner;

public class CharacterVowelOrC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c= sc.next().charAt(0);
        if((c>='a' && c<='z') ||((c>='A')&&(c<='Z')));
        char lower = Character.toLowerCase(c);
        if(lower=='a'||lower == 'e'||lower=='i'||lower =='o'||lower == 'u'){
            System.out.println("Its VOWEL");
        }
        //Character.isDigit(c)
        else if(c>='0' && c<='9'){
            System.out.println("Its DIGIT");
        }else {
            System.out.println("ITS SPECIAL");
        }
    }
}
