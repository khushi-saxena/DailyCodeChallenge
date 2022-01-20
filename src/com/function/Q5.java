package com.function;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        product(a, b);
    }

    private static void product(int a, int b) {

        System.out.println("Sum is " + (a * b));
    }
}
