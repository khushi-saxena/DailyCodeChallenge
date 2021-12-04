package com.two;

import java.util.Scanner;

public class One {
    public static void main(String[] args) {
         int num;
        System.out.println("Enter the number ");
        Scanner input =new Scanner(System.in);
        num =input.nextInt();
        if(num %2 ==0)
            System.out.println("Number is even");
        else
            System.out.println("Number is odd");

    }
}
