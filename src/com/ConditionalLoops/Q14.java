package com.ConditionalLoops;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter base radius of cone ");
        float radius =input.nextFloat();
        Scanner in =new Scanner(System.in);
        System.out.println("Enter height of cone ");
        float height = in.nextFloat();
        float Volume = (float) ((3.14*radius*radius*height)/3);
        System.out.println("Volume of cone is " +Volume);
    }
}
