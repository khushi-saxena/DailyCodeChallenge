package com.two;

import java.util.Scanner;

public class Q6 {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value in INR : ");
        double inr = in.nextInt();
        double usd = inr * 0.013;
        System.out.println("The value in USD : "+usd);
        in.close();
    }
}
