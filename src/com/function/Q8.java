package com.function;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you marks (out of 100)");
        int marks = sc.nextInt();
        System.out.println("your grade is " + grade(marks));
    }

    private static String grade(int marks) {
        String grade = null;
        if (marks <= 40) grade = "FAIL";
        else {
            if (marks > 41 && marks < 50) grade = "DD";
            else if (marks > 51 && marks < 60) grade = "CD";
            else if (marks > 61 && marks < 70) grade = "BC";
            else if (marks > 71 && marks < 80) grade = "BB";
            else if (marks > 81 && marks < 90) grade = "AB";
            else if (marks > 91) grade = "AA";
        }
        return grade;
    }
}
