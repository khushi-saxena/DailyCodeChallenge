package com.function;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        maximumfun(a, b, c);
        minimumfun(a, b, c);
    }

    private static void minimumfun(int a, int b, int c) {
        if (a < b && a < c) System.out.println("Minimum is "+a);
        else if (b < c && b < a) System.out.println("Minimum is "+b);
        else if (c < b && c < a) System.out.println("Minimum is "+c);
    }

    private static void maximumfun(int a, int b, int c) {
        if (a > b && a > c) System.out.println("Maximum is "+a);
        else if (b > c && b > a) System.out.println("Maximum is "+b);
        else if (c > b && c > a) System.out.println("Maximum is "+c);
    }
    }

