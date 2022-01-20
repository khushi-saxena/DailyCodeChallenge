package com.function;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sum(a, b);
    }

    private static void sum(int a, int b) {
        System.out.println("Sum is " + (a + b));
    }
}
