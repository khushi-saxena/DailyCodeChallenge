package com.function;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        System.out.println(a + " is even :" + isEven(a) );
    }
    private static boolean isEven(int a){
        return (a % 2) ==0;
    }
}
