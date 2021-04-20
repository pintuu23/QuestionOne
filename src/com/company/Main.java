package com.company;

import java.util.Scanner;

import static java.lang.Math.max;
public class Main {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the Starting Value  X  : ");
        int x = scanner.nextInt();

        System.out.println("Enter the Ending Value  Y  : ");
        int y = scanner.nextInt();

        System.out.println("Enter the value to divisible BY  Z  : ");
        int z = scanner.nextInt();

        QuestionOne questions = new QuestionOne();
        questions.findDivisibleBy18(x,y,z);
    }
}
