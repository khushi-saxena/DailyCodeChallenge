package com.two;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args)
    {
        int num1, num2;
        Scanner sc = new Scanner( System.in );

        System.out.print(" Please Enter the First Number : ");
        num1 = sc.nextInt();

        System.out.print(" Please Enter the Second Number : ");
        num2 = sc.nextInt();

        if(num1 > num2)
        {
            System.out.println("\n The Larger Number = " + num1);
        }
        else if (num2 > num1)
        {
            System.out.println("\n The Larger Number = " + num2);
        }
        else
        {
            System.out.println("\n Both are Equal");
        }

    }
}
