package com.ConditionalLoops;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the Length of rectangle ");
        float length = input.nextFloat();
        System.out.println("Enter the Breadth of rectangle ");
        float breadth = in.nextFloat();

        System.out.println("Area of Rectangle is "+ length * breadth);
    }
}
