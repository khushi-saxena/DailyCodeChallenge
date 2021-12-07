package com.ConditionalLoops;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of rectangle ");
        float length =input.nextFloat();

        Scanner in =new Scanner(System.in);

        System.out.println("Enter breadth of rectangle ");
        float breadth =in.nextFloat();
        System.out.println("Perimeter of rectangle is: "+ 2*(length+breadth));

    }
}
