package com.ConditionalLoops;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the base of triangle ");
        float base = input.nextFloat();
        System.out.println("Enter the height of triangle ");
        float height = in.nextFloat();

        System.out.println("Area of triangle is "+ 0.5 * base * height);
    }
}
