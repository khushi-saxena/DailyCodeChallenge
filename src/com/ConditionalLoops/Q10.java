package com.ConditionalLoops;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the base of Parallelogram: ");
        float base= in.nextFloat();
        System.out.println("enter the height of Parallelogram: ");
        float height= in.nextFloat();
        System.out.println("ans is: " +2*(base+height));
    }
}
