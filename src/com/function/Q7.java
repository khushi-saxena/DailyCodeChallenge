package com.function;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        System.out.println(num + " is prime: " + isPrime(num));
    }

    private static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i < (num - 1); i++) {
            if ((num % i) == 0) return false;
        }
        return true;
    }
}
